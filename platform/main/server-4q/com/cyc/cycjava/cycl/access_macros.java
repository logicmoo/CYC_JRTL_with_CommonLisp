package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class access_macros extends SubLTranslatedFile {
    public static final SubLFile me = new access_macros();

    public static final String myName = "com.cyc.cycjava.cycl.access_macros";

    public static final String myFingerPrint = "a98d211a863b331c3aec51778ccd65ce209743b0928b0082a20f04d05815608d";



    // deflexical
    private static final SubLSymbol $external_access_methods$ = makeSymbol("*EXTERNAL-ACCESS-METHODS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));









    public static final SubLSymbol PUBLIC = makeSymbol("PUBLIC");







    public static final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list10 = list(makeKeyword("MACRO"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLString $str13$Macro_or_list_of_macros_must_be_s = makeString("Macro or list of macros must be specified, not ~a");

    public static final SubLSymbol REGISTER_MACRO_HELPER = makeSymbol("REGISTER-MACRO-HELPER");



    public static final SubLList $list16 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list18 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DEFMACRO_PROTECTED = makeSymbol("DEFMACRO-PROTECTED");

    public static final SubLList $list20 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    public static final SubLSymbol VACCESS = makeSymbol("VACCESS");



    public static final SubLList $list23 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));





    public static final SubLList $list26 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    public static final SubLSymbol DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");

    public static final SubLSymbol DEFPARAMETER_MACRO_HELPER = makeSymbol("DEFPARAMETER-MACRO-HELPER");

    public static final SubLList $list29 = list(makeSymbol("VARIABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DEFGLOBAL = makeSymbol("DEFGLOBAL");



    private static final SubLSymbol DEFVAR_PROTECTED = makeSymbol("DEFVAR-PROTECTED");

    public static final SubLList $list33 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list34 = list(makeKeyword("REPLACEMENTS"));



    private static final SubLString $str36$Method_or_list_of_methods_must_be = makeString("Method or list of methods must be specified, not ~a");

    private static final SubLSymbol DEFINE_OBSOLETE_REGISTER = makeSymbol("DEFINE-OBSOLETE-REGISTER");

    private static final SubLList $list38 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFMACRO_OBSOLETE_WARNING = makeSymbol("DEFMACRO-OBSOLETE-WARNING");

    private static final SubLString $str40$Macro__S_is_obsolete = makeString("Macro ~S is obsolete");

    private static final SubLString $str41$____use_ = makeString(" -- use ");

    private static final SubLString $str42$_S_ = makeString("~S ");

    private static final SubLString $str43$instead_ = makeString("instead.");

    private static final SubLString $str44$_A = makeString("~A");

    private static final SubLSymbol $external_symbols$ = makeSymbol("*EXTERNAL-SYMBOLS*");

    private static final SubLInteger $int$400 = makeInteger(400);





    private static final SubLSymbol REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");



    private static final SubLSymbol DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");

    private static final SubLSymbol DEFCONSTANT_PUBLIC = makeSymbol("DEFCONSTANT-PUBLIC");

    private static final SubLSymbol DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");

    private static final SubLSymbol DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");

    private static final SubLSymbol DEFGLOBAL_PUBLIC = makeSymbol("DEFGLOBAL-PUBLIC");

    private static final SubLSymbol DEFVAR_PUBLIC = makeSymbol("DEFVAR-PUBLIC");

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("DEFINE-PRIVATE"), makeSymbol("DEFINE-PROTECTED"), makeSymbol("DEFINE-PUBLIC"), makeSymbol("DEFINE-MACRO-HELPER"), makeSymbol("DEFMACRO-PRIVATE"), makeSymbol("DEFMACRO-PROTECTED"), makeSymbol("DEFMACRO-PUBLIC"), makeSymbol("DEFMACRO-MACRO-HELPER"), makeSymbol("DEFCONSTANT-PRIVATE"), makeSymbol("DEFCONSTANT-PROTECTED"), makeSymbol("DEFCONSTANT-PUBLIC"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFLEXICAL-PROTECTED"), makeSymbol("DEFLEXICAL-PUBLIC"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFGLOBAL-PROTECTED"), makeSymbol("DEFGLOBAL-PUBLIC"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DEFPARAMETER-PROTECTED"), makeSymbol("DEFPARAMETER-PUBLIC"), makeSymbol("DEFVAR-PRIVATE"), makeSymbol("DEFVAR-PROTECTED"), makeSymbol("DEFVAR-PUBLIC") });

    private static final SubLSymbol $MACRO_HELPER_FOR = makeKeyword("MACRO-HELPER-FOR");

    public static SubLObject define_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PUBLIC, name))), listS(DEFINE, name, arglist, append(body, NIL)));
    }

    public static SubLObject define_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PROTECTED, name))), listS(DEFINE, name, arglist, append(body, NIL)));
    }

    public static SubLObject define_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PRIVATE, name))), listS(DEFINE, name, arglist, append(body, NIL)));
    }

    public static SubLObject define_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$1, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject macro_tail = property_list_member($MACRO, current);
        final SubLObject macro = (NIL != macro_tail) ? cadr(macro_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(macro))) {
            Errors.error($str13$Macro_or_list_of_macros_must_be_s, macro);
        }
        return list(PROGN, list(REGISTER_MACRO_HELPER, list(QUOTE, name), list(QUOTE, macro)), listS(DEFINE_PROTECTED, name, arglist, append(body, NIL)));
    }

    public static SubLObject symbol_or_symbol_list_p(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return T;
        }
        if (v_object.isAtom()) {
            return NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.isSymbol()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject defmacro_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        pattern = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PUBLIC, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
    }

    public static SubLObject defmacro_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        pattern = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PROTECTED, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
    }

    public static SubLObject defmacro_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        pattern = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PRIVATE, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
    }

    public static SubLObject defmacro_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list18);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list18);
            if (NIL == member(current_$2, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list18);
        }
        final SubLObject macro_tail = property_list_member($MACRO, current);
        final SubLObject macro = (NIL != macro_tail) ? cadr(macro_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(macro))) {
            Errors.error($str13$Macro_or_list_of_macros_must_be_s, macro);
        }
        return list(PROGN, list(REGISTER_MACRO_HELPER, list(QUOTE, name), list(QUOTE, macro)), listS(DEFMACRO_PROTECTED, name, pattern, append(body, NIL)));
    }

    public static SubLObject defconstant_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject defconstant_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject defconstant_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject deflexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject deflexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject deflexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defparameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject defparameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject defparameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject defparameter_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list26);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list26);
            if (NIL == member(current_$3, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list26);
        }
        final SubLObject macro_tail = property_list_member($MACRO, current);
        final SubLObject macro = (NIL != macro_tail) ? cadr(macro_tail) : NIL;
        current = temp;
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(macro))) {
                Errors.error($str13$Macro_or_list_of_macros_must_be_s, macro);
            }
            return list(DEFPARAMETER_PROTECTED, variable, initialization, documentation);
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    public static SubLObject defglobal_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defglobal_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defglobal_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defvar_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defvar_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defvar_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defvar_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list26);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list26);
            if (NIL == member(current_$4, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list26);
        }
        final SubLObject macro_tail = property_list_member($MACRO, current);
        final SubLObject macro = (NIL != macro_tail) ? cadr(macro_tail) : NIL;
        current = temp;
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(macro))) {
                Errors.error($str13$Macro_or_list_of_macros_must_be_s, macro);
            }
            return list(DEFVAR_PROTECTED, variable, initialization, documentation);
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    public static SubLObject define_obsolete(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list33);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list33);
            if (NIL == member(current_$5, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list33);
        }
        final SubLObject replacements_tail = property_list_member($REPLACEMENTS, current);
        SubLObject replacements = (NIL != replacements_tail) ? cadr(replacements_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(replacements))) {
            Errors.error($str36$Method_or_list_of_methods_must_be, replacements);
        }
        if (!replacements.isList()) {
            replacements = list(replacements);
        }
        return list(PROGN, list(DEFINE_OBSOLETE_REGISTER, list(QUOTE, name), list(QUOTE, append(replacements, NIL))), listS(DEFINE_PROTECTED, name, arglist, append(body, NIL)));
    }

    public static SubLObject define_obsolete_register(final SubLObject v_obsolete, final SubLObject replacements) {
        return v_obsolete;
    }

    public static SubLObject defmacro_obsolete(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$6, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject replacements_tail = property_list_member($REPLACEMENTS, current);
        SubLObject replacements = (NIL != replacements_tail) ? cadr(replacements_tail) : NIL;
        SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == symbol_or_symbol_list_p(replacements))) {
            Errors.error($str36$Method_or_list_of_methods_must_be, replacements);
        }
        if (!replacements.isList()) {
            replacements = list(replacements);
        }
        SubLObject documentation = NIL;
        if (body.first().isString()) {
            documentation = body.first();
            body = body.rest();
        }
        return listS(DEFMACRO_PROTECTED, name, pattern, append(NIL != documentation ? list(documentation) : NIL, NIL != replacements ? list(list(DEFMACRO_OBSOLETE_WARNING, list(QUOTE, name), list(QUOTE, append(replacements, NIL)))) : NIL, body, NIL));
    }

    public static SubLObject defmacro_obsolete_warning(final SubLObject v_obsolete, final SubLObject replacements) {
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $str40$Macro__S_is_obsolete, v_obsolete);
            if (NIL != replacements) {
                princ($str41$____use_, stream);
                SubLObject cdolist_list_var = replacements;
                SubLObject replacement = NIL;
                replacement = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str42$_S_, replacement);
                    cdolist_list_var = cdolist_list_var.rest();
                    replacement = cdolist_list_var.first();
                } 
                princ($str43$instead_, stream);
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Errors.warn($str44$_A, string);
    }

    public static SubLObject register_external_symbol(final SubLObject symbol) {
        sethash(symbol, $external_symbols$.getGlobalValue(), T);
        return symbol;
    }

    public static SubLObject external_symbol_p(final SubLObject v_object) {
        return gethash_without_values(v_object, $external_symbols$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject external_function_p(final SubLObject v_object) {
        return makeBoolean((v_object.isFunctionSpec() && (!v_object.isMacroOperator())) && (NIL != external_symbol_p(v_object)));
    }

    public static SubLObject external_macro_p(final SubLObject v_object) {
        return makeBoolean(v_object.isMacroOperator() && (NIL != external_symbol_p(v_object)));
    }

    public static SubLObject all_external_symbols() {
        SubLObject external_symbols = NIL;
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($external_symbols$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                symbol = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                external_symbols = cons(symbol, external_symbols);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        external_symbols = Sort.sort(external_symbols, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        return external_symbols;
    }

    public static SubLObject define_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFINE_PUBLIC, name, arglist, append(body, NIL)));
    }

    public static SubLObject defmacro_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFMACRO_PUBLIC, name, arglist, append(body, NIL)));
    }

    public static SubLObject defconstant_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject initialization = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list20);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFCONSTANT_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject deflexical_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFLEXICAL_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defparameter_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFPARAMETER_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defglobal_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFGLOBAL_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject defvar_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFVAR_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject register_macro_helper(final SubLObject helper, final SubLObject macro) {
        SubLObject macros = get(helper, $MACRO_HELPER_FOR, UNPROVIDED);
        if (macro.isCons()) {
            SubLObject cdolist_list_var = macro;
            SubLObject one_macro = NIL;
            one_macro = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = one_macro;
                if (NIL == member(item_var, macros, symbol_function(EQL), symbol_function(IDENTITY))) {
                    macros = cons(item_var, macros);
                }
                cdolist_list_var = cdolist_list_var.rest();
                one_macro = cdolist_list_var.first();
            } 
        } else
            if (NIL == member(macro, macros, symbol_function(EQL), symbol_function(IDENTITY))) {
                macros = cons(macro, macros);
            }

        put(helper, $MACRO_HELPER_FOR, macros);
        return helper;
    }

    public static SubLObject macro_helper_for_macroP(final SubLObject helper, final SubLObject macro) {
        return member(macro, get(helper, $MACRO_HELPER_FOR, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject macro_helper_for_any_of_macrosP(final SubLObject helper, final SubLObject macros) {
        SubLObject helperP = NIL;
        if (NIL == helperP) {
            SubLObject csome_list_var = macros;
            SubLObject macro = NIL;
            macro = csome_list_var.first();
            while ((NIL == helperP) && (NIL != csome_list_var)) {
                if (NIL != macro_helper_for_macroP(helper, macro)) {
                    helperP = macro;
                }
                csome_list_var = csome_list_var.rest();
                macro = csome_list_var.first();
            } 
        }
        return helperP;
    }

    public static SubLObject declare_access_macros_file() {
        declareMacro(me, "define_public", "DEFINE-PUBLIC");
        declareMacro(me, "define_protected", "DEFINE-PROTECTED");
        declareMacro(me, "define_private", "DEFINE-PRIVATE");
        declareMacro(me, "define_macro_helper", "DEFINE-MACRO-HELPER");
        declareFunction(me, "symbol_or_symbol_list_p", "SYMBOL-OR-SYMBOL-LIST-P", 1, 0, false);
        declareMacro(me, "defmacro_public", "DEFMACRO-PUBLIC");
        declareMacro(me, "defmacro_protected", "DEFMACRO-PROTECTED");
        declareMacro(me, "defmacro_private", "DEFMACRO-PRIVATE");
        declareMacro(me, "defmacro_macro_helper", "DEFMACRO-MACRO-HELPER");
        declareMacro(me, "defconstant_public", "DEFCONSTANT-PUBLIC");
        declareMacro(me, "defconstant_protected", "DEFCONSTANT-PROTECTED");
        declareMacro(me, "defconstant_private", "DEFCONSTANT-PRIVATE");
        declareMacro(me, "deflexical_public", "DEFLEXICAL-PUBLIC");
        declareMacro(me, "deflexical_protected", "DEFLEXICAL-PROTECTED");
        declareMacro(me, "deflexical_private", "DEFLEXICAL-PRIVATE");
        declareMacro(me, "defparameter_public", "DEFPARAMETER-PUBLIC");
        declareMacro(me, "defparameter_protected", "DEFPARAMETER-PROTECTED");
        declareMacro(me, "defparameter_private", "DEFPARAMETER-PRIVATE");
        declareMacro(me, "defparameter_macro_helper", "DEFPARAMETER-MACRO-HELPER");
        declareMacro(me, "defglobal_public", "DEFGLOBAL-PUBLIC");
        declareMacro(me, "defglobal_protected", "DEFGLOBAL-PROTECTED");
        declareMacro(me, "defglobal_private", "DEFGLOBAL-PRIVATE");
        declareMacro(me, "defvar_public", "DEFVAR-PUBLIC");
        declareMacro(me, "defvar_protected", "DEFVAR-PROTECTED");
        declareMacro(me, "defvar_private", "DEFVAR-PRIVATE");
        declareMacro(me, "defvar_macro_helper", "DEFVAR-MACRO-HELPER");
        declareMacro(me, "define_obsolete", "DEFINE-OBSOLETE");
        declareFunction(me, "define_obsolete_register", "DEFINE-OBSOLETE-REGISTER", 2, 0, false);
        declareMacro(me, "defmacro_obsolete", "DEFMACRO-OBSOLETE");
        declareFunction(me, "defmacro_obsolete_warning", "DEFMACRO-OBSOLETE-WARNING", 2, 0, false);
        declareFunction(me, "register_external_symbol", "REGISTER-EXTERNAL-SYMBOL", 1, 0, false);
        declareFunction(me, "external_symbol_p", "EXTERNAL-SYMBOL-P", 1, 0, false);
        declareFunction(me, "external_function_p", "EXTERNAL-FUNCTION-P", 1, 0, false);
        declareFunction(me, "external_macro_p", "EXTERNAL-MACRO-P", 1, 0, false);
        declareFunction(me, "all_external_symbols", "ALL-EXTERNAL-SYMBOLS", 0, 0, false);
        declareMacro(me, "define_external", "DEFINE-EXTERNAL");
        declareMacro(me, "defmacro_external", "DEFMACRO-EXTERNAL");
        declareMacro(me, "defconstant_external", "DEFCONSTANT-EXTERNAL");
        declareMacro(me, "deflexical_external", "DEFLEXICAL-EXTERNAL");
        declareMacro(me, "defparameter_external", "DEFPARAMETER-EXTERNAL");
        declareMacro(me, "defglobal_external", "DEFGLOBAL-EXTERNAL");
        declareMacro(me, "defvar_external", "DEFVAR-EXTERNAL");
        declareFunction(me, "register_macro_helper", "REGISTER-MACRO-HELPER", 2, 0, false);
        declareFunction(me, "macro_helper_for_macroP", "MACRO-HELPER-FOR-MACRO?", 2, 0, false);
        declareFunction(me, "macro_helper_for_any_of_macrosP", "MACRO-HELPER-FOR-ANY-OF-MACROS?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_access_macros_file() {
        deflexical("*EXTERNAL-SYMBOLS*", SubLTrampolineFile.maybeDefault($external_symbols$, $external_symbols$, () -> make_hash_table($int$400, symbol_function(EQ), UNPROVIDED)));
        deflexical("*EXTERNAL-ACCESS-METHODS*", $list57);
        return NIL;
    }

    public static SubLObject setup_access_macros_file() {
        meta_macros.declare_indention_pattern(DEFPARAMETER_MACRO_HELPER, $list29);
        SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_external_symbol(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_access_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_access_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_access_macros_file();
    }

    static {






























































    }
}

/**
 * Total time: 221 ms
 */
