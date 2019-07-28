package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subl_extensions;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.subl_extensions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class subl_extensions extends SubLTranslatedFile {
    public static final SubLFile me = new subl_extensions();

    public static final String myName = "com.cyc.cycjava.cycl.subl_extensions";

    public static final String myFingerPrint = "8ecafa9f2443f789b25a2d3969ac2a92aa70987f28a10395b43fe63cfb17b3f1";

    // defconstant
    public static final SubLSymbol $dtp_structure_info$ = makeSymbol("*DTP-STRUCTURE-INFO*");

    // Internal Constants
    public static final SubLSymbol STRUCTURE_INFO = makeSymbol("STRUCTURE-INFO");

    public static final SubLSymbol STRUCTURE_INFO_P = makeSymbol("STRUCTURE-INFO-P");

    public static final SubLList $list2 = list(makeSymbol("TYPE-NAME"), makeSymbol("SLOT-LIST"), makeSymbol("ACCESSOR-ASSOCIATIONS"), makeSymbol("PLIST"));

    public static final SubLList $list3 = list(makeKeyword("TYPE-NAME"), makeKeyword("SLOT-LIST"), makeKeyword("ACCESSOR-ASSOCIATIONS"), makeKeyword("PLIST"));

    public static final SubLList $list4 = list(makeSymbol("STRUCTURE-INFO-TYPE-NAME"), makeSymbol("STRUCTURE-INFO-SLOT-LIST"), makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("STRUCTURE-INFO-PLIST"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME"), makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST"), makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("_CSETF-STRUCTURE-INFO-PLIST"));



    public static final SubLSymbol STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STRUCTURE-INFO-P"));

    private static final SubLSymbol STRUCTURE_INFO_TYPE_NAME = makeSymbol("STRUCTURE-INFO-TYPE-NAME");

    private static final SubLSymbol _CSETF_STRUCTURE_INFO_TYPE_NAME = makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME");

    private static final SubLSymbol STRUCTURE_INFO_SLOT_LIST = makeSymbol("STRUCTURE-INFO-SLOT-LIST");

    private static final SubLSymbol _CSETF_STRUCTURE_INFO_SLOT_LIST = makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST");

    private static final SubLSymbol STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS");

    private static final SubLSymbol _CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS = makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS");

    private static final SubLSymbol STRUCTURE_INFO_PLIST = makeSymbol("STRUCTURE-INFO-PLIST");

    private static final SubLSymbol _CSETF_STRUCTURE_INFO_PLIST = makeSymbol("_CSETF-STRUCTURE-INFO-PLIST");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_STRUCTURE_INFO = makeSymbol("MAKE-STRUCTURE-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD");

    private static final SubLString $str27$__Description_of__S_Structure_Ins = makeString("~%Description of ~S Structure Instance ~S:");

    private static final SubLList $list28 = cons(makeSymbol("SLOT-NAME"), makeSymbol("ACCESSORS-PAIR"));

    private static final SubLString $str29$_____S_____S = makeString("~%  ~S -> ~S");

    private static final SubLString $str30$__End_of_Description_ = makeString("~%End of Description.");

    private static final SubLString $str31$_STRUCTURE_INFO_FOR_ = makeString("*STRUCTURE-INFO-FOR-");

    private static final SubLString $str32$_DEFSTRUCT_ = makeString("-DEFSTRUCT*");

    private static final SubLString $str33$CREATE_NEW_ = makeString("CREATE-NEW-");

    private static final SubLString $str34$_HAS_SLOT_P = makeString("-HAS-SLOT-P");

    private static final SubLString $str35$SET_ = makeString("SET-");



    private static final SubLList $list37 = list(makeSymbol("STRUCT-OBJECT"), makeSymbol("NEW-VALUE"));



    private static final SubLList $list39 = list(makeSymbol("STRUCT-OBJECT"));

    private static final SubLList $list40 = list(makeSymbol("NEW-VALUE"));

    private static final SubLList $list41 = list(list(makeSymbol("RET"), makeSymbol("NEW-VALUE")));

    private static final SubLString $str42$DEFINE_STRUCTURE___S_is_not_a_val = makeString("DEFINE-STRUCTURE: ~S is not a valid structure type name.");



    private static final SubLString $str44$SYSTEM_PRIVATE_STRUCTURE_INFO = makeString("SYSTEM-PRIVATE-STRUCTURE-INFO");

    private static final SubLString $str45$_ = makeString("-");

    private static final SubLString $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO = makeString("-SYSTEM-PRIVATE-STRUCTURE-INFO");



    private static final SubLSymbol DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");

    private static final SubLSymbol CREATE_STRUCTURE_INFO = makeSymbol("CREATE-STRUCTURE-INFO");



    private static final SubLList $list51 = list(NIL);

    private static final SubLSymbol DEFSTRUCT = makeSymbol("DEFSTRUCT");

    private static final SubLSymbol SYSTEM_PRIVATE_STRUCTURE_INFO = makeSymbol("SYSTEM-PRIVATE-STRUCTURE-INFO");







    private static final SubLString $str57$MAKE_ = makeString("MAKE-");

    private static final SubLList $list58 = list(makeSymbol("NEW-INSTANCE"));

    public static final SubLList $list59 = list(list(makeSymbol("RET"), makeSymbol("NEW-INSTANCE")));

    public static final SubLList $list60 = list(makeSymbol("INSTANCE"), makeSymbol("SLOT-NAME"));









    private static final SubLList $list65 = list(makeSymbol("INSTANCE"));

    private static final SubLList $list66 = list(T, NIL);

    private static final SubLString $str67$GET_ = makeString("GET-");

    private static final SubLString $str68$_SLOT = makeString("-SLOT");

    private static final SubLList $list69 = list(makeSymbol("SLOT"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));











    private static final SubLString $str75$Structures_of_type__S_have_no__S_ = makeString("Structures of type ~S have no ~S slot.");

    private static final SubLList $list76 = list(makeSymbol("SLOT"));

    public static final SubLList $list77 = list(list(makeSymbol("RET"), makeSymbol("DEFAULT")));



    private static final SubLList $list79 = list(makeSymbol("CADR"), makeSymbol("ASSOCIATION"));

    public static final SubLList $list80 = list(makeSymbol("SLOT"), makeSymbol("NEW-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    private static final SubLList $list81 = list(makeSymbol("CDDR"), makeSymbol("ASSOCIATION"));

    private static final SubLString $str82$DESCRIBE_ = makeString("DESCRIBE-");

    private static final SubLList $list83 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")));

    private static final SubLSymbol DESCRIBE_STRUCTURE = makeSymbol("DESCRIBE-STRUCTURE");



    private static final SubLList $list86 = list(makeSymbol("HEAD"), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    public static SubLObject structure_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject structure_info_p(final SubLObject v_object) {
        return v_object.getClass() == subl_extensions.$structure_info_native.class ? T : NIL;
    }

    public static SubLObject structure_info_type_name(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject structure_info_slot_list(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject structure_info_accessor_associations(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject structure_info_plist(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_structure_info_type_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_structure_info_slot_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_structure_info_accessor_associations(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_structure_info_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "subl_extensions.structure_info_p(v_object) " + "CommonSymbols.NIL != subl_extensions.structure_info_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_structure_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new subl_extensions.$structure_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE_NAME)) {
                _csetf_structure_info_type_name(v_new, current_value);
            } else
                if (pcase_var.eql($SLOT_LIST)) {
                    _csetf_structure_info_slot_list(v_new, current_value);
                } else
                    if (pcase_var.eql($ACCESSOR_ASSOCIATIONS)) {
                        _csetf_structure_info_accessor_associations(v_new, current_value);
                    } else
                        if (pcase_var.eql($PLIST)) {
                            _csetf_structure_info_plist(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_structure_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STRUCTURE_INFO, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE_NAME, structure_info_type_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SLOT_LIST, structure_info_slot_list(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCESSOR_ASSOCIATIONS, structure_info_accessor_associations(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, structure_info_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_STRUCTURE_INFO, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_structure_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_structure_info(obj, visitor_fn);
    }

    public static SubLObject create_structure_info(final SubLObject type_name, final SubLObject slot_list, final SubLObject associations, final SubLObject plist) {
        final SubLObject structure_info_instance = make_structure_info(UNPROVIDED);
        _csetf_structure_info_type_name(structure_info_instance, type_name);
        _csetf_structure_info_slot_list(structure_info_instance, copy_list(slot_list));
        _csetf_structure_info_accessor_associations(structure_info_instance, copy_tree(associations));
        _csetf_structure_info_plist(structure_info_instance, plist);
        return structure_info_instance;
    }

    public static SubLObject describe_structure(final SubLObject stream, final SubLObject info, final SubLObject structure) {
        final SubLObject accessor_associations = structure_info_accessor_associations(info);
        format(stream, $str27$__Description_of__S_Structure_Ins, structure_info_type_name(info), structure);
        SubLObject cdolist_list_var = accessor_associations;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject slot_name = NIL;
            SubLObject accessors_pair = NIL;
            destructuring_bind_must_consp(current, datum, $list28);
            slot_name = current.first();
            current = accessors_pair = current.rest();
            format(stream, $str29$_____S_____S, slot_name, funcall(accessors_pair.first(), structure));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        format(stream, $str30$__End_of_Description_);
        return structure;
    }

    public static SubLObject subl_extensions_generate_var_name(final SubLObject type_name) {
        return intern(cconcatenate($str31$_STRUCTURE_INFO_FOR_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str32$_DEFSTRUCT_ }), UNPROVIDED);
    }

    public static SubLObject subl_extensions_generate_defstruct_constructor(final SubLObject type_name) {
        return intern(cconcatenate($str33$CREATE_NEW_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED);
    }

    public static SubLObject subl_extensions_generate_has_slot_predicate_name(final SubLObject type_name) {
        return intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str34$_HAS_SLOT_P), UNPROVIDED);
    }

    public static SubLObject subl_extensions_generate_accessor_associations(final SubLObject conc_name, final SubLObject slot_list) {
        SubLObject getter_alist = NIL;
        if (NIL == slot_list) {
            getter_alist = NIL;
        } else
            if (slot_list.isAtom()) {
                getter_alist = list(slot_list);
            } else
                if (NIL == slot_list.rest()) {
                    final SubLObject slot_name = slot_list.first();
                    getter_alist = list(listS(slot_name, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name)), UNPROVIDED), intern(cconcatenate($str35$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name) }), UNPROVIDED)));
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    final SubLObject slot_name2 = slot_list.first();
                    getter_alist = tail_cons = list(listS(slot_name2, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name2)), UNPROVIDED), intern(cconcatenate($str35$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name2) }), UNPROVIDED)));
                    SubLObject cdolist_list_var = slot_list.rest();
                    SubLObject slot_name3 = NIL;
                    slot_name3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = list(listS(slot_name3, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name3)), UNPROVIDED), intern(cconcatenate($str35$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name3) }), UNPROVIDED)));
                        rplacd(tail_cons, result);
                        tail_cons = result;
                        cdolist_list_var = cdolist_list_var.rest();
                        slot_name3 = cdolist_list_var.first();
                    } 
                }


        return getter_alist;
    }

    public static SubLObject subl_extensions_generate_setters(final SubLObject conc_name, final SubLObject slot_list) {
        SubLObject setters = NIL;
        SubLObject cdolist_list_var = slot_list;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            setters = cons(listS(DEFINE_PROTECTED, intern(cconcatenate($str35$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot) }), UNPROVIDED), $list37, listS(CSETF, bq_cons(intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot)), UNPROVIDED), $list39), $list40), $list41), setters);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        return nreverse(setters);
    }

    public static SubLObject expand_define_structure(final SubLObject head, final SubLObject v_slots) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type_name = (head.isCons()) ? head.first() : head;
        SubLObject slot_list = NIL;
        if (NIL == v_slots) {
            slot_list = NIL;
        } else
            if (v_slots.isAtom()) {
                slot_list = list(v_slots);
            } else
                if (NIL == v_slots.rest()) {
                    final SubLObject slot_decl = v_slots.first();
                    slot_list = list(slot_decl.isCons() ? slot_decl.first() : slot_decl);
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    final SubLObject slot_decl2 = v_slots.first();
                    slot_list = tail_cons = list(slot_decl2.isCons() ? slot_decl2.first() : slot_decl2);
                    SubLObject cdolist_list_var = v_slots.rest();
                    SubLObject slot_decl3 = NIL;
                    slot_decl3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = list(slot_decl3.isCons() ? slot_decl3.first() : slot_decl3);
                        rplacd(tail_cons, result);
                        tail_cons = result;
                        cdolist_list_var = cdolist_list_var.rest();
                        slot_decl3 = cdolist_list_var.first();
                    } 
                }


        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == type_name) || (!type_name.isSymbol()))) {
            Errors.error($str42$DEFINE_STRUCTURE___S_is_not_a_val, type_name);
        }
        final SubLObject var_name = subl_extensions_generate_var_name(type_name);
        final SubLObject has_slot_predicate_name = subl_extensions_generate_has_slot_predicate_name(type_name);
        SubLObject accessor_name = NIL;
        SubLObject accessor_associations = NIL;
        SubLObject conc_name = NIL;
        if (head.isCons()) {
            final SubLObject conc_name_association = assoc($CONC_NAME, head.rest(), UNPROVIDED, UNPROVIDED);
            if (NIL != conc_name_association) {
                conc_name = cadr(conc_name_association);
                accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), $str44$SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
                accessor_associations = subl_extensions_generate_accessor_associations(conc_name, slot_list);
            } else {
                conc_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str45$_), UNPROVIDED);
                accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
                accessor_associations = subl_extensions_generate_accessor_associations(intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str45$_), UNPROVIDED), slot_list);
            }
        } else {
            accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str46$_SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
            accessor_associations = subl_extensions_generate_accessor_associations(intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str45$_), UNPROVIDED), slot_list);
        }
        return listS(PROGN, list(DEFPARAMETER_PUBLIC, var_name, listS(CREATE_STRUCTURE_INFO, list(QUOTE, type_name), list(QUOTE, slot_list), list(QUOTE, accessor_associations), $list51)), listS(DEFSTRUCT, copy_tree(head), SYSTEM_PRIVATE_STRUCTURE_INFO, copy_tree(v_slots)), append(subl_extensions_generate_setters(conc_name, slot_list), list(list(DEFINE_PUBLIC, subl_extensions_generate_defstruct_constructor(type_name), NIL, listS(CLET, list(list(NEW_INSTANCE, list(intern(cconcatenate($str57$MAKE_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED)))), list(CSETF, bq_cons(accessor_name, $list58), var_name), $list59)), list(DEFINE_PUBLIC, has_slot_predicate_name, $list60, list(RET, listS(FIF, list(MEMBER, SLOT_NAME, list(STRUCTURE_INFO_SLOT_LIST, bq_cons(accessor_name, $list65))), $list66))), list(DEFINE_PUBLIC, intern(cconcatenate($str67$GET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str68$_SLOT }), UNPROVIDED), bq_cons(type_name, $list69), list(CLET, list(list(ASSOCIATION, list(ASSOC, SLOT, list(STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, list(accessor_name, type_name))))), listS(PUNLESS, ASSOCIATION, listS(WARN, $str75$Structures_of_type__S_have_no__S_, list(QUOTE, type_name), $list76), $list77), list(RET, list(FUNCALL, $list79, type_name)))), list(DEFINE_PUBLIC, intern(cconcatenate($str35$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str68$_SLOT }), UNPROVIDED), bq_cons(type_name, $list80), list(CLET, list(list(ASSOCIATION, list(ASSOC, SLOT, list(STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, list(accessor_name, type_name))))), listS(PUNLESS, ASSOCIATION, listS(WARN, $str75$Structures_of_type__S_have_no__S_, list(QUOTE, type_name), $list76), $list77), list(RET, listS(FUNCALL, $list81, type_name, $list40)))), list(DEFINE_PUBLIC, intern(cconcatenate($str82$DESCRIBE_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED), bq_cons(type_name, $list83), list(RET, list(DESCRIBE_STRUCTURE, STREAM, list(accessor_name, type_name), type_name))))));
    }

    public static SubLObject define_structure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject head = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        head = current.first();
        final SubLObject v_slots;
        current = v_slots = current.rest();
        return expand_define_structure(head, v_slots);
    }

    public static SubLObject declare_subl_extensions_file() {
        declareFunction(me, "structure_info_print_function_trampoline", "STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "structure_info_p", "STRUCTURE-INFO-P", 1, 0, false);
        new subl_extensions.$structure_info_p$UnaryFunction();
        declareFunction(me, "structure_info_type_name", "STRUCTURE-INFO-TYPE-NAME", 1, 0, false);
        declareFunction(me, "structure_info_slot_list", "STRUCTURE-INFO-SLOT-LIST", 1, 0, false);
        declareFunction(me, "structure_info_accessor_associations", "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 1, 0, false);
        declareFunction(me, "structure_info_plist", "STRUCTURE-INFO-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_structure_info_type_name", "_CSETF-STRUCTURE-INFO-TYPE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_structure_info_slot_list", "_CSETF-STRUCTURE-INFO-SLOT-LIST", 2, 0, false);
        declareFunction(me, "_csetf_structure_info_accessor_associations", "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        declareFunction(me, "_csetf_structure_info_plist", "_CSETF-STRUCTURE-INFO-PLIST", 2, 0, false);
        declareFunction(me, "make_structure_info", "MAKE-STRUCTURE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_structure_info", "VISIT-DEFSTRUCT-STRUCTURE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_structure_info_method", "VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "create_structure_info", "CREATE-STRUCTURE-INFO", 4, 0, false);
        declareFunction(me, "describe_structure", "DESCRIBE-STRUCTURE", 3, 0, false);
        declareFunction(me, "subl_extensions_generate_var_name", "SUBL-EXTENSIONS-GENERATE-VAR-NAME", 1, 0, false);
        declareFunction(me, "subl_extensions_generate_defstruct_constructor", "SUBL-EXTENSIONS-GENERATE-DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
        declareFunction(me, "subl_extensions_generate_has_slot_predicate_name", "SUBL-EXTENSIONS-GENERATE-HAS-SLOT-PREDICATE-NAME", 1, 0, false);
        declareFunction(me, "subl_extensions_generate_accessor_associations", "SUBL-EXTENSIONS-GENERATE-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        declareFunction(me, "subl_extensions_generate_setters", "SUBL-EXTENSIONS-GENERATE-SETTERS", 2, 0, false);
        declareFunction(me, "expand_define_structure", "EXPAND-DEFINE-STRUCTURE", 2, 0, false);
        declareMacro(me, "define_structure", "DEFINE-STRUCTURE");
        return NIL;
    }

    public static SubLObject init_subl_extensions_file() {
        defconstant("*DTP-STRUCTURE-INFO*", STRUCTURE_INFO);
        return NIL;
    }

    public static SubLObject setup_subl_extensions_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_structure_info$.getGlobalValue(), symbol_function(STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(STRUCTURE_INFO_TYPE_NAME, _CSETF_STRUCTURE_INFO_TYPE_NAME);
        def_csetf(STRUCTURE_INFO_SLOT_LIST, _CSETF_STRUCTURE_INFO_SLOT_LIST);
        def_csetf(STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, _CSETF_STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS);
        def_csetf(STRUCTURE_INFO_PLIST, _CSETF_STRUCTURE_INFO_PLIST);
        identity(STRUCTURE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_structure_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRUCTURE_INFO_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subl_extensions_file();
    }

    @Override
    public void initializeVariables() {
        init_subl_extensions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subl_extensions_file();
    }

    static {

























































































    }

    public static final class $structure_info_native extends SubLStructNative {
        public SubLObject $type_name;

        public SubLObject $slot_list;

        public SubLObject $accessor_associations;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        public $structure_info_native() {
            this.$type_name = Lisp.NIL;
            this.$slot_list = Lisp.NIL;
            this.$accessor_associations = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$slot_list;
        }

        @Override
        public SubLObject getField4() {
            return this.$accessor_associations;
        }

        @Override
        public SubLObject getField5() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$slot_list = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$accessor_associations = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative(subl_extensions.$structure_info_native.class, STRUCTURE_INFO, STRUCTURE_INFO_P, $list2, $list3, new String[]{ "$type_name", "$slot_list", "$accessor_associations", "$plist" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $structure_info_p$UnaryFunction extends UnaryFunction {
        public $structure_info_p$UnaryFunction() {
            super(extractFunctionNamed("STRUCTURE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return structure_info_p(arg1);
        }
    }
}

/**
 * Total time: 238 ms
 */
