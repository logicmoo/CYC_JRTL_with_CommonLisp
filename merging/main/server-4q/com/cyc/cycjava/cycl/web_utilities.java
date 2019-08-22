/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.system_info.cyc_revision_string;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.print_2_digit_nonnegative_integer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nsubstitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ldiff;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.clear_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_broadcast_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.peek_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_sequence;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
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
 * module:      WEB-UTILITIES
 * source file: /cyc/top/cycl/web-utilities.lisp
 * created:     2019/07/03 17:37:17
 */
public final class web_utilities extends SubLTranslatedFile implements V12 {
    /**
     * Converts a list of XML tokens into an s-expression representing
     * the same structure.  For example, this XML:
     * <html>
     * <body bgcolor=3>
     * Here is some text<br/>
     * </body>
     * </html>
     * will be returned as this s-expression:
     * (("html")
     * (("body" ("bgcolor" . "3"))
     * "Here is some text" (("br"))))
     *
     * @param TOKENS
     * 		listp; a list of stringp parsed with XML-TOKENIZE.
     * @return listp or stringp; an s-expression corresponding to the XML structure.
     * @return listp; the remainder of the list that hasn't been processed
     */
    @LispMethod(comment = "Converts a list of XML tokens into an s-expression representing\r\nthe same structure.  For example, this XML:\r\n<html>\r\n<body bgcolor=3>\r\nHere is some text<br/>\r\n</body>\r\n</html>\r\nwill be returned as this s-expression:\r\n((\"html\")\r\n((\"body\" (\"bgcolor\" . \"3\"))\r\n\"Here is some text\" ((\"br\"))))\r\n\r\n@param TOKENS\r\n\t\tlistp; a list of stringp parsed with XML-TOKENIZE.\r\n@return listp or stringp; an s-expression corresponding to the XML structure.\r\n@return listp; the remainder of the list that hasn\'t been processed\nConverts a list of XML tokens into an s-expression representing\nthe same structure.  For example, this XML:\n<html>\n<body bgcolor=3>\nHere is some text<br/>\n</body>\n</html>\nwill be returned as this s-expression:\n((\"html\")\n((\"body\" (\"bgcolor\" . \"3\"))\n\"Here is some text\" ((\"br\"))))")
    public static final SubLObject xml_tokens_to_sexpr(SubLObject tokens) {
        {
            SubLObject iterator = iteration.new_list_iterator(tokens);
            SubLObject sexpr = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_to_sexpr(iterator, UNPROVIDED);
            SubLObject remaining = NIL;
            while (NIL == iteration.iteration_done(iterator)) {
                remaining = cons(iteration.iteration_next(iterator), remaining);
            } 
            iteration.iteration_finalize(iterator);
            return values(sexpr, nreverse(remaining));
        }
    }

    /**
     * Return the initial sublist of the list TOKENS representing the first element represented in TOKENS.
     */
    @LispMethod(comment = "Return the initial sublist of the list TOKENS representing the first element represented in TOKENS.")
    public static final SubLObject xml_tokens_for_next_element(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $xml_token_accumulator$.currentBinding(thread);
                    try {
                        $xml_token_accumulator$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to_end_of_element(tokens);
                        ans = com.cyc.cycjava.cycl.web_utilities.accumulated_xml_tokens();
                    } finally {
                        $xml_token_accumulator$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return 0 list of stringp ; tokenized form of http result stream.
     * @return 1 boolean ; whether or not the http connection timed out.
     */
    @LispMethod(comment = "@return 0 list of stringp ; tokenized form of http result stream.\r\n@return 1 boolean ; whether or not the http connection timed out.")
    public static final SubLObject xml_tokenized_http_request_internal(SubLObject machine, SubLObject url, SubLObject query, SubLObject method, SubLObject port, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject timeout, SubLObject accept_types) {
        {
            SubLObject timed_out = T;
            SubLObject tokens = NIL;
            SubLObject real_port = (port.eql($DEFAULT)) ? ((SubLObject) ($int$80)) : port;
            SubLObject channel = NIL;
            try {
                channel = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, timeout, $PRIVATE);
                if (NIL != channel) {
                    com.cyc.cycjava.cycl.web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types }));
                    timed_out = NIL;
                    tokens = com.cyc.cycjava.cycl.web_utilities.xml_tokenize(channel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != channel) {
                            close(channel, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return values(tokens, timed_out);
        }
    }

    /**
     * Establish an HTTP request to PORT of MACHINE.
     * PORT defaults to TCP port 80, the default HTTP port.
     * The request METHOD defaults to :GET, and must be either :GET or :POST.
     * URL is a string representing the URL of the request.
     * QUERY, if present, is a string representing the query portion of the request.
     * KEEP-ALIVE? regulates whether this is a one-shot connection or not.
     * WIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline.
     * OPEN-CONNECTION-TIMEOUT, if non-nil, is a numeric connection timeout in seconds.
     * OVERALL-TIMEOUT, if non-nil, is a numeric overall request timeout in seconds.
     * REDIRECT? regulates whether to automatically redirect if a 3xx code is sent.
     * ACCEPT-TYPES; :DEFAULT or listp of MIME-type strings.
     *
     * @return 0 list of stringp ; tokenized form of resulting XML stream.
     * @return 1 one of -- NIL :OVERALL :OPEN-CONNECTION :ERROR ; timeout reason, if any.
     * @return 2 nil or stringp -- the error-message, if any.
     */
    @LispMethod(comment = "Establish an HTTP request to PORT of MACHINE.\r\nPORT defaults to TCP port 80, the default HTTP port.\r\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\r\nURL is a string representing the URL of the request.\r\nQUERY, if present, is a string representing the query portion of the request.\r\nKEEP-ALIVE? regulates whether this is a one-shot connection or not.\r\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline.\r\nOPEN-CONNECTION-TIMEOUT, if non-nil, is a numeric connection timeout in seconds.\r\nOVERALL-TIMEOUT, if non-nil, is a numeric overall request timeout in seconds.\r\nREDIRECT? regulates whether to automatically redirect if a 3xx code is sent.\r\nACCEPT-TYPES; :DEFAULT or listp of MIME-type strings.\r\n\r\n@return 0 list of stringp ; tokenized form of resulting XML stream.\r\n@return 1 one of -- NIL :OVERALL :OPEN-CONNECTION :ERROR ; timeout reason, if any.\r\n@return 2 nil or stringp -- the error-message, if any.\nEstablish an HTTP request to PORT of MACHINE.\nPORT defaults to TCP port 80, the default HTTP port.\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\nURL is a string representing the URL of the request.\nQUERY, if present, is a string representing the query portion of the request.\nKEEP-ALIVE? regulates whether this is a one-shot connection or not.\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline.\nOPEN-CONNECTION-TIMEOUT, if non-nil, is a numeric connection timeout in seconds.\nOVERALL-TIMEOUT, if non-nil, is a numeric overall request timeout in seconds.\nREDIRECT? regulates whether to automatically redirect if a 3xx code is sent.\nACCEPT-TYPES; :DEFAULT or listp of MIME-type strings.")
    public static final SubLObject xml_tokenized_http_request(SubLObject machine, SubLObject url, SubLObject query, SubLObject method, SubLObject port, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject open_connection_timeout, SubLObject overall_timeout, SubLObject redirectP, SubLObject accept_types) {
        if (query == UNPROVIDED) {
            query = NIL;
        }
        if (method == UNPROVIDED) {
            method = $GET;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        if (wide_newlinesP == UNPROVIDED) {
            wide_newlinesP = T;
        }
        if (open_connection_timeout == UNPROVIDED) {
            open_connection_timeout = NIL;
        }
        if (overall_timeout == UNPROVIDED) {
            overall_timeout = NIL;
        }
        if (redirectP == UNPROVIDED) {
            redirectP = T;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error_message = NIL;
                SubLObject connection_timed_out = NIL;
                SubLObject overall_timed_out = NIL;
                SubLObject make_request = T;
                SubLObject tokens = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL != overall_timeout) {
                                    {
                                        SubLObject timeout_reason = NIL;
                                        SubLObject tag = with_timeout_make_tag();
                                        try {
                                            {
                                                SubLObject _prev_bind_0_13 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    {
                                                        SubLObject timer = NIL;
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_14 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                try {
                                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                    timer = with_timeout_start_timer(overall_timeout, tag);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject tokens_15 = com.cyc.cycjava.cycl.web_utilities.xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, NIL, redirectP, accept_types);
                                                                        SubLObject timeout_reason_16 = thread.secondMultipleValue();
                                                                        SubLObject error_message_17 = thread.thirdMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        tokens = tokens_15;
                                                                        timeout_reason = timeout_reason_16;
                                                                        error_message = error_message_17;
                                                                    }
                                                                } finally {
                                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_14, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    with_timeout_stop_timer(timer);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            overall_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                        }
                                        {
                                            SubLObject pcase_var = timeout_reason;
                                            if (pcase_var.eql($OPEN_CONNECTION)) {
                                                connection_timed_out = T;
                                            }
                                        }
                                    }
                                } else {
                                    while (NIL != make_request) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject tokens_19 = com.cyc.cycjava.cycl.web_utilities.xml_tokenized_http_request_internal(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, accept_types);
                                            SubLObject connection_timed_out_20 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            tokens = tokens_19;
                                            connection_timed_out = connection_timed_out_20;
                                        }
                                        if (NIL != redirectP) {
                                            {
                                                SubLObject header = tokens.first();
                                                if (NIL != com.cyc.cycjava.cycl.web_utilities.html_redirection_header_p(header)) {
                                                    {
                                                        SubLObject redirection_url = com.cyc.cycjava.cycl.web_utilities.html_redirection_url(header);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject machine_21 = com.cyc.cycjava.cycl.web_utilities.parse_http_url(redirection_url);
                                                            SubLObject port_22 = thread.secondMultipleValue();
                                                            SubLObject url_23 = thread.thirdMultipleValue();
                                                            SubLObject query_24 = thread.fourthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            machine = machine_21;
                                                            port = port_22;
                                                            url = url_23;
                                                            query = query_24;
                                                        }
                                                    }
                                                } else {
                                                    make_request = NIL;
                                                }
                                            }
                                        } else {
                                            make_request = NIL;
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
                    return values(tokens, $ERROR, error_message);
                } else {
                    if (NIL != connection_timed_out) {
                        return values(tokens, $OPEN_CONNECTION, NIL);
                    } else {
                        if (NIL != overall_timed_out) {
                            return values(tokens, $OVERALL, NIL);
                        } else {
                            return values(tokens, NIL, NIL);
                        }
                    }
                }
            }
        }
    }

    /**
     * Tokenize IN-STREAM into a list of strings.
     * Each string in the list is either an XML token or inter-token text.
     *
     * @param VALIDATE?
     * 		booleanp; If non-NIL, throw an error if invalid XML is detected.
     * @unknown validation is *not* exhaustive: DTDs are not checked, and in general only
    basic syntax errors are detected.
     * @param RESOLVE-ENTITY-REFERENCES?
     * 		booleanp; If non-NIL, replace &foo; entity references
     * 		with their values declared via ENTITY in the doctype tag.
     */
    @LispMethod(comment = "Tokenize IN-STREAM into a list of strings.\r\nEach string in the list is either an XML token or inter-token text.\r\n\r\n@param VALIDATE?\r\n\t\tbooleanp; If non-NIL, throw an error if invalid XML is detected.\r\n@unknown validation is *not* exhaustive: DTDs are not checked, and in general only\r\nbasic syntax errors are detected.\r\n@param RESOLVE-ENTITY-REFERENCES?\r\n\t\tbooleanp; If non-NIL, replace &foo; entity references\r\n\t\twith their values declared via ENTITY in the doctype tag.\nTokenize IN-STREAM into a list of strings.\nEach string in the list is either an XML token or inter-token text.")
    public static final SubLObject xml_tokenize(SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        {
            SubLObject iterator = com.cyc.cycjava.cycl.web_utilities.new_xml_token_iterator(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
            SubLObject tokens = NIL;
            while (NIL == iteration.iteration_done(iterator)) {
                tokens = cons(iteration.iteration_next(iterator), tokens);
            } 
            return nreverse(tokens);
        }
    }

    /**
     * Return T iff the string TOKEN starts with START-STRING (case insensitively)
     */
    @LispMethod(comment = "Return T iff the string TOKEN starts with START-STRING (case insensitively)")
    public static final SubLObject xml_token_starts_with(SubLObject token, SubLObject start_string) {
        return eql(ZERO_INTEGER, search(start_string, token, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return T iff the string TOKEN mentions MENTION-STRING anywhere (case insensitively)
     */
    @LispMethod(comment = "Return T iff the string TOKEN mentions MENTION-STRING anywhere (case insensitively)")
    public static final SubLObject xml_token_mentions(SubLObject token, SubLObject mention_string) {
        return list_utilities.sublisp_boolean(search(mention_string, token, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return T iff the string TOKEN exactly matches MATCH-STRING
     */
    @LispMethod(comment = "Return T iff the string TOKEN exactly matches MATCH-STRING")
    public static final SubLObject xml_token_matches_exactly(SubLObject token, SubLObject match_string) {
        return Strings.stringE(token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff the string TOKEN exactly matches MATCH-STRING (case insensitively)
     */
    @LispMethod(comment = "Return T iff the string TOKEN exactly matches MATCH-STRING (case insensitively)")
    public static final SubLObject xml_token_matches(SubLObject token, SubLObject match_string) {
        return Strings.string_equal(token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xml_token_iterator_to_sexpr_internal(SubLObject token_iterator, SubLObject first_token) {
        if (NIL != com.cyc.cycjava.cycl.web_utilities.non_content_xml_token_p(first_token)) {
            return com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
        }
        {
            SubLObject head = com.cyc.cycjava.cycl.web_utilities.parse_xml_token(first_token);
            SubLObject sexpr = list(head);
            SubLObject next_token = (NIL != iteration.iteration_done(token_iterator)) ? ((SubLObject) (NIL)) : iteration.iteration_next(token_iterator);
            while (NIL != com.cyc.cycjava.cycl.web_utilities.non_content_xml_token_p(next_token)) {
                next_token = (NIL != iteration.iteration_done(token_iterator)) ? ((SubLObject) (NIL)) : iteration.iteration_next(token_iterator);
            } 
            while (NIL == iteration.iteration_done(token_iterator)) {
                if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_closing_tokenP(head.first(), next_token)) {
                    return reverse(sexpr);
                }
                {
                    SubLObject subexpr = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_to_sexpr(token_iterator, next_token);
                    if (subexpr.isString()) {
                        if (sexpr.first().isString()) {
                            {
                                SubLObject old_value = sexpr.first();
                                SubLObject new_value = cconcatenate(old_value, subexpr);
                                sexpr = sexpr.rest();
                                sexpr = cons(new_value, sexpr);
                            }
                        } else {
                            if (!$str_alt69$.equal(string_utilities.trim_whitespace(subexpr))) {
                                sexpr = cons(subexpr, sexpr);
                            }
                        }
                    } else {
                        sexpr = cons(subexpr, sexpr);
                    }
                }
                next_token = (NIL != iteration.iteration_done(token_iterator)) ? ((SubLObject) (NIL)) : iteration.iteration_next(token_iterator);
            } 
            return reverse(sexpr);
        }
    }

    /**
     * Converts a series of XML tokens from TOKEN-ITERATOR into an s-expression representing
     * the same structure.  For example, this XML:
     * <html>
     * <body bgcolor=3>
     * Here is some text<br/>
     * </body>
     * </html>
     * will be returned as this s-expression:
     * (("html")
     * (("body" ("bgcolor" . "3"))
     * "Here is some text" (("br"))))
     *
     * @param TOKEN-ITERATOR
     * 		ITERATOR-P; an iterator over XML token strings.
     * @return listp or stringp; an s-expression corresponding to the XML structure.
     * @unknown TOKEN-ITERATOR may have tokens left that have not been processed
     */
    @LispMethod(comment = "Converts a series of XML tokens from TOKEN-ITERATOR into an s-expression representing\r\nthe same structure.  For example, this XML:\r\n<html>\r\n<body bgcolor=3>\r\nHere is some text<br/>\r\n</body>\r\n</html>\r\nwill be returned as this s-expression:\r\n((\"html\")\r\n((\"body\" (\"bgcolor\" . \"3\"))\r\n\"Here is some text\" ((\"br\"))))\r\n\r\n@param TOKEN-ITERATOR\r\n\t\tITERATOR-P; an iterator over XML token strings.\r\n@return listp or stringp; an s-expression corresponding to the XML structure.\r\n@unknown TOKEN-ITERATOR may have tokens left that have not been processed\nConverts a series of XML tokens from TOKEN-ITERATOR into an s-expression representing\nthe same structure.  For example, this XML:\n<html>\n<body bgcolor=3>\nHere is some text<br/>\n</body>\n</html>\nwill be returned as this s-expression:\n((\"html\")\n((\"body\" (\"bgcolor\" . \"3\"))\n\"Here is some text\" ((\"br\"))))")
    public static final SubLObject xml_token_iterator_to_sexpr(SubLObject token_iterator, SubLObject first_token) {
        if (first_token == UNPROVIDED) {
            first_token = NIL;
        }
        {
            SubLObject iteration_doneP = iteration.iteration_done(token_iterator);
            if (!((NIL != first_token) || (NIL != iteration_doneP))) {
                first_token = iteration.iteration_next(token_iterator);
            }
            if (NIL != iteration_doneP) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(first_token)) {
                    return list(com.cyc.cycjava.cycl.web_utilities.parse_xml_token(first_token));
                } else {
                    if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_cdata_tagP(first_token)) {
                        return com.cyc.cycjava.cycl.web_utilities.xml_cdata_tag_text(first_token);
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.web_utilities.xml_tagP(first_token)) {
                            return first_token;
                        } else {
                            return com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_to_sexpr_internal(token_iterator, first_token);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject xml_token_iterator_state_validateP(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_validateP(state);
    }

    public static final SubLObject xml_token_iterator_state_token_output_stream(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_token_output_stream(state);
    }

    public static final SubLObject xml_token_iterator_state_scratch_stream(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_scratch_stream(state);
    }

    public static final SubLObject xml_token_iterator_state_resolve_namespacesP(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_resolve_namespacesP(state);
    }

    public static final SubLObject xml_token_iterator_state_resolve_entity_referencesP(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_resolve_entity_referencesP(state);
    }

    public static final SubLObject xml_token_iterator_state_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.web_utilities.print_xml_token_iterator_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject xml_token_iterator_state_peek(SubLObject state) {
        com.cyc.cycjava.cycl.web_utilities.ensure_xml_token_on_deck_queue_populated(state);
        return NIL != com.cyc.cycjava.cycl.web_utilities.iterate_xml_token_done(state) ? ((SubLObject) (NIL)) : queues.queue_peek(com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_on_deck_queue(state));
    }

    public static final SubLObject xml_token_iterator_state_p(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject xml_token_iterator_state_on_deck_queue(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_on_deck_queue(state);
    }

    public static final SubLObject xml_token_iterator_state_namespace_stack(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_namespace_stack(state);
    }

    public static final SubLObject xml_token_iterator_state_in_stream(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_in_stream(state);
    }

    public static final SubLObject xml_token_iterator_state_entity_map(SubLObject state) {
        SubLTrampolineFile.checkType(state, XML_TOKEN_ITERATOR_STATE_P);
        return com.cyc.cycjava.cycl.web_utilities.xml_it_state_entity_map(state);
    }

    public static final SubLObject xml_token_iterator_progress(SubLObject iterator) {
        {
            SubLObject state = iteration.iteration_state_peek(iterator);
            SubLObject in_stream = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_in_stream(state);
            return values(file_position(in_stream, UNPROVIDED), file_length(in_stream));
        }
    }

    public static final SubLObject xml_token_element_name_start_and_end(SubLObject token) {
        {
            SubLObject element_name_start = (CHAR_slash.eql(Strings.sublisp_char(token, ONE_INTEGER))) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
            SubLObject space_pos = position_if(WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject token_length = length(token);
            SubLObject token_end = (NIL != com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(token)) ? ((SubLObject) (subtract(token_length, TWO_INTEGER))) : subtract(token_length, ONE_INTEGER);
            SubLObject element_name_end = (NIL != space_pos) ? ((SubLObject) (space_pos)) : token_end;
            return values(element_name_start, element_name_end);
        }
    }

    public static final SubLObject xml_token_element_nameP(SubLObject token, SubLObject element_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(token, STRINGP);
            if (NIL == com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject element_name_start = com.cyc.cycjava.cycl.web_utilities.xml_token_element_name_start_and_end(token);
                SubLObject element_name_end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL != list_utilities.lengthE(element_name, subtract(element_name_end, element_name_start), UNPROVIDED)) && (NIL != string_utilities.substring_matchP(token, element_name, element_name_start, UNPROVIDED)));
            }
        }
    }

    /**
     *
     *
     * @return STRINGP or NIL; the name of the element of which TOKEN is a part, iff it is an open or close tag,
    or an empty element. Open and close tags have the same name.
     * @unknown (xml-token-element-name "<widget price="$1.99">") => "widget"
     * @unknown (xml-token-element-name "</widget>") => "widget"
     */
    @LispMethod(comment = "@return STRINGP or NIL; the name of the element of which TOKEN is a part, iff it is an open or close tag,\r\nor an empty element. Open and close tags have the same name.\r\n@unknown (xml-token-element-name \"<widget price=\"$1.99\">\") => \"widget\"\r\n@unknown (xml-token-element-name \"</widget>\") => \"widget\"")
    public static final SubLObject xml_token_element_name(SubLObject token) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!token.isString()) {
                    Errors.error($str_alt198$_S_is_not_an_XML_token, token);
                }
            }
            if (NIL == com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject element_name_start = com.cyc.cycjava.cycl.web_utilities.xml_token_element_name_start_and_end(token);
                SubLObject element_name_end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return string_utilities.substring(token, element_name_start, element_name_end);
            }
        }
    }

    public static final SubLObject xml_tag_attribute_value(SubLObject tag, SubLObject attribute, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(tag, $sym164$XML_TAG_);
        SubLTrampolineFile.checkType(attribute, STRINGP);
        {
            SubLObject attributes = com.cyc.cycjava.cycl.web_utilities.parse_xml_token(tag).rest();
            return list_utilities.alist_lookup_without_values(attributes, attribute, symbol_function($sym199$STRING_), v_default);
        }
    }

    /**
     * Returns T iff TOKEN is of the form <.+>.
     *
     * @param TOKEN
    		stringp;
     * 		
     * @return T or NIL;
     */
    @LispMethod(comment = "Returns T iff TOKEN is of the form <.+>.\r\n\r\n@param TOKEN\n\t\tstringp;\r\n\t\t\r\n@return T or NIL;")
    public static final SubLObject xml_tagP(SubLObject token) {
        return makeBoolean(((token.isString() && (NIL != list_utilities.lengthGE(token, THREE_INTEGER, UNPROVIDED))) && CHAR_less.eql(string_utilities.first_char(token))) && CHAR_greater.eql(string_utilities.last_char(token)));
    }

    /**
     * Tokenize an XML string into a list of strings.
     * Each string in the list is either an XML token or inter-token text.
     */
    @LispMethod(comment = "Tokenize an XML string into a list of strings.\r\nEach string in the list is either an XML token or inter-token text.\nTokenize an XML string into a list of strings.\nEach string in the list is either an XML token or inter-token text.")
    public static final SubLObject xml_string_tokenize(SubLObject string, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        {
            SubLObject out_list = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
                out_list = com.cyc.cycjava.cycl.web_utilities.xml_tokenize(stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
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
            return out_list;
        }
    }

    /**
     * returns the type/tag name of SEXPR
     */
    @LispMethod(comment = "returns the type/tag name of SEXPR")
    public static final SubLObject xml_sexpr_type(SubLObject sexpr) {
        return com.cyc.cycjava.cycl.web_utilities.xml_sexpr_tag(sexpr).first();
    }

    /**
     * returns the opening tag of SEXPR
     */
    @LispMethod(comment = "returns the opening tag of SEXPR")
    public static final SubLObject xml_sexpr_tag(SubLObject sexpr) {
        return sexpr.first();
    }

    /**
     * Destructively sets the value for ATTRIBUTE of SEXPR's opening tag to VALUE.
     *
     * @return SEXPR
     */
    @LispMethod(comment = "Destructively sets the value for ATTRIBUTE of SEXPR\'s opening tag to VALUE.\r\n\r\n@return SEXPR")
    public static final SubLObject xml_sexpr_set_attribute(SubLObject sexpr, SubLObject key, SubLObject value) {
        {
            SubLObject attributes = list_utilities.alist_enter(com.cyc.cycjava.cycl.web_utilities.xml_sexpr_attributes(sexpr), key, value, symbol_function($sym199$STRING_));
            rplacd(com.cyc.cycjava.cycl.web_utilities.xml_sexpr_tag(sexpr), attributes);
            return sexpr;
        }
    }

    /**
     * returns all daughters of SEXPR with type TAG
     */
    @LispMethod(comment = "returns all daughters of SEXPR with type TAG")
    public static final SubLObject xml_sexpr_daughters(SubLObject sexpr, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = NIL;
        }
        if (NIL != tag) {
            {
                SubLObject daughters = NIL;
                SubLObject cdolist_list_var = sexpr.rest();
                SubLObject daughter = NIL;
                for (daughter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , daughter = cdolist_list_var.first()) {
                    if (daughter.isList() && (NIL != Strings.stringE(com.cyc.cycjava.cycl.web_utilities.xml_sexpr_type(daughter), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        daughters = cons(daughter, daughters);
                    }
                }
                return nreverse(daughters);
            }
        } else {
            return sexpr.rest();
        }
    }

    /**
     * returns the first daughter of SEXPR with type TAG
     */
    @LispMethod(comment = "returns the first daughter of SEXPR with type TAG")
    public static final SubLObject xml_sexpr_daughter(SubLObject sexpr, SubLObject tag) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.web_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED);
            SubLObject daughter = NIL;
            for (daughter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , daughter = cdolist_list_var.first()) {
                if (NIL != Strings.stringE(com.cyc.cycjava.cycl.web_utilities.xml_sexpr_type(daughter), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return daughter;
                }
            }
        }
        return NIL;
    }

    /**
     * returns the attributes of SEXPR's opening tag
     */
    @LispMethod(comment = "returns the attributes of SEXPR\'s opening tag")
    public static final SubLObject xml_sexpr_attributes(SubLObject sexpr) {
        return com.cyc.cycjava.cycl.web_utilities.xml_sexpr_tag(sexpr).rest();
    }

    /**
     * returns the value for ATTRIBUTE of SEXPR's opening tag
     */
    @LispMethod(comment = "returns the value for ATTRIBUTE of SEXPR\'s opening tag")
    public static final SubLObject xml_sexpr_attribute_value(SubLObject sexpr, SubLObject attribute) {
        return assoc(attribute, com.cyc.cycjava.cycl.web_utilities.xml_sexpr_attributes(sexpr), $sym199$STRING_, UNPROVIDED).rest();
    }

    public static final SubLObject xml_sexpr_atomic_p(SubLObject sexpr) {
        return list_utilities.empty_list_p(com.cyc.cycjava.cycl.web_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED));
    }

    public static final SubLObject xml_read(SubLObject in_stream, SubLObject scratch_stream, SubLObject token_output_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        if (token_output_stream == UNPROVIDED) {
            token_output_stream = make_private_string_output_stream();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_output(scratch_stream);
            clear_output(token_output_stream);
            thread.resetMultipleValues();
            {
                SubLObject pretext = com.cyc.cycjava.cycl.web_utilities.read_until_char(in_stream, CHAR_less, scratch_stream);
                SubLObject eof = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != eof) {
                    return values(pretext, NIL);
                }
                {
                    SubLObject bracket_alist = $list_alt171;
                    SubLObject brackets = $list_alt172;
                    SubLObject open_bracket_stack = list(CHAR_less);
                    SubLObject abortP = NIL;
                    princ(CHAR_less, token_output_stream);
                    {
                        SubLObject within_commentP = NIL;
                        SubLObject within_cdataP = NIL;
                        while ((NIL != open_bracket_stack) && (NIL == abortP)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject partial_tag_text = com.cyc.cycjava.cycl.web_utilities.read_until_one_of(in_stream, brackets, scratch_stream);
                                SubLObject v_char = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (partial_tag_text.isString()) {
                                    princ(partial_tag_text, token_output_stream);
                                    if (NIL == within_commentP) {
                                        if (NIL != string_utilities.starts_with(partial_tag_text, $str_alt173$___)) {
                                            within_commentP = T;
                                        }
                                    }
                                    if (NIL == within_cdataP) {
                                        if (NIL != string_utilities.starts_with(partial_tag_text, $str_alt174$__CDATA_)) {
                                            within_cdataP = T;
                                        }
                                    }
                                }
                                if (NIL == v_char) {
                                    abortP = T;
                                } else {
                                    if (NIL != within_commentP) {
                                        princ(v_char, token_output_stream);
                                        if ((NIL != string_utilities.ends_with(partial_tag_text, $str_alt175$__, UNPROVIDED)) && v_char.eql(CHAR_greater)) {
                                            open_bracket_stack = open_bracket_stack.rest();
                                        }
                                    } else {
                                        if (NIL != within_cdataP) {
                                            princ(v_char, token_output_stream);
                                            if ((NIL != string_utilities.ends_with(partial_tag_text, $str_alt176$__, UNPROVIDED)) && v_char.eql(CHAR_greater)) {
                                                open_bracket_stack = open_bracket_stack.rest();
                                            }
                                        } else {
                                            if (v_char.eql(list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED))) {
                                                princ(v_char, token_output_stream);
                                                open_bracket_stack = open_bracket_stack.rest();
                                            } else {
                                                if (NIL != list_utilities.alist_lookup_without_values(bracket_alist, v_char, UNPROVIDED, UNPROVIDED)) {
                                                    princ(v_char, token_output_stream);
                                                    open_bracket_stack = cons(v_char, open_bracket_stack);
                                                } else {
                                                    Errors.error($str_alt177$Mismatched_closing_bracket__S_fol, v_char, partial_tag_text, list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } 
                    }
                    return NIL != abortP ? ((SubLObject) (values(pretext, NIL))) : values(pretext, get_output_stream_string(token_output_stream));
                }
            }
        }
    }

    public static final SubLObject xml_processing_instruction_p(SubLObject token) {
        return makeBoolean((NIL != string_utilities.starts_with(token, $str_alt180$__)) && (NIL != string_utilities.ends_with(token, $str_alt181$__, UNPROVIDED)));
    }

    public static final SubLObject xml_prefixed_name_p(SubLObject name) {
        return makeBoolean(name.isString() && (NIL != list_utilities.sublisp_boolean(position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject xml_prefixed_name_namespace(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject colon_pos = position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == colon_pos) {
                        Errors.error($str_alt148$_S_is_not_a_prefixed_XML_name_, name);
                    }
                }
                return string_utilities.substring(name, ZERO_INTEGER, colon_pos);
            }
        }
    }

    public static final SubLObject xml_prefixed_name_local_name(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject colon_pos = position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == colon_pos) {
                        Errors.error($str_alt148$_S_is_not_a_prefixed_XML_name_, name);
                    }
                }
                return string_utilities.substring(name, number_utilities.f_1X(colon_pos), UNPROVIDED);
            }
        }
    }

    public static final SubLObject xml_opening_tag_p(SubLObject token) {
        return makeBoolean(((((((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_closing_tag_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_processing_instruction_p(token)));
    }

    public static final SubLObject xml_namespace_mapping_p(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && v_object.rest().isString());
    }

    public static final SubLObject xml_iterator_state_handle_namespaces_and_entities(SubLObject token, SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject namespace_stack = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_namespace_stack(state);
                SubLObject resolve_namespacesP = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_resolve_namespacesP(state);
                SubLObject validateP = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_validateP(state);
                SubLObject resolve_entity_referencesP = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_resolve_entity_referencesP(state);
                SubLObject entity_map = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_entity_map(state);
                SubLObject new_token = token;
                if (((NIL != resolve_entity_referencesP) && (NIL != entity_map)) && (NIL != find(CHAR_ampersand, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    new_token = com.cyc.cycjava.cycl.web_utilities.resolve_entity_references(token, entity_map);
                }
                if (((((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_processing_instruction_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token))) {
                    if ((NIL != validateP) || (NIL != resolve_namespacesP)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject modified_token = com.cyc.cycjava.cycl.web_utilities.handle_xml_namespaces(new_token, namespace_stack, resolve_namespacesP);
                            SubLObject new_stack = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_token = modified_token;
                            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_namespace_stack(state, new_stack);
                        }
                    }
                }
                if (((NIL != resolve_entity_referencesP) && (NIL == entity_map)) && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) {
                    com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_entity_map(state, com.cyc.cycjava.cycl.web_utilities.entity_map_from_doctype_tag(token));
                }
                return new_token;
            }
        }
    }

    public static final SubLObject xml_it_state_validateP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static final SubLObject xml_it_state_token_output_stream(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static final SubLObject xml_it_state_scratch_stream(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static final SubLObject xml_it_state_resolve_namespacesP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField9();
    }

    public static final SubLObject xml_it_state_resolve_entity_referencesP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static final SubLObject xml_it_state_on_deck_queue(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField10();
    }

    public static final SubLObject xml_it_state_namespace_stack(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static final SubLObject xml_it_state_in_stream(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static final SubLObject xml_it_state_entity_map(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    /**
     * Return a possibly empty sublist of XML-TOKENS such that
     * (a) the first token is the first occurrence of <token-name ...> in XML-TOKENS
     * (b) the last  token is the first occurrence of </token-name ...> or <token-name .../> at or after (a)
     */
    @LispMethod(comment = "Return a possibly empty sublist of XML-TOKENS such that\r\n(a) the first token is the first occurrence of <token-name ...> in XML-TOKENS\r\n(b) the last  token is the first occurrence of </token-name ...> or <token-name .../> at or after (a)\nReturn a possibly empty sublist of XML-TOKENS such that\n(a) the first token is the first occurrence of <token-name ...> in XML-TOKENS\n(b) the last  token is the first occurrence of </token-name ...> or <token-name .../> at or after (a)")
    public static final SubLObject xml_extract_token_sequence(SubLObject xml_tokens, SubLObject token_name) {
        {
            SubLObject sequence_start_string = cconcatenate($str_alt161$_, format_nil.format_nil_a_no_copy(token_name));
            SubLObject sequence_self_end_string = $str_alt162$__;
            SubLObject sequence_match_end_string = cconcatenate($str_alt163$__, format_nil.format_nil_a_no_copy(token_name));
            SubLObject sequence_start = com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to(xml_tokens, sequence_start_string, UNPROVIDED);
            if (NIL != sequence_start) {
                {
                    SubLObject start_token = sequence_start.first();
                    if (NIL != string_utilities.ends_with(start_token, sequence_self_end_string, UNPROVIDED)) {
                        return list(start_token);
                    }
                }
                {
                    SubLObject sequence_end = com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to(sequence_start, sequence_match_end_string, UNPROVIDED);
                    if (NIL != sequence_end) {
                        {
                            SubLObject sequence_after_end = sequence_end.rest();
                            return ldiff(sequence_start, sequence_after_end);
                        }
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * Returns T iff TOKEN is an XML-TAG? and is of the form <.*[/]>.
     *
     * @param TOKEN
    		stringp;
     * 		
     * @return T or NIL;
     */
    @LispMethod(comment = "Returns T iff TOKEN is an XML-TAG? and is of the form <.*[/]>.\r\n\r\n@param TOKEN\n\t\tstringp;\r\n\t\t\r\n@return T or NIL;")
    public static final SubLObject xml_empty_tagP(SubLObject token) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && CHAR_slash.eql(string_utilities.char_from_end(token, ONE_INTEGER)));
    }

    public static final SubLObject xml_doctype_tag_p(SubLObject token) {
        return makeBoolean(token.isString() && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_token_element_nameP(token, $str_alt178$_DOCTYPE)));
    }

    public static final SubLObject xml_declaration_p(SubLObject v_object) {
        return com.cyc.cycjava.cycl.web_utilities.xml_token_element_nameP(v_object, $str_alt168$_xml);
    }

    public static final SubLObject xml_comment_p(SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str_alt169$____))) && (NIL != string_utilities.ends_with(v_object, $str_alt170$___, UNPROVIDED)));
    }

    /**
     * Returns T iff TOKEN is an XML-TAG? and is of the form </ELEMENT-NAME>.
     *
     * @param ELEMENT-NAME
    		stringp;
     * 		
     * @param TOKEN
    		stringp;
     * 		
     * @return T or NIL;
     */
    @LispMethod(comment = "Returns T iff TOKEN is an XML-TAG? and is of the form </ELEMENT-NAME>.\r\n\r\n@param ELEMENT-NAME\n\t\tstringp;\r\n\t\t\r\n@param TOKEN\n\t\tstringp;\r\n\t\t\r\n@return T or NIL;")
    public static final SubLObject xml_closing_tokenP(SubLObject element_name, SubLObject token) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_closing_tag_p(token))) && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_token_element_nameP(token, element_name)));
    }

    public static final SubLObject xml_closing_tag_p(SubLObject token) {
        return makeBoolean(((token.isString() && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token))) && (NIL != list_utilities.lengthG(token, TWO_INTEGER, UNPROVIDED))) && CHAR_slash.eql(Strings.sublisp_char(token, ONE_INTEGER)));
    }

    public static final SubLObject xml_cdata_tag_text(SubLObject tag) {
        SubLTrampolineFile.checkType(tag, $sym197$XML_CDATA_TAG_);
        return string_utilities.substring(tag, length(xml_utilities.xml_cdata_prefix()), subtract(length(tag), length(xml_utilities.xml_cdata_suffix())));
    }

    /**
     * Returns T iff TOKEN is an XML-TAG? and is of the form <!<CDATA[.*]]>.
     *
     * @param TOKEN
    		stringp;
     * 		
     * @return T or NIL;
     */
    @LispMethod(comment = "Returns T iff TOKEN is an XML-TAG? and is of the form <!<CDATA[.*]]>.\r\n\r\n@param TOKEN\n\t\tstringp;\r\n\t\t\r\n@return T or NIL;")
    public static final SubLObject xml_cdata_tagP(SubLObject token) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (NIL != string_utilities.starts_with_by_test(token, xml_utilities.xml_cdata_prefix(), symbol_function(EQUAL)))) && (NIL != string_utilities.ends_with(token, xml_utilities.xml_cdata_suffix(), symbol_function(EQUAL))));
    }

    public static final SubLObject xml_attribute_value_pair_from_token(SubLObject token, SubLObject attribute_name_start, SubLObject attribute_name_end, SubLObject value_start, SubLObject value_end) {
        {
            SubLObject attribute_name = unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, attribute_name_start, number_utilities.f_1X(attribute_name_end)));
            SubLObject value = (NIL != value_start) ? ((SubLObject) (unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, value_start, number_utilities.f_1X(value_end))))) : NIL;
            SubLTrampolineFile.checkType(attribute_name, VALID_XML_NAME_P);
            return cons(attribute_name, value);
        }
    }

    public static final SubLObject validate_xml_namespaces(SubLObject token, SubLObject stack) {
        {
            SubLObject problem = NIL;
            SubLObject new_bindings = NIL;
            if ((((((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_processing_instruction_p(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_cdata_tagP(token))) && (NIL == com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token))) {
                {
                    SubLObject datum = com.cyc.cycjava.cycl.web_utilities.parse_xml_token(token);
                    SubLObject current = datum;
                    SubLObject element_name = NIL;
                    SubLObject attributes = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt142);
                    element_name = current.first();
                    current = current.rest();
                    attributes = current;
                    if (NIL != string_utilities.substringP($str_alt143$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var = attributes;
                            SubLObject cons = NIL;
                            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                {
                                    SubLObject datum_9 = cons;
                                    SubLObject current_10 = datum_9;
                                    SubLObject attribute = NIL;
                                    SubLObject value = NIL;
                                    destructuring_bind_must_consp(current_10, datum_9, $list_alt144);
                                    attribute = current_10.first();
                                    current_10 = current_10.rest();
                                    value = current_10;
                                    if (NIL != string_utilities.starts_with(attribute, $str_alt143$xmlns_)) {
                                        new_bindings = cons(cons(string_utilities.substring(attribute, SIX_INTEGER, position(CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), value), new_bindings);
                                    }
                                }
                            }
                        }
                    }
                    problem = com.cyc.cycjava.cycl.web_utilities.maybe_validate_xml_namespace(element_name, new_bindings, stack);
                    {
                        SubLObject rest = NIL;
                        for (rest = attributes; !((NIL != problem) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject cons = rest.first();
                                SubLObject datum_11 = cons;
                                SubLObject current_12 = datum_11;
                                SubLObject attribute_name = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current_12, datum_11, $list_alt145);
                                attribute_name = current_12.first();
                                current_12 = current_12.rest();
                                value = current_12;
                                problem = com.cyc.cycjava.cycl.web_utilities.maybe_validate_xml_namespace(attribute_name, new_bindings, stack);
                            }
                        }
                    }
                }
            }
            return values(problem, new_bindings);
        }
    }

    /**
     * Return NAME iff we can't resolve its namespace
     */
    @LispMethod(comment = "Return NAME iff we can\'t resolve its namespace")
    public static final SubLObject validate_xml_namespace(SubLObject name, SubLObject new_bindings, SubLObject stack) {
        {
            SubLObject namespace = com.cyc.cycjava.cycl.web_utilities.xml_prefixed_name_namespace(name);
            SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, symbol_function(EQUAL), NIL);
            if ((NIL == expanded) && namespace.equal($$$xml)) {
                expanded = $str_alt147$http___www_w3_org_XML_1998_namesp;
            }
            if (NIL == expanded) {
                {
                    SubLObject csome_list_var = stack;
                    SubLObject binding = NIL;
                    for (binding = csome_list_var.first(); !((NIL != expanded) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                        if (binding.isCons() && namespace.equal(binding.first())) {
                            expanded = binding.rest();
                        }
                    }
                }
            }
            return NIL != expanded ? ((SubLObject) (NIL)) : name;
        }
    }

    public static final SubLObject resolve_predefined_xml_entities(SubLObject string) {
        {
            SubLObject cdolist_list_var = xml_vars.$xml_predefined_entities$.getGlobalValue();
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject name = NIL;
                    SubLObject code = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt190);
                    name = current.first();
                    current = current.rest();
                    code = current;
                    if (NIL != search(name, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        string = string_utilities.string_substitute(Strings.make_string(ONE_INTEGER, code_char(code)), cconcatenate($str_alt188$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt189$_ }), string, UNPROVIDED);
                    }
                }
            }
        }
        return string;
    }

    public static final SubLObject resolve_entity_references(SubLObject token, SubLObject entity_map) {
        {
            SubLObject ans = com.cyc.cycjava.cycl.web_utilities.resolve_predefined_xml_entities(string_utilities.do_string_substitutions_robust(token, entity_map, symbol_function(EQUAL)));
            return ans;
        }
    }

    /**
     * Removes comments from a string of XML content.
     *
     * @param XML-STRING
     * 		stringp; XML such as "a <!--b--> c".
     * @return stringp; XML without comments, such as "a  c".
     */
    @LispMethod(comment = "Removes comments from a string of XML content.\r\n\r\n@param XML-STRING\r\n\t\tstringp; XML such as \"a <!--b--> c\".\r\n@return stringp; XML without comments, such as \"a  c\".")
    public static final SubLObject remove_xml_comments(SubLObject xml_string) {
        {
            SubLObject xml_tokens = com.cyc.cycjava.cycl.web_utilities.xml_string_tokenize(xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                {
                    SubLObject cdolist_list_var = xml_tokens;
                    SubLObject token = NIL;
                    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token)) {
                            princ(token, s);
                        }
                    }
                }
                result = get_output_stream_string(s);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(s, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    /**
     * Returns T iff TOKEN is an XML token that is not of a special type.
     *
     * @param TOKEN
    		stringp;
     * 		
     * @return T or NIL;
     */
    @LispMethod(comment = "Returns T iff TOKEN is an XML token that is not of a special type.\r\n\r\n@param TOKEN\n\t\tstringp;\r\n\t\t\r\n@return T or NIL;")
    public static final SubLObject regular_xml_tagP(SubLObject token) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.web_utilities.xml_tagP(token)) && (!(((NIL != com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token)) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token)))));
    }

    public static final SubLObject print_xml_token_iterator_state(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt137$_XML_TOKEN_ITERATOR_STATE_);
        return v_object;
    }

    /**
     * For <head k1=v1 k2=v2>, returns ('head' ('k1' . 'v1') ('k2' . 'v2'))
     *
     * @param TOKEN
     * 		stringp; XML token to parse.
     * @return listp; A list (stringp . alist-p) representing the tag.
     */
    @LispMethod(comment = "For <head k1=v1 k2=v2>, returns (\'head\' (\'k1\' . \'v1\') (\'k2\' . \'v2\'))\r\n\r\n@param TOKEN\r\n\t\tstringp; XML token to parse.\r\n@return listp; A list (stringp . alist-p) representing the tag.")
    public static final SubLObject parse_xml_token_int_internal(SubLObject token, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        {
            SubLObject space_pos = position_if(WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject token_length = length(token);
            SubLObject contents_end = ((NIL != com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(token)) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token))) ? ((SubLObject) (subtract(token_length, TWO_INTEGER))) : subtract(token_length, ONE_INTEGER);
            SubLObject v_answer = list(com.cyc.cycjava.cycl.web_utilities.xml_token_element_name(token));
            SubLObject read_keyP = NIL;
            SubLObject found_equal_signP = NIL;
            SubLObject quote_char = NIL;
            SubLObject key_start = NIL;
            SubLObject key_end = NIL;
            SubLObject value_start = NIL;
            SubLObject value_end = NIL;
            if (NIL != space_pos) {
                {
                    SubLObject string_var = token;
                    SubLObject end_var = (NIL != contents_end) ? ((SubLObject) (contents_end)) : length(string_var);
                    SubLObject end_var_25 = end_var;
                    SubLObject i = NIL;
                    for (i = number_utilities.f_1X(space_pos); !i.numGE(end_var_25); i = number_utilities.f_1X(i)) {
                        {
                            SubLObject c = Strings.sublisp_char(string_var, i);
                            SubLObject done_with_keyP = NIL;
                            if (NIL != read_keyP) {
                                if (NIL != quote_char) {
                                    if (c == quote_char) {
                                        quote_char = NIL;
                                        if (NIL == value_start) {
                                            value_start = i;
                                        }
                                        value_end = number_utilities.f_1_(i);
                                        done_with_keyP = T;
                                        read_keyP = NIL;
                                    } else {
                                        if ((quote_char == CHAR_null) && (((c == CHAR_greater) || (NIL != string_utilities.whitespacep(c))) || (number_utilities.f_1X(i) == contents_end))) {
                                            quote_char = NIL;
                                            value_end = (NIL != string_utilities.whitespacep(c)) ? ((SubLObject) (subtract(i, ONE_INTEGER))) : i;
                                            done_with_keyP = T;
                                            read_keyP = NIL;
                                        } else {
                                            if (NIL == value_start) {
                                                value_start = (quote_char == CHAR_null) ? ((SubLObject) (subtract(i, ONE_INTEGER))) : i;
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject pcase_var = c;
                                        if (pcase_var.eql(CHAR_quotation) || pcase_var.eql(CHAR_quote)) {
                                            if (NIL == found_equal_signP) {
                                                Errors.error($str_alt193$XML_syntax_error__No___before__S, string_utilities.substring(token, i, UNPROVIDED));
                                            }
                                            quote_char = c;
                                        } else {
                                            if (pcase_var.eql(CHAR_equal)) {
                                                found_equal_signP = T;
                                            } else {
                                                if (NIL == string_utilities.whitespacep(c)) {
                                                    if (NIL != strictP) {
                                                        Errors.error($str_alt194$XML_syntax_error__Value_starting_, string_utilities.substring(token, i, UNPROVIDED));
                                                    } else {
                                                        quote_char = CHAR_null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pcase_var = c;
                                    if ((((pcase_var.eql(CHAR_space) || pcase_var.eql(CHAR_tab)) || pcase_var.eql(CHAR_return)) || pcase_var.eql(CHAR_newline)) || pcase_var.eql(CHAR_equal)) {
                                        if (CHAR_equal == c) {
                                            found_equal_signP = T;
                                        }
                                        if (NIL != key_start) {
                                            read_keyP = T;
                                            key_end = number_utilities.f_1_(i);
                                        }
                                    } else {
                                        if (NIL != key_start) {
                                            key_end = i;
                                        } else {
                                            key_start = i;
                                        }
                                    }
                                }
                            }
                            if ((NIL != key_start) && (NIL != done_with_keyP)) {
                                {
                                    SubLObject pair = com.cyc.cycjava.cycl.web_utilities.xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
                                    v_answer = cons(pair, v_answer);
                                }
                                key_start = NIL;
                                key_end = NIL;
                                value_start = NIL;
                                value_end = NIL;
                                found_equal_signP = NIL;
                            }
                        }
                    }
                }
            }
            if (NIL != key_start) {
                {
                    SubLObject pair = com.cyc.cycjava.cycl.web_utilities.xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
                    v_answer = cons(pair, v_answer);
                }
            }
            return nreverse(v_answer);
        }
    }

    public static final SubLObject parse_xml_token_int(SubLObject token, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.web_utilities.parse_xml_token_int_internal(token, strictP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PARSE_XML_TOKEN_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PARSE_XML_TOKEN_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PARSE_XML_TOKEN_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(token, strictP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw195$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (token.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && strictP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.web_utilities.parse_xml_token_int_internal(token, strictP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(token, strictP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject parse_xml_token(SubLObject token) {
        return com.cyc.cycjava.cycl.web_utilities.parse_xml_token_int(token, UNPROVIDED);
    }

    /**
     * just like @xref PARSE-XML-TOKEN except that it does not require quoted attribute values
     */
    @LispMethod(comment = "just like @xref PARSE-XML-TOKEN except that it does not require quoted attribute values")
    public static final SubLObject parse_html_token(SubLObject token) {
        return com.cyc.cycjava.cycl.web_utilities.parse_xml_token_int(token, NIL);
    }

    public static final SubLObject non_content_xml_token_p(SubLObject token) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.web_utilities.xml_declaration_p(token)) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token))) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_comment_p(token))) || (NIL != com.cyc.cycjava.cycl.web_utilities.xml_processing_instruction_p(token)));
    }

    /**
     * Return the position in TOKENS of the next one that does not pass TEST.
     * Return NIL iff no such match can be found.
     */
    @LispMethod(comment = "Return the position in TOKENS of the next one that does not pass TEST.\r\nReturn NIL iff no such match can be found.\nReturn the position in TOKENS of the next one that does not pass TEST.\nReturn NIL iff no such match can be found.")
    public static final SubLObject next_xml_token_position_if_not(SubLObject tokens, SubLObject test) {
        {
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject position = NIL;
            for (list_var = tokens, token = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
                if (NIL == funcall(test, token)) {
                    return position;
                }
            }
        }
        return NIL;
    }

    /**
     * Return the position in TOKENS of the next one that passes TEST.
     * Return NIL iff no such match can be found.
     */
    @LispMethod(comment = "Return the position in TOKENS of the next one that passes TEST.\r\nReturn NIL iff no such match can be found.\nReturn the position in TOKENS of the next one that passes TEST.\nReturn NIL iff no such match can be found.")
    public static final SubLObject next_xml_token_position_if(SubLObject tokens, SubLObject test) {
        {
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject position = NIL;
            for (list_var = tokens, token = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
                if (NIL != funcall(test, token)) {
                    return position;
                }
            }
        }
        return NIL;
    }

    /**
     * Return the position in TOKENS of the next one that matches TARGET-STRING via TEST.
     * Return NIL iff no such match can be found.
     */
    @LispMethod(comment = "Return the position in TOKENS of the next one that matches TARGET-STRING via TEST.\r\nReturn NIL iff no such match can be found.\nReturn the position in TOKENS of the next one that matches TARGET-STRING via TEST.\nReturn NIL iff no such match can be found.")
    public static final SubLObject next_xml_token_position(SubLObject tokens, SubLObject target_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        {
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject position = NIL;
            for (list_var = tokens, token = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
                if (NIL != funcall(test, token, target_string)) {
                    return position;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject new_xml_token_iterator_state(SubLObject in_stream, SubLObject scratch_stream, SubLObject token_output_stream, SubLObject entity_map, SubLObject namespace_stack, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP, SubLObject on_deck_queue) {
        {
            SubLObject state = com.cyc.cycjava.cycl.web_utilities.make_xml_token_iterator_state(UNPROVIDED);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_in_stream(state, in_stream);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_scratch_stream(state, scratch_stream);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_token_output_stream(state, token_output_stream);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_entity_map(state, entity_map);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_namespace_stack(state, namespace_stack);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_validateP(state, validateP);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_resolve_entity_referencesP(state, resolve_entity_referencesP);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_resolve_namespacesP(state, resolve_namespacesP);
            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_on_deck_queue(state, on_deck_queue);
            return state;
        }
    }

    /**
     * Returns an iterator for XML tokens read from IN-STREAM.
     *
     * @param VALIDATE?
     * 		booleanp; If non-NIL, throw an error if invalid XML is detected.
     * @unknown validation is *not* exhaustive: DTDs are not checked, and in general only
    basic syntax errors are detected.
     * @param RESOLVE-ENTITY-REFERENCES?
     * 		booleanp; If non-NIL, replace &foo; entity references
     * 		with their values declared via ENTITY in the doctype tag.
     */
    @LispMethod(comment = "Returns an iterator for XML tokens read from IN-STREAM.\r\n\r\n@param VALIDATE?\r\n\t\tbooleanp; If non-NIL, throw an error if invalid XML is detected.\r\n@unknown validation is *not* exhaustive: DTDs are not checked, and in general only\r\nbasic syntax errors are detected.\r\n@param RESOLVE-ENTITY-REFERENCES?\r\n\t\tbooleanp; If non-NIL, replace &foo; entity references\r\n\t\twith their values declared via ENTITY in the doctype tag.")
    public static final SubLObject new_xml_token_iterator(SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        SubLTrampolineFile.checkType(in_stream, STREAMP);
        {
            SubLObject state = com.cyc.cycjava.cycl.web_utilities.make_iterator_xml_token_state(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
            SubLObject iterator = iteration.new_iterator(state, ITERATE_XML_TOKEN_DONE, ITERATE_XML_TOKEN_NEXT, UNPROVIDED);
            return iterator;
        }
    }

    public static final SubLObject maybe_validate_xml_namespace(SubLObject name, SubLObject new_bindings, SubLObject stack) {
        return (NIL != find(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == string_utilities.starts_with(name, $str_alt143$xmlns_)) ? ((SubLObject) (com.cyc.cycjava.cycl.web_utilities.validate_xml_namespace(name, new_bindings, stack))) : NIL;
    }

    public static final SubLObject make_xml_token_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($IN_STREAM)) {
                        com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_in_stream(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SCRATCH_STREAM)) {
                            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_scratch_stream(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TOKEN_OUTPUT_STREAM)) {
                                com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_token_output_stream(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ENTITY_MAP)) {
                                    com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_entity_map(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NAMESPACE_STACK)) {
                                        com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_namespace_stack(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($kw132$VALIDATE_)) {
                                            com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_validateP(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($kw133$RESOLVE_ENTITY_REFERENCES_)) {
                                                com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_resolve_entity_referencesP(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($kw134$RESOLVE_NAMESPACES_)) {
                                                    com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_resolve_namespacesP(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($ON_DECK_QUEUE)) {
                                                        com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_on_deck_queue(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt136$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static final SubLObject make_iterator_xml_token_state(SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        {
            SubLObject scratch_stream = make_private_string_output_stream();
            SubLObject token_output_stream = make_private_string_output_stream();
            SubLObject entity_map = NIL;
            SubLObject namespace_stack = NIL;
            SubLObject on_deck_queue = misc_utilities.uninitialized();
            return com.cyc.cycjava.cycl.web_utilities.new_xml_token_iterator_state(in_stream, scratch_stream, token_output_stream, entity_map, namespace_stack, validateP, resolve_entity_referencesP, resolve_namespacesP, on_deck_queue);
        }
    }

    public static final SubLObject iterate_xml_token_next(SubLObject state) {
        {
            SubLObject on_deck_queue = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_on_deck_queue(state);
            com.cyc.cycjava.cycl.web_utilities.ensure_xml_token_on_deck_queue_populated(state);
            return values(queues.dequeue(on_deck_queue), state);
        }
    }

    public static final SubLObject iterate_xml_token_done(SubLObject state) {
        com.cyc.cycjava.cycl.web_utilities.ensure_xml_token_on_deck_queue_populated(state);
        return eq($DONE, queues.queue_peek(com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_on_deck_queue(state)));
    }

    /**
     * obsolete -- use XML-TOKENIZE
     */
    @LispMethod(comment = "obsolete -- use XML-TOKENIZE")
    public static final SubLObject html_tokenize(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject in_stream = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt154);
            in_stream = current.first();
            current = current.rest();
            if (NIL == current) {
                defmacro_obsolete_warning(HTML_TOKENIZE, $list_alt156);
                return listS(XML_TOKENIZE, in_stream, $list_alt158);
            } else {
                cdestructuring_bind_error(datum, $list_alt154);
            }
        }
        return NIL;
    }

    public static final SubLObject html_doctype_tag_p(SubLObject token) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.web_utilities.xml_doctype_tag_p(token)) && (NIL != string_utilities.starts_with_by_test(token, $str_alt179$__DOCTYPE_HTML_, symbol_function(EQUALP))));
    }

    /**
     * Validate the namespace references in TOKEN wrt those in STACK and those bound in TOKEN itself.
     * Store new namespace bindings in STACK.
     * If RESOLVE-NAMESPACES? is non-NIL, replace prefixed element and attribute names with expanded names in TOKEN.
     *
     * @return 0 possibly namespace-resolved version of TOKEN.
     * @return 1 possibly augmented STACK with new namespace bindings.
     * @unknown baxter
     */
    @LispMethod(comment = "Validate the namespace references in TOKEN wrt those in STACK and those bound in TOKEN itself.\r\nStore new namespace bindings in STACK.\r\nIf RESOLVE-NAMESPACES? is non-NIL, replace prefixed element and attribute names with expanded names in TOKEN.\r\n\r\n@return 0 possibly namespace-resolved version of TOKEN.\r\n@return 1 possibly augmented STACK with new namespace bindings.\r\n@unknown baxter\nValidate the namespace references in TOKEN wrt those in STACK and those bound in TOKEN itself.\nStore new namespace bindings in STACK.\nIf RESOLVE-NAMESPACES? is non-NIL, replace prefixed element and attribute names with expanded names in TOKEN.")
    public static final SubLObject handle_xml_namespaces(SubLObject token, SubLObject stack, SubLObject resolve_namespacesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_namespace_bindings = NIL;
                if (NIL != resolve_namespacesP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject token_5 = xml_utilities.resolve_xml_namespaces(token, stack);
                        SubLObject new_namespace_bindings_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        token = token_5;
                        new_namespace_bindings = new_namespace_bindings_6;
                    }
                } else {
                    {
                        SubLObject problem = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject problem_7 = com.cyc.cycjava.cycl.web_utilities.validate_xml_namespaces(token, stack);
                            SubLObject new_namespace_bindings_8 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            problem = problem_7;
                            new_namespace_bindings = new_namespace_bindings_8;
                        }
                        if (NIL != problem) {
                            Errors.error($str_alt140$Couldn_t_resolve_namespace__S_in_, problem, token);
                        }
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_cdata_tagP(token)) {
                } else {
                    if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_opening_tag_p(token)) {
                        stack = cons(com.cyc.cycjava.cycl.web_utilities.xml_token_element_name(token), stack);
                        stack = append(new_namespace_bindings, stack);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_closing_tag_p(token)) {
                            {
                                SubLObject element_name = com.cyc.cycjava.cycl.web_utilities.xml_token_element_name(token);
                                while (NIL != com.cyc.cycjava.cycl.web_utilities.xml_namespace_mapping_p(stack.first())) {
                                    stack = stack.rest();
                                } 
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!element_name.equal(stack.first())) {
                                        Errors.error($str_alt141$Mismatched_tags__Expected__S__got, stack.first(), element_name);
                                    }
                                }
                                stack = stack.rest();
                            }
                        }
                    }
                }
            }
            return values(token, stack);
        }
    }

    /**
     * Gets a single value out of an s-expression representing XML.
     * For example, given FIELD "bgcolor" and SEXPR
     * (("body" ("bgcolor" . "3")) "Here is some text")
     * return "3".
     *
     * @param FIELD
     * 		stringp; the name of the field to extract a value for.
     * @param SEXPR
     * 		listp; the s-expression containing the record.
     * @unknown the value of that field in the record.
     */
    @LispMethod(comment = "Gets a single value out of an s-expression representing XML.\r\nFor example, given FIELD \"bgcolor\" and SEXPR\r\n((\"body\" (\"bgcolor\" . \"3\")) \"Here is some text\")\r\nreturn \"3\".\r\n\r\n@param FIELD\r\n\t\tstringp; the name of the field to extract a value for.\r\n@param SEXPR\r\n\t\tlistp; the s-expression containing the record.\r\n@unknown the value of that field in the record.\nGets a single value out of an s-expression representing XML.\nFor example, given FIELD \"bgcolor\" and SEXPR\n((\"body\" (\"bgcolor\" . \"3\")) \"Here is some text\")\nreturn \"3\".")
    public static final SubLObject get_field_value_from_xml_sexpr(SubLObject field, SubLObject sexpr) {
        {
            SubLObject cdolist_list_var = sexpr.rest();
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                if (child.first().first().equal(field)) {
                    return second(child);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject entity_map_from_doctype_tag(SubLObject token) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject chunks = string_utilities.string_tokenize(token, cons(CHAR_lbracket, string_utilities.whitespace_chars()), NIL, NIL, T, NIL, $list_alt182);
                SubLObject map = NIL;
                SubLObject datum = chunks;
                SubLObject current = datum;
                SubLObject doctype = NIL;
                SubLObject name = NIL;
                SubLObject open_bracket = NIL;
                SubLObject rest = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt183);
                doctype = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt183);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt183);
                open_bracket = current.first();
                current = current.rest();
                rest = current;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!doctype.equal($str_alt184$__DOCTYPE)) {
                        Errors.error($str_alt185$Got__S_instead_of___DOCTYPE_, doctype);
                    }
                }
                if (open_bracket.equal($str_alt186$_)) {
                    {
                        SubLObject doneP = NIL;
                        while (!((NIL != doneP) || (NIL != list_utilities.empty_list_p(rest)))) {
                            {
                                SubLObject next_pos = position($str_alt187$__ENTITY, rest, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == next_pos) {
                                    doneP = T;
                                } else {
                                    if (NIL != list_utilities.lengthG(rest, add(next_pos, THREE_INTEGER), UNPROVIDED)) {
                                        {
                                            SubLObject abbrev = cconcatenate($str_alt188$_, new SubLObject[]{ nth(add(next_pos, ONE_INTEGER), rest), $str_alt189$_ });
                                            SubLObject raw_url_string = nth(add(next_pos, TWO_INTEGER), rest);
                                            SubLObject url_string = string_utilities.nchar_subst(CHAR_quotation, CHAR_quote, raw_url_string);
                                            SubLObject expansion = read_from_string(url_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            map = list_utilities.alist_enter(map, abbrev, expansion, UNPROVIDED);
                                        }
                                        rest = nthcdr(add(next_pos, THREE_INTEGER), rest);
                                    } else {
                                        doneP = T;
                                    }
                                }
                            }
                        } 
                    }
                }
                return map;
            }
        }
    }

    public static final SubLObject ensure_xml_token_on_deck_queue_populated(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject on_deck_queue = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_on_deck_queue(state);
                SubLObject at_beginningP = makeBoolean(NIL == queues.queue_p(on_deck_queue));
                if (NIL != at_beginningP) {
                    on_deck_queue = queues.create_queue();
                    com.cyc.cycjava.cycl.web_utilities._csetf_xml_it_state_on_deck_queue(state, on_deck_queue);
                }
                {
                    SubLObject scratch_stream = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_scratch_stream(state);
                    SubLObject token_output_stream = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_token_output_stream(state);
                    SubLObject in_stream = com.cyc.cycjava.cycl.web_utilities.xml_token_iterator_state_in_stream(state);
                    if (NIL != queues.queue_empty_p(on_deck_queue)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject text = com.cyc.cycjava.cycl.web_utilities.xml_read(in_stream, scratch_stream, token_output_stream);
                            SubLObject token = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != at_beginningP) {
                                if (NIL != com.cyc.cycjava.cycl.web_utilities.html_doctype_tag_p(token)) {
                                    Errors.error($str_alt139$Can_t_parse_HTML_as_XML_);
                                }
                            }
                            if (NIL != string_utilities.non_empty_string_p(text)) {
                                {
                                    SubLObject modified_text = com.cyc.cycjava.cycl.web_utilities.xml_iterator_state_handle_namespaces_and_entities(text, state);
                                    queues.enqueue(modified_text, on_deck_queue);
                                }
                            }
                            if (NIL == token) {
                                queues.enqueue($DONE, on_deck_queue);
                                close(scratch_stream, UNPROVIDED);
                            } else {
                                {
                                    SubLObject modified_token = com.cyc.cycjava.cycl.web_utilities.xml_iterator_state_handle_namespaces_and_entities(token, state);
                                    queues.enqueue(modified_token, on_deck_queue);
                                }
                            }
                        }
                    }
                }
            }
            return state;
        }
    }

    /**
     * Return the first sublist of the list TOKENS in which its first token matches TARGET-STRING via TEST, unless FORBIDDEN-STRING is encountered first, in which case the returned sublist has FORBIDDEN-STRING matching via TEST at its start. If neither condition holds before the list is exhausted, NIL is returned.
     */
    @LispMethod(comment = "Return the first sublist of the list TOKENS in which its first token matches TARGET-STRING via TEST, unless FORBIDDEN-STRING is encountered first, in which case the returned sublist has FORBIDDEN-STRING matching via TEST at its start. If neither condition holds before the list is exhausted, NIL is returned.")
    public static final SubLObject advance_xml_tokens_without_crossing(SubLObject tokens, SubLObject target_string, SubLObject forbidden_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        while (((NIL != tokens) && (NIL == funcall(test, tokens.first(), target_string))) && (NIL == funcall(test, tokens.first(), forbidden_string))) {
            tokens = tokens.rest();
        } 
        return tokens;
    }

    public static final SubLObject advance_xml_tokens_to_end_of_element_int(SubLObject tokens, SubLObject element_name) {
        {
            SubLObject datum = tokens;
            SubLObject current = datum;
            SubLObject first_token = NIL;
            SubLObject rest_of_tokens = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt165);
            first_token = current.first();
            current = current.rest();
            rest_of_tokens = current;
            if ((NIL != com.cyc.cycjava.cycl.web_utilities.xml_closing_tokenP(element_name, first_token)) || ((NIL != com.cyc.cycjava.cycl.web_utilities.xml_token_element_nameP(first_token, element_name)) && (NIL != com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(first_token)))) {
                com.cyc.cycjava.cycl.web_utilities.accumulate_xml_token(first_token);
                return rest_of_tokens;
            }
            {
                SubLObject next_position = com.cyc.cycjava.cycl.web_utilities.next_xml_token_position(rest_of_tokens, element_name, $sym166$XML_TOKEN_ELEMENT_NAME_);
                SubLObject next_occurrence = (NIL != next_position) ? ((SubLObject) (nth(next_position, rest_of_tokens))) : NIL;
                if (NIL == next_position) {
                    Errors.sublisp_break($str_alt167$Couldn_t_find_position_of__S_in__, new SubLObject[]{ element_name, rest_of_tokens });
                }
                {
                    SubLObject ans = rest_of_tokens;
                    while (NIL != com.cyc.cycjava.cycl.web_utilities.xml_empty_tagP(next_occurrence)) {
                        ans = com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens(ans, number_utilities.f_1X(next_position));
                        next_position = com.cyc.cycjava.cycl.web_utilities.next_xml_token_position(ans, element_name, $sym166$XML_TOKEN_ELEMENT_NAME_);
                        next_occurrence = (NIL != next_position) ? ((SubLObject) (nth(next_position, ans))) : NIL;
                    } 
                    if (NIL != com.cyc.cycjava.cycl.web_utilities.xml_closing_tag_p(next_occurrence)) {
                        com.cyc.cycjava.cycl.web_utilities.accumulate_xml_tokens(tokens, number_utilities.f_1X(number_utilities.f_1X(next_position)));
                        return com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens(ans, number_utilities.f_1X(next_position));
                    }
                    while (NIL == com.cyc.cycjava.cycl.web_utilities.xml_closing_tag_p(next_occurrence)) {
                        {
                            SubLObject at_next_start = com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens(ans, next_position);
                            SubLObject after_next_end = com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to_end_of_element_int(at_next_start, element_name);
                            ans = after_next_end;
                            next_position = com.cyc.cycjava.cycl.web_utilities.next_xml_token_position(ans, element_name, $sym166$XML_TOKEN_ELEMENT_NAME_);
                            next_occurrence = (NIL != next_position) ? ((SubLObject) (nth(next_position, ans))) : NIL;
                        }
                    } 
                    return NIL != ans ? ((SubLObject) (com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to_end_of_element_int(ans, element_name))) : NIL;
                }
            }
        }
    }

    /**
     * Return the first sublist of the list TOKENS following the first element represented in TOKENS.
     */
    @LispMethod(comment = "Return the first sublist of the list TOKENS following the first element represented in TOKENS.")
    public static final SubLObject advance_xml_tokens_to_end_of_element(SubLObject tokens) {
        SubLTrampolineFile.checkType(tokens.first(), $sym164$XML_TAG_);
        {
            SubLObject element_name = com.cyc.cycjava.cycl.web_utilities.xml_token_element_name(tokens.first());
            return com.cyc.cycjava.cycl.web_utilities.advance_xml_tokens_to_end_of_element_int(tokens, element_name);
        }
    }

    /**
     * Return the first sublist of the list TOKENS in which its first token matches TARGET-STRING via TEST.
     * Return NIL if no such token can be found.
     */
    @LispMethod(comment = "Return the first sublist of the list TOKENS in which its first token matches TARGET-STRING via TEST.\r\nReturn NIL if no such token can be found.\nReturn the first sublist of the list TOKENS in which its first token matches TARGET-STRING via TEST.\nReturn NIL if no such token can be found.")
    public static final SubLObject advance_xml_tokens_to(SubLObject tokens, SubLObject target_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        while ((NIL != tokens) && (NIL == funcall(test, tokens.first(), target_string))) {
            tokens = tokens.rest();
        } 
        return tokens;
    }

    /**
     * Return the sublist of the list TOKENS which starts N tokens ahead.
     * Return NIL if less than N tokens remain.
     */
    @LispMethod(comment = "Return the sublist of the list TOKENS which starts N tokens ahead.\r\nReturn NIL if less than N tokens remain.\nReturn the sublist of the list TOKENS which starts N tokens ahead.\nReturn NIL if less than N tokens remain.")
    public static final SubLObject advance_xml_tokens(SubLObject tokens, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        return nthcdr(n, tokens);
    }

    public static final SubLObject advance_xml_token_iterator_to_next_element(SubLObject token_iterator) {
        while ((NIL != com.cyc.cycjava.cycl.web_utilities.non_content_xml_token_p(iteration.xml_token_iterator_peek(token_iterator))) || (NIL != string_utilities.whitespace_stringP(iteration.xml_token_iterator_peek(token_iterator)))) {
            iteration.iteration_next(token_iterator);
        } 
        return NIL;
    }

    public static final SubLObject accumulated_xml_tokens() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread)) ? ((SubLObject) (nreverse($xml_token_accumulator$.getDynamicValue(thread)))) : NIL;
        }
    }

    public static final SubLObject accumulate_xml_tokens(SubLObject tokens, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread))) {
                {
                    SubLObject done_count = ZERO_INTEGER;
                    SubLObject doneP = numGE(done_count, n);
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = tokens;
                            SubLObject token = NIL;
                            for (token = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token = csome_list_var.first()) {
                                com.cyc.cycjava.cycl.web_utilities.accumulate_xml_token(token);
                                done_count = add(done_count, ONE_INTEGER);
                                doneP = numGE(done_count, n);
                            }
                        }
                    }
                }
            }
            return tokens;
        }
    }

    public static final SubLObject accumulate_xml_token(SubLObject token) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread))) {
                $xml_token_accumulator$.setDynamicValue(cons(token, $xml_token_accumulator$.getDynamicValue(thread)), thread);
            }
            return token;
        }
    }

    public static final SubLObject _csetf_xml_it_state_validateP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_xml_it_state_token_output_stream(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_xml_it_state_scratch_stream(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_xml_it_state_resolve_namespacesP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_xml_it_state_resolve_entity_referencesP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_xml_it_state_on_deck_queue(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_xml_it_state_namespace_stack(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_xml_it_state_in_stream(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_xml_it_state_entity_map(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XML_TOKEN_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_259_initializer() {
        return list(new SubLObject[]{ list(list(makeString("<owl:onProperty/>")), list(makeString("owl:onProperty"))), list(list(makeString("<owl:Class rdf:ID=\"MarineEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"PackIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PackIce")))), list(list(makeString("<owl:Class rdf:ID=\"SubmarineCanyon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubmarineCanyon")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Ocean\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Ocean")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SnowLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SnowLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Hydrosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Cryosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Lake\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<rdfs:range rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Stratosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Litter\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Litter")))), list(list(makeString("<owl:Class rdf:ID=\"Pond\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pond")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:ID=\"LowerMantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerMantle")))), list(list(makeString("<owl:Class rdf:about=\"#Catchment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Catchment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MantleLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TroposphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TroposphereLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"IntertidalZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IntertidalZone")))), list(list(makeString("<owl:Class rdf:ID=\"Cirque\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cirque")))), list(list(makeString("<owl:Class rdf:ID=\"EcosystemType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"PeriglacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PeriglacialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Mantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mantle")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Hydrosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"TemperateClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TemperateClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"Fjord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Ocean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ocean")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"Felsic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Felsic")))), list(list(makeString("<owl:Class rdf:ID=\"Beach\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Beach")))), list(list(makeString("<owl:Class rdf:ID=\"Core\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Core")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Basin\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:Class rdf:ID=\"Mesosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mesosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:ID=\"Marsh\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Marsh")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Glacier\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Glacier")))), list(list(makeString("<owl:Class rdf:ID=\"Watershed\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Watershed")))), list(list(makeString("<owl:Class rdf:ID=\"Shoreline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoreline")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Crust\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"RegionProperty\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RegionProperty")))), list(list(makeString("<owl:Class rdf:ID=\"MarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineWetland")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary")))), list(list(makeString("<owl:Class rdf:about=\"#VadoseZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#VadoseZone")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"EstuarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EstuarineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"Volcano\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Volcano")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:about=\"#OceanRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#OceanRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Stream\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Stream")))), list(list(makeString("<owl:Class rdf:about=\"#Ocean\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Ocean")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mantle\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mantle")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"WaterTable\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterTable")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TopographicalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TopographicalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Spring\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Spring")))), list(list(makeString("<owl:Class rdf:ID=\"Tropopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tropopause")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurfaceLayer")))), list(list(makeString("<owl:Class>")), list(makeString("owl:Class"))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<rdfs:range rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject")))), list(list(makeString("<owl:Class rdf:ID=\"Plateau\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plateau")))), list(list(makeString("<owl:Class rdf:ID=\"AphoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AphoticZone")))), list(list(makeString("<owl:Class rdf:ID=\"IslandArc\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IslandArc")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:about=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurface")))), list(list(makeString("<owl:onProperty rdf:resource=\"#primarySubstance\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#primarySubstance")))), list(list(makeString("<owl:Class rdf:about=\"#Groundwater\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:ID=\"FastIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FastIce")))), list(list(makeString("<owl:Class rdf:ID=\"Swamp\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Swamp")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandWaterObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"PhoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PhoticZone")))), list(list(makeString("<rdfs:range rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"LandIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EolianLandform\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EolianLandform")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:ID=\"Rock_body\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Rock_body")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Farmland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Farmland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasGeomorphologicalType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasGeomorphologicalType")))), list(list(makeString("<owl:Class rdf:about=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Sea\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sea")))), list(list(makeString("<owl:Class rdf:ID=\"KarstLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("KarstLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Troposphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Troposphere")))), list(list(makeString("<owl:Class rdf:ID=\"AlpineClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AlpineClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"GlacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlacialLandform")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GroundWaterObjectBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GroundWaterObjectBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"BenticEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BenticEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Isopycnal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isopycnal")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoastalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:Class rdf:about=\"#LandRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UndergroundWater\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"Mafic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mafic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"Delta\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Delta")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"Creek\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Creek")))), list(list(makeString("<owl:Class rdf:ID=\"LandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Thermosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Ridge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ridge")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#Floodplain\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Floodplain")))), list(list(makeString("<owl:Class rdf:ID=\"SnowLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowLayer")))), list(list(makeString("<owl:allValuesFrom>")), list(makeString("owl:allValuesFrom"))), list(list(makeString("<owl:Class rdf:ID=\"IceFloe\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceFloe")))), list(list(makeString("<owl:Class rdf:ID=\"DryLandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DryLandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Aquifer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aquifer")))), list(list(makeString("<owl:Class rdf:ID=\"MiddleAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MiddleAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Biosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Biosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"CoralReef\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoralReef")))), list(list(makeString("<owl:Class rdf:ID=\"ContinentalMargin\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ContinentalMargin")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceWater")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EarthRealm\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"Estuary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Estuary")))), list(list(makeString("<owl:Class rdf:ID=\"IceCore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceCore")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"CrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CrustLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Plain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plain")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Benthos\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthos")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"MixedLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MixedLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Stratosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"SolidEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SolidEarth")))), list(list(makeString("<owl:Class rdf:ID=\"SoilLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SoilLayer")))), list(list(makeString("<owl:Class rdf:ID=\"HydrosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"EolianLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EolianLandform")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloor\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"Benthic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PermafrostZone\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PermafrostZone")))), list(list(makeString("<owl:Class rdf:ID=\"TectonicLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TectonicLandform")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasLowerBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryHeight")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Thermosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Thermosphere")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasLowerBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryReferenceHeight")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CryosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CryosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Mountain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mountain")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"CryosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CryosphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TerrrestrialWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrrestrialWetland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TroposphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TroposphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<owl:Class rdf:ID=\"PalustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PalustrineWetland")))), list(list(makeString("<rdfs:range rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Atmosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"FreshwaterLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FreshwaterLake")))), list(list(makeString("<owl:Class rdf:ID=\"FluvialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FluvialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"HydrothermalVents\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrothermalVents")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Groundwater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:about=\"#Basin\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorGroundLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Forest_Ecosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Bedrock\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Bedrock")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LacustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LacustrineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"CostalLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CostalLandform")))), list(list(makeString("<owl:Class rdf:ID=\"ClimateZoneType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TectonicLandform\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TectonicLandform")))), list(list(makeString("<owl:Class rdf:ID=\"TropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TropicalClimateZone")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasEcosystemType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasEcosystemType")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasEcosystemType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasEcosystemType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundWaterObjectBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundWaterObjectBoundary")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lake\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"RockGlacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockGlacier")))), list(list(makeString("<owl:Class rdf:ID=\"SubsurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubsurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterRegion")))), list(list(makeString("<rdfs:domain rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LithosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LithosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"MontaneForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MontaneForest")))), list(list(makeString("<owl:Class rdf:ID=\"CaveEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CaveEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Tundra_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tundra_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Dune\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Dune")))), list(list(makeString("<owl:Class rdf:ID=\"DemersalEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DemersalEcosystem")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandIceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<owl:Class rdf:ID=\"BarrierIsland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BarrierIsland")))), list(list(makeString("<owl:Class rdf:ID=\"Leads\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Leads")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"MangroveForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MangroveForest")))), list(list(makeString("<owl:Class rdf:ID=\"Grassland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Grassland")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"coveredBySubstance_temporary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("coveredBySubstance_temporary")))), list(list(makeString("<owl:Class rdf:ID=\"UrbanLand\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UrbanLand")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Ionosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ionosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PelagicEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PelagicEcosystem")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Farmland\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Farmland")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasLowerBoundaryReferenceHeight\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasLowerBoundaryReferenceHeight")))), list(list(makeString("<owl:Class rdf:ID=\"OceanLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurface")))), list(list(makeString("<owl:Class rdf:ID=\"Iceberg\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Iceberg")))), list(list(makeString("<owl:Class rdf:ID=\"Aeoliean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aeoliean")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Isobar\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isobar")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasClimateZoneType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"SnowField\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowField")))), list(list(makeString("<owl:Class rdf:ID=\"RiftValley\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiftValley")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LakeLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LakeLayer")))), list(list(makeString("<owl:disjointWith rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:disjointWith"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:about=\"#Dam\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Dam")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Rock_body\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Rock_body")))), list(list(makeString("<owl:Class rdf:ID=\"Lagoon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lagoon")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfSeaIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfSeaIce")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Seamount\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Seamount")))), list(list(makeString("<owl:Class rdf:ID=\"Lithosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lithosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MantleLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"IceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceRegion")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#double\">")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#double")))), list(list(makeString("<owl:Class rdf:ID=\"Asthenosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Asthenosphere")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"primarySubstance\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("primarySubstance")))), list(list(makeString("<owl:Class rdf:ID=\"Thermocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermocline")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Trench\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Trench")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CrustLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lithosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lithosphere")))), list(list(makeString("<owl:Class rdf:ID=\"fiord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("fiord")))), list(list(makeString("<owl:Class rdf:ID=\"Land\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land")))), list(list(makeString("<owl:Class rdf:ID=\"ArcticClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ArcticClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"SubtropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubtropicalClimateZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurfaceLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Fjord\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Mesopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesopause")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfGround\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfGround")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfSeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfSeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"WaterChannel\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterChannel")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"F-Region\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("F-Region")))), list(list(makeString("<owl:Class rdf:ID=\"Lake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lake")))), list(list(makeString("<owl:Class rdf:ID=\"Continent\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Continent")))), list(list(makeString("<owl:Class rdf:ID=\"FractureZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FractureZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CrustLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"DepthHoarLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DepthHoarLayer")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurface")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"Cave\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cave")))), list(list(makeString("<owl:Class rdf:ID=\"LowerAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Moho\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Moho")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Crust\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:Class rdf:ID=\"Stream\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stream")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"RiparianWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiparianWetland")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:range rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoreLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoreLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Polynya\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Polynya")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#IceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalPlain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalPlain")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<owl:Class rdf:ID=\"GeomorphologicalRegionType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Geosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterSurface")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#HydrosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundSurfaceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CaveEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CaveEcosystem")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalHill\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalHill")))), list(list(makeString("<owl:Class rdf:ID=\"RockyCoast\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockyCoast")))), list(list(makeString("<owl:Class rdf:ID=\"DesertClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DesertClimateZone")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Magnetosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Magnetosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Grassland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Grassland")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRidge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRidge")))), list(list(makeString("<owl:Class rdf:ID=\"Atmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"GeosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<rdfs:domain rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasGeomorphologicalType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasGeomorphologicalType")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"#Mesosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Land_WaterBoundary_2D\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land_WaterBoundary_2D")))), list(list(makeString("<owl:Class rdf:ID=\"Forest_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"AgriculturalLands\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AgriculturalLands")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasUpperBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryReferenceHeight")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Talik\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Talik")))), list(list(makeString("<owl:Class rdf:ID=\"Inlet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Inlet")))), list(list(makeString("<owl:Class rdf:ID=\"Desert_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Desert_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"InversionLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("InversionLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanCrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanCrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Shoal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoal")))), list(list(makeString("<owl:Class rdf:ID=\"Wetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LithosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LithosphereLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfGround\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfGround")))), list(list(makeString("<owl:Class rdf:about=\"#SubsurfaceRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SubsurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"IceSheet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceSheet")))), list(list(makeString("<owl:Class rdf:ID=\"Glacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Glacier")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Littoral\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Littoral")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#UndergroundWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"SkinLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SkinLayer")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_flowing\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_flowing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GlobalPlanetaryLayers\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GlobalPlanetaryLayers")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Savanna\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Savanna")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Basin\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRegion")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetEarth")))), list(list(makeString("<owl:Class rdf:ID=\"BoundaryLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BoundaryLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Crust\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Crust")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"ActiveLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ActiveLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<owl:Class rdf:ID=\"LandIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Wetland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Trench\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Trench")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#RegionProperty\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#RegionProperty")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"MantleLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MantleLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"River\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("River")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandWaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandWaterSurface")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandWaterObject\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"TopographicalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TopographicalRegion")))), list(list(makeString("<owl:Class rdf:about=\"#CoastalRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#CoastalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Stratopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratopause")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"DeepOcean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DeepOcean")))), list(list(makeString("<owl:Class rdf:ID=\"BorealForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BorealForest")))), list(list(makeString("<owl:Class rdf:ID=\"Nearshore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Nearshore")))), list(list(makeString("<owl:Class rdf:ID=\"GlobalPlanetaryLayers\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlobalPlanetaryLayers")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAir\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAir")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Cryosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LakeLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LakeLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Permafrost\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Permafrost")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_rigid\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_rigid")))), list(list(makeString("<owl:Class rdf:ID=\"CoastalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Ionosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Ionosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Island\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Exosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Exosphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Sky\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sky")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UpperMantle_flowing\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UpperMantle_flowing")))), list(list(makeString("<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Peatland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Peatland")))), list(list(makeString("<owl:Class rdf:about=\"#LandSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"MediterraneanClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MediterraneanClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Island\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandwaterRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandwaterRegion")))), list(list(makeString("<owl:Class rdf:about=\"#Stratosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"EarthRealm\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WetlandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WetlandRegion")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorWaterLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorWaterLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:Class rdf:ID=\"Halocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Halocline")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasUpperBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryHeight")))), list(list(makeString("<owl:Class rdf:ID=\"TerrestrialEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"SalineLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SalineLake")))), list(list(makeString("<owl:Class rdf:ID=\"WetlandRegion\" xmlns:rdf=\"http://rdf.com/\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WetlandRegion")), cons(makeString("xmlns:rdf"), makeString("http://rdf.com/")))), list(list(makeString("<owl:Class rdf:ID=\"CoreLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoreLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"UndergroundWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloor\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterObject\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"Pycnocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pycnocline")))), list(list(makeString("<rdfs:range rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfIce")))), list(list(makeString("<owl:Class rdf:ID=\"PermafrostZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PermafrostZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Atmosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:hasValue rdf:datatype=\'http://www.w3.org/2001/XMLSchema#boolean\'\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:Class rdf:ID=\"Z\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Z")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID= \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID = \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<rdf:RDF\n\nxmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n\nxmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n\n xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n\nxmlns     =\"http://reliant.teknowledge.com/DAML/SUMO.owl#\"\n\n>")), list(makeString("rdf:RDF"), cons(makeString("xmlns:rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("xmlns:rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")), cons(makeString("xmlns:owl"), makeString("http://www.w3.org/2002/07/owl#")), cons(makeString("xmlns"), makeString("http://reliant.teknowledge.com/DAML/SUMO.owl#")))) });
    }

    static private final SubLString $str_alt69$ = makeString("");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $xml_token_accumulator$ = makeSymbol("*XML-TOKEN-ACCUMULATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_xml_token_iterator_state$ = makeSymbol("*DTP-XML-TOKEN-ITERATOR-STATE*");

    /**
     * If non-NIL, throw an error whenever invalid XML is detected.
     *
     * @unknown validation is *not* exhaustive: DTDs are not checked, and in general only
    basic syntax errors are detected.
     */
    // defparameter
    @LispMethod(comment = "If non-NIL, throw an error whenever invalid XML is detected.\r\n\r\n@unknown validation is *not* exhaustive: DTDs are not checked, and in general only\r\nbasic syntax errors are detected.\ndefparameter")
    public static final SubLSymbol $require_valid_xmlP$ = makeSymbol("*REQUIRE-VALID-XML?*");

    public static final class $xml_token_mentions$BinaryFunction extends BinaryFunction {
        public $xml_token_mentions$BinaryFunction() {
            super(extractFunctionNamed("XML-TOKEN-MENTIONS"));
        }

        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return xml_token_mentions(arg1, arg2);
        }
    }

    public static final class $xml_token_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $xml_token_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("XML-TOKEN-ITERATOR-STATE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return xml_token_iterator_state_p(arg1);
        }
    }

    public static final class $xml_token_iterator_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$in_stream;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$scratch_stream;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$token_output_stream;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$entity_map;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$namespace_stack;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$validateP;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$resolve_entity_referencesP;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$resolve_namespacesP;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$on_deck_queue;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$in_stream = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$scratch_stream = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$token_output_stream = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$entity_map = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$namespace_stack = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$validateP = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$resolve_entity_referencesP = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$resolve_namespacesP = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.this.$on_deck_queue = value;
        }

        public SubLObject $in_stream = Lisp.NIL;

        public SubLObject $scratch_stream = Lisp.NIL;

        public SubLObject $token_output_stream = Lisp.NIL;

        public SubLObject $entity_map = Lisp.NIL;

        public SubLObject $namespace_stack = Lisp.NIL;

        public SubLObject $validateP = Lisp.NIL;

        public SubLObject $resolve_entity_referencesP = Lisp.NIL;

        public SubLObject $resolve_namespacesP = Lisp.NIL;

        public SubLObject $on_deck_queue = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_native.class, XML_TOKEN_ITERATOR_STATE, XML_TOKEN_ITERATOR_STATE_P, $list_alt103, $list_alt104, new String[]{ "$in_stream", "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue" }, $list_alt105, $list_alt106, PRINT_XML_TOKEN_ITERATOR_STATE);
    }

    // private web_utilities() {}
    @LispMethod(comment = "private web_utilities() {}")
    public static final SubLFile me = new web_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.web_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $http_default_accept_types$ = makeSymbol("*HTTP-DEFAULT-ACCEPT-TYPES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $decode_urls_during_http_read_request$ = makeSymbol("*DECODE-URLS-DURING-HTTP-READ-REQUEST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_alternate_uri_format_a_prefix$ = makeSymbol("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_alternate_uri_format_session_id_length$ = makeSymbol("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_possibly_redirect_to_portal_script$ = makeSymbol("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*");

    // deflexical
    /**
     * A-list that maps HTML Informational (1xx) status codes to the descriptive
     * explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    @LispMethod(comment = "A-list that maps HTML Informational (1xx) status codes to the descriptive\r\nexplanation given in RFC 2616 (HTTP/1.1 specification).\ndeflexical\nA-list that maps HTML Informational (1xx) status codes to the descriptive\nexplanation given in RFC 2616 (HTTP/1.1 specification).")
    private static final SubLSymbol $http_informational_codes$ = makeSymbol("*HTTP-INFORMATIONAL-CODES*");

    // deflexical
    /**
     * A-list that maps HTML Success (2xx) status codes to the descriptive
     * explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    @LispMethod(comment = "A-list that maps HTML Success (2xx) status codes to the descriptive\r\nexplanation given in RFC 2616 (HTTP/1.1 specification).\ndeflexical\nA-list that maps HTML Success (2xx) status codes to the descriptive\nexplanation given in RFC 2616 (HTTP/1.1 specification).")
    private static final SubLSymbol $http_success_codes$ = makeSymbol("*HTTP-SUCCESS-CODES*");

    // deflexical
    /**
     * A-list that maps HTML Redirection (3xx) status codes to the
     * deflexical-private explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    @LispMethod(comment = "A-list that maps HTML Redirection (3xx) status codes to the\r\ndeflexical-private explanation given in RFC 2616 (HTTP/1.1 specification).\nA-list that maps HTML Redirection (3xx) status codes to the\ndeflexical-private explanation given in RFC 2616 (HTTP/1.1 specification).")
    private static final SubLSymbol $http_redirection_codes$ = makeSymbol("*HTTP-REDIRECTION-CODES*");

    // deflexical
    /**
     * A-list that maps HTML client error (4xx) codes to the descriptive expectation
     * given in RFC 2616 (HTTP/1.1 specification).
     */
    @LispMethod(comment = "A-list that maps HTML client error (4xx) codes to the descriptive expectation\r\ngiven in RFC 2616 (HTTP/1.1 specification).\ndeflexical\nA-list that maps HTML client error (4xx) codes to the descriptive expectation\ngiven in RFC 2616 (HTTP/1.1 specification).")
    private static final SubLSymbol $http_client_error_codes$ = makeSymbol("*HTTP-CLIENT-ERROR-CODES*");

    // deflexical
    /**
     * A-list that maps HTTP error codes to the descriptive explanation given in RFC
     * 2616 (HTTP/1.1 specifcation).
     */
    @LispMethod(comment = "A-list that maps HTTP error codes to the descriptive explanation given in RFC\r\n2616 (HTTP/1.1 specifcation).\ndeflexical\nA-list that maps HTTP error codes to the descriptive explanation given in RFC\n2616 (HTTP/1.1 specifcation).")
    private static final SubLSymbol $http_server_error_codes$ = makeSymbol("*HTTP-SERVER-ERROR-CODES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_error_codes$ = makeSymbol("*HTTP-ERROR-CODES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_status_codes$ = makeSymbol("*HTTP-STATUS-CODES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_get_request_template_components$ = makeSymbol("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_get_request_template_order$ = makeSymbol("*HTTP-GET-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_post_default_content_type$ = makeSymbol("*HTTP-POST-DEFAULT-CONTENT-TYPE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_post_request_template_components$ = makeSymbol("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_post_request_template_order$ = makeSymbol("*HTTP-POST-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_put_default_content_type$ = makeSymbol("*HTTP-PUT-DEFAULT-CONTENT-TYPE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_put_request_template_components$ = makeSymbol("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_put_request_template_order$ = makeSymbol("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_delete_default_content_type$ = makeSymbol("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_delete_request_template_components$ = makeSymbol("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_delete_request_template_order$ = makeSymbol("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trace_http_send_post_requests$ = makeSymbol("*TRACE-HTTP-SEND-POST-REQUESTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trace_http_send_put_requests$ = makeSymbol("*TRACE-HTTP-SEND-PUT-REQUESTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trace_http_send_delete_requests$ = makeSymbol("*TRACE-HTTP-SEND-DELETE-REQUESTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_header_cookie_keyword$ = makeSymbol("*HTTP-HEADER-COOKIE-KEYWORD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_cookie_separation_charset$ = makeSymbol("*HTTP-COOKIE-SEPARATION-CHARSET*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $http_filtered_predefined_named_cookie_attributes$ = makeSymbol("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $official_uri_schemes$ = makeSymbol("*OFFICIAL-URI-SCHEMES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unofficial_uri_schemes$ = makeSymbol("*UNOFFICIAL-URI-SCHEMES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $valid_url_beginnings$ = makeSymbol("*VALID-URL-BEGINNINGS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $url_delimiters$ = makeSymbol("*URL-DELIMITERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_non_alphanumeric_url_chars$ = makeSymbol("*VALID-NON-ALPHANUMERIC-URL-CHARS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $soap_envelope_uri$ = makeSymbol("*SOAP-ENVELOPE-URI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cgi_host$ = makeSymbol("*CGI-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cgi_port$ = makeSymbol("*CGI-PORT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cgi_path$ = makeSymbol("*CGI-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $http_header_delimiter$ = makeSymbol("*HTTP-HEADER-DELIMITER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $http_header_field_delimiters$ = makeSymbol("*HTTP-HEADER-FIELD-DELIMITERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $alternate_servlet_container_port$ = makeSymbol("*ALTERNATE-SERVLET-CONTAINER-PORT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $alternate_servlet_container_host$ = makeSymbol("*ALTERNATE-SERVLET-CONTAINER-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $local_servlet_container_runningP$ = makeSymbol("*LOCAL-SERVLET-CONTAINER-RUNNING?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $webapp_manifest_path$ = makeSymbol("*WEBAPP-MANIFEST-PATH*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeString("text/plain"), makeString("text/html"));

    static private final SubLList $list1 = list(list(new SubLObject[]{ makeSymbol("CHANNEL"), makeSymbol("MACHINE"), makeSymbol("URL"), makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")), list(makeSymbol("CONTENT-TYPE"), makeKeyword("DEFAULT")), makeSymbol("SOAP-ACTION-URI") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(new SubLObject[]{ makeKeyword("QUERY"), makeKeyword("METHOD"), $PORT, makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $kw9$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw10$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLSymbol $sym15$REAL_PORT = makeUninternedSymbol("REAL-PORT");

    private static final SubLList $list18 = list(makeKeyword("DEFAULT"));

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol SEND_HTTP_REQUEST = makeSymbol("SEND-HTTP-REQUEST");

    private static final SubLString $str27$_a_ = makeString("/a/");

    private static final SubLSymbol $html_cyc_login_session_string_to_remote_host$ = makeSymbol("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*");

    private static final SubLString $str29$_ = makeString("/");

    private static final SubLString $str30$_cg_ = makeString("/cg?");

    private static final SubLList $list31 = list(CHAR_slash);

    private static final SubLString $str32$Remote_Host = makeString("Remote-Host");

    private static final SubLString $str33$var_KEA_port_from_cyc_base_port__ = makeString("var KEA_port_from_cyc_base_port = function () {\n  var DEFAULT_PORT_STR = \"80\";\n  var portStr = (window.document.location.port.length > 0) ? window.document.location.port : DEFAULT_PORT_STR;\n  var offset = parseInt(portStr.substring(portStr.length - 1));\n  var port = parseInt(portStr);\n\n  if (offset == 2) return (port + 1);\n  return port;\n}\nif (window==window.top) {\n  var url = \"http://\" + window.document.location.hostname + \":\" + KEA_port_from_cyc_base_port() + \"/?toolURL=\" + encodeURIComponent(window.location.href) + \"&sessionId=~A\";\n  window.location.href=url;\n}");

    static private final SubLList $list34 = list(cons(makeInteger(100), makeString("Continue")), cons(makeInteger(101), makeString("Switching Protocols")));

    private static final SubLList $list35 = list(cons(makeInteger(200), makeString("OK")), cons(makeInteger(201), makeString("Created")), cons(makeInteger(202), makeString("Accepted")), cons(makeInteger(203), makeString("Non-Authoritative Information")), cons(makeInteger(204), makeString("No Content")), cons(makeInteger(205), makeString("Reset Content")), cons(makeInteger(206), makeString("Partial Content")));

    static private final SubLList $list36 = list(cons(makeInteger(300), makeString("Multiple Choices")), cons(makeInteger(301), makeString("Moved Permanently")), cons(makeInteger(302), makeString("Found")), cons(makeInteger(303), makeString("See Other")), cons(makeInteger(304), makeString("Not Modified")), cons(makeInteger(305), makeString("Use Proxy")), cons(makeInteger(306), makeString("(Unused)")), cons(makeInteger(307), makeString("Temporary Redirect")));

    static private final SubLList $list37 = list(new SubLObject[]{ cons(makeInteger(400), makeString("Bad Request")), cons(makeInteger(401), makeString("Unauthorized")), cons(makeInteger(403), makeString("Forbidden")), cons(makeInteger(404), makeString("Not Found")), cons(makeInteger(405), makeString("Method Not Allowed")), cons(makeInteger(406), makeString("Not Acceptable")), cons(makeInteger(407), makeString("Proxy Authentication Required")), cons(makeInteger(408), makeString("Request Timeout")), cons(makeInteger(409), makeString("Conflict")), cons(makeInteger(410), makeString("Gone")), cons(makeInteger(411), makeString("Length Required")), cons(makeInteger(412), makeString("Precondition Failed")), cons(makeInteger(413), makeString("Request Entity Too Large")), cons(makeInteger(414), makeString("Request-URI Too Long")), cons(makeInteger(415), makeString("Unsupported Media Type")), cons(makeInteger(416), makeString("Requested Range Not Satisfiable")), cons(makeInteger(417), makeString("Expectation Failed")) });

    private static final SubLList $list38 = list(cons(makeInteger(500), makeString("Internal Server Error")), cons(makeInteger(501), makeString("Not Implemented")), cons(makeInteger(502), makeString("Bad Gateway")), cons(makeInteger(503), makeString("Service Unavailable")), cons(makeInteger(504), makeString("Gateway Timeout")), cons(makeInteger(505), makeString("HTTP Version not supported")));

    private static final SubLString $str39$HTTP_1_1_200_OK = makeString("HTTP/1.1 200 OK");

    private static final SubLString $str40$HTTP_1_1_ = makeString("HTTP/1.1 ");

    private static final SubLList $list41 = list(list(makeKeyword("VERSION"), makeString("GET ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("BLANK-LINE"), NIL));

    private static final SubLString $str43$application_x_www_form_urlencoded = makeString("application/x-www-form-urlencoded");

    static private final SubLList $list44 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("POST ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    private static final SubLList $list45 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("PUT ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    static private final SubLList $list46 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("DELETE ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    private static final SubLList $list48 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("MACHINE"), list(makeSymbol("PORT"), makeInteger(80)), list(makeSymbol("METHOD"), makeKeyword("GET")), makeSymbol("URL"), makeSymbol("QUERY"), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")), list(makeSymbol("CONTENT-TYPE"), makeKeyword("DEFAULT")), list(makeSymbol("SOAP-ACTION-URI"), NIL) });

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("MACHINE"), $PORT, makeKeyword("METHOD"), makeKeyword("URL"), makeKeyword("QUERY"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });

    private static final SubLString $str57$Unsupported_HTTP_request_method__ = makeString("Unsupported HTTP request method : ~S");

    private static final SubLList $list58 = list(makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")));

    private static final SubLList $list59 = list(makeKeyword("QUERY"), makeKeyword("METHOD"), $PORT, makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"));

    private static final SubLList $list60 = list(list(makeSymbol("COOKIE-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $http_cookies_to_include_in_requests$ = makeSymbol("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*");

    private static final SubLList $list62 = list(makeSymbol("ACTION"), makeSymbol("FORMAT-STRING"));

    private static final SubLString $str66$Keep_Alive___S = makeString("Keep-Alive: ~S");

    private static final SubLString $str67$keep_alive = makeString("keep-alive");

    private static final SubLString $$$close = makeString("close");

    private static final SubLString $str71$_ = makeString(":");

    private static final SubLString $str76$__ = makeString(", ");

    private static final SubLString $str77$_ = makeString("?");

    private static final SubLString $str78$Date__ = makeString("Date: ");

    private static final SubLString $str79$Server__Cyc_ = makeString("Server: Cyc/");

    private static final SubLString $str80$__ = makeString(": ");

    private static final SubLString $str81$Set_Cookie_ = makeString("Set-Cookie:");

    private static final SubLSymbol $sym82$CHAR_ = makeSymbol("CHAR=");

    private static final SubLString $$$domain = makeString("domain");

    private static final SubLString $$$expires = makeString("expires");

    private static final SubLString $str85$max_age = makeString("max-age");

    private static final SubLString $str86$ = makeString("");

    private static final SubLString $str87$__ = makeString(" $");

    private static final SubLSymbol TRIM_WHITESPACE = makeSymbol("TRIM-WHITESPACE");

    private static final SubLSymbol HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS = makeSymbol("HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS");

    private static final SubLSymbol HTML_URL_EXPAND_CHAR = makeSymbol("HTML-URL-EXPAND-CHAR");

    private static final SubLString $str92$____ = makeString("-_.=");

    private static final SubLString $str94$_S = makeString("~S");

    private static final SubLString $str95$mailto_ = makeString("mailto:");

    private static final SubLList $list96 = list(makeString(":"), makeString("/"));

    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    static private final SubLList $list98 = list(new SubLObject[]{ makeString("aaa:"), makeString("aaas:"), makeString("acap:"), makeString("cap:"), makeString("cid:"), makeString("crid:"), makeString("data:"), makeString("dav:"), makeString("dict:"), makeString("dns:"), makeString("fax:"), makeString("file:"), makeString("ftp:"), makeString("go:"), makeString("gopher:"), makeString("h323:"), makeString("http:"), makeString("https:"), makeString("im"), makeString("imap:"), makeString("ldap:"), makeString("mailto:"), makeString("mid:"), makeString("news:"), makeString("nfs:"), makeString("nntp:"), makeString("pop:"), makeString("pres:"), makeString("sip:"), makeString("sips:"), makeString("snmp:"), makeString("tel:"), makeString("telnet:"), makeString("urn:"), makeString("wais:"), makeString("xmpp:") });

    private static final SubLList $list99 = list(new SubLObject[]{ makeString("about:"), makeString("aim:"), makeString("callto:"), makeString("cvs:"), makeString("ed2k:"), makeString("feed:"), makeString("fish:"), makeString("gizmoproject:"), makeString("iax2:"), makeString("irc:"), makeString("ircs:"), makeString("lastfm:"), makeString("ldaps:"), makeString("magnet:"), makeString("mms:"), makeString("msnim:"), makeString("nsfw:"), makeString("psyc:"), makeString("rsync:"), makeString("secondlife:"), makeString("skype:"), makeString("ssh:"), makeString("sftp:"), makeString("smb:"), makeString("sms:"), makeString("soldat:"), makeString("steam:"), makeString("tag:"), makeString("unreal:"), makeString("ut2004:"), makeString("webcal:"), makeString("xfire:"), makeString("ymsgr:") });

    private static final SubLList $list100 = list(makeString("http://"), makeString("https://"), makeString("ftp://"), makeString("gopher://"), makeString("file:"), makeString("news:"), makeString("mailto:"), makeString("anon:"));

    private static final SubLList $list101 = list(CHAR_space, CHAR_period, CHAR_comma, CHAR_question, CHAR_exclamation, CHAR_rparen);

    private static final SubLSymbol VALID_URL_CHAR_P = makeSymbol("VALID-URL-CHAR-P");

    private static final SubLString $str103$_____________________ = makeString(";@?%/:=$-_.+!*'(),#&~");

    private static final SubLString $str104$___ = makeString("../");

    private static final SubLString $str105$__ = makeString("//");

    private static final SubLSymbol RESOLVE_RELATIVE_URI = makeSymbol("RESOLVE-RELATIVE-URI");

    private static final SubLList $list113 = list(new SubLObject[]{ list(list(makeString("http://example.org"), makeString("relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org#"), makeString("prop")), makeString("http://example.org#prop")), list(list(makeString("http://example.org/"), makeString("named")), makeString("http://example.org/named")), list(list(makeString("http://example.org/#"), makeString("owes")), makeString("http://example.org/#owes")), list(list(makeString("http://example.org/dir/file"), makeString("relfile")), makeString("http://example.org/dir/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("../relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("/absfile")), makeString("http://example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("//another.example.org/absfile")), makeString("http://another.example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("#foo")), makeString("http://example.org/dir/file#foo")), list(list(makeString("http://example.org/dir/file"), makeString("")), makeString("http://example.org/dir/file")), list(list(makeString("http://foo/"), makeString("Bar")), makeString("http://foo/Bar")), list(list(makeString("http://my.example.org/"), makeString("Name")), makeString("http://my.example.org/Name")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Creator")), makeString("http://purl.org/metadata/dublin_core#Creator")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Title")), makeString("http://purl.org/metadata/dublin_core#Title")), list(list(makeString("http://random.ioctl.org/#"), makeString("prop2")), makeString("http://random.ioctl.org/#prop2")), list(list(makeString("http://random.ioctl.org/#"), makeString("someProperty")), makeString("http://random.ioctl.org/#someProperty")), list(list(makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), makeString("_2")), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), makeString("Manifest.rdf")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), makeString("premises005.rdf#B")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), makeString("#frag")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag")) });

    private static final SubLString $str114$http___schemas_xmlsoap_org_soap_e = makeString("http://schemas.xmlsoap.org/soap/envelope/");

    private static final SubLSymbol SOAP_NAME = makeSymbol("SOAP-NAME");

    private static final SubLString $str116$soap_ = makeString("soap:");

    private static final SubLSymbol $soap_name_caching_state$ = makeSymbol("*SOAP-NAME-CACHING-STATE*");

    private static final SubLSymbol SOAP_EXPANDED_NAME = makeSymbol("SOAP-EXPANDED-NAME");

    private static final SubLSymbol $soap_expanded_name_caching_state$ = makeSymbol("*SOAP-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLString $$$Envelope = makeString("Envelope");

    private static final SubLSymbol PERFORM_SOAP_POST_CACHED = makeSymbol("PERFORM-SOAP-POST-CACHED");

    private static final SubLSymbol $perform_soap_post_cached_caching_state$ = makeSymbol("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*");

    private static final SubLString $str123$text_xml__charset_utf_8 = makeString("text/xml; charset=utf-8");

    private static final SubLString $str124$US_ASCII = makeString("US-ASCII");

    private static final SubLString $str125$xmlns_soap = makeString("xmlns:soap");

    private static final SubLString $$$Header = makeString("Header");

    private static final SubLList $list127 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLString $$$Body = makeString("Body");

    private static final SubLList $list130 = list(CHAR_space, CHAR_slash);

    private static final SubLString $$$HTTP = makeString("HTTP");

    private static final SubLString $str132$Location__ = makeString("Location: ");

    private static final SubLString $str134$http___ = makeString("http://");

    private static final SubLString $str135$https___ = makeString("https://");

    private static final SubLList $list137 = list(makeSymbol("MSG"), makeSymbol("EXP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list138 = list(NIL);

    private static final SubLString $str141$_____Averted__connection_reset_by = makeString("~&>> Averted 'connection reset by peer' error !!");

    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $$$_GMT = makeString(" GMT");

    static private final SubLList $list144 = list(makeSymbol("PATTERN"), makeSymbol("LIST"));

    private static final SubLList $list146 = list(list(makeSymbol("FUNCTION"), makeSymbol("SEARCH")));

    private static final SubLList $list147 = list(makeSymbol("LIST"));

    private static final SubLSymbol HTML_TOKENS_FAST_FORWARD = makeSymbol("HTML-TOKENS-FAST-FORWARD");

    private static final SubLList $list152 = list(makeSymbol("TOKENS"), makeSymbol("TAG"));

    private static final SubLSymbol $sym153$MARKER = makeUninternedSymbol("MARKER");

    private static final SubLSymbol HTML_TOKENS_EXTRACT_CURR = makeSymbol("HTML-TOKENS-EXTRACT-CURR");

    private static final SubLString $str158$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");

    private static final SubLSymbol HTML_TOKENS_STEP = makeSymbol("HTML-TOKENS-STEP");

    private static final SubLSymbol $sym160$MARKER = makeUninternedSymbol("MARKER");

    private static final SubLSymbol $sym161$IS_HTML_TERMINATING_TAG_ = makeSymbol("IS-HTML-TERMINATING-TAG?");

    private static final SubLString $str162$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");

    private static final SubLList $list163 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"));

    private static final SubLSymbol HTML_CONSUME_STARTING_TAG = makeSymbol("HTML-CONSUME-STARTING-TAG");

    private static final SubLSymbol HTML_CONSUME_CLOSING_TAG = makeSymbol("HTML-CONSUME-CLOSING-TAG");

    private static final SubLList $list167 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    private static final SubLSymbol $sym168$TEMP = makeUninternedSymbol("TEMP");

    private static final SubLSymbol $sym170$TEST_FOR_HTML_TAG_ = makeSymbol("TEST-FOR-HTML-TAG?");

    private static final SubLSymbol HTML_EXTRACT_TAG_CONTENT = makeSymbol("HTML-EXTRACT-TAG-CONTENT");

    private static final SubLString $str173$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str175$_ = makeString("&");

    private static final SubLString $str176$_ = makeString("=");

    private static final SubLList $list178 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym179$MATCHING_OPEN_TAG_ = makeSymbol("MATCHING-OPEN-TAG?");

    private static final SubLList $list180 = list(list(list(makeString("tag"), makeString("<tag>")), T), list(list(makeString("tag"), makeString("</tag>")), NIL), list(list(makeString("tag"), makeString("<TAG>")), NIL), list(list(makeString("tag"), makeString("<TAG>"), EQUALP), T));

    private static final SubLSymbol $sym181$MATCHING_CLOSE_TAG_ = makeSymbol("MATCHING-CLOSE-TAG?");

    static private final SubLList $list182 = list(list(list(makeString("tag"), makeString("<tag>")), NIL), list(list(makeString("tag"), makeString("</tag>")), T), list(list(makeString("tag"), makeString("</TAG>")), NIL), list(list(makeString("tag"), makeString("</TAG>"), EQUALP), T));

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLString $str184$_cgi_bin_services = makeString("/cgi-bin/services");

    private static final SubLSymbol BYTE_ORDER_MARK = makeSymbol("BYTE-ORDER-MARK");

    private static final SubLString $str186$_ufeff_ = makeString("&ufeff;");

    private static final SubLSymbol $byte_order_mark_caching_state$ = makeSymbol("*BYTE-ORDER-MARK-CACHING-STATE*");

    private static final SubLString $str188$___A__A_____ = makeString("~{~A=~A~^&~}");

    private static final SubLSymbol HTML_ENCODE_SEXPR = makeSymbol("HTML-ENCODE-SEXPR");

    private static final SubLList $list191 = list(makeString("text/html"), makeString("*/*"));

    private static final SubLString $str192$file___ = makeString("file://");

    private static final SubLSymbol $sym193$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    private static final SubLSymbol START_SERVLET_CONTAINER_INT = makeSymbol("START-SERVLET-CONTAINER-INT");

    private static final SubLSymbol $sym196$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol START_SERVLET_CONTAINER = makeSymbol("START-SERVLET-CONTAINER");

    private static final SubLList $list199 = list(makeKeyword("EXTERNAL"), makeSymbol("START-SERVLET-CONTAINER"));

    private static final SubLSymbol STOP_SERVLET_CONTAINER_INT = makeSymbol("STOP-SERVLET-CONTAINER-INT");

    private static final SubLString $str202$cyc_servlet_container_tmp_dir_ = makeString("cyc-servlet-container-tmp-dir-");

    private static final SubLString $str203$_ = makeString("-");

    private static final SubLString $str204$webapps_apps_webapp_manifest_xml = makeString("webapps/apps/webapp-manifest.xml");

    private static final SubLString $$$filename = makeString("filename");

    private static final SubLString $$$contextRoot = makeString("contextRoot");

    private static final SubLString $$$webapp = makeString("webapp");

    private static final SubLString $str208$Unable_to_find_webapp_manifest_fi = makeString("Unable to find webapp manifest file at ~S");

    /**
     * Establish an HTTP request to PORT of MACHINE.
     * PORT defaults to TCP port 80, the default HTTP port.
     * The request METHOD defaults to :GET, and must be either :GET or :POST.
     * URL is a string representing the URL of the request.
     * QUERY, if present, is a string representing the query portion of the request.
     * CHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.
     * KEEP-ALIVE? regulates whether this is a one-shot connection or not
     * WIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline
     * TIMEOUT, if non-nil, is a numeric connection timeout in seconds.
     */
    @LispMethod(comment = "Establish an HTTP request to PORT of MACHINE.\r\nPORT defaults to TCP port 80, the default HTTP port.\r\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\r\nURL is a string representing the URL of the request.\r\nQUERY, if present, is a string representing the query portion of the request.\r\nCHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.\r\nKEEP-ALIVE? regulates whether this is a one-shot connection or not\r\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline\r\nTIMEOUT, if non-nil, is a numeric connection timeout in seconds.\nEstablish an HTTP request to PORT of MACHINE.\nPORT defaults to TCP port 80, the default HTTP port.\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\nURL is a string representing the URL of the request.\nQUERY, if present, is a string representing the query portion of the request.\nCHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.\nKEEP-ALIVE? regulates whether this is a one-shot connection or not\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline\nTIMEOUT, if non-nil, is a numeric connection timeout in seconds.")
    public static final SubLObject with_http_request_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject channel = NIL;
                    SubLObject machine = NIL;
                    SubLObject url = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    channel = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    machine = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    url = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt1);
                        }
                        {
                            SubLObject query_tail = property_list_member($QUERY, current);
                            SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                            SubLObject method_tail = property_list_member($METHOD, current);
                            SubLObject method = (NIL != method_tail) ? ((SubLObject) (cadr(method_tail))) : $GET;
                            SubLObject port_tail = property_list_member($PORT, current);
                            SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $DEFAULT;
                            SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
                            SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? ((SubLObject) (cadr(keep_aliveP_tail))) : T;
                            SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
                            SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? ((SubLObject) (cadr(wide_newlinesP_tail))) : NIL;
                            SubLObject timeout_tail = property_list_member($TIMEOUT, current);
                            SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : NIL;
                            SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
                            SubLObject accept_types = (NIL != accept_types_tail) ? ((SubLObject) (cadr(accept_types_tail))) : $DEFAULT;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject real_port = $sym13$REAL_PORT;
                                return list(CLET, list(list(real_port, list(FIF, listS(EQL, port, $list_alt16), $int$80, port))), listS(WITH_TCP_CONNECTION, list(channel, machine, real_port, $ACCESS_MODE, $PRIVATE, $TIMEOUT, timeout), list(SEND_HTTP_REQUEST, channel, list(new SubLObject[]{ LIST, $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types })), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Establish an HTTP request to PORT of MACHINE.
     * PORT defaults to TCP port 80, the default HTTP port.
     * The request METHOD defaults to :GET, and must be either :GET or :POST.
     * URL is a string representing the URL of the request.
     * QUERY, if present, is a string representing the query portion of the request.
     * CHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.
     * KEEP-ALIVE? regulates whether this is a one-shot connection or not
     * WIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline
     * TIMEOUT, if non-nil, is a numeric connection timeout in seconds.
     */
    @LispMethod(comment = "Establish an HTTP request to PORT of MACHINE.\r\nPORT defaults to TCP port 80, the default HTTP port.\r\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\r\nURL is a string representing the URL of the request.\r\nQUERY, if present, is a string representing the query portion of the request.\r\nCHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.\r\nKEEP-ALIVE? regulates whether this is a one-shot connection or not\r\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline\r\nTIMEOUT, if non-nil, is a numeric connection timeout in seconds.\nEstablish an HTTP request to PORT of MACHINE.\nPORT defaults to TCP port 80, the default HTTP port.\nThe request METHOD defaults to :GET, and must be either :GET or :POST.\nURL is a string representing the URL of the request.\nQUERY, if present, is a string representing the query portion of the request.\nCHANNEL is a bi-directional stream variable introduced and bound to the stream of HTML returning from the request.\nKEEP-ALIVE? regulates whether this is a one-shot connection or not\nWIDE-NEWLINES? regulates whether NETWORK-TERPRI or TERPRI is used to send the newline\nTIMEOUT, if non-nil, is a numeric connection timeout in seconds.")
    public static SubLObject with_http_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = NIL;
        SubLObject machine = NIL;
        SubLObject url = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        channel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        machine = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        url = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject query_tail = property_list_member($QUERY, current);
        final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
        final SubLObject method_tail = property_list_member($METHOD, current);
        final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $DEFAULT;
        final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
        final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
        final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
        final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : NIL;
        final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
        final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
        final SubLObject content_type_tail = property_list_member($CONTENT_TYPE, current);
        final SubLObject content_type = (NIL != content_type_tail) ? cadr(content_type_tail) : $DEFAULT;
        final SubLObject soap_action_uri_tail = property_list_member($SOAP_ACTION_URI, current);
        final SubLObject soap_action_uri = (NIL != soap_action_uri_tail) ? cadr(soap_action_uri_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject real_port = $sym15$REAL_PORT;
        return list(CLET, list(list(real_port, list(FIF, listS(EQL, port, $list18), $int$80, port))), listS(WITH_TCP_CONNECTION, list(channel, machine, real_port, $ACCESS_MODE, $PRIVATE, $TIMEOUT, timeout), list(SEND_HTTP_REQUEST, channel, list(new SubLObject[]{ LIST, $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types, $CONTENT_TYPE, content_type, $SOAP_ACTION_URI, soap_action_uri })), append(body, NIL)));
    }

    /**
     *
     *
     * @param instream;
     * 		A stream over which to read an HTTP request
     * @param parse-header;
     * 		If T, then the response header is parsed
     * 		and returned as an a-list.
     * @return 0 string; The URL requested from the client.
    NIL on error.
     * @return 1 string; The request method
     * @return 2 string; HTTP version of the request
     * @return 3 alist; Association list containing the information
    in the request header.  Keys are header files, values the
    values.  (This will be NIL if PARSE-HEADER is NIL.)
     * @unknown Does not current accept mutiple header lines of the same
    type.  (If the header field allows comma-separated values,
    they are supposed to be concatenated together.)
     * @unknown sutton
     */
    @LispMethod(comment = "@param instream;\r\n\t\tA stream over which to read an HTTP request\r\n@param parse-header;\r\n\t\tIf T, then the response header is parsed\r\n\t\tand returned as an a-list.\r\n@return 0 string; The URL requested from the client.\r\nNIL on error.\r\n@return 1 string; The request method\r\n@return 2 string; HTTP version of the request\r\n@return 3 alist; Association list containing the information\r\nin the request header.  Keys are header files, values the\r\nvalues.  (This will be NIL if PARSE-HEADER is NIL.)\r\n@unknown Does not current accept mutiple header lines of the same\r\ntype.  (If the header field allows comma-separated values,\r\nthey are supposed to be concatenated together.)\r\n@unknown sutton")
    public static final SubLObject http_read_request_alt(SubLObject instream, SubLObject parse_header) {
        if (parse_header == UNPROVIDED) {
            parse_header = NIL;
        }
        {
            SubLObject request_header = NIL;
            SubLObject done = NIL;
            SubLObject method = NIL;
            SubLObject version = NIL;
            SubLObject uri = NIL;
            SubLObject line = NIL;
            line = string_utilities.network_read_line(instream, UNPROVIDED, UNPROVIDED);
            if (NIL == line) {
                return NIL;
            }
            {
                SubLObject first_space = position(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject last_space = list_utilities.position_from_end(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (first_space.eql(last_space)) {
                    last_space = NIL;
                }
                if (NIL != first_space) {
                    method = string_utilities.substring(line, ZERO_INTEGER, first_space);
                    uri = com.cyc.cycjava.cycl.web_utilities.html_url_decode(string_utilities.substring(line, number_utilities.f_1X(first_space), last_space));
                    if (NIL != last_space) {
                        version = string_utilities.substring(line, number_utilities.f_1X(last_space), UNPROVIDED);
                    }
                }
            }
            if (NIL != parse_header) {
                while (NIL == done) {
                    line = string_utilities.network_read_line(instream, UNPROVIDED, UNPROVIDED);
                    if (line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        done = T;
                    } else {
                        if ((Strings.sublisp_char(line, ZERO_INTEGER) == CHAR_space) || (Strings.sublisp_char(line, ZERO_INTEGER) == CHAR_tab)) {
                            if (NIL != request_header) {
                                {
                                    SubLObject old_field = request_header.first();
                                    rplacd(old_field, cconcatenate(old_field.rest(), line));
                                }
                            }
                        } else {
                            {
                                SubLObject colon = position(CHAR_colon, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != colon) {
                                    request_header = cons(cons(string_utilities.substring(line, ZERO_INTEGER, subtract(colon, ZERO_INTEGER)), string_utilities.trim_whitespace(string_utilities.substring(line, add(colon, ONE_INTEGER), UNPROVIDED))), request_header);
                                }
                            }
                        }
                    }
                } 
            } else {
                while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                    line = string_utilities.network_read_line(instream, UNPROVIDED, UNPROVIDED);
                } 
            }
            return values(method, uri, version, request_header);
        }
    }

    /**
     *
     *
     * @param instream;
     * 		A stream over which to read an HTTP request
     * @param parse-header;
     * 		If T, then the response header is parsed
     * 		and returned as an a-list.
     * @return 0 string; The URL requested from the client.
    NIL on error.
     * @return 1 string; The request method
     * @return 2 string; HTTP version of the request
     * @return 3 alist; Association list containing the information
    in the request header.  Keys are header files, values the
    values.  (This will be NIL if PARSE-HEADER is NIL.)
     * @unknown Does not current accept mutiple header lines of the same
    type.  (If the header field allows comma-separated values,
    they are supposed to be concatenated together.)
     * @unknown sutton
     */
    @LispMethod(comment = "@param instream;\r\n\t\tA stream over which to read an HTTP request\r\n@param parse-header;\r\n\t\tIf T, then the response header is parsed\r\n\t\tand returned as an a-list.\r\n@return 0 string; The URL requested from the client.\r\nNIL on error.\r\n@return 1 string; The request method\r\n@return 2 string; HTTP version of the request\r\n@return 3 alist; Association list containing the information\r\nin the request header.  Keys are header files, values the\r\nvalues.  (This will be NIL if PARSE-HEADER is NIL.)\r\n@unknown Does not current accept mutiple header lines of the same\r\ntype.  (If the header field allows comma-separated values,\r\nthey are supposed to be concatenated together.)\r\n@unknown sutton")
    public static SubLObject http_read_request(final SubLObject instream, SubLObject parse_header) {
        if (parse_header == UNPROVIDED) {
            parse_header = NIL;
        }
        SubLObject request_header = NIL;
        SubLObject done = NIL;
        SubLObject method = NIL;
        SubLObject version = NIL;
        SubLObject uri = NIL;
        SubLObject line = NIL;
        line = string_utilities.network_read_line(instream, NIL, NIL, UNPROVIDED);
        if (NIL == line) {
            return NIL;
        }
        final SubLObject first_space = position(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject last_space = list_utilities.position_from_end(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (first_space.eql(last_space)) {
            last_space = NIL;
        }
        if (NIL != first_space) {
            method = string_utilities.substring(line, ZERO_INTEGER, first_space);
            uri = (NIL != $decode_urls_during_http_read_request$.getGlobalValue()) ? html_url_decode(string_utilities.substring(line, number_utilities.f_1X(first_space), last_space)) : string_utilities.substring(line, number_utilities.f_1X(first_space), last_space);
            if (NIL != last_space) {
                version = string_utilities.substring(line, number_utilities.f_1X(last_space), UNPROVIDED);
            }
        }
        if (NIL != parse_header) {
            while (NIL == done) {
                line = string_utilities.network_read_line(instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                if (line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                    done = T;
                } else
                    if (Strings.sublisp_char(line, ZERO_INTEGER).eql(CHAR_space) || Strings.sublisp_char(line, ZERO_INTEGER).eql(CHAR_tab)) {
                        if (NIL == request_header) {
                            continue;
                        }
                        final SubLObject old_field = request_header.first();
                        rplacd(old_field, cconcatenate(old_field.rest(), line));
                    } else {
                        final SubLObject colon = position(CHAR_colon, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == colon) {
                            continue;
                        }
                        request_header = cons(cons(string_utilities.substring(line, ZERO_INTEGER, subtract(colon, ZERO_INTEGER)), string_utilities.trim_whitespace(string_utilities.substring(line, add(colon, ONE_INTEGER), UNPROVIDED))), request_header);
                    }

            } 
        } else {
            while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                line = string_utilities.network_read_line(instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
            } 
        }
        return http_possibly_repack_request(method, uri, version, request_header);
    }

    public static SubLObject make_html_cyc_login_session() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_id = string_utilities.random_string($html_alternate_uri_format_session_id_length$.getGlobalValue());
        dictionary.dictionary_enter($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, html_kernel.$http_remote_host$.getDynamicValue(thread));
        return session_id;
    }

    public static SubLObject destroy_cyc_login_session(final SubLObject session_id) {
        return dictionary.dictionary_remove($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id);
    }

    public static SubLObject cyc_login_session_id_machine_name(final SubLObject session_id) {
        return dictionary.dictionary_lookup_without_values($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, UNPROVIDED);
    }

    public static SubLObject valid_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return makeBoolean(((possible_session_string.isString() && (NIL != list_utilities.lengthE(possible_session_string, $html_alternate_uri_format_session_id_length$.getGlobalValue(), UNPROVIDED))) && (NIL != string_utilities.alphabetic_stringP(possible_session_string))) && (NIL != string_utilities.lower_case_string_p(possible_session_string)));
    }

    public static SubLObject current_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return dictionary.dictionary_lookup_without_values($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), possible_session_string, UNPROVIDED);
    }

    public static SubLObject http_possibly_repack_request(final SubLObject method, SubLObject uri, final SubLObject version, SubLObject request_header) {
        if (NIL != string_utilities.starts_with(uri, $http_alternate_uri_format_a_prefix$.getGlobalValue())) {
            uri = string_utilities.string_substitute($str29$_, $str30$_cg_, uri, UNPROVIDED);
            final SubLObject q_pos = position(CHAR_question, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject a_pos = position(CHAR_ampersand, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != q_pos) && ((NIL == a_pos) || (!a_pos.numL(q_pos)))) {
                set_aref(uri, q_pos, CHAR_ampersand);
            }
            SubLObject uri_parts = cddr(string_utilities.string_tokenize(uri, $list31, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject session_string = NIL;
            SubLObject new_uri = NIL;
            if (NIL != current_html_cyc_login_session_idP(uri_parts.first())) {
                session_string = uri_parts.first();
                request_header = list_utilities.alist_enter(request_header, $str32$Remote_Host, session_string, symbol_function(EQUAL));
                uri_parts = uri_parts.rest();
            }
            new_uri = cconcatenate(http_kernel.$http_cgi_bin_directory$.getGlobalValue(), new SubLObject[]{ $str29$_, string_utilities.bunge(uri_parts, CHAR_slash) });
            return values(method, new_uri, version, request_header);
        }
        return values(method, uri, version, request_header);
    }

    public static SubLObject within_html_cyc_login_sessionP() {
        return valid_html_cyc_login_session_idP(html_kernel.http_state_key_for_request());
    }

    public static SubLObject possibly_add_html_javascript_redirect_when_top_level_page() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != within_html_cyc_login_sessionP()) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_possibly_redirect_to_portal_script$.getGlobalValue(), html_kernel.http_state_key_for_request());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @param outstream
     * 		A stream over which to send an HTTP response
     * @param header-fields
     * 		An alist where keys specify names of
     * 		header fields and values their values.  These header
     * 		fields will be included in the response.
     * @return NIL
     */
    @LispMethod(comment = "@param outstream\r\n\t\tA stream over which to send an HTTP response\r\n@param header-fields\r\n\t\tAn alist where keys specify names of\r\n\t\theader fields and values their values.  These header\r\n\t\tfields will be included in the response.\r\n@return NIL")
    public static final SubLObject http_send_ok_response_alt(SubLObject outstream, SubLObject header_fields) {
        write_string($str_alt30$HTTP_1_1_200_OK, outstream, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
        com.cyc.cycjava.cycl.web_utilities.http_send_response_header(outstream, header_fields);
        return NIL;
    }

    /**
     *
     *
     * @param outstream
     * 		A stream over which to send an HTTP response
     * @param header-fields
     * 		An alist where keys specify names of
     * 		header fields and values their values.  These header
     * 		fields will be included in the response.
     * @return NIL
     */
    @LispMethod(comment = "@param outstream\r\n\t\tA stream over which to send an HTTP response\r\n@param header-fields\r\n\t\tAn alist where keys specify names of\r\n\t\theader fields and values their values.  These header\r\n\t\tfields will be included in the response.\r\n@return NIL")
    public static SubLObject http_send_ok_response(final SubLObject outstream, final SubLObject header_fields) {
        write_string($str39$HTTP_1_1_200_OK, outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return NIL;
    }

    public static final SubLObject http_send_error_response_alt(SubLObject outstream, SubLObject error_code, SubLObject header_fields) {
        write_string($str_alt31$HTTP_1_1_, outstream, UNPROVIDED, UNPROVIDED);
        princ(error_code, outstream);
        write_char(CHAR_space, outstream);
        write_string(assoc(error_code, $http_error_codes$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest(), outstream, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
        com.cyc.cycjava.cycl.web_utilities.http_send_response_header(outstream, header_fields);
        return NIL;
    }

    public static SubLObject http_send_error_response(final SubLObject outstream, final SubLObject error_code, final SubLObject header_fields) {
        write_string($str40$HTTP_1_1_, outstream, UNPROVIDED, UNPROVIDED);
        princ(error_code, outstream);
        write_char(CHAR_space, outstream);
        write_string(assoc(error_code, $http_error_codes$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest(), outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return NIL;
    }

    /**
     * Send an HTTP request message along CHANNEL, which is a bi-directional TCP stream.
     */
    @LispMethod(comment = "Send an HTTP request message along CHANNEL, which is a bi-directional TCP stream.")
    public static final SubLObject send_http_request_alt(SubLObject channel, SubLObject v_properties) {
        SubLTrampolineFile.checkType(channel, STREAMP);
        {
            SubLObject datum = v_properties;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_2 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt36);
                current_2 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt36);
                if (NIL == member(current_2, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_2 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt36);
            }
            {
                SubLObject machine_tail = property_list_member($MACHINE, current);
                SubLObject machine = (NIL != machine_tail) ? ((SubLObject) (cadr(machine_tail))) : NIL;
                SubLObject port_tail = property_list_member($PORT, current);
                SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $int$80;
                SubLObject method_tail = property_list_member($METHOD, current);
                SubLObject method = (NIL != method_tail) ? ((SubLObject) (cadr(method_tail))) : $GET;
                SubLObject url_tail = property_list_member($URL, current);
                SubLObject url = (NIL != url_tail) ? ((SubLObject) (cadr(url_tail))) : NIL;
                SubLObject query_tail = property_list_member($QUERY, current);
                SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
                SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? ((SubLObject) (cadr(keep_aliveP_tail))) : T;
                SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
                SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? ((SubLObject) (cadr(wide_newlinesP_tail))) : NIL;
                SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
                SubLObject accept_types = (NIL != accept_types_tail) ? ((SubLObject) (cadr(accept_types_tail))) : $DEFAULT;
                com.cyc.cycjava.cycl.web_utilities.http_request_internal(channel, method, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
                force_output(channel);
            }
        }
        return channel;
    }

    /**
     * Send an HTTP request message along CHANNEL, which is a bi-directional TCP stream.
     */
    @LispMethod(comment = "Send an HTTP request message along CHANNEL, which is a bi-directional TCP stream.")
    public static SubLObject send_http_request(final SubLObject channel, final SubLObject v_properties) {
        assert NIL != streamp(channel) : "! streamp(channel) " + ("Types.streamp(channel) " + "CommonSymbols.NIL != Types.streamp(channel) ") + channel;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = v_properties;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, v_properties, $list48);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, v_properties, $list48);
            if (NIL == member(current_$2, $list49, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(v_properties, $list48);
        }
        final SubLObject machine_tail = property_list_member($MACHINE, v_properties);
        final SubLObject machine = (NIL != machine_tail) ? cadr(machine_tail) : NIL;
        final SubLObject port_tail = property_list_member($PORT, v_properties);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $int$80;
        final SubLObject method_tail = property_list_member($METHOD, v_properties);
        final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
        final SubLObject url_tail = property_list_member($URL, v_properties);
        final SubLObject url = (NIL != url_tail) ? cadr(url_tail) : NIL;
        final SubLObject query_tail = property_list_member($QUERY, v_properties);
        final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
        final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, v_properties);
        final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
        final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, v_properties);
        final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
        final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, v_properties);
        final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
        final SubLObject content_type_tail = property_list_member($CONTENT_TYPE, v_properties);
        final SubLObject content_type = (NIL != content_type_tail) ? cadr(content_type_tail) : $DEFAULT;
        final SubLObject soap_action_uri_tail = property_list_member($SOAP_ACTION_URI, v_properties);
        final SubLObject soap_action_uri = (NIL != soap_action_uri_tail) ? cadr(soap_action_uri_tail) : NIL;
        http_request_internal(channel, method, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        force_output(channel);
        return channel;
    }

    public static final SubLObject http_request_internal(SubLObject out_stream, SubLObject method, SubLObject machine, SubLObject port, SubLObject url, SubLObject query, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        SubLTrampolineFile.checkType(method, KEYWORDP);
        SubLTrampolineFile.checkType(machine, STRINGP);
        if (!port.eql($DEFAULT)) {
            SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
        }
        SubLTrampolineFile.checkType(url, STRINGP);
        if (accept_types.eql($DEFAULT)) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        {
            SubLObject list_var = accept_types;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject pcase_var = method;
            if (pcase_var.eql($GET)) {
                com.cyc.cycjava.cycl.web_utilities.http_send_get_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
            } else {
                if (pcase_var.eql($POST)) {
                    SubLTrampolineFile.checkType(query, STRINGP);
                    com.cyc.cycjava.cycl.web_utilities.http_send_post_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
                } else {
                    Errors.error($str_alt43$Unsupported_HTTP_request_method__, method);
                }
            }
        }
        return NIL;
    }

    public static SubLObject http_request_internal(final SubLObject out_stream, final SubLObject method, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (content_type == UNPROVIDED) {
            content_type = $DEFAULT;
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        assert NIL != keywordp(method) : "! keywordp(method) " + ("Types.keywordp(method) " + "CommonSymbols.NIL != Types.keywordp(method) ") + method;
        assert NIL != stringp(machine) : "! stringp(machine) " + ("Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) ") + machine;
        if (((!port.eql($DEFAULT)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(port))) {
            throw new AssertionError(port);
        }
        assert NIL != stringp(url) : "! stringp(url) " + ("Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) ") + url;
        if (accept_types.eql($DEFAULT)) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        final SubLObject list_var = accept_types;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (method.eql($GET)) {
            http_send_get_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
        } else
            if (method.eql($POST)) {
                assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
                if (content_type.eql($DEFAULT)) {
                    content_type = $http_post_default_content_type$.getGlobalValue();
                }
                http_send_post_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
            } else
                if (method.eql($PUT)) {
                    assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
                    if (content_type.eql($DEFAULT)) {
                        content_type = $http_put_default_content_type$.getGlobalValue();
                    }
                    http_send_put_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
                } else
                    if (method.eql($DELETE)) {
                        assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
                        if (content_type.eql($DEFAULT)) {
                            content_type = $http_delete_default_content_type$.getGlobalValue();
                        }
                        http_send_delete_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
                    } else {
                        Errors.error($str57$Unsupported_HTTP_request_method__, method);
                    }



        return NIL;
    }

    public static SubLObject test_http_request(final SubLObject machine, final SubLObject url, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject current;
            final SubLObject datum = current = v_properties;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$3 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list58);
                current_$3 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list58);
                if (NIL == member(current_$3, $list59, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$3 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list58);
            }
            final SubLObject query_tail = property_list_member($QUERY, current);
            final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
            final SubLObject method_tail = property_list_member($METHOD, current);
            final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
            final SubLObject port_tail = property_list_member($PORT, current);
            final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $DEFAULT;
            final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
            final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
            final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
            final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
            final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
            final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : NIL;
            final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
            final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
            send_http_request(stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types }));
            result = get_output_stream_string(stream);
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
        return result;
    }

    public static final SubLObject http_with_cookies_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cookie_list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    cookie_list = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($http_cookies_to_include_in_requests$, cookie_list)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt44);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject http_with_cookies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cookie_list = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        cookie_list = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($http_cookies_to_include_in_requests$, cookie_list)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static final SubLObject get_current_cookies_for_request_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $http_cookies_to_include_in_requests$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_current_cookies_for_request() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $http_cookies_to_include_in_requests$.getDynamicValue(thread);
    }

    public static SubLObject http_send_generic_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, final SubLObject template, final SubLObject template_order, final SubLObject tracer, final SubLObject content_type, SubLObject accept_types, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (NIL != tracer) {
            out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        final SubLObject length = length(query);
        SubLObject cdolist_list_var = template_order;
        SubLObject command = NIL;
        command = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule = assoc(command, template, UNPROVIDED, UNPROVIDED);
            SubLObject skippedP = NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            format_string = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql($VERSION)) {
                    format(out_stream, format_string, url);
                } else
                    if (pcase_var.eql($ACCEPT)) {
                        http_output_accept_types(out_stream, format_string, accept_types);
                    } else
                        if (pcase_var.eql($CONNECTION)) {
                            if (keep_aliveP.isInteger()) {
                                format(out_stream, $str66$Keep_Alive___S, keep_aliveP);
                                if (NIL != wide_newlinesP) {
                                    string_utilities.network_terpri(out_stream);
                                } else {
                                    terpri(out_stream);
                                }
                            }
                            format(out_stream, format_string, NIL != keep_aliveP ? $str67$keep_alive : $$$close);
                        } else
                            if (pcase_var.eql($USER_AGENT)) {
                                format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                            } else
                                if (pcase_var.eql($HOST)) {
                                    format(out_stream, format_string, machine, port.eql($DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : cconcatenate($str71$_, format_nil.format_nil_a_no_copy(port)));
                                } else
                                    if (!pcase_var.eql($BLANK_LINE)) {
                                        if (pcase_var.eql($COOKIES)) {
                                            if (NIL == get_current_cookies_for_request()) {
                                                skippedP = T;
                                            } else {
                                                SubLObject cdolist_list_var_$4 = get_current_cookies_for_request();
                                                SubLObject cookie_string = NIL;
                                                cookie_string = cdolist_list_var_$4.first();
                                                while (NIL != cdolist_list_var_$4) {
                                                    format(out_stream, format_string, cookie_string);
                                                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                                    cookie_string = cdolist_list_var_$4.first();
                                                } 
                                            }
                                        } else
                                            if (pcase_var.eql($CONTENT_TYPE)) {
                                                format(out_stream, format_string, content_type);
                                            } else
                                                if (pcase_var.eql($CONTENT_LENGTH)) {
                                                    format(out_stream, format_string, length);
                                                } else
                                                    if (pcase_var.eql($SOAP_ACTION)) {
                                                        if (NIL != soap_action_uri) {
                                                            format(out_stream, format_string, soap_action_uri);
                                                        } else {
                                                            skippedP = T;
                                                        }
                                                    } else
                                                        if (pcase_var.eql($QUERY)) {
                                                            format(out_stream, format_string, query);
                                                        } else
                                                            if (format_string.isString()) {
                                                                write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
                                                            }





                                    }





            } else {
                cdestructuring_bind_error(datum, $list62);
            }
            if (NIL == skippedP) {
                if (NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                } else {
                    terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        } 
        if (NIL != tracer) {
            force_output(T);
        }
        return original_stream;
    }

    public static final SubLObject http_send_post_request(SubLObject out_stream, SubLObject machine, SubLObject port, SubLObject url, SubLObject query, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_stream = out_stream;
                if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
                    out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
                }
                {
                    SubLObject length = length(query);
                    SubLObject cdolist_list_var = $http_post_request_template_order$.getGlobalValue();
                    SubLObject command = NIL;
                    for (command = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , command = cdolist_list_var.first()) {
                        {
                            SubLObject rule = assoc(command, $http_post_request_template_components$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                            SubLObject skippedP = NIL;
                            SubLObject datum = rule;
                            SubLObject current = datum;
                            SubLObject action = NIL;
                            SubLObject format_string = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt46);
                            action = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt46);
                            format_string = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pcase_var = action;
                                    if (pcase_var.eql($VERSION)) {
                                        format(out_stream, format_string, url);
                                    } else {
                                        if (pcase_var.eql($ACCEPT)) {
                                            com.cyc.cycjava.cycl.web_utilities.http_output_accept_types(out_stream, format_string, accept_types);
                                        } else {
                                            if (pcase_var.eql($CONNECTION)) {
                                                if (keep_aliveP.isInteger()) {
                                                    format(out_stream, $str_alt50$Keep_Alive___S, keep_aliveP);
                                                    if (NIL != wide_newlinesP) {
                                                        string_utilities.network_terpri(out_stream);
                                                    } else {
                                                        terpri(out_stream);
                                                    }
                                                }
                                                format(out_stream, format_string, NIL != keep_aliveP ? ((SubLObject) ($str_alt51$keep_alive)) : $$$close);
                                            } else {
                                                if (pcase_var.eql($USER_AGENT)) {
                                                    format(out_stream, format_string, cyc_revision_string());
                                                } else {
                                                    if (pcase_var.eql($HOST)) {
                                                        format(out_stream, format_string, machine, port.eql($DEFAULT) ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : cconcatenate($str_alt55$_, format_nil.format_nil_a_no_copy(port)));
                                                    } else {
                                                        if (pcase_var.eql($BLANK_LINE)) {
                                                        } else {
                                                            if (pcase_var.eql($COOKIES)) {
                                                                if (NIL == com.cyc.cycjava.cycl.web_utilities.get_current_cookies_for_request()) {
                                                                    skippedP = T;
                                                                } else {
                                                                    {
                                                                        SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.web_utilities.get_current_cookies_for_request();
                                                                        SubLObject cookie_string = NIL;
                                                                        for (cookie_string = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , cookie_string = cdolist_list_var_3.first()) {
                                                                            format(out_stream, format_string, cookie_string);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($CONTENT_LENGTH)) {
                                                                    format(out_stream, format_string, length);
                                                                } else {
                                                                    if (pcase_var.eql($QUERY)) {
                                                                        format(out_stream, format_string, query);
                                                                    } else {
                                                                        if (format_string.isString()) {
                                                                            write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
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
                            } else {
                                cdestructuring_bind_error(datum, $list_alt46);
                            }
                            if (NIL == skippedP) {
                                if (NIL != wide_newlinesP) {
                                    string_utilities.network_terpri(out_stream);
                                } else {
                                    terpri(out_stream);
                                }
                            }
                        }
                    }
                }
                if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
                    force_output(T);
                }
                return original_stream;
            }
        }
    }

    public static SubLObject http_send_post_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_post_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_post_request_template_components$.getGlobalValue(), $http_post_request_template_order$.getGlobalValue(), $trace_http_send_post_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static SubLObject http_send_put_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_put_request_template_components$.getGlobalValue(), $http_put_request_template_order$.getGlobalValue(), $trace_http_send_put_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static SubLObject http_send_delete_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_delete_request_template_components$.getGlobalValue(), $http_delete_request_template_order$.getGlobalValue(), $trace_http_send_delete_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static final SubLObject http_output_accept_types_alt(SubLObject out_stream, SubLObject format_string, SubLObject accept_types) {
        format(out_stream, format_string);
        {
            SubLObject done_oneP = NIL;
            SubLObject cdolist_list_var = accept_types;
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                if (NIL != done_oneP) {
                    princ($str_alt59$__, out_stream);
                }
                princ(type, out_stream);
                done_oneP = T;
            }
        }
        return NIL;
    }

    public static SubLObject http_output_accept_types(final SubLObject out_stream, final SubLObject format_string, final SubLObject accept_types) {
        format(out_stream, format_string);
        SubLObject done_oneP = NIL;
        SubLObject cdolist_list_var = accept_types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != done_oneP) {
                princ($str76$__, out_stream);
            }
            princ(type, out_stream);
            done_oneP = T;
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject http_send_get_request_alt(SubLObject out_stream, SubLObject machine, SubLObject port, SubLObject url, SubLObject query, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_stream = out_stream;
                if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
                    out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
                }
                {
                    SubLObject full_url = url;
                    if (NIL != string_utilities.non_empty_string_p(query)) {
                        full_url = cconcatenate(full_url, new SubLObject[]{ $str_alt60$_, query });
                    }
                    {
                        SubLObject cdolist_list_var = $http_get_request_template_order$.getGlobalValue();
                        SubLObject command = NIL;
                        for (command = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , command = cdolist_list_var.first()) {
                            {
                                SubLObject rule = assoc(command, $http_get_request_template_components$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                SubLObject skippedP = NIL;
                                SubLObject datum = rule;
                                SubLObject current = datum;
                                SubLObject action = NIL;
                                SubLObject format_string = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt46);
                                action = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt46);
                                format_string = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject pcase_var = action;
                                        if (pcase_var.eql($VERSION)) {
                                            format(out_stream, format_string, full_url);
                                        } else {
                                            if (pcase_var.eql($ACCEPT)) {
                                                com.cyc.cycjava.cycl.web_utilities.http_output_accept_types(out_stream, format_string, accept_types);
                                            } else {
                                                if (pcase_var.eql($CONNECTION)) {
                                                    if (keep_aliveP.isInteger()) {
                                                        format(out_stream, $str_alt50$Keep_Alive___S, keep_aliveP);
                                                        if (NIL != wide_newlinesP) {
                                                            string_utilities.network_terpri(out_stream);
                                                        } else {
                                                            terpri(out_stream);
                                                        }
                                                    }
                                                    format(out_stream, format_string, NIL != keep_aliveP ? ((SubLObject) ($str_alt51$keep_alive)) : $$$close);
                                                } else {
                                                    if (pcase_var.eql($USER_AGENT)) {
                                                        format(out_stream, format_string, cyc_revision_string());
                                                    } else {
                                                        if (pcase_var.eql($COOKIES)) {
                                                            if (NIL == com.cyc.cycjava.cycl.web_utilities.get_current_cookies_for_request()) {
                                                                skippedP = T;
                                                            } else {
                                                                {
                                                                    SubLObject cdolist_list_var_4 = com.cyc.cycjava.cycl.web_utilities.get_current_cookies_for_request();
                                                                    SubLObject cookie_string = NIL;
                                                                    for (cookie_string = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , cookie_string = cdolist_list_var_4.first()) {
                                                                        format(out_stream, format_string, cookie_string);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (pcase_var.eql($HOST)) {
                                                                format(out_stream, format_string, machine, port.eql($DEFAULT) ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : cconcatenate($str_alt55$_, format_nil.format_nil_a_no_copy(port)));
                                                            } else {
                                                                if (pcase_var.eql($BLANK_LINE)) {
                                                                } else {
                                                                    if (format_string.isString()) {
                                                                        write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
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
                                    cdestructuring_bind_error(datum, $list_alt46);
                                }
                                if (NIL == skippedP) {
                                    if (NIL != wide_newlinesP) {
                                        string_utilities.network_terpri(out_stream);
                                    } else {
                                        terpri(out_stream);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
                    force_output(T);
                }
                return original_stream;
            }
        }
    }

    public static SubLObject http_send_get_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
            out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        SubLObject full_url = url;
        if (NIL != string_utilities.non_empty_string_p(query)) {
            full_url = cconcatenate(full_url, new SubLObject[]{ $str77$_, query });
        }
        SubLObject cdolist_list_var = $http_get_request_template_order$.getGlobalValue();
        SubLObject command = NIL;
        command = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule = assoc(command, $http_get_request_template_components$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject skippedP = NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            format_string = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql($VERSION)) {
                    format(out_stream, format_string, full_url);
                } else
                    if (pcase_var.eql($ACCEPT)) {
                        http_output_accept_types(out_stream, format_string, accept_types);
                    } else
                        if (pcase_var.eql($CONNECTION)) {
                            if (keep_aliveP.isInteger()) {
                                format(out_stream, $str66$Keep_Alive___S, keep_aliveP);
                                if (NIL != wide_newlinesP) {
                                    string_utilities.network_terpri(out_stream);
                                } else {
                                    terpri(out_stream);
                                }
                            }
                            format(out_stream, format_string, NIL != keep_aliveP ? $str67$keep_alive : $$$close);
                        } else
                            if (pcase_var.eql($USER_AGENT)) {
                                format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                            } else
                                if (pcase_var.eql($COOKIES)) {
                                    if (NIL == get_current_cookies_for_request()) {
                                        skippedP = T;
                                    } else {
                                        SubLObject cdolist_list_var_$5 = get_current_cookies_for_request();
                                        SubLObject cookie_string = NIL;
                                        cookie_string = cdolist_list_var_$5.first();
                                        while (NIL != cdolist_list_var_$5) {
                                            format(out_stream, format_string, cookie_string);
                                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                            cookie_string = cdolist_list_var_$5.first();
                                        } 
                                    }
                                } else
                                    if (pcase_var.eql($HOST)) {
                                        format(out_stream, format_string, machine, port.eql($DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : cconcatenate($str71$_, format_nil.format_nil_a_no_copy(port)));
                                    } else
                                        if (!pcase_var.eql($BLANK_LINE)) {
                                            if (format_string.isString()) {
                                                write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
                                            }
                                        }






            } else {
                cdestructuring_bind_error(datum, $list62);
            }
            if (NIL == skippedP) {
                if (NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                } else {
                    terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        } 
        if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
            force_output(T);
        }
        return original_stream;
    }

    public static final SubLObject http_send_response_header_alt(SubLObject outstream, SubLObject header_fields) {
        write_string($str_alt61$Date__, outstream, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.web_utilities.write_http_date(outstream, UNPROVIDED);
        com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
        write_string($str_alt62$Server__Cyc_, outstream, UNPROVIDED, UNPROVIDED);
        write_string(cyc_revision_string(), outstream, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
        {
            SubLObject cdolist_list_var = header_fields;
            SubLObject field = NIL;
            for (field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field = cdolist_list_var.first()) {
                write_string(field.first(), outstream, UNPROVIDED, UNPROVIDED);
                write_string($str_alt63$__, outstream, UNPROVIDED, UNPROVIDED);
                princ(field.rest(), outstream);
                com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
            }
        }
        com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
        return T;
    }

    public static SubLObject http_send_response_header(final SubLObject outstream, final SubLObject header_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($str78$Date__, outstream, UNPROVIDED, UNPROVIDED);
        write_http_date(outstream, UNPROVIDED);
        http_network_terpri(outstream);
        write_string($str79$Server__Cyc_, outstream, UNPROVIDED, UNPROVIDED);
        write_string(system_info.cyc_revision_string(), outstream, UNPROVIDED, UNPROVIDED);
        write_string($str29$_, outstream, UNPROVIDED, UNPROVIDED);
        princ(system_parameters.$base_tcp_port$.getDynamicValue(thread), outstream);
        http_network_terpri(outstream);
        SubLObject cdolist_list_var = header_fields;
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string(field.first(), outstream, UNPROVIDED, UNPROVIDED);
            write_string($str80$__, outstream, UNPROVIDED, UNPROVIDED);
            princ(field.rest(), outstream);
            http_network_terpri(outstream);
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        http_network_terpri(outstream);
        return T;
    }

    public static final SubLObject http_extract_cookies_from_reply_header_alt(SubLObject string) {
        {
            SubLObject position = ZERO_INTEGER;
            SubLObject cookie_information = NIL;
            while (position.isFixnum()) {
                position = search($http_header_cookie_keyword$.getGlobalValue(), string, symbol_function($sym65$CHAR_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, position, UNPROVIDED);
                if (position.isFixnum()) {
                    {
                        SubLObject end_position = position(CHAR_return, string, symbol_function($sym65$CHAR_), symbol_function(IDENTITY), position, UNPROVIDED);
                        SubLObject cut_position = add(position, ONE_INTEGER, length($http_header_cookie_keyword$.getGlobalValue()));
                        SubLObject cookie_encoding = string_utilities.substring(string, cut_position, end_position);
                        SubLObject cookie_string = com.cyc.cycjava.cycl.web_utilities.http_compute_cookie_string_from_encoding(cookie_encoding);
                        cookie_information = cons(cookie_string, cookie_information);
                        position = end_position;
                    }
                }
            } 
            return cookie_information;
        }
    }

    public static SubLObject http_extract_cookies_from_reply_header(final SubLObject string) {
        SubLObject position = ZERO_INTEGER;
        SubLObject cookie_information = NIL;
        while (position.isFixnum()) {
            position = search($http_header_cookie_keyword$.getGlobalValue(), string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, position, UNPROVIDED);
            if (position.isFixnum()) {
                final SubLObject end_position = position(CHAR_return, string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), position, UNPROVIDED);
                final SubLObject cut_position = add(position, ONE_INTEGER, length($http_header_cookie_keyword$.getGlobalValue()));
                final SubLObject cookie_encoding = string_utilities.substring(string, cut_position, end_position);
                final SubLObject cookie_string = http_compute_cookie_string_from_encoding(cookie_encoding);
                cookie_information = cons(cookie_string, cookie_information);
                position = end_position;
            }
        } 
        return cookie_information;
    }

    public static final SubLObject http_compute_cookie_string_from_encoding_alt(SubLObject encoding) {
        {
            SubLObject pieces = com.cyc.cycjava.cycl.web_utilities.http_decompose_cookie_encoding_string(encoding);
            SubLObject return_encoding = $str_alt69$;
            SubLObject cdolist_list_var = pieces;
            SubLObject piece = NIL;
            for (piece = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , piece = cdolist_list_var.first()) {
                if (!((NIL != string_utilities.empty_string_p(piece)) || (NIL != com.cyc.cycjava.cycl.web_utilities.filter_predefined_named_cookie_attributes(piece)))) {
                    return_encoding = cconcatenate(return_encoding, new SubLObject[]{ $str_alt70$__, piece });
                }
            }
            return return_encoding;
        }
    }

    public static SubLObject http_compute_cookie_string_from_encoding(final SubLObject encoding) {
        final SubLObject pieces = http_decompose_cookie_encoding_string(encoding);
        SubLObject return_encoding = $str86$;
        SubLObject cdolist_list_var = pieces;
        SubLObject piece = NIL;
        piece = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == string_utilities.empty_string_p(piece)) && (NIL == filter_predefined_named_cookie_attributes(piece))) {
                return_encoding = cconcatenate(return_encoding, new SubLObject[]{ $str87$__, piece });
            }
            cdolist_list_var = cdolist_list_var.rest();
            piece = cdolist_list_var.first();
        } 
        return return_encoding;
    }

    public static final SubLObject filter_predefined_named_cookie_attributes_alt(SubLObject name_value_pair) {
        {
            SubLObject name_value_pair_size = length(name_value_pair);
            SubLObject filterP = NIL;
            if (NIL == filterP) {
                {
                    SubLObject csome_list_var = $http_filtered_predefined_named_cookie_attributes$.getGlobalValue();
                    SubLObject known_attribute = NIL;
                    for (known_attribute = csome_list_var.first(); !((NIL != filterP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , known_attribute = csome_list_var.first()) {
                        {
                            SubLObject size = length(known_attribute);
                            if (size.numL(name_value_pair_size) && (NIL != Strings.string_equal(known_attribute, name_value_pair, ZERO_INTEGER, NIL, ZERO_INTEGER, size))) {
                                filterP = T;
                            }
                        }
                    }
                }
            }
            return filterP;
        }
    }

    public static SubLObject filter_predefined_named_cookie_attributes(final SubLObject name_value_pair) {
        final SubLObject name_value_pair_size = length(name_value_pair);
        SubLObject filterP = NIL;
        if (NIL == filterP) {
            SubLObject csome_list_var = $http_filtered_predefined_named_cookie_attributes$.getGlobalValue();
            SubLObject known_attribute = NIL;
            known_attribute = csome_list_var.first();
            while ((NIL == filterP) && (NIL != csome_list_var)) {
                final SubLObject size = length(known_attribute);
                if (size.numL(name_value_pair_size) && (NIL != Strings.string_equal(known_attribute, name_value_pair, ZERO_INTEGER, NIL, ZERO_INTEGER, size))) {
                    filterP = T;
                }
                csome_list_var = csome_list_var.rest();
                known_attribute = csome_list_var.first();
            } 
        }
        return filterP;
    }

    public static final SubLObject http_decompose_cookie_encoding_string_alt(SubLObject encoding) {
        return remove_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(TRIM_WHITESPACE), string_utilities.split_string(encoding, $http_cookie_separation_charset$.getGlobalValue())), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject http_decompose_cookie_encoding_string(final SubLObject encoding) {
        return remove_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(TRIM_WHITESPACE), string_utilities.split_string(encoding, $http_cookie_separation_charset$.getGlobalValue())), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,
     * period, and (optionally) equals are encoded in %XX form.
     */
    @LispMethod(comment = "Return a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,\r\nperiod, and (optionally) equals are encoded in %XX form.\nReturn a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,\nperiod, and (optionally) equals are encoded in %XX form.")
    public static final SubLObject html_url_encode_alt(SubLObject string, SubLObject encode_equalsP) {
        if (encode_equalsP == UNPROVIDED) {
            encode_equalsP = NIL;
        }
        {
            SubLObject length = length(string);
            SubLObject count = (NIL != encode_equalsP) ? ((SubLObject) (count_if(symbol_function(HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS), string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : count_if(symbol_function(HTML_URL_EXPAND_CHAR), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (ZERO_INTEGER.numE(count)) {
                return string;
            } else {
                {
                    SubLObject new_length = add(length, multiply(count, TWO_INTEGER));
                    SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
                    SubLObject new_index = ZERO_INTEGER;
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL(length); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string, index);
                            SubLObject needs_encodingP = (NIL != encode_equalsP) ? ((SubLObject) (com.cyc.cycjava.cycl.web_utilities.html_url_expand_char_including_equals(v_char))) : com.cyc.cycjava.cycl.web_utilities.html_url_expand_char(v_char);
                            if (NIL != needs_encodingP) {
                                {
                                    SubLObject code = char_code(v_char);
                                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_percent);
                                    Strings.set_char(new_string, add(new_index, ONE_INTEGER), string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)));
                                    Strings.set_char(new_string, add(new_index, TWO_INTEGER), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
                                    new_index = add(new_index, THREE_INTEGER);
                                }
                            } else {
                                if (v_char.eql(CHAR_space)) {
                                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_plus);
                                } else {
                                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), v_char);
                                }
                                new_index = add(new_index, ONE_INTEGER);
                            }
                        }
                    }
                    return new_string;
                }
            }
        }
    }

    /**
     * Return a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,
     * period, and (optionally) equals are encoded in %XX form.
     */
    @LispMethod(comment = "Return a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,\r\nperiod, and (optionally) equals are encoded in %XX form.\nReturn a URL encoded form of STRING.  Characters besides letters, numbers, hyphen, underscore,\nperiod, and (optionally) equals are encoded in %XX form.")
    public static SubLObject html_url_encode(final SubLObject string, SubLObject encode_equalsP) {
        if (encode_equalsP == UNPROVIDED) {
            encode_equalsP = NIL;
        }
        final SubLObject length = length(string);
        final SubLObject count = (NIL != encode_equalsP) ? count_if(symbol_function(HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS), string, UNPROVIDED, UNPROVIDED, UNPROVIDED) : count_if(symbol_function(HTML_URL_EXPAND_CHAR), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ZERO_INTEGER.numE(count)) {
            return string;
        }
        final SubLObject new_length = add(length, multiply(count, TWO_INTEGER));
        final SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_index = ZERO_INTEGER;
        SubLObject index;
        SubLObject v_char;
        SubLObject needs_encodingP;
        SubLObject code;
        for (index = NIL, index = ZERO_INTEGER; index.numL(length); index = add(index, ONE_INTEGER)) {
            v_char = Strings.sublisp_char(string, index);
            needs_encodingP = (NIL != encode_equalsP) ? html_url_expand_char_including_equals(v_char) : html_url_expand_char(v_char);
            if (NIL != needs_encodingP) {
                code = char_code(v_char);
                Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_percent);
                Strings.set_char(new_string, add(new_index, ONE_INTEGER), string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)));
                Strings.set_char(new_string, add(new_index, TWO_INTEGER), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
                new_index = add(new_index, THREE_INTEGER);
            } else {
                if (v_char.eql(CHAR_space)) {
                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_plus);
                } else {
                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), v_char);
                }
                new_index = add(new_index, ONE_INTEGER);
            }
        }
        return new_string;
    }

    public static final SubLObject html_url_expand_char_alt(SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (!((((NIL != alpha_char_p(v_char)) && (NIL != unicode_strings.ascii_char_p(v_char))) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $str_alt75$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))));
    }

    public static SubLObject html_url_expand_char(final SubLObject v_char) {
        return makeBoolean(((v_char.isChar() && ((NIL == alpha_char_p(v_char)) || (NIL == unicode_strings.ascii_char_p(v_char)))) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL == find(v_char, $str92$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject html_url_expand_char_including_equals_alt(SubLObject v_char) {
        return makeBoolean((v_char == CHAR_equal) || (NIL != com.cyc.cycjava.cycl.web_utilities.html_url_expand_char(v_char)));
    }

    public static SubLObject html_url_expand_char_including_equals(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_equal) || (NIL != html_url_expand_char(v_char)));
    }

    /**
     * Return the decoding of string, which is assumed to be URL encoded.
     * '+' characters are converted to spaces, and %XX sequences are decoded into the
     * character whose char-code has XX as its hex representation.
     */
    @LispMethod(comment = "Return the decoding of string, which is assumed to be URL encoded.\r\n\'+\' characters are converted to spaces, and %XX sequences are decoded into the\r\ncharacter whose char-code has XX as its hex representation.\nReturn the decoding of string, which is assumed to be URL encoded.\n\'+\' characters are converted to spaces, and %XX sequences are decoded into the\ncharacter whose char-code has XX as its hex representation.")
    public static final SubLObject html_url_decode_alt(SubLObject string) {
        {
            SubLObject length = length(string);
            SubLObject count = count(CHAR_percent, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (length.numE(count)) {
                return nsubstitute(CHAR_space, CHAR_plus, string_utilities.copy_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                {
                    SubLObject new_length = subtract(length, multiply(count, TWO_INTEGER));
                    SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
                    SubLObject new_index = ZERO_INTEGER;
                    SubLObject index = ZERO_INTEGER;
                    while (index.numL(length)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string, index);
                            if (NIL != charE(CHAR_percent, v_char)) {
                                {
                                    SubLObject high_char = Strings.sublisp_char(string, add(index, ONE_INTEGER));
                                    SubLObject low_char = Strings.sublisp_char(string, add(index, TWO_INTEGER));
                                    SubLObject code = vector_utilities.hex_chars_to_byte(high_char, low_char);
                                    SubLObject decoded_char = code_char(code);
                                    Strings.set_char(new_string, new_index, decoded_char);
                                    new_index = add(new_index, ONE_INTEGER);
                                    index = add(index, THREE_INTEGER);
                                }
                            } else {
                                if (v_char.eql(CHAR_plus)) {
                                    Strings.set_char(new_string, new_index, CHAR_space);
                                } else {
                                    Strings.set_char(new_string, new_index, v_char);
                                }
                                new_index = add(new_index, ONE_INTEGER);
                                index = add(index, ONE_INTEGER);
                            }
                        }
                    } 
                    return new_string;
                }
            }
        }
    }

    /**
     * Return the decoding of string, which is assumed to be URL encoded.
     * '+' characters are converted to spaces, and %XX sequences are decoded into the
     * character whose char-code has XX as its hex representation.
     */
    @LispMethod(comment = "Return the decoding of string, which is assumed to be URL encoded.\r\n\'+\' characters are converted to spaces, and %XX sequences are decoded into the\r\ncharacter whose char-code has XX as its hex representation.\nReturn the decoding of string, which is assumed to be URL encoded.\n\'+\' characters are converted to spaces, and %XX sequences are decoded into the\ncharacter whose char-code has XX as its hex representation.")
    public static SubLObject html_url_decode(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = length(string);
        final SubLObject count = count(CHAR_percent, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (length.numE(count)) {
            return nsubstitute(CHAR_space, CHAR_plus, string_utilities.copy_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject new_length = subtract(length, multiply(count, TWO_INTEGER));
        SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_index = ZERO_INTEGER;
        SubLObject index = ZERO_INTEGER;
        while (index.numL(length)) {
            final SubLObject v_char = Strings.sublisp_char(string, index);
            if (NIL != charE(CHAR_percent, v_char)) {
                thread.resetMultipleValues();
                final SubLObject decoded_char = decode_url_percent_encoded_char(string, index);
                final SubLObject chars_consumed = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (decoded_char.isChar()) {
                    Strings.set_char(new_string, new_index, decoded_char);
                    new_index = add(new_index, ONE_INTEGER);
                } else
                    if (decoded_char.isString()) {
                        new_string = cconcatenate(string_utilities.substring(new_string, ZERO_INTEGER, new_index), new SubLObject[]{ decoded_char, string_utilities.substring(new_string, add(new_index, ONE_INTEGER), UNPROVIDED) });
                        new_index = add(new_index, length(decoded_char));
                    }

                index = add(index, chars_consumed);
            } else {
                if (v_char.eql(CHAR_plus)) {
                    Strings.set_char(new_string, new_index, CHAR_space);
                } else {
                    Strings.set_char(new_string, new_index, v_char);
                }
                new_index = add(new_index, ONE_INTEGER);
                index = add(index, ONE_INTEGER);
            }
        } 
        return new_string;
    }

    public static SubLObject decode_url_percent_encoded_char(final SubLObject string, final SubLObject index) {
        final SubLObject next_char = Strings.sublisp_char(string, add(index, ONE_INTEGER));
        if (next_char.eql(CHAR_u)) {
            final SubLObject char_code = parse_integer(string, add(index, TWO_INTEGER), add(index, SIX_INTEGER), SIXTEEN_INTEGER, UNPROVIDED);
            final SubLObject new_char_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(make_vector(ONE_INTEGER, char_code), UNPROVIDED, UNPROVIDED));
            return values(new_char_string, SIX_INTEGER);
        }
        final SubLObject high_char = next_char;
        final SubLObject low_char = Strings.sublisp_char(string, add(index, TWO_INTEGER));
        final SubLObject code = vector_utilities.hex_chars_to_byte(high_char, low_char);
        final SubLObject decoded_char = code_char(code);
        return values(decoded_char, THREE_INTEGER);
    }

    /**
     * Return a version of STRING in which all HTML glyph sequences have been
     * replaced with the desired encoded character, where possible.
     */
    @LispMethod(comment = "Return a version of STRING in which all HTML glyph sequences have been\r\nreplaced with the desired encoded character, where possible.\nReturn a version of STRING in which all HTML glyph sequences have been\nreplaced with the desired encoded character, where possible.")
    public static final SubLObject html_glyph_decode_alt(SubLObject string) {
        string = com.cyc.cycjava.cycl.web_utilities.html_ascii_glyph_decode(string);
        return string;
    }

    /**
     * Return a version of STRING in which all HTML glyph sequences have been
     * replaced with the desired encoded character, where possible.
     */
    @LispMethod(comment = "Return a version of STRING in which all HTML glyph sequences have been\r\nreplaced with the desired encoded character, where possible.\nReturn a version of STRING in which all HTML glyph sequences have been\nreplaced with the desired encoded character, where possible.")
    public static SubLObject html_glyph_decode(SubLObject string) {
        string = html_ascii_glyph_decode(string);
        return string;
    }

    /**
     * Return a version of STRING in which all HTML ASCII glyph sequences have been
     * replaced with the encoded character.
     */
    @LispMethod(comment = "Return a version of STRING in which all HTML ASCII glyph sequences have been\r\nreplaced with the encoded character.\nReturn a version of STRING in which all HTML ASCII glyph sequences have been\nreplaced with the encoded character.")
    public static final SubLObject html_ascii_glyph_decode_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done = NIL;
                while (NIL == done) {
                    {
                        SubLObject restart = NIL;
                        if (NIL == restart) {
                            {
                                SubLObject end_var = length(string);
                                SubLObject glyph_start = NIL;
                                for (glyph_start = ZERO_INTEGER; !((NIL != restart) || glyph_start.numGE(end_var)); glyph_start = number_utilities.f_1X(glyph_start)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject glyph_end = com.cyc.cycjava.cycl.web_utilities.html_ascii_glyph_p(string, glyph_start);
                                        SubLObject char_code = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != glyph_end) {
                                            {
                                                SubLObject prefix = subseq(string, ZERO_INTEGER, glyph_start);
                                                SubLObject replacement = Strings.make_string(ONE_INTEGER, code_char(char_code));
                                                SubLObject postfix = subseq(string, glyph_end, length(string));
                                                string = cconcatenate(prefix, new SubLObject[]{ replacement, postfix });
                                                restart = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        done = makeBoolean(NIL == restart);
                    }
                } 
            }
            return string;
        }
    }

    /**
     * Return a version of STRING in which all HTML ASCII glyph sequences have been
     * replaced with the encoded character.
     */
    @LispMethod(comment = "Return a version of STRING in which all HTML ASCII glyph sequences have been\r\nreplaced with the encoded character.\nReturn a version of STRING in which all HTML ASCII glyph sequences have been\nreplaced with the encoded character.")
    public static SubLObject html_ascii_glyph_decode(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject restart;
        for (SubLObject done = NIL; NIL == done; done = makeBoolean(NIL == restart)) {
            restart = NIL;
            if (NIL == restart) {
                SubLObject end_var;
                SubLObject glyph_start;
                SubLObject glyph_end;
                SubLObject char_code;
                SubLObject prefix;
                SubLObject replacement;
                SubLObject postfix;
                for (end_var = length(string), glyph_start = NIL, glyph_start = ZERO_INTEGER; (NIL == restart) && (!glyph_start.numGE(end_var)); glyph_start = number_utilities.f_1X(glyph_start)) {
                    thread.resetMultipleValues();
                    glyph_end = html_ascii_glyph_p(string, glyph_start);
                    char_code = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != glyph_end) {
                        prefix = subseq(string, ZERO_INTEGER, glyph_start);
                        replacement = Strings.make_string(ONE_INTEGER, code_char(char_code));
                        postfix = subseq(string, glyph_end, length(string));
                        string = cconcatenate(prefix, new SubLObject[]{ replacement, postfix });
                        restart = T;
                    }
                }
            }
        }
        return string;
    }

    /**
     * Analyze STRING for an HTML ascii glyph of the form &#nnn; starting at START.
     *
     * @return 0 nil or integerp; GLYPH-END, the index right after the glyph (or NIL if none)
     * @return 1 nil or integerp; CHAR-CODE, the code of the ascii char (or NIL if none)
     */
    @LispMethod(comment = "Analyze STRING for an HTML ascii glyph of the form &#nnn; starting at START.\r\n\r\n@return 0 nil or integerp; GLYPH-END, the index right after the glyph (or NIL if none)\r\n@return 1 nil or integerp; CHAR-CODE, the code of the ascii char (or NIL if none)")
    public static final SubLObject html_ascii_glyph_p_alt(SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            SubLObject length = length(string);
            if (subtract(length, start).numGE(FOUR_INTEGER)) {
                if ((NIL != charE(CHAR_ampersand, Strings.sublisp_char(string, add(ZERO_INTEGER, start)))) && (NIL != charE(CHAR_hash, Strings.sublisp_char(string, add(ONE_INTEGER, start))))) {
                    {
                        SubLObject glyph_last = position(CHAR_semicolon, string, symbol_function($sym65$CHAR_), symbol_function(IDENTITY), start, UNPROVIDED);
                        if (NIL != glyph_last) {
                            {
                                SubLObject glyph_end = number_utilities.f_1X(glyph_last);
                                SubLObject glyph_length = subtract(glyph_end, start);
                                if (glyph_length.numGE(FOUR_INTEGER) && glyph_length.numLE(SIX_INTEGER)) {
                                    {
                                        SubLObject integer = parse_integer(string, add(TWO_INTEGER, start), glyph_last, TEN_INTEGER, NIL);
                                        if (((NIL != integer) && integer.numGE(ZERO_INTEGER)) && integer.numL($int$256)) {
                                            return values(glyph_end, integer);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    /**
     * Analyze STRING for an HTML ascii glyph of the form &#nnn; starting at START.
     *
     * @return 0 nil or integerp; GLYPH-END, the index right after the glyph (or NIL if none)
     * @return 1 nil or integerp; CHAR-CODE, the code of the ascii char (or NIL if none)
     */
    @LispMethod(comment = "Analyze STRING for an HTML ascii glyph of the form &#nnn; starting at START.\r\n\r\n@return 0 nil or integerp; GLYPH-END, the index right after the glyph (or NIL if none)\r\n@return 1 nil or integerp; CHAR-CODE, the code of the ascii char (or NIL if none)")
    public static SubLObject html_ascii_glyph_p(final SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject length = length(string);
        if ((subtract(length, start).numGE(FOUR_INTEGER) && (NIL != charE(CHAR_ampersand, Strings.sublisp_char(string, add(ZERO_INTEGER, start))))) && (NIL != charE(CHAR_hash, Strings.sublisp_char(string, add(ONE_INTEGER, start))))) {
            final SubLObject glyph_last = position(CHAR_semicolon, string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), start, UNPROVIDED);
            if (NIL != glyph_last) {
                final SubLObject glyph_end = number_utilities.f_1X(glyph_last);
                final SubLObject glyph_length = subtract(glyph_end, start);
                if (glyph_length.numGE(FOUR_INTEGER) && glyph_length.numLE(SIX_INTEGER)) {
                    final SubLObject integer = (NIL != charE(CHAR_x, Strings.sublisp_char(string, add(TWO_INTEGER, start)))) ? parse_integer(string, add(THREE_INTEGER, start), glyph_last, SIXTEEN_INTEGER, NIL) : parse_integer(string, add(TWO_INTEGER, start), glyph_last, TEN_INTEGER, NIL);
                    if (((NIL != integer) && integer.numGE(ZERO_INTEGER)) && integer.numL($int$256)) {
                        return values(glyph_end, integer);
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    /**
     * Returns the given FORT in a form in which it can be placed in a URL.
     */
    @LispMethod(comment = "Returns the given FORT in a form in which it can be placed in a URL.")
    public static final SubLObject html_encode_fort_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.web_utilities.html_url_encode(format(NIL, $str_alt77$_S, forts.fort_el_formula(czer_main.canonicalize_term(fort, UNPROVIDED))), UNPROVIDED);
    }

    /**
     * Returns the given FORT in a form in which it can be placed in a URL.
     */
    @LispMethod(comment = "Returns the given FORT in a form in which it can be placed in a URL.")
    public static SubLObject html_encode_fort(final SubLObject fort) {
        return html_url_encode(format(NIL, $str94$_S, forts.fort_el_formula(czer_main.canonicalize_term(fort, UNPROVIDED))), UNPROVIDED);
    }

    /**
     * Returns the fort that is encoded in the given STRING.
     */
    @LispMethod(comment = "Returns the fort that is encoded in the given STRING.")
    public static final SubLObject html_decode_fort_alt(SubLObject string) {
        return czer_main.canonicalize_term(read_from_string(com.cyc.cycjava.cycl.web_utilities.html_url_decode(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * Returns the fort that is encoded in the given STRING.
     */
    @LispMethod(comment = "Returns the fort that is encoded in the given STRING.")
    public static SubLObject html_decode_fort(final SubLObject string) {
        return czer_main.canonicalize_term(read_from_string(html_url_decode(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     *
     *
     * @return T if object is a valid uri.
     */
    @LispMethod(comment = "@return T if object is a valid uri.")
    public static final SubLObject uri_p_alt(SubLObject v_object, SubLObject official_onlyP) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (v_object.isString()) {
            {
                SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
                if (NIL != colon_idx) {
                    if (NIL != com.cyc.cycjava.cycl.web_utilities.uri_scheme_p(v_object, official_onlyP, ZERO_INTEGER, number_utilities.f_1X(colon_idx))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return T if object is a valid uri.
     */
    @LispMethod(comment = "@return T if object is a valid uri.")
    public static SubLObject uri_p(final SubLObject v_object, SubLObject official_onlyP) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (v_object.isString()) {
            final SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
            if ((NIL != colon_idx) && (NIL != uri_scheme_p(v_object, official_onlyP, ZERO_INTEGER, number_utilities.f_1X(colon_idx)))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return T if object is a valid url.
     */
    @LispMethod(comment = "@return T if object is a valid url.")
    public static final SubLObject url_p_alt(SubLObject v_object) {
        if (v_object.isString()) {
            {
                SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
                if (NIL == colon_idx) {
                    return NIL;
                }
                {
                    SubLObject start_idx = com.cyc.cycjava.cycl.web_utilities.find_url_beginning(v_object, length(v_object), colon_idx);
                    if ((NIL == start_idx) || start_idx.numG(ZERO_INTEGER)) {
                        return NIL;
                    } else {
                        if (NIL != Strings.stringE($str_alt78$mailto_, subseq(v_object, ZERO_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return string_utilities.contains_charP(v_object, CHAR_at);
                        } else {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return T if object is a valid url.
     */
    @LispMethod(comment = "@return T if object is a valid url.")
    public static SubLObject url_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        final SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
        if (NIL == colon_idx) {
            return NIL;
        }
        final SubLObject start_idx = find_url_beginning(v_object, length(v_object), colon_idx);
        if ((NIL == start_idx) || start_idx.numG(ZERO_INTEGER)) {
            return NIL;
        }
        if (NIL != Strings.stringE($str95$mailto_, subseq(v_object, ZERO_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.contains_charP(v_object, CHAR_at);
        }
        return T;
    }

    /**
     * Find the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.
     * WARNING: Not very robust!!
     */
    @LispMethod(comment = "Find the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.\r\nWARNING: Not very robust!!\nFind the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.\nWARNING: Not very robust!!")
    public static final SubLObject url_host_alt(SubLObject url) {
        {
            SubLObject colon_idx = position(CHAR_colon, url, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
            if (NIL == colon_idx) {
                return $str_alt69$;
            } else {
                {
                    SubLObject url_tokens = string_utilities.string_tokenize(url, $list_alt79, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
                    return second(url_tokens);
                }
            }
        }
    }

    /**
     * Find the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.
     * WARNING: Not very robust!!
     */
    @LispMethod(comment = "Find the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.\r\nWARNING: Not very robust!!\nFind the host mentioned in the URL.  Assumes given a URL with a host in the second token position (i.e. the first string after the protocol when tokenizing.\nWARNING: Not very robust!!")
    public static SubLObject url_host(final SubLObject url) {
        final SubLObject colon_idx = position(CHAR_colon, url, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
        if (NIL == colon_idx) {
            return $str86$;
        }
        final SubLObject url_tokens = string_utilities.string_tokenize(url, $list96, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
        return second(url_tokens);
    }

    /**
     * Returns T iff the URL is relative (begins with /)
     */
    @LispMethod(comment = "Returns T iff the URL is relative (begins with /)")
    public static final SubLObject url_is_relativeP_alt(SubLObject url) {
        SubLTrampolineFile.checkType(url, NON_EMPTY_STRING_P);
        return eq(CHAR_slash, string_utilities.first_char(url));
    }

    /**
     * Returns T iff the URL is relative (begins with /)
     */
    @LispMethod(comment = "Returns T iff the URL is relative (begins with /)")
    public static SubLObject url_is_relativeP(final SubLObject url) {
        assert NIL != string_utilities.non_empty_string_p(url) : "! string_utilities.non_empty_string_p(url) " + ("string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) ") + url;
        return eq(CHAR_slash, string_utilities.first_char(url));
    }

    public static final SubLObject absolute_url_from_relative_url_and_base_alt(SubLObject url, SubLObject base_uri) {
        SubLTrampolineFile.checkType(url, STRINGP);
        SubLTrampolineFile.checkType(base_uri, STRINGP);
        {
            SubLObject relativeP = com.cyc.cycjava.cycl.web_utilities.url_is_relativeP(url);
            return (NIL != relativeP) && (NIL != base_uri) ? ((SubLObject) (cconcatenate(format_nil.format_nil_a_no_copy(Strings.string_right_trim($str_alt81$_, base_uri)), format_nil.format_nil_a_no_copy(url)))) : url;
        }
    }

    public static SubLObject absolute_url_from_relative_url_and_base(final SubLObject url, final SubLObject base_uri) {
        assert NIL != stringp(url) : "! stringp(url) " + ("Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) ") + url;
        assert NIL != stringp(base_uri) : "! stringp(base_uri) " + ("Types.stringp(base_uri) " + "CommonSymbols.NIL != Types.stringp(base_uri) ") + base_uri;
        final SubLObject relativeP = url_is_relativeP(url);
        return (NIL != relativeP) && (NIL != base_uri) ? cconcatenate(format_nil.format_nil_a_no_copy(Strings.string_right_trim($str29$_, base_uri)), format_nil.format_nil_a_no_copy(url)) : url;
    }

    public static final SubLObject uri_scheme_p_alt(SubLObject v_object, SubLObject official_onlyP, SubLObject start, SubLObject end) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            SubLObject match = NIL;
            if (NIL == match) {
                {
                    SubLObject csome_list_var = $official_uri_schemes$.getGlobalValue();
                    SubLObject scheme = NIL;
                    for (scheme = csome_list_var.first(); !((NIL != match) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , scheme = csome_list_var.first()) {
                        if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                            match = scheme;
                        }
                    }
                }
            }
            if (NIL == official_onlyP) {
                if (NIL == match) {
                    {
                        SubLObject csome_list_var = $unofficial_uri_schemes$.getGlobalValue();
                        SubLObject scheme = NIL;
                        for (scheme = csome_list_var.first(); !((NIL != match) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , scheme = csome_list_var.first()) {
                            if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                                match = scheme;
                            }
                        }
                    }
                }
            }
            return list_utilities.sublisp_boolean(match);
        }
    }

    public static SubLObject uri_scheme_p(final SubLObject v_object, SubLObject official_onlyP, SubLObject start, SubLObject end) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLObject match = NIL;
        if (NIL == match) {
            SubLObject csome_list_var = $official_uri_schemes$.getGlobalValue();
            SubLObject scheme = NIL;
            scheme = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            } 
        }
        if ((NIL == official_onlyP) && (NIL == match)) {
            SubLObject csome_list_var = $unofficial_uri_schemes$.getGlobalValue();
            SubLObject scheme = NIL;
            scheme = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            } 
        }
        return list_utilities.sublisp_boolean(match);
    }

    /**
     *
     *
     * @return the starting position of a legal url protocol embedded in
    string.  Starts from position idx in string, which points to a ':'.
     * @unknown belasco
     */
    @LispMethod(comment = "@return the starting position of a legal url protocol embedded in\r\nstring.  Starts from position idx in string, which points to a \':\'.\r\n@unknown belasco")
    public static final SubLObject find_url_beginning_alt(SubLObject string, SubLObject length, SubLObject idx) {
        if (!((string.isString() && length.isNumber()) && idx.isNumber())) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = $valid_url_beginnings$.getGlobalValue();
            SubLObject protocol = NIL;
            for (protocol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , protocol = cdolist_list_var.first()) {
                {
                    SubLObject begin_idx = subtract(idx, string_utilities.char_position(CHAR_colon, protocol, UNPROVIDED));
                    SubLObject end_idx = add(begin_idx, length(protocol));
                    if ((begin_idx.numGE(ZERO_INTEGER) && end_idx.numL(length)) && (NIL != Strings.stringE(protocol, subseq(string, begin_idx, end_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        return begin_idx;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return the starting position of a legal url protocol embedded in
    string.  Starts from position idx in string, which points to a ':'.
     * @unknown belasco
     */
    @LispMethod(comment = "@return the starting position of a legal url protocol embedded in\r\nstring.  Starts from position idx in string, which points to a \':\'.\r\n@unknown belasco")
    public static SubLObject find_url_beginning(final SubLObject string, final SubLObject length, final SubLObject idx) {
        if (((!string.isString()) || (!length.isNumber())) || (!idx.isNumber())) {
            return NIL;
        }
        SubLObject cdolist_list_var = $valid_url_beginnings$.getGlobalValue();
        SubLObject protocol = NIL;
        protocol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject begin_idx = subtract(idx, string_utilities.char_position(CHAR_colon, protocol, UNPROVIDED));
            final SubLObject end_idx = add(begin_idx, length(protocol));
            if ((begin_idx.numGE(ZERO_INTEGER) && end_idx.numL(length)) && (NIL != Strings.stringE(protocol, subseq(string, begin_idx, end_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return begin_idx;
            }
            cdolist_list_var = cdolist_list_var.rest();
            protocol = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns the last position of a url.  Starts from position url-idx
     * in string.
     *
     * @unknown belasco
     */
    @LispMethod(comment = "Returns the last position of a url.  Starts from position url-idx\r\nin string.\r\n\r\n@unknown belasco\nReturns the last position of a url.  Starts from position url-idx\nin string.")
    public static final SubLObject find_url_end_alt(SubLObject string, SubLObject length, SubLObject url_idx) {
        if (length == UNPROVIDED) {
            length = length(string);
        }
        if (url_idx == UNPROVIDED) {
            url_idx = ZERO_INTEGER;
        }
        if (!((string.isString() && length.isNumber()) && url_idx.isNumber())) {
            return NIL;
        }
        {
            SubLObject end_idx = list_utilities.position_if_not(VALID_URL_CHAR_P, string, symbol_function(IDENTITY), url_idx, UNPROVIDED);
            if (NIL == end_idx) {
                end_idx = length;
            }
            if (!(url_idx.eql(ZERO_INTEGER) && end_idx.eql(length))) {
                while (end_idx.isPositive() && (NIL != member(Strings.sublisp_char(string, number_utilities.f_1_(end_idx)), $url_delimiters$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) {
                    end_idx = subtract(end_idx, ONE_INTEGER);
                } 
            }
            {
                SubLObject address = subseq(string, url_idx, end_idx);
                if (NIL != com.cyc.cycjava.cycl.web_utilities.url_p(address)) {
                    return end_idx;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Returns the last position of a url.  Starts from position url-idx
     * in string.
     *
     * @unknown belasco
     */
    @LispMethod(comment = "Returns the last position of a url.  Starts from position url-idx\r\nin string.\r\n\r\n@unknown belasco\nReturns the last position of a url.  Starts from position url-idx\nin string.")
    public static SubLObject find_url_end(final SubLObject string, SubLObject length, SubLObject url_idx) {
        if (length == UNPROVIDED) {
            length = length(string);
        }
        if (url_idx == UNPROVIDED) {
            url_idx = ZERO_INTEGER;
        }
        if (((!string.isString()) || (!length.isNumber())) || (!url_idx.isNumber())) {
            return NIL;
        }
        SubLObject end_idx = list_utilities.position_if_not(VALID_URL_CHAR_P, string, symbol_function(IDENTITY), url_idx, UNPROVIDED);
        if (NIL == end_idx) {
            end_idx = length;
        }
        if ((!url_idx.eql(ZERO_INTEGER)) || (!end_idx.eql(length))) {
            while (end_idx.isPositive() && (NIL != member(Strings.sublisp_char(string, number_utilities.f_1_(end_idx)), $url_delimiters$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) {
                end_idx = subtract(end_idx, ONE_INTEGER);
            } 
        }
        final SubLObject address = subseq(string, url_idx, end_idx);
        if (NIL != url_p(address)) {
            return end_idx;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown -- Quick approximation of what's allowed in a valid URL
     */
    @LispMethod(comment = "@unknown -- Quick approximation of what\'s allowed in a valid URL")
    public static final SubLObject valid_url_char_p_alt(SubLObject v_char) {
        return makeBoolean(((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $valid_non_alphanumeric_url_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown -- Quick approximation of what's allowed in a valid URL
     */
    @LispMethod(comment = "@unknown -- Quick approximation of what\'s allowed in a valid URL")
    public static SubLObject valid_url_char_p(final SubLObject v_char) {
        return makeBoolean(((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $valid_non_alphanumeric_url_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Resolve BASE + LOCAL-NAME into an absolute URI.
     *
     * @unknown See test case table for examples.
     */
    @LispMethod(comment = "Resolve BASE + LOCAL-NAME into an absolute URI.\r\n\r\n@unknown See test case table for examples.")
    public static final SubLObject resolve_relative_uri_alt(SubLObject base, SubLObject local_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_base = com.cyc.cycjava.cycl.web_utilities.canonicalize_relative_uri(base, local_name);
                SubLObject new_local_name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return cconcatenate(new_base, new_local_name);
            }
        }
    }

    /**
     * Resolve BASE + LOCAL-NAME into an absolute URI.
     *
     * @unknown See test case table for examples.
     */
    @LispMethod(comment = "Resolve BASE + LOCAL-NAME into an absolute URI.\r\n\r\n@unknown See test case table for examples.")
    public static SubLObject resolve_relative_uri(final SubLObject base, final SubLObject local_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_base = canonicalize_relative_uri(base, local_name);
        final SubLObject new_local_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cconcatenate(new_base, new_local_name);
    }

    /**
     * Put BASE and LOCAL-NAME into a canonical form, such that the
     * two parts can be simply concatenated to form the corresponding absolute url
     */
    @LispMethod(comment = "Put BASE and LOCAL-NAME into a canonical form, such that the\r\ntwo parts can be simply concatenated to form the corresponding absolute url\nPut BASE and LOCAL-NAME into a canonical form, such that the\ntwo parts can be simply concatenated to form the corresponding absolute url")
    public static final SubLObject canonicalize_relative_uri_alt(SubLObject base, SubLObject local_name) {
        while (NIL != string_utilities.starts_with(local_name, $str_alt88$___)) {
            base = com.cyc.cycjava.cycl.web_utilities.remove_last_path_element(base);
            local_name = string_utilities.substring(local_name, THREE_INTEGER, UNPROVIDED);
        } 
        if (NIL != string_utilities.starts_with(local_name, $str_alt89$__)) {
            {
                SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != colon_pos) {
                    base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(colon_pos));
                }
            }
        } else {
            if (((NIL != com.cyc.cycjava.cycl.web_utilities.uri_lacks_path_componentP(base)) && (!CHAR_hash.eql(string_utilities.last_char(base)))) && (!CHAR_hash.eql(string_utilities.first_char(local_name)))) {
                base = cconcatenate(base, $str_alt81$_);
            } else {
                if (NIL != string_utilities.starts_with(local_name, $str_alt81$_)) {
                    {
                        SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != colon_pos) {
                            {
                                SubLObject domain_name_end = position(CHAR_slash, base, symbol_function(EQL), symbol_function(IDENTITY), add(THREE_INTEGER, colon_pos), UNPROVIDED);
                                base = string_utilities.substring(base, ZERO_INTEGER, domain_name_end);
                            }
                        }
                    }
                } else {
                    if (!(((NIL != string_utilities.empty_string_p(local_name)) || string_utilities.first_char(local_name).eql(CHAR_hash)) || string_utilities.last_char(base).eql(CHAR_hash))) {
                        {
                            SubLObject slash_pos = list_utilities.position_from_end(CHAR_slash, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != list_utilities.lengthG(base, number_utilities.f_1X(slash_pos), UNPROVIDED)) {
                                base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(slash_pos));
                            }
                        }
                    }
                }
            }
        }
        return values(base, local_name);
    }

    /**
     * Put BASE and LOCAL-NAME into a canonical form, such that the
     * two parts can be simply concatenated to form the corresponding absolute url
     */
    @LispMethod(comment = "Put BASE and LOCAL-NAME into a canonical form, such that the\r\ntwo parts can be simply concatenated to form the corresponding absolute url\nPut BASE and LOCAL-NAME into a canonical form, such that the\ntwo parts can be simply concatenated to form the corresponding absolute url")
    public static SubLObject canonicalize_relative_uri(SubLObject base, SubLObject local_name) {
        while (NIL != string_utilities.starts_with(local_name, $str104$___)) {
            base = remove_last_path_element(base);
            local_name = string_utilities.substring(local_name, THREE_INTEGER, UNPROVIDED);
        } 
        if (NIL != string_utilities.starts_with(local_name, $str105$__)) {
            final SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != colon_pos) {
                base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(colon_pos));
            }
        } else
            if (((((NIL != string_utilities.non_empty_string_p(base)) && (NIL != uri_lacks_path_componentP(base))) && (!CHAR_hash.eql(string_utilities.last_char(base)))) && (NIL != string_utilities.non_empty_string_p(local_name))) && (!CHAR_hash.eql(string_utilities.first_char(local_name)))) {
                base = cconcatenate(base, $str29$_);
            } else
                if (NIL != string_utilities.starts_with(local_name, $str29$_)) {
                    final SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != colon_pos) {
                        final SubLObject domain_name_end = position(CHAR_slash, base, symbol_function(EQL), symbol_function(IDENTITY), add(THREE_INTEGER, colon_pos), UNPROVIDED);
                        base = string_utilities.substring(base, ZERO_INTEGER, domain_name_end);
                    }
                } else
                    if (((NIL == string_utilities.empty_string_p(local_name)) && (!string_utilities.first_char(local_name).eql(CHAR_hash))) && (!string_utilities.last_char(base).eql(CHAR_hash))) {
                        final SubLObject slash_pos = list_utilities.position_from_end(CHAR_slash, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.lengthG(base, number_utilities.f_1X(slash_pos), UNPROVIDED)) {
                            base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(slash_pos));
                        }
                    }



        return values(base, local_name);
    }

    public static final SubLObject remove_last_path_element_alt(SubLObject uri) {
        {
            SubLObject last_slash_pos = list_utilities.position_from_end(CHAR_slash, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject directory_start = list_utilities.position_from_end(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, last_slash_pos);
            return string_utilities.substring(uri, ZERO_INTEGER, directory_start);
        }
    }

    public static SubLObject remove_last_path_element(final SubLObject uri) {
        final SubLObject last_slash_pos = list_utilities.position_from_end(CHAR_slash, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject directory_start = list_utilities.position_from_end(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, last_slash_pos);
        return string_utilities.substring(uri, ZERO_INTEGER, directory_start);
    }

    public static final SubLObject uri_lacks_path_componentP_alt(SubLObject uri) {
        {
            SubLObject colon_pos = position(CHAR_colon, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject path_start = (NIL != colon_pos) ? ((SubLObject) (position(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), add(colon_pos, THREE_INTEGER), UNPROVIDED))) : NIL;
            return sublisp_null(path_start);
        }
    }

    public static SubLObject uri_lacks_path_componentP(final SubLObject uri) {
        final SubLObject colon_pos = position(CHAR_colon, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject path_start = (NIL != colon_pos) ? position(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), add(colon_pos, THREE_INTEGER), UNPROVIDED) : NIL;
        return sublisp_null(path_start);
    }

    public static SubLObject clear_soap_name() {
        final SubLObject cs = $soap_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_soap_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($soap_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject soap_name_internal(final SubLObject local_name) {
        return cconcatenate($str116$soap_, local_name);
    }

    public static SubLObject soap_name(final SubLObject local_name) {
        SubLObject caching_state = $soap_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOAP_NAME, $soap_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(soap_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_soap_expanded_name() {
        final SubLObject cs = $soap_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_soap_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($soap_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject soap_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate($soap_envelope_uri$.getGlobalValue(), local_name);
    }

    public static SubLObject soap_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $soap_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOAP_EXPANDED_NAME, $soap_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(soap_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject soap_envelope_sexpr_p(final SubLObject sexpr) {
        return equal(soap_expanded_name($$$Envelope), xml_parsing_utilities.xml_sexpr_type(sexpr));
    }

    public static SubLObject clear_perform_soap_post_cached() {
        final SubLObject cs = $perform_soap_post_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        return memoization_state.caching_state_remove_function_results_with_args($perform_soap_post_cached_caching_state$.getGlobalValue(), list(query, soap_action_uri, machine, url, port, keep_aliveP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject perform_soap_post_cached_internal(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject keep_aliveP) {
        return perform_soap_post(query, soap_action_uri, machine, url, port, keep_aliveP);
    }

    public static SubLObject perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        SubLObject caching_state = $perform_soap_post_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PERFORM_SOAP_POST_CACHED, $perform_soap_post_cached_caching_state$, $int$256, EQUAL, SIX_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(query, soap_action_uri, machine, url, port, keep_aliveP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (soap_action_uri.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (machine.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (url.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (port.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && keep_aliveP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(perform_soap_post_cached_internal(query, soap_action_uri, machine, url, port, keep_aliveP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query, soap_action_uri, machine, url, port, keep_aliveP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject perform_soap_post(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        SubLObject response = NIL;
        SubLObject sexpr = NIL;
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, machine, real_port)) {
                send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, $POST, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, T, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $str123$text_xml__charset_utf_8, $SOAP_ACTION_URI, soap_action_uri }));
                response = http_response_body(slack_read_until_eof(in_stream, UNPROVIDED));
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != in_stream) {
                    close(in_stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (!CHAR_less.eql(string_utilities.first_char(response))) {
            final SubLObject start = position(CHAR_less, response, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != start) {
                response = string_utilities.substring(response, start, UNPROVIDED);
            }
        }
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(response, ZERO_INTEGER, NIL);
            sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_tokenize(stream, T, T, T));
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return sexpr;
    }

    public static SubLObject make_soap_message(final SubLObject tns, final SubLObject header_properties, final SubLObject body_elements, SubLObject encoding, SubLObject standalone, SubLObject header_elements) {
        if (encoding == UNPROVIDED) {
            encoding = $str124$US_ASCII;
        }
        if (standalone == UNPROVIDED) {
            standalone = T;
        }
        if (header_elements == UNPROVIDED) {
            header_elements = NIL;
        }
        xml_utilities.xml_header(xml_utilities.xml_version(), encoding, standalone);
        final SubLObject name_var = soap_name($$$Envelope);
        xml_utilities.xml_start_tag_internal(name_var, list($str125$xmlns_soap, $soap_envelope_uri$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.non_empty_list_p(header_properties)) || (NIL != list_utilities.non_empty_list_p(header_elements))) {
            final SubLObject name_var_$6 = soap_name($$$Header);
            xml_utilities.xml_start_tag_internal(name_var_$6, NIL, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = header_properties;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject attribute = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list127);
                attribute = current.first();
                current = value = current.rest();
                final SubLObject name_var_$7 = attribute;
                xml_utilities.xml_start_tag_internal(name_var_$7, list($$$xmlns, tns), NIL, UNPROVIDED, UNPROVIDED);
                xml_utilities.xml_write_string(value, UNPROVIDED, UNPROVIDED);
                xml_utilities.xml_end_tag_internal(name_var_$7);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            cdolist_list_var = header_elements;
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xml_utilities.xml_write(element, NIL);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
            xml_utilities.xml_end_tag_internal(name_var_$6);
        }
        final SubLObject name_var_$8 = soap_name($$$Body);
        xml_utilities.xml_start_tag_internal(name_var_$8, NIL, NIL, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = body_elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xml_utilities.xml_write(element, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        xml_utilities.xml_end_tag_internal(name_var_$8);
        xml_utilities.xml_end_tag_internal(name_var);
        return NIL;
    }

    /**
     * Return the status code from HTTP header string.
     * The format of the header is: HTTP/x.y z, where
     * x.y is the version number and z is the status code
     * (e.g., HTTP/1.1 302).
     */
    @LispMethod(comment = "Return the status code from HTTP header string.\r\nThe format of the header is: HTTP/x.y z, where\r\nx.y is the version number and z is the status code\r\n(e.g., HTTP/1.1 302).\nReturn the status code from HTTP header string.\nThe format of the header is: HTTP/x.y z, where\nx.y is the version number and z is the status code\n(e.g., HTTP/1.1 302).")
    public static final SubLObject get_http_status_code_alt(SubLObject header_string) {
        {
            SubLObject header_tokenized = delete($str_alt69$, string_utilities.split_string(header_string, $list_alt200), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ($$$HTTP.equal(Strings.string_upcase(header_tokenized.first(), UNPROVIDED, UNPROVIDED))) {
                return string_utilities.string_to_integer(third(header_tokenized));
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Return the status code from HTTP header string.\r\nThe format of the header is: HTTP/x.y z, where\r\nx.y is the version number and z is the status code\r\n(e.g., HTTP/1.1 302).\nReturn the status code from HTTP header string.\nThe format of the header is: HTTP/x.y z, where\nx.y is the version number and z is the status code\n(e.g., HTTP/1.1 302).")
    public static SubLObject get_http_status_code(final SubLObject header_string) {
        final SubLObject header_tokenized = delete($str86$, string_utilities.split_string(header_string, $list130), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ($$$HTTP.equal(Strings.string_upcase(header_tokenized.first(), UNPROVIDED, UNPROVIDED))) {
            return string_utilities.string_to_integer(third(header_tokenized));
        }
        return NIL;
    }/**
     * Return the status code from HTTP header string.
     * The format of the header is: HTTP/x.y z, where
     * x.y is the version number and z is the status code
     * (e.g., HTTP/1.1 302).
     */


    /**
     * Return T iff STRING is the header of an HTML redirection page.
     */
    @LispMethod(comment = "Return T iff STRING is the header of an HTML redirection page.")
    public static final SubLObject html_redirection_header_p_alt(SubLObject string) {
        {
            SubLObject code = com.cyc.cycjava.cycl.web_utilities.get_http_status_code(string);
            return list_utilities.alist_has_keyP($http_redirection_codes$.getGlobalValue(), code, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Return T iff STRING is the header of an HTML redirection page.")
    public static SubLObject html_redirection_header_p(final SubLObject string) {
        final SubLObject code = get_http_status_code(string);
        return list_utilities.alist_has_keyP($http_redirection_codes$.getGlobalValue(), code, UNPROVIDED);
    }/**
     * Return T iff STRING is the header of an HTML redirection page.
     */


    /**
     * Return the redirection of STRING, which is the header of an HTML redirection page.
     */
    @LispMethod(comment = "Return the redirection of STRING, which is the header of an HTML redirection page.")
    public static final SubLObject html_redirection_url_alt(SubLObject string) {
        {
            SubLObject marker = $str_alt202$Location__;
            SubLObject marker_start = search(marker, string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != marker_start) {
                {
                    SubLObject location_start = add(marker_start, length(marker));
                    SubLObject location_end = position_if(symbol_function(WHITESPACEP), string, symbol_function(IDENTITY), location_start, UNPROVIDED);
                    if (NIL != location_end) {
                        return string_utilities.substring(string, location_start, location_end);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the redirection of STRING, which is the header of an HTML redirection page.")
    public static SubLObject html_redirection_url(final SubLObject string) {
        final SubLObject marker = $str132$Location__;
        final SubLObject marker_start = search(marker, string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != marker_start) {
            final SubLObject location_start = add(marker_start, length(marker));
            final SubLObject location_end = position_if(symbol_function(WHITESPACEP), string, symbol_function(IDENTITY), location_start, UNPROVIDED);
            if (NIL != location_end) {
                return string_utilities.substring(string, location_start, location_end);
            }
        }
        return NIL;
    }/**
     * Return the redirection of STRING, which is the header of an HTML redirection page.
     */


    /**
     * Parse HTTP-URL into its four components : MACHINE PORT URL QUERY
     */
    @LispMethod(comment = "Parse HTTP-URL into its four components : MACHINE PORT URL QUERY")
    public static final SubLObject parse_http_url_alt(SubLObject http_url) {
        {
            SubLObject machine = NIL;
            SubLObject port = NIL;
            SubLObject url = NIL;
            SubLObject query = NIL;
            if (NIL != search($str_alt203$http___, http_url, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject machine_start = length($str_alt203$http___);
                    SubLObject port_start = position(CHAR_colon, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
                    SubLObject url_start = position(CHAR_slash, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
                    SubLObject machine_end = NIL;
                    if (NIL == url_start) {
                        url_start = length(http_url);
                    }
                    if ((NIL != port_start) && port_start.numL(url_start)) {
                        machine_end = port_start;
                        port = read_from_string_ignoring_errors(http_url, NIL, NIL, add(port_start, ONE_INTEGER), url_start);
                    } else {
                        machine_end = url_start;
                        port = $DEFAULT;
                    }
                    machine = string_utilities.substring(http_url, machine_start, machine_end);
                    {
                        SubLObject query_start = position(CHAR_question, http_url, symbol_function(EQL), symbol_function(IDENTITY), url_start, UNPROVIDED);
                        SubLObject url_end = NIL;
                        if (NIL != query_start) {
                            url_end = query_start;
                        }
                        url = string_utilities.substring(http_url, url_start, url_end);
                        if (NIL != query_start) {
                            query = string_utilities.substring(http_url, add(ONE_INTEGER, query_start), UNPROVIDED);
                        } else {
                            query = $str_alt69$;
                        }
                    }
                }
            }
            return values(machine, port, url, query);
        }
    }

    @LispMethod(comment = "Parse HTTP-URL into its four components : MACHINE PORT URL QUERY")
    public static SubLObject parse_http_url(final SubLObject http_url) {
        SubLObject machine = NIL;
        SubLObject port = NIL;
        SubLObject url = NIL;
        SubLObject query = NIL;
        if ((NIL != search($str134$http___, http_url, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search($str135$https___, http_url, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject machine_start = length($str134$http___);
            final SubLObject port_start = position(CHAR_colon, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
            SubLObject url_start = position(CHAR_slash, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
            SubLObject machine_end = NIL;
            if (NIL == url_start) {
                url_start = length(http_url);
            }
            if ((NIL != port_start) && port_start.numL(url_start)) {
                machine_end = port_start;
                port = read_from_string_ignoring_errors(http_url, NIL, NIL, add(port_start, ONE_INTEGER), url_start);
            } else {
                machine_end = url_start;
                port = $DEFAULT;
            }
            machine = string_utilities.substring(http_url, machine_start, machine_end);
            final SubLObject query_start = position(CHAR_question, http_url, symbol_function(EQL), symbol_function(IDENTITY), url_start, UNPROVIDED);
            SubLObject url_end = NIL;
            if (NIL != query_start) {
                url_end = query_start;
            }
            url = string_utilities.substring(http_url, url_start, url_end);
            if (NIL != query_start) {
                query = string_utilities.substring(http_url, add(ONE_INTEGER, query_start), UNPROVIDED);
            } else {
                query = $str86$;
            }
        }
        return values(machine, port, url, query);
    }/**
     * Parse HTTP-URL into its four components : MACHINE PORT URL QUERY
     */


    /**
     * READ from IN-STREAM until EOF is reached.
     * Return a string constituting the characters read.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */
    @LispMethod(comment = "READ from IN-STREAM until EOF is reached.\r\nReturn a string constituting the characters read.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until EOF is reached.\nReturn a string constituting the characters read.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static final SubLObject read_until_eof_alt(SubLObject in_stream, SubLObject buffer) {
        if (buffer == UNPROVIDED) {
            buffer = NIL;
        }
        if (NIL == buffer) {
            buffer = Strings.make_string($int$100, UNPROVIDED);
        }
        {
            SubLObject text = $str_alt69$;
            SubLObject length = length(buffer);
            SubLObject index = ZERO_INTEGER;
            SubLObject read_char = NIL;
            for (read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); NIL != read_char; read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
                Strings.set_char(buffer, index, read_char);
                index = add(index, ONE_INTEGER);
                if (index.numE(length)) {
                    text = cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index));
                    index = ZERO_INTEGER;
                }
            }
            return values(cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index)), sublisp_null(read_char));
        }
    }

    @LispMethod(comment = "READ from IN-STREAM until EOF is reached.\r\nReturn a string constituting the characters read.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until EOF is reached.\nReturn a string constituting the characters read.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static SubLObject read_until_eof(final SubLObject in_stream, SubLObject buffer) {
        if (buffer == UNPROVIDED) {
            buffer = NIL;
        }
        if (NIL == buffer) {
            buffer = Strings.make_string($int$100, UNPROVIDED);
        }
        SubLObject text = $str86$;
        final SubLObject length = length(buffer);
        SubLObject index = ZERO_INTEGER;
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); NIL != read_char; read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            Strings.set_char(buffer, index, read_char);
            index = add(index, ONE_INTEGER);
            if (index.numE(length)) {
                text = cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index));
                index = ZERO_INTEGER;
            }
        }
        return values(cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index)), sublisp_null(read_char));
    }/**
     * READ from IN-STREAM until EOF is reached.
     * Return a string constituting the characters read.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */


    /**
     * READ from IN-STREAM until CHAR is seen.
     * Return a string constituting the characters read, not including CHAR.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */
    @LispMethod(comment = "READ from IN-STREAM until CHAR is seen.\r\nReturn a string constituting the characters read, not including CHAR.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until CHAR is seen.\nReturn a string constituting the characters read, not including CHAR.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static final SubLObject read_until_char_alt(SubLObject in_stream, SubLObject v_char, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        {
            SubLObject read_char = NIL;
            for (read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); !(read_char.eql(v_char) || (NIL == read_char)); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
                write_char(read_char, scratch_stream);
            }
            return values(get_output_stream_string(scratch_stream), sublisp_null(read_char));
        }
    }

    @LispMethod(comment = "READ from IN-STREAM until CHAR is seen.\r\nReturn a string constituting the characters read, not including CHAR.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until CHAR is seen.\nReturn a string constituting the characters read, not including CHAR.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static SubLObject read_until_char(final SubLObject in_stream, final SubLObject v_char, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); (!read_char.eql(v_char)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), sublisp_null(read_char));
    }/**
     * READ from IN-STREAM until CHAR is seen.
     * Return a string constituting the characters read, not including CHAR.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */


    public static SubLObject read_while(final SubLObject in_stream, final SubLObject test, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject peek_char;
        for (peek_char = NIL, peek_char = peek_char(NIL, in_stream, NIL, NIL, UNPROVIDED); (NIL != peek_char) && (NIL != funcall(test, peek_char)); peek_char = peek_char(NIL, in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char(in_stream, NIL, NIL, UNPROVIDED), scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), peek_char);
    }

    public static SubLObject read_until_char_unless(final SubLObject in_stream, final SubLObject v_char, final SubLObject unless_char, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject last_char;
        SubLObject read_char;
        for (last_char = NIL, read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); ((!read_char.eql(v_char)) || last_char.eql(unless_char)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            last_char = read_char;
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), sublisp_null(read_char));
    }

    /**
     * READ from IN-STREAM until one of CHARS is seen.
     * Return a string constituting the characters read, not including the matching character.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */
    @LispMethod(comment = "READ from IN-STREAM until one of CHARS is seen.\r\nReturn a string constituting the characters read, not including the matching character.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until one of CHARS is seen.\nReturn a string constituting the characters read, not including the matching character.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static final SubLObject read_until_one_of_alt(SubLObject in_stream, SubLObject chars, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        {
            SubLObject read_char = NIL;
            for (read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); !((NIL != member(read_char, chars, UNPROVIDED, UNPROVIDED)) || (NIL == read_char)); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
                write_char(read_char, scratch_stream);
            }
            return values(get_output_stream_string(scratch_stream), read_char);
        }
    }

    @LispMethod(comment = "READ from IN-STREAM until one of CHARS is seen.\r\nReturn a string constituting the characters read, not including the matching character.\r\nBUFFER, if provided, is a string to use as a buffer while reading.\nREAD from IN-STREAM until one of CHARS is seen.\nReturn a string constituting the characters read, not including the matching character.\nBUFFER, if provided, is a string to use as a buffer while reading.")
    public static SubLObject read_until_one_of(final SubLObject in_stream, final SubLObject chars, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); (NIL == member(read_char, chars, UNPROVIDED, UNPROVIDED)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), read_char);
    }/**
     * READ from IN-STREAM until one of CHARS is seen.
     * Return a string constituting the characters read, not including the matching character.
     * BUFFER, if provided, is a string to use as a buffer while reading.
     */


    /**
     * READ from IN-STREAM until EOF is reached, or MAX-CHARS have been read.
     * Return a string constituting the characters read.
     */
    @LispMethod(comment = "READ from IN-STREAM until EOF is reached, or MAX-CHARS have been read.\r\nReturn a string constituting the characters read.\nREAD from IN-STREAM until EOF is reached, or MAX-CHARS have been read.\nReturn a string constituting the characters read.")
    public static final SubLObject slack_read_until_eof_alt(SubLObject in_stream, SubLObject max_chars) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        {
            SubLObject result_string = NIL;
            SubLObject eofP = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject read_char = NIL;
                    SubLObject read_count = NIL;
                    for (read_char = com.cyc.cycjava.cycl.web_utilities.slack_read_char(in_stream, NIL, NIL, UNPROVIDED), read_count = ZERO_INTEGER; !((NIL == read_char) || ((NIL != max_chars) && read_count.numGE(max_chars))); read_char = com.cyc.cycjava.cycl.web_utilities.slack_read_char(in_stream, NIL, NIL, UNPROVIDED) , read_count = number_utilities.f_1X(read_count)) {
                        write_char(read_char, stream);
                    }
                    eofP = sublisp_null(read_char);
                }
                result_string = get_output_stream_string(stream);
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
            return values(result_string, eofP);
        }
    }

    @LispMethod(comment = "READ from IN-STREAM until EOF is reached, or MAX-CHARS have been read.\r\nReturn a string constituting the characters read.\nREAD from IN-STREAM until EOF is reached, or MAX-CHARS have been read.\nReturn a string constituting the characters read.")
    public static SubLObject slack_read_until_eof(final SubLObject in_stream, SubLObject max_chars) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        SubLObject result_string = NIL;
        SubLObject eofP = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject read_char;
            SubLObject read_count;
            for (read_char = NIL, read_count = NIL, read_char = slack_read_char(in_stream, NIL, NIL, UNPROVIDED), read_count = ZERO_INTEGER; (NIL != read_char) && ((NIL == max_chars) || (!read_count.numGE(max_chars))); read_char = slack_read_char(in_stream, NIL, NIL, UNPROVIDED) , read_count = number_utilities.f_1X(read_count)) {
                write_char(read_char, stream);
            }
            eofP = sublisp_null(read_char);
            result_string = get_output_stream_string(stream);
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
        return values(result_string, eofP);
    }/**
     * READ from IN-STREAM until EOF is reached, or MAX-CHARS have been read.
     * Return a string constituting the characters read.
     */


    public static final SubLObject try_error_message_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject msg = NIL;
            SubLObject exp = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt205);
            msg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt205);
            exp = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(msg, $list_alt158)), list(CATCH_ERROR_MESSAGE, list(msg), exp), append(body, NIL));
            }
        }
    }

    public static SubLObject try_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject msg = NIL;
        SubLObject exp = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        msg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        exp = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(msg, $list138)), list(CATCH_ERROR_MESSAGE, list(msg), exp), append(body, NIL));
    }

    public static final SubLObject slack_read_char_alt(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        if (NIL != eof_error_p) {
            return read_char(stream, eof_error_p, eof_value, recursive_p);
        } else {
            {
                SubLObject ch = NIL;
                SubLObject msg = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                ch = read_char(stream, eof_error_p, eof_value, recursive_p);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != msg) {
                    format(T, $str_alt207$_____Averted__connection_reset_by);
                    ch = eof_value;
                }
                return ch;
            }
        }
    }

    public static SubLObject slack_read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != eof_error_p) {
            return read_char(stream, eof_error_p, eof_value, recursive_p);
        }
        SubLObject ch = NIL;
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    ch = read_char(stream, eof_error_p, eof_value, recursive_p);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != msg) {
            format(T, $str141$_____Averted__connection_reset_by);
            ch = eof_value;
        }
        return ch;
    }

    /**
     * Reads data from INSTREAM that has been chunked with the HTTP/1.1 chunked
     * transfer encoding. i.e., hex-length CRLF [hex-length bytes]
     */
    @LispMethod(comment = "Reads data from INSTREAM that has been chunked with the HTTP/1.1 chunked\r\ntransfer encoding. i.e., hex-length CRLF [hex-length bytes]\nReads data from INSTREAM that has been chunked with the HTTP/1.1 chunked\ntransfer encoding. i.e., hex-length CRLF [hex-length bytes]")
    public static final SubLObject read_http_chunk_alt(SubLObject instream) {
        {
            SubLObject chunk_length_string = string_utilities.network_read_line(instream, NIL, $$$0);
            SubLObject chunk_length = parse_integer(chunk_length_string, ZERO_INTEGER, NIL, SIXTEEN_INTEGER, T);
            SubLObject buffer = string_utilities.$empty_string$.getGlobalValue();
            if (NIL != chunk_length) {
                buffer = Strings.make_string(chunk_length, UNPROVIDED);
                read_sequence(buffer, instream, ZERO_INTEGER, chunk_length);
                string_utilities.network_read_line(instream, NIL, NIL);
            }
            return buffer;
        }
    }

    @LispMethod(comment = "Reads data from INSTREAM that has been chunked with the HTTP/1.1 chunked\r\ntransfer encoding. i.e., hex-length CRLF [hex-length bytes]\nReads data from INSTREAM that has been chunked with the HTTP/1.1 chunked\ntransfer encoding. i.e., hex-length CRLF [hex-length bytes]")
    public static SubLObject read_http_chunk(final SubLObject instream) {
        final SubLObject chunk_length_string = string_utilities.network_read_line(instream, NIL, $$$0, UNPROVIDED);
        final SubLObject chunk_length = parse_integer(chunk_length_string, ZERO_INTEGER, NIL, SIXTEEN_INTEGER, T);
        SubLObject buffer = string_utilities.$empty_string$.getGlobalValue();
        if (NIL != chunk_length) {
            buffer = Strings.make_string(chunk_length, UNPROVIDED);
            read_sequence(buffer, instream, ZERO_INTEGER, chunk_length);
            string_utilities.network_read_line(instream, NIL, NIL, UNPROVIDED);
        }
        return buffer;
    }/**
     * Reads data from INSTREAM that has been chunked with the HTTP/1.1 chunked
     * transfer encoding. i.e., hex-length CRLF [hex-length bytes]
     */


    /**
     * Writes LINE to OUTSTREAM using the HTTP/1.1 chunked transfer encoding.
     */
    @LispMethod(comment = "Writes LINE to OUTSTREAM using the HTTP/1.1 chunked transfer encoding.")
    public static final SubLObject write_http_chunk_alt(SubLObject outstream, SubLObject line) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
                try {
                    $print_base$.bind(SIXTEEN_INTEGER, thread);
                    princ(length(line), outstream);
                } finally {
                    $print_base$.rebind(_prev_bind_0, thread);
                }
            }
            com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
            write_string(line, outstream, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.web_utilities.http_network_terpri(outstream);
            return NIL;
        }
    }

    @LispMethod(comment = "Writes LINE to OUTSTREAM using the HTTP/1.1 chunked transfer encoding.")
    public static SubLObject write_http_chunk(final SubLObject outstream, final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
        try {
            $print_base$.bind(SIXTEEN_INTEGER, thread);
            princ(length(line), outstream);
        } finally {
            $print_base$.rebind(_prev_bind_0, thread);
        }
        http_network_terpri(outstream);
        write_string(line, outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        return NIL;
    }/**
     * Writes LINE to OUTSTREAM using the HTTP/1.1 chunked transfer encoding.
     */


    public static final SubLObject http_network_terpri_alt(SubLObject network_outstream) {
        write_char(code_char(THIRTEEN_INTEGER), network_outstream);
        write_char(code_char(TEN_INTEGER), network_outstream);
        return NIL;
    }

    public static SubLObject http_network_terpri(final SubLObject network_outstream) {
        write_char(code_char(THIRTEEN_INTEGER), network_outstream);
        write_char(code_char(TEN_INTEGER), network_outstream);
        return NIL;
    }

    /**
     *
     *
     * @param stream
     * 		Output stream
     * @param universal-time
     * 		Universal time
     * @unknown Writes UNIVERSAL-TIME to STREAM, using the standard format
    preferred by HTTP/1.1 (RFC 2616).
     * @return NIL
     */
    @LispMethod(comment = "@param stream\r\n\t\tOutput stream\r\n@param universal-time\r\n\t\tUniversal time\r\n@unknown Writes UNIVERSAL-TIME to STREAM, using the standard format\r\npreferred by HTTP/1.1 (RFC 2616).\r\n@return NIL")
    public static final SubLObject write_http_date_alt(SubLObject stream, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_universal_time(universal_time, ZERO_INTEGER);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject date = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                SubLObject day = thread.seventhMultipleValue();
                thread.resetMultipleValues();
                write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, UNPROVIDED, UNPROVIDED);
                write_string($str_alt59$__, stream, UNPROVIDED, UNPROVIDED);
                print_2_digit_nonnegative_integer(date, stream);
                write_char(CHAR_space, stream);
                write_string(numeric_date_utilities.month_number_abbrev(month), stream, UNPROVIDED, UNPROVIDED);
                write_char(CHAR_space, stream);
                princ(year, stream);
                write_char(CHAR_space, stream);
                print_2_digit_nonnegative_integer(hour, stream);
                write_char(CHAR_colon, stream);
                print_2_digit_nonnegative_integer(minute, stream);
                write_char(CHAR_colon, stream);
                print_2_digit_nonnegative_integer(second, stream);
                write_string($str_alt209$_GMT, stream, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param stream
     * 		Output stream
     * @param universal-time
     * 		Universal time
     * @unknown Writes UNIVERSAL-TIME to STREAM, using the standard format
    preferred by HTTP/1.1 (RFC 2616).
     * @return NIL
     */
    @LispMethod(comment = "@param stream\r\n\t\tOutput stream\r\n@param universal-time\r\n\t\tUniversal time\r\n@unknown Writes UNIVERSAL-TIME to STREAM, using the standard format\r\npreferred by HTTP/1.1 (RFC 2616).\r\n@return NIL")
    public static SubLObject write_http_date(final SubLObject stream, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, ZERO_INTEGER);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, UNPROVIDED, UNPROVIDED);
        write_string($str76$__, stream, UNPROVIDED, UNPROVIDED);
        print_2_digit_nonnegative_integer(date, stream);
        write_char(CHAR_space, stream);
        write_string(numeric_date_utilities.month_number_abbrev(month), stream, UNPROVIDED, UNPROVIDED);
        write_char(CHAR_space, stream);
        princ(year, stream);
        write_char(CHAR_space, stream);
        print_2_digit_nonnegative_integer(hour, stream);
        write_char(CHAR_colon, stream);
        print_2_digit_nonnegative_integer(minute, stream);
        write_char(CHAR_colon, stream);
        print_2_digit_nonnegative_integer(second, stream);
        write_string($$$_GMT, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param universal-time
     * 		Universal time
     * @return string form of UNIVERSAL-TIME in the standard format
    preferred by HTTP/1.1 (RFC 2616).
     */
    @LispMethod(comment = "@param universal-time\r\n\t\tUniversal time\r\n@return string form of UNIVERSAL-TIME in the standard format\r\npreferred by HTTP/1.1 (RFC 2616).")
    public static final SubLObject http_date_string_alt(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                com.cyc.cycjava.cycl.web_utilities.write_http_date(stream, universal_time);
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

    /**
     *
     *
     * @param universal-time
     * 		Universal time
     * @return string form of UNIVERSAL-TIME in the standard format
    preferred by HTTP/1.1 (RFC 2616).
     */
    @LispMethod(comment = "@param universal-time\r\n\t\tUniversal time\r\n@return string form of UNIVERSAL-TIME in the standard format\r\npreferred by HTTP/1.1 (RFC 2616).")
    public static SubLObject http_date_string(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_http_date(stream, universal_time);
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

    public static final SubLObject html_tokens_fast_forward_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt210);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt210);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(MEMBER, pattern, list, $list_alt212);
            } else {
                cdestructuring_bind_error(datum, $list_alt210);
            }
        }
        return NIL;
    }

    public static SubLObject html_tokens_fast_forward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return listS(MEMBER, pattern, list, $list146);
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static final SubLObject html_tokens_step_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt213);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, list, list(CDR, list));
            } else {
                cdestructuring_bind_error(datum, $list_alt213);
            }
        }
        return NIL;
    }

    public static SubLObject html_tokens_step(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(CDR, list));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static final SubLObject html_tokens_fast_forward_to_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt210);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt210);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, list, list(HTML_TOKENS_FAST_FORWARD, pattern, list));
            } else {
                cdestructuring_bind_error(datum, $list_alt210);
            }
        }
        return NIL;
    }

    public static SubLObject html_tokens_fast_forward_to(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(HTML_TOKENS_FAST_FORWARD, pattern, list));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static final SubLObject html_tokens_fast_forward_past_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt210);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt210);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, list, list(CDR, list(HTML_TOKENS_FAST_FORWARD, pattern, list)));
            } else {
                cdestructuring_bind_error(datum, $list_alt210);
            }
        }
        return NIL;
    }

    public static SubLObject html_tokens_fast_forward_past(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(CDR, list(HTML_TOKENS_FAST_FORWARD, pattern, list)));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static final SubLObject html_tokens_extract_curr_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt213);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, list);
            } else {
                cdestructuring_bind_error(datum, $list_alt213);
            }
        }
        return NIL;
    }

    public static SubLObject html_tokens_extract_curr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, list);
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    /**
     * Compare whether the string encodes the termination version of the
     * open tag passed in.
     */
    @LispMethod(comment = "Compare whether the string encodes the termination version of the\r\nopen tag passed in.\nCompare whether the string encodes the termination version of the\nopen tag passed in.")
    public static final SubLObject is_html_terminating_tagP_alt(SubLObject string, SubLObject open_tag) {
        if (!(CHAR_less.eql(Strings.sublisp_char(string, ZERO_INTEGER)) && CHAR_slash.eql(Strings.sublisp_char(string, ONE_INTEGER)))) {
            return NIL;
        }
        return Strings.string_equal(string, open_tag, TWO_INTEGER, NIL, ONE_INTEGER, NIL);
    }

    @LispMethod(comment = "Compare whether the string encodes the termination version of the\r\nopen tag passed in.\nCompare whether the string encodes the termination version of the\nopen tag passed in.")
    public static SubLObject is_html_terminating_tagP(final SubLObject string, final SubLObject open_tag) {
        if ((!CHAR_less.eql(Strings.sublisp_char(string, ZERO_INTEGER))) || (!CHAR_slash.eql(Strings.sublisp_char(string, ONE_INTEGER)))) {
            return NIL;
        }
        return Strings.string_equal(string, open_tag, TWO_INTEGER, NIL, ONE_INTEGER, NIL);
    }/**
     * Compare whether the string encodes the termination version of the
     * open tag passed in.
     */


    public static final SubLObject test_for_html_tagP_alt(SubLObject tokens, SubLObject tag) {
        {
            SubLObject current = tokens.first();
            if (!current.isString()) {
                return NIL;
            }
            return Strings.string_equal(tag, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject test_for_html_tagP(final SubLObject tokens, final SubLObject tag) {
        final SubLObject current = tokens.first();
        if (!current.isString()) {
            return NIL;
        }
        return Strings.string_equal(tag, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_consume_starting_tag_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject tag = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt218);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            tag = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject marker = $sym219$MARKER;
                    return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list(STRING_EQUAL, marker, tag), list(ERROR, $str_alt224$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt218);
            }
        }
        return NIL;
    }

    public static SubLObject html_consume_starting_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject marker = $sym153$MARKER;
            return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list(STRING_EQUAL, marker, tag), list(ERROR, $str158$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind_error(datum, $list152);
        return NIL;
    }

    public static final SubLObject html_consume_closing_tag_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject tag = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt218);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            tag = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject marker = $sym226$MARKER;
                    return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list($sym227$IS_HTML_TERMINATING_TAG_, marker, tag), list(ERROR, $str_alt228$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt218);
            }
        }
        return NIL;
    }

    public static SubLObject html_consume_closing_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject marker = $sym160$MARKER;
            return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list($sym161$IS_HTML_TERMINATING_TAG_, marker, tag), list(ERROR, $str162$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind_error(datum, $list152);
        return NIL;
    }

    public static final SubLObject html_extract_tag_content_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject tag = NIL;
            SubLObject storage = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt229);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt229);
            tag = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt229);
            storage = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, storage, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(HTML_TOKENS_STEP, tokens), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
            } else {
                cdestructuring_bind_error(datum, $list_alt229);
            }
        }
        return NIL;
    }

    public static SubLObject html_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list163);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        storage = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, storage, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(HTML_TOKENS_STEP, tokens), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind_error(datum, $list163);
        return NIL;
    }

    public static final SubLObject html_extract_possibly_empty_tag_content_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject tag = NIL;
            SubLObject storage = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt233);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt233);
            tag = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt233);
            storage = current.first();
            current = current.rest();
            {
                SubLObject v_default = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt233);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject temp = $sym234$TEMP;
                        return list(CLET, list(temp), list(CSETQ, storage, v_default), list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, temp, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(PUNLESS, list($sym227$IS_HTML_TERMINATING_TAG_, temp, tag), list(CSETQ, storage, temp), list(HTML_TOKENS_STEP, tokens)), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt233);
                }
            }
        }
        return NIL;
    }

    public static SubLObject html_extract_possibly_empty_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list167);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        storage = current.first();
        current = current.rest();
        final SubLObject v_default = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list167);
        current = current.rest();
        if (NIL == current) {
            final SubLObject temp = $sym168$TEMP;
            return list(CLET, list(temp), list(CSETQ, storage, v_default), list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, temp, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(PUNLESS, list($sym161$IS_HTML_TERMINATING_TAG_, temp, tag), list(CSETQ, storage, temp), list(HTML_TOKENS_STEP, tokens)), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind_error(datum, $list167);
        return NIL;
    }

    public static final SubLObject html_possibly_extract_tag_content_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tokens = NIL;
            SubLObject tag = NIL;
            SubLObject storage = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt229);
            tokens = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt229);
            tag = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt229);
            storage = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, list($sym236$TEST_FOR_HTML_TAG_, tokens, tag), list(HTML_EXTRACT_TAG_CONTENT, tokens, tag, storage));
            } else {
                cdestructuring_bind_error(datum, $list_alt229);
            }
        }
        return NIL;
    }

    public static SubLObject html_possibly_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list163);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        storage = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list($sym170$TEST_FOR_HTML_TAG_, tokens, tag), list(HTML_EXTRACT_TAG_CONTENT, tokens, tag, storage));
        }
        cdestructuring_bind_error(datum, $list163);
        return NIL;
    }

    public static final SubLObject html_file_as_tokens_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokens = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt239$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        tokens = com.cyc.cycjava.cycl.web_utilities.html_stream_as_tokens(s);
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
                return tokens;
            }
        }
    }

    public static SubLObject html_file_as_tokens(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = NIL;
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
                Errors.error($str173$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            tokens = html_stream_as_tokens(s);
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
        return tokens;
    }

    public static final SubLObject html_stream_as_tokens_alt(SubLObject stream) {
        {
            SubLObject tokens = NIL;
            tokens = com.cyc.cycjava.cycl.web_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cleansed = NIL;
                SubLObject cdolist_list_var = tokens;
                SubLObject token = NIL;
                for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                    {
                        SubLObject clean_token = com.cyc.cycjava.cycl.web_utilities.html_cleaned_token_string(token);
                        if (!length(clean_token).isZero()) {
                            cleansed = cons(clean_token, cleansed);
                        }
                    }
                }
                tokens = nreverse(cleansed);
            }
            return tokens;
        }
    }

    public static SubLObject html_stream_as_tokens(final SubLObject stream) {
        SubLObject tokens = NIL;
        tokens = xml_parsing_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cleansed = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject clean_token = html_cleaned_token_string(token);
            if (!length(clean_token).isZero()) {
                cleansed = cons(clean_token, cleansed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        tokens = nreverse(cleansed);
        return tokens;
    }

    public static final SubLObject html_cleaned_token_string_alt(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }

    public static SubLObject html_cleaned_token_string(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }

    public static final SubLObject html_property_list_to_url_parameters_alt(SubLObject v_properties) {
        SubLTrampolineFile.checkType(v_properties, PROPERTY_LIST_P);
        {
            SubLObject result = make_string_output_stream();
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject count = NIL;
            for (list_var = v_properties, item = list_var.first(), count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , count = add(ONE_INTEGER, count)) {
                if (NIL != evenp(count)) {
                    if (!count.isZero()) {
                        write_string($str_alt188$_, result, UNPROVIDED, UNPROVIDED);
                    }
                    write_string(symbol_name(item), result, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt241$_, result, UNPROVIDED, UNPROVIDED);
                } else {
                    write_string(string_utilities.to_string(item), result, UNPROVIDED, UNPROVIDED);
                }
            }
            return get_output_stream_string(result);
        }
    }

    public static SubLObject html_property_list_to_url_parameters(final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "! list_utilities.property_list_p(v_properties) " + ("list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) ") + v_properties;
        final SubLObject result = make_string_output_stream();
        SubLObject list_var = NIL;
        SubLObject item = NIL;
        SubLObject count = NIL;
        list_var = v_properties;
        item = list_var.first();
        for (count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , count = add(ONE_INTEGER, count)) {
            if (NIL != evenp(count)) {
                if (!count.isZero()) {
                    write_string($str175$_, result, UNPROVIDED, UNPROVIDED);
                }
                write_string(symbol_name(item), result, UNPROVIDED, UNPROVIDED);
                write_string($str176$_, result, UNPROVIDED, UNPROVIDED);
            } else {
                write_string(string_utilities.to_string(item), result, UNPROVIDED, UNPROVIDED);
            }
        }
        return get_output_stream_string(result);
    }

    public static SubLObject html_assocation_list_to_url_parameters(final SubLObject alist) {
        assert NIL != list_utilities.alist_p(alist) : "! list_utilities.alist_p(alist) " + ("list_utilities.alist_p(alist) " + "CommonSymbols.NIL != list_utilities.alist_p(alist) ") + alist;
        final SubLObject result = make_string_output_stream();
        SubLObject on_first_param = T;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list178);
            key = current.first();
            current = value = current.rest();
            if (NIL == on_first_param) {
                write_string($str175$_, result, UNPROVIDED, UNPROVIDED);
            } else {
                on_first_param = NIL;
            }
            write_string(key, result, UNPROVIDED, UNPROVIDED);
            write_string($str176$_, result, UNPROVIDED, UNPROVIDED);
            write_string(html_url_encode(string_utilities.to_string(value), UNPROVIDED), result, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return get_output_stream_string(result);
    }

    public static SubLObject matching_open_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject tag_size = length(tag);
        if (!tag_size.numE(add(TWO_INTEGER, length(pattern)))) {
            return NIL;
        }
        SubLObject index = ZERO_INTEGER;
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_less)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        SubLObject end_var_$9;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$9 = length(pattern), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$9); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (NIL == funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
        }
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_greater)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject matching_close_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject tag_size = length(tag);
        if (!tag_size.numE(add(THREE_INTEGER, length(pattern)))) {
            return NIL;
        }
        SubLObject index = ZERO_INTEGER;
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_less)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_slash)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        SubLObject end_var_$10;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$10 = length(pattern), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$10); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (NIL == funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
        }
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_greater)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject clear_byte_order_mark_alt() {
        {
            SubLObject cs = $byte_order_mark_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_byte_order_mark() {
        final SubLObject cs = $byte_order_mark_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_byte_order_mark_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($byte_order_mark_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_byte_order_mark() {
        return memoization_state.caching_state_remove_function_results_with_args($byte_order_mark_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * The BOM, which in utf8 documents merely identifies the content as utf8 encoded.
     */
    @LispMethod(comment = "The BOM, which in utf8 documents merely identifies the content as utf8 encoded.")
    public static final SubLObject byte_order_mark_internal_alt() {
        return unicode_strings.display_to_utf8_string($str_alt245$_ufeff_);
    }

    @LispMethod(comment = "The BOM, which in utf8 documents merely identifies the content as utf8 encoded.")
    public static SubLObject byte_order_mark_internal() {
        return unicode_strings.display_to_utf8_string($str186$_ufeff_);
    }/**
     * The BOM, which in utf8 documents merely identifies the content as utf8 encoded.
     */


    public static final SubLObject byte_order_mark_alt() {
        {
            SubLObject caching_state = $byte_order_mark_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BYTE_ORDER_MARK, $byte_order_mark_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw195$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.web_utilities.byte_order_mark_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject byte_order_mark() {
        SubLObject caching_state = $byte_order_mark_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(BYTE_ORDER_MARK, $byte_order_mark_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(byte_order_mark_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject http_response_header_alt(SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), com.cyc.cycjava.cycl.web_utilities.parse_http_response(response_string));
    }

    public static SubLObject http_response_header(final SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), parse_http_response(response_string));
    }

    public static final SubLObject http_response_body_alt(SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), com.cyc.cycjava.cycl.web_utilities.parse_http_response(response_string));
    }

    public static SubLObject http_response_body(final SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), parse_http_response(response_string));
    }

    public static final SubLObject parse_http_response_alt(SubLObject response_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject body_position = search($http_header_delimiter$.getDynamicValue(thread), response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject header = (body_position.isInteger()) ? ((SubLObject) (subseq(response_string, ZERO_INTEGER, body_position))) : NIL;
                SubLObject body = (body_position.isInteger()) ? ((SubLObject) (subseq(response_string, add(body_position, length($http_header_delimiter$.getDynamicValue(thread))), UNPROVIDED))) : response_string;
                return values(header, string_utilities.pre_remove(body, com.cyc.cycjava.cycl.web_utilities.byte_order_mark(), UNPROVIDED));
            }
        }
    }

    public static SubLObject parse_http_response(final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject body_position = search($http_header_delimiter$.getDynamicValue(thread), response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject header = (body_position.isInteger()) ? subseq(response_string, ZERO_INTEGER, body_position) : NIL;
        final SubLObject body = (body_position.isInteger()) ? subseq(response_string, add(body_position, length($http_header_delimiter$.getDynamicValue(thread))), UNPROVIDED) : response_string;
        return values(header, string_utilities.pre_remove(body, byte_order_mark(), UNPROVIDED));
    }

    public static final SubLObject http_format_query_alt(SubLObject query) {
        return format(NIL, $str_alt247$___A__A_____, Mapping.mapcar(HTML_ENCODE_SEXPR, apply(symbol_function(APPEND), query)));
    }

    public static SubLObject http_format_query(final SubLObject query) {
        return format(NIL, $str188$___A__A_____, Mapping.mapcar(HTML_ENCODE_SEXPR, apply(symbol_function(APPEND), query)));
    }

    public static final SubLObject html_encode_sexpr_alt(SubLObject sexpr) {
        return com.cyc.cycjava.cycl.web_utilities.html_url_encode(format_nil.format_nil_a(sexpr), UNPROVIDED);
    }

    public static SubLObject html_encode_sexpr(final SubLObject sexpr) {
        return html_url_encode(format_nil.format_nil_a(sexpr), UNPROVIDED);
    }

    public static final SubLObject http_retrieve(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_string = NIL;
                SubLObject reply = NIL;
                if (query.isString()) {
                    query_string = query;
                } else {
                    query_string = com.cyc.cycjava.cycl.web_utilities.http_format_query(query);
                }
                {
                    SubLObject real_port = (port.eql($DEFAULT)) ? ((SubLObject) ($int$80)) : port;
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(host, real_port, NIL, $PRIVATE);
                        if (NIL != channel) {
                            com.cyc.cycjava.cycl.web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, host, $PORT, port, $METHOD, method, $URL, path, $QUERY, query_string, $kw9$KEEP_ALIVE_, NIL, $kw10$WIDE_NEWLINES_, T, $ACCEPT_TYPES, accept_types }));
                            reply = com.cyc.cycjava.cycl.web_utilities.slack_read_until_eof(channel, max_chars);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != channel) {
                                    close(channel, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject header = com.cyc.cycjava.cycl.web_utilities.parse_http_response(reply);
                    SubLObject body = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != follow_redirectsP) && (NIL != com.cyc.cycjava.cycl.web_utilities.html_redirection_header_p(header))) {
                        return com.cyc.cycjava.cycl.web_utilities.http_retrieve_via_redirection(header, max_chars, accept_types);
                    } else {
                        return body;
                    }
                }
            }
        }
    }

    public static SubLObject http_retrieve(final SubLObject query, final SubLObject path, final SubLObject host, final SubLObject port, SubLObject method, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_string = NIL;
        SubLObject reply = NIL;
        if (query.isString()) {
            query_string = query;
        } else {
            query_string = http_format_query(query);
        }
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject channel = NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(host, real_port, timeout, $PRIVATE);
            if (NIL != validate_tcp_connection(channel, host, real_port)) {
                send_http_request(channel, list(new SubLObject[]{ $MACHINE, host, $PORT, port, $METHOD, method, $URL, path, $QUERY, query_string, $kw9$KEEP_ALIVE_, NIL, $kw10$WIDE_NEWLINES_, T, $ACCEPT_TYPES, accept_types, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                reply = slack_read_until_eof(channel, max_chars);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != channel) {
                    close(channel, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        thread.resetMultipleValues();
        final SubLObject header = parse_http_response(reply);
        final SubLObject body = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != follow_redirectsP) && (NIL != html_redirection_header_p(header))) {
            return http_retrieve_via_redirection(header, max_chars, accept_types);
        }
        return body;
    }

    public static final SubLObject http_retrieve_via_redirection_alt(SubLObject header, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fields = string_utilities.string_tokenize(header, $http_header_field_delimiters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject new_url = NIL;
                if (NIL == new_url) {
                    {
                        SubLObject csome_list_var = fields;
                        SubLObject field = NIL;
                        for (field = csome_list_var.first(); !((NIL != new_url) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , field = csome_list_var.first()) {
                            if (NIL != string_utilities.starts_with_by_test(field, $str_alt202$Location__, symbol_function(EQUALP))) {
                                new_url = string_utilities.pre_remove(field, $str_alt202$Location__, symbol_function(EQUALP));
                            }
                        }
                    }
                }
                return NIL != new_url ? ((SubLObject) (com.cyc.cycjava.cycl.web_utilities.dereference_url(new_url, max_chars, accept_types, UNPROVIDED))) : string_utilities.$empty_string$.getGlobalValue();
            }
        }
    }

    public static SubLObject http_retrieve_via_redirection(final SubLObject header, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fields = string_utilities.string_tokenize(header, $http_header_field_delimiters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_url = NIL;
        if (NIL == new_url) {
            SubLObject csome_list_var = fields;
            SubLObject field = NIL;
            field = csome_list_var.first();
            while ((NIL == new_url) && (NIL != csome_list_var)) {
                if (NIL != string_utilities.starts_with_by_test(field, $str132$Location__, symbol_function(EQUALP))) {
                    new_url = string_utilities.pre_remove(field, $str132$Location__, symbol_function(EQUALP));
                }
                csome_list_var = csome_list_var.rest();
                field = csome_list_var.first();
            } 
        }
        return NIL != new_url ? dereference_url(new_url, max_chars, accept_types, UNPROVIDED, UNPROVIDED) : string_utilities.$empty_string$.getGlobalValue();
    }

    /**
     *
     *
     * @return STRINGP; the HTML source located at URL.
     */
    @LispMethod(comment = "@return STRINGP; the HTML source located at URL.")
    public static final SubLObject get_html_source_from_url_alt(SubLObject url, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $list_alt250;
        }
        return com.cyc.cycjava.cycl.web_utilities.dereference_url(url, max_chars, accept_types, UNPROVIDED);
    }

    /**
     *
     *
     * @return STRINGP; the HTML source located at URL.
     */
    @LispMethod(comment = "@return STRINGP; the HTML source located at URL.")
    public static SubLObject get_html_source_from_url(final SubLObject url, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $list191;
        }
        return dereference_url(url, max_chars, accept_types, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject dereference_url(SubLObject url, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source = NIL;
                if (NIL == com.cyc.cycjava.cycl.web_utilities.url_p(url)) {
                    url = cconcatenate($str_alt203$http___, url);
                }
                if (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str_alt203$http___)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject machine = com.cyc.cycjava.cycl.web_utilities.parse_http_url(url);
                        SubLObject port = thread.secondMultipleValue();
                        SubLObject path = thread.thirdMultipleValue();
                        SubLObject query = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == machine) {
                            machine = url;
                        }
                        if (NIL == path) {
                            path = $str_alt81$_;
                        }
                        source = com.cyc.cycjava.cycl.web_utilities.http_retrieve(query, path, machine, port, $GET, max_chars, accept_types, follow_redirectsP);
                    }
                } else {
                    if (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str_alt251$file___)) {
                        {
                            SubLObject path = string_utilities.pre_remove(url, $str_alt251$file___, symbol_function(EQUALP));
                            SubLTrampolineFile.checkType(path, $sym252$FILE_EXISTS_);
                            source = string_utilities.read_string_from_file(path, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return source;
            }
        }
    }

    public static SubLObject dereference_url(SubLObject url, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject source = NIL;
        if (NIL == url_p(url)) {
            url = cconcatenate($str134$http___, url);
        }
        if ((NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str134$http___)) || (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str135$https___))) {
            thread.resetMultipleValues();
            SubLObject machine = parse_http_url(url);
            final SubLObject port = thread.secondMultipleValue();
            SubLObject path = thread.thirdMultipleValue();
            final SubLObject query = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (NIL == machine) {
                machine = url;
            }
            if (NIL == path) {
                path = $str29$_;
            }
            source = http_retrieve(query, path, machine, port, $GET, max_chars, accept_types, follow_redirectsP, timeout);
        } else
            if (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str192$file___)) {
                final SubLObject path2 = string_utilities.pre_remove(url, $str192$file___, symbol_function(EQUALP));
                assert NIL != file_utilities.file_existsP(path2) : "! file_utilities.file_existsP(path2) " + ("file_utilities.file_existsP(path2) " + "CommonSymbols.NIL != file_utilities.file_existsP(path2) ") + path2;
                source = string_utilities.read_string_from_file(path2, UNPROVIDED, UNPROVIDED);
            }

        return source;
    }

    public static final SubLObject save_url_to_file_alt(SubLObject url, SubLObject filepath, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
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
                                SubLObject source = com.cyc.cycjava.cycl.web_utilities.dereference_url(url, NIL, accept_types, follow_redirectsP);
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(filepath, $OUTPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt239$Unable_to_open__S, filepath);
                                    }
                                    {
                                        SubLObject out = stream;
                                        princ(source, out);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_26 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_26);
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
            return error_message;
        }
    }

    public static SubLObject save_url_to_file(final SubLObject url, final SubLObject filepath, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject source = dereference_url(url, NIL, accept_types, follow_redirectsP, UNPROVIDED);
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(filepath, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str173$Unable_to_open__S, filepath);
                        }
                        final SubLObject out = stream;
                        princ(source, out);
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
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
        return error_message;
    }

    public static SubLObject servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$servlet_port_offset$.getDynamicValue(thread));
    }

    public static SubLObject effective_servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != local_servlet_container_runningP()) {
            return servlet_container_port();
        }
        return $alternate_servlet_container_port$.getDynamicValue(thread);
    }

    public static SubLObject effective_servlet_container_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != local_servlet_container_runningP()) {
            return misc_utilities.hostname();
        }
        return $alternate_servlet_container_host$.getDynamicValue(thread);
    }

    public static SubLObject local_servlet_container_runningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $local_servlet_container_runningP$.getDynamicValue(thread);
    }

    public static SubLObject restart_servlet_container(SubLObject port) {
        if (port == UNPROVIDED) {
            port = servlet_container_port();
        }
        stop_servlet_container();
        return start_servlet_container(port);
    }

    public static SubLObject start_servlet_container(SubLObject port) {
        if (port == UNPROVIDED) {
            port = servlet_container_port();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject war_files = get_war_file_descriptions();
                    final SubLObject ret_value = funcall(START_SERVLET_CONTAINER_INT, port, war_files, servlet_container_tmp_dir_string());
                    $local_servlet_container_runningP$.setDynamicValue(T, thread);
                    return ret_value;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err) {
            Errors.warn(err);
        }
        return port;
    }

    public static SubLObject stop_servlet_container() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    funcall(STOP_SERVLET_CONTAINER_INT, servlet_container_tmp_dir_string());
                    $local_servlet_container_runningP$.setDynamicValue(NIL, thread);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err) {
            Errors.warn(err);
        }
        return $STOPPED;
    }

    public static SubLObject servlet_container_tmp_dir_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_utilities.possibly_append_path_separator_char(cconcatenate(format_nil.format_nil_a_no_copy(file_utilities.temp_directory()), new SubLObject[]{ $str202$cyc_servlet_container_tmp_dir_, format_nil.format_nil_a_no_copy(Environment.get_user_name(UNPROVIDED)), $str203$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)) }));
    }

    public static SubLObject get_war_file_descriptions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file($webapp_manifest_path$.getGlobalValue())) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($webapp_manifest_path$.getGlobalValue(), $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str173$Unable_to_open__S, $webapp_manifest_path$.getGlobalValue());
                }
                final SubLObject in = stream;
                SubLObject tokens = xml_parsing_utilities.xml_tokenize(in, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject webapps = NIL;
                SubLObject wars = NIL;
                while ((NIL != tokens) && (NIL == list_utilities.proper_list_p(webapps))) {
                    thread.resetMultipleValues();
                    final SubLObject webapps_$12 = xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
                    final SubLObject tokens_$13 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    webapps = webapps_$12;
                    tokens = tokens_$13;
                } 
                SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(webapps, $$$webapp);
                SubLObject webapp = NIL;
                webapp = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject warfile = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, $$$filename));
                    final SubLObject v_context = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, $$$contextRoot));
                    wars = cons(bq_cons(warfile, v_context), wars);
                    cdolist_list_var = cdolist_list_var.rest();
                    webapp = cdolist_list_var.first();
                } 
                return wars;
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
        }
        Errors.warn($str208$Unable_to_find_webapp_manifest_fi, $webapp_manifest_path$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject declare_web_utilities_file_alt() {
        declareMacro("with_http_request", "WITH-HTTP-REQUEST");
        declareFunction("http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
        declareFunction("http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
        declareFunction("http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
        declareFunction("send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
        declareFunction("http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 1, false);
        declareMacro("http_with_cookies", "HTTP-WITH-COOKIES");
        declareFunction("get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
        declareFunction("http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 1, false);
        declareFunction("http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
        declareFunction("http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
        declareFunction("http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
        declareFunction("http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
        declareFunction("http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
        declareFunction("filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
        declareFunction("http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
        declareFunction("html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
        declareFunction("html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false);
        new com.cyc.cycjava.cycl.web_utilities.$html_url_expand_char$UnaryFunction();
        declareFunction("html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
        declareFunction("html_url_decode", "HTML-URL-DECODE", 1, 0, false);
        declareFunction("html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
        declareFunction("html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
        declareFunction("html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
        declareFunction("html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
        declareFunction("html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
        declareFunction("uri_p", "URI-P", 1, 1, false);
        declareFunction("url_p", "URL-P", 1, 0, false);
        new com.cyc.cycjava.cycl.web_utilities.$url_p$UnaryFunction();
        declareFunction("url_host", "URL-HOST", 1, 0, false);
        declareFunction("url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
        declareFunction("absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
        declareFunction("uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
        declareFunction("find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
        declareFunction("find_url_end", "FIND-URL-END", 1, 2, false);
        declareFunction("valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
        declareFunction("resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
        declareFunction("canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
        declareFunction("remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
        declareFunction("uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
        declareFunction("xml_tokenize", "XML-TOKENIZE", 1, 3, false);
        declareFunction("new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false);
        declareFunction("xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_p$UnaryFunction();
        declareFunction("xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false);
        declareFunction("xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false);
        declareFunction("xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        declareFunction("xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false);
        declareFunction("xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false);
        declareFunction("xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false);
        declareFunction("xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        declareFunction("xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        declareFunction("xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false);
        declareFunction("_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false);
        declareFunction("_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false);
        declareFunction("_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false);
        declareFunction("make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false);
        declareFunction("print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false);
        declareFunction("new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false);
        declareFunction("xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false);
        declareFunction("xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false);
        declareFunction("xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false);
        declareFunction("xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        declareFunction("xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        declareFunction("xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false);
        declareFunction("xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false);
        declareFunction("advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false);
        declareFunction("xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false);
        declareFunction("make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false);
        declareFunction("iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false);
        declareFunction("iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false);
        declareFunction("ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false);
        declareFunction("xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false);
        declareFunction("handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false);
        declareFunction("xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false);
        declareFunction("validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false);
        declareFunction("maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false);
        declareFunction("validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false);
        declareFunction("xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false);
        declareFunction("xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false);
        declareFunction("xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false);
        declareFunction("xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false);
        declareFunction("xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
        declareFunction("xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false);
        declareMacro("html_tokenize", "HTML-TOKENIZE");
        declareFunction("xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false);
        declareFunction("xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false);
        declareFunction("xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false);
        declareFunction("xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false);
        new com.cyc.cycjava.cycl.web_utilities.$xml_token_mentions$BinaryFunction();
        declareFunction("next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false);
        declareFunction("next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false);
        declareFunction("next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false);
        declareFunction("advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false);
        declareFunction("advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false);
        declareFunction("xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false);
        declareFunction("accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false);
        declareFunction("accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false);
        declareFunction("accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false);
        declareFunction("xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false);
        declareFunction("advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false);
        declareFunction("advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false);
        declareFunction("xml_declaration_p", "XML-DECLARATION-P", 1, 0, false);
        declareFunction("xml_comment_p", "XML-COMMENT-P", 1, 0, false);
        declareFunction("xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false);
        declareFunction("xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false);
        declareFunction("advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false);
        declareFunction("xml_read", "XML-READ", 1, 2, false);
        declareFunction("xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false);
        declareFunction("html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false);
        declareFunction("xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false);
        declareFunction("entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false);
        declareFunction("resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false);
        declareFunction("resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false);
        declareFunction("remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false);
        declareFunction("parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false);
        declareFunction("parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false);
        declareFunction("parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false);
        declareFunction("parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false);
        declareFunction("xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false);
        declareFunction("xml_tagP", "XML-TAG?", 1, 0, false);
        declareFunction("regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false);
        declareFunction("xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false);
        declareFunction("xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false);
        declareFunction("xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false);
        declareFunction("xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false);
        declareFunction("xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false);
        declareFunction("xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false);
        declareFunction("xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false);
        declareFunction("xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false);
        declareFunction("xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false);
        declareFunction("xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false);
        declareFunction("xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false);
        declareFunction("non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false);
        declareFunction("get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false);
        declareFunction("xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false);
        declareFunction("xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false);
        declareFunction("xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false);
        declareFunction("xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false);
        declareFunction("xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false);
        declareFunction("xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false);
        declareFunction("xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false);
        declareFunction("xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false);
        declareFunction("get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
        declareFunction("html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
        declareFunction("html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
        declareFunction("parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
        declareFunction("read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
        declareFunction("read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
        declareFunction("read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
        declareFunction("slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
        declareMacro("try_error_message", "TRY-ERROR-MESSAGE");
        declareFunction("slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
        declareFunction("read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
        declareFunction("write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
        declareFunction("http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
        declareFunction("write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
        declareFunction("http_date_string", "HTTP-DATE-STRING", 0, 1, false);
        declareMacro("html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
        declareMacro("html_tokens_step", "HTML-TOKENS-STEP");
        declareMacro("html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
        declareMacro("html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
        declareMacro("html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
        declareFunction("is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
        declareFunction("test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
        declareMacro("html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
        declareMacro("html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
        declareMacro("html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
        declareMacro("html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
        declareMacro("html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
        declareFunction("html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
        declareFunction("html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
        declareFunction("html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
        declareFunction("html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
        declareFunction("clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
        declareFunction("byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
        declareFunction("http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
        declareFunction("parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
        declareFunction("http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
        declareFunction("html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
        declareFunction("http_retrieve", "HTTP-RETRIEVE", 4, 4, false);
        declareFunction("http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
        declareFunction("get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
        declareFunction("dereference_url", "DEREFERENCE-URL", 2, 2, false);
        declareFunction("save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
        return NIL;
    }

    public static SubLObject declare_web_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_http_request", "WITH-HTTP-REQUEST");
            declareFunction("http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
            declareFunction("make_html_cyc_login_session", "MAKE-HTML-CYC-LOGIN-SESSION", 0, 0, false);
            declareFunction("destroy_cyc_login_session", "DESTROY-CYC-LOGIN-SESSION", 1, 0, false);
            declareFunction("cyc_login_session_id_machine_name", "CYC-LOGIN-SESSION-ID-MACHINE-NAME", 1, 0, false);
            declareFunction("valid_html_cyc_login_session_idP", "VALID-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
            declareFunction("current_html_cyc_login_session_idP", "CURRENT-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
            declareFunction("http_possibly_repack_request", "HTTP-POSSIBLY-REPACK-REQUEST", 4, 0, false);
            declareFunction("within_html_cyc_login_sessionP", "WITHIN-HTML-CYC-LOGIN-SESSION?", 0, 0, false);
            declareFunction("possibly_add_html_javascript_redirect_when_top_level_page", "POSSIBLY-ADD-HTML-JAVASCRIPT-REDIRECT-WHEN-TOP-LEVEL-PAGE", 0, 0, false);
            declareFunction("http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
            declareFunction("http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
            declareFunction("send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
            declareFunction("http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 3, false);
            declareFunction("test_http_request", "TEST-HTTP-REQUEST", 2, 1, false);
            declareMacro("http_with_cookies", "HTTP-WITH-COOKIES");
            declareFunction("get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
            declareFunction("http_send_generic_request", "HTTP-SEND-GENERIC-REQUEST", 11, 2, false);
            declareFunction("http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 3, false);
            declareFunction("http_send_put_request", "HTTP-SEND-PUT-REQUEST", 7, 3, false);
            declareFunction("http_send_delete_request", "HTTP-SEND-DELETE-REQUEST", 7, 3, false);
            declareFunction("http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
            declareFunction("http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
            declareFunction("http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
            declareFunction("http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
            declareFunction("http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
            declareFunction("filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
            declareFunction("http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
            declareFunction("html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
            declareFunction("html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false);
            new web_utilities.$html_url_expand_char$UnaryFunction();
            declareFunction("html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
            declareFunction("html_url_decode", "HTML-URL-DECODE", 1, 0, false);
            declareFunction("decode_url_percent_encoded_char", "DECODE-URL-PERCENT-ENCODED-CHAR", 2, 0, false);
            declareFunction("html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
            declareFunction("html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
            declareFunction("html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
            declareFunction("html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
            declareFunction("html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
            declareFunction("uri_p", "URI-P", 1, 1, false);
            declareFunction("url_p", "URL-P", 1, 0, false);
            new web_utilities.$url_p$UnaryFunction();
            declareFunction("url_host", "URL-HOST", 1, 0, false);
            declareFunction("url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
            declareFunction("absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
            declareFunction("uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
            declareFunction("find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
            declareFunction("find_url_end", "FIND-URL-END", 1, 2, false);
            declareFunction("valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
            declareFunction("resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
            declareFunction("canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
            declareFunction("remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
            declareFunction("uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
            declareFunction("clear_soap_name", "CLEAR-SOAP-NAME", 0, 0, false);
            declareFunction("remove_soap_name", "REMOVE-SOAP-NAME", 1, 0, false);
            declareFunction("soap_name_internal", "SOAP-NAME-INTERNAL", 1, 0, false);
            declareFunction("soap_name", "SOAP-NAME", 1, 0, false);
            declareFunction("clear_soap_expanded_name", "CLEAR-SOAP-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_soap_expanded_name", "REMOVE-SOAP-EXPANDED-NAME", 1, 0, false);
            declareFunction("soap_expanded_name_internal", "SOAP-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("soap_expanded_name", "SOAP-EXPANDED-NAME", 1, 0, false);
            declareFunction("soap_envelope_sexpr_p", "SOAP-ENVELOPE-SEXPR-P", 1, 0, false);
            declareFunction("clear_perform_soap_post_cached", "CLEAR-PERFORM-SOAP-POST-CACHED", 0, 0, false);
            declareFunction("remove_perform_soap_post_cached", "REMOVE-PERFORM-SOAP-POST-CACHED", 4, 2, false);
            declareFunction("perform_soap_post_cached_internal", "PERFORM-SOAP-POST-CACHED-INTERNAL", 6, 0, false);
            declareFunction("perform_soap_post_cached", "PERFORM-SOAP-POST-CACHED", 4, 2, false);
            declareFunction("perform_soap_post", "PERFORM-SOAP-POST", 4, 2, false);
            declareFunction("make_soap_message", "MAKE-SOAP-MESSAGE", 3, 3, false);
            declareFunction("get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
            declareFunction("html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
            declareFunction("html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
            declareFunction("parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
            declareFunction("read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
            declareFunction("read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
            declareFunction("read_while", "READ-WHILE", 2, 1, false);
            declareFunction("read_until_char_unless", "READ-UNTIL-CHAR-UNLESS", 3, 1, false);
            declareFunction("read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
            declareFunction("slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
            declareMacro("try_error_message", "TRY-ERROR-MESSAGE");
            declareFunction("slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
            declareFunction("read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
            declareFunction("write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
            declareFunction("http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
            declareFunction("write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
            declareFunction("http_date_string", "HTTP-DATE-STRING", 0, 1, false);
            declareMacro("html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
            declareMacro("html_tokens_step", "HTML-TOKENS-STEP");
            declareMacro("html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
            declareMacro("html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
            declareMacro("html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
            declareFunction("is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
            declareFunction("test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
            declareMacro("html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
            declareMacro("html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
            declareMacro("html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
            declareMacro("html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
            declareMacro("html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
            declareFunction("html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
            declareFunction("html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
            declareFunction("html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
            declareFunction("html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
            declareFunction("html_assocation_list_to_url_parameters", "HTML-ASSOCATION-LIST-TO-URL-PARAMETERS", 1, 0, false);
            declareFunction("matching_open_tagP", "MATCHING-OPEN-TAG?", 2, 1, false);
            declareFunction("matching_close_tagP", "MATCHING-CLOSE-TAG?", 2, 1, false);
            declareFunction("clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
            declareFunction("remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
            declareFunction("byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
            declareFunction("byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
            declareFunction("http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
            declareFunction("http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
            declareFunction("parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
            declareFunction("http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
            declareFunction("html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
            declareFunction("http_retrieve", "HTTP-RETRIEVE", 4, 5, false);
            declareFunction("http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
            declareFunction("get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
            declareFunction("dereference_url", "DEREFERENCE-URL", 1, 4, false);
            declareFunction("save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
            declareFunction("servlet_container_port", "SERVLET-CONTAINER-PORT", 0, 0, false);
            declareFunction("effective_servlet_container_port", "EFFECTIVE-SERVLET-CONTAINER-PORT", 0, 0, false);
            declareFunction("effective_servlet_container_host", "EFFECTIVE-SERVLET-CONTAINER-HOST", 0, 0, false);
            declareFunction("local_servlet_container_runningP", "LOCAL-SERVLET-CONTAINER-RUNNING?", 0, 0, false);
            declareFunction("restart_servlet_container", "RESTART-SERVLET-CONTAINER", 0, 1, false);
            declareFunction("start_servlet_container", "START-SERVLET-CONTAINER", 0, 1, false);
            declareFunction("stop_servlet_container", "STOP-SERVLET-CONTAINER", 0, 0, false);
            declareFunction("servlet_container_tmp_dir_string", "SERVLET-CONTAINER-TMP-DIR-STRING", 0, 0, false);
            declareFunction("get_war_file_descriptions", "GET-WAR-FILE-DESCRIPTIONS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 1, false);
            declareFunction("http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 1, false);
            declareFunction("xml_tokenize", "XML-TOKENIZE", 1, 3, false);
            declareFunction("new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false);
            declareFunction("xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false);
            new com.cyc.cycjava.cycl.web_utilities.$xml_token_iterator_state_p$UnaryFunction();
            declareFunction("xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false);
            declareFunction("xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false);
            declareFunction("xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
            declareFunction("xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false);
            declareFunction("xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false);
            declareFunction("xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false);
            declareFunction("xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
            declareFunction("xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
            declareFunction("xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false);
            declareFunction("_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false);
            declareFunction("_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false);
            declareFunction("_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false);
            declareFunction("_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false);
            declareFunction("_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false);
            declareFunction("_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false);
            declareFunction("_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false);
            declareFunction("_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false);
            declareFunction("_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false);
            declareFunction("make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false);
            declareFunction("print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false);
            declareFunction("new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false);
            declareFunction("xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false);
            declareFunction("xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false);
            declareFunction("xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
            declareFunction("xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false);
            declareFunction("xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false);
            declareFunction("xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false);
            declareFunction("xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
            declareFunction("xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
            declareFunction("xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false);
            declareFunction("xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false);
            declareFunction("advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false);
            declareFunction("xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false);
            declareFunction("make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false);
            declareFunction("iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false);
            declareFunction("iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false);
            declareFunction("ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false);
            declareFunction("xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false);
            declareFunction("handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false);
            declareFunction("xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false);
            declareFunction("validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false);
            declareFunction("maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false);
            declareFunction("validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false);
            declareFunction("xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false);
            declareFunction("xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false);
            declareFunction("xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false);
            declareFunction("xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false);
            declareFunction("xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
            declareFunction("xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false);
            declareMacro("html_tokenize", "HTML-TOKENIZE");
            declareFunction("xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false);
            declareFunction("xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false);
            declareFunction("xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false);
            declareFunction("xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false);
            new com.cyc.cycjava.cycl.web_utilities.$xml_token_mentions$BinaryFunction();
            declareFunction("next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false);
            declareFunction("next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false);
            declareFunction("next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false);
            declareFunction("advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false);
            declareFunction("advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false);
            declareFunction("xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false);
            declareFunction("accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false);
            declareFunction("accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false);
            declareFunction("accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false);
            declareFunction("xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false);
            declareFunction("advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false);
            declareFunction("advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false);
            declareFunction("xml_declaration_p", "XML-DECLARATION-P", 1, 0, false);
            declareFunction("xml_comment_p", "XML-COMMENT-P", 1, 0, false);
            declareFunction("xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false);
            declareFunction("xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false);
            declareFunction("advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false);
            declareFunction("xml_read", "XML-READ", 1, 2, false);
            declareFunction("xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false);
            declareFunction("html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false);
            declareFunction("xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false);
            declareFunction("entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false);
            declareFunction("resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false);
            declareFunction("resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false);
            declareFunction("remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false);
            declareFunction("parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false);
            declareFunction("parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false);
            declareFunction("parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false);
            declareFunction("parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false);
            declareFunction("xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false);
            declareFunction("xml_tagP", "XML-TAG?", 1, 0, false);
            declareFunction("regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false);
            declareFunction("xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false);
            declareFunction("xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false);
            declareFunction("xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false);
            declareFunction("xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false);
            declareFunction("xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false);
            declareFunction("xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false);
            declareFunction("xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false);
            declareFunction("xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false);
            declareFunction("xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false);
            declareFunction("xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false);
            declareFunction("xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false);
            declareFunction("non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false);
            declareFunction("get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false);
            declareFunction("xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false);
            declareFunction("xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false);
            declareFunction("xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false);
            declareFunction("xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false);
            declareFunction("xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false);
            declareFunction("xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false);
            declareFunction("xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false);
            declareFunction("xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false);
            declareFunction("http_retrieve", "HTTP-RETRIEVE", 4, 4, false);
            declareFunction("dereference_url", "DEREFERENCE-URL", 2, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_web_utilities_file_Previous() {
        declareMacro("with_http_request", "WITH-HTTP-REQUEST");
        declareFunction("http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
        declareFunction("make_html_cyc_login_session", "MAKE-HTML-CYC-LOGIN-SESSION", 0, 0, false);
        declareFunction("destroy_cyc_login_session", "DESTROY-CYC-LOGIN-SESSION", 1, 0, false);
        declareFunction("cyc_login_session_id_machine_name", "CYC-LOGIN-SESSION-ID-MACHINE-NAME", 1, 0, false);
        declareFunction("valid_html_cyc_login_session_idP", "VALID-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        declareFunction("current_html_cyc_login_session_idP", "CURRENT-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        declareFunction("http_possibly_repack_request", "HTTP-POSSIBLY-REPACK-REQUEST", 4, 0, false);
        declareFunction("within_html_cyc_login_sessionP", "WITHIN-HTML-CYC-LOGIN-SESSION?", 0, 0, false);
        declareFunction("possibly_add_html_javascript_redirect_when_top_level_page", "POSSIBLY-ADD-HTML-JAVASCRIPT-REDIRECT-WHEN-TOP-LEVEL-PAGE", 0, 0, false);
        declareFunction("http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
        declareFunction("http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
        declareFunction("send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
        declareFunction("http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 3, false);
        declareFunction("test_http_request", "TEST-HTTP-REQUEST", 2, 1, false);
        declareMacro("http_with_cookies", "HTTP-WITH-COOKIES");
        declareFunction("get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
        declareFunction("http_send_generic_request", "HTTP-SEND-GENERIC-REQUEST", 11, 2, false);
        declareFunction("http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 3, false);
        declareFunction("http_send_put_request", "HTTP-SEND-PUT-REQUEST", 7, 3, false);
        declareFunction("http_send_delete_request", "HTTP-SEND-DELETE-REQUEST", 7, 3, false);
        declareFunction("http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
        declareFunction("http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
        declareFunction("http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
        declareFunction("http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
        declareFunction("http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
        declareFunction("filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
        declareFunction("http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
        declareFunction("html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
        declareFunction("html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false);
        new web_utilities.$html_url_expand_char$UnaryFunction();
        declareFunction("html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
        declareFunction("html_url_decode", "HTML-URL-DECODE", 1, 0, false);
        declareFunction("decode_url_percent_encoded_char", "DECODE-URL-PERCENT-ENCODED-CHAR", 2, 0, false);
        declareFunction("html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
        declareFunction("html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
        declareFunction("html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
        declareFunction("html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
        declareFunction("html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
        declareFunction("uri_p", "URI-P", 1, 1, false);
        declareFunction("url_p", "URL-P", 1, 0, false);
        new web_utilities.$url_p$UnaryFunction();
        declareFunction("url_host", "URL-HOST", 1, 0, false);
        declareFunction("url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
        declareFunction("absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
        declareFunction("uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
        declareFunction("find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
        declareFunction("find_url_end", "FIND-URL-END", 1, 2, false);
        declareFunction("valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
        declareFunction("resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
        declareFunction("canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
        declareFunction("remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
        declareFunction("uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
        declareFunction("clear_soap_name", "CLEAR-SOAP-NAME", 0, 0, false);
        declareFunction("remove_soap_name", "REMOVE-SOAP-NAME", 1, 0, false);
        declareFunction("soap_name_internal", "SOAP-NAME-INTERNAL", 1, 0, false);
        declareFunction("soap_name", "SOAP-NAME", 1, 0, false);
        declareFunction("clear_soap_expanded_name", "CLEAR-SOAP-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_soap_expanded_name", "REMOVE-SOAP-EXPANDED-NAME", 1, 0, false);
        declareFunction("soap_expanded_name_internal", "SOAP-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("soap_expanded_name", "SOAP-EXPANDED-NAME", 1, 0, false);
        declareFunction("soap_envelope_sexpr_p", "SOAP-ENVELOPE-SEXPR-P", 1, 0, false);
        declareFunction("clear_perform_soap_post_cached", "CLEAR-PERFORM-SOAP-POST-CACHED", 0, 0, false);
        declareFunction("remove_perform_soap_post_cached", "REMOVE-PERFORM-SOAP-POST-CACHED", 4, 2, false);
        declareFunction("perform_soap_post_cached_internal", "PERFORM-SOAP-POST-CACHED-INTERNAL", 6, 0, false);
        declareFunction("perform_soap_post_cached", "PERFORM-SOAP-POST-CACHED", 4, 2, false);
        declareFunction("perform_soap_post", "PERFORM-SOAP-POST", 4, 2, false);
        declareFunction("make_soap_message", "MAKE-SOAP-MESSAGE", 3, 3, false);
        declareFunction("get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
        declareFunction("html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
        declareFunction("html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
        declareFunction("parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
        declareFunction("read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
        declareFunction("read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
        declareFunction("read_while", "READ-WHILE", 2, 1, false);
        declareFunction("read_until_char_unless", "READ-UNTIL-CHAR-UNLESS", 3, 1, false);
        declareFunction("read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
        declareFunction("slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
        declareMacro("try_error_message", "TRY-ERROR-MESSAGE");
        declareFunction("slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
        declareFunction("read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
        declareFunction("write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
        declareFunction("http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
        declareFunction("write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
        declareFunction("http_date_string", "HTTP-DATE-STRING", 0, 1, false);
        declareMacro("html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
        declareMacro("html_tokens_step", "HTML-TOKENS-STEP");
        declareMacro("html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
        declareMacro("html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
        declareMacro("html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
        declareFunction("is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
        declareFunction("test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
        declareMacro("html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
        declareMacro("html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
        declareMacro("html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
        declareMacro("html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
        declareMacro("html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
        declareFunction("html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
        declareFunction("html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
        declareFunction("html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
        declareFunction("html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
        declareFunction("html_assocation_list_to_url_parameters", "HTML-ASSOCATION-LIST-TO-URL-PARAMETERS", 1, 0, false);
        declareFunction("matching_open_tagP", "MATCHING-OPEN-TAG?", 2, 1, false);
        declareFunction("matching_close_tagP", "MATCHING-CLOSE-TAG?", 2, 1, false);
        declareFunction("clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
        declareFunction("byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
        declareFunction("http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
        declareFunction("http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
        declareFunction("parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
        declareFunction("http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
        declareFunction("html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
        declareFunction("http_retrieve", "HTTP-RETRIEVE", 4, 5, false);
        declareFunction("http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
        declareFunction("get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
        declareFunction("dereference_url", "DEREFERENCE-URL", 1, 4, false);
        declareFunction("save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
        declareFunction("servlet_container_port", "SERVLET-CONTAINER-PORT", 0, 0, false);
        declareFunction("effective_servlet_container_port", "EFFECTIVE-SERVLET-CONTAINER-PORT", 0, 0, false);
        declareFunction("effective_servlet_container_host", "EFFECTIVE-SERVLET-CONTAINER-HOST", 0, 0, false);
        declareFunction("local_servlet_container_runningP", "LOCAL-SERVLET-CONTAINER-RUNNING?", 0, 0, false);
        declareFunction("restart_servlet_container", "RESTART-SERVLET-CONTAINER", 0, 1, false);
        declareFunction("start_servlet_container", "START-SERVLET-CONTAINER", 0, 1, false);
        declareFunction("stop_servlet_container", "STOP-SERVLET-CONTAINER", 0, 0, false);
        declareFunction("servlet_container_tmp_dir_string", "SERVLET-CONTAINER-TMP-DIR-STRING", 0, 0, false);
        declareFunction("get_war_file_descriptions", "GET-WAR-FILE-DESCRIPTIONS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_web_utilities_file_alt() {
        deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", $list_alt0);
        deflexical("*HTTP-INFORMATIONAL-CODES*", $list_alt25);
        deflexical("*HTTP-SUCCESS-CODES*", $list_alt26);
        deflexical("*HTTP-REDIRECTION-CODES*", $list_alt27);
        deflexical("*HTTP-CLIENT-ERROR-CODES*", $list_alt28);
        deflexical("*HTTP-SERVER-ERROR-CODES*", $list_alt29);
        deflexical("*HTTP-ERROR-CODES*", append($http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue()));
        deflexical("*HTTP-STATUS-CODES*", append(new SubLObject[]{ $http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$.getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue() }));
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list_alt32);
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_get_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list_alt34);
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_post_request_template_components$.getGlobalValue()));
        defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", NIL);
        defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL);
        deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str_alt64$Set_Cookie_);
        deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", list(CHAR_semicolon));
        deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($$$domain, $$$expires, $str_alt68$max_age));
        deflexical("*OFFICIAL-URI-SCHEMES*", $list_alt82);
        deflexical("*UNOFFICIAL-URI-SCHEMES*", $list_alt83);
        defconstant("*VALID-URL-BEGINNINGS*", $list_alt84);
        defconstant("*URL-DELIMITERS*", $list_alt85);
        deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str_alt87$_____________________);
        defparameter("*REQUIRE-VALID-XML?*", NIL);
        defconstant("*DTP-XML-TOKEN-ITERATOR-STATE*", XML_TOKEN_ITERATOR_STATE);
        defparameter("*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized());
        defparameter("*CGI-HOST*", $$$localhost);
        defparameter("*CGI-PORT*", $int$80);
        defparameter("*CGI-PATH*", $str_alt243$_cgi_bin_services);
        defparameter("*HTTP-HEADER-DELIMITER*", cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), new SubLObject[]{ format_nil.format_nil_a_no_copy(CHAR_newline), format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline) }));
        defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", list(cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline)), Strings.make_string(ONE_INTEGER, CHAR_newline)));
        deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_web_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", $list0);
            deflexical("*DECODE-URLS-DURING-HTTP-READ-REQUEST*", NIL);
            deflexical("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*", $str27$_a_);
            deflexical("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*", FIVE_INTEGER);
            deflexical("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*", SubLTrampolineFile.maybeDefault($html_cyc_login_session_string_to_remote_host$, $html_cyc_login_session_string_to_remote_host$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*", $str33$var_KEA_port_from_cyc_base_port__);
            deflexical("*HTTP-INFORMATIONAL-CODES*", $list34);
            deflexical("*HTTP-SUCCESS-CODES*", $list35);
            deflexical("*HTTP-REDIRECTION-CODES*", $list36);
            deflexical("*HTTP-CLIENT-ERROR-CODES*", $list37);
            deflexical("*HTTP-SERVER-ERROR-CODES*", $list38);
            deflexical("*HTTP-ERROR-CODES*", append($http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue()));
            deflexical("*HTTP-STATUS-CODES*", append(new SubLObject[]{ $http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$.getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue() }));
            deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list41);
            deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_get_request_template_components$.getGlobalValue()));
            deflexical("*HTTP-POST-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
            deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list44);
            deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_post_request_template_components$.getGlobalValue()));
            deflexical("*HTTP-PUT-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
            deflexical("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*", $list45);
            deflexical("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_put_request_template_components$.getGlobalValue()));
            deflexical("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
            deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*", $list46);
            deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_delete_request_template_components$.getGlobalValue()));
            defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", NIL);
            defparameter("*TRACE-HTTP-SEND-PUT-REQUESTS*", NIL);
            defparameter("*TRACE-HTTP-SEND-DELETE-REQUESTS*", NIL);
            defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL);
            deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str81$Set_Cookie_);
            deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", list(CHAR_semicolon));
            deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($$$domain, $$$expires, $str85$max_age));
            deflexical("*OFFICIAL-URI-SCHEMES*", $list98);
            deflexical("*UNOFFICIAL-URI-SCHEMES*", $list99);
            defconstant("*VALID-URL-BEGINNINGS*", $list100);
            defconstant("*URL-DELIMITERS*", $list101);
            deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str103$_____________________);
            deflexical("*SOAP-ENVELOPE-URI*", $str114$http___schemas_xmlsoap_org_soap_e);
            deflexical("*SOAP-NAME-CACHING-STATE*", NIL);
            deflexical("*SOAP-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*", NIL);
            defparameter("*CGI-HOST*", $$$localhost);
            defparameter("*CGI-PORT*", $int$80);
            defparameter("*CGI-PATH*", $str184$_cgi_bin_services);
            defparameter("*HTTP-HEADER-DELIMITER*", cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), new SubLObject[]{ format_nil.format_nil_a_no_copy(CHAR_newline), format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline) }));
            defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", list(cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline)), Strings.make_string(ONE_INTEGER, CHAR_newline)));
            deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", NIL);
            defparameter("*ALTERNATE-SERVLET-CONTAINER-PORT*", NIL);
            defparameter("*ALTERNATE-SERVLET-CONTAINER-HOST*", NIL);
            defparameter("*LOCAL-SERVLET-CONTAINER-RUNNING?*", NIL);
            deflexical("*WEBAPP-MANIFEST-PATH*", $str204$webapps_apps_webapp_manifest_xml);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HTTP-INFORMATIONAL-CODES*", $list_alt25);
            deflexical("*HTTP-SUCCESS-CODES*", $list_alt26);
            deflexical("*HTTP-REDIRECTION-CODES*", $list_alt27);
            deflexical("*HTTP-CLIENT-ERROR-CODES*", $list_alt28);
            deflexical("*HTTP-SERVER-ERROR-CODES*", $list_alt29);
            deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list_alt32);
            deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list_alt34);
            deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str_alt64$Set_Cookie_);
            deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($$$domain, $$$expires, $str_alt68$max_age));
            deflexical("*OFFICIAL-URI-SCHEMES*", $list_alt82);
            deflexical("*UNOFFICIAL-URI-SCHEMES*", $list_alt83);
            defconstant("*VALID-URL-BEGINNINGS*", $list_alt84);
            defconstant("*URL-DELIMITERS*", $list_alt85);
            deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str_alt87$_____________________);
            defparameter("*REQUIRE-VALID-XML?*", NIL);
            defconstant("*DTP-XML-TOKEN-ITERATOR-STATE*", XML_TOKEN_ITERATOR_STATE);
            defparameter("*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized());
            defparameter("*CGI-PATH*", $str_alt243$_cgi_bin_services);
        }
        return NIL;
    }

    public static SubLObject init_web_utilities_file_Previous() {
        deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", $list0);
        deflexical("*DECODE-URLS-DURING-HTTP-READ-REQUEST*", NIL);
        deflexical("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*", $str27$_a_);
        deflexical("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*", FIVE_INTEGER);
        deflexical("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*", SubLTrampolineFile.maybeDefault($html_cyc_login_session_string_to_remote_host$, $html_cyc_login_session_string_to_remote_host$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*", $str33$var_KEA_port_from_cyc_base_port__);
        deflexical("*HTTP-INFORMATIONAL-CODES*", $list34);
        deflexical("*HTTP-SUCCESS-CODES*", $list35);
        deflexical("*HTTP-REDIRECTION-CODES*", $list36);
        deflexical("*HTTP-CLIENT-ERROR-CODES*", $list37);
        deflexical("*HTTP-SERVER-ERROR-CODES*", $list38);
        deflexical("*HTTP-ERROR-CODES*", append($http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue()));
        deflexical("*HTTP-STATUS-CODES*", append(new SubLObject[]{ $http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$.getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue() }));
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list41);
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_get_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-POST-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list44);
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_post_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-PUT-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*", $list45);
        deflexical("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_put_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*", $list46);
        deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_delete_request_template_components$.getGlobalValue()));
        defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", NIL);
        defparameter("*TRACE-HTTP-SEND-PUT-REQUESTS*", NIL);
        defparameter("*TRACE-HTTP-SEND-DELETE-REQUESTS*", NIL);
        defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL);
        deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str81$Set_Cookie_);
        deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", list(CHAR_semicolon));
        deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($$$domain, $$$expires, $str85$max_age));
        deflexical("*OFFICIAL-URI-SCHEMES*", $list98);
        deflexical("*UNOFFICIAL-URI-SCHEMES*", $list99);
        defconstant("*VALID-URL-BEGINNINGS*", $list100);
        defconstant("*URL-DELIMITERS*", $list101);
        deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str103$_____________________);
        deflexical("*SOAP-ENVELOPE-URI*", $str114$http___schemas_xmlsoap_org_soap_e);
        deflexical("*SOAP-NAME-CACHING-STATE*", NIL);
        deflexical("*SOAP-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*", NIL);
        defparameter("*CGI-HOST*", $$$localhost);
        defparameter("*CGI-PORT*", $int$80);
        defparameter("*CGI-PATH*", $str184$_cgi_bin_services);
        defparameter("*HTTP-HEADER-DELIMITER*", cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), new SubLObject[]{ format_nil.format_nil_a_no_copy(CHAR_newline), format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline) }));
        defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", list(cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline)), Strings.make_string(ONE_INTEGER, CHAR_newline)));
        deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", NIL);
        defparameter("*ALTERNATE-SERVLET-CONTAINER-PORT*", NIL);
        defparameter("*ALTERNATE-SERVLET-CONTAINER-HOST*", NIL);
        defparameter("*LOCAL-SERVLET-CONTAINER-RUNNING?*", NIL);
        deflexical("*WEBAPP-MANIFEST-PATH*", $str204$webapps_apps_webapp_manifest_xml);
        return NIL;
    }

    public static final SubLObject setup_web_utilities_file_alt() {
        define_test_case_table_int(RESOLVE_RELATIVE_URI, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt98);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), symbol_function(XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(XML_IT_STATE_IN_STREAM, _CSETF_XML_IT_STATE_IN_STREAM);
        def_csetf(XML_IT_STATE_SCRATCH_STREAM, _CSETF_XML_IT_STATE_SCRATCH_STREAM);
        def_csetf(XML_IT_STATE_TOKEN_OUTPUT_STREAM, _CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM);
        def_csetf(XML_IT_STATE_ENTITY_MAP, _CSETF_XML_IT_STATE_ENTITY_MAP);
        def_csetf(XML_IT_STATE_NAMESPACE_STACK, _CSETF_XML_IT_STATE_NAMESPACE_STACK);
        def_csetf($sym119$XML_IT_STATE_VALIDATE_, $sym120$_CSETF_XML_IT_STATE_VALIDATE_);
        def_csetf($sym121$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, $sym122$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_);
        def_csetf($sym123$XML_IT_STATE_RESOLVE_NAMESPACES_, $sym124$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_);
        def_csetf(XML_IT_STATE_ON_DECK_QUEUE, _CSETF_XML_IT_STATE_ON_DECK_QUEUE);
        identity(XML_TOKEN_ITERATOR_STATE);
        note_funcall_helper_function(PRINT_XML_TOKEN_ITERATOR_STATE);
        note_funcall_helper_function(ITERATE_XML_TOKEN_DONE);
        note_funcall_helper_function(ITERATE_XML_TOKEN_NEXT);
        register_external_symbol(XML_TOKENIZED_HTTP_REQUEST);
        memoization_state.note_memoized_function(PARSE_XML_TOKEN_INT);
        memoization_state.note_globally_cached_function(BYTE_ORDER_MARK);
        define_test_case_table_int(XML_TOKENS_TO_SEXPR, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt255);
        define_test_case_table_int(PARSE_HTML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt257);
        define_test_case_table_int(PARSE_XML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt259);
        return NIL;
    }

    public static SubLObject setup_web_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($html_cyc_login_session_string_to_remote_host$);
            define_test_case_table_int(RESOLVE_RELATIVE_URI, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
            memoization_state.note_globally_cached_function(SOAP_NAME);
            memoization_state.note_globally_cached_function(SOAP_EXPANDED_NAME);
            memoization_state.note_globally_cached_function(PERFORM_SOAP_POST_CACHED);
            define_test_case_table_int($sym179$MATCHING_OPEN_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list180);
            define_test_case_table_int($sym181$MATCHING_CLOSE_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list182);
            memoization_state.note_globally_cached_function(BYTE_ORDER_MARK);
            note_funcall_helper_function(START_SERVLET_CONTAINER);
            tcp_server_utilities.register_tcp_server_type($SERVLET, $list199, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(RESOLVE_RELATIVE_URI, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt98);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), symbol_function(XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
            def_csetf(XML_IT_STATE_IN_STREAM, _CSETF_XML_IT_STATE_IN_STREAM);
            def_csetf(XML_IT_STATE_SCRATCH_STREAM, _CSETF_XML_IT_STATE_SCRATCH_STREAM);
            def_csetf(XML_IT_STATE_TOKEN_OUTPUT_STREAM, _CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM);
            def_csetf(XML_IT_STATE_ENTITY_MAP, _CSETF_XML_IT_STATE_ENTITY_MAP);
            def_csetf(XML_IT_STATE_NAMESPACE_STACK, _CSETF_XML_IT_STATE_NAMESPACE_STACK);
            def_csetf($sym119$XML_IT_STATE_VALIDATE_, $sym120$_CSETF_XML_IT_STATE_VALIDATE_);
            def_csetf($sym121$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, $sym122$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_);
            def_csetf($sym123$XML_IT_STATE_RESOLVE_NAMESPACES_, $sym124$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_);
            def_csetf(XML_IT_STATE_ON_DECK_QUEUE, _CSETF_XML_IT_STATE_ON_DECK_QUEUE);
            identity(XML_TOKEN_ITERATOR_STATE);
            note_funcall_helper_function(PRINT_XML_TOKEN_ITERATOR_STATE);
            note_funcall_helper_function(ITERATE_XML_TOKEN_DONE);
            note_funcall_helper_function(ITERATE_XML_TOKEN_NEXT);
            register_external_symbol(XML_TOKENIZED_HTTP_REQUEST);
            memoization_state.note_memoized_function(PARSE_XML_TOKEN_INT);
            define_test_case_table_int(XML_TOKENS_TO_SEXPR, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt255);
            define_test_case_table_int(PARSE_HTML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt257);
            define_test_case_table_int(PARSE_XML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt259);
        }
        return NIL;
    }

    public static SubLObject setup_web_utilities_file_Previous() {
        declare_defglobal($html_cyc_login_session_string_to_remote_host$);
        define_test_case_table_int(RESOLVE_RELATIVE_URI, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
        memoization_state.note_globally_cached_function(SOAP_NAME);
        memoization_state.note_globally_cached_function(SOAP_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(PERFORM_SOAP_POST_CACHED);
        define_test_case_table_int($sym179$MATCHING_OPEN_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list180);
        define_test_case_table_int($sym181$MATCHING_CLOSE_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list182);
        memoization_state.note_globally_cached_function(BYTE_ORDER_MARK);
        note_funcall_helper_function(START_SERVLET_CONTAINER);
        tcp_server_utilities.register_tcp_server_type($SERVLET, $list199, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_web_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_web_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_web_utilities_file();
    }

    

    public static final class $html_url_expand_char$UnaryFunction extends UnaryFunction {
        public $html_url_expand_char$UnaryFunction() {
            super(extractFunctionNamed("HTML-URL-EXPAND-CHAR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return html_url_expand_char(arg1);
        }
    }

    public static final class $url_p$UnaryFunction extends UnaryFunction {
        public $url_p$UnaryFunction() {
            super(extractFunctionNamed("URL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return url_p(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeString("text/plain"), makeString("text/html"));

    static private final SubLList $list_alt1 = list(list(new SubLObject[]{ makeSymbol("CHANNEL"), makeSymbol("MACHINE"), makeSymbol("URL"), makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(makeKeyword("QUERY"), makeKeyword("METHOD"), $PORT, makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"));

    static private final SubLSymbol $sym13$REAL_PORT = makeUninternedSymbol("REAL-PORT");

    static private final SubLList $list_alt16 = list(makeKeyword("DEFAULT"));

    static private final SubLList $list_alt25 = list(cons(makeInteger(100), makeString("Continue")), cons(makeInteger(101), makeString("Switching Protocols")));

    static private final SubLList $list_alt26 = list(cons(makeInteger(200), makeString("OK")), cons(makeInteger(201), makeString("Created")), cons(makeInteger(202), makeString("Accepted")), cons(makeInteger(203), makeString("Non-Authoritative Information")), cons(makeInteger(204), makeString("No Content")), cons(makeInteger(205), makeString("Reset Content")), cons(makeInteger(206), makeString("Partial Content")));

    static private final SubLList $list_alt27 = list(cons(makeInteger(300), makeString("Multiple Choices")), cons(makeInteger(301), makeString("Moved Permanently")), cons(makeInteger(302), makeString("Found")), cons(makeInteger(303), makeString("See Other")), cons(makeInteger(304), makeString("Not Modified")), cons(makeInteger(305), makeString("Use Proxy")), cons(makeInteger(306), makeString("(Unused)")), cons(makeInteger(307), makeString("Temporary Redirect")));

    static private final SubLList $list_alt28 = list(new SubLObject[]{ cons(makeInteger(400), makeString("Bad Request")), cons(makeInteger(401), makeString("Unauthorized")), cons(makeInteger(403), makeString("Forbidden")), cons(makeInteger(404), makeString("Not Found")), cons(makeInteger(405), makeString("Method Not Allowed")), cons(makeInteger(406), makeString("Not Acceptable")), cons(makeInteger(407), makeString("Proxy Authentication Required")), cons(makeInteger(408), makeString("Request Timeout")), cons(makeInteger(409), makeString("Conflict")), cons(makeInteger(410), makeString("Gone")), cons(makeInteger(411), makeString("Length Required")), cons(makeInteger(412), makeString("Precondition Failed")), cons(makeInteger(413), makeString("Request Entity Too Large")), cons(makeInteger(414), makeString("Request-URI Too Long")), cons(makeInteger(415), makeString("Unsupported Media Type")), cons(makeInteger(416), makeString("Requested Range Not Satisfiable")), cons(makeInteger(417), makeString("Expectation Failed")) });

    static private final SubLList $list_alt29 = list(cons(makeInteger(500), makeString("Internal Server Error")), cons(makeInteger(501), makeString("Not Implemented")), cons(makeInteger(502), makeString("Bad Gateway")), cons(makeInteger(503), makeString("Service Unavailable")), cons(makeInteger(504), makeString("Gateway Timeout")), cons(makeInteger(505), makeString("HTTP Version not supported")));

    static private final SubLString $str_alt30$HTTP_1_1_200_OK = makeString("HTTP/1.1 200 OK");

    static private final SubLString $str_alt31$HTTP_1_1_ = makeString("HTTP/1.1 ");

    static private final SubLList $list_alt32 = list(list(makeKeyword("VERSION"), makeString("GET ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("BLANK-LINE"), NIL));

    static private final SubLList $list_alt34 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("POST ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A")), list($HOST, makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: application/x-www-form-urlencoded")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("MACHINE"), list(makeSymbol("PORT"), makeInteger(80)), list(makeSymbol("METHOD"), makeKeyword("GET")), makeSymbol("URL"), makeSymbol("QUERY"), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")) });

    static private final SubLList $list_alt37 = list(makeKeyword("MACHINE"), $PORT, makeKeyword("METHOD"), makeKeyword("URL"), makeKeyword("QUERY"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("ACCEPT-TYPES"));

    static private final SubLString $str_alt43$Unsupported_HTTP_request_method__ = makeString("Unsupported HTTP request method : ~S");

    static private final SubLList $list_alt44 = list(list(makeSymbol("COOKIE-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt46 = list(makeSymbol("ACTION"), makeSymbol("FORMAT-STRING"));

    static private final SubLString $str_alt50$Keep_Alive___S = makeString("Keep-Alive: ~S");

    static private final SubLString $str_alt51$keep_alive = makeString("keep-alive");

    static private final SubLString $str_alt55$_ = makeString(":");

    static private final SubLString $str_alt59$__ = makeString(", ");

    static private final SubLString $str_alt60$_ = makeString("?");

    static private final SubLString $str_alt61$Date__ = makeString("Date: ");

    static private final SubLString $str_alt62$Server__Cyc_ = makeString("Server: Cyc/");

    static private final SubLString $str_alt63$__ = makeString(": ");

    static private final SubLString $str_alt64$Set_Cookie_ = makeString("Set-Cookie:");

    static private final SubLSymbol $sym65$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str_alt68$max_age = makeString("max-age");

    static private final SubLString $str_alt70$__ = makeString(" $");

    static private final SubLString $str_alt75$____ = makeString("-_.=");

    static private final SubLString $str_alt77$_S = makeString("~S");

    static private final SubLString $str_alt78$mailto_ = makeString("mailto:");

    static private final SubLList $list_alt79 = list(makeString(":"), makeString("/"));

    static private final SubLString $str_alt81$_ = makeString("/");

    static private final SubLList $list_alt82 = list(new SubLObject[]{ makeString("aaa:"), makeString("aaas:"), makeString("acap:"), makeString("cap:"), makeString("cid:"), makeString("crid:"), makeString("data:"), makeString("dav:"), makeString("dict:"), makeString("dns:"), makeString("fax:"), makeString("file:"), makeString("ftp:"), makeString("go:"), makeString("gopher:"), makeString("h323:"), makeString("http:"), makeString("https:"), makeString("im"), makeString("imap:"), makeString("ldap:"), makeString("mailto:"), makeString("mid:"), makeString("news:"), makeString("nfs:"), makeString("nntp:"), makeString("pop:"), makeString("pres:"), makeString("sip:"), makeString("sips:"), makeString("snmp:"), makeString("tel:"), makeString("telnet:"), makeString("urn:"), makeString("wais:"), makeString("xmpp:") });

    static private final SubLList $list_alt83 = list(new SubLObject[]{ makeString("about:"), makeString("aim:"), makeString("callto:"), makeString("cvs:"), makeString("ed2k:"), makeString("feed:"), makeString("fish:"), makeString("gizmoproject:"), makeString("iax2:"), makeString("irc:"), makeString("ircs:"), makeString("lastfm:"), makeString("ldaps:"), makeString("magnet:"), makeString("mms:"), makeString("msnim:"), makeString("nsfw:"), makeString("psyc:"), makeString("rsync:"), makeString("secondlife:"), makeString("skype:"), makeString("ssh:"), makeString("sftp:"), makeString("smb:"), makeString("sms:"), makeString("soldat:"), makeString("steam:"), makeString("tag:"), makeString("unreal:"), makeString("ut2004:"), makeString("webcal:"), makeString("xfire:"), makeString("ymsgr:") });

    static private final SubLList $list_alt84 = list(makeString("http://"), makeString("https://"), makeString("ftp://"), makeString("gopher://"), makeString("file:"), makeString("news:"), makeString("mailto:"), makeString("anon:"));

    static private final SubLList $list_alt85 = list(CHAR_space, CHAR_period, CHAR_comma, CHAR_question, CHAR_exclamation, CHAR_rparen);

    static private final SubLString $str_alt87$_____________________ = makeString(";@?%/:=$-_.+!*'(),#&~");

    static private final SubLString $str_alt88$___ = makeString("../");

    static private final SubLString $str_alt89$__ = makeString("//");

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt98 = list(new SubLObject[]{ list(list(makeString("http://example.org"), makeString("relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org#"), makeString("prop")), makeString("http://example.org#prop")), list(list(makeString("http://example.org/"), makeString("named")), makeString("http://example.org/named")), list(list(makeString("http://example.org/#"), makeString("owes")), makeString("http://example.org/#owes")), list(list(makeString("http://example.org/dir/file"), makeString("relfile")), makeString("http://example.org/dir/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("../relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("/absfile")), makeString("http://example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("//another.example.org/absfile")), makeString("http://another.example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("#foo")), makeString("http://example.org/dir/file#foo")), list(list(makeString("http://example.org/dir/file"), makeString("")), makeString("http://example.org/dir/file")), list(list(makeString("http://foo/"), makeString("Bar")), makeString("http://foo/Bar")), list(list(makeString("http://my.example.org/"), makeString("Name")), makeString("http://my.example.org/Name")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Creator")), makeString("http://purl.org/metadata/dublin_core#Creator")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Title")), makeString("http://purl.org/metadata/dublin_core#Title")), list(list(makeString("http://random.ioctl.org/#"), makeString("prop2")), makeString("http://random.ioctl.org/#prop2")), list(list(makeString("http://random.ioctl.org/#"), makeString("someProperty")), makeString("http://random.ioctl.org/#someProperty")), list(list(makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), makeString("_2")), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), makeString("Manifest.rdf")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), makeString("premises005.rdf#B")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), makeString("#frag")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag")) });

    private static final SubLSymbol ITERATE_XML_TOKEN_DONE = makeSymbol("ITERATE-XML-TOKEN-DONE");

    private static final SubLSymbol ITERATE_XML_TOKEN_NEXT = makeSymbol("ITERATE-XML-TOKEN-NEXT");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE = makeSymbol("XML-TOKEN-ITERATOR-STATE");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE_P = makeSymbol("XML-TOKEN-ITERATOR-STATE-P");

    static private final SubLList $list_alt103 = list(new SubLObject[]{ makeSymbol("IN-STREAM"), makeSymbol("SCRATCH-STREAM"), makeSymbol("TOKEN-OUTPUT-STREAM"), makeSymbol("ENTITY-MAP"), makeSymbol("NAMESPACE-STACK"), makeSymbol("VALIDATE?"), makeSymbol("RESOLVE-ENTITY-REFERENCES?"), makeSymbol("RESOLVE-NAMESPACES?"), makeSymbol("ON-DECK-QUEUE") });

    static private final SubLList $list_alt104 = list(new SubLObject[]{ makeKeyword("IN-STREAM"), makeKeyword("SCRATCH-STREAM"), makeKeyword("TOKEN-OUTPUT-STREAM"), makeKeyword("ENTITY-MAP"), makeKeyword("NAMESPACE-STACK"), makeKeyword("VALIDATE?"), makeKeyword("RESOLVE-ENTITY-REFERENCES?"), makeKeyword("RESOLVE-NAMESPACES?"), makeKeyword("ON-DECK-QUEUE") });

    static private final SubLList $list_alt105 = list(new SubLObject[]{ makeSymbol("XML-IT-STATE-IN-STREAM"), makeSymbol("XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("XML-IT-STATE-ENTITY-MAP"), makeSymbol("XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("XML-IT-STATE-VALIDATE?"), makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("XML-IT-STATE-ON-DECK-QUEUE") });

    static private final SubLList $list_alt106 = list(new SubLObject[]{ makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP"), makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE") });

    private static final SubLSymbol PRINT_XML_TOKEN_ITERATOR_STATE = makeSymbol("PRINT-XML-TOKEN-ITERATOR-STATE");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol XML_IT_STATE_IN_STREAM = makeSymbol("XML-IT-STATE-IN-STREAM");

    public static final SubLSymbol _CSETF_XML_IT_STATE_IN_STREAM = makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM");

    private static final SubLSymbol XML_IT_STATE_SCRATCH_STREAM = makeSymbol("XML-IT-STATE-SCRATCH-STREAM");

    public static final SubLSymbol _CSETF_XML_IT_STATE_SCRATCH_STREAM = makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM");

    private static final SubLSymbol XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM");

    public static final SubLSymbol _CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM");

    private static final SubLSymbol XML_IT_STATE_ENTITY_MAP = makeSymbol("XML-IT-STATE-ENTITY-MAP");

    public static final SubLSymbol _CSETF_XML_IT_STATE_ENTITY_MAP = makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP");

    private static final SubLSymbol XML_IT_STATE_NAMESPACE_STACK = makeSymbol("XML-IT-STATE-NAMESPACE-STACK");

    public static final SubLSymbol _CSETF_XML_IT_STATE_NAMESPACE_STACK = makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK");

    static private final SubLSymbol $sym119$XML_IT_STATE_VALIDATE_ = makeSymbol("XML-IT-STATE-VALIDATE?");

    static private final SubLSymbol $sym120$_CSETF_XML_IT_STATE_VALIDATE_ = makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?");

    static private final SubLSymbol $sym121$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");

    static private final SubLSymbol $sym122$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");

    static private final SubLSymbol $sym123$XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?");

    static private final SubLSymbol $sym124$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?");

    private static final SubLSymbol XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("XML-IT-STATE-ON-DECK-QUEUE");

    public static final SubLSymbol _CSETF_XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE");

    private static final SubLSymbol $IN_STREAM = makeKeyword("IN-STREAM");

    private static final SubLSymbol $SCRATCH_STREAM = makeKeyword("SCRATCH-STREAM");

    private static final SubLSymbol $TOKEN_OUTPUT_STREAM = makeKeyword("TOKEN-OUTPUT-STREAM");

    private static final SubLSymbol $ENTITY_MAP = makeKeyword("ENTITY-MAP");

    private static final SubLSymbol $NAMESPACE_STACK = makeKeyword("NAMESPACE-STACK");

    public static final SubLSymbol $kw132$VALIDATE_ = makeKeyword("VALIDATE?");

    public static final SubLSymbol $kw133$RESOLVE_ENTITY_REFERENCES_ = makeKeyword("RESOLVE-ENTITY-REFERENCES?");

    public static final SubLSymbol $kw134$RESOLVE_NAMESPACES_ = makeKeyword("RESOLVE-NAMESPACES?");

    private static final SubLSymbol $ON_DECK_QUEUE = makeKeyword("ON-DECK-QUEUE");

    static private final SubLString $str_alt136$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt137$_XML_TOKEN_ITERATOR_STATE_ = makeString("<XML-TOKEN-ITERATOR-STATE>");

    static private final SubLString $str_alt139$Can_t_parse_HTML_as_XML_ = makeString("Can't parse HTML as XML.");

    static private final SubLString $str_alt140$Couldn_t_resolve_namespace__S_in_ = makeString("Couldn't resolve namespace ~S in ~S");

    static private final SubLString $str_alt141$Mismatched_tags__Expected__S__got = makeString("Mismatched tags: Expected ~S, got ~S");

    static private final SubLList $list_alt142 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));

    static private final SubLString $str_alt143$xmlns_ = makeString("xmlns:");

    static private final SubLList $list_alt144 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt145 = cons(makeSymbol("ATTRIBUTE-NAME"), makeUninternedSymbol("VALUE"));

    static private final SubLString $$$xml = makeString("xml");

    static private final SubLString $str_alt147$http___www_w3_org_XML_1998_namesp = makeString("http://www.w3.org/XML/1998/namespace");

    static private final SubLString $str_alt148$_S_is_not_a_prefixed_XML_name_ = makeString("~S is not a prefixed XML name.");

    private static final SubLSymbol XML_TOKENIZED_HTTP_REQUEST = makeSymbol("XML-TOKENIZED-HTTP-REQUEST");

    static private final SubLList $list_alt154 = list(makeSymbol("IN-STREAM"));

    private static final SubLSymbol HTML_TOKENIZE = makeSymbol("HTML-TOKENIZE");

    static private final SubLList $list_alt156 = list(makeSymbol("XML-TOKENIZE"));

    private static final SubLSymbol XML_TOKENIZE = makeSymbol("XML-TOKENIZE");

    static private final SubLList $list_alt158 = list(NIL);

    private static final SubLSymbol XML_TOKEN_MENTIONS = makeSymbol("XML-TOKEN-MENTIONS");

    static private final SubLString $str_alt161$_ = makeString("<");

    static private final SubLString $str_alt162$__ = makeString("/>");

    static private final SubLString $str_alt163$__ = makeString("</");

    static private final SubLSymbol $sym164$XML_TAG_ = makeSymbol("XML-TAG?");

    static private final SubLList $list_alt165 = cons(makeSymbol("FIRST-TOKEN"), makeSymbol("REST-OF-TOKENS"));

    static private final SubLSymbol $sym166$XML_TOKEN_ELEMENT_NAME_ = makeSymbol("XML-TOKEN-ELEMENT-NAME?");

    static private final SubLString $str_alt167$Couldn_t_find_position_of__S_in__ = makeString("Couldn't find position of ~S in ~S");

    static private final SubLString $str_alt168$_xml = makeString("?xml");

    static private final SubLString $str_alt169$____ = makeString("<!--");

    static private final SubLString $str_alt170$___ = makeString("-->");

    static private final SubLList $list_alt171 = list(cons(CHAR_less, CHAR_greater));

    static private final SubLList $list_alt172 = list(CHAR_less, CHAR_greater);

    static private final SubLString $str_alt173$___ = makeString("!--");

    static private final SubLString $str_alt174$__CDATA_ = makeString("![CDATA[");

    static private final SubLString $str_alt175$__ = makeString("--");

    static private final SubLString $str_alt176$__ = makeString("]]");

    static private final SubLString $str_alt177$Mismatched_closing_bracket__S_fol = makeString("Mismatched closing bracket ~S following ~S. Expected ~S");

    static private final SubLString $str_alt178$_DOCTYPE = makeString("!DOCTYPE");

    static private final SubLString $str_alt179$__DOCTYPE_HTML_ = makeString("<!DOCTYPE HTML ");

    static private final SubLString $str_alt180$__ = makeString("<?");

    static private final SubLString $str_alt181$__ = makeString("?>");

    static private final SubLList $list_alt182 = list(CHAR_lbracket);

    static private final SubLList $list_alt183 = listS(makeSymbol("DOCTYPE"), makeSymbol("NAME"), makeSymbol("OPEN-BRACKET"), makeSymbol("REST"));

    static private final SubLString $str_alt184$__DOCTYPE = makeString("<!DOCTYPE");

    static private final SubLString $str_alt185$Got__S_instead_of___DOCTYPE_ = makeString("Got ~S instead of <!DOCTYPE.");

    static private final SubLString $str_alt186$_ = makeString("[");

    static private final SubLString $str_alt187$__ENTITY = makeString("<!ENTITY");

    static private final SubLString $str_alt188$_ = makeString("&");

    static private final SubLString $str_alt189$_ = makeString(";");

    static private final SubLList $list_alt190 = cons(makeSymbol("NAME"), makeSymbol("CODE"));

    private static final SubLSymbol PARSE_XML_TOKEN_INT = makeSymbol("PARSE-XML-TOKEN-INT");

    static private final SubLString $str_alt193$XML_syntax_error__No___before__S = makeString("XML syntax error: No = before ~S");

    static private final SubLString $str_alt194$XML_syntax_error__Value_starting_ = makeString("XML syntax error: Value starting at ~S is not in quotes.");

    public static final SubLSymbol $kw195$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol VALID_XML_NAME_P = makeSymbol("VALID-XML-NAME-P");

    static private final SubLSymbol $sym197$XML_CDATA_TAG_ = makeSymbol("XML-CDATA-TAG?");

    static private final SubLString $str_alt198$_S_is_not_an_XML_token = makeString("~S is not an XML token");

    static private final SubLSymbol $sym199$STRING_ = makeSymbol("STRING=");

    static private final SubLList $list_alt200 = list(CHAR_space, CHAR_slash);

    static private final SubLString $str_alt202$Location__ = makeString("Location: ");

    static private final SubLString $str_alt203$http___ = makeString("http://");

    static private final SubLList $list_alt205 = list(makeSymbol("MSG"), makeSymbol("EXP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt207$_____Averted__connection_reset_by = makeString("~&>> Averted 'connection reset by peer' error !!");

    static private final SubLString $str_alt209$_GMT = makeString(" GMT");

    static private final SubLList $list_alt210 = list(makeSymbol("PATTERN"), makeSymbol("LIST"));

    static private final SubLList $list_alt212 = list(list(makeSymbol("FUNCTION"), makeSymbol("SEARCH")));

    static private final SubLList $list_alt213 = list(makeSymbol("LIST"));

    static private final SubLList $list_alt218 = list(makeSymbol("TOKENS"), makeSymbol("TAG"));

    static private final SubLSymbol $sym219$MARKER = makeUninternedSymbol("MARKER");

    static private final SubLString $str_alt224$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");

    static private final SubLSymbol $sym226$MARKER = makeUninternedSymbol("MARKER");

    static private final SubLSymbol $sym227$IS_HTML_TERMINATING_TAG_ = makeSymbol("IS-HTML-TERMINATING-TAG?");

    static private final SubLString $str_alt228$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");

    static private final SubLList $list_alt229 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"));

    static private final SubLList $list_alt233 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    static private final SubLSymbol $sym234$TEMP = makeUninternedSymbol("TEMP");

    static private final SubLSymbol $sym236$TEST_FOR_HTML_TAG_ = makeSymbol("TEST-FOR-HTML-TAG?");

    static private final SubLString $str_alt239$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt241$_ = makeString("=");

    static private final SubLString $str_alt243$_cgi_bin_services = makeString("/cgi-bin/services");

    static private final SubLString $str_alt245$_ufeff_ = makeString("&ufeff;");

    static private final SubLString $str_alt247$___A__A_____ = makeString("~{~A=~A~^&~}");

    static private final SubLList $list_alt250 = list(makeString("text/html"), makeString("*/*"));

    static private final SubLString $str_alt251$file___ = makeString("file://");

    static private final SubLSymbol $sym252$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    private static final SubLSymbol XML_TOKENS_TO_SEXPR = makeSymbol("XML-TOKENS-TO-SEXPR");

    static private final SubLList $list_alt255 = list(list(list(list(makeString("<html>"), makeString("<body bgcolor='3'>"), makeString("Here is some text"), makeString("<br/>"), makeString("</body>"), makeString("</html>"))), list(list(makeString("html")), list(list(makeString("body"), cons(makeString("bgcolor"), makeString("3"))), makeString("Here is some text"), list(list(makeString("br")))))));

    private static final SubLSymbol PARSE_HTML_TOKEN = makeSymbol("PARSE-HTML-TOKEN");

    static private final SubLList $list_alt257 = list(list(list(makeString("<pre style=\"display:none\" id=RadEditorEncodedTag>")), list(makeString("pre"), cons(makeString("style"), makeString("display:none")), cons(makeString("id"), makeString("RadEditorEncodedTag")))), list(list(makeString("<pre id=RadEditorEncodedTag style=\"display:none\">")), list(makeString("pre"), cons(makeString("id"), makeString("RadEditorEncodedTag")), cons(makeString("style"), makeString("display:none")))));

    private static final SubLSymbol PARSE_XML_TOKEN = makeSymbol("PARSE-XML-TOKEN");

    public static final SubLObject $list_alt259 = com.cyc.cycjava.cycl.web_utilities._constant_259_initializer();
}

/**
 * Total time: 1042 ms synthetic
 */
