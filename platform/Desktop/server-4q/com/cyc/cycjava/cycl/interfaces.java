package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class interfaces extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.interfaces";
    public static final String myFingerPrint = "611eba854dd7b2fe740e4a095b6ca5fa79f2f577a93f8f5c7bc0d3ccf5f5fdc3";
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 830L)
    private static SubLSymbol $interfaces_initial_hashtable_size$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 893L)
    private static SubLSymbol $interfaces_interface_table_update_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 999L)
    private static SubLSymbol $interfaces_interface_table$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1261L)
    private static SubLSymbol $interfaces_alist_of_all_interfaces$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1323L)
    private static SubLSymbol $interfaces_marked_interfaces$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1381L)
    private static SubLSymbol $interface_method_impossible_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1481L)
    private static SubLSymbol $interface_method_required_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 17312L)
    private static SubLSymbol $invalid_interface_method_name_message$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 18692L)
    private static SubLSymbol $invalid_interface_name_message$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 18855L)
    private static SubLSymbol $undeclare_method_name_message$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 19029L)
    private static SubLSymbol $non_existing_interface_message$;
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 19162L)
    private static SubLSymbol $invalid_lambda_list_message$;
    private static final SubLInteger $int0$400;
    private static final SubLString $str1$Interface_Table_Update_Lock;
    private static final SubLSymbol $sym2$_INTERFACES_INTERFACE_TABLE_;
    private static final SubLSymbol $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CLET;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$CUNWIND_PROTECT;
    private static final SubLSymbol $sym9$PROGN;
    private static final SubLList $list10;
    private static final SubLString $str11$__Describing_Interface__S;
    private static final SubLString $str12$____name_____S;
    private static final SubLString $str13$____parents_____S;
    private static final SubLString $str14$____compiled_inheritance_path____;
    private static final SubLString $str15$____subinterfaces_____S;
    private static final SubLString $str16$____implementers_____S;
    private static final SubLString $str17$____instance_method_decls_____S;
    private static final SubLString $str18$____class_method_decls_____S;
    private static final SubLString $str19$____compiled_instance_method_decl;
    private static final SubLString $str20$____compiled_class_method_decls__;
    private static final SubLString $str21$____local_class_methods_____S;
    private static final SubLString $str22$____local_instance_methods_____S;
    private static final SubLString $str23$___S_is_not_an_interface_;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$WITH_LOCK_HELD;
    private static final SubLSymbol $sym26$INTERFACE_DEFINITION_LOCK;
    private static final SubLSymbol $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE;
    private static final SubLSymbol $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD;
    private static final SubLSymbol $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE;
    private static final SubLSymbol $sym30$CADR;
    private static final SubLSymbol $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD;
    private static final SubLSymbol $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE;
    private static final SubLSymbol $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD;
    private static final SubLString $str34$_P;
    private static final SubLSymbol $sym35$DEFINE_PUBLIC;
    private static final SubLSymbol $sym36$RET;
    private static final SubLSymbol $sym37$SUBLOOP_INSTANCEOF_INTERFACE;
    private static final SubLSymbol $sym38$QUOTE;
    private static final SubLSymbol $sym39$NEW_INTERFACE;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$EXTENDS;
    private static final SubLString $str42$__Interface_names_must_be_a_symbo;
    private static final SubLString $str43$__Interface_names_must_not_be_NIL;
    private static final SubLString $str44$Interface_;
    private static final SubLString $str45$_Definition_Lock;
    private static final SubLString $str46$___S_is_not_a_valid_parent_interf;
    private static final SubLString $str47$___S_is_not_a_valid_parent_interf;
    private static final SubLString $str48$__Parent_interface__S_is_undefine;
    private static final SubLString $str49$___S_is_not_a_valid_interface_met;
    private static final SubLString $str50$___S_is_not_a_valid_interface_met;
    private static final SubLString $str51$The_interface_method_name__S_is_n;
    private static final SubLString $str52$The_interface_name__S_is_not_a_va;
    private static final SubLString $str53$The_method__S_of_interface__S_is_;
    private static final SubLString $str54$The_interface__S_which_appears_in;
    private static final SubLString $str55$Lambda_list__S_of_method__S_of_in;
    private static final SubLSymbol $sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD;
    private static final SubLSymbol $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL;
    private static final SubLSymbol $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL;
    private static final SubLSymbol $sym61$DEF_CLASS_METHOD;
    private static final SubLSymbol $kw62$BEFORE_LISTENERS;
    private static final SubLSymbol $kw63$AFTER_LISTENERS;
    private static final SubLSymbol $sym64$DEF_INSTANCE_METHOD;
    private static final SubLString $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$CLASSES_GETF;
    private static final SubLSymbol $sym68$INTERFACE_PLIST;
    private static final SubLString $str69$interface;
    private static final SubLSymbol $sym70$CSETF;
    private static final SubLSymbol $sym71$CLASSES_PUTF;
    private static final SubLString $str72$queue;
    private static final SubLString $str73$current_interface;
    private static final SubLSymbol $sym74$LIST;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$WHILE;
    private static final SubLSymbol $sym77$CSETQ;
    private static final SubLSymbol $sym78$CAR;
    private static final SubLSymbol $sym79$CPOP;
    private static final SubLSymbol $sym80$NCONC;
    private static final SubLSymbol $sym81$COPY_LIST;
    private static final SubLSymbol $sym82$INTERFACE_PARENTS;
    private static final SubLSymbol $sym83$INTERFACES_RETRIEVE_INTERFACE;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$INTERFACE_SUBINTERFACES;
    private static final SubLString $str86$next_generation;
    private static final SubLSymbol $sym87$CONS;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$CDR;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$NEW_DEPTH;
    private static final SubLSymbol $sym92$_;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$CDOLIST_COLLECTING;
    private static final SubLSymbol $sym95$INTERFACE_NAME;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1102L)
    public static SubLObject interfaces_reset_interface_table() {
        interfaces.$interfaces_interface_table$.setGlobalValue(Hashtables.make_hash_table(interfaces.$interfaces_initial_hashtable_size$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED));
        return (SubLObject)interfaces.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1566L)
    public static SubLObject with_interface_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)interfaces.$list7, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym8$CUNWIND_PROTECT, reader.bq_cons((SubLObject)interfaces.$sym9$PROGN, body), (SubLObject)interfaces.$list10));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 1799L)
    public static SubLObject display_interface(final SubLObject interface_or_interface_name, SubLObject stream) {
        if (stream == interfaces.UNPROVIDED) {
            stream = (SubLObject)interfaces.T;
        }
        final SubLObject v_interface = (interfaces.NIL != subloop_structures.interface_p(interface_or_interface_name)) ? interface_or_interface_name : interfaces_retrieve_interface(interface_or_interface_name);
        if (interfaces.NIL != v_interface) {
            final SubLObject v_interface_$1 = v_interface;
            final SubLObject name = subloop_structures.interface_name(v_interface_$1);
            final SubLObject parents = subloop_structures.interface_parents(v_interface_$1);
            final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface_$1);
            final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_$1);
            final SubLObject implementers = subloop_structures.interface_implementers(v_interface_$1);
            final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$1);
            final SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_$1);
            final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_$1);
            final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_$1);
            final SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_$1);
            final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_$1);
            PrintLow.format(stream, (SubLObject)interfaces.$str11$__Describing_Interface__S, v_interface);
            PrintLow.format(stream, (SubLObject)interfaces.$str12$____name_____S, name);
            PrintLow.format(stream, (SubLObject)interfaces.$str13$____parents_____S, parents);
            PrintLow.format(stream, (SubLObject)interfaces.$str14$____compiled_inheritance_path____, compiled_inheritance_path);
            PrintLow.format(stream, (SubLObject)interfaces.$str15$____subinterfaces_____S, subinterfaces);
            PrintLow.format(stream, (SubLObject)interfaces.$str16$____implementers_____S, implementers);
            PrintLow.format(stream, (SubLObject)interfaces.$str17$____instance_method_decls_____S, instance_method_decls);
            PrintLow.format(stream, (SubLObject)interfaces.$str18$____class_method_decls_____S, class_method_decls);
            PrintLow.format(stream, (SubLObject)interfaces.$str19$____compiled_instance_method_decl, compiled_instance_method_decls);
            PrintLow.format(stream, (SubLObject)interfaces.$str20$____compiled_class_method_decls__, compiled_class_method_decls);
            PrintLow.format(stream, (SubLObject)interfaces.$str21$____local_class_methods_____S, local_class_methods);
            PrintLow.format(stream, (SubLObject)interfaces.$str22$____local_instance_methods_____S, local_instance_methods);
        }
        else {
            PrintLow.format(stream, (SubLObject)interfaces.$str23$___S_is_not_an_interface_, interface_or_interface_name);
        }
        return v_interface;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 3034L)
    public static SubLObject with_interface_definition_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list24);
        v_interface = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym25$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)interfaces.$sym26$INTERFACE_DEFINITION_LOCK, v_interface)), body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 3213L)
    public static SubLObject interfaces_mark_interface(final SubLObject v_interface, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
        if (interfaces.NIL != mark_list) {
            if (interfaces.NIL == conses_high.member(mark, subloop_structures.interface_mark_list(v_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.IDENTITY))) {
                subloop_structures._csetf_interface_mark_list(v_interface, (SubLObject)ConsesLow.cons(mark, subloop_structures.interface_mark_list(v_interface)));
            }
        }
        else {
            subloop_structures._csetf_interface_mark_list(v_interface, (SubLObject)ConsesLow.list(mark));
            interfaces.$interfaces_marked_interfaces$.setDynamicValue((SubLObject)ConsesLow.cons(v_interface, interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread)), thread);
        }
        return mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 3561L)
    public static SubLObject interfaces_remove_mark(final SubLObject v_interface, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
        if (interfaces.NIL != mark_list) {
            mark_list = Sequences.delete(mark, mark_list, Symbols.symbol_function((SubLObject)interfaces.EQ), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
            subloop_structures._csetf_interface_mark_list(v_interface, mark_list);
            if (interfaces.NIL == mark_list) {
                interfaces.$interfaces_marked_interfaces$.setDynamicValue(Sequences.delete(v_interface, interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)interfaces.EQ), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED), thread);
            }
        }
        return mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 3947L)
    public static SubLObject interfaces_marked_p(final SubLObject v_interface, final SubLObject mark) {
        return (SubLObject)((interfaces.NIL != conses_high.member(mark, subloop_structures.interface_mark_list(v_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), (SubLObject)interfaces.UNPROVIDED)) ? interfaces.T : interfaces.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 4073L)
    public static SubLObject interfaces_unmark_all_marked_interfaces(final SubLObject v_interfaces) {
        SubLObject cdolist_list_var = v_interfaces;
        SubLObject v_interface = (SubLObject)interfaces.NIL;
        v_interface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            subloop_structures._csetf_interface_mark_list(v_interface, (SubLObject)interfaces.NIL);
            cdolist_list_var = cdolist_list_var.rest();
            v_interface = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 4239L)
    public static SubLObject interfaces_retrieve_interface(final SubLObject interface_name) {
        if (interface_name.isSymbol()) {
            return Hashtables.gethash(interface_name, interfaces.$interfaces_interface_table$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 4442L)
    public static SubLObject interfaces_intern_interface(final SubLObject interface_name, final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)interfaces.NIL;
        try {
            release = Locks.seize_lock(interfaces.$interfaces_interface_table_update_lock$.getDynamicValue(thread));
            if (interface_name.isSymbol() && interfaces.NIL != subloop_structures.interface_p(v_interface)) {
                Hashtables.sethash(interface_name, interfaces.$interfaces_interface_table$.getGlobalValue(), v_interface);
            }
        }
        finally {
            if (interfaces.NIL != release) {
                Locks.release_lock(interfaces.$interfaces_interface_table_update_lock$.getDynamicValue(thread));
            }
        }
        return v_interface;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 4741L)
    public static SubLObject interfaces_delete_interface(final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)interfaces.NIL;
        try {
            release = Locks.seize_lock(interfaces.$interfaces_interface_table_update_lock$.getDynamicValue(thread));
            if (interface_name.isSymbol()) {
                Hashtables.remhash(interface_name, interfaces.$interfaces_interface_table$.getGlobalValue());
            }
        }
        finally {
            if (interfaces.NIL != release) {
                Locks.release_lock(interfaces.$interfaces_interface_table_update_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 4975L)
    public static SubLObject interfaces_compile_inheritance_path_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = interfaces.$interfaces_marked_interfaces$.currentBinding(thread);
        try {
            interfaces.$interfaces_marked_interfaces$.bind((SubLObject)interfaces.NIL, thread);
            try {
                interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                interfaces_compile_inheritance_path_from_above_aux(v_interface);
                interfaces_transmit_compiled_inheritance_path_downward(v_interface);
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces(interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            interfaces.$interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 5345L)
    public static SubLObject interfaces_compile_inheritance_path_from_above_aux(final SubLObject v_interface) {
        final SubLObject name = subloop_structures.interface_name(v_interface);
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        SubLObject parent_interface = (SubLObject)interfaces.NIL;
        SubLObject parent_inheritance_path = (SubLObject)interfaces.NIL;
        SubLObject intermediate_path = (SubLObject)interfaces.NIL;
        SubLObject new_inheritance_path = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = parents;
        SubLObject parent = (SubLObject)interfaces.NIL;
        parent = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent);
            if (interfaces.NIL != parent_interface) {
                if (interfaces.NIL != interfaces_marked_p(parent_interface, (SubLObject)interfaces.$kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE)) {
                    parent_inheritance_path = subloop_structures.interface_compiled_inheritance_path(parent_interface);
                }
                else {
                    interfaces_mark_interface(parent_interface, (SubLObject)interfaces.$kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                    parent_inheritance_path = interfaces_compile_inheritance_path_from_above_aux(parent_interface);
                }
                final SubLObject item_var = name;
                if (interfaces.NIL == conses_high.member(item_var, subloop_structures.interface_subinterfaces(parent_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.IDENTITY))) {
                    subloop_structures._csetf_interface_subinterfaces(parent_interface, (SubLObject)ConsesLow.cons(item_var, subloop_structures.interface_subinterfaces(parent_interface)));
                }
                intermediate_path = (SubLObject)interfaces.NIL;
                SubLObject cdolist_list_var_$4 = parent_inheritance_path;
                SubLObject grand_parent = (SubLObject)interfaces.NIL;
                grand_parent = cdolist_list_var_$4.first();
                while (interfaces.NIL != cdolist_list_var_$4) {
                    if (interfaces.NIL == conses_high.member(grand_parent, new_inheritance_path, Symbols.symbol_function((SubLObject)interfaces.EQ), (SubLObject)interfaces.UNPROVIDED)) {
                        intermediate_path = (SubLObject)ConsesLow.cons(grand_parent, intermediate_path);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    grand_parent = cdolist_list_var_$4.first();
                }
                if (interfaces.NIL == conses_high.member(parent_interface, new_inheritance_path, Symbols.symbol_function((SubLObject)interfaces.EQ), (SubLObject)interfaces.UNPROVIDED)) {
                    intermediate_path = (SubLObject)ConsesLow.cons(parent_interface, intermediate_path);
                }
                new_inheritance_path = ConsesLow.nconc(new_inheritance_path, intermediate_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent = cdolist_list_var.first();
        }
        subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, new_inheritance_path);
        return new_inheritance_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 6668L)
    public static SubLObject interfaces_transmit_compiled_inheritance_path_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
        interfaces_transmit_compiled_inheritance_path_downward_aux(v_interface);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 6923L)
    public static SubLObject interfaces_transmit_compiled_inheritance_path_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = (SubLObject)interfaces.NIL;
        subinterface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if (interfaces.NIL != subinterface_interface && interfaces.NIL == interfaces_marked_p(subinterface_interface, (SubLObject)interfaces.$kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD)) {
                interfaces_compile_inheritance_path_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, (SubLObject)interfaces.$kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
                interfaces_transmit_compiled_inheritance_path_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 7628L)
    public static SubLObject interfaces_compile_instance_method_decls_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = interfaces.$interfaces_marked_interfaces$.currentBinding(thread);
        try {
            interfaces.$interfaces_marked_interfaces$.bind((SubLObject)interfaces.NIL, thread);
            try {
                interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                interfaces_compile_instance_method_decls_from_above_aux(v_interface);
                interfaces_transmit_compile_instance_method_decls_downward(v_interface);
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces(interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            interfaces.$interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 8020L)
    public static SubLObject interfaces_compile_instance_method_decls_from_above_aux(final SubLObject v_interface) {
        SubLObject result = (SubLObject)interfaces.NIL;
        final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface);
        final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface);
        SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface);
        try {
            SubLObject parent_compiled_instance_method_decls = (SubLObject)interfaces.NIL;
            SubLObject own_decls = (SubLObject)interfaces.NIL;
            SubLObject new_compiled_decls = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = compiled_inheritance_path;
            SubLObject parent_interface = (SubLObject)interfaces.NIL;
            parent_interface = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                if (interfaces.NIL != interfaces_marked_p(parent_interface, (SubLObject)interfaces.$kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE)) {
                    parent_compiled_instance_method_decls = conses_high.copy_list(subloop_structures.interface_compiled_instance_method_decls(parent_interface));
                }
                else {
                    interfaces_mark_interface(parent_interface, (SubLObject)interfaces.$kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                    parent_compiled_instance_method_decls = interfaces_compile_instance_method_decls_from_above_aux(parent_interface);
                }
                SubLObject cdolist_list_var_$8 = parent_compiled_instance_method_decls;
                SubLObject decl = (SubLObject)interfaces.NIL;
                decl = cdolist_list_var_$8.first();
                while (interfaces.NIL != cdolist_list_var_$8) {
                    if (interfaces.NIL == conses_high.member(conses_high.cadr(decl), new_compiled_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                        new_compiled_decls = (SubLObject)ConsesLow.cons(decl, new_compiled_decls);
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    decl = cdolist_list_var_$8.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            }
            cdolist_list_var = instance_method_decls;
            SubLObject decl2 = (SubLObject)interfaces.NIL;
            decl2 = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                if (interfaces.NIL == conses_high.member(conses_high.cadr(decl2), new_compiled_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                    own_decls = (SubLObject)ConsesLow.cons(decl2, own_decls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl2 = cdolist_list_var.first();
            }
            compiled_instance_method_decls = (result = ConsesLow.nconc(Sequences.nreverse(own_decls), Sequences.nreverse(new_compiled_decls)));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)interfaces.T);
                final SubLObject _values = Values.getValuesAsVector();
                subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, compiled_inheritance_path);
                subloop_structures._csetf_interface_instance_method_decls(v_interface, instance_method_decls);
                subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface, compiled_instance_method_decls);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 9254L)
    public static SubLObject interfaces_transmit_compile_instance_method_decls_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
        interfaces_transmit_compile_instance_method_decls_downward_aux(v_interface);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 9521L)
    public static SubLObject interfaces_transmit_compile_instance_method_decls_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = (SubLObject)interfaces.NIL;
        subinterface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if (interfaces.NIL != subinterface_interface && interfaces.NIL == interfaces_marked_p(subinterface_interface, (SubLObject)interfaces.$kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD)) {
                interfaces_compile_instance_method_decls_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, (SubLObject)interfaces.$kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
                interfaces_transmit_compile_instance_method_decls_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 10247L)
    public static SubLObject interfaces_compile_class_method_decls_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = interfaces.$interfaces_marked_interfaces$.currentBinding(thread);
        try {
            interfaces.$interfaces_marked_interfaces$.bind((SubLObject)interfaces.NIL, thread);
            try {
                interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                interfaces_compile_class_method_decls_from_above_aux(v_interface);
                interfaces_transmit_compile_class_method_decls_downward(v_interface);
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces(interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            interfaces.$interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 10624L)
    public static SubLObject interfaces_compile_class_method_decls_from_above_aux(final SubLObject v_interface) {
        SubLObject result = (SubLObject)interfaces.NIL;
        final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface);
        final SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface);
        SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface);
        try {
            SubLObject parent_compiled_class_method_decls = (SubLObject)interfaces.NIL;
            SubLObject own_decls = (SubLObject)interfaces.NIL;
            SubLObject new_compiled_decls = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = compiled_inheritance_path;
            SubLObject parent_interface = (SubLObject)interfaces.NIL;
            parent_interface = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                if (interfaces.NIL != interfaces_marked_p(parent_interface, (SubLObject)interfaces.$kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE)) {
                    parent_compiled_class_method_decls = conses_high.copy_list(subloop_structures.interface_compiled_class_method_decls(parent_interface));
                }
                else {
                    interfaces_mark_interface(parent_interface, (SubLObject)interfaces.$kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                    parent_compiled_class_method_decls = interfaces_compile_class_method_decls_from_above_aux(parent_interface);
                }
                SubLObject cdolist_list_var_$12 = parent_compiled_class_method_decls;
                SubLObject decl = (SubLObject)interfaces.NIL;
                decl = cdolist_list_var_$12.first();
                while (interfaces.NIL != cdolist_list_var_$12) {
                    if (interfaces.NIL == conses_high.member(conses_high.cadr(decl), new_compiled_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                        new_compiled_decls = (SubLObject)ConsesLow.cons(decl, new_compiled_decls);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    decl = cdolist_list_var_$12.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            }
            cdolist_list_var = class_method_decls;
            SubLObject decl2 = (SubLObject)interfaces.NIL;
            decl2 = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                if (interfaces.NIL == conses_high.member(conses_high.cadr(decl2), new_compiled_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                    own_decls = (SubLObject)ConsesLow.cons(decl2, own_decls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl2 = cdolist_list_var.first();
            }
            compiled_class_method_decls = (result = ConsesLow.nconc(Sequences.nreverse(own_decls), Sequences.nreverse(new_compiled_decls)));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)interfaces.T);
                final SubLObject _values = Values.getValuesAsVector();
                subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, compiled_inheritance_path);
                subloop_structures._csetf_interface_class_method_decls(v_interface, class_method_decls);
                subloop_structures._csetf_interface_compiled_class_method_decls(v_interface, compiled_class_method_decls);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 11822L)
    public static SubLObject interfaces_transmit_compile_class_method_decls_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
        interfaces_transmit_compile_class_method_decls_downward_aux(v_interface);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 12080L)
    public static SubLObject interfaces_transmit_compile_class_method_decls_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = (SubLObject)interfaces.NIL;
        subinterface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if (interfaces.NIL != subinterface_interface && interfaces.NIL == interfaces_marked_p(subinterface_interface, (SubLObject)interfaces.$kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD)) {
                interfaces_compile_class_method_decls_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, (SubLObject)interfaces.$kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
                interfaces_transmit_compile_class_method_decls_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 12791L)
    public static SubLObject expand_interface_predicator(final SubLObject interface_name) {
        final SubLObject predicator_name = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(interface_name), (SubLObject)interfaces.$str34$_P), (SubLObject)interfaces.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym35$DEFINE_PUBLIC, predicator_name, (SubLObject)ConsesLow.list(interface_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym36$RET, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym37$SUBLOOP_INSTANCEOF_INTERFACE, interface_name, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, interface_name))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 13107L)
    public static SubLObject subloop_instanceof_interface(final SubLObject v_object, final SubLObject v_interface) {
        if (interfaces.NIL != subloop_structures.instance_p(v_object)) {
            final SubLObject direct_class = subloop_structures.instance_class(v_object);
            return classes.classes_implements_p(direct_class, v_interface);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 13343L)
    public static SubLObject expand_define_interface(final SubLObject interface_name, final SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls) {
        new_interface(interface_name, parent_interfaces, interface_properties, method_decls);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym9$PROGN, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym39$NEW_INTERFACE, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, interface_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, parent_interfaces), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, interface_properties), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, method_decls)), expand_interface_predicator(interface_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 13701L)
    public static SubLObject define_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interface_name_and_properties = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list40);
        interface_name_and_properties = current.first();
        final SubLObject method_decls;
        current = (method_decls = current.rest());
        final SubLObject interface_name = interface_name_and_properties.first();
        final SubLObject interface_properties = interface_name_and_properties.rest();
        final SubLObject parent_interfaces = classes.classes_getf(interface_properties, (SubLObject)interfaces.$kw41$EXTENDS);
        return expand_define_interface(interface_name, parent_interfaces, interface_properties, method_decls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 14076L)
    public static SubLObject new_interface(final SubLObject interface_name, SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !interface_name.isSymbol()) {
            Errors.error((SubLObject)interfaces.$str42$__Interface_names_must_be_a_symbo, interface_name);
        }
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == interface_name) {
            Errors.error((SubLObject)interfaces.$str43$__Interface_names_must_not_be_NIL);
        }
        if (parent_interfaces.isSymbol() && interfaces.NIL != parent_interfaces) {
            parent_interfaces = (SubLObject)ConsesLow.list(parent_interfaces);
        }
        interfaces_check_parent_interfaces(parent_interfaces);
        interfaces_must_be_valid_method_interface_decl_list(method_decls);
        SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject apriori_interface = (SubLObject)((interfaces.NIL != v_interface) ? interfaces.T : interfaces.NIL);
        if (interfaces.NIL == v_interface) {
            v_interface = subloop_structures.make_interface((SubLObject)interfaces.UNPROVIDED);
            subloop_structures._csetf_interface_definition_lock(v_interface, Locks.make_lock(Sequences.cconcatenate((SubLObject)interfaces.$str44$Interface_, new SubLObject[] { Symbols.symbol_name(interface_name), interfaces.$str45$_Definition_Lock })));
        }
        final SubLObject lock = subloop_structures.interface_definition_lock(v_interface);
        SubLObject release = (SubLObject)interfaces.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject v_interface_$14 = v_interface;
            SubLObject name = subloop_structures.interface_name(v_interface_$14);
            SubLObject parents = subloop_structures.interface_parents(v_interface_$14);
            try {
                name = interface_name;
                parents = conses_high.copy_list(parent_interfaces);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_interface_name(v_interface_$14, name);
                    subloop_structures._csetf_interface_parents(v_interface_$14, parents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            interfaces_compile_inheritance_path_from_above(v_interface);
            thread.resetMultipleValues();
            final SubLObject new_class_method_decls = classes.class_separate_decls_into_class_and_instance_method_decls(method_decls);
            final SubLObject new_instance_method_decls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_interface_$15 = v_interface;
            SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$15);
            SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_$15);
            try {
                class_method_decls = new_class_method_decls;
                instance_method_decls = new_instance_method_decls;
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    subloop_structures._csetf_interface_instance_method_decls(v_interface_$15, instance_method_decls);
                    subloop_structures._csetf_interface_class_method_decls(v_interface_$15, class_method_decls);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            interfaces_compile_instance_method_decls_from_above(v_interface);
            interfaces_compile_class_method_decls_from_above(v_interface);
            if (interfaces.NIL == apriori_interface) {
                interfaces_intern_interface(interface_name, v_interface);
            }
        }
        finally {
            if (interfaces.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_interface;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 16251L)
    public static SubLObject interfaces_check_parent_interfaces(final SubLObject parent_interfaces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !parent_interfaces.isList()) {
            Errors.error((SubLObject)interfaces.$str46$___S_is_not_a_valid_parent_interf, parent_interfaces);
        }
        SubLObject cdolist_list_var = parent_interfaces;
        SubLObject parent_interface = (SubLObject)interfaces.NIL;
        parent_interface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!parent_interface.isSymbol() || interfaces.NIL == parent_interfaces)) {
                Errors.error((SubLObject)interfaces.$str47$___S_is_not_a_valid_parent_interf, parent_interface);
            }
            if (interfaces.NIL == interfaces_retrieve_interface(parent_interface)) {
                Errors.warn((SubLObject)interfaces.$str48$__Parent_interface__S_is_undefine, parent_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 16767L)
    public static SubLObject interfaces_must_be_valid_method_interface_decl(final SubLObject method_decl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == classes.classes_valid_method_interface_decl_p(method_decl)) {
            Errors.error((SubLObject)interfaces.$str49$___S_is_not_a_valid_interface_met, method_decl);
        }
        return (SubLObject)interfaces.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 16987L)
    public static SubLObject interfaces_must_be_valid_method_interface_decl_list(final SubLObject method_decl_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !method_decl_list.isList()) {
            Errors.error((SubLObject)interfaces.$str50$___S_is_not_a_valid_interface_met, method_decl_list);
        }
        SubLObject cdolist_list_var = method_decl_list;
        SubLObject method_decl = (SubLObject)interfaces.NIL;
        method_decl = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            interfaces_must_be_valid_method_interface_decl(method_decl);
            cdolist_list_var = cdolist_list_var.rest();
            method_decl = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 19293L)
    public static SubLObject interfaces_add_interface_class_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        SubLObject result = (SubLObject)interfaces.NIL;
        method_properties = conses_high.set_difference(method_properties, interfaces.$interface_method_impossible_properties$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
        method_properties = conses_high.set_difference(method_properties, interfaces.$interface_method_required_properties$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
        if (interfaces.NIL != v_interface) {
            final SubLObject v_interface_$16 = v_interface;
            final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_$16);
            SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_$16);
            try {
                final SubLObject method = methods.method_assoc(method_name, local_class_methods);
                final SubLObject method_decl_location = conses_high.member(method_name, compiled_class_method_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
                final SubLObject method_decl = (SubLObject)((interfaces.NIL != method_decl_location) ? method_decl_location.first() : interfaces.NIL);
                if (interfaces.NIL != method) {
                    subloop_structures._csetf_method_class_name(method, interface_name);
                    subloop_structures._csetf_method_lambda_list(method, conses_high.copy_tree(lambda_list));
                    subloop_structures._csetf_method_body(method, conses_high.copy_tree(body));
                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                    result = method;
                }
                else {
                    if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == method_decl) {
                        Errors.error(interfaces.$undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                    }
                    final SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                    subloop_structures._csetf_method_body(new_method, conses_high.copy_tree(body));
                    subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                    local_class_methods = ConsesLow.nconc(local_class_methods, (SubLObject)ConsesLow.list(new_method));
                    result = new_method;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_interface_compiled_class_method_decls(v_interface_$16, compiled_class_method_decls);
                    subloop_structures._csetf_interface_local_class_methods(v_interface_$16, local_class_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 21677L)
    public static SubLObject expand_def_class_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (interfaces.NIL == method_name || !method_name.isSymbol())) {
            Errors.error(interfaces.$invalid_interface_method_name_message$.getGlobalValue(), method_name);
        }
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (interfaces.NIL == interface_name || !interface_name.isSymbol())) {
            Errors.error(interfaces.$invalid_interface_name_message$.getGlobalValue(), interface_name);
        }
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == classes.classes_valid_lambda_list_p(lambda_list)) {
            Errors.error(interfaces.$invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
        }
        final SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? body.rest() : body;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == v_interface) {
            Errors.error(interfaces.$non_existing_interface_message$.getGlobalValue(), v_interface);
        }
        interfaces_add_interface_class_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, interface_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, method_properties), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, conses_high.copy_tree(lambda_list)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, conses_high.copy_tree(preprocessed_body)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 22888L)
    public static SubLObject def_class_method_template(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)interfaces.NIL;
        SubLObject interface_name = (SubLObject)interfaces.NIL;
        SubLObject method_properties = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        interface_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return expand_def_class_method_template(method_name, interface_name, method_properties, lambda_list, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 23105L)
    public static SubLObject interfaces_add_interface_instance_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        SubLObject result = (SubLObject)interfaces.NIL;
        method_properties = conses_high.set_difference(method_properties, interfaces.$interface_method_impossible_properties$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
        method_properties = conses_high.set_difference(method_properties, interfaces.$interface_method_required_properties$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
        if (interfaces.NIL != v_interface) {
            final SubLObject v_interface_$17 = v_interface;
            final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_$17);
            SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_$17);
            try {
                final SubLObject method = methods.method_assoc(method_name, local_instance_methods);
                final SubLObject method_decl_location = conses_high.member(method_name, compiled_instance_method_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
                final SubLObject method_decl = (SubLObject)((interfaces.NIL != method_decl_location) ? method_decl_location.first() : interfaces.NIL);
                if (interfaces.NIL != method) {
                    subloop_structures._csetf_method_class_name(method, interface_name);
                    subloop_structures._csetf_method_lambda_list(method, conses_high.copy_tree(lambda_list));
                    subloop_structures._csetf_method_body(method, conses_high.copy_tree(body));
                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                    result = method;
                }
                else {
                    if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == method_decl) {
                        Errors.error(interfaces.$undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                    }
                    final SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                    subloop_structures._csetf_method_body(new_method, conses_high.copy_tree(body));
                    subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                    local_instance_methods = ConsesLow.nconc(local_instance_methods, (SubLObject)ConsesLow.list(new_method));
                    result = new_method;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface_$17, compiled_instance_method_decls);
                    subloop_structures._csetf_interface_local_instance_methods(v_interface_$17, local_instance_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 25504L)
    public static SubLObject expand_def_instance_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (interfaces.NIL == method_name || !method_name.isSymbol())) {
            Errors.error(interfaces.$invalid_interface_method_name_message$.getGlobalValue(), method_name);
        }
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (interfaces.NIL == interface_name || !interface_name.isSymbol())) {
            Errors.error(interfaces.$invalid_interface_name_message$.getGlobalValue(), interface_name);
        }
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == classes.classes_valid_lambda_list_p(lambda_list)) {
            Errors.error(interfaces.$invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
        }
        final SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? body.rest() : body;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == v_interface) {
            Errors.error(interfaces.$non_existing_interface_message$.getGlobalValue(), v_interface);
        }
        interfaces_add_interface_instance_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, method_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, interface_name), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, method_properties), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, conses_high.copy_tree(lambda_list)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym38$QUOTE, conses_high.copy_tree(preprocessed_body)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 26720L)
    public static SubLObject def_instance_method_template(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)interfaces.NIL;
        SubLObject interface_name = (SubLObject)interfaces.NIL;
        SubLObject method_properties = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        interface_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list57);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return expand_def_instance_method_template(method_name, interface_name, method_properties, lambda_list, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 26943L)
    public static SubLObject interfaces_find_class_method_internal(final SubLObject method_name, final SubLObject v_interface) {
        if (interfaces.NIL != interfaces_marked_p(v_interface, (SubLObject)interfaces.$kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL)) {
            return (SubLObject)interfaces.NIL;
        }
        if (interfaces.NIL == v_interface) {
            return (SubLObject)interfaces.NIL;
        }
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface);
        SubLObject method = methods.method_assoc(method_name, local_instance_methods);
        if (interfaces.NIL != method) {
            return method;
        }
        SubLObject parent_interface = (SubLObject)interfaces.NIL;
        interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL);
        SubLObject cdolist_list_var = parents;
        SubLObject parent_interface_name = (SubLObject)interfaces.NIL;
        parent_interface_name = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent_interface_name);
            if (interfaces.NIL != parent_interface) {
                method = interfaces_find_class_method_internal(method_name, parent_interface);
                if (interfaces.NIL != method) {
                    return method;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface_name = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 27699L)
    public static SubLObject interfaces_find_class_method(final SubLObject method_name, final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)interfaces.NIL;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject _prev_bind_0 = interfaces.$interfaces_marked_interfaces$.currentBinding(thread);
        try {
            interfaces.$interfaces_marked_interfaces$.bind((SubLObject)interfaces.NIL, thread);
            try {
                result = interfaces_find_class_method_internal(method_name, v_interface);
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces(interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            interfaces.$interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 27991L)
    public static SubLObject interfaces_find_instance_method_internal(final SubLObject method_name, final SubLObject v_interface) {
        if (interfaces.NIL != interfaces_marked_p(v_interface, (SubLObject)interfaces.$kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL)) {
            return (SubLObject)interfaces.NIL;
        }
        if (interfaces.NIL == v_interface) {
            return (SubLObject)interfaces.NIL;
        }
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface);
        SubLObject method = methods.method_assoc(method_name, local_instance_methods);
        if (interfaces.NIL != method) {
            return method;
        }
        SubLObject parent_interface = (SubLObject)interfaces.NIL;
        interfaces_mark_interface(v_interface, (SubLObject)interfaces.$kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL);
        SubLObject cdolist_list_var = parents;
        SubLObject parent_interface_name = (SubLObject)interfaces.NIL;
        parent_interface_name = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent_interface_name);
            if (interfaces.NIL != parent_interface) {
                method = interfaces_find_instance_method_internal(method_name, parent_interface);
                if (interfaces.NIL != method) {
                    return method;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface_name = cdolist_list_var.first();
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 28759L)
    public static SubLObject interfaces_find_instance_method(final SubLObject method_name, final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)interfaces.NIL;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject _prev_bind_0 = interfaces.$interfaces_marked_interfaces$.currentBinding(thread);
        try {
            interfaces.$interfaces_marked_interfaces$.bind((SubLObject)interfaces.NIL, thread);
            try {
                result = interfaces_find_instance_method_internal(method_name, v_interface);
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)interfaces.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces(interfaces.$interfaces_marked_interfaces$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            interfaces.$interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 29057L)
    public static SubLObject interfaces_class_method_to_listed_def_class_method(final SubLObject true_class_name, final SubLObject method) {
        if (interfaces.NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject body = subloop_structures.method_body(method);
            final SubLObject protection = subloop_structures.method_protection(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject update_type = subloop_structures.method_update_type(method);
            final SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            final SubLObject after_listeners = subloop_structures.method_after_listeners(method);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym61$DEF_CLASS_METHOD, (SubLObject)ConsesLow.listS(name, true_class_name, ConsesLow.append(new SubLObject[] { (interfaces.NIL != protection) ? ConsesLow.list(protection) : interfaces.NIL, (interfaces.NIL != scope) ? ConsesLow.list(scope) : interfaces.NIL, (interfaces.NIL != update_type) ? ConsesLow.list(update_type) : interfaces.NIL, (interfaces.NIL != before_listeners) ? ConsesLow.list((SubLObject)interfaces.$kw62$BEFORE_LISTENERS) : interfaces.NIL, (interfaces.NIL != after_listeners) ? ConsesLow.list((SubLObject)interfaces.$kw63$AFTER_LISTENERS) : interfaces.NIL, interfaces.NIL })), conses_high.copy_tree(lambda_list), ConsesLow.append(conses_high.copy_tree(body), (SubLObject)interfaces.NIL)));
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 29573L)
    public static SubLObject interfaces_instance_method_to_listed_def_instance_method(final SubLObject true_class_name, final SubLObject method) {
        if (interfaces.NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject body = subloop_structures.method_body(method);
            final SubLObject protection = subloop_structures.method_protection(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject update_type = subloop_structures.method_update_type(method);
            final SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            final SubLObject after_listeners = subloop_structures.method_after_listeners(method);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym64$DEF_INSTANCE_METHOD, (SubLObject)ConsesLow.listS(name, true_class_name, ConsesLow.append(new SubLObject[] { (interfaces.NIL != protection) ? ConsesLow.list(protection) : interfaces.NIL, (interfaces.NIL != scope) ? ConsesLow.list(scope) : interfaces.NIL, (interfaces.NIL != update_type) ? ConsesLow.list(update_type) : interfaces.NIL, (interfaces.NIL != before_listeners) ? ConsesLow.list((SubLObject)interfaces.$kw62$BEFORE_LISTENERS) : interfaces.NIL, (interfaces.NIL != after_listeners) ? ConsesLow.list((SubLObject)interfaces.$kw63$AFTER_LISTENERS) : interfaces.NIL, interfaces.NIL })), conses_high.copy_tree(lambda_list), ConsesLow.append(conses_high.copy_tree(body), (SubLObject)interfaces.NIL)));
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 30113L)
    public static SubLObject interfaces_implements_p(final SubLObject target_interface, final SubLObject parent_interface) {
        final SubLObject target = (SubLObject)((interfaces.NIL != subloop_structures.interface_p(target_interface)) ? target_interface : (target_interface.isSymbol() ? interfaces_retrieve_interface(target_interface) : interfaces.NIL));
        final SubLObject parent = (SubLObject)((interfaces.NIL != subloop_structures.interface_p(parent_interface)) ? parent_interface : (parent_interface.isSymbol() ? interfaces_retrieve_interface(parent_interface) : interfaces.NIL));
        return (SubLObject)((target.eql(parent) || interfaces.NIL != conses_high.member(parent, subloop_structures.interface_compiled_inheritance_path(target), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED)) ? interfaces.T : interfaces.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 30710L)
    public static SubLObject interfaces_collect_method_decls(final SubLObject v_interfaces) {
        SubLObject all_class_method_decls = (SubLObject)interfaces.NIL;
        SubLObject all_instance_method_decls = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = v_interfaces;
        SubLObject v_interface = (SubLObject)interfaces.NIL;
        v_interface = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            if (interfaces.NIL != subloop_structures.interface_p(v_interface)) {
                final SubLObject v_interface_$24 = v_interface;
                final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$24);
                SubLObject cdolist_list_var_$25;
                final SubLObject class_method_decls = cdolist_list_var_$25 = subloop_structures.interface_class_method_decls(v_interface_$24);
                SubLObject class_method_decl = (SubLObject)interfaces.NIL;
                class_method_decl = cdolist_list_var_$25.first();
                while (interfaces.NIL != cdolist_list_var_$25) {
                    if (interfaces.NIL == conses_high.member(conses_high.cadr(class_method_decl), all_class_method_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                        all_class_method_decls = (SubLObject)ConsesLow.cons(class_method_decl, all_class_method_decls);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    class_method_decl = cdolist_list_var_$25.first();
                }
                SubLObject cdolist_list_var_$26 = instance_method_decls;
                SubLObject instance_method_decl = (SubLObject)interfaces.NIL;
                instance_method_decl = cdolist_list_var_$26.first();
                while (interfaces.NIL != cdolist_list_var_$26) {
                    if (interfaces.NIL == conses_high.member(conses_high.cadr(instance_method_decl), all_instance_method_decls, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                        all_instance_method_decls = (SubLObject)ConsesLow.cons(instance_method_decl, all_instance_method_decls);
                    }
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    instance_method_decl = cdolist_list_var_$26.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_interface = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(all_class_method_decls), Sequences.nreverse(all_instance_method_decls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 31447L)
    public static SubLObject subloop_all_methods_of_interface(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject actual_interface = (SubLObject)(v_interface.isSymbol() ? interfaces_retrieve_interface(v_interface) : ((interfaces.NIL != subloop_structures.interface_p(v_interface)) ? v_interface : interfaces.NIL));
        SubLObject v_methods = (SubLObject)interfaces.NIL;
        if (interfaces.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && interfaces.NIL == actual_interface) {
            Errors.error((SubLObject)interfaces.$str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_, v_interface);
        }
        thread.resetMultipleValues();
        final SubLObject class_method_decls = interfaces_collect_method_decls((SubLObject)ConsesLow.list(actual_interface));
        final SubLObject instance_method_decls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject list_expression = ConsesLow.nconc(class_method_decls, instance_method_decls);
        if (interfaces.NIL == list_expression) {
            v_methods = (SubLObject)interfaces.NIL;
        }
        else if (list_expression.isAtom()) {
            v_methods = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (interfaces.NIL == list_expression.rest()) {
            final SubLObject method_decl = list_expression.first();
            v_methods = (SubLObject)((method_decl.isCons() && method_decl.rest().isCons()) ? ConsesLow.list(conses_high.cadr(method_decl)) : interfaces.NIL);
        }
        else {
            SubLObject tail_cons = (SubLObject)interfaces.NIL;
            SubLObject result = (SubLObject)interfaces.NIL;
            v_methods = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = list_expression;
            SubLObject method_decl2 = (SubLObject)interfaces.NIL;
            method_decl2 = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                result = (SubLObject)((method_decl2.isCons() && method_decl2.rest().isCons()) ? ConsesLow.list(conses_high.cadr(method_decl2)) : interfaces.NIL);
                if (interfaces.NIL != result) {
                    if (interfaces.NIL != tail_cons) {
                        ConsesLow.rplacd(tail_cons, result);
                        tail_cons = conses_high.last(result, (SubLObject)interfaces.UNPROVIDED);
                    }
                    else {
                        v_methods = (SubLObject)((method_decl2.isCons() && method_decl2.rest().isCons()) ? ConsesLow.list(conses_high.cadr(method_decl2)) : interfaces.NIL);
                        tail_cons = conses_high.last(v_methods, (SubLObject)interfaces.UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_decl2 = cdolist_list_var.first();
            }
        }
        return v_methods;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 32159L)
    public static SubLObject interface_get_property_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = (SubLObject)interfaces.NIL;
        SubLObject indicator = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list66);
        v_interface = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list66);
        indicator = current.first();
        current = current.rest();
        if (interfaces.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym67$CLASSES_GETF, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym68$INTERFACE_PLIST, v_interface), indicator);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)interfaces.$list66);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 32299L)
    public static SubLObject interface_get_property(final SubLObject v_interface, final SubLObject indicator) {
        if (interfaces.NIL != subloop_structures.interface_p(v_interface)) {
            return classes.classes_getf(subloop_structures.interface_plist(v_interface), indicator);
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 32471L)
    public static SubLObject interface_set_property_internal(final SubLObject v_interface, final SubLObject indicator, final SubLObject value) {
        final SubLObject interface_var = Symbols.make_symbol((SubLObject)interfaces.$str69$interface);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(interface_var, v_interface)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym70$CSETF, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym68$INTERFACE_PLIST, interface_var), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym71$CLASSES_PUTF, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym68$INTERFACE_PLIST, interface_var), indicator, value)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 32769L)
    public static SubLObject interface_set_property(final SubLObject v_interface, final SubLObject indicator, final SubLObject value) {
        if (interfaces.NIL != subloop_structures.interface_p(v_interface)) {
            interface_set_property_internal(v_interface, indicator, value);
            return value;
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 32963L)
    public static SubLObject subloop_all_classes_implementing_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (SubLObject)(v_interface.isSymbol() ? interfaces_retrieve_interface(v_interface) : ((interfaces.NIL != subloop_structures.interface_p(v_interface)) ? v_interface : interfaces.NIL));
        final SubLObject all_classes = classes.classes_get_all_classes();
        SubLObject all_classes_implementing_interface = (SubLObject)interfaces.NIL;
        final SubLObject list_expression = all_classes;
        if (interfaces.NIL == list_expression) {
            all_classes_implementing_interface = (SubLObject)interfaces.NIL;
        }
        else if (list_expression.isAtom()) {
            all_classes_implementing_interface = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (interfaces.NIL == list_expression.rest()) {
            final SubLObject v_class = list_expression.first();
            all_classes_implementing_interface = (SubLObject)((interfaces.NIL != classes.classes_implements_p(v_class, actual_interface)) ? ConsesLow.list(v_class) : interfaces.NIL);
        }
        else {
            SubLObject tail_cons = (SubLObject)interfaces.NIL;
            SubLObject result = (SubLObject)interfaces.NIL;
            all_classes_implementing_interface = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = list_expression;
            SubLObject v_class2 = (SubLObject)interfaces.NIL;
            v_class2 = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                result = (SubLObject)((interfaces.NIL != classes.classes_implements_p(v_class2, actual_interface)) ? ConsesLow.list(v_class2) : interfaces.NIL);
                if (interfaces.NIL != result) {
                    if (interfaces.NIL != tail_cons) {
                        ConsesLow.rplacd(tail_cons, result);
                        tail_cons = conses_high.last(result, (SubLObject)interfaces.UNPROVIDED);
                    }
                    else {
                        all_classes_implementing_interface = (SubLObject)((interfaces.NIL != classes.classes_implements_p(v_class2, actual_interface)) ? ConsesLow.list(v_class2) : interfaces.NIL);
                        tail_cons = conses_high.last(all_classes_implementing_interface, (SubLObject)interfaces.UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_class2 = cdolist_list_var.first();
            }
        }
        return all_classes_implementing_interface;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 33498L)
    public static SubLObject subloop_all_interfaces_of_class(final SubLObject v_class) {
        final SubLObject actual_class = (SubLObject)(v_class.isSymbol() ? classes.classes_retrieve_class(v_class) : ((interfaces.NIL != subloop_structures.class_p(v_class)) ? v_class : interfaces.NIL));
        if (interfaces.NIL == actual_class) {
            return (SubLObject)interfaces.NIL;
        }
        final SubLObject inheritance_path = subloop_structures.class_compiled_inheritance_path(actual_class);
        SubLObject interface_names = (SubLObject)interfaces.NIL;
        SubLObject cdolist_list_var = inheritance_path;
        SubLObject super_class = (SubLObject)interfaces.NIL;
        super_class = cdolist_list_var.first();
        while (interfaces.NIL != cdolist_list_var) {
            interface_names = conses_high.union(interface_names, subloop_structures.class_interface_names(super_class), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            super_class = cdolist_list_var.first();
        }
        return interface_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 33989L)
    public static SubLObject subloop_all_instance_method_decls_of_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (SubLObject)(v_interface.isSymbol() ? interfaces_retrieve_interface(v_interface) : ((interfaces.NIL != subloop_structures.interface_p(v_interface)) ? v_interface : interfaces.NIL));
        if (interfaces.NIL != actual_interface) {
            SubLObject union_of_all_parent_methods = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = (SubLObject)interfaces.NIL;
            parent_interface = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                union_of_all_parent_methods = conses_high.union(union_of_all_parent_methods, subloop_all_instance_method_decls_of_interface(parent_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            }
            return conses_high.union(subloop_structures.interface_instance_method_decls(actual_interface), union_of_all_parent_methods, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 34674L)
    public static SubLObject subloop_all_class_method_decls_of_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (SubLObject)(v_interface.isSymbol() ? interfaces_retrieve_interface(v_interface) : ((interfaces.NIL != subloop_structures.interface_p(v_interface)) ? v_interface : interfaces.NIL));
        if (interfaces.NIL != actual_interface) {
            SubLObject union_of_all_parent_methods = (SubLObject)interfaces.NIL;
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = (SubLObject)interfaces.NIL;
            parent_interface = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                union_of_all_parent_methods = conses_high.union(union_of_all_parent_methods, subloop_all_class_method_decls_of_interface(parent_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            }
            return conses_high.union(subloop_structures.interface_class_method_decls(actual_interface), union_of_all_parent_methods, Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR));
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 35350L)
    public static SubLObject interfaces_who_introduced_method(final SubLObject v_interface, final SubLObject method_name) {
        final SubLObject actual_interface = (SubLObject)(v_interface.isSymbol() ? interfaces_retrieve_interface(v_interface) : ((interfaces.NIL != subloop_structures.interface_p(v_interface)) ? v_interface : interfaces.NIL));
        if (interfaces.NIL != actual_interface) {
            if (interfaces.NIL != conses_high.member(method_name, subloop_structures.interface_instance_method_decls(actual_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                return subloop_structures.interface_name(actual_interface);
            }
            if (interfaces.NIL != conses_high.member(method_name, subloop_structures.interface_class_method_decls(actual_interface), Symbols.symbol_function((SubLObject)interfaces.EQ), Symbols.symbol_function((SubLObject)interfaces.$sym30$CADR))) {
                return subloop_structures.interface_name(actual_interface);
            }
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = (SubLObject)interfaces.NIL;
            parent_interface = cdolist_list_var.first();
            while (interfaces.NIL != cdolist_list_var) {
                final SubLObject found = interfaces_who_introduced_method(parent_interface, method_name);
                if (interfaces.NIL != found) {
                    return found;
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            }
        }
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 36088L)
    public static SubLObject expand_do_interfaces_upward(final SubLObject var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = Symbols.make_symbol((SubLObject)interfaces.$str72$queue);
        final SubLObject current_interface = Symbols.make_symbol((SubLObject)interfaces.$str73$current_interface);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym74$LIST, start_interface)), reader.bq_cons(current_interface, (SubLObject)interfaces.$list75), reader.bq_cons(var, (SubLObject)interfaces.$list75)), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym76$WHILE, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, current_interface, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, queue_var)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, var, current_interface), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym79$CPOP, queue_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym80$NCONC, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym81$COPY_LIST, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym82$INTERFACE_PARENTS, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym83$INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 36656L)
    public static SubLObject do_interfaces_upward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)interfaces.NIL;
        SubLObject start_interface = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        start_interface = current.first();
        current = current.rest();
        if (interfaces.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return expand_do_interfaces_upward(var, start_interface, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)interfaces.$list84);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 36794L)
    public static SubLObject expand_do_interfaces_downward(final SubLObject var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = Symbols.make_symbol((SubLObject)interfaces.$str72$queue);
        final SubLObject current_interface = Symbols.make_symbol((SubLObject)interfaces.$str73$current_interface);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym74$LIST, start_interface)), reader.bq_cons(current_interface, (SubLObject)interfaces.$list75), reader.bq_cons(var, (SubLObject)interfaces.$list75)), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym76$WHILE, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, current_interface, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, queue_var)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, var, current_interface), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym79$CPOP, queue_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym80$NCONC, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym81$COPY_LIST, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym85$INTERFACE_SUBINTERFACES, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym83$INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 37379L)
    public static SubLObject do_interfaces_downward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)interfaces.NIL;
        SubLObject start_interface = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list84);
        start_interface = current.first();
        current = current.rest();
        if (interfaces.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return expand_do_interfaces_downward(var, start_interface, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)interfaces.$list84);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 37521L)
    public static SubLObject expand_do_interfaces_upward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = Symbols.make_symbol((SubLObject)interfaces.$str72$queue);
        final SubLObject current_record = Symbols.make_symbol((SubLObject)interfaces.$str73$current_interface);
        final SubLObject next_generation_var = Symbols.make_symbol((SubLObject)interfaces.$str86$next_generation);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym74$LIST, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym87$CONS, start_interface, (SubLObject)interfaces.$list88))), reader.bq_cons(current_record, (SubLObject)interfaces.$list75), reader.bq_cons(var, (SubLObject)interfaces.$list75), reader.bq_cons(depth_var, (SubLObject)interfaces.$list75), reader.bq_cons(next_generation_var, (SubLObject)interfaces.$list75)), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym76$WHILE, new SubLObject[] { queue_var, ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, current_record, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, queue_var)), ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, current_record)), ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, depth_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym89$CDR, current_record)), ConsesLow.list((SubLObject)interfaces.$sym79$CPOP, queue_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, next_generation_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym81$COPY_LIST, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym82$INTERFACE_PARENTS, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym83$INTERFACES_RETRIEVE_INTERFACE, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, current_record))))), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)interfaces.$list90, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym91$NEW_DEPTH, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym92$_, depth_var, (SubLObject)interfaces.$list93))), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym94$CDOLIST_COLLECTING, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym95$INTERFACE_NAME, next_generation_var, (SubLObject)interfaces.$list96), (SubLObject)interfaces.$list97), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym77$CSETQ, next_generation_var, (SubLObject)interfaces.$list96)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym80$NCONC, next_generation_var, queue_var)))) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 38600L)
    public static SubLObject do_interfaces_upward_with_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)interfaces.NIL;
        SubLObject depth_var = (SubLObject)interfaces.NIL;
        SubLObject start_interface = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        depth_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        start_interface = current.first();
        current = current.rest();
        if (interfaces.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return expand_do_interfaces_upward_with_depth(var, depth_var, start_interface, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)interfaces.$list98);
        return (SubLObject)interfaces.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 38780L)
    public static SubLObject expand_do_interfaces_downward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = Symbols.make_symbol((SubLObject)interfaces.$str72$queue);
        final SubLObject current_record = Symbols.make_symbol((SubLObject)interfaces.$str73$current_interface);
        final SubLObject next_generation_var = Symbols.make_symbol((SubLObject)interfaces.$str86$next_generation);
        return (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym74$LIST, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym87$CONS, start_interface, (SubLObject)interfaces.$list88))), reader.bq_cons(current_record, (SubLObject)interfaces.$list75), reader.bq_cons(var, (SubLObject)interfaces.$list75), reader.bq_cons(depth_var, (SubLObject)interfaces.$list75), reader.bq_cons(next_generation_var, (SubLObject)interfaces.$list75)), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym76$WHILE, new SubLObject[] { queue_var, ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, current_record, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, queue_var)), ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, current_record)), ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, depth_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym89$CDR, current_record)), ConsesLow.list((SubLObject)interfaces.$sym79$CPOP, queue_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, next_generation_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym81$COPY_LIST, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym85$INTERFACE_SUBINTERFACES, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym83$INTERFACES_RETRIEVE_INTERFACE, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym78$CAR, current_record))))), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)interfaces.$list90, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym91$NEW_DEPTH, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym92$_, depth_var, (SubLObject)interfaces.$list93))), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym94$CDOLIST_COLLECTING, (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym95$INTERFACE_NAME, next_generation_var, (SubLObject)interfaces.$list96), (SubLObject)interfaces.$list97), (SubLObject)ConsesLow.listS((SubLObject)interfaces.$sym77$CSETQ, next_generation_var, (SubLObject)interfaces.$list96)), (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym77$CSETQ, queue_var, (SubLObject)ConsesLow.list((SubLObject)interfaces.$sym80$NCONC, next_generation_var, queue_var)))) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interfaces.lisp", position = 39867L)
    public static SubLObject do_interfaces_downward_with_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)interfaces.NIL;
        SubLObject depth_var = (SubLObject)interfaces.NIL;
        SubLObject start_interface = (SubLObject)interfaces.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        depth_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)interfaces.$list98);
        start_interface = current.first();
        current = current.rest();
        if (interfaces.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return expand_do_interfaces_downward_with_depth(var, depth_var, start_interface, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)interfaces.$list98);
        return (SubLObject)interfaces.NIL;
    }
    
    public static SubLObject declare_interfaces_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_reset_interface_table", "INTERFACES-RESET-INTERFACE-TABLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "with_interface_marking", "WITH-INTERFACE-MARKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "display_interface", "DISPLAY-INTERFACE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "with_interface_definition_lock", "WITH-INTERFACE-DEFINITION-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_mark_interface", "INTERFACES-MARK-INTERFACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_remove_mark", "INTERFACES-REMOVE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_marked_p", "INTERFACES-MARKED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_unmark_all_marked_interfaces", "INTERFACES-UNMARK-ALL-MARKED-INTERFACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_retrieve_interface", "INTERFACES-RETRIEVE-INTERFACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_intern_interface", "INTERFACES-INTERN-INTERFACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_delete_interface", "INTERFACES-DELETE-INTERFACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_inheritance_path_from_above", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_inheritance_path_from_above_aux", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compiled_inheritance_path_downward", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compiled_inheritance_path_downward_aux", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_instance_method_decls_from_above", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_instance_method_decls_from_above_aux", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compile_instance_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compile_instance_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_class_method_decls_from_above", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_compile_class_method_decls_from_above_aux", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compile_class_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_transmit_compile_class_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_interface_predicator", "EXPAND-INTERFACE-PREDICATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_instanceof_interface", "SUBLOOP-INSTANCEOF-INTERFACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_define_interface", "EXPAND-DEFINE-INTERFACE", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "define_interface", "DEFINE-INTERFACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "new_interface", "NEW-INTERFACE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_check_parent_interfaces", "INTERFACES-CHECK-PARENT-INTERFACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_must_be_valid_method_interface_decl", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_must_be_valid_method_interface_decl_list", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_add_interface_class_method", "INTERFACES-ADD-INTERFACE-CLASS-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_def_class_method_template", "EXPAND-DEF-CLASS-METHOD-TEMPLATE", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "def_class_method_template", "DEF-CLASS-METHOD-TEMPLATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_add_interface_instance_method", "INTERFACES-ADD-INTERFACE-INSTANCE-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_def_instance_method_template", "EXPAND-DEF-INSTANCE-METHOD-TEMPLATE", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "def_instance_method_template", "DEF-INSTANCE-METHOD-TEMPLATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_find_class_method_internal", "INTERFACES-FIND-CLASS-METHOD-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_find_class_method", "INTERFACES-FIND-CLASS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_find_instance_method_internal", "INTERFACES-FIND-INSTANCE-METHOD-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_find_instance_method", "INTERFACES-FIND-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_class_method_to_listed_def_class_method", "INTERFACES-CLASS-METHOD-TO-LISTED-DEF-CLASS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_instance_method_to_listed_def_instance_method", "INTERFACES-INSTANCE-METHOD-TO-LISTED-DEF-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_implements_p", "INTERFACES-IMPLEMENTS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_collect_method_decls", "INTERFACES-COLLECT-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_all_methods_of_interface", "SUBLOOP-ALL-METHODS-OF-INTERFACE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "interface_get_property_internal", "INTERFACE-GET-PROPERTY-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interface_get_property", "INTERFACE-GET-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interface_set_property_internal", "INTERFACE-SET-PROPERTY-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interface_set_property", "INTERFACE-SET-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_all_classes_implementing_interface", "SUBLOOP-ALL-CLASSES-IMPLEMENTING-INTERFACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_all_interfaces_of_class", "SUBLOOP-ALL-INTERFACES-OF-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_all_instance_method_decls_of_interface", "SUBLOOP-ALL-INSTANCE-METHOD-DECLS-OF-INTERFACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "subloop_all_class_method_decls_of_interface", "SUBLOOP-ALL-CLASS-METHOD-DECLS-OF-INTERFACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "interfaces_who_introduced_method", "INTERFACES-WHO-INTRODUCED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_do_interfaces_upward", "EXPAND-DO-INTERFACES-UPWARD", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "do_interfaces_upward", "DO-INTERFACES-UPWARD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_do_interfaces_downward", "EXPAND-DO-INTERFACES-DOWNWARD", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "do_interfaces_downward", "DO-INTERFACES-DOWNWARD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_do_interfaces_upward_with_depth", "EXPAND-DO-INTERFACES-UPWARD-WITH-DEPTH", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "do_interfaces_upward_with_depth", "DO-INTERFACES-UPWARD-WITH-DEPTH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interfaces", "expand_do_interfaces_downward_with_depth", "EXPAND-DO-INTERFACES-DOWNWARD-WITH-DEPTH", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.interfaces", "do_interfaces_downward_with_depth", "DO-INTERFACES-DOWNWARD-WITH-DEPTH");
        return (SubLObject)interfaces.NIL;
    }
    
    public static SubLObject init_interfaces_file() {
        interfaces.$interfaces_initial_hashtable_size$ = SubLFiles.defconstant("*INTERFACES-INITIAL-HASHTABLE-SIZE*", (SubLObject)interfaces.$int0$400);
        interfaces.$interfaces_interface_table_update_lock$ = SubLFiles.defparameter("*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*", Locks.make_lock((SubLObject)interfaces.$str1$Interface_Table_Update_Lock));
        interfaces.$interfaces_interface_table$ = SubLFiles.deflexical("*INTERFACES-INTERFACE-TABLE*", maybeDefault((SubLObject)interfaces.$sym2$_INTERFACES_INTERFACE_TABLE_, interfaces.$interfaces_interface_table$, ()->(Hashtables.make_hash_table(interfaces.$interfaces_initial_hashtable_size$.getGlobalValue(), (SubLObject)interfaces.UNPROVIDED, (SubLObject)interfaces.UNPROVIDED))));
        interfaces.$interfaces_alist_of_all_interfaces$ = SubLFiles.deflexical("*INTERFACES-ALIST-OF-ALL-INTERFACES*", (SubLObject)(maybeDefault((SubLObject)interfaces.$sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_, interfaces.$interfaces_alist_of_all_interfaces$, interfaces.NIL)));
        interfaces.$interfaces_marked_interfaces$ = SubLFiles.defparameter("*INTERFACES-MARKED-INTERFACES*", (SubLObject)interfaces.NIL);
        interfaces.$interface_method_impossible_properties$ = SubLFiles.defconstant("*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*", (SubLObject)interfaces.$list4);
        interfaces.$interface_method_required_properties$ = SubLFiles.defconstant("*INTERFACE-METHOD-REQUIRED-PROPERTIES*", (SubLObject)interfaces.$list5);
        interfaces.$invalid_interface_method_name_message$ = SubLFiles.defconstant("*INVALID-INTERFACE-METHOD-NAME-MESSAGE*", (SubLObject)interfaces.$str51$The_interface_method_name__S_is_n);
        interfaces.$invalid_interface_name_message$ = SubLFiles.defconstant("*INVALID-INTERFACE-NAME-MESSAGE*", (SubLObject)interfaces.$str52$The_interface_name__S_is_not_a_va);
        interfaces.$undeclare_method_name_message$ = SubLFiles.defconstant("*UNDECLARE-METHOD-NAME-MESSAGE*", (SubLObject)interfaces.$str53$The_method__S_of_interface__S_is_);
        interfaces.$non_existing_interface_message$ = SubLFiles.defconstant("*NON-EXISTING-INTERFACE-MESSAGE*", (SubLObject)interfaces.$str54$The_interface__S_which_appears_in);
        interfaces.$invalid_lambda_list_message$ = SubLFiles.defconstant("*INVALID-LAMBDA-LIST-MESSAGE*", (SubLObject)interfaces.$str55$Lambda_list__S_of_method__S_of_in);
        return (SubLObject)interfaces.NIL;
    }
    
    public static SubLObject setup_interfaces_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)interfaces.$sym2$_INTERFACES_INTERFACE_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)interfaces.$sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_);
        access_macros.register_macro_helper((SubLObject)interfaces.$sym37$SUBLOOP_INSTANCEOF_INTERFACE, (SubLObject)interfaces.$sym39$NEW_INTERFACE);
        return (SubLObject)interfaces.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_interfaces_file();
    }
    
    @Override
	public void initializeVariables() {
        init_interfaces_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_interfaces_file();
    }
    
    static {
        me = (SubLFile)new interfaces();
        interfaces.$interfaces_initial_hashtable_size$ = null;
        interfaces.$interfaces_interface_table_update_lock$ = null;
        interfaces.$interfaces_interface_table$ = null;
        interfaces.$interfaces_alist_of_all_interfaces$ = null;
        interfaces.$interfaces_marked_interfaces$ = null;
        interfaces.$interface_method_impossible_properties$ = null;
        interfaces.$interface_method_required_properties$ = null;
        interfaces.$invalid_interface_method_name_message$ = null;
        interfaces.$invalid_interface_name_message$ = null;
        interfaces.$undeclare_method_name_message$ = null;
        interfaces.$non_existing_interface_message$ = null;
        interfaces.$invalid_lambda_list_message$ = null;
        $int0$400 = SubLObjectFactory.makeInteger(400);
        $str1$Interface_Table_Update_Lock = SubLObjectFactory.makeString("Interface Table Update Lock");
        $sym2$_INTERFACES_INTERFACE_TABLE_ = SubLObjectFactory.makeSymbol("*INTERFACES-INTERFACE-TABLE*");
        $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_ = SubLObjectFactory.makeSymbol("*INTERFACES-ALIST-OF-ALL-INTERFACES*");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"));
        $sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INTERFACES-MARKED-INTERFACES*"), (SubLObject)interfaces.NIL));
        $sym8$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym9$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERFACES-UNMARK-ALL-MARKED-INTERFACES"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERFACES-MARKED-INTERFACES*")));
        $str11$__Describing_Interface__S = SubLObjectFactory.makeString("~%Describing Interface ~S");
        $str12$____name_____S = SubLObjectFactory.makeString("~%  name -> ~S");
        $str13$____parents_____S = SubLObjectFactory.makeString("~%  parents -> ~S");
        $str14$____compiled_inheritance_path____ = SubLObjectFactory.makeString("~%  compiled-inheritance-path -> ~S");
        $str15$____subinterfaces_____S = SubLObjectFactory.makeString("~%  subinterfaces -> ~S");
        $str16$____implementers_____S = SubLObjectFactory.makeString("~%  implementers -> ~S");
        $str17$____instance_method_decls_____S = SubLObjectFactory.makeString("~%  instance-method-decls -> ~S");
        $str18$____class_method_decls_____S = SubLObjectFactory.makeString("~%  class-method-decls -> ~S");
        $str19$____compiled_instance_method_decl = SubLObjectFactory.makeString("~%  compiled-instance-method-decls -> ~S");
        $str20$____compiled_class_method_decls__ = SubLObjectFactory.makeString("~%  compiled-class-method-decls -> ~S");
        $str21$____local_class_methods_____S = SubLObjectFactory.makeString("~%  local-class-methods -> ~S");
        $str22$____local_instance_methods_____S = SubLObjectFactory.makeString("~%  local-instance-methods -> ~S");
        $str23$___S_is_not_an_interface_ = SubLObjectFactory.makeString("~%~S is not an interface.");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERFACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym26$INTERFACE_DEFINITION_LOCK = SubLObjectFactory.makeSymbol("INTERFACE-DEFINITION-LOCK");
        $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE = SubLObjectFactory.makeKeyword("COMPILED-INHERITANCE-PATH-FROM-ABOVE");
        $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD = SubLObjectFactory.makeKeyword("TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD");
        $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE = SubLObjectFactory.makeKeyword("COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE");
        $sym30$CADR = SubLObjectFactory.makeSymbol("CADR");
        $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD = SubLObjectFactory.makeKeyword("TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD");
        $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE = SubLObjectFactory.makeKeyword("COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE");
        $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD = SubLObjectFactory.makeKeyword("TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD");
        $str34$_P = SubLObjectFactory.makeString("-P");
        $sym35$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym36$RET = SubLObjectFactory.makeSymbol("RET");
        $sym37$SUBLOOP_INSTANCEOF_INTERFACE = SubLObjectFactory.makeSymbol("SUBLOOP-INSTANCEOF-INTERFACE");
        $sym38$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym39$NEW_INTERFACE = SubLObjectFactory.makeSymbol("NEW-INTERFACE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERFACE-NAME-AND-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLS"));
        $kw41$EXTENDS = SubLObjectFactory.makeKeyword("EXTENDS");
        $str42$__Interface_names_must_be_a_symbo = SubLObjectFactory.makeString("~%Interface names must be a symbol.  ~S is an invalid interface name.");
        $str43$__Interface_names_must_not_be_NIL = SubLObjectFactory.makeString("~%Interface names must not be NIL.  NIL is an invalid interface name.");
        $str44$Interface_ = SubLObjectFactory.makeString("Interface ");
        $str45$_Definition_Lock = SubLObjectFactory.makeString(" Definition Lock");
        $str46$___S_is_not_a_valid_parent_interf = SubLObjectFactory.makeString("~%~S is not a valid parent interface specification.");
        $str47$___S_is_not_a_valid_parent_interf = SubLObjectFactory.makeString("~%~S is not a valid parent interface.");
        $str48$__Parent_interface__S_is_undefine = SubLObjectFactory.makeString("~%Parent interface ~S is undefined.");
        $str49$___S_is_not_a_valid_interface_met = SubLObjectFactory.makeString("~%~S is not a valid interface method declaration.");
        $str50$___S_is_not_a_valid_interface_met = SubLObjectFactory.makeString("~%~S is not a valid interface method declaration sequence.");
        $str51$The_interface_method_name__S_is_n = SubLObjectFactory.makeString("The interface method name ~S is not a valid method name.  Valid method names must be non-nil symbols.");
        $str52$The_interface_name__S_is_not_a_va = SubLObjectFactory.makeString("The interface name ~S is not a valid interface name.  Valid interface names must be non-nil symbols.");
        $str53$The_method__S_of_interface__S_is_ = SubLObjectFactory.makeString("The method ~S of interface ~S is undeclared.  The method must be declared within the body of a define-interface.");
        $str54$The_interface__S_which_appears_in = SubLObjectFactory.makeString("The interface ~S which appears in a method declaration does not exist.");
        $str55$Lambda_list__S_of_method__S_of_in = SubLObjectFactory.makeString("Lambda list ~S of method ~S of interface ~S is not a valid lambda list.");
        $sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD = SubLObjectFactory.makeSymbol("INTERFACES-ADD-INTERFACE-CLASS-METHOD");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INTERFACE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("INTERFACES-ADD-INTERFACE-INSTANCE-METHOD");
        $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL = SubLObjectFactory.makeKeyword("INTERFACES-FIND-CLASS-METHOD-INTERNAL");
        $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL = SubLObjectFactory.makeKeyword("INTERFACES-FIND-INSTANCE-METHOD-INTERNAL");
        $sym61$DEF_CLASS_METHOD = SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD");
        $kw62$BEFORE_LISTENERS = SubLObjectFactory.makeKeyword("BEFORE-LISTENERS");
        $kw63$AFTER_LISTENERS = SubLObjectFactory.makeKeyword("AFTER-LISTENERS");
        $sym64$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_ = SubLObjectFactory.makeString("SUBLOOP-ALL-METHODS-OF-INTERFACE: ~S is not an interface.");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERFACE"), (SubLObject)SubLObjectFactory.makeSymbol("INDICATOR"));
        $sym67$CLASSES_GETF = SubLObjectFactory.makeSymbol("CLASSES-GETF");
        $sym68$INTERFACE_PLIST = SubLObjectFactory.makeSymbol("INTERFACE-PLIST");
        $str69$interface = SubLObjectFactory.makeString("interface");
        $sym70$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym71$CLASSES_PUTF = SubLObjectFactory.makeSymbol("CLASSES-PUTF");
        $str72$queue = SubLObjectFactory.makeString("queue");
        $str73$current_interface = SubLObjectFactory.makeString("current-interface");
        $sym74$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list75 = ConsesLow.list((SubLObject)interfaces.NIL);
        $sym76$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym77$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym78$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym79$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym80$NCONC = SubLObjectFactory.makeSymbol("NCONC");
        $sym81$COPY_LIST = SubLObjectFactory.makeSymbol("COPY-LIST");
        $sym82$INTERFACE_PARENTS = SubLObjectFactory.makeSymbol("INTERFACE-PARENTS");
        $sym83$INTERFACES_RETRIEVE_INTERFACE = SubLObjectFactory.makeSymbol("INTERFACES-RETRIEVE-INTERFACE");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("START-INTERFACE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym85$INTERFACE_SUBINTERFACES = SubLObjectFactory.makeSymbol("INTERFACE-SUBINTERFACES");
        $str86$next_generation = SubLObjectFactory.makeString("next-generation");
        $sym87$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list88 = ConsesLow.list((SubLObject)interfaces.ZERO_INTEGER);
        $sym89$CDR = SubLObjectFactory.makeSymbol("CDR");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESSED-NEXT-GENERATION"), (SubLObject)interfaces.NIL);
        $sym91$NEW_DEPTH = SubLObjectFactory.makeSymbol("NEW-DEPTH");
        $sym92$_ = SubLObjectFactory.makeSymbol("+");
        $list93 = ConsesLow.list((SubLObject)interfaces.ONE_INTEGER);
        $sym94$CDOLIST_COLLECTING = SubLObjectFactory.makeSymbol("CDOLIST-COLLECTING");
        $sym95$INTERFACE_NAME = SubLObjectFactory.makeSymbol("INTERFACE-NAME");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESSED-NEXT-GENERATION"));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("INTERFACE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DEPTH")));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("START-INTERFACE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
    }
}

/*

	Total time: 452 ms
	
*/