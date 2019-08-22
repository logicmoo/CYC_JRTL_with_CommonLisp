package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class batch_ke extends SubLTranslatedFile {
    public static final SubLFile me = new batch_ke();

    public static final String myName = "com.cyc.cycjava.cycl.batch_ke";

    public static final String myFingerPrint = "e3c54f72709dab935a69074b21f1fdb11ece8e0e15423074327848c50c16cf8b";

    // defparameter
    private static final SubLSymbol $batch_ke_stream$ = makeSymbol("*BATCH-KE-STREAM*");

    // defparameter
    private static final SubLSymbol $batch_ke_current_output_method$ = makeSymbol("*BATCH-KE-CURRENT-OUTPUT-METHOD*");

    // defparameter
    private static final SubLSymbol $batch_ke_output_methods$ = makeSymbol("*BATCH-KE-OUTPUT-METHODS*");

    // defparameter
    private static final SubLSymbol $batch_ke_current_mapping_method$ = makeSymbol("*BATCH-KE-CURRENT-MAPPING-METHOD*");

    // defparameter
    private static final SubLSymbol $batch_ke_mapping_methods$ = makeSymbol("*BATCH-KE-MAPPING-METHODS*");

    // defparameter
    private static final SubLSymbol $archive_constant_table$ = makeSymbol("*ARCHIVE-CONSTANT-TABLE*");

    // defparameter
    private static final SubLSymbol $archive_constant_stream$ = makeSymbol("*ARCHIVE-CONSTANT-STREAM*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeKeyword("UNASSERT-ASSERT"), makeSymbol("BATCH-KE-OUTPUT-KE-ASSERT-UNASSERT")), list(makeKeyword("ASSERT"), makeSymbol("BATCH-KE-OUTPUT-KE-ASSERT")), list(makeKeyword("UNASSERT"), makeSymbol("BATCH-KE-OUTPUT-KE-UNASSERT")), list(makeKeyword("COMMENTED"), makeSymbol("BATCH-KE-OUTPUT-COMMENTED")));

    public static final SubLString $str1$_S_was_not_a_valid_batch_ke_outpu = makeString("~S was not a valid batch-ke output-method");

    public static final SubLString $str2$_a_is_not_a_known_batch_ke_output = makeString("~a is not a known batch ke output method");

    public static final SubLString $$$CODE_Assertion = makeString("CODE Assertion");

    public static final SubLString $$$REMOTE_Assertion = makeString("REMOTE Assertion");

    public static final SubLString $str5$________A = makeString("~%~%;; ~A");

    public static final SubLString $str6$_____Formula____S = makeString("~%;; Formula:  ~S");

    public static final SubLString $str7$_____Mt_________S = makeString("~%;; Mt:       ~S");

    public static final SubLString $str8$_____Strength___S = makeString("~%;; Strength: ~S");

    public static final SubLString $str9$_____Dir________S = makeString("~%;; Dir:      ~S");

    public static final SubLList $list10 = list(list(makeKeyword("LOCAL"), makeSymbol("BATCH-KE-LOCAL")), list(makeKeyword("LOCAL-AND-COMMENTED-REMOTE"), makeSymbol("BATCH-KE-LOCAL-COMMENT-REMOTE")));

    public static final SubLString $str11$_S_was_not_a_valid_batch_ke_inclu = makeString("~S was not a valid batch-ke inclusion-level");







    public static final SubLString $str15$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    public static final SubLString $str20$________Mode__LISP__Package__CYC_ = makeString(";;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");

    public static final SubLString $str21$____ = makeString("~%;;");

    public static final SubLString $str22$_____Created_on__A = makeString("~%;; Created on ~A");

    public static final SubLString $str23$_____CycL__A__KB__S = makeString("~%;; CycL ~A  KB ~S");

    public static final SubLString $str24$____ = makeString("~%~%");

    public static final SubLString $str25$___ke_assert__ = makeString("~%(ke-assert '");

    public static final SubLString $str26$____s__s__s_ = makeString("~% ~s ~s ~s)");

    public static final SubLString $str27$_____ke_unassert___s__s_ = makeString("~%~%(ke-unassert '~s ~s)");





    private static final SubLSymbol $FILE_NOT_FOUND = makeKeyword("FILE-NOT-FOUND");

    public static final SubLString $str31$__File__A_was_not_found__or_is_in = makeString("~%File ~A was not found, or is inaccessible");



    public static final SubLString $str33$__File_completely_processed = makeString("~%File completely processed");

    public static final SubLString $str34$___S_initial_operations_skipped = makeString("~%~S initial operations skipped");

    public static final SubLString $str35$___S_operations_successfully_proc = makeString("~%~S operations successfully processed");

    public static final SubLString $str36$__File_incompletely_processed_ = makeString("~%File incompletely processed:");

    public static final SubLString $str37$__Error_after_file_position__S_ = makeString("~%Error after file position ~S:");

    public static final SubLString $str38$_____A = makeString("~%~%~A");

    public static final SubLString $str39$____After_fixing_the_file__use_a_ = makeString("~%~%After fixing the file, use a skip value of ~S to continue.");



    private static final SubLSymbol $ABORT_KE_LOAD = makeKeyword("ABORT-KE-LOAD");

    public static final SubLString $$$Loading_KE_forms = makeString("Loading KE forms");





    public static final SubLString $str45$Eval_error_in_form__S_starting_at = makeString("Eval error in form ~S starting at position ~S");

    public static final SubLString $str46$Read_error_in_form_after__S_start = makeString("Read error in form after ~S starting at position ~S");



    public static final SubLList $list48 = list(makeSymbol("ERROR"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLString $str50$Last_operation___S__ = makeString("Last operation: ~S~%");

    public static final SubLString $str51$FI_error___A = makeString("FI error: ~A");



    public static final SubLString $str53$___Archive_of__S = makeString(";; Archive of ~S");

    public static final SubLString $str54$_____fi_find_or_create__S__S_ = makeString("~%~%(fi-find-or-create ~S ~S)");

    public static final SubLSymbol ARCHIVE_CONSTANT_INTERNAL = makeSymbol("ARCHIVE-CONSTANT-INTERNAL");

    public static final SubLList $list56 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlMt")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlInverse")));

    public static final SubLString $str57$_____ke_assert__ = makeString("~%~%(ke-assert '");

    public static final SubLString $str58$_____S = makeString("~% '~S");

    public static final SubLString $str59$____S__S_ = makeString("~% ~S ~S)");

    public static SubLObject batch_ke_output_method(SubLObject output_method) {
        if (output_method == UNPROVIDED) {
            output_method = $batch_ke_current_output_method$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = second(assoc(output_method, $batch_ke_output_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        if (NIL == function) {
            Errors.error($str1$_S_was_not_a_valid_batch_ke_outpu, output_method);
        }
        return function;
    }

    public static SubLObject batch_ke_output_via_current_method(final SubLObject ass) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method = batch_ke_output_method($batch_ke_current_output_method$.getDynamicValue(thread));
        if (NIL != method) {
            return funcall(method, ass);
        }
        Errors.error($str2$_a_is_not_a_known_batch_ke_output, $batch_ke_current_output_method$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject batch_ke_output_ke_assert_unassert(final SubLObject ass) {
        final SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        final SubLObject strength = assertions_high.assertion_strength(ass);
        final SubLObject dir = assertions_high.assertion_direction(ass);
        batch_ke_format_unassert(formula, mt);
        batch_ke_format_assert(formula, mt, strength, dir);
        return NIL;
    }

    public static SubLObject batch_ke_output_ke_assert(final SubLObject ass) {
        final SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        final SubLObject strength = assertions_high.assertion_strength(ass);
        final SubLObject dir = assertions_high.assertion_direction(ass);
        batch_ke_format_assert(formula, mt, strength, dir);
        return NIL;
    }

    public static SubLObject batch_ke_output_ke_unassert(final SubLObject ass) {
        final SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        batch_ke_format_unassert(formula, mt);
        return NIL;
    }

    public static SubLObject batch_ke_output_commented(final SubLObject ass) {
        final SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        final SubLObject strength = assertions_high.assertion_strength(ass);
        final SubLObject dir = assertions_high.assertion_direction(ass);
        final SubLObject comment = (NIL != assertions_high.code_assertionP(ass)) ? $$$CODE_Assertion : $$$REMOTE_Assertion;
        batch_ke_format($str5$________A, comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        batch_ke_format($str6$_____Formula____S, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        batch_ke_format($str7$_____Mt_________S, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        batch_ke_format($str8$_____Strength___S, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        batch_ke_format($str9$_____Dir________S, dir, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject batch_ke_mapping_function(final SubLObject inclusion_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = second(assoc(inclusion_level, $batch_ke_mapping_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        if (NIL == function) {
            Errors.error($str11$_S_was_not_a_valid_batch_ke_inclu, inclusion_level);
        }
        return function;
    }

    public static SubLObject batch_ke_local(final SubLObject ass) {
        if (NIL != assertions_high.asserted_assertionP(ass)) {
            if (NIL != assertions_high.code_assertionP(ass)) {
                batch_ke_output_commented(ass);
            } else {
                batch_ke_output_via_current_method(ass);
            }
        }
        return NIL;
    }

    public static SubLObject batch_ke_local_comment_remote(final SubLObject ass) {
        if ((NIL != assertions_high.asserted_assertionP(ass)) && (NIL == assertions_high.code_assertionP(ass))) {
            batch_ke_output_via_current_method(ass);
        } else {
            batch_ke_output_commented(ass);
        }
        return NIL;
    }

    public static SubLObject batch_ke_term_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$1 = stream;
            batch_ke_header(stream_$1);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$1, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_term(mapping_func, v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_arg_index_file(final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$2 = stream;
            batch_ke_header(stream_$2);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$2, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(mapping_func, v_term, arg, pred, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_other_index_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$3 = stream;
            batch_ke_header(stream_$3);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$3, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_other_index(mapping_func, v_term, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_predicate_rule_index_file(final SubLObject pred, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$4 = stream;
            batch_ke_header(stream_$4);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$4, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_predicate_rule_index(mapping_func, pred, $POS, UNPROVIDED, UNPROVIDED);
                kb_mapping.map_predicate_rule_index(mapping_func, pred, $NEG, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_isa_rule_index_file(final SubLObject col, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$5 = stream;
            batch_ke_header(stream_$5);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$5, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_isa_rule_index(mapping_func, col, $POS, UNPROVIDED, UNPROVIDED);
                kb_mapping.map_isa_rule_index(mapping_func, col, $NEG, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_genls_rule_index_file(final SubLObject col, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$6 = stream;
            batch_ke_header(stream_$6);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$6, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_genls_rule_index(mapping_func, col, $POS, UNPROVIDED, UNPROVIDED);
                kb_mapping.map_genls_rule_index(mapping_func, col, $NEG, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_genl_mt_rule_index_file(final SubLObject genl_mt, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$7 = stream;
            batch_ke_header(stream_$7);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$7, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_genl_mt_rule_index(mapping_func, genl_mt, $POS, UNPROVIDED, UNPROVIDED);
                kb_mapping.map_genl_mt_rule_index(mapping_func, genl_mt, $NEG, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject batch_ke_mt_index_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method) {
        if (inclusion_level == UNPROVIDED) {
            inclusion_level = $LOCAL;
        }
        if (output_method == UNPROVIDED) {
            output_method = $UNASSERT_ASSERT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(outfile, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, outfile);
            }
            final SubLObject stream_$8 = stream;
            batch_ke_header(stream_$8);
            final SubLObject mapping_func = batch_ke_mapping_function(inclusion_level);
            final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $batch_ke_current_output_method$.bind(output_method, thread);
                $batch_ke_stream$.bind(stream_$8, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_mt_index(mapping_func, v_term, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                $batch_ke_stream$.rebind(_prev_bind_2, thread);
                $batch_ke_current_output_method$.rebind(_prev_bind_0, thread);
            }
            written = T;
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    public static SubLObject output_lisp_attribute_comment(final SubLObject stream) {
        format(stream, $str20$________Mode__LISP__Package__CYC_);
        return NIL;
    }

    public static SubLObject batch_ke_header(final SubLObject stream) {
        output_lisp_attribute_comment(stream);
        format(stream, $str21$____);
        format(stream, $str22$_____Created_on__A, numeric_date_utilities.timestring(UNPROVIDED));
        format(stream, $str23$_____CycL__A__KB__S, system_info.cyc_revision_string(), kb_loaded());
        format(stream, $str24$____);
        return NIL;
    }

    public static SubLObject batch_ke_format(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format($batch_ke_stream$.getDynamicValue(thread), format_string, new SubLObject[]{ arg1, arg2, arg3, arg4 });
    }

    public static SubLObject batch_ke_format_assert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject dir) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        batch_ke_format($str25$___ke_assert__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_cycl_expression.format_cycl_expression(formula, $batch_ke_stream$.getDynamicValue(thread), ONE_INTEGER);
        batch_ke_format($str26$____s__s__s_, mt, strength, dir, UNPROVIDED);
        return NIL;
    }

    public static SubLObject batch_ke_format_unassert(final SubLObject formula, final SubLObject mt) {
        batch_ke_format($str27$_____ke_unassert___s__s_, formula, mt, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject load_api(final SubLObject filename, SubLObject skip) {
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        assert NIL != integerp(skip) : "Types.integerp(skip) " + "CommonSymbols.NIL != Types.integerp(skip) " + skip;
        thread.resetMultipleValues();
        final SubLObject status = load_api_internal(filename, skip);
        final SubLObject count = thread.secondMultipleValue();
        final SubLObject position = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (status == $FILE_NOT_FOUND) {
            format(T, $str31$__File__A_was_not_found__or_is_in, filename);
            return NIL;
        }
        if (status == $SUCCESS) {
            format(T, $str33$__File_completely_processed);
            format(T, $str34$___S_initial_operations_skipped, skip);
            format(T, $str35$___S_operations_successfully_proc, subtract(count, skip));
            return T;
        }
        format(T, $str36$__File_incompletely_processed_);
        format(T, $str34$___S_initial_operations_skipped, skip);
        format(T, $str35$___S_operations_successfully_proc, subtract(count, skip));
        format(T, $str37$__Error_after_file_position__S_, position);
        format(T, $str38$_____A, status);
        format(T, $str39$____After_fixing_the_file__use_a_, count);
        return NIL;
    }

    public static SubLObject load_api_internal(final SubLObject filename, SubLObject skip) {
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject total_forms = ZERO_INTEGER;
            SubLObject last_form_position = ZERO_INTEGER;
            SubLObject abort_reason = $SUCCESS;
            SubLObject previous_ok_form = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str15$Unable_to_open__S, filename);
                }
                final SubLObject stream_$9 = stream;
                try {
                    thread.throwStack.push($ABORT_KE_LOAD);
                    final SubLObject file_length = file_length(stream_$9);
                    final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($$$Loading_KE_forms);
                            SubLObject form;
                            SubLObject error;
                            for (form = NIL, form = read_api_form(stream_$9); (form != $ERROR) && (form != $EOF); form = read_api_form(stream_$9)) {
                                if (skip.numG(ZERO_INTEGER)) {
                                    skip = subtract(skip, ONE_INTEGER);
                                } else {
                                    error = eval_api_form(form);
                                    if (NIL != error) {
                                        format(T, $str45$Eval_error_in_form__S_starting_at, form, last_form_position);
                                        sublisp_throw($ABORT_KE_LOAD, error);
                                    }
                                }
                                last_form_position = compatibility.get_file_position(stream_$9);
                                note_percent_progress(last_form_position, file_length);
                                total_forms = add(total_forms, ONE_INTEGER);
                                previous_ok_form = form;
                            }
                            if (form == $ERROR) {
                                sublisp_throw($ABORT_KE_LOAD, format(NIL, $str46$Read_error_in_form_after__S_start, previous_ok_form, last_form_position));
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    abort_reason = Errors.handleThrowable(ccatch_env_var, $ABORT_KE_LOAD);
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
            return values(abort_reason, total_forms, last_form_position);
        }
        return values($FILE_NOT_FOUND, ZERO_INTEGER, ZERO_INTEGER);
    }

    public static SubLObject read_api_form(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = read_ignoring_errors(stream, NIL, $EOF);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL != value ? value : error;
    }

    public static SubLObject eval_api_form(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$11 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind(T, thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        fi.reset_fi_error_state();
                        eval_in_api.cyc_api_eval(form);
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$11, thread);
                    }
                    if ((NIL == error_message) && (NIL != fi.fi_error_signaledP())) {
                        SubLObject current;
                        final SubLObject datum = current = fi.fi_get_error_int();
                        SubLObject error = NIL;
                        destructuring_bind_must_consp(current, datum, $list48);
                        error = current.first();
                        current = current.rest();
                        final SubLObject format_string = (current.isCons()) ? current.first() : NIL;
                        destructuring_bind_must_listp(current, datum, $list48);
                        final SubLObject args;
                        current = args = current.rest();
                        apply(symbol_function(ERROR), cconcatenate($str50$Last_operation___S__, NIL != format_string ? format_string : format(NIL, $str51$FI_error___A, error)), new SubLObject[]{ form, args });
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return error_message;
    }

    public static SubLObject archive_constant(final SubLObject constant, final SubLObject filename) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, filename);
            }
            final SubLObject stream_$12 = stream;
            archive_constant_to_stream(constant, stream_$12);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject archive_constant_to_stream(final SubLObject constant, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        batch_ke_header(stream);
        format(stream, $str53$___Archive_of__S, constant);
        format(stream, $str54$_____fi_find_or_create__S__S_, constants_high.constant_name(constant), constants_high.constant_external_id(constant));
        final SubLObject _prev_bind_0 = $archive_constant_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $archive_constant_stream$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            $archive_constant_table$.bind(make_hash_table(kb_indexing.num_index(constant), UNPROVIDED, UNPROVIDED), thread);
            $archive_constant_stream$.bind(stream, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = $list56;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kb_mapping.map_gaf_arg_index(symbol_function(ARCHIVE_CONSTANT_INTERNAL), constant, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            kb_mapping.map_gaf_arg_index(symbol_function(ARCHIVE_CONSTANT_INTERNAL), constant, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            kb_mapping.map_term(symbol_function(ARCHIVE_CONSTANT_INTERNAL), constant);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            $archive_constant_stream$.rebind(_prev_bind_2, thread);
            $archive_constant_table$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject archive_constant_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(assertion, $archive_constant_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(assertion, $archive_constant_table$.getDynamicValue(thread), T);
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                final SubLObject stream = $archive_constant_stream$.getDynamicValue(thread);
                final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                final SubLObject mt = forts.fort_el_formula(assertions_high.assertion_mt(assertion));
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                format(stream, $str57$_____ke_assert__);
                format_cycl_expression.format_cycl_expression(formula, stream, ONE_INTEGER);
                format(stream, $str58$_____S, mt);
                format(stream, $str59$____S__S_, strength, direction);
            }
        }
        return NIL;
    }

    public static SubLObject declare_batch_ke_file() {
        declareFunction(me, "batch_ke_output_method", "BATCH-KE-OUTPUT-METHOD", 0, 1, false);
        declareFunction(me, "batch_ke_output_via_current_method", "BATCH-KE-OUTPUT-VIA-CURRENT-METHOD", 1, 0, false);
        declareFunction(me, "batch_ke_output_ke_assert_unassert", "BATCH-KE-OUTPUT-KE-ASSERT-UNASSERT", 1, 0, false);
        declareFunction(me, "batch_ke_output_ke_assert", "BATCH-KE-OUTPUT-KE-ASSERT", 1, 0, false);
        declareFunction(me, "batch_ke_output_ke_unassert", "BATCH-KE-OUTPUT-KE-UNASSERT", 1, 0, false);
        declareFunction(me, "batch_ke_output_commented", "BATCH-KE-OUTPUT-COMMENTED", 1, 0, false);
        declareFunction(me, "batch_ke_mapping_function", "BATCH-KE-MAPPING-FUNCTION", 1, 0, false);
        declareFunction(me, "batch_ke_local", "BATCH-KE-LOCAL", 1, 0, false);
        declareFunction(me, "batch_ke_local_comment_remote", "BATCH-KE-LOCAL-COMMENT-REMOTE", 1, 0, false);
        declareFunction(me, "batch_ke_term_file", "BATCH-KE-TERM-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_arg_index_file", "BATCH-KE-ARG-INDEX-FILE", 4, 2, false);
        declareFunction(me, "batch_ke_other_index_file", "BATCH-KE-OTHER-INDEX-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_predicate_rule_index_file", "BATCH-KE-PREDICATE-RULE-INDEX-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_isa_rule_index_file", "BATCH-KE-ISA-RULE-INDEX-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_genls_rule_index_file", "BATCH-KE-GENLS-RULE-INDEX-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_genl_mt_rule_index_file", "BATCH-KE-GENL-MT-RULE-INDEX-FILE", 2, 2, false);
        declareFunction(me, "batch_ke_mt_index_file", "BATCH-KE-MT-INDEX-FILE", 2, 2, false);
        declareFunction(me, "output_lisp_attribute_comment", "OUTPUT-LISP-ATTRIBUTE-COMMENT", 1, 0, false);
        declareFunction(me, "batch_ke_header", "BATCH-KE-HEADER", 1, 0, false);
        declareFunction(me, "batch_ke_format", "BATCH-KE-FORMAT", 1, 4, false);
        declareFunction(me, "batch_ke_format_assert", "BATCH-KE-FORMAT-ASSERT", 4, 0, false);
        declareFunction(me, "batch_ke_format_unassert", "BATCH-KE-FORMAT-UNASSERT", 2, 0, false);
        declareFunction(me, "load_api", "LOAD-API", 1, 1, false);
        declareFunction(me, "load_api_internal", "LOAD-API-INTERNAL", 1, 1, false);
        declareFunction(me, "read_api_form", "READ-API-FORM", 1, 0, false);
        declareFunction(me, "eval_api_form", "EVAL-API-FORM", 1, 0, false);
        declareFunction(me, "archive_constant", "ARCHIVE-CONSTANT", 2, 0, false);
        declareFunction(me, "archive_constant_to_stream", "ARCHIVE-CONSTANT-TO-STREAM", 1, 1, false);
        declareFunction(me, "archive_constant_internal", "ARCHIVE-CONSTANT-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_batch_ke_file() {
        defparameter("*BATCH-KE-STREAM*", T);
        defparameter("*BATCH-KE-CURRENT-OUTPUT-METHOD*", NIL);
        defparameter("*BATCH-KE-OUTPUT-METHODS*", $list0);
        defparameter("*BATCH-KE-CURRENT-MAPPING-METHOD*", NIL);
        defparameter("*BATCH-KE-MAPPING-METHODS*", $list10);
        defparameter("*ARCHIVE-CONSTANT-TABLE*", NIL);
        defparameter("*ARCHIVE-CONSTANT-STREAM*", NIL);
        return NIL;
    }

    public static SubLObject setup_batch_ke_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_batch_ke_file();
    }

    @Override
    public void initializeVariables() {
        init_batch_ke_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_batch_ke_file();
    }

    
}

/**
 * Total time: 336 ms
 */
