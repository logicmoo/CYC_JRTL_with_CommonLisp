package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.stacks;
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

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.stacks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.stacks.*; 
 public final class stacks extends SubLTranslatedFile {
    public static final SubLFile me = new stacks();

    public static final String myName = "com.cyc.cycjava.cycl.stacks";

    public static final String myFingerPrint = "a477bffb0625be1159e30b953297eee33f27e88d671f72163844a6ece127c27d";

    // defconstant
    public static final SubLSymbol $dtp_stack$ = makeSymbol("*DTP-STACK*");

    // defconstant
    public static final SubLSymbol $dtp_locked_stack$ = makeSymbol("*DTP-LOCKED-STACK*");



    public static final SubLSymbol STACK_P = makeSymbol("STACK-P");

    public static final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"));

    public static final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"));

    public static final SubLList $list4 = list(makeSymbol("STACK-STRUC-NUM"), makeSymbol("STACK-STRUC-ELEMENTS"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-STACK-STRUC-NUM"), makeSymbol("_CSETF-STACK-STRUC-ELEMENTS"));

    public static final SubLSymbol PRINT_STACK = makeSymbol("PRINT-STACK");

    public static final SubLSymbol STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STACK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STACK-P"));

    private static final SubLSymbol STACK_STRUC_NUM = makeSymbol("STACK-STRUC-NUM");

    private static final SubLSymbol _CSETF_STACK_STRUC_NUM = makeSymbol("_CSETF-STACK-STRUC-NUM");

    private static final SubLSymbol STACK_STRUC_ELEMENTS = makeSymbol("STACK-STRUC-ELEMENTS");

    private static final SubLSymbol _CSETF_STACK_STRUC_ELEMENTS = makeSymbol("_CSETF-STACK-STRUC-ELEMENTS");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_STACK = makeSymbol("MAKE-STACK");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STACK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STACK-METHOD");

    private static final SubLString $str21$size_ = makeString("size=");

    private static final SubLList $list22 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("STACK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list23 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol DO_STACK_ELEMENTS_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS-STACK-ELEMENTS");

    private static final SubLSymbol DO_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS");

    private static final SubLString $str29$__Stack_length____a = makeString("~%Stack length : ~a");

    private static final SubLString $str30$__Stack_contents__ = makeString("~%Stack contents :");

    private static final SubLString $str31$___s = makeString("~%~s");

    private static final SubLSymbol LOCKED_STACK = makeSymbol("LOCKED-STACK");

    private static final SubLSymbol LOCKED_STACK_P = makeSymbol("LOCKED-STACK-P");

    public static final SubLList $list34 = list(makeSymbol("LOCK"), makeSymbol("STACK"));

    private static final SubLList $list35 = list(makeKeyword("LOCK"), makeKeyword("STACK"));

    private static final SubLList $list36 = list(makeSymbol("LOCKED-STACK-STRUC-LOCK"), makeSymbol("LOCKED-STACK-STRUC-STACK"));

    private static final SubLList $list37 = list(makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK"), makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK"));

    private static final SubLSymbol PRINT_LOCKED_STACK = makeSymbol("PRINT-LOCKED-STACK");

    private static final SubLSymbol LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list40 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKED-STACK-P"));

    private static final SubLSymbol LOCKED_STACK_STRUC_LOCK = makeSymbol("LOCKED-STACK-STRUC-LOCK");

    private static final SubLSymbol _CSETF_LOCKED_STACK_STRUC_LOCK = makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK");

    private static final SubLSymbol LOCKED_STACK_STRUC_STACK = makeSymbol("LOCKED-STACK-STRUC-STACK");

    private static final SubLSymbol _CSETF_LOCKED_STACK_STRUC_STACK = makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK");





    private static final SubLSymbol MAKE_LOCKED_STACK = makeSymbol("MAKE-LOCKED-STACK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKED_STACK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-STACK-METHOD");

    private static final SubLString $$$Stack_Lock = makeString("Stack Lock");

    private static final SubLString $str50$__Locked_Stack_size____a = makeString("~%Locked Stack size : ~a");

    private static final SubLString $str51$__Locked_Stack_contents__ = makeString("~%Locked Stack contents :");

    public static SubLObject stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_stack(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject stack_p(final SubLObject v_object) {
        return v_object.getClass() == $stack_native.class ? T : NIL;
    }

    public static SubLObject stack_struc_num(final SubLObject v_object) {
        assert NIL != stack_p(v_object) : "stacks.stack_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject stack_struc_elements(final SubLObject v_object) {
        assert NIL != stack_p(v_object) : "stacks.stack_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_stack_struc_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != stack_p(v_object) : "stacks.stack_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_stack_struc_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != stack_p(v_object) : "stacks.stack_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_stack(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                _csetf_stack_struc_num(v_new, current_value);
            } else
                if (pcase_var.eql($ELEMENTS)) {
                    _csetf_stack_struc_elements(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_stack(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STACK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, stack_struc_num(obj));
        funcall(visitor_fn, obj, $SLOT, $ELEMENTS, stack_struc_elements(obj));
        funcall(visitor_fn, obj, $END, MAKE_STACK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_stack(obj, visitor_fn);
    }

    public static SubLObject print_stack(final SubLObject stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(stack, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, stack, T, T);
            write_string($str21$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(stack_size(stack), stream);
            print_macros.print_unreadable_object_postamble(stream, stack, T, T);
        }
        return stack;
    }

    public static SubLObject create_stack() {
        return clear_stack(make_stack(UNPROVIDED));
    }

    public static SubLObject clear_stack(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        _csetf_stack_struc_num(stack, ZERO_INTEGER);
        _csetf_stack_struc_elements(stack, NIL);
        return stack;
    }

    public static SubLObject stack_empty_p(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        return sublisp_null(stack_struc_elements(stack));
    }

    public static SubLObject stack_of_type_p(final SubLObject pred, final SubLObject v_object) {
        if (NIL != stack_p(v_object)) {
            return list_utilities.list_of_type_p(pred, stack_struc_elements(v_object));
        }
        return NIL;
    }

    public static SubLObject stack_size(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        return stack_struc_num(stack);
    }

    public static SubLObject stack_elements(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        return copy_list(stack_struc_elements(stack));
    }

    public static SubLObject stack_push(final SubLObject item, final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        _csetf_stack_struc_elements(stack, cons(item, stack_struc_elements(stack)));
        _csetf_stack_struc_num(stack, add(stack_struc_num(stack), ONE_INTEGER));
        return stack;
    }

    public static SubLObject stack_pop(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        if (NIL == stack_empty_p(stack)) {
            final SubLObject elements = stack_struc_elements(stack);
            final SubLObject item = elements.first();
            final SubLObject rest = elements.rest();
            _csetf_stack_struc_num(stack, subtract(stack_struc_num(stack), ONE_INTEGER));
            _csetf_stack_struc_elements(stack, rest);
            return item;
        }
        return NIL;
    }

    public static SubLObject stack_peek(final SubLObject stack) {
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        if (NIL == stack_empty_p(stack)) {
            final SubLObject elements = stack_struc_elements(stack);
            final SubLObject item = elements.first();
            return item;
        }
        return NIL;
    }

    public static SubLObject stack_delete(final SubLObject item, final SubLObject stack, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        SubLObject back = NIL;
        SubLObject next;
        for (next = NIL, next = stack_struc_elements(stack); NIL != next; next = next.rest()) {
            if (NIL != funcall(test, next.first(), item)) {
                _csetf_stack_struc_num(stack, subtract(stack_struc_num(stack), ONE_INTEGER));
                if (next.eql(stack_struc_elements(stack))) {
                    _csetf_stack_struc_elements(stack, next.rest());
                } else {
                    rplacd(back, next.rest());
                }
            } else {
                back = next;
            }
        }
        return stack;
    }

    public static SubLObject do_stack_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject stack = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        stack = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$1, $list23, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(item_var, list(DO_STACK_ELEMENTS_STACK_ELEMENTS, stack), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_stack_elements_stack_elements(final SubLObject stack) {
        return stack_struc_elements(stack);
    }

    public static SubLObject stack_find(final SubLObject item, final SubLObject stack, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        return find(item, stack_struc_elements(stack), test, key, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stack_find_if(final SubLObject test, final SubLObject stack, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != stack_p(stack) : "stacks.stack_p(stack) " + "CommonSymbols.NIL != stacks.stack_p(stack) " + stack;
        return find_if(test, stack_struc_elements(stack), key, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject print_stack_contents(final SubLObject stack, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str29$__Stack_length____a, stack_size(stack));
        format(stream, $str30$__Stack_contents__);
        SubLObject cdolist_list_var = stack_struc_elements(stack);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str31$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject locked_stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_locked_stack(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locked_stack_p(final SubLObject v_object) {
        return v_object.getClass() == $locked_stack_native.class ? T : NIL;
    }

    public static SubLObject locked_stack_struc_lock(final SubLObject v_object) {
        assert NIL != locked_stack_p(v_object) : "stacks.locked_stack_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject locked_stack_struc_stack(final SubLObject v_object) {
        assert NIL != locked_stack_p(v_object) : "stacks.locked_stack_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_locked_stack_struc_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_stack_p(v_object) : "stacks.locked_stack_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_locked_stack_struc_stack(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_stack_p(v_object) : "stacks.locked_stack_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_locked_stack(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $locked_stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_locked_stack_struc_lock(v_new, current_value);
            } else
                if (pcase_var.eql($STACK)) {
                    _csetf_locked_stack_struc_stack(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locked_stack(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKED_STACK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, locked_stack_struc_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $STACK, locked_stack_struc_stack(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKED_STACK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locked_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_stack(obj, visitor_fn);
    }

    public static SubLObject print_locked_stack(final SubLObject l_stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(l_stack, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, l_stack, T, T);
            write_string($str21$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(locked_stack_size(l_stack), stream);
            print_macros.print_unreadable_object_postamble(stream, l_stack, T, T);
        }
        return l_stack;
    }

    public static SubLObject create_locked_stack() {
        final SubLObject l_stack = make_locked_stack(UNPROVIDED);
        _csetf_locked_stack_struc_lock(l_stack, make_lock($$$Stack_Lock));
        _csetf_locked_stack_struc_stack(l_stack, create_stack());
        return l_stack;
    }

    public static SubLObject clear_locked_stack(final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            clear_stack(locked_stack_struc_stack(l_stack));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return l_stack;
    }

    public static SubLObject locked_stack_empty_p(final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        return stack_empty_p(locked_stack_struc_stack(l_stack));
    }

    public static SubLObject locked_stack_size(final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        return stack_size(locked_stack_struc_stack(l_stack));
    }

    public static SubLObject locked_stack_elements(final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        SubLObject ans = NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            ans = stack_elements(locked_stack_struc_stack(l_stack));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return ans;
    }

    public static SubLObject locked_stack_push(final SubLObject item, final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        SubLObject ans = NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            ans = stack_push(item, locked_stack_struc_stack(l_stack));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return ans;
    }

    public static SubLObject locked_stack_pop(final SubLObject l_stack) {
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        SubLObject ans = NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            ans = stack_pop(locked_stack_struc_stack(l_stack));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return ans;
    }

    public static SubLObject locked_stack_delete(final SubLObject item, final SubLObject l_stack, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != locked_stack_p(l_stack) : "stacks.locked_stack_p(l_stack) " + "CommonSymbols.NIL != stacks.locked_stack_p(l_stack) " + l_stack;
        SubLObject ans = NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            ans = stack_delete(item, locked_stack_struc_stack(l_stack), test);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return ans;
    }

    public static SubLObject print_locked_stack_contents(final SubLObject l_stack, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject size = locked_stack_size(l_stack);
        final SubLObject elements = locked_stack_elements(l_stack);
        format(stream, $str50$__Locked_Stack_size____a, size);
        format(stream, $str51$__Locked_Stack_contents__);
        SubLObject cdolist_list_var = elements;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str31$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_stacks_file() {
        declareFunction(me, "stack_print_function_trampoline", "STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "stack_p", "STACK-P", 1, 0, false);
        new stacks.$stack_p$UnaryFunction();
        declareFunction(me, "stack_struc_num", "STACK-STRUC-NUM", 1, 0, false);
        declareFunction(me, "stack_struc_elements", "STACK-STRUC-ELEMENTS", 1, 0, false);
        declareFunction(me, "_csetf_stack_struc_num", "_CSETF-STACK-STRUC-NUM", 2, 0, false);
        declareFunction(me, "_csetf_stack_struc_elements", "_CSETF-STACK-STRUC-ELEMENTS", 2, 0, false);
        declareFunction(me, "make_stack", "MAKE-STACK", 0, 1, false);
        declareFunction(me, "visit_defstruct_stack", "VISIT-DEFSTRUCT-STACK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_stack_method", "VISIT-DEFSTRUCT-OBJECT-STACK-METHOD", 2, 0, false);
        declareFunction(me, "print_stack", "PRINT-STACK", 3, 0, false);
        declareFunction(me, "create_stack", "CREATE-STACK", 0, 0, false);
        declareFunction(me, "clear_stack", "CLEAR-STACK", 1, 0, false);
        declareFunction(me, "stack_empty_p", "STACK-EMPTY-P", 1, 0, false);
        declareFunction(me, "stack_of_type_p", "STACK-OF-TYPE-P", 2, 0, false);
        declareFunction(me, "stack_size", "STACK-SIZE", 1, 0, false);
        declareFunction(me, "stack_elements", "STACK-ELEMENTS", 1, 0, false);
        declareFunction(me, "stack_push", "STACK-PUSH", 2, 0, false);
        declareFunction(me, "stack_pop", "STACK-POP", 1, 0, false);
        declareFunction(me, "stack_peek", "STACK-PEEK", 1, 0, false);
        declareFunction(me, "stack_delete", "STACK-DELETE", 2, 1, false);
        declareMacro(me, "do_stack_elements", "DO-STACK-ELEMENTS");
        declareFunction(me, "do_stack_elements_stack_elements", "DO-STACK-ELEMENTS-STACK-ELEMENTS", 1, 0, false);
        declareFunction(me, "stack_find", "STACK-FIND", 2, 2, false);
        declareFunction(me, "stack_find_if", "STACK-FIND-IF", 2, 1, false);
        declareFunction(me, "print_stack_contents", "PRINT-STACK-CONTENTS", 1, 1, false);
        declareFunction(me, "locked_stack_print_function_trampoline", "LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "locked_stack_p", "LOCKED-STACK-P", 1, 0, false);
        new stacks.$locked_stack_p$UnaryFunction();
        declareFunction(me, "locked_stack_struc_lock", "LOCKED-STACK-STRUC-LOCK", 1, 0, false);
        declareFunction(me, "locked_stack_struc_stack", "LOCKED-STACK-STRUC-STACK", 1, 0, false);
        declareFunction(me, "_csetf_locked_stack_struc_lock", "_CSETF-LOCKED-STACK-STRUC-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_locked_stack_struc_stack", "_CSETF-LOCKED-STACK-STRUC-STACK", 2, 0, false);
        declareFunction(me, "make_locked_stack", "MAKE-LOCKED-STACK", 0, 1, false);
        declareFunction(me, "visit_defstruct_locked_stack", "VISIT-DEFSTRUCT-LOCKED-STACK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_locked_stack_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-STACK-METHOD", 2, 0, false);
        declareFunction(me, "print_locked_stack", "PRINT-LOCKED-STACK", 3, 0, false);
        declareFunction(me, "create_locked_stack", "CREATE-LOCKED-STACK", 0, 0, false);
        declareFunction(me, "clear_locked_stack", "CLEAR-LOCKED-STACK", 1, 0, false);
        declareFunction(me, "locked_stack_empty_p", "LOCKED-STACK-EMPTY-P", 1, 0, false);
        declareFunction(me, "locked_stack_size", "LOCKED-STACK-SIZE", 1, 0, false);
        declareFunction(me, "locked_stack_elements", "LOCKED-STACK-ELEMENTS", 1, 0, false);
        declareFunction(me, "locked_stack_push", "LOCKED-STACK-PUSH", 2, 0, false);
        declareFunction(me, "locked_stack_pop", "LOCKED-STACK-POP", 1, 0, false);
        declareFunction(me, "locked_stack_delete", "LOCKED-STACK-DELETE", 2, 1, false);
        declareFunction(me, "print_locked_stack_contents", "PRINT-LOCKED-STACK-CONTENTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_stacks_file() {
        defconstant("*DTP-STACK*", STACK);
        defconstant("*DTP-LOCKED-STACK*", LOCKED_STACK);
        return NIL;
    }

    public static SubLObject setup_stacks_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_stack$.getGlobalValue(), symbol_function(STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(STACK_STRUC_NUM, _CSETF_STACK_STRUC_NUM);
        def_csetf(STACK_STRUC_ELEMENTS, _CSETF_STACK_STRUC_ELEMENTS);
        identity(STACK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_stack$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STACK_METHOD));
        register_macro_helper(DO_STACK_ELEMENTS_STACK_ELEMENTS, DO_STACK_ELEMENTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_stack$.getGlobalValue(), symbol_function(LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list40);
        def_csetf(LOCKED_STACK_STRUC_LOCK, _CSETF_LOCKED_STACK_STRUC_LOCK);
        def_csetf(LOCKED_STACK_STRUC_STACK, _CSETF_LOCKED_STACK_STRUC_STACK);
        identity(LOCKED_STACK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_stack$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_STACK_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_stacks_file();
    }

    @Override
    public void initializeVariables() {
        init_stacks_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_stacks_file();
    }

    static {























































    }

    public static final class $stack_native extends SubLStructNative {
        public SubLObject $num;

        public SubLObject $elements;

        private static final SubLStructDeclNative structDecl;

        private $stack_native() {
            this.$num = Lisp.NIL;
            this.$elements = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$num;
        }

        @Override
        public SubLObject getField3() {
            return this.$elements;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }

        static {
            structDecl = makeStructDeclNative($stack_native.class, STACK, STACK_P, $list2, $list3, new String[]{ "$num", "$elements" }, $list4, $list5, PRINT_STACK);
        }
    }

    public static final class $stack_p$UnaryFunction extends UnaryFunction {
        public $stack_p$UnaryFunction() {
            super(extractFunctionNamed("STACK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return stack_p(arg1);
        }
    }

    public static final class $locked_stack_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $stack;

        private static final SubLStructDeclNative structDecl;

        private $locked_stack_native() {
            this.$lock = Lisp.NIL;
            this.$stack = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$stack;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$stack = value;
        }

        static {
            structDecl = makeStructDeclNative($locked_stack_native.class, LOCKED_STACK, LOCKED_STACK_P, $list34, $list35, new String[]{ "$lock", "$stack" }, $list36, $list37, PRINT_LOCKED_STACK);
        }
    }

    public static final class $locked_stack_p$UnaryFunction extends UnaryFunction {
        public $locked_stack_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKED-STACK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locked_stack_p(arg1);
        }
    }
}

/**
 * Total time: 190 ms
 */
