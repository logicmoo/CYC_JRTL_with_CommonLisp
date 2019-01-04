package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dhtml_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.dhtml_macros";
    public static final String myFingerPrint = "b87b793fbcb7a2da870f2742f97cbf5eddc90b6c036a4860bdc9166a805ac6ac";
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 898L)
    public static SubLSymbol $dhtml_css_head$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 949L)
    public static SubLSymbol $dhtml_css_type$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 999L)
    public static SubLSymbol $dhtml_css_media$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1051L)
    public static SubLSymbol $dhtml_css_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1999L)
    public static SubLSymbol $dhtml_dom_position$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2126L)
    public static SubLSymbol $dhtml_dom_top$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2179L)
    public static SubLSymbol $dhtml_dom_bottom$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2235L)
    public static SubLSymbol $dhtml_dom_right$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2290L)
    public static SubLSymbol $dhtml_dom_left$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2344L)
    public static SubLSymbol $dhtml_dom_visibility$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2404L)
    public static SubLSymbol $dhtml_dom_display$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2461L)
    public static SubLSymbol $dhtml_dom_height$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2517L)
    public static SubLSymbol $dhtml_dom_width$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 5702L)
    public static SubLSymbol $dhtml_blank_href_js$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23722L)
    public static SubLSymbol $html_element_id$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24354L)
    public static SubLSymbol $js_load_later$;
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 26675L)
    private static SubLSymbol $kea_set_focal_tool$;
    private static final SubLString $str0$_style;
    private static final SubLString $str1$_type_;
    private static final SubLString $str2$_media_;
    private static final SubLString $str3$__style_;
    private static final SubLList $list4;
    private static final SubLString $str5$text_css;
    private static final SubLString $str6$screen;
    private static final SubLSymbol $sym7$HTML_QUOTED_ATTRIBUTE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$HTML_MARKUP;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PROGN;
    private static final SubLSymbol $sym12$HTML_MARKUP_WRAPPER;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$HTML_MARKUP_BODY;
    private static final SubLList $list15;
    private static final SubLString $str16$position;
    private static final SubLString $str17$top;
    private static final SubLString $str18$bottom;
    private static final SubLString $str19$right;
    private static final SubLString $str20$left;
    private static final SubLString $str21$visibility;
    private static final SubLString $str22$display;
    private static final SubLString $str23$height;
    private static final SubLString $str24$width;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$DHTML_DOM_WRAPPER_PREAMBLE;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$DHTML_DOM_WRAPPER;
    private static final SubLString $str29$__A__;
    private static final SubLSymbol $sym30$DHTML_DOM_WRAPPER_POSTAMBLE;
    private static final SubLString $str31$__;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$DHTML_DOM_ATTRIBUTE;
    private static final SubLString $str36$__A_;
    private static final SubLSymbol $sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE;
    private static final SubLString $str38$_;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw42$TOP;
    private static final SubLSymbol $kw43$BOTTOM;
    private static final SubLSymbol $kw44$RIGHT;
    private static final SubLSymbol $kw45$LEFT;
    private static final SubLSymbol $kw46$HEIGHT;
    private static final SubLSymbol $kw47$WIDTH;
    private static final SubLSymbol $kw48$POSITION;
    private static final SubLSymbol $kw49$VISIBILITY;
    private static final SubLSymbol $kw50$DISPLAY;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLString $str61$javascript_void____;
    private static final SubLSymbol $kw62$FINDDOM;
    private static final SubLSymbol $kw63$CONSTANT_CREATION;
    private static final SubLSymbol $kw64$LEXICAL;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$VISIBLE;
    private static final SubLSymbol $kw68$INVISIBLE;
    private static final SubLString $str69$_S_was_not_a_known_visibility_p;
    private static final SubLSymbol $sym70$VISIBILITY_P;
    private static final SubLSymbol $sym71$FLOW_TYPE_P;
    private static final SubLString $str72$none;
    private static final SubLSymbol $kw73$PARAGRAPH;
    private static final SubLString $str74$block;
    private static final SubLString $str75$inline;
    private static final SubLSymbol $kw76$TEXT;
    private static final SubLString $str77$setVisibility__;
    private static final SubLString $str78$___;
    private static final SubLString $str79$___;
    private static final SubLSymbol $sym80$STRINGP;
    private static final SubLString $str81$_show_button;
    private static final SubLString $str82$_hide_button;
    private static final SubLSymbol $sym83$WHITESPACEP;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $kw86$INITIAL_VISIBILITY;
    private static final SubLSymbol $kw87$FLOW_TYPE;
    private static final SubLSymbol $sym88$DHTML_SET_VISIBILITY;
    private static final SubLSymbol $sym89$HTML_FANCY_DIV;
    private static final SubLSymbol $kw90$ID;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$DHTML_SET_SWITCHED_VISIBILITY;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLSymbol $kw95$STYLE;
    private static final SubLString $str96$;
    private static final SubLSymbol $sym97$HTML_FANCY_SPAN;
    private static final SubLSymbol $sym98$DHTML_POTENTIALLY_SHOW_SWITCHED;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $kw101$LINK_TEXT;
    private static final SubLSymbol $sym102$HREF;
    private static final SubLSymbol $sym103$CLICK_ACTION;
    private static final SubLSymbol $sym104$CLET;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$DHTML_GENERATE_VISIBILITY_SETTER;
    private static final SubLSymbol $sym107$HTML_FANCY_ANCHOR;
    private static final SubLSymbol $kw108$HREF;
    private static final SubLSymbol $kw109$ONCLICK;
    private static final SubLSymbol $sym110$PWHEN;
    private static final SubLSymbol $sym111$HTML_PRINC;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$HREF;
    private static final SubLSymbol $sym115$CLICK_ACTION;
    private static final SubLSymbol $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$HREF;
    private static final SubLSymbol $sym119$CLICK_ACTION;
    private static final SubLSymbol $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE;
    private static final SubLSymbol $sym121$DHTML_TOGGLE_VISIBILITY_LINK;
    private static final SubLSymbol $sym122$STRING;
    private static final SubLString $str123$toggleVisibility__;
    private static final SubLSymbol $kw124$SHOW;
    private static final SubLString $str125$__true;
    private static final SubLSymbol $kw126$HIDE;
    private static final SubLString $str127$__false;
    private static final SubLString $str128$toggleClassVisibility__;
    private static final SubLString $str129$_;
    private static final SubLString $str130$__;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$SHOW_ID;
    private static final SubLSymbol $sym133$SHOW_ACTION;
    private static final SubLSymbol $sym134$HIDE_ID;
    private static final SubLSymbol $sym135$HIDE_ACTION;
    private static final SubLSymbol $sym136$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS;
    private static final SubLSymbol $sym138$DHTML_SWITCH_VISIBLITY_LINK;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$SHOW_ID;
    private static final SubLSymbol $sym141$SHOW_ACTION;
    private static final SubLSymbol $sym142$HIDE_ID;
    private static final SubLSymbol $sym143$HIDE_ACTION;
    private static final SubLSymbol $sym144$SHOW_STYLE;
    private static final SubLSymbol $sym145$HIDE_STYLE;
    private static final SubLSymbol $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS;
    private static final SubLSymbol $sym147$FIF;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE;
    private static final SubLSymbol $sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$HREF;
    private static final SubLSymbol $sym156$DHTML_POTENTIALLY_SHOW_TEXT;
    private static final SubLSymbol $sym157$HTML_SMALL;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK;
    private static final SubLSymbol $sym162$DHTML_CHANGE_VISIBILE_SECTION;
    private static final SubLString $str163$___block___setVisibility__;
    private static final SubLString $str164$___none___;
    private static final SubLSymbol $kw165$RIGHT_TRIANGLE_V;
    private static final SubLString $str166$cyc_right_triangle_violet_gif;
    private static final SubLString $str167$_Show_;
    private static final SubLSymbol $kw168$LEFT_TRIANGLE_V;
    private static final SubLString $str169$cyc_left_triangle_violet_gif;
    private static final SubLSymbol $kw170$DOWN_TRIANGLE_V;
    private static final SubLString $str171$cyc_down_triangle_violet_gif;
    private static final SubLString $str172$_Hide_;
    private static final SubLSymbol $kw173$UP_TRIANGLE_V;
    private static final SubLString $str174$cyc_up_triangle_violet_gif;
    private static final SubLSymbol $kw175$BLANK_TRIANGLE;
    private static final SubLString $str176$cyc_no_triangle_violet_gif;
    private static final SubLString $str177$__;
    private static final SubLSymbol $kw178$SQUARE_MINUS;
    private static final SubLString $str179$square_minus_gif;
    private static final SubLSymbol $kw180$SQUARE_PLUS;
    private static final SubLString $str181$square_plus_gif;
    private static final SubLSymbol $kw182$SQUARE_BLANK;
    private static final SubLString $str183$square_blank_gif;
    private static final SubLSymbol $kw184$CENTER;
    private static final SubLString $str185$display_inline;
    private static final SubLString $str186$display_none;
    private static final SubLSymbol $kw187$NBSP;
    private static final SubLSymbol $kw188$CONNECTION;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLString $str192$_script_type__text_javascript__fu;
    private static final SubLList $list193;
    private static final SubLList $list194;
    private static final SubLSymbol $kw195$MESSAGE;
    private static final SubLSymbol $kw196$TAG;
    private static final SubLString $str197$span;
    private static final SubLSymbol $kw198$DELAY;
    private static final SubLInteger $int199$50;
    private static final SubLSymbol $sym200$JS_DELAYED_LOAD_INT;
    private static final SubLSymbol $sym201$LIST;
    private static final SubLSymbol $kw202$HANDLER;
    private static final SubLSymbol $kw203$ARGS;
    private static final SubLSymbol $sym204$JS_DELAYED_LOAD;
    private static final SubLString $str205$cyc_elt_;
    private static final SubLString $str206$__A_id___A___A___A_;
    private static final SubLString $str207$_script_type__text_javascript__tr;
    private static final SubLString $str208$_;
    private static final SubLList $list209;
    private static final SubLString $str210$_;
    private static final SubLString $str211$_;
    private static final SubLString $str212$_if__isKeaHosted________var_keaBu;
    private static final SubLSymbol $kw213$MENU_CSS;
    private static final SubLSymbol $kw214$CB_CYC;
    private static final SubLSymbol $kw215$SELECTOR;
    private static final SubLSymbol $kw216$EVENT_DELEGATION;
    private static final SubLSymbol $kw217$CONTAINER_CORE;
    private static final SubLSymbol $kw218$MENU;
    private static final SubLSymbol $kw219$OVERLIB;
    private static final SubLSymbol $kw220$CB;
    private static final SubLSymbol $kw221$CB_INLINE_EDIT;
    private static final SubLSymbol $kw222$CYCJS_KEA_SESSION_BUS;
    private static final SubLString $str223$__yui_skin_sam__editContainer__yu;
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1103L)
    public static SubLObject dhtml_with_cascading_style_sheet(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : dhtml_macros.$str5$text_css);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dhtml_macros.$list4);
        current = current.rest();
        final SubLObject media = (SubLObject)(current.isCons() ? current.first() : dhtml_macros.$str6$screen);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dhtml_macros.$list4);
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject attributes = (SubLObject)dhtml_macros.NIL;
            if (dhtml_macros.NIL != type) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym7$HTML_QUOTED_ATTRIBUTE, (SubLObject)dhtml_macros.$list8, (SubLObject)(type.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, type) : type)), attributes);
            }
            if (dhtml_macros.NIL != media) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym7$HTML_QUOTED_ATTRIBUTE, (SubLObject)dhtml_macros.$list10, (SubLObject)(type.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, media) : media)), attributes);
            }
            if (dhtml_macros.NIL != attributes) {
                attributes = Sequences.nreverse(attributes);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym12$HTML_MARKUP_WRAPPER, (SubLObject)dhtml_macros.$list13, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)dhtml_macros.$sym14$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)dhtml_macros.NIL))))), (SubLObject)dhtml_macros.$list15);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list4);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2572L)
    public static SubLObject dhtml_dom_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list25);
        object_id = current.first();
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym26$DHTML_DOM_WRAPPER_PREAMBLE, object_id), ConsesLow.append(body, (SubLObject)dhtml_macros.$list27));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list25);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2745L)
    public static SubLObject dhtml_dom_wrapper_preamble(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)dhtml_macros.$str29$__A__, object_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2938L)
    public static SubLObject dhtml_dom_wrapper_postamble() {
        return html_utilities.html_markup((SubLObject)dhtml_macros.$str31$__);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3095L)
    public static SubLObject dhtml_dom_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject attribute = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list32);
        attribute = current.first();
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE, attribute), ConsesLow.append(body, (SubLObject)dhtml_macros.$list34));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list32);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3301L)
    public static SubLObject dhtml_dom_attribute_preamble(final SubLObject attribute) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)dhtml_macros.$str36$__A_, attribute);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3493L)
    public static SubLObject dhtml_dom_attribute_postamble() {
        return html_utilities.html_markup((SubLObject)dhtml_macros.$str38$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3655L)
    public static SubLObject dhtml_declare_dom_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list39);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list39);
        final SubLObject temp_$1 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$2 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list39);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list39);
            if (dhtml_macros.NIL == conses_high.member(current_$2, (SubLObject)dhtml_macros.$list40, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$2 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list39);
        }
        final SubLObject top_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw42$TOP, current);
        final SubLObject top = (SubLObject)((dhtml_macros.NIL != top_tail) ? conses_high.cadr(top_tail) : dhtml_macros.NIL);
        final SubLObject bottom_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw43$BOTTOM, current);
        final SubLObject bottom = (SubLObject)((dhtml_macros.NIL != bottom_tail) ? conses_high.cadr(bottom_tail) : dhtml_macros.NIL);
        final SubLObject right_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw44$RIGHT, current);
        final SubLObject right = (SubLObject)((dhtml_macros.NIL != right_tail) ? conses_high.cadr(right_tail) : dhtml_macros.NIL);
        final SubLObject left_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw45$LEFT, current);
        final SubLObject left = (SubLObject)((dhtml_macros.NIL != left_tail) ? conses_high.cadr(left_tail) : dhtml_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw46$HEIGHT, current);
        final SubLObject height = (SubLObject)((dhtml_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : dhtml_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw47$WIDTH, current);
        final SubLObject width = (SubLObject)((dhtml_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : dhtml_macros.NIL);
        final SubLObject position_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw48$POSITION, current);
        final SubLObject position = (SubLObject)((dhtml_macros.NIL != position_tail) ? conses_high.cadr(position_tail) : dhtml_macros.NIL);
        final SubLObject visibility_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw49$VISIBILITY, current);
        final SubLObject visibility = (SubLObject)((dhtml_macros.NIL != visibility_tail) ? conses_high.cadr(visibility_tail) : dhtml_macros.NIL);
        final SubLObject display_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw50$DISPLAY, current);
        final SubLObject display = (SubLObject)((dhtml_macros.NIL != display_tail) ? conses_high.cadr(display_tail) : dhtml_macros.NIL);
        final SubLObject body;
        current = (body = temp_$1);
        current = temp;
        if (dhtml_macros.NIL == current) {
            SubLObject attributes = (SubLObject)dhtml_macros.NIL;
            if (dhtml_macros.NIL != position) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list51, (SubLObject)(position.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, position) : position)), attributes);
            }
            if (dhtml_macros.NIL != top) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list52, (SubLObject)(top.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, top) : top)), attributes);
            }
            if (dhtml_macros.NIL != bottom) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list53, (SubLObject)(bottom.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, bottom) : bottom)), attributes);
            }
            if (dhtml_macros.NIL != left) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list54, (SubLObject)(left.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, left) : left)), attributes);
            }
            if (dhtml_macros.NIL != right) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list55, (SubLObject)(right.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, right) : right)), attributes);
            }
            if (dhtml_macros.NIL != visibility) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list56, (SubLObject)(visibility.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, visibility) : visibility)), attributes);
            }
            if (dhtml_macros.NIL != display) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list57, (SubLObject)(display.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, display) : display)), attributes);
            }
            if (dhtml_macros.NIL != height) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list58, (SubLObject)(height.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, height) : height)), attributes);
            }
            if (dhtml_macros.NIL != width) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE, (SubLObject)dhtml_macros.$list59, (SubLObject)(width.isAtom() ? ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, width) : width)), attributes);
            }
            if (dhtml_macros.NIL != attributes) {
                attributes = Sequences.nreverse(attributes);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)dhtml_macros.$list60, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym28$DHTML_DOM_WRAPPER, (SubLObject)ConsesLow.list(object_id), ConsesLow.append(attributes, body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list15);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list39);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 5973L)
    public static SubLObject dhtml_with_dom_script() {
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw62$FINDDOM);
        return html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6084L)
    public static SubLObject dhtml_creation_scripts() {
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw63$CONSTANT_CREATION);
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6211L)
    public static SubLObject dhtml_lexical_scripts() {
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw64$LEXICAL);
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6327L)
    public static SubLObject dhtml_with_toggle_visibility_support() {
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw49$VISIBILITY);
        return html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6575L)
    public static SubLObject flow_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)dhtml_macros.$list65, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6805L)
    public static SubLObject visibility_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)dhtml_macros.$list66, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6945L)
    public static SubLObject invert_visibility(final SubLObject visibility) {
        if (visibility.eql((SubLObject)dhtml_macros.$kw67$VISIBLE)) {
            return (SubLObject)dhtml_macros.$kw68$INVISIBLE;
        }
        if (visibility.eql((SubLObject)dhtml_macros.$kw68$INVISIBLE)) {
            return (SubLObject)dhtml_macros.$kw67$VISIBLE;
        }
        return Errors.error((SubLObject)dhtml_macros.$str69$_S_was_not_a_known_visibility_p, visibility);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7157L)
    public static SubLObject dhtml_encode_visibility(final SubLObject visibility, final SubLObject flow_type) {
        assert dhtml_macros.NIL != visibility_p(visibility) : visibility;
        assert dhtml_macros.NIL != flow_type_p(flow_type) : flow_type;
        if (dhtml_macros.$kw68$INVISIBLE == visibility) {
            return (SubLObject)dhtml_macros.$str72$none;
        }
        if (dhtml_macros.$kw73$PARAGRAPH == flow_type) {
            return (SubLObject)dhtml_macros.$str74$block;
        }
        return (SubLObject)dhtml_macros.$str75$inline;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7516L)
    public static SubLObject dhtml_generate_visibility_setter(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == dhtml_macros.UNPROVIDED) {
            flow_type = (SubLObject)dhtml_macros.$kw76$TEXT;
        }
        final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
        return Sequences.cconcatenate((SubLObject)dhtml_macros.$str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(object_id), dhtml_macros.$str78$___, format_nil.format_nil_a_no_copy(visibility_encoding), dhtml_macros.$str79$___ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7859L)
    public static SubLObject dhtml_generate_class_visibility_toggle(final SubLObject object_class, SubLObject show_or_hide) {
        if (show_or_hide == dhtml_macros.UNPROVIDED) {
            show_or_hide = (SubLObject)dhtml_macros.NIL;
        }
        return dhtml_visibility_generate_js_for_class_toggle(object_class, show_or_hide);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 8196L)
    public static SubLObject dhtml_set_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == dhtml_macros.UNPROVIDED) {
            flow_type = (SubLObject)dhtml_macros.$kw76$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str5$text_css);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str6$screen);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_terpri((SubLObject)dhtml_macros.UNPROVIDED);
            dhtml_dom_wrapper_preamble(object_id);
            dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
            html_utilities.html_markup(visibility_encoding);
            dhtml_dom_attribute_postamble();
            dhtml_dom_wrapper_postamble();
            html_utilities.html_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
        html_utilities.html_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 8700L)
    public static SubLObject dhtml_visibility_generate_switch_ids(final SubLObject object_id) {
        final SubLObject show_id = dhtml_visibility_generate_show_object_id(object_id);
        final SubLObject hide_id = dhtml_visibility_generate_hide_object_id(object_id);
        return Values.values(show_id, hide_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9066L)
    public static SubLObject dhtml_class_visibility_generate_switch_ids(final SubLObject object_class) {
        final SubLObject show_id = dhtml_class_visibility_generate_show_object_id(object_class);
        final SubLObject hide_id = dhtml_class_visibility_generate_hide_object_id(object_class);
        return Values.values(show_id, hide_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9461L)
    public static SubLObject dhtml_visibility_generate_show_object_id(final SubLObject object_id) {
        assert dhtml_macros.NIL != Types.stringp(object_id) : object_id;
        return Sequences.cconcatenate(object_id, (SubLObject)dhtml_macros.$str81$_show_button);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9670L)
    public static SubLObject dhtml_visibility_generate_hide_object_id(final SubLObject object_id) {
        assert dhtml_macros.NIL != Types.stringp(object_id) : object_id;
        return Sequences.cconcatenate(object_id, (SubLObject)dhtml_macros.$str82$_hide_button);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9878L)
    public static SubLObject dhtml_class_visibility_generate_show_object_id(final SubLObject object_class) {
        assert dhtml_macros.NIL != Types.stringp(object_class) : object_class;
        return Sequences.cconcatenate(Sequences.remove_if((SubLObject)dhtml_macros.$sym83$WHITESPACEP, object_class, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED), (SubLObject)dhtml_macros.$str81$_show_button);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10127L)
    public static SubLObject dhtml_class_visibility_generate_hide_object_id(final SubLObject object_class) {
        assert dhtml_macros.NIL != Types.stringp(object_class) : object_class;
        return Sequences.cconcatenate(Sequences.remove_if((SubLObject)dhtml_macros.$sym83$WHITESPACEP, object_class, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED), (SubLObject)dhtml_macros.$str82$_hide_button);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10375L)
    public static SubLObject dhtml_potentially_show(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list84);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$3 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list84);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list84);
            if (dhtml_macros.NIL == conses_high.member(current_$3, (SubLObject)dhtml_macros.$list85, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$3 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list84);
        }
        final SubLObject initial_visibility_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw86$INITIAL_VISIBILITY, current);
        final SubLObject initial_visibility = (SubLObject)((dhtml_macros.NIL != initial_visibility_tail) ? conses_high.cadr(initial_visibility_tail) : dhtml_macros.$kw67$VISIBLE);
        final SubLObject flow_type_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw87$FLOW_TYPE, current);
        final SubLObject flow_type = (SubLObject)((dhtml_macros.NIL != flow_type_tail) ? conses_high.cadr(flow_type_tail) : dhtml_macros.$kw76$TEXT);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym88$DHTML_SET_VISIBILITY, object_id, initial_visibility, flow_type), (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym89$HTML_FANCY_DIV, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw90$ID, object_id), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10960L)
    public static SubLObject dhtml_potentially_show_switched(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list84);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$4 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list84);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list84);
            if (dhtml_macros.NIL == conses_high.member(current_$4, (SubLObject)dhtml_macros.$list85, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$4 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list84);
        }
        final SubLObject initial_visibility_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw86$INITIAL_VISIBILITY, current);
        final SubLObject initial_visibility = (SubLObject)((dhtml_macros.NIL != initial_visibility_tail) ? conses_high.cadr(initial_visibility_tail) : dhtml_macros.$kw67$VISIBLE);
        final SubLObject flow_type_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw87$FLOW_TYPE, current);
        final SubLObject flow_type = (SubLObject)((dhtml_macros.NIL != flow_type_tail) ? conses_high.cadr(flow_type_tail) : dhtml_macros.$kw76$TEXT);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym92$DHTML_SET_SWITCHED_VISIBILITY, object_id, initial_visibility, flow_type), (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym89$HTML_FANCY_DIV, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw90$ID, object_id), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 11271L)
    public static SubLObject dhtml_potentially_show_text(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list93);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$5 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list93);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list93);
            if (dhtml_macros.NIL == conses_high.member(current_$5, (SubLObject)dhtml_macros.$list94, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$5 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list93);
        }
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw95$STYLE, current);
        final SubLObject style = (SubLObject)((dhtml_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : dhtml_macros.$str96$);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym11$PROGN, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym97$HTML_FANCY_SPAN, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw90$ID, object_id, (SubLObject)dhtml_macros.$kw95$STYLE, style), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 11479L)
    public static SubLObject dhtml_set_switched_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
        if (flow_type == dhtml_macros.UNPROVIDED) {
            flow_type = (SubLObject)dhtml_macros.$kw76$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        dhtml_set_visibility(object_id, visibility, flow_type);
        dhtml_set_visibility(show_id, invert_visibility(visibility), (SubLObject)dhtml_macros.$kw76$TEXT);
        dhtml_set_visibility(hide_id, visibility, (SubLObject)dhtml_macros.$kw76$TEXT);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 12303L)
    public static SubLObject dhtml_set_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        SubLObject visibility = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list99);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list99);
        visibility = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$6 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list99);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list99);
            if (dhtml_macros.NIL == conses_high.member(current_$6, (SubLObject)dhtml_macros.$list100, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$6 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list99);
        }
        final SubLObject link_text_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw101$LINK_TEXT, current);
        final SubLObject link_text = (SubLObject)((dhtml_macros.NIL != link_text_tail) ? conses_high.cadr(link_text_tail) : dhtml_macros.NIL);
        final SubLObject flow_type_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw87$FLOW_TYPE, current);
        final SubLObject flow_type = (SubLObject)((dhtml_macros.NIL != flow_type_tail) ? conses_high.cadr(flow_type_tail) : dhtml_macros.$kw76$TEXT);
        final SubLObject body;
        current = (body = temp);
        final SubLObject href = (SubLObject)dhtml_macros.$sym102$HREF;
        final SubLObject click_action = (SubLObject)dhtml_macros.$sym103$CLICK_ACTION;
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(href, (SubLObject)dhtml_macros.$list105), (SubLObject)ConsesLow.list(click_action, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym106$DHTML_GENERATE_VISIBILITY_SETTER, object_id, visibility, flow_type))), (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw108$HREF, href, (SubLObject)dhtml_macros.$kw109$ONCLICK, click_action), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym110$PWHEN, link_text, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym111$HTML_PRINC, link_text)), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 12879L)
    public static SubLObject dhtml_toggle_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list112);
        object_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$7 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list112);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list112);
            if (dhtml_macros.NIL == conses_high.member(current_$7, (SubLObject)dhtml_macros.$list113, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$7 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list112);
        }
        final SubLObject link_text_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw101$LINK_TEXT, current);
        final SubLObject link_text = (SubLObject)((dhtml_macros.NIL != link_text_tail) ? conses_high.cadr(link_text_tail) : dhtml_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject href = (SubLObject)dhtml_macros.$sym114$HREF;
        final SubLObject click_action = (SubLObject)dhtml_macros.$sym115$CLICK_ACTION;
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(href, (SubLObject)dhtml_macros.$list105), (SubLObject)ConsesLow.list(click_action, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, object_id))), (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw108$HREF, href, (SubLObject)dhtml_macros.$kw109$ONCLICK, click_action), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym110$PWHEN, link_text, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym111$HTML_PRINC, link_text)), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 13460L)
    public static SubLObject dhtml_toggle_class_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list117);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_class = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list117);
        v_class = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$8 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list117);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list117);
            if (dhtml_macros.NIL == conses_high.member(current_$8, (SubLObject)dhtml_macros.$list113, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$8 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list117);
        }
        final SubLObject link_text_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw101$LINK_TEXT, current);
        final SubLObject link_text = (SubLObject)((dhtml_macros.NIL != link_text_tail) ? conses_high.cadr(link_text_tail) : dhtml_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject href = (SubLObject)dhtml_macros.$sym118$HREF;
        final SubLObject click_action = (SubLObject)dhtml_macros.$sym119$CLICK_ACTION;
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(href, (SubLObject)dhtml_macros.$list105), (SubLObject)ConsesLow.list(click_action, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, v_class))), (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw108$HREF, href, (SubLObject)dhtml_macros.$kw109$ONCLICK, click_action), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym110$PWHEN, link_text, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym111$HTML_PRINC, link_text)), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL)), (SubLObject)dhtml_macros.$list91);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14082L)
    public static SubLObject dhtml_visibility_generate_js_for_toggle(final SubLObject object_id) {
        assert dhtml_macros.NIL != Strings.string(object_id) : object_id;
        return Sequences.cconcatenate((SubLObject)dhtml_macros.$str123$toggleVisibility__, new SubLObject[] { object_id, dhtml_macros.$str79$___ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14289L)
    public static SubLObject dhtml_visibility_generate_js_for_class_toggle(final SubLObject v_class, SubLObject show_or_hide) {
        if (show_or_hide == dhtml_macros.UNPROVIDED) {
            show_or_hide = (SubLObject)dhtml_macros.NIL;
        }
        assert dhtml_macros.NIL != Strings.string(v_class) : v_class;
        final SubLObject visibility_arg = (SubLObject)((show_or_hide == dhtml_macros.$kw124$SHOW) ? dhtml_macros.$str125$__true : ((show_or_hide == dhtml_macros.$kw126$HIDE) ? dhtml_macros.$str127$__false : dhtml_macros.$str96$));
        return Sequences.cconcatenate((SubLObject)dhtml_macros.$str128$toggleClassVisibility__, new SubLObject[] { v_class, dhtml_macros.$str129$_, visibility_arg, dhtml_macros.$str130$__ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14670L)
    public static SubLObject dhtml_switch_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        SubLObject show_link_code = (SubLObject)dhtml_macros.NIL;
        SubLObject hide_link_code = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list131);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list131);
        show_link_code = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list131);
        hide_link_code = current.first();
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject show_id = (SubLObject)dhtml_macros.$sym132$SHOW_ID;
            final SubLObject show_action = (SubLObject)dhtml_macros.$sym133$SHOW_ACTION;
            final SubLObject hide_id = (SubLObject)dhtml_macros.$sym134$HIDE_ID;
            final SubLObject hide_action = (SubLObject)dhtml_macros.$sym135$HIDE_ACTION;
            return (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym136$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(show_id, show_action, hide_id, hide_action), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_id), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym138$DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym138$DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list131);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 15515L)
    public static SubLObject dhtml_switch_class_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_class = (SubLObject)dhtml_macros.NIL;
        SubLObject show_link_code = (SubLObject)dhtml_macros.NIL;
        SubLObject hide_link_code = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list139);
        object_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list139);
        show_link_code = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list139);
        hide_link_code = current.first();
        current = current.rest();
        final SubLObject initially_hiddenP = (SubLObject)(current.isCons() ? current.first() : dhtml_macros.T);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dhtml_macros.$list139);
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject show_id = (SubLObject)dhtml_macros.$sym140$SHOW_ID;
            final SubLObject show_action = (SubLObject)dhtml_macros.$sym141$SHOW_ACTION;
            final SubLObject hide_id = (SubLObject)dhtml_macros.$sym142$HIDE_ID;
            final SubLObject hide_action = (SubLObject)dhtml_macros.$sym143$HIDE_ACTION;
            final SubLObject show_style = (SubLObject)dhtml_macros.$sym144$SHOW_STYLE;
            final SubLObject hide_style = (SubLObject)dhtml_macros.$sym145$HIDE_STYLE;
            return (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym136$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(show_id, show_action, hide_id, hide_action), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_class), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(show_style, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym147$FIF, initially_hiddenP, (SubLObject)dhtml_macros.$list148)), (SubLObject)ConsesLow.list(hide_style, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym147$FIF, initially_hiddenP, (SubLObject)dhtml_macros.$list149))), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym138$DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code, show_style), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym138$DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code, hide_style)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list139);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 16668L)
    public static SubLObject dhtml_visibility_generate_ids_and_actions(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_action = dhtml_switch_visibility_generate_show_action(object_id, show_id, hide_id);
        final SubLObject hide_action = dhtml_switch_visibility_generate_hide_action(object_id, show_id, hide_id);
        return Values.values(show_id, show_action, hide_id, hide_action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17164L)
    public static SubLObject dhtml_class_visibility_generate_ids_and_actions(final SubLObject object_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_class_visibility_generate_switch_ids(object_class);
        final SubLObject hide_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_action = dhtml_switch_class_visibility_generate_show_action(object_class, show_id, hide_id);
        final SubLObject hide_action = dhtml_switch_class_visibility_generate_hide_action(object_class, show_id, hide_id);
        return Values.values(show_id, show_action, hide_id, hide_action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17684L)
    public static SubLObject dhtml_visibility_declare_dom_objects(final SubLObject show_id, final SubLObject hide_id) {
        dhtml_set_visibility(show_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT);
        dhtml_set_visibility(hide_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17925L)
    public static SubLObject dhtml_switch_visiblity_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject object_id = (SubLObject)dhtml_macros.NIL;
        SubLObject onclick_action = (SubLObject)dhtml_macros.NIL;
        SubLObject link_code = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list154);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list154);
        onclick_action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list154);
        link_code = current.first();
        current = current.rest();
        final SubLObject style = (SubLObject)(current.isCons() ? current.first() : dhtml_macros.$str96$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dhtml_macros.$list154);
        current = current.rest();
        if (dhtml_macros.NIL == current) {
            final SubLObject href = (SubLObject)dhtml_macros.$sym155$HREF;
            return (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(href, (SubLObject)dhtml_macros.$list105)), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym156$DHTML_POTENTIALLY_SHOW_TEXT, (SubLObject)ConsesLow.list(object_id, (SubLObject)dhtml_macros.$kw95$STYLE, style), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym157$HTML_SMALL, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw108$HREF, href, (SubLObject)dhtml_macros.$kw109$ONCLICK, onclick_action), link_code))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list154);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18327L)
    public static SubLObject dhtml_switch_visibility_generate_show_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
        return Sequences.cconcatenate(dhtml_generate_visibility_setter(object_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw73$PARAGRAPH), new SubLObject[] { dhtml_generate_visibility_setter(show_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT), dhtml_generate_visibility_setter(hide_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18658L)
    public static SubLObject dhtml_switch_visibility_generate_hide_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
        return Sequences.cconcatenate(dhtml_generate_visibility_setter(object_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw73$PARAGRAPH), new SubLObject[] { dhtml_generate_visibility_setter(show_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT), dhtml_generate_visibility_setter(hide_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18976L)
    public static SubLObject dhtml_switch_class_visibility_generate_show_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
        return Sequences.cconcatenate(dhtml_generate_class_visibility_toggle(object_class, (SubLObject)dhtml_macros.$kw124$SHOW), new SubLObject[] { dhtml_generate_visibility_setter(show_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT), dhtml_generate_visibility_setter(hide_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 19295L)
    public static SubLObject dhtml_switch_class_visibility_generate_hide_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
        return Sequences.cconcatenate(dhtml_generate_class_visibility_toggle(object_class, (SubLObject)dhtml_macros.$kw126$HIDE), new SubLObject[] { dhtml_generate_visibility_setter(show_id, (SubLObject)dhtml_macros.$kw67$VISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT), dhtml_generate_visibility_setter(hide_id, (SubLObject)dhtml_macros.$kw68$INVISIBLE, (SubLObject)dhtml_macros.$kw76$TEXT) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 19615L)
    public static SubLObject dhtml_change_visibile_section(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list158);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$9 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list158);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list158);
            if (dhtml_macros.NIL == conses_high.member(current_$9, (SubLObject)dhtml_macros.$list159, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$9 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list158);
        }
        final SubLObject show_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw124$SHOW, current);
        final SubLObject show = (SubLObject)((dhtml_macros.NIL != show_tail) ? conses_high.cadr(show_tail) : dhtml_macros.NIL);
        final SubLObject hide_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw126$HIDE, current);
        final SubLObject hide = (SubLObject)((dhtml_macros.NIL != hide_tail) ? conses_high.cadr(hide_tail) : dhtml_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym107$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$kw108$HREF, (SubLObject)dhtml_macros.$list160, (SubLObject)dhtml_macros.$kw109$ONCLICK, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym9$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, show, hide))), ConsesLow.append(body, (SubLObject)dhtml_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 20045L)
    public static SubLObject dhtml_change_visible_section_onclick(final SubLObject show, final SubLObject hide) {
        return Sequences.cconcatenate((SubLObject)dhtml_macros.$str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(show), dhtml_macros.$str163$___block___setVisibility__, format_nil.format_nil_a_no_copy(hide), dhtml_macros.$str164$___none___ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21088L)
    public static SubLObject dhtml_switch_visibility_links(final SubLObject object_id, final SubLObject show_link_text, final SubLObject hide_link_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                html_utilities.html_princ(show_link_text);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                html_utilities.html_princ(hide_link_text);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21310L)
    public static SubLObject dhtml_switch_visibility_links_plus_minus(final SubLObject object_id, final SubLObject text) {
        return dhtml_switch_visibility_links_icons(object_id, text, (SubLObject)dhtml_macros.$kw178$SQUARE_MINUS, (SubLObject)dhtml_macros.$kw180$SQUARE_PLUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21476L)
    public static SubLObject dhtml_switch_visibility_links_arrows(final SubLObject object_id, final SubLObject text) {
        return dhtml_switch_visibility_links_icons(object_id, text, (SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V, (SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21646L)
    public static SubLObject dhtml_switch_class_visibility_links_arrows(final SubLObject object_class, final SubLObject text, SubLObject initially_hiddenP) {
        if (initially_hiddenP == dhtml_macros.UNPROVIDED) {
            initially_hiddenP = (SubLObject)dhtml_macros.T;
        }
        return dhtml_switch_class_visibility_links_icons(object_class, text, (SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V, (SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V, initially_hiddenP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21904L)
    public static SubLObject dhtml_switch_visibility_links_icons(final SubLObject object_id, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_princ(text);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22213L)
    public static SubLObject dhtml_switch_class_visibility_links_icons(final SubLObject object_class, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon, SubLObject initially_hiddenP) {
        if (initially_hiddenP == dhtml_macros.UNPROVIDED) {
            initially_hiddenP = (SubLObject)dhtml_macros.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_class_visibility_generate_ids_and_actions(object_class);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject show_style = (SubLObject)((dhtml_macros.NIL != initially_hiddenP) ? dhtml_macros.$str185$display_inline : dhtml_macros.$str186$display_none);
        final SubLObject hide_style = (SubLObject)((dhtml_macros.NIL != initially_hiddenP) ? dhtml_macros.$str186$display_none : dhtml_macros.$str185$display_inline);
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(show_style);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(hide_style);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_princ(text);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22599L)
    public static SubLObject dhtml_switch_visibility_links_arrows_and_text(final SubLObject object_id, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_princ(text);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_princ(text);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22972L)
    public static SubLObject dhtml_switch_visibility_links_left_arrows(final SubLObject object_id, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ(text);
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw168$LEFT_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw184$CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw168$LEFT_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw184$CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23241L)
    public static SubLObject dhtml_switch_visibility_links_up_arrows(final SubLObject object_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
        final SubLObject show_action = thread.secondMultipleValue();
        final SubLObject hide_id = thread.thirdMultipleValue();
        final SubLObject hide_action = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != show_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(show_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw184$CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        href = dhtml_macros.$dhtml_blank_href_js$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        if (dhtml_macros.NIL != hide_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)dhtml_macros.$str96$);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(hide_action);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw173$UP_TRIANGLE_V));
                final SubLObject align = (SubLObject)dhtml_macros.$kw184$CENTER;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw173$UP_TRIANGLE_V);
                final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                if (dhtml_macros.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                if (dhtml_macros.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23485L)
    public static SubLObject dhtml_switch_visibility_no_arrow() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)dhtml_macros.$kw175$BLANK_TRIANGLE));
        final SubLObject align = (SubLObject)dhtml_macros.$kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)dhtml_macros.$kw175$BLANK_TRIANGLE);
        final SubLObject border = (SubLObject)dhtml_macros.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        if (dhtml_macros.NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        if (dhtml_macros.NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        if (dhtml_macros.NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_utilities.html_glyph((SubLObject)dhtml_macros.$kw187$NBSP, (SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23933L)
    public static SubLObject get_next_html_element_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = dhtml_macros.$html_element_id$.getDynamicValue(thread);
        dhtml_macros.$html_element_id$.setDynamicValue(Numbers.add(dhtml_macros.$html_element_id$.getDynamicValue(thread), (SubLObject)dhtml_macros.ONE_INTEGER), thread);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24057L)
    public static SubLObject basic_ajax_scripts() {
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw188$CONNECTION);
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24173L)
    public static SubLObject with_delayed_html_load_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym104$CLET, (SubLObject)dhtml_macros.$list189, (SubLObject)dhtml_macros.$list190, (SubLObject)dhtml_macros.$list191, ConsesLow.append(body, (SubLObject)dhtml_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24884L)
    public static SubLObject js_delayed_load(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject handler = (SubLObject)dhtml_macros.NIL;
        SubLObject args = (SubLObject)dhtml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list193);
        handler = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list193);
        args = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dhtml_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dhtml_macros.NIL;
        SubLObject current_$32 = (SubLObject)dhtml_macros.NIL;
        while (dhtml_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list193);
            current_$32 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dhtml_macros.$list193);
            if (dhtml_macros.NIL == conses_high.member(current_$32, (SubLObject)dhtml_macros.$list194, (SubLObject)dhtml_macros.UNPROVIDED, (SubLObject)dhtml_macros.UNPROVIDED)) {
                bad = (SubLObject)dhtml_macros.T;
            }
            if (current_$32 == dhtml_macros.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dhtml_macros.NIL != bad && dhtml_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dhtml_macros.$list193);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw195$MESSAGE, current);
        final SubLObject message = (SubLObject)((dhtml_macros.NIL != message_tail) ? conses_high.cadr(message_tail) : dhtml_macros.$str96$);
        final SubLObject tag_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw196$TAG, current);
        final SubLObject tag = (SubLObject)((dhtml_macros.NIL != tag_tail) ? conses_high.cadr(tag_tail) : dhtml_macros.$str197$span);
        final SubLObject delay_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw198$DELAY, current);
        final SubLObject delay = (SubLObject)((dhtml_macros.NIL != delay_tail) ? conses_high.cadr(delay_tail) : dhtml_macros.$int199$50);
        return (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$sym200$JS_DELAYED_LOAD_INT, (SubLObject)ConsesLow.listS((SubLObject)dhtml_macros.$sym201$LIST, (SubLObject)dhtml_macros.$kw202$HANDLER, handler, (SubLObject)dhtml_macros.$kw203$ARGS, args, ConsesLow.append((SubLObject)((dhtml_macros.NIL != message) ? ConsesLow.list((SubLObject)dhtml_macros.$kw195$MESSAGE, message) : dhtml_macros.NIL), (SubLObject)((dhtml_macros.NIL != tag) ? ConsesLow.list((SubLObject)dhtml_macros.$kw196$TAG, tag) : dhtml_macros.NIL), (SubLObject)((dhtml_macros.NIL != delay) ? ConsesLow.list((SubLObject)dhtml_macros.$kw198$DELAY, delay) : dhtml_macros.NIL), (SubLObject)dhtml_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 25713L)
    public static SubLObject js_delayed_load_int(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject handler_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw202$HANDLER, plist);
        final SubLObject handler = (SubLObject)((dhtml_macros.NIL != handler_tail) ? conses_high.cadr(handler_tail) : dhtml_macros.NIL);
        final SubLObject args_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw203$ARGS, plist);
        final SubLObject args = (SubLObject)((dhtml_macros.NIL != args_tail) ? conses_high.cadr(args_tail) : dhtml_macros.NIL);
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw195$MESSAGE, plist);
        final SubLObject message = (SubLObject)((dhtml_macros.NIL != message_tail) ? conses_high.cadr(message_tail) : dhtml_macros.NIL);
        final SubLObject tag_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw196$TAG, plist);
        final SubLObject tag = (SubLObject)((dhtml_macros.NIL != tag_tail) ? conses_high.cadr(tag_tail) : dhtml_macros.NIL);
        final SubLObject delay_tail = cdestructuring_bind.property_list_member((SubLObject)dhtml_macros.$kw198$DELAY, plist);
        final SubLObject delay = (SubLObject)((dhtml_macros.NIL != delay_tail) ? conses_high.cadr(delay_tail) : dhtml_macros.NIL);
        final SubLObject url = make_url_from_handler_and_args(handler, args);
        final SubLObject elt_id = Sequences.cconcatenate((SubLObject)dhtml_macros.$str205$cyc_elt_, format_nil.format_nil_a_no_copy(dhtml_macros.$html_element_id$.getDynamicValue(thread)));
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)dhtml_macros.$str206$__A_id___A___A___A_, new SubLObject[] { tag, elt_id, message, tag });
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)dhtml_macros.$str207$_script_type__text_javascript__tr, new SubLObject[] { url, elt_id, delay, elt_id, message });
        dhtml_macros.$html_element_id$.setDynamicValue(Numbers.add(dhtml_macros.$html_element_id$.getDynamicValue(thread), (SubLObject)dhtml_macros.ONE_INTEGER), thread);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 26365L)
    public static SubLObject make_url_from_handler_and_args(final SubLObject handler, final SubLObject arg_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = Sequences.cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[] { dhtml_macros.$str208$_, string_utilities.to_string(handler) });
        SubLObject cdolist_list_var = arg_alist;
        SubLObject cons = (SubLObject)dhtml_macros.NIL;
        cons = cdolist_list_var.first();
        while (dhtml_macros.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)dhtml_macros.NIL;
            SubLObject value = (SubLObject)dhtml_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dhtml_macros.$list209);
            key = current.first();
            current = (value = current.rest());
            output_string = Sequences.cconcatenate(output_string, new SubLObject[] { dhtml_macros.$str210$_, key, dhtml_macros.$str211$_, cb_utilities.cb_term_identifier(value) });
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 27009L)
    public static SubLObject init_kea_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)dhtml_macros.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)dhtml_macros.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), dhtml_macros.$kea_set_focal_tool$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)dhtml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 27116L)
    public static SubLObject html_basic_cb_scripts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyc_file_dependencies.css((SubLObject)dhtml_macros.$kw213$MENU_CSS);
        cyc_file_dependencies.css((SubLObject)dhtml_macros.$kw214$CB_CYC);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw215$SELECTOR);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw216$EVENT_DELEGATION);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw217$CONTAINER_CORE);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw218$MENU);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw219$OVERLIB);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw220$CB);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw221$CB_INLINE_EDIT);
        cyc_file_dependencies.javascript((SubLObject)dhtml_macros.$kw222$CYCJS_KEA_SESSION_BUS);
        html_utilities.html_source_readability_terpri((SubLObject)dhtml_macros.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)dhtml_macros.$str223$__yui_skin_sam__editContainer__yu);
        html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
        init_kea_support();
        return (SubLObject)dhtml_macros.NIL;
    }
    
    public static SubLObject declare_dhtml_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_wrapper", "DHTML-DOM-WRAPPER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_lexical_scripts", "DHTML-LEXICAL-SCRIPTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "flow_type_p", "FLOW-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "visibility_p", "VISIBILITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "invert_visibility", "INVERT-VISIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_generate_class_visibility_toggle", "DHTML-GENERATE-CLASS-VISIBILITY-TOGGLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_class_visibility_generate_switch_ids", "DHTML-CLASS-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_class_visibility_generate_show_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_class_visibility_generate_hide_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_toggle_class_visibility_link", "DHTML-TOGGLE-CLASS-VISIBILITY-LINK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_js_for_class_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_class_visibility_links_with_code", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_class_visibility_generate_ids_and_actions", "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_class_visibility_generate_show_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_class_visibility_generate_hide_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_class_visibility_links_arrows", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ARROWS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_class_visibility_links_icons", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ICONS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dhtml_macros", "js_delayed_load", "JS-DELAYED-LOAD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "init_kea_support", "INIT-KEA-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dhtml_macros", "html_basic_cb_scripts", "HTML-BASIC-CB-SCRIPTS", 0, 0, false);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    public static SubLObject init_dhtml_macros_file() {
        dhtml_macros.$dhtml_css_head$ = SubLFiles.defconstant("*DHTML-CSS-HEAD*", (SubLObject)dhtml_macros.$str0$_style);
        dhtml_macros.$dhtml_css_type$ = SubLFiles.defconstant("*DHTML-CSS-TYPE*", (SubLObject)dhtml_macros.$str1$_type_);
        dhtml_macros.$dhtml_css_media$ = SubLFiles.defconstant("*DHTML-CSS-MEDIA*", (SubLObject)dhtml_macros.$str2$_media_);
        dhtml_macros.$dhtml_css_tail$ = SubLFiles.defconstant("*DHTML-CSS-TAIL*", (SubLObject)dhtml_macros.$str3$__style_);
        dhtml_macros.$dhtml_dom_position$ = SubLFiles.defconstant("*DHTML-DOM-POSITION*", (SubLObject)dhtml_macros.$str16$position);
        dhtml_macros.$dhtml_dom_top$ = SubLFiles.defconstant("*DHTML-DOM-TOP*", (SubLObject)dhtml_macros.$str17$top);
        dhtml_macros.$dhtml_dom_bottom$ = SubLFiles.defconstant("*DHTML-DOM-BOTTOM*", (SubLObject)dhtml_macros.$str18$bottom);
        dhtml_macros.$dhtml_dom_right$ = SubLFiles.defconstant("*DHTML-DOM-RIGHT*", (SubLObject)dhtml_macros.$str19$right);
        dhtml_macros.$dhtml_dom_left$ = SubLFiles.defconstant("*DHTML-DOM-LEFT*", (SubLObject)dhtml_macros.$str20$left);
        dhtml_macros.$dhtml_dom_visibility$ = SubLFiles.defconstant("*DHTML-DOM-VISIBILITY*", (SubLObject)dhtml_macros.$str21$visibility);
        dhtml_macros.$dhtml_dom_display$ = SubLFiles.defconstant("*DHTML-DOM-DISPLAY*", (SubLObject)dhtml_macros.$str22$display);
        dhtml_macros.$dhtml_dom_height$ = SubLFiles.defconstant("*DHTML-DOM-HEIGHT*", (SubLObject)dhtml_macros.$str23$height);
        dhtml_macros.$dhtml_dom_width$ = SubLFiles.defconstant("*DHTML-DOM-WIDTH*", (SubLObject)dhtml_macros.$str24$width);
        dhtml_macros.$dhtml_blank_href_js$ = SubLFiles.defconstant("*DHTML-BLANK-HREF-JS*", (SubLObject)dhtml_macros.$str61$javascript_void____);
        dhtml_macros.$html_element_id$ = SubLFiles.defparameter("*HTML-ELEMENT-ID*", (SubLObject)dhtml_macros.ZERO_INTEGER);
        dhtml_macros.$js_load_later$ = SubLFiles.deflexical("*JS-LOAD-LATER*", (SubLObject)dhtml_macros.$str192$_script_type__text_javascript__fu);
        dhtml_macros.$kea_set_focal_tool$ = SubLFiles.deflexical("*KEA-SET-FOCAL-TOOL*", (SubLObject)dhtml_macros.$str212$_if__isKeaHosted________var_keaBu);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    public static SubLObject setup_dhtml_macros_file() {
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym26$DHTML_DOM_WRAPPER_PREAMBLE, (SubLObject)dhtml_macros.$sym28$DHTML_DOM_WRAPPER);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym30$DHTML_DOM_WRAPPER_POSTAMBLE, (SubLObject)dhtml_macros.$sym28$DHTML_DOM_WRAPPER);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE, (SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE, (SubLObject)dhtml_macros.$sym35$DHTML_DOM_ATTRIBUTE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym92$DHTML_SET_SWITCHED_VISIBILITY, (SubLObject)dhtml_macros.$sym98$DHTML_POTENTIALLY_SHOW_SWITCHED);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, (SubLObject)dhtml_macros.$sym121$DHTML_TOGGLE_VISIBILITY_LINK);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, (SubLObject)dhtml_macros.$sym121$DHTML_TOGGLE_VISIBILITY_LINK);
        meta_macros.declare_indention_pattern((SubLObject)dhtml_macros.$sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, (SubLObject)dhtml_macros.$list151);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, (SubLObject)dhtml_macros.$sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, (SubLObject)dhtml_macros.$sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, (SubLObject)dhtml_macros.$sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym138$DHTML_SWITCH_VISIBLITY_LINK, (SubLObject)dhtml_macros.$sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, (SubLObject)dhtml_macros.$sym162$DHTML_CHANGE_VISIBILE_SECTION);
        Hashtables.sethash((SubLObject)dhtml_macros.$kw165$RIGHT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str166$cyc_right_triangle_violet_gif, (SubLObject)dhtml_macros.$str167$_Show_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw168$LEFT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str169$cyc_left_triangle_violet_gif, (SubLObject)dhtml_macros.$str167$_Show_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw170$DOWN_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str171$cyc_down_triangle_violet_gif, (SubLObject)dhtml_macros.$str172$_Hide_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw173$UP_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str174$cyc_up_triangle_violet_gif, (SubLObject)dhtml_macros.$str172$_Hide_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw175$BLANK_TRIANGLE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str176$cyc_no_triangle_violet_gif, (SubLObject)dhtml_macros.$str177$__));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw178$SQUARE_MINUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str179$square_minus_gif, (SubLObject)dhtml_macros.$str167$_Show_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw180$SQUARE_PLUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str181$square_plus_gif, (SubLObject)dhtml_macros.$str172$_Hide_));
        Hashtables.sethash((SubLObject)dhtml_macros.$kw182$SQUARE_BLANK, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)dhtml_macros.$str183$square_blank_gif, (SubLObject)dhtml_macros.$str177$__));
        access_macros.register_macro_helper((SubLObject)dhtml_macros.$sym200$JS_DELAYED_LOAD_INT, (SubLObject)dhtml_macros.$sym204$JS_DELAYED_LOAD);
        return (SubLObject)dhtml_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_dhtml_macros_file();
    }
    
    public void initializeVariables() {
        init_dhtml_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_dhtml_macros_file();
    }
    
    static {
        me = (SubLFile)new dhtml_macros();
        dhtml_macros.$dhtml_css_head$ = null;
        dhtml_macros.$dhtml_css_type$ = null;
        dhtml_macros.$dhtml_css_media$ = null;
        dhtml_macros.$dhtml_css_tail$ = null;
        dhtml_macros.$dhtml_dom_position$ = null;
        dhtml_macros.$dhtml_dom_top$ = null;
        dhtml_macros.$dhtml_dom_bottom$ = null;
        dhtml_macros.$dhtml_dom_right$ = null;
        dhtml_macros.$dhtml_dom_left$ = null;
        dhtml_macros.$dhtml_dom_visibility$ = null;
        dhtml_macros.$dhtml_dom_display$ = null;
        dhtml_macros.$dhtml_dom_height$ = null;
        dhtml_macros.$dhtml_dom_width$ = null;
        dhtml_macros.$dhtml_blank_href_js$ = null;
        dhtml_macros.$html_element_id$ = null;
        dhtml_macros.$js_load_later$ = null;
        dhtml_macros.$kea_set_focal_tool$ = null;
        $str0$_style = SubLObjectFactory.makeString("<style");
        $str1$_type_ = SubLObjectFactory.makeString(" type=");
        $str2$_media_ = SubLObjectFactory.makeString(" media=");
        $str3$__style_ = SubLObjectFactory.makeString("</style>");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeString("text/css")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEDIA"), (SubLObject)SubLObjectFactory.makeString("screen"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str5$text_css = SubLObjectFactory.makeString("text/css");
        $str6$screen = SubLObjectFactory.makeString("screen");
        $sym7$HTML_QUOTED_ATTRIBUTE = SubLObjectFactory.makeSymbol("HTML-QUOTED-ATTRIBUTE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-CSS-TYPE*"));
        $sym9$HTML_MARKUP = SubLObjectFactory.makeSymbol("HTML-MARKUP");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-CSS-MEDIA*"));
        $sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym12$HTML_MARKUP_WRAPPER = SubLObjectFactory.makeSymbol("HTML-MARKUP-WRAPPER");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-CSS-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*DHTML-CSS-TAIL*"));
        $sym14$HTML_MARKUP_BODY = SubLObjectFactory.makeSymbol("HTML-MARKUP-BODY");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TERPRI")));
        $str16$position = SubLObjectFactory.makeString("position");
        $str17$top = SubLObjectFactory.makeString("top");
        $str18$bottom = SubLObjectFactory.makeString("bottom");
        $str19$right = SubLObjectFactory.makeString("right");
        $str20$left = SubLObjectFactory.makeString("left");
        $str21$visibility = SubLObjectFactory.makeString("visibility");
        $str22$display = SubLObjectFactory.makeString("display");
        $str23$height = SubLObjectFactory.makeString("height");
        $str24$width = SubLObjectFactory.makeString("width");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym26$DHTML_DOM_WRAPPER_PREAMBLE = SubLObjectFactory.makeSymbol("DHTML-DOM-WRAPPER-PREAMBLE");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE")));
        $sym28$DHTML_DOM_WRAPPER = SubLObjectFactory.makeSymbol("DHTML-DOM-WRAPPER");
        $str29$__A__ = SubLObjectFactory.makeString("#~A {");
        $sym30$DHTML_DOM_WRAPPER_POSTAMBLE = SubLObjectFactory.makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE");
        $str31$__ = SubLObjectFactory.makeString(" }");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE = SubLObjectFactory.makeSymbol("DHTML-DOM-ATTRIBUTE-PREAMBLE");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE")));
        $sym35$DHTML_DOM_ATTRIBUTE = SubLObjectFactory.makeSymbol("DHTML-DOM-ATTRIBUTE");
        $str36$__A_ = SubLObjectFactory.makeString(" ~A:");
        $sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE = SubLObjectFactory.makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE");
        $str38$_ = SubLObjectFactory.makeString(";");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TOP"), SubLObjectFactory.makeSymbol("BOTTOM"), SubLObjectFactory.makeSymbol("RIGHT"), SubLObjectFactory.makeSymbol("LEFT"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("POSITION"), SubLObjectFactory.makeSymbol("VISIBILITY"), SubLObjectFactory.makeSymbol("DISPLAY") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY")));
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TOP"), SubLObjectFactory.makeKeyword("BOTTOM"), SubLObjectFactory.makeKeyword("RIGHT"), SubLObjectFactory.makeKeyword("LEFT"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("POSITION"), SubLObjectFactory.makeKeyword("VISIBILITY"), SubLObjectFactory.makeKeyword("DISPLAY") });
        $kw41$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw42$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw43$BOTTOM = SubLObjectFactory.makeKeyword("BOTTOM");
        $kw44$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw45$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw46$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw47$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw48$POSITION = SubLObjectFactory.makeKeyword("POSITION");
        $kw49$VISIBILITY = SubLObjectFactory.makeKeyword("VISIBILITY");
        $kw50$DISPLAY = SubLObjectFactory.makeKeyword("DISPLAY");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-POSITION*"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-TOP*"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-BOTTOM*"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-LEFT*"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-RIGHT*"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-VISIBILITY*"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-DISPLAY*"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-HEIGHT*"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-DOM-WIDTH*"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TERPRI"));
        $str61$javascript_void____ = SubLObjectFactory.makeString("javascript:void('')");
        $kw62$FINDDOM = SubLObjectFactory.makeKeyword("FINDDOM");
        $kw63$CONSTANT_CREATION = SubLObjectFactory.makeKeyword("CONSTANT-CREATION");
        $kw64$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VISIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("INVISIBLE"));
        $kw67$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw68$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $str69$_S_was_not_a_known_visibility_p = SubLObjectFactory.makeString("~S was not a known visibility-p");
        $sym70$VISIBILITY_P = SubLObjectFactory.makeSymbol("VISIBILITY-P");
        $sym71$FLOW_TYPE_P = SubLObjectFactory.makeSymbol("FLOW-TYPE-P");
        $str72$none = SubLObjectFactory.makeString("none");
        $kw73$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $str74$block = SubLObjectFactory.makeString("block");
        $str75$inline = SubLObjectFactory.makeString("inline");
        $kw76$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str77$setVisibility__ = SubLObjectFactory.makeString("setVisibility('");
        $str78$___ = SubLObjectFactory.makeString("','");
        $str79$___ = SubLObjectFactory.makeString("');");
        $sym80$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str81$_show_button = SubLObjectFactory.makeString("_show_button");
        $str82$_hide_button = SubLObjectFactory.makeString("_hide_button");
        $sym83$WHITESPACEP = SubLObjectFactory.makeSymbol("WHITESPACEP");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("VISIBLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLOW-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"));
        $kw86$INITIAL_VISIBILITY = SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY");
        $kw87$FLOW_TYPE = SubLObjectFactory.makeKeyword("FLOW-TYPE");
        $sym88$DHTML_SET_VISIBILITY = SubLObjectFactory.makeSymbol("DHTML-SET-VISIBILITY");
        $sym89$HTML_FANCY_DIV = SubLObjectFactory.makeSymbol("HTML-FANCY-DIV");
        $kw90$ID = SubLObjectFactory.makeKeyword("ID");
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));
        $sym92$DHTML_SET_SWITCHED_VISIBILITY = SubLObjectFactory.makeSymbol("DHTML-SET-SWITCHED-VISIBILITY");
        $list93 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"));
        $kw95$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $str96$ = SubLObjectFactory.makeString("");
        $sym97$HTML_FANCY_SPAN = SubLObjectFactory.makeSymbol("HTML-FANCY-SPAN");
        $sym98$DHTML_POTENTIALLY_SHOW_SWITCHED = SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("VISIBILITY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLOW-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"));
        $kw101$LINK_TEXT = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $sym102$HREF = SubLObjectFactory.makeUninternedSymbol("HREF");
        $sym103$CLICK_ACTION = SubLObjectFactory.makeUninternedSymbol("CLICK-ACTION");
        $sym104$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DHTML-BLANK-HREF-JS*"));
        $sym106$DHTML_GENERATE_VISIBILITY_SETTER = SubLObjectFactory.makeSymbol("DHTML-GENERATE-VISIBILITY-SETTER");
        $sym107$HTML_FANCY_ANCHOR = SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR");
        $kw108$HREF = SubLObjectFactory.makeKeyword("HREF");
        $kw109$ONCLICK = SubLObjectFactory.makeKeyword("ONCLICK");
        $sym110$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym111$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"));
        $sym114$HREF = SubLObjectFactory.makeUninternedSymbol("HREF");
        $sym115$CLICK_ACTION = SubLObjectFactory.makeUninternedSymbol("CLICK-ACTION");
        $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE = SubLObjectFactory.makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym118$HREF = SubLObjectFactory.makeUninternedSymbol("HREF");
        $sym119$CLICK_ACTION = SubLObjectFactory.makeUninternedSymbol("CLICK-ACTION");
        $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE = SubLObjectFactory.makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE");
        $sym121$DHTML_TOGGLE_VISIBILITY_LINK = SubLObjectFactory.makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");
        $sym122$STRING = SubLObjectFactory.makeSymbol("STRING");
        $str123$toggleVisibility__ = SubLObjectFactory.makeString("toggleVisibility('");
        $kw124$SHOW = SubLObjectFactory.makeKeyword("SHOW");
        $str125$__true = SubLObjectFactory.makeString(", true");
        $kw126$HIDE = SubLObjectFactory.makeKeyword("HIDE");
        $str127$__false = SubLObjectFactory.makeString(", false");
        $str128$toggleClassVisibility__ = SubLObjectFactory.makeString("toggleClassVisibility('");
        $str129$_ = SubLObjectFactory.makeString("'");
        $str130$__ = SubLObjectFactory.makeString(");");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-LINK-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("HIDE-LINK-CODE"));
        $sym132$SHOW_ID = SubLObjectFactory.makeUninternedSymbol("SHOW-ID");
        $sym133$SHOW_ACTION = SubLObjectFactory.makeUninternedSymbol("SHOW-ACTION");
        $sym134$HIDE_ID = SubLObjectFactory.makeUninternedSymbol("HIDE-ID");
        $sym135$HIDE_ACTION = SubLObjectFactory.makeUninternedSymbol("HIDE-ACTION");
        $sym136$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS = SubLObjectFactory.makeSymbol("DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS");
        $sym138$DHTML_SWITCH_VISIBLITY_LINK = SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBLITY-LINK");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-LINK-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("HIDE-LINK-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALLY-HIDDEN?"), (SubLObject)dhtml_macros.T));
        $sym140$SHOW_ID = SubLObjectFactory.makeUninternedSymbol("SHOW-ID");
        $sym141$SHOW_ACTION = SubLObjectFactory.makeUninternedSymbol("SHOW-ACTION");
        $sym142$HIDE_ID = SubLObjectFactory.makeUninternedSymbol("HIDE-ID");
        $sym143$HIDE_ACTION = SubLObjectFactory.makeUninternedSymbol("HIDE-ACTION");
        $sym144$SHOW_STYLE = SubLObjectFactory.makeUninternedSymbol("SHOW-STYLE");
        $sym145$HIDE_STYLE = SubLObjectFactory.makeUninternedSymbol("HIDE-STYLE");
        $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS = SubLObjectFactory.makeSymbol("DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS");
        $sym147$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("display:inline"), (SubLObject)SubLObjectFactory.makeString("display:none"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("display:none"), (SubLObject)SubLObjectFactory.makeString("display:inline"));
        $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE = SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE = SubLObjectFactory.makeSymbol("DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");
        $sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS = SubLObjectFactory.makeSymbol("DHTML-VISIBILITY-DECLARE-DOM-OBJECTS");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ONCLICK-ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeString("")));
        $sym155$HREF = SubLObjectFactory.makeUninternedSymbol("HREF");
        $sym156$DHTML_POTENTIALLY_SHOW_TEXT = SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW-TEXT");
        $sym157$HTML_SMALL = SubLObjectFactory.makeSymbol("HTML-SMALL");
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW"), (SubLObject)SubLObjectFactory.makeSymbol("HIDE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW"), (SubLObject)SubLObjectFactory.makeKeyword("HIDE"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVASCRIPT-VOID-URL")));
        $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK = SubLObjectFactory.makeSymbol("DHTML-CHANGE-VISIBLE-SECTION-ONCLICK");
        $sym162$DHTML_CHANGE_VISIBILE_SECTION = SubLObjectFactory.makeSymbol("DHTML-CHANGE-VISIBILE-SECTION");
        $str163$___block___setVisibility__ = SubLObjectFactory.makeString("','block');setVisibility('");
        $str164$___none___ = SubLObjectFactory.makeString("','none');");
        $kw165$RIGHT_TRIANGLE_V = SubLObjectFactory.makeKeyword("RIGHT-TRIANGLE-V");
        $str166$cyc_right_triangle_violet_gif = SubLObjectFactory.makeString("cyc-right-triangle-violet.gif");
        $str167$_Show_ = SubLObjectFactory.makeString("[Show]");
        $kw168$LEFT_TRIANGLE_V = SubLObjectFactory.makeKeyword("LEFT-TRIANGLE-V");
        $str169$cyc_left_triangle_violet_gif = SubLObjectFactory.makeString("cyc-left-triangle-violet.gif");
        $kw170$DOWN_TRIANGLE_V = SubLObjectFactory.makeKeyword("DOWN-TRIANGLE-V");
        $str171$cyc_down_triangle_violet_gif = SubLObjectFactory.makeString("cyc-down-triangle-violet.gif");
        $str172$_Hide_ = SubLObjectFactory.makeString("[Hide]");
        $kw173$UP_TRIANGLE_V = SubLObjectFactory.makeKeyword("UP-TRIANGLE-V");
        $str174$cyc_up_triangle_violet_gif = SubLObjectFactory.makeString("cyc-up-triangle-violet.gif");
        $kw175$BLANK_TRIANGLE = SubLObjectFactory.makeKeyword("BLANK-TRIANGLE");
        $str176$cyc_no_triangle_violet_gif = SubLObjectFactory.makeString("cyc-no-triangle-violet.gif");
        $str177$__ = SubLObjectFactory.makeString("  ");
        $kw178$SQUARE_MINUS = SubLObjectFactory.makeKeyword("SQUARE-MINUS");
        $str179$square_minus_gif = SubLObjectFactory.makeString("square-minus.gif");
        $kw180$SQUARE_PLUS = SubLObjectFactory.makeKeyword("SQUARE-PLUS");
        $str181$square_plus_gif = SubLObjectFactory.makeString("square-plus.gif");
        $kw182$SQUARE_BLANK = SubLObjectFactory.makeKeyword("SQUARE-BLANK");
        $str183$square_blank_gif = SubLObjectFactory.makeString("square-blank.gif");
        $kw184$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str185$display_inline = SubLObjectFactory.makeString("display:inline");
        $str186$display_none = SubLObjectFactory.makeString("display:none");
        $kw187$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw188$CONNECTION = SubLObjectFactory.makeKeyword("CONNECTION");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ELEMENT-ID*"), (SubLObject)dhtml_macros.ZERO_INTEGER));
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-AJAX-SCRIPTS"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("*JS-LOAD-LATER*"));
        $str192$_script_type__text_javascript__fu = SubLObjectFactory.makeString("<script type='text/javascript'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest('get', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML='Unable to load';\n}\n</script>\n");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeString("span")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAY"), (SubLObject)SubLObjectFactory.makeInteger(50)));
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("TAG"), (SubLObject)SubLObjectFactory.makeKeyword("DELAY"));
        $kw195$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $kw196$TAG = SubLObjectFactory.makeKeyword("TAG");
        $str197$span = SubLObjectFactory.makeString("span");
        $kw198$DELAY = SubLObjectFactory.makeKeyword("DELAY");
        $int199$50 = SubLObjectFactory.makeInteger(50);
        $sym200$JS_DELAYED_LOAD_INT = SubLObjectFactory.makeSymbol("JS-DELAYED-LOAD-INT");
        $sym201$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw202$HANDLER = SubLObjectFactory.makeKeyword("HANDLER");
        $kw203$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $sym204$JS_DELAYED_LOAD = SubLObjectFactory.makeSymbol("JS-DELAYED-LOAD");
        $str205$cyc_elt_ = SubLObjectFactory.makeString("cyc-elt-");
        $str206$__A_id___A___A___A_ = SubLObjectFactory.makeString("<~A id='~A'>~A</~A>");
        $str207$_script_type__text_javascript__tr = SubLObjectFactory.makeString("<script type='text/javascript'>try {YAHOO.util.Event.addListener(window, 'load', setTimeout(\"loadLater('~A', '~A')\", ~A));} catch(err) {document.getElementById('~a').innerHTML='Error ~A';}</script>");
        $str208$_ = SubLObjectFactory.makeString("?");
        $list209 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str210$_ = SubLObjectFactory.makeString("&");
        $str211$_ = SubLObjectFactory.makeString("=");
        $str212$_if__isKeaHosted________var_keaBu = SubLObjectFactory.makeString("\nif (isKeaHosted()) {\n  var keaBus = new KEASessionBus();\n  YAHOO.util.Event.onDOMReady(function() {\n    window.onfocus = function() {\n      keaBus.setFocalTool('');\n      keaBus.setFocalTool('legacyToolFocus');\n    }; \n  });\n}");
        $kw213$MENU_CSS = SubLObjectFactory.makeKeyword("MENU-CSS");
        $kw214$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw215$SELECTOR = SubLObjectFactory.makeKeyword("SELECTOR");
        $kw216$EVENT_DELEGATION = SubLObjectFactory.makeKeyword("EVENT-DELEGATION");
        $kw217$CONTAINER_CORE = SubLObjectFactory.makeKeyword("CONTAINER-CORE");
        $kw218$MENU = SubLObjectFactory.makeKeyword("MENU");
        $kw219$OVERLIB = SubLObjectFactory.makeKeyword("OVERLIB");
        $kw220$CB = SubLObjectFactory.makeKeyword("CB");
        $kw221$CB_INLINE_EDIT = SubLObjectFactory.makeKeyword("CB-INLINE-EDIT");
        $kw222$CYCJS_KEA_SESSION_BUS = SubLObjectFactory.makeKeyword("CYCJS-KEA-SESSION-BUS");
        $str223$__yui_skin_sam__editContainer__yu = SubLObjectFactory.makeString(" .yui-skin-sam .editContainer .yui-ac-input { position:relative; width:10em; }");
    }
}

/*

	Total time: 726 ms
	
*/