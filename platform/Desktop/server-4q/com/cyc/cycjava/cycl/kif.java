package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kif extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kif";
    public static final String myFingerPrint = "6ab85fde3a073e263e893d77e981002a0ab2d035dbb6ab75a2decb7f25592d95";
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 1598L)
    private static SubLSymbol $within_cycl_to_kif$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 1647L)
    private static SubLSymbol $additional_kif_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 2053L)
    public static SubLSymbol $cycl_to_kif_error_method$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 2232L)
    private static SubLSymbol $default_kif_term_print_method$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 2380L)
    public static SubLSymbol $kif_term_print_method$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6482L)
    private static SubLSymbol $kb_to_kif_file_preamble$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6712L)
    private static SubLSymbol $mt_to_kif_file_preamble$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLSymbol $dtp_kif_term$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10809L)
    private static SubLSymbol $kif_term_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 12825L)
    private static SubLSymbol $cycl_to_kif_method_table$;
    private static final SubLSymbol $sym0$CCATCH_IGNORE;
    private static final SubLSymbol $kw1$ABORT_CYCL_TO_KIF;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$ABORT;
    private static final SubLSymbol $sym5$WRITE_KIF_TERM_MIXED_CASE;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_METHOD;
    private static final SubLSymbol $sym8$WITH_TEXT_FILE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE;
    private static final SubLSymbol $sym11$_KIF_TERM_PRINT_METHOD_;
    private static final SubLSymbol $sym12$FIF;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$STRINGP;
    private static final SubLSymbol $kw16$OUTPUT;
    private static final SubLString $str17$Unable_to_open__S;
    private static final SubLString $str18$Converting_KB_to_KIF;
    private static final SubLSymbol $kw19$SKIP;
    private static final SubLSymbol $kw20$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym21$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym22$HLMT_P;
    private static final SubLSymbol $kw23$MT;
    private static final SubLSymbol $kw24$BROAD_MT;
    private static final SubLString $str25$do_broad_mt_index;
    private static final SubLSymbol $sym26$ASSERTION_P;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw30$DIRECTION;
    private static final SubLSymbol $kw31$MONOTONICITY;
    private static final SubLSymbol $kw32$MICROTHEORY;
    private static final SubLSymbol $kw33$CREATOR;
    private static final SubLSymbol $kw34$CREATION_DATE;
    private static final SubLSymbol $kw35$KIF;
    private static final SubLString $str36$_____;
    private static final SubLString $str37$_DIRECTION__S;
    private static final SubLString $str38$__MONOTONICITY__S;
    private static final SubLString $str39$__CREATOR__S;
    private static final SubLString $str40$__CREATION_DATE__S;
    private static final SubLString $str41$____MICROTHEORY__S;
    private static final SubLString $str42$____KIF;
    private static final SubLString $str43$___;
    private static final SubLString $str44$_____KIF_assertion_specs_for_enti;
    private static final SubLString $str45$_____KIF_assertion_specs_for_micr;
    private static final SubLSymbol $sym46$CHAR_UPCASE;
    private static final SubLSymbol $sym47$CHAR_DOWNCASE;
    private static final SubLSymbol $kw48$IGNORE;
    private static final SubLSymbol $kw49$WARN;
    private static final SubLSymbol $sym50$WARN;
    private static final SubLSymbol $kw51$CERROR;
    private static final SubLSymbol $sym52$CERROR;
    private static final SubLString $str53$Use_NIL;
    private static final SubLSymbol $kw54$ERROR;
    private static final SubLSymbol $sym55$ERROR;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$PUNLESS;
    private static final SubLSymbol $sym58$_SUSPEND_TYPE_CHECKING__;
    private static final SubLSymbol $sym59$CYCL_TO_KIF_ERROR;
    private static final SubLString $str60$_A_is_not_a__A;
    private static final SubLSymbol $sym61$QUOTE;
    private static final SubLSymbol $sym62$KIF_TERM;
    private static final SubLSymbol $sym63$KIF_TERM_P;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$PRINT_KIF_TERM;
    private static final SubLSymbol $sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$KIF_PRINT_STRING;
    private static final SubLSymbol $sym72$_CSETF_KIF_PRINT_STRING;
    private static final SubLSymbol $kw73$PRINT_STRING;
    private static final SubLString $str74$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw75$BEGIN;
    private static final SubLSymbol $sym76$MAKE_KIF_TERM;
    private static final SubLSymbol $kw77$SLOT;
    private static final SubLSymbol $kw78$END;
    private static final SubLSymbol $sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD;
    private static final SubLSymbol $sym80$SXHASH_KIF_TERM_METHOD;
    private static final SubLSymbol $sym81$_KIF_TERM_TABLE_;
    private static final SubLSymbol $sym82$CYCL_TO_KIF_FUNCTOR_P;
    private static final SubLSymbol $sym83$SYMBOLP;
    private static final SubLInteger $int84$50;
    private static final SubLList $list85;
    private static final SubLString $str86$CYCL_TO_KIF__A_METHOD;
    private static final SubLSymbol $sym87$PROGN;
    private static final SubLSymbol $sym88$DEFINE_PRIVATE;
    private static final SubLSymbol $sym89$REGISTER_CYCL_TO_KIF_METHOD;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$EL_VAR_;
    private static final SubLObject $const92$trueSentence;
    private static final SubLSymbol $sym93$CYCL_2_TERM_TO_KIF;
    private static final SubLString $str94$Expecting_a_variable___S;
    private static final SubLString $str95$Invalid_represented_first_order_t;
    private static final SubLList $list96;
    private static final SubLObject $const97$True;
    private static final SubLString $str98$true;
    private static final SubLObject $const99$False;
    private static final SubLString $str100$false;
    private static final SubLObject $const101$not;
    private static final SubLString $str102$not;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$CYCL_TO_KIF_NOT_METHOD;
    private static final SubLObject $const105$and;
    private static final SubLString $str106$and;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$CYCL_FORMULA_TO_KIF;
    private static final SubLSymbol $sym109$CYCL_TO_KIF_AND_METHOD;
    private static final SubLObject $const110$or;
    private static final SubLString $str111$or;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$CYCL_TO_KIF_OR_METHOD;
    private static final SubLObject $const114$implies;
    private static final SubLString $str115$__;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$CYCL_TO_KIF_IMPLIES_METHOD;
    private static final SubLObject $const118$equiv;
    private static final SubLString $str119$___;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$CYCL_TO_KIF_EQUIV_METHOD;
    private static final SubLList $list122;
    private static final SubLObject $const123$xor;
    private static final SubLSymbol $sym124$CYCL_TO_KIF_XOR_METHOD;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD;
    private static final SubLObject $const127$forAll;
    private static final SubLString $str128$forall;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$CYCL_TO_KIF_FORALL_METHOD;
    private static final SubLObject $const131$thereExists;
    private static final SubLString $str132$exists;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$CYCL_TO_KIF_THEREEXISTS_METHOD;
    private static final SubLObject $const135$thereExistExactly;
    private static final SubLSymbol $sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD;
    private static final SubLObject $const137$thereExistAtLeast;
    private static final SubLSymbol $sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD;
    private static final SubLObject $const139$thereExistAtMost;
    private static final SubLSymbol $sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD;
    private static final SubLList $list141;
    private static final SubLObject $const142$equals;
    private static final SubLString $str143$_;
    private static final SubLList $list144;
    private static final SubLObject $const145$ist;
    private static final SubLSymbol $sym146$CYCL_TO_KIF_IST_METHOD;
    private static final SubLList $list147;
    private static final SubLObject $const148$goals;
    private static final SubLSymbol $sym149$CYCL_TO_KIF_GOALS_METHOD;
    private static final SubLObject $const150$TheList;
    private static final SubLString $str151$listof;
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 1703L)
    public static SubLObject until_cycl_to_kif_aborted(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)kif.$sym0$CCATCH_IGNORE, (SubLObject)kif.$kw1$ABORT_CYCL_TO_KIF, (SubLObject)ConsesLow.listS((SubLObject)kif.$sym2$CLET, (SubLObject)kif.$list3, ConsesLow.append(body, (SubLObject)kif.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 1893L)
    public static SubLObject abort_cycl_to_kif() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kif.NIL != kif.$within_cycl_to_kif$.getDynamicValue(thread)) {
            return Dynamic.sublisp_throw((SubLObject)kif.$kw1$ABORT_CYCL_TO_KIF, (SubLObject)kif.NIL);
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 2516L)
    public static SubLObject writing_kif_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)kif.NIL;
        SubLObject filename = (SubLObject)kif.NIL;
        SubLObject kif_term_print_method = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list6);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list6);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list6);
        kif_term_print_method = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject print_method = (SubLObject)kif.$sym7$PRINT_METHOD;
            return (SubLObject)ConsesLow.list((SubLObject)kif.$sym8$WITH_TEXT_FILE, (SubLObject)ConsesLow.listS(stream, filename, (SubLObject)kif.$list9), (SubLObject)ConsesLow.list((SubLObject)kif.$sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE, stream), (SubLObject)ConsesLow.listS((SubLObject)kif.$sym2$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(print_method, kif_term_print_method), (SubLObject)ConsesLow.list((SubLObject)kif.$sym11$_KIF_TERM_PRINT_METHOD_, (SubLObject)ConsesLow.listS((SubLObject)kif.$sym12$FIF, print_method, print_method, (SubLObject)kif.$list13)), (SubLObject)kif.$list14), ConsesLow.append(body, (SubLObject)kif.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kif.$list6);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 2951L)
    public static SubLObject write_kb_to_kif_file(final SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == kif.UNPROVIDED) {
            kif_term_print_method = (SubLObject)kif.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kif.NIL != Types.stringp(filename) : filename;
        SubLObject written = (SubLObject)kif.NIL;
        SubLObject stream = (SubLObject)kif.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)kif.$kw16$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kif.$str17$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            misc_utilities.write_kb_content_copyright_notice(stream_$1);
            final SubLObject print_method = kif_term_print_method;
            final SubLObject _prev_bind_0 = kif.$kif_term_print_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kif.$cycl_to_kif_error_method$.currentBinding(thread);
            try {
                kif.$kif_term_print_method$.bind((kif.NIL != print_method) ? print_method : kif.$kif_term_print_method$.getDynamicValue(thread), thread);
                kif.$cycl_to_kif_error_method$.bind((SubLObject)kif.$kw4$ABORT, thread);
                write_kb_to_kif_file_preamble(stream_$1);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)kif.$str18$Converting_KB_to_KIF;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)kif.ZERO_INTEGER;
                assert kif.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kif.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kif.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kif.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$4 = idx;
                        if (kif.NIL == id_index.id_index_objects_empty_p(idx_$4, (SubLObject)kif.$kw19$SKIP)) {
                            final SubLObject idx_$5 = idx_$4;
                            if (kif.NIL == id_index.id_index_dense_objects_empty_p(idx_$5, (SubLObject)kif.$kw19$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = (SubLObject)kif.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion;
                                SubLObject ignore_errors_tag;
                                SubLObject _prev_bind_0_$3;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kif.NIL, v_iteration = (SubLObject)kif.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kif.ONE_INTEGER)) {
                                    a_id = ((kif.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kif.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (kif.NIL == id_index.id_index_tombstone_p(a_handle) || kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) {
                                        if (kif.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)kif.$kw19$SKIP;
                                        }
                                        assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        ignore_errors_tag = (SubLObject)kif.NIL;
                                        try {
                                            thread.throwStack.push(kif.$kw20$IGNORE_ERRORS_TARGET);
                                            _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kif.$sym21$IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    assertion_kif_formula_to_stream(assertion, stream_$1);
                                                }
                                                catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, (SubLObject)kif.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kif.$kw20$IGNORE_ERRORS_TARGET);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kif.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx_$4;
                            if (kif.NIL == id_index.id_index_sparse_objects_empty_p(idx_$6) || kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$6);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$6);
                                final SubLObject v_default = (SubLObject)((kif.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) ? kif.NIL : kif.$kw19$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP) || kif.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        SubLObject ignore_errors_tag2 = (SubLObject)kif.NIL;
                                        try {
                                            thread.throwStack.push(kif.$kw20$IGNORE_ERRORS_TARGET);
                                            final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kif.$sym21$IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    assertion_kif_formula_to_stream(assertion2, stream_$1);
                                                }
                                                catch (Throwable catch_var2) {
                                                    Errors.handleThrowable(catch_var2, (SubLObject)kif.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var2) {
                                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kif.$kw20$IGNORE_ERRORS_TARGET);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kif.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)kif.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kif.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                }
                written = (SubLObject)kif.T;
            }
            finally {
                kif.$cycl_to_kif_error_method$.rebind(_prev_bind_2, thread);
                kif.$kif_term_print_method$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kif.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kif.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 3573L)
    public static SubLObject write_mt_to_kif_file(final SubLObject mt, final SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == kif.UNPROVIDED) {
            kif_term_print_method = (SubLObject)kif.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kif.NIL != hlmt.hlmt_p(mt) : mt;
        assert kif.NIL != Types.stringp(filename) : filename;
        SubLObject written = (SubLObject)kif.NIL;
        SubLObject stream = (SubLObject)kif.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)kif.$kw16$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kif.$str17$Unable_to_open__S, filename);
            }
            final SubLObject stream_$10 = stream;
            misc_utilities.write_kb_content_copyright_notice(stream_$10);
            final SubLObject print_method = kif_term_print_method;
            final SubLObject _prev_bind_0 = kif.$kif_term_print_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kif.$cycl_to_kif_error_method$.currentBinding(thread);
            try {
                kif.$kif_term_print_method$.bind((kif.NIL != print_method) ? print_method : kif.$kif_term_print_method$.getDynamicValue(thread), thread);
                kif.$cycl_to_kif_error_method$.bind((SubLObject)kif.$kw4$ABORT, thread);
                write_mt_to_kif_file_preamble(mt, stream_$10);
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql((SubLObject)kif.$kw23$MT)) {
                    if (kif.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)kif.NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                        SubLObject final_index_iterator = (SubLObject)kif.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kif.NIL, (SubLObject)kif.NIL, (SubLObject)kif.NIL);
                            SubLObject done_var = (SubLObject)kif.NIL;
                            final SubLObject token_var = (SubLObject)kif.NIL;
                            while (kif.NIL == done_var) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                                if (kif.NIL != valid) {
                                    SubLObject ignore_errors_tag = (SubLObject)kif.NIL;
                                    try {
                                        thread.throwStack.push(kif.$kw20$IGNORE_ERRORS_TARGET);
                                        final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kif.$sym21$IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                assertion_kif_formula_to_stream(assertion, stream_$10);
                                            }
                                            catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, (SubLObject)kif.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kif.$kw20$IGNORE_ERRORS_TARGET);
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kif.NIL == valid);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kif.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kif.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)kif.$kw24$BROAD_MT) && kif.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)kif.NIL)) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)kif.$str25$do_broad_mt_index;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kif.ZERO_INTEGER;
                    assert kif.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kif.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kif.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kif.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$15 = idx;
                            if (kif.NIL == id_index.id_index_objects_empty_p(idx_$15, (SubLObject)kif.$kw19$SKIP)) {
                                final SubLObject idx_$16 = idx_$15;
                                if (kif.NIL == id_index.id_index_dense_objects_empty_p(idx_$16, (SubLObject)kif.$kw19$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                                    final SubLObject backwardP_var = (SubLObject)kif.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject assertion2;
                                    SubLObject ignore_errors_tag2;
                                    SubLObject _prev_bind_0_$14;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kif.NIL, v_iteration = (SubLObject)kif.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kif.ONE_INTEGER)) {
                                        a_id = ((kif.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kif.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (kif.NIL == id_index.id_index_tombstone_p(a_handle) || kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) {
                                            if (kif.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)kif.$kw19$SKIP;
                                            }
                                            assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (kif.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, (SubLObject)kif.NIL, (SubLObject)kif.NIL)) {
                                                ignore_errors_tag2 = (SubLObject)kif.NIL;
                                                try {
                                                    thread.throwStack.push(kif.$kw20$IGNORE_ERRORS_TARGET);
                                                    _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kif.$sym21$IGNORE_ERRORS_HANDLER), thread);
                                                        try {
                                                            assertion_kif_formula_to_stream(assertion2, stream_$10);
                                                        }
                                                        catch (Throwable catch_var2) {
                                                            Errors.handleThrowable(catch_var2, (SubLObject)kif.NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                }
                                                catch (Throwable ccatch_env_var2) {
                                                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kif.$kw20$IGNORE_ERRORS_TARGET);
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)kif.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$17 = idx_$15;
                                if (kif.NIL == id_index.id_index_sparse_objects_empty_p(idx_$17) || kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$17);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$17);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$17);
                                    final SubLObject v_default = (SubLObject)((kif.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP)) ? kif.NIL : kif.$kw19$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (kif.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kif.$kw19$SKIP) || kif.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (kif.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, (SubLObject)kif.NIL, (SubLObject)kif.NIL)) {
                                                SubLObject ignore_errors_tag3 = (SubLObject)kif.NIL;
                                                try {
                                                    thread.throwStack.push(kif.$kw20$IGNORE_ERRORS_TARGET);
                                                    final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kif.$sym21$IGNORE_ERRORS_HANDLER), thread);
                                                        try {
                                                            assertion_kif_formula_to_stream(assertion3, stream_$10);
                                                        }
                                                        catch (Throwable catch_var3) {
                                                            Errors.handleThrowable(catch_var3, (SubLObject)kif.NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                                catch (Throwable ccatch_env_var3) {
                                                    ignore_errors_tag3 = Errors.handleThrowable(ccatch_env_var3, (SubLObject)kif.$kw20$IGNORE_ERRORS_TARGET);
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)kif.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)kif.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kif.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                written = (SubLObject)kif.T;
            }
            finally {
                kif.$cycl_to_kif_error_method$.rebind(_prev_bind_2, thread);
                kif.$kif_term_print_method$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kif.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kif.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 4142L)
    public static SubLObject assertion_kif_formula_to_stream(final SubLObject assertion, SubLObject stream) {
        if (stream == kif.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert kif.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject kif_spec = assertion_kif_formula(assertion);
        if (kif.NIL != kif_spec) {
            final SubLObject current;
            final SubLObject datum = current = kif_spec;
            SubLObject allow_other_keys_p = (SubLObject)kif.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)kif.NIL;
            SubLObject current_$21 = (SubLObject)kif.NIL;
            while (kif.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kif.$list27);
                current_$21 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kif.$list27);
                if (kif.NIL == conses_high.member(current_$21, (SubLObject)kif.$list28, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED)) {
                    bad = (SubLObject)kif.T;
                }
                if (current_$21 == kif.$kw29$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (kif.NIL != bad && kif.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kif.$list27);
            }
            final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw30$DIRECTION, current);
            final SubLObject direction = (SubLObject)((kif.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kif.NIL);
            final SubLObject monotonicity_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw31$MONOTONICITY, current);
            final SubLObject monotonicity = (SubLObject)((kif.NIL != monotonicity_tail) ? conses_high.cadr(monotonicity_tail) : kif.NIL);
            final SubLObject microtheory_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw32$MICROTHEORY, current);
            final SubLObject microtheory = (SubLObject)((kif.NIL != microtheory_tail) ? conses_high.cadr(microtheory_tail) : kif.NIL);
            final SubLObject creator_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw33$CREATOR, current);
            final SubLObject creator = (SubLObject)((kif.NIL != creator_tail) ? conses_high.cadr(creator_tail) : kif.NIL);
            final SubLObject creation_date_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw34$CREATION_DATE, current);
            final SubLObject creation_date = (SubLObject)((kif.NIL != creation_date_tail) ? conses_high.cadr(creation_date_tail) : kif.NIL);
            final SubLObject kif_tail = cdestructuring_bind.property_list_member((SubLObject)kif.$kw35$KIF, current);
            final SubLObject v_kif = (SubLObject)((kif.NIL != kif_tail) ? conses_high.cadr(kif_tail) : kif.NIL);
            PrintLow.format(stream, (SubLObject)kif.$str36$_____);
            PrintLow.format(stream, (SubLObject)kif.$str37$_DIRECTION__S, direction);
            PrintLow.format(stream, (SubLObject)kif.$str38$__MONOTONICITY__S, monotonicity);
            PrintLow.format(stream, (SubLObject)kif.$str39$__CREATOR__S, creator);
            PrintLow.format(stream, (SubLObject)kif.$str40$__CREATION_DATE__S, creation_date);
            PrintLow.format(stream, (SubLObject)kif.$str41$____MICROTHEORY__S, microtheory);
            PrintLow.format(stream, (SubLObject)kif.$str42$____KIF);
            format_cycl_expression.format_cycl_expression(v_kif, stream, (SubLObject)kif.ONE_INTEGER);
            PrintLow.format(stream, (SubLObject)kif.$str43$___);
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 4937L)
    public static SubLObject assertion_kif_formula(final SubLObject assertion) {
        assert kif.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (kif.NIL != assertions_high.valid_assertion(assertion, (SubLObject)kif.UNPROVIDED)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            if (kif.NIL != el_formula) {
                final SubLObject kif_formula = cycl_to_kif(el_formula);
                if (kif.NIL != kif_formula) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject kif_mt = cycl_to_kif(mt);
                    if (kif.NIL != kif_mt) {
                        final SubLObject direction = assertions_high.assertion_direction(assertion);
                        final SubLObject strength = assertions_high.assertion_strength(assertion);
                        SubLObject asserted_by = (SubLObject)kif.NIL;
                        SubLObject asserted_when = (SubLObject)kif.NIL;
                        if (kif.NIL != assertions_high.asserted_assertionP(assertion)) {
                            asserted_by = assertions_high.asserted_by(assertion);
                            asserted_when = assertions_high.asserted_when(assertion);
                            if (kif.NIL != asserted_by) {
                                asserted_by = cycl_to_kif(asserted_by);
                            }
                        }
                        if (kif.NIL != kif_formula && kif.NIL != kif_mt) {
                            return (SubLObject)ConsesLow.list(new SubLObject[] { kif.$kw30$DIRECTION, direction, kif.$kw31$MONOTONICITY, strength, kif.$kw32$MICROTHEORY, kif_mt, kif.$kw33$CREATOR, asserted_by, kif.$kw34$CREATION_DATE, asserted_when, kif.$kw35$KIF, kif_formula });
                        }
                    }
                }
            }
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 5986L)
    public static SubLObject meld_to_kif(final SubLObject meld) {
        return cycl_to_kif(meld);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6127L)
    public static SubLObject cycl_to_kif(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kif.NIL;
        SubLObject catch_var = (SubLObject)kif.NIL;
        try {
            thread.throwStack.push(kif.$kw1$ABORT_CYCL_TO_KIF);
            final SubLObject _prev_bind_0 = kif.$additional_kif_definitions$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kif.$within_cycl_to_kif$.currentBinding(thread);
            try {
                kif.$additional_kif_definitions$.bind((SubLObject)kif.NIL, thread);
                kif.$within_cycl_to_kif$.bind((SubLObject)kif.T, thread);
                final SubLObject v_kif = cycl_formula_to_kif(cycl);
                final SubLObject definitions = additional_kif_definitions();
                if (kif.NIL != definitions) {
                    v_answer = reader.bq_cons(v_kif, ConsesLow.append(definitions, (SubLObject)kif.NIL));
                }
                else {
                    v_answer = v_kif;
                }
            }
            finally {
                kif.$within_cycl_to_kif$.rebind(_prev_bind_2, thread);
                kif.$additional_kif_definitions$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)kif.$kw1$ABORT_CYCL_TO_KIF);
        }
        finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6600L)
    public static SubLObject write_kb_to_kif_file_preamble(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(stream, kif.$kb_to_kif_file_preamble$.getDynamicValue(thread), numeric_date_utilities.timestring((SubLObject)kif.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6823L)
    public static SubLObject write_mt_to_kif_file_preamble(final SubLObject mt, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(stream, kif.$mt_to_kif_file_preamble$.getDynamicValue(thread), mt, numeric_date_utilities.timestring((SubLObject)kif.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 6989L)
    public static SubLObject write_kif_term_mixed_case(final SubLObject print_string, final SubLObject stream) {
        return print_high.princ(print_string, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 7213L)
    public static SubLObject write_kif_term_upcase(final SubLObject print_string, final SubLObject stream) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(print_string), i = (SubLObject)kif.NIL, i = (SubLObject)kif.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)kif.ONE_INTEGER)) {
            streams_high.write_char(Characters.char_upcase(Strings.sublisp_char(print_string, i)), stream);
        }
        return print_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 7435L)
    public static SubLObject write_kif_term_downcase(final SubLObject print_string, final SubLObject stream) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(print_string), i = (SubLObject)kif.NIL, i = (SubLObject)kif.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)kif.ONE_INTEGER)) {
            streams_high.write_char(Characters.char_downcase(Strings.sublisp_char(print_string, i)), stream);
        }
        return print_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 7661L)
    public static SubLObject write_kif_term_hyphen_mixed_case(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, (SubLObject)kif.IDENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 7852L)
    public static SubLObject write_kif_term_hyphen_upcase(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, (SubLObject)kif.$sym46$CHAR_UPCASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 8040L)
    public static SubLObject write_kif_term_hyphen_downcase(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, (SubLObject)kif.$sym47$CHAR_DOWNCASE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 8232L)
    public static SubLObject write_kif_term_hyphenate(final SubLObject print_string, final SubLObject stream, final SubLObject char_conversion_func) {
        final SubLObject length = Sequences.length(print_string);
        SubLObject last_char = (SubLObject)kif.NIL;
        SubLObject this_char = (SubLObject)kif.NIL;
        SubLObject index;
        for (index = (SubLObject)kif.NIL, index = (SubLObject)kif.ZERO_INTEGER; !index.numE(length); index = Numbers.add(index, (SubLObject)kif.ONE_INTEGER)) {
            last_char = this_char;
            this_char = Strings.sublisp_char(print_string, index);
            if (kif.NIL != write_kif_term_insert_hyphen(last_char, this_char)) {
                streams_high.write_char((SubLObject)Characters.CHAR_hyphen, stream);
            }
            streams_high.write_char(Functions.funcall(char_conversion_func, this_char), stream);
        }
        return print_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 8706L)
    public static SubLObject write_kif_term_insert_hyphen(final SubLObject last_char, final SubLObject this_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kif.NIL != last_char && kif.NIL != this_char && ((kif.NIL != Characters.alpha_char_p(last_char) && kif.NIL != Characters.digit_char_p(this_char, (SubLObject)kif.UNPROVIDED)) || (kif.NIL != Characters.digit_char_p(last_char, (SubLObject)kif.UNPROVIDED) && kif.NIL != Characters.alpha_char_p(this_char)) || (kif.NIL != Characters.lower_case_p(last_char) && kif.NIL != Characters.upper_case_p(this_char))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 9231L)
    public static SubLObject cycl_to_kif_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == kif.UNPROVIDED) {
            arg1 = (SubLObject)kif.NIL;
        }
        if (arg2 == kif.UNPROVIDED) {
            arg2 = (SubLObject)kif.NIL;
        }
        if (arg3 == kif.UNPROVIDED) {
            arg3 = (SubLObject)kif.NIL;
        }
        if (arg4 == kif.UNPROVIDED) {
            arg4 = (SubLObject)kif.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = kif.$cycl_to_kif_error_method$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)kif.$kw4$ABORT)) {
            abort_cycl_to_kif();
        }
        else if (!pcase_var.eql((SubLObject)kif.$kw48$IGNORE)) {
            if (pcase_var.eql((SubLObject)kif.$kw49$WARN)) {
                Functions.funcall(Symbols.symbol_function((SubLObject)kif.$sym50$WARN), format_string, arg1, arg2, arg3, arg4);
            }
            else if (pcase_var.eql((SubLObject)kif.$kw51$CERROR)) {
                Functions.funcall(Symbols.symbol_function((SubLObject)kif.$sym52$CERROR), (SubLObject)kif.$str53$Use_NIL, format_string, arg1, arg2, arg3, arg4);
            }
            else if (pcase_var.eql((SubLObject)kif.$kw54$ERROR)) {
                Functions.funcall(Symbols.symbol_function((SubLObject)kif.$sym55$ERROR), format_string, arg1, arg2, arg3, arg4);
            }
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 9788L)
    public static SubLObject cycl_to_kif_check(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)kif.NIL;
        SubLObject pred = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list56);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list56);
        pred = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)kif.$sym57$PUNLESS, (SubLObject)kif.$sym58$_SUSPEND_TYPE_CHECKING__, (SubLObject)ConsesLow.list((SubLObject)kif.$sym57$PUNLESS, (SubLObject)ConsesLow.list(pred, v_object), (SubLObject)ConsesLow.list((SubLObject)kif.$sym59$CYCL_TO_KIF_ERROR, (SubLObject)kif.$str60$_A_is_not_a__A, v_object, (SubLObject)ConsesLow.list((SubLObject)kif.$sym61$QUOTE, pred))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kif.$list56);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 9982L)
    public static SubLObject register_kif_definition(final SubLObject kif_definition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kif.NIL != kif.$within_cycl_to_kif$.getDynamicValue(thread)) {
            kif.$additional_kif_definitions$.setDynamicValue((SubLObject)ConsesLow.cons(kif_definition, kif.$additional_kif_definitions$.getDynamicValue(thread)), thread);
            return (SubLObject)kif.T;
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10185L)
    public static SubLObject additional_kif_definitions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kif.NIL != kif.$within_cycl_to_kif$.getDynamicValue(thread)) {
            final SubLObject definitions = kif.$additional_kif_definitions$.getDynamicValue(thread);
            return definitions;
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject kif_term_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kif_term(v_object, stream, (SubLObject)kif.ZERO_INTEGER);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject kif_term_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kif_term_native.class) ? kif.T : kif.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject kif_print_string(final SubLObject v_object) {
        assert kif.NIL != kif_term_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject _csetf_kif_print_string(final SubLObject v_object, final SubLObject value) {
        assert kif.NIL != kif_term_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject make_kif_term(SubLObject arglist) {
        if (arglist == kif.UNPROVIDED) {
            arglist = (SubLObject)kif.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kif_term_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kif.NIL, next = arglist; kif.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kif.$kw73$PRINT_STRING)) {
                _csetf_kif_print_string(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kif.$str74$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject visit_defstruct_kif_term(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kif.$kw75$BEGIN, (SubLObject)kif.$sym76$MAKE_KIF_TERM, (SubLObject)kif.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kif.$kw77$SLOT, (SubLObject)kif.$kw73$PRINT_STRING, kif_print_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kif.$kw78$END, (SubLObject)kif.$sym76$MAKE_KIF_TERM, (SubLObject)kif.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10344L)
    public static SubLObject visit_defstruct_object_kif_term_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kif_term(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10525L)
    public static SubLObject sxhash_kif_term_method(final SubLObject v_object) {
        return Sxhash.sxhash(kif_print_string(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 10612L)
    public static SubLObject print_kif_term(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject print_string = kif_print_string(v_object);
        Functions.funcall(kif.$kif_term_print_method$.getDynamicValue(thread), print_string, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 11020L)
    public static SubLObject cycl_to_kif_standard_mapping(final SubLObject cycl_term, final SubLObject print_string) {
        if (kif.NIL != kif.$kif_term_table$.getGlobalValue()) {
            Hashtables.remhash(cycl_term, kif.$kif_term_table$.getGlobalValue());
        }
        return intern_kif_term(cycl_term, print_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 11305L)
    public static SubLObject find_kif_term(final SubLObject cycl_term) {
        if (kif.NIL != kif.$kif_term_table$.getGlobalValue()) {
            return Values.values(Hashtables.gethash(cycl_term, kif.$kif_term_table$.getGlobalValue(), (SubLObject)kif.UNPROVIDED));
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 11516L)
    public static SubLObject intern_kif_term(final SubLObject cycl_term, SubLObject print_string) {
        if (print_string == kif.UNPROVIDED) {
            print_string = (SubLObject)kif.NIL;
        }
        SubLObject kif_term = find_kif_term(cycl_term);
        if (kif.NIL == kif_term) {
            kif_term = new_kif_term(string_for_kif_term(cycl_term, print_string));
            note_kif_term(cycl_term, kif_term);
        }
        return kif_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 11944L)
    public static SubLObject note_kif_term(final SubLObject cycl_term, final SubLObject kif_term) {
        assert kif.NIL != kif_term_p(kif_term) : kif_term;
        if (kif.NIL == kif.$kif_term_table$.getGlobalValue()) {
            kif.$kif_term_table$.setGlobalValue(Hashtables.make_hash_table(constant_handles.constant_count(), (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED));
        }
        Hashtables.sethash(cycl_term, kif.$kif_term_table$.getGlobalValue(), kif_term);
        return kif_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 12275L)
    public static SubLObject new_kif_term(final SubLObject print_string) {
        final SubLObject kif_term = make_kif_term((SubLObject)kif.UNPROVIDED);
        _csetf_kif_print_string(kif_term, print_string);
        return kif_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 12431L)
    public static SubLObject string_for_kif_term(final SubLObject cycl_term, SubLObject print_string) {
        if (print_string == kif.UNPROVIDED) {
            print_string = (SubLObject)kif.NIL;
        }
        if (print_string.isString()) {
            return print_string;
        }
        if (kif.NIL != constant_handles.constant_p(cycl_term)) {
            return constants_high.constant_name(cycl_term);
        }
        if (cycl_term.isString()) {
            return cycl_term;
        }
        if (cycl_term.isSymbol()) {
            return Symbols.symbol_name(cycl_term);
        }
        return print_high.princ_to_string(cycl_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 13044L)
    public static SubLObject cycl_to_kif_method(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kif.NIL != kif.$cycl_to_kif_method_table$.getDynamicValue(thread) && kif.NIL != cycl_to_kif_functor_p(cycl_term)) {
            return Hashtables.gethash(cycl_to_kif_functor_string(cycl_term), kif.$cycl_to_kif_method_table$.getDynamicValue(thread), (SubLObject)kif.UNPROVIDED);
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 13345L)
    public static SubLObject register_cycl_to_kif_method(final SubLObject cycl_term, final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kif.NIL != cycl_to_kif_functor_p(cycl_term) : cycl_term;
        assert kif.NIL != Types.symbolp(function_symbol) : function_symbol;
        if (kif.NIL == kif.$cycl_to_kif_method_table$.getDynamicValue(thread)) {
            kif.$cycl_to_kif_method_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)kif.$int84$50, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED), thread);
        }
        Hashtables.sethash(cycl_to_kif_functor_string(cycl_term), kif.$cycl_to_kif_method_table$.getDynamicValue(thread), function_symbol);
        return function_symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 13830L)
    public static SubLObject deregister_cycl_to_kif_method(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kif.NIL != cycl_to_kif_functor_p(cycl_term) : cycl_term;
        if (kif.NIL != kif.$cycl_to_kif_method_table$.getDynamicValue(thread)) {
            return Hashtables.remhash(cycl_to_kif_functor_string(cycl_term), kif.$cycl_to_kif_method_table$.getDynamicValue(thread));
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 14118L)
    public static SubLObject cycl_to_kif_functor_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kif.NIL != constant_handles.constant_p(v_object) || kif.NIL != predefined_kif_symbol(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 14237L)
    public static SubLObject predefined_kif_symbol(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && !v_object.isKeyword() && kif.NIL == cycl_variables.el_varP(v_object) && kif.NIL != find_kif_term(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 14408L)
    public static SubLObject cycl_to_kif_functor_string(final SubLObject functor) {
        assert kif.NIL != cycl_to_kif_functor_p(functor) : functor;
        if (kif.NIL != constant_handles.constant_p(functor)) {
            return constants_high.constant_name(functor);
        }
        if (functor.isSymbol()) {
            return Symbols.symbol_name(functor);
        }
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 14637L)
    public static SubLObject define_cycl_to_kif_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = (SubLObject)kif.NIL;
        SubLObject arglist = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list85);
        cycl_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kif.$list85);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject name = Strings.string_upcase((SubLObject)((kif.NIL != constant_handles.constant_p(cycl_term)) ? constants_high.constant_name(cycl_term) : (cycl_term.isSymbol() ? Symbols.symbol_name(cycl_term) : kif.NIL)), (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
        final SubLObject function_name = PrintLow.format((SubLObject)kif.NIL, (SubLObject)kif.$str86$CYCL_TO_KIF__A_METHOD, name);
        final SubLObject function = Packages.intern(function_name, (SubLObject)kif.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)kif.$sym87$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kif.$sym88$DEFINE_PRIVATE, function, arglist, ConsesLow.append(body, (SubLObject)kif.NIL)), (SubLObject)ConsesLow.list((SubLObject)kif.$sym89$REGISTER_CYCL_TO_KIF_METHOD, (SubLObject)ConsesLow.list((SubLObject)kif.$sym61$QUOTE, cycl_term), (SubLObject)ConsesLow.list((SubLObject)kif.$sym61$QUOTE, function)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 15179L)
    public static SubLObject cycl_formula_to_kif(final SubLObject formula) {
        if (formula.isAtom()) {
            return cycl_1_term_to_kif(formula);
        }
        final SubLObject functor = formula.first();
        final SubLObject method = cycl_to_kif_method(functor);
        if (kif.NIL != method) {
            return Functions.funcall(method, formula);
        }
        return cycl_atomic_sentence_to_kif(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 15616L)
    public static SubLObject cycl_atomic_sentence_to_kif(final SubLObject atomic_sentence) {
        SubLObject predicate = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(atomic_sentence, atomic_sentence, (SubLObject)kif.$list90);
        predicate = atomic_sentence.first();
        SubLObject v_arguments;
        final SubLObject current = v_arguments = atomic_sentence.rest();
        predicate = cycl_rep_1_term_to_kif(predicate);
        v_arguments = cycl_atomic_sentence_args_to_kif(v_arguments);
        if (kif.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kif.$sym91$EL_VAR_), predicate, (SubLObject)kif.UNPROVIDED)) {
            final SubLObject true_sentence = cycl_constant_to_kif(kif.$const92$trueSentence);
            return (SubLObject)ConsesLow.list(true_sentence, reader.bq_cons(predicate, ConsesLow.append(v_arguments, (SubLObject)kif.NIL)));
        }
        return reader.bq_cons(predicate, ConsesLow.append(v_arguments, (SubLObject)kif.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 16110L)
    public static SubLObject cycl_atomic_sentence_args_to_kif(final SubLObject v_arguments) {
        if (kif.NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)kif.$sym93$CYCL_2_TERM_TO_KIF), v_arguments);
        }
        return cycl_atomic_sentence_args_to_kif_recursive(v_arguments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 16390L)
    public static SubLObject cycl_atomic_sentence_args_to_kif_recursive(final SubLObject v_arguments) {
        if (kif.NIL == v_arguments) {
            return (SubLObject)kif.NIL;
        }
        if (kif.NIL != cycl_variables.el_varP(v_arguments)) {
            return (SubLObject)ConsesLow.list(cycl_dotted_el_var_to_kif(v_arguments));
        }
        if (v_arguments.isAtom()) {
            cycl_to_kif_error((SubLObject)kif.$str94$Expecting_a_variable___S, v_arguments, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            return (SubLObject)kif.NIL;
        }
        final SubLObject first = cycl_2_term_to_kif(v_arguments.first());
        final SubLObject rest = cycl_atomic_sentence_args_to_kif_recursive(v_arguments.rest());
        return reader.bq_cons(first, ConsesLow.append(rest, (SubLObject)kif.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 16957L)
    public static SubLObject cycl_2_term_to_kif(final SubLObject v_term) {
        return cycl_1_term_to_kif(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 17089L)
    public static SubLObject cycl_1_term_to_kif(final SubLObject v_term) {
        if (v_term.isString() || v_term.isNumber() || v_term.isChar()) {
            return v_term;
        }
        if (v_term.isSymbol() && (v_term.isKeyword() || (kif.NIL == cycl_variables.el_varP(v_term) && kif.NIL == find_kif_term(v_term)))) {
            return v_term;
        }
        return cycl_rep_1_term_to_kif(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 17463L)
    public static SubLObject cycl_rep_1_term_to_kif(final SubLObject v_term) {
        if (kif.NIL != constant_handles.constant_p(v_term)) {
            return cycl_constant_to_kif(v_term);
        }
        if (kif.NIL != nart_handles.nart_p(v_term)) {
            return cycl_rep_1_term_to_kif(narts_high.nart_el_formula(v_term));
        }
        if (kif.NIL != cycl_variables.el_varP(v_term)) {
            return cycl_el_variable_to_kif(v_term);
        }
        if (v_term.isCons()) {
            final SubLObject function = v_term.first();
            final SubLObject method = cycl_to_kif_method(function);
            if (kif.NIL != method) {
                return Functions.funcall(method, v_term);
            }
            return cycl_function_exp_to_kif(v_term);
        }
        else {
            if (v_term.isSymbol() && !v_term.isKeyword() && kif.NIL != find_kif_term(v_term)) {
                return find_kif_term(v_term);
            }
            cycl_to_kif_error((SubLObject)kif.$str95$Invalid_represented_first_order_t, v_term, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            return (SubLObject)kif.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 18179L)
    public static SubLObject cycl_function_exp_to_kif(final SubLObject function_expression) {
        SubLObject function = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(function_expression, function_expression, (SubLObject)kif.$list96);
        function = function_expression.first();
        final SubLObject v_arguments;
        final SubLObject current = v_arguments = function_expression.rest();
        return (SubLObject)ConsesLow.cons(cycl_rep_1_term_to_kif(function), cycl_function_exp_args_to_kif(v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 18465L)
    public static SubLObject cycl_function_exp_args_to_kif(final SubLObject v_arguments) {
        if (kif.NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)kif.$sym93$CYCL_2_TERM_TO_KIF), v_arguments);
        }
        return cycl_function_exp_args_to_kif_recursive(v_arguments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 18743L)
    public static SubLObject cycl_function_exp_args_to_kif_recursive(final SubLObject v_arguments) {
        if (kif.NIL == v_arguments) {
            return (SubLObject)kif.NIL;
        }
        if (kif.NIL != cycl_variables.el_varP(v_arguments)) {
            return (SubLObject)ConsesLow.list(cycl_dotted_el_var_to_kif(v_arguments));
        }
        if (v_arguments.isAtom()) {
            cycl_to_kif_error((SubLObject)kif.$str94$Expecting_a_variable___S, v_arguments, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            return (SubLObject)kif.NIL;
        }
        final SubLObject first = cycl_2_term_to_kif(v_arguments.first());
        final SubLObject rest = cycl_function_exp_args_to_kif_recursive(v_arguments.rest());
        return reader.bq_cons(first, ConsesLow.append(rest, (SubLObject)kif.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 19301L)
    public static SubLObject cycl_constant_to_kif(final SubLObject constant) {
        return intern_kif_term(constant, (SubLObject)kif.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 19426L)
    public static SubLObject cycl_el_variable_to_kif(final SubLObject el_variable) {
        return el_variable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 19545L)
    public static SubLObject cycl_dotted_el_var_to_kif(final SubLObject el_variable) {
        final SubLObject name = string_utilities.copy_string(Symbols.symbol_name(el_variable));
        Strings.set_char(name, (SubLObject)kif.ZERO_INTEGER, (SubLObject)Characters.CHAR_at);
        return Values.values(Packages.intern(name, (SubLObject)kif.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 20256L)
    public static SubLObject cycl_to_kif_not_method(final SubLObject formula) {
        SubLObject not = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list103);
        not = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list103);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            not = cycl_constant_to_kif(kif.$const101$not);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(not, subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list103);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 20547L)
    public static SubLObject cycl_to_kif_and_method(final SubLObject formula) {
        SubLObject and = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list107);
        and = formula.first();
        SubLObject subformulas;
        final SubLObject current = subformulas = formula.rest();
        and = cycl_constant_to_kif(kif.$const105$and);
        subformulas = Mapping.mapcar(Symbols.symbol_function((SubLObject)kif.$sym108$CYCL_FORMULA_TO_KIF), subformulas);
        return reader.bq_cons(and, ConsesLow.append(subformulas, (SubLObject)kif.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 20856L)
    public static SubLObject cycl_to_kif_or_method(final SubLObject formula) {
        SubLObject or = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list112);
        or = formula.first();
        SubLObject subformulas;
        final SubLObject current = subformulas = formula.rest();
        or = cycl_constant_to_kif(kif.$const110$or);
        subformulas = Mapping.mapcar(Symbols.symbol_function((SubLObject)kif.$sym108$CYCL_FORMULA_TO_KIF), subformulas);
        return reader.bq_cons(or, ConsesLow.append(subformulas, (SubLObject)kif.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 21164L)
    public static SubLObject cycl_to_kif_implies_method(final SubLObject formula) {
        SubLObject implies = (SubLObject)kif.NIL;
        SubLObject antecedent = (SubLObject)kif.NIL;
        SubLObject consequent = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list116);
        implies = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list116);
        antecedent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list116);
        consequent = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            implies = cycl_constant_to_kif(kif.$const114$implies);
            antecedent = cycl_formula_to_kif(antecedent);
            consequent = cycl_formula_to_kif(consequent);
            return (SubLObject)ConsesLow.list(implies, antecedent, consequent);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list116);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 21552L)
    public static SubLObject cycl_to_kif_equiv_method(final SubLObject formula) {
        SubLObject equiv = (SubLObject)kif.NIL;
        SubLObject antecedent = (SubLObject)kif.NIL;
        SubLObject consequent = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list120);
        equiv = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list120);
        antecedent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list120);
        consequent = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            equiv = cycl_constant_to_kif(kif.$const118$equiv);
            antecedent = cycl_formula_to_kif(antecedent);
            consequent = cycl_formula_to_kif(consequent);
            return (SubLObject)ConsesLow.list(equiv, antecedent, consequent);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list120);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 21881L)
    public static SubLObject cycl_to_kif_xor_method(final SubLObject formula) {
        SubLObject xor = (SubLObject)kif.NIL;
        SubLObject subformula1 = (SubLObject)kif.NIL;
        SubLObject subformula2 = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list122);
        xor = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list122);
        subformula1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list122);
        subformula2 = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            return cycl_formula_to_kif((SubLObject)ConsesLow.list(kif.$const118$equiv, subformula1, (SubLObject)ConsesLow.list(kif.$const101$not, subformula2)));
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list122);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 22115L)
    public static SubLObject cycl_to_kif_truesentence_method(final SubLObject formula) {
        SubLObject truesentence = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list125);
        truesentence = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list125);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            truesentence = cycl_constant_to_kif(kif.$const92$trueSentence);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(truesentence, subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list125);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 22514L)
    public static SubLObject cycl_to_kif_forall_method(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forall = (SubLObject)kif.NIL;
        SubLObject variable = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list129);
        forall = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list129);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list129);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            if (kif.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && kif.NIL == cycl_variables.el_varP(variable)) {
                cycl_to_kif_error((SubLObject)kif.$str60$_A_is_not_a__A, variable, (SubLObject)kif.$sym91$EL_VAR_, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            }
            forall = cycl_constant_to_kif(kif.$const127$forAll);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(forall, (SubLObject)ConsesLow.list(variable), subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list129);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 22948L)
    public static SubLObject cycl_to_kif_thereexists_method(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thereexists = (SubLObject)kif.NIL;
        SubLObject variable = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list133);
        thereexists = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list133);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list133);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            if (kif.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && kif.NIL == cycl_variables.el_varP(variable)) {
                cycl_to_kif_error((SubLObject)kif.$str60$_A_is_not_a__A, variable, (SubLObject)kif.$sym91$EL_VAR_, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            }
            thereexists = cycl_constant_to_kif(kif.$const131$thereExists);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(thereexists, (SubLObject)ConsesLow.list(variable), subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list133);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 23356L)
    public static SubLObject cycl_to_kif_thereexistexactly_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 23510L)
    public static SubLObject cycl_to_kif_thereexistatleast_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 23663L)
    public static SubLObject cycl_to_kif_thereexistatmost_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 23814L)
    public static SubLObject cycl_there_exists_variant_to_kif(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject there_exists_variant = (SubLObject)kif.NIL;
        SubLObject num = (SubLObject)kif.NIL;
        SubLObject variable = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list141);
        there_exists_variant = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list141);
        num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list141);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list141);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            if (kif.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && kif.NIL == cycl_variables.el_varP(variable)) {
                cycl_to_kif_error((SubLObject)kif.$str60$_A_is_not_a__A, variable, (SubLObject)kif.$sym91$EL_VAR_, (SubLObject)kif.UNPROVIDED, (SubLObject)kif.UNPROVIDED);
            }
            there_exists_variant = cycl_constant_to_kif(there_exists_variant);
            num = cycl_2_term_to_kif(num);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            final SubLObject true_sentence = cycl_constant_to_kif(kif.$const92$trueSentence);
            return (SubLObject)ConsesLow.list(true_sentence, (SubLObject)ConsesLow.list(there_exists_variant, num, variable, subformula));
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list141);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 24466L)
    public static SubLObject cycl_to_kif_ist_method(final SubLObject formula) {
        SubLObject ist = (SubLObject)kif.NIL;
        SubLObject mt = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list144);
        ist = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list144);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list144);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            ist = cycl_constant_to_kif(kif.$const145$ist);
            mt = cycl_2_term_to_kif(mt);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(ist, mt, subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list144);
        return (SubLObject)kif.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kif.lisp", position = 25069L)
    public static SubLObject cycl_to_kif_goals_method(final SubLObject formula) {
        SubLObject goals = (SubLObject)kif.NIL;
        SubLObject agent = (SubLObject)kif.NIL;
        SubLObject subformula = (SubLObject)kif.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)kif.$list147);
        goals = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list147);
        agent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)kif.$list147);
        subformula = current.first();
        current = current.rest();
        if (kif.NIL == current) {
            goals = cycl_constant_to_kif(kif.$const148$goals);
            agent = cycl_2_term_to_kif(agent);
            subformula = cycl_formula_to_kif(subformula);
            return (SubLObject)ConsesLow.list(goals, agent, subformula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)kif.$list147);
        return (SubLObject)kif.NIL;
    }
    
    public static SubLObject declare_kif_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kif", "until_cycl_to_kif_aborted", "UNTIL-CYCL-TO-KIF-ABORTED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "abort_cycl_to_kif", "ABORT-CYCL-TO-KIF", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kif", "writing_kif_file", "WRITING-KIF-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kb_to_kif_file", "WRITE-KB-TO-KIF-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_mt_to_kif_file", "WRITE-MT-TO-KIF-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "assertion_kif_formula_to_stream", "ASSERTION-KIF-FORMULA-TO-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "assertion_kif_formula", "ASSERTION-KIF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "meld_to_kif", "MELD-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif", "CYCL-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kb_to_kif_file_preamble", "WRITE-KB-TO-KIF-FILE-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_mt_to_kif_file_preamble", "WRITE-MT-TO-KIF-FILE-PREAMBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_mixed_case", "WRITE-KIF-TERM-MIXED-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_upcase", "WRITE-KIF-TERM-UPCASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_downcase", "WRITE-KIF-TERM-DOWNCASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_hyphen_mixed_case", "WRITE-KIF-TERM-HYPHEN-MIXED-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_hyphen_upcase", "WRITE-KIF-TERM-HYPHEN-UPCASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_hyphen_downcase", "WRITE-KIF-TERM-HYPHEN-DOWNCASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_hyphenate", "WRITE-KIF-TERM-HYPHENATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "write_kif_term_insert_hyphen", "WRITE-KIF-TERM-INSERT-HYPHEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_error", "CYCL-TO-KIF-ERROR", 1, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kif", "cycl_to_kif_check", "CYCL-TO-KIF-CHECK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "register_kif_definition", "REGISTER-KIF-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "additional_kif_definitions", "ADDITIONAL-KIF-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "kif_term_print_function_trampoline", "KIF-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "kif_term_p", "KIF-TERM-P", 1, 0, false);
        new $kif_term_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "kif_print_string", "KIF-PRINT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "_csetf_kif_print_string", "_CSETF-KIF-PRINT-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "make_kif_term", "MAKE-KIF-TERM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "visit_defstruct_kif_term", "VISIT-DEFSTRUCT-KIF-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "visit_defstruct_object_kif_term_method", "VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "sxhash_kif_term_method", "SXHASH-KIF-TERM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "print_kif_term", "PRINT-KIF-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_standard_mapping", "CYCL-TO-KIF-STANDARD-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "find_kif_term", "FIND-KIF-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "intern_kif_term", "INTERN-KIF-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "note_kif_term", "NOTE-KIF-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "new_kif_term", "NEW-KIF-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "string_for_kif_term", "STRING-FOR-KIF-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_method", "CYCL-TO-KIF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "register_cycl_to_kif_method", "REGISTER-CYCL-TO-KIF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "deregister_cycl_to_kif_method", "DEREGISTER-CYCL-TO-KIF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_functor_p", "CYCL-TO-KIF-FUNCTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "predefined_kif_symbol", "PREDEFINED-KIF-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_functor_string", "CYCL-TO-KIF-FUNCTOR-STRING", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kif", "define_cycl_to_kif_method", "DEFINE-CYCL-TO-KIF-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_formula_to_kif", "CYCL-FORMULA-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_atomic_sentence_to_kif", "CYCL-ATOMIC-SENTENCE-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_atomic_sentence_args_to_kif", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_atomic_sentence_args_to_kif_recursive", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_2_term_to_kif", "CYCL-2-TERM-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_1_term_to_kif", "CYCL-1-TERM-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_rep_1_term_to_kif", "CYCL-REP-1-TERM-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_function_exp_to_kif", "CYCL-FUNCTION-EXP-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_function_exp_args_to_kif", "CYCL-FUNCTION-EXP-ARGS-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_function_exp_args_to_kif_recursive", "CYCL-FUNCTION-EXP-ARGS-TO-KIF-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_constant_to_kif", "CYCL-CONSTANT-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_el_variable_to_kif", "CYCL-EL-VARIABLE-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_dotted_el_var_to_kif", "CYCL-DOTTED-EL-VAR-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_not_method", "CYCL-TO-KIF-NOT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_and_method", "CYCL-TO-KIF-AND-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_or_method", "CYCL-TO-KIF-OR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_implies_method", "CYCL-TO-KIF-IMPLIES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_equiv_method", "CYCL-TO-KIF-EQUIV-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_xor_method", "CYCL-TO-KIF-XOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_truesentence_method", "CYCL-TO-KIF-TRUESENTENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_forall_method", "CYCL-TO-KIF-FORALL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_thereexists_method", "CYCL-TO-KIF-THEREEXISTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_thereexistexactly_method", "CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_thereexistatleast_method", "CYCL-TO-KIF-THEREEXISTATLEAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_thereexistatmost_method", "CYCL-TO-KIF-THEREEXISTATMOST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_there_exists_variant_to_kif", "CYCL-THERE-EXISTS-VARIANT-TO-KIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_ist_method", "CYCL-TO-KIF-IST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kif", "cycl_to_kif_goals_method", "CYCL-TO-KIF-GOALS-METHOD", 1, 0, false);
        return (SubLObject)kif.NIL;
    }
    
    public static SubLObject init_kif_file() {
        kif.$within_cycl_to_kif$ = SubLFiles.defparameter("*WITHIN-CYCL-TO-KIF*", (SubLObject)kif.NIL);
        kif.$additional_kif_definitions$ = SubLFiles.defparameter("*ADDITIONAL-KIF-DEFINITIONS*", (SubLObject)kif.NIL);
        kif.$cycl_to_kif_error_method$ = SubLFiles.defparameter("*CYCL-TO-KIF-ERROR-METHOD*", (SubLObject)kif.$kw4$ABORT);
        kif.$default_kif_term_print_method$ = SubLFiles.defparameter("*DEFAULT-KIF-TERM-PRINT-METHOD*", (SubLObject)kif.$sym5$WRITE_KIF_TERM_MIXED_CASE);
        kif.$kif_term_print_method$ = SubLFiles.defparameter("*KIF-TERM-PRINT-METHOD*", kif.$default_kif_term_print_method$.getDynamicValue());
        kif.$kb_to_kif_file_preamble$ = SubLFiles.defparameter("*KB-TO-KIF-FILE-PREAMBLE*", (SubLObject)kif.$str44$_____KIF_assertion_specs_for_enti);
        kif.$mt_to_kif_file_preamble$ = SubLFiles.defparameter("*MT-TO-KIF-FILE-PREAMBLE*", (SubLObject)kif.$str45$_____KIF_assertion_specs_for_micr);
        kif.$dtp_kif_term$ = SubLFiles.defconstant("*DTP-KIF-TERM*", (SubLObject)kif.$sym62$KIF_TERM);
        kif.$kif_term_table$ = SubLFiles.deflexical("*KIF-TERM-TABLE*", (SubLObject)((kif.NIL != Symbols.boundp((SubLObject)kif.$sym81$_KIF_TERM_TABLE_)) ? kif.$kif_term_table$.getGlobalValue() : kif.NIL));
        kif.$cycl_to_kif_method_table$ = SubLFiles.defparameter("*CYCL-TO-KIF-METHOD-TABLE*", (SubLObject)kif.NIL);
        return (SubLObject)kif.NIL;
    }
    
    public static SubLObject setup_kif_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kif.$dtp_kif_term$.getGlobalValue(), Symbols.symbol_function((SubLObject)kif.$sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kif.$list70);
        Structures.def_csetf((SubLObject)kif.$sym71$KIF_PRINT_STRING, (SubLObject)kif.$sym72$_CSETF_KIF_PRINT_STRING);
        Equality.identity((SubLObject)kif.$sym62$KIF_TERM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kif.$dtp_kif_term$.getGlobalValue(), Symbols.symbol_function((SubLObject)kif.$sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), kif.$dtp_kif_term$.getGlobalValue(), Symbols.symbol_function((SubLObject)kif.$sym80$SXHASH_KIF_TERM_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)kif.$sym81$_KIF_TERM_TABLE_);
        cycl_to_kif_standard_mapping(kif.$const97$True, (SubLObject)kif.$str98$true);
        cycl_to_kif_standard_mapping(kif.$const99$False, (SubLObject)kif.$str100$false);
        cycl_to_kif_standard_mapping(kif.$const101$not, (SubLObject)kif.$str102$not);
        register_cycl_to_kif_method(kif.$const101$not, (SubLObject)kif.$sym104$CYCL_TO_KIF_NOT_METHOD);
        cycl_to_kif_standard_mapping(kif.$const105$and, (SubLObject)kif.$str106$and);
        register_cycl_to_kif_method(kif.$const105$and, (SubLObject)kif.$sym109$CYCL_TO_KIF_AND_METHOD);
        cycl_to_kif_standard_mapping(kif.$const110$or, (SubLObject)kif.$str111$or);
        register_cycl_to_kif_method(kif.$const110$or, (SubLObject)kif.$sym113$CYCL_TO_KIF_OR_METHOD);
        cycl_to_kif_standard_mapping(kif.$const114$implies, (SubLObject)kif.$str115$__);
        register_cycl_to_kif_method(kif.$const114$implies, (SubLObject)kif.$sym117$CYCL_TO_KIF_IMPLIES_METHOD);
        cycl_to_kif_standard_mapping(kif.$const118$equiv, (SubLObject)kif.$str119$___);
        register_cycl_to_kif_method(kif.$const118$equiv, (SubLObject)kif.$sym121$CYCL_TO_KIF_EQUIV_METHOD);
        register_cycl_to_kif_method(kif.$const123$xor, (SubLObject)kif.$sym124$CYCL_TO_KIF_XOR_METHOD);
        register_cycl_to_kif_method(kif.$const92$trueSentence, (SubLObject)kif.$sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD);
        cycl_to_kif_standard_mapping(kif.$const127$forAll, (SubLObject)kif.$str128$forall);
        register_cycl_to_kif_method(kif.$const127$forAll, (SubLObject)kif.$sym130$CYCL_TO_KIF_FORALL_METHOD);
        cycl_to_kif_standard_mapping(kif.$const131$thereExists, (SubLObject)kif.$str132$exists);
        register_cycl_to_kif_method(kif.$const131$thereExists, (SubLObject)kif.$sym134$CYCL_TO_KIF_THEREEXISTS_METHOD);
        register_cycl_to_kif_method(kif.$const135$thereExistExactly, (SubLObject)kif.$sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD);
        register_cycl_to_kif_method(kif.$const137$thereExistAtLeast, (SubLObject)kif.$sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD);
        register_cycl_to_kif_method(kif.$const139$thereExistAtMost, (SubLObject)kif.$sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD);
        cycl_to_kif_standard_mapping(kif.$const142$equals, (SubLObject)kif.$str143$_);
        register_cycl_to_kif_method(kif.$const145$ist, (SubLObject)kif.$sym146$CYCL_TO_KIF_IST_METHOD);
        register_cycl_to_kif_method(kif.$const148$goals, (SubLObject)kif.$sym149$CYCL_TO_KIF_GOALS_METHOD);
        cycl_to_kif_standard_mapping(kif.$const150$TheList, (SubLObject)kif.$str151$listof);
        return (SubLObject)kif.NIL;
    }
    
    public void declareFunctions() {
        declare_kif_file();
    }
    
    public void initializeVariables() {
        init_kif_file();
    }
    
    public void runTopLevelForms() {
        setup_kif_file();
    }
    
    static {
        me = (SubLFile)new kif();
        kif.$within_cycl_to_kif$ = null;
        kif.$additional_kif_definitions$ = null;
        kif.$cycl_to_kif_error_method$ = null;
        kif.$default_kif_term_print_method$ = null;
        kif.$kif_term_print_method$ = null;
        kif.$kb_to_kif_file_preamble$ = null;
        kif.$mt_to_kif_file_preamble$ = null;
        kif.$dtp_kif_term$ = null;
        kif.$kif_term_table$ = null;
        kif.$cycl_to_kif_method_table$ = null;
        $sym0$CCATCH_IGNORE = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $kw1$ABORT_CYCL_TO_KIF = SubLObjectFactory.makeKeyword("ABORT-CYCL-TO-KIF");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ADDITIONAL-KIF-DEFINITIONS*"), (SubLObject)kif.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-CYCL-TO-KIF*"), (SubLObject)kif.T));
        $kw4$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $sym5$WRITE_KIF_TERM_MIXED_CASE = SubLObjectFactory.makeSymbol("WRITE-KIF-TERM-MIXED-CASE");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("KIF-TERM-PRINT-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$PRINT_METHOD = SubLObjectFactory.makeUninternedSymbol("PRINT-METHOD");
        $sym8$WITH_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-TEXT-FILE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT"));
        $sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE = SubLObjectFactory.makeSymbol("WRITE-KB-CONTENT-COPYRIGHT-NOTICE");
        $sym11$_KIF_TERM_PRINT_METHOD_ = SubLObjectFactory.makeSymbol("*KIF-TERM-PRINT-METHOD*");
        $sym12$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KIF-TERM-PRINT-METHOD*"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCL-TO-KIF-ERROR-METHOD*"), (SubLObject)SubLObjectFactory.makeKeyword("ABORT")));
        $sym15$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw16$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str17$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str18$Converting_KB_to_KIF = SubLObjectFactory.makeString("Converting KB to KIF");
        $kw19$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw20$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym21$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym22$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw23$MT = SubLObjectFactory.makeKeyword("MT");
        $kw24$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str25$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym26$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MONOTONICITY"), (SubLObject)SubLObjectFactory.makeSymbol("MICROTHEORY"), (SubLObject)SubLObjectFactory.makeSymbol("CREATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CREATION-DATE"), (SubLObject)SubLObjectFactory.makeSymbol("KIF"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONICITY"), (SubLObject)SubLObjectFactory.makeKeyword("MICROTHEORY"), (SubLObject)SubLObjectFactory.makeKeyword("CREATOR"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION-DATE"), (SubLObject)SubLObjectFactory.makeKeyword("KIF"));
        $kw29$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw30$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw31$MONOTONICITY = SubLObjectFactory.makeKeyword("MONOTONICITY");
        $kw32$MICROTHEORY = SubLObjectFactory.makeKeyword("MICROTHEORY");
        $kw33$CREATOR = SubLObjectFactory.makeKeyword("CREATOR");
        $kw34$CREATION_DATE = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $kw35$KIF = SubLObjectFactory.makeKeyword("KIF");
        $str36$_____ = SubLObjectFactory.makeString("~%~%(");
        $str37$_DIRECTION__S = SubLObjectFactory.makeString(":DIRECTION ~S");
        $str38$__MONOTONICITY__S = SubLObjectFactory.makeString(" :MONOTONICITY ~S");
        $str39$__CREATOR__S = SubLObjectFactory.makeString(" :CREATOR ~S");
        $str40$__CREATION_DATE__S = SubLObjectFactory.makeString(" :CREATION-DATE ~S");
        $str41$____MICROTHEORY__S = SubLObjectFactory.makeString("~% :MICROTHEORY ~S");
        $str42$____KIF = SubLObjectFactory.makeString("~% :KIF");
        $str43$___ = SubLObjectFactory.makeString("~%)");
        $str44$_____KIF_assertion_specs_for_enti = SubLObjectFactory.makeString("\n\n;; KIF assertion-specs for entire KB\n;; ~A");
        $str45$_____KIF_assertion_specs_for_micr = SubLObjectFactory.makeString("\n\n;; KIF assertion-specs for microtheory : ~S\n;; ~A");
        $sym46$CHAR_UPCASE = SubLObjectFactory.makeSymbol("CHAR-UPCASE");
        $sym47$CHAR_DOWNCASE = SubLObjectFactory.makeSymbol("CHAR-DOWNCASE");
        $kw48$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw49$WARN = SubLObjectFactory.makeKeyword("WARN");
        $sym50$WARN = SubLObjectFactory.makeSymbol("WARN");
        $kw51$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $sym52$CERROR = SubLObjectFactory.makeSymbol("CERROR");
        $str53$Use_NIL = SubLObjectFactory.makeString("Use NIL");
        $kw54$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym55$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym57$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym58$_SUSPEND_TYPE_CHECKING__ = SubLObjectFactory.makeSymbol("*SUSPEND-TYPE-CHECKING?*");
        $sym59$CYCL_TO_KIF_ERROR = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-ERROR");
        $str60$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym61$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym62$KIF_TERM = SubLObjectFactory.makeSymbol("KIF-TERM");
        $sym63$KIF_TERM_P = SubLObjectFactory.makeSymbol("KIF-TERM-P");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-STRING"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRINT-STRING"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KIF-PRINT-STRING"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KIF-PRINT-STRING"));
        $sym68$PRINT_KIF_TERM = SubLObjectFactory.makeSymbol("PRINT-KIF-TERM");
        $sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KIF-TERM-PRINT-FUNCTION-TRAMPOLINE");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KIF-TERM-P"));
        $sym71$KIF_PRINT_STRING = SubLObjectFactory.makeSymbol("KIF-PRINT-STRING");
        $sym72$_CSETF_KIF_PRINT_STRING = SubLObjectFactory.makeSymbol("_CSETF-KIF-PRINT-STRING");
        $kw73$PRINT_STRING = SubLObjectFactory.makeKeyword("PRINT-STRING");
        $str74$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw75$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym76$MAKE_KIF_TERM = SubLObjectFactory.makeSymbol("MAKE-KIF-TERM");
        $kw77$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw78$END = SubLObjectFactory.makeKeyword("END");
        $sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD");
        $sym80$SXHASH_KIF_TERM_METHOD = SubLObjectFactory.makeSymbol("SXHASH-KIF-TERM-METHOD");
        $sym81$_KIF_TERM_TABLE_ = SubLObjectFactory.makeSymbol("*KIF-TERM-TABLE*");
        $sym82$CYCL_TO_KIF_FUNCTOR_P = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-FUNCTOR-P");
        $sym83$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $int84$50 = SubLObjectFactory.makeInteger(50);
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str86$CYCL_TO_KIF__A_METHOD = SubLObjectFactory.makeString("CYCL-TO-KIF-~A-METHOD");
        $sym87$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym88$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym89$REGISTER_CYCL_TO_KIF_METHOD = SubLObjectFactory.makeSymbol("REGISTER-CYCL-TO-KIF-METHOD");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym91$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const92$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $sym93$CYCL_2_TERM_TO_KIF = SubLObjectFactory.makeSymbol("CYCL-2-TERM-TO-KIF");
        $str94$Expecting_a_variable___S = SubLObjectFactory.makeString("Expecting a variable: ~S");
        $str95$Invalid_represented_first_order_t = SubLObjectFactory.makeString("Invalid represented first order term : ~S");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $const97$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $str98$true = SubLObjectFactory.makeString("true");
        $const99$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $str100$false = SubLObjectFactory.makeString("false");
        $const101$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $str102$not = SubLObjectFactory.makeString("not");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $sym104$CYCL_TO_KIF_NOT_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-NOT-METHOD");
        $const105$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str106$and = SubLObjectFactory.makeString("and");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AND"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULAS"));
        $sym108$CYCL_FORMULA_TO_KIF = SubLObjectFactory.makeSymbol("CYCL-FORMULA-TO-KIF");
        $sym109$CYCL_TO_KIF_AND_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-AND-METHOD");
        $const110$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $str111$or = SubLObjectFactory.makeString("or");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULAS"));
        $sym113$CYCL_TO_KIF_OR_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-OR-METHOD");
        $const114$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $str115$__ = SubLObjectFactory.makeString("=>");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT"));
        $sym117$CYCL_TO_KIF_IMPLIES_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-IMPLIES-METHOD");
        $const118$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $str119$___ = SubLObjectFactory.makeString("<=>");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUIV"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT"));
        $sym121$CYCL_TO_KIF_EQUIV_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-EQUIV-METHOD");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA1"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA2"));
        $const123$xor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("xor"));
        $sym124$CYCL_TO_KIF_XOR_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-XOR-METHOD");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUESENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-TRUESENTENCE-METHOD");
        $const127$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str128$forall = SubLObjectFactory.makeString("forall");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORALL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $sym130$CYCL_TO_KIF_FORALL_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-FORALL-METHOD");
        $const131$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $str132$exists = SubLObjectFactory.makeString("exists");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THEREEXISTS"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $sym134$CYCL_TO_KIF_THEREEXISTS_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-THEREEXISTS-METHOD");
        $const135$thereExistExactly = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
        $sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD");
        $const137$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-THEREEXISTATLEAST-METHOD");
        $const139$thereExistAtMost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-THEREEXISTATMOST-METHOD");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THERE-EXISTS-VARIANT"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $const142$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $str143$_ = SubLObjectFactory.makeString("=");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $const145$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym146$CYCL_TO_KIF_IST_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-IST-METHOD");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("AGENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"));
        $const148$goals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("goals"));
        $sym149$CYCL_TO_KIF_GOALS_METHOD = SubLObjectFactory.makeSymbol("CYCL-TO-KIF-GOALS-METHOD");
        $const150$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $str151$listof = SubLObjectFactory.makeString("listof");
    }
    
    public static final class $kif_term_native extends SubLStructNative
    {
        public SubLObject $print_string;
        private static final SubLStructDeclNative structDecl;
        
        public $kif_term_native() {
            this.$print_string = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kif_term_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$print_string;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$print_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kif_term_native.class, kif.$sym62$KIF_TERM, kif.$sym63$KIF_TERM_P, kif.$list64, kif.$list65, new String[] { "$print_string" }, kif.$list66, kif.$list67, kif.$sym68$PRINT_KIF_TERM);
        }
    }
    
    public static final class $kif_term_p$UnaryFunction extends UnaryFunction
    {
        public $kif_term_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KIF-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kif.kif_term_p(arg1);
        }
    }
}

/*

	Total time: 636 ms
	
*/