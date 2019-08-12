/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-SMT-MACROS
 * source file: /cyc/top/cycl/sksi/modeling-tools/interfaces/sksi-smt-macros.lisp
 * created:     2019/07/03 17:38:35
 */
public final class sksi_smt_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_smt_macros();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("SHOW-COPYRIGHT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("COMPLETION?"), makeKeyword("SHOW-COPYRIGHT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol CB_HEAD = makeSymbol("CB-HEAD");

    private static final SubLSymbol SKSI_SMT_HTML_TITLE = makeSymbol("SKSI-SMT-HTML-TITLE");

    static private final SubLList $list9 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    private static final SubLList $list10 = list(list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), list(makeSymbol("HTML-BASIC-CB-SCRIPTS")));

    private static final SubLSymbol SKSI_SMT_HTML_DOCUMENT = makeSymbol("SKSI-SMT-HTML-DOCUMENT");

    private static final SubLString $$$SMT = makeString("SMT");

    private static final SubLString $str14$___ = makeString(" - ");

    private static final SubLString $str15$___A = makeString(" (~A");

    static private final SubLString $$$_ = makeString(")");

    // Definitions
    public static final SubLObject sksi_smt_html_document_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject title = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    title = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject completionP_tail = property_list_member($COMPLETION_, current);
                            SubLObject completionP = (NIL != completionP_tail) ? ((SubLObject) (cadr(completionP_tail))) : NIL;
                            SubLObject show_copyright_tail = property_list_member($SHOW_COPYRIGHT, current);
                            SubLObject show_copyright = (NIL != show_copyright_tail) ? ((SubLObject) (cadr(show_copyright_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(HTML_DOCUMENT, list(HTML_HEAD, list(SKSI_SMT_HTML_TITLE, title), listS(PWHEN, completionP, $list_alt9)), listS(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, show_copyright), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
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

    public static final SubLObject sksi_smt_html_title_alt(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$SMT);
            if (NIL != v_object) {
                html_princ($str_alt13$___);
                html_princ(string_utilities.to_string(v_object));
            }
            {
                SubLObject machine = Environment.get_machine_name(UNPROVIDED);
                if (machine.isString()) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt14$___A, machine);
                    if (!$int$3600.equal(system_parameters.$base_tcp_port$.getDynamicValue(thread))) {
                        html_princ($str_alt16$_);
                        html_princ(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                    }
                    html_princ($str_alt17$_);
                }
            }
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            return NIL;
        }
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
        declareMacro("sksi_smt_html_document", "SKSI-SMT-HTML-DOCUMENT");
        declareFunction("sksi_smt_html_title", "SKSI-SMT-HTML-TITLE", 0, 1, false);
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), makeSymbol("SHOW-COPYRIGHT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("COMPLETION?"), makeKeyword("SHOW-COPYRIGHT"));

    private static final SubLSymbol HTML_HEAD = makeSymbol("HTML-HEAD");

    static private final SubLList $list_alt9 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    static private final SubLString $str_alt13$___ = makeString(" - ");

    static private final SubLString $str_alt14$___A = makeString(" (~A");

    public static final SubLInteger $int$3600 = makeInteger(3600);

    static private final SubLString $str_alt16$_ = makeString(" ");

    static private final SubLString $str_alt17$_ = makeString(")");
}

/**
 * Total time: 92 ms
 */
