/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class heap extends SubLTranslatedFile implements V12 {
    public static final class $heap_test_example_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.heap.$heap_test_example_native.this.$priority;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.heap.$heap_test_example_native.this.$value;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_test_example_native.this.$priority = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_test_example_native.this.$value = value;
        }

        public SubLObject $priority = Lisp.NIL;

        public SubLObject $value = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.heap.$heap_test_example_native.class, HEAP_TEST_EXAMPLE, HEAP_TEST_EXAMPLE_P, $list_alt71, $list_alt72, new String[]{ "$priority", "$value" }, $list_alt73, $list_alt74, PRINT_HEAP_TEST_EXAMPLE);
    }

    // Definitions
    public static final class $heap_impl_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$next;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$nodes;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$predicate;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$key;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$next = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$nodes = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$predicate = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.heap.$heap_impl_native.this.$key = value;
        }

        public SubLObject $next = Lisp.NIL;

        public SubLObject $nodes = Lisp.NIL;

        public SubLObject $predicate = Lisp.NIL;

        public SubLObject $key = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.heap.$heap_impl_native.class, HEAP_IMPL, HEAP_IMPL_P, $list_alt2, $list_alt3, new String[]{ "$next", "$nodes", "$predicate", "$key" }, $list_alt4, $list_alt5, PRINT_HEAP_IMPL);
    }

    public static final SubLFile me = new heap();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_heap_impl$ = makeSymbol("*DTP-HEAP-IMPL*");

    // deflexical
    // The position 0 is special and used for insert/delete operations
    /**
     * The position 0 is special and used for insert/delete operations
     */
    @LispMethod(comment = "The position 0 is special and used for insert/delete operations\ndeflexical")
    private static final SubLSymbol $heap_root_index$ = makeSymbol("*HEAP-ROOT-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_heap_test_example$ = makeSymbol("*DTP-HEAP-TEST-EXAMPLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol HEAP_IMPL = makeSymbol("HEAP-IMPL");

    private static final SubLSymbol HEAP_IMPL_P = makeSymbol("HEAP-IMPL-P");

    static private final SubLList $list2 = list(makeSymbol("NEXT"), makeSymbol("NODES"), makeSymbol("PREDICATE"), makeSymbol("KEY"));

    static private final SubLList $list3 = list($NEXT, makeKeyword("NODES"), makeKeyword("PREDICATE"), makeKeyword("KEY"));

    static private final SubLList $list4 = list(makeSymbol("HEAP-IMPL-NEXT"), makeSymbol("HEAP-IMPL-NODES"), makeSymbol("HEAP-IMPL-PREDICATE"), makeSymbol("HEAP-IMPL-KEY"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-HEAP-IMPL-NEXT"), makeSymbol("_CSETF-HEAP-IMPL-NODES"), makeSymbol("_CSETF-HEAP-IMPL-PREDICATE"), makeSymbol("_CSETF-HEAP-IMPL-KEY"));

    private static final SubLSymbol PRINT_HEAP_IMPL = makeSymbol("PRINT-HEAP-IMPL");

    private static final SubLSymbol HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list73 = list(makeSymbol("PRIORITY"), makeSymbol("VALUE"));

    static private final SubLList $list74 = list(makeKeyword("PRIORITY"), makeKeyword("VALUE"));

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

    public static final SubLObject heap_impl_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_heap_impl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject heap_impl_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_impl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject heap_impl_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.heap.$heap_impl_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject heap_impl_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.heap.$heap_impl_native.class ? T : NIL;
    }

    public static final SubLObject heap_impl_next_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.getField2();
    }

    public static SubLObject heap_impl_next(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject heap_impl_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.getField3();
    }

    public static SubLObject heap_impl_nodes(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject heap_impl_predicate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.getField4();
    }

    public static SubLObject heap_impl_predicate(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject heap_impl_key_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.getField5();
    }

    public static SubLObject heap_impl_key(final SubLObject v_object) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_heap_impl_next_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_heap_impl_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_heap_impl_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_heap_impl_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_heap_impl_predicate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_heap_impl_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_heap_impl_key_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_IMPL_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_heap_impl_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_impl_p(v_object) : "! heap.heap_impl_p(v_object) " + "heap.heap_impl_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_heap_impl_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.heap.$heap_impl_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NEXT)) {
                        _csetf_heap_impl_next(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NODES)) {
                            _csetf_heap_impl_nodes(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PREDICATE)) {
                                _csetf_heap_impl_predicate(v_new, current_value);
                            } else {
                                if (pcase_var.eql($KEY)) {
                                    _csetf_heap_impl_key(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_heap_impl(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.heap.$heap_impl_native();
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

    public static final SubLObject is_empty_heap_elementP_alt(SubLObject item) {
        return eq($empty_heap_element$.getGlobalValue(), item);
    }

    public static SubLObject is_empty_heap_elementP(final SubLObject item) {
        return eq($empty_heap_element$.getGlobalValue(), item);
    }

    public static final SubLObject new_heap_impl_alt(SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym23$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject v_heap = make_heap_impl(UNPROVIDED);
            _csetf_heap_impl_next(v_heap, $heap_root_index$.getGlobalValue());
            _csetf_heap_impl_nodes(v_heap, make_vector(size, $empty_heap_element$.getGlobalValue()));
            _csetf_heap_impl_predicate(v_heap, predicate);
            _csetf_heap_impl_key(v_heap, key);
            return v_heap;
        }
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

    public static final SubLObject clone_existing_heap_alt(SubLObject old_heap) {
        {
            SubLObject v_heap = make_heap_impl(UNPROVIDED);
            _csetf_heap_impl_next(v_heap, heap_impl_next(old_heap));
            _csetf_heap_impl_predicate(v_heap, heap_impl_predicate(old_heap));
            _csetf_heap_impl_key(v_heap, heap_impl_key(old_heap));
            _csetf_heap_impl_nodes(v_heap, copy_seq(heap_impl_nodes(old_heap)));
            return v_heap;
        }
    }

    public static SubLObject clone_existing_heap(final SubLObject old_heap) {
        final SubLObject v_heap = make_heap_impl(UNPROVIDED);
        _csetf_heap_impl_next(v_heap, heap_impl_next(old_heap));
        _csetf_heap_impl_predicate(v_heap, heap_impl_predicate(old_heap));
        _csetf_heap_impl_key(v_heap, heap_impl_key(old_heap));
        _csetf_heap_impl_nodes(v_heap, copy_seq(heap_impl_nodes(old_heap)));
        return v_heap;
    }

    public static final SubLObject print_heap_impl_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt24$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_space, stream_2);
                    princ($str_alt26$HEAP_, stream);
                    princ(heap_impl_predicate(v_object), stream);
                    {
                        SubLObject key = heap_impl_key(v_object);
                        if (!((key == symbol_function(IDENTITY)) || (key == IDENTITY))) {
                            write_string($str_alt27$_of_key_, stream, UNPROVIDED, UNPROVIDED);
                            princ(key, stream);
                        }
                    }
                    write_string($str_alt28$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(heap_count(v_object), stream);
                    write_string($str_alt29$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(heap_size(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
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

    public static final SubLObject create_heap_alt(SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym23$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(size, FIXNUMP);
        SubLTrampolineFile.checkType(predicate, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(key, FUNCTION_SPEC_P);
        return new_heap_impl(add(size, ONE_INTEGER), predicate, key);
    }

    public static SubLObject create_heap(final SubLObject size, SubLObject predicate, SubLObject key) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym29$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != fixnump(size) : "! fixnump(size) " + ("Types.fixnump(size) " + "CommonSymbols.NIL != Types.fixnump(size) ") + size;
        assert NIL != function_spec_p(predicate) : "! function_spec_p(predicate) " + ("Types.function_spec_p(predicate) " + "CommonSymbols.NIL != Types.function_spec_p(predicate) ") + predicate;
        assert NIL != function_spec_p(key) : "! function_spec_p(key) " + ("Types.function_spec_p(key) " + "CommonSymbols.NIL != Types.function_spec_p(key) ") + key;
        return new_heap_impl(add(size, ONE_INTEGER), predicate, key);
    }

    public static final SubLObject clear_heap_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject nodes = heap_impl_nodes(v_heap);
            SubLObject cdotimes_end_var = length(nodes);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                set_aref(nodes, i, $empty_heap_element$.getGlobalValue());
            }
        }
        _csetf_heap_impl_next(v_heap, $heap_root_index$.getGlobalValue());
        return v_heap;
    }

    public static SubLObject clear_heap(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        final SubLObject nodes = heap_impl_nodes(v_heap);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(nodes), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            set_aref(nodes, i, $empty_heap_element$.getGlobalValue());
        }
        _csetf_heap_impl_next(v_heap, $heap_root_index$.getGlobalValue());
        return v_heap;
    }

    public static final SubLObject clone_heap_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return clone_existing_heap(v_heap);
    }

    public static SubLObject clone_heap(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return clone_existing_heap(v_heap);
    }

    public static final SubLObject heap_p_alt(SubLObject v_object) {
        return heap_impl_p(v_object);
    }

    public static SubLObject heap_p(final SubLObject v_object) {
        return heap_impl_p(v_object);
    }

    public static final SubLObject heap_size_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return subtract(length(heap_impl_nodes(v_heap)), ONE_INTEGER);
    }

    public static SubLObject heap_size(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return subtract(length(heap_impl_nodes(v_heap)), ONE_INTEGER);
    }

    public static final SubLObject heap_count_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return subtract(heap_impl_next(v_heap), ONE_INTEGER);
    }

    public static SubLObject heap_count(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return subtract(heap_impl_next(v_heap), ONE_INTEGER);
    }

    public static final SubLObject heap_predicate_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return heap_impl_predicate(v_heap);
    }

    public static SubLObject heap_predicate(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return heap_impl_predicate(v_heap);
    }

    public static final SubLObject heap_key_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return heap_impl_key(v_heap);
    }

    public static SubLObject heap_key(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return heap_impl_key(v_heap);
    }

    public static final SubLObject apply_heap_predicate_alt(SubLObject v_heap, SubLObject key1, SubLObject key2) {
        return funcall(heap_impl_predicate(v_heap), key1, key2);
    }

    public static SubLObject apply_heap_predicate(final SubLObject v_heap, final SubLObject key1, final SubLObject key2) {
        return funcall(heap_impl_predicate(v_heap), key1, key2);
    }

    public static final SubLObject apply_heap_key_alt(SubLObject v_heap, SubLObject v_object) {
        return funcall(heap_impl_key(v_heap), v_object);
    }

    public static SubLObject apply_heap_key(final SubLObject v_heap, final SubLObject v_object) {
        return funcall(heap_impl_key(v_heap), v_object);
    }

    public static final SubLObject heap_is_empty_p_alt(SubLObject v_heap) {
        return zerop(heap_count(v_heap));
    }

    public static SubLObject heap_is_empty_p(final SubLObject v_heap) {
        return zerop(heap_count(v_heap));
    }

    public static final SubLObject heap_is_full_p_alt(SubLObject v_heap) {
        return numE(heap_count(v_heap), heap_size(v_heap));
    }

    public static SubLObject heap_is_full_p(final SubLObject v_heap) {
        return numE(heap_count(v_heap), heap_size(v_heap));
    }

    public static final SubLObject create_max_heap_alt(SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym23$__), key);
    }

    public static SubLObject create_max_heap(final SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym29$__), key);
    }

    public static final SubLObject create_min_heap_alt(SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym34$__), key);
    }

    public static SubLObject create_min_heap(final SubLObject size, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return create_heap(size, symbol_function($sym37$__), key);
    }

    public static final SubLObject heap_insert_alt(SubLObject element, SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        if (NIL != heap_is_full_p(v_heap)) {
            Errors.error($str_alt35$The_heap__A_is_full__must_remove_, v_heap);
        }
        {
            SubLObject spot = heap_impl_next(v_heap);
            _csetf_heap_impl_next(v_heap, add(heap_impl_next(v_heap), ONE_INTEGER));
            set_aref(heap_impl_nodes(v_heap), spot, element);
            heap_bubble_up(v_heap, spot);
        }
        return v_heap;
    }

    public static SubLObject heap_insert(final SubLObject element, final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        if (NIL != heap_is_full_p(v_heap)) {
            Errors.error($str38$The_heap__A_is_full__must_remove_, v_heap);
        }
        final SubLObject spot = heap_impl_next(v_heap);
        _csetf_heap_impl_next(v_heap, add(heap_impl_next(v_heap), ONE_INTEGER));
        set_aref(heap_impl_nodes(v_heap), spot, element);
        heap_bubble_up(v_heap, spot);
        return v_heap;
    }

    /**
     *
     *
     * @unknown alternate to HEAP-INSERT
     */
    @LispMethod(comment = "@unknown alternate to HEAP-INSERT")
    public static final SubLObject heap_enqueue_alt(SubLObject element, SubLObject v_heap) {
        return heap_insert(element, v_heap);
    }

    /**
     *
     *
     * @unknown alternate to HEAP-INSERT
     */
    @LispMethod(comment = "@unknown alternate to HEAP-INSERT")
    public static SubLObject heap_enqueue(final SubLObject element, final SubLObject v_heap) {
        return heap_insert(element, v_heap);
    }

    public static final SubLObject heap_peek_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        if (NIL != heap_is_empty_p(v_heap)) {
            return NIL;
        }
        return heap_root(v_heap);
    }

    public static SubLObject heap_peek(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        if (NIL != heap_is_empty_p(v_heap)) {
            return NIL;
        }
        return heap_root(v_heap);
    }

    /**
     *
     *
     * @unknown alternate to HEAP-REMOVE
     */
    @LispMethod(comment = "@unknown alternate to HEAP-REMOVE")
    public static final SubLObject heap_dequeue_alt(SubLObject v_heap) {
        return heap_remove(v_heap);
    }

    /**
     *
     *
     * @unknown alternate to HEAP-REMOVE
     */
    @LispMethod(comment = "@unknown alternate to HEAP-REMOVE")
    public static SubLObject heap_dequeue(final SubLObject v_heap) {
        return heap_remove(v_heap);
    }

    public static final SubLObject heap_remove_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        if (NIL != heap_is_empty_p(v_heap)) {
            Errors.error($str_alt36$Cannot_remove_an_item_from_empty_, v_heap);
        }
        {
            SubLObject element = heap_root(v_heap);
            SubLObject replacement = heap_delete_last(v_heap);
            if (NIL == heap_is_empty_p(v_heap)) {
                set_heap_root(v_heap, replacement);
                heap_trickle_down(v_heap, $heap_root_index$.getGlobalValue());
            }
            return element;
        }
    }

    public static SubLObject heap_remove(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
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

    /**
     * This is the O(n) implementation which has to do a straight-up search
     */
    @LispMethod(comment = "This is the O(n) implementation which has to do a straight-up search")
    public static final SubLObject heap_find_alt(SubLObject item, SubLObject v_heap, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject heap_nodes = heap_impl_nodes(v_heap);
            SubLObject last_index = heap_impl_next(v_heap);
            return find(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
        }
    }

    /**
     * This is the O(n) implementation which has to do a straight-up search
     */
    @LispMethod(comment = "This is the O(n) implementation which has to do a straight-up search")
    public static SubLObject heap_find(final SubLObject item, final SubLObject v_heap, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return find(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
    }

    /**
     * Either promote or demote the ITEM on HEAP, which was originally (either
     * at INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,
     * to the value the key now returns. TEST is used to compare the ITEM to
     * other ITEMs.
     *
     * @return generalized boolean if found and reconsidered, else NIL
     */
    @LispMethod(comment = "Either promote or demote the ITEM on HEAP, which was originally (either\r\nat INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,\r\nto the value the key now returns. TEST is used to compare the ITEM to\r\nother ITEMs.\r\n\r\n@return generalized boolean if found and reconsidered, else NIL\nEither promote or demote the ITEM on HEAP, which was originally (either\nat INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,\nto the value the key now returns. TEST is used to compare the ITEM to\nother ITEMs.")
    public static final SubLObject heap_reconsider_alt(SubLObject item, SubLObject v_heap, SubLObject old_item_key, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject spot = heap_find_spot_of_element(v_heap, item, old_item_key, test, UNPROVIDED);
            if (NIL != spot) {
                {
                    SubLObject new_item_key = apply_heap_key(v_heap, item);
                    if (NIL != apply_heap_predicate(v_heap, old_item_key, new_item_key)) {
                        heap_reconsider_bubble_up(v_heap, spot);
                    } else {
                        heap_reconsider_trickle_down(v_heap, spot);
                    }
                }
            }
            return list_utilities.sublisp_boolean(spot);
        }
    }

    /**
     * Either promote or demote the ITEM on HEAP, which was originally (either
     * at INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,
     * to the value the key now returns. TEST is used to compare the ITEM to
     * other ITEMs.
     *
     * @return generalized boolean if found and reconsidered, else NIL
     */
    @LispMethod(comment = "Either promote or demote the ITEM on HEAP, which was originally (either\r\nat INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,\r\nto the value the key now returns. TEST is used to compare the ITEM to\r\nother ITEMs.\r\n\r\n@return generalized boolean if found and reconsidered, else NIL\nEither promote or demote the ITEM on HEAP, which was originally (either\nat INSERT or at the last RECONSIDER time) positioned with OLD-ITEM-KEY,\nto the value the key now returns. TEST is used to compare the ITEM to\nother ITEMs.")
    public static SubLObject heap_reconsider(final SubLObject item, final SubLObject v_heap, final SubLObject old_item_key, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
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

    public static final SubLObject heap_find_spot_alt(SubLObject item, SubLObject v_heap, SubLObject test, SubLObject key) {
        {
            SubLObject heap_nodes = heap_impl_nodes(v_heap);
            SubLObject last_index = heap_impl_next(v_heap);
            return position(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
        }
    }

    public static SubLObject heap_find_spot(final SubLObject item, final SubLObject v_heap, final SubLObject test, final SubLObject key) {
        final SubLObject heap_nodes = heap_impl_nodes(v_heap);
        final SubLObject last_index = heap_impl_next(v_heap);
        return position(item, heap_nodes, test, key, $heap_root_index$.getGlobalValue(), last_index);
    }

    public static final SubLObject heap_reconsider_trickle_down_alt(SubLObject v_heap, SubLObject spot) {
        return heap_trickle_down(v_heap, spot);
    }

    public static SubLObject heap_reconsider_trickle_down(final SubLObject v_heap, final SubLObject spot) {
        return heap_trickle_down(v_heap, spot);
    }

    public static final SubLObject heap_reconsider_bubble_up_alt(SubLObject v_heap, SubLObject spot) {
        return heap_bubble_up(v_heap, spot);
    }

    public static SubLObject heap_reconsider_bubble_up(final SubLObject v_heap, final SubLObject spot) {
        return heap_bubble_up(v_heap, spot);
    }

    public static final SubLObject new_heap_iterator_alt(SubLObject v_heap, SubLObject reverse_orderP) {
        if (reverse_orderP == UNPROVIDED) {
            reverse_orderP = NIL;
        }
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return iteration.new_iterator(make_heap_iterator_state(v_heap, list_utilities.sublisp_boolean(reverse_orderP)), HEAP_ITERATOR_DONE, HEAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject new_heap_iterator(final SubLObject v_heap, SubLObject reverse_orderP) {
        if (reverse_orderP == UNPROVIDED) {
            reverse_orderP = NIL;
        }
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return iteration.new_iterator(make_heap_iterator_state(v_heap, list_utilities.sublisp_boolean(reverse_orderP)), HEAP_ITERATOR_DONE, HEAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_heap_iterator_state_alt(SubLObject v_heap, SubLObject reverse_orderP) {
        {
            SubLObject state = NIL;
            SubLObject node_stack = NIL;
            SubLObject action_stack = NIL;
            SubLObject stack_pointer = ZERO_INTEGER;
            if (NIL == heap_is_empty_p(v_heap)) {
                {
                    SubLObject max_depth = multiply(THREE_INTEGER, ceiling(log(heap_count(v_heap), TWO_INTEGER), UNPROVIDED));
                    node_stack = make_vector(max_depth, UNPROVIDED);
                    action_stack = make_vector(max_depth, UNPROVIDED);
                }
            }
            state = list(stack_pointer, action_stack, node_stack, v_heap, reverse_orderP);
            if (NIL == heap_is_empty_p(v_heap)) {
                push_heap_iterator_stack(state, $EXPAND, $heap_root_index$.getGlobalValue());
                expand_heap_iterator_stack(state);
            }
            return state;
        }
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

    public static final SubLObject heap_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ($SHOW != top_heap_iterator_stack_action(state)) {
                    Errors.error($str_alt41$Error_in_heap_iterator__iterator_);
                }
            }
            {
                SubLObject node = top_heap_iterator_stack_node(state);
                pop_heap_iterator_stack(state);
                expand_heap_iterator_stack(state);
                return values(node, state, NIL);
            }
        }
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

    /**
     * work on the stack until a :show is on top or the stack is empty
     */
    @LispMethod(comment = "work on the stack until a :show is on top or the stack is empty")
    public static final SubLObject expand_heap_iterator_stack_alt(SubLObject state) {
        {
            SubLObject stack_pointer = nth(ZERO_INTEGER, state);
            while (!stack_pointer.isZero()) {
                {
                    SubLObject action = top_heap_iterator_stack_action(state);
                    if (action == $SHOW) {
                        return state;
                    }
                    if (action != $EXPAND) {
                        Errors.error($str_alt42$Invalid_sate_transition__unknown_, action);
                    }
                    expand_current_heap_iterator_stack_top(state);
                    stack_pointer = nth(ZERO_INTEGER, state);
                }
            } 
        }
        return state;
    }

    /**
     * work on the stack until a :show is on top or the stack is empty
     */
    @LispMethod(comment = "work on the stack until a :show is on top or the stack is empty")
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

    public static final SubLObject expand_current_heap_iterator_stack_top_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject stack_pointer = NIL;
            SubLObject action_stack = NIL;
            SubLObject node_stack = NIL;
            SubLObject v_heap = NIL;
            SubLObject reverse_orderP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            stack_pointer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            action_stack = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            node_stack = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            v_heap = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            reverse_orderP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject count = heap_count(v_heap);
                    SubLObject curr_node_index = top_heap_iterator_stack_node_index(state);
                    pop_heap_iterator_stack(state);
                    {
                        SubLObject first_child = NIL;
                        SubLObject second_child = NIL;
                        SubLObject l_child = add(curr_node_index, curr_node_index);
                        SubLObject r_child = add(l_child, ONE_INTEGER);
                        first_child = (NIL != reverse_orderP) ? ((SubLObject) (r_child)) : l_child;
                        second_child = (NIL != reverse_orderP) ? ((SubLObject) (l_child)) : r_child;
                        if (second_child.numLE(count)) {
                            push_heap_iterator_stack(state, $EXPAND, second_child);
                        }
                        if (first_child.numLE(count)) {
                            push_heap_iterator_stack(state, $EXPAND, first_child);
                        }
                        push_heap_iterator_stack(state, $SHOW, curr_node_index);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
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

    public static final SubLObject push_heap_iterator_stack_alt(SubLObject state, SubLObject command, SubLObject node) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject stack_pointer = NIL;
            SubLObject action_stack = NIL;
            SubLObject node_stack = NIL;
            SubLObject v_heap = NIL;
            SubLObject reverse_orderP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            stack_pointer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            action_stack = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            node_stack = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            v_heap = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            reverse_orderP = current.first();
            current = current.rest();
            if (NIL == current) {
                set_aref(action_stack, stack_pointer, command);
                set_aref(node_stack, stack_pointer, node);
                stack_pointer = add(stack_pointer, ONE_INTEGER);
                set_nth(ZERO_INTEGER, state, stack_pointer);
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
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

    public static final SubLObject pop_heap_iterator_stack_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject stack_pointer = NIL;
                SubLObject action_stack = NIL;
                SubLObject node_stack = NIL;
                SubLObject v_heap = NIL;
                SubLObject reverse_orderP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                stack_pointer = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                action_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                node_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                v_heap = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                reverse_orderP = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!stack_pointer.isPositive()) {
                            Errors.error($str_alt44$Error__stack_underflow_during_hea);
                        }
                    }
                    set_aref(action_stack, stack_pointer, NIL);
                    set_aref(node_stack, stack_pointer, NIL);
                    stack_pointer = subtract(stack_pointer, ONE_INTEGER);
                    set_nth(ZERO_INTEGER, state, stack_pointer);
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
            }
            return state;
        }
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

    public static final SubLObject top_heap_iterator_stack_action_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject stack_pointer = NIL;
                SubLObject action_stack = NIL;
                SubLObject node_stack = NIL;
                SubLObject v_heap = NIL;
                SubLObject reverse_orderP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                stack_pointer = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                action_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                node_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                v_heap = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                reverse_orderP = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!stack_pointer.isPositive()) {
                            Errors.error($str_alt44$Error__stack_underflow_during_hea);
                        }
                    }
                    return aref(action_stack, subtract(stack_pointer, ONE_INTEGER));
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
            }
            return NIL;
        }
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

    public static final SubLObject top_heap_iterator_stack_node_index_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject stack_pointer = NIL;
                SubLObject action_stack = NIL;
                SubLObject node_stack = NIL;
                SubLObject v_heap = NIL;
                SubLObject reverse_orderP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                stack_pointer = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                action_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                node_stack = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                v_heap = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                reverse_orderP = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!stack_pointer.isPositive()) {
                            Errors.error($str_alt44$Error__stack_underflow_during_hea);
                        }
                    }
                    return aref(node_stack, subtract(stack_pointer, ONE_INTEGER));
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
            }
            return NIL;
        }
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

    public static final SubLObject top_heap_iterator_stack_node_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node_index = top_heap_iterator_stack_node_index(state);
                SubLObject v_heap = nth(THREE_INTEGER, state);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == heap_p(v_heap)) {
                        Errors.error($str_alt45$Error_in_heap_iterator_state_);
                    }
                }
                {
                    SubLObject nodes = heap_impl_nodes(v_heap);
                    return aref(nodes, node_index);
                }
            }
        }
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

    public static final SubLObject heap_iterator_done_alt(SubLObject state) {
        {
            SubLObject stack_pointer = nth(ZERO_INTEGER, state);
            return zerop(stack_pointer);
        }
    }

    public static SubLObject heap_iterator_done(final SubLObject state) {
        final SubLObject stack_pointer = nth(ZERO_INTEGER, state);
        return zerop(stack_pointer);
    }

    /**
     *
     *
     * @unknown due to the way heaps are organized, a very expensive operation
     */
    @LispMethod(comment = "@unknown due to the way heaps are organized, a very expensive operation")
    public static final SubLObject heap_keys_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject clone = clone_heap(v_heap);
            SubLObject keys = NIL;
            while (NIL == heap_is_empty_p(clone)) {
                {
                    SubLObject item = heap_remove(clone);
                    keys = cons(funcall(heap_key(clone), item), keys);
                }
            } 
            return nreverse(keys);
        }
    }

    /**
     *
     *
     * @unknown due to the way heaps are organized, a very expensive operation
     */
    @LispMethod(comment = "@unknown due to the way heaps are organized, a very expensive operation")
    public static SubLObject heap_keys(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject keys = NIL;
        while (NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            keys = cons(funcall(heap_key(clone), item), keys);
        } 
        return nreverse(keys);
    }

    /**
     * A cheaper operation than HEAP-KEYS, but returns the keys in the
     * order in which HEAP-ELEMENTS-FAST returns them.
     */
    @LispMethod(comment = "A cheaper operation than HEAP-KEYS, but returns the keys in the\r\norder in which HEAP-ELEMENTS-FAST returns them.\nA cheaper operation than HEAP-KEYS, but returns the keys in the\norder in which HEAP-ELEMENTS-FAST returns them.")
    public static final SubLObject heap_keys_fast_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        return Mapping.mapcar(heap_key(v_heap), heap_elements_fast(v_heap));
    }

    /**
     * A cheaper operation than HEAP-KEYS, but returns the keys in the
     * order in which HEAP-ELEMENTS-FAST returns them.
     */
    @LispMethod(comment = "A cheaper operation than HEAP-KEYS, but returns the keys in the\r\norder in which HEAP-ELEMENTS-FAST returns them.\nA cheaper operation than HEAP-KEYS, but returns the keys in the\norder in which HEAP-ELEMENTS-FAST returns them.")
    public static SubLObject heap_keys_fast(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        return Mapping.mapcar(heap_key(v_heap), heap_elements_fast(v_heap));
    }

    /**
     * A cheaper operation, but returns the elements in heap order.
     */
    @LispMethod(comment = "A cheaper operation, but returns the elements in heap order.")
    public static final SubLObject heap_elements_fast_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject payload = heap_impl_nodes(v_heap);
            SubLObject end_index = heap_impl_next(v_heap);
            SubLObject elements = NIL;
            SubLObject vector_var = payload;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject elem_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject item = aref(vector_var, elem_num);
                    if ($heap_root_index$.getGlobalValue().numLE(elem_num)) {
                        if (elem_num.numL(end_index)) {
                            elements = cons(item, elements);
                        }
                    }
                }
            }
            return nreverse(elements);
        }
    }

    /**
     * A cheaper operation, but returns the elements in heap order.
     */
    @LispMethod(comment = "A cheaper operation, but returns the elements in heap order.")
    public static SubLObject heap_elements_fast(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
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

    /**
     *
     *
     * @unknown due to the way heaps are organized, a very expensive operation
     */
    @LispMethod(comment = "@unknown due to the way heaps are organized, a very expensive operation")
    public static final SubLObject heap_elements_alt(SubLObject v_heap) {
        SubLTrampolineFile.checkType(v_heap, HEAP_P);
        {
            SubLObject clone = clone_heap(v_heap);
            SubLObject elements = NIL;
            while (NIL == heap_is_empty_p(clone)) {
                {
                    SubLObject item = heap_remove(clone);
                    elements = cons(item, elements);
                }
            } 
            return nreverse(elements);
        }
    }

    /**
     *
     *
     * @unknown due to the way heaps are organized, a very expensive operation
     */
    @LispMethod(comment = "@unknown due to the way heaps are organized, a very expensive operation")
    public static SubLObject heap_elements(final SubLObject v_heap) {
        assert NIL != heap_p(v_heap) : "! heap.heap_p(v_heap) " + ("heap.heap_p(v_heap) " + "CommonSymbols.NIL != heap.heap_p(v_heap) ") + v_heap;
        final SubLObject clone = clone_heap(v_heap);
        SubLObject elements = NIL;
        while (NIL == heap_is_empty_p(clone)) {
            final SubLObject item = heap_remove(clone);
            elements = cons(item, elements);
        } 
        return nreverse(elements);
    }

    public static final SubLObject heap_root_alt(SubLObject v_heap) {
        return aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue());
    }

    public static SubLObject heap_root(final SubLObject v_heap) {
        return aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue());
    }

    public static final SubLObject set_heap_root_alt(SubLObject v_heap, SubLObject element) {
        return set_aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue(), element);
    }

    public static SubLObject set_heap_root(final SubLObject v_heap, final SubLObject element) {
        return set_aref(heap_impl_nodes(v_heap), $heap_root_index$.getGlobalValue(), element);
    }

    public static final SubLObject heap_delete_last_alt(SubLObject v_heap) {
        {
            SubLObject last = subtract(heap_impl_next(v_heap), ONE_INTEGER);
            SubLObject element = aref(heap_impl_nodes(v_heap), last);
            set_aref(heap_impl_nodes(v_heap), last, $empty_heap_element$.getGlobalValue());
            _csetf_heap_impl_next(v_heap, last);
            return element;
        }
    }

    public static SubLObject heap_delete_last(final SubLObject v_heap) {
        final SubLObject last = subtract(heap_impl_next(v_heap), ONE_INTEGER);
        final SubLObject element = aref(heap_impl_nodes(v_heap), last);
        set_aref(heap_impl_nodes(v_heap), last, $empty_heap_element$.getGlobalValue());
        _csetf_heap_impl_next(v_heap, last);
        return element;
    }

    /**
     *
     *
     * @unknown Sedgewick recommends using a sentinel key value in nodes[0] instead of
    testing for zerop; but this makes the API ambiguous (is the sentinel used
    as is, or does key have to be applied to it first?) and can cause infinite
    loops if the sentinel value provided does not satisfy the criteria
     */
    @LispMethod(comment = "@unknown Sedgewick recommends using a sentinel key value in nodes[0] instead of\r\ntesting for zerop; but this makes the API ambiguous (is the sentinel used\r\nas is, or does key have to be applied to it first?) and can cause infinite\r\nloops if the sentinel value provided does not satisfy the criteria")
    public static final SubLObject heap_bubble_up_alt(SubLObject v_heap, SubLObject spot) {
        {
            SubLObject heap_nodes = heap_impl_nodes(v_heap);
            SubLObject element = aref(heap_nodes, spot);
            SubLObject element_key = apply_heap_key(v_heap, element);
            SubLObject parent = integerDivide(spot, TWO_INTEGER);
            SubLObject parent_key = (parent.isPositive()) ? ((SubLObject) (apply_heap_key(v_heap, aref(heap_nodes, parent)))) : NIL;
            while (parent.isPositive() && (NIL != apply_heap_predicate(v_heap, parent_key, element_key))) {
                set_aref(heap_nodes, spot, aref(heap_nodes, parent));
                spot = parent;
                parent = integerDivide(spot, TWO_INTEGER);
                parent_key = (parent.isPositive()) ? ((SubLObject) (apply_heap_key(v_heap, aref(heap_nodes, parent)))) : NIL;
            } 
            set_aref(heap_nodes, spot, element);
        }
        return v_heap;
    }

    /**
     *
     *
     * @unknown Sedgewick recommends using a sentinel key value in nodes[0] instead of
    testing for zerop; but this makes the API ambiguous (is the sentinel used
    as is, or does key have to be applied to it first?) and can cause infinite
    loops if the sentinel value provided does not satisfy the criteria
     */
    @LispMethod(comment = "@unknown Sedgewick recommends using a sentinel key value in nodes[0] instead of\r\ntesting for zerop; but this makes the API ambiguous (is the sentinel used\r\nas is, or does key have to be applied to it first?) and can cause infinite\r\nloops if the sentinel value provided does not satisfy the criteria")
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

    /**
     *
     *
     * @unknown assume that equal is appropriate for comparing the keys
     */
    @LispMethod(comment = "@unknown assume that equal is appropriate for comparing the keys")
    public static final SubLObject heap_trickle_down_alt(SubLObject v_heap, SubLObject spot) {
        {
            SubLObject heap_nodes = heap_impl_nodes(v_heap);
            SubLObject element = aref(heap_nodes, spot);
            SubLObject element_key = apply_heap_key(v_heap, element);
            SubLObject heap_count = heap_impl_next(v_heap);
            SubLObject heap_middle = integerDivide(heap_count, TWO_INTEGER);
            SubLObject doneP = NIL;
            while (spot.numLE(heap_middle) && (NIL == doneP)) {
                {
                    SubLObject child = add(spot, spot);
                    if (child.numL(heap_count)) {
                        {
                            SubLObject left_child_value = aref(heap_nodes, child);
                            SubLObject child_value = left_child_value;
                            SubLObject left_child_key = apply_heap_key(v_heap, left_child_value);
                            SubLObject child_key = left_child_key;
                            SubLObject right_child = add(child, ONE_INTEGER);
                            if (right_child.numL(heap_count)) {
                                {
                                    SubLObject right_child_value = aref(heap_nodes, right_child);
                                    if (NIL == is_empty_heap_elementP(right_child_value)) {
                                        {
                                            SubLObject right_child_key = apply_heap_key(v_heap, right_child_value);
                                            if ((NIL != apply_heap_predicate(v_heap, left_child_key, right_child_key)) && (!left_child_key.equal(right_child_key))) {
                                                child = right_child;
                                                child_value = right_child_value;
                                                child_key = right_child_key;
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != apply_heap_predicate(v_heap, element_key, child_key)) {
                                set_aref(heap_nodes, spot, child_value);
                                spot = child;
                            } else {
                                doneP = T;
                            }
                        }
                    } else {
                        doneP = T;
                    }
                }
            } 
            set_aref(heap_nodes, spot, element);
        }
        return v_heap;
    }

    /**
     *
     *
     * @unknown assume that equal is appropriate for comparing the keys
     */
    @LispMethod(comment = "@unknown assume that equal is appropriate for comparing the keys")
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

    /**
     * Use the value of OLD-ELEMENT-KEY to drive the search, approximating a O(logN) lookup time;
     * note that the proximity is determined by how many elements in the heap have OLD-ELEMENT-KEY
     * as their cost, thereby residing unordered in the same subtree. If all elements in the heap
     * have OLD-ELEMENT-KEY as their value, the search degenerates to O(N).
     */
    @LispMethod(comment = "Use the value of OLD-ELEMENT-KEY to drive the search, approximating a O(logN) lookup time;\r\nnote that the proximity is determined by how many elements in the heap have OLD-ELEMENT-KEY\r\nas their cost, thereby residing unordered in the same subtree. If all elements in the heap\r\nhave OLD-ELEMENT-KEY as their value, the search degenerates to O(N).\nUse the value of OLD-ELEMENT-KEY to drive the search, approximating a O(logN) lookup time;\nnote that the proximity is determined by how many elements in the heap have OLD-ELEMENT-KEY\nas their cost, thereby residing unordered in the same subtree. If all elements in the heap\nhave OLD-ELEMENT-KEY as their value, the search degenerates to O(N).")
    public static final SubLObject heap_find_spot_of_element_alt(SubLObject v_heap, SubLObject element, SubLObject old_element_key, SubLObject test, SubLObject spot) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (spot == UNPROVIDED) {
            spot = $heap_root_index$.getGlobalValue();
        }
        {
            SubLObject heap_nodes = heap_impl_nodes(v_heap);
            SubLObject heap_count = heap_impl_next(v_heap);
            SubLObject current = aref(heap_nodes, spot);
            if (NIL != funcall(test, element, current)) {
                return spot;
            } else {
                if (NIL == apply_heap_predicate(v_heap, old_element_key, apply_heap_key(v_heap, current))) {
                    return NIL;
                }
            }
            {
                SubLObject left_child = add(spot, spot);
                if (left_child.numL(heap_count)) {
                    {
                        SubLObject location = heap_find_spot_of_element(v_heap, element, old_element_key, test, left_child);
                        if (NIL != location) {
                            return location;
                        }
                    }
                } else {
                    return NIL;
                }
                {
                    SubLObject right_child = add(ONE_INTEGER, left_child);
                    if (right_child.numL(heap_count)) {
                        return heap_find_spot_of_element(v_heap, element, old_element_key, test, right_child);
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Use the value of OLD-ELEMENT-KEY to drive the search, approximating a O(logN) lookup time;\r\nnote that the proximity is determined by how many elements in the heap have OLD-ELEMENT-KEY\r\nas their cost, thereby residing unordered in the same subtree. If all elements in the heap\r\nhave OLD-ELEMENT-KEY as their value, the search degenerates to O(N).\nUse the value of OLD-ELEMENT-KEY to drive the search, approximating a O(logN) lookup time;\nnote that the proximity is determined by how many elements in the heap have OLD-ELEMENT-KEY\nas their cost, thereby residing unordered in the same subtree. If all elements in the heap\nhave OLD-ELEMENT-KEY as their value, the search degenerates to O(N).")
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

    public static final SubLObject heap_unit_test_insert_remove_alt(SubLObject size, SubLObject predicate, SubLObject key, SubLObject transformer) {
        if (predicate == UNPROVIDED) {
            predicate = symbol_function($sym23$__);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (transformer == UNPROVIDED) {
            transformer = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vector = make_vector(size, UNPROVIDED);
                SubLObject v_heap = create_heap(size, predicate, key);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == heap_is_empty_p(v_heap)) {
                        Errors.error($str_alt55$The_heap_is_not_empty_after_creat);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject number = random.random(size);
                            SubLObject value = funcall(transformer, number);
                            set_aref(vector, i, value);
                            heap_insert(value, v_heap);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == heap_is_full_p(v_heap)) {
                        Errors.error($str_alt56$The_heap_is_not_full_after_popula);
                    }
                }
                {
                    SubLObject vector_var = vector;
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject var = aref(vector_var, element_num);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == heap_find(var, v_heap, symbol_function(EQUAL), UNPROVIDED)) {
                                    Errors.error($str_alt57$Cannot_find_element__A_in_the_hea, var);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!heap_find_spot_of_element(v_heap, var, funcall(key, var), UNPROVIDED, UNPROVIDED).isFixnum()) {
                                    Errors.error($str_alt58$Cannot_determine_index_of_element, var);
                                }
                            }
                        }
                    }
                }
                vector = Sort.sort(vector, predicate, key);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject element = heap_remove(v_heap);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!element.equal(aref(vector, subtract(size, i, ONE_INTEGER)))) {
                                    Errors.error($str_alt59$The_heap_and_the_vector_disagree_, i, aref(vector, i), element);
                                }
                            }
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == heap_is_empty_p(v_heap)) {
                        Errors.error($str_alt60$The_heap_is_not_empty_after_remov);
                    }
                }
            }
            return $SUCCESS;
        }
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

    public static final SubLObject heap_unit_test_sorting_alt(SubLObject string) {
        {
            SubLObject v_heap = create_min_heap(length(string), symbol_function(CHAR_CODE));
            SubLObject reference_string = Sort.sort(string_utilities.copy_string(string), symbol_function($sym65$_), symbol_function(CHAR_CODE));
            {
                SubLObject string_var = string;
                SubLObject end_var = length(string_var);
                SubLObject end_var_3 = end_var;
                SubLObject char_num = NIL;
                for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_3); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject curr = Strings.sublisp_char(string_var, char_num);
                        heap_enqueue(curr, v_heap);
                    }
                }
            }
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject string_var = reference_string;
                SubLObject end_var = length(string_var);
                SubLObject end_var_4 = end_var;
                SubLObject char_num = NIL;
                for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_4); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                        SubLObject curr = heap_remove(v_heap);
                        if (NIL == charE(v_char, curr)) {
                            Errors.warn($str_alt66$Heap__A_and_reference_string__A_d, v_heap, reference_string, index);
                            return NIL;
                        }
                        index = add(index, ONE_INTEGER);
                    }
                }
            }
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

    public static final SubLObject heap_test_example_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_heap_test_example(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject heap_test_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_heap_test_example(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject heap_test_example_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.heap.$heap_test_example_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject heap_test_example_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.heap.$heap_test_example_native.class ? T : NIL;
    }

    public static final SubLObject heap_test_example_priority_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_TEST_EXAMPLE_P);
        return v_object.getField2();
    }

    public static SubLObject heap_test_example_priority(final SubLObject v_object) {
        assert NIL != heap_test_example_p(v_object) : "! heap.heap_test_example_p(v_object) " + "heap.heap_test_example_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject heap_test_example_value_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HEAP_TEST_EXAMPLE_P);
        return v_object.getField3();
    }

    public static SubLObject heap_test_example_value(final SubLObject v_object) {
        assert NIL != heap_test_example_p(v_object) : "! heap.heap_test_example_p(v_object) " + "heap.heap_test_example_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_heap_test_example_priority_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_TEST_EXAMPLE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_heap_test_example_priority(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_test_example_p(v_object) : "! heap.heap_test_example_p(v_object) " + "heap.heap_test_example_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_heap_test_example_value_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HEAP_TEST_EXAMPLE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_heap_test_example_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != heap_test_example_p(v_object) : "! heap.heap_test_example_p(v_object) " + "heap.heap_test_example_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_heap_test_example_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.heap.$heap_test_example_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PRIORITY)) {
                        _csetf_heap_test_example_priority(v_new, current_value);
                    } else {
                        if (pcase_var.eql($VALUE)) {
                            _csetf_heap_test_example_value(v_new, current_value);
                        } else {
                            Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_heap_test_example(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.heap.$heap_test_example_native();
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

    public static final SubLObject print_heap_test_example_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_5 = v_object;
                    SubLObject stream_6 = stream;
                    write_string($str_alt24$__, stream_6, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_5), new SubLObject[]{ $STREAM, stream_6 });
                    write_char(CHAR_space, stream_6);
                    write_string($str_alt83$_priority_, stream, UNPROVIDED, UNPROVIDED);
                    princ(get_heap_test_example_priority(v_object), stream);
                    write_string($str_alt84$_value_, stream, UNPROVIDED, UNPROVIDED);
                    princ(get_heap_test_example_value(v_object), stream);
                    write_char(CHAR_space, stream_6);
                    write(pointer(v_object_5), new SubLObject[]{ $STREAM, stream_6, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_6);
                }
            }
            return v_object;
        }
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

    public static final SubLObject get_heap_test_example_priority_alt(SubLObject heap_test_example) {
        SubLTrampolineFile.checkType(heap_test_example, HEAP_TEST_EXAMPLE_P);
        return heap_test_example_priority(heap_test_example);
    }

    public static SubLObject get_heap_test_example_priority(final SubLObject heap_test_example) {
        assert NIL != heap_test_example_p(heap_test_example) : "! heap.heap_test_example_p(heap_test_example) " + ("heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) ") + heap_test_example;
        return heap_test_example_priority(heap_test_example);
    }

    public static final SubLObject change_heap_test_example_priority_alt(SubLObject heap_test_example, SubLObject new_priority) {
        SubLTrampolineFile.checkType(heap_test_example, HEAP_TEST_EXAMPLE_P);
        _csetf_heap_test_example_priority(heap_test_example, new_priority);
        return heap_test_example_priority(heap_test_example);
    }

    public static SubLObject change_heap_test_example_priority(final SubLObject heap_test_example, final SubLObject new_priority) {
        assert NIL != heap_test_example_p(heap_test_example) : "! heap.heap_test_example_p(heap_test_example) " + ("heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) ") + heap_test_example;
        _csetf_heap_test_example_priority(heap_test_example, new_priority);
        return heap_test_example_priority(heap_test_example);
    }

    public static final SubLObject get_heap_test_example_value_alt(SubLObject heap_test_example) {
        SubLTrampolineFile.checkType(heap_test_example, HEAP_TEST_EXAMPLE_P);
        return heap_test_example_value(heap_test_example);
    }

    public static SubLObject get_heap_test_example_value(final SubLObject heap_test_example) {
        assert NIL != heap_test_example_p(heap_test_example) : "! heap.heap_test_example_p(heap_test_example) " + ("heap.heap_test_example_p(heap_test_example) " + "CommonSymbols.NIL != heap.heap_test_example_p(heap_test_example) ") + heap_test_example;
        return heap_test_example_value(heap_test_example);
    }

    public static final SubLObject new_heap_test_example_alt(SubLObject priority, SubLObject value) {
        SubLTrampolineFile.checkType(priority, NUMBERP);
        {
            SubLObject example = make_heap_test_example(UNPROVIDED);
            _csetf_heap_test_example_priority(example, priority);
            _csetf_heap_test_example_value(example, value);
            return example;
        }
    }

    public static SubLObject new_heap_test_example(final SubLObject priority, final SubLObject value) {
        assert NIL != numberp(priority) : "! numberp(priority) " + ("Types.numberp(priority) " + "CommonSymbols.NIL != Types.numberp(priority) ") + priority;
        final SubLObject example = make_heap_test_example(UNPROVIDED);
        _csetf_heap_test_example_priority(example, priority);
        _csetf_heap_test_example_value(example, value);
        return example;
    }

    public static final SubLObject heap_unit_test_prioritizing_alt(SubLObject base_string, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (base_string == $COPYRIGHT_NOTICE) {
            return heap_unit_test_prioritizing(misc_utilities.kb_content_copyright_notice(), verboseP);
        }
        {
            SubLObject sizes = $list_alt87;
            SubLObject strings = list(base_string, reverse(base_string));
            SubLObject min_max_list = list(T, NIL);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_7 = sizes;
                    SubLObject size = NIL;
                    for (size = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , size = cdolist_list_var_7.first()) {
                        {
                            SubLObject cdolist_list_var_8 = min_max_list;
                            SubLObject minP = NIL;
                            for (minP = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , minP = cdolist_list_var_8.first()) {
                                result = heap_unit_test_priorities(string, size, verboseP, minP);
                                if (result != size) {
                                    return $FAILURE;
                                }
                            }
                        }
                    }
                }
            }
            return $SUCCESS;
        }
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

    public static final SubLObject heap_unit_test_priorities_alt(SubLObject string, SubLObject size, SubLObject verboseP, SubLObject minP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (minP == UNPROVIDED) {
            minP = T;
        }
        {
            SubLObject char_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject v_heap = (NIL != minP) ? ((SubLObject) (create_min_heap(size, symbol_function(GET_HEAP_TEST_EXAMPLE_PRIORITY)))) : create_max_heap(size, symbol_function(GET_HEAP_TEST_EXAMPLE_PRIORITY));
            if (NIL != verboseP) {
                Errors.warn($str_alt90$Doing_a__A_heap_of_size__D_on_str, NIL != minP ? ((SubLObject) ($$$min)) : $$$max, size, string);
            }
            {
                SubLObject string_var = string;
                SubLObject end_var = length(string_var);
                SubLObject end_var_9 = end_var;
                SubLObject char_num = NIL;
                for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_9); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                        SubLObject map_entry = dictionary.dictionary_lookup(char_map, v_char, UNPROVIDED);
                        if (NIL == map_entry) {
                            map_entry = new_heap_test_example(NIL != minP ? ((SubLObject) (ONE_INTEGER)) : size, v_char);
                            dictionary.dictionary_enter(char_map, v_char, map_entry);
                            if (NIL != heap_is_full_p(v_heap)) {
                                {
                                    SubLObject loser = heap_remove(v_heap);
                                    dictionary.dictionary_remove(char_map, heap_test_example_value(loser));
                                    if (NIL != verboseP) {
                                        Errors.warn($str_alt93$_A_lost_and_left_, loser);
                                    }
                                }
                            }
                            heap_enqueue(map_entry, v_heap);
                            if (NIL != verboseP) {
                                Errors.warn($str_alt94$Adding__A_to_heap____elements_, map_entry, heap_count(v_heap));
                            }
                        } else {
                            {
                                SubLObject old_priority = get_heap_test_example_priority(map_entry);
                                SubLObject new_priority = (NIL != minP) ? ((SubLObject) (add(old_priority, ONE_INTEGER))) : subtract(old_priority, ONE_INTEGER);
                                SubLObject old_state = NIL;
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    princ(heap_elements_fast(v_heap), stream);
                                    old_state = get_output_stream_string(stream);
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
                                change_heap_test_example_priority(map_entry, new_priority);
                                if (NIL == heap_reconsider(map_entry, v_heap, old_priority, UNPROVIDED)) {
                                    if (NIL != verboseP) {
                                        Errors.error($str_alt95$Changing_the_priority_of__A_from_, new SubLObject[]{ map_entry, old_priority, new_priority, old_state, heap_elements_fast(v_heap) });
                                    }
                                }
                            }
                        }
                        heap_unit_test_priorities_still_orderedP(v_heap, minP);
                    }
                }
            }
        }
        return size;
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

    public static final SubLObject heap_unit_test_priorities_still_orderedP_alt(SubLObject original_heap, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = T;
        }
        {
            SubLObject clone = clone_heap(original_heap);
            SubLObject v_heap = clone;
            SubLObject comparator = (NIL != minP) ? ((SubLObject) (symbol_function($sym23$__))) : symbol_function($sym34$__);
            SubLObject comparator_name = (NIL != minP) ? ((SubLObject) ($str_alt96$__)) : $str_alt97$__;
            SubLObject previous_priority = (NIL != minP) ? ((SubLObject) ($most_negative_fixnum$.getGlobalValue())) : $most_positive_fixnum$.getGlobalValue();
            while (NIL == heap_is_empty_p(v_heap)) {
                {
                    SubLObject map_entry = heap_remove(v_heap);
                    SubLObject priority = get_heap_test_example_priority(map_entry);
                    if (NIL == funcall(comparator, previous_priority, priority)) {
                        Errors.error($str_alt98$The_heap_is_not_in_proper_order__, new SubLObject[]{ previous_priority, comparator_name, priority, heap_elements_fast(original_heap) });
                    }
                    previous_priority = priority;
                }
            } 
            return T;
        }
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
        declareFunction("heap_impl_print_function_trampoline", "HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("heap_impl_p", "HEAP-IMPL-P", 1, 0, false);
        new heap.$heap_impl_p$UnaryFunction();
        declareFunction("heap_impl_next", "HEAP-IMPL-NEXT", 1, 0, false);
        declareFunction("heap_impl_nodes", "HEAP-IMPL-NODES", 1, 0, false);
        declareFunction("heap_impl_predicate", "HEAP-IMPL-PREDICATE", 1, 0, false);
        declareFunction("heap_impl_key", "HEAP-IMPL-KEY", 1, 0, false);
        declareFunction("_csetf_heap_impl_next", "_CSETF-HEAP-IMPL-NEXT", 2, 0, false);
        declareFunction("_csetf_heap_impl_nodes", "_CSETF-HEAP-IMPL-NODES", 2, 0, false);
        declareFunction("_csetf_heap_impl_predicate", "_CSETF-HEAP-IMPL-PREDICATE", 2, 0, false);
        declareFunction("_csetf_heap_impl_key", "_CSETF-HEAP-IMPL-KEY", 2, 0, false);
        declareFunction("make_heap_impl", "MAKE-HEAP-IMPL", 0, 1, false);
        declareFunction("visit_defstruct_heap_impl", "VISIT-DEFSTRUCT-HEAP-IMPL", 2, 0, false);
        declareFunction("visit_defstruct_object_heap_impl_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-IMPL-METHOD", 2, 0, false);
        declareFunction("is_empty_heap_elementP", "IS-EMPTY-HEAP-ELEMENT?", 1, 0, false);
        declareFunction("new_heap_impl", "NEW-HEAP-IMPL", 1, 2, false);
        declareFunction("clone_existing_heap", "CLONE-EXISTING-HEAP", 1, 0, false);
        declareFunction("print_heap_impl", "PRINT-HEAP-IMPL", 3, 0, false);
        declareFunction("create_heap", "CREATE-HEAP", 1, 2, false);
        declareFunction("clear_heap", "CLEAR-HEAP", 1, 0, false);
        declareFunction("clone_heap", "CLONE-HEAP", 1, 0, false);
        declareFunction("heap_p", "HEAP-P", 1, 0, false);
        declareFunction("heap_size", "HEAP-SIZE", 1, 0, false);
        declareFunction("heap_count", "HEAP-COUNT", 1, 0, false);
        declareFunction("heap_predicate", "HEAP-PREDICATE", 1, 0, false);
        declareFunction("heap_key", "HEAP-KEY", 1, 0, false);
        declareFunction("apply_heap_predicate", "APPLY-HEAP-PREDICATE", 3, 0, false);
        declareFunction("apply_heap_key", "APPLY-HEAP-KEY", 2, 0, false);
        declareFunction("heap_is_empty_p", "HEAP-IS-EMPTY-P", 1, 0, false);
        declareFunction("heap_is_full_p", "HEAP-IS-FULL-P", 1, 0, false);
        declareFunction("create_max_heap", "CREATE-MAX-HEAP", 1, 1, false);
        declareFunction("create_min_heap", "CREATE-MIN-HEAP", 1, 1, false);
        declareFunction("heap_insert", "HEAP-INSERT", 2, 0, false);
        declareFunction("heap_enqueue", "HEAP-ENQUEUE", 2, 0, false);
        declareFunction("heap_peek", "HEAP-PEEK", 1, 0, false);
        declareFunction("heap_dequeue", "HEAP-DEQUEUE", 1, 0, false);
        declareFunction("heap_remove", "HEAP-REMOVE", 1, 0, false);
        declareFunction("heap_find", "HEAP-FIND", 2, 2, false);
        declareFunction("heap_reconsider", "HEAP-RECONSIDER", 3, 1, false);
        declareFunction("heap_find_spot", "HEAP-FIND-SPOT", 4, 0, false);
        declareFunction("heap_reconsider_trickle_down", "HEAP-RECONSIDER-TRICKLE-DOWN", 2, 0, false);
        declareFunction("heap_reconsider_bubble_up", "HEAP-RECONSIDER-BUBBLE-UP", 2, 0, false);
        declareFunction("new_heap_iterator", "NEW-HEAP-ITERATOR", 1, 1, false);
        declareFunction("make_heap_iterator_state", "MAKE-HEAP-ITERATOR-STATE", 2, 0, false);
        declareFunction("heap_iterator_next", "HEAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction("expand_heap_iterator_stack", "EXPAND-HEAP-ITERATOR-STACK", 1, 0, false);
        declareFunction("expand_current_heap_iterator_stack_top", "EXPAND-CURRENT-HEAP-ITERATOR-STACK-TOP", 1, 0, false);
        declareFunction("push_heap_iterator_stack", "PUSH-HEAP-ITERATOR-STACK", 3, 0, false);
        declareFunction("pop_heap_iterator_stack", "POP-HEAP-ITERATOR-STACK", 1, 0, false);
        declareFunction("top_heap_iterator_stack_action", "TOP-HEAP-ITERATOR-STACK-ACTION", 1, 0, false);
        declareFunction("top_heap_iterator_stack_node_index", "TOP-HEAP-ITERATOR-STACK-NODE-INDEX", 1, 0, false);
        declareFunction("top_heap_iterator_stack_node", "TOP-HEAP-ITERATOR-STACK-NODE", 1, 0, false);
        declareFunction("heap_iterator_done", "HEAP-ITERATOR-DONE", 1, 0, false);
        declareFunction("heap_keys", "HEAP-KEYS", 1, 0, false);
        declareFunction("heap_keys_fast", "HEAP-KEYS-FAST", 1, 0, false);
        declareFunction("heap_elements_fast", "HEAP-ELEMENTS-FAST", 1, 0, false);
        declareFunction("heap_elements", "HEAP-ELEMENTS", 1, 0, false);
        declareFunction("heap_root", "HEAP-ROOT", 1, 0, false);
        declareFunction("set_heap_root", "SET-HEAP-ROOT", 2, 0, false);
        declareFunction("heap_delete_last", "HEAP-DELETE-LAST", 1, 0, false);
        declareFunction("heap_bubble_up", "HEAP-BUBBLE-UP", 2, 0, false);
        declareFunction("heap_trickle_down", "HEAP-TRICKLE-DOWN", 2, 0, false);
        declareFunction("heap_find_spot_of_element", "HEAP-FIND-SPOT-OF-ELEMENT", 3, 2, false);
        declareFunction("heap_unit_test_insert_remove", "HEAP-UNIT-TEST-INSERT-REMOVE", 1, 3, false);
        declareFunction("heap_unit_test_sorting", "HEAP-UNIT-TEST-SORTING", 1, 0, false);
        declareFunction("heap_test_example_print_function_trampoline", "HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("heap_test_example_p", "HEAP-TEST-EXAMPLE-P", 1, 0, false);
        new heap.$heap_test_example_p$UnaryFunction();
        declareFunction("heap_test_example_priority", "HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        declareFunction("heap_test_example_value", "HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        declareFunction("_csetf_heap_test_example_priority", "_CSETF-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        declareFunction("_csetf_heap_test_example_value", "_CSETF-HEAP-TEST-EXAMPLE-VALUE", 2, 0, false);
        declareFunction("make_heap_test_example", "MAKE-HEAP-TEST-EXAMPLE", 0, 1, false);
        declareFunction("visit_defstruct_heap_test_example", "VISIT-DEFSTRUCT-HEAP-TEST-EXAMPLE", 2, 0, false);
        declareFunction("visit_defstruct_object_heap_test_example_method", "VISIT-DEFSTRUCT-OBJECT-HEAP-TEST-EXAMPLE-METHOD", 2, 0, false);
        declareFunction("print_heap_test_example", "PRINT-HEAP-TEST-EXAMPLE", 3, 0, false);
        declareFunction("get_heap_test_example_priority", "GET-HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
        declareFunction("change_heap_test_example_priority", "CHANGE-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
        declareFunction("get_heap_test_example_value", "GET-HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
        declareFunction("new_heap_test_example", "NEW-HEAP-TEST-EXAMPLE", 2, 0, false);
        declareFunction("heap_unit_test_prioritizing", "HEAP-UNIT-TEST-PRIORITIZING", 1, 1, false);
        declareFunction("heap_unit_test_priorities", "HEAP-UNIT-TEST-PRIORITIES", 2, 2, false);
        declareFunction("heap_unit_test_priorities_still_orderedP", "HEAP-UNIT-TEST-PRIORITIES-STILL-ORDERED?", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_heap_file_alt() {
        defconstant("*DTP-HEAP-IMPL*", HEAP_IMPL);
        deflexical("*EMPTY-HEAP-ELEMENT*", NIL != boundp($empty_heap_element$) ? ((SubLObject) ($empty_heap_element$.getGlobalValue())) : make_symbol($$$Empty_Heap_Element));
        deflexical("*HEAP-ROOT-INDEX*", ONE_INTEGER);
        defconstant("*DTP-HEAP-TEST-EXAMPLE*", HEAP_TEST_EXAMPLE);
        return NIL;
    }

    public static SubLObject init_heap_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-HEAP-IMPL*", HEAP_IMPL);
            deflexical("*EMPTY-HEAP-ELEMENT*", SubLTrampolineFile.maybeDefault($empty_heap_element$, $empty_heap_element$, () -> make_symbol($$$Empty_Heap_Element)));
            deflexical("*HEAP-ROOT-INDEX*", ONE_INTEGER);
            defconstant("*DTP-HEAP-TEST-EXAMPLE*", HEAP_TEST_EXAMPLE);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EMPTY-HEAP-ELEMENT*", NIL != boundp($empty_heap_element$) ? ((SubLObject) ($empty_heap_element$.getGlobalValue())) : make_symbol($$$Empty_Heap_Element));
        }
        return NIL;
    }

    public static SubLObject init_heap_file_Previous() {
        defconstant("*DTP-HEAP-IMPL*", HEAP_IMPL);
        deflexical("*EMPTY-HEAP-ELEMENT*", SubLTrampolineFile.maybeDefault($empty_heap_element$, $empty_heap_element$, () -> make_symbol($$$Empty_Heap_Element)));
        deflexical("*HEAP-ROOT-INDEX*", ONE_INTEGER);
        defconstant("*DTP-HEAP-TEST-EXAMPLE*", HEAP_TEST_EXAMPLE);
        return NIL;
    }

    public static final SubLObject setup_heap_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_heap_impl$.getGlobalValue(), symbol_function(HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HEAP_IMPL_NEXT, _CSETF_HEAP_IMPL_NEXT);
        def_csetf(HEAP_IMPL_NODES, _CSETF_HEAP_IMPL_NODES);
        def_csetf(HEAP_IMPL_PREDICATE, _CSETF_HEAP_IMPL_PREDICATE);
        def_csetf(HEAP_IMPL_KEY, _CSETF_HEAP_IMPL_KEY);
        identity(HEAP_IMPL);
        declare_defglobal($empty_heap_element$);
        define_test_case_table_int(HEAP_UNIT_TEST_INSERT_REMOVE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
        define_test_case_table_int(HEAP_UNIT_TEST_SORTING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt63);
        define_test_case_table_int(HEAP_UNIT_TEST_PRIORITIZING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt68);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_heap_test_example$.getGlobalValue(), symbol_function(HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HEAP_TEST_EXAMPLE_PRIORITY, _CSETF_HEAP_TEST_EXAMPLE_PRIORITY);
        def_csetf(HEAP_TEST_EXAMPLE_VALUE, _CSETF_HEAP_TEST_EXAMPLE_VALUE);
        identity(HEAP_TEST_EXAMPLE);
        return NIL;
    }

    public static SubLObject setup_heap_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(HEAP_UNIT_TEST_INSERT_REMOVE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
            define_test_case_table_int(HEAP_UNIT_TEST_SORTING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt63);
            define_test_case_table_int(HEAP_UNIT_TEST_PRIORITIZING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt68);
        }
        return NIL;
    }

    public static SubLObject setup_heap_file_Previous() {
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

    static private final SubLList $list_alt2 = list(makeSymbol("NEXT"), makeSymbol("NODES"), makeSymbol("PREDICATE"), makeSymbol("KEY"));

    static private final SubLList $list_alt3 = list($NEXT, makeKeyword("NODES"), makeKeyword("PREDICATE"), makeKeyword("KEY"));

    static private final SubLList $list_alt4 = list(makeSymbol("HEAP-IMPL-NEXT"), makeSymbol("HEAP-IMPL-NODES"), makeSymbol("HEAP-IMPL-PREDICATE"), makeSymbol("HEAP-IMPL-KEY"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-HEAP-IMPL-NEXT"), makeSymbol("_CSETF-HEAP-IMPL-NODES"), makeSymbol("_CSETF-HEAP-IMPL-PREDICATE"), makeSymbol("_CSETF-HEAP-IMPL-KEY"));

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
    }

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym23$__ = makeSymbol("<=");

    static private final SubLString $str_alt24$__ = makeString("#<");

    static private final SubLString $str_alt26$HEAP_ = makeString("HEAP ");

    static private final SubLString $str_alt27$_of_key_ = makeString(" of key ");

    static private final SubLString $str_alt28$_ = makeString(" ");

    static private final SubLString $str_alt29$_ = makeString("/");

    static private final SubLSymbol $sym34$__ = makeSymbol(">=");

    static private final SubLString $str_alt35$The_heap__A_is_full__must_remove_ = makeString("The heap ~A is full; must remove item before insert.");

    static private final SubLString $str_alt36$Cannot_remove_an_item_from_empty_ = makeString("Cannot remove an item from empty heap ~A.");

    static private final SubLString $str_alt41$Error_in_heap_iterator__iterator_ = makeString("Error in heap iterator: iterator-next called without :SHOW on top.");

    public static final class $heap_impl_p$UnaryFunction extends UnaryFunction {
        public $heap_impl_p$UnaryFunction() {
            super(extractFunctionNamed("HEAP-IMPL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return heap_impl_p(arg1);
        }
    }

    static private final SubLString $str_alt42$Invalid_sate_transition__unknown_ = makeString("Invalid sate transition: unknown code ~A on action stack in heap iterator.");

    static private final SubLList $list_alt43 = list(makeSymbol("STACK-POINTER"), makeSymbol("ACTION-STACK"), makeSymbol("NODE-STACK"), makeSymbol("HEAP"), makeSymbol("REVERSE-ORDER?"));

    static private final SubLString $str_alt44$Error__stack_underflow_during_hea = makeString("Error: stack underflow during heap iteration.");

    static private final SubLString $str_alt45$Error_in_heap_iterator_state_ = makeString("Error in heap iterator state.");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt54 = list(list(list(ONE_INTEGER), makeKeyword("SUCCESS")), list(list(TEN_INTEGER, makeSymbol("<="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")), list(list(makeInteger(212), makeSymbol(">="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt55$The_heap_is_not_empty_after_creat = makeString("The heap is not empty after creation.");

    static private final SubLString $str_alt56$The_heap_is_not_full_after_popula = makeString("The heap is not full after population");

    static private final SubLString $str_alt57$Cannot_find_element__A_in_the_hea = makeString("Cannot find element ~A in the heap.");

    public static final class $heap_test_example_p$UnaryFunction extends UnaryFunction {
        public $heap_test_example_p$UnaryFunction() {
            super(extractFunctionNamed("HEAP-TEST-EXAMPLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return heap_test_example_p(arg1);
        }
    }

    static private final SubLString $str_alt58$Cannot_determine_index_of_element = makeString("Cannot determine index of element ~A in the heap.");

    static private final SubLString $str_alt59$The_heap_and_the_vector_disagree_ = makeString("The heap and the vector disagree on priority of item #~A: vector sez ~A, heap sez ~A");

    static private final SubLString $str_alt60$The_heap_is_not_empty_after_remov = makeString("The heap is not empty after removing all");

    static private final SubLList $list_alt63 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")));

    static private final SubLSymbol $sym65$_ = makeSymbol("<");

    static private final SubLString $str_alt66$Heap__A_and_reference_string__A_d = makeString("Heap ~A and reference string ~A differ at position ~D.");

    static private final SubLList $list_alt68 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")), list(list(makeKeyword("COPYRIGHT-NOTICE")), makeKeyword("SUCCESS")));

    static private final SubLList $list_alt71 = list(makeSymbol("PRIORITY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt72 = list(makeKeyword("PRIORITY"), makeKeyword("VALUE"));

    static private final SubLList $list_alt73 = list(makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("HEAP-TEST-EXAMPLE-VALUE"));

    static private final SubLList $list_alt74 = list(makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE"));

    static private final SubLString $str_alt83$_priority_ = makeString(" priority ");

    static private final SubLString $str_alt84$_value_ = makeString(" value ");

    static private final SubLList $list_alt87 = list(FIVE_INTEGER, TEN_INTEGER, FIFTEEN_INTEGER, TWENTY_INTEGER, makeInteger(25));

    static private final SubLString $str_alt90$Doing_a__A_heap_of_size__D_on_str = makeString("Doing a ~A heap of size ~D on string ~A.~%");

    static private final SubLString $str_alt93$_A_lost_and_left_ = makeString("~A lost and left.");

    static private final SubLString $str_alt94$Adding__A_to_heap____elements_ = makeString("Adding ~A to heap -> elements.");

    static private final SubLString $str_alt95$Changing_the_priority_of__A_from_ = makeString("Changing the priority of ~A from ~D to ~D had no effect on reconsider.~%Prior: ~A~%Current: ~A~%");

    static private final SubLString $str_alt96$__ = makeString("<=");

    static private final SubLString $str_alt97$__ = makeString(">=");

    static private final SubLString $str_alt98$The_heap_is_not_in_proper_order__ = makeString("The heap is not in proper order: ~D is not ~A ~D.~%Heap: ~A");
}

/**
 * Total time: 362 ms
 */
