package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inverted_indexes_concrete extends SubLTranslatedFile {
    public static final SubLFile me = new inverted_indexes_concrete();

    public static final String myName = "com.cyc.cycjava.cycl.inverted_indexes_concrete";

    public static final String myFingerPrint = "7d215c0194c0f1ca3bf246c196dc4cb32a69c14ecfbd4d8926528c7a5f7fb487";

    // Internal Constants
    public static final SubLSymbol CYCL_AND_GEN_INDEX = makeSymbol("CYCL-AND-GEN-INDEX");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS");













    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE");



    public static final SubLList $list14 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list15 = list(list(makeSymbol("CSETQ"), makeSymbol("VALUE-TEST"), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("INDEXED-ITEMS"), list(makeSymbol("NEW-INDEXED-ITEMS"))), list(makeSymbol("CSETQ"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("QUOTE"), makeSymbol("SET-INDEX")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("IN-MEMORY-EQUALP-INDEX")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER");

    public static final SubLSymbol SET_INDEX = makeSymbol("SET-INDEX");

    public static final SubLSymbol IN_MEMORY_EQUALP_INDEX = makeSymbol("IN-MEMORY-EQUALP-INDEX");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_INITIALIZE_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-INITIALIZE-METHOD");



    public static final SubLList $list22 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list23 = list(makeSymbol("KEY"));

    public static final SubLList $list24 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUIDS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("LOOKUP")), makeSymbol("KEY"))), list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUID"), makeSymbol("SUIDS")), list(makeSymbol("CLET"), list(list(makeSymbol("ITEM"), list(makeSymbol("GET-ITEM-FROM-INDEX-SUID"), makeSymbol("INDEXED-ITEMS"), makeSymbol("SUID")))), list(makeSymbol("PWHEN"), makeSymbol("ITEM"), list(makeSymbol("CPUSH"), makeSymbol("ITEM"), makeSymbol("RESULT"))))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))));

    public static final SubLSymbol $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_LOOKUP_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-LOOKUP-METHOD");

    public static final SubLSymbol REMOVE_KEY = makeSymbol("REMOVE-KEY");

    public static final SubLList $list28 = list(makeSymbol("INDEX-KEY"));

    public static final SubLList $list29 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENTRIES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-INDEX-ENTRIES")), makeSymbol("INDEX-KEY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), makeSymbol("ENTRIES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-VALUE")), makeSymbol("ENTRY")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");



    public static final SubLSymbol REMOVE_VALUE = makeSymbol("REMOVE-VALUE");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD");

    public static final SubLList $list34 = list(makeSymbol("INDEX-ENTRY"));

    public static final SubLList $list35 = list(list(makeSymbol("FIM"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE")), makeSymbol("INDEX-ENTRY")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");



    public static final SubLSymbol CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD");

    public static final SubLList $list39 = list(list(makeSymbol("GENERATION-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GENERATION-DOMAIN-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("ITEM-TO-INDEX")), makeKeyword("PUBLIC")));



    public static final SubLSymbol GENERATION_DOMAIN_MT = makeSymbol("GENERATION-DOMAIN-MT");



    public static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS");

    public static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE");

    public static final SubLList $list45 = list(makeSymbol("INVERTED-INDEX"));

    public static final SubLList $list46 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("INVERTED-INDEX"), makeSymbol("INVERTED-INDEX-P")), list(makeSymbol("CSETQ"), makeSymbol("PARENT-INDEX"), makeSymbol("INVERTED-INDEX")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    public static final SubLSymbol INVERTED_INDEX_P = makeSymbol("INVERTED-INDEX-P");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD");

    public static final SubLSymbol SET_GENERATION_MT = makeSymbol("SET-GENERATION-MT");

    public static final SubLList $list51 = list(makeSymbol("MT"));

    public static final SubLList $list52 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-MT"), makeSymbol("MT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");



    public static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD");

    public static final SubLSymbol SET_GENERATION_DOMAIN_MT = makeSymbol("SET-GENERATION-DOMAIN-MT");

    public static final SubLList $list57 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-DOMAIN-MT"), makeSymbol("MT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    public static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD");

    public static final SubLList $list60 = list(makeSymbol("CYCL"));

    public static final SubLList $list61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDEXED-ITEMS"), list(makeSymbol("GET-SLOT"), makeSymbol("PARENT-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("INDEXED-ITEMS")))), list(makeSymbol("MY-INDEX"), list(makeSymbol("MAYBE-ADD-NEW-INDEXED-ITEM"), makeSymbol("INDEXED-ITEMS"), makeSymbol("CYCL"))), makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("FORT"), list(makeSymbol("EXPRESSION-GATHER"), makeSymbol("CYCL"), list(makeSymbol("QUOTE"), makeSymbol("FORT-P")), T)), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("FORT"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-QUESTION"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");



    public static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");

    private static final SubLString $$$Inverted_Index_Test_Suite = makeString("Inverted Index Test Suite");

    private static final SubLList $list66 = list(list(makeString("inverted-index"), makeString("cycl")));

    public static final SubLList $list67 = list(makeSymbol("INVERTED-INDEX-CYCL-GEN-INSERT-DELETE"));

    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, PHYSICAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, VALUE_TEST, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEXED_ITEMS, NIL);
        return NIL;
    }

    public static SubLObject cycl_and_gen_index_p(final SubLObject cycl_and_gen_index) {
        return classes.subloop_instanceof_class(cycl_and_gen_index, CYCL_AND_GEN_INDEX);
    }

    public static SubLObject cycl_and_gen_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
        SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
        SubLObject value_test = inverted_index.get_inverted_index_value_test(self);
        SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
        SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                value_test = symbol_function(EQUALP);
                indexed_items = inverted_index.new_indexed_items();
                index_entry_computer = object.new_class_instance(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
                methods.funcall_instance_method_with_1_args(index_entry_computer, SET_INDEX, self);
                physical_index = object.new_class_instance(IN_MEMORY_EQUALP_INDEX);
                sublisp_throw($sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                    inverted_index.set_inverted_index_value_test(self, value_test);
                    inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }

    public static SubLObject cycl_and_gen_index_lookup_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
        final SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                final SubLObject suids = methods.funcall_instance_method_with_1_args(physical_index, LOOKUP, key);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = suids;
                SubLObject suid = NIL;
                suid = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item = inverted_index.get_item_from_index_suid(indexed_items, suid);
                    if (NIL != item) {
                        result = cons(item, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    suid = cdolist_list_var.first();
                } 
                sublisp_throw($sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, nreverse(result));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }

    public static SubLObject cycl_and_gen_index_remove_key_method(final SubLObject self, final SubLObject index_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
        final SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
        try {
            thread.throwStack.push($sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                SubLObject cdolist_list_var;
                final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(index_entry_computer, COMPUTE_INDEX_ENTRIES, index_key);
                SubLObject entry = NIL;
                entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(self, REMOVE_VALUE, entry);
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                } 
                sublisp_throw($sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }

    public static SubLObject cycl_and_gen_index_remove_value_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(physical_index, REMOVE, index_entry);
                sublisp_throw($sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_method;
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, THREE_INTEGER, PARENT_INDEX);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, THREE_INTEGER, PARENT_INDEX);
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, ONE_INTEGER, GENERATION_MT);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, ONE_INTEGER, GENERATION_MT);
    }

    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, GENERATION_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, GENERATION_DOMAIN_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, PARENT_INDEX, NIL);
        return NIL;
    }

    public static SubLObject cycl_and_gen_index_entry_computer_p(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_instanceof_class(cycl_and_gen_index_entry_computer, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push($sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != inverted_index.inverted_index_p(v_inverted_index) : "inverted_index.inverted_index_p(v_inverted_index) " + "CommonSymbols.NIL != inverted_index.inverted_index_p(v_inverted_index) " + v_inverted_index;
                parent_index = v_inverted_index;
                sublisp_throw($sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject generation_mt = get_cycl_and_gen_index_entry_computer_generation_mt(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
                generation_mt = mt;
                sublisp_throw($sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_generation_mt(self, generation_mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject generation_domain_mt = get_cycl_and_gen_index_entry_computer_generation_domain_mt(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
                generation_domain_mt = mt;
                sublisp_throw($sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_generation_domain_mt(self, generation_domain_mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }

    public static SubLObject cycl_and_gen_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        final SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push($sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                final SubLObject indexed_items = instances.get_slot(parent_index, INDEXED_ITEMS);
                final SubLObject my_index = inverted_index.maybe_add_new_indexed_item(indexed_items, cycl);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(cycl, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject fort = NIL;
                fort = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(inverted_index.new_inverted_index_entry(fort, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                } 
                cdolist_list_var = document.string_tokenize_via_wordify(pph_main.generate_phrase(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                cdolist_list_var = document.string_tokenize_via_wordify(pph_question.generate_question(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                sublisp_throw($sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_and_gen_index_entry_computer_method;
    }

    public static SubLObject declare_inverted_indexes_concrete_file() {
        declareFunction(me, "subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false);
        declareFunction(me, "cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false);
        declareFunction(me, "cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
        declareFunction(me, "cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        declareFunction(me, "get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
        declareFunction(me, "set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
        declareFunction(me, "get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
        declareFunction(me, "get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
        declareFunction(me, "set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        declareFunction(me, "cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        declareFunction(me, "cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
        declareFunction(me, "cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
        declareFunction(me, "cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
        declareFunction(me, "cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inverted_indexes_concrete_file() {
        return NIL;
    }

    public static SubLObject setup_inverted_indexes_concrete_file() {
        classes.subloop_new_class(CYCL_AND_GEN_INDEX, INVERTED_INDEX, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(CYCL_AND_GEN_INDEX, NIL);
        classes.subloop_note_class_initialization_function(CYCL_AND_GEN_INDEX, SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_AND_GEN_INDEX, SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE);
        subloop_reserved_initialize_cycl_and_gen_index_class(CYCL_AND_GEN_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, CYCL_AND_GEN_INDEX, $list14, NIL, $list15);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, INITIALIZE, CYCL_AND_GEN_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(LOOKUP, CYCL_AND_GEN_INDEX, $list22, $list23, $list24);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, LOOKUP, CYCL_AND_GEN_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_KEY, CYCL_AND_GEN_INDEX, $list22, $list28, $list29);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, REMOVE_KEY, CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_VALUE, CYCL_AND_GEN_INDEX, $list22, $list34, $list35);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, REMOVE_VALUE, CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD);
        classes.subloop_new_class(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, INDEX_ENTRY_COMPUTER, NIL, NIL, $list39);
        classes.class_set_implements_slot_listeners(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_note_class_initialization_function(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA);
        classes.subloop_note_instance_initialization_function(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS);
        subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method(SET_INDEX, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list45, $list46);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_INDEX, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD);
        methods.methods_incorporate_instance_method(SET_GENERATION_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list51, $list52);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_GENERATION_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_GENERATION_DOMAIN_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list51, $list57);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_GENERATION_DOMAIN_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_INDEX_ENTRIES, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list60, $list61);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, COMPUTE_INDEX_ENTRIES, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD);
        sunit_external.define_test_suite($$$Inverted_Index_Test_Suite, NIL, $list66, $list67);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inverted_indexes_concrete_file();
    }

    @Override
    public void initializeVariables() {
        init_inverted_indexes_concrete_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inverted_indexes_concrete_file();
    }

    
}

/**
 * Total time: 265 ms
 */
