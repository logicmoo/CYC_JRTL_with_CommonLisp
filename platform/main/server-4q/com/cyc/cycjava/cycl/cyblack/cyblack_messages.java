/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
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
 *  module:      CYBLACK-MESSAGES
 *  source file: /cyc/top/cycl/cyblack/cyblack-messages.lisp
 *  created:     2019/07/03 17:38:43
 */
public final class cyblack_messages extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_messages() {
    }

    public static final SubLFile me = new cyblack_messages();


    // // Definitions
    /**
     * Enumerated values of type CYBLACK-MESSAGE-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_message_key_types$ = makeSymbol("*VALID-CYBLACK-MESSAGE-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-MESSAGE-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_message_key_types() {
        return $valid_cyblack_message_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-MESSAGE-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_message_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-MESSAGE-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_message_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_message_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_MESSAGE_KEY_TYPE, value, CYBLACK_MESSAGE_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-MESSAGE-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_message_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_message_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_MESSAGE_KEY_TYPE, value, CYBLACK_MESSAGE_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-MESSAGE-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_KEY_TYPE_P, value1, CYBLACK_MESSAGE_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_KEY_TYPE_P, value2, CYBLACK_MESSAGE_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-MESSAGE-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_KEY_TYPE_P, value1, CYBLACK_MESSAGE_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_KEY_TYPE_P, value2, CYBLACK_MESSAGE_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_key_types$.getGlobalValue();
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
     * Enumerated values of type CYBLACK-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_message_arg_key_types() {
        return $valid_cyblack_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_message_arg_key_type_for_dynamic_appss$ = makeSymbol("*VALID-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPSS*");

    /**
     * Returns a list of all valid members of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration.
     */
    public static final SubLObject valid_cyblack_message_arg_key_type_for_dynamic_appss() {
        return $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_for_dynamic_apps_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_message_arg_key_type_for_dynamic_apps(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS, value, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration.
     */
    public static final SubLObject decode_cyblack_message_arg_key_type_for_dynamic_apps(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS, value, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_for_dynamic_apps_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_for_dynamic_apps_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS_P, value1, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_for_dynamic_apps_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS_P, value2, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS enumeration.
     */
    public static final SubLObject cyblack_message_arg_key_type_for_dynamic_apps_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_for_dynamic_apps_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS_P, value1, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_key_type_for_dynamic_apps_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS_P, value2, CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_message_arg_key_type_for_dynamic_appss$.getGlobalValue();
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

    public static final SubLObject cyblack_message_arg_for_dynamic_apps_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_message_arg_key_type_for_dynamic_apps_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_request_contents_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_request_contents_message_arg_key_types() {
        return $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_request_contents_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_request_contents_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_request_contents_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_request_contents_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_request_contents_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_request_contents_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_request_contents_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_request_contents_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_request_contents_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_request_contents_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_request_contents_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_request_contents_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_report_contents_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_report_contents_message_arg_key_types() {
        return $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_report_contents_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_report_contents_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_report_contents_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_report_contents_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_report_contents_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_report_contents_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_report_contents_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_report_contents_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_report_contents_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_report_contents_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_report_contents_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_report_contents_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_invite_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_invite_message_arg_key_types() {
        return $valid_cyblack_invite_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_invite_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_invite_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_invite_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_invite_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_invite_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_invite_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_invite_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_invite_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_invite_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_invite_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_invite_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_invite_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_invite_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_invite_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_invite_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_invite_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_embedded_propid_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_embedded_propid_message_arg_key_types() {
        return $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_embedded_propid_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_embedded_propid_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_embedded_propid_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_embedded_propid_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_embedded_propid_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_embedded_propid_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_embedded_propid_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_embedded_propid_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_embedded_propid_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_embedded_propid_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_embedded_propid_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_embedded_propid_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_activation_arglist_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_activation_arglist_message_arg_key_types() {
        return $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_activation_arglist_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_activation_arglist_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_activation_arglist_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_activation_arglist_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_activation_arglist_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_activation_arglist_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_activation_arglist_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_activation_arglist_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_activation_arglist_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_activation_arglist_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_activation_arglist_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_activation_arglist_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_stimulate_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_stimulate_message_arg_key_types() {
        return $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_stimulate_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_stimulate_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_stimulate_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_stimulate_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_stimulate_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_stimulate_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_stimulate_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_stimulate_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_stimulate_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_stimulate_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_stimulate_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_stimulate_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_verify_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_verify_message_arg_key_types() {
        return $valid_cyblack_verify_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_verify_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_verify_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_verify_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_verify_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_verify_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_verify_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_verify_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_verify_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_verify_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_verify_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_verify_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_verify_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_verify_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_verify_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_verify_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_verify_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_cancel_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_cancel_message_arg_key_types() {
        return $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_cancel_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_cancel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_cancel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_cancel_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cancel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cancel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_cancel_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cancel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cancel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_cancel_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_cancel_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_cancel_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_execute_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_execute_message_arg_key_types() {
        return $valid_cyblack_execute_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_execute_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_execute_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_execute_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_execute_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_execute_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_execute_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_execute_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execute_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execute_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_execute_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_execute_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execute_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_execute_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_execute_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_execute_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_execute_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_terminate_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_terminate_message_arg_key_types() {
        return $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_terminate_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_terminate_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_terminate_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_terminate_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_terminate_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_terminate_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_terminate_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_terminate_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_terminate_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_terminate_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_terminate_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_terminate_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_accept_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_accept_message_arg_key_types() {
        return $valid_cyblack_accept_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_accept_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_accept_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_accept_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_accept_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_accept_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_accept_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_accept_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_accept_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_accept_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_accept_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_accept_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_accept_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_accept_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_accept_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_accept_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_accept_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_reject_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_reject_message_arg_key_types() {
        return $valid_cyblack_reject_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_reject_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_reject_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_reject_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_reject_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_reject_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_reject_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_reject_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_reject_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_reject_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_reject_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_reject_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_reject_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_reject_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_reject_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_reject_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_reject_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_propose_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_propose_message_arg_key_types() {
        return $valid_cyblack_propose_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_propose_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_propose_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_propose_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_propose_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_propose_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_propose_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_propose_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_propose_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_propose_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_propose_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_propose_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_propose_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_propose_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_propose_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_propose_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_propose_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_decline_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_decline_message_arg_key_types() {
        return $valid_cyblack_decline_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_decline_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_decline_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_decline_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_decline_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_decline_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_decline_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_decline_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_decline_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_decline_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_decline_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_decline_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_decline_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_decline_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_decline_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_decline_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_decline_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_revoke_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_revoke_message_arg_key_types() {
        return $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_revoke_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_revoke_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_revoke_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_revoke_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_revoke_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_revoke_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_revoke_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_revoke_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_revoke_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_revoke_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_revoke_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_revoke_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_affirm_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_affirm_message_arg_key_types() {
        return $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_affirm_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_affirm_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_affirm_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_affirm_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_affirm_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_affirm_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_affirm_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_affirm_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_affirm_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_affirm_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_affirm_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_affirm_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_contribute_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_contribute_message_arg_key_types() {
        return $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_contribute_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_contribute_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_contribute_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_contribute_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_contribute_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_contribute_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_contribute_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_contribute_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_contribute_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_contribute_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_contribute_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_contribute_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_acquit_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_acquit_message_arg_key_types() {
        return $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_acquit_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_acquit_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_acquit_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_acquit_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_acquit_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_acquit_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_acquit_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_acquit_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_acquit_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_acquit_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_acquit_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_acquit_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cylack_state_change_message_arg_key_types$ = makeSymbol("*VALID-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cylack_state_change_message_arg_key_types() {
        return $valid_cylack_state_change_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cylack_state_change_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cylack_state_change_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cylack_state_change_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cylack_state_change_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE, value, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cylack_state_change_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cylack_state_change_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE, value, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cylack_state_change_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cylack_state_change_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE_P, value1, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cylack_state_change_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE_P, value2, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cylack_state_change_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cylack_state_change_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cylack_state_change_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE_P, value1, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cylack_state_change_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE_P, value2, CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cylack_state_change_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_state_change_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cylack_state_change_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-EVENT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_event_types$ = makeSymbol("*VALID-CYBLACK-EVENT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-EVENT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_event_types() {
        return $valid_cyblack_event_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-EVENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_event_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_event_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-EVENT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_event_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_event_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_EVENT_TYPE, value, CYBLACK_EVENT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-EVENT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_event_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_event_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_EVENT_TYPE, value, CYBLACK_EVENT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-EVENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_event_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_event_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EVENT_TYPE_P, value1, CYBLACK_EVENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_event_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EVENT_TYPE_P, value2, CYBLACK_EVENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_event_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-EVENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_event_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_event_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EVENT_TYPE_P, value1, CYBLACK_EVENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_event_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_EVENT_TYPE_P, value2, CYBLACK_EVENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_event_types$.getGlobalValue();
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

    public static final SubLObject cyblack_event_type_list_p(SubLObject v_object) {
        {
            SubLObject current_cons = v_object;
            SubLObject current_element = NIL;
            current_cons = v_object;
            while (current_cons.isCons()) {
                current_element = current_cons.first();
                if (NIL == cyblack_event_type_p(current_element)) {
                    return NIL;
                }
                current_cons = current_cons.rest();
            } 
            return sublisp_null(current_cons);
        }
    }

    /**
     * Enumerated values of type CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_add_knowledge_source_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_add_knowledge_source_message_arg_key_types() {
        return $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_knowledge_source_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_add_knowledge_source_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_add_knowledge_source_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_knowledge_source_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_knowledge_source_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_knowledge_source_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_knowledge_source_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_knowledge_source_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_knowledge_source_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_knowledge_source_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_add_knowledge_source_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_add_knowledge_source_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_remove_knowledge_source_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_remove_knowledge_source_message_arg_key_types() {
        return $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_knowledge_source_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_remove_knowledge_source_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_remove_knowledge_source_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_knowledge_source_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_knowledge_source_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_knowledge_source_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_knowledge_source_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_knowledge_source_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_knowledge_source_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_remove_knowledge_source_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_remove_knowledge_source_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_remove_knowledge_source_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_add_posting_class_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_add_posting_class_message_arg_key_types() {
        return $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_posting_class_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_add_posting_class_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_add_posting_class_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_posting_class_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_posting_class_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_posting_class_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_posting_class_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_posting_class_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_posting_class_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_posting_class_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_add_posting_class_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_add_posting_class_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_add_panel_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_add_panel_message_arg_key_types() {
        return $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_panel_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_add_panel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_add_panel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_panel_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_panel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_panel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_add_panel_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_panel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_add_panel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_add_panel_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_add_panel_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_add_panel_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_remove_panel_message_arg_key_types$ = makeSymbol("*VALID-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_remove_panel_message_arg_key_types() {
        return $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_panel_message_arg_key_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_remove_panel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_remove_panel_message_arg_key_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE, value, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_panel_message_arg_key_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_panel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_panel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE enumeration.
     */
    public static final SubLObject cyblack_remove_panel_message_arg_key_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_panel_message_arg_key_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE_P, value1, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_remove_panel_message_arg_key_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE_P, value2, CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_remove_panel_message_arg_key_types$.getGlobalValue();
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

    public static final SubLObject cyblack_remove_panel_message_arg_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_remove_panel_message_arg_key_type_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject get_cyblack_message_message_broker(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, NINE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_message_message_broker(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, NINE_INTEGER, MESSAGE_BROKER);
    }

    public static final SubLObject get_cyblack_message_external_module_id(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, EIGHT_INTEGER, EXTERNAL_MODULE_ID);
    }

    public static final SubLObject set_cyblack_message_external_module_id(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, EIGHT_INTEGER, EXTERNAL_MODULE_ID);
    }

    public static final SubLObject get_cyblack_message_transaction_id(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, SEVEN_INTEGER, TRANSACTION_ID);
    }

    public static final SubLObject set_cyblack_message_transaction_id(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, SEVEN_INTEGER, TRANSACTION_ID);
    }

    public static final SubLObject get_cyblack_message_session_id(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, SIX_INTEGER, SESSION_ID);
    }

    public static final SubLObject set_cyblack_message_session_id(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, SIX_INTEGER, SESSION_ID);
    }

    public static final SubLObject get_cyblack_message_message_key(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, FIVE_INTEGER, MESSAGE_KEY);
    }

    public static final SubLObject set_cyblack_message_message_key(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, FIVE_INTEGER, MESSAGE_KEY);
    }

    public static final SubLObject get_cyblack_message_knowledge_source(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, FOUR_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject set_cyblack_message_knowledge_source(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, FOUR_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject get_cyblack_message_timestamp(SubLObject cyblack_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_message, THREE_INTEGER, TIMESTAMP);
    }

    public static final SubLObject set_cyblack_message_timestamp(SubLObject cyblack_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_message, value, THREE_INTEGER, TIMESTAMP);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_message_p(SubLObject cyblack_message) {
        return classes.subloop_instanceof_class(cyblack_message, CYBLACK_MESSAGE);
    }

    public static final SubLObject cyblack_message_initialize_method(SubLObject self) {
        cyblack_object.cyblack_object_initialize_method(self);
        cyblack_message_set_timestamp_method(self, NIL);
        cyblack_message_set_knowledge_source_method(self, NIL);
        cyblack_message_set_message_key_method(self, $GENERIC);
        cyblack_message_set_session_id_method(self, NIL);
        cyblack_message_set_external_module_id_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_message_set_session_id_method(self, getf(message_args, $SID, UNPROVIDED));
            cyblack_message_set_external_module_id_method(self, getf(message_args, $EMID, UNPROVIDED));
            cyblack_message_set_transaction_id_method(self, getf(message_args, $TID, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_message_to_string_method(SubLObject self) {
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                methods.funcall_instance_method_with_2_args(self, PRINT, stream, ZERO_INTEGER);
                string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            force_output(T);
            return string;
        }
    }

    public static final SubLObject cyblack_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_message_method = NIL;
            SubLObject external_module_id = get_cyblack_message_external_module_id(self);
            SubLObject transaction_id = get_cyblack_message_transaction_id(self);
            SubLObject session_id = get_cyblack_message_session_id(self);
            SubLObject message_key = get_cyblack_message_message_key(self);
            try {
                try {
                    sublisp_throw($sym176$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, list(transaction_id, $TID, external_module_id, $EMID, session_id, $SID, message_key));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_external_module_id(self, external_module_id);
                            set_cyblack_message_transaction_id(self, transaction_id);
                            set_cyblack_message_session_id(self, session_id);
                            set_cyblack_message_message_key(self, message_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym176$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_message_method;
        }
    }

    public static final SubLObject cyblack_message_to_list_method(SubLObject self) {
        return nreverse(methods.funcall_instance_method_with_0_args(self, TO_REVERSED_LIST));
    }

    public static final SubLObject cyblack_message_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt183$_);
        methods.funcall_instance_method_with_1_args(self, PRINT_HEAD_PART, stream);
        methods.funcall_instance_method_with_1_args(self, PRINT_TAIL_PART, stream);
        format(stream, $str_alt186$_);
        return self;
    }

    public static final SubLObject cyblack_message_print_head_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_message_method = NIL;
            SubLObject external_module_id = get_cyblack_message_external_module_id(self);
            SubLObject transaction_id = get_cyblack_message_transaction_id(self);
            SubLObject session_id = get_cyblack_message_session_id(self);
            SubLObject message_key = get_cyblack_message_message_key(self);
            try {
                try {
                    format(stream, $str_alt191$_S__SID__S__EMID__S__TID__S, new SubLObject[]{ message_key, session_id, external_module_id, transaction_id });
                    sublisp_throw($sym190$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_message_external_module_id(self, external_module_id);
                            set_cyblack_message_transaction_id(self, transaction_id);
                            set_cyblack_message_session_id(self, session_id);
                            set_cyblack_message_message_key(self, message_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym190$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_message_method;
        }
    }

    public static final SubLObject cyblack_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        return NIL;
    }

    public static final SubLObject cyblack_message_get_timestamp_method(SubLObject self) {
        {
            SubLObject timestamp = get_cyblack_message_timestamp(self);
            return timestamp;
        }
    }

    public static final SubLObject cyblack_message_set_timestamp_method(SubLObject self, SubLObject new_timestamp) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject timestamp = get_cyblack_message_timestamp(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_timestamp) || new_timestamp.isInteger())) {
                                Errors.error($str_alt203$_SET_TIMESTAMP__S____S_is_not_a_v, self, new_timestamp);
                            }
                        }
                        timestamp = new_timestamp;
                        sublisp_throw($sym202$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_timestamp);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_timestamp(self, timestamp);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym202$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_timestamp_now_method(SubLObject self) {
        {
            SubLObject new_timestamp = get_universal_time();
            cyblack_message_set_timestamp_method(self, new_timestamp);
            return new_timestamp;
        }
    }

    public static final SubLObject cyblack_message_get_knowledge_source_method(SubLObject self) {
        {
            SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
            return knowledge_source;
        }
    }

    public static final SubLObject cyblack_message_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_knowledge_source) || (NIL != cyblack_ks.cyblack_knowledge_source_p(new_knowledge_source)))) {
                                Errors.error($str_alt216$_SET_KNOWLEDGE_SOURCE__S____S_is_, self, new_knowledge_source);
                            }
                        }
                        knowledge_source = new_knowledge_source;
                        sublisp_throw($sym215$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_knowledge_source);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_message_key_method(SubLObject self) {
        {
            SubLObject message_key = get_cyblack_message_message_key(self);
            return message_key;
        }
    }

    public static final SubLObject cyblack_message_set_message_key_method(SubLObject self, SubLObject new_message_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject message_key = get_cyblack_message_message_key(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_message_key_type_p(new_message_key)) {
                                Errors.error($str_alt225$_SET_MESSAGE_KEY__S____S_is_not_a, self, new_message_key);
                            }
                        }
                        message_key = new_message_key;
                        sublisp_throw($sym224$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_message_key);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_message_key(self, message_key);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym224$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_session_id_method(SubLObject self) {
        {
            SubLObject session_id = get_cyblack_message_session_id(self);
            return session_id;
        }
    }

    public static final SubLObject cyblack_message_set_session_id_method(SubLObject self, SubLObject new_session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject session_id = get_cyblack_message_session_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_session_id) || new_session_id.isString()) || (NIL != Guids.guid_p(new_session_id)))) {
                                Errors.error($str_alt234$_SET_SESSION_ID__S____S_is_not_a_, self, new_session_id);
                            }
                        }
                        if (NIL != Guids.guid_p(new_session_id)) {
                            session_id = Guids.guid_to_string(new_session_id);
                        } else {
                            session_id = new_session_id;
                        }
                        sublisp_throw($sym233$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_session_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_session_id(self, session_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym233$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_transaction_id_method(SubLObject self) {
        {
            SubLObject transaction_id = get_cyblack_message_transaction_id(self);
            return transaction_id;
        }
    }

    public static final SubLObject cyblack_message_set_transaction_id_method(SubLObject self, SubLObject new_transaction_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject transaction_id = get_cyblack_message_transaction_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_transaction_id) || new_transaction_id.isString()) || (NIL != Guids.guid_p(new_transaction_id)))) {
                                Errors.error($str_alt243$_SET_TRANSACTION_ID__S____S_is_no, self, new_transaction_id);
                            }
                        }
                        if (NIL != Guids.guid_p(new_transaction_id)) {
                            transaction_id = Guids.guid_to_string(new_transaction_id);
                        } else {
                            transaction_id = new_transaction_id;
                        }
                        sublisp_throw($sym242$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_transaction_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_transaction_id(self, transaction_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym242$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_external_module_id_method(SubLObject self) {
        {
            SubLObject external_module_id = get_cyblack_message_external_module_id(self);
            return external_module_id;
        }
    }

    public static final SubLObject cyblack_message_set_external_module_id_method(SubLObject self, SubLObject new_external_module_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject external_module_id = get_cyblack_message_external_module_id(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_external_module_id) || new_external_module_id.isString()) || (NIL != Guids.guid_p(new_external_module_id)))) {
                                Errors.error($str_alt252$_SET_EXTERNAL_MODULE_ID__S____S_i, self, new_external_module_id);
                            }
                        }
                        if (NIL != Guids.guid_p(new_external_module_id)) {
                            external_module_id = Guids.guid_to_string(new_external_module_id);
                        } else {
                            external_module_id = new_external_module_id;
                        }
                        sublisp_throw($sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_external_module_id);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_external_module_id(self, external_module_id);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_all_ids_method(SubLObject self) {
        {
            SubLObject external_module_id = get_cyblack_message_external_module_id(self);
            SubLObject transaction_id = get_cyblack_message_transaction_id(self);
            SubLObject session_id = get_cyblack_message_session_id(self);
            return nconc(NIL != session_id ? ((SubLObject) (list(session_id))) : NIL, NIL != transaction_id ? ((SubLObject) (list(transaction_id))) : NIL, NIL != external_module_id ? ((SubLObject) (list(external_module_id))) : NIL);
        }
    }

    public static final SubLObject cyblack_message_get_message_broker_method(SubLObject self) {
        {
            SubLObject message_broker = get_cyblack_message_message_broker(self);
            return message_broker;
        }
    }

    public static final SubLObject cyblack_message_set_message_broker_method(SubLObject self, SubLObject new_message_broker) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_message_method = NIL;
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_message_broker) || (NIL != cyblack_message_broker.cyblack_message_broker_p(new_message_broker)))) {
                                Errors.error($str_alt264$_SET_MESSAGE_BROKER__S____S_is_no, self, new_message_broker);
                            }
                        }
                        message_broker = new_message_broker;
                        sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD, new_message_broker);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_message_broker(self, message_broker);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_message_method = Errors.handleThrowable(ccatch_env_var, $sym263$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_message_method;
            }
        }
    }

    public static final SubLObject cyblack_message_get_datatype_dictionary_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt269$_GET_DATATYPE_DICTIONARY__S___No_, self);
                    }
                }
                {
                    SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == datatype_dictionary) {
                            Errors.error($str_alt270$_GET_DATATYPE_DICTIONARY__S___No_, self, datatype_dictionary);
                        }
                    }
                    return datatype_dictionary;
                }
            }
        }
    }

    public static final SubLObject cyblack_message_get_agenda_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt274$_GET_AGENDA__S___No_application_i, self);
                    }
                }
                {
                    SubLObject v_agenda = cyblack_application.cyblack_application_get_agenda(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == v_agenda) {
                            Errors.error($str_alt275$_GET_AGENDA__S___No_agenda_is_ass, self, v_agenda);
                        }
                    }
                    return v_agenda;
                }
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_transmit_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_transmit_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_transmit_message_p(SubLObject cyblack_transmit_message) {
        return classes.subloop_instanceof_class(cyblack_transmit_message, CYBLACK_TRANSMIT_MESSAGE);
    }

    public static final SubLObject get_cyblack_report_contents_message_contents(SubLObject cyblack_report_contents_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_report_contents_message, ELEVEN_INTEGER, CONTENTS);
    }

    public static final SubLObject set_cyblack_report_contents_message_contents(SubLObject cyblack_report_contents_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_report_contents_message, value, ELEVEN_INTEGER, CONTENTS);
    }

    public static final SubLObject get_cyblack_report_contents_message_type_string(SubLObject cyblack_report_contents_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_report_contents_message, TEN_INTEGER, TYPE_STRING);
    }

    public static final SubLObject set_cyblack_report_contents_message_type_string(SubLObject cyblack_report_contents_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_report_contents_message, value, TEN_INTEGER, TYPE_STRING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_report_contents_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_report_contents_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_REPORT_CONTENTS_MESSAGE, TYPE_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_REPORT_CONTENTS_MESSAGE, CONTENTS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_report_contents_message_p(SubLObject cyblack_report_contents_message) {
        return classes.subloop_instanceof_class(cyblack_report_contents_message, CYBLACK_REPORT_CONTENTS_MESSAGE);
    }

    public static final SubLObject cyblack_report_contents_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $REPORT_CONTENTS);
        cyblack_report_contents_message_set_type_string_method(self, $$$POSTING);
        cyblack_report_contents_message_set_contents_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_report_contents_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_report_contents_message_method = NIL;
            SubLObject contents = get_cyblack_report_contents_message_contents(self);
            SubLObject type_string = get_cyblack_report_contents_message_type_string(self);
            try {
                try {
                    {
                        SubLObject listified_contents = NIL;
                        SubLObject datatype = NIL;
                        SubLObject datatype_name = NIL;
                        if (contents.isCons()) {
                            {
                                SubLObject cdolist_list_var = contents;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                    if (NIL != cyblack_posting.cyblack_posting_p(element)) {
                                        datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(element);
                                        if (NIL != datatype) {
                                            datatype_name = cyblack_datatype.cyblack_datatype_get_typename(datatype);
                                            listified_contents = cons(cons(datatype_name, object.object_plistify_method(element)), listified_contents);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym291$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD, listS(nreverse(listified_contents), $CONTENTS, type_string, $TYPE, cyblack_message_to_reversed_list_method(self)));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_contents_message_contents(self, contents);
                            set_cyblack_report_contents_message_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_report_contents_message_method;
        }
    }

    public static final SubLObject cyblack_report_contents_message_print_contents_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_report_contents_message_method = NIL;
            SubLObject contents = get_cyblack_report_contents_message_contents(self);
            try {
                try {
                    if (NIL == contents) {
                        format(stream, $str_alt298$__);
                    } else
                        if (contents.isCons()) {
                            format(stream, $str_alt183$_);
                            {
                                SubLObject cdolist_list_var = contents;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                    if (NIL != cyblack_posting.cyblack_posting_p(element)) {
                                        {
                                            SubLObject datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(element);
                                            SubLObject datatype_name = (NIL != datatype) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(datatype))) : $$$POSTING;
                                            format(stream, $str_alt299$_S, cons(datatype_name, object.object_plistify_method(element)));
                                        }
                                    } else {
                                        format(stream, $str_alt299$_S, element);
                                    }
                                }
                            }
                            format(stream, $str_alt186$_);
                        } else {
                            format(stream, $str_alt299$_S, contents);
                        }

                    sublisp_throw($sym297$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_contents_message_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym297$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_report_contents_message_method;
        }
    }

    public static final SubLObject cyblack_report_contents_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_report_contents_message_method = NIL;
            SubLObject contents = get_cyblack_report_contents_message_contents(self);
            SubLObject type_string = get_cyblack_report_contents_message_type_string(self);
            try {
                try {
                    format(stream, $str_alt303$__TYPE__S__CONTENTS_, type_string);
                    if (NIL != contents) {
                        cyblack_report_contents_message_print_contents_method(self, stream);
                    } else {
                        format(stream, $str_alt298$__);
                    }
                    sublisp_throw($sym302$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_contents_message_contents(self, contents);
                            set_cyblack_report_contents_message_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_report_contents_message_method;
        }
    }

    public static final SubLObject cyblack_report_contents_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_report_contents_message_arg_key_type_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            {
                SubLObject type = getf(message_args, $TYPE, UNPROVIDED);
                cyblack_report_contents_message_set_type_string_method(self, NIL != type ? ((SubLObject) (type)) : $$$POSTING);
                cyblack_report_contents_message_set_contents_method(self, getf(message_args, $CONTENTS, UNPROVIDED));
            }
            return self;
        }
    }

    public static final SubLObject cyblack_report_contents_message_get_type_string_method(SubLObject self) {
        {
            SubLObject type_string = get_cyblack_report_contents_message_type_string(self);
            return type_string;
        }
    }

    public static final SubLObject cyblack_report_contents_message_set_type_string_method(SubLObject self, SubLObject new_type_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_report_contents_message_method = NIL;
                SubLObject type_string = get_cyblack_report_contents_message_type_string(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_type_string.isString()) {
                                Errors.error($str_alt314$_SET_TYPE_STRING__S____S_is_not_a, self, new_type_string);
                            }
                        }
                        type_string = new_type_string;
                        sublisp_throw($sym313$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD, new_type_string);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_report_contents_message_type_string(self, type_string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_report_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym313$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_report_contents_message_method;
            }
        }
    }

    public static final SubLObject cyblack_report_contents_message_get_contents_method(SubLObject self) {
        {
            SubLObject contents = get_cyblack_report_contents_message_contents(self);
            return contents;
        }
    }

    public static final SubLObject cyblack_report_contents_message_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_report_contents_message_method = NIL;
                SubLObject contents = get_cyblack_report_contents_message_contents(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_contents.isList()) {
                                Errors.error($str_alt323$_SET_CONTENTS__S____S_is_not_a_va, self, new_contents);
                            }
                        }
                        contents = new_contents;
                        sublisp_throw($sym322$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD, new_contents);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_report_contents_message_contents(self, contents);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_report_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_report_contents_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_invitation_message_external_module_name(SubLObject cyblack_invitation_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_invitation_message, ELEVEN_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject set_cyblack_invitation_message_external_module_name(SubLObject cyblack_invitation_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_invitation_message, value, ELEVEN_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject get_cyblack_invitation_message_application_name(SubLObject cyblack_invitation_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_invitation_message, TEN_INTEGER, APPLICATION_NAME);
    }

    public static final SubLObject set_cyblack_invitation_message_application_name(SubLObject cyblack_invitation_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_invitation_message, value, TEN_INTEGER, APPLICATION_NAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_invitation_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_invitation_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INVITATION_MESSAGE, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INVITATION_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_invitation_message_p(SubLObject cyblack_invitation_message) {
        return classes.subloop_instanceof_class(cyblack_invitation_message, CYBLACK_INVITATION_MESSAGE);
    }

    public static final SubLObject cyblack_invitation_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $INVITE);
        cyblack_invitation_message_set_application_name_method(self, $str_alt333$);
        cyblack_invitation_message_set_external_module_name_method(self, $str_alt333$);
        return self;
    }

    public static final SubLObject cyblack_invitation_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_invitation_message_method = NIL;
            SubLObject external_module_name = get_cyblack_invitation_message_external_module_name(self);
            SubLObject application_name = get_cyblack_invitation_message_application_name(self);
            try {
                try {
                    sublisp_throw($sym336$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD, listS(external_module_name, $EMNAME, application_name, $APPNAME, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_invitation_message_external_module_name(self, external_module_name);
                            set_cyblack_invitation_message_application_name(self, application_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_invitation_message_method = Errors.handleThrowable(ccatch_env_var, $sym336$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_invitation_message_method;
        }
    }

    public static final SubLObject cyblack_invitation_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_invitation_message_method = NIL;
            SubLObject external_module_name = get_cyblack_invitation_message_external_module_name(self);
            SubLObject application_name = get_cyblack_invitation_message_application_name(self);
            try {
                try {
                    format(stream, $str_alt342$__APPNAME__S__EMNAME__S, application_name, external_module_name);
                    sublisp_throw($sym341$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_invitation_message_external_module_name(self, external_module_name);
                            set_cyblack_invitation_message_application_name(self, application_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_invitation_message_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_invitation_message_method;
        }
    }

    public static final SubLObject cyblack_invitation_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_invite_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_invitation_message_set_application_name_method(self, getf(message_args, $APPNAME, UNPROVIDED));
            cyblack_invitation_message_set_external_module_name_method(self, getf(message_args, $EMNAME, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_invitation_message_get_application_name_method(SubLObject self) {
        {
            SubLObject application_name = get_cyblack_invitation_message_application_name(self);
            return application_name;
        }
    }

    public static final SubLObject cyblack_invitation_message_set_application_name_method(SubLObject self, SubLObject new_application_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_invitation_message_method = NIL;
                SubLObject application_name = get_cyblack_invitation_message_application_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application_name) || new_application_name.isString())) {
                                Errors.error($str_alt353$_SET_APPLICATION_NAME__S____S_is_, self, new_application_name);
                            }
                        }
                        application_name = new_application_name;
                        sublisp_throw($sym352$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD, new_application_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_invitation_message_application_name(self, application_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_invitation_message_method = Errors.handleThrowable(ccatch_env_var, $sym352$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_invitation_message_method;
            }
        }
    }

    public static final SubLObject cyblack_invitation_message_get_external_module_name_method(SubLObject self) {
        {
            SubLObject external_module_name = get_cyblack_invitation_message_external_module_name(self);
            return external_module_name;
        }
    }

    public static final SubLObject cyblack_invitation_message_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_invitation_message_method = NIL;
                SubLObject external_module_name = get_cyblack_invitation_message_external_module_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_external_module_name) || new_external_module_name.isString())) {
                                Errors.error($str_alt362$_SET_EXTERNAL_MODULE_NAME__S____S, self, new_external_module_name);
                            }
                        }
                        external_module_name = new_external_module_name;
                        sublisp_throw($sym361$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD, new_external_module_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_invitation_message_external_module_name(self, external_module_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_invitation_message_method = Errors.handleThrowable(ccatch_env_var, $sym361$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_invitation_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_propid_transmit_message_propid(SubLObject cyblack_embedded_propid_transmit_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_propid_transmit_message, TEN_INTEGER, PROPID);
    }

    public static final SubLObject set_cyblack_embedded_propid_transmit_message_propid(SubLObject cyblack_embedded_propid_transmit_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_propid_transmit_message, value, TEN_INTEGER, PROPID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_transmit_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_transmit_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_p(SubLObject cyblack_embedded_propid_transmit_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_propid_transmit_message, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_embedded_propid_transmit_message_set_propid_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_transmit_message_method = NIL;
            SubLObject propid = get_cyblack_embedded_propid_transmit_message_propid(self);
            try {
                try {
                    sublisp_throw($sym372$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD, listS(propid, $PROPID, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_transmit_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym372$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_propid_transmit_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_transmit_message_method = NIL;
            SubLObject propid = get_cyblack_embedded_propid_transmit_message_propid(self);
            try {
                try {
                    format(stream, $str_alt377$__PROPID__S, propid);
                    sublisp_throw($sym376$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_transmit_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym376$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_propid_transmit_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_embedded_propid_transmit_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_embedded_propid_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_embedded_propid_transmit_message_set_propid_method(self, getf(message_args, $PROPID, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_get_propid_method(SubLObject self) {
        {
            SubLObject propid = get_cyblack_embedded_propid_transmit_message_propid(self);
            return propid;
        }
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_set_propid_method(SubLObject self, SubLObject new_propid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_embedded_propid_transmit_message_method = NIL;
                SubLObject propid = get_cyblack_embedded_propid_transmit_message_propid(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_propid) || new_propid.isString()) || (NIL != Guids.guid_p(new_propid)))) {
                                Errors.error($str_alt388$_SET_PROPID__S____S_is_not_a_vali, self, new_propid);
                            }
                        }
                        if (NIL != Guids.guid_p(new_propid)) {
                            propid = Guids.guid_to_string(new_propid);
                        } else {
                            propid = new_propid;
                        }
                        sublisp_throw($sym387$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD, new_propid);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_propid_transmit_message_propid(self, propid);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_embedded_propid_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym387$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_embedded_propid_transmit_message_method;
            }
        }
    }

    public static final SubLObject cyblack_embedded_propid_transmit_message_get_all_ids_method(SubLObject self) {
        {
            SubLObject propid = get_cyblack_embedded_propid_transmit_message_propid(self);
            return NIL != propid ? ((SubLObject) (cons(propid, cyblack_message_get_all_ids_method(self)))) : cyblack_message_get_all_ids_method(self);
        }
    }

    public static final SubLObject get_cyblack_activation_arglist_transmit_message_activation_pattern(SubLObject cyblack_activation_arglist_transmit_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_activation_arglist_transmit_message, TWELVE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject set_cyblack_activation_arglist_transmit_message_activation_pattern(SubLObject cyblack_activation_arglist_transmit_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_activation_arglist_transmit_message, value, TWELVE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject get_cyblack_activation_arglist_transmit_message_activation_args(SubLObject cyblack_activation_arglist_transmit_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_activation_arglist_transmit_message, ELEVEN_INTEGER, ACTIVATION_ARGS);
    }

    public static final SubLObject set_cyblack_activation_arglist_transmit_message_activation_args(SubLObject cyblack_activation_arglist_transmit_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_activation_arglist_transmit_message, value, ELEVEN_INTEGER, ACTIVATION_ARGS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_activation_arglist_transmit_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_activation_arglist_transmit_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_PATTERN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_p(SubLObject cyblack_activation_arglist_transmit_message) {
        return classes.subloop_instanceof_class(cyblack_activation_arglist_transmit_message, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE);
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_transmit_message_initialize_method(self);
        cyblack_activation_arglist_transmit_message_set_activation_args_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_activation_arglist_transmit_message_method = NIL;
            SubLObject activation_args = get_cyblack_activation_arglist_transmit_message_activation_args(self);
            try {
                try {
                    sublisp_throw($sym401$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO, listS(activation_args, $AAL, cyblack_embedded_propid_transmit_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_activation_arglist_transmit_message_activation_args(self, activation_args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_activation_arglist_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym401$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO);
            }
            return catch_var_for_cyblack_activation_arglist_transmit_message_method;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_activation_arglist_transmit_message_method = NIL;
            SubLObject activation_args = get_cyblack_activation_arglist_transmit_message_activation_args(self);
            try {
                try {
                    cyblack_embedded_propid_transmit_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt406$__AAL__S, activation_args);
                    sublisp_throw($sym405$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_activation_arglist_transmit_message_activation_args(self, activation_args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_activation_arglist_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym405$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO);
            }
            return catch_var_for_cyblack_activation_arglist_transmit_message_method;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_embedded_propid_transmit_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_activation_arglist_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_activation_arglist_transmit_message_set_activation_args_method(self, getf(message_args, $AAL, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_get_activation_args_method(SubLObject self) {
        {
            SubLObject activation_args = get_cyblack_activation_arglist_transmit_message_activation_args(self);
            return activation_args;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_set_activation_args_method(SubLObject self, SubLObject new_activation_args) {
        {
            SubLObject catch_var_for_cyblack_activation_arglist_transmit_message_method = NIL;
            SubLObject activation_args = get_cyblack_activation_arglist_transmit_message_activation_args(self);
            try {
                try {
                    activation_args = new_activation_args;
                    sublisp_throw($sym416$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO, new_activation_args);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_activation_arglist_transmit_message_activation_args(self, activation_args);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_activation_arglist_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym416$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO);
            }
            return catch_var_for_cyblack_activation_arglist_transmit_message_method;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject activation_pattern = get_cyblack_activation_arglist_transmit_message_activation_pattern(self);
            return activation_pattern;
        }
    }

    public static final SubLObject cyblack_activation_arglist_transmit_message_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_activation_arglist_transmit_message_method = NIL;
                SubLObject activation_pattern = get_cyblack_activation_arglist_transmit_message_activation_pattern(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_activation_pattern) || (NIL != cyblack_precondition_pattern.cyblack_environment_p(new_activation_pattern)))) {
                                Errors.error($str_alt425$_SET_ACTIVATION_PATTERN__S____S_i, self, new_activation_pattern);
                            }
                        }
                        activation_pattern = new_activation_pattern;
                        sublisp_throw($sym424$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_activation_arglist_transmit_message_activation_pattern(self, activation_pattern);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_activation_arglist_transmit_message_method = Errors.handleThrowable(ccatch_env_var, $sym424$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO);
                }
                return catch_var_for_cyblack_activation_arglist_transmit_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_stimulate_message_implicit(SubLObject cyblack_stimulate_message) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_stimulate_message);
            SubLObject slot = slots.slot_assoc(IMPLICIT, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_stimulate_message, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_stimulate_message));
    }

    public static final SubLObject set_cyblack_stimulate_message_implicit(SubLObject cyblack_stimulate_message, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_stimulate_message);
            SubLObject slot = slots.slot_assoc(IMPLICIT, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_stimulate_message, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_stimulate_message, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_stimulate_message)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_stimulate_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_stimulate_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STIMULATE_MESSAGE, IMPLICIT, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_PATTERN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_stimulate_message_p(SubLObject cyblack_stimulate_message) {
        return classes.subloop_instanceof_class(cyblack_stimulate_message, CYBLACK_STIMULATE_MESSAGE);
    }

    public static final SubLObject cyblack_stimulate_message_initialize_method(SubLObject self) {
        cyblack_activation_arglist_transmit_message_initialize_method(self);
        set_cyblack_stimulate_message_implicit(self, NIL);
        cyblack_message_set_message_key_method(self, $STIMULATE);
        return self;
    }

    public static final SubLObject cyblack_stimulate_message_set_implicit_method(SubLObject self, SubLObject new_state) {
        return set_cyblack_stimulate_message_implicit(self, NIL != new_state ? ((SubLObject) (T)) : NIL);
    }

    public static final SubLObject cyblack_stimulate_message_implicit_p_method(SubLObject self) {
        return get_cyblack_stimulate_message_implicit(self);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_verify_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_verify_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_ARGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, ACTIVATION_PATTERN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_verify_message_p(SubLObject cyblack_verify_message) {
        return classes.subloop_instanceof_class(cyblack_verify_message, CYBLACK_VERIFY_MESSAGE);
    }

    public static final SubLObject cyblack_verify_message_initialize_method(SubLObject self) {
        cyblack_activation_arglist_transmit_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $VERIFY);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cancel_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cancel_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cancel_message_p(SubLObject cyblack_cancel_message) {
        return classes.subloop_instanceof_class(cyblack_cancel_message, CYBLACK_CANCEL_MESSAGE);
    }

    public static final SubLObject cyblack_cancel_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_transmit_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $CANCEL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_execute_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_execute_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PROPID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_execute_message_p(SubLObject cyblack_execute_message) {
        return classes.subloop_instanceof_class(cyblack_execute_message, CYBLACK_EXECUTE_MESSAGE);
    }

    public static final SubLObject cyblack_execute_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_transmit_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $EXECUTE);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_terminate_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_terminate_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_terminate_message_p(SubLObject cyblack_terminate_message) {
        return classes.subloop_instanceof_class(cyblack_terminate_message, CYBLACK_TERMINATE_MESSAGE);
    }

    public static final SubLObject cyblack_terminate_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $TERMINATE);
        return self;
    }

    public static final SubLObject get_cyblack_state_change_message_contents(SubLObject cyblack_state_change_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_state_change_message, ELEVEN_INTEGER, CONTENTS);
    }

    public static final SubLObject set_cyblack_state_change_message_contents(SubLObject cyblack_state_change_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_state_change_message, value, ELEVEN_INTEGER, CONTENTS);
    }

    public static final SubLObject get_cyblack_state_change_message_event_type(SubLObject cyblack_state_change_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_state_change_message, TEN_INTEGER, EVENT_TYPE);
    }

    public static final SubLObject set_cyblack_state_change_message_event_type(SubLObject cyblack_state_change_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_state_change_message, value, TEN_INTEGER, EVENT_TYPE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_state_change_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_state_change_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STATE_CHANGE_MESSAGE, EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STATE_CHANGE_MESSAGE, CONTENTS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_state_change_message_p(SubLObject cyblack_state_change_message) {
        return classes.subloop_instanceof_class(cyblack_state_change_message, CYBLACK_STATE_CHANGE_MESSAGE);
    }

    public static final SubLObject cyblack_state_change_message_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
            SubLObject contents = get_cyblack_state_change_message_contents(self);
            SubLObject event_type = get_cyblack_state_change_message_event_type(self);
            try {
                try {
                    cyblack_message_initialize_method(self);
                    cyblack_message_set_message_key_method(self, $STATE_CHANGE);
                    event_type = NIL;
                    contents = NIL;
                    sublisp_throw($sym474$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_message_contents(self, contents);
                            set_cyblack_state_change_message_event_type(self, event_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym474$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_state_change_message_method;
        }
    }

    public static final SubLObject cyblack_state_change_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
            SubLObject contents = get_cyblack_state_change_message_contents(self);
            SubLObject event_type = get_cyblack_state_change_message_event_type(self);
            try {
                try {
                    {
                        SubLObject listified_contents = NIL;
                        SubLObject datatype = NIL;
                        SubLObject datatype_name = NIL;
                        if (contents.isCons()) {
                            {
                                SubLObject cdolist_list_var = contents;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                    if (NIL != cyblack_posting.cyblack_posting_p(element)) {
                                        datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(element);
                                        if (NIL != datatype) {
                                            datatype_name = cyblack_datatype.cyblack_datatype_get_typename(datatype);
                                            if (NIL != datatype_name) {
                                                listified_contents = cons(cons(datatype_name, object.object_plistify_method(element)), listified_contents);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym478$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, listS(nreverse(listified_contents), $CONTENTS, event_type, $ET, cyblack_message_to_reversed_list_method(self)));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_message_contents(self, contents);
                            set_cyblack_state_change_message_event_type(self, event_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym478$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_state_change_message_method;
        }
    }

    public static final SubLObject cyblack_state_change_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
            SubLObject event_type = get_cyblack_state_change_message_event_type(self);
            try {
                try {
                    cyblack_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt483$__ET__S__CONTENTS_, event_type);
                    methods.funcall_instance_method_with_1_args(self, PRINT_CONTENTS, stream);
                    sublisp_throw($sym482$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_message_event_type(self, event_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym482$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_state_change_message_method;
        }
    }

    public static final SubLObject cyblack_state_change_message_print_contents_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
            SubLObject contents = get_cyblack_state_change_message_contents(self);
            try {
                try {
                    if (NIL == contents) {
                        format(stream, $str_alt298$__);
                    } else
                        if (contents.isCons()) {
                            format(stream, $str_alt183$_);
                            {
                                SubLObject cdolist_list_var = contents;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                    if (NIL != cyblack_posting.cyblack_posting_p(element)) {
                                        {
                                            SubLObject datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(element);
                                            SubLObject datatype_name = (NIL != datatype) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(datatype))) : $$$POSTING;
                                            format(stream, $str_alt299$_S, cons(datatype_name, object.object_plistify_method(element)));
                                        }
                                    } else {
                                        format(stream, $str_alt299$_S, element);
                                    }
                                }
                            }
                            format(stream, $str_alt186$_);
                        } else {
                            format(stream, $str_alt299$_S, contents);
                        }

                    sublisp_throw($sym485$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_message_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym485$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_state_change_message_method;
        }
    }

    public static final SubLObject cyblack_state_change_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_state_change_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_state_change_message_set_event_type_method(self, getf(message_args, $ET, UNPROVIDED));
            cyblack_state_change_message_set_contents_method(self, getf(message_args, $CONTENTS, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_state_change_message_get_event_type_method(SubLObject self) {
        {
            SubLObject event_type = get_cyblack_state_change_message_event_type(self);
            return event_type;
        }
    }

    public static final SubLObject cyblack_state_change_message_set_event_type_method(SubLObject self, SubLObject new_event_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
                SubLObject event_type = get_cyblack_state_change_message_event_type(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_event_type_p(new_event_type)) {
                                Errors.error($str_alt496$_SET_EVENT_TYPE__S____S_is_not_a_, self, new_event_type);
                            }
                        }
                        event_type = new_event_type;
                        sublisp_throw($sym495$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, new_event_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_state_change_message_event_type(self, event_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym495$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_state_change_message_method;
            }
        }
    }

    public static final SubLObject cyblack_state_change_message_get_contents_method(SubLObject self) {
        {
            SubLObject contents = get_cyblack_state_change_message_contents(self);
            return contents;
        }
    }

    public static final SubLObject cyblack_state_change_message_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            SubLObject catch_var_for_cyblack_state_change_message_method = NIL;
            SubLObject contents = get_cyblack_state_change_message_contents(self);
            try {
                try {
                    {
                        SubLObject copied_contents = (new_contents.isCons()) ? ((SubLObject) (copy_tree(new_contents))) : new_contents;
                        contents = copied_contents;
                        sublisp_throw($sym500$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD, new_contents);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_message_contents(self, contents);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_message_method = Errors.handleThrowable(ccatch_env_var, $sym500$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_state_change_message_method;
        }
    }

    public static final SubLObject get_cyblack_receive_message_external_module_name(SubLObject cyblack_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_receive_message, ELEVEN_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject set_cyblack_receive_message_external_module_name(SubLObject cyblack_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_receive_message, value, ELEVEN_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject get_cyblack_receive_message_cause(SubLObject cyblack_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_receive_message, TEN_INTEGER, CAUSE);
    }

    public static final SubLObject set_cyblack_receive_message_cause(SubLObject cyblack_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_receive_message, value, TEN_INTEGER, CAUSE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_receive_message_p(SubLObject cyblack_receive_message) {
        return classes.subloop_instanceof_class(cyblack_receive_message, CYBLACK_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_receive_message_get_cause_method(SubLObject self) {
        {
            SubLObject cause = get_cyblack_receive_message_cause(self);
            return cause;
        }
    }

    public static final SubLObject cyblack_receive_message_set_cause_method(SubLObject self, SubLObject new_cause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_receive_message_method = NIL;
                SubLObject cause = get_cyblack_receive_message_cause(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_cause) || (NIL != cyblack_transmit_message_p(new_cause)))) {
                                Errors.error($str_alt514$_SET_CAUSE__S____S_is_not_an_inst, self, new_cause);
                            }
                        }
                        cause = new_cause;
                        sublisp_throw($sym513$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD, new_cause);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_receive_message_cause(self, cause);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym513$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_receive_message_method;
            }
        }
    }

    public static final SubLObject cyblack_receive_message_get_external_module_name_method(SubLObject self) {
        {
            SubLObject external_module_name = get_cyblack_receive_message_external_module_name(self);
            return external_module_name;
        }
    }

    public static final SubLObject cyblack_receive_message_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_receive_message_method = NIL;
                SubLObject external_module_name = get_cyblack_receive_message_external_module_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_external_module_name) || new_external_module_name.isString())) {
                                Errors.error($str_alt519$_SET_EXTERNAL_MODULE_NAME__S____S, self, new_external_module_name);
                            }
                        }
                        external_module_name = new_external_module_name;
                        sublisp_throw($sym518$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD, new_external_module_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_receive_message_external_module_name(self, external_module_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym518$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_receive_message_method;
            }
        }
    }

    public static final SubLObject cyblack_receive_message_execute_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_accept_message_precondition_pattern(SubLObject cyblack_accept_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_accept_message, TWELVE_INTEGER, PRECONDITION_PATTERN);
    }

    public static final SubLObject set_cyblack_accept_message_precondition_pattern(SubLObject cyblack_accept_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_accept_message, value, TWELVE_INTEGER, PRECONDITION_PATTERN);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_accept_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_accept_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ACCEPT_MESSAGE, PRECONDITION_PATTERN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_accept_message_p(SubLObject cyblack_accept_message) {
        return classes.subloop_instanceof_class(cyblack_accept_message, CYBLACK_ACCEPT_MESSAGE);
    }

    public static final SubLObject cyblack_accept_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $ACCEPT);
        cyblack_receive_message_set_external_module_name_method(self, $str_alt333$);
        cyblack_accept_message_set_precondition_pattern_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_accept_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_accept_message_method = NIL;
            SubLObject precondition_pattern = get_cyblack_accept_message_precondition_pattern(self);
            SubLObject external_module_name = get_cyblack_receive_message_external_module_name(self);
            try {
                try {
                    sublisp_throw($sym533$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD, listS(NIL != precondition_pattern ? ((SubLObject) (methods.funcall_instance_method_with_0_args(precondition_pattern, GET_UNPARSED_PATTERN))) : NIL, $PRECON, external_module_name, $EMNAME, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_accept_message_precondition_pattern(self, precondition_pattern);
                            set_cyblack_receive_message_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_accept_message_method = Errors.handleThrowable(ccatch_env_var, $sym533$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_accept_message_method;
        }
    }

    public static final SubLObject cyblack_accept_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_accept_message_method = NIL;
            SubLObject precondition_pattern = get_cyblack_accept_message_precondition_pattern(self);
            SubLObject external_module_name = get_cyblack_receive_message_external_module_name(self);
            try {
                try {
                    format(stream, $str_alt539$__EMNAME__S__PRECON__S, external_module_name, precondition_pattern);
                    sublisp_throw($sym538$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_accept_message_precondition_pattern(self, precondition_pattern);
                            set_cyblack_receive_message_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_accept_message_method = Errors.handleThrowable(ccatch_env_var, $sym538$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_accept_message_method;
        }
    }

    public static final SubLObject cyblack_accept_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_accept_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_receive_message_set_external_module_name_method(self, getf(message_args, $EMNAME, UNPROVIDED));
            cyblack_accept_message_set_precondition_pattern_method(self, getf(message_args, $PRECON, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_accept_message_get_precondition_pattern_method(SubLObject self) {
        {
            SubLObject precondition_pattern = get_cyblack_accept_message_precondition_pattern(self);
            return precondition_pattern;
        }
    }

    public static final SubLObject cyblack_accept_message_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_accept_message_method = NIL;
            SubLObject precondition_pattern = get_cyblack_accept_message_precondition_pattern(self);
            try {
                try {
                    precondition_pattern = new_precondition_pattern;
                    sublisp_throw($sym549$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD, new_precondition_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_accept_message_precondition_pattern(self, precondition_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_accept_message_method = Errors.handleThrowable(ccatch_env_var, $sym549$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_accept_message_method;
        }
    }

    public static final SubLObject cyblack_accept_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_accept_message_method = NIL;
                SubLObject precondition_pattern = get_cyblack_accept_message_precondition_pattern(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                SubLObject external_module_id = get_cyblack_message_external_module_id(self);
                SubLObject transaction_id = get_cyblack_message_transaction_id(self);
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt553$_EXECUTE__S___Cannot_execute_mess, self);
                            }
                        }
                        {
                            SubLObject ksb = methods.funcall_instance_method_with_0_args(application, GET_KNOWLEDGE_SOURCE_BATTERY);
                            SubLObject new_knowledge_source = methods.funcall_instance_method_with_1_args(ksb, KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID, transaction_id);
                            SubLObject external_module = (NIL != new_knowledge_source) ? ((SubLObject) (cyblack_ks.cyblack_external_knowledge_source_get_external_knowledge_source_method(new_knowledge_source))) : NIL;
                            if (NIL == new_knowledge_source) {
                                Errors.warn($str_alt556$_EXECUTE__S___Received_an_accept_, self, transaction_id);
                                sublisp_throw($sym552$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD, NIL);
                            }
                            knowledge_source = new_knowledge_source;
                            cyblack_ks_dispatch_functions.cyblack_ks_set_application(new_knowledge_source, application);
                            if (NIL != precondition_pattern) {
                                cyblack_ks_dispatch_functions.cyblack_ks_set_precondition_pattern(new_knowledge_source, precondition_pattern);
                            }
                            if (NIL != message_broker) {
                                {
                                    SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                                    if ((NIL != guid_manager) && (NIL != external_module_id)) {
                                        cyblack_message_broker.cyblack_guid_manager_intern_method(guid_manager, external_module_id, NIL, external_module);
                                    }
                                }
                            }
                            if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(new_knowledge_source)) {
                                methods.funcall_instance_method_with_1_args(new_knowledge_source, LINK_TO_PANELS_CALLBACK, self);
                            }
                            sublisp_throw($sym552$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD, new_knowledge_source);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_accept_message_precondition_pattern(self, precondition_pattern);
                                set_cyblack_message_message_broker(self, message_broker);
                                set_cyblack_message_external_module_id(self, external_module_id);
                                set_cyblack_message_transaction_id(self, transaction_id);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_accept_message_method = Errors.handleThrowable(ccatch_env_var, $sym552$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_accept_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_propid_receive_message_propid(SubLObject cyblack_embedded_propid_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_propid_receive_message, TWELVE_INTEGER, PROPID);
    }

    public static final SubLObject set_cyblack_embedded_propid_receive_message_propid(SubLObject cyblack_embedded_propid_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_propid_receive_message, value, TWELVE_INTEGER, PROPID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_p(SubLObject cyblack_embedded_propid_receive_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_propid_receive_message, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_embedded_propid_receive_message_set_propid_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_receive_message_method = NIL;
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            try {
                try {
                    sublisp_throw($sym563$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD, listS(propid, $PROPID, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_receive_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym563$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_propid_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_receive_message_method = NIL;
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            try {
                try {
                    format(stream, $str_alt377$__PROPID__S, propid);
                    sublisp_throw($sym565$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_receive_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym565$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_propid_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_embedded_propid_receive_message_set_propid_method(self, getf(message_args, $PROPID, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_get_propid_method(SubLObject self) {
        {
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            return propid;
        }
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_set_propid_method(SubLObject self, SubLObject new_propid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_embedded_propid_receive_message_method = NIL;
                SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(((NIL == new_propid) || new_propid.isString()) || (NIL != Guids.guid_p(new_propid)))) {
                                Errors.error($str_alt388$_SET_PROPID__S____S_is_not_a_vali, self, new_propid);
                            }
                        }
                        if (NIL != Guids.guid_p(new_propid)) {
                            propid = Guids.guid_to_string(new_propid);
                        } else {
                            propid = new_propid;
                        }
                        sublisp_throw($sym570$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD, new_propid);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_propid_receive_message_propid(self, propid);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_embedded_propid_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym570$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_embedded_propid_receive_message_method;
            }
        }
    }

    public static final SubLObject cyblack_embedded_propid_receive_message_get_all_ids_method(SubLObject self) {
        {
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            return NIL != propid ? ((SubLObject) (cons(propid, cyblack_message_get_all_ids_method(self)))) : cyblack_message_get_all_ids_method(self);
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_decline_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_decline_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_decline_message_p(SubLObject cyblack_decline_message) {
        return classes.subloop_instanceof_class(cyblack_decline_message, CYBLACK_DECLINE_MESSAGE);
    }

    public static final SubLObject cyblack_decline_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $DECLINE);
        return self;
    }

    public static final SubLObject cyblack_decline_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_decline_message_method = NIL;
                SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == propid) {
                                Errors.error($str_alt583$_EXECUTE__S___No_proposal_id_is_a, self);
                            }
                        }
                        if (NIL != message_broker) {
                            cyblack_message_broker.cyblack_message_broker_expunge_common_ids_method(message_broker, self);
                            if (NIL != propid) {
                                cyblack_message_broker.cyblack_message_broker_expunge_specific_id_method(message_broker, propid, self);
                            }
                        }
                        sublisp_throw($sym581$OUTER_CATCH_FOR_CYBLACK_DECLINE_MESSAGE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_propid_receive_message_propid(self, propid);
                                set_cyblack_message_message_broker(self, message_broker);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_decline_message_method = Errors.handleThrowable(ccatch_env_var, $sym581$OUTER_CATCH_FOR_CYBLACK_DECLINE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_decline_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_propid_conf_receive_message_conf(SubLObject cyblack_embedded_propid_conf_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_propid_conf_receive_message, THIRTEEN_INTEGER, CONF);
    }

    public static final SubLObject set_cyblack_embedded_propid_conf_receive_message_conf(SubLObject cyblack_embedded_propid_conf_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_propid_conf_receive_message, value, THIRTEEN_INTEGER, CONF);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_conf_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_conf_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CONF, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_p(SubLObject cyblack_embedded_propid_conf_receive_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_propid_conf_receive_message, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_receive_message_initialize_method(self);
        cyblack_embedded_propid_conf_receive_message_set_conf_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_receive_message_method = NIL;
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            try {
                try {
                    sublisp_throw($sym593$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH, listS(conf, $CONF, cyblack_embedded_propid_receive_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_receive_message_conf(self, conf);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym593$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH);
            }
            return catch_var_for_cyblack_embedded_propid_conf_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_receive_message_method = NIL;
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            try {
                try {
                    cyblack_embedded_propid_receive_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt598$__CONF__S, conf);
                    sublisp_throw($sym597$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_receive_message_conf(self, conf);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym597$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH);
            }
            return catch_var_for_cyblack_embedded_propid_conf_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_parse_args_method(SubLObject self, SubLObject message_args) {
        cyblack_embedded_propid_receive_message_parse_args_method(self, message_args);
        cyblack_embedded_propid_conf_receive_message_set_conf_method(self, getf(message_args, $CONF, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_get_conf_method(SubLObject self) {
        {
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            return conf;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_receive_message_set_conf_method(SubLObject self, SubLObject new_conf) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_receive_message_method = NIL;
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            try {
                try {
                    conf = new_conf;
                    sublisp_throw($sym608$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH, new_conf);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_receive_message_conf(self, conf);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym608$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH);
            }
            return catch_var_for_cyblack_embedded_propid_conf_receive_message_method;
        }
    }

    public static final SubLObject get_cyblack_request_contents_message_type_string(SubLObject cyblack_request_contents_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_request_contents_message, TWELVE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject set_cyblack_request_contents_message_type_string(SubLObject cyblack_request_contents_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_request_contents_message, value, TWELVE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_request_contents_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_request_contents_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_REQUEST_CONTENTS_MESSAGE, TYPE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_request_contents_message_p(SubLObject cyblack_request_contents_message) {
        return classes.subloop_instanceof_class(cyblack_request_contents_message, CYBLACK_REQUEST_CONTENTS_MESSAGE);
    }

    public static final SubLObject cyblack_request_contents_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $REQUEST_CONTENTS);
        cyblack_request_contents_message_set_type_string_method(self, $$$POSTING);
        return self;
    }

    public static final SubLObject cyblack_request_contents_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_request_contents_message_method = NIL;
            SubLObject type_string = get_cyblack_request_contents_message_type_string(self);
            try {
                try {
                    sublisp_throw($sym618$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, listS(type_string, $TYPE, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_request_contents_message_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_request_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym618$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_request_contents_message_method;
        }
    }

    public static final SubLObject cyblack_request_contents_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_request_contents_message_method = NIL;
            SubLObject type_string = get_cyblack_request_contents_message_type_string(self);
            try {
                try {
                    format(stream, $str_alt622$__TYPE__S, type_string);
                    sublisp_throw($sym621$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_request_contents_message_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_request_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym621$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_request_contents_message_method;
        }
    }

    public static final SubLObject cyblack_request_contents_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_request_contents_message_arg_key_type_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_request_contents_message_set_type_string_method(self, getf(message_args, $TYPE, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_request_contents_message_get_type_string_method(SubLObject self) {
        {
            SubLObject type_string = get_cyblack_request_contents_message_type_string(self);
            return type_string;
        }
    }

    public static final SubLObject cyblack_request_contents_message_set_type_string_method(SubLObject self, SubLObject new_type_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_request_contents_message_method = NIL;
                SubLObject type_string = get_cyblack_request_contents_message_type_string(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_type_string.isString()) {
                                Errors.error($str_alt314$_SET_TYPE_STRING__S____S_is_not_a, self, new_type_string);
                            }
                        }
                        type_string = new_type_string;
                        sublisp_throw($sym627$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, new_type_string);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_request_contents_message_type_string(self, type_string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_request_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym627$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_request_contents_message_method;
            }
        }
    }

    public static final SubLObject cyblack_request_contents_message_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_request_contents_message_method = NIL;
            SubLObject type_string = get_cyblack_request_contents_message_type_string(self);
            SubLObject message_broker = get_cyblack_message_message_broker(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (!type_string.isString()) {
                        Errors.warn($str_alt631$_EXECUTE__S____S_is_not_a_valid_t, self, type_string);
                        sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                    }
                    if (NIL == application) {
                        Errors.warn($str_alt632$_EXECUTE__S___No_application_is_a, self);
                        sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                        if (NIL == datatype_dictionary) {
                            Errors.warn($str_alt633$_EXECUTE__S___No_datatype_diction, self, application);
                            sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                        }
                        if (NIL == blackboard) {
                            Errors.warn($str_alt634$_EXECUTE__S___No_blackboard_is_as, self, application);
                            sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                        }
                        {
                            SubLObject type = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, type_string, UNPROVIDED);
                            SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(type, blackboard, UNPROVIDED);
                            if (NIL == panel) {
                                Errors.warn($str_alt635$_EXECUTE__S___No_panel_is_associa, self, type);
                                sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                            }
                            {
                                SubLObject panel_contents = cyblack_panel_dispatch_functions.cyblack_panel_get_all_active_postings(panel);
                                cyblack_message_broker.cyblack_message_broker_report_contents_method(message_broker, self, panel_contents);
                            }
                        }
                    }
                    sublisp_throw($sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_request_contents_message_type_string(self, type_string);
                            set_cyblack_message_message_broker(self, message_broker);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_request_contents_message_method = Errors.handleThrowable(ccatch_env_var, $sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_request_contents_message_method;
        }
    }

    public static final SubLObject get_cyblack_contribute_message_contributions(SubLObject cyblack_contribute_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_contribute_message, FOURTEEN_INTEGER, CONTRIBUTIONS);
    }

    public static final SubLObject set_cyblack_contribute_message_contributions(SubLObject cyblack_contribute_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_contribute_message, value, FOURTEEN_INTEGER, CONTRIBUTIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_contribute_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_contribute_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CONF, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CONTRIBUTE_MESSAGE, CONTRIBUTIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_contribute_message_p(SubLObject cyblack_contribute_message) {
        return classes.subloop_instanceof_class(cyblack_contribute_message, CYBLACK_CONTRIBUTE_MESSAGE);
    }

    public static final SubLObject cyblack_contribute_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_conf_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $CONTRIBUTE);
        cyblack_contribute_message_set_contributions_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_contribute_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_contribute_message_method = NIL;
            SubLObject contributions = get_cyblack_contribute_message_contributions(self);
            try {
                try {
                    sublisp_throw($sym646$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, listS(contributions, $CONTR, cyblack_embedded_propid_conf_receive_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_contribute_message_contributions(self, contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_contribute_message_method = Errors.handleThrowable(ccatch_env_var, $sym646$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_contribute_message_method;
        }
    }

    public static final SubLObject cyblack_contribute_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_contribute_message_method = NIL;
            SubLObject contributions = get_cyblack_contribute_message_contributions(self);
            try {
                try {
                    cyblack_embedded_propid_conf_receive_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt651$__CONTR__S, contributions);
                    sublisp_throw($sym650$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_contribute_message_contributions(self, contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_contribute_message_method = Errors.handleThrowable(ccatch_env_var, $sym650$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_contribute_message_method;
        }
    }

    public static final SubLObject cyblack_contribute_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_embedded_propid_conf_receive_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_contribute_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_contribute_message_set_contributions_method(self, getf(message_args, $CONTR, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_contribute_message_get_contributions_method(SubLObject self) {
        {
            SubLObject contributions = get_cyblack_contribute_message_contributions(self);
            return contributions;
        }
    }

    public static final SubLObject cyblack_contribute_message_set_contributions_method(SubLObject self, SubLObject new_contributions) {
        {
            SubLObject catch_var_for_cyblack_contribute_message_method = NIL;
            SubLObject contributions = get_cyblack_contribute_message_contributions(self);
            try {
                try {
                    contributions = new_contributions;
                    sublisp_throw($sym661$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, new_contributions);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_contribute_message_contributions(self, contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_contribute_message_method = Errors.handleThrowable(ccatch_env_var, $sym661$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_contribute_message_method;
        }
    }

    public static final SubLObject cyblack_contribute_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_contribute_message_method = NIL;
                SubLObject contributions = get_cyblack_contribute_message_contributions(self);
                SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == propid) {
                                Errors.error($str_alt583$_EXECUTE__S___No_proposal_id_is_a, self);
                            }
                        }
                        {
                            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                            SubLObject proposal = (NIL != guid_manager) ? ((SubLObject) (cyblack_message_broker.cyblack_guid_manager_get_reference_method(guid_manager, propid))) : NIL;
                            if (NIL == knowledge_source) {
                                Errors.warn($str_alt665$_EXECUTE__S___No_knowledge_source, self);
                                sublisp_throw($sym664$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, NIL);
                            }
                            if (!((NIL != proposal) || (NIL != cyblack_ks_dispatch_functions.cyblack_ks_post_at_will_p(knowledge_source)))) {
                                Errors.warn($str_alt666$_EXECUTE__S___Could_not_find_the_, self, propid);
                                sublisp_throw($sym664$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, NIL);
                            }
                            {
                                SubLObject application_1 = methods.funcall_instance_method_with_0_args(knowledge_source, GET_APPLICATION);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == application_1) {
                                        Errors.error($str_alt668$_EXECUTE__S___No_application_is_a, self, knowledge_source);
                                    }
                                }
                                {
                                    SubLObject datatype_dictionary = methods.funcall_instance_method_with_0_args(application_1, GET_DATATYPE_DICTIONARY);
                                    SubLObject blackboard = methods.funcall_instance_method_with_0_args(application_1, GET_BLACKBOARD);
                                    SubLObject v_agenda = methods.funcall_instance_method_with_0_args(application_1, GET_AGENDA);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == datatype_dictionary) {
                                            Errors.error($str_alt670$_EXECUTE__S___No_datatype_diction, self, application_1);
                                        }
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == blackboard) {
                                            Errors.error($str_alt671$_EXECUTE__S___No_blackboard_is_as, self, application_1);
                                        }
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == v_agenda) {
                                            Errors.error($str_alt672$_EXECUTE__S___No_agenda_is_associ, self, application_1);
                                        }
                                    }
                                    {
                                        SubLObject ksi = (NIL != proposal) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(proposal, NEW_KSI))) : object.new_class_instance(CYBLACK_EXTERNAL_KSI);
                                        SubLObject activation_pattern = (NIL != proposal) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(proposal, GET_ACTIVATION_PATTERN))) : NIL;
                                        SubLObject posting_datatype = NIL;
                                        SubLObject new_posting = NIL;
                                        SubLObject posting_list = NIL;
                                        cyblack_ksi.cyblack_basic_ksi_set_activation_pattern_method(ksi, NIL != activation_pattern ? ((SubLObject) (methods.funcall_instance_method_with_0_args(activation_pattern, CLONE))) : NIL);
                                        cyblack_ksi.cyblack_ksi_set_application(ksi, application_1);
                                        if (!contributions.isList()) {
                                            Errors.warn($str_alt676$_EXECUTE__S___The_contribution_li, self, contributions);
                                            contributions = NIL;
                                        } else
                                            if (contributions.isCons() && contributions.first().isString()) {
                                                Errors.warn($str_alt677$_EXECUTE__S____S_is_not_a_list_of, self, contributions);
                                                contributions = list(contributions);
                                            } else
                                                if (!((NIL == contributions) || ((contributions.isCons() && contributions.first().isCons()) && caar(contributions).isString()))) {
                                                    Errors.warn($str_alt678$_EXECUTE__S____S_is_not_a_valid_c, self, contributions);
                                                }


                                        {
                                            SubLObject cdolist_list_var = contributions;
                                            SubLObject contribution = NIL;
                                            for (contribution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contribution = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = contribution;
                                                    SubLObject current = datum;
                                                    SubLObject datatype_string = NIL;
                                                    SubLObject v_properties = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt679);
                                                    datatype_string = current.first();
                                                    current = current.rest();
                                                    v_properties = current;
                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                        if (!datatype_string.isString()) {
                                                            Errors.error($str_alt680$_EXECUTE__S____S_is_not_a_valid_d, self, datatype_string);
                                                        }
                                                    }
                                                    posting_datatype = methods.funcall_instance_method_with_1_args(datatype_dictionary, INTERN, datatype_string);
                                                    new_posting = methods.funcall_instance_method_with_0_args(posting_datatype, CREATE_POSTING);
                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                        if (NIL == new_posting) {
                                                            Errors.error($str_alt683$_EXECUTE__S___Unable_to_create_a_, self, posting_datatype);
                                                        }
                                                    }
                                                    methods.funcall_instance_method_with_1_args(new_posting, ASSIMILATE, v_properties);
                                                    posting_list = cons(new_posting, posting_list);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = posting_list;
                                            SubLObject posting = NIL;
                                            for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                                                methods.funcall_instance_method_with_1_args(posting, SET_KSI, ksi);
                                                methods.funcall_instance_method_with_1_args(posting, SET_ACTIVATION_PATTERN, NIL != activation_pattern ? ((SubLObject) (methods.funcall_instance_method_with_0_args(activation_pattern, CLONE))) : NIL);
                                                methods.funcall_instance_method_with_1_args(posting, SET_APPLICATION, application_1);
                                                methods.funcall_instance_method_with_1_args(posting, SET_DATATYPE, posting_datatype);
                                            }
                                        }
                                        cyblack_ksi.cyblack_external_ksi_set_postings_method(ksi, nreverse(posting_list));
                                        force_output(T);
                                        methods.funcall_instance_method_with_1_args(v_agenda, ADD_EXECUTABLE_KSI, ksi);
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym664$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_contribute_message_contributions(self, contributions);
                                set_cyblack_embedded_propid_receive_message_propid(self, propid);
                                set_cyblack_message_message_broker(self, message_broker);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_contribute_message_method = Errors.handleThrowable(ccatch_env_var, $sym664$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_contribute_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_propid_excuses_receive_message_excuses(SubLObject cyblack_embedded_propid_excuses_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_propid_excuses_receive_message, THIRTEEN_INTEGER, EXCUSES);
    }

    public static final SubLObject set_cyblack_embedded_propid_excuses_receive_message_excuses(SubLObject cyblack_embedded_propid_excuses_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_propid_excuses_receive_message, value, THIRTEEN_INTEGER, EXCUSES);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_excuses_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_excuses_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, EXCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_p(SubLObject cyblack_embedded_propid_excuses_receive_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_propid_excuses_receive_message, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_receive_message_initialize_method(self);
        cyblack_embedded_propid_excuses_receive_message_set_excuses_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_propid_excuses_receive_message_excuses(self);
            try {
                try {
                    sublisp_throw($sym698$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M, listS(excuses, $EXCUSES, cyblack_embedded_propid_receive_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym698$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M);
            }
            return catch_var_for_cyblack_embedded_propid_excuses_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_propid_excuses_receive_message_excuses(self);
            try {
                try {
                    cyblack_embedded_propid_receive_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt703$__EXCUSES__S, excuses);
                    sublisp_throw($sym702$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym702$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M);
            }
            return catch_var_for_cyblack_embedded_propid_excuses_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_parse_args_method(SubLObject self, SubLObject message_args) {
        cyblack_embedded_propid_receive_message_parse_args_method(self, message_args);
        cyblack_embedded_propid_excuses_receive_message_set_excuses_method(self, getf(message_args, $EXCUSES, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_get_excuses_method(SubLObject self) {
        {
            SubLObject excuses = get_cyblack_embedded_propid_excuses_receive_message_excuses(self);
            return excuses;
        }
    }

    public static final SubLObject cyblack_embedded_propid_excuses_receive_message_set_excuses_method(SubLObject self, SubLObject new_excuses) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_propid_excuses_receive_message_excuses(self);
            try {
                try {
                    excuses = new_excuses;
                    sublisp_throw($sym713$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M, new_excuses);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym713$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M);
            }
            return catch_var_for_cyblack_embedded_propid_excuses_receive_message_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_revoke_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_revoke_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, EXCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_revoke_message_p(SubLObject cyblack_revoke_message) {
        return classes.subloop_instanceof_class(cyblack_revoke_message, CYBLACK_REVOKE_MESSAGE);
    }

    public static final SubLObject cyblack_revoke_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_excuses_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $REVOKE);
        return self;
    }

    public static final SubLObject cyblack_revoke_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_revoke_message_method = NIL;
                SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt632$_EXECUTE__S___No_application_is_a, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == propid) {
                                Errors.error($str_alt723$_EXECUTE__S___No_proposal_ID_is_a, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        {
                            SubLObject v_agenda = methods.funcall_instance_method_with_0_args(application, GET_AGENDA);
                            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == v_agenda) {
                                    Errors.error($str_alt672$_EXECUTE__S___No_agenda_is_associ, self, application);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == guid_manager) {
                                    Errors.error($str_alt724$_EXECUTE__S___No_guid_manager_is_, self, message_broker);
                                }
                            }
                            {
                                SubLObject proposal = (NIL != guid_manager) ? ((SubLObject) (cyblack_message_broker.cyblack_guid_manager_get_reference_method(guid_manager, propid))) : NIL;
                                if (NIL != proposal) {
                                    methods.funcall_instance_method_with_1_args(v_agenda, RETRACT, proposal);
                                    methods.funcall_instance_method_with_1_args(v_agenda, REMOVE_ACTIVE_PROPOSAL, proposal);
                                } else {
                                    Errors.warn($str_alt727$_EXECUTE__S___Received_a_REVOKE_m, self);
                                }
                                cyblack_message_broker.cyblack_message_broker_expunge_common_ids_method(message_broker, self);
                                cyblack_message_broker.cyblack_message_broker_expunge_specific_id_method(message_broker, propid, self);
                                sublisp_throw($sym722$OUTER_CATCH_FOR_CYBLACK_REVOKE_MESSAGE_METHOD, T);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_propid_receive_message_propid(self, propid);
                                set_cyblack_message_message_broker(self, message_broker);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_revoke_message_method = Errors.handleThrowable(ccatch_env_var, $sym722$OUTER_CATCH_FOR_CYBLACK_REVOKE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_revoke_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(SubLObject cyblack_embedded_propid_conf_reasons_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_propid_conf_reasons_receive_message, FOURTEEN_INTEGER, REASONS);
    }

    public static final SubLObject set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(SubLObject cyblack_embedded_propid_conf_reasons_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_propid_conf_reasons_receive_message, value, FOURTEEN_INTEGER, REASONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_conf_reasons_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_propid_conf_reasons_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CONF, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, REASONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_p(SubLObject cyblack_embedded_propid_conf_reasons_receive_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_propid_conf_reasons_receive_message, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_conf_receive_message_initialize_method(self);
        cyblack_embedded_propid_conf_reasons_receive_message_set_reasons_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = NIL;
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            try {
                try {
                    sublisp_throw($sym737$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS, listS(reasons, $REASONS, cyblack_embedded_propid_conf_receive_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self, reasons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym737$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS);
            }
            return catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = NIL;
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            try {
                try {
                    cyblack_embedded_propid_conf_receive_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt742$__REASONS__S, reasons);
                    sublisp_throw($sym741$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self, reasons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym741$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS);
            }
            return catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_parse_args_method(SubLObject self, SubLObject message_args) {
        cyblack_embedded_propid_conf_receive_message_parse_args_method(self, message_args);
        cyblack_embedded_propid_conf_reasons_receive_message_set_reasons_method(self, getf(message_args, $REASONS, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_get_reasons_method(SubLObject self) {
        {
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            return reasons;
        }
    }

    public static final SubLObject cyblack_embedded_propid_conf_reasons_receive_message_set_reasons_method(SubLObject self, SubLObject new_reasons) {
        {
            SubLObject catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = NIL;
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            try {
                try {
                    reasons = new_reasons;
                    sublisp_throw($sym752$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS, new_reasons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self, reasons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym752$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS);
            }
            return catch_var_for_cyblack_embedded_propid_conf_reasons_receive_message_method;
        }
    }

    public static final SubLObject get_cyblack_propose_message_datatype_bag(SubLObject cyblack_propose_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_propose_message, FIFTEEN_INTEGER, DATATYPE_BAG);
    }

    public static final SubLObject set_cyblack_propose_message_datatype_bag(SubLObject cyblack_propose_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_propose_message, value, FIFTEEN_INTEGER, DATATYPE_BAG);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_propose_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_propose_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CONF, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROPOSE_MESSAGE, DATATYPE_BAG, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_propose_message_p(SubLObject cyblack_propose_message) {
        return classes.subloop_instanceof_class(cyblack_propose_message, CYBLACK_PROPOSE_MESSAGE);
    }

    public static final SubLObject cyblack_propose_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_conf_reasons_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $PROPOSE);
        return self;
    }

    public static final SubLObject cyblack_propose_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_propose_message_method = NIL;
            SubLObject datatype_bag = get_cyblack_propose_message_datatype_bag(self);
            try {
                try {
                    sublisp_throw($sym763$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD, listS(datatype_bag, $DTBAG, cyblack_embedded_propid_conf_reasons_receive_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_propose_message_datatype_bag(self, datatype_bag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_propose_message_method = Errors.handleThrowable(ccatch_env_var, $sym763$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_propose_message_method;
        }
    }

    public static final SubLObject cyblack_propose_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_propose_message_method = NIL;
            SubLObject datatype_bag = get_cyblack_propose_message_datatype_bag(self);
            try {
                try {
                    cyblack_embedded_propid_conf_reasons_receive_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt768$__DTBAG__S, datatype_bag);
                    sublisp_throw($sym767$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_propose_message_datatype_bag(self, datatype_bag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_propose_message_method = Errors.handleThrowable(ccatch_env_var, $sym767$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_propose_message_method;
        }
    }

    public static final SubLObject cyblack_propose_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_embedded_propid_conf_reasons_receive_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_propose_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            {
                SubLObject v_bag = getf(message_args, $DTBAG, UNPROVIDED);
                SubLObject basic_bag = cyblack_datatype_dictionary.cyblack_listified_dt_bag_to_true_dt_bag(cyblack_message_get_datatype_dictionary_method(self), v_bag);
                cyblack_propose_message_set_datatype_bag_method(self, basic_bag);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_propose_message_get_datatype_bag_method(SubLObject self) {
        {
            SubLObject datatype_bag = get_cyblack_propose_message_datatype_bag(self);
            return datatype_bag;
        }
    }

    public static final SubLObject cyblack_propose_message_set_datatype_bag_method(SubLObject self, SubLObject new_datatype_bag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_propose_message_method = NIL;
                SubLObject datatype_bag = get_cyblack_propose_message_datatype_bag(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_datatype_bag.isList() || (NIL != subloop_collections.basic_bag_p(new_datatype_bag)))) {
                                Errors.error($str_alt779$_SET_DATATYPE_BAG__S____S_is_neit, self, new_datatype_bag);
                            }
                        }
                        if (new_datatype_bag.isList()) {
                            {
                                SubLObject new_bag = methods.funcall_instance_method_with_0_args(BASIC_BAG, BASIC_BAG);
                                subloop_collections.basic_bag_set_contents_method(new_bag, new_datatype_bag);
                                datatype_bag = new_bag;
                            }
                        } else
                            if (NIL != subloop_collections.basic_bag_p(new_datatype_bag)) {
                                datatype_bag = new_datatype_bag;
                            } else {
                                datatype_bag = NIL;
                            }

                        sublisp_throw($sym778$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD, new_datatype_bag);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_propose_message_datatype_bag(self, datatype_bag);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_propose_message_method = Errors.handleThrowable(ccatch_env_var, $sym778$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_propose_message_method;
            }
        }
    }

    public static final SubLObject cyblack_propose_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_propose_message_method = NIL;
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == knowledge_source) {
                                Errors.error($str_alt784$_EXECUTE__S___No_knowledge_source, self);
                            }
                        }
                        cyblack_ks.cyblack_external_knowledge_source_create_proposal_callback_method(knowledge_source, self);
                        sublisp_throw($sym783$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_propose_message_method = Errors.handleThrowable(ccatch_env_var, $sym783$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_propose_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_affirm_message_datatype_bag(SubLObject cyblack_affirm_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_affirm_message, FIFTEEN_INTEGER, DATATYPE_BAG);
    }

    public static final SubLObject set_cyblack_affirm_message_datatype_bag(SubLObject cyblack_affirm_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_affirm_message, value, FIFTEEN_INTEGER, DATATYPE_BAG);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_affirm_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_affirm_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PROPID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CONF, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AFFIRM_MESSAGE, DATATYPE_BAG, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_affirm_message_p(SubLObject cyblack_affirm_message) {
        return classes.subloop_instanceof_class(cyblack_affirm_message, CYBLACK_AFFIRM_MESSAGE);
    }

    public static final SubLObject cyblack_affirm_message_initialize_method(SubLObject self) {
        cyblack_embedded_propid_conf_reasons_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $AFFIRM);
        return self;
    }

    public static final SubLObject cyblack_affirm_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_affirm_message_method = NIL;
            SubLObject datatype_bag = get_cyblack_affirm_message_datatype_bag(self);
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            try {
                try {
                    sublisp_throw($sym793$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD, listS(reasons, new SubLObject[]{ $REASONS, datatype_bag, $DT_BAG, conf, $CONF, propid, $PROPID, cyblack_embedded_propid_conf_reasons_receive_message_to_reversed_list_method(self) }));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_affirm_message_datatype_bag(self, datatype_bag);
                            set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self, reasons);
                            set_cyblack_embedded_propid_conf_receive_message_conf(self, conf);
                            set_cyblack_embedded_propid_receive_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_affirm_message_method = Errors.handleThrowable(ccatch_env_var, $sym793$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_affirm_message_method;
        }
    }

    public static final SubLObject cyblack_affirm_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_affirm_message_method = NIL;
            SubLObject datatype_bag = get_cyblack_affirm_message_datatype_bag(self);
            SubLObject reasons = get_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self);
            SubLObject conf = get_cyblack_embedded_propid_conf_receive_message_conf(self);
            SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
            try {
                try {
                    format(stream, $str_alt377$__PROPID__S, propid);
                    if (NIL != conf) {
                        format(stream, $str_alt598$__CONF__S, conf);
                    }
                    if (NIL != datatype_bag) {
                        format(stream, $str_alt768$__DTBAG__S, datatype_bag);
                    }
                    if (NIL != reasons) {
                        format(stream, $str_alt742$__REASONS__S, reasons);
                    }
                    sublisp_throw($sym797$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_affirm_message_datatype_bag(self, datatype_bag);
                            set_cyblack_embedded_propid_conf_reasons_receive_message_reasons(self, reasons);
                            set_cyblack_embedded_propid_conf_receive_message_conf(self, conf);
                            set_cyblack_embedded_propid_receive_message_propid(self, propid);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_affirm_message_method = Errors.handleThrowable(ccatch_env_var, $sym797$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_affirm_message_method;
        }
    }

    public static final SubLObject cyblack_affirm_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_embedded_propid_conf_reasons_receive_message_parse_args_method(self, message_args);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_affirm_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            cyblack_affirm_message_set_datatype_bag_method(self, getf(message_args, $DTBAG, UNPROVIDED));
            return self;
        }
    }

    public static final SubLObject cyblack_affirm_message_get_datatype_bag_method(SubLObject self) {
        {
            SubLObject datatype_bag = get_cyblack_affirm_message_datatype_bag(self);
            return datatype_bag;
        }
    }

    public static final SubLObject cyblack_affirm_message_set_datatype_bag_method(SubLObject self, SubLObject new_datatype_bag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_affirm_message_method = NIL;
                SubLObject datatype_bag = get_cyblack_affirm_message_datatype_bag(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_datatype_bag.isList() || (NIL != subloop_collections.basic_bag_p(new_datatype_bag)))) {
                                Errors.error($str_alt779$_SET_DATATYPE_BAG__S____S_is_neit, self, new_datatype_bag);
                            }
                        }
                        if (new_datatype_bag.isList()) {
                            {
                                SubLObject new_bag = object.new_class_instance(BASIC_BAG);
                                subloop_collections.basic_bag_set_contents_method(new_bag, new_datatype_bag);
                                datatype_bag = new_bag;
                            }
                        } else
                            if (NIL != subloop_collections.basic_bag_p(new_datatype_bag)) {
                                datatype_bag = new_datatype_bag;
                            } else {
                                datatype_bag = NIL;
                            }

                        sublisp_throw($sym803$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD, new_datatype_bag);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_affirm_message_datatype_bag(self, datatype_bag);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_affirm_message_method = Errors.handleThrowable(ccatch_env_var, $sym803$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_affirm_message_method;
            }
        }
    }

    public static final SubLObject cyblack_affirm_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_affirm_message_method = NIL;
                SubLObject propid = get_cyblack_embedded_propid_receive_message_propid(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        {
                            SubLObject v_agenda = cyblack_message_get_agenda_method(self);
                            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == guid_manager) {
                                    Errors.error($str_alt807$_EXECUTE__S___No_guid_manager_is_, self);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == propid) {
                                    Errors.error($str_alt583$_EXECUTE__S___No_proposal_id_is_a, self);
                                }
                            }
                            {
                                SubLObject proposal = cyblack_message_broker.cyblack_guid_manager_get_reference_method(guid_manager, propid);
                                if (NIL == proposal) {
                                    Errors.warn($str_alt808$_EXECUTE__S___No_proposal_is_asso, self, propid);
                                    sublisp_throw($sym806$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD, NIL);
                                }
                                if (NIL != cyblack_proposal.cyblack_external_proposal_p(proposal)) {
                                    {
                                        SubLObject suspended_proposals_list = cyblack_agenda.cyblack_agenda_get_suspended_proposals(v_agenda);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == suspended_proposals_list) {
                                                Errors.error($str_alt809$_EXECUTE__S___No_suspended_propos, self, proposal);
                                            }
                                        }
                                        cyblack_proposal.cyblack_basic_proposal_delete_self_from_collection_method(proposal, suspended_proposals_list);
                                    }
                                    cyblack_proposal.cyblack_external_proposal_confirm_method(proposal);
                                    {
                                        SubLObject active_proposals_queue = cyblack_agenda.cyblack_agenda_get_active_proposals(v_agenda);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == active_proposals_queue) {
                                                Errors.error($str_alt810$_EXECUTE__S___No_active_proposal_, self, proposal);
                                            }
                                        }
                                        subloop_queues.basic_doubly_linked_queue_enqueue_method(active_proposals_queue, proposal);
                                    }
                                }
                            }
                            sublisp_throw($sym806$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_propid_receive_message_propid(self, propid);
                                set_cyblack_message_message_broker(self, message_broker);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_affirm_message_method = Errors.handleThrowable(ccatch_env_var, $sym806$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_affirm_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_embedded_excuses_receive_message_excuses(SubLObject cyblack_embedded_excuses_receive_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_embedded_excuses_receive_message, TWELVE_INTEGER, EXCUSES);
    }

    public static final SubLObject set_cyblack_embedded_excuses_receive_message_excuses(SubLObject cyblack_embedded_excuses_receive_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_embedded_excuses_receive_message, value, TWELVE_INTEGER, EXCUSES);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_excuses_receive_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_embedded_excuses_receive_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, EXCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_p(SubLObject cyblack_embedded_excuses_receive_message) {
        return classes.subloop_instanceof_class(cyblack_embedded_excuses_receive_message, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE);
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_initialize_method(SubLObject self) {
        cyblack_message_initialize_method(self);
        cyblack_embedded_excuses_receive_message_set_excuses_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_embedded_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_excuses_receive_message_excuses(self);
            try {
                try {
                    sublisp_throw($sym816$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD, listS(excuses, $EXCUSES, cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym816$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_excuses_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_embedded_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_excuses_receive_message_excuses(self);
            try {
                try {
                    format(stream, $str_alt703$__EXCUSES__S, excuses);
                    sublisp_throw($sym819$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym819$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_excuses_receive_message_method;
        }
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_parse_args_method(SubLObject self, SubLObject message_args) {
        cyblack_embedded_excuses_receive_message_parse_args_method(self, message_args);
        cyblack_embedded_excuses_receive_message_set_excuses_method(self, getf(message_args, $EXCUSES, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_get_excuses_method(SubLObject self) {
        {
            SubLObject excuses = get_cyblack_embedded_excuses_receive_message_excuses(self);
            return excuses;
        }
    }

    public static final SubLObject cyblack_embedded_excuses_receive_message_set_excuses_method(SubLObject self, SubLObject new_excuses) {
        {
            SubLObject catch_var_for_cyblack_embedded_excuses_receive_message_method = NIL;
            SubLObject excuses = get_cyblack_embedded_excuses_receive_message_excuses(self);
            try {
                try {
                    excuses = new_excuses;
                    sublisp_throw($sym824$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD, new_excuses);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_embedded_excuses_receive_message_excuses(self, excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_embedded_excuses_receive_message_method = Errors.handleThrowable(ccatch_env_var, $sym824$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_embedded_excuses_receive_message_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_reject_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_reject_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, EXCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_reject_message_p(SubLObject cyblack_reject_message) {
        return classes.subloop_instanceof_class(cyblack_reject_message, CYBLACK_REJECT_MESSAGE);
    }

    public static final SubLObject cyblack_reject_message_initialize_method(SubLObject self) {
        cyblack_embedded_excuses_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $REJECT);
        return self;
    }

    public static final SubLObject cyblack_reject_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            force_output(T);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_reject_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            return cyblack_embedded_excuses_receive_message_parse_args_method(self, message_args);
        }
    }

    public static final SubLObject cyblack_reject_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_reject_message_method = NIL;
                SubLObject excuses = get_cyblack_embedded_excuses_receive_message_excuses(self);
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                SubLObject external_module_id = get_cyblack_message_external_module_id(self);
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == external_module_id) {
                                Errors.error($str_alt838$_EXECUTE__S___No_external_module_, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        {
                            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                            if (NIL != guid_manager) {
                                {
                                    SubLObject external_module = cyblack_message_broker.cyblack_guid_manager_get_reference_method(guid_manager, external_module_id);
                                    if (NIL != external_module) {
                                        {
                                            SubLObject eks = external_module;
                                            SubLObject knowledge_source_2 = cyblack_structures.eks_knowledge_source(eks);
                                            if (NIL != knowledge_source_2) {
                                                methods.funcall_instance_method_with_1_args(knowledge_source_2, SET_REJECTED, T);
                                                methods.funcall_instance_method_with_1_args(knowledge_source_2, SET_REJECTION_EXCUSES, excuses);
                                                sublisp_throw($sym837$OUTER_CATCH_FOR_CYBLACK_REJECT_MESSAGE_METHOD, T);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym837$OUTER_CATCH_FOR_CYBLACK_REJECT_MESSAGE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_embedded_excuses_receive_message_excuses(self, excuses);
                                set_cyblack_message_message_broker(self, message_broker);
                                set_cyblack_message_external_module_id(self, external_module_id);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_reject_message_method = Errors.handleThrowable(ccatch_env_var, $sym837$OUTER_CATCH_FOR_CYBLACK_REJECT_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_reject_message_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_acquit_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_acquit_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, CAUSE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RECEIVE_MESSAGE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, EXCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_acquit_message_p(SubLObject cyblack_acquit_message) {
        return classes.subloop_instanceof_class(cyblack_acquit_message, CYBLACK_ACQUIT_MESSAGE);
    }

    public static final SubLObject cyblack_acquit_message_initialize_method(SubLObject self) {
        cyblack_embedded_excuses_receive_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $ACQUIT);
        return self;
    }

    public static final SubLObject cyblack_acquit_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_acquit_message_arg_plist_p(message_args)) {
                    Errors.error($str_alt163$_PARSE_ARGS__S___Argument_list__S, self, message_args);
                }
            }
            return cyblack_embedded_excuses_receive_message_parse_args_method(self, message_args);
        }
    }

    public static final SubLObject cyblack_acquit_message_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_acquit_message_method = NIL;
                SubLObject message_broker = get_cyblack_message_message_broker(self);
                SubLObject external_module_id = get_cyblack_message_external_module_id(self);
                SubLObject knowledge_source = get_cyblack_message_knowledge_source(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == external_module_id) {
                                Errors.error($str_alt838$_EXECUTE__S___No_external_module_, self);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == message_broker) {
                                Errors.error($str_alt582$_EXECUTE__S___No_message_broker_i, self);
                            }
                        }
                        {
                            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                            if (NIL != guid_manager) {
                                {
                                    SubLObject external_module = cyblack_message_broker.cyblack_guid_manager_get_reference_method(guid_manager, external_module_id);
                                    if (NIL != external_module) {
                                        {
                                            SubLObject eks = external_module;
                                            SubLObject knowledge_source_3 = cyblack_structures.eks_knowledge_source(eks);
                                            if (NIL != knowledge_source_3) {
                                                cyblack_ks_dispatch_functions.cyblack_ks_unlink_from_panels(knowledge_source_3);
                                                sublisp_throw($sym851$OUTER_CATCH_FOR_CYBLACK_ACQUIT_MESSAGE_METHOD, T);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym851$OUTER_CATCH_FOR_CYBLACK_ACQUIT_MESSAGE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_message_message_broker(self, message_broker);
                                set_cyblack_message_external_module_id(self, external_module_id);
                                set_cyblack_message_knowledge_source(self, knowledge_source);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_acquit_message_method = Errors.handleThrowable(ccatch_env_var, $sym851$OUTER_CATCH_FOR_CYBLACK_ACQUIT_MESSAGE_METHOD);
                }
                return catch_var_for_cyblack_acquit_message_method;
            }
        }
    }

    public static final SubLObject get_cyblack_modification_message_execution_error_message(SubLObject cyblack_modification_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_modification_message, TEN_INTEGER, EXECUTION_ERROR_MESSAGE);
    }

    public static final SubLObject set_cyblack_modification_message_execution_error_message(SubLObject cyblack_modification_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_modification_message, value, TEN_INTEGER, EXECUTION_ERROR_MESSAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_modification_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_modification_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_modification_message_p(SubLObject cyblack_modification_message) {
        return classes.subloop_instanceof_class(cyblack_modification_message, CYBLACK_MODIFICATION_MESSAGE);
    }

    public static final SubLObject cyblack_modification_message_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_modification_message_method = NIL;
            SubLObject execution_error_message = get_cyblack_modification_message_execution_error_message(self);
            try {
                try {
                    cyblack_message_initialize_method(self);
                    execution_error_message = NIL;
                    sublisp_throw($sym859$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_modification_message_execution_error_message(self, execution_error_message);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_modification_message_method = Errors.handleThrowable(ccatch_env_var, $sym859$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_modification_message_method;
        }
    }

    public static final SubLObject cyblack_modification_message_parse_args_method(SubLObject self, SubLObject message_args) {
        return cyblack_message_parse_args_method(self, message_args);
    }

    public static final SubLObject cyblack_modification_message_get_execution_error_message_method(SubLObject self) {
        {
            SubLObject execution_error_message = get_cyblack_modification_message_execution_error_message(self);
            return execution_error_message;
        }
    }

    public static final SubLObject cyblack_modification_message_set_execution_error_message_method(SubLObject self, SubLObject new_error_message) {
        {
            SubLObject catch_var_for_cyblack_modification_message_method = NIL;
            SubLObject execution_error_message = get_cyblack_modification_message_execution_error_message(self);
            try {
                try {
                    execution_error_message = new_error_message;
                    sublisp_throw($sym869$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD, new_error_message);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_modification_message_execution_error_message(self, execution_error_message);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_modification_message_method = Errors.handleThrowable(ccatch_env_var, $sym869$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_modification_message_method;
        }
    }

    public static final SubLObject cyblack_modification_message_execute_method(SubLObject self) {
        if (NIL != cyblack_application.cyblack_dynamic_application_p(cyblack_object.cyblack_object_get_application_method(self))) {
            cyblack_modification_message_set_execution_error_message_method(self, NIL);
            return T;
        } else {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt872$Modification_message_can_only_me_);
            Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_knowledge_source_manipulation_message_emname(SubLObject cyblack_knowledge_source_manipulation_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_knowledge_source_manipulation_message, ELEVEN_INTEGER, EMNAME);
    }

    public static final SubLObject set_cyblack_knowledge_source_manipulation_message_emname(SubLObject cyblack_knowledge_source_manipulation_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_knowledge_source_manipulation_message, value, ELEVEN_INTEGER, EMNAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_knowledge_source_manipulation_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_knowledge_source_manipulation_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, EMNAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_p(SubLObject cyblack_knowledge_source_manipulation_message) {
        return classes.subloop_instanceof_class(cyblack_knowledge_source_manipulation_message, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE);
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_knowledge_source_manipulation_message_method = NIL;
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            try {
                try {
                    cyblack_modification_message_initialize_method(self);
                    emname = NIL;
                    sublisp_throw($sym881$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_knowledge_source_manipulation_message_emname(self, emname);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_knowledge_source_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym881$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET);
            }
            return catch_var_for_cyblack_knowledge_source_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_knowledge_source_manipulation_message_method = NIL;
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            try {
                try {
                    format(stream, $str_alt885$__EMNAME__S, emname);
                    sublisp_throw($sym884$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_knowledge_source_manipulation_message_emname(self, emname);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_knowledge_source_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym884$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET);
            }
            return catch_var_for_cyblack_knowledge_source_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_knowledge_source_manipulation_message_method = NIL;
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            try {
                try {
                    sublisp_throw($sym888$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET, nconc(list(emname, $EMNAME), cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_knowledge_source_manipulation_message_emname(self, emname);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_knowledge_source_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym888$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET);
            }
            return catch_var_for_cyblack_knowledge_source_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_parse_args_method(SubLObject self, SubLObject message_args) {
        cyblack_modification_message_parse_args_method(self, message_args);
        cyblack_knowledge_source_manipulation_message_set_emname_method(self, getf(message_args, $EMNAME, UNPROVIDED));
        return self;
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_get_emname_method(SubLObject self) {
        {
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            return emname;
        }
    }

    public static final SubLObject cyblack_knowledge_source_manipulation_message_set_emname_method(SubLObject self, SubLObject new_emname) {
        {
            SubLObject catch_var_for_cyblack_knowledge_source_manipulation_message_method = NIL;
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            try {
                try {
                    emname = new_emname;
                    sublisp_throw($sym898$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET, new_emname);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_knowledge_source_manipulation_message_emname(self, emname);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_knowledge_source_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym898$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET);
            }
            return catch_var_for_cyblack_knowledge_source_manipulation_message_method;
        }
    }

    public static final SubLObject get_cyblack_add_knowledge_source_message_port_id(SubLObject cyblack_add_knowledge_source_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_knowledge_source_message, TWELVE_INTEGER, PORT_ID);
    }

    public static final SubLObject set_cyblack_add_knowledge_source_message_port_id(SubLObject cyblack_add_knowledge_source_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_knowledge_source_message, value, TWELVE_INTEGER, PORT_ID);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_knowledge_source_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_knowledge_source_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, EMNAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, PORT_ID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_add_knowledge_source_message_p(SubLObject cyblack_add_knowledge_source_message) {
        return classes.subloop_instanceof_class(cyblack_add_knowledge_source_message, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE);
    }

    public static final SubLObject cyblack_add_knowledge_source_message_initialize_method(SubLObject self) {
        cyblack_knowledge_source_manipulation_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $ADD_KNOWLEDGE_SOURCE);
        cyblack_add_knowledge_source_message_set_port_id_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_add_knowledge_source_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_add_knowledge_source_message_method = NIL;
            SubLObject port_id = get_cyblack_add_knowledge_source_message_port_id(self);
            try {
                try {
                    cyblack_knowledge_source_manipulation_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt910$__PORT_ID__S, port_id);
                    sublisp_throw($sym909$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_knowledge_source_message_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_knowledge_source_message_method = Errors.handleThrowable(ccatch_env_var, $sym909$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_knowledge_source_message_method;
        }
    }

    public static final SubLObject cyblack_add_knowledge_source_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            SubLObject catch_var_for_cyblack_add_knowledge_source_message_method = NIL;
            SubLObject port_id = get_cyblack_add_knowledge_source_message_port_id(self);
            try {
                try {
                    cyblack_knowledge_source_manipulation_message_parse_args_method(self, message_args);
                    port_id = getf(message_args, $PORT_ID, UNPROVIDED);
                    sublisp_throw($sym913$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_knowledge_source_message_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_knowledge_source_message_method = Errors.handleThrowable(ccatch_env_var, $sym913$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_knowledge_source_message_method;
        }
    }

    public static final SubLObject cyblack_add_knowledge_source_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_add_knowledge_source_message_method = NIL;
            SubLObject port_id = get_cyblack_add_knowledge_source_message_port_id(self);
            try {
                try {
                    sublisp_throw($sym917$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD, nconc(list(port_id, $PORT_ID), cyblack_knowledge_source_manipulation_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_knowledge_source_message_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_knowledge_source_message_method = Errors.handleThrowable(ccatch_env_var, $sym917$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_knowledge_source_message_method;
        }
    }

    public static final SubLObject cyblack_add_knowledge_source_message_get_port_id_method(SubLObject self) {
        {
            SubLObject port_id = get_cyblack_add_knowledge_source_message_port_id(self);
            return port_id;
        }
    }

    public static final SubLObject cyblack_add_knowledge_source_message_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            SubLObject catch_var_for_cyblack_add_knowledge_source_message_method = NIL;
            SubLObject port_id = get_cyblack_add_knowledge_source_message_port_id(self);
            try {
                try {
                    port_id = new_port_id;
                    sublisp_throw($sym925$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD, new_port_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_knowledge_source_message_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_knowledge_source_message_method = Errors.handleThrowable(ccatch_env_var, $sym925$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_knowledge_source_message_method;
        }
    }

    public static final SubLObject cyblack_add_knowledge_source_message_execute_method(SubLObject self) {
        if (NIL == cyblack_knowledge_source_manipulation_message_get_emname_method(self)) {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt928$No_external_module_name_assigned_);
            Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
            return NIL;
        }
        if (NIL == cyblack_modification_message_execute_method(self)) {
            return NIL;
        }
        if (NIL != cyblack_ks_dispatch_functions.cyblack_ks_add_knowledge_sources_at_will_p(cyblack_message_get_knowledge_source_method(self))) {
            {
                SubLObject new_ks_instance = object.new_class_instance(DYNAMIC_EXTERNAL_KNOWLEDGE_SOURCE_KS);
                cyblack_ks.cyblack_external_knowledge_source_set_name_method(new_ks_instance, cyblack_knowledge_source_manipulation_message_get_emname_method(self));
                cyblack_ks.cyblack_external_knowledge_source_set_port_id_method(new_ks_instance, cyblack_add_knowledge_source_message_get_port_id_method(self));
                cyblack_application.cyblack_dynamic_application_dynamically_add_knowledge_source(cyblack_object.cyblack_object_get_application_method(self), new_ks_instance);
                return T;
            }
        } else {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt930$Knowledge_source_does_not_have_pe);
            Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_remove_knowledge_source_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_remove_knowledge_source_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, EMNAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_remove_knowledge_source_message_p(SubLObject cyblack_remove_knowledge_source_message) {
        return classes.subloop_instanceof_class(cyblack_remove_knowledge_source_message, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE);
    }

    public static final SubLObject cyblack_remove_knowledge_source_message_initialize_method(SubLObject self) {
        cyblack_knowledge_source_manipulation_message_initialize_method(self);
        cyblack_message_set_message_key_method(self, $REMOVE_KNOWLEDGE_SOURCE);
        return self;
    }

    public static final SubLObject cyblack_remove_knowledge_source_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_remove_knowledge_source_message_method = NIL;
            SubLObject emname = get_cyblack_knowledge_source_manipulation_message_emname(self);
            try {
                try {
                    format(stream, $str_alt885$__EMNAME__S, emname);
                    sublisp_throw($sym938$OUTER_CATCH_FOR_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_knowledge_source_manipulation_message_emname(self, emname);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_remove_knowledge_source_message_method = Errors.handleThrowable(ccatch_env_var, $sym938$OUTER_CATCH_FOR_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_remove_knowledge_source_message_method;
        }
    }

    public static final SubLObject cyblack_remove_knowledge_source_message_execute_method(SubLObject self) {
        if (NIL == cyblack_knowledge_source_manipulation_message_get_emname_method(self)) {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt928$No_external_module_name_assigned_);
            Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
            return NIL;
        }
        {
            SubLObject ksb = cyblack_application.cyblack_application_get_knowledge_source_battery(cyblack_object.cyblack_object_get_application_method(self));
            if (NIL == ksb) {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt941$No_knowledge_source_battery_is_as);
                Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
            if (NIL == cyblack_modification_message_execute_method(self)) {
                return NIL;
            }
            if (NIL != cyblack_ks_dispatch_functions.cyblack_ks_remove_knowledge_sources_at_will_p(cyblack_message_get_knowledge_source_method(self))) {
                {
                    SubLObject old_ks_instance = cyblack_ksb.cyblack_ksb_find_external_knowledge_source(ksb, cyblack_knowledge_source_manipulation_message_get_emname_method(self));
                    if (NIL != old_ks_instance) {
                        cyblack_application.cyblack_dynamic_application_dynamically_remove_knowledge_source(cyblack_object.cyblack_object_get_application_method(self), old_ks_instance);
                    }
                    return T;
                }
            } else {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt942$Knowledge_source_does_not_have_pe);
                Errors.warn($str_alt873$_EXECUTE__S____A, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
        }
    }

    public static final SubLObject get_cyblack_add_posting_class_message_slots(SubLObject cyblack_add_posting_class_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_posting_class_message, THIRTEEN_INTEGER, SLOTS);
    }

    public static final SubLObject set_cyblack_add_posting_class_message_slots(SubLObject cyblack_add_posting_class_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_posting_class_message, value, THIRTEEN_INTEGER, SLOTS);
    }

    public static final SubLObject get_cyblack_add_posting_class_message_super_class(SubLObject cyblack_add_posting_class_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_posting_class_message, TWELVE_INTEGER, SUPER_CLASS);
    }

    public static final SubLObject set_cyblack_add_posting_class_message_super_class(SubLObject cyblack_add_posting_class_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_posting_class_message, value, TWELVE_INTEGER, SUPER_CLASS);
    }

    public static final SubLObject get_cyblack_add_posting_class_message_direct_class(SubLObject cyblack_add_posting_class_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_posting_class_message, ELEVEN_INTEGER, DIRECT_CLASS);
    }

    public static final SubLObject set_cyblack_add_posting_class_message_direct_class(SubLObject cyblack_add_posting_class_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_posting_class_message, value, ELEVEN_INTEGER, DIRECT_CLASS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_posting_class_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_posting_class_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_POSTING_CLASS_MESSAGE, DIRECT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_POSTING_CLASS_MESSAGE, SUPER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_POSTING_CLASS_MESSAGE, SLOTS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_add_posting_class_message_p(SubLObject cyblack_add_posting_class_message) {
        return classes.subloop_instanceof_class(cyblack_add_posting_class_message, CYBLACK_ADD_POSTING_CLASS_MESSAGE);
    }

    public static final SubLObject cyblack_add_posting_class_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject v_slots = get_cyblack_add_posting_class_message_slots(self);
            SubLObject super_class = get_cyblack_add_posting_class_message_super_class(self);
            SubLObject direct_class = get_cyblack_add_posting_class_message_direct_class(self);
            try {
                try {
                    format(stream, $str_alt953$__CLASS__S__SUPER_CLASS__S__SLOTS, new SubLObject[]{ direct_class, super_class, v_slots });
                    sublisp_throw($sym952$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_slots(self, v_slots);
                            set_cyblack_add_posting_class_message_super_class(self, super_class);
                            set_cyblack_add_posting_class_message_direct_class(self, direct_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym952$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject v_slots = get_cyblack_add_posting_class_message_slots(self);
            SubLObject super_class = get_cyblack_add_posting_class_message_super_class(self);
            SubLObject direct_class = get_cyblack_add_posting_class_message_direct_class(self);
            try {
                try {
                    cyblack_modification_message_parse_args_method(self, message_args);
                    direct_class = getf(message_args, $CLASS, UNPROVIDED);
                    super_class = getf(message_args, $SUPER_CLASS, UNPROVIDED);
                    v_slots = getf(message_args, $SLOTS, UNPROVIDED);
                    if (direct_class.isString()) {
                        direct_class = intern(direct_class, UNPROVIDED);
                    }
                    if (super_class.isString()) {
                        super_class = intern(super_class, UNPROVIDED);
                    }
                    if (v_slots.isList()) {
                        {
                            SubLObject new_slots = NIL;
                            SubLObject cdolist_list_var = v_slots;
                            SubLObject slot = NIL;
                            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                if (slot.isSymbol()) {
                                    new_slots = cons(slot, new_slots);
                                } else
                                    if (slot.isString()) {
                                        new_slots = cons(intern(slot, UNPROVIDED), new_slots);
                                    }

                            }
                            v_slots = nreverse(new_slots);
                        }
                    }
                    if (!((NIL != direct_class) && direct_class.isSymbol())) {
                        Errors.warn($str_alt960$_PARSE_ARGS__S____S_is_not_a_vali, self, direct_class);
                        sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, NIL);
                    }
                    if (NIL != classes.classes_retrieve_class(direct_class)) {
                        Errors.warn($str_alt961$_PARSE_ARGS__S____S_is_already_a_, self, direct_class);
                        sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, NIL);
                    }
                    if (!((NIL != super_class) && super_class.isSymbol())) {
                        Errors.warn($str_alt960$_PARSE_ARGS__S____S_is_not_a_vali, self, super_class);
                        sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, NIL);
                    }
                    if (NIL == classes.classes_implements_p(super_class, CYBLACK_POSTING)) {
                        Errors.warn($str_alt963$_PARSE_ARGS__S___Superclass__S_do, self, super_class);
                        sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, NIL);
                    }
                    {
                        SubLObject cdolist_list_var = v_slots;
                        SubLObject slot = NIL;
                        for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                            if (NIL == slot) {
                                Errors.warn($str_alt964$_PARSE_ARGS__S____S_is_not_a_vali, self, slot);
                                sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, NIL);
                            }
                        }
                    }
                    sublisp_throw($sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_slots(self, v_slots);
                            set_cyblack_add_posting_class_message_super_class(self, super_class);
                            set_cyblack_add_posting_class_message_direct_class(self, direct_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject v_slots = get_cyblack_add_posting_class_message_slots(self);
            SubLObject super_class = get_cyblack_add_posting_class_message_super_class(self);
            SubLObject direct_class = get_cyblack_add_posting_class_message_direct_class(self);
            try {
                try {
                    sublisp_throw($sym967$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, nconc(list(v_slots, $SLOTS, super_class, $SUPER_CLASS, direct_class, $CLASS), cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_slots(self, v_slots);
                            set_cyblack_add_posting_class_message_super_class(self, super_class);
                            set_cyblack_add_posting_class_message_direct_class(self, direct_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym967$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_get_direct_class_method(SubLObject self) {
        {
            SubLObject direct_class = get_cyblack_add_posting_class_message_direct_class(self);
            return direct_class;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_set_direct_class_method(SubLObject self, SubLObject new_direct_class) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject direct_class = get_cyblack_add_posting_class_message_direct_class(self);
            try {
                try {
                    direct_class = new_direct_class;
                    sublisp_throw($sym975$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, new_direct_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_direct_class(self, direct_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym975$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_get_super_class_method(SubLObject self) {
        {
            SubLObject super_class = get_cyblack_add_posting_class_message_super_class(self);
            return super_class;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_set_super_class_method(SubLObject self, SubLObject new_super_class) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject super_class = get_cyblack_add_posting_class_message_super_class(self);
            try {
                try {
                    super_class = new_super_class;
                    sublisp_throw($sym983$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, new_super_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_super_class(self, super_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym983$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_get_slots_method(SubLObject self) {
        {
            SubLObject v_slots = get_cyblack_add_posting_class_message_slots(self);
            return v_slots;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_set_slot_method(SubLObject self, SubLObject new_slots) {
        {
            SubLObject catch_var_for_cyblack_add_posting_class_message_method = NIL;
            SubLObject v_slots = get_cyblack_add_posting_class_message_slots(self);
            try {
                try {
                    v_slots = copy_list(new_slots);
                    sublisp_throw($sym991$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD, new_slots);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_posting_class_message_slots(self, v_slots);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_posting_class_message_method = Errors.handleThrowable(ccatch_env_var, $sym991$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_posting_class_message_method;
        }
    }

    public static final SubLObject cyblack_add_posting_class_message_execute_method(SubLObject self) {
        {
            SubLObject initial_message = $str_alt994$Cannot_add_posting_class_;
            cyblack_modification_message_set_execution_error_message_method(self, initial_message);
            if (NIL == cyblack_add_posting_class_message_get_direct_class_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt995$No_class_name_has_been_provided__));
            }
            if (NIL == cyblack_add_posting_class_message_get_super_class_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt996$No_super_class_has_been_provided_));
            }
            if (NIL == cyblack_object.cyblack_object_get_application_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt997$No_associated_application___));
            }
            if (NIL == cyblack_message_get_knowledge_source_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt998$No_associated_knowledge_source__));
            }
            if (cyblack_modification_message_get_execution_error_message_method(self) != initial_message) {
                Errors.warn($str_alt999$_SET_SLOT__S____A, self, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
            cyblack_modification_message_set_execution_error_message_method(self, NIL);
            if (NIL == cyblack_modification_message_execute_method(self)) {
                return NIL;
            }
            if (NIL == cyblack_ks_dispatch_functions.cyblack_ks_add_posting_classes_at_will_p(cyblack_message_get_knowledge_source_method(self))) {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt1000$Knowledge_source_does_not_have_pe);
                Errors.warn($str_alt999$_SET_SLOT__S____A, self, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
            cyblack_application.cyblack_dynamic_application_dynamically_add_posting_class(cyblack_object.cyblack_object_get_application_method(self), cyblack_add_posting_class_message_get_direct_class_method(self), cyblack_add_posting_class_message_get_super_class_method(self), NIL, cyblack_add_posting_class_message_get_slots_method(self));
            return T;
        }
    }

    public static final SubLObject get_cyblack_panel_manipulation_message_type(SubLObject cyblack_panel_manipulation_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_panel_manipulation_message, ELEVEN_INTEGER, TYPE);
    }

    public static final SubLObject set_cyblack_panel_manipulation_message_type(SubLObject cyblack_panel_manipulation_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_panel_manipulation_message, value, ELEVEN_INTEGER, TYPE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_panel_manipulation_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_panel_manipulation_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PANEL_MANIPULATION_MESSAGE, TYPE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_panel_manipulation_message_p(SubLObject cyblack_panel_manipulation_message) {
        return classes.subloop_instanceof_class(cyblack_panel_manipulation_message, CYBLACK_PANEL_MANIPULATION_MESSAGE);
    }

    public static final SubLObject cyblack_panel_manipulation_message_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_panel_manipulation_message_method = NIL;
            SubLObject type = get_cyblack_panel_manipulation_message_type(self);
            try {
                try {
                    cyblack_modification_message_initialize_method(self);
                    type = NIL;
                    sublisp_throw($sym1008$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_panel_manipulation_message_type(self, type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_panel_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym1008$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_panel_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_panel_manipulation_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        format(stream, $str_alt622$__TYPE__S, stream);
        return self;
    }

    public static final SubLObject cyblack_panel_manipulation_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            SubLObject catch_var_for_cyblack_panel_manipulation_message_method = NIL;
            SubLObject type = get_cyblack_panel_manipulation_message_type(self);
            try {
                try {
                    cyblack_modification_message_parse_args_method(self, message_args);
                    type = getf(message_args, $TYPES, UNPROVIDED);
                    sublisp_throw($sym1013$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_panel_manipulation_message_type(self, type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_panel_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym1013$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_panel_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_panel_manipulation_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_panel_manipulation_message_method = NIL;
            SubLObject type = get_cyblack_panel_manipulation_message_type(self);
            try {
                try {
                    sublisp_throw($sym1017$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD, nconc(list(type, $TYPE), cyblack_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_panel_manipulation_message_type(self, type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_panel_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym1017$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_panel_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_panel_manipulation_message_get_type_method(SubLObject self) {
        {
            SubLObject type = get_cyblack_panel_manipulation_message_type(self);
            return type;
        }
    }

    public static final SubLObject cyblack_panel_manipulation_message_set_type_method(SubLObject self, SubLObject new_type) {
        {
            SubLObject catch_var_for_cyblack_panel_manipulation_message_method = NIL;
            SubLObject type = get_cyblack_panel_manipulation_message_type(self);
            try {
                try {
                    type = new_type;
                    sublisp_throw($sym1025$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD, new_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_panel_manipulation_message_type(self, type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_panel_manipulation_message_method = Errors.handleThrowable(ccatch_env_var, $sym1025$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_panel_manipulation_message_method;
        }
    }

    public static final SubLObject cyblack_panel_manipulation_message_execute_method(SubLObject self) {
        if (NIL == cyblack_modification_message_execute_method(self)) {
            return NIL;
        }
        if (NIL == cyblack_panel_manipulation_message_get_type_method(self)) {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt1028$No_cyblack_type_has_been_specifie);
            Errors.warn($str_alt1029$_EXECUTE__S____A_, self, cyblack_modification_message_get_execution_error_message_method(self));
            return NIL;
        }
        return T;
    }

    public static final SubLObject get_cyblack_add_panel_message_panel_class(SubLObject cyblack_add_panel_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_panel_message, FOURTEEN_INTEGER, PANEL_CLASS);
    }

    public static final SubLObject set_cyblack_add_panel_message_panel_class(SubLObject cyblack_add_panel_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_panel_message, value, FOURTEEN_INTEGER, PANEL_CLASS);
    }

    public static final SubLObject get_cyblack_add_panel_message_posting_class(SubLObject cyblack_add_panel_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_panel_message, THIRTEEN_INTEGER, POSTING_CLASS);
    }

    public static final SubLObject set_cyblack_add_panel_message_posting_class(SubLObject cyblack_add_panel_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_panel_message, value, THIRTEEN_INTEGER, POSTING_CLASS);
    }

    public static final SubLObject get_cyblack_add_panel_message_supertypes(SubLObject cyblack_add_panel_message) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_add_panel_message, TWELVE_INTEGER, SUPERTYPES);
    }

    public static final SubLObject set_cyblack_add_panel_message_supertypes(SubLObject cyblack_add_panel_message, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_add_panel_message, value, TWELVE_INTEGER, SUPERTYPES);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_panel_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_add_panel_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PANEL_MANIPULATION_MESSAGE, TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_PANEL_MESSAGE, SUPERTYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_PANEL_MESSAGE, POSTING_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ADD_PANEL_MESSAGE, PANEL_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_add_panel_message_p(SubLObject cyblack_add_panel_message) {
        return classes.subloop_instanceof_class(cyblack_add_panel_message, CYBLACK_ADD_PANEL_MESSAGE);
    }

    public static final SubLObject cyblack_add_panel_message_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            try {
                try {
                    cyblack_panel_manipulation_message_initialize_method(self);
                    supertypes = NIL;
                    posting_class = NIL;
                    panel_class = NIL;
                    sublisp_throw($sym1039$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_panel_class(self, panel_class);
                            set_cyblack_add_panel_message_posting_class(self, posting_class);
                            set_cyblack_add_panel_message_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1039$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_print_tail_part_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            try {
                try {
                    cyblack_panel_manipulation_message_print_tail_part_method(self, stream);
                    format(stream, $str_alt1043$__SUPERTYPES__S__POSTING_CLASS__S, new SubLObject[]{ supertypes, posting_class, panel_class });
                    sublisp_throw($sym1042$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_panel_class(self, panel_class);
                            set_cyblack_add_panel_message_posting_class(self, posting_class);
                            set_cyblack_add_panel_message_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1042$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_parse_args_method(SubLObject self, SubLObject message_args) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            try {
                try {
                    cyblack_panel_manipulation_message_parse_args_method(self, message_args);
                    supertypes = copy_list(getf(message_args, $SUPERTYPES, UNPROVIDED));
                    posting_class = getf(message_args, $POSTING_CLASS, UNPROVIDED);
                    panel_class = getf(message_args, $PANEL_CLASS, UNPROVIDED);
                    sublisp_throw($sym1046$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_panel_class(self, panel_class);
                            set_cyblack_add_panel_message_posting_class(self, posting_class);
                            set_cyblack_add_panel_message_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1046$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_to_reversed_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            try {
                try {
                    sublisp_throw($sym1052$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, nconc(list(panel_class, $PANEL_CLASS, posting_class, $POSTING_CLASS, supertypes, $SUPERTYPES), cyblack_panel_manipulation_message_to_reversed_list_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_panel_class(self, panel_class);
                            set_cyblack_add_panel_message_posting_class(self, posting_class);
                            set_cyblack_add_panel_message_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1052$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_get_supertypes_method(SubLObject self) {
        {
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            return supertypes;
        }
    }

    public static final SubLObject cyblack_add_panel_message_set_supertypes_method(SubLObject self, SubLObject new_supertypes) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject supertypes = get_cyblack_add_panel_message_supertypes(self);
            try {
                try {
                    supertypes = new_supertypes;
                    sublisp_throw($sym1060$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, new_supertypes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1060$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_get_posting_class_method(SubLObject self) {
        {
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            return posting_class;
        }
    }

    public static final SubLObject cyblack_add_panel_message_set_posting_class_method(SubLObject self, SubLObject new_posting_class) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject posting_class = get_cyblack_add_panel_message_posting_class(self);
            try {
                try {
                    posting_class = new_posting_class;
                    sublisp_throw($sym1068$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, new_posting_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_posting_class(self, posting_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1068$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_get_panel_class_method(SubLObject self) {
        {
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            return panel_class;
        }
    }

    public static final SubLObject cyblack_add_panel_message_set_panel_class_method(SubLObject self, SubLObject new_panel_class) {
        {
            SubLObject catch_var_for_cyblack_add_panel_message_method = NIL;
            SubLObject panel_class = get_cyblack_add_panel_message_panel_class(self);
            try {
                try {
                    panel_class = new_panel_class;
                    sublisp_throw($sym1076$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD, new_panel_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_add_panel_message_panel_class(self, panel_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_add_panel_message_method = Errors.handleThrowable(ccatch_env_var, $sym1076$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD);
            }
            return catch_var_for_cyblack_add_panel_message_method;
        }
    }

    public static final SubLObject cyblack_add_panel_message_execute_method(SubLObject self) {
        {
            SubLObject initial_message = $str_alt1079$Cannot_add_panel_class__;
            cyblack_modification_message_set_execution_error_message_method(self, initial_message);
            if (NIL == cyblack_add_panel_message_get_supertypes_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt1080$No_supertypes_have_been_specified));
            }
            if (NIL == cyblack_add_panel_message_get_posting_class_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt1081$No_posting_class_has_been_specifi));
            }
            if (NIL == cyblack_add_panel_message_get_panel_class_method(self)) {
                cyblack_modification_message_set_execution_error_message_method(self, cconcatenate(cyblack_modification_message_get_execution_error_message_method(self), $str_alt1082$No_panel_class_has_been_specified));
            }
            if (cyblack_modification_message_get_execution_error_message_method(self) != initial_message) {
                Errors.warn($str_alt873$_EXECUTE__S____A, self, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
            if (NIL == cyblack_panel_manipulation_message_execute_method(self)) {
                return NIL;
            }
            cyblack_modification_message_set_execution_error_message_method(self, NIL);
            if (NIL == cyblack_ks_dispatch_functions.cyblack_ks_add_panels_at_will_p(cyblack_message_get_knowledge_source_method(self))) {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt1083$This_knowledge_source_does_not_ha);
                Errors.warn($str_alt873$_EXECUTE__S____A, self, cyblack_modification_message_get_execution_error_message_method(self));
                return NIL;
            }
            cyblack_application.cyblack_dynamic_application_dynamically_add_panel(cyblack_object.cyblack_object_get_application_method(self), cyblack_panel_manipulation_message_get_type_method(self), cyblack_add_panel_message_get_supertypes_method(self), cyblack_add_panel_message_get_posting_class_method(self), cyblack_add_panel_message_get_panel_class_method(self));
            return T;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_remove_panel_message_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_remove_panel_message_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, SESSION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, EXTERNAL_MODULE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MESSAGE, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_MODIFICATION_MESSAGE, EXECUTION_ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PANEL_MANIPULATION_MESSAGE, TYPE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_remove_panel_message_p(SubLObject cyblack_remove_panel_message) {
        return classes.subloop_instanceof_class(cyblack_remove_panel_message, CYBLACK_REMOVE_PANEL_MESSAGE);
    }

    public static final SubLObject cyblack_remove_panel_message_initialize_method(SubLObject self) {
        cyblack_panel_manipulation_message_initialize_method(self);
        return self;
    }

    public static final SubLObject cyblack_remove_panel_message_execute_method(SubLObject self) {
        if (NIL == cyblack_object.cyblack_object_get_application_method(self)) {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt1091$No_application_is_associated_with);
            return NIL;
        }
        if (NIL == cyblack_panel_manipulation_message_get_type_method(self)) {
            cyblack_modification_message_set_execution_error_message_method(self, $str_alt1092$No_type_was_supplied_);
            return NIL;
        }
        if (NIL == cyblack_panel_manipulation_message_execute_method(self)) {
            return NIL;
        }
        {
            SubLObject knowledge_source = cyblack_message_get_knowledge_source_method(self);
            if (NIL == knowledge_source) {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt1093$No_knowledge_source_is_associated);
                return NIL;
            }
            if (NIL == cyblack_ks_dispatch_functions.cyblack_ks_remove_panels_at_will_p(knowledge_source)) {
                cyblack_modification_message_set_execution_error_message_method(self, $str_alt1094$This_knowledge_source_does_not_ha);
                return NIL;
            }
            cyblack_application.cyblack_dynamic_application_dynamically_remove_panel(cyblack_object.cyblack_object_get_application_method(self), cyblack_panel_manipulation_message_get_type_method(self));
            return T;
        }
    }

    public static final SubLObject declare_cyblack_messages_file() {
        declareFunction("valid_cyblack_message_key_types", "VALID-CYBLACK-MESSAGE-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_message_key_type_p", "CYBLACK-MESSAGE-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_message_key_type", "ENCODE-CYBLACK-MESSAGE-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_message_key_type", "DECODE-CYBLACK-MESSAGE-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_message_key_type_less_p", "CYBLACK-MESSAGE-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_message_key_type_greater_p", "CYBLACK-MESSAGE-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("valid_cyblack_message_arg_key_types", "VALID-CYBLACK-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_message_arg_key_type_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_message_arg_key_type", "ENCODE-CYBLACK-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_message_arg_key_type", "DECODE-CYBLACK-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_message_arg_key_type_less_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_message_arg_key_type_greater_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_message_arg_plist_p", "CYBLACK-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_message_arg_key_type_for_dynamic_appss", "VALID-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPSS", 0, 0, false);
        declareFunction("cyblack_message_arg_key_type_for_dynamic_apps_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS-P", 1, 0, false);
        declareFunction("encode_cyblack_message_arg_key_type_for_dynamic_apps", "ENCODE-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS", 1, 0, false);
        declareFunction("decode_cyblack_message_arg_key_type_for_dynamic_apps", "DECODE-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS", 1, 0, false);
        declareFunction("cyblack_message_arg_key_type_for_dynamic_apps_less_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS-LESS-P", 2, 0, false);
        declareFunction("cyblack_message_arg_key_type_for_dynamic_apps_greater_p", "CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS-GREATER-P", 2, 0, false);
        declareFunction("cyblack_message_arg_for_dynamic_apps_plist_p", "CYBLACK-MESSAGE-ARG-FOR-DYNAMIC-APPS-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_request_contents_message_arg_key_types", "VALID-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_request_contents_message_arg_key_type_p", "CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_request_contents_message_arg_key_type", "ENCODE-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_request_contents_message_arg_key_type", "DECODE-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_request_contents_message_arg_key_type_less_p", "CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_request_contents_message_arg_key_type_greater_p", "CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_request_contents_message_arg_plist_p", "CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_report_contents_message_arg_key_types", "VALID-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_report_contents_message_arg_key_type_p", "CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_report_contents_message_arg_key_type", "ENCODE-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_report_contents_message_arg_key_type", "DECODE-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_report_contents_message_arg_key_type_less_p", "CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_report_contents_message_arg_key_type_greater_p", "CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_report_contents_message_arg_plist_p", "CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_invite_message_arg_key_types", "VALID-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_invite_message_arg_key_type_p", "CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_invite_message_arg_key_type", "ENCODE-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_invite_message_arg_key_type", "DECODE-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_invite_message_arg_key_type_less_p", "CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_invite_message_arg_key_type_greater_p", "CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_invite_message_arg_plist_p", "CYBLACK-INVITE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_embedded_propid_message_arg_key_types", "VALID-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_embedded_propid_message_arg_key_type_p", "CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_embedded_propid_message_arg_key_type", "ENCODE-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_embedded_propid_message_arg_key_type", "DECODE-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_message_arg_key_type_less_p", "CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_embedded_propid_message_arg_key_type_greater_p", "CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_embedded_propid_message_arg_plist_p", "CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_activation_arglist_message_arg_key_types", "VALID-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_activation_arglist_message_arg_key_type_p", "CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_activation_arglist_message_arg_key_type", "ENCODE-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_activation_arglist_message_arg_key_type", "DECODE-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_activation_arglist_message_arg_key_type_less_p", "CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_activation_arglist_message_arg_key_type_greater_p", "CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_activation_arglist_message_arg_plist_p", "CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_stimulate_message_arg_key_types", "VALID-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_stimulate_message_arg_key_type_p", "CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_stimulate_message_arg_key_type", "ENCODE-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_stimulate_message_arg_key_type", "DECODE-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_stimulate_message_arg_key_type_less_p", "CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_stimulate_message_arg_key_type_greater_p", "CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_stimulate_message_arg_plist_p", "CYBLACK-STIMULATE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_verify_message_arg_key_types", "VALID-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_verify_message_arg_key_type_p", "CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_verify_message_arg_key_type", "ENCODE-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_verify_message_arg_key_type", "DECODE-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_verify_message_arg_key_type_less_p", "CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_verify_message_arg_key_type_greater_p", "CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_verify_message_arg_plist_p", "CYBLACK-VERIFY-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_cancel_message_arg_key_types", "VALID-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_cancel_message_arg_key_type_p", "CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_cancel_message_arg_key_type", "ENCODE-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_cancel_message_arg_key_type", "DECODE-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_cancel_message_arg_key_type_less_p", "CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_cancel_message_arg_key_type_greater_p", "CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_cancel_message_arg_plist_p", "CYBLACK-CANCEL-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_execute_message_arg_key_types", "VALID-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_execute_message_arg_key_type_p", "CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_execute_message_arg_key_type", "ENCODE-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_execute_message_arg_key_type", "DECODE-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_execute_message_arg_key_type_less_p", "CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_execute_message_arg_key_type_greater_p", "CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_execute_message_arg_plist_p", "CYBLACK-EXECUTE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_terminate_message_arg_key_types", "VALID-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_terminate_message_arg_key_type_p", "CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_terminate_message_arg_key_type", "ENCODE-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_terminate_message_arg_key_type", "DECODE-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_terminate_message_arg_key_type_less_p", "CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_terminate_message_arg_key_type_greater_p", "CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_terminate_message_arg_plist_p", "CYBLACK-TERMINATE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_accept_message_arg_key_types", "VALID-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_accept_message_arg_key_type_p", "CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_accept_message_arg_key_type", "ENCODE-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_accept_message_arg_key_type", "DECODE-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_accept_message_arg_key_type_less_p", "CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_accept_message_arg_key_type_greater_p", "CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_accept_message_arg_plist_p", "CYBLACK-ACCEPT-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_reject_message_arg_key_types", "VALID-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_reject_message_arg_key_type_p", "CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_reject_message_arg_key_type", "ENCODE-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_reject_message_arg_key_type", "DECODE-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_reject_message_arg_key_type_less_p", "CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_reject_message_arg_key_type_greater_p", "CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_reject_message_arg_plist_p", "CYBLACK-REJECT-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_propose_message_arg_key_types", "VALID-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_propose_message_arg_key_type_p", "CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_propose_message_arg_key_type", "ENCODE-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_propose_message_arg_key_type", "DECODE-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_propose_message_arg_key_type_less_p", "CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_propose_message_arg_key_type_greater_p", "CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_propose_message_arg_plist_p", "CYBLACK-PROPOSE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_decline_message_arg_key_types", "VALID-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_decline_message_arg_key_type_p", "CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_decline_message_arg_key_type", "ENCODE-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_decline_message_arg_key_type", "DECODE-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_decline_message_arg_key_type_less_p", "CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_decline_message_arg_key_type_greater_p", "CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_decline_message_arg_plist_p", "CYBLACK-DECLINE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_revoke_message_arg_key_types", "VALID-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_revoke_message_arg_key_type_p", "CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_revoke_message_arg_key_type", "ENCODE-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_revoke_message_arg_key_type", "DECODE-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_revoke_message_arg_key_type_less_p", "CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_revoke_message_arg_key_type_greater_p", "CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_revoke_message_arg_plist_p", "CYBLACK-REVOKE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_affirm_message_arg_key_types", "VALID-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_affirm_message_arg_key_type_p", "CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_affirm_message_arg_key_type", "ENCODE-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_affirm_message_arg_key_type", "DECODE-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_affirm_message_arg_key_type_less_p", "CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_affirm_message_arg_key_type_greater_p", "CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_affirm_message_arg_plist_p", "CYBLACK-AFFIRM-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_contribute_message_arg_key_types", "VALID-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_contribute_message_arg_key_type_p", "CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_contribute_message_arg_key_type", "ENCODE-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_contribute_message_arg_key_type", "DECODE-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_contribute_message_arg_key_type_less_p", "CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_contribute_message_arg_key_type_greater_p", "CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_contribute_message_arg_plist_p", "CYBLACK-CONTRIBUTE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_acquit_message_arg_key_types", "VALID-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_acquit_message_arg_key_type_p", "CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_acquit_message_arg_key_type", "ENCODE-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_acquit_message_arg_key_type", "DECODE-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_acquit_message_arg_key_type_less_p", "CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_acquit_message_arg_key_type_greater_p", "CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_acquit_message_arg_plist_p", "CYBLACK-ACQUIT-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cylack_state_change_message_arg_key_types", "VALID-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cylack_state_change_message_arg_key_type_p", "CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cylack_state_change_message_arg_key_type", "ENCODE-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cylack_state_change_message_arg_key_type", "DECODE-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cylack_state_change_message_arg_key_type_less_p", "CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cylack_state_change_message_arg_key_type_greater_p", "CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_state_change_message_arg_plist_p", "CYBLACK-STATE-CHANGE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_event_types", "VALID-CYBLACK-EVENT-TYPES", 0, 0, false);
        declareFunction("cyblack_event_type_p", "CYBLACK-EVENT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_event_type", "ENCODE-CYBLACK-EVENT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_event_type", "DECODE-CYBLACK-EVENT-TYPE", 1, 0, false);
        declareFunction("cyblack_event_type_less_p", "CYBLACK-EVENT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_event_type_greater_p", "CYBLACK-EVENT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_event_type_list_p", "CYBLACK-EVENT-TYPE-LIST-P", 1, 0, false);
        declareFunction("valid_cyblack_add_knowledge_source_message_arg_key_types", "VALID-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_arg_key_type_p", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_add_knowledge_source_message_arg_key_type", "ENCODE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_add_knowledge_source_message_arg_key_type", "DECODE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_arg_key_type_less_p", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_arg_key_type_greater_p", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_arg_plist_p", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_remove_knowledge_source_message_arg_key_types", "VALID-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_arg_key_type_p", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_remove_knowledge_source_message_arg_key_type", "ENCODE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_remove_knowledge_source_message_arg_key_type", "DECODE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_arg_key_type_less_p", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_arg_key_type_greater_p", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_arg_plist_p", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_add_posting_class_message_arg_key_types", "VALID-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_add_posting_class_message_arg_key_type_p", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_add_posting_class_message_arg_key_type", "ENCODE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_add_posting_class_message_arg_key_type", "DECODE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_arg_key_type_less_p", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_arg_key_type_greater_p", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_arg_plist_p", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_add_panel_message_arg_key_types", "VALID-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_add_panel_message_arg_key_type_p", "CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_add_panel_message_arg_key_type", "ENCODE-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_add_panel_message_arg_key_type", "DECODE-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_add_panel_message_arg_key_type_less_p", "CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_add_panel_message_arg_key_type_greater_p", "CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_add_panel_message_arg_plist_p", "CYBLACK-ADD-PANEL-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("valid_cyblack_remove_panel_message_arg_key_types", "VALID-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPES", 0, 0, false);
        declareFunction("cyblack_remove_panel_message_arg_key_type_p", "CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_remove_panel_message_arg_key_type", "ENCODE-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_remove_panel_message_arg_key_type", "DECODE-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE", 1, 0, false);
        declareFunction("cyblack_remove_panel_message_arg_key_type_less_p", "CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_remove_panel_message_arg_key_type_greater_p", "CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_remove_panel_message_arg_plist_p", "CYBLACK-REMOVE-PANEL-MESSAGE-ARG-PLIST-P", 1, 0, false);
        declareFunction("get_cyblack_message_message_broker", "GET-CYBLACK-MESSAGE-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_message_message_broker", "SET-CYBLACK-MESSAGE-MESSAGE-BROKER", 2, 0, false);
        declareFunction("get_cyblack_message_external_module_id", "GET-CYBLACK-MESSAGE-EXTERNAL-MODULE-ID", 1, 0, false);
        declareFunction("set_cyblack_message_external_module_id", "SET-CYBLACK-MESSAGE-EXTERNAL-MODULE-ID", 2, 0, false);
        declareFunction("get_cyblack_message_transaction_id", "GET-CYBLACK-MESSAGE-TRANSACTION-ID", 1, 0, false);
        declareFunction("set_cyblack_message_transaction_id", "SET-CYBLACK-MESSAGE-TRANSACTION-ID", 2, 0, false);
        declareFunction("get_cyblack_message_session_id", "GET-CYBLACK-MESSAGE-SESSION-ID", 1, 0, false);
        declareFunction("set_cyblack_message_session_id", "SET-CYBLACK-MESSAGE-SESSION-ID", 2, 0, false);
        declareFunction("get_cyblack_message_message_key", "GET-CYBLACK-MESSAGE-MESSAGE-KEY", 1, 0, false);
        declareFunction("set_cyblack_message_message_key", "SET-CYBLACK-MESSAGE-MESSAGE-KEY", 2, 0, false);
        declareFunction("get_cyblack_message_knowledge_source", "GET-CYBLACK-MESSAGE-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_message_knowledge_source", "SET-CYBLACK-MESSAGE-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_message_timestamp", "GET-CYBLACK-MESSAGE-TIMESTAMP", 1, 0, false);
        declareFunction("set_cyblack_message_timestamp", "SET-CYBLACK-MESSAGE-TIMESTAMP", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_message_p", "CYBLACK-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_message_initialize_method", "CYBLACK-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_message_parse_args_method", "CYBLACK-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_message_to_string_method", "CYBLACK-MESSAGE-TO-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_message_to_reversed_list_method", "CYBLACK-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_message_to_list_method", "CYBLACK-MESSAGE-TO-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_message_print_method", "CYBLACK-MESSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_message_print_head_part_method", "CYBLACK-MESSAGE-PRINT-HEAD-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_message_print_tail_part_method", "CYBLACK-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_timestamp_method", "CYBLACK-MESSAGE-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_timestamp_method", "CYBLACK-MESSAGE-SET-TIMESTAMP-METHOD", 2, 0, false);
        declareFunction("cyblack_message_timestamp_now_method", "CYBLACK-MESSAGE-TIMESTAMP-NOW-METHOD", 1, 0, false);
        declareFunction("cyblack_message_get_knowledge_source_method", "CYBLACK-MESSAGE-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_knowledge_source_method", "CYBLACK-MESSAGE-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_message_key_method", "CYBLACK-MESSAGE-GET-MESSAGE-KEY-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_message_key_method", "CYBLACK-MESSAGE-SET-MESSAGE-KEY-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_session_id_method", "CYBLACK-MESSAGE-GET-SESSION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_session_id_method", "CYBLACK-MESSAGE-SET-SESSION-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_transaction_id_method", "CYBLACK-MESSAGE-GET-TRANSACTION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_transaction_id_method", "CYBLACK-MESSAGE-SET-TRANSACTION-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_external_module_id_method", "CYBLACK-MESSAGE-GET-EXTERNAL-MODULE-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_external_module_id_method", "CYBLACK-MESSAGE-SET-EXTERNAL-MODULE-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_all_ids_method", "CYBLACK-MESSAGE-GET-ALL-IDS-METHOD", 1, 0, false);
        declareFunction("cyblack_message_get_message_broker_method", "CYBLACK-MESSAGE-GET-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_message_set_message_broker_method", "CYBLACK-MESSAGE-SET-MESSAGE-BROKER-METHOD", 2, 0, false);
        declareFunction("cyblack_message_get_datatype_dictionary_method", "CYBLACK-MESSAGE-GET-DATATYPE-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_message_get_agenda_method", "CYBLACK-MESSAGE-GET-AGENDA-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_transmit_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TRANSMIT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_transmit_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TRANSMIT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_transmit_message_p", "CYBLACK-TRANSMIT-MESSAGE-P", 1, 0, false);
        declareFunction("get_cyblack_report_contents_message_contents", "GET-CYBLACK-REPORT-CONTENTS-MESSAGE-CONTENTS", 1, 0, false);
        declareFunction("set_cyblack_report_contents_message_contents", "SET-CYBLACK-REPORT-CONTENTS-MESSAGE-CONTENTS", 2, 0, false);
        declareFunction("get_cyblack_report_contents_message_type_string", "GET-CYBLACK-REPORT-CONTENTS-MESSAGE-TYPE-STRING", 1, 0, false);
        declareFunction("set_cyblack_report_contents_message_type_string", "SET-CYBLACK-REPORT-CONTENTS-MESSAGE-TYPE-STRING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_report_contents_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-CONTENTS-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_report_contents_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-CONTENTS-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_report_contents_message_p", "CYBLACK-REPORT-CONTENTS-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_report_contents_message_initialize_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_report_contents_message_to_reversed_list_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_report_contents_message_print_contents_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-PRINT-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_report_contents_message_print_tail_part_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_report_contents_message_parse_args_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_report_contents_message_get_type_string_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-GET-TYPE-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_report_contents_message_set_type_string_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-SET-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("cyblack_report_contents_message_get_contents_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_report_contents_message_set_contents_method", "CYBLACK-REPORT-CONTENTS-MESSAGE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_invitation_message_external_module_name", "GET-CYBLACK-INVITATION-MESSAGE-EXTERNAL-MODULE-NAME", 1, 0, false);
        declareFunction("set_cyblack_invitation_message_external_module_name", "SET-CYBLACK-INVITATION-MESSAGE-EXTERNAL-MODULE-NAME", 2, 0, false);
        declareFunction("get_cyblack_invitation_message_application_name", "GET-CYBLACK-INVITATION-MESSAGE-APPLICATION-NAME", 1, 0, false);
        declareFunction("set_cyblack_invitation_message_application_name", "SET-CYBLACK-INVITATION-MESSAGE-APPLICATION-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_invitation_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INVITATION-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_invitation_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INVITATION-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_invitation_message_p", "CYBLACK-INVITATION-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_invitation_message_initialize_method", "CYBLACK-INVITATION-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_invitation_message_to_reversed_list_method", "CYBLACK-INVITATION-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_invitation_message_print_tail_part_method", "CYBLACK-INVITATION-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_invitation_message_parse_args_method", "CYBLACK-INVITATION-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_invitation_message_get_application_name_method", "CYBLACK-INVITATION-MESSAGE-GET-APPLICATION-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_invitation_message_set_application_name_method", "CYBLACK-INVITATION-MESSAGE-SET-APPLICATION-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_invitation_message_get_external_module_name_method", "CYBLACK-INVITATION-MESSAGE-GET-EXTERNAL-MODULE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_invitation_message_set_external_module_name_method", "CYBLACK-INVITATION-MESSAGE-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("get_cyblack_embedded_propid_transmit_message_propid", "GET-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PROPID", 1, 0, false);
        declareFunction("set_cyblack_embedded_propid_transmit_message_propid", "SET-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PROPID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_transmit_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_transmit_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_p", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_initialize_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_to_reversed_list_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_print_tail_part_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_parse_args_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_get_propid_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-GET-PROPID-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_set_propid_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-SET-PROPID-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_transmit_message_get_all_ids_method", "CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-GET-ALL-IDS-METHOD", 1, 0, false);
        declareFunction("get_cyblack_activation_arglist_transmit_message_activation_pattern", "GET-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_activation_arglist_transmit_message_activation_pattern", "SET-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_activation_arglist_transmit_message_activation_args", "GET-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-ACTIVATION-ARGS", 1, 0, false);
        declareFunction("set_cyblack_activation_arglist_transmit_message_activation_args", "SET-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-ACTIVATION-ARGS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_activation_arglist_transmit_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_activation_arglist_transmit_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_p", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_initialize_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_to_reversed_list_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_print_tail_part_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_parse_args_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_get_activation_args_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-GET-ACTIVATION-ARGS-METHOD", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_set_activation_args_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-SET-ACTIVATION-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_get_activation_pattern_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_activation_arglist_transmit_message_set_activation_pattern_method", "CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("get_cyblack_stimulate_message_implicit", "GET-CYBLACK-STIMULATE-MESSAGE-IMPLICIT", 1, 0, false);
        declareFunction("set_cyblack_stimulate_message_implicit", "SET-CYBLACK-STIMULATE-MESSAGE-IMPLICIT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_stimulate_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STIMULATE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_stimulate_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STIMULATE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_stimulate_message_p", "CYBLACK-STIMULATE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_stimulate_message_initialize_method", "CYBLACK-STIMULATE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_stimulate_message_set_implicit_method", "CYBLACK-STIMULATE-MESSAGE-SET-IMPLICIT-METHOD", 2, 0, false);
        declareFunction("cyblack_stimulate_message_implicit_p_method", "CYBLACK-STIMULATE-MESSAGE-IMPLICIT-P-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_verify_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VERIFY-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_verify_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VERIFY-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_verify_message_p", "CYBLACK-VERIFY-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_verify_message_initialize_method", "CYBLACK-VERIFY-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cancel_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CANCEL-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cancel_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CANCEL-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cancel_message_p", "CYBLACK-CANCEL-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_cancel_message_initialize_method", "CYBLACK-CANCEL-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_execute_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXECUTE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_execute_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXECUTE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_execute_message_p", "CYBLACK-EXECUTE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_execute_message_initialize_method", "CYBLACK-EXECUTE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_terminate_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TERMINATE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_terminate_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TERMINATE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_terminate_message_p", "CYBLACK-TERMINATE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_terminate_message_initialize_method", "CYBLACK-TERMINATE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_state_change_message_contents", "GET-CYBLACK-STATE-CHANGE-MESSAGE-CONTENTS", 1, 0, false);
        declareFunction("set_cyblack_state_change_message_contents", "SET-CYBLACK-STATE-CHANGE-MESSAGE-CONTENTS", 2, 0, false);
        declareFunction("get_cyblack_state_change_message_event_type", "GET-CYBLACK-STATE-CHANGE-MESSAGE-EVENT-TYPE", 1, 0, false);
        declareFunction("set_cyblack_state_change_message_event_type", "SET-CYBLACK-STATE-CHANGE-MESSAGE-EVENT-TYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_state_change_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_state_change_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_state_change_message_p", "CYBLACK-STATE-CHANGE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_state_change_message_initialize_method", "CYBLACK-STATE-CHANGE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_message_to_reversed_list_method", "CYBLACK-STATE-CHANGE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_message_print_tail_part_method", "CYBLACK-STATE-CHANGE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_state_change_message_print_contents_method", "CYBLACK-STATE-CHANGE-MESSAGE-PRINT-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_state_change_message_parse_args_method", "CYBLACK-STATE-CHANGE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_state_change_message_get_event_type_method", "CYBLACK-STATE-CHANGE-MESSAGE-GET-EVENT-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_message_set_event_type_method", "CYBLACK-STATE-CHANGE-MESSAGE-SET-EVENT-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_state_change_message_get_contents_method", "CYBLACK-STATE-CHANGE-MESSAGE-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_message_set_contents_method", "CYBLACK-STATE-CHANGE-MESSAGE-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_receive_message_external_module_name", "GET-CYBLACK-RECEIVE-MESSAGE-EXTERNAL-MODULE-NAME", 1, 0, false);
        declareFunction("set_cyblack_receive_message_external_module_name", "SET-CYBLACK-RECEIVE-MESSAGE-EXTERNAL-MODULE-NAME", 2, 0, false);
        declareFunction("get_cyblack_receive_message_cause", "GET-CYBLACK-RECEIVE-MESSAGE-CAUSE", 1, 0, false);
        declareFunction("set_cyblack_receive_message_cause", "SET-CYBLACK-RECEIVE-MESSAGE-CAUSE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_receive_message_p", "CYBLACK-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_receive_message_get_cause_method", "CYBLACK-RECEIVE-MESSAGE-GET-CAUSE-METHOD", 1, 0, false);
        declareFunction("cyblack_receive_message_set_cause_method", "CYBLACK-RECEIVE-MESSAGE-SET-CAUSE-METHOD", 2, 0, false);
        declareFunction("cyblack_receive_message_get_external_module_name_method", "CYBLACK-RECEIVE-MESSAGE-GET-EXTERNAL-MODULE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_receive_message_set_external_module_name_method", "CYBLACK-RECEIVE-MESSAGE-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_receive_message_execute_method", "CYBLACK-RECEIVE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_accept_message_precondition_pattern", "GET-CYBLACK-ACCEPT-MESSAGE-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_accept_message_precondition_pattern", "SET-CYBLACK-ACCEPT-MESSAGE-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_accept_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACCEPT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_accept_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACCEPT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_accept_message_p", "CYBLACK-ACCEPT-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_accept_message_initialize_method", "CYBLACK-ACCEPT-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_accept_message_to_reversed_list_method", "CYBLACK-ACCEPT-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_accept_message_print_tail_part_method", "CYBLACK-ACCEPT-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_accept_message_parse_args_method", "CYBLACK-ACCEPT-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_accept_message_get_precondition_pattern_method", "CYBLACK-ACCEPT-MESSAGE-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_accept_message_set_precondition_pattern_method", "CYBLACK-ACCEPT-MESSAGE-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_accept_message_execute_method", "CYBLACK-ACCEPT-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_embedded_propid_receive_message_propid", "GET-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PROPID", 1, 0, false);
        declareFunction("set_cyblack_embedded_propid_receive_message_propid", "SET-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PROPID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_p", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_initialize_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_to_reversed_list_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_print_tail_part_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_parse_args_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_get_propid_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-GET-PROPID-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_set_propid_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-SET-PROPID-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_receive_message_get_all_ids_method", "CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-GET-ALL-IDS-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_decline_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DECLINE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_decline_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DECLINE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_decline_message_p", "CYBLACK-DECLINE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_decline_message_initialize_method", "CYBLACK-DECLINE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_decline_message_execute_method", "CYBLACK-DECLINE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_embedded_propid_conf_receive_message_conf", "GET-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-CONF", 1, 0, false);
        declareFunction("set_cyblack_embedded_propid_conf_receive_message_conf", "SET-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-CONF", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_conf_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_conf_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_p", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_initialize_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_to_reversed_list_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_print_tail_part_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_parse_args_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_get_conf_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-GET-CONF-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_receive_message_set_conf_method", "CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-SET-CONF-METHOD", 2, 0, false);
        declareFunction("get_cyblack_request_contents_message_type_string", "GET-CYBLACK-REQUEST-CONTENTS-MESSAGE-TYPE-STRING", 1, 0, false);
        declareFunction("set_cyblack_request_contents_message_type_string", "SET-CYBLACK-REQUEST-CONTENTS-MESSAGE-TYPE-STRING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_request_contents_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REQUEST-CONTENTS-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_request_contents_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REQUEST-CONTENTS-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_request_contents_message_p", "CYBLACK-REQUEST-CONTENTS-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_request_contents_message_initialize_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_request_contents_message_to_reversed_list_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_request_contents_message_print_tail_part_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_request_contents_message_parse_args_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_request_contents_message_get_type_string_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-GET-TYPE-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_request_contents_message_set_type_string_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-SET-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("cyblack_request_contents_message_execute_method", "CYBLACK-REQUEST-CONTENTS-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_contribute_message_contributions", "GET-CYBLACK-CONTRIBUTE-MESSAGE-CONTRIBUTIONS", 1, 0, false);
        declareFunction("set_cyblack_contribute_message_contributions", "SET-CYBLACK-CONTRIBUTE-MESSAGE-CONTRIBUTIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_contribute_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONTRIBUTE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_contribute_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONTRIBUTE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_contribute_message_p", "CYBLACK-CONTRIBUTE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_contribute_message_initialize_method", "CYBLACK-CONTRIBUTE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_contribute_message_to_reversed_list_method", "CYBLACK-CONTRIBUTE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_contribute_message_print_tail_part_method", "CYBLACK-CONTRIBUTE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_contribute_message_parse_args_method", "CYBLACK-CONTRIBUTE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_contribute_message_get_contributions_method", "CYBLACK-CONTRIBUTE-MESSAGE-GET-CONTRIBUTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_contribute_message_set_contributions_method", "CYBLACK-CONTRIBUTE-MESSAGE-SET-CONTRIBUTIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_contribute_message_execute_method", "CYBLACK-CONTRIBUTE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_embedded_propid_excuses_receive_message_excuses", "GET-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-EXCUSES", 1, 0, false);
        declareFunction("set_cyblack_embedded_propid_excuses_receive_message_excuses", "SET-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-EXCUSES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_excuses_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_excuses_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_p", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_initialize_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_to_reversed_list_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_print_tail_part_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_parse_args_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_get_excuses_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-GET-EXCUSES-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_excuses_receive_message_set_excuses_method", "CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-SET-EXCUSES-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_revoke_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REVOKE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_revoke_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REVOKE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_revoke_message_p", "CYBLACK-REVOKE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_revoke_message_initialize_method", "CYBLACK-REVOKE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_revoke_message_execute_method", "CYBLACK-REVOKE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_embedded_propid_conf_reasons_receive_message_reasons", "GET-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-REASONS", 1, 0, false);
        declareFunction("set_cyblack_embedded_propid_conf_reasons_receive_message_reasons", "SET-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-REASONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_conf_reasons_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_propid_conf_reasons_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_p", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_initialize_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_to_reversed_list_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_print_tail_part_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_parse_args_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_get_reasons_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-GET-REASONS-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_propid_conf_reasons_receive_message_set_reasons_method", "CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-SET-REASONS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_propose_message_datatype_bag", "GET-CYBLACK-PROPOSE-MESSAGE-DATATYPE-BAG", 1, 0, false);
        declareFunction("set_cyblack_propose_message_datatype_bag", "SET-CYBLACK-PROPOSE-MESSAGE-DATATYPE-BAG", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_propose_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROPOSE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_propose_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROPOSE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_propose_message_p", "CYBLACK-PROPOSE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_propose_message_initialize_method", "CYBLACK-PROPOSE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_propose_message_to_reversed_list_method", "CYBLACK-PROPOSE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_propose_message_print_tail_part_method", "CYBLACK-PROPOSE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_propose_message_parse_args_method", "CYBLACK-PROPOSE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_propose_message_get_datatype_bag_method", "CYBLACK-PROPOSE-MESSAGE-GET-DATATYPE-BAG-METHOD", 1, 0, false);
        declareFunction("cyblack_propose_message_set_datatype_bag_method", "CYBLACK-PROPOSE-MESSAGE-SET-DATATYPE-BAG-METHOD", 2, 0, false);
        declareFunction("cyblack_propose_message_execute_method", "CYBLACK-PROPOSE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_affirm_message_datatype_bag", "GET-CYBLACK-AFFIRM-MESSAGE-DATATYPE-BAG", 1, 0, false);
        declareFunction("set_cyblack_affirm_message_datatype_bag", "SET-CYBLACK-AFFIRM-MESSAGE-DATATYPE-BAG", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_affirm_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-AFFIRM-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_affirm_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-AFFIRM-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_affirm_message_p", "CYBLACK-AFFIRM-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_affirm_message_initialize_method", "CYBLACK-AFFIRM-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_affirm_message_to_reversed_list_method", "CYBLACK-AFFIRM-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_affirm_message_print_tail_part_method", "CYBLACK-AFFIRM-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_affirm_message_parse_args_method", "CYBLACK-AFFIRM-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_affirm_message_get_datatype_bag_method", "CYBLACK-AFFIRM-MESSAGE-GET-DATATYPE-BAG-METHOD", 1, 0, false);
        declareFunction("cyblack_affirm_message_set_datatype_bag_method", "CYBLACK-AFFIRM-MESSAGE-SET-DATATYPE-BAG-METHOD", 2, 0, false);
        declareFunction("cyblack_affirm_message_execute_method", "CYBLACK-AFFIRM-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_embedded_excuses_receive_message_excuses", "GET-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-EXCUSES", 1, 0, false);
        declareFunction("set_cyblack_embedded_excuses_receive_message_excuses", "SET-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-EXCUSES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_excuses_receive_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_embedded_excuses_receive_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_p", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_initialize_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_to_reversed_list_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_print_tail_part_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_parse_args_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_get_excuses_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-GET-EXCUSES-METHOD", 1, 0, false);
        declareFunction("cyblack_embedded_excuses_receive_message_set_excuses_method", "CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-SET-EXCUSES-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_reject_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REJECT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_reject_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REJECT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_reject_message_p", "CYBLACK-REJECT-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_reject_message_initialize_method", "CYBLACK-REJECT-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_reject_message_parse_args_method", "CYBLACK-REJECT-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_reject_message_execute_method", "CYBLACK-REJECT-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_acquit_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACQUIT-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_acquit_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACQUIT-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_acquit_message_p", "CYBLACK-ACQUIT-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_acquit_message_initialize_method", "CYBLACK-ACQUIT-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_acquit_message_parse_args_method", "CYBLACK-ACQUIT-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_acquit_message_execute_method", "CYBLACK-ACQUIT-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_modification_message_execution_error_message", "GET-CYBLACK-MODIFICATION-MESSAGE-EXECUTION-ERROR-MESSAGE", 1, 0, false);
        declareFunction("set_cyblack_modification_message_execution_error_message", "SET-CYBLACK-MODIFICATION-MESSAGE-EXECUTION-ERROR-MESSAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_modification_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MODIFICATION-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_modification_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MODIFICATION-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_modification_message_p", "CYBLACK-MODIFICATION-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_modification_message_initialize_method", "CYBLACK-MODIFICATION-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_modification_message_parse_args_method", "CYBLACK-MODIFICATION-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_modification_message_get_execution_error_message_method", "CYBLACK-MODIFICATION-MESSAGE-GET-EXECUTION-ERROR-MESSAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_modification_message_set_execution_error_message_method", "CYBLACK-MODIFICATION-MESSAGE-SET-EXECUTION-ERROR-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_modification_message_execute_method", "CYBLACK-MODIFICATION-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_knowledge_source_manipulation_message_emname", "GET-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-EMNAME", 1, 0, false);
        declareFunction("set_cyblack_knowledge_source_manipulation_message_emname", "SET-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-EMNAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_knowledge_source_manipulation_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_knowledge_source_manipulation_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_p", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_initialize_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_print_tail_part_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_to_reversed_list_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_parse_args_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_get_emname_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-GET-EMNAME-METHOD", 1, 0, false);
        declareFunction("cyblack_knowledge_source_manipulation_message_set_emname_method", "CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-SET-EMNAME-METHOD", 2, 0, false);
        declareFunction("get_cyblack_add_knowledge_source_message_port_id", "GET-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PORT-ID", 1, 0, false);
        declareFunction("set_cyblack_add_knowledge_source_message_port_id", "SET-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PORT-ID", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_knowledge_source_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_knowledge_source_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_p", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_initialize_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_print_tail_part_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_parse_args_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_to_reversed_list_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_get_port_id_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-GET-PORT-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_set_port_id_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_add_knowledge_source_message_execute_method", "CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_remove_knowledge_source_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_remove_knowledge_source_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_p", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_initialize_method", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_print_tail_part_method", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_remove_knowledge_source_message_execute_method", "CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_add_posting_class_message_slots", "GET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-SLOTS", 1, 0, false);
        declareFunction("set_cyblack_add_posting_class_message_slots", "SET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-SLOTS", 2, 0, false);
        declareFunction("get_cyblack_add_posting_class_message_super_class", "GET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-SUPER-CLASS", 1, 0, false);
        declareFunction("set_cyblack_add_posting_class_message_super_class", "SET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-SUPER-CLASS", 2, 0, false);
        declareFunction("get_cyblack_add_posting_class_message_direct_class", "GET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-DIRECT-CLASS", 1, 0, false);
        declareFunction("set_cyblack_add_posting_class_message_direct_class", "SET-CYBLACK-ADD-POSTING-CLASS-MESSAGE-DIRECT-CLASS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_posting_class_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_posting_class_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_p", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_print_tail_part_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_parse_args_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_to_reversed_list_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_get_direct_class_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-DIRECT-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_set_direct_class_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-DIRECT-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_get_super_class_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-SUPER-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_set_super_class_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-SUPER-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_get_slots_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-SLOTS-METHOD", 1, 0, false);
        declareFunction("cyblack_add_posting_class_message_set_slot_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-SLOT-METHOD", 2, 0, false);
        declareFunction("cyblack_add_posting_class_message_execute_method", "CYBLACK-ADD-POSTING-CLASS-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_panel_manipulation_message_type", "GET-CYBLACK-PANEL-MANIPULATION-MESSAGE-TYPE", 1, 0, false);
        declareFunction("set_cyblack_panel_manipulation_message_type", "SET-CYBLACK-PANEL-MANIPULATION-MESSAGE-TYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_panel_manipulation_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PANEL-MANIPULATION-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_panel_manipulation_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PANEL-MANIPULATION-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_panel_manipulation_message_p", "CYBLACK-PANEL-MANIPULATION-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_panel_manipulation_message_initialize_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_panel_manipulation_message_print_tail_part_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_panel_manipulation_message_parse_args_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_panel_manipulation_message_to_reversed_list_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_panel_manipulation_message_get_type_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-GET-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_panel_manipulation_message_set_type_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-SET-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_panel_manipulation_message_execute_method", "CYBLACK-PANEL-MANIPULATION-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_add_panel_message_panel_class", "GET-CYBLACK-ADD-PANEL-MESSAGE-PANEL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_add_panel_message_panel_class", "SET-CYBLACK-ADD-PANEL-MESSAGE-PANEL-CLASS", 2, 0, false);
        declareFunction("get_cyblack_add_panel_message_posting_class", "GET-CYBLACK-ADD-PANEL-MESSAGE-POSTING-CLASS", 1, 0, false);
        declareFunction("set_cyblack_add_panel_message_posting_class", "SET-CYBLACK-ADD-PANEL-MESSAGE-POSTING-CLASS", 2, 0, false);
        declareFunction("get_cyblack_add_panel_message_supertypes", "GET-CYBLACK-ADD-PANEL-MESSAGE-SUPERTYPES", 1, 0, false);
        declareFunction("set_cyblack_add_panel_message_supertypes", "SET-CYBLACK-ADD-PANEL-MESSAGE-SUPERTYPES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_panel_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-PANEL-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_add_panel_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-PANEL-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_add_panel_message_p", "CYBLACK-ADD-PANEL-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_add_panel_message_initialize_method", "CYBLACK-ADD-PANEL-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_add_panel_message_print_tail_part_method", "CYBLACK-ADD-PANEL-MESSAGE-PRINT-TAIL-PART-METHOD", 2, 0, false);
        declareFunction("cyblack_add_panel_message_parse_args_method", "CYBLACK-ADD-PANEL-MESSAGE-PARSE-ARGS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_panel_message_to_reversed_list_method", "CYBLACK-ADD-PANEL-MESSAGE-TO-REVERSED-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_add_panel_message_get_supertypes_method", "CYBLACK-ADD-PANEL-MESSAGE-GET-SUPERTYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_add_panel_message_set_supertypes_method", "CYBLACK-ADD-PANEL-MESSAGE-SET-SUPERTYPES-METHOD", 2, 0, false);
        declareFunction("cyblack_add_panel_message_get_posting_class_method", "CYBLACK-ADD-PANEL-MESSAGE-GET-POSTING-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_add_panel_message_set_posting_class_method", "CYBLACK-ADD-PANEL-MESSAGE-SET-POSTING-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_panel_message_get_panel_class_method", "CYBLACK-ADD-PANEL-MESSAGE-GET-PANEL-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_add_panel_message_set_panel_class_method", "CYBLACK-ADD-PANEL-MESSAGE-SET-PANEL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_add_panel_message_execute_method", "CYBLACK-ADD-PANEL-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_remove_panel_message_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-PANEL-MESSAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_remove_panel_message_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-PANEL-MESSAGE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_remove_panel_message_p", "CYBLACK-REMOVE-PANEL-MESSAGE-P", 1, 0, false);
        declareFunction("cyblack_remove_panel_message_initialize_method", "CYBLACK-REMOVE-PANEL-MESSAGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_remove_panel_message_execute_method", "CYBLACK-REMOVE-PANEL-MESSAGE-EXECUTE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_messages_file() {
        defconstant("*VALID-CYBLACK-MESSAGE-KEY-TYPES*", $list_alt0);
        defconstant("*VALID-CYBLACK-MESSAGE-ARG-KEY-TYPES*", $list_alt8);
        defconstant("*VALID-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPSS*", $list_alt13);
        defconstant("*VALID-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPES*", $list_alt18);
        defconstant("*VALID-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPES*", $list_alt23);
        defconstant("*VALID-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPES*", $list_alt28);
        defconstant("*VALID-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPES*", $list_alt33);
        defconstant("*VALID-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPES*", $list_alt38);
        defconstant("*VALID-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPES*", $list_alt38);
        defconstant("*VALID-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPES*", $list_alt38);
        defconstant("*VALID-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPES*", $list_alt33);
        defconstant("*VALID-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPES*", $list_alt33);
        defconstant("*VALID-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPES*", $list_alt59);
        defconstant("*VALID-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPES*", $list_alt64);
        defconstant("*VALID-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPES*", $list_alt69);
        defconstant("*VALID-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPES*", $list_alt74);
        defconstant("*VALID-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPES*", $list_alt33);
        defconstant("*VALID-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPES*", $list_alt83);
        defconstant("*VALID-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPES*", $list_alt74);
        defconstant("*VALID-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPES*", $list_alt92);
        defconstant("*VALID-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPES*", $list_alt97);
        defconstant("*VALID-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPES*", $list_alt102);
        defconstant("*VALID-CYBLACK-EVENT-TYPES*", $list_alt107);
        defconstant("*VALID-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES*", $list_alt112);
        defconstant("*VALID-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPES*", $list_alt117);
        defconstant("*VALID-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPES*", $list_alt122);
        defconstant("*VALID-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPES*", $list_alt127);
        defconstant("*VALID-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPES*", $list_alt132);
        return NIL;
    }

    public static final SubLObject setup_cyblack_messages_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_MESSAGE_KEY_TYPE, $list_alt0);
        enumerations.enumerations_incorporate_definition(CYBLACK_MESSAGE_ARG_KEY_TYPE, $list_alt8);
        enumerations.enumerations_incorporate_definition(CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS, $list_alt13);
        enumerations.enumerations_incorporate_definition(CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE, $list_alt18);
        enumerations.enumerations_incorporate_definition(CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE, $list_alt23);
        enumerations.enumerations_incorporate_definition(CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE, $list_alt28);
        enumerations.enumerations_incorporate_definition(CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE, $list_alt33);
        enumerations.enumerations_incorporate_definition(CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE, $list_alt38);
        enumerations.enumerations_incorporate_definition(CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE, $list_alt38);
        enumerations.enumerations_incorporate_definition(CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE, $list_alt38);
        enumerations.enumerations_incorporate_definition(CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE, $list_alt33);
        enumerations.enumerations_incorporate_definition(CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE, $list_alt33);
        enumerations.enumerations_incorporate_definition(CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE, $list_alt59);
        enumerations.enumerations_incorporate_definition(CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE, $list_alt64);
        enumerations.enumerations_incorporate_definition(CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE, $list_alt69);
        enumerations.enumerations_incorporate_definition(CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE, $list_alt74);
        enumerations.enumerations_incorporate_definition(CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE, $list_alt33);
        enumerations.enumerations_incorporate_definition(CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE, $list_alt83);
        enumerations.enumerations_incorporate_definition(CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE, $list_alt74);
        enumerations.enumerations_incorporate_definition(CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE, $list_alt92);
        enumerations.enumerations_incorporate_definition(CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE, $list_alt97);
        enumerations.enumerations_incorporate_definition(CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE, $list_alt102);
        enumerations.enumerations_incorporate_definition(CYBLACK_EVENT_TYPE, $list_alt107);
        enumerations.enumerations_incorporate_definition(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, $list_alt112);
        enumerations.enumerations_incorporate_definition(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE, $list_alt117);
        enumerations.enumerations_incorporate_definition(CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE, $list_alt122);
        enumerations.enumerations_incorporate_definition(CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE, $list_alt127);
        enumerations.enumerations_incorporate_definition(CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE, $list_alt132);
        classes.subloop_new_class(CYBLACK_MESSAGE, CYBLACK_OBJECT, NIL, NIL, $list_alt139);
        classes.class_set_implements_slot_listeners(CYBLACK_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_message_class(CYBLACK_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MESSAGE, $list_alt156, NIL, $list_alt157);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, INITIALIZE, CYBLACK_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_MESSAGE, $list_alt156, $list_alt161, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, PARSE_ARGS, CYBLACK_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(TO_STRING, CYBLACK_MESSAGE, $list_alt169, NIL, $list_alt170);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, TO_STRING, CYBLACK_MESSAGE_TO_STRING_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_MESSAGE, $list_alt174, NIL, $list_alt175);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, TO_REVERSED_LIST, CYBLACK_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(TO_LIST, CYBLACK_MESSAGE, $list_alt169, NIL, $list_alt179);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, TO_LIST, CYBLACK_MESSAGE_TO_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_MESSAGE, $list_alt169, $list_alt181, $list_alt182);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, PRINT, CYBLACK_MESSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PRINT_HEAD_PART, CYBLACK_MESSAGE, $list_alt174, $list_alt188, $list_alt189);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, PRINT_HEAD_PART, CYBLACK_MESSAGE_PRINT_HEAD_PART_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_MESSAGE, $list_alt174, $list_alt188, $list_alt193);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, PRINT_TAIL_PART, CYBLACK_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt197);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_TIMESTAMP, CYBLACK_MESSAGE_GET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMESTAMP, CYBLACK_MESSAGE, $list_alt169, $list_alt200, $list_alt201);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_TIMESTAMP, CYBLACK_MESSAGE_SET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(TIMESTAMP_NOW, CYBLACK_MESSAGE, $list_alt206, NIL, $list_alt207);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, TIMESTAMP_NOW, CYBLACK_MESSAGE_TIMESTAMP_NOW_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_KNOWLEDGE_SOURCE, CYBLACK_MESSAGE_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_MESSAGE, $list_alt169, $list_alt213, $list_alt214);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_KNOWLEDGE_SOURCE, CYBLACK_MESSAGE_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_KEY, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt219);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_MESSAGE_KEY, CYBLACK_MESSAGE_GET_MESSAGE_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGE_KEY, CYBLACK_MESSAGE, $list_alt169, $list_alt222, $list_alt223);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_MESSAGE_KEY, CYBLACK_MESSAGE_SET_MESSAGE_KEY_METHOD);
        methods.methods_incorporate_instance_method(GET_SESSION_ID, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_SESSION_ID, CYBLACK_MESSAGE_GET_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_SESSION_ID, CYBLACK_MESSAGE, $list_alt169, $list_alt231, $list_alt232);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_SESSION_ID, CYBLACK_MESSAGE_SET_SESSION_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_TRANSACTION_ID, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt237);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_TRANSACTION_ID, CYBLACK_MESSAGE_GET_TRANSACTION_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_TRANSACTION_ID, CYBLACK_MESSAGE, $list_alt169, $list_alt240, $list_alt241);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_TRANSACTION_ID, CYBLACK_MESSAGE_SET_TRANSACTION_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt246);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_GET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE, $list_alt169, $list_alt249, $list_alt250);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_EXTERNAL_MODULE_ID, CYBLACK_MESSAGE_SET_EXTERNAL_MODULE_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_IDS, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_ALL_IDS, CYBLACK_MESSAGE_GET_ALL_IDS_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER, CYBLACK_MESSAGE, $list_alt196, NIL, $list_alt258);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_MESSAGE_BROKER, CYBLACK_MESSAGE_GET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGE_BROKER, CYBLACK_MESSAGE, $list_alt169, $list_alt261, $list_alt262);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, SET_MESSAGE_BROKER, CYBLACK_MESSAGE_SET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_DICTIONARY, CYBLACK_MESSAGE, $list_alt267, NIL, $list_alt268);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_DATATYPE_DICTIONARY, CYBLACK_MESSAGE_GET_DATATYPE_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA, CYBLACK_MESSAGE, $list_alt267, NIL, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_MESSAGE, GET_AGENDA, CYBLACK_MESSAGE_GET_AGENDA_METHOD);
        classes.subloop_new_class(CYBLACK_TRANSMIT_MESSAGE, CYBLACK_MESSAGE, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_TRANSMIT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TRANSMIT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TRANSMIT_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TRANSMIT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TRANSMIT_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_transmit_message_class(CYBLACK_TRANSMIT_MESSAGE);
        classes.subloop_new_class(CYBLACK_REPORT_CONTENTS_MESSAGE, CYBLACK_MESSAGE, NIL, NIL, $list_alt281);
        classes.class_set_implements_slot_listeners(CYBLACK_REPORT_CONTENTS_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REPORT_CONTENTS_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_CONTENTS_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_REPORT_CONTENTS_MESSAGE, $sym285$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_CONTENTS_MESSAGE_INSTA);
        subloop_reserved_initialize_cyblack_report_contents_message_class(CYBLACK_REPORT_CONTENTS_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt156, NIL, $list_alt286);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, INITIALIZE, CYBLACK_REPORT_CONTENTS_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt174, NIL, $list_alt290);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, TO_REVERSED_LIST, CYBLACK_REPORT_CONTENTS_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt174, $list_alt188, $list_alt296);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, PRINT_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE_PRINT_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt174, $list_alt188, $list_alt301);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, PRINT_TAIL_PART, CYBLACK_REPORT_CONTENTS_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt156, $list_alt161, $list_alt305);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, PARSE_ARGS, CYBLACK_REPORT_CONTENTS_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_STRING, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt196, NIL, $list_alt308);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, GET_TYPE_STRING, CYBLACK_REPORT_CONTENTS_MESSAGE_GET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_STRING, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt169, $list_alt311, $list_alt312);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, SET_TYPE_STRING, CYBLACK_REPORT_CONTENTS_MESSAGE_SET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt196, NIL, $list_alt317);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, GET_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE, $list_alt169, $list_alt320, $list_alt321);
        methods.subloop_register_instance_method(CYBLACK_REPORT_CONTENTS_MESSAGE, SET_CONTENTS, CYBLACK_REPORT_CONTENTS_MESSAGE_SET_CONTENTS_METHOD);
        classes.subloop_new_class(CYBLACK_INVITATION_MESSAGE, CYBLACK_TRANSMIT_MESSAGE, NIL, NIL, $list_alt326);
        classes.class_set_implements_slot_listeners(CYBLACK_INVITATION_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INVITATION_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INVITATION_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_INVITATION_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INVITATION_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_invitation_message_class(CYBLACK_INVITATION_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INVITATION_MESSAGE, $list_alt156, NIL, $list_alt331);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, INITIALIZE, CYBLACK_INVITATION_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_INVITATION_MESSAGE, $list_alt174, NIL, $list_alt335);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, TO_REVERSED_LIST, CYBLACK_INVITATION_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_INVITATION_MESSAGE, $list_alt174, $list_alt188, $list_alt340);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, PRINT_TAIL_PART, CYBLACK_INVITATION_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_INVITATION_MESSAGE, $list_alt156, $list_alt161, $list_alt344);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, PARSE_ARGS, CYBLACK_INVITATION_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION_NAME, CYBLACK_INVITATION_MESSAGE, $list_alt196, NIL, $list_alt347);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, GET_APPLICATION_NAME, CYBLACK_INVITATION_MESSAGE_GET_APPLICATION_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION_NAME, CYBLACK_INVITATION_MESSAGE, $list_alt169, $list_alt350, $list_alt351);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, SET_APPLICATION_NAME, CYBLACK_INVITATION_MESSAGE_SET_APPLICATION_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_NAME, CYBLACK_INVITATION_MESSAGE, $list_alt196, NIL, $list_alt356);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, GET_EXTERNAL_MODULE_NAME, CYBLACK_INVITATION_MESSAGE_GET_EXTERNAL_MODULE_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_INVITATION_MESSAGE, $list_alt169, $list_alt359, $list_alt360);
        methods.subloop_register_instance_method(CYBLACK_INVITATION_MESSAGE, SET_EXTERNAL_MODULE_NAME, CYBLACK_INVITATION_MESSAGE_SET_EXTERNAL_MODULE_NAME_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, CYBLACK_TRANSMIT_MESSAGE, NIL, NIL, $list_alt365);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $sym367$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $sym368$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESS);
        subloop_reserved_initialize_cyblack_embedded_propid_transmit_message_class(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt156, NIL, $list_alt369);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, INITIALIZE, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt174, NIL, $list_alt371);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt174, $list_alt188, $list_alt375);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt156, $list_alt161, $list_alt379);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPID, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt196, NIL, $list_alt382);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, GET_PROPID, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_GET_PROPID_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPID, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt169, $list_alt385, $list_alt386);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, SET_PROPID, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_SET_PROPID_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_IDS, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, $list_alt196, NIL, $list_alt390);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, GET_ALL_IDS, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_GET_ALL_IDS_METHOD);
        classes.subloop_new_class(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, NIL, NIL, $list_alt393);
        classes.class_set_implements_slot_listeners(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $sym396$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_M);
        classes.subloop_note_instance_initialization_function(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $sym397$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_M);
        subloop_reserved_initialize_cyblack_activation_arglist_transmit_message_class(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt156, NIL, $list_alt398);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, INITIALIZE, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt174, NIL, $list_alt400);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, TO_REVERSED_LIST, $sym403$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_TO_REVERSED_LIST_METH);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt174, $list_alt188, $list_alt404);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, PRINT_TAIL_PART, $sym407$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_PRINT_TAIL_PART_METHO);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt156, $list_alt161, $list_alt408);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, PARSE_ARGS, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_ARGS, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt196, NIL, $list_alt411);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, GET_ACTIVATION_ARGS, $sym412$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_GET_ACTIVATION_ARGS_M);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_ARGS, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt169, $list_alt414, $list_alt415);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, SET_ACTIVATION_ARGS, $sym417$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_SET_ACTIVATION_ARGS_M);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt196, NIL, $list_alt419);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, GET_ACTIVATION_PATTERN, $sym420$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_GET_ACTIVATION_PATTER);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, $list_alt169, $list_alt422, $list_alt423);
        methods.subloop_register_instance_method(CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, SET_ACTIVATION_PATTERN, $sym426$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_SET_ACTIVATION_PATTER);
        classes.subloop_new_class(CYBLACK_STIMULATE_MESSAGE, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, NIL, NIL, $list_alt428);
        classes.class_set_implements_slot_listeners(CYBLACK_STIMULATE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_STIMULATE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STIMULATE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_STIMULATE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STIMULATE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_stimulate_message_class(CYBLACK_STIMULATE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_STIMULATE_MESSAGE, $list_alt156, NIL, $list_alt433);
        methods.subloop_register_instance_method(CYBLACK_STIMULATE_MESSAGE, INITIALIZE, CYBLACK_STIMULATE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_IMPLICIT, CYBLACK_STIMULATE_MESSAGE, $list_alt206, $list_alt437, $list_alt438);
        methods.subloop_register_instance_method(CYBLACK_STIMULATE_MESSAGE, SET_IMPLICIT, CYBLACK_STIMULATE_MESSAGE_SET_IMPLICIT_METHOD);
        methods.methods_incorporate_instance_method(IMPLICIT_P, CYBLACK_STIMULATE_MESSAGE, $list_alt206, NIL, $list_alt441);
        methods.subloop_register_instance_method(CYBLACK_STIMULATE_MESSAGE, IMPLICIT_P, CYBLACK_STIMULATE_MESSAGE_IMPLICIT_P_METHOD);
        classes.subloop_new_class(CYBLACK_VERIFY_MESSAGE, CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE, NIL, NIL, $list_alt444);
        classes.class_set_implements_slot_listeners(CYBLACK_VERIFY_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_VERIFY_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VERIFY_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_VERIFY_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VERIFY_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_verify_message_class(CYBLACK_VERIFY_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_VERIFY_MESSAGE, $list_alt156, NIL, $list_alt447);
        methods.subloop_register_instance_method(CYBLACK_VERIFY_MESSAGE, INITIALIZE, CYBLACK_VERIFY_MESSAGE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_CANCEL_MESSAGE, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, NIL, NIL, $list_alt444);
        classes.class_set_implements_slot_listeners(CYBLACK_CANCEL_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CANCEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CANCEL_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CANCEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CANCEL_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_cancel_message_class(CYBLACK_CANCEL_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CANCEL_MESSAGE, $list_alt156, NIL, $list_alt453);
        methods.subloop_register_instance_method(CYBLACK_CANCEL_MESSAGE, INITIALIZE, CYBLACK_CANCEL_MESSAGE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_EXECUTE_MESSAGE, CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE, NIL, NIL, $list_alt444);
        classes.class_set_implements_slot_listeners(CYBLACK_EXECUTE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXECUTE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXECUTE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXECUTE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXECUTE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_execute_message_class(CYBLACK_EXECUTE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXECUTE_MESSAGE, $list_alt156, NIL, $list_alt459);
        methods.subloop_register_instance_method(CYBLACK_EXECUTE_MESSAGE, INITIALIZE, CYBLACK_EXECUTE_MESSAGE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_TERMINATE_MESSAGE, CYBLACK_TRANSMIT_MESSAGE, NIL, NIL, $list_alt444);
        classes.class_set_implements_slot_listeners(CYBLACK_TERMINATE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TERMINATE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TERMINATE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TERMINATE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TERMINATE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_terminate_message_class(CYBLACK_TERMINATE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TERMINATE_MESSAGE, $list_alt156, NIL, $list_alt465);
        methods.subloop_register_instance_method(CYBLACK_TERMINATE_MESSAGE, INITIALIZE, CYBLACK_TERMINATE_MESSAGE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_STATE_CHANGE_MESSAGE, CYBLACK_TRANSMIT_MESSAGE, NIL, NIL, $list_alt469);
        classes.class_set_implements_slot_listeners(CYBLACK_STATE_CHANGE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_STATE_CHANGE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_STATE_CHANGE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_state_change_message_class(CYBLACK_STATE_CHANGE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt174, NIL, $list_alt473);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, INITIALIZE, CYBLACK_STATE_CHANGE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt174, NIL, $list_alt477);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, TO_REVERSED_LIST, CYBLACK_STATE_CHANGE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt174, $list_alt188, $list_alt481);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, PRINT_TAIL_PART, CYBLACK_STATE_CHANGE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PRINT_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt174, $list_alt188, $list_alt296);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, PRINT_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE_PRINT_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt174, $list_alt161, $list_alt487);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, PARSE_ARGS, CYBLACK_STATE_CHANGE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_EVENT_TYPE, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt196, NIL, $list_alt490);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, GET_EVENT_TYPE, CYBLACK_STATE_CHANGE_MESSAGE_GET_EVENT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_EVENT_TYPE, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt169, $list_alt493, $list_alt494);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, SET_EVENT_TYPE, CYBLACK_STATE_CHANGE_MESSAGE_SET_EVENT_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt196, NIL, $list_alt317);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, GET_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE, $list_alt169, $list_alt320, $list_alt499);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_MESSAGE, SET_CONTENTS, CYBLACK_STATE_CHANGE_MESSAGE_SET_CONTENTS_METHOD);
        classes.subloop_new_class(CYBLACK_RECEIVE_MESSAGE, CYBLACK_MESSAGE, NIL, NIL, $list_alt503);
        classes.class_set_implements_slot_listeners(CYBLACK_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_RECEIVE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RECEIVE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_RECEIVE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RECEIVE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_receive_message_class(CYBLACK_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(GET_CAUSE, CYBLACK_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt508);
        methods.subloop_register_instance_method(CYBLACK_RECEIVE_MESSAGE, GET_CAUSE, CYBLACK_RECEIVE_MESSAGE_GET_CAUSE_METHOD);
        methods.methods_incorporate_instance_method(SET_CAUSE, CYBLACK_RECEIVE_MESSAGE, $list_alt169, $list_alt511, $list_alt512);
        methods.subloop_register_instance_method(CYBLACK_RECEIVE_MESSAGE, SET_CAUSE, CYBLACK_RECEIVE_MESSAGE_SET_CAUSE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_NAME, CYBLACK_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt356);
        methods.subloop_register_instance_method(CYBLACK_RECEIVE_MESSAGE, GET_EXTERNAL_MODULE_NAME, CYBLACK_RECEIVE_MESSAGE_GET_EXTERNAL_MODULE_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_RECEIVE_MESSAGE, $list_alt169, $list_alt359, $list_alt517);
        methods.subloop_register_instance_method(CYBLACK_RECEIVE_MESSAGE, SET_EXTERNAL_MODULE_NAME, CYBLACK_RECEIVE_MESSAGE_SET_EXTERNAL_MODULE_NAME_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_RECEIVE_MESSAGE, $list_alt169, NIL, $list_alt522);
        methods.subloop_register_instance_method(CYBLACK_RECEIVE_MESSAGE, EXECUTE, CYBLACK_RECEIVE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_ACCEPT_MESSAGE, CYBLACK_RECEIVE_MESSAGE, NIL, NIL, $list_alt525);
        classes.class_set_implements_slot_listeners(CYBLACK_ACCEPT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ACCEPT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACCEPT_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ACCEPT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACCEPT_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_accept_message_class(CYBLACK_ACCEPT_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ACCEPT_MESSAGE, $list_alt156, NIL, $list_alt529);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, INITIALIZE, CYBLACK_ACCEPT_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_ACCEPT_MESSAGE, $list_alt174, NIL, $list_alt532);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, TO_REVERSED_LIST, CYBLACK_ACCEPT_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_ACCEPT_MESSAGE, $list_alt174, $list_alt188, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, PRINT_TAIL_PART, CYBLACK_ACCEPT_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ACCEPT_MESSAGE, $list_alt156, $list_alt161, $list_alt541);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, PARSE_ARGS, CYBLACK_ACCEPT_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_ACCEPT_MESSAGE, $list_alt196, NIL, $list_alt544);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, GET_PRECONDITION_PATTERN, CYBLACK_ACCEPT_MESSAGE_GET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_ACCEPT_MESSAGE, $list_alt169, $list_alt547, $list_alt548);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, SET_PRECONDITION_PATTERN, CYBLACK_ACCEPT_MESSAGE_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ACCEPT_MESSAGE, $list_alt169, NIL, $list_alt551);
        methods.subloop_register_instance_method(CYBLACK_ACCEPT_MESSAGE, EXECUTE, CYBLACK_ACCEPT_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, CYBLACK_RECEIVE_MESSAGE, NIL, NIL, $list_alt365);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $sym560$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSA);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $sym561$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSA);
        subloop_reserved_initialize_cyblack_embedded_propid_receive_message_class(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt156, NIL, $list_alt369);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, INITIALIZE, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt174, NIL, $list_alt371);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt174, $list_alt188, $list_alt375);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt156, $list_alt161, $list_alt567);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPID, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt382);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, GET_PROPID, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_GET_PROPID_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPID, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt169, $list_alt385, $list_alt386);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, SET_PROPID, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_SET_PROPID_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_IDS, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt390);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, GET_ALL_IDS, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_GET_ALL_IDS_METHOD);
        classes.subloop_new_class(CYBLACK_DECLINE_MESSAGE, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, NIL, NIL, $list_alt574);
        classes.class_set_implements_slot_listeners(CYBLACK_DECLINE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DECLINE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DECLINE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DECLINE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DECLINE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_decline_message_class(CYBLACK_DECLINE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DECLINE_MESSAGE, $list_alt156, NIL, $list_alt577);
        methods.subloop_register_instance_method(CYBLACK_DECLINE_MESSAGE, INITIALIZE, CYBLACK_DECLINE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_DECLINE_MESSAGE, $list_alt169, NIL, $list_alt580);
        methods.subloop_register_instance_method(CYBLACK_DECLINE_MESSAGE, EXECUTE, CYBLACK_DECLINE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, NIL, NIL, $list_alt586);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $sym588$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $sym589$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_);
        subloop_reserved_initialize_cyblack_embedded_propid_conf_receive_message_class(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt156, NIL, $list_alt590);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, INITIALIZE, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt174, NIL, $list_alt592);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, TO_REVERSED_LIST, $sym595$CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_TO_REVERSED_LIST_MET);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt174, $list_alt188, $list_alt596);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, PRINT_TAIL_PART, $sym599$CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_PRINT_TAIL_PART_METH);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt156, $list_alt161, $list_alt600);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONF, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt603);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, GET_CONF, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_GET_CONF_METHOD);
        methods.methods_incorporate_instance_method(SET_CONF, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, $list_alt169, $list_alt606, $list_alt607);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, SET_CONF, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_SET_CONF_METHOD);
        classes.subloop_new_class(CYBLACK_REQUEST_CONTENTS_MESSAGE, CYBLACK_RECEIVE_MESSAGE, NIL, NIL, $list_alt611);
        classes.class_set_implements_slot_listeners(CYBLACK_REQUEST_CONTENTS_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REQUEST_CONTENTS_MESSAGE, $sym612$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REQUEST_CONTENTS_MESSAGE_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_REQUEST_CONTENTS_MESSAGE, $sym613$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REQUEST_CONTENTS_MESSAGE_INST);
        subloop_reserved_initialize_cyblack_request_contents_message_class(CYBLACK_REQUEST_CONTENTS_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt156, NIL, $list_alt614);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, INITIALIZE, CYBLACK_REQUEST_CONTENTS_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt174, NIL, $list_alt617);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, TO_REVERSED_LIST, CYBLACK_REQUEST_CONTENTS_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt174, $list_alt188, $list_alt620);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, PRINT_TAIL_PART, CYBLACK_REQUEST_CONTENTS_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt156, $list_alt161, $list_alt624);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, PARSE_ARGS, CYBLACK_REQUEST_CONTENTS_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_STRING, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt196, NIL, $list_alt308);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, GET_TYPE_STRING, CYBLACK_REQUEST_CONTENTS_MESSAGE_GET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_STRING, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt169, $list_alt311, $list_alt312);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, SET_TYPE_STRING, CYBLACK_REQUEST_CONTENTS_MESSAGE_SET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_REQUEST_CONTENTS_MESSAGE, $list_alt169, NIL, $list_alt629);
        methods.subloop_register_instance_method(CYBLACK_REQUEST_CONTENTS_MESSAGE, EXECUTE, CYBLACK_REQUEST_CONTENTS_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_CONTRIBUTE_MESSAGE, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, NIL, NIL, $list_alt638);
        classes.class_set_implements_slot_listeners(CYBLACK_CONTRIBUTE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CONTRIBUTE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONTRIBUTE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CONTRIBUTE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONTRIBUTE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_contribute_message_class(CYBLACK_CONTRIBUTE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt156, NIL, $list_alt642);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, INITIALIZE, CYBLACK_CONTRIBUTE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt174, NIL, $list_alt645);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, TO_REVERSED_LIST, CYBLACK_CONTRIBUTE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt174, $list_alt188, $list_alt649);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, PRINT_TAIL_PART, CYBLACK_CONTRIBUTE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt174, $list_alt161, $list_alt653);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, PARSE_ARGS, CYBLACK_CONTRIBUTE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTRIBUTIONS, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt196, NIL, $list_alt656);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, GET_CONTRIBUTIONS, CYBLACK_CONTRIBUTE_MESSAGE_GET_CONTRIBUTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTRIBUTIONS, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt169, $list_alt659, $list_alt660);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, SET_CONTRIBUTIONS, CYBLACK_CONTRIBUTE_MESSAGE_SET_CONTRIBUTIONS_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_CONTRIBUTE_MESSAGE, $list_alt169, NIL, $list_alt663);
        methods.subloop_register_instance_method(CYBLACK_CONTRIBUTE_MESSAGE, EXECUTE, CYBLACK_CONTRIBUTE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE, NIL, NIL, $list_alt691);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $sym693$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEI);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $sym694$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEI);
        subloop_reserved_initialize_cyblack_embedded_propid_excuses_receive_message_class(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt156, NIL, $list_alt695);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, INITIALIZE, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt174, NIL, $list_alt697);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, TO_REVERSED_LIST, $sym700$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_TO_REVERSED_LIST_);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt174, $list_alt188, $list_alt701);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, PRINT_TAIL_PART, $sym704$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_PRINT_TAIL_PART_M);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt156, $list_alt161, $list_alt705);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_EXCUSES, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt708);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, GET_EXCUSES, $sym709$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_GET_EXCUSES_METHO);
        methods.methods_incorporate_instance_method(SET_EXCUSES, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, $list_alt169, $list_alt711, $list_alt712);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, SET_EXCUSES, $sym714$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_SET_EXCUSES_METHO);
        classes.subloop_new_class(CYBLACK_REVOKE_MESSAGE, CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE, NIL, NIL, $list_alt574);
        classes.class_set_implements_slot_listeners(CYBLACK_REVOKE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REVOKE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REVOKE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_REVOKE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REVOKE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_revoke_message_class(CYBLACK_REVOKE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REVOKE_MESSAGE, $list_alt156, NIL, $list_alt718);
        methods.subloop_register_instance_method(CYBLACK_REVOKE_MESSAGE, INITIALIZE, CYBLACK_REVOKE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_REVOKE_MESSAGE, $list_alt169, NIL, $list_alt721);
        methods.subloop_register_instance_method(CYBLACK_REVOKE_MESSAGE, EXECUTE, CYBLACK_REVOKE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE, NIL, NIL, $list_alt730);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $sym732$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $sym733$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_);
        subloop_reserved_initialize_cyblack_embedded_propid_conf_reasons_receive_message_class(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt156, NIL, $list_alt734);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, INITIALIZE, $sym735$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_INITIALIZE_M);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt174, NIL, $list_alt736);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, TO_REVERSED_LIST, $sym739$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_TO_REVERSED_);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt174, $list_alt188, $list_alt740);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, PRINT_TAIL_PART, $sym743$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_PRINT_TAIL_P);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt156, $list_alt161, $list_alt744);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, PARSE_ARGS, $sym745$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_PARSE_ARGS_M);
        methods.methods_incorporate_instance_method(GET_REASONS, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt747);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, GET_REASONS, $sym748$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_GET_REASONS_);
        methods.methods_incorporate_instance_method(SET_REASONS, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, $list_alt169, $list_alt750, $list_alt751);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, SET_REASONS, $sym753$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_SET_REASONS_);
        classes.subloop_new_class(CYBLACK_PROPOSE_MESSAGE, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, NIL, NIL, $list_alt755);
        classes.class_set_implements_slot_listeners(CYBLACK_PROPOSE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PROPOSE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROPOSE_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PROPOSE_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROPOSE_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_propose_message_class(CYBLACK_PROPOSE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PROPOSE_MESSAGE, $list_alt156, NIL, $list_alt759);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, INITIALIZE, CYBLACK_PROPOSE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_PROPOSE_MESSAGE, $list_alt174, NIL, $list_alt762);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, TO_REVERSED_LIST, CYBLACK_PROPOSE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_PROPOSE_MESSAGE, $list_alt174, $list_alt188, $list_alt766);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, PRINT_TAIL_PART, CYBLACK_PROPOSE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_PROPOSE_MESSAGE, $list_alt156, $list_alt161, $list_alt770);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, PARSE_ARGS, CYBLACK_PROPOSE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_BAG, CYBLACK_PROPOSE_MESSAGE, $list_alt196, NIL, $list_alt773);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, GET_DATATYPE_BAG, CYBLACK_PROPOSE_MESSAGE_GET_DATATYPE_BAG_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE_BAG, CYBLACK_PROPOSE_MESSAGE, $list_alt169, $list_alt776, $list_alt777);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, SET_DATATYPE_BAG, CYBLACK_PROPOSE_MESSAGE_SET_DATATYPE_BAG_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_PROPOSE_MESSAGE, $list_alt169, NIL, $list_alt782);
        methods.subloop_register_instance_method(CYBLACK_PROPOSE_MESSAGE, EXECUTE, CYBLACK_PROPOSE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_AFFIRM_MESSAGE, CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE, NIL, NIL, $list_alt755);
        classes.class_set_implements_slot_listeners(CYBLACK_AFFIRM_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_AFFIRM_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_AFFIRM_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_AFFIRM_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_AFFIRM_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_affirm_message_class(CYBLACK_AFFIRM_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_AFFIRM_MESSAGE, $list_alt156, NIL, $list_alt789);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, INITIALIZE, CYBLACK_AFFIRM_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_AFFIRM_MESSAGE, $list_alt174, NIL, $list_alt792);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, TO_REVERSED_LIST, CYBLACK_AFFIRM_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_AFFIRM_MESSAGE, $list_alt174, $list_alt188, $list_alt796);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, PRINT_TAIL_PART, CYBLACK_AFFIRM_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_AFFIRM_MESSAGE, $list_alt156, $list_alt161, $list_alt799);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, PARSE_ARGS, CYBLACK_AFFIRM_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_BAG, CYBLACK_AFFIRM_MESSAGE, $list_alt196, NIL, $list_alt773);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, GET_DATATYPE_BAG, CYBLACK_AFFIRM_MESSAGE_GET_DATATYPE_BAG_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE_BAG, CYBLACK_AFFIRM_MESSAGE, $list_alt169, $list_alt776, $list_alt802);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, SET_DATATYPE_BAG, CYBLACK_AFFIRM_MESSAGE_SET_DATATYPE_BAG_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_AFFIRM_MESSAGE, $list_alt169, NIL, $list_alt805);
        methods.subloop_register_instance_method(CYBLACK_AFFIRM_MESSAGE, EXECUTE, CYBLACK_AFFIRM_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, CYBLACK_RECEIVE_MESSAGE, NIL, NIL, $list_alt691);
        classes.class_set_implements_slot_listeners(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $sym813$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $sym814$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESS);
        subloop_reserved_initialize_cyblack_embedded_excuses_receive_message_class(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt156, NIL, $list_alt695);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, INITIALIZE, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt174, NIL, $list_alt697);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, TO_REVERSED_LIST, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt174, $list_alt188, $list_alt818);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, PRINT_TAIL_PART, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt156, $list_alt161, $list_alt821);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, PARSE_ARGS, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_EXCUSES, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt196, NIL, $list_alt708);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, GET_EXCUSES, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_GET_EXCUSES_METHOD);
        methods.methods_incorporate_instance_method(SET_EXCUSES, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, $list_alt169, $list_alt711, $list_alt712);
        methods.subloop_register_instance_method(CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, SET_EXCUSES, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_SET_EXCUSES_METHOD);
        classes.subloop_new_class(CYBLACK_REJECT_MESSAGE, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, NIL, NIL, $list_alt827);
        classes.class_set_implements_slot_listeners(CYBLACK_REJECT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REJECT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REJECT_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_REJECT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REJECT_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_reject_message_class(CYBLACK_REJECT_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REJECT_MESSAGE, $list_alt830, NIL, $list_alt831);
        methods.subloop_register_instance_method(CYBLACK_REJECT_MESSAGE, INITIALIZE, CYBLACK_REJECT_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_REJECT_MESSAGE, $list_alt174, $list_alt161, $list_alt834);
        methods.subloop_register_instance_method(CYBLACK_REJECT_MESSAGE, PARSE_ARGS, CYBLACK_REJECT_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_REJECT_MESSAGE, $list_alt169, NIL, $list_alt836);
        methods.subloop_register_instance_method(CYBLACK_REJECT_MESSAGE, EXECUTE, CYBLACK_REJECT_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_ACQUIT_MESSAGE, CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE, NIL, NIL, $list_alt827);
        classes.class_set_implements_slot_listeners(CYBLACK_ACQUIT_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ACQUIT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACQUIT_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ACQUIT_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACQUIT_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_acquit_message_class(CYBLACK_ACQUIT_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ACQUIT_MESSAGE, $list_alt830, NIL, $list_alt845);
        methods.subloop_register_instance_method(CYBLACK_ACQUIT_MESSAGE, INITIALIZE, CYBLACK_ACQUIT_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ACQUIT_MESSAGE, $list_alt174, $list_alt161, $list_alt848);
        methods.subloop_register_instance_method(CYBLACK_ACQUIT_MESSAGE, PARSE_ARGS, CYBLACK_ACQUIT_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ACQUIT_MESSAGE, $list_alt169, NIL, $list_alt850);
        methods.subloop_register_instance_method(CYBLACK_ACQUIT_MESSAGE, EXECUTE, CYBLACK_ACQUIT_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_MODIFICATION_MESSAGE, CYBLACK_MESSAGE, NIL, NIL, $list_alt854);
        classes.class_set_implements_slot_listeners(CYBLACK_MODIFICATION_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MODIFICATION_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MODIFICATION_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MODIFICATION_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MODIFICATION_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_modification_message_class(CYBLACK_MODIFICATION_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MODIFICATION_MESSAGE, $list_alt174, NIL, $list_alt858);
        methods.subloop_register_instance_method(CYBLACK_MODIFICATION_MESSAGE, INITIALIZE, CYBLACK_MODIFICATION_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_MODIFICATION_MESSAGE, $list_alt174, $list_alt161, $list_alt861);
        methods.subloop_register_instance_method(CYBLACK_MODIFICATION_MESSAGE, PARSE_ARGS, CYBLACK_MODIFICATION_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_EXECUTION_ERROR_MESSAGE, CYBLACK_MODIFICATION_MESSAGE, $list_alt196, NIL, $list_alt864);
        methods.subloop_register_instance_method(CYBLACK_MODIFICATION_MESSAGE, GET_EXECUTION_ERROR_MESSAGE, CYBLACK_MODIFICATION_MESSAGE_GET_EXECUTION_ERROR_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_EXECUTION_ERROR_MESSAGE, CYBLACK_MODIFICATION_MESSAGE, $list_alt169, $list_alt867, $list_alt868);
        methods.subloop_register_instance_method(CYBLACK_MODIFICATION_MESSAGE, SET_EXECUTION_ERROR_MESSAGE, CYBLACK_MODIFICATION_MESSAGE_SET_EXECUTION_ERROR_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_MODIFICATION_MESSAGE, $list_alt206, NIL, $list_alt871);
        methods.subloop_register_instance_method(CYBLACK_MODIFICATION_MESSAGE, EXECUTE, CYBLACK_MODIFICATION_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, CYBLACK_MODIFICATION_MESSAGE, NIL, NIL, $list_alt876);
        classes.class_set_implements_slot_listeners(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $sym878$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION);
        classes.subloop_note_instance_initialization_function(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $sym879$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION);
        subloop_reserved_initialize_cyblack_knowledge_source_manipulation_message_class(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt174, NIL, $list_alt880);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, INITIALIZE, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt174, $list_alt188, $list_alt883);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, PRINT_TAIL_PART, $sym886$CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_PRINT_TAIL_PART_MET);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt174, NIL, $list_alt887);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, TO_REVERSED_LIST, $sym889$CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_TO_REVERSED_LIST_ME);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt156, $list_alt161, $list_alt890);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, PARSE_ARGS, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(GET_EMNAME, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt196, NIL, $list_alt893);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, GET_EMNAME, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_GET_EMNAME_METHOD);
        methods.methods_incorporate_instance_method(SET_EMNAME, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, $list_alt169, $list_alt896, $list_alt897);
        methods.subloop_register_instance_method(CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, SET_EMNAME, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_SET_EMNAME_METHOD);
        classes.subloop_new_class(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, NIL, NIL, $list_alt901);
        classes.class_set_implements_slot_listeners(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $sym903$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $sym904$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_);
        subloop_reserved_initialize_cyblack_add_knowledge_source_message_class(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt156, NIL, $list_alt905);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, INITIALIZE, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt174, $list_alt188, $list_alt908);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, PRINT_TAIL_PART, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt174, $list_alt161, $list_alt912);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, PARSE_ARGS, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt174, NIL, $list_alt916);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, TO_REVERSED_LIST, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_PORT_ID, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt196, NIL, $list_alt920);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, GET_PORT_ID, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_GET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT_ID, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt169, $list_alt923, $list_alt924);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, SET_PORT_ID, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, $list_alt206, NIL, $list_alt927);
        methods.subloop_register_instance_method(CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE, EXECUTE, CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE, NIL, NIL, $list_alt574);
        classes.class_set_implements_slot_listeners(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, $sym933$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSA);
        classes.subloop_note_instance_initialization_function(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, $sym934$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSA);
        subloop_reserved_initialize_cyblack_remove_knowledge_source_message_class(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, $list_alt174, NIL, $list_alt935);
        methods.subloop_register_instance_method(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, INITIALIZE, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, $list_alt174, $list_alt188, $list_alt883);
        methods.subloop_register_instance_method(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, PRINT_TAIL_PART, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, $list_alt206, NIL, $list_alt940);
        methods.subloop_register_instance_method(CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE, EXECUTE, CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_ADD_POSTING_CLASS_MESSAGE, CYBLACK_MODIFICATION_MESSAGE, NIL, NIL, $list_alt945);
        classes.class_set_implements_slot_listeners(CYBLACK_ADD_POSTING_CLASS_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ADD_POSTING_CLASS_MESSAGE, $sym949$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_ADD_POSTING_CLASS_MESSAGE, $sym950$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_INS);
        subloop_reserved_initialize_cyblack_add_posting_class_message_class(CYBLACK_ADD_POSTING_CLASS_MESSAGE);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt174, $list_alt188, $list_alt951);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, PRINT_TAIL_PART, CYBLACK_ADD_POSTING_CLASS_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt174, $list_alt161, $list_alt955);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, PARSE_ARGS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt174, NIL, $list_alt966);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, TO_REVERSED_LIST, CYBLACK_ADD_POSTING_CLASS_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt196, NIL, $list_alt970);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, GET_DIRECT_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_DIRECT_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECT_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt169, $list_alt973, $list_alt974);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, SET_DIRECT_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_DIRECT_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPER_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt196, NIL, $list_alt978);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, GET_SUPER_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_SUPER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPER_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt169, $list_alt981, $list_alt982);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, SET_SUPER_CLASS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_SUPER_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_SLOTS, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt196, NIL, $list_alt986);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, GET_SLOTS, CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_SLOTS_METHOD);
        methods.methods_incorporate_instance_method(SET_SLOT, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt169, $list_alt989, $list_alt990);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, SET_SLOT, CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_SLOT_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ADD_POSTING_CLASS_MESSAGE, $list_alt206, NIL, $list_alt993);
        methods.subloop_register_instance_method(CYBLACK_ADD_POSTING_CLASS_MESSAGE, EXECUTE, CYBLACK_ADD_POSTING_CLASS_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_PANEL_MANIPULATION_MESSAGE, CYBLACK_MODIFICATION_MESSAGE, NIL, NIL, $list_alt1003);
        classes.class_set_implements_slot_listeners(CYBLACK_PANEL_MANIPULATION_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PANEL_MANIPULATION_MESSAGE, $sym1005$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PANEL_MANIPULATION_MESSAGE_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_PANEL_MANIPULATION_MESSAGE, $sym1006$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PANEL_MANIPULATION_MESSAGE_IN);
        subloop_reserved_initialize_cyblack_panel_manipulation_message_class(CYBLACK_PANEL_MANIPULATION_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt174, NIL, $list_alt1007);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, INITIALIZE, CYBLACK_PANEL_MANIPULATION_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt174, $list_alt188, $list_alt1010);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, PRINT_TAIL_PART, CYBLACK_PANEL_MANIPULATION_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt174, $list_alt161, $list_alt1012);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, PARSE_ARGS, CYBLACK_PANEL_MANIPULATION_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt174, NIL, $list_alt1016);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, TO_REVERSED_LIST, CYBLACK_PANEL_MANIPULATION_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt267, NIL, $list_alt1020);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, GET_TYPE, CYBLACK_PANEL_MANIPULATION_MESSAGE_GET_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt174, $list_alt1023, $list_alt1024);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, SET_TYPE, CYBLACK_PANEL_MANIPULATION_MESSAGE_SET_TYPE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_PANEL_MANIPULATION_MESSAGE, $list_alt206, NIL, $list_alt1027);
        methods.subloop_register_instance_method(CYBLACK_PANEL_MANIPULATION_MESSAGE, EXECUTE, CYBLACK_PANEL_MANIPULATION_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_ADD_PANEL_MESSAGE, CYBLACK_PANEL_MANIPULATION_MESSAGE, NIL, NIL, $list_alt1032);
        classes.class_set_implements_slot_listeners(CYBLACK_ADD_PANEL_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ADD_PANEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_PANEL_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ADD_PANEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_PANEL_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_add_panel_message_class(CYBLACK_ADD_PANEL_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ADD_PANEL_MESSAGE, $list_alt174, NIL, $list_alt1038);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, INITIALIZE, CYBLACK_ADD_PANEL_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_TAIL_PART, CYBLACK_ADD_PANEL_MESSAGE, $list_alt174, $list_alt188, $list_alt1041);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, PRINT_TAIL_PART, CYBLACK_ADD_PANEL_MESSAGE_PRINT_TAIL_PART_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ARGS, CYBLACK_ADD_PANEL_MESSAGE, $list_alt174, $list_alt161, $list_alt1045);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, PARSE_ARGS, CYBLACK_ADD_PANEL_MESSAGE_PARSE_ARGS_METHOD);
        methods.methods_incorporate_instance_method(TO_REVERSED_LIST, CYBLACK_ADD_PANEL_MESSAGE, $list_alt174, NIL, $list_alt1051);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, TO_REVERSED_LIST, CYBLACK_ADD_PANEL_MESSAGE_TO_REVERSED_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPERTYPES, CYBLACK_ADD_PANEL_MESSAGE, $list_alt196, NIL, $list_alt1055);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, GET_SUPERTYPES, CYBLACK_ADD_PANEL_MESSAGE_GET_SUPERTYPES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPERTYPES, CYBLACK_ADD_PANEL_MESSAGE, $list_alt169, $list_alt1058, $list_alt1059);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, SET_SUPERTYPES, CYBLACK_ADD_PANEL_MESSAGE_SET_SUPERTYPES_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_CLASS, CYBLACK_ADD_PANEL_MESSAGE, $list_alt196, NIL, $list_alt1063);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, GET_POSTING_CLASS, CYBLACK_ADD_PANEL_MESSAGE_GET_POSTING_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_POSTING_CLASS, CYBLACK_ADD_PANEL_MESSAGE, $list_alt169, $list_alt1066, $list_alt1067);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, SET_POSTING_CLASS, CYBLACK_ADD_PANEL_MESSAGE_SET_POSTING_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL_CLASS, CYBLACK_ADD_PANEL_MESSAGE, $list_alt196, NIL, $list_alt1071);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, GET_PANEL_CLASS, CYBLACK_ADD_PANEL_MESSAGE_GET_PANEL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL_CLASS, CYBLACK_ADD_PANEL_MESSAGE, $list_alt169, $list_alt1074, $list_alt1075);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, SET_PANEL_CLASS, CYBLACK_ADD_PANEL_MESSAGE_SET_PANEL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_ADD_PANEL_MESSAGE, $list_alt206, NIL, $list_alt1078);
        methods.subloop_register_instance_method(CYBLACK_ADD_PANEL_MESSAGE, EXECUTE, CYBLACK_ADD_PANEL_MESSAGE_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_REMOVE_PANEL_MESSAGE, CYBLACK_PANEL_MANIPULATION_MESSAGE, NIL, NIL, $list_alt574);
        classes.class_set_implements_slot_listeners(CYBLACK_REMOVE_PANEL_MESSAGE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REMOVE_PANEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_PANEL_MESSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_REMOVE_PANEL_MESSAGE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_PANEL_MESSAGE_INSTANCE);
        subloop_reserved_initialize_cyblack_remove_panel_message_class(CYBLACK_REMOVE_PANEL_MESSAGE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REMOVE_PANEL_MESSAGE, $list_alt174, NIL, $list_alt1088);
        methods.subloop_register_instance_method(CYBLACK_REMOVE_PANEL_MESSAGE, INITIALIZE, CYBLACK_REMOVE_PANEL_MESSAGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_REMOVE_PANEL_MESSAGE, $list_alt206, NIL, $list_alt1090);
        methods.subloop_register_instance_method(CYBLACK_REMOVE_PANEL_MESSAGE, EXECUTE, CYBLACK_REMOVE_PANEL_MESSAGE_EXECUTE_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(new SubLObject[]{ makeKeyword("GENERIC"), makeKeyword("INVITE"), makeKeyword("STIMULATE"), makeKeyword("VERIFY"), makeKeyword("CANCEL"), makeKeyword("EXECUTE"), makeKeyword("TERMINATE"), makeKeyword("ACCEPT"), makeKeyword("REJECT"), makeKeyword("PROPOSE"), makeKeyword("DECLINE"), makeKeyword("REVOKE"), makeKeyword("AFFIRM"), makeKeyword("CONTRIBUTE"), makeKeyword("ACQUIT"), makeKeyword("STATE-CHANGE"), makeKeyword("REQUEST-CONTENTS"), makeKeyword("REPORT-CONTENTS") });

    private static final SubLSymbol CYBLACK_MESSAGE_KEY_TYPE = makeSymbol("CYBLACK-MESSAGE-KEY-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_MESSAGE_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-MESSAGE-KEY-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_MESSAGE_KEY_TYPE = makeSymbol("DECODE-CYBLACK-MESSAGE-KEY-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_MESSAGE_KEY_TYPE_P = makeSymbol("CYBLACK-MESSAGE-KEY-TYPE-P");

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("APPNAME"), makeKeyword("EMNAME"), makeKeyword("PROPID"), makeKeyword("AAL"), makeKeyword("PRECON"), makeKeyword("EXCUSES"), $CONF, makeKeyword("DTBAG"), makeKeyword("REASONS"), makeKeyword("CONTR"), makeKeyword("ET"), makeKeyword("CONTENTS"), $TYPE, makeKeyword("PORT-ID"), makeKeyword("CLASS"), makeKeyword("SUPER-CLASS"), makeKeyword("SLOTS"), makeKeyword("SUPERTYPES"), makeKeyword("POSTING-CLASS"), makeKeyword("PANEL-CLASS") });

    private static final SubLSymbol CYBLACK_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt13 = list(makeKeyword("ADD-KNOWLEDGE-SOURCE"), makeKeyword("REMOVE-KNOWLEDGE-SOURCE"), makeKeyword("ADD-POSTING-CLASS"), makeKeyword("ADD-PANEL"), makeKeyword("REMOVE-PANEL"));

    private static final SubLSymbol CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS = makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS");

    private static final SubLSymbol ENCODE_CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS = makeSymbol("ENCODE-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS");

    private static final SubLSymbol DECODE_CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS = makeSymbol("DECODE-CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS");

    private static final SubLSymbol CYBLACK_MESSAGE_ARG_KEY_TYPE_FOR_DYNAMIC_APPS_P = makeSymbol("CYBLACK-MESSAGE-ARG-KEY-TYPE-FOR-DYNAMIC-APPS-P");

    static private final SubLList $list_alt18 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), $TYPE);

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt23 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), $TYPE, makeKeyword("CONTENTS"));

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt28 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("APPNAME"), makeKeyword("EMNAME"));

    private static final SubLSymbol CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_INVITE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-INVITE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt33 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("PROPID"));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt38 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("PROPID"), makeKeyword("AAL"));

    private static final SubLSymbol CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ACTIVATION_ARGLIST_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-STIMULATE-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_VERIFY_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-VERIFY-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_CANCEL_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-CANCEL-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_EXECUTE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-EXECUTE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt59 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"));

    private static final SubLSymbol CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_TERMINATE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-TERMINATE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt64 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("EMNAME"), makeKeyword("PRECON"));

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ACCEPT-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt69 = list(makeKeyword("SID"), makeKeyword("EMNAME"), $EMID, makeKeyword("TID"), makeKeyword("EXCUSES"));

    private static final SubLSymbol CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REJECT_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REJECT-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt74 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("PROPID"), $CONF, makeKeyword("DTBAG"), makeKeyword("REASONS"));

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-PROPOSE-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-DECLINE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt83 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("PROPID"), makeKeyword("EXCUSES"));

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REVOKE-MESSAGE-ARG-KEY-TYPE-P");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-AFFIRM-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt92 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("PROPID"), $CONF, makeKeyword("CONTR"));

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt97 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("EXCUSES"));

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ACQUIT-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt102 = list(makeKeyword("SID"), $EMID, makeKeyword("TID"), makeKeyword("ET"), makeKeyword("CONTENTS"));

    private static final SubLSymbol CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYLACK_STATE_CHANGE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYLACK-STATE-CHANGE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt107 = list($POST, makeKeyword("REMOVE-POST"), makeKeyword("PROPOSE"), makeKeyword("ADD-KS"), makeKeyword("REMOVED-KS"));

    private static final SubLSymbol CYBLACK_EVENT_TYPE = makeSymbol("CYBLACK-EVENT-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_EVENT_TYPE = makeSymbol("ENCODE-CYBLACK-EVENT-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_EVENT_TYPE = makeSymbol("DECODE-CYBLACK-EVENT-TYPE");

    private static final SubLSymbol CYBLACK_EVENT_TYPE_P = makeSymbol("CYBLACK-EVENT-TYPE-P");

    static private final SubLList $list_alt112 = list(makeKeyword("EMNAME"), makeKeyword("PORT-ID"));

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt117 = list(makeKeyword("EMNAME"));

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt122 = list(makeKeyword("CLASS"), makeKeyword("SUPER-CLASS"), makeKeyword("SLOTS"));

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt127 = list($TYPE, makeKeyword("SUPERTYPES"), makeKeyword("POSTING-CLASS"), makeKeyword("PANEL-CLASS"));

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-ARG-KEY-TYPE-P");

    static private final SubLList $list_alt132 = list($TYPE);

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("ENCODE-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE = makeSymbol("DECODE-CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE");

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE_ARG_KEY_TYPE_P = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE-ARG-KEY-TYPE-P");





    static private final SubLList $list_alt139 = list(new SubLObject[]{ list(makeSymbol("TIMESTAMP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KNOWLEDGE-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-KEY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SESSION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TRANSACTION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-LIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-HEAD-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMESTAMP"), list(makeSymbol("NEW-TIMESTAMP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TIMESTAMP-NOW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-KEY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGE-KEY"), list(makeSymbol("NEW-MESSAGE-KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SESSION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SESSION-ID"), list(makeSymbol("NEW-SESSION-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TRANSACTION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TRANSACTION-ID"), list(makeSymbol("NEW-TRANSACTION-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-ID"), list(makeSymbol("NEW-EXTERNAL-MODULE-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-IDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGE-BROKER"), list(makeSymbol("NEW-MESSAGE-BROKER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PROTECTED")) });









    private static final SubLSymbol MESSAGE_KEY = makeSymbol("MESSAGE-KEY");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MESSAGE-INSTANCE");



    static private final SubLList $list_alt156 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt157 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-TIMESTAMP"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("GENERIC")), list(makeSymbol("SET-SESSION-ID"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-MESSAGE-INITIALIZE-METHOD");



    static private final SubLList $list_alt161 = list(makeSymbol("MESSAGE-ARGS"));

    static private final SubLList $list_alt162 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-SESSION-ID"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("SID"))), list(makeSymbol("SET-EXTERNAL-MODULE-ID"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), $EMID)), list(makeSymbol("SET-TRANSACTION-ID"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("TID"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt163$_PARSE_ARGS__S___Argument_list__S = makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys.");







    private static final SubLSymbol CYBLACK_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt169 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt170 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), NIL)), list(makeSymbol("CWITH-OUTPUT-TO-STRING"), list(makeSymbol("STREAM"), makeSymbol("STRING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRINT")), makeSymbol("STREAM"), ZERO_INTEGER)), list(makeSymbol("FORCE-OUTPUT"), T), list(RET, makeSymbol("STRING"))));



    private static final SubLSymbol CYBLACK_MESSAGE_TO_STRING_METHOD = makeSymbol("CYBLACK-MESSAGE-TO-STRING-METHOD");



    static private final SubLList $list_alt174 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt175 = list(list(RET, list(makeSymbol("LIST"), makeSymbol("TRANSACTION-ID"), makeKeyword("TID"), makeSymbol("EXTERNAL-MODULE-ID"), $EMID, makeSymbol("SESSION-ID"), makeKeyword("SID"), makeSymbol("MESSAGE-KEY"))));

    static private final SubLSymbol $sym176$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-MESSAGE-TO-REVERSED-LIST-METHOD");



    static private final SubLList $list_alt179 = list(list(RET, list(makeSymbol("NREVERSE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TO-REVERSED-LIST"))))));

    private static final SubLSymbol CYBLACK_MESSAGE_TO_LIST_METHOD = makeSymbol("CYBLACK-MESSAGE-TO-LIST-METHOD");

    static private final SubLList $list_alt181 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt182 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRINT-HEAD-PART")), makeSymbol("STREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRINT-TAIL-PART")), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt183$_ = makeString("(");

    private static final SubLSymbol PRINT_HEAD_PART = makeSymbol("PRINT-HEAD-PART");



    static private final SubLString $str_alt186$_ = makeString(")");

    private static final SubLSymbol CYBLACK_MESSAGE_PRINT_METHOD = makeSymbol("CYBLACK-MESSAGE-PRINT-METHOD");

    static private final SubLList $list_alt188 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt189 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S :SID ~S :EMID ~S :TID ~S"), makeSymbol("MESSAGE-KEY"), makeSymbol("SESSION-ID"), makeSymbol("EXTERNAL-MODULE-ID"), makeSymbol("TRANSACTION-ID")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym190$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt191$_S__SID__S__EMID__S__TID__S = makeString("~S :SID ~S :EMID ~S :TID ~S");

    private static final SubLSymbol CYBLACK_MESSAGE_PRINT_HEAD_PART_METHOD = makeSymbol("CYBLACK-MESSAGE-PRINT-HEAD-PART-METHOD");

    static private final SubLList $list_alt193 = list(list(makeSymbol("IGNORE"), makeSymbol("STREAM")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-MESSAGE-PRINT-TAIL-PART-METHOD");



    static private final SubLList $list_alt196 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt197 = list(list(RET, makeSymbol("TIMESTAMP")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-TIMESTAMP-METHOD");



    static private final SubLList $list_alt200 = list(makeSymbol("NEW-TIMESTAMP"));

    static private final SubLList $list_alt201 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TIMESTAMP")), list(makeSymbol("INTEGERP"), makeSymbol("NEW-TIMESTAMP"))), makeString("(SET-TIMESTAMP ~S): ~S is not a valid timestamp."), makeSymbol("SELF"), makeSymbol("NEW-TIMESTAMP")), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), makeSymbol("NEW-TIMESTAMP")), list(RET, makeSymbol("NEW-TIMESTAMP")));

    static private final SubLSymbol $sym202$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt203$_SET_TIMESTAMP__S____S_is_not_a_v = makeString("(SET-TIMESTAMP ~S): ~S is not a valid timestamp.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-TIMESTAMP-METHOD");

    private static final SubLSymbol TIMESTAMP_NOW = makeSymbol("TIMESTAMP-NOW");

    static private final SubLList $list_alt206 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt207 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TIMESTAMP"), list(makeSymbol("GET-UNIVERSAL-TIME")))), list(makeSymbol("SET-TIMESTAMP"), makeSymbol("SELF"), makeSymbol("NEW-TIMESTAMP")), list(RET, makeSymbol("NEW-TIMESTAMP"))));

    private static final SubLSymbol CYBLACK_MESSAGE_TIMESTAMP_NOW_METHOD = makeSymbol("CYBLACK-MESSAGE-TIMESTAMP-NOW-METHOD");



    static private final SubLList $list_alt210 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt213 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt214 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-KNOWLEDGE-SOURCE"))), makeString("(SET-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym215$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt216$_SET_KNOWLEDGE_SOURCE__S____S_is_ = makeString("(SET-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol GET_MESSAGE_KEY = makeSymbol("GET-MESSAGE-KEY");

    static private final SubLList $list_alt219 = list(list(RET, makeSymbol("MESSAGE-KEY")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_MESSAGE_KEY_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-MESSAGE-KEY-METHOD");



    static private final SubLList $list_alt222 = list(makeSymbol("NEW-MESSAGE-KEY"));

    static private final SubLList $list_alt223 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-KEY-TYPE-P"), makeSymbol("NEW-MESSAGE-KEY")), makeString("(SET-MESSAGE-KEY ~S): ~S is not an instance of the CYBLACK-MESSAGE-KEY-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-KEY")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-KEY"), makeSymbol("NEW-MESSAGE-KEY")), list(RET, makeSymbol("NEW-MESSAGE-KEY")));

    static private final SubLSymbol $sym224$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt225$_SET_MESSAGE_KEY__S____S_is_not_a = makeString("(SET-MESSAGE-KEY ~S): ~S is not an instance of the CYBLACK-MESSAGE-KEY-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_MESSAGE_KEY_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-MESSAGE-KEY-METHOD");



    static private final SubLList $list_alt228 = list(list(RET, makeSymbol("SESSION-ID")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_SESSION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-SESSION-ID-METHOD");



    static private final SubLList $list_alt231 = list(makeSymbol("NEW-SESSION-ID"));

    static private final SubLList $list_alt232 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-SESSION-ID"))), makeString("(SET-SESSION-ID ~S): ~S is not a GUID."), makeSymbol("SELF"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("PIF"), list(makeSymbol("GUID-P"), makeSymbol("NEW-SESSION-ID")), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-SESSION-ID"))), list(makeSymbol("CSETQ"), makeSymbol("SESSION-ID"), makeSymbol("NEW-SESSION-ID"))), list(RET, makeSymbol("NEW-SESSION-ID")));

    static private final SubLSymbol $sym233$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt234$_SET_SESSION_ID__S____S_is_not_a_ = makeString("(SET-SESSION-ID ~S): ~S is not a GUID.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_SESSION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-SESSION-ID-METHOD");

    private static final SubLSymbol GET_TRANSACTION_ID = makeSymbol("GET-TRANSACTION-ID");

    static private final SubLList $list_alt237 = list(list(RET, makeSymbol("TRANSACTION-ID")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_TRANSACTION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-TRANSACTION-ID-METHOD");



    static private final SubLList $list_alt240 = list(makeSymbol("NEW-TRANSACTION-ID"));

    static private final SubLList $list_alt241 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TRANSACTION-ID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-TRANSACTION-ID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-TRANSACTION-ID"))), makeString("(SET-TRANSACTION-ID ~S): ~S is not a GUID."), makeSymbol("SELF"), makeSymbol("NEW-TRANSACTION-ID")), list(makeSymbol("PIF"), list(makeSymbol("GUID-P"), makeSymbol("NEW-TRANSACTION-ID")), list(makeSymbol("CSETQ"), makeSymbol("TRANSACTION-ID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-TRANSACTION-ID"))), list(makeSymbol("CSETQ"), makeSymbol("TRANSACTION-ID"), makeSymbol("NEW-TRANSACTION-ID"))), list(RET, makeSymbol("NEW-TRANSACTION-ID")));

    static private final SubLSymbol $sym242$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt243$_SET_TRANSACTION_ID__S____S_is_no = makeString("(SET-TRANSACTION-ID ~S): ~S is not a GUID.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_TRANSACTION_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-TRANSACTION-ID-METHOD");



    static private final SubLList $list_alt246 = list(list(RET, makeSymbol("EXTERNAL-MODULE-ID")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-EXTERNAL-MODULE-ID-METHOD");



    static private final SubLList $list_alt249 = list(makeSymbol("NEW-EXTERNAL-MODULE-ID"));

    static private final SubLList $list_alt250 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-EXTERNAL-MODULE-ID"))), makeString("(SET-EXTERNAL-MODULE-ID ~S): ~S is not a GUID."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("PIF"), list(makeSymbol("GUID-P"), makeSymbol("NEW-EXTERNAL-MODULE-ID")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-EXTERNAL-MODULE-ID"))), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-ID"), makeSymbol("NEW-EXTERNAL-MODULE-ID"))), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-ID")));

    static private final SubLSymbol $sym251$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt252$_SET_EXTERNAL_MODULE_ID__S____S_i = makeString("(SET-EXTERNAL-MODULE-ID ~S): ~S is not a GUID.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_EXTERNAL_MODULE_ID_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-EXTERNAL-MODULE-ID-METHOD");

    private static final SubLSymbol GET_ALL_IDS = makeSymbol("GET-ALL-IDS");

    static private final SubLList $list_alt255 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("FIF"), makeSymbol("SESSION-ID"), list(makeSymbol("LIST"), makeSymbol("SESSION-ID")), NIL), list(makeSymbol("FIF"), makeSymbol("TRANSACTION-ID"), list(makeSymbol("LIST"), makeSymbol("TRANSACTION-ID")), NIL), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-ID"), list(makeSymbol("LIST"), makeSymbol("EXTERNAL-MODULE-ID")), NIL))));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_ALL_IDS_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-ALL-IDS-METHOD");



    static private final SubLList $list_alt258 = list(list(RET, makeSymbol("MESSAGE-BROKER")));

    private static final SubLSymbol CYBLACK_MESSAGE_GET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-MESSAGE-BROKER-METHOD");



    static private final SubLList $list_alt261 = list(makeSymbol("NEW-MESSAGE-BROKER"));

    static private final SubLList $list_alt262 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CYBLACK-MESSAGE-BROKER-P"), makeSymbol("NEW-MESSAGE-BROKER"))), makeString("(SET-MESSAGE-BROKER ~S): ~S is not an instance of CYBLACK-MESSAGE-BROKER."), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-BROKER"), makeSymbol("NEW-MESSAGE-BROKER")), list(RET, makeSymbol("NEW-MESSAGE-BROKER")));

    static private final SubLSymbol $sym263$OUTER_CATCH_FOR_CYBLACK_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MESSAGE-METHOD");

    static private final SubLString $str_alt264$_SET_MESSAGE_BROKER__S____S_is_no = makeString("(SET-MESSAGE-BROKER ~S): ~S is not an instance of CYBLACK-MESSAGE-BROKER.");

    private static final SubLSymbol CYBLACK_MESSAGE_SET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-MESSAGE-SET-MESSAGE-BROKER-METHOD");



    static private final SubLList $list_alt267 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt268 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-DATATYPE-DICTIONARY ~S): No application is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION")))), list(makeSymbol("MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(GET-DATATYPE-DICTIONARY ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("DATATYPE-DICTIONARY")), list(RET, makeSymbol("DATATYPE-DICTIONARY"))));

    static private final SubLString $str_alt269$_GET_DATATYPE_DICTIONARY__S___No_ = makeString("(GET-DATATYPE-DICTIONARY ~S): No application is associated with this message.");

    static private final SubLString $str_alt270$_GET_DATATYPE_DICTIONARY__S___No_ = makeString("(GET-DATATYPE-DICTIONARY ~S): No datatype dictionary is associated with the application ~S.");

    private static final SubLSymbol CYBLACK_MESSAGE_GET_DATATYPE_DICTIONARY_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-DATATYPE-DICTIONARY-METHOD");



    static private final SubLList $list_alt273 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(GET-AGENDA ~S): No application is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("CYBLACK-APPLICATION-GET-AGENDA"), makeSymbol("APPLICATION")))), list(makeSymbol("MUST"), makeSymbol("AGENDA"), makeString("(GET-AGENDA ~S): No agenda is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("AGENDA")), list(RET, makeSymbol("AGENDA"))));

    static private final SubLString $str_alt274$_GET_AGENDA__S___No_application_i = makeString("(GET-AGENDA ~S): No application is associated with this message.");

    static private final SubLString $str_alt275$_GET_AGENDA__S___No_agenda_is_ass = makeString("(GET-AGENDA ~S): No agenda is associated with the application ~S.");

    private static final SubLSymbol CYBLACK_MESSAGE_GET_AGENDA_METHOD = makeSymbol("CYBLACK-MESSAGE-GET-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_TRANSMIT_MESSAGE = makeSymbol("CYBLACK-TRANSMIT-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TRANSMIT_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TRANSMIT-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TRANSMIT_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TRANSMIT-MESSAGE-INSTANCE");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE");

    static private final SubLList $list_alt281 = list(new SubLObject[]{ list(makeSymbol("TYPE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-CONTENTS"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-STRING"), list(makeSymbol("NEW-TYPE-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_CONTENTS_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-CONTENTS-MESSAGE-CLASS");

    static private final SubLSymbol $sym285$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_CONTENTS_MESSAGE_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-CONTENTS-MESSAGE-INSTANCE");

    static private final SubLList $list_alt286 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("REPORT-CONTENTS")), list(makeSymbol("SET-TYPE-STRING"), makeSymbol("SELF"), makeString("POSTING")), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $REPORT_CONTENTS = makeKeyword("REPORT-CONTENTS");

    static private final SubLString $$$POSTING = makeString("POSTING");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt290 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTIFIED-CONTENTS"), NIL), makeSymbol("DATATYPE"), makeSymbol("DATATYPE-NAME")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("ELEMENT"))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE"), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), makeSymbol("DATATYPE"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLISTIFY"), makeSymbol("OBJECT")), makeSymbol("ELEMENT"))), makeSymbol("LISTIFIED-CONTENTS")))))), list(RET, list(makeSymbol("LIST*"), list(makeSymbol("NREVERSE"), makeSymbol("LISTIFIED-CONTENTS")), makeKeyword("CONTENTS"), makeSymbol("TYPE-STRING"), $TYPE, list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER"))))));

    static private final SubLSymbol $sym291$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-CONTENTS-MESSAGE-METHOD");





    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-TO-REVERSED-LIST-METHOD");

    private static final SubLSymbol PRINT_CONTENTS = makeSymbol("PRINT-CONTENTS");

    static private final SubLList $list_alt296 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("CONTENTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("()"))), list(list(makeSymbol("CONSP"), makeSymbol("CONTENTS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("CONTENTS")), list(makeSymbol("PCOND"), list(list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("ELEMENT"))), list(makeSymbol("DATATYPE-NAME"), list(makeSymbol("FIF"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), makeSymbol("DATATYPE")), makeString("POSTING")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), list(makeSymbol("CONS"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLISTIFY"), makeSymbol("OBJECT")), makeSymbol("ELEMENT")))))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("ELEMENT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("CONTENTS")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym297$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt298$__ = makeString("()");

    static private final SubLString $str_alt299$_S = makeString("~S");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_PRINT_CONTENTS_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-PRINT-CONTENTS-METHOD");

    static private final SubLList $list_alt301 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :TYPE ~S :CONTENTS "), makeSymbol("TYPE-STRING")), list(makeSymbol("PIF"), makeSymbol("CONTENTS"), list(makeSymbol("PRINT-CONTENTS"), makeSymbol("SELF"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("()"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym302$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt303$__TYPE__S__CONTENTS_ = makeString(" :TYPE ~S :CONTENTS ");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt305 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-ARG-KEY-TYPE-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), $TYPE))), list(makeSymbol("SET-TYPE-STRING"), makeSymbol("SELF"), list(makeSymbol("FIF"), makeSymbol("TYPE"), makeSymbol("TYPE"), makeString("POSTING"))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("CONTENTS")))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_TYPE_STRING = makeSymbol("GET-TYPE-STRING");

    static private final SubLList $list_alt308 = list(list(RET, makeSymbol("TYPE-STRING")));

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_GET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-GET-TYPE-STRING-METHOD");



    static private final SubLList $list_alt311 = list(makeSymbol("NEW-TYPE-STRING"));

    static private final SubLList $list_alt312 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("NEW-TYPE-STRING")), makeString("(SET-TYPE-STRING ~S): ~S is not a valid type string.  A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-STRING"), makeSymbol("NEW-TYPE-STRING")), list(RET, makeSymbol("NEW-TYPE-STRING")));

    static private final SubLSymbol $sym313$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt314$_SET_TYPE_STRING__S____S_is_not_a = makeString("(SET-TYPE-STRING ~S): ~S is not a valid type string.  A string was expected.");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_SET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-SET-TYPE-STRING-METHOD");



    static private final SubLList $list_alt317 = list(list(RET, makeSymbol("CONTENTS")));

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt320 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt321 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid posting desription list.  A list was expected."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), makeSymbol("NEW-CONTENTS")), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLSymbol $sym322$OUTER_CATCH_FOR_CYBLACK_REPORT_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt323$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid posting desription list.  A list was expected.");

    private static final SubLSymbol CYBLACK_REPORT_CONTENTS_MESSAGE_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-REPORT-CONTENTS-MESSAGE-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt326 = list(new SubLObject[]{ list(makeSymbol("APPLICATION-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION-NAME"), list(makeSymbol("NEW-APPLICATION-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INVITATION_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INVITATION-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INVITATION_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INVITATION-MESSAGE-INSTANCE");

    static private final SubLList $list_alt331 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("INVITE")), list(makeSymbol("SET-APPLICATION-NAME"), makeSymbol("SELF"), makeString("")), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("SELF"), makeString("")), list(RET, makeSymbol("SELF")));



    static private final SubLString $str_alt333$ = makeString("");

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt335 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("EMNAME"), makeSymbol("APPLICATION-NAME"), makeKeyword("APPNAME"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym336$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INVITATION-MESSAGE-METHOD");





    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt340 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :APPNAME ~S :EMNAME ~S"), makeSymbol("APPLICATION-NAME"), makeSymbol("EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym341$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INVITATION-MESSAGE-METHOD");

    static private final SubLString $str_alt342$__APPNAME__S__EMNAME__S = makeString(" :APPNAME ~S :EMNAME ~S");

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt344 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-INVITE-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-APPLICATION-NAME"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("APPNAME"))), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("EMNAME"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt347 = list(list(RET, makeSymbol("APPLICATION-NAME")));

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_GET_APPLICATION_NAME_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-GET-APPLICATION-NAME-METHOD");



    static private final SubLList $list_alt350 = list(makeSymbol("NEW-APPLICATION-NAME"));

    static private final SubLList $list_alt351 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-APPLICATION-NAME"))), makeString("(SET-APPLICATION-NAME ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION-NAME")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-NAME"), makeSymbol("NEW-APPLICATION-NAME")), list(RET, makeSymbol("NEW-APPLICATION-NAME")));

    static private final SubLSymbol $sym352$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INVITATION-MESSAGE-METHOD");

    static private final SubLString $str_alt353$_SET_APPLICATION_NAME__S____S_is_ = makeString("(SET-APPLICATION-NAME ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_SET_APPLICATION_NAME_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-SET-APPLICATION-NAME-METHOD");



    static private final SubLList $list_alt356 = list(list(RET, makeSymbol("EXTERNAL-MODULE-NAME")));

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_GET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-GET-EXTERNAL-MODULE-NAME-METHOD");



    static private final SubLList $list_alt359 = list(makeSymbol("NEW-EXTERNAL-MODULE-NAME"));

    static private final SubLList $list_alt360 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-NAME"))), makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-NAME")));

    static private final SubLSymbol $sym361$OUTER_CATCH_FOR_CYBLACK_INVITATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INVITATION-MESSAGE-METHOD");

    static private final SubLString $str_alt362$_SET_EXTERNAL_MODULE_NAME__S____S = makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a string.");

    private static final SubLSymbol CYBLACK_INVITATION_MESSAGE_SET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-INVITATION-MESSAGE-SET-EXTERNAL-MODULE-NAME-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE");

    static private final SubLList $list_alt365 = list(list(makeSymbol("PROPID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPID"), list(makeSymbol("NEW-PROPID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-IDS"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym367$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-CLASS");

    static private final SubLSymbol $sym368$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-INSTANCE");

    static private final SubLList $list_alt369 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-PROPID"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt371 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("PROPID"), makeKeyword("PROPID"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym372$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-METHOD");



    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt375 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PROPID ~S"), makeSymbol("PROPID")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym376$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-METHOD");

    static private final SubLString $str_alt377$__PROPID__S = makeString(" :PROPID ~S");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt379 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-EMBEDDED-PROPID-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-PROPID"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("PROPID"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_PROPID = makeSymbol("GET-PROPID");

    static private final SubLList $list_alt382 = list(list(RET, makeSymbol("PROPID")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_GET_PROPID_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-GET-PROPID-METHOD");



    static private final SubLList $list_alt385 = list(makeSymbol("NEW-PROPID"));

    static private final SubLList $list_alt386 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PROPID")), list(makeSymbol("STRINGP"), makeSymbol("NEW-PROPID")), list(makeSymbol("GUID-P"), makeSymbol("NEW-PROPID"))), makeString("(SET-PROPID ~S): ~S is not a valid guid."), makeSymbol("SELF"), makeSymbol("NEW-PROPID")), list(makeSymbol("PIF"), list(makeSymbol("GUID-P"), makeSymbol("NEW-PROPID")), list(makeSymbol("CSETQ"), makeSymbol("PROPID"), list(makeSymbol("GUID-TO-STRING"), makeSymbol("NEW-PROPID"))), list(makeSymbol("CSETQ"), makeSymbol("PROPID"), makeSymbol("NEW-PROPID"))), list(RET, makeSymbol("NEW-PROPID")));

    static private final SubLSymbol $sym387$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-METHOD");

    static private final SubLString $str_alt388$_SET_PROPID__S____S_is_not_a_vali = makeString("(SET-PROPID ~S): ~S is not a valid guid.");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_SET_PROPID_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-SET-PROPID-METHOD");

    static private final SubLList $list_alt390 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("PROPID"), list(makeSymbol("CONS"), makeSymbol("PROPID"), list(makeSymbol("GET-ALL-IDS"), makeSymbol("SUPER"))), list(makeSymbol("GET-ALL-IDS"), makeSymbol("SUPER")))));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_TRANSMIT_MESSAGE_GET_ALL_IDS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-TRANSMIT-MESSAGE-GET-ALL-IDS-METHOD");

    private static final SubLSymbol CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE");

    static private final SubLList $list_alt393 = list(new SubLObject[]{ list(makeSymbol("ACTIVATION-ARGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVATION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-ARGS"), list(makeSymbol("NEW-ACTIVATION-ARGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")) });



    private static final SubLSymbol ACTIVATION_ARGS = makeSymbol("ACTIVATION-ARGS");

    static private final SubLSymbol $sym396$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_M = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-CLASS");

    static private final SubLSymbol $sym397$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_M = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-INSTANCE");

    static private final SubLList $list_alt398 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-ACTIVATION-ARGS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt400 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("ACTIVATION-ARGS"), makeKeyword("AAL"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym401$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-METHOD");



    static private final SubLSymbol $sym403$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_TO_REVERSED_LIST_METH = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt404 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :AAL ~S"), makeSymbol("ACTIVATION-ARGS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym405$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-METHOD");

    static private final SubLString $str_alt406$__AAL__S = makeString(" :AAL ~S");

    static private final SubLSymbol $sym407$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_PRINT_TAIL_PART_METHO = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt408 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-ACTIVATION-ARGLIST-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-ACTIVATION-ARGS"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("AAL"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_ACTIVATION_ARGS = makeSymbol("GET-ACTIVATION-ARGS");

    static private final SubLList $list_alt411 = list(list(RET, makeSymbol("ACTIVATION-ARGS")));

    static private final SubLSymbol $sym412$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_GET_ACTIVATION_ARGS_M = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-GET-ACTIVATION-ARGS-METHOD");

    private static final SubLSymbol SET_ACTIVATION_ARGS = makeSymbol("SET-ACTIVATION-ARGS");

    static private final SubLList $list_alt414 = list(makeSymbol("NEW-ACTIVATION-ARGS"));

    static private final SubLList $list_alt415 = list(list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-ARGS"), makeSymbol("NEW-ACTIVATION-ARGS")), list(RET, makeSymbol("NEW-ACTIVATION-ARGS")));

    static private final SubLSymbol $sym416$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-METHOD");

    static private final SubLSymbol $sym417$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_SET_ACTIVATION_ARGS_M = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-SET-ACTIVATION-ARGS-METHOD");



    static private final SubLList $list_alt419 = list(list(RET, makeSymbol("ACTIVATION-PATTERN")));

    static private final SubLSymbol $sym420$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_GET_ACTIVATION_PATTER = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-GET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt422 = list(makeSymbol("NEW-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt423 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("NEW-ACTIVATION-PATTERN"))), makeString("(SET-ACTIVATION-PATTERN ~S): ~S is not an instance of CYBLACK-ENVIRONMENT."), makeSymbol("SELF"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(RET, NIL));

    static private final SubLSymbol $sym424$OUTER_CATCH_FOR_CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-METHOD");

    static private final SubLString $str_alt425$_SET_ACTIVATION_PATTERN__S____S_i = makeString("(SET-ACTIVATION-PATTERN ~S): ~S is not an instance of CYBLACK-ENVIRONMENT.");

    static private final SubLSymbol $sym426$CYBLACK_ACTIVATION_ARGLIST_TRANSMIT_MESSAGE_SET_ACTIVATION_PATTER = makeSymbol("CYBLACK-ACTIVATION-ARGLIST-TRANSMIT-MESSAGE-SET-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE = makeSymbol("CYBLACK-STIMULATE-MESSAGE");

    static private final SubLList $list_alt428 = list(list(makeSymbol("IMPLICIT"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IMPLICIT"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IMPLICIT-P"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol IMPLICIT = makeSymbol("IMPLICIT");

    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STIMULATE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STIMULATE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STIMULATE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STIMULATE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt433 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-CYBLACK-STIMULATE-MESSAGE-IMPLICIT"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("STIMULATE")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-STIMULATE-MESSAGE-INITIALIZE-METHOD");

    private static final SubLSymbol SET_IMPLICIT = makeSymbol("SET-IMPLICIT");

    static private final SubLList $list_alt437 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt438 = list(list(RET, list(makeSymbol("SET-CYBLACK-STIMULATE-MESSAGE-IMPLICIT"), makeSymbol("SELF"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL))));

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE_SET_IMPLICIT_METHOD = makeSymbol("CYBLACK-STIMULATE-MESSAGE-SET-IMPLICIT-METHOD");

    private static final SubLSymbol IMPLICIT_P = makeSymbol("IMPLICIT-P");

    static private final SubLList $list_alt441 = list(list(RET, list(makeSymbol("GET-CYBLACK-STIMULATE-MESSAGE-IMPLICIT"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_STIMULATE_MESSAGE_IMPLICIT_P_METHOD = makeSymbol("CYBLACK-STIMULATE-MESSAGE-IMPLICIT-P-METHOD");



    static private final SubLList $list_alt444 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VERIFY_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VERIFY-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_VERIFY_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-VERIFY-MESSAGE-INSTANCE");

    static private final SubLList $list_alt447 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("VERIFY")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_VERIFY_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-VERIFY-MESSAGE-INITIALIZE-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CANCEL_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CANCEL-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CANCEL_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CANCEL-MESSAGE-INSTANCE");

    static private final SubLList $list_alt453 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("CANCEL")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_CANCEL_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-CANCEL-MESSAGE-INITIALIZE-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXECUTE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXECUTE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXECUTE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXECUTE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt459 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("EXECUTE")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $EXECUTE = makeKeyword("EXECUTE");

    private static final SubLSymbol CYBLACK_EXECUTE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXECUTE-MESSAGE-INITIALIZE-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TERMINATE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TERMINATE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TERMINATE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TERMINATE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt465 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("TERMINATE")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $TERMINATE = makeKeyword("TERMINATE");

    private static final SubLSymbol CYBLACK_TERMINATE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-TERMINATE-MESSAGE-INITIALIZE-METHOD");



    static private final SubLList $list_alt469 = list(new SubLObject[]{ list(makeSymbol("EVENT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-CONTENTS"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EVENT-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EVENT-TYPE"), list(makeSymbol("NEW-EVENT-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt473 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("STATE-CHANGE")), list(makeSymbol("CSETQ"), makeSymbol("EVENT-TYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym474$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    private static final SubLSymbol $STATE_CHANGE = makeKeyword("STATE-CHANGE");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt477 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTIFIED-CONTENTS"), NIL), makeSymbol("DATATYPE"), makeSymbol("DATATYPE-NAME")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("ELEMENT"))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE"), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), makeSymbol("DATATYPE"))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("DATATYPE-NAME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PLISTIFY"), makeSymbol("OBJECT")), makeSymbol("ELEMENT"))), makeSymbol("LISTIFIED-CONTENTS"))))))), list(RET, list(makeSymbol("LIST*"), list(makeSymbol("NREVERSE"), makeSymbol("LISTIFIED-CONTENTS")), makeKeyword("CONTENTS"), makeSymbol("EVENT-TYPE"), makeKeyword("ET"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER"))))));

    static private final SubLSymbol $sym478$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    private static final SubLSymbol $ET = makeKeyword("ET");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt481 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :ET ~S :CONTENTS "), makeSymbol("EVENT-TYPE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRINT-CONTENTS")), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym482$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    static private final SubLString $str_alt483$__ET__S__CONTENTS_ = makeString(" :ET ~S :CONTENTS ");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLSymbol $sym485$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_PRINT_CONTENTS_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-PRINT-CONTENTS-METHOD");

    static private final SubLList $list_alt487 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-EVENT-TYPE"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("ET"))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("CONTENTS"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_EVENT_TYPE = makeSymbol("GET-EVENT-TYPE");

    static private final SubLList $list_alt490 = list(list(RET, makeSymbol("EVENT-TYPE")));

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_GET_EVENT_TYPE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-GET-EVENT-TYPE-METHOD");

    private static final SubLSymbol SET_EVENT_TYPE = makeSymbol("SET-EVENT-TYPE");

    static private final SubLList $list_alt493 = list(makeSymbol("NEW-EVENT-TYPE"));

    static private final SubLList $list_alt494 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-EVENT-TYPE-P"), makeSymbol("NEW-EVENT-TYPE")), makeString("(SET-EVENT-TYPE ~S): ~S is not a member of the CYBLACK-EVENT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-EVENT-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("EVENT-TYPE"), makeSymbol("NEW-EVENT-TYPE")), list(RET, makeSymbol("NEW-EVENT-TYPE")));

    static private final SubLSymbol $sym495$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    static private final SubLString $str_alt496$_SET_EVENT_TYPE__S____S_is_not_a_ = makeString("(SET-EVENT-TYPE ~S): ~S is not a member of the CYBLACK-EVENT-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_SET_EVENT_TYPE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-SET-EVENT-TYPE-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-GET-CONTENTS-METHOD");

    static private final SubLList $list_alt499 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COPIED-CONTENTS"), list(makeSymbol("FIF"), list(makeSymbol("CONSP"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-CONTENTS")), makeSymbol("NEW-CONTENTS")))), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), makeSymbol("COPIED-CONTENTS")), list(RET, makeSymbol("NEW-CONTENTS"))));

    static private final SubLSymbol $sym500$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_MESSAGE_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-MESSAGE-SET-CONTENTS-METHOD");

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE = makeSymbol("CYBLACK-RECEIVE-MESSAGE");

    static private final SubLList $list_alt503 = list(list(makeSymbol("CAUSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CAUSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CAUSE"), list(makeSymbol("NEW-CAUSE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RECEIVE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RECEIVE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RECEIVE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RECEIVE-MESSAGE-INSTANCE");



    static private final SubLList $list_alt508 = list(list(RET, makeSymbol("CAUSE")));

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE_GET_CAUSE_METHOD = makeSymbol("CYBLACK-RECEIVE-MESSAGE-GET-CAUSE-METHOD");

    private static final SubLSymbol SET_CAUSE = makeSymbol("SET-CAUSE");

    static private final SubLList $list_alt511 = list(makeSymbol("NEW-CAUSE"));

    static private final SubLList $list_alt512 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CAUSE")), list(makeSymbol("CYBLACK-TRANSMIT-MESSAGE-P"), makeSymbol("NEW-CAUSE"))), makeString("(SET-CAUSE ~S): ~S is not an instance of CYBLACK-TRANSMIT-MESSAGE."), makeSymbol("SELF"), makeSymbol("NEW-CAUSE")), list(makeSymbol("CSETQ"), makeSymbol("CAUSE"), makeSymbol("NEW-CAUSE")), list(RET, makeSymbol("NEW-CAUSE")));

    static private final SubLSymbol $sym513$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RECEIVE-MESSAGE-METHOD");

    static private final SubLString $str_alt514$_SET_CAUSE__S____S_is_not_an_inst = makeString("(SET-CAUSE ~S): ~S is not an instance of CYBLACK-TRANSMIT-MESSAGE.");

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE_SET_CAUSE_METHOD = makeSymbol("CYBLACK-RECEIVE-MESSAGE-SET-CAUSE-METHOD");

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE_GET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-RECEIVE-MESSAGE-GET-EXTERNAL-MODULE-NAME-METHOD");

    static private final SubLList $list_alt517 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EXTERNAL-MODULE-NAME"))), makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-NAME")));

    static private final SubLSymbol $sym518$OUTER_CATCH_FOR_CYBLACK_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RECEIVE-MESSAGE-METHOD");

    static private final SubLString $str_alt519$_SET_EXTERNAL_MODULE_NAME__S____S = makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.");

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE_SET_EXTERNAL_MODULE_NAME_METHOD = makeSymbol("CYBLACK-RECEIVE-MESSAGE-SET-EXTERNAL-MODULE-NAME-METHOD");



    static private final SubLList $list_alt522 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_RECEIVE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-RECEIVE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE = makeSymbol("CYBLACK-ACCEPT-MESSAGE");

    static private final SubLList $list_alt525 = list(list(makeSymbol("PRECONDITION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACCEPT_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACCEPT-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACCEPT_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACCEPT-MESSAGE-INSTANCE");

    static private final SubLList $list_alt529 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("ACCEPT")), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("SELF"), makeString("")), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt532 = list(list(RET, list(makeSymbol("LIST*"), list(makeSymbol("FIF"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-UNPARSED-PATTERN"))), NIL), makeKeyword("PRECON"), makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("EMNAME"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym533$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACCEPT-MESSAGE-METHOD");

    private static final SubLSymbol GET_UNPARSED_PATTERN = makeSymbol("GET-UNPARSED-PATTERN");

    private static final SubLSymbol $PRECON = makeKeyword("PRECON");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt537 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :EMNAME ~S :PRECON ~S"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("PRECONDITION-PATTERN")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym538$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACCEPT-MESSAGE-METHOD");

    static private final SubLString $str_alt539$__EMNAME__S__PRECON__S = makeString(" :EMNAME ~S :PRECON ~S");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt541 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-ACCEPT-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-EXTERNAL-MODULE-NAME"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("EMNAME"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("PRECON"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt544 = list(list(RET, makeSymbol("PRECONDITION-PATTERN")));

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_GET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-GET-PRECONDITION-PATTERN-METHOD");



    static private final SubLList $list_alt547 = list(makeSymbol("NEW-PRECONDITION-PATTERN"));

    static private final SubLList $list_alt548 = list(list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN")));

    static private final SubLSymbol $sym549$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACCEPT-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-SET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt551 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): Cannot execute message with no associated application."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("KSB"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY")))), list(makeSymbol("NEW-KNOWLEDGE-SOURCE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KSB"), list(QUOTE, makeSymbol("KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID")), makeSymbol("TRANSACTION-ID"))), list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("FIF"), makeSymbol("NEW-KNOWLEDGE-SOURCE"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("NEW-KNOWLEDGE-SOURCE"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): Received an accept message for unknown transaction ID:~% ~S."), makeSymbol("SELF"), makeSymbol("TRANSACTION-ID")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-KS-SET-APPLICATION"), makeSymbol("NEW-KNOWLEDGE-SOURCE"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-KS-SET-PRECONDITION-PATTERN"), makeSymbol("NEW-KNOWLEDGE-SOURCE"), makeSymbol("PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD"), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE-ID")), list(makeSymbol("CYBLACK-GUID-MANAGER-INTERN-METHOD"), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE-ID"), NIL, makeSymbol("EXTERNAL-MODULE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("LINK-TO-PANELS-CALLBACK")), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")) }));

    static private final SubLSymbol $sym552$OUTER_CATCH_FOR_CYBLACK_ACCEPT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACCEPT-MESSAGE-METHOD");

    static private final SubLString $str_alt553$_EXECUTE__S___Cannot_execute_mess = makeString("(EXECUTE ~S): Cannot execute message with no associated application.");



    private static final SubLSymbol KNOWLEDGE_SOURCE_GIVEN_INVITATION_TRANSACTION_ID = makeSymbol("KNOWLEDGE-SOURCE-GIVEN-INVITATION-TRANSACTION-ID");

    static private final SubLString $str_alt556$_EXECUTE__S___Received_an_accept_ = makeString("(EXECUTE ~S): Received an accept message for unknown transaction ID:~% ~S.");

    private static final SubLSymbol LINK_TO_PANELS_CALLBACK = makeSymbol("LINK-TO-PANELS-CALLBACK");

    private static final SubLSymbol CYBLACK_ACCEPT_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-ACCEPT-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE");

    static private final SubLSymbol $sym560$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-CLASS");

    static private final SubLSymbol $sym561$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-INSTANCE");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLSymbol $sym563$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLSymbol $sym565$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt567 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-PROPID"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("PROPID"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_GET_PROPID_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-GET-PROPID-METHOD");

    static private final SubLSymbol $sym570$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_SET_PROPID_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-SET-PROPID-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_RECEIVE_MESSAGE_GET_ALL_IDS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-RECEIVE-MESSAGE-GET-ALL-IDS-METHOD");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE = makeSymbol("CYBLACK-DECLINE-MESSAGE");

    static private final SubLList $list_alt574 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DECLINE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DECLINE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DECLINE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DECLINE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt577 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("DECLINE")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $DECLINE = makeKeyword("DECLINE");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DECLINE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt580 = list(list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("PROPID"), makeString("(EXECUTE ~S): No proposal id is associated with this message."), makeSymbol("SELF")), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-COMMON-IDS-METHOD"), makeSymbol("MESSAGE-BROKER"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), makeSymbol("PROPID"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-SPECIFIC-ID-METHOD"), makeSymbol("MESSAGE-BROKER"), makeSymbol("PROPID"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLSymbol $sym581$OUTER_CATCH_FOR_CYBLACK_DECLINE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DECLINE-MESSAGE-METHOD");

    static private final SubLString $str_alt582$_EXECUTE__S___No_message_broker_i = makeString("(EXECUTE ~S): No message broker is associated with this message.");

    static private final SubLString $str_alt583$_EXECUTE__S___No_proposal_id_is_a = makeString("(EXECUTE ~S): No proposal id is associated with this message.");

    private static final SubLSymbol CYBLACK_DECLINE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-DECLINE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE");

    static private final SubLList $list_alt586 = list(list(makeSymbol("CONF"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONF"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONF"), list(makeSymbol("NEW-CONF")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym588$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-CLASS");

    static private final SubLSymbol $sym589$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt590 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-CONF"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt592 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("CONF"), $CONF, list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym593$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-METHOD");



    static private final SubLSymbol $sym595$CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_TO_REVERSED_LIST_MET = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt596 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :CONF ~S"), makeSymbol("CONF")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym597$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-METHOD");

    static private final SubLString $str_alt598$__CONF__S = makeString(" :CONF ~S");

    static private final SubLSymbol $sym599$CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_PRINT_TAIL_PART_METH = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt600 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-CONF"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), $CONF)), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_CONF = makeSymbol("GET-CONF");

    static private final SubLList $list_alt603 = list(list(RET, makeSymbol("CONF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_GET_CONF_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-GET-CONF-METHOD");

    private static final SubLSymbol SET_CONF = makeSymbol("SET-CONF");

    static private final SubLList $list_alt606 = list(makeSymbol("NEW-CONF"));

    static private final SubLList $list_alt607 = list(list(makeSymbol("CSETQ"), makeSymbol("CONF"), makeSymbol("NEW-CONF")), list(RET, makeSymbol("NEW-CONF")));

    static private final SubLSymbol $sym608$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_METH = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_RECEIVE_MESSAGE_SET_CONF_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-RECEIVE-MESSAGE-SET-CONF-METHOD");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE");

    static private final SubLList $list_alt611 = list(list(makeSymbol("TYPE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-STRING"), list(makeSymbol("NEW-TYPE-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym612$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REQUEST_CONTENTS_MESSAGE_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REQUEST-CONTENTS-MESSAGE-CLASS");

    static private final SubLSymbol $sym613$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REQUEST_CONTENTS_MESSAGE_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REQUEST-CONTENTS-MESSAGE-INSTANCE");

    static private final SubLList $list_alt614 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("REQUEST-CONTENTS")), list(makeSymbol("SET-TYPE-STRING"), makeSymbol("SELF"), makeString("POSTING")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $REQUEST_CONTENTS = makeKeyword("REQUEST-CONTENTS");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt617 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("TYPE-STRING"), $TYPE, list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym618$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REQUEST-CONTENTS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt620 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :TYPE ~S"), makeSymbol("TYPE-STRING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym621$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REQUEST-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt622$__TYPE__S = makeString(" :TYPE ~S");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt624 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-ARG-KEY-TYPE-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-TYPE-STRING"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), $TYPE)), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_GET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-GET-TYPE-STRING-METHOD");

    static private final SubLSymbol $sym627$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REQUEST-CONTENTS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_SET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-SET-TYPE-STRING-METHOD");

    static private final SubLList $list_alt629 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-STRING")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~S is not a valid type string.  A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-STRING")), list(RET, NIL)), list(makeSymbol("PUNLESS"), makeSymbol("APPLICATION"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No application is associated with this message."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION"))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(makeSymbol("PUNLESS"), makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(RET, NIL)), list(makeSymbol("PUNLESS"), makeSymbol("BLACKBOARD"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("TYPE-STRING"))), list(makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("TYPE"), makeSymbol("BLACKBOARD")))), list(makeSymbol("PUNLESS"), makeSymbol("PANEL"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No panel is associated with datatype ~S."), makeSymbol("SELF"), makeSymbol("TYPE")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("PANEL-CONTENTS"), list(makeSymbol("CYBLACK-PANEL-GET-ALL-ACTIVE-POSTINGS"), makeSymbol("PANEL")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REPORT-CONTENTS"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("SELF"), makeSymbol("PANEL-CONTENTS"))))), list(RET, NIL));

    static private final SubLSymbol $sym630$OUTER_CATCH_FOR_CYBLACK_REQUEST_CONTENTS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REQUEST-CONTENTS-MESSAGE-METHOD");

    static private final SubLString $str_alt631$_EXECUTE__S____S_is_not_a_valid_t = makeString("(EXECUTE ~S): ~S is not a valid type string.  A string was expected.");

    static private final SubLString $str_alt632$_EXECUTE__S___No_application_is_a = makeString("(EXECUTE ~S): No application is associated with this message.");

    static private final SubLString $str_alt633$_EXECUTE__S___No_datatype_diction = makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S.");

    static private final SubLString $str_alt634$_EXECUTE__S___No_blackboard_is_as = makeString("(EXECUTE ~S): No blackboard is associated with application ~S.");

    static private final SubLString $str_alt635$_EXECUTE__S___No_panel_is_associa = makeString("(EXECUTE ~S): No panel is associated with datatype ~S.");

    private static final SubLSymbol CYBLACK_REQUEST_CONTENTS_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-REQUEST-CONTENTS-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE");

    static private final SubLList $list_alt638 = list(list(makeSymbol("CONTRIBUTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTRIBUTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTRIBUTIONS"), list(makeSymbol("NEW-CONTRIBUTIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONTRIBUTE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONTRIBUTE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONTRIBUTE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONTRIBUTE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt642 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("CONTRIBUTE")), list(makeSymbol("SET-CONTRIBUTIONS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt645 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("CONTRIBUTIONS"), makeKeyword("CONTR"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym646$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONTRIBUTE-MESSAGE-METHOD");

    private static final SubLSymbol $CONTR = makeKeyword("CONTR");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt649 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :CONTR ~S"), makeSymbol("CONTRIBUTIONS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym650$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONTRIBUTE-MESSAGE-METHOD");

    static private final SubLString $str_alt651$__CONTR__S = makeString(" :CONTR ~S");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt653 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-CONTRIBUTIONS"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("CONTR"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_CONTRIBUTIONS = makeSymbol("GET-CONTRIBUTIONS");

    static private final SubLList $list_alt656 = list(list(RET, makeSymbol("CONTRIBUTIONS")));

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_GET_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-GET-CONTRIBUTIONS-METHOD");

    private static final SubLSymbol SET_CONTRIBUTIONS = makeSymbol("SET-CONTRIBUTIONS");

    static private final SubLList $list_alt659 = list(makeSymbol("NEW-CONTRIBUTIONS"));

    static private final SubLList $list_alt660 = list(list(makeSymbol("CSETQ"), makeSymbol("CONTRIBUTIONS"), makeSymbol("NEW-CONTRIBUTIONS")), list(RET, makeSymbol("NEW-CONTRIBUTIONS")));

    static private final SubLSymbol $sym661$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONTRIBUTE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_SET_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-SET-CONTRIBUTIONS-METHOD");

    static private final SubLList $list_alt663 = list(list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("PROPID"), makeString("(EXECUTE ~S): No proposal id is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-MANAGER"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"))), list(makeSymbol("PROPOSAL"), list(makeSymbol("FIF"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPID")), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No knowledge source is associated with this message."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("PROPOSAL"), list(makeSymbol("CYBLACK-KS-POST-AT-WILL-P"), makeSymbol("KNOWLEDGE-SOURCE"))), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): Could not find the proposal associated with propid ~S."), makeSymbol("SELF"), makeSymbol("PROPID")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("GET-APPLICATION"))))), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): No application is associated with the knowledge source ~S."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-DATATYPE-DICTIONARY")))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD")))), list(makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-AGENDA"))))), list(makeSymbol("MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(EXECUTE ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("MUST"), makeSymbol("BLACKBOARD"), makeString("(EXECUTE ~S): No blackboard is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("MUST"), makeSymbol("AGENDA"), makeString("(EXECUTE ~S): No agenda is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("FIF"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("NEW-KSI"))), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-KSI"))))), list(makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FIF"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GET-ACTIVATION-PATTERN"))), NIL)), list(makeSymbol("POSTING-DATATYPE"), NIL), list(makeSymbol("NEW-POSTING"), NIL), list(makeSymbol("POSTING-LIST"), NIL)), list(makeSymbol("CYBLACK-BASIC-KSI-SET-ACTIVATION-PATTERN-METHOD"), makeSymbol("KSI"), list(makeSymbol("FIF"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERN"), list(QUOTE, makeSymbol("CLONE"))), NIL)), list(makeSymbol("CYBLACK-KSI-SET-APPLICATION"), makeSymbol("KSI"), makeSymbol("APPLICATION")), list(makeSymbol("PCOND"), list(list(makeSymbol("CNOT"), list(makeSymbol("LISTP"), makeSymbol("CONTRIBUTIONS"))), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): The contribution list ~S is not a valid contribution list."), makeSymbol("SELF"), makeSymbol("CONTRIBUTIONS")), list(makeSymbol("CSETQ"), makeSymbol("CONTRIBUTIONS"), NIL)), list(list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("CONTRIBUTIONS")), list(makeSymbol("STRINGP"), list(makeSymbol("CAR"), makeSymbol("CONTRIBUTIONS")))), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~S is not a list of contributions.  I am assuming that you meant (~S)."), makeSymbol("SELF"), makeSymbol("CONTRIBUTIONS")), list(makeSymbol("CSETQ"), makeSymbol("CONTRIBUTIONS"), list(makeSymbol("LIST"), makeSymbol("CONTRIBUTIONS")))), list(list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("CONTRIBUTIONS")), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("CONTRIBUTIONS")), list(makeSymbol("CONSP"), list(makeSymbol("CAR"), makeSymbol("CONTRIBUTIONS"))), list(makeSymbol("STRINGP"), list(makeSymbol("CAAR"), makeSymbol("CONTRIBUTIONS")))))), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~S is not a valid contribution list.  I will ignore its contents."), makeSymbol("SELF"), makeSymbol("CONTRIBUTIONS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CONTRIBUTION"), makeSymbol("CONTRIBUTIONS")), list(new SubLObject[]{ makeSymbol("CDESTRUCTURING-BIND"), cons(makeSymbol("DATATYPE-STRING"), makeSymbol("PROPERTIES")), makeSymbol("CONTRIBUTION"), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("DATATYPE-STRING")), makeString("(EXECUTE ~S): ~S is not a valid datatype string."), makeSymbol("SELF"), makeSymbol("DATATYPE-STRING")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-DICTIONARY"), list(QUOTE, makeSymbol("INTERN")), makeSymbol("DATATYPE-STRING"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-DATATYPE"), list(QUOTE, makeSymbol("CREATE-POSTING")))), list(makeSymbol("MUST"), makeSymbol("NEW-POSTING"), makeString("(EXECUTE ~S): Unable to create a posting for datatype ~S."), makeSymbol("SELF"), makeSymbol("POSTING-DATATYPE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("ASSIMILATE")), makeSymbol("PROPERTIES")), list(makeSymbol("CPUSH"), makeSymbol("NEW-POSTING"), makeSymbol("POSTING-LIST")) })), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("POSTING-LIST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-KSI")), makeSymbol("KSI")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-ACTIVATION-PATTERN")), list(makeSymbol("FIF"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERN"), list(QUOTE, makeSymbol("CLONE"))), NIL)), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("SET-DATATYPE")), makeSymbol("POSTING-DATATYPE"))), list(makeSymbol("CYBLACK-EXTERNAL-KSI-SET-POSTINGS-METHOD"), makeSymbol("KSI"), list(makeSymbol("NREVERSE"), makeSymbol("POSTING-LIST"))), list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("ADD-EXECUTABLE-KSI")), makeSymbol("KSI")) })))), list(RET, NIL));

    static private final SubLSymbol $sym664$OUTER_CATCH_FOR_CYBLACK_CONTRIBUTE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONTRIBUTE-MESSAGE-METHOD");

    static private final SubLString $str_alt665$_EXECUTE__S___No_knowledge_source = makeString("(EXECUTE ~S): No knowledge source is associated with this message.");

    static private final SubLString $str_alt666$_EXECUTE__S___Could_not_find_the_ = makeString("(EXECUTE ~S): Could not find the proposal associated with propid ~S.");



    static private final SubLString $str_alt668$_EXECUTE__S___No_application_is_a = makeString("(EXECUTE ~S): No application is associated with the knowledge source ~S.");



    static private final SubLString $str_alt670$_EXECUTE__S___No_datatype_diction = makeString("(EXECUTE ~S): No datatype dictionary is associated with the application ~S.");

    static private final SubLString $str_alt671$_EXECUTE__S___No_blackboard_is_as = makeString("(EXECUTE ~S): No blackboard is associated with the application ~S.");

    static private final SubLString $str_alt672$_EXECUTE__S___No_agenda_is_associ = makeString("(EXECUTE ~S): No agenda is associated with the application ~S.");



    private static final SubLSymbol CYBLACK_EXTERNAL_KSI = makeSymbol("CYBLACK-EXTERNAL-KSI");



    static private final SubLString $str_alt676$_EXECUTE__S___The_contribution_li = makeString("(EXECUTE ~S): The contribution list ~S is not a valid contribution list.");

    static private final SubLString $str_alt677$_EXECUTE__S____S_is_not_a_list_of = makeString("(EXECUTE ~S): ~S is not a list of contributions.  I am assuming that you meant (~S).");

    static private final SubLString $str_alt678$_EXECUTE__S____S_is_not_a_valid_c = makeString("(EXECUTE ~S): ~S is not a valid contribution list.  I will ignore its contents.");

    static private final SubLList $list_alt679 = cons(makeSymbol("DATATYPE-STRING"), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt680$_EXECUTE__S____S_is_not_a_valid_d = makeString("(EXECUTE ~S): ~S is not a valid datatype string.");





    static private final SubLString $str_alt683$_EXECUTE__S___Unable_to_create_a_ = makeString("(EXECUTE ~S): Unable to create a posting for datatype ~S.");









    private static final SubLSymbol ADD_EXECUTABLE_KSI = makeSymbol("ADD-EXECUTABLE-KSI");

    private static final SubLSymbol CYBLACK_CONTRIBUTE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-CONTRIBUTE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE");

    static private final SubLList $list_alt691 = list(list(makeSymbol("EXCUSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXCUSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXCUSES"), list(makeSymbol("NEW-EXCUSES")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym693$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-CLASS");

    static private final SubLSymbol $sym694$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt695 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-EXCUSES"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt697 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("EXCUSES"), makeKeyword("EXCUSES"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym698$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol $EXCUSES = makeKeyword("EXCUSES");

    static private final SubLSymbol $sym700$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_TO_REVERSED_LIST_ = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt701 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :EXCUSES ~S"), makeSymbol("EXCUSES")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym702$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-METHOD");

    static private final SubLString $str_alt703$__EXCUSES__S = makeString(" :EXCUSES ~S");

    static private final SubLSymbol $sym704$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_PRINT_TAIL_PART_M = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt705 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-EXCUSES"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("EXCUSES"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_EXCUSES = makeSymbol("GET-EXCUSES");

    static private final SubLList $list_alt708 = list(list(RET, makeSymbol("EXCUSES")));

    static private final SubLSymbol $sym709$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_GET_EXCUSES_METHO = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-GET-EXCUSES-METHOD");

    private static final SubLSymbol SET_EXCUSES = makeSymbol("SET-EXCUSES");

    static private final SubLList $list_alt711 = list(makeSymbol("NEW-EXCUSES"));

    static private final SubLList $list_alt712 = list(list(makeSymbol("CSETQ"), makeSymbol("EXCUSES"), makeSymbol("NEW-EXCUSES")), list(RET, makeSymbol("NEW-EXCUSES")));

    static private final SubLSymbol $sym713$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_M = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-METHOD");

    static private final SubLSymbol $sym714$CYBLACK_EMBEDDED_PROPID_EXCUSES_RECEIVE_MESSAGE_SET_EXCUSES_METHO = makeSymbol("CYBLACK-EMBEDDED-PROPID-EXCUSES-RECEIVE-MESSAGE-SET-EXCUSES-METHOD");

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE = makeSymbol("CYBLACK-REVOKE-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REVOKE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REVOKE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REVOKE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REVOKE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt718 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("REVOKE")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $REVOKE = makeKeyword("REVOKE");

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REVOKE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt721 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): No application is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("PROPID"), makeString("(EXECUTE ~S): No proposal ID is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-AGENDA")))), list(makeSymbol("GUID-MANAGER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD"), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("MUST"), makeSymbol("AGENDA"), makeString("(EXECUTE ~S): No agenda is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("MUST"), makeSymbol("GUID-MANAGER"), makeString("(EXECUTE ~S): No guid-manager is associated with the message broker ~S."), makeSymbol("SELF"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("PROPOSAL"), list(makeSymbol("FIF"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPID")), NIL))), list(makeSymbol("PIF"), makeSymbol("PROPOSAL"), list(makeSymbol("PROGN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("RETRACT")), makeSymbol("PROPOSAL")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("REMOVE-ACTIVE-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): Received a REVOKE message without a corresponding proposal."), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-COMMON-IDS-METHOD"), makeSymbol("MESSAGE-BROKER"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MESSAGE-BROKER-EXPUNGE-SPECIFIC-ID-METHOD"), makeSymbol("MESSAGE-BROKER"), makeSymbol("PROPID"), makeSymbol("SELF")), list(RET, T))));

    static private final SubLSymbol $sym722$OUTER_CATCH_FOR_CYBLACK_REVOKE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REVOKE-MESSAGE-METHOD");

    static private final SubLString $str_alt723$_EXECUTE__S___No_proposal_ID_is_a = makeString("(EXECUTE ~S): No proposal ID is associated with this message.");

    static private final SubLString $str_alt724$_EXECUTE__S___No_guid_manager_is_ = makeString("(EXECUTE ~S): No guid-manager is associated with the message broker ~S.");



    private static final SubLSymbol REMOVE_ACTIVE_PROPOSAL = makeSymbol("REMOVE-ACTIVE-PROPOSAL");

    static private final SubLString $str_alt727$_EXECUTE__S___Received_a_REVOKE_m = makeString("(EXECUTE ~S): Received a REVOKE message without a corresponding proposal.");

    private static final SubLSymbol CYBLACK_REVOKE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-REVOKE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE");

    static private final SubLList $list_alt730 = list(list(makeSymbol("REASONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REASONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REASONS"), list(makeSymbol("NEW-REASONS")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym732$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-CLASS");

    static private final SubLSymbol $sym733$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt734 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-REASONS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym735$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_INITIALIZE_M = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt736 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("REASONS"), makeKeyword("REASONS"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym737$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol $REASONS = makeKeyword("REASONS");

    static private final SubLSymbol $sym739$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_TO_REVERSED_ = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt740 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :REASONS ~S"), makeSymbol("REASONS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym741$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-METHOD");

    static private final SubLString $str_alt742$__REASONS__S = makeString(" :REASONS ~S");

    static private final SubLSymbol $sym743$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_PRINT_TAIL_P = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt744 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-REASONS"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("REASONS"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym745$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_PARSE_ARGS_M = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt747 = list(list(RET, makeSymbol("REASONS")));

    static private final SubLSymbol $sym748$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_GET_REASONS_ = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-GET-REASONS-METHOD");



    static private final SubLList $list_alt750 = list(makeSymbol("NEW-REASONS"));

    static private final SubLList $list_alt751 = list(list(makeSymbol("CSETQ"), makeSymbol("REASONS"), makeSymbol("NEW-REASONS")), list(RET, makeSymbol("NEW-REASONS")));

    static private final SubLSymbol $sym752$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESS = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-METHOD");

    static private final SubLSymbol $sym753$CYBLACK_EMBEDDED_PROPID_CONF_REASONS_RECEIVE_MESSAGE_SET_REASONS_ = makeSymbol("CYBLACK-EMBEDDED-PROPID-CONF-REASONS-RECEIVE-MESSAGE-SET-REASONS-METHOD");

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE = makeSymbol("CYBLACK-PROPOSE-MESSAGE");

    static private final SubLList $list_alt755 = list(list(makeSymbol("DATATYPE-BAG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-BAG"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE-BAG"), list(makeSymbol("NEW-DATATYPE-BAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROPOSE_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROPOSE-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROPOSE_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROPOSE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt759 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("PROPOSE")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt762 = list(list(RET, list(makeSymbol("LIST*"), makeSymbol("DATATYPE-BAG"), makeKeyword("DTBAG"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym763$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROPOSE-MESSAGE-METHOD");

    private static final SubLSymbol $DTBAG = makeKeyword("DTBAG");

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt766 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :DTBAG ~S"), makeSymbol("DATATYPE-BAG")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym767$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROPOSE-MESSAGE-METHOD");

    static private final SubLString $str_alt768$__DTBAG__S = makeString(" :DTBAG ~S");

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt770 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSE-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CLET"), list(list(makeSymbol("BAG"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("DTBAG"))), list(makeSymbol("BASIC-BAG"), list(makeSymbol("CYBLACK-LISTIFIED-DT-BAG-TO-TRUE-DT-BAG"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")), makeSymbol("BAG")))), list(makeSymbol("SET-DATATYPE-BAG"), makeSymbol("SELF"), makeSymbol("BASIC-BAG"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt773 = list(list(RET, makeSymbol("DATATYPE-BAG")));

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_GET_DATATYPE_BAG_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-GET-DATATYPE-BAG-METHOD");

    private static final SubLSymbol SET_DATATYPE_BAG = makeSymbol("SET-DATATYPE-BAG");

    static private final SubLList $list_alt776 = list(makeSymbol("NEW-DATATYPE-BAG"));

    static private final SubLList $list_alt777 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("LISTP"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-DATATYPE-BAG"))), makeString("(SET-DATATYPE-BAG ~S): ~S is neither an instance of LIST or BASIC-BAG."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-BAG"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("BASIC-BAG"), makeSymbol("NEW")), list(QUOTE, makeSymbol("BASIC-BAG"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-BAG")), makeSymbol("NEW-BAG"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), makeSymbol("NEW-BAG")))), list(list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), makeSymbol("NEW-DATATYPE-BAG"))), list(T, list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), NIL))), list(RET, makeSymbol("NEW-DATATYPE-BAG")));

    static private final SubLSymbol $sym778$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROPOSE-MESSAGE-METHOD");

    static private final SubLString $str_alt779$_SET_DATATYPE_BAG__S____S_is_neit = makeString("(SET-DATATYPE-BAG ~S): ~S is neither an instance of LIST or BASIC-BAG.");



    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_SET_DATATYPE_BAG_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-SET-DATATYPE-BAG-METHOD");

    static private final SubLList $list_alt782 = list(list(makeSymbol("MUST"), makeSymbol("KNOWLEDGE-SOURCE"), makeString("(EXECUTE ~S): No knowledge source is associated with this proposal message."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-PROPOSAL-CALLBACK"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym783$OUTER_CATCH_FOR_CYBLACK_PROPOSE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROPOSE-MESSAGE-METHOD");

    static private final SubLString $str_alt784$_EXECUTE__S___No_knowledge_source = makeString("(EXECUTE ~S): No knowledge source is associated with this proposal message.");

    private static final SubLSymbol CYBLACK_PROPOSE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-PROPOSE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE = makeSymbol("CYBLACK-AFFIRM-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_AFFIRM_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-AFFIRM-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_AFFIRM_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-AFFIRM-MESSAGE-INSTANCE");

    static private final SubLList $list_alt789 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("AFFIRM")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $AFFIRM = makeKeyword("AFFIRM");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt792 = list(list(RET, list(new SubLObject[]{ makeSymbol("LIST*"), makeSymbol("REASONS"), makeKeyword("REASONS"), makeSymbol("DATATYPE-BAG"), makeKeyword("DT-BAG"), makeSymbol("CONF"), $CONF, makeSymbol("PROPID"), makeKeyword("PROPID"), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")) })));

    static private final SubLSymbol $sym793$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-AFFIRM-MESSAGE-METHOD");

    private static final SubLSymbol $DT_BAG = makeKeyword("DT-BAG");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt796 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PROPID ~S"), makeSymbol("PROPID")), list(makeSymbol("PWHEN"), makeSymbol("CONF"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :CONF ~S"), makeSymbol("CONF"))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :DTBAG ~S"), makeSymbol("DATATYPE-BAG"))), list(makeSymbol("PWHEN"), makeSymbol("REASONS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :REASONS ~S"), makeSymbol("REASONS"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym797$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-AFFIRM-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt799 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-AFFIRM-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-DATATYPE-BAG"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("DTBAG"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_GET_DATATYPE_BAG_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-GET-DATATYPE-BAG-METHOD");

    static private final SubLList $list_alt802 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("LISTP"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-DATATYPE-BAG"))), makeString("(SET-DATATYPE-BAG ~S): ~S is neither an instance of LIST or BASIC-BAG."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-BAG"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("BASIC-BAG"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-BAG")), makeSymbol("NEW-BAG"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), makeSymbol("NEW-BAG")))), list(list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-DATATYPE-BAG")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), makeSymbol("NEW-DATATYPE-BAG"))), list(T, list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-BAG"), NIL))), list(RET, makeSymbol("NEW-DATATYPE-BAG")));

    static private final SubLSymbol $sym803$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-AFFIRM-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_SET_DATATYPE_BAG_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-SET-DATATYPE-BAG-METHOD");

    static private final SubLList $list_alt805 = list(list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF"))), list(makeSymbol("GUID-MANAGER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD"), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("MUST"), makeSymbol("GUID-MANAGER"), makeString("(EXECUTE ~S): No guid manager is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("PROPID"), makeString("(EXECUTE ~S): No proposal id is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("PROPOSAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REFERENCE"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("PROPID")))), list(makeSymbol("PUNLESS"), makeSymbol("PROPOSAL"), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): No proposal is associated with the proposal id ~S."), makeSymbol("SELF"), makeSymbol("PROPID")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("SUSPENDED-PROPOSALS-LIST"), list(makeSymbol("CYBLACK-AGENDA-GET-SUSPENDED-PROPOSALS"), makeSymbol("AGENDA")))), list(makeSymbol("MUST"), makeSymbol("SUSPENDED-PROPOSALS-LIST"), makeString("(EXECUTE ~S): No suspended proposal queue is associated with the agenda of the proposal ~S."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("CYBLACK-EXTERNAL-PROPOSAL")), makeSymbol("PROPOSAL"), makeSymbol("SUSPENDED-PROPOSALS-LIST"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CONFIRM"), makeSymbol("CYBLACK-EXTERNAL-PROPOSAL")), makeSymbol("PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVE-PROPOSALS-QUEUE"), list(makeSymbol("CYBLACK-AGENDA-GET-ACTIVE-PROPOSALS"), makeSymbol("AGENDA")))), list(makeSymbol("MUST"), makeSymbol("ACTIVE-PROPOSALS-QUEUE"), makeString("(EXECUTE ~S): No active proposal queue is associated with the agenda of proposal ~S."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("ACTIVE-PROPOSALS-QUEUE"), makeSymbol("PROPOSAL"))))), list(RET, NIL)));

    static private final SubLSymbol $sym806$OUTER_CATCH_FOR_CYBLACK_AFFIRM_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-AFFIRM-MESSAGE-METHOD");

    static private final SubLString $str_alt807$_EXECUTE__S___No_guid_manager_is_ = makeString("(EXECUTE ~S): No guid manager is associated with this message.");

    static private final SubLString $str_alt808$_EXECUTE__S___No_proposal_is_asso = makeString("(EXECUTE ~S): No proposal is associated with the proposal id ~S.");

    static private final SubLString $str_alt809$_EXECUTE__S___No_suspended_propos = makeString("(EXECUTE ~S): No suspended proposal queue is associated with the agenda of the proposal ~S.");

    static private final SubLString $str_alt810$_EXECUTE__S___No_active_proposal_ = makeString("(EXECUTE ~S): No active proposal queue is associated with the agenda of proposal ~S.");

    private static final SubLSymbol CYBLACK_AFFIRM_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-AFFIRM-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE");

    static private final SubLSymbol $sym813$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-CLASS");

    static private final SubLSymbol $sym814$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-INSTANCE");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLSymbol $sym816$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt818 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :EXCUSES ~S"), makeSymbol("EXCUSES")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym819$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt821 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-EXCUSES"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("EXCUSES"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_GET_EXCUSES_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-GET-EXCUSES-METHOD");

    static private final SubLSymbol $sym824$OUTER_CATCH_FOR_CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_EMBEDDED_EXCUSES_RECEIVE_MESSAGE_SET_EXCUSES_METHOD = makeSymbol("CYBLACK-EMBEDDED-EXCUSES-RECEIVE-MESSAGE-SET-EXCUSES-METHOD");

    private static final SubLSymbol CYBLACK_REJECT_MESSAGE = makeSymbol("CYBLACK-REJECT-MESSAGE");

    static private final SubLList $list_alt827 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REJECT_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REJECT-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REJECT_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REJECT-MESSAGE-INSTANCE");

    static private final SubLList $list_alt830 = list(makeKeyword("NO-MEMBERS-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt831 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("REJECT")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol CYBLACK_REJECT_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REJECT-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt834 = list(list(makeSymbol("FORCE-OUTPUT"), T), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-REJECT-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(RET, list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS"))));

    private static final SubLSymbol CYBLACK_REJECT_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-REJECT-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt836 = list(list(makeSymbol("MUST"), makeSymbol("EXTERNAL-MODULE-ID"), makeString("(EXECUTE ~S): No external module ID is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD"), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("CYBLACK-GUID-MANAGER-GET-REFERENCE-METHOD"), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE-ID")))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("SET-REJECTED")), T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("SET-REJECTION-EXCUSES")), makeSymbol("EXCUSES")), list(RET, T))))))), list(RET, NIL));

    static private final SubLSymbol $sym837$OUTER_CATCH_FOR_CYBLACK_REJECT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REJECT-MESSAGE-METHOD");

    static private final SubLString $str_alt838$_EXECUTE__S___No_external_module_ = makeString("(EXECUTE ~S): No external module ID is associated with this message.");

    private static final SubLSymbol SET_REJECTED = makeSymbol("SET-REJECTED");

    private static final SubLSymbol SET_REJECTION_EXCUSES = makeSymbol("SET-REJECTION-EXCUSES");

    private static final SubLSymbol CYBLACK_REJECT_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-REJECT-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE = makeSymbol("CYBLACK-ACQUIT-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACQUIT_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACQUIT-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ACQUIT_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ACQUIT-MESSAGE-INSTANCE");

    static private final SubLList $list_alt845 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("ACQUIT")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $ACQUIT = makeKeyword("ACQUIT");

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-ACQUIT-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt848 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-ACQUIT-MESSAGE-ARG-PLIST-P"), makeSymbol("MESSAGE-ARGS")), makeString("(PARSE-ARGS ~S): Argument list ~S contains invalid argument keys."), makeSymbol("SELF"), makeSymbol("MESSAGE-ARGS")), list(RET, list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS"))));

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ACQUIT-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt850 = list(list(makeSymbol("MUST"), makeSymbol("EXTERNAL-MODULE-ID"), makeString("(EXECUTE ~S): No external module ID is associated with this message."), makeSymbol("SELF")), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with this message."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("CYBLACK-MESSAGE-BROKER-GET-GUID-MANAGER-METHOD"), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("CLET"), list(list(makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("CYBLACK-GUID-MANAGER-GET-REFERENCE-METHOD"), makeSymbol("GUID-MANAGER"), makeSymbol("EXTERNAL-MODULE-ID")))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-MODULE"), list(makeSymbol("PWHEN"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("CYBLACK-KS-UNLINK-FROM-PANELS"), makeSymbol("KNOWLEDGE-SOURCE")), list(RET, T))))))), list(RET, NIL));

    static private final SubLSymbol $sym851$OUTER_CATCH_FOR_CYBLACK_ACQUIT_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ACQUIT-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ACQUIT_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-ACQUIT-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE = makeSymbol("CYBLACK-MODIFICATION-MESSAGE");

    static private final SubLList $list_alt854 = list(list(makeSymbol("EXECUTION-ERROR-MESSAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), list(makeSymbol("NEW-ERROR-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol EXECUTION_ERROR_MESSAGE = makeSymbol("EXECUTION-ERROR-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MODIFICATION_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MODIFICATION-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MODIFICATION_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MODIFICATION-MESSAGE-INSTANCE");

    static private final SubLList $list_alt858 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-ERROR-MESSAGE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym859$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MODIFICATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-MODIFICATION-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt861 = list(list(RET, list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS"))));

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-MODIFICATION-MESSAGE-PARSE-ARGS-METHOD");



    static private final SubLList $list_alt864 = list(list(RET, makeSymbol("EXECUTION-ERROR-MESSAGE")));

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE_GET_EXECUTION_ERROR_MESSAGE_METHOD = makeSymbol("CYBLACK-MODIFICATION-MESSAGE-GET-EXECUTION-ERROR-MESSAGE-METHOD");



    static private final SubLList $list_alt867 = list(makeSymbol("NEW-ERROR-MESSAGE"));

    static private final SubLList $list_alt868 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("STRINGP"), makeSymbol("EXECUTION-ERROR-MESSAGE")), list(makeSymbol("NULL"), makeSymbol("EXECUTION-ERROR-MESSAGE"))), makeString("(SET-EXECUTION-ERROR-MESSAGE ~S): ~S is not a valid error message.  A string or NIL was expected."), makeSymbol("SELF"), makeSymbol("NEW-ERROR-MESSAGE")), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-ERROR-MESSAGE"), makeSymbol("NEW-ERROR-MESSAGE")), list(RET, makeSymbol("NEW-ERROR-MESSAGE")));

    static private final SubLSymbol $sym869$OUTER_CATCH_FOR_CYBLACK_MODIFICATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MODIFICATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE_SET_EXECUTION_ERROR_MESSAGE_METHOD = makeSymbol("CYBLACK-MODIFICATION-MESSAGE-SET-EXECUTION-ERROR-MESSAGE-METHOD");

    static private final SubLList $list_alt871 = list(list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-P"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), NIL), list(RET, T)), list(makeSymbol("PROGN"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("Modification message can only me executed by dynamic cyblack applications.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL))), list(RET, NIL));

    static private final SubLString $str_alt872$Modification_message_can_only_me_ = makeString("Modification message can only me executed by dynamic cyblack applications.");

    static private final SubLString $str_alt873$_EXECUTE__S____A = makeString("(EXECUTE ~S): ~A");

    private static final SubLSymbol CYBLACK_MODIFICATION_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-MODIFICATION-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE");

    static private final SubLList $list_alt876 = list(list(makeSymbol("EMNAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EMNAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EMNAME"), list(makeSymbol("NEW-EMNAME")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym878$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-CLASS");

    static private final SubLSymbol $sym879$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-INSTANCE");

    static private final SubLList $list_alt880 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EMNAME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym881$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt883 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :EMNAME ~S"), makeSymbol("EMNAME")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym884$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-METHOD");

    static private final SubLString $str_alt885$__EMNAME__S = makeString(" :EMNAME ~S");

    static private final SubLSymbol $sym886$CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_PRINT_TAIL_PART_MET = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt887 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("LIST"), makeSymbol("EMNAME"), makeKeyword("EMNAME")), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym888$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-METHOD");

    static private final SubLSymbol $sym889$CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_TO_REVERSED_LIST_ME = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-TO-REVERSED-LIST-METHOD");

    static private final SubLList $list_alt890 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("SET-EMNAME"), makeSymbol("SELF"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("EMNAME"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-PARSE-ARGS-METHOD");

    private static final SubLSymbol GET_EMNAME = makeSymbol("GET-EMNAME");

    static private final SubLList $list_alt893 = list(list(RET, makeSymbol("EMNAME")));

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_GET_EMNAME_METHOD = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-GET-EMNAME-METHOD");

    private static final SubLSymbol SET_EMNAME = makeSymbol("SET-EMNAME");

    static private final SubLList $list_alt896 = list(makeSymbol("NEW-EMNAME"));

    static private final SubLList $list_alt897 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EMNAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-EMNAME"))), makeString("(SET-EMNAME ~S): ~S is not an a valid emname value.  A string or NIL was expected."), makeSymbol("SELF"), makeSymbol("NEW-EMNAME")), list(makeSymbol("CSETQ"), makeSymbol("EMNAME"), makeSymbol("NEW-EMNAME")), list(RET, makeSymbol("NEW-EMNAME")));

    static private final SubLSymbol $sym898$OUTER_CATCH_FOR_CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_MANIPULATION_MESSAGE_SET_EMNAME_METHOD = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-MANIPULATION-MESSAGE-SET-EMNAME-METHOD");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE");

    static private final SubLList $list_alt901 = list(list(makeSymbol("PORT-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym903$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-CLASS");

    static private final SubLSymbol $sym904$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt905 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("ADD-KNOWLEDGE-SOURCE")), list(makeSymbol("SET-PORT-ID"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $ADD_KNOWLEDGE_SOURCE = makeKeyword("ADD-KNOWLEDGE-SOURCE");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt908 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PORT-ID ~S"), makeSymbol("PORT-ID")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym909$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-METHOD");

    static private final SubLString $str_alt910$__PORT_ID__S = makeString(" :PORT-ID ~S");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt912 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("PORT-ID"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym913$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-METHOD");

    private static final SubLSymbol $PORT_ID = makeKeyword("PORT-ID");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt916 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("LIST"), makeSymbol("PORT-ID"), makeKeyword("PORT-ID")), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym917$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-TO-REVERSED-LIST-METHOD");



    static private final SubLList $list_alt920 = list(list(RET, makeSymbol("PORT-ID")));

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_GET_PORT_ID_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-GET-PORT-ID-METHOD");



    static private final SubLList $list_alt923 = list(makeSymbol("NEW-PORT-ID"));

    static private final SubLList $list_alt924 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("INTEGERP"), makeSymbol("NEW-PORT-ID"))), makeString("(SET-PORT-ID ~S): ~S is not a valid port-id.  An integer or NIL was expected."), makeSymbol("SELF"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), makeSymbol("NEW-PORT-ID")), list(RET, makeSymbol("NEW-PORT-ID")));

    static private final SubLSymbol $sym925$OUTER_CATCH_FOR_CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-SET-PORT-ID-METHOD");

    static private final SubLList $list_alt927 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("GET-EMNAME"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No external module name assigned to this message.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-KS-ADD-KNOWLEDGE-SOURCES-AT-WILL-P"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-KS-INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("DYNAMIC-EXTERNAL-KNOWLEDGE-SOURCE-KS"))))), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-NAME-METHOD"), makeSymbol("NEW-KS-INSTANCE"), list(makeSymbol("GET-EMNAME"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PORT-ID-METHOD"), makeSymbol("NEW-KS-INSTANCE"), list(makeSymbol("GET-PORT-ID"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-KNOWLEDGE-SOURCE"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeSymbol("NEW-KS-INSTANCE")), list(RET, T)), list(makeSymbol("PROGN"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("Knowledge source does not have permission to add knowledge sources.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL))));

    static private final SubLString $str_alt928$No_external_module_name_assigned_ = makeString("No external module name assigned to this message.");

    private static final SubLSymbol DYNAMIC_EXTERNAL_KNOWLEDGE_SOURCE_KS = makeSymbol("DYNAMIC-EXTERNAL-KNOWLEDGE-SOURCE-KS");

    static private final SubLString $str_alt930$Knowledge_source_does_not_have_pe = makeString("Knowledge source does not have permission to add knowledge sources.");

    private static final SubLSymbol CYBLACK_ADD_KNOWLEDGE_SOURCE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-ADD-KNOWLEDGE-SOURCE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE");

    static private final SubLSymbol $sym933$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-CLASS");

    static private final SubLSymbol $sym934$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-INSTANCE");

    static private final SubLList $list_alt935 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-MESSAGE-KEY"), makeSymbol("SELF"), makeKeyword("REMOVE-KNOWLEDGE-SOURCE")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $REMOVE_KNOWLEDGE_SOURCE = makeKeyword("REMOVE-KNOWLEDGE-SOURCE");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-INITIALIZE-METHOD");

    static private final SubLSymbol $sym938$OUTER_CATCH_FOR_CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt940 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("GET-EMNAME"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No external module name assigned to this message.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("KSB"), list(makeSymbol("CYBLACK-APPLICATION-GET-KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), makeSymbol("KSB"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No knowledge source battery is associated with this application.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-KS-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-KS-INSTANCE"), list(makeSymbol("CYBLACK-KSB-FIND-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("KSB"), list(makeSymbol("GET-EMNAME"), makeSymbol("SELF"))))), list(makeSymbol("PWHEN"), makeSymbol("OLD-KS-INSTANCE"), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-KNOWLEDGE-SOURCE"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeSymbol("OLD-KS-INSTANCE"))), list(RET, T)), list(makeSymbol("PROGN"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("Knowledge source does not have permission to remove knowledge sources.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)))));

    static private final SubLString $str_alt941$No_knowledge_source_battery_is_as = makeString("No knowledge source battery is associated with this application.");

    static private final SubLString $str_alt942$Knowledge_source_does_not_have_pe = makeString("Knowledge source does not have permission to remove knowledge sources.");

    private static final SubLSymbol CYBLACK_REMOVE_KNOWLEDGE_SOURCE_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-REMOVE-KNOWLEDGE-SOURCE-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE");

    static private final SubLList $list_alt945 = list(new SubLObject[]{ list(makeSymbol("DIRECT-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPER-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SLOTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECT-CLASS"), list(makeSymbol("NEW-DIRECT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPER-CLASS"), list(makeSymbol("NEW-SUPER-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SLOTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SLOT"), list(makeSymbol("NEW-SLOTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")) });







    static private final SubLSymbol $sym949$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-CLASS");

    static private final SubLSymbol $sym950$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_POSTING_CLASS_MESSAGE_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-POSTING-CLASS-MESSAGE-INSTANCE");

    static private final SubLList $list_alt951 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :CLASS ~S :SUPER-CLASS ~S :SLOTS ~S"), makeSymbol("DIRECT-CLASS"), makeSymbol("SUPER-CLASS"), makeSymbol("SLOTS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym952$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");

    static private final SubLString $str_alt953$__CLASS__S__SUPER_CLASS__S__SLOTS = makeString(" :CLASS ~S :SUPER-CLASS ~S :SLOTS ~S");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt955 = list(new SubLObject[]{ list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-CLASS"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("SUPER-CLASS"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("SUPER-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("SLOTS"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("SLOTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("DIRECT-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-CLASS"), list(makeSymbol("INTERN"), makeSymbol("DIRECT-CLASS")))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("SUPER-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SUPER-CLASS"), list(makeSymbol("INTERN"), makeSymbol("SUPER-CLASS")))), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("SLOTS")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SLOTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("SLOTS")), list(makeSymbol("PCOND"), list(list(makeSymbol("SYMBOLP"), makeSymbol("SLOT")), list(makeSymbol("CPUSH"), makeSymbol("SLOT"), makeSymbol("NEW-SLOTS"))), list(list(makeSymbol("STRINGP"), makeSymbol("SLOT")), list(makeSymbol("CPUSH"), list(makeSymbol("INTERN"), makeSymbol("SLOT")), makeSymbol("NEW-SLOTS"))))), list(makeSymbol("CSETQ"), makeSymbol("SLOTS"), list(makeSymbol("NREVERSE"), makeSymbol("NEW-SLOTS"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("DIRECT-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("DIRECT-CLASS"))), list(makeSymbol("WARN"), makeString("(PARSE-ARGS ~S): ~S is not a valid class name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("DIRECT-CLASS")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("DIRECT-CLASS")), list(makeSymbol("WARN"), makeString("(PARSE-ARGS ~S): ~S is already a class.  It cannot be added to the blackboard."), makeSymbol("SELF"), makeSymbol("DIRECT-CLASS")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("SUPER-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("SUPER-CLASS"))), list(makeSymbol("WARN"), makeString("(PARSE-ARGS ~S): ~S is not a valid class name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("SUPER-CLASS")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("SUPER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-POSTING"))), list(makeSymbol("WARN"), makeString("(PARSE-ARGS ~S): Superclass ~S does not implement the CYBLACK-POSTING interface."), makeSymbol("SELF"), makeSymbol("SUPER-CLASS")), list(RET, NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("SLOTS")), list(makeSymbol("PUNLESS"), makeSymbol("SLOT"), list(makeSymbol("WARN"), makeString("(PARSE-ARGS ~S): ~S is not a valid slot name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("SLOT")), list(RET, NIL))), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym956$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");



    private static final SubLSymbol $SUPER_CLASS = makeKeyword("SUPER-CLASS");



    static private final SubLString $str_alt960$_PARSE_ARGS__S____S_is_not_a_vali = makeString("(PARSE-ARGS ~S): ~S is not a valid class name.  A non-nil symbol was expected.");

    static private final SubLString $str_alt961$_PARSE_ARGS__S____S_is_already_a_ = makeString("(PARSE-ARGS ~S): ~S is already a class.  It cannot be added to the blackboard.");



    static private final SubLString $str_alt963$_PARSE_ARGS__S___Superclass__S_do = makeString("(PARSE-ARGS ~S): Superclass ~S does not implement the CYBLACK-POSTING interface.");

    static private final SubLString $str_alt964$_PARSE_ARGS__S____S_is_not_a_vali = makeString("(PARSE-ARGS ~S): ~S is not a valid slot name.  A non-nil symbol was expected.");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt966 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("LIST"), makeSymbol("SLOTS"), makeKeyword("SLOTS"), makeSymbol("SUPER-CLASS"), makeKeyword("SUPER-CLASS"), makeSymbol("DIRECT-CLASS"), makeKeyword("CLASS")), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym967$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-TO-REVERSED-LIST-METHOD");

    private static final SubLSymbol GET_DIRECT_CLASS = makeSymbol("GET-DIRECT-CLASS");

    static private final SubLList $list_alt970 = list(list(RET, makeSymbol("DIRECT-CLASS")));

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_DIRECT_CLASS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-DIRECT-CLASS-METHOD");

    private static final SubLSymbol SET_DIRECT_CLASS = makeSymbol("SET-DIRECT-CLASS");

    static private final SubLList $list_alt973 = list(makeSymbol("NEW-DIRECT-CLASS"));

    static private final SubLList $list_alt974 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-DIRECT-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-DIRECT-CLASS"))), makeString("(SET-DIRECT-CLASS ~S): ~S is not a valid class.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-DIRECT-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("DIRECT-CLASS"), makeSymbol("NEW-DIRECT-CLASS")), list(RET, makeSymbol("NEW-DIRECT-CLASS")));

    static private final SubLSymbol $sym975$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_DIRECT_CLASS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-DIRECT-CLASS-METHOD");

    private static final SubLSymbol GET_SUPER_CLASS = makeSymbol("GET-SUPER-CLASS");

    static private final SubLList $list_alt978 = list(list(RET, makeSymbol("SUPER-CLASS")));

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_SUPER_CLASS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-SUPER-CLASS-METHOD");

    private static final SubLSymbol SET_SUPER_CLASS = makeSymbol("SET-SUPER-CLASS");

    static private final SubLList $list_alt981 = list(makeSymbol("NEW-SUPER-CLASS"));

    static private final SubLList $list_alt982 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-SUPER-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-SUPER-CLASS"))), makeString("(SET-SUPER-CLASS ~S): ~S is not a valid class.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-SUPER-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("SUPER-CLASS"), makeSymbol("NEW-SUPER-CLASS")), list(RET, makeSymbol("NEW-SUPER-CLASS")));

    static private final SubLSymbol $sym983$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_SUPER_CLASS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-SUPER-CLASS-METHOD");

    private static final SubLSymbol GET_SLOTS = makeSymbol("GET-SLOTS");

    static private final SubLList $list_alt986 = list(list(RET, makeSymbol("SLOTS")));

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_GET_SLOTS_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-GET-SLOTS-METHOD");



    static private final SubLList $list_alt989 = list(makeSymbol("NEW-SLOTS"));

    static private final SubLList $list_alt990 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-SLOTS")), makeString("(SET-SLOT ~S): ~S is not a list of slot names.  A list of symbols was expected."), makeSymbol("SELF"), makeSymbol("NEW-SLOTS")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("NEW-SLOTS")), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("SLOT"), list(makeSymbol("SYMBOLP"), makeSymbol("SLOT"))), makeString("(SET-SLOT ~S): ~S is not a valid slot name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("SLOT")))), list(makeSymbol("CSETQ"), makeSymbol("SLOTS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-SLOTS"))), list(RET, makeSymbol("NEW-SLOTS")));

    static private final SubLSymbol $sym991$OUTER_CATCH_FOR_CYBLACK_ADD_POSTING_CLASS_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-POSTING-CLASS-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_SET_SLOT_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-SET-SLOT-METHOD");

    static private final SubLList $list_alt993 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("INITIAL-MESSAGE"), makeString("Cannot add posting class."))), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeSymbol("INITIAL-MESSAGE")), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-DIRECT-CLASS"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No class name has been provided. ")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SUPER-CLASS"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No super class has been provided. ")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No associated application.  ")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No associated knowledge source. ")))), list(makeSymbol("PUNLESS"), list(EQ, list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeSymbol("INITIAL-MESSAGE")), list(makeSymbol("WARN"), makeString("(SET-SLOT ~S): ~A"), makeSymbol("SELF"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), NIL), list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-KS-ADD-POSTING-CLASSES-AT-WILL-P"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF"))), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("Knowledge source does not have permission to add posting classes.")), list(makeSymbol("WARN"), makeString("(SET-SLOT ~S): ~A"), makeSymbol("SELF"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-POSTING-CLASS"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("GET-DIRECT-CLASS"), makeSymbol("SELF")), list(makeSymbol("GET-SUPER-CLASS"), makeSymbol("SELF")), NIL, list(makeSymbol("GET-SLOTS"), makeSymbol("SELF"))), list(RET, T) }));

    static private final SubLString $str_alt994$Cannot_add_posting_class_ = makeString("Cannot add posting class.");

    static private final SubLString $str_alt995$No_class_name_has_been_provided__ = makeString("No class name has been provided. ");

    static private final SubLString $str_alt996$No_super_class_has_been_provided_ = makeString("No super class has been provided. ");

    static private final SubLString $str_alt997$No_associated_application___ = makeString("No associated application.  ");

    static private final SubLString $str_alt998$No_associated_knowledge_source__ = makeString("No associated knowledge source. ");

    static private final SubLString $str_alt999$_SET_SLOT__S____A = makeString("(SET-SLOT ~S): ~A");

    static private final SubLString $str_alt1000$Knowledge_source_does_not_have_pe = makeString("Knowledge source does not have permission to add posting classes.");

    private static final SubLSymbol CYBLACK_ADD_POSTING_CLASS_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-ADD-POSTING-CLASS-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE");

    static private final SubLList $list_alt1003 = list(list(makeSymbol("TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE"), list(makeSymbol("NEW-TYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym1005$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PANEL_MANIPULATION_MESSAGE_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PANEL-MANIPULATION-MESSAGE-CLASS");

    static private final SubLSymbol $sym1006$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PANEL_MANIPULATION_MESSAGE_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PANEL-MANIPULATION-MESSAGE-INSTANCE");

    static private final SubLList $list_alt1007 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1008$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PANEL-MANIPULATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt1010 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :TYPE ~S"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt1012 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("TYPES"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1013$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PANEL-MANIPULATION-MESSAGE-METHOD");



    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt1016 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("LIST"), makeSymbol("TYPE"), $TYPE), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym1017$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PANEL-MANIPULATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-TO-REVERSED-LIST-METHOD");



    static private final SubLList $list_alt1020 = list(list(RET, makeSymbol("TYPE")));

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_GET_TYPE_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-GET-TYPE-METHOD");

    private static final SubLSymbol SET_TYPE = makeSymbol("SET-TYPE");

    static private final SubLList $list_alt1023 = list(makeSymbol("NEW-TYPE"));

    static private final SubLList $list_alt1024 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), makeSymbol("NEW-TYPE"), list(makeSymbol("STRINGP"), makeSymbol("NEW-TYPE"))), makeString("(SET-TYPE ~S): ~S is not a valid cyblack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), makeSymbol("NEW-TYPE")), list(RET, makeSymbol("NEW-TYPE")));

    static private final SubLSymbol $sym1025$OUTER_CATCH_FOR_CYBLACK_PANEL_MANIPULATION_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PANEL-MANIPULATION-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_SET_TYPE_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-SET-TYPE-METHOD");

    static private final SubLList $list_alt1027 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-TYPE"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No cyblack type has been specified.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A."), makeSymbol("SELF"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(RET, T));

    static private final SubLString $str_alt1028$No_cyblack_type_has_been_specifie = makeString("No cyblack type has been specified.");

    static private final SubLString $str_alt1029$_EXECUTE__S____A_ = makeString("(EXECUTE ~S): ~A.");

    private static final SubLSymbol CYBLACK_PANEL_MANIPULATION_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-PANEL-MANIPULATION-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE");

    static private final SubLList $list_alt1032 = list(new SubLObject[]{ list(makeSymbol("SUPERTYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTING-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PANEL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAIL-PART"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ARGS"), list(makeSymbol("MESSAGE-ARGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-REVERSED-LIST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERTYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERTYPES"), list(makeSymbol("NEW-SUPERTYPES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-CLASS"), list(makeSymbol("NEW-POSTING-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL-CLASS"), list(makeSymbol("NEW-PANEL-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_PANEL_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-PANEL-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ADD_PANEL_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ADD-PANEL-MESSAGE-INSTANCE");

    static private final SubLList $list_alt1038 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1039$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt1041 = list(list(makeSymbol("PRINT-TAIL-PART"), makeSymbol("SUPER"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :SUPERTYPES ~S :POSTING-CLASS ~S :PANEL-CLASS ~S"), makeSymbol("SUPERTYPES"), makeSymbol("POSTING-CLASS"), makeSymbol("PANEL-CLASS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1042$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    static private final SubLString $str_alt1043$__SUPERTYPES__S__POSTING_CLASS__S = makeString(" :SUPERTYPES ~S :POSTING-CLASS ~S :PANEL-CLASS ~S");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_PRINT_TAIL_PART_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-PRINT-TAIL-PART-METHOD");

    static private final SubLList $list_alt1045 = list(list(makeSymbol("PARSE-ARGS"), makeSymbol("SUPER"), makeSymbol("MESSAGE-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("SUPERTYPES")))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("POSTING-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), list(makeSymbol("GETF"), makeSymbol("MESSAGE-ARGS"), makeKeyword("PANEL-CLASS"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1046$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol $SUPERTYPES = makeKeyword("SUPERTYPES");

    private static final SubLSymbol $POSTING_CLASS = makeKeyword("POSTING-CLASS");

    private static final SubLSymbol $PANEL_CLASS = makeKeyword("PANEL-CLASS");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_PARSE_ARGS_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-PARSE-ARGS-METHOD");

    static private final SubLList $list_alt1051 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("LIST"), makeSymbol("PANEL-CLASS"), makeKeyword("PANEL-CLASS"), makeSymbol("POSTING-CLASS"), makeKeyword("POSTING-CLASS"), makeSymbol("SUPERTYPES"), makeKeyword("SUPERTYPES")), list(makeSymbol("TO-REVERSED-LIST"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym1052$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_TO_REVERSED_LIST_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-TO-REVERSED-LIST-METHOD");



    static private final SubLList $list_alt1055 = list(list(RET, makeSymbol("SUPERTYPES")));

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_GET_SUPERTYPES_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-GET-SUPERTYPES-METHOD");

    private static final SubLSymbol SET_SUPERTYPES = makeSymbol("SET-SUPERTYPES");

    static private final SubLList $list_alt1058 = list(makeSymbol("NEW-SUPERTYPES"));

    static private final SubLList $list_alt1059 = list(list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-SUPERTYPES")), makeString("(SET-SUPERTYPES ~S): ~S is not a list of cyblack types."), makeSymbol("SELF"), makeSymbol("NEW-SUPERTYPES")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERTYPE"), makeSymbol("NEW-SUPERTYPES")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("SUPERTYPE")), makeString("(SET-SUPERTYPES ~S): ~S is not a valid cyblack type.  A string was expected."), makeSymbol("SELF"), makeSymbol("SUPERTYPE")))), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), makeSymbol("NEW-SUPERTYPES")), list(RET, makeSymbol("NEW-SUPERTYPES")));

    static private final SubLSymbol $sym1060$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_SET_SUPERTYPES_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-SET-SUPERTYPES-METHOD");

    private static final SubLSymbol GET_POSTING_CLASS = makeSymbol("GET-POSTING-CLASS");

    static private final SubLList $list_alt1063 = list(list(RET, makeSymbol("POSTING-CLASS")));

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_GET_POSTING_CLASS_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-GET-POSTING-CLASS-METHOD");

    private static final SubLSymbol SET_POSTING_CLASS = makeSymbol("SET-POSTING-CLASS");

    static private final SubLList $list_alt1066 = list(makeSymbol("NEW-POSTING-CLASS"));

    static private final SubLList $list_alt1067 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-POSTING-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-POSTING-CLASS"))), makeString("(SET-POSTING-CLASS ~S): ~S is not a valid posting class.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-CLASS")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), makeSymbol("NEW-POSTING-CLASS")), list(RET, makeSymbol("NEW-POSTING-CLASS")));

    static private final SubLSymbol $sym1068$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_SET_POSTING_CLASS_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-SET-POSTING-CLASS-METHOD");

    private static final SubLSymbol GET_PANEL_CLASS = makeSymbol("GET-PANEL-CLASS");

    static private final SubLList $list_alt1071 = list(list(RET, makeSymbol("PANEL-CLASS")));

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_GET_PANEL_CLASS_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-GET-PANEL-CLASS-METHOD");

    private static final SubLSymbol SET_PANEL_CLASS = makeSymbol("SET-PANEL-CLASS");

    static private final SubLList $list_alt1074 = list(makeSymbol("NEW-PANEL-CLASS"));

    static private final SubLList $list_alt1075 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-PANEL-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-PANEL-CLASS"))), makeString("(SET-PANEL-CLASS ~S): ~S is not a valid panel class.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-PANEL-CLASS")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), makeSymbol("NEW-PANEL-CLASS")), list(RET, makeSymbol("NEW-PANEL-CLASS")));

    static private final SubLSymbol $sym1076$OUTER_CATCH_FOR_CYBLACK_ADD_PANEL_MESSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ADD-PANEL-MESSAGE-METHOD");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_SET_PANEL_CLASS_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-SET-PANEL-CLASS-METHOD");

    static private final SubLList $list_alt1078 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("INITIAL-MESSAGE"), makeString("Cannot add panel class. "))), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeSymbol("INITIAL-MESSAGE")), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SUPERTYPES"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No supertypes have been specified. ")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-POSTING-CLASS"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No posting-class has been specified. ")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-PANEL-CLASS"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeString("No panel-class has been specified. ")))), list(makeSymbol("PUNLESS"), list(EQ, list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF")), makeSymbol("INITIAL-MESSAGE")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), makeSymbol("SELF"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), NIL), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-KS-ADD-PANELS-AT-WILL-P"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF"))), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("This knowledge source does not have permission to add panels.")), list(makeSymbol("WARN"), makeString("(EXECUTE ~S): ~A"), makeSymbol("SELF"), list(makeSymbol("GET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"))), list(RET, NIL)), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-ADD-PANEL"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("GET-TYPE"), makeSymbol("SELF")), list(makeSymbol("GET-SUPERTYPES"), makeSymbol("SELF")), list(makeSymbol("GET-POSTING-CLASS"), makeSymbol("SELF")), list(makeSymbol("GET-PANEL-CLASS"), makeSymbol("SELF"))), list(RET, T) }));

    static private final SubLString $str_alt1079$Cannot_add_panel_class__ = makeString("Cannot add panel class. ");

    static private final SubLString $str_alt1080$No_supertypes_have_been_specified = makeString("No supertypes have been specified. ");

    static private final SubLString $str_alt1081$No_posting_class_has_been_specifi = makeString("No posting-class has been specified. ");

    static private final SubLString $str_alt1082$No_panel_class_has_been_specified = makeString("No panel-class has been specified. ");

    static private final SubLString $str_alt1083$This_knowledge_source_does_not_ha = makeString("This knowledge source does not have permission to add panels.");

    private static final SubLSymbol CYBLACK_ADD_PANEL_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-ADD-PANEL-MESSAGE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_PANEL_MESSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-PANEL-MESSAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REMOVE_PANEL_MESSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REMOVE-PANEL-MESSAGE-INSTANCE");

    static private final SubLList $list_alt1088 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE_INITIALIZE_METHOD = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE-INITIALIZE-METHOD");

    static private final SubLList $list_alt1090 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No application is associated with this message.")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-TYPE"), makeSymbol("SELF")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No type was supplied.")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("No knowledge source is associated with this message.")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-KS-REMOVE-PANELS-AT-WILL-P"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("SET-EXECUTION-ERROR-MESSAGE"), makeSymbol("SELF"), makeString("This knowledge source does not have permission to delete panels.")), list(RET, NIL)), list(makeSymbol("CYBLACK-DYNAMIC-APPLICATION-DYNAMICALLY-REMOVE-PANEL"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(makeSymbol("GET-TYPE"), makeSymbol("SELF"))), list(RET, T)));

    static private final SubLString $str_alt1091$No_application_is_associated_with = makeString("No application is associated with this message.");

    static private final SubLString $str_alt1092$No_type_was_supplied_ = makeString("No type was supplied.");

    static private final SubLString $str_alt1093$No_knowledge_source_is_associated = makeString("No knowledge source is associated with this message.");

    static private final SubLString $str_alt1094$This_knowledge_source_does_not_ha = makeString("This knowledge source does not have permission to delete panels.");

    private static final SubLSymbol CYBLACK_REMOVE_PANEL_MESSAGE_EXECUTE_METHOD = makeSymbol("CYBLACK-REMOVE-PANEL-MESSAGE-EXECUTE-METHOD");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_messages_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_messages_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_messages_file();
    }
}

