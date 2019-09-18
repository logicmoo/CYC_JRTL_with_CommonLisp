/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-SERIALIZE
 *  source file: /cyc/top/cycl/uia-serialize.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_serialize extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_serialize() {
    }

    public static final SubLFile me = new uia_serialize();


    // // Definitions
    /**
     * Serialize AGENDA to FILENAME.
     */
    public static final SubLObject uia_act_serialize_agenda(SubLObject v_agenda, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
            SubLSystemTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_1 = stream;
                        uia_serialize_agenda_to_stream(v_agenda, stream_1);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    /**
     * Initialize AGENDA from the serialization in FILENAME.
     */
    public static final SubLObject uia_act_instantiate_agenda(SubLObject v_agenda, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
            SubLSystemTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_2 = stream;
                        uia_instantiate_agenda_from_stream(v_agenda, stream_2);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    /**
     * Initialize AGENDA from the serialization in FILENAME.
     */
    public static final SubLObject uia_serialize_display(SubLObject filename, SubLObject display_stream) {
        if (display_stream == UNPROVIDED) {
            display_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_3 = stream;
                        uia_serialize_display_to_stream(stream_3, display_stream);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return $DONE;
        }
    }

    public static final SubLObject uia_serialize_agenda_to_stream(SubLObject v_agenda, SubLObject stream) {
        uia_serialize_manifest(v_agenda, stream);
        uia_serialize_interaction_mts_contents(v_agenda, stream);
        uia_serialize_interactions(v_agenda, stream);
        uia_serialize_setup_state(v_agenda, stream);
        uia_serialize_skolems(v_agenda, stream);
        return v_agenda;
    }

    // defparameter
    private static final SubLSymbol $uia_active_serialization_version_major$ = makeSymbol("*UIA-ACTIVE-SERIALIZATION-VERSION-MAJOR*");

    // defparameter
    private static final SubLSymbol $uia_active_serialization_version_minor$ = makeSymbol("*UIA-ACTIVE-SERIALIZATION-VERSION-MINOR*");

    public static final SubLObject uia_instantiation_version_number_error(SubLObject v_agenda, SubLObject stream, SubLObject section) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            Errors.error($str_alt6$Cannot_load_entries_for_section__, section, $uia_active_serialization_version_major$.getDynamicValue(thread), $uia_active_serialization_version_minor$.getDynamicValue(thread));
            return v_agenda;
        }
    }

    public static final SubLObject is_uia_serialization_versionP(SubLObject major, SubLObject minor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(major.numE($uia_active_serialization_version_major$.getDynamicValue(thread)) && minor.numE($uia_active_serialization_version_minor$.getDynamicValue(thread)));
        }
    }

    public static final SubLObject uia_instantiate_agenda_from_stream(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $uia_active_serialization_version_major$.currentBinding(thread);
                SubLObject _prev_bind_1 = $uia_active_serialization_version_minor$.currentBinding(thread);
                try {
                    $uia_active_serialization_version_major$.bind(NIL, thread);
                    $uia_active_serialization_version_minor$.bind(NIL, thread);
                    uia_instantiate_manifest(v_agenda, stream);
                    if (NIL == is_uia_serialization_versionP(ONE_INTEGER, ONE_INTEGER)) {
                        uia_instantiate_interaction_mts_contents(v_agenda, stream);
                    }
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, ONE_INTEGER)) {
                        uia_instantiate_interaction_mts(v_agenda, stream);
                        uia_instantiate_interaction_mts_constants(v_agenda, stream);
                    }
                    uia_instantiate_interactions(v_agenda, stream);
                    uia_instantiate_setup_state(v_agenda, stream);
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, ONE_INTEGER)) {
                        uia_instantiate_interaction_mts_contents(v_agenda, stream);
                    }
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, THREE_INTEGER)) {
                        uia_instantiate_skolems(v_agenda, stream);
                    }
                    uia_finalize_state_after_instantiation(v_agenda);
                } finally {
                    $uia_active_serialization_version_minor$.rebind(_prev_bind_1, thread);
                    $uia_active_serialization_version_major$.rebind(_prev_bind_0, thread);
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_to_stream(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $uia_active_serialization_version_major$.currentBinding(thread);
                SubLObject _prev_bind_1 = $uia_active_serialization_version_minor$.currentBinding(thread);
                try {
                    $uia_active_serialization_version_major$.bind(NIL, thread);
                    $uia_active_serialization_version_minor$.bind(NIL, thread);
                    uia_serialize_display_manifest(stream, display_stream);
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, TWO_INTEGER)) {
                        uia_serialize_display_interaction_mts_contents(stream, display_stream);
                    }
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, ONE_INTEGER)) {
                        uia_serialize_display_interaction_mts(stream, display_stream);
                        uia_serialize_display_interaction_mts_constants(stream, display_stream);
                    }
                    if (NIL == is_uia_serialization_versionP(ONE_INTEGER, TWO_INTEGER)) {
                        uia_serialize_display_interactions(stream, display_stream);
                        uia_serialize_display_setup_state(stream, display_stream);
                    }
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, THREE_INTEGER)) {
                        uia_serialize_display_skolems(stream, display_stream);
                    }
                    if (NIL != is_uia_serialization_versionP(ONE_INTEGER, ONE_INTEGER)) {
                        uia_serialize_display_interaction_mts_contents(stream, display_stream);
                    }
                } finally {
                    $uia_active_serialization_version_minor$.rebind(_prev_bind_1, thread);
                    $uia_active_serialization_version_major$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_manifest$ = makeSymbol("*UIA-SERIALIZATION-MANIFEST*");

    // deflexical
    private static final SubLSymbol $uia_serialization_version_major$ = makeSymbol("*UIA-SERIALIZATION-VERSION-MAJOR*");

    // deflexical
    private static final SubLSymbol $uia_serialization_version_minor$ = makeSymbol("*UIA-SERIALIZATION-VERSION-MINOR*");

    public static final SubLObject uia_serialize_manifest(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_manifest$.getGlobalValue(), stream);
        cfasl_output(list($VERSION_MAJOR, $uia_serialization_version_major$.getGlobalValue(), $VERSION_MINOR, $uia_serialization_version_minor$.getGlobalValue()), stream);
        cfasl_output(list($DATE, numeric_date_utilities.timestring(get_universal_time())), stream);
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_manifest(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_manifest$.getGlobalValue())) {
                        Errors.error($str_alt11$Bad_input_file_format_);
                    }
                }
            }
            {
                SubLObject version = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject datum = version;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt12);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt12);
                    if (NIL == member(current_4, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt12);
                }
                {
                    SubLObject version_major_tail = property_list_member($VERSION_MAJOR, current);
                    SubLObject version_major = (NIL != version_major_tail) ? ((SubLObject) (cadr(version_major_tail))) : NIL;
                    SubLObject version_minor_tail = property_list_member($VERSION_MINOR, current);
                    SubLObject version_minor = (NIL != version_minor_tail) ? ((SubLObject) (cadr(version_minor_tail))) : NIL;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!($uia_serialization_version_major$.getGlobalValue().numE(version_major) && (!version_minor.numG($uia_serialization_version_minor$.getGlobalValue())))) {
                            Errors.error($str_alt11$Bad_input_file_format_);
                        }
                    }
                    $uia_active_serialization_version_major$.setDynamicValue(version_major, thread);
                    $uia_active_serialization_version_minor$.setDynamicValue(version_minor, thread);
                }
            }
            {
                SubLObject date_spec = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject datum = date_spec;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_5 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt15);
                    current_5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt15);
                    if (NIL == member(current_5, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt15);
                }
                {
                    SubLObject date_tail = property_list_member($DATE, current);
                    SubLObject date = (NIL != date_tail) ? ((SubLObject) (cadr(date_tail))) : NIL;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!date.isString()) {
                            Errors.error($str_alt11$Bad_input_file_format_);
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_manifest(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject version = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject date = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                print(marker, display_stream);
                {
                    SubLObject datum = version;
                    SubLObject current = datum;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_6 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt12);
                        current_6 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt12);
                        if (NIL == member(current_6, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_6 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                    {
                        SubLObject version_major_tail = property_list_member($VERSION_MAJOR, current);
                        SubLObject version_major = (NIL != version_major_tail) ? ((SubLObject) (cadr(version_major_tail))) : NIL;
                        SubLObject version_minor_tail = property_list_member($VERSION_MINOR, current);
                        SubLObject version_minor = (NIL != version_minor_tail) ? ((SubLObject) (cadr(version_minor_tail))) : NIL;
                        $uia_active_serialization_version_major$.setDynamicValue(version_major, thread);
                        $uia_active_serialization_version_minor$.setDynamicValue(version_minor, thread);
                    }
                }
                prin1(version, display_stream);
                format(display_stream, $str_alt17$___VMaj__A_VMin__A__, $uia_active_serialization_version_major$.getDynamicValue(thread), $uia_active_serialization_version_minor$.getDynamicValue(thread));
                print(date, display_stream);
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_interaction_mts$ = makeSymbol("*UIA-SERIALIZATION-INTERACTION-MTS*");

    public static final SubLObject uia_serialize_interaction_mts(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_interaction_mts$.getGlobalValue(), stream);
        {
            SubLObject interaction_mts = user_interaction_agenda.uia_all_interaction_mts(v_agenda, NIL);
            SubLObject count = length(interaction_mts);
            cfasl_output(count, stream);
            {
                SubLObject cdolist_list_var = interaction_mts;
                SubLObject interaction_mt = NIL;
                for (interaction_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction_mt = cdolist_list_var.first()) {
                    uia_serialize_fort(interaction_mt, stream);
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_interaction_mts(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_interaction_mts$.getGlobalValue())) {
                        Errors.error($str_alt19$Bad_Interaction_Mts_section_);
                    }
                }
            }
            {
                SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject interaction_mt = NIL;
                        if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && THREE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                            interaction_mt = uia_instantiate_fort(stream);
                        } else
                            if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && TWO_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                interaction_mt = uia_instantiate_fort(stream);
                            } else
                                if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && ONE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                    interaction_mt = uia_instantiate_term_spec(stream);
                                } else {
                                    uia_instantiation_version_number_error(v_agenda, stream, $$$Interaction_MTs);
                                }


                        user_interaction_agenda.uia_note_interaction_mt(v_agenda, interaction_mt);
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_interaction_mts(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            {
                SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                print(count, display_stream);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                        if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && THREE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                            uia_serialize_display_fort(stream, display_stream);
                        } else
                            if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && TWO_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                uia_serialize_display_fort(stream, display_stream);
                            } else
                                if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && ONE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                    uia_serialize_display_term_spec(stream, display_stream);
                                } else {
                                    uia_instantiation_version_number_error($NONE, stream, $$$Interaction_MTs);
                                }


                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_serialize_term_spec(SubLObject interaction_mt, SubLObject stream) {
        {
            SubLObject guid = constants_high.constant_guid(interaction_mt);
            SubLObject name = constants_high.constant_name(interaction_mt);
            cfasl_output(guid, stream);
            cfasl_output(name, stream);
        }
        return NIL;
    }

    public static final SubLObject uia_serialize_fort(SubLObject fort, SubLObject stream) {
        return cfasl_output_externalized(fort, stream);
    }

    public static final SubLObject uia_instantiate_term_spec(SubLObject stream) {
        {
            SubLObject guid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject constant = constants_high.find_constant_by_guid(guid);
            if (NIL == constant) {
                name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED_SYM);
                constant = fi.fi_create_int(name, guid);
            }
            return constant;
        }
    }

    public static final SubLObject uia_instantiate_fort(SubLObject stream) {
        return cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uia_serialize_display_term_spec(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        return NIL;
    }

    public static final SubLObject uia_serialize_display_fort(SubLObject stream, SubLObject display_stream) {
        print(uia_instantiate_fort(stream), display_stream);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_interaction_mts_constants$ = makeSymbol("*UIA-SERIALIZATION-INTERACTION-MTS-CONSTANTS*");

    public static final SubLObject uia_serialize_interaction_mts_constants(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_interaction_mts_constants$.getGlobalValue(), stream);
        {
            SubLObject interaction_mts = user_interaction_agenda.uia_all_interaction_mts(v_agenda, NIL);
            SubLObject mt_count = length(interaction_mts);
            cfasl_output(mt_count, stream);
            {
                SubLObject cdolist_list_var = interaction_mts;
                SubLObject interaction_mt = NIL;
                for (interaction_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction_mt = cdolist_list_var.first()) {
                    {
                        SubLObject constants = uia_interaction_mt_constants(interaction_mt);
                        SubLObject count = length(constants);
                        cfasl_output(count, stream);
                        {
                            SubLObject cdolist_list_var_7 = constants;
                            SubLObject constant = NIL;
                            for (constant = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , constant = cdolist_list_var_7.first()) {
                                uia_serialize_fort(constant, stream);
                            }
                        }
                    }
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_interaction_mts_constants(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_interaction_mts_constants$.getGlobalValue())) {
                        Errors.error($str_alt23$Bad_Interaction_Mts_Constants_sec);
                    }
                }
            }
            {
                SubLObject mt_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(mt_count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        SubLObject i_8 = NIL;
                        for (i_8 = ZERO_INTEGER; i_8.numL(count); i_8 = add(i_8, ONE_INTEGER)) {
                            if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && THREE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                uia_instantiate_fort(stream);
                            } else
                                if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && TWO_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                    uia_instantiate_fort(stream);
                                } else
                                    if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && ONE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                        uia_instantiate_term_spec(stream);
                                    } else {
                                        uia_instantiation_version_number_error(v_agenda, stream, $$$Interaction_MTs_Constants);
                                    }


                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_interaction_mts_constants(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            {
                SubLObject mt_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                print(mt_count, display_stream);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(mt_count); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            print(count, display_stream);
                            {
                                SubLObject i_9 = NIL;
                                for (i_9 = ZERO_INTEGER; i_9.numL(count); i_9 = add(i_9, ONE_INTEGER)) {
                                    if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && THREE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                        uia_serialize_display_fort(stream, display_stream);
                                    } else
                                        if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && TWO_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                            uia_serialize_display_fort(stream, display_stream);
                                        } else
                                            if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && ONE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                                                uia_serialize_display_term_spec(stream, display_stream);
                                            } else {
                                                uia_instantiation_version_number_error($NONE, stream, $$$Interaction_MTs_Constants);
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

    public static final SubLObject uia_interaction_mt_constants(SubLObject interaction_mt) {
        {
            SubLObject constants = rkf_term_utilities.rkf_terms_created_in_interaction_mt(interaction_mt);
            return constants;
        }
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_interaction_mts_contents$ = makeSymbol("*UIA-SERIALIZATION-INTERACTION-MTS-CONTENTS*");

    public static final SubLObject uia_serialize_interaction_mts_contents(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_interaction_mts_contents$.getGlobalValue(), stream);
        {
            SubLObject partition = uia_serialize_determine_partition(v_agenda);
            partitions.save_partition_to_stream(stream, partition);
        }
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_interaction_mts_contents(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_interaction_mts_contents$.getGlobalValue())) {
                        Errors.error($str_alt26$Bad_Interaction_Mts_Contents_sect);
                    }
                }
            }
            partitions.load_partition_from_stream(stream, UNPROVIDED);
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_interaction_mts_contents(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        display_partition_from_stream(stream, display_stream);
        return NIL;
    }

    public static final SubLObject uia_serialize_determine_partition(SubLObject v_agenda) {
        SubLSystemTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject interaction_mts = user_interaction_agenda.uia_all_interaction_mts(v_agenda, NIL);
            SubLObject partition_spec = NIL;
            SubLObject cdolist_list_var = reverse(interaction_mts);
            SubLObject interaction_mt = NIL;
            for (interaction_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction_mt = cdolist_list_var.first()) {
                partition_spec = cons(list($TERM, interaction_mt), partition_spec);
                {
                    SubLObject constants = uia_interaction_mt_constants(interaction_mt);
                    SubLObject cdolist_list_var_10 = constants;
                    SubLObject constant = NIL;
                    for (constant = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , constant = cdolist_list_var_10.first()) {
                        partition_spec = cons(list($TERM, constant), partition_spec);
                    }
                }
                partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, interaction_mt), partition_spec);
            }
            return nreverse(partition_spec);
        }
    }

    public static final SubLObject display_partition_from_stream(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
            {
                SubLObject common_symbols = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        common_symbols = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                print(common_symbols, display_stream);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(common_symbols);
                        {
                            SubLObject obj = NIL;
                            for (obj = cfasl_input(stream, NIL, $EOF); obj != $EOF; obj = cfasl_input(stream, NIL, $EOF)) {
                                print(obj, display_stream);
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_interactions$ = makeSymbol("*UIA-SERIALIZATION-INTERACTIONS*");

    public static final SubLObject uia_serialize_interactions(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_interactions$.getGlobalValue(), stream);
        {
            SubLObject interactions = uia_interactions_to_serialize(v_agenda);
            SubLObject count = length(interactions);
            cfasl_output(count, stream);
            {
                SubLObject cdolist_list_var = interactions;
                SubLObject interaction = NIL;
                for (interaction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction = cdolist_list_var.first()) {
                    uia_serialize_interaction(interaction, stream);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_instantiate_interactions(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_interactions$.getGlobalValue())) {
                        Errors.error($str_alt32$Bad_Interactions_information_);
                    }
                }
            }
            {
                SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                    uia_instantiate_interaction(stream);
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_interactions(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        {
            SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            print(count, display_stream);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                    uia_serialize_display_interaction(stream, display_stream);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_interactions_to_serialize(SubLObject v_agenda) {
        return NIL;
    }

    public static final SubLObject uia_serialize_interaction(SubLObject interaction, SubLObject stream) {
        return NIL;
    }

    public static final SubLObject uia_instantiate_interaction(SubLObject stream) {
        return NIL;
    }

    public static final SubLObject uia_serialize_display_interaction(SubLObject stream, SubLObject display_stream) {
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_setup$ = makeSymbol("*UIA-SERIALIZATION-SETUP*");

    public static final SubLObject uia_serialize_setup_state(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_setup$.getGlobalValue(), stream);
        uia_serialize_setup_wrt_topic(v_agenda, stream);
        uia_serialize_setup_state_interaction_mts(v_agenda, stream);
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_setup_state(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_setup$.getGlobalValue())) {
                        Errors.error($str_alt34$Bad_Setup_state_information_);
                    }
                }
            }
            uia_instantiate_setup_wrt_topic(v_agenda, stream);
            uia_instantiate_setup_state_interaction_mts(v_agenda, stream);
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_setup_state(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        uia_serialize_display_setup_wrt_topic(stream, display_stream);
        uia_serialize_display_setup_state_interaction_mts(stream, display_stream);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_setup_topic$ = makeSymbol("*UIA-SERIALIZATION-SETUP-TOPIC*");

    public static final SubLObject uia_serialize_setup_wrt_topic(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_setup_topic$.getGlobalValue(), stream);
        cfasl_output($TOPIC, stream);
        uia_serialize_fort(uia_setup_state.uia_topic(v_agenda), stream);
        cfasl_output($DOMAIN_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_domain_mt(v_agenda), stream);
        cfasl_output($PARSING_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_parsing_mt(v_agenda), stream);
        cfasl_output($GENERATION_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED), stream);
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_setup_wrt_topic(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_setup_topic$.getGlobalValue())) {
                        Errors.error($str_alt34$Bad_Setup_state_information_);
                    }
                }
            }
            {
                SubLObject item = NIL;
                cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                item = uia_instantiate_setup_item(stream, v_agenda);
                uia_setup_state.uia_topic_update(v_agenda, item);
                cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                item = uia_instantiate_setup_item(stream, v_agenda);
                user_interaction_agenda.uia_domain_mt_update(v_agenda, item);
                cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                item = uia_instantiate_setup_item(stream, v_agenda);
                user_interaction_agenda.uia_parsing_mt_update(v_agenda, item);
                cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                item = uia_instantiate_setup_item(stream, v_agenda);
                user_interaction_agenda.uia_generation_mt_update(v_agenda, item);
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_instantiate_setup_item(SubLObject stream, SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = $NONE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item = NIL;
                if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && THREE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                    item = uia_instantiate_fort(stream);
                } else
                    if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && TWO_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                        item = uia_instantiate_fort(stream);
                    } else
                        if (ONE_INTEGER.equal($uia_active_serialization_version_major$.getDynamicValue(thread)) && ONE_INTEGER.equal($uia_active_serialization_version_minor$.getDynamicValue(thread))) {
                            {
                                SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                                try {
                                    api_control_vars.$cfasl_constant_handle_lookup_func$.bind(FIND_CONSTANT_BY_LEGACY_ID, thread);
                                    item = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            uia_instantiation_version_number_error(v_agenda, stream, $$$Setup);
                        }


                return item;
            }
        }
    }

    public static final SubLObject uia_serialize_display_setup_wrt_topic(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_setup_interaction_mts$ = makeSymbol("*UIA-SERIALIZATION-SETUP-INTERACTION-MTS*");

    public static final SubLObject uia_serialize_setup_state_interaction_mts(SubLObject v_agenda, SubLObject stream) {
        cfasl_output($uia_serialization_setup_interaction_mts$.getGlobalValue(), stream);
        cfasl_output($DOMAIN_INTERACTION_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), stream);
        cfasl_output($PARSING_INTERACTION_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), stream);
        cfasl_output($GENERATION_INTERACTION_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED), stream);
        cfasl_output($LEXICAL_INTERACTION_MT, stream);
        uia_serialize_fort(user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), stream);
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_setup_state_interaction_mts(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_setup_interaction_mts$.getGlobalValue())) {
                        Errors.error($str_alt34$Bad_Setup_state_information_);
                    }
                }
            }
            cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.uia_domain_interaction_mt_update(v_agenda, uia_instantiate_setup_item(stream, v_agenda));
            cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.uia_parsing_interaction_mt_update(v_agenda, uia_instantiate_setup_item(stream, v_agenda));
            cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.uia_generation_interaction_mt_update(v_agenda, uia_instantiate_setup_item(stream, v_agenda));
            cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.uia_lexical_interaction_mt_update(v_agenda, uia_instantiate_setup_item(stream, v_agenda));
            uia_setup_state.uia_reconstruct_agenda_populate_interaction_mts(v_agenda);
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_setup_state_interaction_mts(SubLObject stream, SubLObject display_stream) {
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
        print(uia_instantiate_setup_item(stream, UNPROVIDED), display_stream);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uia_serialization_skolems$ = makeSymbol("*UIA-SERIALIZATION-SKOLEMS*");

    /**
     * This uses a private function from skolems.lisp - UGH!
     */
    public static final SubLObject uia_serialize_skolems(SubLObject v_agenda, SubLObject stream) {
        {
            SubLObject v_skolems = uia_serialize_gather_all_interaction_skolems(v_agenda);
            SubLObject skolem_count = length(v_skolems);
            cfasl_output($uia_serialization_skolems$.getGlobalValue(), stream);
            cfasl_output(skolem_count, stream);
            {
                SubLObject cdolist_list_var = v_skolems;
                SubLObject skolem_term = NIL;
                for (skolem_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem_term = cdolist_list_var.first()) {
                    {
                        SubLObject skolem_info = funcall($sym48$SKOLEM_DEFN_KEY, skolem_term);
                        if (NIL == skolem_info) {
                            Errors.warn($str_alt49$from_UIA_Serialization__Skolem__A, skolem_term);
                        } else {
                            {
                                SubLObject datum = skolem_info;
                                SubLObject current = datum;
                                SubLObject skolem_defn = NIL;
                                SubLObject skolem_key = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt50);
                                skolem_defn = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt50);
                                skolem_key = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    cfasl_output_externalized(skolem_key, stream);
                                    cfasl_output_externalized(skolem_defn, stream);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt50);
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_instantiate_skolems(SubLObject v_agenda, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_skolems$.getGlobalValue())) {
                        Errors.error($str_alt51$Bad_skolem_definition_);
                    }
                }
            }
            {
                SubLObject counter = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!counter.isFixnum()) {
                        Errors.error($str_alt52$Invalid_number_of_skolem_definiti, counter);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(counter); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject skolem_key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            SubLObject skolem_defn = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            skolems.add_skolem_defn(skolem_defn, skolem_key);
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_serialize_display_skolems(SubLObject stream, SubLObject display_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!marker.equal($uia_serialization_skolems$.getGlobalValue())) {
                        Errors.error($str_alt51$Bad_skolem_definition_);
                    }
                }
            }
            {
                SubLObject counter = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!counter.isFixnum()) {
                        Errors.error($str_alt52$Invalid_number_of_skolem_definiti, counter);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(counter); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject skolem_key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            SubLObject skolem_defn = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            format(display_stream, $str_alt53$Skolem_key__A____Skolem_Definitio, skolem_key, skolem_defn);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_finalize_state_after_instantiation(SubLObject v_agenda) {
        uia_tools_basic.uia_reset_nl_trie(v_agenda);
        uia_fix_agenda_mts(v_agenda);
        uia_setup_state.uia_note_setup_state_complete(v_agenda);
        return v_agenda;
    }

    /**
     * Ensure that the parsing and generation interaction MT's see the lexical one
     */
    public static final SubLObject uia_fix_agenda_mts(SubLObject v_agenda) {
        if (NIL != v_agenda) {
            {
                SubLObject parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                SubLObject generation_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject lexical_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                misc_kb_utilities.try_assert_now(list($$genlMt, parsing_mt, lexical_mt), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                misc_kb_utilities.try_assert_now(list($$genlMt, generation_mt, lexical_mt), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            }
        }
        return T;
    }

    public static final SubLObject uia_serialize_gather_all_interaction_skolems(SubLObject v_agenda) {
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject skolem_terms = NIL;
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_refs_in_mt($$isa, mt, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != isa.isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) {
                    skolem_terms = cons(v_term, skolem_terms);
                }
            }
            return skolem_terms;
        }
    }

    public static final SubLObject declare_uia_serialize_file() {
        declareFunction("uia_act_serialize_agenda", "UIA-ACT-SERIALIZE-AGENDA", 2, 0, false);
        declareFunction("uia_act_instantiate_agenda", "UIA-ACT-INSTANTIATE-AGENDA", 2, 0, false);
        declareFunction("uia_serialize_display", "UIA-SERIALIZE-DISPLAY", 1, 1, false);
        declareFunction("uia_serialize_agenda_to_stream", "UIA-SERIALIZE-AGENDA-TO-STREAM", 2, 0, false);
        declareFunction("uia_instantiation_version_number_error", "UIA-INSTANTIATION-VERSION-NUMBER-ERROR", 3, 0, false);
        declareFunction("is_uia_serialization_versionP", "IS-UIA-SERIALIZATION-VERSION?", 2, 0, false);
        declareFunction("uia_instantiate_agenda_from_stream", "UIA-INSTANTIATE-AGENDA-FROM-STREAM", 2, 0, false);
        declareFunction("uia_serialize_display_to_stream", "UIA-SERIALIZE-DISPLAY-TO-STREAM", 2, 0, false);
        declareFunction("uia_serialize_manifest", "UIA-SERIALIZE-MANIFEST", 2, 0, false);
        declareFunction("uia_instantiate_manifest", "UIA-INSTANTIATE-MANIFEST", 2, 0, false);
        declareFunction("uia_serialize_display_manifest", "UIA-SERIALIZE-DISPLAY-MANIFEST", 2, 0, false);
        declareFunction("uia_serialize_interaction_mts", "UIA-SERIALIZE-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_instantiate_interaction_mts", "UIA-INSTANTIATE-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_serialize_display_interaction_mts", "UIA-SERIALIZE-DISPLAY-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_serialize_term_spec", "UIA-SERIALIZE-TERM-SPEC", 2, 0, false);
        declareFunction("uia_serialize_fort", "UIA-SERIALIZE-FORT", 2, 0, false);
        declareFunction("uia_instantiate_term_spec", "UIA-INSTANTIATE-TERM-SPEC", 1, 0, false);
        declareFunction("uia_instantiate_fort", "UIA-INSTANTIATE-FORT", 1, 0, false);
        declareFunction("uia_serialize_display_term_spec", "UIA-SERIALIZE-DISPLAY-TERM-SPEC", 2, 0, false);
        declareFunction("uia_serialize_display_fort", "UIA-SERIALIZE-DISPLAY-FORT", 2, 0, false);
        declareFunction("uia_serialize_interaction_mts_constants", "UIA-SERIALIZE-INTERACTION-MTS-CONSTANTS", 2, 0, false);
        declareFunction("uia_instantiate_interaction_mts_constants", "UIA-INSTANTIATE-INTERACTION-MTS-CONSTANTS", 2, 0, false);
        declareFunction("uia_serialize_display_interaction_mts_constants", "UIA-SERIALIZE-DISPLAY-INTERACTION-MTS-CONSTANTS", 2, 0, false);
        declareFunction("uia_interaction_mt_constants", "UIA-INTERACTION-MT-CONSTANTS", 1, 0, false);
        declareFunction("uia_serialize_interaction_mts_contents", "UIA-SERIALIZE-INTERACTION-MTS-CONTENTS", 2, 0, false);
        declareFunction("uia_instantiate_interaction_mts_contents", "UIA-INSTANTIATE-INTERACTION-MTS-CONTENTS", 2, 0, false);
        declareFunction("uia_serialize_display_interaction_mts_contents", "UIA-SERIALIZE-DISPLAY-INTERACTION-MTS-CONTENTS", 2, 0, false);
        declareFunction("uia_serialize_determine_partition", "UIA-SERIALIZE-DETERMINE-PARTITION", 1, 0, false);
        declareFunction("display_partition_from_stream", "DISPLAY-PARTITION-FROM-STREAM", 2, 0, false);
        declareFunction("uia_serialize_interactions", "UIA-SERIALIZE-INTERACTIONS", 2, 0, false);
        declareFunction("uia_instantiate_interactions", "UIA-INSTANTIATE-INTERACTIONS", 2, 0, false);
        declareFunction("uia_serialize_display_interactions", "UIA-SERIALIZE-DISPLAY-INTERACTIONS", 2, 0, false);
        declareFunction("uia_interactions_to_serialize", "UIA-INTERACTIONS-TO-SERIALIZE", 1, 0, false);
        declareFunction("uia_serialize_interaction", "UIA-SERIALIZE-INTERACTION", 2, 0, false);
        declareFunction("uia_instantiate_interaction", "UIA-INSTANTIATE-INTERACTION", 1, 0, false);
        declareFunction("uia_serialize_display_interaction", "UIA-SERIALIZE-DISPLAY-INTERACTION", 2, 0, false);
        declareFunction("uia_serialize_setup_state", "UIA-SERIALIZE-SETUP-STATE", 2, 0, false);
        declareFunction("uia_instantiate_setup_state", "UIA-INSTANTIATE-SETUP-STATE", 2, 0, false);
        declareFunction("uia_serialize_display_setup_state", "UIA-SERIALIZE-DISPLAY-SETUP-STATE", 2, 0, false);
        declareFunction("uia_serialize_setup_wrt_topic", "UIA-SERIALIZE-SETUP-WRT-TOPIC", 2, 0, false);
        declareFunction("uia_instantiate_setup_wrt_topic", "UIA-INSTANTIATE-SETUP-WRT-TOPIC", 2, 0, false);
        declareFunction("uia_instantiate_setup_item", "UIA-INSTANTIATE-SETUP-ITEM", 1, 1, false);
        declareFunction("uia_serialize_display_setup_wrt_topic", "UIA-SERIALIZE-DISPLAY-SETUP-WRT-TOPIC", 2, 0, false);
        declareFunction("uia_serialize_setup_state_interaction_mts", "UIA-SERIALIZE-SETUP-STATE-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_instantiate_setup_state_interaction_mts", "UIA-INSTANTIATE-SETUP-STATE-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_serialize_display_setup_state_interaction_mts", "UIA-SERIALIZE-DISPLAY-SETUP-STATE-INTERACTION-MTS", 2, 0, false);
        declareFunction("uia_serialize_skolems", "UIA-SERIALIZE-SKOLEMS", 2, 0, false);
        declareFunction("uia_instantiate_skolems", "UIA-INSTANTIATE-SKOLEMS", 2, 0, false);
        declareFunction("uia_serialize_display_skolems", "UIA-SERIALIZE-DISPLAY-SKOLEMS", 2, 0, false);
        declareFunction("uia_finalize_state_after_instantiation", "UIA-FINALIZE-STATE-AFTER-INSTANTIATION", 1, 0, false);
        declareFunction("uia_fix_agenda_mts", "UIA-FIX-AGENDA-MTS", 1, 0, false);
        declareFunction("uia_serialize_gather_all_interaction_skolems", "UIA-SERIALIZE-GATHER-ALL-INTERACTION-SKOLEMS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_serialize_file() {
        defparameter("*UIA-ACTIVE-SERIALIZATION-VERSION-MAJOR*", NIL);
        defparameter("*UIA-ACTIVE-SERIALIZATION-VERSION-MINOR*", NIL);
        deflexical("*UIA-SERIALIZATION-MANIFEST*", $MANIFEST);
        deflexical("*UIA-SERIALIZATION-VERSION-MAJOR*", ONE_INTEGER);
        deflexical("*UIA-SERIALIZATION-VERSION-MINOR*", THREE_INTEGER);
        deflexical("*UIA-SERIALIZATION-INTERACTION-MTS*", $INTERACTION_MTS);
        deflexical("*UIA-SERIALIZATION-INTERACTION-MTS-CONSTANTS*", $INTERACTION_MTS_CONSTANTS);
        deflexical("*UIA-SERIALIZATION-INTERACTION-MTS-CONTENTS*", $INTERACTION_MTS_CONTENTS);
        deflexical("*UIA-SERIALIZATION-INTERACTIONS*", $INTERACTIONS);
        deflexical("*UIA-SERIALIZATION-SETUP*", $SETUP);
        deflexical("*UIA-SERIALIZATION-SETUP-TOPIC*", $SETUP_TOPIC);
        deflexical("*UIA-SERIALIZATION-SETUP-INTERACTION-MTS*", $SETUP_INTERACTION_MTS);
        deflexical("*UIA-SERIALIZATION-SKOLEMS*", $SKOLEMS);
        return NIL;
    }

    public static final SubLObject setup_uia_serialize_file() {
                return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol USER_INTERACTION_AGENDA_P = makeSymbol("USER-INTERACTION-AGENDA-P");





    static private final SubLString $str_alt3$Unable_to_open__S = makeString("Unable to open ~S");





    static private final SubLString $str_alt6$Cannot_load_entries_for_section__ = makeString("Cannot load entries for section ~A in a format compliant with Version ~A.~A");

    private static final SubLSymbol $MANIFEST = makeKeyword("MANIFEST");







    static private final SubLString $str_alt11$Bad_input_file_format_ = makeString("Bad input file format.");

    static private final SubLList $list_alt12 = list(makeSymbol("&KEY"), makeSymbol("VERSION-MAJOR"), makeSymbol("VERSION-MINOR"));

    static private final SubLList $list_alt13 = list(makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list_alt15 = list(makeSymbol("&KEY"), makeSymbol("DATE"));

    static private final SubLList $list_alt16 = list($DATE);

    static private final SubLString $str_alt17$___VMaj__A_VMin__A__ = makeString("-> VMaj ~A VMin ~A~%");

    private static final SubLSymbol $INTERACTION_MTS = makeKeyword("INTERACTION-MTS");

    static private final SubLString $str_alt19$Bad_Interaction_Mts_section_ = makeString("Bad Interaction Mts section.");

    static private final SubLString $$$Interaction_MTs = makeString("Interaction MTs");



    private static final SubLSymbol $INTERACTION_MTS_CONSTANTS = makeKeyword("INTERACTION-MTS-CONSTANTS");

    static private final SubLString $str_alt23$Bad_Interaction_Mts_Constants_sec = makeString("Bad Interaction Mts Constants section.");

    static private final SubLString $$$Interaction_MTs_Constants = makeString("Interaction MTs Constants");

    private static final SubLSymbol $INTERACTION_MTS_CONTENTS = makeKeyword("INTERACTION-MTS-CONTENTS");

    static private final SubLString $str_alt26$Bad_Interaction_Mts_Contents_sect = makeString("Bad Interaction Mts Contents section.");





    private static final SubLSymbol SCOPE_PARTITION_MT_INDEX = makeSymbol("SCOPE-PARTITION-MT-INDEX");



    private static final SubLSymbol $INTERACTIONS = makeKeyword("INTERACTIONS");

    static private final SubLString $str_alt32$Bad_Interactions_information_ = makeString("Bad Interactions information.");



    static private final SubLString $str_alt34$Bad_Setup_state_information_ = makeString("Bad Setup state information.");

    private static final SubLSymbol $SETUP_TOPIC = makeKeyword("SETUP-TOPIC");









    private static final SubLSymbol FIND_CONSTANT_BY_LEGACY_ID = makeSymbol("FIND-CONSTANT-BY-LEGACY-ID");

    static private final SubLString $$$Setup = makeString("Setup");

    private static final SubLSymbol $SETUP_INTERACTION_MTS = makeKeyword("SETUP-INTERACTION-MTS");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $PARSING_INTERACTION_MT = makeKeyword("PARSING-INTERACTION-MT");

    private static final SubLSymbol $GENERATION_INTERACTION_MT = makeKeyword("GENERATION-INTERACTION-MT");

    private static final SubLSymbol $LEXICAL_INTERACTION_MT = makeKeyword("LEXICAL-INTERACTION-MT");

    private static final SubLSymbol $SKOLEMS = makeKeyword("SKOLEMS");

    static private final SubLSymbol $sym48$SKOLEM_DEFN_KEY = makeSymbol("SKOLEM-DEFN&KEY");

    static private final SubLString $str_alt49$from_UIA_Serialization__Skolem__A = makeString("from UIA Serialization: Skolem ~A is missing its skolem info; we will be showing HL formulas only.");

    static private final SubLList $list_alt50 = list(makeSymbol("SKOLEM-DEFN"), makeSymbol("SKOLEM-KEY"));

    static private final SubLString $str_alt51$Bad_skolem_definition_ = makeString("Bad skolem definition.");

    static private final SubLString $str_alt52$Invalid_number_of_skolem_definiti = makeString("Invalid number of skolem definitions ~A.");

    static private final SubLString $str_alt53$Skolem_key__A____Skolem_Definitio = makeString("Skolem key ~A -> Skolem Definition ~A ~%");

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    public static final SubLObject $$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    // // Initializers
    public void declareFunctions() {
        declare_uia_serialize_file();
    }

    public void initializeVariables() {
        init_uia_serialize_file();
    }

    public void runTopLevelForms() {
        setup_uia_serialize_file();
    }
}

