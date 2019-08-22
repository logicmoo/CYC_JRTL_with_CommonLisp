/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-JAVASCRIPT-MACROS
 * source file: /cyc/top/cycl/cb-javascript-macros.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_javascript_macros extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt25$ = makeString("");

    public static final SubLFile me = new cb_javascript_macros();

 public static final String myName = "com.cyc.cycjava.cycl.cb_javascript_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CB_UIAT_WITH_DOM_SCRIPT = makeSymbol("CB-UIAT-WITH-DOM-SCRIPT");

    static private final SubLList $list1 = list(makeSymbol("DHTML-WITH-DOM-SCRIPT"));

    private static final SubLSymbol CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT = makeSymbol("CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");

    static private final SubLList $list4 = list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"));

    static private final SubLList $list5 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_UIAT_POTENTIALLY_SHOW = makeSymbol("CB-UIAT-POTENTIALLY-SHOW");

    static private final SubLList $list8 = list(makeSymbol("DHTML-POTENTIALLY-SHOW"));

    private static final SubLSymbol DHTML_POTENTIALLY_SHOW = makeSymbol("DHTML-POTENTIALLY-SHOW");

    static private final SubLList $list11 = list(makeKeyword("FLOW-TYPE"), $TEXT);

    private static final SubLSymbol CB_UIAT_POTENTIALLY_SHOW_SWITCHED = makeSymbol("CB-UIAT-POTENTIALLY-SHOW-SWITCHED");

    static private final SubLList $list13 = list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"));

    private static final SubLSymbol DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");

    static private final SubLList $list15 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_UIAT_TOGGLE_VISIBILITY_LINK = makeSymbol("CB-UIAT-TOGGLE-VISIBILITY-LINK");

    static private final SubLList $list17 = list(makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK"));

    private static final SubLSymbol DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");

    static private final SubLList $list20 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-TEXT"), makeSymbol("HIDE-LINK-TEXT")));

    private static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS");

    static private final SubLList $list22 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"));

    private static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS");

    static private final SubLList $list24 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEXT"), makeString(""))));

    static private final SubLString $str25$ = makeString("");

    private static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");

    static private final SubLList $list27 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS"));

    private static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS");

    private static final SubLSymbol CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");

    static private final SubLList $list30 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS"));

    private static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");

    // Definitions
    public static final SubLObject cb_uiat_with_dom_script_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            defmacro_obsolete_warning(CB_UIAT_WITH_DOM_SCRIPT, $list_alt1);
            return listS(PROGN, $list_alt1, append(body, NIL));
        }
    }

    // Definitions
    public static SubLObject cb_uiat_with_dom_script(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        defmacro_obsolete_warning(CB_UIAT_WITH_DOM_SCRIPT, $list1);
        return listS(PROGN, $list1, append(body, NIL));
    }

    public static final SubLObject cb_uiat_with_toggle_visibility_support_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            defmacro_obsolete_warning(CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT, $list_alt4);
            return listS(PROGN, $list_alt4, append(body, NIL));
        }
    }

    public static SubLObject cb_uiat_with_toggle_visibility_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        defmacro_obsolete_warning(CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT, $list4);
        return listS(PROGN, $list4, append(body, NIL));
    }

    public static final SubLObject cb_uiat_potentially_show_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    object_id = current.first();
                    current = current.rest();
                    {
                        SubLObject initial_visibility = (current.isCons()) ? ((SubLObject) (current.first())) : $VISIBLE;
                        destructuring_bind_must_listp(current, datum, $list_alt5);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                defmacro_obsolete_warning(CB_UIAT_POTENTIALLY_SHOW, $list_alt8);
                                return listS(DHTML_POTENTIALLY_SHOW, listS(object_id, $INITIAL_VISIBILITY, initial_visibility, $list_alt11), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject cb_uiat_potentially_show_switched_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    object_id = current.first();
                    current = current.rest();
                    {
                        SubLObject initial_visibility = (current.isCons()) ? ((SubLObject) (current.first())) : $VISIBLE;
                        destructuring_bind_must_listp(current, datum, $list_alt5);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                defmacro_obsolete_warning(CB_UIAT_POTENTIALLY_SHOW_SWITCHED, $list_alt13);
                                return listS(DHTML_POTENTIALLY_SHOW_SWITCHED, listS(object_id, $INITIAL_VISIBILITY, initial_visibility, $list_alt11), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject cb_uiat_toggle_visibility_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    SubLObject link_text = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    object_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    link_text = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            defmacro_obsolete_warning(CB_UIAT_TOGGLE_VISIBILITY_LINK, $list_alt17);
                            return listS(DHTML_TOGGLE_VISIBILITY_LINK, list(object_id, $LINK_TEXT, link_text), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
            }
        }
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

    public static final SubLObject cb_uiat_switch_visibility_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    SubLObject show_link_text = NIL;
                    SubLObject hide_link_text = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    object_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    show_link_text = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    hide_link_text = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        if (NIL == current) {
                            defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS, $list_alt22);
                            return list(DHTML_SWITCH_VISIBILITY_LINKS, object_id, show_link_text, hide_link_text);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
        }
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

    public static final SubLObject cb_uiat_switch_visibility_links_arrows_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    object_id = current.first();
                    current = current.rest();
                    {
                        SubLObject text = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt25$;
                        destructuring_bind_must_listp(current, datum, $list_alt24);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            if (NIL == current) {
                                defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS, $list_alt27);
                                return list(DHTML_SWITCH_VISIBILITY_LINKS_ARROWS, object_id, text);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                    }
                }
            }
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

    public static final SubLObject cb_uiat_switch_visibility_links_left_arrows_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject object_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    object_id = current.first();
                    current = current.rest();
                    {
                        SubLObject text = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt25$;
                        destructuring_bind_must_listp(current, datum, $list_alt24);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            if (NIL == current) {
                                defmacro_obsolete_warning(CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, $list_alt30);
                                return list(DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, object_id, text);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                    }
                }
            }
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
        declareMacro("cb_uiat_with_dom_script", "CB-UIAT-WITH-DOM-SCRIPT");
        declareMacro("cb_uiat_with_toggle_visibility_support", "CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");
        declareMacro("cb_uiat_potentially_show", "CB-UIAT-POTENTIALLY-SHOW");
        declareMacro("cb_uiat_potentially_show_switched", "CB-UIAT-POTENTIALLY-SHOW-SWITCHED");
        declareMacro("cb_uiat_toggle_visibility_link", "CB-UIAT-TOGGLE-VISIBILITY-LINK");
        declareMacro("cb_uiat_switch_visibility_links", "CB-UIAT-SWITCH-VISIBILITY-LINKS");
        declareMacro("cb_uiat_switch_visibility_links_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");
        declareMacro("cb_uiat_switch_visibility_links_left_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");
        return NIL;
    }

    public static SubLObject init_cb_javascript_macros_file() {
        return NIL;
    }

    public static SubLObject setup_cb_javascript_macros_file() {
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("DHTML-WITH-DOM-SCRIPT"));

    @Override
    public void declareFunctions() {
        declare_cb_javascript_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_javascript_macros_file();
    }

    static private final SubLList $list_alt4 = list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"));

    @Override
    public void runTopLevelForms() {
        setup_cb_javascript_macros_file();
    }

    static private final SubLList $list_alt5 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    

    static private final SubLList $list_alt8 = list(makeSymbol("DHTML-POTENTIALLY-SHOW"));

    static private final SubLList $list_alt11 = list(makeKeyword("FLOW-TYPE"), $TEXT);

    static private final SubLList $list_alt13 = list(makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"));

    static private final SubLList $list_alt15 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt17 = list(makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-TEXT"), makeSymbol("HIDE-LINK-TEXT")));

    static private final SubLList $list_alt22 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"));

    static private final SubLList $list_alt24 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEXT"), makeString(""))));

    static private final SubLList $list_alt27 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS"));

    static private final SubLList $list_alt30 = list(makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS"));
}

/**
 * Total time: 86 ms
 */
