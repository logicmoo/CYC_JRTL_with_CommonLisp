/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-KSI
 *  source file: /cyc/top/cycl/cyblack/cyblack-ksi.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_ksi extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ksi() {
    }

    public static final SubLFile me = new cyblack_ksi();


    // // Definitions
    public static final SubLObject cyblack_knowledge_source_instantiation_p(SubLObject cyblack_knowledge_source_instantiation) {
        return interfaces.subloop_instanceof_interface(cyblack_knowledge_source_instantiation, CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION);
    }

    public static final class $external_knowledge_source_instantiation_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_ksi.$external_knowledge_source_instantiation_native.structDecl;
        }

        public SubLObject getField2() {
            return $lock;
        }

        public SubLObject getField3() {
            return $internals;
        }

        public SubLObject getField4() {
            return $cyblack_application;
        }

        public SubLObject getField5() {
            return $activation_pattern;
        }

        public SubLObject getField6() {
            return $postings;
        }

        public SubLObject getField7() {
            return $execution_function;
        }

        public SubLObject setField2(SubLObject value) {
            return $lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $internals = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $cyblack_application = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $activation_pattern = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $postings = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $execution_function = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $internals = Lisp.NIL;

        public SubLObject $cyblack_application = Lisp.NIL;

        public SubLObject $activation_pattern = Lisp.NIL;

        public SubLObject $postings = Lisp.NIL;

        public SubLObject $execution_function = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_ksi.$external_knowledge_source_instantiation_native.class, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P, $list_alt6, $list_alt7, new String[]{ "$lock", "$internals", "$cyblack_application", "$activation_pattern", "$postings", "$execution_function" }, $list_alt8, $list_alt9, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_knowledge_source_instantiation$ = makeSymbol("*DTP-EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION*");

    public static final SubLObject external_knowledge_source_instantiation_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_knowledge_source_instantiation_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_ksi.$external_knowledge_source_instantiation_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_knowledge_source_instantiation_p$UnaryFunction extends UnaryFunction {
        public $external_knowledge_source_instantiation_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_knowledge_source_instantiation_p(arg1);
        }
    }

    public static final SubLObject eksi_lock(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField2();
    }

    public static final SubLObject eksi_internals(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField3();
    }

    public static final SubLObject eksi_cyblack_application(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField4();
    }

    public static final SubLObject eksi_activation_pattern(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField5();
    }

    public static final SubLObject eksi_postings(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField6();
    }

    public static final SubLObject eksi_execution_function(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.getField7();
    }

    public static final SubLObject _csetf_eksi_lock(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_eksi_internals(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_eksi_cyblack_application(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_eksi_activation_pattern(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_eksi_postings(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_eksi_execution_function(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P);
        return v_object.setField7(value);
    }

    public static final SubLObject make_external_knowledge_source_instantiation(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_ksi.$external_knowledge_source_instantiation_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_eksi_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($INTERNALS)) {
                            _csetf_eksi_internals(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYBLACK_APPLICATION)) {
                                _csetf_eksi_cyblack_application(v_new, current_value);
                            } else
                                if (pcase_var.eql($ACTIVATION_PATTERN)) {
                                    _csetf_eksi_activation_pattern(v_new, current_value);
                                } else
                                    if (pcase_var.eql($POSTINGS)) {
                                        _csetf_eksi_postings(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($EXECUTION_FUNCTION)) {
                                            _csetf_eksi_execution_function(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                                        }





                }
            }
            return v_new;
        }
    }

    public static final SubLObject with_eksi_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eksi = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            eksi = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eksi_var = make_symbol($$$eksi);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eksi_var, eksi, EKSI, $list_alt6, forms, UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_eksi_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eksi = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            eksi = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eksi_var = make_symbol($$$eksi);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eksi_var, eksi, EKSI, $list_alt6, forms, NIL);
            }
        }
    }

    public static final SubLObject with_locked_eksi(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eksi = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            eksi = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eksi_var = make_symbol($$$eksi);
                return list(CLET, list(list(eksi_var, eksi)), listS(WITH_LOCK_HELD, list(list(EKSI_LOCK, eksi_var)), forms));
            }
        }
    }

    public static final SubLObject with_locked_eksi_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eksi = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            eksi = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eksi_var = make_symbol($$$eksi);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eksi_var, eksi, EKSI, $list_alt6, listS(WITH_LOCK_HELD, $list_alt36, forms), UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_locked_eksi_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eksi = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            eksi = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eksi_var = make_symbol($$$eksi);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eksi_var, eksi, EKSI, $list_alt6, listS(WITH_LOCK_HELD, $list_alt36, forms), NIL);
            }
        }
    }

    public static final SubLObject get_cyblack_basic_ksi_execution_mode(SubLObject cyblack_basic_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ksi, FIVE_INTEGER, EXECUTION_MODE);
    }

    public static final SubLObject set_cyblack_basic_ksi_execution_mode(SubLObject cyblack_basic_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ksi, value, FIVE_INTEGER, EXECUTION_MODE);
    }

    public static final SubLObject get_cyblack_basic_ksi_knowledge_source(SubLObject cyblack_basic_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ksi, FOUR_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject set_cyblack_basic_ksi_knowledge_source(SubLObject cyblack_basic_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ksi, value, FOUR_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject get_cyblack_basic_ksi_activation_pattern(SubLObject cyblack_basic_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ksi, THREE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject set_cyblack_basic_ksi_activation_pattern(SubLObject cyblack_basic_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ksi, value, THREE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_ksi_p(SubLObject cyblack_basic_ksi) {
        return classes.subloop_instanceof_class(cyblack_basic_ksi, CYBLACK_BASIC_KSI);
    }

    public static final SubLObject cyblack_basic_ksi_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_ksi_method = NIL;
            SubLObject execution_mode = get_cyblack_basic_ksi_execution_mode(self);
            SubLObject knowledge_source = get_cyblack_basic_ksi_knowledge_source(self);
            SubLObject activation_pattern = get_cyblack_basic_ksi_activation_pattern(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    activation_pattern = NIL;
                    knowledge_source = NIL;
                    execution_mode = $SYNCHRONOUS;
                    sublisp_throw($sym55$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ksi_execution_mode(self, execution_mode);
                            set_cyblack_basic_ksi_knowledge_source(self, knowledge_source);
                            set_cyblack_basic_ksi_activation_pattern(self, activation_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD);
            }
            return catch_var_for_cyblack_basic_ksi_method;
        }
    }

    public static final SubLObject cyblack_basic_ksi_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        return object.object_print_method(self, stream, depth);
    }

    public static final SubLObject cyblack_basic_ksi_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_basic_ksi_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    application = new_application;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD);
            }
            return catch_var_for_cyblack_basic_ksi_method;
        }
    }

    public static final SubLObject cyblack_basic_ksi_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject activation_pattern = get_cyblack_basic_ksi_activation_pattern(self);
            return activation_pattern;
        }
    }

    public static final SubLObject cyblack_basic_ksi_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        {
            SubLObject catch_var_for_cyblack_basic_ksi_method = NIL;
            SubLObject activation_pattern = get_cyblack_basic_ksi_activation_pattern(self);
            try {
                try {
                    activation_pattern = new_activation_pattern;
                    sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD, new_activation_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ksi_activation_pattern(self, activation_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD);
            }
            return catch_var_for_cyblack_basic_ksi_method;
        }
    }

    public static final SubLObject cyblack_basic_ksi_get_postings_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_ksi_get_knowledge_source_method(SubLObject self) {
        {
            SubLObject knowledge_source = get_cyblack_basic_ksi_knowledge_source(self);
            return knowledge_source;
        }
    }

    public static final SubLObject cyblack_basic_ksi_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_ksi_method = NIL;
            SubLObject knowledge_source = get_cyblack_basic_ksi_knowledge_source(self);
            try {
                try {
                    knowledge_source = new_knowledge_source;
                    sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD, new_knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ksi_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD);
            }
            return catch_var_for_cyblack_basic_ksi_method;
        }
    }

    public static final SubLObject cyblack_basic_ksi_get_execution_mode_method(SubLObject self) {
        {
            SubLObject execution_mode = get_cyblack_basic_ksi_execution_mode(self);
            return execution_mode;
        }
    }

    public static final SubLObject cyblack_basic_ksi_set_execution_mode_method(SubLObject self, SubLObject new_execution_mode) {
        {
            SubLObject catch_var_for_cyblack_basic_ksi_method = NIL;
            SubLObject execution_mode = get_cyblack_basic_ksi_execution_mode(self);
            try {
                try {
                    execution_mode = new_execution_mode;
                    sublisp_throw($sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD, new_execution_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ksi_execution_mode(self, execution_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD);
            }
            return catch_var_for_cyblack_basic_ksi_method;
        }
    }

    public static final SubLObject cyblack_basic_ksi_execute_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_posting_description_p(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && v_object.rest().isList());
    }

    public static final SubLObject cyblack_posting_description_datatype_name(SubLObject posting_description) {
        return posting_description.first();
    }

    public static final SubLObject cyblack_posting_description_essential_properties(SubLObject posting_description) {
        return posting_description.rest();
    }

    public static final SubLObject cyblack_posting_description_instantiate(SubLObject posting_description, SubLObject datatype_dictionary) {
        {
            SubLObject datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, cyblack_posting_description_datatype_name(posting_description), UNPROVIDED);
            SubLObject posting = cyblack_datatype.cyblack_datatype_create_posting(datatype);
            methods.funcall_instance_method_with_1_args(posting, ASSIMILATE, cyblack_posting_description_essential_properties(posting_description));
            return posting;
        }
    }

    public static final SubLObject get_cyblack_one_size_fits_all_internal_ksi_confidence(SubLObject cyblack_one_size_fits_all_internal_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, EIGHT_INTEGER, CONFIDENCE);
    }

    public static final SubLObject set_cyblack_one_size_fits_all_internal_ksi_confidence(SubLObject cyblack_one_size_fits_all_internal_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, value, EIGHT_INTEGER, CONFIDENCE);
    }

    public static final SubLObject get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(SubLObject cyblack_one_size_fits_all_internal_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, SEVEN_INTEGER, GEN_POSTINGS_FUNCTION);
    }

    public static final SubLObject set_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(SubLObject cyblack_one_size_fits_all_internal_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, value, SEVEN_INTEGER, GEN_POSTINGS_FUNCTION);
    }

    public static final SubLObject get_cyblack_one_size_fits_all_internal_ksi_internal_postings(SubLObject cyblack_one_size_fits_all_internal_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, SIX_INTEGER, INTERNAL_POSTINGS);
    }

    public static final SubLObject set_cyblack_one_size_fits_all_internal_ksi_internal_postings(SubLObject cyblack_one_size_fits_all_internal_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_one_size_fits_all_internal_ksi, value, SIX_INTEGER, INTERNAL_POSTINGS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_one_size_fits_all_internal_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_one_size_fits_all_internal_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, INTERNAL_POSTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, GEN_POSTINGS_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, CONFIDENCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_p(SubLObject cyblack_one_size_fits_all_internal_ksi) {
        return classes.subloop_instanceof_class(cyblack_one_size_fits_all_internal_ksi, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI);
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject confidence = get_cyblack_one_size_fits_all_internal_ksi_confidence(self);
            SubLObject gen_postings_function = get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self);
            SubLObject internal_postings = get_cyblack_one_size_fits_all_internal_ksi_internal_postings(self);
            try {
                try {
                    cyblack_basic_ksi_initialize_method(self);
                    internal_postings = object.new_object_instance(BASIC_END_POINTER_LIST);
                    gen_postings_function = NIL;
                    confidence = NIL;
                    sublisp_throw($sym107$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_one_size_fits_all_internal_ksi_confidence(self, confidence);
                            set_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self, gen_postings_function);
                            set_cyblack_one_size_fits_all_internal_ksi_internal_postings(self, internal_postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_get_postings_method(SubLObject self) {
        {
            SubLObject internal_postings = get_cyblack_one_size_fits_all_internal_ksi_internal_postings(self);
            return subloop_collections.basic_collection_get_contents_method(internal_postings);
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_add_posting_method(SubLObject self, SubLObject new_posting) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject internal_postings = get_cyblack_one_size_fits_all_internal_ksi_internal_postings(self);
            try {
                try {
                    subloop_collections.basic_end_pointer_list_add_method(internal_postings, new_posting);
                    sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, new_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_one_size_fits_all_internal_ksi_internal_postings(self, internal_postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_post_method(SubLObject self, SubLObject posting_description) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject datum = posting_description;
                        SubLObject current = datum;
                        SubLObject type_string = NIL;
                        SubLObject plist = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt121);
                        type_string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt121);
                        plist = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                                SubLObject type = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, type_string, UNPROVIDED);
                                SubLObject proto_posting = cyblack_datatype.cyblack_datatype_create_posting(type);
                                object.object_assimilate_method(proto_posting, plist);
                                cyblack_one_size_fits_all_internal_ksi_add_posting_method(self, proto_posting);
                                sublisp_throw($sym120$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, proto_posting);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt121);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym120$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_clear_environment_slots_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_get_gen_postings_function_method(SubLObject self) {
        {
            SubLObject gen_postings_function = get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self);
            return gen_postings_function;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_set_gen_postings_function_method(SubLObject self, SubLObject new_function) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject gen_postings_function = get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self);
            try {
                try {
                    gen_postings_function = new_function;
                    sublisp_throw($sym131$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, new_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self, gen_postings_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_get_confidence_method(SubLObject self) {
        {
            SubLObject confidence = get_cyblack_one_size_fits_all_internal_ksi_confidence(self);
            return confidence;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_set_confidence_method(SubLObject self, SubLObject new_confidence) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject confidence = get_cyblack_one_size_fits_all_internal_ksi_confidence(self);
            try {
                try {
                    confidence = new_confidence;
                    sublisp_throw($sym139$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, new_confidence);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_one_size_fits_all_internal_ksi_confidence(self, confidence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject cyblack_one_size_fits_all_internal_ksi_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = NIL;
            SubLObject gen_postings_function = get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self);
            SubLObject activation_pattern = get_cyblack_basic_ksi_activation_pattern(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL == activation_pattern) {
                        Errors.warn($str_alt143$_EXECUTE__S___Cannot_execute_this, self);
                    }
                    {
                        SubLObject ks_args_environment = cyblack_precondition_pattern.cyblack_precon_pattern_get_ks_args_method(activation_pattern);
                        SubLObject local_bindings = cyblack_precondition_pattern.cyblack_precon_pattern_get_local_bindings_method(ks_args_environment);
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                        SubLObject arglist = NIL;
                        {
                            SubLObject cdolist_list_var = local_bindings;
                            SubLObject binding = NIL;
                            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                arglist = cons(cyblack_precondition_pattern.cyblack_binding_get_value_method(binding), arglist);
                            }
                        }
                        {
                            SubLObject postings_descriptions = apply(gen_postings_function, arglist);
                            SubLObject posting = NIL;
                            SubLObject cdolist_list_var = postings_descriptions;
                            SubLObject description = NIL;
                            for (description = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , description = cdolist_list_var.first()) {
                                if (NIL != cyblack_posting_description_p(description)) {
                                    posting = cyblack_posting_description_instantiate(description, datatype_dictionary);
                                    methods.funcall_instance_method_with_1_args(posting, SET_APPLICATION, application);
                                    methods.funcall_instance_method_with_1_args(posting, SET_KSI, self);
                                    methods.funcall_instance_method_with_1_args(posting, SET_ACTIVATION_PATTERN, methods.funcall_instance_method_with_0_args(activation_pattern, CLONE));
                                    cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym142$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_one_size_fits_all_internal_ksi_gen_postings_function(self, gen_postings_function);
                            set_cyblack_basic_ksi_activation_pattern(self, activation_pattern);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_one_size_fits_all_internal_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym142$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_one_size_fits_all_internal_ksi_method;
        }
    }

    public static final SubLObject get_cyblack_external_ksi_postings(SubLObject cyblack_external_ksi) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_ksi, SIX_INTEGER, POSTINGS);
    }

    public static final SubLObject set_cyblack_external_ksi_postings(SubLObject cyblack_external_ksi, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_ksi, value, SIX_INTEGER, POSTINGS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KSI, POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_ksi_p(SubLObject cyblack_external_ksi) {
        return classes.subloop_instanceof_class(cyblack_external_ksi, CYBLACK_EXTERNAL_KSI);
    }

    public static final SubLObject cyblack_external_ksi_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_ksi_method = NIL;
            SubLObject postings = get_cyblack_external_ksi_postings(self);
            SubLObject execution_mode = get_cyblack_basic_ksi_execution_mode(self);
            try {
                try {
                    cyblack_basic_ksi_initialize_method(self);
                    postings = NIL;
                    execution_mode = $ASYNCHRONOUS;
                    sublisp_throw($sym153$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_ksi_postings(self, postings);
                            set_cyblack_basic_ksi_execution_mode(self, execution_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_external_ksi_method;
        }
    }

    public static final SubLObject cyblack_external_ksi_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_external_ksi_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    application = new_application;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_external_ksi_method;
        }
    }

    public static final SubLObject cyblack_external_ksi_get_postings_method(SubLObject self) {
        {
            SubLObject postings = get_cyblack_external_ksi_postings(self);
            return postings;
        }
    }

    public static final SubLObject cyblack_external_ksi_set_postings_method(SubLObject self, SubLObject new_postings) {
        {
            SubLObject catch_var_for_cyblack_external_ksi_method = NIL;
            SubLObject postings = get_cyblack_external_ksi_postings(self);
            try {
                try {
                    postings = new_postings;
                    sublisp_throw($sym163$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD, new_postings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_ksi_postings(self, postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym163$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_external_ksi_method;
        }
    }

    public static final SubLObject cyblack_external_ksi_add_posting_method(SubLObject self, SubLObject new_posting) {
        {
            SubLObject catch_var_for_cyblack_external_ksi_method = NIL;
            SubLObject postings = get_cyblack_external_ksi_postings(self);
            try {
                try {
                    postings = nconc(postings, list(new_posting));
                    sublisp_throw($sym166$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD, new_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_ksi_postings(self, postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym166$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_external_ksi_method;
        }
    }

    public static final SubLObject cyblack_external_ksi_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_ksi_method = NIL;
            SubLObject postings = get_cyblack_external_ksi_postings(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                        SubLObject cdolist_list_var = postings;
                        SubLObject posting = NIL;
                        for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                            format(T, $str_alt171$____Adding_Posting__S_to_the_blac, posting);
                            methods.funcall_instance_method_with_1_args(blackboard, POST, posting);
                        }
                        sublisp_throw($sym169$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_ksi_postings(self, postings);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_ksi_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD);
            }
            return catch_var_for_cyblack_external_ksi_method;
        }
    }

    public static final SubLObject cyblack_ksi_set_application(SubLObject cyblack_knowledge_source_instantiation, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_instantiation_p(cyblack_knowledge_source_instantiation)) {
                    Errors.error($str_alt173$CYBLACK_KSI_SET_APPLICATION___S_i, cyblack_knowledge_source_instantiation);
                }
            }
            if (NIL != cyblack_external_ksi_p(cyblack_knowledge_source_instantiation)) {
                return cyblack_external_ksi_set_application_method(cyblack_knowledge_source_instantiation, new_application);
            } else
                if (NIL != cyblack_basic_ksi_p(cyblack_knowledge_source_instantiation)) {
                    return cyblack_basic_ksi_set_application_method(cyblack_knowledge_source_instantiation, new_application);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source_instantiation, SET_APPLICATION, new_application);
                }

        }
    }

    public static final SubLObject cyblack_ksi_get_knowledge_source(SubLObject cyblack_knowledge_source_instantiation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_instantiation_p(cyblack_knowledge_source_instantiation)) {
                    Errors.error($str_alt174$CYBLACK_KSI_GET_KNOWLEDGE_SOURCE_, cyblack_knowledge_source_instantiation);
                }
            }
            if (NIL != cyblack_external_ksi_p(cyblack_knowledge_source_instantiation)) {
                return cyblack_basic_ksi_get_knowledge_source_method(cyblack_knowledge_source_instantiation);
            } else
                if (NIL != cyblack_basic_ksi_p(cyblack_knowledge_source_instantiation)) {
                    return cyblack_basic_ksi_get_knowledge_source_method(cyblack_knowledge_source_instantiation);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source_instantiation, GET_KNOWLEDGE_SOURCE);
                }

        }
    }

    public static final SubLObject declare_cyblack_ksi_file() {
        declareFunction("cyblack_knowledge_source_instantiation_p", "CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION-P", 1, 0, false);
        declareFunction("external_knowledge_source_instantiation_print_function_trampoline", "EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_knowledge_source_instantiation_p", "EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION-P", 1, 0, false);
        new cyblack_ksi.$external_knowledge_source_instantiation_p$UnaryFunction();
        declareFunction("eksi_lock", "EKSI-LOCK", 1, 0, false);
        declareFunction("eksi_internals", "EKSI-INTERNALS", 1, 0, false);
        declareFunction("eksi_cyblack_application", "EKSI-CYBLACK-APPLICATION", 1, 0, false);
        declareFunction("eksi_activation_pattern", "EKSI-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("eksi_postings", "EKSI-POSTINGS", 1, 0, false);
        declareFunction("eksi_execution_function", "EKSI-EXECUTION-FUNCTION", 1, 0, false);
        declareFunction("_csetf_eksi_lock", "_CSETF-EKSI-LOCK", 2, 0, false);
        declareFunction("_csetf_eksi_internals", "_CSETF-EKSI-INTERNALS", 2, 0, false);
        declareFunction("_csetf_eksi_cyblack_application", "_CSETF-EKSI-CYBLACK-APPLICATION", 2, 0, false);
        declareFunction("_csetf_eksi_activation_pattern", "_CSETF-EKSI-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("_csetf_eksi_postings", "_CSETF-EKSI-POSTINGS", 2, 0, false);
        declareFunction("_csetf_eksi_execution_function", "_CSETF-EKSI-EXECUTION-FUNCTION", 2, 0, false);
        declareFunction("make_external_knowledge_source_instantiation", "MAKE-EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION", 0, 1, false);
        declareMacro("with_eksi_read_only", "WITH-EKSI-READ-ONLY");
        declareMacro("with_eksi_read_write", "WITH-EKSI-READ-WRITE");
        declareMacro("with_locked_eksi", "WITH-LOCKED-EKSI");
        declareMacro("with_locked_eksi_read_only", "WITH-LOCKED-EKSI-READ-ONLY");
        declareMacro("with_locked_eksi_read_write", "WITH-LOCKED-EKSI-READ-WRITE");
        declareFunction("get_cyblack_basic_ksi_execution_mode", "GET-CYBLACK-BASIC-KSI-EXECUTION-MODE", 1, 0, false);
        declareFunction("set_cyblack_basic_ksi_execution_mode", "SET-CYBLACK-BASIC-KSI-EXECUTION-MODE", 2, 0, false);
        declareFunction("get_cyblack_basic_ksi_knowledge_source", "GET-CYBLACK-BASIC-KSI-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_basic_ksi_knowledge_source", "SET-CYBLACK-BASIC-KSI-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_basic_ksi_activation_pattern", "GET-CYBLACK-BASIC-KSI-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_basic_ksi_activation_pattern", "SET-CYBLACK-BASIC-KSI-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KSI-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_ksi_p", "CYBLACK-BASIC-KSI-P", 1, 0, false);
        declareFunction("cyblack_basic_ksi_initialize_method", "CYBLACK-BASIC-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ksi_print_method", "CYBLACK-BASIC-KSI-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_ksi_set_application_method", "CYBLACK-BASIC-KSI-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ksi_get_activation_pattern_method", "CYBLACK-BASIC-KSI-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ksi_set_activation_pattern_method", "CYBLACK-BASIC-KSI-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ksi_get_postings_method", "CYBLACK-BASIC-KSI-GET-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ksi_get_knowledge_source_method", "CYBLACK-BASIC-KSI-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ksi_set_knowledge_source_method", "CYBLACK-BASIC-KSI-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ksi_get_execution_mode_method", "CYBLACK-BASIC-KSI-GET-EXECUTION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ksi_set_execution_mode_method", "CYBLACK-BASIC-KSI-SET-EXECUTION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ksi_execute_method", "CYBLACK-BASIC-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_description_p", "CYBLACK-POSTING-DESCRIPTION-P", 1, 0, false);
        declareFunction("cyblack_posting_description_datatype_name", "CYBLACK-POSTING-DESCRIPTION-DATATYPE-NAME", 1, 0, false);
        declareFunction("cyblack_posting_description_essential_properties", "CYBLACK-POSTING-DESCRIPTION-ESSENTIAL-PROPERTIES", 1, 0, false);
        declareFunction("cyblack_posting_description_instantiate", "CYBLACK-POSTING-DESCRIPTION-INSTANTIATE", 2, 0, false);
        declareFunction("get_cyblack_one_size_fits_all_internal_ksi_confidence", "GET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CONFIDENCE", 1, 0, false);
        declareFunction("set_cyblack_one_size_fits_all_internal_ksi_confidence", "SET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CONFIDENCE", 2, 0, false);
        declareFunction("get_cyblack_one_size_fits_all_internal_ksi_gen_postings_function", "GET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GEN-POSTINGS-FUNCTION", 1, 0, false);
        declareFunction("set_cyblack_one_size_fits_all_internal_ksi_gen_postings_function", "SET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GEN-POSTINGS-FUNCTION", 2, 0, false);
        declareFunction("get_cyblack_one_size_fits_all_internal_ksi_internal_postings", "GET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INTERNAL-POSTINGS", 1, 0, false);
        declareFunction("set_cyblack_one_size_fits_all_internal_ksi_internal_postings", "SET-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INTERNAL-POSTINGS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_one_size_fits_all_internal_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_one_size_fits_all_internal_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INSTANCE", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_p", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-P", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_initialize_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_get_postings_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_add_posting_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_post_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-POST-METHOD", 2, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_clear_environment_slots_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CLEAR-ENVIRONMENT-SLOTS-METHOD", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_get_gen_postings_function_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-GEN-POSTINGS-FUNCTION-METHOD", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_set_gen_postings_function_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-SET-GEN-POSTINGS-FUNCTION-METHOD", 2, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_get_confidence_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_set_confidence_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-SET-CONFIDENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_one_size_fits_all_internal_ksi_execute_method", "CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_external_ksi_postings", "GET-CYBLACK-EXTERNAL-KSI-POSTINGS", 1, 0, false);
        declareFunction("set_cyblack_external_ksi_postings", "SET-CYBLACK-EXTERNAL-KSI-POSTINGS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KSI-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_ksi_p", "CYBLACK-EXTERNAL-KSI-P", 1, 0, false);
        declareFunction("cyblack_external_ksi_initialize_method", "CYBLACK-EXTERNAL-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_ksi_set_application_method", "CYBLACK-EXTERNAL-KSI-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_external_ksi_get_postings_method", "CYBLACK-EXTERNAL-KSI-GET-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_ksi_set_postings_method", "CYBLACK-EXTERNAL-KSI-SET-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_ksi_add_posting_method", "CYBLACK-EXTERNAL-KSI-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_external_ksi_execute_method", "CYBLACK-EXTERNAL-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_ksi_set_application", "CYBLACK-KSI-SET-APPLICATION", 2, 0, false);
        declareFunction("cyblack_ksi_get_knowledge_source", "CYBLACK-KSI-GET-KNOWLEDGE-SOURCE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ksi_file() {
        defconstant("*DTP-EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION*", EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION);
        return NIL;
    }

    public static final SubLObject setup_cyblack_ksi_file() {
                interfaces.new_interface(CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION, $list_alt1, $list_alt2, $list_alt3);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_external_knowledge_source_instantiation$.getGlobalValue(), symbol_function(EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EKSI_LOCK, _CSETF_EKSI_LOCK);
        def_csetf(EKSI_INTERNALS, _CSETF_EKSI_INTERNALS);
        def_csetf(EKSI_CYBLACK_APPLICATION, _CSETF_EKSI_CYBLACK_APPLICATION);
        def_csetf(EKSI_ACTIVATION_PATTERN, _CSETF_EKSI_ACTIVATION_PATTERN);
        def_csetf(EKSI_POSTINGS, _CSETF_EKSI_POSTINGS);
        def_csetf(EKSI_EXECUTION_FUNCTION, _CSETF_EKSI_EXECUTION_FUNCTION);
        identity(EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION);
        classes.subloop_new_class(CYBLACK_BASIC_KSI, CYBLACK_OBJECT, $list_alt39, NIL, $list_alt40);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_KSI, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KSI_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KSI_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_ksi_class(CYBLACK_BASIC_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_KSI, $list_alt53, NIL, $list_alt54);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, INITIALIZE, CYBLACK_BASIC_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_KSI, $list_alt59, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, PRINT, CYBLACK_BASIC_KSI_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_KSI, $list_alt59, $list_alt64, $list_alt65);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, SET_APPLICATION, CYBLACK_BASIC_KSI_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_BASIC_KSI, $list_alt69, NIL, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, GET_ACTIVATION_PATTERN, CYBLACK_BASIC_KSI_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_BASIC_KSI, $list_alt59, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, SET_ACTIVATION_PATTERN, CYBLACK_BASIC_KSI_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS, CYBLACK_BASIC_KSI, $list_alt59, NIL, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, GET_POSTINGS, CYBLACK_BASIC_KSI_GET_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KSI, $list_alt69, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KSI_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KSI, $list_alt59, $list_alt84, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KSI_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXECUTION_MODE, CYBLACK_BASIC_KSI, $list_alt69, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, GET_EXECUTION_MODE, CYBLACK_BASIC_KSI_GET_EXECUTION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_EXECUTION_MODE, CYBLACK_BASIC_KSI, $list_alt59, $list_alt92, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, SET_EXECUTION_MODE, CYBLACK_BASIC_KSI_SET_EXECUTION_MODE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_BASIC_KSI, $list_alt59, NIL, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KSI, EXECUTE, CYBLACK_BASIC_KSI_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, CYBLACK_BASIC_KSI, NIL, NIL, $list_alt100);
        classes.class_set_implements_slot_listeners(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $sym104$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $sym105$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KS);
        subloop_reserved_initialize_cyblack_one_size_fits_all_internal_ksi_class(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt53, NIL, $list_alt106);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, INITIALIZE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt69, NIL, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, GET_POSTINGS, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt53, $list_alt113, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, ADD_POSTING, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(POST, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt53, $list_alt118, $list_alt119);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, POST, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_POST_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ENVIRONMENT_SLOTS, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt59, NIL, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, CLEAR_ENVIRONMENT_SLOTS, $sym124$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_CLEAR_ENVIRONMENT_SLOTS_ME);
        methods.methods_incorporate_instance_method(GET_GEN_POSTINGS_FUNCTION, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt69, NIL, $list_alt126);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, GET_GEN_POSTINGS_FUNCTION, $sym127$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_GEN_POSTINGS_FUNCTION_);
        methods.methods_incorporate_instance_method(SET_GEN_POSTINGS_FUNCTION, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt59, $list_alt129, $list_alt130);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, SET_GEN_POSTINGS_FUNCTION, $sym132$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_SET_GEN_POSTINGS_FUNCTION_);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt69, NIL, $list_alt134);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, GET_CONFIDENCE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONFIDENCE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt59, $list_alt137, $list_alt138);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, SET_CONFIDENCE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_SET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, $list_alt59, NIL, $list_alt141);
        methods.subloop_register_instance_method(CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI, EXECUTE, CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EXTERNAL_KSI, CYBLACK_BASIC_KSI, NIL, NIL, $list_alt148);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_KSI, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KSI_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KSI_INSTANCE);
        subloop_reserved_initialize_cyblack_external_ksi_class(CYBLACK_EXTERNAL_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_KSI, $list_alt53, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, INITIALIZE, CYBLACK_EXTERNAL_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_EXTERNAL_KSI, $list_alt59, $list_alt64, $list_alt65);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, SET_APPLICATION, CYBLACK_EXTERNAL_KSI_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS, CYBLACK_EXTERNAL_KSI, $list_alt69, NIL, $list_alt158);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, GET_POSTINGS, CYBLACK_EXTERNAL_KSI_GET_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(SET_POSTINGS, CYBLACK_EXTERNAL_KSI, $list_alt59, $list_alt161, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, SET_POSTINGS, CYBLACK_EXTERNAL_KSI_SET_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_EXTERNAL_KSI, $list_alt59, $list_alt113, $list_alt165);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, ADD_POSTING, CYBLACK_EXTERNAL_KSI_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_EXTERNAL_KSI, $list_alt59, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KSI, EXECUTE, CYBLACK_EXTERNAL_KSI_EXECUTE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTION-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTION-MODE"), list(makeSymbol("NEW-EXECUTION-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION");

    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_P = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION-P");

    static private final SubLList $list_alt6 = list(makeSymbol("LOCK"), makeSymbol("INTERNALS"), makeSymbol("CYBLACK-APPLICATION"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("POSTINGS"), makeSymbol("EXECUTION-FUNCTION"));

    static private final SubLList $list_alt7 = list($LOCK, makeKeyword("INTERNALS"), makeKeyword("CYBLACK-APPLICATION"), makeKeyword("ACTIVATION-PATTERN"), makeKeyword("POSTINGS"), makeKeyword("EXECUTION-FUNCTION"));

    static private final SubLList $list_alt8 = list(makeSymbol("EKSI-LOCK"), makeSymbol("EKSI-INTERNALS"), makeSymbol("EKSI-CYBLACK-APPLICATION"), makeSymbol("EKSI-ACTIVATION-PATTERN"), makeSymbol("EKSI-POSTINGS"), makeSymbol("EKSI-EXECUTION-FUNCTION"));

    static private final SubLList $list_alt9 = list(makeSymbol("_CSETF-EKSI-LOCK"), makeSymbol("_CSETF-EKSI-INTERNALS"), makeSymbol("_CSETF-EKSI-CYBLACK-APPLICATION"), makeSymbol("_CSETF-EKSI-ACTIVATION-PATTERN"), makeSymbol("_CSETF-EKSI-POSTINGS"), makeSymbol("_CSETF-EKSI-EXECUTION-FUNCTION"));



    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_INSTANTIATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-INSTANTIATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EKSI_LOCK = makeSymbol("EKSI-LOCK");

    public static final SubLSymbol _CSETF_EKSI_LOCK = makeSymbol("_CSETF-EKSI-LOCK");

    private static final SubLSymbol EKSI_INTERNALS = makeSymbol("EKSI-INTERNALS");

    public static final SubLSymbol _CSETF_EKSI_INTERNALS = makeSymbol("_CSETF-EKSI-INTERNALS");

    private static final SubLSymbol EKSI_CYBLACK_APPLICATION = makeSymbol("EKSI-CYBLACK-APPLICATION");

    public static final SubLSymbol _CSETF_EKSI_CYBLACK_APPLICATION = makeSymbol("_CSETF-EKSI-CYBLACK-APPLICATION");

    private static final SubLSymbol EKSI_ACTIVATION_PATTERN = makeSymbol("EKSI-ACTIVATION-PATTERN");

    public static final SubLSymbol _CSETF_EKSI_ACTIVATION_PATTERN = makeSymbol("_CSETF-EKSI-ACTIVATION-PATTERN");

    private static final SubLSymbol EKSI_POSTINGS = makeSymbol("EKSI-POSTINGS");

    public static final SubLSymbol _CSETF_EKSI_POSTINGS = makeSymbol("_CSETF-EKSI-POSTINGS");

    private static final SubLSymbol EKSI_EXECUTION_FUNCTION = makeSymbol("EKSI-EXECUTION-FUNCTION");

    public static final SubLSymbol _CSETF_EKSI_EXECUTION_FUNCTION = makeSymbol("_CSETF-EKSI-EXECUTION-FUNCTION");



    private static final SubLSymbol $INTERNALS = makeKeyword("INTERNALS");

    private static final SubLSymbol $CYBLACK_APPLICATION = makeKeyword("CYBLACK-APPLICATION");

    private static final SubLSymbol $ACTIVATION_PATTERN = makeKeyword("ACTIVATION-PATTERN");



    private static final SubLSymbol $EXECUTION_FUNCTION = makeKeyword("EXECUTION-FUNCTION");

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt31 = list(makeSymbol("EKSI"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $$$eksi = makeString("eksi");

    private static final SubLSymbol EKSI = makeSymbol("EKSI");





    static private final SubLList $list_alt36 = list(makeSymbol("LOCK"));





    static private final SubLList $list_alt39 = list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION"));

    static private final SubLList $list_alt40 = list(new SubLObject[]{ list(makeSymbol("ACTIVATION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KNOWLEDGE-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXECUTION-MODE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTION-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTION-MODE"), list(makeSymbol("NEW-EXECUTION-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")) });











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KSI_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KSI-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KSI_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KSI-INSTANCE");



    static private final SubLList $list_alt53 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt54 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeKeyword("SYNCHRONOUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KSI-METHOD");

    private static final SubLSymbol $SYNCHRONOUS = makeKeyword("SYNCHRONOUS");

    private static final SubLSymbol CYBLACK_BASIC_KSI_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-INITIALIZE-METHOD");



    static private final SubLList $list_alt59 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt60 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(RET, list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH"))));

    private static final SubLSymbol CYBLACK_BASIC_KSI_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-KSI-PRINT-METHOD");



    static private final SubLList $list_alt64 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt65 = list(list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KSI-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KSI_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-KSI-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt69 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt70 = list(list(RET, makeSymbol("ACTIVATION-PATTERN")));

    private static final SubLSymbol CYBLACK_BASIC_KSI_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-KSI-GET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt73 = list(makeSymbol("NEW-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("NEW-ACTIVATION-PATTERN"))), makeString("(SET-ACTIVATION-PATTERN ~S): ~S is not an instance of CYBLACK-ENVIRONMENT"), makeSymbol("SELF"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(RET, makeSymbol("NEW-ACTIVATION-PATTERN")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KSI-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KSI_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-KSI-SET-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol GET_POSTINGS = makeSymbol("GET-POSTINGS");

    static private final SubLList $list_alt78 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KSI_GET_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-KSI-GET-POSTINGS-METHOD");



    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol CYBLACK_BASIC_KSI_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-GET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt84 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KSI-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KSI_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-SET-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol GET_EXECUTION_MODE = makeSymbol("GET-EXECUTION-MODE");

    static private final SubLList $list_alt89 = list(list(RET, makeSymbol("EXECUTION-MODE")));

    private static final SubLSymbol CYBLACK_BASIC_KSI_GET_EXECUTION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-GET-EXECUTION-MODE-METHOD");



    static private final SubLList $list_alt92 = list(makeSymbol("NEW-EXECUTION-MODE"));

    static private final SubLList $list_alt93 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-EXECUTION-MODE-TYPE-P"), makeSymbol("NEW-EXECUTION-MODE")), makeString("(SET-EXECUTION-MODE ~S): ~S is not a member of the CYBLACK-EXECUTION-MODE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-EXECUTION-MODE")), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeSymbol("NEW-EXECUTION-MODE")), list(RET, makeSymbol("NEW-EXECUTION-MODE")));

    static private final SubLSymbol $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KSI-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KSI_SET_EXECUTION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-SET-EXECUTION-MODE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KSI_EXECUTE_METHOD = makeSymbol("CYBLACK-BASIC-KSI-EXECUTE-METHOD");



    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI");

    static private final SubLList $list_alt100 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-POSTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GEN-POSTINGS-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("POSTING-DESCRIPTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ENVIRONMENT-SLOTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GEN-POSTINGS-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GEN-POSTINGS-FUNCTION"), list(makeSymbol("NEW-FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONFIDENCE"), list(makeSymbol("NEW-CONFIDENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol GEN_POSTINGS_FUNCTION = makeSymbol("GEN-POSTINGS-FUNCTION");

    private static final SubLSymbol INTERNAL_POSTINGS = makeSymbol("INTERNAL-POSTINGS");

    static private final SubLSymbol $sym104$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CLASS");

    static private final SubLSymbol $sym105$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INSTANCE");

    static private final SubLList $list_alt106 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-POSTINGS"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("BASIC-END-POINTER-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("GEN-POSTINGS-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym107$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");



    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_INITIALIZE_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-INITIALIZE-METHOD");

    static private final SubLList $list_alt110 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("INTERNAL-POSTINGS"))));

    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_POSTINGS_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-POSTINGS-METHOD");



    static private final SubLList $list_alt113 = list(makeSymbol("NEW-POSTING"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-POSTING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("INTERNAL-POSTINGS"), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("NEW-POSTING")));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");

    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_ADD_POSTING_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-ADD-POSTING-METHOD");



    static private final SubLList $list_alt118 = list(makeSymbol("POSTING-DESCRIPTION"));

    static private final SubLList $list_alt119 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("POSTING-DESCRIPTION")), list(makeSymbol("STRINGP"), list(makeSymbol("CAR"), makeSymbol("POSTING-DESCRIPTION")))), makeString("(POST ~S): ~S is not a valid posting description."), makeSymbol("SELF"), makeSymbol("POSTING-DESCRIPTION")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("TYPE-STRING"), makeSymbol("PLIST")), makeSymbol("POSTING-DESCRIPTION"), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(POST ~S): This KSI has no associated application."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(POST ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("TYPE-STRING"))), list(makeSymbol("PROTO-POSTING"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-POSTING"), makeSymbol("TYPE")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PROTO-POSTING"), makeString("(POST ~S): Unable to generate a posting of type ~S."), makeSymbol("SELF"), makeSymbol("TYPE-STRING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeSymbol("PROTO-POSTING"), makeSymbol("PLIST")), list(makeSymbol("ADD-POSTING"), makeSymbol("SELF"), makeSymbol("PROTO-POSTING")), list(RET, makeSymbol("PROTO-POSTING"))))));

    static private final SubLSymbol $sym120$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");

    static private final SubLList $list_alt121 = list(makeSymbol("TYPE-STRING"), makeSymbol("PLIST"));

    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_POST_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-POST-METHOD");

    private static final SubLSymbol CLEAR_ENVIRONMENT_SLOTS = makeSymbol("CLEAR-ENVIRONMENT-SLOTS");

    static private final SubLSymbol $sym124$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_CLEAR_ENVIRONMENT_SLOTS_ME = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-CLEAR-ENVIRONMENT-SLOTS-METHOD");

    private static final SubLSymbol GET_GEN_POSTINGS_FUNCTION = makeSymbol("GET-GEN-POSTINGS-FUNCTION");

    static private final SubLList $list_alt126 = list(list(RET, makeSymbol("GEN-POSTINGS-FUNCTION")));

    static private final SubLSymbol $sym127$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_GEN_POSTINGS_FUNCTION_ = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-GEN-POSTINGS-FUNCTION-METHOD");

    private static final SubLSymbol SET_GEN_POSTINGS_FUNCTION = makeSymbol("SET-GEN-POSTINGS-FUNCTION");

    static private final SubLList $list_alt129 = list(makeSymbol("NEW-FUNCTION"));

    static private final SubLList $list_alt130 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-FUNCTION")), makeString("(SET-GEN-POSTINGS-FUNCTION ~S): Posting generator functions must be symbols.  ~S is not a symbol."), makeSymbol("SELF"), makeSymbol("NEW-FUNCTION")), list(makeSymbol("CSETQ"), makeSymbol("GEN-POSTINGS-FUNCTION"), makeSymbol("NEW-FUNCTION")), list(RET, makeSymbol("NEW-FUNCTION")));

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");

    static private final SubLSymbol $sym132$CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_SET_GEN_POSTINGS_FUNCTION_ = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-SET-GEN-POSTINGS-FUNCTION-METHOD");



    static private final SubLList $list_alt134 = list(list(RET, makeSymbol("CONFIDENCE")));

    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_GET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-GET-CONFIDENCE-METHOD");



    static private final SubLList $list_alt137 = list(makeSymbol("NEW-CONFIDENCE"));

    static private final SubLList $list_alt138 = list(list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE"), makeSymbol("NEW-CONFIDENCE")), list(RET, makeSymbol("NEW-CONFIDENCE")));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");

    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_SET_CONFIDENCE_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-SET-CONFIDENCE-METHOD");

    static private final SubLList $list_alt141 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): No application is associated with this knowledge source instantiation."), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("GEN-POSTINGS-FUNCTION"), makeString("(EXECUTE ~S): No posting generator is associated with this knowledge souce instantiation."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): Cannot execute this knowledge source instantiation ~\n             due to the absence of an activation pattern."), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("KS-ARGS-ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-KS-ARGS"), makeSymbol("CYBLACK-PRECON-PATTERN")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("LOCAL-BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-LOCAL-BINDINGS"), makeSymbol("CYBLACK-PRECON-PATTERN")), makeSymbol("KS-ARGS-ENVIRONMENT"))), list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION"))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION"))), list(makeSymbol("ARGLIST"), NIL)), list(makeSymbol("CYBLACK-MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(EXECUTE ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(EXECUTE ~S): No blackboard is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("BLACKBOARD")), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDING"), makeSymbol("LOCAL-BINDINGS")), list(makeSymbol("CPUSH"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("BINDING")), makeSymbol("ARGLIST"))), list(makeSymbol("CLET"), list(list(makeSymbol("POSTINGS-DESCRIPTIONS"), list(makeSymbol("APPLY"), makeSymbol("GEN-POSTINGS-FUNCTION"), makeSymbol("ARGLIST"))), list(makeSymbol("POSTING"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DESCRIPTION"), makeSymbol("POSTINGS-DESCRIPTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-DESCRIPTION-P"), makeSymbol("DESCRIPTION")), list(makeSymbol("CSETQ"), makeSymbol("POSTING"), list(makeSymbol("CYBLACK-POSTING-DESCRIPTION-INSTANTIATE"), makeSymbol("DESCRIPTION"), makeSymbol("DATATYPE-DICTIONARY"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-KSI")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-ACTIVATION-PATTERN")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERN"), list(QUOTE, makeSymbol("CLONE")))), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("BLACKBOARD"), makeSymbol("POSTING")))))), list(RET, NIL));

    static private final SubLSymbol $sym142$OUTER_CATCH_FOR_CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-METHOD");

    static private final SubLString $str_alt143$_EXECUTE__S___Cannot_execute_this = makeString("(EXECUTE ~S): Cannot execute this knowledge source instantiation ~\n             due to the absence of an activation pattern.");





    private static final SubLSymbol CYBLACK_ONE_SIZE_FITS_ALL_INTERNAL_KSI_EXECUTE_METHOD = makeSymbol("CYBLACK-ONE-SIZE-FITS-ALL-INTERNAL-KSI-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI = makeSymbol("CYBLACK-EXTERNAL-KSI");

    static private final SubLList $list_alt148 = list(list(makeSymbol("POSTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTINGS"), list(makeSymbol("NEW-POSTINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KSI_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KSI-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KSI_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KSI-INSTANCE");

    static private final SubLList $list_alt152 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeKeyword("ASYNCHRONOUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KSI-METHOD");

    private static final SubLSymbol $ASYNCHRONOUS = makeKeyword("ASYNCHRONOUS");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym156$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KSI-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-SET-APPLICATION-METHOD");

    static private final SubLList $list_alt158 = list(list(RET, makeSymbol("POSTINGS")));

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_GET_POSTINGS_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-GET-POSTINGS-METHOD");

    private static final SubLSymbol SET_POSTINGS = makeSymbol("SET-POSTINGS");

    static private final SubLList $list_alt161 = list(makeSymbol("NEW-POSTINGS"));

    static private final SubLList $list_alt162 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-POSTINGS")), makeString("(SET-POSTINGS ~S): ~S is not a valid list."), makeSymbol("SELF"), makeSymbol("NEW-POSTINGS")), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), makeSymbol("NEW-POSTINGS")), list(RET, makeSymbol("NEW-POSTINGS")));

    static private final SubLSymbol $sym163$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KSI-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_SET_POSTINGS_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-SET-POSTINGS-METHOD");

    static private final SubLList $list_alt165 = list(list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("NCONC"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("NEW-POSTING")))), list(RET, makeSymbol("NEW-POSTING")));

    static private final SubLSymbol $sym166$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KSI-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_ADD_POSTING_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-ADD-POSTING-METHOD");

    static private final SubLList $list_alt168 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): No application is associated with this knowledge source instantiation."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(EXECUTE ~S): No blackboard is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("POSTINGS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(EXECUTE ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FORMAT"), T, makeString("~%* Adding Posting ~S to the blackboard."), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BLACKBOARD"), list(QUOTE, makeSymbol("POST")), makeSymbol("POSTING")))), list(RET, NIL));

    static private final SubLSymbol $sym169$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KSI_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KSI-METHOD");



    static private final SubLString $str_alt171$____Adding_Posting__S_to_the_blac = makeString("~%* Adding Posting ~S to the blackboard.");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI_EXECUTE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KSI-EXECUTE-METHOD");

    static private final SubLString $str_alt173$CYBLACK_KSI_SET_APPLICATION___S_i = makeString("CYBLACK-KSI-SET-APPLICATION: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION.");

    static private final SubLString $str_alt174$CYBLACK_KSI_GET_KNOWLEDGE_SOURCE_ = makeString("CYBLACK-KSI-GET-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ksi_file();
    }

    public void initializeVariables() {
        init_cyblack_ksi_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ksi_file();
    }
}

