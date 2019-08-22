/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.ranges;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-POSTING
 *  source file: /cyc/top/cycl/cyblack/cyblack-posting.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_posting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_posting() {
    }

    public static final SubLFile me = new cyblack_posting();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_posting";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-POSTING-SUPPORT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_posting_support_types$ = makeSymbol("*VALID-CYBLACK-POSTING-SUPPORT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-POSTING-SUPPORT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_posting_support_types() {
        return $valid_cyblack_posting_support_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-POSTING-SUPPORT-TYPE enumeration.
     */
    public static final SubLObject cyblack_posting_support_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_posting_support_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-POSTING-SUPPORT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_posting_support_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_posting_support_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_POSTING_SUPPORT_TYPE, value, CYBLACK_POSTING_SUPPORT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-POSTING-SUPPORT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_posting_support_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_posting_support_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_POSTING_SUPPORT_TYPE, value, CYBLACK_POSTING_SUPPORT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-POSTING-SUPPORT-TYPE enumeration.
     */
    public static final SubLObject cyblack_posting_support_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_support_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_POSTING_SUPPORT_TYPE_P, value1, CYBLACK_POSTING_SUPPORT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_support_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_POSTING_SUPPORT_TYPE_P, value2, CYBLACK_POSTING_SUPPORT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_posting_support_types$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else
                        if (value == value2) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the CYBLACK-POSTING-SUPPORT-TYPE enumeration.
     */
    public static final SubLObject cyblack_posting_support_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_support_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_POSTING_SUPPORT_TYPE_P, value1, CYBLACK_POSTING_SUPPORT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_support_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_POSTING_SUPPORT_TYPE_P, value2, CYBLACK_POSTING_SUPPORT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_posting_support_types$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else
                        if (value == value1) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_posting_p(SubLObject v_cyblack_posting) {
        return interfaces.subloop_instanceof_interface(v_cyblack_posting, CYBLACK_POSTING);
    }

    public static final SubLObject get_cyblack_virtual_posting_actual_posting(SubLObject cyblack_virtual_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_virtual_posting, TEN_INTEGER, ACTUAL_POSTING);
    }

    public static final SubLObject set_cyblack_virtual_posting_actual_posting(SubLObject cyblack_virtual_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_virtual_posting, value, TEN_INTEGER, ACTUAL_POSTING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_virtual_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_virtual_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_VIRTUAL_POSTING, ACTUAL_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_virtual_posting_p(SubLObject cyblack_virtual_posting) {
        return classes.subloop_instanceof_class(cyblack_virtual_posting, CYBLACK_VIRTUAL_POSTING);
    }

    // defconstant
    private static final SubLSymbol $cyblack_virtual_posting_error_msg$ = makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*");

    public static final SubLObject cyblack_virtual_posting_internalize_external_representation_method(SubLObject self, SubLObject external_representation) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym41$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_internalize_external_representation(actual_posting, external_representation));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_internalize_content_method(SubLObject self, SubLObject content) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym47$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_internalize_content(actual_posting, content));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_internalize_attributes_method(SubLObject self, SubLObject attributes) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_internalize_attributes(actual_posting, attributes));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_externalize_internal_representation_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym56$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_externalize_internal_representation(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_externalize_content_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_externalize_content(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_externalize_attributes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym64$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_externalize_attributes(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_datatype_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym73$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_datatype(actual_posting, new_datatype));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_panel_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_panel(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_panel_method(SubLObject self, SubLObject new_panel) {
        return NIL;
    }

    public static final SubLObject cyblack_virtual_posting_get_support_type_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_support_type(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_support_type_method(SubLObject self, SubLObject new_support_type) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_support_type(actual_posting, new_support_type));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_activation_pattern(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_activation_pattern_method(SubLObject self, SubLObject activation_pattern) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_activation_pattern(actual_posting, activation_pattern));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_ksi_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_ksi(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_ksi_method(SubLObject self, SubLObject new_ksi) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym104$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_ksi(actual_posting, new_ksi));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym104$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_ks_method(SubLObject self) {
        {
            SubLObject ksi = cyblack_virtual_posting_get_ksi_method(self);
            if (NIL != ksi) {
                return cyblack_ksi.cyblack_ksi_get_knowledge_source(ksi);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_virtual_posting_get_confidence_method(SubLObject self) {
        {
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            return cyblack_posting_dispatch_functions.cyblack_posting_get_confidence(actual_posting);
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_confidence_method(SubLObject self, SubLObject new_confidence) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_confidence(actual_posting, new_confidence));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_recompute_confidence_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym119$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_recompute_confidence(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_invalidate_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym123$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_invalidate(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_valid_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym127$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_valid_p(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_active_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym131$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_active_p(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_active_method(SubLObject self, SubLObject new_active_state) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym136$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_active(actual_posting, new_active_state));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_immutable_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym140$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_immutable_p(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_set_immutable_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym145$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_set_immutable(actual_posting, new_state));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_on_post_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym149$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_on_post(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject cyblack_virtual_posting_after_stimulation_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_posting_method = NIL;
            SubLObject actual_posting = get_cyblack_virtual_posting_actual_posting(self);
            try {
                try {
                    sublisp_throw($sym153$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD, cyblack_posting_dispatch_functions.cyblack_posting_after_stimulation(actual_posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_posting_actual_posting(self, actual_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_posting_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_virtual_posting_method;
        }
    }

    public static final SubLObject get_cyblack_serialized_posting_index(SubLObject cyblack_serialized_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_serialized_posting, FIVE_INTEGER, INDEX);
    }

    public static final SubLObject set_cyblack_serialized_posting_index(SubLObject cyblack_serialized_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_serialized_posting, value, FIVE_INTEGER, INDEX);
    }

    public static final SubLObject get_cyblack_serialized_posting_datastore(SubLObject cyblack_serialized_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_serialized_posting, FOUR_INTEGER, DATASTORE);
    }

    public static final SubLObject set_cyblack_serialized_posting_datastore(SubLObject cyblack_serialized_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_serialized_posting, value, FOUR_INTEGER, DATASTORE);
    }

    public static final SubLObject get_cyblack_serialized_posting_datatype(SubLObject cyblack_serialized_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_serialized_posting, THREE_INTEGER, DATATYPE);
    }

    public static final SubLObject set_cyblack_serialized_posting_datatype(SubLObject cyblack_serialized_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_serialized_posting, value, THREE_INTEGER, DATATYPE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_serialized_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_serialized_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SERIALIZED_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SERIALIZED_POSTING, DATASTORE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SERIALIZED_POSTING, INDEX, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_p(SubLObject cyblack_serialized_posting) {
        return classes.subloop_instanceof_class(cyblack_serialized_posting, CYBLACK_SERIALIZED_POSTING);
    }

    public static final SubLObject cyblack_serialized_posting_internalize_external_representation_method(SubLObject self, SubLObject external_representation) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_internalize_content_method(SubLObject self, SubLObject content) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_internalize_attributes_method(SubLObject self, SubLObject attributes) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_externalize_internal_representation_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_externalize_content_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_externalize_attributes_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_get_datatype_method(SubLObject self) {
        {
            SubLObject datatype = get_cyblack_serialized_posting_datatype(self);
            return datatype;
        }
    }

    public static final SubLObject cyblack_serialized_posting_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            SubLObject catch_var_for_cyblack_serialized_posting_method = NIL;
            SubLObject datatype = get_cyblack_serialized_posting_datatype(self);
            try {
                try {
                    datatype = new_datatype;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_serialized_posting_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_serialized_posting_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_CYBLACK_SERIALIZED_POSTING_METHOD);
            }
            return catch_var_for_cyblack_serialized_posting_method;
        }
    }

    public static final SubLObject cyblack_serialized_posting_get_panel_method(SubLObject self) {
        {
            SubLObject datatype = get_cyblack_serialized_posting_datatype(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            if ((NIL != datatype) && (NIL != application)) {
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    return cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_serialized_posting_set_panel_method(SubLObject self, SubLObject new_panel) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_get_support_type_method(SubLObject self) {
        return $SERIALIZED;
    }

    public static final SubLObject cyblack_serialized_posting_set_support_type_method(SubLObject self, SubLObject new_support_type) {
        if (new_support_type != $SERIALIZED) {
            Errors.warn($str_alt185$_SET_SUPPORT_TYPE__S___The_suppor, self);
        }
        return $SERIALIZED;
    }

    public static final SubLObject cyblack_serialized_posting_get_activation_pattern_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_set_activation_pattern_method(SubLObject self, SubLObject activation_pattern) {
        Errors.warn($str_alt189$_SET_ACTIVATION_PATTERN__S___The_, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_get_ksi_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_set_ksi_method(SubLObject self, SubLObject new_ksi) {
        Errors.warn($str_alt193$_SET_KSI__S___The_knowledge_sourc, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_get_ks_method(SubLObject self) {
        {
            SubLObject ksi = cyblack_serialized_posting_get_ksi_method(self);
            if (NIL != ksi) {
                cyblack_ksi.cyblack_ksi_get_knowledge_source(ksi);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_serialized_posting_get_confidence_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_set_confidence_method(SubLObject self, SubLObject new_confidence) {
        Errors.warn($str_alt199$_SET_CONFIDENCE__S___The_confiden, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_recompute_confidence_method(SubLObject self) {
        return cyblack_serialized_posting_get_confidence_method(self);
    }

    public static final SubLObject cyblack_serialized_posting_invalidate_method(SubLObject self) {
        Errors.warn($str_alt204$_INVALIDATE__S___Serialized_posti, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_valid_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject cyblack_serialized_posting_active_p_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_set_active_method(SubLObject self, SubLObject new_active_state) {
        Errors.warn($str_alt210$_SET_ACTIVE__S___The_active_state, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_immutable_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject cyblack_serialized_posting_set_immutable_method(SubLObject self, SubLObject new_state) {
        Errors.warn($str_alt214$_SET_IMMUTABLE__S___The_immutable, self);
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_on_post_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_serialized_posting_after_stimulation_method(SubLObject self) {
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cyblack_basic_posting_id_counter_lock$ = makeSymbol("*CYBLACK-BASIC-POSTING-ID-COUNTER-LOCK*");

    // defvar
    public static final SubLSymbol $cyblack_basic_posting_id_counter$ = makeSymbol("*CYBLACK-BASIC-POSTING-ID-COUNTER*");

    public static final SubLObject cyblack_basic_posting_allocate_posting_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $cyblack_basic_posting_id_counter_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $cyblack_basic_posting_id_counter$.setDynamicValue(add($cyblack_basic_posting_id_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return $cyblack_basic_posting_id_counter$.getDynamicValue(thread);
        }
    }

    public static final SubLObject cyblack_basic_posting_reset_posting_id_allocator() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $cyblack_basic_posting_id_counter_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $cyblack_basic_posting_id_counter$.setDynamicValue(MINUS_ONE_INTEGER, thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return $cyblack_basic_posting_id_counter$.getDynamicValue(thread);
        }
    }

    public static final SubLObject get_cyblack_basic_posting_attribute_dictionary(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, NINETEEN_INTEGER, ATTRIBUTE_DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_posting_attribute_dictionary(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, NINETEEN_INTEGER, ATTRIBUTE_DICTIONARY);
    }

    public static final SubLObject get_cyblack_basic_posting_internal_pid(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_instance_slot(cyblack_basic_posting, EIGHTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_posting_internal_pid(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_posting, value, EIGHTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_posting_active(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_instance_slot(cyblack_basic_posting, SEVENTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_posting_active(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_posting, value, SEVENTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_posting_is_valid(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, SIXTEEN_INTEGER, IS_VALID);
    }

    public static final SubLObject set_cyblack_basic_posting_is_valid(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, SIXTEEN_INTEGER, IS_VALID);
    }

    public static final SubLObject get_cyblack_basic_posting_confidence(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, FIFTEEN_INTEGER, CONFIDENCE);
    }

    public static final SubLObject set_cyblack_basic_posting_confidence(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, FIFTEEN_INTEGER, CONFIDENCE);
    }

    public static final SubLObject get_cyblack_basic_posting_ksi(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, FOURTEEN_INTEGER, KSI);
    }

    public static final SubLObject set_cyblack_basic_posting_ksi(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, FOURTEEN_INTEGER, KSI);
    }

    public static final SubLObject get_cyblack_basic_posting_activation_pattern(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, THIRTEEN_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject set_cyblack_basic_posting_activation_pattern(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, THIRTEEN_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject get_cyblack_basic_posting_support_type(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, TWELVE_INTEGER, SUPPORT_TYPE);
    }

    public static final SubLObject set_cyblack_basic_posting_support_type(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, TWELVE_INTEGER, SUPPORT_TYPE);
    }

    public static final SubLObject get_cyblack_basic_posting_datatype(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, ELEVEN_INTEGER, DATATYPE);
    }

    public static final SubLObject set_cyblack_basic_posting_datatype(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, ELEVEN_INTEGER, DATATYPE);
    }

    public static final SubLObject get_cyblack_basic_posting_panel(SubLObject cyblack_basic_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting, TEN_INTEGER, PANEL);
    }

    public static final SubLObject set_cyblack_basic_posting_panel(SubLObject cyblack_basic_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting, value, TEN_INTEGER, PANEL);
    }

    public static final SubLObject get_cyblack_basic_posting_stringify_guids(SubLObject cyblack_basic_posting) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_posting);
            SubLObject slot = slots.slot_assoc(STRINGIFY_GUIDS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_posting, slot);
        }
        return classes.ldb_test($int$4099, subloop_structures.instance_boolean_slots(cyblack_basic_posting));
    }

    public static final SubLObject set_cyblack_basic_posting_stringify_guids(SubLObject cyblack_basic_posting, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_posting);
            SubLObject slot = slots.slot_assoc(STRINGIFY_GUIDS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_posting, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_posting, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4099, subloop_structures.instance_boolean_slots(cyblack_basic_posting)));
        return value;
    }

    public static final SubLObject get_cyblack_basic_posting_immutable(SubLObject cyblack_basic_posting) {
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_basic_posting));
    }

    public static final SubLObject set_cyblack_basic_posting_immutable(SubLObject cyblack_basic_posting, SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_posting, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_basic_posting)));
        return value;
    }

    public static final SubLObject cyblack_basic_posting_get_attributes_as_plist_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_results = NIL;
                SubLObject template_dictionary = cyblack_basic_posting_get_dictionary_method(self);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(template_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject template_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject template_value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        template_results = cons(template_key, template_results);
                        template_results = cons(template_value, template_results);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return nreverse(template_results);
            }
        }
    }

    public static final SubLObject cyblack_basic_posting_set_attributes_from_plist_method(SubLObject self, SubLObject attribute_plist) {
        {
            SubLObject remainder = NIL;
            for (remainder = attribute_plist; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject attribute = remainder.first();
                    SubLObject value = cadr(remainder);
                    cyblack_basic_posting_set_attribute_value_method(self, attribute, value);
                }
            }
            return attribute_plist;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_attribute_value_method(SubLObject self, SubLObject attribute, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_attributes.posting_attribute_p(attribute)) {
                    Errors.error($str_alt242$_GET_ATTRIBUTE_VALUE__S____S_is_n, self, attribute);
                }
            }
            {
                SubLObject template_dictionary = cyblack_basic_posting_get_dictionary_method(self);
                if (NIL != template_dictionary) {
                    return dictionary.dictionary_lookup(template_dictionary, attribute, v_default);
                } else {
                    return v_default;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_posting_set_attribute_value_method(SubLObject self, SubLObject attribute, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_attributes.posting_attribute_p(attribute)) {
                    Errors.error($str_alt247$_SET_ATTRIBUTE_VALUE__S____S_is_n, self, attribute);
                }
            }
            {
                SubLObject template_type_object = enumerations.enumerations_retrieve_enumeration(attribute);
                if (NIL != template_type_object) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == enumerations.enumeration_member_p(attribute, value)) {
                            Errors.error($str_alt248$_SET_ATTRIBUTE_VALUE__S____S_is_n, self, value, attribute);
                        }
                    }
                } else {
                    template_type_object = ranges.ranges_retrieve_range(attribute);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == ranges.range_member_p(attribute, value)) {
                            Errors.error($str_alt249$_SET_ATTRIBUTE_VALUE__S____S_is_n, self, value, attribute);
                        }
                    }
                }
            }
            {
                SubLObject template_dictionary = cyblack_basic_posting_get_dictionary_method(self);
                if (NIL == template_dictionary) {
                    template_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    cyblack_basic_posting_set_dictionary_method(self, template_dictionary);
                }
                dictionary.dictionary_enter(template_dictionary, attribute, value);
                return value;
            }
        }
    }

    public static final SubLObject cyblack_basic_posting_add_attribute_method(SubLObject self, SubLObject new_attribute) {
        if (new_attribute == UNPROVIDED) {
            new_attribute = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == new_attribute) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_attributes.posting_attribute_p(new_attribute)) {
                    Errors.error($str_alt254$_ADD_ATTRIBUTE__S____S_is_not_a_v, self, new_attribute);
                }
            }
            {
                SubLObject template_dictionary = cyblack_basic_posting_get_dictionary_method(self);
                if (NIL == template_dictionary) {
                    template_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    cyblack_basic_posting_set_dictionary_method(self, template_dictionary);
                }
                dictionary.dictionary_enter(template_dictionary, new_attribute, NIL);
                return new_attribute;
            }
        }
    }

    public static final SubLObject cyblack_basic_posting_get_attributes_method(SubLObject self) {
        {
            SubLObject template_dictionary = cyblack_basic_posting_get_dictionary_method(self);
            if (NIL != template_dictionary) {
                return dictionary.dictionary_keys(template_dictionary);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_p(SubLObject cyblack_basic_posting) {
        return classes.subloop_instanceof_class(cyblack_basic_posting, CYBLACK_BASIC_POSTING);
    }

    public static final SubLObject get_cyblack_external_posting_external_posting(SubLObject cyblack_external_posting) {
        return classes.subloop_get_instance_slot(cyblack_external_posting, TWENTY_INTEGER);
    }

    public static final SubLObject set_cyblack_external_posting_external_posting(SubLObject cyblack_external_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_external_posting, value, TWENTY_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_POSTING, EXTERNAL_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_posting_p(SubLObject cyblack_external_posting) {
        return classes.subloop_instanceof_class(cyblack_external_posting, CYBLACK_EXTERNAL_POSTING);
    }

    public static final SubLObject cyblack_basic_posting_initialize_method(SubLObject self) {
        {
            SubLObject internal_pid = get_cyblack_basic_posting_internal_pid(self);
            SubLObject active = get_cyblack_basic_posting_active(self);
            SubLObject is_valid = get_cyblack_basic_posting_is_valid(self);
            SubLObject confidence = get_cyblack_basic_posting_confidence(self);
            SubLObject ksi = get_cyblack_basic_posting_ksi(self);
            SubLObject activation_pattern = get_cyblack_basic_posting_activation_pattern(self);
            SubLObject support_type = get_cyblack_basic_posting_support_type(self);
            SubLObject datatype = get_cyblack_basic_posting_datatype(self);
            SubLObject panel = get_cyblack_basic_posting_panel(self);
            SubLObject stringify_guids = get_cyblack_basic_posting_stringify_guids(self);
            SubLObject immutable = get_cyblack_basic_posting_immutable(self);
            cyblack_support.cyblack_basic_support_dependent_initialize_method(self);
            panel = NIL;
            set_cyblack_basic_posting_panel(self, panel);
            datatype = NIL;
            set_cyblack_basic_posting_datatype(self, datatype);
            support_type = $NONE;
            set_cyblack_basic_posting_support_type(self, support_type);
            activation_pattern = NIL;
            set_cyblack_basic_posting_activation_pattern(self, activation_pattern);
            ksi = NIL;
            set_cyblack_basic_posting_ksi(self, ksi);
            confidence = NIL;
            set_cyblack_basic_posting_confidence(self, confidence);
            is_valid = T;
            set_cyblack_basic_posting_is_valid(self, is_valid);
            active = T;
            set_cyblack_basic_posting_active(self, active);
            immutable = NIL;
            set_cyblack_basic_posting_immutable(self, immutable);
            internal_pid = cyblack_basic_posting_allocate_posting_id();
            set_cyblack_basic_posting_internal_pid(self, internal_pid);
            stringify_guids = NIL;
            set_cyblack_basic_posting_stringify_guids(self, stringify_guids);
            cyblack_basic_posting_initialize_qua_posting_attributes_method(self);
            cyblack_application.cyblack_register_posting(self);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject datatype = get_cyblack_basic_posting_datatype(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    format(stream, $str_alt278$__POSTING_OF_DATATYPE__S__S_, datatype, instance_number);
                    sublisp_throw($sym277$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_datatype(self, datatype);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym277$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_plistify_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject stringify_guids = get_cyblack_basic_posting_stringify_guids(self);
            try {
                try {
                    {
                        SubLObject listed_slots = NIL;
                        SubLObject keyword_package = symbol_package($TEST);
                        SubLObject v_class = subloop_structures.instance_class(self);
                        if (NIL != stringify_guids) {
                            {
                                SubLObject v_class_1 = v_class;
                                SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_1);
                                SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_1);
                                SubLObject slot_value = NIL;
                                {
                                    SubLObject slot_name = NIL;
                                    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
                                    SubLObject slot = NIL;
                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                        if (NIL != slots.slot_essential(slot)) {
                                            slot_name = slots.slot_name(slot);
                                            listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                                            slot_value = instances.get_slot(self, slot_name);
                                            if (NIL != Guids.guid_p(slot_value)) {
                                                slot_value = Guids.guid_to_string(slot_value);
                                            }
                                            listed_slots = cons(slot_value, listed_slots);
                                        }
                                    }
                                }
                                {
                                    SubLObject slot_name = NIL;
                                    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
                                    SubLObject slot = NIL;
                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                        if (NIL != slots.slot_essential(slot)) {
                                            slot_name = slots.slot_name(slot);
                                            listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                                            slot_value = instances.get_slot(self, slot_name);
                                            if (NIL != Guids.guid_p(slot_value)) {
                                                slot_value = Guids.guid_to_string(slot_value);
                                            }
                                            listed_slots = cons(slot_value, listed_slots);
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject v_class_2 = v_class;
                                SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_2);
                                SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_2);
                                {
                                    SubLObject slot_name = NIL;
                                    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
                                    SubLObject slot = NIL;
                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                        if (NIL != slots.slot_essential(slot)) {
                                            slot_name = slots.slot_name(slot);
                                            listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                                            listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                                        }
                                    }
                                }
                                {
                                    SubLObject slot_name = NIL;
                                    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
                                    SubLObject slot = NIL;
                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                        if (NIL != slots.slot_essential(slot)) {
                                            slot_name = slots.slot_name(slot);
                                            listed_slots = cons(intern(symbol_name(slot_name), keyword_package), listed_slots);
                                            listed_slots = cons(instances.get_slot(self, slot_name), listed_slots);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, nreverse(listed_slots));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_stringify_guids(self, stringify_guids);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_add_dependent_method(SubLObject self, SubLObject new_dependent) {
        {
            SubLObject result = NIL;
            result = cyblack_support.cyblack_basic_support_add_dependent_method(self, new_dependent);
            return result;
        }
    }

    public static final SubLObject cyblack_basic_posting_remove_dependent_method(SubLObject self, SubLObject old_dependent) {
        {
            SubLObject result = NIL;
            result = cyblack_support.cyblack_basic_support_remove_dependent_method(self, old_dependent);
            return result;
        }
    }

    public static final SubLObject cyblack_basic_posting_remove_all_dependents_method(SubLObject self) {
        {
            SubLObject result = NIL;
            result = cyblack_support.cyblack_basic_support_remove_all_dependents_method(self);
            return result;
        }
    }

    public static final SubLObject cyblack_basic_posting_add_support_notify_method(SubLObject self, SubLObject support) {
        cyblack_support.cyblack_basic_support_dependent_add_support_notify_method(self, support);
        cyblack_posting_dispatch_functions.cyblack_posting_recompute_confidence(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_remove_support_notify_method(SubLObject self, SubLObject support) {
        cyblack_support.cyblack_basic_support_dependent_remove_support_notify_method(self, support);
        cyblack_posting_dispatch_functions.cyblack_posting_recompute_confidence(self);
        if (NIL == cyblack_basic_posting_valid_p_method(self)) {
            {
                SubLObject all_dependents = cyblack_support.cyblack_basic_support_get_all_dependents_method(self);
                SubLObject cdolist_list_var = all_dependents;
                SubLObject dependent = NIL;
                for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                    cyblack_basic_posting_remove_dependent_method(self, dependent);
                }
            }
        }
        return support;
    }

    public static final SubLObject cyblack_basic_posting_remove_all_supports_method(SubLObject self) {
        {
            SubLObject result = NIL;
            result = cyblack_support.cyblack_basic_support_dependent_remove_all_supports_method(self);
            return result;
        }
    }

    public static final SubLObject cyblack_basic_posting_internalize_external_representation_method(SubLObject self, SubLObject external_representation) {
        {
            SubLObject content_representation = getf(external_representation, $CONTENT, UNPROVIDED);
            SubLObject attribute_representation = getf(external_representation, $ATTRIBUTES, UNPROVIDED);
            methods.funcall_instance_method_with_1_args(self, INTERNALIZE_CONTENT, content_representation);
            methods.funcall_instance_method_with_1_args(self, INTERNALIZE_ATTRIBUTES, attribute_representation);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_posting_internalize_content_method(SubLObject self, SubLObject content) {
        methods.funcall_instance_method_with_1_args(self, ASSIMILATE, content);
        return content;
    }

    public static final SubLObject cyblack_basic_posting_internalize_attributes_method(SubLObject self, SubLObject attributes) {
        cyblack_basic_posting_set_attributes_from_plist_method(self, attributes);
        return attributes;
    }

    public static final SubLObject cyblack_basic_posting_externalize_internal_representation_method(SubLObject self) {
        return list($CONTENT, methods.funcall_instance_method_with_0_args(self, EXTERNALIZE_CONTENT), $ATTRIBUTES, methods.funcall_instance_method_with_0_args(self, EXTERNALIZE_ATTRIBUTES));
    }

    public static final SubLObject cyblack_basic_posting_externalize_content_method(SubLObject self) {
        return cyblack_basic_posting_plistify_method(self);
    }

    public static final SubLObject cyblack_basic_posting_externalize_attributes_method(SubLObject self) {
        return cyblack_basic_posting_get_attributes_as_plist_method(self);
    }

    public static final SubLObject cyblack_basic_posting_get_datatype_method(SubLObject self) {
        {
            SubLObject datatype = get_cyblack_basic_posting_datatype(self);
            return datatype;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_panel_method(SubLObject self) {
        {
            SubLObject panel = get_cyblack_basic_posting_panel(self);
            return panel;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_panel_method(SubLObject self, SubLObject new_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject panel = get_cyblack_basic_posting_panel(self);
            try {
                try {
                    panel = new_panel;
                    sublisp_throw($sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, new_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_panel(self, panel);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_support_type_method(SubLObject self) {
        {
            SubLObject support_type = get_cyblack_basic_posting_support_type(self);
            return support_type;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_support_type_method(SubLObject self, SubLObject new_support_type) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject support_type = get_cyblack_basic_posting_support_type(self);
            try {
                try {
                    support_type = new_support_type;
                    sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, new_support_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_support_type(self, support_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject activation_pattern = get_cyblack_basic_posting_activation_pattern(self);
            return activation_pattern;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject activation_pattern = get_cyblack_basic_posting_activation_pattern(self);
            SubLObject support_type = get_cyblack_basic_posting_support_type(self);
            try {
                try {
                    if (NIL != new_activation_pattern) {
                        support_type = $ACTIVATION_PATTERN;
                    } else {
                        support_type = $NONE;
                    }
                    activation_pattern = new_activation_pattern;
                    cyblack_posting_dispatch_functions.cyblack_posting_recompute_confidence(self);
                    sublisp_throw($sym336$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, activation_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_activation_pattern(self, activation_pattern);
                            set_cyblack_basic_posting_support_type(self, support_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym336$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_ksi_method(SubLObject self) {
        {
            SubLObject ksi = get_cyblack_basic_posting_ksi(self);
            return ksi;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_ksi_method(SubLObject self, SubLObject new_ksi) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject ksi = get_cyblack_basic_posting_ksi(self);
            try {
                try {
                    ksi = new_ksi;
                    cyblack_posting_dispatch_functions.cyblack_posting_recompute_confidence(self);
                    sublisp_throw($sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, ksi);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_ksi(self, ksi);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_ks_method(SubLObject self) {
        {
            SubLObject ksi = get_cyblack_basic_posting_ksi(self);
            if (NIL != ksi) {
                return cyblack_ksi.cyblack_ksi_get_knowledge_source(ksi);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_confidence_method(SubLObject self) {
        {
            SubLObject confidence = get_cyblack_basic_posting_confidence(self);
            return confidence;
        }
    }

    public static final SubLObject cyblack_basic_posting_recompute_confidence_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject confidence = get_cyblack_basic_posting_confidence(self);
            try {
                try {
                    sublisp_throw($sym348$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, confidence);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_confidence(self, confidence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_invalidate_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject is_valid = get_cyblack_basic_posting_is_valid(self);
            try {
                try {
                    is_valid = NIL;
                    cyblack_basic_posting_remove_all_dependents_method(self);
                    sublisp_throw($sym351$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_is_valid(self, is_valid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym351$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_valid_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject is_valid = get_cyblack_basic_posting_is_valid(self);
            try {
                try {
                    sublisp_throw($sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, is_valid);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_is_valid(self, is_valid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_active_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject active = get_cyblack_basic_posting_active(self);
            try {
                try {
                    sublisp_throw($sym357$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, active);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_active(self, active);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym357$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_active_method(SubLObject self, SubLObject new_active_state) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject active = get_cyblack_basic_posting_active(self);
            try {
                try {
                    active = new_active_state;
                    {
                        SubLObject my_panel = cyblack_basic_posting_get_panel_method(self);
                        if (NIL != my_panel) {
                            if (NIL != new_active_state) {
                                cyblack_panel_dispatch_functions.cyblack_panel_activate_posting(my_panel, self);
                            } else {
                                cyblack_panel_dispatch_functions.cyblack_panel_deactivate_posting(my_panel, self);
                            }
                        }
                    }
                    sublisp_throw($sym360$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, new_active_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_active(self, active);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym360$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_immutable_p_method(SubLObject self) {
        {
            SubLObject immutable = get_cyblack_basic_posting_immutable(self);
            return immutable;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_immutable_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject immutable = get_cyblack_basic_posting_immutable(self);
            try {
                try {
                    immutable = (NIL != new_state) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym365$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, immutable);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_immutable(self, immutable);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_on_post_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_after_stimulation_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject datatype = get_cyblack_basic_posting_datatype(self);
            try {
                try {
                    datatype = new_datatype;
                    sublisp_throw($sym370$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, datatype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym370$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_confidence_method(SubLObject self, SubLObject new_confidence) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject confidence = get_cyblack_basic_posting_confidence(self);
            try {
                try {
                    confidence = new_confidence;
                    sublisp_throw($sym373$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, confidence);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_confidence(self, confidence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym373$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_on_startup_method(SubLObject self) {
        cyblack_object.cyblack_object_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_on_shutdown_method(SubLObject self) {
        cyblack_object.cyblack_object_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_initialize_qua_posting_attributes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject attribute_dictionary = get_cyblack_basic_posting_attribute_dictionary(self);
            try {
                try {
                    attribute_dictionary = NIL;
                    sublisp_throw($sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_attribute_dictionary(self, attribute_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_get_dictionary_method(SubLObject self) {
        {
            SubLObject attribute_dictionary = get_cyblack_basic_posting_attribute_dictionary(self);
            return attribute_dictionary;
        }
    }

    public static final SubLObject cyblack_basic_posting_set_dictionary_method(SubLObject self, SubLObject new_dictionary) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_method = NIL;
            SubLObject attribute_dictionary = get_cyblack_basic_posting_attribute_dictionary(self);
            try {
                try {
                    attribute_dictionary = new_dictionary;
                    sublisp_throw($sym392$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD, new_dictionary);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_attribute_dictionary(self, attribute_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_method = Errors.handleThrowable(ccatch_env_var, $sym392$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_method;
        }
    }

    public static final SubLObject cyblack_external_posting_get_external_posting_method(SubLObject self) {
        {
            SubLObject external_posting = get_cyblack_external_posting_external_posting(self);
            return external_posting;
        }
    }

    public static final SubLObject cyblack_external_posting_set_external_posting_method(SubLObject self, SubLObject new_external_posting) {
        {
            SubLObject catch_var_for_cyblack_external_posting_method = NIL;
            SubLObject external_posting = get_cyblack_external_posting_external_posting(self);
            try {
                try {
                    external_posting = new_external_posting;
                    sublisp_throw($sym400$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD, new_external_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_posting_external_posting(self, external_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_posting_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_external_posting_method;
        }
    }

    public static final SubLObject cyblack_external_posting_set_confidence_method(SubLObject self, SubLObject new_confidence) {
        return cyblack_basic_posting_set_confidence_method(self, new_confidence);
    }

    public static final SubLObject cyblack_external_posting_get_confidence_method(SubLObject self) {
        return cyblack_basic_posting_get_confidence_method(self);
    }

    public static final SubLObject cyblack_external_posting_recompute_confidence_method(SubLObject self) {
        {
            SubLObject external_posting = get_cyblack_external_posting_external_posting(self);
            SubLObject new_confidence = NIL;
            if (NIL != external_posting) {
                new_confidence = ep_recompute_confidence(external_posting, cyblack_support.cyblack_basic_support_dependent_get_all_supports_method(self));
                return new_confidence;
            }
            return cyblack_external_posting_get_confidence_method(self);
        }
    }

    public static final SubLObject cyblack_external_posting_invalidate_method(SubLObject self) {
        {
            SubLObject external_posting = get_cyblack_external_posting_external_posting(self);
            if (NIL != external_posting) {
                ep_invalidate(external_posting, cyblack_support.cyblack_basic_support_get_all_dependents_method(self));
                cyblack_basic_posting_remove_all_dependents_method(self);
            } else {
                cyblack_basic_posting_invalidate_method(self);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_posting_set_valid_method(SubLObject self, SubLObject new_validation) {
        {
            SubLObject catch_var_for_cyblack_external_posting_method = NIL;
            SubLObject is_valid = get_cyblack_basic_posting_is_valid(self);
            try {
                try {
                    is_valid = new_validation;
                    sublisp_throw($sym413$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD, new_validation);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_is_valid(self, is_valid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_posting_method = Errors.handleThrowable(ccatch_env_var, $sym413$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_external_posting_method;
        }
    }

    public static final SubLObject cyblack_external_posting_valid_p_method(SubLObject self) {
        {
            SubLObject is_valid = get_cyblack_basic_posting_is_valid(self);
            return is_valid;
        }
    }

    public static final class $external_posting_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_posting.$external_posting_native.structDecl;
        }

        public SubLObject getField2() {
            return $cyblack_external_posting;
        }

        public SubLObject getField3() {
            return $internals;
        }

        public SubLObject getField4() {
            return $recompute_confidence_function;
        }

        public SubLObject getField5() {
            return $invalidate_function;
        }

        public SubLObject setField2(SubLObject value) {
            return $cyblack_external_posting = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $internals = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $recompute_confidence_function = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $invalidate_function = value;
        }

        public SubLObject $cyblack_external_posting = Lisp.NIL;

        public SubLObject $internals = Lisp.NIL;

        public SubLObject $recompute_confidence_function = Lisp.NIL;

        public SubLObject $invalidate_function = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_posting.$external_posting_native.class, EXTERNAL_POSTING, EXTERNAL_POSTING_P, $list_alt417, $list_alt418, new String[]{ "$cyblack_external_posting", "$internals", "$recompute_confidence_function", "$invalidate_function" }, $list_alt419, $list_alt420, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_posting$ = makeSymbol("*DTP-EXTERNAL-POSTING*");

    public static final SubLObject external_posting_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_posting_p(SubLObject v_object) {
        return v_object.getClass() == cyblack_posting.$external_posting_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_posting_p$UnaryFunction extends UnaryFunction {
        public $external_posting_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-POSTING-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_posting_p(arg1);
        }
    }

    public static final SubLObject ep_cyblack_external_posting(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.getField2();
    }

    public static final SubLObject ep_internals(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.getField3();
    }

    public static final SubLObject ep_recompute_confidence_function(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.getField4();
    }

    public static final SubLObject ep_invalidate_function(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_ep_cyblack_external_posting(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ep_internals(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ep_recompute_confidence_function(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ep_invalidate_function(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_POSTING_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_external_posting(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_posting.$external_posting_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYBLACK_EXTERNAL_POSTING)) {
                        _csetf_ep_cyblack_external_posting(v_new, current_value);
                    } else
                        if (pcase_var.eql($INTERNALS)) {
                            _csetf_ep_internals(v_new, current_value);
                        } else
                            if (pcase_var.eql($RECOMPUTE_CONFIDENCE_FUNCTION)) {
                                _csetf_ep_recompute_confidence_function(v_new, current_value);
                            } else
                                if (pcase_var.eql($INVALIDATE_FUNCTION)) {
                                    _csetf_ep_invalidate_function(v_new, current_value);
                                } else {
                                    Errors.error($str_alt435$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    public static final SubLObject with_ep_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ep = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt436);
            ep = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject ep_var = make_symbol($$$ep);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(ep_var, ep, EP_, $list_alt417, forms, UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_ep_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ep = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt436);
            ep = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject ep_var = make_symbol($$$ep);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(ep_var, ep, EP_, $list_alt417, forms, NIL);
            }
        }
    }

    public static final SubLObject with_locked_ep(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ep = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt436);
            ep = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject ep_var = make_symbol($$$ep);
                SubLObject cep_var = make_symbol($$$cep);
                return list(CLET, list(list(ep_var, ep), list(cep_var, list(EP_CYBLACK_EXTERNAL_POSTING, ep_var))), listS(WITH_CYBLACK_BASIC_LOCKABLE, list(cep_var, ep_var), forms));
            }
        }
    }

    public static final SubLObject with_locked_ep_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ep = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt436);
            ep = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject ep_var = make_symbol($$$ep);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(ep_var, ep, EP_, $list_alt417, listS(WITH_CYBLACK_BASIC_LOCKABLE, list(CYBLACK_EXTERNAL_POSTING, ep_var), forms), UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_locked_ep_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ep = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt436);
            ep = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject ep_var = make_symbol($$$ep);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(ep_var, ep, EP_, $list_alt417, listS(WITH_CYBLACK_BASIC_LOCKABLE, list(CYBLACK_EXTERNAL_POSTING, ep_var), forms), NIL);
            }
        }
    }

    public static final SubLObject new_external_posting(SubLObject new_internals, SubLObject new_recompute_confidence_function, SubLObject new_invalidate_function) {
        if (new_internals == UNPROVIDED) {
            new_internals = NIL;
        }
        if (new_recompute_confidence_function == UNPROVIDED) {
            new_recompute_confidence_function = NIL;
        }
        if (new_invalidate_function == UNPROVIDED) {
            new_invalidate_function = NIL;
        }
        {
            SubLObject new_ep = make_external_posting(UNPROVIDED);
            SubLObject new_cep = object.object_new_method(CYBLACK_EXTERNAL_POSTING);
            cyblack_external_posting_set_external_posting_method(new_cep, new_ep);
            {
                SubLObject ep = new_ep;
                SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep);
                SubLObject internals = ep_internals(ep);
                SubLObject recompute_confidence_function = ep_recompute_confidence_function(ep);
                SubLObject invalidate_function = ep_invalidate_function(ep);
                try {
                    cyblack_external_posting = new_cep;
                    internals = new_internals;
                    recompute_confidence_function = new_recompute_confidence_function;
                    invalidate_function = new_invalidate_function;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            _csetf_ep_cyblack_external_posting(ep, cyblack_external_posting);
                            _csetf_ep_internals(ep, internals);
                            _csetf_ep_recompute_confidence_function(ep, recompute_confidence_function);
                            _csetf_ep_invalidate_function(ep, invalidate_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            return new_ep;
        }
    }

    public static final SubLObject ep_set_datatype(SubLObject ep, SubLObject new_datatype) {
        {
            SubLObject ep_3 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_3);
            if (NIL != cyblack_external_posting) {
                cyblack_basic_posting_set_datatype_method(cyblack_external_posting, new_datatype);
                return new_datatype;
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_datatype(SubLObject ep) {
        {
            SubLObject ep_4 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_4);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_datatype_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_panel(SubLObject ep) {
        {
            SubLObject ep_5 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_5);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_panel_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_activation_pattern(SubLObject ep) {
        {
            SubLObject ep_6 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_6);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_activation_pattern_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_set_activation_pattern(SubLObject ep, SubLObject new_activation_pattern) {
        {
            SubLObject ep_7 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_7);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_set_activation_pattern_method(cyblack_external_posting, new_activation_pattern);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_confidence(SubLObject ep) {
        {
            SubLObject ep_8 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_8);
            if (NIL != cyblack_external_posting) {
                return cyblack_external_posting_get_confidence_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_set_confidence(SubLObject ep, SubLObject new_confidence) {
        {
            SubLObject ep_9 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_9);
            if (NIL != cyblack_external_posting) {
                cyblack_external_posting_set_confidence_method(cyblack_external_posting, new_confidence);
                return new_confidence;
            }
        }
        return NIL;
    }

    public static final SubLObject ep_recompute_confidence(SubLObject ep, SubLObject supports) {
        {
            SubLObject new_confidence = NIL;
            SubLObject ep_10 = ep;
            SubLObject recompute_confidence_function = ep_recompute_confidence_function(ep_10);
            if (NIL != recompute_confidence_function) {
                new_confidence = funcall(recompute_confidence_function, ep, supports);
            }
            ep_set_confidence(ep, new_confidence);
            return new_confidence;
        }
    }

    public static final SubLObject ep_invalidate(SubLObject ep, SubLObject dependents) {
        {
            SubLObject is_valid = T;
            SubLObject ep_11 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_11);
            SubLObject invalidate_function = ep_invalidate_function(ep_11);
            if (NIL != invalidate_function) {
                is_valid = funcall(invalidate_function, ep, dependents);
            }
            if (NIL != cyblack_external_posting) {
                cyblack_external_posting_set_valid_method(cyblack_external_posting, is_valid);
            }
            return is_valid;
        }
    }

    public static final SubLObject ep_valid_p(SubLObject ep) {
        {
            SubLObject ep_12 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_12);
            if (NIL != cyblack_external_posting) {
                return cyblack_external_posting_valid_p_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_posting_recompute_confidence_function_check_lambda_list(SubLObject lambda_list) {
        cyblack_utilities.cyblack_silence(lambda_list);
        return T;
    }

    public static final SubLObject def_recompute_confidence_function(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject confidence_function_name = NIL;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt442);
            confidence_function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt442);
            lambda_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                cyblack_posting_recompute_confidence_function_check_lambda_list(lambda_list);
                return listS(DEFINE_PUBLIC, confidence_function_name, lambda_list, body);
            }
        }
    }

    public static final SubLObject cyblack_posting_invalidate_function_check_lambda_list(SubLObject lambda_list) {
        cyblack_utilities.cyblack_silence(lambda_list);
        return T;
    }

    public static final SubLObject def_invalidate_function(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject invalidate_function_name = NIL;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt444);
            invalidate_function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt444);
            lambda_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                cyblack_posting_invalidate_function_check_lambda_list(lambda_list);
                return listS(DEFINE_PUBLIC, invalidate_function_name, lambda_list, body);
            }
        }
    }

    public static final SubLObject ep_get_attributes(SubLObject ep) {
        {
            SubLObject ep_13 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_13);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_attributes_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_add_attribute(SubLObject ep, SubLObject new_attribute) {
        if (new_attribute == UNPROVIDED) {
            new_attribute = NIL;
        }
        {
            SubLObject ep_14 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_14);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_add_attribute_method(cyblack_external_posting, new_attribute);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_set_attribute_value(SubLObject ep, SubLObject attribute, SubLObject value) {
        {
            SubLObject ep_15 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_15);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_set_attribute_value_method(cyblack_external_posting, attribute, value);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_attribute_value(SubLObject ep, SubLObject attribute, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject ep_16 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_16);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_attribute_value_method(cyblack_external_posting, attribute, v_default);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_set_attributes_from_plist(SubLObject ep, SubLObject attribute_plist) {
        {
            SubLObject ep_17 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_17);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_set_attributes_from_plist_method(cyblack_external_posting, attribute_plist);
            }
        }
        return NIL;
    }

    public static final SubLObject ep_get_attributes_as_plist(SubLObject ep) {
        {
            SubLObject ep_18 = ep;
            SubLObject cyblack_external_posting = ep_cyblack_external_posting(ep_18);
            if (NIL != cyblack_external_posting) {
                return cyblack_basic_posting_get_attributes_as_plist_method(cyblack_external_posting);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_posting_visitor_p(SubLObject cyblack_posting_visitor) {
        return interfaces.subloop_instanceof_interface(cyblack_posting_visitor, CYBLACK_POSTING_VISITOR);
    }

    public static final SubLObject get_cyblack_basic_posting_visitor_continue(SubLObject cyblack_basic_posting_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting_visitor, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject set_cyblack_basic_posting_visitor_continue(SubLObject cyblack_basic_posting_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting_visitor, value, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_visitor_p(SubLObject cyblack_basic_posting_visitor) {
        return classes.subloop_instanceof_class(cyblack_basic_posting_visitor, CYBLACK_BASIC_POSTING_VISITOR);
    }

    public static final SubLObject cyblack_basic_posting_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_posting_visitor_continue(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    v_continue = T;
                    sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym456$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_visitor_clone_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_posting_visitor_continue(self);
            try {
                try {
                    {
                        SubLObject new_posting = object.object_clone_method(self);
                        instances.set_slot(new_posting, CONTINUE, v_continue);
                        sublisp_throw($sym460$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD, new_posting);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym460$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        cyblack_object.cyblack_object_set_application_method(self, new_application);
        return self;
    }

    public static final SubLObject cyblack_basic_posting_visitor_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt468$___VISIT__S__S_, self, v_cyblack_posting);
            }
            return v_cyblack_posting;
        }
    }

    public static final SubLObject cyblack_basic_posting_visitor_continue_p_method(SubLObject self, SubLObject v_cyblack_posting) {
        if (v_cyblack_posting == UNPROVIDED) {
            v_cyblack_posting = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_posting_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_posting_visitor_continue(self);
            try {
                try {
                    sublisp_throw($sym473$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD, v_continue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym473$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_visitor_get_final_state_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_posting_collector_collected_postings(SubLObject cyblack_posting_collector) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_posting_collector, FOUR_INTEGER, COLLECTED_POSTINGS);
    }

    public static final SubLObject set_cyblack_posting_collector_collected_postings(SubLObject cyblack_posting_collector, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_posting_collector, value, FOUR_INTEGER, COLLECTED_POSTINGS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_posting_collector_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_posting_collector_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_COLLECTOR, COLLECTED_POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_posting_collector_p(SubLObject cyblack_posting_collector) {
        return classes.subloop_instanceof_class(cyblack_posting_collector, CYBLACK_POSTING_COLLECTOR);
    }

    public static final SubLObject cyblack_posting_collector_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_posting_collector_method = NIL;
            SubLObject collected_postings = get_cyblack_posting_collector_collected_postings(self);
            try {
                try {
                    cyblack_basic_posting_visitor_initialize_method(self);
                    collected_postings = NIL;
                    sublisp_throw($sym483$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_collector_collected_postings(self, collected_postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_collector_method = Errors.handleThrowable(ccatch_env_var, $sym483$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD);
            }
            return catch_var_for_cyblack_posting_collector_method;
        }
    }

    public static final SubLObject cyblack_posting_collector_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_posting_collector_method = NIL;
            SubLObject collected_postings = get_cyblack_posting_collector_collected_postings(self);
            try {
                try {
                    cyblack_basic_posting_visitor_set_initial_state_method(self, new_application, UNPROVIDED);
                    collected_postings = new_state;
                    sublisp_throw($sym486$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_collector_collected_postings(self, collected_postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_collector_method = Errors.handleThrowable(ccatch_env_var, $sym486$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD);
            }
            return catch_var_for_cyblack_posting_collector_method;
        }
    }

    public static final SubLObject cyblack_posting_collector_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        set_cyblack_posting_collector_collected_postings(self, cons(v_cyblack_posting, get_cyblack_posting_collector_collected_postings(self)));
        return v_cyblack_posting;
    }

    public static final SubLObject cyblack_posting_collector_get_final_state_method(SubLObject self) {
        {
            SubLObject collected_postings = get_cyblack_posting_collector_collected_postings(self);
            return reverse(collected_postings);
        }
    }

    public static final SubLObject get_cyblack_ordinal_posting_ord(SubLObject cyblack_ordinal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_posting, TWENTY_INTEGER, ORD);
    }

    public static final SubLObject set_cyblack_ordinal_posting_ord(SubLObject cyblack_ordinal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_posting, value, TWENTY_INTEGER, ORD);
    }

    public static final SubLObject cyblack_ordinal_posting_set_ord_method(SubLObject self, SubLObject new_ord) {
        cyblack_ordinal_posting_internal_set_ord_method(self, new_ord);
        return new_ord;
    }

    public static final SubLObject cyblack_ordinal_posting_get_ord_method(SubLObject self) {
        return cyblack_ordinal_posting_internal_get_ord_method(self);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ordinal_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ordinal_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_POSTING, ORD, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ordinal_posting_p(SubLObject cyblack_ordinal_posting) {
        return classes.subloop_instanceof_class(cyblack_ordinal_posting, CYBLACK_ORDINAL_POSTING);
    }

    public static final SubLObject cyblack_ordinal_posting_internal_get_ord_method(SubLObject self) {
        {
            SubLObject ord = get_cyblack_ordinal_posting_ord(self);
            return ord;
        }
    }

    public static final SubLObject cyblack_ordinal_posting_internal_set_ord_method(SubLObject self, SubLObject new_ord) {
        {
            SubLObject catch_var_for_cyblack_ordinal_posting_method = NIL;
            SubLObject ord = get_cyblack_ordinal_posting_ord(self);
            try {
                try {
                    ord = new_ord;
                    sublisp_throw($sym511$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD, new_ord);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_posting_ord(self, ord);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym511$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_posting_method = NIL;
            SubLObject ord = get_cyblack_ordinal_posting_ord(self);
            try {
                try {
                    cyblack_basic_posting_initialize_method(self);
                    ord = NIL;
                    sublisp_throw($sym514$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_posting_ord(self, ord);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym514$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_ordinal_posting_method = NIL;
            SubLObject ord = get_cyblack_ordinal_posting_ord(self);
            SubLObject datatype = get_cyblack_basic_posting_datatype(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    format(stream, $str_alt518$__ORDINAL_POSTING___S__OF_DATATYP, new SubLObject[]{ ord, datatype, instance_number });
                    sublisp_throw($sym517$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_posting_ord(self, ord);
                            set_cyblack_basic_posting_datatype(self, datatype);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym517$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_posting_method;
        }
    }

    public static final SubLObject cyblack_posting_visitor_set_initial_state(SubLObject cyblack_posting_visitor, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_visitor_p(cyblack_posting_visitor)) {
                    Errors.error($str_alt520$CYBLACK_POSTING_VISITOR_SET_INITI, cyblack_posting_visitor);
                }
            }
            if (NIL != cyblack_basic_posting_visitor_p(cyblack_posting_visitor)) {
                return cyblack_basic_posting_visitor_set_initial_state_method(cyblack_posting_visitor, new_application, new_state);
            } else {
                return methods.funcall_instance_method_with_2_args(cyblack_posting_visitor, SET_INITIAL_STATE, new_application, new_state);
            }
        }
    }

    public static final SubLObject cyblack_posting_visitor_visit(SubLObject cyblack_posting_visitor, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_visitor_p(cyblack_posting_visitor)) {
                    Errors.error($str_alt521$CYBLACK_POSTING_VISITOR_VISIT___S, cyblack_posting_visitor);
                }
            }
            if (NIL != cyblack_basic_posting_visitor_p(cyblack_posting_visitor)) {
                return cyblack_basic_posting_visitor_visit_method(cyblack_posting_visitor, v_cyblack_posting);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_posting_visitor, VISIT, v_cyblack_posting);
            }
        }
    }

    public static final SubLObject cyblack_posting_visitor_continue_p(SubLObject cyblack_posting_visitor, SubLObject v_cyblack_posting) {
        if (v_cyblack_posting == UNPROVIDED) {
            v_cyblack_posting = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_visitor_p(cyblack_posting_visitor)) {
                    Errors.error($str_alt522$CYBLACK_POSTING_VISITOR_CONTINUE_, cyblack_posting_visitor);
                }
            }
            if (NIL != cyblack_basic_posting_visitor_p(cyblack_posting_visitor)) {
                return cyblack_basic_posting_visitor_continue_p_method(cyblack_posting_visitor, v_cyblack_posting);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_posting_visitor, CONTINUE_P, v_cyblack_posting);
            }
        }
    }

    public static final SubLObject cyblack_posting_visitor_get_final_state(SubLObject cyblack_posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting_visitor_p(cyblack_posting_visitor)) {
                    Errors.error($str_alt523$CYBLACK_POSTING_VISITOR_GET_FINAL, cyblack_posting_visitor);
                }
            }
            if (NIL != cyblack_basic_posting_visitor_p(cyblack_posting_visitor)) {
                return cyblack_basic_posting_visitor_get_final_state_method(cyblack_posting_visitor);
            } else {
                return methods.funcall_instance_method_with_0_args(cyblack_posting_visitor, GET_FINAL_STATE);
            }
        }
    }

    public static final SubLObject declare_cyblack_posting_file() {
        declareFunction("valid_cyblack_posting_support_types", "VALID-CYBLACK-POSTING-SUPPORT-TYPES", 0, 0, false);
        declareFunction("cyblack_posting_support_type_p", "CYBLACK-POSTING-SUPPORT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_posting_support_type", "ENCODE-CYBLACK-POSTING-SUPPORT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_posting_support_type", "DECODE-CYBLACK-POSTING-SUPPORT-TYPE", 1, 0, false);
        declareFunction("cyblack_posting_support_type_less_p", "CYBLACK-POSTING-SUPPORT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_posting_support_type_greater_p", "CYBLACK-POSTING-SUPPORT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_posting_p", "CYBLACK-POSTING-P", 1, 0, false);
        declareFunction("get_cyblack_virtual_posting_actual_posting", "GET-CYBLACK-VIRTUAL-POSTING-ACTUAL-POSTING", 1, 0, false);
        declareFunction("set_cyblack_virtual_posting_actual_posting", "SET-CYBLACK-VIRTUAL-POSTING-ACTUAL-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_virtual_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_virtual_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_virtual_posting_p", "CYBLACK-VIRTUAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_virtual_posting_internalize_external_representation_method", "CYBLACK-VIRTUAL-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_internalize_content_method", "CYBLACK-VIRTUAL-POSTING-INTERNALIZE-CONTENT-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_internalize_attributes_method", "CYBLACK-VIRTUAL-POSTING-INTERNALIZE-ATTRIBUTES-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_externalize_internal_representation_method", "CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_externalize_content_method", "CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-CONTENT-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_externalize_attributes_method", "CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_get_datatype_method", "CYBLACK-VIRTUAL-POSTING-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_datatype_method", "CYBLACK-VIRTUAL-POSTING-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_get_panel_method", "CYBLACK-VIRTUAL-POSTING-GET-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_panel_method", "CYBLACK-VIRTUAL-POSTING-SET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_get_support_type_method", "CYBLACK-VIRTUAL-POSTING-GET-SUPPORT-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_support_type_method", "CYBLACK-VIRTUAL-POSTING-SET-SUPPORT-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_get_activation_pattern_method", "CYBLACK-VIRTUAL-POSTING-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_activation_pattern_method", "CYBLACK-VIRTUAL-POSTING-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_get_ksi_method", "CYBLACK-VIRTUAL-POSTING-GET-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_ksi_method", "CYBLACK-VIRTUAL-POSTING-SET-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_get_ks_method", "CYBLACK-VIRTUAL-POSTING-GET-KS-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_get_confidence_method", "CYBLACK-VIRTUAL-POSTING-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_confidence_method", "CYBLACK-VIRTUAL-POSTING-SET-CONFIDENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_recompute_confidence_method", "CYBLACK-VIRTUAL-POSTING-RECOMPUTE-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_invalidate_method", "CYBLACK-VIRTUAL-POSTING-INVALIDATE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_valid_p_method", "CYBLACK-VIRTUAL-POSTING-VALID-P-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_active_p_method", "CYBLACK-VIRTUAL-POSTING-ACTIVE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_active_method", "CYBLACK-VIRTUAL-POSTING-SET-ACTIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_immutable_p_method", "CYBLACK-VIRTUAL-POSTING-IMMUTABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_set_immutable_method", "CYBLACK-VIRTUAL-POSTING-SET-IMMUTABLE-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_posting_on_post_method", "CYBLACK-VIRTUAL-POSTING-ON-POST-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_posting_after_stimulation_method", "CYBLACK-VIRTUAL-POSTING-AFTER-STIMULATION-METHOD", 1, 0, false);
        declareFunction("get_cyblack_serialized_posting_index", "GET-CYBLACK-SERIALIZED-POSTING-INDEX", 1, 0, false);
        declareFunction("set_cyblack_serialized_posting_index", "SET-CYBLACK-SERIALIZED-POSTING-INDEX", 2, 0, false);
        declareFunction("get_cyblack_serialized_posting_datastore", "GET-CYBLACK-SERIALIZED-POSTING-DATASTORE", 1, 0, false);
        declareFunction("set_cyblack_serialized_posting_datastore", "SET-CYBLACK-SERIALIZED-POSTING-DATASTORE", 2, 0, false);
        declareFunction("get_cyblack_serialized_posting_datatype", "GET-CYBLACK-SERIALIZED-POSTING-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_serialized_posting_datatype", "SET-CYBLACK-SERIALIZED-POSTING-DATATYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_serialized_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERIALIZED-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_serialized_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERIALIZED-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_serialized_posting_p", "CYBLACK-SERIALIZED-POSTING-P", 1, 0, false);
        declareFunction("cyblack_serialized_posting_internalize_external_representation_method", "CYBLACK-SERIALIZED-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_internalize_content_method", "CYBLACK-SERIALIZED-POSTING-INTERNALIZE-CONTENT-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_internalize_attributes_method", "CYBLACK-SERIALIZED-POSTING-INTERNALIZE-ATTRIBUTES-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_externalize_internal_representation_method", "CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_externalize_content_method", "CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-CONTENT-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_externalize_attributes_method", "CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_get_datatype_method", "CYBLACK-SERIALIZED-POSTING-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_datatype_method", "CYBLACK-SERIALIZED-POSTING-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_get_panel_method", "CYBLACK-SERIALIZED-POSTING-GET-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_panel_method", "CYBLACK-SERIALIZED-POSTING-SET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_get_support_type_method", "CYBLACK-SERIALIZED-POSTING-GET-SUPPORT-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_support_type_method", "CYBLACK-SERIALIZED-POSTING-SET-SUPPORT-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_get_activation_pattern_method", "CYBLACK-SERIALIZED-POSTING-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_activation_pattern_method", "CYBLACK-SERIALIZED-POSTING-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_get_ksi_method", "CYBLACK-SERIALIZED-POSTING-GET-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_ksi_method", "CYBLACK-SERIALIZED-POSTING-SET-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_get_ks_method", "CYBLACK-SERIALIZED-POSTING-GET-KS-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_get_confidence_method", "CYBLACK-SERIALIZED-POSTING-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_confidence_method", "CYBLACK-SERIALIZED-POSTING-SET-CONFIDENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_recompute_confidence_method", "CYBLACK-SERIALIZED-POSTING-RECOMPUTE-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_invalidate_method", "CYBLACK-SERIALIZED-POSTING-INVALIDATE-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_valid_p_method", "CYBLACK-SERIALIZED-POSTING-VALID-P-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_active_p_method", "CYBLACK-SERIALIZED-POSTING-ACTIVE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_active_method", "CYBLACK-SERIALIZED-POSTING-SET-ACTIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_immutable_p_method", "CYBLACK-SERIALIZED-POSTING-IMMUTABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_set_immutable_method", "CYBLACK-SERIALIZED-POSTING-SET-IMMUTABLE-METHOD", 2, 0, false);
        declareFunction("cyblack_serialized_posting_on_post_method", "CYBLACK-SERIALIZED-POSTING-ON-POST-METHOD", 1, 0, false);
        declareFunction("cyblack_serialized_posting_after_stimulation_method", "CYBLACK-SERIALIZED-POSTING-AFTER-STIMULATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_allocate_posting_id", "CYBLACK-BASIC-POSTING-ALLOCATE-POSTING-ID", 0, 0, false);
        declareFunction("cyblack_basic_posting_reset_posting_id_allocator", "CYBLACK-BASIC-POSTING-RESET-POSTING-ID-ALLOCATOR", 0, 0, false);
        declareFunction("get_cyblack_basic_posting_attribute_dictionary", "GET-CYBLACK-BASIC-POSTING-ATTRIBUTE-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_attribute_dictionary", "SET-CYBLACK-BASIC-POSTING-ATTRIBUTE-DICTIONARY", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_internal_pid", "GET-CYBLACK-BASIC-POSTING-INTERNAL-PID", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_internal_pid", "SET-CYBLACK-BASIC-POSTING-INTERNAL-PID", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_active", "GET-CYBLACK-BASIC-POSTING-ACTIVE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_active", "SET-CYBLACK-BASIC-POSTING-ACTIVE", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_is_valid", "GET-CYBLACK-BASIC-POSTING-IS-VALID", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_is_valid", "SET-CYBLACK-BASIC-POSTING-IS-VALID", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_confidence", "GET-CYBLACK-BASIC-POSTING-CONFIDENCE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_confidence", "SET-CYBLACK-BASIC-POSTING-CONFIDENCE", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_ksi", "GET-CYBLACK-BASIC-POSTING-KSI", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_ksi", "SET-CYBLACK-BASIC-POSTING-KSI", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_activation_pattern", "GET-CYBLACK-BASIC-POSTING-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_activation_pattern", "SET-CYBLACK-BASIC-POSTING-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_support_type", "GET-CYBLACK-BASIC-POSTING-SUPPORT-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_support_type", "SET-CYBLACK-BASIC-POSTING-SUPPORT-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_datatype", "GET-CYBLACK-BASIC-POSTING-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_datatype", "SET-CYBLACK-BASIC-POSTING-DATATYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_panel", "GET-CYBLACK-BASIC-POSTING-PANEL", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_panel", "SET-CYBLACK-BASIC-POSTING-PANEL", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_stringify_guids", "GET-CYBLACK-BASIC-POSTING-STRINGIFY-GUIDS", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_stringify_guids", "SET-CYBLACK-BASIC-POSTING-STRINGIFY-GUIDS", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_immutable", "GET-CYBLACK-BASIC-POSTING-IMMUTABLE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_immutable", "SET-CYBLACK-BASIC-POSTING-IMMUTABLE", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_attributes_as_plist_method", "CYBLACK-BASIC-POSTING-GET-ATTRIBUTES-AS-PLIST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_attributes_from_plist_method", "CYBLACK-BASIC-POSTING-SET-ATTRIBUTES-FROM-PLIST-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_attribute_value_method", "CYBLACK-BASIC-POSTING-GET-ATTRIBUTE-VALUE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_posting_set_attribute_value_method", "CYBLACK-BASIC-POSTING-SET-ATTRIBUTE-VALUE-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_posting_add_attribute_method", "CYBLACK-BASIC-POSTING-ADD-ATTRIBUTE-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_posting_get_attributes_method", "CYBLACK-BASIC-POSTING-GET-ATTRIBUTES-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_posting_p", "CYBLACK-BASIC-POSTING-P", 1, 0, false);
        declareFunction("get_cyblack_external_posting_external_posting", "GET-CYBLACK-EXTERNAL-POSTING-EXTERNAL-POSTING", 1, 0, false);
        declareFunction("set_cyblack_external_posting_external_posting", "SET-CYBLACK-EXTERNAL-POSTING-EXTERNAL-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_posting_p", "CYBLACK-EXTERNAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_basic_posting_initialize_method", "CYBLACK-BASIC-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_print_method", "CYBLACK-BASIC-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_posting_plistify_method", "CYBLACK-BASIC-POSTING-PLISTIFY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_add_dependent_method", "CYBLACK-BASIC-POSTING-ADD-DEPENDENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_remove_dependent_method", "CYBLACK-BASIC-POSTING-REMOVE-DEPENDENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_remove_all_dependents_method", "CYBLACK-BASIC-POSTING-REMOVE-ALL-DEPENDENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_add_support_notify_method", "CYBLACK-BASIC-POSTING-ADD-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_remove_support_notify_method", "CYBLACK-BASIC-POSTING-REMOVE-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_remove_all_supports_method", "CYBLACK-BASIC-POSTING-REMOVE-ALL-SUPPORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_internalize_external_representation_method", "CYBLACK-BASIC-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_internalize_content_method", "CYBLACK-BASIC-POSTING-INTERNALIZE-CONTENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_internalize_attributes_method", "CYBLACK-BASIC-POSTING-INTERNALIZE-ATTRIBUTES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_externalize_internal_representation_method", "CYBLACK-BASIC-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_externalize_content_method", "CYBLACK-BASIC-POSTING-EXTERNALIZE-CONTENT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_externalize_attributes_method", "CYBLACK-BASIC-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_get_datatype_method", "CYBLACK-BASIC-POSTING-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_get_panel_method", "CYBLACK-BASIC-POSTING-GET-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_panel_method", "CYBLACK-BASIC-POSTING-SET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_support_type_method", "CYBLACK-BASIC-POSTING-GET-SUPPORT-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_support_type_method", "CYBLACK-BASIC-POSTING-SET-SUPPORT-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_activation_pattern_method", "CYBLACK-BASIC-POSTING-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_activation_pattern_method", "CYBLACK-BASIC-POSTING-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_ksi_method", "CYBLACK-BASIC-POSTING-GET-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_ksi_method", "CYBLACK-BASIC-POSTING-SET-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_get_ks_method", "CYBLACK-BASIC-POSTING-GET-KS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_get_confidence_method", "CYBLACK-BASIC-POSTING-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_recompute_confidence_method", "CYBLACK-BASIC-POSTING-RECOMPUTE-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_invalidate_method", "CYBLACK-BASIC-POSTING-INVALIDATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_valid_p_method", "CYBLACK-BASIC-POSTING-VALID-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_active_p_method", "CYBLACK-BASIC-POSTING-ACTIVE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_active_method", "CYBLACK-BASIC-POSTING-SET-ACTIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_immutable_p_method", "CYBLACK-BASIC-POSTING-IMMUTABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_immutable_method", "CYBLACK-BASIC-POSTING-SET-IMMUTABLE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_on_post_method", "CYBLACK-BASIC-POSTING-ON-POST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_after_stimulation_method", "CYBLACK-BASIC-POSTING-AFTER-STIMULATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_datatype_method", "CYBLACK-BASIC-POSTING-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_set_confidence_method", "CYBLACK-BASIC-POSTING-SET-CONFIDENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_on_startup_method", "CYBLACK-BASIC-POSTING-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_on_shutdown_method", "CYBLACK-BASIC-POSTING-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_initialize_qua_posting_attributes_method", "CYBLACK-BASIC-POSTING-INITIALIZE-QUA-POSTING-ATTRIBUTES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_get_dictionary_method", "CYBLACK-BASIC-POSTING-GET-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_set_dictionary_method", "CYBLACK-BASIC-POSTING-SET-DICTIONARY-METHOD", 2, 0, false);
        declareFunction("cyblack_external_posting_get_external_posting_method", "CYBLACK-EXTERNAL-POSTING-GET-EXTERNAL-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_external_posting_set_external_posting_method", "CYBLACK-EXTERNAL-POSTING-SET-EXTERNAL-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_external_posting_set_confidence_method", "CYBLACK-EXTERNAL-POSTING-SET-CONFIDENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_external_posting_get_confidence_method", "CYBLACK-EXTERNAL-POSTING-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_posting_recompute_confidence_method", "CYBLACK-EXTERNAL-POSTING-RECOMPUTE-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_posting_invalidate_method", "CYBLACK-EXTERNAL-POSTING-INVALIDATE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_posting_set_valid_method", "CYBLACK-EXTERNAL-POSTING-SET-VALID-METHOD", 2, 0, false);
        declareFunction("cyblack_external_posting_valid_p_method", "CYBLACK-EXTERNAL-POSTING-VALID-P-METHOD", 1, 0, false);
        declareFunction("external_posting_print_function_trampoline", "EXTERNAL-POSTING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_posting_p", "EXTERNAL-POSTING-P", 1, 0, false);
        new cyblack_posting.$external_posting_p$UnaryFunction();
        declareFunction("ep_cyblack_external_posting", "EP-CYBLACK-EXTERNAL-POSTING", 1, 0, false);
        declareFunction("ep_internals", "EP-INTERNALS", 1, 0, false);
        declareFunction("ep_recompute_confidence_function", "EP-RECOMPUTE-CONFIDENCE-FUNCTION", 1, 0, false);
        declareFunction("ep_invalidate_function", "EP-INVALIDATE-FUNCTION", 1, 0, false);
        declareFunction("_csetf_ep_cyblack_external_posting", "_CSETF-EP-CYBLACK-EXTERNAL-POSTING", 2, 0, false);
        declareFunction("_csetf_ep_internals", "_CSETF-EP-INTERNALS", 2, 0, false);
        declareFunction("_csetf_ep_recompute_confidence_function", "_CSETF-EP-RECOMPUTE-CONFIDENCE-FUNCTION", 2, 0, false);
        declareFunction("_csetf_ep_invalidate_function", "_CSETF-EP-INVALIDATE-FUNCTION", 2, 0, false);
        declareFunction("make_external_posting", "MAKE-EXTERNAL-POSTING", 0, 1, false);
        declareMacro("with_ep_read_only", "WITH-EP-READ-ONLY");
        declareMacro("with_ep_read_write", "WITH-EP-READ-WRITE");
        declareMacro("with_locked_ep", "WITH-LOCKED-EP");
        declareMacro("with_locked_ep_read_only", "WITH-LOCKED-EP-READ-ONLY");
        declareMacro("with_locked_ep_read_write", "WITH-LOCKED-EP-READ-WRITE");
        declareFunction("new_external_posting", "NEW-EXTERNAL-POSTING", 0, 3, false);
        declareFunction("ep_set_datatype", "EP-SET-DATATYPE", 2, 0, false);
        declareFunction("ep_get_datatype", "EP-GET-DATATYPE", 1, 0, false);
        declareFunction("ep_get_panel", "EP-GET-PANEL", 1, 0, false);
        declareFunction("ep_get_activation_pattern", "EP-GET-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("ep_set_activation_pattern", "EP-SET-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("ep_get_confidence", "EP-GET-CONFIDENCE", 1, 0, false);
        declareFunction("ep_set_confidence", "EP-SET-CONFIDENCE", 2, 0, false);
        declareFunction("ep_recompute_confidence", "EP-RECOMPUTE-CONFIDENCE", 2, 0, false);
        declareFunction("ep_invalidate", "EP-INVALIDATE", 2, 0, false);
        declareFunction("ep_valid_p", "EP-VALID-P", 1, 0, false);
        declareFunction("cyblack_posting_recompute_confidence_function_check_lambda_list", "CYBLACK-POSTING-RECOMPUTE-CONFIDENCE-FUNCTION-CHECK-LAMBDA-LIST", 1, 0, false);
        declareMacro("def_recompute_confidence_function", "DEF-RECOMPUTE-CONFIDENCE-FUNCTION");
        declareFunction("cyblack_posting_invalidate_function_check_lambda_list", "CYBLACK-POSTING-INVALIDATE-FUNCTION-CHECK-LAMBDA-LIST", 1, 0, false);
        declareMacro("def_invalidate_function", "DEF-INVALIDATE-FUNCTION");
        declareFunction("ep_get_attributes", "EP-GET-ATTRIBUTES", 1, 0, false);
        declareFunction("ep_add_attribute", "EP-ADD-ATTRIBUTE", 1, 1, false);
        declareFunction("ep_set_attribute_value", "EP-SET-ATTRIBUTE-VALUE", 3, 0, false);
        declareFunction("ep_get_attribute_value", "EP-GET-ATTRIBUTE-VALUE", 2, 1, false);
        declareFunction("ep_set_attributes_from_plist", "EP-SET-ATTRIBUTES-FROM-PLIST", 2, 0, false);
        declareFunction("ep_get_attributes_as_plist", "EP-GET-ATTRIBUTES-AS-PLIST", 1, 0, false);
        declareFunction("cyblack_posting_visitor_p", "CYBLACK-POSTING-VISITOR-P", 1, 0, false);
        declareFunction("get_cyblack_basic_posting_visitor_continue", "GET-CYBLACK-BASIC-POSTING-VISITOR-CONTINUE", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_visitor_continue", "SET-CYBLACK-BASIC-POSTING-VISITOR-CONTINUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_posting_visitor_p", "CYBLACK-BASIC-POSTING-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_basic_posting_visitor_initialize_method", "CYBLACK-BASIC-POSTING-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_visitor_clone_method", "CYBLACK-BASIC-POSTING-VISITOR-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_visitor_set_initial_state_method", "CYBLACK-BASIC-POSTING-VISITOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_posting_visitor_visit_method", "CYBLACK-BASIC-POSTING-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_visitor_continue_p_method", "CYBLACK-BASIC-POSTING-VISITOR-CONTINUE-P-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_posting_visitor_get_final_state_method", "CYBLACK-BASIC-POSTING-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_posting_collector_collected_postings", "GET-CYBLACK-POSTING-COLLECTOR-COLLECTED-POSTINGS", 1, 0, false);
        declareFunction("set_cyblack_posting_collector_collected_postings", "SET-CYBLACK-POSTING-COLLECTOR-COLLECTED-POSTINGS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_posting_collector_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-COLLECTOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_posting_collector_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-COLLECTOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_posting_collector_p", "CYBLACK-POSTING-COLLECTOR-P", 1, 0, false);
        declareFunction("cyblack_posting_collector_initialize_method", "CYBLACK-POSTING-COLLECTOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_collector_set_initial_state_method", "CYBLACK-POSTING-COLLECTOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_posting_collector_visit_method", "CYBLACK-POSTING-COLLECTOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_collector_get_final_state_method", "CYBLACK-POSTING-COLLECTOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_ordinal_posting_ord", "GET-CYBLACK-ORDINAL-POSTING-ORD", 1, 0, false);
        declareFunction("set_cyblack_ordinal_posting_ord", "SET-CYBLACK-ORDINAL-POSTING-ORD", 2, 0, false);
        declareFunction("cyblack_ordinal_posting_set_ord_method", "CYBLACK-ORDINAL-POSTING-SET-ORD-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_posting_get_ord_method", "CYBLACK-ORDINAL-POSTING-GET-ORD-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ordinal_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ordinal_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_ordinal_posting_p", "CYBLACK-ORDINAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_ordinal_posting_internal_get_ord_method", "CYBLACK-ORDINAL-POSTING-INTERNAL-GET-ORD-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_posting_internal_set_ord_method", "CYBLACK-ORDINAL-POSTING-INTERNAL-SET-ORD-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_posting_initialize_method", "CYBLACK-ORDINAL-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_posting_print_method", "CYBLACK-ORDINAL-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_posting_visitor_set_initial_state", "CYBLACK-POSTING-VISITOR-SET-INITIAL-STATE", 2, 1, false);
        declareFunction("cyblack_posting_visitor_visit", "CYBLACK-POSTING-VISITOR-VISIT", 2, 0, false);
        declareFunction("cyblack_posting_visitor_continue_p", "CYBLACK-POSTING-VISITOR-CONTINUE-P", 1, 1, false);
        declareFunction("cyblack_posting_visitor_get_final_state", "CYBLACK-POSTING-VISITOR-GET-FINAL-STATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_posting_file() {
        defconstant("*VALID-CYBLACK-POSTING-SUPPORT-TYPES*", $list_alt0);
        defconstant("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*", $str_alt36$__S__S___No_actual_posting_is_ass);
        defparameter("*CYBLACK-BASIC-POSTING-ID-COUNTER-LOCK*", make_lock($$$CyBlack_Posting_ID_Counter_Lock));
        defvar("*CYBLACK-BASIC-POSTING-ID-COUNTER*", MINUS_ONE_INTEGER);
        defconstant("*DTP-EXTERNAL-POSTING*", EXTERNAL_POSTING);
        return NIL;
    }

    public static final SubLObject setup_cyblack_posting_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_POSTING_SUPPORT_TYPE, $list_alt0);
        interfaces.new_interface(CYBLACK_POSTING, $list_alt9, $list_alt10, $list_alt11);
        classes.subloop_new_class(CYBLACK_VIRTUAL_POSTING, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt14, NIL, $list_alt15);
        classes.class_set_implements_slot_listeners(CYBLACK_VIRTUAL_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_VIRTUAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_VIRTUAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_virtual_posting_class(CYBLACK_VIRTUAL_POSTING);
        methods.methods_incorporate_instance_method(INTERNALIZE_EXTERNAL_REPRESENTATION, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, INTERNALIZE_EXTERNAL_REPRESENTATION, $sym42$CYBLACK_VIRTUAL_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_METHO);
        methods.methods_incorporate_instance_method(INTERNALIZE_CONTENT, CYBLACK_VIRTUAL_POSTING, $list_alt44, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, INTERNALIZE_CONTENT, CYBLACK_VIRTUAL_POSTING_INTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_ATTRIBUTES, CYBLACK_VIRTUAL_POSTING, $list_alt44, $list_alt50, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, INTERNALIZE_ATTRIBUTES, CYBLACK_VIRTUAL_POSTING_INTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_INTERNAL_REPRESENTATION, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, EXTERNALIZE_INTERNAL_REPRESENTATION, $sym57$CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_METHO);
        methods.methods_incorporate_instance_method(EXTERNALIZE_CONTENT, CYBLACK_VIRTUAL_POSTING, $list_alt44, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, EXTERNALIZE_CONTENT, CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_ATTRIBUTES, CYBLACK_VIRTUAL_POSTING, $list_alt44, NIL, $list_alt63);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, EXTERNALIZE_ATTRIBUTES, CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_DATATYPE, CYBLACK_VIRTUAL_POSTING_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt71, $list_alt72);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_DATATYPE, CYBLACK_VIRTUAL_POSTING_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_PANEL, CYBLACK_VIRTUAL_POSTING_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt79, $list_alt80);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_PANEL, CYBLACK_VIRTUAL_POSTING_SET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPPORT_TYPE, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_SUPPORT_TYPE, CYBLACK_VIRTUAL_POSTING_GET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPPORT_TYPE, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt86, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_SUPPORT_TYPE, CYBLACK_VIRTUAL_POSTING_SET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt91);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_ACTIVATION_PATTERN, CYBLACK_VIRTUAL_POSTING_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt94, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_ACTIVATION_PATTERN, CYBLACK_VIRTUAL_POSTING_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt99);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_KSI, CYBLACK_VIRTUAL_POSTING_GET_KSI_METHOD);
        methods.methods_incorporate_instance_method(SET_KSI, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt102, $list_alt103);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_KSI, CYBLACK_VIRTUAL_POSTING_SET_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_KS, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_KS, CYBLACK_VIRTUAL_POSTING_GET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYBLACK_VIRTUAL_POSTING, $list_alt67, NIL, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, GET_CONFIDENCE, CYBLACK_VIRTUAL_POSTING_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONFIDENCE, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt113, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_CONFIDENCE, CYBLACK_VIRTUAL_POSTING_SET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(RECOMPUTE_CONFIDENCE, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, RECOMPUTE_CONFIDENCE, CYBLACK_VIRTUAL_POSTING_RECOMPUTE_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(INVALIDATE, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, INVALIDATE, CYBLACK_VIRTUAL_POSTING_INVALIDATE_METHOD);
        methods.methods_incorporate_instance_method(VALID_P, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt126);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, VALID_P, CYBLACK_VIRTUAL_POSTING_VALID_P_METHOD);
        methods.methods_incorporate_instance_method(ACTIVE_P, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt130);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, ACTIVE_P, CYBLACK_VIRTUAL_POSTING_ACTIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVE, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt134, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_ACTIVE, CYBLACK_VIRTUAL_POSTING_SET_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(IMMUTABLE_P, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, IMMUTABLE_P, CYBLACK_VIRTUAL_POSTING_IMMUTABLE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_IMMUTABLE, CYBLACK_VIRTUAL_POSTING, $list_alt38, $list_alt143, $list_alt144);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, SET_IMMUTABLE, CYBLACK_VIRTUAL_POSTING_SET_IMMUTABLE_METHOD);
        methods.methods_incorporate_instance_method(ON_POST, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, ON_POST, CYBLACK_VIRTUAL_POSTING_ON_POST_METHOD);
        methods.methods_incorporate_instance_method(AFTER_STIMULATION, CYBLACK_VIRTUAL_POSTING, $list_alt38, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_POSTING, AFTER_STIMULATION, CYBLACK_VIRTUAL_POSTING_AFTER_STIMULATION_METHOD);
        classes.subloop_new_class(CYBLACK_SERIALIZED_POSTING, CYBLACK_OBJECT, $list_alt14, NIL, $list_alt156);
        classes.class_set_implements_slot_listeners(CYBLACK_SERIALIZED_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SERIALIZED_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERIALIZED_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SERIALIZED_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERIALIZED_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_serialized_posting_class(CYBLACK_SERIALIZED_POSTING);
        methods.methods_incorporate_instance_method(INTERNALIZE_EXTERNAL_REPRESENTATION, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt39, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, INTERNALIZE_EXTERNAL_REPRESENTATION, $sym163$CYBLACK_SERIALIZED_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_ME);
        methods.methods_incorporate_instance_method(INTERNALIZE_CONTENT, CYBLACK_SERIALIZED_POSTING, $list_alt44, $list_alt45, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, INTERNALIZE_CONTENT, CYBLACK_SERIALIZED_POSTING_INTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_ATTRIBUTES, CYBLACK_SERIALIZED_POSTING, $list_alt44, $list_alt50, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, INTERNALIZE_ATTRIBUTES, CYBLACK_SERIALIZED_POSTING_INTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_INTERNAL_REPRESENTATION, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, EXTERNALIZE_INTERNAL_REPRESENTATION, $sym169$CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_ME);
        methods.methods_incorporate_instance_method(EXTERNALIZE_CONTENT, CYBLACK_SERIALIZED_POSTING, $list_alt44, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, EXTERNALIZE_CONTENT, CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_ATTRIBUTES, CYBLACK_SERIALIZED_POSTING, $list_alt44, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, EXTERNALIZE_ATTRIBUTES, CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_SERIALIZED_POSTING, $list_alt67, NIL, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_DATATYPE, CYBLACK_SERIALIZED_POSTING_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt71, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_DATATYPE, CYBLACK_SERIALIZED_POSTING_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_SERIALIZED_POSTING, $list_alt67, NIL, $list_alt177);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_PANEL, CYBLACK_SERIALIZED_POSTING_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt79, $list_alt80);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_PANEL, CYBLACK_SERIALIZED_POSTING_SET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPPORT_TYPE, CYBLACK_SERIALIZED_POSTING, $list_alt180, NIL, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_SUPPORT_TYPE, CYBLACK_SERIALIZED_POSTING_GET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPPORT_TYPE, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt86, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_SUPPORT_TYPE, CYBLACK_SERIALIZED_POSTING_SET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_ACTIVATION_PATTERN, CYBLACK_SERIALIZED_POSTING_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt94, $list_alt188);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_ACTIVATION_PATTERN, CYBLACK_SERIALIZED_POSTING_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_KSI, CYBLACK_SERIALIZED_POSTING_GET_KSI_METHOD);
        methods.methods_incorporate_instance_method(SET_KSI, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt102, $list_alt192);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_KSI, CYBLACK_SERIALIZED_POSTING_SET_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_KS, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt195);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_KS, CYBLACK_SERIALIZED_POSTING_GET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, GET_CONFIDENCE, CYBLACK_SERIALIZED_POSTING_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONFIDENCE, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt113, $list_alt198);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_CONFIDENCE, CYBLACK_SERIALIZED_POSTING_SET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(RECOMPUTE_CONFIDENCE, CYBLACK_SERIALIZED_POSTING, $list_alt180, NIL, $list_alt201);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, RECOMPUTE_CONFIDENCE, CYBLACK_SERIALIZED_POSTING_RECOMPUTE_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(INVALIDATE, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt203);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, INVALIDATE, CYBLACK_SERIALIZED_POSTING_INVALIDATE_METHOD);
        methods.methods_incorporate_instance_method(VALID_P, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, VALID_P, CYBLACK_SERIALIZED_POSTING_VALID_P_METHOD);
        methods.methods_incorporate_instance_method(ACTIVE_P, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, ACTIVE_P, CYBLACK_SERIALIZED_POSTING_ACTIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVE, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt134, $list_alt209);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_ACTIVE, CYBLACK_SERIALIZED_POSTING_SET_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(IMMUTABLE_P, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, IMMUTABLE_P, CYBLACK_SERIALIZED_POSTING_IMMUTABLE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_IMMUTABLE, CYBLACK_SERIALIZED_POSTING, $list_alt38, $list_alt143, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, SET_IMMUTABLE, CYBLACK_SERIALIZED_POSTING_SET_IMMUTABLE_METHOD);
        methods.methods_incorporate_instance_method(ON_POST, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, ON_POST, CYBLACK_SERIALIZED_POSTING_ON_POST_METHOD);
        methods.methods_incorporate_instance_method(AFTER_STIMULATION, CYBLACK_SERIALIZED_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_SERIALIZED_POSTING, AFTER_STIMULATION, CYBLACK_SERIALIZED_POSTING_AFTER_STIMULATION_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_POSTING, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt220, NIL, $list_alt221);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_POSTING, NIL);
        methods.methods_incorporate_instance_method(GET_ATTRIBUTES_AS_PLIST, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt233);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_ATTRIBUTES_AS_PLIST, CYBLACK_BASIC_POSTING_GET_ATTRIBUTES_AS_PLIST_METHOD);
        methods.methods_incorporate_instance_method(SET_ATTRIBUTES_FROM_PLIST, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt236, $list_alt237);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_ATTRIBUTES_FROM_PLIST, CYBLACK_BASIC_POSTING_SET_ATTRIBUTES_FROM_PLIST_METHOD);
        methods.methods_incorporate_instance_method(GET_ATTRIBUTE_VALUE, CYBLACK_BASIC_POSTING, NIL, $list_alt240, $list_alt241);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_ATTRIBUTE_VALUE, CYBLACK_BASIC_POSTING_GET_ATTRIBUTE_VALUE_METHOD);
        methods.methods_incorporate_instance_method(SET_ATTRIBUTE_VALUE, CYBLACK_BASIC_POSTING, NIL, $list_alt245, $list_alt246);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_ATTRIBUTE_VALUE, CYBLACK_BASIC_POSTING_SET_ATTRIBUTE_VALUE_METHOD);
        methods.methods_incorporate_instance_method(ADD_ATTRIBUTE, CYBLACK_BASIC_POSTING, NIL, $list_alt252, $list_alt253);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ADD_ATTRIBUTE, CYBLACK_BASIC_POSTING_ADD_ATTRIBUTE_METHOD);
        methods.methods_incorporate_instance_method(GET_ATTRIBUTES, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt257);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_ATTRIBUTES, CYBLACK_BASIC_POSTING_GET_ATTRIBUTES_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_posting_class(CYBLACK_BASIC_POSTING);
        classes.subloop_new_class(CYBLACK_EXTERNAL_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt265);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_external_posting_class(CYBLACK_EXTERNAL_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_POSTING, $list_alt270, NIL, $list_alt271);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INITIALIZE, CYBLACK_BASIC_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt275, $list_alt276);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, PRINT, CYBLACK_BASIC_POSTING_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PLISTIFY, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt281);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, PLISTIFY, CYBLACK_BASIC_POSTING_PLISTIFY_METHOD);
        methods.methods_incorporate_instance_method(ADD_DEPENDENT, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt286, $list_alt287);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ADD_DEPENDENT, CYBLACK_BASIC_POSTING_ADD_DEPENDENT_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DEPENDENT, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt290, $list_alt291);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, REMOVE_DEPENDENT, CYBLACK_BASIC_POSTING_REMOVE_DEPENDENT_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DEPENDENTS, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt294);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, REMOVE_ALL_DEPENDENTS, CYBLACK_BASIC_POSTING_REMOVE_ALL_DEPENDENTS_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt297, $list_alt298);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_POSTING_ADD_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt297, $list_alt301);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_POSTING_REMOVE_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt304);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_POSTING_REMOVE_ALL_SUPPORTS_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_EXTERNAL_REPRESENTATION, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt39, $list_alt306);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INTERNALIZE_EXTERNAL_REPRESENTATION, CYBLACK_BASIC_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_CONTENT, CYBLACK_BASIC_POSTING, $list_alt44, $list_alt45, $list_alt310);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INTERNALIZE_CONTENT, CYBLACK_BASIC_POSTING_INTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_ATTRIBUTES, CYBLACK_BASIC_POSTING, $list_alt44, $list_alt50, $list_alt313);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INTERNALIZE_ATTRIBUTES, CYBLACK_BASIC_POSTING_INTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_INTERNAL_REPRESENTATION, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, EXTERNALIZE_INTERNAL_REPRESENTATION, CYBLACK_BASIC_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_CONTENT, CYBLACK_BASIC_POSTING, $list_alt44, NIL, $list_alt317);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, EXTERNALIZE_CONTENT, CYBLACK_BASIC_POSTING_EXTERNALIZE_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_ATTRIBUTES, CYBLACK_BASIC_POSTING, $list_alt44, NIL, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, EXTERNALIZE_ATTRIBUTES, CYBLACK_BASIC_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_DATATYPE, CYBLACK_BASIC_POSTING_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_PANEL, CYBLACK_BASIC_POSTING_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt79, $list_alt324);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_PANEL, CYBLACK_BASIC_POSTING_SET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPPORT_TYPE, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt327);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_SUPPORT_TYPE, CYBLACK_BASIC_POSTING_GET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPPORT_TYPE, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt86, $list_alt329);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_SUPPORT_TYPE, CYBLACK_BASIC_POSTING_SET_SUPPORT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt332);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_ACTIVATION_PATTERN, CYBLACK_BASIC_POSTING_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt334, $list_alt335);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_ACTIVATION_PATTERN, CYBLACK_BASIC_POSTING_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt339);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_KSI, CYBLACK_BASIC_POSTING_GET_KSI_METHOD);
        methods.methods_incorporate_instance_method(SET_KSI, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt102, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_KSI, CYBLACK_BASIC_POSTING_SET_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_KS, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt344);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_KS, CYBLACK_BASIC_POSTING_GET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt346);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_CONFIDENCE, CYBLACK_BASIC_POSTING_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(RECOMPUTE_CONFIDENCE, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt346);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, RECOMPUTE_CONFIDENCE, CYBLACK_BASIC_POSTING_RECOMPUTE_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(INVALIDATE, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt350);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INVALIDATE, CYBLACK_BASIC_POSTING_INVALIDATE_METHOD);
        methods.methods_incorporate_instance_method(VALID_P, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt353);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, VALID_P, CYBLACK_BASIC_POSTING_VALID_P_METHOD);
        methods.methods_incorporate_instance_method(ACTIVE_P, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt356);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ACTIVE_P, CYBLACK_BASIC_POSTING_ACTIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVE, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt134, $list_alt359);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_ACTIVE, CYBLACK_BASIC_POSTING_SET_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(IMMUTABLE_P, CYBLACK_BASIC_POSTING, $list_alt67, NIL, $list_alt362);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, IMMUTABLE_P, CYBLACK_BASIC_POSTING_IMMUTABLE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_IMMUTABLE, CYBLACK_BASIC_POSTING, $list_alt38, $list_alt143, $list_alt364);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_IMMUTABLE, CYBLACK_BASIC_POSTING_SET_IMMUTABLE_METHOD);
        methods.methods_incorporate_instance_method(ON_POST, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ON_POST, CYBLACK_BASIC_POSTING_ON_POST_METHOD);
        methods.methods_incorporate_instance_method(AFTER_STIMULATION, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, AFTER_STIMULATION, CYBLACK_BASIC_POSTING_AFTER_STIMULATION_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_BASIC_POSTING, $list_alt44, $list_alt71, $list_alt369);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_DATATYPE, CYBLACK_BASIC_POSTING_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONFIDENCE, CYBLACK_BASIC_POSTING, $list_alt44, $list_alt113, $list_alt372);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_CONFIDENCE, CYBLACK_BASIC_POSTING_SET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt376);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ON_STARTUP, CYBLACK_BASIC_POSTING_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_POSTING, $list_alt38, NIL, $list_alt379);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, ON_SHUTDOWN, CYBLACK_BASIC_POSTING_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_POSTING_ATTRIBUTES, CYBLACK_BASIC_POSTING, $list_alt44, NIL, $list_alt382);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, INITIALIZE_QUA_POSTING_ATTRIBUTES, CYBLACK_BASIC_POSTING_INITIALIZE_QUA_POSTING_ATTRIBUTES_METHOD);
        methods.methods_incorporate_instance_method(GET_DICTIONARY, CYBLACK_BASIC_POSTING, $list_alt386, NIL, $list_alt387);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, GET_DICTIONARY, CYBLACK_BASIC_POSTING_GET_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(SET_DICTIONARY, CYBLACK_BASIC_POSTING, $list_alt44, $list_alt390, $list_alt391);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING, SET_DICTIONARY, CYBLACK_BASIC_POSTING_SET_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_POSTING, CYBLACK_EXTERNAL_POSTING, $list_alt67, NIL, $list_alt395);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, GET_EXTERNAL_POSTING, CYBLACK_EXTERNAL_POSTING_GET_EXTERNAL_POSTING_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_POSTING, CYBLACK_EXTERNAL_POSTING, $list_alt38, $list_alt398, $list_alt399);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, SET_EXTERNAL_POSTING, CYBLACK_EXTERNAL_POSTING_SET_EXTERNAL_POSTING_METHOD);
        methods.methods_incorporate_instance_method(SET_CONFIDENCE, CYBLACK_EXTERNAL_POSTING, $list_alt180, $list_alt113, $list_alt402);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, SET_CONFIDENCE, CYBLACK_EXTERNAL_POSTING_SET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYBLACK_EXTERNAL_POSTING, $list_alt180, NIL, $list_alt404);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, GET_CONFIDENCE, CYBLACK_EXTERNAL_POSTING_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(RECOMPUTE_CONFIDENCE, CYBLACK_EXTERNAL_POSTING, $list_alt67, NIL, $list_alt406);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, RECOMPUTE_CONFIDENCE, CYBLACK_EXTERNAL_POSTING_RECOMPUTE_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(INVALIDATE, CYBLACK_EXTERNAL_POSTING, $list_alt67, NIL, $list_alt408);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, INVALIDATE, CYBLACK_EXTERNAL_POSTING_INVALIDATE_METHOD);
        methods.methods_incorporate_instance_method(SET_VALID, CYBLACK_EXTERNAL_POSTING, $list_alt38, $list_alt411, $list_alt412);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, SET_VALID, CYBLACK_EXTERNAL_POSTING_SET_VALID_METHOD);
        methods.methods_incorporate_instance_method(VALID_P, CYBLACK_EXTERNAL_POSTING, $list_alt67, NIL, $list_alt353);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_POSTING, VALID_P, CYBLACK_EXTERNAL_POSTING_VALID_P_METHOD);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_external_posting$.getGlobalValue(), symbol_function(EXTERNAL_POSTING_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EP_CYBLACK_EXTERNAL_POSTING, _CSETF_EP_CYBLACK_EXTERNAL_POSTING);
        def_csetf(EP_INTERNALS, _CSETF_EP_INTERNALS);
        def_csetf(EP_RECOMPUTE_CONFIDENCE_FUNCTION, _CSETF_EP_RECOMPUTE_CONFIDENCE_FUNCTION);
        def_csetf(EP_INVALIDATE_FUNCTION, _CSETF_EP_INVALIDATE_FUNCTION);
        identity(EXTERNAL_POSTING);
        interfaces.new_interface(CYBLACK_POSTING_VISITOR, $list_alt446, $list_alt447, $list_alt448);
        classes.subloop_new_class(CYBLACK_BASIC_POSTING_VISITOR, CYBLACK_OBJECT, $list_alt450, NIL, $list_alt451);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_POSTING_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_POSTING_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_VISITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_POSTING_VISITOR, $sym454$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_VISITOR_INSTANC);
        subloop_reserved_initialize_cyblack_basic_posting_visitor_class(CYBLACK_BASIC_POSTING_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_POSTING_VISITOR, $list_alt44, NIL, $list_alt455);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, INITIALIZE, CYBLACK_BASIC_POSTING_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_BASIC_POSTING_VISITOR, $list_alt38, NIL, $list_alt459);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, CLONE, CYBLACK_BASIC_POSTING_VISITOR_CLONE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_BASIC_POSTING_VISITOR, $list_alt38, $list_alt463, $list_alt464);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, SET_INITIAL_STATE, CYBLACK_BASIC_POSTING_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_BASIC_POSTING_VISITOR, $list_alt38, $list_alt14, $list_alt467);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, VISIT, CYBLACK_BASIC_POSTING_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(CONTINUE_P, CYBLACK_BASIC_POSTING_VISITOR, $list_alt38, $list_alt471, $list_alt472);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, CONTINUE_P, CYBLACK_BASIC_POSTING_VISITOR_CONTINUE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_BASIC_POSTING_VISITOR, $list_alt38, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_VISITOR, GET_FINAL_STATE, CYBLACK_BASIC_POSTING_VISITOR_GET_FINAL_STATE_METHOD);
        classes.subloop_new_class(CYBLACK_POSTING_COLLECTOR, CYBLACK_BASIC_POSTING_VISITOR, NIL, NIL, $list_alt478);
        classes.class_set_implements_slot_listeners(CYBLACK_POSTING_COLLECTOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_POSTING_COLLECTOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_COLLECTOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_POSTING_COLLECTOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_COLLECTOR_INSTANCE);
        subloop_reserved_initialize_cyblack_posting_collector_class(CYBLACK_POSTING_COLLECTOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_POSTING_COLLECTOR, $list_alt44, NIL, $list_alt482);
        methods.subloop_register_instance_method(CYBLACK_POSTING_COLLECTOR, INITIALIZE, CYBLACK_POSTING_COLLECTOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_POSTING_COLLECTOR, $list_alt38, $list_alt463, $list_alt485);
        methods.subloop_register_instance_method(CYBLACK_POSTING_COLLECTOR, SET_INITIAL_STATE, CYBLACK_POSTING_COLLECTOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_POSTING_COLLECTOR, $list_alt488, $list_alt14, $list_alt489);
        methods.subloop_register_instance_method(CYBLACK_POSTING_COLLECTOR, VISIT, CYBLACK_POSTING_COLLECTOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_POSTING_COLLECTOR, $list_alt67, NIL, $list_alt491);
        methods.subloop_register_instance_method(CYBLACK_POSTING_COLLECTOR, GET_FINAL_STATE, CYBLACK_POSTING_COLLECTOR_GET_FINAL_STATE_METHOD);
        classes.subloop_new_class(CYBLACK_ORDINAL_POSTING, CYBLACK_BASIC_POSTING, $list_alt494, NIL, $list_alt495);
        classes.class_set_implements_slot_listeners(CYBLACK_ORDINAL_POSTING, NIL);
        methods.methods_incorporate_instance_method(SET_ORD, CYBLACK_ORDINAL_POSTING, $list_alt38, $list_alt498, $list_alt499);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, SET_ORD, CYBLACK_ORDINAL_POSTING_SET_ORD_METHOD);
        methods.methods_incorporate_instance_method(GET_ORD, CYBLACK_ORDINAL_POSTING, $list_alt38, NIL, $list_alt502);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, GET_ORD, CYBLACK_ORDINAL_POSTING_GET_ORD_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_ORDINAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ORDINAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_ordinal_posting_class(CYBLACK_ORDINAL_POSTING);
        methods.methods_incorporate_instance_method(INTERNAL_GET_ORD, CYBLACK_ORDINAL_POSTING, $list_alt386, NIL, $list_alt507);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, INTERNAL_GET_ORD, CYBLACK_ORDINAL_POSTING_INTERNAL_GET_ORD_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_ORD, CYBLACK_ORDINAL_POSTING, $list_alt44, $list_alt498, $list_alt510);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, INTERNAL_SET_ORD, CYBLACK_ORDINAL_POSTING_INTERNAL_SET_ORD_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ORDINAL_POSTING, $list_alt44, NIL, $list_alt513);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, INITIALIZE, CYBLACK_ORDINAL_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_ORDINAL_POSTING, $list_alt38, $list_alt275, $list_alt516);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_POSTING, PRINT, CYBLACK_ORDINAL_POSTING_PRINT_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list($NONE, makeKeyword("GROUND"), makeKeyword("ACTIVATION-PATTERN"), makeKeyword("SERIALIZED"), makeKeyword("DEACTIVATED"));

    private static final SubLSymbol CYBLACK_POSTING_SUPPORT_TYPE = makeSymbol("CYBLACK-POSTING-SUPPORT-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_POSTING_SUPPORT_TYPE = makeSymbol("ENCODE-CYBLACK-POSTING-SUPPORT-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_POSTING_SUPPORT_TYPE = makeSymbol("DECODE-CYBLACK-POSTING-SUPPORT-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_POSTING_SUPPORT_TYPE_P = makeSymbol("CYBLACK-POSTING-SUPPORT-TYPE-P");



    static private final SubLList $list_alt9 = list(makeSymbol("POSTING-ATTRIBUTES"), makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-SUPPORT"), makeSymbol("CYBLACK-DEPENDENT"));

    static private final SubLList $list_alt10 = list(makeKeyword("EXTENDS"), list(makeSymbol("POSTING-ATTRIBUTES"), makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-SUPPORT"), makeSymbol("CYBLACK-DEPENDENT")));

    static private final SubLList $list_alt11 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION"), list(makeSymbol("EXTERNAL-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-CONTENT"), list(makeSymbol("CONTENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-ATTRIBUTES"), list(makeSymbol("ATTRIBUTES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-CONTENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-ATTRIBUTES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPPORT-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPPORT-TYPE"), list(makeSymbol("NEW-SUPPORT-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOMPUTE-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVALIDATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IMMUTABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IMMUTABLE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-POST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STIMULATION"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING = makeSymbol("CYBLACK-VIRTUAL-POSTING");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");

    static private final SubLList $list_alt14 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt15 = list(new SubLObject[]{ list(makeSymbol("ACTUAL-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION"), list(makeSymbol("EXTERNAL-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-CONTENT"), list(makeSymbol("CONTENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-ATTRIBUTES"), list(makeSymbol("ATTRIBUTES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-CONTENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-ATTRIBUTES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPPORT-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPPORT-TYPE"), list(makeSymbol("NEW-SUPPORT-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOMPUTE-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVALIDATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-POST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STIMULATION"), NIL, makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-POSTING-CLASS");































    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-POSTING-INSTANCE");

    static private final SubLString $str_alt36$__S__S___No_actual_posting_is_ass = makeString("(~S ~S): No actual posting is associated with this virtual posting.");

    private static final SubLSymbol INTERNALIZE_EXTERNAL_REPRESENTATION = makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION");

    static private final SubLList $list_alt38 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt39 = list(makeSymbol("EXTERNAL-REPRESENTATION"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION"), makeSymbol("ACTUAL-POSTING"), makeSymbol("EXTERNAL-REPRESENTATION"))));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    static private final SubLSymbol $sym42$CYBLACK_VIRTUAL_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_METHO = makeSymbol("CYBLACK-VIRTUAL-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD");



    static private final SubLList $list_alt44 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt45 = list(makeSymbol("CONTENT"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("INTERNALIZE-CONTENT")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-INTERNALIZE-CONTENT"), makeSymbol("ACTUAL-POSTING"), makeSymbol("CONTENT"))));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_INTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-INTERNALIZE-CONTENT-METHOD");



    static private final SubLList $list_alt50 = list(makeSymbol("ATTRIBUTES"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("INTERNALIZE-ATTRIBUTES")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-INTERNALIZE-ATTRIBUTES"), makeSymbol("ACTUAL-POSTING"), makeSymbol("ATTRIBUTES"))));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_INTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-INTERNALIZE-ATTRIBUTES-METHOD");

    private static final SubLSymbol EXTERNALIZE_INTERNAL_REPRESENTATION = makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION");

    static private final SubLList $list_alt55 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    static private final SubLSymbol $sym57$CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_METHO = makeSymbol("CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD");

    private static final SubLSymbol EXTERNALIZE_CONTENT = makeSymbol("EXTERNALIZE-CONTENT");

    static private final SubLList $list_alt59 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("EXTERNALIZE-CONTENT")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-EXTERNALIZE-CONTENT"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-CONTENT-METHOD");

    private static final SubLSymbol EXTERNALIZE_ATTRIBUTES = makeSymbol("EXTERNALIZE-ATTRIBUTES");

    static private final SubLList $list_alt63 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("EXTERNALIZE-ATTRIBUTES")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-EXTERNALIZE-ATTRIBUTES"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD");



    static private final SubLList $list_alt67 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-DATATYPE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-DATATYPE-METHOD");



    static private final SubLList $list_alt71 = list(makeSymbol("NEW-DATATYPE"));

    static private final SubLList $list_alt72 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-DATATYPE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-DATATYPE"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-DATATYPE"))));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-DATATYPE-METHOD");



    static private final SubLList $list_alt76 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-PANEL"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_PANEL_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-PANEL-METHOD");



    static private final SubLList $list_alt79 = list(makeSymbol("NEW-PANEL"));

    static private final SubLList $list_alt80 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-PANEL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_PANEL_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-PANEL-METHOD");

    private static final SubLSymbol GET_SUPPORT_TYPE = makeSymbol("GET-SUPPORT-TYPE");

    static private final SubLList $list_alt83 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-SUPPORT-TYPE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-SUPPORT-TYPE"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-SUPPORT-TYPE-METHOD");

    private static final SubLSymbol SET_SUPPORT_TYPE = makeSymbol("SET-SUPPORT-TYPE");

    static private final SubLList $list_alt86 = list(makeSymbol("NEW-SUPPORT-TYPE"));

    static private final SubLList $list_alt87 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-SUPPORT-TYPE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-SUPPORT-TYPE"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-SUPPORT-TYPE"))));

    static private final SubLSymbol $sym88$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-SUPPORT-TYPE-METHOD");



    static private final SubLList $list_alt91 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-ACTIVATION-PATTERN")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-ACTIVATION-PATTERN"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt94 = list(makeSymbol("ACTIVATION-PATTERN"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-ACTIVATION-PATTERN")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-ACTIVATION-PATTERN"), makeSymbol("ACTUAL-POSTING"), makeSymbol("ACTIVATION-PATTERN"))));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt99 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-KSI")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-KSI"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_KSI_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-KSI-METHOD");



    static private final SubLList $list_alt102 = list(makeSymbol("NEW-KSI"));

    static private final SubLList $list_alt103 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-KSI")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-KSI"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-KSI"))));

    static private final SubLSymbol $sym104$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_KSI_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-KSI-METHOD");



    static private final SubLList $list_alt107 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("GET-KSI"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(RET, list(makeSymbol("CYBLACK-KSI-GET-KNOWLEDGE-SOURCE"), makeSymbol("KSI"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_KS_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-KS-METHOD");



    static private final SubLList $list_alt110 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("GET-CONFIDENCE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-GET-CONFIDENCE"), makeSymbol("ACTUAL-POSTING"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_GET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-GET-CONFIDENCE-METHOD");



    static private final SubLList $list_alt113 = list(makeSymbol("NEW-CONFIDENCE"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-CONFIDENCE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-CONFIDENCE"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-CONFIDENCE"))));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-CONFIDENCE-METHOD");



    static private final SubLList $list_alt118 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("RECOMPUTE-CONFIDENCE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_RECOMPUTE_CONFIDENCE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-RECOMPUTE-CONFIDENCE-METHOD");



    static private final SubLList $list_alt122 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("INVALIDATE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-INVALIDATE"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_INVALIDATE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-INVALIDATE-METHOD");



    static private final SubLList $list_alt126 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("VALID-P")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-VALID-P"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_VALID_P_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-VALID-P-METHOD");



    static private final SubLList $list_alt130 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("ACTIVE-P")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_ACTIVE_P_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-ACTIVE-P-METHOD");



    static private final SubLList $list_alt134 = list(makeSymbol("NEW-ACTIVE-STATE"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-ACTIVE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-ACTIVE"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-ACTIVE-STATE"))));

    static private final SubLSymbol $sym136$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-ACTIVE-METHOD");



    static private final SubLList $list_alt139 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("IMMUTABLE-P")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-IMMUTABLE-P"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_IMMUTABLE_P_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-IMMUTABLE-P-METHOD");

    private static final SubLSymbol SET_IMMUTABLE = makeSymbol("SET-IMMUTABLE");

    static private final SubLList $list_alt143 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt144 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("SET-IMMUTABLE")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-SET-IMMUTABLE"), makeSymbol("ACTUAL-POSTING"), makeSymbol("NEW-STATE"))));

    static private final SubLSymbol $sym145$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_SET_IMMUTABLE_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-SET-IMMUTABLE-METHOD");



    static private final SubLList $list_alt148 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("ON-POST")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-ON-POST"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym149$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_ON_POST_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-ON-POST-METHOD");



    static private final SubLList $list_alt152 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("ACTUAL-POSTING"), makeSymbol("*CYBLACK-VIRTUAL-POSTING-ERROR-MSG*"), list(QUOTE, makeSymbol("AFTER-STIMULATION")), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-POSTING-AFTER-STIMULATION"), makeSymbol("ACTUAL-POSTING"))));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_POSTING_AFTER_STIMULATION_METHOD = makeSymbol("CYBLACK-VIRTUAL-POSTING-AFTER-STIMULATION-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING = makeSymbol("CYBLACK-SERIALIZED-POSTING");

    static private final SubLList $list_alt156 = list(new SubLObject[]{ list(makeSymbol("DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATASTORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION"), list(makeSymbol("EXTERNAL-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-CONTENT"), list(makeSymbol("CONTENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-ATTRIBUTES"), list(makeSymbol("ATTRIBUTES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-CONTENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-ATTRIBUTES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPPORT-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPPORT-TYPE"), list(makeSymbol("NEW-SUPPORT-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOMPUTE-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVALIDATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IMMUTABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IMMUTABLE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-POST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STIMULATION"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol DATASTORE = makeSymbol("DATASTORE");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERIALIZED_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERIALIZED-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERIALIZED_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERIALIZED-POSTING-INSTANCE");

    static private final SubLList $list_alt162 = list(list(makeSymbol("IGNORE"), makeSymbol("EXTERNAL-REPRESENTATION")), list(RET, NIL));

    static private final SubLSymbol $sym163$CYBLACK_SERIALIZED_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_ME = makeSymbol("CYBLACK-SERIALIZED-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD");

    static private final SubLList $list_alt164 = list(list(makeSymbol("IGNORE"), makeSymbol("CONTENT")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_INTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-INTERNALIZE-CONTENT-METHOD");

    static private final SubLList $list_alt166 = list(list(makeSymbol("IGNORE"), makeSymbol("ATTRIBUTES")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_INTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-INTERNALIZE-ATTRIBUTES-METHOD");

    static private final SubLList $list_alt168 = list(list(RET, NIL));

    static private final SubLSymbol $sym169$CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_ME = makeSymbol("CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-CONTENT-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD");

    static private final SubLList $list_alt172 = list(list(RET, makeSymbol("DATATYPE")));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-DATATYPE-METHOD");

    static private final SubLList $list_alt174 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("NEW-DATATYPE")), makeString("(SET-DATATYPE ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), makeSymbol("NEW-DATATYPE")));

    static private final SubLSymbol $sym175$OUTER_CATCH_FOR_CYBLACK_SERIALIZED_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERIALIZED-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-DATATYPE-METHOD");

    static private final SubLList $list_alt177 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(RET, list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_PANEL_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_PANEL_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-PANEL-METHOD");

    static private final SubLList $list_alt180 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt181 = list(list(RET, makeKeyword("SERIALIZED")));

    private static final SubLSymbol $SERIALIZED = makeKeyword("SERIALIZED");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-SUPPORT-TYPE-METHOD");

    static private final SubLList $list_alt184 = list(list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("NEW-SUPPORT-TYPE"), makeKeyword("SERIALIZED")), list(makeSymbol("WARN"), makeString("(SET-SUPPORT-TYPE ~S): The support type of this instance is read only and immutable."), makeSymbol("SELF"))), list(RET, makeKeyword("SERIALIZED")));

    static private final SubLString $str_alt185$_SET_SUPPORT_TYPE__S___The_suppor = makeString("(SET-SUPPORT-TYPE ~S): The support type of this instance is read only and immutable.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-SUPPORT-TYPE-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt188 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("WARN"), makeString("(SET-ACTIVATION-PATTERN ~S): The activation pattern of this instance is read only and immutable."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt189$_SET_ACTIVATION_PATTERN__S___The_ = makeString("(SET-ACTIVATION-PATTERN ~S): The activation pattern of this instance is read only and immutable.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_KSI_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-KSI-METHOD");

    static private final SubLList $list_alt192 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-KSI")), list(makeSymbol("WARN"), makeString("(SET-KSI ~S): The knowledge source instantiation associated with this instance is read only and immutable."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt193$_SET_KSI__S___The_knowledge_sourc = makeString("(SET-KSI ~S): The knowledge source instantiation associated with this instance is read only and immutable.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_KSI_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-KSI-METHOD");

    static private final SubLList $list_alt195 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("GET-KSI"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(makeSymbol("CYBLACK-KSI-GET-KNOWLEDGE-SOURCE"), makeSymbol("KSI")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_KS_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-KS-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_GET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-GET-CONFIDENCE-METHOD");

    static private final SubLList $list_alt198 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-CONFIDENCE")), list(makeSymbol("WARN"), makeString("(SET-CONFIDENCE ~S): The confidence rating of this instance is read only and immutable."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt199$_SET_CONFIDENCE__S___The_confiden = makeString("(SET-CONFIDENCE ~S): The confidence rating of this instance is read only and immutable.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-CONFIDENCE-METHOD");

    static private final SubLList $list_alt201 = list(list(RET, list(makeSymbol("GET-CONFIDENCE"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_RECOMPUTE_CONFIDENCE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-RECOMPUTE-CONFIDENCE-METHOD");

    static private final SubLList $list_alt203 = list(list(makeSymbol("WARN"), makeString("(INVALIDATE ~S): Serialized postings cannot be invalidated."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt204$_INVALIDATE__S___Serialized_posti = makeString("(INVALIDATE ~S): Serialized postings cannot be invalidated.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_INVALIDATE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-INVALIDATE-METHOD");

    static private final SubLList $list_alt206 = list(list(RET, T));

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_VALID_P_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-VALID-P-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_ACTIVE_P_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-ACTIVE-P-METHOD");

    static private final SubLList $list_alt209 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ACTIVE-STATE")), list(makeSymbol("WARN"), makeString("(SET-ACTIVE ~S): The active state of a serialized posting cannot be modified."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt210$_SET_ACTIVE__S___The_active_state = makeString("(SET-ACTIVE ~S): The active state of a serialized posting cannot be modified.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-ACTIVE-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_IMMUTABLE_P_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-IMMUTABLE-P-METHOD");

    static private final SubLList $list_alt213 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STATE")), list(makeSymbol("WARN"), makeString("(SET-IMMUTABLE ~S): The immutable state of a serialized posting cannot be modified."), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLString $str_alt214$_SET_IMMUTABLE__S___The_immutable = makeString("(SET-IMMUTABLE ~S): The immutable state of a serialized posting cannot be modified.");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_SET_IMMUTABLE_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-SET-IMMUTABLE-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_ON_POST_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-ON-POST-METHOD");

    private static final SubLSymbol CYBLACK_SERIALIZED_POSTING_AFTER_STIMULATION_METHOD = makeSymbol("CYBLACK-SERIALIZED-POSTING-AFTER-STIMULATION-METHOD");

    static private final SubLString $$$CyBlack_Posting_ID_Counter_Lock = makeString("CyBlack Posting ID Counter Lock");



    static private final SubLList $list_alt220 = list(makeSymbol("POSTING-ATTRIBUTES-TEMPLATE"), makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt221 = list(new SubLObject[]{ list(makeSymbol("PANEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPPORT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVATION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSI"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-VALID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("IMMUTABLE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("INTERNAL-PID"), makeKeyword("INSTANCE"), makeKeyword("ESSENTIAL"), makeKeyword("PUBLIC")), list(makeSymbol("STRINGIFY-GUIDS"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DEPENDENT"), list(makeSymbol("NEW-DEPENDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DEPENDENT"), list(makeSymbol("OLD-DEPENDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DEPENDENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPAGATE-NOTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SUPPORTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION"), list(makeSymbol("EXTERNAL-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-CONTENT"), list(makeSymbol("CONTENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-ATTRIBUTES"), list(makeSymbol("ATTRIBUTES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPPORT-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPPORT-TYPE"), list(makeSymbol("NEW-SUPPORT-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOMPUTE-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVALIDATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-POST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STIMULATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IMMUTABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IMMUTABLE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("ATTRIBUTE-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-POSTING-ATTRIBUTES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-ATTRIBUTE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ATTRIBUTE"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ATTRIBUTE-VALUE"), list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTE-VALUE"), list(makeSymbol("ATTRIBUTE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ATTRIBUTES-FROM-PLIST"), list(makeSymbol("ATTRIBUTE-PLIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTES-AS-PLIST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

















    public static final SubLInteger $int$4099 = makeInteger(4099);

    public static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLSymbol GET_ATTRIBUTES_AS_PLIST = makeSymbol("GET-ATTRIBUTES-AS-PLIST");

    static private final SubLList $list_alt233 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULTS"), NIL), list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("TEMPLATE-KEY"), makeSymbol("TEMPLATE-VALUE"), makeSymbol("TEMPLATE-DICTIONARY")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-KEY"), makeSymbol("TEMPLATE-RESULTS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-VALUE"), makeSymbol("TEMPLATE-RESULTS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-RESULTS")))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_ATTRIBUTES_AS_PLIST_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-ATTRIBUTES-AS-PLIST-METHOD");

    private static final SubLSymbol SET_ATTRIBUTES_FROM_PLIST = makeSymbol("SET-ATTRIBUTES-FROM-PLIST");

    static private final SubLList $list_alt236 = list(makeSymbol("ATTRIBUTE-PLIST"));

    static private final SubLList $list_alt237 = list(list(makeSymbol("CDOPLIST"), list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE-PLIST")), list(makeSymbol("SET-ATTRIBUTE-VALUE"), makeSymbol("SELF"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"))), list(RET, makeSymbol("ATTRIBUTE-PLIST")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_ATTRIBUTES_FROM_PLIST_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-ATTRIBUTES-FROM-PLIST-METHOD");

    private static final SubLSymbol GET_ATTRIBUTE_VALUE = makeSymbol("GET-ATTRIBUTE-VALUE");

    static private final SubLList $list_alt240 = list(makeSymbol("ATTRIBUTE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    static private final SubLList $list_alt241 = list(list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("ATTRIBUTE")), makeString("(GET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-DICTIONARY"), list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("ATTRIBUTE"), makeSymbol("DEFAULT"))), list(RET, makeSymbol("DEFAULT")))));

    static private final SubLString $str_alt242$_GET_ATTRIBUTE_VALUE__S____S_is_n = makeString("(GET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute.");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_ATTRIBUTE_VALUE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-ATTRIBUTE-VALUE-METHOD");

    private static final SubLSymbol SET_ATTRIBUTE_VALUE = makeSymbol("SET-ATTRIBUTE-VALUE");

    static private final SubLList $list_alt245 = list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt246 = list(list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("ATTRIBUTE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("ENUMERATIONS-RETRIEVE-ENUMERATION"), makeSymbol("ATTRIBUTE")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("MUST"), list(makeSymbol("ENUMERATION-MEMBER-P"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of enumeration ~S."), makeSymbol("SELF"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("RANGES-RETRIEVE-RANGE"), makeSymbol("ATTRIBUTE"))), list(makeSymbol("MUST"), list(makeSymbol("RANGE-MEMBER-P"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of interval ~S."), makeSymbol("SELF"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("SET-DICTIONARY"), makeSymbol("SELF"), makeSymbol("TEMPLATE-DICTIONARY"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), list(RET, makeSymbol("VALUE"))));

    static private final SubLString $str_alt247$_SET_ATTRIBUTE_VALUE__S____S_is_n = makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute.");

    static private final SubLString $str_alt248$_SET_ATTRIBUTE_VALUE__S____S_is_n = makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of enumeration ~S.");

    static private final SubLString $str_alt249$_SET_ATTRIBUTE_VALUE__S____S_is_n = makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of interval ~S.");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_ATTRIBUTE_VALUE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-ATTRIBUTE-VALUE-METHOD");

    private static final SubLSymbol ADD_ATTRIBUTE = makeSymbol("ADD-ATTRIBUTE");

    static private final SubLList $list_alt252 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ATTRIBUTE"), NIL));

    static private final SubLList $list_alt253 = list(list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("NEW-ATTRIBUTE")), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("NEW-ATTRIBUTE")), makeString("(ADD-ATTRIBUTE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("NEW-ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("SET-DICTIONARY"), makeSymbol("SELF"), makeSymbol("TEMPLATE-DICTIONARY"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("NEW-ATTRIBUTE"), NIL), list(RET, makeSymbol("NEW-ATTRIBUTE"))));

    static private final SubLString $str_alt254$_ADD_ATTRIBUTE__S____S_is_not_a_v = makeString("(ADD-ATTRIBUTE ~S): ~S is not a valid posting attribute.");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ADD_ATTRIBUTE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ADD-ATTRIBUTE-METHOD");

    private static final SubLSymbol GET_ATTRIBUTES = makeSymbol("GET-ATTRIBUTES");

    static private final SubLList $list_alt257 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-DICTIONARY"), list(RET, list(makeSymbol("DICTIONARY-KEYS"), makeSymbol("TEMPLATE-DICTIONARY"))), list(RET, NIL))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-ATTRIBUTES-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-CLASS");







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-INSTANCE");

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING = makeSymbol("CYBLACK-EXTERNAL-POSTING");

    static private final SubLList $list_alt265 = list(new SubLObject[]{ list(makeSymbol("EXTERNAL-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-POSTING"), list(makeSymbol("NEW-EXTERNAL-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOMPUTE-CONFIDENCE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVALIDATE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALID"), list(makeSymbol("NEW-VALIDATION"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-POSTING-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-POSTING-INSTANCE");



    static private final SubLList $list_alt270 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt271 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUPPORT-TYPE"), $NONE), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSI"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("IS-VALID"), T), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE"), T), list(makeSymbol("CSETQ"), makeSymbol("IMMUTABLE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-PID"), list(makeSymbol("CYBLACK-BASIC-POSTING-ALLOCATE-POSTING-ID"))), list(makeSymbol("CSETQ"), makeSymbol("STRINGIFY-GUIDS"), NIL), list(makeSymbol("INITIALIZE-QUA-POSTING-ATTRIBUTES"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-REGISTER-POSTING"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")) });



    private static final SubLSymbol CYBLACK_BASIC_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt275 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt276 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<POSTING OF DATATYPE ~S:~S>"), makeSymbol("DATATYPE"), makeSymbol("INSTANCE-NUMBER")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym277$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    static private final SubLString $str_alt278$__POSTING_OF_DATATYPE__S__S_ = makeString("#<POSTING OF DATATYPE ~S:~S>");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-PRINT-METHOD");



    static private final SubLList $list_alt281 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTED-SLOTS"), NIL), list(makeSymbol("KEYWORD-PACKAGE"), list(makeSymbol("SYMBOL-PACKAGE"), $TEST)), list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("STRINGIFY-GUIDS"), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-VALUE"), NIL)), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"))), list(makeSymbol("PWHEN"), list(makeSymbol("GUID-P"), makeSymbol("SLOT-VALUE")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("SLOT-VALUE")))), list(makeSymbol("CPUSH"), makeSymbol("SLOT-VALUE"), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME"))), list(makeSymbol("PWHEN"), list(makeSymbol("GUID-P"), makeSymbol("SLOT-VALUE")), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("SLOT-VALUE")))), list(makeSymbol("CPUSH"), makeSymbol("SLOT-VALUE"), makeSymbol("LISTED-SLOTS"))))), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))), list(makeSymbol("CDO-ESSENTIAL-SLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT-NAME")), makeSymbol("KEYWORD-PACKAGE")), makeSymbol("LISTED-SLOTS")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-NAME")), makeSymbol("LISTED-SLOTS"))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LISTED-SLOTS")))));

    static private final SubLSymbol $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_POSTING_PLISTIFY_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-PLISTIFY-METHOD");

    private static final SubLSymbol ADD_DEPENDENT = makeSymbol("ADD-DEPENDENT");

    static private final SubLList $list_alt286 = list(makeSymbol("NEW-DEPENDENT"));

    static private final SubLList $list_alt287 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("ADD-DEPENDENT"), makeSymbol("SUPER"), makeSymbol("NEW-DEPENDENT"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ADD_DEPENDENT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ADD-DEPENDENT-METHOD");



    static private final SubLList $list_alt290 = list(makeSymbol("OLD-DEPENDENT"));

    static private final SubLList $list_alt291 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE-DEPENDENT"), makeSymbol("SUPER"), makeSymbol("OLD-DEPENDENT"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_REMOVE_DEPENDENT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-REMOVE-DEPENDENT-METHOD");



    static private final SubLList $list_alt294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE-ALL-DEPENDENTS"), makeSymbol("SUPER"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_REMOVE_ALL_DEPENDENTS_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-REMOVE-ALL-DEPENDENTS-METHOD");



    static private final SubLList $list_alt297 = list(makeSymbol("SUPPORT"));

    static private final SubLList $list_alt298 = list(list(makeSymbol("ADD-SUPPORT-NOTIFY"), makeSymbol("SUPER"), makeSymbol("SUPPORT")), list(makeSymbol("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ADD_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ADD-SUPPORT-NOTIFY-METHOD");



    static private final SubLList $list_alt301 = list(list(makeSymbol("REMOVE-SUPPORT-NOTIFY"), makeSymbol("SUPER"), makeSymbol("SUPPORT")), list(makeSymbol("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE"), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), list(makeSymbol("VALID-P"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-DEPENDENTS"), list(makeSymbol("GET-ALL-DEPENDENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("DEPENDENT"), makeSymbol("ALL-DEPENDENTS")), list(makeSymbol("REMOVE-DEPENDENT"), makeSymbol("SELF"), makeSymbol("DEPENDENT"))))), list(RET, makeSymbol("SUPPORT")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_REMOVE_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-REMOVE-SUPPORT-NOTIFY-METHOD");

    private static final SubLSymbol REMOVE_ALL_SUPPORTS = makeSymbol("REMOVE-ALL-SUPPORTS");

    static private final SubLList $list_alt304 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("REMOVE-ALL-SUPPORTS"), makeSymbol("SUPER"))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_REMOVE_ALL_SUPPORTS_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-REMOVE-ALL-SUPPORTS-METHOD");

    static private final SubLList $list_alt306 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("LISTP"), makeSymbol("EXTERNAL-REPRESENTATION")), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("EXTERNAL-REPRESENTATION")), FOUR_INTEGER)), makeString("(INTERNALIZE-EXTERNAL-REPRESENTATION ~S): ~S is not a valid posting external representation."), makeSymbol("SELF"), makeSymbol("EXTERNAL-REPRESENTATION")), list(makeSymbol("CLET"), list(list(makeSymbol("CONTENT-REPRESENTATION"), list(makeSymbol("GETF"), makeSymbol("EXTERNAL-REPRESENTATION"), makeKeyword("CONTENT"))), list(makeSymbol("ATTRIBUTE-REPRESENTATION"), list(makeSymbol("GETF"), makeSymbol("EXTERNAL-REPRESENTATION"), makeKeyword("ATTRIBUTES")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INTERNALIZE-CONTENT")), makeSymbol("CONTENT-REPRESENTATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INTERNALIZE-ATTRIBUTES")), makeSymbol("ATTRIBUTE-REPRESENTATION")), list(RET, makeSymbol("SELF"))));





    private static final SubLSymbol CYBLACK_BASIC_POSTING_INTERNALIZE_EXTERNAL_REPRESENTATION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION-METHOD");

    static private final SubLList $list_alt310 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ASSIMILATE")), makeSymbol("CONTENT")), list(RET, makeSymbol("CONTENT")));



    private static final SubLSymbol CYBLACK_BASIC_POSTING_INTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INTERNALIZE-CONTENT-METHOD");

    static private final SubLList $list_alt313 = list(list(makeSymbol("SET-ATTRIBUTES-FROM-PLIST"), makeSymbol("SELF"), makeSymbol("ATTRIBUTES")), list(RET, makeSymbol("ATTRIBUTES")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_INTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INTERNALIZE-ATTRIBUTES-METHOD");

    static private final SubLList $list_alt315 = list(list(RET, list(makeSymbol("LIST"), makeKeyword("CONTENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXTERNALIZE-CONTENT"))), makeKeyword("ATTRIBUTES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXTERNALIZE-ATTRIBUTES"))))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_EXTERNALIZE_INTERNAL_REPRESENTATION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION-METHOD");

    static private final SubLList $list_alt317 = list(list(RET, list(makeSymbol("PLISTIFY"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_EXTERNALIZE_CONTENT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-EXTERNALIZE-CONTENT-METHOD");

    static private final SubLList $list_alt319 = list(list(RET, list(makeSymbol("GET-ATTRIBUTES-AS-PLIST"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_EXTERNALIZE_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-EXTERNALIZE-ATTRIBUTES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-DATATYPE-METHOD");

    static private final SubLList $list_alt322 = list(list(RET, makeSymbol("PANEL")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-PANEL-METHOD");

    static private final SubLList $list_alt324 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PANEL")), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-PANEL"))), makeString("(SET-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), makeSymbol("NEW-PANEL")), list(RET, makeSymbol("NEW-PANEL")));

    static private final SubLSymbol $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-PANEL-METHOD");

    static private final SubLList $list_alt327 = list(list(RET, makeSymbol("SUPPORT-TYPE")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-SUPPORT-TYPE-METHOD");

    static private final SubLList $list_alt329 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-SUPPORT-TYPE-P"), makeSymbol("NEW-SUPPORT-TYPE")), makeString("(SET-SUPPORT-TYPE ~S): ~S is not a member of the CYBLACK-POSTING-SUPPORT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-SUPPORT-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("SUPPORT-TYPE"), makeSymbol("NEW-SUPPORT-TYPE")), list(RET, makeSymbol("NEW-SUPPORT-TYPE")));

    static private final SubLSymbol $sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_SUPPORT_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-SUPPORT-TYPE-METHOD");

    static private final SubLList $list_alt332 = list(list(RET, makeSymbol("ACTIVATION-PATTERN")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt334 = list(makeSymbol("NEW-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt335 = list(list(makeSymbol("PIF"), makeSymbol("NEW-ACTIVATION-PATTERN"), list(makeSymbol("CSETQ"), makeSymbol("SUPPORT-TYPE"), makeKeyword("ACTIVATION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("SUPPORT-TYPE"), $NONE)), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE"), makeSymbol("SELF")), list(RET, makeSymbol("ACTIVATION-PATTERN")));

    static private final SubLSymbol $sym336$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol $ACTIVATION_PATTERN = makeKeyword("ACTIVATION-PATTERN");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt339 = list(list(RET, makeSymbol("KSI")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_KSI_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-KSI-METHOD");

    static private final SubLList $list_alt341 = list(list(makeSymbol("CSETQ"), makeSymbol("KSI"), makeSymbol("NEW-KSI")), list(makeSymbol("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE"), makeSymbol("SELF")), list(RET, makeSymbol("KSI")));

    static private final SubLSymbol $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_KSI_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-KSI-METHOD");

    static private final SubLList $list_alt344 = list(list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(RET, list(makeSymbol("CYBLACK-KSI-GET-KNOWLEDGE-SOURCE"), makeSymbol("KSI")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_KS_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-KS-METHOD");

    static private final SubLList $list_alt346 = list(list(RET, makeSymbol("CONFIDENCE")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-CONFIDENCE-METHOD");

    static private final SubLSymbol $sym348$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_RECOMPUTE_CONFIDENCE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-RECOMPUTE-CONFIDENCE-METHOD");

    static private final SubLList $list_alt350 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-VALID"), NIL), list(makeSymbol("REMOVE-ALL-DEPENDENTS"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym351$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_INVALIDATE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INVALIDATE-METHOD");

    static private final SubLList $list_alt353 = list(list(RET, makeSymbol("IS-VALID")));

    static private final SubLSymbol $sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VALID_P_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VALID-P-METHOD");

    static private final SubLList $list_alt356 = list(list(RET, makeSymbol("ACTIVE")));

    static private final SubLSymbol $sym357$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ACTIVE_P_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ACTIVE-P-METHOD");

    static private final SubLList $list_alt359 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(EQ, makeSymbol("NEW-ACTIVE-STATE"), T), list(EQ, makeSymbol("NEW-ACTIVE-STATE"), NIL)), makeString("(SET-ACTIVE ~S): Active state cyblack-must be T or NIL.  ~S is not a boolean value."), makeSymbol("SELF"), makeSymbol("NEW-ACTIVE-STATE")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE"), makeSymbol("NEW-ACTIVE-STATE")), list(makeSymbol("CLET"), list(list(makeSymbol("MY-PANEL"), list(makeSymbol("GET-PANEL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("MY-PANEL"), list(makeSymbol("PIF"), makeSymbol("NEW-ACTIVE-STATE"), list(makeSymbol("CYBLACK-PANEL-ACTIVATE-POSTING"), makeSymbol("MY-PANEL"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-PANEL-DEACTIVATE-POSTING"), makeSymbol("MY-PANEL"), makeSymbol("SELF"))))), list(RET, makeSymbol("NEW-ACTIVE-STATE")));

    static private final SubLSymbol $sym360$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-ACTIVE-METHOD");

    static private final SubLList $list_alt362 = list(list(RET, makeSymbol("IMMUTABLE")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_IMMUTABLE_P_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-IMMUTABLE-P-METHOD");

    static private final SubLList $list_alt364 = list(list(makeSymbol("CSETQ"), makeSymbol("IMMUTABLE"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(RET, makeSymbol("IMMUTABLE")));

    static private final SubLSymbol $sym365$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_IMMUTABLE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-IMMUTABLE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ON_POST_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ON-POST-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_AFTER_STIMULATION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-AFTER-STIMULATION-METHOD");

    static private final SubLList $list_alt369 = list(list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), makeSymbol("NEW-DATATYPE")), list(RET, makeSymbol("DATATYPE")));

    static private final SubLSymbol $sym370$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-DATATYPE-METHOD");

    static private final SubLList $list_alt372 = list(list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE"), makeSymbol("NEW-CONFIDENCE")), list(RET, makeSymbol("CONFIDENCE")));

    static private final SubLSymbol $sym373$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-CONFIDENCE-METHOD");



    static private final SubLList $list_alt376 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ON-STARTUP-METHOD");



    static private final SubLList $list_alt379 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-ON-SHUTDOWN-METHOD");

    private static final SubLSymbol INITIALIZE_QUA_POSTING_ATTRIBUTES = makeSymbol("INITIALIZE-QUA-POSTING-ATTRIBUTES");

    static private final SubLList $list_alt382 = list(list(makeSymbol("CSETQ"), makeSymbol("ATTRIBUTE-DICTIONARY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_INITIALIZE_QUA_POSTING_ATTRIBUTES_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-INITIALIZE-QUA-POSTING-ATTRIBUTES-METHOD");



    static private final SubLList $list_alt386 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt387 = list(list(RET, makeSymbol("ATTRIBUTE-DICTIONARY")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_GET_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-GET-DICTIONARY-METHOD");



    static private final SubLList $list_alt390 = list(makeSymbol("NEW-DICTIONARY"));

    static private final SubLList $list_alt391 = list(list(makeSymbol("CSETQ"), makeSymbol("ATTRIBUTE-DICTIONARY"), makeSymbol("NEW-DICTIONARY")), list(RET, makeSymbol("NEW-DICTIONARY")));

    static private final SubLSymbol $sym392$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_SET_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-SET-DICTIONARY-METHOD");

    private static final SubLSymbol GET_EXTERNAL_POSTING = makeSymbol("GET-EXTERNAL-POSTING");

    static private final SubLList $list_alt395 = list(list(RET, makeSymbol("EXTERNAL-POSTING")));

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_GET_EXTERNAL_POSTING_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-GET-EXTERNAL-POSTING-METHOD");

    private static final SubLSymbol SET_EXTERNAL_POSTING = makeSymbol("SET-EXTERNAL-POSTING");

    static private final SubLList $list_alt398 = list(makeSymbol("NEW-EXTERNAL-POSTING"));

    static private final SubLList $list_alt399 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("EXTERNAL-POSTING-P"), makeSymbol("NEW-EXTERNAL-POSTING")), makeString("(SET-EXTERNAL-POSTING ~S): ~S is not a legal external posting."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-POSTING"), makeSymbol("NEW-EXTERNAL-POSTING")), list(RET, makeSymbol("NEW-EXTERNAL-POSTING")));

    static private final SubLSymbol $sym400$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_SET_EXTERNAL_POSTING_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-SET-EXTERNAL-POSTING-METHOD");

    static private final SubLList $list_alt402 = list(list(RET, list(makeSymbol("SET-CONFIDENCE"), makeSymbol("SUPER"), makeSymbol("NEW-CONFIDENCE"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_SET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-SET-CONFIDENCE-METHOD");

    static private final SubLList $list_alt404 = list(list(RET, list(makeSymbol("GET-CONFIDENCE"), makeSymbol("SUPER"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_GET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-GET-CONFIDENCE-METHOD");

    static private final SubLList $list_alt406 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-CONFIDENCE"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-POSTING"), list(makeSymbol("CSETQ"), makeSymbol("NEW-CONFIDENCE"), list(makeSymbol("EP-RECOMPUTE-CONFIDENCE"), makeSymbol("EXTERNAL-POSTING"), list(makeSymbol("GET-ALL-SUPPORTS"), makeSymbol("SELF")))), list(RET, makeSymbol("NEW-CONFIDENCE"))), list(RET, list(makeSymbol("GET-CONFIDENCE"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_RECOMPUTE_CONFIDENCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-RECOMPUTE-CONFIDENCE-METHOD");

    static private final SubLList $list_alt408 = list(list(makeSymbol("PIF"), makeSymbol("EXTERNAL-POSTING"), list(makeSymbol("PROGN"), list(makeSymbol("EP-INVALIDATE"), makeSymbol("EXTERNAL-POSTING"), list(makeSymbol("GET-ALL-DEPENDENTS"), makeSymbol("SELF"))), list(makeSymbol("REMOVE-ALL-DEPENDENTS"), makeSymbol("SELF"))), list(makeSymbol("INVALIDATE"), makeSymbol("SUPER"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_INVALIDATE_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-INVALIDATE-METHOD");

    private static final SubLSymbol SET_VALID = makeSymbol("SET-VALID");

    static private final SubLList $list_alt411 = list(makeSymbol("NEW-VALIDATION"));

    static private final SubLList $list_alt412 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-VALID"), makeSymbol("NEW-VALIDATION")), list(RET, makeSymbol("NEW-VALIDATION")));

    static private final SubLSymbol $sym413$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_SET_VALID_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-SET-VALID-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_POSTING_VALID_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-POSTING-VALID-P-METHOD");

    private static final SubLSymbol EXTERNAL_POSTING_P = makeSymbol("EXTERNAL-POSTING-P");

    static private final SubLList $list_alt417 = list(makeSymbol("CYBLACK-EXTERNAL-POSTING"), makeSymbol("INTERNALS"), makeSymbol("RECOMPUTE-CONFIDENCE-FUNCTION"), makeSymbol("INVALIDATE-FUNCTION"));

    static private final SubLList $list_alt418 = list(makeKeyword("CYBLACK-EXTERNAL-POSTING"), makeKeyword("INTERNALS"), makeKeyword("RECOMPUTE-CONFIDENCE-FUNCTION"), makeKeyword("INVALIDATE-FUNCTION"));

    static private final SubLList $list_alt419 = list(makeSymbol("EP-CYBLACK-EXTERNAL-POSTING"), makeSymbol("EP-INTERNALS"), makeSymbol("EP-RECOMPUTE-CONFIDENCE-FUNCTION"), makeSymbol("EP-INVALIDATE-FUNCTION"));

    static private final SubLList $list_alt420 = list(makeSymbol("_CSETF-EP-CYBLACK-EXTERNAL-POSTING"), makeSymbol("_CSETF-EP-INTERNALS"), makeSymbol("_CSETF-EP-RECOMPUTE-CONFIDENCE-FUNCTION"), makeSymbol("_CSETF-EP-INVALIDATE-FUNCTION"));



    private static final SubLSymbol EXTERNAL_POSTING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-POSTING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EP_CYBLACK_EXTERNAL_POSTING = makeSymbol("EP-CYBLACK-EXTERNAL-POSTING");

    public static final SubLSymbol _CSETF_EP_CYBLACK_EXTERNAL_POSTING = makeSymbol("_CSETF-EP-CYBLACK-EXTERNAL-POSTING");

    private static final SubLSymbol EP_INTERNALS = makeSymbol("EP-INTERNALS");

    public static final SubLSymbol _CSETF_EP_INTERNALS = makeSymbol("_CSETF-EP-INTERNALS");

    private static final SubLSymbol EP_RECOMPUTE_CONFIDENCE_FUNCTION = makeSymbol("EP-RECOMPUTE-CONFIDENCE-FUNCTION");

    public static final SubLSymbol _CSETF_EP_RECOMPUTE_CONFIDENCE_FUNCTION = makeSymbol("_CSETF-EP-RECOMPUTE-CONFIDENCE-FUNCTION");

    private static final SubLSymbol EP_INVALIDATE_FUNCTION = makeSymbol("EP-INVALIDATE-FUNCTION");

    public static final SubLSymbol _CSETF_EP_INVALIDATE_FUNCTION = makeSymbol("_CSETF-EP-INVALIDATE-FUNCTION");

    private static final SubLSymbol $CYBLACK_EXTERNAL_POSTING = makeKeyword("CYBLACK-EXTERNAL-POSTING");

    private static final SubLSymbol $INTERNALS = makeKeyword("INTERNALS");

    private static final SubLSymbol $RECOMPUTE_CONFIDENCE_FUNCTION = makeKeyword("RECOMPUTE-CONFIDENCE-FUNCTION");

    private static final SubLSymbol $INVALIDATE_FUNCTION = makeKeyword("INVALIDATE-FUNCTION");

    static private final SubLString $str_alt435$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt436 = list(makeSymbol("EP"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $$$ep = makeString("ep");

    private static final SubLSymbol EP_ = makeSymbol("EP-");

    static private final SubLString $$$cep = makeString("cep");



    private static final SubLSymbol WITH_CYBLACK_BASIC_LOCKABLE = makeSymbol("WITH-CYBLACK-BASIC-LOCKABLE");

    static private final SubLList $list_alt442 = list(makeSymbol("CONFIDENCE-FUNCTION-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    static private final SubLList $list_alt444 = list(makeSymbol("INVALIDATE-FUNCTION-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CYBLACK_POSTING_VISITOR = makeSymbol("CYBLACK-POSTING-VISITOR");

    static private final SubLList $list_alt446 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt447 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt448 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR");

    static private final SubLList $list_alt450 = list(makeSymbol("CYBLACK-POSTING-VISITOR"));

    static private final SubLList $list_alt451 = list(list(makeSymbol("CONTINUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_VISITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-VISITOR-CLASS");

    static private final SubLSymbol $sym454$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_VISITOR_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-VISITOR-INSTANCE");

    static private final SubLList $list_alt455 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTINUE"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym456$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt459 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-POSTING"), list(makeSymbol("CLONE"), makeSymbol("SUPER")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("CONTINUE")), makeSymbol("CONTINUE")), list(RET, makeSymbol("NEW-POSTING"))));

    static private final SubLSymbol $sym460$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_CLONE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-CLONE-METHOD");



    static private final SubLList $list_alt463 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE")));

    static private final SubLList $list_alt464 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STATE")), list(makeSymbol("SET-APPLICATION"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-SET-INITIAL-STATE-METHOD");



    static private final SubLList $list_alt467 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(VISIT ~S ~S)"), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING")), list(RET, makeSymbol("CYBLACK-POSTING")));

    static private final SubLString $str_alt468$___VISIT__S__S_ = makeString("~%(VISIT ~S ~S)");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-VISIT-METHOD");



    static private final SubLList $list_alt471 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-POSTING"), NIL));

    static private final SubLList $list_alt472 = list(list(makeSymbol("IGNORE"), makeSymbol("CYBLACK-POSTING")), list(RET, makeSymbol("CONTINUE")));

    static private final SubLSymbol $sym473$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_CONTINUE_P_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-CONTINUE-P-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR-GET-FINAL-STATE-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_COLLECTOR = makeSymbol("CYBLACK-POSTING-COLLECTOR");

    static private final SubLList $list_alt478 = list(list(makeSymbol("COLLECTED-POSTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_COLLECTOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-COLLECTOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_COLLECTOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-COLLECTOR-INSTANCE");

    static private final SubLList $list_alt482 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTED-POSTINGS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym483$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-COLLECTOR-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_COLLECTOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-POSTING-COLLECTOR-INITIALIZE-METHOD");

    static private final SubLList $list_alt485 = list(list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTED-POSTINGS"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym486$OUTER_CATCH_FOR_CYBLACK_POSTING_COLLECTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-COLLECTOR-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_COLLECTOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-POSTING-COLLECTOR-SET-INITIAL-STATE-METHOD");

    static private final SubLList $list_alt488 = list(makeKeyword("NO-INSTANCE-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt489 = list(list(makeSymbol("SET-CYBLACK-POSTING-COLLECTOR-COLLECTED-POSTINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("CYBLACK-POSTING"), list(makeSymbol("GET-CYBLACK-POSTING-COLLECTOR-COLLECTED-POSTINGS"), makeSymbol("SELF")))), list(RET, makeSymbol("CYBLACK-POSTING")));

    private static final SubLSymbol CYBLACK_POSTING_COLLECTOR_VISIT_METHOD = makeSymbol("CYBLACK-POSTING-COLLECTOR-VISIT-METHOD");

    static private final SubLList $list_alt491 = list(list(RET, list(makeSymbol("REVERSE"), makeSymbol("COLLECTED-POSTINGS"))));

    private static final SubLSymbol CYBLACK_POSTING_COLLECTOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-POSTING-COLLECTOR-GET-FINAL-STATE-METHOD");



    static private final SubLList $list_alt494 = list(makeSymbol("CYBLACK-ORDINAL-TEMPLATE"));

    static private final SubLList $list_alt495 = list(list(makeSymbol("ORD"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-ORD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-ORD"), list(makeSymbol("NEW-ORD")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ORD"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ORD"), list(makeSymbol("NEW-ORD")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SET_ORD = makeSymbol("SET-ORD");

    static private final SubLList $list_alt498 = list(makeSymbol("NEW-ORD"));

    static private final SubLList $list_alt499 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ORD")), list(makeSymbol(">="), makeSymbol("NEW-ORD"), ZERO_INTEGER)), makeString("(SET-ORD ~S): Ordinal values must be non-negative integers.  ~S is not a non-negative integer."), makeSymbol("SELF"), makeSymbol("NEW-ORD")), list(makeSymbol("INTERNAL-SET-ORD"), makeSymbol("SELF"), makeSymbol("NEW-ORD")), list(RET, makeSymbol("NEW-ORD")));

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_SET_ORD_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-SET-ORD-METHOD");



    static private final SubLList $list_alt502 = list(list(RET, list(makeSymbol("INTERNAL-GET-ORD"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_GET_ORD_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-GET-ORD-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-POSTING-INSTANCE");

    private static final SubLSymbol INTERNAL_GET_ORD = makeSymbol("INTERNAL-GET-ORD");

    static private final SubLList $list_alt507 = list(list(RET, makeSymbol("ORD")));

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_INTERNAL_GET_ORD_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-INTERNAL-GET-ORD-METHOD");

    private static final SubLSymbol INTERNAL_SET_ORD = makeSymbol("INTERNAL-SET-ORD");

    static private final SubLList $list_alt510 = list(list(makeSymbol("CSETQ"), makeSymbol("ORD"), makeSymbol("NEW-ORD")), list(RET, makeSymbol("NEW-ORD")));

    static private final SubLSymbol $sym511$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_INTERNAL_SET_ORD_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-INTERNAL-SET-ORD-METHOD");

    static private final SubLList $list_alt513 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ORD"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym514$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-INITIALIZE-METHOD");

    static private final SubLList $list_alt516 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<ORDINAL POSTING (~S) OF DATATYPE ~S:~S>"), makeSymbol("ORD"), makeSymbol("DATATYPE"), makeSymbol("INSTANCE-NUMBER")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym517$OUTER_CATCH_FOR_CYBLACK_ORDINAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-POSTING-METHOD");

    static private final SubLString $str_alt518$__ORDINAL_POSTING___S__OF_DATATYP = makeString("#<ORDINAL POSTING (~S) OF DATATYPE ~S:~S>");

    private static final SubLSymbol CYBLACK_ORDINAL_POSTING_PRINT_METHOD = makeSymbol("CYBLACK-ORDINAL-POSTING-PRINT-METHOD");

    static private final SubLString $str_alt520$CYBLACK_POSTING_VISITOR_SET_INITI = makeString("CYBLACK-POSTING-VISITOR-SET-INITIAL-STATE: ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt521$CYBLACK_POSTING_VISITOR_VISIT___S = makeString("CYBLACK-POSTING-VISITOR-VISIT: ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt522$CYBLACK_POSTING_VISITOR_CONTINUE_ = makeString("CYBLACK-POSTING-VISITOR-CONTINUE-P: ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt523$CYBLACK_POSTING_VISITOR_GET_FINAL = makeString("CYBLACK-POSTING-VISITOR-GET-FINAL-STATE: ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_posting_file();
    }

    public void initializeVariables() {
        init_cyblack_posting_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_posting_file();
    }
}

