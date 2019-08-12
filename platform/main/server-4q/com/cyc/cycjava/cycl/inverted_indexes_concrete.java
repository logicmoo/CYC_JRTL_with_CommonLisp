/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INVERTED-INDEXES-CONCRETE
 * source file: /cyc/top/cycl/inverted-indexes-concrete.lisp
 * created:     2019/07/03 17:38:25
 */
public final class inverted_indexes_concrete extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, GOOD_ITEMS, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, BAD_ITEMS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_inverted_index_cycl_gen_insert_delete_index(SubLObject inverted_index_cycl_gen_insert_delete, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, value, THREE_INTEGER, INDEX);
    }

    public static final SubLObject set_inverted_index_cycl_gen_insert_delete_good_items(SubLObject inverted_index_cycl_gen_insert_delete, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, value, FOUR_INTEGER, GOOD_ITEMS);
    }

    public static final SubLObject set_inverted_index_cycl_gen_insert_delete_bad_items(SubLObject inverted_index_cycl_gen_insert_delete, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, value, FIVE_INTEGER, BAD_ITEMS);
    }

    public static final SubLObject inverted_index_cycl_gen_insert_delete_p(SubLObject inverted_index_cycl_gen_insert_delete) {
        return classes.subloop_instanceof_class(inverted_index_cycl_gen_insert_delete, INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
    }

    public static final SubLObject get_inverted_index_cycl_gen_insert_delete_index(SubLObject inverted_index_cycl_gen_insert_delete) {
        return classes.subloop_get_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, THREE_INTEGER, INDEX);
    }

    public static final SubLObject get_inverted_index_cycl_gen_insert_delete_good_items(SubLObject inverted_index_cycl_gen_insert_delete) {
        return classes.subloop_get_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, FOUR_INTEGER, GOOD_ITEMS);
    }

    public static final SubLObject get_inverted_index_cycl_gen_insert_delete_bad_items(SubLObject inverted_index_cycl_gen_insert_delete) {
        return classes.subloop_get_access_protected_instance_slot(inverted_index_cycl_gen_insert_delete, FIVE_INTEGER, BAD_ITEMS);
    }

    public static final SubLFile me = new inverted_indexes_concrete();

 public static final String myName = "com.cyc.cycjava.cycl.inverted_indexes_concrete";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYCL_AND_GEN_INDEX = makeSymbol("CYCL-AND-GEN-INDEX");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE");

    static private final SubLList $list14 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list15 = list(list(makeSymbol("CSETQ"), makeSymbol("VALUE-TEST"), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("INDEXED-ITEMS"), list(makeSymbol("NEW-INDEXED-ITEMS"))), list(makeSymbol("CSETQ"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(QUOTE, makeSymbol("SET-INDEX")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("IN-MEMORY-EQUALP-INDEX")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER");

    private static final SubLSymbol SET_INDEX = makeSymbol("SET-INDEX");

    private static final SubLSymbol IN_MEMORY_EQUALP_INDEX = makeSymbol("IN-MEMORY-EQUALP-INDEX");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_INITIALIZE_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-INITIALIZE-METHOD");

    static private final SubLList $list22 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list23 = list(makeSymbol("KEY"));

    static private final SubLList $list24 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUIDS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(QUOTE, makeSymbol("LOOKUP")), makeSymbol("KEY"))), list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUID"), makeSymbol("SUIDS")), list(makeSymbol("CLET"), list(list(makeSymbol("ITEM"), list(makeSymbol("GET-ITEM-FROM-INDEX-SUID"), makeSymbol("INDEXED-ITEMS"), makeSymbol("SUID")))), list(makeSymbol("PWHEN"), makeSymbol("ITEM"), list(makeSymbol("CPUSH"), makeSymbol("ITEM"), makeSymbol("RESULT"))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))));

    static private final SubLSymbol $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_LOOKUP_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-LOOKUP-METHOD");

    private static final SubLSymbol REMOVE_KEY = makeSymbol("REMOVE-KEY");

    static private final SubLList $list28 = list(makeSymbol("INDEX-KEY"));

    static private final SubLList $list29 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENTRIES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(QUOTE, makeSymbol("COMPUTE-INDEX-ENTRIES")), makeSymbol("INDEX-KEY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), makeSymbol("ENTRIES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REMOVE-VALUE")), makeSymbol("ENTRY")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    private static final SubLSymbol REMOVE_VALUE = makeSymbol("REMOVE-VALUE");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD");

    static private final SubLList $list34 = list(makeSymbol("INDEX-ENTRY"));

    static private final SubLList $list35 = list(list(makeSymbol("FIM"), makeSymbol("PHYSICAL-INDEX"), list(QUOTE, makeSymbol("REMOVE")), makeSymbol("INDEX-ENTRY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD");

    static private final SubLList $list39 = list(list(makeSymbol("GENERATION-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GENERATION-DOMAIN-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("ITEM-TO-INDEX")), makeKeyword("PUBLIC")));

    private static final SubLSymbol GENERATION_DOMAIN_MT = makeSymbol("GENERATION-DOMAIN-MT");

    static private final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS");

    static private final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE");

    static private final SubLList $list45 = list(makeSymbol("INVERTED-INDEX"));

    static private final SubLList $list46 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("INVERTED-INDEX"), makeSymbol("INVERTED-INDEX-P")), list(makeSymbol("CSETQ"), makeSymbol("PARENT-INDEX"), makeSymbol("INVERTED-INDEX")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    private static final SubLSymbol INVERTED_INDEX_P = makeSymbol("INVERTED-INDEX-P");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD");

    private static final SubLSymbol SET_GENERATION_MT = makeSymbol("SET-GENERATION-MT");

    static private final SubLList $list51 = list(makeSymbol("MT"));

    static private final SubLList $list52 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-MT"), makeSymbol("MT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD");

    private static final SubLSymbol SET_GENERATION_DOMAIN_MT = makeSymbol("SET-GENERATION-DOMAIN-MT");

    static private final SubLList $list57 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-DOMAIN-MT"), makeSymbol("MT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD");

    static private final SubLList $list60 = list(makeSymbol("CYCL"));

    static private final SubLList $list61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDEXED-ITEMS"), list(makeSymbol("GET-SLOT"), makeSymbol("PARENT-INDEX"), list(QUOTE, makeSymbol("INDEXED-ITEMS")))), list(makeSymbol("MY-INDEX"), list(makeSymbol("MAYBE-ADD-NEW-INDEXED-ITEM"), makeSymbol("INDEXED-ITEMS"), makeSymbol("CYCL"))), makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("FORT"), list(makeSymbol("EXPRESSION-GATHER"), makeSymbol("CYCL"), list(QUOTE, makeSymbol("FORT-P")), T)), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("FORT"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-QUESTION"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD");

    private static final SubLSymbol CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");

    private static final SubLString $$$Inverted_Index_Test_Suite = makeString("Inverted Index Test Suite");

    private static final SubLList $list66 = list(list(makeString("inverted-index"), makeString("cycl")));

    static private final SubLList $list67 = list(makeSymbol("INVERTED-INDEX-CYCL-GEN-INSERT-DELETE"));

    // Definitions
    public static final SubLObject subloop_reserved_initialize_cycl_and_gen_index_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    // Definitions
    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cycl_and_gen_index_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, PHYSICAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, VALUE_TEST, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEXED_ITEMS, NIL);
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

    public static final SubLObject cycl_and_gen_index_p_alt(SubLObject cycl_and_gen_index) {
        return classes.subloop_instanceof_class(cycl_and_gen_index, CYCL_AND_GEN_INDEX);
    }

    public static SubLObject cycl_and_gen_index_p(final SubLObject cycl_and_gen_index) {
        return classes.subloop_instanceof_class(cycl_and_gen_index, CYCL_AND_GEN_INDEX);
    }

    public static final SubLObject cycl_and_gen_index_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
            SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
            SubLObject value_test = inverted_index.get_inverted_index_value_test(self);
            SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
            SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
            try {
                try {
                    value_test = symbol_function(EQUALP);
                    indexed_items = inverted_index.new_indexed_items();
                    index_entry_computer = object.new_class_instance(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
                    methods.funcall_instance_method_with_1_args(index_entry_computer, SET_INDEX, self);
                    physical_index = object.new_class_instance(IN_MEMORY_EQUALP_INDEX);
                    sublisp_throw($sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                            inverted_index.set_inverted_index_value_test(self, value_test);
                            inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                            inverted_index.set_inverted_index_physical_index(self, physical_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_method;
        }
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

    public static final SubLObject cycl_and_gen_index_lookup_method_alt(SubLObject self, SubLObject key) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
            SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
            SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
            try {
                try {
                    {
                        SubLObject suids = methods.funcall_instance_method_with_1_args(physical_index, LOOKUP, key);
                        SubLObject result = NIL;
                        SubLObject cdolist_list_var = suids;
                        SubLObject suid = NIL;
                        for (suid = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suid = cdolist_list_var.first()) {
                            {
                                SubLObject item = inverted_index.get_item_from_index_suid(indexed_items, suid);
                                if (NIL != item) {
                                    result = cons(item, result);
                                }
                            }
                        }
                        sublisp_throw($sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, nreverse(result));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                            inverted_index.set_inverted_index_physical_index(self, physical_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_method;
        }
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

    public static final SubLObject cycl_and_gen_index_remove_key_method_alt(SubLObject self, SubLObject index_key) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
            SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
            try {
                try {
                    {
                        SubLObject entries = methods.funcall_instance_method_with_1_args(index_entry_computer, COMPUTE_INDEX_ENTRIES, index_key);
                        SubLObject cdolist_list_var = entries;
                        SubLObject entry = NIL;
                        for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(self, REMOVE_VALUE, entry);
                        }
                        sublisp_throw($sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_method;
        }
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

    public static final SubLObject cycl_and_gen_index_remove_value_method_alt(SubLObject self, SubLObject index_entry) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
            SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
            try {
                try {
                    methods.funcall_instance_method_with_1_args(physical_index, REMOVE, index_entry);
                    sublisp_throw($sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inverted_index.set_inverted_index_physical_index(self, physical_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_method;
        }
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

    public static final SubLObject get_cycl_and_gen_index_entry_computer_parent_index_alt(SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, THREE_INTEGER, PARENT_INDEX);
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, THREE_INTEGER, PARENT_INDEX);
    }

    public static final SubLObject set_cycl_and_gen_index_entry_computer_parent_index_alt(SubLObject cycl_and_gen_index_entry_computer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, THREE_INTEGER, PARENT_INDEX);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, THREE_INTEGER, PARENT_INDEX);
    }

    public static final SubLObject get_cycl_and_gen_index_entry_computer_generation_domain_mt_alt(SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static final SubLObject set_cycl_and_gen_index_entry_computer_generation_domain_mt_alt(SubLObject cycl_and_gen_index_entry_computer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, TWO_INTEGER, GENERATION_DOMAIN_MT);
    }

    public static final SubLObject get_cycl_and_gen_index_entry_computer_generation_mt_alt(SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, ONE_INTEGER, GENERATION_MT);
    }

    public static SubLObject get_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(cycl_and_gen_index_entry_computer, ONE_INTEGER, GENERATION_MT);
    }

    public static final SubLObject set_cycl_and_gen_index_entry_computer_generation_mt_alt(SubLObject cycl_and_gen_index_entry_computer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, ONE_INTEGER, GENERATION_MT);
    }

    public static SubLObject set_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_and_gen_index_entry_computer, value, ONE_INTEGER, GENERATION_MT);
    }

    public static final SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, GENERATION_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, GENERATION_DOMAIN_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, PARENT_INDEX, NIL);
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

    public static final SubLObject cycl_and_gen_index_entry_computer_p_alt(SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_instanceof_class(cycl_and_gen_index_entry_computer, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject cycl_and_gen_index_entry_computer_p(final SubLObject cycl_and_gen_index_entry_computer) {
        return classes.subloop_instanceof_class(cycl_and_gen_index_entry_computer, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
    }

    public static final SubLObject cycl_and_gen_index_entry_computer_set_index_method_alt(SubLObject self, SubLObject v_inverted_index) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
            SubLObject parent_index = com.cyc.cycjava.cycl.inverted_indexes_concrete.get_cycl_and_gen_index_entry_computer_parent_index(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_inverted_index, INVERTED_INDEX_P);
                    parent_index = v_inverted_index;
                    sublisp_throw($sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.inverted_indexes_concrete.set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_entry_computer_method;
        }
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push($sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != inverted_index.inverted_index_p(v_inverted_index) : "! inverted_index.inverted_index_p(v_inverted_index) " + ("inverted_index.inverted_index_p(v_inverted_index) " + "CommonSymbols.NIL != inverted_index.inverted_index_p(v_inverted_index) ") + v_inverted_index;
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

    public static final SubLObject cycl_and_gen_index_entry_computer_set_generation_mt_method_alt(SubLObject self, SubLObject mt) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
            SubLObject generation_mt = com.cyc.cycjava.cycl.inverted_indexes_concrete.get_cycl_and_gen_index_entry_computer_generation_mt(self);
            try {
                try {
                    SubLTrampolineFile.checkType(mt, HLMT_P);
                    generation_mt = mt;
                    sublisp_throw($sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.inverted_indexes_concrete.set_cycl_and_gen_index_entry_computer_generation_mt(self, generation_mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_entry_computer_method;
        }
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject generation_mt = get_cycl_and_gen_index_entry_computer_generation_mt(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
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

    public static final SubLObject cycl_and_gen_index_entry_computer_set_generation_domain_mt_method_alt(SubLObject self, SubLObject mt) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
            SubLObject generation_domain_mt = com.cyc.cycjava.cycl.inverted_indexes_concrete.get_cycl_and_gen_index_entry_computer_generation_domain_mt(self);
            try {
                try {
                    SubLTrampolineFile.checkType(mt, HLMT_P);
                    generation_domain_mt = mt;
                    sublisp_throw($sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.inverted_indexes_concrete.set_cycl_and_gen_index_entry_computer_generation_domain_mt(self, generation_domain_mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_entry_computer_method;
        }
    }

    public static SubLObject cycl_and_gen_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
        SubLObject generation_domain_mt = get_cycl_and_gen_index_entry_computer_generation_domain_mt(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            try {
                assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
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

    public static final SubLObject cycl_and_gen_index_entry_computer_compute_index_entries_method_alt(SubLObject self, SubLObject cycl) {
        {
            SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
            SubLObject parent_index = com.cyc.cycjava.cycl.inverted_indexes_concrete.get_cycl_and_gen_index_entry_computer_parent_index(self);
            try {
                try {
                    {
                        SubLObject indexed_items = instances.get_slot(parent_index, INDEXED_ITEMS);
                        SubLObject my_index = inverted_index.maybe_add_new_indexed_item(indexed_items, cycl);
                        SubLObject result = NIL;
                        {
                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(cycl, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject fort = NIL;
                            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                                result = cons(inverted_index.new_inverted_index_entry(fort, my_index), result);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = document.string_tokenize_via_wordify(pph_main.generate_phrase(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject word = NIL;
                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                result = cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = document.string_tokenize_via_wordify(pph_question.generate_question(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject word = NIL;
                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                result = cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                            }
                        }
                        sublisp_throw($sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.inverted_indexes_concrete.set_cycl_and_gen_index_entry_computer_parent_index(self, parent_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD);
            }
            return catch_var_for_cycl_and_gen_index_entry_computer_method;
        }
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

    public static final SubLObject declare_inverted_indexes_concrete_file_alt() {
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false);
        declareFunction("cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false);
        declareFunction("cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        declareFunction("get_inverted_index_cycl_gen_insert_delete_bad_items", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-BAD-ITEMS", 1, 0, false);
        declareFunction("set_inverted_index_cycl_gen_insert_delete_bad_items", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-BAD-ITEMS", 2, 0, false);
        declareFunction("get_inverted_index_cycl_gen_insert_delete_good_items", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-GOOD-ITEMS", 1, 0, false);
        declareFunction("set_inverted_index_cycl_gen_insert_delete_good_items", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-GOOD-ITEMS", 2, 0, false);
        declareFunction("get_inverted_index_cycl_gen_insert_delete_index", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INDEX", 1, 0, false);
        declareFunction("set_inverted_index_cycl_gen_insert_delete_index", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INDEX", 2, 0, false);
        declareFunction("subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_class", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_instance", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INSTANCE", 1, 0, false);
        declareFunction("inverted_index_cycl_gen_insert_delete_p", "INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inverted_indexes_concrete_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false);
            declareFunction("cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false);
            declareFunction("cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false);
            declareFunction("cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false);
            declareFunction("cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
            declareFunction("cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
            declareFunction("get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
            declareFunction("set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
            declareFunction("get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
            declareFunction("set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
            declareFunction("get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
            declareFunction("set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
            declareFunction("cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
            declareFunction("cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
            declareFunction("cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
            declareFunction("cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
            declareFunction("cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_inverted_index_cycl_gen_insert_delete_bad_items", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-BAD-ITEMS", 1, 0, false);
            declareFunction("set_inverted_index_cycl_gen_insert_delete_bad_items", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-BAD-ITEMS", 2, 0, false);
            declareFunction("get_inverted_index_cycl_gen_insert_delete_good_items", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-GOOD-ITEMS", 1, 0, false);
            declareFunction("set_inverted_index_cycl_gen_insert_delete_good_items", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-GOOD-ITEMS", 2, 0, false);
            declareFunction("get_inverted_index_cycl_gen_insert_delete_index", "GET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INDEX", 1, 0, false);
            declareFunction("set_inverted_index_cycl_gen_insert_delete_index", "SET-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INDEX", 2, 0, false);
            declareFunction("subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_class", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_instance", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INSTANCE", 1, 0, false);
            declareFunction("inverted_index_cycl_gen_insert_delete_p", "INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inverted_indexes_concrete_file_Previous() {
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false);
        declareFunction("cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false);
        declareFunction("cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
        declareFunction("get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
        declareFunction("set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
        declareFunction("cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt14 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt15 = list(list(makeSymbol("CSETQ"), makeSymbol("VALUE-TEST"), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("INDEXED-ITEMS"), list(makeSymbol("NEW-INDEXED-ITEMS"))), list(makeSymbol("CSETQ"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYCL-AND-GEN-INDEX-ENTRY-COMPUTER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(QUOTE, makeSymbol("SET-INDEX")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("IN-MEMORY-EQUALP-INDEX")))), list(RET, makeSymbol("SELF")));

    public static SubLObject init_inverted_indexes_concrete_file() {
        return NIL;
    }

    public static final SubLObject setup_inverted_indexes_concrete_file_alt() {
        classes.subloop_new_class(CYCL_AND_GEN_INDEX, INVERTED_INDEX, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYCL_AND_GEN_INDEX, NIL);
        classes.subloop_note_class_initialization_function(CYCL_AND_GEN_INDEX, SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_AND_GEN_INDEX, SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE);
        com.cyc.cycjava.cycl.inverted_indexes_concrete.subloop_reserved_initialize_cycl_and_gen_index_class(CYCL_AND_GEN_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, CYCL_AND_GEN_INDEX, $list_alt14, NIL, $list_alt15);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, INITIALIZE, CYCL_AND_GEN_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(LOOKUP, CYCL_AND_GEN_INDEX, $list_alt22, $list_alt23, $list_alt24);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, LOOKUP, CYCL_AND_GEN_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_KEY, CYCL_AND_GEN_INDEX, $list_alt22, $list_alt28, $list_alt29);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, REMOVE_KEY, CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_VALUE, CYCL_AND_GEN_INDEX, $list_alt22, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX, REMOVE_VALUE, CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD);
        classes.subloop_new_class(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, INDEX_ENTRY_COMPUTER, NIL, NIL, $list_alt39);
        classes.class_set_implements_slot_listeners(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_note_class_initialization_function(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA);
        classes.subloop_note_instance_initialization_function(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS);
        com.cyc.cycjava.cycl.inverted_indexes_concrete.subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method(SET_INDEX, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list_alt14, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_INDEX, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD);
        methods.methods_incorporate_instance_method(SET_GENERATION_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list_alt14, $list_alt51, $list_alt52);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_GENERATION_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_GENERATION_DOMAIN_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list_alt14, $list_alt51, $list_alt57);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, SET_GENERATION_DOMAIN_MT, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_INDEX_ENTRIES, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list_alt14, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, COMPUTE_INDEX_ENTRIES, CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
        classes.subloop_new_class(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, TEST_CASE, NIL, NIL, $list_alt67);
        classes.class_set_implements_slot_listeners(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, NIL);
        classes.subloop_note_class_initialization_function(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $sym77$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
        classes.subloop_note_instance_initialization_function(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $sym80$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
        com.cyc.cycjava.cycl.inverted_indexes_concrete.subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_class(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
        sunit_macros.define_test_case_postamble(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $str_alt81$inverted_indexes_concrete, $$$cycl, NIL);
        sunit_macros.def_test_method_register(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, TEST_INVERTED_INDEX_CYCL_GEN_ENTRY_DELETE);
        sunit_external.define_test_suite($$$Inverted_Index_Test_Suite, NIL, $list_alt85, $list_alt86);
        return NIL;
    }

    public static SubLObject setup_inverted_indexes_concrete_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
            classes.subloop_new_class(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, TEST_CASE, NIL, NIL, $list_alt67);
            classes.class_set_implements_slot_listeners(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, NIL);
            classes.subloop_note_class_initialization_function(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $sym77$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
            classes.subloop_note_instance_initialization_function(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $sym80$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
            com.cyc.cycjava.cycl.inverted_indexes_concrete.subloop_reserved_initialize_inverted_index_cycl_gen_insert_delete_class(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE);
            sunit_macros.define_test_case_postamble(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, $str_alt81$inverted_indexes_concrete, $$$cycl, NIL);
            sunit_macros.def_test_method_register(INVERTED_INDEX_CYCL_GEN_INSERT_DELETE, TEST_INVERTED_INDEX_CYCL_GEN_ENTRY_DELETE);
            sunit_external.define_test_suite($$$Inverted_Index_Test_Suite, NIL, $list_alt85, $list_alt86);
        }
        return NIL;
    }

    public static SubLObject setup_inverted_indexes_concrete_file_Previous() {
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

    static private final SubLList $list_alt22 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt23 = list(makeSymbol("KEY"));

    static private final SubLList $list_alt24 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUIDS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(QUOTE, makeSymbol("LOOKUP")), makeSymbol("KEY"))), list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUID"), makeSymbol("SUIDS")), list(makeSymbol("CLET"), list(list(makeSymbol("ITEM"), list(makeSymbol("GET-ITEM-FROM-INDEX-SUID"), makeSymbol("INDEXED-ITEMS"), makeSymbol("SUID")))), list(makeSymbol("PWHEN"), makeSymbol("ITEM"), list(makeSymbol("CPUSH"), makeSymbol("ITEM"), makeSymbol("RESULT"))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))));

    static private final SubLList $list_alt28 = list(makeSymbol("INDEX-KEY"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENTRIES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(QUOTE, makeSymbol("COMPUTE-INDEX-ENTRIES")), makeSymbol("INDEX-KEY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), makeSymbol("ENTRIES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REMOVE-VALUE")), makeSymbol("ENTRY")))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt34 = list(makeSymbol("INDEX-ENTRY"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("FIM"), makeSymbol("PHYSICAL-INDEX"), list(QUOTE, makeSymbol("REMOVE")), makeSymbol("INDEX-ENTRY")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt39 = list(list(makeSymbol("GENERATION-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GENERATION-DOMAIN-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARENT-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("ITEM-TO-INDEX")), makeKeyword("PUBLIC")));

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

    static {
    }

    static private final SubLList $list_alt45 = list(makeSymbol("INVERTED-INDEX"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("INVERTED-INDEX"), makeSymbol("INVERTED-INDEX-P")), list(makeSymbol("CSETQ"), makeSymbol("PARENT-INDEX"), makeSymbol("INVERTED-INDEX")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt51 = list(makeSymbol("MT"));

    static private final SubLList $list_alt52 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-MT"), makeSymbol("MT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt57 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("CSETQ"), makeSymbol("GENERATION-DOMAIN-MT"), makeSymbol("MT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt60 = list(makeSymbol("CYCL"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INDEXED-ITEMS"), list(makeSymbol("GET-SLOT"), makeSymbol("PARENT-INDEX"), list(QUOTE, makeSymbol("INDEXED-ITEMS")))), list(makeSymbol("MY-INDEX"), list(makeSymbol("MAYBE-ADD-NEW-INDEXED-ITEM"), makeSymbol("INDEXED-ITEMS"), makeSymbol("CYCL"))), makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("FORT"), list(makeSymbol("EXPRESSION-GATHER"), makeSymbol("CYCL"), list(QUOTE, makeSymbol("FORT-P")), T)), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("FORT"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), list(makeSymbol("GENERATE-QUESTION"), makeSymbol("CYCL")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), makeSymbol("MY-INDEX")), makeSymbol("RESULT"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol INVERTED_INDEX_CYCL_GEN_INSERT_DELETE = makeSymbol("INVERTED-INDEX-CYCL-GEN-INSERT-DELETE");

    static private final SubLList $list_alt67 = list(list(makeSymbol("INDEX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOD-ITEMS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("BAD-ITEMS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INVERTED-INDEX-CYCL-GEN-ENTRY-DELETE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol BAD_ITEMS = makeSymbol("BAD-ITEMS");

    private static final SubLSymbol GOOD_ITEMS = makeSymbol("GOOD-ITEMS");

    static private final SubLSymbol $sym77$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-CLASS");

    static private final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CYCL_GEN_INSERT_DELETE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CYCL-GEN-INSERT-DELETE-INSTANCE");

    static private final SubLString $str_alt81$inverted_indexes_concrete = makeString("inverted-indexes-concrete");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_INVERTED_INDEX_CYCL_GEN_ENTRY_DELETE = makeSymbol("TEST-INVERTED-INDEX-CYCL-GEN-ENTRY-DELETE");

    static private final SubLList $list_alt85 = list(list(makeString("inverted-index"), makeString("cycl")));

    static private final SubLList $list_alt86 = list(makeSymbol("INVERTED-INDEX-CYCL-GEN-INSERT-DELETE"));
}

/**
 * Total time: 265 ms
 */
