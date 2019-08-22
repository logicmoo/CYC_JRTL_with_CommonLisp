/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-MACROS
 * source file: /cyc/top/cycl/cb-macros.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_macros();

 public static final String myName = "com.cyc.cycjava.cycl.cb_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("ANSWER-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLList $list6 = list(makeSymbol("PLACE"));

    static private final SubLSymbol $sym7$1_ = makeSymbol("1+");

    static private final SubLList $list8 = list(makeSymbol("VAR"), makeSymbol("INITVAL"), makeSymbol("COMMENT"));

    static private final SubLSymbol $sym9$NEW_VALUE = makeUninternedSymbol("NEW-VALUE");

    static private final SubLString $str10$SET__A = makeString("SET-~A");

    private static final SubLSymbol DEFPARAMETER_HTML = makeSymbol("DEFPARAMETER-HTML");

    static private final SubLString $str13$Accessor_for__A = makeString("Accessor for ~A");

    static private final SubLString $str15$Set_function_for__A = makeString("Set function for ~A");

    static private final SubLList $list16 = list(makeSymbol("ROOT"), makeSymbol("INITVAL"), makeSymbol("COMMENT"));

    static private final SubLString $str17$_CB_USE__A_ = makeString("*CB-USE-~A*");

    static private final SubLString $str18$_CB__A_ = makeString("*CB-~A*");

    private static final SubLSymbol DEFFILTERVAR = makeSymbol("DEFFILTERVAR");

    static private final SubLString $str20$Should_we_use_the_content_of__A__ = makeString("Should we use the content of ~A. This is set to nil when the user is not filtering based on this parameter.");

    static private final SubLList $list21 = list(list(makeSymbol("TRIGGERING-ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list22 = list(list(makeSymbol("*BROWSE-FORWARD-INFERENCES?*"), T), list(makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK*"), list(QUOTE, makeSymbol("CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING"))), list(makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*"), T));

    private static final SubLSymbol PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol("PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");

    static private final SubLList $list24 = list(list(makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE")));

    static private final SubLList $list25 = list(makeSymbol("INPUT-ELT-NAME"), makeSymbol("CONTAINER-ELT-NAME"), makeSymbol("&KEY"), list(makeSymbol("MAX-RESULTS"), makeInteger(50)), list(makeSymbol("MIN-QUERY-LENGTH"), THREE_INTEGER), list(makeSymbol("EMBEDDED-IN-TOOLBAR-FRAME?"), NIL), list(makeSymbol("FILTER-TERM"), reader_make_constant_shell("Thing")));

    static private final SubLList $list26 = list(makeKeyword("MAX-RESULTS"), makeKeyword("MIN-QUERY-LENGTH"), makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?"), makeKeyword("FILTER-TERM"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol $MIN_QUERY_LENGTH = makeKeyword("MIN-QUERY-LENGTH");

    private static final SubLSymbol $kw31$EMBEDDED_IN_TOOLBAR_FRAME_ = makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?");



    private static final SubLSymbol HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");

    // Definitions
    /**
     * Searches the arglist for keyword key, and returns the following mark,
     * or the default if supplied. If no-value is non-nil, then if nothing follows
     * the key it is returned.
     */
    @LispMethod(comment = "Searches the arglist for keyword key, and returns the following mark,\r\nor the default if supplied. If no-value is non-nil, then if nothing follows\r\nthe key it is returned.\nSearches the arglist for keyword key, and returns the following mark,\nor the default if supplied. If no-value is non-nil, then if nothing follows\nthe key it is returned.")
    public static final SubLObject extract_keyword_alt(SubLObject key, SubLObject arglist, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject binding = member(key, arglist, UNPROVIDED, UNPROVIDED);
            if (NIL != binding.rest()) {
                return cadr(binding);
            } else {
                return v_default;
            }
        }
    }

    // Definitions
    /**
     * Searches the arglist for keyword key, and returns the following mark,
     * or the default if supplied. If no-value is non-nil, then if nothing follows
     * the key it is returned.
     */
    @LispMethod(comment = "Searches the arglist for keyword key, and returns the following mark,\r\nor the default if supplied. If no-value is non-nil, then if nothing follows\r\nthe key it is returned.\nSearches the arglist for keyword key, and returns the following mark,\nor the default if supplied. If no-value is non-nil, then if nothing follows\nthe key it is returned.")
    public static SubLObject extract_keyword(final SubLObject key, final SubLObject arglist, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject binding = member(key, arglist, UNPROVIDED, UNPROVIDED);
        if (NIL != binding.rest()) {
            return cadr(binding);
        }
        return v_default;
    }

    /**
     * Vaguely similar to prog1; the first expression in body must be functional; answer-var is
     * csetq to the result.
     */
    @LispMethod(comment = "Vaguely similar to prog1; the first expression in body must be functional; answer-var is\r\ncsetq to the result.\nVaguely similar to prog1; the first expression in body must be functional; answer-var is\ncsetq to the result.")
    public static final SubLObject cprog1_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject answer_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            answer_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject result = $sym1$RESULT;
                return listS(CLET, list(list(result, body.first())), append(body.rest(), list(list(CSETQ, answer_var, result))));
            }
        }
    }

    /**
     * Vaguely similar to prog1; the first expression in body must be functional; answer-var is
     * csetq to the result.
     */
    @LispMethod(comment = "Vaguely similar to prog1; the first expression in body must be functional; answer-var is\r\ncsetq to the result.\nVaguely similar to prog1; the first expression in body must be functional; answer-var is\ncsetq to the result.")
    public static SubLObject cprog1(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        answer_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject result = $sym1$RESULT;
        return listS(CLET, list(list(result, body.first())), append(body.rest(), list(list(CSETQ, answer_var, result))));
    }

    /**
     * Like cprog1, but answer-var is always 'foo', and visible inside the body, modulo the first expression. That is, the caller has to have a foo available.
     */
    @LispMethod(comment = "Like cprog1, but answer-var is always \'foo\', and visible inside the body, modulo the first expression. That is, the caller has to have a foo available.")
    public static final SubLObject progfoo_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, list(CSETQ, FOO, body.first()), append(body.rest(), NIL));
        }
    }

    /**
     * Like cprog1, but answer-var is always 'foo', and visible inside the body, modulo the first expression. That is, the caller has to have a foo available.
     */
    @LispMethod(comment = "Like cprog1, but answer-var is always \'foo\', and visible inside the body, modulo the first expression. That is, the caller has to have a foo available.")
    public static SubLObject progfoo(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, list(CSETQ, FOO, body.first()), append(body.rest(), NIL));
    }

    /**
     * Like cprog1, but there is no answer-var. Within the body, after the first functional expression,
     * the result of the first expression is bound to the variable 'foo'.
     */
    @LispMethod(comment = "Like cprog1, but there is no answer-var. Within the body, after the first functional expression,\r\nthe result of the first expression is bound to the variable \'foo\'.\nLike cprog1, but there is no answer-var. Within the body, after the first functional expression,\nthe result of the first expression is bound to the variable \'foo\'.")
    public static final SubLObject cprogfoo_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, list(list(FOO, body.first())), append(body.rest(), NIL));
        }
    }

    /**
     * Like cprog1, but there is no answer-var. Within the body, after the first functional expression,
     * the result of the first expression is bound to the variable 'foo'.
     */
    @LispMethod(comment = "Like cprog1, but there is no answer-var. Within the body, after the first functional expression,\r\nthe result of the first expression is bound to the variable \'foo\'.\nLike cprog1, but there is no answer-var. Within the body, after the first functional expression,\nthe result of the first expression is bound to the variable \'foo\'.")
    public static SubLObject cprogfoo(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, list(list(FOO, body.first())), append(body.rest(), NIL));
    }

    /**
     * Vaguely similar to progn, but the answer-var (which must be created by the caller) is bound to the last expression in the body, which must be functional.
     */
    @LispMethod(comment = "Vaguely similar to progn, but the answer-var (which must be created by the caller) is bound to the last expression in the body, which must be functional.")
    public static final SubLObject cprogn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject answer_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            answer_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return bq_cons(PROGN, append(butlast(body, UNPROVIDED), list(list(CSETQ, answer_var, last(body, UNPROVIDED)))));
            }
        }
    }

    /**
     * Vaguely similar to progn, but the answer-var (which must be created by the caller) is bound to the last expression in the body, which must be functional.
     */
    @LispMethod(comment = "Vaguely similar to progn, but the answer-var (which must be created by the caller) is bound to the last expression in the body, which must be functional.")
    public static SubLObject cprogn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        answer_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return bq_cons(PROGN, append(butlast(body, UNPROVIDED), list(list(CSETQ, answer_var, last(body, UNPROVIDED)))));
    }

    public static final SubLObject cincf_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject place = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            place = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, place, list($sym7$1_, place));
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static SubLObject cincf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, place, list($sym7$1_, place));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static final SubLObject deffiltervar_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject initval = NIL;
            SubLObject comment = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            initval = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            comment = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_value = $sym9$NEW_VALUE;
                    SubLObject varname = Strings.string(var);
                    SubLObject getter_name = subseq(varname, ONE_INTEGER, number_utilities.f_1_(length(varname)));
                    SubLObject getter = intern(getter_name, UNPROVIDED);
                    SubLObject setter = intern(format(NIL, $str_alt10$SET__A, getter_name), UNPROVIDED);
                    return list(PROGN, list(DEFPARAMETER_HTML, var, initval, comment), list(DEFINE, getter, NIL, format(NIL, $str_alt13$Accessor_for__A, varname), list(RET, var)), list(DEFINE, setter, list(new_value), format(NIL, $str_alt15$Set_function_for__A, varname), list(CSETQ, var, new_value), list(RET, var)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt8);
            }
        }
        return NIL;
    }

    public static SubLObject deffiltervar(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        SubLObject initval = NIL;
        SubLObject comment = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        initval = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        comment = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_value = $sym9$NEW_VALUE;
            final SubLObject varname = Strings.string(var);
            final SubLObject getter_name = subseq(varname, ONE_INTEGER, number_utilities.f_1_(length(varname)));
            final SubLObject getter = intern(getter_name, UNPROVIDED);
            final SubLObject setter = intern(format(NIL, $str10$SET__A, getter_name), UNPROVIDED);
            return list(PROGN, list(DEFPARAMETER_HTML, var, initval, comment), list(DEFINE, getter, NIL, format(NIL, $str13$Accessor_for__A, varname), list(RET, var)), list(DEFINE, setter, list(new_value), format(NIL, $str15$Set_function_for__A, varname), list(CSETQ, var, new_value), list(RET, var)));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static final SubLObject deffilterset_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject root = NIL;
            SubLObject initval = NIL;
            SubLObject comment = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            root = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            initval = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            comment = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject use_p = intern(format(NIL, $str_alt17$_CB_USE__A_, Strings.string_upcase(Strings.string(root), UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                    SubLObject filter_params = format(NIL, $str_alt18$_CB__A_, Strings.string_upcase(Strings.string(root), UNPROVIDED, UNPROVIDED));
                    return list(PROGN, list(DEFFILTERVAR, use_p, NIL, format(NIL, $str_alt20$Should_we_use_the_content_of__A__, Strings.string_downcase(filter_params, UNPROVIDED, UNPROVIDED))), list(DEFFILTERVAR, intern(filter_params, UNPROVIDED), initval, comment));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt16);
            }
        }
        return NIL;
    }

    public static SubLObject deffilterset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject root = NIL;
        SubLObject initval = NIL;
        SubLObject comment = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        root = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        initval = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        comment = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject use_p = intern(format(NIL, $str17$_CB_USE__A_, Strings.string_upcase(Strings.string(root), UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            final SubLObject filter_params = format(NIL, $str18$_CB__A_, Strings.string_upcase(Strings.string(root), UNPROVIDED, UNPROVIDED));
            return list(PROGN, list(DEFFILTERVAR, use_p, NIL, format(NIL, $str20$Should_we_use_the_content_of__A__, Strings.string_downcase(filter_params, UNPROVIDED, UNPROVIDED))), list(DEFFILTERVAR, intern(filter_params, UNPROVIDED), initval, comment));
        }
        cdestructuring_bind_error(datum, $list16);
        return NIL;
    }

    public static final SubLObject browsing_new_forward_inference_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject triggering_assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    triggering_assertion = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt22, list(PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, triggering_assertion), append(body, $list_alt24));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject browsing_new_forward_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject triggering_assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        triggering_assertion = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list22, list(PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, triggering_assertion), append(body, $list24));
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    public static final SubLObject html_print_js_autocomplete_setup_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject input_elt_name = NIL;
            SubLObject container_elt_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            input_elt_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            container_elt_name = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt25);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt25);
                    if (NIL == member(current_1, $list_alt26, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt25);
                }
                {
                    SubLObject max_results_tail = property_list_member($MAX_RESULTS, current);
                    SubLObject max_results = (NIL != max_results_tail) ? ((SubLObject) (cadr(max_results_tail))) : $int$50;
                    SubLObject min_query_length_tail = property_list_member($MIN_QUERY_LENGTH, current);
                    SubLObject min_query_length = (NIL != min_query_length_tail) ? ((SubLObject) (cadr(min_query_length_tail))) : THREE_INTEGER;
                    SubLObject embedded_in_toolbar_frameP_tail = property_list_member($kw31$EMBEDDED_IN_TOOLBAR_FRAME_, current);
                    SubLObject embedded_in_toolbar_frameP = (NIL != embedded_in_toolbar_frameP_tail) ? ((SubLObject) (cadr(embedded_in_toolbar_frameP_tail))) : NIL;
                    SubLObject filter_term_tail = property_list_member($FILTER_TERM, current);
                    SubLObject filter_term = (NIL != filter_term_tail) ? ((SubLObject) (cadr(filter_term_tail))) : $$Thing;
                    return list(HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_elt_name, container_elt_name, max_results, min_query_length, embedded_in_toolbar_frameP, filter_term);
                }
            }
        }
    }

    public static SubLObject html_print_js_autocomplete_setup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject input_elt_name = NIL;
        SubLObject container_elt_name = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        input_elt_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        container_elt_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$1, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject max_results_tail = property_list_member($MAX_RESULTS, current);
        final SubLObject max_results = (NIL != max_results_tail) ? cadr(max_results_tail) : $int$50;
        final SubLObject min_query_length_tail = property_list_member($MIN_QUERY_LENGTH, current);
        final SubLObject min_query_length = (NIL != min_query_length_tail) ? cadr(min_query_length_tail) : THREE_INTEGER;
        final SubLObject embedded_in_toolbar_frameP_tail = property_list_member($kw31$EMBEDDED_IN_TOOLBAR_FRAME_, current);
        final SubLObject embedded_in_toolbar_frameP = (NIL != embedded_in_toolbar_frameP_tail) ? cadr(embedded_in_toolbar_frameP_tail) : NIL;
        final SubLObject filter_term_tail = property_list_member($FILTER_TERM, current);
        final SubLObject filter_term = (NIL != filter_term_tail) ? cadr(filter_term_tail) : $$Thing;
        return list(HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_elt_name, container_elt_name, max_results, min_query_length, embedded_in_toolbar_frameP, filter_term);
    }

    public static SubLObject declare_cb_macros_file() {
        declareFunction("extract_keyword", "EXTRACT-KEYWORD", 2, 1, false);
        declareMacro("cprog1", "CPROG1");
        declareMacro("progfoo", "PROGFOO");
        declareMacro("cprogfoo", "CPROGFOO");
        declareMacro("cprogn", "CPROGN");
        declareMacro("cincf", "CINCF");
        declareMacro("deffiltervar", "DEFFILTERVAR");
        declareMacro("deffilterset", "DEFFILTERSET");
        declareMacro("browsing_new_forward_inference", "BROWSING-NEW-FORWARD-INFERENCE");
        declareMacro("html_print_js_autocomplete_setup", "HTML-PRINT-JS-AUTOCOMPLETE-SETUP");
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("ANSWER-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(makeSymbol("PLACE"));

    static private final SubLList $list_alt8 = list(makeSymbol("VAR"), makeSymbol("INITVAL"), makeSymbol("COMMENT"));

    static private final SubLString $str_alt10$SET__A = makeString("SET-~A");

    public static SubLObject init_cb_macros_file() {
        return NIL;
    }

    public static SubLObject setup_cb_macros_file() {
        return NIL;
    }

    static private final SubLString $str_alt13$Accessor_for__A = makeString("Accessor for ~A");

    @Override
    public void declareFunctions() {
        declare_cb_macros_file();
    }

    static private final SubLString $str_alt15$Set_function_for__A = makeString("Set function for ~A");

    @Override
    public void initializeVariables() {
        init_cb_macros_file();
    }

    static private final SubLList $list_alt16 = list(makeSymbol("ROOT"), makeSymbol("INITVAL"), makeSymbol("COMMENT"));

    @Override
    public void runTopLevelForms() {
        setup_cb_macros_file();
    }

    

    static private final SubLString $str_alt17$_CB_USE__A_ = makeString("*CB-USE-~A*");

    static private final SubLString $str_alt18$_CB__A_ = makeString("*CB-~A*");

    static private final SubLString $str_alt20$Should_we_use_the_content_of__A__ = makeString("Should we use the content of ~A. This is set to nil when the user is not filtering based on this parameter.");

    static private final SubLList $list_alt21 = list(list(makeSymbol("TRIGGERING-ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(list(makeSymbol("*BROWSE-FORWARD-INFERENCES?*"), T), list(makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK*"), list(QUOTE, makeSymbol("CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING"))));

    static private final SubLList $list_alt24 = list(list(makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE")));

    static private final SubLList $list_alt25 = list(makeSymbol("INPUT-ELT-NAME"), makeSymbol("CONTAINER-ELT-NAME"), makeSymbol("&KEY"), list(makeSymbol("MAX-RESULTS"), makeInteger(50)), list(makeSymbol("MIN-QUERY-LENGTH"), THREE_INTEGER), list(makeSymbol("EMBEDDED-IN-TOOLBAR-FRAME?"), NIL), list(makeSymbol("FILTER-TERM"), reader_make_constant_shell("Thing")));

    static private final SubLList $list_alt26 = list(makeKeyword("MAX-RESULTS"), makeKeyword("MIN-QUERY-LENGTH"), makeKeyword("EMBEDDED-IN-TOOLBAR-FRAME?"), makeKeyword("FILTER-TERM"));
}

/**
 * Total time: 50 ms
 */
