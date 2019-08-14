/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.decision_tree;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      PROBABLY-APPROXIMATELY-DONE
 *  source file: /cyc/top/cycl/inference/harness/probably-approximately-done.lisp
 *  created:     2019/07/03 17:37:42
 */
public final class probably_approximately_done extends SubLTranslatedFile implements V02 {
    // // Constructor
    private probably_approximately_done() {
    }

    public static final SubLFile me = new probably_approximately_done();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.probably_approximately_done";

    // // Definitions
    /**
     * Loads INPUT-FILE and writes EVERY-NTH query to OUTPUT-FILE in internal-id format.
     */
    public static final SubLObject extract_queries_for_pad_corpus(SubLObject input_file, SubLObject output_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(output_file, FILE_VALID_FOR_WRITING_P);
            format_nil.force_format(T, $str_alt1$Extracting_queries_from__a__, input_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject filename_var = output_file;
                if (NIL != filename_var) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename_var, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt3$Unable_to_open__S, filename_var);
                            }
                            {
                                SubLObject output_stream = stream;
                                SubLObject done_varP = NIL;
                                SubLObject i = ZERO_INTEGER;
                                SubLObject stream_1 = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream_1 = compatibility.open_binary(input_file, $INPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream_1.isStream()) {
                                        Errors.error($str_alt3$Unable_to_open__S, input_file);
                                    }
                                    {
                                        SubLObject input_stream = stream_1;
                                        {
                                            SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                            try {
                                                $cfasl_common_symbols$.bind(NIL, thread);
                                                cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                                while (NIL == done_varP) {
                                                    {
                                                        SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                                        if ($EOF == query_info) {
                                                            done_varP = T;
                                                        } else
                                                            if (query_info.isString()) {
                                                                Errors.warn($str_alt6$Read_invalid_query_info__s, query_info);
                                                            } else {
                                                                inference_analysis.write_asked_query_to_stream(output_stream, query_info, NIL);
                                                                count = add(count, ONE_INTEGER);
                                                                i = add(i, ONE_INTEGER);
                                                            }

                                                    }
                                                } 
                                            } finally {
                                                $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream_1.isStream()) {
                                                close(stream_1, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
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
                } else {
                    {
                        SubLObject output_stream = NIL;
                        SubLObject done_varP = NIL;
                        SubLObject i = ZERO_INTEGER;
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(input_file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt3$Unable_to_open__S, input_file);
                            }
                            {
                                SubLObject input_stream = stream;
                                {
                                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                    try {
                                        $cfasl_common_symbols$.bind(NIL, thread);
                                        cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                        while (NIL == done_varP) {
                                            {
                                                SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                                if ($EOF == query_info) {
                                                    done_varP = T;
                                                } else
                                                    if (query_info.isString()) {
                                                        Errors.warn($str_alt6$Read_invalid_query_info__s, query_info);
                                                    } else {
                                                        inference_analysis.write_asked_query_to_stream(output_stream, query_info, NIL);
                                                        count = add(count, ONE_INTEGER);
                                                        i = add(i, ONE_INTEGER);
                                                    }

                                            }
                                        } 
                                    } finally {
                                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                                    }
                                }
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
                }
                return count;
            }
        }
    }

    public static final SubLObject validate_saved_queries(SubLObject input_file, SubLObject output_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(output_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject output_stream = stream;
                        SubLObject done_varP = NIL;
                        SubLObject i = ZERO_INTEGER;
                        SubLObject stream_2 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_2 = compatibility.open_binary(input_file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_2.isStream()) {
                                Errors.error($str_alt3$Unable_to_open__S, input_file);
                            }
                            {
                                SubLObject input_stream = stream_2;
                                {
                                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                    try {
                                        $cfasl_common_symbols$.bind(NIL, thread);
                                        cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                        while (NIL == done_varP) {
                                            {
                                                SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                                if ($EOF == query_info) {
                                                    done_varP = T;
                                                } else
                                                    if (query_info.isString()) {
                                                        Errors.warn($str_alt6$Read_invalid_query_info__s, query_info);
                                                    } else {
                                                        if (NIL != query_info_good_for_pad_corpusP(query_info)) {
                                                            inference_analysis.write_asked_query_to_stream(output_stream, query_info, NIL);
                                                            count = add(count, ONE_INTEGER);
                                                        }
                                                        i = add(i, ONE_INTEGER);
                                                    }

                                            }
                                        } 
                                    } finally {
                                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_2.isStream()) {
                                        close(stream_2, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
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
                return count;
            }
        }
    }

    public static final SubLObject query_info_good_for_pad_corpusP(SubLObject query_info) {
        if (NIL != inference_analysis.valid_query_infoP(query_info)) {
            {
                SubLObject datum = query_info;
                SubLObject current = datum;
                SubLObject sentence = NIL;
                SubLObject mt = NIL;
                SubLObject query_properties = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                query_properties = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject dwimmed_query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, $list_alt8);
                        if (NIL != clauses.dnf_clauses_p(sentence)) {
                            sentence = inference_czer.problem_query_formula(sentence);
                        }
                        {
                            SubLObject halt_reason = nth_value_step_2(nth_value_step_1(ONE_INTEGER), inference_trivial.new_cyc_trivial_query(sentence, mt, dwimmed_query_properties));
                            return eq($NON_TRIVIAL, halt_reason);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject randomize_saved_queries(SubLObject input_file, SubLObject output_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_infos = inference_analysis.load_asked_queries(input_file, UNPROVIDED);
                SubLObject randomized_query_infos = list_utilities.randomize_list(query_infos);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(output_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject output_stream = stream;
                        SubLObject cdolist_list_var = randomized_query_infos;
                        SubLObject query_info = NIL;
                        for (query_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_info = cdolist_list_var.first()) {
                            inference_analysis.write_asked_query_to_stream(output_stream, query_info, NIL);
                        }
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
                return length(randomized_query_infos);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $pad_metrics_enabledP$ = makeSymbol("*PAD-METRICS-ENABLED?*");

    public static final SubLObject pad_metrics_enabledP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $pad_metrics_enabledP$.getDynamicValue(thread);
        }
    }

    public static final class $pad_metrics_data_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return probably_approximately_done.$pad_metrics_data_native.structDecl;
        }

        public SubLObject getField2() {
            return $any_more_answers_comingP;
        }

        public SubLObject getField3() {
            return $answer_count_so_far;
        }

        public SubLObject getField4() {
            return $time_elapsed;
        }

        public SubLObject getField5() {
            return $time_left;
        }

        public SubLObject getField6() {
            return $max_transformation_depth_reached;
        }

        public SubLObject getField7() {
            return $lowest_rule_utility_executed;
        }

        public SubLObject getField8() {
            return $lowest_rule_utility_executed_at_the_max_transformation_depth_reached;
        }

        public SubLObject getField9() {
            return $problem_count;
        }

        public SubLObject getField10() {
            return $link_count;
        }

        public SubLObject getField11() {
            return $proof_count;
        }

        public SubLObject getField12() {
            return $good_problem_count;
        }

        public SubLObject getField13() {
            return $neutral_problem_count;
        }

        public SubLObject getField14() {
            return $no_good_problem_count;
        }

        public SubLObject getField15() {
            return $finished_problem_count;
        }

        public SubLObject getField16() {
            return $unexamined_good_problem_count;
        }

        public SubLObject getField17() {
            return $no_good_join_problem_count;
        }

        public SubLObject getField18() {
            return $discarded_tactic_count;
        }

        public SubLObject getField19() {
            return $new_root_count;
        }

        public SubLObject getField20() {
            return $new_root_start_internal_real_time;
        }

        public SubLObject getField21() {
            return $new_root_time_elapsed;
        }

        public SubLObject getField22() {
            return $answer_count_so_far_for_this_new_root;
        }

        public SubLObject getField23() {
            return $direction;
        }

        public SubLObject getField24() {
            return $max_transformation_depth;
        }

        public SubLObject getField25() {
            return $answer_count_at_previous_transformation_depth;
        }

        public SubLObject setField2(SubLObject value) {
            return $any_more_answers_comingP = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $answer_count_so_far = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $time_elapsed = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $time_left = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $max_transformation_depth_reached = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $lowest_rule_utility_executed = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $lowest_rule_utility_executed_at_the_max_transformation_depth_reached = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $problem_count = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $link_count = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $proof_count = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $good_problem_count = value;
        }

        public SubLObject setField13(SubLObject value) {
            return $neutral_problem_count = value;
        }

        public SubLObject setField14(SubLObject value) {
            return $no_good_problem_count = value;
        }

        public SubLObject setField15(SubLObject value) {
            return $finished_problem_count = value;
        }

        public SubLObject setField16(SubLObject value) {
            return $unexamined_good_problem_count = value;
        }

        public SubLObject setField17(SubLObject value) {
            return $no_good_join_problem_count = value;
        }

        public SubLObject setField18(SubLObject value) {
            return $discarded_tactic_count = value;
        }

        public SubLObject setField19(SubLObject value) {
            return $new_root_count = value;
        }

        public SubLObject setField20(SubLObject value) {
            return $new_root_start_internal_real_time = value;
        }

        public SubLObject setField21(SubLObject value) {
            return $new_root_time_elapsed = value;
        }

        public SubLObject setField22(SubLObject value) {
            return $answer_count_so_far_for_this_new_root = value;
        }

        public SubLObject setField23(SubLObject value) {
            return $direction = value;
        }

        public SubLObject setField24(SubLObject value) {
            return $max_transformation_depth = value;
        }

        public SubLObject setField25(SubLObject value) {
            return $answer_count_at_previous_transformation_depth = value;
        }

        public SubLObject $any_more_answers_comingP = Lisp.NIL;

        public SubLObject $answer_count_so_far = Lisp.NIL;

        public SubLObject $time_elapsed = Lisp.NIL;

        public SubLObject $time_left = Lisp.NIL;

        public SubLObject $max_transformation_depth_reached = Lisp.NIL;

        public SubLObject $lowest_rule_utility_executed = Lisp.NIL;

        public SubLObject $lowest_rule_utility_executed_at_the_max_transformation_depth_reached = Lisp.NIL;

        public SubLObject $problem_count = Lisp.NIL;

        public SubLObject $link_count = Lisp.NIL;

        public SubLObject $proof_count = Lisp.NIL;

        public SubLObject $good_problem_count = Lisp.NIL;

        public SubLObject $neutral_problem_count = Lisp.NIL;

        public SubLObject $no_good_problem_count = Lisp.NIL;

        public SubLObject $finished_problem_count = Lisp.NIL;

        public SubLObject $unexamined_good_problem_count = Lisp.NIL;

        public SubLObject $no_good_join_problem_count = Lisp.NIL;

        public SubLObject $discarded_tactic_count = Lisp.NIL;

        public SubLObject $new_root_count = Lisp.NIL;

        public SubLObject $new_root_start_internal_real_time = Lisp.NIL;

        public SubLObject $new_root_time_elapsed = Lisp.NIL;

        public SubLObject $answer_count_so_far_for_this_new_root = Lisp.NIL;

        public SubLObject $direction = Lisp.NIL;

        public SubLObject $max_transformation_depth = Lisp.NIL;

        public SubLObject $answer_count_at_previous_transformation_depth = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(probably_approximately_done.$pad_metrics_data_native.class, PAD_METRICS_DATA, PAD_METRICS_DATA_P, $list_alt12, $list_alt13, new String[]{ "$any_more_answers_comingP", "$answer_count_so_far", "$time_elapsed", "$time_left", "$max_transformation_depth_reached", "$lowest_rule_utility_executed", "$lowest_rule_utility_executed_at_the_max_transformation_depth_reached", "$problem_count", "$link_count", "$proof_count", "$good_problem_count", "$neutral_problem_count", "$no_good_problem_count", "$finished_problem_count", "$unexamined_good_problem_count", "$no_good_join_problem_count", "$discarded_tactic_count", "$new_root_count", "$new_root_start_internal_real_time", "$new_root_time_elapsed", "$answer_count_so_far_for_this_new_root", "$direction", "$max_transformation_depth", "$answer_count_at_previous_transformation_depth" }, $list_alt14, $list_alt15, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_pad_metrics_data$ = makeSymbol("*DTP-PAD-METRICS-DATA*");

    public static final SubLObject pad_metrics_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pad_metrics_data_p(SubLObject v_object) {
        return v_object.getClass() == probably_approximately_done.$pad_metrics_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $pad_metrics_data_p$UnaryFunction extends UnaryFunction {
        public $pad_metrics_data_p$UnaryFunction() {
            super(extractFunctionNamed("PAD-METRICS-DATA-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return pad_metrics_data_p(arg1);
        }
    }

    public static final SubLObject pmd_any_more_answers_comingP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField2();
    }

    public static final SubLObject pmd_answer_count_so_far(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField3();
    }

    public static final SubLObject pmd_time_elapsed(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField4();
    }

    public static final SubLObject pmd_time_left(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField5();
    }

    public static final SubLObject pmd_max_transformation_depth_reached(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField6();
    }

    public static final SubLObject pmd_lowest_rule_utility_executed(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField7();
    }

    public static final SubLObject pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField8();
    }

    public static final SubLObject pmd_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField9();
    }

    public static final SubLObject pmd_link_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField10();
    }

    public static final SubLObject pmd_proof_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField11();
    }

    public static final SubLObject pmd_good_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField12();
    }

    public static final SubLObject pmd_neutral_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField13();
    }

    public static final SubLObject pmd_no_good_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField14();
    }

    public static final SubLObject pmd_finished_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField15();
    }

    public static final SubLObject pmd_unexamined_good_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField16();
    }

    public static final SubLObject pmd_no_good_join_problem_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField17();
    }

    public static final SubLObject pmd_discarded_tactic_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField18();
    }

    public static final SubLObject pmd_new_root_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField19();
    }

    public static final SubLObject pmd_new_root_start_internal_real_time(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.getField20();
    }

    public static final SubLObject pmd_new_root_time_elapsed(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$new_root_time_elapsed;
    }

    public static final SubLObject pmd_answer_count_so_far_for_this_new_root(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$answer_count_so_far_for_this_new_root;
    }

    public static final SubLObject pmd_direction(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$direction;
    }

    public static final SubLObject pmd_max_transformation_depth(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$max_transformation_depth;
    }

    public static final SubLObject pmd_answer_count_at_previous_transformation_depth(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$answer_count_at_previous_transformation_depth;
    }

    public static final SubLObject _csetf_pmd_any_more_answers_comingP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pmd_answer_count_so_far(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pmd_time_elapsed(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pmd_time_left(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pmd_max_transformation_depth_reached(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_pmd_lowest_rule_utility_executed(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_pmd_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_pmd_link_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_pmd_proof_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_pmd_good_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_pmd_neutral_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_pmd_no_good_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_pmd_finished_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_pmd_unexamined_good_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_pmd_no_good_join_problem_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_pmd_discarded_tactic_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_pmd_new_root_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField19(value);
    }

    public static final SubLObject _csetf_pmd_new_root_start_internal_real_time(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return v_object.setField20(value);
    }

    public static final SubLObject _csetf_pmd_new_root_time_elapsed(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$new_root_time_elapsed = value;
    }

    public static final SubLObject _csetf_pmd_answer_count_so_far_for_this_new_root(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$answer_count_so_far_for_this_new_root = value;
    }

    public static final SubLObject _csetf_pmd_direction(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$direction = value;
    }

    public static final SubLObject _csetf_pmd_max_transformation_depth(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$max_transformation_depth = value;
    }

    public static final SubLObject _csetf_pmd_answer_count_at_previous_transformation_depth(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PAD_METRICS_DATA_P);
        return ((probably_approximately_done.$pad_metrics_data_native) (v_object)).$answer_count_at_previous_transformation_depth = value;
    }

    public static final SubLObject make_pad_metrics_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new probably_approximately_done.$pad_metrics_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($kw71$ANY_MORE_ANSWERS_COMING_)) {
                        _csetf_pmd_any_more_answers_comingP(v_new, current_value);
                    } else
                        if (pcase_var.eql($ANSWER_COUNT_SO_FAR)) {
                            _csetf_pmd_answer_count_so_far(v_new, current_value);
                        } else
                            if (pcase_var.eql($TIME_ELAPSED)) {
                                _csetf_pmd_time_elapsed(v_new, current_value);
                            } else
                                if (pcase_var.eql($TIME_LEFT)) {
                                    _csetf_pmd_time_left(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MAX_TRANSFORMATION_DEPTH_REACHED)) {
                                        _csetf_pmd_max_transformation_depth_reached(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($LOWEST_RULE_UTILITY_EXECUTED)) {
                                            _csetf_pmd_lowest_rule_utility_executed(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($kw77$LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION_DEPTH_REAC)) {
                                                _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PROBLEM_COUNT)) {
                                                    _csetf_pmd_problem_count(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($LINK_COUNT)) {
                                                        _csetf_pmd_link_count(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PROOF_COUNT)) {
                                                            _csetf_pmd_proof_count(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($GOOD_PROBLEM_COUNT)) {
                                                                _csetf_pmd_good_problem_count(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($NEUTRAL_PROBLEM_COUNT)) {
                                                                    _csetf_pmd_neutral_problem_count(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($NO_GOOD_PROBLEM_COUNT)) {
                                                                        _csetf_pmd_no_good_problem_count(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($FINISHED_PROBLEM_COUNT)) {
                                                                            _csetf_pmd_finished_problem_count(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($UNEXAMINED_GOOD_PROBLEM_COUNT)) {
                                                                                _csetf_pmd_unexamined_good_problem_count(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($NO_GOOD_JOIN_PROBLEM_COUNT)) {
                                                                                    _csetf_pmd_no_good_join_problem_count(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql($DISCARDED_TACTIC_COUNT)) {
                                                                                        _csetf_pmd_discarded_tactic_count(v_new, current_value);
                                                                                    } else
                                                                                        if (pcase_var.eql($NEW_ROOT_COUNT)) {
                                                                                            _csetf_pmd_new_root_count(v_new, current_value);
                                                                                        } else
                                                                                            if (pcase_var.eql($NEW_ROOT_START_INTERNAL_REAL_TIME)) {
                                                                                                _csetf_pmd_new_root_start_internal_real_time(v_new, current_value);
                                                                                            } else
                                                                                                if (pcase_var.eql($NEW_ROOT_TIME_ELAPSED)) {
                                                                                                    _csetf_pmd_new_root_time_elapsed(v_new, current_value);
                                                                                                } else
                                                                                                    if (pcase_var.eql($ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT)) {
                                                                                                        _csetf_pmd_answer_count_so_far_for_this_new_root(v_new, current_value);
                                                                                                    } else
                                                                                                        if (pcase_var.eql($DIRECTION)) {
                                                                                                            _csetf_pmd_direction(v_new, current_value);
                                                                                                        } else
                                                                                                            if (pcase_var.eql($MAX_TRANSFORMATION_DEPTH)) {
                                                                                                                _csetf_pmd_max_transformation_depth(v_new, current_value);
                                                                                                            } else
                                                                                                                if (pcase_var.eql($ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH)) {
                                                                                                                    _csetf_pmd_answer_count_at_previous_transformation_depth(v_new, current_value);
                                                                                                                } else {
                                                                                                                    Errors.error($str_alt95$Invalid_slot__S_for_construction_, current_arg);
                                                                                                                }























                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_pad_metrics_data() {
        {
            SubLObject pmd = make_pad_metrics_data(UNPROVIDED);
            _csetf_pmd_any_more_answers_comingP(pmd, $UNINITIALIZED);
            _csetf_pmd_answer_count_so_far(pmd, ZERO_INTEGER);
            _csetf_pmd_time_elapsed(pmd, $UNINITIALIZED);
            _csetf_pmd_time_left(pmd, $UNINITIALIZED);
            _csetf_pmd_max_transformation_depth_reached(pmd, ZERO_INTEGER);
            _csetf_pmd_lowest_rule_utility_executed(pmd, $int$100);
            _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd, $int$100);
            _csetf_pmd_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_link_count(pmd, ZERO_INTEGER);
            _csetf_pmd_proof_count(pmd, ZERO_INTEGER);
            _csetf_pmd_good_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_neutral_problem_count(pmd, ONE_INTEGER);
            _csetf_pmd_no_good_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_finished_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_unexamined_good_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_no_good_join_problem_count(pmd, ZERO_INTEGER);
            _csetf_pmd_discarded_tactic_count(pmd, ZERO_INTEGER);
            _csetf_pmd_new_root_count(pmd, ZERO_INTEGER);
            _csetf_pmd_new_root_start_internal_real_time(pmd, $UNINITIALIZED);
            _csetf_pmd_new_root_time_elapsed(pmd, $UNINITIALIZED);
            _csetf_pmd_answer_count_so_far_for_this_new_root(pmd, ZERO_INTEGER);
            _csetf_pmd_direction(pmd, $UNINITIALIZED);
            _csetf_pmd_max_transformation_depth(pmd, $UNINITIALIZED);
            _csetf_pmd_answer_count_at_previous_transformation_depth(pmd, ZERO_INTEGER);
            return pmd;
        }
    }

    public static final SubLObject clone_pad_metrics_data(SubLObject old_pmd) {
        {
            SubLObject new_pmd = make_pad_metrics_data(UNPROVIDED);
            _csetf_pmd_any_more_answers_comingP(new_pmd, $UNINITIALIZED);
            _csetf_pmd_answer_count_so_far(new_pmd, pmd_answer_count_so_far(old_pmd));
            _csetf_pmd_time_elapsed(new_pmd, $UNINITIALIZED);
            _csetf_pmd_time_left(new_pmd, $UNINITIALIZED);
            _csetf_pmd_max_transformation_depth_reached(new_pmd, pmd_max_transformation_depth_reached(old_pmd));
            _csetf_pmd_lowest_rule_utility_executed(new_pmd, pmd_lowest_rule_utility_executed(old_pmd));
            _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(new_pmd, pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(old_pmd));
            _csetf_pmd_problem_count(new_pmd, pmd_problem_count(old_pmd));
            _csetf_pmd_link_count(new_pmd, pmd_link_count(old_pmd));
            _csetf_pmd_proof_count(new_pmd, pmd_proof_count(old_pmd));
            _csetf_pmd_good_problem_count(new_pmd, pmd_good_problem_count(old_pmd));
            _csetf_pmd_neutral_problem_count(new_pmd, pmd_neutral_problem_count(old_pmd));
            _csetf_pmd_no_good_problem_count(new_pmd, pmd_no_good_problem_count(old_pmd));
            _csetf_pmd_finished_problem_count(new_pmd, pmd_finished_problem_count(old_pmd));
            _csetf_pmd_unexamined_good_problem_count(new_pmd, pmd_unexamined_good_problem_count(old_pmd));
            _csetf_pmd_no_good_join_problem_count(new_pmd, pmd_no_good_join_problem_count(old_pmd));
            _csetf_pmd_discarded_tactic_count(new_pmd, pmd_discarded_tactic_count(old_pmd));
            _csetf_pmd_new_root_count(new_pmd, pmd_new_root_count(old_pmd));
            _csetf_pmd_new_root_start_internal_real_time(new_pmd, pmd_new_root_start_internal_real_time(old_pmd));
            _csetf_pmd_new_root_time_elapsed(new_pmd, $UNINITIALIZED);
            _csetf_pmd_answer_count_so_far_for_this_new_root(new_pmd, pmd_answer_count_so_far_for_this_new_root(old_pmd));
            _csetf_pmd_direction(new_pmd, pmd_direction(old_pmd));
            _csetf_pmd_max_transformation_depth(new_pmd, pmd_max_transformation_depth(old_pmd));
            _csetf_pmd_answer_count_at_previous_transformation_depth(new_pmd, pmd_answer_count_at_previous_transformation_depth(old_pmd));
            return new_pmd;
        }
    }

    public static final SubLObject current_pad_metrics_data() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_macros.$pad_metrics_data$.getDynamicValue(thread).first();
        }
    }

    /**
     * in seconds
     */
    // deflexical
    private static final SubLSymbol $pad_metrics_update_frequency$ = makeSymbol("*PAD-METRICS-UPDATE-FREQUENCY*");

    public static final SubLObject possibly_update_pad_metrics(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pad_gathering_metricsP()) {
                {
                    SubLObject previous_pmd = second(inference_macros.$pad_metrics_data$.getDynamicValue(thread));
                    if (NIL == previous_pmd) {
                        return pad_update_metrics(inference, NIL);
                    } else {
                        {
                            SubLObject previous_pmd_time_elapsed = pmd_time_elapsed(previous_pmd);
                            SubLObject next_update_time_elapsed = add(previous_pmd_time_elapsed, $pad_metrics_update_frequency$.getGlobalValue());
                            SubLObject current_time_elapsed = inference_datastructures_inference.inference_time_so_far(inference, NIL);
                            if (current_time_elapsed.numGE(next_update_time_elapsed)) {
                                return pad_update_metrics(inference, NIL);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject pad_update_metrics(SubLObject inference, SubLObject final_updateP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_count_so_far = inference_datastructures_inference.inference_answer_count(inference);
                SubLObject pmd = current_pad_metrics_data();
                _csetf_pmd_answer_count_so_far(pmd, answer_count_so_far);
                if ($DECISION_TREE == $pad_algorithm$.getDynamicValue(thread)) {
                    {
                        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                        SubLObject time_elapsed = inference_datastructures_inference.inference_time_so_far(inference, NIL);
                        SubLObject time_left = inference_datastructures_inference.inference_remaining_time(inference, NIL);
                        SubLObject problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
                        SubLObject link_count = inference_datastructures_problem_store.problem_store_link_count(store);
                        SubLObject proof_count = inference_datastructures_problem_store.problem_store_proof_count(store);
                        SubLObject direction = inference_datastructures_problem_store.problem_store_direction(store);
                        SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                        SubLObject new_root_start_internal_real_time = pmd_new_root_start_internal_real_time(pmd);
                        SubLObject new_root_time_elapsed = numeric_date_utilities.elapsed_seconds_between_internal_real_times(new_root_start_internal_real_time, get_internal_real_time());
                        _csetf_pmd_time_elapsed(pmd, time_elapsed);
                        _csetf_pmd_time_left(pmd, time_left);
                        _csetf_pmd_problem_count(pmd, problem_count);
                        _csetf_pmd_link_count(pmd, link_count);
                        _csetf_pmd_proof_count(pmd, proof_count);
                        _csetf_pmd_new_root_time_elapsed(pmd, new_root_time_elapsed);
                        _csetf_pmd_direction(pmd, direction);
                        _csetf_pmd_max_transformation_depth(pmd, max_transformation_depth);
                        if (NIL != final_updateP) {
                            pad_update_any_more_answers_coming();
                        } else {
                            inference_macros.$pad_metrics_data$.setDynamicValue(cons(clone_pad_metrics_data(pmd), inference_macros.$pad_metrics_data$.getDynamicValue(thread)), thread);
                        }
                    }
                }
                return probably_approximately_doneP(pmd);
            }
        }
    }

    public static final SubLObject pad_update_any_more_answers_coming() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject final_pmd = current_pad_metrics_data();
                SubLObject final_answer_count = pmd_answer_count_so_far(final_pmd);
                _csetf_pmd_any_more_answers_comingP(final_pmd, NIL);
                {
                    SubLObject cdolist_list_var = inference_macros.$pad_metrics_data$.getDynamicValue(thread).rest();
                    SubLObject pmd = NIL;
                    for (pmd = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pmd = cdolist_list_var.first()) {
                        {
                            SubLObject current_answer_count = pmd_answer_count_so_far(pmd);
                            SubLObject any_more_answers_comingP = numG(final_answer_count, current_answer_count);
                            _csetf_pmd_any_more_answers_comingP(pmd, any_more_answers_comingP);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject pad_note_transformation_depth(SubLObject depth) {
        if (NIL != pad_gathering_metricsP()) {
            {
                SubLObject pmd = current_pad_metrics_data();
                SubLObject max_depth = pmd_max_transformation_depth_reached(pmd);
                if (depth.numG(max_depth)) {
                    _csetf_pmd_max_transformation_depth_reached(pmd, depth);
                    _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd, $int$100);
                    _csetf_pmd_answer_count_at_previous_transformation_depth(pmd, pmd_answer_count_so_far(pmd));
                    return depth;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject pad_note_transformation_tactic_executed(SubLObject transformation_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pad_gathering_metricsP()) {
                if ($DECISION_TREE == $pad_algorithm$.getDynamicValue(thread)) {
                    {
                        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
                        if (NIL != rule) {
                            {
                                SubLObject pmd = current_pad_metrics_data();
                                SubLObject old_utility = pmd_lowest_rule_utility_executed(pmd);
                                SubLObject new_utility = inference_analysis.transformation_rule_historical_utility(rule);
                                SubLObject old_depth = pmd_max_transformation_depth_reached(pmd);
                                SubLObject new_depth = number_utilities.f_1X(inference_datastructures_problem.problem_min_transformation_depth(inference_datastructures_tactic.tactic_problem(transformation_tactic), inference_datastructures_problem_store.find_inference_by_id(inference_datastructures_tactic.tactic_store(transformation_tactic), ZERO_INTEGER)));
                                if (new_utility.numL(old_utility)) {
                                    _csetf_pmd_lowest_rule_utility_executed(pmd, new_utility);
                                }
                                if (new_depth.numGE(old_depth)) {
                                    {
                                        SubLObject old_utility_at_this_depth = pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd);
                                        if (new_utility.numL(old_utility_at_this_depth)) {
                                            _csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd, new_utility);
                                        }
                                    }
                                }
                                return T;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject pad_note_problem_status_change(SubLObject problem, SubLObject old_status, SubLObject new_status) {
        if (NIL != pad_gathering_metricsP()) {
            {
                SubLObject pmd = current_pad_metrics_data();
                SubLObject was_newP = eq($NEW, old_status);
                SubLObject was_goodP = inference_datastructures_enumerated_types.good_problem_status_p(old_status);
                SubLObject is_goodP = inference_datastructures_enumerated_types.good_problem_status_p(new_status);
                SubLObject was_neutralP = inference_datastructures_enumerated_types.neutral_problem_status_p(old_status);
                SubLObject is_neutralP = inference_datastructures_enumerated_types.neutral_problem_status_p(new_status);
                SubLObject was_no_goodP = inference_datastructures_enumerated_types.no_good_problem_status_p(old_status);
                SubLObject is_no_goodP = inference_datastructures_enumerated_types.no_good_problem_status_p(new_status);
                if ((NIL != is_goodP) && (NIL == was_goodP)) {
                    _csetf_pmd_good_problem_count(pmd, add(pmd_good_problem_count(pmd), ONE_INTEGER));
                }
                if ((NIL != was_goodP) && (NIL == is_goodP)) {
                    _csetf_pmd_good_problem_count(pmd, subtract(pmd_good_problem_count(pmd), ONE_INTEGER));
                }
                if ((NIL != is_neutralP) && ((NIL == was_neutralP) || (NIL != was_newP))) {
                    _csetf_pmd_neutral_problem_count(pmd, add(pmd_neutral_problem_count(pmd), ONE_INTEGER));
                }
                if ((NIL != was_neutralP) && (NIL == is_neutralP)) {
                    _csetf_pmd_neutral_problem_count(pmd, subtract(pmd_neutral_problem_count(pmd), ONE_INTEGER));
                }
                if ((NIL != is_no_goodP) && (NIL == was_no_goodP)) {
                    _csetf_pmd_no_good_problem_count(pmd, add(pmd_no_good_problem_count(pmd), ONE_INTEGER));
                    if (NIL != inference_datastructures_problem.join_problem_p(problem)) {
                        _csetf_pmd_no_good_join_problem_count(pmd, add(pmd_no_good_join_problem_count(pmd), ONE_INTEGER));
                    }
                }
                if ((NIL != was_no_goodP) && (NIL == is_no_goodP)) {
                    _csetf_pmd_no_good_problem_count(pmd, subtract(pmd_no_good_problem_count(pmd), ONE_INTEGER));
                    if (NIL != inference_datastructures_problem.join_problem_p(problem)) {
                        _csetf_pmd_no_good_join_problem_count(pmd, subtract(pmd_no_good_join_problem_count(pmd), ONE_INTEGER));
                    }
                }
                if (new_status == $UNEXAMINED_GOOD) {
                    _csetf_pmd_unexamined_good_problem_count(pmd, add(pmd_unexamined_good_problem_count(pmd), ONE_INTEGER));
                }
                if (old_status == $UNEXAMINED_GOOD) {
                    _csetf_pmd_unexamined_good_problem_count(pmd, subtract(pmd_unexamined_good_problem_count(pmd), ONE_INTEGER));
                }
                {
                    SubLObject was_finishedP = inference_datastructures_enumerated_types.finished_problem_status_p(old_status);
                    SubLObject is_finishedP = inference_datastructures_enumerated_types.finished_problem_status_p(new_status);
                    if ((NIL != is_finishedP) && (NIL == was_finishedP)) {
                        _csetf_pmd_finished_problem_count(pmd, add(pmd_finished_problem_count(pmd), ONE_INTEGER));
                    }
                    if ((NIL != was_finishedP) && (NIL == is_finishedP)) {
                        _csetf_pmd_finished_problem_count(pmd, subtract(pmd_finished_problem_count(pmd), ONE_INTEGER));
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject pad_note_tactic_discarded() {
        if (NIL != pad_gathering_metricsP()) {
            {
                SubLObject pmd = current_pad_metrics_data();
                _csetf_pmd_discarded_tactic_count(pmd, add(pmd_discarded_tactic_count(pmd), ONE_INTEGER));
            }
        }
        return NIL;
    }

    public static final SubLObject pad_note_new_root() {
        if (NIL != pad_gathering_metricsP()) {
            {
                SubLObject pmd = current_pad_metrics_data();
                _csetf_pmd_new_root_count(pmd, add(pmd_new_root_count(pmd), ONE_INTEGER));
                _csetf_pmd_answer_count_so_far_for_this_new_root(pmd, ZERO_INTEGER);
                _csetf_pmd_new_root_start_internal_real_time(pmd, get_internal_real_time());
            }
        }
        return NIL;
    }

    public static final SubLObject pad_note_answer() {
        if (NIL != pad_gathering_metricsP()) {
            {
                SubLObject pmd = current_pad_metrics_data();
                _csetf_pmd_answer_count_so_far_for_this_new_root(pmd, add(pmd_answer_count_so_far_for_this_new_root(pmd), ONE_INTEGER));
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $pad_metrics_output_filename$ = makeSymbol("*PAD-METRICS-OUTPUT-FILENAME*");

    // defparameter
    private static final SubLSymbol $pad_outputting_metricsP$ = makeSymbol("*PAD-OUTPUTTING-METRICS?*");

    // defparameter
    private static final SubLSymbol $pad_output_to_fileP$ = makeSymbol("*PAD-OUTPUT-TO-FILE?*");

    public static final SubLObject pad_finish_gathering_metrics(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pad_gathering_metricsP()) {
                pad_update_metrics(inference, T);
                if (NIL != $pad_outputting_metricsP$.getDynamicValue(thread)) {
                    {
                        SubLObject filename_var = (NIL != $pad_output_to_fileP$.getDynamicValue(thread)) ? ((SubLObject) ($pad_metrics_output_filename$.getGlobalValue())) : NIL;
                        if (NIL != filename_var) {
                            {
                                SubLObject stream = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_text(filename_var, $APPEND, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt3$Unable_to_open__S, filename_var);
                                    }
                                    {
                                        SubLObject stream_3 = stream;
                                        if (NIL == stream_3) {
                                            stream_3 = StreamsLow.$standard_output$.getDynamicValue(thread);
                                        }
                                        format_pad_metrics_query_header(stream_3);
                                        {
                                            SubLObject cdolist_list_var = reverse(inference_macros.$pad_metrics_data$.getDynamicValue(thread));
                                            SubLObject pmd = NIL;
                                            for (pmd = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pmd = cdolist_list_var.first()) {
                                                format_pad_metrics_data(stream_3, pmd);
                                            }
                                        }
                                        force_output(stream_3);
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
                        } else {
                            {
                                SubLObject stream = NIL;
                                if (NIL == stream) {
                                    stream = StreamsLow.$standard_output$.getDynamicValue(thread);
                                }
                                format_pad_metrics_query_header(stream);
                                {
                                    SubLObject cdolist_list_var = reverse(inference_macros.$pad_metrics_data$.getDynamicValue(thread));
                                    SubLObject pmd = NIL;
                                    for (pmd = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pmd = cdolist_list_var.first()) {
                                        format_pad_metrics_data(stream, pmd);
                                    }
                                }
                                force_output(stream);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject pad_gathering_metricsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != inference_macros.$pad_gathering_metricsP$.getDynamicValue(thread)) && (NIL == ask_utilities.within_recursive_queryP())) && (NIL == inference_worker.within_abnormality_checkingP())) && (NIL == inference_strategist.preparing_inferenceP()));
        }
    }

    public static final SubLObject pad_metrics_data_plist(SubLObject pmd) {
        {
            SubLObject time_left = pmd_time_left(pmd);
            SubLObject adjusted_time_left = (NIL != time_left) ? ((SubLObject) (time_left)) : $pad_outlier_timeout$.getGlobalValue();
            return list(new SubLObject[]{ $ANSWER_COUNT_SO_FAR, pmd_answer_count_so_far(pmd), $TIME_ELAPSED, pmd_time_elapsed(pmd), $TIME_LEFT, adjusted_time_left, $MAX_TRANSFORMATION_DEPTH_REACHED, pmd_max_transformation_depth_reached(pmd), $LOWEST_RULE_UTILITY_EXECUTED, pmd_lowest_rule_utility_executed(pmd), $kw77$LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION_DEPTH_REAC, pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd), $PROBLEM_COUNT, pmd_problem_count(pmd), $LINK_COUNT, pmd_link_count(pmd), $PROOF_COUNT, pmd_proof_count(pmd), $GOOD_PROBLEM_COUNT, pmd_good_problem_count(pmd), $NEUTRAL_PROBLEM_COUNT, pmd_neutral_problem_count(pmd), $NO_GOOD_PROBLEM_COUNT, pmd_no_good_problem_count(pmd), $FINISHED_PROBLEM_COUNT, pmd_finished_problem_count(pmd), $UNEXAMINED_GOOD_PROBLEM_COUNT, pmd_unexamined_good_problem_count(pmd), $NO_GOOD_JOIN_PROBLEM_COUNT, pmd_no_good_join_problem_count(pmd), $DISCARDED_TACTIC_COUNT, pmd_discarded_tactic_count(pmd), $NEW_ROOT_COUNT, pmd_new_root_count(pmd), $NEW_ROOT_START_INTERNAL_REAL_TIME, pmd_new_root_start_internal_real_time(pmd), $NEW_ROOT_TIME_ELAPSED, pmd_new_root_time_elapsed(pmd), $ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT, pmd_answer_count_so_far_for_this_new_root(pmd), $DIRECTION, pmd_direction(pmd), $MAX_TRANSFORMATION_DEPTH, pmd_max_transformation_depth(pmd), $ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH, pmd_answer_count_at_previous_transformation_depth(pmd) });
        }
    }

    public static final SubLObject current_pad_metrics_data_plist() {
        return pad_metrics_data_plist(current_pad_metrics_data());
    }

    // deflexical
    private static final SubLSymbol $pad_metrics_file_header$ = makeSymbol("*PAD-METRICS-FILE-HEADER*");

    public static final SubLObject format_pad_metrics_file_header(SubLObject stream) {
        format(stream, $pad_metrics_file_header$.getGlobalValue(), numeric_date_utilities.timestring(UNPROVIDED));
        return NIL;
    }

    public static final SubLObject format_pad_metrics_query_header(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $pad_query_number$.getDynamicValue(thread)) {
                format(stream, $str_alt107$__Query__a__, $pad_query_number$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject format_pad_metrics_data(SubLObject stream, SubLObject pmd) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                try {
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    {
                        SubLObject any_more_answers_comingP = pmd_any_more_answers_comingP(pmd);
                        SubLObject answer_count_so_far = pmd_answer_count_so_far(pmd);
                        SubLObject time_elapsed = pmd_time_elapsed(pmd);
                        SubLObject time_left = pmd_time_left(pmd);
                        SubLObject adjusted_time_left = (NIL != time_left) ? ((SubLObject) (time_left)) : $pad_outlier_timeout$.getGlobalValue();
                        SubLObject max_transformation_depth_reached = pmd_max_transformation_depth_reached(pmd);
                        SubLObject lowest_rule_utility_executed = pmd_lowest_rule_utility_executed(pmd);
                        SubLObject lowest_rule_utility_executed_at_the_max_transformation_depth_reached = pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached(pmd);
                        SubLObject problem_count = pmd_problem_count(pmd);
                        SubLObject link_count = pmd_link_count(pmd);
                        SubLObject proof_count = pmd_proof_count(pmd);
                        SubLObject good_problem_count = pmd_good_problem_count(pmd);
                        SubLObject neutral_problem_count = pmd_neutral_problem_count(pmd);
                        SubLObject no_good_problem_count = pmd_no_good_problem_count(pmd);
                        SubLObject finished_problem_count = pmd_finished_problem_count(pmd);
                        SubLObject unexamined_good_problem_count = pmd_unexamined_good_problem_count(pmd);
                        SubLObject no_good_join_problem_count = pmd_no_good_join_problem_count(pmd);
                        SubLObject discarded_tactic_count = pmd_discarded_tactic_count(pmd);
                        SubLObject new_root_count = pmd_new_root_count(pmd);
                        SubLObject new_root_time_elapsed = pmd_new_root_time_elapsed(pmd);
                        SubLObject answer_count_so_far_for_this_new_root = pmd_answer_count_so_far_for_this_new_root(pmd);
                        SubLObject direction = pmd_direction(pmd);
                        SubLObject max_transformation_depth = pmd_max_transformation_depth(pmd);
                        format(stream, $str_alt109$_a__a__a__a__a__a__a__a__a__a__a_, new SubLObject[]{ any_more_answers_comingP, answer_count_so_far, time_elapsed, adjusted_time_left, max_transformation_depth_reached, lowest_rule_utility_executed, lowest_rule_utility_executed_at_the_max_transformation_depth_reached, problem_count, link_count, proof_count, good_problem_count, neutral_problem_count, no_good_problem_count, finished_problem_count, unexamined_good_problem_count, no_good_join_problem_count, discarded_tactic_count, new_root_count, new_root_time_elapsed, answer_count_so_far_for_this_new_root, direction, max_transformation_depth });
                    }
                } finally {
                    $read_default_float_format$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $pad_query_number$ = makeSymbol("*PAD-QUERY-NUMBER*");

    // deflexical
    private static final SubLSymbol $pad_corpus_filename$ = makeSymbol("*PAD-CORPUS-FILENAME*");

    // deflexical
    private static final SubLSymbol $pad_outlier_timeout$ = makeSymbol("*PAD-OUTLIER-TIMEOUT*");

    public static final SubLObject run_pad_experiment(SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject done_varP = NIL;
                SubLObject i = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary($pad_corpus_filename$.getGlobalValue(), $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt3$Unable_to_open__S, $pad_corpus_filename$.getGlobalValue());
                    }
                    {
                        SubLObject input_stream = stream;
                        {
                            SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                            try {
                                $cfasl_common_symbols$.bind(NIL, thread);
                                cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                while (NIL == done_varP) {
                                    {
                                        SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                        if ($EOF == query_info) {
                                            done_varP = T;
                                        } else
                                            if (query_info.isString()) {
                                                Errors.warn($str_alt6$Read_invalid_query_info__s, query_info);
                                            } else {
                                                {
                                                    SubLObject i_4 = i;
                                                    if ((NIL == n) || i_4.numL(n)) {
                                                        run_pad_query_info(query_info, i_4);
                                                    } else {
                                                        doneP = T;
                                                    }
                                                }
                                                i = add(i, ONE_INTEGER);
                                            }

                                    }
                                    if (NIL != doneP) {
                                        done_varP = doneP;
                                    }
                                } 
                            } finally {
                                $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                            }
                        }
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
                return count;
            }
        }
    }

    public static final SubLObject run_pad_query_cycl(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_info = list(sentence, mt, query_properties);
                {
                    SubLObject _prev_bind_0 = $pad_output_to_fileP$.currentBinding(thread);
                    try {
                        $pad_output_to_fileP$.bind(NIL, thread);
                        run_pad_query_info(query_info, NIL);
                    } finally {
                        $pad_output_to_fileP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * for debugging
     */
    public static final SubLObject run_pad_query(SubLObject i) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_info = list_utilities.last_one(pad_experiment_query_infos(number_utilities.f_1X(i)));
                {
                    SubLObject _prev_bind_0 = $pad_output_to_fileP$.currentBinding(thread);
                    try {
                        $pad_output_to_fileP$.bind(NIL, thread);
                        run_pad_query_info(query_info, i);
                    } finally {
                        $pad_output_to_fileP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject run_pad_query_info(SubLObject query_info, SubLObject i) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $pad_metrics_enabledP$.currentBinding(thread);
                SubLObject _prev_bind_1 = $pad_query_number$.currentBinding(thread);
                SubLObject _prev_bind_2 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                try {
                    $pad_metrics_enabledP$.bind(T, thread);
                    $pad_query_number$.bind(i, thread);
                    control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                    kbq_run_query_from_query_info(query_info, UNPROVIDED);
                } finally {
                    control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_2, thread);
                    $pad_query_number$.rebind(_prev_bind_1, thread);
                    $pad_metrics_enabledP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject pad_experiment_query_infos(SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        return inference_analysis.load_asked_queries($pad_corpus_filename$.getGlobalValue(), n);
    }

    public static final SubLObject kbq_run_query_from_query_info(SubLObject query_info, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        {
            SubLObject datum = query_info;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject query_properties = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            query_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != clauses.dnf_clauses_p(sentence)) {
                    sentence = inference_czer.problem_query_formula(sentence);
                }
                if (NIL != overriding_query_properties) {
                    query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
                }
                {
                    SubLObject query_spec = listS($$QueryFn, list($$Quote, list($$ist, mt, sentence)), $list_alt115);
                    return kbq_query_run.kbq_run_query(query_spec, $list_alt116, $pad_outlier_timeout$.getGlobalValue(), query_properties, NIL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $pad_algorithm$ = makeSymbol("*PAD-ALGORITHM*");

    public static final SubLObject probably_approximately_doneP(SubLObject pmd) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $pad_algorithm$.getDynamicValue(thread);
                if (pcase_var.eql($DECISION_TREE)) {
                    return probably_approximately_done_via_decision_treeP(pmd);
                } else
                    if (pcase_var.eql($DAVES)) {
                        return probably_approximately_done_via_daves_algorithmP(pmd);
                    } else {
                        return Errors.error($str_alt118$Unknown_PAD_algorithm__s, $pad_algorithm$.getDynamicValue(thread));
                    }

            }
        }
    }



    // deflexical
    private static final SubLSymbol $pad_decision_tree_filename$ = makeSymbol("*PAD-DECISION-TREE-FILENAME*");

    public static final SubLObject pad_decision_tree() {
        if (NIL == $pad_decision_tree$.getGlobalValue()) {
            $pad_decision_tree$.setGlobalValue(decision_tree.new_decision_tree_from_weka_j48_format($pad_decision_tree_filename$.getGlobalValue()));
        }
        return $pad_decision_tree$.getGlobalValue();
    }

    public static final SubLObject probably_approximately_done_via_decision_treeP(SubLObject pmd) {
        {
            SubLObject plist = pad_metrics_data_plist(pmd);
            if (NIL != find(misc_utilities.uninitialized(), plist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.warn($$$uninitialized_plist);
                return NIL;
            } else {
                return decision_tree.evaluate_decision_tree(pad_decision_tree(), plist);
            }
        }
    }

    public static final SubLObject probably_approximately_done_via_daves_algorithmP(SubLObject pmd) {
        return plusp(pmd_answer_count_at_previous_transformation_depth(pmd));
    }

    public static final SubLObject declare_probably_approximately_done_file() {
        declareFunction("extract_queries_for_pad_corpus", "EXTRACT-QUERIES-FOR-PAD-CORPUS", 2, 0, false);
        declareFunction("validate_saved_queries", "VALIDATE-SAVED-QUERIES", 2, 0, false);
        declareFunction("query_info_good_for_pad_corpusP", "QUERY-INFO-GOOD-FOR-PAD-CORPUS?", 1, 0, false);
        declareFunction("randomize_saved_queries", "RANDOMIZE-SAVED-QUERIES", 2, 0, false);
        declareFunction("pad_metrics_enabledP", "PAD-METRICS-ENABLED?", 0, 0, false);
        declareFunction("pad_metrics_data_print_function_trampoline", "PAD-METRICS-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pad_metrics_data_p", "PAD-METRICS-DATA-P", 1, 0, false);
        new probably_approximately_done.$pad_metrics_data_p$UnaryFunction();
        declareFunction("pmd_any_more_answers_comingP", "PMD-ANY-MORE-ANSWERS-COMING?", 1, 0, false);
        declareFunction("pmd_answer_count_so_far", "PMD-ANSWER-COUNT-SO-FAR", 1, 0, false);
        declareFunction("pmd_time_elapsed", "PMD-TIME-ELAPSED", 1, 0, false);
        declareFunction("pmd_time_left", "PMD-TIME-LEFT", 1, 0, false);
        declareFunction("pmd_max_transformation_depth_reached", "PMD-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
        declareFunction("pmd_lowest_rule_utility_executed", "PMD-LOWEST-RULE-UTILITY-EXECUTED", 1, 0, false);
        declareFunction("pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached", "PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
        declareFunction("pmd_problem_count", "PMD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_link_count", "PMD-LINK-COUNT", 1, 0, false);
        declareFunction("pmd_proof_count", "PMD-PROOF-COUNT", 1, 0, false);
        declareFunction("pmd_good_problem_count", "PMD-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_neutral_problem_count", "PMD-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_no_good_problem_count", "PMD-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_finished_problem_count", "PMD-FINISHED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_unexamined_good_problem_count", "PMD-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_no_good_join_problem_count", "PMD-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
        declareFunction("pmd_discarded_tactic_count", "PMD-DISCARDED-TACTIC-COUNT", 1, 0, false);
        declareFunction("pmd_new_root_count", "PMD-NEW-ROOT-COUNT", 1, 0, false);
        declareFunction("pmd_new_root_start_internal_real_time", "PMD-NEW-ROOT-START-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction("pmd_new_root_time_elapsed", "PMD-NEW-ROOT-TIME-ELAPSED", 1, 0, false);
        declareFunction("pmd_answer_count_so_far_for_this_new_root", "PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT", 1, 0, false);
        declareFunction("pmd_direction", "PMD-DIRECTION", 1, 0, false);
        declareFunction("pmd_max_transformation_depth", "PMD-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction("pmd_answer_count_at_previous_transformation_depth", "PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction("_csetf_pmd_any_more_answers_comingP", "_CSETF-PMD-ANY-MORE-ANSWERS-COMING?", 2, 0, false);
        declareFunction("_csetf_pmd_answer_count_so_far", "_CSETF-PMD-ANSWER-COUNT-SO-FAR", 2, 0, false);
        declareFunction("_csetf_pmd_time_elapsed", "_CSETF-PMD-TIME-ELAPSED", 2, 0, false);
        declareFunction("_csetf_pmd_time_left", "_CSETF-PMD-TIME-LEFT", 2, 0, false);
        declareFunction("_csetf_pmd_max_transformation_depth_reached", "_CSETF-PMD-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction("_csetf_pmd_lowest_rule_utility_executed", "_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED", 2, 0, false);
        declareFunction("_csetf_pmd_lowest_rule_utility_executed_at_the_max_transformation_depth_reached", "_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
        declareFunction("_csetf_pmd_problem_count", "_CSETF-PMD-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_link_count", "_CSETF-PMD-LINK-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_proof_count", "_CSETF-PMD-PROOF-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_good_problem_count", "_CSETF-PMD-GOOD-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_neutral_problem_count", "_CSETF-PMD-NEUTRAL-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_no_good_problem_count", "_CSETF-PMD-NO-GOOD-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_finished_problem_count", "_CSETF-PMD-FINISHED-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_unexamined_good_problem_count", "_CSETF-PMD-UNEXAMINED-GOOD-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_no_good_join_problem_count", "_CSETF-PMD-NO-GOOD-JOIN-PROBLEM-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_discarded_tactic_count", "_CSETF-PMD-DISCARDED-TACTIC-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_new_root_count", "_CSETF-PMD-NEW-ROOT-COUNT", 2, 0, false);
        declareFunction("_csetf_pmd_new_root_start_internal_real_time", "_CSETF-PMD-NEW-ROOT-START-INTERNAL-REAL-TIME", 2, 0, false);
        declareFunction("_csetf_pmd_new_root_time_elapsed", "_CSETF-PMD-NEW-ROOT-TIME-ELAPSED", 2, 0, false);
        declareFunction("_csetf_pmd_answer_count_so_far_for_this_new_root", "_CSETF-PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT", 2, 0, false);
        declareFunction("_csetf_pmd_direction", "_CSETF-PMD-DIRECTION", 2, 0, false);
        declareFunction("_csetf_pmd_max_transformation_depth", "_CSETF-PMD-MAX-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction("_csetf_pmd_answer_count_at_previous_transformation_depth", "_CSETF-PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction("make_pad_metrics_data", "MAKE-PAD-METRICS-DATA", 0, 1, false);
        declareFunction("new_pad_metrics_data", "NEW-PAD-METRICS-DATA", 0, 0, false);
        declareFunction("clone_pad_metrics_data", "CLONE-PAD-METRICS-DATA", 1, 0, false);
        declareFunction("current_pad_metrics_data", "CURRENT-PAD-METRICS-DATA", 0, 0, false);
        declareFunction("possibly_update_pad_metrics", "POSSIBLY-UPDATE-PAD-METRICS", 1, 0, false);
        declareFunction("pad_update_metrics", "PAD-UPDATE-METRICS", 2, 0, false);
        declareFunction("pad_update_any_more_answers_coming", "PAD-UPDATE-ANY-MORE-ANSWERS-COMING", 0, 0, false);
        declareFunction("pad_note_transformation_depth", "PAD-NOTE-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction("pad_note_transformation_tactic_executed", "PAD-NOTE-TRANSFORMATION-TACTIC-EXECUTED", 1, 0, false);
        declareFunction("pad_note_problem_status_change", "PAD-NOTE-PROBLEM-STATUS-CHANGE", 3, 0, false);
        declareFunction("pad_note_tactic_discarded", "PAD-NOTE-TACTIC-DISCARDED", 0, 0, false);
        declareFunction("pad_note_new_root", "PAD-NOTE-NEW-ROOT", 0, 0, false);
        declareFunction("pad_note_answer", "PAD-NOTE-ANSWER", 0, 0, false);
        declareFunction("pad_finish_gathering_metrics", "PAD-FINISH-GATHERING-METRICS", 1, 0, false);
        declareFunction("pad_gathering_metricsP", "PAD-GATHERING-METRICS?", 0, 0, false);
        declareFunction("pad_metrics_data_plist", "PAD-METRICS-DATA-PLIST", 1, 0, false);
        declareFunction("current_pad_metrics_data_plist", "CURRENT-PAD-METRICS-DATA-PLIST", 0, 0, false);
        declareFunction("format_pad_metrics_file_header", "FORMAT-PAD-METRICS-FILE-HEADER", 1, 0, false);
        declareFunction("format_pad_metrics_query_header", "FORMAT-PAD-METRICS-QUERY-HEADER", 1, 0, false);
        declareFunction("format_pad_metrics_data", "FORMAT-PAD-METRICS-DATA", 2, 0, false);
        declareFunction("run_pad_experiment", "RUN-PAD-EXPERIMENT", 0, 1, false);
        declareFunction("run_pad_query_cycl", "RUN-PAD-QUERY-CYCL", 3, 0, false);
        declareFunction("run_pad_query", "RUN-PAD-QUERY", 1, 0, false);
        declareFunction("run_pad_query_info", "RUN-PAD-QUERY-INFO", 2, 0, false);
        declareFunction("pad_experiment_query_infos", "PAD-EXPERIMENT-QUERY-INFOS", 0, 1, false);
        declareFunction("kbq_run_query_from_query_info", "KBQ-RUN-QUERY-FROM-QUERY-INFO", 1, 1, false);
        declareFunction("probably_approximately_doneP", "PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
        declareFunction("pad_decision_tree", "PAD-DECISION-TREE", 0, 0, false);
        declareFunction("probably_approximately_done_via_decision_treeP", "PROBABLY-APPROXIMATELY-DONE-VIA-DECISION-TREE?", 1, 0, false);
        declareFunction("probably_approximately_done_via_daves_algorithmP", "PROBABLY-APPROXIMATELY-DONE-VIA-DAVES-ALGORITHM?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_probably_approximately_done_file() {
        defparameter("*PAD-METRICS-ENABLED?*", NIL);
        defconstant("*DTP-PAD-METRICS-DATA*", PAD_METRICS_DATA);
        deflexical("*PAD-METRICS-UPDATE-FREQUENCY*", $float$0_1);
        deflexical("*PAD-METRICS-OUTPUT-FILENAME*", $str_alt104$_home_pace_work_pad_pad_metrics_0);
        defparameter("*PAD-OUTPUTTING-METRICS?*", NIL);
        defparameter("*PAD-OUTPUT-TO-FILE?*", T);
        deflexical("*PAD-METRICS-FILE-HEADER*", $str_alt106$__Probably_Approximately_Done__PA);
        defparameter("*PAD-QUERY-NUMBER*", NIL);
        deflexical("*PAD-CORPUS-FILENAME*", $str_alt110$_home_pace_work_pad_0891_0893_ran);
        deflexical("*PAD-OUTLIER-TIMEOUT*", $int$600);
        defparameter("*PAD-ALGORITHM*", $UNINITIALIZED);
        deflexical("*PAD-DECISION-TREE*", NIL != boundp($pad_decision_tree$) ? ((SubLObject) ($pad_decision_tree$.getGlobalValue())) : NIL);
        deflexical("*PAD-DECISION-TREE-FILENAME*", $str_alt120$_home_pace_work_pad_decision_tree);
        return NIL;
    }

    public static final SubLObject setup_probably_approximately_done_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_pad_metrics_data$.getGlobalValue(), symbol_function(PAD_METRICS_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf($sym23$PMD_ANY_MORE_ANSWERS_COMING_, $sym24$_CSETF_PMD_ANY_MORE_ANSWERS_COMING_);
        def_csetf(PMD_ANSWER_COUNT_SO_FAR, _CSETF_PMD_ANSWER_COUNT_SO_FAR);
        def_csetf(PMD_TIME_ELAPSED, _CSETF_PMD_TIME_ELAPSED);
        def_csetf(PMD_TIME_LEFT, _CSETF_PMD_TIME_LEFT);
        def_csetf(PMD_MAX_TRANSFORMATION_DEPTH_REACHED, _CSETF_PMD_MAX_TRANSFORMATION_DEPTH_REACHED);
        def_csetf(PMD_LOWEST_RULE_UTILITY_EXECUTED, _CSETF_PMD_LOWEST_RULE_UTILITY_EXECUTED);
        def_csetf($sym35$PMD_LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION_DEPTH_, $sym36$_CSETF_PMD_LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION);
        def_csetf(PMD_PROBLEM_COUNT, _CSETF_PMD_PROBLEM_COUNT);
        def_csetf(PMD_LINK_COUNT, _CSETF_PMD_LINK_COUNT);
        def_csetf(PMD_PROOF_COUNT, _CSETF_PMD_PROOF_COUNT);
        def_csetf(PMD_GOOD_PROBLEM_COUNT, _CSETF_PMD_GOOD_PROBLEM_COUNT);
        def_csetf(PMD_NEUTRAL_PROBLEM_COUNT, _CSETF_PMD_NEUTRAL_PROBLEM_COUNT);
        def_csetf(PMD_NO_GOOD_PROBLEM_COUNT, _CSETF_PMD_NO_GOOD_PROBLEM_COUNT);
        def_csetf(PMD_FINISHED_PROBLEM_COUNT, _CSETF_PMD_FINISHED_PROBLEM_COUNT);
        def_csetf(PMD_UNEXAMINED_GOOD_PROBLEM_COUNT, _CSETF_PMD_UNEXAMINED_GOOD_PROBLEM_COUNT);
        def_csetf(PMD_NO_GOOD_JOIN_PROBLEM_COUNT, _CSETF_PMD_NO_GOOD_JOIN_PROBLEM_COUNT);
        def_csetf(PMD_DISCARDED_TACTIC_COUNT, _CSETF_PMD_DISCARDED_TACTIC_COUNT);
        def_csetf(PMD_NEW_ROOT_COUNT, _CSETF_PMD_NEW_ROOT_COUNT);
        def_csetf(PMD_NEW_ROOT_START_INTERNAL_REAL_TIME, _CSETF_PMD_NEW_ROOT_START_INTERNAL_REAL_TIME);
        def_csetf(PMD_NEW_ROOT_TIME_ELAPSED, _CSETF_PMD_NEW_ROOT_TIME_ELAPSED);
        def_csetf(PMD_ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT, _CSETF_PMD_ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT);
        def_csetf(PMD_DIRECTION, _CSETF_PMD_DIRECTION);
        def_csetf(PMD_MAX_TRANSFORMATION_DEPTH, _CSETF_PMD_MAX_TRANSFORMATION_DEPTH);
        def_csetf(PMD_ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH, _CSETF_PMD_ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH);
        identity(PAD_METRICS_DATA);
        access_macros.register_macro_helper(NEW_PAD_METRICS_DATA, POSSIBLY_GATHERING_PAD_METRICS);
        subl_macro_promotions.declare_defglobal($pad_decision_tree$);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    static private final SubLString $str_alt1$Extracting_queries_from__a__ = makeString("Extracting queries from ~a~%");



    static private final SubLString $str_alt3$Unable_to_open__S = makeString("Unable to open ~S");





    static private final SubLString $str_alt6$Read_invalid_query_info__s = makeString("Read invalid query info ~s");

    static private final SubLList $list_alt7 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    static private final SubLList $list_alt8 = list(makeKeyword("MAX-TIME"), ZERO_INTEGER);



    private static final SubLSymbol PAD_METRICS_DATA = makeSymbol("PAD-METRICS-DATA");

    private static final SubLSymbol PAD_METRICS_DATA_P = makeSymbol("PAD-METRICS-DATA-P");

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeSymbol("ANY-MORE-ANSWERS-COMING?"), makeSymbol("ANSWER-COUNT-SO-FAR"), makeSymbol("TIME-ELAPSED"), makeSymbol("TIME-LEFT"), makeSymbol("MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("LOWEST-RULE-UTILITY-EXECUTED"), makeSymbol("LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("PROBLEM-COUNT"), makeSymbol("LINK-COUNT"), makeSymbol("PROOF-COUNT"), makeSymbol("GOOD-PROBLEM-COUNT"), makeSymbol("NEUTRAL-PROBLEM-COUNT"), makeSymbol("NO-GOOD-PROBLEM-COUNT"), makeSymbol("FINISHED-PROBLEM-COUNT"), makeSymbol("UNEXAMINED-GOOD-PROBLEM-COUNT"), makeSymbol("NO-GOOD-JOIN-PROBLEM-COUNT"), makeSymbol("DISCARDED-TACTIC-COUNT"), makeSymbol("NEW-ROOT-COUNT"), makeSymbol("NEW-ROOT-START-INTERNAL-REAL-TIME"), makeSymbol("NEW-ROOT-TIME-ELAPSED"), makeSymbol("ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT"), makeSymbol("DIRECTION"), makeSymbol("MAX-TRANSFORMATION-DEPTH"), makeSymbol("ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH") });

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("ANY-MORE-ANSWERS-COMING?"), makeKeyword("ANSWER-COUNT-SO-FAR"), makeKeyword("TIME-ELAPSED"), makeKeyword("TIME-LEFT"), makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("LOWEST-RULE-UTILITY-EXECUTED"), makeKeyword("LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("PROBLEM-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("FINISHED-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("DISCARDED-TACTIC-COUNT"), makeKeyword("NEW-ROOT-COUNT"), makeKeyword("NEW-ROOT-START-INTERNAL-REAL-TIME"), makeKeyword("NEW-ROOT-TIME-ELAPSED"), makeKeyword("ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT"), makeKeyword("DIRECTION"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeSymbol("PMD-ANY-MORE-ANSWERS-COMING?"), makeSymbol("PMD-ANSWER-COUNT-SO-FAR"), makeSymbol("PMD-TIME-ELAPSED"), makeSymbol("PMD-TIME-LEFT"), makeSymbol("PMD-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("PMD-LOWEST-RULE-UTILITY-EXECUTED"), makeSymbol("PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("PMD-PROBLEM-COUNT"), makeSymbol("PMD-LINK-COUNT"), makeSymbol("PMD-PROOF-COUNT"), makeSymbol("PMD-GOOD-PROBLEM-COUNT"), makeSymbol("PMD-NEUTRAL-PROBLEM-COUNT"), makeSymbol("PMD-NO-GOOD-PROBLEM-COUNT"), makeSymbol("PMD-FINISHED-PROBLEM-COUNT"), makeSymbol("PMD-UNEXAMINED-GOOD-PROBLEM-COUNT"), makeSymbol("PMD-NO-GOOD-JOIN-PROBLEM-COUNT"), makeSymbol("PMD-DISCARDED-TACTIC-COUNT"), makeSymbol("PMD-NEW-ROOT-COUNT"), makeSymbol("PMD-NEW-ROOT-START-INTERNAL-REAL-TIME"), makeSymbol("PMD-NEW-ROOT-TIME-ELAPSED"), makeSymbol("PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT"), makeSymbol("PMD-DIRECTION"), makeSymbol("PMD-MAX-TRANSFORMATION-DEPTH"), makeSymbol("PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeSymbol("_CSETF-PMD-ANY-MORE-ANSWERS-COMING?"), makeSymbol("_CSETF-PMD-ANSWER-COUNT-SO-FAR"), makeSymbol("_CSETF-PMD-TIME-ELAPSED"), makeSymbol("_CSETF-PMD-TIME-LEFT"), makeSymbol("_CSETF-PMD-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED"), makeSymbol("_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("_CSETF-PMD-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-LINK-COUNT"), makeSymbol("_CSETF-PMD-PROOF-COUNT"), makeSymbol("_CSETF-PMD-GOOD-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-NEUTRAL-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-NO-GOOD-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-FINISHED-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-UNEXAMINED-GOOD-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-NO-GOOD-JOIN-PROBLEM-COUNT"), makeSymbol("_CSETF-PMD-DISCARDED-TACTIC-COUNT"), makeSymbol("_CSETF-PMD-NEW-ROOT-COUNT"), makeSymbol("_CSETF-PMD-NEW-ROOT-START-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-PMD-NEW-ROOT-TIME-ELAPSED"), makeSymbol("_CSETF-PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT"), makeSymbol("_CSETF-PMD-DIRECTION"), makeSymbol("_CSETF-PMD-MAX-TRANSFORMATION-DEPTH"), makeSymbol("_CSETF-PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH") });



    public static final SubLInteger $int$21 = makeInteger(21);

    public static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLInteger $int$23 = makeInteger(23);

    public static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol PAD_METRICS_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PAD-METRICS-DATA-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLSymbol $sym23$PMD_ANY_MORE_ANSWERS_COMING_ = makeSymbol("PMD-ANY-MORE-ANSWERS-COMING?");

    static private final SubLSymbol $sym24$_CSETF_PMD_ANY_MORE_ANSWERS_COMING_ = makeSymbol("_CSETF-PMD-ANY-MORE-ANSWERS-COMING?");

    private static final SubLSymbol PMD_ANSWER_COUNT_SO_FAR = makeSymbol("PMD-ANSWER-COUNT-SO-FAR");

    public static final SubLSymbol _CSETF_PMD_ANSWER_COUNT_SO_FAR = makeSymbol("_CSETF-PMD-ANSWER-COUNT-SO-FAR");

    private static final SubLSymbol PMD_TIME_ELAPSED = makeSymbol("PMD-TIME-ELAPSED");

    public static final SubLSymbol _CSETF_PMD_TIME_ELAPSED = makeSymbol("_CSETF-PMD-TIME-ELAPSED");

    private static final SubLSymbol PMD_TIME_LEFT = makeSymbol("PMD-TIME-LEFT");

    public static final SubLSymbol _CSETF_PMD_TIME_LEFT = makeSymbol("_CSETF-PMD-TIME-LEFT");

    private static final SubLSymbol PMD_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("PMD-MAX-TRANSFORMATION-DEPTH-REACHED");

    public static final SubLSymbol _CSETF_PMD_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("_CSETF-PMD-MAX-TRANSFORMATION-DEPTH-REACHED");

    private static final SubLSymbol PMD_LOWEST_RULE_UTILITY_EXECUTED = makeSymbol("PMD-LOWEST-RULE-UTILITY-EXECUTED");

    public static final SubLSymbol _CSETF_PMD_LOWEST_RULE_UTILITY_EXECUTED = makeSymbol("_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED");

    static private final SubLSymbol $sym35$PMD_LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION_DEPTH_ = makeSymbol("PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED");

    static private final SubLSymbol $sym36$_CSETF_PMD_LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION = makeSymbol("_CSETF-PMD-LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED");

    private static final SubLSymbol PMD_PROBLEM_COUNT = makeSymbol("PMD-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-PROBLEM-COUNT");

    private static final SubLSymbol PMD_LINK_COUNT = makeSymbol("PMD-LINK-COUNT");

    public static final SubLSymbol _CSETF_PMD_LINK_COUNT = makeSymbol("_CSETF-PMD-LINK-COUNT");

    private static final SubLSymbol PMD_PROOF_COUNT = makeSymbol("PMD-PROOF-COUNT");

    public static final SubLSymbol _CSETF_PMD_PROOF_COUNT = makeSymbol("_CSETF-PMD-PROOF-COUNT");

    private static final SubLSymbol PMD_GOOD_PROBLEM_COUNT = makeSymbol("PMD-GOOD-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_GOOD_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PMD_NEUTRAL_PROBLEM_COUNT = makeSymbol("PMD-NEUTRAL-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_NEUTRAL_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PMD_NO_GOOD_PROBLEM_COUNT = makeSymbol("PMD-NO-GOOD-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_NO_GOOD_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PMD_FINISHED_PROBLEM_COUNT = makeSymbol("PMD-FINISHED-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_FINISHED_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-FINISHED-PROBLEM-COUNT");

    private static final SubLSymbol PMD_UNEXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("PMD-UNEXAMINED-GOOD-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_UNEXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-UNEXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PMD_NO_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("PMD-NO-GOOD-JOIN-PROBLEM-COUNT");

    public static final SubLSymbol _CSETF_PMD_NO_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("_CSETF-PMD-NO-GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PMD_DISCARDED_TACTIC_COUNT = makeSymbol("PMD-DISCARDED-TACTIC-COUNT");

    public static final SubLSymbol _CSETF_PMD_DISCARDED_TACTIC_COUNT = makeSymbol("_CSETF-PMD-DISCARDED-TACTIC-COUNT");

    private static final SubLSymbol PMD_NEW_ROOT_COUNT = makeSymbol("PMD-NEW-ROOT-COUNT");

    public static final SubLSymbol _CSETF_PMD_NEW_ROOT_COUNT = makeSymbol("_CSETF-PMD-NEW-ROOT-COUNT");

    private static final SubLSymbol PMD_NEW_ROOT_START_INTERNAL_REAL_TIME = makeSymbol("PMD-NEW-ROOT-START-INTERNAL-REAL-TIME");

    public static final SubLSymbol _CSETF_PMD_NEW_ROOT_START_INTERNAL_REAL_TIME = makeSymbol("_CSETF-PMD-NEW-ROOT-START-INTERNAL-REAL-TIME");

    private static final SubLSymbol PMD_NEW_ROOT_TIME_ELAPSED = makeSymbol("PMD-NEW-ROOT-TIME-ELAPSED");

    public static final SubLSymbol _CSETF_PMD_NEW_ROOT_TIME_ELAPSED = makeSymbol("_CSETF-PMD-NEW-ROOT-TIME-ELAPSED");

    private static final SubLSymbol PMD_ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT = makeSymbol("PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT");

    public static final SubLSymbol _CSETF_PMD_ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT = makeSymbol("_CSETF-PMD-ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT");

    private static final SubLSymbol PMD_DIRECTION = makeSymbol("PMD-DIRECTION");

    public static final SubLSymbol _CSETF_PMD_DIRECTION = makeSymbol("_CSETF-PMD-DIRECTION");

    private static final SubLSymbol PMD_MAX_TRANSFORMATION_DEPTH = makeSymbol("PMD-MAX-TRANSFORMATION-DEPTH");

    public static final SubLSymbol _CSETF_PMD_MAX_TRANSFORMATION_DEPTH = makeSymbol("_CSETF-PMD-MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol PMD_ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH = makeSymbol("PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH");

    public static final SubLSymbol _CSETF_PMD_ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH = makeSymbol("_CSETF-PMD-ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH");

    public static final SubLSymbol $kw71$ANY_MORE_ANSWERS_COMING_ = makeKeyword("ANY-MORE-ANSWERS-COMING?");

    private static final SubLSymbol $ANSWER_COUNT_SO_FAR = makeKeyword("ANSWER-COUNT-SO-FAR");

    private static final SubLSymbol $TIME_ELAPSED = makeKeyword("TIME-ELAPSED");

    private static final SubLSymbol $TIME_LEFT = makeKeyword("TIME-LEFT");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH_REACHED = makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED");

    private static final SubLSymbol $LOWEST_RULE_UTILITY_EXECUTED = makeKeyword("LOWEST-RULE-UTILITY-EXECUTED");

    public static final SubLSymbol $kw77$LOWEST_RULE_UTILITY_EXECUTED_AT_THE_MAX_TRANSFORMATION_DEPTH_REAC = makeKeyword("LOWEST-RULE-UTILITY-EXECUTED-AT-THE-MAX-TRANSFORMATION-DEPTH-REACHED");







    private static final SubLSymbol $GOOD_PROBLEM_COUNT = makeKeyword("GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_PROBLEM_COUNT = makeKeyword("NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_PROBLEM_COUNT = makeKeyword("NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_PROBLEM_COUNT = makeKeyword("FINISHED-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_GOOD_PROBLEM_COUNT = makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_JOIN_PROBLEM_COUNT = makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $DISCARDED_TACTIC_COUNT = makeKeyword("DISCARDED-TACTIC-COUNT");

    private static final SubLSymbol $NEW_ROOT_COUNT = makeKeyword("NEW-ROOT-COUNT");

    private static final SubLSymbol $NEW_ROOT_START_INTERNAL_REAL_TIME = makeKeyword("NEW-ROOT-START-INTERNAL-REAL-TIME");

    private static final SubLSymbol $NEW_ROOT_TIME_ELAPSED = makeKeyword("NEW-ROOT-TIME-ELAPSED");

    private static final SubLSymbol $ANSWER_COUNT_SO_FAR_FOR_THIS_NEW_ROOT = makeKeyword("ANSWER-COUNT-SO-FAR-FOR-THIS-NEW-ROOT");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $ANSWER_COUNT_AT_PREVIOUS_TRANSFORMATION_DEPTH = makeKeyword("ANSWER-COUNT-AT-PREVIOUS-TRANSFORMATION-DEPTH");

    static private final SubLString $str_alt95$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol NEW_PAD_METRICS_DATA = makeSymbol("NEW-PAD-METRICS-DATA");

    private static final SubLSymbol POSSIBLY_GATHERING_PAD_METRICS = makeSymbol("POSSIBLY-GATHERING-PAD-METRICS");





    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $DECISION_TREE = makeKeyword("DECISION-TREE");





    static private final SubLString $str_alt104$_home_pace_work_pad_pad_metrics_0 = makeString("/home/pace/work/pad/pad-metrics-0894.txt");



    static private final SubLString $str_alt106$__Probably_Approximately_Done__PA = makeString("% Probably Approximately Done (PAD) dataset\n% Generated on ~a\n%\n@RELATION pad\n\n@ATTRIBUTE any-more-answers-coming {T,NIL}\n@ATTRIBUTE answer-count-so-far NUMERIC\n@ATTRIBUTE time-elapsed NUMERIC\n@ATTRIBUTE time-left NUMERIC\n@ATTRIBUTE max-transformation-depth-reached NUMERIC\n@ATTRIBUTE lowest-rule-utility-executed NUMERIC\n@ATTRIBUTE lowest-rule-utility-executed-at-the-max-transformation-depth-reached NUMERIC\n@ATTRIBUTE problem-count NUMERIC\n@ATTRIBUTE link-count NUMERIC\n@ATTRIBUTE proof-count NUMERIC\n@ATTRIBUTE good-problem-count NUMERIC\n@ATTRIBUTE neutral-problem-count NUMERIC\n@ATTRIBUTE no-good-problem-count NUMERIC\n@ATTRIBUTE finished-problem-count NUMERIC\n@ATTRIBUTE unexamined-good-problem-count NUMERIC\n@ATTRIBUTE no-good-join-problem-count NUMERIC\n@ATTRIBUTE discarded-tactic-count NUMERIC\n@ATTRIBUTE new-root-count NUMERIC\n@ATTRIBUTE new-root-time-elapsed NUMERIC\n@ATTRIBUTE answer-count-so-far-for-this-new-root NUMERIC\n@ATTRIBUTE direction {FORWARD,BACKWARD}\n@ATTRIBUTE max-transformation-depth NUMERIC\n\n@DATA\n");

    static private final SubLString $str_alt107$__Query__a__ = makeString("% Query ~a~%");



    static private final SubLString $str_alt109$_a__a__a__a__a__a__a__a__a__a__a_ = makeString("~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a,~a~%");

    static private final SubLString $str_alt110$_home_pace_work_pad_0891_0893_ran = makeString("/home/pace/work/pad/0891-0893-randomized.cfasl");

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLObject $$QueryFn = constant_handles.reader_make_constant_shell(makeString("QueryFn"));

    public static final SubLObject $$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    static private final SubLList $list_alt115 = list(constant_handles.reader_make_constant_shell(makeString("TheEmptyList")));

    static private final SubLList $list_alt116 = list(makeKeyword("ANSWER-COUNT"));

    private static final SubLSymbol $DAVES = makeKeyword("DAVES");

    static private final SubLString $str_alt118$Unknown_PAD_algorithm__s = makeString("Unknown PAD algorithm ~s");

    public static final SubLSymbol $pad_decision_tree$ = makeSymbol("*PAD-DECISION-TREE*");

    static private final SubLString $str_alt120$_home_pace_work_pad_decision_tree = makeString("/home/pace/work/pad/decision-tree-1.txt");

    static private final SubLString $$$uninitialized_plist = makeString("uninitialized plist");

    // // Initializers
    public void declareFunctions() {
        declare_probably_approximately_done_file();
    }

    public void initializeVariables() {
        init_probably_approximately_done_file();
    }

    public void runTopLevelForms() {
        setup_probably_approximately_done_file();
    }
}

