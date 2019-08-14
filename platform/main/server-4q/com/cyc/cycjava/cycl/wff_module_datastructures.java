/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.list_utilities.property_list_p;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WFF-MODULE-DATASTRUCTURES
 * source file: /cyc/top/cycl/wff-module-datastructures.lisp
 * created:     2019/07/03 17:37:28
 */
public final class wff_module_datastructures extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new wff_module_datastructures();

 public static final String myName = "com.cyc.cycjava.cycl.wff_module_datastructures";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_wff_module$ = makeSymbol("*DTP-WFF-MODULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wff_module_properties$ = makeSymbol("*WFF-MODULE-PROPERTIES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol WFF_MODULE = makeSymbol("WFF-MODULE");

    private static final SubLSymbol WFF_MODULE_P = makeSymbol("WFF-MODULE-P");

    static private final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("PLIST"));

    static private final SubLList $list3 = list($NAME, makeKeyword("PLIST"));

    static private final SubLList $list4 = list(makeSymbol("WFF-MOD-NAME"), makeSymbol("WFF-MOD-PLIST"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-WFF-MOD-NAME"), makeSymbol("_CSETF-WFF-MOD-PLIST"));

    private static final SubLSymbol PRINT_WFF_MODULE = makeSymbol("PRINT-WFF-MODULE");

    private static final SubLSymbol WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("WFF-MODULE-P"));

    private static final SubLSymbol WFF_MOD_NAME = makeSymbol("WFF-MOD-NAME");

    private static final SubLSymbol _CSETF_WFF_MOD_NAME = makeSymbol("_CSETF-WFF-MOD-NAME");

    private static final SubLSymbol WFF_MOD_PLIST = makeSymbol("WFF-MOD-PLIST");

    private static final SubLSymbol _CSETF_WFF_MOD_PLIST = makeSymbol("_CSETF-WFF-MOD-PLIST");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_WFF_MODULE = makeSymbol("MAKE-WFF-MODULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD");

    private static final SubLString $str21$_WFF_Module___a_ = makeString("[WFF Module: ~a]");

    private static final SubLSymbol $wff_module_store$ = makeSymbol("*WFF-MODULE-STORE*");

    private static final SubLInteger $int$212 = makeInteger(212);

    static private final SubLList $list26 = list(list(makeSymbol("WFF-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list27 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym30$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLList $list32 = list(makeSymbol("WFF-MODULE-STORE"));

    private static final SubLSymbol WFF_MODULE_STORE = makeSymbol("WFF-MODULE-STORE");

    private static final SubLSymbol DO_WFF_MODULES = makeSymbol("DO-WFF-MODULES");

    private static final SubLList $list37 = list(cons(makeKeyword("EXPLAIN-FUNC"), makeSymbol("SYMBOLP")), cons(makeKeyword("COMMENT"), makeSymbol("STRINGP")));

    private static final SubLSymbol WFF_MODULE_PROPERTY_LIST_P = makeSymbol("WFF-MODULE-PROPERTY-LIST-P");

    public static final SubLObject wff_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_wff_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject wff_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_wff_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject wff_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.wff_module_datastructures.$wff_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject wff_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.wff_module_datastructures.$wff_module_native.class ? T : NIL;
    }

    public static final SubLObject wff_mod_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject wff_mod_name(final SubLObject v_object) {
        assert NIL != wff_module_p(v_object) : "! wff_module_datastructures.wff_module_p(v_object) " + "wff_module_datastructures.wff_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject wff_mod_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject wff_mod_plist(final SubLObject v_object) {
        assert NIL != wff_module_p(v_object) : "! wff_module_datastructures.wff_module_p(v_object) " + "wff_module_datastructures.wff_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_wff_mod_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_wff_mod_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != wff_module_p(v_object) : "! wff_module_datastructures.wff_module_p(v_object) " + "wff_module_datastructures.wff_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_wff_mod_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_wff_mod_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != wff_module_p(v_object) : "! wff_module_datastructures.wff_module_p(v_object) " + "wff_module_datastructures.wff_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_wff_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.wff_module_datastructures.$wff_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_wff_mod_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PLIST)) {
                            _csetf_wff_mod_plist(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_wff_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.wff_module_datastructures.$wff_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_wff_mod_name(v_new, current_value);
            } else
                if (pcase_var.eql($PLIST)) {
                    _csetf_wff_mod_plist(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_wff_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_WFF_MODULE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, wff_mod_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, wff_mod_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_WFF_MODULE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_wff_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_wff_module(obj, visitor_fn);
    }

    public static final SubLObject print_wff_module_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject name = wff_module_name(v_object);
            format(stream, $str_alt15$_WFF_Module___a_, name);
        }
        return NIL;
    }

    public static SubLObject print_wff_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = wff_module_name(v_object);
        format(stream, $str21$_WFF_Module___a_, name);
        return NIL;
    }

    /**
     *
     *
     * @return wff-module-p; a new WFF module with NAME and properties PLIST
     */
    @LispMethod(comment = "@return wff-module-p; a new WFF module with NAME and properties PLIST")
    public static final SubLObject new_wff_module_alt(SubLObject name, SubLObject plist) {
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        {
            SubLObject wff_module = allocate_wff_module(name);
            _csetf_wff_mod_plist(wff_module, plist);
            add_wff_module(wff_module);
            return wff_module;
        }
    }

    /**
     *
     *
     * @return wff-module-p; a new WFF module with NAME and properties PLIST
     */
    @LispMethod(comment = "@return wff-module-p; a new WFF module with NAME and properties PLIST")
    public static SubLObject new_wff_module(final SubLObject name, final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        final SubLObject wff_module = allocate_wff_module(name);
        _csetf_wff_mod_plist(wff_module, plist);
        add_wff_module(wff_module);
        return wff_module;
    }

    public static final SubLObject allocate_wff_module_alt(SubLObject name) {
        {
            SubLObject wff_module = find_wff_module_by_name(name);
            if (NIL != wff_module) {
                remove_wff_module(wff_module);
            } else {
                wff_module = make_wff_module(UNPROVIDED);
                _csetf_wff_mod_name(wff_module, name);
            }
            _csetf_wff_mod_plist(wff_module, NIL);
            return wff_module;
        }
    }

    public static SubLObject allocate_wff_module(final SubLObject name) {
        SubLObject wff_module = find_wff_module_by_name(name);
        if (NIL != wff_module) {
            remove_wff_module(wff_module);
        } else {
            wff_module = make_wff_module(UNPROVIDED);
            _csetf_wff_mod_name(wff_module, name);
        }
        _csetf_wff_mod_plist(wff_module, NIL);
        return wff_module;
    }

    public static final SubLObject destroy_wff_module_alt(SubLObject wff_module) {
        remove_wff_module(wff_module);
        _csetf_wff_mod_plist(wff_module, $FREE);
        return NIL;
    }

    public static SubLObject destroy_wff_module(final SubLObject wff_module) {
        remove_wff_module(wff_module);
        _csetf_wff_mod_plist(wff_module, $FREE);
        return NIL;
    }

    public static final SubLObject wff_module_name_alt(SubLObject wff_module) {
        SubLTrampolineFile.checkType(wff_module, WFF_MODULE_P);
        return wff_mod_name(wff_module);
    }

    public static SubLObject wff_module_name(final SubLObject wff_module) {
        assert NIL != wff_module_p(wff_module) : "! wff_module_datastructures.wff_module_p(wff_module) " + ("wff_module_datastructures.wff_module_p(wff_module) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_p(wff_module) ") + wff_module;
        return wff_mod_name(wff_module);
    }

    public static final SubLObject wff_module_plist_alt(SubLObject wff_module) {
        SubLTrampolineFile.checkType(wff_module, WFF_MODULE_P);
        return wff_mod_plist(wff_module);
    }

    public static SubLObject wff_module_plist(final SubLObject wff_module) {
        assert NIL != wff_module_p(wff_module) : "! wff_module_datastructures.wff_module_p(wff_module) " + ("wff_module_datastructures.wff_module_p(wff_module) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_p(wff_module) ") + wff_module;
        return wff_mod_plist(wff_module);
    }

    public static final SubLObject wff_module_property_alt(SubLObject wff_module, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(wff_module, WFF_MODULE_P);
        {
            SubLObject plist = wff_module_plist(wff_module);
            return getf(plist, property, v_default);
        }
    }

    public static SubLObject wff_module_property(final SubLObject wff_module, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != wff_module_p(wff_module) : "! wff_module_datastructures.wff_module_p(wff_module) " + ("wff_module_datastructures.wff_module_p(wff_module) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_p(wff_module) ") + wff_module;
        final SubLObject plist = wff_module_plist(wff_module);
        return getf(plist, property, v_default);
    }

    public static final SubLObject do_wff_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject wff_module_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    wff_module_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            if (NIL == member(current_1, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject name_var = $sym24$NAME_VAR;
                                return listS(DO_HASH_TABLE, list(name_var, wff_module_var, $list_alt26, $DONE, done), list(IGNORE, name_var), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_wff_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject wff_module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        wff_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list26);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list26);
            if (NIL == member(current_$1, $list27, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list26);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject name_var = $sym30$NAME_VAR;
        return listS(DO_HASH_TABLE, list(name_var, wff_module_var, $list32, $DONE, done), list(IGNORE, name_var), append(body, NIL));
    }

    public static final SubLObject wff_module_store_alt() {
        return $wff_module_store$.getGlobalValue();
    }

    public static SubLObject wff_module_store() {
        return $wff_module_store$.getGlobalValue();
    }

    public static final SubLObject find_wff_module_by_name_alt(SubLObject name) {
        {
            SubLObject wff_module = gethash(name, $wff_module_store$.getGlobalValue(), UNPROVIDED);
            return wff_module;
        }
    }

    public static SubLObject find_wff_module_by_name(final SubLObject name) {
        final SubLObject wff_module = gethash(name, $wff_module_store$.getGlobalValue(), UNPROVIDED);
        return wff_module;
    }

    public static final SubLObject add_wff_module_alt(SubLObject wff_module) {
        SubLTrampolineFile.checkType(wff_module, WFF_MODULE_P);
        {
            SubLObject name = wff_module_name(wff_module);
            sethash(name, $wff_module_store$.getGlobalValue(), wff_module);
        }
        return wff_module;
    }

    public static SubLObject add_wff_module(final SubLObject wff_module) {
        assert NIL != wff_module_p(wff_module) : "! wff_module_datastructures.wff_module_p(wff_module) " + ("wff_module_datastructures.wff_module_p(wff_module) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_p(wff_module) ") + wff_module;
        final SubLObject name = wff_module_name(wff_module);
        sethash(name, $wff_module_store$.getGlobalValue(), wff_module);
        return wff_module;
    }

    public static final SubLObject remove_wff_module_alt(SubLObject wff_module) {
        SubLTrampolineFile.checkType(wff_module, WFF_MODULE_P);
        {
            SubLObject name = wff_module_name(wff_module);
            remhash(name, $wff_module_store$.getGlobalValue());
        }
        return wff_module;
    }

    public static SubLObject remove_wff_module(final SubLObject wff_module) {
        assert NIL != wff_module_p(wff_module) : "! wff_module_datastructures.wff_module_p(wff_module) " + ("wff_module_datastructures.wff_module_p(wff_module) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_p(wff_module) ") + wff_module;
        final SubLObject name = wff_module_name(wff_module);
        remhash(name, $wff_module_store$.getGlobalValue());
        return wff_module;
    }

    public static final SubLObject setup_wff_module_alt(SubLObject name, SubLObject type, SubLObject plist) {
        {
            SubLObject new_plist = copy_list(plist);
            new_plist = putf(plist, $MODULE_TYPE, type);
            {
                SubLObject wff_module = new_wff_module(name, new_plist);
                return wff_module;
            }
        }
    }

    public static SubLObject setup_wff_module(final SubLObject name, final SubLObject type, final SubLObject plist) {
        SubLObject new_plist = copy_list(plist);
        new_plist = putf(plist, $MODULE_TYPE, type);
        final SubLObject wff_module = new_wff_module(name, new_plist);
        return wff_module;
    }

    public static final SubLObject wff_module_type_alt(SubLObject wff_module) {
        return wff_module_property(wff_module, $MODULE_TYPE, NIL);
    }

    public static SubLObject wff_module_type(final SubLObject wff_module) {
        return wff_module_property(wff_module, $MODULE_TYPE, NIL);
    }

    /**
     *
     *
     * @return t if object is the name of a defined wff violation module.
     */
    @LispMethod(comment = "@return t if object is the name of a defined wff violation module.")
    public static final SubLObject wff_violation_type_p_alt(SubLObject v_object) {
        return sublisp_boolean(find_wff_module_by_name(v_object));
    }

    /**
     *
     *
     * @return t if object is the name of a defined wff violation module.
     */
    @LispMethod(comment = "@return t if object is the name of a defined wff violation module.")
    public static SubLObject wff_violation_type_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find_wff_module_by_name(v_object));
    }

    /**
     *
     *
     * @return t if object is a list with its first element a wff-violation-type-p.
     */
    @LispMethod(comment = "@return t if object is a list with its first element a wff-violation-type-p.")
    public static final SubLObject wff_violation_p_alt(SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (v_object.isCons() && (NIL != wff_violation_type_p(v_object.first()))));
    }

    /**
     *
     *
     * @return t if object is a list with its first element a wff-violation-type-p.
     */
    @LispMethod(comment = "@return t if object is a list with its first element a wff-violation-type-p.")
    public static SubLObject wff_violation_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (v_object.isCons() && (NIL != wff_violation_type_p(v_object.first()))));
    }

    public static final SubLObject wff_module_property_p_alt(SubLObject property, SubLObject value) {
        if (!property.isKeyword()) {
            return NIL;
        }
        {
            SubLObject value_type = NIL;
            value_type = find(property, $wff_module_properties$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED).rest();
            if (NIL != value_type) {
                return funcall(value_type, value);
            }
            return NIL;
        }
    }

    public static SubLObject wff_module_property_p(final SubLObject property, final SubLObject value) {
        if (!property.isKeyword()) {
            return NIL;
        }
        SubLObject value_type = NIL;
        value_type = find(property, $wff_module_properties$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != value_type) {
            return funcall(value_type, value);
        }
        return NIL;
    }

    public static final SubLObject wff_module_property_list_p_alt(SubLObject v_object) {
        if (NIL == property_list_p(v_object)) {
            return NIL;
        }
        {
            SubLObject remainder = NIL;
            for (remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject property = remainder.first();
                    SubLObject value = cadr(remainder);
                    if (NIL == wff_module_property_p(property, value)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject wff_module_property_list_p(final SubLObject v_object) {
        if (NIL == list_utilities.property_list_p(v_object)) {
            return NIL;
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL == wff_module_property_p(property, value)) {
                return NIL;
            }
        }
        return T;
    }

    /**
     * Declare and wff module named NAME with properties in PLIST.
     */
    @LispMethod(comment = "Declare and wff module named NAME with properties in PLIST.")
    public static final SubLObject wff_violation_module_alt(SubLObject name, SubLObject plist) {
        SubLTrampolineFile.checkType(plist, WFF_MODULE_PROPERTY_LIST_P);
        {
            SubLObject wff_module = setup_wff_module(name, $VIOLATION, plist);
            return wff_module;
        }
    }

    /**
     * Declare and wff module named NAME with properties in PLIST.
     */
    @LispMethod(comment = "Declare and wff module named NAME with properties in PLIST.")
    public static SubLObject wff_violation_module(final SubLObject name, final SubLObject plist) {
        assert NIL != wff_module_property_list_p(plist) : "! wff_module_datastructures.wff_module_property_list_p(plist) " + ("wff_module_datastructures.wff_module_property_list_p(plist) " + "CommonSymbols.NIL != wff_module_datastructures.wff_module_property_list_p(plist) ") + plist;
        final SubLObject wff_module = setup_wff_module(name, $VIOLATION, plist);
        return wff_module;
    }

    public static final SubLObject wff_violation_explanation_function_alt(SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), $EXPLAIN_FUNC, NIL);
    }

    public static SubLObject wff_violation_explanation_function(final SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), $EXPLAIN_FUNC, NIL);
    }

    public static final SubLObject wff_violation_explanation_function_args_alt(SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), $EXPLAIN_ARGS, NIL);
    }

    public static SubLObject wff_violation_explanation_function_args(final SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), $EXPLAIN_ARGS, NIL);
    }

    public static SubLObject declare_wff_module_datastructures_file() {
        declareFunction("wff_module_print_function_trampoline", "WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("wff_module_p", "WFF-MODULE-P", 1, 0, false);
        new wff_module_datastructures.$wff_module_p$UnaryFunction();
        declareFunction("wff_mod_name", "WFF-MOD-NAME", 1, 0, false);
        declareFunction("wff_mod_plist", "WFF-MOD-PLIST", 1, 0, false);
        declareFunction("_csetf_wff_mod_name", "_CSETF-WFF-MOD-NAME", 2, 0, false);
        declareFunction("_csetf_wff_mod_plist", "_CSETF-WFF-MOD-PLIST", 2, 0, false);
        declareFunction("make_wff_module", "MAKE-WFF-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_wff_module", "VISIT-DEFSTRUCT-WFF-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_wff_module_method", "VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD", 2, 0, false);
        declareFunction("print_wff_module", "PRINT-WFF-MODULE", 3, 0, false);
        declareFunction("new_wff_module", "NEW-WFF-MODULE", 2, 0, false);
        declareFunction("allocate_wff_module", "ALLOCATE-WFF-MODULE", 1, 0, false);
        declareFunction("destroy_wff_module", "DESTROY-WFF-MODULE", 1, 0, false);
        declareFunction("wff_module_name", "WFF-MODULE-NAME", 1, 0, false);
        declareFunction("wff_module_plist", "WFF-MODULE-PLIST", 1, 0, false);
        declareFunction("wff_module_property", "WFF-MODULE-PROPERTY", 2, 1, false);
        declareMacro("do_wff_modules", "DO-WFF-MODULES");
        declareFunction("wff_module_store", "WFF-MODULE-STORE", 0, 0, false);
        declareFunction("find_wff_module_by_name", "FIND-WFF-MODULE-BY-NAME", 1, 0, false);
        declareFunction("add_wff_module", "ADD-WFF-MODULE", 1, 0, false);
        declareFunction("remove_wff_module", "REMOVE-WFF-MODULE", 1, 0, false);
        declareFunction("setup_wff_module", "SETUP-WFF-MODULE", 3, 0, false);
        declareFunction("wff_module_type", "WFF-MODULE-TYPE", 1, 0, false);
        declareFunction("wff_violation_type_p", "WFF-VIOLATION-TYPE-P", 1, 0, false);
        declareFunction("wff_violation_p", "WFF-VIOLATION-P", 1, 0, false);
        declareFunction("wff_module_property_p", "WFF-MODULE-PROPERTY-P", 2, 0, false);
        declareFunction("wff_module_property_list_p", "WFF-MODULE-PROPERTY-LIST-P", 1, 0, false);
        declareFunction("wff_violation_module", "WFF-VIOLATION-MODULE", 2, 0, false);
        declareFunction("wff_violation_explanation_function", "WFF-VIOLATION-EXPLANATION-FUNCTION", 1, 0, false);
        declareFunction("wff_violation_explanation_function_args", "WFF-VIOLATION-EXPLANATION-FUNCTION-ARGS", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NAME"), makeSymbol("PLIST"));

    static private final SubLList $list_alt3 = list($NAME, makeKeyword("PLIST"));

    static private final SubLList $list_alt4 = list(makeSymbol("WFF-MOD-NAME"), makeSymbol("WFF-MOD-PLIST"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-WFF-MOD-NAME"), makeSymbol("_CSETF-WFF-MOD-PLIST"));

    public static final SubLObject init_wff_module_datastructures_file_alt() {
        defconstant("*DTP-WFF-MODULE*", WFF_MODULE);
        deflexical("*WFF-MODULE-STORE*", NIL != boundp($wff_module_store$) ? ((SubLObject) ($wff_module_store$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*WFF-MODULE-PROPERTIES*", $list_alt31);
        return NIL;
    }

    public static SubLObject init_wff_module_datastructures_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-WFF-MODULE*", WFF_MODULE);
            deflexical("*WFF-MODULE-STORE*", SubLTrampolineFile.maybeDefault($wff_module_store$, $wff_module_store$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*WFF-MODULE-PROPERTIES*", $list37);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*WFF-MODULE-STORE*", NIL != boundp($wff_module_store$) ? ((SubLObject) ($wff_module_store$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*WFF-MODULE-PROPERTIES*", $list_alt31);
        }
        return NIL;
    }

    public static SubLObject init_wff_module_datastructures_file_Previous() {
        defconstant("*DTP-WFF-MODULE*", WFF_MODULE);
        deflexical("*WFF-MODULE-STORE*", SubLTrampolineFile.maybeDefault($wff_module_store$, $wff_module_store$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*WFF-MODULE-PROPERTIES*", $list37);
        return NIL;
    }

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$_WFF_Module___a_ = makeString("[WFF Module: ~a]");

    public static SubLObject setup_wff_module_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_wff_module$.getGlobalValue(), symbol_function(WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(WFF_MOD_NAME, _CSETF_WFF_MOD_NAME);
        def_csetf(WFF_MOD_PLIST, _CSETF_WFF_MOD_PLIST);
        identity(WFF_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_wff_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD));
        declare_defglobal($wff_module_store$);
        register_macro_helper(WFF_MODULE_STORE, DO_WFF_MODULES);
        return NIL;
    }

    static private final SubLList $list_alt20 = list(list(makeSymbol("WFF-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt21 = list($DONE);

    static private final SubLSymbol $sym24$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    static private final SubLList $list_alt26 = list(makeSymbol("WFF-MODULE-STORE"));

    @Override
    public void declareFunctions() {
        declare_wff_module_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_wff_module_datastructures_file();
    }

    static private final SubLList $list_alt31 = list(cons(makeKeyword("EXPLAIN-FUNC"), makeSymbol("SYMBOLP")), cons(makeKeyword("COMMENT"), makeSymbol("STRINGP")));

    @Override
    public void runTopLevelForms() {
        setup_wff_module_datastructures_file();
    }

    static {
    }

    public static final class $wff_module_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        public $wff_module_native() {
            wff_module_datastructures.$wff_module_native.this.$name = Lisp.NIL;
            wff_module_datastructures.$wff_module_native.this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return wff_module_datastructures.$wff_module_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return wff_module_datastructures.$wff_module_native.this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return wff_module_datastructures.$wff_module_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return wff_module_datastructures.$wff_module_native.this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.wff_module_datastructures.$wff_module_native.class, WFF_MODULE, WFF_MODULE_P, $list2, $list3, new String[]{ "$name", "$plist" }, $list4, $list5, PRINT_WFF_MODULE);
        }
    }

    public static final class $wff_module_p$UnaryFunction extends UnaryFunction {
        public $wff_module_p$UnaryFunction() {
            super(extractFunctionNamed("WFF-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return wff_module_p(arg1);
        }
    }
}

/**
 * Total time: 150 ms
 */
