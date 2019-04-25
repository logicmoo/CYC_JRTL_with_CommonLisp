package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class stacks extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.stacks";
    public static final String myFingerPrint = "a477bffb0625be1159e30b953297eee33f27e88d671f72163844a6ece127c27d";
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLSymbol $dtp_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLSymbol $dtp_locked_stack$;
    private static final SubLSymbol $sym0$STACK;
    private static final SubLSymbol $sym1$STACK_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_STACK;
    private static final SubLSymbol $sym7$STACK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$STACK_STRUC_NUM;
    private static final SubLSymbol $sym10$_CSETF_STACK_STRUC_NUM;
    private static final SubLSymbol $sym11$STACK_STRUC_ELEMENTS;
    private static final SubLSymbol $sym12$_CSETF_STACK_STRUC_ELEMENTS;
    private static final SubLSymbol $kw13$NUM;
    private static final SubLSymbol $kw14$ELEMENTS;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_STACK;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_STACK_METHOD;
    private static final SubLString $str21$size_;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw25$DONE;
    private static final SubLSymbol $sym26$DO_LIST;
    private static final SubLSymbol $sym27$DO_STACK_ELEMENTS_STACK_ELEMENTS;
    private static final SubLSymbol $sym28$DO_STACK_ELEMENTS;
    private static final SubLString $str29$__Stack_length____a;
    private static final SubLString $str30$__Stack_contents__;
    private static final SubLString $str31$___s;
    private static final SubLSymbol $sym32$LOCKED_STACK;
    private static final SubLSymbol $sym33$LOCKED_STACK_P;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PRINT_LOCKED_STACK;
    private static final SubLSymbol $sym39$LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$LOCKED_STACK_STRUC_LOCK;
    private static final SubLSymbol $sym42$_CSETF_LOCKED_STACK_STRUC_LOCK;
    private static final SubLSymbol $sym43$LOCKED_STACK_STRUC_STACK;
    private static final SubLSymbol $sym44$_CSETF_LOCKED_STACK_STRUC_STACK;
    private static final SubLSymbol $kw45$LOCK;
    private static final SubLSymbol $kw46$STACK;
    private static final SubLSymbol $sym47$MAKE_LOCKED_STACK;
    private static final SubLSymbol $sym48$VISIT_DEFSTRUCT_OBJECT_LOCKED_STACK_METHOD;
    private static final SubLString $str49$Stack_Lock;
    private static final SubLString $str50$__Locked_Stack_size____a;
    private static final SubLString $str51$__Locked_Stack_contents__;
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_stack(v_object, stream, (SubLObject)stacks.ZERO_INTEGER);
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject stack_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $stack_native.class) ? stacks.T : stacks.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject stack_struc_num(final SubLObject v_object) {
        assert stacks.NIL != stack_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject stack_struc_elements(final SubLObject v_object) {
        assert stacks.NIL != stack_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject _csetf_stack_struc_num(final SubLObject v_object, final SubLObject value) {
        assert stacks.NIL != stack_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject _csetf_stack_struc_elements(final SubLObject v_object, final SubLObject value) {
        assert stacks.NIL != stack_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject make_stack(SubLObject arglist) {
        if (arglist == stacks.UNPROVIDED) {
            arglist = (SubLObject)stacks.NIL;
        }
        final SubLObject v_new = (SubLObject)new $stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)stacks.NIL, next = arglist; stacks.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)stacks.$kw13$NUM)) {
                _csetf_stack_struc_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stacks.$kw14$ELEMENTS)) {
                _csetf_stack_struc_elements(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)stacks.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject visit_defstruct_stack(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw16$BEGIN, (SubLObject)stacks.$sym17$MAKE_STACK, (SubLObject)stacks.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw18$SLOT, (SubLObject)stacks.$kw13$NUM, stack_struc_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw18$SLOT, (SubLObject)stacks.$kw14$ELEMENTS, stack_struc_elements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw19$END, (SubLObject)stacks.$sym17$MAKE_STACK, (SubLObject)stacks.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1487L)
    public static SubLObject visit_defstruct_object_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_stack(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1601L)
    public static SubLObject print_stack(final SubLObject stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (stacks.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(stack, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, stack, (SubLObject)stacks.T, (SubLObject)stacks.T);
            streams_high.write_string((SubLObject)stacks.$str21$size_, stream, (SubLObject)stacks.UNPROVIDED, (SubLObject)stacks.UNPROVIDED);
            print_high.princ(stack_size(stack), stream);
            print_macros.print_unreadable_object_postamble(stream, stack, (SubLObject)stacks.T, (SubLObject)stacks.T);
        }
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1818L)
    public static SubLObject create_stack() {
        return clear_stack(make_stack((SubLObject)stacks.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 1928L)
    public static SubLObject clear_stack(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        _csetf_stack_struc_num(stack, (SubLObject)stacks.ZERO_INTEGER);
        _csetf_stack_struc_elements(stack, (SubLObject)stacks.NIL);
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 2117L)
    public static SubLObject stack_empty_p(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        return Types.sublisp_null(stack_struc_elements(stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 2262L)
    public static SubLObject stack_of_type_p(final SubLObject pred, final SubLObject v_object) {
        if (stacks.NIL != stack_p(v_object)) {
            return list_utilities.list_of_type_p(pred, stack_struc_elements(v_object));
        }
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 2595L)
    public static SubLObject stack_size(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        return stack_struc_num(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 2736L)
    public static SubLObject stack_elements(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        return conses_high.copy_list(stack_struc_elements(stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 2898L)
    public static SubLObject stack_push(final SubLObject item, final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        _csetf_stack_struc_elements(stack, (SubLObject)ConsesLow.cons(item, stack_struc_elements(stack)));
        _csetf_stack_struc_num(stack, Numbers.add(stack_struc_num(stack), (SubLObject)stacks.ONE_INTEGER));
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 3109L)
    public static SubLObject stack_pop(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        if (stacks.NIL == stack_empty_p(stack)) {
            final SubLObject elements = stack_struc_elements(stack);
            final SubLObject item = elements.first();
            final SubLObject rest = elements.rest();
            _csetf_stack_struc_num(stack, Numbers.subtract(stack_struc_num(stack), (SubLObject)stacks.ONE_INTEGER));
            _csetf_stack_struc_elements(stack, rest);
            return item;
        }
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 3462L)
    public static SubLObject stack_peek(final SubLObject stack) {
        assert stacks.NIL != stack_p(stack) : stack;
        if (stacks.NIL == stack_empty_p(stack)) {
            final SubLObject elements = stack_struc_elements(stack);
            final SubLObject item = elements.first();
            return item;
        }
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 3714L)
    public static SubLObject stack_delete(final SubLObject item, final SubLObject stack, SubLObject test) {
        if (test == stacks.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)stacks.EQL);
        }
        assert stacks.NIL != stack_p(stack) : stack;
        SubLObject back = (SubLObject)stacks.NIL;
        SubLObject next;
        for (next = (SubLObject)stacks.NIL, next = stack_struc_elements(stack); stacks.NIL != next; next = next.rest()) {
            if (stacks.NIL != Functions.funcall(test, next.first(), item)) {
                _csetf_stack_struc_num(stack, Numbers.subtract(stack_struc_num(stack), (SubLObject)stacks.ONE_INTEGER));
                if (next.eql(stack_struc_elements(stack))) {
                    _csetf_stack_struc_elements(stack, next.rest());
                }
                else {
                    ConsesLow.rplacd(back, next.rest());
                }
            }
            else {
                back = next;
            }
        }
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 4226L)
    public static SubLObject do_stack_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stacks.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = (SubLObject)stacks.NIL;
        SubLObject stack = (SubLObject)stacks.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stacks.$list22);
        item_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stacks.$list22);
        stack = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)stacks.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)stacks.NIL;
        SubLObject current_$1 = (SubLObject)stacks.NIL;
        while (stacks.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stacks.$list22);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stacks.$list22);
            if (stacks.NIL == conses_high.member(current_$1, (SubLObject)stacks.$list23, (SubLObject)stacks.UNPROVIDED, (SubLObject)stacks.UNPROVIDED)) {
                bad = (SubLObject)stacks.T;
            }
            if (current_$1 == stacks.$kw24$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (stacks.NIL != bad && stacks.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)stacks.$list22);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)stacks.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((stacks.NIL != done_tail) ? conses_high.cadr(done_tail) : stacks.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)stacks.$sym26$DO_LIST, (SubLObject)ConsesLow.list(item_var, (SubLObject)ConsesLow.list((SubLObject)stacks.$sym27$DO_STACK_ELEMENTS_STACK_ELEMENTS, stack), (SubLObject)stacks.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)stacks.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 4399L)
    public static SubLObject do_stack_elements_stack_elements(final SubLObject stack) {
        return stack_struc_elements(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 4529L)
    public static SubLObject stack_find(final SubLObject item, final SubLObject stack, SubLObject test, SubLObject key) {
        if (test == stacks.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)stacks.EQL);
        }
        if (key == stacks.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)stacks.IDENTITY);
        }
        assert stacks.NIL != stack_p(stack) : stack;
        return Sequences.find(item, stack_struc_elements(stack), test, key, (SubLObject)stacks.UNPROVIDED, (SubLObject)stacks.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 4747L)
    public static SubLObject stack_find_if(final SubLObject test, final SubLObject stack, SubLObject key) {
        if (key == stacks.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)stacks.IDENTITY);
        }
        assert stacks.NIL != stack_p(stack) : stack;
        return Sequences.find_if(test, stack_struc_elements(stack), key, (SubLObject)stacks.UNPROVIDED, (SubLObject)stacks.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 4956L)
    public static SubLObject print_stack_contents(final SubLObject stack, SubLObject stream) {
        if (stream == stacks.UNPROVIDED) {
            stream = (SubLObject)stacks.T;
        }
        PrintLow.format(stream, (SubLObject)stacks.$str29$__Stack_length____a, stack_size(stack));
        PrintLow.format(stream, (SubLObject)stacks.$str30$__Stack_contents__);
        SubLObject cdolist_list_var = stack_struc_elements(stack);
        SubLObject item = (SubLObject)stacks.NIL;
        item = cdolist_list_var.first();
        while (stacks.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)stacks.$str31$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject locked_stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_locked_stack(v_object, stream, (SubLObject)stacks.ZERO_INTEGER);
        return (SubLObject)stacks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject locked_stack_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $locked_stack_native.class) ? stacks.T : stacks.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject locked_stack_struc_lock(final SubLObject v_object) {
        assert stacks.NIL != locked_stack_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject locked_stack_struc_stack(final SubLObject v_object) {
        assert stacks.NIL != locked_stack_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject _csetf_locked_stack_struc_lock(final SubLObject v_object, final SubLObject value) {
        assert stacks.NIL != locked_stack_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject _csetf_locked_stack_struc_stack(final SubLObject v_object, final SubLObject value) {
        assert stacks.NIL != locked_stack_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject make_locked_stack(SubLObject arglist) {
        if (arglist == stacks.UNPROVIDED) {
            arglist = (SubLObject)stacks.NIL;
        }
        final SubLObject v_new = (SubLObject)new $locked_stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)stacks.NIL, next = arglist; stacks.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)stacks.$kw45$LOCK)) {
                _csetf_locked_stack_struc_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stacks.$kw46$STACK)) {
                _csetf_locked_stack_struc_stack(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)stacks.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject visit_defstruct_locked_stack(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw16$BEGIN, (SubLObject)stacks.$sym47$MAKE_LOCKED_STACK, (SubLObject)stacks.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw18$SLOT, (SubLObject)stacks.$kw45$LOCK, locked_stack_struc_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw18$SLOT, (SubLObject)stacks.$kw46$STACK, locked_stack_struc_stack(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stacks.$kw19$END, (SubLObject)stacks.$sym47$MAKE_LOCKED_STACK, (SubLObject)stacks.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5422L)
    public static SubLObject visit_defstruct_object_locked_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_stack(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5549L)
    public static SubLObject print_locked_stack(final SubLObject l_stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (stacks.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(l_stack, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, l_stack, (SubLObject)stacks.T, (SubLObject)stacks.T);
            streams_high.write_string((SubLObject)stacks.$str21$size_, stream, (SubLObject)stacks.UNPROVIDED, (SubLObject)stacks.UNPROVIDED);
            print_high.princ(locked_stack_size(l_stack), stream);
            print_macros.print_unreadable_object_postamble(stream, l_stack, (SubLObject)stacks.T, (SubLObject)stacks.T);
        }
        return l_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 5788L)
    public static SubLObject create_locked_stack() {
        final SubLObject l_stack = make_locked_stack((SubLObject)stacks.UNPROVIDED);
        _csetf_locked_stack_struc_lock(l_stack, Locks.make_lock((SubLObject)stacks.$str49$Stack_Lock));
        _csetf_locked_stack_struc_stack(l_stack, create_stack());
        return l_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 6031L)
    public static SubLObject clear_locked_stack(final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = (SubLObject)stacks.NIL;
        try {
            release = Locks.seize_lock(lock);
            clear_stack(locked_stack_struc_stack(l_stack));
        }
        finally {
            if (stacks.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return l_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 6306L)
    public static SubLObject locked_stack_empty_p(final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        return stack_empty_p(locked_stack_struc_stack(l_stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 6486L)
    public static SubLObject locked_stack_size(final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        return stack_size(locked_stack_struc_stack(l_stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 6677L)
    public static SubLObject locked_stack_elements(final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        SubLObject ans = (SubLObject)stacks.NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = (SubLObject)stacks.NIL;
        try {
            release = Locks.seize_lock(lock);
            ans = stack_elements(locked_stack_struc_stack(l_stack));
        }
        finally {
            if (stacks.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 7008L)
    public static SubLObject locked_stack_push(final SubLObject item, final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        SubLObject ans = (SubLObject)stacks.NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = (SubLObject)stacks.NIL;
        try {
            release = Locks.seize_lock(lock);
            ans = stack_push(item, locked_stack_struc_stack(l_stack));
        }
        finally {
            if (stacks.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 7337L)
    public static SubLObject locked_stack_pop(final SubLObject l_stack) {
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        SubLObject ans = (SubLObject)stacks.NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = (SubLObject)stacks.NIL;
        try {
            release = Locks.seize_lock(lock);
            ans = stack_pop(locked_stack_struc_stack(l_stack));
        }
        finally {
            if (stacks.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 7646L)
    public static SubLObject locked_stack_delete(final SubLObject item, final SubLObject l_stack, SubLObject test) {
        if (test == stacks.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)stacks.EQL);
        }
        assert stacks.NIL != locked_stack_p(l_stack) : l_stack;
        SubLObject ans = (SubLObject)stacks.NIL;
        final SubLObject lock = locked_stack_struc_lock(l_stack);
        SubLObject release = (SubLObject)stacks.NIL;
        try {
            release = Locks.seize_lock(lock);
            ans = stack_delete(item, locked_stack_struc_stack(l_stack), test);
        }
        finally {
            if (stacks.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stacks.lisp", position = 8016L)
    public static SubLObject print_locked_stack_contents(final SubLObject l_stack, SubLObject stream) {
        if (stream == stacks.UNPROVIDED) {
            stream = (SubLObject)stacks.T;
        }
        final SubLObject size = locked_stack_size(l_stack);
        final SubLObject elements = locked_stack_elements(l_stack);
        PrintLow.format(stream, (SubLObject)stacks.$str50$__Locked_Stack_size____a, size);
        PrintLow.format(stream, (SubLObject)stacks.$str51$__Locked_Stack_contents__);
        SubLObject cdolist_list_var = elements;
        SubLObject item = (SubLObject)stacks.NIL;
        item = cdolist_list_var.first();
        while (stacks.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)stacks.$str31$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)stacks.NIL;
    }
    
    public static SubLObject declare_stacks_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_print_function_trampoline", "STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_p", "STACK-P", 1, 0, false);
        new $stack_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_struc_num", "STACK-STRUC-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_struc_elements", "STACK-STRUC-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "_csetf_stack_struc_num", "_CSETF-STACK-STRUC-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "_csetf_stack_struc_elements", "_CSETF-STACK-STRUC-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "make_stack", "MAKE-STACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "visit_defstruct_stack", "VISIT-DEFSTRUCT-STACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "visit_defstruct_object_stack_method", "VISIT-DEFSTRUCT-OBJECT-STACK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "print_stack", "PRINT-STACK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "create_stack", "CREATE-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "clear_stack", "CLEAR-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_empty_p", "STACK-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_of_type_p", "STACK-OF-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_size", "STACK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_elements", "STACK-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_push", "STACK-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_pop", "STACK-POP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_peek", "STACK-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_delete", "STACK-DELETE", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.stacks", "do_stack_elements", "DO-STACK-ELEMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "do_stack_elements_stack_elements", "DO-STACK-ELEMENTS-STACK-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_find", "STACK-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "stack_find_if", "STACK-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "print_stack_contents", "PRINT-STACK-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_print_function_trampoline", "LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_p", "LOCKED-STACK-P", 1, 0, false);
        new $locked_stack_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_struc_lock", "LOCKED-STACK-STRUC-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_struc_stack", "LOCKED-STACK-STRUC-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "_csetf_locked_stack_struc_lock", "_CSETF-LOCKED-STACK-STRUC-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "_csetf_locked_stack_struc_stack", "_CSETF-LOCKED-STACK-STRUC-STACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "make_locked_stack", "MAKE-LOCKED-STACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "visit_defstruct_locked_stack", "VISIT-DEFSTRUCT-LOCKED-STACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "visit_defstruct_object_locked_stack_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-STACK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "print_locked_stack", "PRINT-LOCKED-STACK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "create_locked_stack", "CREATE-LOCKED-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "clear_locked_stack", "CLEAR-LOCKED-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_empty_p", "LOCKED-STACK-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_size", "LOCKED-STACK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_elements", "LOCKED-STACK-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_push", "LOCKED-STACK-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_pop", "LOCKED-STACK-POP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "locked_stack_delete", "LOCKED-STACK-DELETE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stacks", "print_locked_stack_contents", "PRINT-LOCKED-STACK-CONTENTS", 1, 1, false);
        return (SubLObject)stacks.NIL;
    }
    
    public static SubLObject init_stacks_file() {
        stacks.$dtp_stack$ = SubLFiles.defconstant("*DTP-STACK*", (SubLObject)stacks.$sym0$STACK);
        stacks.$dtp_locked_stack$ = SubLFiles.defconstant("*DTP-LOCKED-STACK*", (SubLObject)stacks.$sym32$LOCKED_STACK);
        return (SubLObject)stacks.NIL;
    }
    
    public static SubLObject setup_stacks_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), stacks.$dtp_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)stacks.$sym7$STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)stacks.$list8);
        Structures.def_csetf((SubLObject)stacks.$sym9$STACK_STRUC_NUM, (SubLObject)stacks.$sym10$_CSETF_STACK_STRUC_NUM);
        Structures.def_csetf((SubLObject)stacks.$sym11$STACK_STRUC_ELEMENTS, (SubLObject)stacks.$sym12$_CSETF_STACK_STRUC_ELEMENTS);
        Equality.identity((SubLObject)stacks.$sym0$STACK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), stacks.$dtp_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)stacks.$sym20$VISIT_DEFSTRUCT_OBJECT_STACK_METHOD));
        access_macros.register_macro_helper((SubLObject)stacks.$sym27$DO_STACK_ELEMENTS_STACK_ELEMENTS, (SubLObject)stacks.$sym28$DO_STACK_ELEMENTS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), stacks.$dtp_locked_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)stacks.$sym39$LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)stacks.$list40);
        Structures.def_csetf((SubLObject)stacks.$sym41$LOCKED_STACK_STRUC_LOCK, (SubLObject)stacks.$sym42$_CSETF_LOCKED_STACK_STRUC_LOCK);
        Structures.def_csetf((SubLObject)stacks.$sym43$LOCKED_STACK_STRUC_STACK, (SubLObject)stacks.$sym44$_CSETF_LOCKED_STACK_STRUC_STACK);
        Equality.identity((SubLObject)stacks.$sym32$LOCKED_STACK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), stacks.$dtp_locked_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)stacks.$sym48$VISIT_DEFSTRUCT_OBJECT_LOCKED_STACK_METHOD));
        return (SubLObject)stacks.NIL;
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
        me = (SubLFile)new stacks();
        stacks.$dtp_stack$ = null;
        stacks.$dtp_locked_stack$ = null;
        $sym0$STACK = SubLObjectFactory.makeSymbol("STACK");
        $sym1$STACK_P = SubLObjectFactory.makeSymbol("STACK-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("ELEMENTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STACK-STRUC-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-STRUC-ELEMENTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STACK-STRUC-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STACK-STRUC-ELEMENTS"));
        $sym6$PRINT_STACK = SubLObjectFactory.makeSymbol("PRINT-STACK");
        $sym7$STACK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STACK-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-P"));
        $sym9$STACK_STRUC_NUM = SubLObjectFactory.makeSymbol("STACK-STRUC-NUM");
        $sym10$_CSETF_STACK_STRUC_NUM = SubLObjectFactory.makeSymbol("_CSETF-STACK-STRUC-NUM");
        $sym11$STACK_STRUC_ELEMENTS = SubLObjectFactory.makeSymbol("STACK-STRUC-ELEMENTS");
        $sym12$_CSETF_STACK_STRUC_ELEMENTS = SubLObjectFactory.makeSymbol("_CSETF-STACK-STRUC-ELEMENTS");
        $kw13$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw14$ELEMENTS = SubLObjectFactory.makeKeyword("ELEMENTS");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_STACK = SubLObjectFactory.makeSymbol("MAKE-STACK");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_STACK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STACK-METHOD");
        $str21$size_ = SubLObjectFactory.makeString("size=");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STACK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw24$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw25$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym26$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym27$DO_STACK_ELEMENTS_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("DO-STACK-ELEMENTS-STACK-ELEMENTS");
        $sym28$DO_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("DO-STACK-ELEMENTS");
        $str29$__Stack_length____a = SubLObjectFactory.makeString("~%Stack length : ~a");
        $str30$__Stack_contents__ = SubLObjectFactory.makeString("~%Stack contents :");
        $str31$___s = SubLObjectFactory.makeString("~%~s");
        $sym32$LOCKED_STACK = SubLObjectFactory.makeSymbol("LOCKED-STACK");
        $sym33$LOCKED_STACK_P = SubLObjectFactory.makeSymbol("LOCKED-STACK-P");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("STACK"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("STACK"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCKED-STACK-STRUC-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("LOCKED-STACK-STRUC-STACK"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK"));
        $sym38$PRINT_LOCKED_STACK = SubLObjectFactory.makeSymbol("PRINT-LOCKED-STACK");
        $sym39$LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("LOCKED-STACK-P"));
        $sym41$LOCKED_STACK_STRUC_LOCK = SubLObjectFactory.makeSymbol("LOCKED-STACK-STRUC-LOCK");
        $sym42$_CSETF_LOCKED_STACK_STRUC_LOCK = SubLObjectFactory.makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK");
        $sym43$LOCKED_STACK_STRUC_STACK = SubLObjectFactory.makeSymbol("LOCKED-STACK-STRUC-STACK");
        $sym44$_CSETF_LOCKED_STACK_STRUC_STACK = SubLObjectFactory.makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK");
        $kw45$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw46$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym47$MAKE_LOCKED_STACK = SubLObjectFactory.makeSymbol("MAKE-LOCKED-STACK");
        $sym48$VISIT_DEFSTRUCT_OBJECT_LOCKED_STACK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-STACK-METHOD");
        $str49$Stack_Lock = SubLObjectFactory.makeString("Stack Lock");
        $str50$__Locked_Stack_size____a = SubLObjectFactory.makeString("~%Locked Stack size : ~a");
        $str51$__Locked_Stack_contents__ = SubLObjectFactory.makeString("~%Locked Stack contents :");
    }
    
    public static final class $stack_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        private static final SubLStructDeclNative structDecl;
        
        public $stack_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$stack_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$stack_native.class, stacks.$sym0$STACK, stacks.$sym1$STACK_P, stacks.$list2, stacks.$list3, new String[] { "$num", "$elements" }, stacks.$list4, stacks.$list5, stacks.$sym6$PRINT_STACK);
        }
    }
    
    public static final class $stack_p$UnaryFunction extends UnaryFunction
    {
        public $stack_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STACK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return stacks.stack_p(arg1);
        }
    }
    
    public static final class $locked_stack_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $stack;
        private static final SubLStructDeclNative structDecl;
        
        public $locked_stack_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$stack = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$locked_stack_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$locked_stack_native.class, stacks.$sym32$LOCKED_STACK, stacks.$sym33$LOCKED_STACK_P, stacks.$list34, stacks.$list35, new String[] { "$lock", "$stack" }, stacks.$list36, stacks.$list37, stacks.$sym38$PRINT_LOCKED_STACK);
        }
    }
    
    public static final class $locked_stack_p$UnaryFunction extends UnaryFunction
    {
        public $locked_stack_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LOCKED-STACK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return stacks.locked_stack_p(arg1);
        }
    }
}

/*

	Total time: 190 ms
	
*/