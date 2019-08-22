/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unicode_strings;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-N-TRIPLES-PARSER
 * source file: /cyc/top/cycl/rdf/rdf-n-triples-parser.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_n_triples_parser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rdf_n_triples_parser();

 public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $n_triple_whitespace_chars$ = makeSymbol("*N-TRIPLE-WHITESPACE-CHARS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $n_triple_eol_chars$ = makeSymbol("*N-TRIPLE-EOL-CHARS*");

    static private final SubLString $str2$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str5$Illegal_n_subject___S = makeString("Illegal n-subject: ~S");

    static private final SubLString $str6$Illegal_n_predicate___S = makeString("Illegal n-predicate: ~S");

    static private final SubLString $str7$Illegal_n_object___S = makeString("Illegal n-object: ~S");

    static private final SubLString $str8$_ = makeString(">");

    static private final SubLString $str9$_ = makeString("<");

    static private final SubLString $str10$No_close_quote_in__A = makeString("No close quote in ~A");

    static private final SubLString $str11$Invalid_n_literal___A = makeString("Invalid n-literal: ~A");



    private static final SubLInteger $int$92 = makeInteger(92);

    static private final SubLString $str14$Invalid_n_triple_escape_char__S_a = makeString("Invalid n-triple escape char ~S at ~D");

    private static final SubLSymbol TEST_RDF_N_TRIPLES_PARSER = makeSymbol("TEST-RDF-N-TRIPLES-PARSER");

    private static final SubLList $list19 = list(makeSymbol("RDF-TEST-CASE-TABLES"));

    private static final SubLList $list23 = list(list(NIL, ZERO_INTEGER));

    private static final SubLString $str25$_Directory__ = makeString(" Directory: ");

    private static final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLString $str27$_nt = makeString(".nt");

    static private final SubLString $str28$Running_RDF_parsing_tests___ = makeString("Running RDF parsing tests...");

    static private final SubLString $str30$__Failed___S__ = makeString("~&Failed: ~S~%");

    static private final SubLString $str31$__Summary___D_Parsed___D_Failed__ = makeString("~&Summary: ~D Parsed. ~D Failed~%");

    public static final SubLObject rdf_graph_from_n_triples_file_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_graph = rdf_graph.new_rdf_graph();
                SubLObject file_var = filename;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_1 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_1, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_1, NIL, NIL, UNPROVIDED)) {
                                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.parse_n_triple_file_line(line, v_graph);
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
                return v_graph;
            }
        }
    }

    public static SubLObject rdf_graph_from_n_triples_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = rdf_graph.new_rdf_graph();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$1 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$1); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$1)) {
                    parse_n_triple_file_line(line, v_graph);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
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
        return v_graph;
    }

    public static final SubLObject parse_n_triple_file_line_alt(SubLObject line, SubLObject v_graph) {
        {
            SubLObject trimmed_line = Strings.string_right_trim($n_triple_eol_chars$.getGlobalValue(), Strings.string_left_trim($n_triple_whitespace_chars$.getGlobalValue(), line));
            if (!((NIL != string_utilities.empty_string_p(trimmed_line)) || (NIL != com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.n_triple_comment_p(trimmed_line)))) {
                com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.parse_n_triple(trimmed_line, v_graph);
            }
        }
        return NIL;
    }

    public static SubLObject parse_n_triple_file_line(final SubLObject line, final SubLObject v_graph) {
        final SubLObject trimmed_line = Strings.string_right_trim($n_triple_eol_chars$.getGlobalValue(), Strings.string_left_trim($n_triple_whitespace_chars$.getGlobalValue(), line));
        if ((NIL == string_utilities.empty_string_p(trimmed_line)) && (NIL == n_triple_comment_p(trimmed_line))) {
            parse_n_triple(trimmed_line, v_graph);
        }
        return NIL;
    }

    public static final SubLObject n_triple_comment_p_alt(SubLObject trimmed_line) {
        return eql(string_utilities.first_char(trimmed_line), CHAR_hash);
    }

    public static SubLObject n_triple_comment_p(final SubLObject trimmed_line) {
        return eql(string_utilities.first_char(trimmed_line), CHAR_hash);
    }

    public static final SubLObject parse_n_triple_alt(SubLObject triple, SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject n_subject = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.tokenize_n_triple(triple);
                SubLObject n_predicate = thread.secondMultipleValue();
                SubLObject n_object = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject subject = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_subject(n_subject, v_graph);
                    SubLObject predicate = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_predicate(n_predicate);
                    SubLObject v_object = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_object(n_object, v_graph);
                    rdf_graph.rdf_graph_add_triple(v_graph, subject, predicate, v_object);
                }
            }
            return NIL;
        }
    }

    public static SubLObject parse_n_triple(final SubLObject triple, final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject n_subject = tokenize_n_triple(triple);
        final SubLObject n_predicate = thread.secondMultipleValue();
        final SubLObject n_object = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subject = resolve_n_subject(n_subject, v_graph);
        final SubLObject predicate = resolve_n_predicate(n_predicate);
        final SubLObject v_object = resolve_n_object(n_object, v_graph);
        rdf_graph.rdf_graph_add_triple(v_graph, subject, predicate, v_object);
        return NIL;
    }

    public static final SubLObject tokenize_n_triple_alt(SubLObject triple) {
        {
            SubLObject state = $BETWEEN_TOKENS;
            SubLObject inside_quoteP = NIL;
            SubLObject next_token_stream = make_private_string_output_stream();
            SubLObject prev_char = NIL;
            SubLObject subject = NIL;
            SubLObject predicate = NIL;
            SubLObject v_object = NIL;
            SubLObject string_var = triple;
            SubLObject end_var = length(string_var);
            if (NIL == v_object) {
                {
                    SubLObject end_var_2 = end_var;
                    SubLObject char_num = NIL;
                    for (char_num = ZERO_INTEGER; !((NIL != v_object) || char_num.numGE(end_var_2)); char_num = number_utilities.f_1X(char_num)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                            SubLObject pcase_var = state;
                            if (pcase_var.eql($BETWEEN_TOKENS)) {
                                if (NIL == member(v_char, $n_triple_whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                                    princ(v_char, next_token_stream);
                                    inside_quoteP = eql(CHAR_quotation, v_char);
                                    state = $READING_TOKEN;
                                }
                            } else {
                                if (pcase_var.eql($READING_TOKEN)) {
                                    if ((NIL != inside_quoteP) || (NIL == member(v_char, $n_triple_whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                                        princ(v_char, next_token_stream);
                                        inside_quoteP = makeBoolean((NIL != inside_quoteP) && (prev_char.eql(CHAR_backslash) || (!CHAR_quotation.eql(v_char))));
                                    } else {
                                        if (NIL == subject) {
                                            subject = get_output_stream_string(next_token_stream);
                                            next_token_stream = make_private_string_output_stream();
                                            state = $BETWEEN_TOKENS;
                                        } else {
                                            if (NIL == predicate) {
                                                predicate = get_output_stream_string(next_token_stream);
                                                next_token_stream = make_private_string_output_stream();
                                                state = $BETWEEN_TOKENS;
                                            } else {
                                                if (NIL == v_object) {
                                                    v_object = get_output_stream_string(next_token_stream);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            prev_char = v_char;
                        }
                    }
                }
            }
            return values(subject, predicate, v_object);
        }
    }

    public static SubLObject tokenize_n_triple(final SubLObject triple) {
        SubLObject state = $BETWEEN_TOKENS;
        SubLObject inside_quoteP = NIL;
        SubLObject next_token_stream = make_private_string_output_stream();
        SubLObject prev_char = NIL;
        SubLObject subject = NIL;
        SubLObject predicate = NIL;
        SubLObject v_object = NIL;
        final SubLObject end_var = length(triple);
        if (NIL == v_object) {
            SubLObject end_var_$2;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject pcase_var;
            for (end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == v_object) && (!char_num.numGE(end_var_$2)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(triple, char_num);
                pcase_var = state;
                if (pcase_var.eql($BETWEEN_TOKENS)) {
                    if (NIL == member(v_char, $n_triple_whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        princ(v_char, next_token_stream);
                        inside_quoteP = eql(CHAR_quotation, v_char);
                        state = $READING_TOKEN;
                    }
                } else
                    if (pcase_var.eql($READING_TOKEN)) {
                        if ((NIL != inside_quoteP) || (NIL == member(v_char, $n_triple_whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                            princ(v_char, next_token_stream);
                            inside_quoteP = makeBoolean((NIL != inside_quoteP) && (prev_char.eql(CHAR_backslash) || (!CHAR_quotation.eql(v_char))));
                        } else
                            if (NIL == subject) {
                                subject = get_output_stream_string(next_token_stream);
                                next_token_stream = make_private_string_output_stream();
                                state = $BETWEEN_TOKENS;
                            } else
                                if (NIL == predicate) {
                                    predicate = get_output_stream_string(next_token_stream);
                                    next_token_stream = make_private_string_output_stream();
                                    state = $BETWEEN_TOKENS;
                                } else
                                    if (NIL == v_object) {
                                        v_object = get_output_stream_string(next_token_stream);
                                    }



                    }

                prev_char = v_char;
            }
        }
        return values(subject, predicate, v_object);
    }

    public static final SubLObject resolve_n_subject_alt(SubLObject n_subject, SubLObject v_graph) {
        {
            SubLObject pcase_var = string_utilities.first_char(n_subject);
            if (pcase_var.eql(CHAR_less)) {
                return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_uriref(n_subject);
            } else {
                if (pcase_var.eql(CHAR_underbar)) {
                    return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_node_id(n_subject, v_graph);
                } else {
                    Errors.error($str_alt5$Illegal_n_subject___S, n_subject);
                }
            }
        }
        return NIL;
    }

    public static SubLObject resolve_n_subject(final SubLObject n_subject, final SubLObject v_graph) {
        final SubLObject pcase_var = string_utilities.first_char(n_subject);
        if (pcase_var.eql(CHAR_less)) {
            return resolve_n_uriref(n_subject);
        }
        if (pcase_var.eql(CHAR_underbar)) {
            return resolve_n_node_id(n_subject, v_graph);
        }
        Errors.error($str5$Illegal_n_subject___S, n_subject);
        return NIL;
    }

    public static final SubLObject resolve_n_predicate_alt(SubLObject n_predicate) {
        {
            SubLObject pcase_var = string_utilities.first_char(n_predicate);
            if (pcase_var.eql(CHAR_less)) {
                return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_uriref(n_predicate);
            } else {
                Errors.error($str_alt6$Illegal_n_predicate___S, n_predicate);
            }
        }
        return NIL;
    }

    public static SubLObject resolve_n_predicate(final SubLObject n_predicate) {
        final SubLObject pcase_var = string_utilities.first_char(n_predicate);
        if (pcase_var.eql(CHAR_less)) {
            return resolve_n_uriref(n_predicate);
        }
        Errors.error($str6$Illegal_n_predicate___S, n_predicate);
        return NIL;
    }

    public static final SubLObject resolve_n_object_alt(SubLObject n_object, SubLObject v_graph) {
        {
            SubLObject pcase_var = string_utilities.first_char(n_object);
            if (pcase_var.eql(CHAR_less)) {
                return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_uriref(n_object);
            } else {
                if (pcase_var.eql(CHAR_quotation)) {
                    return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_literal(n_object);
                } else {
                    if (pcase_var.eql(CHAR_underbar)) {
                        return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_node_id(n_object, v_graph);
                    } else {
                        Errors.error($str_alt7$Illegal_n_object___S, n_object);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject resolve_n_object(final SubLObject n_object, final SubLObject v_graph) {
        final SubLObject pcase_var = string_utilities.first_char(n_object);
        if (pcase_var.eql(CHAR_less)) {
            return resolve_n_uriref(n_object);
        }
        if (pcase_var.eql(CHAR_quotation)) {
            return resolve_n_literal(n_object);
        }
        if (pcase_var.eql(CHAR_underbar)) {
            return resolve_n_node_id(n_object, v_graph);
        }
        Errors.error($str7$Illegal_n_object___S, n_object);
        return NIL;
    }

    public static final SubLObject resolve_n_uriref_alt(SubLObject n_uriref) {
        return com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.n_triple_string_to_utf8_string(string_utilities.pre_remove(string_utilities.post_remove(n_uriref, $str_alt8$_, UNPROVIDED), $str_alt9$_, UNPROVIDED));
    }

    public static SubLObject resolve_n_uriref(final SubLObject n_uriref) {
        return n_triple_string_to_utf8_string(string_utilities.pre_remove(string_utilities.post_remove(n_uriref, $str8$_, UNPROVIDED), $str9$_, UNPROVIDED));
    }

    public static final SubLObject resolve_n_literal_alt(SubLObject n_literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject close_quote_position = position(CHAR_quotation, n_literal, symbol_function(EQL), symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
                while ((NIL != close_quote_position) && CHAR_backslash.eql(Strings.sublisp_char(n_literal, number_utilities.f_1_(close_quote_position)))) {
                    close_quote_position = position(CHAR_quotation, n_literal, symbol_function(EQL), symbol_function(IDENTITY), number_utilities.f_1X(close_quote_position), UNPROVIDED);
                } 
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == close_quote_position) {
                        Errors.error($str_alt10$No_close_quote_in__A, n_literal);
                    }
                }
                {
                    SubLObject lexical_form = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.n_triple_string_to_utf8_string(string_utilities.substring(n_literal, ONE_INTEGER, close_quote_position));
                    SubLObject language_tag = NIL;
                    SubLObject datatype = NIL;
                    if (NIL != list_utilities.lengthE(n_literal, number_utilities.f_1X(close_quote_position), UNPROVIDED)) {
                    } else {
                        if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql(CHAR_at)) {
                            language_tag = string_utilities.substring(n_literal, add(close_quote_position, TWO_INTEGER), UNPROVIDED);
                        } else {
                            if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql(CHAR_caret)) {
                                datatype = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.resolve_n_uriref(string_utilities.substring(n_literal, add(close_quote_position, THREE_INTEGER), UNPROVIDED));
                            } else {
                                Errors.error($str_alt11$Invalid_n_literal___A, n_literal);
                            }
                        }
                    }
                    return rdf_literal.new_rdf_literal(lexical_form, language_tag, datatype);
                }
            }
        }
    }

    public static SubLObject resolve_n_literal(final SubLObject n_literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject close_quote_position;
        for (close_quote_position = position(CHAR_quotation, n_literal, symbol_function(EQL), symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED); (NIL != close_quote_position) && CHAR_backslash.eql(Strings.sublisp_char(n_literal, number_utilities.f_1_(close_quote_position))); close_quote_position = position(CHAR_quotation, n_literal, symbol_function(EQL), symbol_function(IDENTITY), number_utilities.f_1X(close_quote_position), UNPROVIDED)) {
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == close_quote_position)) {
            Errors.error($str10$No_close_quote_in__A, n_literal);
        }
        final SubLObject lexical_form = n_triple_string_to_utf8_string(string_utilities.substring(n_literal, ONE_INTEGER, close_quote_position));
        SubLObject language_tag = NIL;
        SubLObject datatype = NIL;
        if (NIL == list_utilities.lengthE(n_literal, number_utilities.f_1X(close_quote_position), UNPROVIDED)) {
            if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql(CHAR_at)) {
                language_tag = string_utilities.substring(n_literal, add(close_quote_position, TWO_INTEGER), UNPROVIDED);
            } else
                if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql(CHAR_caret)) {
                    datatype = resolve_n_uriref(string_utilities.substring(n_literal, add(close_quote_position, THREE_INTEGER), UNPROVIDED));
                } else {
                    Errors.error($str11$Invalid_n_literal___A, n_literal);
                }

        }
        return rdf_literal.new_rdf_literal(lexical_form, language_tag, datatype);
    }

    public static final SubLObject n_triple_string_to_utf8_string_alt(SubLObject string) {
        if (NIL == find(CHAR_backslash, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string;
        }
        return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.n_triple_string_to_unicode_vector(string), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject n_triple_string_to_utf8_string(final SubLObject string) {
        if (NIL == find(CHAR_backslash, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string;
        }
        return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(n_triple_string_to_unicode_vector(string), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject n_triple_string_to_unicode_vector_alt(SubLObject string) {
        {
            SubLObject unicode_points = NIL;
            SubLObject i = ZERO_INTEGER;
            while (NIL != list_utilities.lengthG(string, i, UNPROVIDED)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string, i);
                    SubLObject this_code_point = char_code(v_char);
                    if (v_char.eql(CHAR_backslash)) {
                        {
                            SubLObject pcase_var = Strings.sublisp_char(string, number_utilities.f_1X(i));
                            if (pcase_var.eql(CHAR_u)) {
                                {
                                    SubLObject hex_string = string_utilities.substring(string, add(i, TWO_INTEGER), add(i, SIX_INTEGER));
                                    this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                                    i = add(i, FIVE_INTEGER);
                                }
                            } else {
                                if (pcase_var.eql(CHAR_U)) {
                                    {
                                        SubLObject hex_string = string_utilities.substring(string, add(i, TWO_INTEGER), add(i, TEN_INTEGER));
                                        this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                                        i = add(i, NINE_INTEGER);
                                    }
                                } else {
                                    if (pcase_var.eql(CHAR_t)) {
                                        this_code_point = NINE_INTEGER;
                                        i = add(i, ONE_INTEGER);
                                    } else {
                                        if (pcase_var.eql(CHAR_n)) {
                                            this_code_point = TEN_INTEGER;
                                            i = add(i, ONE_INTEGER);
                                        } else {
                                            if (pcase_var.eql(CHAR_r)) {
                                                this_code_point = THIRTEEN_INTEGER;
                                                i = add(i, ONE_INTEGER);
                                            } else {
                                                if (pcase_var.eql(CHAR_quotation)) {
                                                    this_code_point = $int$34;
                                                    i = add(i, ONE_INTEGER);
                                                } else {
                                                    if (pcase_var.eql(CHAR_backslash)) {
                                                        this_code_point = $int$92;
                                                        i = add(i, ONE_INTEGER);
                                                    } else {
                                                        Errors.error($str_alt14$Invalid_n_triple_escape_char__S_a, v_char, i);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    unicode_points = cons(this_code_point, unicode_points);
                    i = add(i, ONE_INTEGER);
                }
            } 
            return list_utilities.list2vector(nreverse(unicode_points));
        }
    }

    public static SubLObject n_triple_string_to_unicode_vector(final SubLObject string) {
        SubLObject unicode_points = NIL;
        for (SubLObject i = ZERO_INTEGER; NIL != list_utilities.lengthG(string, i, UNPROVIDED); i = add(i, ONE_INTEGER)) {
            final SubLObject v_char = Strings.sublisp_char(string, i);
            SubLObject this_code_point = char_code(v_char);
            if (v_char.eql(CHAR_backslash)) {
                final SubLObject pcase_var = Strings.sublisp_char(string, number_utilities.f_1X(i));
                if (pcase_var.eql(CHAR_u)) {
                    final SubLObject hex_string = string_utilities.substring(string, add(i, TWO_INTEGER), add(i, SIX_INTEGER));
                    this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                    i = add(i, FIVE_INTEGER);
                } else
                    if (pcase_var.eql(CHAR_U)) {
                        final SubLObject hex_string = string_utilities.substring(string, add(i, TWO_INTEGER), add(i, TEN_INTEGER));
                        this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                        i = add(i, NINE_INTEGER);
                    } else
                        if (pcase_var.eql(CHAR_t)) {
                            this_code_point = NINE_INTEGER;
                            i = add(i, ONE_INTEGER);
                        } else
                            if (pcase_var.eql(CHAR_n)) {
                                this_code_point = TEN_INTEGER;
                                i = add(i, ONE_INTEGER);
                            } else
                                if (pcase_var.eql(CHAR_r)) {
                                    this_code_point = THIRTEEN_INTEGER;
                                    i = add(i, ONE_INTEGER);
                                } else
                                    if (pcase_var.eql(CHAR_quotation)) {
                                        this_code_point = $int$34;
                                        i = add(i, ONE_INTEGER);
                                    } else
                                        if (pcase_var.eql(CHAR_backslash)) {
                                            this_code_point = $int$92;
                                            i = add(i, ONE_INTEGER);
                                        } else {
                                            Errors.error($str14$Invalid_n_triple_escape_char__S_a, v_char, i);
                                        }






            }
            unicode_points = cons(this_code_point, unicode_points);
        }
        return list_utilities.list2vector(nreverse(unicode_points));
    }

    public static final SubLObject resolve_n_node_id_alt(SubLObject n_node_id, SubLObject v_graph) {
        return rdf_graph.rdf_graph_get_blank_node(v_graph, string_utilities.substring(n_node_id, TWO_INTEGER, UNPROVIDED));
    }

    public static SubLObject resolve_n_node_id(final SubLObject n_node_id, final SubLObject v_graph) {
        return rdf_graph.rdf_graph_get_blank_node(v_graph, string_utilities.substring(n_node_id, TWO_INTEGER, UNPROVIDED));
    }

    public static final SubLObject test_rdf_n_triples_parser_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_files = NIL;
                SubLObject parsed = NIL;
                SubLObject failed = NIL;
                SubLTrampolineFile.checkType(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue(), DIRECTORY_P);
                {
                    SubLObject directory_list_var = list(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue());
                    SubLObject current_directory_var = NIL;
                    for (current_directory_var = directory_list_var.first(); NIL != directory_list_var; current_directory_var = directory_list_var.first()) {
                        directory_list_var = directory_list_var.rest();
                        SubLTrampolineFile.checkType(current_directory_var, DIRECTORY_P);
                        {
                            SubLObject directory_contents_var = Filesys.directory(current_directory_var, T);
                            SubLObject progress_message_var = (NIL.isString()) ? ((SubLObject) (cconcatenate(NIL, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str_alt26$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })))) : NIL;
                            {
                                SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                                try {
                                    $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                    {
                                        SubLObject list_var = directory_contents_var;
                                        $progress_note$.setDynamicValue(progress_message_var, thread);
                                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        $progress_total$.setDynamicValue(length(list_var), thread);
                                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0_3 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject csome_list_var = list_var;
                                                    SubLObject file = NIL;
                                                    for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                        if (NIL != Filesys.directory_p(file)) {
                                                            directory_list_var = cons(file, directory_list_var);
                                                        } else {
                                                            if (NIL != string_utilities.ends_with(file, $str_alt27$_nt, UNPROVIDED)) {
                                                                test_files = cons(file, test_files);
                                                            }
                                                        }
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $silent_progressP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject list_var = test_files;
                    $progress_note$.setDynamicValue($str_alt28$Running_RDF_parsing_tests___, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject file = NIL;
                                for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    {
                                        SubLObject error_message = NIL;
                                        SubLObject v_graph = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_4 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        v_graph = com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser.rdf_graph_from_n_triples_file(file);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                                            parsed = cons(file, parsed);
                                        } else {
                                            failed = cons(list(file, error_message), failed);
                                        }
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                format(T, $str_alt30$__Failed___S__, failed);
                format(T, $str_alt31$__Summary___D_Parsed___D_Failed__, length(parsed), length(failed));
                return length(failed);
            }
        }
    }

    public static SubLObject test_rdf_n_triples_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_files = NIL;
        SubLObject parsed = NIL;
        SubLObject failed = NIL;
        assert NIL != Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) : "! Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) " + ("Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) " + "CommonSymbols.NIL != Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) ") + rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue();
        SubLObject directory_list_var = list(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue());
        SubLObject current_directory_var = NIL;
        current_directory_var = directory_list_var.first();
        while (NIL != directory_list_var) {
            directory_list_var = directory_list_var.rest();
            assert NIL != Filesys.directory_p(current_directory_var) : "! Filesys.directory_p(current_directory_var) " + ("Filesys.directory_p(current_directory_var) " + "CommonSymbols.NIL != Filesys.directory_p(current_directory_var) ") + current_directory_var;
            SubLObject directory_contents_var = Filesys.directory(current_directory_var, T);
            final SubLObject progress_message_var = (NIL.isString()) ? cconcatenate(NIL, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str25$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })) : NIL;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$3 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = NIL;
                        file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != Filesys.directory_p(file)) {
                                directory_list_var = cons(file, directory_list_var);
                            } else
                                if (NIL != string_utilities.ends_with(file, $str27$_nt, UNPROVIDED)) {
                                    test_files = cons(file, test_files);
                                }

                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
            current_directory_var = directory_list_var.first();
        } 
        final SubLObject list_var2 = test_files;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str28$Running_RDF_parsing_tests___, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var2), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject file2 = NIL;
                file2 = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    SubLObject error_message = NIL;
                    SubLObject v_graph = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                v_graph = rdf_graph_from_n_triples_file(file2);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                        parsed = cons(file2, parsed);
                    } else {
                        failed = cons(list(file2, error_message), failed);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    file2 = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        format(T, $str30$__Failed___S__, failed);
        format(T, $str31$__Summary___D_Parsed___D_Failed__, length(parsed), length(failed));
        return length(failed);
    }

    public static SubLObject declare_rdf_n_triples_parser_file() {
        declareFunction("rdf_graph_from_n_triples_file", "RDF-GRAPH-FROM-N-TRIPLES-FILE", 1, 0, false);
        declareFunction("parse_n_triple_file_line", "PARSE-N-TRIPLE-FILE-LINE", 2, 0, false);
        declareFunction("n_triple_comment_p", "N-TRIPLE-COMMENT-P", 1, 0, false);
        declareFunction("parse_n_triple", "PARSE-N-TRIPLE", 2, 0, false);
        declareFunction("tokenize_n_triple", "TOKENIZE-N-TRIPLE", 1, 0, false);
        declareFunction("resolve_n_subject", "RESOLVE-N-SUBJECT", 2, 0, false);
        declareFunction("resolve_n_predicate", "RESOLVE-N-PREDICATE", 1, 0, false);
        declareFunction("resolve_n_object", "RESOLVE-N-OBJECT", 2, 0, false);
        declareFunction("resolve_n_uriref", "RESOLVE-N-URIREF", 1, 0, false);
        declareFunction("resolve_n_literal", "RESOLVE-N-LITERAL", 1, 0, false);
        declareFunction("n_triple_string_to_utf8_string", "N-TRIPLE-STRING-TO-UTF8-STRING", 1, 0, false);
        declareFunction("n_triple_string_to_unicode_vector", "N-TRIPLE-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction("resolve_n_node_id", "RESOLVE-N-NODE-ID", 2, 0, false);
        declareFunction("test_rdf_n_triples_parser", "TEST-RDF-N-TRIPLES-PARSER", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_n_triples_parser_file() {
        deflexical("*N-TRIPLE-WHITESPACE-CHARS*", list(code_char($int$32), code_char(NINE_INTEGER)));
        deflexical("*N-TRIPLE-EOL-CHARS*", list(code_char(THIRTEEN_INTEGER), code_char(TEN_INTEGER)));
        return NIL;
    }

    public static final SubLObject setup_rdf_n_triples_parser_file_alt() {
        define_test_case_table_int(TEST_RDF_N_TRIPLES_PARSER, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, $list_alt20, $KB, $TINY, $WORKING_, T }), $list_alt24);
        return NIL;
    }

    public static SubLObject setup_rdf_n_triples_parser_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(TEST_RDF_N_TRIPLES_PARSER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list19, $KB, $TINY, $WORKING_, T }), $list23);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_RDF_N_TRIPLES_PARSER, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, $list_alt20, $KB, $TINY, $WORKING_, T }), $list_alt24);
        }
        return NIL;
    }

    public static SubLObject setup_rdf_n_triples_parser_file_Previous() {
        define_test_case_table_int(TEST_RDF_N_TRIPLES_PARSER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list19, $KB, $TINY, $WORKING_, T }), $list23);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_n_triples_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_n_triples_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_n_triples_parser_file();
    }

    

    static private final SubLString $str_alt2$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt5$Illegal_n_subject___S = makeString("Illegal n-subject: ~S");

    static private final SubLString $str_alt6$Illegal_n_predicate___S = makeString("Illegal n-predicate: ~S");

    static private final SubLString $str_alt7$Illegal_n_object___S = makeString("Illegal n-object: ~S");

    static private final SubLString $str_alt8$_ = makeString(">");

    static private final SubLString $str_alt9$_ = makeString("<");

    static private final SubLString $str_alt10$No_close_quote_in__A = makeString("No close quote in ~A");

    static private final SubLString $str_alt11$Invalid_n_literal___A = makeString("Invalid n-literal: ~A");

    static private final SubLString $str_alt14$Invalid_n_triple_escape_char__S_a = makeString("Invalid n-triple escape char ~S at ~D");

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt20 = list(makeSymbol("RDF-TEST-CASE-TABLES"));

    static private final SubLList $list_alt24 = list(list(NIL, ZERO_INTEGER));

    static private final SubLString $str_alt26$_Directory__ = makeString(" Directory: ");

    static private final SubLString $str_alt27$_nt = makeString(".nt");

    static private final SubLString $str_alt28$Running_RDF_parsing_tests___ = makeString("Running RDF parsing tests...");

    static private final SubLString $str_alt30$__Failed___S__ = makeString("~&Failed: ~S~%");

    static private final SubLString $str_alt31$__Summary___D_Parsed___D_Failed__ = makeString("~&Summary: ~D Parsed. ~D Failed~%");
}

/**
 * Total time: 321 ms
 */
