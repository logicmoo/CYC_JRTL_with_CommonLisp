/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_suppress$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$readtable$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$standard_readtable$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-MESSAGE-BROKER
 *  source file: /cyc/top/cycl/cyblack/cyblack-message-broker.lisp
 *  created:     2019/07/03 17:38:43
 */
public final class cyblack_message_broker extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_message_broker() {
    }

    public static final SubLFile me = new cyblack_message_broker();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_message_broker";



    // defparameter
    public static final SubLSymbol $cyblack_port_manager_connect_lock$ = makeSymbol("*CYBLACK-PORT-MANAGER-CONNECT-LOCK*");

    public static final SubLObject with_cyblack_port_manager_connect_target(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject target = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    target = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_LOCK_HELD, $list_alt3, listS(PROGN, list(CSETQ, $cyblack_port_manager_connect_target_application$, target), body));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_mb_tab(SubLObject stream, SubLObject count) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                format(stream, $str_alt7$__);
            }
        }
        force_output(stream);
        return count;
    }

    public static final SubLObject cyblack_internal_string_equal_p(SubLObject object1, SubLObject object2) {
        return makeBoolean((object1 == object2) || ((object1.isString() && object2.isString()) && (NIL != Strings.string_equal(object1, object2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * Enumerated values of type CYBLACK-SERVER-COMMAND-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_server_command_types$ = makeSymbol("*VALID-CYBLACK-SERVER-COMMAND-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-SERVER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_server_command_types() {
        return $valid_cyblack_server_command_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-SERVER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_server_command_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-SERVER-COMMAND-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_server_command_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_server_command_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt10$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_SERVER_COMMAND_TYPE, value, CYBLACK_SERVER_COMMAND_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-SERVER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_server_command_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_server_command_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt12$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_SERVER_COMMAND_TYPE, value, CYBLACK_SERVER_COMMAND_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-SERVER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_TYPE_P, value1, CYBLACK_SERVER_COMMAND_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_TYPE_P, value2, CYBLACK_SERVER_COMMAND_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_command_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-SERVER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_TYPE_P, value1, CYBLACK_SERVER_COMMAND_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_TYPE_P, value2, CYBLACK_SERVER_COMMAND_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_command_types$.getGlobalValue();
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

    public static final SubLObject cyblack_enqueue_server_command(SubLObject server_command) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cyblack_globals.$cyblack_server_initialized$.getDynamicValue(thread)) {
                cyblack_globals.cyblack_create_server_queues();
                cyblack_globals.$cyblack_server_initialized$.setDynamicValue(T, thread);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_type_p(server_command)) {
                    Errors.error($str_alt16$CYBLACK_ENQUEUE_SERVER_COMMAND___, server_command);
                }
            }
            format(T, $str_alt17$__Enqueuing_server_command___S, server_command);
            force_output(T);
            subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(cyblack_globals.$virb3_command_queue$.getDynamicValue(thread), server_command);
            return server_command;
        }
    }

    public static final SubLObject cyblack_get_server_command() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cyblack_globals.$cyblack_server_initialized$.getDynamicValue(thread)) {
                cyblack_globals.cyblack_create_server_queues();
                cyblack_globals.$cyblack_server_initialized$.setDynamicValue(T, thread);
            }
            if (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(cyblack_globals.$virb3_command_queue$.getDynamicValue(thread))) {
                return NIL;
            }
            return subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(cyblack_globals.$virb3_command_queue$.getDynamicValue(thread));
        }
    }

    public static final SubLObject cyblack_execute_server_commands() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cyblack_globals.$cyblack_server_initialized$.getDynamicValue(thread)) {
                cyblack_globals.cyblack_create_server_queues();
                cyblack_globals.$cyblack_server_initialized$.setDynamicValue(T, thread);
            }
            {
                SubLObject server_command = cyblack_get_server_command();
                while (NIL != server_command) {
                    {
                        SubLObject pcase_var = server_command;
                        if (pcase_var.eql($Q)) {
                            cyblack_globals.$virb3_server_process_terminate$.setDynamicValue(T, thread);
                        } else
                            if (pcase_var.eql($QUIT)) {
                                cyblack_globals.$virb3_server_process_terminate$.setDynamicValue(T, thread);
                            }

                    }
                    server_command = cyblack_get_server_command();
                } 
            }
            return NIL;
        }
    }

    /**
     * Enumerated values of type CYBLACK-EXTRA-MESSAGE-USAGE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_extra_message_usage_types$ = makeSymbol("*VALID-CYBLACK-EXTRA-MESSAGE-USAGE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_extra_message_usage_types() {
        return $valid_cyblack_extra_message_usage_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_extra_message_usage_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_extra_message_usage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_extra_message_usage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_extra_message_usage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt10$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_EXTRA_MESSAGE_USAGE_TYPE, value, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_extra_message_usage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_extra_message_usage_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt12$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_EXTRA_MESSAGE_USAGE_TYPE, value, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_extra_message_usage_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_extra_message_usage_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE_P, value1, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_extra_message_usage_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE_P, value2, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_extra_message_usage_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-EXTRA-MESSAGE-USAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_extra_message_usage_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_extra_message_usage_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE_P, value1, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_extra_message_usage_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE_P, value2, CYBLACK_EXTRA_MESSAGE_USAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_extra_message_usage_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_guid_info_reference(SubLObject cyblack_guid_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_info, FIVE_INTEGER, REFERENCE);
    }

    public static final SubLObject set_cyblack_guid_info_reference(SubLObject cyblack_guid_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_info, value, FIVE_INTEGER, REFERENCE);
    }

    public static final SubLObject get_cyblack_guid_info_usage(SubLObject cyblack_guid_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_info, FOUR_INTEGER, USAGE);
    }

    public static final SubLObject set_cyblack_guid_info_usage(SubLObject cyblack_guid_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_info, value, FOUR_INTEGER, USAGE);
    }

    public static final SubLObject get_cyblack_guid_info_messages(SubLObject cyblack_guid_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_info, THREE_INTEGER, MESSAGES);
    }

    public static final SubLObject set_cyblack_guid_info_messages(SubLObject cyblack_guid_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_info, value, THREE_INTEGER, MESSAGES);
    }

    public static final SubLObject get_cyblack_guid_info_application(SubLObject cyblack_guid_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_info, TWO_INTEGER, APPLICATION);
    }

    public static final SubLObject set_cyblack_guid_info_application(SubLObject cyblack_guid_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_info, value, TWO_INTEGER, APPLICATION);
    }

    public static final SubLObject get_cyblack_guid_info_guid(SubLObject cyblack_guid_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_info, ONE_INTEGER, GUID);
    }

    public static final SubLObject set_cyblack_guid_info_guid(SubLObject cyblack_guid_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_info, value, ONE_INTEGER, GUID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_guid_info_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_guid_info_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_INFO, GUID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_INFO, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_INFO, MESSAGES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_INFO, USAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_INFO, REFERENCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_guid_info_p(SubLObject cyblack_guid_info) {
        return classes.subloop_instanceof_class(cyblack_guid_info, CYBLACK_GUID_INFO);
    }

    public static final SubLObject cyblack_guid_info_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject usage = get_cyblack_guid_info_usage(self);
            SubLObject messages = get_cyblack_guid_info_messages(self);
            SubLObject application = get_cyblack_guid_info_application(self);
            try {
                try {
                    object.object_initialize_method(self);
                    application = NIL;
                    messages = object.new_class_instance(BASIC_END_POINTER_LIST);
                    usage = NIL;
                    sublisp_throw($sym41$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_usage(self, usage);
                            set_cyblack_guid_info_messages(self, messages);
                            set_cyblack_guid_info_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    public static final SubLObject cyblack_guid_info_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject usage = get_cyblack_guid_info_usage(self);
            SubLObject guid = get_cyblack_guid_info_guid(self);
            try {
                try {
                    format(stream, $str_alt49$__CYBLACK_GUID_INFO__S___S__, guid, usage);
                    sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_usage(self, usage);
                            set_cyblack_guid_info_guid(self, guid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    public static final SubLObject cyblack_guid_info_get_guid_method(SubLObject self) {
        {
            SubLObject guid = get_cyblack_guid_info_guid(self);
            return guid;
        }
    }

    public static final SubLObject cyblack_guid_info_set_guid_method(SubLObject self, SubLObject new_guid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_info_method = NIL;
                SubLObject guid = get_cyblack_guid_info_guid(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_guid) || new_guid.isString()) || (NIL != Guids.guid_p(new_guid)))) {
                                Errors.error($str_alt59$_SET_GUID__S____S_is_not_a_valid_, self, new_guid);
                            }
                        }
                        if (NIL != Guids.guid_p(new_guid)) {
                            guid = Guids.guid_to_string(new_guid);
                        } else {
                            guid = new_guid;
                        }
                        sublisp_throw($sym58$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, new_guid);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_info_guid(self, guid);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
                }
                return catch_var_for_cyblack_guid_info_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_info_get_application_method(SubLObject self) {
        {
            SubLObject application = get_cyblack_guid_info_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_guid_info_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_info_method = NIL;
                SubLObject application = get_cyblack_guid_info_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt68$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, new_application);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_info_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
                }
                return catch_var_for_cyblack_guid_info_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_info_get_messages_method(SubLObject self) {
        {
            SubLObject messages = get_cyblack_guid_info_messages(self);
            if (NIL == messages) {
                return NIL;
            } else {
                return subloop_collections.basic_collection_get_contents_method(messages);
            }
        }
    }

    public static final SubLObject cyblack_guid_info_set_messages_method(SubLObject self, SubLObject new_messages) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_info_method = NIL;
                SubLObject messages = get_cyblack_guid_info_messages(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_messages.isList() || (NIL != subloop_collections.basic_end_pointer_list_p(new_messages)))) {
                                Errors.error($str_alt77$_SET_MESSAGES__S____S_is_neither_, self, new_messages);
                            }
                        }
                        if (NIL == new_messages) {
                            messages = NIL;
                        } else
                            if (new_messages.isCons()) {
                                messages = object.object_new_method(BASIC_END_POINTER_LIST);
                                subloop_collections.basic_collection_set_contents_method(messages, copy_list(new_messages));
                            } else
                                if (NIL != subloop_collections.basic_end_pointer_list_p(new_messages)) {
                                    messages = new_messages;
                                }


                        sublisp_throw($sym76$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, new_messages);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_info_messages(self, messages);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
                }
                return catch_var_for_cyblack_guid_info_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_info_add_message_method(SubLObject self, SubLObject new_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_messages.cyblack_message_p(new_message)) {
                    Errors.error($str_alt83$_ADD_MESSAGE__S____S_is_not_an_in, self, new_message);
                }
            }
            {
                SubLObject reference_to_messages = get_cyblack_guid_info_messages(self);
                if (NIL != reference_to_messages) {
                    subloop_collections.basic_end_pointer_list_add_method(reference_to_messages, new_message);
                } else {
                    cyblack_guid_info_set_messages_method(self, list(new_message));
                }
            }
            return new_message;
        }
    }

    public static final SubLObject cyblack_guid_info_remove_message_method(SubLObject self, SubLObject old_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_messages.cyblack_message_p(old_message)) {
                    Errors.error($str_alt88$_REMOVE_MESSAGE__S____S_is_not_an, self, old_message);
                }
            }
            {
                SubLObject reference_to_messages = get_cyblack_guid_info_messages(self);
                if (NIL != reference_to_messages) {
                    subloop_collections.basic_end_pointer_list_remove_method(reference_to_messages, old_message);
                    if (NIL != subloop_collections.basic_end_pointer_list_empty_p_method(reference_to_messages)) {
                        cyblack_guid_info_set_messages_method(self, NIL);
                    }
                }
            }
            return old_message;
        }
    }

    public static final SubLObject cyblack_guid_info_clear_messages_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject messages = get_cyblack_guid_info_messages(self);
            try {
                try {
                    messages = NIL;
                    sublisp_throw($sym92$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_messages(self, messages);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    public static final SubLObject cyblack_guid_info_empty_messages_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject messages = get_cyblack_guid_info_messages(self);
            try {
                try {
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, makeBoolean((NIL == messages) || (NIL != subloop_collections.basic_end_pointer_list_empty_p_method(messages))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_messages(self, messages);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    public static final SubLObject cyblack_guid_info_get_last_message_method(SubLObject self) {
        {
            SubLObject messages = get_cyblack_guid_info_messages(self);
            if (NIL != messages) {
                if (NIL != subloop_collections.basic_end_pointer_list_empty_p_method(messages)) {
                    return NIL;
                } else {
                    return subloop_collections.basic_end_pointer_list_get_end_pointer_method(messages).first();
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_guid_info_get_usage_method(SubLObject self) {
        {
            SubLObject usage = get_cyblack_guid_info_usage(self);
            return usage;
        }
    }

    public static final SubLObject cyblack_guid_info_set_usage_method(SubLObject self, SubLObject new_usage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_info_method = NIL;
                SubLObject usage = get_cyblack_guid_info_usage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_usage) || (NIL != cyblack_extra_message_usage_type_p(new_usage))) || (NIL != cyblack_messages.cyblack_message_arg_key_type_p(new_usage)))) {
                                Errors.error($str_alt108$_SET_USAGE__S____S_is_not_a_membe, self, new_usage);
                            }
                        }
                        usage = new_usage;
                        sublisp_throw($sym107$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, new_usage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_info_usage(self, usage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
                }
                return catch_var_for_cyblack_guid_info_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_info_get_reference_method(SubLObject self) {
        {
            SubLObject reference = get_cyblack_guid_info_reference(self);
            return reference;
        }
    }

    public static final SubLObject cyblack_guid_info_set_reference_method(SubLObject self, SubLObject new_reference) {
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject reference = get_cyblack_guid_info_reference(self);
            try {
                try {
                    reference = new_reference;
                    sublisp_throw($sym116$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, new_reference);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_reference(self, reference);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym116$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    public static final SubLObject cyblack_guid_info_describe_method(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject catch_var_for_cyblack_guid_info_method = NIL;
            SubLObject reference = get_cyblack_guid_info_reference(self);
            SubLObject usage = get_cyblack_guid_info_usage(self);
            SubLObject messages = get_cyblack_guid_info_messages(self);
            SubLObject guid = get_cyblack_guid_info_guid(self);
            try {
                try {
                    format(stream, $str_alt122$__);
                    force_output(stream);
                    cyblack_mb_tab(stream, depth);
                    format(stream, $str_alt123$CYBLACK_GUID_INFO___S__, guid);
                    force_output(stream);
                    cyblack_mb_tab(stream, add(depth, ONE_INTEGER));
                    format(stream, $str_alt124$messages_____S, messages);
                    force_output(stream);
                    format(stream, $str_alt122$__);
                    force_output(stream);
                    cyblack_mb_tab(stream, add(depth, ONE_INTEGER));
                    format(stream, $str_alt125$usage_____S, usage);
                    force_output(stream);
                    format(stream, $str_alt122$__);
                    force_output(stream);
                    cyblack_mb_tab(stream, add(depth, ONE_INTEGER));
                    format(stream, $str_alt126$reference_____S, reference);
                    force_output(stream);
                    sublisp_throw($sym121$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_info_reference(self, reference);
                            set_cyblack_guid_info_usage(self, usage);
                            set_cyblack_guid_info_messages(self, messages);
                            set_cyblack_guid_info_guid(self, guid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_info_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD);
            }
            return catch_var_for_cyblack_guid_info_method;
        }
    }

    // defconstant
    private static final SubLSymbol $cyblack_message_initial_manager_table_size$ = makeSymbol("*CYBLACK-MESSAGE-INITIAL-MANAGER-TABLE-SIZE*");

    public static final SubLObject get_cyblack_guid_manager_reference_hashtable(SubLObject cyblack_guid_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_manager, THREE_INTEGER, REFERENCE_HASHTABLE);
    }

    public static final SubLObject set_cyblack_guid_manager_reference_hashtable(SubLObject cyblack_guid_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_manager, value, THREE_INTEGER, REFERENCE_HASHTABLE);
    }

    public static final SubLObject get_cyblack_guid_manager_guid_hashtable(SubLObject cyblack_guid_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_manager, TWO_INTEGER, GUID_HASHTABLE);
    }

    public static final SubLObject set_cyblack_guid_manager_guid_hashtable(SubLObject cyblack_guid_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_manager, value, TWO_INTEGER, GUID_HASHTABLE);
    }

    public static final SubLObject get_cyblack_guid_manager_application(SubLObject cyblack_guid_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_guid_manager, ONE_INTEGER, APPLICATION);
    }

    public static final SubLObject set_cyblack_guid_manager_application(SubLObject cyblack_guid_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_guid_manager, value, ONE_INTEGER, APPLICATION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_guid_manager_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_guid_manager_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_MANAGER, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_MANAGER, GUID_HASHTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GUID_MANAGER, REFERENCE_HASHTABLE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_guid_manager_p(SubLObject cyblack_guid_manager) {
        return classes.subloop_instanceof_class(cyblack_guid_manager, CYBLACK_GUID_MANAGER);
    }

    public static final SubLObject cyblack_guid_manager_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
            SubLObject reference_hashtable = get_cyblack_guid_manager_reference_hashtable(self);
            SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
            try {
                try {
                    object.object_initialize_method(self);
                    guid_hashtable = make_hash_table($cyblack_message_initial_manager_table_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
                    clrhash(guid_hashtable);
                    reference_hashtable = make_hash_table($cyblack_message_initial_manager_table_size$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
                    clrhash(reference_hashtable);
                    sublisp_throw($sym136$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_manager_reference_hashtable(self, reference_hashtable);
                            set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_guid_manager_method;
        }
    }

    public static final SubLObject cyblack_guid_manager_intern_method(SubLObject self, SubLObject guid_as_string, SubLObject usage, SubLObject reference) {
        if (usage == UNPROVIDED) {
            usage = NIL;
        }
        if (reference == UNPROVIDED) {
            reference = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
                SubLObject reference_hashtable = get_cyblack_guid_manager_reference_hashtable(self);
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                SubLObject application = get_cyblack_guid_manager_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == usage) || (NIL != cyblack_extra_message_usage_type_p(usage))) || (NIL != cyblack_messages.cyblack_message_arg_key_type_p(usage)))) {
                                Errors.error($str_alt142$_INTERN__S____S_is_not_a_member_o, self, usage);
                            }
                        }
                        {
                            SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                            if (NIL != guid_info) {
                                if (NIL != usage) {
                                    cyblack_guid_info_set_usage_method(guid_info, usage);
                                }
                                if (NIL != reference) {
                                    cyblack_guid_info_set_reference_method(guid_info, reference);
                                    sethash(reference, reference_hashtable, guid_info);
                                }
                                sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, guid_as_string);
                            } else {
                                {
                                    SubLObject new_info = object.object_new_method(CYBLACK_GUID_INFO);
                                    cyblack_guid_info_set_guid_method(new_info, guid_as_string);
                                    cyblack_guid_info_set_application_method(new_info, application);
                                    cyblack_guid_info_set_usage_method(new_info, usage);
                                    cyblack_guid_info_set_reference_method(new_info, reference);
                                    sethash(guid_as_string, guid_hashtable, new_info);
                                    if (NIL != reference) {
                                        sethash(reference, reference_hashtable, new_info);
                                    }
                                    sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, guid_as_string);
                                }
                            }
                            sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_manager_reference_hashtable(self, reference_hashtable);
                                set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                                set_cyblack_guid_manager_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_guid_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_allocate_method(SubLObject self, SubLObject usage, SubLObject reference, SubLObject apriori_id) {
        if (reference == UNPROVIDED) {
            reference = NIL;
        }
        if (apriori_id == UNPROVIDED) {
            apriori_id = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
            SubLObject reference_hashtable = get_cyblack_guid_manager_reference_hashtable(self);
            SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
            SubLObject application = get_cyblack_guid_manager_application(self);
            try {
                try {
                    {
                        SubLObject as_string = (NIL != apriori_id) ? ((SubLObject) (apriori_id)) : Guids.guid_to_string(Guids.new_guid());
                        SubLObject old_info = gethash(as_string, guid_hashtable, NIL);
                        SubLObject info = (NIL != old_info) ? ((SubLObject) (old_info)) : object.new_class_instance(CYBLACK_GUID_INFO);
                        if (NIL == old_info) {
                            cyblack_guid_info_set_guid_method(info, as_string);
                            cyblack_guid_info_set_application_method(info, application);
                            sethash(as_string, guid_hashtable, info);
                        }
                        cyblack_guid_info_set_usage_method(info, usage);
                        if (NIL != reference) {
                            cyblack_guid_info_set_reference_method(info, reference);
                        }
                        if (NIL != reference) {
                            sethash(reference, reference_hashtable, info);
                        }
                        sublisp_throw($sym147$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, as_string);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_manager_reference_hashtable(self, reference_hashtable);
                            set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                            set_cyblack_guid_manager_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym147$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_guid_manager_method;
        }
    }

    public static final SubLObject cyblack_guid_manager_record_use_method(SubLObject self, SubLObject guid_as_string, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!guid_as_string.isString()) {
                                Errors.error($str_alt153$_RECORD_USE__S____S_is_not_a_stri, self, guid_as_string);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_message_p(message)) {
                                Errors.error($str_alt154$_RECORD_USE__S____S_is_not_an_ins, self, message);
                            }
                        }
                        {
                            SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                            if (NIL != guid_info) {
                                cyblack_guid_info_add_message_method(guid_info, message);
                            }
                        }
                        sublisp_throw($sym152$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, message);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym152$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_guid_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_expunge_use_method(SubLObject self, SubLObject guid_as_string, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!guid_as_string.isString()) {
                                Errors.error($str_alt153$_RECORD_USE__S____S_is_not_a_stri, self, guid_as_string);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_message_p(message)) {
                                Errors.error($str_alt154$_RECORD_USE__S____S_is_not_an_ins, self, message);
                            }
                        }
                        {
                            SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                            if (NIL != guid_info) {
                                cyblack_guid_info_remove_message_method(guid_info, message);
                                if (NIL != cyblack_guid_info_empty_messages_p_method(guid_info)) {
                                    sethash(guid_as_string, guid_hashtable, NIL);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym158$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_guid_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_get_usage_method(SubLObject self, SubLObject guid_as_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!guid_as_string.isString()) {
                        Errors.error($str_alt162$_GET_USAGE__S____S_is_not_a_strin, self, guid_as_string);
                    }
                }
                {
                    SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                    if (NIL != guid_info) {
                        return cyblack_guid_info_get_usage_method(guid_info);
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_get_messages_method(SubLObject self, SubLObject guid_as_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!guid_as_string.isString()) {
                        Errors.error($str_alt165$_GET_MESSAGES__S____S_is_not_a_st, self, guid_as_string);
                    }
                }
                {
                    SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                    if (NIL != guid_info) {
                        return cyblack_guid_info_get_messages_method(guid_info);
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_get_last_message_method(SubLObject self, SubLObject guid_as_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!guid_as_string.isString()) {
                        Errors.error($str_alt168$_GET_LAST_MESSAGE__S____S_is_not_, self, guid_as_string);
                    }
                }
                {
                    SubLObject guid_info = gethash(guid_as_string, guid_hashtable, NIL);
                    if (NIL != guid_info) {
                        return cyblack_guid_info_get_last_message_method(guid_info);
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_get_true_guid_method(SubLObject self, SubLObject guid_as_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!guid_as_string.isString()) {
                        Errors.error($str_alt172$_GET_TRUE_GUID__S____S_is_not_a_s, self, guid_as_string);
                    }
                }
                if (NIL != guid_hashtable) {
                    {
                        SubLObject guid_info = gethash(guid_as_string, guid_hashtable, UNPROVIDED);
                        if (NIL != guid_info) {
                            return cyblack_guid_info_get_guid_method(guid_info);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_guid_manager_get_guid_info_method(SubLObject self, SubLObject guid_as_string_or_reference) {
        {
            SubLObject reference_hashtable = get_cyblack_guid_manager_reference_hashtable(self);
            SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
            if (guid_as_string_or_reference.isString()) {
                return gethash(guid_as_string_or_reference, guid_hashtable, NIL);
            } else
                if (NIL == guid_as_string_or_reference) {
                    return NIL;
                } else {
                    return gethash(guid_as_string_or_reference, reference_hashtable, NIL);
                }

        }
    }

    public static final SubLObject cyblack_guid_manager_get_reference_method(SubLObject self, SubLObject guid_as_string_or_reference) {
        {
            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(self, guid_as_string_or_reference);
            if (NIL != guid_info) {
                return cyblack_guid_info_get_reference_method(guid_info);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_guid_manager_describe_method(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject catch_var_for_cyblack_guid_manager_method = NIL;
            SubLObject guid_hashtable = get_cyblack_guid_manager_guid_hashtable(self);
            try {
                try {
                    format(stream, $str_alt122$__);
                    force_output(stream);
                    cyblack_mb_tab(stream, depth);
                    format(stream, $str_alt182$Contents_of_CYBLACK_GUID_MANAGER_, self);
                    force_output(stream);
                    {
                        SubLObject new_depth = add(depth, ONE_INTEGER);
                        SubLObject guid = NIL;
                        SubLObject guid_info = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(guid_hashtable);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    guid = getEntryKey(cdohash_entry);
                                    guid_info = getEntryValue(cdohash_entry);
                                    cyblack_guid_info_describe_method(guid_info, stream, new_depth);
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                    format(stream, $str_alt122$__);
                    force_output(stream);
                    cyblack_mb_tab(stream, depth);
                    format(stream, $str_alt183$End_Contents_of_CYBLACK_GUID_MANA, self);
                    force_output(stream);
                    sublisp_throw($sym181$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_guid_manager_guid_hashtable(self, guid_hashtable);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_guid_manager_method = Errors.handleThrowable(ccatch_env_var, $sym181$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_guid_manager_method;
        }
    }

    public static final SubLObject get_cyblack_message_broker_cached_external_connection(SubLObject v_cyblack_message_broker) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_message_broker, SEVEN_INTEGER, CACHED_EXTERNAL_CONNECTION);
    }

    public static final SubLObject set_cyblack_message_broker_cached_external_connection(SubLObject v_cyblack_message_broker, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_message_broker, value, SEVEN_INTEGER, CACHED_EXTERNAL_CONNECTION);
    }

    public static final SubLObject get_cyblack_message_broker_cached_application_name(SubLObject v_cyblack_message_broker) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_message_broker, SIX_INTEGER, CACHED_APPLICATION_NAME);
    }

    public static final SubLObject set_cyblack_message_broker_cached_application_name(SubLObject v_cyblack_message_broker, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_message_broker, value, SIX_INTEGER, CACHED_APPLICATION_NAME);
    }

    public static final SubLObject get_cyblack_message_broker_session_id(SubLObject v_cyblack_message_broker) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_message_broker, FIVE_INTEGER, SESSION_ID);
    }

    public static final SubLObject set_cyblack_message_broker_session_id(SubLObject v_cyblack_message_broker, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_message_broker, value, FIVE_INTEGER, SESSION_ID);
    }

    public static final SubLObject get_cyblack_message_broker_application_id(SubLObject v_cyblack_message_broker) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_message_broker, FOUR_INTEGER, APPLICATION_ID);
    }

    public static final SubLObject set_cyblack_message_broker_application_id(SubLObject v_cyblack_message_broker, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_message_broker, value, FOUR_INTEGER, APPLICATION_ID);
    }

    public static final SubLObject get_cyblack_message_broker_guid_manager(SubLObject v_cyblack_message_broker) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_message_broker, THREE_INTEGER, GUID_MANAGER);
    }

    public static final SubLObject set_cyblack_message_broker_guid_manager(SubLObject v_cyblack_message_broker, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_message_broker, value, THREE_INTEGER, GUID_MANAGER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_message_broker_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_message_broker_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE_BROKER, GUID_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE_BROKER, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE_BROKER, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE_BROKER, CACHED_APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE_BROKER, CACHED_EXTERNAL_CONNECTION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_message_broker_p(SubLObject v_cyblack_message_broker) {
        return classes.subloop_instanceof_class(v_cyblack_message_broker, CYBLACK_MESSAGE_BROKER);
    }

    public static final SubLObject cyblack_message_broker_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject cached_application_name = get_cyblack_message_broker_cached_application_name(self);
            SubLObject session_id = get_cyblack_message_broker_session_id(self);
            SubLObject application_id = get_cyblack_message_broker_application_id(self);
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    guid_manager = object.object_new_method(CYBLACK_GUID_MANAGER);
                    application_id = $str_alt198$;
                    session_id = $str_alt198$;
                    cached_application_name = $str_alt198$;
                    sublisp_throw($sym197$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_cached_application_name(self, cached_application_name);
                            set_cyblack_message_broker_session_id(self, session_id);
                            set_cyblack_message_broker_application_id(self, application_id);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_get_guid_manager_method(SubLObject self) {
        {
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            return guid_manager;
        }
    }

    public static final SubLObject cyblack_message_broker_set_guid_manager_method(SubLObject self, SubLObject new_guid_manager) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_guid_manager_p(new_guid_manager)) {
                                Errors.error($str_alt207$_SET_GUID_MANAGER__S____S_is_not_, self, new_guid_manager);
                            }
                        }
                        guid_manager = new_guid_manager;
                        sublisp_throw($sym206$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_guid_manager);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym206$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_get_application_method(SubLObject self) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_message_broker_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject cached_application_name = get_cyblack_message_broker_cached_application_name(self);
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject application_id = get_cyblack_message_broker_application_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt68$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        if (NIL != new_application) {
                            cached_application_name = methods.funcall_instance_method_with_0_args(new_application, GET_APPLICATION_NAME);
                            session_id = cyblack_guid_manager_allocate_method(guid_manager, $SESSION, methods.funcall_instance_method_with_0_args(new_application, GET_CURRENT_SESSION), UNPROVIDED);
                            application_id = cyblack_guid_manager_allocate_method(guid_manager, $APPLICATION, new_application, UNPROVIDED);
                        }
                        application = new_application;
                        sublisp_throw($sym211$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_application);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_cached_application_name(self, cached_application_name);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_application_id(self, application_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_get_application_id_method(SubLObject self) {
        {
            SubLObject application_id = get_cyblack_message_broker_application_id(self);
            return application_id;
        }
    }

    public static final SubLObject cyblack_message_broker_new_session_id_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject session_id = get_cyblack_message_broker_session_id(self);
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != application) {
                        session_id = cyblack_guid_manager_allocate_method(guid_manager, $SESSION, methods.funcall_instance_method_with_0_args(application, GET_CURRENT_SESSION), UNPROVIDED);
                    }
                    sublisp_throw($sym222$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, session_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_session_id(self, session_id);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym222$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_get_session_id_method(SubLObject self) {
        {
            SubLObject session_id = get_cyblack_message_broker_session_id(self);
            return session_id;
        }
    }

    public static final SubLObject cyblack_message_broker_new_transaction_id_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    {
                        SubLObject new_transaction_id = cyblack_guid_manager_allocate_method(guid_manager, $TRANSACTION, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym229$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_transaction_id);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_new_external_module_id_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    {
                        SubLObject new_external_module_id = cyblack_guid_manager_allocate_method(guid_manager, $EXTERNAL_MODULE, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym234$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_external_module_id);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_get_external_module_id_method(SubLObject self, SubLObject external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt241$_GET_EXTERNAL_MODULE_ID__S___Cann, self, external_module_name);
                            }
                        }
                        {
                            SubLObject new_external_module_id = methods.funcall_instance_method_with_1_args(application, GET_EXTERNAL_MODULE_ID, external_module_name);
                            sublisp_throw($sym240$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, cyblack_guid_manager_allocate_method(guid_manager, $EXTERNAL_MODULE, NIL, new_external_module_id));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_new_proposal_id_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    {
                        SubLObject new_proposal_id = cyblack_guid_manager_allocate_method(guid_manager, $PROPOSAL, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym245$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_proposal_id);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_associate_common_ids_method(SubLObject self, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_message_p(message)) {
                                Errors.error($str_alt252$_ASSOCIATE_COMMON_IDS__S____S_is_, self, message);
                            }
                        }
                        if (NIL != guid_manager) {
                            cyblack_guid_manager_record_use_method(guid_manager, cyblack_messages.cyblack_message_get_session_id_method(message), message);
                            cyblack_guid_manager_record_use_method(guid_manager, cyblack_messages.cyblack_message_get_transaction_id_method(message), message);
                            cyblack_guid_manager_record_use_method(guid_manager, cyblack_messages.cyblack_message_get_external_module_id_method(message), message);
                        }
                        sublisp_throw($sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, message);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_expunge_common_ids_method(SubLObject self, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_message_p(message)) {
                                Errors.error($str_alt252$_ASSOCIATE_COMMON_IDS__S____S_is_, self, message);
                            }
                        }
                        if (NIL != guid_manager) {
                            cyblack_guid_manager_expunge_use_method(guid_manager, cyblack_messages.cyblack_message_get_session_id_method(message), message);
                            cyblack_guid_manager_expunge_use_method(guid_manager, cyblack_messages.cyblack_message_get_transaction_id_method(message), message);
                            cyblack_guid_manager_expunge_use_method(guid_manager, cyblack_messages.cyblack_message_get_external_module_id_method(message), message);
                        }
                        sublisp_throw($sym256$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, message);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_expunge_specific_id_method(SubLObject self, SubLObject id, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != Guids.guid_p(id)) || id.isString())) {
                                Errors.error($str_alt262$_EXPUNGE_SPECIFIC_ID__S____S_is_n, self, id);
                            }
                        }
                        {
                            SubLObject id_as_string = (NIL != Guids.guid_p(id)) ? ((SubLObject) (Guids.guid_to_string(id))) : id;
                            if (NIL != guid_manager) {
                                cyblack_guid_manager_expunge_use_method(guid_manager, id_as_string, message);
                            }
                        }
                        sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_get_external_connection_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject cached_external_connection = get_cyblack_message_broker_cached_external_connection(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != cached_external_connection) {
                            sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, cached_external_connection);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt267$_GET_EXTERNAL_CONNECTION__S___Cou, self);
                            }
                        }
                        {
                            SubLObject external_connection = methods.funcall_instance_method_with_0_args(application, GET_EXTERNAL_CONNECTION);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == external_connection) {
                                    Errors.error($str_alt268$_GET_EXTERNAL_CONNECTION__S___Cou, self, application);
                                }
                            }
                            cached_external_connection = external_connection;
                            sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, external_connection);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_cached_external_connection(self, cached_external_connection);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_invite_method(SubLObject self, SubLObject external_module_name, SubLObject emid) {
        if (emid == UNPROVIDED) {
            emid = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject cached_application_name = get_cyblack_message_broker_cached_application_name(self);
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!external_module_name.isString()) {
                                Errors.error($str_alt274$_INVITE__S___External_module_name, self, external_module_name);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt275$_INVITE__S___No_application_is_as, self);
                            }
                        }
                        {
                            SubLObject invite_message = object.object_new_method(CYBLACK_INVITATION_MESSAGE);
                            SubLObject external_module_id = cyblack_message_broker_get_external_module_id_method(self, external_module_name);
                            SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                            cyblack_object.cyblack_object_set_application_method(invite_message, application);
                            cyblack_messages.cyblack_message_set_session_id_method(invite_message, session_id);
                            cyblack_messages.cyblack_message_set_transaction_id_method(invite_message, transaction_id);
                            cyblack_messages.cyblack_message_set_external_module_id_method(invite_message, external_module_id);
                            cyblack_messages.cyblack_invitation_message_set_application_name_method(invite_message, cached_application_name);
                            cyblack_messages.cyblack_invitation_message_set_external_module_name_method(invite_message, external_module_name);
                            cyblack_message_broker_associate_common_ids_method(self, invite_message);
                            cyblack_message_broker_transmit_method(self, invite_message);
                            sublisp_throw($sym273$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_cached_application_name(self, cached_application_name);
                                set_cyblack_message_broker_session_id(self, session_id);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym273$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_stimulate_method(SubLObject self, SubLObject external_module, SubLObject activations) {
        if (activations == UNPROVIDED) {
            activations = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_structures.external_knowledge_source_p(external_module)) {
                                Errors.error($str_alt282$_STIMULATE__S____S_is_not_an_inst, self, external_module);
                            }
                        }
                        {
                            SubLObject cyblack_internal_knowledge_souce = cyblack_structures.eks_knowledge_source(external_module);
                            SubLObject external_module_guid_id = (NIL != cyblack_internal_knowledge_souce) ? ((SubLObject) (cyblack_ks.cyblack_external_knowledge_source_get_guid_as_string_method(cyblack_internal_knowledge_souce))) : NIL;
                            SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                            SubLObject proposal_id = cyblack_message_broker_new_proposal_id_method(self);
                            SubLObject listified_activations = (NIL != cyblack_precondition_pattern.cyblack_environment_p(activations)) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_listify_unique_bindings_method(activations))) : NIL;
                            SubLObject stimulate_message = object.object_new_method(CYBLACK_STIMULATE_MESSAGE);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_APPLICATION, application);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_SESSION_ID, session_id);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_TRANSACTION_ID, transaction_id);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_EXTERNAL_MODULE_ID, external_module_guid_id);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_PROPID, proposal_id);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_ACTIVATION_ARGS, listified_activations);
                            methods.funcall_instance_method_with_1_args(stimulate_message, SET_ACTIVATION_PATTERN, activations);
                            cyblack_message_broker_associate_common_ids_method(self, stimulate_message);
                            cyblack_guid_manager_record_use_method(guid_manager, proposal_id, stimulate_message);
                            cyblack_message_broker_transmit_method(self, stimulate_message);
                            sublisp_throw($sym281$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                        }
                        sublisp_throw($sym281$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym281$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_verify_method(SubLObject self, SubLObject proposal, SubLObject activations) {
        if (activations == UNPROVIDED) {
            activations = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt295$_VERIFY__S____S_is_not_an_instanc, self, proposal);
                            }
                        }
                        if ((NIL != cyblack_proposal.cyblack_external_proposal_p(proposal)) && (NIL != cyblack_proposal.cyblack_external_proposal_already_reconfirmed_p_method(proposal))) {
                            cyblack_proposal.cyblack_external_proposal_transfer_self_from_suspended_to_activated_method(proposal);
                            sublisp_throw($sym294$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                        }
                        {
                            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, proposal);
                            if (NIL != guid_info) {
                                {
                                    SubLObject external_module = methods.funcall_instance_method_with_0_args(proposal, GET_EXTERNAL_KNOWLEDGE_SOURCE);
                                    SubLObject external_module_guid_info = (NIL != external_module) ? ((SubLObject) (cyblack_guid_manager_get_guid_info_method(guid_manager, external_module))) : NIL;
                                    SubLObject external_module_guid = (NIL != external_module_guid_info) ? ((SubLObject) (cyblack_guid_info_get_guid_method(external_module_guid_info))) : NIL;
                                    SubLObject external_module_guid_id = (NIL != external_module_guid) ? ((SubLObject) (Guids.guid_to_string(external_module_guid))) : NIL;
                                    SubLObject proposal_guid = cyblack_guid_info_get_guid_method(guid_info);
                                    SubLObject proposal_id = (NIL != proposal_guid) ? ((SubLObject) (Guids.guid_to_string(proposal_guid))) : NIL;
                                    SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                                    SubLObject listified_activations = cyblack_precondition_pattern.cyblack_environment_listify_unique_bindings_method(activations);
                                    SubLObject verify_message = object.object_new_method(CYBLACK_VERIFY_MESSAGE);
                                    cyblack_object.cyblack_object_set_application_method(verify_message, application);
                                    cyblack_messages.cyblack_message_set_session_id_method(verify_message, session_id);
                                    cyblack_messages.cyblack_message_set_transaction_id_method(verify_message, transaction_id);
                                    cyblack_messages.cyblack_message_set_external_module_id_method(verify_message, external_module_guid_id);
                                    cyblack_messages.cyblack_embedded_propid_transmit_message_set_propid_method(verify_message, proposal_id);
                                    cyblack_messages.cyblack_activation_arglist_transmit_message_set_activation_args_method(verify_message, listified_activations);
                                    cyblack_message_broker_associate_common_ids_method(self, verify_message);
                                    cyblack_guid_manager_record_use_method(guid_manager, proposal_id, verify_message);
                                    cyblack_message_broker_transmit_method(self, verify_message);
                                    sublisp_throw($sym294$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                                }
                            }
                        }
                        sublisp_throw($sym294$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym294$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_cancel_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt303$_CANCEL__S____S_is_not_an_instanc, self, proposal);
                            }
                        }
                        {
                            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, proposal);
                            if (NIL != guid_info) {
                                {
                                    SubLObject external_module = methods.funcall_instance_method_with_0_args(proposal, GET_EXTERNAL_KNOWLEDGE_SOURCE);
                                    SubLObject external_module_guid_info = (NIL != external_module) ? ((SubLObject) (cyblack_guid_manager_get_guid_info_method(guid_manager, external_module))) : NIL;
                                    SubLObject external_module_guid = (NIL != external_module_guid_info) ? ((SubLObject) (cyblack_guid_info_get_guid_method(external_module_guid_info))) : NIL;
                                    SubLObject external_module_guid_id = (NIL != external_module_guid) ? ((SubLObject) (Guids.guid_to_string(external_module_guid))) : NIL;
                                    SubLObject proposal_guid = cyblack_guid_info_get_guid_method(guid_info);
                                    SubLObject proposal_id = (NIL != proposal_guid) ? ((SubLObject) (Guids.guid_to_string(proposal_guid))) : NIL;
                                    SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                                    SubLObject cancel_message = object.object_new_method(CYBLACK_CANCEL_MESSAGE);
                                    cyblack_object.cyblack_object_set_application_method(cancel_message, application);
                                    cyblack_messages.cyblack_message_set_session_id_method(cancel_message, session_id);
                                    cyblack_messages.cyblack_message_set_transaction_id_method(cancel_message, transaction_id);
                                    methods.funcall_instance_method_with_1_args(cancel_message, SET_EXTERNAL_MODULE_ID, external_module_guid_id);
                                    cyblack_messages.cyblack_embedded_propid_transmit_message_set_propid_method(cancel_message, proposal_id);
                                    cyblack_message_broker_associate_common_ids_method(self, cancel_message);
                                    cyblack_guid_manager_record_use_method(guid_manager, proposal_id, cancel_message);
                                    cyblack_message_broker_transmit_method(self, cancel_message);
                                    sublisp_throw($sym302$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_execute_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt309$_EXECUTE__S____S_is_not_an_instan, self, proposal);
                            }
                        }
                        {
                            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, proposal);
                            if (NIL != guid_info) {
                                {
                                    SubLObject external_module = methods.funcall_instance_method_with_0_args(proposal, GET_EXTERNAL_KNOWLEDGE_SOURCE);
                                    SubLObject external_module_guid_info = (NIL != external_module) ? ((SubLObject) (cyblack_guid_manager_get_guid_info_method(guid_manager, external_module))) : NIL;
                                    SubLObject external_module_guid = (NIL != external_module_guid_info) ? ((SubLObject) (cyblack_guid_info_get_guid_method(external_module_guid_info))) : NIL;
                                    SubLObject external_module_guid_id = (NIL != external_module_guid) ? ((SubLObject) (Guids.guid_to_string(external_module_guid))) : NIL;
                                    SubLObject proposal_guid = cyblack_guid_info_get_guid_method(guid_info);
                                    SubLObject proposal_id = (NIL != proposal_guid) ? ((SubLObject) (NIL != Guids.guid_p(proposal_guid) ? ((SubLObject) (Guids.guid_to_string(proposal_guid))) : proposal_guid)) : NIL;
                                    SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                                    SubLObject execute_message = object.object_new_method(CYBLACK_EXECUTE_MESSAGE);
                                    cyblack_object.cyblack_object_set_application_method(execute_message, application);
                                    cyblack_messages.cyblack_message_set_session_id_method(execute_message, session_id);
                                    cyblack_messages.cyblack_message_set_transaction_id_method(execute_message, transaction_id);
                                    cyblack_messages.cyblack_message_set_external_module_id_method(execute_message, external_module_guid_id);
                                    cyblack_messages.cyblack_embedded_propid_transmit_message_set_propid_method(execute_message, proposal_id);
                                    cyblack_message_broker_associate_common_ids_method(self, execute_message);
                                    cyblack_guid_manager_record_use_method(guid_manager, proposal_id, execute_message);
                                    cyblack_message_broker_transmit_method(self, execute_message);
                                    sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                                }
                            }
                        }
                        sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_terminate_method(SubLObject self, SubLObject external_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_structures.external_knowledge_source_p(external_module)) {
                                Errors.error($str_alt316$_TERMINATE__S____S_is_not_an_inst, self, external_module);
                            }
                        }
                        {
                            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, external_module);
                            if (NIL != guid_info) {
                                {
                                    SubLObject external_module_guid = cyblack_guid_info_get_guid_method(guid_info);
                                    if (NIL != external_module_guid) {
                                        {
                                            SubLObject external_module_id = (NIL != Guids.guid_p(external_module_guid)) ? ((SubLObject) (Guids.guid_to_string(external_module_guid))) : external_module_guid;
                                            SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                                            SubLObject terminate_message = object.object_new_method(CYBLACK_TERMINATE_MESSAGE);
                                            cyblack_object.cyblack_object_set_application_method(terminate_message, application);
                                            cyblack_messages.cyblack_message_set_session_id_method(terminate_message, session_id);
                                            cyblack_messages.cyblack_message_set_transaction_id_method(terminate_message, transaction_id);
                                            cyblack_messages.cyblack_message_set_external_module_id_method(terminate_message, external_module_id);
                                            cyblack_message_broker_associate_common_ids_method(self, terminate_message);
                                            cyblack_message_broker_transmit_method(self, terminate_message);
                                            sublisp_throw($sym315$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym315$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym315$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_report_contents_method(SubLObject self, SubLObject request_contents_message, SubLObject contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_request_contents_message_p(request_contents_message)) {
                                Errors.error($str_alt323$_REPORT_CONTENTS__S____S_is_not_a, self, request_contents_message);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!contents.isList()) {
                                Errors.error($str_alt324$_REPORT_CONTENTS__S____S_is_not_a, self, contents);
                            }
                        }
                        {
                            SubLObject transaction_id = cyblack_messages.cyblack_message_get_transaction_id_method(request_contents_message);
                            SubLObject emid = cyblack_messages.cyblack_message_get_external_module_id_method(request_contents_message);
                            SubLObject session_id_1 = cyblack_messages.cyblack_message_get_session_id_method(request_contents_message);
                            SubLObject type = cyblack_messages.cyblack_request_contents_message_get_type_string_method(request_contents_message);
                            SubLObject report_contents_message = object.new_class_instance(CYBLACK_REPORT_CONTENTS_MESSAGE);
                            cyblack_object.cyblack_object_set_application_method(report_contents_message, application);
                            cyblack_messages.cyblack_message_set_transaction_id_method(report_contents_message, transaction_id);
                            cyblack_messages.cyblack_message_set_external_module_id_method(report_contents_message, emid);
                            cyblack_messages.cyblack_message_set_session_id_method(report_contents_message, session_id_1);
                            cyblack_messages.cyblack_report_contents_message_set_type_string_method(report_contents_message, type);
                            cyblack_messages.cyblack_report_contents_message_set_contents_method(report_contents_message, contents);
                            cyblack_message_broker_associate_common_ids_method(self, report_contents_message);
                            cyblack_message_broker_transmit_method(self, report_contents_message);
                            sublisp_throw($sym322$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_report_postings_method(SubLObject self, SubLObject monitoring_ks, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_ks.cyblack_monitoring_ks_p(monitoring_ks)) {
                                Errors.error($str_alt331$_REPORT_POSTINGS__S____S_is_not_a, self, monitoring_ks);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                                Errors.error($str_alt332$_REPORT_POSTINGS__S____S_is_not_a, self, posting);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt333$_REPORT_POSTINGS__S___No_applicat, self);
                            }
                        }
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            SubLObject action = methods.funcall_instance_method_with_0_args(monitoring_ks, GET_ACTION);
                            SubLObject action_qualifiers = methods.funcall_instance_method_with_0_args(monitoring_ks, GET_ACTION_QUALIFIERS);
                            SubLObject precondition_pattern = methods.funcall_instance_method_with_0_args(monitoring_ks, GET_PRECONDITION_PATTERN);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == blackboard) {
                                    Errors.error($str_alt337$_REPORT_POSTINGS__S___No_blackboa, self, application);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == cyblack_precondition_pattern.cyblack_monitoring_pattern_p(precondition_pattern)) {
                                    Errors.error($str_alt338$_REPORT_POSTINGS__S____S_is_not_a, self, precondition_pattern);
                                }
                            }
                            {
                                SubLObject monitor_args = cyblack_precondition_pattern.cyblack_monitoring_pattern_get_monitor_args_method(precondition_pattern);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == cyblack_precondition_pattern.cyblack_environment_p(monitor_args)) {
                                        Errors.error($str_alt339$_REPORT_POSTINGS__S___Monitor_arg, self, monitor_args);
                                    }
                                }
                                {
                                    SubLObject v_bindings = cyblack_precondition_pattern.cyblack_environment_get_local_bindings_method(monitor_args);
                                    SubLObject panels = NIL;
                                    SubLObject postings = NIL;
                                    SubLObject type = NIL;
                                    {
                                        SubLObject cdolist_list_var = v_bindings;
                                        SubLObject binding = NIL;
                                        for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                            type = cyblack_precondition_pattern.cyblack_binding_get_type_method(binding);
                                            if (NIL != type) {
                                                panels = cons(cyblack_datatype.cyblack_datatype_get_panel(type, blackboard, UNPROVIDED), panels);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject pcase_var = action;
                                        if (pcase_var.eql($SEND)) {
                                            {
                                                SubLObject cdolist_list_var = action_qualifiers;
                                                SubLObject qualifier = NIL;
                                                for (qualifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , qualifier = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject pcase_var_2 = qualifier;
                                                        if (pcase_var_2.eql($NEW_POSTING)) {
                                                            if (NIL == subl_promotions.memberP(posting, postings, UNPROVIDED, UNPROVIDED)) {
                                                                postings = cons(posting, postings);
                                                            }
                                                        } else
                                                            if (pcase_var_2.eql($ALL_DIRECT_POSTINGS)) {
                                                                {
                                                                    SubLObject list_expression = panels;
                                                                    if (NIL == list_expression) {
                                                                        postings = NIL;
                                                                    } else
                                                                        if (list_expression.isAtom()) {
                                                                            postings = list(list_expression);
                                                                        } else
                                                                            if (NIL == list_expression.rest()) {
                                                                                {
                                                                                    SubLObject panel = list_expression.first();
                                                                                    postings = methods.funcall_instance_method_with_0_args(panel, GET_DIRECT_POSTINGS);
                                                                                }
                                                                            } else {
                                                                                {
                                                                                    SubLObject tail_cons = NIL;
                                                                                    SubLObject result = NIL;
                                                                                    postings = NIL;
                                                                                    {
                                                                                        SubLObject cdolist_list_var_3 = list_expression;
                                                                                        SubLObject panel = NIL;
                                                                                        for (panel = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , panel = cdolist_list_var_3.first()) {
                                                                                            result = methods.funcall_instance_method_with_0_args(panel, GET_DIRECT_POSTINGS);
                                                                                            if (NIL != result) {
                                                                                                if (NIL != tail_cons) {
                                                                                                    rplacd(tail_cons, result);
                                                                                                    tail_cons = last(result, UNPROVIDED);
                                                                                                } else {
                                                                                                    postings = methods.funcall_instance_method_with_0_args(panel, GET_DIRECT_POSTINGS);
                                                                                                    tail_cons = last(postings, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }


                                                                }
                                                            } else
                                                                if (pcase_var_2.eql($ALL_POSTINGS)) {
                                                                    {
                                                                        SubLObject list_expression = panels;
                                                                        if (NIL == list_expression) {
                                                                            postings = NIL;
                                                                        } else
                                                                            if (list_expression.isAtom()) {
                                                                                postings = list(list_expression);
                                                                            } else
                                                                                if (NIL == list_expression.rest()) {
                                                                                    {
                                                                                        SubLObject panel = list_expression.first();
                                                                                        postings = methods.funcall_instance_method_with_0_args(panel, GET_ALL_POSTINGS);
                                                                                    }
                                                                                } else {
                                                                                    {
                                                                                        SubLObject tail_cons = NIL;
                                                                                        SubLObject result = NIL;
                                                                                        postings = NIL;
                                                                                        {
                                                                                            SubLObject cdolist_list_var_4 = list_expression;
                                                                                            SubLObject panel = NIL;
                                                                                            for (panel = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , panel = cdolist_list_var_4.first()) {
                                                                                                result = methods.funcall_instance_method_with_0_args(panel, GET_ALL_POSTINGS);
                                                                                                if (NIL != result) {
                                                                                                    if (NIL != tail_cons) {
                                                                                                        rplacd(tail_cons, result);
                                                                                                        tail_cons = last(result, UNPROVIDED);
                                                                                                    } else {
                                                                                                        postings = methods.funcall_instance_method_with_0_args(panel, GET_ALL_POSTINGS);
                                                                                                        tail_cons = last(postings, UNPROVIDED);
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
                                            }
                                        } else {
                                            Errors.warn($str_alt346$_REPORT_POSTINGS__S___Unknown_act, self, action);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
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
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_state_change_method(SubLObject self, SubLObject external_module, SubLObject event_type, SubLObject contents) {
        if (contents == UNPROVIDED) {
            contents = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_structures.external_knowledge_source_p(external_module)) {
                                Errors.error($str_alt352$_STATE_CHANGE__S____S_is_not_an_i, self, external_module);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_event_type_p(event_type)) {
                                Errors.error($str_alt353$_STATE_CHANGE__S____S_is_not_an_i, self, event_type);
                            }
                        }
                        {
                            SubLObject cyblack_internal_knowledge_souce = cyblack_structures.eks_knowledge_source(external_module);
                            SubLObject external_module_guid_id = (NIL != cyblack_internal_knowledge_souce) ? ((SubLObject) (cyblack_ks.cyblack_external_knowledge_source_get_guid_as_string_method(cyblack_internal_knowledge_souce))) : NIL;
                            SubLObject transaction_id = cyblack_message_broker_new_transaction_id_method(self);
                            SubLObject state_change_message = object.new_class_instance(CYBLACK_STATE_CHANGE_MESSAGE);
                            cyblack_object.cyblack_object_set_application_method(state_change_message, application);
                            cyblack_messages.cyblack_message_set_session_id_method(state_change_message, session_id);
                            cyblack_messages.cyblack_message_set_transaction_id_method(state_change_message, transaction_id);
                            cyblack_messages.cyblack_message_set_external_module_id_method(state_change_message, external_module_guid_id);
                            cyblack_messages.cyblack_state_change_message_set_event_type_method(state_change_message, event_type);
                            cyblack_messages.cyblack_state_change_message_set_contents_method(state_change_message, contents);
                            cyblack_message_broker_associate_common_ids_method(self, state_change_message);
                            cyblack_message_broker_transmit_method(self, state_change_message);
                            sublisp_throw($sym351$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, transaction_id);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym351$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_retreive_transaction_sequence_internal_method(SubLObject self, SubLObject transaction_id) {
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    {
                        SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, transaction_id);
                        if (NIL != guid_info) {
                            {
                                SubLObject messages = cyblack_guid_info_get_messages_method(guid_info);
                                sublisp_throw($sym359$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, messages);
                            }
                        }
                        sublisp_throw($sym359$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym359$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject cyblack_message_broker_retreive_transaction_sequence_method(SubLObject self, SubLObject transaction_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!transaction_id.isString()) {
                                Errors.error($str_alt364$_RETREIVE_TRANSACTION_SEQUENCE__S, self, transaction_id);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == guid_manager) {
                                Errors.error($str_alt365$_RETREIVE_TRANSACTION_SEQUENCE__S, self);
                            }
                        }
                        {
                            SubLObject guid_info = cyblack_guid_manager_get_guid_info_method(guid_manager, transaction_id);
                            if (NIL != guid_info) {
                                {
                                    SubLObject messages = cyblack_guid_info_get_messages_method(guid_info);
                                    sublisp_throw($sym363$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, copy_list(messages));
                                }
                            }
                        }
                        sublisp_throw($sym363$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym363$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_transmit_method(SubLObject self, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_messages.cyblack_message_p(message)) {
                    Errors.error($str_alt369$_TRANSMIT__S____S_is_not_an_insta, self, message);
                }
            }
            cyblack_messages.cyblack_message_timestamp_now_method(message);
            {
                SubLObject external_connection = cyblack_message_broker_get_external_connection_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == external_connection) {
                        Errors.error($str_alt370$_TRANSMIT__S___No_external_connec, self);
                    }
                }
                methods.funcall_instance_method_with_2_args(external_connection, WRITE_EXTERNAL_MESSAGE, cyblack_messages.cyblack_message_get_session_id_method(message), message);
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_receive_method(SubLObject self, SubLObject message_as_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                SubLObject isolated_p = object.get_object_isolated_p(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(message_as_string.isString() || message_as_string.isList())) {
                                Errors.error($str_alt377$_RECEIVE__S____S_is_neither_a_str, self, message_as_string);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == guid_manager) {
                                Errors.error($str_alt378$_RECEIVE__S___No_guid_manager_is_, self);
                            }
                        }
                        {
                            SubLObject listified_message = (message_as_string.isList()) ? ((SubLObject) (message_as_string)) : read_from_string(message_as_string, $ERROR, $EOF, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject pcase_var = listified_message;
                            if (pcase_var.eql($EOF)) {
                                Errors.warn($str_alt381$_RECEIVE__S___Encountered_EOF_whi, self);
                            } else
                                if (pcase_var.eql($ERROR)) {
                                    Errors.warn($str_alt382$_RECEIVE__S___Encountered_ERROR_w, self);
                                } else {
                                    if (NIL == listified_message) {
                                        Errors.warn($str_alt383$_RECEIVE__S___Received_NIL_while_, self);
                                    } else
                                        if (listified_message.isCons()) {
                                            {
                                                SubLObject message_head = listified_message.first();
                                                SubLObject message_args = listified_message.rest();
                                                SubLObject new_message = NIL;
                                                SubLObject pcase_var_5 = message_head;
                                                if (pcase_var_5.eql($ACCEPT)) {
                                                    new_message = object.new_class_instance(CYBLACK_ACCEPT_MESSAGE);
                                                } else
                                                    if (pcase_var_5.eql($REJECT)) {
                                                        new_message = object.new_class_instance(CYBLACK_REJECT_MESSAGE);
                                                    } else
                                                        if (pcase_var_5.eql($PROPOSE)) {
                                                            new_message = object.new_class_instance(CYBLACK_PROPOSE_MESSAGE);
                                                        } else
                                                            if (pcase_var_5.eql($DECLINE)) {
                                                                new_message = object.new_class_instance(CYBLACK_DECLINE_MESSAGE);
                                                            } else
                                                                if (pcase_var_5.eql($REVOKE)) {
                                                                    new_message = object.new_class_instance(CYBLACK_REVOKE_MESSAGE);
                                                                } else
                                                                    if (pcase_var_5.eql($AFFIRM)) {
                                                                        new_message = object.new_class_instance(CYBLACK_AFFIRM_MESSAGE);
                                                                    } else
                                                                        if (pcase_var_5.eql($CONTRIBUTE)) {
                                                                            new_message = object.new_class_instance(CYBLACK_CONTRIBUTE_MESSAGE);
                                                                        } else
                                                                            if (pcase_var_5.eql($ACQUIT)) {
                                                                                new_message = object.new_class_instance(CYBLACK_ACQUIT_MESSAGE);
                                                                            } else
                                                                                if (pcase_var_5.eql($TERMINATE)) {
                                                                                    new_message = object.new_class_instance(CYBLACK_TERMINATE_MESSAGE);
                                                                                } else
                                                                                    if (pcase_var_5.eql($REQUEST_CONTENTS)) {
                                                                                        new_message = object.new_class_instance(CYBLACK_REQUEST_CONTENTS_MESSAGE);
                                                                                    } else {
                                                                                        if (NIL != cyblack_application.cyblack_dynamic_application_p(application)) {
                                                                                            {
                                                                                                SubLObject pcase_var_6 = message_head;
                                                                                                if (pcase_var_6.eql($ADD_KNOWLEDGE_SOURCE)) {
                                                                                                    new_message = object.new_class_instance(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE);
                                                                                                } else
                                                                                                    if (pcase_var_6.eql($REMOVE_KNOWLEDGE_SOURCE)) {
                                                                                                        new_message = object.new_class_instance(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE);
                                                                                                    } else
                                                                                                        if (pcase_var_6.eql($ADD_POSTING_CLASS)) {
                                                                                                            new_message = object.new_class_instance(CYBLACK_ADD_POSTING_CLASS_MESSAGE);
                                                                                                        } else
                                                                                                            if (pcase_var_6.eql($ADD_PANEL)) {
                                                                                                                new_message = object.new_class_instance(CYBLACK_ADD_PANEL_MESSAGE);
                                                                                                            } else
                                                                                                                if (pcase_var_6.eql($REMOVE_PANEL)) {
                                                                                                                    new_message = object.new_class_instance(CYBLACK_REMOVE_PANEL_MESSAGE);
                                                                                                                } else {
                                                                                                                    Errors.warn($str_alt413$_RECEIVE__S___Unknown_message_typ, self, message_head);
                                                                                                                }




                                                                                            }
                                                                                        } else {
                                                                                            Errors.warn($str_alt413$_RECEIVE__S___Unknown_message_typ, self, message_head);
                                                                                        }
                                                                                    }









                                                if (NIL != new_message) {
                                                    {
                                                        SubLObject ks = NIL;
                                                        cyblack_object.cyblack_object_set_application_method(new_message, application);
                                                        methods.funcall_instance_method_with_1_args(new_message, PARSE_ARGS, message_args);
                                                        force_output(T);
                                                        cyblack_messages.cyblack_message_set_message_broker_method(new_message, self);
                                                        {
                                                            SubLObject external_module_id = cyblack_messages.cyblack_message_get_external_module_id_method(new_message);
                                                            SubLObject external_module_given_emid = cyblack_guid_manager_get_reference_method(guid_manager, external_module_id);
                                                            if ((NIL != external_module_given_emid) && (NIL != cyblack_structures.external_knowledge_source_p(external_module_given_emid))) {
                                                                if (NIL != cyblack_messages.cyblack_receive_message_p(new_message)) {
                                                                    {
                                                                        SubLObject eks = external_module_given_emid;
                                                                        SubLObject knowledge_source = cyblack_structures.eks_knowledge_source(eks);
                                                                        ks = knowledge_source;
                                                                        cyblack_messages.cyblack_receive_message_set_external_module_name_method(new_message, NIL != knowledge_source ? ((SubLObject) (cyblack_ks.cyblack_external_knowledge_source_get_name_method(knowledge_source))) : $str_alt198$);
                                                                    }
                                                                    cyblack_messages.cyblack_message_set_knowledge_source_method(new_message, ks);
                                                                } else
                                                                    if (NIL != cyblack_messages.cyblack_modification_message_p(new_message)) {
                                                                        {
                                                                            SubLObject eks = external_module_given_emid;
                                                                            SubLObject knowledge_source = cyblack_structures.eks_knowledge_source(eks);
                                                                            ks = knowledge_source;
                                                                            cyblack_messages.cyblack_message_set_knowledge_source_method(new_message, ks);
                                                                        }
                                                                    }

                                                            }
                                                        }
                                                        {
                                                            SubLObject new_message_transaction_id = cyblack_messages.cyblack_message_get_transaction_id_method(new_message);
                                                            SubLObject receive_message_cause = (NIL != new_message_transaction_id) ? ((SubLObject) (cyblack_message_broker_get_cause_method(self, cyblack_messages.cyblack_message_get_transaction_id_method(new_message)))) : NIL;
                                                            if (NIL != receive_message_cause) {
                                                                force_output(T);
                                                                cyblack_messages.cyblack_receive_message_set_cause_method(new_message, receive_message_cause);
                                                            } else {
                                                                {
                                                                    SubLObject rm_sid = cyblack_messages.cyblack_message_get_session_id_method(new_message);
                                                                    SubLObject rm_tid = cyblack_messages.cyblack_message_get_transaction_id_method(new_message);
                                                                    SubLObject rm_emid = cyblack_messages.cyblack_message_get_external_module_id_method(new_message);
                                                                    force_output(T);
                                                                    if (NIL != cyblack_messages.cyblack_propose_message_p(new_message)) {
                                                                        {
                                                                            SubLObject rm_propid = cyblack_messages.cyblack_embedded_propid_receive_message_get_propid_method(new_message);
                                                                            SubLObject implicit_stimulate_message = object.new_class_instance(CYBLACK_STIMULATE_MESSAGE);
                                                                            cyblack_messages.cyblack_message_timestamp_now_method(implicit_stimulate_message);
                                                                            cyblack_messages.cyblack_stimulate_message_set_implicit_method(implicit_stimulate_message, T);
                                                                            cyblack_messages.cyblack_message_set_knowledge_source_method(implicit_stimulate_message, ks);
                                                                            cyblack_messages.cyblack_message_set_session_id_method(implicit_stimulate_message, rm_sid);
                                                                            cyblack_messages.cyblack_message_set_transaction_id_method(implicit_stimulate_message, rm_tid);
                                                                            cyblack_messages.cyblack_message_set_external_module_id_method(implicit_stimulate_message, rm_emid);
                                                                            cyblack_messages.cyblack_embedded_propid_transmit_message_set_propid_method(implicit_stimulate_message, rm_propid);
                                                                            cyblack_message_broker_associate_common_ids_method(self, implicit_stimulate_message);
                                                                            cyblack_guid_manager_record_use_method(guid_manager, rm_propid, implicit_stimulate_message);
                                                                        }
                                                                    } else
                                                                        if (NIL != cyblack_messages.cyblack_contribute_message_p(new_message)) {
                                                                            force_output(T);
                                                                            {
                                                                                SubLObject cm_propid = cyblack_messages.cyblack_embedded_propid_receive_message_get_propid_method(new_message);
                                                                                force_output(T);
                                                                                if (NIL != cm_propid) {
                                                                                    {
                                                                                        SubLObject proposal = cyblack_guid_manager_get_reference_method(guid_manager, cm_propid);
                                                                                        if (((NIL != proposal) && (NIL != cyblack_proposal.cyblack_proposal_p(proposal))) && (NIL == methods.funcall_instance_method_with_0_args(proposal, ISOLATED_P))) {
                                                                                            methods.funcall_instance_method_with_0_args(proposal, DELETE_SELF_FROM_ALL_COLLECTIONS);
                                                                                            object.object_isolate_method(proposal);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    {
                                                                                        SubLObject execute_message = object.new_class_instance(CYBLACK_EXECUTE_MESSAGE);
                                                                                        SubLObject new_propid = cyblack_message_broker_new_proposal_id_method(self);
                                                                                        SubLObject new_tid = (NIL != cyblack_messages.cyblack_message_get_transaction_id_method(new_message)) ? ((SubLObject) (cyblack_messages.cyblack_message_get_transaction_id_method(new_message))) : cyblack_message_broker_new_transaction_id_method(self);
                                                                                        cyblack_messages.cyblack_message_set_session_id_method(execute_message, cyblack_messages.cyblack_message_get_session_id_method(new_message));
                                                                                        cyblack_messages.cyblack_message_set_external_module_id_method(execute_message, cyblack_messages.cyblack_message_get_external_module_id_method(new_message));
                                                                                        cyblack_messages.cyblack_message_set_transaction_id_method(execute_message, new_tid);
                                                                                        cyblack_guid_manager_intern_method(guid_manager, new_tid, $TRANSACTION, execute_message);
                                                                                        cyblack_messages.cyblack_embedded_propid_receive_message_set_propid_method(new_message, new_propid);
                                                                                        force_output(T);
                                                                                        cyblack_messages.cyblack_message_set_transaction_id_method(new_message, new_tid);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (NIL != cyblack_messages.cyblack_request_contents_message_p(new_message)) {
                                                                                {
                                                                                    SubLObject existing_tid = cyblack_messages.cyblack_message_get_transaction_id_method(new_message);
                                                                                    SubLObject new_tid = (NIL != existing_tid) ? ((SubLObject) (existing_tid)) : cyblack_message_broker_new_transaction_id_method(self);
                                                                                    cyblack_messages.cyblack_message_set_transaction_id_method(new_message, new_tid);
                                                                                    cyblack_guid_manager_intern_method(guid_manager, new_tid, $TRANSACTION, new_message);
                                                                                }
                                                                            }


                                                                }
                                                            }
                                                            cyblack_messages.cyblack_message_timestamp_now_method(new_message);
                                                        }
                                                        sublisp_throw($sym376$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, new_message);
                                                    }
                                                }
                                            }
                                        }

                                }

                        }
                        sublisp_throw($sym376$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                                cyblack_object.set_cyblack_object_application(self, application);
                                object.set_object_isolated_p(self, isolated_p);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym376$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_get_cause_method(SubLObject self, SubLObject guid_string_or_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(guid_string_or_message.isString() || (NIL != cyblack_messages.cyblack_message_p(guid_string_or_message)))) {
                                Errors.error($str_alt421$_GET_CAUSE__S____S_is_neither_a_s, self, guid_string_or_message);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == guid_manager) {
                                Errors.error($str_alt422$_GET_CAUSE__S___No_guid_manager_i, self);
                            }
                        }
                        if (guid_string_or_message.isString()) {
                            {
                                SubLObject messages = cyblack_guid_manager_get_messages_method(guid_manager, guid_string_or_message);
                                if (NIL != messages) {
                                    {
                                        SubLObject cdolist_list_var = messages;
                                        SubLObject message = NIL;
                                        for (message = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , message = cdolist_list_var.first()) {
                                            if (NIL != cyblack_messages.cyblack_transmit_message_p(message)) {
                                                sublisp_throw($sym420$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, message);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject guid_string = cyblack_messages.cyblack_message_get_transaction_id_method(guid_string_or_message);
                                sublisp_throw($sym420$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, cyblack_message_broker_get_cause_method(self, guid_string));
                            }
                        }
                        sublisp_throw($sym420$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_guid_manager(self, guid_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym420$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_process_messages_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_broker_method = NIL;
                SubLObject session_id = get_cyblack_message_broker_session_id(self);
                try {
                    try {
                        {
                            SubLObject external_connection = cyblack_message_broker_get_external_connection_method(self);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == session_id) {
                                    Errors.error($str_alt427$_PROCESS_MESSAGES__S___Could_not_, self);
                                }
                            }
                            {
                                SubLObject message = cyblack_external_connection_read_external_message_method(external_connection, session_id);
                                while (NIL != message) {
                                    methods.funcall_instance_method_with_0_args(message, EXECUTE);
                                    message = cyblack_external_connection_read_external_message_method(external_connection, session_id);
                                } 
                            }
                            sublisp_throw($sym426$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_broker_session_id(self, session_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym426$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
                }
                return catch_var_for_cyblack_message_broker_method;
            }
        }
    }

    public static final SubLObject cyblack_message_broker_describe_guid_manager_method(SubLObject self, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject catch_var_for_cyblack_message_broker_method = NIL;
            SubLObject guid_manager = get_cyblack_message_broker_guid_manager(self);
            try {
                try {
                    if (NIL != guid_manager) {
                        cyblack_guid_manager_describe_method(guid_manager, stream, depth);
                    }
                    sublisp_throw($sym431$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_broker_guid_manager(self, guid_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_broker_method = Errors.handleThrowable(ccatch_env_var, $sym431$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD);
            }
            return catch_var_for_cyblack_message_broker_method;
        }
    }

    public static final SubLObject get_cyblack_external_module_external_module_name(SubLObject cyblack_external_module) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_module, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject set_cyblack_external_module_external_module_name(SubLObject cyblack_external_module, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_module, value, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_module_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_module_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE, EXTERNAL_MODULE_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_module_p(SubLObject cyblack_external_module) {
        return classes.subloop_instanceof_class(cyblack_external_module, CYBLACK_EXTERNAL_MODULE);
    }

    public static final SubLObject cyblack_external_module_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_module_method = NIL;
            SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    external_module_name = NIL;
                    sublisp_throw($sym439$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_method = Errors.handleThrowable(ccatch_env_var, $sym439$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD);
            }
            return catch_var_for_cyblack_external_module_method;
        }
    }

    public static final SubLObject cyblack_external_module_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_external_module_method = NIL;
            SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
            try {
                try {
                    format(stream, $str_alt443$__CYBLACK_EXTERNAL_MODULE___S_, external_module_name);
                    sublisp_throw($sym442$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_method = Errors.handleThrowable(ccatch_env_var, $sym442$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD);
            }
            return catch_var_for_cyblack_external_module_method;
        }
    }

    public static final SubLObject cyblack_external_module_get_external_module_name_method(SubLObject self) {
        {
            SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
            return external_module_name;
        }
    }

    public static final SubLObject cyblack_external_module_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_module_method = NIL;
                SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_external_module_name) || new_external_module_name.isString())) {
                                Errors.error($str_alt452$_SET_EXTERNAL_MODULE_NAME__S____S, self, new_external_module_name);
                            }
                        }
                        external_module_name = new_external_module_name;
                        sublisp_throw($sym451$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD, new_external_module_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_module_external_module_name(self, external_module_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_module_method = Errors.handleThrowable(ccatch_env_var, $sym451$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD);
                }
                return catch_var_for_cyblack_external_module_method;
            }
        }
    }

    public static final SubLObject cyblack_external_module_has_name_p_method(SubLObject self, SubLObject name) {
        {
            SubLObject catch_var_for_cyblack_external_module_method = NIL;
            SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
            try {
                try {
                    sublisp_throw($sym457$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD, equalp(name, external_module_name));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_method = Errors.handleThrowable(ccatch_env_var, $sym457$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD);
            }
            return catch_var_for_cyblack_external_module_method;
        }
    }

    public static final SubLObject get_cyblack_external_module_instance_qua_list_element_parent_links(SubLObject cyblack_external_module_instance) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_module_instance, SIX_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_external_module_instance_qua_list_element_parent_links(SubLObject cyblack_external_module_instance, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_module_instance, value, SIX_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_external_module_instance_external_module_port(SubLObject cyblack_external_module_instance) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_module_instance, FIVE_INTEGER, EXTERNAL_MODULE_PORT);
    }

    public static final SubLObject set_cyblack_external_module_instance_external_module_port(SubLObject cyblack_external_module_instance, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_module_instance, value, FIVE_INTEGER, EXTERNAL_MODULE_PORT);
    }

    public static final SubLObject get_cyblack_external_module_instance_external_module_id(SubLObject cyblack_external_module_instance) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_module_instance, FOUR_INTEGER, EXTERNAL_MODULE_ID);
    }

    public static final SubLObject set_cyblack_external_module_instance_external_module_id(SubLObject cyblack_external_module_instance, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_module_instance, value, FOUR_INTEGER, EXTERNAL_MODULE_ID);
    }

    public static final SubLObject get_cyblack_external_module_instance_qua_list_element_self_deletion_mode(SubLObject cyblack_external_module_instance) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_module_instance);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_module_instance, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_external_module_instance));
    }

    public static final SubLObject set_cyblack_external_module_instance_qua_list_element_self_deletion_mode(SubLObject cyblack_external_module_instance, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_module_instance);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_module_instance, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_external_module_instance, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_external_module_instance)));
        return value;
    }

    public static final SubLObject cyblack_external_module_instance_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_external_module_instance_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_external_module_instance_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_external_module_instance_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
            SubLObject template_collections = NIL;
            SubLObject list_expression = template_parent_links;
            if (NIL == list_expression) {
                template_collections = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_collections = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_parent_link = list_expression.first();
                            template_collections = list(subloop_collections.dlc_owner(template_parent_link));
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            {
                                SubLObject template_parent_link = list_expression.first();
                                template_collections = list(subloop_collections.dlc_owner(template_parent_link));
                                tail_cons = template_collections;
                            }
                            {
                                SubLObject cdolist_list_var = list_expression.rest();
                                SubLObject template_parent_link = NIL;
                                for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                                    result = list(subloop_collections.dlc_owner(template_parent_link));
                                    rplacd(tail_cons, result);
                                    tail_cons = result;
                                }
                            }
                        }
                    }


            return list_utilities.unique_elements(template_collections, UNPROVIDED);
        }
    }

    public static final SubLObject cyblack_external_module_instance_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
            SubLObject cdolist_list_var = template_parent_links;
            SubLObject template_parent_link = NIL;
            for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                if (subloop_collections.dlc_owner(template_parent_link) == collection) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_module_instance_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
            try {
                cyblack_external_module_instance_set_self_deletion_mode_method(self, T);
                {
                    SubLObject cdolist_list_var = template_parent_links;
                    SubLObject template_parent_link = NIL;
                    for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_parent_link), template_parent_link);
                        subloop_collections._csetf_dlc_owner(template_parent_link, NIL);
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        cyblack_external_module_instance_set_self_deletion_mode_method(self, NIL);
                        cyblack_external_module_instance_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_external_module_instance_transfer_self_method(SubLObject self, SubLObject current_collection, SubLObject new_collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt489$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt489$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection);
                }
            }
            {
                SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
                SubLObject template_parent_link = NIL;
                SubLObject template_target_link = NIL;
                if (NIL != template_parent_links) {
                    if (subloop_collections.dlc_owner(template_parent_links.first()) == current_collection) {
                        template_target_link = template_parent_links.first();
                        cyblack_external_module_instance_set_parent_links_method(self, template_parent_links.rest());
                    } else {
                        {
                            SubLObject template_previous = template_parent_links;
                            SubLObject template_sublinks = template_previous.rest();
                            while (NIL != template_sublinks) {
                                template_parent_link = template_sublinks.first();
                                if (subloop_collections.dlc_owner(template_parent_link) == current_collection) {
                                    template_target_link = template_parent_link;
                                    rplacd(template_previous, template_sublinks.rest());
                                    template_sublinks = NIL;
                                } else {
                                    template_previous = template_sublinks;
                                    template_sublinks = template_sublinks.rest();
                                }
                            } 
                        }
                    }
                    if (NIL != template_target_link) {
                        try {
                            cyblack_external_module_instance_set_self_deletion_mode_method(self, T);
                            subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                    methods.funcall_instance_method_with_1_args(new_collection, ADD, self);
                                    cyblack_external_module_instance_set_self_deletion_mode_method(self, NIL);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return self;
            }
        }
    }

    public static final SubLObject cyblack_external_module_instance_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_external_module_instance_set_parent_links_method(self, template_parent_links.rest());
                } else {
                    {
                        SubLObject template_previous = template_parent_links;
                        SubLObject template_sublinks = template_previous.rest();
                        while (NIL != template_sublinks) {
                            template_parent_link = template_sublinks.first();
                            if (subloop_collections.dlc_owner(template_parent_link) == collection) {
                                template_target_link = template_parent_link;
                                rplacd(template_previous, template_sublinks.rest());
                                template_sublinks = NIL;
                            } else {
                                template_previous = template_sublinks;
                                template_sublinks = template_sublinks.rest();
                            }
                        } 
                    }
                }
                if (NIL != template_target_link) {
                    try {
                        cyblack_external_module_instance_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_external_module_instance_set_self_deletion_mode_method(self, NIL);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_external_module_instance_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_external_module_instance_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_external_module_instance_set_parent_links_method(self, template_parent_links.rest());
                } else {
                    {
                        SubLObject template_previous_cons = template_parent_links;
                        SubLObject template_current_cons = template_parent_links.rest();
                        while (NIL != template_current_cons) {
                            if (old_parent_link == template_current_cons.first()) {
                                rplacd(template_previous_cons, template_current_cons.rest());
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, subloop_collections.dlc_owner(old_parent_link));
                                return old_parent_link;
                            }
                            template_previous_cons = template_current_cons;
                            template_current_cons = template_current_cons.rest();
                        } 
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_module_instance_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_external_module_instance_set_parent_links_method(self, cons(new_parent_link, cyblack_external_module_instance_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_module_instance_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_module_instance_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE_INSTANCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE_INSTANCE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE_INSTANCE, EXTERNAL_MODULE_PORT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MODULE_INSTANCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_module_instance_p(SubLObject cyblack_external_module_instance) {
        return classes.subloop_instanceof_class(cyblack_external_module_instance, CYBLACK_EXTERNAL_MODULE_INSTANCE);
    }

    public static final SubLObject cyblack_external_module_instance_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_external_module_instance_qua_list_element_parent_links(self);
            SubLObject external_module_port = get_cyblack_external_module_instance_external_module_port(self);
            SubLObject external_module_id = get_cyblack_external_module_instance_external_module_id(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_external_module_instance_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_external_module_initialize_method(self);
                    external_module_id = NIL;
                    external_module_port = NIL;
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    sublisp_throw($sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_instance_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_external_module_instance_external_module_port(self, external_module_port);
                            set_cyblack_external_module_instance_external_module_id(self, external_module_id);
                            set_cyblack_external_module_instance_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
            }
            return catch_var_for_cyblack_external_module_instance_method;
        }
    }

    public static final SubLObject cyblack_external_module_instance_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
            SubLObject external_module_port = get_cyblack_external_module_instance_external_module_port(self);
            SubLObject external_module_id = get_cyblack_external_module_instance_external_module_id(self);
            SubLObject external_module_name = get_cyblack_external_module_external_module_name(self);
            try {
                try {
                    format(stream, $str_alt510$__CYBLACK_EXTERNAL_MODULE_INSTANC, new SubLObject[]{ external_module_name, external_module_id, external_module_port });
                    sublisp_throw($sym509$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_instance_external_module_port(self, external_module_port);
                            set_cyblack_external_module_instance_external_module_id(self, external_module_id);
                            set_cyblack_external_module_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym509$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
            }
            return catch_var_for_cyblack_external_module_instance_method;
        }
    }

    public static final SubLObject cyblack_external_module_instance_get_external_module_id_method(SubLObject self) {
        {
            SubLObject external_module_id = get_cyblack_external_module_instance_external_module_id(self);
            return external_module_id;
        }
    }

    public static final SubLObject cyblack_external_module_instance_set_external_module_id_method(SubLObject self, SubLObject new_external_module_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
                SubLObject external_module_id = get_cyblack_external_module_instance_external_module_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_external_module_id) || new_external_module_id.isString()) || (NIL != Guids.guid_p(new_external_module_id)))) {
                                Errors.error($str_alt517$_SET_EXTERNAL_MODULE_ID__S____S_i, self, new_external_module_id);
                            }
                        }
                        if (new_external_module_id.isString()) {
                            external_module_id = new_external_module_id;
                        } else {
                            external_module_id = Guids.guid_to_string(new_external_module_id);
                        }
                        sublisp_throw($sym516$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, new_external_module_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_module_instance_external_module_id(self, external_module_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym516$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
                }
                return catch_var_for_cyblack_external_module_instance_method;
            }
        }
    }

    public static final SubLObject cyblack_external_module_instance_get_external_module_port_method(SubLObject self) {
        {
            SubLObject external_module_port = get_cyblack_external_module_instance_external_module_port(self);
            return external_module_port;
        }
    }

    public static final SubLObject cyblack_external_module_instance_set_external_module_port_method(SubLObject self, SubLObject new_external_module_port) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
                SubLObject external_module_port = get_cyblack_external_module_instance_external_module_port(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_external_module_port) || (NIL != cyblack_port_p(new_external_module_port)))) {
                                Errors.error($str_alt526$_SET_EXTERNAL_MODULE_PORT__S____S, self, new_external_module_port);
                            }
                        }
                        external_module_port = new_external_module_port;
                        sublisp_throw($sym525$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, new_external_module_port);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_module_instance_external_module_port(self, external_module_port);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym525$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
                }
                return catch_var_for_cyblack_external_module_instance_method;
            }
        }
    }

    public static final SubLObject cyblack_external_module_instance_has_name_and_port_p_method(SubLObject self, SubLObject name, SubLObject port) {
        {
            SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
            SubLObject external_module_port = get_cyblack_external_module_instance_external_module_port(self);
            try {
                try {
                    sublisp_throw($sym531$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, makeBoolean((NIL != cyblack_external_module_has_name_p_method(self, name)) && ((external_module_port == port) || (NIL != cyblack_port_equal_method(external_module_port, port)))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_instance_external_module_port(self, external_module_port);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym531$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
            }
            return catch_var_for_cyblack_external_module_instance_method;
        }
    }

    public static final SubLObject cyblack_external_module_instance_get_parent_links_method(SubLObject self) {
        {
            SubLObject qua_list_element_parent_links = get_cyblack_external_module_instance_qua_list_element_parent_links(self);
            return qua_list_element_parent_links;
        }
    }

    public static final SubLObject cyblack_external_module_instance_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_external_module_instance_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym540$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_instance_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym540$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
            }
            return catch_var_for_cyblack_external_module_instance_method;
        }
    }

    public static final SubLObject cyblack_external_module_instance_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_external_module_instance_qua_list_element_self_deletion_mode(self);
            return qua_list_element_self_deletion_mode;
        }
    }

    public static final SubLObject cyblack_external_module_instance_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_external_module_instance_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_external_module_instance_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym548$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_module_instance_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_module_instance_method = Errors.handleThrowable(ccatch_env_var, $sym548$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD);
            }
            return catch_var_for_cyblack_external_module_instance_method;
        }
    }

    public static final SubLObject cyblack_external_module_name_p(SubLObject v_object) {
        return stringp(v_object);
    }

    public static final SubLObject cyblack_port_id_p(SubLObject v_object) {
        return integerp(v_object);
    }

    public static final SubLObject cyblack_port_id_equal_p(SubLObject portid1, SubLObject portid2) {
        return numE(portid1, portid2);
    }

    public static final SubLObject get_cyblack_port_outgoing_message_queue(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, NINE_INTEGER, OUTGOING_MESSAGE_QUEUE);
    }

    public static final SubLObject set_cyblack_port_outgoing_message_queue(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, NINE_INTEGER, OUTGOING_MESSAGE_QUEUE);
    }

    public static final SubLObject get_cyblack_port_incoming_message_queue(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, EIGHT_INTEGER, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject set_cyblack_port_incoming_message_queue(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, EIGHT_INTEGER, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject get_cyblack_port_external_module_instances(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, SEVEN_INTEGER, EXTERNAL_MODULE_INSTANCES);
    }

    public static final SubLObject set_cyblack_port_external_module_instances(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, SEVEN_INTEGER, EXTERNAL_MODULE_INSTANCES);
    }

    public static final SubLObject get_cyblack_port_output_stream(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, SIX_INTEGER, OUTPUT_STREAM);
    }

    public static final SubLObject set_cyblack_port_output_stream(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, SIX_INTEGER, OUTPUT_STREAM);
    }

    public static final SubLObject get_cyblack_port_input_stream(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, FIVE_INTEGER, INPUT_STREAM);
    }

    public static final SubLObject set_cyblack_port_input_stream(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, FIVE_INTEGER, INPUT_STREAM);
    }

    public static final SubLObject get_cyblack_port_port_id(SubLObject cyblack_port) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject set_cyblack_port_port_id(SubLObject cyblack_port, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port, value, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject get_cyblack_port_running(SubLObject cyblack_port) {
        return classes.ldb_test($int$4099, subloop_structures.instance_boolean_slots(cyblack_port));
    }

    public static final SubLObject set_cyblack_port_running(SubLObject cyblack_port, SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(cyblack_port, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4099, subloop_structures.instance_boolean_slots(cyblack_port)));
        return value;
    }

    public static final SubLObject get_cyblack_port_connected(SubLObject cyblack_port) {
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_port));
    }

    public static final SubLObject set_cyblack_port_connected(SubLObject cyblack_port, SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(cyblack_port, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_port)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LIST_ELEMENT_OBJECT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, CONNECTED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, RUNNING, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LIST_ELEMENT_OBJECT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, PORT_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, INPUT_STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, OUTPUT_STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, EXTERNAL_MODULE_INSTANCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT, OUTGOING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_port_p(SubLObject cyblack_port) {
        return classes.subloop_instanceof_class(cyblack_port, CYBLACK_PORT);
    }

    public static final SubLObject cyblack_port_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject outgoing_message_queue = get_cyblack_port_outgoing_message_queue(self);
            SubLObject incoming_message_queue = get_cyblack_port_incoming_message_queue(self);
            SubLObject external_module_instances = get_cyblack_port_external_module_instances(self);
            SubLObject port_id = get_cyblack_port_port_id(self);
            SubLObject running = get_cyblack_port_running(self);
            SubLObject connected = get_cyblack_port_connected(self);
            try {
                try {
                    cyblack_list_element_object.cyblack_list_element_object_initialize_method(self);
                    port_id = NIL;
                    external_module_instances = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                    connected = NIL;
                    running = NIL;
                    incoming_message_queue = NIL;
                    outgoing_message_queue = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                    sublisp_throw($sym566$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_outgoing_message_queue(self, outgoing_message_queue);
                            set_cyblack_port_incoming_message_queue(self, incoming_message_queue);
                            set_cyblack_port_external_module_instances(self, external_module_instances);
                            set_cyblack_port_port_id(self, port_id);
                            set_cyblack_port_running(self, running);
                            set_cyblack_port_connected(self, connected);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym566$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject port_id = get_cyblack_port_port_id(self);
            try {
                try {
                    format(stream, $str_alt571$__CYBLACK_PORT___S_, port_id);
                    sublisp_throw($sym570$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym570$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_equal_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject port_id = get_cyblack_port_port_id(self);
            try {
                try {
                    sublisp_throw($sym575$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, makeBoolean((NIL != cyblack_port_p(v_object)) && (((NIL == port_id) && (NIL == cyblack_port_get_port_id_method(v_object))) || (NIL != cyblack_port_id_equal_p(port_id, cyblack_port_get_port_id_method(v_object))))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym575$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_port_incoming_message_queue(self);
            try {
                try {
                    cyblack_object.cyblack_object_set_application_method(self, new_application);
                    if (NIL != new_application) {
                        incoming_message_queue = methods.funcall_instance_method_with_0_args(new_application, GET_INCOMING_MESSAGE_QUEUE);
                    }
                    sublisp_throw($sym578$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, new_application);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym578$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_get_port_id_method(SubLObject self) {
        {
            SubLObject port_id = get_cyblack_port_port_id(self);
            return port_id;
        }
    }

    public static final SubLObject cyblack_port_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject port_id = get_cyblack_port_port_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_port_id) || (NIL != cyblack_port_id_p(new_port_id)))) {
                                Errors.error($str_alt588$_SET_PORT_ID__S____S_is_not_a_val, self, new_port_id);
                            }
                        }
                        port_id = new_port_id;
                        sublisp_throw($sym587$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, port_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_port_id(self, port_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym587$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_get_input_stream_method(SubLObject self) {
        {
            SubLObject input_stream = get_cyblack_port_input_stream(self);
            return input_stream;
        }
    }

    public static final SubLObject cyblack_port_has_input_stream_p_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject input_stream = get_cyblack_port_input_stream(self);
            try {
                try {
                    sublisp_throw($sym596$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, eq(stream, input_stream));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_input_stream(self, input_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym596$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_set_input_stream_method(SubLObject self, SubLObject new_input_stream) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject input_stream = get_cyblack_port_input_stream(self);
            try {
                try {
                    input_stream = new_input_stream;
                    sublisp_throw($sym601$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, new_input_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_input_stream(self, input_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym601$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_get_output_stream_method(SubLObject self) {
        {
            SubLObject output_stream = get_cyblack_port_output_stream(self);
            return output_stream;
        }
    }

    public static final SubLObject cyblack_port_set_output_stream_method(SubLObject self, SubLObject new_output_stream) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject output_stream = get_cyblack_port_output_stream(self);
            try {
                try {
                    output_stream = new_output_stream;
                    sublisp_throw($sym609$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, new_output_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_output_stream(self, output_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym609$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_has_output_stream_p_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject output_stream = get_cyblack_port_output_stream(self);
            try {
                try {
                    sublisp_throw($sym613$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, eq(stream, output_stream));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_output_stream(self, output_stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym613$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_has_port_id_p_method(SubLObject self, SubLObject target_port_id) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject port_id = get_cyblack_port_port_id(self);
            try {
                try {
                    sublisp_throw($sym618$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL != port_id ? ((SubLObject) (makeBoolean((NIL != target_port_id) && (NIL != cyblack_port_id_equal_p(port_id, target_port_id))))) : sublisp_null(target_port_id));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym618$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_has_external_module_instance_p_method(SubLObject self, SubLObject external_module_name, SubLObject emid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject external_module_instances = get_cyblack_port_external_module_instances(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!external_module_name.isString()) {
                                Errors.error($str_alt624$_HAS_EXTERNAL_MODULE_NAME__S____S, self, external_module_name);
                            }
                        }
                        if (NIL != Guids.guid_p(emid)) {
                            emid = Guids.guid_to_string(emid);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!emid.isString()) {
                                Errors.error($str_alt625$_HAS_EXTERNAL_MODULE_NAME__S____S, self, emid);
                            }
                        }
                        if (NIL == external_module_instances) {
                            sublisp_throw($sym623$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                        }
                        {
                            SubLObject external_module_instance = dictionary.dictionary_lookup(external_module_instances, emid, NIL);
                            if (NIL == external_module_instance) {
                                sublisp_throw($sym623$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                            }
                            sublisp_throw($sym623$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, cyblack_external_module_has_name_p_method(external_module_instance, external_module_name));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_external_module_instances(self, external_module_instances);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym623$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_add_external_module_instance_method(SubLObject self, SubLObject external_module_instance) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject external_module_instances = get_cyblack_port_external_module_instances(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_external_module_instance_p(external_module_instance)) {
                                Errors.error($str_alt631$_ADD_EXTERNAL_MODULE_INSTANCE__S_, self, external_module_instance);
                            }
                        }
                        cyblack_external_module_instance_set_external_module_port_method(external_module_instance, self);
                        if (NIL == external_module_instances) {
                            external_module_instance = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                        }
                        dictionary.dictionary_enter(external_module_instances, cyblack_external_module_instance_get_external_module_id_method(external_module_instance), external_module_instance);
                        sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, external_module_instance);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_external_module_instances(self, external_module_instances);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym630$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_create_and_add_external_module_instance_method(SubLObject self, SubLObject external_module_name, SubLObject emid) {
        {
            SubLObject new_em = object.new_class_instance(CYBLACK_EXTERNAL_MODULE_INSTANCE);
            cyblack_external_module_set_external_module_name_method(new_em, external_module_name);
            cyblack_external_module_instance_set_external_module_id_method(new_em, emid);
            cyblack_port_add_external_module_instance_method(self, new_em);
            return new_em;
        }
    }

    public static final SubLObject cyblack_port_retrieve_external_module_instance_method(SubLObject self, SubLObject external_module_name, SubLObject emid) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject external_module_instances = get_cyblack_port_external_module_instances(self);
            try {
                try {
                    if (NIL == external_module_instances) {
                        sublisp_throw($sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    }
                    {
                        SubLObject retrieved_em = dictionary.dictionary_lookup(external_module_instances, emid, NIL);
                        if (NIL == retrieved_em) {
                            sublisp_throw($sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                        }
                        if (NIL != cyblack_external_module_has_name_p_method(retrieved_em, external_module_name)) {
                            sublisp_throw($sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, retrieved_em);
                        }
                        Errors.warn($str_alt639$_RETRIEVE_EXTERNAL_MODULE_INSTANC, self, retrieved_em, emid);
                        sublisp_throw($sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_external_module_instances(self, external_module_instances);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_retrieve_external_module_instance_by_emid_method(SubLObject self, SubLObject emid) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject external_module_instances = get_cyblack_port_external_module_instances(self);
            try {
                try {
                    if (NIL == external_module_instances) {
                        sublisp_throw($sym644$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    }
                    {
                        SubLObject retrieved_em = dictionary.dictionary_lookup(external_module_instances, emid, NIL);
                        sublisp_throw($sym644$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, retrieved_em);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_external_module_instances(self, external_module_instances);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym644$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_probe_port_for_external_module_instance_method(SubLObject self, SubLObject external_module_name, SubLObject emid) {
        return NIL;
    }

    public static final SubLObject cyblack_close_port_stream(SubLObject stream) {
        close(stream, UNPROVIDED);
        return T;
    }

    public static final SubLObject cyblack_port_close_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject input_stream = get_cyblack_port_input_stream(self);
                SubLObject port_id = get_cyblack_port_port_id(self);
                try {
                    try {
                        if (NIL != input_stream) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt652$____Closing_Port__S_, self, port_id);
                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                            cyblack_close_port_stream(input_stream);
                        }
                        cyblack_server_unregister_port(port_id);
                        sublisp_throw($sym651$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_input_stream(self, input_stream);
                                set_cyblack_port_port_id(self, port_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym651$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_send_outgoing_message_method(SubLObject self, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject output_stream = get_cyblack_port_output_stream(self);
                SubLObject connected = get_cyblack_port_connected(self);
                try {
                    try {
                        format(T, $str_alt657$___SEND_OUTGOING_MESSAGE__S___Sen, self, message);
                        {
                            SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                            try {
                                $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                                if ((NIL != connected) && (NIL != output_stream)) {
                                    if (message.isCons()) {
                                        print(message, output_stream);
                                    } else {
                                        prin1(message, output_stream);
                                    }
                                    string_utilities.network_terpri(output_stream);
                                    force_output(output_stream);
                                }
                            } finally {
                                $package$.rebind(_prev_bind_0, thread);
                            }
                        }
                        sublisp_throw($sym656$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_output_stream(self, output_stream);
                                set_cyblack_port_connected(self, connected);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym656$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_is_running_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject running = get_cyblack_port_running(self);
            try {
                try {
                    sublisp_throw($sym661$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, running);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_running(self, running);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym661$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_set_running_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject running = get_cyblack_port_running(self);
            try {
                try {
                    running = (NIL != new_state) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym666$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, running);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_running(self, running);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym666$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_is_connected_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject connected = get_cyblack_port_connected(self);
            try {
                try {
                    sublisp_throw($sym670$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, connected);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_connected(self, connected);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym670$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_set_connected_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_port_method = NIL;
            SubLObject connected = get_cyblack_port_connected(self);
            try {
                try {
                    connected = (NIL != new_state) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym674$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, connected);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_connected(self, connected);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym674$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
            }
            return catch_var_for_cyblack_port_method;
        }
    }

    public static final SubLObject cyblack_port_harvest_input_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject incoming_message_queue = get_cyblack_port_incoming_message_queue(self);
                SubLObject input_stream = get_cyblack_port_input_stream(self);
                SubLObject connected = get_cyblack_port_connected(self);
                try {
                    try {
                        if ((NIL != connected) && (NIL != incoming_message_queue)) {
                            {
                                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                                try {
                                    $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject input = read(input_stream, NIL, $EOF, UNPROVIDED);
                                        if (!((input == $EOF) || (input.isString() && (NIL != Strings.string_equal(input, $str_alt679$_EOF, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                                            {
                                                SubLObject input_as_string = format(NIL, $str_alt680$_S, input);
                                                subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(incoming_message_queue, input_as_string);
                                                sublisp_throw($sym678$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, input_as_string);
                                            }
                                        }
                                    }
                                } finally {
                                    $package$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        sublisp_throw($sym678$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_incoming_message_queue(self, incoming_message_queue);
                                set_cyblack_port_input_stream(self, input_stream);
                                set_cyblack_port_connected(self, connected);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym678$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_get_incoming_message_queue_method(SubLObject self) {
        {
            SubLObject incoming_message_queue = get_cyblack_port_incoming_message_queue(self);
            return incoming_message_queue;
        }
    }

    public static final SubLObject cyblack_port_set_incoming_message_queue_method(SubLObject self, SubLObject new_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject incoming_message_queue = get_cyblack_port_incoming_message_queue(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_queue) || (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(new_queue)))) {
                                Errors.error($str_alt688$_SET_INCOMING_MESSAGE_QUEUE__S___, self, new_queue);
                            }
                        }
                        incoming_message_queue = new_queue;
                        sublisp_throw($sym687$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, new_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_incoming_message_queue(self, incoming_message_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym687$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject cyblack_port_get_outgoing_message_queue_method(SubLObject self) {
        {
            SubLObject outgoing_message_queue = get_cyblack_port_outgoing_message_queue(self);
            return outgoing_message_queue;
        }
    }

    public static final SubLObject cyblack_port_set_outgoing_message_queue_method(SubLObject self, SubLObject new_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject outgoing_message_queue = get_cyblack_port_outgoing_message_queue(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_queue) || (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(new_queue)))) {
                                Errors.error($str_alt696$_SET_OUTGOING_MESSAGE_QUEUE__S___, self, new_queue);
                            }
                        }
                        outgoing_message_queue = new_queue;
                        sublisp_throw($sym695$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, new_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_outgoing_message_queue(self, outgoing_message_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym695$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-CURRENT-PORT-STATE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_current_port_states$ = makeSymbol("*VALID-CYBLACK-CURRENT-PORT-STATES*");

    /**
     * Returns a list of all valid members of the CYBLACK-CURRENT-PORT-STATE enumeration.
     */
    public static final SubLObject valid_cyblack_current_port_states() {
        return $valid_cyblack_current_port_states$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CURRENT-PORT-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_state_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_current_port_states$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CURRENT-PORT-STATE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_current_port_state(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_current_port_states$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt10$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CURRENT_PORT_STATE, value, CYBLACK_CURRENT_PORT_STATE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CURRENT-PORT-STATE enumeration.
     */
    public static final SubLObject decode_cyblack_current_port_state(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_current_port_states$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt12$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CURRENT_PORT_STATE, value, CYBLACK_CURRENT_PORT_STATE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CURRENT-PORT-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_state_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_state_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_STATE_P, value1, CYBLACK_CURRENT_PORT_STATE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_state_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_STATE_P, value2, CYBLACK_CURRENT_PORT_STATE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_current_port_states$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CURRENT-PORT-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_state_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_state_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_STATE_P, value1, CYBLACK_CURRENT_PORT_STATE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_state_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_STATE_P, value2, CYBLACK_CURRENT_PORT_STATE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_current_port_states$.getGlobalValue();
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

    // defparameter
    private static final SubLSymbol $cyblack_input_harvester_current_port$ = makeSymbol("*CYBLACK-INPUT-HARVESTER-CURRENT-PORT*");

    public static final SubLObject cyblack_port_input_harvester_function() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cyblack_input_harvester_current_port$.getDynamicValue(thread)) {
                {
                    SubLObject current_port = $cyblack_input_harvester_current_port$.getDynamicValue(thread);
                    SubLObject input_stream = cyblack_port_get_input_stream_method(current_port);
                    SubLObject incoming_message_queue = cyblack_port_get_incoming_message_queue_method(current_port);
                    $cyblack_input_harvester_current_port$.setDynamicValue($TRANSFERED, thread);
                    while (NIL == cyblack_globals.$cyblack_server_process_terminate$.getDynamicValue(thread)) {
                        cyblack_execute_server_commands();
                        {
                            SubLObject ignore_errors_tag = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            {
                                                SubLObject _prev_bind_0_7 = $package$.currentBinding(thread);
                                                try {
                                                    $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject request = read(input_stream, NIL, $EOF, UNPROVIDED);
                                                        SubLObject input_as_string = format(NIL, $str_alt680$_S, request);
                                                        if (NIL != Strings.string_equal(input_as_string, $str_alt707$_CONNECTED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                            format(T, $str_alt708$__Port__S_received_a_connect_mess, current_port);
                                                            force_output(T);
                                                            cyblack_port_set_connected_method(current_port, T);
                                                        } else {
                                                            if (NIL == cyblack_port_is_connected_p_method(current_port)) {
                                                                Errors.warn($str_alt709$CYBLACK_PORT_INPUT_HARVESTER_FUNC, input_as_string, current_port);
                                                                cyblack_port_set_connected_method(current_port, T);
                                                            }
                                                            subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(incoming_message_queue, input_as_string);
                                                        }
                                                    }
                                                } finally {
                                                    $package$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                            }
                        }
                        sleep(ONE_INTEGER);
                    } 
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_port_spawn_input_harvester_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        {
                            SubLObject application_id = cyblack_application.cyblack_application_get_application_id(application);
                            $cyblack_input_harvester_current_port$.setDynamicValue(self, thread);
                            cyblack_processes.cyblack_make_process(application_id, $str_alt713$CYBLACK_PORT_INPUT_HARVESTER, CYBLACK_PORT_INPUT_HARVESTER_FUNCTION);
                            while ($cyblack_input_harvester_current_port$.getDynamicValue(thread) != $TRANSFERED) {
                                sleep($float$0_5);
                            } 
                            sublisp_throw($sym712$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD, NIL);
                        }
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
                    catch_var_for_cyblack_port_method = Errors.handleThrowable(ccatch_env_var, $sym712$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD);
                }
                return catch_var_for_cyblack_port_method;
            }
        }
    }

    public static final SubLObject get_cyblack_port_manager_cached_knowledge_source_battery(SubLObject cyblack_port_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager, SEVEN_INTEGER, CACHED_KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject set_cyblack_port_manager_cached_knowledge_source_battery(SubLObject cyblack_port_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager, value, SEVEN_INTEGER, CACHED_KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject get_cyblack_port_manager_outgoing_queue_reference(SubLObject cyblack_port_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager, SIX_INTEGER, OUTGOING_QUEUE_REFERENCE);
    }

    public static final SubLObject set_cyblack_port_manager_outgoing_queue_reference(SubLObject cyblack_port_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager, value, SIX_INTEGER, OUTGOING_QUEUE_REFERENCE);
    }

    public static final SubLObject get_cyblack_port_manager_incoming_queue_reference(SubLObject cyblack_port_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager, FIVE_INTEGER, INCOMING_QUEUE_REFERENCE);
    }

    public static final SubLObject set_cyblack_port_manager_incoming_queue_reference(SubLObject cyblack_port_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager, value, FIVE_INTEGER, INCOMING_QUEUE_REFERENCE);
    }

    public static final SubLObject get_cyblack_port_manager_ports(SubLObject cyblack_port_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager, FOUR_INTEGER, PORTS);
    }

    public static final SubLObject set_cyblack_port_manager_ports(SubLObject cyblack_port_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager, value, FOUR_INTEGER, PORTS);
    }

    public static final SubLObject get_cyblack_port_manager_message_broker(SubLObject cyblack_port_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager, THREE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_port_manager_message_broker(SubLObject cyblack_port_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager, value, THREE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_manager_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_manager_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER, PORTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER, INCOMING_QUEUE_REFERENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER, OUTGOING_QUEUE_REFERENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER, CACHED_KNOWLEDGE_SOURCE_BATTERY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_port_manager_p(SubLObject cyblack_port_manager) {
        return classes.subloop_instanceof_class(cyblack_port_manager, CYBLACK_PORT_MANAGER);
    }

    public static final SubLObject cyblack_port_manager_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject cached_knowledge_source_battery = get_cyblack_port_manager_cached_knowledge_source_battery(self);
            SubLObject outgoing_queue_reference = get_cyblack_port_manager_outgoing_queue_reference(self);
            SubLObject incoming_queue_reference = get_cyblack_port_manager_incoming_queue_reference(self);
            SubLObject ports = get_cyblack_port_manager_ports(self);
            SubLObject message_broker = get_cyblack_port_manager_message_broker(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    $cyblack_port_manager$.setDynamicValue(self);
                    message_broker = NIL;
                    ports = object.new_class_instance(BASIC_DOUBLY_LINKED_LIST);
                    incoming_queue_reference = NIL;
                    outgoing_queue_reference = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                    cached_knowledge_source_battery = NIL;
                    sublisp_throw($sym727$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_cached_knowledge_source_battery(self, cached_knowledge_source_battery);
                            set_cyblack_port_manager_outgoing_queue_reference(self, outgoing_queue_reference);
                            set_cyblack_port_manager_incoming_queue_reference(self, incoming_queue_reference);
                            set_cyblack_port_manager_ports(self, ports);
                            set_cyblack_port_manager_message_broker(self, message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym727$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        return object.object_print_method(self, stream, depth);
    }

    public static final SubLObject cyblack_port_manager_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject incoming_queue_reference = get_cyblack_port_manager_incoming_queue_reference(self);
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    cyblack_object.cyblack_object_set_application_method(self, new_application);
                    if (NIL != new_application) {
                        incoming_queue_reference = methods.funcall_instance_method_with_0_args(new_application, GET_INCOMING_MESSAGE_QUEUE);
                    }
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                cyblack_port_set_application_method(port, new_application);
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    cyblack_port_set_application_method(port, new_application);
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                            }
                        }
                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                    }
                    sublisp_throw($sym733$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_application);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_incoming_queue_reference(self, incoming_queue_reference);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym733$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_get_knowledge_source_battery_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject cached_knowledge_source_battery = get_cyblack_port_manager_cached_knowledge_source_battery(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != cached_knowledge_source_battery) {
                        sublisp_throw($sym742$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, cached_knowledge_source_battery);
                    }
                    if (NIL == application) {
                        Errors.warn($str_alt743$_GET_KNOWLEDGE_SOURCE_BATTERY__S_, self);
                        sublisp_throw($sym742$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    }
                    {
                        SubLObject ksb = methods.funcall_instance_method_with_0_args(application, GET_KNOWLEDGE_SOURCE_BATTERY);
                        if (NIL == ksb) {
                            Errors.warn($str_alt744$_GET_KNOWLEDGE_SOURCE_BATTERY__S_, self, application);
                        }
                        cached_knowledge_source_battery = ksb;
                        sublisp_throw($sym742$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, ksb);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_cached_knowledge_source_battery(self, cached_knowledge_source_battery);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym742$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_get_message_broker_method(SubLObject self) {
        {
            SubLObject message_broker = get_cyblack_port_manager_message_broker(self);
            return message_broker;
        }
    }

    public static final SubLObject cyblack_port_manager_set_message_broker_method(SubLObject self, SubLObject new_message_broker) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject message_broker = get_cyblack_port_manager_message_broker(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_message_broker) || (NIL != cyblack_message_broker_p(new_message_broker)))) {
                                Errors.error($str_alt753$_SET_MESSAGE_BROKER__S____S_is_no, self, new_message_broker);
                            }
                        }
                        message_broker = new_message_broker;
                        if (NIL != message_broker) {
                            {
                                SubLObject external_connection = cyblack_message_broker_get_external_connection_method(message_broker);
                                if (NIL != instances.instance_of_p(external_connection, CYBLACK_STANDARD_EXTERNAL_CONNECTION)) {
                                    {
                                        SubLObject session_connection = cyblack_standard_external_connection_get_session_connection_method(external_connection);
                                        if (NIL != session_connection) {
                                            {
                                                SubLObject incoming_queue = cyblack_queue_based_session_connection_get_incoming_message_queue_method(session_connection);
                                                SubLObject outgoing_queue = cyblack_queue_based_session_connection_get_outgoing_message_queue_method(session_connection);
                                                if (NIL == incoming_queue) {
                                                    Errors.warn($str_alt755$_SET_MESSAGE_BROKER__S___Could_no, self, session_connection, external_connection);
                                                }
                                                if (NIL == outgoing_queue) {
                                                    Errors.warn($str_alt756$_SET_MESSAGE_BROKER__S___Could_no, self, session_connection, external_connection);
                                                }
                                                cyblack_port_manager_set_queues_method(self, incoming_queue, outgoing_queue);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym752$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_message_broker);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_message_broker(self, message_broker);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym752$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_set_queues_method(SubLObject self, SubLObject incoming, SubLObject outgoing) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject outgoing_queue_reference = get_cyblack_port_manager_outgoing_queue_reference(self);
                SubLObject incoming_queue_reference = get_cyblack_port_manager_incoming_queue_reference(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == incoming) || (NIL != subloop_queues.queue_interface_p(incoming)))) {
                                Errors.error($str_alt762$_SET_QUEUES__S____S_is_not_an_ins, self, incoming);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == outgoing) || (NIL != subloop_queues.queue_interface_p(outgoing)))) {
                                Errors.error($str_alt762$_SET_QUEUES__S____S_is_not_an_ins, self, outgoing);
                            }
                        }
                        incoming_queue_reference = incoming;
                        outgoing_queue_reference = outgoing;
                        sublisp_throw($sym761$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_outgoing_queue_reference(self, outgoing_queue_reference);
                                set_cyblack_port_manager_incoming_queue_reference(self, incoming_queue_reference);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym761$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_retrieve_port_method(SubLObject self, SubLObject port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject ports = get_cyblack_port_manager_ports(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_port_id_p(port_id)) {
                                Errors.error($str_alt768$_RETRIEVE_PORT__S____S_is_not_a_v, self, port_id);
                            }
                        }
                        {
                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                            if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                {
                                    SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                    if (NIL != cyblack_port_has_port_id_p_method(port, port_id)) {
                                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                        sublisp_throw($sym767$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                    }
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    while (NIL != port) {
                                        if (NIL != cyblack_port_has_port_id_p_method(port, port_id)) {
                                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                            sublisp_throw($sym767$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                        }
                                        port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    } 
                                }
                            }
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                        }
                        sublisp_throw($sym767$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_ports(self, ports);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym767$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_port_given_input_stream_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                if (NIL != cyblack_port_has_input_stream_p_method(port, stream)) {
                                    methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                    sublisp_throw($sym772$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    if (NIL != cyblack_port_has_input_stream_p_method(port, stream)) {
                                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                        sublisp_throw($sym772$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                    }
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                            }
                        }
                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                        sublisp_throw($sym772$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym772$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_port_given_output_stream_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                if (NIL != cyblack_port_has_output_stream_p_method(port, stream)) {
                                    methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                    sublisp_throw($sym776$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    if (NIL != cyblack_port_has_output_stream_p_method(port, stream)) {
                                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                        sublisp_throw($sym776$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                    }
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                            }
                        }
                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                        sublisp_throw($sym776$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym776$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_close_all_ports_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject ports = get_cyblack_port_manager_ports(self);
                try {
                    try {
                        {
                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt781$__Closing_all_CyBlack_ports_);
                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                            if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                {
                                    SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                    cyblack_port_close_method(port);
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    while (NIL != port) {
                                        cyblack_port_close_method(port);
                                        port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    } 
                                }
                            }
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt782$__All_CyBlack_ports_are_closed_);
                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym780$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_ports(self, ports);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym780$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_add_port_method(SubLObject self, SubLObject port_id, SubLObject input_stream, SubLObject output_stream) {
        if (input_stream == UNPROVIDED) {
            input_stream = NIL;
        }
        if (output_stream == UNPROVIDED) {
            output_stream = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject existing_port = cyblack_port_manager_retrieve_port_method(self, port_id);
                        if (NIL != existing_port) {
                            Errors.warn($str_alt788$_ADD_PORT__S___Redundant_attempt_, self, port_id);
                            sublisp_throw($sym787$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                        {
                            SubLObject new_port = object.new_class_instance(CYBLACK_PORT);
                            cyblack_port_set_application_method(new_port, application);
                            cyblack_port_set_port_id_method(new_port, port_id);
                            cyblack_port_set_connected_method(new_port, T);
                            if (NIL != input_stream) {
                                cyblack_port_set_input_stream_method(new_port, input_stream);
                            }
                            if (NIL != output_stream) {
                                cyblack_port_set_output_stream_method(new_port, output_stream);
                            }
                            subloop_collections.basic_doubly_linked_list_add_method(ports, new_port);
                            sublisp_throw($sym787$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_port);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym787$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_remove_port_method(SubLObject self, SubLObject port_id) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject existing_port = cyblack_port_manager_retrieve_port_method(self, port_id);
                        if (NIL == existing_port) {
                            Errors.warn($str_alt793$_REMOVE_PORT__S____S_is_not_a_kno, self, port_id);
                            sublisp_throw($sym792$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                        cyblack_port_close_method(existing_port);
                        methods.funcall_instance_method_with_1_args(existing_port, DELETE_SELF_FROM_COLLECTION, ports);
                        sublisp_throw($sym792$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, existing_port);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym792$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_invite_knowledge_source_method(SubLObject self, SubLObject knowledge_source_name, SubLObject sid, SubLObject emid) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                if (NIL != cyblack_port_probe_port_for_external_module_instance_method(port, knowledge_source_name, emid)) {
                                    methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                    sublisp_throw($sym798$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    if (NIL != cyblack_port_probe_port_for_external_module_instance_method(port, knowledge_source_name, emid)) {
                                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                        sublisp_throw($sym798$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, port);
                                    }
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                            }
                        }
                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                        sublisp_throw($sym798$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym798$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_route_outgoing_message_method(SubLObject self, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject ports = get_cyblack_port_manager_ports(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(message.isCons() && (NIL != cyblack_messages.cyblack_message_key_type_p(message.first())))) {
                                Errors.error($str_alt803$_ROUTE_OUTGOING_MESSAGE__S____S_i, self, message);
                            }
                        }
                        {
                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                            if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                {
                                    SubLObject emid = getf(message.rest(), $EMID, UNPROVIDED);
                                    if (NIL == emid) {
                                        methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                        sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                                    }
                                    {
                                        SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                        SubLObject external_module_instance = cyblack_port_retrieve_external_module_instance_by_emid_method(port, emid);
                                        if (NIL != external_module_instance) {
                                            if (NIL == cyblack_port_is_connected_p_method(port)) {
                                                sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                                            }
                                            cyblack_port_send_outgoing_message_method(port, message);
                                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                            sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                                        }
                                        port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                        while (NIL != port) {
                                            external_module_instance = cyblack_port_retrieve_external_module_instance_by_emid_method(port, emid);
                                            if (NIL != external_module_instance) {
                                                if (NIL == cyblack_port_is_connected_p_method(port)) {
                                                    sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                                                }
                                                cyblack_port_send_outgoing_message_method(port, message);
                                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                                sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                                            }
                                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                        } 
                                    }
                                }
                            }
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_ports(self, ports);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_all_ports_are_connected_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                        {
                            SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                            if (NIL == cyblack_port_is_connected_p_method(port)) {
                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                sublisp_throw($sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                            }
                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            while (NIL != port) {
                                if (NIL == cyblack_port_is_connected_p_method(port)) {
                                    methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                    sublisp_throw($sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            } 
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_all_ports_which_are_not_connected_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        SubLObject unconnected_ports = NIL;
                        if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym812$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                        {
                            SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                            if (NIL == cyblack_port_is_connected_p_method(port)) {
                                unconnected_ports = cons(port, unconnected_ports);
                            }
                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            while (NIL != port) {
                                if (NIL == cyblack_port_is_connected_p_method(port)) {
                                    unconnected_ports = cons(port, unconnected_ports);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            } 
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym812$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, nreverse(unconnected_ports));
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym812$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_get_incoming_queue_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject incoming_queue_reference = get_cyblack_port_manager_incoming_queue_reference(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != incoming_queue_reference) {
                            sublisp_throw($sym816$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, incoming_queue_reference);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt817$_GET_INCOMING_QUEUE__S___No_appli, self);
                            }
                        }
                        incoming_queue_reference = methods.funcall_instance_method_with_0_args(application, GET_INCOMING_MESSAGE_QUEUE);
                        sublisp_throw($sym816$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, incoming_queue_reference);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_incoming_queue_reference(self, incoming_queue_reference);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym816$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_set_incoming_queue_method(SubLObject self, SubLObject new_incoming_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject incoming_queue_reference = get_cyblack_port_manager_incoming_queue_reference(self);
                SubLObject ports = get_cyblack_port_manager_ports(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_incoming_queue) || (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(new_incoming_queue)))) {
                                Errors.error($str_alt823$_SET_INCOMING_QUEUE__S____S_is_no, self, new_incoming_queue);
                            }
                        }
                        incoming_queue_reference = new_incoming_queue;
                        {
                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                            if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                sublisp_throw($sym822$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_incoming_queue);
                            }
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                cyblack_port_set_incoming_message_queue_method(port, new_incoming_queue);
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    cyblack_port_set_incoming_message_queue_method(port, new_incoming_queue);
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            }
                        }
                        sublisp_throw($sym822$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_incoming_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_incoming_queue_reference(self, incoming_queue_reference);
                                set_cyblack_port_manager_ports(self, ports);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym822$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_get_outgoing_queue_method(SubLObject self) {
        {
            SubLObject outgoing_queue_reference = get_cyblack_port_manager_outgoing_queue_reference(self);
            return outgoing_queue_reference;
        }
    }

    public static final SubLObject cyblack_port_manager_set_outgoing_queue_method(SubLObject self, SubLObject new_outgoing_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_method = NIL;
                SubLObject outgoing_queue_reference = get_cyblack_port_manager_outgoing_queue_reference(self);
                SubLObject ports = get_cyblack_port_manager_ports(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_outgoing_queue) || (NIL != subloop_queues.asynch_basic_doubly_linked_queue_p(new_outgoing_queue)))) {
                                Errors.error($str_alt832$_SET_OUTGOING_QUEUE__S____S_is_no, self, new_outgoing_queue);
                            }
                        }
                        outgoing_queue_reference = new_outgoing_queue;
                        {
                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                            if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                                sublisp_throw($sym831$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_outgoing_queue);
                            }
                            {
                                SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                cyblack_port_set_outgoing_message_queue_method(port, new_outgoing_queue);
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                while (NIL != port) {
                                    cyblack_port_set_outgoing_message_queue_method(port, new_outgoing_queue);
                                    port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                } 
                                methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            }
                        }
                        sublisp_throw($sym831$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, new_outgoing_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_outgoing_queue_reference(self, outgoing_queue_reference);
                                set_cyblack_port_manager_ports(self, ports);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym831$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
                }
                return catch_var_for_cyblack_port_manager_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_harvest_input_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym835$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                        {
                            SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                            cyblack_port_harvest_input_method(port);
                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            while (NIL != port) {
                                cyblack_port_harvest_input_method(port);
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            } 
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym835$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                        sublisp_throw($sym835$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym835$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_spawn_input_harvesters_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    cyblack_globals.$cyblack_server_process_terminate$.setDynamicValue(NIL);
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym839$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                        }
                        {
                            SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                            cyblack_port_spawn_input_harvester_method(port);
                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            while (NIL != port) {
                                cyblack_port_spawn_input_harvester_method(port);
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            } 
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym839$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym839$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_all_ports_connected_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_method = NIL;
            SubLObject ports = get_cyblack_port_manager_ports(self);
            try {
                try {
                    {
                        SubLObject enumerator = methods.funcall_instance_method_with_0_args(ports, ALLOCATE_ENUMERATOR);
                        if (NIL != methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                        {
                            SubLObject port = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                            if (NIL == cyblack_port_is_connected_p_method(port)) {
                                sublisp_throw($sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                            }
                            port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            while (NIL != port) {
                                if (NIL == cyblack_port_is_connected_p_method(port)) {
                                    sublisp_throw($sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, NIL);
                                }
                                port = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            } 
                            methods.funcall_instance_method_with_1_args(ports, DEALLOCATE_ENUMERATOR, enumerator);
                            sublisp_throw($sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD, T);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_ports(self, ports);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_method = Errors.handleThrowable(ccatch_env_var, $sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_port_manager_method;
        }
    }

    public static final SubLObject cyblack_port_manager_wait_until_all_ports_connected_p_method(SubLObject self, SubLObject timeout_delta) {
        {
            SubLObject start_time = get_universal_time();
            SubLObject current_time = start_time;
            while (NIL == cyblack_port_manager_all_ports_connected_p_method(self)) {
                sleep(ONE_INTEGER);
                current_time = get_universal_time();
                if (subtract(current_time, start_time).numG(timeout_delta)) {
                    format(T, $str_alt848$Timed_out_after__S_seconds___, timeout_delta);
                    force_output(T);
                    return NIL;
                }
            } 
            format(T, $str_alt849$__All_ports_connected___);
            force_output(T);
            cyblack_spawn_server_output_loop(self);
            return T;
        }
    }

    /**
     * Enumerated values of type CYBLACK-CURRENT-PORT-MANAGER-STATE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_current_port_manager_states$ = makeSymbol("*VALID-CYBLACK-CURRENT-PORT-MANAGER-STATES*");

    /**
     * Returns a list of all valid members of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration.
     */
    public static final SubLObject valid_cyblack_current_port_manager_states() {
        return $valid_cyblack_current_port_manager_states$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_manager_state_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_current_port_manager_states$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_current_port_manager_state(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_current_port_manager_states$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt10$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CURRENT_PORT_MANAGER_STATE, value, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration.
     */
    public static final SubLObject decode_cyblack_current_port_manager_state(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_current_port_manager_states$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt12$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CURRENT_PORT_MANAGER_STATE, value, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_manager_state_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_manager_state_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_MANAGER_STATE_P, value1, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_manager_state_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_MANAGER_STATE_P, value2, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_current_port_manager_states$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CURRENT-PORT-MANAGER-STATE enumeration.
     */
    public static final SubLObject cyblack_current_port_manager_state_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_manager_state_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_MANAGER_STATE_P, value1, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_current_port_manager_state_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_CURRENT_PORT_MANAGER_STATE_P, value2, CYBLACK_CURRENT_PORT_MANAGER_STATE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_current_port_manager_states$.getGlobalValue();
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

    // defparameter
    public static final SubLSymbol $cyblack_output_loop_current_port_manager$ = makeSymbol("*CYBLACK-OUTPUT-LOOP-CURRENT-PORT-MANAGER*");

    public static final SubLObject cyblack_spawn_server_output_loop(SubLObject port_manager) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_p(port_manager)) {
                    Errors.error($str_alt855$CYBLACK_SPAWN_SERVER_OUTPUT_LOOP_, port_manager);
                }
            }
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(port_manager);
                SubLObject application_id = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_application_id(application))) : NIL;
                $cyblack_output_loop_current_port_manager$.setDynamicValue(port_manager, thread);
                if (NIL != instances.instance_of_p(application, CYBLACK_UNIPROCESS_DEFAPP_BASE)) {
                    {
                        SubLObject process = object.new_class_instance(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS);
                        methods.funcall_instance_method_with_1_args(application, ADD_PROCESS, process);
                    }
                } else {
                    cyblack_processes.cyblack_make_process(application_id, $str_alt859$CYBLACK_SERVER_OUTPUT_LOOP, CYBLACK_SERVER_OUTPUT_LOOP);
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_server_process_terminate_p() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cyblack_globals.$cyblack_server_process_terminate$.getDynamicValue(thread);
        }
    }

    /**
     * This function dequeues an item from the output queue and returns.  It is
     * intended for use in the UNIPROCESS application mode.
     */
    public static final SubLObject cyblack_server_output_increment() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject port_manager = $cyblack_output_loop_current_port_manager$.getDynamicValue(thread);
                SubLObject outgoing_message_queue = cyblack_port_manager_get_outgoing_queue_method(port_manager);
                $cyblack_output_loop_current_port_manager$.setDynamicValue($TRANSFERED, thread);
                if (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_message_queue)) {
                    {
                        SubLObject message = subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(outgoing_message_queue);
                        SubLObject message_as_sexpr = (message.isCons()) ? ((SubLObject) (message)) : message.isString() ? ((SubLObject) (read_from_string(message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : message;
                        cyblack_port_manager_route_outgoing_message_method(port_manager, message_as_sexpr);
                    }
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_server_output_loop() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject port_manager = $cyblack_output_loop_current_port_manager$.getDynamicValue(thread);
                SubLObject outgoing_message_queue = cyblack_port_manager_get_outgoing_queue_method(port_manager);
                $cyblack_output_loop_current_port_manager$.setDynamicValue($TRANSFERED, thread);
                while (NIL == cyblack_globals.$cyblack_server_process_terminate$.getDynamicValue(thread)) {
                    cyblack_execute_server_commands();
                    if (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_message_queue)) {
                        {
                            SubLObject message = subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(outgoing_message_queue);
                            SubLObject message_as_sexpr = (message.isCons()) ? ((SubLObject) (message)) : message.isString() ? ((SubLObject) (read_from_string(message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : message;
                            cyblack_port_manager_route_outgoing_message_method(port_manager, message_as_sexpr);
                        }
                    }
                    sleep(ONE_INTEGER);
                } 
            }
            return T;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_queue_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_queue_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, LIST, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, LOCK_HISTORY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_session_queue_p(SubLObject cyblack_session_queue) {
        return classes.subloop_instanceof_class(cyblack_session_queue, CYBLACK_SESSION_QUEUE);
    }

    public static final SubLObject cyblack_session_queue_on_enqueue_method(SubLObject self, SubLObject new_element) {
        force_output(T);
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $cyblack_port_manager$ = makeSymbol("*CYBLACK-PORT-MANAGER*");

    // defparameter
    private static final SubLSymbol $cyblack_incoming_queue$ = makeSymbol("*CYBLACK-INCOMING-QUEUE*");

    // defparameter
    private static final SubLSymbol $cyblack_outgoing_queue$ = makeSymbol("*CYBLACK-OUTGOING-QUEUE*");

    // defparameter
    private static final SubLSymbol $cyblack_command_queue$ = makeSymbol("*CYBLACK-COMMAND-QUEUE*");

    // defparameter
    private static final SubLSymbol $cyblack_command_wait_interval$ = makeSymbol("*CYBLACK-COMMAND-WAIT-INTERVAL*");

    // defparameter
    private static final SubLSymbol $cyblack_port_manager_continue$ = makeSymbol("*CYBLACK-PORT-MANAGER-CONTINUE*");

    public static final SubLObject cyblack_port_manager_continue_p() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cyblack_port_manager_continue$.getDynamicValue(thread);
        }
    }

    /**
     * Enumerated values of type CYBLACK-PORT-MANAGER-COMMAND-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_port_manager_command_types$ = makeSymbol("*VALID-CYBLACK-PORT-MANAGER-COMMAND-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_port_manager_command_types() {
        return $valid_cyblack_port_manager_command_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_command_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_port_manager_command_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_port_manager_command_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_port_manager_command_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt10$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_PORT_MANAGER_COMMAND_TYPE, value, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_port_manager_command_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_port_manager_command_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt12$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_PORT_MANAGER_COMMAND_TYPE, value, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_command_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_command_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_COMMAND_TYPE_P, value1, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_command_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_COMMAND_TYPE_P, value2, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_port_manager_command_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-PORT-MANAGER-COMMAND-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_command_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_command_type_p(value1)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_COMMAND_TYPE_P, value1, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_command_type_p(value2)) {
                    Errors.error($str_alt14$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_COMMAND_TYPE_P, value2, CYBLACK_PORT_MANAGER_COMMAND_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_port_manager_command_types$.getGlobalValue();
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

    public static final SubLObject cyblack_start_port_manager(SubLObject port_manager) {
        if (port_manager == UNPROVIDED) {
            port_manager = NIL;
        }
        $cyblack_command_queue$.setDynamicValue(object.new_class_instance(CYBLACK_SESSION_QUEUE));
        $cyblack_port_manager_continue$.setDynamicValue(T);
        $cyblack_incoming_queue$.setDynamicValue(object.new_class_instance(CYBLACK_SESSION_QUEUE));
        $cyblack_outgoing_queue$.setDynamicValue(object.new_class_instance(CYBLACK_SESSION_QUEUE));
        {
            SubLObject application = (NIL != port_manager) ? ((SubLObject) (cyblack_object.cyblack_object_get_application_method(port_manager))) : NIL;
            SubLObject application_id = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_application_id(application))) : NIL;
            $cyblack_port_manager$.setDynamicValue(NIL != port_manager ? ((SubLObject) (port_manager)) : object.new_class_instance(CYBLACK_PORT_MANAGER));
            if (NIL != instances.instance_of_p(application, CYBLACK_UNIPROCESS_DEFAPP_BASE)) {
                {
                    SubLObject process = object.new_class_instance(CYBLACK_PORT_MANAGER_PROCESS);
                    methods.funcall_instance_method_with_1_args(application, ADD_PROCESS, process);
                }
            } else {
                if (NIL != application_id) {
                    if (NIL != methods.funcall_instance_method_with_0_args(application, HAS_EXTERNAL_KNOWLEDGE_SOURCES_P)) {
                        cyblack_processes.cyblack_make_process(application_id, $str_alt882$CYBLACK_PORT_MANAGER_TOP_LEVEL, CYBLACK_PORT_MANAGER_TOP_LEVEL);
                    }
                } else {
                    make_process($str_alt882$CYBLACK_PORT_MANAGER_TOP_LEVEL, CYBLACK_PORT_MANAGER_TOP_LEVEL);
                }
            }
        }
        return T;
    }

    public static final SubLObject cyblack_stop_port_manager() {
        $cyblack_port_manager_continue$.setDynamicValue(NIL);
        return T;
    }

    // defvar
    private static final SubLSymbol $cyblack_port_manager_top_level_max_sleep_interval$ = makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MAX-SLEEP-INTERVAL*");

    // defvar
    private static final SubLSymbol $cyblack_port_manager_top_level_min_sleep_interval$ = makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MIN-SLEEP-INTERVAL*");

    // defvar
    private static final SubLSymbol $cyblack_port_manager_top_level_acceleration_rate$ = makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-ACCELERATION-RATE*");

    public static final SubLObject cyblack_port_manager_top_level_normalize_sleep_interval(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sleep_interval = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt887);
            sleep_interval = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(MAX, listS(MIN, sleep_interval, $list_alt890), $list_alt891);
            } else {
                cdestructuring_bind_error(datum, $list_alt887);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_port_manager_accelerate(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sleep_interval_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt892);
            sleep_interval_var = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, sleep_interval_var, list($sym893$_, sleep_interval_var, listS($sym894$_, sleep_interval_var, $list_alt895)));
            } else {
                cdestructuring_bind_error(datum, $list_alt892);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_port_manager_deaccelerate(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sleep_interval_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt892);
            sleep_interval_var = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, sleep_interval_var, list($sym896$_, sleep_interval_var, listS($sym894$_, sleep_interval_var, $list_alt895)));
            } else {
                cdestructuring_bind_error(datum, $list_alt892);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_commands_to_process_p() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $cyblack_command_queue$.getDynamicValue(thread)) && (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method($cyblack_command_queue$.getDynamicValue(thread))));
        }
    }

    public static final SubLObject cyblack_port_manager_increment() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preprocessed_command = NIL;
                SubLObject command = NIL;
                SubLObject command_args = NIL;
                preprocessed_command = subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method($cyblack_command_queue$.getDynamicValue(thread));
                if (preprocessed_command.isCons()) {
                    command = preprocessed_command.first();
                    command_args = preprocessed_command.rest();
                } else {
                    command = preprocessed_command;
                    command_args = NIL;
                }
                if (NIL == command) {
                    return NIL;
                }
                if (NIL != cyblack_port_manager_command_type_p(command)) {
                    {
                        SubLObject pcase_var = command;
                        if (pcase_var.eql($QUIT) || pcase_var.eql($Q)) {
                            $cyblack_port_manager_continue$.setDynamicValue(NIL, thread);
                            return NIL;
                        } else
                            if (pcase_var.eql($START) || pcase_var.eql($S)) {
                                if (NIL != command_args) {
                                    {
                                        SubLObject first_arg = command_args.first();
                                        if (NIL != cyblack_application.cyblack_application_p(first_arg)) {
                                            cyblack_port_manager_connect_application(first_arg);
                                        } else {
                                            Errors.warn($str_alt899$CYBLACK_PORT_MANAGER_TOP_LEVEL__T, first_arg);
                                        }
                                    }
                                }
                            }

                    }
                } else {
                    Errors.warn($str_alt900$CYBLACK_PORT_MANAGER_TOP_LEVEL___, command);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_port_manager_top_level() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sleep_interval = $cyblack_port_manager_top_level_max_sleep_interval$.getDynamicValue(thread);
                while ((NIL != $cyblack_port_manager_continue$.getDynamicValue(thread)) && (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method($cyblack_command_queue$.getDynamicValue(thread)))) {
                    sleep_interval = add(sleep_interval, multiply(sleep_interval, $cyblack_port_manager_top_level_acceleration_rate$.getDynamicValue(thread)));
                    sleep_interval = max(min(sleep_interval, $cyblack_port_manager_top_level_max_sleep_interval$.getDynamicValue(thread)), $cyblack_port_manager_top_level_min_sleep_interval$.getDynamicValue(thread));
                    sleep(sleep_interval);
                } 
                sleep_interval = subtract(sleep_interval, multiply(sleep_interval, $cyblack_port_manager_top_level_acceleration_rate$.getDynamicValue(thread)));
                sleep_interval = max(min(sleep_interval, $cyblack_port_manager_top_level_max_sleep_interval$.getDynamicValue(thread)), $cyblack_port_manager_top_level_min_sleep_interval$.getDynamicValue(thread));
                {
                    SubLObject preprocessed_command = NIL;
                    SubLObject command = NIL;
                    SubLObject command_args = NIL;
                    while (NIL != $cyblack_port_manager_continue$.getDynamicValue(thread)) {
                        preprocessed_command = subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method($cyblack_command_queue$.getDynamicValue(thread));
                        if (preprocessed_command.isCons()) {
                            command = preprocessed_command.first();
                            command_args = preprocessed_command.rest();
                        } else {
                            command = preprocessed_command;
                            command_args = NIL;
                        }
                        if (NIL != cyblack_port_manager_command_type_p(command)) {
                            {
                                SubLObject pcase_var = command;
                                if (pcase_var.eql($QUIT) || pcase_var.eql($Q)) {
                                    $cyblack_port_manager_continue$.setDynamicValue(NIL, thread);
                                } else
                                    if (pcase_var.eql($START) || pcase_var.eql($S)) {
                                        if (NIL != command_args) {
                                            {
                                                SubLObject first_arg = command_args.first();
                                                if (NIL != cyblack_application.cyblack_application_p(first_arg)) {
                                                    cyblack_port_manager_connect_application(first_arg);
                                                } else {
                                                    Errors.warn($str_alt899$CYBLACK_PORT_MANAGER_TOP_LEVEL__T, first_arg);
                                                }
                                            }
                                        }
                                    }

                            }
                        } else {
                            Errors.warn($str_alt900$CYBLACK_PORT_MANAGER_TOP_LEVEL___, command);
                        }
                        while ((NIL != $cyblack_port_manager_continue$.getDynamicValue(thread)) && (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method($cyblack_command_queue$.getDynamicValue(thread)))) {
                            sleep_interval = add(sleep_interval, multiply(sleep_interval, $cyblack_port_manager_top_level_acceleration_rate$.getDynamicValue(thread)));
                            sleep_interval = max(min(sleep_interval, $cyblack_port_manager_top_level_max_sleep_interval$.getDynamicValue(thread)), $cyblack_port_manager_top_level_min_sleep_interval$.getDynamicValue(thread));
                            sleep(sleep_interval);
                        } 
                    } 
                }
            }
            return T;
        }
    }

    // defparameter
    private static final SubLSymbol $cyblack_port_input_stream$ = makeSymbol("*CYBLACK-PORT-INPUT-STREAM*");

    // defparameter
    private static final SubLSymbol $cyblack_port_output_stream$ = makeSymbol("*CYBLACK-PORT-OUTPUT-STREAM*");

    public static final SubLObject cyblack_port_manager_connect_application_using_target() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cyblack_port_manager_connect_target_application$.getDynamicValue(thread)) {
                cyblack_port_manager_connect_application($cyblack_port_manager_connect_target_application$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_port_manager_connect_application(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ksb = methods.funcall_instance_method_with_0_args(application, GET_KNOWLEDGE_SOURCE_BATTERY);
                if (NIL == cyblack_ksb.cyblack_knowledge_source_battery_p(ksb)) {
                    Errors.warn($str_alt901$CYBLACK_PORT_MANAGER_CONNECT_APPL, application);
                    return NIL;
                }
                {
                    SubLObject external_knowledge_sources = methods.funcall_instance_method_with_0_args(ksb, GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES);
                    force_output(T);
                    if (NIL != external_knowledge_sources) {
                        {
                            SubLObject knowledge_source_name = NIL;
                            SubLObject knowledge_source_port = NIL;
                            SubLObject application_id = methods.funcall_instance_method_with_0_args(application, GET_APPLICATION_ID);
                            SubLObject message_broker = cyblack_port_manager_get_message_broker_method($cyblack_port_manager$.getDynamicValue(thread));
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == message_broker) {
                                    Errors.error($str_alt903$CYBLACK_PORT_MANAGER_CONNECT_APPL, $cyblack_port_manager$.getDynamicValue(thread));
                                }
                            }
                            {
                                SubLObject cdolist_list_var = external_knowledge_sources;
                                SubLObject knowledge_source = NIL;
                                for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                                    knowledge_source_name = cyblack_ks.cyblack_external_knowledge_source_get_name_method(knowledge_source);
                                    knowledge_source_port = cyblack_ks.cyblack_external_knowledge_source_get_port_id_method(knowledge_source);
                                    {
                                        SubLObject port_object = cyblack_port_manager_retrieve_port_method($cyblack_port_manager$.getDynamicValue(thread), knowledge_source_port);
                                        if (NIL != port_object) {
                                            methods.funcall_instance_method_with_2_args(port_object, CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE, knowledge_source_name, cyblack_message_broker_get_external_module_id_method(message_broker, knowledge_source_name));
                                        } else {
                                            $cyblack_port_input_stream$.setDynamicValue(NIL, thread);
                                            $cyblack_port_output_stream$.setDynamicValue(NIL, thread);
                                            format(T, $str_alt904$__Starting_server_for_port__S_, knowledge_source_port);
                                            force_output(T);
                                            cyblack_processes.cyblack_register_application_instance_process(application_id, format(NIL, $str_alt905$CYBLACK_PORT_SERVER_server_port__, knowledge_source_port));
                                            cyblack_start_server(knowledge_source_port);
                                            format(T, $str_alt906$__Waiting_on_server_startup_for_p, knowledge_source_port);
                                            force_output(T);
                                            while ((NIL == $cyblack_port_input_stream$.getDynamicValue(thread)) || (NIL == $cyblack_port_output_stream$.getDynamicValue(thread))) {
                                                sleep($float$0_5);
                                            } 
                                            format(T, $str_alt907$__Finished_waiting_);
                                            force_output(T);
                                            port_object = cyblack_port_manager_add_port_method($cyblack_port_manager$.getDynamicValue(thread), knowledge_source_port, $cyblack_port_input_stream$.getDynamicValue(thread), $cyblack_port_output_stream$.getDynamicValue(thread));
                                            cyblack_port_create_and_add_external_module_instance_method(port_object, knowledge_source_name, cyblack_message_broker_get_external_module_id_method(message_broker, knowledge_source_name));
                                            cyblack_port_spawn_input_harvester_method(port_object);
                                        }
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

    // defparameter
    private static final SubLSymbol $cyblack_port_server_port_id$ = makeSymbol("*CYBLACK-PORT-SERVER-PORT-ID*");

    public static final SubLObject cyblack_server_bind_streams(SubLObject input_stream, SubLObject output_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject port_id = $cyblack_port_server_port_id$.getDynamicValue(thread);
                cyblack_server_register_port(port_id);
                $cyblack_port_input_stream$.setDynamicValue(input_stream, thread);
                $cyblack_port_output_stream$.setDynamicValue(output_stream, thread);
                while (NIL != cyblack_server_port_in_use_p(port_id)) {
                    sleep(TEN_INTEGER);
                } 
            }
            return T;
        }
    }

    public static final SubLObject cyblack_server_register_port(SubLObject port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = port_id;
                if (NIL == member(item_var, cyblack_globals.$cyblack_open_ports$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    cyblack_globals.$cyblack_open_ports$.setDynamicValue(cons(item_var, cyblack_globals.$cyblack_open_ports$.getDynamicValue(thread)), thread);
                }
            }
            return port_id;
        }
    }

    public static final SubLObject cyblack_server_unregister_port(SubLObject port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_globals.$cyblack_open_ports$.setDynamicValue(delete(port_id, cyblack_globals.$cyblack_open_ports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return port_id;
        }
    }

    public static final SubLObject cyblack_server_port_in_use_p(SubLObject port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != member(port_id, cyblack_globals.$cyblack_open_ports$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_start_server(SubLObject port_id) {
        $cyblack_port_server_port_id$.setDynamicValue(port_id);
        tcp_server_utilities.enable_tcp_server($CYBLACK_NEW, port_id);
        return $STARTED;
    }

    // defparameter
    private static final SubLSymbol $cyblack_session_connection$ = makeSymbol("*CYBLACK-SESSION-CONNECTION*");

    public static final SubLObject get_cyblack_session_connection_cached_message_broker(SubLObject cyblack_session_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_session_connection, FOUR_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_session_connection_cached_message_broker(SubLObject cyblack_session_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_session_connection, value, FOUR_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject get_cyblack_session_connection_session_id(SubLObject cyblack_session_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_session_connection, THREE_INTEGER, SESSION_ID);
    }

    public static final SubLObject set_cyblack_session_connection_session_id(SubLObject cyblack_session_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_session_connection, value, THREE_INTEGER, SESSION_ID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_connection_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_session_connection_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SESSION_CONNECTION, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SESSION_CONNECTION, CACHED_MESSAGE_BROKER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_session_connection_p(SubLObject cyblack_session_connection) {
        return classes.subloop_instanceof_class(cyblack_session_connection, CYBLACK_SESSION_CONNECTION);
    }

    public static final SubLObject cyblack_session_connection_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_session_connection_method = NIL;
            SubLObject cached_message_broker = get_cyblack_session_connection_cached_message_broker(self);
            SubLObject session_id = get_cyblack_session_connection_session_id(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    $cyblack_session_connection$.setDynamicValue(self);
                    session_id = NIL;
                    cached_message_broker = NIL;
                    sublisp_throw($sym916$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_session_connection_cached_message_broker(self, cached_message_broker);
                            set_cyblack_session_connection_session_id(self, session_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym916$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_session_connection_method;
        }
    }

    public static final SubLObject cyblack_session_connection_get_application_method(SubLObject self) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_session_connection_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_session_connection_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt68$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym919$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD, new_application);
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
                    catch_var_for_cyblack_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym919$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_session_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_session_connection_get_message_broker_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_session_connection_method = NIL;
                SubLObject cached_message_broker = get_cyblack_session_connection_cached_message_broker(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != cached_message_broker) {
                            sublisp_throw($sym922$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD, cached_message_broker);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt923$_GET_MESSAGE_BROKER__S___No_appli, self);
                            }
                        }
                        {
                            SubLObject message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == message_broker) {
                                    Errors.error($str_alt924$_GET_MESSAGE_BROKER__S___No_messa, self, application);
                                }
                            }
                            cached_message_broker = message_broker;
                            sublisp_throw($sym922$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD, cached_message_broker);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_session_connection_cached_message_broker(self, cached_message_broker);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym922$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_session_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_session_connection_get_session_id_method(SubLObject self) {
        {
            SubLObject session_id = get_cyblack_session_connection_session_id(self);
            return session_id;
        }
    }

    public static final SubLObject cyblack_session_connection_set_session_id_method(SubLObject self, SubLObject new_session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_session_connection_method = NIL;
                SubLObject session_id = get_cyblack_session_connection_session_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_session_id) || new_session_id.isString())) {
                                Errors.error($str_alt930$_SET_SESSION_ID__S____S_is_not_a_, self, new_session_id);
                            }
                        }
                        session_id = new_session_id;
                        sublisp_throw($sym929$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD, new_session_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_session_connection_session_id(self, session_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym929$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_session_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_session_connection_externalize_message_method(SubLObject self, SubLObject internal_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_messages.cyblack_message_p(internal_message)) {
                    Errors.error($str_alt935$_EXTERNALIZE_MESSAGE__S____S_is_n, self, internal_message);
                }
            }
            return methods.funcall_instance_method_with_1_args(self, EXTERNALIZE_MESSAGE_INTERNAL, methods.funcall_instance_method_with_0_args(internal_message, TO_LIST));
        }
    }

    public static final SubLObject cyblack_session_connection_externalize_message_internal_method(SubLObject self, SubLObject external_message) {
        return NIL;
    }

    public static final SubLObject cyblack_session_connection_internalize_message_method(SubLObject self, SubLObject external_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message_broker = cyblack_session_connection_get_message_broker_method(self);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    try {
                        $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                        result = methods.funcall_instance_method_with_1_args(message_broker, RECEIVE, external_message);
                    } finally {
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cyblack_session_connection_read_external_message_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    try {
                        $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                        {
                            SubLObject raw_message = methods.funcall_instance_method_with_0_args(self, READ_EXTERNAL_MESSAGE_RAW);
                            if (NIL != raw_message) {
                                result = cyblack_session_connection_internalize_message_method(self, raw_message);
                            }
                        }
                    } finally {
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cyblack_session_connection_read_external_message_raw_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_session_connection_process_incoming_messages_method(SubLObject self, SubLObject invitation_stage) {
        if (invitation_stage == UNPROVIDED) {
            invitation_stage = NIL;
        }
        return NIL;
    }

    public static final SubLObject get_cyblack_queue_based_session_connection_outgoing_message_queue(SubLObject cyblack_queue_based_session_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_queue_based_session_connection, SIX_INTEGER, OUTGOING_MESSAGE_QUEUE);
    }

    public static final SubLObject set_cyblack_queue_based_session_connection_outgoing_message_queue(SubLObject cyblack_queue_based_session_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_queue_based_session_connection, value, SIX_INTEGER, OUTGOING_MESSAGE_QUEUE);
    }

    public static final SubLObject get_cyblack_queue_based_session_connection_incoming_message_queue(SubLObject cyblack_queue_based_session_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_queue_based_session_connection, FIVE_INTEGER, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject set_cyblack_queue_based_session_connection_incoming_message_queue(SubLObject cyblack_queue_based_session_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_queue_based_session_connection, value, FIVE_INTEGER, INCOMING_MESSAGE_QUEUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_queue_based_session_connection_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_queue_based_session_connection_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SESSION_CONNECTION, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SESSION_CONNECTION, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, OUTGOING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_queue_based_session_connection_p(SubLObject cyblack_queue_based_session_connection) {
        return classes.subloop_instanceof_class(cyblack_queue_based_session_connection, CYBLACK_QUEUE_BASED_SESSION_CONNECTION);
    }

    public static final SubLObject cyblack_queue_based_session_connection_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject outgoing_message_queue = get_cyblack_queue_based_session_connection_outgoing_message_queue(self);
            SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
            try {
                try {
                    cyblack_session_connection_initialize_method(self);
                    incoming_message_queue = NIL;
                    outgoing_message_queue = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                    sublisp_throw($sym960$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_outgoing_message_queue(self, outgoing_message_queue);
                            set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym960$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
            try {
                try {
                    cyblack_session_connection_set_application_method(self, new_application);
                    if (NIL != new_application) {
                        incoming_message_queue = methods.funcall_instance_method_with_0_args(new_application, GET_INCOMING_MESSAGE_QUEUE);
                    }
                    sublisp_throw($sym962$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, new_application);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym962$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_get_incoming_message_queue_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
                SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != incoming_message_queue) {
                            sublisp_throw($sym965$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, incoming_message_queue);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt966$_GET_INCOMING_MESSAGE_QUEUE__S___, self);
                            }
                        }
                        incoming_message_queue = methods.funcall_instance_method_with_0_args(application, GET_INCOMING_MESSAGE_QUEUE);
                        sublisp_throw($sym965$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, incoming_message_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym965$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_queue_based_session_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_set_incoming_message_queue_method(SubLObject self, SubLObject new_incoming_message_queue) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
            try {
                try {
                    incoming_message_queue = new_incoming_message_queue;
                    sublisp_throw($sym970$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, new_incoming_message_queue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym970$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_get_outgoing_message_queue_method(SubLObject self) {
        {
            SubLObject outgoing_message_queue = get_cyblack_queue_based_session_connection_outgoing_message_queue(self);
            return outgoing_message_queue;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_set_outgoing_message_queue_method(SubLObject self, SubLObject new_outgoing_message_queue) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject outgoing_message_queue = get_cyblack_queue_based_session_connection_outgoing_message_queue(self);
            try {
                try {
                    outgoing_message_queue = new_outgoing_message_queue;
                    sublisp_throw($sym975$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, new_outgoing_message_queue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_outgoing_message_queue(self, outgoing_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym975$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_incoming_messages_available_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
            try {
                try {
                    if (NIL == incoming_message_queue) {
                        sublisp_throw($sym979$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                    }
                    sublisp_throw($sym979$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(incoming_message_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym979$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_outgoing_messages_available_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject outgoing_message_queue = get_cyblack_queue_based_session_connection_outgoing_message_queue(self);
            try {
                try {
                    if (NIL == outgoing_message_queue) {
                        sublisp_throw($sym983$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                    }
                    sublisp_throw($sym983$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_message_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_outgoing_message_queue(self, outgoing_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym983$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_externalize_message_internal_method(SubLObject self, SubLObject external_message) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject outgoing_message_queue = get_cyblack_queue_based_session_connection_outgoing_message_queue(self);
            try {
                try {
                    if (NIL == external_message) {
                        sublisp_throw($sym986$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                    }
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(outgoing_message_queue, external_message);
                    sublisp_throw($sym986$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_outgoing_message_queue(self, outgoing_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym986$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    public static final SubLObject cyblack_queue_based_session_connection_read_external_message_raw_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
            SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
            try {
                try {
                    if (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(incoming_message_queue)) {
                        sublisp_throw($sym989$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(incoming_message_queue));
                    }
                    sublisp_throw($sym989$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym989$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_queue_based_session_connection_method;
        }
    }

    // defparameter
    public static final SubLSymbol $session_connection$ = makeSymbol("*SESSION-CONNECTION*");

    public static final SubLObject cyblack_queue_based_session_connection_process_incoming_messages_method(SubLObject self, SubLObject invitation_stage) {
        if (invitation_stage == UNPROVIDED) {
            invitation_stage = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_queue_based_session_connection_method = NIL;
                SubLObject incoming_message_queue = get_cyblack_queue_based_session_connection_incoming_message_queue(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        $session_connection$.setDynamicValue(self, thread);
                        if (NIL == incoming_message_queue) {
                            cyblack_queue_based_session_connection_get_incoming_message_queue_method(self);
                        }
                        {
                            SubLObject message_broker = cyblack_session_connection_get_message_broker_method(self);
                            SubLObject message = NIL;
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == message_broker) {
                                    Errors.error($str_alt993$_PROCESS_INCOMING_MESSAGES__S___C, self);
                                }
                            }
                            {
                                SubLObject current = NIL;
                                SubLObject v_agenda = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_agenda(application))) : NIL;
                                SubLObject blackboard = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_blackboard(application))) : NIL;
                                while (NIL != cyblack_queue_based_session_connection_outgoing_messages_available_p_method(self)) {
                                    if ((NIL != v_agenda) && (NIL != blackboard)) {
                                        {
                                            SubLObject event = cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_agenda_dequeue_event_method(v_agenda);
                                            if (NIL != event) {
                                                cyblack_blackboard.cyblack_blackboard_post(blackboard, event);
                                            }
                                        }
                                    }
                                    sleep($float$0_5);
                                } 
                                while (NIL != cyblack_queue_based_session_connection_incoming_messages_available_p_method(self)) {
                                    if ((NIL != v_agenda) && (NIL != blackboard)) {
                                        {
                                            SubLObject event = cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_agenda_dequeue_event_method(v_agenda);
                                            if (NIL != event) {
                                                cyblack_blackboard.cyblack_blackboard_post(blackboard, event);
                                            }
                                        }
                                    }
                                    current = cyblack_queue_based_session_connection_read_external_message_raw_method(self);
                                    if ((current == $DISCONNECTED) || (current.isString() && (NIL != cyblack_internal_string_equal_p(current, $str_alt995$_DISCONNECTED)))) {
                                        methods.funcall_instance_method_with_0_args(application, HALT);
                                    }
                                    force_output(T);
                                    message = methods.funcall_instance_method_with_1_args(message_broker, RECEIVE, current);
                                    if (NIL != message) {
                                        methods.funcall_instance_method_with_0_args(message, EXECUTE);
                                    }
                                } 
                            }
                        }
                        sublisp_throw($sym992$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_queue_based_session_connection_incoming_message_queue(self, incoming_message_queue);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_queue_based_session_connection_method = Errors.handleThrowable(ccatch_env_var, $sym992$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_queue_based_session_connection_method;
            }
        }
    }

    public static final SubLObject get_cyblack_external_connection_session_connections(SubLObject cyblack_external_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_connection, THREE_INTEGER, SESSION_CONNECTIONS);
    }

    public static final SubLObject set_cyblack_external_connection_session_connections(SubLObject cyblack_external_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_connection, value, THREE_INTEGER, SESSION_CONNECTIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_connection_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_connection_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_CONNECTION, SESSION_CONNECTIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_connection_p(SubLObject cyblack_external_connection) {
        return classes.subloop_instanceof_class(cyblack_external_connection, CYBLACK_EXTERNAL_CONNECTION);
    }

    public static final SubLObject cyblack_external_connection_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_connection_method = NIL;
            SubLObject session_connections = get_cyblack_external_connection_session_connections(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    session_connections = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                    sublisp_throw($sym1004$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_connection_session_connections(self, session_connections);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1004$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_external_connection_method;
        }
    }

    public static final SubLObject cyblack_external_connection_get_application_method(SubLObject self) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_external_connection_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_connection_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt68$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym1007$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD, new_application);
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
                    catch_var_for_cyblack_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1007$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_external_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_external_connection_register_session_connection_method(SubLObject self, SubLObject session_id, SubLObject session_connection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_connection_method = NIL;
                SubLObject session_connections = get_cyblack_external_connection_session_connections(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!session_id.isString()) {
                                Errors.error($str_alt1013$_REGISTER_SESSION_CONNECTION__S__, self, session_id);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_session_connection_p(session_connection)) {
                                Errors.error($str_alt1014$_REGISTER_SESSION_CONNECTION__S__, self, session_connection);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt1015$_REGISTER_SESSION_CONNECTION__S__, self);
                            }
                        }
                        cyblack_session_connection_set_application_method(session_connection, application);
                        dictionary.dictionary_enter(session_connections, session_id, session_connection);
                        sublisp_throw($sym1012$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD, T);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_connection_session_connections(self, session_connections);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1012$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_external_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_external_connection_read_external_message_method(SubLObject self, SubLObject session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_connection_method = NIL;
                SubLObject session_connections = get_cyblack_external_connection_session_connections(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!session_id.isString()) {
                                Errors.error($str_alt1020$_READ_EXTERNAL_MESSAGE__S____S_is, self, session_id);
                            }
                        }
                        {
                            SubLObject session_connection = dictionary.dictionary_lookup(session_connections, session_id, NIL);
                            SubLObject result = NIL;
                            if (NIL == session_connection) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == application) {
                                        Errors.error($str_alt1021$_READ_EXTERNAL_MESSAGE__S____S_ha, self, self);
                                    }
                                }
                                {
                                    SubLObject connection_class = CYBLACK_QUEUE_BASED_SESSION_CONNECTION;
                                    SubLObject port_manager = methods.funcall_instance_method_with_0_args(application, GET_PORT_MANAGER);
                                    SubLObject message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == connection_class) {
                                            Errors.error($str_alt1023$_READ_EXTERNAL_MESSAGE__S___No_co, self, application);
                                        }
                                    }
                                    if ((NIL != port_manager) && (NIL != message_broker)) {
                                        cyblack_port_manager_set_message_broker_method(port_manager, message_broker);
                                        {
                                            SubLObject connection = object.new_class_instance(connection_class);
                                            SubLObject outgoing_queue = cyblack_port_manager_get_outgoing_queue_method(port_manager);
                                            SubLObject incoming_queue = cyblack_port_manager_get_incoming_queue_method(port_manager);
                                            methods.funcall_instance_method_with_1_args(connection, SET_APPLICATION, application);
                                            session_connection = connection;
                                            cyblack_external_connection_register_session_connection_method(self, session_id, connection);
                                            cyblack_queue_based_session_connection_set_outgoing_message_queue_method(connection, outgoing_queue);
                                            cyblack_queue_based_session_connection_set_incoming_message_queue_method(connection, incoming_queue);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                                try {
                                    $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                                    result = methods.funcall_instance_method_with_0_args(session_connection, READ_EXTERNAL_MESSAGE);
                                } finally {
                                    $package$.rebind(_prev_bind_0, thread);
                                }
                            }
                            sublisp_throw($sym1019$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD, result);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_connection_session_connections(self, session_connections);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1019$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_external_connection_method;
            }
        }
    }

    public static final SubLObject cyblack_external_connection_write_external_message_method(SubLObject self, SubLObject session_id, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_external_connection_method = NIL;
                SubLObject session_connections = get_cyblack_external_connection_session_connections(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!session_id.isString()) {
                                Errors.error($str_alt1028$_WRITE_EXTERNAL_MESSAGE__S____S_i, self, session_id);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_messages.cyblack_message_p(message)) {
                                Errors.error($str_alt1029$_WRITE_EXTERNAL_MESSAGE__S____S_i, self, message);
                            }
                        }
                        {
                            SubLObject session_connection = dictionary.dictionary_lookup(session_connections, session_id, NIL);
                            SubLObject result = NIL;
                            if (NIL == session_connection) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == application) {
                                        Errors.error($str_alt1021$_READ_EXTERNAL_MESSAGE__S____S_ha, self, self);
                                    }
                                }
                                {
                                    SubLObject connection_class = CYBLACK_QUEUE_BASED_SESSION_CONNECTION;
                                    SubLObject port_manager = methods.funcall_instance_method_with_0_args(application, GET_PORT_MANAGER);
                                    SubLObject message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == connection_class) {
                                            Errors.error($str_alt1023$_READ_EXTERNAL_MESSAGE__S___No_co, self, application);
                                        }
                                    }
                                    if ((NIL != port_manager) && (NIL != message_broker)) {
                                        cyblack_port_manager_set_message_broker_method(port_manager, message_broker);
                                        {
                                            SubLObject connection = object.new_class_instance(connection_class);
                                            SubLObject outgoing_queue = cyblack_port_manager_get_outgoing_queue_method(port_manager);
                                            SubLObject incoming_queue = cyblack_port_manager_get_incoming_queue_method(port_manager);
                                            methods.funcall_instance_method_with_1_args(connection, SET_APPLICATION, application);
                                            session_connection = connection;
                                            cyblack_external_connection_register_session_connection_method(self, session_id, connection);
                                            cyblack_queue_based_session_connection_set_outgoing_message_queue_method(connection, outgoing_queue);
                                            cyblack_queue_based_session_connection_set_incoming_message_queue_method(connection, incoming_queue);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                                try {
                                    $package$.bind(cyblack_globals.$cyblack_package$.getDynamicValue(thread), thread);
                                    result = methods.funcall_instance_method_with_1_args(session_connection, EXTERNALIZE_MESSAGE, message);
                                } finally {
                                    $package$.rebind(_prev_bind_0, thread);
                                }
                            }
                            sublisp_throw($sym1027$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD, result);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_external_connection_session_connections(self, session_connections);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1027$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD);
                }
                return catch_var_for_cyblack_external_connection_method;
            }
        }
    }

    public static final SubLObject get_cyblack_standard_external_connection_session_connection(SubLObject cyblack_standard_external_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_standard_external_connection, FIVE_INTEGER, SESSION_CONNECTION);
    }

    public static final SubLObject set_cyblack_standard_external_connection_session_connection(SubLObject cyblack_standard_external_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_standard_external_connection, value, FIVE_INTEGER, SESSION_CONNECTION);
    }

    public static final SubLObject get_cyblack_standard_external_connection_session_id(SubLObject cyblack_standard_external_connection) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_standard_external_connection, FOUR_INTEGER, SESSION_ID);
    }

    public static final SubLObject set_cyblack_standard_external_connection_session_id(SubLObject cyblack_standard_external_connection, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_standard_external_connection, value, FOUR_INTEGER, SESSION_ID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_standard_external_connection_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_standard_external_connection_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_CONNECTION, SESSION_CONNECTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STANDARD_EXTERNAL_CONNECTION, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STANDARD_EXTERNAL_CONNECTION, SESSION_CONNECTION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_standard_external_connection_p(SubLObject cyblack_standard_external_connection) {
        return classes.subloop_instanceof_class(cyblack_standard_external_connection, CYBLACK_STANDARD_EXTERNAL_CONNECTION);
    }

    public static final SubLObject cyblack_standard_external_connection_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_standard_external_connection_method = NIL;
            SubLObject session_connection = get_cyblack_standard_external_connection_session_connection(self);
            SubLObject session_id = get_cyblack_standard_external_connection_session_id(self);
            try {
                try {
                    cyblack_external_connection_initialize_method(self);
                    session_id = $str_alt198$;
                    session_connection = object.new_class_instance(CYBLACK_QUEUE_BASED_SESSION_CONNECTION);
                    sublisp_throw($sym1036$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_standard_external_connection_session_connection(self, session_connection);
                            set_cyblack_standard_external_connection_session_id(self, session_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_standard_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1036$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_standard_external_connection_method;
        }
    }

    public static final SubLObject cyblack_standard_external_connection_get_session_connection_method(SubLObject self) {
        {
            SubLObject session_connection = get_cyblack_standard_external_connection_session_connection(self);
            return session_connection;
        }
    }

    public static final SubLObject cyblack_standard_external_connection_assign_message_broker_method(SubLObject self, SubLObject new_message_broker) {
        {
            SubLObject catch_var_for_cyblack_standard_external_connection_method = NIL;
            SubLObject session_connection = get_cyblack_standard_external_connection_session_connection(self);
            SubLObject session_id = get_cyblack_standard_external_connection_session_id(self);
            try {
                try {
                    {
                        SubLObject message_broker_session_id = methods.funcall_instance_method_with_0_args(new_message_broker, GET_SESSION_ID);
                        session_id = message_broker_session_id;
                        cyblack_external_connection_register_session_connection_method(self, session_id, session_connection);
                        sublisp_throw($sym1043$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD, new_message_broker);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_standard_external_connection_session_connection(self, session_connection);
                            set_cyblack_standard_external_connection_session_id(self, session_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_standard_external_connection_method = Errors.handleThrowable(ccatch_env_var, $sym1043$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD);
            }
            return catch_var_for_cyblack_standard_external_connection_method;
        }
    }

    public static final SubLObject cyblack_standard_external_connection_get_session_id_method(SubLObject self) {
        {
            SubLObject session_id = get_cyblack_standard_external_connection_session_id(self);
            return session_id;
        }
    }

    // defparameter
    private static final SubLSymbol $within_cyblack_new_server$ = makeSymbol("*WITHIN-CYBLACK-NEW-SERVER*");

    public static final SubLObject cyblack_new_server_handler(SubLObject in_stream, SubLObject out_stream) {
        return cyblack_new_server_top_level(in_stream, out_stream);
    }

    public static final SubLObject cyblack_new_server_top_level(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt1048$__CYBLACK_PORT_SERVER_TOP_LEVEL__);
            force_output(T);
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_8 = $within_cyblack_new_server$.currentBinding(thread);
                                        try {
                                            $within_cyblack_new_server$.bind(T, thread);
                                            cyblack_new_server_handler_internal(in_stream, out_stream);
                                        } finally {
                                            $within_cyblack_new_server$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $CYBLACK_NEW_QUIT);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_new_server_handler_internal(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $read_base$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $read_eval$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_suppress$.currentBinding(thread);
                SubLObject _prev_bind_4 = $readtable$.currentBinding(thread);
                try {
                    $read_base$.bind(TEN_INTEGER, thread);
                    $read_default_float_format$.bind(SINGLE_FLOAT, thread);
                    $read_eval$.bind(T, thread);
                    $read_suppress$.bind(NIL, thread);
                    $readtable$.bind($standard_readtable$.getGlobalValue(), thread);
                    cyblack_server_bind_streams(in_stream, out_stream);
                } finally {
                    $readtable$.rebind(_prev_bind_4, thread);
                    $read_suppress$.rebind(_prev_bind_3, thread);
                    $read_eval$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $read_base$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cyblack_message_broker_file() {
        declareMacro("with_cyblack_port_manager_connect_target", "WITH-CYBLACK-PORT-MANAGER-CONNECT-TARGET");
        declareFunction("cyblack_mb_tab", "CYBLACK-MB-TAB", 2, 0, false);
        declareFunction("cyblack_internal_string_equal_p", "CYBLACK-INTERNAL-STRING-EQUAL-P", 2, 0, false);
        declareFunction("valid_cyblack_server_command_types", "VALID-CYBLACK-SERVER-COMMAND-TYPES", 0, 0, false);
        declareFunction("cyblack_server_command_type_p", "CYBLACK-SERVER-COMMAND-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_server_command_type", "ENCODE-CYBLACK-SERVER-COMMAND-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_server_command_type", "DECODE-CYBLACK-SERVER-COMMAND-TYPE", 1, 0, false);
        declareFunction("cyblack_server_command_type_less_p", "CYBLACK-SERVER-COMMAND-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_server_command_type_greater_p", "CYBLACK-SERVER-COMMAND-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_enqueue_server_command", "CYBLACK-ENQUEUE-SERVER-COMMAND", 1, 0, false);
        declareFunction("cyblack_get_server_command", "CYBLACK-GET-SERVER-COMMAND", 0, 0, false);
        declareFunction("cyblack_execute_server_commands", "CYBLACK-EXECUTE-SERVER-COMMANDS", 0, 0, false);
        declareFunction("valid_cyblack_extra_message_usage_types", "VALID-CYBLACK-EXTRA-MESSAGE-USAGE-TYPES", 0, 0, false);
        declareFunction("cyblack_extra_message_usage_type_p", "CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_extra_message_usage_type", "ENCODE-CYBLACK-EXTRA-MESSAGE-USAGE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_extra_message_usage_type", "DECODE-CYBLACK-EXTRA-MESSAGE-USAGE-TYPE", 1, 0, false);
        declareFunction("cyblack_extra_message_usage_type_less_p", "CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_extra_message_usage_type_greater_p", "CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_guid_info_reference", "GET-CYBLACK-GUID-INFO-REFERENCE", 1, 0, false);
        declareFunction("set_cyblack_guid_info_reference", "SET-CYBLACK-GUID-INFO-REFERENCE", 2, 0, false);
        declareFunction("get_cyblack_guid_info_usage", "GET-CYBLACK-GUID-INFO-USAGE", 1, 0, false);
        declareFunction("set_cyblack_guid_info_usage", "SET-CYBLACK-GUID-INFO-USAGE", 2, 0, false);
        declareFunction("get_cyblack_guid_info_messages", "GET-CYBLACK-GUID-INFO-MESSAGES", 1, 0, false);
        declareFunction("set_cyblack_guid_info_messages", "SET-CYBLACK-GUID-INFO-MESSAGES", 2, 0, false);
        declareFunction("get_cyblack_guid_info_application", "GET-CYBLACK-GUID-INFO-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_guid_info_application", "SET-CYBLACK-GUID-INFO-APPLICATION", 2, 0, false);
        declareFunction("get_cyblack_guid_info_guid", "GET-CYBLACK-GUID-INFO-GUID", 1, 0, false);
        declareFunction("set_cyblack_guid_info_guid", "SET-CYBLACK-GUID-INFO-GUID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_guid_info_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-INFO-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_guid_info_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-INFO-INSTANCE", 1, 0, false);
        declareFunction("cyblack_guid_info_p", "CYBLACK-GUID-INFO-P", 1, 0, false);
        declareFunction("cyblack_guid_info_initialize_method", "CYBLACK-GUID-INFO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_print_method", "CYBLACK-GUID-INFO-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_guid_info_get_guid_method", "CYBLACK-GUID-INFO-GET-GUID-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_set_guid_method", "CYBLACK-GUID-INFO-SET-GUID-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_get_application_method", "CYBLACK-GUID-INFO-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_set_application_method", "CYBLACK-GUID-INFO-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_get_messages_method", "CYBLACK-GUID-INFO-GET-MESSAGES-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_set_messages_method", "CYBLACK-GUID-INFO-SET-MESSAGES-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_add_message_method", "CYBLACK-GUID-INFO-ADD-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_remove_message_method", "CYBLACK-GUID-INFO-REMOVE-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_clear_messages_method", "CYBLACK-GUID-INFO-CLEAR-MESSAGES-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_empty_messages_p_method", "CYBLACK-GUID-INFO-EMPTY-MESSAGES-P-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_get_last_message_method", "CYBLACK-GUID-INFO-GET-LAST-MESSAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_get_usage_method", "CYBLACK-GUID-INFO-GET-USAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_set_usage_method", "CYBLACK-GUID-INFO-SET-USAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_get_reference_method", "CYBLACK-GUID-INFO-GET-REFERENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_info_set_reference_method", "CYBLACK-GUID-INFO-SET-REFERENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_info_describe_method", "CYBLACK-GUID-INFO-DESCRIBE-METHOD", 1, 2, false);
        declareFunction("get_cyblack_guid_manager_reference_hashtable", "GET-CYBLACK-GUID-MANAGER-REFERENCE-HASHTABLE", 1, 0, false);
        declareFunction("set_cyblack_guid_manager_reference_hashtable", "SET-CYBLACK-GUID-MANAGER-REFERENCE-HASHTABLE", 2, 0, false);
        declareFunction("get_cyblack_guid_manager_guid_hashtable", "GET-CYBLACK-GUID-MANAGER-GUID-HASHTABLE", 1, 0, false);
        declareFunction("set_cyblack_guid_manager_guid_hashtable", "SET-CYBLACK-GUID-MANAGER-GUID-HASHTABLE", 2, 0, false);
        declareFunction("get_cyblack_guid_manager_application", "GET-CYBLACK-GUID-MANAGER-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_guid_manager_application", "SET-CYBLACK-GUID-MANAGER-APPLICATION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_guid_manager_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-MANAGER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_guid_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-MANAGER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_guid_manager_p", "CYBLACK-GUID-MANAGER-P", 1, 0, false);
        declareFunction("cyblack_guid_manager_initialize_method", "CYBLACK-GUID-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_guid_manager_intern_method", "CYBLACK-GUID-MANAGER-INTERN-METHOD", 2, 2, false);
        declareFunction("cyblack_guid_manager_allocate_method", "CYBLACK-GUID-MANAGER-ALLOCATE-METHOD", 2, 2, false);
        declareFunction("cyblack_guid_manager_record_use_method", "CYBLACK-GUID-MANAGER-RECORD-USE-METHOD", 3, 0, false);
        declareFunction("cyblack_guid_manager_expunge_use_method", "CYBLACK-GUID-MANAGER-EXPUNGE-USE-METHOD", 3, 0, false);
        declareFunction("cyblack_guid_manager_get_usage_method", "CYBLACK-GUID-MANAGER-GET-USAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_get_messages_method", "CYBLACK-GUID-MANAGER-GET-MESSAGES-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_get_last_message_method", "CYBLACK-GUID-MANAGER-GET-LAST-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_get_true_guid_method", "CYBLACK-GUID-MANAGER-GET-TRUE-GUID-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_get_guid_info_method", "CYBLACK-GUID-MANAGER-GET-GUID-INFO-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_get_reference_method", "CYBLACK-GUID-MANAGER-GET-REFERENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_guid_manager_describe_method", "CYBLACK-GUID-MANAGER-DESCRIBE-METHOD", 1, 2, false);
        declareFunction("get_cyblack_message_broker_cached_external_connection", "GET-CYBLACK-MESSAGE-BROKER-CACHED-EXTERNAL-CONNECTION", 1, 0, false);
        declareFunction("set_cyblack_message_broker_cached_external_connection", "SET-CYBLACK-MESSAGE-BROKER-CACHED-EXTERNAL-CONNECTION", 2, 0, false);
        declareFunction("get_cyblack_message_broker_cached_application_name", "GET-CYBLACK-MESSAGE-BROKER-CACHED-APPLICATION-NAME", 1, 0, false);
        declareFunction("set_cyblack_message_broker_cached_application_name", "SET-CYBLACK-MESSAGE-BROKER-CACHED-APPLICATION-NAME", 2, 0, false);
        declareFunction("get_cyblack_message_broker_session_id", "GET-CYBLACK-MESSAGE-BROKER-SESSION-ID", 1, 0, false);
        declareFunction("set_cyblack_message_broker_session_id", "SET-CYBLACK-MESSAGE-BROKER-SESSION-ID", 2, 0, false);
        declareFunction("get_cyblack_message_broker_application_id", "GET-CYBLACK-MESSAGE-BROKER-APPLICATION-ID", 1, 0, false);
        declareFunction("set_cyblack_message_broker_application_id", "SET-CYBLACK-MESSAGE-BROKER-APPLICATION-ID", 2, 0, false);
        declareFunction("get_cyblack_message_broker_guid_manager", "GET-CYBLACK-MESSAGE-BROKER-GUID-MANAGER", 1, 0, false);
        declareFunction("set_cyblack_message_broker_guid_manager", "SET-CYBLACK-MESSAGE-BROKER-GUID-MANAGER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_message_broker_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-BROKER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_message_broker_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-BROKER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_message_broker_p", "CYBLACK-MESSAGE-BROKER-P", 1, 0, false);
        declareFunction("cyblack_message_broker_initialize_method", "CYBLACK-MESSAGE-BROKER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_get_guid_manager_method", "CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_set_guid_manager_method", "CYBLACK-MESSAGE-BROKER-SET-GUID-MANAGER-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_get_application_method", "CYBLACK-MESSAGE-BROKER-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_set_application_method", "CYBLACK-MESSAGE-BROKER-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_get_application_id_method", "CYBLACK-MESSAGE-BROKER-GET-APPLICATION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_new_session_id_method", "CYBLACK-MESSAGE-BROKER-NEW-SESSION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_get_session_id_method", "CYBLACK-MESSAGE-BROKER-GET-SESSION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_new_transaction_id_method", "CYBLACK-MESSAGE-BROKER-NEW-TRANSACTION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_new_external_module_id_method", "CYBLACK-MESSAGE-BROKER-NEW-EXTERNAL-MODULE-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_get_external_module_id_method", "CYBLACK-MESSAGE-BROKER-GET-EXTERNAL-MODULE-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_new_proposal_id_method", "CYBLACK-MESSAGE-BROKER-NEW-PROPOSAL-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_associate_common_ids_method", "CYBLACK-MESSAGE-BROKER-ASSOCIATE-COMMON-IDS-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_expunge_common_ids_method", "CYBLACK-MESSAGE-BROKER-EXPUNGE-COMMON-IDS-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_expunge_specific_id_method", "CYBLACK-MESSAGE-BROKER-EXPUNGE-SPECIFIC-ID-METHOD", 3, 0, false);
        declareFunction("cyblack_message_broker_get_external_connection_method", "CYBLACK-MESSAGE-BROKER-GET-EXTERNAL-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_invite_method", "CYBLACK-MESSAGE-BROKER-INVITE-METHOD", 2, 1, false);
        declareFunction("cyblack_message_broker_stimulate_method", "CYBLACK-MESSAGE-BROKER-STIMULATE-METHOD", 2, 1, false);
        declareFunction("cyblack_message_broker_verify_method", "CYBLACK-MESSAGE-BROKER-VERIFY-METHOD", 2, 1, false);
        declareFunction("cyblack_message_broker_cancel_method", "CYBLACK-MESSAGE-BROKER-CANCEL-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_execute_method", "CYBLACK-MESSAGE-BROKER-EXECUTE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_terminate_method", "CYBLACK-MESSAGE-BROKER-TERMINATE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_report_contents_method", "CYBLACK-MESSAGE-BROKER-REPORT-CONTENTS-METHOD", 3, 0, false);
        declareFunction("cyblack_message_broker_report_postings_method", "CYBLACK-MESSAGE-BROKER-REPORT-POSTINGS-METHOD", 3, 0, false);
        declareFunction("cyblack_message_broker_state_change_method", "CYBLACK-MESSAGE-BROKER-STATE-CHANGE-METHOD", 3, 1, false);
        declareFunction("cyblack_message_broker_retreive_transaction_sequence_internal_method", "CYBLACK-MESSAGE-BROKER-RETREIVE-TRANSACTION-SEQUENCE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_retreive_transaction_sequence_method", "CYBLACK-MESSAGE-BROKER-RETREIVE-TRANSACTION-SEQUENCE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_transmit_method", "CYBLACK-MESSAGE-BROKER-TRANSMIT-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_receive_method", "CYBLACK-MESSAGE-BROKER-RECEIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_get_cause_method", "CYBLACK-MESSAGE-BROKER-GET-CAUSE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_broker_process_messages_method", "CYBLACK-MESSAGE-BROKER-PROCESS-MESSAGES-METHOD", 1, 0, false);
        declareFunction("cyblack_message_broker_describe_guid_manager_method", "CYBLACK-MESSAGE-BROKER-DESCRIBE-GUID-MANAGER-METHOD", 1, 2, false);
        declareFunction("get_cyblack_external_module_external_module_name", "GET-CYBLACK-EXTERNAL-MODULE-EXTERNAL-MODULE-NAME", 1, 0, false);
        declareFunction("set_cyblack_external_module_external_module_name", "SET-CYBLACK-EXTERNAL-MODULE-EXTERNAL-MODULE-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_module_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_module_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_module_p", "CYBLACK-EXTERNAL-MODULE-P", 1, 0, false);
        declareFunction("cyblack_external_module_initialize_method", "CYBLACK-EXTERNAL-MODULE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_print_method", "CYBLACK-EXTERNAL-MODULE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_external_module_get_external_module_name_method", "CYBLACK-EXTERNAL-MODULE-GET-EXTERNAL-MODULE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_set_external_module_name_method", "CYBLACK-EXTERNAL-MODULE-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_has_name_p_method", "CYBLACK-EXTERNAL-MODULE-HAS-NAME-P-METHOD", 2, 0, false);
        declareFunction("get_cyblack_external_module_instance_qua_list_element_parent_links", "GET-CYBLACK-EXTERNAL-MODULE-INSTANCE-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_external_module_instance_qua_list_element_parent_links", "SET-CYBLACK-EXTERNAL-MODULE-INSTANCE-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_external_module_instance_external_module_port", "GET-CYBLACK-EXTERNAL-MODULE-INSTANCE-EXTERNAL-MODULE-PORT", 1, 0, false);
        declareFunction("set_cyblack_external_module_instance_external_module_port", "SET-CYBLACK-EXTERNAL-MODULE-INSTANCE-EXTERNAL-MODULE-PORT", 2, 0, false);
        declareFunction("get_cyblack_external_module_instance_external_module_id", "GET-CYBLACK-EXTERNAL-MODULE-INSTANCE-EXTERNAL-MODULE-ID", 1, 0, false);
        declareFunction("set_cyblack_external_module_instance_external_module_id", "SET-CYBLACK-EXTERNAL-MODULE-INSTANCE-EXTERNAL-MODULE-ID", 2, 0, false);
        declareFunction("get_cyblack_external_module_instance_qua_list_element_self_deletion_mode", "GET-CYBLACK-EXTERNAL-MODULE-INSTANCE-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_external_module_instance_qua_list_element_self_deletion_mode", "SET-CYBLACK-EXTERNAL-MODULE-INSTANCE-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_external_module_instance_perform_action_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_external_module_instance_on_delete_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_on_add_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_get_collections_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_member_p_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_delete_self_from_all_collections_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_transfer_self_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-TRANSFER-SELF-METHOD", 3, 0, false);
        declareFunction("cyblack_external_module_instance_delete_self_from_collection_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_delete_parent_link_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_add_parent_link_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_module_instance_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_module_instance_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_module_instance_p", "CYBLACK-EXTERNAL-MODULE-INSTANCE-P", 1, 0, false);
        declareFunction("cyblack_external_module_instance_initialize_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_print_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_external_module_instance_get_external_module_id_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-EXTERNAL-MODULE-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_set_external_module_id_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-EXTERNAL-MODULE-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_get_external_module_port_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-EXTERNAL-MODULE-PORT-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_set_external_module_port_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-EXTERNAL-MODULE-PORT-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_has_name_and_port_p_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-HAS-NAME-AND-PORT-P-METHOD", 3, 0, false);
        declareFunction("cyblack_external_module_instance_get_parent_links_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_set_parent_links_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_instance_get_self_deletion_mode_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_module_instance_set_self_deletion_mode_method", "CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_external_module_name_p", "CYBLACK-EXTERNAL-MODULE-NAME-P", 1, 0, false);
        declareFunction("cyblack_port_id_p", "CYBLACK-PORT-ID-P", 1, 0, false);
        declareFunction("cyblack_port_id_equal_p", "CYBLACK-PORT-ID-EQUAL-P", 2, 0, false);
        declareFunction("get_cyblack_port_outgoing_message_queue", "GET-CYBLACK-PORT-OUTGOING-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_port_outgoing_message_queue", "SET-CYBLACK-PORT-OUTGOING-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_port_incoming_message_queue", "GET-CYBLACK-PORT-INCOMING-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_port_incoming_message_queue", "SET-CYBLACK-PORT-INCOMING-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_port_external_module_instances", "GET-CYBLACK-PORT-EXTERNAL-MODULE-INSTANCES", 1, 0, false);
        declareFunction("set_cyblack_port_external_module_instances", "SET-CYBLACK-PORT-EXTERNAL-MODULE-INSTANCES", 2, 0, false);
        declareFunction("get_cyblack_port_output_stream", "GET-CYBLACK-PORT-OUTPUT-STREAM", 1, 0, false);
        declareFunction("set_cyblack_port_output_stream", "SET-CYBLACK-PORT-OUTPUT-STREAM", 2, 0, false);
        declareFunction("get_cyblack_port_input_stream", "GET-CYBLACK-PORT-INPUT-STREAM", 1, 0, false);
        declareFunction("set_cyblack_port_input_stream", "SET-CYBLACK-PORT-INPUT-STREAM", 2, 0, false);
        declareFunction("get_cyblack_port_port_id", "GET-CYBLACK-PORT-PORT-ID", 1, 0, false);
        declareFunction("set_cyblack_port_port_id", "SET-CYBLACK-PORT-PORT-ID", 2, 0, false);
        declareFunction("get_cyblack_port_running", "GET-CYBLACK-PORT-RUNNING", 1, 0, false);
        declareFunction("set_cyblack_port_running", "SET-CYBLACK-PORT-RUNNING", 2, 0, false);
        declareFunction("get_cyblack_port_connected", "GET-CYBLACK-PORT-CONNECTED", 1, 0, false);
        declareFunction("set_cyblack_port_connected", "SET-CYBLACK-PORT-CONNECTED", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_port_p", "CYBLACK-PORT-P", 1, 0, false);
        declareFunction("cyblack_port_initialize_method", "CYBLACK-PORT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_print_method", "CYBLACK-PORT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_port_equal_method", "CYBLACK-PORT-EQUAL-METHOD", 2, 0, false);
        declareFunction("cyblack_port_set_application_method", "CYBLACK-PORT-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_port_get_port_id_method", "CYBLACK-PORT-GET-PORT-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_port_id_method", "CYBLACK-PORT-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_port_get_input_stream_method", "CYBLACK-PORT-GET-INPUT-STREAM-METHOD", 1, 0, false);
        declareFunction("cyblack_port_has_input_stream_p_method", "CYBLACK-PORT-HAS-INPUT-STREAM-P-METHOD", 2, 0, false);
        declareFunction("cyblack_port_set_input_stream_method", "CYBLACK-PORT-SET-INPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_port_get_output_stream_method", "CYBLACK-PORT-GET-OUTPUT-STREAM-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_output_stream_method", "CYBLACK-PORT-SET-OUTPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_port_has_output_stream_p_method", "CYBLACK-PORT-HAS-OUTPUT-STREAM-P-METHOD", 2, 0, false);
        declareFunction("cyblack_port_has_port_id_p_method", "CYBLACK-PORT-HAS-PORT-ID-P-METHOD", 2, 0, false);
        declareFunction("cyblack_port_has_external_module_instance_p_method", "CYBLACK-PORT-HAS-EXTERNAL-MODULE-INSTANCE-P-METHOD", 3, 0, false);
        declareFunction("cyblack_port_add_external_module_instance_method", "CYBLACK-PORT-ADD-EXTERNAL-MODULE-INSTANCE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_create_and_add_external_module_instance_method", "CYBLACK-PORT-CREATE-AND-ADD-EXTERNAL-MODULE-INSTANCE-METHOD", 3, 0, false);
        declareFunction("cyblack_port_retrieve_external_module_instance_method", "CYBLACK-PORT-RETRIEVE-EXTERNAL-MODULE-INSTANCE-METHOD", 3, 0, false);
        declareFunction("cyblack_port_retrieve_external_module_instance_by_emid_method", "CYBLACK-PORT-RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID-METHOD", 2, 0, false);
        declareFunction("cyblack_port_probe_port_for_external_module_instance_method", "CYBLACK-PORT-PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE-METHOD", 3, 0, false);
        declareFunction("cyblack_close_port_stream", "CYBLACK-CLOSE-PORT-STREAM", 1, 0, false);
        declareFunction("cyblack_port_close_method", "CYBLACK-PORT-CLOSE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_send_outgoing_message_method", "CYBLACK-PORT-SEND-OUTGOING-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_is_running_p_method", "CYBLACK-PORT-IS-RUNNING-P-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_running_method", "CYBLACK-PORT-SET-RUNNING-METHOD", 2, 0, false);
        declareFunction("cyblack_port_is_connected_p_method", "CYBLACK-PORT-IS-CONNECTED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_connected_method", "CYBLACK-PORT-SET-CONNECTED-METHOD", 2, 0, false);
        declareFunction("cyblack_port_harvest_input_method", "CYBLACK-PORT-HARVEST-INPUT-METHOD", 1, 0, false);
        declareFunction("cyblack_port_get_incoming_message_queue_method", "CYBLACK-PORT-GET-INCOMING-MESSAGE-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_incoming_message_queue_method", "CYBLACK-PORT-SET-INCOMING-MESSAGE-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_get_outgoing_message_queue_method", "CYBLACK-PORT-GET-OUTGOING-MESSAGE-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_set_outgoing_message_queue_method", "CYBLACK-PORT-SET-OUTGOING-MESSAGE-QUEUE-METHOD", 2, 0, false);
        declareFunction("valid_cyblack_current_port_states", "VALID-CYBLACK-CURRENT-PORT-STATES", 0, 0, false);
        declareFunction("cyblack_current_port_state_p", "CYBLACK-CURRENT-PORT-STATE-P", 1, 0, false);
        declareFunction("encode_cyblack_current_port_state", "ENCODE-CYBLACK-CURRENT-PORT-STATE", 1, 0, false);
        declareFunction("decode_cyblack_current_port_state", "DECODE-CYBLACK-CURRENT-PORT-STATE", 1, 0, false);
        declareFunction("cyblack_current_port_state_less_p", "CYBLACK-CURRENT-PORT-STATE-LESS-P", 2, 0, false);
        declareFunction("cyblack_current_port_state_greater_p", "CYBLACK-CURRENT-PORT-STATE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_port_input_harvester_function", "CYBLACK-PORT-INPUT-HARVESTER-FUNCTION", 0, 0, false);
        declareFunction("cyblack_port_spawn_input_harvester_method", "CYBLACK-PORT-SPAWN-INPUT-HARVESTER-METHOD", 1, 0, false);
        declareFunction("get_cyblack_port_manager_cached_knowledge_source_battery", "GET-CYBLACK-PORT-MANAGER-CACHED-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("set_cyblack_port_manager_cached_knowledge_source_battery", "SET-CYBLACK-PORT-MANAGER-CACHED-KNOWLEDGE-SOURCE-BATTERY", 2, 0, false);
        declareFunction("get_cyblack_port_manager_outgoing_queue_reference", "GET-CYBLACK-PORT-MANAGER-OUTGOING-QUEUE-REFERENCE", 1, 0, false);
        declareFunction("set_cyblack_port_manager_outgoing_queue_reference", "SET-CYBLACK-PORT-MANAGER-OUTGOING-QUEUE-REFERENCE", 2, 0, false);
        declareFunction("get_cyblack_port_manager_incoming_queue_reference", "GET-CYBLACK-PORT-MANAGER-INCOMING-QUEUE-REFERENCE", 1, 0, false);
        declareFunction("set_cyblack_port_manager_incoming_queue_reference", "SET-CYBLACK-PORT-MANAGER-INCOMING-QUEUE-REFERENCE", 2, 0, false);
        declareFunction("get_cyblack_port_manager_ports", "GET-CYBLACK-PORT-MANAGER-PORTS", 1, 0, false);
        declareFunction("set_cyblack_port_manager_ports", "SET-CYBLACK-PORT-MANAGER-PORTS", 2, 0, false);
        declareFunction("get_cyblack_port_manager_message_broker", "GET-CYBLACK-PORT-MANAGER-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_port_manager_message_broker", "SET-CYBLACK-PORT-MANAGER-MESSAGE-BROKER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_manager_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_port_manager_p", "CYBLACK-PORT-MANAGER-P", 1, 0, false);
        declareFunction("cyblack_port_manager_initialize_method", "CYBLACK-PORT-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_print_method", "CYBLACK-PORT-MANAGER-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_port_manager_set_application_method", "CYBLACK-PORT-MANAGER-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_get_knowledge_source_battery_method", "CYBLACK-PORT-MANAGER-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_get_message_broker_method", "CYBLACK-PORT-MANAGER-GET-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_set_message_broker_method", "CYBLACK-PORT-MANAGER-SET-MESSAGE-BROKER-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_set_queues_method", "CYBLACK-PORT-MANAGER-SET-QUEUES-METHOD", 3, 0, false);
        declareFunction("cyblack_port_manager_retrieve_port_method", "CYBLACK-PORT-MANAGER-RETRIEVE-PORT-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_port_given_input_stream_method", "CYBLACK-PORT-MANAGER-PORT-GIVEN-INPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_port_given_output_stream_method", "CYBLACK-PORT-MANAGER-PORT-GIVEN-OUTPUT-STREAM-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_close_all_ports_method", "CYBLACK-PORT-MANAGER-CLOSE-ALL-PORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_add_port_method", "CYBLACK-PORT-MANAGER-ADD-PORT-METHOD", 2, 2, false);
        declareFunction("cyblack_port_manager_remove_port_method", "CYBLACK-PORT-MANAGER-REMOVE-PORT-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_invite_knowledge_source_method", "CYBLACK-PORT-MANAGER-INVITE-KNOWLEDGE-SOURCE-METHOD", 4, 0, false);
        declareFunction("cyblack_port_manager_route_outgoing_message_method", "CYBLACK-PORT-MANAGER-ROUTE-OUTGOING-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_all_ports_are_connected_p_method", "CYBLACK-PORT-MANAGER-ALL-PORTS-ARE-CONNECTED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_all_ports_which_are_not_connected_method", "CYBLACK-PORT-MANAGER-ALL-PORTS-WHICH-ARE-NOT-CONNECTED-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_get_incoming_queue_method", "CYBLACK-PORT-MANAGER-GET-INCOMING-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_set_incoming_queue_method", "CYBLACK-PORT-MANAGER-SET-INCOMING-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_get_outgoing_queue_method", "CYBLACK-PORT-MANAGER-GET-OUTGOING-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_set_outgoing_queue_method", "CYBLACK-PORT-MANAGER-SET-OUTGOING-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_harvest_input_method", "CYBLACK-PORT-MANAGER-HARVEST-INPUT-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_spawn_input_harvesters_method", "CYBLACK-PORT-MANAGER-SPAWN-INPUT-HARVESTERS-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_all_ports_connected_p_method", "CYBLACK-PORT-MANAGER-ALL-PORTS-CONNECTED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_wait_until_all_ports_connected_p_method", "CYBLACK-PORT-MANAGER-WAIT-UNTIL-ALL-PORTS-CONNECTED-P-METHOD", 2, 0, false);
        declareFunction("valid_cyblack_current_port_manager_states", "VALID-CYBLACK-CURRENT-PORT-MANAGER-STATES", 0, 0, false);
        declareFunction("cyblack_current_port_manager_state_p", "CYBLACK-CURRENT-PORT-MANAGER-STATE-P", 1, 0, false);
        declareFunction("encode_cyblack_current_port_manager_state", "ENCODE-CYBLACK-CURRENT-PORT-MANAGER-STATE", 1, 0, false);
        declareFunction("decode_cyblack_current_port_manager_state", "DECODE-CYBLACK-CURRENT-PORT-MANAGER-STATE", 1, 0, false);
        declareFunction("cyblack_current_port_manager_state_less_p", "CYBLACK-CURRENT-PORT-MANAGER-STATE-LESS-P", 2, 0, false);
        declareFunction("cyblack_current_port_manager_state_greater_p", "CYBLACK-CURRENT-PORT-MANAGER-STATE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_spawn_server_output_loop", "CYBLACK-SPAWN-SERVER-OUTPUT-LOOP", 1, 0, false);
        declareFunction("cyblack_server_process_terminate_p", "CYBLACK-SERVER-PROCESS-TERMINATE-P", 0, 0, false);
        declareFunction("cyblack_server_output_increment", "CYBLACK-SERVER-OUTPUT-INCREMENT", 0, 0, false);
        declareFunction("cyblack_server_output_loop", "CYBLACK-SERVER-OUTPUT-LOOP", 0, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_queue_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_session_queue_p", "CYBLACK-SESSION-QUEUE-P", 1, 0, false);
        declareFunction("cyblack_session_queue_on_enqueue_method", "CYBLACK-SESSION-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_continue_p", "CYBLACK-PORT-MANAGER-CONTINUE-P", 0, 0, false);
        declareFunction("valid_cyblack_port_manager_command_types", "VALID-CYBLACK-PORT-MANAGER-COMMAND-TYPES", 0, 0, false);
        declareFunction("cyblack_port_manager_command_type_p", "CYBLACK-PORT-MANAGER-COMMAND-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_port_manager_command_type", "ENCODE-CYBLACK-PORT-MANAGER-COMMAND-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_port_manager_command_type", "DECODE-CYBLACK-PORT-MANAGER-COMMAND-TYPE", 1, 0, false);
        declareFunction("cyblack_port_manager_command_type_less_p", "CYBLACK-PORT-MANAGER-COMMAND-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_port_manager_command_type_greater_p", "CYBLACK-PORT-MANAGER-COMMAND-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_start_port_manager", "CYBLACK-START-PORT-MANAGER", 0, 1, false);
        declareFunction("cyblack_stop_port_manager", "CYBLACK-STOP-PORT-MANAGER", 0, 0, false);
        declareMacro("cyblack_port_manager_top_level_normalize_sleep_interval", "CYBLACK-PORT-MANAGER-TOP-LEVEL-NORMALIZE-SLEEP-INTERVAL");
        declareMacro("cyblack_port_manager_accelerate", "CYBLACK-PORT-MANAGER-ACCELERATE");
        declareMacro("cyblack_port_manager_deaccelerate", "CYBLACK-PORT-MANAGER-DEACCELERATE");
        declareFunction("cyblack_commands_to_process_p", "CYBLACK-COMMANDS-TO-PROCESS-P", 0, 0, false);
        declareFunction("cyblack_port_manager_increment", "CYBLACK-PORT-MANAGER-INCREMENT", 0, 0, false);
        declareFunction("cyblack_port_manager_top_level", "CYBLACK-PORT-MANAGER-TOP-LEVEL", 0, 0, false);
        declareFunction("cyblack_port_manager_connect_application_using_target", "CYBLACK-PORT-MANAGER-CONNECT-APPLICATION-USING-TARGET", 0, 0, false);
        declareFunction("cyblack_port_manager_connect_application", "CYBLACK-PORT-MANAGER-CONNECT-APPLICATION", 1, 0, false);
        declareFunction("cyblack_server_bind_streams", "CYBLACK-SERVER-BIND-STREAMS", 2, 0, false);
        declareFunction("cyblack_server_register_port", "CYBLACK-SERVER-REGISTER-PORT", 1, 0, false);
        declareFunction("cyblack_server_unregister_port", "CYBLACK-SERVER-UNREGISTER-PORT", 1, 0, false);
        declareFunction("cyblack_server_port_in_use_p", "CYBLACK-SERVER-PORT-IN-USE-P", 1, 0, false);
        declareFunction("cyblack_start_server", "CYBLACK-START-SERVER", 1, 0, false);
        declareFunction("get_cyblack_session_connection_cached_message_broker", "GET-CYBLACK-SESSION-CONNECTION-CACHED-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_session_connection_cached_message_broker", "SET-CYBLACK-SESSION-CONNECTION-CACHED-MESSAGE-BROKER", 2, 0, false);
        declareFunction("get_cyblack_session_connection_session_id", "GET-CYBLACK-SESSION-CONNECTION-SESSION-ID", 1, 0, false);
        declareFunction("set_cyblack_session_connection_session_id", "SET-CYBLACK-SESSION-CONNECTION-SESSION-ID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_connection_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CONNECTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_session_connection_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CONNECTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_session_connection_p", "CYBLACK-SESSION-CONNECTION-P", 1, 0, false);
        declareFunction("cyblack_session_connection_initialize_method", "CYBLACK-SESSION-CONNECTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_get_application_method", "CYBLACK-SESSION-CONNECTION-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_set_application_method", "CYBLACK-SESSION-CONNECTION-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_session_connection_get_message_broker_method", "CYBLACK-SESSION-CONNECTION-GET-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_get_session_id_method", "CYBLACK-SESSION-CONNECTION-GET-SESSION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_set_session_id_method", "CYBLACK-SESSION-CONNECTION-SET-SESSION-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_session_connection_externalize_message_method", "CYBLACK-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_session_connection_externalize_message_internal_method", "CYBLACK-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_session_connection_internalize_message_method", "CYBLACK-SESSION-CONNECTION-INTERNALIZE-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_session_connection_read_external_message_method", "CYBLACK-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_read_external_message_raw_method", "CYBLACK-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_session_connection_process_incoming_messages_method", "CYBLACK-SESSION-CONNECTION-PROCESS-INCOMING-MESSAGES-METHOD", 1, 1, false);
        declareFunction("get_cyblack_queue_based_session_connection_outgoing_message_queue", "GET-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-OUTGOING-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_queue_based_session_connection_outgoing_message_queue", "SET-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-OUTGOING-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_queue_based_session_connection_incoming_message_queue", "GET-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INCOMING-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_queue_based_session_connection_incoming_message_queue", "SET-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INCOMING-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_queue_based_session_connection_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_queue_based_session_connection_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_p", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-P", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_initialize_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_set_application_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_queue_based_session_connection_get_incoming_message_queue_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-GET-INCOMING-MESSAGE-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_set_incoming_message_queue_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-INCOMING-MESSAGE-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_queue_based_session_connection_get_outgoing_message_queue_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-GET-OUTGOING-MESSAGE-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_set_outgoing_message_queue_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-OUTGOING-MESSAGE-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_queue_based_session_connection_incoming_messages_available_p_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INCOMING-MESSAGES-AVAILABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_outgoing_messages_available_p_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-OUTGOING-MESSAGES-AVAILABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_externalize_message_internal_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_queue_based_session_connection_read_external_message_raw_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_queue_based_session_connection_process_incoming_messages_method", "CYBLACK-QUEUE-BASED-SESSION-CONNECTION-PROCESS-INCOMING-MESSAGES-METHOD", 1, 1, false);
        declareFunction("get_cyblack_external_connection_session_connections", "GET-CYBLACK-EXTERNAL-CONNECTION-SESSION-CONNECTIONS", 1, 0, false);
        declareFunction("set_cyblack_external_connection_session_connections", "SET-CYBLACK-EXTERNAL-CONNECTION-SESSION-CONNECTIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_connection_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-CONNECTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_connection_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-CONNECTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_connection_p", "CYBLACK-EXTERNAL-CONNECTION-P", 1, 0, false);
        declareFunction("cyblack_external_connection_initialize_method", "CYBLACK-EXTERNAL-CONNECTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_connection_get_application_method", "CYBLACK-EXTERNAL-CONNECTION-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_external_connection_set_application_method", "CYBLACK-EXTERNAL-CONNECTION-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_external_connection_register_session_connection_method", "CYBLACK-EXTERNAL-CONNECTION-REGISTER-SESSION-CONNECTION-METHOD", 3, 0, false);
        declareFunction("cyblack_external_connection_read_external_message_method", "CYBLACK-EXTERNAL-CONNECTION-READ-EXTERNAL-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_external_connection_write_external_message_method", "CYBLACK-EXTERNAL-CONNECTION-WRITE-EXTERNAL-MESSAGE-METHOD", 3, 0, false);
        declareFunction("get_cyblack_standard_external_connection_session_connection", "GET-CYBLACK-STANDARD-EXTERNAL-CONNECTION-SESSION-CONNECTION", 1, 0, false);
        declareFunction("set_cyblack_standard_external_connection_session_connection", "SET-CYBLACK-STANDARD-EXTERNAL-CONNECTION-SESSION-CONNECTION", 2, 0, false);
        declareFunction("get_cyblack_standard_external_connection_session_id", "GET-CYBLACK-STANDARD-EXTERNAL-CONNECTION-SESSION-ID", 1, 0, false);
        declareFunction("set_cyblack_standard_external_connection_session_id", "SET-CYBLACK-STANDARD-EXTERNAL-CONNECTION-SESSION-ID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_standard_external_connection_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STANDARD-EXTERNAL-CONNECTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_standard_external_connection_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STANDARD-EXTERNAL-CONNECTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_standard_external_connection_p", "CYBLACK-STANDARD-EXTERNAL-CONNECTION-P", 1, 0, false);
        declareFunction("cyblack_standard_external_connection_initialize_method", "CYBLACK-STANDARD-EXTERNAL-CONNECTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_standard_external_connection_get_session_connection_method", "CYBLACK-STANDARD-EXTERNAL-CONNECTION-GET-SESSION-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_standard_external_connection_assign_message_broker_method", "CYBLACK-STANDARD-EXTERNAL-CONNECTION-ASSIGN-MESSAGE-BROKER-METHOD", 2, 0, false);
        declareFunction("cyblack_standard_external_connection_get_session_id_method", "CYBLACK-STANDARD-EXTERNAL-CONNECTION-GET-SESSION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_new_server_handler", "CYBLACK-NEW-SERVER-HANDLER", 2, 0, false);
        declareFunction("cyblack_new_server_top_level", "CYBLACK-NEW-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction("cyblack_new_server_handler_internal", "CYBLACK-NEW-SERVER-HANDLER-INTERNAL", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_message_broker_file() {
        defparameter("*CYBLACK-PORT-MANAGER-CONNECT-TARGET-APPLICATION*", NIL);
        defparameter("*CYBLACK-PORT-MANAGER-CONNECT-LOCK*", make_lock($$$Port_Manager_Connect_Lock));
        defconstant("*VALID-CYBLACK-SERVER-COMMAND-TYPES*", $list_alt8);
        defconstant("*VALID-CYBLACK-EXTRA-MESSAGE-USAGE-TYPES*", $list_alt20);
        defconstant("*CYBLACK-MESSAGE-INITIAL-MANAGER-TABLE-SIZE*", $int$500);
        defconstant("*VALID-CYBLACK-CURRENT-PORT-STATES*", $list_alt698);
        defparameter("*CYBLACK-INPUT-HARVESTER-CURRENT-PORT*", $NONE);
        defconstant("*VALID-CYBLACK-CURRENT-PORT-MANAGER-STATES*", $list_alt698);
        defparameter("*CYBLACK-OUTPUT-LOOP-CURRENT-PORT-MANAGER*", $NONE);
        defparameter("*CYBLACK-PORT-MANAGER*", NIL);
        defparameter("*CYBLACK-INCOMING-QUEUE*", NIL);
        defparameter("*CYBLACK-OUTGOING-QUEUE*", NIL);
        defparameter("*CYBLACK-COMMAND-QUEUE*", NIL);
        defparameter("*CYBLACK-COMMAND-WAIT-INTERVAL*", $float$0_5);
        defparameter("*CYBLACK-PORT-MANAGER-CONTINUE*", NIL);
        defconstant("*VALID-CYBLACK-PORT-MANAGER-COMMAND-TYPES*", $list_alt875);
        defvar("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MAX-SLEEP-INTERVAL*", $float$10_0);
        defvar("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MIN-SLEEP-INTERVAL*", $float$0_01);
        defvar("*CYBLACK-PORT-MANAGER-TOP-LEVEL-ACCELERATION-RATE*", $float$0_2);
        defparameter("*CYBLACK-PORT-INPUT-STREAM*", NIL);
        defparameter("*CYBLACK-PORT-OUTPUT-STREAM*", NIL);
        defparameter("*CYBLACK-PORT-SERVER-PORT-ID*", NIL);
        defparameter("*CYBLACK-SESSION-CONNECTION*", NIL);
        defparameter("*SESSION-CONNECTION*", NIL);
        defparameter("*WITHIN-CYBLACK-NEW-SERVER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cyblack_message_broker_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_SERVER_COMMAND_TYPE, $list_alt8);
        enumerations.enumerations_incorporate_definition(CYBLACK_EXTRA_MESSAGE_USAGE_TYPE, $list_alt20);
        classes.subloop_new_class(CYBLACK_GUID_INFO, OBJECT, NIL, NIL, $list_alt27);
        classes.class_set_implements_slot_listeners(CYBLACK_GUID_INFO, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_GUID_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_INFO_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_GUID_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_INFO_INSTANCE);
        subloop_reserved_initialize_cyblack_guid_info_class(CYBLACK_GUID_INFO);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_GUID_INFO, $list_alt39, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, INITIALIZE, CYBLACK_GUID_INFO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_GUID_INFO, $list_alt45, $list_alt46, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, PRINT, CYBLACK_GUID_INFO_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_GUID, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt53);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_GUID, CYBLACK_GUID_INFO_GET_GUID_METHOD);
        methods.methods_incorporate_instance_method(SET_GUID, CYBLACK_GUID_INFO, $list_alt45, $list_alt56, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, SET_GUID, CYBLACK_GUID_INFO_SET_GUID_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_APPLICATION, CYBLACK_GUID_INFO_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_GUID_INFO, $list_alt45, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, SET_APPLICATION, CYBLACK_GUID_INFO_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGES, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_MESSAGES, CYBLACK_GUID_INFO_GET_MESSAGES_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGES, CYBLACK_GUID_INFO, $list_alt45, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, SET_MESSAGES, CYBLACK_GUID_INFO_SET_MESSAGES_METHOD);
        methods.methods_incorporate_instance_method(ADD_MESSAGE, CYBLACK_GUID_INFO, $list_alt80, $list_alt81, $list_alt82);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, ADD_MESSAGE, CYBLACK_GUID_INFO_ADD_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_MESSAGE, CYBLACK_GUID_INFO, $list_alt80, $list_alt86, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, REMOVE_MESSAGE, CYBLACK_GUID_INFO_REMOVE_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_MESSAGES, CYBLACK_GUID_INFO, $list_alt45, NIL, $list_alt91);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, CLEAR_MESSAGES, CYBLACK_GUID_INFO_CLEAR_MESSAGES_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_MESSAGES_P, CYBLACK_GUID_INFO, $list_alt45, NIL, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, EMPTY_MESSAGES_P, CYBLACK_GUID_INFO_EMPTY_MESSAGES_P_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_MESSAGE, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt99);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_LAST_MESSAGE, CYBLACK_GUID_INFO_GET_LAST_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_USAGE, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_USAGE, CYBLACK_GUID_INFO_GET_USAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_USAGE, CYBLACK_GUID_INFO, $list_alt45, $list_alt105, $list_alt106);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, SET_USAGE, CYBLACK_GUID_INFO_SET_USAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_REFERENCE, CYBLACK_GUID_INFO, $list_alt52, NIL, $list_alt111);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, GET_REFERENCE, CYBLACK_GUID_INFO_GET_REFERENCE_METHOD);
        methods.methods_incorporate_instance_method(SET_REFERENCE, CYBLACK_GUID_INFO, $list_alt45, $list_alt114, $list_alt115);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, SET_REFERENCE, CYBLACK_GUID_INFO_SET_REFERENCE_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE, CYBLACK_GUID_INFO, $list_alt45, $list_alt119, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_GUID_INFO, DESCRIBE, CYBLACK_GUID_INFO_DESCRIBE_METHOD);
        classes.subloop_new_class(CYBLACK_GUID_MANAGER, OBJECT, NIL, NIL, $list_alt130);
        classes.class_set_implements_slot_listeners(CYBLACK_GUID_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_GUID_MANAGER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_GUID_MANAGER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_MANAGER_INSTANCE);
        subloop_reserved_initialize_cyblack_guid_manager_class(CYBLACK_GUID_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_GUID_MANAGER, $list_alt39, NIL, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, INITIALIZE, CYBLACK_GUID_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INTERN, CYBLACK_GUID_MANAGER, $list_alt45, $list_alt139, $list_alt140);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, INTERN, CYBLACK_GUID_MANAGER_INTERN_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE, CYBLACK_GUID_MANAGER, $list_alt45, $list_alt145, $list_alt146);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, ALLOCATE, CYBLACK_GUID_MANAGER_ALLOCATE_METHOD);
        methods.methods_incorporate_instance_method(RECORD_USE, CYBLACK_GUID_MANAGER, $list_alt45, $list_alt150, $list_alt151);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, RECORD_USE, CYBLACK_GUID_MANAGER_RECORD_USE_METHOD);
        methods.methods_incorporate_instance_method(EXPUNGE_USE, CYBLACK_GUID_MANAGER, $list_alt45, $list_alt150, $list_alt157);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, EXPUNGE_USE, CYBLACK_GUID_MANAGER_EXPUNGE_USE_METHOD);
        methods.methods_incorporate_instance_method(GET_USAGE, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt160, $list_alt161);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_USAGE, CYBLACK_GUID_MANAGER_GET_USAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGES, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt160, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_MESSAGES, CYBLACK_GUID_MANAGER_GET_MESSAGES_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_MESSAGE, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt160, $list_alt167);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_LAST_MESSAGE, CYBLACK_GUID_MANAGER_GET_LAST_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_TRUE_GUID, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt160, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_TRUE_GUID, CYBLACK_GUID_MANAGER_GET_TRUE_GUID_METHOD);
        methods.methods_incorporate_instance_method(GET_GUID_INFO, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt175, $list_alt176);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_GUID_INFO, CYBLACK_GUID_MANAGER_GET_GUID_INFO_METHOD);
        methods.methods_incorporate_instance_method(GET_REFERENCE, CYBLACK_GUID_MANAGER, $list_alt52, $list_alt175, $list_alt178);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, GET_REFERENCE, CYBLACK_GUID_MANAGER_GET_REFERENCE_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE, CYBLACK_GUID_MANAGER, NIL, $list_alt119, $list_alt180);
        methods.subloop_register_instance_method(CYBLACK_GUID_MANAGER, DESCRIBE, CYBLACK_GUID_MANAGER_DESCRIBE_METHOD);
        classes.subloop_new_class(CYBLACK_MESSAGE_BROKER, CYBLACK_OBJECT, NIL, NIL, $list_alt187);
        classes.class_set_implements_slot_listeners(CYBLACK_MESSAGE_BROKER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MESSAGE_BROKER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_BROKER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MESSAGE_BROKER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_BROKER_INSTANCE);
        subloop_reserved_initialize_cyblack_message_broker_class(CYBLACK_MESSAGE_BROKER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MESSAGE_BROKER, $list_alt39, NIL, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, INITIALIZE, CYBLACK_MESSAGE_BROKER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_GUID_MANAGER, CYBLACK_MESSAGE_BROKER, $list_alt52, NIL, $list_alt201);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_GUID_MANAGER, CYBLACK_MESSAGE_BROKER_GET_GUID_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(SET_GUID_MANAGER, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt204, $list_alt205);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, SET_GUID_MANAGER, CYBLACK_MESSAGE_BROKER_SET_GUID_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_MESSAGE_BROKER, $list_alt52, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_APPLICATION, CYBLACK_MESSAGE_BROKER_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt65, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, SET_APPLICATION, CYBLACK_MESSAGE_BROKER_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION_ID, CYBLACK_MESSAGE_BROKER, $list_alt52, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_APPLICATION_ID, CYBLACK_MESSAGE_BROKER_GET_APPLICATION_ID_METHOD);
        methods.methods_incorporate_instance_method(NEW_SESSION_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt221);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, NEW_SESSION_ID, CYBLACK_MESSAGE_BROKER_NEW_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_SESSION_ID, CYBLACK_MESSAGE_BROKER, $list_alt52, NIL, $list_alt225);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_SESSION_ID, CYBLACK_MESSAGE_BROKER_GET_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(NEW_TRANSACTION_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, NEW_TRANSACTION_ID, CYBLACK_MESSAGE_BROKER_NEW_TRANSACTION_ID_METHOD);
        methods.methods_incorporate_instance_method(NEW_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt233);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, NEW_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_BROKER_NEW_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt238, $list_alt239);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_BROKER_GET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(NEW_PROPOSAL_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, NEW_PROPOSAL_ID, CYBLACK_MESSAGE_BROKER_NEW_PROPOSAL_ID_METHOD);
        methods.methods_incorporate_instance_method(ASSOCIATE_COMMON_IDS, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt249, $list_alt250);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, ASSOCIATE_COMMON_IDS, CYBLACK_MESSAGE_BROKER_ASSOCIATE_COMMON_IDS_METHOD);
        methods.methods_incorporate_instance_method(EXPUNGE_COMMON_IDS, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt249, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, EXPUNGE_COMMON_IDS, CYBLACK_MESSAGE_BROKER_EXPUNGE_COMMON_IDS_METHOD);
        methods.methods_incorporate_instance_method(EXPUNGE_SPECIFIC_ID, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt259, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, EXPUNGE_SPECIFIC_ID, CYBLACK_MESSAGE_BROKER_EXPUNGE_SPECIFIC_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_CONNECTION, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt265);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_EXTERNAL_CONNECTION, CYBLACK_MESSAGE_BROKER_GET_EXTERNAL_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(INVITE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt271, $list_alt272);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, INVITE, CYBLACK_MESSAGE_BROKER_INVITE_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt279, $list_alt280);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, STIMULATE, CYBLACK_MESSAGE_BROKER_STIMULATE_METHOD);
        methods.methods_incorporate_instance_method(VERIFY, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt292, $list_alt293);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, VERIFY, CYBLACK_MESSAGE_BROKER_VERIFY_METHOD);
        methods.methods_incorporate_instance_method(CANCEL, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt300, $list_alt301);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, CANCEL, CYBLACK_MESSAGE_BROKER_CANCEL_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt300, $list_alt307);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, EXECUTE, CYBLACK_MESSAGE_BROKER_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(TERMINATE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt313, $list_alt314);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, TERMINATE, CYBLACK_MESSAGE_BROKER_TERMINATE_METHOD);
        methods.methods_incorporate_instance_method(REPORT_CONTENTS, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt320, $list_alt321);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, REPORT_CONTENTS, CYBLACK_MESSAGE_BROKER_REPORT_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(REPORT_POSTINGS, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt328, $list_alt329);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, REPORT_POSTINGS, CYBLACK_MESSAGE_BROKER_REPORT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(STATE_CHANGE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt349, $list_alt350);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, STATE_CHANGE, CYBLACK_MESSAGE_BROKER_STATE_CHANGE_METHOD);
        methods.methods_incorporate_instance_method(RETREIVE_TRANSACTION_SEQUENCE_INTERNAL, CYBLACK_MESSAGE_BROKER, $list_alt39, $list_alt357, $list_alt358);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, RETREIVE_TRANSACTION_SEQUENCE_INTERNAL, $sym360$CYBLACK_MESSAGE_BROKER_RETREIVE_TRANSACTION_SEQUENCE_INTERNAL_MET);
        methods.methods_incorporate_instance_method(RETREIVE_TRANSACTION_SEQUENCE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt357, $list_alt362);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, RETREIVE_TRANSACTION_SEQUENCE, CYBLACK_MESSAGE_BROKER_RETREIVE_TRANSACTION_SEQUENCE_METHOD);
        methods.methods_incorporate_instance_method(TRANSMIT, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt249, $list_alt368);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, TRANSMIT, CYBLACK_MESSAGE_BROKER_TRANSMIT_METHOD);
        methods.methods_incorporate_instance_method(RECEIVE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt374, $list_alt375);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, RECEIVE, CYBLACK_MESSAGE_BROKER_RECEIVE_METHOD);
        methods.methods_incorporate_instance_method(GET_CAUSE, CYBLACK_MESSAGE_BROKER, $list_alt45, $list_alt418, $list_alt419);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, GET_CAUSE, CYBLACK_MESSAGE_BROKER_GET_CAUSE_METHOD);
        methods.methods_incorporate_instance_method(PROCESS_MESSAGES, CYBLACK_MESSAGE_BROKER, $list_alt45, NIL, $list_alt425);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, PROCESS_MESSAGES, CYBLACK_MESSAGE_BROKER_PROCESS_MESSAGES_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_GUID_MANAGER, CYBLACK_MESSAGE_BROKER, NIL, $list_alt119, $list_alt430);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE_BROKER, DESCRIBE_GUID_MANAGER, CYBLACK_MESSAGE_BROKER_DESCRIBE_GUID_MANAGER_METHOD);
        classes.subloop_new_class(CYBLACK_EXTERNAL_MODULE, CYBLACK_OBJECT, NIL, NIL, $list_alt434);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_MODULE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_MODULE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_MODULE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE);
        subloop_reserved_initialize_cyblack_external_module_class(CYBLACK_EXTERNAL_MODULE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_MODULE, $list_alt39, NIL, $list_alt438);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE, INITIALIZE, CYBLACK_EXTERNAL_MODULE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_EXTERNAL_MODULE, $list_alt45, $list_alt46, $list_alt441);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE, PRINT, CYBLACK_EXTERNAL_MODULE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_NAME, CYBLACK_EXTERNAL_MODULE, $list_alt52, NIL, $list_alt446);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE, GET_EXTERNAL_MODULE_NAME, CYBLACK_EXTERNAL_MODULE_GET_EXTERNAL_MODULE_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_EXTERNAL_MODULE, $list_alt45, $list_alt449, $list_alt450);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE, SET_EXTERNAL_MODULE_NAME, CYBLACK_EXTERNAL_MODULE_SET_EXTERNAL_MODULE_NAME_METHOD);
        methods.methods_incorporate_instance_method(HAS_NAME_P, CYBLACK_EXTERNAL_MODULE, $list_alt45, $list_alt455, $list_alt456);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE, HAS_NAME_P, CYBLACK_EXTERNAL_MODULE_HAS_NAME_P_METHOD);
        classes.subloop_new_class(CYBLACK_EXTERNAL_MODULE_INSTANCE, CYBLACK_EXTERNAL_MODULE, $list_alt460, NIL, $list_alt461);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_MODULE_INSTANCE, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt468, $list_alt469);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, PERFORM_ACTION, CYBLACK_EXTERNAL_MODULE_INSTANCE_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt472, $list_alt473);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, ON_DELETE, CYBLACK_EXTERNAL_MODULE_INSTANCE_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt472, $list_alt473);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, ON_ADD, CYBLACK_EXTERNAL_MODULE_INSTANCE_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, NIL, $list_alt478);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, GET_COLLECTIONS, CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt481, $list_alt482);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, MEMBER_P, CYBLACK_EXTERNAL_MODULE_INSTANCE_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, NIL, $list_alt484);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, DELETE_SELF_FROM_ALL_COLLECTIONS, $sym485$CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_SELF_FROM_ALL_COLLECTIONS);
        methods.methods_incorporate_instance_method(TRANSFER_SELF, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt487, $list_alt488);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, TRANSFER_SELF, CYBLACK_EXTERNAL_MODULE_INSTANCE_TRANSFER_SELF_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt481, $list_alt493);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, DELETE_SELF_FROM_COLLECTION, $sym494$CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_SELF_FROM_COLLECTION_METH);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt496, $list_alt497);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, DELETE_PARENT_LINK, CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt500, $list_alt501);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, ADD_PARENT_LINK, CYBLACK_EXTERNAL_MODULE_INSTANCE_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_MODULE_INSTANCE, $sym503$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_MODULE_INSTANCE, $sym504$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE_INST);
        subloop_reserved_initialize_cyblack_external_module_instance_class(CYBLACK_EXTERNAL_MODULE_INSTANCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt39, NIL, $list_alt505);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, INITIALIZE, CYBLACK_EXTERNAL_MODULE_INSTANCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt46, $list_alt508);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, PRINT, CYBLACK_EXTERNAL_MODULE_INSTANCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_ID, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt52, NIL, $list_alt512);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, GET_EXTERNAL_MODULE_ID, CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_ID, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt514, $list_alt515);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, SET_EXTERNAL_MODULE_ID, CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_PORT, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt52, NIL, $list_alt520);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, GET_EXTERNAL_MODULE_PORT, CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_EXTERNAL_MODULE_PORT_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_PORT, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt523, $list_alt524);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, SET_EXTERNAL_MODULE_PORT, CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_EXTERNAL_MODULE_PORT_METHOD);
        methods.methods_incorporate_instance_method(HAS_NAME_AND_PORT_P, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt45, $list_alt529, $list_alt530);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, HAS_NAME_AND_PORT_P, CYBLACK_EXTERNAL_MODULE_INSTANCE_HAS_NAME_AND_PORT_P_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt534, NIL, $list_alt535);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, GET_PARENT_LINKS, CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt39, $list_alt538, $list_alt539);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, SET_PARENT_LINKS, CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt534, NIL, $list_alt543);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, GET_SELF_DELETION_MODE, CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_EXTERNAL_MODULE_INSTANCE, $list_alt39, $list_alt546, $list_alt547);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MODULE_INSTANCE, SET_SELF_DELETION_MODE, CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_SELF_DELETION_MODE_METHOD);
        classes.subloop_new_class(CYBLACK_PORT, CYBLACK_LIST_ELEMENT_OBJECT, NIL, NIL, $list_alt552);
        classes.class_set_implements_slot_listeners(CYBLACK_PORT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PORT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PORT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_INSTANCE);
        subloop_reserved_initialize_cyblack_port_class(CYBLACK_PORT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PORT, $list_alt39, NIL, $list_alt565);
        methods.subloop_register_instance_method(CYBLACK_PORT, INITIALIZE, CYBLACK_PORT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_PORT, $list_alt45, $list_alt46, $list_alt569);
        methods.subloop_register_instance_method(CYBLACK_PORT, PRINT, CYBLACK_PORT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(EQUAL, CYBLACK_PORT, $list_alt45, $list_alt573, $list_alt574);
        methods.subloop_register_instance_method(CYBLACK_PORT, EQUAL, CYBLACK_PORT_EQUAL_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_PORT, $list_alt45, $list_alt65, $list_alt577);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_APPLICATION, CYBLACK_PORT_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_PORT_ID, CYBLACK_PORT, $list_alt52, NIL, $list_alt582);
        methods.subloop_register_instance_method(CYBLACK_PORT, GET_PORT_ID, CYBLACK_PORT_GET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT_ID, CYBLACK_PORT, $list_alt45, $list_alt585, $list_alt586);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_PORT_ID, CYBLACK_PORT_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_INPUT_STREAM, CYBLACK_PORT, $list_alt52, NIL, $list_alt591);
        methods.subloop_register_instance_method(CYBLACK_PORT, GET_INPUT_STREAM, CYBLACK_PORT_GET_INPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(HAS_INPUT_STREAM_P, CYBLACK_PORT, $list_alt45, $list_alt594, $list_alt595);
        methods.subloop_register_instance_method(CYBLACK_PORT, HAS_INPUT_STREAM_P, CYBLACK_PORT_HAS_INPUT_STREAM_P_METHOD);
        methods.methods_incorporate_instance_method(SET_INPUT_STREAM, CYBLACK_PORT, $list_alt45, $list_alt599, $list_alt600);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_INPUT_STREAM, CYBLACK_PORT_SET_INPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTPUT_STREAM, CYBLACK_PORT, $list_alt52, NIL, $list_alt604);
        methods.subloop_register_instance_method(CYBLACK_PORT, GET_OUTPUT_STREAM, CYBLACK_PORT_GET_OUTPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(SET_OUTPUT_STREAM, CYBLACK_PORT, $list_alt45, $list_alt607, $list_alt608);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_OUTPUT_STREAM, CYBLACK_PORT_SET_OUTPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(HAS_OUTPUT_STREAM_P, CYBLACK_PORT, $list_alt45, $list_alt594, $list_alt612);
        methods.subloop_register_instance_method(CYBLACK_PORT, HAS_OUTPUT_STREAM_P, CYBLACK_PORT_HAS_OUTPUT_STREAM_P_METHOD);
        methods.methods_incorporate_instance_method(HAS_PORT_ID_P, CYBLACK_PORT, $list_alt45, $list_alt616, $list_alt617);
        methods.subloop_register_instance_method(CYBLACK_PORT, HAS_PORT_ID_P, CYBLACK_PORT_HAS_PORT_ID_P_METHOD);
        methods.methods_incorporate_instance_method(HAS_EXTERNAL_MODULE_INSTANCE_P, CYBLACK_PORT, $list_alt45, $list_alt621, $list_alt622);
        methods.subloop_register_instance_method(CYBLACK_PORT, HAS_EXTERNAL_MODULE_INSTANCE_P, CYBLACK_PORT_HAS_EXTERNAL_MODULE_INSTANCE_P_METHOD);
        methods.methods_incorporate_instance_method(ADD_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT, $list_alt45, $list_alt628, $list_alt629);
        methods.subloop_register_instance_method(CYBLACK_PORT, ADD_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT_ADD_EXTERNAL_MODULE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT, NIL, $list_alt621, $list_alt634);
        methods.subloop_register_instance_method(CYBLACK_PORT, CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT_CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(RETRIEVE_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT, $list_alt45, $list_alt621, $list_alt637);
        methods.subloop_register_instance_method(CYBLACK_PORT, RETRIEVE_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT_RETRIEVE_EXTERNAL_MODULE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(RETRIEVE_EXTERNAL_MODULE_INSTANCE_BY_EMID, CYBLACK_PORT, $list_alt45, $list_alt642, $list_alt643);
        methods.subloop_register_instance_method(CYBLACK_PORT, RETRIEVE_EXTERNAL_MODULE_INSTANCE_BY_EMID, CYBLACK_PORT_RETRIEVE_EXTERNAL_MODULE_INSTANCE_BY_EMID_METHOD);
        methods.methods_incorporate_instance_method(PROBE_PORT_FOR_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT, $list_alt45, $list_alt621, $list_alt647);
        methods.subloop_register_instance_method(CYBLACK_PORT, PROBE_PORT_FOR_EXTERNAL_MODULE_INSTANCE, CYBLACK_PORT_PROBE_PORT_FOR_EXTERNAL_MODULE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(CLOSE, CYBLACK_PORT, $list_alt45, NIL, $list_alt650);
        methods.subloop_register_instance_method(CYBLACK_PORT, CLOSE, CYBLACK_PORT_CLOSE_METHOD);
        methods.methods_incorporate_instance_method(SEND_OUTGOING_MESSAGE, CYBLACK_PORT, $list_alt45, $list_alt249, $list_alt655);
        methods.subloop_register_instance_method(CYBLACK_PORT, SEND_OUTGOING_MESSAGE, CYBLACK_PORT_SEND_OUTGOING_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(IS_RUNNING_P, CYBLACK_PORT, $list_alt45, NIL, $list_alt660);
        methods.subloop_register_instance_method(CYBLACK_PORT, IS_RUNNING_P, CYBLACK_PORT_IS_RUNNING_P_METHOD);
        methods.methods_incorporate_instance_method(SET_RUNNING, CYBLACK_PORT, $list_alt45, $list_alt664, $list_alt665);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_RUNNING, CYBLACK_PORT_SET_RUNNING_METHOD);
        methods.methods_incorporate_instance_method(IS_CONNECTED_P, CYBLACK_PORT, $list_alt45, NIL, $list_alt669);
        methods.subloop_register_instance_method(CYBLACK_PORT, IS_CONNECTED_P, CYBLACK_PORT_IS_CONNECTED_P_METHOD);
        methods.methods_incorporate_instance_method(SET_CONNECTED, CYBLACK_PORT, $list_alt45, $list_alt664, $list_alt673);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_CONNECTED, CYBLACK_PORT_SET_CONNECTED_METHOD);
        methods.methods_incorporate_instance_method(HARVEST_INPUT, CYBLACK_PORT, $list_alt45, NIL, $list_alt677);
        methods.subloop_register_instance_method(CYBLACK_PORT, HARVEST_INPUT, CYBLACK_PORT_HARVEST_INPUT_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_MESSAGE_QUEUE, CYBLACK_PORT, $list_alt52, NIL, $list_alt682);
        methods.subloop_register_instance_method(CYBLACK_PORT, GET_INCOMING_MESSAGE_QUEUE, CYBLACK_PORT_GET_INCOMING_MESSAGE_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_INCOMING_MESSAGE_QUEUE, CYBLACK_PORT, $list_alt45, $list_alt685, $list_alt686);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_INCOMING_MESSAGE_QUEUE, CYBLACK_PORT_SET_INCOMING_MESSAGE_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTGOING_MESSAGE_QUEUE, CYBLACK_PORT, $list_alt52, NIL, $list_alt691);
        methods.subloop_register_instance_method(CYBLACK_PORT, GET_OUTGOING_MESSAGE_QUEUE, CYBLACK_PORT_GET_OUTGOING_MESSAGE_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_OUTGOING_MESSAGE_QUEUE, CYBLACK_PORT, $list_alt45, $list_alt685, $list_alt694);
        methods.subloop_register_instance_method(CYBLACK_PORT, SET_OUTGOING_MESSAGE_QUEUE, CYBLACK_PORT_SET_OUTGOING_MESSAGE_QUEUE_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_CURRENT_PORT_STATE, $list_alt698);
        methods.methods_incorporate_instance_method(SPAWN_INPUT_HARVESTER, CYBLACK_PORT, $list_alt45, NIL, $list_alt711);
        methods.subloop_register_instance_method(CYBLACK_PORT, SPAWN_INPUT_HARVESTER, CYBLACK_PORT_SPAWN_INPUT_HARVESTER_METHOD);
        classes.subloop_new_class(CYBLACK_PORT_MANAGER, CYBLACK_OBJECT, NIL, NIL, $list_alt718);
        classes.class_set_implements_slot_listeners(CYBLACK_PORT_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PORT_MANAGER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PORT_MANAGER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_INSTANCE);
        subloop_reserved_initialize_cyblack_port_manager_class(CYBLACK_PORT_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PORT_MANAGER, $list_alt39, NIL, $list_alt726);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, INITIALIZE, CYBLACK_PORT_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt46, $list_alt730);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, PRINT, CYBLACK_PORT_MANAGER_PRINT_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt65, $list_alt732);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SET_APPLICATION, CYBLACK_PORT_MANAGER_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt741);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, GET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_PORT_MANAGER_GET_KNOWLEDGE_SOURCE_BATTERY_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER, CYBLACK_PORT_MANAGER, $list_alt52, NIL, $list_alt747);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, GET_MESSAGE_BROKER, CYBLACK_PORT_MANAGER_GET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGE_BROKER, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt750, $list_alt751);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SET_MESSAGE_BROKER, CYBLACK_PORT_MANAGER_SET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(SET_QUEUES, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt759, $list_alt760);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SET_QUEUES, CYBLACK_PORT_MANAGER_SET_QUEUES_METHOD);
        methods.methods_incorporate_instance_method(RETRIEVE_PORT, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt765, $list_alt766);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, RETRIEVE_PORT, CYBLACK_PORT_MANAGER_RETRIEVE_PORT_METHOD);
        methods.methods_incorporate_instance_method(PORT_GIVEN_INPUT_STREAM, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt594, $list_alt771);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, PORT_GIVEN_INPUT_STREAM, CYBLACK_PORT_MANAGER_PORT_GIVEN_INPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(PORT_GIVEN_OUTPUT_STREAM, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt594, $list_alt775);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, PORT_GIVEN_OUTPUT_STREAM, CYBLACK_PORT_MANAGER_PORT_GIVEN_OUTPUT_STREAM_METHOD);
        methods.methods_incorporate_instance_method(CLOSE_ALL_PORTS, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt779);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, CLOSE_ALL_PORTS, CYBLACK_PORT_MANAGER_CLOSE_ALL_PORTS_METHOD);
        methods.methods_incorporate_instance_method(ADD_PORT, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt785, $list_alt786);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, ADD_PORT, CYBLACK_PORT_MANAGER_ADD_PORT_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_PORT, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt765, $list_alt791);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, REMOVE_PORT, CYBLACK_PORT_MANAGER_REMOVE_PORT_METHOD);
        methods.methods_incorporate_instance_method(INVITE_KNOWLEDGE_SOURCE, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt796, $list_alt797);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, INVITE_KNOWLEDGE_SOURCE, CYBLACK_PORT_MANAGER_INVITE_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(ROUTE_OUTGOING_MESSAGE, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt249, $list_alt801);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, ROUTE_OUTGOING_MESSAGE, CYBLACK_PORT_MANAGER_ROUTE_OUTGOING_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(ALL_PORTS_ARE_CONNECTED_P, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt807);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, ALL_PORTS_ARE_CONNECTED_P, CYBLACK_PORT_MANAGER_ALL_PORTS_ARE_CONNECTED_P_METHOD);
        methods.methods_incorporate_instance_method(ALL_PORTS_WHICH_ARE_NOT_CONNECTED, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt811);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, ALL_PORTS_WHICH_ARE_NOT_CONNECTED, CYBLACK_PORT_MANAGER_ALL_PORTS_WHICH_ARE_NOT_CONNECTED_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_QUEUE, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt815);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, GET_INCOMING_QUEUE, CYBLACK_PORT_MANAGER_GET_INCOMING_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_INCOMING_QUEUE, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt820, $list_alt821);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SET_INCOMING_QUEUE, CYBLACK_PORT_MANAGER_SET_INCOMING_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTGOING_QUEUE, CYBLACK_PORT_MANAGER, $list_alt52, NIL, $list_alt826);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, GET_OUTGOING_QUEUE, CYBLACK_PORT_MANAGER_GET_OUTGOING_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_OUTGOING_QUEUE, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt829, $list_alt830);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SET_OUTGOING_QUEUE, CYBLACK_PORT_MANAGER_SET_OUTGOING_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(HARVEST_INPUT, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt834);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, HARVEST_INPUT, CYBLACK_PORT_MANAGER_HARVEST_INPUT_METHOD);
        methods.methods_incorporate_instance_method(SPAWN_INPUT_HARVESTERS, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt838);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, SPAWN_INPUT_HARVESTERS, CYBLACK_PORT_MANAGER_SPAWN_INPUT_HARVESTERS_METHOD);
        methods.methods_incorporate_instance_method(ALL_PORTS_CONNECTED_P, CYBLACK_PORT_MANAGER, $list_alt45, NIL, $list_alt842);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, ALL_PORTS_CONNECTED_P, CYBLACK_PORT_MANAGER_ALL_PORTS_CONNECTED_P_METHOD);
        methods.methods_incorporate_instance_method(WAIT_UNTIL_ALL_PORTS_CONNECTED_P, CYBLACK_PORT_MANAGER, $list_alt45, $list_alt846, $list_alt847);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER, WAIT_UNTIL_ALL_PORTS_CONNECTED_P, CYBLACK_PORT_MANAGER_WAIT_UNTIL_ALL_PORTS_CONNECTED_P_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_CURRENT_PORT_MANAGER_STATE, $list_alt698);
        classes.subloop_new_class(CYBLACK_SESSION_QUEUE, ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, $list_alt862);
        classes.class_set_implements_slot_listeners(CYBLACK_SESSION_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SESSION_QUEUE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SESSION_QUEUE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_QUEUE_INSTANCE);
        subloop_reserved_initialize_cyblack_session_queue_class(CYBLACK_SESSION_QUEUE);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, CYBLACK_SESSION_QUEUE, $list_alt45, $list_alt872, $list_alt873);
        methods.subloop_register_instance_method(CYBLACK_SESSION_QUEUE, ON_ENQUEUE, CYBLACK_SESSION_QUEUE_ON_ENQUEUE_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_PORT_MANAGER_COMMAND_TYPE, $list_alt875);
        classes.subloop_new_class(CYBLACK_SESSION_CONNECTION, CYBLACK_OBJECT, NIL, NIL, $list_alt911);
        classes.class_set_implements_slot_listeners(CYBLACK_SESSION_CONNECTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SESSION_CONNECTION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CONNECTION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SESSION_CONNECTION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CONNECTION_INSTANCE);
        subloop_reserved_initialize_cyblack_session_connection_class(CYBLACK_SESSION_CONNECTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SESSION_CONNECTION, $list_alt39, NIL, $list_alt915);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, INITIALIZE, CYBLACK_SESSION_CONNECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_SESSION_CONNECTION, $list_alt52, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, GET_APPLICATION, CYBLACK_SESSION_CONNECTION_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, SET_APPLICATION, CYBLACK_SESSION_CONNECTION_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER, CYBLACK_SESSION_CONNECTION, $list_alt39, NIL, $list_alt921);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, GET_MESSAGE_BROKER, CYBLACK_SESSION_CONNECTION_GET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(GET_SESSION_ID, CYBLACK_SESSION_CONNECTION, $list_alt52, NIL, $list_alt225);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, GET_SESSION_ID, CYBLACK_SESSION_CONNECTION_GET_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_SESSION_ID, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt927, $list_alt928);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, SET_SESSION_ID, CYBLACK_SESSION_CONNECTION_SET_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_MESSAGE, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt933, $list_alt934);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, EXTERNALIZE_MESSAGE, CYBLACK_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(EXTERNALIZE_MESSAGE_INTERNAL, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt939, $list_alt940);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, EXTERNALIZE_MESSAGE_INTERNAL, CYBLACK_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(INTERNALIZE_MESSAGE, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt939, $list_alt943);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, INTERNALIZE_MESSAGE, CYBLACK_SESSION_CONNECTION_INTERNALIZE_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(READ_EXTERNAL_MESSAGE, CYBLACK_SESSION_CONNECTION, $list_alt39, NIL, $list_alt946);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, READ_EXTERNAL_MESSAGE, CYBLACK_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(READ_EXTERNAL_MESSAGE_RAW, CYBLACK_SESSION_CONNECTION, $list_alt39, NIL, $list_alt949);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, READ_EXTERNAL_MESSAGE_RAW, CYBLACK_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_RAW_METHOD);
        methods.methods_incorporate_instance_method(PROCESS_INCOMING_MESSAGES, CYBLACK_SESSION_CONNECTION, $list_alt45, $list_alt952, $list_alt953);
        methods.subloop_register_instance_method(CYBLACK_SESSION_CONNECTION, PROCESS_INCOMING_MESSAGES, CYBLACK_SESSION_CONNECTION_PROCESS_INCOMING_MESSAGES_METHOD);
        classes.subloop_new_class(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, CYBLACK_SESSION_CONNECTION, NIL, NIL, $list_alt956);
        classes.class_set_implements_slot_listeners(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $sym957$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUEUE_BASED_SESSION_CONNECTIO);
        classes.subloop_note_instance_initialization_function(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $sym958$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUEUE_BASED_SESSION_CONNECTIO);
        subloop_reserved_initialize_cyblack_queue_based_session_connection_class(CYBLACK_QUEUE_BASED_SESSION_CONNECTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt39, NIL, $list_alt959);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, INITIALIZE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, $list_alt65, $list_alt577);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, SET_APPLICATION, CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_MESSAGE_QUEUE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, NIL, $list_alt964);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, GET_INCOMING_MESSAGE_QUEUE, $sym967$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_GET_INCOMING_MESSAGE_QUEUE);
        methods.methods_incorporate_instance_method(SET_INCOMING_MESSAGE_QUEUE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, $list_alt968, $list_alt969);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, SET_INCOMING_MESSAGE_QUEUE, $sym971$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_INCOMING_MESSAGE_QUEUE);
        methods.methods_incorporate_instance_method(GET_OUTGOING_MESSAGE_QUEUE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt52, NIL, $list_alt691);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, GET_OUTGOING_MESSAGE_QUEUE, $sym972$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_GET_OUTGOING_MESSAGE_QUEUE);
        methods.methods_incorporate_instance_method(SET_OUTGOING_MESSAGE_QUEUE, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, $list_alt973, $list_alt974);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, SET_OUTGOING_MESSAGE_QUEUE, $sym976$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_OUTGOING_MESSAGE_QUEUE);
        methods.methods_incorporate_instance_method(INCOMING_MESSAGES_AVAILABLE_P, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, NIL, $list_alt978);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, INCOMING_MESSAGES_AVAILABLE_P, $sym980$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_INCOMING_MESSAGES_AVAILABL);
        methods.methods_incorporate_instance_method(OUTGOING_MESSAGES_AVAILABLE_P, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, NIL, $list_alt982);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, OUTGOING_MESSAGES_AVAILABLE_P, $sym984$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_OUTGOING_MESSAGES_AVAILABL);
        methods.methods_incorporate_instance_method(EXTERNALIZE_MESSAGE_INTERNAL, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, $list_alt939, $list_alt985);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, EXTERNALIZE_MESSAGE_INTERNAL, $sym987$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_INTERN);
        methods.methods_incorporate_instance_method(READ_EXTERNAL_MESSAGE_RAW, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt39, NIL, $list_alt988);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, READ_EXTERNAL_MESSAGE_RAW, $sym990$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_RAW_);
        methods.methods_incorporate_instance_method(PROCESS_INCOMING_MESSAGES, CYBLACK_QUEUE_BASED_SESSION_CONNECTION, $list_alt45, $list_alt952, $list_alt991);
        methods.subloop_register_instance_method(CYBLACK_QUEUE_BASED_SESSION_CONNECTION, PROCESS_INCOMING_MESSAGES, $sym997$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_PROCESS_INCOMING_MESSAGES_);
        classes.subloop_new_class(CYBLACK_EXTERNAL_CONNECTION, CYBLACK_OBJECT, NIL, NIL, $list_alt999);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_CONNECTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_CONNECTION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_CONNECTION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_CONNECTION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_CONNECTION_INSTANCE);
        subloop_reserved_initialize_cyblack_external_connection_class(CYBLACK_EXTERNAL_CONNECTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_CONNECTION, $list_alt39, NIL, $list_alt1003);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, INITIALIZE, CYBLACK_EXTERNAL_CONNECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_EXTERNAL_CONNECTION, $list_alt52, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, GET_APPLICATION, CYBLACK_EXTERNAL_CONNECTION_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_EXTERNAL_CONNECTION, $list_alt45, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, SET_APPLICATION, CYBLACK_EXTERNAL_CONNECTION_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(REGISTER_SESSION_CONNECTION, CYBLACK_EXTERNAL_CONNECTION, $list_alt45, $list_alt1010, $list_alt1011);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, REGISTER_SESSION_CONNECTION, CYBLACK_EXTERNAL_CONNECTION_REGISTER_SESSION_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(READ_EXTERNAL_MESSAGE, CYBLACK_EXTERNAL_CONNECTION, $list_alt45, $list_alt1017, $list_alt1018);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, READ_EXTERNAL_MESSAGE, CYBLACK_EXTERNAL_CONNECTION_READ_EXTERNAL_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(WRITE_EXTERNAL_MESSAGE, CYBLACK_EXTERNAL_CONNECTION, $list_alt45, $list_alt1025, $list_alt1026);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_CONNECTION, WRITE_EXTERNAL_MESSAGE, CYBLACK_EXTERNAL_CONNECTION_WRITE_EXTERNAL_MESSAGE_METHOD);
        classes.subloop_new_class(CYBLACK_STANDARD_EXTERNAL_CONNECTION, CYBLACK_EXTERNAL_CONNECTION, NIL, NIL, $list_alt1031);
        classes.class_set_implements_slot_listeners(CYBLACK_STANDARD_EXTERNAL_CONNECTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_STANDARD_EXTERNAL_CONNECTION, $sym1033$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STANDARD_EXTERNAL_CONNECTION_);
        classes.subloop_note_instance_initialization_function(CYBLACK_STANDARD_EXTERNAL_CONNECTION, $sym1034$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STANDARD_EXTERNAL_CONNECTION_);
        subloop_reserved_initialize_cyblack_standard_external_connection_class(CYBLACK_STANDARD_EXTERNAL_CONNECTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_STANDARD_EXTERNAL_CONNECTION, $list_alt39, NIL, $list_alt1035);
        methods.subloop_register_instance_method(CYBLACK_STANDARD_EXTERNAL_CONNECTION, INITIALIZE, CYBLACK_STANDARD_EXTERNAL_CONNECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SESSION_CONNECTION, CYBLACK_STANDARD_EXTERNAL_CONNECTION, $list_alt52, NIL, $list_alt1039);
        methods.subloop_register_instance_method(CYBLACK_STANDARD_EXTERNAL_CONNECTION, GET_SESSION_CONNECTION, $sym1040$CYBLACK_STANDARD_EXTERNAL_CONNECTION_GET_SESSION_CONNECTION_METHO);
        methods.methods_incorporate_instance_method(ASSIGN_MESSAGE_BROKER, CYBLACK_STANDARD_EXTERNAL_CONNECTION, NIL, $list_alt750, $list_alt1042);
        methods.subloop_register_instance_method(CYBLACK_STANDARD_EXTERNAL_CONNECTION, ASSIGN_MESSAGE_BROKER, CYBLACK_STANDARD_EXTERNAL_CONNECTION_ASSIGN_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(GET_SESSION_ID, CYBLACK_STANDARD_EXTERNAL_CONNECTION, $list_alt52, NIL, $list_alt225);
        methods.subloop_register_instance_method(CYBLACK_STANDARD_EXTERNAL_CONNECTION, GET_SESSION_ID, CYBLACK_STANDARD_EXTERNAL_CONNECTION_GET_SESSION_ID_METHOD);
        tcp_server_utilities.register_tcp_server_type($CYBLACK_NEW, CYBLACK_NEW_SERVER_HANDLER, $TEXT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Port_Manager_Connect_Lock = makeString("Port Manager Connect Lock");

    static private final SubLList $list_alt1 = list(list(makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));



    static private final SubLList $list_alt3 = list(makeSymbol("*CYBLACK-PORT-MANAGER-CONNECT-LOCK*"));





    public static final SubLSymbol $cyblack_port_manager_connect_target_application$ = makeSymbol("*CYBLACK-PORT-MANAGER-CONNECT-TARGET-APPLICATION*");

    static private final SubLString $str_alt7$__ = makeString("  ");

    static private final SubLList $list_alt8 = list($QUIT, makeKeyword("Q"));

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_TYPE = makeSymbol("CYBLACK-SERVER-COMMAND-TYPE");

    static private final SubLString $str_alt10$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_SERVER_COMMAND_TYPE = makeSymbol("ENCODE-CYBLACK-SERVER-COMMAND-TYPE");

    static private final SubLString $str_alt12$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_SERVER_COMMAND_TYPE = makeSymbol("DECODE-CYBLACK-SERVER-COMMAND-TYPE");

    static private final SubLString $str_alt14$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_TYPE_P = makeSymbol("CYBLACK-SERVER-COMMAND-TYPE-P");

    static private final SubLString $str_alt16$CYBLACK_ENQUEUE_SERVER_COMMAND___ = makeString("CYBLACK-ENQUEUE-SERVER-COMMAND: ~S is not a legal server command.");

    static private final SubLString $str_alt17$__Enqueuing_server_command___S = makeString("~%Enqueuing server command: ~S");





    static private final SubLList $list_alt20 = list(makeKeyword("APPLICATION"), makeKeyword("SESSION"), makeKeyword("PROPOSAL"), makeKeyword("TRANSACTION"), makeKeyword("EXTERNAL-MODULE"));

    private static final SubLSymbol CYBLACK_EXTRA_MESSAGE_USAGE_TYPE = makeSymbol("CYBLACK-EXTRA-MESSAGE-USAGE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_EXTRA_MESSAGE_USAGE_TYPE = makeSymbol("ENCODE-CYBLACK-EXTRA-MESSAGE-USAGE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_EXTRA_MESSAGE_USAGE_TYPE = makeSymbol("DECODE-CYBLACK-EXTRA-MESSAGE-USAGE-TYPE");

    private static final SubLSymbol CYBLACK_EXTRA_MESSAGE_USAGE_TYPE_P = makeSymbol("CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-P");





    static private final SubLList $list_alt27 = list(new SubLObject[]{ list(makeSymbol("GUID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("USAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REFERENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GUID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GUID"), list(makeSymbol("NEW-GUID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGES"), list(makeSymbol("NEW-MESSAGES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MESSAGE"), list(makeSymbol("NEW-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MESSAGE"), list(makeSymbol("OLD-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-MESSAGES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-MESSAGES-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-MESSAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-USAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-USAGE"), list(makeSymbol("NEW-USAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFERENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REFERENCE"), list(makeSymbol("NEW-REFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER)), makeKeyword("PUBLIC")) });













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_INFO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-INFO-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_INFO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-INFO-INSTANCE");



    static private final SubLList $list_alt39 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MESSAGES"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-END-POINTER-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("USAGE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");



    private static final SubLSymbol CYBLACK_GUID_INFO_INITIALIZE_METHOD = makeSymbol("CYBLACK-GUID-INFO-INITIALIZE-METHOD");



    static private final SubLList $list_alt45 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt46 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-GUID-INFO(~S, ~S)>"), makeSymbol("GUID"), makeSymbol("USAGE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt49$__CYBLACK_GUID_INFO__S___S__ = makeString("#<CYBLACK-GUID-INFO(~S, ~S)>");

    private static final SubLSymbol CYBLACK_GUID_INFO_PRINT_METHOD = makeSymbol("CYBLACK-GUID-INFO-PRINT-METHOD");



    static private final SubLList $list_alt52 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt53 = list(list(RET, makeSymbol("GUID")));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_GUID_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-GUID-METHOD");

    private static final SubLSymbol SET_GUID = makeSymbol("SET-GUID");

    static private final SubLList $list_alt56 = list(makeSymbol("NEW-GUID"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-GUID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-GUID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-GUID"))), makeString("(SET-GUID ~S): ~S is not a valid GUID."), makeSymbol("SELF"), makeSymbol("NEW-GUID")), list(makeSymbol("PIF"), list(makeSymbol("GUID-P"), makeSymbol("NEW-GUID")), list(makeSymbol("CSETQ"), makeSymbol("GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-GUID"))), list(makeSymbol("CSETQ"), makeSymbol("GUID"), makeSymbol("NEW-GUID"))), list(RET, makeSymbol("NEW-GUID")));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt59$_SET_GUID__S____S_is_not_a_valid_ = makeString("(SET-GUID ~S): ~S is not a valid GUID.");

    private static final SubLSymbol CYBLACK_GUID_INFO_SET_GUID_METHOD = makeSymbol("CYBLACK-GUID-INFO-SET-GUID-METHOD");



    static private final SubLList $list_alt62 = list(list(RET, makeSymbol("APPLICATION")));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-APPLICATION-METHOD");



    static private final SubLList $list_alt65 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt68$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.");

    private static final SubLSymbol CYBLACK_GUID_INFO_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-GUID-INFO-SET-APPLICATION-METHOD");

    private static final SubLSymbol GET_MESSAGES = makeSymbol("GET-MESSAGES");

    static private final SubLList $list_alt71 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("MESSAGES")), list(RET, NIL), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("MESSAGES")))));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_MESSAGES_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-MESSAGES-METHOD");

    private static final SubLSymbol SET_MESSAGES = makeSymbol("SET-MESSAGES");

    static private final SubLList $list_alt74 = list(makeSymbol("NEW-MESSAGES"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("LISTP"), makeSymbol("NEW-MESSAGES")), list(makeSymbol("BASIC-END-POINTER-LIST-P"), makeSymbol("NEW-MESSAGES"))), makeString("(SET-MESSAGES ~S): ~S is neither a list nor an instance of BASIC-END-POINTER-LIST."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGES")), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("NEW-MESSAGES")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGES"), NIL)), list(list(makeSymbol("CONSP"), makeSymbol("NEW-MESSAGES")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-END-POINTER-LIST")), list(QUOTE, makeSymbol("BASIC-END-POINTER-LIST")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("MESSAGES"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-MESSAGES")))), list(list(makeSymbol("BASIC-END-POINTER-LIST-P"), makeSymbol("NEW-MESSAGES")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGES"), makeSymbol("NEW-MESSAGES")))), list(RET, makeSymbol("NEW-MESSAGES")));

    static private final SubLSymbol $sym76$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt77$_SET_MESSAGES__S____S_is_neither_ = makeString("(SET-MESSAGES ~S): ~S is neither a list nor an instance of BASIC-END-POINTER-LIST.");

    private static final SubLSymbol CYBLACK_GUID_INFO_SET_MESSAGES_METHOD = makeSymbol("CYBLACK-GUID-INFO-SET-MESSAGES-METHOD");

    private static final SubLSymbol ADD_MESSAGE = makeSymbol("ADD-MESSAGE");

    static private final SubLList $list_alt80 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt81 = list(makeSymbol("NEW-MESSAGE"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), makeString("(ADD-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("REFERENCE-TO-MESSAGES"), list(makeSymbol("GET-CYBLACK-GUID-INFO-MESSAGES"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("REFERENCE-TO-MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("REFERENCE-TO-MESSAGES"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("SET-MESSAGES"), makeSymbol("SELF"), list(makeSymbol("LIST"), makeSymbol("NEW-MESSAGE"))))), list(RET, makeSymbol("NEW-MESSAGE")));

    static private final SubLString $str_alt83$_ADD_MESSAGE__S____S_is_not_an_in = makeString("(ADD-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    private static final SubLSymbol CYBLACK_GUID_INFO_ADD_MESSAGE_METHOD = makeSymbol("CYBLACK-GUID-INFO-ADD-MESSAGE-METHOD");

    private static final SubLSymbol REMOVE_MESSAGE = makeSymbol("REMOVE-MESSAGE");

    static private final SubLList $list_alt86 = list(makeSymbol("OLD-MESSAGE"));

    static private final SubLList $list_alt87 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("OLD-MESSAGE")), makeString("(REMOVE-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("OLD-MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("REFERENCE-TO-MESSAGES"), list(makeSymbol("GET-CYBLACK-GUID-INFO-MESSAGES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("REFERENCE-TO-MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("REFERENCE-TO-MESSAGES"), makeSymbol("OLD-MESSAGE")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("REFERENCE-TO-MESSAGES")), list(makeSymbol("SET-MESSAGES"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("OLD-MESSAGE")));

    static private final SubLString $str_alt88$_REMOVE_MESSAGE__S____S_is_not_an = makeString("(REMOVE-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    private static final SubLSymbol CYBLACK_GUID_INFO_REMOVE_MESSAGE_METHOD = makeSymbol("CYBLACK-GUID-INFO-REMOVE-MESSAGE-METHOD");

    private static final SubLSymbol CLEAR_MESSAGES = makeSymbol("CLEAR-MESSAGES");

    static private final SubLList $list_alt91 = list(list(makeSymbol("CSETQ"), makeSymbol("MESSAGES"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym92$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    private static final SubLSymbol CYBLACK_GUID_INFO_CLEAR_MESSAGES_METHOD = makeSymbol("CYBLACK-GUID-INFO-CLEAR-MESSAGES-METHOD");

    private static final SubLSymbol EMPTY_MESSAGES_P = makeSymbol("EMPTY-MESSAGES-P");

    static private final SubLList $list_alt95 = list(list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("MESSAGES")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("MESSAGES")))));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    private static final SubLSymbol CYBLACK_GUID_INFO_EMPTY_MESSAGES_P_METHOD = makeSymbol("CYBLACK-GUID-INFO-EMPTY-MESSAGES-P-METHOD");

    private static final SubLSymbol GET_LAST_MESSAGE = makeSymbol("GET-LAST-MESSAGE");

    static private final SubLList $list_alt99 = list(list(makeSymbol("PWHEN"), makeSymbol("MESSAGES"), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("MESSAGES")), list(RET, NIL), list(RET, list(makeSymbol("CAR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-END-POINTER"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("MESSAGES")))))));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_LAST_MESSAGE_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-LAST-MESSAGE-METHOD");

    private static final SubLSymbol GET_USAGE = makeSymbol("GET-USAGE");

    static private final SubLList $list_alt102 = list(list(RET, makeSymbol("USAGE")));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_USAGE_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-USAGE-METHOD");

    private static final SubLSymbol SET_USAGE = makeSymbol("SET-USAGE");

    static private final SubLList $list_alt105 = list(makeSymbol("NEW-USAGE"));

    static private final SubLList $list_alt106 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-USAGE")), list(makeSymbol("CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-P"), makeSymbol("NEW-USAGE")), list(makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE-P"), makeSymbol("NEW-USAGE"))), makeString("(SET-USAGE ~S): ~S is not a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-USAGE")), list(makeSymbol("CSETQ"), makeSymbol("USAGE"), makeSymbol("NEW-USAGE")), list(RET, makeSymbol("NEW-USAGE")));

    static private final SubLSymbol $sym107$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt108$_SET_USAGE__S____S_is_not_a_membe = makeString("(SET-USAGE ~S): ~S is not a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_GUID_INFO_SET_USAGE_METHOD = makeSymbol("CYBLACK-GUID-INFO-SET-USAGE-METHOD");



    static private final SubLList $list_alt111 = list(list(RET, makeSymbol("REFERENCE")));

    private static final SubLSymbol CYBLACK_GUID_INFO_GET_REFERENCE_METHOD = makeSymbol("CYBLACK-GUID-INFO-GET-REFERENCE-METHOD");

    private static final SubLSymbol SET_REFERENCE = makeSymbol("SET-REFERENCE");

    static private final SubLList $list_alt114 = list(makeSymbol("NEW-REFERENCE"));

    static private final SubLList $list_alt115 = list(list(makeSymbol("CSETQ"), makeSymbol("REFERENCE"), makeSymbol("NEW-REFERENCE")), list(RET, makeSymbol("NEW-REFERENCE")));

    static private final SubLSymbol $sym116$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    private static final SubLSymbol CYBLACK_GUID_INFO_SET_REFERENCE_METHOD = makeSymbol("CYBLACK-GUID-INFO-SET-REFERENCE-METHOD");

    private static final SubLSymbol DESCRIBE = makeSymbol("DESCRIBE");

    static private final SubLList $list_alt119 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER));

    static private final SubLList $list_alt120 = list(new SubLObject[]{ list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("CYBLACK-GUID-INFO: ~S~%"), makeSymbol("GUID")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("DEPTH"), ONE_INTEGER)), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("messages -> ~S"), makeSymbol("MESSAGES")), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("DEPTH"), ONE_INTEGER)), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("usage -> ~S"), makeSymbol("USAGE")), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("DEPTH"), ONE_INTEGER)), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("reference -> ~S"), makeSymbol("REFERENCE")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym121$OUTER_CATCH_FOR_CYBLACK_GUID_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-INFO-METHOD");

    static private final SubLString $str_alt122$__ = makeString("~%");

    static private final SubLString $str_alt123$CYBLACK_GUID_INFO___S__ = makeString("CYBLACK-GUID-INFO: ~S~%");

    static private final SubLString $str_alt124$messages_____S = makeString("messages -> ~S");

    static private final SubLString $str_alt125$usage_____S = makeString("usage -> ~S");

    static private final SubLString $str_alt126$reference_____S = makeString("reference -> ~S");

    private static final SubLSymbol CYBLACK_GUID_INFO_DESCRIBE_METHOD = makeSymbol("CYBLACK-GUID-INFO-DESCRIBE-METHOD");

    public static final SubLInteger $int$500 = makeInteger(500);



    static private final SubLList $list_alt130 = list(new SubLObject[]{ list(makeSymbol("APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GUID-HASHTABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REFERENCE-HASHTABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERN"), list(makeSymbol("GUID-AS-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("USAGE"), NIL), list(makeSymbol("REFERENCE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE"), list(makeSymbol("USAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("REFERENCE"), NIL), list(makeSymbol("APRIORI-ID"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-USE"), list(makeSymbol("GUID-AS-STRING"), makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPUNGE-USE"), list(makeSymbol("GUID-AS-STRING"), makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-USAGE"), list(makeSymbol("GUID-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGES"), list(makeSymbol("GUID-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-MESSAGE"), list(makeSymbol("GUID-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRUE-GUID"), list(makeSymbol("GUID-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GUID-INFO"), list(makeSymbol("GUID-AS-STRING-OR-REFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFERENCE"), list(makeSymbol("GUID-AS-STRING-OR-REFERENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER))) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-MANAGER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GUID_MANAGER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GUID-MANAGER-INSTANCE");

    static private final SubLList $list_alt135 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("GUID-HASHTABLE"), list(makeSymbol("MAKE-HASH-TABLE"), makeSymbol("*CYBLACK-MESSAGE-INITIAL-MANAGER-TABLE-SIZE*"), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("CLRHASH"), makeSymbol("GUID-HASHTABLE")), list(makeSymbol("CSETQ"), makeSymbol("REFERENCE-HASHTABLE"), list(makeSymbol("MAKE-HASH-TABLE"), makeSymbol("*CYBLACK-MESSAGE-INITIAL-MANAGER-TABLE-SIZE*"), list(makeSymbol("FUNCTION"), EQ))), list(makeSymbol("CLRHASH"), makeSymbol("REFERENCE-HASHTABLE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym136$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_INITIALIZE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-INITIALIZE-METHOD");



    static private final SubLList $list_alt139 = list(makeSymbol("GUID-AS-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("USAGE"), NIL), list(makeSymbol("REFERENCE"), NIL));

    static private final SubLList $list_alt140 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("USAGE")), list(makeSymbol("CYBLACK-EXTRA-MESSAGE-USAGE-TYPE-P"), makeSymbol("USAGE")), list(makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE-P"), makeSymbol("USAGE"))), makeString("(INTERN ~S): ~S is not a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("USAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PIF"), makeSymbol("GUID-INFO"), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), makeSymbol("USAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-USAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"), makeSymbol("USAGE"))), list(makeSymbol("PWHEN"), makeSymbol("REFERENCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REFERENCE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"), makeSymbol("REFERENCE")), list(makeSymbol("SETHASH"), makeSymbol("REFERENCE"), makeSymbol("REFERENCE-HASHTABLE"), makeSymbol("GUID-INFO"))), list(RET, makeSymbol("GUID-AS-STRING"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-GUID-INFO")), list(QUOTE, makeSymbol("CYBLACK-GUID-INFO"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("NEW-INFO"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("NEW-INFO"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-USAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("NEW-INFO"), makeSymbol("USAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REFERENCE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("NEW-INFO"), makeSymbol("REFERENCE")), list(makeSymbol("SETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), makeSymbol("NEW-INFO")), list(makeSymbol("PWHEN"), makeSymbol("REFERENCE"), list(makeSymbol("SETHASH"), makeSymbol("REFERENCE"), makeSymbol("REFERENCE-HASHTABLE"), makeSymbol("NEW-INFO"))), list(RET, makeSymbol("GUID-AS-STRING")) })), list(RET, NIL)));

    static private final SubLSymbol $sym141$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    static private final SubLString $str_alt142$_INTERN__S____S_is_not_a_member_o = makeString("(INTERN ~S): ~S is not a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_INTERN_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-INTERN-METHOD");



    static private final SubLList $list_alt145 = list(makeSymbol("USAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("REFERENCE"), NIL), list(makeSymbol("APRIORI-ID"), NIL));

    static private final SubLList $list_alt146 = list(list(makeSymbol("CLET"), list(list(makeSymbol("AS-STRING"), list(makeSymbol("FIF"), makeSymbol("APRIORI-ID"), makeSymbol("APRIORI-ID"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID"))))), list(makeSymbol("OLD-INFO"), list(makeSymbol("GETHASH"), makeSymbol("AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL)), list(makeSymbol("INFO"), list(makeSymbol("FIF"), makeSymbol("OLD-INFO"), makeSymbol("OLD-INFO"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-GUID-INFO")))))), list(makeSymbol("PUNLESS"), makeSymbol("OLD-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("INFO"), makeSymbol("AS-STRING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("INFO"), makeSymbol("APPLICATION")), list(makeSymbol("SETHASH"), makeSymbol("AS-STRING"), makeSymbol("GUID-HASHTABLE"), makeSymbol("INFO"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-USAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("INFO"), makeSymbol("USAGE")), list(makeSymbol("PWHEN"), makeSymbol("REFERENCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REFERENCE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("INFO"), makeSymbol("REFERENCE"))), list(makeSymbol("PWHEN"), makeSymbol("REFERENCE"), list(makeSymbol("SETHASH"), makeSymbol("REFERENCE"), makeSymbol("REFERENCE-HASHTABLE"), makeSymbol("INFO"))), list(RET, makeSymbol("AS-STRING"))));

    static private final SubLSymbol $sym147$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_ALLOCATE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-ALLOCATE-METHOD");



    static private final SubLList $list_alt150 = list(makeSymbol("GUID-AS-STRING"), makeSymbol("MESSAGE"));

    static private final SubLList $list_alt151 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(RECORD-USE ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(RECORD-USE ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-MESSAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"), makeSymbol("MESSAGE")))), list(RET, makeSymbol("MESSAGE")));

    static private final SubLSymbol $sym152$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    static private final SubLString $str_alt153$_RECORD_USE__S____S_is_not_a_stri = makeString("(RECORD-USE ~S): ~S is not a string.");

    static private final SubLString $str_alt154$_RECORD_USE__S____S_is_not_an_ins = makeString("(RECORD-USE ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_RECORD_USE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-RECORD-USE-METHOD");

    private static final SubLSymbol EXPUNGE_USE = makeSymbol("EXPUNGE-USE");

    static private final SubLList $list_alt157 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(RECORD-USE ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(RECORD-USE ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE-MESSAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"), makeSymbol("MESSAGE")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-MESSAGES-P"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE")), NIL)))));

    static private final SubLSymbol $sym158$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_EXPUNGE_USE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-EXPUNGE-USE-METHOD");

    static private final SubLList $list_alt160 = list(makeSymbol("GUID-AS-STRING"));

    static private final SubLList $list_alt161 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(GET-USAGE ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-USAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))))), list(RET, NIL));

    static private final SubLString $str_alt162$_GET_USAGE__S____S_is_not_a_strin = makeString("(GET-USAGE ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_USAGE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-USAGE-METHOD");

    static private final SubLList $list_alt164 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(GET-MESSAGES ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MESSAGES"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))))), list(RET, NIL));

    static private final SubLString $str_alt165$_GET_MESSAGES__S____S_is_not_a_st = makeString("(GET-MESSAGES ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_MESSAGES_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-MESSAGES-METHOD");

    static private final SubLList $list_alt167 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(GET-LAST-MESSAGE ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE"), NIL))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-LAST-MESSAGE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))))), list(RET, NIL));

    static private final SubLString $str_alt168$_GET_LAST_MESSAGE__S____S_is_not_ = makeString("(GET-LAST-MESSAGE ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_LAST_MESSAGE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-LAST-MESSAGE-METHOD");

    private static final SubLSymbol GET_TRUE_GUID = makeSymbol("GET-TRUE-GUID");

    static private final SubLList $list_alt171 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING")), makeString("(GET-TRUE-GUID ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING")), list(makeSymbol("PWHEN"), makeSymbol("GUID-HASHTABLE"), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING"), makeSymbol("GUID-HASHTABLE")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO")))))), list(RET, NIL));

    static private final SubLString $str_alt172$_GET_TRUE_GUID__S____S_is_not_a_s = makeString("(GET-TRUE-GUID ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_TRUE_GUID_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-TRUE-GUID-METHOD");



    static private final SubLList $list_alt175 = list(makeSymbol("GUID-AS-STRING-OR-REFERENCE"));

    static private final SubLList $list_alt176 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("STRINGP"), makeSymbol("GUID-AS-STRING-OR-REFERENCE")), list(RET, list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING-OR-REFERENCE"), makeSymbol("GUID-HASHTABLE"), NIL))), list(list(makeSymbol("NULL"), makeSymbol("GUID-AS-STRING-OR-REFERENCE")), list(RET, NIL)), list(T, list(RET, list(makeSymbol("GETHASH"), makeSymbol("GUID-AS-STRING-OR-REFERENCE"), makeSymbol("REFERENCE-HASHTABLE"), NIL)))));

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_GUID_INFO_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-GUID-INFO-METHOD");

    static private final SubLList $list_alt178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("SELF"), makeSymbol("GUID-AS-STRING-OR-REFERENCE")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_GUID_MANAGER_GET_REFERENCE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-GET-REFERENCE-METHOD");

    static private final SubLList $list_alt180 = list(list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("Contents of CYBLACK-GUID-MANAGER ~S:"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-DEPTH"), list(makeSymbol("+"), makeSymbol("DEPTH"), ONE_INTEGER))), list(makeSymbol("CDOHASH"), list(makeSymbol("GUID"), makeSymbol("GUID-INFO"), makeSymbol("GUID-HASHTABLE")), list(makeSymbol("IGNORE"), makeSymbol("GUID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DESCRIBE"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"), makeSymbol("STREAM"), makeSymbol("NEW-DEPTH")))), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("CYBLACK-MB-TAB"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("STREAM"), makeString("End Contents of CYBLACK-GUID-MANAGER ~S:"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym181$OUTER_CATCH_FOR_CYBLACK_GUID_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GUID-MANAGER-METHOD");

    static private final SubLString $str_alt182$Contents_of_CYBLACK_GUID_MANAGER_ = makeString("Contents of CYBLACK-GUID-MANAGER ~S:");

    static private final SubLString $str_alt183$End_Contents_of_CYBLACK_GUID_MANA = makeString("End Contents of CYBLACK-GUID-MANAGER ~S:");

    private static final SubLSymbol CYBLACK_GUID_MANAGER_DESCRIBE_METHOD = makeSymbol("CYBLACK-GUID-MANAGER-DESCRIBE-METHOD");





    static private final SubLList $list_alt187 = list(new SubLObject[]{ list(makeSymbol("GUID-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPLICATION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SESSION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-APPLICATION-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-EXTERNAL-CONNECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GUID-MANAGER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GUID-MANAGER"), list(makeSymbol("NEW-GUID-MANAGER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SESSION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SESSION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-TRANSACTION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-MODULE-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-ID"), list(makeSymbol("EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-PROPOSAL-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSOCIATE-COMMON-IDS"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPUNGE-COMMON-IDS"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPUNGE-SPECIFIC-ID"), list(makeSymbol("ID"), makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE"), list(makeSymbol("EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("EXTERNAL-MODULE"), makeSymbol("&OPTIONAL"), list(makeSymbol("ACTIVATIONS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERIFY"), list(makeSymbol("PROPOSAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("ACTIVATIONS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CANCEL"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TERMINATE"), list(makeSymbol("EXTERNAL-MODULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-CONTENTS"), list(makeSymbol("REQUEST-CONTENTS-MESSAGE"), makeSymbol("CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-POSTINGS"), list(makeSymbol("MONITORING-KS"), makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STATE-CHANGE"), list(makeSymbol("EXTERNAL-MODULE"), makeSymbol("EVENT-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("CONTENTS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETREIVE-TRANSACTION-SEQUENCE"), list(makeSymbol("TRANSACTION-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECEIVE"), list(makeSymbol("MESSAGE-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CAUSE"), list(makeSymbol("GUID-STRING-OR-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS-MESSAGES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-GUID-MANAGER"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("DEPTH"), ZERO_INTEGER))) });



    private static final SubLSymbol CACHED_APPLICATION_NAME = makeSymbol("CACHED-APPLICATION-NAME");







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_BROKER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-BROKER-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_BROKER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-BROKER-INSTANCE");

    static private final SubLList $list_alt196 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-GUID-MANAGER")), list(QUOTE, makeSymbol("CYBLACK-GUID-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-ID"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-APPLICATION-NAME"), makeString("")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym197$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt198$ = makeString("");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_INITIALIZE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-INITIALIZE-METHOD");

    private static final SubLSymbol GET_GUID_MANAGER = makeSymbol("GET-GUID-MANAGER");

    static private final SubLList $list_alt201 = list(list(RET, makeSymbol("GUID-MANAGER")));

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_GUID_MANAGER_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD");

    private static final SubLSymbol SET_GUID_MANAGER = makeSymbol("SET-GUID-MANAGER");

    static private final SubLList $list_alt204 = list(makeSymbol("NEW-GUID-MANAGER"));

    static private final SubLList $list_alt205 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-GUID-MANAGER-P"), makeSymbol("NEW-GUID-MANAGER")), makeString("(SET-GUID-MANAGER ~S): ~S is not an instance of CYBLACK-GUID-MANAGER."), makeSymbol("SELF"), makeSymbol("NEW-GUID-MANAGER")), list(makeSymbol("CSETQ"), makeSymbol("GUID-MANAGER"), makeSymbol("NEW-GUID-MANAGER")), list(RET, makeSymbol("NEW-GUID-MANAGER")));

    static private final SubLSymbol $sym206$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt207$_SET_GUID_MANAGER__S____S_is_not_ = makeString("(SET-GUID-MANAGER ~S): ~S is not an instance of CYBLACK-GUID-MANAGER.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_SET_GUID_MANAGER_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-SET-GUID-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt210 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-APPLICATION-NAME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-APPLICATION"), list(QUOTE, makeSymbol("GET-APPLICATION-NAME")))), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("SESSION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-APPLICATION"), list(QUOTE, makeSymbol("GET-CURRENT-SESSION"))))), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("APPLICATION"), makeSymbol("NEW-APPLICATION")))), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");





    private static final SubLSymbol GET_CURRENT_SESSION = makeSymbol("GET-CURRENT-SESSION");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-SET-APPLICATION-METHOD");

    private static final SubLSymbol GET_APPLICATION_ID = makeSymbol("GET-APPLICATION-ID");

    static private final SubLList $list_alt218 = list(list(RET, makeSymbol("APPLICATION-ID")));

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_APPLICATION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-APPLICATION-ID-METHOD");



    static private final SubLList $list_alt221 = list(list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("SESSION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-CURRENT-SESSION")))))), list(RET, makeSymbol("SESSION-ID")));

    static private final SubLSymbol $sym222$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_NEW_SESSION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-NEW-SESSION-ID-METHOD");



    static private final SubLList $list_alt225 = list(list(RET, makeSymbol("SESSION-ID")));

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_SESSION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-SESSION-ID-METHOD");



    static private final SubLList $list_alt228 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TRANSACTION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("TRANSACTION")))), list(RET, makeSymbol("NEW-TRANSACTION-ID"))));

    static private final SubLSymbol $sym229$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol $TRANSACTION = makeKeyword("TRANSACTION");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_NEW_TRANSACTION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-NEW-TRANSACTION-ID-METHOD");



    static private final SubLList $list_alt233 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EXTERNAL-MODULE-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("EXTERNAL-MODULE")))), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-ID"))));

    static private final SubLSymbol $sym234$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol $EXTERNAL_MODULE = makeKeyword("EXTERNAL-MODULE");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_NEW_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-NEW-EXTERNAL-MODULE-ID-METHOD");



    static private final SubLList $list_alt238 = list(makeSymbol("EXTERNAL-MODULE-NAME"));

    static private final SubLList $list_alt239 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-EXTERNAL-MODULE-ID ~S): Cannot get the external module ID for ~S because ~\n     no application is associated with this message broker."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EXTERNAL-MODULE-ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-EXTERNAL-MODULE-ID")), makeSymbol("EXTERNAL-MODULE-NAME")))), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("EXTERNAL-MODULE"), NIL, makeSymbol("NEW-EXTERNAL-MODULE-ID")))));

    static private final SubLSymbol $sym240$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt241$_GET_EXTERNAL_MODULE_ID__S___Cann = makeString("(GET-EXTERNAL-MODULE-ID ~S): Cannot get the external module ID for ~S because ~\n     no application is associated with this message broker.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-EXTERNAL-MODULE-ID-METHOD");

    private static final SubLSymbol NEW_PROPOSAL_ID = makeSymbol("NEW-PROPOSAL-ID");

    static private final SubLList $list_alt244 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-PROPOSAL-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeKeyword("PROPOSAL")))), list(RET, makeSymbol("NEW-PROPOSAL-ID"))));

    static private final SubLSymbol $sym245$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol $PROPOSAL = makeKeyword("PROPOSAL");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_NEW_PROPOSAL_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-NEW-PROPOSAL-ID-METHOD");



    static private final SubLList $list_alt249 = list(makeSymbol("MESSAGE"));

    static private final SubLList $list_alt250 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(ASSOCIATE-COMMON-IDS ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE"))), list(RET, makeSymbol("MESSAGE")));

    static private final SubLSymbol $sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt252$_ASSOCIATE_COMMON_IDS__S____S_is_ = makeString("(ASSOCIATE-COMMON-IDS ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_ASSOCIATE_COMMON_IDS_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-ASSOCIATE-COMMON-IDS-METHOD");

    private static final SubLSymbol EXPUNGE_COMMON_IDS = makeSymbol("EXPUNGE-COMMON-IDS");

    static private final SubLList $list_alt255 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(ASSOCIATE-COMMON-IDS ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPUNGE-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPUNGE-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPUNGE-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE"))), list(RET, makeSymbol("MESSAGE")));

    static private final SubLSymbol $sym256$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_EXPUNGE_COMMON_IDS_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-COMMON-IDS-METHOD");

    private static final SubLSymbol EXPUNGE_SPECIFIC_ID = makeSymbol("EXPUNGE-SPECIFIC-ID");

    static private final SubLList $list_alt259 = list(makeSymbol("ID"), makeSymbol("MESSAGE"));

    static private final SubLList $list_alt260 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("GUID-P"), makeSymbol("ID")), list(makeSymbol("STRINGP"), makeSymbol("ID"))), makeString("(EXPUNGE-SPECIFIC-ID ~S): ~S is not a valid GUID."), makeSymbol("SELF"), makeSymbol("ID")), list(makeSymbol("CLET"), list(list(makeSymbol("ID-AS-STRING"), list(makeSymbol("FIF"), list(makeSymbol("GUID-P"), makeSymbol("ID")), list(makeSymbol("GUID-TO-STRING"), makeSymbol("ID")), makeSymbol("ID")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPUNGE-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("ID-AS-STRING"), makeSymbol("MESSAGE")))), list(RET, makeSymbol("ID")));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt262$_EXPUNGE_SPECIFIC_ID__S____S_is_n = makeString("(EXPUNGE-SPECIFIC-ID ~S): ~S is not a valid GUID.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_EXPUNGE_SPECIFIC_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-SPECIFIC-ID-METHOD");



    static private final SubLList $list_alt265 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), list(RET, makeSymbol("CACHED-EXTERNAL-CONNECTION"))), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-EXTERNAL-CONNECTION ~S): Could not retrieve an external connection because no application is associated with this message broker."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-EXTERNAL-CONNECTION"))))), list(makeSymbol("MUST"), makeSymbol("EXTERNAL-CONNECTION"), makeString("(GET-EXTERNAL-CONNECTION ~S): Could not retrieve an external connection because no external connection is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), makeSymbol("EXTERNAL-CONNECTION")), list(RET, makeSymbol("EXTERNAL-CONNECTION"))));

    static private final SubLSymbol $sym266$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt267$_GET_EXTERNAL_CONNECTION__S___Cou = makeString("(GET-EXTERNAL-CONNECTION ~S): Could not retrieve an external connection because no application is associated with this message broker.");

    static private final SubLString $str_alt268$_GET_EXTERNAL_CONNECTION__S___Cou = makeString("(GET-EXTERNAL-CONNECTION ~S): Could not retrieve an external connection because no external connection is associated with the application ~S.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_EXTERNAL_CONNECTION_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol INVITE = makeSymbol("INVITE");

    static private final SubLList $list_alt271 = list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("EMID"), NIL));

    static private final SubLList $list_alt272 = list(list(makeSymbol("IGNORE"), makeSymbol("EMID")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("EXTERNAL-MODULE-NAME")), makeString("(INVITE ~S): External module name ~S is not a string."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(INVITE ~S): No application is associated with this message broker."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("INVITE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-INVITATION-MESSAGE")))), list(makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE-NAME"))), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION-NAME"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("CACHED-APPLICATION-NAME")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("CYBLACK-INVITATION-MESSAGE")), makeSymbol("INVITE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("INVITE-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("INVITE-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }));

    static private final SubLSymbol $sym273$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt274$_INVITE__S___External_module_name = makeString("(INVITE ~S): External module name ~S is not a string.");

    static private final SubLString $str_alt275$_INVITE__S___No_application_is_as = makeString("(INVITE ~S): No application is associated with this message broker.");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_INVITE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-INVITE-METHOD");



    static private final SubLList $list_alt279 = list(makeSymbol("EXTERNAL-MODULE"), makeSymbol("&OPTIONAL"), list(makeSymbol("ACTIVATIONS"), NIL));

    static private final SubLList $list_alt280 = list(list(makeSymbol("MUST"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-MODULE")), makeString("(STIMULATE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE"), list(makeSymbol("EKS-KNOWLEDGE-SOURCE"), makeSymbol("EXTERNAL-MODULE"))), list(makeSymbol("EXTERNAL-MODULE-GUID-ID"), list(makeSymbol("FIF"), makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-GUID-AS-STRING-METHOD"), makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE")), NIL)), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("PROPOSAL-ID"), list(makeSymbol("NEW-PROPOSAL-ID"), makeSymbol("SELF"))), list(makeSymbol("LISTIFIED-ACTIVATIONS"), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ACTIVATIONS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LISTIFY-UNIQUE-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ACTIVATIONS")), NIL)), list(makeSymbol("STIMULATE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-STIMULATE-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-GUID-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("PROPOSAL-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-ARGS"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("LISTIFIED-ACTIVATIONS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("CYBLACK-STIMULATION-MESSAGE")), makeSymbol("STIMULATE-MESSAGE"), makeSymbol("ACTIVATIONS")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("STIMULATE-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL-ID"), makeSymbol("STIMULATE-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("STIMULATE-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }), list(RET, NIL));

    static private final SubLSymbol $sym281$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt282$_STIMULATE__S____S_is_not_an_inst = makeString("(STIMULATE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE = makeSymbol("CYBLACK-STIMULATE-MESSAGE");









    private static final SubLSymbol SET_ACTIVATION_ARGS = makeSymbol("SET-ACTIVATION-ARGS");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_STIMULATE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-STIMULATE-METHOD");

    private static final SubLSymbol VERIFY = makeSymbol("VERIFY");

    static private final SubLList $list_alt292 = list(makeSymbol("PROPOSAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("ACTIVATIONS"), NIL));

    static private final SubLList $list_alt293 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(VERIFY ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-ALREADY-RECONFIRMED-P-METHOD"), makeSymbol("PROPOSAL"))), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-TRANSFER-SELF-FROM-SUSPENDED-TO-ACTIVATED-METHOD"), makeSymbol("PROPOSAL")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(new SubLObject[]{ makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE")))), list(makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("EXTERNAL-MODULE-GUID-INFO")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID-ID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("EXTERNAL-MODULE-GUID")), NIL)), list(makeSymbol("PROPOSAL-GUID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))), list(makeSymbol("PROPOSAL-ID"), list(makeSymbol("FIF"), makeSymbol("PROPOSAL-GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("PROPOSAL-GUID")), NIL)), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("LISTIFIED-ACTIVATIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LISTIFY-UNIQUE-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ACTIVATIONS"))), list(makeSymbol("VERIFY-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-VERIFY-MESSAGE")))) }), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("EXTERNAL-MODULE-GUID-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("PROPOSAL-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-ARGS"), makeSymbol("CYBLACK-VERIFY-MESSAGE")), makeSymbol("VERIFY-MESSAGE"), makeSymbol("LISTIFIED-ACTIVATIONS")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("VERIFY-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL-ID"), makeSymbol("VERIFY-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("VERIFY-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }))), list(RET, NIL));

    static private final SubLSymbol $sym294$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt295$_VERIFY__S____S_is_not_an_instanc = makeString("(VERIFY ~S): ~S is not an instance of CYBLACK-PROPOSAL.");





    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_VERIFY_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-VERIFY-METHOD");

    private static final SubLSymbol CANCEL = makeSymbol("CANCEL");

    static private final SubLList $list_alt300 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt301 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(CANCEL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE")))), list(makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("EXTERNAL-MODULE-GUID-INFO")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID-ID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("EXTERNAL-MODULE-GUID")), NIL)), list(makeSymbol("PROPOSAL-GUID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))), list(makeSymbol("PROPOSAL-ID"), list(makeSymbol("FIF"), makeSymbol("PROPOSAL-GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("PROPOSAL-GUID")), NIL)), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("CANCEL-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-CANCEL-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-CANCEL-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-CANCEL-MESSAGE")), makeSymbol("CANCEL-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-CANCEL-MESSAGE")), makeSymbol("CANCEL-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-CANCEL-MESSAGE")), makeSymbol("CANCEL-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-CANCLE-MESSAGE")), makeSymbol("CANCEL-MESSAGE"), makeSymbol("EXTERNAL-MODULE-GUID-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-CANCEL-MESSAGE")), makeSymbol("CANCEL-MESSAGE"), makeSymbol("PROPOSAL-ID")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("CANCEL-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL-ID"), makeSymbol("CANCEL-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("CANCEL-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }))));

    static private final SubLSymbol $sym302$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt303$_CANCEL__S____S_is_not_an_instanc = makeString("(CANCEL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_CANCEL_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-CANCEL-METHOD");



    static private final SubLList $list_alt307 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(EXECUTE ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE")))), list(makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("EXTERNAL-MODULE-GUID-INFO")), NIL)), list(makeSymbol("EXTERNAL-MODULE-GUID-ID"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("EXTERNAL-MODULE-GUID")), NIL)), list(makeSymbol("PROPOSAL-GUID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO"))), list(makeSymbol("PROPOSAL-ID"), list(makeSymbol("FIF"), makeSymbol("PROPOSAL-GUID"), list(makeSymbol("FIF"), list(makeSymbol("GUID-P"), makeSymbol("PROPOSAL-GUID")), list(makeSymbol("GUID-TO-STRING"), makeSymbol("PROPOSAL-GUID")), makeSymbol("PROPOSAL-GUID")), NIL)), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("EXECUTE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-EXECUTE-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-GUID-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("PROPOSAL-ID")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("EXECUTE-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPOSAL-ID"), makeSymbol("EXECUTE-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("EXECUTE-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }))), list(RET, NIL));

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt309$_EXECUTE__S____S_is_not_an_instan = makeString("(EXECUTE ~S): ~S is not an instance of CYBLACK-PROPOSAL.");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_EXECUTE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-EXECUTE-METHOD");



    static private final SubLList $list_alt313 = list(makeSymbol("EXTERNAL-MODULE"));

    static private final SubLList $list_alt314 = list(list(makeSymbol("MUST"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-MODULE")), makeString("(TERMINATE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE-GUID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO")))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE-GUID"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("FIF"), list(makeSymbol("GUID-P"), makeSymbol("EXTERNAL-MODULE-GUID")), list(makeSymbol("GUID-TO-STRING"), makeSymbol("EXTERNAL-MODULE-GUID")), makeSymbol("EXTERNAL-MODULE-GUID"))), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("TERMINATE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-TERMINATE-MESSAGE")), list(QUOTE, makeSymbol("CYBLACK-TERMINATE-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-TERMINATE-MESSAGE")), makeSymbol("TERMINATE-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-TERMINATE-MESSAGE")), makeSymbol("TERMINATE-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-TERMINATE-MESSAGE")), makeSymbol("TERMINATE-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-TERMINATE-MESSAGE")), makeSymbol("TERMINATE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-ID")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("TERMINATE-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("TERMINATE-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }))))), list(RET, NIL));

    static private final SubLSymbol $sym315$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt316$_TERMINATE__S____S_is_not_an_inst = makeString("(TERMINATE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE.");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_TERMINATE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-TERMINATE-METHOD");

    private static final SubLSymbol REPORT_CONTENTS = makeSymbol("REPORT-CONTENTS");

    static private final SubLList $list_alt320 = list(makeSymbol("REQUEST-CONTENTS-MESSAGE"), makeSymbol("CONTENTS"));

    static private final SubLList $list_alt321 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-P"), makeSymbol("REQUEST-CONTENTS-MESSAGE")), makeString("(REPORT-CONTENTS ~S): ~S is not an instance of CYBLACK-REQUEST-CONTENTS-MESSAGE."), makeSymbol("SELF"), makeSymbol("REQUEST-CONTENTS-MESSAGE")), list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("CONTENTS")), makeString("(REPORT-CONTENTS ~S): ~S is not a list."), makeSymbol("SELF"), makeSymbol("CONTENTS")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("REQUEST-CONTENTS-MESSAGE"))), list(makeSymbol("EMID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("REQUEST-CONTENTS-MESSAGE"))), list(makeSymbol("SESSION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("REQUEST-CONTENTS-MESSAGE"))), list(makeSymbol("TYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE-STRING"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("REQUEST-CONTENTS-MESSAGE"))), list(makeSymbol("REPORT-CONTENTS-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("EMID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TYPE-STRING"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("TYPE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE")), makeSymbol("REPORT-CONTENTS-MESSAGE"), makeSymbol("CONTENTS")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("REPORT-CONTENTS-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("REPORT-CONTENTS-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }));

    static private final SubLSymbol $sym322$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt323$_REPORT_CONTENTS__S____S_is_not_a = makeString("(REPORT-CONTENTS ~S): ~S is not an instance of CYBLACK-REQUEST-CONTENTS-MESSAGE.");

    static private final SubLString $str_alt324$_REPORT_CONTENTS__S____S_is_not_a = makeString("(REPORT-CONTENTS ~S): ~S is not a list.");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_REPORT_CONTENTS_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-REPORT-CONTENTS-METHOD");

    private static final SubLSymbol REPORT_POSTINGS = makeSymbol("REPORT-POSTINGS");

    static private final SubLList $list_alt328 = list(makeSymbol("MONITORING-KS"), makeSymbol("POSTING"));

    static private final SubLList $list_alt329 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("MONITORING-KS")), makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-MONITORING-KS."), makeSymbol("SELF"), makeSymbol("MONITORING-KS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(REPORT-POSTINGS ~S): No application is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION"))), list(makeSymbol("ACTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MONITORING-KS"), list(QUOTE, makeSymbol("GET-ACTION")))), list(makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MONITORING-KS"), list(QUOTE, makeSymbol("GET-ACTION-QUALIFIERS")))), list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MONITORING-KS"), list(QUOTE, makeSymbol("GET-PRECONDITION-PATTERN"))))), list(makeSymbol("MUST"), makeSymbol("BLACKBOARD"), makeString("(REPORT-POSTINGS ~S): No blackboard is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN")), makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-MONITORING-PATTERN."), makeSymbol("SELF"), makeSymbol("PRECONDITION-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("MONITOR-ARGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MONITOR-ARGS"), makeSymbol("CYBLACK-MONITORING-PATTERN")), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("MONITOR-ARGS")), makeString("(REPORT-POSTINGS ~S): Monitor args ~S are not an instance of CYBLACK-ENVIRONMENT."), makeSymbol("SELF"), makeSymbol("MONITOR-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-LOCAL-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("MONITOR-ARGS"))), list(makeSymbol("PANELS"), NIL), list(makeSymbol("POSTINGS"), NIL), makeSymbol("TYPE")), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDING"), makeSymbol("BINDINGS")), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("BINDING"))), list(makeSymbol("PWHEN"), makeSymbol("TYPE"), list(makeSymbol("CPUSH"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("TYPE"), makeSymbol("BLACKBOARD")), makeSymbol("PANELS")))), list(makeSymbol("PCASE"), makeSymbol("ACTION"), list($SEND, list(makeSymbol("CDOLIST"), list(makeSymbol("QUALIFIER"), makeSymbol("ACTION-QUALIFIERS")), list(makeSymbol("PCASE"), makeSymbol("QUALIFIER"), list(makeKeyword("NEW-POSTING"), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("POSTING"), makeSymbol("POSTINGS")), list(makeSymbol("CPUSH"), makeSymbol("POSTING"), makeSymbol("POSTINGS")))), list(makeKeyword("ALL-DIRECT-POSTINGS"), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("PANEL"), makeSymbol("PANELS"), makeSymbol("POSTINGS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-DIRECT-POSTINGS"))))), list(makeKeyword("ALL-POSTINGS"), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("PANEL"), makeSymbol("PANELS"), makeSymbol("POSTINGS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-ALL-POSTINGS")))))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("WARN"), makeString("(REPORT-POSTINGS ~S): Unknown action type ~S."), makeSymbol("SELF"), makeSymbol("ACTION"))))))), list(RET, NIL));

    static private final SubLSymbol $sym330$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt331$_REPORT_POSTINGS__S____S_is_not_a = makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-MONITORING-KS.");

    static private final SubLString $str_alt332$_REPORT_POSTINGS__S____S_is_not_a = makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING.");

    static private final SubLString $str_alt333$_REPORT_POSTINGS__S___No_applicat = makeString("(REPORT-POSTINGS ~S): No application is associated with this knowledge source.");







    static private final SubLString $str_alt337$_REPORT_POSTINGS__S___No_blackboa = makeString("(REPORT-POSTINGS ~S): No blackboard is associated with the application ~S.");

    static private final SubLString $str_alt338$_REPORT_POSTINGS__S____S_is_not_a = makeString("(REPORT-POSTINGS ~S): ~S is not an instance of CYBLACK-MONITORING-PATTERN.");

    static private final SubLString $str_alt339$_REPORT_POSTINGS__S___Monitor_arg = makeString("(REPORT-POSTINGS ~S): Monitor args ~S are not an instance of CYBLACK-ENVIRONMENT.");


    private static final SubLSymbol $NEW_POSTING = makeKeyword("NEW-POSTING");

    private static final SubLSymbol $ALL_DIRECT_POSTINGS = makeKeyword("ALL-DIRECT-POSTINGS");



    private static final SubLSymbol $ALL_POSTINGS = makeKeyword("ALL-POSTINGS");



    static private final SubLString $str_alt346$_REPORT_POSTINGS__S___Unknown_act = makeString("(REPORT-POSTINGS ~S): Unknown action type ~S.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_REPORT_POSTINGS_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-REPORT-POSTINGS-METHOD");

    private static final SubLSymbol STATE_CHANGE = makeSymbol("STATE-CHANGE");

    static private final SubLList $list_alt349 = list(makeSymbol("EXTERNAL-MODULE"), makeSymbol("EVENT-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("CONTENTS"), NIL));

    static private final SubLList $list_alt350 = list(list(makeSymbol("MUST"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-MODULE")), makeString("(STATE-CHANGE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-EVENT-TYPE-P"), makeSymbol("EVENT-TYPE")), makeString("(STATE-CHANGE ~S): ~S is not an instance of CYBLACK-EVENT-TYPE."), makeSymbol("SELF"), makeSymbol("EVENT-TYPE")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE"), list(makeSymbol("EKS-KNOWLEDGE-SOURCE"), makeSymbol("EXTERNAL-MODULE"))), list(makeSymbol("EXTERNAL-MODULE-GUID-ID"), list(makeSymbol("FIF"), makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-GUID-AS-STRING-METHOD"), makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOUCE")), NIL)), list(makeSymbol("TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))), list(makeSymbol("STATE-CHANGE-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("SESSION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("EXTERNAL-MODULE-GUID-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EVENT-TYPE"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("EVENT-TYPE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE")), makeSymbol("STATE-CHANGE-MESSAGE"), makeSymbol("CONTENTS")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("STATE-CHANGE-MESSAGE")), list(makeSymbol("TRANSMIT"), makeSymbol("SELF"), makeSymbol("STATE-CHANGE-MESSAGE")), list(RET, makeSymbol("TRANSACTION-ID")) }));

    static private final SubLSymbol $sym351$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt352$_STATE_CHANGE__S____S_is_not_an_i = makeString("(STATE-CHANGE ~S): ~S is not an instance of EXTERNAL-KNOWLEDGE-SOURCE.");

    static private final SubLString $str_alt353$_STATE_CHANGE__S____S_is_not_an_i = makeString("(STATE-CHANGE ~S): ~S is not an instance of CYBLACK-EVENT-TYPE.");



    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_STATE_CHANGE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-STATE-CHANGE-METHOD");

    private static final SubLSymbol RETREIVE_TRANSACTION_SEQUENCE_INTERNAL = makeSymbol("RETREIVE-TRANSACTION-SEQUENCE-INTERNAL");

    static private final SubLList $list_alt357 = list(makeSymbol("TRANSACTION-ID"));

    static private final SubLList $list_alt358 = list(list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("TRANSACTION-ID")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MESSAGES"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO")))), list(RET, makeSymbol("MESSAGES"))))), list(RET, NIL));

    static private final SubLSymbol $sym359$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLSymbol $sym360$CYBLACK_MESSAGE_BROKER_RETREIVE_TRANSACTION_SEQUENCE_INTERNAL_MET = makeSymbol("CYBLACK-MESSAGE-BROKER-RETREIVE-TRANSACTION-SEQUENCE-INTERNAL-METHOD");

    private static final SubLSymbol RETREIVE_TRANSACTION_SEQUENCE = makeSymbol("RETREIVE-TRANSACTION-SEQUENCE");

    static private final SubLList $list_alt362 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TRANSACTION-ID")), makeString("(RETREIVE-TRANSACTION-SEQUENCE ~S): ~S is not a transaction id."), makeSymbol("SELF"), makeSymbol("TRANSACTION-ID")), list(makeSymbol("MUST"), makeSymbol("GUID-MANAGER"), makeString("(RETREIVE-TRANSACTION-SEQUENCE ~S): No cyblack-guid-manager is associated with this message broker."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-INFO"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("TRANSACTION-ID")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-INFO"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MESSAGES"), makeSymbol("CYBLACK-GUID-INFO")), makeSymbol("GUID-INFO")))), list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("MESSAGES")))))), list(RET, NIL));

    static private final SubLSymbol $sym363$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt364$_RETREIVE_TRANSACTION_SEQUENCE__S = makeString("(RETREIVE-TRANSACTION-SEQUENCE ~S): ~S is not a transaction id.");

    static private final SubLString $str_alt365$_RETREIVE_TRANSACTION_SEQUENCE__S = makeString("(RETREIVE-TRANSACTION-SEQUENCE ~S): No cyblack-guid-manager is associated with this message broker.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_RETREIVE_TRANSACTION_SEQUENCE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-RETREIVE-TRANSACTION-SEQUENCE-METHOD");



    static private final SubLList $list_alt368 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(TRANSMIT ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TIMESTAMP-NOW"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("GET-EXTERNAL-CONNECTION"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("EXTERNAL-CONNECTION"), makeString("(TRANSMIT ~S): No external connection is associated with this message broker."), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("WRITE-EXTERNAL-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("MESSAGE")), makeSymbol("MESSAGE")), list(RET, NIL)));

    static private final SubLString $str_alt369$_TRANSMIT__S____S_is_not_an_insta = makeString("(TRANSMIT ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    static private final SubLString $str_alt370$_TRANSMIT__S___No_external_connec = makeString("(TRANSMIT ~S): No external connection is associated with this message broker.");

    private static final SubLSymbol WRITE_EXTERNAL_MESSAGE = makeSymbol("WRITE-EXTERNAL-MESSAGE");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_TRANSMIT_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-TRANSMIT-METHOD");

    private static final SubLSymbol RECEIVE = makeSymbol("RECEIVE");

    static private final SubLList $list_alt374 = list(makeSymbol("MESSAGE-AS-STRING"));

    public static final SubLObject $list_alt375 = _constant_375_initializer();

    static private final SubLSymbol $sym376$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt377$_RECEIVE__S____S_is_neither_a_str = makeString("(RECEIVE ~S): ~S is neither a string nor a list.");

    static private final SubLString $str_alt378$_RECEIVE__S___No_guid_manager_is_ = makeString("(RECEIVE ~S): No guid manager is associated with this message broker.");





    static private final SubLString $str_alt381$_RECEIVE__S___Encountered_EOF_whi = makeString("(RECEIVE ~S): Encountered EOF while reading message.");

    static private final SubLString $str_alt382$_RECEIVE__S___Encountered_ERROR_w = makeString("(RECEIVE ~S): Encountered ERROR while reading message.");

    static private final SubLString $str_alt383$_RECEIVE__S___Received_NIL_while_ = makeString("(RECEIVE ~S): Received NIL while reading message.");



    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE = makeSymbol("CYBLACK-ACCEPT-MESSAGE");



    private static final SubLSymbol CYBLACK_REJECT_MESSAGE = makeSymbol("CYBLACK-REJECT-MESSAGE");



    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE = makeSymbol("CYBLACK-PROPOSE-MESSAGE");

    private static final SubLSymbol $DECLINE = makeKeyword("DECLINE");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE = makeSymbol("CYBLACK-DECLINE-MESSAGE");

    private static final SubLSymbol $REVOKE = makeKeyword("REVOKE");

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE = makeSymbol("CYBLACK-REVOKE-MESSAGE");

    private static final SubLSymbol $AFFIRM = makeKeyword("AFFIRM");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE = makeSymbol("CYBLACK-AFFIRM-MESSAGE");



    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE");

    private static final SubLSymbol $ACQUIT = makeKeyword("ACQUIT");

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE = makeSymbol("CYBLACK-ACQUIT-MESSAGE");

    private static final SubLSymbol $TERMINATE = makeKeyword("TERMINATE");

    private static final SubLSymbol $REQUEST_CONTENTS = makeKeyword("REQUEST-CONTENTS");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE");

    private static final SubLSymbol $ADD_KNOWLEDGE_SOURCE = makeKeyword("ADD-KNOWLEDGE-SOURCE");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE");

    private static final SubLSymbol $REMOVE_KNOWLEDGE_SOURCE = makeKeyword("REMOVE-KNOWLEDGE-SOURCE");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE");

    private static final SubLSymbol $ADD_POSTING_CLASS = makeKeyword("ADD-POSTING-CLASS");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE");

    private static final SubLSymbol $ADD_PANEL = makeKeyword("ADD-PANEL");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE");

    private static final SubLSymbol $REMOVE_PANEL = makeKeyword("REMOVE-PANEL");

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE");

    static private final SubLString $str_alt413$_RECEIVE__S___Unknown_message_typ = makeString("(RECEIVE ~S): Unknown message type ~S received.");





    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_RECEIVE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-RECEIVE-METHOD");



    static private final SubLList $list_alt418 = list(makeSymbol("GUID-STRING-OR-MESSAGE"));

    static private final SubLList $list_alt419 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("STRINGP"), makeSymbol("GUID-STRING-OR-MESSAGE")), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("GUID-STRING-OR-MESSAGE"))), makeString("(GET-CAUSE ~S): ~S is neither a string nor a message."), makeSymbol("SELF"), makeSymbol("GUID-STRING-OR-MESSAGE")), list(makeSymbol("MUST"), makeSymbol("GUID-MANAGER"), makeString("(GET-CAUSE ~S): No guid manager is associated with this broker."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("GUID-STRING-OR-MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MESSAGES"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("GUID-STRING-OR-MESSAGE")))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGES"), list(makeSymbol("CDOLIST"), list(makeSymbol("MESSAGE"), makeSymbol("MESSAGES")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-TRANSMIT-MESSAGE-P"), makeSymbol("MESSAGE")), list(RET, makeSymbol("MESSAGE")))))), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-STRING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("GUID-STRING-OR-MESSAGE")))), list(RET, list(makeSymbol("GET-CAUSE"), makeSymbol("SELF"), makeSymbol("GUID-STRING"))))), list(RET, NIL));

    static private final SubLSymbol $sym420$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt421$_GET_CAUSE__S____S_is_neither_a_s = makeString("(GET-CAUSE ~S): ~S is neither a string nor a message.");

    static private final SubLString $str_alt422$_GET_CAUSE__S___No_guid_manager_i = makeString("(GET-CAUSE ~S): No guid manager is associated with this broker.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_GET_CAUSE_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-GET-CAUSE-METHOD");

    private static final SubLSymbol PROCESS_MESSAGES = makeSymbol("PROCESS-MESSAGES");

    static private final SubLList $list_alt425 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("GET-EXTERNAL-CONNECTION"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("SESSION-ID"), makeString("(PROCESS-MESSAGES ~S): Could not read an external message because no session-id is associated with this message broker."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("READ-EXTERNAL-MESSAGE"), makeSymbol("CYBLACK-EXTERNAL-CONNECTION")), makeSymbol("EXTERNAL-CONNECTION"), makeSymbol("SESSION-ID")))), list(makeSymbol("WHILE"), makeSymbol("MESSAGE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE"), list(QUOTE, makeSymbol("EXECUTE"))), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("READ-EXTERNAL-MESSAGE"), makeSymbol("CYBLACK-EXTERNAL-CONNECTION")), makeSymbol("EXTERNAL-CONNECTION"), makeSymbol("SESSION-ID")))))), list(RET, NIL));

    static private final SubLSymbol $sym426$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    static private final SubLString $str_alt427$_PROCESS_MESSAGES__S___Could_not_ = makeString("(PROCESS-MESSAGES ~S): Could not read an external message because no session-id is associated with this message broker.");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_PROCESS_MESSAGES_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-PROCESS-MESSAGES-METHOD");

    private static final SubLSymbol DESCRIBE_GUID_MANAGER = makeSymbol("DESCRIBE-GUID-MANAGER");

    static private final SubLList $list_alt430 = list(list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DESCRIBE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("STREAM"), makeSymbol("DEPTH"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym431$OUTER_CATCH_FOR_CYBLACK_MESSAGE_BROKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol CYBLACK_MESSAGE_BROKER_DESCRIBE_GUID_MANAGER_METHOD = makeSymbol("CYBLACK-MESSAGE-BROKER-DESCRIBE-GUID-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE = makeSymbol("CYBLACK-EXTERNAL-MODULE");

    static private final SubLList $list_alt434 = list(list(makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-NAME-P"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt438 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym439$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INITIALIZE-METHOD");

    static private final SubLList $list_alt441 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-EXTERNAL-MODULE: ~S>"), makeSymbol("EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym442$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-METHOD");

    static private final SubLString $str_alt443$__CYBLACK_EXTERNAL_MODULE___S_ = makeString("#<CYBLACK-EXTERNAL-MODULE: ~S>");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_PRINT_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-PRINT-METHOD");



    static private final SubLList $list_alt446 = list(list(RET, makeSymbol("EXTERNAL-MODULE-NAME")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_GET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-GET-EXTERNAL-MODULE-NAME-METHOD");



    static private final SubLList $list_alt449 = list(makeSymbol("NEW-EXTERNAL-MODULE-NAME"));

    static private final SubLList $list_alt450 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-NAME"))), makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.  A string or NIL were expected."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-NAME")));

    static private final SubLSymbol $sym451$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-METHOD");

    static private final SubLString $str_alt452$_SET_EXTERNAL_MODULE_NAME__S____S = makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.  A string or NIL were expected.");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_SET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-SET-EXTERNAL-MODULE-NAME-METHOD");

    private static final SubLSymbol HAS_NAME_P = makeSymbol("HAS-NAME-P");

    static private final SubLList $list_alt455 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt456 = list(list(RET, list(EQUALP, makeSymbol("NAME"), makeSymbol("EXTERNAL-MODULE-NAME"))));

    static private final SubLSymbol $sym457$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_HAS_NAME_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-HAS-NAME-P-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt460 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"));

    static private final SubLList $list_alt461 = list(new SubLObject[]{ list(makeSymbol("EXTERNAL-MODULE-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-PORT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-ID"), list(makeSymbol("NEW-EXTERNAL-MODULE-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-PORT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-PORT"), list(makeSymbol("NEW-EXTERNAL-MODULE-PORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-NAME-AND-PORT-P"), list(makeSymbol("NAME"), makeSymbol("PORT")), makeKeyword("PUBLIC")), list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });









    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt468 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt469 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt472 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt473 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_ON_DELETE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_ON_ADD_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-ON-ADD-METHOD");



    static private final SubLList $list_alt478 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt481 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt482 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_MEMBER_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-MEMBER-P-METHOD");

    static private final SubLList $list_alt484 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym485$CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_SELF_FROM_ALL_COLLECTIONS = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt487 = list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION"));

    static private final SubLList $list_alt488 = list(list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-COLLECTION")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-COLLECTION"), list(QUOTE, makeSymbol("ADD")), makeSymbol("SELF")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str_alt489$_TRANSFER_SELF__S____S_is_not_an_ = makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE.");



    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_TRANSFER_SELF_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-TRANSFER-SELF-METHOD");



    static private final SubLList $list_alt493 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym494$CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_SELF_FROM_COLLECTION_METH = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt496 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt497 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt500 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt501 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-ADD-PARENT-LINK-METHOD");

    static private final SubLSymbol $sym503$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE-CLASS");

    static private final SubLSymbol $sym504$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MODULE_INSTANCE_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MODULE-INSTANCE-INSTANCE");

    static private final SubLList $list_alt505 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-PORT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt508 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-EXTERNAL-MODULE-INSTANCE: ~S, ~S, ~S>"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EXTERNAL-MODULE-ID"), makeSymbol("EXTERNAL-MODULE-PORT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym509$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    static private final SubLString $str_alt510$__CYBLACK_EXTERNAL_MODULE_INSTANC = makeString("#<CYBLACK-EXTERNAL-MODULE-INSTANCE: ~S, ~S, ~S>");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_PRINT_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-PRINT-METHOD");

    static private final SubLList $list_alt512 = list(list(RET, makeSymbol("EXTERNAL-MODULE-ID")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-EXTERNAL-MODULE-ID-METHOD");

    static private final SubLList $list_alt514 = list(makeSymbol("NEW-EXTERNAL-MODULE-ID"));

    static private final SubLList $list_alt515 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-EXTERNAL-MODULE-ID"))), makeString("(SET-EXTERNAL-MODULE-ID ~S): ~S is not a valid EXTERNAL-MODULE-ID.  A GUID was expected."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-ID"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-EXTERNAL-MODULE-ID")))), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-ID")));

    static private final SubLSymbol $sym516$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    static private final SubLString $str_alt517$_SET_EXTERNAL_MODULE_ID__S____S_i = makeString("(SET-EXTERNAL-MODULE-ID ~S): ~S is not a valid EXTERNAL-MODULE-ID.  A GUID was expected.");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-EXTERNAL-MODULE-ID-METHOD");

    private static final SubLSymbol GET_EXTERNAL_MODULE_PORT = makeSymbol("GET-EXTERNAL-MODULE-PORT");

    static private final SubLList $list_alt520 = list(list(RET, makeSymbol("EXTERNAL-MODULE-PORT")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_EXTERNAL_MODULE_PORT_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-EXTERNAL-MODULE-PORT-METHOD");

    private static final SubLSymbol SET_EXTERNAL_MODULE_PORT = makeSymbol("SET-EXTERNAL-MODULE-PORT");

    static private final SubLList $list_alt523 = list(makeSymbol("NEW-EXTERNAL-MODULE-PORT"));

    static private final SubLList $list_alt524 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-PORT")), list(makeSymbol("CYBLACK-PORT-P"), makeSymbol("NEW-EXTERNAL-MODULE-PORT"))), makeString("(SET-EXTERNAL-MODULE-PORT ~S): ~S is not an instance of CYBLACK-PORT-P."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-PORT")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-PORT"), makeSymbol("NEW-EXTERNAL-MODULE-PORT")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-PORT")));

    static private final SubLSymbol $sym525$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    static private final SubLString $str_alt526$_SET_EXTERNAL_MODULE_PORT__S____S = makeString("(SET-EXTERNAL-MODULE-PORT ~S): ~S is not an instance of CYBLACK-PORT-P.");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_EXTERNAL_MODULE_PORT_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-EXTERNAL-MODULE-PORT-METHOD");

    private static final SubLSymbol HAS_NAME_AND_PORT_P = makeSymbol("HAS-NAME-AND-PORT-P");

    static private final SubLList $list_alt529 = list(makeSymbol("NAME"), makeSymbol("PORT"));

    static private final SubLList $list_alt530 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("HAS-NAME-P"), makeSymbol("SELF"), makeSymbol("NAME")), list(makeSymbol("COR"), list(EQ, makeSymbol("EXTERNAL-MODULE-PORT"), makeSymbol("PORT")), list(makeSymbol("CYBLACK-PORT-EQUAL-METHOD"), makeSymbol("EXTERNAL-MODULE-PORT"), makeSymbol("PORT"))))));

    static private final SubLSymbol $sym531$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_HAS_NAME_AND_PORT_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-HAS-NAME-AND-PORT-P-METHOD");



    static private final SubLList $list_alt534 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt535 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt538 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt539 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym540$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt543 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt546 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt547 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym548$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MODULE_INSTANCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MODULE_INSTANCE_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-SET-SELF-DELETION-MODE-METHOD");



    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT");

    static private final SubLList $list_alt552 = list(new SubLObject[]{ list(makeSymbol("PORT-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INPUT-STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTPUT-STREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-INSTANCES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONNECTED"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("RUNNING"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("INCOMING-MESSAGE-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-MESSAGE-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INPUT-STREAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-INPUT-STREAM-P"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INPUT-STREAM"), list(makeSymbol("NEW-INPUT-STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTPUT-STREAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OUTPUT-STREAM"), list(makeSymbol("NEW-OUTPUT-STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-OUTPUT-STREAM-P"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-PORT-ID-P"), list(makeSymbol("TARGET-PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-MODULE-INSTANCE-P"), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EMID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("EXTERNAL-MODULE-INSTANCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-AND-ADD-EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EMID"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EMID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID"), list(makeSymbol("EMID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EMID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEND-OUTGOING-MESSAGE"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-RUNNING-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RUNNING"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-CONNECTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONNECTED"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTGOING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HARVEST-INPUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPAWN-INPUT-HARVESTER"), NIL, makeKeyword("PUBLIC")) });













    public static final SubLInteger $int$4099 = makeInteger(4099);

    public static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-CLASS");



    private static final SubLSymbol RUNNING = makeSymbol("RUNNING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-INSTANCE");

    static private final SubLList $list_alt565 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("CSETQ"), makeSymbol("CONNECTED"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RUNNING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-MESSAGE-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym566$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");



    private static final SubLSymbol CYBLACK_PORT_INITIALIZE_METHOD = makeSymbol("CYBLACK-PORT-INITIALIZE-METHOD");

    static private final SubLList $list_alt569 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-PORT: ~S>"), makeSymbol("PORT-ID")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym570$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt571$__CYBLACK_PORT___S_ = makeString("#<CYBLACK-PORT: ~S>");

    private static final SubLSymbol CYBLACK_PORT_PRINT_METHOD = makeSymbol("CYBLACK-PORT-PRINT-METHOD");

    static private final SubLList $list_alt573 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt574 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-PORT-P"), makeSymbol("OBJECT")), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("PORT-ID")), list(makeSymbol("NULL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PORT-ID"), makeSymbol("CYBLACK-PORT")), makeSymbol("OBJECT")))), list(makeSymbol("CYBLACK-PORT-ID-EQUAL-P"), makeSymbol("PORT-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PORT-ID"), makeSymbol("CYBLACK-PORT")), makeSymbol("OBJECT")))))));

    static private final SubLSymbol $sym575$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_EQUAL_METHOD = makeSymbol("CYBLACK-PORT-EQUAL-METHOD");

    static private final SubLList $list_alt577 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-APPLICATION"), list(QUOTE, makeSymbol("GET-INCOMING-MESSAGE-QUEUE"))))), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym578$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");



    private static final SubLSymbol CYBLACK_PORT_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-PORT-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt582 = list(list(RET, makeSymbol("PORT-ID")));

    private static final SubLSymbol CYBLACK_PORT_GET_PORT_ID_METHOD = makeSymbol("CYBLACK-PORT-GET-PORT-ID-METHOD");



    static private final SubLList $list_alt585 = list(makeSymbol("NEW-PORT-ID"));

    static private final SubLList $list_alt586 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("CYBLACK-PORT-ID-P"), makeSymbol("NEW-PORT-ID"))), makeString("(SET-PORT-ID ~S): ~S is not a valid port ID."), makeSymbol("SELF"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), makeSymbol("NEW-PORT-ID")), list(RET, makeSymbol("PORT-ID")));

    static private final SubLSymbol $sym587$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt588$_SET_PORT_ID__S____S_is_not_a_val = makeString("(SET-PORT-ID ~S): ~S is not a valid port ID.");

    private static final SubLSymbol CYBLACK_PORT_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-PORT-SET-PORT-ID-METHOD");

    private static final SubLSymbol GET_INPUT_STREAM = makeSymbol("GET-INPUT-STREAM");

    static private final SubLList $list_alt591 = list(list(RET, makeSymbol("INPUT-STREAM")));

    private static final SubLSymbol CYBLACK_PORT_GET_INPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-GET-INPUT-STREAM-METHOD");

    private static final SubLSymbol HAS_INPUT_STREAM_P = makeSymbol("HAS-INPUT-STREAM-P");

    static private final SubLList $list_alt594 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt595 = list(list(RET, list(EQ, makeSymbol("STREAM"), makeSymbol("INPUT-STREAM"))));

    static private final SubLSymbol $sym596$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_HAS_INPUT_STREAM_P_METHOD = makeSymbol("CYBLACK-PORT-HAS-INPUT-STREAM-P-METHOD");

    private static final SubLSymbol SET_INPUT_STREAM = makeSymbol("SET-INPUT-STREAM");

    static private final SubLList $list_alt599 = list(makeSymbol("NEW-INPUT-STREAM"));

    static private final SubLList $list_alt600 = list(list(makeSymbol("CSETQ"), makeSymbol("INPUT-STREAM"), makeSymbol("NEW-INPUT-STREAM")), list(RET, makeSymbol("NEW-INPUT-STREAM")));

    static private final SubLSymbol $sym601$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_SET_INPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-SET-INPUT-STREAM-METHOD");

    private static final SubLSymbol GET_OUTPUT_STREAM = makeSymbol("GET-OUTPUT-STREAM");

    static private final SubLList $list_alt604 = list(list(RET, makeSymbol("OUTPUT-STREAM")));

    private static final SubLSymbol CYBLACK_PORT_GET_OUTPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-GET-OUTPUT-STREAM-METHOD");

    private static final SubLSymbol SET_OUTPUT_STREAM = makeSymbol("SET-OUTPUT-STREAM");

    static private final SubLList $list_alt607 = list(makeSymbol("NEW-OUTPUT-STREAM"));

    static private final SubLList $list_alt608 = list(list(makeSymbol("CSETQ"), makeSymbol("OUTPUT-STREAM"), makeSymbol("NEW-OUTPUT-STREAM")), list(RET, makeSymbol("NEW-OUTPUT-STREAM")));

    static private final SubLSymbol $sym609$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_SET_OUTPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-SET-OUTPUT-STREAM-METHOD");

    private static final SubLSymbol HAS_OUTPUT_STREAM_P = makeSymbol("HAS-OUTPUT-STREAM-P");

    static private final SubLList $list_alt612 = list(list(RET, list(EQ, makeSymbol("STREAM"), makeSymbol("OUTPUT-STREAM"))));

    static private final SubLSymbol $sym613$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_HAS_OUTPUT_STREAM_P_METHOD = makeSymbol("CYBLACK-PORT-HAS-OUTPUT-STREAM-P-METHOD");

    private static final SubLSymbol HAS_PORT_ID_P = makeSymbol("HAS-PORT-ID-P");

    static private final SubLList $list_alt616 = list(makeSymbol("TARGET-PORT-ID"));

    static private final SubLList $list_alt617 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("PORT-ID"), list(makeSymbol("CAND"), makeSymbol("TARGET-PORT-ID"), list(makeSymbol("CYBLACK-PORT-ID-EQUAL-P"), makeSymbol("PORT-ID"), makeSymbol("TARGET-PORT-ID"))), list(makeSymbol("NULL"), makeSymbol("TARGET-PORT-ID")))));

    static private final SubLSymbol $sym618$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_HAS_PORT_ID_P_METHOD = makeSymbol("CYBLACK-PORT-HAS-PORT-ID-P-METHOD");

    private static final SubLSymbol HAS_EXTERNAL_MODULE_INSTANCE_P = makeSymbol("HAS-EXTERNAL-MODULE-INSTANCE-P");

    static private final SubLList $list_alt621 = list(makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("EMID"));

    static private final SubLList $list_alt622 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("EXTERNAL-MODULE-NAME")), makeString("(HAS-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.  A string was expected."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("PWHEN"), list(makeSymbol("GUID-P"), makeSymbol("EMID")), list(makeSymbol("CSETQ"), makeSymbol("EMID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("EMID")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("STRINGP"), makeSymbol("EMID"))), makeString("(HAS-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module ID.  A GUID was expected."), makeSymbol("SELF"), makeSymbol("EMID")), list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), makeSymbol("EMID"), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(RET, NIL)), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-NAME-P"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("EXTERNAL-MODULE-INSTANCE"), makeSymbol("EXTERNAL-MODULE-NAME")))));

    static private final SubLSymbol $sym623$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt624$_HAS_EXTERNAL_MODULE_NAME__S____S = makeString("(HAS-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.  A string was expected.");

    static private final SubLString $str_alt625$_HAS_EXTERNAL_MODULE_NAME__S____S = makeString("(HAS-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module ID.  A GUID was expected.");

    private static final SubLSymbol CYBLACK_PORT_HAS_EXTERNAL_MODULE_INSTANCE_P_METHOD = makeSymbol("CYBLACK-PORT-HAS-EXTERNAL-MODULE-INSTANCE-P-METHOD");

    private static final SubLSymbol ADD_EXTERNAL_MODULE_INSTANCE = makeSymbol("ADD-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt628 = list(makeSymbol("EXTERNAL-MODULE-INSTANCE"));

    static private final SubLList $list_alt629 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE-P"), makeSymbol("EXTERNAL-MODULE-INSTANCE")), makeString("(ADD-EXTERNAL-MODULE-INSTANCE ~S): ~S is not an instance of CYBLACK-EXTERNAL-MODULE-INSTANCE."), makeSymbol("SELF"), makeSymbol("EXTERNAL-MODULE-INSTANCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-PORT"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("EXTERNAL-MODULE-INSTANCE"), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP)))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("EXTERNAL-MODULE-INSTANCE")), makeSymbol("EXTERNAL-MODULE-INSTANCE")), list(RET, makeSymbol("EXTERNAL-MODULE-INSTANCE")));

    static private final SubLSymbol $sym630$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt631$_ADD_EXTERNAL_MODULE_INSTANCE__S_ = makeString("(ADD-EXTERNAL-MODULE-INSTANCE ~S): ~S is not an instance of CYBLACK-EXTERNAL-MODULE-INSTANCE.");

    private static final SubLSymbol CYBLACK_PORT_ADD_EXTERNAL_MODULE_INSTANCE_METHOD = makeSymbol("CYBLACK-PORT-ADD-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE = makeSymbol("CREATE-AND-ADD-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt634 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EM"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("NEW-EM"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("NEW-EM"), makeSymbol("EMID")), list(makeSymbol("ADD-EXTERNAL-MODULE-INSTANCE"), makeSymbol("SELF"), makeSymbol("NEW-EM")), list(RET, makeSymbol("NEW-EM"))));

    private static final SubLSymbol CYBLACK_PORT_CREATE_AND_ADD_EXTERNAL_MODULE_INSTANCE_METHOD = makeSymbol("CYBLACK-PORT-CREATE-AND-ADD-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol RETRIEVE_EXTERNAL_MODULE_INSTANCE = makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt637 = list(list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("RETRIEVED-EM"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), makeSymbol("EMID"), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("RETRIEVED-EM"), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-NAME-P"), makeSymbol("CYBLACK-EXTERNAL-MODULE-INSTANCE")), makeSymbol("RETRIEVED-EM"), makeSymbol("EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("RETRIEVED-EM"))), list(makeSymbol("WARN"), makeString("(RETRIEVE-EXTERNAL-MODULE-INSTANCE ~S): Found external module instance ~S for EMID ~S but names do not match."), makeSymbol("SELF"), makeSymbol("RETRIEVED-EM"), makeSymbol("EMID")), list(RET, NIL)));

    static private final SubLSymbol $sym638$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt639$_RETRIEVE_EXTERNAL_MODULE_INSTANC = makeString("(RETRIEVE-EXTERNAL-MODULE-INSTANCE ~S): Found external module instance ~S for EMID ~S but names do not match.");

    private static final SubLSymbol CYBLACK_PORT_RETRIEVE_EXTERNAL_MODULE_INSTANCE_METHOD = makeSymbol("CYBLACK-PORT-RETRIEVE-EXTERNAL-MODULE-INSTANCE-METHOD");

    private static final SubLSymbol RETRIEVE_EXTERNAL_MODULE_INSTANCE_BY_EMID = makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID");

    static private final SubLList $list_alt642 = list(makeSymbol("EMID"));

    static private final SubLList $list_alt643 = list(list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("RETRIEVED-EM"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EXTERNAL-MODULE-INSTANCES"), makeSymbol("EMID"), NIL))), list(RET, makeSymbol("RETRIEVED-EM"))));

    static private final SubLSymbol $sym644$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_RETRIEVE_EXTERNAL_MODULE_INSTANCE_BY_EMID_METHOD = makeSymbol("CYBLACK-PORT-RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID-METHOD");

    private static final SubLSymbol PROBE_PORT_FOR_EXTERNAL_MODULE_INSTANCE = makeSymbol("PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE");

    static private final SubLList $list_alt647 = list(list(makeSymbol("IGNORE"), makeSymbol("EXTERNAL-MODULE-NAME")), list(makeSymbol("IGNORE"), makeSymbol("EMID")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PORT_PROBE_PORT_FOR_EXTERNAL_MODULE_INSTANCE_METHOD = makeSymbol("CYBLACK-PORT-PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE-METHOD");



    static private final SubLList $list_alt650 = list(list(makeSymbol("PWHEN"), makeSymbol("INPUT-STREAM"), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%  Closing Port ~S."), makeSymbol("SELF"), makeSymbol("PORT-ID")), list(makeSymbol("CYBLACK-CLOSE-PORT-STREAM"), makeSymbol("INPUT-STREAM"))), list(makeSymbol("CYBLACK-SERVER-UNREGISTER-PORT"), makeSymbol("PORT-ID")), list(RET, NIL));

    static private final SubLSymbol $sym651$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt652$____Closing_Port__S_ = makeString("~%  Closing Port ~S.");

    private static final SubLSymbol CYBLACK_PORT_CLOSE_METHOD = makeSymbol("CYBLACK-PORT-CLOSE-METHOD");

    private static final SubLSymbol SEND_OUTGOING_MESSAGE = makeSymbol("SEND-OUTGOING-MESSAGE");

    static private final SubLList $list_alt655 = list(list(makeSymbol("FORMAT"), T, makeString("~%(SEND-OUTGOING-MESSAGE ~S): Sending message ~S."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CONNECTED"), makeSymbol("OUTPUT-STREAM")), list(makeSymbol("PIF"), list(makeSymbol("CONSP"), makeSymbol("MESSAGE")), list(makeSymbol("PRINT"), makeSymbol("MESSAGE"), makeSymbol("OUTPUT-STREAM")), list(makeSymbol("PRIN1"), makeSymbol("MESSAGE"), makeSymbol("OUTPUT-STREAM"))), list(makeSymbol("NETWORK-TERPRI"), makeSymbol("OUTPUT-STREAM")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("OUTPUT-STREAM")))), list(RET, NIL));

    static private final SubLSymbol $sym656$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt657$___SEND_OUTGOING_MESSAGE__S___Sen = makeString("~%(SEND-OUTGOING-MESSAGE ~S): Sending message ~S.");

    private static final SubLSymbol CYBLACK_PORT_SEND_OUTGOING_MESSAGE_METHOD = makeSymbol("CYBLACK-PORT-SEND-OUTGOING-MESSAGE-METHOD");

    private static final SubLSymbol IS_RUNNING_P = makeSymbol("IS-RUNNING-P");

    static private final SubLList $list_alt660 = list(list(RET, makeSymbol("RUNNING")));

    static private final SubLSymbol $sym661$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_IS_RUNNING_P_METHOD = makeSymbol("CYBLACK-PORT-IS-RUNNING-P-METHOD");

    private static final SubLSymbol SET_RUNNING = makeSymbol("SET-RUNNING");

    static private final SubLList $list_alt664 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt665 = list(list(makeSymbol("CSETQ"), makeSymbol("RUNNING"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(RET, makeSymbol("RUNNING")));

    static private final SubLSymbol $sym666$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_SET_RUNNING_METHOD = makeSymbol("CYBLACK-PORT-SET-RUNNING-METHOD");



    static private final SubLList $list_alt669 = list(list(RET, makeSymbol("CONNECTED")));

    static private final SubLSymbol $sym670$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_IS_CONNECTED_P_METHOD = makeSymbol("CYBLACK-PORT-IS-CONNECTED-P-METHOD");

    private static final SubLSymbol SET_CONNECTED = makeSymbol("SET-CONNECTED");

    static private final SubLList $list_alt673 = list(list(makeSymbol("CSETQ"), makeSymbol("CONNECTED"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(RET, makeSymbol("CONNECTED")));

    static private final SubLSymbol $sym674$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_SET_CONNECTED_METHOD = makeSymbol("CYBLACK-PORT-SET-CONNECTED-METHOD");

    private static final SubLSymbol HARVEST_INPUT = makeSymbol("HARVEST-INPUT");

    static private final SubLList $list_alt677 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CONNECTED"), makeSymbol("INCOMING-MESSAGE-QUEUE")), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("CLET"), list(list(makeSymbol("INPUT"), list(makeSymbol("READ"), makeSymbol("INPUT-STREAM"), NIL, makeKeyword("EOF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(EQ, makeSymbol("INPUT"), makeKeyword("EOF")), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("INPUT")), list(makeSymbol("STRING-EQUAL"), makeSymbol("INPUT"), makeString(":EOF")))), list(makeSymbol("CLET"), list(list(makeSymbol("INPUT-AS-STRING"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), makeSymbol("INPUT")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-MESSAGE-QUEUE"), makeSymbol("INPUT-AS-STRING")), list(RET, makeSymbol("INPUT-AS-STRING"))))))), list(RET, NIL));

    static private final SubLSymbol $sym678$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt679$_EOF = makeString(":EOF");

    static private final SubLString $str_alt680$_S = makeString("~S");

    private static final SubLSymbol CYBLACK_PORT_HARVEST_INPUT_METHOD = makeSymbol("CYBLACK-PORT-HARVEST-INPUT-METHOD");

    static private final SubLList $list_alt682 = list(list(RET, makeSymbol("INCOMING-MESSAGE-QUEUE")));

    private static final SubLSymbol CYBLACK_PORT_GET_INCOMING_MESSAGE_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-GET-INCOMING-MESSAGE-QUEUE-METHOD");

    private static final SubLSymbol SET_INCOMING_MESSAGE_QUEUE = makeSymbol("SET-INCOMING-MESSAGE-QUEUE");

    static private final SubLList $list_alt685 = list(makeSymbol("NEW-QUEUE"));

    static private final SubLList $list_alt686 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-QUEUE"))), makeString("(SET-INCOMING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), makeSymbol("NEW-QUEUE")), list(RET, makeSymbol("NEW-QUEUE")));

    static private final SubLSymbol $sym687$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt688$_SET_INCOMING_MESSAGE_QUEUE__S___ = makeString("(SET-INCOMING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_PORT_SET_INCOMING_MESSAGE_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-SET-INCOMING-MESSAGE-QUEUE-METHOD");

    private static final SubLSymbol GET_OUTGOING_MESSAGE_QUEUE = makeSymbol("GET-OUTGOING-MESSAGE-QUEUE");

    static private final SubLList $list_alt691 = list(list(RET, makeSymbol("OUTGOING-MESSAGE-QUEUE")));

    private static final SubLSymbol CYBLACK_PORT_GET_OUTGOING_MESSAGE_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-GET-OUTGOING-MESSAGE-QUEUE-METHOD");

    private static final SubLSymbol SET_OUTGOING_MESSAGE_QUEUE = makeSymbol("SET-OUTGOING-MESSAGE-QUEUE");

    static private final SubLList $list_alt694 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-QUEUE"))), makeString("(SET-OUTGOING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-MESSAGE-QUEUE"), makeSymbol("NEW-QUEUE")), list(RET, makeSymbol("NEW-QUEUE")));

    static private final SubLSymbol $sym695$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt696$_SET_OUTGOING_MESSAGE_QUEUE__S___ = makeString("(SET-OUTGOING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_PORT_SET_OUTGOING_MESSAGE_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-SET-OUTGOING-MESSAGE-QUEUE-METHOD");

    static private final SubLList $list_alt698 = list($NONE, makeKeyword("TRANSFERED"));

    private static final SubLSymbol CYBLACK_CURRENT_PORT_STATE = makeSymbol("CYBLACK-CURRENT-PORT-STATE");

    private static final SubLSymbol ENCODE_CYBLACK_CURRENT_PORT_STATE = makeSymbol("ENCODE-CYBLACK-CURRENT-PORT-STATE");

    private static final SubLSymbol DECODE_CYBLACK_CURRENT_PORT_STATE = makeSymbol("DECODE-CYBLACK-CURRENT-PORT-STATE");

    private static final SubLSymbol CYBLACK_CURRENT_PORT_STATE_P = makeSymbol("CYBLACK-CURRENT-PORT-STATE-P");



    private static final SubLSymbol $TRANSFERED = makeKeyword("TRANSFERED");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str_alt707$_CONNECTED = makeString(":CONNECTED");

    static private final SubLString $str_alt708$__Port__S_received_a_connect_mess = makeString("~%Port ~S received a connect message.");

    static private final SubLString $str_alt709$CYBLACK_PORT_INPUT_HARVESTER_FUNC = makeString("CYBLACK-PORT-INPUT-HARVESTER-FUNCTION: Received message ~S on ~\n                              port ~S before :CONNECTED message.");

    private static final SubLSymbol SPAWN_INPUT_HARVESTER = makeSymbol("SPAWN-INPUT-HARVESTER");

    static private final SubLList $list_alt711 = list(list(makeSymbol("CLET"), list(list(makeSymbol("APPLICATION-ID"), list(makeSymbol("CYBLACK-APPLICATION-GET-APPLICATION-ID"), makeSymbol("APPLICATION")))), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-INPUT-HARVESTER-CURRENT-PORT*"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MAKE-PROCESS"), makeSymbol("APPLICATION-ID"), list(QUOTE, makeString("CYBLACK-PORT-INPUT-HARVESTER")), list(QUOTE, makeSymbol("CYBLACK-PORT-INPUT-HARVESTER-FUNCTION"))), list(makeSymbol("CYBLACK-PROCESS-WAIT-ON-VALUES"), list(list(makeSymbol("*CYBLACK-INPUT-HARVESTER-CURRENT-PORT*"), makeKeyword("TRANSFERED"))))), list(RET, NIL));

    static private final SubLSymbol $sym712$OUTER_CATCH_FOR_CYBLACK_PORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-METHOD");

    static private final SubLString $str_alt713$CYBLACK_PORT_INPUT_HARVESTER = makeString("CYBLACK-PORT-INPUT-HARVESTER");

    private static final SubLSymbol CYBLACK_PORT_INPUT_HARVESTER_FUNCTION = makeSymbol("CYBLACK-PORT-INPUT-HARVESTER-FUNCTION");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol CYBLACK_PORT_SPAWN_INPUT_HARVESTER_METHOD = makeSymbol("CYBLACK-PORT-SPAWN-INPUT-HARVESTER-METHOD");



    static private final SubLList $list_alt718 = list(new SubLObject[]{ list(makeSymbol("MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INCOMING-QUEUE-REFERENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-QUEUE-REFERENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGE-BROKER"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-QUEUES"), list(makeSymbol("INCOMING"), makeSymbol("OUTGOING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-PORT"), list(makeSymbol("PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PORT-GIVEN-INPUT-STREAM"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PORT-GIVEN-OUTPUT-STREAM"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-ALL-PORTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PORT"), list(makeSymbol("PORT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INPUT-STREAM"), NIL), list(makeSymbol("OUTPUT-STREAM"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-PORT"), list(makeSymbol("PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVITE-KNOWLEDGE-SOURCE"), list(makeSymbol("KNOWLEDGE-SOURCE-NAME"), makeSymbol("SID"), makeSymbol("EMID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ROUTE-OUTGOING-MESSAGE"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-PORTS-ARE-CONNECTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-PORTS-WHICH-ARE-NOT-CONNECTED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INCOMING-QUEUE"), list(makeSymbol("NEW-INCOMING-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTGOING-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OUTGOING-QUEUE"), list(makeSymbol("NEW-OUTGOING-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HARVEST-INPUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPAWN-INPUT-HARVESTERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALL-PORTS-CONNECTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WAIT-UNTIL-ALL-PORTS-CONNECTED-P"), list(makeSymbol("TIMEOUT-DELTA")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol CACHED_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY");

    private static final SubLSymbol OUTGOING_QUEUE_REFERENCE = makeSymbol("OUTGOING-QUEUE-REFERENCE");







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-INSTANCE");

    static private final SubLList $list_alt726 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-PORT-MANAGER*"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PORTS"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-QUEUE-REFERENCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-QUEUE-REFERENCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym727$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");



    private static final SubLSymbol CYBLACK_PORT_MANAGER_INITIALIZE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-INITIALIZE-METHOD");

    static private final SubLList $list_alt730 = list(list(RET, list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH"))));

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PRINT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PRINT-METHOD");

    static private final SubLList $list_alt732 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-QUEUE-REFERENCE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-APPLICATION"), list(QUOTE, makeSymbol("GET-INCOMING-MESSAGE-QUEUE"))))), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym733$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");











    private static final SubLSymbol CYBLACK_PORT_MANAGER_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt741 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY"), list(RET, makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY"))), list(makeSymbol("PUNLESS"), makeSymbol("APPLICATION"), list(makeSymbol("WARN"), makeString("(GET-KNOWLEDGE-SOURCE-BATTERY ~S): No application is associated with this port manager."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("KSB"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"))))), list(makeSymbol("PUNLESS"), makeSymbol("KSB"), list(makeSymbol("WARN"), makeString("(GET-KNOWLEDGE-SOURCE-BATTERY ~S): No knowledge source battery is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("KSB")), list(RET, makeSymbol("KSB"))));

    static private final SubLSymbol $sym742$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt743$_GET_KNOWLEDGE_SOURCE_BATTERY__S_ = makeString("(GET-KNOWLEDGE-SOURCE-BATTERY ~S): No application is associated with this port manager.");

    static private final SubLString $str_alt744$_GET_KNOWLEDGE_SOURCE_BATTERY__S_ = makeString("(GET-KNOWLEDGE-SOURCE-BATTERY ~S): No knowledge source battery is associated with the application ~S.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_GET_KNOWLEDGE_SOURCE_BATTERY_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD");



    static private final SubLList $list_alt747 = list(list(RET, makeSymbol("MESSAGE-BROKER")));

    private static final SubLSymbol CYBLACK_PORT_MANAGER_GET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-GET-MESSAGE-BROKER-METHOD");



    static private final SubLList $list_alt750 = list(makeSymbol("NEW-MESSAGE-BROKER"));

    static private final SubLList $list_alt751 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CYBLACK-MESSAGE-BROKER-P"), makeSymbol("NEW-MESSAGE-BROKER"))), makeString("(SET-MESSAGE-BROKER ~S): ~S is not an instance of CYBLACK-MESSAGE-BROKER."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-CONNECTION"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("PWHEN"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION"))), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-CONNECTION"), makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION")), makeSymbol("EXTERNAL-CONNECTION")))), list(makeSymbol("PWHEN"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("INCOMING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("SESSION-CONNECTION"))), list(makeSymbol("OUTGOING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-OUTGOING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("SESSION-CONNECTION")))), list(makeSymbol("PUNLESS"), makeSymbol("INCOMING-QUEUE"), list(makeSymbol("WARN"), makeString("(SET-MESSAGE-BROKER ~S): Could not associated an incoming queue with this port manager ~\n                       because session connection ~S of external connection ~S has no associated incoming ~\n                       message queue."), makeSymbol("SELF"), makeSymbol("SESSION-CONNECTION"), makeSymbol("EXTERNAL-CONNECTION"))), list(makeSymbol("PUNLESS"), makeSymbol("OUTGOING-QUEUE"), list(makeSymbol("WARN"), makeString("(SET-MESSAGE-BROKER ~S): Could not associated an outgoing queue with this port manager ~\n                       because session connection ~S of external connection ~S has no associated outgoing ~\n                       message queue."), makeSymbol("SELF"), makeSymbol("SESSION-CONNECTION"), makeSymbol("EXTERNAL-CONNECTION"))), list(makeSymbol("SET-QUEUES"), makeSymbol("SELF"), makeSymbol("INCOMING-QUEUE"), makeSymbol("OUTGOING-QUEUE")))))))), list(RET, makeSymbol("NEW-MESSAGE-BROKER")));

    static private final SubLSymbol $sym752$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt753$_SET_MESSAGE_BROKER__S____S_is_no = makeString("(SET-MESSAGE-BROKER ~S): ~S is not an instance of CYBLACK-MESSAGE-BROKER.");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION");

    static private final SubLString $str_alt755$_SET_MESSAGE_BROKER__S___Could_no = makeString("(SET-MESSAGE-BROKER ~S): Could not associated an incoming queue with this port manager ~\n                       because session connection ~S of external connection ~S has no associated incoming ~\n                       message queue.");

    static private final SubLString $str_alt756$_SET_MESSAGE_BROKER__S___Could_no = makeString("(SET-MESSAGE-BROKER ~S): Could not associated an outgoing queue with this port manager ~\n                       because session connection ~S of external connection ~S has no associated outgoing ~\n                       message queue.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_SET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SET-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol SET_QUEUES = makeSymbol("SET-QUEUES");

    static private final SubLList $list_alt759 = list(makeSymbol("INCOMING"), makeSymbol("OUTGOING"));

    static private final SubLList $list_alt760 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("INCOMING")), list(makeSymbol("QUEUE-INTERFACE-P"), makeSymbol("INCOMING"))), makeString("(SET-QUEUES ~S): ~S is not an instance of QUEUE-INTERFACE."), makeSymbol("SELF"), makeSymbol("INCOMING")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("OUTGOING")), list(makeSymbol("QUEUE-INTERFACE-P"), makeSymbol("OUTGOING"))), makeString("(SET-QUEUES ~S): ~S is not an instance of QUEUE-INTERFACE."), makeSymbol("SELF"), makeSymbol("OUTGOING")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-QUEUE-REFERENCE"), makeSymbol("INCOMING")), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-QUEUE-REFERENCE"), makeSymbol("OUTGOING")), list(RET, NIL));

    static private final SubLSymbol $sym761$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt762$_SET_QUEUES__S____S_is_not_an_ins = makeString("(SET-QUEUES ~S): ~S is not an instance of QUEUE-INTERFACE.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_SET_QUEUES_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SET-QUEUES-METHOD");

    private static final SubLSymbol RETRIEVE_PORT = makeSymbol("RETRIEVE-PORT");

    static private final SubLList $list_alt765 = list(makeSymbol("PORT-ID"));

    static private final SubLList $list_alt766 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PORT-ID-P"), makeSymbol("PORT-ID")), makeString("(RETRIEVE-PORT ~S): ~S is not a valid port id."), makeSymbol("SELF"), makeSymbol("PORT-ID")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-PORT-ID-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("PORT-ID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-PORT-ID-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("PORT-ID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym767$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt768$_RETRIEVE_PORT__S____S_is_not_a_v = makeString("(RETRIEVE-PORT ~S): ~S is not a valid port id.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_RETRIEVE_PORT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-RETRIEVE-PORT-METHOD");

    private static final SubLSymbol PORT_GIVEN_INPUT_STREAM = makeSymbol("PORT-GIVEN-INPUT-STREAM");

    static private final SubLList $list_alt771 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-INPUT-STREAM-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-INPUT-STREAM-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym772$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PORT_GIVEN_INPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PORT-GIVEN-INPUT-STREAM-METHOD");

    private static final SubLSymbol PORT_GIVEN_OUTPUT_STREAM = makeSymbol("PORT-GIVEN-OUTPUT-STREAM");

    static private final SubLList $list_alt775 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-OUTPUT-STREAM-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HAS-OUTPUT-STREAM-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym776$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PORT_GIVEN_OUTPUT_STREAM_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PORT-GIVEN-OUTPUT-STREAM-METHOD");

    private static final SubLSymbol CLOSE_ALL_PORTS = makeSymbol("CLOSE-ALL-PORTS");

    static private final SubLList $list_alt779 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%Closing all CyBlack ports:")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLOSE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLOSE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%All CyBlack ports are closed.")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    static private final SubLSymbol $sym780$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt781$__Closing_all_CyBlack_ports_ = makeString("~%Closing all CyBlack ports:");

    static private final SubLString $str_alt782$__All_CyBlack_ports_are_closed_ = makeString("~%All CyBlack ports are closed.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_CLOSE_ALL_PORTS_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-CLOSE-ALL-PORTS-METHOD");

    private static final SubLSymbol ADD_PORT = makeSymbol("ADD-PORT");

    static private final SubLList $list_alt785 = list(makeSymbol("PORT-ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INPUT-STREAM"), NIL), list(makeSymbol("OUTPUT-STREAM"), NIL));

    static private final SubLList $list_alt786 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EXISTING-PORT"), list(makeSymbol("RETRIEVE-PORT"), makeSymbol("SELF"), makeSymbol("PORT-ID")))), list(makeSymbol("PWHEN"), makeSymbol("EXISTING-PORT"), list(makeSymbol("WARN"), makeString("(ADD-PORT ~S): Redundant attempt to add port ~S ignore."), makeSymbol("SELF"), makeSymbol("PORT-ID")), list(RET, NIL)), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-PORT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-PORT"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-PORT")), makeSymbol("NEW-PORT"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PORT-ID"), makeSymbol("CYBLACK-PORT")), makeSymbol("NEW-PORT"), makeSymbol("PORT-ID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONNECTED"), makeSymbol("CYBLACK-PORT")), makeSymbol("NEW-PORT"), T), list(makeSymbol("PWHEN"), makeSymbol("INPUT-STREAM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INPUT-STREAM"), makeSymbol("CYBLACK-PORT")), makeSymbol("NEW-PORT"), makeSymbol("INPUT-STREAM"))), list(makeSymbol("PWHEN"), makeSymbol("OUTPUT-STREAM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTPUT-STREAM"), makeSymbol("CYBLACK-PORT")), makeSymbol("NEW-PORT"), makeSymbol("OUTPUT-STREAM"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("PORTS"), makeSymbol("NEW-PORT")), list(RET, makeSymbol("NEW-PORT")) })));

    static private final SubLSymbol $sym787$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt788$_ADD_PORT__S___Redundant_attempt_ = makeString("(ADD-PORT ~S): Redundant attempt to add port ~S ignore.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_ADD_PORT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-ADD-PORT-METHOD");

    private static final SubLSymbol REMOVE_PORT = makeSymbol("REMOVE-PORT");

    static private final SubLList $list_alt791 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EXISTING-PORT"), list(makeSymbol("RETRIEVE-PORT"), makeSymbol("SELF"), makeSymbol("PORT-ID")))), list(makeSymbol("PUNLESS"), makeSymbol("EXISTING-PORT"), list(makeSymbol("WARN"), makeString("(REMOVE-PORT ~S): ~S is not a known port.  Request ignore."), makeSymbol("SELF"), makeSymbol("PORT-ID")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLOSE"), makeSymbol("CYBLACK-PORT")), makeSymbol("EXISTING-PORT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EXISTING-PORT"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-COLLECTION")), makeSymbol("PORTS")), list(RET, makeSymbol("EXISTING-PORT"))));

    static private final SubLSymbol $sym792$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt793$_REMOVE_PORT__S____S_is_not_a_kno = makeString("(REMOVE-PORT ~S): ~S is not a known port.  Request ignore.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_REMOVE_PORT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-REMOVE-PORT-METHOD");

    private static final SubLSymbol INVITE_KNOWLEDGE_SOURCE = makeSymbol("INVITE-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt796 = list(makeSymbol("KNOWLEDGE-SOURCE-NAME"), makeSymbol("SID"), makeSymbol("EMID"));

    static private final SubLList $list_alt797 = list(list(makeSymbol("IGNORE"), makeSymbol("SID")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("KNOWLEDGE-SOURCE-NAME"), makeSymbol("EMID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PROBE-PORT-FOR-EXTERNAL-MODULE-INSTANCE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("KNOWLEDGE-SOURCE-NAME"), makeSymbol("EMID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("PORT"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)));

    static private final SubLSymbol $sym798$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_INVITE_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-INVITE-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol ROUTE_OUTGOING_MESSAGE = makeSymbol("ROUTE-OUTGOING-MESSAGE");

    static private final SubLList $list_alt801 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("MESSAGE")), list(makeSymbol("CYBLACK-MESSAGE-KEY-TYPE-P"), list(makeSymbol("CAR"), makeSymbol("MESSAGE")))), makeString("(ROUTE-OUTGOING-MESSAGE ~S): ~S is not a valid outgoing message."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("EMID"), list(makeSymbol("GETF"), list(makeSymbol("CDR"), makeSymbol("MESSAGE")), $EMID))), list(makeSymbol("PUNLESS"), makeSymbol("EMID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("EMID")))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SEND-OUTGOING-MESSAGE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("MESSAGE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RETRIEVE-EXTERNAL-MODULE-INSTANCE-BY-EMID"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("EMID"))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE-INSTANCE"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SEND-OUTGOING-MESSAGE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("MESSAGE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T)));

    static private final SubLSymbol $sym802$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt803$_ROUTE_OUTGOING_MESSAGE__S____S_i = makeString("(ROUTE-OUTGOING-MESSAGE ~S): ~S is not a valid outgoing message.");



    private static final SubLSymbol CYBLACK_PORT_MANAGER_ROUTE_OUTGOING_MESSAGE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-ROUTE-OUTGOING-MESSAGE-METHOD");

    private static final SubLSymbol ALL_PORTS_ARE_CONNECTED_P = makeSymbol("ALL-PORTS-ARE-CONNECTED-P");

    static private final SubLList $list_alt807 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T))));

    static private final SubLSymbol $sym808$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_ALL_PORTS_ARE_CONNECTED_P_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-ALL-PORTS-ARE-CONNECTED-P-METHOD");

    private static final SubLSymbol ALL_PORTS_WHICH_ARE_NOT_CONNECTED = makeSymbol("ALL-PORTS-WHICH-ARE-NOT-CONNECTED");

    static private final SubLList $list_alt811 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR")))), list(makeSymbol("UNCONNECTED-PORTS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CPUSH"), makeSymbol("PORT"), makeSymbol("UNCONNECTED-PORTS"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CPUSH"), makeSymbol("PORT"), makeSymbol("UNCONNECTED-PORTS"))), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("UNCONNECTED-PORTS"))))));

    static private final SubLSymbol $sym812$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_ALL_PORTS_WHICH_ARE_NOT_CONNECTED_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-ALL-PORTS-WHICH-ARE-NOT-CONNECTED-METHOD");

    private static final SubLSymbol GET_INCOMING_QUEUE = makeSymbol("GET-INCOMING-QUEUE");

    static private final SubLList $list_alt815 = list(list(makeSymbol("PWHEN"), makeSymbol("INCOMING-QUEUE-REFERENCE"), list(RET, makeSymbol("INCOMING-QUEUE-REFERENCE"))), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-INCOMING-QUEUE ~S): No application is associated with this port manager"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-QUEUE-REFERENCE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-INCOMING-MESSAGE-QUEUE")))), list(RET, makeSymbol("INCOMING-QUEUE-REFERENCE")));

    static private final SubLSymbol $sym816$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt817$_GET_INCOMING_QUEUE__S___No_appli = makeString("(GET-INCOMING-QUEUE ~S): No application is associated with this port manager");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_GET_INCOMING_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-GET-INCOMING-QUEUE-METHOD");

    private static final SubLSymbol SET_INCOMING_QUEUE = makeSymbol("SET-INCOMING-QUEUE");

    static private final SubLList $list_alt820 = list(makeSymbol("NEW-INCOMING-QUEUE"));

    static private final SubLList $list_alt821 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-INCOMING-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-INCOMING-QUEUE"))), makeString("(SET-INCOMING-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-INCOMING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-QUEUE-REFERENCE"), makeSymbol("NEW-INCOMING-QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("NEW-INCOMING-QUEUE"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-INCOMING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-INCOMING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")))), list(RET, makeSymbol("NEW-INCOMING-QUEUE")));

    static private final SubLSymbol $sym822$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt823$_SET_INCOMING_QUEUE__S____S_is_no = makeString("(SET-INCOMING-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_SET_INCOMING_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SET-INCOMING-QUEUE-METHOD");

    private static final SubLSymbol GET_OUTGOING_QUEUE = makeSymbol("GET-OUTGOING-QUEUE");

    static private final SubLList $list_alt826 = list(list(RET, makeSymbol("OUTGOING-QUEUE-REFERENCE")));

    private static final SubLSymbol CYBLACK_PORT_MANAGER_GET_OUTGOING_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-GET-OUTGOING-QUEUE-METHOD");

    private static final SubLSymbol SET_OUTGOING_QUEUE = makeSymbol("SET-OUTGOING-QUEUE");

    static private final SubLList $list_alt829 = list(makeSymbol("NEW-OUTGOING-QUEUE"));

    static private final SubLList $list_alt830 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-OUTGOING-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-OUTGOING-QUEUE"))), makeString("(SET-OUTGOING-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-OUTGOING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-QUEUE-REFERENCE"), makeSymbol("NEW-OUTGOING-QUEUE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("NEW-OUTGOING-QUEUE"))), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-OUTGOING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT"), makeSymbol("NEW-OUTGOING-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")))), list(RET, makeSymbol("NEW-OUTGOING-QUEUE")));

    static private final SubLSymbol $sym831$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    static private final SubLString $str_alt832$_SET_OUTGOING_QUEUE__S____S_is_no = makeString("(SET-OUTGOING-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_SET_OUTGOING_QUEUE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SET-OUTGOING-QUEUE-METHOD");

    static private final SubLList $list_alt834 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HARVEST-INPUT"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HARVEST-INPUT"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T))), list(RET, NIL));

    static private final SubLSymbol $sym835$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_HARVEST_INPUT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-HARVEST-INPUT-METHOD");

    private static final SubLSymbol SPAWN_INPUT_HARVESTERS = makeSymbol("SPAWN-INPUT-HARVESTERS");

    static private final SubLList $list_alt838 = list(list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-SERVER-PROCESS-TERMINATE*"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SPAWN-INPUT-HARVESTER"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SPAWN-INPUT-HARVESTER"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T))));

    static private final SubLSymbol $sym839$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_SPAWN_INPUT_HARVESTERS_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-SPAWN-INPUT-HARVESTERS-METHOD");

    private static final SubLSymbol ALL_PORTS_CONNECTED_P = makeSymbol("ALL-PORTS-CONNECTED-P");

    static private final SubLList $list_alt842 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T)), list(makeSymbol("CLET"), list(list(makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("WHILE"), makeSymbol("PORT"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("IS-CONNECTED-P"), makeSymbol("CYBLACK-PORT")), makeSymbol("PORT")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("PORT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PORTS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(RET, T))));

    static private final SubLSymbol $sym843$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_ALL_PORTS_CONNECTED_P_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-ALL-PORTS-CONNECTED-P-METHOD");

    private static final SubLSymbol WAIT_UNTIL_ALL_PORTS_CONNECTED_P = makeSymbol("WAIT-UNTIL-ALL-PORTS-CONNECTED-P");

    static private final SubLList $list_alt846 = list(makeSymbol("TIMEOUT-DELTA"));

    static private final SubLList $list_alt847 = list(list(makeSymbol("CLET"), list(list(makeSymbol("START-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CURRENT-TIME"), makeSymbol("START-TIME"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("ALL-PORTS-CONNECTED-P"), makeSymbol("SELF"))), list(makeSymbol("SLEEP"), ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("-"), makeSymbol("CURRENT-TIME"), makeSymbol("START-TIME")), makeSymbol("TIMEOUT-DELTA")), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("Timed out after ~S seconds.~%"), makeSymbol("TIMEOUT-DELTA")), list(RET, NIL)))), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%All ports connected.~%")), list(makeSymbol("CYBLACK-SPAWN-SERVER-OUTPUT-LOOP"), makeSymbol("SELF")), list(RET, T));

    static private final SubLString $str_alt848$Timed_out_after__S_seconds___ = makeString("Timed out after ~S seconds.~%");

    static private final SubLString $str_alt849$__All_ports_connected___ = makeString("~%All ports connected.~%");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_WAIT_UNTIL_ALL_PORTS_CONNECTED_P_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-WAIT-UNTIL-ALL-PORTS-CONNECTED-P-METHOD");

    private static final SubLSymbol CYBLACK_CURRENT_PORT_MANAGER_STATE = makeSymbol("CYBLACK-CURRENT-PORT-MANAGER-STATE");

    private static final SubLSymbol ENCODE_CYBLACK_CURRENT_PORT_MANAGER_STATE = makeSymbol("ENCODE-CYBLACK-CURRENT-PORT-MANAGER-STATE");

    private static final SubLSymbol DECODE_CYBLACK_CURRENT_PORT_MANAGER_STATE = makeSymbol("DECODE-CYBLACK-CURRENT-PORT-MANAGER-STATE");

    private static final SubLSymbol CYBLACK_CURRENT_PORT_MANAGER_STATE_P = makeSymbol("CYBLACK-CURRENT-PORT-MANAGER-STATE-P");

    static private final SubLString $str_alt855$CYBLACK_SPAWN_SERVER_OUTPUT_LOOP_ = makeString("CYBLACK-SPAWN-SERVER-OUTPUT-LOOP: ~S is not an instance of CYBLACK-PORT-MANAGER.");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS");

    private static final SubLSymbol ADD_PROCESS = makeSymbol("ADD-PROCESS");

    static private final SubLString $str_alt859$CYBLACK_SERVER_OUTPUT_LOOP = makeString("CYBLACK-SERVER-OUTPUT-LOOP");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_LOOP = makeSymbol("CYBLACK-SERVER-OUTPUT-LOOP");

    private static final SubLSymbol CYBLACK_SESSION_QUEUE = makeSymbol("CYBLACK-SESSION-QUEUE");

    static private final SubLList $list_alt862 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-QUEUE-CLASS");













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-QUEUE-INSTANCE");



    static private final SubLList $list_alt872 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt873 = list(list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(ON-ENQUEUE ~S): Enqueued ~S."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF")), list(makeSymbol("IGNORE"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FORCE-OUTPUT"), T), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SESSION_QUEUE_ON_ENQUEUE_METHOD = makeSymbol("CYBLACK-SESSION-QUEUE-ON-ENQUEUE-METHOD");

    static private final SubLList $list_alt875 = list($QUIT, makeKeyword("Q"), makeKeyword("START"), makeKeyword("S"));

    private static final SubLSymbol CYBLACK_PORT_MANAGER_COMMAND_TYPE = makeSymbol("CYBLACK-PORT-MANAGER-COMMAND-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_PORT_MANAGER_COMMAND_TYPE = makeSymbol("ENCODE-CYBLACK-PORT-MANAGER-COMMAND-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_PORT_MANAGER_COMMAND_TYPE = makeSymbol("DECODE-CYBLACK-PORT-MANAGER-COMMAND-TYPE");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_COMMAND_TYPE_P = makeSymbol("CYBLACK-PORT-MANAGER-COMMAND-TYPE-P");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS");

    private static final SubLSymbol HAS_EXTERNAL_KNOWLEDGE_SOURCES_P = makeSymbol("HAS-EXTERNAL-KNOWLEDGE-SOURCES-P");

    static private final SubLString $str_alt882$CYBLACK_PORT_MANAGER_TOP_LEVEL = makeString("CYBLACK-PORT-MANAGER-TOP-LEVEL");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_TOP_LEVEL = makeSymbol("CYBLACK-PORT-MANAGER-TOP-LEVEL");

    public static final SubLFloat $float$10_0 = makeDouble(10.0);

    public static final SubLFloat $float$0_01 = makeDouble(0.01);

    public static final SubLFloat $float$0_2 = makeDouble(0.2);

    static private final SubLList $list_alt887 = list(makeSymbol("SLEEP-INTERVAL"));





    static private final SubLList $list_alt890 = list(makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MAX-SLEEP-INTERVAL*"));

    static private final SubLList $list_alt891 = list(makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-MIN-SLEEP-INTERVAL*"));

    static private final SubLList $list_alt892 = list(makeSymbol("SLEEP-INTERVAL-VAR"));

    static private final SubLSymbol $sym893$_ = makeSymbol("+");

    static private final SubLSymbol $sym894$_ = makeSymbol("*");

    static private final SubLList $list_alt895 = list(makeSymbol("*CYBLACK-PORT-MANAGER-TOP-LEVEL-ACCELERATION-RATE*"));

    static private final SubLSymbol $sym896$_ = makeSymbol("-");





    static private final SubLString $str_alt899$CYBLACK_PORT_MANAGER_TOP_LEVEL__T = makeString("CYBLACK-PORT-MANAGER-TOP-LEVEL: The start command expects an application ~\n                              as the first argument.  ~S is not an application.");

    static private final SubLString $str_alt900$CYBLACK_PORT_MANAGER_TOP_LEVEL___ = makeString("CYBLACK-PORT-MANAGER-TOP-LEVEL: ~S is not a valid command.");

    static private final SubLString $str_alt901$CYBLACK_PORT_MANAGER_CONNECT_APPL = makeString("CYBLACK-PORT-MANAGER-CONNECT-APPLICATION: Application ~S has no knowledge source battery.");

    private static final SubLSymbol GET_ALL_EXTERNAL_KNOWLEDGE_SOURCES = makeSymbol("GET-ALL-EXTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLString $str_alt903$CYBLACK_PORT_MANAGER_CONNECT_APPL = makeString("CYBLACK-PORT-MANAGER-CONNECT-APPLICATION: No message broker is associated with ~S.");

    static private final SubLString $str_alt904$__Starting_server_for_port__S_ = makeString("~%Starting server for port ~S.");

    static private final SubLString $str_alt905$CYBLACK_PORT_SERVER_server_port__ = makeString("CYBLACK-PORT-SERVER server port ~S");

    static private final SubLString $str_alt906$__Waiting_on_server_startup_for_p = makeString("~%Waiting on server startup for port ~S.");

    static private final SubLString $str_alt907$__Finished_waiting_ = makeString("~%Finished waiting.");

    private static final SubLSymbol $CYBLACK_NEW = makeKeyword("CYBLACK-NEW");



    private static final SubLSymbol CYBLACK_SESSION_CONNECTION = makeSymbol("CYBLACK-SESSION-CONNECTION");

    static private final SubLList $list_alt911 = list(new SubLObject[]{ list(makeSymbol("SESSION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SESSION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SESSION-ID"), list(makeSymbol("NEW-SESSION-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-MESSAGE"), list(makeSymbol("INTERNAL-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-MESSAGE-INTERNAL"), list(makeSymbol("EXTERNAL-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNALIZE-MESSAGE"), list(makeSymbol("EXTERNAL-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-EXTERNAL-MESSAGE-RAW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-EXTERNAL-MESSAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS-INCOMING-MESSAGES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("INVITATION-STAGE"), NIL)), makeKeyword("PUBLIC")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CONNECTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CONNECTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SESSION_CONNECTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SESSION-CONNECTION-INSTANCE");

    static private final SubLList $list_alt915 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-SESSION-CONNECTION*"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym916$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SESSION-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_INITIALIZE_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-GET-APPLICATION-METHOD");

    static private final SubLSymbol $sym919$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SESSION-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-SET-APPLICATION-METHOD");

    static private final SubLList $list_alt921 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-MESSAGE-BROKER"), list(RET, makeSymbol("CACHED-MESSAGE-BROKER"))), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-MESSAGE-BROKER ~S): No application is associated with the CYBLACK-SESSION-CONNECTION."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(GET-MESSAGE-BROKER ~S): No message broker is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), makeSymbol("MESSAGE-BROKER")), list(RET, makeSymbol("CACHED-MESSAGE-BROKER"))));

    static private final SubLSymbol $sym922$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SESSION-CONNECTION-METHOD");

    static private final SubLString $str_alt923$_GET_MESSAGE_BROKER__S___No_appli = makeString("(GET-MESSAGE-BROKER ~S): No application is associated with the CYBLACK-SESSION-CONNECTION.");

    static private final SubLString $str_alt924$_GET_MESSAGE_BROKER__S___No_messa = makeString("(GET-MESSAGE-BROKER ~S): No message broker is associated with the application ~S.");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_GET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-GET-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_GET_SESSION_ID_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-GET-SESSION-ID-METHOD");

    static private final SubLList $list_alt927 = list(makeSymbol("NEW-SESSION-ID"));

    static private final SubLList $list_alt928 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-SESSION-ID"))), makeString("(SET-SESSION-ID ~S): ~S is not a valid session id."), makeSymbol("SELF"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), makeSymbol("NEW-SESSION-ID")), list(RET, makeSymbol("NEW-SESSION-ID")));

    static private final SubLSymbol $sym929$OUTER_CATCH_FOR_CYBLACK_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SESSION-CONNECTION-METHOD");

    static private final SubLString $str_alt930$_SET_SESSION_ID__S____S_is_not_a_ = makeString("(SET-SESSION-ID ~S): ~S is not a valid session id.");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_SET_SESSION_ID_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-SET-SESSION-ID-METHOD");

    private static final SubLSymbol EXTERNALIZE_MESSAGE = makeSymbol("EXTERNALIZE-MESSAGE");

    static private final SubLList $list_alt933 = list(makeSymbol("INTERNAL-MESSAGE"));

    static private final SubLList $list_alt934 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("INTERNAL-MESSAGE")), makeString("(EXTERNALIZE-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE."), makeSymbol("SELF"), makeSymbol("INTERNAL-MESSAGE")), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXTERNALIZE-MESSAGE-INTERNAL")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERNAL-MESSAGE"), list(QUOTE, makeSymbol("TO-LIST"))))));

    static private final SubLString $str_alt935$_EXTERNALIZE_MESSAGE__S____S_is_n = makeString("(EXTERNALIZE-MESSAGE ~S): ~S is not an instance of CYBLACK-MESSAGE.");

    private static final SubLSymbol EXTERNALIZE_MESSAGE_INTERNAL = makeSymbol("EXTERNALIZE-MESSAGE-INTERNAL");



    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-METHOD");

    static private final SubLList $list_alt939 = list(makeSymbol("EXTERNAL-MESSAGE"));

    static private final SubLList $list_alt940 = list(list(makeSymbol("IGNORE"), makeSymbol("EXTERNAL-MESSAGE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_INTERNAL_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-INTERNAL-METHOD");

    private static final SubLSymbol INTERNALIZE_MESSAGE = makeSymbol("INTERNALIZE-MESSAGE");

    static private final SubLList $list_alt943 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("GET-MESSAGE-BROKER"), makeSymbol("SELF"))), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE-BROKER"), list(QUOTE, makeSymbol("RECEIVE")), makeSymbol("EXTERNAL-MESSAGE")))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_INTERNALIZE_MESSAGE_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-INTERNALIZE-MESSAGE-METHOD");

    private static final SubLSymbol READ_EXTERNAL_MESSAGE = makeSymbol("READ-EXTERNAL-MESSAGE");

    static private final SubLList $list_alt946 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("CLET"), list(list(makeSymbol("RAW-MESSAGE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("READ-EXTERNAL-MESSAGE-RAW"))))), list(makeSymbol("PWHEN"), makeSymbol("RAW-MESSAGE"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("INTERNALIZE-MESSAGE"), makeSymbol("SELF"), makeSymbol("RAW-MESSAGE")))))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol READ_EXTERNAL_MESSAGE_RAW = makeSymbol("READ-EXTERNAL-MESSAGE-RAW");

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-METHOD");

    static private final SubLList $list_alt949 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_RAW_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-RAW-METHOD");

    private static final SubLSymbol PROCESS_INCOMING_MESSAGES = makeSymbol("PROCESS-INCOMING-MESSAGES");

    static private final SubLList $list_alt952 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("INVITATION-STAGE"), NIL));

    static private final SubLList $list_alt953 = list(list(makeSymbol("IGNORE"), makeSymbol("INVITATION-STAGE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_SESSION_CONNECTION_PROCESS_INCOMING_MESSAGES_METHOD = makeSymbol("CYBLACK-SESSION-CONNECTION-PROCESS-INCOMING-MESSAGES-METHOD");

    private static final SubLSymbol CYBLACK_QUEUE_BASED_SESSION_CONNECTION = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION");

    static private final SubLList $list_alt956 = list(new SubLObject[]{ list(makeSymbol("INCOMING-MESSAGE-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-MESSAGE-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), list(makeSymbol("NEW-INCOMING-MESSAGE-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTGOING-MESSAGE-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), list(makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCOMING-MESSAGES-AVAILABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTGOING-MESSAGES-AVAILABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNALIZE-MESSAGE-INTERNAL"), list(makeSymbol("EXTERNAL-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-EXTERNAL-MESSAGE-RAW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS-INCOMING-MESSAGES"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("INVITATION-STAGE"), NIL)), makeKeyword("PUBLIC")) });

    static private final SubLSymbol $sym957$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUEUE_BASED_SESSION_CONNECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-CLASS");

    static private final SubLSymbol $sym958$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUEUE_BASED_SESSION_CONNECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INSTANCE");

    static private final SubLList $list_alt959 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-MESSAGE-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym960$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_QUEUE_BASED_SESSION_CONNECTION_INITIALIZE_METHOD = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INITIALIZE-METHOD");

    static private final SubLSymbol $sym962$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-APPLICATION-METHOD");

    static private final SubLList $list_alt964 = list(list(makeSymbol("PWHEN"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(RET, makeSymbol("INCOMING-MESSAGE-QUEUE"))), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-INCOMING-MESSAGE-QUEUE ~S): No application is associated with this session connection."), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-INCOMING-MESSAGE-QUEUE")))), list(RET, makeSymbol("INCOMING-MESSAGE-QUEUE")));

    static private final SubLSymbol $sym965$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLString $str_alt966$_GET_INCOMING_MESSAGE_QUEUE__S___ = makeString("(GET-INCOMING-MESSAGE-QUEUE ~S): No application is associated with this session connection.");

    static private final SubLSymbol $sym967$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_GET_INCOMING_MESSAGE_QUEUE = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-GET-INCOMING-MESSAGE-QUEUE-METHOD");

    static private final SubLList $list_alt968 = list(makeSymbol("NEW-INCOMING-MESSAGE-QUEUE"));

    static private final SubLList $list_alt969 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-INCOMING-MESSAGE-QUEUE"))), makeString("(SET-INCOMING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), makeSymbol("NEW-INCOMING-MESSAGE-QUEUE")), list(RET, makeSymbol("NEW-INCOMING-MESSAGE-QUEUE")));

    static private final SubLSymbol $sym970$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym971$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_INCOMING_MESSAGE_QUEUE = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-INCOMING-MESSAGE-QUEUE-METHOD");

    static private final SubLSymbol $sym972$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_GET_OUTGOING_MESSAGE_QUEUE = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-GET-OUTGOING-MESSAGE-QUEUE-METHOD");

    static private final SubLList $list_alt973 = list(makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE"));

    static private final SubLList $list_alt974 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), list(makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE"))), makeString("(SET-OUTGOING-MESSAGE-QUEUE ~S): ~S is not an instance of ASYNCH-BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-MESSAGE-QUEUE"), makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")), list(RET, makeSymbol("NEW-OUTGOING-MESSAGE-QUEUE")));

    static private final SubLSymbol $sym975$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym976$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_SET_OUTGOING_MESSAGE_QUEUE = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-SET-OUTGOING-MESSAGE-QUEUE-METHOD");

    private static final SubLSymbol INCOMING_MESSAGES_AVAILABLE_P = makeSymbol("INCOMING-MESSAGES-AVAILABLE-P");

    static private final SubLList $list_alt978 = list(list(makeSymbol("PUNLESS"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(RET, NIL)), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-MESSAGE-QUEUE")))));

    static private final SubLSymbol $sym979$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym980$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_INCOMING_MESSAGES_AVAILABL = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-INCOMING-MESSAGES-AVAILABLE-P-METHOD");

    private static final SubLSymbol OUTGOING_MESSAGES_AVAILABLE_P = makeSymbol("OUTGOING-MESSAGES-AVAILABLE-P");

    static private final SubLList $list_alt982 = list(list(makeSymbol("PUNLESS"), makeSymbol("OUTGOING-MESSAGE-QUEUE"), list(RET, NIL)), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-MESSAGE-QUEUE")))));

    static private final SubLSymbol $sym983$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym984$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_OUTGOING_MESSAGES_AVAILABL = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-OUTGOING-MESSAGES-AVAILABLE-P-METHOD");

    static private final SubLList $list_alt985 = list(list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("EXTERNAL-MESSAGE")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-MESSAGE-QUEUE"), makeSymbol("EXTERNAL-MESSAGE")), list(RET, NIL));

    static private final SubLSymbol $sym986$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym987$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_EXTERNALIZE_MESSAGE_INTERN = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-EXTERNALIZE-MESSAGE-INTERNAL-METHOD");

    static private final SubLList $list_alt988 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-MESSAGE-QUEUE")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-MESSAGE-QUEUE")))), list(RET, NIL));

    static private final SubLSymbol $sym989$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLSymbol $sym990$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_READ_EXTERNAL_MESSAGE_RAW_ = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-READ-EXTERNAL-MESSAGE-RAW-METHOD");

    static private final SubLList $list_alt991 = list(list(makeSymbol("IGNORE"), makeSymbol("INVITATION-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("*SESSION-CONNECTION*"), makeSymbol("SELF")), list(makeSymbol("PUNLESS"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(makeSymbol("GET-INCOMING-MESSAGE-QUEUE"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("GET-MESSAGE-BROKER"), makeSymbol("SELF"))), makeSymbol("MESSAGE")), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(PROCESS-INCOMING-MESSAGES ~S): Could not find the message broker."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT"), NIL), list(makeSymbol("AGENDA"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-AGENDA"), makeSymbol("APPLICATION")), NIL)), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")), NIL))), list(makeSymbol("WHILE"), list(makeSymbol("OUTGOING-MESSAGES-AVAILABLE-P"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("AGENDA"), makeSymbol("BLACKBOARD")), list(makeSymbol("CLET"), list(list(makeSymbol("EVENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE-EVENT"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("AGENDA")))), list(makeSymbol("PWHEN"), makeSymbol("EVENT"), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("BLACKBOARD"), makeSymbol("EVENT"))))), list(makeSymbol("SLEEP"), makeDouble(0.5))), list(makeSymbol("WHILE"), list(makeSymbol("INCOMING-MESSAGES-AVAILABLE-P"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("AGENDA"), makeSymbol("BLACKBOARD")), list(makeSymbol("CLET"), list(list(makeSymbol("EVENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE-EVENT"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("AGENDA")))), list(makeSymbol("PWHEN"), makeSymbol("EVENT"), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("BLACKBOARD"), makeSymbol("EVENT"))))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT"), list(makeSymbol("READ-EXTERNAL-MESSAGE-RAW"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQ, makeSymbol("CURRENT"), makeKeyword("DISCONNECTED")), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("CURRENT")), list(makeSymbol("CYBLACK-INTERNAL-STRING-EQUAL-P"), makeSymbol("CURRENT"), makeString(":DISCONNECTED")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALT")))), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE-BROKER"), list(QUOTE, makeSymbol("RECEIVE")), makeSymbol("CURRENT"))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MESSAGE"), list(QUOTE, makeSymbol("EXECUTE"))))))), list(RET, NIL));

    static private final SubLSymbol $sym992$OUTER_CATCH_FOR_CYBLACK_QUEUE_BASED_SESSION_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUEUE-BASED-SESSION-CONNECTION-METHOD");

    static private final SubLString $str_alt993$_PROCESS_INCOMING_MESSAGES__S___C = makeString("(PROCESS-INCOMING-MESSAGES ~S): Could not find the message broker.");

    private static final SubLSymbol $DISCONNECTED = makeKeyword("DISCONNECTED");

    static private final SubLString $str_alt995$_DISCONNECTED = makeString(":DISCONNECTED");



    static private final SubLSymbol $sym997$CYBLACK_QUEUE_BASED_SESSION_CONNECTION_PROCESS_INCOMING_MESSAGES_ = makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION-PROCESS-INCOMING-MESSAGES-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-EXTERNAL-CONNECTION");

    static private final SubLList $list_alt999 = list(list(makeSymbol("SESSION-CONNECTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-SESSION-CONNECTION"), list(makeSymbol("SESSION-ID"), makeSymbol("SESSION-CONNECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("READ-EXTERNAL-MESSAGE"), list(makeSymbol("SESSION-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WRITE-EXTERNAL-MESSAGE"), list(makeSymbol("SESSION-ID"), makeSymbol("MESSAGE-AS-STRING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SESSION_CONNECTIONS = makeSymbol("SESSION-CONNECTIONS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_CONNECTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-CONNECTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_CONNECTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-CONNECTION-INSTANCE");

    static private final SubLList $list_alt1003 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-CONNECTIONS"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1004$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-GET-APPLICATION-METHOD");

    static private final SubLSymbol $sym1007$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-SET-APPLICATION-METHOD");

    private static final SubLSymbol REGISTER_SESSION_CONNECTION = makeSymbol("REGISTER-SESSION-CONNECTION");

    static private final SubLList $list_alt1010 = list(makeSymbol("SESSION-ID"), makeSymbol("SESSION-CONNECTION"));

    static private final SubLList $list_alt1011 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("SESSION-ID")), makeString("(REGISTER-SESSION-CONNECTION ~S): ~S is not a valid session id."), makeSymbol("SELF"), makeSymbol("SESSION-ID")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-SESSION-CONNECTION-P"), makeSymbol("SESSION-CONNECTION")), makeString("(REGISTER-SESSION-CONNECTION ~S): ~S is not an instance of CYBLACK-SESSION-CONNECTION."), makeSymbol("SELF"), makeSymbol("SESSION-CONNECTION")), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(REGISTER-SESSION-CONNECTION ~S): Cannot register a session connection without an associated application."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-SESSION-CONNECTION")), makeSymbol("SESSION-CONNECTION"), makeSymbol("APPLICATION")), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("SESSION-CONNECTIONS"), makeSymbol("SESSION-ID"), makeSymbol("SESSION-CONNECTION")), list(RET, T));

    static private final SubLSymbol $sym1012$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-CONNECTION-METHOD");

    static private final SubLString $str_alt1013$_REGISTER_SESSION_CONNECTION__S__ = makeString("(REGISTER-SESSION-CONNECTION ~S): ~S is not a valid session id.");

    static private final SubLString $str_alt1014$_REGISTER_SESSION_CONNECTION__S__ = makeString("(REGISTER-SESSION-CONNECTION ~S): ~S is not an instance of CYBLACK-SESSION-CONNECTION.");

    static private final SubLString $str_alt1015$_REGISTER_SESSION_CONNECTION__S__ = makeString("(REGISTER-SESSION-CONNECTION ~S): Cannot register a session connection without an associated application.");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_REGISTER_SESSION_CONNECTION_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-REGISTER-SESSION-CONNECTION-METHOD");

    static private final SubLList $list_alt1017 = list(makeSymbol("SESSION-ID"));

    static private final SubLList $list_alt1018 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("SESSION-ID")), makeString("(READ-EXTERNAL-MESSAGE ~S): ~S is not a valid session id."), makeSymbol("SELF"), makeSymbol("SESSION-ID")), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("SESSION-CONNECTIONS"), makeSymbol("SESSION-ID"), NIL)), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PUNLESS"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(READ-EXTERNAL-MESSAGE ~S): ~S has no associated application."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION-CLASS"), list(QUOTE, makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION"))), list(makeSymbol("PORT-MANAGER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-PORT-MANAGER")))), list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("MUST"), makeSymbol("CONNECTION-CLASS"), makeString("(READ-EXTERNAL-MESSAGE ~S): No connection class is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PORT-MANAGER"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("CONNECTION-CLASS"))), list(makeSymbol("OUTGOING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-OUTGOING-QUEUE"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"))), list(makeSymbol("INCOMING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-INCOMING-QUEUE"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-CONNECTION"), makeSymbol("CONNECTION")), list(makeSymbol("REGISTER-SESSION-CONNECTION"), makeSymbol("SELF"), makeSymbol("SESSION-ID"), makeSymbol("CONNECTION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("CONNECTION"), makeSymbol("OUTGOING-QUEUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("CONNECTION"), makeSymbol("INCOMING-QUEUE")))))), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("READ-EXTERNAL-MESSAGE"))))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym1019$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-CONNECTION-METHOD");

    static private final SubLString $str_alt1020$_READ_EXTERNAL_MESSAGE__S____S_is = makeString("(READ-EXTERNAL-MESSAGE ~S): ~S is not a valid session id.");

    static private final SubLString $str_alt1021$_READ_EXTERNAL_MESSAGE__S____S_ha = makeString("(READ-EXTERNAL-MESSAGE ~S): ~S has no associated application.");

    private static final SubLSymbol GET_PORT_MANAGER = makeSymbol("GET-PORT-MANAGER");

    static private final SubLString $str_alt1023$_READ_EXTERNAL_MESSAGE__S___No_co = makeString("(READ-EXTERNAL-MESSAGE ~S): No connection class is associated with application ~S.");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_READ_EXTERNAL_MESSAGE_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-READ-EXTERNAL-MESSAGE-METHOD");

    static private final SubLList $list_alt1025 = list(makeSymbol("SESSION-ID"), makeSymbol("MESSAGE"));

    static private final SubLList $list_alt1026 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("SESSION-ID")), makeString("(WRITE-EXTERNAL-MESSAGE ~S): ~S is not a valid session id."), makeSymbol("SELF"), makeSymbol("SESSION-ID")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-P"), makeSymbol("MESSAGE")), makeString("(WRITE-EXTERNAL-MESSAGE ~S): ~S is not a valid message."), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("SESSION-CONNECTIONS"), makeSymbol("SESSION-ID"), NIL)), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PUNLESS"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(READ-EXTERNAL-MESSAGE ~S): ~S has no associated application."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION-CLASS"), list(QUOTE, makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION"))), list(makeSymbol("PORT-MANAGER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-PORT-MANAGER")))), list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("MUST"), makeSymbol("CONNECTION-CLASS"), makeString("(READ-EXTERNAL-MESSAGE ~S): No connection class is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PORT-MANAGER"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("CONNECTION"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("CONNECTION-CLASS"))), list(makeSymbol("OUTGOING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-OUTGOING-QUEUE"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER"))), list(makeSymbol("INCOMING-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-INCOMING-QUEUE"), makeSymbol("CYBLACK-PORT-MANAGER")), makeSymbol("PORT-MANAGER")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-CONNECTION"), makeSymbol("CONNECTION")), list(makeSymbol("REGISTER-SESSION-CONNECTION"), makeSymbol("SELF"), makeSymbol("SESSION-ID"), makeSymbol("CONNECTION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTGOING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("CONNECTION"), makeSymbol("OUTGOING-QUEUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INCOMING-MESSAGE-QUEUE"), makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")), makeSymbol("CONNECTION"), makeSymbol("INCOMING-QUEUE")))))), list(makeSymbol("WITH-CYBLACK-PACKAGE"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("EXTERNALIZE-MESSAGE")), makeSymbol("MESSAGE")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym1027$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-CONNECTION-METHOD");

    static private final SubLString $str_alt1028$_WRITE_EXTERNAL_MESSAGE__S____S_i = makeString("(WRITE-EXTERNAL-MESSAGE ~S): ~S is not a valid session id.");

    static private final SubLString $str_alt1029$_WRITE_EXTERNAL_MESSAGE__S____S_i = makeString("(WRITE-EXTERNAL-MESSAGE ~S): ~S is not a valid message.");

    private static final SubLSymbol CYBLACK_EXTERNAL_CONNECTION_WRITE_EXTERNAL_MESSAGE_METHOD = makeSymbol("CYBLACK-EXTERNAL-CONNECTION-WRITE-EXTERNAL-MESSAGE-METHOD");

    static private final SubLList $list_alt1031 = list(list(makeSymbol("SESSION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SESSION-CONNECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SESSION-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSIGN-MESSAGE-BROKER"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SESSION-ID"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym1033$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STANDARD_EXTERNAL_CONNECTION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STANDARD-EXTERNAL-CONNECTION-CLASS");

    static private final SubLSymbol $sym1034$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STANDARD_EXTERNAL_CONNECTION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STANDARD-EXTERNAL-CONNECTION-INSTANCE");

    static private final SubLList $list_alt1035 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-QUEUE-BASED-SESSION-CONNECTION")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1036$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STANDARD-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION_INITIALIZE_METHOD = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SESSION_CONNECTION = makeSymbol("GET-SESSION-CONNECTION");

    static private final SubLList $list_alt1039 = list(list(RET, makeSymbol("SESSION-CONNECTION")));

    static private final SubLSymbol $sym1040$CYBLACK_STANDARD_EXTERNAL_CONNECTION_GET_SESSION_CONNECTION_METHO = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION-GET-SESSION-CONNECTION-METHOD");

    private static final SubLSymbol ASSIGN_MESSAGE_BROKER = makeSymbol("ASSIGN-MESSAGE-BROKER");

    static private final SubLList $list_alt1042 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER-SESSION-ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-MESSAGE-BROKER"), list(QUOTE, makeSymbol("GET-SESSION-ID"))))), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), makeSymbol("MESSAGE-BROKER-SESSION-ID")), list(makeSymbol("REGISTER-SESSION-CONNECTION"), makeSymbol("SELF"), makeSymbol("SESSION-ID"), makeSymbol("SESSION-CONNECTION")), list(RET, makeSymbol("NEW-MESSAGE-BROKER"))));

    static private final SubLSymbol $sym1043$OUTER_CATCH_FOR_CYBLACK_STANDARD_EXTERNAL_CONNECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STANDARD-EXTERNAL-CONNECTION-METHOD");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION_ASSIGN_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION-ASSIGN-MESSAGE-BROKER-METHOD");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION_GET_SESSION_ID_METHOD = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION-GET-SESSION-ID-METHOD");

    private static final SubLSymbol CYBLACK_NEW_SERVER_HANDLER = makeSymbol("CYBLACK-NEW-SERVER-HANDLER");



    static private final SubLString $str_alt1048$__CYBLACK_PORT_SERVER_TOP_LEVEL__ = makeString("~%CYBLACK-PORT-SERVER-TOP-LEVEL: Entered.");

    static private final SubLString $$$CYC = makeString("CYC");



    private static final SubLSymbol $CYBLACK_NEW_QUIT = makeKeyword("CYBLACK-NEW-QUIT");

    private static final SubLSymbol SINGLE_FLOAT = makeSymbol("SINGLE-FLOAT");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_375_initializer() {
        return list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("STRINGP"), makeSymbol("MESSAGE-AS-STRING")), list(makeSymbol("LISTP"), makeSymbol("MESSAGE-AS-STRING"))), makeString("(RECEIVE ~S): ~S is neither a string nor a list."), makeSymbol("SELF"), makeSymbol("MESSAGE-AS-STRING")), list(makeSymbol("MUST"), makeSymbol("GUID-MANAGER"), makeString("(RECEIVE ~S): No guid manager is associated with this message broker."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("LISTIFIED-MESSAGE"), list(makeSymbol("FIF"), list(makeSymbol("LISTP"), makeSymbol("MESSAGE-AS-STRING")), makeSymbol("MESSAGE-AS-STRING"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("MESSAGE-AS-STRING"), makeKeyword("ERROR"), makeKeyword("EOF"))))), list(makeSymbol("PCASE"), makeSymbol("LISTIFIED-MESSAGE"), list(makeKeyword("EOF"), list(makeSymbol("WARN"), makeString("(RECEIVE ~S): Encountered EOF while reading message."), makeSymbol("SELF"))), list(makeKeyword("ERROR"), list(makeSymbol("WARN"), makeString("(RECEIVE ~S): Encountered ERROR while reading message."), makeSymbol("SELF"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("LISTIFIED-MESSAGE")), list(makeSymbol("WARN"), makeString("(RECEIVE ~S): Received NIL while reading message."), makeSymbol("SELF"))), list(list(makeSymbol("CONSP"), makeSymbol("LISTIFIED-MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-HEAD"), list(makeSymbol("CAR"), makeSymbol("LISTIFIED-MESSAGE"))), list(makeSymbol("MESSAGE-ARGS"), list(makeSymbol("CDR"), makeSymbol("LISTIFIED-MESSAGE"))), list(makeSymbol("NEW-MESSAGE"), NIL)), list(new SubLObject[]{ makeSymbol("PCASE"), makeSymbol("MESSAGE-HEAD"), list(makeKeyword("ACCEPT"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ACCEPT-MESSAGE"))))), list(makeKeyword("REJECT"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REJECT-MESSAGE"))))), list(makeKeyword("PROPOSE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-PROPOSE-MESSAGE"))))), list(makeKeyword("DECLINE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-DECLINE-MESSAGE"))))), list(makeKeyword("REVOKE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REVOKE-MESSAGE"))))), list(makeKeyword("AFFIRM"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-AFFIRM-MESSAGE"))))), list(makeKeyword("CONTRIBUTE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE"))))), list(makeKeyword("ACQUIT"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ACQUIT-MESSAGE"))))), list(makeKeyword("TERMINATE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-TERMINATE-MESSAGE"))))), list(makeKeyword("REQUEST-CONTENTS"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-P"), makeSymbol("APPLICATION")), list(makeSymbol("PCASE"), makeSymbol("MESSAGE-HEAD"), list(makeKeyword("ADD-KNOWLEDGE-SOURCE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE"))))), list(makeKeyword("REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE"))))), list(makeKeyword("ADD-POSTING-CLASS"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE"))))), list(makeKeyword("ADD-PANEL"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ADD-PANEL-MESSAGE"))))), list(makeKeyword("REMOVE-PANEL"), list(makeSymbol("CSETQ"), makeSymbol("NEW-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("WARN"), makeString("(RECEIVE ~S): Unknown message type ~S received."), makeSymbol("SELF"), makeSymbol("MESSAGE-HEAD")))), list(makeSymbol("WARN"), makeString("(RECEIVE ~S): Unknown message type ~S received."), makeSymbol("SELF"), makeSymbol("MESSAGE-HEAD")))) }), list(makeSymbol("PWHEN"), makeSymbol("NEW-MESSAGE"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("KS"), NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-MESSAGE"), list(QUOTE, makeSymbol("PARSE-ARGS")), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE-BROKER"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("EXTERNAL-MODULE-GIVEN-EMID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE-ID")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("EXTERNAL-MODULE-GIVEN-EMID"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-MODULE-GIVEN-EMID"))), list(makeSymbol("PCOND"), list(list(makeSymbol("CYBLACK-RECEIVE-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-MODULE-GIVEN-EMID"), list(makeSymbol("CSETQ"), makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"), list(makeSymbol("FIF"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-NAME"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("KNOWLEDGE-SOURCE")), makeString("")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("KS"))), list(list(makeSymbol("CYBLACK-MODIFICATION-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-MODULE-GIVEN-EMID"), list(makeSymbol("CSETQ"), makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-MODIFICATION-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("KS"))))))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-MESSAGE-TRANSACTION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("RECEIVE-MESSAGE-CAUSE"), list(makeSymbol("FIF"), makeSymbol("NEW-MESSAGE-TRANSACTION-ID"), list(makeSymbol("GET-CAUSE"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-MESSAGE")), makeSymbol("NEW-MESSAGE"))), NIL))), list(makeSymbol("PIF"), makeSymbol("RECEIVE-MESSAGE-CAUSE"), list(makeSymbol("PROGN"), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CAUSE"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("RECEIVE-MESSAGE-CAUSE"))), list(makeSymbol("CLET"), list(list(makeSymbol("RM-SID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("RM-TID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("RM-EMID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE")))), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("PCOND"), list(list(makeSymbol("CYBLACK-PROPOSE-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("RM-PROPID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPID"), makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-STIMULATE-MESSAGE"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TIMESTAMP-NOW"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-IMPLICIT"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), makeSymbol("KS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), makeSymbol("RM-SID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), makeSymbol("RM-TID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), makeSymbol("RM-EMID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE")), makeSymbol("IMPLICIT-STIMULATE-MESSAGE"), makeSymbol("RM-PROPID")), list(makeSymbol("ASSOCIATE-COMMON-IDS"), makeSymbol("SELF"), makeSymbol("IMPLICIT-STIMULATE-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("RECORD-USE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("RM-PROPID"), makeSymbol("IMPLICIT-STIMULATE-MESSAGE")) })), list(list(makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("CLET"), list(list(makeSymbol("CM-PROPID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPID"), makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE")), makeSymbol("NEW-MESSAGE")))), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("PIF"), makeSymbol("CM-PROPID"), list(makeSymbol("CLET"), list(list(makeSymbol("PROPOSAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("CM-PROPID")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PROPOSAL"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATED-P"), makeSymbol("OBJECT")), makeSymbol("PROPOSAL")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("OBJECT")), makeSymbol("PROPOSAL")))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("EXECUTE-MESSAGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-EXECUTE-MESSAGE")))), list(makeSymbol("NEW-PROPID"), list(makeSymbol("NEW-PROPOSAL-ID"), makeSymbol("SELF"))), list(makeSymbol("NEW-TID"), list(makeSymbol("FIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE")), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SESSION-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SESSION-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("EXECUTE-MESSAGE"), makeSymbol("NEW-TID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INTERN"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("NEW-TID"), makeKeyword("TRANSACTION"), makeSymbol("EXECUTE-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPID"), makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("NEW-PROPID")), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-EXECUTE-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("NEW-TID")) })))), list(list(makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-P"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("CLET"), list(list(makeSymbol("EXISTING-TID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TRANSACTION-ID"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(makeSymbol("NEW-TID"), list(makeSymbol("FIF"), makeSymbol("EXISTING-TID"), makeSymbol("EXISTING-TID"), list(makeSymbol("NEW-TRANSACTION-ID"), makeSymbol("SELF"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE")), makeSymbol("NEW-MESSAGE"), makeSymbol("NEW-TID")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INTERN"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("NEW-TID"), makeKeyword("TRANSACTION"), makeSymbol("NEW-MESSAGE"))))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TIMESTAMP-NOW"), makeSymbol("CYBLACK-RECEIVE-MESSAGE")), makeSymbol("NEW-MESSAGE"))), list(RET, makeSymbol("NEW-MESSAGE")) })))))))), list(RET, NIL));
    }

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_message_broker_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_message_broker_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_message_broker_file();
    }
}

