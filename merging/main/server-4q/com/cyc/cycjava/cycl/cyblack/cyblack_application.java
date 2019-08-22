/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      CYBLACK-APPLICATION
 *  source file: /cyc/top/cycl/cyblack/cyblack-application.lisp
 *  created:     2019/07/03 17:38:45
 */
public final class cyblack_application extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_application() {
    }

    public static final SubLFile me = new cyblack_application();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_application";



    public static final SubLObject with_cyblack_application(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject application = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    application = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($cyblack_application$, application)), body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cyblack_global_posting_table$ = makeSymbol("*CYBLACK-GLOBAL-POSTING-TABLE*");

    public static final SubLObject cyblack_reset_posting_management() {
        $cyblack_global_posting_table$.setDynamicValue(object.new_class_instance(CYBLACK_GLOBAL_POSTING_TABLE));
        cyblack_posting.cyblack_basic_posting_reset_posting_id_allocator();
        return T;
    }

    public static final SubLObject cyblack_register_posting(SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_posting.cyblack_posting_p(posting)) {
                cyblack_global_posting_table.cyblack_global_posting_table_record_posting_method($cyblack_global_posting_table$.getDynamicValue(thread), posting);
            }
            return posting;
        }
    }

    public static final SubLObject cyblack_retrieve_posting(SubLObject posting_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_global_posting_table.cyblack_posting_id_p(posting_id)) {
                return cyblack_global_posting_table.cyblack_global_posting_table_retrieve_posting_method($cyblack_global_posting_table$.getDynamicValue(thread), posting_id);
            }
            return NIL;
        }
    }

    /**
     * Enumerated values of type CYBLACK-APPLICATION-COMMAND-DESTINATION.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_application_command_destinations$ = makeSymbol("*VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS*");

    /**
     * Returns a list of all valid members of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration.
     */
    public static final SubLObject valid_cyblack_application_command_destinations() {
        return $valid_cyblack_application_command_destinations$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration.
     */
    public static final SubLObject cyblack_application_command_destination_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_application_command_destinations$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_application_command_destination(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_application_command_destinations$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt6$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_APPLICATION_COMMAND_DESTINATION, value, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration.
     */
    public static final SubLObject decode_cyblack_application_command_destination(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_application_command_destinations$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt8$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_APPLICATION_COMMAND_DESTINATION, value, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration.
     */
    public static final SubLObject cyblack_application_command_destination_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_command_destination_p(value1)) {
                    Errors.error($str_alt10$_S___S_was_expected_to_be_a_membe, CYBLACK_APPLICATION_COMMAND_DESTINATION_P, value1, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_command_destination_p(value2)) {
                    Errors.error($str_alt10$_S___S_was_expected_to_be_a_membe, CYBLACK_APPLICATION_COMMAND_DESTINATION_P, value2, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_application_command_destinations$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-APPLICATION-COMMAND-DESTINATION enumeration.
     */
    public static final SubLObject cyblack_application_command_destination_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_command_destination_p(value1)) {
                    Errors.error($str_alt10$_S___S_was_expected_to_be_a_membe, CYBLACK_APPLICATION_COMMAND_DESTINATION_P, value1, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_command_destination_p(value2)) {
                    Errors.error($str_alt10$_S___S_was_expected_to_be_a_membe, CYBLACK_APPLICATION_COMMAND_DESTINATION_P, value2, CYBLACK_APPLICATION_COMMAND_DESTINATION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_application_command_destinations$.getGlobalValue();
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

    public static final SubLObject cyblack_application_p(SubLObject v_cyblack_application) {
        return interfaces.subloop_instanceof_interface(v_cyblack_application, CYBLACK_APPLICATION);
    }

    public static final SubLObject cyblack_application_after_startup_asynchronous_ks_invitations() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject self = cyblack_message_broker.$cyblack_port_manager_connect_target_application$.getDynamicValue(thread);
                SubLObject template_port_manager = methods.funcall_instance_method_with_0_args(self, GET_PORT_MANAGER);
                SubLObject template_message_broker = methods.funcall_instance_method_with_0_args(self, GET_MESSAGE_BROKER);
                if ((NIL != template_port_manager) && (NIL != template_message_broker)) {
                    methods.funcall_instance_method_with_1_args(template_port_manager, SET_MESSAGE_BROKER, template_message_broker);
                    if (NIL != subl_promotions.memberP($MULTIPLE, cyblack_globals.$cyblack_connection_modes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        cyblack_message_broker.cyblack_port_manager_connect_application(self);
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt50$__Waiting_until_external_ports_ar);
                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        cyblack_message_broker.cyblack_port_manager_wait_until_all_ports_connected_p_method(template_port_manager, $int$60);
                    }
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt52$__Inviting_external_knowledge_sou);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                methods.funcall_instance_method_with_0_args(self, INVITE_EXTERNAL_KNOWLEDGE_SOURCES);
                return NIL;
            }
        }
    }

    public static final SubLObject get_cyblack_basic_application_incoming_message_queue(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, $int$25, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject set_cyblack_basic_application_incoming_message_queue(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, $int$25, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject get_cyblack_basic_application_application_id(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, $int$24, APPLICATION_ID);
    }

    public static final SubLObject set_cyblack_basic_application_application_id(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, $int$24, APPLICATION_ID);
    }

    public static final SubLObject get_cyblack_basic_application_result(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, $int$23, RESULT);
    }

    public static final SubLObject set_cyblack_basic_application_result(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, $int$23, RESULT);
    }

    public static final SubLObject get_cyblack_basic_application_external_module_table(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, $int$22, EXTERNAL_MODULE_TABLE);
    }

    public static final SubLObject set_cyblack_basic_application_external_module_table(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, $int$22, EXTERNAL_MODULE_TABLE);
    }

    public static final SubLObject get_cyblack_basic_application_port_manager(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, $int$21, PORT_MANAGER);
    }

    public static final SubLObject set_cyblack_basic_application_port_manager(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, $int$21, PORT_MANAGER);
    }

    public static final SubLObject get_cyblack_basic_application_message_broker_class(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, TWENTY_INTEGER, MESSAGE_BROKER_CLASS);
    }

    public static final SubLObject set_cyblack_basic_application_message_broker_class(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, TWENTY_INTEGER, MESSAGE_BROKER_CLASS);
    }

    public static final SubLObject get_cyblack_basic_application_parser_class(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, NINETEEN_INTEGER, PARSER_CLASS);
    }

    public static final SubLObject set_cyblack_basic_application_parser_class(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, NINETEEN_INTEGER, PARSER_CLASS);
    }

    public static final SubLObject get_cyblack_basic_application_connection_class(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, EIGHTEEN_INTEGER, CONNECTION_CLASS);
    }

    public static final SubLObject set_cyblack_basic_application_connection_class(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, EIGHTEEN_INTEGER, CONNECTION_CLASS);
    }

    public static final SubLObject get_cyblack_basic_application_blackboard_class(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, SEVENTEEN_INTEGER, BLACKBOARD_CLASS);
    }

    public static final SubLObject set_cyblack_basic_application_blackboard_class(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, SEVENTEEN_INTEGER, BLACKBOARD_CLASS);
    }

    public static final SubLObject get_cyblack_basic_application_agenda_class(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, SIXTEEN_INTEGER, AGENDA_CLASS);
    }

    public static final SubLObject set_cyblack_basic_application_agenda_class(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, SIXTEEN_INTEGER, AGENDA_CLASS);
    }

    public static final SubLObject get_cyblack_basic_application_root_datatype_name(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, FIFTEEN_INTEGER, ROOT_DATATYPE_NAME);
    }

    public static final SubLObject set_cyblack_basic_application_root_datatype_name(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, FIFTEEN_INTEGER, ROOT_DATATYPE_NAME);
    }

    public static final SubLObject get_cyblack_basic_application_root_datatype(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, FOURTEEN_INTEGER, ROOT_DATATYPE);
    }

    public static final SubLObject set_cyblack_basic_application_root_datatype(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, FOURTEEN_INTEGER, ROOT_DATATYPE);
    }

    public static final SubLObject get_cyblack_basic_application_external_connection(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, THIRTEEN_INTEGER, EXTERNAL_CONNECTION);
    }

    public static final SubLObject set_cyblack_basic_application_external_connection(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, THIRTEEN_INTEGER, EXTERNAL_CONNECTION);
    }

    public static final SubLObject get_cyblack_basic_application_message_broker(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, TWELVE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_basic_application_message_broker(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, TWELVE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject get_cyblack_basic_application_current_session(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, ELEVEN_INTEGER, CURRENT_SESSION);
    }

    public static final SubLObject set_cyblack_basic_application_current_session(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, ELEVEN_INTEGER, CURRENT_SESSION);
    }

    public static final SubLObject get_cyblack_basic_application_datatype_dictionary(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, TEN_INTEGER, DATATYPE_DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_application_datatype_dictionary(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, TEN_INTEGER, DATATYPE_DICTIONARY);
    }

    public static final SubLObject get_cyblack_basic_application_parser(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, NINE_INTEGER, PARSER);
    }

    public static final SubLObject set_cyblack_basic_application_parser(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, NINE_INTEGER, PARSER);
    }

    public static final SubLObject get_cyblack_basic_application_agenda(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, EIGHT_INTEGER, AGENDA);
    }

    public static final SubLObject set_cyblack_basic_application_agenda(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, EIGHT_INTEGER, AGENDA);
    }

    public static final SubLObject get_cyblack_basic_application_blackboard(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, SEVEN_INTEGER, BLACKBOARD);
    }

    public static final SubLObject set_cyblack_basic_application_blackboard(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, SEVEN_INTEGER, BLACKBOARD);
    }

    public static final SubLObject get_cyblack_basic_application_knowledge_source_battery(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, SIX_INTEGER, KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject set_cyblack_basic_application_knowledge_source_battery(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, SIX_INTEGER, KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject get_cyblack_basic_application_application_name(SubLObject cyblack_basic_application) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_application, FIVE_INTEGER, APPLICATION_NAME);
    }

    public static final SubLObject set_cyblack_basic_application_application_name(SubLObject cyblack_basic_application, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_application, value, FIVE_INTEGER, APPLICATION_NAME);
    }

    public static final SubLObject get_cyblack_basic_application_halt_status(SubLObject cyblack_basic_application) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_application);
            SubLObject slot = slots.slot_assoc(HALT_STATUS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_application, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_application));
    }

    public static final SubLObject set_cyblack_basic_application_halt_status(SubLObject cyblack_basic_application, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_application);
            SubLObject slot = slots.slot_assoc(HALT_STATUS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_application, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_application, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_application)));
        return value;
    }

    public static final SubLObject cyblack_basic_application_reset_method(SubLObject self, SubLObject command_destinations) {
        if (command_destinations == UNPROVIDED) {
            command_destinations = $valid_cyblack_application_command_destinations$.getGlobalValue();
        }
        {
            SubLObject cdolist_list_var = command_destinations;
            SubLObject command_destination = NIL;
            for (command_destination = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , command_destination = cdolist_list_var.first()) {
                if (command_destination.isString()) {
                    {
                        SubLObject target_panel = cyblack_basic_application_find_panel_method(self, command_destination);
                        if (NIL != target_panel) {
                            methods.funcall_instance_method_with_0_args(target_panel, REMOVE_DIRECT_POSTINGS);
                        }
                    }
                } else {
                    {
                        SubLObject pcase_var = command_destination;
                        if (pcase_var.eql($BLACKBOARD)) {
                            {
                                SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
                                methods.funcall_instance_method_with_0_args(template_blackboard, RESET);
                            }
                        } else
                            if (pcase_var.eql($AGENDA)) {
                                {
                                    SubLObject template_agenda = cyblack_basic_application_get_agenda_method(self);
                                    methods.funcall_instance_method_with_0_args(template_agenda, RESET);
                                }
                            } else
                                if (pcase_var.eql($KNOWLEDGE_SOURCE_BATTERY)) {
                                    {
                                        SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
                                        methods.funcall_instance_method_with_0_args(template_ksb, RESET);
                                    }
                                }


                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_on_quiescence_method(SubLObject self) {
        {
            SubLObject template_quiescence_panel = cyblack_basic_application_find_panel_method(self, $str_alt109$INTERNAL_QUIESCENCE);
            if (NIL != template_quiescence_panel) {
                {
                    SubLObject template_datatype = cyblack_panel_dispatch_functions.cyblack_panel_get_datatype(template_quiescence_panel);
                    if (NIL != template_datatype) {
                        {
                            SubLObject template_posting = cyblack_datatype.cyblack_datatype_create_posting(template_datatype);
                            if (NIL != template_posting) {
                                methods.funcall_instance_method_with_1_args(template_posting, SET_APPLICATION, self);
                                {
                                    SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
                                    if (NIL != template_blackboard) {
                                        cyblack_blackboard.cyblack_blackboard_post(template_blackboard, template_posting);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_close_all_external_ports_method(SubLObject self) {
        {
            SubLObject template_port_manager = cyblack_basic_application_get_port_manager_method(self);
            if (NIL != template_port_manager) {
                methods.funcall_instance_method_with_0_args(template_port_manager, CLOSE_ALL_PORTS);
            }
            return T;
        }
    }

    public static final SubLObject cyblack_basic_application_create_posting_method(SubLObject self, SubLObject datatype_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!datatype_name.isString()) {
                    Errors.error($str_alt114$_CREATE_POSTING__S____S_is_not_a_, self, datatype_name);
                }
            }
            {
                SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_datatype_dictionary) {
                        Errors.error($str_alt115$_CREATE_POSTING__S___No_datatype_, self, self);
                    }
                }
                {
                    SubLObject template_datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, datatype_name, UNPROVIDED);
                    SubLObject posting = cyblack_datatype.cyblack_datatype_create_posting(template_datatype);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == posting) {
                            Errors.error($str_alt116$_CREATE_POSTING__S___Datatype__S_, self, template_datatype);
                        }
                    }
                    methods.funcall_instance_method_with_1_args(posting, SET_APPLICATION, self);
                    return posting;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_application_after_agenda_execute_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_before_agenda_execute_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_on_empty_agenda_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_run_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt121$__Running_Application_);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            {
                SubLObject template_agenda = cyblack_basic_application_get_agenda_method(self);
                cyblack_reset_posting_management();
                methods.funcall_instance_method_with_0_args(self, ON_STARTUP);
                methods.funcall_instance_method_with_0_args(self, AFTER_STARTUP);
                if (NIL != methods.funcall_instance_method_with_0_args(template_agenda, EMPTY_P)) {
                    methods.funcall_instance_method_with_0_args(self, ON_EMPTY_AGENDA);
                }
                while (NIL == cyblack_basic_application_halted_p_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, BEFORE_AGENDA_EXECUTE);
                    methods.funcall_instance_method_with_0_args(template_agenda, EXECUTE);
                    methods.funcall_instance_method_with_0_args(self, AFTER_AGENDA_EXECUTE);
                    if (NIL != methods.funcall_instance_method_with_0_args(template_agenda, EMPTY_P)) {
                        methods.funcall_instance_method_with_0_args(self, ON_EMPTY_AGENDA);
                    }
                } 
                methods.funcall_instance_method_with_0_args(self, ON_SHUTDOWN);
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_on_halt_and_abort_server_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_on_halt_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_on_shutdown_method(SubLObject self) {
        {
            SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
            if (NIL != template_ksb) {
                methods.funcall_instance_method_with_0_args(template_ksb, ON_SHUTDOWN);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_after_startup_method(SubLObject self) {
        cyblack_message_broker.$cyblack_port_manager_connect_target_application$.setDynamicValue(self);
        cyblack_processes.cyblack_make_process(cyblack_basic_application_get_application_id_method(self), $str_alt128$AFTER_STARTUP, CYBLACK_APPLICATION_AFTER_STARTUP_ASYNCHRONOUS_KS_INVITATIONS);
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_on_startup_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_object.cyblack_object_on_startup_method(self);
            if (NIL != subl_promotions.memberP($MULTIPLE, cyblack_globals.$cyblack_connection_modes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject templated_port_manager = cyblack_basic_application_get_port_manager_method(self);
                    if (NIL != templated_port_manager) {
                        cyblack_message_broker.cyblack_start_port_manager(templated_port_manager);
                    }
                }
            }
            {
                SubLObject template_message_broker = cyblack_basic_application_get_message_broker_method(self);
                if (NIL != template_message_broker) {
                    methods.funcall_instance_method_with_0_args(template_message_broker, ON_STARTUP);
                }
            }
            {
                SubLObject template_agenda = cyblack_basic_application_get_agenda_method(self);
                if (NIL != template_agenda) {
                    methods.funcall_instance_method_with_1_args(template_agenda, SET_APPLICATION, self);
                    methods.funcall_instance_method_with_0_args(template_agenda, ON_STARTUP);
                }
            }
            {
                SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
                if (NIL != template_blackboard) {
                    methods.funcall_instance_method_with_1_args(template_blackboard, SET_APPLICATION, self);
                    methods.funcall_instance_method_with_0_args(template_blackboard, ON_STARTUP);
                }
            }
            {
                SubLObject template_parser = cyblack_basic_application_get_parser_method(self);
                if (NIL != template_parser) {
                    methods.funcall_instance_method_with_1_args(template_parser, SET_APPLICATION, self);
                    methods.funcall_instance_method_with_0_args(template_parser, ON_STARTUP);
                }
            }
            {
                SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
                if (NIL != template_ksb) {
                    methods.funcall_instance_method_with_1_args(template_ksb, SET_APPLICATION, self);
                    methods.funcall_instance_method_with_0_args(template_ksb, ON_STARTUP);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_invite_external_knowledge_sources_method(SubLObject self) {
        {
            SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
            if (NIL == template_ksb) {
                Errors.warn($str_alt132$_INVITE_EXTERNAL_KNOWLEDGE_SOURCE, self);
                return NIL;
            }
            methods.funcall_instance_method_with_0_args(template_ksb, INVITE_EXTERNAL_KNOWLEDGE_SOURCES);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_declare_standard_timer_panels_method(SubLObject self, SubLObject timer_intervals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_timer_panel.cyblack_timer_interval_list_p(timer_intervals)) {
                    Errors.error($str_alt134$_DECLARE_STANDARD_TIMER_PANELS__S, self, timer_intervals);
                }
            }
            cyblack_basic_application_declare_subtype_method(self, $$$TIMER, $$$POSTING, CYBLACK_TIMER_POSTING, CYBLACK_TIMER_PANEL);
            {
                SubLObject template_interval = NIL;
                SubLObject template_sublist = NIL;
                for (template_sublist = timer_intervals; NIL != template_sublist; template_sublist = template_sublist.rest()) {
                    template_interval = template_sublist.first();
                    if (NIL == subl_promotions.memberP(template_interval, template_sublist, UNPROVIDED, UNPROVIDED)) {
                        cyblack_basic_application_declare_subtype_method(self, cyblack_timer_panel.cyblack_time_interval_to_type_name(template_interval), $$$TIMER, cyblack_timer_panel.cyblack_time_interval_to_posting(template_interval), cyblack_timer_panel.cyblack_time_interval_to_panel(template_interval));
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_application_get_panel_type_method(SubLObject self, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!type.isString()) {
                    Errors.error($str_alt140$_GET_PANEL_TYPE__S____S_is_not_a_, self, type);
                }
            }
            {
                SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_datatype_dictionary) {
                        Errors.error($str_alt141$_GET_PANEL_TYPE__S___No_datatype_, self, self);
                    }
                }
                {
                    SubLObject template_datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, type, UNPROVIDED);
                    return cyblack_datatype.cyblack_datatype_get_panel_type(template_datatype);
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_application_override_panel_type_method(SubLObject self, SubLObject type, SubLObject panel_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!type.isString()) {
                    Errors.error($str_alt143$_OVERRIDE_PANEL_TYPE__S____S_is_n, self, type);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != panel_class) && panel_class.isSymbol())) {
                    Errors.error($str_alt144$_OVERRIDE_PANEL_TYPE__S____S_is_n, self, panel_class);
                }
            }
            {
                SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_datatype_dictionary) {
                        Errors.error($str_alt145$_OVERRIDE_PANEL_TYPE__S___No_data, self, self);
                    }
                }
                {
                    SubLObject template_datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, type, UNPROVIDED);
                    cyblack_datatype.cyblack_datatype_set_panel_type(template_datatype, panel_class);
                    return panel_class;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_application_declare_subtype_method(SubLObject self, SubLObject subtype, SubLObject supertype, SubLObject posting_class, SubLObject panel_class) {
        if (supertype == UNPROVIDED) {
            supertype = $$$POSTING;
        }
        if (posting_class == UNPROVIDED) {
            posting_class = CYBLACK_BASIC_POSTING;
        }
        if (panel_class == UNPROVIDED) {
            panel_class = CYBLACK_BASIC_PANEL;
        }
        {
            SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
            SubLObject subtype_datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, subtype, UNPROVIDED);
            SubLObject supertype_datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, supertype, UNPROVIDED);
            cyblack_datatype.cyblack_declare_subtype_relation(subtype_datatype, supertype_datatype);
            cyblack_datatype.cyblack_datatype_set_posting_type(subtype_datatype, posting_class);
            cyblack_datatype.cyblack_datatype_set_panel_type(subtype_datatype, panel_class);
            return subtype_datatype;
        }
    }

    public static final SubLObject cyblack_basic_application_declare_subtype_relations_method(SubLObject self, SubLObject subtype_relation_tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_dictionary.cyblack_subtype_relation_tree_p(subtype_relation_tree)) {
                    Errors.error($str_alt150$_DECLARE_SUBTYPE_RELATIONS__S____, self, subtype_relation_tree);
                }
            }
            {
                SubLObject template_root_datatype_name = cyblack_basic_application_get_root_datatype_name_method(self);
                if (!subtype_relation_tree.first().equal(template_root_datatype_name)) {
                    subtype_relation_tree = list(template_root_datatype_name, subtype_relation_tree);
                }
            }
            {
                SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
                if (NIL != template_datatype_dictionary) {
                    cyblack_datatype_dictionary.cyblack_declare_subtype_relation_tree_by_names(template_datatype_dictionary, subtype_relation_tree);
                    return T;
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_method(SubLObject self) {
        cyblack_basic_application_uninstall_knowledge_source_battery_method(self);
        cyblack_basic_application_uninstall_blackboard_method(self);
        cyblack_basic_application_uninstall_agenda_method(self);
        cyblack_basic_application_uninstall_parser_method(self);
        cyblack_object.cyblack_object_uninstall_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_application_get_application_method(SubLObject self) {
        return self;
    }

    public static final SubLObject cyblack_basic_application_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject application_name = get_cyblack_basic_application_application_name(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    {
                        SubLObject class_name = subloop_structures.class_name(subloop_structures.instance_class(self));
                        SubLObject application_name_1 = cyblack_basic_application_get_application_name_method(self);
                        format(stream, $str_alt155$___S__A___S_, new SubLObject[]{ class_name, application_name_1, instance_number });
                        sublisp_throw($sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_application_name(self, application_name);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_application_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_application_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_p(SubLObject cyblack_basic_application) {
        return classes.subloop_instanceof_class(cyblack_basic_application, CYBLACK_BASIC_APPLICATION);
    }

    public static final SubLObject cyblack_basic_application_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_basic_application_incoming_message_queue(self);
            SubLObject external_module_table = get_cyblack_basic_application_external_module_table(self);
            SubLObject message_broker_class = get_cyblack_basic_application_message_broker_class(self);
            SubLObject parser_class = get_cyblack_basic_application_parser_class(self);
            SubLObject connection_class = get_cyblack_basic_application_connection_class(self);
            SubLObject blackboard_class = get_cyblack_basic_application_blackboard_class(self);
            SubLObject agenda_class = get_cyblack_basic_application_agenda_class(self);
            SubLObject root_datatype_name = get_cyblack_basic_application_root_datatype_name(self);
            SubLObject root_datatype = get_cyblack_basic_application_root_datatype(self);
            SubLObject current_session = get_cyblack_basic_application_current_session(self);
            SubLObject datatype_dictionary = get_cyblack_basic_application_datatype_dictionary(self);
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            SubLObject blackboard = get_cyblack_basic_application_blackboard(self);
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            SubLObject application_name = get_cyblack_basic_application_application_name(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject halt_status = get_cyblack_basic_application_halt_status(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    set_cyblack_basic_application_application_id(self, cyblack_processes.cyblack_allocate_application_id());
                    incoming_message_queue = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                    external_module_table = cyblack_external_module_table.new_external_module_table(self);
                    agenda_class = CYBLACK_BASIC_SIMPLE_AGENDA;
                    blackboard_class = CYBLACK_BASIC_BLACKBOARD;
                    connection_class = CYBLACK_STANDARD_EXTERNAL_CONNECTION;
                    parser_class = CYBLACK_PARSER;
                    message_broker_class = CYBLACK_MESSAGE_BROKER;
                    halt_status = NIL;
                    application = self;
                    application_name = $str_alt178$;
                    knowledge_source_battery = NIL;
                    blackboard = NIL;
                    v_agenda = NIL;
                    datatype_dictionary = methods.funcall_class_method_with_0_args(CYBLACK_BASIC_DATATYPE_DICTIONARY, NEW);
                    methods.funcall_instance_method_with_1_args(datatype_dictionary, SET_APPLICATION, self);
                    root_datatype_name = $$$POSTING;
                    root_datatype = cyblack_datatype_dictionary.cyblack_declare_root_type(datatype_dictionary, root_datatype_name, CYBLACK_BASIC_POSTING, CYBLACK_BASIC_PANEL);
                    current_session = methods.funcall_class_method_with_0_args(CYBLACK_SESSION, NEW);
                    methods.funcall_instance_method_with_1_args(current_session, SET_APPLICATION, self);
                    sublisp_throw($sym171$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_incoming_message_queue(self, incoming_message_queue);
                            set_cyblack_basic_application_external_module_table(self, external_module_table);
                            set_cyblack_basic_application_message_broker_class(self, message_broker_class);
                            set_cyblack_basic_application_parser_class(self, parser_class);
                            set_cyblack_basic_application_connection_class(self, connection_class);
                            set_cyblack_basic_application_blackboard_class(self, blackboard_class);
                            set_cyblack_basic_application_agenda_class(self, agenda_class);
                            set_cyblack_basic_application_root_datatype_name(self, root_datatype_name);
                            set_cyblack_basic_application_root_datatype(self, root_datatype);
                            set_cyblack_basic_application_current_session(self, current_session);
                            set_cyblack_basic_application_datatype_dictionary(self, datatype_dictionary);
                            set_cyblack_basic_application_agenda(self, v_agenda);
                            set_cyblack_basic_application_blackboard(self, blackboard);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                            set_cyblack_basic_application_application_name(self, application_name);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_basic_application_halt_status(self, halt_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym171$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_standard_initialization_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cyblack_globals.$cyblack_server_initialized$.getDynamicValue(thread)) {
                cyblack_globals.cyblack_create_server_queues();
                cyblack_globals.$cyblack_server_initialized$.setDynamicValue(T, thread);
            }
            {
                SubLObject message_broker_class = cyblack_basic_application_get_message_broker_class_method(self);
                if (NIL != message_broker_class) {
                    {
                        SubLObject new_message_broker = object.new_class_instance(message_broker_class);
                        cyblack_basic_application_install_message_broker_method(self, new_message_broker);
                        {
                            SubLObject connection_class = cyblack_basic_application_get_connection_class_method(self);
                            if (NIL != connection_class) {
                                {
                                    SubLObject connection = object.new_class_instance(connection_class);
                                    methods.funcall_instance_method_with_1_args(connection, SET_APPLICATION, self);
                                    methods.funcall_instance_method_with_1_args(connection, ASSIGN_MESSAGE_BROKER, new_message_broker);
                                    cyblack_basic_application_install_external_connection_method(self, connection);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject agenda_class = cyblack_basic_application_get_agenda_class_method(self);
                if (NIL != agenda_class) {
                    cyblack_basic_application_install_agenda_method(self, object.new_class_instance(agenda_class));
                }
            }
            {
                SubLObject blackboard_class = cyblack_basic_application_get_blackboard_class_method(self);
                if (NIL != blackboard_class) {
                    cyblack_basic_application_install_blackboard_method(self, object.new_class_instance(blackboard_class));
                }
            }
            {
                SubLObject parser_class = cyblack_basic_application_get_parser_class_method(self);
                if (NIL != parser_class) {
                    cyblack_basic_application_install_parser_method(self, object.new_class_instance(parser_class));
                }
            }
            {
                SubLObject port_manager = object.new_class_instance(CYBLACK_PORT_MANAGER);
                cyblack_basic_application_install_port_manager_method(self, port_manager);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_application_new_component_method(SubLObject self, SubLObject component_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.classes_implements_p(component_class, CYBLACK_COMPONENT)) {
                    Errors.error($str_alt193$_NEW_COMPONENT__S____S_does_not_i, self, component_class);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.subclassp(component_class, CYBLACK_OBJECT)) {
                    Errors.error($str_alt194$_NEW_COMPONENT__S____S_is_not_a_s, self, component_class);
                }
            }
            {
                SubLObject new_instance = object.object_new_method(component_class);
                cyblack_object.cyblack_object_set_application_method(new_instance, self);
                return new_instance;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_agenda_class_method(SubLObject self) {
        {
            SubLObject agenda_class = get_cyblack_basic_application_agenda_class(self);
            return agenda_class;
        }
    }

    public static final SubLObject cyblack_basic_application_set_agenda_class_method(SubLObject self, SubLObject new_agenda_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject agenda_class = get_cyblack_basic_application_agenda_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_agenda_class) || (NIL != classes.classes_implements_p(new_agenda_class, CYBLACK_AGENDA)))) {
                                Errors.error($str_alt205$_SET_AGENDA_CLASS__S____S_does_no, self, new_agenda_class);
                            }
                        }
                        agenda_class = new_agenda_class;
                        sublisp_throw($sym203$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_agenda_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_agenda_class(self, agenda_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_blackboard_class_method(SubLObject self) {
        {
            SubLObject blackboard_class = get_cyblack_basic_application_blackboard_class(self);
            return blackboard_class;
        }
    }

    public static final SubLObject cyblack_basic_application_set_blackboard_class_method(SubLObject self, SubLObject new_blackboard_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject blackboard_class = get_cyblack_basic_application_blackboard_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_blackboard_class) || (NIL != classes.classes_implements_p(new_blackboard_class, CYBLACK_BLACKBOARD)))) {
                                Errors.error($str_alt215$_SET_BLACKBOARD_CLASS__S____S_doe, self, new_blackboard_class);
                            }
                        }
                        blackboard_class = new_blackboard_class;
                        sublisp_throw($sym213$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_blackboard_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_blackboard_class(self, blackboard_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym213$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_connection_class_method(SubLObject self) {
        {
            SubLObject connection_class = get_cyblack_basic_application_connection_class(self);
            return connection_class;
        }
    }

    public static final SubLObject cyblack_basic_application_set_connection_class_method(SubLObject self, SubLObject new_connection_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject connection_class = get_cyblack_basic_application_connection_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_connection_class) || (NIL != classes.subclassp(new_connection_class, CYBLACK_EXTERNAL_CONNECTION)))) {
                                Errors.error($str_alt225$_SET_CONNECTION_CLASS__S____S_is_, self, new_connection_class);
                            }
                        }
                        connection_class = new_connection_class;
                        sublisp_throw($sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_connection_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_connection_class(self, connection_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_parser_class_method(SubLObject self) {
        {
            SubLObject parser_class = get_cyblack_basic_application_parser_class(self);
            return parser_class;
        }
    }

    public static final SubLObject cyblack_basic_application_set_parser_class_method(SubLObject self, SubLObject new_parser_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject parser_class = get_cyblack_basic_application_parser_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parser_class) || (NIL != classes.subclassp(new_parser_class, CYBLACK_PARSER)))) {
                                Errors.error($str_alt234$_SET_PARSER_CLASS__S____S_is_not_, self, new_parser_class);
                            }
                        }
                        parser_class = new_parser_class;
                        sublisp_throw($sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_parser_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_parser_class(self, parser_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_message_broker_class_method(SubLObject self) {
        {
            SubLObject message_broker_class = get_cyblack_basic_application_message_broker_class(self);
            return message_broker_class;
        }
    }

    public static final SubLObject cyblack_basic_application_set_message_broker_class_method(SubLObject self, SubLObject new_message_broker) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject message_broker_class = get_cyblack_basic_application_message_broker_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_message_broker) || (NIL != classes.subclassp(new_message_broker, CYBLACK_MESSAGE_BROKER)))) {
                                Errors.error($str_alt243$_SET_MESSAGE_BROKER_CLASS__S____S, self, new_message_broker);
                            }
                        }
                        message_broker_class = new_message_broker;
                        sublisp_throw($sym242$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_message_broker);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_message_broker_class(self, message_broker_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym242$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_port_manager_method(SubLObject self) {
        {
            SubLObject port_manager = get_cyblack_basic_application_port_manager(self);
            return port_manager;
        }
    }

    public static final SubLObject cyblack_basic_application_get_application_name_method(SubLObject self) {
        {
            SubLObject application_name = get_cyblack_basic_application_application_name(self);
            return application_name;
        }
    }

    public static final SubLObject cyblack_basic_application_set_application_name_method(SubLObject self, SubLObject new_application_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject application_name = get_cyblack_basic_application_application_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_application_name.isString()) {
                                Errors.error($str_alt254$_SET_APPLICATION_NAME__S____S_is_, self, new_application_name);
                            }
                        }
                        application_name = new_application_name;
                        sublisp_throw($sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, application_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_application_name(self, application_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (new_application != self) {
                    Errors.error($str_alt258$_SET_APPLICATION__S___An_applicat, self, new_application, self);
                }
            }
            cyblack_object.cyblack_object_set_application_method(self, new_application);
            return new_application;
        }
    }

    public static final SubLObject cyblack_basic_application_get_knowledge_source_battery_method(SubLObject self) {
        {
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            return knowledge_source_battery;
        }
    }

    public static final SubLObject cyblack_basic_application_get_blackboard_method(SubLObject self) {
        {
            SubLObject blackboard = get_cyblack_basic_application_blackboard(self);
            return blackboard;
        }
    }

    public static final SubLObject cyblack_basic_application_get_agenda_method(SubLObject self) {
        {
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            return v_agenda;
        }
    }

    public static final SubLObject cyblack_basic_application_get_datatype_dictionary_method(SubLObject self) {
        {
            SubLObject datatype_dictionary = get_cyblack_basic_application_datatype_dictionary(self);
            return datatype_dictionary;
        }
    }

    public static final SubLObject cyblack_basic_application_get_message_broker_method(SubLObject self) {
        {
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            return message_broker;
        }
    }

    public static final SubLObject cyblack_basic_application_get_external_connection_method(SubLObject self) {
        {
            SubLObject external_connection = get_cyblack_basic_application_external_connection(self);
            return external_connection;
        }
    }

    public static final SubLObject cyblack_basic_application_set_external_connection_method(SubLObject self, SubLObject new_external_connection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject external_connection = get_cyblack_basic_application_external_connection(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_external_connection) || (NIL != cyblack_message_broker.cyblack_external_connection_p(new_external_connection)))) {
                                Errors.error($str_alt281$_SET_EXTERNAL_CONNECTION__S____S_, self, new_external_connection);
                            }
                        }
                        external_connection = new_external_connection;
                        sublisp_throw($sym280$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_external_connection);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_external_connection(self, external_connection);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym280$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_parser_method(SubLObject self) {
        {
            SubLObject v_parser = get_cyblack_basic_application_parser(self);
            return v_parser;
        }
    }

    public static final SubLObject cyblack_basic_application_set_parser_method(SubLObject self, SubLObject new_parser) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject v_parser = get_cyblack_basic_application_parser(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parser) || (NIL != cyblack_precondition_pattern.cyblack_parser_p(new_parser)))) {
                                Errors.error($str_alt290$_SET_PARSER__S____S_is_not_an_ins, self, new_parser);
                            }
                        }
                        v_parser = new_parser;
                        sublisp_throw($sym289$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_parser);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_parser(self, v_parser);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym289$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_install_knowledge_source_battery_method(SubLObject self, SubLObject new_knowledge_source_battery) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_ksb.cyblack_knowledge_source_battery_p(new_knowledge_source_battery)) {
                                Errors.error($str_alt296$_INSTALL_KNOWLEDGE_SOURCE_BATTERY, self, new_knowledge_source_battery);
                            }
                        }
                        methods.funcall_instance_method_with_1_args(new_knowledge_source_battery, SET_APPLICATION, self);
                        if (knowledge_source_battery == new_knowledge_source_battery) {
                            sublisp_throw($sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                        }
                        if (NIL != knowledge_source_battery) {
                            cyblack_basic_application_uninstall_knowledge_source_battery_method(self);
                        }
                        knowledge_source_battery = new_knowledge_source_battery;
                        sublisp_throw($sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_knowledge_source_battery);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_install_blackboard_method(SubLObject self, SubLObject new_blackboard) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject blackboard = get_cyblack_basic_application_blackboard(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_blackboard.cyblack_blackboard_p(new_blackboard)) {
                                Errors.error($str_alt302$_INSTALL_BLACKBOARD__S____S_is_no, self, new_blackboard);
                            }
                        }
                        {
                            SubLObject blackboard_application = cyblack_object.cyblack_object_get_application_method(new_blackboard);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!((NIL == blackboard_application) || (blackboard_application == self))) {
                                    Errors.error($str_alt303$_INSTALL_BLACKBOARD__S____S_is_al, self, new_blackboard, blackboard_application);
                                }
                            }
                        }
                        blackboard = new_blackboard;
                        cyblack_object.cyblack_object_set_application_method(new_blackboard, self);
                        sublisp_throw($sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_blackboard);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_blackboard(self, blackboard);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_install_agenda_method(SubLObject self, SubLObject new_agenda) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            try {
                try {
                    v_agenda = new_agenda;
                    methods.funcall_instance_method_with_1_args(new_agenda, SET_APPLICATION, self);
                    sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_agenda);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_agenda(self, v_agenda);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_install_parser_method(SubLObject self, SubLObject new_parser) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject v_parser = get_cyblack_basic_application_parser(self);
            try {
                try {
                    v_parser = new_parser;
                    methods.funcall_instance_method_with_1_args(new_parser, SET_APPLICATION, self);
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_parser);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_parser(self, v_parser);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_install_message_broker_method(SubLObject self, SubLObject new_message_broker) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject port_manager = get_cyblack_basic_application_port_manager(self);
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            try {
                try {
                    message_broker = new_message_broker;
                    if (NIL != new_message_broker) {
                        cyblack_message_broker.cyblack_message_broker_set_application_method(new_message_broker, self);
                    }
                    if (NIL != port_manager) {
                        cyblack_message_broker.cyblack_port_manager_set_message_broker_method(port_manager, new_message_broker);
                    }
                    sublisp_throw($sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_message_broker);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_port_manager(self, port_manager);
                            set_cyblack_basic_application_message_broker(self, message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_install_external_connection_method(SubLObject self, SubLObject new_external_connection) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_basic_application_set_external_connection_method(self, new_external_connection);
                    if (NIL != new_external_connection) {
                        cyblack_message_broker.cyblack_external_connection_set_application_method(new_external_connection, application);
                    }
                    sublisp_throw($sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_external_connection);
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
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_install_port_manager_method(SubLObject self, SubLObject new_port_manager) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject port_manager = get_cyblack_basic_application_port_manager(self);
                SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_message_broker.cyblack_port_manager_p(new_port_manager)) {
                                Errors.error($str_alt326$_INSTALL_PORT_MANAGER__S____S_is_, self, new_port_manager);
                            }
                        }
                        port_manager = new_port_manager;
                        cyblack_message_broker.cyblack_port_manager_set_application_method(new_port_manager, application);
                        if (NIL != message_broker) {
                            cyblack_message_broker.cyblack_port_manager_set_message_broker_method(new_port_manager, message_broker);
                        }
                        sublisp_throw($sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, new_port_manager);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_port_manager(self, port_manager);
                                set_cyblack_basic_application_message_broker(self, message_broker);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_knowledge_source_battery_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    if (NIL != knowledge_source_battery) {
                        methods.funcall_instance_method_with_0_args(knowledge_source_battery, UNINSTALL);
                        knowledge_source_battery = NIL;
                        sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, T);
                    }
                    sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_blackboard_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject blackboard = get_cyblack_basic_application_blackboard(self);
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    if (NIL != blackboard) {
                        methods.funcall_instance_method_with_0_args(knowledge_source_battery, UNINSTALL);
                        blackboard = NIL;
                        sublisp_throw($sym334$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, T);
                    }
                    sublisp_throw($sym334$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_blackboard(self, blackboard);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym334$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_agenda_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            try {
                try {
                    if (NIL != v_agenda) {
                        methods.funcall_instance_method_with_0_args(v_agenda, UNINSTALL);
                        v_agenda = NIL;
                        sublisp_throw($sym338$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, T);
                    }
                    sublisp_throw($sym338$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_agenda(self, v_agenda);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym338$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_parser_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject v_parser = get_cyblack_basic_application_parser(self);
            try {
                try {
                    if (NIL != v_parser) {
                        methods.funcall_instance_method_with_1_args(v_parser, SET_APPLICATION, NIL);
                        v_parser = NIL;
                        sublisp_throw($sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, T);
                    }
                    sublisp_throw($sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_parser(self, v_parser);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_message_broker_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            try {
                try {
                    if (NIL != message_broker) {
                        cyblack_message_broker.cyblack_message_broker_set_application_method(message_broker, NIL);
                        message_broker = NIL;
                    }
                    sublisp_throw($sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_message_broker(self, message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_external_connection_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject external_connection = get_cyblack_basic_application_external_connection(self);
            try {
                try {
                    if (NIL != external_connection) {
                        cyblack_message_broker.cyblack_external_connection_set_application_method(external_connection, NIL);
                        external_connection = NIL;
                    }
                    sublisp_throw($sym350$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_external_connection(self, external_connection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym350$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_uninstall_port_manager_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject port_manager = get_cyblack_basic_application_port_manager(self);
            try {
                try {
                    if (NIL != port_manager) {
                        cyblack_message_broker.cyblack_port_manager_set_message_broker_method(port_manager, NIL);
                        cyblack_message_broker.cyblack_port_manager_set_application_method(port_manager, NIL);
                        port_manager = NIL;
                    }
                    sublisp_throw($sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_port_manager(self, port_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_get_root_datatype_method(SubLObject self) {
        {
            SubLObject root_datatype = get_cyblack_basic_application_root_datatype(self);
            return root_datatype;
        }
    }

    public static final SubLObject cyblack_basic_application_get_root_datatype_name_method(SubLObject self) {
        {
            SubLObject root_datatype_name = get_cyblack_basic_application_root_datatype_name(self);
            return root_datatype_name;
        }
    }

    public static final SubLObject cyblack_basic_application_halt_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject halt_status = get_cyblack_basic_application_halt_status(self);
            try {
                try {
                    halt_status = T;
                    cyblack_io_stream_monitor.stop_io_stream_monitor();
                    methods.funcall_instance_method_with_0_args(self, ON_HALT);
                    sublisp_throw($sym364$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_halt_status(self, halt_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym364$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_halted_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject halt_status = get_cyblack_basic_application_halt_status(self);
            try {
                try {
                    sublisp_throw($sym368$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, halt_status);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_halt_status(self, halt_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_halt_and_abort_server_method(SubLObject self) {
        cyblack_basic_application_halt_method(self);
        methods.funcall_instance_method_with_0_args(self, ON_HALT_AND_ABORT_SERVER);
        return T;
    }

    /**
     * Creates an instance of CYBLACK-BASIC-APPLICATION.
     */
    public static final SubLObject cyblack_basic_application_create_application_method(SubLObject self) {
        return object.object_new_method(self);
    }

    public static final SubLObject cyblack_basic_application_find_panel_method(SubLObject self, SubLObject typename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_application_method = NIL;
                SubLObject datatype_dictionary = get_cyblack_basic_application_datatype_dictionary(self);
                SubLObject blackboard = get_cyblack_basic_application_blackboard(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!typename.isString()) {
                                Errors.error($str_alt380$_FIND_PANEL__S____S_is_not_a_stri);
                            }
                        }
                        if (NIL != datatype_dictionary) {
                            {
                                SubLObject datatype = methods.funcall_instance_method_with_1_args(datatype_dictionary, INTERN, typename);
                                sublisp_throw($sym379$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, methods.funcall_instance_method_with_1_args(datatype, GET_PANEL, blackboard));
                            }
                        } else {
                            sublisp_throw($sym379$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_application_datatype_dictionary(self, datatype_dictionary);
                                set_cyblack_basic_application_blackboard(self, blackboard);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym379$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_basic_application_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_application_get_current_session_method(SubLObject self) {
        {
            SubLObject current_session = get_cyblack_basic_application_current_session(self);
            return current_session;
        }
    }

    public static final SubLObject cyblack_basic_application_monitor_method(SubLObject self, SubLObject v_object_monitor) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            SubLObject v_parser = get_cyblack_basic_application_parser(self);
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    cyblack_object.cyblack_object_monitor_method(self, v_object_monitor);
                    if (NIL != v_agenda) {
                        methods.funcall_instance_method_with_1_args(v_agenda, MONITOR, v_object_monitor);
                    }
                    if (NIL != v_parser) {
                        methods.funcall_instance_method_with_1_args(v_parser, MONITOR, v_object_monitor);
                    }
                    if (NIL != message_broker) {
                        methods.funcall_instance_method_with_1_args(message_broker, MONITOR, v_object_monitor);
                    }
                    if (NIL != knowledge_source_battery) {
                        methods.funcall_instance_method_with_1_args(knowledge_source_battery, MONITOR, v_object_monitor);
                    }
                    sublisp_throw($sym390$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_message_broker(self, message_broker);
                            set_cyblack_basic_application_parser(self, v_parser);
                            set_cyblack_basic_application_agenda(self, v_agenda);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym390$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_unmonitor_method(SubLObject self, SubLObject v_object_monitor) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            SubLObject v_parser = get_cyblack_basic_application_parser(self);
            SubLObject v_agenda = get_cyblack_basic_application_agenda(self);
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    cyblack_object.cyblack_object_unmonitor_method(self, v_object_monitor);
                    if (NIL != v_agenda) {
                        methods.funcall_instance_method_with_1_args(v_agenda, UNMONITOR, v_object_monitor);
                    }
                    if (NIL != v_parser) {
                        methods.funcall_instance_method_with_1_args(v_parser, UNMONITOR, v_object_monitor);
                    }
                    if (NIL != message_broker) {
                        methods.funcall_instance_method_with_1_args(message_broker, UNMONITOR, v_object_monitor);
                    }
                    if (NIL != knowledge_source_battery) {
                        methods.funcall_instance_method_with_1_args(knowledge_source_battery, UNMONITOR, v_object_monitor);
                    }
                    sublisp_throw($sym394$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_message_broker(self, message_broker);
                            set_cyblack_basic_application_parser(self, v_parser);
                            set_cyblack_basic_application_agenda(self, v_agenda);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym394$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_report_outstanding_external_knowledge_sources_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    {
                        SubLObject knowledge_sources_still_waiting = cyblack_ksb.cyblack_ksb_unlinked_knowledge_sources_waiting_for_reply(knowledge_source_battery);
                        SubLObject count = ONE_INTEGER;
                        if (NIL != knowledge_sources_still_waiting) {
                            format(T, $str_alt399$____The_following_external_knowle);
                            {
                                SubLObject cdolist_list_var = knowledge_sources_still_waiting;
                                SubLObject ks = NIL;
                                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                                    format(T, $str_alt400$_______S____S, count, ks);
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        } else {
                            format(T, $str_alt401$____All_external_knowledge_source);
                        }
                        sublisp_throw($sym398$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym398$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_get_external_module_id_method(SubLObject self, SubLObject external_module_name) {
        {
            SubLObject external_module_table = get_cyblack_basic_application_external_module_table(self);
            return cyblack_external_module_table.get_external_module_id(external_module_table, external_module_name);
        }
    }

    public static final SubLObject cyblack_basic_application_get_posting_method(SubLObject self, SubLObject posting_id) {
        return cyblack_retrieve_posting(posting_id);
    }

    public static final SubLObject cyblack_basic_application_get_result_method(SubLObject self) {
        {
            SubLObject result = get_cyblack_basic_application_result(self);
            return result;
        }
    }

    public static final SubLObject cyblack_basic_application_set_result_method(SubLObject self, SubLObject new_result) {
        {
            SubLObject result = get_cyblack_basic_application_result(self);
            result = new_result;
            set_cyblack_basic_application_result(self, result);
            methods.funcall_instance_method_with_0_args(self, ON_SET_RESULT);
            return new_result;
        }
    }

    public static final SubLObject cyblack_basic_application_on_set_result_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_application_get_application_id_method(SubLObject self) {
        {
            SubLObject application_id = get_cyblack_basic_application_application_id(self);
            return application_id;
        }
    }

    public static final SubLObject cyblack_basic_application_describe_guid_manager_method(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject message_broker = get_cyblack_basic_application_message_broker(self);
            try {
                try {
                    if (NIL != message_broker) {
                        methods.funcall_instance_method_with_2_args(message_broker, DESCRIBE_GUID_MANAGER, stream, depth);
                    }
                    sublisp_throw($sym427$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_message_broker(self, message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym427$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_basic_application_get_incoming_message_queue_method(SubLObject self) {
        {
            SubLObject incoming_message_queue = get_cyblack_basic_application_incoming_message_queue(self);
            return incoming_message_queue;
        }
    }

    public static final SubLObject cyblack_basic_application_has_external_knowledge_sources_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_application_method = NIL;
            SubLObject knowledge_source_battery = get_cyblack_basic_application_knowledge_source_battery(self);
            try {
                try {
                    if (NIL != knowledge_source_battery) {
                        sublisp_throw($sym434$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, methods.funcall_instance_method_with_0_args(knowledge_source_battery, HAS_EXTERNAL_KNOWLEDGE_SOURCES_P));
                    }
                    sublisp_throw($sym434$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_application_method = Errors.handleThrowable(ccatch_env_var, $sym434$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD);
            }
            return catch_var_for_cyblack_basic_application_method;
        }
    }

    public static final SubLObject cyblack_app_get_application_name(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt436$CYBLACK_APP_GET_APPLICATION_NAME_, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_application_name_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_APPLICATION_NAME);
        }
    }

    public static final SubLObject cyblack_app_get_application(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt437$CYBLACK_APP_GET_APPLICATION___S_i, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_application_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_APPLICATION);
        }
    }

    public static final SubLObject cyblack_app_get_knowledge_source_battery(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt438$CYBLACK_APP_GET_KNOWLEDGE_SOURCE_, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_knowledge_source_battery_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_KNOWLEDGE_SOURCE_BATTERY);
        }
    }

    public static final SubLObject cyblack_app_get_blackboard(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt439$CYBLACK_APP_GET_BLACKBOARD___S_is, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_blackboard_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
        }
    }

    public static final SubLObject cyblack_app_get_agenda(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt440$CYBLACK_APP_GET_AGENDA___S_is_not, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_agenda_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_AGENDA);
        }
    }

    public static final SubLObject cyblack_app_get_datatype_dictionary(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(application)) {
                    Errors.error($str_alt441$CYBLACK_APP_GET_DATATYPE_DICTIONA, application);
                }
            }
            return NIL != cyblack_basic_application_p(application) ? ((SubLObject) (cyblack_basic_application_get_datatype_dictionary_method(application))) : methods.funcall_instance_method_with_0_args(application, GET_DATATYPE_DICTIONARY);
        }
    }

    public static final SubLObject cyblack_app_install_knowledge_source_battery(SubLObject application, SubLObject new_knowledge_source_battery) {
        if (NIL != cyblack_basic_application_p(application)) {
            return cyblack_basic_application_install_knowledge_source_battery_method(application, new_knowledge_source_battery);
        } else
            if (NIL != cyblack_application_p(application)) {
                return methods.funcall_instance_method_with_1_args(application, INSTALL_KNOWLEDGE_SOURCE_BATTERY, new_knowledge_source_battery);
            } else {
                return NIL;
            }

    }

    public static final SubLObject cyblack_app_install_blackboard(SubLObject application, SubLObject new_blackboard) {
        if (NIL != cyblack_basic_application_p(application)) {
            return cyblack_basic_application_install_blackboard_method(application, new_blackboard);
        } else
            if (NIL != cyblack_application_p(application)) {
                return methods.funcall_instance_method_with_1_args(application, INSTALL_BLACKBOARD, new_blackboard);
            } else {
                return NIL;
            }

    }

    public static final SubLObject cyblack_app_install_agenda(SubLObject application, SubLObject new_agenda) {
        if (NIL != cyblack_basic_application_p(application)) {
            return cyblack_basic_application_install_agenda_method(application, new_agenda);
        } else
            if (NIL != cyblack_application_p(application)) {
                return methods.funcall_instance_method_with_1_args(application, INSTALL_AGENDA, new_agenda);
            } else {
                return NIL;
            }

    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_session_p(SubLObject cyblack_session) {
        return classes.subloop_instanceof_class(cyblack_session, CYBLACK_SESSION);
    }

    public static final SubLObject cyblack_session_get_application_method(SubLObject self) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_session_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_session_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application_p(new_application)))) {
                                Errors.error($str_alt449$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym448$OUTER_CATCH_FOR_CYBLACK_SESSION_METHOD, new_application);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_session_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_CYBLACK_SESSION_METHOD);
                }
                return catch_var_for_cyblack_session_method;
            }
        }
    }

    public static final SubLObject cyblack_dynamic_application_p(SubLObject cyblack_dynamic_application) {
        return interfaces.subloop_instanceof_interface(cyblack_dynamic_application, CYBLACK_DYNAMIC_APPLICATION);
    }

    public static final SubLObject cyblack_basic_dynamic_application_dynamically_remove_panel_method(SubLObject self, SubLObject type) {
        {
            SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
            SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
            SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
            if ((NIL != template_datatype_dictionary) && (NIL != template_blackboard)) {
                {
                    SubLObject template_type = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(template_datatype_dictionary, type, UNPROVIDED);
                    if (NIL != template_type) {
                        {
                            SubLObject template_panel = cyblack_datatype.cyblack_datatype_get_panel(template_type, template_blackboard, UNPROVIDED);
                            SubLObject template_direct_knowledge_sources = NIL;
                            if (NIL != template_panel) {
                                template_direct_knowledge_sources = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_knowledge_sources(template_panel);
                                if (NIL != template_ksb) {
                                    {
                                        SubLObject cdolist_list_var = template_direct_knowledge_sources;
                                        SubLObject template_ks = NIL;
                                        for (template_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_ks = cdolist_list_var.first()) {
                                            cyblack_ksb.cyblack_ksb_remove_knowledge_source(template_ksb, template_ks);
                                        }
                                    }
                                }
                                {
                                    SubLObject template_subpanels = cyblack_panel_dispatch_functions.cyblack_panel_get_sub_panels(template_panel);
                                    SubLObject cdolist_list_var = template_subpanels;
                                    SubLObject template_subpanel = NIL;
                                    for (template_subpanel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_subpanel = cdolist_list_var.first()) {
                                        cyblack_basic_dynamic_application_dynamically_remove_panel_method(self, template_subpanel);
                                    }
                                }
                                {
                                    SubLObject template_superpanels = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_panel);
                                    SubLObject cdolist_list_var = template_superpanels;
                                    SubLObject template_superpanel = NIL;
                                    for (template_superpanel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_superpanel = cdolist_list_var.first()) {
                                        cyblack_panel_dispatch_functions.cyblack_panel_remove_super_panel(template_panel, template_superpanel);
                                        cyblack_panel_dispatch_functions.cyblack_panel_remove_sub_panel(template_superpanel, template_panel);
                                    }
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dynamic_application_dynamically_add_panel_method(SubLObject self, SubLObject type, SubLObject supertypes, SubLObject posting_class, SubLObject panel_class) {
        {
            SubLObject template_datatype_dictionary = cyblack_basic_application_get_datatype_dictionary_method(self);
            SubLObject template_type = NIL;
            if (NIL != template_datatype_dictionary) {
                {
                    SubLObject cdolist_list_var = supertypes;
                    SubLObject template_supertype = NIL;
                    for (template_supertype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_supertype = cdolist_list_var.first()) {
                        cyblack_basic_application_declare_subtype_method(self, template_type, template_supertype, posting_class, panel_class);
                    }
                }
                return cyblack_datatype_dictionary.cyblack_datatype_dictionary_instantiate_panel(template_datatype_dictionary, type);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dynamic_application_dynamically_add_posting_class_method(SubLObject self, SubLObject class_name, SubLObject super_class, SubLObject interface_list, SubLObject v_slots) {
        {
            SubLObject slot_defns = NIL;
            SubLObject cyc_package = find_package($$$CYC);
            SubLObject list_expression = v_slots;
            if (NIL == list_expression) {
                slot_defns = NIL;
            } else
                if (list_expression.isAtom()) {
                    slot_defns = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject slot = list_expression.first();
                            slot_defns = list(list(intern(symbol_name(slot), cyc_package), $INSTANCE, $PUBLIC, $ESSENTIAL));
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            {
                                SubLObject slot = list_expression.first();
                                slot_defns = list(list(intern(symbol_name(slot), cyc_package), $INSTANCE, $PUBLIC, $ESSENTIAL));
                                tail_cons = slot_defns;
                            }
                            {
                                SubLObject cdolist_list_var = list_expression.rest();
                                SubLObject slot = NIL;
                                for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                    result = list(list(intern(symbol_name(slot), cyc_package), $INSTANCE, $PUBLIC, $ESSENTIAL));
                                    rplacd(tail_cons, result);
                                    tail_cons = result;
                                }
                            }
                        }
                    }


            {
                SubLObject newly_constructed_class = classes.new_class(class_name, super_class, copy_list(interface_list), slot_defns);
                return newly_constructed_class;
            }
        }
    }

    public static final SubLObject cyblack_basic_dynamic_application_dynamically_remove_knowledge_source_method(SubLObject self, SubLObject ks_instance) {
        {
            SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
            SubLObject template_dictionary = cyblack_ksb.cyblack_ksbt_get_dictionary(self);
            SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
            SubLObject template_types_bag = methods.funcall_instance_method_with_0_args(ks_instance, GET_PRECONDITION_DATATYPES);
            if (NIL != template_ksb) {
                cyblack_ksb.cyblack_ksb_unregister_knowledge_source(template_ksb, ks_instance);
                if ((NIL != template_dictionary) && (NIL != template_types_bag)) {
                    {
                        SubLObject template_datatypes = methods.funcall_instance_method_with_0_args(template_types_bag, GET_UNIQUE_ELEMENTS);
                        SubLObject template_current_panel = NIL;
                        if ((NIL != template_datatypes) && (NIL != template_blackboard)) {
                            {
                                SubLObject cdolist_list_var = template_datatypes;
                                SubLObject template_datatype = NIL;
                                for (template_datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_datatype = cdolist_list_var.first()) {
                                    dictionary_utilities.dictionary_remove_from_value(template_dictionary, template_datatype, ks_instance, UNPROVIDED, UNPROVIDED);
                                    template_current_panel = cyblack_datatype.cyblack_datatype_get_panel(template_datatype, template_blackboard, UNPROVIDED);
                                    if (NIL != template_current_panel) {
                                        cyblack_panel_dispatch_functions.cyblack_panel_remove_direct_knowledge_source(template_current_panel, ks_instance);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ks_instance;
        }
    }

    public static final SubLObject cyblack_basic_dynamic_application_dynamically_add_knowledge_source_method(SubLObject self, SubLObject ks_instance) {
        {
            SubLObject template_ksb = cyblack_basic_application_get_knowledge_source_battery_method(self);
            SubLObject template_dictionary = cyblack_ksb.cyblack_ksbt_get_dictionary(self);
            SubLObject template_blackboard = cyblack_basic_application_get_blackboard_method(self);
            SubLObject template_types_bag = methods.funcall_instance_method_with_0_args(ks_instance, GET_PRECONDITION_DATATYPES);
            if (NIL != template_ksb) {
                cyblack_ksb.cyblack_ksb_register_knowledge_source(template_ksb, ks_instance);
                if (NIL != template_dictionary) {
                    methods.funcall_instance_method_with_1_args(ks_instance, SET_APPLICATION, self);
                    if (NIL != template_types_bag) {
                        {
                            SubLObject template_datatypes = methods.funcall_instance_method_with_0_args(template_types_bag, GET_UNIQUE_ELEMENTS);
                            SubLObject template_current_panel = NIL;
                            if ((NIL != template_datatypes) && (NIL != template_blackboard)) {
                                {
                                    SubLObject cdolist_list_var = template_datatypes;
                                    SubLObject template_datatype = NIL;
                                    for (template_datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_datatype = cdolist_list_var.first()) {
                                        dictionary_utilities.dictionary_pushnew(template_dictionary, template_datatype, ks_instance, UNPROVIDED, UNPROVIDED);
                                        template_current_panel = cyblack_datatype.cyblack_datatype_get_panel(template_datatype, template_blackboard, UNPROVIDED);
                                        if (NIL != template_current_panel) {
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_direct_knowledge_source(template_current_panel, ks_instance);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ks_instance;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_dynamic_application_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_dynamic_application_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_dynamic_application_p(SubLObject cyblack_basic_dynamic_application) {
        return classes.subloop_instanceof_class(cyblack_basic_dynamic_application, CYBLACK_BASIC_DYNAMIC_APPLICATION);
    }

    public static final SubLObject cyblack_application_get_blackboard(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt483$CYBLACK_APPLICATION_GET_BLACKBOAR, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_blackboard_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_BLACKBOARD);
            }
        }
    }

    public static final SubLObject cyblack_application_get_datatype_dictionary(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt484$CYBLACK_APPLICATION_GET_DATATYPE_, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_datatype_dictionary_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_DATATYPE_DICTIONARY);
            }
        }
    }

    public static final SubLObject cyblack_application_get_message_broker(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt485$CYBLACK_APPLICATION_GET_MESSAGE_B, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_message_broker_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_MESSAGE_BROKER);
            }
        }
    }

    public static final SubLObject cyblack_application_get_agenda(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt486$CYBLACK_APPLICATION_GET_AGENDA___, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_agenda_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_AGENDA);
            }
        }
    }

    public static final SubLObject cyblack_application_get_root_datatype(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt487$CYBLACK_APPLICATION_GET_ROOT_DATA, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_root_datatype_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_ROOT_DATATYPE);
            }
        }
    }

    public static final SubLObject cyblack_application_get_posting(SubLObject v_cyblack_application, SubLObject posting_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt488$CYBLACK_APPLICATION_GET_POSTING__, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_posting_method(v_cyblack_application, posting_id);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_application, GET_POSTING, posting_id);
            }
        }
    }

    public static final SubLObject cyblack_application_get_result(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt489$CYBLACK_APPLICATION_GET_RESULT___, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_result_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_RESULT);
            }
        }
    }

    public static final SubLObject cyblack_application_set_result(SubLObject v_cyblack_application, SubLObject new_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt490$CYBLACK_APPLICATION_SET_RESULT___, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_set_result_method(v_cyblack_application, new_result);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_application, SET_RESULT, new_result);
            }
        }
    }

    public static final SubLObject cyblack_application_halt(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt491$CYBLACK_APPLICATION_HALT___S_is_n, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_halt_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, HALT);
            }
        }
    }

    public static final SubLObject cyblack_application_get_knowledge_source_battery(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt492$CYBLACK_APPLICATION_GET_KNOWLEDGE, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_knowledge_source_battery_method(v_cyblack_application);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_KNOWLEDGE_SOURCE_BATTERY);
            }
        }
    }

    public static final SubLObject cyblack_application_get_application_id(SubLObject v_cyblack_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application_p(v_cyblack_application)) {
                    Errors.error($str_alt493$CYBLACK_APPLICATION_GET_APPLICATI, v_cyblack_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(v_cyblack_application)) {
                return cyblack_basic_application_get_application_id_method(v_cyblack_application);
            } else
                if (NIL != cyblack_basic_application_p(v_cyblack_application)) {
                    return cyblack_basic_application_get_application_id_method(v_cyblack_application);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_application, GET_APPLICATION_ID);
                }

        }
    }

    public static final SubLObject cyblack_dynamic_application_dynamically_add_knowledge_source(SubLObject cyblack_dynamic_application, SubLObject ks_instance) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_dynamic_application_p(cyblack_dynamic_application)) {
                    Errors.error($str_alt494$CYBLACK_DYNAMIC_APPLICATION_DYNAM, cyblack_dynamic_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(cyblack_dynamic_application)) {
                return cyblack_basic_dynamic_application_dynamically_add_knowledge_source_method(cyblack_dynamic_application, ks_instance);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_dynamic_application, DYNAMICALLY_ADD_KNOWLEDGE_SOURCE, ks_instance);
            }
        }
    }

    public static final SubLObject cyblack_dynamic_application_dynamically_remove_knowledge_source(SubLObject cyblack_dynamic_application, SubLObject ks_instance) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_dynamic_application_p(cyblack_dynamic_application)) {
                    Errors.error($str_alt495$CYBLACK_DYNAMIC_APPLICATION_DYNAM, cyblack_dynamic_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(cyblack_dynamic_application)) {
                return cyblack_basic_dynamic_application_dynamically_remove_knowledge_source_method(cyblack_dynamic_application, ks_instance);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_dynamic_application, DYNAMICALLY_REMOVE_KNOWLEDGE_SOURCE, ks_instance);
            }
        }
    }

    public static final SubLObject cyblack_dynamic_application_dynamically_add_posting_class(SubLObject cyblack_dynamic_application, SubLObject class_name, SubLObject super_class, SubLObject interface_list, SubLObject v_slots) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_dynamic_application_p(cyblack_dynamic_application)) {
                    Errors.error($str_alt496$CYBLACK_DYNAMIC_APPLICATION_DYNAM, cyblack_dynamic_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(cyblack_dynamic_application)) {
                return cyblack_basic_dynamic_application_dynamically_add_posting_class_method(cyblack_dynamic_application, class_name, super_class, interface_list, v_slots);
            } else {
                return methods.funcall_instance_method_with_4_args(cyblack_dynamic_application, DYNAMICALLY_ADD_POSTING_CLASS, class_name, super_class, interface_list, v_slots);
            }
        }
    }

    public static final SubLObject cyblack_dynamic_application_dynamically_add_panel(SubLObject cyblack_dynamic_application, SubLObject type, SubLObject supertypes, SubLObject posting_class, SubLObject panel_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_dynamic_application_p(cyblack_dynamic_application)) {
                    Errors.error($str_alt497$CYBLACK_DYNAMIC_APPLICATION_DYNAM, cyblack_dynamic_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(cyblack_dynamic_application)) {
                return cyblack_basic_dynamic_application_dynamically_add_panel_method(cyblack_dynamic_application, type, supertypes, posting_class, panel_class);
            } else {
                return methods.funcall_instance_method_with_4_args(cyblack_dynamic_application, DYNAMICALLY_ADD_PANEL, type, supertypes, posting_class, panel_class);
            }
        }
    }

    public static final SubLObject cyblack_dynamic_application_dynamically_remove_panel(SubLObject cyblack_dynamic_application, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_dynamic_application_p(cyblack_dynamic_application)) {
                    Errors.error($str_alt498$CYBLACK_DYNAMIC_APPLICATION_DYNAM, cyblack_dynamic_application);
                }
            }
            if (NIL != cyblack_basic_dynamic_application_p(cyblack_dynamic_application)) {
                return cyblack_basic_dynamic_application_dynamically_remove_panel_method(cyblack_dynamic_application, type);
            } else {
                return methods.funcall_instance_method_with_1_args(cyblack_dynamic_application, DYNAMICALLY_REMOVE_PANEL, type);
            }
        }
    }

    public static final SubLObject declare_cyblack_application_file() {
        declareMacro("with_cyblack_application", "WITH-CYBLACK-APPLICATION");
        declareFunction("cyblack_reset_posting_management", "CYBLACK-RESET-POSTING-MANAGEMENT", 0, 0, false);
        declareFunction("cyblack_register_posting", "CYBLACK-REGISTER-POSTING", 1, 0, false);
        declareFunction("cyblack_retrieve_posting", "CYBLACK-RETRIEVE-POSTING", 1, 0, false);
        declareFunction("valid_cyblack_application_command_destinations", "VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS", 0, 0, false);
        declareFunction("cyblack_application_command_destination_p", "CYBLACK-APPLICATION-COMMAND-DESTINATION-P", 1, 0, false);
        declareFunction("encode_cyblack_application_command_destination", "ENCODE-CYBLACK-APPLICATION-COMMAND-DESTINATION", 1, 0, false);
        declareFunction("decode_cyblack_application_command_destination", "DECODE-CYBLACK-APPLICATION-COMMAND-DESTINATION", 1, 0, false);
        declareFunction("cyblack_application_command_destination_less_p", "CYBLACK-APPLICATION-COMMAND-DESTINATION-LESS-P", 2, 0, false);
        declareFunction("cyblack_application_command_destination_greater_p", "CYBLACK-APPLICATION-COMMAND-DESTINATION-GREATER-P", 2, 0, false);
        declareFunction("cyblack_application_p", "CYBLACK-APPLICATION-P", 1, 0, false);
        declareFunction("cyblack_application_after_startup_asynchronous_ks_invitations", "CYBLACK-APPLICATION-AFTER-STARTUP-ASYNCHRONOUS-KS-INVITATIONS", 0, 0, false);
        declareFunction("get_cyblack_basic_application_incoming_message_queue", "GET-CYBLACK-BASIC-APPLICATION-INCOMING-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_basic_application_incoming_message_queue", "SET-CYBLACK-BASIC-APPLICATION-INCOMING-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_basic_application_application_id", "GET-CYBLACK-BASIC-APPLICATION-APPLICATION-ID", 1, 0, false);
        declareFunction("set_cyblack_basic_application_application_id", "SET-CYBLACK-BASIC-APPLICATION-APPLICATION-ID", 2, 0, false);
        declareFunction("get_cyblack_basic_application_result", "GET-CYBLACK-BASIC-APPLICATION-RESULT", 1, 0, false);
        declareFunction("set_cyblack_basic_application_result", "SET-CYBLACK-BASIC-APPLICATION-RESULT", 2, 0, false);
        declareFunction("get_cyblack_basic_application_external_module_table", "GET-CYBLACK-BASIC-APPLICATION-EXTERNAL-MODULE-TABLE", 1, 0, false);
        declareFunction("set_cyblack_basic_application_external_module_table", "SET-CYBLACK-BASIC-APPLICATION-EXTERNAL-MODULE-TABLE", 2, 0, false);
        declareFunction("get_cyblack_basic_application_port_manager", "GET-CYBLACK-BASIC-APPLICATION-PORT-MANAGER", 1, 0, false);
        declareFunction("set_cyblack_basic_application_port_manager", "SET-CYBLACK-BASIC-APPLICATION-PORT-MANAGER", 2, 0, false);
        declareFunction("get_cyblack_basic_application_message_broker_class", "GET-CYBLACK-BASIC-APPLICATION-MESSAGE-BROKER-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_message_broker_class", "SET-CYBLACK-BASIC-APPLICATION-MESSAGE-BROKER-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_application_parser_class", "GET-CYBLACK-BASIC-APPLICATION-PARSER-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_parser_class", "SET-CYBLACK-BASIC-APPLICATION-PARSER-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_application_connection_class", "GET-CYBLACK-BASIC-APPLICATION-CONNECTION-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_connection_class", "SET-CYBLACK-BASIC-APPLICATION-CONNECTION-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_application_blackboard_class", "GET-CYBLACK-BASIC-APPLICATION-BLACKBOARD-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_blackboard_class", "SET-CYBLACK-BASIC-APPLICATION-BLACKBOARD-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_application_agenda_class", "GET-CYBLACK-BASIC-APPLICATION-AGENDA-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_agenda_class", "SET-CYBLACK-BASIC-APPLICATION-AGENDA-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_application_root_datatype_name", "GET-CYBLACK-BASIC-APPLICATION-ROOT-DATATYPE-NAME", 1, 0, false);
        declareFunction("set_cyblack_basic_application_root_datatype_name", "SET-CYBLACK-BASIC-APPLICATION-ROOT-DATATYPE-NAME", 2, 0, false);
        declareFunction("get_cyblack_basic_application_root_datatype", "GET-CYBLACK-BASIC-APPLICATION-ROOT-DATATYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_application_root_datatype", "SET-CYBLACK-BASIC-APPLICATION-ROOT-DATATYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_application_external_connection", "GET-CYBLACK-BASIC-APPLICATION-EXTERNAL-CONNECTION", 1, 0, false);
        declareFunction("set_cyblack_basic_application_external_connection", "SET-CYBLACK-BASIC-APPLICATION-EXTERNAL-CONNECTION", 2, 0, false);
        declareFunction("get_cyblack_basic_application_message_broker", "GET-CYBLACK-BASIC-APPLICATION-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_basic_application_message_broker", "SET-CYBLACK-BASIC-APPLICATION-MESSAGE-BROKER", 2, 0, false);
        declareFunction("get_cyblack_basic_application_current_session", "GET-CYBLACK-BASIC-APPLICATION-CURRENT-SESSION", 1, 0, false);
        declareFunction("set_cyblack_basic_application_current_session", "SET-CYBLACK-BASIC-APPLICATION-CURRENT-SESSION", 2, 0, false);
        declareFunction("get_cyblack_basic_application_datatype_dictionary", "GET-CYBLACK-BASIC-APPLICATION-DATATYPE-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_application_datatype_dictionary", "SET-CYBLACK-BASIC-APPLICATION-DATATYPE-DICTIONARY", 2, 0, false);
        declareFunction("get_cyblack_basic_application_parser", "GET-CYBLACK-BASIC-APPLICATION-PARSER", 1, 0, false);
        declareFunction("set_cyblack_basic_application_parser", "SET-CYBLACK-BASIC-APPLICATION-PARSER", 2, 0, false);
        declareFunction("get_cyblack_basic_application_agenda", "GET-CYBLACK-BASIC-APPLICATION-AGENDA", 1, 0, false);
        declareFunction("set_cyblack_basic_application_agenda", "SET-CYBLACK-BASIC-APPLICATION-AGENDA", 2, 0, false);
        declareFunction("get_cyblack_basic_application_blackboard", "GET-CYBLACK-BASIC-APPLICATION-BLACKBOARD", 1, 0, false);
        declareFunction("set_cyblack_basic_application_blackboard", "SET-CYBLACK-BASIC-APPLICATION-BLACKBOARD", 2, 0, false);
        declareFunction("get_cyblack_basic_application_knowledge_source_battery", "GET-CYBLACK-BASIC-APPLICATION-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("set_cyblack_basic_application_knowledge_source_battery", "SET-CYBLACK-BASIC-APPLICATION-KNOWLEDGE-SOURCE-BATTERY", 2, 0, false);
        declareFunction("get_cyblack_basic_application_application_name", "GET-CYBLACK-BASIC-APPLICATION-APPLICATION-NAME", 1, 0, false);
        declareFunction("set_cyblack_basic_application_application_name", "SET-CYBLACK-BASIC-APPLICATION-APPLICATION-NAME", 2, 0, false);
        declareFunction("get_cyblack_basic_application_halt_status", "GET-CYBLACK-BASIC-APPLICATION-HALT-STATUS", 1, 0, false);
        declareFunction("set_cyblack_basic_application_halt_status", "SET-CYBLACK-BASIC-APPLICATION-HALT-STATUS", 2, 0, false);
        declareFunction("cyblack_basic_application_reset_method", "CYBLACK-BASIC-APPLICATION-RESET-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_application_on_quiescence_method", "CYBLACK-BASIC-APPLICATION-ON-QUIESCENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_close_all_external_ports_method", "CYBLACK-BASIC-APPLICATION-CLOSE-ALL-EXTERNAL-PORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_create_posting_method", "CYBLACK-BASIC-APPLICATION-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_after_agenda_execute_method", "CYBLACK-BASIC-APPLICATION-AFTER-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_before_agenda_execute_method", "CYBLACK-BASIC-APPLICATION-BEFORE-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_on_empty_agenda_method", "CYBLACK-BASIC-APPLICATION-ON-EMPTY-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_run_method", "CYBLACK-BASIC-APPLICATION-RUN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_on_halt_and_abort_server_method", "CYBLACK-BASIC-APPLICATION-ON-HALT-AND-ABORT-SERVER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_on_halt_method", "CYBLACK-BASIC-APPLICATION-ON-HALT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_on_shutdown_method", "CYBLACK-BASIC-APPLICATION-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_after_startup_method", "CYBLACK-BASIC-APPLICATION-AFTER-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_on_startup_method", "CYBLACK-BASIC-APPLICATION-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_invite_external_knowledge_sources_method", "CYBLACK-BASIC-APPLICATION-INVITE-EXTERNAL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_declare_standard_timer_panels_method", "CYBLACK-BASIC-APPLICATION-DECLARE-STANDARD-TIMER-PANELS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_panel_type_method", "CYBLACK-BASIC-APPLICATION-GET-PANEL-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_override_panel_type_method", "CYBLACK-BASIC-APPLICATION-OVERRIDE-PANEL-TYPE-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_application_declare_subtype_method", "CYBLACK-BASIC-APPLICATION-DECLARE-SUBTYPE-METHOD", 2, 3, false);
        declareFunction("cyblack_basic_application_declare_subtype_relations_method", "CYBLACK-BASIC-APPLICATION-DECLARE-SUBTYPE-RELATIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_uninstall_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_application_method", "CYBLACK-BASIC-APPLICATION-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_print_method", "CYBLACK-BASIC-APPLICATION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_application_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-APPLICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_application_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-APPLICATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_application_p", "CYBLACK-BASIC-APPLICATION-P", 1, 0, false);
        declareFunction("cyblack_basic_application_initialize_method", "CYBLACK-BASIC-APPLICATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_standard_initialization_method", "CYBLACK-BASIC-APPLICATION-STANDARD-INITIALIZATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_new_component_method", "CYBLACK-BASIC-APPLICATION-NEW-COMPONENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_agenda_class_method", "CYBLACK-BASIC-APPLICATION-GET-AGENDA-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_agenda_class_method", "CYBLACK-BASIC-APPLICATION-SET-AGENDA-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_blackboard_class_method", "CYBLACK-BASIC-APPLICATION-GET-BLACKBOARD-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_blackboard_class_method", "CYBLACK-BASIC-APPLICATION-SET-BLACKBOARD-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_connection_class_method", "CYBLACK-BASIC-APPLICATION-GET-CONNECTION-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_connection_class_method", "CYBLACK-BASIC-APPLICATION-SET-CONNECTION-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_parser_class_method", "CYBLACK-BASIC-APPLICATION-GET-PARSER-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_parser_class_method", "CYBLACK-BASIC-APPLICATION-SET-PARSER-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_message_broker_class_method", "CYBLACK-BASIC-APPLICATION-GET-MESSAGE-BROKER-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_message_broker_class_method", "CYBLACK-BASIC-APPLICATION-SET-MESSAGE-BROKER-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_port_manager_method", "CYBLACK-BASIC-APPLICATION-GET-PORT-MANAGER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_application_name_method", "CYBLACK-BASIC-APPLICATION-GET-APPLICATION-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_application_name_method", "CYBLACK-BASIC-APPLICATION-SET-APPLICATION-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_set_application_method", "CYBLACK-BASIC-APPLICATION-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_knowledge_source_battery_method", "CYBLACK-BASIC-APPLICATION-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_blackboard_method", "CYBLACK-BASIC-APPLICATION-GET-BLACKBOARD-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_agenda_method", "CYBLACK-BASIC-APPLICATION-GET-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_datatype_dictionary_method", "CYBLACK-BASIC-APPLICATION-GET-DATATYPE-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_message_broker_method", "CYBLACK-BASIC-APPLICATION-GET-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_external_connection_method", "CYBLACK-BASIC-APPLICATION-GET-EXTERNAL-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_external_connection_method", "CYBLACK-BASIC-APPLICATION-SET-EXTERNAL-CONNECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_parser_method", "CYBLACK-BASIC-APPLICATION-GET-PARSER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_parser_method", "CYBLACK-BASIC-APPLICATION-SET-PARSER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_knowledge_source_battery_method", "CYBLACK-BASIC-APPLICATION-INSTALL-KNOWLEDGE-SOURCE-BATTERY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_blackboard_method", "CYBLACK-BASIC-APPLICATION-INSTALL-BLACKBOARD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_agenda_method", "CYBLACK-BASIC-APPLICATION-INSTALL-AGENDA-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_parser_method", "CYBLACK-BASIC-APPLICATION-INSTALL-PARSER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_message_broker_method", "CYBLACK-BASIC-APPLICATION-INSTALL-MESSAGE-BROKER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_external_connection_method", "CYBLACK-BASIC-APPLICATION-INSTALL-EXTERNAL-CONNECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_install_port_manager_method", "CYBLACK-BASIC-APPLICATION-INSTALL-PORT-MANAGER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_uninstall_knowledge_source_battery_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-KNOWLEDGE-SOURCE-BATTERY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_blackboard_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-BLACKBOARD-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_agenda_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_parser_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-PARSER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_message_broker_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_external_connection_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-EXTERNAL-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_uninstall_port_manager_method", "CYBLACK-BASIC-APPLICATION-UNINSTALL-PORT-MANAGER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_root_datatype_method", "CYBLACK-BASIC-APPLICATION-GET-ROOT-DATATYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_root_datatype_name_method", "CYBLACK-BASIC-APPLICATION-GET-ROOT-DATATYPE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_halt_method", "CYBLACK-BASIC-APPLICATION-HALT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_halted_p_method", "CYBLACK-BASIC-APPLICATION-HALTED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_halt_and_abort_server_method", "CYBLACK-BASIC-APPLICATION-HALT-AND-ABORT-SERVER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_create_application_method", "CYBLACK-BASIC-APPLICATION-CREATE-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_find_panel_method", "CYBLACK-BASIC-APPLICATION-FIND-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_current_session_method", "CYBLACK-BASIC-APPLICATION-GET-CURRENT-SESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_monitor_method", "CYBLACK-BASIC-APPLICATION-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_unmonitor_method", "CYBLACK-BASIC-APPLICATION-UNMONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_report_outstanding_external_knowledge_sources_method", "CYBLACK-BASIC-APPLICATION-REPORT-OUTSTANDING-EXTERNAL-KNOWLEDGE-SOURCES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_external_module_id_method", "CYBLACK-BASIC-APPLICATION-GET-EXTERNAL-MODULE-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_posting_method", "CYBLACK-BASIC-APPLICATION-GET-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_get_result_method", "CYBLACK-BASIC-APPLICATION-GET-RESULT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_set_result_method", "CYBLACK-BASIC-APPLICATION-SET-RESULT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_application_on_set_result_method", "CYBLACK-BASIC-APPLICATION-ON-SET-RESULT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_get_application_id_method", "CYBLACK-BASIC-APPLICATION-GET-APPLICATION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_describe_guid_manager_method", "CYBLACK-BASIC-APPLICATION-DESCRIBE-GUID-MANAGER-METHOD", 1, 2, false);
        declareFunction("cyblack_basic_application_get_incoming_message_queue_method", "CYBLACK-BASIC-APPLICATION-GET-INCOMING-MESSAGE-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_application_has_external_knowledge_sources_p_method", "CYBLACK-BASIC-APPLICATION-HAS-EXTERNAL-KNOWLEDGE-SOURCES-P-METHOD", 1, 0, false);
        declareFunction("cyblack_app_get_application_name", "CYBLACK-APP-GET-APPLICATION-NAME", 1, 0, false);
        declareFunction("cyblack_app_get_application", "CYBLACK-APP-GET-APPLICATION", 1, 0, false);
        declareFunction("cyblack_app_get_knowledge_source_battery", "CYBLACK-APP-GET-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("cyblack_app_get_blackboard", "CYBLACK-APP-GET-BLACKBOARD", 1, 0, false);
        declareFunction("cyblack_app_get_agenda", "CYBLACK-APP-GET-AGENDA", 1, 0, false);
        declareFunction("cyblack_app_get_datatype_dictionary", "CYBLACK-APP-GET-DATATYPE-DICTIONARY", 1, 0, false);
        declareFunction("cyblack_app_install_knowledge_source_battery", "CYBLACK-APP-INSTALL-KNOWLEDGE-SOURCE-BATTERY", 2, 0, false);
        declareFunction("cyblack_app_install_blackboard", "CYBLACK-APP-INSTALL-BLACKBOARD", 2, 0, false);
        declareFunction("cyblack_app_install_agenda", "CYBLACK-APP-INSTALL-AGENDA", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_session_p", "CYBLACK-SESSION-P", 1, 0, false);
        declareFunction("cyblack_session_get_application_method", "CYBLACK-SESSION-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_session_set_application_method", "CYBLACK-SESSION-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_dynamic_application_p", "CYBLACK-DYNAMIC-APPLICATION-P", 1, 0, false);
        declareFunction("cyblack_basic_dynamic_application_dynamically_remove_panel_method", "CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dynamic_application_dynamically_add_panel_method", "CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-PANEL-METHOD", 5, 0, false);
        declareFunction("cyblack_basic_dynamic_application_dynamically_add_posting_class_method", "CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-POSTING-CLASS-METHOD", 5, 0, false);
        declareFunction("cyblack_basic_dynamic_application_dynamically_remove_knowledge_source_method", "CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dynamic_application_dynamically_add_knowledge_source_method", "CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_dynamic_application_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DYNAMIC-APPLICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_dynamic_application_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DYNAMIC-APPLICATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_dynamic_application_p", "CYBLACK-BASIC-DYNAMIC-APPLICATION-P", 1, 0, false);
        declareFunction("cyblack_application_get_blackboard", "CYBLACK-APPLICATION-GET-BLACKBOARD", 1, 0, false);
        declareFunction("cyblack_application_get_datatype_dictionary", "CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY", 1, 0, false);
        declareFunction("cyblack_application_get_message_broker", "CYBLACK-APPLICATION-GET-MESSAGE-BROKER", 1, 0, false);
        declareFunction("cyblack_application_get_agenda", "CYBLACK-APPLICATION-GET-AGENDA", 1, 0, false);
        declareFunction("cyblack_application_get_root_datatype", "CYBLACK-APPLICATION-GET-ROOT-DATATYPE", 1, 0, false);
        declareFunction("cyblack_application_get_posting", "CYBLACK-APPLICATION-GET-POSTING", 2, 0, false);
        declareFunction("cyblack_application_get_result", "CYBLACK-APPLICATION-GET-RESULT", 1, 0, false);
        declareFunction("cyblack_application_set_result", "CYBLACK-APPLICATION-SET-RESULT", 2, 0, false);
        declareFunction("cyblack_application_halt", "CYBLACK-APPLICATION-HALT", 1, 0, false);
        declareFunction("cyblack_application_get_knowledge_source_battery", "CYBLACK-APPLICATION-GET-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("cyblack_application_get_application_id", "CYBLACK-APPLICATION-GET-APPLICATION-ID", 1, 0, false);
        declareFunction("cyblack_dynamic_application_dynamically_add_knowledge_source", "CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_dynamic_application_dynamically_remove_knowledge_source", "CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_dynamic_application_dynamically_add_posting_class", "CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-POSTING-CLASS", 5, 0, false);
        declareFunction("cyblack_dynamic_application_dynamically_add_panel", "CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-PANEL", 5, 0, false);
        declareFunction("cyblack_dynamic_application_dynamically_remove_panel", "CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-PANEL", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_application_file() {
        defvar("*CYBLACK-APPLICATION*", NIL);
        defparameter("*CYBLACK-GLOBAL-POSTING-TABLE*", object.new_class_instance(CYBLACK_GLOBAL_POSTING_TABLE));
        defconstant("*VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS*", $list_alt4);
        return NIL;
    }

    public static final SubLObject setup_cyblack_application_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_APPLICATION_COMMAND_DESTINATION, $list_alt4);
        interfaces.new_interface(CYBLACK_APPLICATION, $list_alt13, $list_alt14, $list_alt15);
        interfaces.interfaces_add_interface_instance_method(PRINT, CYBLACK_APPLICATION, $list_alt17, $list_alt18, $list_alt19);
        interfaces.interfaces_add_interface_instance_method(GET_APPLICATION, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt21);
        interfaces.interfaces_add_interface_instance_method(UNINSTALL, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(DECLARE_SUBTYPE_RELATIONS, CYBLACK_APPLICATION, $list_alt17, $list_alt25, $list_alt26);
        interfaces.interfaces_add_interface_instance_method(DECLARE_SUBTYPE, CYBLACK_APPLICATION, $list_alt17, $list_alt28, $list_alt29);
        interfaces.interfaces_add_interface_instance_method(OVERRIDE_PANEL_TYPE, CYBLACK_APPLICATION, $list_alt17, $list_alt31, $list_alt32);
        interfaces.interfaces_add_interface_instance_method(GET_PANEL_TYPE, CYBLACK_APPLICATION, $list_alt17, $list_alt34, $list_alt35);
        interfaces.interfaces_add_interface_instance_method(DECLARE_STANDARD_TIMER_PANELS, CYBLACK_APPLICATION, $list_alt17, $list_alt37, $list_alt38);
        interfaces.interfaces_add_interface_instance_method(ON_STARTUP, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt40);
        interfaces.interfaces_add_interface_instance_method(ON_QUIESCENCE, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt42);
        interfaces.interfaces_add_interface_instance_method(RESET, CYBLACK_APPLICATION, $list_alt17, $list_alt44, $list_alt45);
        interfaces.interfaces_add_interface_instance_method(AFTER_STARTUP, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt55);
        interfaces.interfaces_add_interface_instance_method(ON_SHUTDOWN, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt57);
        interfaces.interfaces_add_interface_instance_method(ON_HALT, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(ON_HALT_AND_ABORT_SERVER, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(RUN, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt62);
        interfaces.interfaces_add_interface_instance_method(ON_EMPTY_AGENDA, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(BEFORE_AGENDA_EXECUTE, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(AFTER_AGENDA_EXECUTE, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt59);
        interfaces.interfaces_add_interface_instance_method(INVITE_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt66);
        interfaces.interfaces_add_interface_instance_method(CREATE_POSTING, CYBLACK_APPLICATION, $list_alt17, $list_alt68, $list_alt69);
        interfaces.interfaces_add_interface_instance_method(CLOSE_ALL_EXTERNAL_PORTS, CYBLACK_APPLICATION, $list_alt17, NIL, $list_alt71);
        classes.subloop_new_class(CYBLACK_BASIC_APPLICATION, CYBLACK_BASIC_LOCKABLE, $list_alt74, NIL, $list_alt75);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_APPLICATION, NIL);
        methods.methods_incorporate_instance_method(RESET, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt44, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, RESET, CYBLACK_BASIC_APPLICATION_RESET_METHOD);
        methods.methods_incorporate_instance_method(ON_QUIESCENCE, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_QUIESCENCE, CYBLACK_BASIC_APPLICATION_ON_QUIESCENCE_METHOD);
        methods.methods_incorporate_instance_method(CLOSE_ALL_EXTERNAL_PORTS, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, CLOSE_ALL_EXTERNAL_PORTS, CYBLACK_BASIC_APPLICATION_CLOSE_ALL_EXTERNAL_PORTS_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt68, $list_alt69);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, CREATE_POSTING, CYBLACK_BASIC_APPLICATION_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(AFTER_AGENDA_EXECUTE, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, AFTER_AGENDA_EXECUTE, CYBLACK_BASIC_APPLICATION_AFTER_AGENDA_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(BEFORE_AGENDA_EXECUTE, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, BEFORE_AGENDA_EXECUTE, CYBLACK_BASIC_APPLICATION_BEFORE_AGENDA_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(ON_EMPTY_AGENDA, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_EMPTY_AGENDA, CYBLACK_BASIC_APPLICATION_ON_EMPTY_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(RUN, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, RUN, CYBLACK_BASIC_APPLICATION_RUN_METHOD);
        methods.methods_incorporate_instance_method(ON_HALT_AND_ABORT_SERVER, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_HALT_AND_ABORT_SERVER, CYBLACK_BASIC_APPLICATION_ON_HALT_AND_ABORT_SERVER_METHOD);
        methods.methods_incorporate_instance_method(ON_HALT, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_HALT, CYBLACK_BASIC_APPLICATION_ON_HALT_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_SHUTDOWN, CYBLACK_BASIC_APPLICATION_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(AFTER_STARTUP, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, AFTER_STARTUP, CYBLACK_BASIC_APPLICATION_AFTER_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_STARTUP, CYBLACK_BASIC_APPLICATION_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(INVITE_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INVITE_EXTERNAL_KNOWLEDGE_SOURCES, $sym133$CYBLACK_BASIC_APPLICATION_INVITE_EXTERNAL_KNOWLEDGE_SOURCES_METHO);
        methods.methods_incorporate_instance_method(DECLARE_STANDARD_TIMER_PANELS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt37, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, DECLARE_STANDARD_TIMER_PANELS, CYBLACK_BASIC_APPLICATION_DECLARE_STANDARD_TIMER_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL_TYPE, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_PANEL_TYPE, CYBLACK_BASIC_APPLICATION_GET_PANEL_TYPE_METHOD);
        methods.methods_incorporate_instance_method(OVERRIDE_PANEL_TYPE, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt31, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, OVERRIDE_PANEL_TYPE, CYBLACK_BASIC_APPLICATION_OVERRIDE_PANEL_TYPE_METHOD);
        methods.methods_incorporate_instance_method(DECLARE_SUBTYPE, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt28, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, DECLARE_SUBTYPE, CYBLACK_BASIC_APPLICATION_DECLARE_SUBTYPE_METHOD);
        methods.methods_incorporate_instance_method(DECLARE_SUBTYPE_RELATIONS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, DECLARE_SUBTYPE_RELATIONS, CYBLACK_BASIC_APPLICATION_DECLARE_SUBTYPE_RELATIONS_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL, CYBLACK_BASIC_APPLICATION_UNINSTALL_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_APPLICATION, CYBLACK_BASIC_APPLICATION_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt18, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, PRINT, CYBLACK_BASIC_APPLICATION_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_APPLICATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_APPLICATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_APPLICATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_APPLICATION_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_application_class(CYBLACK_BASIC_APPLICATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt170);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INITIALIZE, CYBLACK_BASIC_APPLICATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(STANDARD_INITIALIZATION, CYBLACK_BASIC_APPLICATION, $list_alt184, NIL, $list_alt185);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, STANDARD_INITIALIZATION, CYBLACK_BASIC_APPLICATION_STANDARD_INITIALIZATION_METHOD);
        methods.methods_incorporate_instance_method(NEW_COMPONENT, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt190, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, NEW_COMPONENT, CYBLACK_BASIC_APPLICATION_NEW_COMPONENT_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt198);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_AGENDA_CLASS, CYBLACK_BASIC_APPLICATION_GET_AGENDA_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_AGENDA_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt201, $list_alt202);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_AGENDA_CLASS, CYBLACK_BASIC_APPLICATION_SET_AGENDA_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt208);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_BLACKBOARD_CLASS, CYBLACK_BASIC_APPLICATION_GET_BLACKBOARD_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_BLACKBOARD_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt211, $list_alt212);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_BLACKBOARD_CLASS, CYBLACK_BASIC_APPLICATION_SET_BLACKBOARD_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONNECTION_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_CONNECTION_CLASS, CYBLACK_BASIC_APPLICATION_GET_CONNECTION_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONNECTION_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt221, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_CONNECTION_CLASS, CYBLACK_BASIC_APPLICATION_SET_CONNECTION_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSER_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_PARSER_CLASS, CYBLACK_BASIC_APPLICATION_GET_PARSER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARSER_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt231, $list_alt232);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_PARSER_CLASS, CYBLACK_BASIC_APPLICATION_SET_PARSER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt237);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_MESSAGE_BROKER_CLASS, CYBLACK_BASIC_APPLICATION_GET_MESSAGE_BROKER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGE_BROKER_CLASS, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt240, $list_alt241);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_MESSAGE_BROKER_CLASS, CYBLACK_BASIC_APPLICATION_SET_MESSAGE_BROKER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_PORT_MANAGER, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt245);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_PORT_MANAGER, CYBLACK_BASIC_APPLICATION_GET_PORT_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION_NAME, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt248);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_APPLICATION_NAME, CYBLACK_BASIC_APPLICATION_GET_APPLICATION_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION_NAME, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt251, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_APPLICATION_NAME, CYBLACK_BASIC_APPLICATION_SET_APPLICATION_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt256, $list_alt257);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_APPLICATION, CYBLACK_BASIC_APPLICATION_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_BASIC_APPLICATION_GET_KNOWLEDGE_SOURCE_BATTERY_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt264);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_BLACKBOARD, CYBLACK_BASIC_APPLICATION_GET_BLACKBOARD_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt267);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_AGENDA, CYBLACK_BASIC_APPLICATION_GET_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_DICTIONARY, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_DATATYPE_DICTIONARY, CYBLACK_BASIC_APPLICATION_GET_DATATYPE_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt272);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION_GET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt275);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION_GET_EXTERNAL_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt278, $list_alt279);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION_SET_EXTERNAL_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSER, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt284);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_PARSER, CYBLACK_BASIC_APPLICATION_GET_PARSER_METHOD);
        methods.methods_incorporate_instance_method(SET_PARSER, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt287, $list_alt288);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_PARSER, CYBLACK_BASIC_APPLICATION_SET_PARSER_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt293, $list_alt294);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_BASIC_APPLICATION_INSTALL_KNOWLEDGE_SOURCE_BATTERY_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_BLACKBOARD, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt299, $list_alt300);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_BLACKBOARD, CYBLACK_BASIC_APPLICATION_INSTALL_BLACKBOARD_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_AGENDA, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt306, $list_alt307);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_AGENDA, CYBLACK_BASIC_APPLICATION_INSTALL_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_PARSER, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt287, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_PARSER, CYBLACK_BASIC_APPLICATION_INSTALL_PARSER_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt240, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION_INSTALL_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt278, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION_INSTALL_EXTERNAL_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(INSTALL_PORT_MANAGER, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt323, $list_alt324);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, INSTALL_PORT_MANAGER, CYBLACK_BASIC_APPLICATION_INSTALL_PORT_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt329);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_KNOWLEDGE_SOURCE_BATTERY, $sym331$CYBLACK_BASIC_APPLICATION_UNINSTALL_KNOWLEDGE_SOURCE_BATTERY_METH);
        methods.methods_incorporate_instance_method(UNINSTALL_BLACKBOARD, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt333);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_BLACKBOARD, CYBLACK_BASIC_APPLICATION_UNINSTALL_BLACKBOARD_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_AGENDA, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt337);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_AGENDA, CYBLACK_BASIC_APPLICATION_UNINSTALL_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_PARSER, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_PARSER, CYBLACK_BASIC_APPLICATION_UNINSTALL_PARSER_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION, $list_alt169, NIL, $list_alt345);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_MESSAGE_BROKER, CYBLACK_BASIC_APPLICATION_UNINSTALL_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt349);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_EXTERNAL_CONNECTION, CYBLACK_BASIC_APPLICATION_UNINSTALL_EXTERNAL_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL_PORT_MANAGER, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt353);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNINSTALL_PORT_MANAGER, CYBLACK_BASIC_APPLICATION_UNINSTALL_PORT_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(GET_ROOT_DATATYPE, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt357);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_ROOT_DATATYPE, CYBLACK_BASIC_APPLICATION_GET_ROOT_DATATYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_ROOT_DATATYPE_NAME, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt360);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_ROOT_DATATYPE_NAME, CYBLACK_BASIC_APPLICATION_GET_ROOT_DATATYPE_NAME_METHOD);
        methods.methods_incorporate_instance_method(HALT, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt363);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, HALT, CYBLACK_BASIC_APPLICATION_HALT_METHOD);
        methods.methods_incorporate_instance_method(HALTED_P, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt367);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, HALTED_P, CYBLACK_BASIC_APPLICATION_HALTED_P_METHOD);
        methods.methods_incorporate_instance_method(HALT_AND_ABORT_SERVER, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt371);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, HALT_AND_ABORT_SERVER, CYBLACK_BASIC_APPLICATION_HALT_AND_ABORT_SERVER_METHOD);
        methods.methods_incorporate_class_method(CREATE_APPLICATION, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt374);
        methods.subloop_register_class_method(CYBLACK_BASIC_APPLICATION, CREATE_APPLICATION, CYBLACK_BASIC_APPLICATION_CREATE_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(FIND_PANEL, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt377, $list_alt378);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, FIND_PANEL, CYBLACK_BASIC_APPLICATION_FIND_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_CURRENT_SESSION, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt385);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_CURRENT_SESSION, CYBLACK_BASIC_APPLICATION_GET_CURRENT_SESSION_METHOD);
        methods.methods_incorporate_instance_method(MONITOR, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt388, $list_alt389);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, MONITOR, CYBLACK_BASIC_APPLICATION_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(UNMONITOR, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt388, $list_alt393);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, UNMONITOR, CYBLACK_BASIC_APPLICATION_UNMONITOR_METHOD);
        methods.methods_incorporate_instance_method(REPORT_OUTSTANDING_EXTERNAL_KNOWLEDGE_SOURCES, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt397);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, REPORT_OUTSTANDING_EXTERNAL_KNOWLEDGE_SOURCES, $sym402$CYBLACK_BASIC_APPLICATION_REPORT_OUTSTANDING_EXTERNAL_KNOWLEDGE_S);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_ID, CYBLACK_BASIC_APPLICATION, $list_alt197, $list_alt404, $list_alt405);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_EXTERNAL_MODULE_ID, CYBLACK_BASIC_APPLICATION_GET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING, CYBLACK_BASIC_APPLICATION, $list_alt184, $list_alt408, $list_alt409);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_POSTING, CYBLACK_BASIC_APPLICATION_GET_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_RESULT, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt412);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_RESULT, CYBLACK_BASIC_APPLICATION_GET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(SET_RESULT, CYBLACK_BASIC_APPLICATION, $list_alt415, $list_alt416, $list_alt417);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, SET_RESULT, CYBLACK_BASIC_APPLICATION_SET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(ON_SET_RESULT, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, ON_SET_RESULT, CYBLACK_BASIC_APPLICATION_ON_SET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION_ID, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt422);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_APPLICATION_ID, CYBLACK_BASIC_APPLICATION_GET_APPLICATION_ID_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_GUID_MANAGER, CYBLACK_BASIC_APPLICATION, $list_alt17, $list_alt425, $list_alt426);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, DESCRIBE_GUID_MANAGER, CYBLACK_BASIC_APPLICATION_DESCRIBE_GUID_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_MESSAGE_QUEUE, CYBLACK_BASIC_APPLICATION, $list_alt197, NIL, $list_alt430);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, GET_INCOMING_MESSAGE_QUEUE, CYBLACK_BASIC_APPLICATION_GET_INCOMING_MESSAGE_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(HAS_EXTERNAL_KNOWLEDGE_SOURCES_P, CYBLACK_BASIC_APPLICATION, $list_alt17, NIL, $list_alt433);
        methods.subloop_register_instance_method(CYBLACK_BASIC_APPLICATION, HAS_EXTERNAL_KNOWLEDGE_SOURCES_P, CYBLACK_BASIC_APPLICATION_HAS_EXTERNAL_KNOWLEDGE_SOURCES_P_METHOD);
        classes.subloop_new_class(CYBLACK_SESSION, CYBLACK_OBJECT, NIL, NIL, $list_alt442);
        classes.class_set_implements_slot_listeners(CYBLACK_SESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_INSTANCE);
        subloop_reserved_initialize_cyblack_session_class(CYBLACK_SESSION);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_SESSION, $list_alt197, NIL, $list_alt445);
        methods.subloop_register_instance_method(CYBLACK_SESSION, GET_APPLICATION, CYBLACK_SESSION_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_SESSION, $list_alt17, $list_alt256, $list_alt447);
        methods.subloop_register_instance_method(CYBLACK_SESSION, SET_APPLICATION, CYBLACK_SESSION_SET_APPLICATION_METHOD);
        interfaces.new_interface(CYBLACK_DYNAMIC_APPLICATION, $list_alt74, $list_alt452, $list_alt453);
        interfaces.interfaces_add_interface_instance_method(DYNAMICALLY_ADD_KNOWLEDGE_SOURCE, CYBLACK_DYNAMIC_APPLICATION, $list_alt17, $list_alt455, $list_alt456);
        interfaces.interfaces_add_interface_instance_method(DYNAMICALLY_REMOVE_KNOWLEDGE_SOURCE, CYBLACK_DYNAMIC_APPLICATION, $list_alt17, $list_alt455, $list_alt458);
        interfaces.interfaces_add_interface_instance_method(DYNAMICALLY_ADD_POSTING_CLASS, CYBLACK_DYNAMIC_APPLICATION, $list_alt17, $list_alt460, $list_alt461);
        interfaces.interfaces_add_interface_instance_method(DYNAMICALLY_ADD_PANEL, CYBLACK_DYNAMIC_APPLICATION, $list_alt17, $list_alt463, $list_alt464);
        interfaces.interfaces_add_interface_instance_method(DYNAMICALLY_REMOVE_PANEL, CYBLACK_DYNAMIC_APPLICATION, $list_alt17, $list_alt34, $list_alt466);
        classes.subloop_new_class(CYBLACK_BASIC_DYNAMIC_APPLICATION, CYBLACK_BASIC_APPLICATION, $list_alt468, NIL, $list_alt469);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_DYNAMIC_APPLICATION, NIL);
        methods.methods_incorporate_instance_method(DYNAMICALLY_REMOVE_PANEL, CYBLACK_BASIC_DYNAMIC_APPLICATION, $list_alt17, $list_alt34, $list_alt466);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DYNAMIC_APPLICATION, DYNAMICALLY_REMOVE_PANEL, CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_REMOVE_PANEL_METHOD);
        methods.methods_incorporate_instance_method(DYNAMICALLY_ADD_PANEL, CYBLACK_BASIC_DYNAMIC_APPLICATION, $list_alt17, $list_alt463, $list_alt464);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DYNAMIC_APPLICATION, DYNAMICALLY_ADD_PANEL, CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_PANEL_METHOD);
        methods.methods_incorporate_instance_method(DYNAMICALLY_ADD_POSTING_CLASS, CYBLACK_BASIC_DYNAMIC_APPLICATION, $list_alt17, $list_alt460, $list_alt461);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DYNAMIC_APPLICATION, DYNAMICALLY_ADD_POSTING_CLASS, $sym476$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_POSTING_CLASS_M);
        methods.methods_incorporate_instance_method(DYNAMICALLY_REMOVE_KNOWLEDGE_SOURCE, CYBLACK_BASIC_DYNAMIC_APPLICATION, $list_alt17, $list_alt455, $list_alt458);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DYNAMIC_APPLICATION, DYNAMICALLY_REMOVE_KNOWLEDGE_SOURCE, $sym479$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_REMOVE_KNOWLEDGE_SO);
        methods.methods_incorporate_instance_method(DYNAMICALLY_ADD_KNOWLEDGE_SOURCE, CYBLACK_BASIC_DYNAMIC_APPLICATION, $list_alt17, $list_alt455, $list_alt456);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DYNAMIC_APPLICATION, DYNAMICALLY_ADD_KNOWLEDGE_SOURCE, $sym480$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_KNOWLEDGE_SOURC);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_DYNAMIC_APPLICATION, $sym481$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DYNAMIC_APPLICATION_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_DYNAMIC_APPLICATION, $sym482$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DYNAMIC_APPLICATION_INS);
        subloop_reserved_initialize_cyblack_basic_dynamic_application_class(CYBLACK_BASIC_DYNAMIC_APPLICATION);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("APPLICATION")), makeSymbol("&REST"), makeSymbol("BODY"));



    public static final SubLSymbol $cyblack_application$ = makeSymbol("*CYBLACK-APPLICATION*");

    private static final SubLSymbol CYBLACK_GLOBAL_POSTING_TABLE = makeSymbol("CYBLACK-GLOBAL-POSTING-TABLE");

    static private final SubLList $list_alt4 = list(makeKeyword("BLACKBOARD"), makeKeyword("AGENDA"), makeKeyword("KNOWLEDGE-SOURCE-BATTERY"));

    private static final SubLSymbol CYBLACK_APPLICATION_COMMAND_DESTINATION = makeSymbol("CYBLACK-APPLICATION-COMMAND-DESTINATION");

    static private final SubLString $str_alt6$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_APPLICATION_COMMAND_DESTINATION = makeSymbol("ENCODE-CYBLACK-APPLICATION-COMMAND-DESTINATION");

    static private final SubLString $str_alt8$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_APPLICATION_COMMAND_DESTINATION = makeSymbol("DECODE-CYBLACK-APPLICATION-COMMAND-DESTINATION");

    static private final SubLString $str_alt10$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_APPLICATION_COMMAND_DESTINATION_P = makeSymbol("CYBLACK-APPLICATION-COMMAND-DESTINATION-P");

    private static final SubLSymbol CYBLACK_APPLICATION = makeSymbol("CYBLACK-APPLICATION");

    static private final SubLList $list_alt13 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt14 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    public static final SubLObject $list_alt15 = _constant_15_initializer();



    static private final SubLList $list_alt17 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt18 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("APPLICATION-NAME"), list(makeSymbol("GET-APPLICATION-NAME"), makeSymbol("SELF")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S/~A: ~S>"), makeSymbol("CLASS-NAME"), makeSymbol("APPLICATION-NAME"), makeSymbol("INSTANCE-NUMBER")), list(RET, makeSymbol("SELF"))));



    static private final SubLList $list_alt21 = list(list(RET, makeSymbol("SELF")));



    static private final SubLList $list_alt23 = list(list(makeSymbol("UNINSTALL-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")), list(makeSymbol("UNINSTALL-BLACKBOARD"), makeSymbol("SELF")), list(makeSymbol("UNINSTALL-AGENDA"), makeSymbol("SELF")), list(makeSymbol("UNINSTALL-PARSER"), makeSymbol("SELF")), list(makeSymbol("UNINSTALL"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol DECLARE_SUBTYPE_RELATIONS = makeSymbol("DECLARE-SUBTYPE-RELATIONS");

    static private final SubLList $list_alt25 = list(makeSymbol("SUBTYPE-RELATION-TREE"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-SUBTYPE-RELATION-TREE-P"), makeSymbol("SUBTYPE-RELATION-TREE")), makeString("(DECLARE-SUBTYPE-RELATIONS ~S): ~S is not a valid subtype relation tree."), makeSymbol("SELF"), makeSymbol("SUBTYPE-RELATION-TREE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ROOT-DATATYPE-NAME"), list(makeSymbol("GET-ROOT-DATATYPE-NAME"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("CAR"), makeSymbol("SUBTYPE-RELATION-TREE")), makeSymbol("TEMPLATE-ROOT-DATATYPE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPE-RELATION-TREE"), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-ROOT-DATATYPE-NAME"), makeSymbol("SUBTYPE-RELATION-TREE"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-DECLARE-SUBTYPE-RELATION-TREE-BY-NAMES"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("SUBTYPE-RELATION-TREE")), list(RET, T)), list(RET, NIL)));



    static private final SubLList $list_alt28 = list(makeSymbol("SUBTYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SUPERTYPE"), makeString("POSTING")), list(makeSymbol("POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING"))), list(makeSymbol("PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))));

    static private final SubLList $list_alt29 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("SUBTYPE")), makeString("(DECLARE-SUBTYPE ~S): ~S is not a valid cyblack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("SUBTYPE")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("SUPERTYPE")), makeString("(DECLARE-SUBTYPE ~S): ~S is not a valid cyblack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("SUPERTYPE")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("POSTING-CLASS")), makeString("(DECLARE-SUBTYPE ~S): ~S is not a valid symbolic class name.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("POSTING-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("PANEL-CLASS")), makeString("(DECLARE-SUBTYPE ~S): ~S is not a valid symbolic class name.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-POSTING"))), makeString("(DECLARE-SUBTYPE ~S): ~S does not implement the CYBLACK-POSTING interface."), makeSymbol("SELF"), makeSymbol("POSTING-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PANEL"))), makeString("(DECLARE-SUBTYPE ~S): ~S does not implement the CYBLACK-PANEL interface."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeString("(DECLARE-SUBTYPE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("SUBTYPE-DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("SUBTYPE"))), list(makeSymbol("SUPERTYPE-DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("SUPERTYPE")))), list(makeSymbol("CYBLACK-DECLARE-SUBTYPE-RELATION"), makeSymbol("SUBTYPE-DATATYPE"), makeSymbol("SUPERTYPE-DATATYPE")), list(makeSymbol("CYBLACK-DATATYPE-SET-POSTING-TYPE"), makeSymbol("SUBTYPE-DATATYPE"), makeSymbol("POSTING-CLASS")), list(makeSymbol("CYBLACK-DATATYPE-SET-PANEL-TYPE"), makeSymbol("SUBTYPE-DATATYPE"), makeSymbol("PANEL-CLASS")), list(RET, makeSymbol("SUBTYPE-DATATYPE")))));

    private static final SubLSymbol OVERRIDE_PANEL_TYPE = makeSymbol("OVERRIDE-PANEL-TYPE");

    static private final SubLList $list_alt31 = list(makeSymbol("TYPE"), makeSymbol("PANEL-CLASS"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE")), makeString("(OVERRIDE-PANEL-TYPE ~S): ~S is not a valid cyblack datatype.  ~\n     A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("PANEL-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("PANEL-CLASS"))), makeString("(OVERRIDE-PANEL-TYPE ~S): ~S is not a valid panel class.  ~\n     A non nil symbol was expected."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeString("(OVERRIDE-PANEL-TYPE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TYPE")))), list(makeSymbol("CYBLACK-DATATYPE-SET-PANEL-TYPE"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("PANEL-CLASS")), list(RET, makeSymbol("PANEL-CLASS")))));

    private static final SubLSymbol GET_PANEL_TYPE = makeSymbol("GET-PANEL-TYPE");

    static private final SubLList $list_alt34 = list(makeSymbol("TYPE"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE")), makeString("(GET-PANEL-TYPE ~S): ~S is not a valid cyblack datatype.  ~\n     A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeString("(GET-PANEL-TYPE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TYPE")))), list(RET, list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL-TYPE"), makeSymbol("TEMPLATE-DATATYPE"))))));

    private static final SubLSymbol DECLARE_STANDARD_TIMER_PANELS = makeSymbol("DECLARE-STANDARD-TIMER-PANELS");

    static private final SubLList $list_alt37 = list(makeSymbol("TIMER-INTERVALS"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-TIMER-INTERVAL-LIST-P"), makeSymbol("TIMER-INTERVALS")), makeString("(DECLARE-STANDARD-TIMER-PANELS ~S): ~S is not a list of CYBLACK-TIMER-INTERVAL enumeration members."), makeSymbol("SELF"), makeSymbol("TIMER-INTERVALS")), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("TIMER"), makeString("POSTING"), list(QUOTE, makeSymbol("CYBLACK-TIMER-POSTING")), list(QUOTE, makeSymbol("CYBLACK-TIMER-PANEL"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-INTERVAL"), NIL)), list(makeSymbol("CDOSUBLISTS"), list(makeSymbol("TEMPLATE-SUBLIST"), makeSymbol("TIMER-INTERVALS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-INTERVAL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLIST"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-INTERVAL"), makeSymbol("TEMPLATE-SUBLIST")), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), list(makeSymbol("CYBLACK-TIME-INTERVAL-TO-TYPE-NAME"), makeSymbol("TEMPLATE-INTERVAL")), makeString("TIMER"), list(makeSymbol("CYBLACK-TIME-INTERVAL-TO-POSTING"), makeSymbol("TEMPLATE-INTERVAL")), list(makeSymbol("CYBLACK-TIME-INTERVAL-TO-PANEL"), makeSymbol("TEMPLATE-INTERVAL")))))), list(RET, NIL));



    static private final SubLList $list_alt40 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("MULTIPLE"), makeSymbol("*CYBLACK-CONNECTION-MODES*")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATED-PORT-MANAGER"), list(makeSymbol("GET-PORT-MANAGER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATED-PORT-MANAGER"), list(makeSymbol("CYBLACK-START-PORT-MANAGER"), makeSymbol("TEMPLATED-PORT-MANAGER"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MESSAGE-BROKER"), list(makeSymbol("GET-MESSAGE-BROKER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ON-STARTUP"), makeSymbol("TEMPLATE-MESSAGE-BROKER")), makeSymbol("TEMPLATE-MESSAGE-BROKER")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-AGENDA"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-BLACKBOARD"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-BLACKBOARD"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARSER"), list(makeSymbol("GET-PARSER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PARSER"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PARSER"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KSB"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KSB"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(RET, NIL));



    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-QUIESCENCE-PANEL"), list(makeSymbol("FIND-PANEL"), makeSymbol("SELF"), makeString("INTERNAL-QUIESCENCE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-QUIESCENCE-PANEL"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CYBLACK-PANEL-GET-DATATYPE"), makeSymbol("TEMPLATE-QUIESCENCE-PANEL")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-POSTING"), makeSymbol("TEMPLATE-DATATYPE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-POSTING"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("TEMPLATE-BLACKBOARD"), makeSymbol("TEMPLATE-POSTING"))))))))), list(RET, NIL)));



    static private final SubLList $list_alt44 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("COMMAND-DESTINATIONS"), makeSymbol("*VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS*")));

    static private final SubLList $list_alt45 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("COMMAND-DESTINATION"), makeSymbol("COMMAND-DESTINATIONS")), list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("COMMAND-DESTINATION")), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-PANEL"), list(makeSymbol("FIND-PANEL"), makeSymbol("SELF"), makeSymbol("COMMAND-DESTINATION")))), list(makeSymbol("PWHEN"), makeSymbol("TARGET-PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TARGET-PANEL"), list(QUOTE, makeSymbol("REMOVE-DIRECT-POSTINGS"))))), list(makeSymbol("PCASE"), makeSymbol("COMMAND-DESTINATION"), list(makeKeyword("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-BLACKBOARD"), list(QUOTE, makeSymbol("RESET"))))), list(makeKeyword("AGENDA"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-AGENDA"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("RESET"))))), list(makeKeyword("KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KSB"), list(QUOTE, makeSymbol("RESET")))))))), list(RET, NIL));

    private static final SubLSymbol GET_PORT_MANAGER = makeSymbol("GET-PORT-MANAGER");







    static private final SubLString $str_alt50$__Waiting_until_external_ports_ar = makeString("~%Waiting until external ports are connected.");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt52$__Inviting_external_knowledge_sou = makeString("~%Inviting external knowledge sources.");

    private static final SubLSymbol INVITE_EXTERNAL_KNOWLEDGE_SOURCES = makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES");



    static private final SubLList $list_alt55 = list(list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-PORT-MANAGER-CONNECT-TARGET-APPLICATION*"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MAKE-PROCESS"), list(makeSymbol("GET-APPLICATION-ID"), makeSymbol("SELF")), makeString("AFTER-STARTUP"), list(QUOTE, makeSymbol("CYBLACK-APPLICATION-AFTER-STARTUP-ASYNCHRONOUS-KS-INVITATIONS"))), list(RET, NIL));



    static private final SubLList $list_alt57 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KSB"), list(QUOTE, makeSymbol("ON-SHUTDOWN")))), list(RET, NIL)));

    private static final SubLSymbol ON_HALT = makeSymbol("ON-HALT");

    static private final SubLList $list_alt59 = list(list(RET, NIL));

    private static final SubLSymbol ON_HALT_AND_ABORT_SERVER = makeSymbol("ON-HALT-AND-ABORT-SERVER");



    static private final SubLList $list_alt62 = list(list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%Running Application.")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-AGENDA"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-RESET-POSTING-MANAGEMENT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-STARTUP"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AFTER-STARTUP"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-EMPTY-AGENDA")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("HALTED-P"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("BEFORE-AGENDA-EXECUTE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("EXECUTE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AFTER-AGENDA-EXECUTE"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-AGENDA"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-EMPTY-AGENDA"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-SHUTDOWN"))), list(RET, NIL) }));



    private static final SubLSymbol BEFORE_AGENDA_EXECUTE = makeSymbol("BEFORE-AGENDA-EXECUTE");

    private static final SubLSymbol AFTER_AGENDA_EXECUTE = makeSymbol("AFTER-AGENDA-EXECUTE");

    static private final SubLList $list_alt66 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("WARN"), makeString("(INVITE-EXTERNAL-KNOWLEDGE-SOURCES ~S): Could not invite external knowledge sources as no knowledge source battery is currently installed."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-KSB"), list(QUOTE, makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES"))), list(RET, NIL)));



    static private final SubLList $list_alt68 = list(makeSymbol("DATATYPE-NAME"));

    static private final SubLList $list_alt69 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("DATATYPE-NAME")), makeString("(CREATE-POSTING ~S): ~S is not a legal datatype name.  A string was expected."), makeSymbol("SELF"), makeSymbol("DATATYPE-NAME")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeString("(CREATE-POSTING ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("DATATYPE-NAME")))), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-POSTING"), makeSymbol("TEMPLATE-DATATYPE")))), list(makeSymbol("MUST"), makeSymbol("POSTING"), makeString("(CREATE-POSTING ~S): Datatype ~S failed to create a posting."), makeSymbol("SELF"), makeSymbol("TEMPLATE-DATATYPE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(RET, makeSymbol("POSTING"))))));

    private static final SubLSymbol CLOSE_ALL_EXTERNAL_PORTS = makeSymbol("CLOSE-ALL-EXTERNAL-PORTS");

    static private final SubLList $list_alt71 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PORT-MANAGER"), list(makeSymbol("GET-PORT-MANAGER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PORT-MANAGER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PORT-MANAGER"), list(QUOTE, makeSymbol("CLOSE-ALL-PORTS"))))), list(RET, T));





    static private final SubLList $list_alt74 = list(makeSymbol("CYBLACK-APPLICATION"));

    public static final SubLObject $list_alt75 = _constant_75_initializer();

    public static final SubLInteger $int$25 = makeInteger(25);



    public static final SubLInteger $int$24 = makeInteger(24);



    public static final SubLInteger $int$23 = makeInteger(23);



    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);















    private static final SubLSymbol ROOT_DATATYPE = makeSymbol("ROOT-DATATYPE");





















    public static final SubLInteger $int$4097 = makeInteger(4097);



    private static final SubLSymbol $BLACKBOARD = makeKeyword("BLACKBOARD");



    private static final SubLSymbol $KNOWLEDGE_SOURCE_BATTERY = makeKeyword("KNOWLEDGE-SOURCE-BATTERY");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_RESET_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-RESET-METHOD");

    static private final SubLString $str_alt109$INTERNAL_QUIESCENCE = makeString("INTERNAL-QUIESCENCE");



    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_QUIESCENCE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-QUIESCENCE-METHOD");

    private static final SubLSymbol CLOSE_ALL_PORTS = makeSymbol("CLOSE-ALL-PORTS");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_CLOSE_ALL_EXTERNAL_PORTS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-CLOSE-ALL-EXTERNAL-PORTS-METHOD");

    static private final SubLString $str_alt114$_CREATE_POSTING__S____S_is_not_a_ = makeString("(CREATE-POSTING ~S): ~S is not a legal datatype name.  A string was expected.");

    static private final SubLString $str_alt115$_CREATE_POSTING__S___No_datatype_ = makeString("(CREATE-POSTING ~S): No datatype dictionary is associated with the application ~S.");

    static private final SubLString $str_alt116$_CREATE_POSTING__S___Datatype__S_ = makeString("(CREATE-POSTING ~S): Datatype ~S failed to create a posting.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_CREATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-CREATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_AFTER_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-AFTER-AGENDA-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_BEFORE_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-BEFORE-AGENDA-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_EMPTY_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-EMPTY-AGENDA-METHOD");

    static private final SubLString $str_alt121$__Running_Application_ = makeString("~%Running Application.");





    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_RUN_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-RUN-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_HALT_AND_ABORT_SERVER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-HALT-AND-ABORT-SERVER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_HALT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-HALT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-SHUTDOWN-METHOD");

    static private final SubLString $str_alt128$AFTER_STARTUP = makeString("AFTER-STARTUP");

    private static final SubLSymbol CYBLACK_APPLICATION_AFTER_STARTUP_ASYNCHRONOUS_KS_INVITATIONS = makeSymbol("CYBLACK-APPLICATION-AFTER-STARTUP-ASYNCHRONOUS-KS-INVITATIONS");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_AFTER_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-AFTER-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-STARTUP-METHOD");

    static private final SubLString $str_alt132$_INVITE_EXTERNAL_KNOWLEDGE_SOURCE = makeString("(INVITE-EXTERNAL-KNOWLEDGE-SOURCES ~S): Could not invite external knowledge sources as no knowledge source battery is currently installed.");

    static private final SubLSymbol $sym133$CYBLACK_BASIC_APPLICATION_INVITE_EXTERNAL_KNOWLEDGE_SOURCES_METHO = makeSymbol("CYBLACK-BASIC-APPLICATION-INVITE-EXTERNAL-KNOWLEDGE-SOURCES-METHOD");

    static private final SubLString $str_alt134$_DECLARE_STANDARD_TIMER_PANELS__S = makeString("(DECLARE-STANDARD-TIMER-PANELS ~S): ~S is not a list of CYBLACK-TIMER-INTERVAL enumeration members.");

    static private final SubLString $$$TIMER = makeString("TIMER");

    static private final SubLString $$$POSTING = makeString("POSTING");

    private static final SubLSymbol CYBLACK_TIMER_POSTING = makeSymbol("CYBLACK-TIMER-POSTING");

    private static final SubLSymbol CYBLACK_TIMER_PANEL = makeSymbol("CYBLACK-TIMER-PANEL");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_DECLARE_STANDARD_TIMER_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-DECLARE-STANDARD-TIMER-PANELS-METHOD");

    static private final SubLString $str_alt140$_GET_PANEL_TYPE__S____S_is_not_a_ = makeString("(GET-PANEL-TYPE ~S): ~S is not a valid cyblack datatype.  ~\n     A string was expected.");

    static private final SubLString $str_alt141$_GET_PANEL_TYPE__S___No_datatype_ = makeString("(GET-PANEL-TYPE ~S): No datatype dictionary is associated with application ~S.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_PANEL_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-PANEL-TYPE-METHOD");

    static private final SubLString $str_alt143$_OVERRIDE_PANEL_TYPE__S____S_is_n = makeString("(OVERRIDE-PANEL-TYPE ~S): ~S is not a valid cyblack datatype.  ~\n     A string was expected.");

    static private final SubLString $str_alt144$_OVERRIDE_PANEL_TYPE__S____S_is_n = makeString("(OVERRIDE-PANEL-TYPE ~S): ~S is not a valid panel class.  ~\n     A non nil symbol was expected.");

    static private final SubLString $str_alt145$_OVERRIDE_PANEL_TYPE__S___No_data = makeString("(OVERRIDE-PANEL-TYPE ~S): No datatype dictionary is associated with application ~S.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_OVERRIDE_PANEL_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-OVERRIDE-PANEL-TYPE-METHOD");





    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_DECLARE_SUBTYPE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-DECLARE-SUBTYPE-METHOD");

    static private final SubLString $str_alt150$_DECLARE_SUBTYPE_RELATIONS__S____ = makeString("(DECLARE-SUBTYPE-RELATIONS ~S): ~S is not a valid subtype relation tree.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_DECLARE_SUBTYPE_RELATIONS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-DECLARE-SUBTYPE-RELATIONS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-APPLICATION-METHOD");

    static private final SubLSymbol $sym154$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt155$___S__A___S_ = makeString("#<~S/~A: ~S>");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-PRINT-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_APPLICATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-APPLICATION-CLASS");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_APPLICATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-APPLICATION-INSTANCE");



    static private final SubLList $list_alt169 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt170 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-CYBLACK-BASIC-APPLICATION-APPLICATION-ID"), makeSymbol("SELF"), list(makeSymbol("CYBLACK-ALLOCATE-APPLICATION-ID"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-TABLE"), list(makeSymbol("NEW-EXTERNAL-MODULE-TABLE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA"))), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-BLACKBOARD"))), list(makeSymbol("CSETQ"), makeSymbol("CONNECTION-CLASS"), list(QUOTE, makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION"))), list(makeSymbol("CSETQ"), makeSymbol("PARSER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PARSER"))), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))), list(makeSymbol("CSETQ"), makeSymbol("HALT-STATUS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-NAME"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD"), NIL), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-DICTIONARY"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("ROOT-DATATYPE-NAME"), makeString("POSTING")), list(makeSymbol("CSETQ"), makeSymbol("ROOT-DATATYPE"), list(makeSymbol("CYBLACK-DECLARE-ROOT-TYPE"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("ROOT-DATATYPE-NAME"), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SESSION"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("CYBLACK-SESSION")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-SESSION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym171$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA");



    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION");

    private static final SubLSymbol CYBLACK_PARSER = makeSymbol("CYBLACK-PARSER");



    static private final SubLString $str_alt178$ = makeString("");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY");



    private static final SubLSymbol CYBLACK_SESSION = makeSymbol("CYBLACK-SESSION");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INITIALIZE-METHOD");

    private static final SubLSymbol STANDARD_INITIALIZATION = makeSymbol("STANDARD-INITIALIZATION");

    static private final SubLList $list_alt184 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt185 = list(list(makeSymbol("PUNLESS"), makeSymbol("*CYBLACK-SERVER-INITIALIZED*"), list(makeSymbol("CYBLACK-CREATE-SERVER-QUEUES")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-SERVER-INITIALIZED*"), T)), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER-CLASS"), list(makeSymbol("GET-MESSAGE-BROKER-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER-CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-MESSAGE-BROKER"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("MESSAGE-BROKER-CLASS")))), list(makeSymbol("INSTALL-MESSAGE-BROKER"), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION-CLASS"), list(makeSymbol("GET-CONNECTION-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("CONNECTION-CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("CONNECTION-CLASS")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CONNECTION"), list(QUOTE, makeSymbol("ASSIGN-MESSAGE-BROKER")), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("INSTALL-EXTERNAL-CONNECTION"), makeSymbol("SELF"), makeSymbol("CONNECTION")))))))), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA-CLASS"), list(makeSymbol("GET-AGENDA-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("AGENDA-CLASS"), list(makeSymbol("INSTALL-AGENDA"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("AGENDA-CLASS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD-CLASS"), list(makeSymbol("GET-BLACKBOARD-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD-CLASS"), list(makeSymbol("INSTALL-BLACKBOARD"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("BLACKBOARD-CLASS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("PARSER-CLASS"), list(makeSymbol("GET-PARSER-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("PARSER-CLASS"), list(makeSymbol("INSTALL-PARSER"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("PARSER-CLASS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT-MANAGER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-PORT-MANAGER"))))), list(makeSymbol("INSTALL-PORT-MANAGER"), makeSymbol("SELF"), makeSymbol("PORT-MANAGER"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ASSIGN_MESSAGE_BROKER = makeSymbol("ASSIGN-MESSAGE-BROKER");



    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_STANDARD_INITIALIZATION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-STANDARD-INITIALIZATION-METHOD");

    private static final SubLSymbol NEW_COMPONENT = makeSymbol("NEW-COMPONENT");

    static private final SubLList $list_alt190 = list(makeSymbol("COMPONENT-CLASS"));

    static private final SubLList $list_alt191 = list(list(makeSymbol("MUST"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("COMPONENT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-COMPONENT"))), makeString("(NEW-COMPONENT ~S): ~S does not implement the CYBLACK-COMPONENT interface."), makeSymbol("SELF"), makeSymbol("COMPONENT-CLASS")), list(makeSymbol("MUST"), list(makeSymbol("SUBCLASSP"), makeSymbol("COMPONENT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-OBJECT"))), makeString("(NEW-COMPONENT ~S): ~S is not a subclass of CYBLACK-OBJECT."), makeSymbol("SELF"), makeSymbol("COMPONENT-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-OBJECT")), makeSymbol("COMPONENT-CLASS")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-OBJECT")), makeSymbol("NEW-INSTANCE"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-INSTANCE"))));



    static private final SubLString $str_alt193$_NEW_COMPONENT__S____S_does_not_i = makeString("(NEW-COMPONENT ~S): ~S does not implement the CYBLACK-COMPONENT interface.");

    static private final SubLString $str_alt194$_NEW_COMPONENT__S____S_is_not_a_s = makeString("(NEW-COMPONENT ~S): ~S is not a subclass of CYBLACK-OBJECT.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_NEW_COMPONENT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-NEW-COMPONENT-METHOD");



    static private final SubLList $list_alt197 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt198 = list(list(RET, makeSymbol("AGENDA-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_AGENDA_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-AGENDA-CLASS-METHOD");

    private static final SubLSymbol SET_AGENDA_CLASS = makeSymbol("SET-AGENDA-CLASS");

    static private final SubLList $list_alt201 = list(makeSymbol("NEW-AGENDA-CLASS"));

    static private final SubLList $list_alt202 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-AGENDA-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-AGENDA-CLASS"), list(QUOTE, makeSymbol("CYBLACK-AGENDA")))), makeString("(SET-AGENDA-CLASS ~S): ~S does not implement the CYLACK-AGENDA interface."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-CLASS"), makeSymbol("NEW-AGENDA-CLASS")), list(RET, makeSymbol("NEW-AGENDA-CLASS")));

    static private final SubLSymbol $sym203$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");



    static private final SubLString $str_alt205$_SET_AGENDA_CLASS__S____S_does_no = makeString("(SET-AGENDA-CLASS ~S): ~S does not implement the CYLACK-AGENDA interface.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_AGENDA_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-AGENDA-CLASS-METHOD");

    private static final SubLSymbol GET_BLACKBOARD_CLASS = makeSymbol("GET-BLACKBOARD-CLASS");

    static private final SubLList $list_alt208 = list(list(RET, makeSymbol("BLACKBOARD-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_BLACKBOARD_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-BLACKBOARD-CLASS-METHOD");

    private static final SubLSymbol SET_BLACKBOARD_CLASS = makeSymbol("SET-BLACKBOARD-CLASS");

    static private final SubLList $list_alt211 = list(makeSymbol("NEW-BLACKBOARD-CLASS"));

    static private final SubLList $list_alt212 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-BLACKBOARD-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-BLACKBOARD-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BLACKBOARD")))), makeString("(SET-BLACKBOARD-CLASS ~S): ~S does not implement the CYBLACK-BLACKBOARD interface."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-CLASS"), makeSymbol("NEW-BLACKBOARD-CLASS")), list(RET, makeSymbol("NEW-BLACKBOARD-CLASS")));

    static private final SubLSymbol $sym213$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BLACKBOARD = makeSymbol("CYBLACK-BLACKBOARD");

    static private final SubLString $str_alt215$_SET_BLACKBOARD_CLASS__S____S_doe = makeString("(SET-BLACKBOARD-CLASS ~S): ~S does not implement the CYBLACK-BLACKBOARD interface.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_BLACKBOARD_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-BLACKBOARD-CLASS-METHOD");

    private static final SubLSymbol GET_CONNECTION_CLASS = makeSymbol("GET-CONNECTION-CLASS");

    static private final SubLList $list_alt218 = list(list(RET, makeSymbol("CONNECTION-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_CONNECTION_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-CONNECTION-CLASS-METHOD");

    private static final SubLSymbol SET_CONNECTION_CLASS = makeSymbol("SET-CONNECTION-CLASS");

    static private final SubLList $list_alt221 = list(makeSymbol("NEW-CONNECTION-CLASS"));

    static private final SubLList $list_alt222 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CONNECTION-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-CONNECTION-CLASS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-CONNECTION")))), makeString("(SET-CONNECTION-CLASS ~S): ~S is not a subclass of CYBLACK-EXTERNAL-CONNECTION."), makeSymbol("SELF"), makeSymbol("NEW-CONNECTION-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("CONNECTION-CLASS"), makeSymbol("NEW-CONNECTION-CLASS")), list(RET, makeSymbol("NEW-CONNECTION-CLASS")));

    static private final SubLSymbol $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-EXTERNAL-CONNECTION");

    static private final SubLString $str_alt225$_SET_CONNECTION_CLASS__S____S_is_ = makeString("(SET-CONNECTION-CLASS ~S): ~S is not a subclass of CYBLACK-EXTERNAL-CONNECTION.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_CONNECTION_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-CONNECTION-CLASS-METHOD");

    private static final SubLSymbol GET_PARSER_CLASS = makeSymbol("GET-PARSER-CLASS");

    static private final SubLList $list_alt228 = list(list(RET, makeSymbol("PARSER-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_PARSER_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-PARSER-CLASS-METHOD");

    private static final SubLSymbol SET_PARSER_CLASS = makeSymbol("SET-PARSER-CLASS");

    static private final SubLList $list_alt231 = list(makeSymbol("NEW-PARSER-CLASS"));

    static private final SubLList $list_alt232 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARSER-CLASS")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-PARSER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PARSER")))), makeString("(SET-PARSER-CLASS ~S): ~S is not a subclass of CYBLACK-PARSER."), makeSymbol("SELF"), makeSymbol("NEW-PARSER-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("PARSER-CLASS"), makeSymbol("NEW-PARSER-CLASS")), list(RET, makeSymbol("NEW-PARSER-CLASS")));

    static private final SubLSymbol $sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt234$_SET_PARSER_CLASS__S____S_is_not_ = makeString("(SET-PARSER-CLASS ~S): ~S is not a subclass of CYBLACK-PARSER.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_PARSER_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-PARSER-CLASS-METHOD");

    private static final SubLSymbol GET_MESSAGE_BROKER_CLASS = makeSymbol("GET-MESSAGE-BROKER-CLASS");

    static private final SubLList $list_alt237 = list(list(RET, makeSymbol("MESSAGE-BROKER-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_MESSAGE_BROKER_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-MESSAGE-BROKER-CLASS-METHOD");

    private static final SubLSymbol SET_MESSAGE_BROKER_CLASS = makeSymbol("SET-MESSAGE-BROKER-CLASS");

    static private final SubLList $list_alt240 = list(makeSymbol("NEW-MESSAGE-BROKER"));

    static private final SubLList $list_alt241 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("SUBCLASSP"), makeSymbol("NEW-MESSAGE-BROKER"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER")))), makeString("(SET-MESSAGE-BROKER-CLASS ~S): ~S is not a subclass of CYBLACK-MESSAGE-BROKER."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER-CLASS"), makeSymbol("NEW-MESSAGE-BROKER")), list(RET, makeSymbol("NEW-MESSAGE-BROKER")));

    static private final SubLSymbol $sym242$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt243$_SET_MESSAGE_BROKER_CLASS__S____S = makeString("(SET-MESSAGE-BROKER-CLASS ~S): ~S is not a subclass of CYBLACK-MESSAGE-BROKER.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_MESSAGE_BROKER_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-MESSAGE-BROKER-CLASS-METHOD");

    static private final SubLList $list_alt245 = list(list(RET, makeSymbol("PORT-MANAGER")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_PORT_MANAGER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-PORT-MANAGER-METHOD");



    static private final SubLList $list_alt248 = list(list(RET, makeSymbol("APPLICATION-NAME")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_APPLICATION_NAME_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-APPLICATION-NAME-METHOD");



    static private final SubLList $list_alt251 = list(makeSymbol("NEW-APPLICATION-NAME"));

    static private final SubLList $list_alt252 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("NEW-APPLICATION-NAME")), makeString("(SET-APPLICATION-NAME ~S): ~S is not a valid application name.  A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION-NAME")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-NAME"), makeSymbol("NEW-APPLICATION-NAME")), list(RET, makeSymbol("APPLICATION-NAME")));

    static private final SubLSymbol $sym253$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt254$_SET_APPLICATION_NAME__S____S_is_ = makeString("(SET-APPLICATION-NAME ~S): ~S is not a valid application name.  A string was expected.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_APPLICATION_NAME_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-APPLICATION-NAME-METHOD");

    static private final SubLList $list_alt256 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt257 = list(list(makeSymbol("MUST"), list(EQ, makeSymbol("NEW-APPLICATION"), makeSymbol("SELF")), makeString("(SET-APPLICATION ~S): An application\'s application cannot be set to any application but itself.~%~\n     ~S is not the same application instance as ~S."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLString $str_alt258$_SET_APPLICATION__S___An_applicat = makeString("(SET-APPLICATION ~S): An application\'s application cannot be set to any application but itself.~%~\n     ~S is not the same application instance as ~S.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt261 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE-BATTERY")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD");



    static private final SubLList $list_alt264 = list(list(RET, makeSymbol("BLACKBOARD")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_BLACKBOARD_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-BLACKBOARD-METHOD");



    static private final SubLList $list_alt267 = list(list(RET, makeSymbol("AGENDA")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-AGENDA-METHOD");



    static private final SubLList $list_alt270 = list(list(RET, makeSymbol("DATATYPE-DICTIONARY")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_DATATYPE_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-DATATYPE-DICTIONARY-METHOD");

    static private final SubLList $list_alt272 = list(list(RET, makeSymbol("MESSAGE-BROKER")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-MESSAGE-BROKER-METHOD");



    static private final SubLList $list_alt275 = list(list(RET, makeSymbol("EXTERNAL-CONNECTION")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_EXTERNAL_CONNECTION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol SET_EXTERNAL_CONNECTION = makeSymbol("SET-EXTERNAL-CONNECTION");

    static private final SubLList $list_alt278 = list(makeSymbol("NEW-EXTERNAL-CONNECTION"));

    static private final SubLList $list_alt279 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-CONNECTION")), list(makeSymbol("CYBLACK-EXTERNAL-CONNECTION-P"), makeSymbol("NEW-EXTERNAL-CONNECTION"))), makeString("(SET-EXTERNAL-CONNECTION ~S): ~S is not an instance of CYBLACK-EXTERNAL-CONNECTION."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-CONNECTION")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-CONNECTION"), makeSymbol("NEW-EXTERNAL-CONNECTION")), list(RET, makeSymbol("NEW-EXTERNAL-CONNECTION")));

    static private final SubLSymbol $sym280$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt281$_SET_EXTERNAL_CONNECTION__S____S_ = makeString("(SET-EXTERNAL-CONNECTION ~S): ~S is not an instance of CYBLACK-EXTERNAL-CONNECTION.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_EXTERNAL_CONNECTION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-EXTERNAL-CONNECTION-METHOD");



    static private final SubLList $list_alt284 = list(list(RET, makeSymbol("PARSER")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_PARSER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-PARSER-METHOD");

    private static final SubLSymbol SET_PARSER = makeSymbol("SET-PARSER");

    static private final SubLList $list_alt287 = list(makeSymbol("NEW-PARSER"));

    static private final SubLList $list_alt288 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARSER")), list(makeSymbol("CYBLACK-PARSER-P"), makeSymbol("NEW-PARSER"))), makeString("(SET-PARSER ~S): ~S is not an instance of CYBLACK-PARSER."), makeSymbol("SELF"), makeSymbol("NEW-PARSER")), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), makeSymbol("NEW-PARSER")), list(RET, makeSymbol("NEW-PARSER")));

    static private final SubLSymbol $sym289$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt290$_SET_PARSER__S____S_is_not_an_ins = makeString("(SET-PARSER ~S): ~S is not an instance of CYBLACK-PARSER.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_PARSER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-PARSER-METHOD");

    private static final SubLSymbol INSTALL_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY");

    static private final SubLList $list_alt293 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY"));

    static private final SubLList $list_alt294 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-BATTERY-P"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), makeString("(INSTALL-KNOWLEDGE-SOURCE-BATTERY ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY."), makeSymbol("SELF"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), list(RET, NIL)), list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("UNINSTALL-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")));

    static private final SubLSymbol $sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt296$_INSTALL_KNOWLEDGE_SOURCE_BATTERY = makeString("(INSTALL-KNOWLEDGE-SOURCE-BATTERY ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol INSTALL_BLACKBOARD = makeSymbol("INSTALL-BLACKBOARD");

    static private final SubLList $list_alt299 = list(makeSymbol("NEW-BLACKBOARD"));

    static private final SubLList $list_alt300 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-BLACKBOARD-P"), makeSymbol("NEW-BLACKBOARD")), makeString("(INSTALL-BLACKBOARD ~S): ~S is not an instance of CYBLACK-BLACKBOARD."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD-APPLICATION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-APPLICATION"), makeSymbol("CYBLACK-OBJECT")), makeSymbol("NEW-BLACKBOARD")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("BLACKBOARD-APPLICATION")), list(EQ, makeSymbol("BLACKBOARD-APPLICATION"), makeSymbol("SELF"))), makeString("(INSTALL-BLACKBOARD ~S): ~S is already installed in application ~S."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD"), makeSymbol("BLACKBOARD-APPLICATION"))), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD"), makeSymbol("NEW-BLACKBOARD")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-OBJECT")), makeSymbol("NEW-BLACKBOARD"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-BLACKBOARD")));

    static private final SubLSymbol $sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt302$_INSTALL_BLACKBOARD__S____S_is_no = makeString("(INSTALL-BLACKBOARD ~S): ~S is not an instance of CYBLACK-BLACKBOARD.");

    static private final SubLString $str_alt303$_INSTALL_BLACKBOARD__S____S_is_al = makeString("(INSTALL-BLACKBOARD ~S): ~S is already installed in application ~S.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_BLACKBOARD_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-BLACKBOARD-METHOD");

    private static final SubLSymbol INSTALL_AGENDA = makeSymbol("INSTALL-AGENDA");

    static private final SubLList $list_alt306 = list(makeSymbol("NEW-AGENDA"));

    static private final SubLList $list_alt307 = list(list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), makeSymbol("NEW-AGENDA")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-AGENDA"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-AGENDA")));

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-AGENDA-METHOD");

    private static final SubLSymbol INSTALL_PARSER = makeSymbol("INSTALL-PARSER");

    static private final SubLList $list_alt311 = list(list(makeSymbol("CSETQ"), makeSymbol("PARSER"), makeSymbol("NEW-PARSER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-PARSER"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-PARSER")));

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_PARSER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-PARSER-METHOD");

    private static final SubLSymbol INSTALL_MESSAGE_BROKER = makeSymbol("INSTALL-MESSAGE-BROKER");

    static private final SubLList $list_alt315 = list(list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("PWHEN"), makeSymbol("NEW-MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("NEW-MESSAGE-BROKER"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("PORT-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"), makeSymbol("NEW-MESSAGE-BROKER"))), list(RET, makeSymbol("NEW-MESSAGE-BROKER")));

    static private final SubLSymbol $sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol INSTALL_EXTERNAL_CONNECTION = makeSymbol("INSTALL-EXTERNAL-CONNECTION");

    static private final SubLList $list_alt319 = list(list(makeSymbol("SET-EXTERNAL-CONNECTION"), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-CONNECTION")), list(makeSymbol("PWHEN"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-EXTERNAL-CONNECTION")), makeSymbol("NEW-EXTERNAL-CONNECTION"), makeSymbol("APPLICATION"))), list(RET, makeSymbol("NEW-EXTERNAL-CONNECTION")));

    static private final SubLSymbol $sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_EXTERNAL_CONNECTION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol INSTALL_PORT_MANAGER = makeSymbol("INSTALL-PORT-MANAGER");

    static private final SubLList $list_alt323 = list(makeSymbol("NEW-PORT-MANAGER"));

    static private final SubLList $list_alt324 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PORT-MANAGER-P"), makeSymbol("NEW-PORT-MANAGER")), makeString("(INSTALL-PORT-MANAGER ~S): ~S is not an instance of CYBLACK-PORT-MANAGER."), makeSymbol("SELF"), makeSymbol("NEW-PORT-MANAGER")), list(makeSymbol("CSETQ"), makeSymbol("PORT-MANAGER"), makeSymbol("NEW-PORT-MANAGER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("NEW-PORT-MANAGER"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("NEW-PORT-MANAGER"), makeSymbol("MESSAGE-BROKER"))), list(RET, makeSymbol("NEW-PORT-MANAGER")));

    static private final SubLSymbol $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt326$_INSTALL_PORT_MANAGER__S____S_is_ = makeString("(INSTALL-PORT-MANAGER ~S): ~S is not an instance of CYBLACK-PORT-MANAGER.");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_INSTALL_PORT_MANAGER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-INSTALL-PORT-MANAGER-METHOD");

    private static final SubLSymbol UNINSTALL_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("UNINSTALL-KNOWLEDGE-SOURCE-BATTERY");

    static private final SubLList $list_alt329 = list(list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("UNINSTALL"))), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), NIL), list(RET, T)), list(RET, NIL));

    static private final SubLSymbol $sym330$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLSymbol $sym331$CYBLACK_BASIC_APPLICATION_UNINSTALL_KNOWLEDGE_SOURCE_BATTERY_METH = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol UNINSTALL_BLACKBOARD = makeSymbol("UNINSTALL-BLACKBOARD");

    static private final SubLList $list_alt333 = list(list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("UNINSTALL"))), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD"), NIL), list(RET, T)), list(RET, NIL));

    static private final SubLSymbol $sym334$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_BLACKBOARD_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-BLACKBOARD-METHOD");

    private static final SubLSymbol UNINSTALL_AGENDA = makeSymbol("UNINSTALL-AGENDA");

    static private final SubLList $list_alt337 = list(list(makeSymbol("PWHEN"), makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("UNINSTALL"))), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), NIL), list(RET, T)), list(RET, NIL));

    static private final SubLSymbol $sym338$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-AGENDA-METHOD");

    private static final SubLSymbol UNINSTALL_PARSER = makeSymbol("UNINSTALL-PARSER");

    static private final SubLList $list_alt341 = list(list(makeSymbol("PWHEN"), makeSymbol("PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("SET-APPLICATION")), NIL), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), NIL), list(RET, T)), list(RET, NIL));

    static private final SubLSymbol $sym342$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_PARSER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-PARSER-METHOD");

    private static final SubLSymbol UNINSTALL_MESSAGE_BROKER = makeSymbol("UNINSTALL-MESSAGE-BROKER");

    static private final SubLList $list_alt345 = list(list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER"), NIL)), list(RET, NIL));

    static private final SubLSymbol $sym346$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol UNINSTALL_EXTERNAL_CONNECTION = makeSymbol("UNINSTALL-EXTERNAL-CONNECTION");

    static private final SubLList $list_alt349 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-EXTERNAL-CONNECTION")), makeSymbol("EXTERNAL-CONNECTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-CONNECTION"), NIL)), list(RET, NIL));

    static private final SubLSymbol $sym350$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_EXTERNAL_CONNECTION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol UNINSTALL_PORT_MANAGER = makeSymbol("UNINSTALL-PORT-MANAGER");

    static private final SubLList $list_alt353 = list(list(makeSymbol("PWHEN"), makeSymbol("PORT-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PORT-MANAGER"), NIL)), list(RET, NIL));

    static private final SubLSymbol $sym354$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNINSTALL_PORT_MANAGER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNINSTALL-PORT-MANAGER-METHOD");

    private static final SubLSymbol GET_ROOT_DATATYPE = makeSymbol("GET-ROOT-DATATYPE");

    static private final SubLList $list_alt357 = list(list(RET, makeSymbol("ROOT-DATATYPE")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_ROOT_DATATYPE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-ROOT-DATATYPE-METHOD");

    private static final SubLSymbol GET_ROOT_DATATYPE_NAME = makeSymbol("GET-ROOT-DATATYPE-NAME");

    static private final SubLList $list_alt360 = list(list(RET, makeSymbol("ROOT-DATATYPE-NAME")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_ROOT_DATATYPE_NAME_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-ROOT-DATATYPE-NAME-METHOD");



    static private final SubLList $list_alt363 = list(list(makeSymbol("CSETQ"), makeSymbol("HALT-STATUS"), T), list(makeSymbol("STOP-IO-STREAM-MONITOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-HALT"))), list(RET, T));

    static private final SubLSymbol $sym364$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_HALT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-HALT-METHOD");



    static private final SubLList $list_alt367 = list(list(RET, makeSymbol("HALT-STATUS")));

    static private final SubLSymbol $sym368$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_HALTED_P_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-HALTED-P-METHOD");

    private static final SubLSymbol HALT_AND_ABORT_SERVER = makeSymbol("HALT-AND-ABORT-SERVER");

    static private final SubLList $list_alt371 = list(list(makeSymbol("HALT"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-HALT-AND-ABORT-SERVER"))), list(RET, T));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_HALT_AND_ABORT_SERVER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-HALT-AND-ABORT-SERVER-METHOD");

    private static final SubLSymbol CREATE_APPLICATION = makeSymbol("CREATE-APPLICATION");

    static private final SubLList $list_alt374 = list(makeString("Creates an instance of CYBLACK-BASIC-APPLICATION."), list(RET, list(makeSymbol("NEW"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_CREATE_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-CREATE-APPLICATION-METHOD");

    private static final SubLSymbol FIND_PANEL = makeSymbol("FIND-PANEL");

    static private final SubLList $list_alt377 = list(makeSymbol("TYPENAME"));

    static private final SubLList $list_alt378 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPENAME")), makeString("(FIND-PANEL ~S): ~S is not a string.")), list(makeSymbol("PIF"), makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-DICTIONARY"), list(QUOTE, makeSymbol("INTERN")), makeSymbol("TYPENAME")))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("BLACKBOARD")))), list(RET, NIL)));

    static private final SubLSymbol $sym379$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt380$_FIND_PANEL__S____S_is_not_a_stri = makeString("(FIND-PANEL ~S): ~S is not a string.");





    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_FIND_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-FIND-PANEL-METHOD");

    private static final SubLSymbol GET_CURRENT_SESSION = makeSymbol("GET-CURRENT-SESSION");

    static private final SubLList $list_alt385 = list(list(RET, makeSymbol("CURRENT-SESSION")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_CURRENT_SESSION_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-CURRENT-SESSION-METHOD");



    static private final SubLList $list_alt388 = list(makeSymbol("OBJECT-MONITOR"));

    static private final SubLList $list_alt389 = list(list(makeSymbol("MONITOR"), makeSymbol("SUPER"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("PWHEN"), makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE-BROKER"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("OBJECT-MONITOR"))), list(RET, NIL));

    static private final SubLSymbol $sym390$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-MONITOR-METHOD");



    static private final SubLList $list_alt393 = list(list(makeSymbol("UNMONITOR"), makeSymbol("SUPER"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("PWHEN"), makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE-BROKER"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("OBJECT-MONITOR"))), list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("OBJECT-MONITOR"))), list(RET, NIL));

    static private final SubLSymbol $sym394$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_UNMONITOR_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-UNMONITOR-METHOD");

    private static final SubLSymbol REPORT_OUTSTANDING_EXTERNAL_KNOWLEDGE_SOURCES = makeSymbol("REPORT-OUTSTANDING-EXTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLList $list_alt397 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KNOWLEDGE-SOURCES-STILL-WAITING"), list(makeSymbol("CYBLACK-KSB-UNLINKED-KNOWLEDGE-SOURCES-WAITING-FOR-REPLY"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"))), list(makeSymbol("COUNT"), ONE_INTEGER)), list(makeSymbol("PIF"), makeSymbol("KNOWLEDGE-SOURCES-STILL-WAITING"), list(makeSymbol("PROGN"), list(makeSymbol("FORMAT"), T, makeString("~%* The following external knowledge sources have not replied to an invitation:")), list(makeSymbol("CDOLIST"), list(makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCES-STILL-WAITING")), list(makeSymbol("FORMAT"), T, makeString("~%*  (~S): ~S"), makeSymbol("COUNT"), makeSymbol("KS")), list(makeSymbol("CINC"), makeSymbol("COUNT")))), list(makeSymbol("FORMAT"), T, makeString("~%* All external knowledge sources have replied to an invitation."))), list(RET, NIL)));

    static private final SubLSymbol $sym398$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    static private final SubLString $str_alt399$____The_following_external_knowle = makeString("~%* The following external knowledge sources have not replied to an invitation:");

    static private final SubLString $str_alt400$_______S____S = makeString("~%*  (~S): ~S");

    static private final SubLString $str_alt401$____All_external_knowledge_source = makeString("~%* All external knowledge sources have replied to an invitation.");

    static private final SubLSymbol $sym402$CYBLACK_BASIC_APPLICATION_REPORT_OUTSTANDING_EXTERNAL_KNOWLEDGE_S = makeSymbol("CYBLACK-BASIC-APPLICATION-REPORT-OUTSTANDING-EXTERNAL-KNOWLEDGE-SOURCES-METHOD");



    static private final SubLList $list_alt404 = list(makeSymbol("EXTERNAL-MODULE-NAME"));

    static private final SubLList $list_alt405 = list(list(RET, list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("EXTERNAL-MODULE-TABLE"), makeSymbol("EXTERNAL-MODULE-NAME"))));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-EXTERNAL-MODULE-ID-METHOD");

    private static final SubLSymbol GET_POSTING = makeSymbol("GET-POSTING");

    static private final SubLList $list_alt408 = list(makeSymbol("POSTING-ID"));

    static private final SubLList $list_alt409 = list(list(RET, list(makeSymbol("CYBLACK-RETRIEVE-POSTING"), makeSymbol("POSTING-ID"))));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-POSTING-METHOD");



    static private final SubLList $list_alt412 = list(list(RET, makeSymbol("RESULT")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_RESULT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-RESULT-METHOD");



    static private final SubLList $list_alt415 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt416 = list(makeSymbol("NEW-RESULT"));

    static private final SubLList $list_alt417 = list(list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeSymbol("NEW-RESULT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-SET-RESULT"))), list(RET, makeSymbol("NEW-RESULT")));

    private static final SubLSymbol ON_SET_RESULT = makeSymbol("ON-SET-RESULT");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_SET_RESULT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-SET-RESULT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_ON_SET_RESULT_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-ON-SET-RESULT-METHOD");

    private static final SubLSymbol GET_APPLICATION_ID = makeSymbol("GET-APPLICATION-ID");

    static private final SubLList $list_alt422 = list(list(RET, makeSymbol("APPLICATION-ID")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_APPLICATION_ID_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-APPLICATION-ID-METHOD");

    private static final SubLSymbol DESCRIBE_GUID_MANAGER = makeSymbol("DESCRIBE-GUID-MANAGER");

    static private final SubLList $list_alt425 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER));

    static private final SubLList $list_alt426 = list(list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE-BROKER"), list(QUOTE, makeSymbol("DESCRIBE-GUID-MANAGER")), makeSymbol("STREAM"), makeSymbol("DEPTH"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym427$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_DESCRIBE_GUID_MANAGER_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-DESCRIBE-GUID-MANAGER-METHOD");



    static private final SubLList $list_alt430 = list(list(RET, makeSymbol("INCOMING-MESSAGE-QUEUE")));

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_GET_INCOMING_MESSAGE_QUEUE_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-GET-INCOMING-MESSAGE-QUEUE-METHOD");

    private static final SubLSymbol HAS_EXTERNAL_KNOWLEDGE_SOURCES_P = makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P");

    static private final SubLList $list_alt433 = list(list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), list(QUOTE, makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P"))))), list(RET, NIL));

    static private final SubLSymbol $sym434$OUTER_CATCH_FOR_CYBLACK_BASIC_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_APPLICATION_HAS_EXTERNAL_KNOWLEDGE_SOURCES_P_METHOD = makeSymbol("CYBLACK-BASIC-APPLICATION-HAS-EXTERNAL-KNOWLEDGE-SOURCES-P-METHOD");

    static private final SubLString $str_alt436$CYBLACK_APP_GET_APPLICATION_NAME_ = makeString("CYBLACK-APP-GET-APPLICATION-NAME: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt437$CYBLACK_APP_GET_APPLICATION___S_i = makeString("CYBLACK-APP-GET-APPLICATION: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt438$CYBLACK_APP_GET_KNOWLEDGE_SOURCE_ = makeString("CYBLACK-APP-GET-KNOWLEDGE-SOURCE-BATTERY: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt439$CYBLACK_APP_GET_BLACKBOARD___S_is = makeString("CYBLACK-APP-GET-BLACKBOARD: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt440$CYBLACK_APP_GET_AGENDA___S_is_not = makeString("CYBLACK-APP-GET-AGENDA: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt441$CYBLACK_APP_GET_DATATYPE_DICTIONA = makeString("CYBLACK-APP-GET-DATATYPE-DICTIONARY: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLList $list_alt442 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-INSTANCE");

    static private final SubLList $list_alt445 = list(list(RET, makeSymbol("APPLICATION")));

    private static final SubLSymbol CYBLACK_SESSION_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-SESSION-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt447 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of application."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym448$OUTER_CATCH_FOR_CYBLACK_SESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SESSION-METHOD");

    static private final SubLString $str_alt449$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of application.");

    private static final SubLSymbol CYBLACK_SESSION_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-SESSION-SET-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_DYNAMIC_APPLICATION = makeSymbol("CYBLACK-DYNAMIC-APPLICATION");

    static private final SubLList $list_alt452 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-APPLICATION")));

    static private final SubLList $list_alt453 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-KNOWLEDGE-SOURCE"), list(makeSymbol("KS-INSTANCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("KS-INSTANCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-POSTING-CLASS"), list(makeSymbol("CLASS-NAME"), makeSymbol("SUPER-CLASS"), makeSymbol("INTERFACE-LIST"), makeSymbol("SLOTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-PANEL"), list(makeSymbol("TYPE"), makeSymbol("SUPERTYPES"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-REMOVE-PANEL"), list(makeSymbol("TYPE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol DYNAMICALLY_ADD_KNOWLEDGE_SOURCE = makeSymbol("DYNAMICALLY-ADD-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt455 = list(makeSymbol("KS-INSTANCE"));

    static private final SubLList $list_alt456 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KS-INSTANCE")), makeString("(DYNAMICALLY-ADD-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS-INSTANCE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CYBLACK-KSBT-GET-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-TYPES-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-INSTANCE"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("CYBLACK-KSB-REGISTER-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-KSB"), makeSymbol("KS-INSTANCE")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-INSTANCE"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TYPES-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-TYPES-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS")))), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-DATATYPES"), makeSymbol("TEMPLATE-BLACKBOARD")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-DATATYPES")), list(makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("KS-INSTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CYBLACK-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("KS-INSTANCE")))))))))), list(RET, makeSymbol("KS-INSTANCE")));

    private static final SubLSymbol DYNAMICALLY_REMOVE_KNOWLEDGE_SOURCE = makeSymbol("DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt458 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("KS-INSTANCE")), makeString("(DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("KS-INSTANCE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CYBLACK-KSBT-GET-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-TYPES-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS-INSTANCE"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("CYBLACK-KSB-UNREGISTER-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-KSB"), makeSymbol("KS-INSTANCE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("TEMPLATE-TYPES-BAG")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-TYPES-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS")))), makeSymbol("TEMPLATE-CURRENT-PANEL")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-DATATYPES"), makeSymbol("TEMPLATE-BLACKBOARD")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-DATATYPES")), list(makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("KS-INSTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("TEMPLATE-DATATYPE"), makeSymbol("TEMPLATE-BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CYBLACK-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("KS-INSTANCE"))))))))), list(RET, makeSymbol("KS-INSTANCE")));

    private static final SubLSymbol DYNAMICALLY_ADD_POSTING_CLASS = makeSymbol("DYNAMICALLY-ADD-POSTING-CLASS");

    static private final SubLList $list_alt460 = list(makeSymbol("CLASS-NAME"), makeSymbol("SUPER-CLASS"), makeSymbol("INTERFACE-LIST"), makeSymbol("SLOTS"));

    static private final SubLList $list_alt461 = list(new SubLObject[]{ list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("CLASS-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("CLASS-NAME"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid class name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("CLASS-NAME")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("SUPER-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("SUPER-CLASS"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid class name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("SUPER-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("INTERFACE-LIST")), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid interface list.  A list was expected."), makeSymbol("SELF"), makeSymbol("INTERFACE-LIST")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("SLOTS")), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid slot list.  A list was expected."), makeSymbol("SELF"), makeSymbol("SLOTS")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("INTERFACE"), makeSymbol("INTERFACE-LIST")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("INTERFACE"), list(makeSymbol("SYMBOLP"), makeSymbol("INTERFACE"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid interface name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("INTERFACE")), list(makeSymbol("MUST"), list(makeSymbol("INTERFACES-RETRIEVE-INTERFACE"), makeSymbol("INTERFACE")), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not an interface."), makeSymbol("SELF"), makeSymbol("INTERFACE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("SLOTS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("SLOT"), list(makeSymbol("SYMBOLP"), makeSymbol("SLOT"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid slot name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("SLOT")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CNOT"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CLASS-NAME"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is already defined as a class."), makeSymbol("SELF"), makeSymbol("CLASS-NAME")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("SUPER-CLASS")), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a valid super class."), makeSymbol("SELF"), makeSymbol("SUPER-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("SUPER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-POSTING"))), makeString("(DYNAMICALLY-ADD-POSTING-CLASS ~S): ~S is not a posting class."), makeSymbol("SELF"), makeSymbol("SUPER-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-DEFNS"), NIL), list(makeSymbol("CYC-PACKAGE"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC")))), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("SLOT"), makeSymbol("SLOTS"), makeSymbol("SLOT-DEFNS")), list(makeSymbol("LIST"), list(makeSymbol("INTERN"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("SLOT")), makeSymbol("CYC-PACKAGE")), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEWLY-CONSTRUCTED-CLASS"), list(makeSymbol("NEW-CLASS"), makeSymbol("CLASS-NAME"), makeSymbol("SUPER-CLASS"), list(makeSymbol("COPY-LIST"), makeSymbol("INTERFACE-LIST")), makeSymbol("SLOT-DEFNS")))), list(RET, makeSymbol("NEWLY-CONSTRUCTED-CLASS")))) });

    private static final SubLSymbol DYNAMICALLY_ADD_PANEL = makeSymbol("DYNAMICALLY-ADD-PANEL");

    static private final SubLList $list_alt463 = list(makeSymbol("TYPE"), makeSymbol("SUPERTYPES"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS"));

    static private final SubLList $list_alt464 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE")), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S is not a valid CyBlack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("SUPERTYPES")), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S is not a valid list of CyBlack type.  A list of strings was expected."), makeSymbol("SELF"), makeSymbol("SUPERTYPES")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-SUPERTYPE"), makeSymbol("SUPERTYPES")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TEMPLATE-SUPERTYPE")), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S is not a valid CyBlack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("TEMPLATE-SUPERTYPE")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("POSTING-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("POSTING-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-POSTING")))), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S does not implement the CYBLACK-POSTING interface."), makeSymbol("SELF"), makeSymbol("POSTING-CLASS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("PANEL-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("PANEL-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PANEL")))), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S does not implement the CYBLACK-PANEL interface."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-TYPE"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERNED-P"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TYPE"))), makeString("(DYNAMICALLY-ADD-PANEL ~S): ~S is already a known datatype.  Cannot redefine it."), makeSymbol("SELF"), makeSymbol("TYPE")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-SUPERTYPE"), makeSymbol("SUPERTYPES")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERNED-P"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TEMPLATE-SUPERTYPE")), makeString("(DYNAMICALLY-ADD-PANEL ~S): Cannot subtype unknown datatype ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-SUPERTYPE")), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-TYPE"), makeSymbol("TEMPLATE-SUPERTYPE"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS"))), list(RET, list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANEL"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TYPE"))))), list(RET, NIL));

    private static final SubLSymbol DYNAMICALLY_REMOVE_PANEL = makeSymbol("DYNAMICALLY-REMOVE-PANEL");

    static private final SubLList $list_alt466 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE")), makeString("(DYNAMICALLY-REMOVE-PANEL ~S): ~S is not a valid CyBlack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-BLACKBOARD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-KSB"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TEMPLATE-BLACKBOARD")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-TYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("TEMPLATE-DATATYPE-DICTIONARY"), makeSymbol("TYPE")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TYPE"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("TEMPLATE-TYPE"), makeSymbol("TEMPLATE-BLACKBOARD"))), list(makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES"), makeSymbol("TEMPLATE-PANEL"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-KSB"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-KS"), makeSymbol("TEMPLATE-DIRECT-KNOWLEDGE-SOURCES")), list(makeSymbol("CYBLACK-KSB-REMOVE-KNOWLEDGE-SOURCE"), makeSymbol("TEMPLATE-KSB"), makeSymbol("TEMPLATE-KS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUBPANELS"), list(makeSymbol("CYBLACK-PANEL-GET-SUB-PANELS"), makeSymbol("TEMPLATE-PANEL")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-SUBPANEL"), makeSymbol("TEMPLATE-SUBPANELS")), list(makeSymbol("DYNAMICALLY-REMOVE-PANEL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SUBPANEL")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUPERPANELS"), list(makeSymbol("CYBLACK-PANEL-GET-SUPER-PANELS"), makeSymbol("TEMPLATE-PANEL")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-SUPERPANEL"), makeSymbol("TEMPLATE-SUPERPANELS")), list(makeSymbol("CYBLACK-PANEL-REMOVE-SUPER-PANEL"), makeSymbol("TEMPLATE-PANEL"), makeSymbol("TEMPLATE-SUPERPANEL")), list(makeSymbol("CYBLACK-PANEL-REMOVE-SUB-PANEL"), makeSymbol("TEMPLATE-SUPERPANEL"), makeSymbol("TEMPLATE-PANEL"))), list(RET, T)))))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_DYNAMIC_APPLICATION = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION");

    static private final SubLList $list_alt468 = list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION"));

    static private final SubLList $list_alt469 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-KNOWLEDGE-SOURCE"), list(makeSymbol("KS-INSTANCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("KS-INSTANCE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-POSTING-CLASS"), list(makeSymbol("CLASS-NAME"), makeSymbol("SUPER-CLASS"), makeSymbol("INTERFACE-LIST"), makeSymbol("SLOTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-ADD-PANEL"), list(makeSymbol("TYPE"), makeSymbol("SUPERTYPES"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DYNAMICALLY-REMOVE-PANEL"), list(makeSymbol("TYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_REMOVE_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-PANEL-METHOD");

    static private final SubLString $$$CYC = makeString("CYC");







    static private final SubLSymbol $sym476$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_POSTING_CLASS_M = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-POSTING-CLASS-METHOD");





    static private final SubLSymbol $sym479$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_REMOVE_KNOWLEDGE_SO = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym480$CYBLACK_BASIC_DYNAMIC_APPLICATION_DYNAMICALLY_ADD_KNOWLEDGE_SOURC = makeSymbol("CYBLACK-BASIC-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym481$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DYNAMIC_APPLICATION_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DYNAMIC-APPLICATION-CLASS");

    static private final SubLSymbol $sym482$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DYNAMIC_APPLICATION_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DYNAMIC-APPLICATION-INSTANCE");

    static private final SubLString $str_alt483$CYBLACK_APPLICATION_GET_BLACKBOAR = makeString("CYBLACK-APPLICATION-GET-BLACKBOARD: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt484$CYBLACK_APPLICATION_GET_DATATYPE_ = makeString("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt485$CYBLACK_APPLICATION_GET_MESSAGE_B = makeString("CYBLACK-APPLICATION-GET-MESSAGE-BROKER: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt486$CYBLACK_APPLICATION_GET_AGENDA___ = makeString("CYBLACK-APPLICATION-GET-AGENDA: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt487$CYBLACK_APPLICATION_GET_ROOT_DATA = makeString("CYBLACK-APPLICATION-GET-ROOT-DATATYPE: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt488$CYBLACK_APPLICATION_GET_POSTING__ = makeString("CYBLACK-APPLICATION-GET-POSTING: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt489$CYBLACK_APPLICATION_GET_RESULT___ = makeString("CYBLACK-APPLICATION-GET-RESULT: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt490$CYBLACK_APPLICATION_SET_RESULT___ = makeString("CYBLACK-APPLICATION-SET-RESULT: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt491$CYBLACK_APPLICATION_HALT___S_is_n = makeString("CYBLACK-APPLICATION-HALT: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt492$CYBLACK_APPLICATION_GET_KNOWLEDGE = makeString("CYBLACK-APPLICATION-GET-KNOWLEDGE-SOURCE-BATTERY: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt493$CYBLACK_APPLICATION_GET_APPLICATI = makeString("CYBLACK-APPLICATION-GET-APPLICATION-ID: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt494$CYBLACK_DYNAMIC_APPLICATION_DYNAM = makeString("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-DYNAMIC-APPLICATION.");

    static private final SubLString $str_alt495$CYBLACK_DYNAMIC_APPLICATION_DYNAM = makeString("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-DYNAMIC-APPLICATION.");

    static private final SubLString $str_alt496$CYBLACK_DYNAMIC_APPLICATION_DYNAM = makeString("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-POSTING-CLASS: ~S is not an instance of CYBLACK-DYNAMIC-APPLICATION.");

    static private final SubLString $str_alt497$CYBLACK_DYNAMIC_APPLICATION_DYNAM = makeString("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-PANEL: ~S is not an instance of CYBLACK-DYNAMIC-APPLICATION.");

    static private final SubLString $str_alt498$CYBLACK_DYNAMIC_APPLICATION_DYNAM = makeString("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-PANEL: ~S is not an instance of CYBLACK-DYNAMIC-APPLICATION.");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_15_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STANDARD-INITIALIZATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-COMPONENT"), list(makeSymbol("COMPONENT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONNECTION-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-DICTIONARY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-MANAGER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-BLACKBOARD"), list(makeSymbol("NEW-BLACKBOARD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-AGENDA"), list(makeSymbol("NEW-AGENDA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-PARSER"), list(makeSymbol("NEW-PARSER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-MESSAGE-BROKER"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-EXTERNAL-CONNECTION"), list(makeSymbol("NEW-EXTERNAL-CONNECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-PORT-MANAGER"), list(makeSymbol("NEW-PORT-MANAGER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-BLACKBOARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-AGENDA"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-PARSER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-MESSAGE-BROKER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-EXTERNAL-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-PORT-MANAGER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-DATATYPE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-SUBTYPE-RELATIONS"), list(makeSymbol("SUBTYPE-RELATION-TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-SUBTYPE"), list(makeSymbol("SUBTYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SUPERTYPE"), makeString("POSTING")), list(makeSymbol("POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING"))), list(makeSymbol("PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OVERRIDE-PANEL-TYPE"), list(makeSymbol("TYPE"), makeSymbol("PANEL-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-TYPE"), list(makeSymbol("TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-STANDARD-TIMER-PANELS"), list(makeSymbol("TIMER-INTERVALS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-PANEL"), list(makeSymbol("TYPENAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-HALT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT-AND-ABORT-SERVER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-HALT-AND-ABORT-SERVER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BEFORE-AGENDA-EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-AGENDA-EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CURRENT-SESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-POSTING"), list(makeSymbol("DATATYPE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-ALL-EXTERNAL-PORTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-ID"), list(makeSymbol("EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING"), list(makeSymbol("POSTING-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESULT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESULT"), list(makeSymbol("NEW-RESULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SET-RESULT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-GUID-MANAGER"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-QUIESCENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("COMMAND-DESTINATIONS"), makeSymbol("*VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS*"))), makeKeyword("PUBLIC")) });
    }

    private static final SubLObject _constant_75_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("APPLICATION-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BLACKBOARD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AGENDA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DATATYPE-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HALT-STATUS"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-SESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-CONNECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ROOT-DATATYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ROOT-DATATYPE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AGENDA-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BLACKBOARD-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONNECTION-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-BROKER-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RESULT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPLICATION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INCOMING-MESSAGE-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STANDARD-INITIALIZATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-COMPONENT"), list(makeSymbol("COMPONENT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-CLASS"), list(makeSymbol("NEW-AGENDA-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BLACKBOARD-CLASS"), list(makeSymbol("NEW-BLACKBOARD-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONNECTION-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONNECTION-CLASS"), list(makeSymbol("NEW-CONNECTION-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARSER-CLASS"), list(makeSymbol("NEW-PARSER-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGE-BROKER-CLASS"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION-NAME"), list(makeSymbol("NEW-APPLICATION-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARSER"), list(makeSymbol("NEW-PARSER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-DICTIONARY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-CONNECTION"), list(makeSymbol("NEW-EXTERNAL-CONNECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-BLACKBOARD"), list(makeSymbol("NEW-BLACKBOARD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-AGENDA"), list(makeSymbol("NEW-AGENDA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-PARSER"), list(makeSymbol("NEW-PARSER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-MESSAGE-BROKER"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-EXTERNAL-CONNECTION"), list(makeSymbol("NEW-EXTERNAL-CONNECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL-PORT-MANAGER"), list(makeSymbol("NEW-PORT-MANAGER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-BLACKBOARD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-AGENDA"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-PARSER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-MESSAGE-BROKER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-EXTERNAL-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL-PORT-MANAGER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-DATATYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-DATATYPE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-SUBTYPE-RELATIONS"), list(makeSymbol("SUBTYPE-RELATION-TREE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-SUBTYPE"), list(makeSymbol("SUBTYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SUPERTYPE"), makeString("POSTING")), list(makeSymbol("POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING"))), list(makeSymbol("PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OVERRIDE-PANEL-TYPE"), list(makeSymbol("TYPE"), makeSymbol("PANEL-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-TYPE"), list(makeSymbol("TYPE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECLARE-STANDARD-TIMER-PANELS"), list(makeSymbol("TIMER-INTERVALS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-PANEL"), list(makeSymbol("TYPENAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-OUTSTANDING-EXTERNAL-KNOWLEDGE-SOURCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STARTUP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-HALT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HALT-AND-ABORT-SERVER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-HALT-AND-ABORT-SERVER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BEFORE-AGENDA-EXECUTE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-AGENDA-EXECUTE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CURRENT-SESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-POSTING"), list(makeSymbol("DATATYPE-NAME")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-ALL-EXTERNAL-PORTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-ID"), list(makeSymbol("EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESULT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESULT"), list(makeSymbol("NEW-RESULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SET-RESULT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-GUID-MANAGER"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-QUIESCENCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("COMMAND-DESTINATIONS"), makeSymbol("*VALID-CYBLACK-APPLICATION-COMMAND-DESTINATIONS*"))), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });
    }

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_application_file();
    }

    public void initializeVariables() {
        init_cyblack_application_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_application_file();
    }
}

