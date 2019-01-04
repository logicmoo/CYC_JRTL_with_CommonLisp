package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inverted_indexes_concrete extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inverted_indexes_concrete";
    public static final String myFingerPrint = "7d215c0194c0f1ca3bf246c196dc4cb32a69c14ecfbd4d8926528c7a5f7fb487";
    private static final SubLSymbol $sym0$CYCL_AND_GEN_INDEX;
    private static final SubLSymbol $sym1$INVERTED_INDEX;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$INSTANCE_NUMBER;
    private static final SubLSymbol $sym8$PHYSICAL_INDEX;
    private static final SubLSymbol $sym9$INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym10$VALUE_TEST;
    private static final SubLSymbol $sym11$INDEXED_ITEMS;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE;
    private static final SubLSymbol $sym13$INITIALIZE;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
    private static final SubLSymbol $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym18$SET_INDEX;
    private static final SubLSymbol $sym19$IN_MEMORY_EQUALP_INDEX;
    private static final SubLSymbol $sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD;
    private static final SubLSymbol $sym21$LOOKUP;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
    private static final SubLSymbol $sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD;
    private static final SubLSymbol $sym27$REMOVE_KEY;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
    private static final SubLSymbol $sym31$COMPUTE_INDEX_ENTRIES;
    private static final SubLSymbol $sym32$REMOVE_VALUE;
    private static final SubLSymbol $sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
    private static final SubLSymbol $sym37$REMOVE;
    private static final SubLSymbol $sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$PARENT_INDEX;
    private static final SubLSymbol $sym41$GENERATION_DOMAIN_MT;
    private static final SubLSymbol $sym42$GENERATION_MT;
    private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA;
    private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
    private static final SubLSymbol $sym48$INVERTED_INDEX_P;
    private static final SubLSymbol $sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD;
    private static final SubLSymbol $sym50$SET_GENERATION_MT;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
    private static final SubLSymbol $sym54$HLMT_P;
    private static final SubLSymbol $sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD;
    private static final SubLSymbol $sym56$SET_GENERATION_DOMAIN_MT;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
    private static final SubLSymbol $sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
    private static final SubLSymbol $sym63$FORT_P;
    private static final SubLSymbol $sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD;
    private static final SubLString $str65$Inverted_Index_Test_Suite;
    private static final SubLList $list66;
    private static final SubLList $list67;
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym4$INSTANCE_COUNT, (SubLObject)inverted_indexes_concrete.ZERO_INTEGER);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym6$ISOLATED_P, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym7$INSTANCE_NUMBER, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym1$INVERTED_INDEX, (SubLObject)inverted_indexes_concrete.$sym8$PHYSICAL_INDEX, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym1$INVERTED_INDEX, (SubLObject)inverted_indexes_concrete.$sym9$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym1$INVERTED_INDEX, (SubLObject)inverted_indexes_concrete.$sym10$VALUE_TEST, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym1$INVERTED_INDEX, (SubLObject)inverted_indexes_concrete.$sym11$INDEXED_ITEMS, (SubLObject)inverted_indexes_concrete.NIL);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_p(final SubLObject cycl_and_gen_index) {
        return classes.subloop_instanceof_class(cycl_and_gen_index, (SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = (SubLObject)inverted_indexes_concrete.NIL;
        SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
        SubLObject value_test = inverted_index.get_inverted_index_value_test(self);
        SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
        SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                value_test = Symbols.symbol_function((SubLObject)inverted_indexes_concrete.EQUALP);
                indexed_items = inverted_index.new_indexed_items();
                index_entry_computer = object.new_class_instance((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
                methods.funcall_instance_method_with_1_args(index_entry_computer, (SubLObject)inverted_indexes_concrete.$sym18$SET_INDEX, self);
                physical_index = object.new_class_instance((SubLObject)inverted_indexes_concrete.$sym19$IN_MEMORY_EQUALP_INDEX);
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                    inverted_index.set_inverted_index_value_test(self, value_test);
                    inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_lookup_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = (SubLObject)inverted_indexes_concrete.NIL;
        final SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                final SubLObject suids = methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_indexes_concrete.$sym21$LOOKUP, key);
                SubLObject result = (SubLObject)inverted_indexes_concrete.NIL;
                SubLObject cdolist_list_var = suids;
                SubLObject suid = (SubLObject)inverted_indexes_concrete.NIL;
                suid = cdolist_list_var.first();
                while (inverted_indexes_concrete.NIL != cdolist_list_var) {
                    final SubLObject item = inverted_index.get_item_from_index_suid(indexed_items, suid);
                    if (inverted_indexes_concrete.NIL != item) {
                        result = (SubLObject)ConsesLow.cons(item, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    suid = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, Sequences.nreverse(result));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_remove_key_method(final SubLObject self, final SubLObject index_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = (SubLObject)inverted_indexes_concrete.NIL;
        final SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                SubLObject cdolist_list_var;
                final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(index_entry_computer, (SubLObject)inverted_indexes_concrete.$sym31$COMPUTE_INDEX_ENTRIES, index_key);
                SubLObject entry = (SubLObject)inverted_indexes_concrete.NIL;
                entry = cdolist_list_var.first();
                while (inverted_indexes_concrete.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)inverted_indexes_concrete.$sym32$REMOVE_VALUE, entry);
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_remove_value_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = (SubLObject)inverted_indexes_concrete.NIL;
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_indexes_concrete.$sym37$REMOVE, index_entry);
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject get_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, (SubLObject)inverted_indexes_concrete.THREE_INTEGER, (SubLObject)inverted_indexes_concrete.$sym40$PARENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject set_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, (SubLObject)inverted_indexes_concrete.THREE_INTEGER, (SubLObject)inverted_indexes_concrete.$sym40$PARENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, (SubLObject)inverted_indexes_concrete.TWO_INTEGER, (SubLObject)inverted_indexes_concrete.$sym41$GENERATION_DOMAIN_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, (SubLObject)inverted_indexes_concrete.TWO_INTEGER, (SubLObject)inverted_indexes_concrete.$sym41$GENERATION_DOMAIN_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, (SubLObject)inverted_indexes_concrete.ONE_INTEGER, (SubLObject)inverted_indexes_concrete.$sym42$GENERATION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, (SubLObject)inverted_indexes_concrete.ONE_INTEGER, (SubLObject)inverted_indexes_concrete.$sym42$GENERATION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym4$INSTANCE_COUNT, (SubLObject)inverted_indexes_concrete.ZERO_INTEGER);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym6$ISOLATED_P, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym3$OBJECT, (SubLObject)inverted_indexes_concrete.$sym7$INSTANCE_NUMBER, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym42$GENERATION_MT, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym41$GENERATION_DOMAIN_MT, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym40$PARENT_INDEX, (SubLObject)inverted_indexes_concrete.NIL);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_entry_computer_p(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_instanceof_class(cycl_and_gen_index_entry_computer, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = (SubLObject)inverted_indexes_concrete.NIL;
        SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert inverted_indexes_concrete.NIL != inverted_index.inverted_index_p(v_inverted_index) : v_inverted_index;
                parent_index = v_inverted_index;
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = (SubLObject)inverted_indexes_concrete.NIL;
        SubLObject generation_mt = get_cycl_and_gen_index_entry_computer_generation_mt(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert inverted_indexes_concrete.NIL != hlmt.hlmt_p(mt) : mt;
                generation_mt = mt;
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_generation_mt(self, generation_mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = (SubLObject)inverted_indexes_concrete.NIL;
        SubLObject generation_domain_mt = get_cycl_and_gen_index_entry_computer_generation_domain_mt(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert inverted_indexes_concrete.NIL != hlmt.hlmt_p(mt) : mt;
                generation_domain_mt = mt;
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_generation_domain_mt(self, generation_domain_mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
    public static SubLObject cycl_and_gen_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = (SubLObject)inverted_indexes_concrete.NIL;
        final SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push(inverted_indexes_concrete.$sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                final SubLObject indexed_items = instances.get_slot(parent_index, (SubLObject)inverted_indexes_concrete.$sym11$INDEXED_ITEMS);
                final SubLObject my_index = inverted_index.maybe_add_new_indexed_item(indexed_items, cycl);
                SubLObject result = (SubLObject)inverted_indexes_concrete.NIL;
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(cycl, (SubLObject)inverted_indexes_concrete.$sym63$FORT_P, (SubLObject)inverted_indexes_concrete.T, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED);
                SubLObject fort = (SubLObject)inverted_indexes_concrete.NIL;
                fort = cdolist_list_var.first();
                while (inverted_indexes_concrete.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(fort, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                }
                cdolist_list_var = document.string_tokenize_via_wordify(pph_main.generate_phrase(cycl, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED));
                SubLObject word = (SubLObject)inverted_indexes_concrete.NIL;
                word = cdolist_list_var.first();
                while (inverted_indexes_concrete.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
                cdolist_list_var = document.string_tokenize_via_wordify(pph_question.generate_question(cycl, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED, (SubLObject)inverted_indexes_concrete.UNPROVIDED));
                word = (SubLObject)inverted_indexes_concrete.NIL;
                word = cdolist_list_var.first();
                while (inverted_indexes_concrete.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)inverted_indexes_concrete.$sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_indexes_concrete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_indexes_concrete.$sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }
    
    public static SubLObject declare_inverted_indexes_concrete_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_indexes_concrete", "cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    public static SubLObject init_inverted_indexes_concrete_file() {
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    public static SubLObject setup_inverted_indexes_concrete_file() {
        classes.subloop_new_class((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym1$INVERTED_INDEX, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE);
        subloop_reserved_initialize_cycl_and_gen_index_class((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym13$INITIALIZE, (SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$list14, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.$list15);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym13$INITIALIZE, (SubLObject)inverted_indexes_concrete.$sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym21$LOOKUP, (SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$list22, (SubLObject)inverted_indexes_concrete.$list23, (SubLObject)inverted_indexes_concrete.$list24);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym21$LOOKUP, (SubLObject)inverted_indexes_concrete.$sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym27$REMOVE_KEY, (SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$list22, (SubLObject)inverted_indexes_concrete.$list28, (SubLObject)inverted_indexes_concrete.$list29);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym27$REMOVE_KEY, (SubLObject)inverted_indexes_concrete.$sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym32$REMOVE_VALUE, (SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$list22, (SubLObject)inverted_indexes_concrete.$list34, (SubLObject)inverted_indexes_concrete.$list35);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym0$CYCL_AND_GEN_INDEX, (SubLObject)inverted_indexes_concrete.$sym32$REMOVE_VALUE, (SubLObject)inverted_indexes_concrete.$sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD);
        classes.subloop_new_class((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym9$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.$list39);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS);
        subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym18$SET_INDEX, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$list14, (SubLObject)inverted_indexes_concrete.$list45, (SubLObject)inverted_indexes_concrete.$list46);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym18$SET_INDEX, (SubLObject)inverted_indexes_concrete.$sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym50$SET_GENERATION_MT, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$list14, (SubLObject)inverted_indexes_concrete.$list51, (SubLObject)inverted_indexes_concrete.$list52);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym50$SET_GENERATION_MT, (SubLObject)inverted_indexes_concrete.$sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym56$SET_GENERATION_DOMAIN_MT, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$list14, (SubLObject)inverted_indexes_concrete.$list51, (SubLObject)inverted_indexes_concrete.$list57);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym56$SET_GENERATION_DOMAIN_MT, (SubLObject)inverted_indexes_concrete.$sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_indexes_concrete.$sym31$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$list14, (SubLObject)inverted_indexes_concrete.$list60, (SubLObject)inverted_indexes_concrete.$list61);
        methods.subloop_register_instance_method((SubLObject)inverted_indexes_concrete.$sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_indexes_concrete.$sym31$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_indexes_concrete.$sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD);
        sunit_external.define_test_suite((SubLObject)inverted_indexes_concrete.$str65$Inverted_Index_Test_Suite, (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)inverted_indexes_concrete.$list66, (SubLObject)inverted_indexes_concrete.$list67);
        return (SubLObject)inverted_indexes_concrete.NIL;
    }
    
    public void declareFunctions() {
        declare_inverted_indexes_concrete_file();
    }
    
    public void initializeVariables() {
        init_inverted_indexes_concrete_file();
    }
    
    public void runTopLevelForms() {
        setup_inverted_indexes_concrete_file();
    }
    
    static {
        me = (SubLFile)new inverted_indexes_concrete();
        $sym0$CYCL_AND_GEN_INDEX = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX");
        $sym1$INVERTED_INDEX = SubLObjectFactory.makeSymbol("INVERTED-INDEX");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)inverted_indexes_concrete.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$PHYSICAL_INDEX = SubLObjectFactory.makeSymbol("PHYSICAL-INDEX");
        $sym9$INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER");
        $sym10$VALUE_TEST = SubLObjectFactory.makeSymbol("VALUE-TEST");
        $sym11$INDEXED_ITEMS = SubLObjectFactory.makeSymbol("INDEXED-ITEMS");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE");
        $sym13$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inverted_indexes_concrete.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INDEXED-ITEMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");
        $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER");
        $sym18$SET_INDEX = SubLObjectFactory.makeSymbol("SET-INDEX");
        $sym19$IN_MEMORY_EQUALP_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX");
        $sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-INITIALIZE-METHOD");
        $sym21$LOOKUP = SubLObjectFactory.makeSymbol("LOOKUP");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUIDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP")), (SubLObject)SubLObjectFactory.makeSymbol("KEY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("SUIDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ITEM-FROM-INDEX-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("SUID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))));
        $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");
        $sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-LOOKUP-METHOD");
        $sym27$REMOVE_KEY = SubLObjectFactory.makeSymbol("REMOVE-KEY");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY"));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");
        $sym31$COMPUTE_INDEX_ENTRIES = SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES");
        $sym32$REMOVE_VALUE = SubLObjectFactory.makeSymbol("REMOVE-VALUE");
        $sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY"));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");
        $sym37$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym40$PARENT_INDEX = SubLObjectFactory.makeSymbol("PARENT-INDEX");
        $sym41$GENERATION_DOMAIN_MT = SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT");
        $sym42$GENERATION_MT = SubLObjectFactory.makeSymbol("GENERATION-MT");
        $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS");
        $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");
        $sym48$INVERTED_INDEX_P = SubLObjectFactory.makeSymbol("INVERTED-INDEX-P");
        $sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD");
        $sym50$SET_GENERATION_MT = SubLObjectFactory.makeSymbol("SET-GENERATION-MT");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");
        $sym54$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD");
        $sym56$SET_GENERATION_DOMAIN_MT = SubLObjectFactory.makeSymbol("SET-GENERATION-DOMAIN-MT");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");
        $sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAYBE-ADD-NEW-INDEXED-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"))), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-GATHER"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)inverted_indexes_concrete.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INVERTED-INDEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INVERTED-INDEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INVERTED-INDEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");
        $sym63$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");
        $str65$Inverted_Index_Test_Suite = SubLObjectFactory.makeString("Inverted Index Test Suite");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inverted-index"), (SubLObject)SubLObjectFactory.makeString("cycl")));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX-CYCL-GEN-INSERT-DELETE"));
    }
}

/*

	Total time: 265 ms
	
*/