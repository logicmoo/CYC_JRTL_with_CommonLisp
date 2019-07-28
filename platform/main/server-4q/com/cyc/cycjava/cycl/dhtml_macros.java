package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.dhtml_macros.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class dhtml_macros extends SubLTranslatedFile {
    public static final SubLFile me = new dhtml_macros();

    public static final String myName = "com.cyc.cycjava.cycl.dhtml_macros";

    public static final String myFingerPrint = "b87b793fbcb7a2da870f2742f97cbf5eddc90b6c036a4860bdc9166a805ac6ac";

    // defconstant
    public static final SubLSymbol $dhtml_css_head$ = makeSymbol("*DHTML-CSS-HEAD*");

    // defconstant
    public static final SubLSymbol $dhtml_css_type$ = makeSymbol("*DHTML-CSS-TYPE*");

    // defconstant
    public static final SubLSymbol $dhtml_css_media$ = makeSymbol("*DHTML-CSS-MEDIA*");

    // defconstant
    public static final SubLSymbol $dhtml_css_tail$ = makeSymbol("*DHTML-CSS-TAIL*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_position$ = makeSymbol("*DHTML-DOM-POSITION*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_top$ = makeSymbol("*DHTML-DOM-TOP*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_bottom$ = makeSymbol("*DHTML-DOM-BOTTOM*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_right$ = makeSymbol("*DHTML-DOM-RIGHT*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_left$ = makeSymbol("*DHTML-DOM-LEFT*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_visibility$ = makeSymbol("*DHTML-DOM-VISIBILITY*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_display$ = makeSymbol("*DHTML-DOM-DISPLAY*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_height$ = makeSymbol("*DHTML-DOM-HEIGHT*");

    // defconstant
    public static final SubLSymbol $dhtml_dom_width$ = makeSymbol("*DHTML-DOM-WIDTH*");

    // defconstant
    public static final SubLSymbol $dhtml_blank_href_js$ = makeSymbol("*DHTML-BLANK-HREF-JS*");

    // defparameter
    public static final SubLSymbol $html_element_id$ = makeSymbol("*HTML-ELEMENT-ID*");

    // deflexical
    public static final SubLSymbol $js_load_later$ = makeSymbol("*JS-LOAD-LATER*");

    // deflexical
    private static final SubLSymbol $kea_set_focal_tool$ = makeSymbol("*KEA-SET-FOCAL-TOOL*");

    // Internal Constants
    public static final SubLString $str0$_style = makeString("<style");

    public static final SubLString $str1$_type_ = makeString(" type=");

    public static final SubLString $str2$_media_ = makeString(" media=");

    public static final SubLString $str3$__style_ = makeString("</style>");

    public static final SubLList $list4 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPE"), makeString("text/css")), list(makeSymbol("MEDIA"), makeString("screen"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $str5$text_css = makeString("text/css");

    public static final SubLString $$$screen = makeString("screen");

    public static final SubLSymbol HTML_QUOTED_ATTRIBUTE = makeSymbol("HTML-QUOTED-ATTRIBUTE");

    public static final SubLList $list8 = list(makeSymbol("*DHTML-CSS-TYPE*"));



    public static final SubLList $list10 = list(makeSymbol("*DHTML-CSS-MEDIA*"));



    public static final SubLSymbol HTML_MARKUP_WRAPPER = makeSymbol("HTML-MARKUP-WRAPPER");

    public static final SubLList $list13 = list(makeSymbol("*DHTML-CSS-HEAD*"), makeSymbol("*DHTML-CSS-TAIL*"));

    public static final SubLSymbol HTML_MARKUP_BODY = makeSymbol("HTML-MARKUP-BODY");

    public static final SubLList $list15 = list(list(makeSymbol("HTML-TERPRI")));

    public static final SubLString $$$position = makeString("position");

    public static final SubLString $$$top = makeString("top");

    public static final SubLString $$$bottom = makeString("bottom");

    public static final SubLString $$$right = makeString("right");

    public static final SubLString $$$left = makeString("left");

    public static final SubLString $$$visibility = makeString("visibility");

    public static final SubLString $$$display = makeString("display");

    public static final SubLString $$$height = makeString("height");

    public static final SubLString $$$width = makeString("width");

    public static final SubLList $list25 = list(list(makeSymbol("OBJECT-ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DHTML_DOM_WRAPPER_PREAMBLE = makeSymbol("DHTML-DOM-WRAPPER-PREAMBLE");

    public static final SubLList $list27 = list(list(makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE")));

    public static final SubLSymbol DHTML_DOM_WRAPPER = makeSymbol("DHTML-DOM-WRAPPER");

    public static final SubLString $str29$__A__ = makeString("#~A {");

    public static final SubLSymbol DHTML_DOM_WRAPPER_POSTAMBLE = makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE");

    public static final SubLString $str31$__ = makeString(" }");

    public static final SubLList $list32 = list(list(makeSymbol("ATTRIBUTE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DHTML_DOM_ATTRIBUTE_PREAMBLE = makeSymbol("DHTML-DOM-ATTRIBUTE-PREAMBLE");

    public static final SubLList $list34 = list(list(makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE")));

    public static final SubLSymbol DHTML_DOM_ATTRIBUTE = makeSymbol("DHTML-DOM-ATTRIBUTE");

    public static final SubLString $str36$__A_ = makeString(" ~A:");

    public static final SubLSymbol DHTML_DOM_ATTRIBUTE_POSTAMBLE = makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE");

    public static final SubLString $str38$_ = makeString(";");

    public static final SubLList $list39 = list(list(makeSymbol("OBJECT-ID"), list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TOP"), makeSymbol("BOTTOM"), makeSymbol("RIGHT"), makeSymbol("LEFT"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("POSITION"), makeSymbol("VISIBILITY"), makeSymbol("DISPLAY") }), makeSymbol("&BODY"), makeSymbol("BODY")));

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("TOP"), makeKeyword("BOTTOM"), makeKeyword("RIGHT"), makeKeyword("LEFT"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("POSITION"), makeKeyword("VISIBILITY"), makeKeyword("DISPLAY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



















    public static final SubLList $list51 = list(makeSymbol("*DHTML-DOM-POSITION*"));

    public static final SubLList $list52 = list(makeSymbol("*DHTML-DOM-TOP*"));

    public static final SubLList $list53 = list(makeSymbol("*DHTML-DOM-BOTTOM*"));

    public static final SubLList $list54 = list(makeSymbol("*DHTML-DOM-LEFT*"));

    public static final SubLList $list55 = list(makeSymbol("*DHTML-DOM-RIGHT*"));

    public static final SubLList $list56 = list(makeSymbol("*DHTML-DOM-VISIBILITY*"));

    public static final SubLList $list57 = list(makeSymbol("*DHTML-DOM-DISPLAY*"));

    public static final SubLList $list58 = list(makeSymbol("*DHTML-DOM-HEIGHT*"));

    public static final SubLList $list59 = list(makeSymbol("*DHTML-DOM-WIDTH*"));

    public static final SubLList $list60 = list(makeSymbol("HTML-TERPRI"));

    private static final SubLString $str61$javascript_void____ = makeString("javascript:void('')");







    private static final SubLList $list65 = list(makeKeyword("PARAGRAPH"), makeKeyword("TEXT"));

    private static final SubLList $list66 = list(makeKeyword("VISIBLE"), makeKeyword("INVISIBLE"));





    private static final SubLString $str69$_S_was_not_a_known_visibility_p = makeString("~S was not a known visibility-p");

    private static final SubLSymbol VISIBILITY_P = makeSymbol("VISIBILITY-P");

    private static final SubLSymbol FLOW_TYPE_P = makeSymbol("FLOW-TYPE-P");

    private static final SubLString $$$none = makeString("none");



    private static final SubLString $$$block = makeString("block");

    private static final SubLString $$$inline = makeString("inline");



    private static final SubLString $str77$setVisibility__ = makeString("setVisibility('");

    private static final SubLString $str78$___ = makeString("','");

    private static final SubLString $str79$___ = makeString("');");



    private static final SubLString $str81$_show_button = makeString("_show_button");

    private static final SubLString $str82$_hide_button = makeString("_hide_button");



    private static final SubLList $list84 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE")), list(makeSymbol("FLOW-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list85 = list(makeKeyword("INITIAL-VISIBILITY"), makeKeyword("FLOW-TYPE"));





    private static final SubLSymbol DHTML_SET_VISIBILITY = makeSymbol("DHTML-SET-VISIBILITY");

    private static final SubLSymbol HTML_FANCY_DIV = makeSymbol("HTML-FANCY-DIV");



    private static final SubLList $list91 = list(list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));

    private static final SubLSymbol DHTML_SET_SWITCHED_VISIBILITY = makeSymbol("DHTML-SET-SWITCHED-VISIBILITY");

    private static final SubLList $list93 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("STYLE"), makeString(""))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list94 = list(makeKeyword("STYLE"));



    private static final SubLString $str96$ = makeString("");

    private static final SubLSymbol HTML_FANCY_SPAN = makeSymbol("HTML-FANCY-SPAN");

    private static final SubLSymbol DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");

    private static final SubLList $list99 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("VISIBILITY"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT"), list(makeSymbol("FLOW-TYPE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list100 = list(makeKeyword("LINK-TEXT"), makeKeyword("FLOW-TYPE"));



    private static final SubLSymbol $sym102$HREF = makeUninternedSymbol("HREF");

    private static final SubLSymbol $sym103$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");



    private static final SubLList $list105 = list(makeSymbol("*DHTML-BLANK-HREF-JS*"));

    private static final SubLSymbol DHTML_GENERATE_VISIBILITY_SETTER = makeSymbol("DHTML-GENERATE-VISIBILITY-SETTER");











    private static final SubLList $list112 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list113 = list(makeKeyword("LINK-TEXT"));

    private static final SubLSymbol $sym114$HREF = makeUninternedSymbol("HREF");

    private static final SubLSymbol $sym115$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

    private static final SubLSymbol DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE = makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE");

    private static final SubLList $list117 = list(list(makeSymbol("CLASS"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym118$HREF = makeUninternedSymbol("HREF");

    private static final SubLSymbol $sym119$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

    private static final SubLSymbol DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE = makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE");

    private static final SubLSymbol DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");



    private static final SubLString $str123$toggleVisibility__ = makeString("toggleVisibility('");



    private static final SubLString $str125$__true = makeString(", true");



    private static final SubLString $str127$__false = makeString(", false");

    private static final SubLString $str128$toggleClassVisibility__ = makeString("toggleClassVisibility('");

    private static final SubLString $str129$_ = makeString("'");

    private static final SubLString $str130$__ = makeString(");");

    public static final SubLList $list131 = list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-CODE"), makeSymbol("HIDE-LINK-CODE"));

    private static final SubLSymbol $sym132$SHOW_ID = makeUninternedSymbol("SHOW-ID");

    private static final SubLSymbol $sym133$SHOW_ACTION = makeUninternedSymbol("SHOW-ACTION");

    private static final SubLSymbol $sym134$HIDE_ID = makeUninternedSymbol("HIDE-ID");

    private static final SubLSymbol $sym135$HIDE_ACTION = makeUninternedSymbol("HIDE-ACTION");



    private static final SubLSymbol DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol("DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS");

    private static final SubLSymbol DHTML_SWITCH_VISIBLITY_LINK = makeSymbol("DHTML-SWITCH-VISIBLITY-LINK");

    private static final SubLList $list139 = list(makeSymbol("OBJECT-CLASS"), makeSymbol("SHOW-LINK-CODE"), makeSymbol("HIDE-LINK-CODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIALLY-HIDDEN?"), T));

    private static final SubLSymbol $sym140$SHOW_ID = makeUninternedSymbol("SHOW-ID");

    private static final SubLSymbol $sym141$SHOW_ACTION = makeUninternedSymbol("SHOW-ACTION");

    private static final SubLSymbol $sym142$HIDE_ID = makeUninternedSymbol("HIDE-ID");

    private static final SubLSymbol $sym143$HIDE_ACTION = makeUninternedSymbol("HIDE-ACTION");

    private static final SubLSymbol $sym144$SHOW_STYLE = makeUninternedSymbol("SHOW-STYLE");

    private static final SubLSymbol $sym145$HIDE_STYLE = makeUninternedSymbol("HIDE-STYLE");

    private static final SubLSymbol DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol("DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS");



    private static final SubLList $list148 = list(makeString("display:inline"), makeString("display:none"));

    private static final SubLList $list149 = list(makeString("display:none"), makeString("display:inline"));

    private static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");

    private static final SubLList $list151 = list(makeSymbol("OBJECT-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE = makeSymbol("DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");

    private static final SubLSymbol DHTML_VISIBILITY_DECLARE_DOM_OBJECTS = makeSymbol("DHTML-VISIBILITY-DECLARE-DOM-OBJECTS");

    private static final SubLList $list154 = list(makeSymbol("OBJECT-ID"), makeSymbol("ONCLICK-ACTION"), makeSymbol("LINK-CODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("STYLE"), makeString("")));

    private static final SubLSymbol $sym155$HREF = makeUninternedSymbol("HREF");

    private static final SubLSymbol DHTML_POTENTIALLY_SHOW_TEXT = makeSymbol("DHTML-POTENTIALLY-SHOW-TEXT");

    private static final SubLSymbol HTML_SMALL = makeSymbol("HTML-SMALL");

    private static final SubLList $list158 = list(list(makeSymbol("&KEY"), makeSymbol("SHOW"), makeSymbol("HIDE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list159 = list(makeKeyword("SHOW"), makeKeyword("HIDE"));

    private static final SubLList $list160 = list(makeSymbol("HTML-MARKUP"), list(makeSymbol("JAVASCRIPT-VOID-URL")));

    private static final SubLSymbol DHTML_CHANGE_VISIBLE_SECTION_ONCLICK = makeSymbol("DHTML-CHANGE-VISIBLE-SECTION-ONCLICK");

    private static final SubLSymbol DHTML_CHANGE_VISIBILE_SECTION = makeSymbol("DHTML-CHANGE-VISIBILE-SECTION");

    private static final SubLString $str163$___block___setVisibility__ = makeString("','block');setVisibility('");

    private static final SubLString $str164$___none___ = makeString("','none');");

    private static final SubLSymbol $RIGHT_TRIANGLE_V = makeKeyword("RIGHT-TRIANGLE-V");

    private static final SubLString $str166$cyc_right_triangle_violet_gif = makeString("cyc-right-triangle-violet.gif");

    private static final SubLString $str167$_Show_ = makeString("[Show]");

    private static final SubLSymbol $LEFT_TRIANGLE_V = makeKeyword("LEFT-TRIANGLE-V");

    private static final SubLString $str169$cyc_left_triangle_violet_gif = makeString("cyc-left-triangle-violet.gif");

    private static final SubLSymbol $DOWN_TRIANGLE_V = makeKeyword("DOWN-TRIANGLE-V");

    private static final SubLString $str171$cyc_down_triangle_violet_gif = makeString("cyc-down-triangle-violet.gif");

    private static final SubLString $str172$_Hide_ = makeString("[Hide]");

    private static final SubLSymbol $UP_TRIANGLE_V = makeKeyword("UP-TRIANGLE-V");

    private static final SubLString $str174$cyc_up_triangle_violet_gif = makeString("cyc-up-triangle-violet.gif");



    private static final SubLString $str176$cyc_no_triangle_violet_gif = makeString("cyc-no-triangle-violet.gif");

    private static final SubLString $$$__ = makeString("  ");



    private static final SubLString $str179$square_minus_gif = makeString("square-minus.gif");



    private static final SubLString $str181$square_plus_gif = makeString("square-plus.gif");



    private static final SubLString $str183$square_blank_gif = makeString("square-blank.gif");



    private static final SubLString $str185$display_inline = makeString("display:inline");

    private static final SubLString $str186$display_none = makeString("display:none");





    private static final SubLList $list189 = list(list(makeSymbol("*HTML-ELEMENT-ID*"), ZERO_INTEGER));

    private static final SubLList $list190 = list(makeSymbol("BASIC-AJAX-SCRIPTS"));

    private static final SubLList $list191 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*JS-LOAD-LATER*"));

    private static final SubLString $str192$_script_type__text_javascript__fu = makeString("<script type=\'text/javascript\'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest(\'get\', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=\'Unable to load\';\n}\n</script>\n");

    public static final SubLList $list193 = list(makeSymbol("HANDLER"), makeSymbol("ARGS"), makeSymbol("&KEY"), list(makeSymbol("MESSAGE"), makeString("")), list(makeSymbol("TAG"), makeString("span")), list(makeSymbol("DELAY"), makeInteger(50)));

    public static final SubLList $list194 = list(makeKeyword("MESSAGE"), makeKeyword("TAG"), makeKeyword("DELAY"));





    private static final SubLString $$$span = makeString("span");



    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol JS_DELAYED_LOAD_INT = makeSymbol("JS-DELAYED-LOAD-INT");







    private static final SubLSymbol JS_DELAYED_LOAD = makeSymbol("JS-DELAYED-LOAD");

    private static final SubLString $str205$cyc_elt_ = makeString("cyc-elt-");

    private static final SubLString $str206$__A_id___A___A___A_ = makeString("<~A id='~A'>~A</~A>");

    private static final SubLString $str207$_script_type__text_javascript__tr = makeString("<script type=\'text/javascript\'>try {YAHOO.util.Event.addListener(window, \'load\', setTimeout(\"loadLater(\'~A\', \'~A\')\", ~A));} catch(err) {document.getElementById(\'~a\').innerHTML=\'Error ~A\';}</script>");

    private static final SubLString $str208$_ = makeString("?");

    private static final SubLList $list209 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $str210$_ = makeString("&");

    private static final SubLString $str211$_ = makeString("=");

    private static final SubLString $str212$_if__isKeaHosted________var_keaBu = makeString("\nif (isKeaHosted()) {\n  var keaBus = new KEASessionBus();\n  YAHOO.util.Event.onDOMReady(function() {\n    window.onfocus = function() {\n      keaBus.setFocalTool(\'\');\n      keaBus.setFocalTool(\'legacyToolFocus\');\n    }; \n  });\n}");

















    private static final SubLSymbol $CB_INLINE_EDIT = makeKeyword("CB-INLINE-EDIT");

    private static final SubLSymbol $CYCJS_KEA_SESSION_BUS = makeKeyword("CYCJS-KEA-SESSION-BUS");

    private static final SubLString $str223$__yui_skin_sam__editContainer__yu = makeString(" .yui-skin-sam .editContainer .yui-ac-input { position:relative; width:10em; }");

    public static SubLObject dhtml_with_cascading_style_sheet(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject type = (current.isCons()) ? current.first() : $str5$text_css;
        destructuring_bind_must_listp(current, datum, $list4);
        current = current.rest();
        final SubLObject media = (current.isCons()) ? current.first() : $$$screen;
        destructuring_bind_must_listp(current, datum, $list4);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            SubLObject attributes = NIL;
            if (NIL != type) {
                attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list8, type.isAtom() ? list(HTML_MARKUP, type) : type), attributes);
            }
            if (NIL != media) {
                attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list10, type.isAtom() ? list(HTML_MARKUP, media) : media), attributes);
            }
            if (NIL != attributes) {
                attributes = nreverse(attributes);
            }
            return listS(PROGN, listS(HTML_MARKUP_WRAPPER, $list13, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))), $list15);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject dhtml_dom_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        object_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(DHTML_DOM_WRAPPER_PREAMBLE, object_id), append(body, $list27));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static SubLObject dhtml_dom_wrapper_preamble(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(html_macros.$html_stream$.getDynamicValue(thread), $str29$__A__, object_id);
    }

    public static SubLObject dhtml_dom_wrapper_postamble() {
        return html_markup($str31$__);
    }

    public static SubLObject dhtml_dom_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject attribute = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        attribute = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(DHTML_DOM_ATTRIBUTE_PREAMBLE, attribute), append(body, $list34));
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static SubLObject dhtml_dom_attribute_preamble(final SubLObject attribute) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(html_macros.$html_stream$.getDynamicValue(thread), $str36$__A_, attribute);
    }

    public static SubLObject dhtml_dom_attribute_postamble() {
        return html_markup($str38$_);
    }

    public static SubLObject dhtml_declare_dom_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp_$1 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$2, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject top_tail = property_list_member($TOP, current);
        final SubLObject top = (NIL != top_tail) ? cadr(top_tail) : NIL;
        final SubLObject bottom_tail = property_list_member($BOTTOM, current);
        final SubLObject bottom = (NIL != bottom_tail) ? cadr(bottom_tail) : NIL;
        final SubLObject right_tail = property_list_member($RIGHT, current);
        final SubLObject right = (NIL != right_tail) ? cadr(right_tail) : NIL;
        final SubLObject left_tail = property_list_member($LEFT, current);
        final SubLObject left = (NIL != left_tail) ? cadr(left_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject position_tail = property_list_member($POSITION, current);
        final SubLObject position = (NIL != position_tail) ? cadr(position_tail) : NIL;
        final SubLObject visibility_tail = property_list_member($VISIBILITY, current);
        final SubLObject visibility = (NIL != visibility_tail) ? cadr(visibility_tail) : NIL;
        final SubLObject display_tail = property_list_member($DISPLAY, current);
        final SubLObject display = (NIL != display_tail) ? cadr(display_tail) : NIL;
        final SubLObject body;
        current = body = temp_$1;
        current = temp;
        if (NIL == current) {
            SubLObject attributes = NIL;
            if (NIL != position) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list51, position.isAtom() ? list(HTML_MARKUP, position) : position), attributes);
            }
            if (NIL != top) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list52, top.isAtom() ? list(HTML_MARKUP, top) : top), attributes);
            }
            if (NIL != bottom) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list53, bottom.isAtom() ? list(HTML_MARKUP, bottom) : bottom), attributes);
            }
            if (NIL != left) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list54, left.isAtom() ? list(HTML_MARKUP, left) : left), attributes);
            }
            if (NIL != right) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list55, right.isAtom() ? list(HTML_MARKUP, right) : right), attributes);
            }
            if (NIL != visibility) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list56, visibility.isAtom() ? list(HTML_MARKUP, visibility) : visibility), attributes);
            }
            if (NIL != display) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list57, display.isAtom() ? list(HTML_MARKUP, display) : display), attributes);
            }
            if (NIL != height) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list58, height.isAtom() ? list(HTML_MARKUP, height) : height), attributes);
            }
            if (NIL != width) {
                attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list59, width.isAtom() ? list(HTML_MARKUP, width) : width), attributes);
            }
            if (NIL != attributes) {
                attributes = nreverse(attributes);
            }
            return listS(PROGN, $list60, listS(DHTML_DOM_WRAPPER, list(object_id), append(attributes, body, NIL)), $list15);
        }
        cdestructuring_bind_error(datum, $list39);
        return NIL;
    }

    public static SubLObject dhtml_with_dom_script() {
        cyc_file_dependencies.javascript($FINDDOM);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject dhtml_creation_scripts() {
        cyc_file_dependencies.javascript($CONSTANT_CREATION);
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_lexical_scripts() {
        cyc_file_dependencies.javascript($LEXICAL);
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_with_toggle_visibility_support() {
        cyc_file_dependencies.javascript($VISIBILITY);
        return html_source_readability_terpri(UNPROVIDED);
    }

    public static SubLObject flow_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list65, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject visibility_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list66, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject invert_visibility(final SubLObject visibility) {
        if (visibility.eql($VISIBLE)) {
            return $INVISIBLE;
        }
        if (visibility.eql($INVISIBLE)) {
            return $VISIBLE;
        }
        return Errors.error($str69$_S_was_not_a_known_visibility_p, visibility);
    }

    public static SubLObject dhtml_encode_visibility(final SubLObject visibility, final SubLObject flow_type) {
        assert NIL != visibility_p(visibility) : "dhtml_macros.visibility_p(visibility) " + "CommonSymbols.NIL != dhtml_macros.visibility_p(visibility) " + visibility;
        assert NIL != flow_type_p(flow_type) : "dhtml_macros.flow_type_p(flow_type) " + "CommonSymbols.NIL != dhtml_macros.flow_type_p(flow_type) " + flow_type;
        if ($INVISIBLE == visibility) {
            return $$$none;
        }
        if ($PARAGRAPH == flow_type) {
            return $$$block;
        }
        return $$$inline;
    }

    public static SubLObject dhtml_generate_visibility_setter(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == UNPROVIDED) {
            flow_type = $TEXT;
        }
        final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
        return cconcatenate($str77$setVisibility__, new SubLObject[]{ format_nil.format_nil_a_no_copy(object_id), $str78$___, format_nil.format_nil_a_no_copy(visibility_encoding), $str79$___ });
    }

    public static SubLObject dhtml_generate_class_visibility_toggle(final SubLObject object_class, SubLObject show_or_hide) {
        if (show_or_hide == UNPROVIDED) {
            show_or_hide = NIL;
        }
        return dhtml_visibility_generate_js_for_class_toggle(object_class, show_or_hide);
    }

    public static SubLObject dhtml_set_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == UNPROVIDED) {
            flow_type = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
        html_markup($dhtml_css_head$.getGlobalValue());
        html_markup($dhtml_css_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str5$text_css);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($dhtml_css_media$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$screen);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_terpri(UNPROVIDED);
            dhtml_dom_wrapper_preamble(object_id);
            dhtml_dom_attribute_preamble($dhtml_dom_display$.getGlobalValue());
            html_markup(visibility_encoding);
            dhtml_dom_attribute_postamble();
            dhtml_dom_wrapper_postamble();
            html_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup($dhtml_css_tail$.getGlobalValue());
        html_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_visibility_generate_switch_ids(final SubLObject object_id) {
        final SubLObject show_id = dhtml_visibility_generate_show_object_id(object_id);
        final SubLObject hide_id = dhtml_visibility_generate_hide_object_id(object_id);
        return values(show_id, hide_id);
    }

    public static SubLObject dhtml_class_visibility_generate_switch_ids(final SubLObject object_class) {
        final SubLObject show_id = dhtml_class_visibility_generate_show_object_id(object_class);
        final SubLObject hide_id = dhtml_class_visibility_generate_hide_object_id(object_class);
        return values(show_id, hide_id);
    }

    public static SubLObject dhtml_visibility_generate_show_object_id(final SubLObject object_id) {
        assert NIL != stringp(object_id) : "Types.stringp(object_id) " + "CommonSymbols.NIL != Types.stringp(object_id) " + object_id;
        return cconcatenate(object_id, $str81$_show_button);
    }

    public static SubLObject dhtml_visibility_generate_hide_object_id(final SubLObject object_id) {
        assert NIL != stringp(object_id) : "Types.stringp(object_id) " + "CommonSymbols.NIL != Types.stringp(object_id) " + object_id;
        return cconcatenate(object_id, $str82$_hide_button);
    }

    public static SubLObject dhtml_class_visibility_generate_show_object_id(final SubLObject object_class) {
        assert NIL != stringp(object_class) : "Types.stringp(object_class) " + "CommonSymbols.NIL != Types.stringp(object_class) " + object_class;
        return cconcatenate(remove_if(WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str81$_show_button);
    }

    public static SubLObject dhtml_class_visibility_generate_hide_object_id(final SubLObject object_class) {
        assert NIL != stringp(object_class) : "Types.stringp(object_class) " + "CommonSymbols.NIL != Types.stringp(object_class) " + object_class;
        return cconcatenate(remove_if(WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str82$_hide_button);
    }

    public static SubLObject dhtml_potentially_show(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list84);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list84);
            if (NIL == member(current_$3, $list85, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list84);
        }
        final SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
        final SubLObject initial_visibility = (NIL != initial_visibility_tail) ? cadr(initial_visibility_tail) : $VISIBLE;
        final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
        final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
        final SubLObject body;
        current = body = temp;
        return listS(PROGN, list(DHTML_SET_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_potentially_show_switched(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list84);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list84);
            if (NIL == member(current_$4, $list85, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list84);
        }
        final SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
        final SubLObject initial_visibility = (NIL != initial_visibility_tail) ? cadr(initial_visibility_tail) : $VISIBLE;
        final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
        final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
        final SubLObject body;
        current = body = temp;
        return listS(PROGN, list(DHTML_SET_SWITCHED_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_potentially_show_text(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list93);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list93);
            if (NIL == member(current_$5, $list94, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list93);
        }
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : $str96$;
        final SubLObject body;
        current = body = temp;
        return listS(PROGN, listS(HTML_FANCY_SPAN, list($ID, object_id, $STYLE, style), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_set_switched_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == UNPROVIDED) {
            flow_type = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        dhtml_set_visibility(object_id, visibility, flow_type);
        dhtml_set_visibility(show_id, invert_visibility(visibility), $TEXT);
        dhtml_set_visibility(hide_id, visibility, $TEXT);
        return NIL;
    }

    public static SubLObject dhtml_set_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        SubLObject visibility = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        visibility = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list99);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list99);
            if (NIL == member(current_$6, $list100, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list99);
        }
        final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
        final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
        final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
        final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
        final SubLObject body;
        current = body = temp;
        final SubLObject href = $sym102$HREF;
        final SubLObject click_action = $sym103$CLICK_ACTION;
        return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_GENERATE_VISIBILITY_SETTER, object_id, visibility, flow_type))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_toggle_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list112);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list112);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list112);
            if (NIL == member(current_$7, $list113, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list112);
        }
        final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
        final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject href = $sym114$HREF;
        final SubLObject click_action = $sym115$CLICK_ACTION;
        return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, object_id))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_toggle_class_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list117);
        v_class = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list117);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list117);
            if (NIL == member(current_$8, $list113, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list117);
        }
        final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
        final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject href = $sym118$HREF;
        final SubLObject click_action = $sym119$CLICK_ACTION;
        return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, v_class))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
    }

    public static SubLObject dhtml_visibility_generate_js_for_toggle(final SubLObject object_id) {
        assert NIL != Strings.string(object_id) : "Strings.string(object_id) " + "CommonSymbols.NIL != Strings.string(object_id) " + object_id;
        return cconcatenate($str123$toggleVisibility__, new SubLObject[]{ object_id, $str79$___ });
    }

    public static SubLObject dhtml_visibility_generate_js_for_class_toggle(final SubLObject v_class, SubLObject show_or_hide) {
        if (show_or_hide == UNPROVIDED) {
            show_or_hide = NIL;
        }
        assert NIL != Strings.string(v_class) : "Strings.string(v_class) " + "CommonSymbols.NIL != Strings.string(v_class) " + v_class;
        final SubLObject visibility_arg = (show_or_hide == $SHOW) ? $str125$__true : show_or_hide == $HIDE ? $str127$__false : $str96$;
        return cconcatenate($str128$toggleClassVisibility__, new SubLObject[]{ v_class, $str129$_, visibility_arg, $str130$__ });
    }

    public static SubLObject dhtml_switch_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_id = NIL;
        SubLObject show_link_code = NIL;
        SubLObject hide_link_code = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        show_link_code = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        hide_link_code = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject show_id = $sym132$SHOW_ID;
            final SubLObject show_action = $sym133$SHOW_ACTION;
            final SubLObject hide_id = $sym134$HIDE_ID;
            final SubLObject hide_action = $sym135$HIDE_ACTION;
            return list(CMULTIPLE_VALUE_BIND, list(show_id, show_action, hide_id, hide_action), list(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_id), list(DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code), list(DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code));
        }
        cdestructuring_bind_error(datum, $list131);
        return NIL;
    }

    public static SubLObject dhtml_switch_class_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_class = NIL;
        SubLObject show_link_code = NIL;
        SubLObject hide_link_code = NIL;
        destructuring_bind_must_consp(current, datum, $list139);
        object_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list139);
        show_link_code = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list139);
        hide_link_code = current.first();
        current = current.rest();
        final SubLObject initially_hiddenP = (current.isCons()) ? current.first() : T;
        destructuring_bind_must_listp(current, datum, $list139);
        current = current.rest();
        if (NIL == current) {
            final SubLObject show_id = $sym140$SHOW_ID;
            final SubLObject show_action = $sym141$SHOW_ACTION;
            final SubLObject hide_id = $sym142$HIDE_ID;
            final SubLObject hide_action = $sym143$HIDE_ACTION;
            final SubLObject show_style = $sym144$SHOW_STYLE;
            final SubLObject hide_style = $sym145$HIDE_STYLE;
            return list(CMULTIPLE_VALUE_BIND, list(show_id, show_action, hide_id, hide_action), list(DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_class), list(CLET, list(list(show_style, listS(FIF, initially_hiddenP, $list148)), list(hide_style, listS(FIF, initially_hiddenP, $list149))), list(DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code, show_style), list(DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code, hide_style)));
        }
        cdestructuring_bind_error(datum, $list139);
        return NIL;
    }

    public static SubLObject dhtml_visibility_generate_ids_and_actions(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_action = dhtml_switch_visibility_generate_show_action(object_id, show_id, hide_id);
        final SubLObject hide_action = dhtml_switch_visibility_generate_hide_action(object_id, show_id, hide_id);
        return values(show_id, show_action, hide_id, hide_action);
    }

    public static SubLObject dhtml_class_visibility_generate_ids_and_actions(final SubLObject object_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_class_visibility_generate_switch_ids(object_class);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_action = dhtml_switch_class_visibility_generate_show_action(object_class, show_id, hide_id);
        final SubLObject hide_action = dhtml_switch_class_visibility_generate_hide_action(object_class, show_id, hide_id);
        return values(show_id, show_action, hide_id, hide_action);
    }

    public static SubLObject dhtml_visibility_declare_dom_objects(final SubLObject show_id, final SubLObject hide_id) {
        dhtml_set_visibility(show_id, $VISIBLE, $TEXT);
        dhtml_set_visibility(hide_id, $INVISIBLE, $TEXT);
        return NIL;
    }

    public static SubLObject dhtml_switch_visiblity_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_id = NIL;
        SubLObject onclick_action = NIL;
        SubLObject link_code = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        onclick_action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        link_code = current.first();
        current = current.rest();
        final SubLObject style = (current.isCons()) ? current.first() : $str96$;
        destructuring_bind_must_listp(current, datum, $list154);
        current = current.rest();
        if (NIL == current) {
            final SubLObject href = $sym155$HREF;
            return list(CLET, list(bq_cons(href, $list105)), list(DHTML_POTENTIALLY_SHOW_TEXT, list(object_id, $STYLE, style), list(HTML_SMALL, list(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, onclick_action), link_code))));
        }
        cdestructuring_bind_error(datum, $list154);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_generate_show_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
        return cconcatenate(dhtml_generate_visibility_setter(object_id, $VISIBLE, $PARAGRAPH), new SubLObject[]{ dhtml_generate_visibility_setter(show_id, $INVISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $VISIBLE, $TEXT) });
    }

    public static SubLObject dhtml_switch_visibility_generate_hide_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
        return cconcatenate(dhtml_generate_visibility_setter(object_id, $INVISIBLE, $PARAGRAPH), new SubLObject[]{ dhtml_generate_visibility_setter(show_id, $VISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $INVISIBLE, $TEXT) });
    }

    public static SubLObject dhtml_switch_class_visibility_generate_show_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
        return cconcatenate(dhtml_generate_class_visibility_toggle(object_class, $SHOW), new SubLObject[]{ dhtml_generate_visibility_setter(show_id, $INVISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $VISIBLE, $TEXT) });
    }

    public static SubLObject dhtml_switch_class_visibility_generate_hide_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
        return cconcatenate(dhtml_generate_class_visibility_toggle(object_class, $HIDE), new SubLObject[]{ dhtml_generate_visibility_setter(show_id, $VISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $INVISIBLE, $TEXT) });
    }

    public static SubLObject dhtml_change_visibile_section(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list158);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list158);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list158);
            if (NIL == member(current_$9, $list159, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list158);
        }
        final SubLObject show_tail = property_list_member($SHOW, current);
        final SubLObject show = (NIL != show_tail) ? cadr(show_tail) : NIL;
        final SubLObject hide_tail = property_list_member($HIDE, current);
        final SubLObject hide = (NIL != hide_tail) ? cadr(hide_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(HTML_FANCY_ANCHOR, list($HREF, $list160, $ONCLICK, list(HTML_MARKUP, list(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, show, hide))), append(body, NIL));
    }

    public static SubLObject dhtml_change_visible_section_onclick(final SubLObject show, final SubLObject hide) {
        return cconcatenate($str77$setVisibility__, new SubLObject[]{ format_nil.format_nil_a_no_copy(show), $str163$___block___setVisibility__, format_nil.format_nil_a_no_copy(hide), $str164$___none___ });
    }

    public static SubLObject dhtml_switch_visibility_links(final SubLObject object_id, final SubLObject show_link_text, final SubLObject hide_link_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(show_link_text);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(hide_link_text);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_links_plus_minus(final SubLObject object_id, final SubLObject text) {
        return dhtml_switch_visibility_links_icons(object_id, text, $SQUARE_MINUS, $SQUARE_PLUS);
    }

    public static SubLObject dhtml_switch_visibility_links_arrows(final SubLObject object_id, final SubLObject text) {
        return dhtml_switch_visibility_links_icons(object_id, text, $RIGHT_TRIANGLE_V, $DOWN_TRIANGLE_V);
    }

    public static SubLObject dhtml_switch_class_visibility_links_arrows(final SubLObject object_class, final SubLObject text, SubLObject initially_hiddenP) {
        if (initially_hiddenP == UNPROVIDED) {
            initially_hiddenP = T;
        }
        return dhtml_switch_class_visibility_links_icons(object_class, text, $RIGHT_TRIANGLE_V, $DOWN_TRIANGLE_V, initially_hiddenP);
    }

    public static SubLObject dhtml_switch_visibility_links_icons(final SubLObject object_id, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_princ(text);
        return NIL;
    }

    public static SubLObject dhtml_switch_class_visibility_links_icons(final SubLObject object_class, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon, SubLObject initially_hiddenP) {
        if (initially_hiddenP == UNPROVIDED) {
            initially_hiddenP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_class_visibility_generate_ids_and_actions(object_class);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_style = (NIL != initially_hiddenP) ? $str185$display_inline : $str186$display_none;
        final SubLObject hide_style = (NIL != initially_hiddenP) ? $str186$display_none : $str185$display_inline;
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(show_style);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(hide_style);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_princ(text);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_links_arrows_and_text(final SubLObject object_id, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($RIGHT_TRIANGLE_V));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($RIGHT_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_princ(text);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($DOWN_TRIANGLE_V));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($DOWN_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_princ(text);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_links_left_arrows(final SubLObject object_id, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_princ(text);
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($LEFT_TRIANGLE_V));
                final SubLObject align = $CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($LEFT_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($DOWN_TRIANGLE_V));
                final SubLObject align = $CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($DOWN_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_links_up_arrows(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != show_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(show_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($RIGHT_TRIANGLE_V));
                final SubLObject align = $CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($RIGHT_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        href = $dhtml_blank_href_js$.getGlobalValue();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (NIL != hide_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str96$);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(hide_action);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($UP_TRIANGLE_V));
                final SubLObject align = $CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($UP_TRIANGLE_V);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject dhtml_switch_visibility_no_arrow() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($BLANK_TRIANGLE));
        final SubLObject align = $TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($BLANK_TRIANGLE);
        final SubLObject border = ZERO_INTEGER;
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(image_src);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != alt) {
            html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(alt);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align(align));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(border);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_glyph($NBSP, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_next_html_element_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = $html_element_id$.getDynamicValue(thread);
        $html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
        return id;
    }

    public static SubLObject basic_ajax_scripts() {
        cyc_file_dependencies.javascript($CONNECTION);
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject with_delayed_html_load_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list189, $list190, $list191, append(body, NIL));
    }

    public static SubLObject js_delayed_load(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject handler = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list193);
        handler = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list193);
        args = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$32 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list193);
            current_$32 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list193);
            if (NIL == member(current_$32, $list194, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$32 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list193);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : $str96$;
        final SubLObject tag_tail = property_list_member($TAG, current);
        final SubLObject tag = (NIL != tag_tail) ? cadr(tag_tail) : $$$span;
        final SubLObject delay_tail = property_list_member($DELAY, current);
        final SubLObject delay = (NIL != delay_tail) ? cadr(delay_tail) : $int$50;
        return list(JS_DELAYED_LOAD_INT, listS(LIST, $HANDLER, handler, $ARGS, args, append(NIL != message ? list($MESSAGE, message) : NIL, NIL != tag ? list($TAG, tag) : NIL, NIL != delay ? list($DELAY, delay) : NIL, NIL)));
    }

    public static SubLObject js_delayed_load_int(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject handler_tail = property_list_member($HANDLER, plist);
        final SubLObject handler = (NIL != handler_tail) ? cadr(handler_tail) : NIL;
        final SubLObject args_tail = property_list_member($ARGS, plist);
        final SubLObject args = (NIL != args_tail) ? cadr(args_tail) : NIL;
        final SubLObject message_tail = property_list_member($MESSAGE, plist);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject tag_tail = property_list_member($TAG, plist);
        final SubLObject tag = (NIL != tag_tail) ? cadr(tag_tail) : NIL;
        final SubLObject delay_tail = property_list_member($DELAY, plist);
        final SubLObject delay = (NIL != delay_tail) ? cadr(delay_tail) : NIL;
        final SubLObject url = make_url_from_handler_and_args(handler, args);
        final SubLObject elt_id = cconcatenate($str205$cyc_elt_, format_nil.format_nil_a_no_copy($html_element_id$.getDynamicValue(thread)));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str206$__A_id___A___A___A_, new SubLObject[]{ tag, elt_id, message, tag });
        format(html_macros.$html_stream$.getDynamicValue(thread), $str207$_script_type__text_javascript__tr, new SubLObject[]{ url, elt_id, delay, elt_id, message });
        $html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
        return NIL;
    }

    public static SubLObject make_url_from_handler_and_args(final SubLObject handler, final SubLObject arg_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[]{ $str208$_, string_utilities.to_string(handler) });
        SubLObject cdolist_list_var = arg_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list209);
            key = current.first();
            current = value = current.rest();
            output_string = cconcatenate(output_string, new SubLObject[]{ $str210$_, key, $str211$_, cb_term_identifier(value) });
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return output_string;
    }

    public static SubLObject init_kea_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $kea_set_focal_tool$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_basic_cb_scripts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.css($MENU_CSS);
        cyc_file_dependencies.css($CB_CYC);
        cyc_file_dependencies.javascript($SELECTOR);
        cyc_file_dependencies.javascript($EVENT_DELEGATION);
        cyc_file_dependencies.javascript($CONTAINER_CORE);
        cyc_file_dependencies.javascript($MENU);
        cyc_file_dependencies.javascript($OVERLIB);
        cyc_file_dependencies.javascript($CB);
        cyc_file_dependencies.javascript($CB_INLINE_EDIT);
        cyc_file_dependencies.javascript($CYCJS_KEA_SESSION_BUS);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_style_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str223$__yui_skin_sam__editContainer__yu);
        html_markup(html_macros.$html_style_tail$.getGlobalValue());
        init_kea_support();
        return NIL;
    }

    public static SubLObject declare_dhtml_macros_file() {
        declareMacro(me, "dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET");
        declareMacro(me, "dhtml_dom_wrapper", "DHTML-DOM-WRAPPER");
        declareFunction(me, "dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false);
        declareFunction(me, "dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false);
        declareMacro(me, "dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE");
        declareFunction(me, "dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false);
        declareFunction(me, "dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false);
        declareMacro(me, "dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT");
        declareFunction(me, "dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false);
        declareFunction(me, "dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false);
        declareFunction(me, "dhtml_lexical_scripts", "DHTML-LEXICAL-SCRIPTS", 0, 0, false);
        declareFunction(me, "dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false);
        declareFunction(me, "flow_type_p", "FLOW-TYPE-P", 1, 0, false);
        declareFunction(me, "visibility_p", "VISIBILITY-P", 1, 0, false);
        declareFunction(me, "invert_visibility", "INVERT-VISIBILITY", 1, 0, false);
        declareFunction(me, "dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false);
        declareFunction(me, "dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false);
        declareFunction(me, "dhtml_generate_class_visibility_toggle", "DHTML-GENERATE-CLASS-VISIBILITY-TOGGLE", 1, 1, false);
        declareFunction(me, "dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false);
        declareFunction(me, "dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
        declareFunction(me, "dhtml_class_visibility_generate_switch_ids", "DHTML-CLASS-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
        declareFunction(me, "dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
        declareFunction(me, "dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
        declareFunction(me, "dhtml_class_visibility_generate_show_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
        declareFunction(me, "dhtml_class_visibility_generate_hide_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
        declareMacro(me, "dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW");
        declareMacro(me, "dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED");
        declareMacro(me, "dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT");
        declareFunction(me, "dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false);
        declareMacro(me, "dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK");
        declareMacro(me, "dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK");
        declareMacro(me, "dhtml_toggle_class_visibility_link", "DHTML-TOGGLE-CLASS-VISIBILITY-LINK");
        declareFunction(me, "dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false);
        declareFunction(me, "dhtml_visibility_generate_js_for_class_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE", 1, 1, false);
        declareMacro(me, "dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
        declareMacro(me, "dhtml_switch_class_visibility_links_with_code", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");
        declareFunction(me, "dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
        declareFunction(me, "dhtml_class_visibility_generate_ids_and_actions", "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
        declareFunction(me, "dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false);
        declareMacro(me, "dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK");
        declareFunction(me, "dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
        declareFunction(me, "dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
        declareFunction(me, "dhtml_switch_class_visibility_generate_show_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
        declareFunction(me, "dhtml_switch_class_visibility_generate_hide_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
        declareMacro(me, "dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION");
        declareFunction(me, "dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false);
        declareFunction(me, "dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false);
        declareFunction(me, "dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false);
        declareFunction(me, "dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false);
        declareFunction(me, "dhtml_switch_class_visibility_links_arrows", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ARROWS", 2, 1, false);
        declareFunction(me, "dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false);
        declareFunction(me, "dhtml_switch_class_visibility_links_icons", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ICONS", 4, 1, false);
        declareFunction(me, "dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false);
        declareFunction(me, "dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false);
        declareFunction(me, "dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false);
        declareFunction(me, "dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false);
        declareFunction(me, "get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false);
        declareFunction(me, "basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false);
        declareMacro(me, "with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT");
        declareMacro(me, "js_delayed_load", "JS-DELAYED-LOAD");
        declareFunction(me, "js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false);
        declareFunction(me, "make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false);
        declareFunction(me, "init_kea_support", "INIT-KEA-SUPPORT", 0, 0, false);
        declareFunction(me, "html_basic_cb_scripts", "HTML-BASIC-CB-SCRIPTS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_dhtml_macros_file() {
        defconstant("*DHTML-CSS-HEAD*", $str0$_style);
        defconstant("*DHTML-CSS-TYPE*", $str1$_type_);
        defconstant("*DHTML-CSS-MEDIA*", $str2$_media_);
        defconstant("*DHTML-CSS-TAIL*", $str3$__style_);
        defconstant("*DHTML-DOM-POSITION*", $$$position);
        defconstant("*DHTML-DOM-TOP*", $$$top);
        defconstant("*DHTML-DOM-BOTTOM*", $$$bottom);
        defconstant("*DHTML-DOM-RIGHT*", $$$right);
        defconstant("*DHTML-DOM-LEFT*", $$$left);
        defconstant("*DHTML-DOM-VISIBILITY*", $$$visibility);
        defconstant("*DHTML-DOM-DISPLAY*", $$$display);
        defconstant("*DHTML-DOM-HEIGHT*", $$$height);
        defconstant("*DHTML-DOM-WIDTH*", $$$width);
        defconstant("*DHTML-BLANK-HREF-JS*", $str61$javascript_void____);
        defparameter("*HTML-ELEMENT-ID*", ZERO_INTEGER);
        deflexical("*JS-LOAD-LATER*", $str192$_script_type__text_javascript__fu);
        deflexical("*KEA-SET-FOCAL-TOOL*", $str212$_if__isKeaHosted________var_keaBu);
        return NIL;
    }

    public static SubLObject setup_dhtml_macros_file() {
        register_macro_helper(DHTML_DOM_WRAPPER_PREAMBLE, DHTML_DOM_WRAPPER);
        register_macro_helper(DHTML_DOM_WRAPPER_POSTAMBLE, DHTML_DOM_WRAPPER);
        register_macro_helper(DHTML_DOM_ATTRIBUTE_PREAMBLE, DHTML_DOM_ATTRIBUTE);
        register_macro_helper(DHTML_DOM_ATTRIBUTE_POSTAMBLE, DHTML_DOM_ATTRIBUTE);
        register_macro_helper(DHTML_SET_SWITCHED_VISIBILITY, DHTML_POTENTIALLY_SHOW_SWITCHED);
        register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
        register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
        meta_macros.declare_indention_pattern(DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list151);
        register_macro_helper(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        register_macro_helper(DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE);
        register_macro_helper(DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        register_macro_helper(DHTML_SWITCH_VISIBLITY_LINK, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        register_macro_helper(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, DHTML_CHANGE_VISIBILE_SECTION);
        sethash($RIGHT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str166$cyc_right_triangle_violet_gif, $str167$_Show_));
        sethash($LEFT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str169$cyc_left_triangle_violet_gif, $str167$_Show_));
        sethash($DOWN_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str171$cyc_down_triangle_violet_gif, $str172$_Hide_));
        sethash($UP_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str174$cyc_up_triangle_violet_gif, $str172$_Hide_));
        sethash($BLANK_TRIANGLE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str176$cyc_no_triangle_violet_gif, $$$__));
        sethash($SQUARE_MINUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str179$square_minus_gif, $str167$_Show_));
        sethash($SQUARE_PLUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str181$square_plus_gif, $str172$_Hide_));
        sethash($SQUARE_BLANK, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str183$square_blank_gif, $$$__));
        register_macro_helper(JS_DELAYED_LOAD_INT, JS_DELAYED_LOAD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_dhtml_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_dhtml_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_dhtml_macros_file();
    }

    static {


















































































































































































































































    }
}

/**
 * Total time: 726 ms
 */
