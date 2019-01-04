package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_macros";
    public static final String myFingerPrint = "81cdde1274be1320f3dd6ecaefd5732aa8708fed42f44258918c038c39435cca";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$RESULT;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$CSETQ;
    private static final SubLSymbol $sym4$PROGN;
    private static final SubLSymbol $sym5$FOO;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$1_;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$NEW_VALUE;
    private static final SubLString $str10$SET__A;
    private static final SubLSymbol $sym11$DEFPARAMETER_HTML;
    private static final SubLSymbol $sym12$DEFINE;
    private static final SubLString $str13$Accessor_for__A;
    private static final SubLSymbol $sym14$RET;
    private static final SubLString $str15$Set_function_for__A;
    private static final SubLList $list16;
    private static final SubLString $str17$_CB_USE__A_;
    private static final SubLString $str18$_CB__A_;
    private static final SubLSymbol $sym19$DEFFILTERVAR;
    private static final SubLString $str20$Should_we_use_the_content_of__A__;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw28$MAX_RESULTS;
    private static final SubLInteger $int29$50;
    private static final SubLSymbol $kw30$MIN_QUERY_LENGTH;
    private static final SubLSymbol $kw31$EMBEDDED_IN_TOOLBAR_FRAME_;
    private static final SubLSymbol $kw32$FILTER_TERM;
    private static final SubLObject $const33$Thing;
    private static final SubLSymbol $sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 585L)
    public static SubLObject extract_keyword(final SubLObject key, final SubLObject arglist, SubLObject v_default) {
        if (v_default == cb_macros.UNPROVIDED) {
            v_default = (SubLObject)cb_macros.NIL;
        }
        final SubLObject binding = conses_high.member(key, arglist, (SubLObject)cb_macros.UNPROVIDED, (SubLObject)cb_macros.UNPROVIDED);
        if (cb_macros.NIL != binding.rest()) {
            return conses_high.cadr(binding);
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1229L)
    public static SubLObject cprog1(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_var = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list0);
        answer_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject result = (SubLObject)cb_macros.$sym1$RESULT;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(result, body.first())), ConsesLow.append(body.rest(), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym3$CSETQ, answer_var, result))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1524L)
    public static SubLObject progfoo(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym3$CSETQ, (SubLObject)cb_macros.$sym5$FOO, body.first()), ConsesLow.append(body.rest(), (SubLObject)cb_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1789L)
    public static SubLObject cprogfoo(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym5$FOO, body.first())), ConsesLow.append(body.rest(), (SubLObject)cb_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2053L)
    public static SubLObject cprogn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_var = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list0);
        answer_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return reader.bq_cons((SubLObject)cb_macros.$sym4$PROGN, ConsesLow.append(conses_high.butlast(body, (SubLObject)cb_macros.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym3$CSETQ, answer_var, conses_high.last(body, (SubLObject)cb_macros.UNPROVIDED)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2341L)
    public static SubLObject cincf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject place = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list6);
        place = current.first();
        current = current.rest();
        if (cb_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym3$CSETQ, place, (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym7$1_, place));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_macros.$list6);
        return (SubLObject)cb_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2403L)
    public static SubLObject deffiltervar(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)cb_macros.NIL;
        SubLObject initval = (SubLObject)cb_macros.NIL;
        SubLObject comment = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list8);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list8);
        initval = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list8);
        comment = current.first();
        current = current.rest();
        if (cb_macros.NIL == current) {
            final SubLObject new_value = (SubLObject)cb_macros.$sym9$NEW_VALUE;
            final SubLObject varname = Strings.string(var);
            final SubLObject getter_name = Sequences.subseq(varname, (SubLObject)cb_macros.ONE_INTEGER, number_utilities.f_1_(Sequences.length(varname)));
            final SubLObject getter = Packages.intern(getter_name, (SubLObject)cb_macros.UNPROVIDED);
            final SubLObject setter = Packages.intern(PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str10$SET__A, getter_name), (SubLObject)cb_macros.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym11$DEFPARAMETER_HTML, var, initval, comment), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym12$DEFINE, getter, (SubLObject)cb_macros.NIL, PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str13$Accessor_for__A, varname), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym14$RET, var)), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym12$DEFINE, setter, (SubLObject)ConsesLow.list(new_value), PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str15$Set_function_for__A, varname), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym3$CSETQ, var, new_value), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym14$RET, var)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_macros.$list8);
        return (SubLObject)cb_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 3424L)
    public static SubLObject deffilterset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject root = (SubLObject)cb_macros.NIL;
        SubLObject initval = (SubLObject)cb_macros.NIL;
        SubLObject comment = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list16);
        root = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list16);
        initval = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list16);
        comment = current.first();
        current = current.rest();
        if (cb_macros.NIL == current) {
            final SubLObject use_p = Packages.intern(PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str17$_CB_USE__A_, Strings.string_upcase(Strings.string(root), (SubLObject)cb_macros.UNPROVIDED, (SubLObject)cb_macros.UNPROVIDED)), (SubLObject)cb_macros.UNPROVIDED);
            final SubLObject filter_params = PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str18$_CB__A_, Strings.string_upcase(Strings.string(root), (SubLObject)cb_macros.UNPROVIDED, (SubLObject)cb_macros.UNPROVIDED));
            return (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym19$DEFFILTERVAR, use_p, (SubLObject)cb_macros.NIL, PrintLow.format((SubLObject)cb_macros.NIL, (SubLObject)cb_macros.$str20$Should_we_use_the_content_of__A__, Strings.string_downcase(filter_params, (SubLObject)cb_macros.UNPROVIDED, (SubLObject)cb_macros.UNPROVIDED))), (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym19$DEFFILTERVAR, Packages.intern(filter_params, (SubLObject)cb_macros.UNPROVIDED), initval, comment));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_macros.$list16);
        return (SubLObject)cb_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 3917L)
    public static SubLObject browsing_new_forward_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject triggering_assertion = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list21);
        triggering_assertion = current.first();
        current = current.rest();
        if (cb_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cb_macros.$sym2$CLET, (SubLObject)cb_macros.$list22, (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, triggering_assertion), ConsesLow.append(body, (SubLObject)cb_macros.$list24));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_macros.$list21);
        return (SubLObject)cb_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 4483L)
    public static SubLObject html_print_js_autocomplete_setup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject input_elt_name = (SubLObject)cb_macros.NIL;
        SubLObject container_elt_name = (SubLObject)cb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list25);
        input_elt_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_macros.$list25);
        container_elt_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_macros.NIL;
        SubLObject current_$1 = (SubLObject)cb_macros.NIL;
        while (cb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_macros.$list25);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_macros.$list25);
            if (cb_macros.NIL == conses_high.member(current_$1, (SubLObject)cb_macros.$list26, (SubLObject)cb_macros.UNPROVIDED, (SubLObject)cb_macros.UNPROVIDED)) {
                bad = (SubLObject)cb_macros.T;
            }
            if (current_$1 == cb_macros.$kw27$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_macros.NIL != bad && cb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_macros.$list25);
        }
        final SubLObject max_results_tail = cdestructuring_bind.property_list_member((SubLObject)cb_macros.$kw28$MAX_RESULTS, current);
        final SubLObject max_results = (SubLObject)((cb_macros.NIL != max_results_tail) ? conses_high.cadr(max_results_tail) : cb_macros.$int29$50);
        final SubLObject min_query_length_tail = cdestructuring_bind.property_list_member((SubLObject)cb_macros.$kw30$MIN_QUERY_LENGTH, current);
        final SubLObject min_query_length = (SubLObject)((cb_macros.NIL != min_query_length_tail) ? conses_high.cadr(min_query_length_tail) : cb_macros.THREE_INTEGER);
        final SubLObject embedded_in_toolbar_frameP_tail = cdestructuring_bind.property_list_member((SubLObject)cb_macros.$kw31$EMBEDDED_IN_TOOLBAR_FRAME_, current);
        final SubLObject embedded_in_toolbar_frameP = (SubLObject)((cb_macros.NIL != embedded_in_toolbar_frameP_tail) ? conses_high.cadr(embedded_in_toolbar_frameP_tail) : cb_macros.NIL);
        final SubLObject filter_term_tail = cdestructuring_bind.property_list_member((SubLObject)cb_macros.$kw32$FILTER_TERM, current);
        final SubLObject filter_term = (cb_macros.NIL != filter_term_tail) ? conses_high.cadr(filter_term_tail) : cb_macros.$const33$Thing;
        return (SubLObject)ConsesLow.list((SubLObject)cb_macros.$sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_elt_name, container_elt_name, max_results, min_query_length, embedded_in_toolbar_frameP, filter_term);
    }
    
    public static SubLObject declare_cb_macros_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_macros", "extract_keyword", "EXTRACT-KEYWORD", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "cprog1", "CPROG1");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "progfoo", "PROGFOO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "cprogfoo", "CPROGFOO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "cprogn", "CPROGN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "cincf", "CINCF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "deffiltervar", "DEFFILTERVAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "deffilterset", "DEFFILTERSET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "browsing_new_forward_inference", "BROWSING-NEW-FORWARD-INFERENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_macros", "html_print_js_autocomplete_setup", "HTML-PRINT-JS-AUTOCOMPLETE-SETUP");
        return (SubLObject)cb_macros.NIL;
    }
    
    public static SubLObject init_cb_macros_file() {
        return (SubLObject)cb_macros.NIL;
    }
    
    public static SubLObject setup_cb_macros_file() {
        return (SubLObject)cb_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_macros_file();
    }
    
    public void initializeVariables() {
        init_cb_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_macros_file();
    }
    
    static {
        me = (SubLFile)new cb_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$RESULT = SubLObjectFactory.makeUninternedSymbol("RESULT");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym5$FOO = SubLObjectFactory.makeSymbol("FOO");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym7$1_ = SubLObjectFactory.makeSymbol("1+");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INITVAL"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $sym9$NEW_VALUE = SubLObjectFactory.makeUninternedSymbol("NEW-VALUE");
        $str10$SET__A = SubLObjectFactory.makeString("SET-~A");
        $sym11$DEFPARAMETER_HTML = SubLObjectFactory.makeSymbol("DEFPARAMETER-HTML");
        $sym12$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $str13$Accessor_for__A = SubLObjectFactory.makeString("Accessor for ~A");
        $sym14$RET = SubLObjectFactory.makeSymbol("RET");
        $str15$Set_function_for__A = SubLObjectFactory.makeString("Set function for ~A");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("INITVAL"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $str17$_CB_USE__A_ = SubLObjectFactory.makeString("*CB-USE-~A*");
        $str18$_CB__A_ = SubLObjectFactory.makeString("*CB-~A*");
        $sym19$DEFFILTERVAR = SubLObjectFactory.makeSymbol("DEFFILTERVAR");
        $str20$Should_we_use_the_content_of__A__ = SubLObjectFactory.makeString("Should we use the content of ~A. This is set to nil when the user is not filtering based on this parameter.");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIGGERING-ASSERTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*BROWSE-FORWARD-INFERENCES?*"), (SubLObject)cb_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*"), (SubLObject)cb_macros.T));
        $sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = SubLObjectFactory.makeSymbol("PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE")));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-ELT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONTAINER-ELT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-RESULTS"), (SubLObject)SubLObjectFactory.makeInteger(50)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-QUERY-LENGTH"), (SubLObject)cb_macros.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMBEDDED-IN-TOOLBAR-FRAME?"), (SubLObject)cb_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER-TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-RESULTS"), (SubLObject)SubLObjectFactory.makeKeyword("MIN-QUERY-LENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER-TERM"));
        $kw27$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw28$MAX_RESULTS = SubLObjectFactory.makeKeyword("MAX-RESULTS");
        $int29$50 = SubLObjectFactory.makeInteger(50);
        $kw30$MIN_QUERY_LENGTH = SubLObjectFactory.makeKeyword("MIN-QUERY-LENGTH");
        $kw31$EMBEDDED_IN_TOOLBAR_FRAME_ = SubLObjectFactory.makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?");
        $kw32$FILTER_TERM = SubLObjectFactory.makeKeyword("FILTER-TERM");
        $const33$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = SubLObjectFactory.makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");
    }
}

/*

	Total time: 50 ms
	
*/