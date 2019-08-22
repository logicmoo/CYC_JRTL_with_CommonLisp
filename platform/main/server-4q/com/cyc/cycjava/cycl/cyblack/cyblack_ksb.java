/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-KSB
 *  source file: /cyc/top/cycl/cyblack/cyblack-ksb.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_ksb extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ksb() {
    }

    public static final SubLFile me = new cyblack_ksb();


    // // Definitions
    public static final SubLObject cyblack_knowledge_source_battery_p(SubLObject cyblack_knowledge_source_battery) {
        return interfaces.subloop_instanceof_interface(cyblack_knowledge_source_battery, CYBLACK_KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject cyblack_knowledge_source_battery_template_p(SubLObject cyblack_knowledge_source_battery_template) {
        return interfaces.subloop_instanceof_interface(cyblack_knowledge_source_battery_template, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, THIRTEEN_INTEGER, STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, THIRTEEN_INTEGER, STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, TWELVE_INTEGER, STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, TWELVE_INTEGER, STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, ELEVEN_INTEGER, EKSC_TO_PORT_ID_MAP);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, ELEVEN_INTEGER, EKSC_TO_PORT_ID_MAP);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, TEN_INTEGER, KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, TEN_INTEGER, KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, NINE_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, NINE_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, EIGHT_INTEGER, INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, EIGHT_INTEGER, INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_ksb_dictionary(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, SEVEN_INTEGER, KSB_DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_ksb_dictionary(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, SEVEN_INTEGER, KSB_DICTIONARY);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_last_link(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, SIX_INTEGER, LAST_LINK);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_last_link(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, SIX_INTEGER, LAST_LINK);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_first_link(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, FIVE_INTEGER, FIRST_LINK);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_first_link(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, FIVE_INTEGER, FIRST_LINK);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_element_count(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, FOUR_INTEGER, ELEMENT_COUNT);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_element_count(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, FOUR_INTEGER, ELEMENT_COUNT);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_battery_element_equality_predicate(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, THREE_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_battery_element_equality_predicate(SubLObject cyblack_basic_knowledge_source_battery, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source_battery, value, THREE_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_on_shutdown_method(SubLObject self) {
        {
            SubLObject template_all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_knowledge_source = NIL;
            for (template_knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_knowledge_source = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_0_args(template_knowledge_source, ON_SHUTDOWN);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_knowledge_source_instance_given_class_method(SubLObject self, SubLObject symbolic_class_name) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject true_class = NIL;
            SubLObject cdolist_list_var = template_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != template_ks) {
                    true_class = subloop_structures.instance_class(template_ks);
                    if (true_class == symbolic_class_name) {
                        return template_ks;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_external_module_port_ids_method(SubLObject self) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject template_port_ids = self;
            SubLObject template_port_id = NIL;
            SubLObject cdolist_list_var = template_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) {
                    template_port_id = cyblack_ks.cyblack_external_knowledge_source_get_port_id_method(template_ks);
                    {
                        SubLObject item_var = template_port_id;
                        if (NIL == member(item_var, template_port_ids, symbol_function(EQL), symbol_function(IDENTITY))) {
                            template_port_ids = cons(item_var, template_port_ids);
                        }
                    }
                }
            }
            return template_port_ids;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_knowledge_source_given_invitation_transaction_id_method(SubLObject self, SubLObject tid) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject cdolist_list_var = template_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if ((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL != Strings.string_equal(tid, cyblack_ks.cyblack_external_knowledge_source_get_invitation_transaction_id_method(template_ks), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    return template_ks;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_invite_external_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_in_want_of_invitations_method(self);
            SubLObject cdolist_list_var = template_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                cyblack_ks_dispatch_functions.cyblack_ks_link_to_panels(template_ks);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_waiting_for_reply_method(SubLObject self) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject template_unlinked_knowledge_sources = NIL;
            SubLObject list_expression = template_knowledge_sources;
            if (NIL == list_expression) {
                template_unlinked_knowledge_sources = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_unlinked_knowledge_sources = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_ks = list_expression.first();
                            template_unlinked_knowledge_sources = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL != cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            template_unlinked_knowledge_sources = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject template_ks = NIL;
                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                    result = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL != cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            template_unlinked_knowledge_sources = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL != cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                            tail_cons = last(template_unlinked_knowledge_sources, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return template_unlinked_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_in_want_of_invitations_method(SubLObject self) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject template_unlinked_knowledge_sources = NIL;
            SubLObject list_expression = template_knowledge_sources;
            if (NIL == list_expression) {
                template_unlinked_knowledge_sources = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_unlinked_knowledge_sources = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_ks = list_expression.first();
                            template_unlinked_knowledge_sources = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL == cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            template_unlinked_knowledge_sources = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject template_ks = NIL;
                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                    result = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL == cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            template_unlinked_knowledge_sources = (((NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) && (NIL == cyblack_ks.cyblack_external_knowledge_source_waiting_on_link_callback_p_method(template_ks))) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                            tail_cons = last(template_unlinked_knowledge_sources, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return template_unlinked_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject template_unlinked_knowledge_sources = NIL;
            SubLObject list_expression = template_knowledge_sources;
            if (NIL == list_expression) {
                template_unlinked_knowledge_sources = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_unlinked_knowledge_sources = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_ks = list_expression.first();
                            template_unlinked_knowledge_sources = ((NIL != template_ks) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            template_unlinked_knowledge_sources = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject template_ks = NIL;
                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                    result = ((NIL != template_ks) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            template_unlinked_knowledge_sources = ((NIL != template_ks) && (NIL == cyblack_ks_dispatch_functions.cyblack_ks_linked_to_panels_p(template_ks))) ? ((SubLObject) (list(template_ks))) : NIL;
                                            tail_cons = last(template_unlinked_knowledge_sources, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return template_unlinked_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unlink_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        cyblack_utilities.cyblack_silence(self);
        methods.funcall_instance_method_with_0_args(knowledge_source, UNLINK_FROM_PANELS);
        return knowledge_source;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_link_knowledge_sources_to_panels_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_application = cyblack_basic_knowledge_source_battery_get_application_method(self);
                if (NIL != template_application) {
                    {
                        SubLObject template_blackboard = methods.funcall_instance_method_with_0_args(template_application, GET_BLACKBOARD);
                        if (NIL != template_blackboard) {
                            {
                                SubLObject template_dictionary = cyblack_basic_knowledge_source_battery_get_dictionary_method(self);
                                SubLObject template_panel = NIL;
                                if (NIL != template_dictionary) {
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(template_dictionary));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject template_datatype = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject template_knowledge_sources = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != template_datatype) {
                                                    template_panel = methods.funcall_instance_method_with_1_args(template_datatype, GET_PANEL, template_blackboard);
                                                    if (NIL != template_panel) {
                                                        {
                                                            SubLObject cdolist_list_var = template_knowledge_sources;
                                                            SubLObject template_knowledge_source = NIL;
                                                            for (template_knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_knowledge_source = cdolist_list_var.first()) {
                                                                methods.funcall_instance_method_with_1_args(template_panel, ADD_DIRECT_KNOWLEDGE_SOURCE, template_knowledge_source);
                                                            }
                                                        }
                                                    }
                                                }
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unmonitor_all_knowledge_sources_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_monitor_all_knowledge_sources_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unmonitor_knowledge_sources_stimulated_by_type_method(SubLObject self, SubLObject datatype) {
        return datatype;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_monitor_knowledge_sources_stimulated_by_type_method(SubLObject self, SubLObject datatype) {
        return datatype;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_has_external_knowledge_sources_p_method(SubLObject self) {
        {
            SubLObject template_all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_ks = NIL;
            for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_all_external_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject template_all_external_knowledge_sources = NIL;
            SubLObject list_expression = template_all_knowledge_sources;
            if (NIL == list_expression) {
                template_all_external_knowledge_sources = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_all_external_knowledge_sources = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_ks = list_expression.first();
                            template_all_external_knowledge_sources = (NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) ? ((SubLObject) (list(template_ks))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            template_all_external_knowledge_sources = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject template_ks = NIL;
                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                    result = (NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) ? ((SubLObject) (list(template_ks))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            template_all_external_knowledge_sources = (NIL != cyblack_ks.cyblack_external_knowledge_source_p(template_ks)) ? ((SubLObject) (list(template_ks))) : NIL;
                                            tail_cons = last(template_all_external_knowledge_sources, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return template_all_external_knowledge_sources;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(SubLObject self) {
        return cyblack_basic_knowledge_source_battery_get_contents_method(self);
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_knowledge_sources_stimulated_by_type_method(SubLObject self, SubLObject datatype) {
        {
            SubLObject template_dictionary = cyblack_basic_knowledge_source_battery_get_dictionary_method(self);
            if (NIL != template_dictionary) {
                return copy_list(dictionary.dictionary_lookup(template_dictionary, datatype, NIL));
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unregister_all_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_dictionary = cyblack_basic_knowledge_source_battery_get_dictionary_method(self);
            SubLObject template_all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject cdolist_list_var = template_all_knowledge_sources;
            SubLObject template_knowledge_source = NIL;
            for (template_knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_knowledge_source = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_0_args(template_knowledge_source, DELETE_SELF_FROM_ALL_COLLECTIONS);
            }
            if (NIL != template_dictionary) {
                dictionary.clear_dictionary(template_dictionary);
            }
            cyblack_basic_knowledge_source_battery_clear_method(self);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unregister_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        {
            SubLObject template_dictionary = cyblack_basic_knowledge_source_battery_get_dictionary_method(self);
            SubLObject template_datatypes_bag = methods.funcall_instance_method_with_0_args(knowledge_source, GET_PRECONDITION_DATATYPES);
            SubLObject template_unique_datatypes = (NIL != template_datatypes_bag) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(template_datatypes_bag, GET_UNIQUE_ELEMENTS))) : NIL;
            if (NIL != template_dictionary) {
                {
                    SubLObject cdolist_list_var = template_unique_datatypes;
                    SubLObject template_datatype = NIL;
                    for (template_datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_datatype = cdolist_list_var.first()) {
                        dictionary_utilities.dictionary_remove_from_value(template_dictionary, template_datatype, knowledge_source, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return knowledge_source;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_complete_knowledge_source_registration_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
                        SubLObject template_dictionary = cyblack_basic_knowledge_source_battery_get_dictionary_method(self);
                        if (NIL != template_dictionary) {
                            {
                                SubLObject cdolist_list_var = template_knowledge_sources;
                                SubLObject template_ks = NIL;
                                for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                    methods.funcall_instance_method_with_1_args(template_ks, SET_APPLICATION, application);
                                    if (NIL != cyblack_ks.cyblack_pattern_based_knowledge_source_p(template_ks)) {
                                        {
                                            SubLObject template_types_bag = methods.funcall_instance_method_with_0_args(template_ks, GET_PRECONDITION_DATATYPES);
                                            if (NIL != template_types_bag) {
                                                {
                                                    SubLObject template_datatypes = methods.funcall_instance_method_with_0_args(template_types_bag, GET_UNIQUE_ELEMENTS);
                                                    if (NIL != template_datatypes) {
                                                        {
                                                            SubLObject cdolist_list_var_1 = template_datatypes;
                                                            SubLObject template_datatype = NIL;
                                                            for (template_datatype = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , template_datatype = cdolist_list_var_1.first()) {
                                                                dictionary_utilities.dictionary_pushnew(template_dictionary, template_datatype, template_ks, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym102$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, NIL);
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
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym102$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_register_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        if (NIL == cyblack_basic_knowledge_source_battery_member_p_method(self, knowledge_source)) {
            cyblack_basic_knowledge_source_battery_add_method(self, knowledge_source);
        }
        return knowledge_source;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_initialize_qua_cyblack_knowledge_source_battery_template_method(SubLObject self) {
        cyblack_basic_knowledge_source_battery_set_dictionary_method(self, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_swap_method(SubLObject self, SubLObject element1, SubLObject element2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (element1 == element2) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != element1) && (NIL != element2))) {
                    Errors.error($str_alt110$_SWAP__S___Cannot_swap_NIL_elemen, self);
                }
            }
            {
                SubLObject link1 = cyblack_basic_knowledge_source_battery_find_link_method(self, element1);
                SubLObject link2 = cyblack_basic_knowledge_source_battery_find_link_method(self, element2);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link1) {
                        Errors.error($str_alt111$_SWAP__S____S_is_not_an_element_o, self, element1);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link2) {
                        Errors.error($str_alt111$_SWAP__S____S_is_not_an_element_o, self, element2);
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

    public static final SubLObject cyblack_basic_knowledge_source_battery_empty_p_method(SubLObject self) {
        return sublisp_null(cyblack_basic_knowledge_source_battery_get_first_link_method(self));
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_reverse_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
            SubLObject template_last_link = cyblack_basic_knowledge_source_battery_get_last_link_method(self);
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
                    cyblack_basic_knowledge_source_battery_reverse_link_method(self, template_current_link);
                    template_current_link = template_next_link;
                } 
                cyblack_basic_knowledge_source_battery_set_first_link_method(self, template_last_link);
                cyblack_basic_knowledge_source_battery_set_last_link_method(self, template_first_link);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_append_method(SubLObject self, SubLObject other_list) {
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
                        cyblack_basic_knowledge_source_battery_add_method(self, template_element);
                    }
                }
                return self;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.list_template_p(other_list)) {
                    Errors.error($str_alt124$_APPEND__S___Cannot_append_non_li, self, other_list);
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
                            cyblack_basic_knowledge_source_battery_add_method(self, template_element);
                            template_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                        } 
                        return self;
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_position_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            if (NIL == template_links) {
                return NIL;
            }
            while (NIL != template_links) {
                if (NIL != cyblack_basic_knowledge_source_battery_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return count;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_nth_method(SubLObject self, SubLObject index, SubLObject new_element) {
        {
            SubLObject template_link = cyblack_basic_knowledge_source_battery_find_nth_link_method(self, index);
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

    public static final SubLObject cyblack_basic_knowledge_source_battery_nth_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_link = cyblack_basic_knowledge_source_battery_find_nth_link_method(self, index);
            if (NIL != template_link) {
                return subloop_collections.dlc_contents(template_link);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_but_last_method(SubLObject self) {
        {
            SubLObject template_last_link = cyblack_basic_knowledge_source_battery_get_last_link_method(self);
            if (NIL != template_last_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_last_link);
                    cyblack_basic_knowledge_source_battery_delete_link_method(self, template_last_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_pop_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_first_link);
                    cyblack_basic_knowledge_source_battery_delete_link_method(self, template_first_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_push_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_first_link = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_first_link) {
                subloop_collections._csetf_dlc_next(template_new_link, template_first_link);
                subloop_collections._csetf_dlc_previous(template_first_link, template_new_link);
                cyblack_basic_knowledge_source_battery_set_first_link_method(self, template_new_link);
            } else {
                cyblack_basic_knowledge_source_battery_set_first_link_method(self, template_new_link);
                cyblack_basic_knowledge_source_battery_set_last_link_method(self, template_new_link);
            }
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_knowledge_source_battery_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_member_p_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_link = cyblack_basic_knowledge_source_battery_find_link_method(self, element);
            return NIL != template_link ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_remove_method(SubLObject self, SubLObject old_element) {
        if (NIL != subloop_collections.list_element_template_p(old_element)) {
            subloop_collections.generic_dllt_delete_self_from_collection_function(old_element, self);
        } else {
            {
                SubLObject template_link = cyblack_basic_knowledge_source_battery_find_link_method(self, old_element);
                if (NIL != template_link) {
                    cyblack_basic_knowledge_source_battery_delete_link_method(self, template_link);
                }
            }
        }
        return old_element;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            SubLObject template_last_link = cyblack_basic_knowledge_source_battery_get_last_link_method(self);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_last_link) {
                subloop_collections._csetf_dlc_next(template_last_link, template_new_link);
                subloop_collections._csetf_dlc_previous(template_new_link, template_last_link);
            } else {
                cyblack_basic_knowledge_source_battery_set_first_link_method(self, template_new_link);
            }
            cyblack_basic_knowledge_source_battery_set_last_link_method(self, template_new_link);
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_knowledge_source_battery_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_clear_method(SubLObject self) {
        {
            SubLObject template_contents = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_element = NIL;
            for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                cyblack_basic_knowledge_source_battery_remove_method(self, template_element);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_find_nth_link_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_links = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
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

    public static final SubLObject cyblack_basic_knowledge_source_battery_find_link_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
            while (NIL != template_links) {
                if (NIL != cyblack_basic_knowledge_source_battery_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return template_links;
                }
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_reverse_link_method(SubLObject self, SubLObject link) {
        {
            SubLObject template_previous = subloop_collections.dlc_previous(link);
            SubLObject template_next = subloop_collections.dlc_next(link);
            subloop_collections._csetf_dlc_previous(link, template_next);
            subloop_collections._csetf_dlc_next(link, template_previous);
            return link;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_delete_link_method(SubLObject self, SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.double_link_cell_p(link)) {
                    Errors.error($str_alt176$_DELETE_LINK__S____S_is_not_a_val, self, link);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (subloop_collections.dlc_owner(link) != self) {
                    Errors.error($str_alt177$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
                }
            }
            cyblack_basic_knowledge_source_battery_dec_element_count_method(self);
            {
                SubLObject template_first_link = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
                SubLObject template_last_link = cyblack_basic_knowledge_source_battery_get_last_link_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != template_first_link) && (NIL != template_last_link)) || ((NIL == template_first_link) && (NIL == template_last_link)))) {
                        Errors.error($str_alt178$_DELETE_LINK__S___Detected_incons, self);
                    }
                }
                if (template_first_link == link) {
                    if (template_last_link == link) {
                        cyblack_basic_knowledge_source_battery_set_first_link_method(self, NIL);
                        cyblack_basic_knowledge_source_battery_set_last_link_method(self, NIL);
                        subloop_collections._csetf_dlc_previous(link, NIL);
                        subloop_collections._csetf_dlc_next(link, NIL);
                        return subloop_collections.dlc_contents(link);
                    } else {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_previous(template_second_link, NIL);
                            cyblack_basic_knowledge_source_battery_set_first_link_method(self, template_second_link);
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
                            cyblack_basic_knowledge_source_battery_set_last_link_method(self, template_second_link);
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

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt183$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
                }
            }
            {
                SubLObject template_contents = cyblack_basic_knowledge_source_battery_get_contents_method(self);
                SubLObject cdolist_list_var = template_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_knowledge_source_battery_remove_method(self, template_element);
                }
            }
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_knowledge_source_battery_add_method(self, template_element);
                }
            }
            return new_contents;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_contents_method(SubLObject self) {
        {
            SubLObject template_contents = NIL;
            SubLObject template_first_link = cyblack_basic_knowledge_source_battery_get_first_link_method(self);
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

    public static final SubLObject cyblack_basic_knowledge_source_battery_element_equal_p_method(SubLObject self, SubLObject element1, SubLObject element2) {
        return equal(element1, element2);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_battery_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_battery_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KSB_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EKSC_TO_PORT_ID_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_p(SubLObject cyblack_basic_knowledge_source_battery) {
        return classes.subloop_instanceof_class(cyblack_basic_knowledge_source_battery, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_element_equality_predicate_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_equality_predicate = get_cyblack_basic_knowledge_source_battery_element_equality_predicate(self);
            try {
                try {
                    sublisp_throw($sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, element_equality_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_equality_predicate(self, element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_element_equality_predicate_method(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_equality_predicate = get_cyblack_basic_knowledge_source_battery_element_equality_predicate(self);
            try {
                try {
                    element_equality_predicate = new_predicate;
                    sublisp_throw($sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_equality_predicate(self, element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_element_count_method(SubLObject self, SubLObject new_element_count) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_count = get_cyblack_basic_knowledge_source_battery_element_count(self);
            try {
                try {
                    element_count = new_element_count;
                    sublisp_throw($sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_inc_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_count = get_cyblack_basic_knowledge_source_battery_element_count(self);
            try {
                try {
                    if (NIL == element_count) {
                        element_count = ONE_INTEGER;
                    } else {
                        element_count = add(element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym215$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_dec_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_count = get_cyblack_basic_knowledge_source_battery_element_count(self);
            try {
                try {
                    if (NIL == element_count) {
                        element_count = ZERO_INTEGER;
                    } else {
                        element_count = subtract(element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_first_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject first_link = get_cyblack_basic_knowledge_source_battery_first_link(self);
            try {
                try {
                    sublisp_throw($sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_first_link(self, first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_first_link_method(SubLObject self, SubLObject new_first_link) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject first_link = get_cyblack_basic_knowledge_source_battery_first_link(self);
            try {
                try {
                    first_link = new_first_link;
                    sublisp_throw($sym228$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_first_link(self, first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym228$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_last_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject last_link = get_cyblack_basic_knowledge_source_battery_last_link(self);
            try {
                try {
                    sublisp_throw($sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_last_link(self, last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_last_link_method(SubLObject self, SubLObject new_last_link) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject last_link = get_cyblack_basic_knowledge_source_battery_last_link(self);
            try {
                try {
                    last_link = new_last_link;
                    sublisp_throw($sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_last_link(self, last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject element_count = get_cyblack_basic_knowledge_source_battery_element_count(self);
            try {
                try {
                    sublisp_throw($sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_element_count(self, element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_allocate_enumerator_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
                SubLObject first_link = get_cyblack_basic_knowledge_source_battery_first_link(self);
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
                                sublisp_throw($sym244$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_enumerator);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_knowledge_source_battery_first_link(self, first_link);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym244$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
                }
                return catch_var_for_cyblack_basic_knowledge_source_battery_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_deallocate_enumerator_method(SubLObject self, SubLObject enumerator) {
        if (NIL != subloop_collections.basic_doubly_linked_list_enumerator_p(enumerator)) {
            subloop_collections.basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_dictionary_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject ksb_dictionary = get_cyblack_basic_knowledge_source_battery_ksb_dictionary(self);
            try {
                try {
                    sublisp_throw($sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, ksb_dictionary);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_ksb_dictionary(self, ksb_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_dictionary_method(SubLObject self, SubLObject new_dictionary) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject ksb_dictionary = get_cyblack_basic_knowledge_source_battery_ksb_dictionary(self);
            try {
                try {
                    ksb_dictionary = new_dictionary;
                    sublisp_throw($sym258$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, new_dictionary);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_ksb_dictionary(self, ksb_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym258$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject stored_external_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(self);
            SubLObject stored_internal_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(self);
            SubLObject eksc_to_port_id_map = get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self);
            SubLObject knowledge_sources_waiting_for_application = get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self);
            SubLObject external_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self);
            SubLObject internal_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self);
            SubLObject last_link = get_cyblack_basic_knowledge_source_battery_last_link(self);
            SubLObject first_link = get_cyblack_basic_knowledge_source_battery_first_link(self);
            SubLObject element_count = get_cyblack_basic_knowledge_source_battery_element_count(self);
            SubLObject element_equality_predicate = get_cyblack_basic_knowledge_source_battery_element_equality_predicate(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    element_equality_predicate = NIL;
                    element_count = ZERO_INTEGER;
                    first_link = NIL;
                    last_link = NIL;
                    cyblack_basic_knowledge_source_battery_initialize_qua_cyblack_knowledge_source_battery_template_method(self);
                    internal_knowledge_source_classes = NIL;
                    external_knowledge_source_classes = NIL;
                    knowledge_sources_waiting_for_application = NIL;
                    eksc_to_port_id_map = NIL;
                    stored_internal_knowledge_source_classes = NIL;
                    stored_external_knowledge_source_classes = NIL;
                    sublisp_throw($sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(self, stored_external_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(self, stored_internal_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self, eksc_to_port_id_map);
                            set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self, knowledge_sources_waiting_for_application);
                            set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self, external_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self, internal_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_last_link(self, last_link);
                            set_cyblack_basic_knowledge_source_battery_first_link(self, first_link);
                            set_cyblack_basic_knowledge_source_battery_element_count(self, element_count);
                            set_cyblack_basic_knowledge_source_battery_element_equality_predicate(self, element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_enumerator = cyblack_basic_knowledge_source_battery_allocate_enumerator_method(self);
            if (NIL == template_enumerator) {
                format(stream, $str_alt267$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
                return self;
            } else
                if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                    format(stream, $str_alt268$KSB__);
                } else {
                    format(stream, $str_alt269$KSB__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                    while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                        format(stream, $str_alt271$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                    } 
                    format(stream, $str_alt272$_);
                }

            cyblack_basic_knowledge_source_battery_deallocate_enumerator_method(self, template_enumerator);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_application_method(SubLObject self) {
        return cyblack_object.get_cyblack_object_application(self);
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_set_application_method(SubLObject self, SubLObject new_application) {
        cyblack_object.set_cyblack_object_application(self, new_application);
        {
            SubLObject enumerator = cyblack_basic_knowledge_source_battery_allocate_enumerator_method(self);
            if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                {
                    SubLObject current_ks = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                    methods.funcall_instance_method_with_1_args(current_ks, SET_APPLICATION, new_application);
                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                        current_ks = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                        methods.funcall_instance_method_with_1_args(current_ks, SET_APPLICATION, new_application);
                    } 
                }
                cyblack_basic_knowledge_source_battery_deallocate_enumerator_method(self, enumerator);
            }
        }
        return new_application;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_class_method(SubLObject self, SubLObject ks_class) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject internal_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self);
            try {
                try {
                    {
                        SubLObject item_var = ks_class;
                        if (NIL == member(item_var, internal_knowledge_source_classes, symbol_function(EQL), symbol_function(IDENTITY))) {
                            internal_knowledge_source_classes = cons(item_var, internal_knowledge_source_classes);
                        }
                        sublisp_throw($sym284$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, ks_class);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self, internal_knowledge_source_classes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym284$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_external_knowledge_source_class_method(SubLObject self, SubLObject ks_class) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject external_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self);
            try {
                try {
                    {
                        SubLObject item_var = ks_class;
                        if (NIL == member(item_var, external_knowledge_source_classes, symbol_function(EQL), symbol_function(IDENTITY))) {
                            external_knowledge_source_classes = cons(item_var, external_knowledge_source_classes);
                        }
                        sublisp_throw($sym288$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, ks_class);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self, external_knowledge_source_classes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym288$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_method(SubLObject self, SubLObject ks) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject knowledge_sources_waiting_for_application = get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != application) {
                        methods.funcall_instance_method_with_1_args(ks, SET_APPLICATION, application);
                    } else {
                        {
                            SubLObject item_var = ks;
                            if (NIL == member(item_var, knowledge_sources_waiting_for_application, symbol_function(EQL), symbol_function(IDENTITY))) {
                                knowledge_sources_waiting_for_application = cons(item_var, knowledge_sources_waiting_for_application);
                            }
                        }
                    }
                    cyblack_basic_knowledge_source_battery_register_knowledge_source_method(self, ks);
                    sublisp_throw($sym293$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, ks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self, knowledge_sources_waiting_for_application);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym293$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_external_knowledge_source_method(SubLObject self, SubLObject ks) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject knowledge_sources_waiting_for_application = get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != application) {
                        methods.funcall_instance_method_with_1_args(ks, SET_APPLICATION, application);
                    } else {
                        {
                            SubLObject item_var = ks;
                            if (NIL == member(item_var, knowledge_sources_waiting_for_application, symbol_function(EQL), symbol_function(IDENTITY))) {
                                knowledge_sources_waiting_for_application = cons(item_var, knowledge_sources_waiting_for_application);
                            }
                        }
                    }
                    cyblack_basic_knowledge_source_battery_register_knowledge_source_method(self, ks);
                    sublisp_throw($sym297$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, ks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self, knowledge_sources_waiting_for_application);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym297$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_add_eksc_to_port_id_association_method(SubLObject self, SubLObject eksc, SubLObject port_id) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject eksc_to_port_id_map = get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self);
            try {
                try {
                    if (NIL != eksc_to_port_id_map) {
                        {
                            SubLObject current_association = assoc(eksc, eksc_to_port_id_map, UNPROVIDED, UNPROVIDED);
                            if (NIL != current_association) {
                                rplacd(current_association, port_id);
                            } else {
                                eksc_to_port_id_map = cons(cons(eksc, port_id), eksc_to_port_id_map);
                            }
                        }
                    } else {
                        eksc_to_port_id_map = list(cons(eksc, port_id));
                    }
                    sublisp_throw($sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, port_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self, eksc_to_port_id_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_port_id_given_eksc_method(SubLObject self, SubLObject eksc) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject eksc_to_port_id_map = get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self);
            try {
                try {
                    {
                        SubLObject association = assoc(eksc, eksc_to_port_id_map, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym307$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, NIL != association ? ((SubLObject) (association.rest())) : NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self, eksc_to_port_id_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_get_all_port_ids_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject eksc_to_port_id_map = get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self);
            try {
                try {
                    {
                        SubLObject port_ids = NIL;
                        SubLObject list_expression = eksc_to_port_id_map;
                        if (NIL == list_expression) {
                            port_ids = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                port_ids = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject association = list_expression.first();
                                        port_ids = (NIL != eksc_to_port_id_map) ? ((SubLObject) (list(association.rest()))) : NIL;
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        port_ids = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject association = NIL;
                                            for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                                                result = (NIL != eksc_to_port_id_map) ? ((SubLObject) (list(association.rest()))) : NIL;
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        port_ids = (NIL != eksc_to_port_id_map) ? ((SubLObject) (list(association.rest()))) : NIL;
                                                        tail_cons = last(port_ids, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }


                        sublisp_throw($sym311$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, port_ids);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map(self, eksc_to_port_id_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym311$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_remove_knowledge_source_method(SubLObject self, SubLObject knowledge_source) {
        cyblack_basic_knowledge_source_battery_unlink_knowledge_source_method(self, knowledge_source);
        cyblack_basic_knowledge_source_battery_unregister_knowledge_source_method(self, knowledge_source);
        return knowledge_source;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_find_external_knowledge_source_method(SubLObject self, SubLObject name) {
        {
            SubLObject enumerator = cyblack_basic_knowledge_source_battery_allocate_enumerator_method(self);
            if (NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(enumerator)) {
                {
                    SubLObject current_ks = subloop_collections.basic_doubly_linked_list_enumerator_first_method(enumerator);
                    while (NIL != current_ks) {
                        if ((NIL != cyblack_ks.cyblack_external_knowledge_source_p(current_ks)) && name.equal(cyblack_ks.cyblack_external_knowledge_source_get_name_method(current_ks))) {
                            cyblack_basic_knowledge_source_battery_deallocate_enumerator_method(self, enumerator);
                            return current_ks;
                        }
                        current_ks = subloop_collections.basic_doubly_linked_list_enumerator_next_method(enumerator);
                    } 
                }
            }
            cyblack_basic_knowledge_source_battery_deallocate_enumerator_method(self, enumerator);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_on_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject knowledge_sources_waiting_for_application = get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_object.cyblack_object_on_startup_method(self);
                    cyblack_basic_knowledge_source_battery_store_knowledge_sources_method(self);
                    {
                        SubLObject cdolist_list_var = knowledge_sources_waiting_for_application;
                        SubLObject ks = NIL;
                        for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(ks, SET_APPLICATION, application);
                        }
                    }
                    {
                        SubLObject template_all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
                        SubLObject template_application = cyblack_basic_knowledge_source_battery_get_application_method(self);
                        {
                            SubLObject cdolist_list_var = template_all_knowledge_sources;
                            SubLObject template_knowledge_source = NIL;
                            for (template_knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_knowledge_source = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(template_knowledge_source, SET_APPLICATION, template_application);
                            }
                        }
                        cyblack_basic_knowledge_source_battery_complete_knowledge_source_registration_method(self);
                        cyblack_basic_knowledge_source_battery_link_knowledge_sources_to_panels_method(self);
                        {
                            SubLObject cdolist_list_var = template_all_knowledge_sources;
                            SubLObject template_knowledge_source = NIL;
                            for (template_knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_knowledge_source = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_0_args(template_knowledge_source, ON_STARTUP);
                            }
                        }
                    }
                    sublisp_throw($sym321$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application(self, knowledge_sources_waiting_for_application);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym321$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_monitor_method(SubLObject self, SubLObject v_object_monitor) {
        cyblack_object.cyblack_object_monitor_method(self, v_object_monitor);
        {
            SubLObject cdolist_list_var = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_1_args(knowledge_source, MONITOR, v_object_monitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_unmonitor_method(SubLObject self, SubLObject v_object_monitor) {
        cyblack_object.cyblack_object_unmonitor_method(self, v_object_monitor);
        {
            SubLObject cdolist_list_var = cyblack_basic_knowledge_source_battery_get_contents_method(self);
            SubLObject knowledge_source = NIL;
            for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_1_args(knowledge_source, UNMONITOR, v_object_monitor);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_store_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_battery_method = NIL;
            SubLObject stored_external_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(self);
            SubLObject stored_internal_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(self);
            SubLObject external_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self);
            SubLObject internal_knowledge_source_classes = get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self);
            try {
                try {
                    stored_internal_knowledge_source_classes = copy_list(internal_knowledge_source_classes);
                    stored_external_knowledge_source_classes = copy_list(external_knowledge_source_classes);
                    sublisp_throw($sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(self, stored_external_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(self, stored_internal_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self, external_knowledge_source_classes);
                            set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self, internal_knowledge_source_classes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_battery_method = Errors.handleThrowable(ccatch_env_var, $sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_battery_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_restore_knowledge_sources_method(SubLObject self) {
        cyblack_basic_knowledge_source_battery_unregister_all_knowledge_sources_method(self);
        set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self, copy_list(get_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes(self)));
        set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self, copy_list(get_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes(self)));
        {
            SubLObject all_knowledge_sources = cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method(self);
            SubLObject application = cyblack_basic_knowledge_source_battery_get_application_method(self);
            {
                SubLObject cdolist_list_var = all_knowledge_sources;
                SubLObject knowledge_source = NIL;
                for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(knowledge_source, SET_APPLICATION, application);
                }
            }
            cyblack_basic_knowledge_source_battery_complete_knowledge_source_registration_method(self);
            cyblack_basic_knowledge_source_battery_link_knowledge_sources_to_panels_method(self);
            {
                SubLObject cdolist_list_var = all_knowledge_sources;
                SubLObject knowledge_source = NIL;
                for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_0_args(knowledge_source, ON_STARTUP);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_battery_reset_method(SubLObject self) {
        cyblack_basic_knowledge_source_battery_restore_knowledge_sources_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_ksb_unlinked_knowledge_sources_waiting_for_reply(SubLObject cyblack_knowledge_source_battery) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                    Errors.error($str_alt340$CYBLACK_KSB_UNLINKED_KNOWLEDGE_SO, cyblack_knowledge_source_battery);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                return cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_waiting_for_reply_method(cyblack_knowledge_source_battery);
            } else {
                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source_battery, UNLINKED_KNOWLEDGE_SOURCES_WAITING_FOR_REPLY);
            }
        }
    }

    public static final SubLObject cyblack_ksb_register_knowledge_source(SubLObject cyblack_knowledge_source_battery, SubLObject knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                    Errors.error($str_alt341$CYBLACK_KSB_REGISTER_KNOWLEDGE_SO, cyblack_knowledge_source_battery);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                return cyblack_basic_knowledge_source_battery_register_knowledge_source_method(cyblack_knowledge_source_battery, knowledge_source);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source_battery, REGISTER_KNOWLEDGE_SOURCE, knowledge_source);
            }
        }
    }

    public static final SubLObject cyblack_ksb_unregister_knowledge_source(SubLObject cyblack_knowledge_source_battery, SubLObject knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                    Errors.error($str_alt342$CYBLACK_KSB_UNREGISTER_KNOWLEDGE_, cyblack_knowledge_source_battery);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                return cyblack_basic_knowledge_source_battery_unregister_knowledge_source_method(cyblack_knowledge_source_battery, knowledge_source);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source_battery, UNREGISTER_KNOWLEDGE_SOURCE, knowledge_source);
            }
        }
    }

    public static final SubLObject cyblack_ksb_remove_knowledge_source(SubLObject cyblack_knowledge_source_battery, SubLObject knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                    Errors.error($str_alt343$CYBLACK_KSB_REMOVE_KNOWLEDGE_SOUR, cyblack_knowledge_source_battery);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                return cyblack_basic_knowledge_source_battery_remove_knowledge_source_method(cyblack_knowledge_source_battery, knowledge_source);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source_battery, REMOVE_KNOWLEDGE_SOURCE, knowledge_source);
            }
        }
    }

    public static final SubLObject cyblack_ksb_find_external_knowledge_source(SubLObject cyblack_knowledge_source_battery, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                    Errors.error($str_alt344$CYBLACK_KSB_FIND_EXTERNAL_KNOWLED, cyblack_knowledge_source_battery);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery)) {
                return cyblack_basic_knowledge_source_battery_find_external_knowledge_source_method(cyblack_knowledge_source_battery, name);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source_battery, FIND_EXTERNAL_KNOWLEDGE_SOURCE, name);
            }
        }
    }

    public static final SubLObject cyblack_ksbt_get_dictionary(SubLObject cyblack_knowledge_source_battery_template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_battery_template_p(cyblack_knowledge_source_battery_template)) {
                    Errors.error($str_alt345$CYBLACK_KSBT_GET_DICTIONARY___S_i, cyblack_knowledge_source_battery_template);
                }
            }
            if (NIL != cyblack_basic_knowledge_source_battery_p(cyblack_knowledge_source_battery_template)) {
                return cyblack_basic_knowledge_source_battery_get_dictionary_method(cyblack_knowledge_source_battery_template);
            } else {
                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source_battery_template, GET_DICTIONARY);
            }
        }
    }

    public static final SubLObject declare_cyblack_ksb_file() {
        declareFunction("cyblack_knowledge_source_battery_p", "CYBLACK-KNOWLEDGE-SOURCE-BATTERY-P", 1, 0, false);
        declareFunction("cyblack_knowledge_source_battery_template_p", "CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_stored_external_knowledge_source_classes", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_stored_internal_knowledge_source_classes", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EKSC-TO-PORT-ID-MAP", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_eksc_to_port_id_map", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EKSC-TO-PORT-ID-MAP", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_knowledge_sources_waiting_for_application", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INTERNAL-KNOWLEDGE-SOURCE-CLASSES", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INTERNAL-KNOWLEDGE-SOURCE-CLASSES", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_ksb_dictionary", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KSB-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_ksb_dictionary", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KSB-DICTIONARY", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_last_link", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-LAST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_last_link", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-LAST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_first_link", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIRST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_first_link", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIRST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_element_count", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-COUNT", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_element_count", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-COUNT", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_battery_element_equality_predicate", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_battery_element_equality_predicate", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_on_shutdown_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_knowledge_source_instance_given_class_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCE-INSTANCE-GIVEN-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_external_module_port_ids_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-EXTERNAL-MODULE-PORT-IDS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_knowledge_source_given_invitation_transaction_id_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_invite_external_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INVITE-EXTERNAL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_waiting_for_reply_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_in_want_of_invitations_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unlinked_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unlink_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINK-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_link_knowledge_sources_to_panels_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-LINK-KNOWLEDGE-SOURCES-TO-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unmonitor_all_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_monitor_all_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unmonitor_knowledge_sources_stimulated_by_type_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_monitor_knowledge_sources_stimulated_by_type_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_has_external_knowledge_sources_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-HAS-EXTERNAL-KNOWLEDGE-SOURCES-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_all_external_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_all_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_knowledge_sources_stimulated_by_type_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unregister_all_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNREGISTER-ALL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unregister_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNREGISTER-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_complete_knowledge_source_registration_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_register_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REGISTER-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_initialize_qua_cyblack_knowledge_source_battery_template_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_swap_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SWAP-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_empty_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_reverse_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REVERSE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_append_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-APPEND-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_position_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-POSITION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_nth_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_nth_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-NTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_but_last_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-BUT-LAST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_pop_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-POP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_push_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PUSH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_member_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_remove_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_clear_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_find_nth_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-NTH-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_find_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_reverse_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REVERSE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_delete_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DELETE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_contents_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_contents_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_element_equal_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_battery_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_battery_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_p", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-P", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_element_equality_predicate_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_element_equality_predicate_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_element_count_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_inc_element_count_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_dec_element_count_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_first_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-FIRST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_first_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-FIRST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_last_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-LAST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_last_link_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-LAST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_element_count_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_allocate_enumerator_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_deallocate_enumerator_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_dictionary_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_dictionary_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-DICTIONARY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_initialize_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_print_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_application_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_set_application_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_class_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_external_knowledge_source_class_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-INTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_external_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_add_eksc_to_port_id_association_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EKSC-TO-PORT-ID-ASSOCIATION-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_port_id_given_eksc_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PORT-ID-GIVEN-EKSC-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_get_all_port_ids_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-PORT-IDS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_remove_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REMOVE-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_find_external_knowledge_source_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_on_startup_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_monitor_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_unmonitor_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_store_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORE-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_restore_knowledge_sources_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-RESTORE-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_battery_reset_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-RESET-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_unlinked_knowledge_sources_waiting_for_reply", "CYBLACK-KSB-UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY", 1, 0, false);
        declareFunction("cyblack_ksb_register_knowledge_source", "CYBLACK-KSB-REGISTER-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_ksb_unregister_knowledge_source", "CYBLACK-KSB-UNREGISTER-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_ksb_remove_knowledge_source", "CYBLACK-KSB-REMOVE-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_ksb_find_external_knowledge_source", "CYBLACK-KSB-FIND-EXTERNAL-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_ksbt_get_dictionary", "CYBLACK-KSBT-GET-DICTIONARY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ksb_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ksb_file() {
                interfaces.new_interface(CYBLACK_KNOWLEDGE_SOURCE_BATTERY, $list_alt1, $list_alt2, $list_alt3);
        interfaces.new_interface(CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt5, $list_alt6, $list_alt7);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt9, NIL, $list_alt10);
        interfaces.interfaces_add_interface_instance_method(REGISTER_KNOWLEDGE_SOURCE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt13, $list_alt14);
        interfaces.interfaces_add_interface_instance_method(COMPLETE_KNOWLEDGE_SOURCE_REGISTRATION, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt9, NIL, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(UNREGISTER_KNOWLEDGE_SOURCE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt13, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(UNREGISTER_ALL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt20);
        interfaces.interfaces_add_interface_instance_method(GET_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt22, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt25);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt27);
        interfaces.interfaces_add_interface_instance_method(HAS_EXTERNAL_KNOWLEDGE_SOURCES_P, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt29);
        interfaces.interfaces_add_interface_instance_method(MONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt22, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(UNMONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt22, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(MONITOR_ALL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt34);
        interfaces.interfaces_add_interface_instance_method(UNMONITOR_ALL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt34);
        interfaces.interfaces_add_interface_instance_method(LINK_KNOWLEDGE_SOURCES_TO_PANELS, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt37);
        interfaces.interfaces_add_interface_instance_method(UNLINK_KNOWLEDGE_SOURCE, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt13, $list_alt39);
        interfaces.interfaces_add_interface_instance_method(UNLINKED_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt41);
        interfaces.interfaces_add_interface_instance_method(UNLINKED_KNOWLEDGE_SOURCES_IN_WANT_OF_INVITATIONS, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt43);
        interfaces.interfaces_add_interface_instance_method(UNLINKED_KNOWLEDGE_SOURCES_WAITING_FOR_REPLY, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt45);
        interfaces.interfaces_add_interface_instance_method(INVITE_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt47);
        interfaces.interfaces_add_interface_instance_method(KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt49, $list_alt50);
        interfaces.interfaces_add_interface_instance_method(KNOWLEDGE_SOURCE_INSTANCE_GIVEN_CLASS, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, $list_alt52, $list_alt53);
        interfaces.interfaces_add_interface_instance_method(GET_EXTERNAL_MODULE_PORT_IDS, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt55);
        interfaces.interfaces_add_interface_instance_method(ON_STARTUP, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt57);
        interfaces.interfaces_add_interface_instance_method(ON_SHUTDOWN, CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $list_alt12, NIL, $list_alt59);
        classes.subloop_new_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_OBJECT, $list_alt62, NIL, $list_alt63);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, NIL);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ON_SHUTDOWN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(KNOWLEDGE_SOURCE_INSTANCE_GIVEN_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt52, $list_alt53);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KNOWLEDGE_SOURCE_INSTANCE_GIVEN_CLASS, $sym76$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_KNOWLEDGE_SOURCE_INSTANCE_);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_PORT_IDS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_EXTERNAL_MODULE_PORT_IDS, $sym77$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_EXTERNAL_MODULE_PORT_I);
        methods.methods_incorporate_instance_method(KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt49, $list_alt50);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID, $sym78$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_KNOWLEDGE_SOURCE_GIVEN_INV);
        methods.methods_incorporate_instance_method(INVITE_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INVITE_EXTERNAL_KNOWLEDGE_SOURCES, $sym79$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INVITE_EXTERNAL_KNOWLEDGE_);
        methods.methods_incorporate_instance_method(UNLINKED_KNOWLEDGE_SOURCES_WAITING_FOR_REPLY, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNLINKED_KNOWLEDGE_SOURCES_WAITING_FOR_REPLY, $sym80$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES);
        methods.methods_incorporate_instance_method(UNLINKED_KNOWLEDGE_SOURCES_IN_WANT_OF_INVITATIONS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNLINKED_KNOWLEDGE_SOURCES_IN_WANT_OF_INVITATIONS, $sym81$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES);
        methods.methods_incorporate_instance_method(UNLINKED_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt41);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNLINKED_KNOWLEDGE_SOURCES, $sym82$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES);
        methods.methods_incorporate_instance_method(UNLINK_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt13, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNLINK_KNOWLEDGE_SOURCE, $sym84$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINK_KNOWLEDGE_SOURCE_ME);
        methods.methods_incorporate_instance_method(LINK_KNOWLEDGE_SOURCES_TO_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt37);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, LINK_KNOWLEDGE_SOURCES_TO_PANELS, $sym88$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_LINK_KNOWLEDGE_SOURCES_TO_);
        methods.methods_incorporate_instance_method(UNMONITOR_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNMONITOR_ALL_KNOWLEDGE_SOURCES, $sym89$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_ALL_KNOWLEDGE_SO);
        methods.methods_incorporate_instance_method(MONITOR_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, MONITOR_ALL_KNOWLEDGE_SOURCES, $sym90$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_ALL_KNOWLEDGE_SOUR);
        methods.methods_incorporate_instance_method(UNMONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt22, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNMONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, $sym91$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(MONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt22, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, MONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, $sym92$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_KNOWLEDGE_SOURCES_);
        methods.methods_incorporate_instance_method(HAS_EXTERNAL_KNOWLEDGE_SOURCES_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, HAS_EXTERNAL_KNOWLEDGE_SOURCES_P, $sym93$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_HAS_EXTERNAL_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES, $sym94$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_EXTERNAL_KNOWLEDGE);
        methods.methods_incorporate_instance_method(GET_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_ALL_KNOWLEDGE_SOURCES, $sym95$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_KNOWLEDGE_SOURCES_);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE, $sym96$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_KNOWLEDGE_SOURCES_STIM);
        methods.methods_incorporate_instance_method(UNREGISTER_ALL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNREGISTER_ALL_KNOWLEDGE_SOURCES, $sym98$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNREGISTER_ALL_KNOWLEDGE_S);
        methods.methods_incorporate_instance_method(UNREGISTER_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt13, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNREGISTER_KNOWLEDGE_SOURCE, $sym101$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNREGISTER_KNOWLEDGE_SOURC);
        methods.methods_incorporate_instance_method(COMPLETE_KNOWLEDGE_SOURCE_REGISTRATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, COMPLETE_KNOWLEDGE_SOURCE_REGISTRATION, $sym104$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_COMPLETE_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(REGISTER_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt13, $list_alt14);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, REGISTER_KNOWLEDGE_SOURCE, $sym105$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REGISTER_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INITIALIZE_QUA_CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE, $sym106$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_QUA_CYBLACK_KNO);
        methods.methods_incorporate_instance_method(SWAP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt108, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SWAP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SWAP_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EMPTY_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt119);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, REVERSE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt122, $list_alt123);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, APPEND, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt130, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, POSITION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt134, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt138, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt142);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, BUT_LAST, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, POP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt148, $list_alt149);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, PUSH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PUSH_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt130, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, MEMBER_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, REMOVE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt148, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, CLEAR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(FIND_NTH_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt138, $list_alt165);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIND_NTH_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method(FIND_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt130, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIND_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method(REVERSE_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, REVERSE_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt171, $list_alt175);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, DELETE_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt181, $list_alt182);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt186);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt108, $list_alt189);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_EQUAL_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ELEMENT_EQUAL_P_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $sym193$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTER);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $sym198$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTER);
        subloop_reserved_initialize_cyblack_basic_knowledge_source_battery_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt200);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_ELEMENT_EQUALITY_PREDICATE, $sym202$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ELEMENT_EQUALITY_PREDI);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt204, $list_alt205);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_ELEMENT_EQUALITY_PREDICATE, $sym207$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_ELEMENT_EQUALITY_PREDI);
        methods.methods_incorporate_instance_method(SET_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt209, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(INC_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt214);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INC_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEC_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, DEC_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_FIRST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt226, $list_alt227);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_FIRST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt231);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_LAST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_LAST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt235, $list_alt236);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_LAST_LINK, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_ELEMENT_COUNT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt243);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ALLOCATE_ENUMERATOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt248, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, DEALLOCATE_ENUMERATOR, $sym250$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DEALLOCATE_ENUMERATOR_METH);
        methods.methods_incorporate_instance_method(GET_DICTIONARY, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_DICTIONARY, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(SET_DICTIONARY, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, $list_alt256, $list_alt257);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_DICTIONARY, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt9, NIL, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt265, $list_alt266);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, PRINT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt275, NIL, $list_alt276);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt275, $list_alt278, $list_alt279);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, SET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt282, $list_alt283);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, $sym285$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_INTERNAL_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt282, $list_alt287);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, $sym289$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EXTERNAL_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(ADD_INTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt291, $list_alt292);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD_INTERNAL_KNOWLEDGE_SOURCE, $sym294$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_INTERNAL_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(ADD_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt291, $list_alt296);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD_EXTERNAL_KNOWLEDGE_SOURCE, $sym298$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EXTERNAL_KNOWLEDGE_SOU);
        methods.methods_incorporate_instance_method(ADD_EKSC_TO_PORT_ID_ASSOCIATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt300, $list_alt301);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ADD_EKSC_TO_PORT_ID_ASSOCIATION, $sym303$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EKSC_TO_PORT_ID_ASSOCI);
        methods.methods_incorporate_instance_method(PORT_ID_GIVEN_EKSC, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt305, $list_alt306);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, PORT_ID_GIVEN_EKSC, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PORT_ID_GIVEN_EKSC_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_PORT_IDS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt310);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, GET_ALL_PORT_IDS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_PORT_IDS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt13, $list_alt314);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, REMOVE_KNOWLEDGE_SOURCE, $sym315$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REMOVE_KNOWLEDGE_SOURCE_ME);
        methods.methods_incorporate_instance_method(FIND_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt317, $list_alt318);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIND_EXTERNAL_KNOWLEDGE_SOURCE, $sym319$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_EXTERNAL_KNOWLEDGE_SO);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt320);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ON_STARTUP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(MONITOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt324, $list_alt325);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, MONITOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(UNMONITOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, $list_alt324, $list_alt328);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, UNMONITOR, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_METHOD);
        methods.methods_incorporate_instance_method(STORE_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt331);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORE_KNOWLEDGE_SOURCES, $sym333$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_STORE_KNOWLEDGE_SOURCES_ME);
        methods.methods_incorporate_instance_method(RESTORE_KNOWLEDGE_SOURCES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt275, NIL, $list_alt335);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, RESTORE_KNOWLEDGE_SOURCES, $sym336$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_RESTORE_KNOWLEDGE_SOURCES_);
        methods.methods_incorporate_instance_method(RESET, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, $list_alt12, NIL, $list_alt338);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, RESET, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_RESET_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), list(makeSymbol("KS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), list(makeSymbol("KS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), list(makeSymbol("EKSC"), makeSymbol("PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PORT-ID-GIVEN-EKSC"), list(makeSymbol("EKSC")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-PORT-IDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINK-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID"), list(makeSymbol("TID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-PORT-IDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-INSTANCE-GIVEN-CLASS"), list(makeSymbol("SYMBOLIC-CLASS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STORE-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESTORE-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE");

    static private final SubLList $list_alt5 = list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"));

    static private final SubLList $list_alt6 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE")));

    static private final SubLList $list_alt7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_KNOWLEDGE_SOURCE_BATTERY_TEMPLATE = makeSymbol("INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE");

    static private final SubLList $list_alt9 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("SET-DICTIONARY"), makeSymbol("SELF"), list(makeSymbol("NEW-DICTIONARY"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol REGISTER_KNOWLEDGE_SOURCE = makeSymbol("REGISTER-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt12 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt13 = list(makeSymbol("KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt14 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), makeString("(REGISTER-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER-P"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol COMPLETE_KNOWLEDGE_SOURCE_REGISTRATION = makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION");

    static private final SubLList $list_alt16 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-PATTERN-BASED-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-TYPES-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KS"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TYPES-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-TYPES-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DATATYPES"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-DATATYPES")), list(makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-KS"))))))))))), list(RET, NIL));

    private static final SubLSymbol UNREGISTER_KNOWLEDGE_SOURCE = makeSymbol("UNREGISTER-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt18 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), makeString("(UNREGISTER-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("MEMBER-P"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), makeString("(UNREGISTER-KNOWLEDGE-SOURCE ~S): ~S is not contained within this knowledge source battery."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DATATYPES-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES")))), list(makeSymbol("TEMPLATE-UNIQUE-DATATYPES"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-DATATYPES-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-DATATYPES-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS"))), NIL))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-UNIQUE-DATATYPES")), list(makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("KNOWLEDGE-SOURCE"))))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol UNREGISTER_ALL_KNOWLEDGE_SOURCES = makeSymbol("UNREGISTER-ALL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt20 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CLEAR-DICTIONARY"), makeSymbol("TEMPLATE-DICTIONARY"))), list(makeSymbol("CLEAR"), makeSymbol("SELF"))), list(RET, NIL));

    private static final SubLSymbol GET_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE = makeSymbol("GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE");

    static private final SubLList $list_alt22 = list(makeSymbol("DATATYPE"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE")), makeString("(GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-DICTIONARY"), list(RET, list(makeSymbol("COPY-LIST"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("DATATYPE"), NIL))), list(RET, NIL))));



    static private final SubLList $list_alt25 = list(list(RET, list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))));

    private static final SubLSymbol GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES = makeSymbol("GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt27 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ALL-EXTERNAL-KNOWLEDGE-SOURCES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-ALL-EXTERNAL-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")), NIL)), list(RET, makeSymbol("TEMPLATE-ALL-EXTERNAL-KNOWLEDGE-SOURCES"))));

    private static final SubLSymbol HAS_EXTERNAL_KNOWLEDGE_SOURCES_P = makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P");

    static private final SubLList $list_alt29 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol MONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE = makeSymbol("MONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE");

    static private final SubLList $list_alt31 = list(list(makeSymbol("IGNORE"), makeSymbol("DATATYPE")), list(RET, makeSymbol("DATATYPE")));

    private static final SubLSymbol UNMONITOR_KNOWLEDGE_SOURCES_STIMULATED_BY_TYPE = makeSymbol("UNMONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE");

    private static final SubLSymbol MONITOR_ALL_KNOWLEDGE_SOURCES = makeSymbol("MONITOR-ALL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt34 = list(list(RET, NIL));

    private static final SubLSymbol UNMONITOR_ALL_KNOWLEDGE_SOURCES = makeSymbol("UNMONITOR-ALL-KNOWLEDGE-SOURCES");

    private static final SubLSymbol LINK_KNOWLEDGE_SOURCES_TO_PANELS = makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS");

    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF"))), makeSymbol("TEMPLATE-PANEL")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-DICTIONARY")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("TEMPLATE-BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PANEL"), list(QUOTE, makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE")))))))))))), list(RET, NIL));

    private static final SubLSymbol UNLINK_KNOWLEDGE_SOURCE = makeSymbol("UNLINK-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt39 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), makeString("(UNLINK-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("UNLINK-FROM-PANELS"))), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol UNLINKED_KNOWLEDGE_SOURCES = makeSymbol("UNLINKED-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt41 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-KS"), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-KS-LINKED-TO-PANELS-P"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")), NIL)), list(RET, makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"))));

    private static final SubLSymbol UNLINKED_KNOWLEDGE_SOURCES_IN_WANT_OF_INVITATIONS = makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS");

    static private final SubLList $list_alt43 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("WAITING-ON-LINK-CALLBACK-P"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("TEMPLATE-KS"))), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-KS-LINKED-TO-PANELS-P"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")), NIL)), list(RET, makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"))));

    private static final SubLSymbol UNLINKED_KNOWLEDGE_SOURCES_WAITING_FOR_REPLY = makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY");

    static private final SubLList $list_alt45 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES")), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("WAITING-ON-LINK-CALLBACK-P"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("TEMPLATE-KS")), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-KS-LINKED-TO-PANELS-P"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-KS")), NIL)), list(RET, makeSymbol("TEMPLATE-UNLINKED-KNOWLEDGE-SOURCES"))));

    private static final SubLSymbol INVITE_EXTERNAL_KNOWLEDGE_SOURCES = makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt47 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("CYBLACK-KS-LINK-TO-PANELS"), makeSymbol("TEMPLATE-KS"))), list(RET, NIL)));

    private static final SubLSymbol KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID = makeSymbol("KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID");

    static private final SubLList $list_alt49 = list(makeSymbol("TID"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("STRING-EQUAL"), makeSymbol("TID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-INVITATION-TRANSACTION-ID"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("TEMPLATE-KS")))), list(RET, makeSymbol("TEMPLATE-KS"))))), list(RET, NIL));

    private static final SubLSymbol KNOWLEDGE_SOURCE_INSTANCE_GIVEN_CLASS = makeSymbol("KNOWLEDGE-SOURCE-INSTANCE-GIVEN-CLASS");

    static private final SubLList $list_alt52 = list(makeSymbol("SYMBOLIC-CLASS-NAME"));

    static private final SubLList $list_alt53 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), makeSymbol("TRUE-CLASS")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KS"), list(makeSymbol("CSETQ"), makeSymbol("TRUE-CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("TEMPLATE-KS"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TRUE-CLASS"), makeSymbol("SYMBOLIC-CLASS-NAME")), list(RET, makeSymbol("TEMPLATE-KS")))))), list(RET, NIL));

    private static final SubLSymbol GET_EXTERNAL_MODULE_PORT_IDS = makeSymbol("GET-EXTERNAL-MODULE-PORT-IDS");

    static private final SubLList $list_alt55 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PORT-IDS"), makeSymbol("SELF")), list(makeSymbol("TEMPLATE-PORT-ID"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCES")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("TEMPLATE-KS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PORT-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PORT-ID"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("TEMPLATE-KS"))), list(makeSymbol("CPUSHNEW"), makeSymbol("TEMPLATE-PORT-ID"), makeSymbol("TEMPLATE-PORT-IDS")))), list(RET, makeSymbol("TEMPLATE-PORT-IDS"))));



    static private final SubLList $list_alt57 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("TEMPLATE-APPLICATION"))), list(makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION"), makeSymbol("SELF")), list(makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(RET, NIL));



    static private final SubLList $list_alt59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("ON-SHUTDOWN"))))), list(RET, NIL));





    static private final SubLList $list_alt62 = list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE"));

    public static final SubLObject $list_alt63 = _constant_63_initializer();

    private static final SubLSymbol STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES");



    private static final SubLSymbol KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION = makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION");

    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol KSB_DICTIONARY = makeSymbol("KSB-DICTIONARY");









    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ON-SHUTDOWN-METHOD");

    static private final SubLSymbol $sym76$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_KNOWLEDGE_SOURCE_INSTANCE_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCE-INSTANCE-GIVEN-CLASS-METHOD");

    static private final SubLSymbol $sym77$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_EXTERNAL_MODULE_PORT_I = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-EXTERNAL-MODULE-PORT-IDS-METHOD");

    static private final SubLSymbol $sym78$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_KNOWLEDGE_SOURCE_GIVEN_INV = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID-METHOD");

    static private final SubLSymbol $sym79$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INVITE_EXTERNAL_KNOWLEDGE_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INVITE-EXTERNAL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym80$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY-METHOD");

    static private final SubLSymbol $sym81$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS-METHOD");

    static private final SubLSymbol $sym82$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINKED_KNOWLEDGE_SOURCES = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINKED-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol UNLINK_FROM_PANELS = makeSymbol("UNLINK-FROM-PANELS");

    static private final SubLSymbol $sym84$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNLINK_KNOWLEDGE_SOURCE_ME = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNLINK-KNOWLEDGE-SOURCE-METHOD");







    static private final SubLSymbol $sym88$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_LINK_KNOWLEDGE_SOURCES_TO_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-LINK-KNOWLEDGE-SOURCES-TO-PANELS-METHOD");

    static private final SubLSymbol $sym89$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_ALL_KNOWLEDGE_SO = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym90$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_ALL_KNOWLEDGE_SOUR = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym91$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD");

    static private final SubLSymbol $sym92$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_KNOWLEDGE_SOURCES_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD");

    static private final SubLSymbol $sym93$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_HAS_EXTERNAL_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-HAS-EXTERNAL-KNOWLEDGE-SOURCES-P-METHOD");

    static private final SubLSymbol $sym94$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_EXTERNAL_KNOWLEDGE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym95$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_KNOWLEDGE_SOURCES_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLSymbol $sym96$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_KNOWLEDGE_SOURCES_STIM = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE-METHOD");



    static private final SubLSymbol $sym98$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNREGISTER_ALL_KNOWLEDGE_S = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNREGISTER-ALL-KNOWLEDGE-SOURCES-METHOD");





    static private final SubLSymbol $sym101$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNREGISTER_KNOWLEDGE_SOURC = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNREGISTER-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym102$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");



    static private final SubLSymbol $sym104$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_COMPLETE_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION-METHOD");

    static private final SubLSymbol $sym105$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REGISTER_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REGISTER-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym106$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_QUA_CYBLACK_KNO = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE-METHOD");



    static private final SubLList $list_alt108 = list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeString("(SWAP ~S): Cannot swap NIL elements."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LINK1"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT1"))), list(makeSymbol("LINK2"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT2")))), list(makeSymbol("MUST"), makeSymbol("LINK1"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT1")), list(makeSymbol("MUST"), makeSymbol("LINK2"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT2")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK2"))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK1"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK1")), makeSymbol("ELEMENT2")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK2")), makeSymbol("ELEMENT1")), list(RET, NIL) }));

    static private final SubLString $str_alt110$_SWAP__S___Cannot_swap_NIL_elemen = makeString("(SWAP ~S): Cannot swap NIL elements.");

    static private final SubLString $str_alt111$_SWAP__S____S_is_not_an_element_o = makeString("(SWAP ~S): ~S is not an element of this list.");





    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SWAP_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SWAP-METHOD");



    static private final SubLList $list_alt116 = list(list(RET, list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_EMPTY_P_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-EMPTY-P-METHOD");



    static private final SubLList $list_alt119 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-FIRST-LINK"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEXT-LINK")), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEXT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK"))), list(makeSymbol("REVERSE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-LINK")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-NEXT-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REVERSE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REVERSE-METHOD");



    static private final SubLList $list_alt122 = list(makeSymbol("OTHER-LIST"));

    static private final SubLList $list_alt123 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("OTHER-LIST")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("OTHER-LIST")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): Cannot append non list ~S."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(RET, makeSymbol("SELF"))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt124$_APPEND__S___Cannot_append_non_li = makeString("(APPEND ~S): Cannot append non list ~S.");







    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_APPEND_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-APPEND-METHOD");



    static private final SubLList $list_alt130 = list(makeSymbol("ELEMENT"));

    static private final SubLList $list_alt131 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LINKS"), list(RET, NIL)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("COUNT"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_POSITION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-POSITION-METHOD");



    static private final SubLList $list_alt134 = list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("TEMPLATE-CONTENT")), list(makeSymbol("GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION"), makeSymbol("TEMPLATE-CONTENT"), makeSymbol("TEMPLATE-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-LINK")))), list(RET, makeSymbol("NEW-ELEMENT")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-NTH-METHOD");



    static private final SubLList $list_alt138 = list(makeSymbol("INDEX"));

    static private final SubLList $list_alt139 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_NTH_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-NTH-METHOD");



    static private final SubLList $list_alt142 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LAST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_BUT_LAST_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-BUT-LAST-METHOD");



    static private final SubLList $list_alt145 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-FIRST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_POP_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-POP-METHOD");



    static private final SubLList $list_alt148 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt149 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PUSH_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PUSH-METHOD");



    static private final SubLList $list_alt152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(RET, list(makeSymbol("FIF"), makeSymbol("TEMPLATE-LINK"), T, NIL))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MEMBER-P-METHOD");



    static private final SubLList $list_alt155 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("PIF"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION"), makeSymbol("OLD-ELEMENT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LINK"))))), list(RET, makeSymbol("OLD-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REMOVE-METHOD");



    static private final SubLList $list_alt159 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LAST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-LAST-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-METHOD");



    static private final SubLList $list_alt162 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-CLEAR-METHOD");



    static private final SubLList $list_alt165 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNT"), makeSymbol("INDEX")), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_NTH_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-NTH-LINK-METHOD");



    static private final SubLList $list_alt168 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-LINK-METHOD");



    static private final SubLList $list_alt171 = list(makeSymbol("LINK"));

    static private final SubLList $list_alt172 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-NEXT"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), makeSymbol("TEMPLATE-NEXT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), makeSymbol("TEMPLATE-PREVIOUS")), list(RET, makeSymbol("LINK"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REVERSE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REVERSE-LINK-METHOD");



    static private final SubLList $list_alt175 = list(list(makeSymbol("MUST"), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("LINK")), makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("LINK")), list(makeSymbol("MUST"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("LINK")), makeSymbol("SELF")), makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S."), makeSymbol("SELF"), makeSymbol("LINK"), makeSymbol("SELF")), list(makeSymbol("DEC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-LAST-LINK")))), makeString("(DELETE-LINK ~S): Detected inconsistancy in list."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("LINK")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BEFORE-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-AFTER-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-BEFORE-LINK")), makeSymbol("TEMPLATE-AFTER-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-AFTER-LINK")), makeSymbol("TEMPLATE-BEFORE-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))))));

    static private final SubLString $str_alt176$_DELETE_LINK__S____S_is_not_a_val = makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL.");

    static private final SubLString $str_alt177$_DELETE_LINK__S___Link__S_is_not_ = makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S.");

    static private final SubLString $str_alt178$_DELETE_LINK__S___Detected_incons = makeString("(DELETE-LINK ~S): Detected inconsistancy in list.");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DELETE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DELETE-LINK-METHOD");



    static private final SubLList $list_alt181 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt182 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLString $str_alt183$_SET_CONTENTS__S___Cannot_set_the = makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list.");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt186 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), NIL), list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CPUSH"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-CURRENT-LINK")), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK")))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-CONTENTS")))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt189 = list(list(RET, list(EQUAL, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ELEMENT_EQUAL_P_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ELEMENT-EQUAL-P-METHOD");





    static private final SubLSymbol $sym193$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-CLASS");









    static private final SubLSymbol $sym198$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INSTANCE");



    static private final SubLList $list_alt200 = list(list(RET, makeSymbol("ELEMENT-EQUALITY-PREDICATE")));

    static private final SubLSymbol $sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym202$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ELEMENT_EQUALITY_PREDI = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt204 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list_alt205 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLSymbol $sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym207$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_ELEMENT_EQUALITY_PREDI = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt209 = list(makeSymbol("NEW-ELEMENT-COUNT"));

    static private final SubLList $list_alt210 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ELEMENT-COUNT")), makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), makeSymbol("NEW-ELEMENT-COUNT")), list(RET, makeSymbol("NEW-ELEMENT-COUNT")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt214 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ONE_INTEGER), list(makeSymbol("CINC"), makeSymbol("ELEMENT-COUNT"))), list(RET, makeSymbol("ELEMENT-COUNT")));

    static private final SubLSymbol $sym215$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt218 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CDEC"), makeSymbol("ELEMENT-COUNT"))), list(RET, makeSymbol("ELEMENT-COUNT")));

    static private final SubLSymbol $sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DEC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DEC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt222 = list(list(RET, makeSymbol("FIRST-LINK")));

    static private final SubLSymbol $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt226 = list(makeSymbol("NEW-FIRST-LINK"));

    static private final SubLList $list_alt227 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-FIRST-LINK"))), makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-FIRST-LINK")), list(RET, makeSymbol("NEW-FIRST-LINK")));

    static private final SubLSymbol $sym228$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt231 = list(list(RET, makeSymbol("LAST-LINK")));

    static private final SubLSymbol $sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-LAST-LINK-METHOD");



    static private final SubLList $list_alt235 = list(makeSymbol("NEW-LAST-LINK"));

    static private final SubLList $list_alt236 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-LAST-LINK"))), makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-LAST-LINK")));

    static private final SubLSymbol $sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-LAST-LINK-METHOD");



    static private final SubLList $list_alt240 = list(list(RET, makeSymbol("ELEMENT-COUNT")));

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ELEMENT-COUNT-METHOD");

    static private final SubLList $list_alt243 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR"))))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DLC-COPY-LINKS"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-ENUMERATOR")))));

    static private final SubLSymbol $sym244$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ALLOCATE-ENUMERATOR-METHOD");



    static private final SubLList $list_alt248 = list(makeSymbol("ENUMERATOR"));

    static private final SubLList $list_alt249 = list(list(makeSymbol("PWHEN"), list(makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P"), makeSymbol("ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym250$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_DEALLOCATE_ENUMERATOR_METH = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-DEALLOCATE-ENUMERATOR-METHOD");



    static private final SubLList $list_alt252 = list(list(RET, makeSymbol("KSB-DICTIONARY")));

    static private final SubLSymbol $sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-DICTIONARY-METHOD");



    static private final SubLList $list_alt256 = list(makeSymbol("NEW-DICTIONARY"));

    static private final SubLList $list_alt257 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-DICTIONARY")), list(makeSymbol("DICTIONARY-P"), makeSymbol("NEW-DICTIONARY"))), makeString("(SET-DICTIONARY ~S): ~S is not an instance of DICTIONARY."), makeSymbol("SELF"), makeSymbol("NEW-DICTIONARY")), list(makeSymbol("CSETQ"), makeSymbol("KSB-DICTIONARY"), makeSymbol("NEW-DICTIONARY")), list(RET, makeSymbol("NEW-DICTIONARY")));

    static private final SubLSymbol $sym258$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-DICTIONARY-METHOD");



    static private final SubLList $list_alt261 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), NIL), list(makeSymbol("INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EKSC-TO-PORT-ID-MAP"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-METHOD");



    static private final SubLList $list_alt265 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt266 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("KSB[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("KSB[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt267$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    static private final SubLString $str_alt268$KSB__ = makeString("KSB[]");

    static private final SubLString $str_alt269$KSB__S = makeString("KSB[~S");



    static private final SubLString $str_alt271$___S = makeString(", ~S");

    static private final SubLString $str_alt272$_ = makeString("]");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PRINT-METHOD");



    static private final SubLList $list_alt275 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt276 = list(list(RET, list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt278 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt279 = list(list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ENUMERATOR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))))), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-KS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("NEW-APPLICATION")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-KS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("NEW-APPLICATION")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR")))), list(RET, makeSymbol("NEW-APPLICATION")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-SET-APPLICATION-METHOD");

    private static final SubLSymbol ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLList $list_alt282 = list(makeSymbol("KS-CLASS"));

    static private final SubLList $list_alt283 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("KS-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("KS-CLASS"))), makeString("(ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS ~S): ~S is not a valid symbolic class name. ~\n     A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("KS-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SUBCLASSP"), makeSymbol("KS-CLASS"), list(QUOTE, makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE"))), makeString("(ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS ~S): ~S is not a subclass of CYBLACK-INTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS-CLASS")), list(makeSymbol("CPUSHNEW"), makeSymbol("KS-CLASS"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES")), list(RET, makeSymbol("KS-CLASS")));

    static private final SubLSymbol $sym284$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym285$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_INTERNAL_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD");

    private static final SubLSymbol ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLList $list_alt287 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("KS-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("KS-CLASS"))), makeString("(ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS ~S): ~S is not a valid symbolic class name. ~\n     A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("KS-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SUBCLASSP"), makeSymbol("KS-CLASS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE"))), makeString("(ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS ~S): ~S is not a subclass of CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS-CLASS")), list(makeSymbol("CPUSHNEW"), makeSymbol("KS-CLASS"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES")), list(RET, makeSymbol("KS-CLASS")));

    static private final SubLSymbol $sym288$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym289$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EXTERNAL_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD");

    private static final SubLSymbol ADD_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt291 = list(makeSymbol("KS"));

    static private final SubLList $list_alt292 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("KS"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("KS"), list(QUOTE, makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE")))), makeString("(ADD-INTERNAL-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-INTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS")), list(makeSymbol("PIF"), makeSymbol("APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("CPUSHNEW"), makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION"))), list(makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KS")), list(RET, makeSymbol("KS")));

    static private final SubLSymbol $sym293$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym294$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_INTERNAL_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-INTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol ADD_EXTERNAL_KNOWLEDGE_SOURCE = makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt296 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("KS"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("KS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")))), makeString("(ADD-EXTERNAL-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS")), list(makeSymbol("PIF"), makeSymbol("APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("CPUSHNEW"), makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION"))), list(makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KS")), list(RET, makeSymbol("KS")));

    static private final SubLSymbol $sym297$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym298$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EXTERNAL_KNOWLEDGE_SOU = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol ADD_EKSC_TO_PORT_ID_ASSOCIATION = makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION");

    static private final SubLList $list_alt300 = list(makeSymbol("EKSC"), makeSymbol("PORT-ID"));

    static private final SubLList $list_alt301 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("EKSC"), list(makeSymbol("SYMBOLP"), makeSymbol("EKSC")), list(makeSymbol("SUBCLASSP"), makeSymbol("EKSC"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")))), makeString("(ADD-EKS-TO-PORT-ID-ASSOCIATION ~S): ~S is not an subclass of CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("EKSC")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("INTEGERP"), makeSymbol("PORT-ID")), makeString("(ADD-EKS-TO-PORT-ID-ASSOCIATION ~S): ~S is not a valid port id.  An integer was expected."), makeSymbol("SELF"), makeSymbol("PORT-ID")), list(makeSymbol("PIF"), makeSymbol("EKSC-TO-PORT-ID-MAP"), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-ASSOCIATION"), list(makeSymbol("ASSOC"), makeSymbol("EKSC"), makeSymbol("EKSC-TO-PORT-ID-MAP")))), list(makeSymbol("PIF"), makeSymbol("CURRENT-ASSOCIATION"), list(makeSymbol("RPLACD"), makeSymbol("CURRENT-ASSOCIATION"), makeSymbol("PORT-ID")), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("EKSC"), makeSymbol("PORT-ID")), makeSymbol("EKSC-TO-PORT-ID-MAP")))), list(makeSymbol("CSETQ"), makeSymbol("EKSC-TO-PORT-ID-MAP"), list(makeSymbol("LIST"), list(makeSymbol("CONS"), makeSymbol("EKSC"), makeSymbol("PORT-ID"))))), list(RET, makeSymbol("PORT-ID")));

    static private final SubLSymbol $sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym303$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ADD_EKSC_TO_PORT_ID_ASSOCI = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ADD-EKSC-TO-PORT-ID-ASSOCIATION-METHOD");

    private static final SubLSymbol PORT_ID_GIVEN_EKSC = makeSymbol("PORT-ID-GIVEN-EKSC");

    static private final SubLList $list_alt305 = list(makeSymbol("EKSC"));

    static private final SubLList $list_alt306 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ASSOCIATION"), list(makeSymbol("ASSOC"), makeSymbol("EKSC"), makeSymbol("EKSC-TO-PORT-ID-MAP")))), list(RET, list(makeSymbol("FIF"), makeSymbol("ASSOCIATION"), list(makeSymbol("CDR"), makeSymbol("ASSOCIATION")), NIL))));

    static private final SubLSymbol $sym307$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_PORT_ID_GIVEN_EKSC_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-PORT-ID-GIVEN-EKSC-METHOD");

    private static final SubLSymbol GET_ALL_PORT_IDS = makeSymbol("GET-ALL-PORT-IDS");

    static private final SubLList $list_alt310 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PORT-IDS"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("ASSOCIATION"), makeSymbol("EKSC-TO-PORT-ID-MAP"), makeSymbol("PORT-IDS")), list(makeSymbol("FIF"), makeSymbol("EKSC-TO-PORT-ID-MAP"), list(makeSymbol("LIST"), list(makeSymbol("CDR"), makeSymbol("ASSOCIATION"))), NIL)), list(RET, makeSymbol("PORT-IDS"))));

    static private final SubLSymbol $sym311$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_GET_ALL_PORT_IDS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-GET-ALL-PORT-IDS-METHOD");

    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCE = makeSymbol("REMOVE-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt314 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), makeString("(REMOVE-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("UNLINK-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("UNREGISTER-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym315$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_REMOVE_KNOWLEDGE_SOURCE_ME = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-REMOVE-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol FIND_EXTERNAL_KNOWLEDGE_SOURCE = makeSymbol("FIND-EXTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt317 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt318 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("NAME")), makeString("(FIND-EXTERNAL-KNOWLEDGE-SOURCE ~S): ~S is not a valid name for an external knowledge source.  ~\n    A string was expected."), makeSymbol("SELF"), makeSymbol("NAME")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-KS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR")))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-KS"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("CURRENT-KS")), list(EQUAL, makeSymbol("NAME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-NAME"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("CURRENT-KS")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("CURRENT-KS"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-KS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR")))))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym319$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_FIND_EXTERNAL_KNOWLEDGE_SO = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-FIND-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt320 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("STORE-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("TEMPLATE-APPLICATION"))), list(makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION"), makeSymbol("SELF")), list(makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(RET, NIL));

    static private final SubLSymbol $sym321$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-ON-STARTUP-METHOD");



    static private final SubLList $list_alt324 = list(makeSymbol("OBJECT-MONITOR"));

    static private final SubLList $list_alt325 = list(list(makeSymbol("MONITOR"), makeSymbol("SUPER"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("OBJECT-MONITOR"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-MONITOR-METHOD");



    static private final SubLList $list_alt328 = list(list(makeSymbol("UNMONITOR"), makeSymbol("SUPER"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("OBJECT-MONITOR"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_UNMONITOR_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-UNMONITOR-METHOD");

    private static final SubLSymbol STORE_KNOWLEDGE_SOURCES = makeSymbol("STORE-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt331 = list(list(makeSymbol("CSETQ"), makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), list(makeSymbol("COPY-LIST"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES"))), list(makeSymbol("CSETQ"), makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), list(makeSymbol("COPY-LIST"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"))), list(RET, NIL));

    static private final SubLSymbol $sym332$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    static private final SubLSymbol $sym333$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_STORE_KNOWLEDGE_SOURCES_ME = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-STORE-KNOWLEDGE-SOURCES-METHOD");

    private static final SubLSymbol RESTORE_KNOWLEDGE_SOURCES = makeSymbol("RESTORE-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt335 = list(list(makeSymbol("UNREGISTER-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF"), list(makeSymbol("COPY-LIST"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF"), list(makeSymbol("COPY-LIST"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-KNOWLEDGE-SOURCES"), list(makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"))), list(makeSymbol("APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION"))), list(makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION"), makeSymbol("SELF")), list(makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), makeSymbol("SELF")), list(makeSymbol("CDOLIST"), list(makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("ALL-KNOWLEDGE-SOURCES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(RET, NIL));

    static private final SubLSymbol $sym336$CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_RESTORE_KNOWLEDGE_SOURCES_ = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-RESTORE-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt338 = list(list(makeSymbol("RESTORE-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY_RESET_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY-RESET-METHOD");

    static private final SubLString $str_alt340$CYBLACK_KSB_UNLINKED_KNOWLEDGE_SO = makeString("CYBLACK-KSB-UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt341$CYBLACK_KSB_REGISTER_KNOWLEDGE_SO = makeString("CYBLACK-KSB-REGISTER-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt342$CYBLACK_KSB_UNREGISTER_KNOWLEDGE_ = makeString("CYBLACK-KSB-UNREGISTER-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt343$CYBLACK_KSB_REMOVE_KNOWLEDGE_SOUR = makeString("CYBLACK-KSB-REMOVE-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt344$CYBLACK_KSB_FIND_EXTERNAL_KNOWLED = makeString("CYBLACK-KSB-FIND-EXTERNAL-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt345$CYBLACK_KSBT_GET_DICTIONARY___S_i = makeString("CYBLACK-KSBT-GET-DICTIONARY: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE.");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_63_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("KSB-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-KNOWLEDGE-SOURCE-BATTERY-TEMPLATE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETE-KNOWLEDGE-SOURCE-REGISTRATION"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR-KNOWLEDGE-SOURCES-STIMULATED-BY-TYPE"), list(makeSymbol("DATATYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR-ALL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINK-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-IN-WANT-OF-INVITATIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID"), list(makeSymbol("TID")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-PORT-IDS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-INSTANCE-GIVEN-CLASS"), list(makeSymbol("SYMBOLIC-CLASS-NAME")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EKSC-TO-PORT-ID-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), list(makeSymbol("KS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), list(makeSymbol("KS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), list(makeSymbol("EKSC"), makeSymbol("PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PORT-ID-GIVEN-EKSC"), list(makeSymbol("EKSC")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-PORT-IDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STORE-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESTORE-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")) });
    }

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ksb_file();
    }

    public void initializeVariables() {
        init_cyblack_ksb_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ksb_file();
    }
}

