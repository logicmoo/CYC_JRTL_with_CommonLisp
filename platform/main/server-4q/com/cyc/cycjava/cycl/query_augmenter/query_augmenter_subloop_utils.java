/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.query_augmenter;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
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
 *  module:      QUERY-AUGMENTER-SUBLOOP-UTILS
 *  source file: /cyc/top/cycl/query-augmenter/query-augmenter-subloop-utils.lisp
 *  created:     2019/07/03 17:38:57
 */
public final class query_augmenter_subloop_utils extends SubLTranslatedFile implements V02 {
    // // Constructor
    private query_augmenter_subloop_utils() {
    }

    public static final SubLFile me = new query_augmenter_subloop_utils();


    // // Definitions
    public static final SubLObject get_nl_annotated_cycl_term_pph_info(SubLObject nl_annotated_cycl_term) {
        return classes.subloop_get_access_protected_instance_slot(nl_annotated_cycl_term, TWO_INTEGER, PPH_INFO);
    }

    public static final SubLObject set_nl_annotated_cycl_term_pph_info(SubLObject nl_annotated_cycl_term, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(nl_annotated_cycl_term, value, TWO_INTEGER, PPH_INFO);
    }

    public static final SubLObject get_nl_annotated_cycl_term_cycl_term(SubLObject nl_annotated_cycl_term) {
        return classes.subloop_get_access_protected_instance_slot(nl_annotated_cycl_term, ONE_INTEGER, CYCL_TERM);
    }

    public static final SubLObject set_nl_annotated_cycl_term_cycl_term(SubLObject nl_annotated_cycl_term, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(nl_annotated_cycl_term, value, ONE_INTEGER, CYCL_TERM);
    }

    public static final SubLObject subloop_reserved_initialize_nl_annotated_cycl_term_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nl_annotated_cycl_term_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NL_ANNOTATED_CYCL_TERM, CYCL_TERM, NIL);
        classes.subloop_initialize_slot(new_instance, NL_ANNOTATED_CYCL_TERM, PPH_INFO, NIL);
        return NIL;
    }

    public static final SubLObject nl_annotated_cycl_term_p(SubLObject nl_annotated_cycl_term) {
        return classes.subloop_instanceof_class(nl_annotated_cycl_term, NL_ANNOTATED_CYCL_TERM);
    }

    public static final SubLObject nl_annotated_cycl_term_get_cycl_term_method(SubLObject self) {
        {
            SubLObject catch_var_for_nl_annotated_cycl_term_method = NIL;
            SubLObject cycl_term = get_nl_annotated_cycl_term_cycl_term(self);
            try {
                try {
                    sublisp_throw($sym13$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD, cycl_term);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_nl_annotated_cycl_term_cycl_term(self, cycl_term);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_nl_annotated_cycl_term_method = Errors.handleThrowable(ccatch_env_var, $sym13$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD);
            }
            return catch_var_for_nl_annotated_cycl_term_method;
        }
    }

    public static final SubLObject nl_annotated_cycl_term_get_pph_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_nl_annotated_cycl_term_method = NIL;
            SubLObject pph_info = get_nl_annotated_cycl_term_pph_info(self);
            try {
                try {
                    sublisp_throw($sym17$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD, pph_info);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_nl_annotated_cycl_term_pph_info(self, pph_info);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_nl_annotated_cycl_term_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD);
            }
            return catch_var_for_nl_annotated_cycl_term_method;
        }
    }

    public static final SubLObject nl_annotated_cycl_term_set_cycl_term_method(SubLObject self, SubLObject new_val) {
        {
            SubLObject catch_var_for_nl_annotated_cycl_term_method = NIL;
            SubLObject cycl_term = get_nl_annotated_cycl_term_cycl_term(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_val, CYCL_DENOTATIONAL_TERM_P);
                    cycl_term = new_val;
                    sublisp_throw($sym22$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_nl_annotated_cycl_term_cycl_term(self, cycl_term);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_nl_annotated_cycl_term_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD);
            }
            return catch_var_for_nl_annotated_cycl_term_method;
        }
    }

    public static final SubLObject nl_annotated_cycl_term_set_pph_info_method(SubLObject self, SubLObject new_val) {
        {
            SubLObject catch_var_for_nl_annotated_cycl_term_method = NIL;
            SubLObject pph_info = get_nl_annotated_cycl_term_pph_info(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_val, STRINGP);
                    pph_info = new_val;
                    sublisp_throw($sym27$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_nl_annotated_cycl_term_pph_info(self, pph_info);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_nl_annotated_cycl_term_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD);
            }
            return catch_var_for_nl_annotated_cycl_term_method;
        }
    }

    public static final SubLObject get_qua_followup_list_ask_status(SubLObject qua_followup_list) {
        return classes.subloop_get_access_protected_instance_slot(qua_followup_list, FOUR_INTEGER, ASK_STATUS);
    }

    public static final SubLObject set_qua_followup_list_ask_status(SubLObject qua_followup_list, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qua_followup_list, value, FOUR_INTEGER, ASK_STATUS);
    }

    public static final SubLObject subloop_reserved_initialize_qua_followup_list_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_qua_followup_list_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_END_POINTER_LIST, END_POINTER, NIL);
        classes.subloop_initialize_slot(new_instance, QUA_FOLLOWUP_LIST, ASK_STATUS, NIL);
        return NIL;
    }

    public static final SubLObject qua_followup_list_p(SubLObject qua_followup_list) {
        return classes.subloop_instanceof_class(qua_followup_list, QUA_FOLLOWUP_LIST);
    }

    public static final SubLObject qua_followup_list_get_ask_status_method(SubLObject self) {
        {
            SubLObject catch_var_for_qua_followup_list_method = NIL;
            SubLObject ask_status = get_qua_followup_list_ask_status(self);
            try {
                try {
                    sublisp_throw($sym43$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD, ask_status);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_qua_followup_list_ask_status(self, ask_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_qua_followup_list_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD);
            }
            return catch_var_for_qua_followup_list_method;
        }
    }

    public static final SubLObject qua_followup_list_set_ask_status_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_qua_followup_list_method = NIL;
            SubLObject ask_status = get_qua_followup_list_ask_status(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_value, SYMBOLP);
                    ask_status = new_value;
                    sublisp_throw($sym48$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_qua_followup_list_ask_status(self, ask_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_qua_followup_list_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD);
            }
            return catch_var_for_qua_followup_list_method;
        }
    }

    public static final SubLObject qua_followup_list_get_concept_list_method(SubLObject self) {
        {
            SubLObject enumerator = methods.funcall_instance_method_with_0_args(self, ALLOCATE_ENUMERATOR);
            SubLObject element = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
            SubLObject concepts = NIL;
            while (NIL != element) {
                concepts = cons(methods.funcall_instance_method_with_0_args(element, GET_CYCL_TERM), concepts);
                element = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
            } 
            return concepts;
        }
    }

    public static final SubLObject get_qua_interpretation_list_ask_status(SubLObject qua_interpretation_list) {
        return classes.subloop_get_access_protected_instance_slot(qua_interpretation_list, FOUR_INTEGER, ASK_STATUS);
    }

    public static final SubLObject set_qua_interpretation_list_ask_status(SubLObject qua_interpretation_list, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qua_interpretation_list, value, FOUR_INTEGER, ASK_STATUS);
    }

    public static final SubLObject subloop_reserved_initialize_qua_interpretation_list_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_qua_interpretation_list_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_END_POINTER_LIST, END_POINTER, NIL);
        classes.subloop_initialize_slot(new_instance, QUA_INTERPRETATION_LIST, ASK_STATUS, NIL);
        return NIL;
    }

    public static final SubLObject qua_interpretation_list_p(SubLObject qua_interpretation_list) {
        return classes.subloop_instanceof_class(qua_interpretation_list, QUA_INTERPRETATION_LIST);
    }

    public static final SubLObject qua_interpretation_list_get_ask_status_method(SubLObject self) {
        {
            SubLObject catch_var_for_qua_interpretation_list_method = NIL;
            SubLObject ask_status = get_qua_interpretation_list_ask_status(self);
            try {
                try {
                    sublisp_throw($sym61$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD, ask_status);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_qua_interpretation_list_ask_status(self, ask_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_qua_interpretation_list_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD);
            }
            return catch_var_for_qua_interpretation_list_method;
        }
    }

    public static final SubLObject qua_interpretation_list_set_ask_status_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_qua_interpretation_list_method = NIL;
            SubLObject ask_status = get_qua_interpretation_list_ask_status(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_value, SYMBOLP);
                    ask_status = new_value;
                    sublisp_throw($sym63$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_qua_interpretation_list_ask_status(self, ask_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_qua_interpretation_list_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD);
            }
            return catch_var_for_qua_interpretation_list_method;
        }
    }

    public static final SubLObject get_query_augmenter_search_string_function(SubLObject query_augmenter) {
        return classes.subloop_get_access_protected_instance_slot(query_augmenter, FIVE_INTEGER, SEARCH_STRING_FUNCTION);
    }

    public static final SubLObject set_query_augmenter_search_string_function(SubLObject query_augmenter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_augmenter, value, FIVE_INTEGER, SEARCH_STRING_FUNCTION);
    }

    public static final SubLObject get_query_augmenter_interpretation_container_type(SubLObject query_augmenter) {
        return classes.subloop_get_access_protected_instance_slot(query_augmenter, FOUR_INTEGER, INTERPRETATION_CONTAINER_TYPE);
    }

    public static final SubLObject set_query_augmenter_interpretation_container_type(SubLObject query_augmenter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_augmenter, value, FOUR_INTEGER, INTERPRETATION_CONTAINER_TYPE);
    }

    public static final SubLObject get_query_augmenter_interpretation_element_type(SubLObject query_augmenter) {
        return classes.subloop_get_access_protected_instance_slot(query_augmenter, THREE_INTEGER, INTERPRETATION_ELEMENT_TYPE);
    }

    public static final SubLObject set_query_augmenter_interpretation_element_type(SubLObject query_augmenter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_augmenter, value, THREE_INTEGER, INTERPRETATION_ELEMENT_TYPE);
    }

    public static final SubLObject get_query_augmenter_followup_container_type(SubLObject query_augmenter) {
        return classes.subloop_get_access_protected_instance_slot(query_augmenter, TWO_INTEGER, FOLLOWUP_CONTAINER_TYPE);
    }

    public static final SubLObject set_query_augmenter_followup_container_type(SubLObject query_augmenter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_augmenter, value, TWO_INTEGER, FOLLOWUP_CONTAINER_TYPE);
    }

    public static final SubLObject get_query_augmenter_followup_element_type(SubLObject query_augmenter) {
        return classes.subloop_get_access_protected_instance_slot(query_augmenter, ONE_INTEGER, FOLLOWUP_ELEMENT_TYPE);
    }

    public static final SubLObject set_query_augmenter_followup_element_type(SubLObject query_augmenter, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_augmenter, value, ONE_INTEGER, FOLLOWUP_ELEMENT_TYPE);
    }

    public static final SubLObject subloop_reserved_initialize_query_augmenter_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_query_augmenter_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUERY_AUGMENTER, FOLLOWUP_ELEMENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUERY_AUGMENTER, FOLLOWUP_CONTAINER_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUERY_AUGMENTER, INTERPRETATION_ELEMENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUERY_AUGMENTER, INTERPRETATION_CONTAINER_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUERY_AUGMENTER, SEARCH_STRING_FUNCTION, NIL);
        return NIL;
    }

    public static final SubLObject query_augmenter_p(SubLObject query_augmenter) {
        return classes.subloop_instanceof_class(query_augmenter, QUERY_AUGMENTER);
    }

    public static final SubLObject query_augmenter_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_query_augmenter_method = NIL;
            SubLObject search_string_function = get_query_augmenter_search_string_function(self);
            SubLObject interpretation_container_type = get_query_augmenter_interpretation_container_type(self);
            SubLObject interpretation_element_type = get_query_augmenter_interpretation_element_type(self);
            SubLObject followup_container_type = get_query_augmenter_followup_container_type(self);
            SubLObject followup_element_type = get_query_augmenter_followup_element_type(self);
            try {
                try {
                    object.object_initialize_method(self);
                    followup_element_type = NL_ANNOTATED_CYCL_TERM;
                    followup_container_type = QUA_FOLLOWUP_LIST;
                    interpretation_element_type = NL_ANNOTATED_CYCL_TERM;
                    interpretation_container_type = QUA_INTERPRETATION_LIST;
                    search_string_function = symbol_function(QUA_SEARCH_STRING_FUNCTION);
                    sublisp_throw($sym77$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_query_augmenter_search_string_function(self, search_string_function);
                            set_query_augmenter_interpretation_container_type(self, interpretation_container_type);
                            set_query_augmenter_interpretation_element_type(self, interpretation_element_type);
                            set_query_augmenter_followup_container_type(self, followup_container_type);
                            set_query_augmenter_followup_element_type(self, followup_element_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_query_augmenter_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD);
            }
            return catch_var_for_query_augmenter_method;
        }
    }

    public static final SubLObject query_augmenter_interpretations_method(SubLObject self, SubLObject nl_phrase, SubLObject id, SubLObject timeout) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_query_augmenter_method = NIL;
                SubLObject interpretation_container_type = get_query_augmenter_interpretation_container_type(self);
                SubLObject followup_element_type = get_query_augmenter_followup_element_type(self);
                try {
                    try {
                        {
                            SubLObject interpretation_list = NIL;
                            SubLObject parsing_timed_outP = NIL;
                            {
                                SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                                SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                SubLObject _prev_bind_11 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                SubLObject _prev_bind_12 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                SubLObject _prev_bind_13 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                try {
                                    control_vars.$within_assert$.bind(NIL, thread);
                                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                    parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                    if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                        {
                                            SubLObject status = $EXHAUST;
                                            {
                                                SubLObject _prev_bind_0_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                                                SubLObject _prev_bind_1_2 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
                                                SubLObject _prev_bind_2_3 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
                                                try {
                                                    parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                                                    abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
                                                    lexicon_vars.$exclude_vulgaritiesP$.bind(T, thread);
                                                    {
                                                        SubLObject v_related_concepts = psp_main.ps_get_cycls_for_phrase(nl_phrase, $list_alt85, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != parsing_timed_outP) {
                                                            status = $TIME;
                                                        }
                                                        interpretation_list = object.new_class_instance(interpretation_container_type);
                                                        {
                                                            SubLObject concept_phrase_pairs = pph_main.generate_disambiguation_phrases(v_related_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject cdolist_list_var = concept_phrase_pairs;
                                                            SubLObject pair = NIL;
                                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = pair;
                                                                    SubLObject current = datum;
                                                                    SubLObject concept = NIL;
                                                                    SubLObject phrase = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt87);
                                                                    concept = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt87);
                                                                    phrase = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != phrase) {
                                                                            {
                                                                                SubLObject v_new = object.new_class_instance(followup_element_type);
                                                                                methods.funcall_instance_method_with_1_args(interpretation_list, SET_ASK_STATUS, status);
                                                                                methods.funcall_instance_method_with_1_args(v_new, SET_CYCL_TERM, narts_high.nart_substitute(concept));
                                                                                methods.funcall_instance_method_with_1_args(v_new, SET_PPH_INFO, phrase);
                                                                                methods.funcall_instance_method_with_1_args(interpretation_list, ADD, v_new);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt87);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_2_3, thread);
                                                    abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_1_2, thread);
                                                    parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                        }
                                    }
                                    parsing_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                } finally {
                                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_13, thread);
                                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_12, thread);
                                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_11, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                    wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                    czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                                }
                            }
                            sublisp_throw($sym83$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD, interpretation_list);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_query_augmenter_interpretation_container_type(self, interpretation_container_type);
                                set_query_augmenter_followup_element_type(self, followup_element_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_query_augmenter_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD);
                }
                return catch_var_for_query_augmenter_method;
            }
        }
    }

    public static final SubLObject query_augmenter_followups_method(SubLObject self, SubLObject cycl_term, SubLObject id, SubLObject timeout) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_query_augmenter_method = NIL;
                SubLObject followup_container_type = get_query_augmenter_followup_container_type(self);
                SubLObject followup_element_type = get_query_augmenter_followup_element_type(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(cycl_term, CYCL_DENOTATIONAL_TERM_P);
                        {
                            SubLObject followup_concepts_list = NIL;
                            {
                                SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                                SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                SubLObject _prev_bind_11 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
                                try {
                                    control_vars.$within_assert$.bind(NIL, thread);
                                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                    abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_related_concepts = ask_utilities.ask_template($sym94$_X, listS($$qaFollowupConcepts, cycl_term, $list_alt96), $$WebSearchEnhancementMt, TWO_INTEGER, NIL, timeout, UNPROVIDED);
                                        SubLObject status = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        followup_concepts_list = object.new_class_instance(followup_container_type);
                                        {
                                            SubLObject term_phrase_pairs = pph_main.generate_disambiguation_phrases(v_related_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject cdolist_list_var = term_phrase_pairs;
                                            SubLObject pair = NIL;
                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = pair;
                                                    SubLObject current = datum;
                                                    SubLObject concept = NIL;
                                                    SubLObject phrase = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt87);
                                                    concept = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt87);
                                                    phrase = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL != phrase) {
                                                            {
                                                                SubLObject v_new = object.new_class_instance(followup_element_type);
                                                                methods.funcall_instance_method_with_1_args(followup_concepts_list, SET_ASK_STATUS, status);
                                                                methods.funcall_instance_method_with_1_args(v_new, SET_CYCL_TERM, narts_high.nart_substitute(concept));
                                                                methods.funcall_instance_method_with_1_args(v_new, SET_PPH_INFO, phrase);
                                                                methods.funcall_instance_method_with_1_args(followup_concepts_list, ADD, v_new);
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt87);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_11, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                    wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                    czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                                }
                            }
                            sublisp_throw($sym93$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD, followup_concepts_list);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_query_augmenter_followup_container_type(self, followup_container_type);
                                set_query_augmenter_followup_element_type(self, followup_element_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_query_augmenter_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD);
                }
                return catch_var_for_query_augmenter_method;
            }
        }
    }

    public static final SubLObject query_augmenter_search_string_method(SubLObject self, SubLObject cycl_term, SubLObject id, SubLObject timeout) {
        {
            SubLObject catch_var_for_query_augmenter_method = NIL;
            SubLObject search_string_function = get_query_augmenter_search_string_function(self);
            try {
                try {
                    SubLTrampolineFile.checkType(cycl_term, CYCL_DENOTATIONAL_TERM_P);
                    sublisp_throw($sym101$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD, funcall(search_string_function, cycl_term, id, timeout));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_query_augmenter_search_string_function(self, search_string_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_query_augmenter_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD);
            }
            return catch_var_for_query_augmenter_method;
        }
    }

    public static final SubLObject qua_search_string_function(SubLObject cycl_term, SubLObject id, SubLObject timeout) {
        return $str_alt103$THIS_IS_A_STUB__SHOULD_BE_OVERRID;
    }

    public static final SubLObject declare_query_augmenter_subloop_utils_file() {
        declareFunction("get_nl_annotated_cycl_term_pph_info", "GET-NL-ANNOTATED-CYCL-TERM-PPH-INFO", 1, 0, false);
        declareFunction("set_nl_annotated_cycl_term_pph_info", "SET-NL-ANNOTATED-CYCL-TERM-PPH-INFO", 2, 0, false);
        declareFunction("get_nl_annotated_cycl_term_cycl_term", "GET-NL-ANNOTATED-CYCL-TERM-CYCL-TERM", 1, 0, false);
        declareFunction("set_nl_annotated_cycl_term_cycl_term", "SET-NL-ANNOTATED-CYCL-TERM-CYCL-TERM", 2, 0, false);
        declareFunction("subloop_reserved_initialize_nl_annotated_cycl_term_class", "SUBLOOP-RESERVED-INITIALIZE-NL-ANNOTATED-CYCL-TERM-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_nl_annotated_cycl_term_instance", "SUBLOOP-RESERVED-INITIALIZE-NL-ANNOTATED-CYCL-TERM-INSTANCE", 1, 0, false);
        declareFunction("nl_annotated_cycl_term_p", "NL-ANNOTATED-CYCL-TERM-P", 1, 0, false);
        declareFunction("nl_annotated_cycl_term_get_cycl_term_method", "NL-ANNOTATED-CYCL-TERM-GET-CYCL-TERM-METHOD", 1, 0, false);
        declareFunction("nl_annotated_cycl_term_get_pph_info_method", "NL-ANNOTATED-CYCL-TERM-GET-PPH-INFO-METHOD", 1, 0, false);
        declareFunction("nl_annotated_cycl_term_set_cycl_term_method", "NL-ANNOTATED-CYCL-TERM-SET-CYCL-TERM-METHOD", 2, 0, false);
        declareFunction("nl_annotated_cycl_term_set_pph_info_method", "NL-ANNOTATED-CYCL-TERM-SET-PPH-INFO-METHOD", 2, 0, false);
        declareFunction("get_qua_followup_list_ask_status", "GET-QUA-FOLLOWUP-LIST-ASK-STATUS", 1, 0, false);
        declareFunction("set_qua_followup_list_ask_status", "SET-QUA-FOLLOWUP-LIST-ASK-STATUS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_qua_followup_list_class", "SUBLOOP-RESERVED-INITIALIZE-QUA-FOLLOWUP-LIST-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_qua_followup_list_instance", "SUBLOOP-RESERVED-INITIALIZE-QUA-FOLLOWUP-LIST-INSTANCE", 1, 0, false);
        declareFunction("qua_followup_list_p", "QUA-FOLLOWUP-LIST-P", 1, 0, false);
        declareFunction("qua_followup_list_get_ask_status_method", "QUA-FOLLOWUP-LIST-GET-ASK-STATUS-METHOD", 1, 0, false);
        declareFunction("qua_followup_list_set_ask_status_method", "QUA-FOLLOWUP-LIST-SET-ASK-STATUS-METHOD", 2, 0, false);
        declareFunction("qua_followup_list_get_concept_list_method", "QUA-FOLLOWUP-LIST-GET-CONCEPT-LIST-METHOD", 1, 0, false);
        declareFunction("get_qua_interpretation_list_ask_status", "GET-QUA-INTERPRETATION-LIST-ASK-STATUS", 1, 0, false);
        declareFunction("set_qua_interpretation_list_ask_status", "SET-QUA-INTERPRETATION-LIST-ASK-STATUS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_qua_interpretation_list_class", "SUBLOOP-RESERVED-INITIALIZE-QUA-INTERPRETATION-LIST-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_qua_interpretation_list_instance", "SUBLOOP-RESERVED-INITIALIZE-QUA-INTERPRETATION-LIST-INSTANCE", 1, 0, false);
        declareFunction("qua_interpretation_list_p", "QUA-INTERPRETATION-LIST-P", 1, 0, false);
        declareFunction("qua_interpretation_list_get_ask_status_method", "QUA-INTERPRETATION-LIST-GET-ASK-STATUS-METHOD", 1, 0, false);
        declareFunction("qua_interpretation_list_set_ask_status_method", "QUA-INTERPRETATION-LIST-SET-ASK-STATUS-METHOD", 2, 0, false);
        declareFunction("get_query_augmenter_search_string_function", "GET-QUERY-AUGMENTER-SEARCH-STRING-FUNCTION", 1, 0, false);
        declareFunction("set_query_augmenter_search_string_function", "SET-QUERY-AUGMENTER-SEARCH-STRING-FUNCTION", 2, 0, false);
        declareFunction("get_query_augmenter_interpretation_container_type", "GET-QUERY-AUGMENTER-INTERPRETATION-CONTAINER-TYPE", 1, 0, false);
        declareFunction("set_query_augmenter_interpretation_container_type", "SET-QUERY-AUGMENTER-INTERPRETATION-CONTAINER-TYPE", 2, 0, false);
        declareFunction("get_query_augmenter_interpretation_element_type", "GET-QUERY-AUGMENTER-INTERPRETATION-ELEMENT-TYPE", 1, 0, false);
        declareFunction("set_query_augmenter_interpretation_element_type", "SET-QUERY-AUGMENTER-INTERPRETATION-ELEMENT-TYPE", 2, 0, false);
        declareFunction("get_query_augmenter_followup_container_type", "GET-QUERY-AUGMENTER-FOLLOWUP-CONTAINER-TYPE", 1, 0, false);
        declareFunction("set_query_augmenter_followup_container_type", "SET-QUERY-AUGMENTER-FOLLOWUP-CONTAINER-TYPE", 2, 0, false);
        declareFunction("get_query_augmenter_followup_element_type", "GET-QUERY-AUGMENTER-FOLLOWUP-ELEMENT-TYPE", 1, 0, false);
        declareFunction("set_query_augmenter_followup_element_type", "SET-QUERY-AUGMENTER-FOLLOWUP-ELEMENT-TYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_query_augmenter_class", "SUBLOOP-RESERVED-INITIALIZE-QUERY-AUGMENTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_query_augmenter_instance", "SUBLOOP-RESERVED-INITIALIZE-QUERY-AUGMENTER-INSTANCE", 1, 0, false);
        declareFunction("query_augmenter_p", "QUERY-AUGMENTER-P", 1, 0, false);
        declareFunction("query_augmenter_initialize_method", "QUERY-AUGMENTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("query_augmenter_interpretations_method", "QUERY-AUGMENTER-INTERPRETATIONS-METHOD", 4, 0, false);
        declareFunction("query_augmenter_followups_method", "QUERY-AUGMENTER-FOLLOWUPS-METHOD", 4, 0, false);
        declareFunction("query_augmenter_search_string_method", "QUERY-AUGMENTER-SEARCH-STRING-METHOD", 4, 0, false);
        declareFunction("qua_search_string_function", "QUA-SEARCH-STRING-FUNCTION", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_query_augmenter_subloop_utils_file() {
        return NIL;
    }

    public static final SubLObject setup_query_augmenter_subloop_utils_file() {
                classes.subloop_new_class(NL_ANNOTATED_CYCL_TERM, OBJECT, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(NL_ANNOTATED_CYCL_TERM, NIL);
        classes.subloop_note_class_initialization_function(NL_ANNOTATED_CYCL_TERM, SUBLOOP_RESERVED_INITIALIZE_NL_ANNOTATED_CYCL_TERM_CLASS);
        classes.subloop_note_instance_initialization_function(NL_ANNOTATED_CYCL_TERM, SUBLOOP_RESERVED_INITIALIZE_NL_ANNOTATED_CYCL_TERM_INSTANCE);
        subloop_reserved_initialize_nl_annotated_cycl_term_class(NL_ANNOTATED_CYCL_TERM);
        methods.methods_incorporate_instance_method(GET_CYCL_TERM, NL_ANNOTATED_CYCL_TERM, $list_alt11, NIL, $list_alt12);
        methods.subloop_register_instance_method(NL_ANNOTATED_CYCL_TERM, GET_CYCL_TERM, NL_ANNOTATED_CYCL_TERM_GET_CYCL_TERM_METHOD);
        methods.methods_incorporate_instance_method(GET_PPH_INFO, NL_ANNOTATED_CYCL_TERM, $list_alt11, NIL, $list_alt16);
        methods.subloop_register_instance_method(NL_ANNOTATED_CYCL_TERM, GET_PPH_INFO, NL_ANNOTATED_CYCL_TERM_GET_PPH_INFO_METHOD);
        methods.methods_incorporate_instance_method(SET_CYCL_TERM, NL_ANNOTATED_CYCL_TERM, $list_alt11, $list_alt20, $list_alt21);
        methods.subloop_register_instance_method(NL_ANNOTATED_CYCL_TERM, SET_CYCL_TERM, NL_ANNOTATED_CYCL_TERM_SET_CYCL_TERM_METHOD);
        methods.methods_incorporate_instance_method(SET_PPH_INFO, NL_ANNOTATED_CYCL_TERM, $list_alt11, $list_alt20, $list_alt26);
        methods.subloop_register_instance_method(NL_ANNOTATED_CYCL_TERM, SET_PPH_INFO, NL_ANNOTATED_CYCL_TERM_SET_PPH_INFO_METHOD);
        classes.subloop_new_class(QUA_FOLLOWUP_LIST, BASIC_END_POINTER_LIST, $list_alt32, NIL, $list_alt33);
        classes.class_set_implements_slot_listeners(QUA_FOLLOWUP_LIST, NIL);
        classes.subloop_note_class_initialization_function(QUA_FOLLOWUP_LIST, SUBLOOP_RESERVED_INITIALIZE_QUA_FOLLOWUP_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(QUA_FOLLOWUP_LIST, SUBLOOP_RESERVED_INITIALIZE_QUA_FOLLOWUP_LIST_INSTANCE);
        subloop_reserved_initialize_qua_followup_list_class(QUA_FOLLOWUP_LIST);
        methods.methods_incorporate_instance_method(GET_ASK_STATUS, QUA_FOLLOWUP_LIST, $list_alt11, NIL, $list_alt42);
        methods.subloop_register_instance_method(QUA_FOLLOWUP_LIST, GET_ASK_STATUS, QUA_FOLLOWUP_LIST_GET_ASK_STATUS_METHOD);
        methods.methods_incorporate_instance_method(SET_ASK_STATUS, QUA_FOLLOWUP_LIST, $list_alt11, $list_alt46, $list_alt47);
        methods.subloop_register_instance_method(QUA_FOLLOWUP_LIST, SET_ASK_STATUS, QUA_FOLLOWUP_LIST_SET_ASK_STATUS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONCEPT_LIST, QUA_FOLLOWUP_LIST, $list_alt11, NIL, $list_alt52);
        methods.subloop_register_instance_method(QUA_FOLLOWUP_LIST, GET_CONCEPT_LIST, QUA_FOLLOWUP_LIST_GET_CONCEPT_LIST_METHOD);
        classes.subloop_new_class(QUA_INTERPRETATION_LIST, BASIC_END_POINTER_LIST, $list_alt32, NIL, $list_alt58);
        classes.class_set_implements_slot_listeners(QUA_INTERPRETATION_LIST, NIL);
        classes.subloop_note_class_initialization_function(QUA_INTERPRETATION_LIST, SUBLOOP_RESERVED_INITIALIZE_QUA_INTERPRETATION_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(QUA_INTERPRETATION_LIST, SUBLOOP_RESERVED_INITIALIZE_QUA_INTERPRETATION_LIST_INSTANCE);
        subloop_reserved_initialize_qua_interpretation_list_class(QUA_INTERPRETATION_LIST);
        methods.methods_incorporate_instance_method(GET_ASK_STATUS, QUA_INTERPRETATION_LIST, $list_alt11, NIL, $list_alt42);
        methods.subloop_register_instance_method(QUA_INTERPRETATION_LIST, GET_ASK_STATUS, QUA_INTERPRETATION_LIST_GET_ASK_STATUS_METHOD);
        methods.methods_incorporate_instance_method(SET_ASK_STATUS, QUA_INTERPRETATION_LIST, $list_alt11, $list_alt46, $list_alt47);
        methods.subloop_register_instance_method(QUA_INTERPRETATION_LIST, SET_ASK_STATUS, QUA_INTERPRETATION_LIST_SET_ASK_STATUS_METHOD);
        classes.subloop_new_class(QUERY_AUGMENTER, OBJECT, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(QUERY_AUGMENTER, NIL);
        classes.subloop_note_class_initialization_function(QUERY_AUGMENTER, SUBLOOP_RESERVED_INITIALIZE_QUERY_AUGMENTER_CLASS);
        classes.subloop_note_instance_initialization_function(QUERY_AUGMENTER, SUBLOOP_RESERVED_INITIALIZE_QUERY_AUGMENTER_INSTANCE);
        subloop_reserved_initialize_query_augmenter_class(QUERY_AUGMENTER);
        methods.methods_incorporate_instance_method(INITIALIZE, QUERY_AUGMENTER, $list_alt75, NIL, $list_alt76);
        methods.subloop_register_instance_method(QUERY_AUGMENTER, INITIALIZE, QUERY_AUGMENTER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INTERPRETATIONS, QUERY_AUGMENTER, $list_alt11, $list_alt81, $list_alt82);
        methods.subloop_register_instance_method(QUERY_AUGMENTER, INTERPRETATIONS, QUERY_AUGMENTER_INTERPRETATIONS_METHOD);
        methods.methods_incorporate_instance_method(FOLLOWUPS, QUERY_AUGMENTER, $list_alt11, $list_alt91, $list_alt92);
        methods.subloop_register_instance_method(QUERY_AUGMENTER, FOLLOWUPS, QUERY_AUGMENTER_FOLLOWUPS_METHOD);
        methods.methods_incorporate_instance_method(SEARCH_STRING, QUERY_AUGMENTER, $list_alt11, $list_alt91, $list_alt100);
        methods.subloop_register_instance_method(QUERY_AUGMENTER, SEARCH_STRING, QUERY_AUGMENTER_SEARCH_STRING_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol NL_ANNOTATED_CYCL_TERM = makeSymbol("NL-ANNOTATED-CYCL-TERM");



    static private final SubLList $list_alt2 = list(list(makeSymbol("CYCL-TERM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PPH-INFO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYCL-TERM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPH-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYCL-TERM"), list(makeSymbol("NEW-VAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PPH-INFO"), list(makeSymbol("NEW-VAL")), makeKeyword("PUBLIC")));

    private static final SubLSymbol PPH_INFO = makeSymbol("PPH-INFO");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NL_ANNOTATED_CYCL_TERM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NL-ANNOTATED-CYCL-TERM-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NL_ANNOTATED_CYCL_TERM_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NL-ANNOTATED-CYCL-TERM-INSTANCE");

    private static final SubLSymbol GET_CYCL_TERM = makeSymbol("GET-CYCL-TERM");

    static private final SubLList $list_alt11 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt12 = list(list(RET, makeSymbol("CYCL-TERM")));

    static private final SubLSymbol $sym13$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NL-ANNOTATED-CYCL-TERM-METHOD");

    private static final SubLSymbol NL_ANNOTATED_CYCL_TERM_GET_CYCL_TERM_METHOD = makeSymbol("NL-ANNOTATED-CYCL-TERM-GET-CYCL-TERM-METHOD");

    private static final SubLSymbol GET_PPH_INFO = makeSymbol("GET-PPH-INFO");

    static private final SubLList $list_alt16 = list(list(RET, makeSymbol("PPH-INFO")));

    static private final SubLSymbol $sym17$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NL-ANNOTATED-CYCL-TERM-METHOD");

    private static final SubLSymbol NL_ANNOTATED_CYCL_TERM_GET_PPH_INFO_METHOD = makeSymbol("NL-ANNOTATED-CYCL-TERM-GET-PPH-INFO-METHOD");

    private static final SubLSymbol SET_CYCL_TERM = makeSymbol("SET-CYCL-TERM");

    static private final SubLList $list_alt20 = list(makeSymbol("NEW-VAL"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-VAL"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-TERM"), makeSymbol("NEW-VAL")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym22$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NL-ANNOTATED-CYCL-TERM-METHOD");



    private static final SubLSymbol NL_ANNOTATED_CYCL_TERM_SET_CYCL_TERM_METHOD = makeSymbol("NL-ANNOTATED-CYCL-TERM-SET-CYCL-TERM-METHOD");

    private static final SubLSymbol SET_PPH_INFO = makeSymbol("SET-PPH-INFO");

    static private final SubLList $list_alt26 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-VAL"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("PPH-INFO"), makeSymbol("NEW-VAL")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym27$OUTER_CATCH_FOR_NL_ANNOTATED_CYCL_TERM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NL-ANNOTATED-CYCL-TERM-METHOD");



    private static final SubLSymbol NL_ANNOTATED_CYCL_TERM_SET_PPH_INFO_METHOD = makeSymbol("NL-ANNOTATED-CYCL-TERM-SET-PPH-INFO-METHOD");

    private static final SubLSymbol QUA_FOLLOWUP_LIST = makeSymbol("QUA-FOLLOWUP-LIST");



    static private final SubLList $list_alt32 = list(makeSymbol("PROTECTED-MEMBERSHIP-TEMPLATE"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("ASK-STATUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ASK-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ASK-STATUS"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONCEPT-LIST"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol ASK_STATUS = makeSymbol("ASK-STATUS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUA_FOLLOWUP_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUA-FOLLOWUP-LIST-CLASS");

    private static final SubLSymbol BASIC_COLLECTION = makeSymbol("BASIC-COLLECTION");





    private static final SubLSymbol END_POINTER = makeSymbol("END-POINTER");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUA_FOLLOWUP_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUA-FOLLOWUP-LIST-INSTANCE");

    private static final SubLSymbol GET_ASK_STATUS = makeSymbol("GET-ASK-STATUS");

    static private final SubLList $list_alt42 = list(list(RET, makeSymbol("ASK-STATUS")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUA-FOLLOWUP-LIST-METHOD");

    private static final SubLSymbol QUA_FOLLOWUP_LIST_GET_ASK_STATUS_METHOD = makeSymbol("QUA-FOLLOWUP-LIST-GET-ASK-STATUS-METHOD");

    private static final SubLSymbol SET_ASK_STATUS = makeSymbol("SET-ASK-STATUS");

    static private final SubLList $list_alt46 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-VALUE"), makeSymbol("SYMBOLP")), list(makeSymbol("CSETQ"), makeSymbol("ASK-STATUS"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_QUA_FOLLOWUP_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUA-FOLLOWUP-LIST-METHOD");



    private static final SubLSymbol QUA_FOLLOWUP_LIST_SET_ASK_STATUS_METHOD = makeSymbol("QUA-FOLLOWUP-LIST-SET-ASK-STATUS-METHOD");

    private static final SubLSymbol GET_CONCEPT_LIST = makeSymbol("GET-CONCEPT-LIST");

    static private final SubLList $list_alt52 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR")))), list(makeSymbol("ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), makeSymbol("CONCEPTS")), list(makeSymbol("WHILE"), makeSymbol("ELEMENT"), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT"), list(QUOTE, makeSymbol("GET-CYCL-TERM"))), makeSymbol("CONCEPTS")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(RET, makeSymbol("CONCEPTS"))));







    private static final SubLSymbol QUA_FOLLOWUP_LIST_GET_CONCEPT_LIST_METHOD = makeSymbol("QUA-FOLLOWUP-LIST-GET-CONCEPT-LIST-METHOD");

    private static final SubLSymbol QUA_INTERPRETATION_LIST = makeSymbol("QUA-INTERPRETATION-LIST");

    static private final SubLList $list_alt58 = list(list(makeSymbol("ASK-STATUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ASK-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ASK-STATUS"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUA_INTERPRETATION_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUA-INTERPRETATION-LIST-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUA_INTERPRETATION_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUA-INTERPRETATION-LIST-INSTANCE");

    static private final SubLSymbol $sym61$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUA-INTERPRETATION-LIST-METHOD");

    private static final SubLSymbol QUA_INTERPRETATION_LIST_GET_ASK_STATUS_METHOD = makeSymbol("QUA-INTERPRETATION-LIST-GET-ASK-STATUS-METHOD");

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_QUA_INTERPRETATION_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUA-INTERPRETATION-LIST-METHOD");

    private static final SubLSymbol QUA_INTERPRETATION_LIST_SET_ASK_STATUS_METHOD = makeSymbol("QUA-INTERPRETATION-LIST-SET-ASK-STATUS-METHOD");

    private static final SubLSymbol QUERY_AUGMENTER = makeSymbol("QUERY-AUGMENTER");

    static private final SubLList $list_alt66 = list(list(makeSymbol("FOLLOWUP-ELEMENT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FOLLOWUP-CONTAINER-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTERPRETATION-ELEMENT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTERPRETATION-CONTAINER-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEARCH-STRING-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH-STRING"), list(makeSymbol("CYCL-TERM"), makeSymbol("ID"), makeSymbol("TIMEOUT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERPRETATIONS"), list(makeSymbol("NL-PHRASE"), makeSymbol("ID"), makeSymbol("TIMEOUT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FOLLOWUPS"), list(makeSymbol("CYCL-TERM"), makeSymbol("ID"), makeSymbol("TIMEOUT")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SEARCH_STRING_FUNCTION = makeSymbol("SEARCH-STRING-FUNCTION");

    private static final SubLSymbol INTERPRETATION_CONTAINER_TYPE = makeSymbol("INTERPRETATION-CONTAINER-TYPE");

    private static final SubLSymbol INTERPRETATION_ELEMENT_TYPE = makeSymbol("INTERPRETATION-ELEMENT-TYPE");

    private static final SubLSymbol FOLLOWUP_CONTAINER_TYPE = makeSymbol("FOLLOWUP-CONTAINER-TYPE");

    private static final SubLSymbol FOLLOWUP_ELEMENT_TYPE = makeSymbol("FOLLOWUP-ELEMENT-TYPE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUERY_AUGMENTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-AUGMENTER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUERY_AUGMENTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-AUGMENTER-INSTANCE");



    static private final SubLList $list_alt75 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt76 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FOLLOWUP-ELEMENT-TYPE"), list(QUOTE, makeSymbol("NL-ANNOTATED-CYCL-TERM"))), list(makeSymbol("CSETQ"), makeSymbol("FOLLOWUP-CONTAINER-TYPE"), list(QUOTE, makeSymbol("QUA-FOLLOWUP-LIST"))), list(makeSymbol("CSETQ"), makeSymbol("INTERPRETATION-ELEMENT-TYPE"), list(QUOTE, makeSymbol("NL-ANNOTATED-CYCL-TERM"))), list(makeSymbol("CSETQ"), makeSymbol("INTERPRETATION-CONTAINER-TYPE"), list(QUOTE, makeSymbol("QUA-INTERPRETATION-LIST"))), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-STRING-FUNCTION"), list(makeSymbol("FUNCTION"), makeSymbol("QUA-SEARCH-STRING-FUNCTION"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-AUGMENTER-METHOD");

    private static final SubLSymbol QUA_SEARCH_STRING_FUNCTION = makeSymbol("QUA-SEARCH-STRING-FUNCTION");

    private static final SubLSymbol QUERY_AUGMENTER_INITIALIZE_METHOD = makeSymbol("QUERY-AUGMENTER-INITIALIZE-METHOD");

    private static final SubLSymbol INTERPRETATIONS = makeSymbol("INTERPRETATIONS");

    static private final SubLList $list_alt81 = list(makeSymbol("NL-PHRASE"), makeSymbol("ID"), makeSymbol("TIMEOUT"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("IGNORE"), makeSymbol("ID")), list(makeSymbol("CLET"), list(makeSymbol("INTERPRETATION-LIST"), makeSymbol("PARSING-TIMED-OUT?")), list(makeSymbol("WITHOUT-WFF-SEMANTICS"), list(makeSymbol("WITH-PARSING-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("PARSING-TIMED-OUT?")), list(makeSymbol("CLET"), list(list(makeSymbol("STATUS"), makeKeyword("EXHAUST")), list(makeSymbol("*NPP-USE-NL-TAGS?*"), NIL), list(makeSymbol("*ABNORMALITY-CHECKING-ENABLED*"), NIL), list(makeSymbol("*EXCLUDE-VULGARITIES?*"), T), list(makeSymbol("RELATED-CONCEPTS"), list(makeSymbol("PS-GET-CYCLS-FOR-PHRASE"), makeSymbol("NL-PHRASE"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell(makeString("Noun"))))))), list(makeSymbol("PWHEN"), makeSymbol("PARSING-TIMED-OUT?"), list(makeSymbol("CSETQ"), makeSymbol("STATUS"), $TIME)), list(makeSymbol("CSETQ"), makeSymbol("INTERPRETATION-LIST"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("INTERPRETATION-CONTAINER-TYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("CONCEPT-PHRASE-PAIRS"), list(makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), makeSymbol("RELATED-CONCEPTS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PAIR"), makeSymbol("CONCEPT-PHRASE-PAIRS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("CONCEPT"), makeSymbol("PHRASE")), makeSymbol("PAIR"), list(makeSymbol("PWHEN"), makeSymbol("PHRASE"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("FOLLOWUP-ELEMENT-TYPE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERPRETATION-LIST"), list(QUOTE, makeSymbol("SET-ASK-STATUS")), makeSymbol("STATUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW"), list(QUOTE, makeSymbol("SET-CYCL-TERM")), list(makeSymbol("NART-SUBSTITUTE"), makeSymbol("CONCEPT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW"), list(QUOTE, makeSymbol("SET-PPH-INFO")), makeSymbol("PHRASE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERPRETATION-LIST"), list(QUOTE, makeSymbol("ADD")), makeSymbol("NEW")))))))))), list(RET, makeSymbol("INTERPRETATION-LIST"))));

    static private final SubLSymbol $sym83$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-AUGMENTER-METHOD");



    static private final SubLList $list_alt85 = list(constant_handles.reader_make_constant_shell(makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell(makeString("Noun")));



    static private final SubLList $list_alt87 = list(makeSymbol("CONCEPT"), makeSymbol("PHRASE"));



    private static final SubLSymbol QUERY_AUGMENTER_INTERPRETATIONS_METHOD = makeSymbol("QUERY-AUGMENTER-INTERPRETATIONS-METHOD");

    private static final SubLSymbol FOLLOWUPS = makeSymbol("FOLLOWUPS");

    static private final SubLList $list_alt91 = list(makeSymbol("CYCL-TERM"), makeSymbol("ID"), makeSymbol("TIMEOUT"));

    static private final SubLList $list_alt92 = list(list(makeSymbol("IGNORE"), makeSymbol("ID")), list(makeSymbol("CHECK-TYPE"), makeSymbol("CYCL-TERM"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list(makeSymbol("CLET"), list(makeSymbol("FOLLOWUP-CONCEPTS-LIST")), list(makeSymbol("WITHOUT-WFF-SEMANTICS"), list(makeSymbol("CLET"), list(list(makeSymbol("*ABNORMALITY-CHECKING-ENABLED*"), NIL)), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("RELATED-CONCEPTS"), makeSymbol("STATUS")), list(makeSymbol("ASK-TEMPLATE"), list(QUOTE, makeSymbol("?X")), list(makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(makeString("qaFollowupConcepts")), makeSymbol("CYCL-TERM"), list(QUOTE, list(makeSymbol("?STR"), makeSymbol("?X")))), constant_handles.reader_make_constant_shell(makeString("WebSearchEnhancementMt")), TWO_INTEGER, NIL, makeSymbol("TIMEOUT")), list(makeSymbol("CSETQ"), makeSymbol("FOLLOWUP-CONCEPTS-LIST"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("FOLLOWUP-CONTAINER-TYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("TERM-PHRASE-PAIRS"), list(makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), makeSymbol("RELATED-CONCEPTS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PAIR"), makeSymbol("TERM-PHRASE-PAIRS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("CONCEPT"), makeSymbol("PHRASE")), makeSymbol("PAIR"), list(makeSymbol("PWHEN"), makeSymbol("PHRASE"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("FOLLOWUP-ELEMENT-TYPE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("FOLLOWUP-CONCEPTS-LIST"), list(QUOTE, makeSymbol("SET-ASK-STATUS")), makeSymbol("STATUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW"), list(QUOTE, makeSymbol("SET-CYCL-TERM")), list(makeSymbol("NART-SUBSTITUTE"), makeSymbol("CONCEPT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW"), list(QUOTE, makeSymbol("SET-PPH-INFO")), makeSymbol("PHRASE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("FOLLOWUP-CONCEPTS-LIST"), list(QUOTE, makeSymbol("ADD")), makeSymbol("NEW")))))))))), list(RET, makeSymbol("FOLLOWUP-CONCEPTS-LIST"))));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-AUGMENTER-METHOD");

    static private final SubLSymbol $sym94$_X = makeSymbol("?X");

    public static final SubLObject $$qaFollowupConcepts = constant_handles.reader_make_constant_shell(makeString("qaFollowupConcepts"));

    static private final SubLList $list_alt96 = list(makeSymbol("?STR"), makeSymbol("?X"));

    public static final SubLObject $$WebSearchEnhancementMt = constant_handles.reader_make_constant_shell(makeString("WebSearchEnhancementMt"));

    private static final SubLSymbol QUERY_AUGMENTER_FOLLOWUPS_METHOD = makeSymbol("QUERY-AUGMENTER-FOLLOWUPS-METHOD");



    static private final SubLList $list_alt100 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("CYCL-TERM"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list(RET, list(makeSymbol("FUNCALL"), makeSymbol("SEARCH-STRING-FUNCTION"), makeSymbol("CYCL-TERM"), makeSymbol("ID"), makeSymbol("TIMEOUT"))));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_QUERY_AUGMENTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-AUGMENTER-METHOD");

    private static final SubLSymbol QUERY_AUGMENTER_SEARCH_STRING_METHOD = makeSymbol("QUERY-AUGMENTER-SEARCH-STRING-METHOD");

    static private final SubLString $str_alt103$THIS_IS_A_STUB__SHOULD_BE_OVERRID = makeString("THIS IS A STUB: SHOULD BE OVERRIDEN BY SUBCLASS!");

    // // Initializers
    public void declareFunctions() {
        declare_query_augmenter_subloop_utils_file();
    }

    public void initializeVariables() {
        init_query_augmenter_subloop_utils_file();
    }

    public void runTopLevelForms() {
        setup_query_augmenter_subloop_utils_file();
    }
}

