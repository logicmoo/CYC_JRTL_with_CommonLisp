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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inverted_index extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inverted_index";
    public static final String myFingerPrint = "b96b97c2d1987939c5875acfb7af848094e7dc4aa37643f632c599399f06e143";
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLSymbol $dtp_indexed_items$;
    private static final SubLSymbol $sym0$INVERTED_INDEX;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INDEXED_ITEMS;
    private static final SubLSymbol $sym4$VALUE_TEST;
    private static final SubLSymbol $sym5$INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym6$PHYSICAL_INDEX;
    private static final SubLSymbol $sym7$INSTANCE_COUNT;
    private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS;
    private static final SubLSymbol $sym9$ISOLATED_P;
    private static final SubLSymbol $sym10$INSTANCE_NUMBER;
    private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE;
    private static final SubLSymbol $sym12$ISOLATE;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym16$INVERTED_INDEX_ISOLATE_METHOD;
    private static final SubLSymbol $sym17$INDEX_AN_ITEM;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
    private static final SubLString $str21$trying_to_index__S_before_the_ind;
    private static final SubLSymbol $sym22$COMPUTE_INDEX_ENTRIES;
    private static final SubLSymbol $sym23$INSERT;
    private static final SubLSymbol $sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym33$INVERTED_INDEX_INSERT_METHOD;
    private static final SubLSymbol $sym34$INDEXED_ITEMS_P;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$INDEXED_ITEMS_NEXT_INDEX;
    private static final SubLSymbol $sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX;
    private static final SubLSymbol $sym44$INDEXED_ITEMS_ITEM_SUID_MAP;
    private static final SubLSymbol $sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP;
    private static final SubLSymbol $sym46$INDEXED_ITEMS_SUID_ITEM_MAP;
    private static final SubLSymbol $sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP;
    private static final SubLSymbol $kw48$NEXT_INDEX;
    private static final SubLSymbol $kw49$ITEM_SUID_MAP;
    private static final SubLSymbol $kw50$SUID_ITEM_MAP;
    private static final SubLString $str51$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw52$BEGIN;
    private static final SubLSymbol $sym53$MAKE_INDEXED_ITEMS;
    private static final SubLSymbol $kw54$SLOT;
    private static final SubLSymbol $kw55$END;
    private static final SubLSymbol $sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD;
    private static final SubLInteger $int57$50;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS;
    private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$INDEX_STRUCTURE;
    private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS;
    private static final SubLSymbol $sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE;
    private static final SubLSymbol $sym65$IN_MEMORY_INDEX;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$VAL_TEST;
    private static final SubLSymbol $sym68$DICTIONARY_INDEX;
    private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS;
    private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$IN_MEMORY_INDEX_ISOLATE_METHOD;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
    private static final SubLSymbol $sym75$IN_MEMORY_INDEX_INSERT_METHOD;
    private static final SubLSymbol $sym76$LOOKUP;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
    private static final SubLSymbol $sym80$IN_MEMORY_INDEX_LOOKUP_METHOD;
    private static final SubLSymbol $sym81$REMOVE;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
    private static final SubLSymbol $sym84$IN_MEMORY_INDEX_REMOVE_METHOD;
    private static final SubLSymbol $sym85$IN_MEMORY_EQUALP_INDEX;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS;
    private static final SubLSymbol $sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE;
    private static final SubLSymbol $sym89$INITIALIZE;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD;
    private static final SubLSymbol $sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD;
    private static final SubLSymbol $sym94$IN_MEMORY_EQUAL_INDEX;
    private static final SubLSymbol $sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS;
    private static final SubLSymbol $sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD;
    private static final SubLSymbol $sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD;
    private static final SubLSymbol $sym100$IN_MEMORY_EQ_INDEX;
    private static final SubLSymbol $sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS;
    private static final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD;
    private static final SubLSymbol $sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD;
    private static final SubLSymbol $sym106$SIMPLE_STRING_INDEX;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS;
    private static final SubLSymbol $sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
    private static final SubLSymbol $sym112$STRING_INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
    private static final SubLSymbol $sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD;
    private static final SubLSymbol $sym118$REMOVE_VALUE;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
    private static final SubLSymbol $sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS;
    private static final SubLSymbol $sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject get_inverted_index_indexed_items(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, (SubLObject)inverted_index.FOUR_INTEGER, (SubLObject)inverted_index.$sym3$INDEXED_ITEMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject set_inverted_index_indexed_items(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, (SubLObject)inverted_index.FOUR_INTEGER, (SubLObject)inverted_index.$sym3$INDEXED_ITEMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject get_inverted_index_value_test(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, (SubLObject)inverted_index.THREE_INTEGER, (SubLObject)inverted_index.$sym4$VALUE_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject set_inverted_index_value_test(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, (SubLObject)inverted_index.THREE_INTEGER, (SubLObject)inverted_index.$sym4$VALUE_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject get_inverted_index_index_entry_computer(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, (SubLObject)inverted_index.TWO_INTEGER, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject set_inverted_index_index_entry_computer(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, (SubLObject)inverted_index.TWO_INTEGER, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject get_inverted_index_physical_index(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, (SubLObject)inverted_index.ONE_INTEGER, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject set_inverted_index_physical_index(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, (SubLObject)inverted_index.ONE_INTEGER, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject subloop_reserved_initialize_inverted_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject subloop_reserved_initialize_inverted_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym4$VALUE_TEST, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym3$INDEXED_ITEMS, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
    public static SubLObject inverted_index_p(final SubLObject v_inverted_index) {
        return classes.subloop_instanceof_class(v_inverted_index, (SubLObject)inverted_index.$sym0$INVERTED_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2236L)
    public static SubLObject inverted_index_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(physical_index, (SubLObject)inverted_index.$sym12$ISOLATE);
                object.object_isolate_method(self);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2378L)
    public static SubLObject inverted_index_index_an_item_method(final SubLObject self, final SubLObject index_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                if (inverted_index.NIL == index_entry_computer_p(index_entry_computer) || inverted_index.NIL == physical_index_p(physical_index)) {
                    Errors.error((SubLObject)inverted_index.$str21$trying_to_index__S_before_the_ind, index_item);
                }
                SubLObject cdolist_list_var;
                final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(index_entry_computer, (SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, index_item);
                SubLObject entry = (SubLObject)inverted_index.NIL;
                entry = cdolist_list_var.first();
                while (inverted_index.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index.$sym23$INSERT, entry);
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2832L)
    public static SubLObject inverted_index_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        try {
            thread.throwStack.push(inverted_index.$sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args(index_entry_computer, (SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, item_to_index));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3011L)
    public static SubLObject inverted_index_insert_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index.$sym23$INSERT, index_entry));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3150L)
    public static SubLObject new_inverted_index_entry(final SubLObject key, final SubLObject value) {
        return (SubLObject)ConsesLow.list(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3328L)
    public static SubLObject index_entry_key(final SubLObject index_entry) {
        return index_entry.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3404L)
    public static SubLObject index_entry_value(final SubLObject index_entry) {
        return conses_high.second(index_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject indexed_items_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject indexed_items_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $indexed_items_native.class) ? inverted_index.T : inverted_index.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject indexed_items_next_index(final SubLObject v_object) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject indexed_items_item_suid_map(final SubLObject v_object) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject indexed_items_suid_item_map(final SubLObject v_object) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject _csetf_indexed_items_next_index(final SubLObject v_object, final SubLObject value) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject _csetf_indexed_items_item_suid_map(final SubLObject v_object, final SubLObject value) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject _csetf_indexed_items_suid_item_map(final SubLObject v_object, final SubLObject value) {
        assert inverted_index.NIL != indexed_items_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject make_indexed_items(SubLObject arglist) {
        if (arglist == inverted_index.UNPROVIDED) {
            arglist = (SubLObject)inverted_index.NIL;
        }
        final SubLObject v_new = (SubLObject)new $indexed_items_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inverted_index.NIL, next = arglist; inverted_index.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inverted_index.$kw48$NEXT_INDEX)) {
                _csetf_indexed_items_next_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inverted_index.$kw49$ITEM_SUID_MAP)) {
                _csetf_indexed_items_item_suid_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inverted_index.$kw50$SUID_ITEM_MAP)) {
                _csetf_indexed_items_suid_item_map(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inverted_index.$str51$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject visit_defstruct_indexed_items(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inverted_index.$kw52$BEGIN, (SubLObject)inverted_index.$sym53$MAKE_INDEXED_ITEMS, (SubLObject)inverted_index.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inverted_index.$kw54$SLOT, (SubLObject)inverted_index.$kw48$NEXT_INDEX, indexed_items_next_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inverted_index.$kw54$SLOT, (SubLObject)inverted_index.$kw49$ITEM_SUID_MAP, indexed_items_item_suid_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inverted_index.$kw54$SLOT, (SubLObject)inverted_index.$kw50$SUID_ITEM_MAP, indexed_items_suid_item_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inverted_index.$kw55$END, (SubLObject)inverted_index.$sym53$MAKE_INDEXED_ITEMS, (SubLObject)inverted_index.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
    public static SubLObject visit_defstruct_object_indexed_items_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_indexed_items(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3932L)
    public static SubLObject new_indexed_items() {
        final SubLObject result = make_indexed_items((SubLObject)inverted_index.UNPROVIDED);
        _csetf_indexed_items_next_index(result, (SubLObject)inverted_index.ZERO_INTEGER);
        _csetf_indexed_items_item_suid_map(result, dictionary.new_dictionary((SubLObject)inverted_index.EQUAL, (SubLObject)inverted_index.UNPROVIDED));
        _csetf_indexed_items_suid_item_map(result, Vectors.make_vector((SubLObject)inverted_index.$int57$50, (SubLObject)inverted_index.UNPROVIDED));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 4218L)
    public static SubLObject maybe_add_new_indexed_item(final SubLObject indexed_items, final SubLObject item) {
        SubLObject suid = dictionary.dictionary_lookup(indexed_items_item_suid_map(indexed_items), item, (SubLObject)inverted_index.UNPROVIDED);
        if (suid.isInteger()) {
            return suid;
        }
        suid = indexed_items_next_index(indexed_items);
        _csetf_indexed_items_next_index(indexed_items, Numbers.add(indexed_items_next_index(indexed_items), (SubLObject)inverted_index.ONE_INTEGER));
        dictionary.dictionary_enter(indexed_items_item_suid_map(indexed_items), item, suid);
        if (indexed_items_next_index(indexed_items).numG(Sequences.length(indexed_items_suid_item_map(indexed_items)))) {
            _csetf_indexed_items_suid_item_map(indexed_items, vector_utilities.grow_vector(indexed_items_suid_item_map(indexed_items), (SubLObject)inverted_index.UNPROVIDED, (SubLObject)inverted_index.UNPROVIDED));
        }
        Vectors.set_aref(indexed_items_suid_item_map(indexed_items), suid, item);
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5285L)
    public static SubLObject get_item_from_index_suid(final SubLObject indexed_items, final SubLObject suid) {
        return Vectors.aref(indexed_items_suid_item_map(indexed_items), suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
    public static SubLObject subloop_reserved_initialize_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
    public static SubLObject subloop_reserved_initialize_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
    public static SubLObject index_entry_computer_p(final SubLObject index_entry_computer) {
        return classes.subloop_instanceof_class(index_entry_computer, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
    public static SubLObject get_physical_index_index_structure(final SubLObject physical_index) {
        return classes.subloop_get_access_protected_instance_slot(physical_index, (SubLObject)inverted_index.ONE_INTEGER, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
    public static SubLObject set_physical_index_index_structure(final SubLObject physical_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(physical_index, value, (SubLObject)inverted_index.ONE_INTEGER, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
    public static SubLObject subloop_reserved_initialize_physical_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
    public static SubLObject subloop_reserved_initialize_physical_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
    public static SubLObject physical_index_p(final SubLObject physical_index) {
        return classes.subloop_instanceof_class(physical_index, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject get_in_memory_index_val_test(final SubLObject in_memory_index) {
        return classes.subloop_get_access_protected_instance_slot(in_memory_index, (SubLObject)inverted_index.THREE_INTEGER, (SubLObject)inverted_index.$sym67$VAL_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject set_in_memory_index_val_test(final SubLObject in_memory_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(in_memory_index, value, (SubLObject)inverted_index.THREE_INTEGER, (SubLObject)inverted_index.$sym67$VAL_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject get_in_memory_index_dictionary_index(final SubLObject in_memory_index) {
        return classes.subloop_get_access_protected_instance_slot(in_memory_index, (SubLObject)inverted_index.TWO_INTEGER, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject set_in_memory_index_dictionary_index(final SubLObject in_memory_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(in_memory_index, value, (SubLObject)inverted_index.TWO_INTEGER, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject subloop_reserved_initialize_in_memory_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject subloop_reserved_initialize_in_memory_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym67$VAL_TEST, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
    public static SubLObject in_memory_index_p(final SubLObject in_memory_index) {
        return classes.subloop_instanceof_class(in_memory_index, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6668L)
    public static SubLObject in_memory_index_isolate_method(final SubLObject self) {
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6743L)
    public static SubLObject in_memory_index_insert_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                dictionary_utilities.dictionary_pushnew(dictionary_index, index_entry_key(index_entry), index_entry_value(index_entry), (SubLObject)inverted_index.UNPROVIDED, (SubLObject)inverted_index.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6940L)
    public static SubLObject in_memory_index_lookup_method(final SubLObject self, final SubLObject index_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, dictionary.dictionary_lookup(dictionary_index, index_key, (SubLObject)inverted_index.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7064L)
    public static SubLObject in_memory_index_remove_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject val_test = get_in_memory_index_val_test(self);
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                dictionary_utilities.dictionary_remove_from_value(dictionary_index, index_entry_key(index_entry), index_entry_value(index_entry), val_test, (SubLObject)inverted_index.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
    public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
    public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym67$VAL_TEST, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
    public static SubLObject in_memory_equalp_index_p(final SubLObject in_memory_equalp_index) {
        return classes.subloop_instanceof_class(in_memory_equalp_index, (SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7395L)
    public static SubLObject in_memory_equalp_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_equalp_index_method = (SubLObject)inverted_index.NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD);
            try {
                val_test = (SubLObject)inverted_index.EQUALP;
                dictionary_index = dictionary.new_dictionary(val_test, (SubLObject)inverted_index.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_equalp_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_equalp_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
    public static SubLObject subloop_reserved_initialize_in_memory_equal_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
    public static SubLObject subloop_reserved_initialize_in_memory_equal_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym67$VAL_TEST, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
    public static SubLObject in_memory_equal_index_p(final SubLObject in_memory_equal_index) {
        return classes.subloop_instanceof_class(in_memory_equal_index, (SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7635L)
    public static SubLObject in_memory_equal_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_equal_index_method = (SubLObject)inverted_index.NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD);
            try {
                val_test = Symbols.symbol_function((SubLObject)inverted_index.EQUAL);
                dictionary_index = dictionary.new_dictionary(val_test, (SubLObject)inverted_index.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_equal_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_equal_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
    public static SubLObject subloop_reserved_initialize_in_memory_eq_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
    public static SubLObject subloop_reserved_initialize_in_memory_eq_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym62$INDEX_STRUCTURE, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym68$DICTIONARY_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym67$VAL_TEST, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
    public static SubLObject in_memory_eq_index_p(final SubLObject in_memory_eq_index) {
        return classes.subloop_instanceof_class(in_memory_eq_index, (SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7871L)
    public static SubLObject in_memory_eq_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_eq_index_method = (SubLObject)inverted_index.NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD);
            try {
                val_test = (SubLObject)inverted_index.EQ;
                dictionary_index = dictionary.new_dictionary(val_test, (SubLObject)inverted_index.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_in_memory_eq_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_eq_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
    public static SubLObject subloop_reserved_initialize_simple_string_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
    public static SubLObject subloop_reserved_initialize_simple_string_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym4$VALUE_TEST, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym3$INDEXED_ITEMS, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
    public static SubLObject simple_string_index_p(final SubLObject simple_string_index) {
        return classes.subloop_instanceof_class(simple_string_index, (SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8451L)
    public static SubLObject simple_string_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = (SubLObject)inverted_index.NIL;
        SubLObject indexed_items = get_inverted_index_indexed_items(self);
        SubLObject value_test = get_inverted_index_value_test(self);
        SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                indexed_items = new_indexed_items();
                value_test = Symbols.symbol_function((SubLObject)inverted_index.EQUALP);
                index_entry_computer = object.new_class_instance((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER);
                physical_index = object.new_class_instance((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_indexed_items(self, indexed_items);
                    set_inverted_index_value_test(self, value_test);
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8782L)
    public static SubLObject simple_string_index_lookup_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index.$sym76$LOOKUP, key));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8909L)
    public static SubLObject simple_string_index_remove_value_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = (SubLObject)inverted_index.NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index.$sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index.$sym81$REMOVE, index_entry);
                Dynamic.sublisp_throw((SubLObject)inverted_index.$sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index.$sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
    public static SubLObject subloop_reserved_initialize_string_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym7$INSTANCE_COUNT, (SubLObject)inverted_index.ZERO_INTEGER);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
    public static SubLObject subloop_reserved_initialize_string_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym9$ISOLATED_P, (SubLObject)inverted_index.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.$sym10$INSTANCE_NUMBER, (SubLObject)inverted_index.NIL);
        return (SubLObject)inverted_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
    public static SubLObject string_index_entry_computer_p(final SubLObject string_index_entry_computer) {
        return classes.subloop_instanceof_class(string_index_entry_computer, (SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9215L)
    public static SubLObject string_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index) {
        SubLObject result = (SubLObject)inverted_index.NIL;
        SubLObject list_var = (SubLObject)inverted_index.NIL;
        SubLObject word = (SubLObject)inverted_index.NIL;
        SubLObject num = (SubLObject)inverted_index.NIL;
        list_var = document.string_tokenize_via_wordify(item_to_index);
        word = list_var.first();
        for (num = (SubLObject)inverted_index.ZERO_INTEGER; inverted_index.NIL != list_var; list_var = list_var.rest(), word = list_var.first(), num = Numbers.add((SubLObject)inverted_index.ONE_INTEGER, num)) {
            result = (SubLObject)ConsesLow.cons(new_inverted_index_entry(word, (SubLObject)ConsesLow.list(num, item_to_index)), result);
        }
        return result;
    }
    
    public static SubLObject declare_inverted_index_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_inverted_index_indexed_items", "GET-INVERTED-INDEX-INDEXED-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_inverted_index_indexed_items", "SET-INVERTED-INDEX-INDEXED-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_inverted_index_value_test", "GET-INVERTED-INDEX-VALUE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_inverted_index_value_test", "SET-INVERTED-INDEX-VALUE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_inverted_index_index_entry_computer", "GET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_inverted_index_index_entry_computer", "SET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_inverted_index_physical_index", "GET-INVERTED-INDEX-PHYSICAL-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_inverted_index_physical_index", "SET-INVERTED-INDEX-PHYSICAL-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_inverted_index_class", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_inverted_index_instance", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "inverted_index_p", "INVERTED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "inverted_index_isolate_method", "INVERTED-INDEX-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "inverted_index_index_an_item_method", "INVERTED-INDEX-INDEX-AN-ITEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "inverted_index_compute_index_entries_method", "INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "inverted_index_insert_method", "INVERTED-INDEX-INSERT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "new_inverted_index_entry", "NEW-INVERTED-INDEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "index_entry_key", "INDEX-ENTRY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "index_entry_value", "INDEX-ENTRY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "indexed_items_print_function_trampoline", "INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "indexed_items_p", "INDEXED-ITEMS-P", 1, 0, false);
        new $indexed_items_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "indexed_items_next_index", "INDEXED-ITEMS-NEXT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "indexed_items_item_suid_map", "INDEXED-ITEMS-ITEM-SUID-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "indexed_items_suid_item_map", "INDEXED-ITEMS-SUID-ITEM-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "_csetf_indexed_items_next_index", "_CSETF-INDEXED-ITEMS-NEXT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "_csetf_indexed_items_item_suid_map", "_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "_csetf_indexed_items_suid_item_map", "_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "make_indexed_items", "MAKE-INDEXED-ITEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "visit_defstruct_indexed_items", "VISIT-DEFSTRUCT-INDEXED-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "visit_defstruct_object_indexed_items_method", "VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "new_indexed_items", "NEW-INDEXED-ITEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "maybe_add_new_indexed_item", "MAYBE-ADD-NEW-INDEXED-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_item_from_index_suid", "GET-ITEM-FROM-INDEX-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "index_entry_computer_p", "INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_physical_index_index_structure", "GET-PHYSICAL-INDEX-INDEX-STRUCTURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_physical_index_index_structure", "SET-PHYSICAL-INDEX-INDEX-STRUCTURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_physical_index_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_physical_index_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "physical_index_p", "PHYSICAL-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_in_memory_index_val_test", "GET-IN-MEMORY-INDEX-VAL-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_in_memory_index_val_test", "SET-IN-MEMORY-INDEX-VAL-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "get_in_memory_index_dictionary_index", "GET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "set_in_memory_index_dictionary_index", "SET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_index_p", "IN-MEMORY-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_index_isolate_method", "IN-MEMORY-INDEX-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_index_insert_method", "IN-MEMORY-INDEX-INSERT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_index_lookup_method", "IN-MEMORY-INDEX-LOOKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_index_remove_method", "IN-MEMORY-INDEX-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_equalp_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_equalp_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_equalp_index_p", "IN-MEMORY-EQUALP-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_equalp_index_initialize_method", "IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_equal_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_equal_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_equal_index_p", "IN-MEMORY-EQUAL-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_equal_index_initialize_method", "IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_eq_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_in_memory_eq_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_eq_index_p", "IN-MEMORY-EQ-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "in_memory_eq_index_initialize_method", "IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_simple_string_index_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_simple_string_index_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "simple_string_index_p", "SIMPLE-STRING-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "simple_string_index_initialize_method", "SIMPLE-STRING-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "simple_string_index_lookup_method", "SIMPLE-STRING-INDEX-LOOKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "simple_string_index_remove_value_method", "SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_string_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "subloop_reserved_initialize_string_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "string_index_entry_computer_p", "STRING-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index", "string_index_entry_computer_compute_index_entries_method", "STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        return (SubLObject)inverted_index.NIL;
    }
    
    public static SubLObject init_inverted_index_file() {
        inverted_index.$dtp_indexed_items$ = SubLFiles.defconstant("*DTP-INDEXED-ITEMS*", (SubLObject)inverted_index.$sym3$INDEXED_ITEMS);
        return (SubLObject)inverted_index.NIL;
    }
    
    public static SubLObject setup_inverted_index_file() {
        classes.subloop_new_class((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.T, (SubLObject)inverted_index.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE);
        subloop_reserved_initialize_inverted_index_class((SubLObject)inverted_index.$sym0$INVERTED_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym12$ISOLATE, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list14);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym12$ISOLATE, (SubLObject)inverted_index.$sym16$INVERTED_INDEX_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym17$INDEX_AN_ITEM, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list18, (SubLObject)inverted_index.$list19);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym17$INDEX_AN_ITEM, (SubLObject)inverted_index.$sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$list25, (SubLObject)inverted_index.$list26, (SubLObject)inverted_index.$list27);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index.$sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym23$INSERT, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$list25, (SubLObject)inverted_index.$list30, (SubLObject)inverted_index.$list31);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.$sym23$INSERT, (SubLObject)inverted_index.$sym33$INVERTED_INDEX_INSERT_METHOD);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inverted_index.$dtp_indexed_items$.getGlobalValue(), Symbols.symbol_function((SubLObject)inverted_index.$sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inverted_index.$list41);
        Structures.def_csetf((SubLObject)inverted_index.$sym42$INDEXED_ITEMS_NEXT_INDEX, (SubLObject)inverted_index.$sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX);
        Structures.def_csetf((SubLObject)inverted_index.$sym44$INDEXED_ITEMS_ITEM_SUID_MAP, (SubLObject)inverted_index.$sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP);
        Structures.def_csetf((SubLObject)inverted_index.$sym46$INDEXED_ITEMS_SUID_ITEM_MAP, (SubLObject)inverted_index.$sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP);
        Equality.identity((SubLObject)inverted_index.$sym3$INDEXED_ITEMS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inverted_index.$dtp_indexed_items$.getGlobalValue(), Symbols.symbol_function((SubLObject)inverted_index.$sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD));
        classes.subloop_new_class((SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.T, (SubLObject)inverted_index.$list58);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE);
        subloop_reserved_initialize_index_entry_computer_class((SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER);
        classes.subloop_new_class((SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym1$OBJECT, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.T, (SubLObject)inverted_index.$list61);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.$sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE);
        subloop_reserved_initialize_physical_index_class((SubLObject)inverted_index.$sym6$PHYSICAL_INDEX);
        classes.subloop_new_class((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym6$PHYSICAL_INDEX, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list66);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_index_class((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym12$ISOLATE, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list71);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym12$ISOLATE, (SubLObject)inverted_index.$sym72$IN_MEMORY_INDEX_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym23$INSERT, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list30, (SubLObject)inverted_index.$list73);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym23$INSERT, (SubLObject)inverted_index.$sym75$IN_MEMORY_INDEX_INSERT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym76$LOOKUP, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list77, (SubLObject)inverted_index.$list78);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym76$LOOKUP, (SubLObject)inverted_index.$sym80$IN_MEMORY_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym81$REMOVE, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list30, (SubLObject)inverted_index.$list82);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.$sym81$REMOVE, (SubLObject)inverted_index.$sym84$IN_MEMORY_INDEX_REMOVE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list86);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.$sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.$sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_equalp_index_class((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.$list90, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list91);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym85$IN_MEMORY_EQUALP_INDEX, (SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.$sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.$sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_equal_index_class((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.$list90, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list97);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym94$IN_MEMORY_EQUAL_INDEX, (SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.$sym65$IN_MEMORY_INDEX, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.$sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.$sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_eq_index_class((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.$list90, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list103);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym100$IN_MEMORY_EQ_INDEX, (SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym0$INVERTED_INDEX, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list107);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE);
        subloop_reserved_initialize_simple_string_index_class((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$list90, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list110);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym89$INITIALIZE, (SubLObject)inverted_index.$sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym76$LOOKUP, (SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list114, (SubLObject)inverted_index.$list115);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym76$LOOKUP, (SubLObject)inverted_index.$sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym118$REMOVE_VALUE, (SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$list13, (SubLObject)inverted_index.$list30, (SubLObject)inverted_index.$list119);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym106$SIMPLE_STRING_INDEX, (SubLObject)inverted_index.$sym118$REMOVE_VALUE, (SubLObject)inverted_index.$sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym5$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.NIL, (SubLObject)inverted_index.$list122);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE);
        subloop_reserved_initialize_string_index_entry_computer_class((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$list90, (SubLObject)inverted_index.$list26, (SubLObject)inverted_index.$list125);
        methods.subloop_register_instance_method((SubLObject)inverted_index.$sym112$STRING_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index.$sym22$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index.$sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD);
        return (SubLObject)inverted_index.NIL;
    }
    
    public void declareFunctions() {
        declare_inverted_index_file();
    }
    
    public void initializeVariables() {
        init_inverted_index_file();
    }
    
    public void runTopLevelForms() {
        setup_inverted_index_file();
    }
    
    static {
        me = (SubLFile)new inverted_index();
        inverted_index.$dtp_indexed_items$ = null;
        $sym0$INVERTED_INDEX = SubLObjectFactory.makeSymbol("INVERTED-INDEX");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-AN-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSERT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXABLE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)inverted_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)inverted_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$INDEXED_ITEMS = SubLObjectFactory.makeSymbol("INDEXED-ITEMS");
        $sym4$VALUE_TEST = SubLObjectFactory.makeSymbol("VALUE-TEST");
        $sym5$INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER");
        $sym6$PHYSICAL_INDEX = SubLObjectFactory.makeSymbol("PHYSICAL-INDEX");
        $sym7$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS");
        $sym9$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym10$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE");
        $sym12$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");
        $sym16$INVERTED_INDEX_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("INVERTED-INDEX-ISOLATE-METHOD");
        $sym17$INDEX_AN_ITEM = SubLObjectFactory.makeSymbol("INDEX-AN-ITEM");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER-P"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX-P"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("trying to index ~S before the index has been properly initialized"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ITEM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSERT")), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");
        $str21$trying_to_index__S_before_the_ind = SubLObjectFactory.makeString("trying to index ~S before the index has been properly initialized");
        $sym22$COMPUTE_INDEX_ENTRIES = SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES");
        $sym23$INSERT = SubLObjectFactory.makeSymbol("INSERT");
        $sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD = SubLObjectFactory.makeSymbol("INVERTED-INDEX-INDEX-AN-ITEM-METHOD");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX"))));
        $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");
        $sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSERT")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY"))));
        $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");
        $sym33$INVERTED_INDEX_INSERT_METHOD = SubLObjectFactory.makeSymbol("INVERTED-INDEX-INSERT-METHOD");
        $sym34$INDEXED_ITEMS_P = SubLObjectFactory.makeSymbol("INDEXED-ITEMS-P");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-SUID-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("SUID-ITEM-MAP"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEXT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("ITEM-SUID-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("SUID-ITEM-MAP"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS-NEXT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS-ITEM-SUID-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS-SUID-ITEM-MAP"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-NEXT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP"));
        $sym39$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS-P"));
        $sym42$INDEXED_ITEMS_NEXT_INDEX = SubLObjectFactory.makeSymbol("INDEXED-ITEMS-NEXT-INDEX");
        $sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX = SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-NEXT-INDEX");
        $sym44$INDEXED_ITEMS_ITEM_SUID_MAP = SubLObjectFactory.makeSymbol("INDEXED-ITEMS-ITEM-SUID-MAP");
        $sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP = SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP");
        $sym46$INDEXED_ITEMS_SUID_ITEM_MAP = SubLObjectFactory.makeSymbol("INDEXED-ITEMS-SUID-ITEM-MAP");
        $sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP = SubLObjectFactory.makeSymbol("_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP");
        $kw48$NEXT_INDEX = SubLObjectFactory.makeKeyword("NEXT-INDEX");
        $kw49$ITEM_SUID_MAP = SubLObjectFactory.makeKeyword("ITEM-SUID-MAP");
        $kw50$SUID_ITEM_MAP = SubLObjectFactory.makeKeyword("SUID-ITEM-MAP");
        $str51$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw52$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym53$MAKE_INDEXED_ITEMS = SubLObjectFactory.makeSymbol("MAKE-INDEXED-ITEMS");
        $kw54$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw55$END = SubLObjectFactory.makeKeyword("END");
        $sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD");
        $int57$50 = SubLObjectFactory.makeInteger(50);
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS");
        $sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-STRUCTURE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)inverted_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSERT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym62$INDEX_STRUCTURE = SubLObjectFactory.makeSymbol("INDEX-STRUCTURE");
        $sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS");
        $sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE");
        $sym65$IN_MEMORY_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-INDEX");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym67$VAL_TEST = SubLObjectFactory.makeSymbol("VAL-TEST");
        $sym68$DICTIONARY_INDEX = SubLObjectFactory.makeSymbol("DICTIONARY-INDEX");
        $sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS");
        $sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym72$IN_MEMORY_INDEX_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-INDEX-ISOLATE-METHOD");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");
        $sym75$IN_MEMORY_INDEX_INSERT_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-INDEX-INSERT-METHOD");
        $sym76$LOOKUP = SubLObjectFactory.makeSymbol("LOOKUP");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY"));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY"))));
        $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");
        $sym80$IN_MEMORY_INDEX_LOOKUP_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-INDEX-LOOKUP-METHOD");
        $sym81$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");
        $sym84$IN_MEMORY_INDEX_REMOVE_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-INDEX-REMOVE-METHOD");
        $sym85$IN_MEMORY_EQUALP_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX");
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)inverted_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS");
        $sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE");
        $sym89$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)inverted_index.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQUALP-INDEX-METHOD");
        $sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD");
        $sym94$IN_MEMORY_EQUAL_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUAL-INDEX");
        $sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS");
        $sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inverted_index.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQUAL-INDEX-METHOD");
        $sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD");
        $sym100$IN_MEMORY_EQ_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-EQ-INDEX");
        $sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS");
        $sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)inverted_index.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-TEST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQ-INDEX-METHOD");
        $sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD");
        $sym106$SIMPLE_STRING_INDEX = SubLObjectFactory.makeSymbol("SIMPLE-STRING-INDEX");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)inverted_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS");
        $sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INDEXED-ITEMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inverted_index.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-INDEX-ENTRY-COMPUTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");
        $sym112$STRING_INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("STRING-INDEX-ENTRY-COMPUTER");
        $sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SIMPLE-STRING-INDEX-INITIALIZE-METHOD");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP")), (SubLObject)SubLObjectFactory.makeSymbol("KEY"))));
        $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");
        $sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD = SubLObjectFactory.makeSymbol("SIMPLE-STRING-INDEX-LOOKUP-METHOD");
        $sym118$REMOVE_VALUE = SubLObjectFactory.makeSymbol("REMOVE-VALUE");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");
        $sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD = SubLObjectFactory.makeSymbol("SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD");
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS");
        $sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE");
        $list125 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INVERTED-INDEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX"))), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");
    }
    
    public static final class $indexed_items_native extends SubLStructNative
    {
        public SubLObject $next_index;
        public SubLObject $item_suid_map;
        public SubLObject $suid_item_map;
        private static final SubLStructDeclNative structDecl;
        
        public $indexed_items_native() {
            this.$next_index = (SubLObject)CommonSymbols.NIL;
            this.$item_suid_map = (SubLObject)CommonSymbols.NIL;
            this.$suid_item_map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$indexed_items_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$next_index;
        }
        
        public SubLObject getField3() {
            return this.$item_suid_map;
        }
        
        public SubLObject getField4() {
            return this.$suid_item_map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$next_index = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$item_suid_map = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$suid_item_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$indexed_items_native.class, inverted_index.$sym3$INDEXED_ITEMS, inverted_index.$sym34$INDEXED_ITEMS_P, inverted_index.$list35, inverted_index.$list36, new String[] { "$next_index", "$item_suid_map", "$suid_item_map" }, inverted_index.$list37, inverted_index.$list38, inverted_index.$sym39$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $indexed_items_p$UnaryFunction extends UnaryFunction
    {
        public $indexed_items_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INDEXED-ITEMS-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inverted_index.indexed_items_p(arg1);
        }
    }
}

/*

	Total time: 421 ms
	
*/