/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      GAF-GATHERING-METRICS
 *  source file: /cyc/top/cycl/gaf-gathering-metrics.lisp
 *  created:     2019/07/03 17:38:57
 */
public final class gaf_gathering_metrics extends SubLTranslatedFile implements V02 {
    // // Constructor
    private gaf_gathering_metrics() {
    }

    public static final SubLFile me = new gaf_gathering_metrics();

    public static final String myName = "com.cyc.cycjava.cycl.gaf_gathering_metrics";





    public static final SubLObject with_new_gg_metrics_output_streams(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject filename = $sym0$FILENAME;
            SubLObject v_metrics_filename = $sym1$V_METRICS_FILENAME;
            SubLObject directory = $sym2$DIRECTORY;
            return list(CLET, list(bq_cons(directory, $list_alt4), list(filename, listS(CCONCATENATE, directory, $list_alt6)), list(v_metrics_filename, listS(CCONCATENATE, directory, $list_alt7))), list(WITH_PRIVATE_BINARY_FILE, listS($gg_metrics_cfasl_stream$, filename, $list_alt10), listS(WITH_PRIVATE_BINARY_FILE, listS($gg_verification_metrics_cfasl_stream$, v_metrics_filename, $list_alt10), append(body, NIL))));
        }
    }

    public static final SubLObject maybe_record_gg_metrics(SubLObject metrics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($gg_metrics_cfasl_stream$.getDynamicValue(thread).isStream()) {
                record_gg_metrics(metrics);
                write_html_gg_info_for_kb(UNPROVIDED);
            }
            return metrics;
        }
    }

    public static final SubLObject record_gg_metrics(SubLObject metrics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($gg_metrics_cfasl_stream$.getDynamicValue(thread), STREAMP);
            cfasl_output_externalized(metrics, $gg_metrics_cfasl_stream$.getDynamicValue(thread));
            force_output($gg_metrics_cfasl_stream$.getDynamicValue(thread));
            return metrics;
        }
    }

    public static final SubLObject maybe_record_gg_verification_metrics(SubLObject verification_metrics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($gg_verification_metrics_cfasl_stream$.getDynamicValue(thread).isStream()) {
                record_gg_verification_metrics(verification_metrics);
            }
            return verification_metrics;
        }
    }

    public static final SubLObject record_gg_verification_metrics(SubLObject metrics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metrics, GG_GAF_VERIFICATION_METRICS_P);
            SubLTrampolineFile.checkType($gg_verification_metrics_cfasl_stream$.getDynamicValue(thread), STREAMP);
            cfasl_output_externalized(metrics, $gg_verification_metrics_cfasl_stream$.getDynamicValue(thread));
            force_output($gg_verification_metrics_cfasl_stream$.getDynamicValue(thread));
            return metrics;
        }
    }

    public static final SubLObject do_gg_metrics_file(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gg_metrics = NIL;
                    SubLObject file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    gg_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    file = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject stream = $sym15$STREAM;
                            SubLObject eof = $sym16$EOF;
                            SubLObject stopP = $sym17$STOP_;
                            return list(CLET, list(bq_cons(eof, $list_alt18), bq_cons(stopP, $list_alt19)), list(WITH_PRIVATE_BINARY_FILE, listS(stream, file, $list_alt20), list(UNTIL, stopP, list(CLET, list(list(gg_metrics, list(LOAD_ONE_GG_METRICS_SET, stream, eof))), list(PCOND, list(list(EQ, gg_metrics, eof), listS(CSETQ, stopP, $list_alt25)), list(T, bq_cons(PROGN, append(body, NIL))))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt14);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject load_gg_metrics_internal(SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject metrics = NIL;
                SubLObject eof = $EOF;
                SubLObject stopP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(file, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt29$Unable_to_open__S, file);
                    }
                    {
                        SubLObject stream_1 = stream;
                        while (NIL == stopP) {
                            {
                                SubLObject one_set = load_one_gg_metrics_set(stream_1, eof);
                                if (one_set == eof) {
                                    stopP = T;
                                } else {
                                    metrics = cons(one_set, metrics);
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
                return metrics;
            }
        }
    }

    public static final SubLObject load_one_gg_metrics_set(SubLObject stream, SubLObject eof) {
        return cfasl_input(stream, NIL, eof);
    }

    // deflexical
    private static final SubLSymbol $gg_metrics_pattern$ = makeSymbol("*GG-METRICS-PATTERN*");

    // deflexical
    private static final SubLSymbol $gg_additional_metrics_patterns$ = makeSymbol("*GG-ADDITIONAL-METRICS-PATTERNS*");

    // deflexical
    private static final SubLSymbol $gg_search_string_metrics_pattern$ = makeSymbol("*GG-SEARCH-STRING-METRICS-PATTERN*");

    // deflexical
    private static final SubLSymbol $gg_search_string_additional_metrics_patterns$ = makeSymbol("*GG-SEARCH-STRING-ADDITIONAL-METRICS-PATTERNS*");

    public static final SubLObject gg_additional_search_string_metrics_p(SubLObject list) {
        return start_of_list_matches_patternsP(list, $gg_search_string_additional_metrics_patterns$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $gg_search_result_metrics_pattern$ = makeSymbol("*GG-SEARCH-RESULT-METRICS-PATTERN*");

    // deflexical
    private static final SubLSymbol $gg_filler_string_metrics_pattern$ = makeSymbol("*GG-FILLER-STRING-METRICS-PATTERN*");

    // deflexical
    private static final SubLSymbol $gg_additional_filler_string_metrics_patterns$ = makeSymbol("*GG-ADDITIONAL-FILLER-STRING-METRICS-PATTERNS*");

    public static final SubLObject gg_additional_filler_string_metrics_p(SubLObject list) {
        return start_of_list_matches_patternsP(list, $gg_additional_filler_string_metrics_patterns$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $gg_complete_gaf_metrics_pattern$ = makeSymbol("*GG-COMPLETE-GAF-METRICS-PATTERN*");

    // deflexical
    private static final SubLSymbol $gg_additional_complete_gafs_patterns$ = makeSymbol("*GG-ADDITIONAL-COMPLETE-GAFS-PATTERNS*");

    /**
     * Use METHOD to match patterns indicated with :ADDITIONAL when doing tree-matching inside BODY
     */
    public static final SubLObject with_additional_matching_method(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject method = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($pattern_matches_tree_atomic_methods$, listS(CONS, list(LIST, $ADDITIONAL, method), $list_alt44))), append(body, NIL));
            }
        }
    }

    public static final SubLObject gg_metrics_p(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind(cons(list($ADDITIONAL, GG_ADDITIONAL_METRICS_P), pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread)), thread);
                        ans = pattern_match.tree_matches_pattern(tree, $gg_metrics_pattern$.getGlobalValue());
                    } finally {
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject gg_metrics_predicate(SubLObject metrics) {
        {
            SubLObject predicate = $UNKNOWN_PREDICATE;
            if (NIL != list_utilities.lengthGE(metrics, FOUR_INTEGER, UNPROVIDED)) {
                {
                    SubLObject partial_gaf = nth(THREE_INTEGER, metrics);
                    predicate = cycl_utilities.formula_arg0(partial_gaf);
                }
            }
            return predicate;
        }
    }

    public static final SubLObject gg_metrics_partial_gaf(SubLObject metrics) {
        {
            SubLObject partial_gaf = $UNKNOWN_PARTIAL_GAF;
            if (NIL != list_utilities.lengthGE(metrics, FOUR_INTEGER, UNPROVIDED)) {
                partial_gaf = nth(THREE_INTEGER, metrics);
            }
            return partial_gaf;
        }
    }

    public static final SubLObject gg_additional_metrics_p(SubLObject list) {
        return start_of_list_matches_patternsP(list, $gg_additional_metrics_patterns$.getGlobalValue());
    }

    public static final SubLObject start_of_list_matches_patternsP(SubLObject list, SubLObject patterns) {
        {
            SubLObject list_length = length(list);
            SubLObject stopP = NIL;
            SubLObject failP = NIL;
            SubLObject list_var = NIL;
            SubLObject pattern = NIL;
            SubLObject i = NIL;
            for (list_var = patterns, pattern = list_var.first(), i = ZERO_INTEGER; !((NIL != stopP) || (NIL == list_var)); list_var = list_var.rest() , pattern = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (i.numGE(list_length)) {
                    stopP = T;
                } else
                    if (NIL == pattern_match.tree_matches_pattern(nth(i, list), pattern)) {
                        failP = T;
                        stopP = T;
                    }

            }
            return makeBoolean(NIL == failP);
        }
    }

    public static final SubLObject gg_metrics_total_milliseconds(SubLObject metrics) {
        SubLTrampolineFile.checkType(metrics, GG_METRICS_P);
        return metrics.first();
    }

    public static final SubLObject gg_search_string_metrics_p(SubLObject v_object) {
        return list_utilities.list_of_type_p(GG_ONE_SEARCH_STRING_METRICS_P, v_object);
    }

    public static final SubLObject gg_one_search_string_metrics_p(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind(cons(list($ADDITIONAL, GG_ADDITIONAL_SEARCH_STRING_METRICS_P), pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread)), thread);
                        ans = pattern_match.tree_matches_pattern(tree, $gg_search_string_metrics_pattern$.getGlobalValue());
                    } finally {
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject gg_search_results_metrics_p(SubLObject v_object) {
        return list_utilities.list_of_type_p(GG_SEARCH_RESULT_METRICS_P, v_object);
    }

    public static final SubLObject gg_search_result_metrics_p(SubLObject tree) {
        return pattern_match.tree_matches_pattern(tree, $gg_search_result_metrics_pattern$.getGlobalValue());
    }

    public static final SubLObject gg_filler_string_metrics_p(SubLObject v_object) {
        return makeBoolean((v_object == $DUPLICATE) || (NIL != list_utilities.list_of_type_p(GG_ONE_FILLER_STRING_METRICS_P, v_object)));
    }

    public static final SubLObject gg_one_filler_string_metrics_p(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind(cons(list($ADDITIONAL, GG_ADDITIONAL_FILLER_STRING_METRICS_P), pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread)), thread);
                        ans = pattern_match.tree_matches_pattern(tree, $gg_filler_string_metrics_pattern$.getGlobalValue());
                    } finally {
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject gg_complete_gaf_metrics_p(SubLObject v_object) {
        return list_utilities.list_of_type_p(GG_ONE_COMPLETE_GAF_METRICS_P, v_object);
    }

    public static final SubLObject gg_one_complete_gaf_metrics_p(SubLObject tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind(cons(list($ADDITIONAL, GG_ADDITIONAL_COMPLETE_GAF_METRICS_P), pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread)), thread);
                        ans = pattern_match.tree_matches_pattern(tree, $gg_complete_gaf_metrics_pattern$.getGlobalValue());
                    } finally {
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Returns the completed GAF
     */
    public static final SubLObject gg_one_complete_gaf_metrics_gaf(SubLObject one_complete_gaf_metrics) {
        {
            SubLObject gaf = $GAF_NOT_FOUND;
            if (NIL != list_utilities.lengthGE(one_complete_gaf_metrics, FIVE_INTEGER, UNPROVIDED)) {
                gaf = nth(FOUR_INTEGER, one_complete_gaf_metrics);
            }
            return gaf;
        }
    }

    public static final SubLObject gg_one_complete_gaf_metrics_predicate(SubLObject one_complete_gaf_metrics) {
        {
            SubLObject predicate = $UNKNOWN_PREDICATE;
            if (NIL != list_utilities.lengthGE(one_complete_gaf_metrics, FIVE_INTEGER, UNPROVIDED)) {
                {
                    SubLObject gaf = nth(FOUR_INTEGER, one_complete_gaf_metrics);
                    predicate = cycl_utilities.formula_arg0(gaf);
                }
            }
            return predicate;
        }
    }

    public static final SubLObject gg_additional_complete_gaf_metrics_p(SubLObject list) {
        return start_of_list_matches_patternsP(list, $gg_additional_complete_gafs_patterns$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $gg_complete_gaf_status_keywords$ = makeSymbol("*GG-COMPLETE-GAF-STATUS-KEYWORDS*");

    public static final SubLObject gg_complete_gaf_status_p(SubLObject v_object) {
        return makeBoolean((v_object.isKeyword() && (NIL != member(v_object, $gg_complete_gaf_status_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != gg_complete_gaf_verified_status_p(v_object)));
    }

    public static final SubLObject gg_complete_gaf_verified_status_p(SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list_alt59);
    }

    public static final SubLObject gg_gaf_verification_metrics_p(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind(cons($list_alt60, pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread)), thread);
                        ans = pattern_match.tree_matches_pattern(v_object, $list_alt61);
                    } finally {
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $gg_additional_gaf_verification_metrics_patterns$ = makeSymbol("*GG-ADDITIONAL-GAF-VERIFICATION-METRICS-PATTERNS*");

    public static final SubLObject gg_additional_gaf_verification_metrics_p(SubLObject list) {
        return start_of_list_matches_patternsP(list, $gg_additional_gaf_verification_metrics_patterns$.getGlobalValue());
    }

    public static final SubLObject gg_search_strings_verification_metrics_p(SubLObject v_object) {
        return list_utilities.list_of_type_p(GG_SEARCH_STRING_VERIFICATION_METRICS_P, v_object);
    }

    public static final SubLObject gg_search_string_verification_metrics_p(SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list_alt64);
    }

    public static final SubLObject gg_gaf_verification_metrics_id(SubLObject metrics) {
        return metrics.first();
    }

    public static final SubLObject gg_gaf_verification_metrics_status(SubLObject metrics) {
        return second(metrics);
    }

    /**
     * Lock used while establishing a unique metrics directory
     */
    // deflexical
    private static final SubLSymbol $gaf_gathering_metrics_directory_uniquifier_lock$ = makeSymbol("*GAF-GATHERING-METRICS-DIRECTORY-UNIQUIFIER-LOCK*");

    public static final SubLObject create_new_unique_gaf_gathering_metrics_directory() {
        {
            SubLObject path = gaf_gathering_metrics_directory_path_for_kb(control_vars.kb_loaded());
            SubLObject image_id_string = Strings.string_downcase(control_vars.cyc_image_id(), UNPROVIDED, UNPROVIDED);
            SubLObject directory_name = NIL;
            SubLObject lock = $gaf_gathering_metrics_directory_uniquifier_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                directory_name = uniquify_gaf_gathering_metrics_directory_name(path, image_id_string);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            file_utilities.make_directory_recursive(directory_name, NIL, $$$0775);
            return directory_name;
        }
    }

    // defparameter
    private static final SubLSymbol $gg_metrics_path$ = makeSymbol("*GG-METRICS-PATH*");

    public static final SubLObject gaf_gathering_metrics_directory_path_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gaf_gathering_master.get_fact_gathering_process_name()) {
                return format(NIL, $str_alt70$_A_A__5__0D_, new SubLObject[]{ $gg_metrics_path$.getDynamicValue(thread), gaf_gathering_master.get_fact_gathering_process_name(), kb });
            } else {
                return format(NIL, $str_alt71$_A_5__0D_, $gg_metrics_path$.getDynamicValue(thread), kb);
            }
        }
    }

    public static final SubLObject uniquify_gaf_gathering_metrics_directory_name(SubLObject path, SubLObject image_id_string) {
        {
            SubLObject uniquifier = ZERO_INTEGER;
            SubLObject local_name = gaf_gathering_metrics_directory_local_name(image_id_string, uniquifier);
            SubLObject directory_name = cconcatenate(path, local_name);
            while (NIL != Filesys.directory_p(directory_name)) {
                uniquifier = add(uniquifier, ONE_INTEGER);
                directory_name = cconcatenate(path, gaf_gathering_metrics_directory_local_name(image_id_string, uniquifier));
            } 
            return directory_name;
        }
    }

    public static final SubLObject gaf_gathering_metrics_directory_local_name(SubLObject image_id_string, SubLObject uniquifier) {
        if (image_id_string == UNPROVIDED) {
            image_id_string = Strings.string_downcase(control_vars.cyc_image_id(), UNPROVIDED, UNPROVIDED);
        }
        if (uniquifier == UNPROVIDED) {
            uniquifier = ZERO_INTEGER;
        }
        return format(NIL, $str_alt72$_A__3__0D_, image_id_string, uniquifier);
    }

    /**
     * Execute BODY with METRICS bound to each GG-METRICS-P (i.e. the results for one partial GAF) recorded for KB.
     */
    public static final SubLObject do_gg_metrics_for_kb(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    metrics = current.first();
                    current = current.rest();
                    {
                        SubLObject kb = (current.isCons()) ? ((SubLObject) (current.first())) : control_vars.kb_loaded();
                        destructuring_bind_must_listp(current, datum, $list_alt73);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject parent = $sym74$PARENT;
                                SubLObject directory = $sym75$DIRECTORY;
                                return list(CLET, list(list(parent, list(GAF_GATHERING_METRICS_DIRECTORY_PATH_FOR_KB, kb))), list(PWHEN, list(DIRECTORY_P, parent), list(DO_DIRECTORY_SUBDIRECTORIES, list(directory, parent), listS(DO_GG_METRICS_FOR_DIRECTORY, list(metrics, directory), append(body, NIL)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt73);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with METRICS bound to each GG-METRICS-P (i.e. the results for one partial GAF) recorded in DIRECTORY.
     */
    public static final SubLObject do_gg_metrics_for_directory(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject metrics = NIL;
                    SubLObject directory = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    directory = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject file = $sym82$FILE;
                            return list(CLET, list(list(file, listS(CCONCATENATE, directory, $list_alt6))), list(PWHEN, list($sym83$FILE_EXISTS_, file), list(DO_GG_METRICS_FILE, list(metrics, file), listS(PWHEN, list(GG_METRICS_P, metrics), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt81);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with METRICS bound to each GG-GAF-VERIFICATION-METRICS-P recorded for KB.
     */
    public static final SubLObject do_gg_verification_metrics_for_kb(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject verification_metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt85);
                    verification_metrics = current.first();
                    current = current.rest();
                    {
                        SubLObject kb = (current.isCons()) ? ((SubLObject) (current.first())) : control_vars.kb_loaded();
                        destructuring_bind_must_listp(current, datum, $list_alt85);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject directory = $sym86$DIRECTORY;
                                return list(DO_DIRECTORY_SUBDIRECTORIES, list(directory, list(GAF_GATHERING_METRICS_DIRECTORY_PATH_FOR_KB, kb)), listS(DO_GG_VERIFICATION_METRICS_FOR_DIRECTORY, list(verification_metrics, directory), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt85);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with METRICS bound to each GG-GAF-VERIFICATION-METRICS-P recorded in DIRECTORY
     */
    public static final SubLObject do_gg_verification_metrics_for_directory(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject verification_metrics = NIL;
                    SubLObject directory = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    verification_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    directory = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject file = $sym89$FILE;
                            return list(CLET, list(list(file, listS(CCONCATENATE, directory, $list_alt7))), list(PWHEN, list($sym83$FILE_EXISTS_, file), list(DO_GG_METRICS_FILE, list(verification_metrics, file), listS(PWHEN, list(GG_GAF_VERIFICATION_METRICS_P, verification_metrics), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt88);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_gg_metrics_search_string_results(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject search_string_metrics = NIL;
                    SubLObject gg_metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    search_string_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt90);
                    gg_metrics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(search_string_metrics, list(SECOND, gg_metrics)), listS(ASSERT_TYPE, search_string_metrics, $list_alt94), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt90);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_gg_metrics_filler_string_results(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject one_filler_string_metrics = NIL;
                    SubLObject gg_metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    one_filler_string_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt95);
                    gg_metrics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject search_string_metrics = $sym96$SEARCH_STRING_METRICS;
                            return list(DO_GG_METRICS_SEARCH_STRING_RESULTS, list(search_string_metrics, gg_metrics), listS(DO_GG_METRICS_FILLER_STRING_RESULTS_FOR_SEARCH_STRING, list(one_filler_string_metrics, search_string_metrics), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt95);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_gg_metrics_filler_string_results_for_search_string(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt99);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject one_filler_string_metrics = NIL;
                    SubLObject search_string_metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt99);
                    one_filler_string_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt99);
                    search_string_metrics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject search_result_metrics = $sym100$SEARCH_RESULT_METRICS;
                            SubLObject filler_string_metrics = $sym101$FILLER_STRING_METRICS;
                            return list(CDOLIST, list(search_result_metrics, list(SECOND, search_string_metrics)), listS(ASSERT_TYPE, search_result_metrics, $list_alt102), list(CLET, list(list(filler_string_metrics, list(SECOND, search_result_metrics))), listS(ASSERT_TYPE, filler_string_metrics, $list_alt103), list(PUNLESS, listS(EQ, filler_string_metrics, $list_alt105), listS(CDOLIST, list(one_filler_string_metrics, filler_string_metrics), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt99);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_gg_metrics_complete_gaf_results(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt106);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject one_complete_gaf_metrics = NIL;
                    SubLObject gg_metrics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    one_complete_gaf_metrics = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    gg_metrics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject one_filler_string_metrics = $sym107$ONE_FILLER_STRING_METRICS;
                            SubLObject complete_gaf_metrics = $sym108$COMPLETE_GAF_METRICS;
                            return list(DO_GG_METRICS_FILLER_STRING_RESULTS, list(one_filler_string_metrics, gg_metrics), list(CLET, list(list(complete_gaf_metrics, list(SECOND, one_filler_string_metrics))), listS(CDOLIST, list(one_complete_gaf_metrics, complete_gaf_metrics), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt106);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject load_gg_metrics_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject metrics = NIL;
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_3, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_4 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject new_metrics = load_one_gg_metrics_set(stream_4, eof);
                                                                                    if (new_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(new_metrics)) {
                                                                                            metrics = cons(new_metrics, metrics);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return metrics;
            }
        }
    }

    public static final SubLObject load_gg_verification_metrics_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject metrics = NIL;
                SubLTrampolineFile.checkType(gaf_gathering_metrics_directory_path_for_kb(kb), DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory(gaf_gathering_metrics_directory_path_for_kb(kb), T);
                    SubLObject progress_message_var = NIL;
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject directory = NIL;
                                            for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != Filesys.directory_p(directory)) {
                                                    if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                        directory = cconcatenate(directory, $str_alt110$_);
                                                    }
                                                    {
                                                        SubLObject file = cconcatenate(directory, $str_alt112$verification_metrics_cfasl);
                                                        if (NIL != file_utilities.file_existsP(file)) {
                                                            {
                                                                SubLObject eof = $EOF;
                                                                SubLObject stopP = NIL;
                                                                SubLObject stream = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                        try {
                                                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                            stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                        } finally {
                                                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                    if (!stream.isStream()) {
                                                                        Errors.error($str_alt29$Unable_to_open__S, file);
                                                                    }
                                                                    {
                                                                        SubLObject stream_8 = stream;
                                                                        while (NIL == stopP) {
                                                                            {
                                                                                SubLObject new_metrics = load_one_gg_metrics_set(stream_8, eof);
                                                                                if (new_metrics == eof) {
                                                                                    stopP = T;
                                                                                } else {
                                                                                    if (NIL != gg_gaf_verification_metrics_p(new_metrics)) {
                                                                                        metrics = cons(new_metrics, metrics);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (stream.isStream()) {
                                                                                close(stream, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return metrics;
            }
        }
    }

    public static final SubLObject load_gg_verification_metrics_for_directory(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject metrics = NIL;
                SubLObject file = cconcatenate(directory, $str_alt112$verification_metrics_cfasl);
                if (NIL != file_utilities.file_existsP(file)) {
                    {
                        SubLObject eof = $EOF;
                        SubLObject stopP = NIL;
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt29$Unable_to_open__S, file);
                            }
                            {
                                SubLObject stream_10 = stream;
                                while (NIL == stopP) {
                                    {
                                        SubLObject new_metrics = load_one_gg_metrics_set(stream_10, eof);
                                        if (new_metrics == eof) {
                                            stopP = T;
                                        } else {
                                            if (NIL != gg_gaf_verification_metrics_p(new_metrics)) {
                                                metrics = cons(new_metrics, metrics);
                                            }
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
                }
                return metrics;
            }
        }
    }

    public static final SubLObject load_gg_metrics(SubLObject directory) {
        {
            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
            SubLObject metrics = load_gg_metrics_internal(file);
            return metrics;
        }
    }

    public static final SubLObject load_gg_verification_metrics(SubLObject directory) {
        {
            SubLObject file = cconcatenate(directory, $str_alt112$verification_metrics_cfasl);
            SubLObject metrics = load_gg_metrics_internal(file);
            return metrics;
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P mapping (total +) STATUS -> (total +) PRED -> COUNT
     */
    public static final SubLObject categorize_gg_results_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject partial_gaf_count = ZERO_INTEGER;
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_11 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_12 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_12, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_13 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_13, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            partial_gaf_count = add(partial_gaf_count, ONE_INTEGER);
                                                                                            categorize_partial_gaf_results(gg_metrics, v_dictionary);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject hypothesis_count = dictionary.dictionary_lookup_without_values(v_dictionary, $TOTAL, ZERO_INTEGER);
                    format(T, $str_alt114$For_KB__S__we_formed__S_hypothese, new SubLObject[]{ kb, hypothesis_count, partial_gaf_count });
                    if (hypothesis_count.isZero()) {
                        princ($str_alt115$_, UNPROVIDED);
                    } else {
                        format(T, $str_alt116$__categorized_thus___);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject value = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (key != $TOTAL) {
                                        {
                                            SubLObject status = key;
                                            SubLObject status_results = value;
                                            SubLObject pred_results = NIL;
                                            SubLObject total = NIL;
                                            SubLObject iteration_state_15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(status_results));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_15)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject key_16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_15);
                                                    SubLObject value_17 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (key_16 == $TOTAL) {
                                                        total = value_17;
                                                    } else {
                                                        pred_results = cons(cons(key_16, value_17), pred_results);
                                                    }
                                                    iteration_state_15 = dictionary_contents.do_dictionary_contents_next(iteration_state_15);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_15);
                                            format(T, $str_alt117$____S__total__S___, status, total);
                                            {
                                                SubLObject cdolist_list_var = pred_results;
                                                SubLObject cons = NIL;
                                                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = cons;
                                                        SubLObject current = datum;
                                                        SubLObject pred = NIL;
                                                        SubLObject pred_count = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt118);
                                                        pred = current.first();
                                                        current = current.rest();
                                                        pred_count = current;
                                                        format(T, $str_alt119$_____S___S__, pred, pred_count);
                                                    }
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
                return v_dictionary;
            }
        }
    }

    public static final SubLObject gg_gather_totals_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_18 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_19 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_19, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_20 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_20, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            dictionary_utilities.dictionary_increment(results_dictionary, $TOTAL_KAG_COUNT, UNPROVIDED);
                                                                                            dictionary_utilities.dictionary_increment(results_dictionary, $TOTAL_TIME, gg_metrics.first());
                                                                                            {
                                                                                                SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                SubLObject search_string_metrics = NIL;
                                                                                                for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                    if ($VALID == third(search_string_metrics)) {
                                                                                                        dictionary_utilities.dictionary_increment(results_dictionary, $SEARCH_ENGINE_QUERY_COUNT, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject hypotheses = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                                                                                                SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                SubLObject search_string_metrics = NIL;
                                                                                                for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_21 = second(search_string_metrics);
                                                                                                        SubLObject search_result_metrics = NIL;
                                                                                                        for (search_result_metrics = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , search_result_metrics = cdolist_list_var_21.first()) {
                                                                                                            {
                                                                                                                SubLObject filler_string_metrics = second(search_result_metrics);
                                                                                                                if (filler_string_metrics != $DUPLICATE) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_22 = filler_string_metrics;
                                                                                                                        SubLObject one_filler_string_metrics = NIL;
                                                                                                                        for (one_filler_string_metrics = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , one_filler_string_metrics = cdolist_list_var_22.first()) {
                                                                                                                            {
                                                                                                                                SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                                                                                                SubLObject cdolist_list_var_23 = complete_gaf_metrics;
                                                                                                                                SubLObject one_complete_gaf_metrics = NIL;
                                                                                                                                for (one_complete_gaf_metrics = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , one_complete_gaf_metrics = cdolist_list_var_23.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject status = second(one_complete_gaf_metrics);
                                                                                                                                        SubLObject gaf = nth(FOUR_INTEGER, one_complete_gaf_metrics);
                                                                                                                                        SubLObject newP = set.set_add(gaf, hypotheses);
                                                                                                                                        if (NIL != newP) {
                                                                                                                                            dictionary_utilities.dictionary_increment(results_dictionary, $TOTAL_HYPOTHESIS_COUNT, UNPROVIDED);
                                                                                                                                            if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                                                                                                                status = $VERIFIED;
                                                                                                                                            }
                                                                                                                                            dictionary_utilities.dictionary_increment(results_dictionary, status, UNPROVIDED);
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
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_18, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                SubLTrampolineFile.checkType(gaf_gathering_metrics_directory_path_for_kb(kb), DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory(gaf_gathering_metrics_directory_path_for_kb(kb), T);
                    SubLObject progress_message_var = NIL;
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_25 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject directory = NIL;
                                            for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != Filesys.directory_p(directory)) {
                                                    if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                        directory = cconcatenate(directory, $str_alt110$_);
                                                    }
                                                    {
                                                        SubLObject file = cconcatenate(directory, $str_alt112$verification_metrics_cfasl);
                                                        if (NIL != file_utilities.file_existsP(file)) {
                                                            {
                                                                SubLObject eof = $EOF;
                                                                SubLObject stopP = NIL;
                                                                SubLObject stream = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_26 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                        try {
                                                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                            stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                        } finally {
                                                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_26, thread);
                                                                        }
                                                                    }
                                                                    if (!stream.isStream()) {
                                                                        Errors.error($str_alt29$Unable_to_open__S, file);
                                                                    }
                                                                    {
                                                                        SubLObject stream_27 = stream;
                                                                        while (NIL == stopP) {
                                                                            {
                                                                                SubLObject verification_metrics = load_one_gg_metrics_set(stream_27, eof);
                                                                                if (verification_metrics == eof) {
                                                                                    stopP = T;
                                                                                } else {
                                                                                    if (NIL != gg_gaf_verification_metrics_p(verification_metrics)) {
                                                                                        dictionary_utilities.dictionary_increment(results_dictionary, $SEARCH_ENGINE_QUERY_COUNT, length(nth(THREE_INTEGER, verification_metrics)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (stream.isStream()) {
                                                                                close(stream, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                            }
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return results_dictionary;
            }
        }
    }

    /**
     * Total time, KAG count, Hypothesis count broken down by status
     */
    public static final SubLObject gg_show_totals(SubLObject results_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject statuses = list_utilities.add_to_end($VERIFIED, $gg_complete_gaf_status_keywords$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_princ_strong($$$Totals);
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt128$Total_time__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(numeric_date_utilities.readable_elapsed_time_string(divide(dictionary.dictionary_lookup_without_values(results_dictionary, $TOTAL_TIME, ZERO_INTEGER), $int$1000), UNPROVIDED));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt130$Total_knowlege_acquisition_goals_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(dictionary.dictionary_lookup_without_values(results_dictionary, $TOTAL_KAG_COUNT, ZERO_INTEGER));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt131$Total_search_engine_queries__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(dictionary.dictionary_lookup_without_values(results_dictionary, $SEARCH_ENGINE_QUERY_COUNT, ZERO_INTEGER));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt132$Total_hypotheses_formed__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(dictionary.dictionary_lookup_without_values(results_dictionary, $TOTAL_HYPOTHESIS_COUNT, ZERO_INTEGER));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = statuses;
                            SubLObject status = NIL;
                            for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(status);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(dictionary.dictionary_lookup_without_values(results_dictionary, status, ZERO_INTEGER));
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $gg_html_color1$ = makeSymbol("*GG-HTML-COLOR1*");

    // deflexical
    private static final SubLSymbol $gg_html_color2$ = makeSymbol("*GG-HTML-COLOR2*");

    /**
     * predicate | # of hypotheses with each status | total KAG count | total hypotheses | retrieval rate
     */
    public static final SubLObject gg_show_hypothesis_statuses(SubLObject results_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject statuses = list_utilities.add_to_end($VERIFIED, $gg_complete_gaf_status_keywords$.getGlobalValue());
                SubLObject cumulative = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_princ_strong($str_alt133$Results_for_Knowledge_Acquisition);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Predicate);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Total_KAG_Count);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Total_Filler_Strings);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Total_Hypotheses);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = statuses;
                                    SubLObject status = NIL;
                                    for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ_strong(status);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Retrieval_Rate);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject bgcolor = NIL;
                            if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                bgcolor = $gg_html_color1$.getGlobalValue();
                            }
                            {
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject pair = NIL;
                                SubLObject ignore_me = NIL;
                                for (list_var = dictionary_utilities.sort_dictionary_by_keys(results_dictionary, symbol_function($sym139$TERM___WITH_CONSTANT_BY_NAME)), pair = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pair = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                    if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                        if (NIL != color_toggle) {
                                            color_toggle = NIL;
                                        } else {
                                            color_toggle = T;
                                        }
                                        bgcolor = (NIL != color_toggle) ? ((SubLObject) ($gg_html_color2$.getGlobalValue())) : $gg_html_color1$.getGlobalValue();
                                    }
                                    {
                                        SubLObject datum = pair;
                                        SubLObject current = datum;
                                        SubLObject pred = NIL;
                                        SubLObject pred_results = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt140);
                                        pred = current.first();
                                        current = current.rest();
                                        pred_results = current;
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(bgcolor);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject target = gg_filler_string_details_filename(pred);
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(target);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(pred);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                {
                                                    SubLObject hypothesis_count = dictionary.dictionary_lookup_without_values(pred_results, $TOTAL_HYPOTHESES, ZERO_INTEGER);
                                                    SubLObject filler_string_count = length(dictionary.dictionary_lookup_without_values(pred_results, $FILLER_STRINGS, NIL));
                                                    SubLObject kag_count = dictionary.dictionary_lookup_without_values(pred_results, $TOTAL_GOALS, ZERO_INTEGER);
                                                    dictionary_utilities.dictionary_increment(cumulative, $TOTAL_HYPOTHESES, hypothesis_count);
                                                    dictionary_utilities.dictionary_increment(cumulative, $FILLER_STRINGS, filler_string_count);
                                                    dictionary_utilities.dictionary_increment(cumulative, $TOTAL_GOALS, kag_count);
                                                    {
                                                        SubLObject cdolist_list_var = list(kag_count, filler_string_count, hypothesis_count);
                                                        SubLObject value = NIL;
                                                        for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (value.isPositive()) {
                                                                        html_utilities.html_princ(value);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = statuses;
                                                        SubLObject status = NIL;
                                                        for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject value = length(dictionary.dictionary_lookup_without_values(pred_results, status, NIL));
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($$$center));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (value.isPositive()) {
                                                                            dictionary_utilities.dictionary_increment(cumulative, status, value);
                                                                            html_utilities.html_princ(value);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$__1F_, number_utilities.percent(hypothesis_count, kag_count, UNPROVIDED));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Cumulative);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject kag_count = dictionary.dictionary_lookup_without_values(cumulative, $TOTAL_GOALS, ZERO_INTEGER);
                                    SubLObject hypothesis_count = dictionary.dictionary_lookup_without_values(cumulative, $TOTAL_HYPOTHESES, ZERO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong(kag_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong(dictionary.dictionary_lookup_without_values(cumulative, $FILLER_STRINGS, ZERO_INTEGER));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong(hypothesis_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    {
                                        SubLObject cdolist_list_var = statuses;
                                        SubLObject status = NIL;
                                        for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject status_total = dictionary.dictionary_lookup_without_values(cumulative, status, ZERO_INTEGER);
                                                        if (status_total.isPositive()) {
                                                            html_utilities.html_princ_strong(status_total);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$__1F_, number_utilities.percent(hypothesis_count, kag_count, UNPROVIDED));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P; (total +) pred -> (kag-total, filler-strings +) status -> hypotheses
     */
    public static final SubLObject gg_hypothesis_statuses_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_64 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_65 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_65, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_66 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_66, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            {
                                                                                                SubLObject predicate = gg_metrics_predicate(gg_metrics);
                                                                                                SubLObject pred_dict = dictionary.dictionary_lookup_without_values(results_dictionary, predicate, UNPROVIDED);
                                                                                                if (NIL == dictionary.dictionary_p(pred_dict)) {
                                                                                                    pred_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                                                                                                    dictionary.dictionary_enter(results_dictionary, predicate, pred_dict);
                                                                                                }
                                                                                                dictionary_utilities.dictionary_increment(pred_dict, $TOTAL_GOALS, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                    SubLObject search_string_metrics = NIL;
                                                                                                    for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject cdolist_list_var_67 = second(search_string_metrics);
                                                                                                            SubLObject search_result_metrics = NIL;
                                                                                                            for (search_result_metrics = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , search_result_metrics = cdolist_list_var_67.first()) {
                                                                                                                {
                                                                                                                    SubLObject filler_string_metrics = second(search_result_metrics);
                                                                                                                    if (filler_string_metrics != $DUPLICATE) {
                                                                                                                        {
                                                                                                                            SubLObject cdolist_list_var_68 = filler_string_metrics;
                                                                                                                            SubLObject one_filler_string_metrics = NIL;
                                                                                                                            for (one_filler_string_metrics = cdolist_list_var_68.first(); NIL != cdolist_list_var_68; cdolist_list_var_68 = cdolist_list_var_68.rest() , one_filler_string_metrics = cdolist_list_var_68.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject filler_string = third(one_filler_string_metrics);
                                                                                                                                    dictionary_utilities.dictionary_pushnew(pred_dict, $FILLER_STRINGS, filler_string, symbol_function(EQUAL), UNPROVIDED);
                                                                                                                                    {
                                                                                                                                        SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                                                                                                        SubLObject cdolist_list_var_69 = complete_gaf_metrics;
                                                                                                                                        SubLObject one_complete_gaf_metrics = NIL;
                                                                                                                                        for (one_complete_gaf_metrics = cdolist_list_var_69.first(); NIL != cdolist_list_var_69; cdolist_list_var_69 = cdolist_list_var_69.rest() , one_complete_gaf_metrics = cdolist_list_var_69.first()) {
                                                                                                                                            {
                                                                                                                                                SubLObject status = second(one_complete_gaf_metrics);
                                                                                                                                                SubLObject hypothesis = nth(FOUR_INTEGER, one_complete_gaf_metrics);
                                                                                                                                                if (NIL == member(hypothesis, dictionary.dictionary_lookup_without_values(pred_dict, status, NIL), symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                                                    dictionary_utilities.dictionary_increment(pred_dict, $TOTAL_HYPOTHESES, UNPROVIDED);
                                                                                                                                                    if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                                                                                                                        status = $VERIFIED;
                                                                                                                                                    }
                                                                                                                                                    dictionary_utilities.dictionary_push(pred_dict, status, hypothesis);
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
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_70, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_64, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return results_dictionary;
            }
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P; pred -> hit-count -> search-strings
     */
    public static final SubLObject gg_search_string_hit_counts_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject counts = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_71 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_72 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_72, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_73 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_73, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            {
                                                                                                SubLObject predicate = gg_metrics_predicate(gg_metrics);
                                                                                                SubLObject partial_gaf = gg_metrics_partial_gaf(gg_metrics);
                                                                                                SubLObject pred_dict = dictionary.dictionary_lookup_without_values(counts, predicate, UNPROVIDED);
                                                                                                if (NIL == dictionary.dictionary_p(pred_dict)) {
                                                                                                    pred_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                                                                                                    dictionary.dictionary_enter(counts, predicate, pred_dict);
                                                                                                }
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                    SubLObject search_string_metrics = NIL;
                                                                                                    for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject hit_count = length(second(search_string_metrics));
                                                                                                            SubLObject search_string = cconcatenate(format_nil.format_nil_s_no_copy(partial_gaf), new SubLObject[]{ $str_alt147$____, format_nil.format_nil_s_no_copy(nth(THREE_INTEGER, search_string_metrics)) });
                                                                                                            if ($INVALID != third(search_string_metrics)) {
                                                                                                                dictionary_utilities.dictionary_pushnew(pred_dict, hit_count, search_string, UNPROVIDED, UNPROVIDED);
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
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_71, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return counts;
            }
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P; pred -> search-string -> filler-string -> status -> filler-cycls
     */
    public static final SubLObject gg_filler_string_details_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_75 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_76 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_76, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_77 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_77, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            {
                                                                                                SubLObject predicate = gg_metrics_predicate(gg_metrics);
                                                                                                SubLObject pred_dict = dictionary.dictionary_lookup_without_values(results, predicate, UNPROVIDED);
                                                                                                if (NIL == dictionary.dictionary_p(pred_dict)) {
                                                                                                    pred_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                                                                                    dictionary.dictionary_enter(results, predicate, pred_dict);
                                                                                                }
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                    SubLObject search_string_metrics = NIL;
                                                                                                    for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                        gg_note_search_string_metrics_details(search_string_metrics, pred_dict);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_75, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return results;
            }
        }
    }

    public static final SubLObject gg_note_search_string_metrics_details(SubLObject search_string_metrics, SubLObject pred_dict) {
        {
            SubLObject search_string = nth(THREE_INTEGER, search_string_metrics);
            SubLObject search_string_dict = dictionary.dictionary_lookup_without_values(pred_dict, search_string, UNPROVIDED);
            SubLObject cdolist_list_var = second(search_string_metrics);
            SubLObject search_result_metrics = NIL;
            for (search_result_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_result_metrics = cdolist_list_var.first()) {
                {
                    SubLObject filler_string_metrics = second(search_result_metrics);
                    if (filler_string_metrics != $DUPLICATE) {
                        {
                            SubLObject cdolist_list_var_79 = filler_string_metrics;
                            SubLObject filler_string_metrics_80 = NIL;
                            for (filler_string_metrics_80 = cdolist_list_var_79.first(); NIL != cdolist_list_var_79; cdolist_list_var_79 = cdolist_list_var_79.rest() , filler_string_metrics_80 = cdolist_list_var_79.first()) {
                                if (NIL == dictionary.dictionary_p(search_string_dict)) {
                                    search_string_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                    dictionary.dictionary_enter(pred_dict, search_string, search_string_dict);
                                }
                                {
                                    SubLObject complete_gaf_metrics = nth(ONE_INTEGER, filler_string_metrics_80);
                                    SubLObject filler_string = nth(TWO_INTEGER, filler_string_metrics_80);
                                    SubLObject filler_string_dict = dictionary.dictionary_lookup_without_values(search_string_dict, filler_string, UNPROVIDED);
                                    if (NIL == dictionary.dictionary_p(filler_string_dict)) {
                                        if (NIL != list_utilities.empty_list_p(complete_gaf_metrics)) {
                                            dictionary.dictionary_enter(search_string_dict, filler_string, NIL);
                                        } else {
                                            filler_string_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                                            dictionary.dictionary_enter(search_string_dict, filler_string, filler_string_dict);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var_81 = complete_gaf_metrics;
                                        SubLObject one_complete_gaf_metrics = NIL;
                                        for (one_complete_gaf_metrics = cdolist_list_var_81.first(); NIL != cdolist_list_var_81; cdolist_list_var_81 = cdolist_list_var_81.rest() , one_complete_gaf_metrics = cdolist_list_var_81.first()) {
                                            {
                                                SubLObject status = nth(ONE_INTEGER, one_complete_gaf_metrics);
                                                SubLObject filler_cycl = nth(THREE_INTEGER, one_complete_gaf_metrics);
                                                if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                    status = $VERIFIED;
                                                }
                                                dictionary_utilities.dictionary_pushnew(filler_string_dict, status, filler_cycl, symbol_function(EQUAL), UNPROVIDED);
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
        return pred_dict;
    }

    public static final SubLObject write_html_gg_info_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            gg_write_filler_string_details(kb, UNPROVIDED, UNPROVIDED);
            {
                SubLObject metrics_directory = gaf_gathering_metrics_directory_path_for_kb(kb);
                SubLObject title = cconcatenate($str_alt149$GAF_Gathering_Results_for_KB_, format_nil.format_nil_d_no_copy(kb));
                SubLObject filename = cconcatenate(metrics_directory, $str_alt150$metrics_html);
                SubLObject html = NIL;
                if (NIL != Filesys.directory_p(metrics_directory)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_output_stream();
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream, thread);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                        try {
                                            html_macros.$html_inside_bodyP$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ(title);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    gg_show_table_of_contents();
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$Totals);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    gg_show_totals(gg_gather_totals_for_kb(kb));
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$OpenSearchStringHitCounts);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    {
                                                        SubLObject hit_counts_info = gg_search_string_hit_counts_for_kb(kb);
                                                        gg_write_search_string_details(hit_counts_info, metrics_directory);
                                                        gg_show_search_string_hit_counts(hit_counts_info);
                                                    }
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$KnowledgeAcquisitionGoalResults);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    gg_show_hypothesis_statuses(gg_hypothesis_statuses_for_kb(kb));
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$TimeBreakdown);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    gg_time_breakdown_bar_graphs(gg_time_breakdown_for_kb(kb));
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$VerifiedHypotheses);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    gg_show_verified_gafs(gg_web_verified_gafs_for_kb(kb));
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html = get_output_stream_string(stream);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(stream, UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    possibly_update_text_file(filename, html);
                }
                return filename;
            }
        }
    }

    public static final SubLObject gg_show_table_of_contents() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ($str_alt155$Contents_);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt156$_Totals);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Totals);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt157$_OpenSearchStringHitCounts);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Predicate_Breakdown);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt157$_OpenSearchStringHitCounts);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Open_Search_String_Hit_Counts);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt160$_KnowledgeAcquisitionGoalResults);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt161$Knowledge_Acquisition_Goal_Result);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt162$_TimeBreakdown);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Time_Breakdown);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt164$_VerifiedHypotheses);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Verified_Hypotheses);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject gg_write_search_string_details(SubLObject counts, SubLObject metrics_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = cconcatenate(metrics_directory, $str_alt166$search_string_details_);
                if (NIL == Filesys.directory_p(directory)) {
                    file_utilities.make_directory_recursive(directory, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(counts));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject hit_counts_to_strings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject title = cconcatenate($str_alt167$Search_Strings_for_, format_nil.format_nil_a_no_copy(pred));
                                SubLObject html = NIL;
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                        try {
                                            html_macros.$html_stream$.bind(stream, thread);
                                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                            html_macros.html_head_content_type();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_102 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                            html_utilities.html_markup(ONE_INTEGER);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            html_utilities.html_princ(title);
                                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                            html_utilities.html_markup(ONE_INTEGER);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject unsuccessful = dictionary.dictionary_lookup_without_values(hit_counts_to_strings, ZERO_INTEGER, NIL);
                                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt168$Unsuccessful_Search_Strings___D_, length(unsuccessful));
                                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject cdolist_list_var = unsuccessful;
                                                                    SubLObject string = NIL;
                                                                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                                                        html_utilities.html_princ(string);
                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                    }
                                                                }
                                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                            }
                                                            {
                                                                SubLObject successful = NIL;
                                                                SubLObject iteration_state_104 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(hit_counts_to_strings));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_104)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject hit_count = dictionary_contents.do_dictionary_contents_key_value(iteration_state_104);
                                                                        SubLObject search_strings = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (!hit_count.isZero()) {
                                                                            {
                                                                                SubLObject cdolist_list_var = search_strings;
                                                                                SubLObject search_string = NIL;
                                                                                for (search_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject item_var = search_string;
                                                                                        if (NIL == member(item_var, successful, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                            successful = cons(item_var, successful);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        iteration_state_104 = dictionary_contents.do_dictionary_contents_next(iteration_state_104);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_104);
                                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt169$Successful_Search_Strings___D_, length(successful));
                                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject cdolist_list_var = successful;
                                                                    SubLObject string = NIL;
                                                                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                                                        html_utilities.html_princ(string);
                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_copyright_notice();
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_102, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html = get_output_stream_string(stream);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            close(stream, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject filename = cconcatenate(metrics_directory, gg_search_string_details_filename(pred));
                                    possibly_update_text_file(filename, html);
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
            return counts;
        }
    }

    public static final SubLObject gg_search_string_details_filename(SubLObject pred) {
        {
            SubLObject directory = $str_alt166$search_string_details_;
            return string_utilities.remove_substring(cconcatenate(format_nil.format_nil_a_no_copy(directory), new SubLObject[]{ format_nil.format_nil_a_no_copy(pred), $str_alt170$_html }), constant_reader.constant_reader_prefix());
        }
    }

    public static final SubLObject gg_write_filler_string_details(SubLObject kb, SubLObject details, SubLObject metrics_directory) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        if (details == UNPROVIDED) {
            details = gg_filler_string_details_for_kb(kb);
        }
        if (metrics_directory == UNPROVIDED) {
            metrics_directory = gaf_gathering_metrics_directory_path_for_kb(kb);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = cconcatenate(metrics_directory, $str_alt171$filler_string_details_);
                if (NIL == Filesys.directory_p(directory)) {
                    file_utilities.make_directory_recursive(directory, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(details));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject search_string_to_results = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        gg_write_filler_string_details_for_pred(pred, search_string_to_results, metrics_directory);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return details;
        }
    }

    public static final SubLObject gg_write_filler_string_details_for_pred(SubLObject pred, SubLObject search_string_to_results, SubLObject metrics_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = cconcatenate($str_alt172$Filler_Strings_for_, format_nil.format_nil_a_no_copy(pred));
                SubLObject html = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_105 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_string_to_results));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject search_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        SubLObject filler_string_to_results = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        gg_write_filler_string_details_for_search_string(search_string, filler_string_to_results);
                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_105, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject filename = cconcatenate(metrics_directory, gg_filler_string_details_filename(pred));
                    possibly_update_text_file(filename, html);
                }
            }
            return pred;
        }
    }

    /**
     * Make NEW-CONTENT be the content of FILENAME, updating it iff necessary.
     */
    public static final SubLObject possibly_update_text_file(SubLObject filename, SubLObject new_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = (NIL != file_utilities.file_existsP(filename)) ? ((SubLObject) (string_utilities.read_string_from_file(filename, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject updatedP = NIL;
                if (!existing.equal(new_content)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt29$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject stream_107 = stream;
                                princ(new_content, stream_107);
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
                    updatedP = T;
                }
                return updatedP;
            }
        }
    }

    public static final SubLObject gg_write_filler_string_details_for_search_string(SubLObject search_string, SubLObject filler_string_to_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unsuccessful = NIL;
                SubLObject statuses = list_utilities.add_to_end($VERIFIED, $gg_complete_gaf_status_keywords$.getGlobalValue());
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(filler_string_to_results));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject filler_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject results = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == results) {
                                unsuccessful = cons(filler_string, unsuccessful);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(THREE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != $gg_html_color1$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($gg_html_color1$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt174$100_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$center));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != $gg_html_color1$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($gg_html_color1$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                        html_utilities.html_princ(search_string);
                                        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != unsuccessful) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != $gg_html_color2$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($gg_html_color2$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt175$Unsuccessful_Filler_Strings___D_, length(unsuccessful));
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = unsuccessful;
                                SubLObject string = NIL;
                                for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$white);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ(string);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = statuses;
                            SubLObject status = NIL;
                            for (status = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , status = cdolist_list_var.first()) {
                                {
                                    SubLObject alist = NIL;
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(filler_string_to_results));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject filler_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject results = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != dictionary.dictionary_p(results)) {
                                                {
                                                    SubLObject cycls = dictionary.dictionary_lookup_without_values(results, status, UNPROVIDED);
                                                    if (NIL != cycls) {
                                                        alist = cons(cons(filler_string, cycls), alist);
                                                    }
                                                }
                                            }
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    if (NIL != alist) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($$$center));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != $gg_html_color2$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($gg_html_color2$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt177$_S_Filler_Strings___D_, status, length(alist));
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var_116 = alist;
                                            SubLObject cons = NIL;
                                            for (cons = cdolist_list_var_116.first(); NIL != cdolist_list_var_116; cdolist_list_var_116 = cdolist_list_var_116.rest() , cons = cdolist_list_var_116.first()) {
                                                {
                                                    SubLObject datum = cons;
                                                    SubLObject current = datum;
                                                    SubLObject string = NIL;
                                                    SubLObject cycls = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt178);
                                                    string = current.first();
                                                    current = current.rest();
                                                    cycls = current;
                                                    {
                                                        SubLObject list_var = NIL;
                                                        SubLObject cycl = NIL;
                                                        SubLObject n = NIL;
                                                        for (list_var = cycls, cycl = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cycl = list_var.first() , n = add(ONE_INTEGER, n)) {
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$white);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            if (n.isZero()) {
                                                                                html_utilities.html_princ(string);
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_prin1(cycl);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return search_string;
        }
    }

    public static final SubLObject gg_filler_string_details_filename(SubLObject pred) {
        {
            SubLObject directory = $str_alt171$filler_string_details_;
            return string_utilities.remove_substring(cconcatenate(format_nil.format_nil_a_no_copy(directory), new SubLObject[]{ format_nil.format_nil_a_no_copy(pred), $str_alt170$_html }), constant_reader.constant_reader_prefix());
        }
    }

    /**
     * predicate | search-strings-with-each-hit-count-0-20 | search-string-count | hit %
     */
    public static final SubLObject gg_show_search_string_hit_counts(SubLObject counts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject totals = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_princ_strong($str_alt179$Hit_Counts_for_Open_Search_String);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Predicate);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject hit_count = NIL;
                                    for (hit_count = ZERO_INTEGER; hit_count.numL($int$21); hit_count = add(hit_count, ONE_INTEGER)) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($$$center));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ_strong(hit_count);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Total_Search_Strings);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Positive_Hit_Count_Strings);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($str_alt183$Positive_Hit_Count__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject bgcolor = NIL;
                            if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                bgcolor = $gg_html_color1$.getGlobalValue();
                            }
                            {
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject pair = NIL;
                                SubLObject ignore_me = NIL;
                                for (list_var = dictionary_utilities.sort_dictionary_by_keys(counts, symbol_function($sym139$TERM___WITH_CONSTANT_BY_NAME)), pair = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pair = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                    if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                        if (NIL != color_toggle) {
                                            color_toggle = NIL;
                                        } else {
                                            color_toggle = T;
                                        }
                                        bgcolor = (NIL != color_toggle) ? ((SubLObject) ($gg_html_color2$.getGlobalValue())) : $gg_html_color1$.getGlobalValue();
                                    }
                                    {
                                        SubLObject datum = pair;
                                        SubLObject current = datum;
                                        SubLObject pred = NIL;
                                        SubLObject hit_counts = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt184);
                                        pred = current.first();
                                        current = current.rest();
                                        hit_counts = current;
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(bgcolor);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject target = gg_search_string_details_filename(pred);
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(target);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(pred);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                {
                                                    SubLObject search_string_count_for_pred = ZERO_INTEGER;
                                                    SubLObject zero_hit_count = length(dictionary.dictionary_lookup_without_values(hit_counts, ZERO_INTEGER, NIL));
                                                    SubLObject hit_count = NIL;
                                                    for (hit_count = ZERO_INTEGER; hit_count.numL($int$21); hit_count = add(hit_count, ONE_INTEGER)) {
                                                        {
                                                            SubLObject search_strings = dictionary.dictionary_lookup_without_values(hit_counts, hit_count, NIL);
                                                            SubLObject value = length(search_strings);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (value.isPositive()) {
                                                                        search_string_count_for_pred = add(search_string_count_for_pred, value);
                                                                        dictionary_utilities.dictionary_increment(totals, hit_count, value);
                                                                        html_utilities.html_princ(value);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(search_string_count_for_pred);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    dictionary_utilities.dictionary_increment(totals, $TOTAL_SEARCH_STRINGS, search_string_count_for_pred);
                                                    {
                                                        SubLObject positive_count = subtract(search_string_count_for_pred, zero_hit_count);
                                                        dictionary_utilities.dictionary_increment(totals, $SUCCESSFUL_SEARCH_STRINGS, positive_count);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(positive_count);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (search_string_count_for_pred.isPositive()) {
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$__1F_, number_utilities.percent(positive_count, search_string_count_for_pred, UNPROVIDED));
                                                                } else {
                                                                    html_utilities.html_princ($str_alt187$__);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Cumulative);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject hit_count = NIL;
                                    for (hit_count = ZERO_INTEGER; hit_count.numL($int$21); hit_count = add(hit_count, ONE_INTEGER)) {
                                        {
                                            SubLObject hit_count_total = dictionary.dictionary_lookup_without_values(totals, hit_count, ZERO_INTEGER);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (hit_count_total.isPositive()) {
                                                        html_utilities.html_princ_strong(hit_count_total);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    }
                                }
                                {
                                    SubLObject total_search_strings = dictionary.dictionary_lookup_without_values(totals, $TOTAL_SEARCH_STRINGS, ZERO_INTEGER);
                                    SubLObject successful_search_strings = dictionary.dictionary_lookup_without_values(totals, $SUCCESSFUL_SEARCH_STRINGS, ZERO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong(total_search_strings);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong(successful_search_strings);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            if (total_search_strings.isPositive()) {
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$__1F_, number_utilities.percent(successful_search_strings, total_search_strings, UNPROVIDED));
                                            } else {
                                                html_utilities.html_princ($str_alt187$__);
                                            }
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param DATA
     * 		dictionary-p; mapping gaf -> (VERIFIED-STRING HIT-COUNT)+
     */
    public static final SubLObject gg_show_verified_gafs(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ($$$Verified_Hypotheses);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject data_alist = list_utilities.sort_alist_by_values(dictionary_utilities.dictionary_to_alist(data), symbol_function(LONGER_DICTIONARY_P));
                SubLObject bgcolor = NIL;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$center));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Contents);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = data_alist;
                            SubLObject cons = NIL;
                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = cons;
                                    SubLObject current = datum;
                                    SubLObject predicate = NIL;
                                    SubLObject predicate_dictionary = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt190);
                                    predicate = current.first();
                                    current = current.rest();
                                    predicate_dictionary = current;
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject href = cconcatenate($str_alt191$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(predicate), $$$VerifiedGAFs });
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(href);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt193$_S___D_hypotheses_, predicate, dictionary.dictionary_length(predicate_dictionary));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                {
                    SubLObject cdolist_list_var = data_alist;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject predicate = NIL;
                            SubLObject predicate_dictionary = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt190);
                            predicate = current.first();
                            current = current.rest();
                            predicate_dictionary = current;
                            {
                                SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(predicate), $$$VerifiedGAFs);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                if (NIL != name) {
                                    html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(name);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt194$Verified_Hypotheses_for__S, predicate);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt174$100_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($$$Verified_Hypothesis);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt196$Search_String_Used_for_Verificati);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($$$Hit_Count);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject sorted_pairs = dictionary_utilities.sort_dictionary_by_keys(predicate_dictionary, symbol_function($sym139$TERM___WITH_CONSTANT_BY_NAME));
                                        if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                            bgcolor = $gg_html_color1$.getGlobalValue();
                                        }
                                        {
                                            SubLObject color_toggle = NIL;
                                            SubLObject list_var = NIL;
                                            SubLObject pair = NIL;
                                            SubLObject ignore_me = NIL;
                                            for (list_var = sorted_pairs, pair = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pair = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                                if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                    if (NIL != color_toggle) {
                                                        color_toggle = NIL;
                                                    } else {
                                                        color_toggle = T;
                                                    }
                                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) ($gg_html_color2$.getGlobalValue())) : $gg_html_color1$.getGlobalValue();
                                                }
                                                {
                                                    SubLObject datum_148 = pair;
                                                    SubLObject current_149 = datum_148;
                                                    SubLObject gaf = NIL;
                                                    SubLObject gaf_data = NIL;
                                                    destructuring_bind_must_consp(current_149, datum_148, $list_alt198);
                                                    gaf = current_149.first();
                                                    current_149 = current_149.rest();
                                                    gaf_data = current_149;
                                                    gaf_data = Sort.sort(copy_list(gaf_data), symbol_function($sym199$_), symbol_function(SECOND));
                                                    {
                                                        SubLObject datum_150 = gaf_data.first();
                                                        SubLObject datum_151 = datum_150;
                                                        SubLObject current_152 = datum_151;
                                                        SubLObject search_string = NIL;
                                                        SubLObject hit_count = NIL;
                                                        destructuring_bind_must_consp(current_152, datum_151, $list_alt200);
                                                        search_string = current_152.first();
                                                        current_152 = current_152.rest();
                                                        destructuring_bind_must_consp(current_152, datum_151, $list_alt200);
                                                        hit_count = current_152.first();
                                                        current_152 = current_152.rest();
                                                        if (NIL == current_152) {
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            if (NIL != bgcolor) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(bgcolor);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_prin1(gaf);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(search_string);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($$$center));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(hit_count);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } else {
                                                            cdestructuring_bind_error(datum_151, $list_alt200);
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var_157 = gaf_data.rest();
                                                        SubLObject datum_158 = NIL;
                                                        for (datum_158 = cdolist_list_var_157.first(); NIL != cdolist_list_var_157; cdolist_list_var_157 = cdolist_list_var_157.rest() , datum_158 = cdolist_list_var_157.first()) {
                                                            {
                                                                SubLObject datum_159 = datum_158;
                                                                SubLObject current_160 = datum_159;
                                                                SubLObject search_string = NIL;
                                                                SubLObject hit_count = NIL;
                                                                destructuring_bind_must_consp(current_160, datum_159, $list_alt200);
                                                                search_string = current_160.first();
                                                                current_160 = current_160.rest();
                                                                destructuring_bind_must_consp(current_160, datum_159, $list_alt200);
                                                                hit_count = current_160.first();
                                                                current_160 = current_160.rest();
                                                                if (NIL == current_160) {
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    if (NIL != bgcolor) {
                                                                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(bgcolor);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(search_string);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$center));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(hit_count);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                } else {
                                                                    cdestructuring_bind_error(datum_159, $list_alt200);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject longer_dictionary_p(SubLObject dictionary1, SubLObject dictionary2) {
        return numG(dictionary.dictionary_length(dictionary1), dictionary.dictionary_length(dictionary2));
    }

    /**
     *
     *
     * @return DICTIONARY-P; task-type -> milliseconds, showing how many milliseconds we spent on each task type,
    which collectively partition the GAF-gathering process
     */
    public static final SubLObject gg_time_breakdown_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject times = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_165 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_166 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_166, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_167 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_167, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            gg_time_breakdown_for_gg_metrics(gg_metrics, times);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_168 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_168, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_165, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return times;
            }
        }
    }

    public static final SubLObject gg_time_breakdown_bar_graphs(SubLObject breakdown) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ($$$Time_Breakdown);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject remote_tasks = $list_alt201;
                SubLObject total_time = apply(symbol_function($sym202$_), dictionary.dictionary_values(breakdown));
                SubLObject remote_time = ZERO_INTEGER;
                SubLObject local_time = ZERO_INTEGER;
                if (!total_time.isPositive()) {
                    html_utilities.html_princ_strong($str_alt203$No_GAF_gathering_metrics_collecte);
                    return NIL;
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(breakdown));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject task_type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject ms = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != member(task_type, remote_tasks, UNPROVIDED, UNPROVIDED)) {
                                remote_time = add(remote_time, ms);
                            } else {
                                local_time = add(local_time, ms);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject unit = gg_determine_unit(total_time);
                    SubLObject units_string = gg_unit_string(unit);
                    SubLObject remote_label = gg_time_breakdown_bar_graph_label($REMOTE, remote_time, total_time);
                    SubLObject local_label = gg_time_breakdown_bar_graph_label($LOCAL, local_time, total_time);
                    SubLObject remote_value = gg_ms_to_granularity(remote_time, unit);
                    SubLObject local_value = gg_ms_to_granularity(local_time, unit);
                    SubLObject graph_title = cconcatenate($str_alt206$Remote_Time_vs__Local_Time__in_, new SubLObject[]{ format_nil.format_nil_a_no_copy(units_string), $str_alt207$__br_Remote_tasks_include_, format_nil.format_nil_a_no_copy(remote_tasks) });
                    gg_time_breakdown_bar_graph(graph_title, list(list(remote_label, remote_value), list(local_label, local_value)));
                }
                if (local_time.isPositive()) {
                    {
                        SubLObject label_value_pairs = NIL;
                        SubLObject misc_data = NIL;
                        SubLObject misc_label_value_pairs = NIL;
                        SubLObject total_local_time = subtract(total_time, remote_time);
                        SubLObject unit = gg_determine_unit(total_local_time);
                        SubLObject misc_time = ZERO_INTEGER;
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(breakdown));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject task_type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject ms = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != member(task_type, remote_tasks, UNPROVIDED, UNPROVIDED)) {
                                } else
                                    if (ms.numL(integerDivide(local_time, $int$100))) {
                                        misc_data = cons(list(task_type, ms), misc_data);
                                        misc_time = add(misc_time, ms);
                                    } else {
                                        {
                                            SubLObject label = gg_time_breakdown_bar_graph_label(task_type, ms, total_local_time);
                                            label_value_pairs = cons(list(label, gg_ms_to_granularity(ms, unit)), label_value_pairs);
                                        }
                                    }

                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        {
                            SubLObject misc_label = gg_time_breakdown_bar_graph_label($OTHER, misc_time, total_local_time);
                            label_value_pairs = cons(list(misc_label, gg_ms_to_granularity(misc_time, unit)), label_value_pairs);
                        }
                        {
                            SubLObject graph_title = cconcatenate($str_alt210$Breakdown_of_Local_Time__in_, new SubLObject[]{ format_nil.format_nil_a_no_copy(gg_unit_string(unit)), $str_alt211$_ });
                            gg_time_breakdown_bar_graph(graph_title, nreverse(label_value_pairs));
                        }
                        if (misc_time.isPositive()) {
                            {
                                SubLObject cdolist_list_var = misc_data;
                                SubLObject datum = NIL;
                                for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum_169 = datum;
                                        SubLObject current = datum_169;
                                        SubLObject task_type = NIL;
                                        SubLObject ms = NIL;
                                        destructuring_bind_must_consp(current, datum_169, $list_alt212);
                                        task_type = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum_169, $list_alt212);
                                        ms = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject label = gg_time_breakdown_bar_graph_label(task_type, ms, misc_time);
                                                misc_label_value_pairs = cons(list(label, ms), misc_label_value_pairs);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_169, $list_alt212);
                                        }
                                    }
                                }
                            }
                            gg_time_breakdown_bar_graph($str_alt213$Breakdown_of__Other___in_ms_, misc_label_value_pairs);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject gg_determine_unit(SubLObject total_time) {
        if (total_time.numLE($int$10000)) {
            return $MILLISECONDS;
        } else
            if (total_time.numLE(multiply(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(), $int$100, $int$1000))) {
                return $SECONDS;
            } else {
                return $MINUTES;
            }

    }

    public static final SubLObject gg_ms_to_granularity(SubLObject ms, SubLObject unit) {
        {
            SubLObject pcase_var = unit;
            if (pcase_var.eql($MILLISECONDS)) {
                return ms;
            } else
                if (pcase_var.eql($SECONDS)) {
                    return round(ms, $int$1000);
                } else
                    if (pcase_var.eql($MINUTES)) {
                        return round(ms, multiply($int$1000, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()));
                    }


        }
        return NIL;
    }

    public static final SubLObject gg_unit_string(SubLObject unit) {
        {
            SubLObject pcase_var = unit;
            if (pcase_var.eql($MILLISECONDS)) {
                return $$$ms;
            } else
                if (pcase_var.eql($SECONDS)) {
                    return $$$seconds;
                } else
                    if (pcase_var.eql($MINUTES)) {
                        return $$$minutes;
                    }


        }
        return NIL;
    }

    public static final SubLObject gg_time_breakdown_bar_graph_label(SubLObject task_type, SubLObject time, SubLObject total_time) {
        {
            SubLObject percent = divide(round(multiply(TEN_INTEGER, number_utilities.percent(time, total_time, UNPROVIDED)), UNPROVIDED), TEN_INTEGER);
            return format(NIL, $str_alt221$_A____1F__, task_type, percent);
        }
    }

    public static final SubLObject gg_time_breakdown_bar_graph(SubLObject graph_title, SubLObject label_value_pairs) {
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_markup(graph_title);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_utilities.html_horizontal_bar_graph(Sort.stable_sort(copy_list(label_value_pairs), symbol_function($sym199$_), symbol_function(SECOND)), ONE_INTEGER, T, $gg_html_color1$.getGlobalValue(), $gg_html_color2$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject gg_time_breakdown_for_gg_metrics(SubLObject gg_metrics, SubLObject times) {
        if (times == UNPROVIDED) {
            times = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        SubLTrampolineFile.checkType(gg_metrics, GG_METRICS_P);
        {
            SubLObject categorized = ZERO_INTEGER;
            SubLObject datum = list_utilities.first_n(THREE_INTEGER, gg_metrics);
            SubLObject current = datum;
            SubLObject total_milliseconds = NIL;
            SubLObject search_strings_metrics = NIL;
            SubLObject search_string_generation_milliseconds = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt222);
            total_milliseconds = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt222);
            search_strings_metrics = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt222);
            search_string_generation_milliseconds = current.first();
            current = current.rest();
            if (NIL == current) {
                gg_add_time_to_breakdown(times, $SEARCH_STRING_GENERATION, search_string_generation_milliseconds);
                categorized = add(categorized, search_string_generation_milliseconds);
                {
                    SubLObject cdolist_list_var = search_strings_metrics;
                    SubLObject search_string_metrics = NIL;
                    for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                        categorized = add(categorized, gg_time_breakdown_for_search_string_metrics(search_string_metrics, times));
                    }
                }
                {
                    SubLObject uncategorized = subtract(total_milliseconds, categorized);
                    gg_add_time_to_breakdown(times, $UNCATEGORIZED, uncategorized);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt222);
            }
        }
        return times;
    }

    public static final SubLObject gg_time_breakdown_for_search_string_metrics(SubLObject search_string_metrics, SubLObject times) {
        if (times == UNPROVIDED) {
            times = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        SubLTrampolineFile.checkType(search_string_metrics, GG_ONE_SEARCH_STRING_METRICS_P);
        {
            SubLObject categorized = ZERO_INTEGER;
            SubLObject datum = search_string_metrics;
            SubLObject current = datum;
            SubLObject search_string_total_ms = NIL;
            SubLObject search_results_metrics = NIL;
            SubLObject validity = NIL;
            SubLObject search_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            search_string_total_ms = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            search_results_metrics = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            validity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt225);
            search_string = current.first();
            current = current.rest();
            {
                SubLObject search_string_massaging_time = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt225);
                current = current.rest();
                {
                    SubLObject waiting_for_search_engine_time = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt225);
                    current = current.rest();
                    {
                        SubLObject asserting_search_result_supports_time = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt225);
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != search_string_massaging_time) {
                                gg_add_time_to_breakdown(times, $SEARCH_STRING_MASSAGING, search_string_massaging_time);
                                categorized = add(categorized, search_string_massaging_time);
                            }
                            if (NIL != waiting_for_search_engine_time) {
                                gg_add_time_to_breakdown(times, $WAITING_FOR_SEARCH_ENGINE, waiting_for_search_engine_time);
                                categorized = add(categorized, waiting_for_search_engine_time);
                            }
                            if (NIL != asserting_search_result_supports_time) {
                                gg_add_time_to_breakdown(times, $ASSERTING_SEARCH_RESULT_SUPPORTS, asserting_search_result_supports_time);
                                categorized = add(categorized, asserting_search_result_supports_time);
                            }
                            {
                                SubLObject cdolist_list_var = search_results_metrics;
                                SubLObject search_result_metrics = NIL;
                                for (search_result_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_result_metrics = cdolist_list_var.first()) {
                                    categorized = add(categorized, gg_time_breakdown_for_search_result_metrics(search_result_metrics, times));
                                }
                            }
                            {
                                SubLObject uncategorized = subtract(search_string_total_ms, categorized);
                                gg_add_time_to_breakdown(times, $MISC_SEARCH_STRING_PROCESSING, uncategorized);
                            }
                            return search_string_total_ms;
                        } else {
                            cdestructuring_bind_error(datum, $list_alt225);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject gg_time_breakdown_for_search_result_metrics(SubLObject search_result_metrics, SubLObject times) {
        SubLTrampolineFile.checkType(search_result_metrics, GG_SEARCH_RESULT_METRICS_P);
        {
            SubLObject total_ms = search_result_metrics.first();
            SubLObject all_filler_string_metrics = second(search_result_metrics);
            SubLObject categorized = ZERO_INTEGER;
            if ($DUPLICATE != all_filler_string_metrics) {
                {
                    SubLObject cdolist_list_var = all_filler_string_metrics;
                    SubLObject filler_string_metrics = NIL;
                    for (filler_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filler_string_metrics = cdolist_list_var.first()) {
                        {
                            SubLObject filler_string_total_ms = filler_string_metrics.first();
                            SubLObject filler_string_parsing_ms = nth(THREE_INTEGER, filler_string_metrics);
                            SubLObject filler_string_categorized = ZERO_INTEGER;
                            if (NIL != filler_string_parsing_ms) {
                                gg_add_time_to_breakdown(times, $FILLER_STRING_PARSING, filler_string_parsing_ms);
                                filler_string_categorized = add(filler_string_categorized, filler_string_parsing_ms);
                            }
                            {
                                SubLObject cdolist_list_var_170 = second(filler_string_metrics);
                                SubLObject complete_gaf_metrics = NIL;
                                for (complete_gaf_metrics = cdolist_list_var_170.first(); NIL != cdolist_list_var_170; cdolist_list_var_170 = cdolist_list_var_170.rest() , complete_gaf_metrics = cdolist_list_var_170.first()) {
                                    filler_string_categorized = add(filler_string_categorized, gg_time_breakdown_for_complete_gaf_metrics(complete_gaf_metrics, times));
                                }
                            }
                            {
                                SubLObject filler_string_uncategorized = subtract(filler_string_total_ms, filler_string_categorized);
                                gg_add_time_to_breakdown(times, $FILLER_STRING_PROCESSING, filler_string_uncategorized);
                                categorized = add(categorized, filler_string_uncategorized);
                            }
                            categorized = add(categorized, filler_string_categorized);
                        }
                    }
                }
            }
            {
                SubLObject uncategorized = subtract(total_ms, categorized);
                gg_add_time_to_breakdown(times, $MISC_SEARCH_RESULT_PROCESSING, uncategorized);
            }
            return total_ms;
        }
    }

    public static final SubLObject gg_time_breakdown_for_complete_gaf_metrics(SubLObject complete_gaf_metrics, SubLObject times) {
        SubLTrampolineFile.checkType(complete_gaf_metrics, GG_ONE_COMPLETE_GAF_METRICS_P);
        {
            SubLObject total_ms = complete_gaf_metrics.first();
            SubLObject categorized = ZERO_INTEGER;
            if (NIL != list_utilities.lengthG(complete_gaf_metrics, FIVE_INTEGER, UNPROVIDED)) {
                {
                    SubLObject time = nth(FIVE_INTEGER, complete_gaf_metrics);
                    gg_add_time_to_breakdown(times, $CHECKING_IF_KNOWN, time);
                    categorized = add(categorized, time);
                }
            }
            if (NIL != list_utilities.lengthG(complete_gaf_metrics, SIX_INTEGER, UNPROVIDED)) {
                {
                    SubLObject time = nth(SIX_INTEGER, complete_gaf_metrics);
                    gg_add_time_to_breakdown(times, $CHECKING_IF_REJECTED, time);
                    categorized = add(categorized, time);
                }
            }
            if (NIL != list_utilities.lengthG(complete_gaf_metrics, SEVEN_INTEGER, UNPROVIDED)) {
                {
                    SubLObject time = nth(SEVEN_INTEGER, complete_gaf_metrics);
                    gg_add_time_to_breakdown(times, $TRYING_TO_REFUTE, time);
                    categorized = add(categorized, time);
                }
            }
            if (NIL != list_utilities.lengthG(complete_gaf_metrics, EIGHT_INTEGER, UNPROVIDED)) {
                {
                    SubLObject time = nth(EIGHT_INTEGER, complete_gaf_metrics);
                    gg_add_time_to_breakdown(times, $WAITING_FOR_SEARCH_ENGINE, time);
                    categorized = add(categorized, time);
                }
            }
            {
                SubLObject uncategorized = subtract(total_ms, categorized);
                gg_add_time_to_breakdown(times, $MISC_COMPLETE_GAF_PROCESSING, uncategorized);
            }
            return total_ms;
        }
    }

    public static final SubLObject gg_add_time_to_breakdown(SubLObject times, SubLObject type, SubLObject time) {
        dictionary_utilities.dictionary_increment(times, type, time);
        return times;
    }

    /**
     * Updates RESULTS-DICTIONARY, whose format is
     * :TOTAL -> TOTAL-COUNT
     * <STATUS> -> <STATUS-RESULTS>, whose format is
     * :TOTAL -> TOTAL-COUNT-FOR-STATUS
     * <PRED> -> COUNT-FOR-STATUS+PRED
     */
    public static final SubLObject categorize_partial_gaf_results(SubLObject gg_metrics, SubLObject results_dictionary) {
        if (results_dictionary == UNPROVIDED) {
            results_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        SubLTrampolineFile.checkType(gg_metrics, GG_METRICS_P);
        {
            SubLObject cdolist_list_var = second(gg_metrics);
            SubLObject search_string_metrics = NIL;
            for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_171 = second(search_string_metrics);
                    SubLObject search_result_metrics = NIL;
                    for (search_result_metrics = cdolist_list_var_171.first(); NIL != cdolist_list_var_171; cdolist_list_var_171 = cdolist_list_var_171.rest() , search_result_metrics = cdolist_list_var_171.first()) {
                        {
                            SubLObject filler_string_metrics = second(search_result_metrics);
                            if (filler_string_metrics != $DUPLICATE) {
                                {
                                    SubLObject cdolist_list_var_172 = filler_string_metrics;
                                    SubLObject one_filler_string_metrics = NIL;
                                    for (one_filler_string_metrics = cdolist_list_var_172.first(); NIL != cdolist_list_var_172; cdolist_list_var_172 = cdolist_list_var_172.rest() , one_filler_string_metrics = cdolist_list_var_172.first()) {
                                        {
                                            SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                            SubLObject cdolist_list_var_173 = complete_gaf_metrics;
                                            SubLObject one_complete_gaf_metrics = NIL;
                                            for (one_complete_gaf_metrics = cdolist_list_var_173.first(); NIL != cdolist_list_var_173; cdolist_list_var_173 = cdolist_list_var_173.rest() , one_complete_gaf_metrics = cdolist_list_var_173.first()) {
                                                dictionary_utilities.dictionary_increment(results_dictionary, $TOTAL, UNPROVIDED);
                                                {
                                                    SubLObject status = second(one_complete_gaf_metrics);
                                                    SubLObject predicate = gg_one_complete_gaf_metrics_predicate(one_complete_gaf_metrics);
                                                    if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                        status = $VERIFIED;
                                                    }
                                                    {
                                                        SubLObject status_results_dictionary = dictionary.dictionary_lookup_without_values(results_dictionary, status, UNPROVIDED);
                                                        if (NIL == dictionary.dictionary_p(status_results_dictionary)) {
                                                            status_results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                                            dictionary.dictionary_enter(results_dictionary, status, status_results_dictionary);
                                                        }
                                                        dictionary_utilities.dictionary_increment(status_results_dictionary, $TOTAL, UNPROVIDED);
                                                        dictionary_utilities.dictionary_increment(status_results_dictionary, predicate, UNPROVIDED);
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
        }
        return results_dictionary;
    }

    public static final SubLObject gg_verification_counts_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject counts = NIL;
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_174 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_175 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_175, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_176 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject gg_metrics = load_one_gg_metrics_set(stream_176, eof);
                                                                                    if (gg_metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(gg_metrics)) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = second(gg_metrics);
                                                                                                SubLObject search_string_metrics = NIL;
                                                                                                for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_177 = second(search_string_metrics);
                                                                                                        SubLObject search_result_metrics = NIL;
                                                                                                        for (search_result_metrics = cdolist_list_var_177.first(); NIL != cdolist_list_var_177; cdolist_list_var_177 = cdolist_list_var_177.rest() , search_result_metrics = cdolist_list_var_177.first()) {
                                                                                                            {
                                                                                                                SubLObject filler_string_metrics = second(search_result_metrics);
                                                                                                                if (filler_string_metrics != $DUPLICATE) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_178 = filler_string_metrics;
                                                                                                                        SubLObject one_filler_string_metrics = NIL;
                                                                                                                        for (one_filler_string_metrics = cdolist_list_var_178.first(); NIL != cdolist_list_var_178; cdolist_list_var_178 = cdolist_list_var_178.rest() , one_filler_string_metrics = cdolist_list_var_178.first()) {
                                                                                                                            {
                                                                                                                                SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                                                                                                SubLObject cdolist_list_var_179 = complete_gaf_metrics;
                                                                                                                                SubLObject one_complete_gaf_metrics = NIL;
                                                                                                                                for (one_complete_gaf_metrics = cdolist_list_var_179.first(); NIL != cdolist_list_var_179; cdolist_list_var_179 = cdolist_list_var_179.rest() , one_complete_gaf_metrics = cdolist_list_var_179.first()) {
                                                                                                                                    {
                                                                                                                                        SubLObject status = second(one_complete_gaf_metrics);
                                                                                                                                        if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                                                                                                            {
                                                                                                                                                SubLObject count = second(status);
                                                                                                                                                counts = cons(count, counts);
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
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_180, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_174, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return counts;
            }
        }
    }

    public static final SubLObject partial_gaf_results_verification_counts(SubLObject gg_metrics) {
        SubLTrampolineFile.checkType(gg_metrics, GG_METRICS_P);
        {
            SubLObject counts = NIL;
            SubLObject cdolist_list_var = second(gg_metrics);
            SubLObject search_string_metrics = NIL;
            for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_181 = second(search_string_metrics);
                    SubLObject search_result_metrics = NIL;
                    for (search_result_metrics = cdolist_list_var_181.first(); NIL != cdolist_list_var_181; cdolist_list_var_181 = cdolist_list_var_181.rest() , search_result_metrics = cdolist_list_var_181.first()) {
                        {
                            SubLObject filler_string_metrics = second(search_result_metrics);
                            if (filler_string_metrics != $DUPLICATE) {
                                {
                                    SubLObject cdolist_list_var_182 = filler_string_metrics;
                                    SubLObject one_filler_string_metrics = NIL;
                                    for (one_filler_string_metrics = cdolist_list_var_182.first(); NIL != cdolist_list_var_182; cdolist_list_var_182 = cdolist_list_var_182.rest() , one_filler_string_metrics = cdolist_list_var_182.first()) {
                                        {
                                            SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                            SubLObject cdolist_list_var_183 = complete_gaf_metrics;
                                            SubLObject one_complete_gaf_metrics = NIL;
                                            for (one_complete_gaf_metrics = cdolist_list_var_183.first(); NIL != cdolist_list_var_183; cdolist_list_var_183 = cdolist_list_var_183.rest() , one_complete_gaf_metrics = cdolist_list_var_183.first()) {
                                                {
                                                    SubLObject status = second(one_complete_gaf_metrics);
                                                    if (NIL != gg_complete_gaf_verified_status_p(status)) {
                                                        {
                                                            SubLObject count = second(status);
                                                            counts = cons(count, counts);
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
            }
            return counts;
        }
    }

    public static final SubLObject gg_verified_strings_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strings = NIL;
                SubLTrampolineFile.checkType(gaf_gathering_metrics_directory_path_for_kb(kb), DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory(gaf_gathering_metrics_directory_path_for_kb(kb), T);
                    SubLObject progress_message_var = NIL;
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_184 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject directory = NIL;
                                            for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != Filesys.directory_p(directory)) {
                                                    if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                        directory = cconcatenate(directory, $str_alt110$_);
                                                    }
                                                    {
                                                        SubLObject file = cconcatenate(directory, $str_alt112$verification_metrics_cfasl);
                                                        if (NIL != file_utilities.file_existsP(file)) {
                                                            {
                                                                SubLObject eof = $EOF;
                                                                SubLObject stopP = NIL;
                                                                SubLObject stream = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_185 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                        try {
                                                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                            stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                        } finally {
                                                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_185, thread);
                                                                        }
                                                                    }
                                                                    if (!stream.isStream()) {
                                                                        Errors.error($str_alt29$Unable_to_open__S, file);
                                                                    }
                                                                    {
                                                                        SubLObject stream_186 = stream;
                                                                        while (NIL == stopP) {
                                                                            {
                                                                                SubLObject verification_metrics = load_one_gg_metrics_set(stream_186, eof);
                                                                                if (verification_metrics == eof) {
                                                                                    stopP = T;
                                                                                } else {
                                                                                    if (NIL != gg_gaf_verification_metrics_p(verification_metrics)) {
                                                                                        if (NIL != gg_complete_gaf_verified_status_p(second(verification_metrics))) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = nth(THREE_INTEGER, verification_metrics);
                                                                                                SubLObject search_string_verification_metrics = NIL;
                                                                                                for (search_string_verification_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_verification_metrics = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject hit_count = third(search_string_verification_metrics);
                                                                                                        SubLObject search_string = second(search_string_verification_metrics);
                                                                                                        if (hit_count.isPositive() && (NIL == subl_promotions.memberP(search_string, strings, symbol_function(EQUALP), symbol_function(FIRST)))) {
                                                                                                            strings = cons(list(search_string, hit_count), strings);
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
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_187 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (stream.isStream()) {
                                                                                close(stream, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_187, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_184, thread);
                                    }
                                }
                            }
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return strings;
            }
        }
    }

    /**
     *
     *
     * @return DICTIONARY-P mapping PREDICATE -> GAF -> (SEARCH-STRING HIT-COUNT)+
     */
    public static final SubLObject gg_web_verified_gafs_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_verification_metrics = NIL;
                SubLObject results = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_188 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        all_verification_metrics = load_gg_verification_metrics_for_directory(directory);
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_189 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_189, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_190 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject metrics = load_one_gg_metrics_set(stream_190, eof);
                                                                                    if (metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(metrics)) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = second(metrics);
                                                                                                SubLObject search_string_metrics = NIL;
                                                                                                for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_191 = second(search_string_metrics);
                                                                                                        SubLObject search_result_metrics = NIL;
                                                                                                        for (search_result_metrics = cdolist_list_var_191.first(); NIL != cdolist_list_var_191; cdolist_list_var_191 = cdolist_list_var_191.rest() , search_result_metrics = cdolist_list_var_191.first()) {
                                                                                                            {
                                                                                                                SubLObject filler_string_metrics = second(search_result_metrics);
                                                                                                                if (filler_string_metrics != $DUPLICATE) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_192 = filler_string_metrics;
                                                                                                                        SubLObject one_filler_string_metrics = NIL;
                                                                                                                        for (one_filler_string_metrics = cdolist_list_var_192.first(); NIL != cdolist_list_var_192; cdolist_list_var_192 = cdolist_list_var_192.rest() , one_filler_string_metrics = cdolist_list_var_192.first()) {
                                                                                                                            {
                                                                                                                                SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                                                                                                SubLObject cdolist_list_var_193 = complete_gaf_metrics;
                                                                                                                                SubLObject complete_gaf_metrics_194 = NIL;
                                                                                                                                for (complete_gaf_metrics_194 = cdolist_list_var_193.first(); NIL != cdolist_list_var_193; cdolist_list_var_193 = cdolist_list_var_193.rest() , complete_gaf_metrics_194 = cdolist_list_var_193.first()) {
                                                                                                                                    if ((NIL != gg_complete_gaf_verified_status_p(second(complete_gaf_metrics_194))) && (NIL != list_utilities.lengthGE(complete_gaf_metrics_194, FIVE_INTEGER, UNPROVIDED))) {
                                                                                                                                        {
                                                                                                                                            SubLObject validation_id = nth(TWO_INTEGER, complete_gaf_metrics_194);
                                                                                                                                            SubLObject predicate = gg_one_complete_gaf_metrics_predicate(complete_gaf_metrics_194);
                                                                                                                                            SubLObject gaf = nth(FOUR_INTEGER, complete_gaf_metrics_194);
                                                                                                                                            SubLObject predicate_dictionary = dictionary.dictionary_lookup_without_values(results, predicate, NIL);
                                                                                                                                            SubLObject verification_metrics = find(validation_id, all_verification_metrics, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                                                                                                                                            if (NIL == dictionary.dictionary_p(predicate_dictionary)) {
                                                                                                                                                predicate_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                                                                                                                                dictionary.dictionary_enter(results, predicate, predicate_dictionary);
                                                                                                                                            }
                                                                                                                                            if (NIL != verification_metrics) {
                                                                                                                                                {
                                                                                                                                                    SubLObject cdolist_list_var_195 = nth(THREE_INTEGER, verification_metrics);
                                                                                                                                                    SubLObject search_string_verification_metrics = NIL;
                                                                                                                                                    for (search_string_verification_metrics = cdolist_list_var_195.first(); NIL != cdolist_list_var_195; cdolist_list_var_195 = cdolist_list_var_195.rest() , search_string_verification_metrics = cdolist_list_var_195.first()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject hit_count = third(search_string_verification_metrics);
                                                                                                                                                            SubLObject search_string = second(search_string_verification_metrics);
                                                                                                                                                            if (hit_count.isPositive()) {
                                                                                                                                                                dictionary_utilities.dictionary_pushnew(predicate_dictionary, gaf, list(search_string, hit_count), symbol_function(EQUAL), UNPROVIDED);
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
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_196 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_196, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_188, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return results;
            }
        }
    }

    public static final SubLObject gg_known_gafs_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        return gg_gafs_with_status_for_kb($KNOWN, kb, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gg_unverified_gafs_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        return gg_gafs_with_status_for_kb($UNVERIFIED, kb, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gg_refuted_gafs_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        return gg_gafs_with_status_for_kb($REFUTED, kb, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gg_gafs_with_status_for_kb(SubLObject status, SubLObject kb, SubLObject predicate, SubLObject argument) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        if (predicate == UNPROVIDED) {
            predicate = $ANY;
        }
        if (argument == UNPROVIDED) {
            argument = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = NIL;
                SubLObject parent = gaf_gathering_metrics_directory_path_for_kb(kb);
                if (NIL != Filesys.directory_p(parent)) {
                    SubLTrampolineFile.checkType(parent, DIRECTORY_P);
                    {
                        SubLObject directory_contents_var = Filesys.directory(parent, T);
                        SubLObject progress_message_var = NIL;
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                {
                                    SubLObject list_var = directory_contents_var;
                                    utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_197 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject directory = NIL;
                                                for (directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , directory = csome_list_var.first()) {
                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != Filesys.directory_p(directory)) {
                                                        if (!string_utilities.last_char(directory).eql(CHAR_slash)) {
                                                            directory = cconcatenate(directory, $str_alt110$_);
                                                        }
                                                        {
                                                            SubLObject file = cconcatenate(directory, $str_alt111$metrics_cfasl);
                                                            if (NIL != file_utilities.file_existsP(file)) {
                                                                {
                                                                    SubLObject eof = $EOF;
                                                                    SubLObject stopP = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_198 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                            try {
                                                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                                stream = compatibility.open_binary(file, $INPUT, NIL);
                                                                            } finally {
                                                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_198, thread);
                                                                            }
                                                                        }
                                                                        if (!stream.isStream()) {
                                                                            Errors.error($str_alt29$Unable_to_open__S, file);
                                                                        }
                                                                        {
                                                                            SubLObject stream_199 = stream;
                                                                            while (NIL == stopP) {
                                                                                {
                                                                                    SubLObject metrics = load_one_gg_metrics_set(stream_199, eof);
                                                                                    if (metrics == eof) {
                                                                                        stopP = T;
                                                                                    } else {
                                                                                        if (NIL != gg_metrics_p(metrics)) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = second(metrics);
                                                                                                SubLObject search_string_metrics = NIL;
                                                                                                for (search_string_metrics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_string_metrics = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_200 = second(search_string_metrics);
                                                                                                        SubLObject search_result_metrics = NIL;
                                                                                                        for (search_result_metrics = cdolist_list_var_200.first(); NIL != cdolist_list_var_200; cdolist_list_var_200 = cdolist_list_var_200.rest() , search_result_metrics = cdolist_list_var_200.first()) {
                                                                                                            {
                                                                                                                SubLObject filler_string_metrics = second(search_result_metrics);
                                                                                                                if (filler_string_metrics != $DUPLICATE) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_201 = filler_string_metrics;
                                                                                                                        SubLObject one_filler_string_metrics = NIL;
                                                                                                                        for (one_filler_string_metrics = cdolist_list_var_201.first(); NIL != cdolist_list_var_201; cdolist_list_var_201 = cdolist_list_var_201.rest() , one_filler_string_metrics = cdolist_list_var_201.first()) {
                                                                                                                            {
                                                                                                                                SubLObject complete_gaf_metrics = second(one_filler_string_metrics);
                                                                                                                                SubLObject cdolist_list_var_202 = complete_gaf_metrics;
                                                                                                                                SubLObject complete_gaf_metrics_203 = NIL;
                                                                                                                                for (complete_gaf_metrics_203 = cdolist_list_var_202.first(); NIL != cdolist_list_var_202; cdolist_list_var_202 = cdolist_list_var_202.rest() , complete_gaf_metrics_203 = cdolist_list_var_202.first()) {
                                                                                                                                    if ((status == second(complete_gaf_metrics_203)) && (NIL != list_utilities.lengthGE(complete_gaf_metrics_203, FIVE_INTEGER, UNPROVIDED))) {
                                                                                                                                        {
                                                                                                                                            SubLObject gaf = nth(FOUR_INTEGER, complete_gaf_metrics_203);
                                                                                                                                            if (((predicate == $ANY) || predicate.equal(cycl_utilities.formula_arg0(gaf))) && ((argument == $ANY) || (NIL != member(argument, cycl_utilities.formula_args(gaf, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED)))) {
                                                                                                                                                {
                                                                                                                                                    SubLObject item_var = gaf;
                                                                                                                                                    if (NIL == member(item_var, gafs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                                                                        gafs = cons(item_var, gafs);
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
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_204 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (stream.isStream()) {
                                                                                    close(stream, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_204, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_197, thread);
                                        }
                                    }
                                }
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return gafs;
            }
        }
    }

    public static final SubLObject declare_gaf_gathering_metrics_file() {
        declareMacro("with_new_gg_metrics_output_streams", "WITH-NEW-GG-METRICS-OUTPUT-STREAMS");
        declareFunction("maybe_record_gg_metrics", "MAYBE-RECORD-GG-METRICS", 1, 0, false);
        declareFunction("record_gg_metrics", "RECORD-GG-METRICS", 1, 0, false);
        declareFunction("maybe_record_gg_verification_metrics", "MAYBE-RECORD-GG-VERIFICATION-METRICS", 1, 0, false);
        declareFunction("record_gg_verification_metrics", "RECORD-GG-VERIFICATION-METRICS", 1, 0, false);
        declareMacro("do_gg_metrics_file", "DO-GG-METRICS-FILE");
        declareFunction("load_gg_metrics_internal", "LOAD-GG-METRICS-INTERNAL", 1, 0, false);
        declareFunction("load_one_gg_metrics_set", "LOAD-ONE-GG-METRICS-SET", 2, 0, false);
        declareFunction("gg_additional_search_string_metrics_p", "GG-ADDITIONAL-SEARCH-STRING-METRICS-P", 1, 0, false);
        declareFunction("gg_additional_filler_string_metrics_p", "GG-ADDITIONAL-FILLER-STRING-METRICS-P", 1, 0, false);
        declareMacro("with_additional_matching_method", "WITH-ADDITIONAL-MATCHING-METHOD");
        declareFunction("gg_metrics_p", "GG-METRICS-P", 1, 0, false);
        declareFunction("gg_metrics_predicate", "GG-METRICS-PREDICATE", 1, 0, false);
        declareFunction("gg_metrics_partial_gaf", "GG-METRICS-PARTIAL-GAF", 1, 0, false);
        declareFunction("gg_additional_metrics_p", "GG-ADDITIONAL-METRICS-P", 1, 0, false);
        declareFunction("start_of_list_matches_patternsP", "START-OF-LIST-MATCHES-PATTERNS?", 2, 0, false);
        declareFunction("gg_metrics_total_milliseconds", "GG-METRICS-TOTAL-MILLISECONDS", 1, 0, false);
        declareFunction("gg_search_string_metrics_p", "GG-SEARCH-STRING-METRICS-P", 1, 0, false);
        declareFunction("gg_one_search_string_metrics_p", "GG-ONE-SEARCH-STRING-METRICS-P", 1, 0, false);
        declareFunction("gg_search_results_metrics_p", "GG-SEARCH-RESULTS-METRICS-P", 1, 0, false);
        declareFunction("gg_search_result_metrics_p", "GG-SEARCH-RESULT-METRICS-P", 1, 0, false);
        declareFunction("gg_filler_string_metrics_p", "GG-FILLER-STRING-METRICS-P", 1, 0, false);
        declareFunction("gg_one_filler_string_metrics_p", "GG-ONE-FILLER-STRING-METRICS-P", 1, 0, false);
        declareFunction("gg_complete_gaf_metrics_p", "GG-COMPLETE-GAF-METRICS-P", 1, 0, false);
        declareFunction("gg_one_complete_gaf_metrics_p", "GG-ONE-COMPLETE-GAF-METRICS-P", 1, 0, false);
        declareFunction("gg_one_complete_gaf_metrics_gaf", "GG-ONE-COMPLETE-GAF-METRICS-GAF", 1, 0, false);
        declareFunction("gg_one_complete_gaf_metrics_predicate", "GG-ONE-COMPLETE-GAF-METRICS-PREDICATE", 1, 0, false);
        declareFunction("gg_additional_complete_gaf_metrics_p", "GG-ADDITIONAL-COMPLETE-GAF-METRICS-P", 1, 0, false);
        declareFunction("gg_complete_gaf_status_p", "GG-COMPLETE-GAF-STATUS-P", 1, 0, false);
        declareFunction("gg_complete_gaf_verified_status_p", "GG-COMPLETE-GAF-VERIFIED-STATUS-P", 1, 0, false);
        declareFunction("gg_gaf_verification_metrics_p", "GG-GAF-VERIFICATION-METRICS-P", 1, 0, false);
        declareFunction("gg_additional_gaf_verification_metrics_p", "GG-ADDITIONAL-GAF-VERIFICATION-METRICS-P", 1, 0, false);
        declareFunction("gg_search_strings_verification_metrics_p", "GG-SEARCH-STRINGS-VERIFICATION-METRICS-P", 1, 0, false);
        declareFunction("gg_search_string_verification_metrics_p", "GG-SEARCH-STRING-VERIFICATION-METRICS-P", 1, 0, false);
        declareFunction("gg_gaf_verification_metrics_id", "GG-GAF-VERIFICATION-METRICS-ID", 1, 0, false);
        declareFunction("gg_gaf_verification_metrics_status", "GG-GAF-VERIFICATION-METRICS-STATUS", 1, 0, false);
        declareFunction("create_new_unique_gaf_gathering_metrics_directory", "CREATE-NEW-UNIQUE-GAF-GATHERING-METRICS-DIRECTORY", 0, 0, false);
        declareFunction("gaf_gathering_metrics_directory_path_for_kb", "GAF-GATHERING-METRICS-DIRECTORY-PATH-FOR-KB", 0, 1, false);
        declareFunction("uniquify_gaf_gathering_metrics_directory_name", "UNIQUIFY-GAF-GATHERING-METRICS-DIRECTORY-NAME", 2, 0, false);
        declareFunction("gaf_gathering_metrics_directory_local_name", "GAF-GATHERING-METRICS-DIRECTORY-LOCAL-NAME", 0, 2, false);
        declareMacro("do_gg_metrics_for_kb", "DO-GG-METRICS-FOR-KB");
        declareMacro("do_gg_metrics_for_directory", "DO-GG-METRICS-FOR-DIRECTORY");
        declareMacro("do_gg_verification_metrics_for_kb", "DO-GG-VERIFICATION-METRICS-FOR-KB");
        declareMacro("do_gg_verification_metrics_for_directory", "DO-GG-VERIFICATION-METRICS-FOR-DIRECTORY");
        declareMacro("do_gg_metrics_search_string_results", "DO-GG-METRICS-SEARCH-STRING-RESULTS");
        declareMacro("do_gg_metrics_filler_string_results", "DO-GG-METRICS-FILLER-STRING-RESULTS");
        declareMacro("do_gg_metrics_filler_string_results_for_search_string", "DO-GG-METRICS-FILLER-STRING-RESULTS-FOR-SEARCH-STRING");
        declareMacro("do_gg_metrics_complete_gaf_results", "DO-GG-METRICS-COMPLETE-GAF-RESULTS");
        declareFunction("load_gg_metrics_for_kb", "LOAD-GG-METRICS-FOR-KB", 0, 1, false);
        declareFunction("load_gg_verification_metrics_for_kb", "LOAD-GG-VERIFICATION-METRICS-FOR-KB", 0, 1, false);
        declareFunction("load_gg_verification_metrics_for_directory", "LOAD-GG-VERIFICATION-METRICS-FOR-DIRECTORY", 1, 0, false);
        declareFunction("load_gg_metrics", "LOAD-GG-METRICS", 1, 0, false);
        declareFunction("load_gg_verification_metrics", "LOAD-GG-VERIFICATION-METRICS", 1, 0, false);
        declareFunction("categorize_gg_results_for_kb", "CATEGORIZE-GG-RESULTS-FOR-KB", 0, 1, false);
        declareFunction("gg_gather_totals_for_kb", "GG-GATHER-TOTALS-FOR-KB", 0, 1, false);
        declareFunction("gg_show_totals", "GG-SHOW-TOTALS", 1, 0, false);
        declareFunction("gg_show_hypothesis_statuses", "GG-SHOW-HYPOTHESIS-STATUSES", 1, 0, false);
        declareFunction("gg_hypothesis_statuses_for_kb", "GG-HYPOTHESIS-STATUSES-FOR-KB", 0, 1, false);
        declareFunction("gg_search_string_hit_counts_for_kb", "GG-SEARCH-STRING-HIT-COUNTS-FOR-KB", 0, 1, false);
        declareFunction("gg_filler_string_details_for_kb", "GG-FILLER-STRING-DETAILS-FOR-KB", 0, 1, false);
        declareFunction("gg_note_search_string_metrics_details", "GG-NOTE-SEARCH-STRING-METRICS-DETAILS", 2, 0, false);
        declareFunction("write_html_gg_info_for_kb", "WRITE-HTML-GG-INFO-FOR-KB", 0, 1, false);
        declareFunction("gg_show_table_of_contents", "GG-SHOW-TABLE-OF-CONTENTS", 0, 0, false);
        declareFunction("gg_write_search_string_details", "GG-WRITE-SEARCH-STRING-DETAILS", 2, 0, false);
        declareFunction("gg_search_string_details_filename", "GG-SEARCH-STRING-DETAILS-FILENAME", 1, 0, false);
        declareFunction("gg_write_filler_string_details", "GG-WRITE-FILLER-STRING-DETAILS", 0, 3, false);
        declareFunction("gg_write_filler_string_details_for_pred", "GG-WRITE-FILLER-STRING-DETAILS-FOR-PRED", 3, 0, false);
        declareFunction("possibly_update_text_file", "POSSIBLY-UPDATE-TEXT-FILE", 2, 0, false);
        declareFunction("gg_write_filler_string_details_for_search_string", "GG-WRITE-FILLER-STRING-DETAILS-FOR-SEARCH-STRING", 2, 0, false);
        declareFunction("gg_filler_string_details_filename", "GG-FILLER-STRING-DETAILS-FILENAME", 1, 0, false);
        declareFunction("gg_show_search_string_hit_counts", "GG-SHOW-SEARCH-STRING-HIT-COUNTS", 1, 0, false);
        declareFunction("gg_show_verified_gafs", "GG-SHOW-VERIFIED-GAFS", 1, 0, false);
        declareFunction("longer_dictionary_p", "LONGER-DICTIONARY-P", 2, 0, false);
        declareFunction("gg_time_breakdown_for_kb", "GG-TIME-BREAKDOWN-FOR-KB", 0, 1, false);
        declareFunction("gg_time_breakdown_bar_graphs", "GG-TIME-BREAKDOWN-BAR-GRAPHS", 1, 0, false);
        declareFunction("gg_determine_unit", "GG-DETERMINE-UNIT", 1, 0, false);
        declareFunction("gg_ms_to_granularity", "GG-MS-TO-GRANULARITY", 2, 0, false);
        declareFunction("gg_unit_string", "GG-UNIT-STRING", 1, 0, false);
        declareFunction("gg_time_breakdown_bar_graph_label", "GG-TIME-BREAKDOWN-BAR-GRAPH-LABEL", 3, 0, false);
        declareFunction("gg_time_breakdown_bar_graph", "GG-TIME-BREAKDOWN-BAR-GRAPH", 2, 0, false);
        declareFunction("gg_time_breakdown_for_gg_metrics", "GG-TIME-BREAKDOWN-FOR-GG-METRICS", 1, 1, false);
        declareFunction("gg_time_breakdown_for_search_string_metrics", "GG-TIME-BREAKDOWN-FOR-SEARCH-STRING-METRICS", 1, 1, false);
        declareFunction("gg_time_breakdown_for_search_result_metrics", "GG-TIME-BREAKDOWN-FOR-SEARCH-RESULT-METRICS", 2, 0, false);
        declareFunction("gg_time_breakdown_for_complete_gaf_metrics", "GG-TIME-BREAKDOWN-FOR-COMPLETE-GAF-METRICS", 2, 0, false);
        declareFunction("gg_add_time_to_breakdown", "GG-ADD-TIME-TO-BREAKDOWN", 3, 0, false);
        declareFunction("categorize_partial_gaf_results", "CATEGORIZE-PARTIAL-GAF-RESULTS", 1, 1, false);
        declareFunction("gg_verification_counts_for_kb", "GG-VERIFICATION-COUNTS-FOR-KB", 0, 1, false);
        declareFunction("partial_gaf_results_verification_counts", "PARTIAL-GAF-RESULTS-VERIFICATION-COUNTS", 1, 0, false);
        declareFunction("gg_verified_strings_for_kb", "GG-VERIFIED-STRINGS-FOR-KB", 0, 1, false);
        declareFunction("gg_web_verified_gafs_for_kb", "GG-WEB-VERIFIED-GAFS-FOR-KB", 0, 1, false);
        declareFunction("gg_known_gafs_for_kb", "GG-KNOWN-GAFS-FOR-KB", 0, 1, false);
        declareFunction("gg_unverified_gafs_for_kb", "GG-UNVERIFIED-GAFS-FOR-KB", 0, 1, false);
        declareFunction("gg_refuted_gafs_for_kb", "GG-REFUTED-GAFS-FOR-KB", 0, 1, false);
        declareFunction("gg_gafs_with_status_for_kb", "GG-GAFS-WITH-STATUS-FOR-KB", 1, 3, false);
        return NIL;
    }

    public static final SubLObject init_gaf_gathering_metrics_file() {
        defparameter("*GG-METRICS-CFASL-STREAM*", NIL);
        defparameter("*GG-VERIFICATION-METRICS-CFASL-STREAM*", NIL);
        deflexical("*GG-METRICS-PATTERN*", $list_alt30);
        deflexical("*GG-ADDITIONAL-METRICS-PATTERNS*", $list_alt31);
        deflexical("*GG-SEARCH-STRING-METRICS-PATTERN*", $list_alt32);
        deflexical("*GG-SEARCH-STRING-ADDITIONAL-METRICS-PATTERNS*", $list_alt33);
        deflexical("*GG-SEARCH-RESULT-METRICS-PATTERN*", $list_alt34);
        deflexical("*GG-FILLER-STRING-METRICS-PATTERN*", $list_alt35);
        deflexical("*GG-ADDITIONAL-FILLER-STRING-METRICS-PATTERNS*", $list_alt36);
        deflexical("*GG-COMPLETE-GAF-METRICS-PATTERN*", $list_alt37);
        deflexical("*GG-ADDITIONAL-COMPLETE-GAFS-PATTERNS*", $list_alt38);
        deflexical("*GG-COMPLETE-GAF-STATUS-KEYWORDS*", $list_alt58);
        deflexical("*GG-ADDITIONAL-GAF-VERIFICATION-METRICS-PATTERNS*", $list_alt62);
        deflexical("*GAF-GATHERING-METRICS-DIRECTORY-UNIQUIFIER-LOCK*", make_lock($str_alt65$gaf_gathering_metrics_directory_u));
        defparameter("*GG-METRICS-PATH*", $str_alt69$_cyc_projects_transfer_learning_g);
        deflexical("*GG-HTML-COLOR1*", html_macros.$html_color_cyc_logo_light_blue$.getDynamicValue());
        deflexical("*GG-HTML-COLOR2*", html_macros.$html_color_cyc_logo_lighter_blue$.getDynamicValue());
        return NIL;
    }

    public static final SubLObject setup_gaf_gathering_metrics_file() {
                access_macros.register_macro_helper(CREATE_NEW_UNIQUE_GAF_GATHERING_METRICS_DIRECTORY, WITH_NEW_GG_METRICS_OUTPUT_STREAMS);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$FILENAME = makeUninternedSymbol("FILENAME");

    static private final SubLSymbol $sym1$V_METRICS_FILENAME = makeUninternedSymbol("V-METRICS-FILENAME");

    static private final SubLSymbol $sym2$DIRECTORY = makeUninternedSymbol("DIRECTORY");



    static private final SubLList $list_alt4 = list(list(makeSymbol("CREATE-NEW-UNIQUE-GAF-GATHERING-METRICS-DIRECTORY")));



    static private final SubLList $list_alt6 = list(makeString("metrics.cfasl"));

    static private final SubLList $list_alt7 = list(makeString("verification-metrics.cfasl"));



    public static final SubLSymbol $gg_metrics_cfasl_stream$ = makeSymbol("*GG-METRICS-CFASL-STREAM*");

    static private final SubLList $list_alt10 = list(makeKeyword("OUTPUT"));

    public static final SubLSymbol $gg_verification_metrics_cfasl_stream$ = makeSymbol("*GG-VERIFICATION-METRICS-CFASL-STREAM*");



    private static final SubLSymbol GG_GAF_VERIFICATION_METRICS_P = makeSymbol("GG-GAF-VERIFICATION-METRICS-P");

    static private final SubLList $list_alt14 = list(list(makeSymbol("GG-METRICS"), makeSymbol("FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym15$STREAM = makeUninternedSymbol("STREAM");

    static private final SubLSymbol $sym16$EOF = makeUninternedSymbol("EOF");

    static private final SubLSymbol $sym17$STOP_ = makeUninternedSymbol("STOP?");

    static private final SubLList $list_alt18 = list(makeKeyword("EOF"));

    static private final SubLList $list_alt19 = list(NIL);

    static private final SubLList $list_alt20 = list(makeKeyword("INPUT"));



    private static final SubLSymbol LOAD_ONE_GG_METRICS_SET = makeSymbol("LOAD-ONE-GG-METRICS-SET");





    static private final SubLList $list_alt25 = list(T);







    static private final SubLString $str_alt29$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt30 = listS(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-SEARCH-STRING-METRICS-P")), list($TEST, makeSymbol("INTEGERP")), makeKeyword("ADDITIONAL"));

    static private final SubLList $list_alt31 = list(list($TEST, makeSymbol("EL-FORMULA-P")));

    static private final SubLList $list_alt32 = listS(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-SEARCH-RESULTS-METRICS-P")), list($TEST, makeSymbol("KEYWORDP")), list($TEST, makeSymbol("STRINGP")), makeKeyword("ADDITIONAL"));

    static private final SubLList $list_alt33 = list(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("INTEGERP")));

    static private final SubLList $list_alt34 = list(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-FILLER-STRING-METRICS-P")), list($TEST, makeSymbol("STRINGP")), list($TEST, makeSymbol("INTEGERP")));

    static private final SubLList $list_alt35 = listS(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-COMPLETE-GAF-METRICS-P")), list($TEST, makeSymbol("STRINGP")), makeKeyword("ADDITIONAL"));

    static private final SubLList $list_alt36 = list(list($TEST, makeSymbol("INTEGERP")));

    static private final SubLList $list_alt37 = listS(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-COMPLETE-GAF-STATUS-P")), list($TEST, makeSymbol("INTEGERP")), makeKeyword("ADDITIONAL"));

    static private final SubLList $list_alt38 = list(list($TEST, makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list($TEST, makeSymbol("EL-FORMULA-P")), list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("INTEGERP")));

    static private final SubLList $list_alt39 = list(makeSymbol("METHOD"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $pattern_matches_tree_atomic_methods$ = makeSymbol("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*");





    private static final SubLSymbol $ADDITIONAL = makeKeyword("ADDITIONAL");

    static private final SubLList $list_alt44 = list(makeSymbol("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*"));

    private static final SubLSymbol GG_ADDITIONAL_METRICS_P = makeSymbol("GG-ADDITIONAL-METRICS-P");

    private static final SubLSymbol $UNKNOWN_PREDICATE = makeKeyword("UNKNOWN-PREDICATE");

    private static final SubLSymbol $UNKNOWN_PARTIAL_GAF = makeKeyword("UNKNOWN-PARTIAL-GAF");

    private static final SubLSymbol GG_METRICS_P = makeSymbol("GG-METRICS-P");

    private static final SubLSymbol GG_ONE_SEARCH_STRING_METRICS_P = makeSymbol("GG-ONE-SEARCH-STRING-METRICS-P");

    private static final SubLSymbol GG_ADDITIONAL_SEARCH_STRING_METRICS_P = makeSymbol("GG-ADDITIONAL-SEARCH-STRING-METRICS-P");

    private static final SubLSymbol GG_SEARCH_RESULT_METRICS_P = makeSymbol("GG-SEARCH-RESULT-METRICS-P");

    private static final SubLSymbol $DUPLICATE = makeKeyword("DUPLICATE");

    private static final SubLSymbol GG_ONE_FILLER_STRING_METRICS_P = makeSymbol("GG-ONE-FILLER-STRING-METRICS-P");

    private static final SubLSymbol GG_ADDITIONAL_FILLER_STRING_METRICS_P = makeSymbol("GG-ADDITIONAL-FILLER-STRING-METRICS-P");

    private static final SubLSymbol GG_ONE_COMPLETE_GAF_METRICS_P = makeSymbol("GG-ONE-COMPLETE-GAF-METRICS-P");

    private static final SubLSymbol GG_ADDITIONAL_COMPLETE_GAF_METRICS_P = makeSymbol("GG-ADDITIONAL-COMPLETE-GAF-METRICS-P");

    private static final SubLSymbol $GAF_NOT_FOUND = makeKeyword("GAF-NOT-FOUND");

    static private final SubLList $list_alt58 = list(makeKeyword("KNOWN"), makeKeyword("REJECTED"), makeKeyword("REFUTED"), makeKeyword("UNVERIFIED"));

    static private final SubLList $list_alt59 = list(makeKeyword("VERIFIED"), list($TEST, makeSymbol("POSITIVE-INTEGER-P")));

    static private final SubLList $list_alt60 = list(makeKeyword("ADDITIONAL"), makeSymbol("GG-ADDITIONAL-GAF-VERIFICATION-METRICS-P"));

    static private final SubLList $list_alt61 = listS(list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-COMPLETE-GAF-STATUS-P")), list($TEST, makeSymbol("INTEGERP")), list($TEST, makeSymbol("GG-SEARCH-STRINGS-VERIFICATION-METRICS-P")), makeKeyword("ADDITIONAL"));

    static private final SubLList $list_alt62 = list(list($TEST, makeSymbol("POSSIBLY-HLMT-P")));

    private static final SubLSymbol GG_SEARCH_STRING_VERIFICATION_METRICS_P = makeSymbol("GG-SEARCH-STRING-VERIFICATION-METRICS-P");

    static private final SubLList $list_alt64 = list(list($TEST, makeSymbol("NON-NEGATIVE-INTEGER-P")), list($TEST, makeSymbol("STRINGP")), list($TEST, makeSymbol("NON-NEGATIVE-INTEGER-P")));

    static private final SubLString $str_alt65$gaf_gathering_metrics_directory_u = makeString("gaf-gathering-metrics-directory-uniquifier-lock");

    private static final SubLSymbol CREATE_NEW_UNIQUE_GAF_GATHERING_METRICS_DIRECTORY = makeSymbol("CREATE-NEW-UNIQUE-GAF-GATHERING-METRICS-DIRECTORY");

    private static final SubLSymbol WITH_NEW_GG_METRICS_OUTPUT_STREAMS = makeSymbol("WITH-NEW-GG-METRICS-OUTPUT-STREAMS");

    static private final SubLString $$$0775 = makeString("0775");

    static private final SubLString $str_alt69$_cyc_projects_transfer_learning_g = makeString("/cyc/projects/transfer-learning/gaf-gathering/metrics/");

    static private final SubLString $str_alt70$_A_A__5__0D_ = makeString("~A~A/~5,'0D/");

    static private final SubLString $str_alt71$_A_5__0D_ = makeString("~A~5,'0D/");

    static private final SubLString $str_alt72$_A__3__0D_ = makeString("~A-~3,'0D/");

    static private final SubLList $list_alt73 = list(list(makeSymbol("METRICS"), makeSymbol("&OPTIONAL"), list(makeSymbol("KB"), list(makeSymbol("KB-LOADED")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym74$PARENT = makeUninternedSymbol("PARENT");

    static private final SubLSymbol $sym75$DIRECTORY = makeUninternedSymbol("DIRECTORY");

    private static final SubLSymbol GAF_GATHERING_METRICS_DIRECTORY_PATH_FOR_KB = makeSymbol("GAF-GATHERING-METRICS-DIRECTORY-PATH-FOR-KB");





    private static final SubLSymbol DO_DIRECTORY_SUBDIRECTORIES = makeSymbol("DO-DIRECTORY-SUBDIRECTORIES");

    private static final SubLSymbol DO_GG_METRICS_FOR_DIRECTORY = makeSymbol("DO-GG-METRICS-FOR-DIRECTORY");

    static private final SubLList $list_alt81 = list(list(makeSymbol("METRICS"), makeSymbol("DIRECTORY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym82$FILE = makeUninternedSymbol("FILE");

    static private final SubLSymbol $sym83$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    private static final SubLSymbol DO_GG_METRICS_FILE = makeSymbol("DO-GG-METRICS-FILE");

    static private final SubLList $list_alt85 = list(list(makeSymbol("VERIFICATION-METRICS"), makeSymbol("&OPTIONAL"), list(makeSymbol("KB"), list(makeSymbol("KB-LOADED")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym86$DIRECTORY = makeUninternedSymbol("DIRECTORY");

    private static final SubLSymbol DO_GG_VERIFICATION_METRICS_FOR_DIRECTORY = makeSymbol("DO-GG-VERIFICATION-METRICS-FOR-DIRECTORY");

    static private final SubLList $list_alt88 = list(list(makeSymbol("VERIFICATION-METRICS"), makeSymbol("DIRECTORY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym89$FILE = makeUninternedSymbol("FILE");

    static private final SubLList $list_alt90 = list(list(makeSymbol("SEARCH-STRING-METRICS"), makeSymbol("GG-METRICS")), makeSymbol("&BODY"), makeSymbol("BODY"));







    static private final SubLList $list_alt94 = list(makeSymbol("GG-ONE-SEARCH-STRING-METRICS-P"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("ONE-FILLER-STRING-METRICS"), makeSymbol("GG-METRICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym96$SEARCH_STRING_METRICS = makeUninternedSymbol("SEARCH-STRING-METRICS");

    private static final SubLSymbol DO_GG_METRICS_SEARCH_STRING_RESULTS = makeSymbol("DO-GG-METRICS-SEARCH-STRING-RESULTS");

    private static final SubLSymbol DO_GG_METRICS_FILLER_STRING_RESULTS_FOR_SEARCH_STRING = makeSymbol("DO-GG-METRICS-FILLER-STRING-RESULTS-FOR-SEARCH-STRING");

    static private final SubLList $list_alt99 = list(list(makeSymbol("ONE-FILLER-STRING-METRICS"), makeSymbol("SEARCH-STRING-METRICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym100$SEARCH_RESULT_METRICS = makeUninternedSymbol("SEARCH-RESULT-METRICS");

    static private final SubLSymbol $sym101$FILLER_STRING_METRICS = makeUninternedSymbol("FILLER-STRING-METRICS");

    static private final SubLList $list_alt102 = list(makeSymbol("GG-SEARCH-RESULT-METRICS-P"));

    static private final SubLList $list_alt103 = list(makeSymbol("GG-FILLER-STRING-METRICS-P"));



    static private final SubLList $list_alt105 = list(makeKeyword("DUPLICATE"));

    static private final SubLList $list_alt106 = list(list(makeSymbol("ONE-COMPLETE-GAF-METRICS"), makeSymbol("GG-METRICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym107$ONE_FILLER_STRING_METRICS = makeUninternedSymbol("ONE-FILLER-STRING-METRICS");

    static private final SubLSymbol $sym108$COMPLETE_GAF_METRICS = makeUninternedSymbol("COMPLETE-GAF-METRICS");

    private static final SubLSymbol DO_GG_METRICS_FILLER_STRING_RESULTS = makeSymbol("DO-GG-METRICS-FILLER-STRING-RESULTS");

    static private final SubLString $str_alt110$_ = makeString("/");

    static private final SubLString $str_alt111$metrics_cfasl = makeString("metrics.cfasl");

    static private final SubLString $str_alt112$verification_metrics_cfasl = makeString("verification-metrics.cfasl");



    static private final SubLString $str_alt114$For_KB__S__we_formed__S_hypothese = makeString("For KB ~S, we formed ~S hypotheses for ~S partial GAFS");

    static private final SubLString $str_alt115$_ = makeString(".");

    static private final SubLString $str_alt116$__categorized_thus___ = makeString(", categorized thus:~%");

    static private final SubLString $str_alt117$____S__total__S___ = makeString("~& ~S (total ~S)~%");

    static private final SubLList $list_alt118 = cons(makeSymbol("PRED"), makeSymbol("PRED-COUNT"));

    static private final SubLString $str_alt119$_____S___S__ = makeString("~&  ~S: ~S~%");

    private static final SubLSymbol $TOTAL_KAG_COUNT = makeKeyword("TOTAL-KAG-COUNT");





    private static final SubLSymbol $SEARCH_ENGINE_QUERY_COUNT = makeKeyword("SEARCH-ENGINE-QUERY-COUNT");

    private static final SubLSymbol $TOTAL_HYPOTHESIS_COUNT = makeKeyword("TOTAL-HYPOTHESIS-COUNT");



    static private final SubLString $$$Totals = makeString("Totals");

    static private final SubLString $$$right = makeString("right");

    static private final SubLString $str_alt128$Total_time__ = makeString("Total time: ");



    static private final SubLString $str_alt130$Total_knowlege_acquisition_goals_ = makeString("Total knowlege acquisition goals: ");

    static private final SubLString $str_alt131$Total_search_engine_queries__ = makeString("Total search engine queries: ");

    static private final SubLString $str_alt132$Total_hypotheses_formed__ = makeString("Total hypotheses formed: ");

    static private final SubLString $str_alt133$Results_for_Knowledge_Acquisition = makeString("Results for Knowledge Acquisition Goals, by Predicate");

    static private final SubLString $$$Predicate = makeString("Predicate");

    static private final SubLString $$$Total_KAG_Count = makeString("Total KAG Count");

    static private final SubLString $$$Total_Filler_Strings = makeString("Total Filler Strings");

    static private final SubLString $$$Total_Hypotheses = makeString("Total Hypotheses");

    static private final SubLString $$$Retrieval_Rate = makeString("Retrieval Rate");

    static private final SubLSymbol $sym139$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");

    static private final SubLList $list_alt140 = cons(makeSymbol("PRED"), makeSymbol("PRED-RESULTS"));

    private static final SubLSymbol $TOTAL_HYPOTHESES = makeKeyword("TOTAL-HYPOTHESES");

    private static final SubLSymbol $FILLER_STRINGS = makeKeyword("FILLER-STRINGS");

    private static final SubLSymbol $TOTAL_GOALS = makeKeyword("TOTAL-GOALS");

    static private final SubLString $$$center = makeString("center");

    static private final SubLString $str_alt145$__1F_ = makeString("~,1F%");

    static private final SubLString $$$Cumulative = makeString("Cumulative");

    static private final SubLString $str_alt147$____ = makeString(" => ");



    static private final SubLString $str_alt149$GAF_Gathering_Results_for_KB_ = makeString("GAF-Gathering Results for KB ");

    static private final SubLString $str_alt150$metrics_html = makeString("metrics.html");

    static private final SubLString $$$OpenSearchStringHitCounts = makeString("OpenSearchStringHitCounts");

    static private final SubLString $$$KnowledgeAcquisitionGoalResults = makeString("KnowledgeAcquisitionGoalResults");

    static private final SubLString $$$TimeBreakdown = makeString("TimeBreakdown");

    static private final SubLString $$$VerifiedHypotheses = makeString("VerifiedHypotheses");

    static private final SubLString $str_alt155$Contents_ = makeString("Contents:");

    static private final SubLString $str_alt156$_Totals = makeString("#Totals");

    static private final SubLString $str_alt157$_OpenSearchStringHitCounts = makeString("#OpenSearchStringHitCounts");

    static private final SubLString $$$Predicate_Breakdown = makeString("Predicate Breakdown");

    static private final SubLString $$$Open_Search_String_Hit_Counts = makeString("Open Search String Hit Counts");

    static private final SubLString $str_alt160$_KnowledgeAcquisitionGoalResults = makeString("#KnowledgeAcquisitionGoalResults");

    static private final SubLString $str_alt161$Knowledge_Acquisition_Goal_Result = makeString("Knowledge Acquisition Goal Results");

    static private final SubLString $str_alt162$_TimeBreakdown = makeString("#TimeBreakdown");

    static private final SubLString $$$Time_Breakdown = makeString("Time Breakdown");

    static private final SubLString $str_alt164$_VerifiedHypotheses = makeString("#VerifiedHypotheses");

    static private final SubLString $$$Verified_Hypotheses = makeString("Verified Hypotheses");

    static private final SubLString $str_alt166$search_string_details_ = makeString("search-string-details/");

    static private final SubLString $str_alt167$Search_Strings_for_ = makeString("Search Strings for ");

    static private final SubLString $str_alt168$Unsuccessful_Search_Strings___D_ = makeString("Unsuccessful Search Strings (~D)");

    static private final SubLString $str_alt169$Successful_Search_Strings___D_ = makeString("Successful Search Strings (~D)");

    static private final SubLString $str_alt170$_html = makeString(".html");

    static private final SubLString $str_alt171$filler_string_details_ = makeString("filler-string-details/");

    static private final SubLString $str_alt172$Filler_Strings_for_ = makeString("Filler Strings for ");



    static private final SubLString $str_alt174$100_ = makeString("100%");

    static private final SubLString $str_alt175$Unsuccessful_Filler_Strings___D_ = makeString("Unsuccessful Filler Strings (~D)");

    static private final SubLString $$$white = makeString("white");

    static private final SubLString $str_alt177$_S_Filler_Strings___D_ = makeString("~S Filler Strings (~D)");

    static private final SubLList $list_alt178 = cons(makeSymbol("STRING"), makeSymbol("CYCLS"));

    static private final SubLString $str_alt179$Hit_Counts_for_Open_Search_String = makeString("Hit Counts for Open Search Strings, by Predicate");

    public static final SubLInteger $int$21 = makeInteger(21);

    static private final SubLString $$$Total_Search_Strings = makeString("Total Search Strings");

    static private final SubLString $$$Positive_Hit_Count_Strings = makeString("Positive Hit Count Strings");

    static private final SubLString $str_alt183$Positive_Hit_Count__ = makeString("Positive Hit Count %");

    static private final SubLList $list_alt184 = cons(makeSymbol("PRED"), makeSymbol("HIT-COUNTS"));

    private static final SubLSymbol $TOTAL_SEARCH_STRINGS = makeKeyword("TOTAL-SEARCH-STRINGS");

    private static final SubLSymbol $SUCCESSFUL_SEARCH_STRINGS = makeKeyword("SUCCESSFUL-SEARCH-STRINGS");

    static private final SubLString $str_alt187$__ = makeString("--");

    private static final SubLSymbol LONGER_DICTIONARY_P = makeSymbol("LONGER-DICTIONARY-P");

    static private final SubLString $$$Contents = makeString("Contents");

    static private final SubLList $list_alt190 = cons(makeSymbol("PREDICATE"), makeSymbol("PREDICATE-DICTIONARY"));

    static private final SubLString $str_alt191$_ = makeString("#");

    static private final SubLString $$$VerifiedGAFs = makeString("VerifiedGAFs");

    static private final SubLString $str_alt193$_S___D_hypotheses_ = makeString("~S (~D hypotheses)");

    static private final SubLString $str_alt194$Verified_Hypotheses_for__S = makeString("Verified Hypotheses for ~S");

    static private final SubLString $$$Verified_Hypothesis = makeString("Verified Hypothesis");

    static private final SubLString $str_alt196$Search_String_Used_for_Verificati = makeString("Search String Used for Verification");

    static private final SubLString $$$Hit_Count = makeString("Hit Count");

    static private final SubLList $list_alt198 = cons(makeSymbol("GAF"), makeSymbol("GAF-DATA"));

    static private final SubLSymbol $sym199$_ = makeSymbol(">");

    static private final SubLList $list_alt200 = list(makeSymbol("SEARCH-STRING"), makeSymbol("HIT-COUNT"));

    static private final SubLList $list_alt201 = list(makeKeyword("WAITING-FOR-SEARCH-ENGINE"));

    static private final SubLSymbol $sym202$_ = makeSymbol("+");

    static private final SubLString $str_alt203$No_GAF_gathering_metrics_collecte = makeString("No GAF-gathering metrics collected.");





    static private final SubLString $str_alt206$Remote_Time_vs__Local_Time__in_ = makeString("Remote Time vs. Local Time (in ");

    static private final SubLString $str_alt207$__br_Remote_tasks_include_ = makeString(")<br>Remote tasks include ");





    static private final SubLString $str_alt210$Breakdown_of_Local_Time__in_ = makeString("Breakdown of Local Time (in ");

    static private final SubLString $str_alt211$_ = makeString(")");

    static private final SubLList $list_alt212 = list(makeSymbol("TASK-TYPE"), makeSymbol("MS"));

    static private final SubLString $str_alt213$Breakdown_of__Other___in_ms_ = makeString("Breakdown of \"Other\" (in ms)");

    public static final SubLInteger $int$10000 = makeInteger(10000);



    private static final SubLSymbol $SECONDS = makeKeyword("SECONDS");

    private static final SubLSymbol $MINUTES = makeKeyword("MINUTES");

    static private final SubLString $$$ms = makeString("ms");

    static private final SubLString $$$seconds = makeString("seconds");

    static private final SubLString $$$minutes = makeString("minutes");

    static private final SubLString $str_alt221$_A____1F__ = makeString("~A (~,1F%)");

    static private final SubLList $list_alt222 = list(makeSymbol("TOTAL-MILLISECONDS"), makeSymbol("SEARCH-STRINGS-METRICS"), makeSymbol("SEARCH-STRING-GENERATION-MILLISECONDS"));

    private static final SubLSymbol $SEARCH_STRING_GENERATION = makeKeyword("SEARCH-STRING-GENERATION");



    static private final SubLList $list_alt225 = list(makeSymbol("SEARCH-STRING-TOTAL-MS"), makeSymbol("SEARCH-RESULTS-METRICS"), makeSymbol("VALIDITY"), makeSymbol("SEARCH-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("SEARCH-STRING-MASSAGING-TIME"), makeSymbol("WAITING-FOR-SEARCH-ENGINE-TIME"), makeSymbol("ASSERTING-SEARCH-RESULT-SUPPORTS-TIME"));

    private static final SubLSymbol $SEARCH_STRING_MASSAGING = makeKeyword("SEARCH-STRING-MASSAGING");

    private static final SubLSymbol $WAITING_FOR_SEARCH_ENGINE = makeKeyword("WAITING-FOR-SEARCH-ENGINE");

    private static final SubLSymbol $ASSERTING_SEARCH_RESULT_SUPPORTS = makeKeyword("ASSERTING-SEARCH-RESULT-SUPPORTS");

    private static final SubLSymbol $MISC_SEARCH_STRING_PROCESSING = makeKeyword("MISC-SEARCH-STRING-PROCESSING");

    private static final SubLSymbol $FILLER_STRING_PARSING = makeKeyword("FILLER-STRING-PARSING");

    private static final SubLSymbol $FILLER_STRING_PROCESSING = makeKeyword("FILLER-STRING-PROCESSING");

    private static final SubLSymbol $MISC_SEARCH_RESULT_PROCESSING = makeKeyword("MISC-SEARCH-RESULT-PROCESSING");

    private static final SubLSymbol $CHECKING_IF_KNOWN = makeKeyword("CHECKING-IF-KNOWN");

    private static final SubLSymbol $CHECKING_IF_REJECTED = makeKeyword("CHECKING-IF-REJECTED");

    private static final SubLSymbol $TRYING_TO_REFUTE = makeKeyword("TRYING-TO-REFUTE");

    private static final SubLSymbol $MISC_COMPLETE_GAF_PROCESSING = makeKeyword("MISC-COMPLETE-GAF-PROCESSING");





    private static final SubLSymbol $UNVERIFIED = makeKeyword("UNVERIFIED");

    private static final SubLSymbol $REFUTED = makeKeyword("REFUTED");



    // // Initializers
    public void declareFunctions() {
        declare_gaf_gathering_metrics_file();
    }

    public void initializeVariables() {
        init_gaf_gathering_metrics_file();
    }

    public void runTopLevelForms() {
        setup_gaf_gathering_metrics_file();
    }
}

