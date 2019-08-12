/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subl_extensions extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $structure_info_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$type_name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$slot_list;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$accessor_associations;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$plist;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$type_name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$slot_list = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$accessor_associations = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.this.$plist = value;
        }

        public SubLObject $type_name = Lisp.NIL;

        public SubLObject $slot_list = Lisp.NIL;

        public SubLObject $accessor_associations = Lisp.NIL;

        public SubLObject $plist = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.class, STRUCTURE_INFO, STRUCTURE_INFO_P, $list_alt2, $list_alt3, new String[]{ "$type_name", "$slot_list", "$accessor_associations", "$plist" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new subl_extensions();

 public static final String myName = "com.cyc.cycjava.cycl.subl_extensions";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_structure_info$ = makeSymbol("*DTP-STRUCTURE-INFO*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol STRUCTURE_INFO = makeSymbol("STRUCTURE-INFO");

    private static final SubLSymbol STRUCTURE_INFO_P = makeSymbol("STRUCTURE-INFO-P");

    static private final SubLList $list2 = list(makeSymbol("TYPE-NAME"), makeSymbol("SLOT-LIST"), makeSymbol("ACCESSOR-ASSOCIATIONS"), makeSymbol("PLIST"));

    static private final SubLList $list3 = list(makeKeyword("TYPE-NAME"), makeKeyword("SLOT-LIST"), makeKeyword("ACCESSOR-ASSOCIATIONS"), makeKeyword("PLIST"));

    static private final SubLList $list4 = list(makeSymbol("STRUCTURE-INFO-TYPE-NAME"), makeSymbol("STRUCTURE-INFO-SLOT-LIST"), makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("STRUCTURE-INFO-PLIST"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME"), makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST"), makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("_CSETF-STRUCTURE-INFO-PLIST"));

    private static final SubLSymbol STRUCTURE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list41 = list(list(RET, makeSymbol("NEW-VALUE")));

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

    static private final SubLList $list59 = list(list(RET, makeSymbol("NEW-INSTANCE")));

    static private final SubLList $list60 = list(makeSymbol("INSTANCE"), makeSymbol("SLOT-NAME"));

    private static final SubLList $list65 = list(makeSymbol("INSTANCE"));

    private static final SubLList $list66 = list(T, NIL);

    private static final SubLString $str67$GET_ = makeString("GET-");

    private static final SubLString $str68$_SLOT = makeString("-SLOT");

    private static final SubLList $list69 = list(makeSymbol("SLOT"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    private static final SubLString $str75$Structures_of_type__S_have_no__S_ = makeString("Structures of type ~S have no ~S slot.");

    private static final SubLList $list76 = list(makeSymbol("SLOT"));

    static private final SubLList $list77 = list(list(RET, makeSymbol("DEFAULT")));

    private static final SubLList $list79 = list(makeSymbol("CADR"), makeSymbol("ASSOCIATION"));

    static private final SubLList $list80 = list(makeSymbol("SLOT"), makeSymbol("NEW-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    private static final SubLList $list81 = list(makeSymbol("CDDR"), makeSymbol("ASSOCIATION"));

    private static final SubLString $str82$DESCRIBE_ = makeString("DESCRIBE-");

    private static final SubLList $list83 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")));

    private static final SubLSymbol DESCRIBE_STRUCTURE = makeSymbol("DESCRIBE-STRUCTURE");

    private static final SubLList $list86 = list(makeSymbol("HEAD"), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    public static final SubLObject structure_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject structure_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject structure_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject structure_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.subl_extensions.$structure_info_native.class ? T : NIL;
    }

    public static final SubLObject structure_info_type_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject structure_info_type_name(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject structure_info_slot_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject structure_info_slot_list(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject structure_info_accessor_associations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject structure_info_accessor_associations(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject structure_info_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.getField5();
    }

    public static SubLObject structure_info_plist(final SubLObject v_object) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_structure_info_type_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_structure_info_type_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_structure_info_slot_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_structure_info_slot_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_structure_info_accessor_associations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_structure_info_accessor_associations(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_structure_info_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRUCTURE_INFO_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_structure_info_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != structure_info_p(v_object) : "! subl_extensions.structure_info_p(v_object) " + "subl_extensions.structure_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_structure_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.subl_extensions.$structure_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TYPE_NAME)) {
                        _csetf_structure_info_type_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SLOT_LIST)) {
                            _csetf_structure_info_slot_list(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ACCESSOR_ASSOCIATIONS)) {
                                _csetf_structure_info_accessor_associations(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PLIST)) {
                                    _csetf_structure_info_plist(v_new, current_value);
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

    public static SubLObject make_structure_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.subl_extensions.$structure_info_native();
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

    /**
     *
     *
     * @return STRUCTURE-INFO; an instance of STRUCTURE-INFO.
    Creates an instance of STRUCTURE-INFO, setting its type-name slot to type-name,
    slot-list slot to slot-list, accessor-associations slot to accessor-association,
    and plist slot to plist.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return STRUCTURE-INFO; an instance of STRUCTURE-INFO.\r\nCreates an instance of STRUCTURE-INFO, setting its type-name slot to type-name,\r\nslot-list slot to slot-list, accessor-associations slot to accessor-association,\r\nand plist slot to plist.\r\n@unknown sdevoy")
    public static final SubLObject create_structure_info_alt(SubLObject type_name, SubLObject slot_list, SubLObject associations, SubLObject plist) {
        {
            SubLObject structure_info_instance = make_structure_info(UNPROVIDED);
            _csetf_structure_info_type_name(structure_info_instance, type_name);
            _csetf_structure_info_slot_list(structure_info_instance, copy_list(slot_list));
            _csetf_structure_info_accessor_associations(structure_info_instance, copy_tree(associations));
            _csetf_structure_info_plist(structure_info_instance, plist);
            return structure_info_instance;
        }
    }

    /**
     *
     *
     * @return STRUCTURE-INFO; an instance of STRUCTURE-INFO.
    Creates an instance of STRUCTURE-INFO, setting its type-name slot to type-name,
    slot-list slot to slot-list, accessor-associations slot to accessor-association,
    and plist slot to plist.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return STRUCTURE-INFO; an instance of STRUCTURE-INFO.\r\nCreates an instance of STRUCTURE-INFO, setting its type-name slot to type-name,\r\nslot-list slot to slot-list, accessor-associations slot to accessor-association,\r\nand plist slot to plist.\r\n@unknown sdevoy")
    public static SubLObject create_structure_info(final SubLObject type_name, final SubLObject slot_list, final SubLObject associations, final SubLObject plist) {
        final SubLObject structure_info_instance = make_structure_info(UNPROVIDED);
        _csetf_structure_info_type_name(structure_info_instance, type_name);
        _csetf_structure_info_slot_list(structure_info_instance, copy_list(slot_list));
        _csetf_structure_info_accessor_associations(structure_info_instance, copy_tree(associations));
        _csetf_structure_info_plist(structure_info_instance, plist);
        return structure_info_instance;
    }

    /**
     *
     *
     * @return STRUCT; returns its third argument unchanged.
    This is a helper function.  For each structure defined
    by DEFINE-STRUCTURE, a description function is generated.
    The description function calls this function to describe
    its slot/value pairs.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return STRUCT; returns its third argument unchanged.\r\nThis is a helper function.  For each structure defined\r\nby DEFINE-STRUCTURE, a description function is generated.\r\nThe description function calls this function to describe\r\nits slot/value pairs.\r\n@unknown sdevoy")
    public static final SubLObject describe_structure_alt(SubLObject stream, SubLObject info, SubLObject structure) {
        {
            SubLObject accessor_associations = structure_info_accessor_associations(info);
            format(stream, $str_alt21$__Description_of__S_Structure_Ins, structure_info_type_name(info), structure);
            {
                SubLObject cdolist_list_var = accessor_associations;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject slot_name = NIL;
                        SubLObject accessors_pair = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        slot_name = current.first();
                        current = current.rest();
                        accessors_pair = current;
                        format(stream, $str_alt23$_____S_____S, slot_name, funcall(accessors_pair.first(), structure));
                    }
                }
            }
            format(stream, $str_alt24$__End_of_Description_);
        }
        return structure;
    }

    /**
     *
     *
     * @return STRUCT; returns its third argument unchanged.
    This is a helper function.  For each structure defined
    by DEFINE-STRUCTURE, a description function is generated.
    The description function calls this function to describe
    its slot/value pairs.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return STRUCT; returns its third argument unchanged.\r\nThis is a helper function.  For each structure defined\r\nby DEFINE-STRUCTURE, a description function is generated.\r\nThe description function calls this function to describe\r\nits slot/value pairs.\r\n@unknown sdevoy")
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

    /**
     *
     *
     * @return SYMBOL; generates name of variable used to point to structure info for type-name.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of variable used to point to structure info for type-name.\r\n@unknown sdevoy")
    public static final SubLObject subl_extensions_generate_var_name_alt(SubLObject type_name) {
        return intern(cconcatenate($str_alt25$_STRUCTURE_INFO_FOR_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str_alt26$_DEFSTRUCT_ }), UNPROVIDED);
    }

    /**
     *
     *
     * @return SYMBOL; generates name of variable used to point to structure info for type-name.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of variable used to point to structure info for type-name.\r\n@unknown sdevoy")
    public static SubLObject subl_extensions_generate_var_name(final SubLObject type_name) {
        return intern(cconcatenate($str31$_STRUCTURE_INFO_FOR_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str32$_DEFSTRUCT_ }), UNPROVIDED);
    }

    /**
     *
     *
     * @return SYMBOL; generates name of function to be used to construct instances of type-name.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of function to be used to construct instances of type-name.\r\n@unknown sdevoy")
    public static final SubLObject subl_extensions_generate_defstruct_constructor_alt(SubLObject type_name) {
        return intern(cconcatenate($str_alt27$CREATE_NEW_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED);
    }

    /**
     *
     *
     * @return SYMBOL; generates name of function to be used to construct instances of type-name.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of function to be used to construct instances of type-name.\r\n@unknown sdevoy")
    public static SubLObject subl_extensions_generate_defstruct_constructor(final SubLObject type_name) {
        return intern(cconcatenate($str33$CREATE_NEW_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED);
    }

    /**
     *
     *
     * @return SYMBOL; generates name of function to be used to test instances of type-name
    for the implementation of specified slots.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of function to be used to test instances of type-name\r\nfor the implementation of specified slots.\r\n@unknown sdevoy")
    public static final SubLObject subl_extensions_generate_has_slot_predicate_name_alt(SubLObject type_name) {
        return intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt28$_HAS_SLOT_P), UNPROVIDED);
    }

    /**
     *
     *
     * @return SYMBOL; generates name of function to be used to test instances of type-name
    for the implementation of specified slots.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return SYMBOL; generates name of function to be used to test instances of type-name\r\nfor the implementation of specified slots.\r\n@unknown sdevoy")
    public static SubLObject subl_extensions_generate_has_slot_predicate_name(final SubLObject type_name) {
        return intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str34$_HAS_SLOT_P), UNPROVIDED);
    }

    /**
     *
     *
     * @return ALIST; generates a list of associations.
    Each association in the list begins with the name of a slot of the structure
    type followed by a getter function and a setter function.  The actual format
    is (<slot name> <getter name> . <setter name).  Note, these are dotted lists.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return ALIST; generates a list of associations.\r\nEach association in the list begins with the name of a slot of the structure\r\ntype followed by a getter function and a setter function.  The actual format\r\nis (<slot name> <getter name> . <setter name).  Note, these are dotted lists.\r\n@unknown sdevoy")
    public static final SubLObject subl_extensions_generate_accessor_associations_alt(SubLObject conc_name, SubLObject slot_list) {
        {
            SubLObject getter_alist = NIL;
            SubLObject list_expression = slot_list;
            if (NIL == list_expression) {
                getter_alist = NIL;
            } else {
                if (list_expression.isAtom()) {
                    getter_alist = list(list_expression);
                } else {
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject slot_name = list_expression.first();
                            getter_alist = list(listS(slot_name, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name)), UNPROVIDED), intern(cconcatenate($str_alt29$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name) }), UNPROVIDED)));
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            {
                                SubLObject slot_name = list_expression.first();
                                getter_alist = list(listS(slot_name, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name)), UNPROVIDED), intern(cconcatenate($str_alt29$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name) }), UNPROVIDED)));
                                tail_cons = getter_alist;
                            }
                            {
                                SubLObject cdolist_list_var = list_expression.rest();
                                SubLObject slot_name = NIL;
                                for (slot_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_name = cdolist_list_var.first()) {
                                    result = list(listS(slot_name, intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name)), UNPROVIDED), intern(cconcatenate($str_alt29$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot_name) }), UNPROVIDED)));
                                    rplacd(tail_cons, result);
                                    tail_cons = result;
                                }
                            }
                        }
                    }
                }
            }
            return getter_alist;
        }
    }

    /**
     *
     *
     * @return ALIST; generates a list of associations.
    Each association in the list begins with the name of a slot of the structure
    type followed by a getter function and a setter function.  The actual format
    is (<slot name> <getter name> . <setter name).  Note, these are dotted lists.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return ALIST; generates a list of associations.\r\nEach association in the list begins with the name of a slot of the structure\r\ntype followed by a getter function and a setter function.  The actual format\r\nis (<slot name> <getter name> . <setter name).  Note, these are dotted lists.\r\n@unknown sdevoy")
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

    /**
     *
     *
     * @return LIST; generates a list of setter definitions.
    Given a conc-name and a list of slot names, generates function definitions
    for setters of those slots.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return LIST; generates a list of setter definitions.\r\nGiven a conc-name and a list of slot names, generates function definitions\r\nfor setters of those slots.\r\n@unknown sdevoy")
    public static final SubLObject subl_extensions_generate_setters_alt(SubLObject conc_name, SubLObject slot_list) {
        {
            SubLObject setters = NIL;
            SubLObject cdolist_list_var = slot_list;
            SubLObject slot = NIL;
            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                setters = cons(listS(DEFINE_PROTECTED, intern(cconcatenate($str_alt29$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot) }), UNPROVIDED), $list_alt31, listS(CSETF, bq_cons(intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), format_nil.format_nil_s_no_copy(slot)), UNPROVIDED), $list_alt33), $list_alt34), $list_alt35), setters);
            }
            return nreverse(setters);
        }
    }

    /**
     *
     *
     * @return LIST; generates a list of setter definitions.
    Given a conc-name and a list of slot names, generates function definitions
    for setters of those slots.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return LIST; generates a list of setter definitions.\r\nGiven a conc-name and a list of slot names, generates function definitions\r\nfor setters of those slots.\r\n@unknown sdevoy")
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

    /**
     *
     *
     * @return LIST; generates a progn whose body is composed of all forms
    needed to define the described structure type.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return LIST; generates a progn whose body is composed of all forms\r\nneeded to define the described structure type.\r\n@unknown sdevoy")
    public static final SubLObject expand_define_structure_alt(SubLObject head, SubLObject v_slots) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type_name = (head.isCons()) ? ((SubLObject) (head.first())) : head;
                SubLObject slot_list = NIL;
                SubLObject list_expression = v_slots;
                if (NIL == list_expression) {
                    slot_list = NIL;
                } else {
                    if (list_expression.isAtom()) {
                        slot_list = list(list_expression);
                    } else {
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject slot_decl = list_expression.first();
                                slot_list = list(slot_decl.isCons() ? ((SubLObject) (slot_decl.first())) : slot_decl);
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject slot_decl = list_expression.first();
                                    slot_list = list(slot_decl.isCons() ? ((SubLObject) (slot_decl.first())) : slot_decl);
                                    tail_cons = slot_list;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject slot_decl = NIL;
                                    for (slot_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_decl = cdolist_list_var.first()) {
                                        result = list(slot_decl.isCons() ? ((SubLObject) (slot_decl.first())) : slot_decl);
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != type_name) && type_name.isSymbol())) {
                        Errors.error($str_alt36$DEFINE_STRUCTURE___S_is_not_a_val, type_name);
                    }
                }
                {
                    SubLObject var_name = subl_extensions_generate_var_name(type_name);
                    SubLObject has_slot_predicate_name = subl_extensions_generate_has_slot_predicate_name(type_name);
                    SubLObject accessor_name = NIL;
                    SubLObject accessor_associations = NIL;
                    SubLObject conc_name = NIL;
                    if (head.isCons()) {
                        {
                            SubLObject conc_name_association = assoc($CONC_NAME, head.rest(), UNPROVIDED, UNPROVIDED);
                            if (NIL != conc_name_association) {
                                conc_name = cadr(conc_name_association);
                                accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(conc_name), $str_alt38$SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
                                accessor_associations = subl_extensions_generate_accessor_associations(conc_name, slot_list);
                            } else {
                                conc_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt39$_), UNPROVIDED);
                                accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt40$_SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
                                accessor_associations = subl_extensions_generate_accessor_associations(intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt39$_), UNPROVIDED), slot_list);
                            }
                        }
                    } else {
                        accessor_name = intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt40$_SYSTEM_PRIVATE_STRUCTURE_INFO), UNPROVIDED);
                        accessor_associations = subl_extensions_generate_accessor_associations(intern(cconcatenate(format_nil.format_nil_s_no_copy(type_name), $str_alt39$_), UNPROVIDED), slot_list);
                    }
                    return listS(PROGN, list(DEFPARAMETER_PUBLIC, var_name, listS(CREATE_STRUCTURE_INFO, list(QUOTE, type_name), list(QUOTE, slot_list), list(QUOTE, accessor_associations), $list_alt45)), listS(DEFSTRUCT, copy_tree(head), SYSTEM_PRIVATE_STRUCTURE_INFO, copy_tree(v_slots)), append(subl_extensions_generate_setters(conc_name, slot_list), list(list(DEFINE_PUBLIC, subl_extensions_generate_defstruct_constructor(type_name), NIL, listS(CLET, list(list(NEW_INSTANCE, list(intern(cconcatenate($str_alt51$MAKE_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED)))), list(CSETF, bq_cons(accessor_name, $list_alt52), var_name), $list_alt53)), list(DEFINE_PUBLIC, has_slot_predicate_name, $list_alt54, list(RET, listS(FIF, list(MEMBER, SLOT_NAME, list(STRUCTURE_INFO_SLOT_LIST, bq_cons(accessor_name, $list_alt59))), $list_alt60))), list(DEFINE_PUBLIC, intern(cconcatenate($str_alt61$GET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str_alt62$_SLOT }), UNPROVIDED), bq_cons(type_name, $list_alt63), list(CLET, list(list(ASSOCIATION, list(ASSOC, SLOT, list(STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, list(accessor_name, type_name))))), listS(PUNLESS, ASSOCIATION, listS(WARN, $str_alt69$Structures_of_type__S_have_no__S_, list(QUOTE, type_name), $list_alt70), $list_alt71), list(RET, list(FUNCALL, $list_alt73, type_name)))), list(DEFINE_PUBLIC, intern(cconcatenate($str_alt29$SET_, new SubLObject[]{ format_nil.format_nil_s_no_copy(type_name), $str_alt62$_SLOT }), UNPROVIDED), bq_cons(type_name, $list_alt74), list(CLET, list(list(ASSOCIATION, list(ASSOC, SLOT, list(STRUCTURE_INFO_ACCESSOR_ASSOCIATIONS, list(accessor_name, type_name))))), listS(PUNLESS, ASSOCIATION, listS(WARN, $str_alt69$Structures_of_type__S_have_no__S_, list(QUOTE, type_name), $list_alt70), $list_alt71), list(RET, listS(FUNCALL, $list_alt75, type_name, $list_alt34)))), list(DEFINE_PUBLIC, intern(cconcatenate($str_alt76$DESCRIBE_, format_nil.format_nil_s_no_copy(type_name)), UNPROVIDED), bq_cons(type_name, $list_alt77), list(RET, list(DESCRIBE_STRUCTURE, STREAM, list(accessor_name, type_name), type_name))))));
                }
            }
        }
    }

    /**
     *
     *
     * @return LIST; generates a progn whose body is composed of all forms
    needed to define the described structure type.
     * @unknown sdevoy
     */
    @LispMethod(comment = "@return LIST; generates a progn whose body is composed of all forms\r\nneeded to define the described structure type.\r\n@unknown sdevoy")
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

    /**
     * Same syntax as defstruct, except it adds additional functionality,
     * as described in the header of file subl-extensions.lisp.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Same syntax as defstruct, except it adds additional functionality,\r\nas described in the header of file subl-extensions.lisp.\r\n\r\n@unknown sdevoy\nSame syntax as defstruct, except it adds additional functionality,\nas described in the header of file subl-extensions.lisp.")
    public static final SubLObject define_structure_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject head = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            head = current.first();
            current = current.rest();
            {
                SubLObject v_slots = current;
                return expand_define_structure(head, v_slots);
            }
        }
    }

    /**
     * Same syntax as defstruct, except it adds additional functionality,
     * as described in the header of file subl-extensions.lisp.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Same syntax as defstruct, except it adds additional functionality,\r\nas described in the header of file subl-extensions.lisp.\r\n\r\n@unknown sdevoy\nSame syntax as defstruct, except it adds additional functionality,\nas described in the header of file subl-extensions.lisp.")
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
        declareFunction("structure_info_print_function_trampoline", "STRUCTURE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("structure_info_p", "STRUCTURE-INFO-P", 1, 0, false);
        new subl_extensions.$structure_info_p$UnaryFunction();
        declareFunction("structure_info_type_name", "STRUCTURE-INFO-TYPE-NAME", 1, 0, false);
        declareFunction("structure_info_slot_list", "STRUCTURE-INFO-SLOT-LIST", 1, 0, false);
        declareFunction("structure_info_accessor_associations", "STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 1, 0, false);
        declareFunction("structure_info_plist", "STRUCTURE-INFO-PLIST", 1, 0, false);
        declareFunction("_csetf_structure_info_type_name", "_CSETF-STRUCTURE-INFO-TYPE-NAME", 2, 0, false);
        declareFunction("_csetf_structure_info_slot_list", "_CSETF-STRUCTURE-INFO-SLOT-LIST", 2, 0, false);
        declareFunction("_csetf_structure_info_accessor_associations", "_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        declareFunction("_csetf_structure_info_plist", "_CSETF-STRUCTURE-INFO-PLIST", 2, 0, false);
        declareFunction("make_structure_info", "MAKE-STRUCTURE-INFO", 0, 1, false);
        declareFunction("visit_defstruct_structure_info", "VISIT-DEFSTRUCT-STRUCTURE-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_structure_info_method", "VISIT-DEFSTRUCT-OBJECT-STRUCTURE-INFO-METHOD", 2, 0, false);
        declareFunction("create_structure_info", "CREATE-STRUCTURE-INFO", 4, 0, false);
        declareFunction("describe_structure", "DESCRIBE-STRUCTURE", 3, 0, false);
        declareFunction("subl_extensions_generate_var_name", "SUBL-EXTENSIONS-GENERATE-VAR-NAME", 1, 0, false);
        declareFunction("subl_extensions_generate_defstruct_constructor", "SUBL-EXTENSIONS-GENERATE-DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
        declareFunction("subl_extensions_generate_has_slot_predicate_name", "SUBL-EXTENSIONS-GENERATE-HAS-SLOT-PREDICATE-NAME", 1, 0, false);
        declareFunction("subl_extensions_generate_accessor_associations", "SUBL-EXTENSIONS-GENERATE-ACCESSOR-ASSOCIATIONS", 2, 0, false);
        declareFunction("subl_extensions_generate_setters", "SUBL-EXTENSIONS-GENERATE-SETTERS", 2, 0, false);
        declareFunction("expand_define_structure", "EXPAND-DEFINE-STRUCTURE", 2, 0, false);
        declareMacro("define_structure", "DEFINE-STRUCTURE");
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("TYPE-NAME"), makeSymbol("SLOT-LIST"), makeSymbol("ACCESSOR-ASSOCIATIONS"), makeSymbol("PLIST"));

    static private final SubLList $list_alt3 = list(makeKeyword("TYPE-NAME"), makeKeyword("SLOT-LIST"), makeKeyword("ACCESSOR-ASSOCIATIONS"), makeKeyword("PLIST"));

    static private final SubLList $list_alt4 = list(makeSymbol("STRUCTURE-INFO-TYPE-NAME"), makeSymbol("STRUCTURE-INFO-SLOT-LIST"), makeSymbol("STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("STRUCTURE-INFO-PLIST"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-STRUCTURE-INFO-TYPE-NAME"), makeSymbol("_CSETF-STRUCTURE-INFO-SLOT-LIST"), makeSymbol("_CSETF-STRUCTURE-INFO-ACCESSOR-ASSOCIATIONS"), makeSymbol("_CSETF-STRUCTURE-INFO-PLIST"));

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

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void initializeVariables() {
        init_subl_extensions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subl_extensions_file();
    }

    static private final SubLString $str_alt21$__Description_of__S_Structure_Ins = makeString("~%Description of ~S Structure Instance ~S:");

    static {
    }

    static private final SubLList $list_alt22 = cons(makeSymbol("SLOT-NAME"), makeSymbol("ACCESSORS-PAIR"));

    static private final SubLString $str_alt23$_____S_____S = makeString("~%  ~S -> ~S");

    static private final SubLString $str_alt24$__End_of_Description_ = makeString("~%End of Description.");

    static private final SubLString $str_alt25$_STRUCTURE_INFO_FOR_ = makeString("*STRUCTURE-INFO-FOR-");

    static private final SubLString $str_alt26$_DEFSTRUCT_ = makeString("-DEFSTRUCT*");

    static private final SubLString $str_alt27$CREATE_NEW_ = makeString("CREATE-NEW-");

    static private final SubLString $str_alt28$_HAS_SLOT_P = makeString("-HAS-SLOT-P");

    static private final SubLString $str_alt29$SET_ = makeString("SET-");

    static private final SubLList $list_alt31 = list(makeSymbol("STRUCT-OBJECT"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt33 = list(makeSymbol("STRUCT-OBJECT"));

    static private final SubLList $list_alt34 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt35 = list(list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLString $str_alt36$DEFINE_STRUCTURE___S_is_not_a_val = makeString("DEFINE-STRUCTURE: ~S is not a valid structure type name.");

    static private final SubLString $str_alt38$SYSTEM_PRIVATE_STRUCTURE_INFO = makeString("SYSTEM-PRIVATE-STRUCTURE-INFO");

    static private final SubLString $str_alt39$_ = makeString("-");

    static private final SubLString $str_alt40$_SYSTEM_PRIVATE_STRUCTURE_INFO = makeString("-SYSTEM-PRIVATE-STRUCTURE-INFO");

    static private final SubLList $list_alt45 = list(NIL);

    static private final SubLString $str_alt51$MAKE_ = makeString("MAKE-");

    public static final class $structure_info_p$UnaryFunction extends UnaryFunction {
        public $structure_info_p$UnaryFunction() {
            super(extractFunctionNamed("STRUCTURE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return structure_info_p(arg1);
        }
    }

    static private final SubLList $list_alt52 = list(makeSymbol("NEW-INSTANCE"));

    static private final SubLList $list_alt53 = list(list(RET, makeSymbol("NEW-INSTANCE")));

    static private final SubLList $list_alt54 = list(makeSymbol("INSTANCE"), makeSymbol("SLOT-NAME"));

    static private final SubLList $list_alt59 = list(makeSymbol("INSTANCE"));

    static private final SubLList $list_alt60 = list(T, NIL);

    static private final SubLString $str_alt61$GET_ = makeString("GET-");

    static private final SubLString $str_alt62$_SLOT = makeString("-SLOT");

    static private final SubLList $list_alt63 = list(makeSymbol("SLOT"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    static private final SubLString $str_alt69$Structures_of_type__S_have_no__S_ = makeString("Structures of type ~S have no ~S slot.");

    static private final SubLList $list_alt70 = list(makeSymbol("SLOT"));

    static private final SubLList $list_alt71 = list(list(RET, makeSymbol("DEFAULT")));

    static private final SubLList $list_alt73 = list(makeSymbol("CADR"), makeSymbol("ASSOCIATION"));

    static private final SubLList $list_alt74 = list(makeSymbol("SLOT"), makeSymbol("NEW-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    static private final SubLList $list_alt75 = list(makeSymbol("CDDR"), makeSymbol("ASSOCIATION"));

    static private final SubLString $str_alt76$DESCRIBE_ = makeString("DESCRIBE-");

    static private final SubLList $list_alt77 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")));

    static private final SubLList $list_alt80 = list(makeSymbol("HEAD"), makeSymbol("&BODY"), makeSymbol("SLOTS"));
}

/**
 * Total time: 238 ms
 */
