package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_smt_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros";
    public static final String myFingerPrint = "5e77782906d6a9ef731e2230e46d8adb5a922c26036dd7f4c44b2f474a000581";
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$COMPLETION_;
    private static final SubLSymbol $kw4$SHOW_COPYRIGHT;
    private static final SubLSymbol $sym5$HTML_DOCUMENT;
    private static final SubLSymbol $sym6$CB_HEAD;
    private static final SubLSymbol $sym7$SKSI_SMT_HTML_TITLE;
    private static final SubLSymbol $sym8$PWHEN;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$HTML_FANCY_BODY;
    private static final SubLSymbol $sym12$SKSI_SMT_HTML_DOCUMENT;
    private static final SubLString $str13$SMT;
    private static final SubLString $str14$___;
    private static final SubLString $str15$___A;
    private static final SubLString $str16$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt-macros.lisp", position = 928L)
    public static SubLObject sksi_smt_html_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)sksi_smt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_smt_macros.$list0);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_smt_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_smt_macros.NIL;
        SubLObject current_$1 = (SubLObject)sksi_smt_macros.NIL;
        while (sksi_smt_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_smt_macros.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_smt_macros.$list0);
            if (sksi_smt_macros.NIL == conses_high.member(current_$1, (SubLObject)sksi_smt_macros.$list1, (SubLObject)sksi_smt_macros.UNPROVIDED, (SubLObject)sksi_smt_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_smt_macros.T;
            }
            if (current_$1 == sksi_smt_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_smt_macros.NIL != bad && sksi_smt_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_smt_macros.$list0);
        }
        final SubLObject completionP_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_smt_macros.$kw3$COMPLETION_, current);
        final SubLObject completionP = (SubLObject)((sksi_smt_macros.NIL != completionP_tail) ? conses_high.cadr(completionP_tail) : sksi_smt_macros.NIL);
        final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_smt_macros.$kw4$SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (SubLObject)((sksi_smt_macros.NIL != show_copyright_tail) ? conses_high.cadr(show_copyright_tail) : sksi_smt_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)sksi_smt_macros.$sym5$HTML_DOCUMENT, (SubLObject)ConsesLow.listS((SubLObject)sksi_smt_macros.$sym6$CB_HEAD, (SubLObject)ConsesLow.list((SubLObject)sksi_smt_macros.$sym7$SKSI_SMT_HTML_TITLE, title), (SubLObject)ConsesLow.listS((SubLObject)sksi_smt_macros.$sym8$PWHEN, completionP, (SubLObject)sksi_smt_macros.$list9), (SubLObject)sksi_smt_macros.$list10), (SubLObject)ConsesLow.listS((SubLObject)sksi_smt_macros.$sym11$HTML_FANCY_BODY, (SubLObject)ConsesLow.list((SubLObject)sksi_smt_macros.$kw4$SHOW_COPYRIGHT, show_copyright), ConsesLow.append(body, (SubLObject)sksi_smt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt-macros.lisp", position = 1375L)
    public static SubLObject sksi_smt_html_title(SubLObject v_object) {
        if (v_object == sksi_smt_macros.UNPROVIDED) {
            v_object = (SubLObject)sksi_smt_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)sksi_smt_macros.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)sksi_smt_macros.$str13$SMT);
        if (sksi_smt_macros.NIL != v_object) {
            html_utilities.html_princ((SubLObject)sksi_smt_macros.$str14$___);
            html_utilities.html_princ(string_utilities.to_string(v_object));
        }
        final SubLObject machine = Environment.get_machine_name((SubLObject)sksi_smt_macros.UNPROVIDED);
        if (machine.isString()) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_smt_macros.$str15$___A, machine);
            html_utilities.html_princ((SubLObject)sksi_smt_macros.$str16$_);
        }
        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
        return (SubLObject)sksi_smt_macros.NIL;
    }
    
    public static SubLObject declare_sksi_smt_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros", "sksi_smt_html_document", "SKSI-SMT-HTML-DOCUMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros", "sksi_smt_html_title", "SKSI-SMT-HTML-TITLE", 0, 1, false);
        return (SubLObject)sksi_smt_macros.NIL;
    }
    
    public static SubLObject init_sksi_smt_macros_file() {
        return (SubLObject)sksi_smt_macros.NIL;
    }
    
    public static SubLObject setup_sksi_smt_macros_file() {
        access_macros.register_macro_helper((SubLObject)sksi_smt_macros.$sym7$SKSI_SMT_HTML_TITLE, (SubLObject)sksi_smt_macros.$sym12$SKSI_SMT_HTML_DOCUMENT);
        return (SubLObject)sksi_smt_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_smt_macros_file();
    }
    
    public void initializeVariables() {
        init_sksi_smt_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_smt_macros_file();
    }
    
    static {
        me = (SubLFile)new sksi_smt_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETION?"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-COPYRIGHT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETION?"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$COMPLETION_ = SubLObjectFactory.makeKeyword("COMPLETION?");
        $kw4$SHOW_COPYRIGHT = SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT");
        $sym5$HTML_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-DOCUMENT");
        $sym6$CB_HEAD = SubLObjectFactory.makeSymbol("CB-HEAD");
        $sym7$SKSI_SMT_HTML_TITLE = SubLObjectFactory.makeSymbol("SKSI-SMT-HTML-TITLE");
        $sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COMPLETE-SCRIPT")));
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-DOM-SCRIPT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-BASIC-CB-SCRIPTS")));
        $sym11$HTML_FANCY_BODY = SubLObjectFactory.makeSymbol("HTML-FANCY-BODY");
        $sym12$SKSI_SMT_HTML_DOCUMENT = SubLObjectFactory.makeSymbol("SKSI-SMT-HTML-DOCUMENT");
        $str13$SMT = SubLObjectFactory.makeString("SMT");
        $str14$___ = SubLObjectFactory.makeString(" - ");
        $str15$___A = SubLObjectFactory.makeString(" (~A");
        $str16$_ = SubLObjectFactory.makeString(")");
    }
}

/*

	Total time: 92 ms
	
*/