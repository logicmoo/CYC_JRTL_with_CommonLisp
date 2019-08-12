/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-N-TRIPLES-WRITER
 * source file: /cyc/top/cycl/rdf/rdf-n-triples-writer.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_n_triples_writer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rdf_n_triples_writer();

 public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $n_triples_writer_stream$ = makeSymbol("*N-TRIPLES-WRITER-STREAM*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RDF_TRIPLE_P = makeSymbol("RDF-TRIPLE-P");

    static private final SubLString $str1$Can_t_write_subject__S = makeString("Can't write subject ~S");

    static private final SubLString $str2$Can_t_write_predicate__S = makeString("Can't write predicate ~S");

    static private final SubLString $str3$Can_t_write_object__S = makeString("Can't write object ~S");

    static private final SubLString $str4$__A = makeString("@~A");

    static private final SubLString $str5$__ = makeString("^^");

    static private final SubLString $str6$___A = makeString("_:~A");

    private static final SubLSymbol URI_P = makeSymbol("URI-P");

    static private final SubLString $str8$__A_ = makeString("<~A>");

    private static final SubLSymbol INVALID_N_TRIPLE_CHAR_P = makeSymbol("INVALID-N-TRIPLE-CHAR-P");



    private static final SubLInteger $int$92 = makeInteger(92);

    private static final SubLInteger $int$127 = makeInteger(127);

    static private final SubLString $str14$_t = makeString("\\t");

    static private final SubLString $str15$_n = makeString("\\n");

    static private final SubLString $str16$_r = makeString("\\r");

    static private final SubLString $str17$__ = makeString("\\\"");

    static private final SubLString $str18$__ = makeString("\\\\");

    static private final SubLString $str19$_U_8_1_0__0_A = makeString("\\U~8,1,0,\'0@A");

    static private final SubLString $str20$_u_4_1_0__0_A = makeString("\\u~4,1,0,\'0@A");

    public static final SubLObject write_n_triple_alt(SubLObject v_rdf_triple, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = $n_triples_writer_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_rdf_triple, RDF_TRIPLE_P);
            {
                SubLObject _prev_bind_0 = $n_triples_writer_stream$.currentBinding(thread);
                try {
                    $n_triples_writer_stream$.bind(stream, thread);
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_subject(rdf_triple.rdf_triple_subject(v_rdf_triple));
                    princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_predicate(rdf_triple.rdf_triple_predicate(v_rdf_triple));
                    princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_object(rdf_triple.rdf_triple_object(v_rdf_triple));
                    princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
                    princ(CHAR_period, $n_triples_writer_stream$.getDynamicValue(thread));
                    terpri($n_triples_writer_stream$.getDynamicValue(thread));
                } finally {
                    $n_triples_writer_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return v_rdf_triple;
        }
    }

    public static SubLObject write_n_triple(final SubLObject v_rdf_triple, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = $n_triples_writer_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_triple.rdf_triple_p(v_rdf_triple, UNPROVIDED) : "! rdf_triple.rdf_triple_p(v_rdf_triple, .UNPROVIDED) " + ("rdf_triple.rdf_triple_p(v_rdf_triple, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_p(v_rdf_triple, CommonSymbols.UNPROVIDED) ") + v_rdf_triple;
        final SubLObject _prev_bind_0 = $n_triples_writer_stream$.currentBinding(thread);
        try {
            $n_triples_writer_stream$.bind(stream, thread);
            write_n_subject(rdf_triple.rdf_triple_subject(v_rdf_triple));
            princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
            write_n_predicate(rdf_triple.rdf_triple_predicate(v_rdf_triple));
            princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
            write_n_object(rdf_triple.rdf_triple_object(v_rdf_triple));
            princ(CHAR_space, $n_triples_writer_stream$.getDynamicValue(thread));
            princ(CHAR_period, $n_triples_writer_stream$.getDynamicValue(thread));
            terpri($n_triples_writer_stream$.getDynamicValue(thread));
        } finally {
            $n_triples_writer_stream$.rebind(_prev_bind_0, thread);
        }
        return v_rdf_triple;
    }

    public static final SubLObject write_n_subject_alt(SubLObject subject) {
        if (NIL != rdf_uri.rdf_uri_p(subject)) {
            com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(rdf_uri.rdf_uri_utf8_string(subject));
        } else {
            if (NIL != web_utilities.uri_p(subject, UNPROVIDED)) {
                com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(subject);
            } else {
                if (NIL != rdf_blank_node.rdf_blank_node_p(subject)) {
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_blank_node(subject);
                } else {
                    Errors.error($str_alt1$Can_t_write_subject__S, subject);
                }
            }
        }
        return subject;
    }

    public static SubLObject write_n_subject(final SubLObject subject) {
        if (NIL != rdf_uri.rdf_uri_p(subject)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(subject));
        } else
            if (NIL != web_utilities.uri_p(subject, UNPROVIDED)) {
                write_n_uri(subject);
            } else
                if (NIL != rdf_blank_node.rdf_blank_node_p(subject)) {
                    write_n_blank_node(subject);
                } else {
                    Errors.error($str1$Can_t_write_subject__S, subject);
                }


        return subject;
    }

    public static final SubLObject write_n_predicate_alt(SubLObject predicate) {
        if (NIL != rdf_uri.rdf_uri_p(predicate)) {
            com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(rdf_uri.rdf_uri_utf8_string(predicate));
        } else {
            if (NIL != web_utilities.uri_p(predicate, UNPROVIDED)) {
                com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(predicate);
            } else {
                Errors.error($str_alt2$Can_t_write_predicate__S, predicate);
            }
        }
        return predicate;
    }

    public static SubLObject write_n_predicate(final SubLObject predicate) {
        if (NIL != rdf_uri.rdf_uri_p(predicate)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(predicate));
        } else
            if (NIL != web_utilities.uri_p(predicate, UNPROVIDED)) {
                write_n_uri(predicate);
            } else {
                Errors.error($str2$Can_t_write_predicate__S, predicate);
            }

        return predicate;
    }

    public static final SubLObject write_n_object_alt(SubLObject v_object) {
        if (NIL != rdf_uri.rdf_uri_p(v_object)) {
            com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(rdf_uri.rdf_uri_utf8_string(v_object));
        } else {
            if (NIL != rdf_blank_node.rdf_blank_node_p(v_object)) {
                com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_blank_node(v_object);
            } else {
                if (NIL != web_utilities.uri_p(v_object, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(v_object);
                } else {
                    if (NIL != rdf_literal.rdf_literal_p(v_object)) {
                        com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_literal(v_object);
                    } else {
                        Errors.error($str_alt3$Can_t_write_object__S, v_object);
                    }
                }
            }
        }
        return v_object;
    }

    public static SubLObject write_n_object(final SubLObject v_object) {
        if (NIL != rdf_uri.rdf_uri_p(v_object)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(v_object));
        } else
            if (NIL != rdf_blank_node.rdf_blank_node_p(v_object)) {
                write_n_blank_node(v_object);
            } else
                if (NIL != web_utilities.uri_p(v_object, UNPROVIDED)) {
                    write_n_uri(v_object);
                } else
                    if (NIL != rdf_literal.rdf_literal_p(v_object)) {
                        write_n_literal(v_object);
                    } else {
                        Errors.error($str3$Can_t_write_object__S, v_object);
                    }



        return v_object;
    }

    public static final SubLObject write_n_literal_alt(SubLObject literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            princ(CHAR_quotation, $n_triples_writer_stream$.getDynamicValue(thread));
            princ(com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.n_triple_string_from_utf8_string(rdf_literal.rdf_literal_utf8_lexical_form(literal)), $n_triples_writer_stream$.getDynamicValue(thread));
            princ(CHAR_quotation, $n_triples_writer_stream$.getDynamicValue(thread));
            if (NIL != rdf_literal.rdf_literal_language_tag(literal)) {
                format($n_triples_writer_stream$.getDynamicValue(thread), $str_alt4$__A, rdf_literal.rdf_literal_language_tag(literal));
            } else {
                if (NIL != rdf_literal.rdf_literal_datatype(literal)) {
                    princ($str_alt5$__, $n_triples_writer_stream$.getDynamicValue(thread));
                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.write_n_uri(rdf_uri.rdf_uri_utf8_string(rdf_literal.rdf_literal_datatype(literal)));
                }
            }
            return literal;
        }
    }

    public static SubLObject write_n_literal(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        princ(CHAR_quotation, $n_triples_writer_stream$.getDynamicValue(thread));
        princ(n_triple_string_from_utf8_string(rdf_literal.rdf_literal_utf8_lexical_form(literal)), $n_triples_writer_stream$.getDynamicValue(thread));
        princ(CHAR_quotation, $n_triples_writer_stream$.getDynamicValue(thread));
        if (NIL != rdf_literal.rdf_literal_language_tag(literal)) {
            format($n_triples_writer_stream$.getDynamicValue(thread), $str4$__A, rdf_literal.rdf_literal_language_tag(literal));
        } else
            if (NIL != rdf_literal.rdf_literal_datatype(literal)) {
                princ($str5$__, $n_triples_writer_stream$.getDynamicValue(thread));
                write_n_uri(rdf_uri.rdf_uri_utf8_string(rdf_literal.rdf_literal_datatype(literal)));
            }

        return literal;
    }

    public static final SubLObject write_n_blank_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format($n_triples_writer_stream$.getDynamicValue(thread), $str_alt6$___A, rdf_blank_node.rdf_blank_node_id_string(node));
            return node;
        }
    }

    public static SubLObject write_n_blank_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format($n_triples_writer_stream$.getDynamicValue(thread), $str6$___A, rdf_blank_node.rdf_blank_node_id_string(node));
        return node;
    }

    public static final SubLObject write_n_uri_alt(SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(uri, URI_P);
            format($n_triples_writer_stream$.getDynamicValue(thread), $str_alt8$__A_, com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.n_triple_string_from_utf8_string(uri));
            return uri;
        }
    }

    public static SubLObject write_n_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != web_utilities.uri_p(uri, UNPROVIDED) : "! web_utilities.uri_p(uri, .UNPROVIDED) " + ("web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != web_utilities.uri_p(uri, CommonSymbols.UNPROVIDED) ") + uri;
        format($n_triples_writer_stream$.getDynamicValue(thread), $str8$__A_, n_triple_string_from_utf8_string(uri));
        return uri;
    }

    public static final SubLObject n_triple_string_from_utf8_string_alt(SubLObject string) {
        if (NIL == find_if(INVALID_N_TRIPLE_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string;
        }
        return com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.n_triple_string_from_unicode_vector(unicode_strings.utf8_vector_to_unicode_vector(unicode_strings.utf8_string_to_utf8_vector(string)));
    }

    public static SubLObject n_triple_string_from_utf8_string(final SubLObject string) {
        if (NIL == find_if(INVALID_N_TRIPLE_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string;
        }
        return n_triple_string_from_unicode_vector(unicode_strings.utf8_vector_to_unicode_vector(unicode_strings.utf8_string_to_utf8_vector(string)));
    }

    public static final SubLObject invalid_n_triple_char_p_alt(SubLObject v_char) {
        return com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.invalid_n_triple_char_code_p(char_code(v_char));
    }

    public static SubLObject invalid_n_triple_char_p(final SubLObject v_char) {
        return invalid_n_triple_char_code_p(char_code(v_char));
    }

    public static final SubLObject invalid_n_triple_char_code_p_alt(SubLObject code) {
        return makeBoolean(((code.numL($int$32) || code.eql($int$34)) || code.eql($int$92)) || code.numGE($int$127));
    }

    public static SubLObject invalid_n_triple_char_code_p(final SubLObject code) {
        return makeBoolean(((code.numL($int$32) || code.eql($int$34)) || code.eql($int$92)) || code.numGE($int$127));
    }

    public static final SubLObject n_triple_string_from_unicode_vector_alt(SubLObject vector) {
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject vector_var = vector;
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject code_point = aref(vector_var, element_num);
                            com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.output_n_triple_char_code(code_point, stream);
                        }
                    }
                }
                string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return string;
        }
    }

    public static SubLObject n_triple_string_from_unicode_vector(final SubLObject vector) {
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code_point;
            for (length = length(vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                code_point = aref(vector, element_num);
                output_n_triple_char_code(code_point, stream);
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    public static final SubLObject output_n_triple_char_code_alt(SubLObject code_point, SubLObject stream) {
        {
            SubLObject pcase_var = code_point;
            if (pcase_var.eql(NINE_INTEGER)) {
                princ($str_alt14$_t, stream);
            } else {
                if (pcase_var.eql(TEN_INTEGER)) {
                    princ($str_alt15$_n, stream);
                } else {
                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                        princ($str_alt16$_r, stream);
                    } else {
                        if (pcase_var.eql($int$34)) {
                            princ($str_alt17$__, stream);
                        } else {
                            if (pcase_var.eql($int$92)) {
                                princ($str_alt18$__, stream);
                            } else {
                                if (code_point.numL($int$32)) {
                                    com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.output_n_triple_unicode_escape(code_point, stream);
                                } else {
                                    if (code_point.numL($int$127)) {
                                        princ(code_char(code_point), stream);
                                    } else {
                                        com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer.output_n_triple_unicode_escape(code_point, stream);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject output_n_triple_char_code(final SubLObject code_point, final SubLObject stream) {
        if (code_point.eql(NINE_INTEGER)) {
            princ($str14$_t, stream);
        } else
            if (code_point.eql(TEN_INTEGER)) {
                princ($str15$_n, stream);
            } else
                if (code_point.eql(THIRTEEN_INTEGER)) {
                    princ($str16$_r, stream);
                } else
                    if (code_point.eql($int$34)) {
                        princ($str17$__, stream);
                    } else
                        if (code_point.eql($int$92)) {
                            princ($str18$__, stream);
                        } else
                            if (code_point.numL($int$32)) {
                                output_n_triple_unicode_escape(code_point, stream);
                            } else
                                if (code_point.numL($int$127)) {
                                    princ(code_char(code_point), stream);
                                } else {
                                    output_n_triple_unicode_escape(code_point, stream);
                                }






        return NIL;
    }

    public static final SubLObject output_n_triple_unicode_escape_alt(SubLObject code_point, SubLObject stream) {
        {
            SubLObject hex_string = number_utilities.convert_to_hexadecimal(code_point);
            if (NIL != list_utilities.lengthG(hex_string, FOUR_INTEGER, UNPROVIDED)) {
                format(stream, $str_alt19$_U_8_1_0__0_A, hex_string);
            } else {
                format(stream, $str_alt20$_u_4_1_0__0_A, hex_string);
            }
        }
        return NIL;
    }

    public static SubLObject output_n_triple_unicode_escape(final SubLObject code_point, final SubLObject stream) {
        final SubLObject hex_string = number_utilities.convert_to_hexadecimal(code_point);
        if (NIL != list_utilities.lengthG(hex_string, FOUR_INTEGER, UNPROVIDED)) {
            format(stream, $str19$_U_8_1_0__0_A, hex_string);
        } else {
            format(stream, $str20$_u_4_1_0__0_A, hex_string);
        }
        return NIL;
    }

    public static SubLObject declare_rdf_n_triples_writer_file() {
        declareFunction("write_n_triple", "WRITE-N-TRIPLE", 1, 1, false);
        declareFunction("write_n_subject", "WRITE-N-SUBJECT", 1, 0, false);
        declareFunction("write_n_predicate", "WRITE-N-PREDICATE", 1, 0, false);
        declareFunction("write_n_object", "WRITE-N-OBJECT", 1, 0, false);
        declareFunction("write_n_literal", "WRITE-N-LITERAL", 1, 0, false);
        declareFunction("write_n_blank_node", "WRITE-N-BLANK-NODE", 1, 0, false);
        declareFunction("write_n_uri", "WRITE-N-URI", 1, 0, false);
        declareFunction("n_triple_string_from_utf8_string", "N-TRIPLE-STRING-FROM-UTF8-STRING", 1, 0, false);
        declareFunction("invalid_n_triple_char_p", "INVALID-N-TRIPLE-CHAR-P", 1, 0, false);
        declareFunction("invalid_n_triple_char_code_p", "INVALID-N-TRIPLE-CHAR-CODE-P", 1, 0, false);
        declareFunction("n_triple_string_from_unicode_vector", "N-TRIPLE-STRING-FROM-UNICODE-VECTOR", 1, 0, false);
        declareFunction("output_n_triple_char_code", "OUTPUT-N-TRIPLE-CHAR-CODE", 2, 0, false);
        declareFunction("output_n_triple_unicode_escape", "OUTPUT-N-TRIPLE-UNICODE-ESCAPE", 2, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt1$Can_t_write_subject__S = makeString("Can't write subject ~S");

    static private final SubLString $str_alt2$Can_t_write_predicate__S = makeString("Can't write predicate ~S");

    static private final SubLString $str_alt3$Can_t_write_object__S = makeString("Can't write object ~S");

    static private final SubLString $str_alt4$__A = makeString("@~A");

    static private final SubLString $str_alt5$__ = makeString("^^");

    static private final SubLString $str_alt6$___A = makeString("_:~A");

    public static SubLObject init_rdf_n_triples_writer_file() {
        defparameter("*N-TRIPLES-WRITER-STREAM*", StreamsLow.$standard_output$.getDynamicValue());
        return NIL;
    }

    static private final SubLString $str_alt8$__A_ = makeString("<~A>");

    public static SubLObject setup_rdf_n_triples_writer_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_n_triples_writer_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_n_triples_writer_file();
    }

    static private final SubLString $str_alt14$_t = makeString("\\t");

    @Override
    public void runTopLevelForms() {
        setup_rdf_n_triples_writer_file();
    }

    static private final SubLString $str_alt15$_n = makeString("\\n");

    static {
    }

    static private final SubLString $str_alt16$_r = makeString("\\r");

    static private final SubLString $str_alt17$__ = makeString("\\\"");

    static private final SubLString $str_alt18$__ = makeString("\\\\");

    static private final SubLString $str_alt19$_U_8_1_0__0_A = makeString("\\U~8,1,0,\'0@A");

    static private final SubLString $str_alt20$_u_4_1_0__0_A = makeString("\\u~4,1,0,\'0@A");
}

/**
 * Total time: 158 ms
 */
