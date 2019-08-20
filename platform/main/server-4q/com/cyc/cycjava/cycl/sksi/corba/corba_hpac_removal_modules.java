/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-HPAC-REMOVAL-MODULES
 *  source file: /cyc/top/cycl/sksi/corba/corba-hpac-removal-modules.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_hpac_removal_modules extends SubLTranslatedFile implements V02 {
    // // Constructor
    private corba_hpac_removal_modules() {
    }

    public static final SubLFile me = new corba_hpac_removal_modules();


    // // Definitions
    public static final SubLObject corba_hpac_fatality_rate_for_project_at_lat_long_expand_old(SubLObject literal, SubLObject sense) {
        return corba_hpac_rate_for_project_at_lat_long_expand_old_int($const2$hpacFatalityRateForProjectAtLatLo, literal, sense);
    }

    public static final SubLObject corba_hpac_casualty_rate_for_project_at_lat_long_expand_old(SubLObject literal, SubLObject sense) {
        return corba_hpac_rate_for_project_at_lat_long_expand_old_int($const5$hpacCasualtyRateForProjectAtLatLo, literal, sense);
    }

    public static final SubLObject corba_hpac_rate_for_project_at_lat_long_expand_old_int(SubLObject corba_predicate, SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject arg2_project = el_utilities.literal_arg2(literal, UNPROVIDED);
                SubLObject arg3_latitude = el_utilities.literal_arg3(literal, UNPROVIDED);
                SubLObject arg4_longitude = el_utilities.literal_arg4(literal, UNPROVIDED);
                SubLObject arg5_filename = el_utilities.literal_arg5(literal, UNPROVIDED);
                if (NIL == sksi_sks_accessors.sks_p(sks)) {
                    return NIL;
                }
                {
                    SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                    if (NIL == corba_utilities.corba_connection_p(corba_connection)) {
                        return NIL;
                    }
                    {
                        SubLObject result_percent = corba_hpac_rate_for_project_at_lat_long_old(corba_connection, corba_predicate, arg2_project, arg3_latitude, arg4_longitude, arg5_filename);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result_percent, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list(corba_predicate, result_percent, arg2_project, arg3_latitude, arg4_longitude, arg5_filename), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject corba_hpac_rate_for_project_at_lat_long_old(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject latitude, SubLObject longitude, SubLObject filename) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        SubLTrampolineFile.checkType(latitude, NUMBERP);
        SubLTrampolineFile.checkType(longitude, NUMBERP);
        {
            SubLObject windows_filename = cconcatenate($str_alt10$_, string_utilities.string_substitute($str_alt10$_, $str_alt11$_, filename, UNPROVIDED));
            SubLObject corba_form = list(project, windows_filename, latitude, longitude);
            SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, corba_form);
            SubLObject file_contents = NIL;
            if (NIL != corba_utilities.corba_connection_eval_errorP(result)) {
                Errors.error($str_alt12$_A, result);
            }
            {
                SubLObject lines = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt14$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject line = NIL;
                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    lines = cons(line, lines);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                file_contents = string_utilities.join_strings(nreverse(lines), string_utilities.$new_line_string$.getGlobalValue());
            }
            return corba_hpac_rate_for_project_at_lat_long_parser(file_contents);
        }
    }

    public static final SubLObject corba_hpac_project_fatality_count_expand_old(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_old_int($$hpacFatalityCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_injury_count_expand_old(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_old_int($$hpacInjuryCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_casualty_count_expand_old(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_old_int($$hpacCasualtyCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_count_expand_old_int(SubLObject corba_predicate, SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject arg2_project = el_utilities.literal_arg2(literal, UNPROVIDED);
                SubLObject arg3_filename = el_utilities.literal_arg3(literal, UNPROVIDED);
                if (NIL == sksi_sks_accessors.sks_p(sks)) {
                    return NIL;
                }
                {
                    SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                    if (NIL == corba_utilities.corba_connection_p(corba_connection)) {
                        return NIL;
                    }
                    {
                        SubLObject result = corba_hpac_project_count_old(corba_connection, corba_predicate, arg2_project, arg3_filename);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list(corba_predicate, result, arg2_project, arg3_filename), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject corba_hpac_project_count_old(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject filename) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject counts = corba_hpac_project_counts_old(corba_connection, corba_predicate, project, filename);
            if (corba_predicate == $$hpacFatalityCountForProject) {
                return counts.first();
            } else
                if (corba_predicate == $$hpacInjuryCountForProject) {
                    return second(counts);
                } else
                    if (corba_predicate == $$hpacCasualtyCountForProject) {
                        return third(counts);
                    } else {
                        return NIL;
                    }


        }
    }

    public static final SubLObject corba_hpac_project_counts_old(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject filename) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject windows_filename = cconcatenate($str_alt10$_, string_utilities.string_substitute($str_alt10$_, $str_alt11$_, filename, UNPROVIDED));
            SubLObject corba_form = list(project, windows_filename);
            SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, corba_form);
            SubLObject file_contents = NIL;
            if (NIL != corba_utilities.corba_connection_eval_errorP(result)) {
                Errors.error($str_alt12$_A, result);
            }
            {
                SubLObject lines = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt14$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject line = NIL;
                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    lines = cons(line, lines);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                file_contents = string_utilities.join_strings(nreverse(lines), string_utilities.$new_line_string$.getGlobalValue());
                return corba_hpac_project_casualty_count_parser(file_contents);
            }
        }
    }

    public static final SubLObject corba_hpac_fatality_rate_for_project_at_lat_long_expand(SubLObject literal, SubLObject sense) {
        return corba_hpac_rate_for_project_at_lat_long_expand_int($const2$hpacFatalityRateForProjectAtLatLo, literal, sense);
    }

    public static final SubLObject corba_hpac_casualty_rate_for_project_at_lat_long_expand(SubLObject literal, SubLObject sense) {
        return corba_hpac_rate_for_project_at_lat_long_expand_int($const5$hpacCasualtyRateForProjectAtLatLo, literal, sense);
    }

    public static final SubLObject corba_hpac_rate_for_project_at_lat_long_expand_int(SubLObject corba_predicate, SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject arg2_project = el_utilities.literal_arg2(literal, UNPROVIDED);
                SubLObject arg3_latitude = el_utilities.literal_arg3(literal, UNPROVIDED);
                SubLObject arg4_longitude = el_utilities.literal_arg4(literal, UNPROVIDED);
                SubLObject arg5_filename = el_utilities.literal_arg5(literal, UNPROVIDED);
                SubLObject arg6_agent_string = el_utilities.literal_arg(literal, SIX_INTEGER, UNPROVIDED);
                if (NIL == sksi_sks_accessors.sks_p(sks)) {
                    return NIL;
                }
                {
                    SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                    if (NIL == corba_utilities.corba_connection_p(corba_connection)) {
                        return NIL;
                    }
                    {
                        SubLObject result_percent = corba_hpac_rate_for_project_at_lat_long(corba_connection, corba_predicate, arg2_project, arg3_latitude, arg4_longitude, arg5_filename, arg6_agent_string);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result_percent, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list(corba_predicate, result_percent, arg2_project, arg3_latitude, arg4_longitude, arg5_filename, arg6_agent_string), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject corba_hpac_rate_for_project_at_lat_long(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject latitude, SubLObject longitude, SubLObject filename, SubLObject agent_string) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(latitude, NUMBERP);
        SubLTrampolineFile.checkType(longitude, NUMBERP);
        SubLTrampolineFile.checkType(filename, STRINGP);
        SubLTrampolineFile.checkType(agent_string, STRINGP);
        {
            SubLObject windows_filename = cconcatenate($str_alt10$_, string_utilities.string_substitute($str_alt10$_, $str_alt11$_, filename, UNPROVIDED));
            SubLObject corba_form = list(project, windows_filename, latitude, longitude, agent_string);
            SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, corba_form);
            SubLObject file_contents = NIL;
            if (NIL != corba_utilities.corba_connection_eval_errorP(result)) {
                Errors.error($str_alt12$_A, result);
            }
            {
                SubLObject lines = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt14$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject line = NIL;
                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    lines = cons(line, lines);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                file_contents = string_utilities.join_strings(nreverse(lines), string_utilities.$new_line_string$.getGlobalValue());
            }
            return corba_hpac_rate_for_project_at_lat_long_parser(file_contents);
        }
    }

    public static final SubLObject corba_hpac_rate_for_project_at_lat_long_parser(SubLObject results) {
        {
            SubLObject current = string_utilities.get_substring_between_tags(results, $str_alt29$__Entries____________, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject current_tokenized = (NIL != current) ? ((SubLObject) (string_utilities.string_tokenize(current, string_utilities.whitespace_chars(), NIL, NIL, T, NIL, UNPROVIDED))) : NIL;
            SubLObject probability = (NIL != current_tokenized) ? ((SubLObject) (read_from_string_ignoring_errors(fourth(current_tokenized), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            return probability;
        }
    }

    public static final SubLObject corba_hpac_project_fatality_count_expand(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_int($$hpacFatalityCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_injury_count_expand(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_int($$hpacInjuryCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_casualty_count_expand(SubLObject literal, SubLObject sense) {
        return corba_hpac_project_count_expand_int($$hpacCasualtyCountForProject, literal, sense);
    }

    public static final SubLObject corba_hpac_project_count_expand_int(SubLObject corba_predicate, SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject arg2_project = el_utilities.literal_arg2(literal, UNPROVIDED);
                SubLObject arg3_filename = el_utilities.literal_arg3(literal, UNPROVIDED);
                SubLObject arg4_agent_string = el_utilities.literal_arg4(literal, UNPROVIDED);
                if (NIL == sksi_sks_accessors.sks_p(sks)) {
                    return NIL;
                }
                {
                    SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                    if (NIL == corba_utilities.corba_connection_p(corba_connection)) {
                        return NIL;
                    }
                    {
                        SubLObject result = corba_hpac_project_count(corba_connection, corba_predicate, arg2_project, arg3_filename, arg4_agent_string);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list(corba_predicate, result, arg2_project, arg3_filename, arg4_agent_string), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject corba_hpac_project_count(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject filename, SubLObject agent_string) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        SubLTrampolineFile.checkType(agent_string, STRINGP);
        {
            SubLObject counts = corba_hpac_project_counts(corba_connection, corba_predicate, project, filename, agent_string);
            if (corba_predicate == $$hpacFatalityCountForProject) {
                return counts.first();
            } else
                if (corba_predicate == $$hpacInjuryCountForProject) {
                    return second(counts);
                } else
                    if (corba_predicate == $$hpacCasualtyCountForProject) {
                        return third(counts);
                    } else {
                        return NIL;
                    }


        }
    }

    public static final SubLObject corba_hpac_project_counts(SubLObject corba_connection, SubLObject corba_predicate, SubLObject project, SubLObject filename, SubLObject agent_string) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(corba_predicate, CORBA_PREDICATE_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject windows_filename = cconcatenate($str_alt10$_, string_utilities.string_substitute($str_alt10$_, $str_alt11$_, filename, UNPROVIDED));
            SubLObject corba_form = list(project, windows_filename, agent_string);
            SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, corba_form);
            SubLObject file_contents = NIL;
            if (NIL != corba_utilities.corba_connection_eval_errorP(result)) {
                Errors.error($str_alt12$_A, result);
            }
            {
                SubLObject lines = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt14$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject line = NIL;
                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    lines = cons(line, lines);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                file_contents = string_utilities.join_strings(nreverse(lines), string_utilities.$new_line_string$.getGlobalValue());
                return corba_hpac_project_casualty_count_parser(file_contents);
            }
        }
    }

    public static final SubLObject corba_hpac_project_casualty_count_parser(SubLObject results) {
        {
            SubLObject fatalities_string = string_utilities.get_substring_between_tags(results, $$$Fatalities, $$$Injuries, UNPROVIDED, UNPROVIDED);
            SubLObject fatalities = parse_integer(fatalities_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject injuries_string = string_utilities.get_substring_between_tags(results, $$$Injuries, $$$Casualties, UNPROVIDED, UNPROVIDED);
            SubLObject injuries = parse_integer(injuries_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject casualties_string = string_utilities.get_substring_between_tags(results, $$$Casualties, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject casualties = parse_integer(casualties_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list(fatalities, injuries, casualties);
        }
    }

    public static final SubLObject corba_hpac_project_duration_expand(SubLObject literal, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
                SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
                SubLObject arg1_var = el_utilities.literal_arg1(literal, UNPROVIDED);
                SubLObject arg2_project = el_utilities.literal_arg2(literal, UNPROVIDED);
                if (NIL == sksi_sks_accessors.sks_p(sks)) {
                    return NIL;
                }
                {
                    SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
                    if (NIL == corba_utilities.corba_connection_p(corba_connection)) {
                        return NIL;
                    }
                    {
                        SubLObject corba_form = list(arg2_project);
                        SubLObject result = corba_utilities.corba_connection_eval(corba_connection, $$hpacDurationForProject, corba_form);
                        if (NIL != corba_utilities.corba_connection_eval_errorP(result)) {
                            Errors.error($str_alt12$_A, result);
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list($$hpacDurationForProject, result, arg2_project), UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_corba_hpac_removal_modules_file() {
        declareFunction("corba_hpac_fatality_rate_for_project_at_lat_long_expand_old", "CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-OLD", 2, 0, false);
        declareFunction("corba_hpac_casualty_rate_for_project_at_lat_long_expand_old", "CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-OLD", 2, 0, false);
        declareFunction("corba_hpac_rate_for_project_at_lat_long_expand_old_int", "CORBA-HPAC-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-OLD-INT", 3, 0, false);
        declareFunction("corba_hpac_rate_for_project_at_lat_long_old", "CORBA-HPAC-RATE-FOR-PROJECT-AT-LAT-LONG-OLD", 6, 0, false);
        declareFunction("corba_hpac_project_fatality_count_expand_old", "CORBA-HPAC-PROJECT-FATALITY-COUNT-EXPAND-OLD", 2, 0, false);
        declareFunction("corba_hpac_project_injury_count_expand_old", "CORBA-HPAC-PROJECT-INJURY-COUNT-EXPAND-OLD", 2, 0, false);
        declareFunction("corba_hpac_project_casualty_count_expand_old", "CORBA-HPAC-PROJECT-CASUALTY-COUNT-EXPAND-OLD", 2, 0, false);
        declareFunction("corba_hpac_project_count_expand_old_int", "CORBA-HPAC-PROJECT-COUNT-EXPAND-OLD-INT", 3, 0, false);
        declareFunction("corba_hpac_project_count_old", "CORBA-HPAC-PROJECT-COUNT-OLD", 4, 0, false);
        declareFunction("corba_hpac_project_counts_old", "CORBA-HPAC-PROJECT-COUNTS-OLD", 4, 0, false);
        declareFunction("corba_hpac_fatality_rate_for_project_at_lat_long_expand", "CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND", 2, 0, false);
        declareFunction("corba_hpac_casualty_rate_for_project_at_lat_long_expand", "CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND", 2, 0, false);
        declareFunction("corba_hpac_rate_for_project_at_lat_long_expand_int", "CORBA-HPAC-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-INT", 3, 0, false);
        declareFunction("corba_hpac_rate_for_project_at_lat_long", "CORBA-HPAC-RATE-FOR-PROJECT-AT-LAT-LONG", 7, 0, false);
        declareFunction("corba_hpac_rate_for_project_at_lat_long_parser", "CORBA-HPAC-RATE-FOR-PROJECT-AT-LAT-LONG-PARSER", 1, 0, false);
        declareFunction("corba_hpac_project_fatality_count_expand", "CORBA-HPAC-PROJECT-FATALITY-COUNT-EXPAND", 2, 0, false);
        declareFunction("corba_hpac_project_injury_count_expand", "CORBA-HPAC-PROJECT-INJURY-COUNT-EXPAND", 2, 0, false);
        declareFunction("corba_hpac_project_casualty_count_expand", "CORBA-HPAC-PROJECT-CASUALTY-COUNT-EXPAND", 2, 0, false);
        declareFunction("corba_hpac_project_count_expand_int", "CORBA-HPAC-PROJECT-COUNT-EXPAND-INT", 3, 0, false);
        declareFunction("corba_hpac_project_count", "CORBA-HPAC-PROJECT-COUNT", 5, 0, false);
        declareFunction("corba_hpac_project_counts", "CORBA-HPAC-PROJECT-COUNTS", 5, 0, false);
        declareFunction("corba_hpac_project_casualty_count_parser", "CORBA-HPAC-PROJECT-CASUALTY-COUNT-PARSER", 1, 0, false);
        declareFunction("corba_hpac_project_duration_expand", "CORBA-HPAC-PROJECT-DURATION-EXPAND", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_corba_hpac_removal_modules_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_hpac_removal_modules_file() {
                corba_utilities.clear_corba_caches();
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_FATALITY_RATE_FOR_PROJECT_AT_LAT_LONG_OLD, $list_alt1);
        inference_modules.register_solely_specific_removal_module_predicate($const2$hpacFatalityRateForProjectAtLatLo);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_CASUALTY_RATE_FOR_PROJECT_AT_LAT_LONG_OLD, $list_alt4);
        inference_modules.register_solely_specific_removal_module_predicate($const5$hpacCasualtyRateForProjectAtLatLo);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_FATALITY_COUNT, $list_alt16);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacFatalityCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_INJURY_COUNT, $list_alt19);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacInjuryCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_CASUALTY_COUNT, $list_alt22);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacCasualtyCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_FATALITY_RATE_FOR_PROJECT_AT_LAT_LONG, $list_alt26);
        inference_modules.register_solely_specific_removal_module_predicate($const2$hpacFatalityRateForProjectAtLatLo);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_CASUALTY_RATE_FOR_PROJECT_AT_LAT_LONG, $list_alt28);
        inference_modules.register_solely_specific_removal_module_predicate($const5$hpacCasualtyRateForProjectAtLatLo);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_FATALITY_COUNT, $list_alt30);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacFatalityCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_INJURY_COUNT, $list_alt31);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacInjuryCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_CASUALTY_COUNT, $list_alt32);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacCasualtyCountForProject);
        inference_modules.inference_removal_module($REMOVAL_CORBA_HPAC_PROJECT_DURATION, $list_alt37);
        inference_modules.register_solely_specific_removal_module_predicate($$hpacDurationForProject);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $REMOVAL_CORBA_HPAC_FATALITY_RATE_FOR_PROJECT_AT_LAT_LONG_OLD = makeKeyword("REMOVAL-CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG-OLD");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacFatalityRateForProjectAtLatLong")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacFatalityRateForProjectAtLatLong")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-OLD"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacFatalityRateForProjectAtLatLong <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $const2$hpacFatalityRateForProjectAtLatLo = constant_handles.reader_make_constant_shell(makeString("hpacFatalityRateForProjectAtLatLong"));

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_CASUALTY_RATE_FOR_PROJECT_AT_LAT_LONG_OLD = makeKeyword("REMOVAL-CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG-OLD");

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacCasualtyRateForProjectAtLatLong")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacCasualtyRateForProjectAtLatLong")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND-OLD"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacCasualtyRateForProjectAtLatLong <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $const5$hpacCasualtyRateForProjectAtLatLo = constant_handles.reader_make_constant_shell(makeString("hpacCasualtyRateForProjectAtLatLong"));



    private static final SubLSymbol CORBA_CONNECTION_P = makeSymbol("CORBA-CONNECTION-P");





    static private final SubLString $str_alt10$_ = makeString("\\");

    static private final SubLString $str_alt11$_ = makeString("/");

    static private final SubLString $str_alt12$_A = makeString("~A");



    static private final SubLString $str_alt14$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_PROJECT_FATALITY_COUNT = makeKeyword("REMOVAL-CORBA-HPAC-PROJECT-FATALITY-COUNT");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacFatalityCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacFatalityCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-FATALITY-COUNT-EXPAND-OLD"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacFatalityCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $$hpacFatalityCountForProject = constant_handles.reader_make_constant_shell(makeString("hpacFatalityCountForProject"));

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_PROJECT_INJURY_COUNT = makeKeyword("REMOVAL-CORBA-HPAC-PROJECT-INJURY-COUNT");

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacInjuryCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacInjuryCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-INJURY-COUNT-EXPAND-OLD"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacInjuryCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $$hpacInjuryCountForProject = constant_handles.reader_make_constant_shell(makeString("hpacInjuryCountForProject"));

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_PROJECT_CASUALTY_COUNT = makeKeyword("REMOVAL-CORBA-HPAC-PROJECT-CASUALTY-COUNT");

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacCasualtyCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacCasualtyCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-CASUALTY-COUNT-EXPAND-OLD"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacCasualtyCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $$hpacCasualtyCountForProject = constant_handles.reader_make_constant_shell(makeString("hpacCasualtyCountForProject"));

    private static final SubLSymbol CORBA_PREDICATE_P = makeSymbol("CORBA-PREDICATE-P");

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_FATALITY_RATE_FOR_PROJECT_AT_LAT_LONG = makeKeyword("REMOVAL-CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG");

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacFatalityRateForProjectAtLatLong")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacFatalityRateForProjectAtLatLong")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-FATALITY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacFatalityRateForProjectAtLatLong <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_CASUALTY_RATE_FOR_PROJECT_AT_LAT_LONG = makeKeyword("REMOVAL-CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG");

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacCasualtyRateForProjectAtLatLong")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacCasualtyRateForProjectAtLatLong")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-CASUALTY-RATE-FOR-PROJECT-AT-LAT-LONG-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacCasualtyRateForProjectAtLatLong <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    static private final SubLString $str_alt29$__Entries____________ = makeString("# Entries          : ");

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacFatalityCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacFatalityCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-FATALITY-COUNT-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacFatalityCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacInjuryCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacInjuryCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-INJURY-COUNT-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacInjuryCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    static private final SubLList $list_alt32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacCasualtyCountForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacCasualtyCountForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-CASUALTY-COUNT-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacCasualtyCountForProject <not-fully-bound-p> <fully-bound-p> <fully-bound-p> <fully-bound-p>)") });

    static private final SubLString $$$Fatalities = makeString("Fatalities");

    static private final SubLString $$$Injuries = makeString("Injuries");

    static private final SubLString $$$Casualties = makeString("Casualties");

    private static final SubLSymbol $REMOVAL_CORBA_HPAC_PROJECT_DURATION = makeKeyword("REMOVAL-CORBA-HPAC-PROJECT-DURATION");

    static private final SubLList $list_alt37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("hpacDurationForProject")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("hpacDurationForProject")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), FIVE_INTEGER, makeKeyword("EXPAND"), makeSymbol("CORBA-HPAC-PROJECT-DURATION-EXPAND"), makeKeyword("REQUIRED-MT"), list(makeSymbol("FIND-NART"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(makeString("HPAC-KS"))))), makeKeyword("DOCUMENTATION"), makeString("(#$hpacDurationForProject <not-fully-bound-p> <fully-bound-p>)") });

    public static final SubLObject $$hpacDurationForProject = constant_handles.reader_make_constant_shell(makeString("hpacDurationForProject"));

    // // Initializers
    public void declareFunctions() {
        declare_corba_hpac_removal_modules_file();
    }

    public void initializeVariables() {
        init_corba_hpac_removal_modules_file();
    }

    public void runTopLevelForms() {
        setup_corba_hpac_removal_modules_file();
    }
}

