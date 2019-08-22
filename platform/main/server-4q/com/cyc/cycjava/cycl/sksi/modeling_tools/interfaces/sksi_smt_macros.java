package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_smt_macros extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_smt_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros";

    public static final String myFingerPrint = "5e77782906d6a9ef731e2230e46d8adb5a922c26036dd7f4c44b2f474a000581";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("SHOW-COPYRIGHT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("COMPLETION?"), makeKeyword("SHOW-COPYRIGHT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol CB_HEAD = makeSymbol("CB-HEAD");

    public static final SubLSymbol SKSI_SMT_HTML_TITLE = makeSymbol("SKSI-SMT-HTML-TITLE");



    public static final SubLList $list9 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    private static final SubLList $list10 = list(list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), list(makeSymbol("HTML-BASIC-CB-SCRIPTS")));



    private static final SubLSymbol SKSI_SMT_HTML_DOCUMENT = makeSymbol("SKSI-SMT-HTML-DOCUMENT");

    private static final SubLString $$$SMT = makeString("SMT");

    private static final SubLString $str14$___ = makeString(" - ");

    private static final SubLString $str15$___A = makeString(" (~A");

    public static final SubLString $$$_ = makeString(")");

    public static SubLObject sksi_smt_html_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject completionP_tail = property_list_member($COMPLETION_, current);
        final SubLObject completionP = (NIL != completionP_tail) ? cadr(completionP_tail) : NIL;
        final SubLObject show_copyright_tail = property_list_member($SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (NIL != show_copyright_tail) ? cadr(show_copyright_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(HTML_DOCUMENT, listS(CB_HEAD, list(SKSI_SMT_HTML_TITLE, title), listS(PWHEN, completionP, $list9), $list10), listS(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, show_copyright), append(body, NIL)));
    }

    public static SubLObject sksi_smt_html_title(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_title_head$.getGlobalValue());
        html_princ($$$SMT);
        if (NIL != v_object) {
            html_princ($str14$___);
            html_princ(string_utilities.to_string(v_object));
        }
        final SubLObject machine = Environment.get_machine_name(UNPROVIDED);
        if (machine.isString()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str15$___A, machine);
            html_princ($$$_);
        }
        html_markup(html_macros.$html_title_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_sksi_smt_macros_file() {
        declareMacro(me, "sksi_smt_html_document", "SKSI-SMT-HTML-DOCUMENT");
        declareFunction(me, "sksi_smt_html_title", "SKSI-SMT-HTML-TITLE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_sksi_smt_macros_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_smt_macros_file() {
        register_macro_helper(SKSI_SMT_HTML_TITLE, SKSI_SMT_HTML_DOCUMENT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_smt_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_smt_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_smt_macros_file();
    }

    
}

/**
 * Total time: 92 ms
 */
