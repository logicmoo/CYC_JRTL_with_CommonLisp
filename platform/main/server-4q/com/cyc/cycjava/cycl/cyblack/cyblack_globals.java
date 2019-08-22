/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      CYBLACK-GLOBALS
 *  source file: /cyc/top/cycl/cyblack/cyblack-globals.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_globals extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_globals() {
    }

    public static final SubLFile me = new cyblack_globals();


    // // Definitions
    // defparameter
    public static final SubLSymbol $cyblack_type_checking_on$ = makeSymbol("*CYBLACK-TYPE-CHECKING-ON*");

    /**
     * Enumerated values of type CYBLACK-KNOWLEDGE-SOURCE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_knowledge_source_types$ = makeSymbol("*VALID-CYBLACK-KNOWLEDGE-SOURCE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_knowledge_source_types() {
        return $valid_cyblack_knowledge_source_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration.
     */
    public static final SubLObject cyblack_knowledge_source_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_knowledge_source_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_knowledge_source_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_knowledge_source_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_KNOWLEDGE_SOURCE_TYPE, value, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_knowledge_source_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_knowledge_source_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_KNOWLEDGE_SOURCE_TYPE, value, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration.
     */
    public static final SubLObject cyblack_knowledge_source_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_KNOWLEDGE_SOURCE_TYPE_P, value1, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_KNOWLEDGE_SOURCE_TYPE_P, value2, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_knowledge_source_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-KNOWLEDGE-SOURCE-TYPE enumeration.
     */
    public static final SubLObject cyblack_knowledge_source_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_KNOWLEDGE_SOURCE_TYPE_P, value1, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_knowledge_source_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_KNOWLEDGE_SOURCE_TYPE_P, value2, CYBLACK_KNOWLEDGE_SOURCE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_knowledge_source_types$.getGlobalValue();
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

    /**
     * Enumerated values of type CYBLACK-CONNECTION-MODE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_connection_mode_types$ = makeSymbol("*VALID-CYBLACK-CONNECTION-MODE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-CONNECTION-MODE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_connection_mode_types() {
        return $valid_cyblack_connection_mode_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CONNECTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_connection_mode_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_connection_mode_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CONNECTION-MODE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_connection_mode_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_connection_mode_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CONNECTION_MODE_TYPE, value, CYBLACK_CONNECTION_MODE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CONNECTION-MODE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_connection_mode_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_connection_mode_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CONNECTION_MODE_TYPE, value, CYBLACK_CONNECTION_MODE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CONNECTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_connection_mode_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_connection_mode_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONNECTION_MODE_TYPE_P, value1, CYBLACK_CONNECTION_MODE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_connection_mode_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONNECTION_MODE_TYPE_P, value2, CYBLACK_CONNECTION_MODE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_connection_mode_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CONNECTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_connection_mode_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_connection_mode_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONNECTION_MODE_TYPE_P, value1, CYBLACK_CONNECTION_MODE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_connection_mode_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONNECTION_MODE_TYPE_P, value2, CYBLACK_CONNECTION_MODE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_connection_mode_types$.getGlobalValue();
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

    // defvar
    public static final SubLSymbol $cyblack_connection_modes$ = makeSymbol("*CYBLACK-CONNECTION-MODES*");

    // defvar
    public static final SubLSymbol $cyblack_open_ports$ = makeSymbol("*CYBLACK-OPEN-PORTS*");





    // defvar
    public static final SubLSymbol $cyblack_package$ = makeSymbol("*CYBLACK-PACKAGE*");

    // defvar
    public static final SubLSymbol $cyblack_io_stream_monitor$ = makeSymbol("*CYBLACK-IO-STREAM-MONITOR*");

    // defvar
    public static final SubLSymbol $cyblack_server_process_terminate$ = makeSymbol("*CYBLACK-SERVER-PROCESS-TERMINATE*");

    // defvar
    public static final SubLSymbol $cyblack_monitor_posts$ = makeSymbol("*CYBLACK-MONITOR-POSTS*");

    // defparameter
    public static final SubLSymbol $cyblack_server_initialized$ = makeSymbol("*CYBLACK-SERVER-INITIALIZED*");

    // defparameter
    public static final SubLSymbol $virb3_incoming_queue$ = makeSymbol("*VIRB3-INCOMING-QUEUE*");

    // defparameter
    public static final SubLSymbol $virb3_outgoing_queue$ = makeSymbol("*VIRB3-OUTGOING-QUEUE*");

    // defparameter
    public static final SubLSymbol $virb3_command_queue$ = makeSymbol("*VIRB3-COMMAND-QUEUE*");

    // defparameter
    public static final SubLSymbol $within_virb3_server$ = makeSymbol("*WITHIN-VIRB3-SERVER*");

    // defparameter
    public static final SubLSymbol $virb3_server_process_terminate$ = makeSymbol("*VIRB3-SERVER-PROCESS-TERMINATE*");

    // defparameter
    public static final SubLSymbol $virb3_input_stream$ = makeSymbol("*VIRB3-INPUT-STREAM*");

    // defparameter
    public static final SubLSymbol $virb3_output_stream$ = makeSymbol("*VIRB3-OUTPUT-STREAM*");

    public static final SubLObject cyblack_create_server_queues() {
        format(T, $str_alt15$__Creating_Server_Queues___);
        force_output(T);
        $virb3_incoming_queue$.setDynamicValue(object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE));
        $virb3_outgoing_queue$.setDynamicValue(object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE));
        $virb3_command_queue$.setDynamicValue(object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE));
        return T;
    }

    // defparameter
    public static final SubLSymbol $cyblack_io_stream_monitor_default_input$ = makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-INPUT*");

    // defparameter
    public static final SubLSymbol $cyblack_io_stream_monitor_default_output$ = makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-OUTPUT*");

    // defparameter
    public static final SubLSymbol $cyblack_io_loop_continue$ = makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*");

    public static final SubLObject cyblack_tracing_format(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, $cyblack_tracing_on$, listS(FORMAT, $cyblack_tracing_output_stream$, format_string, args));
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-EXECUTION-MODE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_execution_mode_types$ = makeSymbol("*VALID-CYBLACK-EXECUTION-MODE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-EXECUTION-MODE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_execution_mode_types() {
        return $valid_cyblack_execution_mode_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-EXECUTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_execution_mode_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_execution_mode_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-EXECUTION-MODE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_execution_mode_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_execution_mode_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_EXECUTION_MODE_TYPE, value, CYBLACK_EXECUTION_MODE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-EXECUTION-MODE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_execution_mode_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_execution_mode_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_EXECUTION_MODE_TYPE, value, CYBLACK_EXECUTION_MODE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-EXECUTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_execution_mode_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execution_mode_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTION_MODE_TYPE_P, value1, CYBLACK_EXECUTION_MODE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execution_mode_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTION_MODE_TYPE_P, value2, CYBLACK_EXECUTION_MODE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_execution_mode_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-EXECUTION-MODE-TYPE enumeration.
     */
    public static final SubLObject cyblack_execution_mode_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execution_mode_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTION_MODE_TYPE_P, value1, CYBLACK_EXECUTION_MODE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execution_mode_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTION_MODE_TYPE_P, value2, CYBLACK_EXECUTION_MODE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_execution_mode_types$.getGlobalValue();
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

    public static final SubLObject cyblack_synchronous_p(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            expression = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(EQ, expression, $list_alt28);
            } else {
                cdestructuring_bind_error(datum, $list_alt27);
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_asynchronous_p(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            expression = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(EQ, expression, $list_alt29);
            } else {
                cdestructuring_bind_error(datum, $list_alt27);
            }
        }
        return NIL;
    }

    public static final SubLObject with_cyblack_package(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt31, body);
        }
    }

    public static final SubLObject cyblack_monitor_posts(SubLObject turn_on_monitoring) {
        if (turn_on_monitoring == UNPROVIDED) {
            turn_on_monitoring = T;
        }
        $cyblack_monitor_posts$.setDynamicValue(turn_on_monitoring);
        return turn_on_monitoring;
    }

    public static final SubLObject cyblack_reset_globals() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cyblack_connection_modes$.setDynamicValue(list($MULTIPLE), thread);
            $cyblack_open_ports$.setDynamicValue(NIL, thread);
            $cyblack_tracing_on$.setDynamicValue(NIL, thread);
            $cyblack_tracing_output_stream$.setDynamicValue(T, thread);
            $cyblack_package$.setDynamicValue(find_package($$$CYC), thread);
            $cyblack_io_stream_monitor$.setDynamicValue(NIL, thread);
            $cyblack_server_process_terminate$.setDynamicValue(NIL, thread);
            $cyblack_monitor_posts$.setDynamicValue(NIL, thread);
            $cyblack_server_initialized$.setDynamicValue(NIL, thread);
            $virb3_incoming_queue$.setDynamicValue(NIL, thread);
            $virb3_outgoing_queue$.setDynamicValue(NIL, thread);
            $virb3_command_queue$.setDynamicValue(NIL, thread);
            $within_virb3_server$.setDynamicValue(NIL, thread);
            $virb3_server_process_terminate$.setDynamicValue(NIL, thread);
            $virb3_input_stream$.setDynamicValue(NIL, thread);
            $virb3_output_stream$.setDynamicValue(NIL, thread);
            $cyblack_io_stream_monitor_default_input$.setDynamicValue(StreamsLow.$standard_input$.getDynamicValue(thread), thread);
            $cyblack_io_stream_monitor_default_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
            $cyblack_io_loop_continue$.setDynamicValue(T, thread);
            return NIL;
        }
    }

    public static final SubLObject declare_cyblack_globals_file() {
        declareFunction("valid_cyblack_knowledge_source_types", "VALID-CYBLACK-KNOWLEDGE-SOURCE-TYPES", 0, 0, false);
        declareFunction("cyblack_knowledge_source_type_p", "CYBLACK-KNOWLEDGE-SOURCE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_knowledge_source_type", "ENCODE-CYBLACK-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_knowledge_source_type", "DECODE-CYBLACK-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
        declareFunction("cyblack_knowledge_source_type_less_p", "CYBLACK-KNOWLEDGE-SOURCE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_knowledge_source_type_greater_p", "CYBLACK-KNOWLEDGE-SOURCE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("valid_cyblack_connection_mode_types", "VALID-CYBLACK-CONNECTION-MODE-TYPES", 0, 0, false);
        declareFunction("cyblack_connection_mode_type_p", "CYBLACK-CONNECTION-MODE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_connection_mode_type", "ENCODE-CYBLACK-CONNECTION-MODE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_connection_mode_type", "DECODE-CYBLACK-CONNECTION-MODE-TYPE", 1, 0, false);
        declareFunction("cyblack_connection_mode_type_less_p", "CYBLACK-CONNECTION-MODE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_connection_mode_type_greater_p", "CYBLACK-CONNECTION-MODE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_create_server_queues", "CYBLACK-CREATE-SERVER-QUEUES", 0, 0, false);
        declareMacro("cyblack_tracing_format", "CYBLACK-TRACING-FORMAT");
        declareFunction("valid_cyblack_execution_mode_types", "VALID-CYBLACK-EXECUTION-MODE-TYPES", 0, 0, false);
        declareFunction("cyblack_execution_mode_type_p", "CYBLACK-EXECUTION-MODE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_execution_mode_type", "ENCODE-CYBLACK-EXECUTION-MODE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_execution_mode_type", "DECODE-CYBLACK-EXECUTION-MODE-TYPE", 1, 0, false);
        declareFunction("cyblack_execution_mode_type_less_p", "CYBLACK-EXECUTION-MODE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_execution_mode_type_greater_p", "CYBLACK-EXECUTION-MODE-TYPE-GREATER-P", 2, 0, false);
        declareMacro("cyblack_synchronous_p", "CYBLACK-SYNCHRONOUS-P");
        declareMacro("cyblack_asynchronous_p", "CYBLACK-ASYNCHRONOUS-P");
        declareMacro("with_cyblack_package", "WITH-CYBLACK-PACKAGE");
        declareFunction("cyblack_monitor_posts", "CYBLACK-MONITOR-POSTS", 0, 1, false);
        declareFunction("cyblack_reset_globals", "CYBLACK-RESET-GLOBALS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_globals_file() {
        defparameter("*CYBLACK-TYPE-CHECKING-ON*", NIL);
        defconstant("*VALID-CYBLACK-KNOWLEDGE-SOURCE-TYPES*", $list_alt0);
        defconstant("*VALID-CYBLACK-CONNECTION-MODE-TYPES*", $list_alt8);
        defvar("*CYBLACK-CONNECTION-MODES*", list($MULTIPLE));
        defvar("*CYBLACK-OPEN-PORTS*", NIL);
        defvar("*CYBLACK-TRACING-ON*", NIL);
        defvar("*CYBLACK-TRACING-OUTPUT-STREAM*", T);
        defvar("*CYBLACK-PACKAGE*", find_package($$$CYC));
        defvar("*CYBLACK-IO-STREAM-MONITOR*", NIL);
        defvar("*CYBLACK-SERVER-PROCESS-TERMINATE*", NIL);
        defvar("*CYBLACK-MONITOR-POSTS*", NIL);
        defparameter("*CYBLACK-SERVER-INITIALIZED*", NIL);
        defparameter("*VIRB3-INCOMING-QUEUE*", NIL);
        defparameter("*VIRB3-OUTGOING-QUEUE*", NIL);
        defparameter("*VIRB3-COMMAND-QUEUE*", NIL);
        defparameter("*WITHIN-VIRB3-SERVER*", NIL);
        defparameter("*VIRB3-SERVER-PROCESS-TERMINATE*", NIL);
        defparameter("*VIRB3-INPUT-STREAM*", NIL);
        defparameter("*VIRB3-OUTPUT-STREAM*", NIL);
        defparameter("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-INPUT*", StreamsLow.$standard_input$.getDynamicValue());
        defparameter("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
        defparameter("*CYBLACK-IO-LOOP-CONTINUE*", T);
        defconstant("*VALID-CYBLACK-EXECUTION-MODE-TYPES*", $list_alt22);
        return NIL;
    }

    public static final SubLObject setup_cyblack_globals_file() {
        enumerations.enumerations_incorporate_definition(CYBLACK_KNOWLEDGE_SOURCE_TYPE, $list_alt0);
        enumerations.enumerations_incorporate_definition(CYBLACK_CONNECTION_MODE_TYPE, $list_alt8);
        enumerations.enumerations_incorporate_definition(CYBLACK_EXECUTION_MODE_TYPE, $list_alt22);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("INTERNAL"), makeKeyword("EXTERNAL"));

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_TYPE = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_KNOWLEDGE_SOURCE_TYPE = makeSymbol("ENCODE-CYBLACK-KNOWLEDGE-SOURCE-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_KNOWLEDGE_SOURCE_TYPE = makeSymbol("DECODE-CYBLACK-KNOWLEDGE-SOURCE-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_TYPE_P = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-TYPE-P");

    static private final SubLList $list_alt8 = list($NONE, makeKeyword("SINGLE"), makeKeyword("MULTIPLE"), makeKeyword("MULTIPROCESSING"));

    private static final SubLSymbol CYBLACK_CONNECTION_MODE_TYPE = makeSymbol("CYBLACK-CONNECTION-MODE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_CONNECTION_MODE_TYPE = makeSymbol("ENCODE-CYBLACK-CONNECTION-MODE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_CONNECTION_MODE_TYPE = makeSymbol("DECODE-CYBLACK-CONNECTION-MODE-TYPE");

    private static final SubLSymbol CYBLACK_CONNECTION_MODE_TYPE_P = makeSymbol("CYBLACK-CONNECTION-MODE-TYPE-P");



    static private final SubLString $$$CYC = makeString("CYC");

    static private final SubLString $str_alt15$__Creating_Server_Queues___ = makeString("~%Creating Server Queues...");



    static private final SubLList $list_alt17 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLSymbol $cyblack_tracing_on$ = makeSymbol("*CYBLACK-TRACING-ON*");



    public static final SubLSymbol $cyblack_tracing_output_stream$ = makeSymbol("*CYBLACK-TRACING-OUTPUT-STREAM*");

    static private final SubLList $list_alt22 = list(makeKeyword("SYNCHRONOUS"), makeKeyword("ASYNCHRONOUS"));

    private static final SubLSymbol CYBLACK_EXECUTION_MODE_TYPE = makeSymbol("CYBLACK-EXECUTION-MODE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_EXECUTION_MODE_TYPE = makeSymbol("ENCODE-CYBLACK-EXECUTION-MODE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_EXECUTION_MODE_TYPE = makeSymbol("DECODE-CYBLACK-EXECUTION-MODE-TYPE");

    private static final SubLSymbol CYBLACK_EXECUTION_MODE_TYPE_P = makeSymbol("CYBLACK-EXECUTION-MODE-TYPE-P");

    static private final SubLList $list_alt27 = list(makeSymbol("EXPRESSION"));

    static private final SubLList $list_alt28 = list(makeKeyword("SYNCHRONOUS"));

    static private final SubLList $list_alt29 = list(makeKeyword("ASYNCHRONOUS"));



    static private final SubLList $list_alt31 = list(list(makeSymbol("*PACKAGE*"), makeSymbol("*CYBLACK-PACKAGE*")));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_globals_file();
    }

    public void initializeVariables() {
        init_cyblack_globals_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_globals_file();
    }
}

