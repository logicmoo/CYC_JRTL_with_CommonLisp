package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cache";
    public static final String myFingerPrint = "4360149d4e45bdd12bec7882df8970799b220ca03c6e1872e78ca529f7575799";
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLSymbol $dtp_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLSymbol $dtp_cache_entry$;
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4308L)
    public static SubLSymbol $print_cache_elementsP$;
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 5358L)
    private static SubLSymbol $cache_entries_preallocateP$;
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 19225L)
    private static SubLSymbol $cfasl_opcode_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 26147L)
    public static SubLSymbol $print_cache_valuesP$;
    private static final SubLSymbol $sym0$CACHE;
    private static final SubLSymbol $sym1$CACHE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CACHE_PRINT;
    private static final SubLSymbol $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$CACHE_CAPACITY;
    private static final SubLSymbol $sym10$_CSETF_CACHE_CAPACITY;
    private static final SubLSymbol $sym11$CACHE_MAP;
    private static final SubLSymbol $sym12$_CSETF_CACHE_MAP;
    private static final SubLSymbol $sym13$CACHE_HEAD_ENTRY;
    private static final SubLSymbol $sym14$_CSETF_CACHE_HEAD_ENTRY;
    private static final SubLSymbol $kw15$CAPACITY;
    private static final SubLSymbol $kw16$MAP;
    private static final SubLSymbol $kw17$HEAD_ENTRY;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_CACHE;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD;
    private static final SubLSymbol $sym24$CACHE_ENTRY;
    private static final SubLSymbol $sym25$CACHE_ENTRY_P;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$CACHE_ENTRY_PRINT;
    private static final SubLSymbol $sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$CACHE_ENTRY_NEWER;
    private static final SubLSymbol $sym34$_CSETF_CACHE_ENTRY_NEWER;
    private static final SubLSymbol $sym35$CACHE_ENTRY_KEY;
    private static final SubLSymbol $sym36$_CSETF_CACHE_ENTRY_KEY;
    private static final SubLSymbol $sym37$CACHE_ENTRY_VALUE;
    private static final SubLSymbol $sym38$_CSETF_CACHE_ENTRY_VALUE;
    private static final SubLSymbol $sym39$CACHE_ENTRY_OLDER;
    private static final SubLSymbol $sym40$_CSETF_CACHE_ENTRY_OLDER;
    private static final SubLSymbol $kw41$NEWER;
    private static final SubLSymbol $kw42$KEY;
    private static final SubLSymbol $kw43$VALUE;
    private static final SubLSymbol $kw44$OLDER;
    private static final SubLSymbol $sym45$MAKE_CACHE_ENTRY;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD;
    private static final SubLString $str47$__CACHE_;
    private static final SubLString $str48$_;
    private static final SubLString $str49$_;
    private static final SubLString $str50$__;
    private static final SubLString $str51$___;
    private static final SubLString $str52$_;
    private static final SubLString $str53$_;
    private static final SubLSymbol $sym54$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym55$VALID_HASH_TEST_P;
    private static final SubLSymbol $kw56$RESOURCED;
    private static final SubLSymbol $kw57$UNKNOWN;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $kw60$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw61$ORDER;
    private static final SubLSymbol $kw62$NEWEST;
    private static final SubLSymbol $sym63$CACHE_VAR;
    private static final SubLSymbol $sym64$ORDER_VAR;
    private static final SubLSymbol $sym65$ENTRY;
    private static final SubLSymbol $sym66$CLET;
    private static final SubLSymbol $sym67$DO_CACHE_FIRST;
    private static final SubLSymbol $sym68$WHILE;
    private static final SubLSymbol $sym69$CNOT;
    private static final SubLSymbol $sym70$DO_CACHE_DONE_;
    private static final SubLSymbol $sym71$CSETQ;
    private static final SubLSymbol $sym72$DO_CACHE_KEY;
    private static final SubLSymbol $sym73$DO_CACHE_VALUE;
    private static final SubLSymbol $sym74$DO_CACHE_NEXT;
    private static final SubLSymbol $kw75$OLDEST;
    private static final SubLSymbol $sym76$DO_CACHE;
    private static final SubLString $str77$_S_was_not_either__NEWEST_or__OLD;
    private static final SubLSymbol $sym78$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym79$CACHE_ITERATOR_DONE;
    private static final SubLSymbol $sym80$CACHE_ITERATOR_NEXT;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$CACHE_CONTENT_ITERATOR_DONE;
    private static final SubLSymbol $sym83$CACHE_CONTENT_ITERATOR_NEXT;
    private static final SubLInteger $int84$63;
    private static final SubLSymbol $sym85$CFASL_INPUT_CACHE;
    private static final SubLSymbol $sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD;
    private static final SubLString $str87$____;
    private static final SubLInteger $int88$100;
    private static final SubLSymbol $sym89$_;
    private static final SubLSymbol $sym90$CDR;
    private static final SubLFloat $float91$0_5;
    private static final SubLString $str92$Content_iterator__A_was_exhausted;
    private static final SubLString $str93$The_content_iterator_at_item__A_s;
    private static final SubLString $str94$The_content_iterator_at_item__A_s;
    private static final SubLString $str95$The_content_iterator__A_is_not_ex;
    private static final SubLString $str96$The_two_iterators_do_not_seem_to_;
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_print(v_object, stream, (SubLObject)cache.ZERO_INTEGER);
        return (SubLObject)cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject cache_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cache_native.class) ? cache.T : cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject cache_capacity(final SubLObject v_object) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject cache_map(final SubLObject v_object) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject cache_head_entry(final SubLObject v_object) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject _csetf_cache_capacity(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject _csetf_cache_map(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject _csetf_cache_head_entry(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject make_cache(SubLObject arglist) {
        if (arglist == cache.UNPROVIDED) {
            arglist = (SubLObject)cache.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cache.NIL, next = arglist; cache.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cache.$kw15$CAPACITY)) {
                _csetf_cache_capacity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cache.$kw16$MAP)) {
                _csetf_cache_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cache.$kw17$HEAD_ENTRY)) {
                _csetf_cache_head_entry(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cache.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject visit_defstruct_cache(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw19$BEGIN, (SubLObject)cache.$sym20$MAKE_CACHE, (SubLObject)cache.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw15$CAPACITY, cache_capacity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw16$MAP, cache_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw17$HEAD_ENTRY, cache_head_entry(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw22$END, (SubLObject)cache.$sym20$MAKE_CACHE, (SubLObject)cache.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 3645L)
    public static SubLObject visit_defstruct_object_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cache(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cache_entry_print(v_object, stream, (SubLObject)cache.ZERO_INTEGER);
        return (SubLObject)cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cache_entry_native.class) ? cache.T : cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_newer(final SubLObject v_object) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_key(final SubLObject v_object) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_value(final SubLObject v_object) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject cache_entry_older(final SubLObject v_object) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject _csetf_cache_entry_newer(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject _csetf_cache_entry_key(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject _csetf_cache_entry_value(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject _csetf_cache_entry_older(final SubLObject v_object, final SubLObject value) {
        assert cache.NIL != cache_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject make_cache_entry(SubLObject arglist) {
        if (arglist == cache.UNPROVIDED) {
            arglist = (SubLObject)cache.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cache.NIL, next = arglist; cache.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cache.$kw41$NEWER)) {
                _csetf_cache_entry_newer(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cache.$kw42$KEY)) {
                _csetf_cache_entry_key(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cache.$kw43$VALUE)) {
                _csetf_cache_entry_value(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cache.$kw44$OLDER)) {
                _csetf_cache_entry_older(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cache.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject visit_defstruct_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw19$BEGIN, (SubLObject)cache.$sym45$MAKE_CACHE_ENTRY, (SubLObject)cache.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw41$NEWER, cache_entry_newer(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw42$KEY, cache_entry_key(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw43$VALUE, cache_entry_value(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw21$SLOT, (SubLObject)cache.$kw44$OLDER, cache_entry_older(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cache.$kw22$END, (SubLObject)cache.$sym45$MAKE_CACHE_ENTRY, (SubLObject)cache.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4058L)
    public static SubLObject visit_defstruct_object_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cache_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 4482L)
    public static SubLObject cache_print(final SubLObject v_cache, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)cache.$str47$__CACHE_, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        print_high.princ(Hashtables.hash_table_test(cache_map(v_cache)), stream);
        streams_high.write_string((SubLObject)cache.$str48$_, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        print_high.princ(cache_size(v_cache), stream);
        if (cache.NIL != cache.$print_cache_elementsP$.getDynamicValue(thread)) {
            streams_high.write_string((SubLObject)cache.$str49$_, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
            SubLObject i = (SubLObject)cache.ZERO_INTEGER;
            final SubLObject count = cache_size(v_cache);
            SubLObject entry = cache_head_entry(v_cache);
            while (i.numL(Numbers.min((SubLObject)cache.NINE_INTEGER, Numbers.subtract(count, (SubLObject)cache.ONE_INTEGER)))) {
                entry = cache_entry_newer(entry);
                print_high.princ(entry, stream);
                print_high.princ((SubLObject)cache.$str50$__, stream);
                i = Numbers.add(i, (SubLObject)cache.ONE_INTEGER);
            }
            if (count.numG((SubLObject)cache.ZERO_INTEGER)) {
                print_high.princ(cache_entry_newer(entry), stream);
            }
            if (count.numG((SubLObject)cache.TEN_INTEGER)) {
                print_high.princ((SubLObject)cache.$str51$___, (SubLObject)cache.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)cache.$str52$_, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)cache.$str53$_, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 5483L)
    public static SubLObject new_cache(final SubLObject capacity, SubLObject test) {
        if (test == cache.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cache.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cache.NIL != subl_promotions.positive_integer_p(capacity) : capacity;
        assert cache.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        final SubLObject v_cache = make_cache((SubLObject)cache.UNPROVIDED);
        final SubLObject head_entry = make_cache_entry((SubLObject)cache.UNPROVIDED);
        _csetf_cache_capacity(v_cache, capacity);
        _csetf_cache_map(v_cache, Hashtables.make_hash_table((SubLObject)cache.ZERO_INTEGER, test, (SubLObject)cache.UNPROVIDED));
        _csetf_cache_entry_newer(head_entry, head_entry);
        _csetf_cache_entry_older(head_entry, head_entry);
        _csetf_cache_head_entry(v_cache, head_entry);
        if (cache.NIL != cache.$cache_entries_preallocateP$.getDynamicValue(thread)) {
            set_cache_free_list(v_cache, (SubLObject)cache.$kw56$RESOURCED);
            SubLObject i;
            for (i = (SubLObject)cache.NIL, i = (SubLObject)cache.ZERO_INTEGER; i.numL(capacity); i = Numbers.add(i, (SubLObject)cache.ONE_INTEGER)) {
                resource_cache_entry(v_cache, make_cache_entry((SubLObject)cache.UNPROVIDED));
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 6417L)
    public static SubLObject new_preallocated_cache(final SubLObject capacity, SubLObject test) {
        if (test == cache.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cache.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cache = (SubLObject)cache.NIL;
        final SubLObject _prev_bind_0 = cache.$cache_entries_preallocateP$.currentBinding(thread);
        try {
            cache.$cache_entries_preallocateP$.bind((SubLObject)cache.T, thread);
            v_cache = new_cache(capacity, test);
        }
        finally {
            cache.$cache_entries_preallocateP$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 6862L)
    public static SubLObject cache_full_p(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return Numbers.numGE(cache_size(v_cache), cache_capacity(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 7159L)
    public static SubLObject cache_empty_p(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return Equality.eq(cache_newest(v_cache), cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 7463L)
    public static SubLObject cache_get(final SubLObject v_cache, final SubLObject key) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return cache_get_int(v_cache, key, (SubLObject)cache.NIL, (SubLObject)cache.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 7912L)
    public static SubLObject cache_get_without_values(final SubLObject v_cache, final SubLObject key, SubLObject v_default) {
        if (v_default == cache.UNPROVIDED) {
            v_default = (SubLObject)cache.NIL;
        }
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return cache_get_int(v_cache, key, v_default, (SubLObject)cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 8365L)
    public static SubLObject cache_get_int(final SubLObject v_cache, final SubLObject key, final SubLObject v_default, final SubLObject return_entry_p) {
        final SubLObject entry = Hashtables.gethash_without_values(key, cache_map(v_cache), (SubLObject)cache.UNPROVIDED);
        if (cache.NIL == entry) {
            if (cache.NIL != return_entry_p) {
                return subl_promotions.values2((SubLObject)cache.NIL, (SubLObject)cache.NIL);
            }
            return v_default;
        }
        else {
            cache_queue_requeue(v_cache, entry);
            if (cache.NIL != return_entry_p) {
                return subl_promotions.values2(cache_entry_value(entry), (SubLObject)cache.T);
            }
            return cache_entry_value(entry);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 8734L)
    public static SubLObject cache_contains_key_p(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = Hashtables.gethash(key, cache_map(v_cache), (SubLObject)cache.UNPROVIDED);
        final SubLObject found_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return found_p;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 9252L)
    public static SubLObject cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return cache_set_int(v_cache, key, value, (SubLObject)cache.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 9773L)
    public static SubLObject cache_set_without_values(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return cache_set_int(v_cache, key, value, (SubLObject)cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 10192L)
    public static SubLObject cache_set_return_dropped(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        SubLObject oldest_key = (SubLObject)cache.NIL;
        SubLObject oldest_value = (SubLObject)cache.NIL;
        SubLObject dropped = (SubLObject)cache.NIL;
        if (cache.NIL != cache_full_p(v_cache) && cache.$kw57$UNKNOWN == cache_get_without_values(v_cache, key, (SubLObject)cache.$kw57$UNKNOWN)) {
            oldest_key = cache_entry_key(cache_oldest(v_cache));
            oldest_value = cache_get_without_values(v_cache, oldest_key, (SubLObject)cache.UNPROVIDED);
            dropped = (SubLObject)cache.T;
            cache_remove(v_cache, oldest_key);
        }
        cache_set_without_values(v_cache, key, value);
        return subl_promotions.values3(oldest_key, oldest_value, dropped);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 11195L)
    public static SubLObject cache_set_int(final SubLObject v_cache, final SubLObject key, final SubLObject value, final SubLObject return_old_entry) {
        final SubLObject old_entry = Hashtables.gethash_without_values(key, cache_map(v_cache), (SubLObject)cache.UNPROVIDED);
        SubLObject previous = (SubLObject)cache.NIL;
        if (cache.NIL != old_entry) {
            previous = cache_entry_value(old_entry);
            _csetf_cache_entry_value(old_entry, value);
            cache_queue_requeue(v_cache, old_entry);
        }
        else {
            SubLObject entry = (SubLObject)cache.NIL;
            if (cache.NIL != cache_full_p(v_cache)) {
                entry = cache_oldest(v_cache);
                Hashtables.remhash(cache_entry_key(entry), cache_map(v_cache));
                cache_queue_unlink(entry);
            }
            else {
                entry = get_new_cache_entry(v_cache);
            }
            _csetf_cache_entry_key(entry, key);
            _csetf_cache_entry_value(entry, value);
            Hashtables.sethash(key, cache_map(v_cache), entry);
            cache_queue_enqueue(v_cache, entry);
        }
        if (cache.NIL != return_old_entry) {
            return subl_promotions.values2(previous, list_utilities.sublisp_boolean(old_entry));
        }
        return previous;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 12286L)
    public static SubLObject cache_remove(final SubLObject v_cache, final SubLObject key) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        final SubLObject entry = Hashtables.gethash_without_values(key, cache_map(v_cache), (SubLObject)cache.UNPROVIDED);
        SubLObject value = (SubLObject)cache.NIL;
        if (cache.NIL != entry) {
            cache_queue_remove(v_cache, entry);
            Hashtables.remhash(key, cache_map(v_cache));
            value = cache_entry_value(entry);
        }
        return subl_promotions.values2(value, list_utilities.sublisp_boolean(entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 12950L)
    public static SubLObject cache_clear(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        if (cache.NIL != is_cache_preallocated_p(v_cache)) {
            while (cache.NIL == cache_empty_p(v_cache)) {
                final SubLObject oldest = cache_oldest(v_cache);
                cache_remove(v_cache, cache_entry_key(oldest));
            }
        }
        else {
            final SubLObject head_entry = cache_head_entry(v_cache);
            _csetf_cache_entry_newer(head_entry, head_entry);
            _csetf_cache_entry_older(head_entry, head_entry);
            Hashtables.clrhash(cache_map(v_cache));
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 13663L)
    public static SubLObject cache_test(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return Hashtables.hash_table_test(cache_map(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 13933L)
    public static SubLObject cache_size(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return Hashtables.hash_table_count(cache_map(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 14198L)
    public static SubLObject do_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cache.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        SubLObject v_cache = (SubLObject)cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cache.$list58);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cache.$list58);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cache.$list58);
        v_cache = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cache.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cache.NIL;
        SubLObject current_$1 = (SubLObject)cache.NIL;
        while (cache.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cache.$list58);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cache.$list58);
            if (cache.NIL == conses_high.member(current_$1, (SubLObject)cache.$list59, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED)) {
                bad = (SubLObject)cache.T;
            }
            if (current_$1 == cache.$kw60$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cache.NIL != bad && cache.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cache.$list58);
        }
        final SubLObject order_tail = cdestructuring_bind.property_list_member((SubLObject)cache.$kw61$ORDER, current);
        final SubLObject order = (SubLObject)((cache.NIL != order_tail) ? conses_high.cadr(order_tail) : cache.$kw62$NEWEST);
        final SubLObject body;
        current = (body = temp);
        final SubLObject cache_var = (SubLObject)cache.$sym63$CACHE_VAR;
        final SubLObject order_var = (SubLObject)cache.$sym64$ORDER_VAR;
        final SubLObject entry = (SubLObject)cache.$sym65$ENTRY;
        return (SubLObject)ConsesLow.list((SubLObject)cache.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cache_var, v_cache), (SubLObject)ConsesLow.list(order_var, order), (SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)cache.$sym67$DO_CACHE_FIRST, cache_var, order_var)), key, value), (SubLObject)ConsesLow.listS((SubLObject)cache.$sym68$WHILE, (SubLObject)ConsesLow.list((SubLObject)cache.$sym69$CNOT, (SubLObject)ConsesLow.list((SubLObject)cache.$sym70$DO_CACHE_DONE_, cache_var, entry)), (SubLObject)ConsesLow.list((SubLObject)cache.$sym71$CSETQ, key, (SubLObject)ConsesLow.list((SubLObject)cache.$sym72$DO_CACHE_KEY, entry)), (SubLObject)ConsesLow.list((SubLObject)cache.$sym71$CSETQ, value, (SubLObject)ConsesLow.list((SubLObject)cache.$sym73$DO_CACHE_VALUE, entry)), (SubLObject)ConsesLow.list((SubLObject)cache.$sym71$CSETQ, entry, (SubLObject)ConsesLow.list((SubLObject)cache.$sym74$DO_CACHE_NEXT, entry, order_var)), ConsesLow.append(body, (SubLObject)cache.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 14949L)
    public static SubLObject cache_copy(final SubLObject v_cache) {
        final SubLObject copy = new_cache(cache_capacity(v_cache), cache_test(v_cache));
        final SubLObject order_var = (SubLObject)cache.$kw75$OLDEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        while (cache.NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            cache_set(copy, key, value);
        }
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 15335L)
    public static SubLObject do_cache_first(final SubLObject v_cache, final SubLObject order) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return do_cache_next(cache_head_entry(v_cache), order);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 15510L)
    public static SubLObject do_cache_doneP(final SubLObject v_cache, final SubLObject entry) {
        return Equality.eq(entry, cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 15626L)
    public static SubLObject do_cache_key(final SubLObject entry) {
        return cache_entry_key(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 15722L)
    public static SubLObject do_cache_value(final SubLObject entry) {
        return cache_entry_value(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 15822L)
    public static SubLObject do_cache_next(final SubLObject entry, final SubLObject order) {
        if (order.eql((SubLObject)cache.$kw62$NEWEST)) {
            return cache_entry_older(entry);
        }
        if (order.eql((SubLObject)cache.$kw75$OLDEST)) {
            return cache_entry_newer(entry);
        }
        return Errors.error((SubLObject)cache.$str77$_S_was_not_either__NEWEST_or__OLD, order);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 16080L)
    public static SubLObject cache_keys(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        SubLObject keys = (SubLObject)cache.NIL;
        final SubLObject order_var = (SubLObject)cache.$kw62$NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        while (cache.NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            keys = (SubLObject)ConsesLow.cons(key, keys);
        }
        return Sequences.nreverse(keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 16371L)
    public static SubLObject cache_values(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        SubLObject values = (SubLObject)cache.NIL;
        final SubLObject order_var = (SubLObject)cache.$kw62$NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = (SubLObject)cache.NIL;
        for (SubLObject value = (SubLObject)cache.NIL; cache.NIL == do_cache_doneP(v_cache, entry); entry = do_cache_next(entry, order_var), values = (SubLObject)ConsesLow.cons(value, values)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
        }
        return Sequences.nreverse(values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 16671L)
    public static SubLObject map_cache(final SubLObject v_cache, final SubLObject function) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        assert cache.NIL != Types.function_spec_p(function) : function;
        final SubLObject order_var = (SubLObject)cache.$kw62$NEWEST;
        SubLObject entry = do_cache_first(v_cache, order_var);
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        while (cache.NIL == do_cache_doneP(v_cache, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            Functions.funcall(function, key, value);
        }
        return (SubLObject)cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 17002L)
    public static SubLObject new_cache_iterator(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return iteration.new_iterator(make_iterator_cache_state(v_cache), (SubLObject)cache.$sym79$CACHE_ITERATOR_DONE, (SubLObject)cache.$sym80$CACHE_ITERATOR_NEXT, (SubLObject)cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 17405L)
    public static SubLObject make_iterator_cache_state(final SubLObject v_cache) {
        final SubLObject current = cache_entry_older(cache_head_entry(v_cache));
        return (SubLObject)ConsesLow.list(current, cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 17598L)
    public static SubLObject cache_iterator_done(final SubLObject state) {
        SubLObject current_$2 = (SubLObject)cache.NIL;
        SubLObject head_entry = (SubLObject)cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)cache.$list81);
        current_$2 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)cache.$list81);
        head_entry = current.first();
        current = current.rest();
        if (cache.NIL == current) {
            return Equality.eq(current_$2, head_entry);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)cache.$list81);
        return (SubLObject)cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 17729L)
    public static SubLObject cache_iterator_next(final SubLObject state) {
        SubLObject current_$3 = (SubLObject)cache.NIL;
        SubLObject head_entry = (SubLObject)cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)cache.$list81);
        current_$3 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)cache.$list81);
        head_entry = current.first();
        current = current.rest();
        if (cache.NIL == current) {
            ConsesLow.rplaca(state, cache_entry_older(current_$3));
            return subl_promotions.values3(current_$3, state, Equality.eq(current_$3, head_entry));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)cache.$list81);
        return (SubLObject)cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 17931L)
    public static SubLObject new_cache_content_iterator(final SubLObject v_cache) {
        assert cache.NIL != cache_p(v_cache) : v_cache;
        return iteration.new_iterator(make_cache_content_iterator_state(v_cache), (SubLObject)cache.$sym82$CACHE_CONTENT_ITERATOR_DONE, (SubLObject)cache.$sym83$CACHE_CONTENT_ITERATOR_NEXT, (SubLObject)cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 18438L)
    public static SubLObject make_cache_content_iterator_state(final SubLObject v_cache) {
        final SubLObject interior_iterator = new_cache_iterator(v_cache);
        return interior_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 18606L)
    public static SubLObject cache_content_iterator_done(final SubLObject state) {
        return iteration.iteration_done(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 18742L)
    public static SubLObject cache_content_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject current_entry = iteration.iteration_next(state);
        final SubLObject valid_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cache.NIL != valid_p) {
            final SubLObject key = cache_entry_key(current_entry);
            final SubLObject value = cache_entry_value(current_entry);
            return subl_promotions.values3((SubLObject)ConsesLow.cons(key, value), state, (SubLObject)cache.NIL);
        }
        return subl_promotions.values3((SubLObject)cache.NIL, state, (SubLObject)cache.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 19344L)
    public static SubLObject cfasl_output_object_cache_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_cache(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 19459L)
    public static SubLObject cfasl_output_cache(final SubLObject v_object, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(cache.$cfasl_opcode_cache$.getGlobalValue(), stream);
        final SubLObject capacity = cache_capacity(v_object);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(cache_test(v_object));
        final SubLObject size = cache_size(v_object);
        cfasl.cfasl_output(capacity, stream);
        cfasl.cfasl_output(test, stream);
        cfasl.cfasl_output(size, stream);
        final SubLObject order_var = (SubLObject)cache.$kw75$OLDEST;
        SubLObject entry = do_cache_first(v_object, order_var);
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        while (cache.NIL == do_cache_doneP(v_object, entry)) {
            key = do_cache_key(entry);
            value = do_cache_value(entry);
            entry = do_cache_next(entry, order_var);
            cfasl.cfasl_output(key, stream);
            cfasl.cfasl_output(value, stream);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 19928L)
    public static SubLObject cfasl_input_cache(final SubLObject stream) {
        final SubLObject capacity = cfasl.cfasl_input(stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        SubLObject test = cfasl.cfasl_input(stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        final SubLObject size = cfasl.cfasl_input(stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        SubLObject v_cache = (SubLObject)cache.NIL;
        final SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)cache.EQ) || pcase_var.eql((SubLObject)cache.EQL) || pcase_var.eql((SubLObject)cache.EQUAL) || pcase_var.eql((SubLObject)cache.EQUALP)) {
            test = Symbols.symbol_function(test);
        }
        v_cache = new_cache(capacity, test);
        SubLObject i;
        SubLObject key;
        SubLObject value;
        for (i = (SubLObject)cache.NIL, i = (SubLObject)cache.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)cache.ONE_INTEGER)) {
            key = cfasl.cfasl_input(stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
            value = cfasl.cfasl_input(stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
            cache_set_without_values(v_cache, key, value);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 20466L)
    public static SubLObject cache_newest(final SubLObject v_cache) {
        return cache_entry_older(cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 20830L)
    public static SubLObject cache_oldest(final SubLObject v_cache) {
        return cache_entry_newer(cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 21148L)
    public static SubLObject cache_queue_remove(final SubLObject v_cache, final SubLObject entry) {
        cache_queue_unlink(entry);
        possibly_resource_cache_entry(v_cache, entry);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 21648L)
    public static SubLObject cache_queue_requeue(final SubLObject v_cache, final SubLObject entry) {
        if (!entry.eql(cache_newest(v_cache))) {
            cache_queue_unlink(entry);
            cache_queue_append(v_cache, entry);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 22071L)
    public static SubLObject cache_queue_enqueue(final SubLObject v_cache, final SubLObject entry) {
        return cache_queue_append(v_cache, entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 22467L)
    public static SubLObject cache_queue_append(final SubLObject v_cache, final SubLObject entry) {
        _csetf_cache_entry_newer(entry, cache_head_entry(v_cache));
        _csetf_cache_entry_older(entry, cache_newest(v_cache));
        _csetf_cache_entry_newer(cache_newest(v_cache), entry);
        _csetf_cache_entry_older(cache_head_entry(v_cache), entry);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 23077L)
    public static SubLObject cache_queue_unlink(final SubLObject entry) {
        _csetf_cache_entry_newer(cache_entry_older(entry), cache_entry_newer(entry));
        _csetf_cache_entry_older(cache_entry_newer(entry), cache_entry_older(entry));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 23412L)
    public static SubLObject is_cache_preallocated_p(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        return (SubLObject)SubLObjectFactory.makeBoolean(free_list == cache.$kw56$RESOURCED || cache.NIL != cache_entry_p(free_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 23655L)
    public static SubLObject get_new_cache_entry(final SubLObject v_cache) {
        SubLObject entry = unresource_cache_entry(v_cache);
        if (cache.NIL == entry) {
            entry = make_cache_entry((SubLObject)cache.UNPROVIDED);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 24020L)
    public static SubLObject cache_free_list(final SubLObject v_cache) {
        return cache_entry_key(cache_head_entry(v_cache));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 24394L)
    public static SubLObject set_cache_free_list(final SubLObject v_cache, final SubLObject head) {
        _csetf_cache_entry_key(cache_head_entry(v_cache), head);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 24858L)
    public static SubLObject possibly_resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        if (cache.NIL != is_cache_preallocated_p(v_cache)) {
            resource_cache_entry(v_cache, entry);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 25239L)
    public static SubLObject resource_cache_entry(final SubLObject v_cache, final SubLObject entry) {
        scrub_cache_entry(entry);
        _csetf_cache_entry_newer(entry, cache_free_list(v_cache));
        return set_cache_free_list(v_cache, entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 25631L)
    public static SubLObject unresource_cache_entry(final SubLObject v_cache) {
        final SubLObject free_list = cache_free_list(v_cache);
        SubLObject entry = (SubLObject)cache.NIL;
        if (cache.NIL != cache_entry_p(free_list)) {
            entry = free_list;
            set_cache_free_list(v_cache, cache_entry_newer(entry));
            _csetf_cache_entry_newer(entry, (SubLObject)cache.NIL);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 26323L)
    public static SubLObject cache_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        print_high.princ(cache_entry_key(entry), stream);
        if (cache.NIL != cache.$print_cache_valuesP$.getDynamicValue(thread)) {
            streams_high.write_string((SubLObject)cache.$str87$____, stream, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
            print_high.princ(cache_entry_value(entry), stream);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 26711L)
    public static SubLObject scrub_cache_entry(final SubLObject entry) {
        _csetf_cache_entry_value(entry, (SubLObject)cache.NIL);
        _csetf_cache_entry_key(entry, (SubLObject)cache.NIL);
        _csetf_cache_entry_newer(entry, (SubLObject)cache.NIL);
        _csetf_cache_entry_older(entry, (SubLObject)cache.NIL);
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 26976L)
    public static SubLObject test_cache(SubLObject cardinality) {
        if (cardinality == cache.UNPROVIDED) {
            cardinality = (SubLObject)cache.$int88$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cache.NIL != subl_promotions.positive_integer_p(cardinality) : cardinality;
        final SubLObject capacity = Numbers.divide(cardinality, (SubLObject)cache.TEN_INTEGER);
        SubLObject j = (SubLObject)cache.ZERO_INTEGER;
        SubLObject passP = (SubLObject)cache.T;
        SubLObject order = (SubLObject)cache.NIL;
        thread.resetMultipleValues();
        final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(capacity);
        final SubLObject hash = thread.secondMultipleValue();
        thread.resetMultipleValues();
        order = Vectors.make_vector(Hashtables.hash_table_count(hash), (SubLObject)cache.UNPROVIDED);
        SubLObject key = (SubLObject)cache.NIL;
        SubLObject time = (SubLObject)cache.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                time = Hashtables.getEntryValue(cdohash_entry);
                Vectors.set_aref(order, j, (SubLObject)ConsesLow.cons(key, time));
                j = Numbers.add(j, (SubLObject)cache.ONE_INTEGER);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        Sort.sort(order, Symbols.symbol_function((SubLObject)cache.$sym89$_), Symbols.symbol_function((SubLObject)cache.$sym90$CDR));
        final SubLObject hits = Numbers.min(capacity, Hashtables.hash_table_count(hash));
        SubLObject key2 = (SubLObject)cache.NIL;
        SubLObject value = (SubLObject)cache.NIL;
        SubLObject i;
        for (i = (SubLObject)cache.NIL, i = (SubLObject)cache.ZERO_INTEGER; i.numL(hits); i = Numbers.add(i, (SubLObject)cache.ONE_INTEGER)) {
            key2 = Vectors.aref(order, i).first();
            value = cache_get(v_cache, key2);
            passP = (SubLObject)SubLObjectFactory.makeBoolean(cache.NIL != passP && value.eql(Numbers.add(key2, (SubLObject)cache.$float91$0_5)));
        }
        SubLObject cdotimes_end_var;
        SubLObject k;
        for (cdotimes_end_var = Numbers.subtract(Hashtables.hash_table_count(hash), hits), k = (SubLObject)cache.NIL, k = (SubLObject)cache.ZERO_INTEGER; k.numL(cdotimes_end_var); k = Numbers.add(k, (SubLObject)cache.ONE_INTEGER)) {
            passP = (SubLObject)SubLObjectFactory.makeBoolean(cache.NIL != passP && cache.NIL == cache_get(v_cache, Vectors.aref(order, Numbers.add(k, capacity)).first()));
        }
        return passP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 28363L)
    public static SubLObject test_get_randomly_populated_cache_and_control_map(final SubLObject capacity) {
        final SubLObject v_cache = new_cache(capacity, (SubLObject)cache.UNPROVIDED);
        final SubLObject estimated_cardinality = Numbers.multiply((SubLObject)cache.TEN_INTEGER, capacity);
        final SubLObject map = Hashtables.make_hash_table(estimated_cardinality, (SubLObject)cache.UNPROVIDED, (SubLObject)cache.UNPROVIDED);
        SubLObject time;
        SubLObject key;
        for (time = (SubLObject)cache.NIL, time = (SubLObject)cache.ZERO_INTEGER; time.numL(estimated_cardinality); time = Numbers.add(time, (SubLObject)cache.ONE_INTEGER)) {
            key = random.random(estimated_cardinality);
            cache_set(v_cache, key, Numbers.add(key, (SubLObject)cache.$float91$0_5));
            map_utilities.map_put(map, key, time);
        }
        return subl_promotions.values2(v_cache, map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cache.lisp", position = 29146L)
    public static SubLObject test_cache_iterators(SubLObject cardinality) {
        if (cardinality == cache.UNPROVIDED) {
            cardinality = (SubLObject)cache.$int88$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map(Numbers.integerDivide(cardinality, (SubLObject)cache.TEN_INTEGER));
        final SubLObject map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject entry_iterator = new_cache_iterator(v_cache);
        final SubLObject content_iterator = new_cache_content_iterator(v_cache);
        SubLObject item_number = (SubLObject)cache.ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)cache.NIL; cache.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(cache.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(entry_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cache.NIL != valid) {
                item_number = Numbers.add(item_number, (SubLObject)cache.ONE_INTEGER);
                if (cache.NIL != iteration.iteration_done(content_iterator)) {
                    Errors.warn((SubLObject)cache.$str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                    return (SubLObject)cache.NIL;
                }
                thread.resetMultipleValues();
                final SubLObject key_value_pair = iteration.iteration_next(content_iterator);
                final SubLObject valid_p = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (cache.NIL == valid_p) {
                    Errors.warn((SubLObject)cache.$str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator);
                    return (SubLObject)cache.NIL;
                }
                final SubLObject entry_key = cache_entry_key(entry);
                final SubLObject entry_value = cache_entry_value(entry);
                final SubLObject content_key = key_value_pair.first();
                final SubLObject content_value = key_value_pair.rest();
                if (!entry_key.eql(content_key)) {
                    Errors.warn((SubLObject)cache.$str93$The_content_iterator_at_item__A_s, item_number, content_key, entry_key);
                    return (SubLObject)cache.NIL;
                }
                if (!entry_value.eql(content_value)) {
                    Errors.warn((SubLObject)cache.$str94$The_content_iterator_at_item__A_s, item_number, content_value, entry_value);
                    return (SubLObject)cache.NIL;
                }
            }
        }
        if (cache.NIL == iteration.iteration_done(content_iterator)) {
            Errors.warn((SubLObject)cache.$str95$The_content_iterator__A_is_not_ex, item_number, content_iterator, entry_iterator);
            return (SubLObject)cache.NIL;
        }
        if (!item_number.numE(cache_size(v_cache))) {
            Errors.warn((SubLObject)cache.$str96$The_two_iterators_do_not_seem_to_, item_number, cache_size(v_cache));
            return (SubLObject)cache.NIL;
        }
        return (SubLObject)cache.T;
    }
    
    public static SubLObject declare_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_print_function_trampoline", "CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_p", "CACHE-P", 1, 0, false);
        new $cache_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_capacity", "CACHE-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_map", "CACHE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_head_entry", "CACHE-HEAD-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_capacity", "_CSETF-CACHE-CAPACITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_map", "_CSETF-CACHE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_head_entry", "_CSETF-CACHE-HEAD-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "make_cache", "MAKE-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "visit_defstruct_cache", "VISIT-DEFSTRUCT-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "visit_defstruct_object_cache_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_print_function_trampoline", "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_p", "CACHE-ENTRY-P", 1, 0, false);
        new $cache_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_newer", "CACHE-ENTRY-NEWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_key", "CACHE-ENTRY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_value", "CACHE-ENTRY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_older", "CACHE-ENTRY-OLDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_entry_newer", "_CSETF-CACHE-ENTRY-NEWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_entry_key", "_CSETF-CACHE-ENTRY-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_entry_value", "_CSETF-CACHE-ENTRY-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "_csetf_cache_entry_older", "_CSETF-CACHE-ENTRY-OLDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "make_cache_entry", "MAKE-CACHE-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "visit_defstruct_cache_entry", "VISIT-DEFSTRUCT-CACHE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "visit_defstruct_object_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_print", "CACHE-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "new_cache", "NEW-CACHE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "new_preallocated_cache", "NEW-PREALLOCATED-CACHE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_full_p", "CACHE-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_empty_p", "CACHE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_get", "CACHE-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_get_without_values", "CACHE-GET-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_get_int", "CACHE-GET-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_contains_key_p", "CACHE-CONTAINS-KEY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_set", "CACHE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_set_without_values", "CACHE-SET-WITHOUT-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_set_return_dropped", "CACHE-SET-RETURN-DROPPED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_set_int", "CACHE-SET-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_remove", "CACHE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_clear", "CACHE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_test", "CACHE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_size", "CACHE-SIZE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cache", "do_cache", "DO-CACHE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_copy", "CACHE-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "do_cache_first", "DO-CACHE-FIRST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "do_cache_doneP", "DO-CACHE-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "do_cache_key", "DO-CACHE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "do_cache_value", "DO-CACHE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "do_cache_next", "DO-CACHE-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_keys", "CACHE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_values", "CACHE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "map_cache", "MAP-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "new_cache_iterator", "NEW-CACHE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "make_iterator_cache_state", "MAKE-ITERATOR-CACHE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_iterator_done", "CACHE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_iterator_next", "CACHE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "new_cache_content_iterator", "NEW-CACHE-CONTENT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "make_cache_content_iterator_state", "MAKE-CACHE-CONTENT-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_content_iterator_done", "CACHE-CONTENT-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_content_iterator_next", "CACHE-CONTENT-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cfasl_output_object_cache_method", "CFASL-OUTPUT-OBJECT-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cfasl_output_cache", "CFASL-OUTPUT-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cfasl_input_cache", "CFASL-INPUT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_newest", "CACHE-NEWEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_oldest", "CACHE-OLDEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_queue_remove", "CACHE-QUEUE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_queue_requeue", "CACHE-QUEUE-REQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_queue_enqueue", "CACHE-QUEUE-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_queue_append", "CACHE-QUEUE-APPEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_queue_unlink", "CACHE-QUEUE-UNLINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "is_cache_preallocated_p", "IS-CACHE-PREALLOCATED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "get_new_cache_entry", "GET-NEW-CACHE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_free_list", "CACHE-FREE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "set_cache_free_list", "SET-CACHE-FREE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "possibly_resource_cache_entry", "POSSIBLY-RESOURCE-CACHE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "resource_cache_entry", "RESOURCE-CACHE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "unresource_cache_entry", "UNRESOURCE-CACHE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "cache_entry_print", "CACHE-ENTRY-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "scrub_cache_entry", "SCRUB-CACHE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "test_cache", "TEST-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "test_get_randomly_populated_cache_and_control_map", "TEST-GET-RANDOMLY-POPULATED-CACHE-AND-CONTROL-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cache", "test_cache_iterators", "TEST-CACHE-ITERATORS", 0, 1, false);
        return (SubLObject)cache.NIL;
    }
    
    public static SubLObject init_cache_file() {
        cache.$dtp_cache$ = SubLFiles.defconstant("*DTP-CACHE*", (SubLObject)cache.$sym0$CACHE);
        cache.$dtp_cache_entry$ = SubLFiles.defconstant("*DTP-CACHE-ENTRY*", (SubLObject)cache.$sym24$CACHE_ENTRY);
        cache.$print_cache_elementsP$ = SubLFiles.defparameter("*PRINT-CACHE-ELEMENTS?*", (SubLObject)cache.NIL);
        cache.$cache_entries_preallocateP$ = SubLFiles.defparameter("*CACHE-ENTRIES-PREALLOCATE?*", (SubLObject)cache.NIL);
        cache.$cfasl_opcode_cache$ = SubLFiles.defconstant("*CFASL-OPCODE-CACHE*", (SubLObject)cache.$int84$63);
        cache.$print_cache_valuesP$ = SubLFiles.defparameter("*PRINT-CACHE-VALUES?*", (SubLObject)cache.NIL);
        return (SubLObject)cache.NIL;
    }
    
    public static SubLObject setup_cache_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cache.$dtp_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)cache.$sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cache.$list8);
        Structures.def_csetf((SubLObject)cache.$sym9$CACHE_CAPACITY, (SubLObject)cache.$sym10$_CSETF_CACHE_CAPACITY);
        Structures.def_csetf((SubLObject)cache.$sym11$CACHE_MAP, (SubLObject)cache.$sym12$_CSETF_CACHE_MAP);
        Structures.def_csetf((SubLObject)cache.$sym13$CACHE_HEAD_ENTRY, (SubLObject)cache.$sym14$_CSETF_CACHE_HEAD_ENTRY);
        Equality.identity((SubLObject)cache.$sym0$CACHE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cache.$dtp_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)cache.$sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cache.$dtp_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)cache.$sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cache.$list32);
        Structures.def_csetf((SubLObject)cache.$sym33$CACHE_ENTRY_NEWER, (SubLObject)cache.$sym34$_CSETF_CACHE_ENTRY_NEWER);
        Structures.def_csetf((SubLObject)cache.$sym35$CACHE_ENTRY_KEY, (SubLObject)cache.$sym36$_CSETF_CACHE_ENTRY_KEY);
        Structures.def_csetf((SubLObject)cache.$sym37$CACHE_ENTRY_VALUE, (SubLObject)cache.$sym38$_CSETF_CACHE_ENTRY_VALUE);
        Structures.def_csetf((SubLObject)cache.$sym39$CACHE_ENTRY_OLDER, (SubLObject)cache.$sym40$_CSETF_CACHE_ENTRY_OLDER);
        Equality.identity((SubLObject)cache.$sym24$CACHE_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cache.$dtp_cache_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)cache.$sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD));
        access_macros.register_macro_helper((SubLObject)cache.$sym67$DO_CACHE_FIRST, (SubLObject)cache.$sym76$DO_CACHE);
        access_macros.register_macro_helper((SubLObject)cache.$sym70$DO_CACHE_DONE_, (SubLObject)cache.$sym76$DO_CACHE);
        access_macros.register_macro_helper((SubLObject)cache.$sym72$DO_CACHE_KEY, (SubLObject)cache.$sym76$DO_CACHE);
        access_macros.register_macro_helper((SubLObject)cache.$sym73$DO_CACHE_VALUE, (SubLObject)cache.$sym76$DO_CACHE);
        access_macros.register_macro_helper((SubLObject)cache.$sym74$DO_CACHE_NEXT, (SubLObject)cache.$sym76$DO_CACHE);
        cfasl.register_cfasl_input_function(cache.$cfasl_opcode_cache$.getGlobalValue(), (SubLObject)cache.$sym85$CFASL_INPUT_CACHE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), cache.$dtp_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)cache.$sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD));
        return (SubLObject)cache.NIL;
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
        me = (SubLFile)new cache();
        cache.$dtp_cache$ = null;
        cache.$dtp_cache_entry$ = null;
        cache.$print_cache_elementsP$ = null;
        cache.$cache_entries_preallocateP$ = null;
        cache.$cfasl_opcode_cache$ = null;
        cache.$print_cache_valuesP$ = null;
        $sym0$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym1$CACHE_P = SubLObjectFactory.makeSymbol("CACHE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-ENTRY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("MAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD-ENTRY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-HEAD-ENTRY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-HEAD-ENTRY"));
        $sym6$CACHE_PRINT = SubLObjectFactory.makeSymbol("CACHE-PRINT");
        $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CACHE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-P"));
        $sym9$CACHE_CAPACITY = SubLObjectFactory.makeSymbol("CACHE-CAPACITY");
        $sym10$_CSETF_CACHE_CAPACITY = SubLObjectFactory.makeSymbol("_CSETF-CACHE-CAPACITY");
        $sym11$CACHE_MAP = SubLObjectFactory.makeSymbol("CACHE-MAP");
        $sym12$_CSETF_CACHE_MAP = SubLObjectFactory.makeSymbol("_CSETF-CACHE-MAP");
        $sym13$CACHE_HEAD_ENTRY = SubLObjectFactory.makeSymbol("CACHE-HEAD-ENTRY");
        $sym14$_CSETF_CACHE_HEAD_ENTRY = SubLObjectFactory.makeSymbol("_CSETF-CACHE-HEAD-ENTRY");
        $kw15$CAPACITY = SubLObjectFactory.makeKeyword("CAPACITY");
        $kw16$MAP = SubLObjectFactory.makeKeyword("MAP");
        $kw17$HEAD_ENTRY = SubLObjectFactory.makeKeyword("HEAD-ENTRY");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_CACHE = SubLObjectFactory.makeSymbol("MAKE-CACHE");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD");
        $sym24$CACHE_ENTRY = SubLObjectFactory.makeSymbol("CACHE-ENTRY");
        $sym25$CACHE_ENTRY_P = SubLObjectFactory.makeSymbol("CACHE-ENTRY-P");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEWER"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OLDER"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEWER"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("OLDER"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRY-NEWER"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRY-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRY-OLDER"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-NEWER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-OLDER"));
        $sym30$CACHE_ENTRY_PRINT = SubLObjectFactory.makeSymbol("CACHE-ENTRY-PRINT");
        $sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRY-P"));
        $sym33$CACHE_ENTRY_NEWER = SubLObjectFactory.makeSymbol("CACHE-ENTRY-NEWER");
        $sym34$_CSETF_CACHE_ENTRY_NEWER = SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-NEWER");
        $sym35$CACHE_ENTRY_KEY = SubLObjectFactory.makeSymbol("CACHE-ENTRY-KEY");
        $sym36$_CSETF_CACHE_ENTRY_KEY = SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-KEY");
        $sym37$CACHE_ENTRY_VALUE = SubLObjectFactory.makeSymbol("CACHE-ENTRY-VALUE");
        $sym38$_CSETF_CACHE_ENTRY_VALUE = SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-VALUE");
        $sym39$CACHE_ENTRY_OLDER = SubLObjectFactory.makeSymbol("CACHE-ENTRY-OLDER");
        $sym40$_CSETF_CACHE_ENTRY_OLDER = SubLObjectFactory.makeSymbol("_CSETF-CACHE-ENTRY-OLDER");
        $kw41$NEWER = SubLObjectFactory.makeKeyword("NEWER");
        $kw42$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw43$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw44$OLDER = SubLObjectFactory.makeKeyword("OLDER");
        $sym45$MAKE_CACHE_ENTRY = SubLObjectFactory.makeSymbol("MAKE-CACHE-ENTRY");
        $sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD");
        $str47$__CACHE_ = SubLObjectFactory.makeString("#<CACHE/");
        $str48$_ = SubLObjectFactory.makeString("/");
        $str49$_ = SubLObjectFactory.makeString("(");
        $str50$__ = SubLObjectFactory.makeString(", ");
        $str51$___ = SubLObjectFactory.makeString("...");
        $str52$_ = SubLObjectFactory.makeString(")");
        $str53$_ = SubLObjectFactory.makeString(">");
        $sym54$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym55$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $kw56$RESOURCED = SubLObjectFactory.makeKeyword("RESOURCED");
        $kw57$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("NEWEST"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDER"));
        $kw60$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw61$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw62$NEWEST = SubLObjectFactory.makeKeyword("NEWEST");
        $sym63$CACHE_VAR = SubLObjectFactory.makeUninternedSymbol("CACHE-VAR");
        $sym64$ORDER_VAR = SubLObjectFactory.makeUninternedSymbol("ORDER-VAR");
        $sym65$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym66$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym67$DO_CACHE_FIRST = SubLObjectFactory.makeSymbol("DO-CACHE-FIRST");
        $sym68$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym69$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym70$DO_CACHE_DONE_ = SubLObjectFactory.makeSymbol("DO-CACHE-DONE?");
        $sym71$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym72$DO_CACHE_KEY = SubLObjectFactory.makeSymbol("DO-CACHE-KEY");
        $sym73$DO_CACHE_VALUE = SubLObjectFactory.makeSymbol("DO-CACHE-VALUE");
        $sym74$DO_CACHE_NEXT = SubLObjectFactory.makeSymbol("DO-CACHE-NEXT");
        $kw75$OLDEST = SubLObjectFactory.makeKeyword("OLDEST");
        $sym76$DO_CACHE = SubLObjectFactory.makeSymbol("DO-CACHE");
        $str77$_S_was_not_either__NEWEST_or__OLD = SubLObjectFactory.makeString("~S was not either :NEWEST or :OLDEST");
        $sym78$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym79$CACHE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("CACHE-ITERATOR-DONE");
        $sym80$CACHE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CACHE-ITERATOR-NEXT");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-ENTRY"));
        $sym82$CACHE_CONTENT_ITERATOR_DONE = SubLObjectFactory.makeSymbol("CACHE-CONTENT-ITERATOR-DONE");
        $sym83$CACHE_CONTENT_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CACHE-CONTENT-ITERATOR-NEXT");
        $int84$63 = SubLObjectFactory.makeInteger(63);
        $sym85$CFASL_INPUT_CACHE = SubLObjectFactory.makeSymbol("CFASL-INPUT-CACHE");
        $sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-CACHE-METHOD");
        $str87$____ = SubLObjectFactory.makeString(" -> ");
        $int88$100 = SubLObjectFactory.makeInteger(100);
        $sym89$_ = SubLObjectFactory.makeSymbol(">");
        $sym90$CDR = SubLObjectFactory.makeSymbol("CDR");
        $float91$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str92$Content_iterator__A_was_exhausted = SubLObjectFactory.makeString("Content iterator ~A was exhausted at item ~A before the entry iterator ~A!");
        $str93$The_content_iterator_at_item__A_s = SubLObjectFactory.makeString("The content iterator at item ~A suggests key ~A, but the entry iterator says ~A.");
        $str94$The_content_iterator_at_item__A_s = SubLObjectFactory.makeString("The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A.");
        $str95$The_content_iterator__A_is_not_ex = SubLObjectFactory.makeString("The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done.");
        $str96$The_two_iterators_do_not_seem_to_ = SubLObjectFactory.makeString("The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A.");
    }
    
    public static final class $cache_native extends SubLStructNative
    {
        public SubLObject $capacity;
        public SubLObject $map;
        public SubLObject $head_entry;
        private static final SubLStructDeclNative structDecl;
        
        public $cache_native() {
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$head_entry = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cache_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$cache_native.class, cache.$sym0$CACHE, cache.$sym1$CACHE_P, cache.$list2, cache.$list3, new String[] { "$capacity", "$map", "$head_entry" }, cache.$list4, cache.$list5, cache.$sym6$CACHE_PRINT);
        }
    }
    
    public static final class $cache_p$UnaryFunction extends UnaryFunction
    {
        public $cache_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CACHE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cache.cache_p(arg1);
        }
    }
    
    public static final class $cache_entry_native extends SubLStructNative
    {
        public SubLObject $newer;
        public SubLObject $key;
        public SubLObject $value;
        public SubLObject $older;
        private static final SubLStructDeclNative structDecl;
        
        public $cache_entry_native() {
            this.$newer = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$value = (SubLObject)CommonSymbols.NIL;
            this.$older = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cache_entry_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$cache_entry_native.class, cache.$sym24$CACHE_ENTRY, cache.$sym25$CACHE_ENTRY_P, cache.$list26, cache.$list27, new String[] { "$newer", "$key", "$value", "$older" }, cache.$list28, cache.$list29, cache.$sym30$CACHE_ENTRY_PRINT);
        }
    }
    
    public static final class $cache_entry_p$UnaryFunction extends UnaryFunction
    {
        public $cache_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CACHE-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cache.cache_entry_p(arg1);
        }
    }
}

/*

	Total time: 307 ms
	
*/