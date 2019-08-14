/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class access_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new access_macros();

 public static final String myName = "com.cyc.cycjava.cycl.access_macros";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $external_access_methods$ = makeSymbol("*EXTERNAL-ACCESS-METHODS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(NAME, ARGLIST, makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PUBLIC = makeSymbol("PUBLIC");

    static private final SubLList $list9 = list(NAME, ARGLIST, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list10 = list(makeKeyword("MACRO"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $str13$Macro_or_list_of_macros_must_be_s = makeString("Macro or list of macros must be specified, not ~a");

    private static final SubLSymbol REGISTER_MACRO_HELPER = makeSymbol("REGISTER-MACRO-HELPER");

    static private final SubLList $list16 = list(NAME, PATTERN, makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list18 = list(NAME, PATTERN, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFMACRO_PROTECTED = makeSymbol("DEFMACRO-PROTECTED");

    static private final SubLList $list20 = list(VARIABLE, makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    private static final SubLSymbol VACCESS = makeSymbol("VACCESS");

    static private final SubLList $list23 = list(VARIABLE, makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list26 = list(VARIABLE, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    private static final SubLSymbol DEFPARAMETER_PROTECTED = makeSymbol("DEFPARAMETER-PROTECTED");

    private static final SubLSymbol DEFPARAMETER_MACRO_HELPER = makeSymbol("DEFPARAMETER-MACRO-HELPER");

    static private final SubLList $list29 = list(VARIABLE, makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFGLOBAL = makeSymbol("DEFGLOBAL");

    private static final SubLSymbol DEFVAR_PROTECTED = makeSymbol("DEFVAR-PROTECTED");

    static private final SubLList $list33 = list(NAME, ARGLIST, list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list34 = list(makeKeyword("REPLACEMENTS"));

    private static final SubLString $str36$Method_or_list_of_methods_must_be = makeString("Method or list of methods must be specified, not ~a");

    private static final SubLSymbol DEFINE_OBSOLETE_REGISTER = makeSymbol("DEFINE-OBSOLETE-REGISTER");

    private static final SubLList $list38 = list(NAME, PATTERN, list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    // Definitions
    /**
     * define NAME as a public function.
     * Public functions can be called anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "define NAME as a public function.\r\nPublic functions can be called anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefine NAME as a public function.\nPublic functions can be called anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject define_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PUBLIC, name))), listS(DEFINE, name, arglist, append(body, NIL)));
            }
        }
    }

    // Definitions
    /**
     * define NAME as a public function.
     * Public functions can be called anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "define NAME as a public function.\r\nPublic functions can be called anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefine NAME as a public function.\nPublic functions can be called anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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

    /**
     * define NAME as a protected function.
     * Protected functions can be called internally from any other defined function.
     * However, they cannot be called from external applications.
     */
    @LispMethod(comment = "define NAME as a protected function.\r\nProtected functions can be called internally from any other defined function.\r\nHowever, they cannot be called from external applications.\ndefine NAME as a protected function.\nProtected functions can be called internally from any other defined function.\nHowever, they cannot be called from external applications.")
    public static final SubLObject define_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PROTECTED, name))), listS(DEFINE, name, arglist, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a protected function.
     * Protected functions can be called internally from any other defined function.
     * However, they cannot be called from external applications.
     */
    @LispMethod(comment = "define NAME as a protected function.\r\nProtected functions can be called internally from any other defined function.\r\nHowever, they cannot be called from external applications.\ndefine NAME as a protected function.\nProtected functions can be called internally from any other defined function.\nHowever, they cannot be called from external applications.")
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

    /**
     * define NAME as a private function.
     * Private functions can only be called from other functions in the same source file.
     */
    @LispMethod(comment = "define NAME as a private function.\r\nPrivate functions can only be called from other functions in the same source file.\ndefine NAME as a private function.\nPrivate functions can only be called from other functions in the same source file.")
    public static final SubLObject define_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PRIVATE, name))), listS(DEFINE, name, arglist, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a private function.
     * Private functions can only be called from other functions in the same source file.
     */
    @LispMethod(comment = "define NAME as a private function.\r\nPrivate functions can only be called from other functions in the same source file.\ndefine NAME as a private function.\nPrivate functions can only be called from other functions in the same source file.")
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

    /**
     * define NAME as a protected function which is a helper for MACRO.
     * It is only expected to be invoked via expansions of MACRO.
     */
    @LispMethod(comment = "define NAME as a protected function which is a helper for MACRO.\r\nIt is only expected to be invoked via expansions of MACRO.\ndefine NAME as a protected function which is a helper for MACRO.\nIt is only expected to be invoked via expansions of MACRO.")
    public static final SubLObject define_macro_helper_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt9);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt9);
                arglist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt9);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt9);
                        }
                        {
                            SubLObject macro_tail = property_list_member($MACRO, current);
                            SubLObject macro = (NIL != macro_tail) ? ((SubLObject) (cadr(macro_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == symbol_or_symbol_list_p(macro)) {
                                        Errors.error($str_alt13$Macro_or_list_of_macros_must_be_s, macro);
                                    }
                                }
                                return list(PROGN, list(REGISTER_MACRO_HELPER, list(QUOTE, name), list(QUOTE, macro)), listS(DEFINE_PROTECTED, name, arglist, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * define NAME as a protected function which is a helper for MACRO.
     * It is only expected to be invoked via expansions of MACRO.
     */
    @LispMethod(comment = "define NAME as a protected function which is a helper for MACRO.\r\nIt is only expected to be invoked via expansions of MACRO.\ndefine NAME as a protected function which is a helper for MACRO.\nIt is only expected to be invoked via expansions of MACRO.")
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

    public static final SubLObject symbol_or_symbol_list_p_alt(SubLObject v_object) {
        if (v_object.isSymbol()) {
            return T;
        } else {
            if (v_object.isAtom()) {
                return NIL;
            } else {
                {
                    SubLObject cdolist_list_var = v_object;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        if (!item.isSymbol()) {
                            return NIL;
                        }
                    }
                }
                return T;
            }
        }
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

    /**
     * define NAME as a public macro.
     * Public macros can be used anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "define NAME as a public macro.\r\nPublic macros can be used anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefine NAME as a public macro.\nPublic macros can be used anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject defmacro_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PUBLIC, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a public macro.
     * Public macros can be used anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "define NAME as a public macro.\r\nPublic macros can be used anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefine NAME as a public macro.\nPublic macros can be used anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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

    /**
     * define NAME as a protected macro.
     * Protected macros can be used internally from any other defined function.
     * However, they cannot be called from external applications.
     */
    @LispMethod(comment = "define NAME as a protected macro.\r\nProtected macros can be used internally from any other defined function.\r\nHowever, they cannot be called from external applications.\ndefine NAME as a protected macro.\nProtected macros can be used internally from any other defined function.\nHowever, they cannot be called from external applications.")
    public static final SubLObject defmacro_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PROTECTED, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a protected macro.
     * Protected macros can be used internally from any other defined function.
     * However, they cannot be called from external applications.
     */
    @LispMethod(comment = "define NAME as a protected macro.\r\nProtected macros can be used internally from any other defined function.\r\nHowever, they cannot be called from external applications.\ndefine NAME as a protected macro.\nProtected macros can be used internally from any other defined function.\nHowever, they cannot be called from external applications.")
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

    /**
     * define NAME as a private macro.
     * Private macros can only be used by other functions in the same source file.
     */
    @LispMethod(comment = "define NAME as a private macro.\r\nPrivate macros can only be used by other functions in the same source file.\ndefine NAME as a private macro.\nPrivate macros can only be used by other functions in the same source file.")
    public static final SubLObject defmacro_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PROCLAIM, list(QUOTE, list(FACCESS, PRIVATE, name))), listS(DEFMACRO, name, pattern, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a private macro.
     * Private macros can only be used by other functions in the same source file.
     */
    @LispMethod(comment = "define NAME as a private macro.\r\nPrivate macros can only be used by other functions in the same source file.\ndefine NAME as a private macro.\nPrivate macros can only be used by other functions in the same source file.")
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

    /**
     * define NAME as a protected macro which is a helper for MACRO.
     * It is only expected to be invoked via expansions of MACRO.
     */
    @LispMethod(comment = "define NAME as a protected macro which is a helper for MACRO.\r\nIt is only expected to be invoked via expansions of MACRO.\ndefine NAME as a protected macro which is a helper for MACRO.\nIt is only expected to be invoked via expansions of MACRO.")
    public static final SubLObject defmacro_macro_helper_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject pattern = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt18);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt18);
                pattern = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt18);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt18);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt18);
                            if (NIL == member(current_2, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt18);
                        }
                        {
                            SubLObject macro_tail = property_list_member($MACRO, current);
                            SubLObject macro = (NIL != macro_tail) ? ((SubLObject) (cadr(macro_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == symbol_or_symbol_list_p(macro)) {
                                        Errors.error($str_alt13$Macro_or_list_of_macros_must_be_s, macro);
                                    }
                                }
                                return list(PROGN, list(REGISTER_MACRO_HELPER, list(QUOTE, name), list(QUOTE, macro)), listS(DEFMACRO_PROTECTED, name, pattern, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * define NAME as a protected macro which is a helper for MACRO.
     * It is only expected to be invoked via expansions of MACRO.
     */
    @LispMethod(comment = "define NAME as a protected macro which is a helper for MACRO.\r\nIt is only expected to be invoked via expansions of MACRO.\ndefine NAME as a protected macro which is a helper for MACRO.\nIt is only expected to be invoked via expansions of MACRO.")
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

    /**
     * defconstant VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefconstant VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject defconstant_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFCONSTANT, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    /**
     * defconstant VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefconstant VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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

    /**
     * defconstant VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefconstant VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
    public static final SubLObject defconstant_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFCONSTANT, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    /**
     * defconstant VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefconstant VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
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

    /**
     * defconstant VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefconstant VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
    public static final SubLObject defconstant_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFCONSTANT, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    /**
     * defconstant VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "defconstant VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefconstant VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
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

    /**
     * deflexical VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "deflexical VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndeflexical VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject deflexical_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFLEXICAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "deflexical VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndeflexical VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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

    /**
     * deflexical VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "deflexical VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndeflexical VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
    public static final SubLObject deflexical_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFLEXICAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * deflexical VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "deflexical VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndeflexical VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
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

    /**
     * deflexical VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "deflexical VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndeflexical VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
    public static final SubLObject deflexical_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFLEXICAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "deflexical VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndeflexical VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
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

    /**
     * defparameter VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "defparameter VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefparameter VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject defparameter_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFPARAMETER, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defparameter VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefparameter VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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
    }/**
     * defparameter VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */


    /**
     * defparameter VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "defparameter VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefparameter VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
    public static final SubLObject defparameter_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFPARAMETER, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defparameter VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefparameter VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
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
    }/**
     * defparameter VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */


    /**
     * defparameter VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "defparameter VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefparameter VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
    public static final SubLObject defparameter_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFPARAMETER, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defparameter VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefparameter VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
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
    }/**
     * defparameter VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */


    /**
     * defparameter VARIABLE and declare that it is a helper for MACRO.
     * It is only expected to be bound via expansions of MACRO.
     */
    @LispMethod(comment = "defparameter VARIABLE and declare that it is a helper for MACRO.\r\nIt is only expected to be bound via expansions of MACRO.\ndefparameter VARIABLE and declare that it is a helper for MACRO.\nIt is only expected to be bound via expansions of MACRO.")
    public static final SubLObject defparameter_macro_helper_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt26);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt26);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt26);
                            if (NIL == member(current_3, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt26);
                        }
                        {
                            SubLObject macro_tail = property_list_member($MACRO, current);
                            SubLObject macro = (NIL != macro_tail) ? ((SubLObject) (cadr(macro_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt26);
                                current = current.rest();
                                {
                                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt26);
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == symbol_or_symbol_list_p(macro)) {
                                                Errors.error($str_alt13$Macro_or_list_of_macros_must_be_s, macro);
                                            }
                                        }
                                        return list(DEFPARAMETER_PROTECTED, variable, initialization, documentation);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt26);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "defparameter VARIABLE and declare that it is a helper for MACRO.\r\nIt is only expected to be bound via expansions of MACRO.\ndefparameter VARIABLE and declare that it is a helper for MACRO.\nIt is only expected to be bound via expansions of MACRO.")
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
    }/**
     * defparameter VARIABLE and declare that it is a helper for MACRO.
     * It is only expected to be bound via expansions of MACRO.
     */


    /**
     * defglobal VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "defglobal VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefglobal VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject defglobal_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFGLOBAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defglobal VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefglobal VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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
    }/**
     * defglobal VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */


    /**
     * defglobal VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "defglobal VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefglobal VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
    public static final SubLObject defglobal_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFGLOBAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defglobal VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefglobal VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
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
    }/**
     * defglobal VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */


    /**
     * defglobal VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "defglobal VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefglobal VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
    public static final SubLObject defglobal_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFGLOBAL, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defglobal VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefglobal VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
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
    }/**
     * defglobal VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */


    /**
     * defvar VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */
    @LispMethod(comment = "defvar VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefvar VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
    public static final SubLObject defvar_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PUBLIC, variable))), list(DEFVAR, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defvar VARIABLE and declare that it is public.\r\nPublic variables can be referenced anywhere, even external applications.\r\nThese are intended to be part of the formal external interface for a code module.\ndefvar VARIABLE and declare that it is public.\nPublic variables can be referenced anywhere, even external applications.\nThese are intended to be part of the formal external interface for a code module.")
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
    }/**
     * defvar VARIABLE and declare that it is public.
     * Public variables can be referenced anywhere, even external applications.
     * These are intended to be part of the formal external interface for a code module.
     */


    /**
     * defvar VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */
    @LispMethod(comment = "defvar VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefvar VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
    public static final SubLObject defvar_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PROTECTED, variable))), list(DEFVAR, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defvar VARIABLE and declare that it is protected.\r\nProtected variables can be referenced internally from any other defined function.\r\nHowever, they cannot be referenced from external applications.\ndefvar VARIABLE and declare that it is protected.\nProtected variables can be referenced internally from any other defined function.\nHowever, they cannot be referenced from external applications.")
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
    }/**
     * defvar VARIABLE and declare that it is protected.
     * Protected variables can be referenced internally from any other defined function.
     * However, they cannot be referenced from external applications.
     */


    /**
     * defvar VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */
    @LispMethod(comment = "defvar VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefvar VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
    public static final SubLObject defvar_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(PROCLAIM, list(QUOTE, list(VACCESS, PRIVATE, variable))), list(DEFVAR, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defvar VARIABLE and declare that it is private.\r\nPrivate variables can only be referenced inside its own source file.\ndefvar VARIABLE and declare that it is private.\nPrivate variables can only be referenced inside its own source file.")
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
    }/**
     * defvar VARIABLE and declare that it is private.
     * Private variables can only be referenced inside its own source file.
     */


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

    /**
     * Declare function NAME ARGLIST BODY.
     * Note that it is obsolete, and that REPLACEMENTS should be used instead.
     */
    @LispMethod(comment = "Declare function NAME ARGLIST BODY.\r\nNote that it is obsolete, and that REPLACEMENTS should be used instead.\nDeclare function NAME ARGLIST BODY.\nNote that it is obsolete, and that REPLACEMENTS should be used instead.")
    public static final SubLObject define_obsolete_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt32);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt32);
                arglist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt32);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt32);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt32);
                            if (NIL == member(current_4, $list_alt33, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt32);
                        }
                        {
                            SubLObject replacements_tail = property_list_member($REPLACEMENTS, current);
                            SubLObject replacements = (NIL != replacements_tail) ? ((SubLObject) (cadr(replacements_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == symbol_or_symbol_list_p(replacements)) {
                                        Errors.error($str_alt35$Method_or_list_of_methods_must_be, replacements);
                                    }
                                }
                                if (!replacements.isList()) {
                                    replacements = list(replacements);
                                }
                                return list(PROGN, list(DEFINE_OBSOLETE_REGISTER, list(QUOTE, name), list(QUOTE, append(replacements, NIL))), listS(DEFINE_PROTECTED, name, arglist, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Declare function NAME ARGLIST BODY.\r\nNote that it is obsolete, and that REPLACEMENTS should be used instead.\nDeclare function NAME ARGLIST BODY.\nNote that it is obsolete, and that REPLACEMENTS should be used instead.")
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
    }/**
     * Declare function NAME ARGLIST BODY.
     * Note that it is obsolete, and that REPLACEMENTS should be used instead.
     */


    public static final SubLObject define_obsolete_register_alt(SubLObject v_obsolete, SubLObject replacements) {
        return v_obsolete;
    }

    public static SubLObject define_obsolete_register(final SubLObject v_obsolete, final SubLObject replacements) {
        return v_obsolete;
    }

    /**
     * Declare macro NAME PATTERN BODY.
     * Note that it is obsolete, and that REPLACEMENTS should be used instead.
     */
    @LispMethod(comment = "Declare macro NAME PATTERN BODY.\r\nNote that it is obsolete, and that REPLACEMENTS should be used instead.\nDeclare macro NAME PATTERN BODY.\nNote that it is obsolete, and that REPLACEMENTS should be used instead.")
    public static final SubLObject defmacro_obsolete_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject pattern = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt37);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt37);
                pattern = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt37);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt37);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt37);
                            if (NIL == member(current_5, $list_alt33, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt37);
                        }
                        {
                            SubLObject replacements_tail = property_list_member($REPLACEMENTS, current);
                            SubLObject replacements = (NIL != replacements_tail) ? ((SubLObject) (cadr(replacements_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == symbol_or_symbol_list_p(replacements)) {
                                        Errors.error($str_alt35$Method_or_list_of_methods_must_be, replacements);
                                    }
                                }
                                if (!replacements.isList()) {
                                    replacements = list(replacements);
                                }
                                {
                                    SubLObject documentation = NIL;
                                    if (body.first().isString()) {
                                        documentation = body.first();
                                        body = body.rest();
                                    }
                                    return listS(DEFMACRO_PROTECTED, name, pattern, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL != replacements ? ((SubLObject) (list(list(DEFMACRO_OBSOLETE_WARNING, list(QUOTE, name), list(QUOTE, append(replacements, NIL)))))) : NIL, body, NIL));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Declare macro NAME PATTERN BODY.\r\nNote that it is obsolete, and that REPLACEMENTS should be used instead.\nDeclare macro NAME PATTERN BODY.\nNote that it is obsolete, and that REPLACEMENTS should be used instead.")
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
    }/**
     * Declare macro NAME PATTERN BODY.
     * Note that it is obsolete, and that REPLACEMENTS should be used instead.
     */


    public static final SubLObject defmacro_obsolete_warning_alt(SubLObject v_obsolete, SubLObject replacements) {
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                format(stream, $str_alt39$Macro__S_is_obsolete, v_obsolete);
                if (NIL != replacements) {
                    princ($str_alt40$____use_, stream);
                    {
                        SubLObject cdolist_list_var = replacements;
                        SubLObject replacement = NIL;
                        for (replacement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , replacement = cdolist_list_var.first()) {
                            format(stream, $str_alt41$_S_, replacement);
                        }
                    }
                    princ($str_alt42$instead_, stream);
                }
                string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return Errors.warn($str_alt43$_A, string);
        }
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

    public static final SubLObject register_external_symbol_alt(SubLObject symbol) {
        sethash(symbol, $external_symbols$.getGlobalValue(), T);
        return symbol;
    }

    public static SubLObject register_external_symbol(final SubLObject symbol) {
        sethash(symbol, $external_symbols$.getGlobalValue(), T);
        return symbol;
    }

    public static final SubLObject external_symbol_p_alt(SubLObject v_object) {
        return gethash_without_values(v_object, $external_symbols$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject external_symbol_p(final SubLObject v_object) {
        return gethash_without_values(v_object, $external_symbols$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject external_function_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isFunctionSpec() && (!v_object.isMacroOperator())) && (NIL != external_symbol_p(v_object)));
    }

    public static SubLObject external_function_p(final SubLObject v_object) {
        return makeBoolean((v_object.isFunctionSpec() && (!v_object.isMacroOperator())) && (NIL != external_symbol_p(v_object)));
    }

    public static final SubLObject external_macro_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isMacroOperator() && (NIL != external_symbol_p(v_object)));
    }

    public static SubLObject external_macro_p(final SubLObject v_object) {
        return makeBoolean(v_object.isMacroOperator() && (NIL != external_symbol_p(v_object)));
    }

    public static final SubLObject all_external_symbols_alt() {
        {
            SubLObject external_symbols = NIL;
            SubLObject symbol = NIL;
            SubLObject value = NIL;
            {
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
            }
            external_symbols = Sort.sort(external_symbols, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
            return external_symbols;
        }
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

    /**
     * define NAME as a public function that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public function that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public function that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject define_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFINE_PUBLIC, name, arglist, append(body, NIL)));
            }
        }
    }

    @LispMethod(comment = "define NAME as a public function that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public function that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * define NAME as a public function that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * define NAME as a public macro that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public macro that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public macro that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defmacro_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFMACRO_PUBLIC, name, arglist, append(body, NIL)));
            }
        }
    }

    @LispMethod(comment = "define NAME as a public macro that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public macro that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * define NAME as a public macro that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * defconstant VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "defconstant VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefconstant VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defconstant_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject initialization = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            initialization = current.first();
            current = current.rest();
            {
                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt20);
                current = current.rest();
                if (NIL == current) {
                    return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFCONSTANT_PUBLIC, variable, initialization, documentation));
                } else {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defconstant VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefconstant VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * defconstant VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * deflexical VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "deflexical VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndeflexical VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject deflexical_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFLEXICAL_PUBLIC, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "deflexical VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndeflexical VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * deflexical VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * defparameter VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "defparameter VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefparameter VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defparameter_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFPARAMETER_PUBLIC, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defparameter VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefparameter VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * defparameter VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * defglobal VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "defglobal VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefglobal VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defglobal_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFGLOBAL_PUBLIC, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defglobal VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefglobal VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * defglobal VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    /**
     * defvar VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "defvar VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefvar VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defvar_external_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt23);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt23);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, variable)), list(DEFVAR_PUBLIC, variable, initialization, documentation));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "defvar VARIABLE as a public VARIABLE that will be referenced from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefvar VARIABLE as a public VARIABLE that will be referenced from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
    }/**
     * defvar VARIABLE as a public VARIABLE that will be referenced from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */


    public static final SubLObject register_macro_helper_alt(SubLObject helper, SubLObject macro) {
        {
            SubLObject macros = get(helper, $MACRO_HELPER_FOR, UNPROVIDED);
            if (macro.isCons()) {
                {
                    SubLObject cdolist_list_var = macro;
                    SubLObject one_macro = NIL;
                    for (one_macro = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , one_macro = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = one_macro;
                            if (NIL == member(item_var, macros, symbol_function(EQL), symbol_function(IDENTITY))) {
                                macros = cons(item_var, macros);
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject item_var = macro;
                    if (NIL == member(item_var, macros, symbol_function(EQL), symbol_function(IDENTITY))) {
                        macros = cons(item_var, macros);
                    }
                }
            }
            put(helper, $MACRO_HELPER_FOR, macros);
        }
        return helper;
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

    public static final SubLObject macro_helper_for_macroP_alt(SubLObject helper, SubLObject macro) {
        return member(macro, get(helper, $MACRO_HELPER_FOR, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject macro_helper_for_macroP(final SubLObject helper, final SubLObject macro) {
        return member(macro, get(helper, $MACRO_HELPER_FOR, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject macro_helper_for_any_of_macrosP_alt(SubLObject helper, SubLObject macros) {
        {
            SubLObject helperP = NIL;
            if (NIL == helperP) {
                {
                    SubLObject csome_list_var = macros;
                    SubLObject macro = NIL;
                    for (macro = csome_list_var.first(); !((NIL != helperP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , macro = csome_list_var.first()) {
                        if (NIL != macro_helper_for_macroP(helper, macro)) {
                            helperP = macro;
                        }
                    }
                }
            }
            return helperP;
        }
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
        declareMacro("define_public", "DEFINE-PUBLIC");
        declareMacro("define_protected", "DEFINE-PROTECTED");
        declareMacro("define_private", "DEFINE-PRIVATE");
        declareMacro("define_macro_helper", "DEFINE-MACRO-HELPER");
        declareFunction("symbol_or_symbol_list_p", "SYMBOL-OR-SYMBOL-LIST-P", 1, 0, false);
        declareMacro("defmacro_public", "DEFMACRO-PUBLIC");
        declareMacro("defmacro_protected", "DEFMACRO-PROTECTED");
        declareMacro("defmacro_private", "DEFMACRO-PRIVATE");
        declareMacro("defmacro_macro_helper", "DEFMACRO-MACRO-HELPER");
        declareMacro("defconstant_public", "DEFCONSTANT-PUBLIC");
        declareMacro("defconstant_protected", "DEFCONSTANT-PROTECTED");
        declareMacro("defconstant_private", "DEFCONSTANT-PRIVATE");
        declareMacro("deflexical_public", "DEFLEXICAL-PUBLIC");
        declareMacro("deflexical_protected", "DEFLEXICAL-PROTECTED");
        declareMacro("deflexical_private", "DEFLEXICAL-PRIVATE");
        declareMacro("defparameter_public", "DEFPARAMETER-PUBLIC");
        declareMacro("defparameter_protected", "DEFPARAMETER-PROTECTED");
        declareMacro("defparameter_private", "DEFPARAMETER-PRIVATE");
        declareMacro("defparameter_macro_helper", "DEFPARAMETER-MACRO-HELPER");
        declareMacro("defglobal_public", "DEFGLOBAL-PUBLIC");
        declareMacro("defglobal_protected", "DEFGLOBAL-PROTECTED");
        declareMacro("defglobal_private", "DEFGLOBAL-PRIVATE");
        declareMacro("defvar_public", "DEFVAR-PUBLIC");
        declareMacro("defvar_protected", "DEFVAR-PROTECTED");
        declareMacro("defvar_private", "DEFVAR-PRIVATE");
        declareMacro("defvar_macro_helper", "DEFVAR-MACRO-HELPER");
        declareMacro("define_obsolete", "DEFINE-OBSOLETE");
        declareFunction("define_obsolete_register", "DEFINE-OBSOLETE-REGISTER", 2, 0, false);
        declareMacro("defmacro_obsolete", "DEFMACRO-OBSOLETE");
        declareFunction("defmacro_obsolete_warning", "DEFMACRO-OBSOLETE-WARNING", 2, 0, false);
        declareFunction("register_external_symbol", "REGISTER-EXTERNAL-SYMBOL", 1, 0, false);
        declareFunction("external_symbol_p", "EXTERNAL-SYMBOL-P", 1, 0, false);
        declareFunction("external_function_p", "EXTERNAL-FUNCTION-P", 1, 0, false);
        declareFunction("external_macro_p", "EXTERNAL-MACRO-P", 1, 0, false);
        declareFunction("all_external_symbols", "ALL-EXTERNAL-SYMBOLS", 0, 0, false);
        declareMacro("define_external", "DEFINE-EXTERNAL");
        declareMacro("defmacro_external", "DEFMACRO-EXTERNAL");
        declareMacro("defconstant_external", "DEFCONSTANT-EXTERNAL");
        declareMacro("deflexical_external", "DEFLEXICAL-EXTERNAL");
        declareMacro("defparameter_external", "DEFPARAMETER-EXTERNAL");
        declareMacro("defglobal_external", "DEFGLOBAL-EXTERNAL");
        declareMacro("defvar_external", "DEFVAR-EXTERNAL");
        declareFunction("register_macro_helper", "REGISTER-MACRO-HELPER", 2, 0, false);
        declareFunction("macro_helper_for_macroP", "MACRO-HELPER-FOR-MACRO?", 2, 0, false);
        declareFunction("macro_helper_for_any_of_macrosP", "MACRO-HELPER-FOR-ANY-OF-MACROS?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_access_macros_file_alt() {
        deflexical("*EXTERNAL-SYMBOLS*", NIL != boundp($external_symbols$) ? ((SubLObject) ($external_symbols$.getGlobalValue())) : make_hash_table($int$400, symbol_function(EQ), UNPROVIDED));
        deflexical("*EXTERNAL-ACCESS-METHODS*", $list_alt56);
        return NIL;
    }

    public static SubLObject init_access_macros_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*EXTERNAL-SYMBOLS*", SubLTrampolineFile.maybeDefault($external_symbols$, $external_symbols$, () -> make_hash_table($int$400, symbol_function(EQ), UNPROVIDED)));
            deflexical("*EXTERNAL-ACCESS-METHODS*", $list57);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EXTERNAL-SYMBOLS*", NIL != boundp($external_symbols$) ? ((SubLObject) ($external_symbols$.getGlobalValue())) : make_hash_table($int$400, symbol_function(EQ), UNPROVIDED));
            deflexical("*EXTERNAL-ACCESS-METHODS*", $list_alt56);
        }
        return NIL;
    }

    public static SubLObject init_access_macros_file_Previous() {
        deflexical("*EXTERNAL-SYMBOLS*", SubLTrampolineFile.maybeDefault($external_symbols$, $external_symbols$, () -> make_hash_table($int$400, symbol_function(EQ), UNPROVIDED)));
        deflexical("*EXTERNAL-ACCESS-METHODS*", $list57);
        return NIL;
    }

    public static final SubLObject setup_access_macros_file_alt() {
        meta_macros.declare_indention_pattern(DEFPARAMETER_MACRO_HELPER, $list_alt29);
        {
            SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_external_symbol(symbol);
            }
        }
        return NIL;
    }

    public static SubLObject setup_access_macros_file() {
        if (SubLFiles.USE_V1) {
            meta_macros.declare_indention_pattern(DEFPARAMETER_MACRO_HELPER, $list29);
            SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
            SubLObject symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_external_symbol(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject cdolist_list_var = $external_access_methods$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_external_symbol(symbol);
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_access_macros_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(NAME, ARGLIST, makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(NAME, ARGLIST, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt10 = list(makeKeyword("MACRO"));

    static private final SubLString $str_alt13$Macro_or_list_of_macros_must_be_s = makeString("Macro or list of macros must be specified, not ~a");

    static private final SubLList $list_alt16 = list(NAME, PATTERN, makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt18 = list(NAME, PATTERN, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt20 = list(VARIABLE, makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt23 = list(VARIABLE, makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt26 = list(VARIABLE, list(makeSymbol("&KEY"), makeSymbol("MACRO")), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt29 = list(VARIABLE, makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt32 = list(NAME, ARGLIST, list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt33 = list(makeKeyword("REPLACEMENTS"));

    static private final SubLString $str_alt35$Method_or_list_of_methods_must_be = makeString("Method or list of methods must be specified, not ~a");

    static private final SubLList $list_alt37 = list(NAME, PATTERN, list(makeSymbol("&KEY"), makeSymbol("REPLACEMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt39$Macro__S_is_obsolete = makeString("Macro ~S is obsolete");

    static private final SubLString $str_alt40$____use_ = makeString(" -- use ");

    static private final SubLString $str_alt41$_S_ = makeString("~S ");

    static private final SubLString $str_alt42$instead_ = makeString("instead.");

    static private final SubLString $str_alt43$_A = makeString("~A");

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeSymbol("DEFINE-PRIVATE"), makeSymbol("DEFINE-PROTECTED"), makeSymbol("DEFINE-PUBLIC"), makeSymbol("DEFINE-MACRO-HELPER"), makeSymbol("DEFMACRO-PRIVATE"), makeSymbol("DEFMACRO-PROTECTED"), makeSymbol("DEFMACRO-PUBLIC"), makeSymbol("DEFMACRO-MACRO-HELPER"), makeSymbol("DEFCONSTANT-PRIVATE"), makeSymbol("DEFCONSTANT-PROTECTED"), makeSymbol("DEFCONSTANT-PUBLIC"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFLEXICAL-PROTECTED"), makeSymbol("DEFLEXICAL-PUBLIC"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFGLOBAL-PROTECTED"), makeSymbol("DEFGLOBAL-PUBLIC"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DEFPARAMETER-PROTECTED"), makeSymbol("DEFPARAMETER-PUBLIC"), makeSymbol("DEFVAR-PRIVATE"), makeSymbol("DEFVAR-PROTECTED"), makeSymbol("DEFVAR-PUBLIC") });
}

/**
 * Total time: 221 ms
 */
