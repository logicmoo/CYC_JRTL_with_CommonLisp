package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.deck;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.deck.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.deck.*; 
 public final class deck extends SubLTranslatedFile {
    public static final SubLFile me = new deck();

    public static final String myName = "com.cyc.cycjava.cycl.deck";

    public static final String myFingerPrint = "2c9cb4d6c59cfd261cec6fde466ae4a22377ac81f053bfa23d0dacb169906488";

    // defconstant
    public static final SubLSymbol $dtp_deck$ = makeSymbol("*DTP-DECK*");

    // Internal Constants
    public static final SubLSymbol DECK = makeSymbol("DECK");

    public static final SubLSymbol DECK_P = makeSymbol("DECK-P");

    public static final SubLList $list2 = list(makeSymbol("TYPE"), makeSymbol("DATA"));

    public static final SubLList $list3 = list(makeKeyword("TYPE"), makeKeyword("DATA"));

    public static final SubLList $list4 = list(makeSymbol("DECK-TYPE"), makeSymbol("DECK-DATA"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-DECK-TYPE"), makeSymbol("_CSETF-DECK-DATA"));

    public static final SubLSymbol PRINT_DECK = makeSymbol("PRINT-DECK");

    public static final SubLSymbol DECK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DECK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DECK-P"));

    private static final SubLSymbol DECK_TYPE = makeSymbol("DECK-TYPE");

    private static final SubLSymbol _CSETF_DECK_TYPE = makeSymbol("_CSETF-DECK-TYPE");

    private static final SubLSymbol DECK_DATA = makeSymbol("DECK-DATA");

    private static final SubLSymbol _CSETF_DECK_DATA = makeSymbol("_CSETF-DECK-DATA");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_DECK = makeSymbol("MAKE-DECK");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DECK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DECK-METHOD");





    private static final SubLSymbol DECK_TYPE_P = makeSymbol("DECK-TYPE-P");

    public static SubLObject deck_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_deck(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject deck_p(final SubLObject v_object) {
        return v_object.getClass() == $deck_native.class ? T : NIL;
    }

    public static SubLObject deck_type(final SubLObject v_object) {
        assert NIL != deck_p(v_object) : "deck.deck_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject deck_data(final SubLObject v_object) {
        assert NIL != deck_p(v_object) : "deck.deck_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_deck_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != deck_p(v_object) : "deck.deck_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_deck_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != deck_p(v_object) : "deck.deck_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_deck(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $deck_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_deck_type(v_new, current_value);
            } else
                if (pcase_var.eql($DATA)) {
                    _csetf_deck_data(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_deck(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DECK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, deck_type(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, deck_data(obj));
        funcall(visitor_fn, obj, $END, MAKE_DECK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_deck_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deck(obj, visitor_fn);
    }

    public static SubLObject print_deck(final SubLObject v_deck, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_deck, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_deck, T, T);
            princ(deck_type(v_deck), stream);
            princ(deck_size(v_deck), stream);
            print_macros.print_unreadable_object_postamble(stream, v_deck, T, T);
        }
        return v_deck;
    }

    public static SubLObject deck_type_p(final SubLObject v_object) {
        return makeBoolean(($QUEUE == v_object) || ($STACK == v_object));
    }

    public static SubLObject create_deck(final SubLObject type) {
        assert NIL != deck_type_p(type) : "deck.deck_type_p(type) " + "CommonSymbols.NIL != deck.deck_type_p(type) " + type;
        final SubLObject v_deck = make_deck(UNPROVIDED);
        if (type.eql($QUEUE)) {
            _csetf_deck_type(v_deck, $QUEUE);
            _csetf_deck_data(v_deck, queues.create_queue(UNPROVIDED));
        } else
            if (type.eql($STACK)) {
                _csetf_deck_type(v_deck, $STACK);
                _csetf_deck_data(v_deck, stacks.create_stack());
            }

        return v_deck;
    }

    public static SubLObject clear_deck(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            queues.clear_queue(deck_data(v_deck));
        } else
            if (pcase_var.eql($STACK)) {
                stacks.clear_stack(deck_data(v_deck));
            }

        return v_deck;
    }

    public static SubLObject deck_empty_p(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_empty_p(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_empty_p(deck_data(v_deck));
        }
        return NIL;
    }

    public static SubLObject deck_size(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_size(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_size(deck_data(v_deck));
        }
        return NIL;
    }

    public static SubLObject deck_elements(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_elements(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_elements(deck_data(v_deck));
        }
        return NIL;
    }

    public static SubLObject deck_push(final SubLObject elt, final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            queues.enqueue(elt, deck_data(v_deck));
        } else
            if (pcase_var.eql($STACK)) {
                stacks.stack_push(elt, deck_data(v_deck));
            }

        return v_deck;
    }

    public static SubLObject deck_pop(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.dequeue(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_pop(deck_data(v_deck));
        }
        return NIL;
    }

    public static SubLObject deck_peek(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_peek(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_peek(deck_data(v_deck));
        }
        return NIL;
    }

    public static SubLObject remdeck(final SubLObject item, final SubLObject v_deck, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != deck_p(v_deck) : "deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) " + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            queues.remqueue(item, deck_data(v_deck), test);
        } else
            if (pcase_var.eql($STACK)) {
                stacks.stack_delete(item, deck_data(v_deck), test);
            }

        return v_deck;
    }

    public static SubLObject declare_deck_file() {
        declareFunction(me, "deck_print_function_trampoline", "DECK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "deck_p", "DECK-P", 1, 0, false);
        new deck.$deck_p$UnaryFunction();
        declareFunction(me, "deck_type", "DECK-TYPE", 1, 0, false);
        declareFunction(me, "deck_data", "DECK-DATA", 1, 0, false);
        declareFunction(me, "_csetf_deck_type", "_CSETF-DECK-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_deck_data", "_CSETF-DECK-DATA", 2, 0, false);
        declareFunction(me, "make_deck", "MAKE-DECK", 0, 1, false);
        declareFunction(me, "visit_defstruct_deck", "VISIT-DEFSTRUCT-DECK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_deck_method", "VISIT-DEFSTRUCT-OBJECT-DECK-METHOD", 2, 0, false);
        declareFunction(me, "print_deck", "PRINT-DECK", 3, 0, false);
        declareFunction(me, "deck_type_p", "DECK-TYPE-P", 1, 0, false);
        declareFunction(me, "create_deck", "CREATE-DECK", 1, 0, false);
        declareFunction(me, "clear_deck", "CLEAR-DECK", 1, 0, false);
        declareFunction(me, "deck_empty_p", "DECK-EMPTY-P", 1, 0, false);
        declareFunction(me, "deck_size", "DECK-SIZE", 1, 0, false);
        declareFunction(me, "deck_elements", "DECK-ELEMENTS", 1, 0, false);
        declareFunction(me, "deck_push", "DECK-PUSH", 2, 0, false);
        declareFunction(me, "deck_pop", "DECK-POP", 1, 0, false);
        declareFunction(me, "deck_peek", "DECK-PEEK", 1, 0, false);
        declareFunction(me, "remdeck", "REMDECK", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_deck_file() {
        defconstant("*DTP-DECK*", DECK);
        return NIL;
    }

    public static SubLObject setup_deck_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_deck$.getGlobalValue(), symbol_function(DECK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(DECK_TYPE, _CSETF_DECK_TYPE);
        def_csetf(DECK_DATA, _CSETF_DECK_DATA);
        identity(DECK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_deck$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DECK_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deck_file();
    }

    @Override
    public void initializeVariables() {
        init_deck_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deck_file();
    }

    static {


























    }

    public static final class $deck_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $data;

        private static final SubLStructDeclNative structDecl;

        private $deck_native() {
            this.$type = Lisp.NIL;
            this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$data;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$data = value;
        }

        static {
            structDecl = makeStructDeclNative($deck_native.class, DECK, DECK_P, $list2, $list3, new String[]{ "$type", "$data" }, $list4, $list5, PRINT_DECK);
        }
    }

    public static final class $deck_p$UnaryFunction extends UnaryFunction {
        public $deck_p$UnaryFunction() {
            super(extractFunctionNamed("DECK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return deck_p(arg1);
        }
    }
}

/**
 * Total time: 176 ms
 */
