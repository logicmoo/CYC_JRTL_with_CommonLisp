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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_extensions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subl_extensions";
    public static final String myFingerPrint = "8ecafa9f2443f789b25a2d3969ac2a92aa70987f28a10395b43fe63cfb17b3f1";
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLSymbol $dtp_structure_info$;
    private static final SubLSymbol $sym0$STRUCTURE_INFO;
    private static final SubLSymbol $sym1$STRUCTURE_INFO_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$STRUCTURE_INFO_TYPE_NAME;
    private static final SubLSymbol $sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME;
    private static final SubLSymbol $sym11$STRUCTURE_INFO_SLOT_LIST;
    private static final SubLSymbol $sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST;
    private static final SubLSymbol $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS;
    private static final SubLSymbol $sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS;
    private static final SubLSymbol $sym15$STRUCTURE_INFO_PLIST;
    private static final SubLSymbol $sym16$_CSETF_STRUCTURE_INFO_PLIST;
    private static final SubLSymbol $kw17$TYPE_NAME;
    private static final SubLSymbol $kw18$SLOT_LIST;
    private static final SubLSymbol $kw19$ACCESSOR_ASSOCIATIONS;
    private static final SubLSymbol $kw20$PLIST;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_STRUCTURE_INFO;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD;
    private static final SubLString $str27$__Description_of__S_Structure_Ins;
    private static final SubLList $list28;
    private static final SubLString $str29$_____S_____S;
    private static final SubLString $str30$__End_of_Description_;
    private static final SubLString $str31$_STRUCTURE_INFO_FOR_;
    private static final SubLString $str32$_DEFSTRUCT_;
    private static final SubLString $str33$CREATE_NEW_;
    private static final SubLString $str34$_HAS_SLOT_P;
    private static final SubLString $str35$SET_;
    private static final SubLSymbol $sym36$DEFINE_PROTECTED;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$CSETF;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLString $str42$DEFINE_STRUCTURE___S_is_not_a_val;
    private static final SubLSymbol $kw43$CONC_NAME;
    private static final SubLString $str44$SYSTEM_PRIVATE_STRUCTURE_INFO;
    private static final SubLString $str45$_;
    private static final SubLString $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO;
    private static final SubLSymbol $sym47$PROGN;
    private static final SubLSymbol $sym48$DEFPARAMETER_PUBLIC;
    private static final SubLSymbol $sym49$CREATE_STRUCTURE_INFO;
    private static final SubLSymbol $sym50$QUOTE;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$DEFSTRUCT;
    private static final SubLSymbol $sym53$SYSTEM_PRIVATE_STRUCTURE_INFO;
    private static final SubLSymbol $sym54$DEFINE_PUBLIC;
    private static final SubLSymbol $sym55$CLET;
    private static final SubLSymbol $sym56$NEW_INSTANCE;
    private static final SubLString $str57$MAKE_;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$RET;
    private static final SubLSymbol $sym62$FIF;
    private static final SubLSymbol $sym63$MEMBER;
    private static final SubLSymbol $sym64$SLOT_NAME;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLString $str67$GET_;
    private static final SubLString $str68$_SLOT;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$ASSOCIATION;
    private static final SubLSymbol $sym71$ASSOC;
    private static final SubLSymbol $sym72$SLOT;
    private static final SubLSymbol $sym73$PUNLESS;
    private static final SubLSymbol $sym74$WARN;
    private static final SubLString $str75$Structures_of_type__S_have_no__S_;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$FUNCALL;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLString $str82$DESCRIBE_;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$DESCRIBE_STRUCTURE;
    private static final SubLSymbol $sym85$STREAM;
    private static final SubLList $list86;
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subl_extensions.ZERO_INTEGER);
        return (SubLObject)subl_extensions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $structure_info_native.class) ? subl_extensions.T : subl_extensions.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_type_name(final SubLObject v_object) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_slot_list(final SubLObject v_object) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_accessor_associations(final SubLObject v_object) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject structure_info_plist(final SubLObject v_object) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject _csetf_structure_info_type_name(final SubLObject v_object, final SubLObject value) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject _csetf_structure_info_slot_list(final SubLObject v_object, final SubLObject value) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject _csetf_structure_info_accessor_associations(final SubLObject v_object, final SubLObject value) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject _csetf_structure_info_plist(final SubLObject v_object, final SubLObject value) {
        assert subl_extensions.NIL != structure_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject make_structure_info(SubLObject arglist) {
        if (arglist == subl_extensions.UNPROVIDED) {
            arglist = (SubLObject)subl_extensions.NIL;
        }
        final SubLObject v_new = (SubLObject)new $structure_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subl_extensions.NIL, next = arglist; subl_extensions.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subl_extensions.$kw17$TYPE_NAME)) {
                _csetf_structure_info_type_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subl_extensions.$kw18$SLOT_LIST)) {
                _csetf_structure_info_slot_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subl_extensions.$kw19$ACCESSOR_ASSOCIATIONS)) {
                _csetf_structure_info_accessor_associations(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subl_extensions.$kw20$PLIST)) {
                _csetf_structure_info_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subl_extensions.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject visit_defstruct_structure_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw22$BEGIN, (SubLObject)subl_extensions.$sym23$MAKE_STRUCTURE_INFO, (SubLObject)subl_extensions.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw24$SLOT, (SubLObject)subl_extensions.$kw17$TYPE_NAME, structure_info_type_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw24$SLOT, (SubLObject)subl_extensions.$kw18$SLOT_LIST, structure_info_slot_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw24$SLOT, (SubLObject)subl_extensions.$kw19$ACCESSOR_ASSOCIATIONS, structure_info_accessor_associations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw24$SLOT, (SubLObject)subl_extensions.$kw20$PLIST, structure_info_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subl_extensions.$kw25$END, (SubLObject)subl_extensions.$sym23$MAKE_STRUCTURE_INFO, (SubLObject)subl_extensions.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2286L)
    public static SubLObject visit_defstruct_object_structure_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_structure_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 2539L)
    public static SubLObject create_structure_info(final SubLObject type_name, final SubLObject slot_list, final SubLObject associations, final SubLObject plist) {
        final SubLObject structure_info_instance = make_structure_info((SubLObject)subl_extensions.UNPROVIDED);
        _csetf_structure_info_type_name(structure_info_instance, type_name);
        _csetf_structure_info_slot_list(structure_info_instance, conses_high.copy_list(slot_list));
        _csetf_structure_info_accessor_associations(structure_info_instance, conses_high.copy_tree(associations));
        _csetf_structure_info_plist(structure_info_instance, plist);
        return structure_info_instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 3370L)
    public static SubLObject describe_structure(final SubLObject stream, final SubLObject info, final SubLObject structure) {
        final SubLObject accessor_associations = structure_info_accessor_associations(info);
        PrintLow.format(stream, (SubLObject)subl_extensions.$str27$__Description_of__S_Structure_Ins, structure_info_type_name(info), structure);
        SubLObject cdolist_list_var = accessor_associations;
        SubLObject cons = (SubLObject)subl_extensions.NIL;
        cons = cdolist_list_var.first();
        while (subl_extensions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject slot_name = (SubLObject)subl_extensions.NIL;
            SubLObject accessors_pair = (SubLObject)subl_extensions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_extensions.$list28);
            slot_name = current.first();
            current = (accessors_pair = current.rest());
            PrintLow.format(stream, (SubLObject)subl_extensions.$str29$_____S_____S, slot_name, Functions.funcall(accessors_pair.first(), structure));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)subl_extensions.$str30$__End_of_Description_);
        return structure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4118L)
    public static SubLObject subl_extensions_generate_var_name(final SubLObject type_name) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str31$_STRUCTURE_INFO_FOR_, new SubLObject[] { format_nil.format_nil_s_no_copy(type_name), subl_extensions.$str32$_DEFSTRUCT_ }), (SubLObject)subl_extensions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4369L)
    public static SubLObject subl_extensions_generate_defstruct_constructor(final SubLObject type_name) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str33$CREATE_NEW_, format_nil.format_nil_s_no_copy(type_name)), (SubLObject)subl_extensions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4614L)
    public static SubLObject subl_extensions_generate_has_slot_predicate_name(final SubLObject type_name) {
        return Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str34$_HAS_SLOT_P), (SubLObject)subl_extensions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 4901L)
    public static SubLObject subl_extensions_generate_accessor_associations(final SubLObject conc_name, final SubLObject slot_list) {
        SubLObject getter_alist = (SubLObject)subl_extensions.NIL;
        if (subl_extensions.NIL == slot_list) {
            getter_alist = (SubLObject)subl_extensions.NIL;
        }
        else if (slot_list.isAtom()) {
            getter_alist = (SubLObject)ConsesLow.list(slot_list);
        }
        else if (subl_extensions.NIL == slot_list.rest()) {
            final SubLObject slot_name = slot_list.first();
            getter_alist = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(slot_name, Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name)), (SubLObject)subl_extensions.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name) }), (SubLObject)subl_extensions.UNPROVIDED)));
        }
        else {
            SubLObject tail_cons = (SubLObject)subl_extensions.NIL;
            SubLObject result = (SubLObject)subl_extensions.NIL;
            final SubLObject slot_name2 = slot_list.first();
            getter_alist = (tail_cons = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(slot_name2, Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name2)), (SubLObject)subl_extensions.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name2) }), (SubLObject)subl_extensions.UNPROVIDED))));
            SubLObject cdolist_list_var = slot_list.rest();
            SubLObject slot_name3 = (SubLObject)subl_extensions.NIL;
            slot_name3 = cdolist_list_var.first();
            while (subl_extensions.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(slot_name3, Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name3)), (SubLObject)subl_extensions.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name3) }), (SubLObject)subl_extensions.UNPROVIDED)));
                ConsesLow.rplacd(tail_cons, result);
                tail_cons = result;
                cdolist_list_var = cdolist_list_var.rest();
                slot_name3 = cdolist_list_var.first();
            }
        }
        return getter_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 5552L)
    public static SubLObject subl_extensions_generate_setters(final SubLObject conc_name, final SubLObject slot_list) {
        SubLObject setters = (SubLObject)subl_extensions.NIL;
        SubLObject cdolist_list_var = slot_list;
        SubLObject slot = (SubLObject)subl_extensions.NIL;
        slot = cdolist_list_var.first();
        while (subl_extensions.NIL != cdolist_list_var) {
            setters = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym36$DEFINE_PROTECTED, Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot) }), (SubLObject)subl_extensions.UNPROVIDED), (SubLObject)subl_extensions.$list37, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym38$CSETF, reader.bq_cons(Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot)), (SubLObject)subl_extensions.UNPROVIDED), (SubLObject)subl_extensions.$list39), (SubLObject)subl_extensions.$list40), (SubLObject)subl_extensions.$list41), setters);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return Sequences.nreverse(setters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 6116L)
    public static SubLObject expand_define_structure(final SubLObject head, final SubLObject v_slots) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type_name = head.isCons() ? head.first() : head;
        SubLObject slot_list = (SubLObject)subl_extensions.NIL;
        if (subl_extensions.NIL == v_slots) {
            slot_list = (SubLObject)subl_extensions.NIL;
        }
        else if (v_slots.isAtom()) {
            slot_list = (SubLObject)ConsesLow.list(v_slots);
        }
        else if (subl_extensions.NIL == v_slots.rest()) {
            final SubLObject slot_decl = v_slots.first();
            slot_list = (SubLObject)ConsesLow.list(slot_decl.isCons() ? slot_decl.first() : slot_decl);
        }
        else {
            SubLObject tail_cons = (SubLObject)subl_extensions.NIL;
            SubLObject result = (SubLObject)subl_extensions.NIL;
            final SubLObject slot_decl2 = v_slots.first();
            slot_list = (tail_cons = (SubLObject)ConsesLow.list(slot_decl2.isCons() ? slot_decl2.first() : slot_decl2));
            SubLObject cdolist_list_var = v_slots.rest();
            SubLObject slot_decl3 = (SubLObject)subl_extensions.NIL;
            slot_decl3 = cdolist_list_var.first();
            while (subl_extensions.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.list(slot_decl3.isCons() ? slot_decl3.first() : slot_decl3);
                ConsesLow.rplacd(tail_cons, result);
                tail_cons = result;
                cdolist_list_var = cdolist_list_var.rest();
                slot_decl3 = cdolist_list_var.first();
            }
        }
        if (subl_extensions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (subl_extensions.NIL == type_name || !type_name.isSymbol())) {
            Errors.error((SubLObject)subl_extensions.$str42$DEFINE_STRUCTURE___S_is_not_a_val, type_name);
        }
        final SubLObject var_name = subl_extensions_generate_var_name(type_name);
        final SubLObject has_slot_predicate_name = subl_extensions_generate_has_slot_predicate_name(type_name);
        SubLObject accessor_name = (SubLObject)subl_extensions.NIL;
        SubLObject accessor_associations = (SubLObject)subl_extensions.NIL;
        SubLObject conc_name = (SubLObject)subl_extensions.NIL;
        if (head.isCons()) {
            final SubLObject conc_name_association = conses_high.assoc((SubLObject)subl_extensions.$kw43$CONC_NAME, head.rest(), (SubLObject)subl_extensions.UNPROVIDED, (SubLObject)subl_extensions.UNPROVIDED);
            if (subl_extensions.NIL != conc_name_association) {
                conc_name = conses_high.cadr(conc_name_association);
                accessor_name = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(conc_name), (SubLObject)subl_extensions.$str44$SYSTEM_PRIVATE_STRUCTURE_INFO), (SubLObject)subl_extensions.UNPROVIDED);
                accessor_associations = subl_extensions_generate_accessor_associations(conc_name, slot_list);
            }
            else {
                conc_name = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str45$_), (SubLObject)subl_extensions.UNPROVIDED);
                accessor_name = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str46$_SYSTEM_PRIVATE_STRUCTURE_INFO), (SubLObject)subl_extensions.UNPROVIDED);
                accessor_associations = subl_extensions_generate_accessor_associations(Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str45$_), (SubLObject)subl_extensions.UNPROVIDED), slot_list);
            }
        }
        else {
            accessor_name = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str46$_SYSTEM_PRIVATE_STRUCTURE_INFO), (SubLObject)subl_extensions.UNPROVIDED);
            accessor_associations = subl_extensions_generate_accessor_associations(Packages.intern(Sequences.cconcatenate(format_nil.format_nil_s_no_copy(type_name), (SubLObject)subl_extensions.$str45$_), (SubLObject)subl_extensions.UNPROVIDED), slot_list);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym47$PROGN, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym48$DEFPARAMETER_PUBLIC, var_name, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym49$CREATE_STRUCTURE_INFO, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym50$QUOTE, type_name), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym50$QUOTE, slot_list), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym50$QUOTE, accessor_associations), (SubLObject)subl_extensions.$list51)), (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym52$DEFSTRUCT, conses_high.copy_tree(head), (SubLObject)subl_extensions.$sym53$SYSTEM_PRIVATE_STRUCTURE_INFO, conses_high.copy_tree(v_slots)), ConsesLow.append(subl_extensions_generate_setters(conc_name, slot_list), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym54$DEFINE_PUBLIC, subl_extensions_generate_defstruct_constructor(type_name), (SubLObject)subl_extensions.NIL, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym55$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym56$NEW_INSTANCE, (SubLObject)ConsesLow.list(Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str57$MAKE_, format_nil.format_nil_s_no_copy(type_name)), (SubLObject)subl_extensions.UNPROVIDED)))), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym38$CSETF, reader.bq_cons(accessor_name, (SubLObject)subl_extensions.$list58), var_name), (SubLObject)subl_extensions.$list59)), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym54$DEFINE_PUBLIC, has_slot_predicate_name, (SubLObject)subl_extensions.$list60, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym61$RET, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym62$FIF, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym63$MEMBER, (SubLObject)subl_extensions.$sym64$SLOT_NAME, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym11$STRUCTURE_INFO_SLOT_LIST, reader.bq_cons(accessor_name, (SubLObject)subl_extensions.$list65))), (SubLObject)subl_extensions.$list66))), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym54$DEFINE_PUBLIC, Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str67$GET_, new SubLObject[] { format_nil.format_nil_s_no_copy(type_name), subl_extensions.$str68$_SLOT }), (SubLObject)subl_extensions.UNPROVIDED), reader.bq_cons(type_name, (SubLObject)subl_extensions.$list69), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym55$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym70$ASSOCIATION, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym71$ASSOC, (SubLObject)subl_extensions.$sym72$SLOT, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, (SubLObject)ConsesLow.list(accessor_name, type_name))))), (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym73$PUNLESS, (SubLObject)subl_extensions.$sym70$ASSOCIATION, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym74$WARN, (SubLObject)subl_extensions.$str75$Structures_of_type__S_have_no__S_, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym50$QUOTE, type_name), (SubLObject)subl_extensions.$list76), (SubLObject)subl_extensions.$list77), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym61$RET, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym78$FUNCALL, (SubLObject)subl_extensions.$list79, type_name)))), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym54$DEFINE_PUBLIC, Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str35$SET_, new SubLObject[] { format_nil.format_nil_s_no_copy(type_name), subl_extensions.$str68$_SLOT }), (SubLObject)subl_extensions.UNPROVIDED), reader.bq_cons(type_name, (SubLObject)subl_extensions.$list80), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym55$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym70$ASSOCIATION, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym71$ASSOC, (SubLObject)subl_extensions.$sym72$SLOT, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, (SubLObject)ConsesLow.list(accessor_name, type_name))))), (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym73$PUNLESS, (SubLObject)subl_extensions.$sym70$ASSOCIATION, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym74$WARN, (SubLObject)subl_extensions.$str75$Structures_of_type__S_have_no__S_, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym50$QUOTE, type_name), (SubLObject)subl_extensions.$list76), (SubLObject)subl_extensions.$list77), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym61$RET, (SubLObject)ConsesLow.listS((SubLObject)subl_extensions.$sym78$FUNCALL, (SubLObject)subl_extensions.$list81, type_name, (SubLObject)subl_extensions.$list40)))), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym54$DEFINE_PUBLIC, Packages.intern(Sequences.cconcatenate((SubLObject)subl_extensions.$str82$DESCRIBE_, format_nil.format_nil_s_no_copy(type_name)), (SubLObject)subl_extensions.UNPROVIDED), reader.bq_cons(type_name, (SubLObject)subl_extensions.$list83), (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym61$RET, (SubLObject)ConsesLow.list((SubLObject)subl_extensions.$sym84$DESCRIBE_STRUCTURE, (SubLObject)subl_extensions.$sym85$STREAM, (SubLObject)ConsesLow.list(accessor_name, type_name), type_name))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-extensions.lisp", position = 9436L)
    public static SubLObject define_structure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject head = (SubLObject)subl_extensions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_extensions.$list86);
        head = current.first();
        final SubLObject v_slots;
        current = (v_slots = current.rest());
        return expand_define_structure(head, v_slots);
    }
    
    public static SubLObject declare_subl_extensions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_print_function_trampoline", "STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_p", "STRUCTURE-INFO-P", 1, 0, false);
        new $structure_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_type_name", "STRUCTURE-INFO-TYPE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_slot_list", "STRUCTURE-INFO-SLOT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_accessor_associations", "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "structure_info_plist", "STRUCTURE-INFO-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "_csetf_structure_info_type_name", "_CSETF-STRUCTURE-INFO-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "_csetf_structure_info_slot_list", "_CSETF-STRUCTURE-INFO-SLOT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "_csetf_structure_info_accessor_associations", "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "_csetf_structure_info_plist", "_CSETF-STRUCTURE-INFO-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "make_structure_info", "MAKE-STRUCTURE-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "visit_defstruct_structure_info", "VISIT-DEFSTRUCT-STRUCTURE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "visit_defstruct_object_structure_info_method", "VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "create_structure_info", "CREATE-STRUCTURE-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "describe_structure", "DESCRIBE-STRUCTURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "subl_extensions_generate_var_name", "SUBL-EXTENSIONS-GENERATE-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "subl_extensions_generate_defstruct_constructor", "SUBL-EXTENSIONS-GENERATE-DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "subl_extensions_generate_has_slot_predicate_name", "SUBL-EXTENSIONS-GENERATE-HAS-SLOT-PREDICATE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "subl_extensions_generate_accessor_associations", "SUBL-EXTENSIONS-GENERATE-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "subl_extensions_generate_setters", "SUBL-EXTENSIONS-GENERATE-SETTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_extensions", "expand_define_structure", "EXPAND-DEFINE-STRUCTURE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_extensions", "define_structure", "DEFINE-STRUCTURE");
        return (SubLObject)subl_extensions.NIL;
    }
    
    public static SubLObject init_subl_extensions_file() {
        subl_extensions.$dtp_structure_info$ = SubLFiles.defconstant("*DTP-STRUCTURE-INFO*", (SubLObject)subl_extensions.$sym0$STRUCTURE_INFO);
        return (SubLObject)subl_extensions.NIL;
    }
    
    public static SubLObject setup_subl_extensions_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subl_extensions.$dtp_structure_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)subl_extensions.$sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subl_extensions.$list8);
        Structures.def_csetf((SubLObject)subl_extensions.$sym9$STRUCTURE_INFO_TYPE_NAME, (SubLObject)subl_extensions.$sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME);
        Structures.def_csetf((SubLObject)subl_extensions.$sym11$STRUCTURE_INFO_SLOT_LIST, (SubLObject)subl_extensions.$sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST);
        Structures.def_csetf((SubLObject)subl_extensions.$sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, (SubLObject)subl_extensions.$sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS);
        Structures.def_csetf((SubLObject)subl_extensions.$sym15$STRUCTURE_INFO_PLIST, (SubLObject)subl_extensions.$sym16$_CSETF_STRUCTURE_INFO_PLIST);
        Equality.identity((SubLObject)subl_extensions.$sym0$STRUCTURE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subl_extensions.$dtp_structure_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)subl_extensions.$sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD));
        return (SubLObject)subl_extensions.NIL;
    }
    
    public void declareFunctions() {
        declare_subl_extensions_file();
    }
    
    public void initializeVariables() {
        init_subl_extensions_file();
    }
    
    public void runTopLevelForms() {
        setup_subl_extensions_file();
    }
    
    static {
        me = (SubLFile)new subl_extensions();
        subl_extensions.$dtp_structure_info$ = null;
        $sym0$STRUCTURE_INFO = SubLObjectFactory.makeSymbol("STRUCTURE-INFO");
        $sym1$STRUCTURE_INFO_P = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESSOR-ASSOCIATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SLOT-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSOR-ASSOCIATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE-INFO-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE-INFO-SLOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE-INFO-PLIST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-PLIST"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE-INFO-P"));
        $sym9$STRUCTURE_INFO_TYPE_NAME = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-TYPE-NAME");
        $sym10$_CSETF_STRUCTURE_INFO_TYPE_NAME = SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME");
        $sym11$STRUCTURE_INFO_SLOT_LIST = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-SLOT-LIST");
        $sym12$_CSETF_STRUCTURE_INFO_SLOT_LIST = SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST");
        $sym13$STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS");
        $sym14$_CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS");
        $sym15$STRUCTURE_INFO_PLIST = SubLObjectFactory.makeSymbol("STRUCTURE-INFO-PLIST");
        $sym16$_CSETF_STRUCTURE_INFO_PLIST = SubLObjectFactory.makeSymbol("_CSETF-STRUCTURE-INFO-PLIST");
        $kw17$TYPE_NAME = SubLObjectFactory.makeKeyword("TYPE-NAME");
        $kw18$SLOT_LIST = SubLObjectFactory.makeKeyword("SLOT-LIST");
        $kw19$ACCESSOR_ASSOCIATIONS = SubLObjectFactory.makeKeyword("ACCESSOR-ASSOCIATIONS");
        $kw20$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_STRUCTURE_INFO = SubLObjectFactory.makeSymbol("MAKE-STRUCTURE-INFO");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD");
        $str27$__Description_of__S_Structure_Ins = SubLObjectFactory.makeString("~%Description of ~S Structure Instance ~S:");
        $list28 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESSORS-PAIR"));
        $str29$_____S_____S = SubLObjectFactory.makeString("~%  ~S -> ~S");
        $str30$__End_of_Description_ = SubLObjectFactory.makeString("~%End of Description.");
        $str31$_STRUCTURE_INFO_FOR_ = SubLObjectFactory.makeString("*STRUCTURE-INFO-FOR-");
        $str32$_DEFSTRUCT_ = SubLObjectFactory.makeString("-DEFSTRUCT*");
        $str33$CREATE_NEW_ = SubLObjectFactory.makeString("CREATE-NEW-");
        $str34$_HAS_SLOT_P = SubLObjectFactory.makeString("-HAS-SLOT-P");
        $str35$SET_ = SubLObjectFactory.makeString("SET-");
        $sym36$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRUCT-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $sym38$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRUCT-OBJECT"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")));
        $str42$DEFINE_STRUCTURE___S_is_not_a_val = SubLObjectFactory.makeString("DEFINE-STRUCTURE: ~S is not a valid structure type name.");
        $kw43$CONC_NAME = SubLObjectFactory.makeKeyword("CONC-NAME");
        $str44$SYSTEM_PRIVATE_STRUCTURE_INFO = SubLObjectFactory.makeString("SYSTEM-PRIVATE-STRUCTURE-INFO");
        $str45$_ = SubLObjectFactory.makeString("-");
        $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO = SubLObjectFactory.makeString("-SYSTEM-PRIVATE-STRUCTURE-INFO");
        $sym47$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym48$DEFPARAMETER_PUBLIC = SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC");
        $sym49$CREATE_STRUCTURE_INFO = SubLObjectFactory.makeSymbol("CREATE-STRUCTURE-INFO");
        $sym50$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list51 = ConsesLow.list((SubLObject)subl_extensions.NIL);
        $sym52$DEFSTRUCT = SubLObjectFactory.makeSymbol("DEFSTRUCT");
        $sym53$SYSTEM_PRIVATE_STRUCTURE_INFO = SubLObjectFactory.makeSymbol("SYSTEM-PRIVATE-STRUCTURE-INFO");
        $sym54$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym55$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym56$NEW_INSTANCE = SubLObjectFactory.makeSymbol("NEW-INSTANCE");
        $str57$MAKE_ = SubLObjectFactory.makeString("MAKE-");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INSTANCE"));
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INSTANCE")));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"));
        $sym61$RET = SubLObjectFactory.makeSymbol("RET");
        $sym62$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym63$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $sym64$SLOT_NAME = SubLObjectFactory.makeSymbol("SLOT-NAME");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"));
        $list66 = ConsesLow.list((SubLObject)subl_extensions.T, (SubLObject)subl_extensions.NIL);
        $str67$GET_ = SubLObjectFactory.makeString("GET-");
        $str68$_SLOT = SubLObjectFactory.makeString("-SLOT");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)subl_extensions.NIL));
        $sym70$ASSOCIATION = SubLObjectFactory.makeSymbol("ASSOCIATION");
        $sym71$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $sym72$SLOT = SubLObjectFactory.makeSymbol("SLOT");
        $sym73$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym74$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str75$Structures_of_type__S_have_no__S_ = SubLObjectFactory.makeString("Structures of type ~S have no ~S slot.");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT")));
        $sym78$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSOCIATION"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)subl_extensions.NIL));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSOCIATION"));
        $str82$DESCRIBE_ = SubLObjectFactory.makeString("DESCRIBE-");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")));
        $sym84$DESCRIBE_STRUCTURE = SubLObjectFactory.makeSymbol("DESCRIBE-STRUCTURE");
        $sym85$STREAM = SubLObjectFactory.makeSymbol("STREAM");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS"));
    }
    
    public static final class $structure_info_native extends SubLStructNative
    {
        public SubLObject $type_name;
        public SubLObject $slot_list;
        public SubLObject $accessor_associations;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $structure_info_native() {
            this.$type_name = (SubLObject)CommonSymbols.NIL;
            this.$slot_list = (SubLObject)CommonSymbols.NIL;
            this.$accessor_associations = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$structure_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type_name;
        }
        
        public SubLObject getField3() {
            return this.$slot_list;
        }
        
        public SubLObject getField4() {
            return this.$accessor_associations;
        }
        
        public SubLObject getField5() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type_name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$slot_list = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$accessor_associations = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$structure_info_native.class, subl_extensions.$sym0$STRUCTURE_INFO, subl_extensions.$sym1$STRUCTURE_INFO_P, subl_extensions.$list2, subl_extensions.$list3, new String[] { "$type_name", "$slot_list", "$accessor_associations", "$plist" }, subl_extensions.$list4, subl_extensions.$list5, subl_extensions.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $structure_info_p$UnaryFunction extends UnaryFunction
    {
        public $structure_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRUCTURE-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return subl_extensions.structure_info_p(arg1);
        }
    }
}

/*

	Total time: 238 ms
	
*/