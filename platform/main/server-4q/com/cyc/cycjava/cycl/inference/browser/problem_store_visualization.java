package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cache;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_services;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class problem_store_visualization extends SubLTranslatedFile {
    public static final SubLFile me = new problem_store_visualization();

    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.problem_store_visualization";

    public static final String myFingerPrint = "0a617894a23d15193e00d0b10e2543ea389d47e3c91c16edad89a32464f2f035";

    // defconstant
    public static final SubLSymbol $dtp_problem_layout$ = makeSymbol("*DTP-PROBLEM-LAYOUT*");



    // defparameter
    private static final SubLSymbol $html_problem_layout_visualization_script_template$ = makeSymbol("*HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPT-TEMPLATE*");



    // defparameter
    private static final SubLSymbol $cb_problem_store_default_zoom_levels$ = makeSymbol("*CB-PROBLEM-STORE-DEFAULT-ZOOM-LEVELS*");

    // deflexical
    private static final SubLSymbol $last_store$ = makeSymbol("*LAST-STORE*");

    // deflexical
    private static final SubLSymbol $last_problem_end$ = makeSymbol("*LAST-PROBLEM-END*");

    // deflexical
    private static final SubLSymbol $current_vpfm_call_count$ = makeSymbol("*CURRENT-VPFM-CALL-COUNT*");



    // deflexical
    private static final SubLSymbol $inference_monitor_grid_width$ = makeSymbol("*INFERENCE-MONITOR-GRID-WIDTH*");

    // deflexical
    private static final SubLSymbol $inference_monitor_grid_height$ = makeSymbol("*INFERENCE-MONITOR-GRID-HEIGHT*");

    // deflexical
    private static final SubLSymbol $inference_monitor_max_cell_size$ = makeSymbol("*INFERENCE-MONITOR-MAX-CELL-SIZE*");







    // Internal Constants
    public static final SubLSymbol PROBLEM_LAYOUT = makeSymbol("PROBLEM-LAYOUT");

    public static final SubLSymbol PROBLEM_LAYOUT_P = makeSymbol("PROBLEM-LAYOUT-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("PROBLEM-STORE"), makeSymbol("MIN-X"), makeSymbol("MAX-X"), makeSymbol("MIN-Y"), makeSymbol("MAX-Y"), makeSymbol("GRID"), makeSymbol("NEXT-PROBLEM-ID"), makeSymbol("PROBLEM-X-TABLE"), makeSymbol("PROBLEM-Y-TABLE") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("PROBLEM-STORE"), makeKeyword("MIN-X"), makeKeyword("MAX-X"), makeKeyword("MIN-Y"), makeKeyword("MAX-Y"), makeKeyword("GRID"), makeKeyword("NEXT-PROBLEM-ID"), makeKeyword("PROBLEM-X-TABLE"), makeKeyword("PROBLEM-Y-TABLE") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("PROB-LAYOUT-PROBLEM-STORE"), makeSymbol("PROB-LAYOUT-MIN-X"), makeSymbol("PROB-LAYOUT-MAX-X"), makeSymbol("PROB-LAYOUT-MIN-Y"), makeSymbol("PROB-LAYOUT-MAX-Y"), makeSymbol("PROB-LAYOUT-GRID"), makeSymbol("PROB-LAYOUT-NEXT-PROBLEM-ID"), makeSymbol("PROB-LAYOUT-PROBLEM-X-TABLE"), makeSymbol("PROB-LAYOUT-PROBLEM-Y-TABLE") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-STORE"), makeSymbol("_CSETF-PROB-LAYOUT-MIN-X"), makeSymbol("_CSETF-PROB-LAYOUT-MAX-X"), makeSymbol("_CSETF-PROB-LAYOUT-MIN-Y"), makeSymbol("_CSETF-PROB-LAYOUT-MAX-Y"), makeSymbol("_CSETF-PROB-LAYOUT-GRID"), makeSymbol("_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID"), makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE"), makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE") });



    public static final SubLSymbol PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-LAYOUT-P"));

    private static final SubLSymbol PROB_LAYOUT_PROBLEM_STORE = makeSymbol("PROB-LAYOUT-PROBLEM-STORE");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_PROBLEM_STORE = makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-STORE");

    private static final SubLSymbol PROB_LAYOUT_MIN_X = makeSymbol("PROB-LAYOUT-MIN-X");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_MIN_X = makeSymbol("_CSETF-PROB-LAYOUT-MIN-X");

    private static final SubLSymbol PROB_LAYOUT_MAX_X = makeSymbol("PROB-LAYOUT-MAX-X");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_MAX_X = makeSymbol("_CSETF-PROB-LAYOUT-MAX-X");

    private static final SubLSymbol PROB_LAYOUT_MIN_Y = makeSymbol("PROB-LAYOUT-MIN-Y");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_MIN_Y = makeSymbol("_CSETF-PROB-LAYOUT-MIN-Y");

    private static final SubLSymbol PROB_LAYOUT_MAX_Y = makeSymbol("PROB-LAYOUT-MAX-Y");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_MAX_Y = makeSymbol("_CSETF-PROB-LAYOUT-MAX-Y");

    private static final SubLSymbol PROB_LAYOUT_GRID = makeSymbol("PROB-LAYOUT-GRID");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_GRID = makeSymbol("_CSETF-PROB-LAYOUT-GRID");

    private static final SubLSymbol PROB_LAYOUT_NEXT_PROBLEM_ID = makeSymbol("PROB-LAYOUT-NEXT-PROBLEM-ID");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID = makeSymbol("_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID");

    private static final SubLSymbol PROB_LAYOUT_PROBLEM_X_TABLE = makeSymbol("PROB-LAYOUT-PROBLEM-X-TABLE");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_PROBLEM_X_TABLE = makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE");

    private static final SubLSymbol PROB_LAYOUT_PROBLEM_Y_TABLE = makeSymbol("PROB-LAYOUT-PROBLEM-Y-TABLE");

    private static final SubLSymbol _CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE = makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE");













    private static final SubLSymbol $NEXT_PROBLEM_ID = makeKeyword("NEXT-PROBLEM-ID");

    private static final SubLSymbol $PROBLEM_X_TABLE = makeKeyword("PROBLEM-X-TABLE");

    private static final SubLSymbol $PROBLEM_Y_TABLE = makeKeyword("PROBLEM-Y-TABLE");

    private static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PROBLEM_LAYOUT = makeSymbol("MAKE-PROBLEM-LAYOUT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD");







    private static final SubLString $str45$unable_to_add_to_layout__S = makeString("unable to add to layout ~S");

    public static final SubLList $list46 = list(FIVE_INTEGER, SIX_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, THREE_INTEGER, ZERO_INTEGER, TWO_INTEGER, ONE_INTEGER);

    private static final SubLSymbol $octant_locations$ = makeSymbol("*OCTANT-LOCATIONS*");

    private static final SubLInteger $int$316 = makeInteger(316);

    private static final SubLSymbol $sym49$OCTANT_LOCATION__ = makeSymbol("OCTANT-LOCATION-<");



    private static final SubLList $list51 = list(makeSymbol("X-1"), makeSymbol("Y-1"));

    private static final SubLList $list52 = list(makeSymbol("X-2"), makeSymbol("Y-2"));

    private static final SubLSymbol $sym53$_ = makeSymbol("<");



    private static final SubLSymbol PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");





    private static final SubLString $str58$ps_ = makeString("ps-");

    private static final SubLString $str59$_ = makeString("-");

    private static final SubLString $$$problemGrid = makeString("problemGrid");







    private static final SubLString $str64$_ = makeString("*");

    private static final SubLList $list65 = list(makeSymbol("SLIDER-ID"), makeSymbol("SLIDER-FIELD-ID"));





    private static final SubLString $str68$_ = makeString("[");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str70$_ = makeString(",");

    private static final SubLString $str71$_ = makeString("]");

    private static final SubLString $str72$_script_type__text_javascript____ = makeString("<script type=\'text/javascript\'>\n  var Cyc = {problemStore : \n              {~A : \n               { parentData: ~A,\n                 lastNodeId: ~A,\n                 papers: {}\n\t       }\n\t      }\n\t     };\n</script>");

    private static final SubLString $str73$_style_type__text_css_______A_tab = makeString("<style type=\"text/css\">\n  #~A table { display:inline-table }\n  #~A       { padding-left: 5px }\n  #~A table { display:inline-table }\n</style>");

    private static final SubLString $str74$height_1_5em = makeString("height:1.5em");

    private static final SubLString $$$ps = makeString("ps");

    private static final SubLString $str76$_slider = makeString("-slider");

    private static final SubLString $str77$_slider_field = makeString("-slider-field");

    private static final SubLString $str78$_script_type__text_javascript____ = makeString("<script type=\'text/javascript\'>\n    Ext.require(\'Ext.slider.*\');\n\nExt.onReady(function(){\n    var maxProblemId = ~S;\n    var schemes = ~A;\n    var ps = ~A\n    var paper = {};\n    var underlayIdSuffix = \'-u\';\n    var slider = Ext.create(\'Ext.slider.Single\', {\n        renderTo: \'~A\',\n        useTips: false,\n        hideLabel: false,\n        fieldLabel: \'Last Visible Problem:\',\n        labelWidth: 130,\n        width: 314,\n        value:maxProblemId,\n        increment: 1,\n        minValue: 0,\n        maxValue: maxProblemId,\n        plugins: new Ext.slider.Tip({getText: function(thumb){\n          return Ext.String.format(\'{0} of {1}\' , thumb.value, maxProblemId);\n          }\n        }),\n        userTips: true,\n\tlisteners:{\n\t    change:function(slider, newValue, thumb){\n\t\tsetProblemsVisible(ps, newValue, maxProblemId, schemes);\n                updatePath(ps, newValue, schemes);\n\t    }\n\t}\n    });\n    var typein = Ext.create(\'Ext.form.field.Number\', {\n        renderTo: \'~A\',\n        scope:this,\n        width: 60,\n        value: maxProblemId,\n        minValue: 0,\n        maxValue: maxProblemId,\n        listeners:{\n          change:function() {\n            slider.setValue(this.getValue());\n          }\n        }\n    });\n\n    function setProblemsVisible(ps, maxVisibleId, maxProblemStoreId, schemes) {\n     var elt;\n     for (var i = 0; i <  schemes.length; i++) {\n       var scheme = schemes[i];\n       var id;\n       for (var num = 0; num <= maxVisibleId; num++) {\n         var elt = Ext.fly(getUnderlayCellId(ps, num, scheme));\n         if (elt) {\n           elt.removeCls(\'hideme\');\n         }\n       }\n       for (var num = maxVisibleId + 1; num <= maxProblemStoreId; num++) {\n         Ext.fly(getUnderlayCellId(ps, num, scheme)).addCls(\'hideme\');\n       }\n     }\n    }\n\n\n    slider.on({\n      change:{fn: function(obj, value)\n       {\n        typein.setValue(value);\n        }\n      }\n    });\n\n   \n   function showPath(ps, finalNodeNum, schemes) {\n     overlayTable = Ext.get(\'problemStoreVisualizations\'); \n     underlayDiv = overlayTable.parent().createChild(\'<div style=\"position:relative; \" id=\"visualizationUnderlay\"></div>\');\n     underlayDiv.setXY(overlayTable.getXY());\n     underlayDiv.setHeight(overlayTable.getHeight());\n     for (var i = 0; i < schemes.length; i++) {\n       var table = Ext.get(getTableId(ps, schemes[i]));\n       var xy = table.getXY();\n       var paperHeight = table.getBottom() - xy[1]; \n       var paperWidth = table.getRight() - xy[0];\n       var clone = table.dom.cloneNode(true);\n       updateIds(clone, underlayIdSuffix);\n       underlayDiv.appendChild(clone);\n       var underlayTable = Ext.get(getTableId(ps, schemes[i]) + underlayIdSuffix);\n       underlayTable.setXY(xy).setWidth(table.getWidth());\n       removeClassFromDescendents(\'path\', underlayTable.dom);\n       //now that the underlay is ready, make it visible.\n       overlayTable.addCls(\'transparent\');\n       Cyc.problemStore[ps].papers[schemes[i]] = Raphael(xy[0], xy[1], paperWidth, paperHeight);\n     }\n     updatePath(ps, finalNodeNum, schemes);\n   }\n\n   function updatePath(ps, finalNodeNum, schemes) {\n     for (var i = 0; i < schemes.length; i++) {\n       var canvas = Cyc.problemStore[ps].papers[schemes[i]];\n       if (canvas) {\n         canvas.clear();\n       }\n       var path = getPathFromRootToNode(ps, finalNodeNum);\n       var tableId = getTableId(ps, schemes[i]);\n       var table = Ext.get(\'ps-\' + ps + \'-\' + schemes[i]);\n       var nextStr = \'M\';\n       var lineCmd = \'\';\n       var circleLocations = [];\n       for (var j = 0; j < path.length; j++) {\n         lineCmd = lineCmd + nextStr;\n         nextStr = \'L\';\n         var eltId = getUnderlayCellId(ps, path[j], schemes[i]);\n         var eltLoc = relativeEltMiddle(eltId, tableId);\n         circleLocations.push(eltLoc);\n         var lineCmd = lineCmd + eltLoc[0] + \' \' + eltLoc[1];\n       }\n       var outline =  canvas.path(lineCmd);\n       outline.attr({\'stroke\' : \'#fff\', \'stroke-width\': 4});\n       var line =  canvas.path(lineCmd);\n       line.attr({\'stroke\': \'#000\', \'stroke-width\': 2});\n       circleLocations.forEach(function(xy) {\n          var c = canvas.circle(xy[0],xy[1],4);\n          c.attr(\'fill\', \'white\');\n          var c = canvas.circle(xy[0],xy[1],2);\n          c.attr(\'fill\', \'black\');\n       });\n     }\n   }\n\n  function removeClassFromDescendents(className, rootElt) {\n     Ext.query(\'.\' + className, rootElt).forEach(function(elt) { Ext.fly(elt).removeCls(className); });\n  }\n\n  function updateIds(parent, newSuffix) {\n    Ext.query(\'*\', parent).concat(parent).forEach(function (elt) { if (elt.id) {elt.id = elt.id + newSuffix;};});\n  }\n\n\n  function getPathFromRootToNode(ps, finalNodeNum) {\n    var nodeNum = finalNodeNum;\n    var path = [];\n    var data = Cyc.problemStore[ps].parentData;\n    while (nodeNum || nodeNum == 0) {\n      path.unshift(nodeNum);\n      nodeNum = data[nodeNum];\n    }\n    return path;\n  }\n\n  function relativeEltMiddle(eltId, parentId) {\n    var parentXY = Ext.fly(parentId).getXY();\n    var elt = Ext.fly(eltId);\n    var eltXY = elt.getXY();\n    var right = elt.getRight();\n    var bottom = elt.getBottom();\n    var xMiddle = eltXY[0] - parentXY[0] + ((right - eltXY[0]) / 2);\n    var yMiddle = eltXY[1] - parentXY[1] + ((bottom - eltXY[1]) / 2)\n    return [xMiddle, yMiddle]; \n  }\n\n   function getTableId(ps, scheme) {\n       return \'ps-\' + ps + \'-\' + scheme;\n   }\n\n   function getCellId(ps, num, scheme) {\n     return \'p-\' + ps + \'-\' + num + \'-\' + scheme;\n   }\n\n   function getUnderlayCellId(ps, num, scheme) {\n     return getCellId(ps, num, scheme) + underlayIdSuffix;\n   }\n\n  showPath(ps, maxProblemId, schemes);\n\n  setProblemsVisible(ps, maxProblemId, maxProblemId, schemes);\n\n  Ext.create(\'Ext.tip.ToolTip\', {\n    target: Ext.get(\'problemStoreVisualizations\'),\n    delegate : \'.problem\',\n    renderTo : Ext.getBody(),\n    trackMouse: true,\n    listeners: {\n     beforeShow: function updateTipBody(tip) {\n       var tipStr = \'\';\n       /p-[0-9]+-([0-9]+)-.*/.exec(tip.triggerElement.id);\n       if (RegExp.$1) {\n         tipStr = tipStr + \'Problem&nbsp;\' + RegExp.$1 + \': \';\n       }\n       tip.update(tipStr + tip.triggerElement.className.replace(\'focus\',\'\').replace(\'problem\',\'\').replace(\'path\', \'\').replace(\' \',\'\'));\n     }\n    }\n  });\n\n});\n</script>");

    private static final SubLString $str79$__ = makeString("['");



    private static final SubLString $str81$___ = makeString("','");

    private static final SubLString $str82$__ = makeString("']");

    private static final SubLString $str83$p_ = makeString("p-");

    private static final SubLSymbol HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE = makeSymbol("HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE");

    private static final SubLString $$$solid_gray_ = makeString("solid gray ");

    private static final SubLString $$$px = makeString("px");

    private static final SubLString $str87$_style_type__text_css_______probl = makeString("<style type=\"text/css\">\n   #problemStoreVisualizations {z-index: 10; position:relative; }\n   #problemStoreVisualizations.transparent {opacity: 0}\n  .problemGrid { margin: 10px; border-spacing: ");

    private static final SubLString $str88$px__background___000000_______pro = makeString("px; background: #000000; }\n  .problemGrid td { width: ");

    private static final SubLString $str89$px__height__ = makeString("px; height: ");

    private static final SubLString $str90$px__border__ = makeString("px; border: ");

    private static final SubLString $str91$__font_family__courier__fixed__wh = makeString("; font-family: courier, fixed; white-space: nowrap; font-size: 12px; box-sizing: context-box; -moz-box-sizing: content-box; -webkit-box-sizing: content-box}\n  .problemGrid a  { text-decoration: none; }\n  .none    { background-color: #000000; }\n  .problem { background-color: #3F3F3F; }\n  .invalid { background-color: #3F3F3F; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    a:link    { color: #FFFFFF; }\n  .problem.root    a:visited { color: #FFFFFF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    a:link    { color: #FFFFFF; }\n  .problem.path.root    a:visited { color: #FFFFFF; }\n  .problem.path.focus        { background-color: #0000FF; }\n  .future         { background-color: #3F3F3F; }\n  .path.focus   a:link    { color: #FFFFFF; }\n  .path.focus   a:visited { color: #FFFFFF; }\n  .problem.path   { background-color: #3FFFFF; }\n  .good           { background-color: #3FFF3F; }\n  .neutral        { background-color: #FFFF3F; }  \n  .no-good        { background-color: #FF3F3F; }\n  .problemGrid tr td { width: ");

    private static final SubLString $str92$px__font_family__courier__fixed__ = makeString("px; font-family: courier, fixed; white-space: nowrap;}\n  a { text-decoration: none; }\n  td.hideme              { background-color: #000000; }\n  \n  .new-root              { background-color: #FFFFFF; }\n  .transformation        { background-color: #3F3FFF; }\n  .removal               { background-color: #3FFF3F; }\n  .unmotivated           { background-color: #3F3F00; }\n</style>");

    private static final SubLSymbol $html_problem_layout_visualization_table_style_caching_state$ = makeSymbol("*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*");

    private static final SubLString $str94$_style_type__text_css_____body_x_ = makeString("<style type=\"text/css\">\n  body.x-body {font-size: initial; font-family: initial; }\n  body strong {font-style: initial; font-weight: bold; }\n  </style>");



    private static final SubLString $str96$unexpected_visualization_scheme__ = makeString("unexpected visualization scheme: ~S");

    private static final SubLString $$$problem_none = makeString("problem none");

    private static final SubLString $$$problem_invalid = makeString("problem invalid");

    private static final SubLString $$$problem_future = makeString("problem future");

    private static final SubLString $$$problem_root = makeString("problem root");



    private static final SubLString $$$problem_good = makeString("problem good");

    private static final SubLString $$$problem_neutral = makeString("problem neutral");

    private static final SubLString $str104$problem_no_good = makeString("problem no-good");

    private static final SubLString $$$_path = makeString(" path");

    private static final SubLString $$$_focus = makeString(" focus");

    private static final SubLString $str107$problem_new_root = makeString("problem new-root");

    private static final SubLString $$$problem_transformation = makeString("problem transformation");

    private static final SubLString $$$problem_removal = makeString("problem removal");

    private static final SubLString $$$problem_unmotivated = makeString("problem unmotivated");

    private static final SubLString $str111$_Visualize_ = makeString("[Visualize]");



    private static final SubLString $str113$cb_visualize_problems__A__A__A__A = makeString("cb-visualize-problems&~A&~A&~A&~A");



    private static final SubLSymbol CB_LINK_VISUALIZE_PROBLEMS = makeSymbol("CB-LINK-VISUALIZE-PROBLEMS");

    private static final SubLList $list116 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("REFRESH-STRING"), makeSymbol("SIZE-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("PROBLEM-END-STRING"));

    private static final SubLString $str117$_A_did_not_specify_a_problem_stor = makeString("~A did not specify a problem store");

    private static final SubLSymbol CB_VISUALIZE_PROBLEMS = makeSymbol("CB-VISUALIZE-PROBLEMS");



    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLInteger $int$50000 = makeInteger(50000);

    private static final SubLInteger $int$24000 = makeInteger(24000);

    private static final SubLInteger $int$12000 = makeInteger(12000);

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLInteger $int$2000 = makeInteger(2000);



    private static final SubLInteger $int$500 = makeInteger(500);



    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLList $list130 = list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, TEN_INTEGER, SIXTEEN_INTEGER, TWENTY_INTEGER, makeInteger(32), makeInteger(40), makeInteger(64), makeInteger(100) });

    private static final SubLString $str131$ = makeString("");

    private static final SubLList $list132 = list(makeKeyword("GOODNESS"), makeKeyword("STRATEGY"));

    private static final SubLString $str133$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str134$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $$$Problem_Store_ = makeString("Problem Store ");

    private static final SubLString $$$_Visualization = makeString(" Visualization");

    private static final SubLString $$$visControls = makeString("visControls");

    private static final SubLString $str140$_Most_Recent_ = makeString("[Most Recent]");

    private static final SubLString $str141$Refresh___ = makeString("Refresh : ");

    private static final SubLString $str142$_Now_ = makeString("[Now]");

    private static final SubLString $str143$_Auto_ = makeString("[Auto]");

    private static final SubLString $str144$_Halt_ = makeString("[Halt]");

    private static final SubLString $str145$Zoom__ = makeString("Zoom :");

    private static final SubLString $str146$Sequence__ = makeString("Sequence :");

    private static final SubLString $$$Begin = makeString("Begin");

    private static final SubLString $str148$_1000 = makeString("-1000");



    private static final SubLString $str150$_100 = makeString("-100");

    private static final SubLString $str151$_10 = makeString("-10");

    private static final SubLString $str152$_1 = makeString("-1");

    private static final SubLString $str153$_1 = makeString("+1");

    private static final SubLString $str154$_10 = makeString("+10");

    private static final SubLString $str155$_100 = makeString("+100");

    private static final SubLString $str156$_1000 = makeString("+1000");

    private static final SubLString $$$End = makeString("End");



    private static final SubLString $str159$Percent__ = makeString("Percent :");

    private static final SubLString $$$problemStoreVisualizations = makeString("problemStoreVisualizations");

    private static final SubLString $str161$_D_concurrent_CB_VISUALIZE_PROBLE = makeString("~D concurrent CB-VISUALIZE-PROBLEMS-FOR-MONITOR calls!");



    private static final SubLList $list163 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("PROBLEM-END-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("MODE-STRING"));

    private static final SubLString $str164$Error_for_args__S_____S = makeString("Error for args ~S:~% ~S");

    private static final SubLSymbol CB_VISUALIZE_PROBLEMS_FOR_MONITOR = makeSymbol("CB-VISUALIZE-PROBLEMS-FOR-MONITOR");



    private static final SubLString $str167$_A__A_did_not_specify_a_problem_s = makeString("~A ~A did not specify a problem store");

    private static final SubLString $str168$overflow_hidden_ = makeString("overflow:hidden;");

    private static final SubLString $str169$Visualizing_new_problem_store__S = makeString("Visualizing new problem store ~S");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $str171$Jumped_problem_end_from__A_to__A_ = makeString("Jumped problem end from ~A to ~A.");

    private static final SubLList $list172 = list(makeKeyword("GOODNESS"));

    private static final SubLSymbol NOTIFY_VISUALIZING_PROBLEM_STORE = makeSymbol("NOTIFY-VISUALIZING-PROBLEM-STORE");

    private static final SubLString $str174$__Visualizing_problem_store__ = makeString("~&Visualizing problem store~%");

    private static final SubLSymbol $notify_visualizing_problem_store_caching_state$ = makeSymbol("*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*");

    private static final SubLSymbol COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR = makeSymbol("COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR");

    private static final SubLString $str177$Given_layout_of__Dx_D__optimum_ce = makeString("Given layout of ~Dx~D, optimum cell size is ~Dx~D");

    private static final SubLSymbol $compute_grid_size_for_inference_monitor_caching_state$ = makeSymbol("*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*");

    private static final SubLSymbol HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE = makeSymbol("HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE");

    private static final SubLFloat $float$1_5 = makeDouble(1.5);

    private static final SubLString $str181$_style_type__text_css______proble = makeString("<style type=\"text/css\">\n  #problemGrid { border-collapse: collapse }\n  table.problemGrid { border-spacing: 0; margin-left: ");

    private static final SubLString $str182$px__margin_top__ = makeString("px; margin-top: ");

    private static final SubLString $str183$px__opacity___75_____table_proble = makeString("px; opacity: .75 }\n  table.problemGrid tr td { width : ");

    private static final SubLString $str184$px__height___ = makeString("px; height : ");

    private static final SubLString $str185$______td_none______border_color__ = makeString("; }\n  td.none    { border-color: transparent; }\n  td.future  { border-color: transparent; }\n  td.invalid { background-color: #3F3F3F; }\n  .problemGrid td.root    { background-color: #FF00FF; }\n  td.root    a:link    { color: #FFFFFF; }\n  td.root    a:visited { color: #FFFFFF; }\n  .problemGrid td.focus   { background-color: #0000FF; }\n  td.focus   a:link    { color: #FFFFFF; }\n  td.focus   a:visited { color: #FFFFFF; }\n  td.path    { background-color: #3FFFFF; }\n  .good    { background-color: #3FFF3F; }\n  .neutral { background-color: #FFFF3F; }\n  .no-good { background-color: #FF3F3F; }\n</style>");

    private static final SubLString $str186$Layout__Dx_D_____A = makeString("Layout ~Dx~D:~% ~A");

    private static final SubLSymbol $html_problem_layout_visualization_for_monitor_table_style_caching_state$ = makeSymbol("*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*");

    private static final SubLSymbol $cb_problem_store_layout_table$ = makeSymbol("*CB-PROBLEM-STORE-LAYOUT-TABLE*");



    public static SubLObject problem_layout_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject problem_layout_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$problem_layout_native.class ? T : NIL;
    }

    public static SubLObject prob_layout_problem_store(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject prob_layout_min_x(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject prob_layout_max_x(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject prob_layout_min_y(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject prob_layout_max_y(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject prob_layout_grid(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject prob_layout_next_problem_id(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject prob_layout_problem_x_table(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject prob_layout_problem_y_table(final SubLObject v_object) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_prob_layout_problem_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_prob_layout_min_x(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_prob_layout_max_x(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_prob_layout_min_y(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_prob_layout_max_y(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_prob_layout_grid(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_prob_layout_next_problem_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_prob_layout_problem_x_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_prob_layout_problem_y_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_layout_p(v_object) : "problem_store_visualization.problem_layout_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_problem_layout(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $problem_layout_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROBLEM_STORE)) {
                _csetf_prob_layout_problem_store(v_new, current_value);
            } else
                if (pcase_var.eql($MIN_X)) {
                    _csetf_prob_layout_min_x(v_new, current_value);
                } else
                    if (pcase_var.eql($MAX_X)) {
                        _csetf_prob_layout_max_x(v_new, current_value);
                    } else
                        if (pcase_var.eql($MIN_Y)) {
                            _csetf_prob_layout_min_y(v_new, current_value);
                        } else
                            if (pcase_var.eql($MAX_Y)) {
                                _csetf_prob_layout_max_y(v_new, current_value);
                            } else
                                if (pcase_var.eql($GRID)) {
                                    _csetf_prob_layout_grid(v_new, current_value);
                                } else
                                    if (pcase_var.eql($NEXT_PROBLEM_ID)) {
                                        _csetf_prob_layout_next_problem_id(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROBLEM_X_TABLE)) {
                                            _csetf_prob_layout_problem_x_table(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROBLEM_Y_TABLE)) {
                                                _csetf_prob_layout_problem_y_table(v_new, current_value);
                                            } else {
                                                Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_problem_layout(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROBLEM_LAYOUT, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_STORE, prob_layout_problem_store(obj));
        funcall(visitor_fn, obj, $SLOT, $MIN_X, prob_layout_min_x(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_X, prob_layout_max_x(obj));
        funcall(visitor_fn, obj, $SLOT, $MIN_Y, prob_layout_min_y(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_Y, prob_layout_max_y(obj));
        funcall(visitor_fn, obj, $SLOT, $GRID, prob_layout_grid(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT_PROBLEM_ID, prob_layout_next_problem_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_X_TABLE, prob_layout_problem_x_table(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_Y_TABLE, prob_layout_problem_y_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROBLEM_LAYOUT, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_problem_layout_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem_layout(obj, visitor_fn);
    }

    public static SubLObject new_problem_layout(final SubLObject problem_store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) " + problem_store;
        final SubLObject layout = make_problem_layout(UNPROVIDED);
        _csetf_prob_layout_problem_store(layout, problem_store);
        _csetf_prob_layout_min_x(layout, ZERO_INTEGER);
        _csetf_prob_layout_max_x(layout, ZERO_INTEGER);
        _csetf_prob_layout_min_y(layout, ZERO_INTEGER);
        _csetf_prob_layout_max_y(layout, ZERO_INTEGER);
        _csetf_prob_layout_grid(layout, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_prob_layout_next_problem_id(layout, ZERO_INTEGER);
        _csetf_prob_layout_problem_x_table(layout, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_prob_layout_problem_y_table(layout, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return layout;
    }

    public static SubLObject destroy_problem_layout(final SubLObject layout) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        _csetf_prob_layout_problem_store(layout, $FREE);
        dictionary.clear_dictionary(prob_layout_grid(layout));
        _csetf_prob_layout_grid(layout, NIL);
        dictionary.clear_dictionary(prob_layout_problem_x_table(layout));
        _csetf_prob_layout_problem_x_table(layout, NIL);
        dictionary.clear_dictionary(prob_layout_problem_y_table(layout));
        _csetf_prob_layout_problem_y_table(layout, NIL);
        return layout;
    }

    public static SubLObject problem_layout_store(final SubLObject layout) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        return prob_layout_problem_store(layout);
    }

    public static SubLObject problem_layout_next_problem_id(final SubLObject layout) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        return prob_layout_next_problem_id(layout);
    }

    public static SubLObject problem_layout_problem_store(final SubLObject layout) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        return prob_layout_problem_store(layout);
    }

    public static SubLObject problem_layout_x_lookup(final SubLObject layout, final SubLObject problem) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return dictionary.dictionary_lookup(prob_layout_problem_x_table(layout), problem, UNPROVIDED);
    }

    public static SubLObject problem_layout_y_lookup(final SubLObject layout, final SubLObject problem) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return dictionary.dictionary_lookup(prob_layout_problem_y_table(layout), problem, UNPROVIDED);
    }

    public static SubLObject problem_layout_grid_lookup(final SubLObject layout, final SubLObject x, final SubLObject y) {
        final SubLObject grid_x_layer = prob_layout_grid(layout);
        if (NIL != grid_x_layer) {
            final SubLObject grid_y_layer = dictionary.dictionary_lookup_without_values(grid_x_layer, x, UNPROVIDED);
            if (NIL != grid_y_layer) {
                final SubLObject problem = dictionary.dictionary_lookup_without_values(grid_y_layer, y, UNPROVIDED);
                return problem;
            }
        }
        return NIL;
    }

    public static SubLObject update_problem_layout(final SubLObject layout) {
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        final SubLObject store = problem_layout_problem_store(layout);
        final SubLObject start_id = problem_layout_next_problem_id(layout);
        SubLObject end_var;
        SubLObject end_id;
        SubLObject id;
        SubLObject problem;
        for (end_id = end_var = inference_datastructures_problem_store.problem_store_historical_problem_count(store), id = NIL, id = start_id; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            problem = inference_datastructures_problem_store.find_problem_by_id(store, id);
            if (NIL != inference_datastructures_problem.problem_p(problem)) {
                problem_layout_add(layout, problem);
            }
        }
        _csetf_prob_layout_next_problem_id(layout, end_id);
        return layout;
    }

    public static SubLObject problem_layout_add(final SubLObject layout, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != problem_layout_p(layout) : "problem_store_visualization.problem_layout_p(layout) " + "CommonSymbols.NIL != problem_store_visualization.problem_layout_p(layout) " + layout;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        final SubLObject parent_problem = earliest_dependent_problem(problem);
        final SubLObject parent_x = (NIL != parent_problem) ? problem_layout_x_lookup(layout, parent_problem) : ZERO_INTEGER;
        final SubLObject parent_y = (NIL != parent_problem) ? problem_layout_y_lookup(layout, parent_problem) : ZERO_INTEGER;
        if ((NIL != parent_x) && (NIL != parent_y)) {
            thread.resetMultipleValues();
            final SubLObject x = problem_layout_compute_add_location(layout, parent_x, parent_y);
            final SubLObject y = thread.secondMultipleValue();
            thread.resetMultipleValues();
            problem_layout_add_to_grid(layout, x, y, problem);
        } else {
            Errors.warn($str45$unable_to_add_to_layout__S, problem);
        }
        return problem;
    }

    public static SubLObject problem_layout_add_to_grid(final SubLObject layout, final SubLObject x, final SubLObject y, final SubLObject problem) {
        dictionary.dictionary_enter(prob_layout_problem_x_table(layout), problem, x);
        dictionary.dictionary_enter(prob_layout_problem_y_table(layout), problem, y);
        final SubLObject grid_x_layer = prob_layout_grid(layout);
        SubLObject grid_y_layer = dictionary.dictionary_lookup(grid_x_layer, x, UNPROVIDED);
        if (NIL == dictionary.dictionary_p(grid_y_layer)) {
            grid_y_layer = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(grid_x_layer, x, grid_y_layer);
        }
        dictionary.dictionary_enter(grid_y_layer, y, problem);
        _csetf_prob_layout_min_x(layout, min(x, prob_layout_min_x(layout)));
        _csetf_prob_layout_max_x(layout, max(x, prob_layout_max_x(layout)));
        _csetf_prob_layout_min_y(layout, min(y, prob_layout_min_y(layout)));
        _csetf_prob_layout_max_y(layout, max(y, prob_layout_max_y(layout)));
        _csetf_prob_layout_next_problem_id(layout, number_utilities.f_1X(inference_datastructures_problem.problem_suid(problem)));
        return layout;
    }

    public static SubLObject problem_layout_compute_add_location(final SubLObject layout, final SubLObject parent_x, final SubLObject parent_y) {
        final SubLObject octants = octant_preference_order(parent_x, parent_y);
        SubLObject candidate_x = NIL;
        SubLObject candidate_y = NIL;
        SubLObject octant_location = NIL;
        octant_location = ZERO_INTEGER;
        Block_10 : while (true) {
            final SubLObject delta_x = octant_location_delta_x(octant_location);
            final SubLObject delta_y = octant_location_delta_y(octant_location);
            SubLObject cdolist_list_var = octants;
            SubLObject octant = NIL;
            octant = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                candidate_x = parent_x;
                candidate_y = parent_y;
                final SubLObject pcase_var = octant;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    candidate_x = add(candidate_x, delta_x);
                    candidate_y = add(candidate_y, delta_y);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        candidate_x = add(candidate_x, delta_y);
                        candidate_y = add(candidate_y, delta_x);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            candidate_x = subtract(candidate_x, delta_y);
                            candidate_y = add(candidate_y, delta_x);
                        } else
                            if (pcase_var.eql(THREE_INTEGER)) {
                                candidate_x = subtract(candidate_x, delta_x);
                                candidate_y = add(candidate_y, delta_y);
                            } else
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    candidate_x = subtract(candidate_x, delta_x);
                                    candidate_y = subtract(candidate_y, delta_y);
                                } else
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        candidate_x = subtract(candidate_x, delta_y);
                                        candidate_y = subtract(candidate_y, delta_x);
                                    } else
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            candidate_x = add(candidate_x, delta_y);
                                            candidate_y = subtract(candidate_y, delta_x);
                                        } else
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                candidate_x = add(candidate_x, delta_x);
                                                candidate_y = subtract(candidate_y, delta_y);
                                            }







                if (NIL == problem_layout_grid_lookup(layout, candidate_x, candidate_y)) {
                    break Block_10;
                }
                cdolist_list_var = cdolist_list_var.rest();
                octant = cdolist_list_var.first();
            } 
            octant_location = number_utilities.f_1X(octant_location);
        } 
        return values(candidate_x, candidate_y);
    }

    public static SubLObject octant_preference_order(final SubLObject x, final SubLObject y) {
        return $list46;
    }

    public static SubLObject initialize_octant_locations() {
        SubLObject octant_locations = NIL;
        SubLObject end_var;
        SubLObject x;
        SubLObject end_var_$1;
        SubLObject y;
        for (end_var = integerDivide($int$316, TWO_INTEGER), x = NIL, x = ZERO_INTEGER; !x.numGE(end_var); x = number_utilities.f_1X(x)) {
            for (end_var_$1 = number_utilities.f_1X(x), y = NIL, y = ZERO_INTEGER; !y.numGE(end_var_$1); y = number_utilities.f_1X(y)) {
                octant_locations = cons(list(x, y), octant_locations);
            }
        }
        octant_locations = Sort.stable_sort(octant_locations, $sym49$OCTANT_LOCATION__, UNPROVIDED);
        $octant_locations$.setGlobalValue(apply(symbol_function(VECTOR), octant_locations));
        return length($octant_locations$.getGlobalValue());
    }

    public static SubLObject octant_location_L(final SubLObject ol_1, final SubLObject ol_2) {
        SubLObject x_1 = NIL;
        SubLObject y_1 = NIL;
        destructuring_bind_must_consp(ol_1, ol_1, $list51);
        x_1 = ol_1.first();
        SubLObject current = ol_1.rest();
        destructuring_bind_must_consp(current, ol_1, $list51);
        y_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject x_2 = NIL;
            SubLObject y_2 = NIL;
            destructuring_bind_must_consp(ol_2, ol_2, $list52);
            x_2 = ol_2.first();
            SubLObject current_$3 = ol_2.rest();
            destructuring_bind_must_consp(current_$3, ol_2, $list52);
            y_2 = current_$3.first();
            current_$3 = current_$3.rest();
            if (NIL == current_$3) {
                return numL(add(multiply(x_1, x_1), multiply(y_1, y_1)), add(multiply(x_2, x_2), multiply(y_2, y_2)));
            }
            cdestructuring_bind_error(ol_2, $list52);
        } else {
            cdestructuring_bind_error(ol_1, $list51);
        }
        return NIL;
    }

    public static SubLObject octant_location_delta_x(final SubLObject octant_location) {
        if (NIL == $octant_locations$.getGlobalValue()) {
            initialize_octant_locations();
        }
        return aref($octant_locations$.getGlobalValue(), octant_location).first();
    }

    public static SubLObject octant_location_delta_y(final SubLObject octant_location) {
        if (NIL == $octant_locations$.getGlobalValue()) {
            initialize_octant_locations();
        }
        return second(aref($octant_locations$.getGlobalValue(), octant_location));
    }

    public static SubLObject earliest_dependent_problem(final SubLObject problem) {
        SubLObject earliest_id = inference_datastructures_problem.problem_suid(problem);
        SubLObject earliest_problem = NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject parent_problem;
        SubLObject parent_id;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                parent_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != parent_problem) {
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

    public static SubLObject problem_store_most_recent_problem(final SubLObject store) {
        SubLObject end_var;
        SubLObject id;
        SubLObject problem;
        for (end_var = MINUS_ONE_INTEGER, id = NIL, id = inference_datastructures_problem_store.problem_store_historical_problem_count(store); !id.numLE(end_var); id = add(id, MINUS_ONE_INTEGER)) {
            problem = inference_datastructures_problem_store.find_problem_by_id(store, id);
            if (NIL != problem) {
                return problem;
            }
        }
        return NIL;
    }

    public static SubLObject all_problem_ancestor_problems(final SubLObject problem) {
        return all_problem_ancestor_problems_recursive(problem, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
    }

    public static SubLObject all_problem_ancestor_problems_recursive(final SubLObject problem, SubLObject ancestor_set) {
        if (NIL == set_contents.set_contents_memberP(problem, ancestor_set, symbol_function(EQ))) {
            ancestor_set = set_contents.set_contents_add(problem, ancestor_set, UNPROVIDED);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject ancestor_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    ancestor_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (NIL != ancestor_problem) {
                        ancestor_set = all_problem_ancestor_problems_recursive(ancestor_problem, ancestor_set);
                    }
                }
            }
        }
        return ancestor_set;
    }

    public static SubLObject problem_oldest_ancestor_path(final SubLObject problem) {
        return problem_oldest_ancestor_path_recursive(problem, NIL);
    }

    public static SubLObject problem_oldest_ancestor_path_recursive(final SubLObject problem, SubLObject ancestor_path) {
        if (NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            return ancestor_path;
        }
        ancestor_path = cons(problem, ancestor_path);
        final SubLObject oldest_parent_problem = problem_oldest_parent_problem(problem);
        if (NIL == oldest_parent_problem) {
            return ancestor_path;
        }
        return problem_oldest_ancestor_path_recursive(oldest_parent_problem, ancestor_path);
    }

    public static SubLObject problem_oldest_parent_problem(final SubLObject problem) {
        final SubLObject parent_problems = inference_datastructures_problem.problem_supported_problems(problem);
        final SubLObject oldest_parent_problem = list_utilities.extremal(parent_problems, symbol_function($sym53$_), symbol_function(PROBLEM_SUID));
        if ((NIL != oldest_parent_problem) && inference_datastructures_problem.problem_suid(oldest_parent_problem).numL(inference_datastructures_problem.problem_suid(problem))) {
            return oldest_parent_problem;
        }
        return NIL;
    }

    public static SubLObject problem_oldest_link_to_parent(final SubLObject problem, final SubLObject parent) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject links = NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && parent.eql(inference_datastructures_problem_link.problem_link_supported_object(link))) {
                links = cons(link, links);
            }
        }
        return list_utilities.extremal(links, symbol_function($sym53$_), symbol_function(PROBLEM_LINK_SUID));
    }

    public static SubLObject problem_proof_count_rectangle(final SubLObject problem) {
        return squarest_rectangle_for_integer_area(inference_datastructures_problem.problem_proof_count(problem, UNPROVIDED));
    }

    public static SubLObject squarest_rectangle_for_integer_area(final SubLObject area) {
        assert NIL != subl_promotions.non_negative_integer_p(area) : "subl_promotions.non_negative_integer_p(area) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(area) " + area;
        SubLObject height;
        SubLObject width = height = isqrt(area);
        if (!area.numLE(multiply(width, height))) {
            width = add(width, ONE_INTEGER);
        }
        if (!area.numLE(multiply(width, height))) {
            height = add(height, ONE_INTEGER);
        }
        return values(width, height);
    }

    public static SubLObject html_problem_layout_visualization_table(final SubLObject layout, SubLObject size, SubLObject problem_end, SubLObject table_style, SubLObject scheme) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (problem_end == UNPROVIDED) {
            problem_end = NIL;
        }
        if (table_style == UNPROVIDED) {
            table_style = NIL;
        }
        if (scheme == UNPROVIDED) {
            scheme = $GOODNESS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == size) {
            size = EIGHT_INTEGER;
        }
        final SubLObject store = problem_layout_store(layout);
        final SubLObject grid_id = cconcatenate($str58$ps_, new SubLObject[]{ format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(store)), $str59$_, format_nil.format_nil_a_no_copy(scheme) });
        final SubLObject most_recent_problem = (problem_end.isNegative()) ? problem_store_most_recent_problem(store) : inference_datastructures_problem_store.find_problem_by_id(store, number_utilities.f_1_(problem_end));
        final SubLObject ancestor_path = (NIL != most_recent_problem) ? problem_oldest_ancestor_path(most_recent_problem) : NIL;
        format(html_macros.$html_stream$.getDynamicValue(thread), table_style);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$problemGrid);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != grid_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(grid_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_source_readability_terpri(UNPROVIDED);
            html_source_readability_terpri(UNPROVIDED);
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
            for (y_end = end_var = number_utilities.f_1_(prob_layout_min_y(layout)), y = NIL, y = y_start; !y.numLE(end_var); y = add(y, MINUS_ONE_INTEGER)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($CENTER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    for (end_var_$5 = x_end, x = NIL, x = x_start; !x.numGE(end_var_$5); x = number_utilities.f_1X(x)) {
                        problem = problem_layout_grid_lookup(layout, x, y);
                        id = html_problem_layout_id(problem, scheme);
                        v_class = html_problem_layout_class(scheme, problem, most_recent_problem, ancestor_path, problem_end);
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != id) {
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(id);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != v_class) {
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(v_class);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != problem) {
                                if (size.numGE(TWENTY_INTEGER)) {
                                    cb_link($PROBLEM, problem, $MINIMAL, NIL, inference_datastructures_problem.problem_suid(problem), UNPROVIDED);
                                } else
                                    if (size.numGE(SIXTEEN_INTEGER)) {
                                        cb_link($PROBLEM, problem, $MINIMAL, NIL, $str64$_, UNPROVIDED);
                                    }

                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return layout;
    }

    public static SubLObject html_problem_layout_visualization_animation_controls(final SubLObject layout, final SubLObject schemes, SubLObject last_available_problem_id) {
        if (last_available_problem_id == UNPROVIDED) {
            last_available_problem_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = html_problem_layout_visualization_slider_ids(layout);
        SubLObject slider_id = NIL;
        SubLObject slider_field_id = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        slider_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        slider_field_id = current.first();
        current = current.rest();
        if (NIL == current) {
            cyc_file_dependencies.javascript($EXT_ALL);
            cyc_file_dependencies.javascript($RAPHAEL);
            SubLObject parent_id_json = NIL;
            final SubLObject store = problem_layout_store(layout);
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                princ($str68$_, s);
                SubLObject end_var;
                SubLObject problem_id;
                SubLObject oldest_problem;
                SubLObject oldest_id;
                for (end_var = last_available_problem_id, problem_id = NIL, problem_id = ZERO_INTEGER; !problem_id.numGE(end_var); problem_id = number_utilities.f_1X(problem_id)) {
                    oldest_problem = problem_oldest_parent_problem(inference_datastructures_problem_store.find_problem_by_id(store, problem_id));
                    oldest_id = (NIL != oldest_problem) ? inference_datastructures_problem.problem_suid(oldest_problem) : $$$null;
                    princ(oldest_id, s);
                    princ($str70$_, s);
                }
                princ($str71$_, s);
                parent_id_json = get_output_stream_string(s);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(s, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str72$_script_type__text_javascript____, new SubLObject[]{ inference_datastructures_problem_store.problem_store_suid(store), parent_id_json, number_utilities.f_1_(last_available_problem_id) });
            html_markup(html_problem_layout_visualization_scripts(layout, schemes, slider_id, slider_field_id, last_available_problem_id));
        } else {
            cdestructuring_bind_error(datum, $list65);
        }
        return NIL;
    }

    public static SubLObject html_problem_layout_visualization_animation_controls_placeholder(final SubLObject layout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = html_problem_layout_visualization_slider_ids(layout);
        SubLObject slider_id = NIL;
        SubLObject slider_field_id = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        slider_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        slider_field_id = current.first();
        current = current.rest();
        if (NIL == current) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str73$_style_type__text_css_______A_tab, new SubLObject[]{ slider_id, slider_field_id, slider_field_id });
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str74$height_1_5em);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    if (NIL != slider_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(slider_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (NIL != slider_field_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(slider_field_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            return NIL;
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject html_problem_layout_visualization_slider_ids(final SubLObject layout) {
        final SubLObject slider_id = cconcatenate($$$ps, new SubLObject[]{ format_nil.format_nil_s_no_copy(inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout))), $str76$_slider });
        final SubLObject slider_field_id = cconcatenate($$$ps, new SubLObject[]{ format_nil.format_nil_s_no_copy(inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout))), $str77$_slider_field });
        return list(slider_id, slider_field_id);
    }

    public static SubLObject html_problem_layout_visualization_scripts(final SubLObject layout, final SubLObject schemes, final SubLObject slider_id, final SubLObject slider_field_id, SubLObject last_available_problem) {
        if (last_available_problem == UNPROVIDED) {
            last_available_problem = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scheme_json = cconcatenate($str79$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.bunge_with_string(Mapping.mapcar(TO_STRING, schemes), $str81$___)), $str82$__ });
        final SubLObject last_visible_problem_id = (NIL != number_utilities.f_1_(last_available_problem)) ? number_utilities.f_1_(last_available_problem) : number_utilities.f_1_(inference_datastructures_problem_store.problem_store_problem_count(problem_layout_problem_store(layout)));
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout));
        return format(NIL, $html_problem_layout_visualization_script_template$.getDynamicValue(thread), new SubLObject[]{ last_visible_problem_id, scheme_json, problem_store_id, slider_id, slider_field_id });
    }

    public static SubLObject html_problem_layout_id(final SubLObject problem, final SubLObject scheme) {
        if (NIL != problem) {
            return cconcatenate($str83$p_, new SubLObject[]{ format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem))), $str59$_, format_nil.format_nil_a_no_copy(inference_datastructures_problem.problem_suid(problem)), $str59$_, format_nil.format_nil_a_no_copy(string_utilities.to_string(scheme)) });
        }
        return NIL;
    }

    public static SubLObject clear_html_problem_layout_visualization_table_style() {
        final SubLObject cs = $html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_html_problem_layout_visualization_table_style(final SubLObject size) {
        return memoization_state.caching_state_remove_function_results_with_args($html_problem_layout_visualization_table_style_caching_state$.getGlobalValue(), list(size), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_problem_layout_visualization_table_style_internal(final SubLObject size) {
        final SubLObject td_border_width = (size.numG(FIVE_INTEGER)) ? ONE_INTEGER : ZERO_INTEGER;
        final SubLObject td_border = cconcatenate($$$solid_gray_, new SubLObject[]{ format_nil.format_nil_d_no_copy(td_border_width), $$$px });
        return cconcatenate($str87$_style_type__text_css_______probl, new SubLObject[]{ format_nil.format_nil_a_no_copy(min(TWO_INTEGER, integerDivide(size, EIGHT_INTEGER))), $str88$px__background___000000_______pro, format_nil.format_nil_a_no_copy(size), $str89$px__height__, format_nil.format_nil_a_no_copy(size), $str90$px__border__, format_nil.format_nil_a_no_copy(td_border), $str91$__font_family__courier__fixed__wh, format_nil.format_nil_a_no_copy(size), $str89$px__height__, format_nil.format_nil_a_no_copy(size), $str92$px__font_family__courier__fixed__ });
    }

    public static SubLObject html_problem_layout_visualization_table_style(final SubLObject size) {
        SubLObject caching_state = $html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE, $html_problem_layout_visualization_table_style_caching_state$, SIXTEEN_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, size, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(html_problem_layout_visualization_table_style_internal(size)));
            memoization_state.caching_state_put(caching_state, size, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject html_problem_layout_visualization_page_css() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str94$_style_type__text_css_____body_x_);
        return NIL;
    }

    public static SubLObject html_problem_layout_class(final SubLObject scheme, final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        if (scheme.eql($GOODNESS)) {
            return html_problem_layout_class_by_goodness(problem, most_recent_problem, ancestor_path, problem_end);
        }
        if (scheme.eql($STRATEGY)) {
            return html_problem_layout_class_by_strategy(problem, most_recent_problem, ancestor_path, problem_end);
        }
        return Errors.error($str96$unexpected_visualization_scheme__, scheme);
    }

    public static SubLObject html_problem_layout_class_by_goodness(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        SubLObject v_class = NIL;
        if (NIL == problem) {
            v_class = $$$problem_none;
        } else
            if (NIL == inference_datastructures_problem.valid_problem_p(problem)) {
                v_class = $$$problem_invalid;
            } else
                if ((problem_end.isInteger() && (!problem_end.isNegative())) && (!inference_datastructures_problem.problem_suid(problem).numL(problem_end))) {
                    v_class = $$$problem_future;
                } else
                    if (NIL != inference_datastructures_problem.problem_has_answer_link_p(problem)) {
                        v_class = $$$problem_root;
                    } else
                        if (NIL != inference_worker.good_problem_p(problem, $TACTICAL)) {
                            v_class = $$$problem_good;
                        } else
                            if (NIL != inference_worker.neutral_problem_p(problem, $TACTICAL)) {
                                v_class = $$$problem_neutral;
                            } else {
                                v_class = $str104$problem_no_good;
                            }





        if (NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            v_class = cconcatenate(v_class, $$$_path);
        }
        if ((NIL != most_recent_problem) && problem.eql(most_recent_problem)) {
            v_class = cconcatenate(v_class, $$$_focus);
        }
        return v_class;
    }

    public static SubLObject html_problem_layout_class_by_strategy(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        SubLObject v_class = NIL;
        if (NIL == problem) {
            v_class = $$$problem_none;
        } else
            if (NIL == inference_datastructures_problem.valid_problem_p(problem)) {
                v_class = $$$problem_invalid;
            } else
                if ((problem_end.isInteger() && (!problem_end.isNegative())) && (!inference_datastructures_problem.problem_suid(problem).numL(problem_end))) {
                    v_class = $$$problem_future;
                } else
                    if (NIL != inference_datastructures_problem.problem_has_answer_link_p(problem)) {
                        v_class = $$$problem_root;
                    } else
                        if (NIL != inference_worker.problem_has_any_new_root_motivationP(problem)) {
                            v_class = $str107$problem_new_root;
                        } else
                            if (NIL != inference_worker.problem_has_any_transformation_motivationP(problem)) {
                                v_class = $$$problem_transformation;
                            } else
                                if (NIL != inference_worker.problem_has_any_removal_motivationP(problem)) {
                                    v_class = $$$problem_removal;
                                } else {
                                    v_class = $$$problem_unmotivated;
                                }






        if (NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            v_class = cconcatenate(v_class, $$$_path);
        }
        if (problem.eql(most_recent_problem)) {
            v_class = cconcatenate(v_class, $$$_focus);
        }
        return v_class;
    }

    public static SubLObject cb_link_visualize_problems(final SubLObject store, SubLObject linktext, SubLObject refresh_rate, SubLObject size, SubLObject problem_end) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (refresh_rate == UNPROVIDED) {
            refresh_rate = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (problem_end == UNPROVIDED) {
            problem_end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str111$_Visualize_;
        }
        if (NIL == refresh_rate) {
            refresh_rate = MINUS_ONE_INTEGER;
        }
        if (NIL == size) {
            size = best_problem_store_visualizer_zoom_level_for_store(store);
        }
        if (NIL == problem_end) {
            problem_end = MINUS_ONE_INTEGER;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str113$cb_visualize_problems__A__A__A__A, new SubLObject[]{ inference_datastructures_problem_store.problem_store_suid(store), refresh_rate, size, problem_end });
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_visualize_problems(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject refresh_string = NIL;
        SubLObject size_string = NIL;
        destructuring_bind_must_consp(args, args, $list116);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list116);
        refresh_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list116);
        size_string = current.first();
        current = current.rest();
        final SubLObject problem_end_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list116);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list116);
            return NIL;
        }
        final SubLObject store = cb_inference_browser.cb_guess_problem_store(store_id_string);
        if (NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            return cb_error($str117$_A_did_not_specify_a_problem_stor, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject refresh_rate = read_from_string_ignoring_errors(refresh_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject size = read_from_string_ignoring_errors(size_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject problem_end = (NIL != problem_end_string) ? read_from_string_ignoring_errors(problem_end_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : inference_datastructures_problem_store.problem_store_problem_count(store);
        final SubLObject layout = cb_problem_store_layout(store);
        final SubLObject table_style = html_problem_layout_visualization_table_style(size);
        update_problem_layout(layout);
        return cb_visualize_problems_guts(layout, refresh_rate, size, problem_end, table_style, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject best_problem_store_visualizer_zoom_level_for_store(final SubLObject store) {
        final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        if (count.numG($int$100000)) {
            return THREE_INTEGER;
        }
        if (count.numG($int$50000)) {
            return FOUR_INTEGER;
        }
        if (count.numG($int$24000)) {
            return FIVE_INTEGER;
        }
        if (count.numG($int$12000)) {
            return EIGHT_INTEGER;
        }
        if (count.numG($int$5000)) {
            return TEN_INTEGER;
        }
        if (count.numG($int$2000)) {
            return SIXTEEN_INTEGER;
        }
        if (count.numG($int$1000)) {
            return TWENTY_INTEGER;
        }
        if (count.numG($int$500)) {
            return $int$32;
        }
        return $int$40;
    }

    public static SubLObject cb_visualize_problems_guts(final SubLObject layout, final SubLObject refresh_rate, final SubLObject size, final SubLObject problem_end, final SubLObject table_style, SubLObject suppress_textual_outputP, SubLObject show_copyrightP, SubLObject body_style, SubLObject visualization_schemes) {
        if (suppress_textual_outputP == UNPROVIDED) {
            suppress_textual_outputP = NIL;
        }
        if (show_copyrightP == UNPROVIDED) {
            show_copyrightP = T;
        }
        if (body_style == UNPROVIDED) {
            body_style = $str131$;
        }
        if (visualization_schemes == UNPROVIDED) {
            visualization_schemes = $list132;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_layout_store(layout);
        final SubLObject sequence_max = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        final SubLObject current_end = (problem_end.isNegative()) ? sequence_max : problem_end;
        html_markup($str133$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str134$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            cyc_file_dependencies.css($EXT_ALL);
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(cconcatenate($$$Problem_Store_, new SubLObject[]{ format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(store)), $$$_Visualization }));
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            if (!refresh_rate.isNegative()) {
                html_refresh(refresh_rate, UNPROVIDED);
            }
            html_problem_layout_visualization_page_css();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_markup(html_macros.$html_body_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(body_style);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL == suppress_textual_outputP) {
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$visControls);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Problem_Store_);
                            cb_link($PROBLEM_STORE, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (!store.eql(inference_datastructures_problem_store.most_recent_problem_store())) {
                                html_indent(UNPROVIDED);
                                cb_link($VISUALIZE_PROBLEMS, inference_datastructures_problem_store.most_recent_problem_store(), $str140$_Most_Recent_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_indent(TWO_INTEGER);
                            html_princ($str141$Refresh___);
                            cb_link($VISUALIZE_PROBLEMS, store, $str142$_Now_, refresh_rate, size, problem_end);
                            html_indent(UNPROVIDED);
                            if (refresh_rate.isNegative()) {
                                cb_link($VISUALIZE_PROBLEMS, store, $str143$_Auto_, FIVE_INTEGER, size, problem_end);
                            } else {
                                cb_link($VISUALIZE_PROBLEMS, store, $str144$_Halt_, MINUS_ONE_INTEGER, size, problem_end);
                            }
                            html_indent(TWO_INTEGER);
                            html_princ($str145$Zoom__);
                            SubLObject cdolist_list_var = $cb_problem_store_default_zoom_levels$.getDynamicValue(thread);
                            SubLObject zoom = NIL;
                            zoom = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_indent(UNPROVIDED);
                                if (zoom.numE(size)) {
                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    cb_link($VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end);
                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                } else {
                                    cb_link($VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                zoom = cdolist_list_var.first();
                            } 
                            html_newline(UNPROVIDED);
                            html_princ($str146$Sequence__);
                            html_indent(TWO_INTEGER);
                            cb_link($VISUALIZE_PROBLEMS, store, $$$Begin, MINUS_ONE_INTEGER, size, ONE_INTEGER);
                            if (sequence_max.numG($int$1000)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str148$_1000, MINUS_ONE_INTEGER, size, max(ONE_INTEGER, subtract(current_end, $int$1000)));
                            }
                            if (sequence_max.numG($int$100)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str150$_100, MINUS_ONE_INTEGER, size, max(ONE_INTEGER, subtract(current_end, $int$100)));
                            }
                            if (sequence_max.numG(TEN_INTEGER)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str151$_10, MINUS_ONE_INTEGER, size, max(ONE_INTEGER, subtract(current_end, TEN_INTEGER)));
                            }
                            html_indent(ONE_INTEGER);
                            cb_link($VISUALIZE_PROBLEMS, store, $str152$_1, MINUS_ONE_INTEGER, size, max(ONE_INTEGER, subtract(current_end, ONE_INTEGER)));
                            html_indent(ONE_INTEGER);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            cb_link($VISUALIZE_PROBLEMS, store, current_end, refresh_rate, size, current_end);
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_indent(ONE_INTEGER);
                            cb_link($VISUALIZE_PROBLEMS, store, $str153$_1, MINUS_ONE_INTEGER, size, min(sequence_max, add(current_end, ONE_INTEGER)));
                            if (sequence_max.numG(TEN_INTEGER)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str154$_10, MINUS_ONE_INTEGER, size, min(sequence_max, add(current_end, TEN_INTEGER)));
                            }
                            if (sequence_max.numG($int$100)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str155$_100, MINUS_ONE_INTEGER, size, min(sequence_max, add(current_end, $int$100)));
                            }
                            if (sequence_max.numG($int$1000)) {
                                html_indent(ONE_INTEGER);
                                cb_link($VISUALIZE_PROBLEMS, store, $str156$_1000, MINUS_ONE_INTEGER, size, min(sequence_max, add(current_end, $int$1000)));
                            }
                            html_indent(ONE_INTEGER);
                            cb_link($VISUALIZE_PROBLEMS, store, $$$End, MINUS_ONE_INTEGER, size, MINUS_ONE_INTEGER);
                            final SubLObject problem = inference_datastructures_problem_store.find_problem_by_id(store, number_utilities.f_1_(current_end));
                            if (NIL != problem) {
                                html_indent(FOUR_INTEGER);
                                cb_link($PROBLEM, problem, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_indent(FOUR_INTEGER);
                            if (sequence_max.numGE(TEN_INTEGER)) {
                                html_newline(UNPROVIDED);
                                html_princ($str159$Percent__);
                                html_indent(THREE_INTEGER);
                                SubLObject i;
                                SubLObject percent;
                                SubLObject percent_problem_end;
                                SubLObject precise_percent_current_end;
                                SubLObject percent_current_end;
                                for (i = NIL, i = ZERO_INTEGER; i.numL(ELEVEN_INTEGER); i = add(i, ONE_INTEGER)) {
                                    percent = multiply(i, TEN_INTEGER);
                                    percent_problem_end = integerDivide(multiply(i, sequence_max), TEN_INTEGER);
                                    precise_percent_current_end = number_utilities.percent(current_end, sequence_max, THREE_INTEGER);
                                    percent_current_end = multiply(TEN_INTEGER, ceiling(divide(multiply(current_end, TEN_INTEGER), sequence_max), UNPROVIDED));
                                    if (percent.numE(percent_current_end) && (!percent_problem_end.numE(current_end))) {
                                        html_indent(ONE_INTEGER);
                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        cb_link($VISUALIZE_PROBLEMS, store, sublisp_float(precise_percent_current_end, UNPROVIDED), MINUS_ONE_INTEGER, size, current_end);
                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    }
                                    html_indent(ONE_INTEGER);
                                    if (problem_end.numE(percent_problem_end)) {
                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        cb_link($VISUALIZE_PROBLEMS, store, percent, MINUS_ONE_INTEGER, size, percent_problem_end);
                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    } else {
                                        cb_link($VISUALIZE_PROBLEMS, store, percent, MINUS_ONE_INTEGER, size, percent_problem_end);
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    html_problem_layout_visualization_animation_controls_placeholder(layout);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$problemStoreVisualizations);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var2 = visualization_schemes;
                            SubLObject scheme = NIL;
                            scheme = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_problem_layout_visualization_table(layout, size, problem_end, table_style, scheme);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                scheme = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    if (NIL == suppress_textual_outputP) {
                        html_problem_layout_visualization_animation_controls(layout, visualization_schemes, current_end);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    if (NIL != show_copyrightP) {
                        html_copyright_notice();
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$10, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_visualize_problems_for_monitor(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $current_vpfm_call_count$.setGlobalValue(add($current_vpfm_call_count$.getGlobalValue(), ONE_INTEGER));
        if (ZERO_INTEGER.eql(mod($current_vpfm_call_count$.getGlobalValue(), FOUR_INTEGER)) && $current_vpfm_call_count$.getGlobalValue().numGE(FOUR_INTEGER)) {
            cb_inference_monitors.inference_monitor_warn($str161$_D_concurrent_CB_VISUALIZE_PROBLE, $current_vpfm_call_count$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject err_msg = NIL;
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject store_id_string = NIL;
                        SubLObject problem_end_string = NIL;
                        destructuring_bind_must_consp(args, args, $list163);
                        store_id_string = args.first();
                        SubLObject current = args.rest();
                        destructuring_bind_must_consp(current, args, $list163);
                        problem_end_string = current.first();
                        current = current.rest();
                        final SubLObject mode_string = (current.isCons()) ? current.first() : NIL;
                        destructuring_bind_must_listp(current, args, $list163);
                        current = current.rest();
                        if (NIL == current) {
                            notify_visualizing_problem_store(UNPROVIDED);
                            cb_visualize_problems_for_monitor_int(store_id_string, problem_end_string, mode_string);
                        } else {
                            cdestructuring_bind_error(args, $list163);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                $current_vpfm_call_count$.setGlobalValue(subtract($current_vpfm_call_count$.getGlobalValue(), ONE_INTEGER));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != err_msg) {
            cb_inference_monitors.inference_monitor_warn($str164$Error_for_args__S_____S, args, err_msg, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_visualize_problems_for_monitor_int(final SubLObject store_id_string, final SubLObject problem_end_string, final SubLObject mode_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = (mode_string.isString()) ? read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject store = (mode.eql($LATEST_INFERENCE)) ? cb_inference_monitors.latest_monitorable_problem_store() : cb_inference_browser.cb_guess_problem_store(store_id_string);
        if (NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            store = nth_value_step_2(nth_value_step_1(ONE_INTEGER), web_services.get_inference_from_mode(mode));
        }
        if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            final SubLObject refresh_rate = MINUS_ONE_INTEGER;
            final SubLObject problem_end = read_from_string_ignoring_errors(problem_end_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject layout = update_problem_layout(cb_problem_store_layout(store));
            final SubLObject layout_width = subtract(prob_layout_max_x(layout), prob_layout_min_x(layout));
            final SubLObject layout_height = subtract(prob_layout_max_y(layout), prob_layout_min_y(layout));
            final SubLObject size = compute_grid_size_for_inference_monitor(layout_width, layout_height);
            final SubLObject suppress_textual_outputP = T;
            final SubLObject show_copyrightP = NIL;
            final SubLObject table_style = html_problem_layout_visualization_for_monitor_table_style(size, layout_width, layout_height);
            final SubLObject body_style = $str168$overflow_hidden_;
            if (!store.eql($last_store$.getGlobalValue())) {
                cb_inference_monitors.inference_monitor_info($str169$Visualizing_new_problem_store__S, store, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if ((problem_end.isNumber() && $last_problem_end$.getGlobalValue().isNumber()) && subtract(problem_end, $last_problem_end$.getGlobalValue()).numG($int$25)) {
                    cb_inference_monitors.inference_monitor_info($str171$Jumped_problem_end_from__A_to__A_, $last_problem_end$.getGlobalValue(), problem_end, UNPROVIDED, UNPROVIDED);
                }

            $last_problem_end$.setGlobalValue(problem_end);
            $last_store$.setGlobalValue(store);
            return cb_visualize_problems_guts(layout, refresh_rate, size, problem_end, table_style, suppress_textual_outputP, show_copyrightP, body_style, $list172);
        }
        if (mode.eql($LATEST_INFERENCE)) {
            html_markup($str133$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str134$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
        return cb_error($str167$_A__A_did_not_specify_a_problem_s, store_id_string, mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_notify_visualizing_problem_store() {
        final SubLObject cs = $notify_visualizing_problem_store_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_notify_visualizing_problem_store(SubLObject id) {
        if (id == UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($notify_visualizing_problem_store_caching_state$.getGlobalValue(), list(id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject notify_visualizing_problem_store_internal(final SubLObject id) {
        cb_inference_monitors.inference_monitor_info($str174$__Visualizing_problem_store__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject notify_visualizing_problem_store(SubLObject id) {
        if (id == UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second(UNPROVIDED);
        }
        SubLObject caching_state = $notify_visualizing_problem_store_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NOTIFY_VISUALIZING_PROBLEM_STORE, $notify_visualizing_problem_store_caching_state$, EIGHT_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(notify_visualizing_problem_store_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_compute_grid_size_for_inference_monitor() {
        final SubLObject cs = $compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height) {
        return memoization_state.caching_state_remove_function_results_with_args($compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue(), list(layout_width, layout_height), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject compute_grid_size_for_inference_monitor_internal(final SubLObject layout_width, final SubLObject layout_height) {
        if (ZERO_INTEGER.eql(layout_width) || ZERO_INTEGER.eql(layout_height)) {
            return ZERO_INTEGER;
        }
        final SubLObject max_table_width = $inference_monitor_grid_width$.getGlobalValue();
        final SubLObject max_table_height = $inference_monitor_grid_height$.getGlobalValue();
        final SubLObject optimum_cell_width = integerDivide(max_table_width, layout_width);
        final SubLObject optimum_cell_height = integerDivide(max_table_height, layout_height);
        cb_inference_monitors.inference_monitor_info($str177$Given_layout_of__Dx_D__optimum_ce, layout_width, layout_height, optimum_cell_width, optimum_cell_height);
        return min(optimum_cell_width, new SubLObject[]{ optimum_cell_height, $inference_monitor_max_cell_size$.getGlobalValue() });
    }

    public static SubLObject compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height) {
        SubLObject caching_state = $compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR, $compute_grid_size_for_inference_monitor_caching_state$, EIGHT_INTEGER, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(layout_width, layout_height);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (layout_width.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && layout_height.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(compute_grid_size_for_inference_monitor_internal(layout_width, layout_height)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(layout_width, layout_height));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_html_problem_layout_visualization_for_monitor_table_style() {
        final SubLObject cs = $html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        return memoization_state.caching_state_remove_function_results_with_args($html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue(), list(td_height, layout_width, layout_height), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_problem_layout_visualization_for_monitor_table_style_internal(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        final SubLObject td_border_width = (td_height.numG(FIVE_INTEGER)) ? ONE_INTEGER : ZERO_INTEGER;
        final SubLObject td_border = cconcatenate($$$solid_gray_, new SubLObject[]{ format_nil.format_nil_d_no_copy(td_border_width), $$$px });
        final SubLObject td_width = multiply(td_height, $float$1_5);
        final SubLObject padded_td_height = add(td_height, td_border_width);
        final SubLObject padded_td_width = add(td_width, td_border_width);
        final SubLObject table_width = floor(multiply(padded_td_width, layout_width), UNPROVIDED);
        final SubLObject horizontal_whitespace = max(ZERO_INTEGER, subtract($inference_monitor_grid_width$.getGlobalValue(), table_width));
        final SubLObject table_left_margin = integerDivide(horizontal_whitespace, TWO_INTEGER);
        final SubLObject table_height = floor(multiply(padded_td_height, layout_height), UNPROVIDED);
        final SubLObject vertical_whitespace = max(ZERO_INTEGER, subtract($inference_monitor_grid_height$.getGlobalValue(), table_height));
        final SubLObject table_top_margin = integerDivide(vertical_whitespace, TWO_INTEGER);
        final SubLObject style = cconcatenate($str181$_style_type__text_css______proble, new SubLObject[]{ format_nil.format_nil_a_no_copy(table_left_margin), $str182$px__margin_top__, format_nil.format_nil_a_no_copy(table_top_margin), $str183$px__opacity___75_____table_proble, format_nil.format_nil_a_no_copy(td_width), $str184$px__height___, format_nil.format_nil_a_no_copy(td_height), $str90$px__border__, format_nil.format_nil_a_no_copy(td_border), $str185$______td_none______border_color__ });
        cb_inference_monitors.inference_monitor_info($str186$Layout__Dx_D_____A, layout_width, layout_height, style, UNPROVIDED);
        return style;
    }

    public static SubLObject html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        SubLObject caching_state = $html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE, $html_problem_layout_visualization_for_monitor_table_style_caching_state$, EIGHT_INTEGER, EQL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(td_height, layout_width, layout_height);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (td_height.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (layout_width.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && layout_height.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(html_problem_layout_visualization_for_monitor_table_style_internal(td_height, layout_width, layout_height)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(td_height, layout_width, layout_height));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cb_problem_store_layout(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        SubLObject layout = cache.cache_get_without_values($cb_problem_store_layout_table$.getGlobalValue(), store, UNPROVIDED);
        if (NIL == problem_layout_p(layout)) {
            layout = new_problem_layout(store);
            delete_stale_problem_store_layouts();
            thread.resetMultipleValues();
            final SubLObject dropped_store = cache.cache_set_return_dropped($cb_problem_store_layout_table$.getGlobalValue(), store, layout);
            final SubLObject dropped_layout = thread.secondMultipleValue();
            final SubLObject validP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != validP) {
                destroy_problem_layout(dropped_layout);
            }
        }
        return layout;
    }

    public static SubLObject delete_stale_problem_store_layouts() {
        SubLObject stale_stores = NIL;
        final SubLObject cache_var = $cb_problem_store_layout_table$.getGlobalValue();
        final SubLObject order_var = $NEWEST;
        SubLObject entry = cache.do_cache_first(cache_var, order_var);
        SubLObject store = NIL;
        SubLObject layout = NIL;
        while (NIL == cache.do_cache_doneP(cache_var, entry)) {
            store = cache.do_cache_key(entry);
            layout = cache.do_cache_value(entry);
            entry = cache.do_cache_next(entry, order_var);
            if (NIL == inference_datastructures_problem_store.valid_problem_store_p(store)) {
                stale_stores = cons(store, stale_stores);
            }
        } 
        SubLObject cdolist_list_var = stale_stores;
        SubLObject store2 = NIL;
        store2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject layout2 = cache.cache_get($cb_problem_store_layout_table$.getGlobalValue(), store2);
            cache.cache_remove($cb_problem_store_layout_table$.getGlobalValue(), store2);
            destroy_problem_layout(layout2);
            cdolist_list_var = cdolist_list_var.rest();
            store2 = cdolist_list_var.first();
        } 
        return length(stale_stores);
    }

    public static SubLObject declare_problem_store_visualization_file() {
        declareFunction(me, "problem_layout_print_function_trampoline", "PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "problem_layout_p", "PROBLEM-LAYOUT-P", 1, 0, false);
        new problem_store_visualization.$problem_layout_p$UnaryFunction();
        declareFunction(me, "prob_layout_problem_store", "PROB-LAYOUT-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "prob_layout_min_x", "PROB-LAYOUT-MIN-X", 1, 0, false);
        declareFunction(me, "prob_layout_max_x", "PROB-LAYOUT-MAX-X", 1, 0, false);
        declareFunction(me, "prob_layout_min_y", "PROB-LAYOUT-MIN-Y", 1, 0, false);
        declareFunction(me, "prob_layout_max_y", "PROB-LAYOUT-MAX-Y", 1, 0, false);
        declareFunction(me, "prob_layout_grid", "PROB-LAYOUT-GRID", 1, 0, false);
        declareFunction(me, "prob_layout_next_problem_id", "PROB-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false);
        declareFunction(me, "prob_layout_problem_x_table", "PROB-LAYOUT-PROBLEM-X-TABLE", 1, 0, false);
        declareFunction(me, "prob_layout_problem_y_table", "PROB-LAYOUT-PROBLEM-Y-TABLE", 1, 0, false);
        declareFunction(me, "_csetf_prob_layout_problem_store", "_CSETF-PROB-LAYOUT-PROBLEM-STORE", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_min_x", "_CSETF-PROB-LAYOUT-MIN-X", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_max_x", "_CSETF-PROB-LAYOUT-MAX-X", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_min_y", "_CSETF-PROB-LAYOUT-MIN-Y", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_max_y", "_CSETF-PROB-LAYOUT-MAX-Y", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_grid", "_CSETF-PROB-LAYOUT-GRID", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_next_problem_id", "_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_problem_x_table", "_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_prob_layout_problem_y_table", "_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE", 2, 0, false);
        declareFunction(me, "make_problem_layout", "MAKE-PROBLEM-LAYOUT", 0, 1, false);
        declareFunction(me, "visit_defstruct_problem_layout", "VISIT-DEFSTRUCT-PROBLEM-LAYOUT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_problem_layout_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD", 2, 0, false);
        declareFunction(me, "new_problem_layout", "NEW-PROBLEM-LAYOUT", 1, 0, false);
        declareFunction(me, "destroy_problem_layout", "DESTROY-PROBLEM-LAYOUT", 1, 0, false);
        declareFunction(me, "problem_layout_store", "PROBLEM-LAYOUT-STORE", 1, 0, false);
        declareFunction(me, "problem_layout_next_problem_id", "PROBLEM-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false);
        declareFunction(me, "problem_layout_problem_store", "PROBLEM-LAYOUT-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "problem_layout_x_lookup", "PROBLEM-LAYOUT-X-LOOKUP", 2, 0, false);
        declareFunction(me, "problem_layout_y_lookup", "PROBLEM-LAYOUT-Y-LOOKUP", 2, 0, false);
        declareFunction(me, "problem_layout_grid_lookup", "PROBLEM-LAYOUT-GRID-LOOKUP", 3, 0, false);
        declareFunction(me, "update_problem_layout", "UPDATE-PROBLEM-LAYOUT", 1, 0, false);
        declareFunction(me, "problem_layout_add", "PROBLEM-LAYOUT-ADD", 2, 0, false);
        declareFunction(me, "problem_layout_add_to_grid", "PROBLEM-LAYOUT-ADD-TO-GRID", 4, 0, false);
        declareFunction(me, "problem_layout_compute_add_location", "PROBLEM-LAYOUT-COMPUTE-ADD-LOCATION", 3, 0, false);
        declareFunction(me, "octant_preference_order", "OCTANT-PREFERENCE-ORDER", 2, 0, false);
        declareFunction(me, "initialize_octant_locations", "INITIALIZE-OCTANT-LOCATIONS", 0, 0, false);
        declareFunction(me, "octant_location_L", "OCTANT-LOCATION-<", 2, 0, false);
        declareFunction(me, "octant_location_delta_x", "OCTANT-LOCATION-DELTA-X", 1, 0, false);
        declareFunction(me, "octant_location_delta_y", "OCTANT-LOCATION-DELTA-Y", 1, 0, false);
        declareFunction(me, "earliest_dependent_problem", "EARLIEST-DEPENDENT-PROBLEM", 1, 0, false);
        declareFunction(me, "problem_store_most_recent_problem", "PROBLEM-STORE-MOST-RECENT-PROBLEM", 1, 0, false);
        declareFunction(me, "all_problem_ancestor_problems", "ALL-PROBLEM-ANCESTOR-PROBLEMS", 1, 0, false);
        declareFunction(me, "all_problem_ancestor_problems_recursive", "ALL-PROBLEM-ANCESTOR-PROBLEMS-RECURSIVE", 2, 0, false);
        declareFunction(me, "problem_oldest_ancestor_path", "PROBLEM-OLDEST-ANCESTOR-PATH", 1, 0, false);
        declareFunction(me, "problem_oldest_ancestor_path_recursive", "PROBLEM-OLDEST-ANCESTOR-PATH-RECURSIVE", 2, 0, false);
        declareFunction(me, "problem_oldest_parent_problem", "PROBLEM-OLDEST-PARENT-PROBLEM", 1, 0, false);
        declareFunction(me, "problem_oldest_link_to_parent", "PROBLEM-OLDEST-LINK-TO-PARENT", 2, 0, false);
        declareFunction(me, "problem_proof_count_rectangle", "PROBLEM-PROOF-COUNT-RECTANGLE", 1, 0, false);
        declareFunction(me, "squarest_rectangle_for_integer_area", "SQUAREST-RECTANGLE-FOR-INTEGER-AREA", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_table", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE", 1, 4, false);
        declareFunction(me, "html_problem_layout_visualization_animation_controls", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS", 2, 1, false);
        declareFunction(me, "html_problem_layout_visualization_animation_controls_placeholder", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS-PLACEHOLDER", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_slider_ids", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SLIDER-IDS", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_scripts", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPTS", 4, 1, false);
        declareFunction(me, "html_problem_layout_id", "HTML-PROBLEM-LAYOUT-ID", 2, 0, false);
        declareFunction(me, "clear_html_problem_layout_visualization_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 0, 0, false);
        declareFunction(me, "remove_html_problem_layout_visualization_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-INTERNAL", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false);
        declareFunction(me, "html_problem_layout_visualization_page_css", "HTML-PROBLEM-LAYOUT-VISUALIZATION-PAGE-CSS", 0, 0, false);
        declareFunction(me, "html_problem_layout_class", "HTML-PROBLEM-LAYOUT-CLASS", 5, 0, false);
        declareFunction(me, "html_problem_layout_class_by_goodness", "HTML-PROBLEM-LAYOUT-CLASS-BY-GOODNESS", 4, 0, false);
        declareFunction(me, "html_problem_layout_class_by_strategy", "HTML-PROBLEM-LAYOUT-CLASS-BY-STRATEGY", 4, 0, false);
        declareFunction(me, "cb_link_visualize_problems", "CB-LINK-VISUALIZE-PROBLEMS", 1, 4, false);
        declareFunction(me, "cb_visualize_problems", "CB-VISUALIZE-PROBLEMS", 1, 0, false);
        declareFunction(me, "best_problem_store_visualizer_zoom_level_for_store", "BEST-PROBLEM-STORE-VISUALIZER-ZOOM-LEVEL-FOR-STORE", 1, 0, false);
        declareFunction(me, "cb_visualize_problems_guts", "CB-VISUALIZE-PROBLEMS-GUTS", 5, 4, false);
        declareFunction(me, "cb_visualize_problems_for_monitor", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR", 1, 0, false);
        declareFunction(me, "cb_visualize_problems_for_monitor_int", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR-INT", 3, 0, false);
        declareFunction(me, "clear_notify_visualizing_problem_store", "CLEAR-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "remove_notify_visualizing_problem_store", "REMOVE-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false);
        declareFunction(me, "notify_visualizing_problem_store_internal", "NOTIFY-VISUALIZING-PROBLEM-STORE-INTERNAL", 1, 0, false);
        declareFunction(me, "notify_visualizing_problem_store", "NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false);
        declareFunction(me, "clear_compute_grid_size_for_inference_monitor", "CLEAR-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 0, 0, false);
        declareFunction(me, "remove_compute_grid_size_for_inference_monitor", "REMOVE-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false);
        declareFunction(me, "compute_grid_size_for_inference_monitor_internal", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-INTERNAL", 2, 0, false);
        declareFunction(me, "compute_grid_size_for_inference_monitor", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false);
        declareFunction(me, "clear_html_problem_layout_visualization_for_monitor_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 0, 0, false);
        declareFunction(me, "remove_html_problem_layout_visualization_for_monitor_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false);
        declareFunction(me, "html_problem_layout_visualization_for_monitor_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-INTERNAL", 3, 0, false);
        declareFunction(me, "html_problem_layout_visualization_for_monitor_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false);
        declareFunction(me, "cb_problem_store_layout", "CB-PROBLEM-STORE-LAYOUT", 1, 0, false);
        declareFunction(me, "delete_stale_problem_store_layouts", "DELETE-STALE-PROBLEM-STORE-LAYOUTS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_problem_store_visualization_file() {
        defconstant("*DTP-PROBLEM-LAYOUT*", PROBLEM_LAYOUT);
        deflexical("*OCTANT-LOCATIONS*", SubLTrampolineFile.maybeDefault($octant_locations$, $octant_locations$, NIL));
        defparameter("*HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPT-TEMPLATE*", $str78$_script_type__text_javascript____);
        deflexical("*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*", NIL);
        defparameter("*CB-PROBLEM-STORE-DEFAULT-ZOOM-LEVELS*", $list130);
        deflexical("*LAST-STORE*", NIL);
        deflexical("*LAST-PROBLEM-END*", NIL);
        deflexical("*CURRENT-VPFM-CALL-COUNT*", ZERO_INTEGER);
        deflexical("*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*", NIL);
        deflexical("*INFERENCE-MONITOR-GRID-WIDTH*", $int$100);
        deflexical("*INFERENCE-MONITOR-GRID-HEIGHT*", $int$100);
        deflexical("*INFERENCE-MONITOR-MAX-CELL-SIZE*", FIFTEEN_INTEGER);
        deflexical("*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*", NIL);
        deflexical("*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*", NIL);
        deflexical("*CB-PROBLEM-STORE-LAYOUT-TABLE*", SubLTrampolineFile.maybeDefault($cb_problem_store_layout_table$, $cb_problem_store_layout_table$, () -> cache.new_cache(TEN_INTEGER, symbol_function(EQ))));
        return NIL;
    }

    public static SubLObject setup_problem_store_visualization_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_layout$.getGlobalValue(), symbol_function(PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PROB_LAYOUT_PROBLEM_STORE, _CSETF_PROB_LAYOUT_PROBLEM_STORE);
        def_csetf(PROB_LAYOUT_MIN_X, _CSETF_PROB_LAYOUT_MIN_X);
        def_csetf(PROB_LAYOUT_MAX_X, _CSETF_PROB_LAYOUT_MAX_X);
        def_csetf(PROB_LAYOUT_MIN_Y, _CSETF_PROB_LAYOUT_MIN_Y);
        def_csetf(PROB_LAYOUT_MAX_Y, _CSETF_PROB_LAYOUT_MAX_Y);
        def_csetf(PROB_LAYOUT_GRID, _CSETF_PROB_LAYOUT_GRID);
        def_csetf(PROB_LAYOUT_NEXT_PROBLEM_ID, _CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID);
        def_csetf(PROB_LAYOUT_PROBLEM_X_TABLE, _CSETF_PROB_LAYOUT_PROBLEM_X_TABLE);
        def_csetf(PROB_LAYOUT_PROBLEM_Y_TABLE, _CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE);
        identity(PROBLEM_LAYOUT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_layout$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD));
        declare_defglobal($octant_locations$);
        note_funcall_helper_function($sym49$OCTANT_LOCATION__);
        memoization_state.note_globally_cached_function(HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE);
        setup_cb_link_method($VISUALIZE_PROBLEMS, CB_LINK_VISUALIZE_PROBLEMS, FIVE_INTEGER);
        html_macros.note_cgi_handler_function(CB_VISUALIZE_PROBLEMS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_VISUALIZE_PROBLEMS_FOR_MONITOR, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(NOTIFY_VISUALIZING_PROBLEM_STORE);
        memoization_state.note_globally_cached_function(COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR);
        memoization_state.note_globally_cached_function(HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE);
        declare_defglobal($cb_problem_store_layout_table$);
        return NIL;
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

    

    public static final class $problem_layout_native extends SubLStructNative {
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

        private $problem_layout_native() {
            this.$problem_store = Lisp.NIL;
            this.$min_x = Lisp.NIL;
            this.$max_x = Lisp.NIL;
            this.$min_y = Lisp.NIL;
            this.$max_y = Lisp.NIL;
            this.$grid = Lisp.NIL;
            this.$next_problem_id = Lisp.NIL;
            this.$problem_x_table = Lisp.NIL;
            this.$problem_y_table = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($problem_layout_native.class, PROBLEM_LAYOUT, PROBLEM_LAYOUT_P, $list2, $list3, new String[]{ "$problem_store", "$min_x", "$max_x", "$min_y", "$max_y", "$grid", "$next_problem_id", "$problem_x_table", "$problem_y_table" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $problem_layout_p$UnaryFunction extends UnaryFunction {
        public $problem_layout_p$UnaryFunction() {
            super(extractFunctionNamed("PROBLEM-LAYOUT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return problem_layout_p(arg1);
        }
    }
}

/**
 * Total time: 634 ms The overlay table (the original one from the page) is made
 * transparent and put in front of the SVG so that the\n links will be clickable
 * and the SVG will still be visible. To make the links sensible, a copy of the
 * overlay table\n (the underlay table) is put under the SVG, and it's
 * visible.\n
 */
