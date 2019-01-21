package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class classes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.classes";
    public static final String myFingerPrint = "ed0cf9dedb8f9588b9f318ace7157d360a2018d60e56c4b8061021ba3608f5c3";
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 933L)
    public static SubLSymbol $classes_class_slot_access_violation$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1042L)
    private static SubLSymbol $classes_initial_hashtable_size$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1102L)
    private static SubLSymbol $classes_class_table_update_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1197L)
    private static SubLSymbol $classes_class_table$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1944L)
    private static SubLSymbol $classes_valid_class_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 2075L)
    private static SubLSymbol $classes_valid_slot_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 2831L)
    private static SubLSymbol $classes_valid_method_interface_types$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 2938L)
    private static SubLSymbol $classes_valid_method_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3206L)
    private static SubLSymbol $classes_always_generate_before_listeners$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3527L)
    private static SubLSymbol $classes_always_generate_after_listeners$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 13588L)
    private static SubLSymbol $classes_new_class_current$;
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 43819L)
    public static SubLSymbol $curclass$;
    private static final SubLString $str0$Cannot_access__A_slot__S_from_cla;
    private static final SubLInteger $int1$800;
    private static final SubLString $str2$Class_Table_Update_Lock;
    private static final SubLSymbol $sym3$_CLASSES_CLASS_TABLE_;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_;
    private static final SubLSymbol $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_;
    private static final SubLSymbol $kw10$SLOT_LISTENERS;
    private static final SubLSymbol $kw11$VALUE;
    private static final SubLSymbol $kw12$AUTO_UPDATE;
    private static final SubLSymbol $kw13$NO_MEMBER_VARIABLES;
    private static final SubLSymbol $kw14$READ_ONLY;
    private static final SubLSymbol $kw15$BEFORE_LISTENERS;
    private static final SubLSymbol $kw16$AFTER_LISTENERS;
    private static final SubLSymbol $sym17$_OPTIONAL;
    private static final SubLSymbol $sym18$DEF_CLASS_METHOD;
    private static final SubLSymbol $sym19$DEF_INSTANCE_METHOD;
    private static final SubLString $str20$_S_is_an_invalid_class_declaratio;
    private static final SubLString $str21$_S_is_neither_a_valid_slot_nor_va;
    private static final SubLString $str22$__class_name_____S;
    private static final SubLString $str23$__parent_____S;
    private static final SubLString $str24$__subclasses_____S;
    private static final SubLString $str25$__interface_names_____S;
    private static final SubLString $str26$__interfaces_____S;
    private static final SubLString $str27$__compiled_inheritance_path_____S;
    private static final SubLString $str28$__instance_var_decls_____S;
    private static final SubLString $str29$__class_var_decls_____S;
    private static final SubLString $str30$__compiled_instance_slot_access_a;
    private static final SubLString $str31$__compiled_instance_boolean_slot_;
    private static final SubLString $str32$__compiled_class_slot_access_alis;
    private static final SubLString $str33$__compiled_class_boolean_slot_acc;
    private static final SubLString $str34$__slot_accessor_alist_____S;
    private static final SubLString $str35$__instance_method_decls_____S;
    private static final SubLString $str36$__class_method_decls_____S;
    private static final SubLString $str37$__boolean_slots_____S;
    private static final SubLString $str38$__any_slots_____S;
    private static final SubLString $str39$__compiled_instance_method_access;
    private static final SubLString $str40$__compiled_class_method_access_al;
    private static final SubLString $str41$__class_initialization_function__;
    private static final SubLString $str42$__class_initialized_p_____S;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$PROGN;
    private static final SubLSymbol $sym45$WITH_LOCK_HELD;
    private static final SubLSymbol $sym46$CLASS_ACCESS_LOCK;
    private static final SubLSymbol $sym47$SUBLISP_CLASS_STRUCTURE;
    private static final SubLString $str48$_S_is_not_a_valid_class_name_;
    private static final SubLString $str49$NEW_CLASS__A_class_cannot_be_its_;
    private static final SubLString $str50$NEW_CLASS__A_class_cannot_subclas;
    private static final SubLSymbol $sym51$OBJECT;
    private static final SubLSymbol $sym52$ON_DESTROY_CLASS;
    private static final SubLString $str53$Class_;
    private static final SubLString $str54$_Definition_Lock;
    private static final SubLString $str55$_Access_Lock;
    private static final SubLString $str56$SUBLOOP_RESERVED_INITIALIZE_;
    private static final SubLString $str57$_CLASS;
    private static final SubLString $str58$_INSTANCE;
    private static final SubLSymbol $sym59$CADR;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$CAR;
    private static final SubLSymbol $sym62$CDDR;
    private static final SubLString $str63$GET_;
    private static final SubLString $str64$_;
    private static final SubLString $str65$SET_;
    private static final SubLString $str66$___S_is_not_a_valid_class_propert;
    private static final SubLString $str67$___S_is_not_a_valid_class_propert;
    private static final SubLString $str68$___S_is_not_a_valid_class_propert;
    private static final SubLSymbol $kw69$EXTENDS;
    private static final SubLString $str70$___S_is_not_a_valid_value_for_the;
    private static final SubLString $str71$__Attempting_to_subclass_unknown_;
    private static final SubLSymbol $kw72$IMPLEMENTS;
    private static final SubLString $str73$___S_is_not_a_valid_value_for_the;
    private static final SubLList $list74;
    private static final SubLSymbol $kw75$PUBLIC;
    private static final SubLSymbol $sym76$DEFINE_PUBLIC;
    private static final SubLSymbol $sym77$CLET;
    private static final SubLSymbol $sym78$NEW_VALUE;
    private static final SubLSymbol $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT;
    private static final SubLSymbol $sym80$QUOTE;
    private static final SubLSymbol $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS;
    private static final SubLSymbol $kw82$SLOT_GETTER_REGISTRY;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT;
    private static final SubLSymbol $sym87$VALUE;
    private static final SubLSymbol $kw88$SLOT_SETTER_REGISTRY;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$SUBLOOP_GET_INSTANCE_SLOT;
    private static final SubLSymbol $sym91$SUBLOOP_SET_INSTANCE_SLOT;
    private static final SubLSymbol $sym92$RET;
    private static final SubLString $str93$class;
    private static final SubLString $str94$slot;
    private static final SubLSymbol $sym95$INSTANCE_CLASS;
    private static final SubLSymbol $sym96$SLOT_ASSOC;
    private static final SubLSymbol $sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT;
    private static final SubLSymbol $sym99$LDB_TEST;
    private static final SubLSymbol $sym100$INSTANCE_BOOLEAN_SLOTS;
    private static final SubLSymbol $sym101$CSETF;
    private static final SubLSymbol $sym102$DPB;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT;
    private static final SubLSymbol $sym105$CLASS;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$FIF;
    private static final SubLSymbol $sym108$SYMBOLP;
    private static final SubLSymbol $sym109$CLASSES_RETRIEVE_CLASS;
    private static final SubLSymbol $sym110$CLASS_P;
    private static final SubLSymbol $sym111$INSTANCE_P;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$PWHEN;
    private static final SubLSymbol $sym114$AREF;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$SET_AREF;
    private static final SubLList $list118;
    private static final SubLList $list119;
    private static final SubLString $str120$_P;
    private static final SubLSymbol $sym121$SUBLOOP_INSTANCEOF_CLASS;
    private static final SubLSymbol $sym122$SUBLOOP_INITIALIZE_SLOT;
    private static final SubLSymbol $sym123$NEW_INSTANCE;
    private static final SubLSymbol $sym124$DEFINE_PROTECTED;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION;
    private static final SubLString $str128$___S_is_not_a_valid_class_name_;
    private static final SubLString $str129$___S_is_not_a_valid_member_variab;
    private static final SubLSymbol $sym130$SUBLOOP_NEW_CLASS;
    private static final SubLSymbol $kw131$ABSTRACT;
    private static final SubLSymbol $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$DEFINE_CLASS;
    private static final SubLSymbol $kw137$BOOLEAN;
    private static final SubLSymbol $kw138$CLASS;
    private static final SubLSymbol $kw139$INSTANCE;
    private static final SubLSymbol $kw140$PRIVATE;
    private static final SubLSymbol $kw141$PROTECTED;
    private static final SubLSymbol $kw142$ESSENTIAL;
    private static final SubLSymbol $kw143$NON_ESSENTIAL;
    private static final SubLSymbol $sym144$CLASS_NAME;
    private static final SubLList $list145;
    private static final SubLSymbol $sym146$CLASSES_GETF;
    private static final SubLSymbol $sym147$CLASS_PLIST;
    private static final SubLSymbol $sym148$CLASSES_PUTF;
    private static final SubLSymbol $kw149$IMPLEMENTS_SLOT_LISTENERS;
    private static final SubLList $list150;
    private static final SubLString $str151$stack;
    private static final SubLString $str152$stack_element;
    private static final SubLString $str153$actual_class;
    private static final SubLString $str154$current_depth;
    private static final SubLSymbol $sym155$LIST;
    private static final SubLSymbol $sym156$CONS;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$WHILE;
    private static final SubLSymbol $sym159$CSETQ;
    private static final SubLSymbol $sym160$CPOP;
    private static final SubLSymbol $sym161$CDR;
    private static final SubLSymbol $sym162$NEXT_DEPTH;
    private static final SubLSymbol $sym163$_;
    private static final SubLList $list164;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$CDOLIST;
    private static final SubLSymbol $sym167$CHILD_CLASS;
    private static final SubLSymbol $sym168$CLASS_SUBCLASSES;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$ACTUAL_CHILD;
    private static final SubLSymbol $sym171$CPUSH;
    private static final SubLList $list172;
    private static final SubLString $str173$__;
    private static final SubLString $str174$__;
    private static final SubLString $str175$_S_;
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1290L)
    public static SubLObject classes_reset_class_table() {
        classes.$classes_class_table$.setGlobalValue(Hashtables.make_hash_table(classes.$classes_initial_hashtable_size$.getGlobalValue(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED));
        return (SubLObject)classes.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1432L)
    public static SubLObject classes_get_all_classes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_classes = (SubLObject)classes.NIL;
        SubLObject release = (SubLObject)classes.NIL;
        try {
            release = Locks.seize_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            SubLObject class_name = (SubLObject)classes.NIL;
            SubLObject v_class = (SubLObject)classes.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(classes.$classes_class_table$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    class_name = Hashtables.getEntryKey(cdohash_entry);
                    v_class = Hashtables.getEntryValue(cdohash_entry);
                    v_classes = (SubLObject)ConsesLow.cons(v_class, v_classes);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        finally {
            if (classes.NIL != release) {
                Locks.release_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            }
        }
        return v_classes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 1680L)
    public static SubLObject classes_get_all_class_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject class_names = (SubLObject)classes.NIL;
        SubLObject release = (SubLObject)classes.NIL;
        try {
            release = Locks.seize_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            SubLObject class_name = (SubLObject)classes.NIL;
            SubLObject v_class = (SubLObject)classes.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(classes.$classes_class_table$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    class_name = Hashtables.getEntryKey(cdohash_entry);
                    v_class = Hashtables.getEntryValue(cdohash_entry);
                    class_names = (SubLObject)ConsesLow.cons(class_name, class_names);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        finally {
            if (classes.NIL != release) {
                Locks.release_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            }
        }
        return class_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 2641L)
    public static SubLObject classes_protection_greater_than_or_equal(final SubLObject level1, final SubLObject level2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sublist = conses_high.member(level1, classes.$classes_valid_slot_properties$.getDynamicValue(thread), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED);
        return (SubLObject)((classes.NIL != conses_high.member(level2, sublist, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3274L)
    public static SubLObject classes_set_always_generate_before_listeners(final SubLObject value) {
        classes.$classes_always_generate_before_listeners$.setGlobalValue(value);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3417L)
    public static SubLObject classes_before_listeners_by_default_p() {
        return classes.$classes_always_generate_before_listeners$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3594L)
    public static SubLObject classes_set_always_generate_after_listeners(final SubLObject value) {
        classes.$classes_always_generate_after_listeners$.setGlobalValue(value);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3735L)
    public static SubLObject classes_after_listeners_by_default_p() {
        return classes.$classes_always_generate_after_listeners$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 3843L)
    public static SubLObject classes_getf(final SubLObject plist, final SubLObject target_indicator) {
        SubLObject remainder;
        SubLObject indicator;
        SubLObject value;
        for (remainder = (SubLObject)classes.NIL, remainder = plist; classes.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            indicator = remainder.first();
            value = conses_high.cadr(remainder);
            if (indicator.eql(target_indicator)) {
                return value;
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 4012L)
    public static SubLObject classes_putf(final SubLObject plist, final SubLObject target_indicator, final SubLObject new_value) {
        SubLObject indicator = (SubLObject)classes.NIL;
        SubLObject sublist;
        for (sublist = (SubLObject)classes.NIL, sublist = plist; classes.NIL != sublist; sublist = (SubLObject)((classes.NIL != plist.rest() && plist.rest().isCons()) ? conses_high.cddr(plist) : classes.NIL)) {
            indicator = sublist.first();
            if (indicator.eql(target_indicator)) {
                ConsesLow.rplaca(sublist.rest(), new_value);
                return plist;
            }
        }
        return (SubLObject)ConsesLow.listS(target_indicator, new_value, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 4397L)
    public static SubLObject classes_implement_slot_listeners_p(final SubLObject class_properties) {
        return classes_getf(class_properties, (SubLObject)classes.$kw10$SLOT_LISTENERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 4527L)
    public static SubLObject classes_valid_slot_property_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((classes.NIL != conses_high.member(v_object, classes.$classes_valid_slot_properties$.getDynamicValue(thread), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 4652L)
    public static SubLObject classes_list_of_valid_slot_properties_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.T;
        }
        if (v_object.isCons()) {
            SubLObject sublist = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            while (classes.NIL != sublist) {
                element = sublist.first();
                if (element == classes.$kw11$VALUE) {
                    if (classes.NIL == sublist.rest()) {
                        return (SubLObject)classes.NIL;
                    }
                    sublist = conses_high.cddr(sublist);
                }
                else {
                    if (classes.NIL == classes_valid_slot_property_p(element)) {
                        return (SubLObject)classes.NIL;
                    }
                    sublist = sublist.rest();
                }
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 5131L)
    public static SubLObject classes_list_of_valid_method_properties_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.T;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            element = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_valid_method_property_p(element)) {
                    return (SubLObject)classes.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 5384L)
    public static SubLObject classes_valid_slot_name_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != v_object && v_object.isSymbol() && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 5501L)
    public static SubLObject classes_valid_slot_decl_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.NIL;
        }
        if (classes.NIL != classes_valid_slot_name_p(v_object)) {
            return (SubLObject)classes.T;
        }
        if (v_object.isCons()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && classes.NIL != classes_valid_slot_name_p(v_object.first()) && classes.NIL != classes_list_of_valid_slot_properties_p(v_object.rest()));
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 5800L)
    public static SubLObject classes_valid_method_property_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((classes.NIL != conses_high.member(v_object, classes.$classes_valid_method_properties$.getDynamicValue(thread), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 5929L)
    public static SubLObject classes_valid_method_properties_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.T;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            element = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_valid_method_property_p(element)) {
                    return (SubLObject)classes.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6174L)
    public static SubLObject classes_auto_update_p(final SubLObject method_properties) {
        return (SubLObject)((classes.NIL != conses_high.member((SubLObject)classes.$kw12$AUTO_UPDATE, method_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6296L)
    public static SubLObject classes_no_member_variables_p(final SubLObject method_properties) {
        return (SubLObject)((classes.NIL != conses_high.member((SubLObject)classes.$kw13$NO_MEMBER_VARIABLES, method_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6434L)
    public static SubLObject classes_read_only_p(final SubLObject method_properties) {
        return (SubLObject)((classes.NIL != conses_high.member((SubLObject)classes.$kw14$READ_ONLY, method_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6552L)
    public static SubLObject classes_before_listeners_p(final SubLObject method_properties) {
        return (SubLObject)((classes.NIL != classes_before_listeners_by_default_p() || classes.NIL != conses_high.member((SubLObject)classes.$kw15$BEFORE_LISTENERS, method_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6733L)
    public static SubLObject classes_after_listeners_p(final SubLObject method_properties) {
        return (SubLObject)((classes.NIL != classes_after_listeners_by_default_p() || classes.NIL != conses_high.member((SubLObject)classes.$kw16$AFTER_LISTENERS, method_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 6911L)
    public static SubLObject classes_valid_method_interface_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((classes.NIL != conses_high.member(v_object, classes.$classes_valid_method_interface_types$.getDynamicValue(thread), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) ? classes.T : classes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 7051L)
    public static SubLObject classes_valid_method_name_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != v_object && v_object.isSymbol() && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 7170L)
    public static SubLObject classes_valid_parameter_name_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != v_object && v_object.isSymbol() && v_object != classes.$sym17$_OPTIONAL && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 7322L)
    public static SubLObject classes_valid_optional_parameter_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != classes_valid_parameter_name_p(v_object) || (v_object.isCons() && v_object.rest().isList() && classes.NIL != classes_valid_parameter_name_p(v_object.first())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 7540L)
    public static SubLObject classes_valid_optional_parameter_list_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.NIL;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            element = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_valid_optional_parameter_p(element)) {
                    return (SubLObject)classes.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 7796L)
    public static SubLObject classes_valid_lambda_list_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.T;
        }
        if (!v_object.isCons()) {
            return (SubLObject)classes.NIL;
        }
        final SubLObject first_element = v_object.first();
        final SubLObject rest_of_elements = v_object.rest();
        if (first_element == classes.$sym17$_OPTIONAL) {
            return classes_valid_optional_parameter_list_p(rest_of_elements);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != classes_valid_parameter_name_p(first_element) && classes.NIL != classes_valid_lambda_list_p(rest_of_elements));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8224L)
    public static SubLObject classes_valid_method_interface_body_p(final SubLObject v_object) {
        return Types.sublisp_null(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8311L)
    public static SubLObject classes_valid_method_interface_decl_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && classes.NIL != classes_valid_method_interface_type_p(v_object.first()) && v_object.rest().isCons() && classes.NIL != classes_valid_method_name_p(v_object.rest().first()) && v_object.rest().rest().isCons() && classes.NIL != classes_valid_lambda_list_p(v_object.rest().rest().first()) && classes.NIL != classes_list_of_valid_method_properties_p(v_object.rest().rest().rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8585L)
    public static SubLObject classes_method_decl_type(final SubLObject method_interface_decl) {
        return method_interface_decl.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8688L)
    public static SubLObject classes_class_method_decl_p(final SubLObject method_interface_decl) {
        return Equality.eq(classes_method_decl_type(method_interface_decl), (SubLObject)classes.$sym18$DEF_CLASS_METHOD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8840L)
    public static SubLObject classes_instance_method_decl_p(final SubLObject method_interface_decl) {
        return Equality.eq(classes_method_decl_type(method_interface_decl), (SubLObject)classes.$sym19$DEF_INSTANCE_METHOD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 8998L)
    public static SubLObject classes_method_name_given_method_decl(final SubLObject method_interface_decl) {
        return conses_high.cadr(method_interface_decl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 9115L)
    public static SubLObject classes_lambda_list_given_method_decl(final SubLObject method_interface_decl) {
        return conses_high.cddr(method_interface_decl).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 9238L)
    public static SubLObject classes_properties_given_method_decl(final SubLObject method_interface_decl) {
        return conses_high.cddr(method_interface_decl).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 9360L)
    public static SubLObject classes_valid_slot_or_method_decl_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != classes_valid_slot_decl_p(v_object) || classes.NIL != classes_valid_method_interface_decl_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 9526L)
    public static SubLObject classes_valid_slot_or_method_decls_p(final SubLObject v_object) {
        if (classes.NIL == v_object) {
            return (SubLObject)classes.T;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            element = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_valid_slot_or_method_decl_p(element)) {
                    return (SubLObject)classes.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 9780L)
    public static SubLObject classes_must_be_valid_slot_or_method_decls(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL != v_object && !v_object.isCons()) {
            Errors.error((SubLObject)classes.$str20$_S_is_an_invalid_class_declaratio, v_object);
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes.NIL;
            element = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == classes_valid_slot_or_method_decl_p(element)) {
                    Errors.error((SubLObject)classes.$str21$_S_is_neither_a_valid_slot_nor_va, element);
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
        }
        return (SubLObject)classes.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 10158L)
    public static SubLObject classes_separate_decls_into_slot_decls_and_method_decls(final SubLObject slot_and_method_decls) {
        if (classes.NIL == slot_and_method_decls) {
            return Values.values((SubLObject)classes.NIL, (SubLObject)classes.NIL);
        }
        SubLObject slot_decls = (SubLObject)classes.NIL;
        SubLObject method_decls = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = slot_and_method_decls;
        SubLObject decl = (SubLObject)classes.NIL;
        decl = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            if (classes.NIL != classes_valid_slot_decl_p(decl)) {
                slot_decls = (SubLObject)ConsesLow.cons(decl, slot_decls);
            }
            else if (classes.NIL != classes_valid_method_interface_decl_p(decl)) {
                method_decls = (SubLObject)ConsesLow.cons(decl, method_decls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            decl = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(slot_decls), Sequences.nreverse(method_decls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 10636L)
    public static SubLObject class_separate_decls_into_class_and_instance_method_decls(final SubLObject method_decls) {
        if (classes.NIL == method_decls) {
            return Values.values((SubLObject)classes.NIL, (SubLObject)classes.NIL);
        }
        SubLObject class_method_decls = (SubLObject)classes.NIL;
        SubLObject instance_method_decls = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = method_decls;
        SubLObject decl = (SubLObject)classes.NIL;
        decl = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            if (classes.NIL != classes_class_method_decl_p(decl)) {
                class_method_decls = (SubLObject)ConsesLow.cons(decl, class_method_decls);
            }
            else if (classes.NIL != classes_instance_method_decl_p(decl)) {
                instance_method_decls = (SubLObject)ConsesLow.cons(decl, instance_method_decls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            decl = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(class_method_decls), Sequences.nreverse(instance_method_decls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 11145L)
    public static SubLObject ldb_test(final SubLObject spec, final SubLObject integer) {
        return (SubLObject)(bytes.ldb(spec, integer).isZero() ? classes.NIL : classes.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 11233L)
    public static SubLObject display_class(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str22$__class_name_____S, subloop_structures.class_name(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str23$__parent_____S, subloop_structures.class_parent(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str24$__subclasses_____S, subloop_structures.class_subclasses(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str25$__interface_names_____S, subloop_structures.class_interface_names(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str26$__interfaces_____S, subloop_structures.class_interfaces(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str27$__compiled_inheritance_path_____S, subloop_structures.class_compiled_inheritance_path(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str28$__instance_var_decls_____S, subloop_structures.class_instance_var_decls(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str29$__class_var_decls_____S, subloop_structures.class_class_var_decls(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str30$__compiled_instance_slot_access_a, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str31$__compiled_instance_boolean_slot_, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str32$__compiled_class_slot_access_alis, subloop_structures.class_compiled_class_slot_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str33$__compiled_class_boolean_slot_acc, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str34$__slot_accessor_alist_____S, subloop_structures.class_slot_accessor_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str35$__instance_method_decls_____S, subloop_structures.class_instance_method_decls(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str36$__class_method_decls_____S, subloop_structures.class_class_method_decls(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str37$__boolean_slots_____S, subloop_structures.class_boolean_slots(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str38$__any_slots_____S, subloop_structures.class_any_slots(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str39$__compiled_instance_method_access, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str40$__compiled_class_method_access_al, subloop_structures.class_compiled_class_method_access_alist(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str41$__class_initialization_function__, subloop_structures.class_class_initialization_function(v_class));
        PrintLow.format((SubLObject)classes.T, (SubLObject)classes.$str42$__class_initialized_p_____S, subloop_structures.class_class_initialized_p(v_class));
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 13207L)
    public static SubLObject with_class_definition_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list43);
        v_class = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return reader.bq_cons((SubLObject)classes.$sym44$PROGN, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 13458L)
    public static SubLObject with_class_access_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list43);
        v_class = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes.$sym45$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym46$CLASS_ACCESS_LOCK, v_class)), body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 13644L)
    public static SubLObject classes_retrieve_class(final SubLObject class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (class_name.isSymbol()) {
            final SubLObject actual_class = Hashtables.gethash(class_name, classes.$classes_class_table$.getGlobalValue(), (SubLObject)classes.UNPROVIDED);
            if (classes.NIL != actual_class && classes.NIL == subloop_structures.class_class_initialized_p(actual_class)) {
                final SubLObject function = subloop_structures.class_class_initialization_function(actual_class);
                if (classes.NIL != Symbols.fboundp(function) && !classes.$classes_new_class_current$.getDynamicValue(thread).eql(class_name) && classes.NIL != subloop_structures.class_any_slots(actual_class) && classes.NIL != subloop_structures.class_boolean_slots(actual_class)) {
                    Functions.funcall(subloop_structures.class_class_initialization_function(actual_class), actual_class);
                    subloop_structures._csetf_class_class_initialized_p(actual_class, (SubLObject)classes.T);
                }
            }
            return actual_class;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 14464L)
    public static SubLObject classes_intern_class(final SubLObject class_name, final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)classes.NIL;
        try {
            release = Locks.seize_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            if (class_name.isSymbol() && classes.NIL != subloop_structures.class_p(v_class)) {
                Hashtables.sethash(class_name, classes.$classes_class_table$.getGlobalValue(), v_class);
            }
        }
        finally {
            if (classes.NIL != release) {
                Locks.release_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            }
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 14710L)
    public static SubLObject classes_delete_class(final SubLObject class_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)classes.NIL;
        try {
            release = Locks.seize_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            if (class_name.isSymbol()) {
                Hashtables.remhash(class_name, classes.$classes_class_table$.getGlobalValue());
            }
        }
        finally {
            if (classes.NIL != release) {
                Locks.release_lock(classes.$classes_class_table_update_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 14911L)
    public static SubLObject classes_set_class(final SubLObject symbol, final SubLObject new_class) {
        if (symbol.isSymbol() && (classes.NIL == new_class || classes.NIL != subloop_structures.class_p(new_class))) {
            Symbols.put(symbol, (SubLObject)classes.$sym47$SUBLISP_CLASS_STRUCTURE, new_class);
            return new_class;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 15146L)
    public static SubLObject classes_get_class(final SubLObject symbol) {
        if (symbol.isSymbol()) {
            final SubLObject possible_class = Symbols.get(symbol, (SubLObject)classes.$sym47$SUBLISP_CLASS_STRUCTURE, (SubLObject)classes.UNPROVIDED);
            if (classes.NIL != subloop_structures.class_p(possible_class)) {
                return possible_class;
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 15378L)
    public static SubLObject classes_valid_class_property_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && classes.NIL != conses_high.member(v_object, classes.$classes_valid_class_properties$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)classes.EQ), (SubLObject)classes.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 15525L)
    public static SubLObject classes_valid_instance_var_decl_p(final SubLObject instance_var_decl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(instance_var_decl.isSymbol() || (instance_var_decl.isCons() && instance_var_decl.first().isSymbol()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 15741L)
    public static SubLObject classes_valid_instance_var_decls_p(final SubLObject instance_var_decls) {
        if (instance_var_decls.isList()) {
            SubLObject cdolist_list_var = instance_var_decls;
            SubLObject instance_var_decl = (SubLObject)classes.NIL;
            instance_var_decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_valid_instance_var_decl_p(instance_var_decl)) {
                    return (SubLObject)classes.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                instance_var_decl = cdolist_list_var.first();
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 16030L)
    public static SubLObject classes_valid_class_name_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != v_object && v_object.isSymbol() && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 16150L)
    public static SubLObject classes_must_be_valid_class_name(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == classes_valid_class_name_p(v_object)) {
            Errors.error((SubLObject)classes.$str48$_S_is_not_a_valid_class_name_, v_object);
        }
        return (SubLObject)classes.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 16310L)
    public static SubLObject classes_unique_elements(final SubLObject list_of_elements) {
        SubLObject result = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = list_of_elements;
        SubLObject element = (SubLObject)classes.NIL;
        element = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            if (classes.NIL == conses_high.member(element, result, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(element, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 16528L)
    public static SubLObject new_class(final SubLObject class_name, final SubLObject parent_class, SubLObject parent_interfaces, final SubLObject slot_and_method_decls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = classes.$classes_new_class_current$.currentBinding(thread);
        try {
            classes.$classes_new_class_current$.bind(class_name, thread);
            classes_must_be_valid_class_name(class_name);
            parent_interfaces = classes_unique_elements(parent_interfaces);
            interfaces.interfaces_check_parent_interfaces(parent_interfaces);
            if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && class_name.eql(parent_class)) {
                Errors.error((SubLObject)classes.$str49$NEW_CLASS__A_class_cannot_be_its_, class_name, parent_class);
            }
            if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL != subclassp(parent_class, class_name)) {
                Errors.error((SubLObject)classes.$str50$NEW_CLASS__A_class_cannot_subclas, parent_class, class_name);
            }
            if (classes.NIL != parent_class) {
                classes_must_be_valid_class_name(parent_class);
            }
            classes_must_be_valid_slot_or_method_decls(slot_and_method_decls);
        }
        finally {
            classes.$classes_new_class_current$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject slot_decls = classes_separate_decls_into_slot_decls_and_method_decls(slot_and_method_decls);
        final SubLObject method_interface_decls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject v_class = (SubLObject)classes.NIL;
        final SubLObject _prev_bind_2 = classes.$classes_new_class_current$.currentBinding(thread);
        try {
            classes.$classes_new_class_current$.bind(class_name, thread);
            final SubLObject old_class = classes_retrieve_class(class_name);
            SubLObject actual_interface = (SubLObject)classes.NIL;
            SubLObject actual_interfaces = (SubLObject)classes.NIL;
            SubLObject class_var_decls = (SubLObject)classes.NIL;
            SubLObject instance_var_decls = (SubLObject)classes.NIL;
            if (classes.NIL != old_class && classes.NIL != subclassp(old_class, (SubLObject)classes.$sym51$OBJECT)) {
                final SubLObject association = methods.method_assoc((SubLObject)classes.$sym52$ON_DESTROY_CLASS, subloop_structures.class_compiled_class_method_access_alist(old_class));
                if (classes.NIL != association) {
                    final SubLObject function_name = subloop_structures.method_function_name(association);
                    if (classes.NIL != Symbols.fboundp(function_name)) {
                        methods.funcall_class_method_with_0_args(old_class, (SubLObject)classes.$sym52$ON_DESTROY_CLASS);
                    }
                }
            }
            v_class = ((classes.NIL != old_class) ? old_class : subloop_structures.create_class());
            subloop_structures._csetf_class_class_properties(v_class, (SubLObject)classes.ZERO_INTEGER);
            if (classes.NIL == old_class) {
                subloop_structures._csetf_class_definition_lock(v_class, Locks.make_lock(Sequences.cconcatenate((SubLObject)classes.$str53$Class_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str54$_Definition_Lock })));
                subloop_structures._csetf_class_access_lock(v_class, Locks.make_lock(Sequences.cconcatenate((SubLObject)classes.$str53$Class_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str55$_Access_Lock })));
            }
            SubLObject cdolist_list_var = parent_interfaces;
            SubLObject interface_name = (SubLObject)classes.NIL;
            interface_name = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                actual_interface = interfaces.interfaces_retrieve_interface(interface_name);
                if (classes.NIL != actual_interface) {
                    actual_interfaces = (SubLObject)ConsesLow.cons(actual_interface, actual_interfaces);
                }
                cdolist_list_var = cdolist_list_var.rest();
                interface_name = cdolist_list_var.first();
            }
            actual_interfaces = Sequences.nreverse(actual_interfaces);
            cdolist_list_var = slot_decls;
            SubLObject decl = (SubLObject)classes.NIL;
            decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != classes_class_slot_decl_p(decl)) {
                    class_var_decls = (SubLObject)ConsesLow.cons(decl, class_var_decls);
                }
                else if (classes.NIL != classes_instance_slot_decl_p(decl)) {
                    instance_var_decls = (SubLObject)ConsesLow.cons(decl, instance_var_decls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl = cdolist_list_var.first();
            }
            subloop_structures._csetf_class_name(v_class, class_name);
            subloop_structures._csetf_class_parent(v_class, parent_class);
            subloop_structures._csetf_class_subclasses(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_interface_names(v_class, parent_interfaces);
            subloop_structures._csetf_class_interfaces(v_class, actual_interfaces);
            subloop_structures._csetf_class_compiled_inheritance_path(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_instance_var_decls(v_class, Sequences.nreverse(instance_var_decls));
            subloop_structures._csetf_class_class_var_decls(v_class, Sequences.nreverse(class_var_decls));
            subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_instance_method_decls(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_class_method_decls(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_boolean_slots(v_class, (SubLObject)classes.ZERO_INTEGER);
            subloop_structures._csetf_class_slot_accessor_alist(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_any_slots(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_compiled_instance_method_access_alist(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_compiled_class_method_access_alist(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_class_initialization_function(v_class, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str57$_CLASS }), (SubLObject)classes.UNPROVIDED));
            subloop_structures._csetf_class_class_initialized_p(v_class, (SubLObject)classes.NIL);
            subloop_structures._csetf_class_instance_initialization_function(v_class, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str58$_INSTANCE }), (SubLObject)classes.UNPROVIDED));
            classes_intern_class(class_name, v_class);
            classes_set_class(class_name, v_class);
            classes_compile_inheritance_path(v_class, (SubLObject)classes.UNPROVIDED);
            classes_compile_instance_slot_access_list(v_class, (SubLObject)classes.UNPROVIDED);
            classes_compile_instance_boolean_slot_access_list(v_class, (SubLObject)classes.UNPROVIDED);
            classes_compile_class_slot_access_list(v_class, (SubLObject)classes.UNPROVIDED);
            classes_compile_class_boolean_slot_access_list(v_class, (SubLObject)classes.UNPROVIDED);
            classes_generate_slot_accessor_names(v_class);
            classes_initialize_class_slots(v_class);
            thread.resetMultipleValues();
            SubLObject class_method_decls = class_separate_decls_into_class_and_instance_method_decls(method_interface_decls);
            SubLObject instance_method_decls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject interface_class_methods = interfaces.interfaces_collect_method_decls(actual_interfaces);
            final SubLObject interface_instance_methods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject class_methods_to_append = (SubLObject)classes.NIL;
            SubLObject instance_methods_to_append = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var2 = interface_class_methods;
            SubLObject method_decl = (SubLObject)classes.NIL;
            method_decl = cdolist_list_var2.first();
            while (classes.NIL != cdolist_list_var2) {
                if (classes.NIL == conses_high.member(conses_high.cadr(method_decl), class_method_decls, Symbols.symbol_function((SubLObject)classes.EQ), Symbols.symbol_function((SubLObject)classes.$sym59$CADR))) {
                    class_methods_to_append = (SubLObject)ConsesLow.cons(method_decl, class_methods_to_append);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                method_decl = cdolist_list_var2.first();
            }
            cdolist_list_var2 = interface_instance_methods;
            method_decl = (SubLObject)classes.NIL;
            method_decl = cdolist_list_var2.first();
            while (classes.NIL != cdolist_list_var2) {
                if (classes.NIL == conses_high.member(conses_high.cadr(method_decl), instance_method_decls, Symbols.symbol_function((SubLObject)classes.EQ), Symbols.symbol_function((SubLObject)classes.$sym59$CADR))) {
                    instance_methods_to_append = (SubLObject)ConsesLow.cons(method_decl, instance_methods_to_append);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                method_decl = cdolist_list_var2.first();
            }
            class_method_decls = ConsesLow.nconc(class_method_decls, Sequences.nreverse(class_methods_to_append));
            instance_method_decls = ConsesLow.nconc(instance_method_decls, Sequences.nreverse(instance_methods_to_append));
            SubLObject method_name = (SubLObject)classes.NIL;
            SubLObject lambda_list = (SubLObject)classes.NIL;
            SubLObject v_properties = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var3 = class_method_decls;
            SubLObject decl2 = (SubLObject)classes.NIL;
            decl2 = cdolist_list_var3.first();
            while (classes.NIL != cdolist_list_var3) {
                method_name = classes_method_name_given_method_decl(decl2);
                lambda_list = classes_lambda_list_given_method_decl(decl2);
                v_properties = classes_properties_given_method_decl(decl2);
                methods.methods_incorporate_class_method(method_name, class_name, v_properties, lambda_list, (SubLObject)classes.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                decl2 = cdolist_list_var3.first();
            }
            cdolist_list_var3 = instance_method_decls;
            decl2 = (SubLObject)classes.NIL;
            decl2 = cdolist_list_var3.first();
            while (classes.NIL != cdolist_list_var3) {
                method_name = classes_method_name_given_method_decl(decl2);
                lambda_list = classes_lambda_list_given_method_decl(decl2);
                v_properties = classes_properties_given_method_decl(decl2);
                methods.methods_incorporate_instance_method(method_name, class_name, v_properties, lambda_list, (SubLObject)classes.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                decl2 = cdolist_list_var3.first();
            }
            if (classes.NIL == class_method_decls && classes.NIL == instance_method_decls) {
                methods.methods_compile_method_access_alists(v_class);
            }
        }
        finally {
            classes.$classes_new_class_current$.rebind(_prev_bind_2, thread);
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23034L)
    public static SubLObject classes_make_slot_accessor_association(final SubLObject slot_name, final SubLObject getter_name, final SubLObject setter_name) {
        return (SubLObject)ConsesLow.listS(slot_name, getter_name, setter_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23177L)
    public static SubLObject classes_slot_accessor_association_slot_name(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_accessor_association = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list60);
        slot_accessor_association = current.first();
        current = current.rest();
        if (classes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)classes.$sym61$CAR, slot_accessor_association);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes.$list60);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23313L)
    public static SubLObject classes_slot_accessor_association_getter_name(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_accessor_association = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list60);
        slot_accessor_association = current.first();
        current = current.rest();
        if (classes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)classes.$sym59$CADR, slot_accessor_association);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes.$list60);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23452L)
    public static SubLObject classes_slot_accessor_association_setter_name(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_accessor_association = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list60);
        slot_accessor_association = current.first();
        current = current.rest();
        if (classes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)classes.$sym62$CDDR, slot_accessor_association);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes.$list60);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23591L)
    public static SubLObject classes_retrieve_slot_getter(final SubLObject v_class, final SubLObject slot_name) {
        final SubLObject association = conses_high.assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED);
        if (classes.NIL != association) {
            return conses_high.cadr(association);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 23845L)
    public static SubLObject classes_retrieve_slot_setter(final SubLObject v_class, final SubLObject slot_name) {
        final SubLObject association = conses_high.assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED);
        if (classes.NIL != association) {
            return conses_high.cddr(association);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 24099L)
    public static SubLObject classes_generate_slot_accessor_names(final SubLObject v_class) {
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        SubLObject slot_accessor_alist = (SubLObject)classes.NIL;
        SubLObject slot_name = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
        SubLObject slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            slot_accessor_alist = (SubLObject)ConsesLow.cons(classes_make_slot_accessor_association(slot_name, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str63$GET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str65$SET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED)), slot_accessor_alist);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)classes.NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            slot_accessor_alist = (SubLObject)ConsesLow.cons(classes_make_slot_accessor_association(slot_name, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str63$GET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str65$SET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED)), slot_accessor_alist);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)classes.NIL;
        cdolist_list_var = compiled_class_slot_access_alist;
        slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            slot_accessor_alist = (SubLObject)ConsesLow.cons(classes_make_slot_accessor_association(slot_name, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str63$GET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str65$SET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED)), slot_accessor_alist);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)classes.NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            slot_accessor_alist = (SubLObject)ConsesLow.cons(classes_make_slot_accessor_association(slot_name, Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str63$GET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED), Packages.intern(Sequences.cconcatenate((SubLObject)classes.$str65$SET_, new SubLObject[] { Symbols.symbol_name(class_name), classes.$str64$_, Symbols.symbol_name(slot_name) }), (SubLObject)classes.UNPROVIDED)), slot_accessor_alist);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        subloop_structures._csetf_class_slot_accessor_alist(v_class, Sequences.nreverse(slot_accessor_alist));
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 26166L)
    public static SubLObject classes_valid_class_properties_p(final SubLObject plist) {
        if (plist.isList()) {
            SubLObject remainder;
            SubLObject indicator;
            SubLObject value;
            for (remainder = (SubLObject)classes.NIL, remainder = plist; classes.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                indicator = remainder.first();
                value = conses_high.cadr(remainder);
                if (classes.NIL == classes_valid_class_property_p(indicator)) {
                    return (SubLObject)classes.NIL;
                }
            }
            return (SubLObject)classes.T;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 26420L)
    public static SubLObject class_properties_must_be_valid(final SubLObject class_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !class_properties.isList()) {
            Errors.error((SubLObject)classes.$str66$___S_is_not_a_valid_class_propert, class_properties);
        }
        SubLObject remainder;
        SubLObject class_property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = (SubLObject)classes.NIL, remainder = class_properties; classes.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            class_property = remainder.first();
            value = conses_high.cadr(remainder);
            if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == classes_valid_class_property_p(class_property)) {
                Errors.error((SubLObject)(class_property.isSymbol() ? classes.$str67$___S_is_not_a_valid_class_propert : classes.$str68$___S_is_not_a_valid_class_propert), class_property);
            }
            pcase_var = class_property;
            if (pcase_var.eql((SubLObject)classes.$kw69$EXTENDS)) {
                if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !value.isSymbol()) {
                    Errors.error((SubLObject)classes.$str70$___S_is_not_a_valid_value_for_the, value);
                }
                if (classes.NIL == classes_retrieve_class(value)) {
                    Errors.warn((SubLObject)classes.$str71$__Attempting_to_subclass_unknown_, value);
                }
            }
            else if (pcase_var.eql((SubLObject)classes.$kw72$IMPLEMENTS) && classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !value.isSymbol() && classes.NIL == classes_utilities.classes_symbol_list_p(value)) {
                Errors.error((SubLObject)classes.$str73$___S_is_not_a_valid_value_for_the, value);
            }
        }
        return (SubLObject)classes.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 27607L)
    public static SubLObject expand_interface_method_instantiations(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        final SubLObject class_name = (SubLObject)((classes.NIL != v_class) ? subloop_structures.class_name(v_class) : classes.NIL);
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            SubLObject instantiations = (SubLObject)classes.NIL;
            final SubLObject v_class_$1 = v_class;
            final SubLObject interface_names = subloop_structures.class_interface_names(v_class_$1);
            final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$1);
            SubLObject cdolist_list_var;
            final SubLObject class_method_decls = cdolist_list_var = subloop_structures.class_class_method_decls(v_class_$1);
            SubLObject method = (SubLObject)classes.NIL;
            method = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != subloop_structures.method_instantiate_template(method)) {
                    SubLObject collected_methods = (SubLObject)classes.NIL;
                    SubLObject v_interface = (SubLObject)classes.NIL;
                    SubLObject interface_method = (SubLObject)classes.NIL;
                    SubLObject cdolist_list_var_$2 = interface_names;
                    SubLObject interface_name = (SubLObject)classes.NIL;
                    interface_name = cdolist_list_var_$2.first();
                    while (classes.NIL != cdolist_list_var_$2) {
                        v_interface = interfaces.interfaces_retrieve_interface(interface_name);
                        if (classes.NIL != v_interface) {
                            interface_method = interfaces.interfaces_find_class_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
                            if (classes.NIL != interface_method) {
                                collected_methods = (SubLObject)ConsesLow.cons(interface_method, collected_methods);
                            }
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        interface_name = cdolist_list_var_$2.first();
                    }
                    if (collected_methods.isCons() && classes.NIL == collected_methods.rest()) {
                        instantiations = ConsesLow.nconc(instantiations, interfaces.interfaces_class_method_to_listed_def_class_method(class_name, collected_methods.first()));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
            cdolist_list_var = instance_method_decls;
            method = (SubLObject)classes.NIL;
            method = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != subloop_structures.method_instantiate_template(method)) {
                    SubLObject collected_methods = (SubLObject)classes.NIL;
                    SubLObject v_interface = (SubLObject)classes.NIL;
                    SubLObject interface_method = (SubLObject)classes.NIL;
                    SubLObject cdolist_list_var_$3 = interface_names;
                    SubLObject interface_name = (SubLObject)classes.NIL;
                    interface_name = cdolist_list_var_$3.first();
                    while (classes.NIL != cdolist_list_var_$3) {
                        v_interface = interfaces.interfaces_retrieve_interface(interface_name);
                        if (classes.NIL != v_interface) {
                            interface_method = interfaces.interfaces_find_instance_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
                            if (classes.NIL != interface_method) {
                                collected_methods = (SubLObject)ConsesLow.cons(interface_method, collected_methods);
                            }
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        interface_name = cdolist_list_var_$3.first();
                    }
                    if (collected_methods.isCons() && classes.NIL == collected_methods.rest()) {
                        instantiations = ConsesLow.nconc(instantiations, interfaces.interfaces_instance_method_to_listed_def_instance_method(class_name, collected_methods.first()));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
            return instantiations;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 29476L)
    public static SubLObject expand_accessors_for_class(final SubLObject class_name_or_class, SubLObject v_slot_listeners) {
        if (v_slot_listeners == classes.UNPROVIDED) {
            v_slot_listeners = (SubLObject)classes.NIL;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject class_name = subloop_structures.class_name(v_class);
            SubLObject defn_pairs = (SubLObject)classes.NIL;
            SubLObject v_defns = (SubLObject)classes.NIL;
            final SubLObject v_class_$4 = v_class;
            final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$4);
            final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$4);
            final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$4);
            final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$4);
            SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
            SubLObject slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (slots.slot_class_name(slot).eql(class_name)) {
                    defn_pairs = (SubLObject)ConsesLow.cons(expand_instance_any_slot_accessors(v_class, slot, v_slot_listeners), defn_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            cdolist_list_var = compiled_instance_boolean_slot_access_alist;
            slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (slots.slot_class_name(slot).eql(class_name)) {
                    defn_pairs = (SubLObject)ConsesLow.cons(expand_instance_boolean_slot_accessors(v_class, slot), defn_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            cdolist_list_var = compiled_class_slot_access_alist;
            slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (slots.slot_class_name(slot).eql(class_name)) {
                    defn_pairs = (SubLObject)ConsesLow.cons(expand_class_any_slot_accessors(v_class, slot), defn_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            cdolist_list_var = compiled_class_boolean_slot_access_alist;
            slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (slots.slot_class_name(slot).eql(class_name)) {
                    defn_pairs = (SubLObject)ConsesLow.cons(expand_class_boolean_slot_accessors(v_class, slot), defn_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            cdolist_list_var = defn_pairs;
            SubLObject cons = (SubLObject)classes.NIL;
            cons = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject getter = (SubLObject)classes.NIL;
                SubLObject setter = (SubLObject)classes.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list74);
                getter = current.first();
                current = (setter = current.rest());
                v_defns = (SubLObject)ConsesLow.cons(setter, v_defns);
                v_defns = (SubLObject)ConsesLow.cons(getter, v_defns);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            return v_defns;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 30753L)
    public static SubLObject expand_instance_any_slot_accessors(final SubLObject v_class, final SubLObject slot, SubLObject v_slot_listeners) {
        if (v_slot_listeners == classes.UNPROVIDED) {
            v_slot_listeners = (SubLObject)classes.NIL;
        }
        final SubLObject class_name = subloop_structures.class_name(v_class);
        final SubLObject slot_name = slots.slot_name(slot);
        final SubLObject slot_index = slots.slot_index(slot);
        final SubLObject slot_protection = slots.slot_protection(slot);
        final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
        final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
        final SubLObject access_protection = (SubLObject)SubLObjectFactory.makeBoolean(slot_protection != classes.$kw75$PUBLIC);
        if (classes.NIL != v_slot_listeners) {
            if (classes.NIL != access_protection) {
                return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym78$NEW_VALUE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name)))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, (SubLObject)classes.$kw82$SLOT_GETTER_REGISTRY, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), slot_index, (SubLObject)classes.$list83), (SubLObject)classes.$list84)), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.list((SubLObject)classes.$sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, (SubLObject)classes.$sym87$VALUE, slot_index, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name)), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, (SubLObject)classes.$kw88$SLOT_SETTER_REGISTRY, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), slot_index, (SubLObject)classes.$list85), (SubLObject)classes.$list89));
            }
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym78$NEW_VALUE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym90$SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, (SubLObject)classes.$kw82$SLOT_GETTER_REGISTRY, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), slot_index, (SubLObject)classes.$list83), (SubLObject)classes.$list84)), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.list((SubLObject)classes.$sym91$SUBLOOP_SET_INSTANCE_SLOT, class_name, (SubLObject)classes.$sym87$VALUE, slot_index), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, (SubLObject)classes.$kw88$SLOT_SETTER_REGISTRY, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), slot_index, (SubLObject)classes.$list85), (SubLObject)classes.$list89));
        }
        else {
            if (classes.NIL != access_protection) {
                return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name)))), (SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, (SubLObject)classes.$sym87$VALUE, slot_index, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name)))));
            }
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym90$SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), (SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym91$SUBLOOP_SET_INSTANCE_SLOT, class_name, (SubLObject)classes.$sym87$VALUE, slot_index))));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 33047L)
    public static SubLObject expand_instance_boolean_slot_accessors(final SubLObject v_class, final SubLObject slot) {
        final SubLObject slot_name = slots.slot_name(slot);
        final SubLObject slot_index = slots.slot_index(slot);
        final SubLObject slot_protection = slots.slot_protection(slot);
        final SubLObject slot_byte_spec = bytes.sublisp_byte((SubLObject)classes.ONE_INTEGER, slot_index);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
        final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
        final SubLObject class_var = Symbols.make_symbol((SubLObject)classes.$str93$class);
        final SubLObject slot_var = Symbols.make_symbol((SubLObject)classes.$str94$slot);
        final SubLObject access_protection = (SubLObject)((slot_protection == classes.$kw75$PUBLIC) ? classes.NIL : ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(class_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym95$INSTANCE_CLASS, class_name)), (SubLObject)ConsesLow.list(slot_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym96$SLOT_ASSOC, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_var)))), (SubLObject)ConsesLow.list((SubLObject)classes.$sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT, class_var, class_name, slot_var))));
        if (classes.NIL != access_protection) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), ConsesLow.append(conses_high.copy_list(access_protection), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym99$LDB_TEST, slot_byte_spec, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name)))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), ConsesLow.append(conses_high.copy_list(access_protection), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym101$CSETF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym102$DPB, (SubLObject)classes.$list103, slot_byte_spec, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name))), (SubLObject)classes.$list89))));
        }
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), ConsesLow.append(conses_high.copy_list(access_protection), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym99$LDB_TEST, slot_byte_spec, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name)))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), ConsesLow.append(conses_high.copy_list(access_protection), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym101$CSETF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym102$DPB, (SubLObject)classes.$list103, slot_byte_spec, (SubLObject)ConsesLow.list((SubLObject)classes.$sym100$INSTANCE_BOOLEAN_SLOTS, class_name))), (SubLObject)classes.$list89))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 35254L)
    public static SubLObject expand_class_any_slot_accessors(final SubLObject v_class, final SubLObject slot) {
        final SubLObject slot_name = slots.slot_name(slot);
        final SubLObject slot_index = slots.slot_index(slot);
        final SubLObject slot_protection = slots.slot_protection(slot);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
        final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
        final SubLObject access_protection = (SubLObject)((slot_protection == classes.$kw75$PUBLIC) ? classes.NIL : ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT, (SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym96$SLOT_ASSOC, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), (SubLObject)classes.$list106))));
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym108$SYMBOLP, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym109$CLASSES_RETRIEVE_CLASS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym110$CLASS_P, class_name), class_name, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym111$INSTANCE_P, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym95$INSTANCE_CLASS, class_name), (SubLObject)classes.$list112))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym113$PWHEN, (SubLObject)classes.$sym105$CLASS, ConsesLow.append(conses_high.copy_list(access_protection), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym114$AREF, (SubLObject)classes.$list115, slot_index))))), (SubLObject)classes.$list116)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym108$SYMBOLP, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym109$CLASSES_RETRIEVE_CLASS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym110$CLASS_P, class_name), class_name, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym111$INSTANCE_P, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym95$INSTANCE_CLASS, class_name), (SubLObject)classes.$list112))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym113$PWHEN, (SubLObject)classes.$sym105$CLASS, ConsesLow.append(conses_high.copy_list(access_protection), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym117$SET_AREF, (SubLObject)classes.$list115, slot_index, (SubLObject)classes.$list85))))), (SubLObject)classes.$list116)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 36641L)
    public static SubLObject expand_class_boolean_slot_accessors(final SubLObject v_class, final SubLObject slot) {
        final SubLObject slot_name = slots.slot_name(slot);
        final SubLObject slot_index = slots.slot_index(slot);
        final SubLObject slot_protection = slots.slot_protection(slot);
        final SubLObject slot_byte_spec = bytes.sublisp_byte((SubLObject)classes.ONE_INTEGER, slot_index);
        final SubLObject class_name = subloop_structures.class_name(v_class);
        final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
        final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
        final SubLObject access_protection = (SubLObject)((slot_protection == classes.$kw75$PUBLIC) ? classes.NIL : ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT, (SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym96$SLOT_ASSOC, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), (SubLObject)classes.$list106))));
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, getter_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym108$SYMBOLP, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym109$CLASSES_RETRIEVE_CLASS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym110$CLASS_P, class_name), class_name, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym111$INSTANCE_P, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym95$INSTANCE_CLASS, class_name), (SubLObject)classes.$list112))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym113$PWHEN, (SubLObject)classes.$sym105$CLASS, ConsesLow.append(conses_high.copy_list(access_protection), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym99$LDB_TEST, slot_byte_spec, (SubLObject)classes.$list118))))), (SubLObject)classes.$list116)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, setter_name, reader.bq_cons(class_name, (SubLObject)classes.$list85), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)classes.$sym105$CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym108$SYMBOLP, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym109$CLASSES_RETRIEVE_CLASS, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym110$CLASS_P, class_name), class_name, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym107$FIF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym111$INSTANCE_P, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym95$INSTANCE_CLASS, class_name), (SubLObject)classes.$list112))))), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym113$PWHEN, (SubLObject)classes.$sym105$CLASS, ConsesLow.append(conses_high.copy_list(access_protection), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym101$CSETF, (SubLObject)classes.$list119, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym102$DPB, (SubLObject)classes.$list103, slot_byte_spec, (SubLObject)classes.$list118)), (SubLObject)classes.$list89))), (SubLObject)classes.$list116)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 38144L)
    public static SubLObject expand_class_predicator(final SubLObject class_name) {
        final SubLObject predicate_name = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(class_name), (SubLObject)classes.$str120$_P), (SubLObject)classes.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)classes.$sym76$DEFINE_PUBLIC, predicate_name, (SubLObject)ConsesLow.list(class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym92$RET, (SubLObject)ConsesLow.list((SubLObject)classes.$sym121$SUBLOOP_INSTANCEOF_CLASS, class_name, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 38401L)
    public static SubLObject expand_class_initializer(final SubLObject class_or_class_name) {
        final SubLObject v_class = (classes.NIL != subloop_structures.class_p(class_or_class_name)) ? class_or_class_name : classes_retrieve_class(class_or_class_name);
        final SubLObject class_initializer_name = subloop_structures.class_class_initialization_function(v_class);
        final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
        final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
        SubLObject initializations = (SubLObject)classes.NIL;
        SubLObject slot_name = (SubLObject)classes.NIL;
        SubLObject class_name = (SubLObject)classes.NIL;
        SubLObject value = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = compiled_class_slot_access_alist;
        SubLObject slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            class_name = slots.slot_class_name(slot);
            value = slots.slot_init_value(slot);
            initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym122$SUBLOOP_INITIALIZE_SLOT, (SubLObject)classes.$sym123$NEW_INSTANCE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), conses_high.copy_tree(value)), initializations);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)classes.NIL;
        class_name = (SubLObject)classes.NIL;
        value = (SubLObject)classes.NIL;
        cdolist_list_var = compiled_class_boolean_slot_access_alist;
        slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            class_name = slots.slot_class_name(slot);
            value = slots.slot_init_value(slot);
            initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym122$SUBLOOP_INITIALIZE_SLOT, (SubLObject)classes.$sym123$NEW_INSTANCE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), conses_high.copy_tree(value)), initializations);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)classes.$sym44$PROGN, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym124$DEFINE_PROTECTED, class_initializer_name, (SubLObject)classes.$list125, ConsesLow.append(initializations, (SubLObject)classes.$list116)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_or_class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_initializer_name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 39512L)
    public static SubLObject expand_instance_initializer(final SubLObject class_or_class_name) {
        final SubLObject v_class = (classes.NIL != subloop_structures.class_p(class_or_class_name)) ? class_or_class_name : classes_retrieve_class(class_or_class_name);
        final SubLObject instance_initializer_name = subloop_structures.class_instance_initialization_function(v_class);
        final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
        final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
        SubLObject initializations = (SubLObject)classes.NIL;
        SubLObject slot_name = (SubLObject)classes.NIL;
        SubLObject class_name = (SubLObject)classes.NIL;
        SubLObject value = (SubLObject)classes.NIL;
        SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
        SubLObject slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            class_name = slots.slot_class_name(slot);
            value = slots.slot_init_value(slot);
            initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym122$SUBLOOP_INITIALIZE_SLOT, (SubLObject)classes.$sym123$NEW_INSTANCE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), conses_high.copy_tree(value)), initializations);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        slot_name = (SubLObject)classes.NIL;
        class_name = (SubLObject)classes.NIL;
        value = (SubLObject)classes.NIL;
        cdolist_list_var = compiled_instance_boolean_slot_access_alist;
        slot = (SubLObject)classes.NIL;
        slot = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            slot_name = slots.slot_name(slot);
            class_name = slots.slot_class_name(slot);
            value = slots.slot_init_value(slot);
            initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym122$SUBLOOP_INITIALIZE_SLOT, (SubLObject)classes.$sym123$NEW_INSTANCE, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_name), conses_high.copy_tree(value)), initializations);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)classes.$sym44$PROGN, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym124$DEFINE_PROTECTED, instance_initializer_name, (SubLObject)classes.$list125, ConsesLow.append(initializations, (SubLObject)classes.$list116)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_or_class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, instance_initializer_name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 40659L)
    public static SubLObject expand_define_class(final SubLObject class_name, final SubLObject class_properties, final SubLObject slot_decls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !class_name.isSymbol()) {
            Errors.error((SubLObject)classes.$str128$___S_is_not_a_valid_class_name_, class_name);
        }
        class_properties_must_be_valid(class_properties);
        if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == classes_valid_instance_var_decls_p(slot_decls)) {
            Errors.error((SubLObject)classes.$str129$___S_is_not_a_valid_member_variab, slot_decls);
        }
        final SubLObject parent_class = classes_getf(class_properties, (SubLObject)classes.$kw69$EXTENDS);
        SubLObject parent_interfaces = classes_getf(class_properties, (SubLObject)classes.$kw72$IMPLEMENTS);
        final SubLObject slot_properties = classes_implement_slot_listeners_p(class_properties);
        SubLObject v_class = (SubLObject)classes.NIL;
        if (parent_interfaces.isSymbol() && classes.NIL != parent_interfaces) {
            parent_interfaces = (SubLObject)ConsesLow.list(parent_interfaces);
        }
        v_class = new_class(class_name, parent_class, parent_interfaces, slot_decls);
        class_set_implements_slot_listeners(v_class, slot_properties);
        SubLObject expanded_definition = (SubLObject)classes.NIL;
        final SubLObject expanded_class_initializer = expand_class_initializer(class_name);
        final SubLObject expanded_instance_initializer = expand_instance_initializer(class_name);
        final SubLObject _prev_bind_0 = classes.$classes_new_class_current$.currentBinding(thread);
        try {
            classes.$classes_new_class_current$.bind(class_name, thread);
            if (classes.NIL != slot_properties) {
                expanded_definition = (SubLObject)ConsesLow.listS((SubLObject)classes.$sym44$PROGN, (SubLObject)ConsesLow.list((SubLObject)classes.$sym130$SUBLOOP_NEW_CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, parent_class), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, parent_interfaces), (SubLObject)((classes.NIL != classes_getf(class_properties, (SubLObject)classes.$kw131$ABSTRACT)) ? classes.T : classes.NIL), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_decls)), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)classes.$list133), ConsesLow.append(expand_accessors_for_class(class_name, (SubLObject)classes.T), expand_interface_method_instantiations(class_name), (SubLObject)ConsesLow.list(expanded_class_initializer, expanded_instance_initializer, expand_class_predicator(class_name), (SubLObject)ConsesLow.list(conses_high.cadr(conses_high.second(expanded_class_initializer)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name)))));
            }
            else {
                expanded_definition = (SubLObject)ConsesLow.listS((SubLObject)classes.$sym44$PROGN, (SubLObject)ConsesLow.list((SubLObject)classes.$sym130$SUBLOOP_NEW_CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, parent_class), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, parent_interfaces), (SubLObject)((classes.NIL != classes_getf(class_properties, (SubLObject)classes.$kw131$ABSTRACT)) ? classes.T : classes.NIL), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, slot_decls)), (SubLObject)ConsesLow.listS((SubLObject)classes.$sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name), (SubLObject)classes.$list112), ConsesLow.append(expand_accessors_for_class(class_name, (SubLObject)classes.UNPROVIDED), expand_interface_method_instantiations(class_name), (SubLObject)ConsesLow.list(expanded_class_initializer, expanded_instance_initializer, expand_class_predicator(class_name), (SubLObject)ConsesLow.list(conses_high.cadr(conses_high.second(expanded_class_initializer)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym80$QUOTE, class_name)))));
            }
        }
        finally {
            classes.$classes_new_class_current$.rebind(_prev_bind_0, thread);
        }
        return expanded_definition;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 42971L)
    public static SubLObject define_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject class_name_and_properties = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list134);
        class_name_and_properties = current.first();
        final SubLObject slot_decls;
        current = (slot_decls = current.rest());
        SubLObject current_$6;
        final SubLObject datum_$5 = current_$6 = class_name_and_properties;
        SubLObject class_name = (SubLObject)classes.NIL;
        SubLObject class_properties = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)classes.$list135);
        class_name = current_$6.first();
        current_$6 = (class_properties = current_$6.rest());
        final SubLObject class_structure = new_class(class_name, classes_getf(class_properties, (SubLObject)classes.$kw69$EXTENDS), classes_getf(class_properties, (SubLObject)classes.$kw72$IMPLEMENTS), slot_decls);
        subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, classes_getf(class_properties, (SubLObject)classes.$kw131$ABSTRACT));
        return expand_define_class(class_name, class_properties, slot_decls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 43479L)
    public static SubLObject subloop_new_class(final SubLObject class_name, final SubLObject parent_class, final SubLObject parent_interfaces, final SubLObject abstract_p, final SubLObject slot_decls) {
        final SubLObject class_structure = new_class(class_name, parent_class, parent_interfaces, slot_decls);
        subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, abstract_p);
        return class_structure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 43850L)
    public static SubLObject subloop_initialize_slot(final SubLObject v_object, final SubLObject class_name, final SubLObject slot_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = classes_retrieve_class(class_name);
        final SubLObject setter = classes_retrieve_slot_setter(v_class, slot_name);
        final SubLObject _prev_bind_0 = classes.$curclass$.currentBinding(thread);
        try {
            classes.$curclass$.bind(v_class, thread);
            Functions.funcall(setter, v_object, value);
        }
        finally {
            classes.$curclass$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 44138L)
    public static SubLObject subloop_note_class_initialization_function(final SubLObject class_name, final SubLObject class_initializer_name) {
        final SubLObject v_class = classes_retrieve_class(class_name);
        subloop_structures._csetf_class_class_initialization_function(v_class, class_initializer_name);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 44410L)
    public static SubLObject subloop_note_instance_initialization_function(final SubLObject class_name, final SubLObject instance_initializer_name) {
        final SubLObject v_class = classes_retrieve_class(class_name);
        subloop_structures._csetf_class_instance_initialization_function(v_class, instance_initializer_name);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 44694L)
    public static SubLObject subloop_instanceof_class(final SubLObject v_object, final SubLObject v_class) {
        if (classes.NIL != subloop_structures.instance_p(v_object)) {
            final SubLObject direct_class = subloop_structures.instance_class(v_object);
            SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(direct_class);
            SubLObject superclass = (SubLObject)classes.NIL;
            superclass = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (v_class.eql(subloop_structures.class_name(superclass))) {
                    return (SubLObject)classes.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                superclass = cdolist_list_var.first();
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 44994L)
    public static SubLObject subloop_get_instance_slot(final SubLObject v_object, final SubLObject slot_index) {
        return Vectors.aref(subloop_structures.instance_any_slots(v_object), slot_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 45141L)
    public static SubLObject subloop_get_access_protected_instance_slot(final SubLObject v_object, final SubLObject slot_index, final SubLObject slot_name) {
        final SubLObject v_class = subloop_structures.instance_class(v_object);
        final SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, v_object, slot);
        return subloop_get_instance_slot(v_object, slot_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 45502L)
    public static SubLObject subloop_set_instance_slot(final SubLObject v_object, final SubLObject value, final SubLObject slot_index) {
        Vectors.set_aref(subloop_structures.instance_any_slots(v_object), slot_index, value);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 45673L)
    public static SubLObject subloop_set_access_protected_instance_slot(final SubLObject v_object, final SubLObject value, final SubLObject slot_index, final SubLObject slot_name) {
        final SubLObject v_class = subloop_structures.instance_class(v_object);
        final SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, v_object, slot);
        return subloop_set_instance_slot(v_object, value, slot_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 46046L)
    public static SubLObject classes_compile_inheritance_path(final SubLObject class_name_or_class, SubLObject recompile) {
        if (recompile == classes.UNPROVIDED) {
            recompile = (SubLObject)classes.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = (SubLObject)((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : (class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL));
        if (classes.NIL != v_class) {
            if (classes.NIL == recompile) {
                final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
                if (classes.NIL != compiled_inheritance_path) {
                    return compiled_inheritance_path;
                }
            }
            final SubLObject parent = subloop_structures.class_parent(v_class);
            final SubLObject parent_inheritance_path = (SubLObject)((classes.NIL != parent) ? classes_compile_inheritance_path(parent, (SubLObject)classes.NIL) : classes.NIL);
            final SubLObject inheritance_path = (SubLObject)ConsesLow.cons(v_class, parent_inheritance_path);
            if (classes.NIL != parent) {
                final SubLObject parent_class = classes_retrieve_class(parent);
                final SubLObject class_name = subloop_structures.class_name(v_class);
                if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == parent_class) {
                    Errors.error((SubLObject)classes.$str71$__Attempting_to_subclass_unknown_, parent);
                }
                if (classes.NIL == conses_high.member(class_name, subloop_structures.class_subclasses(parent_class), Symbols.symbol_function((SubLObject)classes.EQ), (SubLObject)classes.UNPROVIDED)) {
                    subloop_structures._csetf_class_subclasses(parent_class, (SubLObject)ConsesLow.cons(class_name, subloop_structures.class_subclasses(parent_class)));
                }
            }
            subloop_structures._csetf_class_compiled_inheritance_path(v_class, inheritance_path);
            return inheritance_path;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 47205L)
    public static SubLObject classes_instance_slot_index(final SubLObject v_class, final SubLObject slot_name) {
        return slots.find_slot_index(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 47355L)
    public static SubLObject classes_boolean_slot_decl_p(final SubLObject slot_decl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(slot_decl.isCons() && classes.NIL != conses_high.member((SubLObject)classes.$kw137$BOOLEAN, slot_decl.rest(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 47486L)
    public static SubLObject classes_class_slot_decl_p(final SubLObject slot_decl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(slot_decl.isCons() && classes.NIL != conses_high.member((SubLObject)classes.$kw138$CLASS, slot_decl.rest(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 47613L)
    public static SubLObject classes_instance_slot_decl_p(final SubLObject slot_decl) {
        return (SubLObject)SubLObjectFactory.makeBoolean((slot_decl.isCons() && (classes.NIL != conses_high.member((SubLObject)classes.$kw139$INSTANCE, slot_decl.rest(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED) || classes.NIL == conses_high.member((SubLObject)classes.$kw138$CLASS, slot_decl.rest(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED))) || slot_decl.isSymbol());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 47830L)
    public static SubLObject classes_protection_level_of_slot_decl(final SubLObject slot_decl) {
        if (!slot_decl.isCons()) {
            return (SubLObject)classes.$kw75$PUBLIC;
        }
        final SubLObject v_properties = slot_decl.rest();
        if (!v_properties.isCons()) {
            return (SubLObject)classes.$kw75$PUBLIC;
        }
        if (classes.NIL != conses_high.member((SubLObject)classes.$kw140$PRIVATE, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) {
            return (SubLObject)classes.$kw140$PRIVATE;
        }
        if (classes.NIL != conses_high.member((SubLObject)classes.$kw141$PROTECTED, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) {
            return (SubLObject)classes.$kw141$PROTECTED;
        }
        if (classes.NIL != conses_high.member((SubLObject)classes.$kw75$PUBLIC, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) {
            return (SubLObject)classes.$kw75$PUBLIC;
        }
        return (SubLObject)classes.$kw75$PUBLIC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 48245L)
    public static SubLObject classes_essential_slot_p(final SubLObject slot_decl) {
        if (!slot_decl.isCons()) {
            return (SubLObject)classes.NIL;
        }
        final SubLObject v_properties = slot_decl.rest();
        if (v_properties.isCons()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(classes.NIL != conses_high.member((SubLObject)classes.$kw142$ESSENTIAL, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED) && classes.NIL == conses_high.member((SubLObject)classes.$kw143$NON_ESSENTIAL, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED));
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 48529L)
    public static SubLObject classes_value_of_slot_decl(final SubLObject slot_decl) {
        if (!slot_decl.isCons()) {
            return (SubLObject)classes.NIL;
        }
        final SubLObject v_properties = slot_decl.rest();
        if (!v_properties.isCons()) {
            return (SubLObject)classes.NIL;
        }
        final SubLObject value_sublist = conses_high.member((SubLObject)classes.$kw11$VALUE, v_properties, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED);
        if (classes.NIL == value_sublist) {
            return (SubLObject)classes.NIL;
        }
        if (value_sublist.rest().isCons()) {
            return conses_high.cadr(value_sublist);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 48904L)
    public static SubLObject classes_slot_name_given_slot_decl(final SubLObject slot_decl) {
        return (SubLObject)(slot_decl.isSymbol() ? slot_decl : (slot_decl.isCons() ? (slot_decl.first().isSymbol() ? slot_decl.first() : classes.NIL) : classes.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 49124L)
    public static SubLObject classes_compile_instance_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile) {
        if (recompile == classes.UNPROVIDED) {
            recompile = (SubLObject)classes.T;
        }
        final SubLObject v_class = (SubLObject)((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : (class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL));
        final SubLObject class_name = (SubLObject)((classes.NIL != v_class) ? subloop_structures.class_name(v_class) : classes.NIL);
        if (classes.NIL != v_class) {
            if (classes.NIL == recompile) {
                final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
                if (classes.NIL != compiled_instance_slot_access_alist) {
                    return compiled_instance_slot_access_alist;
                }
            }
            final SubLObject parent = subloop_structures.class_parent(v_class);
            SubLObject parent_instance_slot_access_list = (SubLObject)((classes.NIL != parent) ? classes_compile_instance_slot_access_list(parent, (SubLObject)classes.NIL) : classes.NIL);
            SubLObject last_index = (SubLObject)((classes.NIL != parent_instance_slot_access_list) ? slots.slot_index(parent_instance_slot_access_list.first()) : classes.MINUS_ONE_INTEGER);
            SubLObject instance_var = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
            SubLObject decl = (SubLObject)classes.NIL;
            decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_boolean_slot_decl_p(decl)) {
                    instance_var = classes_slot_name_given_slot_decl(decl);
                    if (classes.NIL != instance_var) {
                        if (classes.NIL == slots.slot_assoc(instance_var, parent_instance_slot_access_list)) {
                            last_index = Numbers.add(last_index, (SubLObject)classes.ONE_INTEGER);
                            parent_instance_slot_access_list = (SubLObject)ConsesLow.cons(slots.new_slot(instance_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_instance_slot_access_list);
                        }
                        else {
                            slots.set_slot_init_value(instance_var, parent_instance_slot_access_list, classes_value_of_slot_decl(decl));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl = cdolist_list_var.first();
            }
            subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, parent_instance_slot_access_list);
            return parent_instance_slot_access_list;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 51176L)
    public static SubLObject classes_compile_instance_boolean_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile) {
        if (recompile == classes.UNPROVIDED) {
            recompile = (SubLObject)classes.T;
        }
        final SubLObject v_class = (SubLObject)((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : (class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL));
        final SubLObject class_name = (SubLObject)((classes.NIL != v_class) ? subloop_structures.class_name(v_class) : classes.NIL);
        if (classes.NIL != v_class) {
            if (classes.NIL == recompile) {
                final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
                if (classes.NIL != compiled_instance_boolean_slot_access_alist) {
                    return compiled_instance_boolean_slot_access_alist;
                }
            }
            final SubLObject parent = subloop_structures.class_parent(v_class);
            SubLObject parent_instance_boolean_slot_access_list = (SubLObject)((classes.NIL != parent) ? classes_compile_instance_boolean_slot_access_list(parent, (SubLObject)classes.NIL) : classes.NIL);
            SubLObject last_index = (SubLObject)((classes.NIL != parent_instance_boolean_slot_access_list) ? slots.slot_index(parent_instance_boolean_slot_access_list.first()) : classes.MINUS_ONE_INTEGER);
            SubLObject instance_var = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
            SubLObject decl = (SubLObject)classes.NIL;
            decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != classes_boolean_slot_decl_p(decl)) {
                    instance_var = classes_slot_name_given_slot_decl(decl);
                    if (classes.NIL != instance_var) {
                        if (classes.NIL == slots.slot_assoc(instance_var, parent_instance_boolean_slot_access_list)) {
                            last_index = Numbers.add(last_index, (SubLObject)classes.ONE_INTEGER);
                            parent_instance_boolean_slot_access_list = (SubLObject)ConsesLow.cons(slots.new_slot(instance_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_instance_boolean_slot_access_list);
                        }
                        else {
                            slots.set_slot_init_value(instance_var, parent_instance_boolean_slot_access_list, classes_value_of_slot_decl(decl));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl = cdolist_list_var.first();
            }
            subloop_structures._csetf_class_compiled_instance_boolean_slot_access_alist(v_class, parent_instance_boolean_slot_access_list);
            return parent_instance_boolean_slot_access_list;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 53314L)
    public static SubLObject classes_compile_class_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile) {
        if (recompile == classes.UNPROVIDED) {
            recompile = (SubLObject)classes.T;
        }
        final SubLObject v_class = (SubLObject)((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : (class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL));
        final SubLObject class_name = (SubLObject)((classes.NIL != v_class) ? subloop_structures.class_name(v_class) : classes.NIL);
        if (classes.NIL != v_class) {
            if (classes.NIL == recompile) {
                final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
                if (classes.NIL != compiled_class_slot_access_alist) {
                    return compiled_class_slot_access_alist;
                }
            }
            final SubLObject parent = subloop_structures.class_parent(v_class);
            SubLObject parent_class_slot_access_list = (SubLObject)((classes.NIL != parent) ? classes_compile_class_slot_access_list(parent, (SubLObject)classes.NIL) : classes.NIL);
            SubLObject last_index = (SubLObject)((classes.NIL != parent_class_slot_access_list) ? slots.slot_index(parent_class_slot_access_list.first()) : classes.MINUS_ONE_INTEGER);
            SubLObject class_var = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
            SubLObject decl = (SubLObject)classes.NIL;
            decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL == classes_boolean_slot_decl_p(decl)) {
                    class_var = classes_slot_name_given_slot_decl(decl);
                    if (classes.NIL != class_var && classes.NIL == slots.slot_assoc(class_var, parent_class_slot_access_list)) {
                        last_index = Numbers.add(last_index, (SubLObject)classes.ONE_INTEGER);
                        parent_class_slot_access_list = (SubLObject)ConsesLow.cons(slots.new_slot(class_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_class_slot_access_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl = cdolist_list_var.first();
            }
            subloop_structures._csetf_class_compiled_class_slot_access_alist(v_class, parent_class_slot_access_list);
            return parent_class_slot_access_list;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 54824L)
    public static SubLObject classes_compile_class_boolean_slot_access_list(final SubLObject class_name_or_class, SubLObject recompile) {
        if (recompile == classes.UNPROVIDED) {
            recompile = (SubLObject)classes.T;
        }
        final SubLObject v_class = (SubLObject)((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : (class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL));
        final SubLObject class_name = (SubLObject)((classes.NIL != v_class) ? subloop_structures.class_name(v_class) : classes.NIL);
        if (classes.NIL != v_class) {
            if (classes.NIL == recompile) {
                final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
                if (classes.NIL != compiled_class_boolean_slot_access_alist) {
                    return compiled_class_boolean_slot_access_alist;
                }
            }
            final SubLObject parent = subloop_structures.class_parent(v_class);
            SubLObject parent_class_boolean_slot_access_list = (SubLObject)((classes.NIL != parent) ? classes_compile_class_boolean_slot_access_list(parent, (SubLObject)classes.NIL) : classes.NIL);
            SubLObject last_index = (SubLObject)((classes.NIL != parent_class_boolean_slot_access_list) ? slots.slot_index(parent_class_boolean_slot_access_list.first()) : classes.MINUS_ONE_INTEGER);
            SubLObject class_var = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
            SubLObject decl = (SubLObject)classes.NIL;
            decl = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != classes_boolean_slot_decl_p(decl)) {
                    class_var = classes_slot_name_given_slot_decl(decl);
                    if (classes.NIL != class_var && classes.NIL == slots.slot_assoc(class_var, parent_class_boolean_slot_access_list)) {
                        last_index = Numbers.add(last_index, (SubLObject)classes.ONE_INTEGER);
                        parent_class_boolean_slot_access_list = (SubLObject)ConsesLow.cons(slots.new_slot(class_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_class_boolean_slot_access_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl = cdolist_list_var.first();
            }
            subloop_structures._csetf_class_compiled_class_boolean_slot_access_alist(v_class, parent_class_boolean_slot_access_list);
            return parent_class_boolean_slot_access_list;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 56451L)
    public static SubLObject classes_initialize_class_slots(final SubLObject class_name_or_class) {
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject boolean_slot_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
            final SubLObject boolean_slot_count = Sequences.length(boolean_slot_alist);
            final SubLObject boolean_slot_vector = (SubLObject)(boolean_slot_count.numG((SubLObject)classes.ZERO_INTEGER) ? classes.ZERO_INTEGER : classes.NIL);
            final SubLObject any_slot_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
            final SubLObject any_slot_count = Sequences.length(any_slot_alist);
            final SubLObject any_slot_vector = (SubLObject)(any_slot_count.numG((SubLObject)classes.ZERO_INTEGER) ? Vectors.make_vector(any_slot_count, (SubLObject)classes.UNPROVIDED) : classes.NIL);
            if (classes.NIL != any_slot_vector) {
                SubLObject i;
                for (i = (SubLObject)classes.NIL, i = (SubLObject)classes.ZERO_INTEGER; i.numL(any_slot_count); i = Numbers.add(i, (SubLObject)classes.ONE_INTEGER)) {
                    Vectors.set_aref(any_slot_vector, i, (SubLObject)classes.NIL);
                }
            }
            subloop_structures._csetf_class_boolean_slots(v_class, boolean_slot_vector);
            subloop_structures._csetf_class_any_slots(v_class, any_slot_vector);
            return v_class;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 57336L)
    public static SubLObject superclassp(final SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2) {
        final SubLObject class1 = class_name_or_class_1.isSymbol() ? classes_retrieve_class(class_name_or_class_1) : class_name_or_class_1;
        final SubLObject class2 = class_name_or_class_2.isSymbol() ? classes_retrieve_class(class_name_or_class_2) : class_name_or_class_2;
        if (classes.NIL != subloop_structures.class_p(class1) && classes.NIL != subloop_structures.class_p(class2)) {
            final SubLObject class1_name = subloop_structures.class_name(class1);
            SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(class2);
            SubLObject parent_class = (SubLObject)classes.NIL;
            parent_class = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (class1_name.eql(subloop_structures.class_name(parent_class))) {
                    return (SubLObject)classes.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_class = cdolist_list_var.first();
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 57938L)
    public static SubLObject subclassp(final SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2) {
        return superclassp(class_name_or_class_2, class_name_or_class_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 58601L)
    public static SubLObject classes_access_check_class_slot(final SubLObject v_class, final SubLObject slot) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = slots.slot_protection(slot);
        if (pcase_var.eql((SubLObject)classes.$kw141$PROTECTED)) {
            if (classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes.NIL == conses_high.member(slots.slot_class_name(slot), subloop_structures.class_compiled_inheritance_path(v_class), Symbols.symbol_function((SubLObject)classes.EQ), Symbols.symbol_function((SubLObject)classes.$sym144$CLASS_NAME))) {
                Errors.error(classes.$classes_class_slot_access_violation$.getGlobalValue(), (SubLObject)classes.$kw141$PROTECTED, slots.slot_name(slot), subloop_structures.class_name(v_class));
            }
        }
        else if (pcase_var.eql((SubLObject)classes.$kw140$PRIVATE) && classes.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !subloop_structures.class_name(v_class).eql(slots.slot_class_name(slot))) {
            Errors.error(classes.$classes_class_slot_access_violation$.getGlobalValue(), (SubLObject)classes.$kw140$PRIVATE, slots.slot_name(slot), subloop_structures.class_name(v_class));
        }
        return (SubLObject)classes.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 59108L)
    public static SubLObject get_class_slot(final SubLObject v_class, final SubLObject slot_name) {
        SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
        if (classes.NIL != association) {
            classes_access_check_class_slot(v_class, association);
            return Vectors.aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association));
        }
        association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
        if (classes.NIL != association) {
            classes_access_check_class_slot(v_class, association);
            return ldb_test(bytes.sublisp_byte((SubLObject)classes.ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class));
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 59703L)
    public static SubLObject set_class_slot(final SubLObject v_class, final SubLObject slot_name, final SubLObject value) {
        SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
        if (classes.NIL != association) {
            classes_access_check_class_slot(v_class, association);
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association), value);
        }
        association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
        if (classes.NIL != association) {
            classes_access_check_class_slot(v_class, association);
            subloop_structures._csetf_class_boolean_slots(v_class, bytes.dpb((SubLObject)((classes.NIL != value) ? classes.ONE_INTEGER : classes.ZERO_INTEGER), bytes.sublisp_byte((SubLObject)classes.ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class)));
            return value;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 60379L)
    public static SubLObject classes_shadowed_association(final SubLObject target_key, final SubLObject alist) {
        SubLObject count = (SubLObject)classes.ZERO_INTEGER;
        SubLObject cdolist_list_var = alist;
        SubLObject association = (SubLObject)classes.NIL;
        association = cdolist_list_var.first();
        while (classes.NIL != cdolist_list_var) {
            if (association.first().eql(target_key)) {
                if (count.numE((SubLObject)classes.ONE_INTEGER)) {
                    return association;
                }
                count = Numbers.add(count, (SubLObject)classes.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            association = cdolist_list_var.first();
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 60620L)
    public static SubLObject classes_all_class_slots(final SubLObject class_name_or_class, SubLObject access_level) {
        if (access_level == classes.UNPROVIDED) {
            access_level = (SubLObject)classes.$kw140$PRIVATE;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$7 = v_class;
            final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$7);
            final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$7);
            SubLObject v_slots = (SubLObject)classes.NIL;
            SubLObject slot_name = (SubLObject)classes.NIL;
            SubLObject protection = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = compiled_class_slot_access_alist;
            SubLObject slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                slot_name = slots.slot_name(slot);
                protection = slots.slot_protection(slot);
                if (classes.NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
                    v_slots = (SubLObject)ConsesLow.cons(slot_name, v_slots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            slot_name = (SubLObject)classes.NIL;
            protection = (SubLObject)classes.NIL;
            cdolist_list_var = compiled_class_boolean_slot_access_alist;
            slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                slot_name = slots.slot_name(slot);
                protection = slots.slot_protection(slot);
                if (classes.NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
                    v_slots = (SubLObject)ConsesLow.cons(slot_name, v_slots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            return Sequences.nreverse(v_slots);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 61360L)
    public static SubLObject classes_all_instance_slots(final SubLObject class_name_or_class, SubLObject access_level) {
        if (access_level == classes.UNPROVIDED) {
            access_level = (SubLObject)classes.$kw140$PRIVATE;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$8 = v_class;
            final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$8);
            final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$8);
            SubLObject v_slots = (SubLObject)classes.NIL;
            SubLObject slot_name = (SubLObject)classes.NIL;
            SubLObject protection = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
            SubLObject slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                slot_name = slots.slot_name(slot);
                protection = slots.slot_protection(slot);
                if (classes.NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
                    v_slots = (SubLObject)ConsesLow.cons(slot_name, v_slots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            slot_name = (SubLObject)classes.NIL;
            protection = (SubLObject)classes.NIL;
            cdolist_list_var = compiled_instance_boolean_slot_access_alist;
            slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                slot_name = slots.slot_name(slot);
                protection = slots.slot_protection(slot);
                if (classes.NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
                    v_slots = (SubLObject)ConsesLow.cons(slot_name, v_slots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            return Sequences.nreverse(v_slots);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 62109L)
    public static SubLObject classes_all_any_instance_slots(final SubLObject class_name_or_class, SubLObject access_level) {
        if (access_level == classes.UNPROVIDED) {
            access_level = (SubLObject)classes.$kw140$PRIVATE;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            final SubLObject v_class_$9 = v_class;
            final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$9);
            SubLObject v_slots = (SubLObject)classes.NIL;
            SubLObject slot_name = (SubLObject)classes.NIL;
            SubLObject protection = (SubLObject)classes.NIL;
            SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
            SubLObject slot = (SubLObject)classes.NIL;
            slot = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                slot_name = slots.slot_name(slot);
                protection = slots.slot_protection(slot);
                if (classes.NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
                    v_slots = (SubLObject)ConsesLow.cons(slot_name, v_slots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot = cdolist_list_var.first();
            }
            return Sequences.nreverse(v_slots);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 62658L)
    public static SubLObject classes_all_slots(final SubLObject class_name_or_class, SubLObject access_level) {
        if (access_level == classes.UNPROVIDED) {
            access_level = (SubLObject)classes.$kw140$PRIVATE;
        }
        final SubLObject v_class = class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            return ConsesLow.nconc(classes_all_class_slots(v_class, access_level), classes_all_instance_slots(v_class, access_level));
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 63042L)
    public static SubLObject class_get_property_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes.NIL;
        SubLObject indicator = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list145);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list145);
        indicator = current.first();
        current = current.rest();
        if (classes.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)classes.$sym146$CLASSES_GETF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym147$CLASS_PLIST, v_class), indicator);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes.$list145);
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 63166L)
    public static SubLObject class_get_property(final SubLObject v_class, final SubLObject indicator) {
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            return classes_getf(subloop_structures.class_plist(v_class), indicator);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 63314L)
    public static SubLObject class_set_property_internal(final SubLObject v_class, final SubLObject indicator, final SubLObject value) {
        final SubLObject class_var = Symbols.make_symbol((SubLObject)classes.$str93$class);
        return (SubLObject)ConsesLow.list((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(class_var, v_class)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym101$CSETF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym147$CLASS_PLIST, class_var), (SubLObject)ConsesLow.list((SubLObject)classes.$sym148$CLASSES_PUTF, (SubLObject)ConsesLow.list((SubLObject)classes.$sym147$CLASS_PLIST, class_var), indicator, value)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 63572L)
    public static SubLObject class_set_property(final SubLObject v_class, final SubLObject indicator, final SubLObject value) {
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            class_set_property_internal(v_class, indicator, value);
            return value;
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 63742L)
    public static SubLObject class_implements_slot_listeners_p(final SubLObject class_name_or_class) {
        if (classes.NIL != subloop_structures.class_p(class_name_or_class)) {
            return class_get_property(class_name_or_class, (SubLObject)classes.$kw149$IMPLEMENTS_SLOT_LISTENERS);
        }
        final SubLObject v_class = (SubLObject)(class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL);
        if (classes.NIL != v_class) {
            return class_get_property(v_class, (SubLObject)classes.$kw149$IMPLEMENTS_SLOT_LISTENERS);
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 64151L)
    public static SubLObject class_set_implements_slot_listeners(final SubLObject class_name_or_class, final SubLObject boolean_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)classes.NIL;
        final SubLObject _prev_bind_0 = classes.$classes_new_class_current$.currentBinding(thread);
        try {
            classes.$classes_new_class_current$.bind((classes.NIL != subloop_structures.class_p(class_name_or_class)) ? subloop_structures.class_name(class_name_or_class) : class_name_or_class, thread);
            if (classes.NIL != subloop_structures.class_p(class_name_or_class)) {
                result = class_set_property(class_name_or_class, (SubLObject)classes.$kw149$IMPLEMENTS_SLOT_LISTENERS, boolean_value);
            }
            else {
                final SubLObject v_class = (SubLObject)(class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : classes.NIL);
                if (classes.NIL != v_class) {
                    result = class_set_property(v_class, (SubLObject)classes.$kw149$IMPLEMENTS_SLOT_LISTENERS, boolean_value);
                }
                else {
                    result = (SubLObject)classes.NIL;
                }
            }
        }
        finally {
            classes.$classes_new_class_current$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 64819L)
    public static SubLObject classes_implements_p(final SubLObject target_class, final SubLObject parent_interface) {
        final SubLObject true_class = (SubLObject)((classes.NIL != subloop_structures.class_p(target_class)) ? target_class : ((classes.NIL != target_class && target_class.isSymbol()) ? classes_retrieve_class(target_class) : classes.NIL));
        final SubLObject true_interface = (SubLObject)((classes.NIL != subloop_structures.interface_p(parent_interface)) ? parent_interface : ((classes.NIL != parent_interface && parent_interface.isSymbol()) ? interfaces.interfaces_retrieve_interface(parent_interface) : classes.NIL));
        if (classes.NIL != true_class && classes.NIL != true_interface) {
            final SubLObject v_class = true_class;
            final SubLObject v_interfaces = subloop_structures.class_interfaces(v_class);
            final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
            if (classes.NIL != conses_high.member(true_interface, v_interfaces, (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED)) {
                return (SubLObject)classes.T;
            }
            SubLObject cdolist_list_var = v_interfaces;
            SubLObject v_interface = (SubLObject)classes.NIL;
            v_interface = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != interfaces.interfaces_implements_p(v_interface, true_interface)) {
                    return (SubLObject)classes.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_interface = cdolist_list_var.first();
            }
            cdolist_list_var = compiled_inheritance_path.rest();
            SubLObject parent_class = (SubLObject)classes.NIL;
            parent_class = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                if (classes.NIL != classes_implements_p(parent_class, true_interface)) {
                    return (SubLObject)classes.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_class = cdolist_list_var.first();
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 65703L)
    public static SubLObject classes_get_slot(final SubLObject v_class, final SubLObject slot_name) {
        if (classes.NIL != subloop_structures.class_p(v_class)) {
            SubLObject association = (SubLObject)classes.NIL;
            association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
            if (classes.NIL != association) {
                return association;
            }
            association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            if (classes.NIL != association) {
                return association;
            }
            association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
            if (classes.NIL != association) {
                return association;
            }
            association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
            if (classes.NIL != association) {
                return association;
            }
        }
        return (SubLObject)classes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 66394L)
    public static SubLObject do_classes_in_order(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list150);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)classes.NIL;
        SubLObject base_class = (SubLObject)classes.NIL;
        SubLObject listed_optional_depth_var = (SubLObject)classes.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list150);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes.$list150);
        base_class = current.first();
        current = (listed_optional_depth_var = current.rest());
        final SubLObject forms;
        current = (forms = temp);
        classes_utilities.classes_check_do_classes_in_order_parameters(var, base_class, listed_optional_depth_var, forms);
        final SubLObject stack_var = Symbols.make_symbol((SubLObject)classes.$str151$stack);
        final SubLObject stack_element_var = Symbols.make_symbol((SubLObject)classes.$str152$stack_element);
        final SubLObject actual_class_var = Symbols.make_symbol((SubLObject)classes.$str153$actual_class);
        final SubLObject current_depth_var = (classes.NIL != listed_optional_depth_var) ? listed_optional_depth_var.first() : Symbols.make_symbol((SubLObject)classes.$str154$current_depth);
        return (SubLObject)ConsesLow.list((SubLObject)classes.$sym77$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(stack_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym155$LIST, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym156$CONS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym109$CLASSES_RETRIEVE_CLASS, base_class), (SubLObject)classes.$list157))), current_depth_var, stack_element_var, actual_class_var, var), (SubLObject)ConsesLow.list((SubLObject)classes.$sym158$WHILE, stack_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym159$CSETQ, stack_element_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym61$CAR, stack_var)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym160$CPOP, stack_var), (SubLObject)ConsesLow.list((SubLObject)classes.$sym159$CSETQ, current_depth_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym161$CDR, stack_element_var)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym159$CSETQ, actual_class_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym61$CAR, stack_element_var)), (SubLObject)ConsesLow.list((SubLObject)classes.$sym113$PWHEN, actual_class_var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym159$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)classes.$sym144$CLASS_NAME, actual_class_var)), reader.bq_cons((SubLObject)classes.$sym44$PROGN, forms), (SubLObject)ConsesLow.list((SubLObject)classes.$sym77$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)classes.$sym162$NEXT_DEPTH, (SubLObject)ConsesLow.listS((SubLObject)classes.$sym163$_, current_depth_var, (SubLObject)classes.$list164)), (SubLObject)classes.$list165), (SubLObject)ConsesLow.list((SubLObject)classes.$sym166$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)classes.$sym167$CHILD_CLASS, (SubLObject)ConsesLow.list((SubLObject)classes.$sym168$CLASS_SUBCLASSES, actual_class_var)), (SubLObject)classes.$list169, (SubLObject)ConsesLow.list((SubLObject)classes.$sym113$PWHEN, (SubLObject)classes.$sym170$ACTUAL_CHILD, (SubLObject)ConsesLow.list((SubLObject)classes.$sym171$CPUSH, (SubLObject)classes.$list172, stack_var)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 67604L)
    public static SubLObject classes_tab_to_depth(final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)classes.$str173$__);
        SubLObject i;
        for (i = (SubLObject)classes.NIL, i = (SubLObject)classes.ZERO_INTEGER; i.numL(depth); i = Numbers.add(i, (SubLObject)classes.ONE_INTEGER)) {
            PrintLow.format(stream, (SubLObject)classes.$str174$__);
        }
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 67739L)
    public static SubLObject classes_display_class_name_at_depth(final SubLObject stream, final SubLObject class_name, final SubLObject depth) {
        classes_tab_to_depth(stream, depth);
        PrintLow.format(stream, (SubLObject)classes.$str175$_S_, class_name);
        return class_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 67911L)
    public static SubLObject classes_display_hierarchy(final SubLObject base_class_symbolic_name, SubLObject stream) {
        if (stream == classes.UNPROVIDED) {
            stream = (SubLObject)classes.T;
        }
        SubLObject stack = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(classes_retrieve_class(base_class_symbolic_name), (SubLObject)classes.ZERO_INTEGER));
        SubLObject depth = (SubLObject)classes.NIL;
        SubLObject stack_element = (SubLObject)classes.NIL;
        SubLObject actual_class = (SubLObject)classes.NIL;
        SubLObject class_symbolic_name = (SubLObject)classes.NIL;
        while (classes.NIL != stack) {
            stack_element = stack.first();
            stack = stack.rest();
            depth = stack_element.rest();
            actual_class = stack_element.first();
            if (classes.NIL != actual_class) {
                class_symbolic_name = subloop_structures.class_name(actual_class);
                classes_display_class_name_at_depth(stream, class_symbolic_name, depth);
                final SubLObject next_depth = Numbers.add(depth, (SubLObject)classes.ONE_INTEGER);
                SubLObject actual_child = (SubLObject)classes.NIL;
                SubLObject cdolist_list_var = subloop_structures.class_subclasses(actual_class);
                SubLObject child_class = (SubLObject)classes.NIL;
                child_class = cdolist_list_var.first();
                while (classes.NIL != cdolist_list_var) {
                    actual_child = classes_retrieve_class(child_class);
                    if (classes.NIL != actual_child) {
                        stack = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(actual_child, next_depth), stack);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child_class = cdolist_list_var.first();
                }
            }
        }
        return base_class_symbolic_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 68187L)
    public static SubLObject subloop_type_p(final SubLObject class_or_class_name) {
        if (classes.NIL == class_or_class_name) {
            return (SubLObject)classes.NIL;
        }
        if (class_or_class_name.isSymbol()) {
            final SubLObject v_class = classes_retrieve_class(class_or_class_name);
            if (classes.NIL != v_class) {
                return (SubLObject)classes.T;
            }
            final SubLObject v_interface = interfaces.interfaces_retrieve_interface(class_or_class_name);
            return (SubLObject)((classes.NIL != v_interface) ? classes.T : classes.NIL);
        }
        else {
            if (classes.NIL != subloop_structures.class_p(class_or_class_name)) {
                return (SubLObject)classes.T;
            }
            return (SubLObject)classes.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes.lisp", position = 68595L)
    public static SubLObject classes_find_all_subclasses(final SubLObject class_or_class_name, SubLObject recursively) {
        if (recursively == classes.UNPROVIDED) {
            recursively = (SubLObject)classes.T;
        }
        final SubLObject actual_class = (SubLObject)(class_or_class_name.isSymbol() ? classes_retrieve_class(class_or_class_name) : ((classes.NIL != subloop_structures.class_p(class_or_class_name)) ? class_or_class_name : classes.NIL));
        if (classes.NIL == actual_class) {
            return (SubLObject)classes.NIL;
        }
        final SubLObject direct_subclasses = conses_high.copy_list(subloop_structures.class_subclasses(actual_class));
        if (classes.NIL != recursively) {
            SubLObject all_subclasses = conses_high.copy_list(direct_subclasses);
            SubLObject cdolist_list_var = direct_subclasses;
            SubLObject subclass = (SubLObject)classes.NIL;
            subclass = cdolist_list_var.first();
            while (classes.NIL != cdolist_list_var) {
                all_subclasses = conses_high.union(all_subclasses, classes_find_all_subclasses(subclass, (SubLObject)classes.T), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.cons(subloop_structures.class_name(actual_class), all_subclasses);
        }
        return (SubLObject)ConsesLow.cons(subloop_structures.class_name(actual_class), direct_subclasses);
    }
    
    public static SubLObject declare_classes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_reset_class_table", "CLASSES-RESET-CLASS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_get_all_classes", "CLASSES-GET-ALL-CLASSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_get_all_class_names", "CLASSES-GET-ALL-CLASS-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_protection_greater_than_or_equal", "CLASSES-PROTECTION-GREATER-THAN-OR-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_set_always_generate_before_listeners", "CLASSES-SET-ALWAYS-GENERATE-BEFORE-LISTENERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_before_listeners_by_default_p", "CLASSES-BEFORE-LISTENERS-BY-DEFAULT-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_set_always_generate_after_listeners", "CLASSES-SET-ALWAYS-GENERATE-AFTER-LISTENERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_after_listeners_by_default_p", "CLASSES-AFTER-LISTENERS-BY-DEFAULT-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_getf", "CLASSES-GETF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_putf", "CLASSES-PUTF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_implement_slot_listeners_p", "CLASSES-IMPLEMENT-SLOT-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_slot_property_p", "CLASSES-VALID-SLOT-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_list_of_valid_slot_properties_p", "CLASSES-LIST-OF-VALID-SLOT-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_list_of_valid_method_properties_p", "CLASSES-LIST-OF-VALID-METHOD-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_slot_name_p", "CLASSES-VALID-SLOT-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_slot_decl_p", "CLASSES-VALID-SLOT-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_property_p", "CLASSES-VALID-METHOD-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_properties_p", "CLASSES-VALID-METHOD-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_auto_update_p", "CLASSES-AUTO-UPDATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_no_member_variables_p", "CLASSES-NO-MEMBER-VARIABLES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_read_only_p", "CLASSES-READ-ONLY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_before_listeners_p", "CLASSES-BEFORE-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_after_listeners_p", "CLASSES-AFTER-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_interface_type_p", "CLASSES-VALID-METHOD-INTERFACE-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_name_p", "CLASSES-VALID-METHOD-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_parameter_name_p", "CLASSES-VALID-PARAMETER-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_optional_parameter_p", "CLASSES-VALID-OPTIONAL-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_optional_parameter_list_p", "CLASSES-VALID-OPTIONAL-PARAMETER-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_lambda_list_p", "CLASSES-VALID-LAMBDA-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_interface_body_p", "CLASSES-VALID-METHOD-INTERFACE-BODY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_method_interface_decl_p", "CLASSES-VALID-METHOD-INTERFACE-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_method_decl_type", "CLASSES-METHOD-DECL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_class_method_decl_p", "CLASSES-CLASS-METHOD-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_instance_method_decl_p", "CLASSES-INSTANCE-METHOD-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_method_name_given_method_decl", "CLASSES-METHOD-NAME-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_lambda_list_given_method_decl", "CLASSES-LAMBDA-LIST-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_properties_given_method_decl", "CLASSES-PROPERTIES-GIVEN-METHOD-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_slot_or_method_decl_p", "CLASSES-VALID-SLOT-OR-METHOD-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_slot_or_method_decls_p", "CLASSES-VALID-SLOT-OR-METHOD-DECLS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_must_be_valid_slot_or_method_decls", "CLASSES-MUST-BE-VALID-SLOT-OR-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_separate_decls_into_slot_decls_and_method_decls", "CLASSES-SEPARATE-DECLS-INTO-SLOT-DECLS-AND-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_separate_decls_into_class_and_instance_method_decls", "CLASS-SEPARATE-DECLS-INTO-CLASS-AND-INSTANCE-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "ldb_test", "LDB-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "display_class", "DISPLAY-CLASS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "with_class_definition_lock", "WITH-CLASS-DEFINITION-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "with_class_access_lock", "WITH-CLASS-ACCESS-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_retrieve_class", "CLASSES-RETRIEVE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_intern_class", "CLASSES-INTERN-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_delete_class", "CLASSES-DELETE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_set_class", "CLASSES-SET-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_get_class", "CLASSES-GET-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_class_property_p", "CLASSES-VALID-CLASS-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_instance_var_decl_p", "CLASSES-VALID-INSTANCE-VAR-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_instance_var_decls_p", "CLASSES-VALID-INSTANCE-VAR-DECLS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_class_name_p", "CLASSES-VALID-CLASS-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_must_be_valid_class_name", "CLASSES-MUST-BE-VALID-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_unique_elements", "CLASSES-UNIQUE-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "new_class", "NEW-CLASS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_make_slot_accessor_association", "CLASSES-MAKE-SLOT-ACCESSOR-ASSOCIATION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "classes_slot_accessor_association_slot_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SLOT-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "classes_slot_accessor_association_getter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-GETTER-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "classes_slot_accessor_association_setter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SETTER-NAME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_retrieve_slot_getter", "CLASSES-RETRIEVE-SLOT-GETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_retrieve_slot_setter", "CLASSES-RETRIEVE-SLOT-SETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_generate_slot_accessor_names", "CLASSES-GENERATE-SLOT-ACCESSOR-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_valid_class_properties_p", "CLASSES-VALID-CLASS-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_properties_must_be_valid", "CLASS-PROPERTIES-MUST-BE-VALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_interface_method_instantiations", "EXPAND-INTERFACE-METHOD-INSTANTIATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_accessors_for_class", "EXPAND-ACCESSORS-FOR-CLASS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_instance_any_slot_accessors", "EXPAND-INSTANCE-ANY-SLOT-ACCESSORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_instance_boolean_slot_accessors", "EXPAND-INSTANCE-BOOLEAN-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_class_any_slot_accessors", "EXPAND-CLASS-ANY-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_class_boolean_slot_accessors", "EXPAND-CLASS-BOOLEAN-SLOT-ACCESSORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_class_predicator", "EXPAND-CLASS-PREDICATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_class_initializer", "EXPAND-CLASS-INITIALIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_instance_initializer", "EXPAND-INSTANCE-INITIALIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "expand_define_class", "EXPAND-DEFINE-CLASS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "define_class", "DEFINE-CLASS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_new_class", "SUBLOOP-NEW-CLASS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_initialize_slot", "SUBLOOP-INITIALIZE-SLOT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_note_class_initialization_function", "SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_note_instance_initialization_function", "SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_instanceof_class", "SUBLOOP-INSTANCEOF-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_get_instance_slot", "SUBLOOP-GET-INSTANCE-SLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_get_access_protected_instance_slot", "SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_set_instance_slot", "SUBLOOP-SET-INSTANCE-SLOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_set_access_protected_instance_slot", "SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_compile_inheritance_path", "CLASSES-COMPILE-INHERITANCE-PATH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_instance_slot_index", "CLASSES-INSTANCE-SLOT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_boolean_slot_decl_p", "CLASSES-BOOLEAN-SLOT-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_class_slot_decl_p", "CLASSES-CLASS-SLOT-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_instance_slot_decl_p", "CLASSES-INSTANCE-SLOT-DECL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_protection_level_of_slot_decl", "CLASSES-PROTECTION-LEVEL-OF-SLOT-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_essential_slot_p", "CLASSES-ESSENTIAL-SLOT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_value_of_slot_decl", "CLASSES-VALUE-OF-SLOT-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_slot_name_given_slot_decl", "CLASSES-SLOT-NAME-GIVEN-SLOT-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_compile_instance_slot_access_list", "CLASSES-COMPILE-INSTANCE-SLOT-ACCESS-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_compile_instance_boolean_slot_access_list", "CLASSES-COMPILE-INSTANCE-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_compile_class_slot_access_list", "CLASSES-COMPILE-CLASS-SLOT-ACCESS-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_compile_class_boolean_slot_access_list", "CLASSES-COMPILE-CLASS-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_initialize_class_slots", "CLASSES-INITIALIZE-CLASS-SLOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "superclassp", "SUPERCLASSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subclassp", "SUBCLASSP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_access_check_class_slot", "CLASSES-ACCESS-CHECK-CLASS-SLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "get_class_slot", "GET-CLASS-SLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "set_class_slot", "SET-CLASS-SLOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_shadowed_association", "CLASSES-SHADOWED-ASSOCIATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_all_class_slots", "CLASSES-ALL-CLASS-SLOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_all_instance_slots", "CLASSES-ALL-INSTANCE-SLOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_all_any_instance_slots", "CLASSES-ALL-ANY-INSTANCE-SLOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_all_slots", "CLASSES-ALL-SLOTS", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "class_get_property_internal", "CLASS-GET-PROPERTY-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_get_property", "CLASS-GET-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_set_property_internal", "CLASS-SET-PROPERTY-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_set_property", "CLASS-SET-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_implements_slot_listeners_p", "CLASS-IMPLEMENTS-SLOT-LISTENERS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "class_set_implements_slot_listeners", "CLASS-SET-IMPLEMENTS-SLOT-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_implements_p", "CLASSES-IMPLEMENTS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_get_slot", "CLASSES-GET-SLOT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes", "do_classes_in_order", "DO-CLASSES-IN-ORDER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_tab_to_depth", "CLASSES-TAB-TO-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_display_class_name_at_depth", "CLASSES-DISPLAY-CLASS-NAME-AT-DEPTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_display_hierarchy", "CLASSES-DISPLAY-HIERARCHY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "subloop_type_p", "SUBLOOP-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes", "classes_find_all_subclasses", "CLASSES-FIND-ALL-SUBCLASSES", 1, 1, false);
        return (SubLObject)classes.NIL;
    }
    
    public static SubLObject init_classes_file() {
        classes.$classes_class_slot_access_violation$ = SubLFiles.defconstant("*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*", (SubLObject)classes.$str0$Cannot_access__A_slot__S_from_cla);
        classes.$classes_initial_hashtable_size$ = SubLFiles.defconstant("*CLASSES-INITIAL-HASHTABLE-SIZE*", (SubLObject)classes.$int1$800);
        classes.$classes_class_table_update_lock$ = SubLFiles.defparameter("*CLASSES-CLASS-TABLE-UPDATE-LOCK*", Locks.make_lock((SubLObject)classes.$str2$Class_Table_Update_Lock));
        classes.$classes_class_table$ = SubLFiles.deflexical("*CLASSES-CLASS-TABLE*", (classes.NIL != Symbols.boundp((SubLObject)classes.$sym3$_CLASSES_CLASS_TABLE_)) ? classes.$classes_class_table$.getGlobalValue() : Hashtables.make_hash_table(classes.$classes_initial_hashtable_size$.getGlobalValue(), (SubLObject)classes.UNPROVIDED, (SubLObject)classes.UNPROVIDED));
        classes.$classes_valid_class_properties$ = SubLFiles.defparameter("*CLASSES-VALID-CLASS-PROPERTIES*", (SubLObject)classes.$list4);
        classes.$classes_valid_slot_properties$ = SubLFiles.defparameter("*CLASSES-VALID-SLOT-PROPERTIES*", (SubLObject)classes.$list5);
        classes.$classes_valid_method_interface_types$ = SubLFiles.defparameter("*CLASSES-VALID-METHOD-INTERFACE-TYPES*", (SubLObject)classes.$list6);
        classes.$classes_valid_method_properties$ = SubLFiles.defparameter("*CLASSES-VALID-METHOD-PROPERTIES*", (SubLObject)classes.$list7);
        classes.$classes_always_generate_before_listeners$ = SubLFiles.deflexical("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", (SubLObject)((classes.NIL != Symbols.boundp((SubLObject)classes.$sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_)) ? classes.$classes_always_generate_before_listeners$.getGlobalValue() : classes.NIL));
        classes.$classes_always_generate_after_listeners$ = SubLFiles.deflexical("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", (SubLObject)((classes.NIL != Symbols.boundp((SubLObject)classes.$sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_)) ? classes.$classes_always_generate_after_listeners$.getGlobalValue() : classes.NIL));
        classes.$classes_new_class_current$ = SubLFiles.defparameter("*CLASSES-NEW-CLASS-CURRENT*", (SubLObject)classes.NIL);
        classes.$curclass$ = SubLFiles.defparameter("*CURCLASS*", (SubLObject)classes.NIL);
        return (SubLObject)classes.NIL;
    }
    
    public static SubLObject setup_classes_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)classes.$sym3$_CLASSES_CLASS_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)classes.$sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_);
        subl_macro_promotions.declare_defglobal((SubLObject)classes.$sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_);
        access_macros.register_macro_helper((SubLObject)classes.$sym130$SUBLOOP_NEW_CLASS, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym122$SUBLOOP_INITIALIZE_SLOT, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym121$SUBLOOP_INSTANCEOF_CLASS, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym90$SUBLOOP_GET_INSTANCE_SLOT, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym91$SUBLOOP_SET_INSTANCE_SLOT, (SubLObject)classes.$sym136$DEFINE_CLASS);
        access_macros.register_macro_helper((SubLObject)classes.$sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, (SubLObject)classes.$sym136$DEFINE_CLASS);
        return (SubLObject)classes.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_classes_file();
    }
    
    @Override
	public void initializeVariables() {
        init_classes_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_classes_file();
    }
    
    static {
        me = (SubLFile)new classes();
        classes.$classes_class_slot_access_violation$ = null;
        classes.$classes_initial_hashtable_size$ = null;
        classes.$classes_class_table_update_lock$ = null;
        classes.$classes_class_table$ = null;
        classes.$classes_valid_class_properties$ = null;
        classes.$classes_valid_slot_properties$ = null;
        classes.$classes_valid_method_interface_types$ = null;
        classes.$classes_valid_method_properties$ = null;
        classes.$classes_always_generate_before_listeners$ = null;
        classes.$classes_always_generate_after_listeners$ = null;
        classes.$classes_new_class_current$ = null;
        classes.$curclass$ = null;
        $str0$Cannot_access__A_slot__S_from_cla = SubLObjectFactory.makeString("Cannot access ~A slot ~S from class ~S.");
        $int1$800 = SubLObjectFactory.makeInteger(800);
        $str2$Class_Table_Update_Lock = SubLObjectFactory.makeString("Class Table Update Lock");
        $sym3$_CLASSES_CLASS_TABLE_ = SubLObjectFactory.makeSymbol("*CLASSES-CLASS-TABLE*");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)SubLObjectFactory.makeKeyword("IMPLEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeKeyword("SYNCHRONIZED-SLOTS"), (SubLObject)SubLObjectFactory.makeKeyword("ABSTRACT"));
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRIVATE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("PUBLIC"), SubLObjectFactory.makeKeyword("FILE-SCOPE"), SubLObjectFactory.makeKeyword("SYSTEM-SCOPE"), SubLObjectFactory.makeKeyword("GLOBAL-SCOPE"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("BOOLEAN"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("ESSENTIAL"), SubLObjectFactory.makeKeyword("NON-ESSENTAIL") });
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"));
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRIVATE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("PUBLIC"), SubLObjectFactory.makeKeyword("FILE-SCOPE"), SubLObjectFactory.makeKeyword("SYSTEM-SCOPE"), SubLObjectFactory.makeKeyword("GLOBAL-SCOPE"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("AUTO-UPDATE"), SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), SubLObjectFactory.makeKeyword("READ-ONLY"), SubLObjectFactory.makeKeyword("BEFORE-LISTENERS"), SubLObjectFactory.makeKeyword("AFTER-LISTENERS"), SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE") });
        $sym8$_CLASSES_ALWAYS_GENERATE_BEFORE_LISTENERS_ = SubLObjectFactory.makeSymbol("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*");
        $sym9$_CLASSES_ALWAYS_GENERATE_AFTER_LISTENERS_ = SubLObjectFactory.makeSymbol("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*");
        $kw10$SLOT_LISTENERS = SubLObjectFactory.makeKeyword("SLOT-LISTENERS");
        $kw11$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw12$AUTO_UPDATE = SubLObjectFactory.makeKeyword("AUTO-UPDATE");
        $kw13$NO_MEMBER_VARIABLES = SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES");
        $kw14$READ_ONLY = SubLObjectFactory.makeKeyword("READ-ONLY");
        $kw15$BEFORE_LISTENERS = SubLObjectFactory.makeKeyword("BEFORE-LISTENERS");
        $kw16$AFTER_LISTENERS = SubLObjectFactory.makeKeyword("AFTER-LISTENERS");
        $sym17$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym18$DEF_CLASS_METHOD = SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD");
        $sym19$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $str20$_S_is_an_invalid_class_declaratio = SubLObjectFactory.makeString("~S is an invalid class declaration body.");
        $str21$_S_is_neither_a_valid_slot_nor_va = SubLObjectFactory.makeString("~S is neither a valid slot nor valid method interface declaration.");
        $str22$__class_name_____S = SubLObjectFactory.makeString("~%class-name -> ~S");
        $str23$__parent_____S = SubLObjectFactory.makeString("~%parent -> ~S");
        $str24$__subclasses_____S = SubLObjectFactory.makeString("~%subclasses -> ~S");
        $str25$__interface_names_____S = SubLObjectFactory.makeString("~%interface-names -> ~S");
        $str26$__interfaces_____S = SubLObjectFactory.makeString("~%interfaces -> ~S");
        $str27$__compiled_inheritance_path_____S = SubLObjectFactory.makeString("~%compiled-inheritance-path -> ~S");
        $str28$__instance_var_decls_____S = SubLObjectFactory.makeString("~%instance-var-decls -> ~S");
        $str29$__class_var_decls_____S = SubLObjectFactory.makeString("~%class-var-decls -> ~S");
        $str30$__compiled_instance_slot_access_a = SubLObjectFactory.makeString("~%compiled-instance-slot-access-alist -> ~S");
        $str31$__compiled_instance_boolean_slot_ = SubLObjectFactory.makeString("~%compiled-instance-boolean-slot-access-alist -> ~S");
        $str32$__compiled_class_slot_access_alis = SubLObjectFactory.makeString("~%compiled-class-slot-access-alist -> ~S");
        $str33$__compiled_class_boolean_slot_acc = SubLObjectFactory.makeString("~%compiled-class-boolean-slot-access-alist -> ~S");
        $str34$__slot_accessor_alist_____S = SubLObjectFactory.makeString("~%slot-accessor-alist -> ~S");
        $str35$__instance_method_decls_____S = SubLObjectFactory.makeString("~%instance-method-decls -> ~S");
        $str36$__class_method_decls_____S = SubLObjectFactory.makeString("~%class-method-decls -> ~S");
        $str37$__boolean_slots_____S = SubLObjectFactory.makeString("~%boolean-slots -> ~S");
        $str38$__any_slots_____S = SubLObjectFactory.makeString("~%any-slots -> ~S");
        $str39$__compiled_instance_method_access = SubLObjectFactory.makeString("~%compiled-instance-method-access-alist -> ~S");
        $str40$__compiled_class_method_access_al = SubLObjectFactory.makeString("~%compiled-class-method-access-alist -> ~S");
        $str41$__class_initialization_function__ = SubLObjectFactory.makeString("~%class-initialization-function -> ~S");
        $str42$__class_initialized_p_____S = SubLObjectFactory.makeString("~%class-initialized-p -> ~S");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym45$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym46$CLASS_ACCESS_LOCK = SubLObjectFactory.makeSymbol("CLASS-ACCESS-LOCK");
        $sym47$SUBLISP_CLASS_STRUCTURE = SubLObjectFactory.makeSymbol("SUBLISP-CLASS-STRUCTURE");
        $str48$_S_is_not_a_valid_class_name_ = SubLObjectFactory.makeString("~S is not a valid class name.");
        $str49$NEW_CLASS__A_class_cannot_be_its_ = SubLObjectFactory.makeString("NEW-CLASS: A class cannot be its own superclass.  ~S can not extend ~S.");
        $str50$NEW_CLASS__A_class_cannot_subclas = SubLObjectFactory.makeString("NEW-CLASS: A class cannot subclass its own subclass.  ~S is a subclass of ~S.");
        $sym51$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym52$ON_DESTROY_CLASS = SubLObjectFactory.makeSymbol("ON-DESTROY-CLASS");
        $str53$Class_ = SubLObjectFactory.makeString("Class ");
        $str54$_Definition_Lock = SubLObjectFactory.makeString(" Definition Lock");
        $str55$_Access_Lock = SubLObjectFactory.makeString(" Access Lock");
        $str56$SUBLOOP_RESERVED_INITIALIZE_ = SubLObjectFactory.makeString("SUBLOOP-RESERVED-INITIALIZE-");
        $str57$_CLASS = SubLObjectFactory.makeString("-CLASS");
        $str58$_INSTANCE = SubLObjectFactory.makeString("-INSTANCE");
        $sym59$CADR = SubLObjectFactory.makeSymbol("CADR");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-ACCESSOR-ASSOCIATION"));
        $sym61$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym62$CDDR = SubLObjectFactory.makeSymbol("CDDR");
        $str63$GET_ = SubLObjectFactory.makeString("GET-");
        $str64$_ = SubLObjectFactory.makeString("-");
        $str65$SET_ = SubLObjectFactory.makeString("SET-");
        $str66$___S_is_not_a_valid_class_propert = SubLObjectFactory.makeString("~%~S is not a valid class property list.  A class property list~\n     ~%must be a sequence of :extend followed by a class or :implements~\n     ~%followed by an interface or a list of interfaces.");
        $str67$___S_is_not_a_valid_class_propert = SubLObjectFactory.makeString("~%~S is not a valid class property.~%If you wish to extend a class used :extend.~\n                   ~%If you wish to implement an interface, use :implements.");
        $str68$___S_is_not_a_valid_class_propert = SubLObjectFactory.makeString("~%~S is not a valid class property.~%Only :extends and :implements are valid class properties.");
        $kw69$EXTENDS = SubLObjectFactory.makeKeyword("EXTENDS");
        $str70$___S_is_not_a_valid_value_for_the = SubLObjectFactory.makeString("~%~S is not a valid value for the :extends class property.");
        $str71$__Attempting_to_subclass_unknown_ = SubLObjectFactory.makeString("~%Attempting to subclass unknown class ~S.");
        $kw72$IMPLEMENTS = SubLObjectFactory.makeKeyword("IMPLEMENTS");
        $str73$___S_is_not_a_valid_value_for_the = SubLObjectFactory.makeString("~%~S is not a valid value for the :implements class property.");
        $list74 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("SETTER"));
        $kw75$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $sym76$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym77$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym78$NEW_VALUE = SubLObjectFactory.makeSymbol("NEW-VALUE");
        $sym79$SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT = SubLObjectFactory.makeSymbol("SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT");
        $sym80$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym81$SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS = SubLObjectFactory.makeSymbol("SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS");
        $kw82$SLOT_GETTER_REGISTRY = SubLObjectFactory.makeKeyword("SLOT-GETTER-REGISTRY");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym86$SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT = SubLObjectFactory.makeSymbol("SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT");
        $sym87$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $kw88$SLOT_SETTER_REGISTRY = SubLObjectFactory.makeKeyword("SLOT-SETTER-REGISTRY");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $sym90$SUBLOOP_GET_INSTANCE_SLOT = SubLObjectFactory.makeSymbol("SUBLOOP-GET-INSTANCE-SLOT");
        $sym91$SUBLOOP_SET_INSTANCE_SLOT = SubLObjectFactory.makeSymbol("SUBLOOP-SET-INSTANCE-SLOT");
        $sym92$RET = SubLObjectFactory.makeSymbol("RET");
        $str93$class = SubLObjectFactory.makeString("class");
        $str94$slot = SubLObjectFactory.makeString("slot");
        $sym95$INSTANCE_CLASS = SubLObjectFactory.makeSymbol("INSTANCE-CLASS");
        $sym96$SLOT_ASSOC = SubLObjectFactory.makeSymbol("SLOT-ASSOC");
        $sym97$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");
        $sym98$INSTANCES_ACCESS_CHECK_INSTANCE_SLOT = SubLObjectFactory.makeSymbol("INSTANCES-ACCESS-CHECK-INSTANCE-SLOT");
        $sym99$LDB_TEST = SubLObjectFactory.makeSymbol("LDB-TEST");
        $sym100$INSTANCE_BOOLEAN_SLOTS = SubLObjectFactory.makeSymbol("INSTANCE-BOOLEAN-SLOTS");
        $sym101$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym102$DPB = SubLObjectFactory.makeSymbol("DPB");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)classes.ONE_INTEGER, (SubLObject)classes.ZERO_INTEGER);
        $sym104$CLASSES_ACCESS_CHECK_CLASS_SLOT = SubLObjectFactory.makeSymbol("CLASSES-ACCESS-CHECK-CLASS-SLOT");
        $sym105$CLASS = SubLObjectFactory.makeSymbol("CLASS");
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")));
        $sym107$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym108$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym109$CLASSES_RETRIEVE_CLASS = SubLObjectFactory.makeSymbol("CLASSES-RETRIEVE-CLASS");
        $sym110$CLASS_P = SubLObjectFactory.makeSymbol("CLASS-P");
        $sym111$INSTANCE_P = SubLObjectFactory.makeSymbol("INSTANCE-P");
        $list112 = ConsesLow.list((SubLObject)classes.NIL);
        $sym113$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym114$AREF = SubLObjectFactory.makeSymbol("AREF");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-ANY-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $list116 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)classes.NIL));
        $sym117$SET_AREF = SubLObjectFactory.makeSymbol("SET-AREF");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $str120$_P = SubLObjectFactory.makeString("-P");
        $sym121$SUBLOOP_INSTANCEOF_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-INSTANCEOF-CLASS");
        $sym122$SUBLOOP_INITIALIZE_SLOT = SubLObjectFactory.makeSymbol("SUBLOOP-INITIALIZE-SLOT");
        $sym123$NEW_INSTANCE = SubLObjectFactory.makeSymbol("NEW-INSTANCE");
        $sym124$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INSTANCE"));
        $sym126$SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION");
        $sym127$SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION");
        $str128$___S_is_not_a_valid_class_name_ = SubLObjectFactory.makeString("~%~S is not a valid class name.");
        $str129$___S_is_not_a_valid_member_variab = SubLObjectFactory.makeString("~%~S is not a valid member variable and method decl list.");
        $sym130$SUBLOOP_NEW_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-NEW-CLASS");
        $kw131$ABSTRACT = SubLObjectFactory.makeKeyword("ABSTRACT");
        $sym132$CLASS_SET_IMPLEMENTS_SLOT_LISTENERS = SubLObjectFactory.makeSymbol("CLASS-SET-IMPLEMENTS-SLOT-LISTENERS");
        $list133 = ConsesLow.list((SubLObject)classes.T);
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-AND-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-DECLS"));
        $list135 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-PROPERTIES"));
        $sym136$DEFINE_CLASS = SubLObjectFactory.makeSymbol("DEFINE-CLASS");
        $kw137$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $kw138$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw139$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $kw140$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw141$PROTECTED = SubLObjectFactory.makeKeyword("PROTECTED");
        $kw142$ESSENTIAL = SubLObjectFactory.makeKeyword("ESSENTIAL");
        $kw143$NON_ESSENTIAL = SubLObjectFactory.makeKeyword("NON-ESSENTIAL");
        $sym144$CLASS_NAME = SubLObjectFactory.makeSymbol("CLASS-NAME");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INDICATOR"));
        $sym146$CLASSES_GETF = SubLObjectFactory.makeSymbol("CLASSES-GETF");
        $sym147$CLASS_PLIST = SubLObjectFactory.makeSymbol("CLASS-PLIST");
        $sym148$CLASSES_PUTF = SubLObjectFactory.makeSymbol("CLASSES-PUTF");
        $kw149$IMPLEMENTS_SLOT_LISTENERS = SubLObjectFactory.makeKeyword("IMPLEMENTS-SLOT-LISTENERS");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTED-OPTIONAL-DEPTH-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str151$stack = SubLObjectFactory.makeString("stack");
        $str152$stack_element = SubLObjectFactory.makeString("stack-element");
        $str153$actual_class = SubLObjectFactory.makeString("actual-class");
        $str154$current_depth = SubLObjectFactory.makeString("current-depth");
        $sym155$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym156$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list157 = ConsesLow.list((SubLObject)classes.ZERO_INTEGER);
        $sym158$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym159$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym160$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym161$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym162$NEXT_DEPTH = SubLObjectFactory.makeSymbol("NEXT-DEPTH");
        $sym163$_ = SubLObjectFactory.makeSymbol("+");
        $list164 = ConsesLow.list((SubLObject)classes.ONE_INTEGER);
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-CHILD"));
        $sym166$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym167$CHILD_CLASS = SubLObjectFactory.makeSymbol("CHILD-CLASS");
        $sym168$CLASS_SUBCLASSES = SubLObjectFactory.makeSymbol("CLASS-SUBCLASSES");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-CHILD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-RETRIEVE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-CLASS")));
        $sym170$ACTUAL_CHILD = SubLObjectFactory.makeSymbol("ACTUAL-CHILD");
        $sym171$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-CHILD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-DEPTH"));
        $str173$__ = SubLObjectFactory.makeString("~%");
        $str174$__ = SubLObjectFactory.makeString("| ");
        $str175$_S_ = SubLObjectFactory.makeString("~S:");
    }
}

/*

	Total time: 727 ms
	
*/