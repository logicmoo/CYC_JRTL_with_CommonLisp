package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_javascript_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_javascript_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_javascript_macros extends SubLTranslatedFile {
    public static final SubLFile me = new cb_javascript_macros();

    public static final String myName = "com.cyc.cycjava.cycl.cb_javascript_macros";

    public static final String myFingerPrint = "bc1eb77556ae1ffd4924bb3632c030c8981321d564e8d5e672a7d81a7434dc8d";

    // Internal Constants
    public static final SubLSymbol CB_UIAT_WITH_DOM_SCRIPT = makeSymbol("CB-UIAT-WITH-DOM-SCRIPT");

    public static final SubLList $list1 = list(makeSymbol("DHTML-WITH-DOM-SCRIPT"));



    public static final SubLSymbol CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT = makeSymbol("CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");

    public static final SubLList $list4 = list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"));

    public static final SubLList $list5 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE"))), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol CB_UIAT_POTENTIALLY_SHOW = makeSymbol("CB-UIAT-POTENTIALLY-SHOW");

    public static final SubLList $list8 = list(makeSymbol("DHTML-POTENTIALLY-SHOW"));

    public static final SubLSymbol DHTML_POTENTIALLY_SHOW = makeSymbol("DHTML-POTENTIALLY-SHOW");



    public static final SubLList $list11 = list(makeKeyword("FLOW-TYPE"), makeKeyword("TEXT"));

    public static final SubLSymbol CB_UIAT_POTENTIALLY_SHOW_SWITCHED = makeSymbol("CB-UIAT-POTENTIALLY-SHOW-SWITCHED");

    public static final SubLList $list13 = list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"));

    public static final SubLSymbol DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");

    public static final SubLList $list15 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol CB_UIAT_TOGGLE_VISIBILITY_LINK = makeSymbol("CB-UIAT-TOGGLE-VISIBILITY-LINK");

    public static final SubLList $list17 = list(makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK"));

    public static final SubLSymbol DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");



    public static final SubLList $list20 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-TEXT"), makeSymbol("HIDE-LINK-TEXT")));

    public static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS");

    public static final SubLList $list22 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"));

    public static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS");

    public static final SubLList $list24 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEXT"), makeString(""))));

    public static final SubLString $str25$ = makeString("");

    public static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");

    public static final SubLList $list27 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS"));

    public static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS");

    public static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");

    public static final SubLList $list30 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS"));

    public static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");

    public static SubLObject cb_uiat_with_dom_script(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        defmacro_obsolete_warning(CB_UIAT_WITH_DOM_SCRIPT, $list1);
        return listS(PROGN, $list1, append(body, NIL));
    }

    public static SubLObject cb_uiat_with_toggle_visibility_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        defmacro_obsolete_warning(CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT, $list4);
        return listS(PROGN, $list4, append(body, NIL));
    }

    public static SubLObject cb_uiat_potentially_show(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        object_id = current.first();
        current = current.rest();
        final SubLObject initial_visibility = (current.isCons()) ? current.first() : $VISIBLE;
        destructuring_bind_must_listp(current, datum, $list5);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(CB_UIAT_POTENTIALLY_SHOW, $list8);
            return listS(DHTML_POTENTIALLY_SHOW, listS(object_id, $INITIAL_VISIBILITY, initial_visibility, $list11), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject cb_uiat_potentially_show_switched(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        object_id = current.first();
        current = current.rest();
        final SubLObject initial_visibility = (current.isCons()) ? current.first() : $VISIBLE;
        destructuring_bind_must_listp(current, datum, $list5);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(CB_UIAT_POTENTIALLY_SHOW_SWITCHED, $list13);
            return listS(DHTML_POTENTIALLY_SHOW_SWITCHED, listS(object_id, $INITIAL_VISIBILITY, initial_visibility, $list11), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject cb_uiat_toggle_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        SubLObject link_text = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        link_text = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(CB_UIAT_TOGGLE_VISIBILITY_LINK, $list17);
            return listS(DHTML_TOGGLE_VISIBILITY_LINK, list(object_id, $LINK_TEXT, link_text), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list15);
        return NIL;
    }

    public static SubLObject cb_uiat_switch_visibility_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        SubLObject show_link_text = NIL;
        SubLObject hide_link_text = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        object_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        show_link_text = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        hide_link_text = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS, $list22);
                return list(DHTML_SWITCH_VISIBILITY_LINKS, object_id, show_link_text, hide_link_text);
            }
            cdestructuring_bind_error(datum, $list20);
        } else {
            cdestructuring_bind_error(datum, $list20);
        }
        return NIL;
    }

    public static SubLObject cb_uiat_switch_visibility_links_arrows(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        object_id = current.first();
        current = current.rest();
        final SubLObject text = (current.isCons()) ? current.first() : $str25$;
        destructuring_bind_must_listp(current, datum, $list24);
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS, $list27);
                return list(DHTML_SWITCH_VISIBILITY_LINKS_ARROWS, object_id, text);
            }
            cdestructuring_bind_error(datum, $list24);
        } else {
            cdestructuring_bind_error(datum, $list24);
        }
        return NIL;
    }

    public static SubLObject cb_uiat_switch_visibility_links_left_arrows(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        object_id = current.first();
        current = current.rest();
        final SubLObject text = (current.isCons()) ? current.first() : $str25$;
        destructuring_bind_must_listp(current, datum, $list24);
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, $list30);
                return list(DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, object_id, text);
            }
            cdestructuring_bind_error(datum, $list24);
        } else {
            cdestructuring_bind_error(datum, $list24);
        }
        return NIL;
    }

    public static SubLObject declare_cb_javascript_macros_file() {
        declareMacro(me, "cb_uiat_with_dom_script", "CB-UIAT-WITH-DOM-SCRIPT");
        declareMacro(me, "cb_uiat_with_toggle_visibility_support", "CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");
        declareMacro(me, "cb_uiat_potentially_show", "CB-UIAT-POTENTIALLY-SHOW");
        declareMacro(me, "cb_uiat_potentially_show_switched", "CB-UIAT-POTENTIALLY-SHOW-SWITCHED");
        declareMacro(me, "cb_uiat_toggle_visibility_link", "CB-UIAT-TOGGLE-VISIBILITY-LINK");
        declareMacro(me, "cb_uiat_switch_visibility_links", "CB-UIAT-SWITCH-VISIBILITY-LINKS");
        declareMacro(me, "cb_uiat_switch_visibility_links_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");
        declareMacro(me, "cb_uiat_switch_visibility_links_left_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");
        return NIL;
    }

    public static SubLObject init_cb_javascript_macros_file() {
        return NIL;
    }

    public static SubLObject setup_cb_javascript_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_javascript_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_javascript_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_javascript_macros_file();
    }

    static {

































    }
}

/**
 * Total time: 86 ms
 */
