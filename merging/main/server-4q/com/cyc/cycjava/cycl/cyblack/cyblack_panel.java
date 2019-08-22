/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.classes_utilities;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_sequences;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-PANEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-panel.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_panel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_panel() {
    }

    public static final SubLFile me = new cyblack_panel();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_panel";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-PANEL-STIMULATION-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_panel_stimulation_types$ = makeSymbol("*VALID-CYBLACK-PANEL-STIMULATION-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-PANEL-STIMULATION-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_panel_stimulation_types() {
        return $valid_cyblack_panel_stimulation_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-PANEL-STIMULATION-TYPE enumeration.
     */
    public static final SubLObject cyblack_panel_stimulation_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_panel_stimulation_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-PANEL-STIMULATION-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_panel_stimulation_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_panel_stimulation_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_PANEL_STIMULATION_TYPE, value, CYBLACK_PANEL_STIMULATION_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-PANEL-STIMULATION-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_panel_stimulation_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_panel_stimulation_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_PANEL_STIMULATION_TYPE, value, CYBLACK_PANEL_STIMULATION_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-PANEL-STIMULATION-TYPE enumeration.
     */
    public static final SubLObject cyblack_panel_stimulation_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel_stimulation_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PANEL_STIMULATION_TYPE_P, value1, CYBLACK_PANEL_STIMULATION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel_stimulation_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PANEL_STIMULATION_TYPE_P, value2, CYBLACK_PANEL_STIMULATION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_panel_stimulation_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-PANEL-STIMULATION-TYPE enumeration.
     */
    public static final SubLObject cyblack_panel_stimulation_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel_stimulation_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PANEL_STIMULATION_TYPE_P, value1, CYBLACK_PANEL_STIMULATION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel_stimulation_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PANEL_STIMULATION_TYPE_P, value2, CYBLACK_PANEL_STIMULATION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_panel_stimulation_types$.getGlobalValue();
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

    public static final SubLObject cyblack_panel_p(SubLObject v_cyblack_panel) {
        return interfaces.subloop_instanceof_interface(v_cyblack_panel, CYBLACK_PANEL);
    }

    public static final SubLObject cyblack_dll_panel_p(SubLObject cyblack_dll_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_dll_panel, CYBLACK_DLL_PANEL);
    }

    public static final SubLObject get_cyblack_basic_panel_posting_daemons(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, FIFTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_posting_daemons(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, FIFTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_datatype(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, FOURTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_datatype(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, FOURTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_direct_knowledge_sources(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, THIRTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_direct_knowledge_sources(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, THIRTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_sub_panels(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, TWELVE_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_sub_panels(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, TWELVE_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_super_panels(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, ELEVEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_super_panels(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, ELEVEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_stimulation_type(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_panel, TEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_panel_stimulation_type(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_panel, value, TEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_panel_last_link(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_panel, NINE_INTEGER, LAST_LINK);
    }

    public static final SubLObject set_cyblack_basic_panel_last_link(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_panel, value, NINE_INTEGER, LAST_LINK);
    }

    public static final SubLObject get_cyblack_basic_panel_first_link(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_panel, EIGHT_INTEGER, FIRST_LINK);
    }

    public static final SubLObject set_cyblack_basic_panel_first_link(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_panel, value, EIGHT_INTEGER, FIRST_LINK);
    }

    public static final SubLObject get_cyblack_basic_panel_element_count(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_panel, SEVEN_INTEGER, ELEMENT_COUNT);
    }

    public static final SubLObject set_cyblack_basic_panel_element_count(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_panel, value, SEVEN_INTEGER, ELEMENT_COUNT);
    }

    public static final SubLObject get_cyblack_basic_panel_element_equality_predicate(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_panel, SIX_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject set_cyblack_basic_panel_element_equality_predicate(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_panel, value, SIX_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject get_cyblack_basic_panel_marks(SubLObject cyblack_basic_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_panel, FIVE_INTEGER, MARKS);
    }

    public static final SubLObject set_cyblack_basic_panel_marks(SubLObject cyblack_basic_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_panel, value, FIVE_INTEGER, MARKS);
    }

    public static final SubLObject cyblack_basic_panel_activate_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_visitor = object.new_object_instance(CYBLACK_STATE_CHANGE_KS_VISITOR);
                        cyblack_ks.cyblack_state_change_ks_visitor_set_initial_state_method(template_visitor, application, posting, $POST);
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_knowledge_sources(self, template_visitor);
                        sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_deactivate_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_visitor = object.new_object_instance(CYBLACK_STATE_CHANGE_KS_VISITOR);
                        cyblack_ks.cyblack_state_change_ks_visitor_set_initial_state_method(template_visitor, application, posting, $REMOVE_POST);
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_knowledge_sources(self, template_visitor);
                        sublisp_throw($sym90$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt93$___ITERATE_OVER_ALL_POSTING_DAEMO, new SubLObject[]{ self, self, daemon_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_posting_daemons(template_current_panel, daemon_visitor);
                    }
                } 
                return daemon_visitor;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            SubLObject template_posting_daemons = cyblack_basic_panel_get_posting_daemons_method(self);
            if (template_posting_daemons.isList()) {
                {
                    SubLObject template_current_cons = template_posting_daemons;
                    SubLObject template_not_finished = T;
                    SubLObject template_daemon = NIL;
                    while ((NIL != template_not_finished) && (NIL != template_current_cons)) {
                        template_daemon = template_current_cons.first();
                        if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                            methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                            template_current_cons = template_current_cons.rest();
                        } else {
                            template_not_finished = NIL;
                        }
                    } 
                }
            } else
                if (NIL != subloop_collections.collection_template_p(template_posting_daemons)) {
                    {
                        SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_posting_daemons, ALLOCATE_ENUMERATOR);
                        if (NIL == subloop_collections.enumerator_template_empty_p(template_enumerator)) {
                            {
                                SubLObject template_daemon = subloop_collections.enumerator_template_first(template_enumerator);
                                SubLObject template_not_finished = T;
                                if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                    methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                    while ((NIL != template_not_finished) && (NIL == subloop_collections.enumerator_template_last_p(template_enumerator))) {
                                        template_daemon = subloop_collections.enumerator_template_next(template_enumerator);
                                        if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                            methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                        } else {
                                            template_not_finished = NIL;
                                        }
                                    } 
                                }
                            }
                        }
                        methods.funcall_instance_method_with_1_args(template_posting_daemons, DEALLOCATE_ENUMERATOR, template_enumerator);
                    }
                }

            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_visitor_is_cyblack_state_change_ks_visitor = cyblack_ks.cyblack_state_change_ks_visitor_p(ks_visitor);
            SubLObject template_current_panel = NIL;
            while (NIL != template_panel_queue) {
                template_current_panel = template_panel_queue.first();
                template_panel_queue = template_panel_queue.rest();
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                    if (NIL != template_visitor_is_cyblack_state_change_ks_visitor) {
                        cyblack_ks.cyblack_state_change_ks_visitor_set_panel_method(ks_visitor, template_current_panel);
                    }
                    cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_knowledge_sources(template_current_panel, ks_visitor);
                }
            } 
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_direct_knowledge_sources = cyblack_basic_panel_get_direct_knowledge_sources_method(self);
            if (NIL != template_direct_knowledge_sources) {
                {
                    SubLObject cdolist_list_var = template_direct_knowledge_sources;
                    SubLObject template_ks = NIL;
                    for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(ks_visitor, VISIT, template_ks);
                        if (NIL == methods.funcall_instance_method_with_1_args(ks_visitor, CONTINUE_P, template_ks)) {
                            return ks_visitor;
                        }
                    }
                }
            }
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt103$___ITERATE_OVER_ALL_POSTINGS__S__, new SubLObject[]{ self, self, posting_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_postings(template_current_panel, posting_visitor);
                    }
                } 
                return posting_visitor;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_iterate_over_all_direct_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt105$___ITERATE_OVER_ALL_DIRECT_POSTIN, self, posting_visitor);
            }
            {
                SubLObject template_direct_postings = cyblack_basic_panel_get_direct_postings_method(self);
                SubLObject cdolist_list_var = template_direct_postings;
                SubLObject template_posting = NIL;
                for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_posting)) {
                        methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, template_posting);
                        if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, template_posting)) {
                            return posting_visitor;
                        }
                    }
                }
            }
            return posting_visitor;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_all_active_postings_method(SubLObject self) {
        {
            SubLObject template_all_active_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_active_postings = nconc(template_all_active_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_active_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_active_postings;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_all_postings_method(SubLObject self) {
        {
            SubLObject template_all_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_postings = nconc(template_all_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_postings;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_direct_postings_method(SubLObject self) {
        {
            SubLObject template_direct_postings = copy_list(cyblack_basic_panel_get_direct_postings_method(self));
            SubLObject cdolist_list_var = template_direct_postings;
            SubLObject template_posting = NIL;
            for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                cyblack_basic_panel_remove_direct_posting_method(self, template_posting);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_direct_postings_method(SubLObject self, SubLObject postings) {
        {
            SubLObject cdolist_list_var = postings;
            SubLObject posting = NIL;
            for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                cyblack_basic_panel_add_direct_posting_method(self, posting);
            }
            return postings;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_super_panels = list(self);
            SubLObject template_knowledge_sources = NIL;
            SubLObject template_visited_panels = NIL;
            SubLObject template_direct_knowledge_sources = NIL;
            SubLObject template_new_knowledge_sources = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_super_panels) {
                    template_current_panel = template_super_panels.first();
                    template_super_panels = template_super_panels.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                        template_direct_knowledge_sources = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_knowledge_sources(template_current_panel);
                        template_new_knowledge_sources = NIL;
                        {
                            SubLObject list_expression = template_direct_knowledge_sources;
                            if (NIL == list_expression) {
                                template_new_knowledge_sources = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    template_new_knowledge_sources = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject template_ks = list_expression.first();
                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            template_new_knowledge_sources = NIL;
                                            {
                                                SubLObject cdolist_list_var = list_expression;
                                                SubLObject template_ks = NIL;
                                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                                    result = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                    if (NIL != result) {
                                                        if (NIL != tail_cons) {
                                                            rplacd(tail_cons, result);
                                                            tail_cons = last(result, UNPROVIDED);
                                                        } else {
                                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                            tail_cons = last(template_new_knowledge_sources, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }


                        }
                        if (NIL != template_new_knowledge_sources) {
                            template_knowledge_sources = nconc(template_knowledge_sources, template_new_knowledge_sources);
                        }
                        template_super_panels = nconc(template_super_panels, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_direct_knowledge_sources_method(SubLObject self, SubLObject knowledge_sources) {
        cyblack_basic_panel_remove_all_knowledge_sources_method(self);
        {
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_basic_panel_add_direct_knowledge_source_method(self, knowledge_source);
            }
        }
        return knowledge_sources;
    }

    public static final SubLObject cyblack_basic_panel_remove_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject knowledge_sources = cyblack_basic_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_basic_panel_remove_direct_knowledge_source_method(self, knowledge_source);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_on_remove_last_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_on_add_first_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_stimulate_all_posting_daemons_method(SubLObject self, SubLObject environment, SubLObject posting) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        if (NIL != environment) {
            {
                SubLObject goal_satisfaction_daemon_visitor = object.new_object_instance(CYBLACK_GOAL_SATISFACTION_VISITOR);
                cyblack_blackboard_daemon.cyblack_goal_satisfaction_visitor_set_initial_state_method(goal_satisfaction_daemon_visitor, cyblack_object.cyblack_object_get_application_method(self), environment, posting);
                cyblack_basic_panel_iterate_over_all_posting_daemons_method(self, goal_satisfaction_daemon_visitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_stimulate_all_monitors_method(SubLObject self, SubLObject environments) {
        if (environments == UNPROVIDED) {
            environments = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_basic_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != cyblack_ks.cyblack_monitoring_ks_p(template_ks)) {
                    methods.funcall_instance_method_with_1_args(template_ks, PERFORM_ACTION, environments);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_stimulate_all_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_basic_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_stimulate_direct_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_direct_knowledge_sources = cyblack_basic_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = template_direct_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_all_sub_panels_method(SubLObject self, SubLObject excluded_panels) {
        if (excluded_panels == UNPROVIDED) {
            excluded_panels = NIL;
        }
        {
            SubLObject collected_panels = NIL;
            SubLObject current_sub_panels = cyblack_basic_panel_get_sub_panels_method(self);
            SubLObject current_panel = NIL;
            while (NIL != current_sub_panels) {
                current_panel = current_sub_panels.first();
                current_sub_panels = current_sub_panels.rest();
                if (!((NIL != subl_promotions.memberP(current_panel, excluded_panels, UNPROVIDED, UNPROVIDED)) || (NIL != member(current_panel, collected_panels, UNPROVIDED, UNPROVIDED)))) {
                    collected_panels = cons(current_panel, collected_panels);
                    {
                        SubLObject local_sub_panels = methods.funcall_instance_method_with_0_args(current_panel, GET_SUB_PANELS);
                        if (NIL != local_sub_panels) {
                            current_sub_panels = nconc(local_sub_panels, current_sub_panels);
                        }
                    }
                }
            } 
            return collected_panels;
        }
    }

    public static final SubLObject cyblack_basic_panel_swap_method(SubLObject self, SubLObject element1, SubLObject element2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (element1 == element2) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != element1) && (NIL != element2))) {
                    Errors.error($str_alt128$_SWAP__S___Cannot_swap_NIL_elemen, self);
                }
            }
            {
                SubLObject link1 = cyblack_basic_panel_find_link_method(self, element1);
                SubLObject link2 = cyblack_basic_panel_find_link_method(self, element2);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link1) {
                        Errors.error($str_alt129$_SWAP__S____S_is_not_an_element_o, self, element1);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link2) {
                        Errors.error($str_alt129$_SWAP__S____S_is_not_an_element_o, self, element2);
                    }
                }
                if (NIL != subloop_collections.list_element_template_p(element1)) {
                    methods.funcall_instance_method_with_1_args(element1, DELETE_PARENT_LINK, link1);
                    methods.funcall_instance_method_with_1_args(element1, ADD_PARENT_LINK, link2);
                }
                if (NIL != subloop_collections.list_element_template_p(element2)) {
                    methods.funcall_instance_method_with_1_args(element2, DELETE_PARENT_LINK, link2);
                    methods.funcall_instance_method_with_1_args(element2, ADD_PARENT_LINK, link1);
                }
                subloop_collections._csetf_dlc_contents(link1, element2);
                subloop_collections._csetf_dlc_contents(link2, element1);
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_empty_p_method(SubLObject self) {
        return sublisp_null(cyblack_basic_panel_get_first_link_method(self));
    }

    public static final SubLObject cyblack_basic_panel_reverse_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
            SubLObject template_last_link = cyblack_basic_panel_get_last_link_method(self);
            if (NIL == template_first_link) {
                return self;
            }
            if (template_first_link == template_last_link) {
                return self;
            }
            {
                SubLObject template_current_link = template_first_link;
                SubLObject template_next_link = NIL;
                while (NIL != template_current_link) {
                    template_next_link = subloop_collections.dlc_next(template_current_link);
                    cyblack_basic_panel_reverse_link_method(self, template_current_link);
                    template_current_link = template_next_link;
                } 
                cyblack_basic_panel_set_first_link_method(self, template_last_link);
                cyblack_basic_panel_set_last_link_method(self, template_first_link);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_panel_append_method(SubLObject self, SubLObject other_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == other_list) {
                return self;
            }
            if (other_list.isCons()) {
                {
                    SubLObject cdolist_list_var = other_list;
                    SubLObject template_element = NIL;
                    for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                        cyblack_basic_panel_add_method(self, template_element);
                    }
                }
                return self;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.list_template_p(other_list)) {
                    Errors.error($str_alt142$_APPEND__S___Cannot_append_non_li, self, other_list);
                }
            }
            {
                SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(other_list, ALLOCATE_ENUMERATOR);
                if (NIL != template_enumerator) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                        return self;
                    }
                    {
                        SubLObject template_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST);
                        while (NIL != template_element) {
                            cyblack_basic_panel_add_method(self, template_element);
                            template_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                        } 
                        return self;
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_panel_position_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_panel_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            if (NIL == template_links) {
                return NIL;
            }
            while (NIL != template_links) {
                if (NIL != cyblack_basic_panel_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return count;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_nth_method(SubLObject self, SubLObject index, SubLObject new_element) {
        {
            SubLObject template_link = cyblack_basic_panel_find_nth_link_method(self, index);
            if (NIL != template_link) {
                {
                    SubLObject template_content = subloop_collections.dlc_contents(template_link);
                    if (NIL != subloop_collections.list_element_template_p(template_content)) {
                        subloop_collections.generic_dllt_delete_parent_link_function(template_content, template_link);
                    }
                    subloop_collections._csetf_dlc_contents(template_link, new_element);
                    if (NIL != subloop_collections.list_element_template_p(new_element)) {
                        subloop_collections.generic_dllt_add_parent_link_function(new_element, template_link);
                    }
                }
                return new_element;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_nth_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_link = cyblack_basic_panel_find_nth_link_method(self, index);
            if (NIL != template_link) {
                return subloop_collections.dlc_contents(template_link);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_but_last_method(SubLObject self) {
        {
            SubLObject template_last_link = cyblack_basic_panel_get_last_link_method(self);
            if (NIL != template_last_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_last_link);
                    cyblack_basic_panel_delete_link_method(self, template_last_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_pop_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_first_link);
                    cyblack_basic_panel_delete_link_method(self, template_first_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_push_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_first_link) {
                subloop_collections._csetf_dlc_next(template_new_link, template_first_link);
                subloop_collections._csetf_dlc_previous(template_first_link, template_new_link);
                cyblack_basic_panel_set_first_link_method(self, template_new_link);
            } else {
                cyblack_basic_panel_set_first_link_method(self, template_new_link);
                cyblack_basic_panel_set_last_link_method(self, template_new_link);
            }
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_panel_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_panel_member_p_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_link = cyblack_basic_panel_find_link_method(self, element);
            return NIL != template_link ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_method(SubLObject self, SubLObject old_element) {
        if (NIL != subloop_collections.list_element_template_p(old_element)) {
            subloop_collections.generic_dllt_delete_self_from_collection_function(old_element, self);
        } else {
            {
                SubLObject template_link = cyblack_basic_panel_find_link_method(self, old_element);
                if (NIL != template_link) {
                    cyblack_basic_panel_delete_link_method(self, template_link);
                }
            }
        }
        return old_element;
    }

    public static final SubLObject cyblack_basic_panel_add_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            SubLObject template_last_link = cyblack_basic_panel_get_last_link_method(self);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_last_link) {
                subloop_collections._csetf_dlc_next(template_last_link, template_new_link);
                subloop_collections._csetf_dlc_previous(template_new_link, template_last_link);
            } else {
                cyblack_basic_panel_set_first_link_method(self, template_new_link);
            }
            cyblack_basic_panel_set_last_link_method(self, template_new_link);
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_panel_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_panel_clear_method(SubLObject self) {
        {
            SubLObject template_contents = cyblack_basic_panel_get_contents_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_element = NIL;
            for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                cyblack_basic_panel_remove_method(self, template_element);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_find_nth_link_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_links = cyblack_basic_panel_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            while (NIL != template_links) {
                if (count.numE(index)) {
                    return template_links;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_find_link_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_panel_get_first_link_method(self);
            while (NIL != template_links) {
                if (NIL != cyblack_basic_panel_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return template_links;
                }
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_reverse_link_method(SubLObject self, SubLObject link) {
        {
            SubLObject template_previous = subloop_collections.dlc_previous(link);
            SubLObject template_next = subloop_collections.dlc_next(link);
            subloop_collections._csetf_dlc_previous(link, template_next);
            subloop_collections._csetf_dlc_next(link, template_previous);
            return link;
        }
    }

    public static final SubLObject cyblack_basic_panel_delete_link_method(SubLObject self, SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.double_link_cell_p(link)) {
                    Errors.error($str_alt193$_DELETE_LINK__S____S_is_not_a_val, self, link);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (subloop_collections.dlc_owner(link) != self) {
                    Errors.error($str_alt194$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
                }
            }
            cyblack_basic_panel_dec_element_count_method(self);
            {
                SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
                SubLObject template_last_link = cyblack_basic_panel_get_last_link_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != template_first_link) && (NIL != template_last_link)) || ((NIL == template_first_link) && (NIL == template_last_link)))) {
                        Errors.error($str_alt195$_DELETE_LINK__S___Detected_incons, self);
                    }
                }
                if (template_first_link == link) {
                    if (template_last_link == link) {
                        cyblack_basic_panel_set_first_link_method(self, NIL);
                        cyblack_basic_panel_set_last_link_method(self, NIL);
                        subloop_collections._csetf_dlc_previous(link, NIL);
                        subloop_collections._csetf_dlc_next(link, NIL);
                        return subloop_collections.dlc_contents(link);
                    } else {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_previous(template_second_link, NIL);
                            cyblack_basic_panel_set_first_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                } else {
                    if (template_last_link == link) {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_previous(link);
                            subloop_collections._csetf_dlc_next(template_second_link, NIL);
                            cyblack_basic_panel_set_last_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    } else {
                        {
                            SubLObject template_before_link = subloop_collections.dlc_previous(link);
                            SubLObject template_after_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_next(template_before_link, template_after_link);
                            subloop_collections._csetf_dlc_previous(template_after_link, template_before_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt200$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
                }
            }
            {
                SubLObject template_contents = cyblack_basic_panel_get_contents_method(self);
                SubLObject cdolist_list_var = template_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_panel_remove_method(self, template_element);
                }
            }
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_panel_add_method(self, template_element);
                }
            }
            return new_contents;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_contents_method(SubLObject self) {
        {
            SubLObject template_contents = NIL;
            SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_current_link = template_first_link;
                    while (NIL != template_current_link) {
                        template_contents = cons(subloop_collections.dlc_contents(template_current_link), template_contents);
                        template_current_link = subloop_collections.dlc_next(template_current_link);
                    } 
                }
            }
            return nreverse(template_contents);
        }
    }

    public static final SubLObject cyblack_basic_panel_element_equal_p_method(SubLObject self, SubLObject element1, SubLObject element2) {
        return equal(element1, element2);
    }

    public static final SubLObject cyblack_basic_panel_has_mark_p_method(SubLObject self, SubLObject mark) {
        return NIL != member(mark, cyblack_basic_panel_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject cyblack_basic_panel_remove_mark_method(SubLObject self, SubLObject mark) {
        cyblack_basic_panel_set_marks_internal_method(self, delete(mark, cyblack_basic_panel_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return mark;
    }

    public static final SubLObject cyblack_basic_panel_add_mark_method(SubLObject self, SubLObject mark) {
        {
            SubLObject list_of_marks = cyblack_basic_panel_get_marks_internal_method(self);
            if (NIL == subl_promotions.memberP(mark, list_of_marks, UNPROVIDED, UNPROVIDED)) {
                list_of_marks = cons(mark, list_of_marks);
                cyblack_basic_panel_set_marks_internal_method(self, list_of_marks);
            }
            return mark;
        }
    }

    public static final SubLObject cyblack_basic_panel_clear_all_marks_method(SubLObject self) {
        cyblack_basic_panel_set_marks_internal_method(self, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_p(SubLObject cyblack_basic_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_panel, CYBLACK_BASIC_PANEL);
    }

    /**
     * Initialize the instance as a markable interface instance.
     */
    public static final SubLObject cyblack_basic_panel_initialize_qua_markable_method(SubLObject self) {
        set_cyblack_basic_panel_marks(self, NIL);
        return NIL;
    }

    /**
     * Return marks upon this instance.
     */
    public static final SubLObject cyblack_basic_panel_get_marks_internal_method(SubLObject self) {
        {
            SubLObject marks = get_cyblack_basic_panel_marks(self);
            return marks;
        }
    }

    /**
     * Does the internal work of setting the instance's marks.
     */
    public static final SubLObject cyblack_basic_panel_set_marks_internal_method(SubLObject self, SubLObject new_marks) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject marks = get_cyblack_basic_panel_marks(self);
            try {
                try {
                    marks = new_marks;
                    sublisp_throw($sym249$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_marks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_marks(self, marks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym249$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_initialize_qua_doubly_linked_list_method(SubLObject self) {
        set_cyblack_basic_panel_element_equality_predicate(self, EQ);
        set_cyblack_basic_panel_element_count(self, ZERO_INTEGER);
        set_cyblack_basic_panel_first_link(self, NIL);
        set_cyblack_basic_panel_last_link(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_get_element_equality_predicate_method(SubLObject self) {
        {
            SubLObject element_equality_predicate = get_cyblack_basic_panel_element_equality_predicate(self);
            return element_equality_predicate;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_element_equality_predicate_method(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject element_equality_predicate = get_cyblack_basic_panel_element_equality_predicate(self);
            try {
                try {
                    element_equality_predicate = new_predicate;
                    sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_element_equality_predicate(self, element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_element_count_method(SubLObject self, SubLObject new_element_count) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject element_count = get_cyblack_basic_panel_element_count(self);
            try {
                try {
                    element_count = new_element_count;
                    sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_inc_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject element_count = get_cyblack_basic_panel_element_count(self);
            try {
                try {
                    if (NIL == element_count) {
                        element_count = ONE_INTEGER;
                    } else {
                        element_count = add(element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_dec_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject element_count = get_cyblack_basic_panel_element_count(self);
            try {
                try {
                    if (NIL == element_count) {
                        element_count = ZERO_INTEGER;
                    } else {
                        element_count = subtract(element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym274$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym274$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_first_link_method(SubLObject self) {
        {
            SubLObject first_link = get_cyblack_basic_panel_first_link(self);
            return first_link;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_first_link_method(SubLObject self, SubLObject new_first_link) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject first_link = get_cyblack_basic_panel_first_link(self);
            try {
                try {
                    first_link = new_first_link;
                    sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_first_link(self, first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_last_link_method(SubLObject self) {
        {
            SubLObject last_link = get_cyblack_basic_panel_last_link(self);
            return last_link;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_last_link_method(SubLObject self, SubLObject new_last_link) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject last_link = get_cyblack_basic_panel_last_link(self);
            try {
                try {
                    last_link = new_last_link;
                    sublisp_throw($sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_last_link(self, last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_element_count_method(SubLObject self) {
        {
            SubLObject element_count = get_cyblack_basic_panel_element_count(self);
            return element_count;
        }
    }

    public static final SubLObject cyblack_basic_panel_allocate_enumerator_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
                SubLObject first_link = get_cyblack_basic_panel_first_link(self);
                try {
                    try {
                        {
                            SubLObject new_enumerator = object.object_new_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_first_link = subloop_collections.dlc_copy_links(first_link, new_enumerator);
                                SubLObject new_last_link = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                subloop_collections.basic_doubly_linked_list_enumerator_set_initial_state_method(new_enumerator, new_first_link, new_last_link);
                                sublisp_throw($sym296$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_enumerator);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_panel_first_link(self, first_link);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym296$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
                }
                return catch_var_for_cyblack_basic_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_deallocate_enumerator_method(SubLObject self, SubLObject enumerator) {
        if (NIL != subloop_collections.basic_doubly_linked_list_enumerator_p(enumerator)) {
            subloop_collections.basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject datatype = get_cyblack_basic_panel_datatype(self);
            try {
                try {
                    if (NIL != datatype) {
                        format(stream, $str_alt306$___S__A__, subloop_structures.class_name(subloop_structures.instance_class(self)), cyblack_datatype.cyblack_datatype_get_typename(datatype));
                    } else {
                        object.object_print_method(self, stream, depth);
                    }
                    sublisp_throw($sym305$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym305$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_initialize_qua_dll_panel_method(SubLObject self) {
        set_cyblack_basic_panel_super_panels(self, NIL);
        set_cyblack_basic_panel_sub_panels(self, NIL);
        set_cyblack_basic_panel_direct_knowledge_sources(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_get_stimulation_type_method(SubLObject self) {
        {
            SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
            return stimulation_type;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_stimulation_type_method(SubLObject self, SubLObject new_stimulation_type) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
            try {
                try {
                    stimulation_type = new_stimulation_type;
                    sublisp_throw($sym317$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_stimulation_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_super_panels_method(SubLObject self) {
        {
            SubLObject super_panels = get_cyblack_basic_panel_super_panels(self);
            return copy_list(super_panels);
        }
    }

    public static final SubLObject cyblack_basic_panel_get_sub_panels_method(SubLObject self) {
        {
            SubLObject sub_panels = get_cyblack_basic_panel_sub_panels(self);
            return copy_list(sub_panels);
        }
    }

    public static final SubLObject cyblack_basic_panel_add_super_panel_method(SubLObject self, SubLObject new_super_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject super_panels = get_cyblack_basic_panel_super_panels(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_super_panel, super_panels, UNPROVIDED, UNPROVIDED)) {
                        super_panels = cons(new_super_panel, super_panels);
                    }
                    sublisp_throw($sym327$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_super_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_super_panels(self, super_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym327$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_super_panel_method(SubLObject self, SubLObject old_super_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject super_panels = get_cyblack_basic_panel_super_panels(self);
            try {
                try {
                    super_panels = delete(old_super_panel, super_panels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, old_super_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_super_panels(self, super_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_sub_panel_method(SubLObject self, SubLObject new_sub_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_panel_sub_panels(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_sub_panel, sub_panels, UNPROVIDED, UNPROVIDED)) {
                        sub_panels = cons(new_sub_panel, sub_panels);
                    }
                    sublisp_throw($sym337$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_sub_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym337$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_sub_panel_method(SubLObject self, SubLObject old_sub_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_panel_sub_panels(self);
            try {
                try {
                    sub_panels = delete(old_sub_panel, sub_panels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, old_sub_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
                SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                SubLObject isolated_p = object.get_object_isolated_p(self);
                try {
                    try {
                        if (NIL != posting) {
                            if (NIL != cyblack_globals.$cyblack_monitor_posts$.getDynamicValue(thread)) {
                                format(T, $str_alt347$___ADD_POSTING__S___Added_Posting, posting);
                                format(T, $str_alt348$_______S__, methods.funcall_instance_method_with_0_args(posting, LISTIFY));
                            }
                            cyblack_basic_panel_add_method(self, posting);
                            cyblack_posting_dispatch_functions.cyblack_posting_set_panel(posting, self);
                            methods.funcall_instance_method_with_0_args(posting, ON_POST);
                            if (stimulation_type == $ACTIVE) {
                                {
                                    SubLObject environment = cyblack_precondition_pattern.create_top_level_environment($ADD_POSTING, $sym353$_THE_POSTING, cyblack_application.cyblack_application_get_root_datatype(application), posting);
                                    cyblack_basic_panel_stimulate_all_posting_daemons_method(self, environment, posting);
                                    if (!((NIL != instances.get_slot(posting, ISOLATED_P)) || (NIL == methods.funcall_instance_method_with_0_args(posting, ACTIVE_P)))) {
                                        cyblack_basic_panel_stimulate_all_knowledge_sources_method(self, environment);
                                    }
                                }
                                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                            }
                            sublisp_throw($sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, posting);
                        }
                        sublisp_throw($sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                                cyblack_object.set_cyblack_object_application(self, application);
                                object.set_object_isolated_p(self, isolated_p);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
                }
                return catch_var_for_cyblack_basic_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_posting_method(SubLObject self, SubLObject posting) {
        if ((NIL != posting) && (NIL == cyblack_posting_dispatch_functions.cyblack_posting_immutable_p(posting))) {
            cyblack_basic_panel_remove_method(self, posting);
            return posting;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_get_datatype_method(SubLObject self) {
        {
            SubLObject datatype = get_cyblack_basic_panel_datatype(self);
            return datatype;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject datatype = get_cyblack_basic_panel_datatype(self);
            try {
                try {
                    datatype = new_datatype;
                    sublisp_throw($sym366$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_datatype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym366$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != knowledge_source) {
                        if (NIL == direct_knowledge_sources) {
                            direct_knowledge_sources = object.object_new_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
                        }
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_ADD_FIRST_KNOWLEDGE_SOURCE);
                        }
                        if (NIL == cyblack_ks.cyblack_basic_knowledge_source_list_member_p_method(direct_knowledge_sources, knowledge_source)) {
                            cyblack_ks.cyblack_basic_knowledge_source_list_add_method(direct_knowledge_sources, knowledge_source);
                        }
                    }
                    sublisp_throw($sym371$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym371$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_panel_direct_knowledge_sources(self);
            try {
                try {
                    if ((NIL != knowledge_source) && (NIL != direct_knowledge_sources)) {
                        cyblack_ks.cyblack_basic_knowledge_source_list_remove_method(direct_knowledge_sources, knowledge_source);
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_REMOVE_LAST_KNOWLEDGE_SOURCE);
                        }
                    }
                    sublisp_throw($sym376$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym376$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject direct_knowledge_sources = get_cyblack_basic_panel_direct_knowledge_sources(self);
            if (NIL != direct_knowledge_sources) {
                return subloop_collections.basic_doubly_linked_list_get_contents_method(direct_knowledge_sources);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != direct_knowledge_sources) {
                        subloop_collections.basic_doubly_linked_list_clear_method(direct_knowledge_sources);
                        direct_knowledge_sources = NIL;
                    }
                    sublisp_throw($sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_direct_posting_method(SubLObject self, SubLObject posting) {
        if (NIL != posting) {
            cyblack_basic_panel_add_method(self, posting);
            methods.funcall_instance_method_with_0_args(posting, ON_POST);
            methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
            return posting;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_remove_direct_posting_method(SubLObject self, SubLObject posting) {
        if (NIL != posting) {
            cyblack_basic_panel_remove_method(self, posting);
            return posting;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_panel_get_direct_postings_method(SubLObject self) {
        return cyblack_basic_panel_get_contents_method(self);
    }

    public static final SubLObject cyblack_basic_panel_get_direct_active_postings_method(SubLObject self) {
        {
            SubLObject template_contents = NIL;
            SubLObject template_first_link = cyblack_basic_panel_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_current_link = template_first_link;
                    SubLObject template_current_content = NIL;
                    while (NIL != template_current_link) {
                        template_current_content = subloop_collections.dlc_contents(template_current_link);
                        if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_current_content)) {
                            template_contents = cons(template_current_content, template_contents);
                        }
                        template_current_link = subloop_collections.dlc_next(template_current_link);
                    } 
                }
            }
            return nreverse(template_contents);
        }
    }

    public static final SubLObject cyblack_basic_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_panel_posting_daemons(self);
            SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    cyblack_basic_panel_initialize_qua_markable_method(self);
                    cyblack_basic_panel_initialize_qua_doubly_linked_list_method(self);
                    cyblack_basic_panel_initialize_qua_dll_panel_method(self);
                    posting_daemons = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
                    stimulation_type = $ACTIVE;
                    sublisp_throw($sym395$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_posting_daemons(self, posting_daemons);
                            set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt402$___SET_APPLICATION__S__S_, self, new_application);
            }
            cyblack_object.set_cyblack_object_application(self, new_application);
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt403$___SET_APPLICATION__S__S______S, new SubLObject[]{ self, new_application, cyblack_object.get_cyblack_object_application(self) });
            }
            return new_application;
        }
    }

    public static final SubLObject cyblack_basic_panel_on_startup_method(SubLObject self) {
        {
            SubLObject sub_panels = get_cyblack_basic_panel_sub_panels(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            cyblack_object.cyblack_object_on_startup_method(self);
            cyblack_basic_panel_remove_direct_knowledge_sources_method(self);
            cyblack_basic_panel_remove_direct_postings_method(self);
            {
                SubLObject cdolist_list_var = sub_panels;
                SubLObject panel = NIL;
                for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(panel, SET_APPLICATION, application);
                    methods.funcall_instance_method_with_0_args(panel, ON_STARTUP);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_panel_on_shutdown_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_panel_sub_panels(self);
            try {
                try {
                    {
                        SubLObject enumerator = cyblack_basic_panel_allocate_enumerator_method(self);
                        if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                            {
                                SubLObject current_posting = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                methods.funcall_instance_method_with_0_args(current_posting, ON_SHUTDOWN);
                                while (NIL != methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                    current_posting = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    methods.funcall_instance_method_with_0_args(current_posting, ON_SHUTDOWN);
                                } 
                            }
                            cyblack_basic_panel_deallocate_enumerator_method(self, enumerator);
                        }
                        {
                            SubLObject cdolist_list_var = sub_panels;
                            SubLObject panel = NIL;
                            for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_0_args(panel, ON_SHUTDOWN);
                            }
                        }
                        cyblack_object.cyblack_object_on_shutdown_method(self);
                        sublisp_throw($sym410$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym410$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_add_posting_daemon_method(SubLObject self, SubLObject new_posting_daemon) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_add_method(posting_daemons, new_posting_daemon);
                    cyblack_blackboard_daemon.cyblack_basic_posting_daemon_set_panel_method(new_posting_daemon, self);
                    sublisp_throw($sym416$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, new_posting_daemon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym416$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_posting_daemon_method(SubLObject self, SubLObject old_posting_daemon) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_remove_method(posting_daemons, old_posting_daemon);
                    sublisp_throw($sym421$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, old_posting_daemon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym421$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_posting_daemons_method(SubLObject self) {
        {
            SubLObject posting_daemons = get_cyblack_basic_panel_posting_daemons(self);
            return posting_daemons;
        }
    }

    public static final SubLObject cyblack_basic_panel_remove_all_direct_posting_daemons_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_clear_method(posting_daemons);
                    sublisp_throw($sym428$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_panel_method = Errors.handleThrowable(ccatch_env_var, $sym428$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_panel_get_method(SubLObject self, SubLObject key) {
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_passive_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_passive_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_passive_panel_p(SubLObject cyblack_basic_passive_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_passive_panel, CYBLACK_BASIC_PASSIVE_PANEL);
    }

    public static final SubLObject cyblack_basic_passive_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_passive_panel_method = NIL;
            SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
            try {
                try {
                    cyblack_basic_panel_initialize_method(self);
                    stimulation_type = $PASSIVE;
                    sublisp_throw($sym439$OUTER_CATCH_FOR_CYBLACK_BASIC_PASSIVE_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_passive_panel_method = Errors.handleThrowable(ccatch_env_var, $sym439$OUTER_CATCH_FOR_CYBLACK_BASIC_PASSIVE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_passive_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_singleton_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_singleton_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_singleton_panel_p(SubLObject cyblack_singleton_panel) {
        return classes.subloop_instanceof_class(cyblack_singleton_panel, CYBLACK_SINGLETON_PANEL);
    }

    public static final SubLObject cyblack_singleton_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject postings = cyblack_basic_panel_get_direct_postings_method(self);
            {
                SubLObject cdolist_list_var = postings;
                SubLObject posting_1 = NIL;
                for (posting_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting_1 = cdolist_list_var.first()) {
                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(posting_1)) {
                        cyblack_basic_panel_deactivate_posting_method(self, posting_1);
                    }
                }
            }
            return cyblack_basic_panel_add_posting_method(self, posting);
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_passive_singleton_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_passive_singleton_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_passive_singleton_panel_p(SubLObject cyblack_passive_singleton_panel) {
        return classes.subloop_instanceof_class(cyblack_passive_singleton_panel, CYBLACK_PASSIVE_SINGLETON_PANEL);
    }

    public static final SubLObject cyblack_passive_singleton_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_passive_singleton_panel_method = NIL;
            SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
            try {
                try {
                    cyblack_basic_panel_initialize_method(self);
                    stimulation_type = $PASSIVE;
                    sublisp_throw($sym451$OUTER_CATCH_FOR_CYBLACK_PASSIVE_SINGLETON_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_passive_singleton_panel_method = Errors.handleThrowable(ccatch_env_var, $sym451$OUTER_CATCH_FOR_CYBLACK_PASSIVE_SINGLETON_PANEL_METHOD);
            }
            return catch_var_for_cyblack_passive_singleton_panel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_stack_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_stack_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_stack_panel_p(SubLObject cyblack_stack_panel) {
        return classes.subloop_instanceof_class(cyblack_stack_panel, CYBLACK_STACK_PANEL);
    }

    public static final SubLObject cyblack_stack_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_stack_panel_method = NIL;
                SubLObject stimulation_type = get_cyblack_basic_panel_stimulation_type(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != posting) {
                            if (NIL != cyblack_globals.$cyblack_monitor_posts$.getDynamicValue(thread)) {
                                format(T, $str_alt347$___ADD_POSTING__S___Added_Posting, posting);
                                format(T, $str_alt348$_______S__, methods.funcall_instance_method_with_0_args(posting, LISTIFY));
                            }
                            cyblack_basic_panel_push_method(self, posting);
                            cyblack_posting_dispatch_functions.cyblack_posting_set_panel(posting, self);
                            methods.funcall_instance_method_with_0_args(posting, ON_POST);
                            if (stimulation_type == $ACTIVE) {
                                {
                                    SubLObject environment = cyblack_precondition_pattern.create_top_level_environment($ADD_POSTING, $sym353$_THE_POSTING, cyblack_application.cyblack_application_get_root_datatype(application), posting);
                                    cyblack_basic_panel_stimulate_all_knowledge_sources_method(self, environment);
                                }
                                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                            }
                            sublisp_throw($sym458$OUTER_CATCH_FOR_CYBLACK_STACK_PANEL_METHOD, posting);
                        }
                        sublisp_throw($sym458$OUTER_CATCH_FOR_CYBLACK_STACK_PANEL_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_panel_stimulation_type(self, stimulation_type);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_stack_panel_method = Errors.handleThrowable(ccatch_env_var, $sym458$OUTER_CATCH_FOR_CYBLACK_STACK_PANEL_METHOD);
                }
                return catch_var_for_cyblack_stack_panel_method;
            }
        }
    }

    public static final SubLObject get_cyblack_virtual_panel_extractor_args(SubLObject cyblack_virtual_panel_extractor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_virtual_panel_extractor, SIX_INTEGER, ARGS);
    }

    public static final SubLObject set_cyblack_virtual_panel_extractor_args(SubLObject cyblack_virtual_panel_extractor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_virtual_panel_extractor, value, SIX_INTEGER, ARGS);
    }

    public static final SubLObject get_cyblack_virtual_panel_extractor_predicator(SubLObject cyblack_virtual_panel_extractor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_virtual_panel_extractor, FIVE_INTEGER, PREDICATOR);
    }

    public static final SubLObject set_cyblack_virtual_panel_extractor_predicator(SubLObject cyblack_virtual_panel_extractor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_virtual_panel_extractor, value, FIVE_INTEGER, PREDICATOR);
    }

    public static final SubLObject get_cyblack_virtual_panel_extractor_contents(SubLObject cyblack_virtual_panel_extractor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_virtual_panel_extractor, FOUR_INTEGER, CONTENTS);
    }

    public static final SubLObject set_cyblack_virtual_panel_extractor_contents(SubLObject cyblack_virtual_panel_extractor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_virtual_panel_extractor, value, FOUR_INTEGER, CONTENTS);
    }

    public static final SubLObject get_cyblack_virtual_panel_extractor_predicator_is_method(SubLObject cyblack_virtual_panel_extractor) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_virtual_panel_extractor);
            SubLObject slot = slots.slot_assoc(PREDICATOR_IS_METHOD, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_virtual_panel_extractor, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_virtual_panel_extractor));
    }

    public static final SubLObject set_cyblack_virtual_panel_extractor_predicator_is_method(SubLObject cyblack_virtual_panel_extractor, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_virtual_panel_extractor);
            SubLObject slot = slots.slot_assoc(PREDICATOR_IS_METHOD, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_virtual_panel_extractor, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_virtual_panel_extractor, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_virtual_panel_extractor)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_virtual_panel_extractor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_virtual_panel_extractor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, PREDICATOR_IS_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, PREDICATOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, ARGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_virtual_panel_extractor_p(SubLObject cyblack_virtual_panel_extractor) {
        return classes.subloop_instanceof_class(cyblack_virtual_panel_extractor, CYBLACK_VIRTUAL_PANEL_EXTRACTOR);
    }

    public static final SubLObject cyblack_virtual_panel_extractor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject args = get_cyblack_virtual_panel_extractor_args(self);
            SubLObject predicator = get_cyblack_virtual_panel_extractor_predicator(self);
            SubLObject contents = get_cyblack_virtual_panel_extractor_contents(self);
            SubLObject predicator_is_method = get_cyblack_virtual_panel_extractor_predicator_is_method(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_visitor_initialize_method(self);
                    contents = NIL;
                    predicator_is_method = T;
                    predicator = NIL;
                    args = NIL;
                    sublisp_throw($sym472$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_args(self, args);
                            set_cyblack_virtual_panel_extractor_predicator(self, predicator);
                            set_cyblack_virtual_panel_extractor_contents(self, contents);
                            set_cyblack_virtual_panel_extractor_predicator_is_method(self, predicator_is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym472$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject args = get_cyblack_virtual_panel_extractor_args(self);
            SubLObject predicator = get_cyblack_virtual_panel_extractor_predicator(self);
            SubLObject predicator_is_method = get_cyblack_virtual_panel_extractor_predicator_is_method(self);
            try {
                try {
                    if (NIL != predicator_is_method) {
                        format(stream, $str_alt476$__PREDICATOR____call__POSTING__S_, predicator, args);
                    } else {
                        format(stream, $str_alt477$__PREDICATOR____S__POSTING____S__, predicator, args);
                    }
                    sublisp_throw($sym475$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_args(self, args);
                            set_cyblack_virtual_panel_extractor_predicator(self, predicator);
                            set_cyblack_virtual_panel_extractor_predicator_is_method(self, predicator_is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym475$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject contents = get_cyblack_virtual_panel_extractor_contents(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_visitor_set_initial_state_method(self, new_application, UNPROVIDED);
                    contents = copy_list(new_state);
                    sublisp_throw($sym482$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym482$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_get_predicator_method(SubLObject self) {
        {
            SubLObject predicator = get_cyblack_virtual_panel_extractor_predicator(self);
            return predicator;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_set_predicator_method(SubLObject self, SubLObject new_predicator, SubLObject is_method) {
        if (is_method == UNPROVIDED) {
            is_method = T;
        }
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject predicator = get_cyblack_virtual_panel_extractor_predicator(self);
            SubLObject predicator_is_method = get_cyblack_virtual_panel_extractor_predicator_is_method(self);
            try {
                try {
                    predicator = new_predicator;
                    predicator_is_method = is_method;
                    sublisp_throw($sym490$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, new_predicator);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_predicator(self, predicator);
                            set_cyblack_virtual_panel_extractor_predicator_is_method(self, predicator_is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym490$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_get_args_method(SubLObject self) {
        {
            SubLObject args = get_cyblack_virtual_panel_extractor_args(self);
            return args;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_set_args_method(SubLObject self, SubLObject new_args) {
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject args = get_cyblack_virtual_panel_extractor_args(self);
            try {
                try {
                    args = new_args;
                    sublisp_throw($sym498$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, new_args);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym498$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_extract_p_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject args = get_cyblack_virtual_panel_extractor_args(self);
            SubLObject predicator = get_cyblack_virtual_panel_extractor_predicator(self);
            SubLObject predicator_is_method = get_cyblack_virtual_panel_extractor_predicator_is_method(self);
            try {
                try {
                    if (NIL != predicator_is_method) {
                        sublisp_throw($sym502$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, classes_utilities.apply_instance_method(posting, predicator, args));
                    } else {
                        sublisp_throw($sym502$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, apply(predicator, posting, args));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_args(self, args);
                            set_cyblack_virtual_panel_extractor_predicator(self, predicator);
                            set_cyblack_virtual_panel_extractor_predicator_is_method(self, predicator_is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym502$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            SubLObject catch_var_for_cyblack_virtual_panel_extractor_method = NIL;
            SubLObject contents = get_cyblack_virtual_panel_extractor_contents(self);
            try {
                try {
                    if (NIL != cyblack_virtual_panel_extractor_extract_p_method(self, v_cyblack_posting)) {
                        contents = cons(v_cyblack_posting, contents);
                    }
                    sublisp_throw($sym506$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_virtual_panel_extractor_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_virtual_panel_extractor_method = Errors.handleThrowable(ccatch_env_var, $sym506$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD);
            }
            return catch_var_for_cyblack_virtual_panel_extractor_method;
        }
    }

    public static final SubLObject cyblack_virtual_panel_extractor_get_final_state_method(SubLObject self) {
        {
            SubLObject contents = get_cyblack_virtual_panel_extractor_contents(self);
            return reverse(contents);
        }
    }

    public static final SubLObject cyblack_virtual_panel_p(SubLObject cyblack_virtual_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_virtual_panel, CYBLACK_VIRTUAL_PANEL);
    }

    public static final SubLObject cyblack_virtual_panel_template_p(SubLObject cyblack_virtual_panel_template) {
        return interfaces.subloop_instanceof_interface(cyblack_virtual_panel_template, CYBLACK_VIRTUAL_PANEL_TEMPLATE);
    }

    public static final SubLObject get_cyblack_basic_virtual_panel_predicator(SubLObject cyblack_basic_virtual_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_virtual_panel, EIGHT_INTEGER, PREDICATOR);
    }

    public static final SubLObject set_cyblack_basic_virtual_panel_predicator(SubLObject cyblack_basic_virtual_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_virtual_panel, value, EIGHT_INTEGER, PREDICATOR);
    }

    public static final SubLObject get_cyblack_basic_virtual_panel_base_panel(SubLObject cyblack_basic_virtual_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_virtual_panel, SEVEN_INTEGER, BASE_PANEL);
    }

    public static final SubLObject set_cyblack_basic_virtual_panel_base_panel(SubLObject cyblack_basic_virtual_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_virtual_panel, value, SEVEN_INTEGER, BASE_PANEL);
    }

    public static final SubLObject get_cyblack_basic_virtual_panel_contents(SubLObject cyblack_basic_virtual_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_virtual_panel, SIX_INTEGER, CONTENTS);
    }

    public static final SubLObject set_cyblack_basic_virtual_panel_contents(SubLObject cyblack_basic_virtual_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_virtual_panel, value, SIX_INTEGER, CONTENTS);
    }

    public static final SubLObject get_cyblack_basic_virtual_panel_args(SubLObject cyblack_basic_virtual_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_virtual_panel, FIVE_INTEGER, ARGS);
    }

    public static final SubLObject set_cyblack_basic_virtual_panel_args(SubLObject cyblack_basic_virtual_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_virtual_panel, value, FIVE_INTEGER, ARGS);
    }

    public static final SubLObject get_cyblack_basic_virtual_panel_is_method(SubLObject cyblack_basic_virtual_panel) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_virtual_panel);
            SubLObject slot = slots.slot_assoc(IS_METHOD, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_virtual_panel, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_virtual_panel));
    }

    public static final SubLObject set_cyblack_basic_virtual_panel_is_method(SubLObject cyblack_basic_virtual_panel, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_virtual_panel);
            SubLObject slot = slots.slot_assoc(IS_METHOD, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_virtual_panel, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_virtual_panel, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_virtual_panel)));
        return value;
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_direct_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_all_direct_posting_daemons_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_posting_daemons_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_posting_daemon_method(SubLObject self, SubLObject old_posting_daemon) {
        return old_posting_daemon;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_posting_daemon_method(SubLObject self, SubLObject new_posting_daemon) {
        return new_posting_daemon;
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_direct_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            SubLObject template_contents = cyblack_basic_virtual_panel_get_contents_internal_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_posting = NIL;
            for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_posting)) {
                    methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, template_posting);
                    if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, template_posting)) {
                        return posting_visitor;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_iterate_over_all_direct_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            SubLObject template_contents = cyblack_basic_virtual_panel_get_contents_internal_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_posting = NIL;
            for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_posting)) {
                    methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, template_posting);
                    if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, template_posting)) {
                        return posting_visitor;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_all_active_postings_method(SubLObject self) {
        return cyblack_basic_virtual_panel_get_active_contents_internal_method(self);
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_all_postings_method(SubLObject self) {
        return cyblack_basic_virtual_panel_get_contents_internal_method(self);
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_direct_postings_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_direct_active_postings_method(SubLObject self) {
        return cyblack_basic_virtual_panel_get_active_contents_internal_method(self);
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_direct_postings_method(SubLObject self) {
        return cyblack_basic_virtual_panel_get_contents_internal_method(self);
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_direct_postings_method(SubLObject self, SubLObject postings) {
        return postings;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_direct_posting_method(SubLObject self, SubLObject posting) {
        return posting;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_direct_posting_method(SubLObject self, SubLObject posting) {
        return posting;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_all_knowledge_sources_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            if (NIL != template_base_panel) {
                return cyblack_panel_dispatch_functions.cyblack_panel_get_all_knowledge_sources(template_base_panel);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            if (NIL != template_base_panel) {
                return cyblack_panel_dispatch_functions.cyblack_panel_get_all_knowledge_sources(template_base_panel);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_direct_knowledge_sources_method(SubLObject self, SubLObject knowledge_sources) {
        return knowledge_sources;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_direct_knowledge_sources_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        return knowledge_source;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        return knowledge_source;
    }

    public static final SubLObject cyblack_basic_virtual_panel_on_remove_last_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_on_add_first_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        return new_datatype;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_datatype_method(SubLObject self) {
        {
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            if (NIL != template_base_panel) {
                return cyblack_panel_dispatch_functions.cyblack_panel_get_datatype(template_base_panel);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_posting_method(SubLObject self, SubLObject posting) {
        return posting;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_posting_method(SubLObject self, SubLObject posting) {
        return posting;
    }

    public static final SubLObject cyblack_basic_virtual_panel_stimulate_all_posting_daemons_method(SubLObject self, SubLObject environment, SubLObject posting) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        if (NIL != environment) {
            {
                SubLObject goal_satisfaction_daemon_visitor = object.new_object_instance(CYBLACK_GOAL_SATISFACTION_VISITOR);
                cyblack_blackboard_daemon.cyblack_goal_satisfaction_visitor_set_initial_state_method(goal_satisfaction_daemon_visitor, cyblack_object.cyblack_object_get_application_method(self), environment, posting);
                cyblack_basic_virtual_panel_iterate_over_all_posting_daemons_method(self, goal_satisfaction_daemon_visitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_stimulate_all_monitors_method(SubLObject self, SubLObject environments) {
        if (environments == UNPROVIDED) {
            environments = NIL;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_stimulate_all_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_stimulate_direct_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_sub_panel_method(SubLObject self, SubLObject old_sub_panel) {
        return old_sub_panel;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_sub_panel_method(SubLObject self, SubLObject new_sub_panel) {
        return new_sub_panel;
    }

    public static final SubLObject cyblack_basic_virtual_panel_remove_super_panel_method(SubLObject self, SubLObject old_super_panel) {
        return old_super_panel;
    }

    public static final SubLObject cyblack_basic_virtual_panel_add_super_panel_method(SubLObject self, SubLObject new_super_panel) {
        return new_super_panel;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_all_sub_panels_method(SubLObject self, SubLObject excluded_panels) {
        if (excluded_panels == UNPROVIDED) {
            excluded_panels = NIL;
        }
        {
            SubLObject collected_panels = NIL;
            SubLObject current_sub_panels = cyblack_basic_virtual_panel_get_sub_panels_method(self);
            SubLObject current_panel = NIL;
            while (NIL != current_sub_panels) {
                current_panel = current_sub_panels.first();
                current_sub_panels = current_sub_panels.rest();
                if (!((NIL != subl_promotions.memberP(current_panel, excluded_panels, UNPROVIDED, UNPROVIDED)) || (NIL != member(current_panel, collected_panels, UNPROVIDED, UNPROVIDED)))) {
                    collected_panels = cons(current_panel, collected_panels);
                    {
                        SubLObject local_sub_panels = methods.funcall_instance_method_with_0_args(current_panel, GET_SUB_PANELS);
                        if (NIL != local_sub_panels) {
                            current_sub_panels = nconc(local_sub_panels, current_sub_panels);
                        }
                    }
                }
            } 
            return collected_panels;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_sub_panels_method(SubLObject self) {
        {
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            if (NIL != template_base_panel) {
                return cyblack_panel_dispatch_functions.cyblack_panel_get_sub_panels(template_base_panel);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_super_panels_method(SubLObject self) {
        {
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            if (NIL != template_base_panel) {
                return cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_base_panel);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_derive_contents_internal_method(SubLObject self) {
        {
            SubLObject template_visitor = object.new_object_instance(CYBLACK_VIRTUAL_PANEL_EXTRACTOR);
            SubLObject template_base_panel = cyblack_basic_virtual_panel_get_base_panel_method(self);
            cyblack_virtual_panel_extractor_set_initial_state_method(template_visitor, NIL, UNPROVIDED);
            cyblack_virtual_panel_extractor_set_args_method(template_visitor, cyblack_basic_virtual_panel_get_args_method(self));
            cyblack_virtual_panel_extractor_set_predicator_method(template_visitor, cyblack_basic_virtual_panel_get_subset_predicator_method(self), cyblack_basic_virtual_panel_predicator_is_method_method(self));
            cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(template_base_panel, template_visitor);
            cyblack_basic_virtual_panel_set_contents_internal_method(self, cyblack_virtual_panel_extractor_get_final_state_method(template_visitor));
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_subset_predicator_method(SubLObject self, SubLObject new_predicator, SubLObject new_is_method) {
        if (new_is_method == UNPROVIDED) {
            new_is_method = T;
        }
        cyblack_basic_virtual_panel_set_subset_predicator_method(self, new_predicator, new_is_method);
        if ((NIL != new_predicator) && (NIL != cyblack_basic_virtual_panel_get_base_panel_method(self))) {
            cyblack_basic_virtual_panel_derive_contents_internal_method(self);
        }
        return new_predicator;
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_base_panel_method(SubLObject self, SubLObject new_base_panel) {
        cyblack_basic_virtual_panel_set_base_panel_internal_method(self, new_base_panel);
        if ((NIL != new_base_panel) && (NIL != cyblack_basic_virtual_panel_get_subset_predicator_method(self))) {
            cyblack_basic_virtual_panel_derive_contents_internal_method(self);
        }
        return new_base_panel;
    }

    public static final SubLObject cyblack_basic_virtual_panel_initialize_qua_virtual_panel_template_method(SubLObject self) {
        cyblack_basic_virtual_panel_set_base_panel_internal_method(self, NIL);
        cyblack_basic_virtual_panel_set_subset_predicator_internal_method(self, NIL, UNPROVIDED);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_virtual_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_virtual_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_VIRTUAL_PANEL, IS_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_VIRTUAL_PANEL, ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_VIRTUAL_PANEL, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_VIRTUAL_PANEL, BASE_PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_VIRTUAL_PANEL, PREDICATOR, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_p(SubLObject cyblack_basic_virtual_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_virtual_panel, CYBLACK_BASIC_VIRTUAL_PANEL);
    }

    public static final SubLObject cyblack_basic_virtual_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject is_method = get_cyblack_basic_virtual_panel_is_method(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    cyblack_basic_virtual_panel_initialize_qua_virtual_panel_template_method(self);
                    is_method = T;
                    sublisp_throw($sym606$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_is_method(self, is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym606$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_args_method(SubLObject self) {
        {
            SubLObject args = get_cyblack_basic_virtual_panel_args(self);
            return args;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_args_method(SubLObject self, SubLObject new_args) {
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject args = get_cyblack_basic_virtual_panel_args(self);
            try {
                try {
                    args = new_args;
                    sublisp_throw($sym610$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, new_args);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_args(self, args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym610$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_contents_internal_method(SubLObject self) {
        {
            SubLObject contents = get_cyblack_basic_virtual_panel_contents(self);
            return contents;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_active_contents_internal_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_contents_internal_method(SubLObject self, SubLObject new_contents) {
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject contents = get_cyblack_basic_virtual_panel_contents(self);
            try {
                try {
                    contents = new_contents;
                    sublisp_throw($sym619$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, new_contents);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym619$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_base_panel_method(SubLObject self) {
        {
            SubLObject base_panel = get_cyblack_basic_virtual_panel_base_panel(self);
            return base_panel;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_base_panel_internal_method(SubLObject self, SubLObject new_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject base_panel = get_cyblack_basic_virtual_panel_base_panel(self);
            try {
                try {
                    base_panel = new_panel;
                    if (NIL != new_panel) {
                        cyblack_object.cyblack_object_set_application_method(self, cyblack_object.cyblack_object_get_application_method(new_panel));
                    }
                    sublisp_throw($sym627$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, new_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_base_panel(self, base_panel);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym627$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_subset_predicator_method(SubLObject self) {
        {
            SubLObject predicator = get_cyblack_basic_virtual_panel_predicator(self);
            return predicator;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_subset_predicator_internal_method(SubLObject self, SubLObject new_predicator, SubLObject new_is_method) {
        if (new_is_method == UNPROVIDED) {
            new_is_method = T;
        }
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject predicator = get_cyblack_basic_virtual_panel_predicator(self);
            SubLObject is_method = get_cyblack_basic_virtual_panel_is_method(self);
            try {
                try {
                    predicator = new_predicator;
                    is_method = (NIL != new_is_method) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym633$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, new_predicator);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_predicator(self, predicator);
                            set_cyblack_basic_virtual_panel_is_method(self, is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym633$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_predicator_is_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_virtual_panel_method = NIL;
            SubLObject is_method = get_cyblack_basic_virtual_panel_is_method(self);
            try {
                try {
                    sublisp_throw($sym636$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD, is_method);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_virtual_panel_is_method(self, is_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_virtual_panel_method = Errors.handleThrowable(ccatch_env_var, $sym636$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_virtual_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_method(SubLObject self, SubLObject key) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_get_stimulation_type_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_set_stimulation_type_method(SubLObject self, SubLObject new_stimulation_type) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_deactivate_posting_method(SubLObject self, SubLObject posting) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_virtual_panel_activate_posting_method(SubLObject self, SubLObject posting) {
        return NIL;
    }

    public static final SubLObject cyblack_sequence_panel_p(SubLObject cyblack_sequence_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_sequence_panel, CYBLACK_SEQUENCE_PANEL);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_posting_daemons(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, SEVENTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_posting_daemons(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, SEVENTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_datatype(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, SIXTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_datatype(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, SIXTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_direct_knowledge_sources(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, FIFTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_direct_knowledge_sources(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, FIFTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_sub_panels(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, FOURTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_sub_panels(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, FOURTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_super_panels(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, THIRTEEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_super_panels(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, THIRTEEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_stimulation_type(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_instance_slot(cyblack_basic_sequence_panel, TWELVE_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_stimulation_type(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_sequence_panel, value, TWELVE_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_sequence_class(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, ELEVEN_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_sequence_class(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, ELEVEN_INTEGER, SEQUENCE_CLASS);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_growth_factor(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, TEN_INTEGER, GROWTH_FACTOR);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_growth_factor(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, TEN_INTEGER, GROWTH_FACTOR);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_default_value(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, NINE_INTEGER, DEFAULT_VALUE);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_default_value(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, NINE_INTEGER, DEFAULT_VALUE);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_largest_index(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, EIGHT_INTEGER, LARGEST_INDEX);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_largest_index(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, EIGHT_INTEGER, LARGEST_INDEX);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_storage_size(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, SEVEN_INTEGER, STORAGE_SIZE);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_storage_size(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, SEVEN_INTEGER, STORAGE_SIZE);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_internal_storage(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, SIX_INTEGER, INTERNAL_STORAGE);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_internal_storage(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, SIX_INTEGER, INTERNAL_STORAGE);
    }

    public static final SubLObject get_cyblack_basic_sequence_panel_marks(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_panel, FIVE_INTEGER, MARKS);
    }

    public static final SubLObject set_cyblack_basic_sequence_panel_marks(SubLObject cyblack_basic_sequence_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_panel, value, FIVE_INTEGER, MARKS);
    }

    public static final SubLObject cyblack_basic_sequence_panel_activate_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_visitor = object.new_object_instance(CYBLACK_STATE_CHANGE_KS_VISITOR);
                        cyblack_ks.cyblack_state_change_ks_visitor_set_initial_state_method(template_visitor, application, posting, $POST);
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_knowledge_sources(self, template_visitor);
                        sublisp_throw($sym660$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym660$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_deactivate_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_visitor = object.new_object_instance(CYBLACK_STATE_CHANGE_KS_VISITOR);
                        cyblack_ks.cyblack_state_change_ks_visitor_set_initial_state_method(template_visitor, application, posting, $REMOVE_POST);
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_knowledge_sources(self, template_visitor);
                        sublisp_throw($sym662$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym662$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt93$___ITERATE_OVER_ALL_POSTING_DAEMO, new SubLObject[]{ self, self, daemon_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_posting_daemons(template_current_panel, daemon_visitor);
                    }
                } 
                return daemon_visitor;
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_direct_posting_daemons_method(SubLObject self, SubLObject daemon_visitor) {
        {
            SubLObject template_posting_daemons = cyblack_basic_sequence_panel_get_posting_daemons_method(self);
            if (template_posting_daemons.isList()) {
                {
                    SubLObject template_current_cons = template_posting_daemons;
                    SubLObject template_not_finished = T;
                    SubLObject template_daemon = NIL;
                    while ((NIL != template_not_finished) && (NIL != template_current_cons)) {
                        template_daemon = template_current_cons.first();
                        if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                            methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                            template_current_cons = template_current_cons.rest();
                        } else {
                            template_not_finished = NIL;
                        }
                    } 
                }
            } else
                if (NIL != subloop_collections.collection_template_p(template_posting_daemons)) {
                    {
                        SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_posting_daemons, ALLOCATE_ENUMERATOR);
                        if (NIL == subloop_collections.enumerator_template_empty_p(template_enumerator)) {
                            {
                                SubLObject template_daemon = subloop_collections.enumerator_template_first(template_enumerator);
                                SubLObject template_not_finished = T;
                                if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                    methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                    while ((NIL != template_not_finished) && (NIL == subloop_collections.enumerator_template_last_p(template_enumerator))) {
                                        template_daemon = subloop_collections.enumerator_template_next(template_enumerator);
                                        if (NIL != methods.funcall_instance_method_with_1_args(daemon_visitor, CONTINUE_P, template_daemon)) {
                                            methods.funcall_instance_method_with_1_args(daemon_visitor, VISIT, template_daemon);
                                        } else {
                                            template_not_finished = NIL;
                                        }
                                    } 
                                }
                            }
                        }
                        methods.funcall_instance_method_with_1_args(template_posting_daemons, DEALLOCATE_ENUMERATOR, template_enumerator);
                    }
                }

            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_visitor_is_cyblack_state_change_ks_visitor = cyblack_ks.cyblack_state_change_ks_visitor_p(ks_visitor);
            SubLObject template_current_panel = NIL;
            while (NIL != template_panel_queue) {
                template_current_panel = template_panel_queue.first();
                template_panel_queue = template_panel_queue.rest();
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                    if (NIL != template_visitor_is_cyblack_state_change_ks_visitor) {
                        cyblack_ks.cyblack_state_change_ks_visitor_set_panel_method(ks_visitor, template_current_panel);
                    }
                    cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_knowledge_sources(template_current_panel, ks_visitor);
                }
            } 
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_direct_knowledge_sources_method(SubLObject self, SubLObject ks_visitor) {
        {
            SubLObject template_direct_knowledge_sources = cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(self);
            if (NIL != template_direct_knowledge_sources) {
                {
                    SubLObject cdolist_list_var = template_direct_knowledge_sources;
                    SubLObject template_ks = NIL;
                    for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args(ks_visitor, VISIT, template_ks);
                        if (NIL == methods.funcall_instance_method_with_1_args(ks_visitor, CONTINUE_P, template_ks)) {
                            return ks_visitor;
                        }
                    }
                }
            }
            return ks_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_panel_queue = list(self);
                SubLObject template_visited_panels = NIL;
                SubLObject template_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt103$___ITERATE_OVER_ALL_POSTINGS__S__, new SubLObject[]{ self, self, posting_visitor });
                }
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_panel_queue = nconc(template_panel_queue, methods.funcall_instance_method_with_0_args(template_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_postings(template_current_panel, posting_visitor);
                    }
                } 
                return posting_visitor;
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_iterate_over_all_direct_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt105$___ITERATE_OVER_ALL_DIRECT_POSTIN, self, posting_visitor);
            }
            {
                SubLObject template_direct_postings = cyblack_basic_sequence_panel_get_direct_postings_method(self);
                SubLObject cdolist_list_var = template_direct_postings;
                SubLObject template_posting = NIL;
                for (template_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_posting = cdolist_list_var.first()) {
                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_posting)) {
                        methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, template_posting);
                        if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, template_posting)) {
                            return posting_visitor;
                        }
                    }
                }
            }
            return posting_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_all_active_postings_method(SubLObject self) {
        {
            SubLObject template_all_active_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_active_postings = nconc(template_all_active_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_active_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_active_postings;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_all_postings_method(SubLObject self) {
        {
            SubLObject template_all_postings = NIL;
            SubLObject template_panel_queue = list(self);
            SubLObject template_visited_panels = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_panel_queue) {
                    template_current_panel = template_panel_queue.first();
                    template_panel_queue = template_panel_queue.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_POSTINGS)) {
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_POSTINGS);
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        template_all_postings = nconc(template_all_postings, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_POSTINGS);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_all_postings;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_direct_postings_method(SubLObject self, SubLObject postings) {
        {
            SubLObject cdolist_list_var = postings;
            SubLObject posting = NIL;
            for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                cyblack_basic_sequence_panel_add_direct_posting_method(self, posting);
            }
            return postings;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_super_panels = list(self);
            SubLObject template_knowledge_sources = NIL;
            SubLObject template_visited_panels = NIL;
            SubLObject template_direct_knowledge_sources = NIL;
            SubLObject template_new_knowledge_sources = NIL;
            SubLObject template_current_panel = NIL;
            try {
                while (NIL != template_super_panels) {
                    template_current_panel = template_super_panels.first();
                    template_super_panels = template_super_panels.rest();
                    if (NIL == cyblack_panel_dispatch_functions.cyblack_panel_has_mark_p(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES)) {
                        template_visited_panels = cons(template_current_panel, template_visited_panels);
                        cyblack_panel_dispatch_functions.cyblack_panel_add_mark(template_current_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                        template_direct_knowledge_sources = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_knowledge_sources(template_current_panel);
                        template_new_knowledge_sources = NIL;
                        {
                            SubLObject list_expression = template_direct_knowledge_sources;
                            if (NIL == list_expression) {
                                template_new_knowledge_sources = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    template_new_knowledge_sources = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject template_ks = list_expression.first();
                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            template_new_knowledge_sources = NIL;
                                            {
                                                SubLObject cdolist_list_var = list_expression;
                                                SubLObject template_ks = NIL;
                                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                                    result = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                    if (NIL != result) {
                                                        if (NIL != tail_cons) {
                                                            rplacd(tail_cons, result);
                                                            tail_cons = last(result, UNPROVIDED);
                                                        } else {
                                                            template_new_knowledge_sources = (NIL != member(template_ks, template_knowledge_sources, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (NIL)) : list(template_ks);
                                                            tail_cons = last(template_new_knowledge_sources, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }


                        }
                        if (NIL != template_new_knowledge_sources) {
                            template_knowledge_sources = nconc(template_knowledge_sources, template_new_knowledge_sources);
                        }
                        template_super_panels = nconc(template_super_panels, copy_list(cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel)));
                    }
                } 
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        {
                            SubLObject cdolist_list_var = template_visited_panels;
                            SubLObject template_visited_panel = NIL;
                            for (template_visited_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_visited_panel = cdolist_list_var.first()) {
                                cyblack_panel_dispatch_functions.cyblack_panel_remove_mark(template_visited_panel, $GET_ALL_KNOWLEDGE_SOURCES);
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return template_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_direct_knowledge_sources_method(SubLObject self, SubLObject knowledge_sources) {
        cyblack_basic_sequence_panel_remove_all_knowledge_sources_method(self);
        {
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_basic_sequence_panel_add_direct_knowledge_source_method(self, knowledge_source);
            }
        }
        return knowledge_sources;
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject knowledge_sources = cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = knowledge_sources;
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                cyblack_basic_sequence_panel_remove_direct_knowledge_source_method(self, knowledge_source);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_on_remove_last_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_on_add_first_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_stimulate_all_posting_daemons_method(SubLObject self, SubLObject environment, SubLObject posting) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        if (NIL != environment) {
            {
                SubLObject goal_satisfaction_daemon_visitor = object.new_object_instance(CYBLACK_GOAL_SATISFACTION_VISITOR);
                cyblack_blackboard_daemon.cyblack_goal_satisfaction_visitor_set_initial_state_method(goal_satisfaction_daemon_visitor, cyblack_object.cyblack_object_get_application_method(self), environment, posting);
                cyblack_basic_sequence_panel_iterate_over_all_posting_daemons_method(self, goal_satisfaction_daemon_visitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_stimulate_all_monitors_method(SubLObject self, SubLObject environments) {
        if (environments == UNPROVIDED) {
            environments = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_basic_sequence_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != cyblack_ks.cyblack_monitoring_ks_p(template_ks)) {
                    methods.funcall_instance_method_with_1_args(template_ks, PERFORM_ACTION, environments);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_stimulate_all_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_all_knowledge_sources = list_utilities.unique_elements(cyblack_basic_sequence_panel_get_all_knowledge_sources_method(self), UNPROVIDED);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_stimulate_direct_knowledge_sources_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject template_direct_knowledge_sources = cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(self);
            SubLObject cdolist_list_var = template_direct_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_stimulate(template_ks, environment);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_all_sub_panels_method(SubLObject self, SubLObject excluded_panels) {
        if (excluded_panels == UNPROVIDED) {
            excluded_panels = NIL;
        }
        {
            SubLObject collected_panels = NIL;
            SubLObject current_sub_panels = cyblack_basic_sequence_panel_get_sub_panels_method(self);
            SubLObject current_panel = NIL;
            while (NIL != current_sub_panels) {
                current_panel = current_sub_panels.first();
                current_sub_panels = current_sub_panels.rest();
                if (!((NIL != subl_promotions.memberP(current_panel, excluded_panels, UNPROVIDED, UNPROVIDED)) || (NIL != member(current_panel, collected_panels, UNPROVIDED, UNPROVIDED)))) {
                    collected_panels = cons(current_panel, collected_panels);
                    {
                        SubLObject local_sub_panels = methods.funcall_instance_method_with_0_args(current_panel, GET_SUB_PANELS);
                        if (NIL != local_sub_panels) {
                            current_sub_panels = nconc(local_sub_panels, current_sub_panels);
                        }
                    }
                }
            } 
            return collected_panels;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_index_of_previous_non_nil_element_method(SubLObject self, SubLObject start_index) {
        {
            SubLObject template_internal_storage = cyblack_basic_sequence_panel_get_internal_storage_method(self);
            if (NIL == template_internal_storage) {
                return NIL;
            }
            {
                SubLObject template_length = cyblack_basic_sequence_panel_get_length_method(self);
                if (template_length.isZero()) {
                    return NIL;
                }
                start_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER));
                {
                    SubLObject template_index = start_index;
                    while (template_index.numGE(ZERO_INTEGER)) {
                        if (NIL != aref(template_internal_storage, template_index)) {
                            return template_index;
                        }
                        template_index = subtract(template_index, ONE_INTEGER);
                    } 
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_index_of_next_non_nil_element_method(SubLObject self, SubLObject start_index) {
        {
            SubLObject template_internal_storage = cyblack_basic_sequence_panel_get_internal_storage_method(self);
            if (NIL == template_internal_storage) {
                return NIL;
            }
            {
                SubLObject template_length = cyblack_basic_sequence_panel_get_length_method(self);
                if (template_length.isZero()) {
                    return NIL;
                }
                if (start_index.numGE(template_length)) {
                    return NIL;
                }
                start_index = min(max(start_index, ZERO_INTEGER), subtract(template_length, ONE_INTEGER));
                {
                    SubLObject template_index = start_index;
                    while (template_index.numL(template_length)) {
                        if (NIL != aref(template_internal_storage, template_index)) {
                            return template_index;
                        }
                        template_index = add(template_index, ONE_INTEGER);
                    } 
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_all_null_p_method(SubLObject self) {
        {
            SubLObject template_storage = cyblack_basic_sequence_panel_get_internal_storage_method(self);
            SubLObject template_length = cyblack_basic_sequence_panel_get_length_method(self);
            SubLObject template_index = NIL;
            for (template_index = ZERO_INTEGER; template_index.numL(template_length); template_index = add(template_index, ONE_INTEGER)) {
                if (NIL != aref(template_storage, template_index)) {
                    return NIL;
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_deallocate_enumerator_method(SubLObject self, SubLObject old_enumerator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_sequences.basic_variable_length_sequence_enumerator_p(old_enumerator)) {
                    Errors.error($str_alt695$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
                }
            }
            subloop_sequences.basic_variable_length_sequence_enumerator_set_sequence_method(old_enumerator, NIL);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_allocate_enumerator_method(SubLObject self) {
        {
            SubLObject template_enumerator = object.new_class_instance(BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
            subloop_sequences.basic_variable_length_sequence_enumerator_set_sequence_method(template_enumerator, self);
            return template_enumerator;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_method(SubLObject self, SubLObject new_element) {
        return cyblack_basic_sequence_panel_set_nth_method(self, add(cyblack_basic_sequence_panel_get_largest_index_method(self), ONE_INTEGER), new_element);
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_subsequence_method(SubLObject self, SubLObject start_index, SubLObject end_index) {
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!start_index.numGE(ZERO_INTEGER)) {
                    Errors.error($str_alt705$_GET_SUBSEQUENCE__S___Index__S_is, self, start_index);
                }
            }
            {
                SubLObject template_length = cyblack_basic_sequence_panel_get_length_method(self);
                if (NIL == end_index) {
                    end_index = template_length;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!end_index.numLE(template_length)) {
                        Errors.error($str_alt706$_GET_SUBSEQUENCE__S___End_index__, end_index, template_length);
                    }
                }
                {
                    SubLObject template_class = cyblack_basic_sequence_panel_get_sequence_class_method(self);
                    SubLObject template_instance = object.new_object_instance(template_class);
                    SubLObject template_original_index = start_index;
                    SubLObject template_index_count = subtract(end_index, start_index);
                    SubLObject template_index = NIL;
                    for (template_index = ZERO_INTEGER; template_index.numL(template_index_count); template_index = add(template_index, ONE_INTEGER)) {
                        methods.funcall_instance_method_with_2_args(template_instance, SET_NTH, template_index, cyblack_basic_sequence_panel_get_nth_method(self, template_original_index, UNPROVIDED));
                        template_original_index = add(template_original_index, ONE_INTEGER);
                    }
                    return template_instance;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_nth_method(SubLObject self, SubLObject n, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!n.numGE(ZERO_INTEGER)) {
                    Errors.error($str_alt710$_SET_NTH__S___Index__S_is_less_th, self, n);
                }
            }
            {
                SubLObject template_largest_index = cyblack_basic_sequence_panel_get_largest_index_method(self);
                SubLObject template_storage_size = cyblack_basic_sequence_panel_get_storage_size_method(self);
                if (n.numGE(template_storage_size)) {
                    {
                        SubLObject template_new_storage_size = multiply(cyblack_basic_sequence_panel_get_growth_factor_method(self), n);
                        SubLObject template_old_storage = cyblack_basic_sequence_panel_get_internal_storage_method(self);
                        SubLObject template_default_value = cyblack_basic_sequence_panel_get_default_value_method(self);
                        SubLObject template_new_storage = make_vector(template_new_storage_size, template_default_value);
                        SubLObject cdotimes_end_var = add(template_largest_index, ONE_INTEGER);
                        SubLObject template_index = NIL;
                        for (template_index = ZERO_INTEGER; template_index.numL(cdotimes_end_var); template_index = add(template_index, ONE_INTEGER)) {
                            set_aref(template_new_storage, template_index, aref(template_old_storage, template_index));
                        }
                        cyblack_basic_sequence_panel_record_index_method(self, n);
                        cyblack_basic_sequence_panel_set_internal_storage_method(self, template_new_storage);
                        cyblack_basic_sequence_panel_set_storage_size_method(self, template_new_storage_size);
                        set_aref(template_new_storage, n, new_value);
                    }
                } else {
                    cyblack_basic_sequence_panel_record_index_method(self, n);
                    set_aref(cyblack_basic_sequence_panel_get_internal_storage_method(self), n, new_value);
                }
                return new_value;
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_nth_method(SubLObject self, SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == UNPROVIDED) {
            out_of_range_value = NIL;
        }
        if (n.numL(ZERO_INTEGER) || n.numG(cyblack_basic_sequence_panel_get_largest_index_method(self))) {
            return out_of_range_value;
        }
        return aref(cyblack_basic_sequence_panel_get_internal_storage_method(self), n);
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_length_method(SubLObject self) {
        return add(cyblack_basic_sequence_panel_get_largest_index_method(self), ONE_INTEGER);
    }

    public static final SubLObject cyblack_basic_sequence_panel_clear_method(SubLObject self) {
        {
            SubLObject template_storage = cyblack_basic_sequence_panel_get_internal_storage_method(self);
            SubLObject template_size = cyblack_basic_sequence_panel_get_storage_size_method(self);
            SubLObject template_default_value = cyblack_basic_sequence_panel_get_default_value_method(self);
            SubLObject template_index = NIL;
            for (template_index = ZERO_INTEGER; template_index.numL(template_size); template_index = add(template_index, ONE_INTEGER)) {
                set_aref(template_storage, template_index, template_default_value);
            }
            cyblack_basic_sequence_panel_set_largest_index_method(self, MINUS_ONE_INTEGER);
            return template_default_value;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_has_mark_p_method(SubLObject self, SubLObject mark) {
        return NIL != member(mark, cyblack_basic_sequence_panel_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_mark_method(SubLObject self, SubLObject mark) {
        cyblack_basic_sequence_panel_set_marks_internal_method(self, delete(mark, cyblack_basic_sequence_panel_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return mark;
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_mark_method(SubLObject self, SubLObject mark) {
        {
            SubLObject list_of_marks = cyblack_basic_sequence_panel_get_marks_internal_method(self);
            if (NIL == subl_promotions.memberP(mark, list_of_marks, UNPROVIDED, UNPROVIDED)) {
                list_of_marks = cons(mark, list_of_marks);
                cyblack_basic_sequence_panel_set_marks_internal_method(self, list_of_marks);
            }
            return mark;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_clear_all_marks_method(SubLObject self) {
        cyblack_basic_sequence_panel_set_marks_internal_method(self, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_sequence_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_sequence_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, STORAGE_SIZE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, LARGEST_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DEFAULT_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, GROWTH_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SEQUENCE_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_p(SubLObject cyblack_basic_sequence_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_sequence_panel, CYBLACK_BASIC_SEQUENCE_PANEL);
    }

    public static final SubLObject cyblack_basic_sequence_panel_initialize_qua_markable_method(SubLObject self) {
        set_cyblack_basic_panel_marks(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_marks_internal_method(SubLObject self) {
        {
            SubLObject marks = get_cyblack_basic_sequence_panel_marks(self);
            return marks;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_marks_internal_method(SubLObject self, SubLObject new_marks) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject marks = get_cyblack_basic_sequence_panel_marks(self);
            try {
                try {
                    marks = new_marks;
                    sublisp_throw($sym732$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_marks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_marks(self, marks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym732$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_contents_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    if (NIL == internal_storage) {
                        sublisp_throw($sym735$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                    }
                    {
                        SubLObject length = cyblack_basic_sequence_panel_get_length_method(self);
                        SubLObject element = NIL;
                        SubLObject contents = NIL;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                            element = aref(internal_storage, i);
                            if (NIL != element) {
                                contents = cons(element, contents);
                            }
                        }
                        sublisp_throw($sym735$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, nreverse(contents));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym735$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_internal_storage_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    sublisp_throw($sym739$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, internal_storage);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym739$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_internal_storage_method(SubLObject self, SubLObject new_internal_storage) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    internal_storage = new_internal_storage;
                    sublisp_throw($sym744$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_internal_storage);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym744$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_storage_size_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject storage_size = get_cyblack_basic_sequence_panel_storage_size(self);
            try {
                try {
                    sublisp_throw($sym748$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, storage_size);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_storage_size(self, storage_size);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym748$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_storage_size_method(SubLObject self, SubLObject new_storage_size) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject storage_size = get_cyblack_basic_sequence_panel_storage_size(self);
            try {
                try {
                    storage_size = new_storage_size;
                    sublisp_throw($sym753$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_storage_size);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_storage_size(self, storage_size);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym753$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_largest_index_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject largest_index = get_cyblack_basic_sequence_panel_largest_index(self);
            try {
                try {
                    sublisp_throw($sym757$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, largest_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_largest_index(self, largest_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym757$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_largest_index_method(SubLObject self, SubLObject new_largest_index) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject largest_index = get_cyblack_basic_sequence_panel_largest_index(self);
            try {
                try {
                    largest_index = new_largest_index;
                    sublisp_throw($sym762$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_largest_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_largest_index(self, largest_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym762$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_record_index_method(SubLObject self, SubLObject current_index) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject largest_index = get_cyblack_basic_sequence_panel_largest_index(self);
            try {
                try {
                    largest_index = max(largest_index, current_index);
                    sublisp_throw($sym767$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, largest_index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_largest_index(self, largest_index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym767$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_default_value_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject default_value = get_cyblack_basic_sequence_panel_default_value(self);
            try {
                try {
                    sublisp_throw($sym771$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, default_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_default_value(self, default_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym771$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_default_value_method(SubLObject self, SubLObject new_default_value) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject default_value = get_cyblack_basic_sequence_panel_default_value(self);
            try {
                try {
                    default_value = new_default_value;
                    sublisp_throw($sym776$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_default_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_default_value(self, default_value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym776$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_growth_factor_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject growth_factor = get_cyblack_basic_sequence_panel_growth_factor(self);
            try {
                try {
                    sublisp_throw($sym780$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, growth_factor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_growth_factor(self, growth_factor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym780$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_growth_factor_method(SubLObject self, SubLObject new_growth_factor) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject growth_factor = get_cyblack_basic_sequence_panel_growth_factor(self);
            try {
                try {
                    growth_factor = new_growth_factor;
                    sublisp_throw($sym785$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_growth_factor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_growth_factor(self, growth_factor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym785$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_sequence_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sequence_class = get_cyblack_basic_sequence_panel_sequence_class(self);
            try {
                try {
                    sublisp_throw($sym789$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, sequence_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sequence_class(self, sequence_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym789$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_sequence_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sequence_class = get_cyblack_basic_sequence_panel_sequence_class(self);
            try {
                try {
                    sequence_class = new_class;
                    sublisp_throw($sym794$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sequence_class(self, sequence_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym794$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_stimulation_type_method(SubLObject self) {
        {
            SubLObject stimulation_type = get_cyblack_basic_sequence_panel_stimulation_type(self);
            return stimulation_type;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_stimulation_type_method(SubLObject self, SubLObject new_stimulation_type) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject stimulation_type = get_cyblack_basic_sequence_panel_stimulation_type(self);
            try {
                try {
                    stimulation_type = new_stimulation_type;
                    sublisp_throw($sym797$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_stimulation_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_stimulation_type(self, stimulation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym797$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_super_panels_method(SubLObject self) {
        {
            SubLObject super_panels = get_cyblack_basic_sequence_panel_super_panels(self);
            return copy_list(super_panels);
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_sub_panels_method(SubLObject self) {
        {
            SubLObject sub_panels = get_cyblack_basic_sequence_panel_sub_panels(self);
            return copy_list(sub_panels);
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_super_panel_method(SubLObject self, SubLObject new_super_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject super_panels = get_cyblack_basic_sequence_panel_super_panels(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_super_panel, super_panels, UNPROVIDED, UNPROVIDED)) {
                        super_panels = cons(new_super_panel, super_panels);
                    }
                    sublisp_throw($sym801$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_super_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_super_panels(self, super_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym801$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_super_panel_method(SubLObject self, SubLObject old_super_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject super_panels = get_cyblack_basic_sequence_panel_super_panels(self);
            try {
                try {
                    super_panels = delete(old_super_panel, super_panels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym804$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, old_super_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_super_panels(self, super_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym804$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_sub_panel_method(SubLObject self, SubLObject new_sub_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_sequence_panel_sub_panels(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_sub_panel, sub_panels, UNPROVIDED, UNPROVIDED)) {
                        sub_panels = cons(new_sub_panel, sub_panels);
                    }
                    sublisp_throw($sym806$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_sub_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym806$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_sub_panel_method(SubLObject self, SubLObject old_sub_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_sequence_panel_sub_panels(self);
            try {
                try {
                    sub_panels = delete(old_sub_panel, sub_panels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym808$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, old_sub_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym808$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
                SubLObject stimulation_type = get_cyblack_basic_sequence_panel_stimulation_type(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                SubLObject isolated_p = object.get_object_isolated_p(self);
                try {
                    try {
                        {
                            SubLObject ord = cyblack_posting.cyblack_ordinal_posting_get_ord_method(posting);
                            if (NIL != cyblack_globals.$cyblack_monitor_posts$.getDynamicValue(thread)) {
                                format(T, $str_alt347$___ADD_POSTING__S___Added_Posting, posting);
                                format(T, $str_alt348$_______S__, methods.funcall_instance_method_with_0_args(posting, LISTIFY));
                            }
                            cyblack_basic_sequence_panel_set_nth_method(self, ord, posting);
                            cyblack_posting_dispatch_functions.cyblack_posting_set_panel(posting, self);
                            methods.funcall_instance_method_with_0_args(posting, ON_POST);
                            if (stimulation_type == $ACTIVE) {
                                {
                                    SubLObject environment = cyblack_precondition_pattern.create_top_level_environment($ADD_POSTING, $sym353$_THE_POSTING, cyblack_application.cyblack_application_get_root_datatype(application), posting);
                                    cyblack_basic_sequence_panel_stimulate_all_posting_daemons_method(self, environment, posting);
                                    if (!((NIL != instances.get_slot(posting, ISOLATED_P)) || (NIL == methods.funcall_instance_method_with_0_args(posting, ACTIVE_P)))) {
                                        cyblack_basic_sequence_panel_stimulate_all_knowledge_sources_method(self, environment);
                                    }
                                }
                                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                            }
                            sublisp_throw($sym811$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, posting);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_sequence_panel_stimulation_type(self, stimulation_type);
                                cyblack_object.set_cyblack_object_application(self, application);
                                object.set_object_isolated_p(self, isolated_p);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym811$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
                }
                return catch_var_for_cyblack_basic_sequence_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_posting_method(SubLObject self, SubLObject posting) {
        if ((NIL != posting) && (NIL == cyblack_posting_dispatch_functions.cyblack_posting_immutable_p(posting))) {
            {
                SubLObject ord = cyblack_posting.cyblack_ordinal_posting_get_ord_method(posting);
                cyblack_basic_sequence_panel_set_nth_method(self, ord, NIL);
            }
            return posting;
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_datatype_method(SubLObject self) {
        {
            SubLObject datatype = get_cyblack_basic_sequence_panel_datatype(self);
            return datatype;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_datatype_method(SubLObject self, SubLObject new_datatype) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject datatype = get_cyblack_basic_sequence_panel_datatype(self);
            try {
                try {
                    datatype = new_datatype;
                    sublisp_throw($sym816$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_datatype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym816$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_sequence_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != knowledge_source) {
                        if (NIL == direct_knowledge_sources) {
                            direct_knowledge_sources = object.object_new_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
                        }
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_ADD_FIRST_KNOWLEDGE_SOURCE);
                        }
                        if (NIL == cyblack_ks.cyblack_basic_knowledge_source_list_member_p_method(direct_knowledge_sources, knowledge_source)) {
                            cyblack_ks.cyblack_basic_knowledge_source_list_add_method(direct_knowledge_sources, knowledge_source);
                        }
                    }
                    sublisp_throw($sym818$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym818$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_direct_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_sequence_panel_direct_knowledge_sources(self);
            try {
                try {
                    if ((NIL != knowledge_source) && (NIL != direct_knowledge_sources)) {
                        cyblack_ks.cyblack_basic_knowledge_source_list_remove_method(direct_knowledge_sources, knowledge_source);
                        if (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(direct_knowledge_sources)) {
                            methods.funcall_instance_method_with_0_args(self, ON_REMOVE_LAST_KNOWLEDGE_SOURCE);
                        }
                    }
                    sublisp_throw($sym820$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym820$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(SubLObject self) {
        {
            SubLObject direct_knowledge_sources = get_cyblack_basic_sequence_panel_direct_knowledge_sources(self);
            if (NIL != direct_knowledge_sources) {
                return subloop_collections.basic_doubly_linked_list_get_contents_method(direct_knowledge_sources);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject direct_knowledge_sources = get_cyblack_basic_sequence_panel_direct_knowledge_sources(self);
            try {
                try {
                    if (NIL != direct_knowledge_sources) {
                        subloop_collections.basic_doubly_linked_list_clear_method(direct_knowledge_sources);
                        direct_knowledge_sources = NIL;
                    }
                    sublisp_throw($sym823$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_direct_knowledge_sources(self, direct_knowledge_sources);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym823$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_method(SubLObject self, SubLObject key) {
        return cyblack_basic_sequence_panel_get_nth_method(self, key, UNPROVIDED);
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_direct_posting_method(SubLObject self, SubLObject posting) {
        if (NIL != posting) {
            {
                SubLObject ord = cyblack_posting.cyblack_ordinal_posting_get_ord_method(posting);
                cyblack_basic_sequence_panel_set_nth_method(self, ord, posting);
                methods.funcall_instance_method_with_0_args(posting, ON_POST);
                methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                return posting;
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_direct_posting_method(SubLObject self, SubLObject posting) {
        if (NIL != posting) {
            {
                SubLObject ord = cyblack_posting.cyblack_ordinal_posting_get_ord_method(posting);
                cyblack_basic_sequence_panel_set_nth_method(self, ord, posting);
                return posting;
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_direct_postings_method(SubLObject self) {
        return cyblack_basic_sequence_panel_get_contents_method(self);
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_direct_active_postings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    if (NIL == internal_storage) {
                        sublisp_throw($sym833$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                    }
                    {
                        SubLObject length = cyblack_basic_sequence_panel_get_length_method(self);
                        SubLObject element = NIL;
                        SubLObject direct_active_postings = NIL;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                            element = aref(internal_storage, i);
                            if ((NIL != element) && (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(element))) {
                                direct_active_postings = cons(element, direct_active_postings);
                            }
                        }
                        sublisp_throw($sym833$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, nreverse(direct_active_postings));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym833$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_direct_postings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    if (NIL == internal_storage) {
                        sublisp_throw($sym836$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                    }
                    cyblack_basic_sequence_panel_clear_method(self);
                    sublisp_throw($sym836$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym836$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_add_posting_daemon_method(SubLObject self, SubLObject new_posting_daemon) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_sequence_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_add_method(posting_daemons, new_posting_daemon);
                    cyblack_blackboard_daemon.cyblack_basic_posting_daemon_set_panel_method(new_posting_daemon, self);
                    sublisp_throw($sym838$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, new_posting_daemon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym838$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_posting_daemon_method(SubLObject self, SubLObject old_posting_daemon) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_sequence_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_remove_method(posting_daemons, old_posting_daemon);
                    sublisp_throw($sym840$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, old_posting_daemon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym840$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_get_posting_daemons_method(SubLObject self) {
        {
            SubLObject posting_daemons = get_cyblack_basic_sequence_panel_posting_daemons(self);
            return posting_daemons;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_remove_all_direct_posting_daemons_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject posting_daemons = get_cyblack_basic_sequence_panel_posting_daemons(self);
            try {
                try {
                    subloop_collections.basic_doubly_linked_list_clear_method(posting_daemons);
                    sublisp_throw($sym843$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_posting_daemons(self, posting_daemons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym843$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_initialize_method(SubLObject self) {
        cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
        set_cyblack_basic_sequence_panel_marks(self, NIL);
        set_cyblack_basic_sequence_panel_internal_storage(self, make_vector($int$100, NIL));
        set_cyblack_basic_sequence_panel_storage_size(self, $int$100);
        set_cyblack_basic_sequence_panel_largest_index(self, MINUS_ONE_INTEGER);
        set_cyblack_basic_sequence_panel_default_value(self, NIL);
        set_cyblack_basic_sequence_panel_growth_factor(self, TWO_INTEGER);
        set_cyblack_basic_sequence_panel_sequence_class(self, CYBLACK_BASIC_SEQUENCE_PANEL);
        set_cyblack_basic_sequence_panel_posting_daemons(self, object.object_new_method(BASIC_DOUBLY_LINKED_LIST));
        set_cyblack_basic_sequence_panel_stimulation_type(self, $ACTIVE);
        return self;
    }

    public static final SubLObject cyblack_basic_sequence_panel_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject largest_index = get_cyblack_basic_sequence_panel_largest_index(self);
            SubLObject internal_storage = get_cyblack_basic_sequence_panel_internal_storage(self);
            try {
                try {
                    if (largest_index.numE(MINUS_ONE_INTEGER)) {
                        format(stream, $str_alt850$__);
                        sublisp_throw($sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, self);
                    }
                    {
                        SubLObject length = add(largest_index, ONE_INTEGER);
                        if (length.numE(ZERO_INTEGER)) {
                            format(stream, $str_alt850$__);
                            sublisp_throw($sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, self);
                        }
                        if (length.numE(ONE_INTEGER)) {
                            format(stream, $str_alt851$__S_, aref(internal_storage, ZERO_INTEGER));
                            sublisp_throw($sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, self);
                        }
                        format(stream, $str_alt852$__S, aref(internal_storage, ZERO_INTEGER));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(largest_index); i = add(i, ONE_INTEGER)) {
                                format(stream, $str_alt853$___S, aref(internal_storage, add(i, ONE_INTEGER)));
                            }
                        }
                        format(stream, $str_alt854$_);
                    }
                    sublisp_throw($sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_largest_index(self, largest_index);
                            set_cyblack_basic_sequence_panel_internal_storage(self, internal_storage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt402$___SET_APPLICATION__S__S_, self, new_application);
            }
            cyblack_object.set_cyblack_object_application(self, new_application);
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt403$___SET_APPLICATION__S__S______S, new SubLObject[]{ self, new_application, cyblack_object.get_cyblack_object_application(self) });
            }
            return new_application;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_on_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_sequence_panel_sub_panels(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_object.cyblack_object_on_startup_method(self);
                    cyblack_basic_sequence_panel_remove_direct_knowledge_sources_method(self);
                    cyblack_basic_sequence_panel_remove_direct_postings_method(self);
                    {
                        SubLObject cdolist_list_var = sub_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(panel, SET_APPLICATION, application);
                            methods.funcall_instance_method_with_0_args(panel, ON_STARTUP);
                        }
                    }
                    sublisp_throw($sym858$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sub_panels(self, sub_panels);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym858$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_panel_on_shutdown_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_panel_method = NIL;
            SubLObject sub_panels = get_cyblack_basic_sequence_panel_sub_panels(self);
            try {
                try {
                    {
                        SubLObject enumerator = cyblack_basic_sequence_panel_allocate_enumerator_method(self);
                        if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                            {
                                SubLObject current_posting = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                methods.funcall_instance_method_with_0_args(current_posting, ON_SHUTDOWN);
                                while (NIL != methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                    current_posting = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    methods.funcall_instance_method_with_0_args(current_posting, ON_SHUTDOWN);
                                } 
                            }
                            cyblack_basic_sequence_panel_deallocate_enumerator_method(self, enumerator);
                        }
                        {
                            SubLObject cdolist_list_var = sub_panels;
                            SubLObject panel = NIL;
                            for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_0_args(panel, ON_SHUTDOWN);
                            }
                        }
                        cyblack_object.cyblack_object_on_shutdown_method(self);
                        sublisp_throw($sym860$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_panel_sub_panels(self, sub_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_panel_method = Errors.handleThrowable(ccatch_env_var, $sym860$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_sequence_panel_method;
        }
    }

    public static final SubLObject cyblack_panel_given_datatype(SubLObject datatype, SubLObject panels) {
        {
            SubLObject panel_datatype = NIL;
            SubLObject cdolist_list_var = panels;
            SubLObject panel = NIL;
            for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                panel_datatype = cyblack_panel_dispatch_functions.cyblack_panel_get_datatype(panel);
                if ((NIL != panel_datatype) && (NIL != Strings.stringE(cyblack_datatype.cyblack_datatype_get_typename(datatype), cyblack_datatype.cyblack_datatype_get_typename(panel_datatype), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    return panel;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cyblack_panel_file() {
        declareFunction("valid_cyblack_panel_stimulation_types", "VALID-CYBLACK-PANEL-STIMULATION-TYPES", 0, 0, false);
        declareFunction("cyblack_panel_stimulation_type_p", "CYBLACK-PANEL-STIMULATION-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_panel_stimulation_type", "ENCODE-CYBLACK-PANEL-STIMULATION-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_panel_stimulation_type", "DECODE-CYBLACK-PANEL-STIMULATION-TYPE", 1, 0, false);
        declareFunction("cyblack_panel_stimulation_type_less_p", "CYBLACK-PANEL-STIMULATION-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_panel_stimulation_type_greater_p", "CYBLACK-PANEL-STIMULATION-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_panel_p", "CYBLACK-PANEL-P", 1, 0, false);
        declareFunction("cyblack_dll_panel_p", "CYBLACK-DLL-PANEL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_panel_posting_daemons", "GET-CYBLACK-BASIC-PANEL-POSTING-DAEMONS", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_posting_daemons", "SET-CYBLACK-BASIC-PANEL-POSTING-DAEMONS", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_datatype", "GET-CYBLACK-BASIC-PANEL-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_datatype", "SET-CYBLACK-BASIC-PANEL-DATATYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_direct_knowledge_sources", "GET-CYBLACK-BASIC-PANEL-DIRECT-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_direct_knowledge_sources", "SET-CYBLACK-BASIC-PANEL-DIRECT-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_sub_panels", "GET-CYBLACK-BASIC-PANEL-SUB-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_sub_panels", "SET-CYBLACK-BASIC-PANEL-SUB-PANELS", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_super_panels", "GET-CYBLACK-BASIC-PANEL-SUPER-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_super_panels", "SET-CYBLACK-BASIC-PANEL-SUPER-PANELS", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_stimulation_type", "GET-CYBLACK-BASIC-PANEL-STIMULATION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_stimulation_type", "SET-CYBLACK-BASIC-PANEL-STIMULATION-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_last_link", "GET-CYBLACK-BASIC-PANEL-LAST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_last_link", "SET-CYBLACK-BASIC-PANEL-LAST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_first_link", "GET-CYBLACK-BASIC-PANEL-FIRST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_first_link", "SET-CYBLACK-BASIC-PANEL-FIRST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_element_count", "GET-CYBLACK-BASIC-PANEL-ELEMENT-COUNT", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_element_count", "SET-CYBLACK-BASIC-PANEL-ELEMENT-COUNT", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_element_equality_predicate", "GET-CYBLACK-BASIC-PANEL-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_element_equality_predicate", "SET-CYBLACK-BASIC-PANEL-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction("get_cyblack_basic_panel_marks", "GET-CYBLACK-BASIC-PANEL-MARKS", 1, 0, false);
        declareFunction("set_cyblack_basic_panel_marks", "SET-CYBLACK-BASIC-PANEL-MARKS", 2, 0, false);
        declareFunction("cyblack_basic_panel_activate_posting_method", "CYBLACK-BASIC-PANEL-ACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_deactivate_posting_method", "CYBLACK-BASIC-PANEL-DEACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_posting_daemons_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_knowledge_sources_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_postings_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_iterate_over_all_direct_postings_method", "CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_all_active_postings_method", "CYBLACK-BASIC-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_all_postings_method", "CYBLACK-BASIC-PANEL-GET-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_remove_direct_postings_method", "CYBLACK-BASIC-PANEL-REMOVE-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_add_direct_postings_method", "CYBLACK-BASIC-PANEL-ADD-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_all_knowledge_sources_method", "CYBLACK-BASIC-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_direct_knowledge_sources_method", "CYBLACK-BASIC-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_direct_knowledge_sources_method", "CYBLACK-BASIC-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_on_remove_last_knowledge_source_method", "CYBLACK-BASIC-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_on_add_first_knowledge_source_method", "CYBLACK-BASIC-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_stimulate_all_posting_daemons_method", "CYBLACK-BASIC-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD", 1, 2, false);
        declareFunction("cyblack_basic_panel_stimulate_all_monitors_method", "CYBLACK-BASIC-PANEL-STIMULATE-ALL-MONITORS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_panel_stimulate_all_knowledge_sources_method", "CYBLACK-BASIC-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_panel_stimulate_direct_knowledge_sources_method", "CYBLACK-BASIC-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_panel_get_all_sub_panels_method", "CYBLACK-BASIC-PANEL-GET-ALL-SUB-PANELS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_panel_swap_method", "CYBLACK-BASIC-PANEL-SWAP-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_panel_empty_p_method", "CYBLACK-BASIC-PANEL-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_reverse_method", "CYBLACK-BASIC-PANEL-REVERSE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_append_method", "CYBLACK-BASIC-PANEL-APPEND-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_position_method", "CYBLACK-BASIC-PANEL-POSITION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_set_nth_method", "CYBLACK-BASIC-PANEL-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_panel_nth_method", "CYBLACK-BASIC-PANEL-NTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_but_last_method", "CYBLACK-BASIC-PANEL-BUT-LAST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_pop_method", "CYBLACK-BASIC-PANEL-POP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_push_method", "CYBLACK-BASIC-PANEL-PUSH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_member_p_method", "CYBLACK-BASIC-PANEL-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_method", "CYBLACK-BASIC-PANEL-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_add_method", "CYBLACK-BASIC-PANEL-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_clear_method", "CYBLACK-BASIC-PANEL-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_find_nth_link_method", "CYBLACK-BASIC-PANEL-FIND-NTH-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_find_link_method", "CYBLACK-BASIC-PANEL-FIND-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_reverse_link_method", "CYBLACK-BASIC-PANEL-REVERSE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_delete_link_method", "CYBLACK-BASIC-PANEL-DELETE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_set_contents_method", "CYBLACK-BASIC-PANEL-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_contents_method", "CYBLACK-BASIC-PANEL-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_element_equal_p_method", "CYBLACK-BASIC-PANEL-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_panel_has_mark_p_method", "CYBLACK-BASIC-PANEL-HAS-MARK-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_mark_method", "CYBLACK-BASIC-PANEL-REMOVE-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_add_mark_method", "CYBLACK-BASIC-PANEL-ADD-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_clear_all_marks_method", "CYBLACK-BASIC-PANEL-CLEAR-ALL-MARKS-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_panel_p", "CYBLACK-BASIC-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_panel_initialize_qua_markable_method", "CYBLACK-BASIC-PANEL-INITIALIZE-QUA-MARKABLE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_marks_internal_method", "CYBLACK-BASIC-PANEL-GET-MARKS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_marks_internal_method", "CYBLACK-BASIC-PANEL-SET-MARKS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_initialize_qua_doubly_linked_list_method", "CYBLACK-BASIC-PANEL-INITIALIZE-QUA-DOUBLY-LINKED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_element_equality_predicate_method", "CYBLACK-BASIC-PANEL-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_element_equality_predicate_method", "CYBLACK-BASIC-PANEL-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_set_element_count_method", "CYBLACK-BASIC-PANEL-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_inc_element_count_method", "CYBLACK-BASIC-PANEL-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_dec_element_count_method", "CYBLACK-BASIC-PANEL-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_first_link_method", "CYBLACK-BASIC-PANEL-GET-FIRST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_first_link_method", "CYBLACK-BASIC-PANEL-SET-FIRST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_last_link_method", "CYBLACK-BASIC-PANEL-GET-LAST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_last_link_method", "CYBLACK-BASIC-PANEL-SET-LAST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_element_count_method", "CYBLACK-BASIC-PANEL-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_allocate_enumerator_method", "CYBLACK-BASIC-PANEL-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_deallocate_enumerator_method", "CYBLACK-BASIC-PANEL-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_print_method", "CYBLACK-BASIC-PANEL-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_panel_initialize_qua_dll_panel_method", "CYBLACK-BASIC-PANEL-INITIALIZE-QUA-DLL-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_stimulation_type_method", "CYBLACK-BASIC-PANEL-GET-STIMULATION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_stimulation_type_method", "CYBLACK-BASIC-PANEL-SET-STIMULATION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_super_panels_method", "CYBLACK-BASIC-PANEL-GET-SUPER-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_sub_panels_method", "CYBLACK-BASIC-PANEL-GET-SUB-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_add_super_panel_method", "CYBLACK-BASIC-PANEL-ADD-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_super_panel_method", "CYBLACK-BASIC-PANEL-REMOVE-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_add_sub_panel_method", "CYBLACK-BASIC-PANEL-ADD-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_sub_panel_method", "CYBLACK-BASIC-PANEL-REMOVE-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_add_posting_method", "CYBLACK-BASIC-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_posting_method", "CYBLACK-BASIC-PANEL-REMOVE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_datatype_method", "CYBLACK-BASIC-PANEL-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_datatype_method", "CYBLACK-BASIC-PANEL-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_add_direct_knowledge_source_method", "CYBLACK-BASIC-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_direct_knowledge_source_method", "CYBLACK-BASIC-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_direct_knowledge_sources_method", "CYBLACK-BASIC-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_remove_all_knowledge_sources_method", "CYBLACK-BASIC-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_add_direct_posting_method", "CYBLACK-BASIC-PANEL-ADD-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_direct_posting_method", "CYBLACK-BASIC-PANEL-REMOVE-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_direct_postings_method", "CYBLACK-BASIC-PANEL-GET-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_direct_active_postings_method", "CYBLACK-BASIC-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_initialize_method", "CYBLACK-BASIC-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_set_application_method", "CYBLACK-BASIC-PANEL-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_on_startup_method", "CYBLACK-BASIC-PANEL-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_on_shutdown_method", "CYBLACK-BASIC-PANEL-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_add_posting_daemon_method", "CYBLACK-BASIC-PANEL-ADD-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_remove_posting_daemon_method", "CYBLACK-BASIC-PANEL-REMOVE-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_panel_get_posting_daemons_method", "CYBLACK-BASIC-PANEL-GET-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_remove_all_direct_posting_daemons_method", "CYBLACK-BASIC-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_panel_get_method", "CYBLACK-BASIC-PANEL-GET-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_passive_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PASSIVE-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_passive_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PASSIVE-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_passive_panel_p", "CYBLACK-BASIC-PASSIVE-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_passive_panel_initialize_method", "CYBLACK-BASIC-PASSIVE-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_singleton_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLETON-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_singleton_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLETON-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_singleton_panel_p", "CYBLACK-SINGLETON-PANEL-P", 1, 0, false);
        declareFunction("cyblack_singleton_panel_add_posting_method", "CYBLACK-SINGLETON-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_passive_singleton_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PASSIVE-SINGLETON-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_passive_singleton_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PASSIVE-SINGLETON-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_passive_singleton_panel_p", "CYBLACK-PASSIVE-SINGLETON-PANEL-P", 1, 0, false);
        declareFunction("cyblack_passive_singleton_panel_initialize_method", "CYBLACK-PASSIVE-SINGLETON-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_stack_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STACK-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_stack_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STACK-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_stack_panel_p", "CYBLACK-STACK-PANEL-P", 1, 0, false);
        declareFunction("cyblack_stack_panel_add_posting_method", "CYBLACK-STACK-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_virtual_panel_extractor_args", "GET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-ARGS", 1, 0, false);
        declareFunction("set_cyblack_virtual_panel_extractor_args", "SET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-ARGS", 2, 0, false);
        declareFunction("get_cyblack_virtual_panel_extractor_predicator", "GET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PREDICATOR", 1, 0, false);
        declareFunction("set_cyblack_virtual_panel_extractor_predicator", "SET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PREDICATOR", 2, 0, false);
        declareFunction("get_cyblack_virtual_panel_extractor_contents", "GET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-CONTENTS", 1, 0, false);
        declareFunction("set_cyblack_virtual_panel_extractor_contents", "SET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-CONTENTS", 2, 0, false);
        declareFunction("get_cyblack_virtual_panel_extractor_predicator_is_method", "GET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PREDICATOR-IS-METHOD", 1, 0, false);
        declareFunction("set_cyblack_virtual_panel_extractor_predicator_is_method", "SET-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PREDICATOR-IS-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_virtual_panel_extractor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_virtual_panel_extractor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_p", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-P", 1, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_initialize_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_print_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_set_initial_state_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_virtual_panel_extractor_get_predicator_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-PREDICATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_set_predicator_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-PREDICATOR-METHOD", 2, 1, false);
        declareFunction("cyblack_virtual_panel_extractor_get_args_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-ARGS-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_set_args_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_extract_p_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-EXTRACT-P-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_visit_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_virtual_panel_extractor_get_final_state_method", "CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("cyblack_virtual_panel_p", "CYBLACK-VIRTUAL-PANEL-P", 1, 0, false);
        declareFunction("cyblack_virtual_panel_template_p", "CYBLACK-VIRTUAL-PANEL-TEMPLATE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_virtual_panel_predicator", "GET-CYBLACK-BASIC-VIRTUAL-PANEL-PREDICATOR", 1, 0, false);
        declareFunction("set_cyblack_basic_virtual_panel_predicator", "SET-CYBLACK-BASIC-VIRTUAL-PANEL-PREDICATOR", 2, 0, false);
        declareFunction("get_cyblack_basic_virtual_panel_base_panel", "GET-CYBLACK-BASIC-VIRTUAL-PANEL-BASE-PANEL", 1, 0, false);
        declareFunction("set_cyblack_basic_virtual_panel_base_panel", "SET-CYBLACK-BASIC-VIRTUAL-PANEL-BASE-PANEL", 2, 0, false);
        declareFunction("get_cyblack_basic_virtual_panel_contents", "GET-CYBLACK-BASIC-VIRTUAL-PANEL-CONTENTS", 1, 0, false);
        declareFunction("set_cyblack_basic_virtual_panel_contents", "SET-CYBLACK-BASIC-VIRTUAL-PANEL-CONTENTS", 2, 0, false);
        declareFunction("get_cyblack_basic_virtual_panel_args", "GET-CYBLACK-BASIC-VIRTUAL-PANEL-ARGS", 1, 0, false);
        declareFunction("set_cyblack_basic_virtual_panel_args", "SET-CYBLACK-BASIC-VIRTUAL-PANEL-ARGS", 2, 0, false);
        declareFunction("get_cyblack_basic_virtual_panel_is_method", "GET-CYBLACK-BASIC-VIRTUAL-PANEL-IS-METHOD", 1, 0, false);
        declareFunction("set_cyblack_basic_virtual_panel_is_method", "SET-CYBLACK-BASIC-VIRTUAL-PANEL-IS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_posting_daemons_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_direct_posting_daemons_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_all_direct_posting_daemons_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_posting_daemons_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_posting_daemon_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_posting_daemon_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_direct_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_iterate_over_all_direct_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_all_active_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_all_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_direct_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_direct_active_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_direct_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_direct_postings_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_direct_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_direct_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_all_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_all_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_direct_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_direct_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_direct_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_direct_knowledge_source_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_direct_knowledge_source_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_on_remove_last_knowledge_source_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_on_add_first_knowledge_source_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_datatype_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_datatype_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_stimulate_all_posting_daemons_method", "CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD", 1, 2, false);
        declareFunction("cyblack_basic_virtual_panel_stimulate_all_monitors_method", "CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-MONITORS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_virtual_panel_stimulate_all_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_virtual_panel_stimulate_direct_knowledge_sources_method", "CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_virtual_panel_remove_sub_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_sub_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_remove_super_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_add_super_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ADD-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_all_sub_panels_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-SUB-PANELS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_virtual_panel_get_sub_panels_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUB-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_super_panels_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUPER-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_derive_contents_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-DERIVE-CONTENTS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_subset_predicator_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-SUBSET-PREDICATOR-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_virtual_panel_set_base_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-BASE-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_initialize_qua_virtual_panel_template_method", "CYBLACK-BASIC-VIRTUAL-PANEL-INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_virtual_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-VIRTUAL-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_virtual_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-VIRTUAL-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_p", "CYBLACK-BASIC-VIRTUAL-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_initialize_method", "CYBLACK-BASIC-VIRTUAL-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_args_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ARGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_args_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_contents_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-CONTENTS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_active_contents_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-ACTIVE-CONTENTS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_contents_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-CONTENTS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_base_panel_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-BASE-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_base_panel_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-BASE-PANEL-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_subset_predicator_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUBSET-PREDICATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_subset_predicator_internal_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-SUBSET-PREDICATOR-INTERNAL-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_virtual_panel_predicator_is_method_method", "CYBLACK-BASIC-VIRTUAL-PANEL-PREDICATOR-IS-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_get_stimulation_type_method", "CYBLACK-BASIC-VIRTUAL-PANEL-GET-STIMULATION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_virtual_panel_set_stimulation_type_method", "CYBLACK-BASIC-VIRTUAL-PANEL-SET-STIMULATION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_deactivate_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-DEACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_virtual_panel_activate_posting_method", "CYBLACK-BASIC-VIRTUAL-PANEL-ACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_sequence_panel_p", "CYBLACK-SEQUENCE-PANEL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_posting_daemons", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-POSTING-DAEMONS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_posting_daemons", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-POSTING-DAEMONS", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_datatype", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_datatype", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-DATATYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_direct_knowledge_sources", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-DIRECT-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_direct_knowledge_sources", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-DIRECT-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_sub_panels", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-SUB-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_sub_panels", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-SUB-PANELS", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_super_panels", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-SUPER-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_super_panels", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-SUPER-PANELS", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_stimulation_type", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_stimulation_type", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATION-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_sequence_class", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-SEQUENCE-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_sequence_class", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-SEQUENCE-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_growth_factor", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-GROWTH-FACTOR", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_growth_factor", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-GROWTH-FACTOR", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_default_value", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-DEFAULT-VALUE", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_default_value", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-DEFAULT-VALUE", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_largest_index", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-LARGEST-INDEX", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_largest_index", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-LARGEST-INDEX", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_storage_size", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-STORAGE-SIZE", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_storage_size", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-STORAGE-SIZE", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_internal_storage", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-INTERNAL-STORAGE", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_internal_storage", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-INTERNAL-STORAGE", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_panel_marks", "GET-CYBLACK-BASIC-SEQUENCE-PANEL-MARKS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_panel_marks", "SET-CYBLACK-BASIC-SEQUENCE-PANEL-MARKS", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_activate_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_deactivate_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-DEACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_posting_daemons_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_direct_posting_daemons_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_direct_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_iterate_over_all_direct_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_all_active_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_all_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_direct_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_all_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_direct_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_direct_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_on_remove_last_knowledge_source_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_on_add_first_knowledge_source_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_stimulate_all_posting_daemons_method", "CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD", 1, 2, false);
        declareFunction("cyblack_basic_sequence_panel_stimulate_all_monitors_method", "CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-MONITORS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_sequence_panel_stimulate_all_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_sequence_panel_stimulate_direct_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_sequence_panel_get_all_sub_panels_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-SUB-PANELS-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_sequence_panel_index_of_previous_non_nil_element_method", "CYBLACK-BASIC-SEQUENCE-PANEL-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_index_of_next_non_nil_element_method", "CYBLACK-BASIC-SEQUENCE-PANEL-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_all_null_p_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ALL-NULL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_deallocate_enumerator_method", "CYBLACK-BASIC-SEQUENCE-PANEL-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_allocate_enumerator_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_subsequence_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUBSEQUENCE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_sequence_panel_set_nth_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_nth_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-NTH-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_sequence_panel_get_length_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-LENGTH-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_clear_method", "CYBLACK-BASIC-SEQUENCE-PANEL-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_has_mark_p_method", "CYBLACK-BASIC-SEQUENCE-PANEL-HAS-MARK-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_mark_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_mark_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_clear_all_marks_method", "CYBLACK-BASIC-SEQUENCE-PANEL-CLEAR-ALL-MARKS-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_sequence_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_sequence_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_p", "CYBLACK-BASIC-SEQUENCE-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_initialize_qua_markable_method", "CYBLACK-BASIC-SEQUENCE-PANEL-INITIALIZE-QUA-MARKABLE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_marks_internal_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-MARKS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_marks_internal_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-MARKS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_contents_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_internal_storage_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-INTERNAL-STORAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_internal_storage_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-INTERNAL-STORAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_storage_size_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-STORAGE-SIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_storage_size_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-STORAGE-SIZE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_largest_index_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-LARGEST-INDEX-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_largest_index_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-LARGEST-INDEX-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_record_index_method", "CYBLACK-BASIC-SEQUENCE-PANEL-RECORD-INDEX-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_default_value_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-DEFAULT-VALUE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_default_value_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-DEFAULT-VALUE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_growth_factor_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-GROWTH-FACTOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_growth_factor_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-GROWTH-FACTOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_sequence_class_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-SEQUENCE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_sequence_class_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-SEQUENCE-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_stimulation_type_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-STIMULATION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_stimulation_type_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-STIMULATION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_super_panels_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUPER-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_sub_panels_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUB-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_super_panel_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_super_panel_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-SUPER-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_sub_panel_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_sub_panel_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-SUB-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_datatype_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_datatype_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-DATATYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_direct_knowledge_source_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_direct_knowledge_source_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_direct_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_all_knowledge_sources_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_direct_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_direct_posting_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_direct_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_direct_active_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_direct_postings_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_add_posting_daemon_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ADD-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_posting_daemon_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-POSTING-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_get_posting_daemons_method", "CYBLACK-BASIC-SEQUENCE-PANEL-GET-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_remove_all_direct_posting_daemons_method", "CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_initialize_method", "CYBLACK-BASIC-SEQUENCE-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_print_method", "CYBLACK-BASIC-SEQUENCE-PANEL-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_sequence_panel_set_application_method", "CYBLACK-BASIC-SEQUENCE-PANEL-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_panel_on_startup_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_panel_on_shutdown_method", "CYBLACK-BASIC-SEQUENCE-PANEL-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_panel_given_datatype", "CYBLACK-PANEL-GIVEN-DATATYPE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_panel_file() {
        defconstant("*VALID-CYBLACK-PANEL-STIMULATION-TYPES*", $list_alt0);
        return NIL;
    }

    public static final SubLObject setup_cyblack_panel_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_PANEL_STIMULATION_TYPE, $list_alt0);
        interfaces.new_interface(CYBLACK_PANEL, $list_alt9, $list_alt10, $list_alt11);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_SUB_PANELS, CYBLACK_PANEL, $list_alt13, $list_alt14, $list_alt15);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt13, $list_alt17, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt13, $list_alt17, $list_alt20);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_PANEL, $list_alt13, $list_alt22, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_PANEL, $list_alt13, $list_alt25, $list_alt26);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt28, NIL, $list_alt29);
        interfaces.interfaces_add_interface_instance_method(ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_PANEL, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_PANEL, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt28, $list_alt34, $list_alt35);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt28, NIL, $list_alt37);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_PANEL, $list_alt28, $list_alt39, $list_alt40);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_PANEL, $list_alt28, NIL, $list_alt42);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_POSTINGS, CYBLACK_PANEL, $list_alt28, NIL, $list_alt44);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_PANEL, $list_alt28, NIL, $list_alt46);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_PANEL, $list_alt28, $list_alt48, $list_alt49);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_PANEL, $list_alt28, $list_alt48, $list_alt51);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt28, $list_alt53, $list_alt54);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_PANEL, $list_alt28, $list_alt53, $list_alt56);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_PANEL, $list_alt28, $list_alt58, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_PANEL, $list_alt28, $list_alt58, $list_alt61);
        interfaces.interfaces_add_interface_instance_method(DEACTIVATE_POSTING, CYBLACK_PANEL, $list_alt28, $list_alt63, $list_alt64);
        interfaces.interfaces_add_interface_instance_method(ACTIVATE_POSTING, CYBLACK_PANEL, $list_alt28, $list_alt63, $list_alt66);
        interfaces.new_interface(CYBLACK_DLL_PANEL, $list_alt68, $list_alt69, $list_alt70);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_POSTING, CYBLACK_DLL_PANEL, $list_alt28, $list_alt63, $list_alt72);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_DLL_PANEL, $list_alt28, $list_alt63, $list_alt74);
        interfaces.interfaces_add_interface_instance_method(GET_DIRECT_POSTINGS, CYBLACK_DLL_PANEL, $list_alt28, NIL, $list_alt76);
        classes.subloop_new_class(CYBLACK_BASIC_PANEL, CYBLACK_BASIC_LOCKABLE, $list_alt79, NIL, $list_alt80);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_PANEL, NIL);
        methods.methods_incorporate_instance_method(ACTIVATE_POSTING, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt63, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ACTIVATE_POSTING, CYBLACK_BASIC_PANEL_ACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_POSTING, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt63, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, DEACTIVATE_POSTING, CYBLACK_BASIC_PANEL_DEACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt58, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt58, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, $sym100$CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS_METHO);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt53, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt53, $list_alt54);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, $sym102$CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES_MET);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt48, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt48, $list_alt49);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ALL_POSTINGS, CYBLACK_BASIC_PANEL_GET_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL_REMOVE_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL_ADD_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt37);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, STIMULATE_ALL_MONITORS, CYBLACK_BASIC_PANEL_STIMULATE_ALL_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt17, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt17, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_SUB_PANELS, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt14, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ALL_SUB_PANELS, CYBLACK_BASIC_PANEL_GET_ALL_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(SWAP, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt126, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SWAP, CYBLACK_BASIC_PANEL_SWAP_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt134);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, EMPTY_P, CYBLACK_BASIC_PANEL_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt137);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REVERSE, CYBLACK_BASIC_PANEL_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt140, $list_alt141);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, APPEND, CYBLACK_BASIC_PANEL_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, POSITION, CYBLACK_BASIC_PANEL_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt151, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_NTH, CYBLACK_BASIC_PANEL_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, NTH, CYBLACK_BASIC_PANEL_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, BUT_LAST, CYBLACK_BASIC_PANEL_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, POP, CYBLACK_BASIC_PANEL_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt165, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, PUSH, CYBLACK_BASIC_PANEL_PUSH_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt147, $list_alt169);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, MEMBER_P, CYBLACK_BASIC_PANEL_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt172, $list_alt173);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE, CYBLACK_BASIC_PANEL_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt165, $list_alt176);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD, CYBLACK_BASIC_PANEL_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt179);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, CLEAR, CYBLACK_BASIC_PANEL_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(FIND_NTH_LINK, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt155, $list_alt182);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, FIND_NTH_LINK, CYBLACK_BASIC_PANEL_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method(FIND_LINK, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt147, $list_alt185);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, FIND_LINK, CYBLACK_BASIC_PANEL_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method(REVERSE_LINK, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt188, $list_alt189);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REVERSE_LINK, CYBLACK_BASIC_PANEL_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LINK, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt188, $list_alt192);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, DELETE_LINK, CYBLACK_BASIC_PANEL_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt198, $list_alt199);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_CONTENTS, CYBLACK_BASIC_PANEL_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt203);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_CONTENTS, CYBLACK_BASIC_PANEL_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt126, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ELEMENT_EQUAL_P, CYBLACK_BASIC_PANEL_ELEMENT_EQUAL_P_METHOD);
        methods.methods_incorporate_instance_method(HAS_MARK_P, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt209, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, HAS_MARK_P, CYBLACK_BASIC_PANEL_HAS_MARK_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_MARK, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt209, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_MARK, CYBLACK_BASIC_PANEL_REMOVE_MARK_METHOD);
        methods.methods_incorporate_instance_method(ADD_MARK, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt209, $list_alt216);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_MARK, CYBLACK_BASIC_PANEL_ADD_MARK_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ALL_MARKS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt219);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, CLEAR_ALL_MARKS, CYBLACK_BASIC_PANEL_CLEAR_ALL_MARKS_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_panel_class(CYBLACK_BASIC_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_MARKABLE, CYBLACK_BASIC_PANEL, $list_alt239, NIL, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, INITIALIZE_QUA_MARKABLE, CYBLACK_BASIC_PANEL_INITIALIZE_QUA_MARKABLE_METHOD);
        methods.methods_incorporate_instance_method(GET_MARKS_INTERNAL, CYBLACK_BASIC_PANEL, $list_alt243, NIL, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_MARKS_INTERNAL, CYBLACK_BASIC_PANEL_GET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MARKS_INTERNAL, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt247, $list_alt248);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_MARKS_INTERNAL, CYBLACK_BASIC_PANEL_SET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DOUBLY_LINKED_LIST, CYBLACK_BASIC_PANEL, $list_alt239, NIL, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, INITIALIZE_QUA_DOUBLY_LINKED_LIST, CYBLACK_BASIC_PANEL_INITIALIZE_QUA_DOUBLY_LINKED_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt256);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_PANEL_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt259, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_PANEL_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_COUNT, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt264, $list_alt265);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_ELEMENT_COUNT, CYBLACK_BASIC_PANEL_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(INC_ELEMENT_COUNT, CYBLACK_BASIC_PANEL, $list_alt13, NIL, $list_alt269);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, INC_ELEMENT_COUNT, CYBLACK_BASIC_PANEL_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEC_ELEMENT_COUNT, CYBLACK_BASIC_PANEL, $list_alt13, NIL, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, DEC_ELEMENT_COUNT, CYBLACK_BASIC_PANEL_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_LINK, CYBLACK_BASIC_PANEL, $list_alt243, NIL, $list_alt277);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_FIRST_LINK, CYBLACK_BASIC_PANEL_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_LINK, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt280, $list_alt281);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_FIRST_LINK, CYBLACK_BASIC_PANEL_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_LINK, CYBLACK_BASIC_PANEL, $list_alt243, NIL, $list_alt285);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_LAST_LINK, CYBLACK_BASIC_PANEL_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_LAST_LINK, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt288, $list_alt289);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_LAST_LINK, CYBLACK_BASIC_PANEL_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt293);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_ELEMENT_COUNT, CYBLACK_BASIC_PANEL_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt295);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ALLOCATE_ENUMERATOR, CYBLACK_BASIC_PANEL_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt299, $list_alt300);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_PANEL_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt303, $list_alt304);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, PRINT, CYBLACK_BASIC_PANEL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DLL_PANEL, CYBLACK_BASIC_PANEL, $list_alt239, NIL, $list_alt309);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, INITIALIZE_QUA_DLL_PANEL, CYBLACK_BASIC_PANEL_INITIALIZE_QUA_DLL_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_STIMULATION_TYPE, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt312);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_STIMULATION_TYPE, CYBLACK_BASIC_PANEL_GET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_STIMULATION_TYPE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt315, $list_alt316);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_STIMULATION_TYPE, CYBLACK_BASIC_PANEL_SET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPER_PANELS, CYBLACK_BASIC_PANEL, $list_alt243, NIL, $list_alt320);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_SUPER_PANELS, CYBLACK_BASIC_PANEL_GET_SUPER_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUB_PANELS, CYBLACK_BASIC_PANEL, $list_alt243, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_SUB_PANELS, CYBLACK_BASIC_PANEL_GET_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPER_PANEL, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt325, $list_alt326);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_SUPER_PANEL, CYBLACK_BASIC_PANEL_ADD_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPER_PANEL, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt330, $list_alt331);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_SUPER_PANEL, CYBLACK_BASIC_PANEL_REMOVE_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUB_PANEL, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt335, $list_alt336);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_SUB_PANEL, CYBLACK_BASIC_PANEL_ADD_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUB_PANEL, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt340, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_SUB_PANEL, CYBLACK_BASIC_PANEL_REMOVE_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt63, $list_alt345);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_POSTING, CYBLACK_BASIC_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING, CYBLACK_BASIC_PANEL, $list_alt13, $list_alt63, $list_alt358);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_POSTING, CYBLACK_BASIC_PANEL_REMOVE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt361);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_DATATYPE, CYBLACK_BASIC_PANEL_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt364, $list_alt365);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_DATATYPE, CYBLACK_BASIC_PANEL_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt369, $list_alt370);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt369, $list_alt375);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt379);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt382);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTING, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt63, $list_alt385);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_DIRECT_POSTING, CYBLACK_BASIC_PANEL_ADD_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt63, $list_alt387);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_DIRECT_POSTING, CYBLACK_BASIC_PANEL_REMOVE_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_DIRECT_POSTINGS, CYBLACK_BASIC_PANEL_GET_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt391);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_PANEL, $list_alt13, NIL, $list_alt394);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, INITIALIZE, CYBLACK_BASIC_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_PANEL, $list_alt399, $list_alt400, $list_alt401);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, SET_APPLICATION, CYBLACK_BASIC_PANEL_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt406);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ON_STARTUP, CYBLACK_BASIC_PANEL_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt409);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ON_SHUTDOWN, CYBLACK_BASIC_PANEL_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING_DAEMON, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt414, $list_alt415);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, ADD_POSTING_DAEMON, CYBLACK_BASIC_PANEL_ADD_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING_DAEMON, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt419, $list_alt420);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_POSTING_DAEMON, CYBLACK_BASIC_PANEL_REMOVE_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMONS, CYBLACK_BASIC_PANEL, $list_alt255, NIL, $list_alt424);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET_POSTING_DAEMONS, CYBLACK_BASIC_PANEL_GET_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_PANEL, $list_alt28, NIL, $list_alt427);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(GET, CYBLACK_BASIC_PANEL, $list_alt28, $list_alt431, $list_alt432);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PANEL, GET, CYBLACK_BASIC_PANEL_GET_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_PASSIVE_PANEL, CYBLACK_BASIC_PANEL, NIL, NIL, $list_alt435);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_PASSIVE_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_PASSIVE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PASSIVE_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_PASSIVE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PASSIVE_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_passive_panel_class(CYBLACK_BASIC_PASSIVE_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_PASSIVE_PANEL, $list_alt13, NIL, $list_alt438);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PASSIVE_PANEL, INITIALIZE, CYBLACK_BASIC_PASSIVE_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SINGLETON_PANEL, CYBLACK_BASIC_PANEL, NIL, NIL, $list_alt443);
        classes.class_set_implements_slot_listeners(CYBLACK_SINGLETON_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SINGLETON_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLETON_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SINGLETON_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLETON_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_singleton_panel_class(CYBLACK_SINGLETON_PANEL);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_SINGLETON_PANEL, $list_alt28, $list_alt63, $list_alt446);
        methods.subloop_register_instance_method(CYBLACK_SINGLETON_PANEL, ADD_POSTING, CYBLACK_SINGLETON_PANEL_ADD_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_PASSIVE_SINGLETON_PANEL, CYBLACK_SINGLETON_PANEL, NIL, NIL, $list_alt435);
        classes.class_set_implements_slot_listeners(CYBLACK_PASSIVE_SINGLETON_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PASSIVE_SINGLETON_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PASSIVE_SINGLETON_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PASSIVE_SINGLETON_PANEL, $sym450$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PASSIVE_SINGLETON_PANEL_INSTA);
        subloop_reserved_initialize_cyblack_passive_singleton_panel_class(CYBLACK_PASSIVE_SINGLETON_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PASSIVE_SINGLETON_PANEL, $list_alt13, NIL, $list_alt438);
        methods.subloop_register_instance_method(CYBLACK_PASSIVE_SINGLETON_PANEL, INITIALIZE, CYBLACK_PASSIVE_SINGLETON_PANEL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_STACK_PANEL, CYBLACK_BASIC_PANEL, NIL, NIL, $list_alt454);
        classes.class_set_implements_slot_listeners(CYBLACK_STACK_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_STACK_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STACK_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_STACK_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STACK_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_stack_panel_class(CYBLACK_STACK_PANEL);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_STACK_PANEL, $list_alt28, $list_alt63, $list_alt457);
        methods.subloop_register_instance_method(CYBLACK_STACK_PANEL, ADD_POSTING, CYBLACK_STACK_PANEL_ADD_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, CYBLACK_BASIC_POSTING_VISITOR, NIL, NIL, $list_alt462);
        classes.class_set_implements_slot_listeners(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $sym470$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_INSTA);
        subloop_reserved_initialize_cyblack_virtual_panel_extractor_class(CYBLACK_VIRTUAL_PANEL_EXTRACTOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt13, NIL, $list_alt471);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, INITIALIZE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt13, $list_alt303, $list_alt474);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, PRINT, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt28, $list_alt480, $list_alt481);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, SET_INITIAL_STATE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(GET_PREDICATOR, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt255, NIL, $list_alt485);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, GET_PREDICATOR, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_PREDICATOR_METHOD);
        methods.methods_incorporate_instance_method(SET_PREDICATOR, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, NIL, $list_alt488, $list_alt489);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, SET_PREDICATOR, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_PREDICATOR_METHOD);
        methods.methods_incorporate_instance_method(GET_ARGS, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt255, NIL, $list_alt493);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, GET_ARGS, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(SET_ARGS, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt28, $list_alt496, $list_alt497);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, SET_ARGS, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_P, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt13, $list_alt63, $list_alt501);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, EXTRACT_P, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_EXTRACT_P_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt28, $list_alt504, $list_alt505);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, VISIT, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR, $list_alt255, NIL, $list_alt509);
        methods.subloop_register_instance_method(CYBLACK_VIRTUAL_PANEL_EXTRACTOR, GET_FINAL_STATE, CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_FINAL_STATE_METHOD);
        interfaces.new_interface(CYBLACK_VIRTUAL_PANEL, $list_alt512, $list_alt513, $list_alt514);
        interfaces.new_interface(CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt516, $list_alt517, $list_alt518);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, NIL, $list_alt520);
        interfaces.interfaces_add_interface_instance_method(SET_BASE_PANEL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt522, $list_alt523);
        interfaces.interfaces_add_interface_instance_method(SET_SUBSET_PREDICATOR, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt525, $list_alt526);
        interfaces.interfaces_add_interface_instance_method(DERIVE_CONTENTS_INTERNAL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt528);
        interfaces.interfaces_add_interface_instance_method(GET_SUPER_PANELS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, NIL, $list_alt529);
        interfaces.interfaces_add_interface_instance_method(GET_SUB_PANELS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, NIL, $list_alt530);
        interfaces.interfaces_add_interface_instance_method(ADD_SUPER_PANEL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt325, $list_alt531);
        interfaces.interfaces_add_interface_instance_method(REMOVE_SUPER_PANEL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt330, $list_alt532);
        interfaces.interfaces_add_interface_instance_method(ADD_SUB_PANEL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt335, $list_alt533);
        interfaces.interfaces_add_interface_instance_method(REMOVE_SUB_PANEL, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt340, $list_alt534);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt17, $list_alt535);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt17, $list_alt535);
        interfaces.interfaces_add_interface_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt22, $list_alt536);
        interfaces.interfaces_add_interface_instance_method(ADD_POSTING, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt63, $list_alt537);
        interfaces.interfaces_add_interface_instance_method(REMOVE_POSTING, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt13, $list_alt63, $list_alt537);
        interfaces.interfaces_add_interface_instance_method(GET_DATATYPE, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt538);
        interfaces.interfaces_add_interface_instance_method(SET_DATATYPE, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt364, $list_alt539);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt369, $list_alt540);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt369, $list_alt540);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt34, $list_alt541);
        interfaces.interfaces_add_interface_instance_method(GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt542);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt542);
        interfaces.interfaces_add_interface_instance_method(REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_POSTING, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt63, $list_alt537);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt63, $list_alt537);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt39, $list_alt543);
        interfaces.interfaces_add_interface_instance_method(GET_DIRECT_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt544);
        interfaces.interfaces_add_interface_instance_method(GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt545);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt544);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt545);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt48, $list_alt546);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt48, $list_alt547);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt53, $list_alt548);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt53, $list_alt548);
        interfaces.interfaces_add_interface_instance_method(ADD_POSTING_DAEMON, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt414, $list_alt549);
        interfaces.interfaces_add_interface_instance_method(REMOVE_POSTING_DAEMON, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt419, $list_alt550);
        interfaces.interfaces_add_interface_instance_method(GET_POSTING_DAEMONS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt58, $list_alt551);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_VIRTUAL_PANEL_TEMPLATE, $list_alt28, $list_alt58, $list_alt551);
        classes.subloop_new_class(CYBLACK_BASIC_VIRTUAL_PANEL, CYBLACK_BASIC_LOCKABLE, $list_alt553, NIL, $list_alt554);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_VIRTUAL_PANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt58, $list_alt551);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_POSTING_DAEMONS, $sym557$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METH);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt58, $list_alt551);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, $sym558$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMO);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_ALL_DIRECT_POSTING_DAEMONS, $sym559$CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_MET);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING_DAEMON, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt419, $list_alt550);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_POSTING_DAEMON, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING_DAEMON, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt414, $list_alt549);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_POSTING_DAEMON, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt53, $list_alt548);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, $sym563$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_ME);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt53, $list_alt548);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, $sym564$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt48, $list_alt547);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt48, $list_alt546);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ITERATE_OVER_ALL_DIRECT_POSTINGS, $sym566$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METH);
        methods.methods_incorporate_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt544);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ALL_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt544);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt39, $list_alt543);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_DIRECT_POSTINGS, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt63, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_DIRECT_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt63, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_DIRECT_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt542);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt542);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt34, $list_alt541);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCES, $sym579$CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHO);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt369, $list_alt540);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt369, $list_alt540);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ON_REMOVE_LAST_KNOWLEDGE_SOURCE, $sym582$CYBLACK_BASIC_VIRTUAL_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHO);
        methods.methods_incorporate_instance_method(ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_VIRTUAL_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt364, $list_alt539);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_DATATYPE, CYBLACK_BASIC_VIRTUAL_PANEL_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt538);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_DATATYPE, CYBLACK_BASIC_VIRTUAL_PANEL_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt63, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt63, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt22, $list_alt536);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, STIMULATE_ALL_MONITORS, CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt17, $list_alt535);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, STIMULATE_ALL_KNOWLEDGE_SOURCES, $sym590$CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHO);
        methods.methods_incorporate_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt17, $list_alt535);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, STIMULATE_DIRECT_KNOWLEDGE_SOURCES, $sym591$CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_ME);
        methods.methods_incorporate_instance_method(REMOVE_SUB_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt340, $list_alt534);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_SUB_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUB_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt335, $list_alt533);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_SUB_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPER_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt330, $list_alt532);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, REMOVE_SUPER_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPER_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt325, $list_alt531);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ADD_SUPER_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_ADD_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_SUB_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt14, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ALL_SUB_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUB_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt530);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_SUB_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPER_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt529);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_SUPER_PANELS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUPER_PANELS_METHOD);
        methods.methods_incorporate_instance_method(DERIVE_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt528);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, DERIVE_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_DERIVE_CONTENTS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBSET_PREDICATOR, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt525, $list_alt526);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_SUBSET_PREDICATOR, CYBLACK_BASIC_VIRTUAL_PANEL_SET_SUBSET_PREDICATOR_METHOD);
        methods.methods_incorporate_instance_method(SET_BASE_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt522, $list_alt523);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_BASE_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_SET_BASE_PANEL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt520);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE, $sym602$CYBLACK_BASIC_VIRTUAL_PANEL_INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_VIRTUAL_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_VIRTUAL_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_VIRTUAL_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_VIRTUAL_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_virtual_panel_class(CYBLACK_BASIC_VIRTUAL_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt605);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, INITIALIZE, CYBLACK_BASIC_VIRTUAL_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_ARGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt255, NIL, $list_alt493);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ARGS, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(SET_ARGS, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt496, $list_alt609);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_ARGS, CYBLACK_BASIC_VIRTUAL_PANEL_SET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt243, NIL, $list_alt613);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_GET_CONTENTS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVE_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_ACTIVE_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_GET_ACTIVE_CONTENTS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt198, $list_alt618);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_CONTENTS_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_SET_CONTENTS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_BASE_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt255, NIL, $list_alt622);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_BASE_PANEL, CYBLACK_BASIC_VIRTUAL_PANEL_GET_BASE_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_BASE_PANEL_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt625, $list_alt626);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_BASE_PANEL_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_SET_BASE_PANEL_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBSET_PREDICATOR, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt255, NIL, $list_alt485);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_SUBSET_PREDICATOR, CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUBSET_PREDICATOR_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBSET_PREDICATOR_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, $list_alt525, $list_alt632);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_SUBSET_PREDICATOR_INTERNAL, CYBLACK_BASIC_VIRTUAL_PANEL_SET_SUBSET_PREDICATOR_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(PREDICATOR_IS_METHOD, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt13, NIL, $list_alt635);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, PREDICATOR_IS_METHOD, CYBLACK_BASIC_VIRTUAL_PANEL_PREDICATOR_IS_METHOD_METHOD);
        methods.methods_incorporate_instance_method(GET, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt431, $list_alt432);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET, CYBLACK_BASIC_VIRTUAL_PANEL_GET_METHOD);
        methods.methods_incorporate_instance_method(GET_STIMULATION_TYPE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, GET_STIMULATION_TYPE, CYBLACK_BASIC_VIRTUAL_PANEL_GET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_STIMULATION_TYPE, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt315, $list_alt640);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, SET_STIMULATION_TYPE, CYBLACK_BASIC_VIRTUAL_PANEL_SET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt63, $list_alt642);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, DEACTIVATE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_DEACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ACTIVATE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL, $list_alt28, $list_alt63, $list_alt642);
        methods.subloop_register_instance_method(CYBLACK_BASIC_VIRTUAL_PANEL, ACTIVATE_POSTING, CYBLACK_BASIC_VIRTUAL_PANEL_ACTIVATE_POSTING_METHOD);
        interfaces.new_interface(CYBLACK_SEQUENCE_PANEL, $list_alt646, $list_alt647, $list_alt70);
        interfaces.interfaces_add_interface_instance_method(ADD_DIRECT_POSTING, CYBLACK_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt648);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt649);
        interfaces.interfaces_add_interface_instance_method(GET_DIRECT_POSTINGS, CYBLACK_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt650);
        classes.subloop_new_class(CYBLACK_BASIC_SEQUENCE_PANEL, CYBLACK_BASIC_LOCKABLE, $list_alt652, NIL, $list_alt653);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_SEQUENCE_PANEL, NIL);
        methods.methods_incorporate_instance_method(ACTIVATE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ACTIVATE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_ACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, DEACTIVATE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_DEACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt58, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_POSTING_DAEMONS, $sym664$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_MET);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt58, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, $sym665$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEM);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt53, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, $sym666$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_M);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt53, $list_alt54);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, $sym667$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SO);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt48, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt48, $list_alt49);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ITERATE_OVER_ALL_DIRECT_POSTINGS, $sym669$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_MET);
        methods.methods_incorporate_instance_method(GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_ALL_ACTIVE_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_ALL_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt37);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCES, $sym675$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METH);
        methods.methods_incorporate_instance_method(ON_REMOVE_LAST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ON_REMOVE_LAST_KNOWLEDGE_SOURCE, $sym676$CYBLACK_BASIC_SEQUENCE_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METH);
        methods.methods_incorporate_instance_method(ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ON_ADD_FIRST_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATE_ALL_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_MONITORS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATE_ALL_MONITORS, CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt17, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATE_ALL_KNOWLEDGE_SOURCES, $sym680$CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METH);
        methods.methods_incorporate_instance_method(STIMULATE_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt17, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATE_DIRECT_KNOWLEDGE_SOURCES, $sym681$CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_M);
        methods.methods_incorporate_instance_method(GET_ALL_SUB_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt14, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_ALL_SUB_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt684, $list_alt685);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, $sym686$CYBLACK_BASIC_SEQUENCE_PANEL_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ME);
        methods.methods_incorporate_instance_method(INDEX_OF_NEXT_NON_NIL_ELEMENT, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt684, $list_alt688);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, INDEX_OF_NEXT_NON_NIL_ELEMENT, CYBLACK_BASIC_SEQUENCE_PANEL_INDEX_OF_NEXT_NON_NIL_ELEMENT_METHOD);
        methods.methods_incorporate_instance_method(ALL_NULL_P, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt691);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ALL_NULL_P, CYBLACK_BASIC_SEQUENCE_PANEL_ALL_NULL_P_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt693, $list_alt694);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_SEQUENCE_PANEL_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt697);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ALLOCATE_ENUMERATOR, CYBLACK_BASIC_SEQUENCE_PANEL_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt165, $list_alt700);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBSEQUENCE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt703, $list_alt704);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_SUBSEQUENCE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUBSEQUENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt708, $list_alt709);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_NTH, CYBLACK_BASIC_SEQUENCE_PANEL_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_NTH, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt713, $list_alt714);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_NTH, CYBLACK_BASIC_SEQUENCE_PANEL_GET_NTH_METHOD);
        methods.methods_incorporate_instance_method(GET_LENGTH, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt717);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_LENGTH, CYBLACK_BASIC_SEQUENCE_PANEL_GET_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt719);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, CLEAR, CYBLACK_BASIC_SEQUENCE_PANEL_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(HAS_MARK_P, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt209, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, HAS_MARK_P, CYBLACK_BASIC_SEQUENCE_PANEL_HAS_MARK_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_MARK, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt209, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_MARK, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_MARK_METHOD);
        methods.methods_incorporate_instance_method(ADD_MARK, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt209, $list_alt216);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_MARK, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_MARK_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ALL_MARKS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt219);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, CLEAR_ALL_MARKS, CYBLACK_BASIC_SEQUENCE_PANEL_CLEAR_ALL_MARKS_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_SEQUENCE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_SEQUENCE_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_sequence_panel_class(CYBLACK_BASIC_SEQUENCE_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_MARKABLE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt239, NIL, $list_alt727);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, INITIALIZE_QUA_MARKABLE, CYBLACK_BASIC_SEQUENCE_PANEL_INITIALIZE_QUA_MARKABLE_METHOD);
        methods.methods_incorporate_instance_method(GET_MARKS_INTERNAL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt243, NIL, $list_alt729);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_MARKS_INTERNAL, CYBLACK_BASIC_SEQUENCE_PANEL_GET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MARKS_INTERNAL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt247, $list_alt731);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_MARKS_INTERNAL, CYBLACK_BASIC_SEQUENCE_PANEL_SET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt734);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_CONTENTS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_STORAGE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, NIL, $list_alt738);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_INTERNAL_STORAGE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERNAL_STORAGE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt742, $list_alt743);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_INTERNAL_STORAGE, CYBLACK_BASIC_SEQUENCE_PANEL_SET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_STORAGE_SIZE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, NIL, $list_alt747);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_STORAGE_SIZE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_STORAGE_SIZE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt751, $list_alt752);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_STORAGE_SIZE, CYBLACK_BASIC_SEQUENCE_PANEL_SET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_LARGEST_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, NIL, $list_alt756);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_LARGEST_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL_GET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method(SET_LARGEST_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt760, $list_alt761);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_LARGEST_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL_SET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method(RECORD_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt765, $list_alt766);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, RECORD_INDEX, CYBLACK_BASIC_SEQUENCE_PANEL_RECORD_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_VALUE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt770);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_DEFAULT_VALUE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method(SET_DEFAULT_VALUE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt774, $list_alt775);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_DEFAULT_VALUE, CYBLACK_BASIC_SEQUENCE_PANEL_SET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method(GET_GROWTH_FACTOR, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt779);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_GROWTH_FACTOR, CYBLACK_BASIC_SEQUENCE_PANEL_GET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method(SET_GROWTH_FACTOR, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt783, $list_alt784);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_GROWTH_FACTOR, CYBLACK_BASIC_SEQUENCE_PANEL_SET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method(GET_SEQUENCE_CLASS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt788);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_SEQUENCE_CLASS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_SEQUENCE_CLASS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt792, $list_alt793);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_SEQUENCE_CLASS, CYBLACK_BASIC_SEQUENCE_PANEL_SET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_STIMULATION_TYPE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt255, NIL, $list_alt312);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_STIMULATION_TYPE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_STIMULATION_TYPE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt315, $list_alt316);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_STIMULATION_TYPE, CYBLACK_BASIC_SEQUENCE_PANEL_SET_STIMULATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPER_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt243, NIL, $list_alt320);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_SUPER_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUPER_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUB_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt243, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_SUB_PANELS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUB_PANELS_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPER_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt325, $list_alt326);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_SUPER_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPER_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt330, $list_alt803);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_SUPER_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_SUPER_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUB_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt335, $list_alt336);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_SUB_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUB_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt340, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_SUB_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_SUB_PANEL_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt810);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt13, $list_alt63, $list_alt813);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt255, NIL, $list_alt361);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_DATATYPE, CYBLACK_BASIC_SEQUENCE_PANEL_GET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt364, $list_alt365);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_DATATYPE, CYBLACK_BASIC_SEQUENCE_PANEL_SET_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt369, $list_alt370);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_KNOWLEDGE_SOURCE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt369, $list_alt375);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_DIRECT_KNOWLEDGE_SOURCE, $sym821$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHO);
        methods.methods_incorporate_instance_method(GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt255, NIL, $list_alt379);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_DIRECT_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt382);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD);
        methods.methods_incorporate_instance_method(GET, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt431, $list_alt825);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET, CYBLACK_BASIC_SEQUENCE_PANEL_GET_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt827);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_DIRECT_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt63, $list_alt829);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_DIRECT_POSTING, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt832);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_DIRECT_ACTIVE_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt835);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_DIRECT_POSTINGS, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING_DAEMON, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt414, $list_alt415);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ADD_POSTING_DAEMON, CYBLACK_BASIC_SEQUENCE_PANEL_ADD_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_POSTING_DAEMON, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt419, $list_alt420);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_POSTING_DAEMON, CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_POSTING_DAEMON_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt255, NIL, $list_alt424);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, GET_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL_GET_POSTING_DAEMONS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DIRECT_POSTING_DAEMONS, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt427);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, REMOVE_ALL_DIRECT_POSTING_DAEMONS, $sym844$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_ME);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt239, NIL, $list_alt845);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, INITIALIZE, CYBLACK_BASIC_SEQUENCE_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, $list_alt303, $list_alt848);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, PRINT, CYBLACK_BASIC_SEQUENCE_PANEL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt399, $list_alt400, $list_alt856);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, SET_APPLICATION, CYBLACK_BASIC_SEQUENCE_PANEL_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt406);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ON_STARTUP, CYBLACK_BASIC_SEQUENCE_PANEL_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt28, NIL, $list_alt409);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_PANEL, ON_SHUTDOWN, CYBLACK_BASIC_SEQUENCE_PANEL_ON_SHUTDOWN_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("ACTIVE"), makeKeyword("PASSIVE"));

    private static final SubLSymbol CYBLACK_PANEL_STIMULATION_TYPE = makeSymbol("CYBLACK-PANEL-STIMULATION-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_PANEL_STIMULATION_TYPE = makeSymbol("ENCODE-CYBLACK-PANEL-STIMULATION-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_PANEL_STIMULATION_TYPE = makeSymbol("DECODE-CYBLACK-PANEL-STIMULATION-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_PANEL_STIMULATION_TYPE_P = makeSymbol("CYBLACK-PANEL-STIMULATION-TYPE-P");



    static private final SubLList $list_alt9 = list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-MARKABLE"), makeSymbol("CYBLACK-LOCKABLE"));

    static private final SubLList $list_alt10 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-MARKABLE"), makeSymbol("CYBLACK-LOCKABLE")));

    static private final SubLList $list_alt11 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATION-TYPE"), list(makeSymbol("NEW-STIMULATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL), list(makeSymbol("POSTING"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")) });



    static private final SubLList $list_alt13 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt14 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL));

    static private final SubLList $list_alt15 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTED-PANELS"), NIL), list(makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("GET-SUB-PANELS"), makeSymbol("SELF"))), list(makeSymbol("CURRENT-PANEL"), NIL)), list(makeSymbol("WHILE"), makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("CURRENT-SUB-PANELS"))), list(makeSymbol("CPOP"), makeSymbol("CURRENT-SUB-PANELS")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("MEMBER?"), makeSymbol("CURRENT-PANEL"), makeSymbol("EXCLUDED-PANELS")), list(makeSymbol("MEMBER"), makeSymbol("CURRENT-PANEL"), makeSymbol("COLLECTED-PANELS"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-PANEL"), makeSymbol("COLLECTED-PANELS")), list(makeSymbol("CLET"), list(list(makeSymbol("LOCAL-SUB-PANELS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("PWHEN"), makeSymbol("LOCAL-SUB-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SUB-PANELS"), list(makeSymbol("NCONC"), makeSymbol("LOCAL-SUB-PANELS"), makeSymbol("CURRENT-SUB-PANELS"))))))), list(RET, makeSymbol("COLLECTED-PANELS"))));

    private static final SubLSymbol STIMULATE_DIRECT_KNOWLEDGE_SOURCES = makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt17 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL));

    static private final SubLList $list_alt18 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ENVIRONMENT"))), makeString("(STIMULATE-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-ENVIRONMENT"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("CYBLACK-KS-STIMULATE"), makeSymbol("TEMPLATE-KS"), makeSymbol("ENVIRONMENT")))), list(RET, NIL));



    static private final SubLList $list_alt20 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ENVIRONMENT"))), makeString("(STIMULATE-ALL-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-ENVIRONMENT"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("UNIQUE-ELEMENTS"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))))), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(STIMULATE-ALL-KNOWLEDGE-SOURCES ~S): About to stimulate ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%Stimulating ~S."), makeSymbol("TEMPLATE-KS"))), list(makeSymbol("CYBLACK-KS-STIMULATE"), makeSymbol("TEMPLATE-KS"), makeSymbol("ENVIRONMENT")))), list(RET, NIL));



    static private final SubLList $list_alt22 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL));

    static private final SubLList $list_alt23 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("UNIQUE-ELEMENTS"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KS"), list(QUOTE, makeSymbol("PERFORM-ACTION")), makeSymbol("ENVIRONMENTS"))))), list(RET, NIL));



    static private final SubLList $list_alt25 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL), list(makeSymbol("POSTING"), NIL));

    static private final SubLList $list_alt26 = list(list(makeSymbol("PWHEN"), makeSymbol("ENVIRONMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR")), makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeSymbol("ENVIRONMENT"), makeSymbol("POSTING")), list(makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), makeSymbol("SELF"), makeSymbol("GOAL-SATISFACTION-DAEMON-VISITOR")))), list(RET, NIL));



    static private final SubLList $list_alt28 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), NIL), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUPER-PANELS")), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUPER-PANELS"))), list(new SubLObject[]{ makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), NIL), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), NIL, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-NEW-KNOWLEDGE-SOURCES")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-SUPER-PANELS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-SUPER-PANELS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))) })), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-KNOWLEDGE-SOURCES")))), list(RET, makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"))));



    static private final SubLList $list_alt31 = list(list(RET, NIL));





    static private final SubLList $list_alt34 = list(makeSymbol("KNOWLEDGE-SOURCES"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("KNOWLEDGE-SOURCES")), makeString("(SET-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not a valid list of knowledge sources."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, makeSymbol("KNOWLEDGE-SOURCES")));



    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, NIL)));



    static private final SubLList $list_alt39 = list(makeSymbol("POSTINGS"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("POSTINGS")), makeString("(ADD-DIRECT-POSTINGS ~S): ~S is not a valid list of postings."), makeSymbol("SELF"), makeSymbol("POSTINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("POSTINGS")), list(makeSymbol("ADD-DIRECT-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING"))), list(RET, makeSymbol("POSTINGS")));



    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-POSTINGS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-DIRECT-POSTINGS"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-DIRECT-POSTINGS")), list(makeSymbol("REMOVE-DIRECT-POSTING"), makeSymbol("SELF"), makeSymbol("TEMPLATE-POSTING")))), list(RET, NIL));



    static private final SubLList $list_alt44 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-POSTINGS"), NIL), list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE")), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ALL-POSTINGS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-ALL-POSTINGS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-POSTINGS")))), list(RET, makeSymbol("TEMPLATE-ALL-POSTINGS"))));



    static private final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), NIL), list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE")), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PANEL-HAS-MARK-P"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CYBLACK-PANEL-ADD-MARK"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeKeyword("GET-ALL-POSTINGS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-ACTIVE-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-VISITED-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-MARK"), makeSymbol("TEMPLATE-VISITED-PANEL"), makeKeyword("GET-ALL-POSTINGS")))), list(RET, makeSymbol("TEMPLATE-ALL-ACTIVE-POSTINGS"))));

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTINGS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS");

    static private final SubLList $list_alt48 = list(makeSymbol("POSTING-VISITOR"));

    static private final SubLList $list_alt49 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-POSTINGS"), list(makeSymbol("GET-DIRECT-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-DIRECT-POSTINGS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-POSTING")), list(RET, makeSymbol("POSTING-VISITOR")))))), list(RET, makeSymbol("POSTING-VISITOR")));



    static private final SubLList $list_alt51 = list(list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S."), makeSymbol("SELF"), list(makeSymbol("CYBLACK-GET-TYPENAME-IF-NOT-NULL"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF"))))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S."), makeSymbol("SELF"), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("POSTING-VISITOR"))))), list(RET, makeSymbol("POSTING-VISITOR"))));

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt53 = list(makeSymbol("KS-VISITOR"));

    static private final SubLList $list_alt54 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KS-VISITOR-P"), makeSymbol("KS-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-KS-VISITOR."), makeSymbol("SELF"), makeSymbol("KS-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-KS")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-KS")), list(RET, makeSymbol("KS-VISITOR")))))), list(RET, makeSymbol("KS-VISITOR")));

    private static final SubLSymbol ITERATE_OVER_ALL_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt56 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KS-VISITOR-P"), makeSymbol("KS-VISITOR")), makeString("(ITERATE-OVER-ALL-KNOWLEDGE-SOURCES ~S): ~S is not an instance of CYBLACK-KS-VISITOR"), makeSymbol("SELF"), makeSymbol("KS-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), list(makeSymbol("TEMPLATE-VISITOR-IS-CYBLACK-STATE-CHANGE-KS-VISITOR"), list(makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-P"), makeSymbol("KS-VISITOR"))), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-VISITOR-IS-CYBLACK-STATE-CHANGE-KS-VISITOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PANEL"), makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR")), makeSymbol("KS-VISITOR"), makeSymbol("TEMPLATE-CURRENT-PANEL"))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("KS-VISITOR"))))), list(RET, makeSymbol("KS-VISITOR"))));

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS");

    static private final SubLList $list_alt58 = list(makeSymbol("DAEMON-VISITOR"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR-P"), makeSymbol("DAEMON-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON-VISITOR."), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(makeSymbol("GET-POSTING-DAEMONS"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("TEMPLATE-NOT-FINISHED"), T), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-NOT-FINISHED"), list(makeSymbol("CNOT"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("PROGN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NOT-FINISHED"), NIL))))), list(list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("TEMPLATE-POSTING-DAEMONS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("TEMPLATE-ENUMERATOR"), makeString("(ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS ~S): Failed to allocate enumerator."), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), list(makeSymbol("ENUMERATOR-TEMPLATE-EMPTY-P"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("ENUMERATOR-TEMPLATE-FIRST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("TEMPLATE-NOT-FINISHED"), T)), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-NOT-FINISHED"), list(makeSymbol("CNOT"), list(makeSymbol("ENUMERATOR-TEMPLATE-LAST-P"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DAEMON"), list(makeSymbol("ENUMERATOR-TEMPLATE-NEXT"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DAEMON-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-DAEMON")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NOT-FINISHED"), NIL)))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-POSTING-DAEMONS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))))), list(RET, NIL));



    static private final SubLList $list_alt61 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR-P"), makeSymbol("DAEMON-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): Iterating over panel ~S with visitor ~S."), makeSymbol("SELF"), makeSymbol("SELF"), makeSymbol("DAEMON-VISITOR")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("TEMPLATE-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("DAEMON-VISITOR"))))), list(RET, makeSymbol("DAEMON-VISITOR"))));



    static private final SubLList $list_alt63 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(DEACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR")), makeSymbol("TEMPLATE-VISITOR"), makeSymbol("APPLICATION"), makeSymbol("POSTING"), makeKeyword("REMOVE-POST")), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("TEMPLATE-VISITOR"))), list(RET, makeSymbol("POSTING")));



    static private final SubLList $list_alt66 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR")), makeSymbol("TEMPLATE-VISITOR"), makeSymbol("APPLICATION"), makeSymbol("POSTING"), $POST), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("TEMPLATE-VISITOR"))), list(RET, makeSymbol("POSTING")));

    private static final SubLSymbol CYBLACK_DLL_PANEL = makeSymbol("CYBLACK-DLL-PANEL");

    static private final SubLList $list_alt68 = list(makeSymbol("CYBLACK-PANEL"), makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"));

    static private final SubLList $list_alt69 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-PANEL"), makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE")));

    static private final SubLList $list_alt70 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")));



    static private final SubLList $list_alt72 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): ~S is not a legal posting."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("POSTING"))));



    static private final SubLList $list_alt74 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(REMOVE-DIRECT-POSTING ~S): ~S is not a legal posting."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("POSTING"))));



    static private final SubLList $list_alt76 = list(list(RET, list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))));





    static private final SubLList $list_alt79 = list(makeSymbol("CYBLACK-DLL-PANEL"), makeSymbol("CYBLACK-MARKABLE-TEMPLATE"));

    public static final SubLObject $list_alt80 = _constant_80_initializer();











    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_ACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ACTIVATE-POSTING-METHOD");

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol $REMOVE_POST = makeKeyword("REMOVE-POST");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_DEACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-DEACTIVATE-POSTING-METHOD");

    static private final SubLString $str_alt93$___ITERATE_OVER_ALL_POSTING_DAEMO = makeString("~%(ITERATE-OVER-ALL-POSTING-DAEMONS ~S): Iterating over panel ~S with visitor ~S.");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD");









    static private final SubLSymbol $sym100$CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS_METHO = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym102$CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES_MET = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLString $str_alt103$___ITERATE_OVER_ALL_POSTINGS__S__ = makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S.");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD");

    static private final SubLString $str_alt105$___ITERATE_OVER_ALL_DIRECT_POSTIN = makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S.");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol $GET_ALL_POSTINGS = makeKeyword("GET-ALL-POSTINGS");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ALL-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol $GET_ALL_KNOWLEDGE_SOURCES = makeKeyword("GET-ALL-KNOWLEDGE-SOURCES");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_STIMULATE_ALL_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-STIMULATE-ALL-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ALL_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ALL-SUB-PANELS-METHOD");



    static private final SubLList $list_alt126 = list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeString("(SWAP ~S): Cannot swap NIL elements."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LINK1"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT1"))), list(makeSymbol("LINK2"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT2")))), list(makeSymbol("MUST"), makeSymbol("LINK1"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT1")), list(makeSymbol("MUST"), makeSymbol("LINK2"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT2")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK2"))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK1"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK1")), makeSymbol("ELEMENT2")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK2")), makeSymbol("ELEMENT1")), list(RET, NIL) }));

    static private final SubLString $str_alt128$_SWAP__S___Cannot_swap_NIL_elemen = makeString("(SWAP ~S): Cannot swap NIL elements.");

    static private final SubLString $str_alt129$_SWAP__S____S_is_not_an_element_o = makeString("(SWAP ~S): ~S is not an element of this list.");





    private static final SubLSymbol CYBLACK_BASIC_PANEL_SWAP_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SWAP-METHOD");



    static private final SubLList $list_alt134 = list(list(RET, list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_EMPTY_P_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-EMPTY-P-METHOD");



    static private final SubLList $list_alt137 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-FIRST-LINK"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEXT-LINK")), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEXT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK"))), list(makeSymbol("REVERSE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-LINK")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-NEXT-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REVERSE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REVERSE-METHOD");



    static private final SubLList $list_alt140 = list(makeSymbol("OTHER-LIST"));

    static private final SubLList $list_alt141 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("OTHER-LIST")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("OTHER-LIST")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): Cannot append non list ~S."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(RET, makeSymbol("SELF"))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt142$_APPEND__S___Cannot_append_non_li = makeString("(APPEND ~S): Cannot append non list ~S.");





    private static final SubLSymbol CYBLACK_BASIC_PANEL_APPEND_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-APPEND-METHOD");



    static private final SubLList $list_alt147 = list(makeSymbol("ELEMENT"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LINKS"), list(RET, NIL)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("COUNT"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_POSITION_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-POSITION-METHOD");



    static private final SubLList $list_alt151 = list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("TEMPLATE-CONTENT")), list(makeSymbol("GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION"), makeSymbol("TEMPLATE-CONTENT"), makeSymbol("TEMPLATE-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-LINK")))), list(RET, makeSymbol("NEW-ELEMENT")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-NTH-METHOD");



    static private final SubLList $list_alt155 = list(makeSymbol("INDEX"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_NTH_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-NTH-METHOD");



    static private final SubLList $list_alt159 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LAST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_BUT_LAST_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-BUT-LAST-METHOD");



    static private final SubLList $list_alt162 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-FIRST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_POP_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-POP-METHOD");



    static private final SubLList $list_alt165 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt166 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_PUSH_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-PUSH-METHOD");



    static private final SubLList $list_alt169 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(RET, list(makeSymbol("FIF"), makeSymbol("TEMPLATE-LINK"), T, NIL))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-MEMBER-P-METHOD");



    static private final SubLList $list_alt172 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt173 = list(list(makeSymbol("PIF"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION"), makeSymbol("OLD-ELEMENT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LINK"))))), list(RET, makeSymbol("OLD-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-METHOD");



    static private final SubLList $list_alt176 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LAST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-LAST-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-METHOD");



    static private final SubLList $list_alt179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-CLEAR-METHOD");



    static private final SubLList $list_alt182 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNT"), makeSymbol("INDEX")), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_FIND_NTH_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-FIND-NTH-LINK-METHOD");



    static private final SubLList $list_alt185 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_FIND_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-FIND-LINK-METHOD");



    static private final SubLList $list_alt188 = list(makeSymbol("LINK"));

    static private final SubLList $list_alt189 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-NEXT"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), makeSymbol("TEMPLATE-NEXT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), makeSymbol("TEMPLATE-PREVIOUS")), list(RET, makeSymbol("LINK"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REVERSE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REVERSE-LINK-METHOD");



    static private final SubLList $list_alt192 = list(list(makeSymbol("MUST"), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("LINK")), makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("LINK")), list(makeSymbol("MUST"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("LINK")), makeSymbol("SELF")), makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S."), makeSymbol("SELF"), makeSymbol("LINK"), makeSymbol("SELF")), list(makeSymbol("DEC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-LAST-LINK")))), makeString("(DELETE-LINK ~S): Detected inconsistancy in list."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("LINK")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BEFORE-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-AFTER-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-BEFORE-LINK")), makeSymbol("TEMPLATE-AFTER-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-AFTER-LINK")), makeSymbol("TEMPLATE-BEFORE-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))))));

    static private final SubLString $str_alt193$_DELETE_LINK__S____S_is_not_a_val = makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL.");

    static private final SubLString $str_alt194$_DELETE_LINK__S___Link__S_is_not_ = makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S.");

    static private final SubLString $str_alt195$_DELETE_LINK__S___Detected_incons = makeString("(DELETE-LINK ~S): Detected inconsistancy in list.");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_DELETE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-DELETE-LINK-METHOD");



    static private final SubLList $list_alt198 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt199 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLString $str_alt200$_SET_CONTENTS__S___Cannot_set_the = makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list.");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt203 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), NIL), list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CPUSH"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-CURRENT-LINK")), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK")))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-CONTENTS")))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt206 = list(list(RET, list(EQUAL, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ELEMENT_EQUAL_P_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ELEMENT-EQUAL-P-METHOD");



    static private final SubLList $list_alt209 = list(makeSymbol("MARK"));

    static private final SubLList $list_alt210 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF"))), T, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_HAS_MARK_P_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-HAS-MARK-P-METHOD");



    static private final SubLList $list_alt213 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("DELETE"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(RET, makeSymbol("MARK")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_MARK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-MARK-METHOD");



    static private final SubLList $list_alt216 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-MARKS"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("CPUSH"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), makeSymbol("LIST-OF-MARKS")))), list(RET, makeSymbol("MARK")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_MARK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-MARK-METHOD");



    static private final SubLList $list_alt219 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_CLEAR_ALL_MARKS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-CLEAR-ALL-MARKS-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PANEL-CLASS");



























    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PANEL-INSTANCE");

    private static final SubLSymbol INITIALIZE_QUA_MARKABLE = makeSymbol("INITIALIZE-QUA-MARKABLE");

    static private final SubLList $list_alt239 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt240 = list(makeString("Initialize the instance as a markable interface instance."), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-MARKS"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_INITIALIZE_QUA_MARKABLE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-INITIALIZE-QUA-MARKABLE-METHOD");



    static private final SubLList $list_alt243 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt244 = list(makeString("Return marks upon this instance."), list(RET, makeSymbol("MARKS")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-MARKS-INTERNAL-METHOD");



    static private final SubLList $list_alt247 = list(makeSymbol("NEW-MARKS"));

    static private final SubLList $list_alt248 = list(makeString("Does the internal work of setting the instance's marks."), list(makeSymbol("CSETQ"), makeSymbol("MARKS"), makeSymbol("NEW-MARKS")), list(RET, makeSymbol("NEW-MARKS")));

    static private final SubLSymbol $sym249$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-MARKS-INTERNAL-METHOD");

    private static final SubLSymbol INITIALIZE_QUA_DOUBLY_LINKED_LIST = makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-LIST");

    static private final SubLList $list_alt252 = list(list(makeSymbol("SET-CYBLACK-BASIC-PANEL-ELEMENT-EQUALITY-PREDICATE"), makeSymbol("SELF"), list(QUOTE, EQ)), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-ELEMENT-COUNT"), makeSymbol("SELF"), ZERO_INTEGER), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-FIRST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-LAST-LINK"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_INITIALIZE_QUA_DOUBLY_LINKED_LIST_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-INITIALIZE-QUA-DOUBLY-LINKED-LIST-METHOD");



    static private final SubLList $list_alt255 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt256 = list(list(RET, makeSymbol("ELEMENT-EQUALITY-PREDICATE")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt259 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list_alt260 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt264 = list(makeSymbol("NEW-ELEMENT-COUNT"));

    static private final SubLList $list_alt265 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ELEMENT-COUNT")), makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), makeSymbol("NEW-ELEMENT-COUNT")), list(RET, makeSymbol("NEW-ELEMENT-COUNT")));

    static private final SubLSymbol $sym266$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt269 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ONE_INTEGER), list(makeSymbol("CINC"), makeSymbol("ELEMENT-COUNT"))), list(RET, makeSymbol("ELEMENT-COUNT")));

    static private final SubLSymbol $sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_INC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-INC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt273 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CDEC"), makeSymbol("ELEMENT-COUNT"))), list(RET, makeSymbol("ELEMENT-COUNT")));

    static private final SubLSymbol $sym274$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_DEC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-DEC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt277 = list(list(RET, makeSymbol("FIRST-LINK")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt280 = list(makeSymbol("NEW-FIRST-LINK"));

    static private final SubLList $list_alt281 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-FIRST-LINK"))), makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-FIRST-LINK")), list(RET, makeSymbol("NEW-FIRST-LINK")));

    static private final SubLSymbol $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt285 = list(list(RET, makeSymbol("LAST-LINK")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-LAST-LINK-METHOD");



    static private final SubLList $list_alt288 = list(makeSymbol("NEW-LAST-LINK"));

    static private final SubLList $list_alt289 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-LAST-LINK"))), makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-LAST-LINK")));

    static private final SubLSymbol $sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-LAST-LINK-METHOD");



    static private final SubLList $list_alt293 = list(list(RET, makeSymbol("ELEMENT-COUNT")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-ELEMENT-COUNT-METHOD");

    static private final SubLList $list_alt295 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR"))))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DLC-COPY-LINKS"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-ENUMERATOR")))));

    static private final SubLSymbol $sym296$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ALLOCATE-ENUMERATOR-METHOD");

    static private final SubLList $list_alt299 = list(makeSymbol("ENUMERATOR"));

    static private final SubLList $list_alt300 = list(list(makeSymbol("PWHEN"), list(makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P"), makeSymbol("ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-DEALLOCATE-ENUMERATOR-METHOD");



    static private final SubLList $list_alt303 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt304 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), makeSymbol("DATATYPE"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S(~A)>"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), makeSymbol("DATATYPE"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PRINT"), makeSymbol("OBJECT")), makeSymbol("SELF"), makeSymbol("STREAM"), makeSymbol("DEPTH"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym305$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    static private final SubLString $str_alt306$___S__A__ = makeString("#<~S(~A)>");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-PRINT-METHOD");

    private static final SubLSymbol INITIALIZE_QUA_DLL_PANEL = makeSymbol("INITIALIZE-QUA-DLL-PANEL");

    static private final SubLList $list_alt309 = list(list(makeSymbol("SET-CYBLACK-BASIC-PANEL-SUPER-PANELS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-SUB-PANELS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-CYBLACK-BASIC-PANEL-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_INITIALIZE_QUA_DLL_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-INITIALIZE-QUA-DLL-PANEL-METHOD");

    private static final SubLSymbol GET_STIMULATION_TYPE = makeSymbol("GET-STIMULATION-TYPE");

    static private final SubLList $list_alt312 = list(list(RET, makeSymbol("STIMULATION-TYPE")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-STIMULATION-TYPE-METHOD");

    private static final SubLSymbol SET_STIMULATION_TYPE = makeSymbol("SET-STIMULATION-TYPE");

    static private final SubLList $list_alt315 = list(makeSymbol("NEW-STIMULATION-TYPE"));

    static private final SubLList $list_alt316 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-STIMULATION-TYPE-P"), makeSymbol("NEW-STIMULATION-TYPE")), makeString("(SET-STIMULATION-TYPE ~S): ~S is not a member of the CYBLACK-PANEL-STIMULATION-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-STIMULATION-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("STIMULATION-TYPE"), makeSymbol("NEW-STIMULATION-TYPE")), list(RET, makeSymbol("NEW-STIMULATION-TYPE")));

    static private final SubLSymbol $sym317$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-STIMULATION-TYPE-METHOD");



    static private final SubLList $list_alt320 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("SUPER-PANELS"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_SUPER_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-SUPER-PANELS-METHOD");

    static private final SubLList $list_alt322 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("SUB-PANELS"))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-SUB-PANELS-METHOD");



    static private final SubLList $list_alt325 = list(makeSymbol("NEW-SUPER-PANEL"));

    static private final SubLList $list_alt326 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-SUPER-PANEL")), makeString("(ADD-SUPER-PANEL ~S): ~S is not a valid panel."), makeSymbol("SELF"), makeSymbol("NEW-SUPER-PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-SUPER-PANEL"), makeSymbol("SUPER-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("NEW-SUPER-PANEL"), makeSymbol("SUPER-PANELS"))), list(RET, makeSymbol("NEW-SUPER-PANEL")));

    static private final SubLSymbol $sym327$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-SUPER-PANEL-METHOD");



    static private final SubLList $list_alt330 = list(makeSymbol("OLD-SUPER-PANEL"));

    static private final SubLList $list_alt331 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("OLD-SUPER-PANEL")), makeString("(REMOVE-SUPER-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("OLD-SUPER-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("SUPER-PANELS"), list(makeSymbol("DELETE"), makeSymbol("OLD-SUPER-PANEL"), makeSymbol("SUPER-PANELS"))), list(RET, makeSymbol("OLD-SUPER-PANEL")));

    static private final SubLSymbol $sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-SUPER-PANEL-METHOD");



    static private final SubLList $list_alt335 = list(makeSymbol("NEW-SUB-PANEL"));

    static private final SubLList $list_alt336 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-SUB-PANEL")), makeString("(ADD-SUB-PANEL ~S): ~S is not a valid panel."), makeSymbol("SELF"), makeSymbol("NEW-SUB-PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-SUB-PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("NEW-SUB-PANEL"), makeSymbol("SUB-PANELS"))), list(RET, makeSymbol("NEW-SUB-PANEL")));

    static private final SubLSymbol $sym337$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-SUB-PANEL-METHOD");



    static private final SubLList $list_alt340 = list(makeSymbol("OLD-SUB-PANEL"));

    static private final SubLList $list_alt341 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("OLD-SUB-PANEL")), makeString("(REMOVE-SUB-PANEL ~S): ~S is not a valid panel."), makeSymbol("SELF"), makeSymbol("OLD-SUB-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("SUB-PANELS"), list(makeSymbol("DELETE"), makeSymbol("OLD-SUB-PANEL"), makeSymbol("SUB-PANELS"))), list(RET, makeSymbol("OLD-SUB-PANEL")));

    static private final SubLSymbol $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-SUB-PANEL-METHOD");



    static private final SubLList $list_alt345 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("PWHEN"), makeSymbol("*CYBLACK-MONITOR-POSTS*"), list(makeSymbol("FORMAT"), T, makeString("~%(ADD-POSTING ~S): Added Posting ~S."), makeSymbol("POSTING")), list(makeSymbol("FORMAT"), T, makeString("~% -> ~S~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("LISTIFY"))))), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CYBLACK-POSTING-SET-PANEL"), makeSymbol("POSTING"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("STIMULATION-TYPE"), makeKeyword("ACTIVE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CREATE-TOP-LEVEL-ENVIRONMENT"), makeKeyword("ADD-POSTING"), list(QUOTE, makeSymbol("?THE-POSTING")), list(makeSymbol("CYBLACK-APPLICATION-GET-ROOT-DATATYPE"), makeSymbol("APPLICATION")), makeSymbol("POSTING")))), list(makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT"), makeSymbol("POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("GET-SLOT"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ISOLATED-P"))), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ACTIVE-P"))))), list(makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION")))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    static private final SubLSymbol $sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    static private final SubLString $str_alt347$___ADD_POSTING__S___Added_Posting = makeString("~%(ADD-POSTING ~S): Added Posting ~S.");

    static private final SubLString $str_alt348$_______S__ = makeString("~% -> ~S~%");







    private static final SubLSymbol $ADD_POSTING = makeKeyword("ADD-POSTING");

    static private final SubLSymbol $sym353$_THE_POSTING = makeSymbol("?THE-POSTING");





    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-POSTING-METHOD");



    static private final SubLList $list_alt358 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSTING"), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-POSTING-IMMUTABLE-P"), makeSymbol("POSTING")))), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-POSTING-METHOD");



    static private final SubLList $list_alt361 = list(list(RET, makeSymbol("DATATYPE")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-DATATYPE-METHOD");



    static private final SubLList $list_alt364 = list(makeSymbol("NEW-DATATYPE"));

    static private final SubLList $list_alt365 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("NEW-DATATYPE")), makeString("(SET-DATATYPE ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), makeSymbol("NEW-DATATYPE")), list(RET, makeSymbol("NEW-DATATYPE")));

    static private final SubLSymbol $sym366$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-DATATYPE-METHOD");



    static private final SubLList $list_alt369 = list(makeSymbol("KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt370 = list(list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("PUNLESS"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), list(QUOTE, makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym371$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt375 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"))))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym376$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt379 = list(list(makeSymbol("PIF"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt382 = list(list(makeSymbol("PWHEN"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST")), makeSymbol("DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), NIL)), list(RET, NIL));

    static private final SubLSymbol $sym383$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLList $list_alt385 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION"))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-DIRECT-POSTING-METHOD");

    static private final SubLList $list_alt387 = list(list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-DIRECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt391 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), NIL), list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("TEMPLATE-CURRENT-CONTENT"), NIL)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONTENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-CURRENT-LINK"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-CURRENT-CONTENT")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-CONTENT"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK")))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-CONTENTS")))));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD");



    static private final SubLList $list_alt394 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-MARKABLE"), makeSymbol("SELF")), list(makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-LIST"), makeSymbol("SELF")), list(makeSymbol("INITIALIZE-QUA-DLL-PANEL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-DAEMONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("STIMULATION-TYPE"), makeKeyword("ACTIVE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym395$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-INITIALIZE-METHOD");



    static private final SubLList $list_alt399 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt400 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt401 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(SET-APPLICATION ~S ~S)"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-PANEL")), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(SET-APPLICATION ~S ~S) -> ~S"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-PANEL")), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLString $str_alt402$___SET_APPLICATION__S__S_ = makeString("~%(SET-APPLICATION ~S ~S)");

    static private final SubLString $str_alt403$___SET_APPLICATION__S__S______S = makeString("~%(SET-APPLICATION ~S ~S) -> ~S");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt406 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("REMOVE-DIRECT-POSTINGS"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-STARTUP")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ON-STARTUP-METHOD");



    static private final SubLList $list_alt409 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ENUMERATOR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))))), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-POSTING"), list(QUOTE, makeSymbol("ON-SHUTDOWN"))), list(makeSymbol("WHILE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-POSTING"), list(QUOTE, makeSymbol("ON-SHUTDOWN"))))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("SUB-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-SHUTDOWN")))), list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym410$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PANEL_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt414 = list(makeSymbol("NEW-POSTING-DAEMON"));

    static private final SubLList $list_alt415 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-P"), makeSymbol("NEW-POSTING-DAEMON")), makeString("(ADD-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-DAEMON")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(ADD-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS"), makeSymbol("NEW-POSTING-DAEMON")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PANEL"), makeSymbol("CYBLACK-BASIC-POSTING-DAEMON")), makeSymbol("NEW-POSTING-DAEMON"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-POSTING-DAEMON")));

    static private final SubLSymbol $sym416$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_ADD_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-ADD-POSTING-DAEMON-METHOD");



    static private final SubLList $list_alt419 = list(makeSymbol("OLD-POSTING-DAEMON"));

    static private final SubLList $list_alt420 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-DAEMON-P"), makeSymbol("OLD-POSTING-DAEMON")), makeString("(REMOVE-POSTING-DAEMON ~S): ~S is not an instance of CYBLACK-POSTING-DAEMON."), makeSymbol("SELF"), makeSymbol("OLD-POSTING-DAEMON")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(REMOVE-POSTING-DAEMON ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS"), makeSymbol("OLD-POSTING-DAEMON")), list(RET, makeSymbol("OLD-POSTING-DAEMON")));

    static private final SubLSymbol $sym421$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-POSTING-DAEMON-METHOD");



    static private final SubLList $list_alt424 = list(list(RET, makeSymbol("POSTING-DAEMONS")));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol REMOVE_ALL_DIRECT_POSTING_DAEMONS = makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS");

    static private final SubLList $list_alt427 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("POSTING-DAEMONS"), makeString("(REMOVE-ALL-DIRECT-POSTING-DAEMONS ~S): The posting daemon list that should be associated with this panel is NIL."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("POSTING-DAEMONS")), list(RET, NIL));

    static private final SubLSymbol $sym428$OUTER_CATCH_FOR_CYBLACK_BASIC_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD");



    static private final SubLList $list_alt431 = list(makeSymbol("KEY"));

    static private final SubLList $list_alt432 = list(list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PANEL_GET_METHOD = makeSymbol("CYBLACK-BASIC-PANEL-GET-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PASSIVE_PANEL = makeSymbol("CYBLACK-BASIC-PASSIVE-PANEL");

    static private final SubLList $list_alt435 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PASSIVE_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PASSIVE-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PASSIVE_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PASSIVE-PANEL-INSTANCE");

    static private final SubLList $list_alt438 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("STIMULATION-TYPE"), makeKeyword("PASSIVE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym439$OUTER_CATCH_FOR_CYBLACK_BASIC_PASSIVE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PASSIVE-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PASSIVE_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-PASSIVE-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SINGLETON_PANEL = makeSymbol("CYBLACK-SINGLETON-PANEL");

    static private final SubLList $list_alt443 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLETON_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLETON-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLETON_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLETON-PANEL-INSTANCE");

    static private final SubLList $list_alt446 = list(list(makeSymbol("CLET"), list(list(makeSymbol("POSTINGS"), list(makeSymbol("GET-DIRECT-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("POSTINGS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("POSTING")), list(makeSymbol("DEACTIVATE-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")))), list(RET, list(makeSymbol("ADD-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING")))));

    private static final SubLSymbol CYBLACK_SINGLETON_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-SINGLETON-PANEL-ADD-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_PASSIVE_SINGLETON_PANEL = makeSymbol("CYBLACK-PASSIVE-SINGLETON-PANEL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PASSIVE_SINGLETON_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PASSIVE-SINGLETON-PANEL-CLASS");

    static private final SubLSymbol $sym450$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PASSIVE_SINGLETON_PANEL_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PASSIVE-SINGLETON-PANEL-INSTANCE");

    static private final SubLSymbol $sym451$OUTER_CATCH_FOR_CYBLACK_PASSIVE_SINGLETON_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PASSIVE-SINGLETON-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_PASSIVE_SINGLETON_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-PASSIVE-SINGLETON-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_STACK_PANEL = makeSymbol("CYBLACK-STACK-PANEL");

    static private final SubLList $list_alt454 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STACK_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STACK-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STACK_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STACK-PANEL-INSTANCE");

    static private final SubLList $list_alt457 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("PWHEN"), makeSymbol("*CYBLACK-MONITOR-POSTS*"), list(makeSymbol("FORMAT"), T, makeString("~%(ADD-POSTING ~S): Added Posting ~S."), makeSymbol("POSTING")), list(makeSymbol("FORMAT"), T, makeString("~% -> ~S~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("LISTIFY"))))), list(makeSymbol("PUSH"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CYBLACK-POSTING-SET-PANEL"), makeSymbol("POSTING"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("STIMULATION-TYPE"), makeKeyword("ACTIVE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CREATE-TOP-LEVEL-ENVIRONMENT"), makeKeyword("ADD-POSTING"), list(QUOTE, makeSymbol("?THE-POSTING")), list(makeSymbol("CYBLACK-APPLICATION-GET-ROOT-DATATYPE"), makeSymbol("APPLICATION")), makeSymbol("POSTING")))), list(makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION")))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    static private final SubLSymbol $sym458$OUTER_CATCH_FOR_CYBLACK_STACK_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STACK-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_STACK_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-STACK-PANEL-ADD-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR");

    static private final SubLList $list_alt462 = list(new SubLObject[]{ list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PREDICATOR-IS-METHOD"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PREDICATOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ARGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREDICATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PREDICATOR"), list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("IS-METHOD"), T))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ARGS"), list(makeSymbol("NEW-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-P"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")) });









    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-CLASS");



    static private final SubLSymbol $sym470$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-INSTANCE");

    static private final SubLList $list_alt471 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PREDICATOR-IS-METHOD"), T), list(makeSymbol("CSETQ"), makeSymbol("PREDICATOR"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ARGS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym472$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-INITIALIZE-METHOD");

    static private final SubLList $list_alt474 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), makeSymbol("PREDICATOR-IS-METHOD"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<PREDICATOR: (:call ?POSTING ~S . ~S)>"), makeSymbol("PREDICATOR"), makeSymbol("ARGS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<PREDICATOR: (~S ?POSTING . ~S)>"), makeSymbol("PREDICATOR"), makeSymbol("ARGS"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym475$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    static private final SubLString $str_alt476$__PREDICATOR____call__POSTING__S_ = makeString("#<PREDICATOR: (:call ?POSTING ~S . ~S)>");

    static private final SubLString $str_alt477$__PREDICATOR____S__POSTING____S__ = makeString("#<PREDICATOR: (~S ?POSTING . ~S)>");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_PRINT_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-PRINT-METHOD");



    static private final SubLList $list_alt480 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE")));

    static private final SubLList $list_alt481 = list(list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-STATE")), makeString("(SET-INITIAL-STATE ~S): ~S is not a valid initial state.  A list was expected."), makeSymbol("SELF"), makeSymbol("NEW-STATE")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-STATE"))), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym482$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-INITIAL-STATE-METHOD");

    private static final SubLSymbol GET_PREDICATOR = makeSymbol("GET-PREDICATOR");

    static private final SubLList $list_alt485 = list(list(RET, makeSymbol("PREDICATOR")));

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_PREDICATOR_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-PREDICATOR-METHOD");

    private static final SubLSymbol SET_PREDICATOR = makeSymbol("SET-PREDICATOR");

    static private final SubLList $list_alt488 = list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("IS-METHOD"), T));

    static private final SubLList $list_alt489 = list(list(makeSymbol("CSETQ"), makeSymbol("PREDICATOR"), makeSymbol("NEW-PREDICATOR")), list(makeSymbol("CSETQ"), makeSymbol("PREDICATOR-IS-METHOD"), makeSymbol("IS-METHOD")), list(RET, makeSymbol("NEW-PREDICATOR")));

    static private final SubLSymbol $sym490$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_PREDICATOR_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-PREDICATOR-METHOD");



    static private final SubLList $list_alt493 = list(list(RET, makeSymbol("ARGS")));

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_ARGS_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-ARGS-METHOD");



    static private final SubLList $list_alt496 = list(makeSymbol("NEW-ARGS"));

    static private final SubLList $list_alt497 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-ARGS")), makeString("(SET-ARGS ~S): Argument lists cyblack-must be lists.  ~S is not a list."), makeSymbol("SELF"), makeSymbol("NEW-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("ARGS"), makeSymbol("NEW-ARGS")), list(RET, makeSymbol("NEW-ARGS")));

    static private final SubLSymbol $sym498$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_SET_ARGS_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-SET-ARGS-METHOD");

    private static final SubLSymbol EXTRACT_P = makeSymbol("EXTRACT-P");

    static private final SubLList $list_alt501 = list(list(makeSymbol("PIF"), makeSymbol("PREDICATOR-IS-METHOD"), list(RET, list(makeSymbol("APPLY-INSTANCE-METHOD"), makeSymbol("POSTING"), makeSymbol("PREDICATOR"), makeSymbol("ARGS"))), list(RET, list(makeSymbol("APPLY"), makeSymbol("PREDICATOR"), makeSymbol("POSTING"), makeSymbol("ARGS")))));

    static private final SubLSymbol $sym502$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_EXTRACT_P_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-EXTRACT-P-METHOD");

    static private final SubLList $list_alt504 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt505 = list(list(makeSymbol("PWHEN"), list(makeSymbol("EXTRACT-P"), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("CPUSH"), makeSymbol("CYBLACK-POSTING"), makeSymbol("CONTENTS"))), list(RET, NIL));

    static private final SubLSymbol $sym506$OUTER_CATCH_FOR_CYBLACK_VIRTUAL_PANEL_EXTRACTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-VIRTUAL-PANEL-EXTRACTOR-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_VISIT_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-VISIT-METHOD");



    static private final SubLList $list_alt509 = list(list(RET, list(makeSymbol("REVERSE"), makeSymbol("CONTENTS"))));

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_EXTRACTOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR-GET-FINAL-STATE-METHOD");

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL = makeSymbol("CYBLACK-VIRTUAL-PANEL");

    static private final SubLList $list_alt512 = list(makeSymbol("CYBLACK-PANEL"));

    static private final SubLList $list_alt513 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-PANEL")));

    static private final SubLList $list_alt514 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ARGS"), list(makeSymbol("NEW-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BASE-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL"), list(makeSymbol("NEW-BASE-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSET-PREDICATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR"), list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-IS-METHOD"), T)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREDICATOR-IS-METHOD"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol CYBLACK_VIRTUAL_PANEL_TEMPLATE = makeSymbol("CYBLACK-VIRTUAL-PANEL-TEMPLATE");

    static private final SubLList $list_alt516 = list(makeSymbol("CYBLACK-VIRTUAL-PANEL"));

    static private final SubLList $list_alt517 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-VIRTUAL-PANEL")));

    static private final SubLList $list_alt518 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVE-CONTENTS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-INTERNAL"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR-INTERNAL"), list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-IS-METHOD"), T)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL"), list(makeSymbol("NEW-BASE-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR"), list(makeSymbol("NEW-PREDICATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DERIVE-CONTENTS-INTERNAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE = makeSymbol("INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE");

    static private final SubLList $list_alt520 = list(list(makeSymbol("SET-BASE-PANEL-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-SUBSET-PREDICATOR-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol SET_BASE_PANEL = makeSymbol("SET-BASE-PANEL");

    static private final SubLList $list_alt522 = list(makeSymbol("NEW-BASE-PANEL"));

    static private final SubLList $list_alt523 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-BASE-PANEL")), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-BASE-PANEL"))), makeString("(SET-BASE-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-BASE-PANEL")), list(makeSymbol("SET-BASE-PANEL-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-BASE-PANEL")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("NEW-BASE-PANEL"), list(makeSymbol("GET-SUBSET-PREDICATOR"), makeSymbol("SELF"))), list(makeSymbol("DERIVE-CONTENTS-INTERNAL"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-BASE-PANEL")));

    private static final SubLSymbol SET_SUBSET_PREDICATOR = makeSymbol("SET-SUBSET-PREDICATOR");

    static private final SubLList $list_alt525 = list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-IS-METHOD"), T));

    static private final SubLList $list_alt526 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PREDICATOR")), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-PREDICATOR"))), makeString("(SET-SUBSET-PREDICATOR ~S): ~S is not a symbol.  Predicators cyblack-must be symbols."), makeSymbol("SELF"), makeSymbol("NEW-PREDICATOR")), list(makeSymbol("SET-SUBSET-PREDICATOR"), makeSymbol("SELF"), makeSymbol("NEW-PREDICATOR"), makeSymbol("NEW-IS-METHOD")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("NEW-PREDICATOR"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF"))), list(makeSymbol("DERIVE-CONTENTS-INTERNAL"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-PREDICATOR")));

    private static final SubLSymbol DERIVE_CONTENTS_INTERNAL = makeSymbol("DERIVE-CONTENTS-INTERNAL");

    static private final SubLList $list_alt528 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR")))), list(makeSymbol("TEMPLATE-BASE-PANEL"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR")), makeSymbol("TEMPLATE-VISITOR"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ARGS"), makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR")), makeSymbol("TEMPLATE-VISITOR"), list(makeSymbol("GET-ARGS"), makeSymbol("SELF"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PREDICATOR"), makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR")), makeSymbol("TEMPLATE-VISITOR"), list(makeSymbol("GET-SUBSET-PREDICATOR"), makeSymbol("SELF")), list(makeSymbol("PREDICATOR-IS-METHOD"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("TEMPLATE-BASE-PANEL"), makeSymbol("TEMPLATE-VISITOR")), list(makeSymbol("SET-CONTENTS-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FINAL-STATE"), makeSymbol("CYBLACK-VIRTUAL-PANEL-EXTRACTOR")), makeSymbol("TEMPLATE-VISITOR")))), list(RET, NIL));

    static private final SubLList $list_alt529 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BASE-PANEL"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BASE-PANEL"), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-SUPER-PANELS"), makeSymbol("TEMPLATE-BASE-PANEL")))), list(RET, NIL)));

    static private final SubLList $list_alt530 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BASE-PANEL"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BASE-PANEL"), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-SUB-PANELS"), makeSymbol("TEMPLATE-BASE-PANEL")))), list(RET, NIL)));

    static private final SubLList $list_alt531 = list(list(RET, makeSymbol("NEW-SUPER-PANEL")));

    static private final SubLList $list_alt532 = list(list(RET, makeSymbol("OLD-SUPER-PANEL")));

    static private final SubLList $list_alt533 = list(list(RET, makeSymbol("NEW-SUB-PANEL")));

    static private final SubLList $list_alt534 = list(list(RET, makeSymbol("OLD-SUB-PANEL")));

    static private final SubLList $list_alt535 = list(list(makeSymbol("IGNORE"), makeSymbol("ENVIRONMENT")), list(RET, NIL));

    static private final SubLList $list_alt536 = list(list(makeSymbol("IGNORE"), makeSymbol("ENVIRONMENTS")), list(RET, NIL));

    static private final SubLList $list_alt537 = list(list(RET, makeSymbol("POSTING")));

    static private final SubLList $list_alt538 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BASE-PANEL"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BASE-PANEL"), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-DATATYPE"), makeSymbol("TEMPLATE-BASE-PANEL")))), list(RET, NIL)));

    static private final SubLList $list_alt539 = list(list(RET, makeSymbol("NEW-DATATYPE")));

    static private final SubLList $list_alt540 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLList $list_alt541 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCES")));

    static private final SubLList $list_alt542 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BASE-PANEL"), list(makeSymbol("GET-BASE-PANEL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BASE-PANEL"), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-BASE-PANEL")))), list(RET, NIL)));

    static private final SubLList $list_alt543 = list(list(RET, makeSymbol("POSTINGS")));

    static private final SubLList $list_alt544 = list(list(RET, list(makeSymbol("GET-CONTENTS-INTERNAL"), makeSymbol("SELF"))));

    static private final SubLList $list_alt545 = list(list(RET, list(makeSymbol("GET-ACTIVE-CONTENTS-INTERNAL"), makeSymbol("SELF"))));

    static private final SubLList $list_alt546 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-POSTING")), list(RET, makeSymbol("POSTING-VISITOR"))))), list(RET, NIL)));

    static private final SubLList $list_alt547 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("TEMPLATE-POSTING")), list(RET, makeSymbol("POSTING-VISITOR"))))), list(RET, NIL)));

    static private final SubLList $list_alt548 = list(list(makeSymbol("IGNORE"), makeSymbol("KS-VISITOR")), list(RET, NIL));

    static private final SubLList $list_alt549 = list(list(RET, makeSymbol("NEW-POSTING-DAEMON")));

    static private final SubLList $list_alt550 = list(list(RET, makeSymbol("OLD-POSTING-DAEMON")));

    static private final SubLList $list_alt551 = list(list(makeSymbol("IGNORE"), makeSymbol("DAEMON-VISITOR")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL");

    static private final SubLList $list_alt553 = list(makeSymbol("CYBLACK-VIRTUAL-PANEL-TEMPLATE"));

    public static final SubLObject $list_alt554 = _constant_554_initializer();





    static private final SubLSymbol $sym557$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_METH = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD");

    static private final SubLSymbol $sym558$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEMO = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    static private final SubLSymbol $sym559$CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_MET = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-POSTING-DAEMON-METHOD");

    static private final SubLSymbol $sym563$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_ME = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym564$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD");

    static private final SubLSymbol $sym566$CYBLACK_BASIC_VIRTUAL_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METH = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym579$CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METHO = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym582$CYBLACK_BASIC_VIRTUAL_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METHO = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym590$CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METHO = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym591$CYBLACK_BASIC_VIRTUAL_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_ME = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-SUB-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-SUB-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_REMOVE_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-REMOVE-SUPER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ADD_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ADD-SUPER-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ALL_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ALL-SUB-PANELS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUB-PANELS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUPER_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUPER-PANELS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_DERIVE_CONTENTS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-DERIVE-CONTENTS-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_SUBSET_PREDICATOR_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-SUBSET-PREDICATOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_BASE_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-BASE-PANEL-METHOD");

    static private final SubLSymbol $sym602$CYBLACK_BASIC_VIRTUAL_PANEL_INITIALIZE_QUA_VIRTUAL_PANEL_TEMPLATE = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_VIRTUAL_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-VIRTUAL-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_VIRTUAL_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-VIRTUAL-PANEL-INSTANCE");

    static private final SubLList $list_alt605 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("IS-METHOD"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym606$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ARGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ARGS-METHOD");

    static private final SubLList $list_alt609 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("ARGS")), makeString("(SET-ARGS ~S): An argument list cyblack-must be a list.  ~S is not a list."), makeSymbol("SELF"), makeSymbol("NEW-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("ARGS"), makeSymbol("NEW-ARGS")), list(RET, makeSymbol("NEW-ARGS")));

    static private final SubLSymbol $sym610$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_ARGS_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-ARGS-METHOD");

    private static final SubLSymbol GET_CONTENTS_INTERNAL = makeSymbol("GET-CONTENTS-INTERNAL");

    static private final SubLList $list_alt613 = list(list(RET, makeSymbol("CONTENTS")));

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_CONTENTS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-CONTENTS-INTERNAL-METHOD");

    private static final SubLSymbol GET_ACTIVE_CONTENTS_INTERNAL = makeSymbol("GET-ACTIVE-CONTENTS-INTERNAL");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_ACTIVE_CONTENTS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-ACTIVE-CONTENTS-INTERNAL-METHOD");

    private static final SubLSymbol SET_CONTENTS_INTERNAL = makeSymbol("SET-CONTENTS-INTERNAL");

    static private final SubLList $list_alt618 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS-INTERNAL ~S): The contents of a virtual panel cyblack-must be a list.  ~S is not a list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), makeSymbol("NEW-CONTENTS")), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLSymbol $sym619$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_CONTENTS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-CONTENTS-INTERNAL-METHOD");



    static private final SubLList $list_alt622 = list(list(RET, makeSymbol("BASE-PANEL")));

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_BASE_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-BASE-PANEL-METHOD");

    private static final SubLSymbol SET_BASE_PANEL_INTERNAL = makeSymbol("SET-BASE-PANEL-INTERNAL");

    static private final SubLList $list_alt625 = list(makeSymbol("NEW-PANEL"));

    static private final SubLList $list_alt626 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PANEL")), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-PANEL"))), makeString("(SET-BASE-PANEL-INTERNAL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("BASE-PANEL"), makeSymbol("NEW-PANEL")), list(makeSymbol("PWHEN"), makeSymbol("NEW-PANEL"), list(makeSymbol("SET-APPLICATION"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-APPLICATION"), makeSymbol("CYBLACK-OBJECT")), makeSymbol("NEW-PANEL")))), list(RET, makeSymbol("NEW-PANEL")));

    static private final SubLSymbol $sym627$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_BASE_PANEL_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-BASE-PANEL-INTERNAL-METHOD");

    private static final SubLSymbol GET_SUBSET_PREDICATOR = makeSymbol("GET-SUBSET-PREDICATOR");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_SUBSET_PREDICATOR_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-SUBSET-PREDICATOR-METHOD");

    private static final SubLSymbol SET_SUBSET_PREDICATOR_INTERNAL = makeSymbol("SET-SUBSET-PREDICATOR-INTERNAL");

    static private final SubLList $list_alt632 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-PREDICATOR")), makeString("(SET-SUBSET-PREDICATOR-INTERNAL ~S): Predicators must be symbols.  ~S is not a symbol."), makeSymbol("SELF"), makeSymbol("NEW-PREDICATOR")), list(makeSymbol("CSETQ"), makeSymbol("PREDICATOR"), makeSymbol("NEW-PREDICATOR")), list(makeSymbol("CSETQ"), makeSymbol("IS-METHOD"), list(makeSymbol("FIF"), makeSymbol("NEW-IS-METHOD"), T, NIL)), list(RET, makeSymbol("NEW-PREDICATOR")));

    static private final SubLSymbol $sym633$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_SUBSET_PREDICATOR_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-SUBSET-PREDICATOR-INTERNAL-METHOD");

    static private final SubLList $list_alt635 = list(list(RET, makeSymbol("IS-METHOD")));

    static private final SubLSymbol $sym636$OUTER_CATCH_FOR_CYBLACK_BASIC_VIRTUAL_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-VIRTUAL-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_PREDICATOR_IS_METHOD_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-PREDICATOR-IS-METHOD-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_GET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-GET-STIMULATION-TYPE-METHOD");

    static private final SubLList $list_alt640 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STIMULATION-TYPE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_SET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-SET-STIMULATION-TYPE-METHOD");

    static private final SubLList $list_alt642 = list(list(makeSymbol("IGNORE"), makeSymbol("POSTING")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_DEACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-DEACTIVATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_VIRTUAL_PANEL_ACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-VIRTUAL-PANEL-ACTIVATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_SEQUENCE_PANEL = makeSymbol("CYBLACK-SEQUENCE-PANEL");

    static private final SubLList $list_alt646 = list(makeSymbol("CYBLACK-PANEL"), makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE"));

    static private final SubLList $list_alt647 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-PANEL"), makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE")));

    static private final SubLList $list_alt648 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): Sequence panels can only add ordinal ~\n    postings.  ~S is not an instance of CYBLACK-ORDINAL-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("TEMPLATE-ORD")), list(makeSymbol(">="), makeSymbol("TEMPLATE-ORD"), ZERO_INTEGER)), makeString("(ADD-DIRECT-POSTING ~S): Posting ~S contains invalid ordinal value ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-OLD-POSTING"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-OLD-POSTING"), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TEMPLATE-OLD-POSTING")))), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING"))));

    static private final SubLList $list_alt649 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(REMOVE-DIRECT-POSTING ~S): Sequence panels can only add ordinal ~\n    postings.  ~S is not an instance of CYBLACK-ORDINAL-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("TEMPLATE-ORD")), list(makeSymbol(">="), makeSymbol("TEMPLATE-ORD"), ZERO_INTEGER)), makeString("(REMOVE-DIRECT-POSTING ~S): Posting ~S contains invalid ordinal value ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-OLD-POSTING"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-OLD-POSTING"), list(makeSymbol("CYBLACK-MUST"), list(EQ, makeSymbol("POSTING"), makeSymbol("TEMPLATE-OLD-POSTING")), makeString("(REMOVE-DIRECT-POSTING ~S): Postings ~S and ~S are not the same posting."), makeSymbol("SELF"), makeSymbol("POSTING"), makeSymbol("OLD-POSTING")), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TEMPLATE-OLD-POSTING")))), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORD"), NIL), list(RET, makeSymbol("POSTING"))));

    static private final SubLList $list_alt650 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-FILTERED-CONTENTS"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-POSTING"), makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("TEMPLATE-FILTERED-CONTENTS")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-POSTING")), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-POSTING")), NIL)), list(RET, makeSymbol("TEMPLATE-FILTERED-CONTENTS"))));



    static private final SubLList $list_alt652 = list(makeSymbol("CYBLACK-SEQUENCE-PANEL"), makeSymbol("CYBLACK-MARKABLE-TEMPLATE"));

    public static final SubLObject $list_alt653 = _constant_653_initializer();













    static private final SubLSymbol $sym660$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ACTIVATE-POSTING-METHOD");

    static private final SubLSymbol $sym662$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_DEACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-DEACTIVATE-POSTING-METHOD");

    static private final SubLSymbol $sym664$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_POSTING_DAEMONS_MET = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-POSTING-DAEMONS-METHOD");

    static private final SubLSymbol $sym665$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_POSTING_DAEM = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    static private final SubLSymbol $sym666$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_KNOWLEDGE_SOURCES_M = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym667$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SO = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD");

    static private final SubLSymbol $sym669$CYBLACK_BASIC_SEQUENCE_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_MET = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-ACTIVE-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-POSTINGS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym675$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCES_METH = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym676$CYBLACK_BASIC_SEQUENCE_PANEL_ON_REMOVE_LAST_KNOWLEDGE_SOURCE_METH = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ON-REMOVE-LAST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ON_ADD_FIRST_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ON-ADD-FIRST-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-POSTING-DAEMONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym680$CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_ALL_KNOWLEDGE_SOURCES_METH = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym681$CYBLACK_BASIC_SEQUENCE_PANEL_STIMULATE_DIRECT_KNOWLEDGE_SOURCES_M = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATE-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_ALL_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-ALL-SUB-PANELS-METHOD");

    private static final SubLSymbol INDEX_OF_PREVIOUS_NON_NIL_ELEMENT = makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT");

    static private final SubLList $list_alt684 = list(makeSymbol("START-INDEX"));

    static private final SubLList $list_alt685 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol(">="), makeSymbol("TEMPLATE-INDEX"), ZERO_INTEGER), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CDEC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    static private final SubLSymbol $sym686$CYBLACK_BASIC_SEQUENCE_PANEL_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ME = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD");



    static private final SubLList $list_alt688 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("START-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("START-INDEX"), list(makeSymbol("MIN"), list(makeSymbol("MAX"), makeSymbol("START-INDEX"), ZERO_INTEGER), list(makeSymbol("-"), makeSymbol("TEMPLATE-LENGTH"), ONE_INTEGER))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("START-INDEX"))), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-INTERNAL-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, makeSymbol("TEMPLATE-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-INDEX"))), list(RET, NIL)))));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_INDEX_OF_NEXT_NON_NIL_ELEMENT_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD");

    private static final SubLSymbol ALL_NULL_P = makeSymbol("ALL-NULL-P");

    static private final SubLList $list_alt691 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("PWHEN"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX")), list(RET, NIL))), list(RET, T)));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ALL_NULL_P_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ALL-NULL-P-METHOD");

    static private final SubLList $list_alt693 = list(makeSymbol("OLD-ENUMERATOR"));

    static private final SubLList $list_alt694 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P"), makeSymbol("OLD-ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("OLD-ENUMERATOR")), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("OLD-ENUMERATOR"), NIL), list(RET, NIL));

    static private final SubLString $str_alt695$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR.");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-DEALLOCATE-ENUMERATOR-METHOD");

    static private final SubLList $list_alt697 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR"))))), list(makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), makeSymbol("SELF")), list(RET, makeSymbol("TEMPLATE-ENUMERATOR"))));

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ALLOCATE-ENUMERATOR-METHOD");

    static private final SubLList $list_alt700 = list(list(RET, list(makeSymbol("SET-NTH"), makeSymbol("SELF"), list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER), makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-METHOD");



    static private final SubLList $list_alt703 = list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL));

    static private final SubLList $list_alt704 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("START-INDEX"), ZERO_INTEGER), makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("START-INDEX")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("END-INDEX"), list(makeSymbol("CSETQ"), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH"))), list(makeSymbol("MUST"), list(makeSymbol("<="), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence."), makeSymbol("END-INDEX"), makeSymbol("TEMPLATE-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CLASS"), list(makeSymbol("GET-SEQUENCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-INSTANCE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("TEMPLATE-CLASS"))), list(makeSymbol("TEMPLATE-ORIGINAL-INDEX"), makeSymbol("START-INDEX")), list(makeSymbol("TEMPLATE-INDEX-COUNT"), list(makeSymbol("-"), makeSymbol("END-INDEX"), makeSymbol("START-INDEX")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-INDEX-COUNT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-INSTANCE"), list(QUOTE, makeSymbol("SET-NTH")), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), list(RET, makeSymbol("TEMPLATE-INSTANCE")))));

    static private final SubLString $str_alt705$_GET_SUBSEQUENCE__S___Index__S_is = makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    static private final SubLString $str_alt706$_GET_SUBSEQUENCE__S___End_index__ = makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence.");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUBSEQUENCE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUBSEQUENCE-METHOD");

    static private final SubLList $list_alt708 = list(makeSymbol("N"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt709 = list(list(makeSymbol("MUST"), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LARGEST-INDEX"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-STORAGE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol(">="), makeSymbol("N"), makeSymbol("TEMPLATE-STORAGE-SIZE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), list(makeSymbol("*"), list(makeSymbol("GET-GROWTH-FACTOR"), makeSymbol("SELF")), makeSymbol("N"))), list(makeSymbol("TEMPLATE-OLD-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-STORAGE"), list(makeSymbol("MAKE-VECTOR"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), makeSymbol("TEMPLATE-DEFAULT-VALUE")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("+"), makeSymbol("TEMPLATE-LARGEST-INDEX"), ONE_INTEGER)), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("TEMPLATE-INDEX"), list(makeSymbol("AREF"), makeSymbol("TEMPLATE-OLD-STORAGE"), makeSymbol("TEMPLATE-INDEX")))), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-INTERNAL-STORAGE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE")), list(makeSymbol("SET-STORAGE-SIZE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-STORAGE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-NEW-STORAGE"), makeSymbol("N"), makeSymbol("NEW-VALUE"))), list(makeSymbol("PROGN"), list(makeSymbol("RECORD-INDEX"), makeSymbol("SELF"), makeSymbol("N")), list(makeSymbol("SET-AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"), makeSymbol("NEW-VALUE")))), list(RET, makeSymbol("NEW-VALUE"))));

    static private final SubLString $str_alt710$_SET_NTH__S___Index__S_is_less_th = makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-NTH-METHOD");



    static private final SubLList $list_alt713 = list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL));

    static private final SubLList $list_alt714 = list(list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("<"), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol(">"), makeSymbol("N"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")))), list(RET, makeSymbol("OUT-OF-RANGE-VALUE"))), list(RET, list(makeSymbol("AREF"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF")), makeSymbol("N"))));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-NTH-METHOD");



    static private final SubLList $list_alt717 = list(list(RET, list(makeSymbol("+"), list(makeSymbol("GET-LARGEST-INDEX"), makeSymbol("SELF")), ONE_INTEGER)));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_LENGTH_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-LENGTH-METHOD");

    static private final SubLList $list_alt719 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-STORAGE"), list(makeSymbol("GET-INTERNAL-STORAGE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-SIZE"), list(makeSymbol("GET-STORAGE-SIZE"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DEFAULT-VALUE"), list(makeSymbol("GET-DEFAULT-VALUE"), makeSymbol("SELF")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-SIZE")), list(makeSymbol("SET-AREF"), makeSymbol("TEMPLATE-STORAGE"), makeSymbol("TEMPLATE-INDEX"), makeSymbol("TEMPLATE-DEFAULT-VALUE"))), list(makeSymbol("SET-LARGEST-INDEX"), makeSymbol("SELF"), MINUS_ONE_INTEGER), list(RET, makeSymbol("TEMPLATE-DEFAULT-VALUE"))));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-CLEAR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_HAS_MARK_P_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-HAS-MARK-P-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_MARK_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-MARK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_MARK_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-MARK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_CLEAR_ALL_MARKS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-CLEAR-ALL-MARKS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-PANEL-INSTANCE");

    static private final SubLList $list_alt727 = list(list(makeSymbol("SET-CYBLACK-BASIC-PANEL-MARKS"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_INITIALIZE_QUA_MARKABLE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-INITIALIZE-QUA-MARKABLE-METHOD");

    static private final SubLList $list_alt729 = list(list(RET, makeSymbol("MARKS")));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-MARKS-INTERNAL-METHOD");

    static private final SubLList $list_alt731 = list(list(makeSymbol("CSETQ"), makeSymbol("MARKS"), makeSymbol("NEW-MARKS")), list(RET, makeSymbol("NEW-MARKS")));

    static private final SubLSymbol $sym732$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-MARKS-INTERNAL-METHOD");

    static private final SubLList $list_alt734 = list(list(makeSymbol("PUNLESS"), makeSymbol("INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("ELEMENT"), NIL), list(makeSymbol("CONTENTS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("I"))), list(makeSymbol("PWHEN"), makeSymbol("ELEMENT"), list(makeSymbol("CPUSH"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("CONTENTS")))));

    static private final SubLSymbol $sym735$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt738 = list(list(RET, makeSymbol("INTERNAL-STORAGE")));

    static private final SubLSymbol $sym739$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_INTERNAL_STORAGE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-INTERNAL-STORAGE-METHOD");



    static private final SubLList $list_alt742 = list(makeSymbol("NEW-INTERNAL-STORAGE"));

    static private final SubLList $list_alt743 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("VECTORP"), makeSymbol("NEW-INTERNAL-STORAGE")), makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector."), makeSymbol("SELF"), makeSymbol("NEW-INTERNAL-STORAGE")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("NEW-INTERNAL-STORAGE")), list(RET, makeSymbol("NEW-INTERNAL-STORAGE")));

    static private final SubLSymbol $sym744$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_INTERNAL_STORAGE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-INTERNAL-STORAGE-METHOD");



    static private final SubLList $list_alt747 = list(list(RET, makeSymbol("STORAGE-SIZE")));

    static private final SubLSymbol $sym748$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_STORAGE_SIZE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-STORAGE-SIZE-METHOD");

    private static final SubLSymbol SET_STORAGE_SIZE = makeSymbol("SET-STORAGE-SIZE");

    static private final SubLList $list_alt751 = list(makeSymbol("NEW-STORAGE-SIZE"));

    static private final SubLList $list_alt752 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol(">="), makeSymbol("NEW-STORAGE-SIZE"), ZERO_INTEGER)), makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-STORAGE-SIZE")), list(makeSymbol("CSETQ"), makeSymbol("STORAGE-SIZE"), makeSymbol("NEW-STORAGE-SIZE")), list(RET, makeSymbol("NEW-STORAGE-SIZE")));

    static private final SubLSymbol $sym753$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_STORAGE_SIZE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-STORAGE-SIZE-METHOD");



    static private final SubLList $list_alt756 = list(list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLSymbol $sym757$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_LARGEST_INDEX_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-LARGEST-INDEX-METHOD");

    private static final SubLSymbol SET_LARGEST_INDEX = makeSymbol("SET-LARGEST-INDEX");

    static private final SubLList $list_alt760 = list(makeSymbol("NEW-LARGEST-INDEX"));

    static private final SubLList $list_alt761 = list(list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), makeSymbol("NEW-LARGEST-INDEX")), list(RET, makeSymbol("NEW-LARGEST-INDEX")));

    static private final SubLSymbol $sym762$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_LARGEST_INDEX_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-LARGEST-INDEX-METHOD");



    static private final SubLList $list_alt765 = list(makeSymbol("CURRENT-INDEX"));

    static private final SubLList $list_alt766 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("CURRENT-INDEX")), list(makeSymbol(">="), makeSymbol("CURRENT-INDEX"), ZERO_INTEGER)), makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("CURRENT-INDEX")), list(makeSymbol("CSETQ"), makeSymbol("LARGEST-INDEX"), list(makeSymbol("MAX"), makeSymbol("LARGEST-INDEX"), makeSymbol("CURRENT-INDEX"))), list(RET, makeSymbol("LARGEST-INDEX")));

    static private final SubLSymbol $sym767$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_RECORD_INDEX_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-RECORD-INDEX-METHOD");



    static private final SubLList $list_alt770 = list(list(RET, makeSymbol("DEFAULT-VALUE")));

    static private final SubLSymbol $sym771$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_DEFAULT_VALUE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-DEFAULT-VALUE-METHOD");

    private static final SubLSymbol SET_DEFAULT_VALUE = makeSymbol("SET-DEFAULT-VALUE");

    static private final SubLList $list_alt774 = list(makeSymbol("NEW-DEFAULT-VALUE"));

    static private final SubLList $list_alt775 = list(list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-VALUE"), makeSymbol("NEW-DEFAULT-VALUE")), list(RET, makeSymbol("NEW-DEFAULT-VALUE")));

    static private final SubLSymbol $sym776$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_DEFAULT_VALUE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-DEFAULT-VALUE-METHOD");



    static private final SubLList $list_alt779 = list(list(RET, makeSymbol("GROWTH-FACTOR")));

    static private final SubLSymbol $sym780$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_GROWTH_FACTOR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-GROWTH-FACTOR-METHOD");

    private static final SubLSymbol SET_GROWTH_FACTOR = makeSymbol("SET-GROWTH-FACTOR");

    static private final SubLList $list_alt783 = list(makeSymbol("NEW-GROWTH-FACTOR"));

    static private final SubLList $list_alt784 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol(">"), makeSymbol("NEW-GROWTH-FACTOR"), makeDouble(1.0))), makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0."), makeSymbol("SELF"), makeSymbol("NEW-GROWTH-FACTOR")), list(makeSymbol("CSETQ"), makeSymbol("GROWTH-FACTOR"), makeSymbol("NEW-GROWTH-FACTOR")), list(RET, makeSymbol("NEW-GROWTH-FACTOR")));

    static private final SubLSymbol $sym785$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_GROWTH_FACTOR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-GROWTH-FACTOR-METHOD");



    static private final SubLList $list_alt788 = list(list(RET, makeSymbol("SEQUENCE-CLASS")));

    static private final SubLSymbol $sym789$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_SEQUENCE_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-SEQUENCE-CLASS-METHOD");

    private static final SubLSymbol SET_SEQUENCE_CLASS = makeSymbol("SET-SEQUENCE-CLASS");

    static private final SubLList $list_alt792 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list_alt793 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL"))))), makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of CYBLACK-BASIC-SEQUENCE-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SEQUENCE-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym794$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_SEQUENCE_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-SEQUENCE-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-STIMULATION-TYPE-METHOD");

    static private final SubLSymbol $sym797$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_STIMULATION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-STIMULATION-TYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUPER_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUPER-PANELS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_SUB_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-SUB-PANELS-METHOD");

    static private final SubLSymbol $sym801$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-SUPER-PANEL-METHOD");

    static private final SubLList $list_alt803 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("OLD-SUPER-PANEL")), makeString("(REMOVE-SUPER-PANEL ~S): ~S is not a valid panel."), makeSymbol("SELF"), makeSymbol("OLD-SUPER-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("SUPER-PANELS"), list(makeSymbol("DELETE"), makeSymbol("OLD-SUPER-PANEL"), makeSymbol("SUPER-PANELS"))), list(RET, makeSymbol("OLD-SUPER-PANEL")));

    static private final SubLSymbol $sym804$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_SUPER_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-SUPER-PANEL-METHOD");

    static private final SubLSymbol $sym806$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-SUB-PANEL-METHOD");

    static private final SubLSymbol $sym808$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_SUB_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-SUB-PANEL-METHOD");

    static private final SubLList $list_alt810 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-ORDINAL-POSTING. ~\n    Only ordinal postings may be added to sequence panels."), makeSymbol("SELF"), makeSymbol("POSTING")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("ORD"), makeString("(ADD-POSTING ~S): ~S is not a valid ordinal posting.  It\'s ord value is ~S. ~\n      An integer was expected."), makeSymbol("SELF"), makeSymbol("ORD")), list(makeSymbol("PWHEN"), makeSymbol("*CYBLACK-MONITOR-POSTS*"), list(makeSymbol("FORMAT"), T, makeString("~%(ADD-POSTING ~S): Added Posting ~S."), makeSymbol("POSTING")), list(makeSymbol("FORMAT"), T, makeString("~% -> ~S~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("LISTIFY"))))), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("ORD"), makeSymbol("POSTING")), list(makeSymbol("CYBLACK-POSTING-SET-PANEL"), makeSymbol("POSTING"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("STIMULATION-TYPE"), makeKeyword("ACTIVE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CREATE-TOP-LEVEL-ENVIRONMENT"), makeKeyword("ADD-POSTING"), list(QUOTE, makeSymbol("?THE-POSTING")), list(makeSymbol("CYBLACK-APPLICATION-GET-ROOT-DATATYPE"), makeSymbol("APPLICATION")), makeSymbol("POSTING")))), list(makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT"), makeSymbol("POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("GET-SLOT"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ISOLATED-P"))), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ACTIVE-P"))))), list(makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION")))), list(RET, makeSymbol("POSTING")) }));

    static private final SubLSymbol $sym811$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-POSTING-METHOD");

    static private final SubLList $list_alt813 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(REMOVE-POSTING ~S): ~S is not an instance of CYBLACK-ORDINAL-POSTING. ~\n    Only ordinal postings may be removed from sequence panels."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSTING"), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-POSTING-IMMUTABLE-P"), makeSymbol("POSTING")))), list(makeSymbol("CLET"), list(list(makeSymbol("ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("ORD"), makeString("(REMOVE-POSTING ~S): ~S is not a valid ordinal posting.  It\'s ord value is ~S. ~\n      An integer was expected."), makeSymbol("SELF"), makeSymbol("ORD")), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("ORD"), NIL)), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-DATATYPE-METHOD");

    static private final SubLSymbol $sym816$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-DATATYPE-METHOD");

    static private final SubLSymbol $sym818$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym820$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    static private final SubLSymbol $sym821$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_KNOWLEDGE_SOURCE_METHO = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym823$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_ALL_KNOWLEDGE_SOURCES_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLList $list_alt825 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("KEY")), list(makeSymbol(">="), makeSymbol("KEY"), ZERO_INTEGER)), makeString("(GET ~S): ~S is an invalid index.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("KEY")), list(RET, list(makeSymbol("GET-NTH"), makeSymbol("SELF"), makeSymbol("KEY"))));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-METHOD");

    static private final SubLList $list_alt827 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-ORDINAL-POSTING. ~\n    Only ordinal postings may be added to sequence panels."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("CLET"), list(list(makeSymbol("ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("ORD"), makeString("(ADD-DIRECT-POSTING ~S): ~S has invalid ordinal value ~S."), makeSymbol("SELF"), makeSymbol("POSTING"), makeSymbol("ORD")), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("ORD"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION"))), list(RET, makeSymbol("POSTING")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-DIRECT-POSTING-METHOD");

    static private final SubLList $list_alt829 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-ORDINAL-POSTING-P"), makeSymbol("POSTING")), makeString("(REMOVE-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-ORDINAL-POSTING. ~\n    Only ordinal postings may be removed from sequence panels."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("CLET"), list(list(makeSymbol("ORD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ORD"), makeSymbol("CYBLACK-ORDINAL-POSTING")), makeSymbol("POSTING")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("ORD"), makeString("(REMOVE-DIRECT-POSTING ~S): ~S has invalid ordinal value ~S."), makeSymbol("SELF"), makeSymbol("POSTING"), makeSymbol("ORD")), list(makeSymbol("SET-NTH"), makeSymbol("SELF"), makeSymbol("ORD"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-POSTINGS-METHOD");

    static private final SubLList $list_alt832 = list(list(makeSymbol("PUNLESS"), makeSymbol("INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("GET-LENGTH"), makeSymbol("SELF"))), list(makeSymbol("ELEMENT"), NIL), list(makeSymbol("DIRECT-ACTIVE-POSTINGS"), NIL)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), makeSymbol("I"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ELEMENT"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("ELEMENT"))), list(makeSymbol("CPUSH"), makeSymbol("ELEMENT"), makeSymbol("DIRECT-ACTIVE-POSTINGS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("DIRECT-ACTIVE-POSTINGS")))));

    static private final SubLSymbol $sym833$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_DIRECT_ACTIVE_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-DIRECT-ACTIVE-POSTINGS-METHOD");

    static private final SubLList $list_alt835 = list(list(makeSymbol("PUNLESS"), makeSymbol("INTERNAL-STORAGE"), list(RET, NIL)), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym836$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-DIRECT-POSTINGS-METHOD");

    static private final SubLSymbol $sym838$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ADD_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ADD-POSTING-DAEMON-METHOD");

    static private final SubLSymbol $sym840$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_GET_POSTING_DAEMONS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-GET-POSTING-DAEMONS-METHOD");

    static private final SubLSymbol $sym843$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    static private final SubLSymbol $sym844$CYBLACK_BASIC_SEQUENCE_PANEL_REMOVE_ALL_DIRECT_POSTING_DAEMONS_ME = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-REMOVE-ALL-DIRECT-POSTING-DAEMONS-METHOD");

    static private final SubLList $list_alt845 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-MARKS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-INTERNAL-STORAGE"), makeSymbol("SELF"), list(makeSymbol("MAKE-VECTOR"), makeInteger(100), NIL)), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-STORAGE-SIZE"), makeSymbol("SELF"), makeInteger(100)), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-LARGEST-INDEX"), makeSymbol("SELF"), MINUS_ONE_INTEGER), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-DEFAULT-VALUE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-GROWTH-FACTOR"), makeSymbol("SELF"), TWO_INTEGER), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-SEQUENCE-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL"))), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-POSTING-DAEMONS"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-CYBLACK-BASIC-SEQUENCE-PANEL-STIMULATION-TYPE"), makeSymbol("SELF"), makeKeyword("ACTIVE")), list(RET, makeSymbol("SELF")) });



    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-INITIALIZE-METHOD");

    static private final SubLList $list_alt848 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LARGEST-INDEX"), MINUS_ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("LENGTH"), list(makeSymbol("+"), makeSymbol("LARGEST-INDEX"), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ZERO_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("LENGTH"), ONE_INTEGER), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S]"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(RET, makeSymbol("SELF"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("LARGEST-INDEX")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("AREF"), makeSymbol("INTERNAL-STORAGE"), list(makeSymbol("+"), makeSymbol("I"), ONE_INTEGER)))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym849$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    static private final SubLString $str_alt850$__ = makeString("[]");

    static private final SubLString $str_alt851$__S_ = makeString("[~S]");

    static private final SubLString $str_alt852$__S = makeString("[~S");

    static private final SubLString $str_alt853$___S = makeString(", ~S");

    static private final SubLString $str_alt854$_ = makeString("]");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-PRINT-METHOD");

    static private final SubLList $list_alt856 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(SET-APPLICATION ~S ~S)"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL")), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(SET-APPLICATION ~S ~S) -> ~S"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL")), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-APPLICATION")));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-SET-APPLICATION-METHOD");

    static private final SubLSymbol $sym858$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ON-STARTUP-METHOD");

    static private final SubLSymbol $sym860$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_PANEL_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL-ON-SHUTDOWN-METHOD");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_80_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("MARKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-MARKABLE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("STIMULATION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUPER-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUB-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("POSTING-DAEMONS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DLL-PANEL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATION-TYPE"), list(makeSymbol("NEW-STIMULATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")) });
    }

    private static final SubLObject _constant_554_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("ARGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BASE-PANEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PREDICATOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-METHOD"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ARGS"), list(makeSymbol("NEW-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVE-CONTENTS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-INTERNAL"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BASE-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL-INTERNAL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSET-PREDICATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR-INTERNAL"), list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("IS-METHOD"), T)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREDICATOR-IS-METHOD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATION-TYPE"), list(makeSymbol("NEW-STIMULATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-VIRTUAL-PANEL-TEMPLATE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL"), list(makeSymbol("NEW-BASE-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR"), list(makeSymbol("NEW-PREDICATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DERIVE-CONTENTS-INTERNAL"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-PANEL"), list(makeSymbol("NEW-BASE-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBSET-PREDICATOR"), list(makeSymbol("NEW-PREDICATOR"), makeSymbol("&OPTIONAL"), list(makeSymbol("IS-METHOD"), T)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")) });
    }

    private static final SubLObject _constant_653_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("MARKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-MARKABLE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("INTERNAL-STORAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STORAGE-SIZE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LARGEST-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFAULT-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GROWTH-FACTOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEQUENCE-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LENGTH"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NTH"), list(makeSymbol("N"), makeSymbol("&OPTIONAL"), list(makeSymbol("OUT-OF-RANGE-VALUE"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBSEQUENCE"), list(makeSymbol("START-INDEX"), makeSymbol("&OPTIONAL"), list(makeSymbol("END-INDEX"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-STORAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-STORAGE"), list(makeSymbol("NEW-INTERNAL-STORAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STORAGE-SIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STORAGE-SIZE"), list(makeSymbol("NEW-STORAGE-SIZE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LARGEST-INDEX"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LARGEST-INDEX"), list(makeSymbol("NEW-LARGEST-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-INDEX"), list(makeSymbol("CURRENT-INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-VALUE"), list(makeSymbol("NEW-DEFAULT-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GROWTH-FACTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GROWTH-FACTOR"), list(makeSymbol("NEW-GROWTH-FACTOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEQUENCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SEQUENCE-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("OLD-ENUMERATOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-NULL-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), list(makeSymbol("START-INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("STIMULATION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUPER-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUB-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DIRECT-KNOWLEDGE-SOURCES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("POSTING-DAEMONS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATION-TYPE"), list(makeSymbol("NEW-STIMULATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUB-PANELS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUB-PANELS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("EXCLUDED-PANELS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPER-PANEL"), list(makeSymbol("NEW-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPER-PANEL"), list(makeSymbol("OLD-SUPER-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUB-PANEL"), list(makeSymbol("NEW-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUB-PANEL"), list(makeSymbol("OLD-SUB-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-MONITORS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENTS"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE-ALL-POSTING-DAEMONS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE"), list(makeSymbol("NEW-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD-FIRST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-REMOVE-LAST-KNOWLEDGE-SOURCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KNOWLEDGE-SOURCES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTINGS"), list(makeSymbol("POSTINGS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-ACTIVE-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DIRECT-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-POSTINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("KS-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-DAEMON"), list(makeSymbol("NEW-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-POSTING-DAEMON"), list(makeSymbol("OLD-POSTING-DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DIRECT-POSTING-DAEMONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTING-DAEMONS"), list(makeSymbol("DAEMON-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")) });
    }

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_panel_file();
    }

    public void initializeVariables() {
        init_cyblack_panel_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_panel_file();
    }
}

