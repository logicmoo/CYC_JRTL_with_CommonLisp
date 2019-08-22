package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class cache extends SubLTranslatedFile {
    public static final SubLFile me = new cache();

    public static final String myName = "com.cyc.cycjava.cycl.cache";

    public static final String myFingerPrint = "4360149d4e45bdd12bec7882df8970799b220ca03c6e1872e78ca529f7575799";

    // defconstant
    public static final SubLSymbol $dtp_cache$ = makeSymbol("*DTP-CACHE*");

    // defconstant
    public static final SubLSymbol $dtp_cache_entry$ = makeSymbol("*DTP-CACHE-ENTRY*");

    // defparameter
    // Whether to print the elements of a cache in the print method
    public static final SubLSymbol $print_cache_elementsP$ = makeSymbol("*PRINT-CACHE-ELEMENTS?*");

    // defparameter
    // When T, preallocate all of the cache entries and resource them
    private static final SubLSymbol $cache_entries_preallocateP$ = makeSymbol("*CACHE-ENTRIES-PREALLOCATE?*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_cache$ = makeSymbol("*CFASL-OPCODE-CACHE*");

    // defparameter
    public static final SubLSymbol $print_cache_valuesP$ = makeSymbol("*PRINT-CACHE-VALUES?*");



    public static final SubLSymbol CACHE_P = makeSymbol("CACHE-P");

    public static final SubLList $list2 = list(makeSymbol("CAPACITY"), makeSymbol("MAP"), makeSymbol("HEAD-ENTRY"));

    public static final SubLList $list3 = list(makeKeyword("CAPACITY"), makeKeyword("MAP"), makeKeyword("HEAD-ENTRY"));

    public static final SubLList $list4 = list(makeSymbol("CACHE-CAPACITY"), makeSymbol("CACHE-MAP"), makeSymbol("CACHE-HEAD-ENTRY"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-CACHE-CAPACITY"), makeSymbol("_CSETF-CACHE-MAP"), makeSymbol("_CSETF-CACHE-HEAD-ENTRY"));

    public static final SubLSymbol CACHE_PRINT = makeSymbol("CACHE-PRINT");

    public static final SubLSymbol CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-PRINT-FUNCTION-TRAMPOLINE");

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

    public static SubLObject cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$cache_native.class ? T : NIL;
    }

    public static SubLObject cache_capacity(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cache_map(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cache_head_entry(final SubLObject v_object) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_cache_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cache_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cache_head_entry(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_p(v_object) : "cache.cache_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cache_native();
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

    public static SubLObject cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_entry_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_entry_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$cache_entry_native.class ? T : NIL;
    }

    public static SubLObject cache_entry_newer(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cache_entry_key(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cache_entry_value(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cache_entry_older(final SubLObject v_object) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_cache_entry_newer(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cache_entry_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cache_entry_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cache_entry_older(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_entry_p(v_object) : "cache.cache_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_cache_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cache_entry_native();
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

    public static SubLObject new_cache(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(capacity) : "subl_promotions.positive_integer_p(capacity) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(capacity) " + capacity;
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
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

    public static SubLObject cache_full_p(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return numGE(cache_size(v_cache), cache_capacity(v_cache));
    }

    public static SubLObject cache_empty_p(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return eq(cache_newest(v_cache), cache_head_entry(v_cache));
    }

    public static SubLObject cache_get(final SubLObject v_cache, final SubLObject key) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return cache_get_int(v_cache, key, NIL, T);
    }

    public static SubLObject cache_get_without_values(final SubLObject v_cache, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return cache_get_int(v_cache, key, v_default, NIL);
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

    public static SubLObject cache_contains_key_p(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = gethash(key, cache_map(v_cache), UNPROVIDED);
        final SubLObject found_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return found_p;
    }

    public static SubLObject cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return cache_set_int(v_cache, key, value, T);
    }

    public static SubLObject cache_set_without_values(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return cache_set_int(v_cache, key, value, NIL);
    }

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

    public static SubLObject cache_remove(final SubLObject v_cache, final SubLObject key) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        final SubLObject entry = gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
        SubLObject value = NIL;
        if (NIL != entry) {
            cache_queue_remove(v_cache, entry);
            remhash(key, cache_map(v_cache));
            value = cache_entry_value(entry);
        }
        return subl_promotions.values2(value, list_utilities.sublisp_boolean(entry));
    }

    public static SubLObject cache_clear(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
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

    public static SubLObject cache_test(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return hash_table_test(cache_map(v_cache));
    }

    public static SubLObject cache_size(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return hash_table_count(cache_map(v_cache));
    }

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

    public static SubLObject do_cache_first(final SubLObject v_cache, final SubLObject order) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return do_cache_next(cache_head_entry(v_cache), order);
    }

    public static SubLObject do_cache_doneP(final SubLObject v_cache, final SubLObject entry) {
        return eq(entry, cache_head_entry(v_cache));
    }

    public static SubLObject do_cache_key(final SubLObject entry) {
        return cache_entry_key(entry);
    }

    public static SubLObject do_cache_value(final SubLObject entry) {
        return cache_entry_value(entry);
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

    public static SubLObject cache_keys(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
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

    public static SubLObject cache_values(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
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

    public static SubLObject map_cache(final SubLObject v_cache, final SubLObject function) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
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

    public static SubLObject new_cache_iterator(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return iteration.new_iterator(make_iterator_cache_state(v_cache), CACHE_ITERATOR_DONE, CACHE_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_iterator_cache_state(final SubLObject v_cache) {
        final SubLObject current = cache_entry_older(cache_head_entry(v_cache));
        return list(current, cache_head_entry(v_cache));
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

    public static SubLObject new_cache_content_iterator(final SubLObject v_cache) {
        assert NIL != cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        return iteration.new_iterator(make_cache_content_iterator_state(v_cache), CACHE_CONTENT_ITERATOR_DONE, CACHE_CONTENT_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_cache_content_iterator_state(final SubLObject v_cache) {
        final SubLObject interior_iterator = new_cache_iterator(v_cache);
        return interior_iterator;
    }

    public static SubLObject cache_content_iterator_done(final SubLObject state) {
        return iteration.iteration_done(state);
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

    public static SubLObject cfasl_output_object_cache_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_cache(v_object, stream);
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

    public static SubLObject cache_newest(final SubLObject v_cache) {
        return cache_entry_older(cache_head_entry(v_cache));
    }

    public static SubLObject cache_oldest(final SubLObject v_cache) {
        return cache_entry_newer(cache_head_entry(v_cache));
    }

    public static SubLObject cache_queue_remove(final SubLObject v_cache, final SubLObject entry) {
        cache_queue_unlink(entry);
        possibly_resource_cache_entry(v_cache, entry);
        return v_cache;
    }

    public static SubLObject cache_queue_requeue(final SubLObject v_cache, final SubLObject entry) {
        if (!entry.eql(cache_newest(v_cache))) {
            cache_queue_unlink(entry);
            cache_queue_append(v_cache, entry);
        }
        return v_cache;
    }

    public static SubLObject cache_queue_enqueue(final SubLObject v_cache, final SubLObject entry) {
        return cache_queue_append(v_cache, entry);
    }

    public static SubLObject cache_queue_append(final SubLObject v_cache, final SubLObject entry) {
        _csetf_cache_entry_newer(entry, cache_head_entry(v_cache));
        _csetf_cache_entry_older(entry, cache_newest(v_cache));
        _csetf_cache_entry_newer(cache_newest(v_cache), entry);
        _csetf_cache_entry_older(cache_head_entry(v_cache), entry);
        return v_cache;
    }

    public static SubLObject cache_queue_unlink(final SubLObject entry) {
        _csetf_cache_entry_newer(cache_entry_older(entry), cache_entry_newer(entry));
        _csetf_cache_entry_older(cache_entry_newer(entry), cache_entry_older(entry));
        return entry;
    }

    public static SubLObject is_cache_preallocated_p(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        return makeBoolean((free_list == $RESOURCED) || (NIL != cache_entry_p(free_list)));
    }

    public static SubLObject get_new_cache_entry(final SubLObject v_cache) {
        SubLObject entry = unresource_cache_entry(v_cache);
        if (NIL == entry) {
            entry = make_cache_entry(UNPROVIDED);
        }
        return entry;
    }

    public static SubLObject cache_free_list(final SubLObject v_cache) {
        return cache_entry_key(cache_head_entry(v_cache));
    }

    public static SubLObject set_cache_free_list(final SubLObject v_cache, final SubLObject head) {
        _csetf_cache_entry_key(cache_head_entry(v_cache), head);
        return v_cache;
    }

    public static SubLObject possibly_resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        if (NIL != is_cache_preallocated_p(v_cache)) {
            resource_cache_entry(v_cache, entry);
        }
        return v_cache;
    }

    public static SubLObject resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        scrub_cache_entry(entry);
        _csetf_cache_entry_newer(entry, cache_free_list(v_cache));
        return set_cache_free_list(v_cache, entry);
    }

    public static SubLObject unresource_cache_entry(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        SubLObject entry = NIL;
        if (NIL != cache_entry_p(free_list)) {
            entry = free_list;
            set_cache_free_list(v_cache, cache_entry_newer(entry));
            _csetf_cache_entry_newer(entry, NIL);
        }
        return entry;
    }

    public static SubLObject cache_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        princ(cache_entry_key(entry), stream);
        if (NIL != $print_cache_valuesP$.getDynamicValue(thread)) {
            write_string($str87$____, stream, UNPROVIDED, UNPROVIDED);
            princ(cache_entry_value(entry), stream);
        }
        return entry;
    }

    public static SubLObject scrub_cache_entry(final SubLObject entry) {
        _csetf_cache_entry_value(entry, NIL);
        _csetf_cache_entry_key(entry, NIL);
        _csetf_cache_entry_newer(entry, NIL);
        _csetf_cache_entry_older(entry, NIL);
        return entry;
    }

    public static SubLObject test_cache(SubLObject cardinality) {
        if (cardinality == UNPROVIDED) {
            cardinality = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(cardinality) : "subl_promotions.positive_integer_p(cardinality) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(cardinality) " + cardinality;
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
    }

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
    }

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
    }

    public static SubLObject declare_cache_file() {
        declareFunction(me, "cache_print_function_trampoline", "CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cache_p", "CACHE-P", 1, 0, false);
        new cache.$cache_p$UnaryFunction();
        declareFunction(me, "cache_capacity", "CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "cache_map", "CACHE-MAP", 1, 0, false);
        declareFunction(me, "cache_head_entry", "CACHE-HEAD-ENTRY", 1, 0, false);
        declareFunction(me, "_csetf_cache_capacity", "_CSETF-CACHE-CAPACITY", 2, 0, false);
        declareFunction(me, "_csetf_cache_map", "_CSETF-CACHE-MAP", 2, 0, false);
        declareFunction(me, "_csetf_cache_head_entry", "_CSETF-CACHE-HEAD-ENTRY", 2, 0, false);
        declareFunction(me, "make_cache", "MAKE-CACHE", 0, 1, false);
        declareFunction(me, "visit_defstruct_cache", "VISIT-DEFSTRUCT-CACHE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cache_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_entry_print_function_trampoline", "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cache_entry_p", "CACHE-ENTRY-P", 1, 0, false);
        new cache.$cache_entry_p$UnaryFunction();
        declareFunction(me, "cache_entry_newer", "CACHE-ENTRY-NEWER", 1, 0, false);
        declareFunction(me, "cache_entry_key", "CACHE-ENTRY-KEY", 1, 0, false);
        declareFunction(me, "cache_entry_value", "CACHE-ENTRY-VALUE", 1, 0, false);
        declareFunction(me, "cache_entry_older", "CACHE-ENTRY-OLDER", 1, 0, false);
        declareFunction(me, "_csetf_cache_entry_newer", "_CSETF-CACHE-ENTRY-NEWER", 2, 0, false);
        declareFunction(me, "_csetf_cache_entry_key", "_CSETF-CACHE-ENTRY-KEY", 2, 0, false);
        declareFunction(me, "_csetf_cache_entry_value", "_CSETF-CACHE-ENTRY-VALUE", 2, 0, false);
        declareFunction(me, "_csetf_cache_entry_older", "_CSETF-CACHE-ENTRY-OLDER", 2, 0, false);
        declareFunction(me, "make_cache_entry", "MAKE-CACHE-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_cache_entry", "VISIT-DEFSTRUCT-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "cache_print", "CACHE-PRINT", 3, 0, false);
        declareFunction(me, "new_cache", "NEW-CACHE", 1, 1, false);
        declareFunction(me, "new_preallocated_cache", "NEW-PREALLOCATED-CACHE", 1, 1, false);
        declareFunction(me, "cache_full_p", "CACHE-FULL-P", 1, 0, false);
        declareFunction(me, "cache_empty_p", "CACHE-EMPTY-P", 1, 0, false);
        declareFunction(me, "cache_get", "CACHE-GET", 2, 0, false);
        declareFunction(me, "cache_get_without_values", "CACHE-GET-WITHOUT-VALUES", 2, 1, false);
        declareFunction(me, "cache_get_int", "CACHE-GET-INT", 4, 0, false);
        declareFunction(me, "cache_contains_key_p", "CACHE-CONTAINS-KEY-P", 2, 0, false);
        declareFunction(me, "cache_set", "CACHE-SET", 3, 0, false);
        declareFunction(me, "cache_set_without_values", "CACHE-SET-WITHOUT-VALUES", 3, 0, false);
        declareFunction(me, "cache_set_return_dropped", "CACHE-SET-RETURN-DROPPED", 3, 0, false);
        declareFunction(me, "cache_set_int", "CACHE-SET-INT", 4, 0, false);
        declareFunction(me, "cache_remove", "CACHE-REMOVE", 2, 0, false);
        declareFunction(me, "cache_clear", "CACHE-CLEAR", 1, 0, false);
        declareFunction(me, "cache_test", "CACHE-TEST", 1, 0, false);
        declareFunction(me, "cache_size", "CACHE-SIZE", 1, 0, false);
        declareMacro(me, "do_cache", "DO-CACHE");
        declareFunction(me, "cache_copy", "CACHE-COPY", 1, 0, false);
        declareFunction(me, "do_cache_first", "DO-CACHE-FIRST", 2, 0, false);
        declareFunction(me, "do_cache_doneP", "DO-CACHE-DONE?", 2, 0, false);
        declareFunction(me, "do_cache_key", "DO-CACHE-KEY", 1, 0, false);
        declareFunction(me, "do_cache_value", "DO-CACHE-VALUE", 1, 0, false);
        declareFunction(me, "do_cache_next", "DO-CACHE-NEXT", 2, 0, false);
        declareFunction(me, "cache_keys", "CACHE-KEYS", 1, 0, false);
        declareFunction(me, "cache_values", "CACHE-VALUES", 1, 0, false);
        declareFunction(me, "map_cache", "MAP-CACHE", 2, 0, false);
        declareFunction(me, "new_cache_iterator", "NEW-CACHE-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_cache_state", "MAKE-ITERATOR-CACHE-STATE", 1, 0, false);
        declareFunction(me, "cache_iterator_done", "CACHE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "cache_iterator_next", "CACHE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "new_cache_content_iterator", "NEW-CACHE-CONTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "make_cache_content_iterator_state", "MAKE-CACHE-CONTENT-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "cache_content_iterator_done", "CACHE-CONTENT-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "cache_content_iterator_next", "CACHE-CONTENT-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "cfasl_output_object_cache_method", "CFASL-OUTPUT-OBJECT-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_cache", "CFASL-OUTPUT-CACHE", 2, 0, false);
        declareFunction(me, "cfasl_input_cache", "CFASL-INPUT-CACHE", 1, 0, false);
        declareFunction(me, "cache_newest", "CACHE-NEWEST", 1, 0, false);
        declareFunction(me, "cache_oldest", "CACHE-OLDEST", 1, 0, false);
        declareFunction(me, "cache_queue_remove", "CACHE-QUEUE-REMOVE", 2, 0, false);
        declareFunction(me, "cache_queue_requeue", "CACHE-QUEUE-REQUEUE", 2, 0, false);
        declareFunction(me, "cache_queue_enqueue", "CACHE-QUEUE-ENQUEUE", 2, 0, false);
        declareFunction(me, "cache_queue_append", "CACHE-QUEUE-APPEND", 2, 0, false);
        declareFunction(me, "cache_queue_unlink", "CACHE-QUEUE-UNLINK", 1, 0, false);
        declareFunction(me, "is_cache_preallocated_p", "IS-CACHE-PREALLOCATED-P", 1, 0, false);
        declareFunction(me, "get_new_cache_entry", "GET-NEW-CACHE-ENTRY", 1, 0, false);
        declareFunction(me, "cache_free_list", "CACHE-FREE-LIST", 1, 0, false);
        declareFunction(me, "set_cache_free_list", "SET-CACHE-FREE-LIST", 2, 0, false);
        declareFunction(me, "possibly_resource_cache_entry", "POSSIBLY-RESOURCE-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "resource_cache_entry", "RESOURCE-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "unresource_cache_entry", "UNRESOURCE-CACHE-ENTRY", 1, 0, false);
        declareFunction(me, "cache_entry_print", "CACHE-ENTRY-PRINT", 3, 0, false);
        declareFunction(me, "scrub_cache_entry", "SCRUB-CACHE-ENTRY", 1, 0, false);
        declareFunction(me, "test_cache", "TEST-CACHE", 0, 1, false);
        declareFunction(me, "test_get_randomly_populated_cache_and_control_map", "TEST-GET-RANDOMLY-POPULATED-CACHE-AND-CONTROL-MAP", 1, 0, false);
        declareFunction(me, "test_cache_iterators", "TEST-CACHE-ITERATORS", 0, 1, false);
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

    public static SubLObject setup_cache_file() {
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

    

    public static final class $cache_native extends SubLStructNative {
        public SubLObject $capacity;

        public SubLObject $map;

        public SubLObject $head_entry;

        private static final SubLStructDeclNative structDecl;

        private $cache_native() {
            this.$capacity = Lisp.NIL;
            this.$map = Lisp.NIL;
            this.$head_entry = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$capacity;
        }

        @Override
        public SubLObject getField3() {
            return this.$map;
        }

        @Override
        public SubLObject getField4() {
            return this.$head_entry;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$capacity = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$map = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$head_entry = value;
        }

        static {
            structDecl = makeStructDeclNative($cache_native.class, CACHE, CACHE_P, $list2, $list3, new String[]{ "$capacity", "$map", "$head_entry" }, $list4, $list5, CACHE_PRINT);
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

        private $cache_entry_native() {
            this.$newer = Lisp.NIL;
            this.$key = Lisp.NIL;
            this.$value = Lisp.NIL;
            this.$older = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$newer;
        }

        @Override
        public SubLObject getField3() {
            return this.$key;
        }

        @Override
        public SubLObject getField4() {
            return this.$value;
        }

        @Override
        public SubLObject getField5() {
            return this.$older;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$newer = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$key = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$value = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$older = value;
        }

        static {
            structDecl = makeStructDeclNative($cache_entry_native.class, CACHE_ENTRY, CACHE_ENTRY_P, $list26, $list27, new String[]{ "$newer", "$key", "$value", "$older" }, $list28, $list29, CACHE_ENTRY_PRINT);
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
}

/**
 * Total time: 307 ms
 */
