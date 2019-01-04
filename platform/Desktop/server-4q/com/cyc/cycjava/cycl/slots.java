package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class slots extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.slots";
    public static final String myFingerPrint = "4a2d23291686817aab2f337e9d998cd2f3f0d5b3d7a3f58d8bce6a0ae050d63f";
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLSymbol $dtp_slot$;
    private static final SubLSymbol $sym0$SLOT;
    private static final SubLSymbol $sym1$SLOT_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_SLOT;
    private static final SubLSymbol $sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SLOT_NAME;
    private static final SubLSymbol $sym10$_CSETF_SLOT_NAME;
    private static final SubLSymbol $sym11$SLOT_INDEX;
    private static final SubLSymbol $sym12$_CSETF_SLOT_INDEX;
    private static final SubLSymbol $sym13$SLOT_PROTECTION;
    private static final SubLSymbol $sym14$_CSETF_SLOT_PROTECTION;
    private static final SubLSymbol $sym15$SLOT_CLASS_NAME;
    private static final SubLSymbol $sym16$_CSETF_SLOT_CLASS_NAME;
    private static final SubLSymbol $sym17$SLOT_ESSENTIAL;
    private static final SubLSymbol $sym18$_CSETF_SLOT_ESSENTIAL;
    private static final SubLSymbol $sym19$SLOT_INIT_VALUE;
    private static final SubLSymbol $sym20$_CSETF_SLOT_INIT_VALUE;
    private static final SubLSymbol $kw21$NAME;
    private static final SubLSymbol $kw22$INDEX;
    private static final SubLSymbol $kw23$PROTECTION;
    private static final SubLSymbol $kw24$CLASS_NAME;
    private static final SubLSymbol $kw25$ESSENTIAL;
    private static final SubLSymbol $kw26$INIT_VALUE;
    private static final SubLString $str27$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw28$BEGIN;
    private static final SubLSymbol $sym29$MAKE_SLOT;
    private static final SubLSymbol $kw30$SLOT;
    private static final SubLSymbol $kw31$END;
    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD;
    private static final SubLSymbol $kw33$PUBLIC;
    private static final SubLList $list34;
    private static final SubLString $str35$slot;
    private static final SubLSymbol $sym36$SLOT_;
    private static final SubLString $str37$__SLOT__name__S__index__S__protec;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$CLET;
    private static final SubLSymbol $sym40$CDOLIST;
    private static final SubLSymbol $sym41$CSETQ;
    private static final SubLSymbol $sym42$PWHEN;
    private static final SubLString $str43$GET_;
    private static final SubLString $str44$_;
    private static final SubLString $str45$SET_;
    private static final SubLString $str46$INLINE_GET_SLOT___S_is_not_a_vali;
    private static final SubLString $str47$INLINE_GET_SLOT___S_is_not_a_vali;
    private static final SubLSymbol $sym48$GET_SLOT;
    private static final SubLSymbol $sym49$QUOTE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$SET_SLOT;
    private static final SubLList $list52;
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_slot(v_object, stream, (SubLObject)slots.ZERO_INTEGER);
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $slot_native.class) ? slots.T : slots.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_name(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_index(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_protection(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_class_name(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_essential(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject slot_init_value(final SubLObject v_object) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_name(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_index(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_protection(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_class_name(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_essential(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject _csetf_slot_init_value(final SubLObject v_object, final SubLObject value) {
        assert slots.NIL != slot_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject make_slot(SubLObject arglist) {
        if (arglist == slots.UNPROVIDED) {
            arglist = (SubLObject)slots.NIL;
        }
        final SubLObject v_new = (SubLObject)new $slot_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)slots.NIL, next = arglist; slots.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)slots.$kw21$NAME)) {
                _csetf_slot_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)slots.$kw22$INDEX)) {
                _csetf_slot_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)slots.$kw23$PROTECTION)) {
                _csetf_slot_protection(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)slots.$kw24$CLASS_NAME)) {
                _csetf_slot_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)slots.$kw25$ESSENTIAL)) {
                _csetf_slot_essential(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)slots.$kw26$INIT_VALUE)) {
                _csetf_slot_init_value(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)slots.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject visit_defstruct_slot(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw28$BEGIN, (SubLObject)slots.$sym29$MAKE_SLOT, (SubLObject)slots.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw21$NAME, slot_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw22$INDEX, slot_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw23$PROTECTION, slot_protection(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw24$CLASS_NAME, slot_class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw25$ESSENTIAL, slot_essential(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw30$SLOT, (SubLObject)slots.$kw26$INIT_VALUE, slot_init_value(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)slots.$kw31$END, (SubLObject)slots.$sym29$MAKE_SLOT, (SubLObject)slots.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 822L)
    public static SubLObject visit_defstruct_object_slot_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_slot(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 942L)
    public static SubLObject new_slot(final SubLObject name, final SubLObject index, final SubLObject class_name, SubLObject protection, SubLObject is_essential, SubLObject init_value) {
        if (protection == slots.UNPROVIDED) {
            protection = (SubLObject)slots.$kw33$PUBLIC;
        }
        if (is_essential == slots.UNPROVIDED) {
            is_essential = (SubLObject)slots.NIL;
        }
        if (init_value == slots.UNPROVIDED) {
            init_value = (SubLObject)slots.NIL;
        }
        final SubLObject slot = make_slot((SubLObject)slots.UNPROVIDED);
        _csetf_slot_name(slot, name);
        _csetf_slot_index(slot, index);
        _csetf_slot_protection(slot, protection);
        _csetf_slot_class_name(slot, class_name);
        _csetf_slot_essential(slot, is_essential);
        _csetf_slot_init_value(slot, conses_high.copy_tree(init_value));
        return slot;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 1379L)
    public static SubLObject with_slot(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list34);
        slot = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_var = Symbols.make_symbol((SubLObject)slots.$str35$slot);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_var, slot, (SubLObject)slots.$sym36$SLOT_, (SubLObject)slots.$list2, forms, (SubLObject)slots.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 1634L)
    public static SubLObject with_slot_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list34);
        slot = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_var = Symbols.make_symbol((SubLObject)slots.$str35$slot);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_var, slot, (SubLObject)slots.$sym36$SLOT_, (SubLObject)slots.$list2, forms, (SubLObject)slots.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 1901L)
    public static SubLObject print_slot(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = slot_name(v_object);
        final SubLObject index = slot_index(v_object);
        final SubLObject protection = slot_protection(v_object);
        final SubLObject class_name = slot_class_name(v_object);
        final SubLObject essential = slot_essential(v_object);
        final SubLObject init_value = slot_init_value(v_object);
        PrintLow.format(stream, (SubLObject)slots.$str37$__SLOT__name__S__index__S__protec, new SubLObject[] { name, index, protection, essential, class_name, init_value });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2166L)
    public static SubLObject slot_assoc(final SubLObject slot_name, final SubLObject v_slots) {
        SubLObject cdolist_list_var = v_slots;
        SubLObject slot = (SubLObject)slots.NIL;
        slot = cdolist_list_var.first();
        while (slots.NIL != cdolist_list_var) {
            final SubLObject slot_$1 = slot;
            final SubLObject name = slot_name(slot_$1);
            if (slot_name.eql(name)) {
                return slot;
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2318L)
    public static SubLObject slot_assoc_by_name(final SubLObject string, final SubLObject v_slots) {
        SubLObject cdolist_list_var = v_slots;
        SubLObject slot = (SubLObject)slots.NIL;
        slot = cdolist_list_var.first();
        while (slots.NIL != cdolist_list_var) {
            final SubLObject slot_$2 = slot;
            final SubLObject name = slot_name(slot_$2);
            if (string.equal(Symbols.symbol_name(name))) {
                return slot;
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2489L)
    public static SubLObject find_slot_index(final SubLObject slot_name, final SubLObject v_slots) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            return slot_index(slot);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2651L)
    public static SubLObject find_slot_protection(final SubLObject slot_name, final SubLObject v_slots) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            return slot_protection(slot);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2823L)
    public static SubLObject find_slot_class_name(final SubLObject slot_name, final SubLObject v_slots) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            return slot_class_name(slot);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 2995L)
    public static SubLObject find_slot_essential(final SubLObject slot_name, final SubLObject v_slots) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            return slot_essential(slot);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 3165L)
    public static SubLObject find_slot_init_value(final SubLObject slot_name, final SubLObject v_slots) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            return slot_init_value(slot);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 3337L)
    public static SubLObject set_slot_init_value(final SubLObject slot_name, final SubLObject v_slots, final SubLObject init_value) {
        final SubLObject slot = slot_assoc(slot_name, v_slots);
        if (slots.NIL != slot) {
            _csetf_slot_init_value(slot, conses_high.copy_tree(init_value));
            return (SubLObject)slots.NIL;
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 3544L)
    public static SubLObject cdoslots(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name_var = (SubLObject)slots.NIL;
        SubLObject index_var = (SubLObject)slots.NIL;
        SubLObject protection_var = (SubLObject)slots.NIL;
        SubLObject class_name_var = (SubLObject)slots.NIL;
        SubLObject init_value_var = (SubLObject)slots.NIL;
        SubLObject slots_form = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        name_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        protection_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        class_name_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        init_value_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        slots_form = current.first();
        current = current.rest();
        if (slots.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject slot_var = Symbols.make_symbol((SubLObject)slots.$str35$slot);
            return (SubLObject)ConsesLow.list((SubLObject)slots.$sym39$CLET, reader.bq_cons(name_var, ConsesLow.append(new SubLObject[] { (slots.NIL != index_var) ? ConsesLow.list(index_var) : slots.NIL, (slots.NIL != protection_var) ? ConsesLow.list(protection_var) : slots.NIL, (slots.NIL != class_name_var) ? ConsesLow.list(class_name_var) : slots.NIL, (slots.NIL != init_value_var) ? ConsesLow.list(init_value_var) : slots.NIL, slots.NIL })), (SubLObject)ConsesLow.listS((SubLObject)slots.$sym40$CDOLIST, (SubLObject)ConsesLow.list(slot_var, slots_form), (SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, name_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym9$SLOT_NAME, slot_var)), ConsesLow.append(new SubLObject[] { (slots.NIL != index_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, index_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym11$SLOT_INDEX, slot_var))) : slots.NIL, (slots.NIL != protection_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, protection_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym13$SLOT_PROTECTION, slot_var))) : slots.NIL, (slots.NIL != class_name_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, class_name_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym15$SLOT_CLASS_NAME, slot_var))) : slots.NIL, (slots.NIL != init_value_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, init_value_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym19$SLOT_INIT_VALUE, slot_var))) : slots.NIL, body })));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list38);
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 4429L)
    public static SubLObject cdo_essential_slots(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name_var = (SubLObject)slots.NIL;
        SubLObject index_var = (SubLObject)slots.NIL;
        SubLObject protection_var = (SubLObject)slots.NIL;
        SubLObject class_name_var = (SubLObject)slots.NIL;
        SubLObject init_value_var = (SubLObject)slots.NIL;
        SubLObject slots_form = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        name_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        protection_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        class_name_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        init_value_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list38);
        slots_form = current.first();
        current = current.rest();
        if (slots.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject slot_var = Symbols.make_symbol((SubLObject)slots.$str35$slot);
            return (SubLObject)ConsesLow.list((SubLObject)slots.$sym39$CLET, reader.bq_cons(name_var, ConsesLow.append(new SubLObject[] { (slots.NIL != index_var) ? ConsesLow.list(index_var) : slots.NIL, (slots.NIL != protection_var) ? ConsesLow.list(protection_var) : slots.NIL, (slots.NIL != class_name_var) ? ConsesLow.list(class_name_var) : slots.NIL, (slots.NIL != init_value_var) ? ConsesLow.list(init_value_var) : slots.NIL, slots.NIL })), (SubLObject)ConsesLow.list((SubLObject)slots.$sym40$CDOLIST, (SubLObject)ConsesLow.list(slot_var, slots_form), (SubLObject)ConsesLow.listS((SubLObject)slots.$sym42$PWHEN, (SubLObject)ConsesLow.list((SubLObject)slots.$sym17$SLOT_ESSENTIAL, slot_var), (SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, name_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym9$SLOT_NAME, slot_var)), ConsesLow.append(new SubLObject[] { (slots.NIL != index_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, index_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym11$SLOT_INDEX, slot_var))) : slots.NIL, (slots.NIL != protection_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, protection_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym13$SLOT_PROTECTION, slot_var))) : slots.NIL, (slots.NIL != class_name_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, class_name_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym15$SLOT_CLASS_NAME, slot_var))) : slots.NIL, (slots.NIL != init_value_var) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)slots.$sym41$CSETQ, init_value_var, (SubLObject)ConsesLow.list((SubLObject)slots.$sym19$SLOT_INIT_VALUE, slot_var))) : slots.NIL, body }))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list38);
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 5354L)
    public static SubLObject get_slot_accessors(final SubLObject v_slots, final SubLObject target_slot_name) {
        SubLObject slot_name = (SubLObject)slots.NIL;
        SubLObject class_name = (SubLObject)slots.NIL;
        SubLObject cdolist_list_var = v_slots;
        SubLObject slot = (SubLObject)slots.NIL;
        slot = cdolist_list_var.first();
        while (slots.NIL != cdolist_list_var) {
            slot_name = slot_name(slot);
            class_name = slot_class_name(slot);
            if (slot_name.eql(target_slot_name)) {
                return Values.values(Packages.intern(Sequences.cconcatenate((SubLObject)slots.$str43$GET_, new SubLObject[] { Symbols.symbol_name(class_name), slots.$str44$_, Symbols.symbol_name(slot_name) }), (SubLObject)slots.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)slots.$str45$SET_, new SubLObject[] { Symbols.symbol_name(class_name), slots.$str44$_, Symbols.symbol_name(slot_name) }), (SubLObject)slots.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return Values.values((SubLObject)slots.NIL, (SubLObject)slots.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 5711L)
    public static SubLObject get_instance_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
        thread.resetMultipleValues();
        SubLObject getter = get_slot_accessors(compiled_class_boolean_slot_access_alist, target_slot_name);
        SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        thread.resetMultipleValues();
        getter = get_slot_accessors(compiled_class_slot_access_alist, target_slot_name);
        setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        thread.resetMultipleValues();
        getter = get_slot_accessors(compiled_instance_boolean_slot_access_alist, target_slot_name);
        setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        thread.resetMultipleValues();
        getter = get_slot_accessors(compiled_instance_slot_access_alist, target_slot_name);
        setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        return Values.values((SubLObject)slots.NIL, (SubLObject)slots.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 6568L)
    public static SubLObject get_class_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
        thread.resetMultipleValues();
        SubLObject getter = get_slot_accessors(compiled_class_boolean_slot_access_alist, target_slot_name);
        SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        thread.resetMultipleValues();
        getter = get_slot_accessors(compiled_class_slot_access_alist, target_slot_name);
        setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter && slots.NIL != setter) {
            return Values.values(getter, setter);
        }
        return Values.values((SubLObject)slots.NIL, (SubLObject)slots.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 7050L)
    public static SubLObject expand_inline_get_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slots.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (slots.NIL == slot_name || !slot_name.isSymbol())) {
            Errors.error((SubLObject)slots.$str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name);
        }
        if (slots.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (slots.NIL == class_name || !class_name.isSymbol())) {
            Errors.error((SubLObject)slots.$str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name);
        }
        final SubLObject actual_class = classes.classes_retrieve_class(class_name);
        if (slots.NIL == actual_class) {
            return (SubLObject)ConsesLow.list((SubLObject)slots.$sym48$GET_SLOT, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)slots.$sym49$QUOTE, slot_name));
        }
        thread.resetMultipleValues();
        final SubLObject getter = get_instance_slot_accessors(actual_class, slot_name);
        final SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != getter) {
            return (SubLObject)ConsesLow.list(getter, class_or_instance);
        }
        ConsesLow.list((SubLObject)slots.$sym48$GET_SLOT, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)slots.$sym49$QUOTE, slot_name));
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 7776L)
    public static SubLObject inline_get_slot(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject slot_name = (SubLObject)slots.NIL;
        SubLObject class_name = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list50);
        slot_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list50);
        class_name = current.first();
        current = current.rest();
        if (slots.NIL == current) {
            current = temp;
            SubLObject class_or_instance = (SubLObject)slots.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list50);
            class_or_instance = current.first();
            current = current.rest();
            if (slots.NIL == current) {
                return expand_inline_get_slot(slot_name, class_name, class_or_instance);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list50);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list50);
        }
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 7919L)
    public static SubLObject expand_inline_set_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slots.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (slots.NIL == slot_name || !slot_name.isSymbol())) {
            Errors.error((SubLObject)slots.$str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name);
        }
        if (slots.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (slots.NIL == class_name || !class_name.isSymbol())) {
            Errors.error((SubLObject)slots.$str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name);
        }
        final SubLObject actual_class = classes.classes_retrieve_class(class_name);
        if (slots.NIL == actual_class) {
            return (SubLObject)ConsesLow.list((SubLObject)slots.$sym51$SET_SLOT, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)slots.$sym49$QUOTE, slot_name), new_value);
        }
        thread.resetMultipleValues();
        final SubLObject getter = get_instance_slot_accessors(actual_class, slot_name);
        final SubLObject setter = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (slots.NIL != setter) {
            return (SubLObject)ConsesLow.list(setter, class_or_instance, new_value);
        }
        ConsesLow.list((SubLObject)slots.$sym51$SET_SLOT, class_or_instance, (SubLObject)ConsesLow.list((SubLObject)slots.$sym49$QUOTE, slot_name), new_value);
        return (SubLObject)slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slots.lisp", position = 8688L)
    public static SubLObject inline_set_slot(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject slot_name = (SubLObject)slots.NIL;
        SubLObject class_name = (SubLObject)slots.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list52);
        slot_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list52);
        class_name = current.first();
        current = current.rest();
        if (slots.NIL == current) {
            current = temp;
            SubLObject class_or_instance = (SubLObject)slots.NIL;
            SubLObject new_value = (SubLObject)slots.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list52);
            class_or_instance = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)slots.$list52);
            new_value = current.first();
            current = current.rest();
            if (slots.NIL == current) {
                return expand_inline_set_slot(slot_name, class_name, class_or_instance, new_value);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list52);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)slots.$list52);
        }
        return (SubLObject)slots.NIL;
    }
    
    public static SubLObject declare_slots_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_print_function_trampoline", "SLOT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_p", "SLOT-P", 1, 0, false);
        new $slot_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_name", "SLOT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_index", "SLOT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_protection", "SLOT-PROTECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_class_name", "SLOT-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_essential", "SLOT-ESSENTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_init_value", "SLOT-INIT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_name", "_CSETF-SLOT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_index", "_CSETF-SLOT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_protection", "_CSETF-SLOT-PROTECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_class_name", "_CSETF-SLOT-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_essential", "_CSETF-SLOT-ESSENTIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "_csetf_slot_init_value", "_CSETF-SLOT-INIT-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "make_slot", "MAKE-SLOT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "visit_defstruct_slot", "VISIT-DEFSTRUCT-SLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "visit_defstruct_object_slot_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "new_slot", "NEW-SLOT", 3, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "with_slot", "WITH-SLOT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "with_slot_private", "WITH-SLOT-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "print_slot", "PRINT-SLOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_assoc", "SLOT-ASSOC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "slot_assoc_by_name", "SLOT-ASSOC-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "find_slot_index", "FIND-SLOT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "find_slot_protection", "FIND-SLOT-PROTECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "find_slot_class_name", "FIND-SLOT-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "find_slot_essential", "FIND-SLOT-ESSENTIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "find_slot_init_value", "FIND-SLOT-INIT-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "set_slot_init_value", "SET-SLOT-INIT-VALUE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "cdoslots", "CDOSLOTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "cdo_essential_slots", "CDO-ESSENTIAL-SLOTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "get_slot_accessors", "GET-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "get_instance_slot_accessors", "GET-INSTANCE-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "get_class_slot_accessors", "GET-CLASS-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "expand_inline_get_slot", "EXPAND-INLINE-GET-SLOT", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "inline_get_slot", "INLINE-GET-SLOT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slots", "expand_inline_set_slot", "EXPAND-INLINE-SET-SLOT", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.slots", "inline_set_slot", "INLINE-SET-SLOT");
        return (SubLObject)slots.NIL;
    }
    
    public static SubLObject init_slots_file() {
        slots.$dtp_slot$ = SubLFiles.defconstant("*DTP-SLOT*", (SubLObject)slots.$sym0$SLOT);
        return (SubLObject)slots.NIL;
    }
    
    public static SubLObject setup_slots_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), slots.$dtp_slot$.getGlobalValue(), Symbols.symbol_function((SubLObject)slots.$sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)slots.$list8);
        Structures.def_csetf((SubLObject)slots.$sym9$SLOT_NAME, (SubLObject)slots.$sym10$_CSETF_SLOT_NAME);
        Structures.def_csetf((SubLObject)slots.$sym11$SLOT_INDEX, (SubLObject)slots.$sym12$_CSETF_SLOT_INDEX);
        Structures.def_csetf((SubLObject)slots.$sym13$SLOT_PROTECTION, (SubLObject)slots.$sym14$_CSETF_SLOT_PROTECTION);
        Structures.def_csetf((SubLObject)slots.$sym15$SLOT_CLASS_NAME, (SubLObject)slots.$sym16$_CSETF_SLOT_CLASS_NAME);
        Structures.def_csetf((SubLObject)slots.$sym17$SLOT_ESSENTIAL, (SubLObject)slots.$sym18$_CSETF_SLOT_ESSENTIAL);
        Structures.def_csetf((SubLObject)slots.$sym19$SLOT_INIT_VALUE, (SubLObject)slots.$sym20$_CSETF_SLOT_INIT_VALUE);
        Equality.identity((SubLObject)slots.$sym0$SLOT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), slots.$dtp_slot$.getGlobalValue(), Symbols.symbol_function((SubLObject)slots.$sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD));
        return (SubLObject)slots.NIL;
    }
    
    public void declareFunctions() {
        declare_slots_file();
    }
    
    public void initializeVariables() {
        init_slots_file();
    }
    
    public void runTopLevelForms() {
        setup_slots_file();
    }
    
    static {
        me = (SubLFile)new slots();
        slots.$dtp_slot$ = null;
        $sym0$SLOT = SubLObjectFactory.makeSymbol("SLOT");
        $sym1$SLOT_P = SubLObjectFactory.makeSymbol("SLOT-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTION"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ESSENTIAL"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-VALUE"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTION"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL"), (SubLObject)SubLObjectFactory.makeKeyword("INIT-VALUE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-PROTECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-ESSENTIAL"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-INIT-VALUE"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-PROTECTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-ESSENTIAL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLOT-INIT-VALUE"));
        $sym6$PRINT_SLOT = SubLObjectFactory.makeSymbol("PRINT-SLOT");
        $sym7$SLOT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SLOT-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-P"));
        $sym9$SLOT_NAME = SubLObjectFactory.makeSymbol("SLOT-NAME");
        $sym10$_CSETF_SLOT_NAME = SubLObjectFactory.makeSymbol("_CSETF-SLOT-NAME");
        $sym11$SLOT_INDEX = SubLObjectFactory.makeSymbol("SLOT-INDEX");
        $sym12$_CSETF_SLOT_INDEX = SubLObjectFactory.makeSymbol("_CSETF-SLOT-INDEX");
        $sym13$SLOT_PROTECTION = SubLObjectFactory.makeSymbol("SLOT-PROTECTION");
        $sym14$_CSETF_SLOT_PROTECTION = SubLObjectFactory.makeSymbol("_CSETF-SLOT-PROTECTION");
        $sym15$SLOT_CLASS_NAME = SubLObjectFactory.makeSymbol("SLOT-CLASS-NAME");
        $sym16$_CSETF_SLOT_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-SLOT-CLASS-NAME");
        $sym17$SLOT_ESSENTIAL = SubLObjectFactory.makeSymbol("SLOT-ESSENTIAL");
        $sym18$_CSETF_SLOT_ESSENTIAL = SubLObjectFactory.makeSymbol("_CSETF-SLOT-ESSENTIAL");
        $sym19$SLOT_INIT_VALUE = SubLObjectFactory.makeSymbol("SLOT-INIT-VALUE");
        $sym20$_CSETF_SLOT_INIT_VALUE = SubLObjectFactory.makeSymbol("_CSETF-SLOT-INIT-VALUE");
        $kw21$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw22$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw23$PROTECTION = SubLObjectFactory.makeKeyword("PROTECTION");
        $kw24$CLASS_NAME = SubLObjectFactory.makeKeyword("CLASS-NAME");
        $kw25$ESSENTIAL = SubLObjectFactory.makeKeyword("ESSENTIAL");
        $kw26$INIT_VALUE = SubLObjectFactory.makeKeyword("INIT-VALUE");
        $str27$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw28$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym29$MAKE_SLOT = SubLObjectFactory.makeSymbol("MAKE-SLOT");
        $kw30$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw31$END = SubLObjectFactory.makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD");
        $kw33$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str35$slot = SubLObjectFactory.makeString("slot");
        $sym36$SLOT_ = SubLObjectFactory.makeSymbol("SLOT-");
        $str37$__SLOT__name__S__index__S__protec = SubLObjectFactory.makeString("#<SLOT: name=~S, index=~S, protection=~S, essential=~S, class=~S, init-value=~S>");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-VALUE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS-FORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym40$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym41$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym42$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $str43$GET_ = SubLObjectFactory.makeString("GET-");
        $str44$_ = SubLObjectFactory.makeString("-");
        $str45$SET_ = SubLObjectFactory.makeString("SET-");
        $str46$INLINE_GET_SLOT___S_is_not_a_vali = SubLObjectFactory.makeString("INLINE-GET-SLOT: ~S is not a valid slot name.  A non-nil symbol was expected.");
        $str47$INLINE_GET_SLOT___S_is_not_a_vali = SubLObjectFactory.makeString("INLINE-GET-SLOT: ~S is not a valid class name.  A non-nil symbol was expected.");
        $sym48$GET_SLOT = SubLObjectFactory.makeSymbol("GET-SLOT");
        $sym49$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"));
        $sym51$SET_SLOT = SubLObjectFactory.makeSymbol("SET-SLOT");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
    }
    
    public static final class $slot_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $index;
        public SubLObject $protection;
        public SubLObject $class_name;
        public SubLObject $essential;
        public SubLObject $init_value;
        private static final SubLStructDeclNative structDecl;
        
        public $slot_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$protection = (SubLObject)CommonSymbols.NIL;
            this.$class_name = (SubLObject)CommonSymbols.NIL;
            this.$essential = (SubLObject)CommonSymbols.NIL;
            this.$init_value = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$slot_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$index;
        }
        
        public SubLObject getField4() {
            return this.$protection;
        }
        
        public SubLObject getField5() {
            return this.$class_name;
        }
        
        public SubLObject getField6() {
            return this.$essential;
        }
        
        public SubLObject getField7() {
            return this.$init_value;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$protection = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$class_name = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$essential = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$init_value = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$slot_native.class, slots.$sym0$SLOT, slots.$sym1$SLOT_P, slots.$list2, slots.$list3, new String[] { "$name", "$index", "$protection", "$class_name", "$essential", "$init_value" }, slots.$list4, slots.$list5, slots.$sym6$PRINT_SLOT);
        }
    }
    
    public static final class $slot_p$UnaryFunction extends UnaryFunction
    {
        public $slot_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SLOT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return slots.slot_p(arg1);
        }
    }
}

/*

	Total time: 212 ms
	
*/