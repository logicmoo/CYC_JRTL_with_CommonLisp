package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_html_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_html_parameters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_html_parameters extends SubLTranslatedFile {
    public static final SubLFile me = new cb_html_parameters();

    public static final String myName = "com.cyc.cycjava.cycl.cb_html_parameters";

    public static final String myFingerPrint = "bf11cac43edde25761b233816dc05d0ca4a0a5bafd5bcabb4318dd659d0230b4";

    // defparameter
    public static final SubLSymbol $cb_html_assertion_sentence_class$ = makeSymbol("*CB-HTML-ASSERTION-SENTENCE-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_assertion_class$ = makeSymbol("*CB-HTML-ASSERTION-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_assert_class$ = makeSymbol("*CB-HTML-ASSERT-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_rule_class$ = makeSymbol("*CB-HTML-RULE-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_nat_class$ = makeSymbol("*CB-HTML-NAT-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_cons_class$ = makeSymbol("*CB-HTML-CONS-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_string_class$ = makeSymbol("*CB-HTML-STRING-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_edit_class$ = makeSymbol("*CB-HTML-EDIT-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_no_edit_class$ = makeSymbol("*CB-HTML-NO-EDIT-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_no_modification_class$ = makeSymbol("*CB-HTML-NO-MODIFICATION-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_lexical_assertion_class$ = makeSymbol("*CB-HTML-LEXICAL-ASSERTION-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_warn_class$ = makeSymbol("*CB-HTML-WARN-CLASS*");

    // defparameter
    public static final SubLSymbol $cb_html_obsolete_class$ = makeSymbol("*CB-HTML-OBSOLETE-CLASS*");

    private static final SubLString $str0$assert_sent_ = makeString("assert-sent ");

    private static final SubLString $$$assertion_ = makeString("assertion ");

    private static final SubLString $$$assert_ = makeString("assert ");

    private static final SubLString $$$rule_ = makeString("rule ");

    private static final SubLString $$$nat_ = makeString("nat ");

    private static final SubLString $$$cons_ = makeString("cons ");

    private static final SubLString $$$string_ = makeString("string ");

    private static final SubLString $$$edit_ = makeString("edit ");

    private static final SubLString $$$noedit_ = makeString("noedit ");

    private static final SubLString $$$nomod_ = makeString("nomod ");

    private static final SubLString $$$lex_ = makeString("lex ");

    private static final SubLString $$$warn_ = makeString("warn ");

    private static final SubLString $$$obsolete_ = makeString("obsolete ");

    public static SubLObject declare_cb_html_parameters_file() {
        return NIL;
    }

    public static SubLObject init_cb_html_parameters_file() {
        defparameter("*CB-HTML-ASSERTION-SENTENCE-CLASS*", $str0$assert_sent_);
        defparameter("*CB-HTML-ASSERTION-CLASS*", $$$assertion_);
        defparameter("*CB-HTML-ASSERT-CLASS*", $$$assert_);
        defparameter("*CB-HTML-RULE-CLASS*", $$$rule_);
        defparameter("*CB-HTML-NAT-CLASS*", $$$nat_);
        defparameter("*CB-HTML-CONS-CLASS*", $$$cons_);
        defparameter("*CB-HTML-STRING-CLASS*", $$$string_);
        defparameter("*CB-HTML-EDIT-CLASS*", $$$edit_);
        defparameter("*CB-HTML-NO-EDIT-CLASS*", $$$noedit_);
        defparameter("*CB-HTML-NO-MODIFICATION-CLASS*", $$$nomod_);
        defparameter("*CB-HTML-LEXICAL-ASSERTION-CLASS*", $$$lex_);
        defparameter("*CB-HTML-WARN-CLASS*", $$$warn_);
        defparameter("*CB-HTML-OBSOLETE-CLASS*", $$$obsolete_);
        return NIL;
    }

    public static SubLObject setup_cb_html_parameters_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_html_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_html_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_html_parameters_file();
    }

    static {



























    }
}

/**
 * Total time: 62 ms
 */
