package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.$dtp_constant$;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.new_constant_suid_threshold;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hl_transcript_tracing extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new hl_transcript_tracing();

    public static final String myName = "com.cyc.cycjava_2.cycl.hl_transcript_tracing";


    // deflexical
    public static final SubLSymbol $hl_quotify_method_table$ = makeSymbol("*HL-QUOTIFY-METHOD-TABLE*");

    // defparameter
    private static final SubLSymbol $within_hl_evalP$ = makeSymbol("*WITHIN-HL-EVAL?*");

    // defvar
    public static final SubLSymbol $hlt_include_constant_external_idsP$ = makeSymbol("*HLT-INCLUDE-CONSTANT-EXTERNAL-IDS?*");





    // defvar
    public static final SubLSymbol $hlt_format_operationsP$ = makeSymbol("*HLT-FORMAT-OPERATIONS?*");

    // defparameter
    public static final SubLSymbol $hlt_constant_id_map$ = makeSymbol("*HLT-CONSTANT-ID-MAP*");

    // defparameter
    public static final SubLSymbol $hlt_constant_list$ = makeSymbol("*HLT-CONSTANT-LIST*");



    private static final SubLSymbol $HL_UNQUOTIFY_FAILURE = makeKeyword("HL-UNQUOTIFY-FAILURE");

    private static final SubLString $str2$HL_Lookup_failure_with____S = makeString("HL Lookup failure with:~%~S");



    private static final SubLString $str4$HL_Lookup_failure_with___S = makeString("HL Lookup failure with: ~S");

    private static final SubLSymbol HL_KB_OBJECT_P = makeSymbol("HL-KB-OBJECT-P");

    private static final SubLSymbol HL_QUOTIFY_CONS_METHOD = makeSymbol("HL-QUOTIFY-CONS-METHOD");



    private static final SubLSymbol HL_QUOTIFY = makeSymbol("HL-QUOTIFY");

    private static final SubLList $list9 = cons(makeSymbol("PRE-DOTTED"), makeSymbol("DOTTED"));

    private static final SubLSymbol $sym10$LIST_ = makeSymbol("LIST*");

    private static final SubLSymbol HL_QUOTIFY_CONSTANT_METHOD = makeSymbol("HL-QUOTIFY-CONSTANT-METHOD");

    private static final SubLSymbol HL_FIND_CONSTANT = makeSymbol("HL-FIND-CONSTANT");

    private static final SubLSymbol HL_QUOTIFY_NART_METHOD = makeSymbol("HL-QUOTIFY-NART-METHOD");

    private static final SubLSymbol HL_FIND_NART = makeSymbol("HL-FIND-NART");

    private static final SubLSymbol HL_QUOTIFY_VARIABLE_METHOD = makeSymbol("HL-QUOTIFY-VARIABLE-METHOD");



    private static final SubLSymbol HL_QUOTIFY_ASSERTION_METHOD = makeSymbol("HL-QUOTIFY-ASSERTION-METHOD");

    private static final SubLSymbol HL_FIND_GAF = makeSymbol("HL-FIND-GAF");

    private static final SubLSymbol HL_FIND_RULE = makeSymbol("HL-FIND-RULE");

    private static final SubLSymbol HL_QUOTIFY_DEDUCTION_METHOD = makeSymbol("HL-QUOTIFY-DEDUCTION-METHOD");

    private static final SubLSymbol HL_FIND_DEDUCTION = makeSymbol("HL-FIND-DEDUCTION");



    private static final SubLString $str23$Circular_KB_HL_Support_dependency = makeString("Circular KB HL Support dependency!");

    private static final SubLSymbol HL_QUOTIFY_KB_HL_SUPPORT_METHOD = makeSymbol("HL-QUOTIFY-KB-HL-SUPPORT-METHOD");

    private static final SubLSymbol HL_FIND_KB_HL_SUPPORT = makeSymbol("HL-FIND-KB-HL-SUPPORT");

    private static final SubLList $list26 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    private static final SubLSymbol HL_RESOLVE_RECURSIVE = makeSymbol("HL-RESOLVE-RECURSIVE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $hlt_trace_lock$ = makeSymbol("*HLT-TRACE-LOCK*");

    private static final SubLString $$$HLT_trace = makeString("HLT trace");

    private static final SubLList $list32 = list(list(makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym33$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");



    private static final SubLSymbol WITH_HL_TRANSCRIPT_TRACE_TO_STREAM = makeSymbol("WITH-HL-TRANSCRIPT-TRACE-TO-STREAM");



    public static final SubLSymbol $hlt_trace_streams$ = makeSymbol("*HLT-TRACE-STREAMS*");



    private static final SubLList $list39 = list(makeSymbol("*HLT-TRACE-STREAMS*"));





    private static final SubLList $list42 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym43$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol WITH_HL_TRANSCRIPT_TRACE_TO_FILE = makeSymbol("WITH-HL-TRANSCRIPT-TRACE-TO-FILE");

    private static final SubLSymbol $sym45$STREAM = makeUninternedSymbol("STREAM");



    private static final SubLSymbol WITH_STREAM_BUFFER_SIZE = makeSymbol("WITH-STREAM-BUFFER-SIZE");

    private static final SubLList $list48 = list(makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"));



    private static final SubLSymbol ENSURE_PRIVATE_STREAM = makeSymbol("ENSURE-PRIVATE-STREAM");



    private static final SubLList $list52 = list(makeKeyword("OUTPUT"));







    private static final SubLString $str56$Unable_to_open__S = makeString("Unable to open ~S");









    private static final SubLList $list61 = list(list(makeSymbol("HL-OP-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("STREAM"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list62 = list(makeKeyword("STREAM"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol $sym67$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol DO_HL_TRANSCRIPT_TRACE = makeSymbol("DO-HL-TRANSCRIPT-TRACE");

    private static final SubLSymbol $sym69$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    private static final SubLSymbol $sym70$IN_STREAM_VAR = makeUninternedSymbol("IN-STREAM-VAR");



    private static final SubLList $list72 = list(makeKeyword("INPUT"));

    private static final SubLSymbol ENABLE_FILE_STREAM_MEMORY_MAPPING = makeSymbol("ENABLE-FILE-STREAM-MEMORY-MAPPING");

    private static final SubLSymbol $sym74$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym75$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol FILE_LENGTH = makeSymbol("FILE-LENGTH");

    private static final SubLList $list77 = list(ZERO_INTEGER);



    private static final SubLList $list79 = list(makeSymbol("STRINGP"));



    private static final SubLSymbol GET_FILE_POSITION = makeSymbol("GET-FILE-POSITION");



    private static final SubLSymbol LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION = makeSymbol("LOAD-ONE-HL-TRANSCRIPT-TRACE-OPERATION");















    private static final SubLString $$$Loading_HL_transcript_Trace_ = makeString("Loading HL transcript Trace ");



    private static final SubLSymbol LOAD_HL_TRANSCRIPT_TRACE_ORIGINAL = makeSymbol("LOAD-HL-TRANSCRIPT-TRACE-ORIGINAL");

    private static final SubLList $list94 = list(makeSymbol("LOAD-HL-TRANSCRIPT-TRACE-REFACTORED"));



    private static final SubLString $str96$operation__S___S___A = makeString("operation ~S~%~S~%~A");



    private static final SubLString $str98$unexpected_error_mode__S = makeString("unexpected error mode ~S");

    private static final SubLString $$$Analyzing_HL_transcript_Trace_ = makeString("Analyzing HL transcript Trace ");

    private static final SubLSymbol $sym100$_ = makeSymbol(">");







    private static final SubLSymbol HLT_FIND_OR_CREATE = makeSymbol("HLT-FIND-OR-CREATE");

    private static final SubLSymbol HLT_FIND_OR_CREATE_NART = makeSymbol("HLT-FIND-OR-CREATE-NART");



    private static final SubLSymbol HLT_FIND_OR_CREATE_ASSERTION = makeSymbol("HLT-FIND-OR-CREATE-ASSERTION");









    private static final SubLSymbol HLT_ASSERT = makeSymbol("HLT-ASSERT");

    private static final SubLSymbol HLT_TIMESTAMP_ASSERTION = makeSymbol("HLT-TIMESTAMP-ASSERTION");



    private static final SubLSymbol HLT_FIND_OR_CREATE_KB_HL_SUPPORT = makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT");



    private static final SubLSymbol HLT_FIND_OR_CREATE_DEDUCTION = makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION");

    private static final SubLSymbol HLT_ADD_SKOLEM_DEFN = makeSymbol("HLT-ADD-SKOLEM-DEFN");

    private static final SubLSymbol HLT_REMOVE_CONSTANT = makeSymbol("HLT-REMOVE-CONSTANT");



    private static final SubLSymbol HLT_REMOVE_NART = makeSymbol("HLT-REMOVE-NART");

    private static final SubLSymbol HLT_UNASSERT = makeSymbol("HLT-UNASSERT");

    private static final SubLSymbol HLT_REMOVE_ASSERTION = makeSymbol("HLT-REMOVE-ASSERTION");

    private static final SubLSymbol HLT_REMOVE_DEDUCTION = makeSymbol("HLT-REMOVE-DEDUCTION");

    private static final SubLSymbol HLT_MERGE = makeSymbol("HLT-MERGE");

    private static final SubLSymbol HLT_RENAME = makeSymbol("HLT-RENAME");



    private static final SubLSymbol HLT_RENAME_VARIABLES = makeSymbol("HLT-RENAME-VARIABLES");

    private static final SubLString $str129$Could_not_open_an_input_stream_fo = makeString("Could not open an input stream for ~S.");



    private static final SubLString $str131$_HL_CONSTANT_LIST_RESET___ = makeString("(HL-CONSTANT-LIST-RESET)~%");

    private static final SubLString $str132$_HL_CONSTANT_LIST_APPEND__S__S__S = makeString("(HL-CONSTANT-LIST-APPEND ~S ~S ~S)~%");

    private static final SubLSymbol OPERATOR_IS_HL_FIND_CONSTANT = makeSymbol("OPERATOR-IS-HL-FIND-CONSTANT");

    private static final SubLSymbol TRANSFORM_HL_FIND_CONSTANT_ONLY = makeSymbol("TRANSFORM-HL-FIND-CONSTANT-ONLY");

    private static final SubLString $str135$_S__ = makeString("~S~%");

    private static final SubLSymbol GATHER_ALL_CONSTANTS_IN_HL_FORM = makeSymbol("GATHER-ALL-CONSTANTS-IN-HL-FORM");

    private static final SubLSymbol HLFC = makeSymbol("HLFC");

    public static SubLObject hl_quotify(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $hl_quotify_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return list_utilities.quotify(v_object);
    }

    public static SubLObject within_hl_evalP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_hl_evalP$.getDynamicValue(thread);
    }

    public static SubLObject hl_eval(final SubLObject hl_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subform = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($HL_UNQUOTIFY_FAILURE);
            final SubLObject _prev_bind_0 = $within_hl_evalP$.currentBinding(thread);
            try {
                $within_hl_evalP$.bind(T, thread);
                result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api.cyc_api_eval(hl_form)));
            } finally {
                $within_hl_evalP$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            subform = Errors.handleThrowable(ccatch_env_var, $HL_UNQUOTIFY_FAILURE);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != subform) {
            return Errors.error($str2$HL_Lookup_failure_with____S, hl_resolve(subform));
        }
        return apply(symbol_function(VALUES), result);
    }

    public static SubLObject hl_eval_error(final SubLObject subform) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_hl_evalP$.getDynamicValue(thread)) {
            return sublisp_throw($HL_UNQUOTIFY_FAILURE, subform);
        }
        return Errors.error($str4$HL_Lookup_failure_with___S, hl_resolve(subform));
    }

    public static SubLObject hl_quotify_cons_method(final SubLObject v_object) {
        if (NIL != list_utilities.tree_find_if(HL_KB_OBJECT_P, v_object, UNPROVIDED)) {
            return hl_quotify_list_careful(v_object);
        }
        return list_utilities.quotify(v_object);
    }

    public static SubLObject hl_kb_object_p(final SubLObject v_object) {
        return makeBoolean((((((NIL != constant_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != variables.variable_p(v_object))) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != deduction_handles.deduction_p(v_object))) || (NIL != kb_hl_support_handles.kb_hl_support_p(v_object)));
    }

    public static SubLObject hl_quotify_list_careful(final SubLObject list) {
        if (NIL != list_utilities.proper_list_p(list)) {
            return bq_cons(LIST, append(Mapping.mapcar(symbol_function(HL_QUOTIFY), list), NIL));
        }
        final SubLObject butlast = butlast(list, UNPROVIDED);
        final SubLObject last_cons = last(list, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = last_cons;
        SubLObject pre_dotted = NIL;
        SubLObject dotted = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        pre_dotted = current.first();
        current = dotted = current.rest();
        return bq_cons($sym10$LIST_, append(Mapping.mapcar(symbol_function(HL_QUOTIFY), butlast), list(hl_quotify(pre_dotted), hl_quotify(dotted))));
    }

    public static SubLObject hl_quotify_constant_method(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = constants_high.constant_name(v_object);
        final SubLObject external_id = (NIL != $hlt_include_constant_external_idsP$.getDynamicValue(thread)) ? constants_high.constant_external_id(v_object) : NIL;
        return hl_quotify_constant_int(name, external_id);
    }

    public static SubLObject hl_quotify_constant_int(final SubLObject name, final SubLObject external_id) {
        return listS(HL_FIND_CONSTANT, hl_quotify(name), append(NIL != external_id ? list(hl_quotify(external_id)) : NIL, NIL));
    }

    public static SubLObject hl_find_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLObject constant = (NIL != external_id) ? constants_high.find_constant_by_external_id(external_id) : constants_high.find_constant(name);
        if (NIL != constant_p(constant)) {
            return constant;
        }
        constant = hl_transcripts.hlt_find_or_create_missing_constant(name, external_id);
        if (NIL != constant_p(constant)) {
            return constant;
        }
        return hl_eval_error(hl_quotify_constant_int(name, external_id));
    }

    public static SubLObject hl_quotify_nart_method(final SubLObject v_object) {
        final SubLObject canonical_naut = narts_high.nart_hl_formula(v_object);
        return hl_quotify_nart_int(canonical_naut);
    }

    public static SubLObject hl_quotify_nart_int(final SubLObject canonical_naut) {
        return list(HL_FIND_NART, hl_quotify(canonical_naut));
    }

    public static SubLObject hl_find_nart(final SubLObject canonical_naut) {
        SubLObject nart = narts_high.find_nart(canonical_naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        nart = hl_transcripts.hlt_find_or_create_missing_nart(canonical_naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        return hl_eval_error(hl_quotify_nart_int(canonical_naut));
    }

    public static SubLObject hl_quotify_variable_method(final SubLObject v_object) {
        final SubLObject id = variables.variable_id(v_object);
        return hl_quotify_variable_int(id);
    }

    public static SubLObject hl_quotify_variable_int(final SubLObject id) {
        return list(HL_VAR, id);
    }

    public static SubLObject hl_var(final SubLObject id) {
        final SubLObject variable = variables.get_variable(id);
        if (NIL != variables.variable_p(variable)) {
            return variable;
        }
        return hl_eval_error(hl_quotify_variable_int(id));
    }

    public static SubLObject hl_quotify_assertion_method(final SubLObject v_object) {
        if (NIL != assertions_high.gaf_assertionP(v_object)) {
            return hl_quotify_gaf(v_object);
        }
        return hl_quotify_rule(v_object);
    }

    public static SubLObject hl_quotify_gaf(final SubLObject gaf) {
        final SubLObject hl_formula = assertions_high.gaf_hl_formula(gaf);
        final SubLObject mt = assertions_high.assertion_mt(gaf);
        return hl_quotify_gaf_int(hl_formula, mt);
    }

    public static SubLObject hl_quotify_rule(final SubLObject v_object) {
        final SubLObject cnf = assertions_high.assertion_cnf(v_object);
        final SubLObject mt = assertions_high.assertion_mt(v_object);
        return hl_quotify_rule_int(cnf, mt);
    }

    public static SubLObject hl_quotify_gaf_int(final SubLObject hl_formula, final SubLObject mt) {
        return list(HL_FIND_GAF, hl_quotify(hl_formula), hl_quotify(mt));
    }

    public static SubLObject hl_quotify_rule_int(final SubLObject cnf, final SubLObject mt) {
        return list(HL_FIND_RULE, hl_quotify(cnf), hl_quotify(mt));
    }

    public static SubLObject hl_find_gaf(final SubLObject gaf_formula, final SubLObject mt) {
        SubLObject gaf = kb_indexing.find_gaf(gaf_formula, mt);
        if (NIL != assertion_handles.assertion_p(gaf)) {
            return gaf;
        }
        gaf = hl_transcripts.hlt_find_or_create_missing_gaf(gaf_formula, mt);
        if (NIL != assertion_handles.assertion_p(gaf)) {
            return gaf;
        }
        return hl_eval_error(hl_quotify_gaf_int(gaf_formula, mt));
    }

    public static SubLObject hl_find_rule(final SubLObject cnf, final SubLObject mt) {
        SubLObject rule = kb_indexing.find_assertion(cnf, mt);
        if (NIL != assertion_handles.assertion_p(rule)) {
            return rule;
        }
        rule = hl_transcripts.hlt_find_or_create_missing_rule(cnf, mt);
        if (NIL != assertion_handles.assertion_p(rule)) {
            return rule;
        }
        return hl_eval_error(hl_quotify_rule_int(cnf, mt));
    }

    public static SubLObject hl_quotify_deduction_method(final SubLObject v_object) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(v_object);
        final SubLObject supports = deductions_high.deduction_supports(v_object);
        final SubLObject truth = deductions_high.deduction_truth(v_object);
        final SubLObject v_bindings = deductions_high.deduction_bindings(v_object);
        final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(v_object);
        return hl_quotify_deduction_int(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
    }

    public static SubLObject hl_quotify_deduction_int(final SubLObject supported_object, final SubLObject supports, final SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        return list(HL_FIND_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports), hl_quotify(truth), hl_quotify(v_bindings), hl_quotify(pragmatic_support_mts));
    }

    public static SubLObject hl_find_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        SubLObject deduction = deductions_high.find_deduction(supported_object, supports, truth);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        deduction = hl_transcripts.hlt_find_or_create_missing_deduction(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        return hl_eval_error(hl_quotify_deduction_int(supported_object, supports, truth, v_bindings, pragmatic_support_mts));
    }

    public static SubLObject hl_quotify_kb_hl_support_method(final SubLObject v_object) {
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(v_object);
        if (v_object.eql(hl_support)) {
            Errors.error($str23$Circular_KB_HL_Support_dependency);
        }
        return hl_quotify_kb_hl_support_int(hl_support);
    }

    public static SubLObject hl_quotify_kb_hl_support_int(final SubLObject hl_support) {
        return list(HL_FIND_KB_HL_SUPPORT, hl_quotify(hl_support));
    }

    public static SubLObject hl_find_kb_hl_support(final SubLObject hl_support) {
        SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
        if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
            return kb_hl_support;
        }
        kb_hl_support = hl_transcripts.hlt_find_or_create_missing_kb_hl_support(hl_support);
        if (NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
            return kb_hl_support;
        }
        return hl_quotify_kb_hl_support_int(hl_support);
    }

    public static SubLObject hl_resolve(final SubLObject hl_op) {
        if (hl_op.isAtom() || (NIL != list_utilities.quote_form_p(hl_op))) {
            return hl_op;
        }
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(hl_op, hl_op, $list26);
        operator = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        args = Mapping.mapcar(HL_RESOLVE_RECURSIVE, args);
        return cons(operator, args);
    }

    public static SubLObject hl_resolve_recursive(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (form.isAtom() || (NIL != list_utilities.quote_form_p(form))) {
            return form;
        }
        SubLObject resolved = NIL;
        SubLObject validP = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    resolved = hl_eval(form);
                    validP = T;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != validP) {
            return resolved;
        }
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(form, form, $list26);
        operator = form.first();
        final SubLObject current = args = form.rest();
        args = Mapping.mapcar(HL_RESOLVE_RECURSIVE, args);
        return cons(operator, args);
    }

    public static SubLObject hlt_trace_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($hlt_trace_streams$.getDynamicValue(thread));
    }

    public static SubLObject hlt_trace_op(final SubLObject hl_op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_tracedP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($hlt_trace_lock$.getGlobalValue());
            SubLObject cdolist_list_var = $hlt_trace_streams$.getDynamicValue(thread);
            SubLObject stream = NIL;
            stream = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                hlt_trace_op_internal(hl_op, stream);
                some_tracedP = T;
                cdolist_list_var = cdolist_list_var.rest();
                stream = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($hlt_trace_lock$.getGlobalValue());
            }
        }
        return some_tracedP;
    }

    public static SubLObject hlt_trace_op_internal(final SubLObject hl_op, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
        try {
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            if (NIL != $hlt_format_operationsP$.getDynamicValue(thread)) {
                format_cycl_expression.format_cycl_expression(hl_op, stream, UNPROVIDED);
            } else {
                final SubLObject _prev_bind_0_$1 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    terpri(stream);
                    prin1(hl_op, stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $print_level$.rebind(_prev_bind_2, thread);
            $print_length$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject with_hl_transcript_trace_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        stream = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list32);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (!stream.isAtom()) {
            final SubLObject stream_var = $sym33$STREAM_VAR;
            return list(CLET, list(list(stream_var, stream)), listS(WITH_HL_TRANSCRIPT_TRACE_TO_STREAM, list(stream_var), append(body, NIL)));
        }
        return list(PROGN, listS(CLET, list(list($hlt_trace_streams$, listS(CONS, stream, $list39))), append(body, NIL)), list(FORCE_OUTPUT, stream));
    }

    public static SubLObject without_hl_transcript_trace_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        stream = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, list(FORCE_OUTPUT, stream), listS(CLET, list(list($hlt_trace_streams$, listS(REMOVE, stream, $list39))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static SubLObject with_hl_transcript_trace_to_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        filename = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list42);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (!filename.isAtom()) {
            final SubLObject filename_var = $sym43$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), listS(WITH_HL_TRANSCRIPT_TRACE_TO_FILE, list(filename_var), append(body, NIL)));
        }
        final SubLObject stream = $sym45$STREAM;
        return list(CLET, list(stream), list(CUNWIND_PROTECT, list(PROGN, list(WITH_STREAM_BUFFER_SIZE, $list48, list(CSETQ, stream, list(ENSURE_PRIVATE_STREAM, listS(OPEN_TEXT, filename, $list52)))), list(PUNLESS, list(STREAMP, stream), list(ERROR, $str56$Unable_to_open__S, filename)), listS(WITH_HL_TRANSCRIPT_TRACE_TO_STREAM, list(stream), append(body, NIL))), list(PWHEN, stream, list(FORCE_OUTPUT, stream), list(CLOSE, stream))));
    }

    public static SubLObject start_hl_transcript_trace_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject stream = NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            stream = compatibility.open_text(filename, $OUTPUT);
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (stream.isStream()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($hlt_trace_lock$.getGlobalValue());
                $hlt_trace_streams$.setDynamicValue(cons(stream, $hlt_trace_streams$.getDynamicValue(thread)), thread);
            } finally {
                if (NIL != release) {
                    release_lock($hlt_trace_lock$.getGlobalValue());
                }
            }
        }
        return stream;
    }

    public static SubLObject stop_all_hl_transcript_traces_to_files() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject streams = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($hlt_trace_lock$.getGlobalValue());
            streams = $hlt_trace_streams$.getDynamicValue(thread);
        } finally {
            if (NIL != release) {
                release_lock($hlt_trace_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = streams;
        SubLObject stream = NIL;
        stream = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            stop_hl_transcript_trace_to_file(stream);
            total = add(total, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            stream = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject stop_hl_transcript_trace_to_file(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        try {
            SubLObject release = NIL;
            try {
                release = seize_lock($hlt_trace_lock$.getGlobalValue());
                $hlt_trace_streams$.setDynamicValue(list_utilities.delete_first(stream, $hlt_trace_streams$.getDynamicValue(thread), symbol_function(EQ)), thread);
            } finally {
                if (NIL != release) {
                    release_lock($hlt_trace_lock$.getGlobalValue());
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                force_output(stream);
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return stream;
    }

    public static SubLObject flush_hl_transcript_trace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject release = NIL;
        try {
            release = seize_lock($hlt_trace_lock$.getGlobalValue());
            SubLObject cdolist_list_var = $hlt_trace_streams$.getDynamicValue(thread);
            SubLObject stream = NIL;
            stream = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                force_output(stream);
                total = add(total, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                stream = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($hlt_trace_lock$.getGlobalValue());
            }
        }
        return total;
    }

    public static SubLObject do_hl_transcript_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_op_var = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        hl_op_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list61);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list61);
            if (NIL == member(current_$2, $list62, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list61);
        }
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!filename.isAtom()) {
            final SubLObject filename_var = $sym67$FILENAME_VAR;
            return list(CLET, list(list(filename_var, filename)), listS(DO_HL_TRANSCRIPT_TRACE, list(hl_op_var, filename_var, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = $sym69$PROGRESS_MESSAGE_VAR;
            return list(CLET, list(list(progress_message_var, progress_message)), listS(DO_HL_TRANSCRIPT_TRACE, list(hl_op_var, filename, $PROGRESS_MESSAGE, progress_message_var, $DONE, done), append(body, NIL)));
        }
        if (NIL == stream) {
            final SubLObject in_stream_var = $sym70$IN_STREAM_VAR;
            return list(WITH_STREAM_BUFFER_SIZE, $list48, list(WITH_PRIVATE_TEXT_FILE, listS(in_stream_var, filename, $list72), list(CSETQ, in_stream_var, list(ENABLE_FILE_STREAM_MEMORY_MAPPING, in_stream_var)), listS(DO_HL_TRANSCRIPT_TRACE, list(hl_op_var, filename, $STREAM, in_stream_var, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL))));
        }
        if (NIL != progress_message) {
            final SubLObject total = $sym74$TOTAL;
            final SubLObject sofar = $sym75$SOFAR;
            return list(CLET, list(list(total, list(FILE_LENGTH, stream)), bq_cons(sofar, $list77)), listS(CHECK_TYPE, progress_message, $list79), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_HL_TRANSCRIPT_TRACE, list(hl_op_var, filename, $STREAM, stream, $PROGRESS_MESSAGE, NIL, $DONE, done), list(CSETQ, sofar, list(GET_FILE_POSITION, stream)), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
        }
        return list(CLET, list(list(hl_op_var, list(LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION, stream))), listS(WHILE, list(CAND, list(CNOT, done), list(CNOT, list(EQ, $EOF, hl_op_var))), append(body, list(list(CSETQ, hl_op_var, list(LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION, stream))))));
    }

    public static SubLObject load_one_hl_transcript_trace_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject hl_op = $UNINITIALIZED;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    hl_op = read(stream, NIL, $EOF, UNPROVIDED);
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
        if (NIL != error_message) {
            return $EOF;
        }
        return hl_op;
    }

    public static SubLObject load_hl_transcript_trace(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == UNPROVIDED) {
            error_mode = $WARN;
        }
        return load_hl_transcript_trace_original(filename, error_mode);
    }

    public static SubLObject load_hl_transcript_trace_refactored(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == UNPROVIDED) {
            error_mode = $WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cconcatenate($$$Loading_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
        SubLObject total_ops = ZERO_INTEGER;
        SubLObject success_ops = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str56$Unable_to_open__S, filename);
                }
                SubLObject in_stream_var = stream;
                in_stream_var = file_utilities.enable_file_stream_memory_mapping(in_stream_var);
                final SubLObject total = file_length(in_stream_var);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(message) : "Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) " + message;
                final SubLObject _prev_bind_0_$4 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$6 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(message);
                        for (SubLObject hl_op = load_one_hl_transcript_trace_operation(in_stream_var); $EOF != hl_op; hl_op = load_one_hl_transcript_trace_operation(in_stream_var)) {
                            sofar = compatibility.get_file_position(in_stream_var);
                            note_percent_progress(sofar, total);
                            if (NIL != process_hl_transcript_trace_operation(hl_op, error_mode, total_ops)) {
                                success_ops = add(success_ops, ONE_INTEGER);
                            }
                            total_ops = add(total_ops, ONE_INTEGER);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$6, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$5, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return values(success_ops, subtract(total_ops, success_ops));
    }

    public static SubLObject load_hl_transcript_trace_original(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == UNPROVIDED) {
            error_mode = $WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_ops = ZERO_INTEGER;
        SubLObject success_ops = ZERO_INTEGER;
        SubLObject file_size = NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str56$Unable_to_open__S, filename);
                }
                SubLObject stream_$10 = stream;
                stream_$10 = file_utilities.enable_file_stream_memory_mapping(stream_$10);
                file_size = file_length(stream_$10);
                final SubLObject message = cconcatenate($$$Loading_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
                final SubLObject _prev_bind_0_$10 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$12 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(message);
                        SubLObject hl_op = load_one_hl_transcript_trace_operation(stream_$10);
                        SubLObject sofar = file_position(stream_$10, UNPROVIDED);
                        while (hl_op != $EOF) {
                            note_percent_progress(sofar, file_size);
                            if (NIL != process_hl_transcript_trace_operation(hl_op, error_mode, total_ops)) {
                                success_ops = add(success_ops, ONE_INTEGER);
                            }
                            total_ops = add(total_ops, ONE_INTEGER);
                            hl_op = load_one_hl_transcript_trace_operation(stream_$10);
                            sofar = file_position(stream_$10, UNPROVIDED);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_1_$12, thread);
                    kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return values(success_ops, subtract(total_ops, success_ops));
    }

    public static SubLObject process_hl_transcript_trace_operation(final SubLObject hl_op, final SubLObject error_mode, final SubLObject total_ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        if (error_mode.eql($IGNORE)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        process_hl_transcript_trace_operation_int(hl_op);
                        success = T;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else
            if (error_mode.eql($WARN)) {
                SubLObject error_message = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            process_hl_transcript_trace_operation_int(hl_op);
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
                if (NIL != error_message) {
                    Errors.warn($str96$operation__S___S___A, total_ops, hl_resolve(hl_op), error_message);
                } else {
                    success = T;
                }
            } else
                if (error_mode.eql($ERROR)) {
                    process_hl_transcript_trace_operation_int(hl_op);
                    success = T;
                } else {
                    Errors.error($str98$unexpected_error_mode__S, error_mode);
                }


        return success;
    }

    public static SubLObject process_hl_transcript_trace_operation_int(final SubLObject hl_op) {
        return hl_eval(hl_op);
    }

    public static SubLObject analyze_hl_transcript_trace(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        final SubLObject message = cconcatenate($$$Analyzing_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
        final SubLObject operation_count_map = dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$15 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$15, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str56$Unable_to_open__S, filename);
                }
                SubLObject in_stream_var = stream;
                in_stream_var = file_utilities.enable_file_stream_memory_mapping(in_stream_var);
                final SubLObject total = file_length(in_stream_var);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(message) : "Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) " + message;
                final SubLObject _prev_bind_0_$16 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$17 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(message);
                        for (SubLObject hl_op = load_one_hl_transcript_trace_operation(in_stream_var); $EOF != hl_op; hl_op = load_one_hl_transcript_trace_operation(in_stream_var)) {
                            sofar = compatibility.get_file_position(in_stream_var);
                            note_percent_progress(sofar, total);
                            analyze_one_hl_transcript_trace_operation(hl_op, operation_count_map);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$17, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        SubLObject analysis_alist = dictionary_utilities.dictionary_to_alist(operation_count_map);
        analysis_alist = Sort.sort(analysis_alist, symbol_function($sym100$_), symbol_function(CDR));
        return list_utilities.alist_to_plist(analysis_alist);
    }

    public static SubLObject analyze_one_hl_transcript_trace_operation(final SubLObject hl_op, final SubLObject operation_count_map) {
        final SubLObject operator = hl_op.first();
        dictionary_utilities.dictionary_increment(operation_count_map, operator, UNPROVIDED);
        dictionary_utilities.dictionary_increment(operation_count_map, $TOTAL, UNPROVIDED);
        return NIL;
    }

    public static SubLObject note_hlt_find_or_create(final SubLObject constant) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject hl_op = list(HLT_FIND_OR_CREATE, hl_quotify(name), hl_quotify(external_id));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_find_or_create_nart(final SubLObject canonical_naut) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            final SubLObject hl_op = list(HLT_FIND_OR_CREATE_NART, hl_quotify(canonical_naut));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_find_or_create_assertion(final SubLObject assertion) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject var_names = assertions_high.assertion_variable_names(assertion);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
            final SubLObject hl_op = list(HLT_FIND_OR_CREATE_ASSERTION, hl_quotify(cnf), hl_quotify(mt), hl_quotify(var_names), hl_quotify(direction), hl_quotify(truth), hl_quotify(strength), hl_quotify(asserted_argument));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_assert(final SubLObject assertion) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            final SubLObject sentence = canon_tl.assertion_tl_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            final SubLObject bookkeeping_info = cyc_bookkeeping.assertion_bookkeeping_info(assertion);
            result = note_hlt_assert_sentence(sentence, mt, strength, direction, bookkeeping_info);
        }
        return result;
    }

    public static SubLObject note_hlt_assert_bookkeeping_sentence(final SubLObject sentence, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
            assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
            final SubLObject strength = $MONOTONIC;
            final SubLObject direction = $BACKWARD;
            final SubLObject bookkeeping_info = NIL;
            result = note_hlt_assert_sentence(sentence, mt, strength, direction, bookkeeping_info);
        }
        return result;
    }

    public static SubLObject note_hlt_assert_sentence(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject bookkeeping_info) {
        final SubLObject hl_op = list(HLT_ASSERT, hl_quotify(sentence), hl_quotify(mt), hl_quotify(strength), hl_quotify(direction), hl_quotify(bookkeeping_info));
        return hlt_trace_op(hl_op);
    }

    public static SubLObject note_hlt_timestamp_assertion(final SubLObject assertion) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            final SubLObject who = assertions_high.asserted_by(assertion);
            final SubLObject when = assertions_high.asserted_when(assertion);
            final SubLObject why = assertions_high.asserted_why(assertion);
            final SubLObject second = assertions_high.asserted_second(assertion);
            final SubLObject hl_op = list(HLT_TIMESTAMP_ASSERTION, hl_quotify(assertion), hl_quotify(who), hl_quotify(when), hl_quotify(why), hl_quotify(second));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_find_or_create_kb_hl_support(final SubLObject kb_hl_support) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : "kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + "CommonSymbols.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) " + kb_hl_support;
            final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
            final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            final SubLObject hl_op = list(HLT_FIND_OR_CREATE_KB_HL_SUPPORT, hl_quotify(hl_support), hl_quotify(justification));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_find_or_create_deduction(final SubLObject deduction) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            if (NIL != assertion_handles.assertion_p(supported_object)) {
                final SubLObject supports = deductions_high.deduction_supports(deduction);
                final SubLObject truth = deductions_high.deduction_truth(deduction);
                final SubLObject v_bindings = deductions_high.deduction_bindings(deduction);
                final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(deduction);
                final SubLObject hl_op = list(HLT_FIND_OR_CREATE_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports), hl_quotify(truth), hl_quotify(v_bindings), hl_quotify(pragmatic_support_mts));
                result = hlt_trace_op(hl_op);
            }
        }
        return result;
    }

    public static SubLObject note_hlt_add_skolem_defn(final SubLObject sk_defn, final SubLObject key) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            final SubLObject hl_op = list(HLT_ADD_SKOLEM_DEFN, hl_quotify(sk_defn), hl_quotify(key));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject hlt_add_skolem_defn(final SubLObject sk_defn, final SubLObject key) {
        return skolems.add_skolem_defn(sk_defn, key);
    }

    public static SubLObject note_hlt_remove_constant(final SubLObject constant) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
            final SubLObject hl_op = list(HLT_REMOVE_CONSTANT, hl_quotify(constant));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_remove_nart(final SubLObject nart) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != nart_handles.nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
            final SubLObject canonical_naut = narts_high.nart_hl_formula(nart);
            if (NIL != canonical_naut) {
                final SubLObject hl_op = list(HLT_REMOVE_NART, hl_quotify(canonical_naut));
                result = hlt_trace_op(hl_op);
            }
        }
        return result;
    }

    public static SubLObject hlt_remove_nart(final SubLObject canonical_naut) {
        final SubLObject nart = narts_high.find_nart(canonical_naut);
        if (NIL != nart_handles.nart_p(nart)) {
            return fi.fi_kill_int(nart);
        }
        return NIL;
    }

    public static SubLObject note_hlt_unassert(final SubLObject assertion) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            result = note_hlt_unassert_sentence(sentence, mt);
        }
        return result;
    }

    public static SubLObject note_hlt_unassert_bookkeeping_sentence(final SubLObject sentence, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
            assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
            result = note_hlt_unassert_sentence(sentence, mt);
        }
        return result;
    }

    public static SubLObject note_hlt_unassert_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject hl_op = list(HLT_UNASSERT, hl_quotify(sentence), hl_quotify(mt));
        return hlt_trace_op(hl_op);
    }

    public static SubLObject note_hlt_remove_assertion(final SubLObject assertion) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject hl_op = list(HLT_REMOVE_ASSERTION, hl_quotify(sentence), hl_quotify(mt));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject note_hlt_remove_deduction(final SubLObject deduction) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            final SubLObject supports = deductions_high.deduction_supports(deduction);
            final SubLObject hl_op = list(HLT_REMOVE_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject hlt_remove_deduction(final SubLObject supported_object, final SubLObject supports) {
        final SubLObject deduction = deductions_high.find_deduction(supported_object, supports, UNPROVIDED);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            return tms.tms_remove_deduction(deduction);
        }
        return NIL;
    }

    public static SubLObject hlt_merge(final SubLObject kill_term, final SubLObject keep_term) {
        return keep_term;
    }

    public static SubLObject note_hlt_rename(final SubLObject constant, final SubLObject new_name) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
            assert NIL != stringp(new_name) : "Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) " + new_name;
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject hl_op = list(HLT_RENAME, hl_quotify(external_id), hl_quotify(new_name));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject hlt_rename(SubLObject constant, final SubLObject new_name) {
        if (NIL == constant_p(constant)) {
            constant = constants_high.find_constant_by_external_id(constant);
        }
        return fi.fi_rename_int(constant, new_name);
    }

    public static SubLObject note_hlt_rename_variables(final SubLObject assertion, final SubLObject new_variable_names) {
        SubLObject result = NIL;
        if (NIL != hlt_trace_enabledP()) {
            assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
            assert NIL != listp(new_variable_names) : "Types.listp(new_variable_names) " + "CommonSymbols.NIL != Types.listp(new_variable_names) " + new_variable_names;
            final SubLObject hl_op = list(HLT_RENAME_VARIABLES, hl_quotify(assertion), hl_quotify(new_variable_names));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }

    public static SubLObject hlt_rename_variables(final SubLObject assertion, final SubLObject new_variable_names) {
        return assertions_interface.kb_set_assertion_variable_names(assertion, new_variable_names);
    }

    public static SubLObject compress_hl_transcript_trace(final SubLObject input_filename, final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(input_filename) : "Types.stringp(input_filename) " + "CommonSymbols.NIL != Types.stringp(input_filename) " + input_filename;
        assert NIL != stringp(output_filename) : "Types.stringp(output_filename) " + "CommonSymbols.NIL != Types.stringp(output_filename) " + output_filename;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(input_filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str56$Unable_to_open__S, input_filename);
            }
            final SubLObject in = stream;
            if (!in.isStream()) {
                Errors.error($str129$Could_not_open_an_input_stream_fo, input_filename);
            }
            final SubLObject out = compatibility.open_text(output_filename, $OUTPUT);
            SubLObject done = NIL;
            SubLObject hl_op = NIL;
            final SubLObject _prev_bind_0 = $hlt_constant_id_map$.currentBinding(thread);
            try {
                $hlt_constant_id_map$.bind(make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED), thread);
                SubLObject next_id = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$20 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    format(out, $str131$_HL_CONSTANT_LIST_RESET___);
                    while (NIL == done) {
                        hl_op = load_one_hl_transcript_trace_operation(in);
                        SubLObject cdolist_list_var = remove_duplicates(gather_all_constants_in_hl_form(hl_op), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject hl_id = NIL;
                        hl_id = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == gethash(third(hl_id), $hlt_constant_id_map$.getDynamicValue(thread), UNPROVIDED)) {
                                sethash(third(hl_id), $hlt_constant_id_map$.getDynamicValue(thread), next_id);
                                format(out, $str132$_HL_CONSTANT_LIST_APPEND__S__S__S, new SubLObject[]{ next_id, second(hl_id), third(hl_id) });
                                next_id = add(next_id, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            hl_id = cdolist_list_var.first();
                        } 
                        transform_list_utilities.ntransform(hl_op, symbol_function(OPERATOR_IS_HL_FIND_CONSTANT), symbol_function(TRANSFORM_HL_FIND_CONSTANT_ONLY), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (hl_op == $EOF) {
                            done = T;
                        } else {
                            format(out, $str135$_S__, hl_op);
                        }
                    } 
                    close(out, UNPROVIDED);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                $hlt_constant_id_map$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject gather_all_constants_in_hl_form(final SubLObject hl_op) {
        if (hl_op.isAtom()) {
            return NIL;
        }
        SubLObject constants = NIL;
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(hl_op, hl_op, $list26);
        operator = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        if (operator == HL_FIND_CONSTANT) {
            return list(hl_op);
        }
        if (args.isList()) {
            SubLObject cdolist_list_var;
            final SubLObject nested_elements = cdolist_list_var = Mapping.mapcar(GATHER_ALL_CONSTANTS_IN_HL_FORM, args);
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                constants = append(constants, element);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
        }
        return constants;
    }

    public static SubLObject operator_is_hl_find_constant(final SubLObject form) {
        if (form.isAtom()) {
            return NIL;
        }
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(form, form, $list26);
        operator = form.first();
        final SubLObject current = args = form.rest();
        return eq(operator, HL_FIND_CONSTANT);
    }

    public static SubLObject transform_hl_find_constant_only(final SubLObject hl_find_constant_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(HLFC, gethash(third(hl_find_constant_form), $hlt_constant_id_map$.getDynamicValue(thread), UNPROVIDED));
    }

    public static SubLObject hl_constant_list_reset() {
        $hlt_constant_list$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject hl_constant_list_append(final SubLObject hlts_id, final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hlt_constant_list$.setDynamicValue(append($hlt_constant_list$.getDynamicValue(thread), list(hl_find_constant(name, external_id))), thread);
        if (!length($hlt_constant_list$.getDynamicValue(thread)).eql(subtract(hlts_id, ONE_INTEGER))) {
        }
        return NIL;
    }

    public static SubLObject hlfc(final SubLObject hlts_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nth(hlts_id, $hlt_constant_list$.getDynamicValue(thread));
    }

    public static SubLObject count_new_constants() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject start = new_constant_suid_threshold();
        final SubLObject table_var = do_constants_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != obj) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject count_new_narts() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject start = nart_handles.new_nart_id_threshold();
        final SubLObject table_var = nart_handles.do_narts_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != obj) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject count_new_assertions() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        final SubLObject table_var = assertion_handles.do_assertions_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != obj) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject count_new_deductions() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject table_var = deduction_handles.do_deductions_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != obj) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject count_new_kb_hl_supports() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject table_var = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != obj) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject count_new_kb_objects() {
        return add(new SubLObject[]{ count_new_constants(), count_new_narts(), count_new_assertions(), count_new_deductions(), count_new_kb_hl_supports() });
    }

    public static SubLObject declare_hl_transcript_tracing_file() {
        declareFunction("hl_quotify", "HL-QUOTIFY", 1, 0, false);
        declareFunction("within_hl_evalP", "WITHIN-HL-EVAL?", 0, 0, false);
        declareFunction("hl_eval", "HL-EVAL", 1, 0, false);
        declareFunction("hl_eval_error", "HL-EVAL-ERROR", 1, 0, false);
        declareFunction("hl_quotify_cons_method", "HL-QUOTIFY-CONS-METHOD", 1, 0, false);
        declareFunction("hl_kb_object_p", "HL-KB-OBJECT-P", 1, 0, false);
        declareFunction("hl_quotify_list_careful", "HL-QUOTIFY-LIST-CAREFUL", 1, 0, false);
        declareFunction("hl_quotify_constant_method", "HL-QUOTIFY-CONSTANT-METHOD", 1, 0, false);
        declareFunction("hl_quotify_constant_int", "HL-QUOTIFY-CONSTANT-INT", 2, 0, false);
        declareFunction("hl_find_constant", "HL-FIND-CONSTANT", 1, 1, false);
        declareFunction("hl_quotify_nart_method", "HL-QUOTIFY-NART-METHOD", 1, 0, false);
        declareFunction("hl_quotify_nart_int", "HL-QUOTIFY-NART-INT", 1, 0, false);
        declareFunction("hl_find_nart", "HL-FIND-NART", 1, 0, false);
        declareFunction("hl_quotify_variable_method", "HL-QUOTIFY-VARIABLE-METHOD", 1, 0, false);
        declareFunction("hl_quotify_variable_int", "HL-QUOTIFY-VARIABLE-INT", 1, 0, false);
        declareFunction("hl_var", "HL-VAR", 1, 0, false);
        declareFunction("hl_quotify_assertion_method", "HL-QUOTIFY-ASSERTION-METHOD", 1, 0, false);
        declareFunction("hl_quotify_gaf", "HL-QUOTIFY-GAF", 1, 0, false);
        declareFunction("hl_quotify_rule", "HL-QUOTIFY-RULE", 1, 0, false);
        declareFunction("hl_quotify_gaf_int", "HL-QUOTIFY-GAF-INT", 2, 0, false);
        declareFunction("hl_quotify_rule_int", "HL-QUOTIFY-RULE-INT", 2, 0, false);
        declareFunction("hl_find_gaf", "HL-FIND-GAF", 2, 0, false);
        declareFunction("hl_find_rule", "HL-FIND-RULE", 2, 0, false);
        declareFunction("hl_quotify_deduction_method", "HL-QUOTIFY-DEDUCTION-METHOD", 1, 0, false);
        declareFunction("hl_quotify_deduction_int", "HL-QUOTIFY-DEDUCTION-INT", 3, 2, false);
        declareFunction("hl_find_deduction", "HL-FIND-DEDUCTION", 2, 3, false);
        declareFunction("hl_quotify_kb_hl_support_method", "HL-QUOTIFY-KB-HL-SUPPORT-METHOD", 1, 0, false);
        declareFunction("hl_quotify_kb_hl_support_int", "HL-QUOTIFY-KB-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("hl_find_kb_hl_support", "HL-FIND-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("hl_resolve", "HL-RESOLVE", 1, 0, false);
        declareFunction("hl_resolve_recursive", "HL-RESOLVE-RECURSIVE", 1, 0, false);
        declareFunction("hlt_trace_enabledP", "HLT-TRACE-ENABLED?", 0, 0, false);
        declareFunction("hlt_trace_op", "HLT-TRACE-OP", 1, 0, false);
        declareFunction("hlt_trace_op_internal", "HLT-TRACE-OP-INTERNAL", 2, 0, false);
        declareMacro("with_hl_transcript_trace_to_stream", "WITH-HL-TRANSCRIPT-TRACE-TO-STREAM");
        declareMacro("without_hl_transcript_trace_to_stream", "WITHOUT-HL-TRANSCRIPT-TRACE-TO-STREAM");
        declareMacro("with_hl_transcript_trace_to_file", "WITH-HL-TRANSCRIPT-TRACE-TO-FILE");
        declareFunction("start_hl_transcript_trace_to_file", "START-HL-TRANSCRIPT-TRACE-TO-FILE", 1, 0, false);
        declareFunction("stop_all_hl_transcript_traces_to_files", "STOP-ALL-HL-TRANSCRIPT-TRACES-TO-FILES", 0, 0, false);
        declareFunction("stop_hl_transcript_trace_to_file", "STOP-HL-TRANSCRIPT-TRACE-TO-FILE", 1, 0, false);
        declareFunction("flush_hl_transcript_trace", "FLUSH-HL-TRANSCRIPT-TRACE", 0, 0, false);
        declareMacro("do_hl_transcript_trace", "DO-HL-TRANSCRIPT-TRACE");
        declareFunction("load_one_hl_transcript_trace_operation", "LOAD-ONE-HL-TRANSCRIPT-TRACE-OPERATION", 1, 0, false);
        declareFunction("load_hl_transcript_trace", "LOAD-HL-TRANSCRIPT-TRACE", 1, 1, false);
        declareFunction("load_hl_transcript_trace_refactored", "LOAD-HL-TRANSCRIPT-TRACE-REFACTORED", 1, 1, false);
        declareFunction("load_hl_transcript_trace_original", "LOAD-HL-TRANSCRIPT-TRACE-ORIGINAL", 1, 1, false);
        declareFunction("process_hl_transcript_trace_operation", "PROCESS-HL-TRANSCRIPT-TRACE-OPERATION", 3, 0, false);
        declareFunction("process_hl_transcript_trace_operation_int", "PROCESS-HL-TRANSCRIPT-TRACE-OPERATION-INT", 1, 0, false);
        declareFunction("analyze_hl_transcript_trace", "ANALYZE-HL-TRANSCRIPT-TRACE", 1, 0, false);
        declareFunction("analyze_one_hl_transcript_trace_operation", "ANALYZE-ONE-HL-TRANSCRIPT-TRACE-OPERATION", 2, 0, false);
        declareFunction("note_hlt_find_or_create", "NOTE-HLT-FIND-OR-CREATE", 1, 0, false);
        declareFunction("note_hlt_find_or_create_nart", "NOTE-HLT-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction("note_hlt_find_or_create_assertion", "NOTE-HLT-FIND-OR-CREATE-ASSERTION", 1, 0, false);
        declareFunction("note_hlt_assert", "NOTE-HLT-ASSERT", 1, 0, false);
        declareFunction("note_hlt_assert_bookkeeping_sentence", "NOTE-HLT-ASSERT-BOOKKEEPING-SENTENCE", 2, 0, false);
        declareFunction("note_hlt_assert_sentence", "NOTE-HLT-ASSERT-SENTENCE", 5, 0, false);
        declareFunction("note_hlt_timestamp_assertion", "NOTE-HLT-TIMESTAMP-ASSERTION", 1, 0, false);
        declareFunction("note_hlt_find_or_create_kb_hl_support", "NOTE-HLT-FIND-OR-CREATE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("note_hlt_find_or_create_deduction", "NOTE-HLT-FIND-OR-CREATE-DEDUCTION", 1, 0, false);
        declareFunction("note_hlt_add_skolem_defn", "NOTE-HLT-ADD-SKOLEM-DEFN", 2, 0, false);
        declareFunction("hlt_add_skolem_defn", "HLT-ADD-SKOLEM-DEFN", 2, 0, false);
        declareFunction("note_hlt_remove_constant", "NOTE-HLT-REMOVE-CONSTANT", 1, 0, false);
        declareFunction("note_hlt_remove_nart", "NOTE-HLT-REMOVE-NART", 1, 0, false);
        declareFunction("hlt_remove_nart", "HLT-REMOVE-NART", 1, 0, false);
        declareFunction("note_hlt_unassert", "NOTE-HLT-UNASSERT", 1, 0, false);
        declareFunction("note_hlt_unassert_bookkeeping_sentence", "NOTE-HLT-UNASSERT-BOOKKEEPING-SENTENCE", 2, 0, false);
        declareFunction("note_hlt_unassert_sentence", "NOTE-HLT-UNASSERT-SENTENCE", 2, 0, false);
        declareFunction("note_hlt_remove_assertion", "NOTE-HLT-REMOVE-ASSERTION", 1, 0, false);
        declareFunction("note_hlt_remove_deduction", "NOTE-HLT-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("hlt_remove_deduction", "HLT-REMOVE-DEDUCTION", 2, 0, false);
        declareFunction("hlt_merge", "HLT-MERGE", 2, 0, false);
        declareFunction("note_hlt_rename", "NOTE-HLT-RENAME", 2, 0, false);
        declareFunction("hlt_rename", "HLT-RENAME", 2, 0, false);
        declareFunction("note_hlt_rename_variables", "NOTE-HLT-RENAME-VARIABLES", 2, 0, false);
        declareFunction("hlt_rename_variables", "HLT-RENAME-VARIABLES", 2, 0, false);
        declareFunction("compress_hl_transcript_trace", "COMPRESS-HL-TRANSCRIPT-TRACE", 2, 0, false);
        declareFunction("gather_all_constants_in_hl_form", "GATHER-ALL-CONSTANTS-IN-HL-FORM", 1, 0, false);
        declareFunction("operator_is_hl_find_constant", "OPERATOR-IS-HL-FIND-CONSTANT", 1, 0, false);
        declareFunction("transform_hl_find_constant_only", "TRANSFORM-HL-FIND-CONSTANT-ONLY", 1, 0, false);
        declareFunction("hl_constant_list_reset", "HL-CONSTANT-LIST-RESET", 0, 0, false);
        declareFunction("hl_constant_list_append", "HL-CONSTANT-LIST-APPEND", 3, 0, false);
        declareFunction("hlfc", "HLFC", 1, 0, false);
        declareFunction("count_new_constants", "COUNT-NEW-CONSTANTS", 0, 0, false);
        declareFunction("count_new_narts", "COUNT-NEW-NARTS", 0, 0, false);
        declareFunction("count_new_assertions", "COUNT-NEW-ASSERTIONS", 0, 0, false);
        declareFunction("count_new_deductions", "COUNT-NEW-DEDUCTIONS", 0, 0, false);
        declareFunction("count_new_kb_hl_supports", "COUNT-NEW-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("count_new_kb_objects", "COUNT-NEW-KB-OBJECTS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_hl_transcript_tracing_file() {
        deflexical("*HL-QUOTIFY-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*WITHIN-HL-EVAL?*", NIL);
        defvar("*HLT-INCLUDE-CONSTANT-EXTERNAL-IDS?*", T);
        defvar("*HLT-TRACE-STREAMS*", NIL);
        deflexical("*HLT-TRACE-LOCK*", SubLTrampolineFile.maybeDefault($hlt_trace_lock$, $hlt_trace_lock$, () -> make_lock($$$HLT_trace)));
        defvar("*HLT-FORMAT-OPERATIONS?*", NIL);
        defparameter("*HLT-CONSTANT-ID-MAP*", NIL);
        defparameter("*HLT-CONSTANT-LIST*", NIL);
        return NIL;
    }

    public static SubLObject setup_hl_transcript_tracing_file() {
        register_method($hl_quotify_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(HL_QUOTIFY_CONS_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(HL_QUOTIFY_CONSTANT_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(HL_QUOTIFY_NART_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(HL_QUOTIFY_VARIABLE_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(HL_QUOTIFY_ASSERTION_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(HL_QUOTIFY_DEDUCTION_METHOD));
        register_method($hl_quotify_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(HL_QUOTIFY_KB_HL_SUPPORT_METHOD));
        declare_defglobal($hlt_trace_lock$);
        define_obsolete_register(LOAD_HL_TRANSCRIPT_TRACE_ORIGINAL, $list94);
        define_obsolete_register(HLT_MERGE, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hl_transcript_tracing_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_transcript_tracing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_transcript_tracing_file();
    }

    
}

/**
 * Total time: 590 ms
 */
