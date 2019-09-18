package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class heap extends SubLTranslatedFile {
    public static final SubLFile me = new heap();

    public static final String myName = "com.cyc.cycjava.cycl.heap";

    public static final String myFingerPrint = "2ac8f164f1526d5c3a6a7a4cad1f7ac922f3f00f5ad725279cfd15bdc5ff455f";

    // defconstant
    public static final SubLSymbol $dtp_heap_impl$ = makeSymbol("*DTP-HEAP-IMPL*");



    // deflexical
    // The position 0 is special and used for insert/delete operations
    private static final SubLSymbol $heap_root_index$ = makeSymbol("*HEAP-ROOT-INDEX*");

    // defconstant
    public static final SubLSymbol $dtp_heap_test_example$ = makeSymbol("*DTP-HEAP-TEST-EXAMPLE*");

    // Internal Constants
    public static final SubLSymbol HEAP_IMPL = makeSymbol("HEAP-IMPL");

    public static final SubLSymbol HEAP_IMPL_P = makeSymbol("HEAP-IMPL-P");

    public static final SubLList $list2 = list(makeSymbol("NEXT"), makeSymbol("NODES"), makeSymbol("PREDICATE"), makeSymbol("KEY"));

    public static final SubLList $list3 = list(makeKeyword("NEXT"), makeKeyword("NODES"), makeKeyword("PREDICATE"), makeKeyword("KEY"));

    public static final SubLList $list4 = list(makeSymbol("HEAP-IMPL-NEXT"), makeSymbol("HEAP-IMPL-NODES"), makeSymbol("HEAP-IMPL-PREDICATE"), makeSymbol("HEAP-IMPL-KEY"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-HEAP-IMPL-NEXT"), makeSymbol("_CSETF-HEAP-IMPL-NODES"), makeSymbol("_CSETF-HEAP-IMPL-PREDICATE"), makeSymbol("_CSETF-HEAP-IMPL-KEY"));

    public static final SubLSymbol PRINT_HEAP_IMPL = makeSymbol("PRINT-HEAP-IMPL");

    public static final SubLSymbol HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HEAP-IMPL-P"));

    private static final SubLSymbol HEAP_IMPL_NEXT = makeSymbol("HEAP-IMPL-NEXT");

    private static final SubLSymbol _CSETF_HEAP_IMPL_NEXT = makeSymbol("_CSETF-HEAP-IMPL-NEXT");

    private static final SubLSymbol HEAP_IMPL_NODES = makeSymbol("HEAP-IMPL-NODES");

    private static final SubLSymbol _CSETF_HEAP_IMPL_NODES = makeSymbol("_CSETF-HEAP-IMPL-NODES");

    private static final SubLSymbol HEAP_IMPL_PREDICATE = makeSymbol("HEAP-IMPL-PREDICATE");

    private static final SubLSymbol _CSETF_HEAP_IMPL_PREDICATE = makeSymbol("_CSETF-HEAP-IMPL-PREDICATE");

    private static final SubLSymbol HEAP_IMPL_KEY = makeSymbol("HEAP-IMPL-KEY");

    private static final SubLSymbol _CSETF_HEAP_IMPL_KEY = makeSymbol("_CSETF-HEAP-IMPL-KEY");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_HEAP_IMPL = makeSymbol("MAKE-HEAP-IMPL");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HEAP_IMPL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HEAP-IMPL-METHOD");

    private static final SubLSymbol $empty_heap_element$ = makeSymbol("*EMPTY-HEAP-ELEMENT*");

    private static final SubLString $$$Empty_Heap_Element = makeString("Empty Heap Element");

    private static final SubLSymbol $sym29$__ = makeSymbol("<=");

    private static final SubLString $$$HEAP_ = makeString("HEAP ");

    private static final SubLString $$$_of_key_ = makeString(" of key ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str33$_ = makeString("/");





    private static final SubLSymbol HEAP_P = makeSymbol("HEAP-P");

    private static final SubLSymbol $sym37$__ = makeSymbol(">=");

    private static final SubLString $str38$The_heap__A_is_full__must_remove_ = makeString("The heap ~A is full; must remove item before insert.");

    private static final SubLString $str39$Cannot_remove_an_item_from_empty_ = makeString("Cannot remove an item from empty heap ~A.");

    private static final SubLSymbol HEAP_ITERATOR_DONE = makeSymbol("HEAP-ITERATOR-DONE");

    private static final SubLSymbol HEAP_ITERATOR_NEXT = makeSymbol("HEAP-ITERATOR-NEXT");





    private static final SubLString $str44$Error_in_heap_iterator__iterator_ = makeString("Error in heap iterator: iterator-next called without :SHOW on top.");

    private static final SubLString $str45$Invalid_sate_transition__unknown_ = makeString("Invalid sate transition: unknown code ~A on action stack in heap iterator.");

    private static final SubLList $list46 = list(makeSymbol("STACK-POINTER"), makeSymbol("ACTION-STACK"), makeSymbol("NODE-STACK"), makeSymbol("HEAP"), makeSymbol("REVERSE-ORDER?"));

    private static final SubLString $str47$Error__stack_underflow_during_hea = makeString("Error: stack underflow during heap iteration.");

    private static final SubLString $str48$Error_in_heap_iterator_state_ = makeString("Error in heap iterator state.");

    private static final SubLSymbol HEAP_UNIT_TEST_INSERT_REMOVE = makeSymbol("HEAP-UNIT-TEST-INSERT-REMOVE");













    private static final SubLList $list56 = list(list(list(ONE_INTEGER), makeKeyword("SUCCESS")), list(list(TEN_INTEGER, makeSymbol("<="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")), list(list(makeInteger(212), makeSymbol(">="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")));

    private static final SubLString $str57$The_heap_is_not_empty_after_creat = makeString("The heap is not empty after creation.");

    private static final SubLString $str58$The_heap_is_not_full_after_popula = makeString("The heap is not full after population");

    private static final SubLString $str59$Cannot_find_element__A_in_the_hea = makeString("Cannot find element ~A in the ");

    private static final SubLString $str60$Cannot_determine_index_of_element = makeString("Cannot determine index of element ~A in the ");

    private static final SubLString $str61$The_heap_and_the_vector_disagree_ = makeString("The heap and the vector disagree on priority of item #~A: vector sez ~A, heap sez ~A");

    private static final SubLString $str62$The_heap_is_not_empty_after_remov = makeString("The heap is not empty after removing all");



    private static final SubLSymbol HEAP_UNIT_TEST_SORTING = makeSymbol("HEAP-UNIT-TEST-SORTING");

    private static final SubLList $list65 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")));

    private static final SubLSymbol CHAR_CODE = makeSymbol("CHAR-CODE");

    private static final SubLSymbol $sym67$_ = makeSymbol("<");

    private static final SubLString $str68$Heap__A_and_reference_string__A_d = makeString("Heap ~A and reference string ~A differ at position ~D.");

    private static final SubLSymbol HEAP_UNIT_TEST_PRIORITIZING = makeSymbol("HEAP-UNIT-TEST-PRIORITIZING");

    private static final SubLList $list70 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")), list(list(makeKeyword("COPYRIGHT-NOTICE")), makeKeyword("SUCCESS")));

    private static final SubLSymbol HEAP_TEST_EXAMPLE = makeSymbol("HEAP-TEST-EXAMPLE");

    private static final SubLSymbol HEAP_TEST_EXAMPLE_P = makeSymbol("HEAP-TEST-EXAMPLE-P");

    public static final SubLList $list73 = list(makeSymbol("PRIORITY"), makeSymbol("VALUE"));

    public static final SubLList $list74 = list(makeKeyword("PRIORITY"), makeKeyword("VALUE"));

    private static final SubLList $list75 = list(makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("HEAP-TEST-EXAMPLE-VALUE"));

    private static final SubLList $list76 = list(makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE"));

    private static final SubLSymbol PRINT_HEAP_TEST_EXAMPLE = makeSymbol("PRINT-HEAP-TEST-EXAMPLE");

    private static final SubLSymbol HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list79 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HEAP-TEST-EXAMPLE-P"));

    private static final SubLSymbol HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY");

    private static final SubLSymbol _CSETF_HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY");

    private static final SubLSymbol HEAP_TEST_EXAMPLE_VALUE = makeSymbol("HEAP-TEST-EXAMPLE-VALUE");

    private static final SubLSymbol _CSETF_HEAP_TEST_EXAMPLE_VALUE = makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE");





    private static final SubLSymbol MAKE_HEAP_TEST_EXAMPLE = makeSymbol("MAKE-HEAP-TEST-EXAMPLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HEAP_TEST_EXAMPLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HEAP-TEST-EXAMPLE-METHOD");

    private static final SubLString $$$_priority_ = makeString(" priority ");

    private static final SubLString $$$_value_ = makeString(" value ");





    private static final SubLList $list92 = list(FIVE_INTEGER, TEN_INTEGER, FIFTEEN_INTEGER, TWENTY_INTEGER, makeInteger(25));



    private static final SubLSymbol GET_HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("GET-HEAP-TEST-EXAMPLE-PRIORITY");

    private static final SubLString $str95$Doing_a__A_heap_of_size__D_on_str = makeString("Doing a ~A heap of size ~D on string ~A.~%");

    private static final SubLString $$$min = makeString("min");

    private static final SubLString $$$max = makeString("max");

    private static final SubLString $str98$_A_lost_and_left_ = makeString("~A lost and left.");

    private static final SubLString $str99$Adding__A_to_heap____elements_ = makeString("Adding ~A to heap -> elements.");

    private static final SubLString $str100$Changing_the_priority_of__A_from_ = makeString("Changing the priority of ~A from ~D to ~D had no effect on reconsider.~%Prior: ~A~%Current: ~A~%");

    private static final SubLString $str101$__ = makeString("<=");

    private static final SubLString $str102$__ = makeString(">=");

    private static final SubLString $str103$The_heap_is_not_in_proper_order__ = makeString("The heap is not in proper order: ~D is not ~A ~D.~%Heap: ~A");

    public static SubLObject heap_impl_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_impl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject heap_impl_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$heap_impl_native.class ? T : NIL;
    }

    public static SubLObject heap_impl_next(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject heap_impl_nodes(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject heap_impl_predicate(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject heap_impl_key(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_heap_impl_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_heap_impl_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_heap_impl_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_heap_impl_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "heap.heap_impl_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_heap_impl(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $heap_impl_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEXT)) {
                _csetf_heap_impl_next(v_new, current_value);
            } else
                if (pcase_var.eql($NODES)) {
                    _csetf_heap_impl_nodes(v_new, current_value);
                } else
                    if (pcase_var.eql($PREDICATE)) {
                        _csetf_heap_impl_predicate(v_new, current_value);
                    } else
                        if (pcase_var.eql($KEY)) {
                            _csetf_heap_impl_key(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_heap_impl(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HEAP_IMPL, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NEXT, heap_impl_next(obj));
        funcall(visitor_fn, obj, $SLOT, $NODES, heap_impl_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, heap_impl_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY, heap_impl_key(obj));
        funcall(visitor_fn, obj, $END, MAKE_HEAP_IMPL, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_heap_impl_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_heap_impl(obj, visitor_fn);
    }

    public static SubLObject is_empty_heap_elementP(final SubLObject item) {
        return eq($empty_heap_element$.getGlobalValue(), item);
    }

    public static SubLObject new_heap_impl(final SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym29$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject v_heap = make_heap_impl(UNPROVIDED);
        _csetf_heap_impl_next(v_heap, $heap_root_index$.getGlobalValue());
        _csetf_heap_impl_nodes(v_heap, make_vector(size, $empty_heap_element$.getGlobalValue()));
        _csetf_heap_impl_predicate(v_heap, predicate);
        _csetf_heap_impl_key(v_heap, key);
        return v_heap;
    }

    public static SubLObject clone_existing_heap(final SubLObject old_heap) {
        final SubLObject v_heap = make_heap_impl(UNPROVIDED);
        _csetf_heap_impl_next(v_heap, heap_impl_next(old_heap));
        _csetf_heap_impl_predicate(v_heap, heap_impl_predicate(old_heap));
        _csetf_heap_impl_key(v_heap, heap_impl_key(old_heap));
        _csetf_heap_impl_nodes(v_heap, copy_seq(heap_impl_nodes(old_heap)));
        return v_heap;
    }

    public static SubLObject print_heap_impl(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, NIL, NIL);
            princ($$$HEAP_, stream);
            princ(heap_impl_predicate(v_object), stream);
            final SubLObject key = heap_impl_key(v_object);
            if ((!key.eql(symbol_function(IDENTITY))) && (key != IDENTITY)) {
                write_string($$$_of_key_, stream, UNPROVIDED, UNPROVIDED);
                princ(key, stream);
            }
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(heap_count(v_object), stream);
            write_string($str33$_, stream, UNPROVIDED, UNPROVIDED);
            princ(heap_size(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject create_heap(final SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym29$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != fixnump(size) : "Types.fixnump(size) " + "CommonSymbols.NIL != Types.fixnump(size) " + size;
        assert NIL != function_spec_p(predicate) : "Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) " + predicate;
        assert NIL != function_spec_p(key) : "Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) " + key;
        return new_heap_impl(add(size, ONE_INTEGER), predicate, key);
    }

    public static SubLObject clear_heap(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject nodes = heap_impl_nodes(v_heap);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(nodes), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            set_aref(nodes, i, $empty_heap_element$.getGlobalValue());
        }
        _csetf_heap_impl_next(v_heap, $heap_root_index$.getGlobalValue());
        return v_heap;
    }

    public static SubLObject clone_heap(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return clone_existing_heap(v_heap);
    }

    public static SubLObject heap_p(final SubLObject v_object) {
        return heap_impl_p(v_object);
    }

    public static SubLObject heap_size(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return subtract(length(heap_impl_nodes(v_heap)), ONE_INTEGER);
    }

    public static SubLObject heap_count(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return subtract(heap_impl_next(v_heap), ONE_INTEGER);
    }

    public static SubLObject heap_predicate(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return heap_impl_predicate(v_heap);
    }

    public static SubLObject heap_key(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return heap_impl_key(v_heap);
    }

    public static SubLObject apply_heap_predicate(final SubLObject v_heap, final SubLObject key1, final SubLObject key2) {
        return funcall(heap_impl_predicate(v_heap), key1, key2);
    }

    public static SubLObject apply_heap_key(final SubLObject v_heap, final SubLObject v_object) {
        return funcall(heap_impl_key(v_heap), v_object);
    }

    public static SubLObject heap_is_empty_p(final SubLObject v_heap) {
        return zerop(heap_count(v_heap));
    }

    public static SubLObject heap_is_full_p(final SubLObject v_heap) {
        return numE(heap_count(v_heap), heap_size(v_heap));
    }

    public static SubLObject create_max_heap(final SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym29$__), key);
    }

    public static SubLObject create_min_heap(final SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym37$__), key);
    }

    public static SubLObject heap_insert(final SubLObject element, final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        if (NIL != heap_is_full_p(v_heap)) {
            Errors.error($str38$The_heap__A_is_full__must_remove_, v_heap);
        }
        final SubLObject spot = heap_impl_next(v_heap);
        _csetf_heap_impl_next(v_heap, add(heap_impl_next(v_heap), ONE_INTEGER));
        set_aref(heap_impl_nodes(v_heap), spot, element);
        heap_bubble_up(v_heap, spot);
        return v_heap;
    }

    public static SubLObject heap_enqueue(final SubLObject element, final SubLObject v_heap) {
        return heap_insert(element, v_heap);
    }

    public static SubLObject heap_peek(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        if (NIL != heap_is_empty_p(v_heap)) {
            return NIL;
        }
        return heap_root(v_heap);
    }

    public static SubLObject heap_dequeue(final SubLObject v_heap) {
        return heap_remove(v_heap);
    }

    public static SubLObject heap_remove(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        if (NIL != heap_is_empty_p(v_heap)) {
            Errors.error($str39$Cannot_remove_an_item_from_empty_, v_heap);
        }
        final SubLObject element = heap_root(v_heap);
        final SubLObject replacement = heap_delete_last(v_heap);
        if (NIL == heap_is_empty_p(v_heap)) {
            set_heap_root(v_heap, replacement);
            heap_trickle_down(v_heap, $heap_root_index$.getGlobalValue());
        }
        return element;
    }

    public static SubLObject heap_find(final SubLObject item, final SubLObject v_heap, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return find(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
    }

    public static SubLObject heap_reconsider(final SubLObject item, final SubLObject v_heap, final SubLObject old_item_key, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject spot = heap_find_spot_of_element(v_heap, item, old_item_key, test, UNPROVIDED);
        if (NIL != spot) {
            final SubLObject new_item_key = apply_heap_key(v_heap, item);
            if (NIL != apply_heap_predicate(v_heap, old_item_key, new_item_key)) {
                heap_reconsider_bubble_up(v_heap, spot);
            } else {
                heap_reconsider_trickle_down(v_heap, spot);
            }
        }
        return list_utilities.sublisp_boolean(spot);
    }

    public static SubLObject heap_find_spot(final SubLObject item, final SubLObject v_heap, final SubLObject test, final SubLObject key) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return position(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
    }

    public static SubLObject heap_reconsider_trickle_down(final SubLObject v_heap, final SubLObject spot) {
        return heap_trickle_down(v_heap, spot);
    }

    public static SubLObject heap_reconsider_bubble_up(final SubLObject v_heap, final SubLObject spot) {
        return heap_bubble_up(v_heap, spot);
    }

    public static SubLObject new_heap_iterator(final SubLObject v_heap, SubLObject reverse_orderP) {
        if (reverse_orderP == UNPROVIDED) {
            reverse_orderP = NIL;
        }
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return iteration.new_iterator(make_heap_iterator_state(v_heap, list_utilities.sublisp_boolean(reverse_orderP)), HEAP_ITERATOR_DONE, HEAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_heap_iterator_state(final SubLObject v_heap, final SubLObject reverse_orderP) {
        SubLObject state = NIL;
        SubLObject node_stack = NIL;
        SubLObject action_stack = NIL;
        final SubLObject stack_pointer = ZERO_INTEGER;
        if (NIL == heap_is_empty_p(v_heap)) {
            final SubLObject max_depth = multiply(THREE_INTEGER, ceiling(log(heap_count(v_heap), TWO_INTEGER), UNPROVIDED));
            node_stack = make_vector(max_depth, UNPROVIDED);
            action_stack = make_vector(max_depth, UNPROVIDED);
        }
        state = list(stack_pointer, action_stack, node_stack, v_heap, reverse_orderP);
        if (NIL == heap_is_empty_p(v_heap)) {
            push_heap_iterator_stack(state, $EXPAND, $heap_root_index$.getGlobalValue());
            expand_heap_iterator_stack(state);
        }
        return state;
    }

    public static SubLObject heap_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SHOW != top_heap_iterator_stack_action(state))) {
            Errors.error($str44$Error_in_heap_iterator__iterator_);
        }
        final SubLObject node = top_heap_iterator_stack_node(state);
        pop_heap_iterator_stack(state);
        expand_heap_iterator_stack(state);
        return values(node, state, NIL);
    }

    public static SubLObject expand_heap_iterator_stack(final SubLObject state) {
        for (SubLObject stack_pointer = nth(ZERO_INTEGER, state); !stack_pointer.isZero(); stack_pointer = nth(ZERO_INTEGER, state)) {
            final SubLObject action = top_heap_iterator_stack_action(state);
            if (action == $SHOW) {
                return state;
            }
            if (action != $EXPAND) {
                Errors.error($str45$Invalid_sate_transition__unknown_, action);
            }
            expand_current_heap_iterator_stack_top(state);
        }
        return state;
    }

    public static SubLObject expand_current_heap_iterator_stack_top(final SubLObject state) {
        SubLObject stack_pointer = NIL;
        SubLObject action_stack = NIL;
        SubLObject node_stack = NIL;
        SubLObject v_heap = NIL;
        SubLObject reverse_orderP = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        action_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        node_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        v_heap = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject count = heap_count(v_heap);
            final SubLObject curr_node_index = top_heap_iterator_stack_node_index(state);
            pop_heap_iterator_stack(state);
            SubLObject first_child = NIL;
            SubLObject second_child = NIL;
            final SubLObject l_child = add(curr_node_index, curr_node_index);
            final SubLObject r_child = add(l_child, ONE_INTEGER);
            first_child = (NIL != reverse_orderP) ? r_child : l_child;
            second_child = (NIL != reverse_orderP) ? l_child : r_child;
            if (second_child.numLE(count)) {
                push_heap_iterator_stack(state, $EXPAND, second_child);
            }
            if (first_child.numLE(count)) {
                push_heap_iterator_stack(state, $EXPAND, first_child);
            }
            push_heap_iterator_stack(state, $SHOW, curr_node_index);
        } else {
            cdestructuring_bind_error(state, $list46);
        }
        return state;
    }

    public static SubLObject push_heap_iterator_stack(final SubLObject state, final SubLObject command, final SubLObject node) {
        SubLObject stack_pointer = NIL;
        SubLObject action_stack = NIL;
        SubLObject node_stack = NIL;
        SubLObject v_heap = NIL;
        SubLObject reverse_orderP = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        action_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        node_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        v_heap = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (NIL == current) {
            set_aref(action_stack, stack_pointer, command);
            set_aref(node_stack, stack_pointer, node);
            stack_pointer = add(stack_pointer, ONE_INTEGER);
            set_nth(ZERO_INTEGER, state, stack_pointer);
        } else {
            cdestructuring_bind_error(state, $list46);
        }
        return state;
    }

    public static SubLObject pop_heap_iterator_stack(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = NIL;
        SubLObject action_stack = NIL;
        SubLObject node_stack = NIL;
        SubLObject v_heap = NIL;
        SubLObject reverse_orderP = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        action_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        node_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        v_heap = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stack_pointer.isPositive())) {
                Errors.error($str47$Error__stack_underflow_during_hea);
            }
            set_aref(action_stack, stack_pointer, NIL);
            set_aref(node_stack, stack_pointer, NIL);
            stack_pointer = subtract(stack_pointer, ONE_INTEGER);
            set_nth(ZERO_INTEGER, state, stack_pointer);
        } else {
            cdestructuring_bind_error(state, $list46);
        }
        return state;
    }

    public static SubLObject top_heap_iterator_stack_action(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = NIL;
        SubLObject action_stack = NIL;
        SubLObject node_stack = NIL;
        SubLObject v_heap = NIL;
        SubLObject reverse_orderP = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        action_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        node_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        v_heap = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stack_pointer.isPositive())) {
                Errors.error($str47$Error__stack_underflow_during_hea);
            }
            return aref(action_stack, subtract(stack_pointer, ONE_INTEGER));
        }
        cdestructuring_bind_error(state, $list46);
        return NIL;
    }

    public static SubLObject top_heap_iterator_stack_node_index(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stack_pointer = NIL;
        SubLObject action_stack = NIL;
        SubLObject node_stack = NIL;
        SubLObject v_heap = NIL;
        SubLObject reverse_orderP = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        stack_pointer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        action_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        node_stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        v_heap = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list46);
        reverse_orderP = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stack_pointer.isPositive())) {
                Errors.error($str47$Error__stack_underflow_during_hea);
            }
            return aref(node_stack, subtract(stack_pointer, ONE_INTEGER));
        }
        cdestructuring_bind_error(state, $list46);
        return NIL;
    }

    public static SubLObject top_heap_iterator_stack_node(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_index = top_heap_iterator_stack_node_index(state);
        final SubLObject v_heap = nth(THREE_INTEGER, state);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == heap_p(v_heap))) {
            Errors.error($str48$Error_in_heap_iterator_state_);
        }
        final SubLObject nodes = heap_impl_nodes(v_heap);
        return aref(nodes, node_index);
    }

    public static SubLObject heap_iterator_done(final SubLObject state) {
        final SubLObject stack_pointer = nth(ZERO_INTEGER, state);
        return zerop(stack_pointer);
    }

    public static SubLObject heap_keys(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject keys = NIL;
        while (NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            keys = cons(funcall(heap_key(clone), item), keys);
        } 
        return nreverse(keys);
    }

    public static SubLObject heap_keys_fast(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        return Mapping.mapcar(heap_key(v_heap), heap_elements_fast(v_heap));
    }

    public static SubLObject heap_elements_fast(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject payload = heap_impl_nodes(v_heap);
        final SubLObject end_index = heap_impl_next(v_heap);
        SubLObject elements = NIL;
        final SubLObject vector_var = payload;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject elem_num;
        SubLObject item;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            elem_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            item = aref(vector_var, elem_num);
            if ($heap_root_index$.getGlobalValue().numLE(elem_num) && elem_num.numL(end_index)) {
                elements = cons(item, elements);
            }
        }
        return nreverse(elements);
    }

    public static SubLObject heap_elements(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) " + v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject elements = NIL;
        while (NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            elements = cons(item, elements);
        } 
        return nreverse(elements);
    }

    public static SubLObject heap_root(final SubLObject v_heap) {
        return aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue());
    }

    public static SubLObject set_heap_root(final SubLObject v_heap, final SubLObject element) {
        return set_aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue(), element);
    }

    public static SubLObject heap_delete_last(final SubLObject v_heap) {
        final SubLObject last = subtract(heap_impl_next(v_heap), ONE_INTEGER);
        final SubLObject element = aref(heap_impl_nodes(v_heap), last);
        set_aref(heap_impl_nodes(v_heap), last, $empty_heap_element$.getGlobalValue());
        _csetf_heap_impl_next(v_heap, last);
        return element;
    }

    public static SubLObject heap_bubble_up(final SubLObject v_heap, SubLObject spot) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject element = aref(heap_nodes, spot);
        for (SubLObject element_key = apply_heap_key(v_heap, element), parent = integerDivide(spot, TWO_INTEGER), parent_key = (parent.isPositive()) ? apply_heap_key(v_heap, aref(heap_nodes, parent)) : NIL; parent.isPositive() && (NIL != apply_heap_predicate(v_heap, parent_key, element_key)); parent = integerDivide(spot, TWO_INTEGER) , parent_key = (parent.isPositive()) ? apply_heap_key(v_heap, aref(heap_nodes, parent)) : NIL) {
            set_aref(heap_nodes, spot, aref(heap_nodes, parent));
            spot = parent;
        }
        set_aref(heap_nodes, spot, element);
        return v_heap;
    }

    public static SubLObject heap_trickle_down(final SubLObject v_heap, SubLObject spot) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject element = aref(heap_nodes, spot);
        final SubLObject element_key = apply_heap_key(v_heap, element);
        final SubLObject heap_count = heap_impl_next(v_heap);
        final SubLObject heap_middle = integerDivide(heap_count, TWO_INTEGER);
        SubLObject doneP = NIL;
        while (spot.numLE(heap_middle) && (NIL == doneP)) {
            SubLObject child = add(spot, spot);
            if (child.numL(heap_count)) {
                SubLObject child_value;
                final SubLObject left_child_value = child_value = aref(heap_nodes, child);
                SubLObject child_key;
                final SubLObject left_child_key = child_key = apply_heap_key(v_heap, left_child_value);
                final SubLObject right_child = add(child, ONE_INTEGER);
                if (right_child.numL(heap_count)) {
                    final SubLObject right_child_value = aref(heap_nodes, right_child);
                    if (NIL == is_empty_heap_elementP(right_child_value)) {
                        final SubLObject right_child_key = apply_heap_key(v_heap, right_child_value);
                        if ((NIL != apply_heap_predicate(v_heap, left_child_key, right_child_key)) && (!left_child_key.equal(right_child_key))) {
                            child = right_child;
                            child_value = right_child_value;
                            child_key = right_child_key;
                        }
                    }
                }
                if (NIL != apply_heap_predicate(v_heap, element_key, child_key)) {
                    set_aref(heap_nodes, spot, child_value);
                    spot = child;
                } else {
                    doneP = T;
                }
            } else {
                doneP = T;
            }
        } 
        set_aref(heap_nodes, spot, element);
        return v_heap;
    }

    public static SubLObject heap_find_spot_of_element(final SubLObject v_heap, final SubLObject element, final SubLObject old_element_key, SubLObject test, SubLObject spot) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (spot == UNPROVIDED) {
            spot = $heap_root_index$.getGlobalValue();
        }
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject heap_count = heap_impl_next(v_heap);
        final SubLObject current = aref(heap_nodes, spot);
        if (NIL != funcall(test, element, current)) {
            return spot;
        }
        if (NIL == apply_heap_predicate(v_heap, old_element_key, apply_heap_key(v_heap, current))) {
            return NIL;
        }
        final SubLObject left_child = add(spot, spot);
        if (!left_child.numL(heap_count)) {
            return NIL;
        }
        final SubLObject location = heap_find_spot_of_element(v_heap, element, old_element_key, test, left_child);
        if (NIL != location) {
            return location;
        }
        final SubLObject right_child = add(ONE_INTEGER, left_child);
        if (right_child.numL(heap_count)) {
            return heap_find_spot_of_element(v_heap, element, old_element_key, test, right_child);
        }
        return NIL;
    }

    public static SubLObject heap_unit_test_insert_remove(final SubLObject size, SubLObject predicate, SubLObject key, SubLObject transformer) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym29$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (transformer == UNPROVIDED) {
            transformer = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vector = make_vector(size, UNPROVIDED);
        final SubLObject v_heap = create_heap(size, predicate, key);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == heap_is_empty_p(v_heap))) {
            Errors.error($str57$The_heap_is_not_empty_after_creat);
        }
        SubLObject i;
        SubLObject number;
        SubLObject value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            number = random.random(size);
            value = funcall(transformer, number);
            set_aref(vector, i, value);
            heap_insert(value, v_heap);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == heap_is_full_p(v_heap))) {
            Errors.error($str58$The_heap_is_not_full_after_popula);
        }
        final SubLObject vector_var = vector;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject var;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            var = aref(vector_var, element_num);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == heap_find(var, v_heap, symbol_function(EQUAL), UNPROVIDED))) {
                Errors.error($str59$Cannot_find_element__A_in_the_hea, var);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!heap_find_spot_of_element(v_heap, var, funcall(key, var), UNPROVIDED, UNPROVIDED).isFixnum())) {
                Errors.error($str60$Cannot_determine_index_of_element, var);
            }
        }
        vector = Sort.sort(vector, predicate, key);
        SubLObject element;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            element = heap_remove(v_heap);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!element.equal(aref(vector, subtract(size, i, ONE_INTEGER))))) {
                Errors.error($str61$The_heap_and_the_vector_disagree_, i, aref(vector, i), element);
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == heap_is_empty_p(v_heap))) {
            Errors.error($str62$The_heap_is_not_empty_after_remov);
        }
        return $SUCCESS;
    }

    public static SubLObject heap_unit_test_sorting(final SubLObject string) {
        final SubLObject v_heap = create_min_heap(length(string), symbol_function(CHAR_CODE));
        final SubLObject reference_string = Sort.sort(string_utilities.copy_string(string), symbol_function($sym67$_), symbol_function(CHAR_CODE));
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$1 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(string, char_num);
            heap_enqueue(curr, v_heap);
        }
        SubLObject index = ZERO_INTEGER;
        final SubLObject string_var = reference_string;
        SubLObject end_var_$2;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject v_char;
        SubLObject curr2;
        for (end_var2 = end_var_$2 = length(string_var), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE(end_var_$2); char_num2 = number_utilities.f_1X(char_num2)) {
            v_char = Strings.sublisp_char(string_var, char_num2);
            curr2 = heap_remove(v_heap);
            if (NIL == charE(v_char, curr2)) {
                Errors.warn($str68$Heap__A_and_reference_string__A_d, v_heap, reference_string, index);
                return NIL;
            }
            index = add(index, ONE_INTEGER);
        }
        return $SUCCESS;
    }

    public static SubLObject heap_test_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_test_example(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject heap_test_example_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$heap_test_example_native.class ? T : NIL;
    }

    public static SubLObject heap_test_example_priority(final SubLObject v_object) {
        assert NIL != heap_test_example_p(v_object) : "heap.heap_test_example_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject heap_test_example_value(final SubLObject v_object) {
        assert NIL != heap_test_example_p(v_object) : "heap.heap_test_example_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_heap_test_example_priority(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_test_example_p(v_object) : "heap.heap_test_example_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_heap_test_example_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_test_example_p(v_object) : "heap.heap_test_example_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_heap_test_example(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $heap_test_example_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PRIORITY)) {
                _csetf_heap_test_example_priority(v_new, current_value);
            } else
                if (pcase_var.eql($VALUE)) {
                    _csetf_heap_test_example_value(v_new, current_value);
                } else {
                    Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_heap_test_example(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HEAP_TEST_EXAMPLE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PRIORITY, heap_test_example_priority(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE, heap_test_example_value(obj));
        funcall(visitor_fn, obj, $END, MAKE_HEAP_TEST_EXAMPLE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_heap_test_example_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_heap_test_example(obj, visitor_fn);
    }

    public static SubLObject print_heap_test_example(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($$$_priority_, stream, UNPROVIDED, UNPROVIDED);
            princ(get_heap_test_example_priority(v_object), stream);
            write_string($$$_value_, stream, UNPROVIDED, UNPROVIDED);
            princ(get_heap_test_example_value(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject get_heap_test_example_priority(final SubLObject heap_test_example) {
        assert NIL != heap_test_example_p(heap_test_example) : "heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) " + heap_test_example;
        return heap_test_example_priority(heap_test_example);
    }

    public static SubLObject change_heap_test_example_priority(final SubLObject heap_test_example, final SubLObject new_priority) {
        assert NIL != heap_test_example_p(heap_test_example) : "heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) " + heap_test_example;
        _csetf_heap_test_example_priority(heap_test_example, new_priority);
        return heap_test_example_priority(heap_test_example);
    }

    public static SubLObject get_heap_test_example_value(final SubLObject heap_test_example) {
        assert NIL != heap_test_example_p(heap_test_example) : "heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) " + heap_test_example;
        return heap_test_example_value(heap_test_example);
    }

    public static SubLObject new_heap_test_example(final SubLObject priority, final SubLObject value) {
        assert NIL != numberp(priority) : "Types.numberp(priority) " + "CommonSymbols.NIL != Types.numberp(priority) " + priority;
        final SubLObject example = make_heap_test_example(UNPROVIDED);
        _csetf_heap_test_example_priority(example, priority);
        _csetf_heap_test_example_value(example, value);
        return example;
    }

    public static SubLObject heap_unit_test_prioritizing(final SubLObject base_string, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (base_string == $COPYRIGHT_NOTICE) {
            return heap_unit_test_prioritizing(misc_utilities.kb_content_copyright_notice(), verboseP);
        }
        final SubLObject sizes = $list92;
        final SubLObject strings = list(base_string, reverse(base_string));
        final SubLObject min_max_list = list(T, NIL);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = sizes;
            SubLObject size = NIL;
            size = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                SubLObject cdolist_list_var_$4 = min_max_list;
                SubLObject minP = NIL;
                minP = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    result = heap_unit_test_priorities(string, size, verboseP, minP);
                    if (!result.eql(size)) {
                        return $FAILURE;
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
        return $SUCCESS;
    }

    public static SubLObject heap_unit_test_priorities(final SubLObject string, final SubLObject size, SubLObject verboseP, SubLObject minP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (minP == UNPROVIDED) {
            minP = T;
        }
        final SubLObject char_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject v_heap = (NIL != minP) ? create_min_heap(size, symbol_function(GET_HEAP_TEST_EXAMPLE_PRIORITY)) : create_max_heap(size, symbol_function(GET_HEAP_TEST_EXAMPLE_PRIORITY));
        if (NIL != verboseP) {
            Errors.warn($str95$Doing_a__A_heap_of_size__D_on_str, NIL != minP ? $$$min : $$$max, size, string);
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
        for (end_var = end_var_$5 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            map_entry = dictionary.dictionary_lookup(char_map, v_char, UNPROVIDED);
            if (NIL == map_entry) {
                map_entry = new_heap_test_example(NIL != minP ? ONE_INTEGER : size, v_char);
                dictionary.dictionary_enter(char_map, v_char, map_entry);
                if (NIL != heap_is_full_p(v_heap)) {
                    loser = heap_remove(v_heap);
                    dictionary.dictionary_remove(char_map, heap_test_example_value(loser));
                    if (NIL != verboseP) {
                        Errors.warn($str98$_A_lost_and_left_, loser);
                    }
                }
                heap_enqueue(map_entry, v_heap);
                if (NIL != verboseP) {
                    Errors.warn($str99$Adding__A_to_heap____elements_, map_entry, heap_count(v_heap));
                }
            } else {
                old_priority = get_heap_test_example_priority(map_entry);
                new_priority = (NIL != minP) ? add(old_priority, ONE_INTEGER) : subtract(old_priority, ONE_INTEGER);
                old_state = NIL;
                stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    princ(heap_elements_fast(v_heap), stream);
                    old_state = get_output_stream_string(stream);
                } finally {
                    _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
                change_heap_test_example_priority(map_entry, new_priority);
                if ((NIL == heap_reconsider(map_entry, v_heap, old_priority, UNPROVIDED)) && (NIL != verboseP)) {
                    Errors.error($str100$Changing_the_priority_of__A_from_, new SubLObject[]{ map_entry, old_priority, new_priority, old_state, heap_elements_fast(v_heap) });
                }
            }
            heap_unit_test_priorities_still_orderedP(v_heap, minP);
        }
        return size;
    }

    public static SubLObject heap_unit_test_priorities_still_orderedP(final SubLObject original_heap, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = T;
        }
        final SubLObject v_heap;
        final SubLObject clone = v_heap = clone_heap(original_heap);
        final SubLObject comparator = (NIL != minP) ? symbol_function($sym29$__) : symbol_function($sym37$__);
        final SubLObject comparator_name = (NIL != minP) ? $str101$__ : $str102$__;
        SubLObject previous_priority = (NIL != minP) ? $most_negative_fixnum$.getGlobalValue() : $most_positive_fixnum$.getGlobalValue();
        while (NIL == heap_is_empty_p(v_heap)) {
            final SubLObject map_entry = heap_remove(v_heap);
            final SubLObject priority = get_heap_test_example_priority(map_entry);
            if (NIL == funcall(comparator, previous_priority, priority)) {
                Errors.error($str103$The_heap_is_not_in_proper_order__, new SubLObject[]{ previous_priority, comparator_name, priority, heap_elements_fast(original_heap) });
            }
            previous_priority = priority;
        } 
        return T;
    }

    public static SubLObject declare_heap_file() {
        declareFunction(me, "heap_impl_print_function_trampoline", "HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "heap_impl_p", "HEAP-IMPL-P", 1, 0, false);
        new heap.$heap_impl_p$UnaryFunction();
        declareFunction(me, "heap_impl_next", "HEAP-IMPL-NEXT", 1, 0, false);
        declareFunction(me, "heap_impl_nodes", "HEAP-IMPL-NODES", 1, 0, false);
        declareFunction(me, "heap_impl_predicate", "HEAP-IMPL-PREDICATE", 1, 0, false);
        declareFunction(me, "heap_impl_key", "HEAP-IMPL-KEY", 1, 0, false);
        declareFunction(me, "_csetf_heap_impl_next", "_CSETF-HEAP-IMPL-NEXT", 2, 0, false);
        declareFunction(me, "_csetf_heap_impl_nodes", "_CSETF-HEAP-IMPL-NODES", 2, 0, false);
        declareFunction(me, "_csetf_heap_impl_predicate", "_CSETF-HEAP-IMPL-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_heap_impl_key", "_CSETF-HEAP-IMPL-KEY", 2, 0, false);
        declareFunction(me, "make_heap_impl", "MAKE-HEAP-IMPL", 0, 1, false);
        declareFunction(me, "visit_defstruct_heap_impl", "VISIT-DEFSTRUCT-HEAP-IMPL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_heap_impl_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-IMPL-METHOD", 2, 0, false);
        declareFunction(me, "is_empty_heap_elementP", "IS-EMPTY-HEAP-ELEMENT?", 1, 0, false);
        declareFunction(me, "new_heap_impl", "NEW-HEAP-IMPL", 1, 2, false);
        declareFunction(me, "clone_existing_heap", "CLONE-EXISTING-HEAP", 1, 0, false);
        declareFunction(me, "print_heap_impl", "PRINT-HEAP-IMPL", 3, 0, false);
        declareFunction(me, "create_heap", "CREATE-HEAP", 1, 2, false);
        declareFunction(me, "clear_heap", "CLEAR-HEAP", 1, 0, false);
        declareFunction(me, "clone_heap", "CLONE-HEAP", 1, 0, false);
        declareFunction(me, "heap_p", "HEAP-P", 1, 0, false);
        declareFunction(me, "heap_size", "HEAP-SIZE", 1, 0, false);
        declareFunction(me, "heap_count", "HEAP-COUNT", 1, 0, false);
        declareFunction(me, "heap_predicate", "HEAP-PREDICATE", 1, 0, false);
        declareFunction(me, "heap_key", "HEAP-KEY", 1, 0, false);
        declareFunction(me, "apply_heap_predicate", "APPLY-HEAP-PREDICATE", 3, 0, false);
        declareFunction(me, "apply_heap_key", "APPLY-HEAP-KEY", 2, 0, false);
        declareFunction(me, "heap_is_empty_p", "HEAP-IS-EMPTY-P", 1, 0, false);
        declareFunction(me, "heap_is_full_p", "HEAP-IS-FULL-P", 1, 0, false);
        declareFunction(me, "create_max_heap", "CREATE-MAX-HEAP", 1, 1, false);
        declareFunction(me, "create_min_heap", "CREATE-MIN-HEAP", 1, 1, false);
        declareFunction(me, "heap_insert", "HEAP-INSERT", 2, 0, false);
        declareFunction(me, "heap_enqueue", "HEAP-ENQUEUE", 2, 0, false);
        declareFunction(me, "heap_peek", "HEAP-PEEK", 1, 0, false);
        declareFunction(me, "heap_dequeue", "HEAP-DEQUEUE", 1, 0, false);
        declareFunction(me, "heap_remove", "HEAP-REMOVE", 1, 0, false);
        declareFunction(me, "heap_find", "HEAP-FIND", 2, 2, false);
        declareFunction(me, "heap_reconsider", "HEAP-RECONSIDER", 3, 1, false);
        declareFunction(me, "heap_find_spot", "HEAP-FIND-SPOT", 4, 0, false);
        declareFunction(me, "heap_reconsider_trickle_down", "HEAP-RECONSIDER-TRICKLE-DOWN", 2, 0, false);
        declareFunction(me, "heap_reconsider_bubble_up", "HEAP-RECONSIDER-BUBBLE-UP", 2, 0, false);
        declareFunction(me, "new_heap_iterator", "NEW-HEAP-ITERATOR", 1, 1, false);
        declareFunction(me, "make_heap_iterator_state", "MAKE-HEAP-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "heap_iterator_next", "HEAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "expand_heap_iterator_stack", "EXPAND-HEAP-ITERATOR-STACK", 1, 0, false);
        declareFunction(me, "expand_current_heap_iterator_stack_top", "EXPAND-CURRENT-HEAP-ITERATOR-STACK-TOP", 1, 0, false);
        declareFunction(me, "push_heap_iterator_stack", "PUSH-HEAP-ITERATOR-STACK", 3, 0, false);
        declareFunction(me, "pop_heap_iterator_stack", "POP-HEAP-ITERATOR-STACK", 1, 0, false);
        declareFunction(me, "top_heap_iterator_stack_action", "TOP-HEAP-ITERATOR-STACK-ACTION", 1, 0, false);
        declareFunction(me, "top_heap_iterator_stack_node_index", "TOP-HEAP-ITERATOR-STACK-NODE-INDEX", 1, 0, false);
        declareFunction(me, "top_heap_iterator_stack_node", "TOP-HEAP-ITERATOR-STACK-NODE", 1, 0, false);
        declareFunction(me, "heap_iterator_done", "HEAP-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "heap_keys", "HEAP-KEYS", 1, 0, false);
        declareFunction(me, "heap_keys_fast", "HEAP-KEYS-FAST", 1, 0, false);
        declareFunction(me, "heap_elements_fast", "HEAP-ELEMENTS-FAST", 1, 0, false);
        declareFunction(me, "heap_elements", "HEAP-ELEMENTS", 1, 0, false);
        declareFunction(me, "heap_root", "HEAP-ROOT", 1, 0, false);
        declareFunction(me, "set_heap_root", "SET-HEAP-ROOT", 2, 0, false);
        declareFunction(me, "heap_delete_last", "HEAP-DELETE-LAST", 1, 0, false);
        declareFunction(me, "heap_bubble_up", "HEAP-BUBBLE-UP", 2, 0, false);
        declareFunction(me, "heap_trickle_down", "HEAP-TRICKLE-DOWN", 2, 0, false);
        declareFunction(me, "heap_find_spot_of_element", "HEAP-FIND-SPOT-OF-ELEMENT", 3, 2, false);
        declareFunction(me, "heap_unit_test_insert_remove", "HEAP-UNIT-TEST-INSERT-REMOVE", 1, 3, false);
        declareFunction(me, "heap_unit_test_sorting", "HEAP-UNIT-TEST-SORTING", 1, 0, false);
        declareFunction(me, "heap_test_example_print_function_trampoline", "HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "heap_test_example_p", "HEAP-TEST-EXAMPLE-P", 1, 0, false);
        new heap.$heap_test_example_p$UnaryFunction();
        declareFunction(me, "heap_test_example_priority", "HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        declareFunction(me, "heap_test_example_value", "HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        declareFunction(me, "_csetf_heap_test_example_priority", "_CSETF-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        declareFunction(me, "_csetf_heap_test_example_value", "_CSETF-HEAP-TEST-EXAMPLE-VALUE", 2, 0, false);
        declareFunction(me, "make_heap_test_example", "MAKE-HEAP-TEST-EXAMPLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_heap_test_example", "VISIT-DEFSTRUCT-HEAP-TEST-EXAMPLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_heap_test_example_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-TEST-EXAMPLE-METHOD", 2, 0, false);
        declareFunction(me, "print_heap_test_example", "PRINT-HEAP-TEST-EXAMPLE", 3, 0, false);
        declareFunction(me, "get_heap_test_example_priority", "GET-HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        declareFunction(me, "change_heap_test_example_priority", "CHANGE-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        declareFunction(me, "get_heap_test_example_value", "GET-HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        declareFunction(me, "new_heap_test_example", "NEW-HEAP-TEST-EXAMPLE", 2, 0, false);
        declareFunction(me, "heap_unit_test_prioritizing", "HEAP-UNIT-TEST-PRIORITIZING", 1, 1, false);
        declareFunction(me, "heap_unit_test_priorities", "HEAP-UNIT-TEST-PRIORITIES", 2, 2, false);
        declareFunction(me, "heap_unit_test_priorities_still_orderedP", "HEAP-UNIT-TEST-PRIORITIES-STILL-ORDERED?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_heap_file() {
        defconstant("*DTP-HEAP-IMPL*", HEAP_IMPL);
        deflexical("*EMPTY-HEAP-ELEMENT*", SubLSystemTrampolineFile.maybeDefault($empty_heap_element$, $empty_heap_element$, () -> make_symbol($$$Empty_Heap_Element)));
        deflexical("*HEAP-ROOT-INDEX*", ONE_INTEGER);
        defconstant("*DTP-HEAP-TEST-EXAMPLE*", HEAP_TEST_EXAMPLE);
        return NIL;
    }

    public static SubLObject setup_heap_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_heap_impl$.getGlobalValue(), symbol_function(HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(HEAP_IMPL_NEXT, _CSETF_HEAP_IMPL_NEXT);
        def_csetf(HEAP_IMPL_NODES, _CSETF_HEAP_IMPL_NODES);
        def_csetf(HEAP_IMPL_PREDICATE, _CSETF_HEAP_IMPL_PREDICATE);
        def_csetf(HEAP_IMPL_KEY, _CSETF_HEAP_IMPL_KEY);
        identity(HEAP_IMPL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_heap_impl$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HEAP_IMPL_METHOD));
        declare_defglobal($empty_heap_element$);
        define_test_case_table_int(HEAP_UNIT_TEST_INSERT_REMOVE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list56);
        define_test_case_table_int(HEAP_UNIT_TEST_SORTING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list65);
        define_test_case_table_int(HEAP_UNIT_TEST_PRIORITIZING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list70);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_heap_test_example$.getGlobalValue(), symbol_function(HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list79);
        def_csetf(HEAP_TEST_EXAMPLE_PRIORITY, _CSETF_HEAP_TEST_EXAMPLE_PRIORITY);
        def_csetf(HEAP_TEST_EXAMPLE_VALUE, _CSETF_HEAP_TEST_EXAMPLE_VALUE);
        identity(HEAP_TEST_EXAMPLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_heap_test_example$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HEAP_TEST_EXAMPLE_METHOD));
        return NIL;
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

    

    public static final class $heap_impl_native extends SubLStructNative {
        public SubLObject $next;

        public SubLObject $nodes;

        public SubLObject $predicate;

        public SubLObject $key;

        private static final SubLStructDeclNative structDecl;

        private $heap_impl_native() {
            this.$next = Lisp.NIL;
            this.$nodes = Lisp.NIL;
            this.$predicate = Lisp.NIL;
            this.$key = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($heap_impl_native.class, HEAP_IMPL, HEAP_IMPL_P, $list2, $list3, new String[]{ "$next", "$nodes", "$predicate", "$key" }, $list4, $list5, PRINT_HEAP_IMPL);
        }
    }

    public static final class $heap_impl_p$UnaryFunction extends UnaryFunction {
        public $heap_impl_p$UnaryFunction() {
            super(extractFunctionNamed("HEAP-IMPL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return heap_impl_p(arg1);
        }
    }

    public static final class $heap_test_example_native extends SubLStructNative {
        public SubLObject $priority;

        public SubLObject $value;

        private static final SubLStructDeclNative structDecl;

        private $heap_test_example_native() {
            this.$priority = Lisp.NIL;
            this.$value = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($heap_test_example_native.class, HEAP_TEST_EXAMPLE, HEAP_TEST_EXAMPLE_P, $list73, $list74, new String[]{ "$priority", "$value" }, $list75, $list76, PRINT_HEAP_TEST_EXAMPLE);
        }
    }

    public static final class $heap_test_example_p$UnaryFunction extends UnaryFunction {
        public $heap_test_example_p$UnaryFunction() {
            super(extractFunctionNamed("HEAP-TEST-EXAMPLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return heap_test_example_p(arg1);
        }
    }
}

/**
 * Total time: 362 ms
 */
