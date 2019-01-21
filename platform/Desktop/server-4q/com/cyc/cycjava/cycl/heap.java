package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class heap extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.heap";
    public static final String myFingerPrint = "2ac8f164f1526d5c3a6a7a4cad1f7ac922f3f00f5ad725279cfd15bdc5ff455f";
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLSymbol $dtp_heap_impl$;
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2719L)
    private static SubLSymbol $empty_heap_element$;
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2796L)
    private static SubLSymbol $heap_root_index$;
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLSymbol $dtp_heap_test_example$;
    private static final SubLSymbol $sym0$HEAP_IMPL;
    private static final SubLSymbol $sym1$HEAP_IMPL_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_HEAP_IMPL;
    private static final SubLSymbol $sym7$HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$HEAP_IMPL_NEXT;
    private static final SubLSymbol $sym10$_CSETF_HEAP_IMPL_NEXT;
    private static final SubLSymbol $sym11$HEAP_IMPL_NODES;
    private static final SubLSymbol $sym12$_CSETF_HEAP_IMPL_NODES;
    private static final SubLSymbol $sym13$HEAP_IMPL_PREDICATE;
    private static final SubLSymbol $sym14$_CSETF_HEAP_IMPL_PREDICATE;
    private static final SubLSymbol $sym15$HEAP_IMPL_KEY;
    private static final SubLSymbol $sym16$_CSETF_HEAP_IMPL_KEY;
    private static final SubLSymbol $kw17$NEXT;
    private static final SubLSymbol $kw18$NODES;
    private static final SubLSymbol $kw19$PREDICATE;
    private static final SubLSymbol $kw20$KEY;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_HEAP_IMPL;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_HEAP_IMPL_METHOD;
    private static final SubLSymbol $sym27$_EMPTY_HEAP_ELEMENT_;
    private static final SubLString $str28$Empty_Heap_Element;
    private static final SubLSymbol $sym29$__;
    private static final SubLString $str30$HEAP_;
    private static final SubLString $str31$_of_key_;
    private static final SubLString $str32$_;
    private static final SubLString $str33$_;
    private static final SubLSymbol $sym34$FIXNUMP;
    private static final SubLSymbol $sym35$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym36$HEAP_P;
    private static final SubLSymbol $sym37$__;
    private static final SubLString $str38$The_heap__A_is_full__must_remove_;
    private static final SubLString $str39$Cannot_remove_an_item_from_empty_;
    private static final SubLSymbol $sym40$HEAP_ITERATOR_DONE;
    private static final SubLSymbol $sym41$HEAP_ITERATOR_NEXT;
    private static final SubLSymbol $kw42$EXPAND;
    private static final SubLSymbol $kw43$SHOW;
    private static final SubLString $str44$Error_in_heap_iterator__iterator_;
    private static final SubLString $str45$Invalid_sate_transition__unknown_;
    private static final SubLList $list46;
    private static final SubLString $str47$Error__stack_underflow_during_hea;
    private static final SubLString $str48$Error_in_heap_iterator_state_;
    private static final SubLSymbol $sym49$HEAP_UNIT_TEST_INSERT_REMOVE;
    private static final SubLSymbol $kw50$TEST;
    private static final SubLSymbol $kw51$OWNER;
    private static final SubLSymbol $kw52$CLASSES;
    private static final SubLSymbol $kw53$KB;
    private static final SubLSymbol $kw54$TINY;
    private static final SubLSymbol $kw55$WORKING_;
    private static final SubLList $list56;
    private static final SubLString $str57$The_heap_is_not_empty_after_creat;
    private static final SubLString $str58$The_heap_is_not_full_after_popula;
    private static final SubLString $str59$Cannot_find_element__A_in_the_hea;
    private static final SubLString $str60$Cannot_determine_index_of_element;
    private static final SubLString $str61$The_heap_and_the_vector_disagree_;
    private static final SubLString $str62$The_heap_is_not_empty_after_remov;
    private static final SubLSymbol $kw63$SUCCESS;
    private static final SubLSymbol $sym64$HEAP_UNIT_TEST_SORTING;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$CHAR_CODE;
    private static final SubLSymbol $sym67$_;
    private static final SubLString $str68$Heap__A_and_reference_string__A_d;
    private static final SubLSymbol $sym69$HEAP_UNIT_TEST_PRIORITIZING;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$HEAP_TEST_EXAMPLE;
    private static final SubLSymbol $sym72$HEAP_TEST_EXAMPLE_P;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$PRINT_HEAP_TEST_EXAMPLE;
    private static final SubLSymbol $sym78$HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$HEAP_TEST_EXAMPLE_PRIORITY;
    private static final SubLSymbol $sym81$_CSETF_HEAP_TEST_EXAMPLE_PRIORITY;
    private static final SubLSymbol $sym82$HEAP_TEST_EXAMPLE_VALUE;
    private static final SubLSymbol $sym83$_CSETF_HEAP_TEST_EXAMPLE_VALUE;
    private static final SubLSymbol $kw84$PRIORITY;
    private static final SubLSymbol $kw85$VALUE;
    private static final SubLSymbol $sym86$MAKE_HEAP_TEST_EXAMPLE;
    private static final SubLSymbol $sym87$VISIT_DEFSTRUCT_OBJECT_HEAP_TEST_EXAMPLE_METHOD;
    private static final SubLString $str88$_priority_;
    private static final SubLString $str89$_value_;
    private static final SubLSymbol $sym90$NUMBERP;
    private static final SubLSymbol $kw91$COPYRIGHT_NOTICE;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$FAILURE;
    private static final SubLSymbol $sym94$GET_HEAP_TEST_EXAMPLE_PRIORITY;
    private static final SubLString $str95$Doing_a__A_heap_of_size__D_on_str;
    private static final SubLString $str96$min;
    private static final SubLString $str97$max;
    private static final SubLString $str98$_A_lost_and_left_;
    private static final SubLString $str99$Adding__A_to_heap____elements_;
    private static final SubLString $str100$Changing_the_priority_of__A_from_;
    private static final SubLString $str101$__;
    private static final SubLString $str102$__;
    private static final SubLString $str103$The_heap_is_not_in_proper_order__;
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_impl(v_object, stream, (SubLObject)heap.ZERO_INTEGER);
        return (SubLObject)heap.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $heap_impl_native.class) ? heap.T : heap.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_next(final SubLObject v_object) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_nodes(final SubLObject v_object) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_predicate(final SubLObject v_object) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject heap_impl_key(final SubLObject v_object) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject _csetf_heap_impl_next(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject _csetf_heap_impl_nodes(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject _csetf_heap_impl_predicate(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject _csetf_heap_impl_key(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_impl_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject make_heap_impl(SubLObject arglist) {
        if (arglist == heap.UNPROVIDED) {
            arglist = (SubLObject)heap.NIL;
        }
        final SubLObject v_new = (SubLObject)new $heap_impl_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)heap.NIL, next = arglist; heap.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)heap.$kw17$NEXT)) {
                _csetf_heap_impl_next(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)heap.$kw18$NODES)) {
                _csetf_heap_impl_nodes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)heap.$kw19$PREDICATE)) {
                _csetf_heap_impl_predicate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)heap.$kw20$KEY)) {
                _csetf_heap_impl_key(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)heap.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject visit_defstruct_heap_impl(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw22$BEGIN, (SubLObject)heap.$sym23$MAKE_HEAP_IMPL, (SubLObject)heap.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw17$NEXT, heap_impl_next(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw18$NODES, heap_impl_nodes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw19$PREDICATE, heap_impl_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw20$KEY, heap_impl_key(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw25$END, (SubLObject)heap.$sym23$MAKE_HEAP_IMPL, (SubLObject)heap.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2465L)
    public static SubLObject visit_defstruct_object_heap_impl_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_heap_impl(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2905L)
    public static SubLObject is_empty_heap_elementP(final SubLObject item) {
        return Equality.eq(heap.$empty_heap_element$.getGlobalValue(), item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 2992L)
    public static SubLObject new_heap_impl(final SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == heap.UNPROVIDED) {
            predicate = Symbols.symbol_function((SubLObject)heap.$sym29$__);
        }
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        final SubLObject v_heap = make_heap_impl((SubLObject)heap.UNPROVIDED);
        _csetf_heap_impl_next(v_heap, heap.$heap_root_index$.getGlobalValue());
        _csetf_heap_impl_nodes(v_heap, Vectors.make_vector(size, heap.$empty_heap_element$.getGlobalValue()));
        _csetf_heap_impl_predicate(v_heap, predicate);
        _csetf_heap_impl_key(v_heap, key);
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 3338L)
    public static SubLObject clone_existing_heap(final SubLObject old_heap) {
        final SubLObject v_heap = make_heap_impl((SubLObject)heap.UNPROVIDED);
        _csetf_heap_impl_next(v_heap, heap_impl_next(old_heap));
        _csetf_heap_impl_predicate(v_heap, heap_impl_predicate(old_heap));
        _csetf_heap_impl_key(v_heap, heap_impl_key(old_heap));
        _csetf_heap_impl_nodes(v_heap, Sequences.copy_seq(heap_impl_nodes(old_heap)));
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 3700L)
    public static SubLObject print_heap_impl(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (heap.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)heap.NIL, (SubLObject)heap.NIL);
            print_high.princ((SubLObject)heap.$str30$HEAP_, stream);
            print_high.princ(heap_impl_predicate(v_object), stream);
            final SubLObject key = heap_impl_key(v_object);
            if (!key.eql(Symbols.symbol_function((SubLObject)heap.IDENTITY)) && key != heap.IDENTITY) {
                streams_high.write_string((SubLObject)heap.$str31$_of_key_, stream, (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
                print_high.princ(key, stream);
            }
            streams_high.write_string((SubLObject)heap.$str32$_, stream, (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
            print_high.princ(heap_count(v_object), stream);
            streams_high.write_string((SubLObject)heap.$str33$_, stream, (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
            print_high.princ(heap_size(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)heap.T, (SubLObject)heap.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 4237L)
    public static SubLObject create_heap(final SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == heap.UNPROVIDED) {
            predicate = Symbols.symbol_function((SubLObject)heap.$sym29$__);
        }
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        assert heap.NIL != Types.fixnump(size) : size;
        assert heap.NIL != Types.function_spec_p(predicate) : predicate;
        assert heap.NIL != Types.function_spec_p(key) : key;
        return new_heap_impl(Numbers.add(size, (SubLObject)heap.ONE_INTEGER), predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 4583L)
    public static SubLObject clear_heap(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject nodes = heap_impl_nodes(v_heap);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(nodes), i = (SubLObject)heap.NIL, i = (SubLObject)heap.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)heap.ONE_INTEGER)) {
            Vectors.set_aref(nodes, i, heap.$empty_heap_element$.getGlobalValue());
        }
        _csetf_heap_impl_next(v_heap, heap.$heap_root_index$.getGlobalValue());
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 4880L)
    public static SubLObject clone_heap(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return clone_existing_heap(v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 4977L)
    public static SubLObject heap_p(final SubLObject v_object) {
        return heap_impl_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5039L)
    public static SubLObject heap_size(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return Numbers.subtract(Sequences.length(heap_impl_nodes(v_heap)), (SubLObject)heap.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5197L)
    public static SubLObject heap_count(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return Numbers.subtract(heap_impl_next(v_heap), (SubLObject)heap.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5346L)
    public static SubLObject heap_predicate(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return heap_impl_predicate(v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5447L)
    public static SubLObject heap_key(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return heap_impl_key(v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5536L)
    public static SubLObject apply_heap_predicate(final SubLObject v_heap, final SubLObject key1, final SubLObject key2) {
        return Functions.funcall(heap_impl_predicate(v_heap), key1, key2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5650L)
    public static SubLObject apply_heap_key(final SubLObject v_heap, final SubLObject v_object) {
        return Functions.funcall(heap_impl_key(v_heap), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5745L)
    public static SubLObject heap_is_empty_p(final SubLObject v_heap) {
        return Numbers.zerop(heap_count(v_heap));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5870L)
    public static SubLObject heap_is_full_p(final SubLObject v_heap) {
        return Numbers.numE(heap_count(v_heap), heap_size(v_heap));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 5956L)
    public static SubLObject create_max_heap(final SubLObject size, SubLObject key) {
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        return create_heap(size, Symbols.symbol_function((SubLObject)heap.$sym29$__), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6112L)
    public static SubLObject create_min_heap(final SubLObject size, SubLObject key) {
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        return create_heap(size, Symbols.symbol_function((SubLObject)heap.$sym37$__), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6215L)
    public static SubLObject heap_insert(final SubLObject element, final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        if (heap.NIL != heap_is_full_p(v_heap)) {
            Errors.error((SubLObject)heap.$str38$The_heap__A_is_full__must_remove_, v_heap);
        }
        final SubLObject spot = heap_impl_next(v_heap);
        _csetf_heap_impl_next(v_heap, Numbers.add(heap_impl_next(v_heap), (SubLObject)heap.ONE_INTEGER));
        Vectors.set_aref(heap_impl_nodes(v_heap), spot, element);
        heap_bubble_up(v_heap, spot);
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6612L)
    public static SubLObject heap_enqueue(final SubLObject element, final SubLObject v_heap) {
        return heap_insert(element, v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6727L)
    public static SubLObject heap_peek(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        if (heap.NIL != heap_is_empty_p(v_heap)) {
            return (SubLObject)heap.NIL;
        }
        return heap_root(v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6860L)
    public static SubLObject heap_dequeue(final SubLObject v_heap) {
        return heap_remove(v_heap);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 6960L)
    public static SubLObject heap_remove(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        if (heap.NIL != heap_is_empty_p(v_heap)) {
            Errors.error((SubLObject)heap.$str39$Cannot_remove_an_item_from_empty_, v_heap);
        }
        final SubLObject element = heap_root(v_heap);
        final SubLObject replacement = heap_delete_last(v_heap);
        if (heap.NIL == heap_is_empty_p(v_heap)) {
            set_heap_root(v_heap, replacement);
            heap_trickle_down(v_heap, heap.$heap_root_index$.getGlobalValue());
        }
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 7345L)
    public static SubLObject heap_find(final SubLObject item, final SubLObject v_heap, SubLObject test, SubLObject key) {
        if (test == heap.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)heap.EQL);
        }
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return Sequences.find(item, heap_nodes, test, key, heap.$heap_root_index$.getGlobalValue(), last_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 7688L)
    public static SubLObject heap_reconsider(final SubLObject item, final SubLObject v_heap, final SubLObject old_item_key, SubLObject test) {
        if (test == heap.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)heap.EQUAL);
        }
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject spot = heap_find_spot_of_element(v_heap, item, old_item_key, test, (SubLObject)heap.UNPROVIDED);
        if (heap.NIL != spot) {
            final SubLObject new_item_key = apply_heap_key(v_heap, item);
            if (heap.NIL != apply_heap_predicate(v_heap, old_item_key, new_item_key)) {
                heap_reconsider_bubble_up(v_heap, spot);
            }
            else {
                heap_reconsider_trickle_down(v_heap, spot);
            }
        }
        return list_utilities.sublisp_boolean(spot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 8646L)
    public static SubLObject heap_find_spot(final SubLObject item, final SubLObject v_heap, final SubLObject test, final SubLObject key) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return Sequences.position(item, heap_nodes, test, key, heap.$heap_root_index$.getGlobalValue(), last_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 8867L)
    public static SubLObject heap_reconsider_trickle_down(final SubLObject v_heap, final SubLObject spot) {
        return heap_trickle_down(v_heap, spot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 8966L)
    public static SubLObject heap_reconsider_bubble_up(final SubLObject v_heap, final SubLObject spot) {
        return heap_bubble_up(v_heap, spot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 9057L)
    public static SubLObject new_heap_iterator(final SubLObject v_heap, SubLObject reverse_orderP) {
        if (reverse_orderP == heap.UNPROVIDED) {
            reverse_orderP = (SubLObject)heap.NIL;
        }
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return iteration.new_iterator(make_heap_iterator_state(v_heap, list_utilities.sublisp_boolean(reverse_orderP)), (SubLObject)heap.$sym40$HEAP_ITERATOR_DONE, (SubLObject)heap.$sym41$HEAP_ITERATOR_NEXT, (SubLObject)heap.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 9428L)
    public static SubLObject make_heap_iterator_state(final SubLObject v_heap, final SubLObject reverse_orderP) {
        SubLObject state = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        final SubLObject stack_pointer = (SubLObject)heap.ZERO_INTEGER;
        if (heap.NIL == heap_is_empty_p(v_heap)) {
            final SubLObject max_depth = Numbers.multiply((SubLObject)heap.THREE_INTEGER, Numbers.ceiling(Numbers.log(heap_count(v_heap), (SubLObject)heap.TWO_INTEGER), (SubLObject)heap.UNPROVIDED));
            node_stack = Vectors.make_vector(max_depth, (SubLObject)heap.UNPROVIDED);
            action_stack = Vectors.make_vector(max_depth, (SubLObject)heap.UNPROVIDED);
        }
        state = (SubLObject)ConsesLow.list(stack_pointer, action_stack, node_stack, v_heap, reverse_orderP);
        if (heap.NIL == heap_is_empty_p(v_heap)) {
            push_heap_iterator_stack(state, (SubLObject)heap.$kw42$EXPAND, heap.$heap_root_index$.getGlobalValue());
            expand_heap_iterator_stack(state);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 10114L)
    public static SubLObject heap_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.$kw43$SHOW != top_heap_iterator_stack_action(state)) {
            Errors.error((SubLObject)heap.$str44$Error_in_heap_iterator__iterator_);
        }
        final SubLObject node = top_heap_iterator_stack_node(state);
        pop_heap_iterator_stack(state);
        expand_heap_iterator_stack(state);
        return Values.values(node, state, (SubLObject)heap.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 10512L)
    public static SubLObject expand_heap_iterator_stack(final SubLObject state) {
        for (SubLObject stack_pointer = ConsesLow.nth((SubLObject)heap.ZERO_INTEGER, state); !stack_pointer.isZero(); stack_pointer = ConsesLow.nth((SubLObject)heap.ZERO_INTEGER, state)) {
            final SubLObject action = top_heap_iterator_stack_action(state);
            if (action == heap.$kw43$SHOW) {
                return state;
            }
            if (action != heap.$kw42$EXPAND) {
                Errors.error((SubLObject)heap.$str45$Invalid_sate_transition__unknown_, action);
            }
            expand_current_heap_iterator_stack_top(state);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 11134L)
    public static SubLObject expand_current_heap_iterator_stack_top(final SubLObject state) {
        SubLObject stack_pointer = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject v_heap = (SubLObject)heap.NIL;
        SubLObject reverse_orderP = (SubLObject)heap.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)heap.$list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        action_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        node_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        v_heap = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (heap.NIL == current) {
            final SubLObject count = heap_count(v_heap);
            final SubLObject curr_node_index = top_heap_iterator_stack_node_index(state);
            pop_heap_iterator_stack(state);
            SubLObject first_child = (SubLObject)heap.NIL;
            SubLObject second_child = (SubLObject)heap.NIL;
            final SubLObject l_child = Numbers.add(curr_node_index, curr_node_index);
            final SubLObject r_child = Numbers.add(l_child, (SubLObject)heap.ONE_INTEGER);
            first_child = ((heap.NIL != reverse_orderP) ? r_child : l_child);
            second_child = ((heap.NIL != reverse_orderP) ? l_child : r_child);
            if (second_child.numLE(count)) {
                push_heap_iterator_stack(state, (SubLObject)heap.$kw42$EXPAND, second_child);
            }
            if (first_child.numLE(count)) {
                push_heap_iterator_stack(state, (SubLObject)heap.$kw42$EXPAND, first_child);
            }
            push_heap_iterator_stack(state, (SubLObject)heap.$kw43$SHOW, curr_node_index);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)heap.$list46);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 12160L)
    public static SubLObject push_heap_iterator_stack(final SubLObject state, final SubLObject command, final SubLObject node) {
        SubLObject stack_pointer = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject v_heap = (SubLObject)heap.NIL;
        SubLObject reverse_orderP = (SubLObject)heap.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)heap.$list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        action_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        node_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        v_heap = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (heap.NIL == current) {
            Vectors.set_aref(action_stack, stack_pointer, command);
            Vectors.set_aref(node_stack, stack_pointer, node);
            stack_pointer = Numbers.add(stack_pointer, (SubLObject)heap.ONE_INTEGER);
            ConsesLow.set_nth((SubLObject)heap.ZERO_INTEGER, state, stack_pointer);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)heap.$list46);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 12542L)
    public static SubLObject pop_heap_iterator_stack(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject v_heap = (SubLObject)heap.NIL;
        SubLObject reverse_orderP = (SubLObject)heap.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)heap.$list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        action_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        node_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        v_heap = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (heap.NIL == current) {
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stack_pointer.isPositive()) {
                Errors.error((SubLObject)heap.$str47$Error__stack_underflow_during_hea);
            }
            Vectors.set_aref(action_stack, stack_pointer, (SubLObject)heap.NIL);
            Vectors.set_aref(node_stack, stack_pointer, (SubLObject)heap.NIL);
            stack_pointer = Numbers.subtract(stack_pointer, (SubLObject)heap.ONE_INTEGER);
            ConsesLow.set_nth((SubLObject)heap.ZERO_INTEGER, state, stack_pointer);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)heap.$list46);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 13005L)
    public static SubLObject top_heap_iterator_stack_action(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject v_heap = (SubLObject)heap.NIL;
        SubLObject reverse_orderP = (SubLObject)heap.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)heap.$list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        action_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        node_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        v_heap = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (heap.NIL == current) {
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stack_pointer.isPositive()) {
                Errors.error((SubLObject)heap.$str47$Error__stack_underflow_during_hea);
            }
            return Vectors.aref(action_stack, Numbers.subtract(stack_pointer, (SubLObject)heap.ONE_INTEGER));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)heap.$list46);
        return (SubLObject)heap.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 13342L)
    public static SubLObject top_heap_iterator_stack_node_index(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = (SubLObject)heap.NIL;
        SubLObject action_stack = (SubLObject)heap.NIL;
        SubLObject node_stack = (SubLObject)heap.NIL;
        SubLObject v_heap = (SubLObject)heap.NIL;
        SubLObject reverse_orderP = (SubLObject)heap.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)heap.$list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        action_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        node_stack = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        v_heap = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)heap.$list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (heap.NIL == current) {
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stack_pointer.isPositive()) {
                Errors.error((SubLObject)heap.$str47$Error__stack_underflow_during_hea);
            }
            return Vectors.aref(node_stack, Numbers.subtract(stack_pointer, (SubLObject)heap.ONE_INTEGER));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)heap.$list46);
        return (SubLObject)heap.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 13680L)
    public static SubLObject top_heap_iterator_stack_node(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_index = top_heap_iterator_stack_node_index(state);
        final SubLObject v_heap = ConsesLow.nth((SubLObject)heap.THREE_INTEGER, state);
        if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.NIL == heap_p(v_heap)) {
            Errors.error((SubLObject)heap.$str48$Error_in_heap_iterator_state_);
        }
        final SubLObject nodes = heap_impl_nodes(v_heap);
        return Vectors.aref(nodes, node_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 13976L)
    public static SubLObject heap_iterator_done(final SubLObject state) {
        final SubLObject stack_pointer = ConsesLow.nth((SubLObject)heap.ZERO_INTEGER, state);
        return Numbers.zerop(stack_pointer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 14103L)
    public static SubLObject heap_keys(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject keys = (SubLObject)heap.NIL;
        while (heap.NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            keys = (SubLObject)ConsesLow.cons(Functions.funcall(heap_key(clone), item), keys);
        }
        return Sequences.nreverse(keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 14455L)
    public static SubLObject heap_keys_fast(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        return Mapping.mapcar(heap_key(v_heap), heap_elements_fast(v_heap));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 14701L)
    public static SubLObject heap_elements_fast(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject payload = heap_impl_nodes(v_heap);
        final SubLObject end_index = heap_impl_next(v_heap);
        SubLObject elements = (SubLObject)heap.NIL;
        final SubLObject vector_var = payload;
        final SubLObject backwardP_var = (SubLObject)heap.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject elem_num;
        SubLObject item;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)heap.NIL, v_iteration = (SubLObject)heap.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)heap.ONE_INTEGER)) {
            elem_num = ((heap.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)heap.ONE_INTEGER) : v_iteration);
            item = Vectors.aref(vector_var, elem_num);
            if (heap.$heap_root_index$.getGlobalValue().numLE(elem_num) && elem_num.numL(end_index)) {
                elements = (SubLObject)ConsesLow.cons(item, elements);
            }
        }
        return Sequences.nreverse(elements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 15142L)
    public static SubLObject heap_elements(final SubLObject v_heap) {
        assert heap.NIL != heap_p(v_heap) : v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject elements = (SubLObject)heap.NIL;
        while (heap.NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            elements = (SubLObject)ConsesLow.cons(item, elements);
        }
        return Sequences.nreverse(elements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 15485L)
    public static SubLObject heap_root(final SubLObject v_heap) {
        return Vectors.aref(heap_impl_nodes(v_heap), heap.$heap_root_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 15772L)
    public static SubLObject set_heap_root(final SubLObject v_heap, final SubLObject element) {
        return Vectors.set_aref(heap_impl_nodes(v_heap), heap.$heap_root_index$.getGlobalValue(), element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 15887L)
    public static SubLObject heap_delete_last(final SubLObject v_heap) {
        final SubLObject last = Numbers.subtract(heap_impl_next(v_heap), (SubLObject)heap.ONE_INTEGER);
        final SubLObject element = Vectors.aref(heap_impl_nodes(v_heap), last);
        Vectors.set_aref(heap_impl_nodes(v_heap), last, heap.$empty_heap_element$.getGlobalValue());
        _csetf_heap_impl_next(v_heap, last);
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 16199L)
    public static SubLObject heap_bubble_up(final SubLObject v_heap, SubLObject spot) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject element = Vectors.aref(heap_nodes, spot);
        for (SubLObject element_key = apply_heap_key(v_heap, element), parent = Numbers.integerDivide(spot, (SubLObject)heap.TWO_INTEGER), parent_key = (SubLObject)(parent.isPositive() ? apply_heap_key(v_heap, Vectors.aref(heap_nodes, parent)) : heap.NIL); parent.isPositive() && heap.NIL != apply_heap_predicate(v_heap, parent_key, element_key); parent = Numbers.integerDivide(spot, (SubLObject)heap.TWO_INTEGER), parent_key = (SubLObject)(parent.isPositive() ? apply_heap_key(v_heap, Vectors.aref(heap_nodes, parent)) : heap.NIL)) {
            Vectors.set_aref(heap_nodes, spot, Vectors.aref(heap_nodes, parent));
            spot = parent;
        }
        Vectors.set_aref(heap_nodes, spot, element);
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 17212L)
    public static SubLObject heap_trickle_down(final SubLObject v_heap, SubLObject spot) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject element = Vectors.aref(heap_nodes, spot);
        final SubLObject element_key = apply_heap_key(v_heap, element);
        final SubLObject heap_count = heap_impl_next(v_heap);
        final SubLObject heap_middle = Numbers.integerDivide(heap_count, (SubLObject)heap.TWO_INTEGER);
        SubLObject doneP = (SubLObject)heap.NIL;
        while (spot.numLE(heap_middle) && heap.NIL == doneP) {
            SubLObject child = Numbers.add(spot, spot);
            if (child.numL(heap_count)) {
                SubLObject child_value;
                final SubLObject left_child_value = child_value = Vectors.aref(heap_nodes, child);
                SubLObject child_key;
                final SubLObject left_child_key = child_key = apply_heap_key(v_heap, left_child_value);
                final SubLObject right_child = Numbers.add(child, (SubLObject)heap.ONE_INTEGER);
                if (right_child.numL(heap_count)) {
                    final SubLObject right_child_value = Vectors.aref(heap_nodes, right_child);
                    if (heap.NIL == is_empty_heap_elementP(right_child_value)) {
                        final SubLObject right_child_key = apply_heap_key(v_heap, right_child_value);
                        if (heap.NIL != apply_heap_predicate(v_heap, left_child_key, right_child_key) && !left_child_key.equal(right_child_key)) {
                            child = right_child;
                            child_value = right_child_value;
                            child_key = right_child_key;
                        }
                    }
                }
                if (heap.NIL != apply_heap_predicate(v_heap, element_key, child_key)) {
                    Vectors.set_aref(heap_nodes, spot, child_value);
                    spot = child;
                }
                else {
                    doneP = (SubLObject)heap.T;
                }
            }
            else {
                doneP = (SubLObject)heap.T;
            }
        }
        Vectors.set_aref(heap_nodes, spot, element);
        return v_heap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 19317L)
    public static SubLObject heap_find_spot_of_element(final SubLObject v_heap, final SubLObject element, final SubLObject old_element_key, SubLObject test, SubLObject spot) {
        if (test == heap.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)heap.EQUAL);
        }
        if (spot == heap.UNPROVIDED) {
            spot = heap.$heap_root_index$.getGlobalValue();
        }
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject heap_count = heap_impl_next(v_heap);
        final SubLObject current = Vectors.aref(heap_nodes, spot);
        if (heap.NIL != Functions.funcall(test, element, current)) {
            return spot;
        }
        if (heap.NIL == apply_heap_predicate(v_heap, old_element_key, apply_heap_key(v_heap, current))) {
            return (SubLObject)heap.NIL;
        }
        final SubLObject left_child = Numbers.add(spot, spot);
        if (!left_child.numL(heap_count)) {
            return (SubLObject)heap.NIL;
        }
        final SubLObject location = heap_find_spot_of_element(v_heap, element, old_element_key, test, left_child);
        if (heap.NIL != location) {
            return location;
        }
        final SubLObject right_child = Numbers.add((SubLObject)heap.ONE_INTEGER, left_child);
        if (right_child.numL(heap_count)) {
            return heap_find_spot_of_element(v_heap, element, old_element_key, test, right_child);
        }
        return (SubLObject)heap.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 21742L)
    public static SubLObject heap_unit_test_insert_remove(final SubLObject size, SubLObject predicate, SubLObject key, SubLObject transformer) {
        if (predicate == heap.UNPROVIDED) {
            predicate = Symbols.symbol_function((SubLObject)heap.$sym29$__);
        }
        if (key == heap.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        if (transformer == heap.UNPROVIDED) {
            transformer = Symbols.symbol_function((SubLObject)heap.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vector = Vectors.make_vector(size, (SubLObject)heap.UNPROVIDED);
        final SubLObject v_heap = create_heap(size, predicate, key);
        if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.NIL == heap_is_empty_p(v_heap)) {
            Errors.error((SubLObject)heap.$str57$The_heap_is_not_empty_after_creat);
        }
        SubLObject i;
        SubLObject number;
        SubLObject value;
        for (i = (SubLObject)heap.NIL, i = (SubLObject)heap.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)heap.ONE_INTEGER)) {
            number = random.random(size);
            value = Functions.funcall(transformer, number);
            Vectors.set_aref(vector, i, value);
            heap_insert(value, v_heap);
        }
        if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.NIL == heap_is_full_p(v_heap)) {
            Errors.error((SubLObject)heap.$str58$The_heap_is_not_full_after_popula);
        }
        final SubLObject vector_var = vector;
        final SubLObject backwardP_var = (SubLObject)heap.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject var;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)heap.NIL, v_iteration = (SubLObject)heap.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)heap.ONE_INTEGER)) {
            element_num = ((heap.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)heap.ONE_INTEGER) : v_iteration);
            var = Vectors.aref(vector_var, element_num);
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.NIL == heap_find(var, v_heap, Symbols.symbol_function((SubLObject)heap.EQUAL), (SubLObject)heap.UNPROVIDED)) {
                Errors.error((SubLObject)heap.$str59$Cannot_find_element__A_in_the_hea, var);
            }
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !heap_find_spot_of_element(v_heap, var, Functions.funcall(key, var), (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED).isFixnum()) {
                Errors.error((SubLObject)heap.$str60$Cannot_determine_index_of_element, var);
            }
        }
        vector = Sort.sort(vector, predicate, key);
        SubLObject element;
        for (i = (SubLObject)heap.NIL, i = (SubLObject)heap.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)heap.ONE_INTEGER)) {
            element = heap_remove(v_heap);
            if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !element.equal(Vectors.aref(vector, Numbers.subtract(size, i, (SubLObject)heap.ONE_INTEGER)))) {
                Errors.error((SubLObject)heap.$str61$The_heap_and_the_vector_disagree_, i, Vectors.aref(vector, i), element);
            }
        }
        if (heap.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && heap.NIL == heap_is_empty_p(v_heap)) {
            Errors.error((SubLObject)heap.$str62$The_heap_is_not_empty_after_remov);
        }
        return (SubLObject)heap.$kw63$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 23294L)
    public static SubLObject heap_unit_test_sorting(final SubLObject string) {
        final SubLObject v_heap = create_min_heap(Sequences.length(string), Symbols.symbol_function((SubLObject)heap.$sym66$CHAR_CODE));
        final SubLObject reference_string = Sort.sort(string_utilities.copy_string(string), Symbols.symbol_function((SubLObject)heap.$sym67$_), Symbols.symbol_function((SubLObject)heap.$sym66$CHAR_CODE));
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = (end_var_$1 = Sequences.length(string)), char_num = (SubLObject)heap.NIL, char_num = (SubLObject)heap.ZERO_INTEGER; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(string, char_num);
            heap_enqueue(curr, v_heap);
        }
        SubLObject index = (SubLObject)heap.ZERO_INTEGER;
        final SubLObject string_var = reference_string;
        SubLObject end_var_$2;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject v_char;
        SubLObject curr2;
        for (end_var2 = (end_var_$2 = Sequences.length(string_var)), char_num2 = (SubLObject)heap.NIL, char_num2 = (SubLObject)heap.ZERO_INTEGER; !char_num2.numGE(end_var_$2); char_num2 = number_utilities.f_1X(char_num2)) {
            v_char = Strings.sublisp_char(string_var, char_num2);
            curr2 = heap_remove(v_heap);
            if (heap.NIL == Characters.charE(v_char, curr2)) {
                Errors.warn((SubLObject)heap.$str68$Heap__A_and_reference_string__A_d, v_heap, reference_string, index);
                return (SubLObject)heap.NIL;
            }
            index = Numbers.add(index, (SubLObject)heap.ONE_INTEGER);
        }
        return (SubLObject)heap.$kw63$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject heap_test_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_test_example(v_object, stream, (SubLObject)heap.ZERO_INTEGER);
        return (SubLObject)heap.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject heap_test_example_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $heap_test_example_native.class) ? heap.T : heap.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject heap_test_example_priority(final SubLObject v_object) {
        assert heap.NIL != heap_test_example_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject heap_test_example_value(final SubLObject v_object) {
        assert heap.NIL != heap_test_example_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject _csetf_heap_test_example_priority(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_test_example_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject _csetf_heap_test_example_value(final SubLObject v_object, final SubLObject value) {
        assert heap.NIL != heap_test_example_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject make_heap_test_example(SubLObject arglist) {
        if (arglist == heap.UNPROVIDED) {
            arglist = (SubLObject)heap.NIL;
        }
        final SubLObject v_new = (SubLObject)new $heap_test_example_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)heap.NIL, next = arglist; heap.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)heap.$kw84$PRIORITY)) {
                _csetf_heap_test_example_priority(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)heap.$kw85$VALUE)) {
                _csetf_heap_test_example_value(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)heap.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject visit_defstruct_heap_test_example(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw22$BEGIN, (SubLObject)heap.$sym86$MAKE_HEAP_TEST_EXAMPLE, (SubLObject)heap.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw84$PRIORITY, heap_test_example_priority(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw24$SLOT, (SubLObject)heap.$kw85$VALUE, heap_test_example_value(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)heap.$kw25$END, (SubLObject)heap.$sym86$MAKE_HEAP_TEST_EXAMPLE, (SubLObject)heap.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24244L)
    public static SubLObject visit_defstruct_object_heap_test_example_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_heap_test_example(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24351L)
    public static SubLObject print_heap_test_example(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (heap.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)heap.T, (SubLObject)heap.T);
            streams_high.write_string((SubLObject)heap.$str88$_priority_, stream, (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
            print_high.princ(get_heap_test_example_priority(v_object), stream);
            streams_high.write_string((SubLObject)heap.$str89$_value_, stream, (SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
            print_high.princ(get_heap_test_example_value(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)heap.T, (SubLObject)heap.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24701L)
    public static SubLObject get_heap_test_example_priority(final SubLObject heap_test_example) {
        assert heap.NIL != heap_test_example_p(heap_test_example) : heap_test_example;
        return heap_test_example_priority(heap_test_example);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 24877L)
    public static SubLObject change_heap_test_example_priority(final SubLObject heap_test_example, final SubLObject new_priority) {
        assert heap.NIL != heap_test_example_p(heap_test_example) : heap_test_example;
        _csetf_heap_test_example_priority(heap_test_example, new_priority);
        return heap_test_example_priority(heap_test_example);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 25139L)
    public static SubLObject get_heap_test_example_value(final SubLObject heap_test_example) {
        assert heap.NIL != heap_test_example_p(heap_test_example) : heap_test_example;
        return heap_test_example_value(heap_test_example);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 25309L)
    public static SubLObject new_heap_test_example(final SubLObject priority, final SubLObject value) {
        assert heap.NIL != Types.numberp(priority) : priority;
        final SubLObject example = make_heap_test_example((SubLObject)heap.UNPROVIDED);
        _csetf_heap_test_example_priority(example, priority);
        _csetf_heap_test_example_value(example, value);
        return example;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 25573L)
    public static SubLObject heap_unit_test_prioritizing(final SubLObject base_string, SubLObject verboseP) {
        if (verboseP == heap.UNPROVIDED) {
            verboseP = (SubLObject)heap.NIL;
        }
        if (base_string == heap.$kw91$COPYRIGHT_NOTICE) {
            return heap_unit_test_prioritizing(misc_utilities.kb_content_copyright_notice(), verboseP);
        }
        final SubLObject sizes = (SubLObject)heap.$list92;
        final SubLObject strings = (SubLObject)ConsesLow.list(base_string, Sequences.reverse(base_string));
        final SubLObject min_max_list = (SubLObject)ConsesLow.list((SubLObject)heap.T, (SubLObject)heap.NIL);
        SubLObject result = (SubLObject)heap.NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)heap.NIL;
        string = cdolist_list_var.first();
        while (heap.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = sizes;
            SubLObject size = (SubLObject)heap.NIL;
            size = cdolist_list_var_$3.first();
            while (heap.NIL != cdolist_list_var_$3) {
                SubLObject cdolist_list_var_$4 = min_max_list;
                SubLObject minP = (SubLObject)heap.NIL;
                minP = cdolist_list_var_$4.first();
                while (heap.NIL != cdolist_list_var_$4) {
                    result = heap_unit_test_priorities(string, size, verboseP, minP);
                    if (!result.eql(size)) {
                        return (SubLObject)heap.$kw93$FAILURE;
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    minP = cdolist_list_var_$4.first();
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                size = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return (SubLObject)heap.$kw63$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 26187L)
    public static SubLObject heap_unit_test_priorities(final SubLObject string, final SubLObject size, SubLObject verboseP, SubLObject minP) {
        if (verboseP == heap.UNPROVIDED) {
            verboseP = (SubLObject)heap.NIL;
        }
        if (minP == heap.UNPROVIDED) {
            minP = (SubLObject)heap.T;
        }
        final SubLObject char_map = dictionary.new_dictionary((SubLObject)heap.UNPROVIDED, (SubLObject)heap.UNPROVIDED);
        final SubLObject v_heap = (heap.NIL != minP) ? create_min_heap(size, Symbols.symbol_function((SubLObject)heap.$sym94$GET_HEAP_TEST_EXAMPLE_PRIORITY)) : create_max_heap(size, Symbols.symbol_function((SubLObject)heap.$sym94$GET_HEAP_TEST_EXAMPLE_PRIORITY));
        if (heap.NIL != verboseP) {
            Errors.warn((SubLObject)heap.$str95$Doing_a__A_heap_of_size__D_on_str, (SubLObject)((heap.NIL != minP) ? heap.$str96$min : heap.$str97$max), size, string);
        }
        SubLObject end_var_$5;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        SubLObject map_entry;
        SubLObject loser;
        SubLObject old_priority;
        SubLObject new_priority;
        SubLObject old_state;
        SubLObject stream;
        SubLObject _prev_bind_0;
        SubLObject _values;
        for (end_var = (end_var_$5 = Sequences.length(string)), char_num = (SubLObject)heap.NIL, char_num = (SubLObject)heap.ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            map_entry = dictionary.dictionary_lookup(char_map, v_char, (SubLObject)heap.UNPROVIDED);
            if (heap.NIL == map_entry) {
                map_entry = new_heap_test_example((SubLObject)((heap.NIL != minP) ? heap.ONE_INTEGER : size), v_char);
                dictionary.dictionary_enter(char_map, v_char, map_entry);
                if (heap.NIL != heap_is_full_p(v_heap)) {
                    loser = heap_remove(v_heap);
                    dictionary.dictionary_remove(char_map, heap_test_example_value(loser));
                    if (heap.NIL != verboseP) {
                        Errors.warn((SubLObject)heap.$str98$_A_lost_and_left_, loser);
                    }
                }
                heap_enqueue(map_entry, v_heap);
                if (heap.NIL != verboseP) {
                    Errors.warn((SubLObject)heap.$str99$Adding__A_to_heap____elements_, map_entry, heap_count(v_heap));
                }
            }
            else {
                old_priority = get_heap_test_example_priority(map_entry);
                new_priority = ((heap.NIL != minP) ? Numbers.add(old_priority, (SubLObject)heap.ONE_INTEGER) : Numbers.subtract(old_priority, (SubLObject)heap.ONE_INTEGER));
                old_state = (SubLObject)heap.NIL;
                stream = (SubLObject)heap.NIL;
                try {
                    stream = streams_high.make_private_string_output_stream();
                    print_high.princ(heap_elements_fast(v_heap), stream);
                    old_state = streams_high.get_output_stream_string(stream);
                }
                finally {
                    _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)heap.T);
                        _values = Values.getValuesAsVector();
                        streams_high.close(stream, (SubLObject)heap.UNPROVIDED);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
                change_heap_test_example_priority(map_entry, new_priority);
                if (heap.NIL == heap_reconsider(map_entry, v_heap, old_priority, (SubLObject)heap.UNPROVIDED) && heap.NIL != verboseP) {
                    Errors.error((SubLObject)heap.$str100$Changing_the_priority_of__A_from_, new SubLObject[] { map_entry, old_priority, new_priority, old_state, heap_elements_fast(v_heap) });
                }
            }
            heap_unit_test_priorities_still_orderedP(v_heap, minP);
        }
        return size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/heap.lisp", position = 28100L)
    public static SubLObject heap_unit_test_priorities_still_orderedP(final SubLObject original_heap, SubLObject minP) {
        if (minP == heap.UNPROVIDED) {
            minP = (SubLObject)heap.T;
        }
        final SubLObject v_heap;
        final SubLObject clone = v_heap = clone_heap(original_heap);
        final SubLObject comparator = (heap.NIL != minP) ? Symbols.symbol_function((SubLObject)heap.$sym29$__) : Symbols.symbol_function((SubLObject)heap.$sym37$__);
        final SubLObject comparator_name = (SubLObject)((heap.NIL != minP) ? heap.$str101$__ : heap.$str102$__);
        SubLObject previous_priority = (heap.NIL != minP) ? Numbers.$most_negative_fixnum$.getGlobalValue() : Numbers.$most_positive_fixnum$.getGlobalValue();
        while (heap.NIL == heap_is_empty_p(v_heap)) {
            final SubLObject map_entry = heap_remove(v_heap);
            final SubLObject priority = get_heap_test_example_priority(map_entry);
            if (heap.NIL == Functions.funcall(comparator, previous_priority, priority)) {
                Errors.error((SubLObject)heap.$str103$The_heap_is_not_in_proper_order__, new SubLObject[] { previous_priority, comparator_name, priority, heap_elements_fast(original_heap) });
            }
            previous_priority = priority;
        }
        return (SubLObject)heap.T;
    }
    
    public static SubLObject declare_heap_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_print_function_trampoline", "HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_p", "HEAP-IMPL-P", 1, 0, false);
        new $heap_impl_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_next", "HEAP-IMPL-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_nodes", "HEAP-IMPL-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_predicate", "HEAP-IMPL-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_impl_key", "HEAP-IMPL-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_impl_next", "_CSETF-HEAP-IMPL-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_impl_nodes", "_CSETF-HEAP-IMPL-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_impl_predicate", "_CSETF-HEAP-IMPL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_impl_key", "_CSETF-HEAP-IMPL-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "make_heap_impl", "MAKE-HEAP-IMPL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "visit_defstruct_heap_impl", "VISIT-DEFSTRUCT-HEAP-IMPL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "visit_defstruct_object_heap_impl_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-IMPL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "is_empty_heap_elementP", "IS-EMPTY-HEAP-ELEMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "new_heap_impl", "NEW-HEAP-IMPL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "clone_existing_heap", "CLONE-EXISTING-HEAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "print_heap_impl", "PRINT-HEAP-IMPL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "create_heap", "CREATE-HEAP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "clear_heap", "CLEAR-HEAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "clone_heap", "CLONE-HEAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_p", "HEAP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_size", "HEAP-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_count", "HEAP-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_predicate", "HEAP-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_key", "HEAP-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "apply_heap_predicate", "APPLY-HEAP-PREDICATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "apply_heap_key", "APPLY-HEAP-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_is_empty_p", "HEAP-IS-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_is_full_p", "HEAP-IS-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "create_max_heap", "CREATE-MAX-HEAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "create_min_heap", "CREATE-MIN-HEAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_insert", "HEAP-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_enqueue", "HEAP-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_peek", "HEAP-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_dequeue", "HEAP-DEQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_remove", "HEAP-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_find", "HEAP-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_reconsider", "HEAP-RECONSIDER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_find_spot", "HEAP-FIND-SPOT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_reconsider_trickle_down", "HEAP-RECONSIDER-TRICKLE-DOWN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_reconsider_bubble_up", "HEAP-RECONSIDER-BUBBLE-UP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "new_heap_iterator", "NEW-HEAP-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "make_heap_iterator_state", "MAKE-HEAP-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_iterator_next", "HEAP-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "expand_heap_iterator_stack", "EXPAND-HEAP-ITERATOR-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "expand_current_heap_iterator_stack_top", "EXPAND-CURRENT-HEAP-ITERATOR-STACK-TOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "push_heap_iterator_stack", "PUSH-HEAP-ITERATOR-STACK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "pop_heap_iterator_stack", "POP-HEAP-ITERATOR-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "top_heap_iterator_stack_action", "TOP-HEAP-ITERATOR-STACK-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "top_heap_iterator_stack_node_index", "TOP-HEAP-ITERATOR-STACK-NODE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "top_heap_iterator_stack_node", "TOP-HEAP-ITERATOR-STACK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_iterator_done", "HEAP-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_keys", "HEAP-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_keys_fast", "HEAP-KEYS-FAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_elements_fast", "HEAP-ELEMENTS-FAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_elements", "HEAP-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_root", "HEAP-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "set_heap_root", "SET-HEAP-ROOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_delete_last", "HEAP-DELETE-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_bubble_up", "HEAP-BUBBLE-UP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_trickle_down", "HEAP-TRICKLE-DOWN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_find_spot_of_element", "HEAP-FIND-SPOT-OF-ELEMENT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_unit_test_insert_remove", "HEAP-UNIT-TEST-INSERT-REMOVE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_unit_test_sorting", "HEAP-UNIT-TEST-SORTING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_test_example_print_function_trampoline", "HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_test_example_p", "HEAP-TEST-EXAMPLE-P", 1, 0, false);
        new $heap_test_example_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_test_example_priority", "HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_test_example_value", "HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_test_example_priority", "_CSETF-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "_csetf_heap_test_example_value", "_CSETF-HEAP-TEST-EXAMPLE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "make_heap_test_example", "MAKE-HEAP-TEST-EXAMPLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "visit_defstruct_heap_test_example", "VISIT-DEFSTRUCT-HEAP-TEST-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "visit_defstruct_object_heap_test_example_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-TEST-EXAMPLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "print_heap_test_example", "PRINT-HEAP-TEST-EXAMPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "get_heap_test_example_priority", "GET-HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "change_heap_test_example_priority", "CHANGE-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "get_heap_test_example_value", "GET-HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "new_heap_test_example", "NEW-HEAP-TEST-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_unit_test_prioritizing", "HEAP-UNIT-TEST-PRIORITIZING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_unit_test_priorities", "HEAP-UNIT-TEST-PRIORITIES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.heap", "heap_unit_test_priorities_still_orderedP", "HEAP-UNIT-TEST-PRIORITIES-STILL-ORDERED?", 1, 1, false);
        return (SubLObject)heap.NIL;
    }
    
    public static SubLObject init_heap_file() {
        heap.$dtp_heap_impl$ = SubLFiles.defconstant("*DTP-HEAP-IMPL*", (SubLObject)heap.$sym0$HEAP_IMPL);
        heap.$empty_heap_element$ = SubLFiles.deflexical("*EMPTY-HEAP-ELEMENT*", (heap.NIL != Symbols.boundp((SubLObject)heap.$sym27$_EMPTY_HEAP_ELEMENT_)) ? heap.$empty_heap_element$.getGlobalValue() : Symbols.make_symbol((SubLObject)heap.$str28$Empty_Heap_Element));
        heap.$heap_root_index$ = SubLFiles.deflexical("*HEAP-ROOT-INDEX*", (SubLObject)heap.ONE_INTEGER);
        heap.$dtp_heap_test_example$ = SubLFiles.defconstant("*DTP-HEAP-TEST-EXAMPLE*", (SubLObject)heap.$sym71$HEAP_TEST_EXAMPLE);
        return (SubLObject)heap.NIL;
    }
    
    public static SubLObject setup_heap_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), heap.$dtp_heap_impl$.getGlobalValue(), Symbols.symbol_function((SubLObject)heap.$sym7$HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)heap.$list8);
        Structures.def_csetf((SubLObject)heap.$sym9$HEAP_IMPL_NEXT, (SubLObject)heap.$sym10$_CSETF_HEAP_IMPL_NEXT);
        Structures.def_csetf((SubLObject)heap.$sym11$HEAP_IMPL_NODES, (SubLObject)heap.$sym12$_CSETF_HEAP_IMPL_NODES);
        Structures.def_csetf((SubLObject)heap.$sym13$HEAP_IMPL_PREDICATE, (SubLObject)heap.$sym14$_CSETF_HEAP_IMPL_PREDICATE);
        Structures.def_csetf((SubLObject)heap.$sym15$HEAP_IMPL_KEY, (SubLObject)heap.$sym16$_CSETF_HEAP_IMPL_KEY);
        Equality.identity((SubLObject)heap.$sym0$HEAP_IMPL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), heap.$dtp_heap_impl$.getGlobalValue(), Symbols.symbol_function((SubLObject)heap.$sym26$VISIT_DEFSTRUCT_OBJECT_HEAP_IMPL_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)heap.$sym27$_EMPTY_HEAP_ELEMENT_);
        generic_testing.define_test_case_table_int((SubLObject)heap.$sym49$HEAP_UNIT_TEST_INSERT_REMOVE, (SubLObject)ConsesLow.list(new SubLObject[] { heap.$kw50$TEST, heap.NIL, heap.$kw51$OWNER, heap.NIL, heap.$kw52$CLASSES, heap.NIL, heap.$kw53$KB, heap.$kw54$TINY, heap.$kw55$WORKING_, heap.T }), (SubLObject)heap.$list56);
        generic_testing.define_test_case_table_int((SubLObject)heap.$sym64$HEAP_UNIT_TEST_SORTING, (SubLObject)ConsesLow.list(new SubLObject[] { heap.$kw50$TEST, heap.NIL, heap.$kw51$OWNER, heap.NIL, heap.$kw52$CLASSES, heap.NIL, heap.$kw53$KB, heap.$kw54$TINY, heap.$kw55$WORKING_, heap.T }), (SubLObject)heap.$list65);
        generic_testing.define_test_case_table_int((SubLObject)heap.$sym69$HEAP_UNIT_TEST_PRIORITIZING, (SubLObject)ConsesLow.list(new SubLObject[] { heap.$kw50$TEST, heap.NIL, heap.$kw51$OWNER, heap.NIL, heap.$kw52$CLASSES, heap.NIL, heap.$kw53$KB, heap.$kw54$TINY, heap.$kw55$WORKING_, heap.T }), (SubLObject)heap.$list70);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), heap.$dtp_heap_test_example$.getGlobalValue(), Symbols.symbol_function((SubLObject)heap.$sym78$HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)heap.$list79);
        Structures.def_csetf((SubLObject)heap.$sym80$HEAP_TEST_EXAMPLE_PRIORITY, (SubLObject)heap.$sym81$_CSETF_HEAP_TEST_EXAMPLE_PRIORITY);
        Structures.def_csetf((SubLObject)heap.$sym82$HEAP_TEST_EXAMPLE_VALUE, (SubLObject)heap.$sym83$_CSETF_HEAP_TEST_EXAMPLE_VALUE);
        Equality.identity((SubLObject)heap.$sym71$HEAP_TEST_EXAMPLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), heap.$dtp_heap_test_example$.getGlobalValue(), Symbols.symbol_function((SubLObject)heap.$sym87$VISIT_DEFSTRUCT_OBJECT_HEAP_TEST_EXAMPLE_METHOD));
        return (SubLObject)heap.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_heap_file();
    }
    
    @Override
	public void initializeVariables() {
        init_heap_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_heap_file();
    }
    
    static {
        me = (SubLFile)new heap();
        heap.$dtp_heap_impl$ = null;
        heap.$empty_heap_element$ = null;
        heap.$heap_root_index$ = null;
        heap.$dtp_heap_test_example$ = null;
        $sym0$HEAP_IMPL = SubLObjectFactory.makeSymbol("HEAP-IMPL");
        $sym1$HEAP_IMPL_P = SubLObjectFactory.makeSymbol("HEAP-IMPL-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEXT"), (SubLObject)SubLObjectFactory.makeKeyword("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAP-IMPL-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-IMPL-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-IMPL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-IMPL-KEY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-KEY"));
        $sym6$PRINT_HEAP_IMPL = SubLObjectFactory.makeSymbol("PRINT-HEAP-IMPL");
        $sym7$HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-IMPL-P"));
        $sym9$HEAP_IMPL_NEXT = SubLObjectFactory.makeSymbol("HEAP-IMPL-NEXT");
        $sym10$_CSETF_HEAP_IMPL_NEXT = SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-NEXT");
        $sym11$HEAP_IMPL_NODES = SubLObjectFactory.makeSymbol("HEAP-IMPL-NODES");
        $sym12$_CSETF_HEAP_IMPL_NODES = SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-NODES");
        $sym13$HEAP_IMPL_PREDICATE = SubLObjectFactory.makeSymbol("HEAP-IMPL-PREDICATE");
        $sym14$_CSETF_HEAP_IMPL_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-PREDICATE");
        $sym15$HEAP_IMPL_KEY = SubLObjectFactory.makeSymbol("HEAP-IMPL-KEY");
        $sym16$_CSETF_HEAP_IMPL_KEY = SubLObjectFactory.makeSymbol("_CSETF-HEAP-IMPL-KEY");
        $kw17$NEXT = SubLObjectFactory.makeKeyword("NEXT");
        $kw18$NODES = SubLObjectFactory.makeKeyword("NODES");
        $kw19$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw20$KEY = SubLObjectFactory.makeKeyword("KEY");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_HEAP_IMPL = SubLObjectFactory.makeSymbol("MAKE-HEAP-IMPL");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_HEAP_IMPL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HEAP-IMPL-METHOD");
        $sym27$_EMPTY_HEAP_ELEMENT_ = SubLObjectFactory.makeSymbol("*EMPTY-HEAP-ELEMENT*");
        $str28$Empty_Heap_Element = SubLObjectFactory.makeString("Empty Heap Element");
        $sym29$__ = SubLObjectFactory.makeSymbol("<=");
        $str30$HEAP_ = SubLObjectFactory.makeString("HEAP ");
        $str31$_of_key_ = SubLObjectFactory.makeString(" of key ");
        $str32$_ = SubLObjectFactory.makeString(" ");
        $str33$_ = SubLObjectFactory.makeString("/");
        $sym34$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $sym35$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym36$HEAP_P = SubLObjectFactory.makeSymbol("HEAP-P");
        $sym37$__ = SubLObjectFactory.makeSymbol(">=");
        $str38$The_heap__A_is_full__must_remove_ = SubLObjectFactory.makeString("The heap ~A is full; must remove item before insert.");
        $str39$Cannot_remove_an_item_from_empty_ = SubLObjectFactory.makeString("Cannot remove an item from empty heap ~A.");
        $sym40$HEAP_ITERATOR_DONE = SubLObjectFactory.makeSymbol("HEAP-ITERATOR-DONE");
        $sym41$HEAP_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("HEAP-ITERATOR-NEXT");
        $kw42$EXPAND = SubLObjectFactory.makeKeyword("EXPAND");
        $kw43$SHOW = SubLObjectFactory.makeKeyword("SHOW");
        $str44$Error_in_heap_iterator__iterator_ = SubLObjectFactory.makeString("Error in heap iterator: iterator-next called without :SHOW on top.");
        $str45$Invalid_sate_transition__unknown_ = SubLObjectFactory.makeString("Invalid sate transition: unknown code ~A on action stack in heap iterator.");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-STACK"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-STACK"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE-ORDER?"));
        $str47$Error__stack_underflow_during_hea = SubLObjectFactory.makeString("Error: stack underflow during heap iteration.");
        $str48$Error_in_heap_iterator_state_ = SubLObjectFactory.makeString("Error in heap iterator state.");
        $sym49$HEAP_UNIT_TEST_INSERT_REMOVE = SubLObjectFactory.makeSymbol("HEAP-UNIT-TEST-INSERT-REMOVE");
        $kw50$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw51$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw52$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw53$KB = SubLObjectFactory.makeKeyword("KB");
        $kw54$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw55$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)heap.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)heap.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str57$The_heap_is_not_empty_after_creat = SubLObjectFactory.makeString("The heap is not empty after creation.");
        $str58$The_heap_is_not_full_after_popula = SubLObjectFactory.makeString("The heap is not full after population");
        $str59$Cannot_find_element__A_in_the_hea = SubLObjectFactory.makeString("Cannot find element ~A in the heap.");
        $str60$Cannot_determine_index_of_element = SubLObjectFactory.makeString("Cannot determine index of element ~A in the heap.");
        $str61$The_heap_and_the_vector_disagree_ = SubLObjectFactory.makeString("The heap and the vector disagree on priority of item #~A: vector sez ~A, heap sez ~A");
        $str62$The_heap_is_not_empty_after_remov = SubLObjectFactory.makeString("The heap is not empty after removing all");
        $kw63$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym64$HEAP_UNIT_TEST_SORTING = SubLObjectFactory.makeSymbol("HEAP-UNIT-TEST-SORTING");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("asortingexample")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("there was a king who ruled the land his majesty was in command")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("flying flags from every steeple showering silver on the people")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $sym66$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $sym67$_ = SubLObjectFactory.makeSymbol("<");
        $str68$Heap__A_and_reference_string__A_d = SubLObjectFactory.makeString("Heap ~A and reference string ~A differ at position ~D.");
        $sym69$HEAP_UNIT_TEST_PRIORITIZING = SubLObjectFactory.makeSymbol("HEAP-UNIT-TEST-PRIORITIZING");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("asortingexample")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("there was a king who ruled the land his majesty was in command")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("flying flags from every steeple showering silver on the people")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COPYRIGHT-NOTICE")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $sym71$HEAP_TEST_EXAMPLE = SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE");
        $sym72$HEAP_TEST_EXAMPLE_P = SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-P");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIORITY"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-VALUE"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE"));
        $sym77$PRINT_HEAP_TEST_EXAMPLE = SubLObjectFactory.makeSymbol("PRINT-HEAP-TEST-EXAMPLE");
        $sym78$HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-P"));
        $sym80$HEAP_TEST_EXAMPLE_PRIORITY = SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY");
        $sym81$_CSETF_HEAP_TEST_EXAMPLE_PRIORITY = SubLObjectFactory.makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY");
        $sym82$HEAP_TEST_EXAMPLE_VALUE = SubLObjectFactory.makeSymbol("HEAP-TEST-EXAMPLE-VALUE");
        $sym83$_CSETF_HEAP_TEST_EXAMPLE_VALUE = SubLObjectFactory.makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE");
        $kw84$PRIORITY = SubLObjectFactory.makeKeyword("PRIORITY");
        $kw85$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $sym86$MAKE_HEAP_TEST_EXAMPLE = SubLObjectFactory.makeSymbol("MAKE-HEAP-TEST-EXAMPLE");
        $sym87$VISIT_DEFSTRUCT_OBJECT_HEAP_TEST_EXAMPLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HEAP-TEST-EXAMPLE-METHOD");
        $str88$_priority_ = SubLObjectFactory.makeString(" priority ");
        $str89$_value_ = SubLObjectFactory.makeString(" value ");
        $sym90$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $kw91$COPYRIGHT_NOTICE = SubLObjectFactory.makeKeyword("COPYRIGHT-NOTICE");
        $list92 = ConsesLow.list((SubLObject)heap.FIVE_INTEGER, (SubLObject)heap.TEN_INTEGER, (SubLObject)heap.FIFTEEN_INTEGER, (SubLObject)heap.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(25));
        $kw93$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $sym94$GET_HEAP_TEST_EXAMPLE_PRIORITY = SubLObjectFactory.makeSymbol("GET-HEAP-TEST-EXAMPLE-PRIORITY");
        $str95$Doing_a__A_heap_of_size__D_on_str = SubLObjectFactory.makeString("Doing a ~A heap of size ~D on string ~A.~%");
        $str96$min = SubLObjectFactory.makeString("min");
        $str97$max = SubLObjectFactory.makeString("max");
        $str98$_A_lost_and_left_ = SubLObjectFactory.makeString("~A lost and left.");
        $str99$Adding__A_to_heap____elements_ = SubLObjectFactory.makeString("Adding ~A to heap -> elements.");
        $str100$Changing_the_priority_of__A_from_ = SubLObjectFactory.makeString("Changing the priority of ~A from ~D to ~D had no effect on reconsider.~%Prior: ~A~%Current: ~A~%");
        $str101$__ = SubLObjectFactory.makeString("<=");
        $str102$__ = SubLObjectFactory.makeString(">=");
        $str103$The_heap_is_not_in_proper_order__ = SubLObjectFactory.makeString("The heap is not in proper order: ~D is not ~A ~D.~%Heap: ~A");
    }
    
    public static final class $heap_impl_native extends SubLStructNative
    {
        public SubLObject $next;
        public SubLObject $nodes;
        public SubLObject $predicate;
        public SubLObject $key;
        private static final SubLStructDeclNative structDecl;
        
        public $heap_impl_native() {
            this.$next = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$heap_impl_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$next;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$nodes;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$predicate;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$key;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$next = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$nodes = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$predicate = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$key = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$heap_impl_native.class, heap.$sym0$HEAP_IMPL, heap.$sym1$HEAP_IMPL_P, heap.$list2, heap.$list3, new String[] { "$next", "$nodes", "$predicate", "$key" }, heap.$list4, heap.$list5, heap.$sym6$PRINT_HEAP_IMPL);
        }
    }
    
    public static final class $heap_impl_p$UnaryFunction extends UnaryFunction
    {
        public $heap_impl_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HEAP-IMPL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return heap.heap_impl_p(arg1);
        }
    }
    
    public static final class $heap_test_example_native extends SubLStructNative
    {
        public SubLObject $priority;
        public SubLObject $value;
        private static final SubLStructDeclNative structDecl;
        
        public $heap_test_example_native() {
            this.$priority = (SubLObject)CommonSymbols.NIL;
            this.$value = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$heap_test_example_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$priority;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$value;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$priority = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$value = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$heap_test_example_native.class, heap.$sym71$HEAP_TEST_EXAMPLE, heap.$sym72$HEAP_TEST_EXAMPLE_P, heap.$list73, heap.$list74, new String[] { "$priority", "$value" }, heap.$list75, heap.$list76, heap.$sym77$PRINT_HEAP_TEST_EXAMPLE);
        }
    }
    
    public static final class $heap_test_example_p$UnaryFunction extends UnaryFunction
    {
        public $heap_test_example_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HEAP-TEST-EXAMPLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return heap.heap_test_example_p(arg1);
        }
    }
}

/*

	Total time: 362 ms
	
*/