/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DECK
 * source file: /cyc/top/cycl/deck.lisp
 * created:     2019/07/03 17:37:13
 */
public final class deck extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $deck_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.deck.$deck_native.this.$type;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.deck.$deck_native.this.$data;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.deck.$deck_native.this.$type = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.deck.$deck_native.this.$data = value;
        }

        public SubLObject $type = Lisp.NIL;

        public SubLObject $data = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.deck.$deck_native.class, DECK, DECK_P, $list_alt2, $list_alt3, new String[]{ "$type", "$data" }, $list_alt4, $list_alt5, PRINT_DECK);
    }

    public static final SubLFile me = new deck();

 public static final String myName = "com.cyc.cycjava.cycl.deck";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_deck$ = makeSymbol("*DTP-DECK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol DECK = makeSymbol("DECK");

    private static final SubLSymbol DECK_P = makeSymbol("DECK-P");

    static private final SubLList $list2 = list(makeSymbol("TYPE"), makeSymbol("DATA"));

    static private final SubLList $list3 = list($TYPE, $DATA);

    static private final SubLList $list4 = list(makeSymbol("DECK-TYPE"), makeSymbol("DECK-DATA"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-DECK-TYPE"), makeSymbol("_CSETF-DECK-DATA"));

    private static final SubLSymbol PRINT_DECK = makeSymbol("PRINT-DECK");

    private static final SubLSymbol DECK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DECK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DECK-P"));

    private static final SubLSymbol DECK_TYPE = makeSymbol("DECK-TYPE");

    private static final SubLSymbol _CSETF_DECK_TYPE = makeSymbol("_CSETF-DECK-TYPE");

    private static final SubLSymbol DECK_DATA = makeSymbol("DECK-DATA");

    private static final SubLSymbol _CSETF_DECK_DATA = makeSymbol("_CSETF-DECK-DATA");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_DECK = makeSymbol("MAKE-DECK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DECK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DECK-METHOD");

    private static final SubLSymbol DECK_TYPE_P = makeSymbol("DECK-TYPE-P");

    public static final SubLObject deck_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_deck(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject deck_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_deck(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject deck_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.deck.$deck_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject deck_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.deck.$deck_native.class ? T : NIL;
    }

    public static final SubLObject deck_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DECK_P);
        return v_object.getField2();
    }

    public static SubLObject deck_type(final SubLObject v_object) {
        assert NIL != deck_p(v_object) : "! deck.deck_p(v_object) " + "deck.deck_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject deck_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DECK_P);
        return v_object.getField3();
    }

    public static SubLObject deck_data(final SubLObject v_object) {
        assert NIL != deck_p(v_object) : "! deck.deck_p(v_object) " + "deck.deck_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_deck_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DECK_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_deck_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != deck_p(v_object) : "! deck.deck_p(v_object) " + "deck.deck_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_deck_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DECK_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_deck_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != deck_p(v_object) : "! deck.deck_p(v_object) " + "deck.deck_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_deck_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.deck.$deck_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TYPE)) {
                        _csetf_deck_type(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DATA)) {
                            _csetf_deck_data(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_deck(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.deck.$deck_native();
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

    public static final SubLObject print_deck_alt(SubLObject v_deck, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_deck, stream);
            } else {
                {
                    SubLObject v_object = v_deck;
                    SubLObject stream_1 = stream;
                    write_string($str_alt15$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    princ(deck_type(v_deck), stream);
                    princ(deck_size(v_deck), stream);
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return v_deck;
        }
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

    /**
     * Return T iff OBJECT is a valid deck type.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid deck type.")
    public static final SubLObject deck_type_p_alt(SubLObject v_object) {
        return makeBoolean(($QUEUE == v_object) || ($STACK == v_object));
    }

    @LispMethod(comment = "Return T iff OBJECT is a valid deck type.")
    public static SubLObject deck_type_p(final SubLObject v_object) {
        return makeBoolean(($QUEUE == v_object) || ($STACK == v_object));
    }

    /**
     * Return a new, empty deck.
     */
    @LispMethod(comment = "Return a new, empty deck.")
    public static final SubLObject create_deck_alt(SubLObject type) {
        SubLTrampolineFile.checkType(type, DECK_TYPE_P);
        {
            SubLObject v_deck = make_deck(UNPROVIDED);
            SubLObject pcase_var = type;
            if (pcase_var.eql($QUEUE)) {
                _csetf_deck_type(v_deck, $QUEUE);
                _csetf_deck_data(v_deck, queues.create_queue());
            } else {
                if (pcase_var.eql($STACK)) {
                    _csetf_deck_type(v_deck, $STACK);
                    _csetf_deck_data(v_deck, stacks.create_stack());
                }
            }
            return v_deck;
        }
    }

    @LispMethod(comment = "Return a new, empty deck.")
    public static SubLObject create_deck(final SubLObject type) {
        assert NIL != deck_type_p(type) : "! deck.deck_type_p(type) " + ("deck.deck_type_p(type) " + "CommonSymbols.NIL != deck.deck_type_p(type) ") + type;
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

    /**
     * Clear DECK and return it.
     */
    @LispMethod(comment = "Clear DECK and return it.")
    public static final SubLObject clear_deck_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                queues.clear_queue(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    stacks.clear_stack(deck_data(v_deck));
                }
            }
        }
        return v_deck;
    }

    @LispMethod(comment = "Clear DECK and return it.")
    public static SubLObject clear_deck(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            queues.clear_queue(deck_data(v_deck));
        } else
            if (pcase_var.eql($STACK)) {
                stacks.clear_stack(deck_data(v_deck));
            }

        return v_deck;
    }

    /**
     * Return T iff DECK is empty.
     */
    @LispMethod(comment = "Return T iff DECK is empty.")
    public static final SubLObject deck_empty_p_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                return queues.queue_empty_p(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    return stacks.stack_empty_p(deck_data(v_deck));
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff DECK is empty.
     */
    @LispMethod(comment = "Return T iff DECK is empty.")
    public static SubLObject deck_empty_p(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_empty_p(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_empty_p(deck_data(v_deck));
        }
        return NIL;
    }

    /**
     * Return the number of elements in DECK.
     */
    @LispMethod(comment = "Return the number of elements in DECK.")
    public static final SubLObject deck_size_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                return queues.queue_size(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    return stacks.stack_size(deck_data(v_deck));
                }
            }
        }
        return NIL;
    }

    /**
     * Return the number of elements in DECK.
     */
    @LispMethod(comment = "Return the number of elements in DECK.")
    public static SubLObject deck_size(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_size(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_size(deck_data(v_deck));
        }
        return NIL;
    }

    /**
     * Return a list of the elements in DECK.
     */
    @LispMethod(comment = "Return a list of the elements in DECK.")
    public static final SubLObject deck_elements_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                return queues.queue_elements(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    return stacks.stack_elements(deck_data(v_deck));
                }
            }
        }
        return NIL;
    }

    /**
     * Return a list of the elements in DECK.
     */
    @LispMethod(comment = "Return a list of the elements in DECK.")
    public static SubLObject deck_elements(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_elements(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_elements(deck_data(v_deck));
        }
        return NIL;
    }

    /**
     * Add an element ELT to DECK.  Returns DECK
     */
    @LispMethod(comment = "Add an element ELT to DECK.  Returns DECK")
    public static final SubLObject deck_push_alt(SubLObject elt, SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                queues.enqueue(elt, deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    stacks.stack_push(elt, deck_data(v_deck));
                }
            }
        }
        return v_deck;
    }

    /**
     * Add an element ELT to DECK.  Returns DECK
     */
    @LispMethod(comment = "Add an element ELT to DECK.  Returns DECK")
    public static SubLObject deck_push(final SubLObject elt, final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            queues.enqueue(elt, deck_data(v_deck));
        } else
            if (pcase_var.eql($STACK)) {
                stacks.stack_push(elt, deck_data(v_deck));
            }

        return v_deck;
    }

    /**
     * Remove and return the next accessible element from DECK.
     */
    @LispMethod(comment = "Remove and return the next accessible element from DECK.")
    public static final SubLObject deck_pop_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                return queues.dequeue(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    return stacks.stack_pop(deck_data(v_deck));
                }
            }
        }
        return NIL;
    }

    /**
     * Remove and return the next accessible element from DECK.
     */
    @LispMethod(comment = "Remove and return the next accessible element from DECK.")
    public static SubLObject deck_pop(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.dequeue(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_pop(deck_data(v_deck));
        }
        return NIL;
    }

    /**
     * Return the next accessible element from DECK without removing it.
     */
    @LispMethod(comment = "Return the next accessible element from DECK without removing it.")
    public static final SubLObject deck_peek_alt(SubLObject v_deck) {
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                return queues.queue_peek(deck_data(v_deck));
            } else {
                if (pcase_var.eql($STACK)) {
                    return stacks.stack_peek(deck_data(v_deck));
                }
            }
        }
        return NIL;
    }

    /**
     * Return the next accessible element from DECK without removing it.
     */
    @LispMethod(comment = "Return the next accessible element from DECK without removing it.")
    public static SubLObject deck_peek(final SubLObject v_deck) {
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql($QUEUE)) {
            return queues.queue_peek(deck_data(v_deck));
        }
        if (pcase_var.eql($STACK)) {
            return stacks.stack_peek(deck_data(v_deck));
        }
        return NIL;
    }

    /**
     * Remove all occurances of ITEM from DECK. Returns DECK.
     */
    @LispMethod(comment = "Remove all occurances of ITEM from DECK. Returns DECK.")
    public static final SubLObject remdeck_alt(SubLObject item, SubLObject v_deck, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLTrampolineFile.checkType(v_deck, DECK_P);
        {
            SubLObject pcase_var = deck_type(v_deck);
            if (pcase_var.eql($QUEUE)) {
                queues.remqueue(item, deck_data(v_deck), test);
            } else {
                if (pcase_var.eql($STACK)) {
                    stacks.stack_delete(item, deck_data(v_deck), test);
                }
            }
        }
        return v_deck;
    }

    /**
     * Remove all occurances of ITEM from DECK. Returns DECK.
     */
    @LispMethod(comment = "Remove all occurances of ITEM from DECK. Returns DECK.")
    public static SubLObject remdeck(final SubLObject item, final SubLObject v_deck, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != deck_p(v_deck) : "! deck.deck_p(v_deck) " + ("deck.deck_p(v_deck) " + "CommonSymbols.NIL != deck.deck_p(v_deck) ") + v_deck;
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
        declareFunction("deck_print_function_trampoline", "DECK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("deck_p", "DECK-P", 1, 0, false);
        new deck.$deck_p$UnaryFunction();
        declareFunction("deck_type", "DECK-TYPE", 1, 0, false);
        declareFunction("deck_data", "DECK-DATA", 1, 0, false);
        declareFunction("_csetf_deck_type", "_CSETF-DECK-TYPE", 2, 0, false);
        declareFunction("_csetf_deck_data", "_CSETF-DECK-DATA", 2, 0, false);
        declareFunction("make_deck", "MAKE-DECK", 0, 1, false);
        declareFunction("visit_defstruct_deck", "VISIT-DEFSTRUCT-DECK", 2, 0, false);
        declareFunction("visit_defstruct_object_deck_method", "VISIT-DEFSTRUCT-OBJECT-DECK-METHOD", 2, 0, false);
        declareFunction("print_deck", "PRINT-DECK", 3, 0, false);
        declareFunction("deck_type_p", "DECK-TYPE-P", 1, 0, false);
        declareFunction("create_deck", "CREATE-DECK", 1, 0, false);
        declareFunction("clear_deck", "CLEAR-DECK", 1, 0, false);
        declareFunction("deck_empty_p", "DECK-EMPTY-P", 1, 0, false);
        declareFunction("deck_size", "DECK-SIZE", 1, 0, false);
        declareFunction("deck_elements", "DECK-ELEMENTS", 1, 0, false);
        declareFunction("deck_push", "DECK-PUSH", 2, 0, false);
        declareFunction("deck_pop", "DECK-POP", 1, 0, false);
        declareFunction("deck_peek", "DECK-PEEK", 1, 0, false);
        declareFunction("remdeck", "REMDECK", 2, 1, false);
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

    static private final SubLList $list_alt2 = list(makeSymbol("TYPE"), makeSymbol("DATA"));

    static {
    }

    static private final SubLList $list_alt3 = list($TYPE, $DATA);

    static private final SubLList $list_alt4 = list(makeSymbol("DECK-TYPE"), makeSymbol("DECK-DATA"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-DECK-TYPE"), makeSymbol("_CSETF-DECK-DATA"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$__ = makeString("#<");

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
