/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.hash_table_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CACHE
 * source file: /cyc/top/cycl/cache.lisp
 * created:     2019/07/03 17:37:15
 */
public final class cache extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cache();

 public static final String myName = "com.cyc.cycjava.cycl.cache";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cache$ = makeSymbol("*DTP-CACHE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cache_entry$ = makeSymbol("*DTP-CACHE-ENTRY*");

    // defparameter
    // Whether to print the elements of a cache in the print method
    /**
     * Whether to print the elements of a cache in the print method
     */
    @LispMethod(comment = "Whether to print the elements of a cache in the print method\ndefparameter")
    public static final SubLSymbol $print_cache_elementsP$ = makeSymbol("*PRINT-CACHE-ELEMENTS?*");

    // defparameter
    // When T, preallocate all of the cache entries and resource them
    /**
     * When T, preallocate all of the cache entries and resource them
     */
    @LispMethod(comment = "When T, preallocate all of the cache entries and resource them\ndefparameter")
    private static final SubLSymbol $cache_entries_preallocateP$ = makeSymbol("*CACHE-ENTRIES-PREALLOCATE?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_cache$ = makeSymbol("*CFASL-OPCODE-CACHE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $print_cache_valuesP$ = makeSymbol("*PRINT-CACHE-VALUES?*");

    private static final SubLSymbol CACHE_P = makeSymbol("CACHE-P");

    static private final SubLList $list2 = list(makeSymbol("CAPACITY"), makeSymbol("MAP"), makeSymbol("HEAD-ENTRY"));

    static private final SubLList $list3 = list(makeKeyword("CAPACITY"), makeKeyword("MAP"), makeKeyword("HEAD-ENTRY"));

    static private final SubLList $list4 = list(makeSymbol("CACHE-CAPACITY"), makeSymbol("CACHE-MAP"), makeSymbol("CACHE-HEAD-ENTRY"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-CACHE-CAPACITY"), makeSymbol("_CSETF-CACHE-MAP"), makeSymbol("_CSETF-CACHE-HEAD-ENTRY"));

    private static final SubLSymbol CACHE_PRINT = makeSymbol("CACHE-PRINT");

    private static final SubLSymbol CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CACHE-P"));

    private static final SubLSymbol CACHE_CAPACITY = makeSymbol("CACHE-CAPACITY");

    private static final SubLSymbol _CSETF_CACHE_CAPACITY = makeSymbol("_CSETF-CACHE-CAPACITY");

    private static final SubLSymbol CACHE_MAP = makeSymbol("CACHE-MAP");

    private static final SubLSymbol _CSETF_CACHE_MAP = makeSymbol("_CSETF-CACHE-MAP");

    private static final SubLSymbol CACHE_HEAD_ENTRY = makeSymbol("CACHE-HEAD-ENTRY");

    private static final SubLSymbol _CSETF_CACHE_HEAD_ENTRY = makeSymbol("_CSETF-CACHE-HEAD-ENTRY");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CACHE = makeSymbol("MAKE-CACHE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD");

    private static final SubLSymbol CACHE_ENTRY = makeSymbol("CACHE-ENTRY");

    private static final SubLSymbol CACHE_ENTRY_P = makeSymbol("CACHE-ENTRY-P");

    private static final SubLList $list26 = list(makeSymbol("NEWER"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("OLDER"));

    private static final SubLList $list27 = list(makeKeyword("NEWER"), makeKeyword("KEY"), makeKeyword("VALUE"), makeKeyword("OLDER"));

    private static final SubLList $list28 = list(makeSymbol("CACHE-ENTRY-NEWER"), makeSymbol("CACHE-ENTRY-KEY"), makeSymbol("CACHE-ENTRY-VALUE"), makeSymbol("CACHE-ENTRY-OLDER"));

    private static final SubLList $list29 = list(makeSymbol("_CSETF-CACHE-ENTRY-NEWER"), makeSymbol("_CSETF-CACHE-ENTRY-KEY"), makeSymbol("_CSETF-CACHE-ENTRY-VALUE"), makeSymbol("_CSETF-CACHE-ENTRY-OLDER"));

    private static final SubLSymbol CACHE_ENTRY_PRINT = makeSymbol("CACHE-ENTRY-PRINT");

    private static final SubLSymbol CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list32 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CACHE-ENTRY-P"));

    private static final SubLSymbol CACHE_ENTRY_NEWER = makeSymbol("CACHE-ENTRY-NEWER");

    private static final SubLSymbol _CSETF_CACHE_ENTRY_NEWER = makeSymbol("_CSETF-CACHE-ENTRY-NEWER");

    private static final SubLSymbol CACHE_ENTRY_KEY = makeSymbol("CACHE-ENTRY-KEY");

    private static final SubLSymbol _CSETF_CACHE_ENTRY_KEY = makeSymbol("_CSETF-CACHE-ENTRY-KEY");

    private static final SubLSymbol CACHE_ENTRY_VALUE = makeSymbol("CACHE-ENTRY-VALUE");

    private static final SubLSymbol _CSETF_CACHE_ENTRY_VALUE = makeSymbol("_CSETF-CACHE-ENTRY-VALUE");

    private static final SubLSymbol CACHE_ENTRY_OLDER = makeSymbol("CACHE-ENTRY-OLDER");

    private static final SubLSymbol _CSETF_CACHE_ENTRY_OLDER = makeSymbol("_CSETF-CACHE-ENTRY-OLDER");

    private static final SubLSymbol MAKE_CACHE_ENTRY = makeSymbol("MAKE-CACHE-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD");

    private static final SubLString $str47$__CACHE_ = makeString("#<CACHE/");

    private static final SubLString $str48$_ = makeString("/");

    private static final SubLString $str49$_ = makeString("(");

    private static final SubLString $str50$__ = makeString(", ");

    private static final SubLString $str51$___ = makeString("...");

    private static final SubLString $str52$_ = makeString(")");

    private static final SubLString $str53$_ = makeString(">");

    private static final SubLList $list58 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("CACHE"), makeSymbol("&KEY"), list(makeSymbol("ORDER"), makeKeyword("NEWEST"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list59 = list(makeKeyword("ORDER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym63$CACHE_VAR = makeUninternedSymbol("CACHE-VAR");

    private static final SubLSymbol $sym64$ORDER_VAR = makeUninternedSymbol("ORDER-VAR");

    private static final SubLSymbol $sym65$ENTRY = makeUninternedSymbol("ENTRY");

    private static final SubLSymbol DO_CACHE_FIRST = makeSymbol("DO-CACHE-FIRST");

    private static final SubLSymbol $sym70$DO_CACHE_DONE_ = makeSymbol("DO-CACHE-DONE?");

    private static final SubLSymbol DO_CACHE_KEY = makeSymbol("DO-CACHE-KEY");

    private static final SubLSymbol DO_CACHE_VALUE = makeSymbol("DO-CACHE-VALUE");

    private static final SubLSymbol DO_CACHE_NEXT = makeSymbol("DO-CACHE-NEXT");

    private static final SubLSymbol DO_CACHE = makeSymbol("DO-CACHE");

    private static final SubLString $str77$_S_was_not_either__NEWEST_or__OLD = makeString("~S was not either :NEWEST or :OLDEST");

    private static final SubLSymbol CACHE_ITERATOR_DONE = makeSymbol("CACHE-ITERATOR-DONE");

    private static final SubLSymbol CACHE_ITERATOR_NEXT = makeSymbol("CACHE-ITERATOR-NEXT");

    private static final SubLList $list81 = list(makeSymbol("CURRENT"), makeSymbol("HEAD-ENTRY"));

    private static final SubLSymbol CACHE_CONTENT_ITERATOR_DONE = makeSymbol("CACHE-CONTENT-ITERATOR-DONE");

    private static final SubLSymbol CACHE_CONTENT_ITERATOR_NEXT = makeSymbol("CACHE-CONTENT-ITERATOR-NEXT");

    private static final SubLInteger $int$63 = makeInteger(63);

    private static final SubLSymbol CFASL_INPUT_CACHE = makeSymbol("CFASL-INPUT-CACHE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CACHE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CACHE-METHOD");

    private static final SubLString $str87$____ = makeString(" -> ");

    private static final SubLSymbol $sym89$_ = makeSymbol(">");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str92$Content_iterator__A_was_exhausted = makeString("Content iterator ~A was exhausted at item ~A before the entry iterator ~A!");

    private static final SubLString $str93$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests key ~A, but the entry iterator says ~A.");

    private static final SubLString $str94$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A.");

    private static final SubLString $str95$The_content_iterator__A_is_not_ex = makeString("The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done.");

    private static final SubLString $str96$The_two_iterators_do_not_seem_to_ = makeString("The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A.");

    public static final SubLObject cache_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        cache_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cache_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache.$cache_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cache_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache.$cache_native.class ? T : NIL;
    }

    public static final SubLObject cache_capacity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.getField2();
    }

    public static SubLObject cache_capacity(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cache_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.getField3();
    }

    public static SubLObject cache_map(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject cache_head_entry_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.getField4();
    }

    public static SubLObject cache_head_entry(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_cache_capacity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cache_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cache_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cache_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cache_head_entry_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cache_head_entry(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "! cache.cache_p(v_object) " + "cache.cache_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_cache_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cache.$cache_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CAPACITY)) {
                        _csetf_cache_capacity(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MAP)) {
                            _csetf_cache_map(v_new, current_value);
                        } else {
                            if (pcase_var.eql($HEAD_ENTRY)) {
                                _csetf_cache_head_entry(v_new, current_value);
                            } else {
                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cache.$cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CAPACITY)) {
                _csetf_cache_capacity(v_new, current_value);
            } else
                if (pcase_var.eql($MAP)) {
                    _csetf_cache_map(v_new, current_value);
                } else
                    if (pcase_var.eql($HEAD_ENTRY)) {
                        _csetf_cache_head_entry(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cache(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CACHE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CAPACITY, cache_capacity(obj));
        funcall(visitor_fn, obj, $SLOT, $MAP, cache_map(obj));
        funcall(visitor_fn, obj, $SLOT, $HEAD_ENTRY, cache_head_entry(obj));
        funcall(visitor_fn, obj, $END, MAKE_CACHE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cache(obj, visitor_fn);
    }

    public static final SubLObject cache_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        cache_entry_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_entry_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cache_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache.$cache_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cache_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache.$cache_entry_native.class ? T : NIL;
    }

    public static final SubLObject cache_entry_newer_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject cache_entry_newer(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cache_entry_key_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject cache_entry_key(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject cache_entry_value_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.getField4();
    }

    public static SubLObject cache_entry_value(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject cache_entry_older_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.getField5();
    }

    public static SubLObject cache_entry_older(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_cache_entry_newer_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cache_entry_newer(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cache_entry_key_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cache_entry_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cache_entry_value_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cache_entry_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_cache_entry_older_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_ENTRY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cache_entry_older(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "! cache.cache_entry_p(v_object) " + "cache.cache_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_cache_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cache.$cache_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NEWER)) {
                        _csetf_cache_entry_newer(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KEY)) {
                            _csetf_cache_entry_key(v_new, current_value);
                        } else {
                            if (pcase_var.eql($VALUE)) {
                                _csetf_cache_entry_value(v_new, current_value);
                            } else {
                                if (pcase_var.eql($OLDER)) {
                                    _csetf_cache_entry_older(v_new, current_value);
                                } else {
                                    Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cache_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cache.$cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEWER)) {
                _csetf_cache_entry_newer(v_new, current_value);
            } else
                if (pcase_var.eql($KEY)) {
                    _csetf_cache_entry_key(v_new, current_value);
                } else
                    if (pcase_var.eql($VALUE)) {
                        _csetf_cache_entry_value(v_new, current_value);
                    } else
                        if (pcase_var.eql($OLDER)) {
                            _csetf_cache_entry_older(v_new, current_value);
                        } else {
                            Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CACHE_ENTRY, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NEWER, cache_entry_newer(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY, cache_entry_key(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE, cache_entry_value(obj));
        funcall(visitor_fn, obj, $SLOT, $OLDER, cache_entry_older(obj));
        funcall(visitor_fn, obj, $END, MAKE_CACHE_ENTRY, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cache_entry(obj, visitor_fn);
    }

    /**
     * Prints CACHE to STREAM, starting with the oldest entries
     *
     * @param CACHE
     * 		cache-p; the cache to be printed
     * @param STREAM
     * 		stream-p; the stream to which to print CACHE
     * @return cache;
     */
    @LispMethod(comment = "Prints CACHE to STREAM, starting with the oldest entries\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache to be printed\r\n@param STREAM\r\n\t\tstream-p; the stream to which to print CACHE\r\n@return cache;")
    public static final SubLObject cache_print_alt(SubLObject v_cache, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string($str_alt38$__CACHE_, stream, UNPROVIDED, UNPROVIDED);
            princ(hash_table_test(cache_map(v_cache)), stream);
            write_string($str_alt39$_, stream, UNPROVIDED, UNPROVIDED);
            princ(cache_size(v_cache), stream);
            if (NIL != $print_cache_elementsP$.getDynamicValue(thread)) {
                write_string($str_alt40$_, stream, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject i = ZERO_INTEGER;
                    SubLObject count = cache_size(v_cache);
                    SubLObject entry = cache_head_entry(v_cache);
                    while (i.numL(min(NINE_INTEGER, subtract(count, ONE_INTEGER)))) {
                        entry = cache_entry_newer(entry);
                        princ(entry, stream);
                        princ($str_alt41$__, stream);
                        i = add(i, ONE_INTEGER);
                    } 
                    if (count.numG(ZERO_INTEGER)) {
                        princ(cache_entry_newer(entry), stream);
                    }
                    if (count.numG(TEN_INTEGER)) {
                        princ($str_alt42$___, UNPROVIDED);
                    }
                    write_string($str_alt43$_, stream, UNPROVIDED, UNPROVIDED);
                }
            }
            write_string($str_alt44$_, stream, UNPROVIDED, UNPROVIDED);
            return v_cache;
        }
    }

    /**
     * Prints CACHE to STREAM, starting with the oldest entries
     *
     * @param CACHE
     * 		cache-p; the cache to be printed
     * @param STREAM
     * 		stream-p; the stream to which to print CACHE
     * @return cache;
     */
    @LispMethod(comment = "Prints CACHE to STREAM, starting with the oldest entries\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache to be printed\r\n@param STREAM\r\n\t\tstream-p; the stream to which to print CACHE\r\n@return cache;")
    public static SubLObject cache_print(final SubLObject v_cache, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($str47$__CACHE_, stream, UNPROVIDED, UNPROVIDED);
        princ(hash_table_test(cache_map(v_cache)), stream);
        write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
        princ(cache_size(v_cache), stream);
        if (NIL != $print_cache_elementsP$.getDynamicValue(thread)) {
            write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
            SubLObject i = ZERO_INTEGER;
            final SubLObject count = cache_size(v_cache);
            SubLObject entry = cache_head_entry(v_cache);
            while (i.numL(min(NINE_INTEGER, subtract(count, ONE_INTEGER)))) {
                entry = cache_entry_newer(entry);
                princ(entry, stream);
                princ($str50$__, stream);
                i = add(i, ONE_INTEGER);
            } 
            if (count.numG(ZERO_INTEGER)) {
                princ(cache_entry_newer(entry), stream);
            }
            if (count.numG(TEN_INTEGER)) {
                princ($str51$___, UNPROVIDED);
            }
            write_string($str52$_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str53$_, stream, UNPROVIDED, UNPROVIDED);
        return v_cache;
    }

    /**
     * Creates a new cache with the specified capacity and test function
     *
     * @param CAPACITY
     * 		positive-integer-p; the maximal number of entries CACHE
     * 		can hold
     * @param TEST
     * 		functionp; the equality test function of CACHE
     * @return cache; the newly created cache
     */
    @LispMethod(comment = "Creates a new cache with the specified capacity and test function\r\n\r\n@param CAPACITY\r\n\t\tpositive-integer-p; the maximal number of entries CACHE\r\n\t\tcan hold\r\n@param TEST\r\n\t\tfunctionp; the equality test function of CACHE\r\n@return cache; the newly created cache")
    public static final SubLObject new_cache_alt(SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(capacity, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
            {
                SubLObject v_cache = make_cache(UNPROVIDED);
                SubLObject head_entry = make_cache_entry(UNPROVIDED);
                _csetf_cache_capacity(v_cache, capacity);
                _csetf_cache_map(v_cache, make_hash_table(capacity, test, UNPROVIDED));
                _csetf_cache_entry_newer(head_entry, head_entry);
                _csetf_cache_entry_older(head_entry, head_entry);
                _csetf_cache_head_entry(v_cache, head_entry);
                if (NIL != $cache_entries_preallocateP$.getDynamicValue(thread)) {
                    set_cache_free_list(v_cache, $RESOURCED);
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                            resource_cache_entry(v_cache, make_cache_entry(UNPROVIDED));
                        }
                    }
                }
                return v_cache;
            }
        }
    }

    /**
     * Creates a new cache with the specified capacity and test function
     *
     * @param CAPACITY
     * 		positive-integer-p; the maximal number of entries CACHE
     * 		can hold
     * @param TEST
     * 		functionp; the equality test function of CACHE
     * @return cache; the newly created cache
     */
    @LispMethod(comment = "Creates a new cache with the specified capacity and test function\r\n\r\n@param CAPACITY\r\n\t\tpositive-integer-p; the maximal number of entries CACHE\r\n\t\tcan hold\r\n@param TEST\r\n\t\tfunctionp; the equality test function of CACHE\r\n@return cache; the newly created cache")
    public static SubLObject new_cache(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(capacity) : "! subl_promotions.positive_integer_p(capacity) " + ("subl_promotions.positive_integer_p(capacity) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(capacity) ") + capacity;
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        final SubLObject v_cache = make_cache(UNPROVIDED);
        final SubLObject head_entry = make_cache_entry(UNPROVIDED);
        _csetf_cache_capacity(v_cache, capacity);
        _csetf_cache_map(v_cache, make_hash_table(ZERO_INTEGER, test, UNPROVIDED));
        _csetf_cache_entry_newer(head_entry, head_entry);
        _csetf_cache_entry_older(head_entry, head_entry);
        _csetf_cache_head_entry(v_cache, head_entry);
        if (NIL != $cache_entries_preallocateP$.getDynamicValue(thread)) {
            set_cache_free_list(v_cache, $RESOURCED);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                resource_cache_entry(v_cache, make_cache_entry(UNPROVIDED));
            }
        }
        return v_cache;
    }

    /**
     * Creates a new cache under preallocation strategy
     *
     * @param CAPACITY
     * 		positive-integer-p; the maximal number of entries CACHE
     * 		can hold
     * @param TEST
     * 		functionp; the equality test function of CACHE
     * @return cache; the newly created cache
     */
    @LispMethod(comment = "Creates a new cache under preallocation strategy\r\n\r\n@param CAPACITY\r\n\t\tpositive-integer-p; the maximal number of entries CACHE\r\n\t\tcan hold\r\n@param TEST\r\n\t\tfunctionp; the equality test function of CACHE\r\n@return cache; the newly created cache")
    public static final SubLObject new_preallocated_cache_alt(SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_entries_preallocateP$.currentBinding(thread);
                    try {
                        $cache_entries_preallocateP$.bind(T, thread);
                        v_cache = new_cache(capacity, test);
                    } finally {
                        $cache_entries_preallocateP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_cache;
            }
        }
    }

    /**
     * Creates a new cache under preallocation strategy
     *
     * @param CAPACITY
     * 		positive-integer-p; the maximal number of entries CACHE
     * 		can hold
     * @param TEST
     * 		functionp; the equality test function of CACHE
     * @return cache; the newly created cache
     */
    @LispMethod(comment = "Creates a new cache under preallocation strategy\r\n\r\n@param CAPACITY\r\n\t\tpositive-integer-p; the maximal number of entries CACHE\r\n\t\tcan hold\r\n@param TEST\r\n\t\tfunctionp; the equality test function of CACHE\r\n@return cache; the newly created cache")
    public static SubLObject new_preallocated_cache(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cache = NIL;
        final SubLObject _prev_bind_0 = $cache_entries_preallocateP$.currentBinding(thread);
        try {
            $cache_entries_preallocateP$.bind(T, thread);
            v_cache = new_cache(capacity, test);
        } finally {
            $cache_entries_preallocateP$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    /**
     * Returns true if CACHE is full, nil otherwise
     *
     * @param CACHE
     * 		cache-p; the cache whose fullness is to be determined
     * @return boolean; true if CACHE is full, nil otherwise
     */
    @LispMethod(comment = "Returns true if CACHE is full, nil otherwise\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose fullness is to be determined\r\n@return boolean; true if CACHE is full, nil otherwise")
    public static final SubLObject cache_full_p_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return numGE(cache_size(v_cache), cache_capacity(v_cache));
    }

    /**
     * Returns true if CACHE is full, nil otherwise
     *
     * @param CACHE
     * 		cache-p; the cache whose fullness is to be determined
     * @return boolean; true if CACHE is full, nil otherwise
     */
    @LispMethod(comment = "Returns true if CACHE is full, nil otherwise\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose fullness is to be determined\r\n@return boolean; true if CACHE is full, nil otherwise")
    public static SubLObject cache_full_p(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return numGE(cache_size(v_cache), cache_capacity(v_cache));
    }

    /**
     * Returns true if CACHE is empty, nil otherwise
     *
     * @param CACHE
     * 		cache-p; the cache whose emptyness is to be determined
     * @return boolean; true if CACHE is empty, nil otherwise
     */
    @LispMethod(comment = "Returns true if CACHE is empty, nil otherwise\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose emptyness is to be determined\r\n@return boolean; true if CACHE is empty, nil otherwise")
    public static final SubLObject cache_empty_p_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return eq(cache_newest(v_cache), cache_head_entry(v_cache));
    }

    /**
     * Returns true if CACHE is empty, nil otherwise
     *
     * @param CACHE
     * 		cache-p; the cache whose emptyness is to be determined
     * @return boolean; true if CACHE is empty, nil otherwise
     */
    @LispMethod(comment = "Returns true if CACHE is empty, nil otherwise\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose emptyness is to be determined\r\n@return boolean; true if CACHE is empty, nil otherwise")
    public static SubLObject cache_empty_p(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return eq(cache_newest(v_cache), cache_head_entry(v_cache));
    }

    /**
     * Returns the entry associated with KEY in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache from which to retrieve the value for KEY
     * @param KEY
     * 		object; the key for which to retrive a value from CACHE
     * @return objects; (i) the value associated with KEY in CACHE (ii) a
    boolean value indicating whether there was an entry for KEY in CACHE
     */
    @LispMethod(comment = "Returns the entry associated with KEY in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to retrieve the value for KEY\r\n@param KEY\r\n\t\tobject; the key for which to retrive a value from CACHE\r\n@return objects; (i) the value associated with KEY in CACHE (ii) a\r\nboolean value indicating whether there was an entry for KEY in CACHE")
    public static final SubLObject cache_get_alt(SubLObject v_cache, SubLObject key) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return cache_get_int(v_cache, key, NIL, T);
    }

    /**
     * Returns the entry associated with KEY in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache from which to retrieve the value for KEY
     * @param KEY
     * 		object; the key for which to retrive a value from CACHE
     * @return objects; (i) the value associated with KEY in CACHE (ii) a
    boolean value indicating whether there was an entry for KEY in CACHE
     */
    @LispMethod(comment = "Returns the entry associated with KEY in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to retrieve the value for KEY\r\n@param KEY\r\n\t\tobject; the key for which to retrive a value from CACHE\r\n@return objects; (i) the value associated with KEY in CACHE (ii) a\r\nboolean value indicating whether there was an entry for KEY in CACHE")
    public static SubLObject cache_get(final SubLObject v_cache, final SubLObject key) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return cache_get_int(v_cache, key, NIL, T);
    }

    /**
     * Returns the entry associated with KEY in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache from which to retrieve the value for KEY
     * @param KEY
     * 		object; the key for which to retrive a value from CACHE
     * @return the value associated with KEY in CACHE,
    or DEFAULT if there was no such entry for KEY in CACHE
     */
    @LispMethod(comment = "Returns the entry associated with KEY in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to retrieve the value for KEY\r\n@param KEY\r\n\t\tobject; the key for which to retrive a value from CACHE\r\n@return the value associated with KEY in CACHE,\r\nor DEFAULT if there was no such entry for KEY in CACHE")
    public static final SubLObject cache_get_without_values_alt(SubLObject v_cache, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return cache_get_int(v_cache, key, v_default, NIL);
    }

    /**
     * Returns the entry associated with KEY in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache from which to retrieve the value for KEY
     * @param KEY
     * 		object; the key for which to retrive a value from CACHE
     * @return the value associated with KEY in CACHE,
    or DEFAULT if there was no such entry for KEY in CACHE
     */
    @LispMethod(comment = "Returns the entry associated with KEY in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to retrieve the value for KEY\r\n@param KEY\r\n\t\tobject; the key for which to retrive a value from CACHE\r\n@return the value associated with KEY in CACHE,\r\nor DEFAULT if there was no such entry for KEY in CACHE")
    public static SubLObject cache_get_without_values(final SubLObject v_cache, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return cache_get_int(v_cache, key, v_default, NIL);
    }

    public static final SubLObject cache_get_int_alt(SubLObject v_cache, SubLObject key, SubLObject v_default, SubLObject return_entry_p) {
        {
            SubLObject entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
            if (NIL == entry) {
                if (NIL != return_entry_p) {
                    return values(NIL, NIL);
                } else {
                    return v_default;
                }
            }
            cache_queue_requeue(v_cache, entry);
            if (NIL != return_entry_p) {
                return values(cache_entry_value(entry), T);
            } else {
                return cache_entry_value(entry);
            }
        }
    }

    public static SubLObject cache_get_int(final SubLObject v_cache, final SubLObject key, final SubLObject v_default, final SubLObject return_entry_p) {
        final SubLObject entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
        if (NIL == entry) {
            if (NIL != return_entry_p) {
                return subl_promotions.values2(NIL, NIL);
            }
            return v_default;
        } else {
            cache_queue_requeue(v_cache, entry);
            if (NIL != return_entry_p) {
                return subl_promotions.values2(cache_entry_value(entry), T);
            }
            return cache_entry_value(entry);
        }
    }

    /**
     * Checks whether the key is currently associated with an entry in the
     * cache. Other than GET, this does not change the ordering of the entries
     * in the cache.
     *
     * @param CACHE
     * 		cache-p; the cache within which to check for an association
     * @param KEY
     * 		object; the key to be checked for association
     * @return T if the key has an association, NIL othewise
     */
    @LispMethod(comment = "Checks whether the key is currently associated with an entry in the\r\ncache. Other than GET, this does not change the ordering of the entries\r\nin the cache.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to check for an association\r\n@param KEY\r\n\t\tobject; the key to be checked for association\r\n@return T if the key has an association, NIL othewise\nChecks whether the key is currently associated with an entry in the\ncache. Other than GET, this does not change the ordering of the entries\nin the cache.")
    public static final SubLObject cache_contains_key_p_alt(SubLObject v_cache, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = gethash(key, cache_map(v_cache), UNPROVIDED);
                SubLObject found_p = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return found_p;
            }
        }
    }

    /**
     * Checks whether the key is currently associated with an entry in the
     * cache. Other than GET, this does not change the ordering of the entries
     * in the cache.
     *
     * @param CACHE
     * 		cache-p; the cache within which to check for an association
     * @param KEY
     * 		object; the key to be checked for association
     * @return T if the key has an association, NIL othewise
     */
    @LispMethod(comment = "Checks whether the key is currently associated with an entry in the\r\ncache. Other than GET, this does not change the ordering of the entries\r\nin the cache.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to check for an association\r\n@param KEY\r\n\t\tobject; the key to be checked for association\r\n@return T if the key has an association, NIL othewise\nChecks whether the key is currently associated with an entry in the\ncache. Other than GET, this does not change the ordering of the entries\nin the cache.")
    public static SubLObject cache_contains_key_p(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = gethash(key, cache_map(v_cache), UNPROVIDED);
        final SubLObject found_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return found_p;
    }

    /**
     * Associates KEY with VALUE in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache within which to associate KEY with VALUE
     * @param KEY
     * 		object; the key to be associated with VALUE
     * @param VALUE
     * 		object; the value to associate with KEY
     * @return objects; (i) the value previously associated with KEY in CACHE (ii) a
    boolean value indicating whether there was an entry previously associated with
    KEY in CACHE
     */
    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return objects; (i) the value previously associated with KEY in CACHE (ii) a\r\nboolean value indicating whether there was an entry previously associated with\r\nKEY in CACHE")
    public static final SubLObject cache_set_alt(SubLObject v_cache, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return cache_set_int(v_cache, key, value, T);
    }

    /**
     * Associates KEY with VALUE in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache within which to associate KEY with VALUE
     * @param KEY
     * 		object; the key to be associated with VALUE
     * @param VALUE
     * 		object; the value to associate with KEY
     * @return objects; (i) the value previously associated with KEY in CACHE (ii) a
    boolean value indicating whether there was an entry previously associated with
    KEY in CACHE
     */
    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return objects; (i) the value previously associated with KEY in CACHE (ii) a\r\nboolean value indicating whether there was an entry previously associated with\r\nKEY in CACHE")
    public static SubLObject cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return cache_set_int(v_cache, key, value, T);
    }

    /**
     * Associates KEY with VALUE in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache within which to associate KEY with VALUE
     * @param KEY
     * 		object; the key to be associated with VALUE
     * @param VALUE
     * 		object; the value to associate with KEY
     * @return the value previously associated with KEY in CACHE
     */
    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return the value previously associated with KEY in CACHE")
    public static final SubLObject cache_set_without_values_alt(SubLObject v_cache, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return cache_set_int(v_cache, key, value, NIL);
    }

    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return the value previously associated with KEY in CACHE")
    public static SubLObject cache_set_without_values(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return cache_set_int(v_cache, key, value, NIL);
    }

    /**
     * Associates KEY with VALUE in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache within which to associate KEY with VALUE
     * @param KEY
     * 		object; the key to be associated with VALUE
     * @param VALUE
     * 		object; the value to associate with KEY
     * @return 0 the key that was dropped from the cache, else NIL
     * @return 1 the values that was dropped from the cache, else NIL
     * @return 2 booleanp ; non-nil iff a key/value association was dropped from the cache.
     */
    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return 0 the key that was dropped from the cache, else NIL\r\n@return 1 the values that was dropped from the cache, else NIL\r\n@return 2 booleanp ; non-nil iff a key/value association was dropped from the cache.")
    public static final SubLObject cache_set_return_dropped_alt(SubLObject v_cache, SubLObject key, SubLObject value) {
        {
            SubLObject oldest_key = NIL;
            SubLObject oldest_value = NIL;
            SubLObject dropped = NIL;
            if ((NIL != cache_full_p(v_cache)) && ($UNKNOWN == cache_get_without_values(v_cache, key, $UNKNOWN))) {
                oldest_key = cache_entry_key(cache_oldest(v_cache));
                oldest_value = cache_get_without_values(v_cache, oldest_key, UNPROVIDED);
                dropped = T;
                cache_remove(v_cache, oldest_key);
            }
            cache_set_without_values(v_cache, key, value);
            return values(oldest_key, oldest_value, dropped);
        }
    }

    @LispMethod(comment = "Associates KEY with VALUE in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache within which to associate KEY with VALUE\r\n@param KEY\r\n\t\tobject; the key to be associated with VALUE\r\n@param VALUE\r\n\t\tobject; the value to associate with KEY\r\n@return 0 the key that was dropped from the cache, else NIL\r\n@return 1 the values that was dropped from the cache, else NIL\r\n@return 2 booleanp ; non-nil iff a key/value association was dropped from the cache.")
    public static SubLObject cache_set_return_dropped(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        SubLObject oldest_key = NIL;
        SubLObject oldest_value = NIL;
        SubLObject dropped = NIL;
        if ((NIL != cache_full_p(v_cache)) && ($UNKNOWN == cache_get_without_values(v_cache, key, $UNKNOWN))) {
            oldest_key = cache_entry_key(cache_oldest(v_cache));
            oldest_value = cache_get_without_values(v_cache, oldest_key, UNPROVIDED);
            dropped = T;
            cache_remove(v_cache, oldest_key);
        }
        cache_set_without_values(v_cache, key, value);
        return subl_promotions.values3(oldest_key, oldest_value, dropped);
    }

    public static final SubLObject cache_set_int_alt(SubLObject v_cache, SubLObject key, SubLObject value, SubLObject return_old_entry) {
        {
            SubLObject old_entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
            SubLObject previous = NIL;
            if (NIL != old_entry) {
                previous = cache_entry_value(old_entry);
                _csetf_cache_entry_value(old_entry, value);
                cache_queue_requeue(v_cache, old_entry);
            } else {
                {
                    SubLObject entry = NIL;
                    if (NIL != cache_full_p(v_cache)) {
                        entry = cache_oldest(v_cache);
                        remhash(cache_entry_key(entry), cache_map(v_cache));
                        cache_queue_unlink(entry);
                    } else {
                        entry = get_new_cache_entry(v_cache);
                    }
                    _csetf_cache_entry_key(entry, key);
                    _csetf_cache_entry_value(entry, value);
                    sethash(key, cache_map(v_cache), entry);
                    cache_queue_enqueue(v_cache, entry);
                }
            }
            if (NIL != return_old_entry) {
                return values(previous, list_utilities.sublisp_boolean(old_entry));
            } else {
                return previous;
            }
        }
    }

    public static SubLObject cache_set_int(final SubLObject v_cache, final SubLObject key, final SubLObject value, final SubLObject return_old_entry) {
        final SubLObject old_entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
        SubLObject previous = NIL;
        if (NIL != old_entry) {
            previous = cache_entry_value(old_entry);
            _csetf_cache_entry_value(old_entry, value);
            cache_queue_requeue(v_cache, old_entry);
        } else {
            SubLObject entry = NIL;
            if (NIL != cache_full_p(v_cache)) {
                entry = cache_oldest(v_cache);
                remhash(cache_entry_key(entry), cache_map(v_cache));
                cache_queue_unlink(entry);
            } else {
                entry = get_new_cache_entry(v_cache);
            }
            _csetf_cache_entry_key(entry, key);
            _csetf_cache_entry_value(entry, value);
            sethash(key, cache_map(v_cache), entry);
            cache_queue_enqueue(v_cache, entry);
        }
        if (NIL != return_old_entry) {
            return subl_promotions.values2(previous, list_utilities.sublisp_boolean(old_entry));
        }
        return previous;
    }

    /**
     * Removes the mapping for KEY from CACHE
     *
     * @param CACHE
     * 		cache-p; the cache from which to remove the entry for KEY
     * @param KEY
     * 		object; the KEY to be removed from CACHE
     * @return cache; (i) the value previously associated with KEY in CACHE (ii) a boolean value
    indicating whether a value was previously associated with KEY in CACHE
     */
    @LispMethod(comment = "Removes the mapping for KEY from CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to remove the entry for KEY\r\n@param KEY\r\n\t\tobject; the KEY to be removed from CACHE\r\n@return cache; (i) the value previously associated with KEY in CACHE (ii) a boolean value\r\nindicating whether a value was previously associated with KEY in CACHE")
    public static final SubLObject cache_remove_alt(SubLObject v_cache, SubLObject key) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        {
            SubLObject entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
            SubLObject value = NIL;
            if (NIL != entry) {
                cache_queue_remove(v_cache, entry);
                remhash(key, cache_map(v_cache));
                value = cache_entry_value(entry);
            }
            return values(value, list_utilities.sublisp_boolean(entry));
        }
    }

    @LispMethod(comment = "Removes the mapping for KEY from CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to remove the entry for KEY\r\n@param KEY\r\n\t\tobject; the KEY to be removed from CACHE\r\n@return cache; (i) the value previously associated with KEY in CACHE (ii) a boolean value\r\nindicating whether a value was previously associated with KEY in CACHE")
    public static SubLObject cache_remove(final SubLObject v_cache, final SubLObject key) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        final SubLObject entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
        SubLObject value = NIL;
        if (NIL != entry) {
            cache_queue_remove(v_cache, entry);
            remhash(key, cache_map(v_cache));
            value = cache_entry_value(entry);
        }
        return subl_promotions.values2(value, list_utilities.sublisp_boolean(entry));
    }

    /**
     * Removes all entries from CACHE, either individually (if precached)
     * or agressively
     *
     * @param CACHE
     * 		cache-p; the cache from which to remove all entries
     * @return CACHE; a destructively modified version of CACHE without any entries
     */
    @LispMethod(comment = "Removes all entries from CACHE, either individually (if precached)\r\nor agressively\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to remove all entries\r\n@return CACHE; a destructively modified version of CACHE without any entries\nRemoves all entries from CACHE, either individually (if precached)\nor agressively")
    public static final SubLObject cache_clear_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        if (NIL != is_cache_preallocated_p(v_cache)) {
            while (NIL == cache_empty_p(v_cache)) {
                {
                    SubLObject oldest = cache_oldest(v_cache);
                    cache_remove(v_cache, cache_entry_key(oldest));
                }
            } 
        } else {
            {
                SubLObject head_entry = cache_head_entry(v_cache);
                _csetf_cache_entry_newer(head_entry, head_entry);
                _csetf_cache_entry_older(head_entry, head_entry);
                clrhash(cache_map(v_cache));
            }
        }
        return v_cache;
    }

    @LispMethod(comment = "Removes all entries from CACHE, either individually (if precached)\r\nor agressively\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from which to remove all entries\r\n@return CACHE; a destructively modified version of CACHE without any entries\nRemoves all entries from CACHE, either individually (if precached)\nor agressively")
    public static SubLObject cache_clear(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        if (NIL != is_cache_preallocated_p(v_cache)) {
            while (NIL == cache_empty_p(v_cache)) {
                final SubLObject oldest = cache_oldest(v_cache);
                cache_remove(v_cache, cache_entry_key(oldest));
            } 
        } else {
            final SubLObject head_entry = cache_head_entry(v_cache);
            _csetf_cache_entry_newer(head_entry, head_entry);
            _csetf_cache_entry_older(head_entry, head_entry);
            clrhash(cache_map(v_cache));
        }
        return v_cache;
    }

    /**
     * Returns the equality test used in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache whose test is to be returned
     * @return function; the test function used in CACHE
     */
    @LispMethod(comment = "Returns the equality test used in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose test is to be returned\r\n@return function; the test function used in CACHE")
    public static final SubLObject cache_test_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return hash_table_test(cache_map(v_cache));
    }

    @LispMethod(comment = "Returns the equality test used in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose test is to be returned\r\n@return function; the test function used in CACHE")
    public static SubLObject cache_test(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return hash_table_test(cache_map(v_cache));
    }

    /**
     * Returns the number of entries in CACHE
     *
     * @param CACHE
     * 		cache-p; the cache whose size is to be computed
     * @return integer; the number entries in CACHE
     */
    @LispMethod(comment = "Returns the number of entries in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose size is to be computed\r\n@return integer; the number entries in CACHE")
    public static final SubLObject cache_size_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return hash_table_count(cache_map(v_cache));
    }

    @LispMethod(comment = "Returns the number of entries in CACHE\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose size is to be computed\r\n@return integer; the number entries in CACHE")
    public static SubLObject cache_size(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return hash_table_count(cache_map(v_cache));
    }

    /**
     * Execute BODY with KEY and VALUE successively bound to each key and value in CACHE.
     * When ORDER is :newest, iteration visits from most-recently-used to least-recently-used.
     * When ORDER is :oldest, iteration visits from least-recently-used to most-recently-used.
     */
    @LispMethod(comment = "Execute BODY with KEY and VALUE successively bound to each key and value in CACHE.\r\nWhen ORDER is :newest, iteration visits from most-recently-used to least-recently-used.\r\nWhen ORDER is :oldest, iteration visits from least-recently-used to most-recently-used.\nExecute BODY with KEY and VALUE successively bound to each key and value in CACHE.\nWhen ORDER is :newest, iteration visits from most-recently-used to least-recently-used.\nWhen ORDER is :oldest, iteration visits from least-recently-used to most-recently-used.")
    public static final SubLObject do_cache_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt49);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject v_cache = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    v_cache = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt49);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt49);
                            if (NIL == member(current_1, $list_alt50, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt49);
                        }
                        {
                            SubLObject order_tail = property_list_member($ORDER, current);
                            SubLObject order = (NIL != order_tail) ? ((SubLObject) (cadr(order_tail))) : $NEWEST;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject cache_var = $sym54$CACHE_VAR;
                                SubLObject order_var = $sym55$ORDER_VAR;
                                SubLObject entry = $sym56$ENTRY;
                                return list(CLET, list(list(cache_var, v_cache), list(order_var, order), list(entry, list(DO_CACHE_FIRST, cache_var, order_var)), key, value), listS(WHILE, list(CNOT, list($sym61$DO_CACHE_DONE_, cache_var, entry)), list(CSETQ, key, list(DO_CACHE_KEY, entry)), list(CSETQ, value, list(DO_CACHE_VALUE, entry)), list(CSETQ, entry, list(DO_CACHE_NEXT, entry, order_var)), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Execute BODY with KEY and VALUE successively bound to each key and value in CACHE.\r\nWhen ORDER is :newest, iteration visits from most-recently-used to least-recently-used.\r\nWhen ORDER is :oldest, iteration visits from least-recently-used to most-recently-used.\nExecute BODY with KEY and VALUE successively bound to each key and value in CACHE.\nWhen ORDER is :newest, iteration visits from most-recently-used to least-recently-used.\nWhen ORDER is :oldest, iteration visits from least-recently-used to most-recently-used.")
    public static SubLObject do_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject v_cache = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        v_cache = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list58);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list58);
            if (NIL == member(current_$1, $list59, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list58);
        }
        final SubLObject order_tail = property_list_member($ORDER, current);
        final SubLObject order = (NIL != order_tail) ? cadr(order_tail) : $NEWEST;
        final SubLObject body;
        current = body = temp;
        final SubLObject cache_var = $sym63$CACHE_VAR;
        final SubLObject order_var = $sym64$ORDER_VAR;
        final SubLObject entry = $sym65$ENTRY;
        return list(CLET, list(list(cache_var, v_cache), list(order_var, order), list(entry, list(DO_CACHE_FIRST, cache_var, order_var)), key, value), listS(WHILE, list(CNOT, list($sym70$DO_CACHE_DONE_, cache_var, entry)), list(CSETQ, key, list(DO_CACHE_KEY, entry)), list(CSETQ, value, list(DO_CACHE_VALUE, entry)), list(CSETQ, entry, list(DO_CACHE_NEXT, entry, order_var)), append(body, NIL)));
    }

    /**
     * Returns a new cache with the same entries as the given CACHE.
     *
     * @param CACHE
     * 		cache-p; the cache that should be shallowly cloned
     * @return cache-p; the newly created cache
     */
    @LispMethod(comment = "Returns a new cache with the same entries as the given CACHE.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache that should be shallowly cloned\r\n@return cache-p; the newly created cache")
    public static final SubLObject cache_copy_alt(SubLObject v_cache) {
        {
            SubLObject copy = new_cache(cache_capacity(v_cache), cache_test(v_cache));
            SubLObject cache_var = v_cache;
            SubLObject order_var = $OLDEST;
            SubLObject entry = do_cache_first(cache_var, order_var);
            SubLObject key = NIL;
            SubLObject value = NIL;
            while (NIL == do_cache_doneP(cache_var, entry)) {
                key = do_cache_key(entry);
                value = do_cache_value(entry);
                entry = do_cache_next(entry, order_var);
                cache_set(copy, key, value);
            } 
            return copy;
        }
    }

    @LispMethod(comment = "Returns a new cache with the same entries as the given CACHE.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache that should be shallowly cloned\r\n@return cache-p; the newly created cache")
    public static SubLObject cache_copy(final SubLObject v_cache) {
        final SubLObject copy = new_cache(cache_capacity(v_cache), cache_test(v_cache));
        final SubLObject order_var = $OLDEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = NIL;
        SubLObject value = NIL;
        while (NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            cache_set(copy, key, value);
        } 
        return copy;
    }

    public static final SubLObject do_cache_first_alt(SubLObject v_cache, SubLObject order) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return do_cache_next(cache_head_entry(v_cache), order);
    }

    public static SubLObject do_cache_first(final SubLObject v_cache, final SubLObject order) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return do_cache_next(cache_head_entry(v_cache), order);
    }

    public static final SubLObject do_cache_doneP_alt(SubLObject v_cache, SubLObject entry) {
        return eq(entry, cache_head_entry(v_cache));
    }

    public static SubLObject do_cache_doneP(final SubLObject v_cache, final SubLObject entry) {
        return eq(entry, cache_head_entry(v_cache));
    }

    public static final SubLObject do_cache_key_alt(SubLObject entry) {
        return cache_entry_key(entry);
    }

    public static SubLObject do_cache_key(final SubLObject entry) {
        return cache_entry_key(entry);
    }

    public static final SubLObject do_cache_value_alt(SubLObject entry) {
        return cache_entry_value(entry);
    }

    public static SubLObject do_cache_value(final SubLObject entry) {
        return cache_entry_value(entry);
    }

    public static final SubLObject do_cache_next_alt(SubLObject entry, SubLObject order) {
        {
            SubLObject pcase_var = order;
            if (pcase_var.eql($NEWEST)) {
                return cache_entry_older(entry);
            } else {
                if (pcase_var.eql($OLDEST)) {
                    return cache_entry_newer(entry);
                } else {
                    return Errors.error($str_alt68$_S_was_not_either__NEWEST_or__OLD, order);
                }
            }
        }
    }

    public static SubLObject do_cache_next(final SubLObject entry, final SubLObject order) {
        if (order.eql($NEWEST)) {
            return cache_entry_older(entry);
        }
        if (order.eql($OLDEST)) {
            return cache_entry_newer(entry);
        }
        return Errors.error($str77$_S_was_not_either__NEWEST_or__OLD, order);
    }

    /**
     *
     *
     * @return listp; a list of all keys of CACHE ordered from most-recently used to
    least-recently used
     */
    @LispMethod(comment = "@return listp; a list of all keys of CACHE ordered from most-recently used to\r\nleast-recently used")
    public static final SubLObject cache_keys_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        {
            SubLObject keys = NIL;
            SubLObject cache_var = v_cache;
            SubLObject order_var = $NEWEST;
            SubLObject entry = do_cache_first(cache_var, order_var);
            SubLObject key = NIL;
            SubLObject value = NIL;
            while (NIL == do_cache_doneP(cache_var, entry)) {
                key = do_cache_key(entry);
                value = do_cache_value(entry);
                entry = do_cache_next(entry, order_var);
                keys = cons(key, keys);
            } 
            return nreverse(keys);
        }
    }

    /**
     *
     *
     * @return listp; a list of all keys of CACHE ordered from most-recently used to
    least-recently used
     */
    @LispMethod(comment = "@return listp; a list of all keys of CACHE ordered from most-recently used to\r\nleast-recently used")
    public static SubLObject cache_keys(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        SubLObject keys = NIL;
        final SubLObject order_var = $NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = NIL;
        SubLObject value = NIL;
        while (NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            keys = cons(key, keys);
        } 
        return nreverse(keys);
    }

    /**
     *
     *
     * @return listp; a list of all values of CACHE ordered from most-recently used to
    least-recently used
     */
    @LispMethod(comment = "@return listp; a list of all values of CACHE ordered from most-recently used to\r\nleast-recently used")
    public static final SubLObject cache_values_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        {
            SubLObject values = NIL;
            SubLObject cache_var = v_cache;
            SubLObject order_var = $NEWEST;
            SubLObject entry = do_cache_first(cache_var, order_var);
            SubLObject key = NIL;
            SubLObject value = NIL;
            while (NIL == do_cache_doneP(cache_var, entry)) {
                key = do_cache_key(entry);
                value = do_cache_value(entry);
                entry = do_cache_next(entry, order_var);
                values = cons(value, values);
            } 
            return nreverse(values);
        }
    }

    /**
     *
     *
     * @return listp; a list of all values of CACHE ordered from most-recently used to
    least-recently used
     */
    @LispMethod(comment = "@return listp; a list of all values of CACHE ordered from most-recently used to\r\nleast-recently used")
    public static SubLObject cache_values(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        SubLObject values = NIL;
        final SubLObject order_var = $NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = NIL;
        for (SubLObject value = NIL; NIL == do_cache_doneP(v_cache, entry); entry = do_cache_next(entry, order_var) , values = cons(value, values)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
        }
        return nreverse(values);
    }

    /**
     * Map across CACHE, calling FUNCTION on each key value pair.
     * Function should have a formal parameter list of (key value).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across CACHE, calling FUNCTION on each key value pair.\r\nFunction should have a formal parameter list of (key value).\r\n\r\n@return NIL\nMap across CACHE, calling FUNCTION on each key value pair.\nFunction should have a formal parameter list of (key value).")
    public static final SubLObject map_cache_alt(SubLObject v_cache, SubLObject function) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        {
            SubLObject cache_var = v_cache;
            SubLObject order_var = $NEWEST;
            SubLObject entry = do_cache_first(cache_var, order_var);
            SubLObject key = NIL;
            SubLObject value = NIL;
            while (NIL == do_cache_doneP(cache_var, entry)) {
                key = do_cache_key(entry);
                value = do_cache_value(entry);
                entry = do_cache_next(entry, order_var);
                funcall(function, key, value);
            } 
        }
        return NIL;
    }

    @LispMethod(comment = "Map across CACHE, calling FUNCTION on each key value pair.\r\nFunction should have a formal parameter list of (key value).\r\n\r\n@return NIL\nMap across CACHE, calling FUNCTION on each key value pair.\nFunction should have a formal parameter list of (key value).")
    public static SubLObject map_cache(final SubLObject v_cache, final SubLObject function) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        final SubLObject order_var = $NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = NIL;
        SubLObject value = NIL;
        while (NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            funcall(function, key, value);
        } 
        return NIL;
    }

    /**
     * Returns an iterator for CACHE that returns a cache-entry in each iteration. The
     * sequence in which items are returned is from most-recently used to least
     * recently used
     */
    @LispMethod(comment = "Returns an iterator for CACHE that returns a cache-entry in each iteration. The\r\nsequence in which items are returned is from most-recently used to least\r\nrecently used\nReturns an iterator for CACHE that returns a cache-entry in each iteration. The\nsequence in which items are returned is from most-recently used to least\nrecently used")
    public static final SubLObject new_cache_iterator_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return iteration.new_iterator(make_iterator_cache_state(v_cache), CACHE_ITERATOR_DONE, CACHE_ITERATOR_NEXT, UNPROVIDED);
    }

    @LispMethod(comment = "Returns an iterator for CACHE that returns a cache-entry in each iteration. The\r\nsequence in which items are returned is from most-recently used to least\r\nrecently used\nReturns an iterator for CACHE that returns a cache-entry in each iteration. The\nsequence in which items are returned is from most-recently used to least\nrecently used")
    public static SubLObject new_cache_iterator(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return iteration.new_iterator(make_iterator_cache_state(v_cache), CACHE_ITERATOR_DONE, CACHE_ITERATOR_NEXT, UNPROVIDED);
    }/**
     * Returns an iterator for CACHE that returns a cache-entry in each iteration. The
     * sequence in which items are returned is from most-recently used to least
     * recently used
     */


    public static final SubLObject make_iterator_cache_state_alt(SubLObject v_cache) {
        {
            SubLObject current = cache_entry_older(cache_head_entry(v_cache));
            return list(current, cache_head_entry(v_cache));
        }
    }

    public static SubLObject make_iterator_cache_state(final SubLObject v_cache) {
        final SubLObject current = cache_entry_older(cache_head_entry(v_cache));
        return list(current, cache_head_entry(v_cache));
    }

    public static final SubLObject cache_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_2 = NIL;
            SubLObject head_entry = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            current_2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            head_entry = current.first();
            current = current.rest();
            if (NIL == current) {
                return eq(current_2, head_entry);
            } else {
                cdestructuring_bind_error(datum, $list_alt72);
            }
        }
        return NIL;
    }

    public static SubLObject cache_iterator_done(final SubLObject state) {
        SubLObject current_$2 = NIL;
        SubLObject head_entry = NIL;
        destructuring_bind_must_consp(state, state, $list81);
        current_$2 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list81);
        head_entry = current.first();
        current = current.rest();
        if (NIL == current) {
            return eq(current_$2, head_entry);
        }
        cdestructuring_bind_error(state, $list81);
        return NIL;
    }

    public static final SubLObject cache_iterator_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_3 = NIL;
            SubLObject head_entry = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            current_3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            head_entry = current.first();
            current = current.rest();
            if (NIL == current) {
                rplaca(state, cache_entry_older(current_3));
                return values(current_3, state, eq(current_3, head_entry));
            } else {
                cdestructuring_bind_error(datum, $list_alt72);
            }
        }
        return NIL;
    }

    public static SubLObject cache_iterator_next(final SubLObject state) {
        SubLObject current_$3 = NIL;
        SubLObject head_entry = NIL;
        destructuring_bind_must_consp(state, state, $list81);
        current_$3 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list81);
        head_entry = current.first();
        current = current.rest();
        if (NIL == current) {
            rplaca(state, cache_entry_older(current_$3));
            return subl_promotions.values3(current_$3, state, eq(current_$3, head_entry));
        }
        cdestructuring_bind_error(state, $list81);
        return NIL;
    }

    /**
     * Returns an iterator for the CACHE that returns a cons-pair of each
     * key-value association. The sequence in which items are returned
     * is equivalent to that of the NEW-CACHE-ITERATOR
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Returns an iterator for the CACHE that returns a cons-pair of each\r\nkey-value association. The sequence in which items are returned\r\nis equivalent to that of the NEW-CACHE-ITERATOR\r\n\r\n@return ITERATOR-P\nReturns an iterator for the CACHE that returns a cons-pair of each\nkey-value association. The sequence in which items are returned\nis equivalent to that of the NEW-CACHE-ITERATOR")
    public static final SubLObject new_cache_content_iterator_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        return iteration.new_iterator(make_cache_content_iterator_state(v_cache), CACHE_CONTENT_ITERATOR_DONE, CACHE_CONTENT_ITERATOR_NEXT, UNPROVIDED);
    }

    @LispMethod(comment = "Returns an iterator for the CACHE that returns a cons-pair of each\r\nkey-value association. The sequence in which items are returned\r\nis equivalent to that of the NEW-CACHE-ITERATOR\r\n\r\n@return ITERATOR-P\nReturns an iterator for the CACHE that returns a cons-pair of each\nkey-value association. The sequence in which items are returned\nis equivalent to that of the NEW-CACHE-ITERATOR")
    public static SubLObject new_cache_content_iterator(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
        return iteration.new_iterator(make_cache_content_iterator_state(v_cache), CACHE_CONTENT_ITERATOR_DONE, CACHE_CONTENT_ITERATOR_NEXT, UNPROVIDED);
    }/**
     * Returns an iterator for the CACHE that returns a cons-pair of each
     * key-value association. The sequence in which items are returned
     * is equivalent to that of the NEW-CACHE-ITERATOR
     *
     * @return ITERATOR-P
     */


    public static final SubLObject make_cache_content_iterator_state_alt(SubLObject v_cache) {
        {
            SubLObject interior_iterator = new_cache_iterator(v_cache);
            return interior_iterator;
        }
    }

    public static SubLObject make_cache_content_iterator_state(final SubLObject v_cache) {
        final SubLObject interior_iterator = new_cache_iterator(v_cache);
        return interior_iterator;
    }

    public static final SubLObject cache_content_iterator_done_alt(SubLObject state) {
        {
            SubLObject interior_iterator = state;
            return iteration.iteration_done(interior_iterator);
        }
    }

    public static SubLObject cache_content_iterator_done(final SubLObject state) {
        return iteration.iteration_done(state);
    }

    public static final SubLObject cache_content_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_iterator = state;
                thread.resetMultipleValues();
                {
                    SubLObject current_entry = iteration.iteration_next(interior_iterator);
                    SubLObject valid_p = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid_p) {
                        {
                            SubLObject key = cache_entry_key(current_entry);
                            SubLObject value = cache_entry_value(current_entry);
                            return values(cons(key, value), interior_iterator, NIL);
                        }
                    }
                }
                return values(NIL, interior_iterator, T);
            }
        }
    }

    public static SubLObject cache_content_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject current_entry = iteration.iteration_next(state);
        final SubLObject valid_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != valid_p) {
            final SubLObject key = cache_entry_key(current_entry);
            final SubLObject value = cache_entry_value(current_entry);
            return subl_promotions.values3(cons(key, value), state, NIL);
        }
        return subl_promotions.values3(NIL, state, T);
    }

    public static final SubLObject cfasl_output_object_cache_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_cache(v_object, stream);
    }

    public static SubLObject cfasl_output_object_cache_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_cache(v_object, stream);
    }

    public static final SubLObject cfasl_output_cache_alt(SubLObject v_object, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_cache$.getGlobalValue(), stream);
        {
            SubLObject capacity = cache_capacity(v_object);
            SubLObject test = hash_test_to_symbol(cache_test(v_object));
            SubLObject size = cache_size(v_object);
            cfasl_output(capacity, stream);
            cfasl_output(test, stream);
            cfasl_output(size, stream);
            {
                SubLObject cache_var = v_object;
                SubLObject order_var = $OLDEST;
                SubLObject entry = do_cache_first(cache_var, order_var);
                SubLObject key = NIL;
                SubLObject value = NIL;
                while (NIL == do_cache_doneP(cache_var, entry)) {
                    key = do_cache_key(entry);
                    value = do_cache_value(entry);
                    entry = do_cache_next(entry, order_var);
                    cfasl_output(key, stream);
                    cfasl_output(value, stream);
                } 
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_output_cache(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_cache$.getGlobalValue(), stream);
        final SubLObject capacity = cache_capacity(v_object);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(cache_test(v_object));
        final SubLObject size = cache_size(v_object);
        cfasl_output(capacity, stream);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        final SubLObject order_var = $OLDEST;
        SubLObject entry = do_cache_first(v_object, order_var);
        SubLObject key = NIL;
        SubLObject value = NIL;
        while (NIL == do_cache_doneP(v_object, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            cfasl_output(key, stream);
            cfasl_output(value, stream);
        } 
        return v_object;
    }

    public static final SubLObject cfasl_input_cache_alt(SubLObject stream) {
        {
            SubLObject capacity = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_cache = NIL;
            SubLObject pcase_var = test;
            if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
                test = symbol_function(test);
            }
            v_cache = new_cache(capacity, test);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        SubLObject value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        cache_set_without_values(v_cache, key, value);
                    }
                }
            }
            return v_cache;
        }
    }

    public static SubLObject cfasl_input_cache(final SubLObject stream) {
        final SubLObject capacity = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject v_cache = NIL;
        final SubLObject pcase_var = test;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(test);
        }
        v_cache = new_cache(capacity, test);
        SubLObject i;
        SubLObject key;
        SubLObject value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            cache_set_without_values(v_cache, key, value);
        }
        return v_cache;
    }

    /**
     * Returns the entry of CACHE that was added most recently
     *
     * @param CACHE
     * 		cache-p; the cache whose most recently added cache entry is to be returned
     * @return cache-entry; the entry of CACHE that was added most recently
     */
    @LispMethod(comment = "Returns the entry of CACHE that was added most recently\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose most recently added cache entry is to be returned\r\n@return cache-entry; the entry of CACHE that was added most recently")
    public static final SubLObject cache_newest_alt(SubLObject v_cache) {
        return cache_entry_older(cache_head_entry(v_cache));
    }

    @LispMethod(comment = "Returns the entry of CACHE that was added most recently\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose most recently added cache entry is to be returned\r\n@return cache-entry; the entry of CACHE that was added most recently")
    public static SubLObject cache_newest(final SubLObject v_cache) {
        return cache_entry_older(cache_head_entry(v_cache));
    }/**
     * Returns the entry of CACHE that was added most recently
     *
     * @param CACHE
     * 		cache-p; the cache whose most recently added cache entry is to be returned
     * @return cache-entry; the entry of CACHE that was added most recently
     */


    /**
     * Returns the entry of CACHE that was added least recently
     *
     * @param CACHE
     * 		cache-p; the cache whose least recently added cache entry is to be returned
     * @return cache-entry; the entry of CACHE that was added least recently
     */
    @LispMethod(comment = "Returns the entry of CACHE that was added least recently\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose least recently added cache entry is to be returned\r\n@return cache-entry; the entry of CACHE that was added least recently")
    public static final SubLObject cache_oldest_alt(SubLObject v_cache) {
        return cache_entry_newer(cache_head_entry(v_cache));
    }

    @LispMethod(comment = "Returns the entry of CACHE that was added least recently\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose least recently added cache entry is to be returned\r\n@return cache-entry; the entry of CACHE that was added least recently")
    public static SubLObject cache_oldest(final SubLObject v_cache) {
        return cache_entry_newer(cache_head_entry(v_cache));
    }/**
     * Returns the entry of CACHE that was added least recently
     *
     * @param CACHE
     * 		cache-p; the cache whose least recently added cache entry is to be returned
     * @return cache-entry; the entry of CACHE that was added least recently
     */


    /**
     * Removes ENTRY from the CACHE's priority queue
     *
     * @param CACHE
     * 		cache-p; the cache from whose queue to remove ENTRY;
     * @param ENTRY
     * 		cache-entry; the cache entry to remove from CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    removed from CACHE's queue
     */
    @LispMethod(comment = "Removes ENTRY from the CACHE\'s priority queue\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from whose queue to remove ENTRY;\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to remove from CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nremoved from CACHE\'s queue")
    public static final SubLObject cache_queue_remove_alt(SubLObject v_cache, SubLObject entry) {
        cache_queue_unlink(entry);
        possibly_resource_cache_entry(v_cache, entry);
        return v_cache;
    }

    @LispMethod(comment = "Removes ENTRY from the CACHE\'s priority queue\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache from whose queue to remove ENTRY;\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to remove from CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nremoved from CACHE\'s queue")
    public static SubLObject cache_queue_remove(final SubLObject v_cache, final SubLObject entry) {
        cache_queue_unlink(entry);
        possibly_resource_cache_entry(v_cache, entry);
        return v_cache;
    }/**
     * Removes ENTRY from the CACHE's priority queue
     *
     * @param CACHE
     * 		cache-p; the cache from whose queue to remove ENTRY;
     * @param ENTRY
     * 		cache-entry; the cache entry to remove from CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    removed from CACHE's queue
     */


    /**
     * Update the cache queue so that the entry becomes the newest ENTRY
     *
     * @param CACHE
     * 		cache-p; the cache whose queue to update
     * @param ENTRY
     * 		cache-entry; the cache entry to update
     * @return cache; the updated CACHE with entry as CACHE-NEWEST
     */
    @LispMethod(comment = "Update the cache queue so that the entry becomes the newest ENTRY\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose queue to update\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to update\r\n@return cache; the updated CACHE with entry as CACHE-NEWEST")
    public static final SubLObject cache_queue_requeue_alt(SubLObject v_cache, SubLObject entry) {
        cache_queue_unlink(entry);
        cache_queue_append(v_cache, entry);
        return v_cache;
    }

    @LispMethod(comment = "Update the cache queue so that the entry becomes the newest ENTRY\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose queue to update\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to update\r\n@return cache; the updated CACHE with entry as CACHE-NEWEST")
    public static SubLObject cache_queue_requeue(final SubLObject v_cache, final SubLObject entry) {
        if (!entry.eql(cache_newest(v_cache))) {
            cache_queue_unlink(entry);
            cache_queue_append(v_cache, entry);
        }
        return v_cache;
    }/**
     * Update the cache queue so that the entry becomes the newest ENTRY
     *
     * @param CACHE
     * 		cache-p; the cache whose queue to update
     * @param ENTRY
     * 		cache-entry; the cache entry to update
     * @return cache; the updated CACHE with entry as CACHE-NEWEST
     */


    /**
     * Enqueues ENTRY onto CACHE's priority queue
     *
     * @param CACHE
     * 		cache-p; the cache onto whose queue to enqueue ENTRY
     * @param ENTRY
     * 		cache-entry; the cache entry to enqueue onto CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    enqueued onto CACHE's queue
     */
    @LispMethod(comment = "Enqueues ENTRY onto CACHE\'s priority queue\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache onto whose queue to enqueue ENTRY\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to enqueue onto CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nenqueued onto CACHE\'s queue")
    public static final SubLObject cache_queue_enqueue_alt(SubLObject v_cache, SubLObject entry) {
        return cache_queue_append(v_cache, entry);
    }

    @LispMethod(comment = "Enqueues ENTRY onto CACHE\'s priority queue\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache onto whose queue to enqueue ENTRY\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to enqueue onto CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nenqueued onto CACHE\'s queue")
    public static SubLObject cache_queue_enqueue(final SubLObject v_cache, final SubLObject entry) {
        return cache_queue_append(v_cache, entry);
    }/**
     * Enqueues ENTRY onto CACHE's priority queue
     *
     * @param CACHE
     * 		cache-p; the cache onto whose queue to enqueue ENTRY
     * @param ENTRY
     * 		cache-entry; the cache entry to enqueue onto CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    enqueued onto CACHE's queue
     */


    /**
     * Add ENTRY onto CACHE's priority queue at the end
     *
     * @param CACHE
     * 		cache-p; the cache onto whose queue to enqueue ENTRY
     * @param ENTRY
     * 		cache-entry; the cache entry to enqueue onto CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    enqueued onto CACHE's queue
     */
    @LispMethod(comment = "Add ENTRY onto CACHE\'s priority queue at the end\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache onto whose queue to enqueue ENTRY\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to enqueue onto CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nenqueued onto CACHE\'s queue")
    public static final SubLObject cache_queue_append_alt(SubLObject v_cache, SubLObject entry) {
        _csetf_cache_entry_newer(entry, cache_head_entry(v_cache));
        _csetf_cache_entry_older(entry, cache_newest(v_cache));
        _csetf_cache_entry_newer(cache_newest(v_cache), entry);
        _csetf_cache_entry_older(cache_head_entry(v_cache), entry);
        return v_cache;
    }

    @LispMethod(comment = "Add ENTRY onto CACHE\'s priority queue at the end\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache onto whose queue to enqueue ENTRY\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to enqueue onto CACHE\'s queue\r\n@return cache; a destructively modified version of CACHE where ENTRY has been\r\nenqueued onto CACHE\'s queue")
    public static SubLObject cache_queue_append(final SubLObject v_cache, final SubLObject entry) {
        _csetf_cache_entry_newer(entry, cache_head_entry(v_cache));
        _csetf_cache_entry_older(entry, cache_newest(v_cache));
        _csetf_cache_entry_newer(cache_newest(v_cache), entry);
        _csetf_cache_entry_older(cache_head_entry(v_cache), entry);
        return v_cache;
    }/**
     * Add ENTRY onto CACHE's priority queue at the end
     *
     * @param CACHE
     * 		cache-p; the cache onto whose queue to enqueue ENTRY
     * @param ENTRY
     * 		cache-entry; the cache entry to enqueue onto CACHE's queue
     * @return cache; a destructively modified version of CACHE where ENTRY has been
    enqueued onto CACHE's queue
     */


    /**
     * Remove entry from its neighbors
     *
     * @param ENTRY
     * 		cache-entry; the cache entry to remove from CACHE's queue
     */
    @LispMethod(comment = "Remove entry from its neighbors\r\n\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to remove from CACHE\'s queue")
    public static final SubLObject cache_queue_unlink_alt(SubLObject entry) {
        _csetf_cache_entry_newer(cache_entry_older(entry), cache_entry_newer(entry));
        _csetf_cache_entry_older(cache_entry_newer(entry), cache_entry_older(entry));
        return entry;
    }

    @LispMethod(comment = "Remove entry from its neighbors\r\n\r\n@param ENTRY\r\n\t\tcache-entry; the cache entry to remove from CACHE\'s queue")
    public static SubLObject cache_queue_unlink(final SubLObject entry) {
        _csetf_cache_entry_newer(cache_entry_older(entry), cache_entry_newer(entry));
        _csetf_cache_entry_older(cache_entry_newer(entry), cache_entry_older(entry));
        return entry;
    }/**
     * Remove entry from its neighbors
     *
     * @param ENTRY
     * 		cache-entry; the cache entry to remove from CACHE's queue
     */


    public static final SubLObject is_cache_preallocated_p_alt(SubLObject v_cache) {
        {
            SubLObject free_list = cache_free_list(v_cache);
            return makeBoolean((free_list == $RESOURCED) || (NIL != cache_entry_p(free_list)));
        }
    }

    public static SubLObject is_cache_preallocated_p(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        return makeBoolean((free_list == $RESOURCED) || (NIL != cache_entry_p(free_list)));
    }

    /**
     * Fetch an empty entry from the free list or allocate a new one.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we want
     * @return cache-entry-p; either a new or a reused cache entry
     */
    @LispMethod(comment = "Fetch an empty entry from the free list or allocate a new one.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we want\r\n@return cache-entry-p; either a new or a reused cache entry")
    public static final SubLObject get_new_cache_entry_alt(SubLObject v_cache) {
        {
            SubLObject entry = unresource_cache_entry(v_cache);
            if (NIL == entry) {
                entry = make_cache_entry(UNPROVIDED);
            }
            return entry;
        }
    }

    @LispMethod(comment = "Fetch an empty entry from the free list or allocate a new one.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we want\r\n@return cache-entry-p; either a new or a reused cache entry")
    public static SubLObject get_new_cache_entry(final SubLObject v_cache) {
        SubLObject entry = unresource_cache_entry(v_cache);
        if (NIL == entry) {
            entry = make_cache_entry(UNPROVIDED);
        }
        return entry;
    }/**
     * Fetch an empty entry from the free list or allocate a new one.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we want
     * @return cache-entry-p; either a new or a reused cache entry
     */


    /**
     * Returns the resourced list of cache entries.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we want
     * @return cache-entry-p; NIL or the cache entries will be chained through the newer link
     */
    @LispMethod(comment = "Returns the resourced list of cache entries.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we want\r\n@return cache-entry-p; NIL or the cache entries will be chained through the newer link")
    public static final SubLObject cache_free_list_alt(SubLObject v_cache) {
        return cache_entry_key(cache_head_entry(v_cache));
    }

    @LispMethod(comment = "Returns the resourced list of cache entries.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we want\r\n@return cache-entry-p; NIL or the cache entries will be chained through the newer link")
    public static SubLObject cache_free_list(final SubLObject v_cache) {
        return cache_entry_key(cache_head_entry(v_cache));
    }/**
     * Returns the resourced list of cache entries.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we want
     * @return cache-entry-p; NIL or the cache entries will be chained through the newer link
     */


    /**
     * Set the head of the cache free list, containing the resourced cached entries
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we modify
     * @param ENTRY
     * 		cache-entry-p or NIL; the new head of the free list
     * @return CACHE cache-p; the cache we modified
     */
    @LispMethod(comment = "Set the head of the cache free list, containing the resourced cached entries\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we modify\r\n@param ENTRY\r\n\t\tcache-entry-p or NIL; the new head of the free list\r\n@return CACHE cache-p; the cache we modified")
    public static final SubLObject set_cache_free_list_alt(SubLObject v_cache, SubLObject head) {
        _csetf_cache_entry_key(cache_head_entry(v_cache), head);
        return v_cache;
    }

    @LispMethod(comment = "Set the head of the cache free list, containing the resourced cached entries\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list we modify\r\n@param ENTRY\r\n\t\tcache-entry-p or NIL; the new head of the free list\r\n@return CACHE cache-p; the cache we modified")
    public static SubLObject set_cache_free_list(final SubLObject v_cache, final SubLObject head) {
        _csetf_cache_entry_key(cache_head_entry(v_cache), head);
        return v_cache;
    }/**
     * Set the head of the cache free list, containing the resourced cached entries
     *
     * @param CACHE
     * 		cache-p; the cache whose free list we modify
     * @param ENTRY
     * 		cache-entry-p or NIL; the new head of the free list
     * @return CACHE cache-p; the cache we modified
     */


    /**
     * Decide whether to put this entry onto the free list of cache
     *
     * @param CACHE
     * 		cache-p; the cache whose free list might get ENTRY
     * @param ENTRY
     * 		cache-entry-p; the entry that will be chained up
     * @return CACHE cache-p
     */
    @LispMethod(comment = "Decide whether to put this entry onto the free list of cache\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list might get ENTRY\r\n@param ENTRY\r\n\t\tcache-entry-p; the entry that will be chained up\r\n@return CACHE cache-p")
    public static final SubLObject possibly_resource_cache_entry_alt(SubLObject v_cache, SubLObject entry) {
        if (NIL != is_cache_preallocated_p(v_cache)) {
            resource_cache_entry(v_cache, entry);
        }
        return v_cache;
    }

    @LispMethod(comment = "Decide whether to put this entry onto the free list of cache\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list might get ENTRY\r\n@param ENTRY\r\n\t\tcache-entry-p; the entry that will be chained up\r\n@return CACHE cache-p")
    public static SubLObject possibly_resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        if (NIL != is_cache_preallocated_p(v_cache)) {
            resource_cache_entry(v_cache, entry);
        }
        return v_cache;
    }/**
     * Decide whether to put this entry onto the free list of cache
     *
     * @param CACHE
     * 		cache-p; the cache whose free list might get ENTRY
     * @param ENTRY
     * 		cache-entry-p; the entry that will be chained up
     * @return CACHE cache-p
     */


    /**
     * Put the entry onto the free list of the cache.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list will get entry
     * @param ENTRY
     * 		cache-entry-p; the entry that will be chained up
     * @return CACHE cache-p
     */
    @LispMethod(comment = "Put the entry onto the free list of the cache.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list will get entry\r\n@param ENTRY\r\n\t\tcache-entry-p; the entry that will be chained up\r\n@return CACHE cache-p")
    public static final SubLObject resource_cache_entry_alt(SubLObject v_cache, SubLObject entry) {
        scrub_cache_entry(entry);
        _csetf_cache_entry_newer(entry, cache_free_list(v_cache));
        return set_cache_free_list(v_cache, entry);
    }

    @LispMethod(comment = "Put the entry onto the free list of the cache.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list will get entry\r\n@param ENTRY\r\n\t\tcache-entry-p; the entry that will be chained up\r\n@return CACHE cache-p")
    public static SubLObject resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        scrub_cache_entry(entry);
        _csetf_cache_entry_newer(entry, cache_free_list(v_cache));
        return set_cache_free_list(v_cache, entry);
    }/**
     * Put the entry onto the free list of the cache.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list will get entry
     * @param ENTRY
     * 		cache-entry-p; the entry that will be chained up
     * @return CACHE cache-p
     */


    /**
     * Get an ENTRY from the free list of CACHE if you can; return NIL otherwise.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list will get entry
     * @return NIL or cache-entry-p; the old entry to (re)use, if available
     */
    @LispMethod(comment = "Get an ENTRY from the free list of CACHE if you can; return NIL otherwise.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list will get entry\r\n@return NIL or cache-entry-p; the old entry to (re)use, if available")
    public static final SubLObject unresource_cache_entry_alt(SubLObject v_cache) {
        {
            SubLObject free_list = cache_free_list(v_cache);
            SubLObject entry = NIL;
            if (NIL != cache_entry_p(free_list)) {
                entry = free_list;
                set_cache_free_list(v_cache, cache_entry_newer(entry));
                _csetf_cache_entry_newer(entry, NIL);
            }
            return entry;
        }
    }

    @LispMethod(comment = "Get an ENTRY from the free list of CACHE if you can; return NIL otherwise.\r\n\r\n@param CACHE\r\n\t\tcache-p; the cache whose free list will get entry\r\n@return NIL or cache-entry-p; the old entry to (re)use, if available")
    public static SubLObject unresource_cache_entry(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        SubLObject entry = NIL;
        if (NIL != cache_entry_p(free_list)) {
            entry = free_list;
            set_cache_free_list(v_cache, cache_entry_newer(entry));
            _csetf_cache_entry_newer(entry, NIL);
        }
        return entry;
    }/**
     * Get an ENTRY from the free list of CACHE if you can; return NIL otherwise.
     *
     * @param CACHE
     * 		cache-p; the cache whose free list will get entry
     * @return NIL or cache-entry-p; the old entry to (re)use, if available
     */


    /**
     * Prints ENTRY to STREAM
     *
     * @param ENTRY
     * 		cache-entry; the entry to be printed to STREAM
     * @param STREAM
     * 		stream-p; the stream to which to print ENTRY
     */
    @LispMethod(comment = "Prints ENTRY to STREAM\r\n\r\n@param ENTRY\r\n\t\tcache-entry; the entry to be printed to STREAM\r\n@param STREAM\r\n\t\tstream-p; the stream to which to print ENTRY")
    public static final SubLObject cache_entry_print_alt(SubLObject entry, SubLObject stream, SubLObject depth) {
        princ(cache_entry_key(entry), stream);
        write_string($str_alt78$____, stream, UNPROVIDED, UNPROVIDED);
        princ(cache_entry_value(entry), stream);
        return entry;
    }

    @LispMethod(comment = "Prints ENTRY to STREAM\r\n\r\n@param ENTRY\r\n\t\tcache-entry; the entry to be printed to STREAM\r\n@param STREAM\r\n\t\tstream-p; the stream to which to print ENTRY")
    public static SubLObject cache_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        princ(cache_entry_key(entry), stream);
        if (NIL != $print_cache_valuesP$.getDynamicValue(thread)) {
            write_string($str87$____, stream, UNPROVIDED, UNPROVIDED);
            princ(cache_entry_value(entry), stream);
        }
        return entry;
    }/**
     * Prints ENTRY to STREAM
     *
     * @param ENTRY
     * 		cache-entry; the entry to be printed to STREAM
     * @param STREAM
     * 		stream-p; the stream to which to print ENTRY
     */


    /**
     * Clean up all slots to prevent any loitering.
     */
    @LispMethod(comment = "Clean up all slots to prevent any loitering.")
    public static final SubLObject scrub_cache_entry_alt(SubLObject entry) {
        _csetf_cache_entry_value(entry, NIL);
        _csetf_cache_entry_key(entry, NIL);
        _csetf_cache_entry_newer(entry, NIL);
        _csetf_cache_entry_older(entry, NIL);
        return entry;
    }

    @LispMethod(comment = "Clean up all slots to prevent any loitering.")
    public static SubLObject scrub_cache_entry(final SubLObject entry) {
        _csetf_cache_entry_value(entry, NIL);
        _csetf_cache_entry_key(entry, NIL);
        _csetf_cache_entry_newer(entry, NIL);
        _csetf_cache_entry_older(entry, NIL);
        return entry;
    }/**
     * Clean up all slots to prevent any loitering.
     */


    /**
     * Tests the correctness of the cache implementation
     *
     * @return boolean; t if this cache implementation works correctly, nil otherwise
     */
    @LispMethod(comment = "Tests the correctness of the cache implementation\r\n\r\n@return boolean; t if this cache implementation works correctly, nil otherwise")
    public static final SubLObject test_cache_alt(SubLObject cardinality) {
        if (cardinality == UNPROVIDED) {
            cardinality = $int$100;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cardinality, POSITIVE_INTEGER_P);
            {
                SubLObject capacity = divide(cardinality, TEN_INTEGER);
                SubLObject j = ZERO_INTEGER;
                SubLObject passP = T;
                SubLObject order = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(capacity);
                    SubLObject hash = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    order = make_vector(hash_table_count(hash), UNPROVIDED);
                    {
                        SubLObject key = NIL;
                        SubLObject time = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(hash);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    key = getEntryKey(cdohash_entry);
                                    time = getEntryValue(cdohash_entry);
                                    set_aref(order, j, cons(key, time));
                                    j = add(j, ONE_INTEGER);
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                    Sort.sort(order, symbol_function($sym80$_), symbol_function(CDR));
                    {
                        SubLObject hits = min(capacity, hash_table_count(hash));
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(hits); i = add(i, ONE_INTEGER)) {
                                key = aref(order, i).first();
                                value = cache_get(v_cache, key);
                                passP = makeBoolean((NIL != passP) && value.eql(add(key, $float$0_5)));
                            }
                        }
                        {
                            SubLObject cdotimes_end_var = subtract(hash_table_count(hash), hits);
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                passP = makeBoolean((NIL != passP) && (NIL == cache_get(v_cache, aref(order, add(i, capacity)).first())));
                            }
                        }
                    }
                }
                return passP;
            }
        }
    }

    @LispMethod(comment = "Tests the correctness of the cache implementation\r\n\r\n@return boolean; t if this cache implementation works correctly, nil otherwise")
    public static SubLObject test_cache(SubLObject cardinality) {
        if (cardinality == UNPROVIDED) {
            cardinality = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(cardinality) : "! subl_promotions.positive_integer_p(cardinality) " + ("subl_promotions.positive_integer_p(cardinality) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(cardinality) ") + cardinality;
        final SubLObject capacity = divide(cardinality, TEN_INTEGER);
        SubLObject j = ZERO_INTEGER;
        SubLObject passP = T;
        SubLObject order = NIL;
        thread.resetMultipleValues();
        final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(capacity);
        final SubLObject hash = thread.secondMultipleValue();
        thread.resetMultipleValues();
        order = make_vector(hash_table_count(hash), UNPROVIDED);
        SubLObject key = NIL;
        SubLObject time = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                time = getEntryValue(cdohash_entry);
                set_aref(order, j, cons(key, time));
                j = add(j, ONE_INTEGER);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        Sort.sort(order, symbol_function($sym89$_), symbol_function(CDR));
        final SubLObject hits = min(capacity, hash_table_count(hash));
        SubLObject key2 = NIL;
        SubLObject value = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(hits); i = add(i, ONE_INTEGER)) {
            key2 = aref(order, i).first();
            value = cache_get(v_cache, key2);
            passP = makeBoolean((NIL != passP) && value.eql(add(key2, $float$0_5)));
        }
        SubLObject cdotimes_end_var;
        SubLObject k;
        for (cdotimes_end_var = subtract(hash_table_count(hash), hits), k = NIL, k = ZERO_INTEGER; k.numL(cdotimes_end_var); k = add(k, ONE_INTEGER)) {
            passP = makeBoolean((NIL != passP) && (NIL == cache_get(v_cache, aref(order, add(k, capacity)).first())));
        }
        return passP;
    }/**
     * Tests the correctness of the cache implementation
     *
     * @return boolean; t if this cache implementation works correctly, nil otherwise
     */


    /**
     * Generate a random sequence of events, record these in the cache, and return a control
     * map that preserves the time when key was last inserted.
     *
     * @return 0 CACHE-P
     * @return 1 MAP-P
     */
    @LispMethod(comment = "Generate a random sequence of events, record these in the cache, and return a control\r\nmap that preserves the time when key was last inserted.\r\n\r\n@return 0 CACHE-P\r\n@return 1 MAP-P\nGenerate a random sequence of events, record these in the cache, and return a control\nmap that preserves the time when key was last inserted.")
    public static final SubLObject test_get_randomly_populated_cache_and_control_map_alt(SubLObject capacity) {
        {
            SubLObject v_cache = new_cache(capacity, UNPROVIDED);
            SubLObject estimated_cardinality = multiply(TEN_INTEGER, capacity);
            SubLObject map = make_hash_table(estimated_cardinality, UNPROVIDED, UNPROVIDED);
            SubLObject time = NIL;
            for (time = ZERO_INTEGER; time.numL(estimated_cardinality); time = add(time, ONE_INTEGER)) {
                {
                    SubLObject key = random.random(estimated_cardinality);
                    cache_set(v_cache, key, add(key, $float$0_5));
                    map_utilities.map_put(map, key, time);
                }
            }
            return values(v_cache, map);
        }
    }

    @LispMethod(comment = "Generate a random sequence of events, record these in the cache, and return a control\r\nmap that preserves the time when key was last inserted.\r\n\r\n@return 0 CACHE-P\r\n@return 1 MAP-P\nGenerate a random sequence of events, record these in the cache, and return a control\nmap that preserves the time when key was last inserted.")
    public static SubLObject test_get_randomly_populated_cache_and_control_map(final SubLObject capacity) {
        final SubLObject v_cache = new_cache(capacity, UNPROVIDED);
        final SubLObject estimated_cardinality = multiply(TEN_INTEGER, capacity);
        final SubLObject map = make_hash_table(estimated_cardinality, UNPROVIDED, UNPROVIDED);
        SubLObject time;
        SubLObject key;
        for (time = NIL, time = ZERO_INTEGER; time.numL(estimated_cardinality); time = add(time, ONE_INTEGER)) {
            key = random.random(estimated_cardinality);
            cache_set(v_cache, key, add(key, $float$0_5));
            map_utilities.map_put(map, key, time);
        }
        return subl_promotions.values2(v_cache, map);
    }/**
     * Generate a random sequence of events, record these in the cache, and return a control
     * map that preserves the time when key was last inserted.
     *
     * @return 0 CACHE-P
     * @return 1 MAP-P
     */


    /**
     * Tests the correctness of the cache iterators, both the entry and the content
     * iterator.
     *
     * @unknown T if the test succeeds, false otherwise
     */
    @LispMethod(comment = "Tests the correctness of the cache iterators, both the entry and the content\r\niterator.\r\n\r\n@unknown T if the test succeeds, false otherwise\nTests the correctness of the cache iterators, both the entry and the content\niterator.")
    public static final SubLObject test_cache_iterators_alt(SubLObject cardinality) {
        if (cardinality == UNPROVIDED) {
            cardinality = $int$100;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(integerDivide(cardinality, TEN_INTEGER));
                SubLObject map = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject entry_iterator = new_cache_iterator(v_cache);
                    SubLObject content_iterator = new_cache_content_iterator(v_cache);
                    SubLObject item_number = ZERO_INTEGER;
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject entry = iteration.iteration_next(entry_iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                item_number = add(item_number, ONE_INTEGER);
                                if (NIL != iteration.iteration_done(content_iterator)) {
                                    Errors.warn($str_alt83$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                                    return NIL;
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject key_value_pair = iteration.iteration_next(content_iterator);
                                    SubLObject valid_p = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == valid_p) {
                                        Errors.warn($str_alt83$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                                        return NIL;
                                    }
                                    {
                                        SubLObject entry_key = cache_entry_key(entry);
                                        SubLObject entry_value = cache_entry_value(entry);
                                        SubLObject content_key = key_value_pair.first();
                                        SubLObject content_value = key_value_pair.rest();
                                        if (entry_key != content_key) {
                                            Errors.warn($str_alt84$The_content_iterator_at_item__A_s, item_number, content_key, entry_key);
                                            return NIL;
                                        }
                                        if (entry_value != content_value) {
                                            Errors.warn($str_alt85$The_content_iterator_at_item__A_s, item_number, content_value, entry_value);
                                            return NIL;
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                    if (NIL == iteration.iteration_done(content_iterator)) {
                        Errors.warn($str_alt86$The_content_iterator__A_is_not_ex, item_number, content_iterator, entry_iterator);
                        return NIL;
                    }
                    if (!item_number.numE(cache_size(v_cache))) {
                        Errors.warn($str_alt87$The_two_iterators_do_not_seem_to_, item_number, cache_size(v_cache));
                        return NIL;
                    }
                    return T;
                }
            }
        }
    }

    @LispMethod(comment = "Tests the correctness of the cache iterators, both the entry and the content\r\niterator.\r\n\r\n@unknown T if the test succeeds, false otherwise\nTests the correctness of the cache iterators, both the entry and the content\niterator.")
    public static SubLObject test_cache_iterators(SubLObject cardinality) {
        if (cardinality == UNPROVIDED) {
            cardinality = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(integerDivide(cardinality, TEN_INTEGER));
        final SubLObject map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject entry_iterator = new_cache_iterator(v_cache);
        final SubLObject content_iterator = new_cache_content_iterator(v_cache);
        SubLObject item_number = ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(entry_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                item_number = add(item_number, ONE_INTEGER);
                if (NIL != iteration.iteration_done(content_iterator)) {
                    Errors.warn($str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                    return NIL;
                }
                thread.resetMultipleValues();
                final SubLObject key_value_pair = iteration.iteration_next(content_iterator);
                final SubLObject valid_p = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == valid_p) {
                    Errors.warn($str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                    return NIL;
                }
                final SubLObject entry_key = cache_entry_key(entry);
                final SubLObject entry_value = cache_entry_value(entry);
                final SubLObject content_key = key_value_pair.first();
                final SubLObject content_value = key_value_pair.rest();
                if (!entry_key.eql(content_key)) {
                    Errors.warn($str93$The_content_iterator_at_item__A_s, item_number, content_key, entry_key);
                    return NIL;
                }
                if (!entry_value.eql(content_value)) {
                    Errors.warn($str94$The_content_iterator_at_item__A_s, item_number, content_value, entry_value);
                    return NIL;
                }
            }
        }
        if (NIL == iteration.iteration_done(content_iterator)) {
            Errors.warn($str95$The_content_iterator__A_is_not_ex, item_number, content_iterator, entry_iterator);
            return NIL;
        }
        if (!item_number.numE(cache_size(v_cache))) {
            Errors.warn($str96$The_two_iterators_do_not_seem_to_, item_number, cache_size(v_cache));
            return NIL;
        }
        return T;
    }/**
     * Tests the correctness of the cache iterators, both the entry and the content
     * iterator.
     *
     * @unknown T if the test succeeds, false otherwise
     */


    public static SubLObject declare_cache_file() {
        declareFunction("cache_print_function_trampoline", "CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cache_p", "CACHE-P", 1, 0, false);
        new cache.$cache_p$UnaryFunction();
        declareFunction("cache_capacity", "CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_map", "CACHE-MAP", 1, 0, false);
        declareFunction("cache_head_entry", "CACHE-HEAD-ENTRY", 1, 0, false);
        declareFunction("_csetf_cache_capacity", "_CSETF-CACHE-CAPACITY", 2, 0, false);
        declareFunction("_csetf_cache_map", "_CSETF-CACHE-MAP", 2, 0, false);
        declareFunction("_csetf_cache_head_entry", "_CSETF-CACHE-HEAD-ENTRY", 2, 0, false);
        declareFunction("make_cache", "MAKE-CACHE", 0, 1, false);
        declareFunction("visit_defstruct_cache", "VISIT-DEFSTRUCT-CACHE", 2, 0, false);
        declareFunction("visit_defstruct_object_cache_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_entry_print_function_trampoline", "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cache_entry_p", "CACHE-ENTRY-P", 1, 0, false);
        new cache.$cache_entry_p$UnaryFunction();
        declareFunction("cache_entry_newer", "CACHE-ENTRY-NEWER", 1, 0, false);
        declareFunction("cache_entry_key", "CACHE-ENTRY-KEY", 1, 0, false);
        declareFunction("cache_entry_value", "CACHE-ENTRY-VALUE", 1, 0, false);
        declareFunction("cache_entry_older", "CACHE-ENTRY-OLDER", 1, 0, false);
        declareFunction("_csetf_cache_entry_newer", "_CSETF-CACHE-ENTRY-NEWER", 2, 0, false);
        declareFunction("_csetf_cache_entry_key", "_CSETF-CACHE-ENTRY-KEY", 2, 0, false);
        declareFunction("_csetf_cache_entry_value", "_CSETF-CACHE-ENTRY-VALUE", 2, 0, false);
        declareFunction("_csetf_cache_entry_older", "_CSETF-CACHE-ENTRY-OLDER", 2, 0, false);
        declareFunction("make_cache_entry", "MAKE-CACHE-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_cache_entry", "VISIT-DEFSTRUCT-CACHE-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD", 2, 0, false);
        declareFunction("cache_print", "CACHE-PRINT", 3, 0, false);
        declareFunction("new_cache", "NEW-CACHE", 1, 1, false);
        declareFunction("new_preallocated_cache", "NEW-PREALLOCATED-CACHE", 1, 1, false);
        declareFunction("cache_full_p", "CACHE-FULL-P", 1, 0, false);
        declareFunction("cache_empty_p", "CACHE-EMPTY-P", 1, 0, false);
        declareFunction("cache_get", "CACHE-GET", 2, 0, false);
        declareFunction("cache_get_without_values", "CACHE-GET-WITHOUT-VALUES", 2, 1, false);
        declareFunction("cache_get_int", "CACHE-GET-INT", 4, 0, false);
        declareFunction("cache_contains_key_p", "CACHE-CONTAINS-KEY-P", 2, 0, false);
        declareFunction("cache_set", "CACHE-SET", 3, 0, false);
        declareFunction("cache_set_without_values", "CACHE-SET-WITHOUT-VALUES", 3, 0, false);
        declareFunction("cache_set_return_dropped", "CACHE-SET-RETURN-DROPPED", 3, 0, false);
        declareFunction("cache_set_int", "CACHE-SET-INT", 4, 0, false);
        declareFunction("cache_remove", "CACHE-REMOVE", 2, 0, false);
        declareFunction("cache_clear", "CACHE-CLEAR", 1, 0, false);
        declareFunction("cache_test", "CACHE-TEST", 1, 0, false);
        declareFunction("cache_size", "CACHE-SIZE", 1, 0, false);
        declareMacro("do_cache", "DO-CACHE");
        declareFunction("cache_copy", "CACHE-COPY", 1, 0, false);
        declareFunction("do_cache_first", "DO-CACHE-FIRST", 2, 0, false);
        declareFunction("do_cache_doneP", "DO-CACHE-DONE?", 2, 0, false);
        declareFunction("do_cache_key", "DO-CACHE-KEY", 1, 0, false);
        declareFunction("do_cache_value", "DO-CACHE-VALUE", 1, 0, false);
        declareFunction("do_cache_next", "DO-CACHE-NEXT", 2, 0, false);
        declareFunction("cache_keys", "CACHE-KEYS", 1, 0, false);
        declareFunction("cache_values", "CACHE-VALUES", 1, 0, false);
        declareFunction("map_cache", "MAP-CACHE", 2, 0, false);
        declareFunction("new_cache_iterator", "NEW-CACHE-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_cache_state", "MAKE-ITERATOR-CACHE-STATE", 1, 0, false);
        declareFunction("cache_iterator_done", "CACHE-ITERATOR-DONE", 1, 0, false);
        declareFunction("cache_iterator_next", "CACHE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("new_cache_content_iterator", "NEW-CACHE-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("make_cache_content_iterator_state", "MAKE-CACHE-CONTENT-ITERATOR-STATE", 1, 0, false);
        declareFunction("cache_content_iterator_done", "CACHE-CONTENT-ITERATOR-DONE", 1, 0, false);
        declareFunction("cache_content_iterator_next", "CACHE-CONTENT-ITERATOR-NEXT", 1, 0, false);
        declareFunction("cfasl_output_object_cache_method", "CFASL-OUTPUT-OBJECT-CACHE-METHOD", 2, 0, false);
        declareFunction("cfasl_output_cache", "CFASL-OUTPUT-CACHE", 2, 0, false);
        declareFunction("cfasl_input_cache", "CFASL-INPUT-CACHE", 1, 0, false);
        declareFunction("cache_newest", "CACHE-NEWEST", 1, 0, false);
        declareFunction("cache_oldest", "CACHE-OLDEST", 1, 0, false);
        declareFunction("cache_queue_remove", "CACHE-QUEUE-REMOVE", 2, 0, false);
        declareFunction("cache_queue_requeue", "CACHE-QUEUE-REQUEUE", 2, 0, false);
        declareFunction("cache_queue_enqueue", "CACHE-QUEUE-ENQUEUE", 2, 0, false);
        declareFunction("cache_queue_append", "CACHE-QUEUE-APPEND", 2, 0, false);
        declareFunction("cache_queue_unlink", "CACHE-QUEUE-UNLINK", 1, 0, false);
        declareFunction("is_cache_preallocated_p", "IS-CACHE-PREALLOCATED-P", 1, 0, false);
        declareFunction("get_new_cache_entry", "GET-NEW-CACHE-ENTRY", 1, 0, false);
        declareFunction("cache_free_list", "CACHE-FREE-LIST", 1, 0, false);
        declareFunction("set_cache_free_list", "SET-CACHE-FREE-LIST", 2, 0, false);
        declareFunction("possibly_resource_cache_entry", "POSSIBLY-RESOURCE-CACHE-ENTRY", 2, 0, false);
        declareFunction("resource_cache_entry", "RESOURCE-CACHE-ENTRY", 2, 0, false);
        declareFunction("unresource_cache_entry", "UNRESOURCE-CACHE-ENTRY", 1, 0, false);
        declareFunction("cache_entry_print", "CACHE-ENTRY-PRINT", 3, 0, false);
        declareFunction("scrub_cache_entry", "SCRUB-CACHE-ENTRY", 1, 0, false);
        declareFunction("test_cache", "TEST-CACHE", 0, 1, false);
        declareFunction("test_get_randomly_populated_cache_and_control_map", "TEST-GET-RANDOMLY-POPULATED-CACHE-AND-CONTROL-MAP", 1, 0, false);
        declareFunction("test_cache_iterators", "TEST-CACHE-ITERATORS", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_cache_file() {
        defconstant("*DTP-CACHE*", CACHE);
        defconstant("*DTP-CACHE-ENTRY*", CACHE_ENTRY);
        defparameter("*PRINT-CACHE-ELEMENTS?*", NIL);
        defparameter("*CACHE-ENTRIES-PREALLOCATE?*", NIL);
        defconstant("*CFASL-OPCODE-CACHE*", $int$63);
        defparameter("*PRINT-CACHE-VALUES?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cache_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CACHE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CACHE_CAPACITY, _CSETF_CACHE_CAPACITY);
        def_csetf(CACHE_MAP, _CSETF_CACHE_MAP);
        def_csetf(CACHE_HEAD_ENTRY, _CSETF_CACHE_HEAD_ENTRY);
        identity(CACHE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), symbol_function(CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CACHE_ENTRY_NEWER, _CSETF_CACHE_ENTRY_NEWER);
        def_csetf(CACHE_ENTRY_KEY, _CSETF_CACHE_ENTRY_KEY);
        def_csetf(CACHE_ENTRY_VALUE, _CSETF_CACHE_ENTRY_VALUE);
        def_csetf(CACHE_ENTRY_OLDER, _CSETF_CACHE_ENTRY_OLDER);
        identity(CACHE_ENTRY);
        register_macro_helper(DO_CACHE_FIRST, DO_CACHE);
        register_macro_helper($sym61$DO_CACHE_DONE_, DO_CACHE);
        register_macro_helper(DO_CACHE_KEY, DO_CACHE);
        register_macro_helper(DO_CACHE_VALUE, DO_CACHE);
        register_macro_helper(DO_CACHE_NEXT, DO_CACHE);
        register_cfasl_input_function($cfasl_opcode_cache$.getGlobalValue(), CFASL_INPUT_CACHE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CACHE_METHOD));
        return NIL;
    }

    public static SubLObject setup_cache_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CACHE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(CACHE_CAPACITY, _CSETF_CACHE_CAPACITY);
            def_csetf(CACHE_MAP, _CSETF_CACHE_MAP);
            def_csetf(CACHE_HEAD_ENTRY, _CSETF_CACHE_HEAD_ENTRY);
            identity(CACHE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), symbol_function(CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list32);
            def_csetf(CACHE_ENTRY_NEWER, _CSETF_CACHE_ENTRY_NEWER);
            def_csetf(CACHE_ENTRY_KEY, _CSETF_CACHE_ENTRY_KEY);
            def_csetf(CACHE_ENTRY_VALUE, _CSETF_CACHE_ENTRY_VALUE);
            def_csetf(CACHE_ENTRY_OLDER, _CSETF_CACHE_ENTRY_OLDER);
            identity(CACHE_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD));
            register_macro_helper(DO_CACHE_FIRST, DO_CACHE);
            register_macro_helper($sym70$DO_CACHE_DONE_, DO_CACHE);
            register_macro_helper(DO_CACHE_KEY, DO_CACHE);
            register_macro_helper(DO_CACHE_VALUE, DO_CACHE);
            register_macro_helper(DO_CACHE_NEXT, DO_CACHE);
            register_cfasl_input_function($cfasl_opcode_cache$.getGlobalValue(), CFASL_INPUT_CACHE);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CACHE_METHOD));
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper($sym61$DO_CACHE_DONE_, DO_CACHE);
        }
        return NIL;
    }

    public static SubLObject setup_cache_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(CACHE_CAPACITY, _CSETF_CACHE_CAPACITY);
        def_csetf(CACHE_MAP, _CSETF_CACHE_MAP);
        def_csetf(CACHE_HEAD_ENTRY, _CSETF_CACHE_HEAD_ENTRY);
        identity(CACHE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), symbol_function(CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list32);
        def_csetf(CACHE_ENTRY_NEWER, _CSETF_CACHE_ENTRY_NEWER);
        def_csetf(CACHE_ENTRY_KEY, _CSETF_CACHE_ENTRY_KEY);
        def_csetf(CACHE_ENTRY_VALUE, _CSETF_CACHE_ENTRY_VALUE);
        def_csetf(CACHE_ENTRY_OLDER, _CSETF_CACHE_ENTRY_OLDER);
        identity(CACHE_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD));
        register_macro_helper(DO_CACHE_FIRST, DO_CACHE);
        register_macro_helper($sym70$DO_CACHE_DONE_, DO_CACHE);
        register_macro_helper(DO_CACHE_KEY, DO_CACHE);
        register_macro_helper(DO_CACHE_VALUE, DO_CACHE);
        register_macro_helper(DO_CACHE_NEXT, DO_CACHE);
        register_cfasl_input_function($cfasl_opcode_cache$.getGlobalValue(), CFASL_INPUT_CACHE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CACHE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cache_file();
    }

    static {
    }

    public static final class $cache_native extends SubLStructNative {
        public SubLObject $capacity;

        public SubLObject $map;

        public SubLObject $head_entry;

        private static final SubLStructDeclNative structDecl;

        public $cache_native() {
            cache.$cache_native.this.$capacity = Lisp.NIL;
            cache.$cache_native.this.$map = Lisp.NIL;
            cache.$cache_native.this.$head_entry = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cache.$cache_native.this.$capacity;
        }

        @Override
        public SubLObject getField3() {
            return cache.$cache_native.this.$map;
        }

        @Override
        public SubLObject getField4() {
            return cache.$cache_native.this.$head_entry;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cache.$cache_native.this.$capacity = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cache.$cache_native.this.$map = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return cache.$cache_native.this.$head_entry = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cache.$cache_native.class, CACHE, CACHE_P, $list2, $list3, new String[]{ "$capacity", "$map", "$head_entry" }, $list4, $list5, CACHE_PRINT);
        }
    }

    public static final class $cache_p$UnaryFunction extends UnaryFunction {
        public $cache_p$UnaryFunction() {
            super(extractFunctionNamed("CACHE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cache_p(arg1);
        }
    }

    public static final class $cache_entry_native extends SubLStructNative {
        public SubLObject $newer;

        public SubLObject $key;

        public SubLObject $value;

        public SubLObject $older;

        private static final SubLStructDeclNative structDecl;

        public $cache_entry_native() {
            cache.$cache_entry_native.this.$newer = Lisp.NIL;
            cache.$cache_entry_native.this.$key = Lisp.NIL;
            cache.$cache_entry_native.this.$value = Lisp.NIL;
            cache.$cache_entry_native.this.$older = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cache.$cache_entry_native.this.$newer;
        }

        @Override
        public SubLObject getField3() {
            return cache.$cache_entry_native.this.$key;
        }

        @Override
        public SubLObject getField4() {
            return cache.$cache_entry_native.this.$value;
        }

        @Override
        public SubLObject getField5() {
            return cache.$cache_entry_native.this.$older;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cache.$cache_entry_native.this.$newer = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cache.$cache_entry_native.this.$key = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return cache.$cache_entry_native.this.$value = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return cache.$cache_entry_native.this.$older = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cache.$cache_entry_native.class, CACHE_ENTRY, CACHE_ENTRY_P, $list26, $list27, new String[]{ "$newer", "$key", "$value", "$older" }, $list28, $list29, CACHE_ENTRY_PRINT);
        }
    }

    public static final class $cache_entry_p$UnaryFunction extends UnaryFunction {
        public $cache_entry_p$UnaryFunction() {
            super(extractFunctionNamed("CACHE-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cache_entry_p(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("CAPACITY"), makeSymbol("MAP"), makeSymbol("HEAD-ENTRY"));

    static private final SubLList $list_alt3 = list(makeKeyword("CAPACITY"), makeKeyword("MAP"), makeKeyword("HEAD-ENTRY"));

    static private final SubLList $list_alt4 = list(makeSymbol("CACHE-CAPACITY"), makeSymbol("CACHE-MAP"), makeSymbol("CACHE-HEAD-ENTRY"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-CACHE-CAPACITY"), makeSymbol("_CSETF-CACHE-MAP"), makeSymbol("_CSETF-CACHE-HEAD-ENTRY"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt20 = list(makeSymbol("NEWER"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("OLDER"));

    static private final SubLList $list_alt21 = list(makeKeyword("NEWER"), makeKeyword("KEY"), makeKeyword("VALUE"), makeKeyword("OLDER"));

    static private final SubLList $list_alt22 = list(makeSymbol("CACHE-ENTRY-NEWER"), makeSymbol("CACHE-ENTRY-KEY"), makeSymbol("CACHE-ENTRY-VALUE"), makeSymbol("CACHE-ENTRY-OLDER"));

    static private final SubLList $list_alt23 = list(makeSymbol("_CSETF-CACHE-ENTRY-NEWER"), makeSymbol("_CSETF-CACHE-ENTRY-KEY"), makeSymbol("_CSETF-CACHE-ENTRY-VALUE"), makeSymbol("_CSETF-CACHE-ENTRY-OLDER"));

    static private final SubLString $str_alt38$__CACHE_ = makeString("#<CACHE/");

    static private final SubLString $str_alt39$_ = makeString("/");

    static private final SubLString $str_alt40$_ = makeString("(");

    static private final SubLString $str_alt41$__ = makeString(", ");

    static private final SubLString $str_alt42$___ = makeString("...");

    static private final SubLString $str_alt43$_ = makeString(")");

    static private final SubLString $str_alt44$_ = makeString(">");

    static private final SubLList $list_alt49 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("CACHE"), makeSymbol("&KEY"), list(makeSymbol("ORDER"), makeKeyword("NEWEST"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt50 = list(makeKeyword("ORDER"));

    static private final SubLSymbol $sym54$CACHE_VAR = makeUninternedSymbol("CACHE-VAR");

    static private final SubLSymbol $sym55$ORDER_VAR = makeUninternedSymbol("ORDER-VAR");

    static private final SubLSymbol $sym56$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLSymbol $sym61$DO_CACHE_DONE_ = makeSymbol("DO-CACHE-DONE?");

    static private final SubLString $str_alt68$_S_was_not_either__NEWEST_or__OLD = makeString("~S was not either :NEWEST or :OLDEST");

    static private final SubLList $list_alt72 = list(makeSymbol("CURRENT"), makeSymbol("HEAD-ENTRY"));

    static private final SubLString $str_alt78$____ = makeString(" -> ");

    static private final SubLSymbol $sym80$_ = makeSymbol(">");

    static private final SubLString $str_alt83$Content_iterator__A_was_exhausted = makeString("Content iterator ~A was exhausted at item ~A before the entry iterator ~A!");

    static private final SubLString $str_alt84$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests key ~A, but the entry iterator says ~A.");

    static private final SubLString $str_alt85$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A.");

    static private final SubLString $str_alt86$The_content_iterator__A_is_not_ex = makeString("The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done.");

    static private final SubLString $str_alt87$The_two_iterators_do_not_seem_to_ = makeString("The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A.");
}

/**
 * Total time: 307 ms
 */
