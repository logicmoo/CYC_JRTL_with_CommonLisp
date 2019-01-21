package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_javascript_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_javascript_macros";
    public static final String myFingerPrint = "bc1eb77556ae1ffd4924bb3632c030c8981321d564e8d5e672a7d81a7434dc8d";
    private static final SubLSymbol $sym0$CB_UIAT_WITH_DOM_SCRIPT;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$PROGN;
    private static final SubLSymbol $sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$VISIBLE;
    private static final SubLSymbol $sym7$CB_UIAT_POTENTIALLY_SHOW;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DHTML_POTENTIALLY_SHOW;
    private static final SubLSymbol $kw10$INITIAL_VISIBILITY;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$DHTML_POTENTIALLY_SHOW_SWITCHED;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$DHTML_TOGGLE_VISIBILITY_LINK;
    private static final SubLSymbol $kw19$LINK_TEXT;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$DHTML_SWITCH_VISIBILITY_LINKS;
    private static final SubLList $list24;
    private static final SubLString $str25$;
    private static final SubLSymbol $sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS;
    private static final SubLSymbol $sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 826L)
    public static SubLObject cb_uiat_with_dom_script(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym0$CB_UIAT_WITH_DOM_SCRIPT, (SubLObject)cb_javascript_macros.$list1);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_javascript_macros.$sym2$PROGN, (SubLObject)cb_javascript_macros.$list1, ConsesLow.append(body, (SubLObject)cb_javascript_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1222L)
    public static SubLObject cb_uiat_with_toggle_visibility_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT, (SubLObject)cb_javascript_macros.$list4);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_javascript_macros.$sym2$PROGN, (SubLObject)cb_javascript_macros.$list4, ConsesLow.append(body, (SubLObject)cb_javascript_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1419L)
    public static SubLObject cb_uiat_potentially_show(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        object_id = current.first();
        current = current.rest();
        final SubLObject initial_visibility = (SubLObject)(current.isCons() ? current.first() : cb_javascript_macros.$kw6$VISIBLE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym7$CB_UIAT_POTENTIALLY_SHOW, (SubLObject)cb_javascript_macros.$list8);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_javascript_macros.$sym9$DHTML_POTENTIALLY_SHOW, (SubLObject)ConsesLow.listS(object_id, (SubLObject)cb_javascript_macros.$kw10$INITIAL_VISIBILITY, initial_visibility, (SubLObject)cb_javascript_macros.$list11), ConsesLow.append(body, (SubLObject)cb_javascript_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list5);
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1686L)
    public static SubLObject cb_uiat_potentially_show_switched(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        object_id = current.first();
        current = current.rest();
        final SubLObject initial_visibility = (SubLObject)(current.isCons() ? current.first() : cb_javascript_macros.$kw6$VISIBLE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_javascript_macros.$list5);
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED, (SubLObject)cb_javascript_macros.$list13);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_javascript_macros.$sym14$DHTML_POTENTIALLY_SHOW_SWITCHED, (SubLObject)ConsesLow.listS(object_id, (SubLObject)cb_javascript_macros.$kw10$INITIAL_VISIBILITY, initial_visibility, (SubLObject)cb_javascript_macros.$list11), ConsesLow.append(body, (SubLObject)cb_javascript_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list5);
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1979L)
    public static SubLObject cb_uiat_toggle_visibility_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        SubLObject link_text = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list15);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list15);
        link_text = current.first();
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK, (SubLObject)cb_javascript_macros.$list17);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_javascript_macros.$sym18$DHTML_TOGGLE_VISIBILITY_LINK, (SubLObject)ConsesLow.list(object_id, (SubLObject)cb_javascript_macros.$kw19$LINK_TEXT, link_text), ConsesLow.append(body, (SubLObject)cb_javascript_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list15);
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2195L)
    public static SubLObject cb_uiat_switch_visibility_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        SubLObject show_link_text = (SubLObject)cb_javascript_macros.NIL;
        SubLObject hide_link_text = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list20);
        object_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list20);
        show_link_text = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list20);
        hide_link_text = current.first();
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            current = temp;
            if (cb_javascript_macros.NIL == current) {
                access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS, (SubLObject)cb_javascript_macros.$list22);
                return (SubLObject)ConsesLow.list((SubLObject)cb_javascript_macros.$sym23$DHTML_SWITCH_VISIBILITY_LINKS, object_id, show_link_text, hide_link_text);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list20);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list20);
        }
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2425L)
    public static SubLObject cb_uiat_switch_visibility_links_arrows(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        object_id = current.first();
        current = current.rest();
        final SubLObject text = (SubLObject)(current.isCons() ? current.first() : cb_javascript_macros.$str25$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            current = temp;
            if (cb_javascript_macros.NIL == current) {
                access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS, (SubLObject)cb_javascript_macros.$list27);
                return (SubLObject)ConsesLow.list((SubLObject)cb_javascript_macros.$sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS, object_id, text);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list24);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list24);
        }
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2639L)
    public static SubLObject cb_uiat_switch_visibility_links_left_arrows(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_id = (SubLObject)cb_javascript_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        object_id = current.first();
        current = current.rest();
        final SubLObject text = (SubLObject)(current.isCons() ? current.first() : cb_javascript_macros.$str25$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cb_javascript_macros.$list24);
        current = current.rest();
        if (cb_javascript_macros.NIL == current) {
            current = temp;
            if (cb_javascript_macros.NIL == current) {
                access_macros.defmacro_obsolete_warning((SubLObject)cb_javascript_macros.$sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, (SubLObject)cb_javascript_macros.$list30);
                return (SubLObject)ConsesLow.list((SubLObject)cb_javascript_macros.$sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, object_id, text);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list24);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_javascript_macros.$list24);
        }
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    public static SubLObject declare_cb_javascript_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_with_dom_script", "CB-UIAT-WITH-DOM-SCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_with_toggle_visibility_support", "CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_potentially_show", "CB-UIAT-POTENTIALLY-SHOW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_potentially_show_switched", "CB-UIAT-POTENTIALLY-SHOW-SWITCHED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_toggle_visibility_link", "CB-UIAT-TOGGLE-VISIBILITY-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_switch_visibility_links", "CB-UIAT-SWITCH-VISIBILITY-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_switch_visibility_links_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_javascript_macros", "cb_uiat_switch_visibility_links_left_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    public static SubLObject init_cb_javascript_macros_file() {
        return (SubLObject)cb_javascript_macros.NIL;
    }
    
    public static SubLObject setup_cb_javascript_macros_file() {
        return (SubLObject)cb_javascript_macros.NIL;
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
        me = (SubLFile)new cb_javascript_macros();
        $sym0$CB_UIAT_WITH_DOM_SCRIPT = SubLObjectFactory.makeSymbol("CB-UIAT-WITH-DOM-SCRIPT");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-DOM-SCRIPT"));
        $sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT = SubLObjectFactory.makeSymbol("CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("VISIBLE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw6$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $sym7$CB_UIAT_POTENTIALLY_SHOW = SubLObjectFactory.makeSymbol("CB-UIAT-POTENTIALLY-SHOW");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW"));
        $sym9$DHTML_POTENTIALLY_SHOW = SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW");
        $kw10$INITIAL_VISIBILITY = SubLObjectFactory.makeKeyword("INITIAL-VISIBILITY");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FLOW-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED = SubLObjectFactory.makeSymbol("CB-UIAT-POTENTIALLY-SHOW-SWITCHED");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED"));
        $sym14$DHTML_POTENTIALLY_SHOW_SWITCHED = SubLObjectFactory.makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK = SubLObjectFactory.makeSymbol("CB-UIAT-TOGGLE-VISIBILITY-LINK");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK"));
        $sym18$DHTML_TOGGLE_VISIBILITY_LINK = SubLObjectFactory.makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");
        $kw19$LINK_TEXT = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-LINK-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("HIDE-LINK-TEXT")));
        $sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS = SubLObjectFactory.makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS"));
        $sym23$DHTML_SWITCH_VISIBILITY_LINKS = SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeString(""))));
        $str25$ = SubLObjectFactory.makeString("");
        $sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS = SubLObjectFactory.makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS"));
        $sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS = SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-ARROWS");
        $sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = SubLObjectFactory.makeSymbol("CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS"));
        $sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = SubLObjectFactory.makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS");
    }
}

/*

	Total time: 86 ms
	
*/