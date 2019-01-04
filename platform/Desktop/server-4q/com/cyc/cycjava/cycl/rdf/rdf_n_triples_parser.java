package com.cyc.cycjava.cycl.rdf;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_n_triples_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser";
    public static final String myFingerPrint = "b8601ee5fbaa414fc7fab1a66fdbbef0aa2142cab8b3aa25998b3c7f8cb669b6";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 919L)
    private static SubLSymbol $n_triple_whitespace_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 1065L)
    private static SubLSymbol $n_triple_eol_chars$;
    private static final SubLInteger $int0$32;
    private static final SubLSymbol $kw1$INPUT;
    private static final SubLString $str2$Unable_to_open__S;
    private static final SubLSymbol $kw3$BETWEEN_TOKENS;
    private static final SubLSymbol $kw4$READING_TOKEN;
    private static final SubLString $str5$Illegal_n_subject___S;
    private static final SubLString $str6$Illegal_n_predicate___S;
    private static final SubLString $str7$Illegal_n_object___S;
    private static final SubLString $str8$_;
    private static final SubLString $str9$_;
    private static final SubLString $str10$No_close_quote_in__A;
    private static final SubLString $str11$Invalid_n_literal___A;
    private static final SubLInteger $int12$34;
    private static final SubLInteger $int13$92;
    private static final SubLString $str14$Invalid_n_triple_escape_char__S_a;
    private static final SubLSymbol $sym15$TEST_RDF_N_TRIPLES_PARSER;
    private static final SubLSymbol $kw16$TEST;
    private static final SubLSymbol $kw17$OWNER;
    private static final SubLSymbol $kw18$CLASSES;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$KB;
    private static final SubLSymbol $kw21$TINY;
    private static final SubLSymbol $kw22$WORKING_;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$DIRECTORY_P;
    private static final SubLString $str25$_Directory__;
    private static final SubLString $str26$cdolist;
    private static final SubLString $str27$_nt;
    private static final SubLString $str28$Running_RDF_parsing_tests___;
    private static final SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str30$__Failed___S__;
    private static final SubLString $str31$__Summary___D_Parsed___D_Failed__;
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 1188L)
    public static SubLObject rdf_graph_from_n_triples_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = rdf_graph.new_rdf_graph();
        SubLObject stream = (SubLObject)rdf_n_triples_parser.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rdf_n_triples_parser.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rdf_n_triples_parser.$kw1$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rdf_n_triples_parser.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$1 = stream_var;
                SubLObject line_number_var = (SubLObject)rdf_n_triples_parser.NIL;
                SubLObject line = (SubLObject)rdf_n_triples_parser.NIL;
                line_number_var = (SubLObject)rdf_n_triples_parser.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$1); rdf_n_triples_parser.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$1)) {
                    parse_n_triple_file_line(line, v_graph);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_n_triples_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rdf_n_triples_parser.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 1404L)
    public static SubLObject parse_n_triple_file_line(final SubLObject line, final SubLObject v_graph) {
        final SubLObject trimmed_line = Strings.string_right_trim(rdf_n_triples_parser.$n_triple_eol_chars$.getGlobalValue(), Strings.string_left_trim(rdf_n_triples_parser.$n_triple_whitespace_chars$.getGlobalValue(), line));
        if (rdf_n_triples_parser.NIL == string_utilities.empty_string_p(trimmed_line) && rdf_n_triples_parser.NIL == n_triple_comment_p(trimmed_line)) {
            parse_n_triple(trimmed_line, v_graph);
        }
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 1747L)
    public static SubLObject n_triple_comment_p(final SubLObject trimmed_line) {
        return Equality.eql(string_utilities.first_char(trimmed_line), (SubLObject)Characters.CHAR_hash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 1843L)
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
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 2204L)
    public static SubLObject tokenize_n_triple(final SubLObject triple) {
        SubLObject state = (SubLObject)rdf_n_triples_parser.$kw3$BETWEEN_TOKENS;
        SubLObject inside_quoteP = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject next_token_stream = streams_high.make_private_string_output_stream();
        SubLObject prev_char = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject subject = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject predicate = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject v_object = (SubLObject)rdf_n_triples_parser.NIL;
        final SubLObject end_var = Sequences.length(triple);
        if (rdf_n_triples_parser.NIL == v_object) {
            SubLObject end_var_$2;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject pcase_var;
            for (end_var_$2 = end_var, char_num = (SubLObject)rdf_n_triples_parser.NIL, char_num = (SubLObject)rdf_n_triples_parser.ZERO_INTEGER; rdf_n_triples_parser.NIL == v_object && !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(triple, char_num);
                pcase_var = state;
                if (pcase_var.eql((SubLObject)rdf_n_triples_parser.$kw3$BETWEEN_TOKENS)) {
                    if (rdf_n_triples_parser.NIL == conses_high.member(v_char, rdf_n_triples_parser.$n_triple_whitespace_chars$.getGlobalValue(), (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {
                        print_high.princ(v_char, next_token_stream);
                        inside_quoteP = Equality.eql((SubLObject)Characters.CHAR_quotation, v_char);
                        state = (SubLObject)rdf_n_triples_parser.$kw4$READING_TOKEN;
                    }
                }
                else if (pcase_var.eql((SubLObject)rdf_n_triples_parser.$kw4$READING_TOKEN)) {
                    if (rdf_n_triples_parser.NIL != inside_quoteP || rdf_n_triples_parser.NIL == conses_high.member(v_char, rdf_n_triples_parser.$n_triple_whitespace_chars$.getGlobalValue(), (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {
                        print_high.princ(v_char, next_token_stream);
                        inside_quoteP = (SubLObject)SubLObjectFactory.makeBoolean(rdf_n_triples_parser.NIL != inside_quoteP && (prev_char.eql((SubLObject)Characters.CHAR_backslash) || !Characters.CHAR_quotation.eql(v_char)));
                    }
                    else if (rdf_n_triples_parser.NIL == subject) {
                        subject = streams_high.get_output_stream_string(next_token_stream);
                        next_token_stream = streams_high.make_private_string_output_stream();
                        state = (SubLObject)rdf_n_triples_parser.$kw3$BETWEEN_TOKENS;
                    }
                    else if (rdf_n_triples_parser.NIL == predicate) {
                        predicate = streams_high.get_output_stream_string(next_token_stream);
                        next_token_stream = streams_high.make_private_string_output_stream();
                        state = (SubLObject)rdf_n_triples_parser.$kw3$BETWEEN_TOKENS;
                    }
                    else if (rdf_n_triples_parser.NIL == v_object) {
                        v_object = streams_high.get_output_stream_string(next_token_stream);
                    }
                }
                prev_char = v_char;
            }
        }
        return Values.values(subject, predicate, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 3451L)
    public static SubLObject resolve_n_subject(final SubLObject n_subject, final SubLObject v_graph) {
        final SubLObject pcase_var = string_utilities.first_char(n_subject);
        if (pcase_var.eql((SubLObject)Characters.CHAR_less)) {
            return resolve_n_uriref(n_subject);
        }
        if (pcase_var.eql((SubLObject)Characters.CHAR_underbar)) {
            return resolve_n_node_id(n_subject, v_graph);
        }
        Errors.error((SubLObject)rdf_n_triples_parser.$str5$Illegal_n_subject___S, n_subject);
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 3708L)
    public static SubLObject resolve_n_predicate(final SubLObject n_predicate) {
        final SubLObject pcase_var = string_utilities.first_char(n_predicate);
        if (pcase_var.eql((SubLObject)Characters.CHAR_less)) {
            return resolve_n_uriref(n_predicate);
        }
        Errors.error((SubLObject)rdf_n_triples_parser.$str6$Illegal_n_predicate___S, n_predicate);
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 3914L)
    public static SubLObject resolve_n_object(final SubLObject n_object, final SubLObject v_graph) {
        final SubLObject pcase_var = string_utilities.first_char(n_object);
        if (pcase_var.eql((SubLObject)Characters.CHAR_less)) {
            return resolve_n_uriref(n_object);
        }
        if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
            return resolve_n_literal(n_object);
        }
        if (pcase_var.eql((SubLObject)Characters.CHAR_underbar)) {
            return resolve_n_node_id(n_object, v_graph);
        }
        Errors.error((SubLObject)rdf_n_triples_parser.$str7$Illegal_n_object___S, n_object);
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 4215L)
    public static SubLObject resolve_n_uriref(final SubLObject n_uriref) {
        return n_triple_string_to_utf8_string(string_utilities.pre_remove(string_utilities.post_remove(n_uriref, (SubLObject)rdf_n_triples_parser.$str8$_, (SubLObject)rdf_n_triples_parser.UNPROVIDED), (SubLObject)rdf_n_triples_parser.$str9$_, (SubLObject)rdf_n_triples_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 4346L)
    public static SubLObject resolve_n_literal(final SubLObject n_literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject close_quote_position;
        for (close_quote_position = Sequences.position((SubLObject)Characters.CHAR_quotation, n_literal, Symbols.symbol_function((SubLObject)rdf_n_triples_parser.EQL), Symbols.symbol_function((SubLObject)rdf_n_triples_parser.IDENTITY), (SubLObject)rdf_n_triples_parser.ONE_INTEGER, (SubLObject)rdf_n_triples_parser.UNPROVIDED); rdf_n_triples_parser.NIL != close_quote_position && Characters.CHAR_backslash.eql(Strings.sublisp_char(n_literal, number_utilities.f_1_(close_quote_position))); close_quote_position = Sequences.position((SubLObject)Characters.CHAR_quotation, n_literal, Symbols.symbol_function((SubLObject)rdf_n_triples_parser.EQL), Symbols.symbol_function((SubLObject)rdf_n_triples_parser.IDENTITY), number_utilities.f_1X(close_quote_position), (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {}
        if (rdf_n_triples_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rdf_n_triples_parser.NIL == close_quote_position) {
            Errors.error((SubLObject)rdf_n_triples_parser.$str10$No_close_quote_in__A, n_literal);
        }
        final SubLObject lexical_form = n_triple_string_to_utf8_string(string_utilities.substring(n_literal, (SubLObject)rdf_n_triples_parser.ONE_INTEGER, close_quote_position));
        SubLObject language_tag = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject datatype = (SubLObject)rdf_n_triples_parser.NIL;
        if (rdf_n_triples_parser.NIL == list_utilities.lengthE(n_literal, number_utilities.f_1X(close_quote_position), (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {
            if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql((SubLObject)Characters.CHAR_at)) {
                language_tag = string_utilities.substring(n_literal, Numbers.add(close_quote_position, (SubLObject)rdf_n_triples_parser.TWO_INTEGER), (SubLObject)rdf_n_triples_parser.UNPROVIDED);
            }
            else if (Strings.sublisp_char(n_literal, number_utilities.f_1X(close_quote_position)).eql((SubLObject)Characters.CHAR_caret)) {
                datatype = resolve_n_uriref(string_utilities.substring(n_literal, Numbers.add(close_quote_position, (SubLObject)rdf_n_triples_parser.THREE_INTEGER), (SubLObject)rdf_n_triples_parser.UNPROVIDED));
            }
            else {
                Errors.error((SubLObject)rdf_n_triples_parser.$str11$Invalid_n_literal___A, n_literal);
            }
        }
        return rdf_literal.new_rdf_literal(lexical_form, language_tag, datatype);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 5344L)
    public static SubLObject n_triple_string_to_utf8_string(final SubLObject string) {
        if (rdf_n_triples_parser.NIL == Sequences.find((SubLObject)Characters.CHAR_backslash, string, (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {
            return string;
        }
        return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(n_triple_string_to_unicode_vector(string), (SubLObject)rdf_n_triples_parser.UNPROVIDED, (SubLObject)rdf_n_triples_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 5560L)
    public static SubLObject n_triple_string_to_unicode_vector(final SubLObject string) {
        SubLObject unicode_points = (SubLObject)rdf_n_triples_parser.NIL;
        for (SubLObject i = (SubLObject)rdf_n_triples_parser.ZERO_INTEGER; rdf_n_triples_parser.NIL != list_utilities.lengthG(string, i, (SubLObject)rdf_n_triples_parser.UNPROVIDED); i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER)) {
            final SubLObject v_char = Strings.sublisp_char(string, i);
            SubLObject this_code_point = Characters.char_code(v_char);
            if (v_char.eql((SubLObject)Characters.CHAR_backslash)) {
                final SubLObject pcase_var = Strings.sublisp_char(string, number_utilities.f_1X(i));
                if (pcase_var.eql((SubLObject)Characters.CHAR_u)) {
                    final SubLObject hex_string = string_utilities.substring(string, Numbers.add(i, (SubLObject)rdf_n_triples_parser.TWO_INTEGER), Numbers.add(i, (SubLObject)rdf_n_triples_parser.SIX_INTEGER));
                    this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.FIVE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_U)) {
                    final SubLObject hex_string = string_utilities.substring(string, Numbers.add(i, (SubLObject)rdf_n_triples_parser.TWO_INTEGER), Numbers.add(i, (SubLObject)rdf_n_triples_parser.TEN_INTEGER));
                    this_code_point = number_utilities.convert_hexadecimal_to_decimal(hex_string);
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.NINE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_t)) {
                    this_code_point = (SubLObject)rdf_n_triples_parser.NINE_INTEGER;
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_n)) {
                    this_code_point = (SubLObject)rdf_n_triples_parser.TEN_INTEGER;
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_r)) {
                    this_code_point = (SubLObject)rdf_n_triples_parser.THIRTEEN_INTEGER;
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_quotation)) {
                    this_code_point = (SubLObject)rdf_n_triples_parser.$int12$34;
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_backslash)) {
                    this_code_point = (SubLObject)rdf_n_triples_parser.$int13$92;
                    i = Numbers.add(i, (SubLObject)rdf_n_triples_parser.ONE_INTEGER);
                }
                else {
                    Errors.error((SubLObject)rdf_n_triples_parser.$str14$Invalid_n_triple_escape_char__S_a, v_char, i);
                }
            }
            unicode_points = (SubLObject)ConsesLow.cons(this_code_point, unicode_points);
        }
        return list_utilities.list2vector(Sequences.nreverse(unicode_points));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 6645L)
    public static SubLObject resolve_n_node_id(final SubLObject n_node_id, final SubLObject v_graph) {
        return rdf_graph.rdf_graph_get_blank_node(v_graph, string_utilities.substring(n_node_id, (SubLObject)rdf_n_triples_parser.TWO_INTEGER, (SubLObject)rdf_n_triples_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-parser.lisp", position = 6772L)
    public static SubLObject test_rdf_n_triples_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_files = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject parsed = (SubLObject)rdf_n_triples_parser.NIL;
        SubLObject failed = (SubLObject)rdf_n_triples_parser.NIL;
        assert rdf_n_triples_parser.NIL != Filesys.directory_p(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue()) : rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue();
        SubLObject directory_list_var = (SubLObject)ConsesLow.list(rdf_parser.$rdfXxml_parser_test_directory$.getGlobalValue());
        SubLObject current_directory_var = (SubLObject)rdf_n_triples_parser.NIL;
        current_directory_var = directory_list_var.first();
        while (rdf_n_triples_parser.NIL != directory_list_var) {
            directory_list_var = directory_list_var.rest();
            assert rdf_n_triples_parser.NIL != Filesys.directory_p(current_directory_var) : current_directory_var;
            SubLObject directory_contents_var = Filesys.directory(current_directory_var, (SubLObject)rdf_n_triples_parser.T);
            final SubLObject progress_message_var = (SubLObject)(rdf_n_triples_parser.NIL.isString() ? Sequences.cconcatenate((SubLObject)rdf_n_triples_parser.NIL, Sequences.cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { rdf_n_triples_parser.$str25$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })) : rdf_n_triples_parser.NIL);
            final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (rdf_n_triples_parser.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)rdf_n_triples_parser.NIL, (SubLObject)rdf_n_triples_parser.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((rdf_n_triples_parser.NIL != progress_message_var) ? progress_message_var : rdf_n_triples_parser.$str26$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)rdf_n_triples_parser.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)rdf_n_triples_parser.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rdf_n_triples_parser.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rdf_n_triples_parser.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = (SubLObject)rdf_n_triples_parser.NIL;
                        file = csome_list_var.first();
                        while (rdf_n_triples_parser.NIL != csome_list_var) {
                            if (rdf_n_triples_parser.NIL != Filesys.directory_p(file)) {
                                directory_list_var = (SubLObject)ConsesLow.cons(file, directory_list_var);
                            }
                            else if (rdf_n_triples_parser.NIL != string_utilities.ends_with(file, (SubLObject)rdf_n_triples_parser.$str27$_nt, (SubLObject)rdf_n_triples_parser.UNPROVIDED)) {
                                test_files = (SubLObject)ConsesLow.cons(file, test_files);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rdf_n_triples_parser.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_n_triples_parser.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
            current_directory_var = directory_list_var.first();
        }
        final SubLObject list_var2 = test_files;
        final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rdf_n_triples_parser.$str28$Running_RDF_parsing_tests___, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rdf_n_triples_parser.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rdf_n_triples_parser.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rdf_n_triples_parser.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rdf_n_triples_parser.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject file2 = (SubLObject)rdf_n_triples_parser.NIL;
                file2 = csome_list_var2.first();
                while (rdf_n_triples_parser.NIL != csome_list_var2) {
                    SubLObject error_message = (SubLObject)rdf_n_triples_parser.NIL;
                    SubLObject v_graph = (SubLObject)rdf_n_triples_parser.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)rdf_n_triples_parser.$sym29$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                v_graph = rdf_graph_from_n_triples_file(file2);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)rdf_n_triples_parser.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (rdf_n_triples_parser.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                        parsed = (SubLObject)ConsesLow.cons(file2, parsed);
                    }
                    else {
                        failed = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(file2, error_message), failed);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rdf_n_triples_parser.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    file2 = csome_list_var2.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rdf_n_triples_parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
        }
        PrintLow.format((SubLObject)rdf_n_triples_parser.T, (SubLObject)rdf_n_triples_parser.$str30$__Failed___S__, failed);
        PrintLow.format((SubLObject)rdf_n_triples_parser.T, (SubLObject)rdf_n_triples_parser.$str31$__Summary___D_Parsed___D_Failed__, Sequences.length(parsed), Sequences.length(failed));
        return Sequences.length(failed);
    }
    
    public static SubLObject declare_rdf_n_triples_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "rdf_graph_from_n_triples_file", "RDF-GRAPH-FROM-N-TRIPLES-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "parse_n_triple_file_line", "PARSE-N-TRIPLE-FILE-LINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "n_triple_comment_p", "N-TRIPLE-COMMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "parse_n_triple", "PARSE-N-TRIPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "tokenize_n_triple", "TOKENIZE-N-TRIPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_subject", "RESOLVE-N-SUBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_predicate", "RESOLVE-N-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_object", "RESOLVE-N-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_uriref", "RESOLVE-N-URIREF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_literal", "RESOLVE-N-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "n_triple_string_to_utf8_string", "N-TRIPLE-STRING-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "n_triple_string_to_unicode_vector", "N-TRIPLE-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "resolve_n_node_id", "RESOLVE-N-NODE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_parser", "test_rdf_n_triples_parser", "TEST-RDF-N-TRIPLES-PARSER", 0, 0, false);
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    public static SubLObject init_rdf_n_triples_parser_file() {
        rdf_n_triples_parser.$n_triple_whitespace_chars$ = SubLFiles.deflexical("*N-TRIPLE-WHITESPACE-CHARS*", (SubLObject)ConsesLow.list(Characters.code_char((SubLObject)rdf_n_triples_parser.$int0$32), Characters.code_char((SubLObject)rdf_n_triples_parser.NINE_INTEGER)));
        rdf_n_triples_parser.$n_triple_eol_chars$ = SubLFiles.deflexical("*N-TRIPLE-EOL-CHARS*", (SubLObject)ConsesLow.list(Characters.code_char((SubLObject)rdf_n_triples_parser.THIRTEEN_INTEGER), Characters.code_char((SubLObject)rdf_n_triples_parser.TEN_INTEGER)));
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    public static SubLObject setup_rdf_n_triples_parser_file() {
        generic_testing.define_test_case_table_int((SubLObject)rdf_n_triples_parser.$sym15$TEST_RDF_N_TRIPLES_PARSER, (SubLObject)ConsesLow.list(new SubLObject[] { rdf_n_triples_parser.$kw16$TEST, rdf_n_triples_parser.NIL, rdf_n_triples_parser.$kw17$OWNER, rdf_n_triples_parser.NIL, rdf_n_triples_parser.$kw18$CLASSES, rdf_n_triples_parser.$list19, rdf_n_triples_parser.$kw20$KB, rdf_n_triples_parser.$kw21$TINY, rdf_n_triples_parser.$kw22$WORKING_, rdf_n_triples_parser.T }), (SubLObject)rdf_n_triples_parser.$list23);
        return (SubLObject)rdf_n_triples_parser.NIL;
    }
    
    public void declareFunctions() {
        declare_rdf_n_triples_parser_file();
    }
    
    public void initializeVariables() {
        init_rdf_n_triples_parser_file();
    }
    
    public void runTopLevelForms() {
        setup_rdf_n_triples_parser_file();
    }
    
    static {
        me = (SubLFile)new rdf_n_triples_parser();
        rdf_n_triples_parser.$n_triple_whitespace_chars$ = null;
        rdf_n_triples_parser.$n_triple_eol_chars$ = null;
        $int0$32 = SubLObjectFactory.makeInteger(32);
        $kw1$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str2$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw3$BETWEEN_TOKENS = SubLObjectFactory.makeKeyword("BETWEEN-TOKENS");
        $kw4$READING_TOKEN = SubLObjectFactory.makeKeyword("READING-TOKEN");
        $str5$Illegal_n_subject___S = SubLObjectFactory.makeString("Illegal n-subject: ~S");
        $str6$Illegal_n_predicate___S = SubLObjectFactory.makeString("Illegal n-predicate: ~S");
        $str7$Illegal_n_object___S = SubLObjectFactory.makeString("Illegal n-object: ~S");
        $str8$_ = SubLObjectFactory.makeString(">");
        $str9$_ = SubLObjectFactory.makeString("<");
        $str10$No_close_quote_in__A = SubLObjectFactory.makeString("No close quote in ~A");
        $str11$Invalid_n_literal___A = SubLObjectFactory.makeString("Invalid n-literal: ~A");
        $int12$34 = SubLObjectFactory.makeInteger(34);
        $int13$92 = SubLObjectFactory.makeInteger(92);
        $str14$Invalid_n_triple_escape_char__S_a = SubLObjectFactory.makeString("Invalid n-triple escape char ~S at ~D");
        $sym15$TEST_RDF_N_TRIPLES_PARSER = SubLObjectFactory.makeSymbol("TEST-RDF-N-TRIPLES-PARSER");
        $kw16$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw17$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw18$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RDF-TEST-CASE-TABLES"));
        $kw20$KB = SubLObjectFactory.makeKeyword("KB");
        $kw21$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw22$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rdf_n_triples_parser.NIL, (SubLObject)rdf_n_triples_parser.ZERO_INTEGER));
        $sym24$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str25$_Directory__ = SubLObjectFactory.makeString(" Directory: ");
        $str26$cdolist = SubLObjectFactory.makeString("cdolist");
        $str27$_nt = SubLObjectFactory.makeString(".nt");
        $str28$Running_RDF_parsing_tests___ = SubLObjectFactory.makeString("Running RDF parsing tests...");
        $sym29$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str30$__Failed___S__ = SubLObjectFactory.makeString("~&Failed: ~S~%");
        $str31$__Summary___D_Parsed___D_Failed__ = SubLObjectFactory.makeString("~&Summary: ~D Parsed. ~D Failed~%");
    }
}

/*

	Total time: 321 ms
	
*/