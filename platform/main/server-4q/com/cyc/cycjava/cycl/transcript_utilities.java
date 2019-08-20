/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.control_vars.$auto_increment_kb$;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_cyc_image_id;
import static com.cyc.cycjava.cycl.operation_communication.read_one_transcript_operation;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TRANSCRIPT-UTILITIES
 * source file: /cyc/top/cycl/transcript-utilities.lisp
 * created:     2019/07/03 17:37:50
 */
public final class transcript_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject get_units_and_comments(SubLObject transcript_create_list) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = transcript_create_list;
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject op_num = NIL;
                    SubLObject external_id = NIL;
                    SubLObject name = NIL;
                    SubLObject who = NIL;
                    SubLObject when = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    op_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    external_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    who = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    when = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject constant = constants_high.find_constant(name);
                            SubLObject comments = NIL;
                            if (NIL == constant) {
                                constant = constants_high.find_constant_by_external_id(external_id);
                            }
                            if (NIL != constant) {
                                comments = kb_mapping_utilities.pred_values_in_any_mt(constant, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if ((NIL != constant) && (NIL != comments)) {
                                ans = cons(list(info, constant, comments), ans);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt54);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject get_no_comments(SubLObject transcript_create_list) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = transcript_create_list;
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject op_num = NIL;
                    SubLObject external_id = NIL;
                    SubLObject name = NIL;
                    SubLObject who = NIL;
                    SubLObject when = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    op_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    external_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    who = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    when = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject constant = constants_high.find_constant(name);
                            if (NIL == constant) {
                                constant = constants_high.find_constant_by_external_id(external_id);
                            }
                            if (NIL != constant) {
                                if (!((((((NIL != isa.isa_in_any_mtP(constant, $$LexicalItem)) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$TheTerm))) || (NIL != isa.isa_in_any_mtP(constant, $$TestTemplateMicrotheory))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$TestingConstant))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$KSConstant))) || (NIL != isa.isa_in_any_mtP(constant, $$City)))) {
                                    if (NIL == kb_mapping_utilities.pred_values_in_any_mt(constant, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        ans = cons(info, ans);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt54);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject get_nl_notables(SubLObject transcript_create_list) {
        {
            SubLObject nl_preds = NIL;
            SubLObject gen_preds = NIL;
            SubLObject nl_cols = NIL;
            SubLObject gen_cols = NIL;
            SubLObject nl_others = NIL;
            SubLObject gen_others = NIL;
            SubLObject gen_notables = NIL;
            SubLObject nl_notables = NIL;
            SubLObject cdolist_list_var = transcript_create_list;
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject op_num = NIL;
                    SubLObject external_id = NIL;
                    SubLObject name = NIL;
                    SubLObject who = NIL;
                    SubLObject when = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    op_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    external_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    who = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    when = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject constant = constants_high.find_constant(name);
                            if (NIL == constant) {
                                constant = constants_high.find_constant_by_external_id(external_id);
                            }
                            if (NIL != constant) {
                                if ((((((((((NIL != isa.isa_in_any_mtP(constant, $$LexicalItem)) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$TheTerm))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$WorkflowConstant))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$OKBCConstant))) || (NIL != isa.isa_in_any_mtP(constant, $$TestTemplateMicrotheory))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$TestingConstant))) || (NIL != isa.isa_in_any_mtP(constant, $$KanisaConstant))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$KSConstant))) || (NIL != isa.quoted_isa_in_any_mtP(constant, $$SharedNote))) || (NIL != isa.isa_in_any_mtP(constant, $$TestQuestionOrTemplateMicrotheory))) {
                                } else {
                                    if ((NIL != isa.isa_in_any_mtP(constant, $$Predicate)) && (NIL != lexicon_utilities.unit_with_no_nlP(constant, UNPROVIDED))) {
                                        nl_preds = cons(info, nl_preds);
                                        if (!((NIL != pph_utilities.get_genformats(constant, UNPROVIDED)) || (NIL != pph_utilities.get_genphrases(constant, UNPROVIDED)))) {
                                            gen_preds = cons(info, gen_preds);
                                        }
                                    } else {
                                        if ((NIL != isa.isa_in_any_mtP(constant, $$Collection)) && (NIL != lexicon_utilities.unit_with_no_nlP(constant, UNPROVIDED))) {
                                            nl_cols = cons(info, nl_cols);
                                            if (!((NIL != pph_utilities.get_genphrases(constant, UNPROVIDED)) || (NIL != pph_utilities.get_pgus(constant, UNPROVIDED)))) {
                                                gen_cols = cons(info, gen_cols);
                                            }
                                        } else {
                                            if ((NIL != isa.isa_in_any_mtP(constant, $$Individual)) && (NIL != lexicon_utilities.unit_with_no_nlP(constant, UNPROVIDED))) {
                                                nl_cols = cons(info, nl_cols);
                                            } else {
                                                if (NIL != lexicon_utilities.unit_with_no_nlP(constant, UNPROVIDED)) {
                                                    nl_others = cons(info, nl_others);
                                                }
                                                gen_others = cons(info, gen_others);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt54);
                    }
                }
            }
            nl_notables = nconc(nreverse(nl_preds), nreverse(nl_cols), nreverse(nl_others));
            gen_notables = nconc(nreverse(gen_preds), nreverse(gen_cols), nreverse(gen_others));
            return list(nl_notables, gen_notables);
        }
    }

    public static final SubLObject bp_count_ops(SubLObject pathname) {
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            {
                SubLObject ops = ZERO_INTEGER;
                SubLObject lpc = ZERO_INTEGER;
                SubLObject rpc = ZERO_INTEGER;
                SubLObject inside_dqP = NIL;
                SubLObject preceding = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(pathname, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt13$Unable_to_open__S, pathname);
                    }
                    {
                        SubLObject str = stream;
                        SubLObject ch = NIL;
                        for (ch = read_char(str, NIL, $EOF, UNPROVIDED); ch != $EOF; ch = read_char(str, NIL, $EOF, UNPROVIDED)) {
                            if ((NIL != charE(CHAR_quotation, ch)) && (preceding != CHAR_backslash)) {
                                inside_dqP = makeBoolean(NIL == inside_dqP);
                            }
                            if (NIL == inside_dqP) {
                                if (NIL != charE(CHAR_lparen, ch)) {
                                    lpc = add(lpc, ONE_INTEGER);
                                }
                                if (NIL != charE(CHAR_rparen, ch)) {
                                    rpc = add(rpc, ONE_INTEGER);
                                    if (rpc.numG(ZERO_INTEGER) && lpc.numE(rpc)) {
                                        ops = add(ops, ONE_INTEGER);
                                    }
                                }
                            }
                            preceding = ch;
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
                return ops;
            }
        } else {
            format(T, $str_alt37$___s_is_not_a_pathname_string__or, pathname);
            return NIL;
        }
    }

    static private final SubLString $str_alt94$ = makeString("");

    public static final SubLFile me = new transcript_utilities();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $transcript_suffix$ = makeSymbol("*TRANSCRIPT-SUFFIX*");

    // defparameter
    /**
     * Boolean: has the master transcript been accessed -- probed, touched, written
     * to, or read from -- yet?
     */
    @LispMethod(comment = "Boolean: has the master transcript been accessed -- probed, touched, written\r\nto, or read from -- yet?\ndefparameter\nBoolean: has the master transcript been accessed -- probed, touched, written\nto, or read from -- yet?")
    public static final SubLSymbol $master_transcript_already_exists$ = makeSymbol("*MASTER-TRANSCRIPT-ALREADY-EXISTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $approx_chars_per_op$ = makeSymbol("*APPROX-CHARS-PER-OP*");

    private static final SubLString $$$ts = makeString("ts");

    public static final SubLSymbol $local_transcript_version$ = makeSymbol("*LOCAL-TRANSCRIPT-VERSION*");

    public static final SubLSymbol $local_transcript_history$ = makeSymbol("*LOCAL-TRANSCRIPT-HISTORY*");

    public static final SubLSymbol $local_hl_transcript_version$ = makeSymbol("*LOCAL-HL-TRANSCRIPT-VERSION*");

    public static final SubLSymbol $local_hl_transcript_history$ = makeSymbol("*LOCAL-HL-TRANSCRIPT-HISTORY*");

    public static final SubLSymbol $read_transcript_position$ = makeSymbol("*READ-TRANSCRIPT-POSITION*");

    private static final SubLInteger $int$206 = makeInteger(206);

    public static final SubLSymbol $local_transcript$ = makeSymbol("*LOCAL-TRANSCRIPT*");

    private static final SubLString $$$ROLLED = makeString("ROLLED");

    private static final SubLString $str12$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str13$_s__ = makeString("~s~%");

    public static final SubLSymbol $read_transcript$ = makeSymbol("*READ-TRANSCRIPT*");

    public static final SubLSymbol $master_transcript$ = makeSymbol("*MASTER-TRANSCRIPT*");

    public static final SubLSymbol $local_hl_transcript$ = makeSymbol("*LOCAL-HL-TRANSCRIPT*");

    private static final SubLString $str17$cyc_kb__a = makeString("cyc-kb-~a");

    private static final SubLString $str18$_a_local__a = makeString("~a-local-~a");

    private static final SubLString $str19$_a_local_hl__a = makeString("~a-local-hl-~a");

    private static final SubLString $str20$_ = makeString(".");

    private static final SubLString $$$transcripts = makeString("transcripts");

    private static final SubLString $str23$_TS = makeString(".TS");

    private static final SubLString $str24$_ = makeString("-");

    private static final SubLString $str25$_ts = makeString(".ts");

    public static final SubLSymbol $count_ops_table$ = makeSymbol("*COUNT-OPS-TABLE*");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLString $str31$_____s = makeString("~%~%~s");

    private static final SubLString $str32$_s_is_not_a_stream_or_pathname_st = makeString("~s is not a stream or pathname string");

    private static final SubLString $str33$__The_file__s_does_not_exist__or_ = makeString("~%The file ~s does not exist, or contains no operations.");

    private static final SubLString $str34$Examining__A = makeString("Examining ~A");

    private static final SubLList $list35 = list(makeSymbol("ENCAPSULATED-CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("WHEN"), cons(makeSymbol("FUNCTION"), makeSymbol("ARGS")));

    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    private static final SubLList $list37 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    private static final SubLSymbol FI_RENAME = makeSymbol("FI-RENAME");

    private static final SubLList $list39 = list(makeSymbol("TERM"), makeSymbol("NEW-NAME"));

    private static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    private static final SubLList $list41 = list(makeSymbol("TERM"));

    private static final SubLString $str42$____Transcript____S = makeString(";;; Transcript:  ~S");

    private static final SubLString $str43$______Examined______A = makeString("~%;;; Examined:    ~A");

    private static final SubLString $str44$______Total_Ops_____S = makeString("~%;;; Total Ops:   ~S");

    private static final SubLString $str45$______error_during_transcript_ana = makeString("~%;;; error during transcript analysis: At operation: ~S");

    private static final SubLString $str46$___A = makeString("~%~A");

    private static final SubLList $list47 = list(makeSymbol("TRANSCRIPT-CREATE-LIST"), makeSymbol("TRANSCRIPT-RENAME-LIST"), makeSymbol("TRANSCRIPT-KILL-LIST"));

    private static final SubLString $str48$_______S_KILLED = makeString("~%;;; ~S KILLED");

    private static final SubLList $list49 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    private static final SubLString $str50$__EXTERNAL_ID__S____A_by__A_at__A = makeString("~%EXTERNAL-ID ~S : ~A by ~A at ~A");

    private static final SubLString $str51$_______S_RENAMED = makeString("~%;;; ~S RENAMED");

    static private final SubLList $list52 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    private static final SubLString $str53$__EXTERNAL_ID__S____A_to__A_by__A = makeString("~%EXTERNAL-ID ~S : ~A to ~A by ~A at ~A");

    private static final SubLString $str54$_______S_CREATED = makeString("~%;;; ~S CREATED");

    private static final SubLSymbol $transcript_rename_hash$ = makeSymbol("*TRANSCRIPT-RENAME-HASH*");

    private static final SubLSymbol $sym57$_ = makeSymbol("<");

    private static final SubLSymbol $transcript_create_hash$ = makeSymbol("*TRANSCRIPT-CREATE-HASH*");

    private static final SubLString $$$transcript_file_not_found = makeString("transcript file not found");

    private static final SubLString $str61$_A__ = makeString("~A~%");

    private static final SubLSymbol WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol("WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");

    private static final SubLList $list63 = list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("OUTPUT-FILENAME"));

    private static final SubLString $str64$Generate_a_KE_Text_file_from_a_tr = makeString("Generate a KE Text file from a transcript and write it to a file.");

    private static final SubLList $list65 = list(list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("OUTPUT-FILENAME"), makeSymbol("STRINGP")));

    private static final SubLSymbol FI_EDIT = makeSymbol("FI-EDIT");

    private static final SubLList $list68 = list(makeSymbol("OLD-FORMULA"), makeSymbol("NEW-FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLSymbol FI_FIND_OR_CREATE = makeSymbol("FI-FIND-OR-CREATE");

    private static final SubLString $str73$ = makeString("");

    private static final SubLString $str74$Constant__ = makeString("Constant: ");

    private static final SubLList $list75 = list(makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"));

    private static final SubLString $str76$Rename__ = makeString("Rename: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol FI_MERGE = makeSymbol("FI-MERGE");

    private static final SubLList $list79 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));

    private static final SubLString $str80$Merge__ = makeString("Merge: ");

    private static final SubLString $str81$Kill__ = makeString("Kill: ");

    private static final SubLSymbol FI_REASSERT = makeSymbol("FI-REASSERT");

    private static final SubLString $str84$Enter_ = makeString("Enter.");

    private static final SubLString $str85$___The_following_assertion_simula = makeString(";; The following assertion simulates an fi-reassert. (two of these simulate a repropagate)");

    private static final SubLString $str87$Delete_ = makeString("Delete.");

    private static final SubLString $str89$Delete_____Simulate_an_fi_blast_ = makeString("Delete. ;; Simulate an fi-blast.");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str92$In_Mt__ = makeString("In Mt: ");

    private static final SubLString $str94$Truth_Value___unknown_ = makeString("Truth Value: :unknown.");



    private static final SubLString $str96$Truth_Value___default_ = makeString("Truth Value: :default.");

    private static final SubLString $str98$Truth_Value___monotonic_ = makeString("Truth Value: :monotonic.");

    private static final SubLString $str100$Direction___forward_ = makeString("Direction: :forward.");

    private static final SubLString $str102$Direction___backward_ = makeString("Direction: :backward.");

    private static final SubLString $str104$Direction___code_ = makeString("Direction: :code.");

    private static final SubLString $str105$_A___A_ = makeString("~A: ~A.");

    private static final SubLString $str106$f___A_ = makeString("f: ~A.");

    private static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");

    private static final SubLSymbol FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");

    private static final SubLSymbol FI_CREATE_SKOLEM = makeSymbol("FI-CREATE-SKOLEM");

    private static final SubLString $str110$___This_skolem_creation_should_be = makeString(";; This skolem creation should be implicit in the following assertion and can safely be deleted.");

    private static final SubLString $str111$____S = makeString(";; ~S");

    private static final SubLString $str112$___Don_t_know_how_convert_next_li = makeString(";; Don't know how convert next line");

    private static final SubLString $str113$Internal_Error____A__for_operatio = makeString("Internal Error: \"~A\" for operation: ~S");

    private static final SubLString $str114$_ = makeString(":");

    private static final SubLString $str115$_ = makeString("'");

    private static final SubLString $$$TLReifiedNatFn = makeString("TLReifiedNatFn");

    private static final SubLString $$$TLAssertionFn = makeString("TLAssertionFn");



    private static final SubLString $$$TLVariableFn = makeString("TLVariableFn");

    private static final SubLString $str122$_VAR = makeString("?VAR");

    private static final SubLString $str123$_ = makeString("(");

    private static final SubLString $str124$___ = makeString(" . ");

    private static final SubLString $str125$_ = makeString(")");

    private static final SubLString $str127$_ = makeString("\"");

    private static final SubLString $str128$__ = makeString("\\\"");

    private static final SubLString $str129$___ = makeString("\\\\\"");

    // Definitions
    /**
     * 1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever
     * was established from the outside)
     * 2) Evaluates FORM
     * 3) Adds an encapsulated, contextualized version of FORM to the transcript queue.
     * If RESULT evaluates without generating an error, encapsulate it
     * and stick it on the transcript queue.
     */
    @LispMethod(comment = "1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\r\nwas established from the outside)\r\n2) Evaluates FORM\r\n3) Adds an encapsulated, contextualized version of FORM to the transcript queue.\r\nIf RESULT evaluates without generating an error, encapsulate it\r\nand stick it on the transcript queue.\n1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\nwas established from the outside)\n2) Evaluates FORM\n3) Adds an encapsulated, contextualized version of FORM to the transcript queue.\nIf RESULT evaluates without generating an error, encapsulate it\nand stick it on the transcript queue.")
    public static final SubLObject transcript_eval_alt(SubLObject form, SubLObject bookkeeping_info) {
        if (bookkeeping_info == UNPROVIDED) {
            bookkeeping_info = NIL;
        }
        return com.cyc.cycjava.cycl.transcript_utilities.transcript_form_int(form, T, bookkeeping_info);
    }

    // Definitions
    /**
     * 1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever
     * was established from the outside)
     * 2) Evaluates FORM
     * 3) Adds an encapsulated, contextualized version of FORM to the transcript queue.
     * If RESULT evaluates without generating an error, encapsulate it
     * and stick it on the transcript queue.
     */
    @LispMethod(comment = "1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\r\nwas established from the outside)\r\n2) Evaluates FORM\r\n3) Adds an encapsulated, contextualized version of FORM to the transcript queue.\r\nIf RESULT evaluates without generating an error, encapsulate it\r\nand stick it on the transcript queue.\n1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\nwas established from the outside)\n2) Evaluates FORM\n3) Adds an encapsulated, contextualized version of FORM to the transcript queue.\nIf RESULT evaluates without generating an error, encapsulate it\nand stick it on the transcript queue.")
    public static SubLObject transcript_eval(final SubLObject form, SubLObject bookkeeping_info) {
        if (bookkeeping_info == UNPROVIDED) {
            bookkeeping_info = NIL;
        }
        return transcript_form_int(form, T, bookkeeping_info);
    }

    /**
     * 1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever
     * was established from the outside)
     * 2) Adds an encapsulated, contextualized version of FORM to the transcript queue.
     * If RESULT evaluates without generating an error, encapsulate it
     * and stick it on the transcript queue.
     *
     * @unknown FORM should be well formed, as there is no error checking on it
     */
    @LispMethod(comment = "1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\r\nwas established from the outside)\r\n2) Adds an encapsulated, contextualized version of FORM to the transcript queue.\r\nIf RESULT evaluates without generating an error, encapsulate it\r\nand stick it on the transcript queue.\r\n\r\n@unknown FORM should be well formed, as there is no error checking on it\n1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\nwas established from the outside)\n2) Adds an encapsulated, contextualized version of FORM to the transcript queue.\nIf RESULT evaluates without generating an error, encapsulate it\nand stick it on the transcript queue.")
    public static final SubLObject transcript_form_alt(SubLObject form, SubLObject bookkeeping_info) {
        if (bookkeeping_info == UNPROVIDED) {
            bookkeeping_info = NIL;
        }
        return com.cyc.cycjava.cycl.transcript_utilities.transcript_form_int(form, NIL, bookkeeping_info);
    }

    /**
     * 1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever
     * was established from the outside)
     * 2) Adds an encapsulated, contextualized version of FORM to the transcript queue.
     * If RESULT evaluates without generating an error, encapsulate it
     * and stick it on the transcript queue.
     *
     * @unknown FORM should be well formed, as there is no error checking on it
     */
    @LispMethod(comment = "1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\r\nwas established from the outside)\r\n2) Adds an encapsulated, contextualized version of FORM to the transcript queue.\r\nIf RESULT evaluates without generating an error, encapsulate it\r\nand stick it on the transcript queue.\r\n\r\n@unknown FORM should be well formed, as there is no error checking on it\n1) Binds BOOKKEEPING-INFO if it is passed in (otherwise uses whatever\nwas established from the outside)\n2) Adds an encapsulated, contextualized version of FORM to the transcript queue.\nIf RESULT evaluates without generating an error, encapsulate it\nand stick it on the transcript queue.")
    public static SubLObject transcript_form(final SubLObject form, SubLObject bookkeeping_info) {
        if (bookkeeping_info == UNPROVIDED) {
            bookkeeping_info = NIL;
        }
        return transcript_form_int(form, NIL, bookkeeping_info);
    }

    public static final SubLObject transcript_form_int_alt(SubLObject form, SubLObject evalP, SubLObject bookkeeping_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject transcriptP = T;
                SubLObject result = NIL;
                form = precanonicalizer.immediate_precanonicalizations(form);
                {
                    SubLObject _prev_bind_0 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
                    try {
                        cyc_bookkeeping.$cyc_bookkeeping_info$.bind(NIL != bookkeeping_info ? ((SubLObject) (bookkeeping_info)) : cyc_bookkeeping.cyc_bookkeeping_info(), thread);
                        if (NIL != evalP) {
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                transcriptP = NIL;
                                                result = eval_in_api.cyc_api_eval(form);
                                                transcriptP = T;
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        }
                        if (NIL != transcriptP) {
                            {
                                SubLObject transcript_form = com.cyc.cycjava.cycl.transcript_utilities.form_to_transcript_form(form);
                                operation_queues.add_to_transcript_queue(transcript_form);
                            }
                        }
                    } finally {
                        cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject transcript_form_int(SubLObject form, final SubLObject evalP, final SubLObject bookkeeping_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcriptP = T;
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        form = precanonicalizer.immediate_precanonicalizations(form);
        final SubLObject _prev_bind_0 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(NIL != bookkeeping_info ? bookkeeping_info : cyc_bookkeeping.cyc_bookkeeping_info(), thread);
            if (NIL != evalP) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            transcriptP = NIL;
                            result = eval_in_api.cyc_api_eval(form);
                            transcriptP = T;
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            }
            if ((NIL != transcriptP) && (NIL == error_message)) {
                final SubLObject transcript_form = form_to_transcript_form(form);
                operation_queues.add_to_transcript_queue(transcript_form);
            }
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject form_to_transcript_form_alt(SubLObject form) {
        return operation_queues.form_to_api_op(form);
    }

    public static SubLObject form_to_transcript_form(final SubLObject form) {
        return operation_queues.form_to_api_op(form);
    }

    /**
     * Initialize or reinitialize the handling of transcripts.
     */
    @LispMethod(comment = "Initialize or reinitialize the handling of transcripts.")
    public static final SubLObject initialize_transcript_handling_alt() {
        com.cyc.cycjava.cycl.transcript_utilities.set_master_transcript_already_exists(NIL);
        com.cyc.cycjava.cycl.transcript_utilities.new_local_transcript();
        com.cyc.cycjava.cycl.transcript_utilities.set_master_transcript(UNPROVIDED);
        com.cyc.cycjava.cycl.transcript_utilities.set_read_transcript(com.cyc.cycjava.cycl.transcript_utilities.master_transcript());
        if (NIL != transcript_server.use_transcript_server()) {
            $auto_increment_kb$.setGlobalValue(T);
        }
        return T;
    }

    /**
     * Initialize or reinitialize the handling of transcripts.
     */
    @LispMethod(comment = "Initialize or reinitialize the handling of transcripts.")
    public static SubLObject initialize_transcript_handling() {
        set_master_transcript_already_exists(NIL);
        new_local_transcript();
        set_master_transcript(UNPROVIDED);
        set_read_transcript(master_transcript());
        if (NIL != transcript_server.use_transcript_server()) {
            $auto_increment_kb$.setGlobalValue(T);
        }
        return T;
    }

    public static final SubLObject transcript_suffix_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $transcript_suffix$.getDynamicValue(thread);
        }
    }

    public static SubLObject transcript_suffix() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $transcript_suffix$.getDynamicValue(thread);
    }

    /**
     * Accessor for *master-transcript-already-exists*.
     */
    @LispMethod(comment = "Accessor for *master-transcript-already-exists*.")
    public static final SubLObject master_transcript_already_exists_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $master_transcript_already_exists$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *master-transcript-already-exists*.
     */
    @LispMethod(comment = "Accessor for *master-transcript-already-exists*.")
    public static SubLObject master_transcript_already_exists() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $master_transcript_already_exists$.getDynamicValue(thread);
    }

    public static final SubLObject set_master_transcript_already_exists_alt(SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $master_transcript_already_exists$.setDynamicValue(number, thread);
            return $master_transcript_already_exists$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_master_transcript_already_exists(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $master_transcript_already_exists$.setDynamicValue(number, thread);
        return $master_transcript_already_exists$.getDynamicValue(thread);
    }

    public static final SubLObject local_transcript_version_alt() {
        return $local_transcript_version$.getGlobalValue();
    }

    public static SubLObject local_transcript_version() {
        return $local_transcript_version$.getGlobalValue();
    }

    public static final SubLObject inc_local_transcript_version_alt() {
        $local_transcript_version$.setGlobalValue(add($local_transcript_version$.getGlobalValue(), ONE_INTEGER));
        return $local_transcript_version$.getGlobalValue();
    }

    public static SubLObject inc_local_transcript_version() {
        $local_transcript_version$.setGlobalValue(add($local_transcript_version$.getGlobalValue(), ONE_INTEGER));
        return $local_transcript_version$.getGlobalValue();
    }

    public static final SubLObject local_transcript_history_alt() {
        return $local_transcript_history$.getGlobalValue();
    }

    public static SubLObject local_transcript_history() {
        return $local_transcript_history$.getGlobalValue();
    }

    public static final SubLObject local_transcript_history_add_alt(SubLObject transcript) {
        $local_transcript_history$.setGlobalValue(cons(transcript, $local_transcript_history$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject local_transcript_history_add(final SubLObject transcript) {
        $local_transcript_history$.setGlobalValue(cons(transcript, $local_transcript_history$.getGlobalValue()));
        return NIL;
    }

    public static final SubLObject local_hl_transcript_version_alt() {
        return $local_hl_transcript_version$.getGlobalValue();
    }

    public static SubLObject local_hl_transcript_version() {
        return $local_hl_transcript_version$.getGlobalValue();
    }

    public static final SubLObject inc_local_hl_transcript_version_alt() {
        $local_hl_transcript_version$.setGlobalValue(add($local_hl_transcript_version$.getGlobalValue(), ONE_INTEGER));
        return $local_hl_transcript_version$.getGlobalValue();
    }

    public static SubLObject inc_local_hl_transcript_version() {
        $local_hl_transcript_version$.setGlobalValue(add($local_hl_transcript_version$.getGlobalValue(), ONE_INTEGER));
        return $local_hl_transcript_version$.getGlobalValue();
    }

    public static final SubLObject local_hl_transcript_history_alt() {
        return $local_hl_transcript_history$.getGlobalValue();
    }

    public static SubLObject local_hl_transcript_history() {
        return $local_hl_transcript_history$.getGlobalValue();
    }

    public static final SubLObject local_hl_transcript_history_add_alt(SubLObject transcript) {
        $local_hl_transcript_history$.setGlobalValue(cons(transcript, $local_hl_transcript_history$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject local_hl_transcript_history_add(final SubLObject transcript) {
        $local_hl_transcript_history$.setGlobalValue(cons(transcript, $local_hl_transcript_history$.getGlobalValue()));
        return NIL;
    }

    public static final SubLObject read_transcript_position_alt() {
        return $read_transcript_position$.getGlobalValue();
    }

    public static SubLObject read_transcript_position() {
        return $read_transcript_position$.getGlobalValue();
    }

    public static final SubLObject set_read_transcript_position_alt(SubLObject number) {
        $read_transcript_position$.setGlobalValue(number);
        return $read_transcript_position$.getGlobalValue();
    }

    public static SubLObject set_read_transcript_position(final SubLObject number) {
        $read_transcript_position$.setGlobalValue(number);
        return $read_transcript_position$.getGlobalValue();
    }

    public static final SubLObject approx_chars_per_op_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $approx_chars_per_op$.getDynamicValue(thread);
        }
    }

    public static SubLObject approx_chars_per_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $approx_chars_per_op$.getDynamicValue(thread);
    }

    public static final SubLObject set_approx_chars_per_op_alt(SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $approx_chars_per_op$.setDynamicValue(number, thread);
            return $approx_chars_per_op$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_approx_chars_per_op(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $approx_chars_per_op$.setDynamicValue(number, thread);
        return $approx_chars_per_op$.getDynamicValue(thread);
    }

    /**
     * Accessor for *local-transcript*.
     */
    @LispMethod(comment = "Accessor for *local-transcript*.")
    public static final SubLObject local_transcript_alt() {
        return $local_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *local-transcript*.
     */
    @LispMethod(comment = "Accessor for *local-transcript*.")
    public static SubLObject local_transcript() {
        return $local_transcript$.getGlobalValue();
    }

    /**
     * Modifies *local-transcript* by adding the mark into the name.
     * If the file exists on disk, then rename the file to the new name.
     */
    @LispMethod(comment = "Modifies *local-transcript* by adding the mark into the name.\r\nIf the file exists on disk, then rename the file to the new name.\nModifies *local-transcript* by adding the mark into the name.\nIf the file exists on disk, then rename the file to the new name.")
    public static final SubLObject mark_local_transcript_alt(SubLObject mark) {
        {
            SubLObject oldname = $local_transcript$.getGlobalValue();
            if (NIL != oldname) {
                {
                    SubLObject newname = com.cyc.cycjava.cycl.transcript_utilities.mark_transcript_filename(oldname, mark);
                    if (NIL != Filesys.probe_file(oldname)) {
                        Filesys.rename_file(oldname, newname);
                    }
                    $local_transcript$.setGlobalValue(newname);
                    return newname;
                }
            }
        }
        return NIL;
    }

    /**
     * Modifies *local-transcript* by adding the mark into the name.
     * If the file exists on disk, then rename the file to the new name.
     */
    @LispMethod(comment = "Modifies *local-transcript* by adding the mark into the name.\r\nIf the file exists on disk, then rename the file to the new name.\nModifies *local-transcript* by adding the mark into the name.\nIf the file exists on disk, then rename the file to the new name.")
    public static SubLObject mark_local_transcript(final SubLObject mark) {
        final SubLObject oldname = $local_transcript$.getGlobalValue();
        if (NIL != oldname) {
            final SubLObject newname = mark_transcript_filename(oldname, mark);
            if (NIL != Filesys.probe_file(oldname)) {
                Filesys.rename_file(oldname, newname);
            }
            $local_transcript$.setGlobalValue(newname);
            return newname;
        }
        return NIL;
    }

    /**
     * This promotes the previous portion of the old transcript into the new
     * transcript directory when the KB rolls over into the new state.  This
     * assumes that *kb-loaded* has already been updated to the new value.
     */
    @LispMethod(comment = "This promotes the previous portion of the old transcript into the new\r\ntranscript directory when the KB rolls over into the new state.  This\r\nassumes that *kb-loaded* has already been updated to the new value.\nThis promotes the previous portion of the old transcript into the new\ntranscript directory when the KB rolls over into the new state.  This\nassumes that *kb-loaded* has already been updated to the new value.")
    public static final SubLObject roll_local_transcript_alt() {
        com.cyc.cycjava.cycl.transcript_utilities.mark_local_transcript($$$ROLLED);
        $local_transcript$.setGlobalValue(NIL);
        com.cyc.cycjava.cycl.transcript_utilities.new_local_transcript_int();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(com.cyc.cycjava.cycl.transcript_utilities.local_transcript(), NIL != Filesys.probe_file(com.cyc.cycjava.cycl.transcript_utilities.local_transcript()) ? ((SubLObject) ($APPEND)) : $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt13$Unable_to_open__S, com.cyc.cycjava.cycl.transcript_utilities.local_transcript());
                    }
                    {
                        SubLObject stream_2 = stream;
                        SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
                        SubLObject op = NIL;
                        for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                            format(stream_2, $str_alt14$_s__, op);
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
            }
        }
        return NIL;
    }

    /**
     * This promotes the previous portion of the old transcript into the new
     * transcript directory when the KB rolls over into the new state.  This
     * assumes that *kb-loaded* has already been updated to the new value.
     */
    @LispMethod(comment = "This promotes the previous portion of the old transcript into the new\r\ntranscript directory when the KB rolls over into the new state.  This\r\nassumes that *kb-loaded* has already been updated to the new value.\nThis promotes the previous portion of the old transcript into the new\ntranscript directory when the KB rolls over into the new state.  This\nassumes that *kb-loaded* has already been updated to the new value.")
    public static SubLObject roll_local_transcript() {
        mark_local_transcript($$$ROLLED);
        $local_transcript$.setGlobalValue(NIL);
        new_local_transcript_int();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(local_transcript(), NIL != Filesys.probe_file(local_transcript()) ? $APPEND : $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str12$Unable_to_open__S, local_transcript());
                }
                final SubLObject stream_$2 = stream;
                SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
                SubLObject op = NIL;
                op = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream_$2, $str13$_s__, op);
                    cdolist_list_var = cdolist_list_var.rest();
                    op = cdolist_list_var.first();
                } 
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
        }
        return NIL;
    }

    /**
     * Clear local-operation-storage-queue and set *local-transcript* to a new file.
     */
    @LispMethod(comment = "Clear local-operation-storage-queue and set *local-transcript* to a new file.")
    public static final SubLObject new_local_transcript_alt() {
        operation_queues.clear_local_operation_storage_queue();
        return com.cyc.cycjava.cycl.transcript_utilities.new_local_transcript_int();
    }

    /**
     * Clear local-operation-storage-queue and set *local-transcript* to a new file.
     */
    @LispMethod(comment = "Clear local-operation-storage-queue and set *local-transcript* to a new file.")
    public static SubLObject new_local_transcript() {
        operation_queues.clear_local_operation_storage_queue();
        return new_local_transcript_int();
    }

    /**
     * Set *local-transcript* to a new file.
     */
    @LispMethod(comment = "Set *local-transcript* to a new file.")
    public static final SubLObject new_local_transcript_int_alt() {
        if ((NIL != $local_transcript$.getGlobalValue()) && (NIL != Filesys.probe_file($local_transcript$.getGlobalValue()))) {
            com.cyc.cycjava.cycl.transcript_utilities.local_transcript_history_add($local_transcript$.getGlobalValue());
            com.cyc.cycjava.cycl.transcript_utilities.inc_local_transcript_version();
        }
        $local_transcript$.setGlobalValue(com.cyc.cycjava.cycl.transcript_utilities.construct_transcript_filename(com.cyc.cycjava.cycl.transcript_utilities.make_local_transcript_filename(com.cyc.cycjava.cycl.transcript_utilities.local_transcript_version())));
        return $local_transcript$.getGlobalValue();
    }

    /**
     * Set *local-transcript* to a new file.
     */
    @LispMethod(comment = "Set *local-transcript* to a new file.")
    public static SubLObject new_local_transcript_int() {
        if ((NIL != $local_transcript$.getGlobalValue()) && (NIL != Filesys.probe_file($local_transcript$.getGlobalValue()))) {
            local_transcript_history_add($local_transcript$.getGlobalValue());
            inc_local_transcript_version();
        }
        $local_transcript$.setGlobalValue(construct_transcript_filename(make_local_transcript_filename(local_transcript_version())));
        return $local_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *read-transcript*.
     */
    @LispMethod(comment = "Accessor for *read-transcript*.")
    public static final SubLObject read_transcript_alt() {
        return $read_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *read-transcript*.
     */
    @LispMethod(comment = "Accessor for *read-transcript*.")
    public static SubLObject read_transcript() {
        return $read_transcript$.getGlobalValue();
    }

    public static final SubLObject set_read_transcript_alt(SubLObject filename) {
        $read_transcript$.setGlobalValue(filename);
        return $read_transcript$.getGlobalValue();
    }

    public static SubLObject set_read_transcript(final SubLObject filename) {
        $read_transcript$.setGlobalValue(filename);
        return $read_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *master-transcript*.
     */
    @LispMethod(comment = "Accessor for *master-transcript*.")
    public static final SubLObject master_transcript_alt() {
        return $master_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *master-transcript*.
     */
    @LispMethod(comment = "Accessor for *master-transcript*.")
    public static SubLObject master_transcript() {
        return $master_transcript$.getGlobalValue();
    }

    public static final SubLObject set_master_transcript_alt(SubLObject name) {
        if (name == UNPROVIDED) {
            name = com.cyc.cycjava.cycl.transcript_utilities.make_master_transcript_filename(UNPROVIDED);
        }
        if (NIL == transcript_server.use_transcript_server()) {
            $master_transcript$.setGlobalValue(com.cyc.cycjava.cycl.transcript_utilities.construct_transcript_filename(name));
        }
        return $master_transcript$.getGlobalValue();
    }

    public static SubLObject set_master_transcript(SubLObject name) {
        if (name == UNPROVIDED) {
            name = make_master_transcript_filename(UNPROVIDED);
        }
        if (NIL == transcript_server.use_transcript_server()) {
            $master_transcript$.setGlobalValue(construct_transcript_filename(name));
        }
        return $master_transcript$.getGlobalValue();
    }

    /**
     * Get all local transcripts that have been created by this image.
     */
    @LispMethod(comment = "Get all local transcripts that have been created by this image.")
    public static final SubLObject get_all_transcripts_image_alt() {
        if (NIL != Filesys.probe_file(com.cyc.cycjava.cycl.transcript_utilities.local_transcript())) {
            return cons(com.cyc.cycjava.cycl.transcript_utilities.local_transcript(), com.cyc.cycjava.cycl.transcript_utilities.local_transcript_history());
        } else {
            return com.cyc.cycjava.cycl.transcript_utilities.local_transcript_history();
        }
    }

    /**
     * Get all local transcripts that have been created by this image.
     */
    @LispMethod(comment = "Get all local transcripts that have been created by this image.")
    public static SubLObject get_all_transcripts_image() {
        if (NIL != Filesys.probe_file(local_transcript())) {
            return cons(local_transcript(), local_transcript_history());
        }
        return local_transcript_history();
    }

    /**
     * Accessor for *local-hl-transcript*.
     */
    @LispMethod(comment = "Accessor for *local-hl-transcript*.")
    public static final SubLObject local_hl_transcript_alt() {
        return $local_hl_transcript$.getGlobalValue();
    }

    /**
     * Accessor for *local-hl-transcript*.
     */
    @LispMethod(comment = "Accessor for *local-hl-transcript*.")
    public static SubLObject local_hl_transcript() {
        return $local_hl_transcript$.getGlobalValue();
    }

    /**
     * Modifies *local-hl-transcript* by adding the mark into the name.
     * If the file exists on disk, then rename the file to the new name.
     */
    @LispMethod(comment = "Modifies *local-hl-transcript* by adding the mark into the name.\r\nIf the file exists on disk, then rename the file to the new name.\nModifies *local-hl-transcript* by adding the mark into the name.\nIf the file exists on disk, then rename the file to the new name.")
    public static final SubLObject mark_local_hl_transcript_alt(SubLObject mark) {
        {
            SubLObject oldname = $local_hl_transcript$.getGlobalValue();
            if (NIL != oldname) {
                {
                    SubLObject newname = com.cyc.cycjava.cycl.transcript_utilities.mark_transcript_filename(oldname, mark);
                    if (NIL != Filesys.probe_file(oldname)) {
                        Filesys.rename_file(oldname, newname);
                    }
                    $local_hl_transcript$.setGlobalValue(newname);
                    return newname;
                }
            }
        }
        return NIL;
    }

    /**
     * Modifies *local-hl-transcript* by adding the mark into the name.
     * If the file exists on disk, then rename the file to the new name.
     */
    @LispMethod(comment = "Modifies *local-hl-transcript* by adding the mark into the name.\r\nIf the file exists on disk, then rename the file to the new name.\nModifies *local-hl-transcript* by adding the mark into the name.\nIf the file exists on disk, then rename the file to the new name.")
    public static SubLObject mark_local_hl_transcript(final SubLObject mark) {
        final SubLObject oldname = $local_hl_transcript$.getGlobalValue();
        if (NIL != oldname) {
            final SubLObject newname = mark_transcript_filename(oldname, mark);
            if (NIL != Filesys.probe_file(oldname)) {
                Filesys.rename_file(oldname, newname);
            }
            $local_hl_transcript$.setGlobalValue(newname);
            return newname;
        }
        return NIL;
    }

    /**
     * This promotes the previous portion of the old hl-transcript into the new
     * hl-transcript directory when the KB rolls over into the new state.  This
     * assumes that *kb-loaded* has already been updated to the new value.
     */
    @LispMethod(comment = "This promotes the previous portion of the old hl-transcript into the new\r\nhl-transcript directory when the KB rolls over into the new state.  This\r\nassumes that *kb-loaded* has already been updated to the new value.\nThis promotes the previous portion of the old hl-transcript into the new\nhl-transcript directory when the KB rolls over into the new state.  This\nassumes that *kb-loaded* has already been updated to the new value.")
    public static final SubLObject roll_local_hl_transcript_alt() {
        com.cyc.cycjava.cycl.transcript_utilities.mark_local_hl_transcript($$$ROLLED);
        $local_hl_transcript$.setGlobalValue(NIL);
        com.cyc.cycjava.cycl.transcript_utilities.new_local_hl_transcript_int();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(com.cyc.cycjava.cycl.transcript_utilities.local_hl_transcript(), NIL != Filesys.probe_file(com.cyc.cycjava.cycl.transcript_utilities.local_hl_transcript()) ? ((SubLObject) ($APPEND)) : $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt13$Unable_to_open__S, com.cyc.cycjava.cycl.transcript_utilities.local_hl_transcript());
                    }
                    {
                        SubLObject stream_3 = stream;
                        SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
                        SubLObject op = NIL;
                        for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                            format(stream_3, $str_alt14$_s__, op);
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
            }
        }
        return NIL;
    }

    /**
     * This promotes the previous portion of the old hl-transcript into the new
     * hl-transcript directory when the KB rolls over into the new state.  This
     * assumes that *kb-loaded* has already been updated to the new value.
     */
    @LispMethod(comment = "This promotes the previous portion of the old hl-transcript into the new\r\nhl-transcript directory when the KB rolls over into the new state.  This\r\nassumes that *kb-loaded* has already been updated to the new value.\nThis promotes the previous portion of the old hl-transcript into the new\nhl-transcript directory when the KB rolls over into the new state.  This\nassumes that *kb-loaded* has already been updated to the new value.")
    public static SubLObject roll_local_hl_transcript() {
        mark_local_hl_transcript($$$ROLLED);
        $local_hl_transcript$.setGlobalValue(NIL);
        new_local_hl_transcript_int();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(local_hl_transcript(), NIL != Filesys.probe_file(local_hl_transcript()) ? $APPEND : $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str12$Unable_to_open__S, local_hl_transcript());
                }
                final SubLObject stream_$3 = stream;
                SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
                SubLObject op = NIL;
                op = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream_$3, $str13$_s__, op);
                    cdolist_list_var = cdolist_list_var.rest();
                    op = cdolist_list_var.first();
                } 
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
        }
        return NIL;
    }

    /**
     * Clear local-operation-storage-queue and set *local-hl-transcript* to a new file.
     */
    @LispMethod(comment = "Clear local-operation-storage-queue and set *local-hl-transcript* to a new file.")
    public static final SubLObject new_local_hl_transcript_alt() {
        operation_queues.clear_local_operation_storage_queue();
        return com.cyc.cycjava.cycl.transcript_utilities.new_local_hl_transcript_int();
    }

    /**
     * Clear local-operation-storage-queue and set *local-hl-transcript* to a new file.
     */
    @LispMethod(comment = "Clear local-operation-storage-queue and set *local-hl-transcript* to a new file.")
    public static SubLObject new_local_hl_transcript() {
        operation_queues.clear_local_operation_storage_queue();
        return new_local_hl_transcript_int();
    }

    /**
     * Set *local-hl-transcript* to a new file.
     */
    @LispMethod(comment = "Set *local-hl-transcript* to a new file.")
    public static final SubLObject new_local_hl_transcript_int_alt() {
        if ((NIL != $local_hl_transcript$.getGlobalValue()) && (NIL != Filesys.probe_file($local_hl_transcript$.getGlobalValue()))) {
            com.cyc.cycjava.cycl.transcript_utilities.local_hl_transcript_history_add($local_hl_transcript$.getGlobalValue());
            com.cyc.cycjava.cycl.transcript_utilities.inc_local_hl_transcript_version();
        }
        $local_hl_transcript$.setGlobalValue(com.cyc.cycjava.cycl.transcript_utilities.construct_transcript_filename(com.cyc.cycjava.cycl.transcript_utilities.make_local_hl_transcript_filename(com.cyc.cycjava.cycl.transcript_utilities.local_hl_transcript_version())));
        return $local_hl_transcript$.getGlobalValue();
    }

    /**
     * Set *local-hl-transcript* to a new file.
     */
    @LispMethod(comment = "Set *local-hl-transcript* to a new file.")
    public static SubLObject new_local_hl_transcript_int() {
        if ((NIL != $local_hl_transcript$.getGlobalValue()) && (NIL != Filesys.probe_file($local_hl_transcript$.getGlobalValue()))) {
            local_hl_transcript_history_add($local_hl_transcript$.getGlobalValue());
            inc_local_hl_transcript_version();
        }
        $local_hl_transcript$.setGlobalValue(construct_transcript_filename(make_local_hl_transcript_filename(local_hl_transcript_version())));
        return $local_hl_transcript$.getGlobalValue();
    }

    public static final SubLObject make_master_transcript_filename_alt(SubLObject version) {
        if (version == UNPROVIDED) {
            version = kb_loaded();
        }
        {
            SubLObject filename = format(NIL, $str_alt18$cyc_kb__a, version);
            return filename;
        }
    }

    public static SubLObject make_master_transcript_filename(SubLObject version) {
        if (version == UNPROVIDED) {
            version = kb_loaded();
        }
        final SubLObject filename = format(NIL, $str17$cyc_kb__a, version);
        return filename;
    }

    /**
     * Produces the base of a transcript filename based on
     * the cyc-image-id and a version number
     */
    @LispMethod(comment = "Produces the base of a transcript filename based on\r\nthe cyc-image-id and a version number\nProduces the base of a transcript filename based on\nthe cyc-image-id and a version number")
    public static final SubLObject make_local_transcript_filename_alt(SubLObject version_number) {
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        {
            SubLObject filename = format(NIL, $str_alt19$_a_local__a, cyc_image_id(), version_number);
            return filename;
        }
    }

    /**
     * Produces the base of a transcript filename based on
     * the cyc-image-id and a version number
     */
    @LispMethod(comment = "Produces the base of a transcript filename based on\r\nthe cyc-image-id and a version number\nProduces the base of a transcript filename based on\nthe cyc-image-id and a version number")
    public static SubLObject make_local_transcript_filename(final SubLObject version_number) {
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        final SubLObject filename = format(NIL, $str18$_a_local__a, cyc_image_id(), version_number);
        return filename;
    }

    /**
     * Produces the base of an HL transcript filename based on
     * the cyc-image-id and a version number
     */
    @LispMethod(comment = "Produces the base of an HL transcript filename based on\r\nthe cyc-image-id and a version number\nProduces the base of an HL transcript filename based on\nthe cyc-image-id and a version number")
    public static final SubLObject make_local_hl_transcript_filename_alt(SubLObject version_number) {
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        {
            SubLObject filename = format(NIL, $str_alt20$_a_local_hl__a, cyc_image_id(), version_number);
            return filename;
        }
    }

    /**
     * Produces the base of an HL transcript filename based on
     * the cyc-image-id and a version number
     */
    @LispMethod(comment = "Produces the base of an HL transcript filename based on\r\nthe cyc-image-id and a version number\nProduces the base of an HL transcript filename based on\nthe cyc-image-id and a version number")
    public static SubLObject make_local_hl_transcript_filename(final SubLObject version_number) {
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        final SubLObject filename = format(NIL, $str19$_a_local_hl__a, cyc_image_id(), version_number);
        return filename;
    }

    /**
     * Adds on the directory and suffix to a transcript filename
     */
    @LispMethod(comment = "Adds on the directory and suffix to a transcript filename")
    public static final SubLObject construct_transcript_filename_alt(SubLObject name) {
        {
            SubLObject filename = cconcatenate(com.cyc.cycjava.cycl.transcript_utilities.transcript_directory(), new SubLObject[]{ name, $str_alt21$_, com.cyc.cycjava.cycl.transcript_utilities.transcript_suffix() });
            return filename;
        }
    }

    /**
     * Adds on the directory and suffix to a transcript filename
     */
    @LispMethod(comment = "Adds on the directory and suffix to a transcript filename")
    public static SubLObject construct_transcript_filename(final SubLObject name) {
        final SubLObject filename = cconcatenate(transcript_directory(), new SubLObject[]{ name, $str20$_, transcript_suffix() });
        return filename;
    }

    /**
     * Returns a relative pathname to the current transcript directory, creating it if necessary.
     */
    @LispMethod(comment = "Returns a relative pathname to the current transcript directory, creating it if necessary.")
    public static final SubLObject transcript_directory_alt() {
        return com.cyc.cycjava.cycl.transcript_utilities.transcript_directory_int(kb_loaded());
    }

    /**
     * Returns a relative pathname to the current transcript directory, creating it if necessary.
     */
    @LispMethod(comment = "Returns a relative pathname to the current transcript directory, creating it if necessary.")
    public static SubLObject transcript_directory() {
        return transcript_directory_int(kb_loaded());
    }

    /**
     * Returns a relative pathname to the next transcript directory, creating it if necessary.
     */
    @LispMethod(comment = "Returns a relative pathname to the next transcript directory, creating it if necessary.")
    public static final SubLObject next_transcript_directory_alt() {
        return com.cyc.cycjava.cycl.transcript_utilities.transcript_directory_int(add(ONE_INTEGER, kb_loaded()));
    }

    /**
     * Returns a relative pathname to the next transcript directory, creating it if necessary.
     */
    @LispMethod(comment = "Returns a relative pathname to the next transcript directory, creating it if necessary.")
    public static SubLObject next_transcript_directory() {
        return transcript_directory_int(add(ONE_INTEGER, kb_loaded()));
    }

    public static final SubLObject transcript_directory_int_alt(SubLObject kb_number) {
        {
            SubLObject directory = file_utilities.cyc_home_subdirectory(list($$$transcripts, format(NIL, $str_alt23$_4__0D, kb_number)));
            if (NIL == Filesys.directory_p(directory)) {
                file_utilities.make_directory_recursive(directory, T, $$$0755);
            }
            return directory;
        }
    }

    public static SubLObject transcript_directory_int(final SubLObject kb_number) {
        final SubLObject directory = file_utilities.cyc_home_subdirectory(list($$$transcripts, operation_communication.kb_number_string(kb_number)));
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, T, UNPROVIDED);
        }
        return directory;
    }

    /**
     * Adds a tag to the transcript filename right before the .ts ending
     */
    @LispMethod(comment = "Adds a tag to the transcript filename right before the .ts ending")
    public static final SubLObject mark_transcript_filename_alt(SubLObject transcript, SubLObject mark) {
        SubLTrampolineFile.checkType(transcript, STRINGP);
        SubLTrampolineFile.checkType(mark, STRINGP);
        if (NIL != string_utilities.substringP($str_alt26$_TS, transcript, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
            return string_utilities.replace_substring(transcript, $str_alt26$_TS, cconcatenate($str_alt27$_, new SubLObject[]{ Strings.string_upcase(mark, UNPROVIDED, UNPROVIDED), $str_alt26$_TS }));
        } else {
            return string_utilities.replace_substring(transcript, $str_alt28$_ts, cconcatenate($str_alt27$_, new SubLObject[]{ Strings.string_downcase(mark, UNPROVIDED, UNPROVIDED), $str_alt28$_ts }));
        }
    }

    /**
     * Adds a tag to the transcript filename right before the .ts ending
     */
    @LispMethod(comment = "Adds a tag to the transcript filename right before the .ts ending")
    public static SubLObject mark_transcript_filename(final SubLObject transcript, final SubLObject mark) {
        assert NIL != stringp(transcript) : "! stringp(transcript) " + ("Types.stringp(transcript) " + "CommonSymbols.NIL != Types.stringp(transcript) ") + transcript;
        assert NIL != stringp(mark) : "! stringp(mark) " + ("Types.stringp(mark) " + "CommonSymbols.NIL != Types.stringp(mark) ") + mark;
        if (NIL != string_utilities.substringP($str23$_TS, transcript, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
            return string_utilities.replace_substring(transcript, $str23$_TS, cconcatenate($str24$_, new SubLObject[]{ Strings.string_upcase(mark, UNPROVIDED, UNPROVIDED), $str23$_TS }));
        }
        return string_utilities.replace_substring(transcript, $str25$_ts, cconcatenate($str24$_, new SubLObject[]{ Strings.string_downcase(mark, UNPROVIDED, UNPROVIDED), $str25$_ts }));
    }

    public static final SubLObject get_count_ops_data_alt(SubLObject pathname) {
        {
            SubLObject data = assoc(pathname, $count_ops_table$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
            if (NIL != data) {
                return data;
            } else {
                return list(pathname, ZERO_INTEGER, ZERO_INTEGER);
            }
        }
    }

    public static SubLObject get_count_ops_data(final SubLObject pathname) {
        final SubLObject data = assoc(pathname, $count_ops_table$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
        if (NIL != data) {
            return data;
        }
        return list(pathname, ZERO_INTEGER, ZERO_INTEGER);
    }

    public static final SubLObject get_current_op_count_alt(SubLObject pathname) {
        return second(com.cyc.cycjava.cycl.transcript_utilities.get_count_ops_data(pathname));
    }

    public static SubLObject get_current_op_count(final SubLObject pathname) {
        return second(get_count_ops_data(pathname));
    }

    public static final SubLObject get_current_position_alt(SubLObject pathname) {
        return third(com.cyc.cycjava.cycl.transcript_utilities.get_count_ops_data(pathname));
    }

    public static SubLObject get_current_position(final SubLObject pathname) {
        return third(get_count_ops_data(pathname));
    }

    public static final SubLObject update_count_ops_data_alt(SubLObject pathname, SubLObject new_op_count, SubLObject new_position) {
        {
            SubLObject new_table = remove(pathname, $count_ops_table$.getGlobalValue(), symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            new_table = cons(list(pathname, new_op_count, new_position), new_table);
            $count_ops_table$.setGlobalValue(new_table);
            return $count_ops_table$.getGlobalValue();
        }
    }

    public static SubLObject update_count_ops_data(final SubLObject pathname, final SubLObject new_op_count, final SubLObject new_position) {
        SubLObject new_table = remove(pathname, $count_ops_table$.getGlobalValue(), symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        new_table = cons(list(pathname, new_op_count, new_position), new_table);
        $count_ops_table$.setGlobalValue(new_table);
        return $count_ops_table$.getGlobalValue();
    }

    public static final SubLObject really_count_ops_alt(SubLObject pathname) {
        {
            SubLObject count = ZERO_INTEGER;
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt13$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject str = stream;
                            SubLObject expr = NIL;
                            for (expr = read_ignoring_errors(str, NIL, NIL); NIL != expr; expr = read_ignoring_errors(str, NIL, NIL)) {
                                if (NIL != expr) {
                                    count = add(count, ONE_INTEGER);
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
                }
            }
            return count;
        }
    }

    public static SubLObject really_count_ops(final SubLObject pathname) {
        SubLObject count = ZERO_INTEGER;
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str12$Unable_to_open__S, pathname);
                }
                SubLObject str;
                SubLObject expr;
                for (str = stream, expr = NIL, expr = read_ignoring_errors(str, NIL, NIL); NIL != expr; expr = read_ignoring_errors(str, NIL, NIL)) {
                    if (NIL != expr) {
                        count = add(count, ONE_INTEGER);
                    }
                }
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
        }
        return count;
    }

    public static final SubLObject count_operations_alt(SubLObject pathname) {
        {
            SubLObject op_count = com.cyc.cycjava.cycl.transcript_utilities.get_current_op_count(pathname);
            SubLObject position = com.cyc.cycjava.cycl.transcript_utilities.get_current_position(pathname);
            SubLObject lpc = ZERO_INTEGER;
            SubLObject rpc = ZERO_INTEGER;
            SubLObject inside_dqP = NIL;
            SubLObject preceding = NIL;
            if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt13$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject str = stream;
                            SubLObject len = file_length(str);
                            compatibility.set_file_position(str, position);
                            {
                                SubLObject ch = NIL;
                                for (ch = read_char(str, NIL, $EOF, UNPROVIDED); ch != $EOF; ch = read_char(str, NIL, $EOF, UNPROVIDED)) {
                                    if ((NIL != charE(CHAR_quotation, ch)) && (preceding != CHAR_backslash)) {
                                        inside_dqP = makeBoolean(NIL == inside_dqP);
                                    }
                                    if (NIL == inside_dqP) {
                                        if (NIL != charE(CHAR_lparen, ch)) {
                                            lpc = add(lpc, ONE_INTEGER);
                                        }
                                        if (NIL != charE(CHAR_rparen, ch)) {
                                            rpc = add(rpc, ONE_INTEGER);
                                            if (rpc.numG(ZERO_INTEGER) && rpc.numE(lpc)) {
                                                op_count = add(op_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                    preceding = ch;
                                }
                            }
                            position = compatibility.get_file_position(str);
                            if (len.numG($int$100000) && pathname.equalp(com.cyc.cycjava.cycl.transcript_utilities.master_transcript())) {
                                com.cyc.cycjava.cycl.transcript_utilities.set_approx_chars_per_op(integerDivide(len, op_count));
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
                }
            }
            com.cyc.cycjava.cycl.transcript_utilities.update_count_ops_data(pathname, op_count, position);
            return op_count;
        }
    }

    public static SubLObject count_operations(final SubLObject pathname) {
        SubLObject op_count = get_current_op_count(pathname);
        SubLObject position = get_current_position(pathname);
        SubLObject lpc = ZERO_INTEGER;
        SubLObject rpc = ZERO_INTEGER;
        SubLObject inside_dqP = NIL;
        SubLObject preceding = NIL;
        if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str12$Unable_to_open__S, pathname);
                }
                final SubLObject str = stream;
                final SubLObject len = file_length(str);
                compatibility.set_file_position(str, position);
                SubLObject ch;
                for (ch = NIL, ch = read_char(str, NIL, $EOF, UNPROVIDED); ch != $EOF; ch = read_char(str, NIL, $EOF, UNPROVIDED)) {
                    if ((NIL != charE(CHAR_quotation, ch)) && (!preceding.eql(CHAR_backslash))) {
                        inside_dqP = makeBoolean(NIL == inside_dqP);
                    }
                    if (NIL == inside_dqP) {
                        if (NIL != charE(CHAR_lparen, ch)) {
                            lpc = add(lpc, ONE_INTEGER);
                        }
                        if (NIL != charE(CHAR_rparen, ch)) {
                            rpc = add(rpc, ONE_INTEGER);
                            if (rpc.numG(ZERO_INTEGER) && rpc.numE(lpc)) {
                                op_count = add(op_count, ONE_INTEGER);
                            }
                        }
                    }
                    preceding = ch;
                }
                position = compatibility.get_file_position(str);
                if (len.numG($int$100000) && pathname.equalp(master_transcript())) {
                    set_approx_chars_per_op(integerDivide(len, op_count));
                }
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
        }
        update_count_ops_data(pathname, op_count, position);
        return op_count;
    }

    public static final SubLObject estimate_number_of_ops_alt(SubLObject filename) {
        {
            SubLObject len = file_utilities.get_file_length(filename);
            return integerDivide(len, com.cyc.cycjava.cycl.transcript_utilities.approx_chars_per_op());
        }
    }

    public static SubLObject estimate_number_of_ops(final SubLObject filename) {
        final SubLObject len = file_utilities.get_file_length(filename);
        return integerDivide(len, approx_chars_per_op());
    }

    public static final SubLObject collect_ops_in_range_alt(SubLObject transcript_pathname, SubLObject start_pos, SubLObject end_pos, SubLObject file_or_stream) {
        if (end_pos == UNPROVIDED) {
            end_pos = NIL;
        }
        if (file_or_stream == UNPROVIDED) {
            file_or_stream = T;
        }
        {
            SubLObject actual_count = ZERO_INTEGER;
            SubLObject ops = NIL;
            if (transcript_pathname.isString() && (NIL != Filesys.probe_file(transcript_pathname))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(transcript_pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt13$Unable_to_open__S, transcript_pathname);
                        }
                        {
                            SubLObject str = stream;
                            SubLObject expr = NIL;
                            for (expr = read_ignoring_errors(str, NIL, $EOF); !((expr == $EOF) || (end_pos.isInteger() && actual_count.numGE(end_pos))); expr = read_ignoring_errors(str, NIL, $EOF)) {
                                if (NIL != expr) {
                                    actual_count = add(actual_count, ONE_INTEGER);
                                }
                                if (actual_count.numGE(start_pos) && ((NIL == end_pos) || actual_count.numLE(end_pos))) {
                                    ops = cons(expr, ops);
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
                    ops = nreverse(ops);
                    if (file_or_stream.isString()) {
                        {
                            SubLObject stream_4 = NIL;
                            try {
                                stream_4 = compatibility.open_text(file_or_stream, $OUTPUT, NIL);
                                if (!stream_4.isStream()) {
                                    Errors.error($str_alt13$Unable_to_open__S, file_or_stream);
                                }
                                {
                                    SubLObject outstr = stream_4;
                                    SubLObject cdolist_list_var = ops;
                                    SubLObject op = NIL;
                                    for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                                        format(outstr, $str_alt34$_____s, op);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        if (stream_4.isStream()) {
                                            close(stream_4, UNPROVIDED);
                                        }
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    } else {
                        if (file_or_stream.isStream() || (file_or_stream == T)) {
                            {
                                SubLObject cdolist_list_var = ops;
                                SubLObject op = NIL;
                                for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                                    format(file_or_stream, $str_alt34$_____s, op);
                                }
                            }
                        } else {
                            Errors.error($str_alt35$_s_is_not_a_stream_or_pathname_st, file_or_stream);
                        }
                    }
                    return length(ops);
                }
            } else {
                format(T, $str_alt36$__The_file__s_does_not_exist__or_, transcript_pathname);
                return NIL;
            }
        }
    }

    public static SubLObject collect_ops_in_range(final SubLObject transcript_pathname, final SubLObject start_pos, SubLObject end_pos, SubLObject file_or_stream) {
        if (end_pos == UNPROVIDED) {
            end_pos = NIL;
        }
        if (file_or_stream == UNPROVIDED) {
            file_or_stream = T;
        }
        SubLObject actual_count = ZERO_INTEGER;
        SubLObject ops = NIL;
        if (transcript_pathname.isString() && (NIL != Filesys.probe_file(transcript_pathname))) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(transcript_pathname, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str12$Unable_to_open__S, transcript_pathname);
                }
                SubLObject str;
                SubLObject expr;
                for (str = stream, expr = NIL, expr = read_ignoring_errors(str, NIL, $EOF); (expr != $EOF) && ((!end_pos.isInteger()) || (!actual_count.numGE(end_pos))); expr = read_ignoring_errors(str, NIL, $EOF)) {
                    if (NIL != expr) {
                        actual_count = add(actual_count, ONE_INTEGER);
                    }
                    if (actual_count.numGE(start_pos) && ((NIL == end_pos) || actual_count.numLE(end_pos))) {
                        ops = cons(expr, ops);
                    }
                }
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
            ops = nreverse(ops);
            if (file_or_stream.isString()) {
                SubLObject stream_$4 = NIL;
                try {
                    stream_$4 = compatibility.open_text(file_or_stream, $OUTPUT);
                    if (!stream_$4.isStream()) {
                        Errors.error($str12$Unable_to_open__S, file_or_stream);
                    }
                    final SubLObject outstr = stream_$4;
                    SubLObject cdolist_list_var = ops;
                    SubLObject op = NIL;
                    op = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(outstr, $str31$_____s, op);
                        cdolist_list_var = cdolist_list_var.rest();
                        op = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream_$4.isStream()) {
                            close(stream_$4, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                    }
                }
            } else
                if (file_or_stream.isStream() || (file_or_stream == T)) {
                    SubLObject cdolist_list_var2 = ops;
                    SubLObject op2 = NIL;
                    op2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        format(file_or_stream, $str31$_____s, op2);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        op2 = cdolist_list_var2.first();
                    } 
                } else {
                    Errors.error($str32$_s_is_not_a_stream_or_pathname_st, file_or_stream);
                }

            return length(ops);
        }
        format(T, $str33$__The_file__s_does_not_exist__or_, transcript_pathname);
        return NIL;
    }

    public static SubLObject total_master_transcript_operations(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transcript_server.use_transcript_server()) {
            return transcript_server.transcript_server_kb_ops_count(kb);
        }
        if (!master_transcript().isString()) {
            return ZERO_INTEGER;
        }
        if (NIL != system_parameters.$really_count_transcript_ops$.getDynamicValue(thread)) {
            return count_operations(master_transcript());
        }
        return estimate_number_of_ops(master_transcript());
    }

    /**
     * Analyze TRANSCRIPT-FILENAME and return a list of 4 items:
     * (<total ops> <creation info> <rename info> <kill info>).
     * If an error occured,
     * (<ops read> <error message>)
     * is returned instead.
     */
    @LispMethod(comment = "Analyze TRANSCRIPT-FILENAME and return a list of 4 items:\r\n(<total ops> <creation info> <rename info> <kill info>).\r\nIf an error occured,\r\n(<ops read> <error message>)\r\nis returned instead.\nAnalyze TRANSCRIPT-FILENAME and return a list of 4 items:\n(<total ops> <creation info> <rename info> <kill info>).\nIf an error occured,\n(<ops read> <error message>)\nis returned instead.")
    public static final SubLObject constant_modifications_in_transcript_alt(SubLObject transcript_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(transcript_filename, STRINGP);
            com.cyc.cycjava.cycl.transcript_utilities.reset_transcript_rename_hash();
            com.cyc.cycjava.cycl.transcript_utilities.reset_transcript_create_hash();
            {
                SubLObject total_file_size = file_utilities.get_file_length(transcript_filename);
                SubLObject transcript_create_list = NIL;
                SubLObject transcript_rename_list = NIL;
                SubLObject transcript_kill_list = NIL;
                SubLObject op_count = ZERO_INTEGER;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL != Filesys.probe_file(transcript_filename)) {
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = compatibility.open_text(transcript_filename, $INPUT, NIL);
                                            if (!stream.isStream()) {
                                                Errors.error($str_alt13$Unable_to_open__S, transcript_filename);
                                            }
                                            {
                                                SubLObject transcript_stream = stream;
                                                {
                                                    SubLObject _prev_bind_0_5 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble(format(NIL, $str_alt39$Examining__A, transcript_filename));
                                                        {
                                                            SubLObject operation = NIL;
                                                            for (operation = read_one_transcript_operation(transcript_stream); NIL != operation; operation = read_one_transcript_operation(transcript_stream)) {
                                                                op_count = add(op_count, ONE_INTEGER);
                                                                note_percent_progress(compatibility.get_file_position(transcript_stream), total_file_size);
                                                                {
                                                                    SubLObject datum = operation;
                                                                    SubLObject current = datum;
                                                                    SubLObject encapsulated_cyclist = NIL;
                                                                    SubLObject cyc_image_id = NIL;
                                                                    SubLObject when = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                    encapsulated_cyclist = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                    cyc_image_id = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                    when = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                    {
                                                                        SubLObject temp = current.rest();
                                                                        current = current.first();
                                                                        {
                                                                            SubLObject function = NIL;
                                                                            SubLObject args = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt40);
                                                                            function = current.first();
                                                                            current = current.rest();
                                                                            args = current;
                                                                            current = temp;
                                                                            if (NIL == current) {
                                                                                {
                                                                                    SubLObject who = com.cyc.cycjava.cycl.transcript_utilities.encapsulated_cyclist_string(encapsulated_cyclist);
                                                                                    SubLObject pcase_var = function;
                                                                                    if (pcase_var.eql(FI_CREATE)) {
                                                                                        {
                                                                                            SubLObject datum_6 = args;
                                                                                            SubLObject current_7 = datum_6;
                                                                                            SubLObject name = NIL;
                                                                                            SubLObject external_id = NIL;
                                                                                            destructuring_bind_must_consp(current_7, datum_6, $list_alt42);
                                                                                            name = current_7.first();
                                                                                            current_7 = current_7.rest();
                                                                                            destructuring_bind_must_consp(current_7, datum_6, $list_alt42);
                                                                                            external_id = current_7.first();
                                                                                            current_7 = current_7.rest();
                                                                                            if (NIL == current_7) {
                                                                                                name = list_utilities.unquotify(name);
                                                                                                external_id = list_utilities.unquotify(external_id);
                                                                                                if (name.isString()) {
                                                                                                    com.cyc.cycjava.cycl.transcript_utilities.add_transcript_create_info(op_count, external_id, name, who, when);
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum_6, $list_alt42);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (pcase_var.eql(FI_RENAME)) {
                                                                                            {
                                                                                                SubLObject datum_8 = args;
                                                                                                SubLObject current_9 = datum_8;
                                                                                                SubLObject v_term = NIL;
                                                                                                SubLObject new_name = NIL;
                                                                                                destructuring_bind_must_consp(current_9, datum_8, $list_alt44);
                                                                                                v_term = current_9.first();
                                                                                                current_9 = current_9.rest();
                                                                                                destructuring_bind_must_consp(current_9, datum_8, $list_alt44);
                                                                                                new_name = current_9.first();
                                                                                                current_9 = current_9.rest();
                                                                                                if (NIL == current_9) {
                                                                                                    v_term = list_utilities.unquotify(v_term);
                                                                                                    new_name = list_utilities.unquotify(new_name);
                                                                                                    {
                                                                                                        SubLObject old_name = second(v_term);
                                                                                                        SubLObject external_id = third(v_term);
                                                                                                        if (old_name.isString() && new_name.isString()) {
                                                                                                            com.cyc.cycjava.cycl.transcript_utilities.add_transcript_rename_info(op_count, external_id, old_name, new_name, who, when);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    cdestructuring_bind_error(datum_8, $list_alt44);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (pcase_var.eql(FI_KILL)) {
                                                                                                {
                                                                                                    SubLObject datum_10 = args;
                                                                                                    SubLObject current_11 = datum_10;
                                                                                                    SubLObject v_term = NIL;
                                                                                                    destructuring_bind_must_consp(current_11, datum_10, $list_alt46);
                                                                                                    v_term = current_11.first();
                                                                                                    current_11 = current_11.rest();
                                                                                                    if (NIL == current_11) {
                                                                                                        v_term = list_utilities.unquotify(v_term);
                                                                                                        {
                                                                                                            SubLObject name = second(v_term);
                                                                                                            SubLObject external_id = third(v_term);
                                                                                                            if (name.isString()) {
                                                                                                                com.cyc.cycjava.cycl.transcript_utilities.rem_transcript_rename_info(external_id);
                                                                                                                if (NIL != com.cyc.cycjava.cycl.transcript_utilities.constant_created_in_transcript(external_id)) {
                                                                                                                    com.cyc.cycjava.cycl.transcript_utilities.rem_transcript_create_info(external_id);
                                                                                                                } else {
                                                                                                                    transcript_kill_list = cons(list(op_count, external_id, name, who, when), transcript_kill_list);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum_10, $list_alt46);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt40);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                        }
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
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    return list(op_count, error_message);
                } else {
                    transcript_kill_list = nreverse(transcript_kill_list);
                    transcript_rename_list = com.cyc.cycjava.cycl.transcript_utilities.sort_transcript_renames();
                    transcript_create_list = com.cyc.cycjava.cycl.transcript_utilities.sort_transcript_creates();
                    return list(op_count, transcript_create_list, transcript_rename_list, transcript_kill_list);
                }
            }
        }
    }

    /**
     * Analyze TRANSCRIPT-FILENAME and return a list of 4 items:
     * (<total ops> <creation info> <rename info> <kill info>).
     * If an error occured,
     * (<ops read> <error message>)
     * is returned instead.
     */
    @LispMethod(comment = "Analyze TRANSCRIPT-FILENAME and return a list of 4 items:\r\n(<total ops> <creation info> <rename info> <kill info>).\r\nIf an error occured,\r\n(<ops read> <error message>)\r\nis returned instead.\nAnalyze TRANSCRIPT-FILENAME and return a list of 4 items:\n(<total ops> <creation info> <rename info> <kill info>).\nIf an error occured,\n(<ops read> <error message>)\nis returned instead.")
    public static SubLObject constant_modifications_in_transcript(final SubLObject transcript_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(transcript_filename) : "! stringp(transcript_filename) " + ("Types.stringp(transcript_filename) " + "CommonSymbols.NIL != Types.stringp(transcript_filename) ") + transcript_filename;
        reset_transcript_rename_hash();
        reset_transcript_create_hash();
        final SubLObject total_file_size = file_utilities.get_file_length(transcript_filename);
        SubLObject transcript_create_list = NIL;
        SubLObject transcript_rename_list = NIL;
        SubLObject transcript_kill_list = NIL;
        SubLObject op_count = ZERO_INTEGER;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != Filesys.probe_file(transcript_filename)) {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(transcript_filename, $INPUT);
                            if (!stream.isStream()) {
                                Errors.error($str12$Unable_to_open__S, transcript_filename);
                            }
                            final SubLObject transcript_stream = stream;
                            final SubLObject _prev_bind_0_$5 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                try {
                                    noting_percent_progress_preamble(format(NIL, $str34$Examining__A, transcript_filename));
                                    SubLObject operation;
                                    SubLObject current;
                                    SubLObject datum;
                                    SubLObject encapsulated_cyclist;
                                    SubLObject cyc_image_id;
                                    SubLObject when;
                                    SubLObject temp;
                                    SubLObject function;
                                    SubLObject args;
                                    SubLObject who;
                                    SubLObject pcase_var;
                                    SubLObject current_$7;
                                    SubLObject datum_$6;
                                    SubLObject name;
                                    SubLObject external_id;
                                    SubLObject current_$8;
                                    SubLObject datum_$7;
                                    SubLObject v_term;
                                    SubLObject new_name;
                                    SubLObject old_name;
                                    SubLObject external_id2;
                                    SubLObject current_$9;
                                    SubLObject datum_$8;
                                    SubLObject name2;
                                    SubLObject external_id3;
                                    for (operation = NIL, operation = operation_communication.read_one_transcript_operation(transcript_stream); NIL != operation; operation = operation_communication.read_one_transcript_operation(transcript_stream)) {
                                        op_count = add(op_count, ONE_INTEGER);
                                        note_percent_progress(compatibility.get_file_position(transcript_stream), total_file_size);
                                        datum = current = operation;
                                        encapsulated_cyclist = NIL;
                                        cyc_image_id = NIL;
                                        when = NIL;
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        encapsulated_cyclist = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        cyc_image_id = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        when = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        temp = current.rest();
                                        current = current.first();
                                        function = NIL;
                                        args = NIL;
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        function = current.first();
                                        current = args = current.rest();
                                        current = temp;
                                        if (NIL == current) {
                                            who = encapsulated_cyclist_string(encapsulated_cyclist);
                                            pcase_var = function;
                                            if (pcase_var.eql(FI_CREATE)) {
                                                datum_$6 = current_$7 = args;
                                                name = NIL;
                                                external_id = NIL;
                                                destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                                                name = current_$7.first();
                                                current_$7 = current_$7.rest();
                                                destructuring_bind_must_consp(current_$7, datum_$6, $list37);
                                                external_id = current_$7.first();
                                                current_$7 = current_$7.rest();
                                                if (NIL == current_$7) {
                                                    name = list_utilities.unquotify(name);
                                                    external_id = list_utilities.unquotify(external_id);
                                                    if (name.isString()) {
                                                        add_transcript_create_info(op_count, external_id, name, who, when);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_$6, $list37);
                                                }
                                            } else
                                                if (pcase_var.eql(FI_RENAME)) {
                                                    datum_$7 = current_$8 = args;
                                                    v_term = NIL;
                                                    new_name = NIL;
                                                    destructuring_bind_must_consp(current_$8, datum_$7, $list39);
                                                    v_term = current_$8.first();
                                                    current_$8 = current_$8.rest();
                                                    destructuring_bind_must_consp(current_$8, datum_$7, $list39);
                                                    new_name = current_$8.first();
                                                    current_$8 = current_$8.rest();
                                                    if (NIL == current_$8) {
                                                        v_term = list_utilities.unquotify(v_term);
                                                        new_name = list_utilities.unquotify(new_name);
                                                        old_name = second(v_term);
                                                        external_id2 = third(v_term);
                                                        if (old_name.isString() && new_name.isString()) {
                                                            add_transcript_rename_info(op_count, external_id2, old_name, new_name, who, when);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum_$7, $list39);
                                                    }
                                                } else
                                                    if (pcase_var.eql(FI_KILL)) {
                                                        datum_$8 = current_$9 = args;
                                                        v_term = NIL;
                                                        destructuring_bind_must_consp(current_$9, datum_$8, $list41);
                                                        v_term = current_$9.first();
                                                        current_$9 = current_$9.rest();
                                                        if (NIL == current_$9) {
                                                            v_term = list_utilities.unquotify(v_term);
                                                            name2 = second(v_term);
                                                            external_id3 = third(v_term);
                                                            if (name2.isString()) {
                                                                rem_transcript_rename_info(external_id3);
                                                                if (NIL != constant_created_in_transcript(external_id3)) {
                                                                    rem_transcript_create_info(external_id3);
                                                                } else {
                                                                    transcript_kill_list = cons(list(op_count, external_id3, name2, who, when), transcript_kill_list);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_$8, $list41);
                                                        }
                                                    }


                                        } else {
                                            cdestructuring_bind_error(datum, $list35);
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
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
        if (NIL != error_message) {
            return list(op_count, error_message);
        }
        transcript_kill_list = nreverse(transcript_kill_list);
        transcript_rename_list = sort_transcript_renames();
        transcript_create_list = sort_transcript_creates();
        return list(op_count, transcript_create_list, transcript_rename_list, transcript_kill_list);
    }

    /**
     * Write out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.
     * If TRANSCRIPT-FILENAME is null, then the current master transcript is used.
     */
    @LispMethod(comment = "Write out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\r\nIf TRANSCRIPT-FILENAME is null, then the current master transcript is used.\nWrite out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\nIf TRANSCRIPT-FILENAME is null, then the current master transcript is used.")
    public static final SubLObject report_constant_modifications_in_transcript_alt(SubLObject transcript_filename, SubLObject stream) {
        if (transcript_filename == UNPROVIDED) {
            transcript_filename = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == transcript_filename) {
                transcript_filename = com.cyc.cycjava.cycl.transcript_utilities.construct_transcript_filename(com.cyc.cycjava.cycl.transcript_utilities.make_master_transcript_filename(UNPROVIDED));
            }
            if (transcript_filename.isString() && (NIL != Filesys.probe_file(transcript_filename))) {
                {
                    SubLObject constant_modification_info = com.cyc.cycjava.cycl.transcript_utilities.constant_modifications_in_transcript(transcript_filename);
                    SubLObject op_count = constant_modification_info.first();
                    if (stream == StreamsLow.$standard_output$.getDynamicValue(thread)) {
                        terpri(stream);
                    }
                    format(stream, $str_alt47$____Transcript____S, transcript_filename);
                    format(stream, $str_alt48$______Examined______A, numeric_date_utilities.timestring(UNPROVIDED));
                    format(stream, $str_alt49$______Total_Ops_____S, op_count);
                    if (length(constant_modification_info).numE(TWO_INTEGER)) {
                        format(stream, $str_alt50$______error_during_transcript_ana, op_count);
                        format(stream, $str_alt51$___A, second(constant_modification_info));
                    } else {
                        {
                            SubLObject datum = constant_modification_info.rest();
                            SubLObject current = datum;
                            SubLObject transcript_create_list = NIL;
                            SubLObject transcript_rename_list = NIL;
                            SubLObject transcript_kill_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt52);
                            transcript_create_list = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt52);
                            transcript_rename_list = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt52);
                            transcript_kill_list = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != transcript_kill_list) {
                                    terpri(stream);
                                    format(stream, $str_alt53$_______S_KILLED, length(transcript_kill_list));
                                    {
                                        SubLObject cdolist_list_var = transcript_kill_list;
                                        SubLObject info = NIL;
                                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum_13 = info;
                                                SubLObject current_14 = datum_13;
                                                SubLObject op_num = NIL;
                                                SubLObject external_id = NIL;
                                                SubLObject name = NIL;
                                                SubLObject who = NIL;
                                                SubLObject when = NIL;
                                                destructuring_bind_must_consp(current_14, datum_13, $list_alt54);
                                                op_num = current_14.first();
                                                current_14 = current_14.rest();
                                                destructuring_bind_must_consp(current_14, datum_13, $list_alt54);
                                                external_id = current_14.first();
                                                current_14 = current_14.rest();
                                                destructuring_bind_must_consp(current_14, datum_13, $list_alt54);
                                                name = current_14.first();
                                                current_14 = current_14.rest();
                                                destructuring_bind_must_consp(current_14, datum_13, $list_alt54);
                                                who = current_14.first();
                                                current_14 = current_14.rest();
                                                destructuring_bind_must_consp(current_14, datum_13, $list_alt54);
                                                when = current_14.first();
                                                current_14 = current_14.rest();
                                                if (NIL == current_14) {
                                                    format(stream, $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                                                } else {
                                                    cdestructuring_bind_error(datum_13, $list_alt54);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL != transcript_rename_list) {
                                    terpri(stream);
                                    format(stream, $str_alt56$_______S_RENAMED, length(transcript_rename_list));
                                    {
                                        SubLObject cdolist_list_var = transcript_rename_list;
                                        SubLObject info = NIL;
                                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum_15 = info;
                                                SubLObject current_16 = datum_15;
                                                SubLObject op_num = NIL;
                                                SubLObject external_id = NIL;
                                                SubLObject old_name = NIL;
                                                SubLObject new_name = NIL;
                                                SubLObject who = NIL;
                                                SubLObject when = NIL;
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                op_num = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                external_id = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                old_name = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                new_name = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                who = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt57);
                                                when = current_16.first();
                                                current_16 = current_16.rest();
                                                if (NIL == current_16) {
                                                    format(stream, $str_alt58$__EXTERNAL_ID__S____A_to__A_by__A, new SubLObject[]{ external_id, old_name, new_name, who, when });
                                                } else {
                                                    cdestructuring_bind_error(datum_15, $list_alt57);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL != transcript_create_list) {
                                    terpri(stream);
                                    format(stream, $str_alt59$_______S_CREATED, length(transcript_create_list));
                                    {
                                        SubLObject cdolist_list_var = transcript_create_list;
                                        SubLObject info = NIL;
                                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum_17 = info;
                                                SubLObject current_18 = datum_17;
                                                SubLObject op_num = NIL;
                                                SubLObject external_id = NIL;
                                                SubLObject name = NIL;
                                                SubLObject who = NIL;
                                                SubLObject when = NIL;
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt54);
                                                op_num = current_18.first();
                                                current_18 = current_18.rest();
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt54);
                                                external_id = current_18.first();
                                                current_18 = current_18.rest();
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt54);
                                                name = current_18.first();
                                                current_18 = current_18.rest();
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt54);
                                                who = current_18.first();
                                                current_18 = current_18.rest();
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt54);
                                                when = current_18.first();
                                                current_18 = current_18.rest();
                                                if (NIL == current_18) {
                                                    format(stream, $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                                                } else {
                                                    cdestructuring_bind_error(datum_17, $list_alt54);
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject transcript_no_comment_list = com.cyc.cycjava.cycl.transcript_utilities.get_no_comments(transcript_create_list);
                                    if (NIL != transcript_no_comment_list) {
                                        terpri(stream);
                                        format(stream, $str_alt60$_______S_NEED_COMMENTS, length(transcript_no_comment_list));
                                        {
                                            SubLObject cdolist_list_var = transcript_no_comment_list;
                                            SubLObject info = NIL;
                                            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_19 = info;
                                                    SubLObject current_20 = datum_19;
                                                    SubLObject op_num = NIL;
                                                    SubLObject external_id = NIL;
                                                    SubLObject name = NIL;
                                                    SubLObject who = NIL;
                                                    SubLObject when = NIL;
                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt54);
                                                    op_num = current_20.first();
                                                    current_20 = current_20.rest();
                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt54);
                                                    external_id = current_20.first();
                                                    current_20 = current_20.rest();
                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt54);
                                                    name = current_20.first();
                                                    current_20 = current_20.rest();
                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt54);
                                                    who = current_20.first();
                                                    current_20 = current_20.rest();
                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt54);
                                                    when = current_20.first();
                                                    current_20 = current_20.rest();
                                                    if (NIL == current_20) {
                                                        format(stream, $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                                                    } else {
                                                        cdestructuring_bind_error(datum_19, $list_alt54);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject units_and_comments_list = com.cyc.cycjava.cycl.transcript_utilities.get_units_and_comments(transcript_create_list);
                                    if (NIL != units_and_comments_list) {
                                        terpri(stream);
                                        format(stream, $str_alt61$______NEW_CONSTANTS_WITH_COMMENTS);
                                        {
                                            SubLObject cdolist_list_var = units_and_comments_list;
                                            SubLObject info = NIL;
                                            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_21 = info;
                                                    SubLObject current_22 = datum_21;
                                                    SubLObject info_23 = NIL;
                                                    SubLObject name = NIL;
                                                    SubLObject comments = NIL;
                                                    destructuring_bind_must_consp(current_22, datum_21, $list_alt62);
                                                    info_23 = current_22.first();
                                                    current_22 = current_22.rest();
                                                    destructuring_bind_must_consp(current_22, datum_21, $list_alt62);
                                                    name = current_22.first();
                                                    current_22 = current_22.rest();
                                                    destructuring_bind_must_consp(current_22, datum_21, $list_alt62);
                                                    comments = current_22.first();
                                                    current_22 = current_22.rest();
                                                    if (NIL == current_22) {
                                                        format(stream, $str_alt63$__EXTERNAL_ID__S____A____A__, new SubLObject[]{ info_23.first(), name, comments.first() });
                                                    } else {
                                                        cdestructuring_bind_error(datum_21, $list_alt62);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject transcript_nl_list = com.cyc.cycjava.cycl.transcript_utilities.get_nl_notables(transcript_create_list);
                                    if (NIL != transcript_nl_list) {
                                        terpri(stream);
                                        format(stream, $str_alt64$_______S_NEED_NL, length(transcript_nl_list.first()));
                                        {
                                            SubLObject cdolist_list_var = transcript_nl_list.first();
                                            SubLObject info = NIL;
                                            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_24 = info;
                                                    SubLObject current_25 = datum_24;
                                                    SubLObject op_num = NIL;
                                                    SubLObject external_id = NIL;
                                                    SubLObject name = NIL;
                                                    SubLObject who = NIL;
                                                    SubLObject when = NIL;
                                                    destructuring_bind_must_consp(current_25, datum_24, $list_alt54);
                                                    op_num = current_25.first();
                                                    current_25 = current_25.rest();
                                                    destructuring_bind_must_consp(current_25, datum_24, $list_alt54);
                                                    external_id = current_25.first();
                                                    current_25 = current_25.rest();
                                                    destructuring_bind_must_consp(current_25, datum_24, $list_alt54);
                                                    name = current_25.first();
                                                    current_25 = current_25.rest();
                                                    destructuring_bind_must_consp(current_25, datum_24, $list_alt54);
                                                    who = current_25.first();
                                                    current_25 = current_25.rest();
                                                    destructuring_bind_must_consp(current_25, datum_24, $list_alt54);
                                                    when = current_25.first();
                                                    current_25 = current_25.rest();
                                                    if (NIL == current_25) {
                                                        format(stream, $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                                                    } else {
                                                        cdestructuring_bind_error(datum_24, $list_alt54);
                                                    }
                                                }
                                            }
                                        }
                                        terpri(stream);
                                        format(stream, $str_alt65$_______S_NEED_GEN, length(second(transcript_nl_list)));
                                        {
                                            SubLObject cdolist_list_var = second(transcript_nl_list);
                                            SubLObject info = NIL;
                                            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_26 = info;
                                                    SubLObject current_27 = datum_26;
                                                    SubLObject op_num = NIL;
                                                    SubLObject external_id = NIL;
                                                    SubLObject name = NIL;
                                                    SubLObject who = NIL;
                                                    SubLObject when = NIL;
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt54);
                                                    op_num = current_27.first();
                                                    current_27 = current_27.rest();
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt54);
                                                    external_id = current_27.first();
                                                    current_27 = current_27.rest();
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt54);
                                                    name = current_27.first();
                                                    current_27 = current_27.rest();
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt54);
                                                    who = current_27.first();
                                                    current_27 = current_27.rest();
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt54);
                                                    when = current_27.first();
                                                    current_27 = current_27.rest();
                                                    if (NIL == current_27) {
                                                        format(stream, $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                                                    } else {
                                                        cdestructuring_bind_error(datum_26, $list_alt54);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return T;
                            } else {
                                cdestructuring_bind_error(datum, $list_alt52);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Write out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.
     * If TRANSCRIPT-FILENAME is null, then the current master transcript is used.
     */
    @LispMethod(comment = "Write out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\r\nIf TRANSCRIPT-FILENAME is null, then the current master transcript is used.\nWrite out to STREAM a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\nIf TRANSCRIPT-FILENAME is null, then the current master transcript is used.")
    public static SubLObject report_constant_modifications_in_transcript(SubLObject transcript_filename, SubLObject stream) {
        if (transcript_filename == UNPROVIDED) {
            transcript_filename = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == transcript_filename) {
            transcript_filename = construct_transcript_filename(make_master_transcript_filename(UNPROVIDED));
        }
        if (transcript_filename.isString() && (NIL != Filesys.probe_file(transcript_filename))) {
            final SubLObject constant_modification_info = constant_modifications_in_transcript(transcript_filename);
            final SubLObject op_count = constant_modification_info.first();
            if (stream.eql(StreamsLow.$standard_output$.getDynamicValue(thread))) {
                terpri(stream);
            }
            format(stream, $str42$____Transcript____S, transcript_filename);
            format(stream, $str43$______Examined______A, numeric_date_utilities.timestring(UNPROVIDED));
            format(stream, $str44$______Total_Ops_____S, op_count);
            if (length(constant_modification_info).numE(TWO_INTEGER)) {
                format(stream, $str45$______error_during_transcript_ana, op_count);
                format(stream, $str46$___A, second(constant_modification_info));
            } else {
                SubLObject current;
                final SubLObject datum = current = constant_modification_info.rest();
                SubLObject transcript_create_list = NIL;
                SubLObject transcript_rename_list = NIL;
                SubLObject transcript_kill_list = NIL;
                destructuring_bind_must_consp(current, datum, $list47);
                transcript_create_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list47);
                transcript_rename_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list47);
                transcript_kill_list = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != transcript_kill_list) {
                        terpri(stream);
                        format(stream, $str48$_______S_KILLED, length(transcript_kill_list));
                        SubLObject cdolist_list_var = transcript_kill_list;
                        SubLObject info = NIL;
                        info = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current_$15;
                            final SubLObject datum_$14 = current_$15 = info;
                            SubLObject op_num = NIL;
                            SubLObject external_id = NIL;
                            SubLObject name = NIL;
                            SubLObject who = NIL;
                            SubLObject when = NIL;
                            destructuring_bind_must_consp(current_$15, datum_$14, $list49);
                            op_num = current_$15.first();
                            current_$15 = current_$15.rest();
                            destructuring_bind_must_consp(current_$15, datum_$14, $list49);
                            external_id = current_$15.first();
                            current_$15 = current_$15.rest();
                            destructuring_bind_must_consp(current_$15, datum_$14, $list49);
                            name = current_$15.first();
                            current_$15 = current_$15.rest();
                            destructuring_bind_must_consp(current_$15, datum_$14, $list49);
                            who = current_$15.first();
                            current_$15 = current_$15.rest();
                            destructuring_bind_must_consp(current_$15, datum_$14, $list49);
                            when = current_$15.first();
                            current_$15 = current_$15.rest();
                            if (NIL == current_$15) {
                                format(stream, $str50$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                            } else {
                                cdestructuring_bind_error(datum_$14, $list49);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            info = cdolist_list_var.first();
                        } 
                    }
                    if (NIL != transcript_rename_list) {
                        terpri(stream);
                        format(stream, $str51$_______S_RENAMED, length(transcript_rename_list));
                        SubLObject cdolist_list_var = transcript_rename_list;
                        SubLObject info = NIL;
                        info = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current_$16;
                            final SubLObject datum_$15 = current_$16 = info;
                            SubLObject op_num = NIL;
                            SubLObject external_id = NIL;
                            SubLObject old_name = NIL;
                            SubLObject new_name = NIL;
                            SubLObject who2 = NIL;
                            SubLObject when2 = NIL;
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            op_num = current_$16.first();
                            current_$16 = current_$16.rest();
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            external_id = current_$16.first();
                            current_$16 = current_$16.rest();
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            old_name = current_$16.first();
                            current_$16 = current_$16.rest();
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            new_name = current_$16.first();
                            current_$16 = current_$16.rest();
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            who2 = current_$16.first();
                            current_$16 = current_$16.rest();
                            destructuring_bind_must_consp(current_$16, datum_$15, $list52);
                            when2 = current_$16.first();
                            current_$16 = current_$16.rest();
                            if (NIL == current_$16) {
                                format(stream, $str53$__EXTERNAL_ID__S____A_to__A_by__A, new SubLObject[]{ external_id, old_name, new_name, who2, when2 });
                            } else {
                                cdestructuring_bind_error(datum_$15, $list52);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            info = cdolist_list_var.first();
                        } 
                    }
                    if (NIL != transcript_create_list) {
                        terpri(stream);
                        format(stream, $str54$_______S_CREATED, length(transcript_create_list));
                        SubLObject cdolist_list_var = transcript_create_list;
                        SubLObject info = NIL;
                        info = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current_$17;
                            final SubLObject datum_$16 = current_$17 = info;
                            SubLObject op_num = NIL;
                            SubLObject external_id = NIL;
                            SubLObject name = NIL;
                            SubLObject who = NIL;
                            SubLObject when = NIL;
                            destructuring_bind_must_consp(current_$17, datum_$16, $list49);
                            op_num = current_$17.first();
                            current_$17 = current_$17.rest();
                            destructuring_bind_must_consp(current_$17, datum_$16, $list49);
                            external_id = current_$17.first();
                            current_$17 = current_$17.rest();
                            destructuring_bind_must_consp(current_$17, datum_$16, $list49);
                            name = current_$17.first();
                            current_$17 = current_$17.rest();
                            destructuring_bind_must_consp(current_$17, datum_$16, $list49);
                            who = current_$17.first();
                            current_$17 = current_$17.rest();
                            destructuring_bind_must_consp(current_$17, datum_$16, $list49);
                            when = current_$17.first();
                            current_$17 = current_$17.rest();
                            if (NIL == current_$17) {
                                format(stream, $str50$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[]{ external_id, name, who, when });
                            } else {
                                cdestructuring_bind_error(datum_$16, $list49);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            info = cdolist_list_var.first();
                        } 
                    }
                    return T;
                }
                cdestructuring_bind_error(datum, $list47);
            }
        }
        return NIL;
    }

    /**
     * Write out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.
     * If TRANSCRIPT-FILENAME in null, then the current master transcript is used.
     */
    @LispMethod(comment = "Write out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\r\nIf TRANSCRIPT-FILENAME in null, then the current master transcript is used.\nWrite out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\nIf TRANSCRIPT-FILENAME in null, then the current master transcript is used.")
    public static final SubLObject report_constant_modifications_in_transcript_to_file_alt(SubLObject report_file, SubLObject transcript_filename) {
        if (transcript_filename == UNPROVIDED) {
            transcript_filename = NIL;
        }
        SubLTrampolineFile.checkType(report_file, STRINGP);
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(report_file, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt13$Unable_to_open__S, report_file);
                }
                {
                    SubLObject stream_28 = stream;
                    com.cyc.cycjava.cycl.transcript_utilities.report_constant_modifications_in_transcript(transcript_filename, stream_28);
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
        }
        return NIL;
    }

    @LispMethod(comment = "Write out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\r\nIf TRANSCRIPT-FILENAME in null, then the current master transcript is used.\nWrite out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.\nIf TRANSCRIPT-FILENAME in null, then the current master transcript is used.")
    public static SubLObject report_constant_modifications_in_transcript_to_file(final SubLObject report_file, SubLObject transcript_filename) {
        if (transcript_filename == UNPROVIDED) {
            transcript_filename = NIL;
        }
        assert NIL != stringp(report_file) : "! stringp(report_file) " + ("Types.stringp(report_file) " + "CommonSymbols.NIL != Types.stringp(report_file) ") + report_file;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(report_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str12$Unable_to_open__S, report_file);
            }
            final SubLObject stream_$20 = stream;
            report_constant_modifications_in_transcript(transcript_filename, stream_$20);
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
    }/**
     * Write out to REPORT-FILE a summary of all the atomic constants killed, renamed and created within TRANSCRIPT-FILENAME.
     * If TRANSCRIPT-FILENAME in null, then the current master transcript is used.
     */


    /**
     * Return a readable string for ENCAPSUATED-CYCLIST, which is expected to be the
     * result of (encapsulate <some cyclist>)
     */
    @LispMethod(comment = "Return a readable string for ENCAPSUATED-CYCLIST, which is expected to be the\r\nresult of (encapsulate <some cyclist>)\nReturn a readable string for ENCAPSUATED-CYCLIST, which is expected to be the\nresult of (encapsulate <some cyclist>)")
    public static final SubLObject encapsulated_cyclist_string_alt(SubLObject encapsuated_cyclist) {
        {
            SubLObject v_term = encapsulation.unencapsulate_partial(encapsuated_cyclist);
            if (NIL != constant_p(v_term)) {
                return constants_high.constant_name(v_term);
            } else {
                return princ_to_string(v_term);
            }
        }
    }

    @LispMethod(comment = "Return a readable string for ENCAPSUATED-CYCLIST, which is expected to be the\r\nresult of (encapsulate <some cyclist>)\nReturn a readable string for ENCAPSUATED-CYCLIST, which is expected to be the\nresult of (encapsulate <some cyclist>)")
    public static SubLObject encapsulated_cyclist_string(final SubLObject encapsuated_cyclist) {
        final SubLObject v_term = encapsulation.unencapsulate_partial(encapsuated_cyclist);
        if (NIL != constant_p(v_term)) {
            return constants_high.constant_name(v_term);
        }
        return princ_to_string(v_term);
    }/**
     * Return a readable string for ENCAPSUATED-CYCLIST, which is expected to be the
     * result of (encapsulate <some cyclist>)
     */


    public static final SubLObject reset_transcript_rename_hash_alt() {
        if (!$transcript_rename_hash$.getGlobalValue().isHashtable()) {
            $transcript_rename_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        clrhash($transcript_rename_hash$.getGlobalValue());
        return NIL;
    }

    public static SubLObject reset_transcript_rename_hash() {
        if (!$transcript_rename_hash$.getGlobalValue().isHashtable()) {
            $transcript_rename_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        clrhash($transcript_rename_hash$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject sort_transcript_renames_alt() {
        return hash_table_utilities.sort_hash_table_data($transcript_rename_hash$.getGlobalValue(), symbol_function($sym68$_), symbol_function(FIRST));
    }

    public static SubLObject sort_transcript_renames() {
        return hash_table_utilities.sort_hash_table_data($transcript_rename_hash$.getGlobalValue(), symbol_function($sym57$_), symbol_function(FIRST));
    }

    public static final SubLObject add_transcript_rename_info_alt(SubLObject op_count, SubLObject external_id, SubLObject old_name, SubLObject new_name, SubLObject who, SubLObject when) {
        sethash(external_id, $transcript_rename_hash$.getGlobalValue(), list(op_count, external_id, old_name, new_name, who, when));
        return NIL;
    }

    public static SubLObject add_transcript_rename_info(final SubLObject op_count, final SubLObject external_id, final SubLObject old_name, final SubLObject new_name, final SubLObject who, final SubLObject when) {
        sethash(external_id, $transcript_rename_hash$.getGlobalValue(), list(op_count, external_id, old_name, new_name, who, when));
        return NIL;
    }

    public static final SubLObject rem_transcript_rename_info_alt(SubLObject external_id) {
        remhash(external_id, $transcript_rename_hash$.getGlobalValue());
        return NIL;
    }

    public static SubLObject rem_transcript_rename_info(final SubLObject external_id) {
        remhash(external_id, $transcript_rename_hash$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject reset_transcript_create_hash_alt() {
        if (!$transcript_create_hash$.getGlobalValue().isHashtable()) {
            $transcript_create_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        clrhash($transcript_create_hash$.getGlobalValue());
        return NIL;
    }

    public static SubLObject reset_transcript_create_hash() {
        if (!$transcript_create_hash$.getGlobalValue().isHashtable()) {
            $transcript_create_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        clrhash($transcript_create_hash$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject sort_transcript_creates_alt() {
        return hash_table_utilities.sort_hash_table_data($transcript_create_hash$.getGlobalValue(), symbol_function($sym68$_), symbol_function(FIRST));
    }

    public static SubLObject sort_transcript_creates() {
        return hash_table_utilities.sort_hash_table_data($transcript_create_hash$.getGlobalValue(), symbol_function($sym57$_), symbol_function(FIRST));
    }

    public static final SubLObject add_transcript_create_info_alt(SubLObject op_count, SubLObject external_id, SubLObject name, SubLObject who, SubLObject when) {
        sethash(external_id, $transcript_create_hash$.getGlobalValue(), list(op_count, external_id, name, who, when));
        return NIL;
    }

    public static SubLObject add_transcript_create_info(final SubLObject op_count, final SubLObject external_id, final SubLObject name, final SubLObject who, final SubLObject when) {
        sethash(external_id, $transcript_create_hash$.getGlobalValue(), list(op_count, external_id, name, who, when));
        return NIL;
    }

    public static final SubLObject constant_created_in_transcript_alt(SubLObject external_id) {
        return consp(gethash(external_id, $transcript_create_hash$.getGlobalValue(), NIL));
    }

    public static SubLObject constant_created_in_transcript(final SubLObject external_id) {
        return consp(gethash(external_id, $transcript_create_hash$.getGlobalValue(), NIL));
    }

    public static final SubLObject rem_transcript_create_info_alt(SubLObject external_id) {
        remhash(external_id, $transcript_create_hash$.getGlobalValue());
        return NIL;
    }

    public static SubLObject rem_transcript_create_info(final SubLObject external_id) {
        remhash(external_id, $transcript_create_hash$.getGlobalValue());
        return NIL;
    }

    /**
     * Generate a KE Text file from a transcript and write it to a file.
     */
    @LispMethod(comment = "Generate a KE Text file from a transcript and write it to a file.")
    public static final SubLObject write_specific_transcript_file_as_ke_text_alt(SubLObject transcript_filename, SubLObject output_filename) {
        SubLTrampolineFile.checkType(transcript_filename, STRINGP);
        SubLTrampolineFile.checkType(output_filename, STRINGP);
        if (NIL == Filesys.probe_file(transcript_filename)) {
            return $$$transcript_file_not_found;
        }
        {
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(output_filename, $OUTPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt13$Unable_to_open__S, output_filename);
                                    }
                                    {
                                        SubLObject output_stream = stream;
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.transcript_utilities.transcript_file_to_ke_text(transcript_filename);
                                        SubLObject ke_text_string = NIL;
                                        for (ke_text_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ke_text_string = cdolist_list_var.first()) {
                                            format(output_stream, $str_alt87$_A__, ke_text_string);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_29 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_29);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                return error_message;
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Generate a KE Text file from a transcript and write it to a file.")
    public static SubLObject write_specific_transcript_file_as_ke_text(final SubLObject transcript_filename, final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(transcript_filename, STRINGP);
        SubLTrampolineFile.enforceType(output_filename, STRINGP);
        if (NIL == Filesys.probe_file(transcript_filename)) {
            return $$$transcript_file_not_found;
        }
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(output_filename, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str12$Unable_to_open__S, output_filename);
                        }
                        final SubLObject output_stream = stream;
                        SubLObject cdolist_list_var = transcript_file_to_ke_text(transcript_filename);
                        SubLObject ke_text_string = NIL;
                        ke_text_string = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format(output_stream, $str61$_A__, ke_text_string);
                            cdolist_list_var = cdolist_list_var.rest();
                            ke_text_string = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
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
        if (NIL != error_message) {
            return error_message;
        }
        return NIL;
    }/**
     * Generate a KE Text file from a transcript and write it to a file.
     */


    /**
     * Translate a transcript file (TRANSCRIPT-FILENAME) into a list of string representing the KE File that would create that transcript.  The list of strings can be output one per line to create the text KE file.
     */
    @LispMethod(comment = "Translate a transcript file (TRANSCRIPT-FILENAME) into a list of string representing the KE File that would create that transcript.  The list of strings can be output one per line to create the text KE file.")
    public static final SubLObject transcript_file_to_ke_text_alt(SubLObject transcript_filename) {
        {
            SubLObject current_mt = mt_vars.$default_assert_mt$.getGlobalValue();
            SubLObject force_mt_printP = NIL;
            SubLObject enter_mode = $ENTER;
            SubLObject current_constant = NIL;
            SubLObject out_string_list = NIL;
            SubLObject error_message = NIL;
            if ((!transcript_filename.isString()) || (NIL == Filesys.probe_file(transcript_filename))) {
                return NIL;
            }
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(transcript_filename, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt13$Unable_to_open__S, transcript_filename);
                                    }
                                    {
                                        SubLObject transcript_stream = stream;
                                        SubLObject operation = NIL;
                                        for (operation = read_one_transcript_operation(transcript_stream); NIL != operation; operation = read_one_transcript_operation(transcript_stream)) {
                                            {
                                                SubLObject datum = operation;
                                                SubLObject current = datum;
                                                SubLObject encapsulated_cyclist = NIL;
                                                SubLObject cyc_image_id = NIL;
                                                SubLObject when = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                encapsulated_cyclist = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                cyc_image_id = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                when = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                {
                                                    SubLObject temp = current.rest();
                                                    current = current.first();
                                                    {
                                                        SubLObject function = NIL;
                                                        SubLObject args = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt40);
                                                        function = current.first();
                                                        current = current.rest();
                                                        args = current;
                                                        current = temp;
                                                        if (NIL == current) {
                                                            {
                                                                SubLObject pcase_var = function;
                                                                if (pcase_var.eql(FI_CREATE) || pcase_var.eql(FI_FIND_OR_CREATE)) {
                                                                    {
                                                                        SubLObject datum_30 = args;
                                                                        SubLObject current_31 = datum_30;
                                                                        SubLObject name = NIL;
                                                                        SubLObject external_id = NIL;
                                                                        destructuring_bind_must_consp(current_31, datum_30, $list_alt42);
                                                                        name = current_31.first();
                                                                        current_31 = current_31.rest();
                                                                        destructuring_bind_must_consp(current_31, datum_30, $list_alt42);
                                                                        external_id = current_31.first();
                                                                        current_31 = current_31.rest();
                                                                        if (NIL == current_31) {
                                                                            name = list_utilities.unquotify(name);
                                                                            external_id = list_utilities.unquotify(external_id);
                                                                            if (name.isString()) {
                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                out_string_list = cons(cconcatenate($str_alt95$Constant__, new SubLObject[]{ name, $str_alt21$_ }), out_string_list);
                                                                                current_constant = name;
                                                                                force_mt_printP = T;
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_30, $list_alt42);
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (pcase_var.eql(FI_RENAME)) {
                                                                        {
                                                                            SubLObject datum_32 = args;
                                                                            SubLObject current_33 = datum_32;
                                                                            SubLObject old_name = NIL;
                                                                            SubLObject new_name = NIL;
                                                                            destructuring_bind_must_consp(current_33, datum_32, $list_alt96);
                                                                            old_name = current_33.first();
                                                                            current_33 = current_33.rest();
                                                                            destructuring_bind_must_consp(current_33, datum_32, $list_alt96);
                                                                            new_name = current_33.first();
                                                                            current_33 = current_33.rest();
                                                                            if (NIL == current_33) {
                                                                                old_name = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(old_name), UNPROVIDED);
                                                                                new_name = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(new_name), UNPROVIDED);
                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                out_string_list = cons(cconcatenate($str_alt97$Rename__, new SubLObject[]{ old_name, $str_alt98$_, new_name, $str_alt21$_ }), out_string_list);
                                                                            } else {
                                                                                cdestructuring_bind_error(datum_32, $list_alt96);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (pcase_var.eql(FI_MERGE)) {
                                                                            {
                                                                                SubLObject datum_34 = args;
                                                                                SubLObject current_35 = datum_34;
                                                                                SubLObject kill_fort = NIL;
                                                                                SubLObject keep_fort = NIL;
                                                                                destructuring_bind_must_consp(current_35, datum_34, $list_alt100);
                                                                                kill_fort = current_35.first();
                                                                                current_35 = current_35.rest();
                                                                                destructuring_bind_must_consp(current_35, datum_34, $list_alt100);
                                                                                keep_fort = current_35.first();
                                                                                current_35 = current_35.rest();
                                                                                if (NIL == current_35) {
                                                                                    kill_fort = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(kill_fort), UNPROVIDED);
                                                                                    keep_fort = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(keep_fort), UNPROVIDED);
                                                                                    out_string_list = cons($str_alt94$, out_string_list);
                                                                                    out_string_list = cons(cconcatenate($str_alt101$Merge__, new SubLObject[]{ kill_fort, $str_alt98$_, keep_fort, $str_alt21$_ }), out_string_list);
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum_34, $list_alt100);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (pcase_var.eql(FI_KILL)) {
                                                                                {
                                                                                    SubLObject datum_36 = args;
                                                                                    SubLObject current_37 = datum_36;
                                                                                    SubLObject v_term = NIL;
                                                                                    destructuring_bind_must_consp(current_37, datum_36, $list_alt46);
                                                                                    v_term = current_37.first();
                                                                                    current_37 = current_37.rest();
                                                                                    if (NIL == current_37) {
                                                                                        v_term = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(v_term), UNPROVIDED);
                                                                                        out_string_list = cons($str_alt94$, out_string_list);
                                                                                        out_string_list = cons(cconcatenate($str_alt102$Kill__, new SubLObject[]{ v_term, $str_alt21$_ }), out_string_list);
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum_36, $list_alt46);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (((pcase_var.eql(FI_ASSERT) || pcase_var.eql(FI_REASSERT)) || pcase_var.eql(FI_UNASSERT)) || pcase_var.eql(FI_BLAST)) {
                                                                                    {
                                                                                        SubLObject pcase_var_38 = function;
                                                                                        if (pcase_var_38.eql(FI_ASSERT)) {
                                                                                            if (!enter_mode.equal($ENTER)) {
                                                                                                enter_mode = $ENTER;
                                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                                out_string_list = cons($str_alt107$Enter_, out_string_list);
                                                                                            }
                                                                                        } else {
                                                                                            if (pcase_var_38.eql(FI_REASSERT)) {
                                                                                                if (!enter_mode.equal($ENTER)) {
                                                                                                    enter_mode = $ENTER;
                                                                                                    out_string_list = cons($str_alt94$, out_string_list);
                                                                                                    out_string_list = cons($str_alt107$Enter_, out_string_list);
                                                                                                }
                                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                                out_string_list = cons($str_alt108$___The_following_assertion_simula, out_string_list);
                                                                                            } else {
                                                                                                if (pcase_var_38.eql(FI_UNASSERT)) {
                                                                                                    if (!enter_mode.equal($DELETE)) {
                                                                                                        enter_mode = $DELETE;
                                                                                                        out_string_list = cons($str_alt94$, out_string_list);
                                                                                                        out_string_list = cons($str_alt110$Delete_, out_string_list);
                                                                                                    }
                                                                                                } else {
                                                                                                    if (pcase_var_38.eql(FI_BLAST)) {
                                                                                                        force_mt_printP = T;
                                                                                                        if (!enter_mode.equal($BLAST)) {
                                                                                                            enter_mode = $BLAST;
                                                                                                            out_string_list = cons($str_alt94$, out_string_list);
                                                                                                            out_string_list = cons($str_alt112$Delete_____Simulate_an_fi_blast_, out_string_list);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject assertion = list_utilities.unquotify(args.first());
                                                                                        SubLObject assertion_pred = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(assertion.first(), UNPROVIDED);
                                                                                        SubLObject assertion_arg1 = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(second(assertion), UNPROVIDED);
                                                                                        SubLObject assertion_arg2_ = cddr(assertion);
                                                                                        SubLObject assertion_string = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(args.first()), UNPROVIDED);
                                                                                        SubLObject mt_string = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.unquotify(second(args)), UNPROVIDED);
                                                                                        SubLObject tv = list_utilities.unquotify(third(args));
                                                                                        SubLObject direction = list_utilities.unquotify(fourth(args));
                                                                                        if (NIL != assertion_arg2_) {
                                                                                            if (NIL != assertion_arg2_.rest()) {
                                                                                                assertion_arg2_ = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(assertion_arg2_, UNPROVIDED);
                                                                                            } else {
                                                                                                assertion_arg2_ = com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(assertion_arg2_.first(), UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                        {
                                                                                            SubLObject ignore_errors_tag = NIL;
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_39 = currentBinding(Errors.$error_handler$);
                                                                                                    try {
                                                                                                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                                                                                        try {
                                                                                                            assertion = encapsulation.unencapsulate_partial(list_utilities.unquotify(args.first()));
                                                                                                        } catch (Throwable catch_var) {
                                                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        rebind(Errors.$error_handler$, _prev_bind_0_39);
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable ccatch_env_var) {
                                                                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                                            }
                                                                                        }
                                                                                        if ((NIL != force_mt_printP) || (!mt_string.equal(current_mt))) {
                                                                                            force_mt_printP = NIL;
                                                                                            current_mt = mt_string;
                                                                                            out_string_list = cons($str_alt94$, out_string_list);
                                                                                            out_string_list = cons(cconcatenate($str_alt113$In_Mt__, new SubLObject[]{ mt_string, $str_alt21$_ }), out_string_list);
                                                                                        }
                                                                                        if (tv.equal($UNKNOWN)) {
                                                                                            out_string_list = cons($str_alt94$, out_string_list);
                                                                                            out_string_list = cons($str_alt115$Truth_Value___unknown_, out_string_list);
                                                                                        } else {
                                                                                            if (NIL != isa.isa_in_any_mtP(assertion.first(), $$DefaultMonotonicPredicate)) {
                                                                                                if (tv.equal($DEFAULT)) {
                                                                                                    out_string_list = cons($str_alt94$, out_string_list);
                                                                                                    out_string_list = cons($str_alt118$Truth_Value___default_, out_string_list);
                                                                                                }
                                                                                            } else {
                                                                                                if (tv.equal($MONOTONIC)) {
                                                                                                    out_string_list = cons($str_alt94$, out_string_list);
                                                                                                    out_string_list = cons($str_alt120$Truth_Value___monotonic_, out_string_list);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        {
                                                                                            SubLObject pcase_var_40 = direction;
                                                                                            if (pcase_var_40.eql($FORWARD)) {
                                                                                                out_string_list = cons($str_alt122$Direction___forward_, out_string_list);
                                                                                            } else {
                                                                                                if (pcase_var_40.eql($BACKWARD)) {
                                                                                                    out_string_list = cons($str_alt124$Direction___backward_, out_string_list);
                                                                                                } else {
                                                                                                    if (pcase_var_40.eql($CODE)) {
                                                                                                        out_string_list = cons($str_alt126$Direction___code_, out_string_list);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (assertion_arg1.equal(current_constant) && (NIL != assertion_arg2_)) {
                                                                                            out_string_list = cons(format(NIL, $str_alt127$_A___A_, assertion_pred, assertion_arg2_), out_string_list);
                                                                                        } else {
                                                                                            out_string_list = cons(format(NIL, $str_alt128$f___A_, assertion_string), out_string_list);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (pcase_var.eql(FI_TIMESTAMP_ASSERTION)) {
                                                                                    } else {
                                                                                        if (pcase_var.eql(FI_TIMESTAMP_CONSTANT)) {
                                                                                        } else {
                                                                                            if (pcase_var.eql(FI_CREATE_SKOLEM)) {
                                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                                out_string_list = cons($str_alt132$___This_skolem_creation_should_be, out_string_list);
                                                                                                out_string_list = cons(format(NIL, $str_alt133$____A, encapsulation.unencapsulate_partial(operation)), out_string_list);
                                                                                            } else {
                                                                                                out_string_list = cons($str_alt94$, out_string_list);
                                                                                                out_string_list = cons($str_alt134$___Don_t_know_how_convert_next_li, out_string_list);
                                                                                                out_string_list = cons(format(NIL, $str_alt133$____A, encapsulation.unencapsulate_partial(operation)), out_string_list);
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
                                                            cdestructuring_bind_error(datum, $list_alt40);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_41 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_41);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                return format(NIL, $str_alt135$Internal_Error___A, error_message);
            } else {
                return nreverse(out_string_list);
            }
        }
    }

    @LispMethod(comment = "Translate a transcript file (TRANSCRIPT-FILENAME) into a list of string representing the KE File that would create that transcript.  The list of strings can be output one per line to create the text KE file.")
    public static SubLObject transcript_file_to_ke_text(final SubLObject transcript_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_mt = mt_vars.$default_assert_mt$.getGlobalValue();
        SubLObject force_mt_printP = NIL;
        SubLObject enter_mode = $ENTER;
        SubLObject current_constant = NIL;
        SubLObject out_string_list = NIL;
        SubLObject error_message = NIL;
        SubLObject last_operation = NIL;
        if ((!transcript_filename.isString()) || (NIL == Filesys.probe_file(transcript_filename))) {
            return NIL;
        }
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(transcript_filename, $INPUT);
                        if (!stream.isStream()) {
                            Errors.error($str12$Unable_to_open__S, transcript_filename);
                        }
                        SubLObject transcript_stream;
                        SubLObject raw_operation;
                        SubLObject operations;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject encapsulated_cyclist;
                        SubLObject cyc_image_id;
                        SubLObject when;
                        SubLObject temp;
                        SubLObject function;
                        SubLObject args;
                        SubLObject current_$23;
                        SubLObject datum_$22;
                        SubLObject old_formula;
                        SubLObject new_formula;
                        SubLObject old_mt;
                        SubLObject new_mt;
                        SubLObject strength;
                        SubLObject direction;
                        SubLObject cdolist_list_var;
                        SubLObject operation;
                        SubLObject current2;
                        SubLObject datum2;
                        SubLObject encapsulated_cyclist2;
                        SubLObject cyc_image_id2;
                        SubLObject when2;
                        SubLObject temp2;
                        SubLObject function2;
                        SubLObject args2;
                        SubLObject pcase_var;
                        SubLObject current_$24;
                        SubLObject datum_$23;
                        SubLObject name;
                        SubLObject external_id;
                        SubLObject current_$25;
                        SubLObject datum_$24;
                        SubLObject old_name;
                        SubLObject new_name;
                        SubLObject current_$26;
                        SubLObject datum_$25;
                        SubLObject kill_fort;
                        SubLObject keep_fort;
                        SubLObject current_$27;
                        SubLObject datum_$26;
                        SubLObject v_term;
                        SubLObject pcase_var_$32;
                        SubLObject assertion;
                        SubLObject assertion_pred;
                        SubLObject assertion_arg1;
                        SubLObject assertion_arg2_;
                        SubLObject assertion_string;
                        SubLObject mt_string;
                        SubLObject tv;
                        SubLObject direction2;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$33;
                        SubLObject pcase_var_$33;
                        for (transcript_stream = stream, raw_operation = NIL, raw_operation = operation_communication.read_one_transcript_operation(transcript_stream); NIL != raw_operation; raw_operation = operation_communication.read_one_transcript_operation(transcript_stream)) {
                            operations = list(raw_operation);
                            datum = current = raw_operation;
                            encapsulated_cyclist = NIL;
                            cyc_image_id = NIL;
                            when = NIL;
                            destructuring_bind_must_consp(current, datum, $list35);
                            encapsulated_cyclist = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list35);
                            cyc_image_id = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list35);
                            when = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list35);
                            temp = current.rest();
                            current = current.first();
                            function = NIL;
                            args = NIL;
                            destructuring_bind_must_consp(current, datum, $list35);
                            function = current.first();
                            current = args = current.rest();
                            current = temp;
                            if (NIL == current) {
                                if (function == FI_EDIT) {
                                    datum_$22 = current_$23 = args;
                                    old_formula = NIL;
                                    new_formula = NIL;
                                    destructuring_bind_must_consp(current_$23, datum_$22, $list68);
                                    old_formula = current_$23.first();
                                    current_$23 = current_$23.rest();
                                    destructuring_bind_must_consp(current_$23, datum_$22, $list68);
                                    new_formula = current_$23.first();
                                    current_$23 = current_$23.rest();
                                    old_mt = (current_$23.isCons()) ? current_$23.first() : NIL;
                                    destructuring_bind_must_listp(current_$23, datum_$22, $list68);
                                    current_$23 = current_$23.rest();
                                    new_mt = (current_$23.isCons()) ? current_$23.first() : old_mt;
                                    destructuring_bind_must_listp(current_$23, datum_$22, $list68);
                                    current_$23 = current_$23.rest();
                                    strength = (current_$23.isCons()) ? current_$23.first() : $DEFAULT;
                                    destructuring_bind_must_listp(current_$23, datum_$22, $list68);
                                    current_$23 = current_$23.rest();
                                    direction = (current_$23.isCons()) ? current_$23.first() : NIL;
                                    destructuring_bind_must_listp(current_$23, datum_$22, $list68);
                                    current_$23 = current_$23.rest();
                                    if (NIL == current_$23) {
                                        operations = list(list(encapsulated_cyclist, cyc_image_id, when, list(FI_UNASSERT, old_formula, old_mt)), list(encapsulated_cyclist, cyc_image_id, when, list(FI_ASSERT, new_formula, new_mt, strength, direction)));
                                    } else {
                                        cdestructuring_bind_error(datum_$22, $list68);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list35);
                            }
                            cdolist_list_var = operations;
                            operation = NIL;
                            operation = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                last_operation = operation;
                                datum2 = current2 = operation;
                                encapsulated_cyclist2 = NIL;
                                cyc_image_id2 = NIL;
                                when2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list35);
                                encapsulated_cyclist2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list35);
                                cyc_image_id2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list35);
                                when2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list35);
                                temp2 = current2.rest();
                                current2 = current2.first();
                                function2 = NIL;
                                args2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list35);
                                function2 = current2.first();
                                current2 = args2 = current2.rest();
                                current2 = temp2;
                                if (NIL == current2) {
                                    pcase_var = function2;
                                    if (pcase_var.eql(FI_CREATE) || pcase_var.eql(FI_FIND_OR_CREATE)) {
                                        datum_$23 = current_$24 = args2;
                                        name = NIL;
                                        external_id = NIL;
                                        destructuring_bind_must_consp(current_$24, datum_$23, $list37);
                                        name = current_$24.first();
                                        current_$24 = current_$24.rest();
                                        destructuring_bind_must_consp(current_$24, datum_$23, $list37);
                                        external_id = current_$24.first();
                                        current_$24 = current_$24.rest();
                                        if (NIL == current_$24) {
                                            name = list_utilities.unquotify(name);
                                            external_id = list_utilities.unquotify(external_id);
                                            if (name.isString()) {
                                                out_string_list = cons($str73$, out_string_list);
                                                out_string_list = cons(cconcatenate($str74$Constant__, new SubLObject[]{ name, $str20$_ }), out_string_list);
                                                current_constant = name;
                                                force_mt_printP = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$23, $list37);
                                        }
                                    } else
                                        if (pcase_var.eql(FI_RENAME)) {
                                            datum_$24 = current_$25 = args2;
                                            old_name = NIL;
                                            new_name = NIL;
                                            destructuring_bind_must_consp(current_$25, datum_$24, $list75);
                                            old_name = current_$25.first();
                                            current_$25 = current_$25.rest();
                                            destructuring_bind_must_consp(current_$25, datum_$24, $list75);
                                            new_name = current_$25.first();
                                            current_$25 = current_$25.rest();
                                            if (NIL == current_$25) {
                                                old_name = unencapsulate_to_string(list_utilities.unquotify(old_name), UNPROVIDED);
                                                new_name = unencapsulate_to_string(list_utilities.unquotify(new_name), UNPROVIDED);
                                                out_string_list = cons($str73$, out_string_list);
                                                out_string_list = cons(cconcatenate($str76$Rename__, new SubLObject[]{ old_name, $$$_, new_name, $str20$_ }), out_string_list);
                                            } else {
                                                cdestructuring_bind_error(datum_$24, $list75);
                                            }
                                        } else
                                            if (pcase_var.eql(FI_MERGE)) {
                                                datum_$25 = current_$26 = args2;
                                                kill_fort = NIL;
                                                keep_fort = NIL;
                                                destructuring_bind_must_consp(current_$26, datum_$25, $list79);
                                                kill_fort = current_$26.first();
                                                current_$26 = current_$26.rest();
                                                destructuring_bind_must_consp(current_$26, datum_$25, $list79);
                                                keep_fort = current_$26.first();
                                                current_$26 = current_$26.rest();
                                                if (NIL == current_$26) {
                                                    kill_fort = unencapsulate_to_string(list_utilities.unquotify(kill_fort), UNPROVIDED);
                                                    keep_fort = unencapsulate_to_string(list_utilities.unquotify(keep_fort), UNPROVIDED);
                                                    out_string_list = cons($str73$, out_string_list);
                                                    out_string_list = cons(cconcatenate($str80$Merge__, new SubLObject[]{ kill_fort, $$$_, keep_fort, $str20$_ }), out_string_list);
                                                } else {
                                                    cdestructuring_bind_error(datum_$25, $list79);
                                                }
                                            } else
                                                if (pcase_var.eql(FI_KILL)) {
                                                    datum_$26 = current_$27 = args2;
                                                    v_term = NIL;
                                                    destructuring_bind_must_consp(current_$27, datum_$26, $list41);
                                                    v_term = current_$27.first();
                                                    current_$27 = current_$27.rest();
                                                    if (NIL == current_$27) {
                                                        v_term = unencapsulate_to_string(list_utilities.unquotify(v_term), UNPROVIDED);
                                                        out_string_list = cons($str73$, out_string_list);
                                                        out_string_list = cons(cconcatenate($str81$Kill__, new SubLObject[]{ v_term, $str20$_ }), out_string_list);
                                                    } else {
                                                        cdestructuring_bind_error(datum_$26, $list41);
                                                    }
                                                } else
                                                    if (((pcase_var.eql(FI_ASSERT) || pcase_var.eql(FI_REASSERT)) || pcase_var.eql(FI_UNASSERT)) || pcase_var.eql(FI_BLAST)) {
                                                        pcase_var_$32 = function2;
                                                        if (pcase_var_$32.eql(FI_ASSERT)) {
                                                            if (!enter_mode.equal($ENTER)) {
                                                                enter_mode = $ENTER;
                                                                out_string_list = cons($str73$, out_string_list);
                                                                out_string_list = cons($str84$Enter_, out_string_list);
                                                            }
                                                        } else
                                                            if (pcase_var_$32.eql(FI_REASSERT)) {
                                                                if (!enter_mode.equal($ENTER)) {
                                                                    enter_mode = $ENTER;
                                                                    out_string_list = cons($str73$, out_string_list);
                                                                    out_string_list = cons($str84$Enter_, out_string_list);
                                                                }
                                                                out_string_list = cons($str73$, out_string_list);
                                                                out_string_list = cons($str85$___The_following_assertion_simula, out_string_list);
                                                            } else
                                                                if (pcase_var_$32.eql(FI_UNASSERT)) {
                                                                    if (!enter_mode.equal($DELETE)) {
                                                                        enter_mode = $DELETE;
                                                                        out_string_list = cons($str73$, out_string_list);
                                                                        out_string_list = cons($str87$Delete_, out_string_list);
                                                                    }
                                                                } else
                                                                    if (pcase_var_$32.eql(FI_BLAST)) {
                                                                        force_mt_printP = T;
                                                                        if (!enter_mode.equal($BLAST)) {
                                                                            enter_mode = $BLAST;
                                                                            out_string_list = cons($str73$, out_string_list);
                                                                            out_string_list = cons($str89$Delete_____Simulate_an_fi_blast_, out_string_list);
                                                                        }
                                                                    }



                                                        assertion = list_utilities.unquotify(args2.first());
                                                        assertion_pred = unencapsulate_to_string(assertion.first(), UNPROVIDED);
                                                        assertion_arg1 = unencapsulate_to_string(second(assertion), UNPROVIDED);
                                                        assertion_arg2_ = cddr(assertion);
                                                        assertion_string = unencapsulate_to_string(list_utilities.unquotify(args2.first()), UNPROVIDED);
                                                        mt_string = unencapsulate_to_string(list_utilities.unquotify(second(args2)), UNPROVIDED);
                                                        tv = list_utilities.unquotify(third(args2));
                                                        direction2 = list_utilities.unquotify(fourth(args2));
                                                        if (NIL != assertion_arg2_) {
                                                            if ((!assertion_arg2_.isCons()) || (NIL != assertion_arg2_.rest())) {
                                                                assertion_arg2_ = unencapsulate_to_string(assertion_arg2_, UNPROVIDED);
                                                            } else {
                                                                assertion_arg2_ = unencapsulate_to_string(assertion_arg2_.first(), UNPROVIDED);
                                                            }
                                                        }
                                                        ignore_errors_tag = NIL;
                                                        try {
                                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                            _prev_bind_0_$33 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    assertion = encapsulation.unencapsulate_partial(list_utilities.unquotify(args2.first()));
                                                                } catch (final Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$33, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var) {
                                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                        if ((NIL != force_mt_printP) || (!mt_string.equal(current_mt))) {
                                                            force_mt_printP = NIL;
                                                            current_mt = mt_string;
                                                            out_string_list = cons($str73$, out_string_list);
                                                            out_string_list = cons(cconcatenate($str92$In_Mt__, new SubLObject[]{ mt_string, $str20$_ }), out_string_list);
                                                        }
                                                        if (tv.equal($UNKNOWN)) {
                                                            out_string_list = cons($str73$, out_string_list);
                                                            out_string_list = cons($str94$Truth_Value___unknown_, out_string_list);
                                                        } else
                                                            if (NIL != isa.isa_in_any_mtP(assertion.first(), $$DefaultMonotonicPredicate)) {
                                                                if (tv.equal($DEFAULT)) {
                                                                    out_string_list = cons($str73$, out_string_list);
                                                                    out_string_list = cons($str96$Truth_Value___default_, out_string_list);
                                                                }
                                                            } else
                                                                if (tv.equal($MONOTONIC)) {
                                                                    out_string_list = cons($str73$, out_string_list);
                                                                    out_string_list = cons($str98$Truth_Value___monotonic_, out_string_list);
                                                                }


                                                        pcase_var_$33 = direction2;
                                                        if (pcase_var_$33.eql($FORWARD)) {
                                                            out_string_list = cons($str100$Direction___forward_, out_string_list);
                                                        } else
                                                            if (pcase_var_$33.eql($BACKWARD)) {
                                                                out_string_list = cons($str102$Direction___backward_, out_string_list);
                                                            } else
                                                                if (pcase_var_$33.eql($CODE)) {
                                                                    out_string_list = cons($str104$Direction___code_, out_string_list);
                                                                }


                                                        if (assertion_arg1.equal(current_constant) && (NIL != assertion_arg2_)) {
                                                            out_string_list = cons(format(NIL, $str105$_A___A_, assertion_pred, assertion_arg2_), out_string_list);
                                                        } else {
                                                            out_string_list = cons(format(NIL, $str106$f___A_, assertion_string), out_string_list);
                                                        }
                                                    } else
                                                        if (!pcase_var.eql(FI_TIMESTAMP_ASSERTION)) {
                                                            if (!pcase_var.eql(FI_TIMESTAMP_CONSTANT)) {
                                                                if (pcase_var.eql(FI_CREATE_SKOLEM)) {
                                                                    out_string_list = cons($str73$, out_string_list);
                                                                    out_string_list = cons($str110$___This_skolem_creation_should_be, out_string_list);
                                                                    out_string_list = cons(format(NIL, $str111$____S, encapsulation.unencapsulate_partial(operation)), out_string_list);
                                                                } else {
                                                                    out_string_list = cons($str73$, out_string_list);
                                                                    out_string_list = cons($str112$___Don_t_know_how_convert_next_li, out_string_list);
                                                                    out_string_list = cons(format(NIL, $str111$____S, encapsulation.unencapsulate_partial(operation)), out_string_list);
                                                                }
                                                            }
                                                        }





                                } else {
                                    cdestructuring_bind_error(datum2, $list35);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                operation = cdolist_list_var.first();
                            } 
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            return format(NIL, $str113$Internal_Error____A__for_operatio, error_message, last_operation);
        }
        return nreverse(out_string_list);
    }/**
     * Translate a transcript file (TRANSCRIPT-FILENAME) into a list of string representing the KE File that would create that transcript.  The list of strings can be output one per line to create the text KE file.
     */


    /**
     * Translate an object to a string, list of strings,.
     */
    @LispMethod(comment = "Translate an object to a string, list of strings,.")
    public static final SubLObject unencapsulate_to_string_alt(SubLObject v_object, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        if (v_object.isKeyword()) {
            return cconcatenate($str_alt136$_, string_utilities.string_from_keyword(v_object));
        } else {
            if (v_object.isSymbol()) {
                if (NIL != cycl_variables.el_varP(v_object)) {
                    return symbol_name(v_object);
                } else {
                    return cconcatenate($str_alt137$_, symbol_name(v_object));
                }
            } else {
                if (v_object.isString()) {
                    return com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_string(v_object);
                } else {
                    if (v_object.isAtom()) {
                        return format_nil.format_nil_a(v_object);
                    } else {
                        if (((v_object.first() == $HP) && (NIL != list_utilities.proper_list_p(v_object))) && length(v_object).numE(THREE_INTEGER)) {
                            return second(v_object);
                        } else {
                            if (((v_object.first() == $NAT) && (NIL != list_utilities.proper_list_p(v_object))) && (length(v_object).numE(TWO_INTEGER) || length(v_object).numE(THREE_INTEGER))) {
                                return com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(second(v_object), UNPROVIDED);
                            } else {
                                {
                                    SubLObject outlist = NIL;
                                    SubLObject count = ZERO_INTEGER;
                                    if (indent.numG(ZERO_INTEGER)) {
                                        outlist = cons(Strings.make_string(ONE_INTEGER, CHAR_newline), outlist);
                                        outlist = cons(Strings.make_string(add(THREE_INTEGER, indent), CHAR_space), outlist);
                                    }
                                    outlist = cons($str_alt140$_, outlist);
                                    if (NIL != list_utilities.dotted_list_p(v_object)) {
                                        {
                                            SubLObject cdolist_list_var = list_utilities.dotted_butlast(v_object);
                                            SubLObject v_this = NIL;
                                            for (v_this = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_this = cdolist_list_var.first()) {
                                                if (count.numG(ZERO_INTEGER)) {
                                                    outlist = cons($str_alt98$_, outlist);
                                                }
                                                outlist = cons(com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(v_this, add(indent, TWO_INTEGER)), outlist);
                                                count = add(count, ONE_INTEGER);
                                            }
                                            outlist = cons($str_alt141$___, outlist);
                                            outlist = cons(com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(list_utilities.dotted_last(v_object), add(indent, TWO_INTEGER)), outlist);
                                        }
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = v_object;
                                            SubLObject v_this = NIL;
                                            for (v_this = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_this = cdolist_list_var.first()) {
                                                if (count.numG(ZERO_INTEGER)) {
                                                    outlist = cons($str_alt98$_, outlist);
                                                }
                                                outlist = cons(com.cyc.cycjava.cycl.transcript_utilities.unencapsulate_to_string(v_this, add(indent, TWO_INTEGER)), outlist);
                                                count = add(count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                    outlist = cons($str_alt142$_, outlist);
                                    return apply(symbol_function(CCONCATENATE), nreverse(outlist));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Translate an object to a string, list of strings,.")
    public static SubLObject unencapsulate_to_string(final SubLObject v_object, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        if (v_object.isKeyword()) {
            return cconcatenate($str114$_, string_utilities.string_from_keyword(v_object));
        }
        if (v_object.isSymbol()) {
            if (NIL != cycl_variables.el_varP(v_object)) {
                return symbol_name(v_object);
            }
            return cconcatenate($str115$_, symbol_name(v_object));
        } else {
            if (v_object.isString()) {
                return unencapsulate_string(v_object);
            }
            if (v_object.isAtom()) {
                return format_nil.format_nil_a(v_object);
            }
            if (((v_object.first() == $HP) && (NIL != list_utilities.proper_list_p(v_object))) && length(v_object).numE(THREE_INTEGER)) {
                return second(v_object);
            }
            if (((v_object.first() == $NAT) && (NIL != list_utilities.proper_list_p(v_object))) && (length(v_object).numE(TWO_INTEGER) || length(v_object).numE(THREE_INTEGER))) {
                return unencapsulate_to_string(second(v_object), UNPROVIDED);
            }
            if (((v_object.first().isCons() && (NIL != list_utilities.proper_list_p(v_object))) && second(v_object.first()).isString()) && (NIL != Strings.stringE($$$TLReifiedNatFn, second(v_object.first()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return unencapsulate_to_string(second(v_object), UNPROVIDED);
            }
            if (((v_object.first().isCons() && (NIL != list_utilities.proper_list_p(v_object))) && second(v_object.first()).isString()) && (NIL != Strings.stringE($$$TLAssertionFn, second(v_object.first()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return unencapsulate_to_string(list(encapsulation.encapsulate($$ist), second(v_object), third(v_object)), UNPROVIDED);
            }
            if ((((!v_object.first().isCons()) || (NIL == list_utilities.proper_list_p(v_object))) || (!second(v_object.first()).isString())) || (NIL == Strings.stringE($$$TLVariableFn, second(v_object.first()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                SubLObject outlist = NIL;
                SubLObject count = ZERO_INTEGER;
                if (indent.numG(ZERO_INTEGER)) {
                    outlist = cons(Strings.make_string(ONE_INTEGER, CHAR_newline), outlist);
                    outlist = cons(Strings.make_string(add(THREE_INTEGER, indent), CHAR_space), outlist);
                }
                outlist = cons($str123$_, outlist);
                if (NIL != list_utilities.dotted_list_p(v_object)) {
                    SubLObject cdolist_list_var = list_utilities.dotted_butlast(v_object);
                    SubLObject v_this = NIL;
                    v_this = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (count.numG(ZERO_INTEGER)) {
                            outlist = cons($$$_, outlist);
                        }
                        outlist = cons(unencapsulate_to_string(v_this, add(indent, TWO_INTEGER)), outlist);
                        count = add(count, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_this = cdolist_list_var.first();
                    } 
                    outlist = cons($str124$___, outlist);
                    outlist = cons(unencapsulate_to_string(list_utilities.dotted_last(v_object), add(indent, TWO_INTEGER)), outlist);
                } else {
                    SubLObject cdolist_list_var = v_object;
                    SubLObject v_this = NIL;
                    v_this = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (count.numG(ZERO_INTEGER)) {
                            outlist = cons($$$_, outlist);
                        }
                        outlist = cons(unencapsulate_to_string(v_this, add(indent, TWO_INTEGER)), outlist);
                        count = add(count, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_this = cdolist_list_var.first();
                    } 
                }
                outlist = cons($str125$_, outlist);
                return apply(CCONCATENATE, nreverse(outlist));
            }
            if (third(v_object).isString()) {
                return unencapsulate_to_string(make_symbol(third(v_object)), UNPROVIDED);
            }
            return unencapsulate_to_string(make_symbol(cconcatenate($str122$_VAR, format_nil.format_nil_a_no_copy(second(v_object)))), UNPROVIDED);
        }
    }/**
     * Translate an object to a string, list of strings,.
     */


    /**
     * Escape quotes that aren't already escaped, then wrap whole string in quotes.
     */
    @LispMethod(comment = "Escape quotes that aren\'t already escaped, then wrap whole string in quotes.")
    public static final SubLObject unencapsulate_string_alt(SubLObject string) {
        return cconcatenate($str_alt144$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.string_substitute($str_alt145$__, $str_alt146$___, string_utilities.string_substitute($str_alt145$__, $str_alt144$_, string, UNPROVIDED), UNPROVIDED)), $str_alt144$_ });
    }

    @LispMethod(comment = "Escape quotes that aren\'t already escaped, then wrap whole string in quotes.")
    public static SubLObject unencapsulate_string(final SubLObject string) {
        return cconcatenate($str127$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.string_substitute($str128$__, $str129$___, string_utilities.string_substitute($str128$__, $str127$_, string, UNPROVIDED), UNPROVIDED)), $str127$_ });
    }/**
     * Escape quotes that aren't already escaped, then wrap whole string in quotes.
     */


    public static final SubLObject declare_transcript_utilities_file_alt() {
        declareFunction("transcript_eval", "TRANSCRIPT-EVAL", 1, 1, false);
        declareFunction("transcript_form", "TRANSCRIPT-FORM", 1, 1, false);
        declareFunction("transcript_form_int", "TRANSCRIPT-FORM-INT", 3, 0, false);
        declareFunction("form_to_transcript_form", "FORM-TO-TRANSCRIPT-FORM", 1, 0, false);
        declareFunction("initialize_transcript_handling", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false);
        declareFunction("transcript_suffix", "TRANSCRIPT-SUFFIX", 0, 0, false);
        declareFunction("master_transcript_already_exists", "MASTER-TRANSCRIPT-ALREADY-EXISTS", 0, 0, false);
        declareFunction("set_master_transcript_already_exists", "SET-MASTER-TRANSCRIPT-ALREADY-EXISTS", 1, 0, false);
        declareFunction("local_transcript_version", "LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("inc_local_transcript_version", "INC-LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("local_transcript_history", "LOCAL-TRANSCRIPT-HISTORY", 0, 0, false);
        declareFunction("local_transcript_history_add", "LOCAL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
        declareFunction("local_hl_transcript_version", "LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("inc_local_hl_transcript_version", "INC-LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("local_hl_transcript_history", "LOCAL-HL-TRANSCRIPT-HISTORY", 0, 0, false);
        declareFunction("local_hl_transcript_history_add", "LOCAL-HL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
        declareFunction("read_transcript_position", "READ-TRANSCRIPT-POSITION", 0, 0, false);
        declareFunction("set_read_transcript_position", "SET-READ-TRANSCRIPT-POSITION", 1, 0, false);
        declareFunction("approx_chars_per_op", "APPROX-CHARS-PER-OP", 0, 0, false);
        declareFunction("set_approx_chars_per_op", "SET-APPROX-CHARS-PER-OP", 1, 0, false);
        declareFunction("local_transcript", "LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("mark_local_transcript", "MARK-LOCAL-TRANSCRIPT", 1, 0, false);
        declareFunction("roll_local_transcript", "ROLL-LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_transcript", "NEW-LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_transcript_int", "NEW-LOCAL-TRANSCRIPT-INT", 0, 0, false);
        declareFunction("read_transcript", "READ-TRANSCRIPT", 0, 0, false);
        declareFunction("set_read_transcript", "SET-READ-TRANSCRIPT", 1, 0, false);
        declareFunction("master_transcript", "MASTER-TRANSCRIPT", 0, 0, false);
        declareFunction("set_master_transcript", "SET-MASTER-TRANSCRIPT", 0, 1, false);
        declareFunction("get_all_transcripts_image", "GET-ALL-TRANSCRIPTS-IMAGE", 0, 0, false);
        declareFunction("local_hl_transcript", "LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("mark_local_hl_transcript", "MARK-LOCAL-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("roll_local_hl_transcript", "ROLL-LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_hl_transcript", "NEW-LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_hl_transcript_int", "NEW-LOCAL-HL-TRANSCRIPT-INT", 0, 0, false);
        declareFunction("make_master_transcript_filename", "MAKE-MASTER-TRANSCRIPT-FILENAME", 0, 1, false);
        declareFunction("make_local_transcript_filename", "MAKE-LOCAL-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("make_local_hl_transcript_filename", "MAKE-LOCAL-HL-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("construct_transcript_filename", "CONSTRUCT-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("transcript_directory", "TRANSCRIPT-DIRECTORY", 0, 0, false);
        declareFunction("next_transcript_directory", "NEXT-TRANSCRIPT-DIRECTORY", 0, 0, false);
        declareFunction("transcript_directory_int", "TRANSCRIPT-DIRECTORY-INT", 1, 0, false);
        declareFunction("mark_transcript_filename", "MARK-TRANSCRIPT-FILENAME", 2, 0, false);
        declareFunction("get_count_ops_data", "GET-COUNT-OPS-DATA", 1, 0, false);
        declareFunction("get_current_op_count", "GET-CURRENT-OP-COUNT", 1, 0, false);
        declareFunction("get_current_position", "GET-CURRENT-POSITION", 1, 0, false);
        declareFunction("update_count_ops_data", "UPDATE-COUNT-OPS-DATA", 3, 0, false);
        declareFunction("really_count_ops", "REALLY-COUNT-OPS", 1, 0, false);
        declareFunction("count_operations", "COUNT-OPERATIONS", 1, 0, false);
        declareFunction("estimate_number_of_ops", "ESTIMATE-NUMBER-OF-OPS", 1, 0, false);
        declareFunction("collect_ops_in_range", "COLLECT-OPS-IN-RANGE", 2, 2, false);
        declareFunction("bp_count_ops", "BP-COUNT-OPS", 1, 0, false);
        declareFunction("constant_modifications_in_transcript", "CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 1, 0, false);
        declareFunction("report_constant_modifications_in_transcript", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 0, 2, false);
        declareFunction("report_constant_modifications_in_transcript_to_file", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT-TO-FILE", 1, 1, false);
        declareFunction("encapsulated_cyclist_string", "ENCAPSULATED-CYCLIST-STRING", 1, 0, false);
        declareFunction("reset_transcript_rename_hash", "RESET-TRANSCRIPT-RENAME-HASH", 0, 0, false);
        declareFunction("sort_transcript_renames", "SORT-TRANSCRIPT-RENAMES", 0, 0, false);
        declareFunction("add_transcript_rename_info", "ADD-TRANSCRIPT-RENAME-INFO", 6, 0, false);
        declareFunction("rem_transcript_rename_info", "REM-TRANSCRIPT-RENAME-INFO", 1, 0, false);
        declareFunction("reset_transcript_create_hash", "RESET-TRANSCRIPT-CREATE-HASH", 0, 0, false);
        declareFunction("sort_transcript_creates", "SORT-TRANSCRIPT-CREATES", 0, 0, false);
        declareFunction("add_transcript_create_info", "ADD-TRANSCRIPT-CREATE-INFO", 5, 0, false);
        declareFunction("constant_created_in_transcript", "CONSTANT-CREATED-IN-TRANSCRIPT", 1, 0, false);
        declareFunction("rem_transcript_create_info", "REM-TRANSCRIPT-CREATE-INFO", 1, 0, false);
        declareFunction("get_nl_notables", "GET-NL-NOTABLES", 1, 0, false);
        declareFunction("get_no_comments", "GET-NO-COMMENTS", 1, 0, false);
        declareFunction("get_units_and_comments", "GET-UNITS-AND-COMMENTS", 1, 0, false);
        declareFunction("write_specific_transcript_file_as_ke_text", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false);
        declareFunction("transcript_file_to_ke_text", "TRANSCRIPT-FILE-TO-KE-TEXT", 1, 0, false);
        declareFunction("unencapsulate_to_string", "UNENCAPSULATE-TO-STRING", 1, 1, false);
        declareFunction("unencapsulate_string", "UNENCAPSULATE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_transcript_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("transcript_eval", "TRANSCRIPT-EVAL", 1, 1, false);
            declareFunction("transcript_form", "TRANSCRIPT-FORM", 1, 1, false);
            declareFunction("transcript_form_int", "TRANSCRIPT-FORM-INT", 3, 0, false);
            declareFunction("form_to_transcript_form", "FORM-TO-TRANSCRIPT-FORM", 1, 0, false);
            declareFunction("initialize_transcript_handling", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false);
            declareFunction("transcript_suffix", "TRANSCRIPT-SUFFIX", 0, 0, false);
            declareFunction("master_transcript_already_exists", "MASTER-TRANSCRIPT-ALREADY-EXISTS", 0, 0, false);
            declareFunction("set_master_transcript_already_exists", "SET-MASTER-TRANSCRIPT-ALREADY-EXISTS", 1, 0, false);
            declareFunction("local_transcript_version", "LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
            declareFunction("inc_local_transcript_version", "INC-LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
            declareFunction("local_transcript_history", "LOCAL-TRANSCRIPT-HISTORY", 0, 0, false);
            declareFunction("local_transcript_history_add", "LOCAL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
            declareFunction("local_hl_transcript_version", "LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
            declareFunction("inc_local_hl_transcript_version", "INC-LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
            declareFunction("local_hl_transcript_history", "LOCAL-HL-TRANSCRIPT-HISTORY", 0, 0, false);
            declareFunction("local_hl_transcript_history_add", "LOCAL-HL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
            declareFunction("read_transcript_position", "READ-TRANSCRIPT-POSITION", 0, 0, false);
            declareFunction("set_read_transcript_position", "SET-READ-TRANSCRIPT-POSITION", 1, 0, false);
            declareFunction("approx_chars_per_op", "APPROX-CHARS-PER-OP", 0, 0, false);
            declareFunction("set_approx_chars_per_op", "SET-APPROX-CHARS-PER-OP", 1, 0, false);
            declareFunction("local_transcript", "LOCAL-TRANSCRIPT", 0, 0, false);
            declareFunction("mark_local_transcript", "MARK-LOCAL-TRANSCRIPT", 1, 0, false);
            declareFunction("roll_local_transcript", "ROLL-LOCAL-TRANSCRIPT", 0, 0, false);
            declareFunction("new_local_transcript", "NEW-LOCAL-TRANSCRIPT", 0, 0, false);
            declareFunction("new_local_transcript_int", "NEW-LOCAL-TRANSCRIPT-INT", 0, 0, false);
            declareFunction("read_transcript", "READ-TRANSCRIPT", 0, 0, false);
            declareFunction("set_read_transcript", "SET-READ-TRANSCRIPT", 1, 0, false);
            declareFunction("master_transcript", "MASTER-TRANSCRIPT", 0, 0, false);
            declareFunction("set_master_transcript", "SET-MASTER-TRANSCRIPT", 0, 1, false);
            declareFunction("get_all_transcripts_image", "GET-ALL-TRANSCRIPTS-IMAGE", 0, 0, false);
            declareFunction("local_hl_transcript", "LOCAL-HL-TRANSCRIPT", 0, 0, false);
            declareFunction("mark_local_hl_transcript", "MARK-LOCAL-HL-TRANSCRIPT", 1, 0, false);
            declareFunction("roll_local_hl_transcript", "ROLL-LOCAL-HL-TRANSCRIPT", 0, 0, false);
            declareFunction("new_local_hl_transcript", "NEW-LOCAL-HL-TRANSCRIPT", 0, 0, false);
            declareFunction("new_local_hl_transcript_int", "NEW-LOCAL-HL-TRANSCRIPT-INT", 0, 0, false);
            declareFunction("make_master_transcript_filename", "MAKE-MASTER-TRANSCRIPT-FILENAME", 0, 1, false);
            declareFunction("make_local_transcript_filename", "MAKE-LOCAL-TRANSCRIPT-FILENAME", 1, 0, false);
            declareFunction("make_local_hl_transcript_filename", "MAKE-LOCAL-HL-TRANSCRIPT-FILENAME", 1, 0, false);
            declareFunction("construct_transcript_filename", "CONSTRUCT-TRANSCRIPT-FILENAME", 1, 0, false);
            declareFunction("transcript_directory", "TRANSCRIPT-DIRECTORY", 0, 0, false);
            declareFunction("next_transcript_directory", "NEXT-TRANSCRIPT-DIRECTORY", 0, 0, false);
            declareFunction("transcript_directory_int", "TRANSCRIPT-DIRECTORY-INT", 1, 0, false);
            declareFunction("mark_transcript_filename", "MARK-TRANSCRIPT-FILENAME", 2, 0, false);
            declareFunction("get_count_ops_data", "GET-COUNT-OPS-DATA", 1, 0, false);
            declareFunction("get_current_op_count", "GET-CURRENT-OP-COUNT", 1, 0, false);
            declareFunction("get_current_position", "GET-CURRENT-POSITION", 1, 0, false);
            declareFunction("update_count_ops_data", "UPDATE-COUNT-OPS-DATA", 3, 0, false);
            declareFunction("really_count_ops", "REALLY-COUNT-OPS", 1, 0, false);
            declareFunction("count_operations", "COUNT-OPERATIONS", 1, 0, false);
            declareFunction("estimate_number_of_ops", "ESTIMATE-NUMBER-OF-OPS", 1, 0, false);
            declareFunction("collect_ops_in_range", "COLLECT-OPS-IN-RANGE", 2, 2, false);
            declareFunction("total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false);
            declareFunction("constant_modifications_in_transcript", "CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 1, 0, false);
            declareFunction("report_constant_modifications_in_transcript", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 0, 2, false);
            declareFunction("report_constant_modifications_in_transcript_to_file", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT-TO-FILE", 1, 1, false);
            declareFunction("encapsulated_cyclist_string", "ENCAPSULATED-CYCLIST-STRING", 1, 0, false);
            declareFunction("reset_transcript_rename_hash", "RESET-TRANSCRIPT-RENAME-HASH", 0, 0, false);
            declareFunction("sort_transcript_renames", "SORT-TRANSCRIPT-RENAMES", 0, 0, false);
            declareFunction("add_transcript_rename_info", "ADD-TRANSCRIPT-RENAME-INFO", 6, 0, false);
            declareFunction("rem_transcript_rename_info", "REM-TRANSCRIPT-RENAME-INFO", 1, 0, false);
            declareFunction("reset_transcript_create_hash", "RESET-TRANSCRIPT-CREATE-HASH", 0, 0, false);
            declareFunction("sort_transcript_creates", "SORT-TRANSCRIPT-CREATES", 0, 0, false);
            declareFunction("add_transcript_create_info", "ADD-TRANSCRIPT-CREATE-INFO", 5, 0, false);
            declareFunction("constant_created_in_transcript", "CONSTANT-CREATED-IN-TRANSCRIPT", 1, 0, false);
            declareFunction("rem_transcript_create_info", "REM-TRANSCRIPT-CREATE-INFO", 1, 0, false);
            declareFunction("write_specific_transcript_file_as_ke_text", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false);
            declareFunction("transcript_file_to_ke_text", "TRANSCRIPT-FILE-TO-KE-TEXT", 1, 0, false);
            declareFunction("unencapsulate_to_string", "UNENCAPSULATE-TO-STRING", 1, 1, false);
            declareFunction("unencapsulate_string", "UNENCAPSULATE-STRING", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("bp_count_ops", "BP-COUNT-OPS", 1, 0, false);
            declareFunction("get_nl_notables", "GET-NL-NOTABLES", 1, 0, false);
            declareFunction("get_no_comments", "GET-NO-COMMENTS", 1, 0, false);
            declareFunction("get_units_and_comments", "GET-UNITS-AND-COMMENTS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_transcript_utilities_file_Previous() {
        declareFunction("transcript_eval", "TRANSCRIPT-EVAL", 1, 1, false);
        declareFunction("transcript_form", "TRANSCRIPT-FORM", 1, 1, false);
        declareFunction("transcript_form_int", "TRANSCRIPT-FORM-INT", 3, 0, false);
        declareFunction("form_to_transcript_form", "FORM-TO-TRANSCRIPT-FORM", 1, 0, false);
        declareFunction("initialize_transcript_handling", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false);
        declareFunction("transcript_suffix", "TRANSCRIPT-SUFFIX", 0, 0, false);
        declareFunction("master_transcript_already_exists", "MASTER-TRANSCRIPT-ALREADY-EXISTS", 0, 0, false);
        declareFunction("set_master_transcript_already_exists", "SET-MASTER-TRANSCRIPT-ALREADY-EXISTS", 1, 0, false);
        declareFunction("local_transcript_version", "LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("inc_local_transcript_version", "INC-LOCAL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("local_transcript_history", "LOCAL-TRANSCRIPT-HISTORY", 0, 0, false);
        declareFunction("local_transcript_history_add", "LOCAL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
        declareFunction("local_hl_transcript_version", "LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("inc_local_hl_transcript_version", "INC-LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false);
        declareFunction("local_hl_transcript_history", "LOCAL-HL-TRANSCRIPT-HISTORY", 0, 0, false);
        declareFunction("local_hl_transcript_history_add", "LOCAL-HL-TRANSCRIPT-HISTORY-ADD", 1, 0, false);
        declareFunction("read_transcript_position", "READ-TRANSCRIPT-POSITION", 0, 0, false);
        declareFunction("set_read_transcript_position", "SET-READ-TRANSCRIPT-POSITION", 1, 0, false);
        declareFunction("approx_chars_per_op", "APPROX-CHARS-PER-OP", 0, 0, false);
        declareFunction("set_approx_chars_per_op", "SET-APPROX-CHARS-PER-OP", 1, 0, false);
        declareFunction("local_transcript", "LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("mark_local_transcript", "MARK-LOCAL-TRANSCRIPT", 1, 0, false);
        declareFunction("roll_local_transcript", "ROLL-LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_transcript", "NEW-LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_transcript_int", "NEW-LOCAL-TRANSCRIPT-INT", 0, 0, false);
        declareFunction("read_transcript", "READ-TRANSCRIPT", 0, 0, false);
        declareFunction("set_read_transcript", "SET-READ-TRANSCRIPT", 1, 0, false);
        declareFunction("master_transcript", "MASTER-TRANSCRIPT", 0, 0, false);
        declareFunction("set_master_transcript", "SET-MASTER-TRANSCRIPT", 0, 1, false);
        declareFunction("get_all_transcripts_image", "GET-ALL-TRANSCRIPTS-IMAGE", 0, 0, false);
        declareFunction("local_hl_transcript", "LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("mark_local_hl_transcript", "MARK-LOCAL-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("roll_local_hl_transcript", "ROLL-LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_hl_transcript", "NEW-LOCAL-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_local_hl_transcript_int", "NEW-LOCAL-HL-TRANSCRIPT-INT", 0, 0, false);
        declareFunction("make_master_transcript_filename", "MAKE-MASTER-TRANSCRIPT-FILENAME", 0, 1, false);
        declareFunction("make_local_transcript_filename", "MAKE-LOCAL-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("make_local_hl_transcript_filename", "MAKE-LOCAL-HL-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("construct_transcript_filename", "CONSTRUCT-TRANSCRIPT-FILENAME", 1, 0, false);
        declareFunction("transcript_directory", "TRANSCRIPT-DIRECTORY", 0, 0, false);
        declareFunction("next_transcript_directory", "NEXT-TRANSCRIPT-DIRECTORY", 0, 0, false);
        declareFunction("transcript_directory_int", "TRANSCRIPT-DIRECTORY-INT", 1, 0, false);
        declareFunction("mark_transcript_filename", "MARK-TRANSCRIPT-FILENAME", 2, 0, false);
        declareFunction("get_count_ops_data", "GET-COUNT-OPS-DATA", 1, 0, false);
        declareFunction("get_current_op_count", "GET-CURRENT-OP-COUNT", 1, 0, false);
        declareFunction("get_current_position", "GET-CURRENT-POSITION", 1, 0, false);
        declareFunction("update_count_ops_data", "UPDATE-COUNT-OPS-DATA", 3, 0, false);
        declareFunction("really_count_ops", "REALLY-COUNT-OPS", 1, 0, false);
        declareFunction("count_operations", "COUNT-OPERATIONS", 1, 0, false);
        declareFunction("estimate_number_of_ops", "ESTIMATE-NUMBER-OF-OPS", 1, 0, false);
        declareFunction("collect_ops_in_range", "COLLECT-OPS-IN-RANGE", 2, 2, false);
        declareFunction("total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false);
        declareFunction("constant_modifications_in_transcript", "CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 1, 0, false);
        declareFunction("report_constant_modifications_in_transcript", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 0, 2, false);
        declareFunction("report_constant_modifications_in_transcript_to_file", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT-TO-FILE", 1, 1, false);
        declareFunction("encapsulated_cyclist_string", "ENCAPSULATED-CYCLIST-STRING", 1, 0, false);
        declareFunction("reset_transcript_rename_hash", "RESET-TRANSCRIPT-RENAME-HASH", 0, 0, false);
        declareFunction("sort_transcript_renames", "SORT-TRANSCRIPT-RENAMES", 0, 0, false);
        declareFunction("add_transcript_rename_info", "ADD-TRANSCRIPT-RENAME-INFO", 6, 0, false);
        declareFunction("rem_transcript_rename_info", "REM-TRANSCRIPT-RENAME-INFO", 1, 0, false);
        declareFunction("reset_transcript_create_hash", "RESET-TRANSCRIPT-CREATE-HASH", 0, 0, false);
        declareFunction("sort_transcript_creates", "SORT-TRANSCRIPT-CREATES", 0, 0, false);
        declareFunction("add_transcript_create_info", "ADD-TRANSCRIPT-CREATE-INFO", 5, 0, false);
        declareFunction("constant_created_in_transcript", "CONSTANT-CREATED-IN-TRANSCRIPT", 1, 0, false);
        declareFunction("rem_transcript_create_info", "REM-TRANSCRIPT-CREATE-INFO", 1, 0, false);
        declareFunction("write_specific_transcript_file_as_ke_text", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false);
        declareFunction("transcript_file_to_ke_text", "TRANSCRIPT-FILE-TO-KE-TEXT", 1, 0, false);
        declareFunction("unencapsulate_to_string", "UNENCAPSULATE-TO-STRING", 1, 1, false);
        declareFunction("unencapsulate_string", "UNENCAPSULATE-STRING", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_transcript_utilities_file_alt() {
        defparameter("*TRANSCRIPT-SUFFIX*", $$$ts);
        defparameter("*MASTER-TRANSCRIPT-ALREADY-EXISTS*", NIL);
        deflexical("*LOCAL-TRANSCRIPT-VERSION*", NIL != boundp($local_transcript_version$) ? ((SubLObject) ($local_transcript_version$.getGlobalValue())) : ZERO_INTEGER);
        deflexical("*LOCAL-TRANSCRIPT-HISTORY*", NIL != boundp($local_transcript_history$) ? ((SubLObject) ($local_transcript_history$.getGlobalValue())) : NIL);
        deflexical("*LOCAL-HL-TRANSCRIPT-VERSION*", NIL != boundp($local_hl_transcript_version$) ? ((SubLObject) ($local_hl_transcript_version$.getGlobalValue())) : ZERO_INTEGER);
        deflexical("*LOCAL-HL-TRANSCRIPT-HISTORY*", NIL != boundp($local_hl_transcript_history$) ? ((SubLObject) ($local_hl_transcript_history$.getGlobalValue())) : NIL);
        deflexical("*READ-TRANSCRIPT-POSITION*", NIL != boundp($read_transcript_position$) ? ((SubLObject) ($read_transcript_position$.getGlobalValue())) : ZERO_INTEGER);
        defparameter("*APPROX-CHARS-PER-OP*", $int$206);
        deflexical("*LOCAL-TRANSCRIPT*", NIL != boundp($local_transcript$) ? ((SubLObject) ($local_transcript$.getGlobalValue())) : NIL);
        deflexical("*READ-TRANSCRIPT*", NIL != boundp($read_transcript$) ? ((SubLObject) ($read_transcript$.getGlobalValue())) : NIL);
        deflexical("*MASTER-TRANSCRIPT*", NIL != boundp($master_transcript$) ? ((SubLObject) ($master_transcript$.getGlobalValue())) : NIL);
        deflexical("*LOCAL-HL-TRANSCRIPT*", NIL != boundp($local_hl_transcript$) ? ((SubLObject) ($local_hl_transcript$.getGlobalValue())) : NIL);
        deflexical("*COUNT-OPS-TABLE*", NIL != boundp($count_ops_table$) ? ((SubLObject) ($count_ops_table$.getGlobalValue())) : NIL);
        deflexical("*TRANSCRIPT-RENAME-HASH*", NIL != boundp($transcript_rename_hash$) ? ((SubLObject) ($transcript_rename_hash$.getGlobalValue())) : NIL);
        deflexical("*TRANSCRIPT-CREATE-HASH*", NIL != boundp($transcript_create_hash$) ? ((SubLObject) ($transcript_create_hash$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_transcript_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TRANSCRIPT-SUFFIX*", $$$ts);
            defparameter("*MASTER-TRANSCRIPT-ALREADY-EXISTS*", NIL);
            deflexical("*LOCAL-TRANSCRIPT-VERSION*", SubLTrampolineFile.maybeDefault($local_transcript_version$, $local_transcript_version$, ZERO_INTEGER));
            deflexical("*LOCAL-TRANSCRIPT-HISTORY*", SubLTrampolineFile.maybeDefault($local_transcript_history$, $local_transcript_history$, NIL));
            deflexical("*LOCAL-HL-TRANSCRIPT-VERSION*", SubLTrampolineFile.maybeDefault($local_hl_transcript_version$, $local_hl_transcript_version$, ZERO_INTEGER));
            deflexical("*LOCAL-HL-TRANSCRIPT-HISTORY*", SubLTrampolineFile.maybeDefault($local_hl_transcript_history$, $local_hl_transcript_history$, NIL));
            deflexical("*READ-TRANSCRIPT-POSITION*", SubLTrampolineFile.maybeDefault($read_transcript_position$, $read_transcript_position$, ZERO_INTEGER));
            defparameter("*APPROX-CHARS-PER-OP*", $int$206);
            deflexical("*LOCAL-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($local_transcript$, $local_transcript$, NIL));
            deflexical("*READ-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($read_transcript$, $read_transcript$, NIL));
            deflexical("*MASTER-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($master_transcript$, $master_transcript$, NIL));
            deflexical("*LOCAL-HL-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($local_hl_transcript$, $local_hl_transcript$, NIL));
            deflexical("*COUNT-OPS-TABLE*", SubLTrampolineFile.maybeDefault($count_ops_table$, $count_ops_table$, NIL));
            deflexical("*TRANSCRIPT-RENAME-HASH*", SubLTrampolineFile.maybeDefault($transcript_rename_hash$, $transcript_rename_hash$, NIL));
            deflexical("*TRANSCRIPT-CREATE-HASH*", SubLTrampolineFile.maybeDefault($transcript_create_hash$, $transcript_create_hash$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*LOCAL-TRANSCRIPT-VERSION*", NIL != boundp($local_transcript_version$) ? ((SubLObject) ($local_transcript_version$.getGlobalValue())) : ZERO_INTEGER);
            deflexical("*LOCAL-TRANSCRIPT-HISTORY*", NIL != boundp($local_transcript_history$) ? ((SubLObject) ($local_transcript_history$.getGlobalValue())) : NIL);
            deflexical("*LOCAL-HL-TRANSCRIPT-VERSION*", NIL != boundp($local_hl_transcript_version$) ? ((SubLObject) ($local_hl_transcript_version$.getGlobalValue())) : ZERO_INTEGER);
            deflexical("*LOCAL-HL-TRANSCRIPT-HISTORY*", NIL != boundp($local_hl_transcript_history$) ? ((SubLObject) ($local_hl_transcript_history$.getGlobalValue())) : NIL);
            deflexical("*READ-TRANSCRIPT-POSITION*", NIL != boundp($read_transcript_position$) ? ((SubLObject) ($read_transcript_position$.getGlobalValue())) : ZERO_INTEGER);
            deflexical("*LOCAL-TRANSCRIPT*", NIL != boundp($local_transcript$) ? ((SubLObject) ($local_transcript$.getGlobalValue())) : NIL);
            deflexical("*READ-TRANSCRIPT*", NIL != boundp($read_transcript$) ? ((SubLObject) ($read_transcript$.getGlobalValue())) : NIL);
            deflexical("*MASTER-TRANSCRIPT*", NIL != boundp($master_transcript$) ? ((SubLObject) ($master_transcript$.getGlobalValue())) : NIL);
            deflexical("*LOCAL-HL-TRANSCRIPT*", NIL != boundp($local_hl_transcript$) ? ((SubLObject) ($local_hl_transcript$.getGlobalValue())) : NIL);
            deflexical("*COUNT-OPS-TABLE*", NIL != boundp($count_ops_table$) ? ((SubLObject) ($count_ops_table$.getGlobalValue())) : NIL);
            deflexical("*TRANSCRIPT-RENAME-HASH*", NIL != boundp($transcript_rename_hash$) ? ((SubLObject) ($transcript_rename_hash$.getGlobalValue())) : NIL);
            deflexical("*TRANSCRIPT-CREATE-HASH*", NIL != boundp($transcript_create_hash$) ? ((SubLObject) ($transcript_create_hash$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_transcript_utilities_file_Previous() {
        defparameter("*TRANSCRIPT-SUFFIX*", $$$ts);
        defparameter("*MASTER-TRANSCRIPT-ALREADY-EXISTS*", NIL);
        deflexical("*LOCAL-TRANSCRIPT-VERSION*", SubLTrampolineFile.maybeDefault($local_transcript_version$, $local_transcript_version$, ZERO_INTEGER));
        deflexical("*LOCAL-TRANSCRIPT-HISTORY*", SubLTrampolineFile.maybeDefault($local_transcript_history$, $local_transcript_history$, NIL));
        deflexical("*LOCAL-HL-TRANSCRIPT-VERSION*", SubLTrampolineFile.maybeDefault($local_hl_transcript_version$, $local_hl_transcript_version$, ZERO_INTEGER));
        deflexical("*LOCAL-HL-TRANSCRIPT-HISTORY*", SubLTrampolineFile.maybeDefault($local_hl_transcript_history$, $local_hl_transcript_history$, NIL));
        deflexical("*READ-TRANSCRIPT-POSITION*", SubLTrampolineFile.maybeDefault($read_transcript_position$, $read_transcript_position$, ZERO_INTEGER));
        defparameter("*APPROX-CHARS-PER-OP*", $int$206);
        deflexical("*LOCAL-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($local_transcript$, $local_transcript$, NIL));
        deflexical("*READ-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($read_transcript$, $read_transcript$, NIL));
        deflexical("*MASTER-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($master_transcript$, $master_transcript$, NIL));
        deflexical("*LOCAL-HL-TRANSCRIPT*", SubLTrampolineFile.maybeDefault($local_hl_transcript$, $local_hl_transcript$, NIL));
        deflexical("*COUNT-OPS-TABLE*", SubLTrampolineFile.maybeDefault($count_ops_table$, $count_ops_table$, NIL));
        deflexical("*TRANSCRIPT-RENAME-HASH*", SubLTrampolineFile.maybeDefault($transcript_rename_hash$, $transcript_rename_hash$, NIL));
        deflexical("*TRANSCRIPT-CREATE-HASH*", SubLTrampolineFile.maybeDefault($transcript_create_hash$, $transcript_create_hash$, NIL));
        return NIL;
    }

    public static final SubLObject setup_transcript_utilities_file_alt() {
        declare_defglobal($local_transcript_version$);
        declare_defglobal($local_transcript_history$);
        declare_defglobal($local_hl_transcript_version$);
        declare_defglobal($local_hl_transcript_history$);
        declare_defglobal($read_transcript_position$);
        declare_defglobal($local_transcript$);
        declare_defglobal($read_transcript$);
        declare_defglobal($master_transcript$);
        declare_defglobal($local_hl_transcript$);
        declare_defglobal($count_ops_table$);
        declare_defglobal($transcript_rename_hash$);
        declare_defglobal($transcript_create_hash$);
        register_cyc_api_function(WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list_alt89, $str_alt90$Generate_a_KE_Text_file_from_a_tr, $list_alt91, NIL);
        return NIL;
    }

    public static SubLObject setup_transcript_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($local_transcript_version$);
            declare_defglobal($local_transcript_history$);
            declare_defglobal($local_hl_transcript_version$);
            declare_defglobal($local_hl_transcript_history$);
            declare_defglobal($read_transcript_position$);
            declare_defglobal($local_transcript$);
            declare_defglobal($read_transcript$);
            declare_defglobal($master_transcript$);
            declare_defglobal($local_hl_transcript$);
            declare_defglobal($count_ops_table$);
            declare_defglobal($transcript_rename_hash$);
            declare_defglobal($transcript_create_hash$);
            register_cyc_api_function(WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list63, $str64$Generate_a_KE_Text_file_from_a_tr, $list65, NIL);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list_alt89, $str_alt90$Generate_a_KE_Text_file_from_a_tr, $list_alt91, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_transcript_utilities_file_Previous() {
        declare_defglobal($local_transcript_version$);
        declare_defglobal($local_transcript_history$);
        declare_defglobal($local_hl_transcript_version$);
        declare_defglobal($local_hl_transcript_history$);
        declare_defglobal($read_transcript_position$);
        declare_defglobal($local_transcript$);
        declare_defglobal($read_transcript$);
        declare_defglobal($master_transcript$);
        declare_defglobal($local_hl_transcript$);
        declare_defglobal($count_ops_table$);
        declare_defglobal($transcript_rename_hash$);
        declare_defglobal($transcript_create_hash$);
        register_cyc_api_function(WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list63, $str64$Generate_a_KE_Text_file_from_a_tr, $list65, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transcript_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_transcript_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transcript_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt13$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt14$_s__ = makeString("~s~%");

    static private final SubLString $str_alt18$cyc_kb__a = makeString("cyc-kb-~a");

    static private final SubLString $str_alt19$_a_local__a = makeString("~a-local-~a");

    static private final SubLString $str_alt20$_a_local_hl__a = makeString("~a-local-hl-~a");

    static private final SubLString $str_alt21$_ = makeString(".");

    static private final SubLString $str_alt23$_4__0D = makeString("~4,'0D");

    static private final SubLString $$$0755 = makeString("0755");

    static private final SubLString $str_alt26$_TS = makeString(".TS");

    static private final SubLString $str_alt27$_ = makeString("-");

    static private final SubLString $str_alt28$_ts = makeString(".ts");

    static private final SubLString $str_alt34$_____s = makeString("~%~%~s");

    static private final SubLString $str_alt35$_s_is_not_a_stream_or_pathname_st = makeString("~s is not a stream or pathname string");

    static private final SubLString $str_alt36$__The_file__s_does_not_exist__or_ = makeString("~%The file ~s does not exist, or contains no operations.");

    static private final SubLString $str_alt37$___s_is_not_a_pathname_string__or = makeString("~%~s is not a pathname string, or the file does not exist.");

    static private final SubLString $str_alt39$Examining__A = makeString("Examining ~A");

    static private final SubLList $list_alt40 = list(makeSymbol("ENCAPSULATED-CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("WHEN"), cons(makeSymbol("FUNCTION"), makeSymbol("ARGS")));

    static private final SubLList $list_alt42 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    static private final SubLList $list_alt44 = list(makeSymbol("TERM"), makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt46 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt47$____Transcript____S = makeString(";;; Transcript:  ~S");

    static private final SubLString $str_alt48$______Examined______A = makeString("~%;;; Examined:    ~A");

    static private final SubLString $str_alt49$______Total_Ops_____S = makeString("~%;;; Total Ops:   ~S");

    static private final SubLString $str_alt50$______error_during_transcript_ana = makeString("~%;;; error during transcript analysis: At operation: ~S");

    static private final SubLString $str_alt51$___A = makeString("~%~A");

    static private final SubLList $list_alt52 = list(makeSymbol("TRANSCRIPT-CREATE-LIST"), makeSymbol("TRANSCRIPT-RENAME-LIST"), makeSymbol("TRANSCRIPT-KILL-LIST"));

    static private final SubLString $str_alt53$_______S_KILLED = makeString("~%;;; ~S KILLED");

    static private final SubLList $list_alt54 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    static private final SubLString $str_alt55$__EXTERNAL_ID__S____A_by__A_at__A = makeString("~%EXTERNAL-ID ~S : ~A by ~A at ~A");

    static private final SubLString $str_alt56$_______S_RENAMED = makeString("~%;;; ~S RENAMED");

    static private final SubLList $list_alt57 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    static private final SubLString $str_alt58$__EXTERNAL_ID__S____A_to__A_by__A = makeString("~%EXTERNAL-ID ~S : ~A to ~A by ~A at ~A");

    static private final SubLString $str_alt59$_______S_CREATED = makeString("~%;;; ~S CREATED");

    static private final SubLString $str_alt60$_______S_NEED_COMMENTS = makeString("~%;;; ~S NEED COMMENTS");

    static private final SubLString $str_alt61$______NEW_CONSTANTS_WITH_COMMENTS = makeString("~%;;; NEW CONSTANTS WITH COMMENTS");

    static private final SubLList $list_alt62 = list(makeSymbol("INFO"), makeSymbol("NAME"), makeSymbol("COMMENTS"));

    static private final SubLString $str_alt63$__EXTERNAL_ID__S____A____A__ = makeString("~%EXTERNAL-ID ~S : ~A~% ~A~%");

    static private final SubLString $str_alt64$_______S_NEED_NL = makeString("~%;;; ~S NEED NL");

    static private final SubLString $str_alt65$_______S_NEED_GEN = makeString("~%;;; ~S NEED GEN");

    static private final SubLSymbol $sym68$_ = makeSymbol("<");































    static private final SubLString $str_alt87$_A__ = makeString("~A~%");

    static private final SubLList $list_alt89 = list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("OUTPUT-FILENAME"));

    static private final SubLString $str_alt90$Generate_a_KE_Text_file_from_a_tr = makeString("Generate a KE Text file from a transcript and write it to a file.");

    static private final SubLList $list_alt91 = list(list(makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("OUTPUT-FILENAME"), makeSymbol("STRINGP")));

    static private final SubLString $str_alt95$Constant__ = makeString("Constant: ");

    static private final SubLList $list_alt96 = list(makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"));

    static private final SubLString $str_alt97$Rename__ = makeString("Rename: ");

    static private final SubLString $str_alt98$_ = makeString(" ");

    static private final SubLList $list_alt100 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));

    static private final SubLString $str_alt101$Merge__ = makeString("Merge: ");

    static private final SubLString $str_alt102$Kill__ = makeString("Kill: ");

    static private final SubLString $str_alt107$Enter_ = makeString("Enter.");

    static private final SubLString $str_alt108$___The_following_assertion_simula = makeString(";; The following assertion simulates an fi-reassert. (two of these simulate a repropagate)");

    static private final SubLString $str_alt110$Delete_ = makeString("Delete.");

    static private final SubLString $str_alt112$Delete_____Simulate_an_fi_blast_ = makeString("Delete. ;; Simulate an fi-blast.");

    static private final SubLString $str_alt113$In_Mt__ = makeString("In Mt: ");

    static private final SubLString $str_alt115$Truth_Value___unknown_ = makeString("Truth Value: :unknown.");

    static private final SubLString $str_alt118$Truth_Value___default_ = makeString("Truth Value: :default.");

    static private final SubLString $str_alt120$Truth_Value___monotonic_ = makeString("Truth Value: :monotonic.");

    static private final SubLString $str_alt122$Direction___forward_ = makeString("Direction: :forward.");

    static private final SubLString $str_alt124$Direction___backward_ = makeString("Direction: :backward.");

    static private final SubLString $str_alt126$Direction___code_ = makeString("Direction: :code.");

    static private final SubLString $str_alt127$_A___A_ = makeString("~A: ~A.");

    static private final SubLString $str_alt128$f___A_ = makeString("f: ~A.");

    static private final SubLString $str_alt132$___This_skolem_creation_should_be = makeString(";; This skolem creation should be implicit in the following assertion and can safely be deleted.");

    static private final SubLString $str_alt133$____A = makeString(";; ~A");

    static private final SubLString $str_alt134$___Don_t_know_how_convert_next_li = makeString(";; Don't know how convert next line");

    static private final SubLString $str_alt135$Internal_Error___A = makeString("Internal Error: ~A");

    static private final SubLString $str_alt136$_ = makeString(":");

    static private final SubLString $str_alt137$_ = makeString("'");

    static private final SubLString $str_alt140$_ = makeString("(");

    static private final SubLString $str_alt141$___ = makeString(" . ");

    static private final SubLString $str_alt142$_ = makeString(")");

    static private final SubLString $str_alt144$_ = makeString("\"");

    static private final SubLString $str_alt145$__ = makeString("\\\"");

    static private final SubLString $str_alt146$___ = makeString("\\\\\"");
}

/**
 * Total time: 996 ms
 */
