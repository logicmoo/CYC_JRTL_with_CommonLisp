package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class object extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.object";
    public static final String myFingerPrint = "a3b3fcf8b6dfc431354b16fbca99d4f2cc6866a5846d5a03f2781e5d0c3185c8";
    private static final SubLSymbol $sym0$OBJECT;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$INSTANCE_NUMBER;
    private static final SubLInteger $int3$4096;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE;
    private static final SubLSymbol $sym8$NEW;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$INITIALIZE;
    private static final SubLSymbol $sym12$OBJECT_NEW_METHOD;
    private static final SubLSymbol $sym13$CLASS_OF;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$OBJECT_CLASS_OF_METHOD;
    private static final SubLSymbol $sym16$DESCRIBE_CLASS;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLString $str19$;
    private static final SubLString $str20$__;
    private static final SubLString $str21$___ADescription_of_class__S_;
    private static final SubLString $str22$___A_S_____S;
    private static final SubLSymbol $sym23$OBJECT_DESCRIBE_CLASS_METHOD;
    private static final SubLSymbol $sym24$PARENT_CLASS;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OBJECT_PARENT_CLASS_METHOD;
    private static final SubLSymbol $sym27$CHILD_CLASSES;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OBJECT_CHILD_CLASSES_METHOD;
    private static final SubLSymbol $sym30$IMPLEMENTS_METHOD_P;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD;
    private static final SubLSymbol $sym35$METHOD_LAMBDA_LIST;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD;
    private static final SubLSymbol $sym38$HAS_SLOT_P;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OBJECT_HAS_SLOT_P_METHOD;
    private static final SubLSymbol $sym42$ON_DESTROY_CLASS;
    private static final SubLSymbol $sym43$OBJECT_ON_DESTROY_CLASS_METHOD;
    private static final SubLSymbol $sym44$CFASL_INPUT;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$INTEGERP;
    private static final SubLSymbol $sym49$SYMBOLP;
    private static final SubLSymbol $sym50$INLINE_SET_SLOT;
    private static final SubLSymbol $sym51$QUOTE;
    private static final SubLSymbol $sym52$OBJECT_CFASL_INPUT_METHOD;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$OBJECT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym55$PRINT;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$OUTER_CATCH_FOR_OBJECT_METHOD;
    private static final SubLString $str59$___S__S_;
    private static final SubLString $str60$__Malformed_Instance_;
    private static final SubLSymbol $sym61$OBJECT_PRINT_METHOD;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OBJECT_EQUAL_METHOD;
    private static final SubLSymbol $sym65$ESSENTIALLY_EQUAL;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD;
    private static final SubLSymbol $sym69$CLONE;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$OBJECT_CLONE_METHOD;
    private static final SubLSymbol $sym72$DESCRIBE_INSTANCE;
    private static final SubLList $list73;
    private static final SubLString $str74$___ADescription_of_instance__S_;
    private static final SubLSymbol $sym75$OBJECT_DESCRIBE_INSTANCE_METHOD;
    private static final SubLSymbol $sym76$CFASL_OUTPUT;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$SLOT_NAME;
    private static final SubLSymbol $sym80$INLINE_GET_SLOT;
    private static final SubLSymbol $sym81$OBJECT_CFASL_OUTPUT_METHOD;
    private static final SubLSymbol $sym82$ADD_GET_SLOT_LISTENER;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLString $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t;
    private static final SubLString $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t;
    private static final SubLString $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m;
    private static final SubLSymbol $kw88$GET;
    private static final SubLSymbol $sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD;
    private static final SubLSymbol $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLString $str93$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str94$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str95$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD;
    private static final SubLSymbol $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLString $str100$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str101$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str102$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str103$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD;
    private static final SubLSymbol $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLString $str108$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str109$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str110$_ADD_GET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD;
    private static final SubLSymbol $sym112$ADD_SET_SLOT_LISTENER;
    private static final SubLList $list113;
    private static final SubLString $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t;
    private static final SubLString $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t;
    private static final SubLString $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m;
    private static final SubLSymbol $kw117$SET;
    private static final SubLSymbol $sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD;
    private static final SubLSymbol $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE;
    private static final SubLList $list120;
    private static final SubLString $str121$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str122$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str123$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD;
    private static final SubLSymbol $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE;
    private static final SubLList $list126;
    private static final SubLString $str127$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str128$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str129$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str130$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD;
    private static final SubLSymbol $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM;
    private static final SubLList $list133;
    private static final SubLString $str134$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str135$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLString $str136$_ADD_SET_SLOT_LISTENER_STIMULATED;
    private static final SubLSymbol $sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD;
    private static final SubLSymbol $sym138$REMOVE_ALL_GET_SLOT_LISTENERS;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLString $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB;
    private static final SubLString $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB;
    private static final SubLSymbol $sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD;
    private static final SubLSymbol $sym144$REMOVE_ALL_SET_SLOT_LISTENERS;
    private static final SubLList $list145;
    private static final SubLString $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB;
    private static final SubLString $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB;
    private static final SubLSymbol $sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD;
    private static final SubLSymbol $sym149$REMOVE_ALL_SLOT_LISTENERS;
    private static final SubLList $list150;
    private static final SubLString $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT;
    private static final SubLString $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT;
    private static final SubLSymbol $sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD;
    private static final SubLSymbol $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLString $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
    private static final SubLString $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
    private static final SubLString $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS;
    private static final SubLSymbol $sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD;
    private static final SubLSymbol $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER;
    private static final SubLList $list162;
    private static final SubLString $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
    private static final SubLString $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
    private static final SubLString $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST;
    private static final SubLSymbol $sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD;
    private static final SubLSymbol $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLString $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE;
    private static final SubLString $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE;
    private static final SubLSymbol $sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD;
    private static final SubLSymbol $sym173$ISOLATE;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$OUTER_CATCH_FOR_OBJECT_METHOD;
    private static final SubLSymbol $sym176$OBJECT_ISOLATE_METHOD;
    private static final SubLSymbol $sym177$PLISTIFY;
    private static final SubLList $list178;
    private static final SubLSymbol $kw179$TEST;
    private static final SubLSymbol $sym180$OBJECT_PLISTIFY_METHOD;
    private static final SubLSymbol $sym181$LISTIFY;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$OUTER_CATCH_FOR_OBJECT_METHOD;
    private static final SubLSymbol $sym184$OBJECT_LISTIFY_METHOD;
    private static final SubLSymbol $sym185$ASSIMILATE;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLList $list188;
    private static final SubLString $str189$_ASSIMILATE__S____S_is_not_a_vali;
    private static final SubLSymbol $sym190$OBJECT_ASSIMILATE_METHOD;
    private static final SubLString $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit;
    private static final SubLString $str192$CREATE_OBJECT_FROM_LIST___S_is_no;
    private static final SubLList $list193;
    private static final SubLString $str194$CREATE_OBJECT_FROM_LIST___S_does_;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLSymbol $kw197$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw198$NUMBER;
    private static final SubLSymbol $kw199$IDENTITY;
    private static final SubLString $str200$INSTANCE;
    private static final SubLString $str201$STREAM;
    private static final SubLSymbol $sym202$PROGN;
    private static final SubLSymbol $sym203$CHECK_TYPE;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$CLET;
    private static final SubLSymbol $sym206$PRINT_UNREADABLE_OBJECT;
    private static final SubLSymbol $sym207$PRINC;
    private static final SubLSymbol $sym208$CLASS_NAME;
    private static final SubLSymbol $sym209$INSTANCE_CLASS;
    private static final SubLSymbol $sym210$PWHEN;
    private static final SubLSymbol $sym211$FORMAT;
    private static final SubLString $str212$__A;
    private static final SubLSymbol $sym213$GET_OBJECT_INSTANCE_NUMBER;
    private static final SubLSymbol $sym214$WRITE_CHAR;
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject get_object_instance_number(final SubLObject v_object) {
        return classes.subloop_get_access_protected_instance_slot(v_object, (SubLObject)object.ZERO_INTEGER, (SubLObject)object.$sym2$INSTANCE_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject set_object_instance_number(final SubLObject v_object, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object, value, (SubLObject)object.ZERO_INTEGER, (SubLObject)object.$sym2$INSTANCE_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject get_object_isolated_p(final SubLObject v_object) {
        return classes.ldb_test((SubLObject)object.$int3$4096, subloop_structures.instance_boolean_slots(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject set_object_isolated_p(final SubLObject v_object, final SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(v_object, bytes.dpb((SubLObject)((object.NIL != value) ? object.ONE_INTEGER : object.ZERO_INTEGER), (SubLObject)object.$int3$4096, subloop_structures.instance_boolean_slots(v_object)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject get_object_instance_count(final SubLObject v_object) {
        final SubLObject v_class = (SubLObject)(v_object.isSymbol() ? classes.classes_retrieve_class(v_object) : ((object.NIL != subloop_structures.class_p(v_object)) ? v_object : ((object.NIL != subloop_structures.instance_p(v_object)) ? subloop_structures.instance_class(v_object) : object.NIL)));
        if (object.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)object.$sym4$INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)object.ZERO_INTEGER);
        }
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject set_object_instance_count(final SubLObject v_object, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_object.isSymbol() ? classes.classes_retrieve_class(v_object) : ((object.NIL != subloop_structures.class_p(v_object)) ? v_object : ((object.NIL != subloop_structures.instance_p(v_object)) ? subloop_structures.instance_class(v_object) : object.NIL)));
        if (object.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)object.$sym4$INSTANCE_COUNT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)object.ZERO_INTEGER, value);
        }
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject subloop_reserved_initialize_object_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym4$INSTANCE_COUNT, (SubLObject)object.ZERO_INTEGER);
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject subloop_reserved_initialize_object_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym6$ISOLATED_P, (SubLObject)object.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym2$INSTANCE_NUMBER, (SubLObject)object.NIL);
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 2363L)
    public static SubLObject object_p(final SubLObject v_object) {
        return classes.subloop_instanceof_class(v_object, (SubLObject)object.$sym0$OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 5741L)
    public static SubLObject object_new_method(final SubLObject self) {
        SubLObject instance_count = get_object_instance_count(self);
        if (object.NIL != instance_count) {
            instance_count = Numbers.add(instance_count, (SubLObject)object.ONE_INTEGER);
            set_object_instance_count(self, instance_count);
        }
        else {
            instance_count = (SubLObject)object.ZERO_INTEGER;
            set_object_instance_count(self, instance_count);
        }
        final SubLObject instance = instances.new_instance(self);
        methods.funcall_instance_method_with_0_args(instance, (SubLObject)object.$sym11$INITIALIZE);
        return instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 5986L)
    public static SubLObject object_class_of_method(final SubLObject self) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 6040L)
    public static SubLObject object_describe_class_method(final SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == object.UNPROVIDED) {
            stream = (SubLObject)object.T;
        }
        if (depth == object.UNPROVIDED) {
            depth = (SubLObject)object.ZERO_INTEGER;
        }
        final SubLObject all_class_slots = classes.classes_all_class_slots(self, (SubLObject)object.UNPROVIDED);
        final SubLObject tab = (SubLObject)(depth.isZero() ? object.$str19$ : Strings.make_string(Numbers.multiply(depth, (SubLObject)object.TWO_INTEGER), (SubLObject)object.UNPROVIDED));
        final SubLObject slot_tab = (SubLObject)(depth.isZero() ? object.$str20$__ : Strings.make_string(Numbers.add(Numbers.multiply(depth, (SubLObject)object.TWO_INTEGER), (SubLObject)object.TWO_INTEGER), (SubLObject)object.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)object.$str21$___ADescription_of_class__S_, tab, subloop_structures.class_name(self));
        SubLObject cdolist_list_var = all_class_slots;
        SubLObject class_slot = (SubLObject)object.NIL;
        class_slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)object.$str22$___A_S_____S, new SubLObject[] { slot_tab, class_slot, instances.get_slot(self, class_slot) });
            cdolist_list_var = cdolist_list_var.rest();
            class_slot = cdolist_list_var.first();
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 6519L)
    public static SubLObject object_parent_class_method(final SubLObject self) {
        final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(self);
        if (object.NIL != compiled_inheritance_path && object.NIL != compiled_inheritance_path.rest()) {
            return conses_high.cadr(compiled_inheritance_path);
        }
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 6781L)
    public static SubLObject object_child_classes_method(final SubLObject self) {
        final SubLObject subclass_names = subloop_structures.class_subclasses(self);
        if (object.NIL != subclass_names) {
            SubLObject subclasses = (SubLObject)object.NIL;
            SubLObject subclass = (SubLObject)object.NIL;
            SubLObject cdolist_list_var = subclass_names;
            SubLObject subclass_name = (SubLObject)object.NIL;
            subclass_name = cdolist_list_var.first();
            while (object.NIL != cdolist_list_var) {
                subclass = classes.classes_retrieve_class(subclass_name);
                if (object.NIL != subclass) {
                    subclasses = (SubLObject)ConsesLow.cons(subclass, subclasses);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subclass_name = cdolist_list_var.first();
            }
            return Sequences.nreverse(subclasses);
        }
        return (SubLObject)object.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 7156L)
    public static SubLObject object_implements_method_p_method(final SubLObject self, final SubLObject method_name) {
        final SubLObject my_class = (object.NIL != subloop_structures.class_p(self)) ? self : subloop_structures.instance_class(self);
        final SubLObject instance_method_access_list = subloop_structures.class_compiled_instance_method_access_alist(my_class);
        final SubLObject class_method_access_list = subloop_structures.class_compiled_class_method_access_alist(my_class);
        return (SubLObject)((object.NIL != methods.method_assoc(method_name, instance_method_access_list)) ? object.T : ((object.NIL != methods.method_assoc(method_name, class_method_access_list)) ? object.T : object.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 7632L)
    public static SubLObject object_method_lambda_list_method(final SubLObject self, final SubLObject method_name) {
        SubLObject method = methods.method_assoc(method_name, subloop_structures.class_compiled_instance_method_access_alist(self));
        if (object.NIL == method) {
            method = methods.method_assoc(method_name, subloop_structures.class_compiled_class_method_access_alist(self));
        }
        return subloop_structures.method_lambda_list(method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 7955L)
    public static SubLObject object_has_slot_p_method(final SubLObject self, final SubLObject slot_name) {
        SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(self));
        if (object.NIL == slot) {
            slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(self));
            if (object.NIL == slot) {
                slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(self));
                if (object.NIL == slot) {
                    slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(self));
                }
            }
        }
        return (SubLObject)((object.NIL != slot) ? object.T : object.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 8463L)
    public static SubLObject object_on_destroy_class_method(final SubLObject self) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 8533L)
    public static SubLObject object_cfasl_input_method(final SubLObject self, final SubLObject stream) {
        final SubLObject class_name = subloop_structures.class_name(self);
        final SubLObject instance = new_class_instance(self);
        final SubLObject number_of_slots = cfasl.cfasl_input(stream, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
        SubLObject slot_name = (SubLObject)object.NIL;
        SubLObject slot_value = (SubLObject)object.NIL;
        assert object.NIL != Types.integerp(number_of_slots) : number_of_slots;
        SubLObject i;
        for (i = (SubLObject)object.NIL, i = (SubLObject)object.ZERO_INTEGER; i.numL(number_of_slots); i = Numbers.add(i, (SubLObject)object.ONE_INTEGER)) {
            slot_name = cfasl.cfasl_input(stream, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
            slot_value = cfasl.cfasl_input(stream, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
            assert object.NIL != Types.symbolp(slot_name) : slot_name;
            Eval.eval((SubLObject)ConsesLow.list((SubLObject)object.$sym50$INLINE_SET_SLOT, (SubLObject)ConsesLow.list(slot_name, class_name), instance, (SubLObject)ConsesLow.list((SubLObject)object.$sym51$QUOTE, slot_value)));
        }
        return instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 9590L)
    public static SubLObject object_initialize_method(final SubLObject self) {
        final SubLObject instance_count = get_object_instance_count(self);
        SubLObject instance_number = get_object_instance_number(self);
        SubLObject isolated_p = get_object_isolated_p(self);
        isolated_p = (SubLObject)object.NIL;
        set_object_isolated_p(self, isolated_p);
        instance_number = instance_count;
        set_object_instance_number(self, instance_number);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 9728L)
    public static SubLObject object_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = (SubLObject)object.NIL;
        final SubLObject instance_number = get_object_instance_number(self);
        try {
            thread.throwStack.push(object.$sym58$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                if (object.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)object.$str59$___S__S_, subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number);
                }
                else {
                    PrintLow.format(stream, (SubLObject)object.$str60$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)object.$sym58$OUTER_CATCH_FOR_OBJECT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object.$sym58$OUTER_CATCH_FOR_OBJECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 9969L)
    public static SubLObject object_equal_method(final SubLObject self, final SubLObject v_object) {
        return Equality.eq(self, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 10041L)
    public static SubLObject object_essentially_equal_method(final SubLObject self, final SubLObject v_object, SubLObject ignore_slots) {
        if (ignore_slots == object.UNPROVIDED) {
            ignore_slots = (SubLObject)object.NIL;
        }
        final SubLObject v_class_$1;
        final SubLObject v_class = v_class_$1 = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$1);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$1);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$1);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$1);
        SubLObject slot_name = (SubLObject)object.NIL;
        SubLObject cdolist_list_var = compiled_class_slot_access_alist;
        SubLObject slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if (object.NIL == conses_high.member(slot_name, ignore_slots, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED) && !instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                    return (SubLObject)object.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if (object.NIL == conses_high.member(slot_name, ignore_slots, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED) && !instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                    return (SubLObject)object.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_instance_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if (object.NIL == conses_high.member(slot_name, ignore_slots, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED) && !instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                    return (SubLObject)object.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                if (object.NIL == conses_high.member(slot_name, ignore_slots, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED) && !instances.get_slot(self, slot_name).equal(instances.get_slot(v_object, slot_name))) {
                    return (SubLObject)object.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)object.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 11143L)
    public static SubLObject object_clone_method(final SubLObject self) {
        final SubLObject class_of_self = subloop_structures.instance_class(self);
        return methods.funcall_class_method_with_0_args(class_of_self, (SubLObject)object.$sym8$NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 11285L)
    public static SubLObject object_describe_instance_method(final SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == object.UNPROVIDED) {
            stream = (SubLObject)object.T;
        }
        if (depth == object.UNPROVIDED) {
            depth = (SubLObject)object.ZERO_INTEGER;
        }
        final SubLObject all_instance_slots = instances.instances_all_instance_slots(self);
        final SubLObject tab = (SubLObject)(depth.isZero() ? object.$str19$ : Strings.make_string(Numbers.multiply(depth, (SubLObject)object.TWO_INTEGER), (SubLObject)object.UNPROVIDED));
        final SubLObject slot_tab = (SubLObject)(depth.isZero() ? object.$str20$__ : Strings.make_string(Numbers.add(Numbers.multiply(depth, (SubLObject)object.TWO_INTEGER), (SubLObject)object.TWO_INTEGER), (SubLObject)object.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)object.$str74$___ADescription_of_instance__S_, tab, self);
        methods.funcall_instance_method_with_2_args(self, (SubLObject)object.$sym16$DESCRIBE_CLASS, stream, number_utilities.f_1X(depth));
        SubLObject cdolist_list_var = all_instance_slots;
        SubLObject instance_slot = (SubLObject)object.NIL;
        instance_slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)object.$str22$___A_S_____S, new SubLObject[] { slot_tab, instance_slot, instances.get_slot(self, instance_slot) });
            cdolist_list_var = cdolist_list_var.rest();
            instance_slot = cdolist_list_var.first();
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 11849L)
    public static SubLObject object_cfasl_output_method(final SubLObject self, final SubLObject stream) {
        final SubLObject v_class = subloop_structures.instance_class(self);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        cfasl.cfasl_output(class_name, stream);
        final SubLObject v_class_$2 = v_class;
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$2);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$2);
        SubLObject instance_slots = ConsesLow.append(compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist);
        instance_slots = Sequences.delete((SubLObject)object.$sym2$INSTANCE_NUMBER, instance_slots, Symbols.symbol_function((SubLObject)object.EQ), (SubLObject)object.$sym79$SLOT_NAME, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
        final SubLObject number_of_slots = Sequences.length(instance_slots);
        cfasl.cfasl_output(number_of_slots, stream);
        SubLObject slot_name = (SubLObject)object.NIL;
        SubLObject cdolist_list_var = instance_slots;
        SubLObject slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            cfasl.cfasl_output(slot_name, stream);
            cfasl.cfasl_output(Eval.eval((SubLObject)ConsesLow.list((SubLObject)object.$sym80$INLINE_GET_SLOT, (SubLObject)ConsesLow.list(slot_name, class_name), self)), stream);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 12855L)
    public static SubLObject object_add_get_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str85$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str86$_ADD_GET_SLOT_LISTENER_OBJECT___t, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str87$_ADD_GET_SLOT_LISTENER_OBJECT___m, my_method);
        }
        slot_listeners.add_generic_slot_listener(target_instance, target_slot, (SubLObject)object.$kw88$GET, my_method, self);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 13412L)
    public static SubLObject object_add_get_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str93$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str94$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str95$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, (SubLObject)object.$kw88$GET, my_method, self, trigger_value);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 14083L)
    public static SubLObject object_add_get_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str100$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str101$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str102$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!trigger_value_lower_bound.isNumber() || !trigger_value_upper_bound.isNumber()) && (!trigger_value_lower_bound.isString() || !trigger_value_upper_bound.isString()) && (!trigger_value_lower_bound.isChar() || !trigger_value_upper_bound.isChar())) {
            Errors.error((SubLObject)object.$str103$_ADD_GET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, (SubLObject)object.$kw88$GET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 15335L)
    public static SubLObject object_add_get_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str108$_ADD_GET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str109$_ADD_GET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str110$_ADD_GET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, (SubLObject)object.$kw88$GET, my_method, self, trigger_enumeration);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 16013L)
    public static SubLObject object_add_set_slot_listener_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str114$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str115$_ADD_SET_SLOT_LISTENER_OBJECT___t, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str116$_ADD_SET_SLOT_LISTENER_OBJECT___m, my_method);
        }
        slot_listeners.add_generic_slot_listener(target_instance, target_slot, (SubLObject)object.$kw117$SET, my_method, self);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 16549L)
    public static SubLObject object_add_set_slot_listener_stimulated_by_value_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str121$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str122$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str123$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_value(target_instance, target_slot, (SubLObject)object.$kw117$SET, my_method, self, trigger_value);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 17220L)
    public static SubLObject object_add_set_slot_listener_stimulated_by_range_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_value_lower_bound, final SubLObject trigger_value_upper_bound) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str127$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str128$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str129$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!trigger_value_lower_bound.isNumber() || !trigger_value_upper_bound.isNumber()) && (!trigger_value_lower_bound.isString() || !trigger_value_upper_bound.isString()) && (!trigger_value_lower_bound.isChar() || !trigger_value_upper_bound.isChar())) {
            Errors.error((SubLObject)object.$str130$_ADD_SET_SLOT_LISTENER_STIMULATED, trigger_value_lower_bound, trigger_value_upper_bound);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_range(target_instance, target_slot, (SubLObject)object.$kw117$SET, my_method, self, trigger_value_lower_bound, trigger_value_upper_bound);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 18472L)
    public static SubLObject object_add_set_slot_listener_stimulated_by_enum_method(final SubLObject self, final SubLObject target_instance, final SubLObject target_slot, final SubLObject my_method, final SubLObject trigger_enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str134$_ADD_SET_SLOT_LISTENER_STIMULATED, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str135$_ADD_SET_SLOT_LISTENER_STIMULATED, target_slot);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !my_method.isSymbol()) {
            Errors.error((SubLObject)object.$str136$_ADD_SET_SLOT_LISTENER_STIMULATED, my_method);
        }
        slot_listeners.add_generic_slot_listener_stimulated_by_enum(target_instance, target_slot, (SubLObject)object.$kw117$SET, my_method, self, trigger_enumeration);
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 19150L)
    public static SubLObject object_remove_all_get_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == object.UNPROVIDED) {
            target_slot = (SubLObject)object.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_get_slot_listeners(target_instance, self, target_slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 19604L)
    public static SubLObject object_remove_all_set_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == object.UNPROVIDED) {
            target_slot = (SubLObject)object.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_set_slot_listeners(target_instance, self, target_slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 20058L)
    public static SubLObject object_remove_all_slot_listeners_method(final SubLObject self, final SubLObject target_instance, SubLObject target_slot) {
        if (target_slot == object.UNPROVIDED) {
            target_slot = (SubLObject)object.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(target_instance)) {
            Errors.error((SubLObject)object.$str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_slot.isSymbol()) {
            Errors.error((SubLObject)object.$str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT, target_slot);
        }
        return slot_listeners.slot_listeners_remove_all_slot_listeners(target_instance, self, target_slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 20496L)
    public static SubLObject object_add_class_wide_before_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.class_p(v_class) && object.NIL == subloop_structures.instance_p(v_class)) {
            Errors.error((SubLObject)object.$str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, v_class);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (object.NIL == target_method || !target_method.isSymbol())) {
            Errors.error((SubLObject)object.$str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, target_method);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (object.NIL == my_method || !my_method.isSymbol())) {
            Errors.error((SubLObject)object.$str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS, my_method);
        }
        if (object.NIL != subloop_structures.class_p(v_class)) {
            method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
        }
        else if (object.NIL != subloop_structures.instance_p(v_class)) {
            method_listeners.method_listeners_add_before_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
        }
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 21351L)
    public static SubLObject object_add_class_wide_after_method_listener_method(final SubLObject self, final SubLObject v_class, final SubLObject target_method, final SubLObject my_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.class_p(v_class) && object.NIL == subloop_structures.instance_p(v_class)) {
            Errors.error((SubLObject)object.$str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, v_class);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (object.NIL == target_method || !target_method.isSymbol())) {
            Errors.error((SubLObject)object.$str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, target_method);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (object.NIL == my_method || !my_method.isSymbol())) {
            Errors.error((SubLObject)object.$str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST, my_method);
        }
        if (object.NIL != subloop_structures.class_p(v_class)) {
            method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(v_class), target_method, my_method, self);
        }
        else if (object.NIL != subloop_structures.instance_p(v_class)) {
            method_listeners.method_listeners_add_after_listener(subloop_structures.class_name(subloop_structures.instance_class(v_class)), target_method, my_method, self);
        }
        return my_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 22208L)
    public static SubLObject object_remove_all_class_wide_method_listeners_method(final SubLObject self, final SubLObject monitored_instance, SubLObject target_method) {
        if (target_method == object.UNPROVIDED) {
            target_method = (SubLObject)object.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.instance_p(monitored_instance) && object.NIL == subloop_structures.class_p(monitored_instance)) {
            Errors.error((SubLObject)object.$str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE, monitored_instance);
        }
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !target_method.isSymbol()) {
            Errors.error((SubLObject)object.$str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE, target_method);
        }
        return method_listeners.method_listeners_remove_all_method_listeners(monitored_instance, self, target_method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 22754L)
    public static SubLObject object_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = (SubLObject)object.NIL;
        SubLObject isolated_p = get_object_isolated_p(self);
        try {
            thread.throwStack.push(object.$sym175$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                isolated_p = (SubLObject)object.T;
                slot_listeners.slot_listeners_remove_all_slot_listeners(self, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
                method_listeners.method_listeners_remove_all_method_listeners(self, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)object.$sym175$OUTER_CATCH_FOR_OBJECT_METHOD, (SubLObject)object.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_isolated_p(self, isolated_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object.$sym175$OUTER_CATCH_FOR_OBJECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 23304L)
    public static SubLObject object_plistify_method(final SubLObject self) {
        SubLObject listed_slots = (SubLObject)object.NIL;
        final SubLObject keyword_package = Symbols.symbol_package((SubLObject)object.$kw179$TEST);
        final SubLObject v_class_$3;
        final SubLObject v_class = v_class_$3 = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$3);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$3);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$3);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$3);
        SubLObject slot_name = (SubLObject)object.NIL;
        SubLObject cdolist_list_var = compiled_class_slot_access_alist;
        SubLObject slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = (SubLObject)ConsesLow.cons(Packages.intern(Symbols.symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = (SubLObject)ConsesLow.cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = (SubLObject)ConsesLow.cons(Packages.intern(Symbols.symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = (SubLObject)ConsesLow.cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_instance_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = (SubLObject)ConsesLow.cons(Packages.intern(Symbols.symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = (SubLObject)ConsesLow.cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)object.NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = (SubLObject)object.NIL;
        slot = cdolist_list_var.first();
        while (object.NIL != cdolist_list_var) {
            if (object.NIL != slots.slot_essential(slot)) {
                slot_name = slots.slot_name(slot);
                listed_slots = (SubLObject)ConsesLow.cons(Packages.intern(Symbols.symbol_name(slot_name), keyword_package), listed_slots);
                listed_slots = (SubLObject)ConsesLow.cons(instances.get_slot(self, slot_name), listed_slots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return Sequences.nreverse(listed_slots);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 24436L)
    public static SubLObject object_listify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_method = (SubLObject)object.NIL;
        final SubLObject instance_number = get_object_instance_number(self);
        try {
            thread.throwStack.push(object.$sym183$OUTER_CATCH_FOR_OBJECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)object.$sym183$OUTER_CATCH_FOR_OBJECT_METHOD, (SubLObject)ConsesLow.listS(subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number, methods.funcall_instance_method_with_0_args(self, (SubLObject)object.$sym177$PLISTIFY)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object.$sym183$OUTER_CATCH_FOR_OBJECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 24609L)
    public static SubLObject object_assimilate_method(final SubLObject self, final SubLObject plistified_content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !plistified_content.isList()) {
            Errors.error((SubLObject)object.$str189$_ASSIMILATE__S____S_is_not_a_vali, self);
        }
        SubLObject slot = (SubLObject)object.NIL;
        SubLObject slot_name = (SubLObject)object.NIL;
        final SubLObject v_class = subloop_structures.instance_class(self);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = (SubLObject)object.NIL, remainder = plistified_content; object.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            slot = slots.slot_assoc_by_name(Symbols.symbol_name(key), compiled_class_slot_access_alist);
            if (object.NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(self, slot_name, value);
            }
        }
        for (remainder = (SubLObject)object.NIL, remainder = plistified_content; object.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            slot = slots.slot_assoc_by_name(Symbols.symbol_name(key), compiled_instance_slot_access_alist);
            if (object.NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(self, slot_name, value);
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 25324L)
    public static SubLObject describe_instance(final SubLObject instance) {
        if (object.NIL != subloop_structures.instance_p(instance)) {
            methods.funcall_instance_method_with_0_args(instance, (SubLObject)object.$sym72$DESCRIBE_INSTANCE);
        }
        return instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 25477L)
    public static SubLObject new_object_instance(final SubLObject class_or_class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_or_class_name.isSymbol() ? classes.classes_retrieve_class(class_or_class_name) : class_or_class_name;
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)object.$str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
        }
        final SubLObject new_instance = object_new_method(class_or_class_name);
        return new_instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 25951L)
    public static SubLObject new_class_instance(final SubLObject class_or_class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = class_or_class_name.isSymbol() ? classes.classes_retrieve_class(class_or_class_name) : class_or_class_name;
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)object.$str191$NEW_SUBLOOPS_INSTANCE___S_is_neit, class_or_class_name);
        }
        final SubLObject new_instance = object_new_method(class_or_class_name);
        return new_instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 26374L)
    public static SubLObject create_object_from_list(final SubLObject listified_instance, SubLObject allocate_new_instance_number) {
        if (allocate_new_instance_number == object.UNPROVIDED) {
            allocate_new_instance_number = (SubLObject)object.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!listified_instance.isCons() || !listified_instance.first().isSymbol() || !listified_instance.rest().isCons() || !conses_high.cadr(listified_instance).isInteger() || !conses_high.cddr(listified_instance).isList())) {
            Errors.error((SubLObject)object.$str192$CREATE_OBJECT_FROM_LIST___S_is_no, listified_instance);
        }
        SubLObject class_name = (SubLObject)object.NIL;
        SubLObject instance_number = (SubLObject)object.NIL;
        SubLObject slot_plist = (SubLObject)object.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(listified_instance, listified_instance, (SubLObject)object.$list193);
        class_name = listified_instance.first();
        SubLObject current = listified_instance.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, listified_instance, (SubLObject)object.$list193);
        instance_number = current.first();
        current = (slot_plist = current.rest());
        final SubLObject v_object = instances.new_instance(class_name);
        SubLObject slot = (SubLObject)object.NIL;
        SubLObject slot_name = (SubLObject)object.NIL;
        if (object.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && object.NIL == v_object) {
            Errors.error((SubLObject)object.$str194$CREATE_OBJECT_FROM_LIST___S_does_, class_name);
        }
        if (object.NIL != allocate_new_instance_number) {
            SubLObject current_instance_count = get_object_instance_count(v_object);
            if (object.NIL == current_instance_count) {
                current_instance_count = (SubLObject)object.ZERO_INTEGER;
            }
            else {
                current_instance_count = Numbers.add(current_instance_count, (SubLObject)object.ONE_INTEGER);
            }
            set_object_instance_count(v_object, current_instance_count);
            methods.funcall_instance_method_with_0_args(v_object, (SubLObject)object.$sym11$INITIALIZE);
        }
        else {
            methods.funcall_instance_method_with_0_args(v_object, (SubLObject)object.$sym11$INITIALIZE);
            set_object_instance_number(v_object, instance_number);
        }
        final SubLObject v_class = subloop_structures.instance_class(v_object);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = (SubLObject)object.NIL, remainder = slot_plist; object.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            slot = slots.slot_assoc_by_name(Symbols.symbol_name(key), compiled_class_slot_access_alist);
            if (object.NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(v_object, slot_name, value);
            }
        }
        for (remainder = (SubLObject)object.NIL, remainder = slot_plist; object.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            slot = slots.slot_assoc_by_name(Symbols.symbol_name(key), compiled_instance_slot_access_alist);
            if (object.NIL != slot) {
                slot_name = slots.slot_name(slot);
                instances.set_slot(v_object, slot_name, value);
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object.lisp", position = 28026L)
    public static SubLObject print_class_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object.$list195);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = (SubLObject)object.NIL;
        SubLObject stream = (SubLObject)object.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object.$list195);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object.$list195);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)object.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)object.NIL;
        SubLObject current_$4 = (SubLObject)object.NIL;
        while (object.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)object.$list195);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)object.$list195);
            if (object.NIL == conses_high.member(current_$4, (SubLObject)object.$list196, (SubLObject)object.UNPROVIDED, (SubLObject)object.UNPROVIDED)) {
                bad = (SubLObject)object.T;
            }
            if (current_$4 == object.$kw197$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (object.NIL != bad && object.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)object.$list195);
        }
        final SubLObject number_tail = cdestructuring_bind.property_list_member((SubLObject)object.$kw198$NUMBER, current);
        final SubLObject number = (SubLObject)((object.NIL != number_tail) ? conses_high.cadr(number_tail) : object.NIL);
        final SubLObject identity_tail = cdestructuring_bind.property_list_member((SubLObject)object.$kw199$IDENTITY, current);
        final SubLObject identity = (SubLObject)((object.NIL != identity_tail) ? conses_high.cadr(identity_tail) : object.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject instance_var = Symbols.make_symbol((SubLObject)object.$str200$INSTANCE);
        final SubLObject stream_var = Symbols.make_symbol((SubLObject)object.$str201$STREAM);
        return (SubLObject)ConsesLow.list((SubLObject)object.$sym202$PROGN, (SubLObject)ConsesLow.listS((SubLObject)object.$sym203$CHECK_TYPE, instance, (SubLObject)object.$list204), (SubLObject)ConsesLow.list((SubLObject)object.$sym205$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(instance_var, instance), (SubLObject)ConsesLow.list(stream_var, stream)), (SubLObject)ConsesLow.listS((SubLObject)object.$sym206$PRINT_UNREADABLE_OBJECT, (SubLObject)ConsesLow.list(instance_var, stream_var, (SubLObject)object.$kw199$IDENTITY, identity), (SubLObject)ConsesLow.list((SubLObject)object.$sym207$PRINC, (SubLObject)ConsesLow.list((SubLObject)object.$sym208$CLASS_NAME, (SubLObject)ConsesLow.list((SubLObject)object.$sym209$INSTANCE_CLASS, instance_var)), stream_var), (SubLObject)ConsesLow.list((SubLObject)object.$sym210$PWHEN, number, (SubLObject)ConsesLow.list((SubLObject)object.$sym211$FORMAT, stream_var, (SubLObject)object.$str212$__A, (SubLObject)ConsesLow.list((SubLObject)object.$sym213$GET_OBJECT_INSTANCE_NUMBER, instance_var))), (SubLObject)((object.NIL != body) ? ConsesLow.list((SubLObject)object.$sym214$WRITE_CHAR, (SubLObject)Characters.CHAR_space, stream_var) : object.NIL), ConsesLow.append(body, (SubLObject)object.NIL))));
    }
    
    public static SubLObject declare_object_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "get_object_instance_number", "GET-OBJECT-INSTANCE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "set_object_instance_number", "SET-OBJECT-INSTANCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "get_object_isolated_p", "GET-OBJECT-ISOLATED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "set_object_isolated_p", "SET-OBJECT-ISOLATED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "get_object_instance_count", "GET-OBJECT-INSTANCE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "set_object_instance_count", "SET-OBJECT-INSTANCE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "subloop_reserved_initialize_object_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "subloop_reserved_initialize_object_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_p", "OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_new_method", "OBJECT-NEW-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_class_of_method", "OBJECT-CLASS-OF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_describe_class_method", "OBJECT-DESCRIBE-CLASS-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_parent_class_method", "OBJECT-PARENT-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_child_classes_method", "OBJECT-CHILD-CLASSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_implements_method_p_method", "OBJECT-IMPLEMENTS-METHOD-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_method_lambda_list_method", "OBJECT-METHOD-LAMBDA-LIST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_has_slot_p_method", "OBJECT-HAS-SLOT-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_on_destroy_class_method", "OBJECT-ON-DESTROY-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_cfasl_input_method", "OBJECT-CFASL-INPUT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_initialize_method", "OBJECT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_print_method", "OBJECT-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_equal_method", "OBJECT-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_essentially_equal_method", "OBJECT-ESSENTIALLY-EQUAL-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_clone_method", "OBJECT-CLONE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_describe_instance_method", "OBJECT-DESCRIBE-INSTANCE-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_cfasl_output_method", "OBJECT-CFASL-OUTPUT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_get_slot_listener_method", "OBJECT-ADD-GET-SLOT-LISTENER-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_get_slot_listener_stimulated_by_value_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_get_slot_listener_stimulated_by_range_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_get_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_set_slot_listener_method", "OBJECT-ADD-SET-SLOT-LISTENER-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_set_slot_listener_stimulated_by_value_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_set_slot_listener_stimulated_by_range_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_set_slot_listener_stimulated_by_enum_method", "OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_remove_all_get_slot_listeners_method", "OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_remove_all_set_slot_listeners_method", "OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_remove_all_slot_listeners_method", "OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_class_wide_before_method_listener_method", "OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_add_class_wide_after_method_listener_method", "OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_remove_all_class_wide_method_listeners_method", "OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_isolate_method", "OBJECT-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_plistify_method", "OBJECT-PLISTIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_listify_method", "OBJECT-LISTIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "object_assimilate_method", "OBJECT-ASSIMILATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "describe_instance", "DESCRIBE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "new_object_instance", "NEW-OBJECT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "new_class_instance", "NEW-CLASS-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object", "create_object_from_list", "CREATE-OBJECT-FROM-LIST", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.object", "print_class_instance", "PRINT-CLASS-INSTANCE");
        return (SubLObject)object.NIL;
    }
    
    public static SubLObject init_object_file() {
        return (SubLObject)object.NIL;
    }
    
    public static SubLObject setup_object_file() {
        classes.subloop_new_class((SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list1);
        classes.class_set_implements_slot_listeners((SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE);
        subloop_reserved_initialize_object_class((SubLObject)object.$sym0$OBJECT);
        methods.methods_incorporate_class_method((SubLObject)object.$sym8$NEW, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list9, (SubLObject)object.NIL, (SubLObject)object.$list10);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym8$NEW, (SubLObject)object.$sym12$OBJECT_NEW_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym13$CLASS_OF, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list14);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym13$CLASS_OF, (SubLObject)object.$sym15$OBJECT_CLASS_OF_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym16$DESCRIBE_CLASS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list17, (SubLObject)object.$list18);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym16$DESCRIBE_CLASS, (SubLObject)object.$sym23$OBJECT_DESCRIBE_CLASS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym24$PARENT_CLASS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list25);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym24$PARENT_CLASS, (SubLObject)object.$sym26$OBJECT_PARENT_CLASS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym27$CHILD_CLASSES, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list28);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym27$CHILD_CLASSES, (SubLObject)object.$sym29$OBJECT_CHILD_CLASSES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym30$IMPLEMENTS_METHOD_P, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.$list32, (SubLObject)object.$list33);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym30$IMPLEMENTS_METHOD_P, (SubLObject)object.$sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym35$METHOD_LAMBDA_LIST, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.$list32, (SubLObject)object.$list36);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym35$METHOD_LAMBDA_LIST, (SubLObject)object.$sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym38$HAS_SLOT_P, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.$list39, (SubLObject)object.$list40);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym38$HAS_SLOT_P, (SubLObject)object.$sym41$OBJECT_HAS_SLOT_P_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym42$ON_DESTROY_CLASS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.NIL, (SubLObject)object.$list14);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym42$ON_DESTROY_CLASS, (SubLObject)object.$sym43$OBJECT_ON_DESTROY_CLASS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym44$CFASL_INPUT, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list45, (SubLObject)object.$list46, (SubLObject)object.$list47);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym44$CFASL_INPUT, (SubLObject)object.$sym52$OBJECT_CFASL_INPUT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym11$INITIALIZE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list9, (SubLObject)object.NIL, (SubLObject)object.$list53);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym11$INITIALIZE, (SubLObject)object.$sym54$OBJECT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym55$PRINT, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list56, (SubLObject)object.$list57);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym55$PRINT, (SubLObject)object.$sym61$OBJECT_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.EQUAL, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list62, (SubLObject)object.$list63);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.EQUAL, (SubLObject)object.$sym64$OBJECT_EQUAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym65$ESSENTIALLY_EQUAL, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.$list66, (SubLObject)object.$list67);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym65$ESSENTIALLY_EQUAL, (SubLObject)object.$sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym69$CLONE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list70);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym69$CLONE, (SubLObject)object.$sym71$OBJECT_CLONE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym72$DESCRIBE_INSTANCE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list17, (SubLObject)object.$list73);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym72$DESCRIBE_INSTANCE, (SubLObject)object.$sym75$OBJECT_DESCRIBE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym76$CFASL_OUTPUT, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list77, (SubLObject)object.$list46, (SubLObject)object.$list78);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym76$CFASL_OUTPUT, (SubLObject)object.$sym81$OBJECT_CFASL_OUTPUT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym82$ADD_GET_SLOT_LISTENER, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list83, (SubLObject)object.$list84);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym82$ADD_GET_SLOT_LISTENER, (SubLObject)object.$sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list91, (SubLObject)object.$list92);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE, (SubLObject)object.$sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list98, (SubLObject)object.$list99);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE, (SubLObject)object.$sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list106, (SubLObject)object.$list107);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM, (SubLObject)object.$sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym112$ADD_SET_SLOT_LISTENER, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list83, (SubLObject)object.$list113);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym112$ADD_SET_SLOT_LISTENER, (SubLObject)object.$sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list91, (SubLObject)object.$list120);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE, (SubLObject)object.$sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list98, (SubLObject)object.$list126);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE, (SubLObject)object.$sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list106, (SubLObject)object.$list133);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM, (SubLObject)object.$sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym138$REMOVE_ALL_GET_SLOT_LISTENERS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list139, (SubLObject)object.$list140);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym138$REMOVE_ALL_GET_SLOT_LISTENERS, (SubLObject)object.$sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym144$REMOVE_ALL_SET_SLOT_LISTENERS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list139, (SubLObject)object.$list145);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym144$REMOVE_ALL_SET_SLOT_LISTENERS, (SubLObject)object.$sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym149$REMOVE_ALL_SLOT_LISTENERS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list139, (SubLObject)object.$list150);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym149$REMOVE_ALL_SLOT_LISTENERS, (SubLObject)object.$sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list155, (SubLObject)object.$list156);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER, (SubLObject)object.$sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list155, (SubLObject)object.$list162);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER, (SubLObject)object.$sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD);
        methods.methods_incorporate_class_method((SubLObject)object.$sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.$list168, (SubLObject)object.$list169);
        methods.subloop_register_class_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS, (SubLObject)object.$sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym173$ISOLATE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.$list174);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym173$ISOLATE, (SubLObject)object.$sym176$OBJECT_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym177$PLISTIFY, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.NIL, (SubLObject)object.$list178);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym177$PLISTIFY, (SubLObject)object.$sym180$OBJECT_PLISTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym181$LISTIFY, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list31, (SubLObject)object.NIL, (SubLObject)object.$list182);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym181$LISTIFY, (SubLObject)object.$sym184$OBJECT_LISTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object.$sym185$ASSIMILATE, (SubLObject)object.$sym0$OBJECT, (SubLObject)object.$list186, (SubLObject)object.$list187, (SubLObject)object.$list188);
        methods.subloop_register_instance_method((SubLObject)object.$sym0$OBJECT, (SubLObject)object.$sym185$ASSIMILATE, (SubLObject)object.$sym190$OBJECT_ASSIMILATE_METHOD);
        return (SubLObject)object.NIL;
    }
    
    public void declareFunctions() {
        declare_object_file();
    }
    
    public void initializeVariables() {
        init_object_file();
    }
    
    public void runTopLevelForms() {
        setup_object_file();
    }
    
    static {
        me = (SubLFile)new object();
        $sym0$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)object.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATED-P"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)object.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-CLASS"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-CLASSES"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IMPLEMENTS-METHOD-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-LAMBDA-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-SLOT-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DESTROY-CLASS"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CFASL-INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)object.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ESSENTIALLY-EQUAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS"), (SubLObject)object.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLONE"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)object.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ENUMERATION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ENUMERATION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-GET-SLOT-LISTENERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)object.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)object.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-SLOT-LISTENERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)object.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)object.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFY"), (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIMILATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLISTIFIED-CONTENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym2$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $int3$4096 = SubLObjectFactory.makeInteger(4096);
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_OBJECT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_OBJECT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-INSTANCE");
        $sym8$NEW = SubLObjectFactory.makeSymbol("NEW");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"));
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNT"), (SubLObject)object.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))));
        $sym11$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $sym12$OBJECT_NEW_METHOD = SubLObjectFactory.makeSymbol("OBJECT-NEW-METHOD");
        $sym13$CLASS_OF = SubLObjectFactory.makeSymbol("CLASS-OF");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym15$OBJECT_CLASS_OF_METHOD = SubLObjectFactory.makeSymbol("OBJECT-CLASS-OF-METHOD");
        $sym16$DESCRIBE_CLASS = SubLObjectFactory.makeSymbol("DESCRIBE-CLASS");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)object.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.ZERO_INTEGER));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-CLASS-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-ALL-CLASS-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.TWO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeString("  "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.TWO_INTEGER), (SubLObject)object.TWO_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%~ADescription of class ~S:"), (SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-CLASS-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%~A~S -> ~S"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-TAB"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $str19$ = SubLObjectFactory.makeString("");
        $str20$__ = SubLObjectFactory.makeString("  ");
        $str21$___ADescription_of_class__S_ = SubLObjectFactory.makeString("~%~ADescription of class ~S:");
        $str22$___A_S_____S = SubLObjectFactory.makeString("~%~A~S -> ~S");
        $sym23$OBJECT_DESCRIBE_CLASS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-DESCRIBE-CLASS-METHOD");
        $sym24$PARENT_CLASS = SubLObjectFactory.makeSymbol("PARENT-CLASS");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INHERITANCE-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL)));
        $sym26$OBJECT_PARENT_CLASS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-PARENT-CLASS-METHOD");
        $sym27$CHILD_CLASSES = SubLObjectFactory.makeSymbol("CHILD-CLASSES");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS-NAMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-SUBCLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS-NAMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASSES"), (SubLObject)object.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS"), (SubLObject)object.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS-NAMES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-RETRIEVE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLASSES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL)));
        $sym29$OBJECT_CHILD_CLASSES_METHOD = SubLObjectFactory.makeSymbol("OBJECT-CHILD-CLASSES-METHOD");
        $sym30$IMPLEMENTS_METHOD_P = SubLObjectFactory.makeSymbol("IMPLEMENTS-METHOD-P");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-METHOD-ACCESS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("MY-CLASS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-METHOD-ACCESS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("MY-CLASS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-METHOD-ACCESS-LIST")), (SubLObject)object.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-METHOD-ACCESS-LIST")), (SubLObject)object.T, (SubLObject)object.NIL)))));
        $sym34$OBJECT_IMPLEMENTS_METHOD_P_METHOD = SubLObjectFactory.makeSymbol("OBJECT-IMPLEMENTS-METHOD-P-METHOD");
        $sym35$METHOD_LAMBDA_LIST = SubLObjectFactory.makeSymbol("METHOD-LAMBDA-LIST");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")))));
        $sym37$OBJECT_METHOD_LAMBDA_LIST_METHOD = SubLObjectFactory.makeSymbol("OBJECT-METHOD-LAMBDA-LIST-METHOD");
        $sym38$HAS_SLOT_P = SubLObjectFactory.makeSymbol("HAS-SLOT-P");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"));
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)object.T, (SubLObject)object.NIL))));
        $sym41$OBJECT_HAS_SLOT_P_METHOD = SubLObjectFactory.makeSymbol("OBJECT-HAS-SLOT-P-METHOD");
        $sym42$ON_DESTROY_CLASS = SubLObjectFactory.makeSymbol("ON-DESTROY-CLASS");
        $sym43$OBJECT_ON_DESTROY_CLASS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ON-DESTROY-CLASS-METHOD");
        $sym44$CFASL_INPUT = SubLObjectFactory.makeSymbol("CFASL-INPUT");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\n   Use the public function @xref CFASL-INPUT or the like.\n   @owner bgottesm"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-INPUT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-INPUT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-INPUT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-VALUE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))));
        $sym48$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym49$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym50$INLINE_SET_SLOT = SubLObjectFactory.makeSymbol("INLINE-SET-SLOT");
        $sym51$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym52$OBJECT_CFASL_INPUT_METHOD = SubLObjectFactory.makeSymbol("OBJECT-CFASL-INPUT-METHOD");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATED-P"), (SubLObject)object.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym54$OBJECT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-INITIALIZE-METHOD");
        $sym55$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S-~S>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym58$OUTER_CATCH_FOR_OBJECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");
        $str59$___S__S_ = SubLObjectFactory.makeString("#<~S-~S>");
        $str60$__Malformed_Instance_ = SubLObjectFactory.makeString("#<Malformed Instance>");
        $sym61$OBJECT_PRINT_METHOD = SubLObjectFactory.makeSymbol("OBJECT-PRINT-METHOD");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)object.EQ, (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))));
        $sym64$OBJECT_EQUAL_METHOD = SubLObjectFactory.makeSymbol("OBJECT-EQUAL-METHOD");
        $sym65$ESSENTIALLY_EQUAL = SubLObjectFactory.makeSymbol("ESSENTIALLY-EQUAL");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS"), (SubLObject)object.NIL));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)object.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)object.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)object.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)object.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.T)));
        $sym68$OBJECT_ESSENTIALLY_EQUAL_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ESSENTIALLY-EQUAL-METHOD");
        $sym69$CLONE = SubLObjectFactory.makeSymbol("CLONE");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"))))));
        $sym71$OBJECT_CLONE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-CLONE-METHOD");
        $sym72$DESCRIBE_INSTANCE = SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCE-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ALL-INSTANCE-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.TWO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeString("  "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)object.TWO_INTEGER), (SubLObject)object.TWO_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%~ADescription of instance ~S:"), (SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%~A~S -> ~S"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-TAB"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $str74$___ADescription_of_instance__S_ = SubLObjectFactory.makeString("~%~ADescription of instance ~S:");
        $sym75$OBJECT_DESCRIBE_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-DESCRIBE-INSTANCE-METHOD");
        $sym76$CFASL_OUTPUT = SubLObjectFactory.makeSymbol("CFASL-OUTPUT");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   Use the public function @xref CFASL-OUTPUT or the like.\n   @owner bgottesm"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER")), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)object.EQ), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOSLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym79$SLOT_NAME = SubLObjectFactory.makeSymbol("SLOT-NAME");
        $sym80$INLINE_GET_SLOT = SubLObjectFactory.makeSymbol("INLINE-GET-SLOT");
        $sym81$OBJECT_CFASL_OUTPUT_METHOD = SubLObjectFactory.makeSymbol("OBJECT-CFASL-OUTPUT-METHOD");
        $sym82$ADD_GET_SLOT_LISTENER = SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"));
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("GET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str85$_ADD_GET_SLOT_LISTENER_OBJECT___t = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");
        $str86$_ADD_GET_SLOT_LISTENER_OBJECT___t = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");
        $str87$_ADD_GET_SLOT_LISTENER_OBJECT___m = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER OBJECT): method ~S is not a method.");
        $kw88$GET = SubLObjectFactory.makeKeyword("GET");
        $sym89$OBJECT_ADD_GET_SLOT_LISTENER_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-METHOD");
        $sym90$ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE = SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE"));
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("GET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str93$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");
        $str94$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");
        $str95$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");
        $sym96$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD");
        $sym97$ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE = SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND"));
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("GET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str100$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");
        $str101$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");
        $str102$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");
        $str103$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");
        $sym104$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD");
        $sym105$ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM = SubLObjectFactory.makeSymbol("ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ENUMERATION"));
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("GET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ENUMERATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str108$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");
        $str109$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");
        $str110$_ADD_GET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");
        $sym111$OBJECT_ADD_GET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-GET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD");
        $sym112$ADD_SET_SLOT_LISTENER = SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str114$_ADD_SET_SLOT_LISTENER_OBJECT___t = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): target instance ~S is not an instance.");
        $str115$_ADD_SET_SLOT_LISTENER_OBJECT___t = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): target slot ~S is not a slot.");
        $str116$_ADD_SET_SLOT_LISTENER_OBJECT___m = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER OBJECT): method ~S is not a method.");
        $kw117$SET = SubLObjectFactory.makeKeyword("SET");
        $sym118$OBJECT_ADD_SET_SLOT_LISTENER_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-METHOD");
        $sym119$ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE = SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str121$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target instance ~S is not an instance.");
        $str122$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): target slot ~S is not a slot.");
        $str123$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE OBJECT): method ~S is not a method.");
        $sym124$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_VALUE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-VALUE-METHOD");
        $sym125$ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE = SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")))), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type."), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-VALUE-UPPER-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str127$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target instance ~S is not an instance.");
        $str128$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): target slot ~S is not a slot.");
        $str129$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): method ~S is not a method.");
        $str130$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE OBJECT): lower ~S and upper ~S bound must be either a string,~\n     ~%a number, or a character and both must be of the same type.");
        $sym131$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_RANGE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-RANGE-METHOD");
        $sym132$ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM = SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TRIGGER-ENUMERATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str134$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target instance ~S is not an instance.");
        $str135$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): target slot ~S is not a slot.");
        $str136$_ADD_SET_SLOT_LISTENER_STIMULATED = SubLObjectFactory.makeString("(ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM OBJECT): method ~S is not a method.");
        $sym137$OBJECT_ADD_SET_SLOT_LISTENER_STIMULATED_BY_ENUM_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-SET-SLOT-LISTENER-STIMULATED-BY-ENUM-METHOD");
        $sym138$REMOVE_ALL_GET_SLOT_LISTENERS = SubLObjectFactory.makeSymbol("REMOVE-ALL-GET-SLOT-LISTENERS");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"), (SubLObject)object.NIL));
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"))));
        $str141$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = SubLObjectFactory.makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");
        $str142$_REMOVE_ALL_GET_SLOT_LISTENERS_OB = SubLObjectFactory.makeString("(REMOVE-ALL-GET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");
        $sym143$OBJECT_REMOVE_ALL_GET_SLOT_LISTENERS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-REMOVE-ALL-GET-SLOT-LISTENERS-METHOD");
        $sym144$REMOVE_ALL_SET_SLOT_LISTENERS = SubLObjectFactory.makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS");
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"))));
        $str146$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = SubLObjectFactory.makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");
        $str147$_REMOVE_ALL_SET_SLOT_LISTENERS_OB = SubLObjectFactory.makeString("(REMOVE-ALL-SET-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");
        $sym148$OBJECT_REMOVE_ALL_SET_SLOT_LISTENERS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-REMOVE-ALL-SET-SLOT-LISTENERS-METHOD");
        $sym149$REMOVE_ALL_SLOT_LISTENERS = SubLObjectFactory.makeSymbol("REMOVE-ALL-SLOT-LISTENERS");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-SLOT"))));
        $str151$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = SubLObjectFactory.makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target instance ~S is not an instance.");
        $str152$_REMOVE_ALL_SLOT_LISTENERS_OBJECT = SubLObjectFactory.makeString("(REMOVE-ALL-SLOT-LISTENERS OBJECT): target slot ~S is not a slot.");
        $sym153$OBJECT_REMOVE_ALL_SLOT_LISTENERS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-REMOVE-ALL-SLOT-LISTENERS-METHOD");
        $sym154$ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER = SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"));
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-ADD-BEFORE-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"))), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str157$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");
        $str158$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");
        $str159$_ADD_CLASS_WIDE_BEFORE_METHOD_LIS = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");
        $sym160$OBJECT_ADD_CLASS_WIDE_BEFORE_METHOD_LISTENER_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER-METHOD");
        $sym161$ADD_CLASS_WIDE_AFTER_METHOD_LISTENER = SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER");
        $list162 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance."), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"))), (SubLObject)SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name."), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-ADD-AFTER-LISTENER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"))), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MY-METHOD")));
        $str163$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target class  ~S is neither a class nor an instance.");
        $str164$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");
        $str165$_ADD_CLASS_WIDE_AFTER_METHOD_LIST = SubLObjectFactory.makeString("(ADD-CLASS-WIDE-AFTER-METHOD-LISTENER OBJECT): method ~S is not a legal method name.");
        $sym166$OBJECT_ADD_CLASS_WIDE_AFTER_METHOD_LISTENER_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ADD-CLASS-WIDE-AFTER-METHOD-LISTENER-METHOD");
        $sym167$REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS = SubLObjectFactory.makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"), (SubLObject)object.NIL));
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE"))), (SubLObject)SubLObjectFactory.makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance."), (SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD")), (SubLObject)SubLObjectFactory.makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name."), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORED-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-METHOD"))));
        $str170$_REMOVE_CLASS_WIDE_METHOD_LISTENE = SubLObjectFactory.makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): monitored instance ~S is not an instance.");
        $str171$_REMOVE_CLASS_WIDE_METHOD_LISTENE = SubLObjectFactory.makeString("(REMOVE-CLASS-WIDE-METHOD-LISTENER OBJECT): target method ~S is not a legal method name.");
        $sym172$OBJECT_REMOVE_ALL_CLASS_WIDE_METHOD_LISTENERS_METHOD = SubLObjectFactory.makeSymbol("OBJECT-REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS-METHOD");
        $sym173$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATED-P"), (SubLObject)object.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object.NIL));
        $sym175$OUTER_CATCH_FOR_OBJECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");
        $sym176$OBJECT_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ISOLATE-METHOD");
        $sym177$PLISTIFY = SubLObjectFactory.makeSymbol("PLISTIFY");
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS"), (SubLObject)object.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PACKAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-PACKAGE"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO-ESSENTIAL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)object.NIL, (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-SLOTS")))));
        $kw179$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym180$OBJECT_PLISTIFY_METHOD = SubLObjectFactory.makeSymbol("OBJECT-PLISTIFY-METHOD");
        $sym181$LISTIFY = SubLObjectFactory.makeSymbol("LISTIFY");
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY"))))));
        $sym183$OUTER_CATCH_FOR_OBJECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-METHOD");
        $sym184$OBJECT_LISTIFY_METHOD = SubLObjectFactory.makeSymbol("OBJECT-LISTIFY-METHOD");
        $sym185$ASSIMILATE = SubLObjectFactory.makeSymbol("ASSIMILATE");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-INSTANCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLISTIFIED-CONTENT"));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFIED-CONTENT")), (SubLObject)SubLObjectFactory.makeString("(ASSIMILATE ~S): ~S is not a valid plist."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOPLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFIED-CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOPLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFIED-CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ASSOC-BY-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $str189$_ASSIMILATE__S____S_is_not_a_vali = SubLObjectFactory.makeString("(ASSIMILATE ~S): ~S is not a valid plist.");
        $sym190$OBJECT_ASSIMILATE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-ASSIMILATE-METHOD");
        $str191$NEW_SUBLOOPS_INSTANCE___S_is_neit = SubLObjectFactory.makeString("NEW-SUBLOOPS-INSTANCE: ~S is neither a class name nor a class.");
        $str192$CREATE_OBJECT_FROM_LIST___S_is_no = SubLObjectFactory.makeString("CREATE-OBJECT-FROM-LIST: ~S is not a well formed listified object.");
        $list193 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-PLIST"));
        $str194$CREATE_OBJECT_FROM_LIST___S_does_ = SubLObjectFactory.makeString("CREATE-OBJECT-FROM-LIST: ~S does not name a known class.");
        $list195 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)object.IDENTITY), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("IDENTITY"));
        $kw197$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw198$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw199$IDENTITY = SubLObjectFactory.makeKeyword("IDENTITY");
        $str200$INSTANCE = SubLObjectFactory.makeString("INSTANCE");
        $str201$STREAM = SubLObjectFactory.makeString("STREAM");
        $sym202$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym203$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"));
        $sym205$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym206$PRINT_UNREADABLE_OBJECT = SubLObjectFactory.makeSymbol("PRINT-UNREADABLE-OBJECT");
        $sym207$PRINC = SubLObjectFactory.makeSymbol("PRINC");
        $sym208$CLASS_NAME = SubLObjectFactory.makeSymbol("CLASS-NAME");
        $sym209$INSTANCE_CLASS = SubLObjectFactory.makeSymbol("INSTANCE-CLASS");
        $sym210$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym211$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str212$__A = SubLObjectFactory.makeString("-~A");
        $sym213$GET_OBJECT_INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("GET-OBJECT-INSTANCE-NUMBER");
        $sym214$WRITE_CHAR = SubLObjectFactory.makeSymbol("WRITE-CHAR");
    }
}

/*

	Total time: 659 ms
	
*/