/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.utilities_macros.print_2_digit_nonnegative_integer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_3;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mail_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject get_rfc_822_time_string() {
        {
            SubLObject temp_file = cconcatenate($str_alt67$_tmp_get_rfc_822_time_string_, format_nil.format_nil_a_no_copy(random.random($int$10000)));
            SubLObject error_message = NIL;
            SubLObject result = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_binary(temp_file, $IO, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt53$Unable_to_open__S, temp_file);
                                    }
                                    {
                                        SubLObject temp_stream = stream;
                                        SubLObject process = os_process_utilities.make_os_process($$$Getting_RFC822_Date, $$$date, $list_alt72, temp_stream, temp_stream, UNPROVIDED);
                                        os_process_utilities.wait_until_os_process_finished(process);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_8 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_8);
                                        }
                                    }
                                }
                            }
                            if (NIL != Filesys.probe_file(temp_file)) {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = compatibility.open_text(temp_file, $INPUT, NIL);
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt53$Unable_to_open__S, temp_file);
                                        }
                                        {
                                            SubLObject s = stream;
                                            result = read_line(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_9 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (stream.isStream()) {
                                                    close(stream, UNPROVIDED);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_9);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject ignore_errors_tag = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_10 = currentBinding(Errors.$error_handler$);
                                            try {
                                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                                try {
                                                    Filesys.delete_file(temp_file);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                rebind(Errors.$error_handler$, _prev_bind_0_10);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
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
            if (NIL != string_utilities.non_empty_stringP(error_message)) {
                Errors.cerror($$$Continue, $str_alt77$Getting_RFC822_date_failed___A_, error_message);
            } else {
                return result;
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt63$ = makeString("");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cycorp_domain_name_string$ = makeSymbol("*CYCORP-DOMAIN-NAME-STRING*");

    public static final SubLFile me = new mail_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.mail_utilities";


    // deflexical
    // The Cycorp SMTP host name.
    /**
     * The Cycorp SMTP host name.
     */
    @LispMethod(comment = "The Cycorp SMTP host name.\ndeflexical")
    public static final SubLSymbol $smtp_host_cycorp$ = makeSymbol("*SMTP-HOST-CYCORP*");

    // deflexical
    /**
     * Sleep this long while waiting for SMTP server to process each command. Value
     * chosen is implementation specific, based on trial and error.
     */
    @LispMethod(comment = "Sleep this long while waiting for SMTP server to process each command. Value\r\nchosen is implementation specific, based on trial and error.\ndeflexical\nSleep this long while waiting for SMTP server to process each command. Value\nchosen is implementation specific, based on trial and error.")
    private static final SubLSymbol $smtp_sleep_length$ = makeSymbol("*SMTP-SLEEP-LENGTH*");

    // deflexical
    // NIL or path of file to which to write failed email messages
    /**
     * NIL or path of file to which to write failed email messages
     */
    @LispMethod(comment = "NIL or path of file to which to write failed email messages\ndeflexical")
    private static final SubLSymbol $failed_email_log_file$ = makeSymbol("*FAILED-EMAIL-LOG-FILE*");



    private static final SubLString $str1$smtp_unknown_com = makeString("smtp.unknown.com");

    static private final SubLList $list2 = list(list(new SubLObject[]{ makeSymbol("BISTREAM"), makeSymbol("&KEY"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), list(makeSymbol("HOST"), makeString("localhost")), list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SMTP-PORT*"))), makeSymbol("TIMEOUT") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list3 = list($FROM, makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), $HOST, $PORT, makeKeyword("TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$localhost = makeString("localhost");

    public static final SubLSymbol $smtp_port$ = makeSymbol("*SMTP-PORT*");

    static private final SubLList $list15 = list(makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));

    private static final SubLSymbol SENDING_MAIL_VIA_SMTP_PREAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-PREAMBLE");

    private static final SubLSymbol SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE");

    private static final SubLSymbol SENDING_MAIL_VIA_SMTP_POSTAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-POSTAMBLE");

    private static final SubLSymbol WITH_SMTP_CONNECTION = makeSymbol("WITH-SMTP-CONNECTION");

    static private final SubLString $str23$HELO__A = makeString("HELO ~A");

    static private final SubLString $str24$MAIL_FROM____A_ = makeString("MAIL FROM: <~A>");

    static private final SubLString $str25$RCPT_TO____A_ = makeString("RCPT TO: <~A>");

    static private final SubLString $$$DATA = makeString("DATA");

    static private final SubLString $str27$Date___A = makeString("Date: ~A");

    static private final SubLString $str28$From___A = makeString("From: ~A");

    static private final SubLString $str29$To__ = makeString("To: ");

    static private final SubLString $str30$Cc__ = makeString("Cc: ");

    static private final SubLString $str31$Bcc__ = makeString("Bcc: ");

    static private final SubLList $list32 = list(makeString(", "), makeString(","));

    static private final SubLString $str34$__ = makeString(", ");

    static private final SubLString $str35$_A = makeString("~A");

    static private final SubLString $str36$_ = makeString(".");

    static private final SubLString $$$QUIT = makeString("QUIT");

    private static final SubLFloat $float$0_005 = makeDouble(0.005);

    static private final SubLString $str39$SMTP_error___A = makeString("SMTP error: ~A");

    static private final SubLList $list40 = list(new SubLObject[]{ makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("MESSAGE"), makeSymbol("&KEY"), makeSymbol("SUBJECT"), list(makeSymbol("HOST"), makeString("localhost")), makeSymbol("ADDITIONAL-HEADERS"), list(makeSymbol("PORT"), makeSymbol("*SMTP-PORT*")), list(makeSymbol("TIMEOUT"), TEN_INTEGER), makeSymbol("CC"), makeSymbol("BCC") });

    static private final SubLList $list41 = list(makeKeyword("SUBJECT"), $HOST, makeKeyword("ADDITIONAL-HEADERS"), $PORT, makeKeyword("TIMEOUT"), makeKeyword("CC"), makeKeyword("BCC"));

    private static final SubLSymbol MAIL_MESSAGE = makeSymbol("MAIL-MESSAGE");

    static private final SubLString $str47$Subject___A = makeString("Subject: ~A");

    private static final SubLSymbol MESSAGE_PART_P = makeSymbol("MESSAGE-PART-P");

    static private final SubLString $str49$Message_must_be_a_string_or_a_lis = makeString("Message must be a string or a list of message parts, not ~S");

    static private final SubLString $str50$SMTP_connection_apparently_timed_ = makeString("SMTP connection apparently timed out after ~S seconds.");

    static private final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str55$__The_following_message_with_host = makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");

    static private final SubLString $str56$Date___A__ = makeString("Date: ~A~%");

    static private final SubLString $str57$From___A__ = makeString("From: ~A~%");

    static private final SubLString $str58$To___A__ = makeString("To: ~A~%");

    static private final SubLString $str59$Subject___A__ = makeString("Subject: ~A~%");

    static private final SubLString $str60$__no_message__ = makeString("--no message--");

    static private final SubLString $str61$___A__ = makeString("~&~A~&");

    private static final SubLString $str62$ = makeString("");

    private static final SubLString $$$domainname = makeString("domainname");

    private static final SubLList $list64 = list(makeString("-d"));

    private static final SubLString $str65$_ = makeString("@");

    /**
     * Binds a new stream to BISTREAM over which you can format a text of
     * an e-mail message.  HOST and PORT specify which mail server (SMTP)
     * to connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.
     * The message will be sent from the address FROM (a string)
     * to the addresses TO (which may be either a string or a list of strings).
     */
    @LispMethod(comment = "Binds a new stream to BISTREAM over which you can format a text of\r\nan e-mail message.  HOST and PORT specify which mail server (SMTP)\r\nto connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.\r\nThe message will be sent from the address FROM (a string)\r\nto the addresses TO (which may be either a string or a list of strings).\nBinds a new stream to BISTREAM over which you can format a text of\nan e-mail message.  HOST and PORT specify which mail server (SMTP)\nto connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.\nThe message will be sent from the address FROM (a string)\nto the addresses TO (which may be either a string or a list of strings).")
    public static final SubLObject with_smtp_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bistream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    bistream = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            if (NIL == member(current_1, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt2);
                        }
                        {
                            SubLObject from_tail = property_list_member($FROM, current);
                            SubLObject from = (NIL != from_tail) ? ((SubLObject) (cadr(from_tail))) : NIL;
                            SubLObject to_tail = property_list_member($TO, current);
                            SubLObject to = (NIL != to_tail) ? ((SubLObject) (cadr(to_tail))) : NIL;
                            SubLObject cc_tail = property_list_member($CC, current);
                            SubLObject cc = (NIL != cc_tail) ? ((SubLObject) (cadr(cc_tail))) : NIL;
                            SubLObject bcc_tail = property_list_member($BCC, current);
                            SubLObject bcc = (NIL != bcc_tail) ? ((SubLObject) (cadr(bcc_tail))) : NIL;
                            SubLObject host_tail = property_list_member($HOST, current);
                            SubLObject host = (NIL != host_tail) ? ((SubLObject) (cadr(host_tail))) : $$$localhost;
                            SubLObject port_tail = property_list_member($PORT, current);
                            SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $smtp_port$;
                            SubLObject timeout_tail = property_list_member($TIMEOUT, current);
                            SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(WITH_TCP_CONNECTION, listS(bistream, host, port, $TIMEOUT, timeout, $list_alt15), list(CUNWIND_PROTECT, list(PROGN, list(SENDING_MAIL_VIA_SMTP_PREAMBLE, bistream, from, to, cc, bcc), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE, bistream))), list(SENDING_MAIL_VIA_SMTP_POSTAMBLE, bistream)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Binds a new stream to BISTREAM over which you can format a text of
     * an e-mail message.  HOST and PORT specify which mail server (SMTP)
     * to connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.
     * The message will be sent from the address FROM (a string)
     * to the addresses TO (which may be either a string or a list of strings).
     */
    @LispMethod(comment = "Binds a new stream to BISTREAM over which you can format a text of\r\nan e-mail message.  HOST and PORT specify which mail server (SMTP)\r\nto connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.\r\nThe message will be sent from the address FROM (a string)\r\nto the addresses TO (which may be either a string or a list of strings).\nBinds a new stream to BISTREAM over which you can format a text of\nan e-mail message.  HOST and PORT specify which mail server (SMTP)\nto connect to.  TIMEOUT, if non-nil, is a connection timeout in seconds.\nThe message will be sent from the address FROM (a string)\nto the addresses TO (which may be either a string or a list of strings).")
    public static SubLObject with_smtp_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bistream = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        bistream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list2);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list2);
            if (NIL == member(current_$1, $list3, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list2);
        }
        final SubLObject from_tail = property_list_member($FROM, current);
        final SubLObject from = (NIL != from_tail) ? cadr(from_tail) : NIL;
        final SubLObject to_tail = property_list_member($TO, current);
        final SubLObject to = (NIL != to_tail) ? cadr(to_tail) : NIL;
        final SubLObject cc_tail = property_list_member($CC, current);
        final SubLObject cc = (NIL != cc_tail) ? cadr(cc_tail) : NIL;
        final SubLObject bcc_tail = property_list_member($BCC, current);
        final SubLObject bcc = (NIL != bcc_tail) ? cadr(bcc_tail) : NIL;
        final SubLObject host_tail = property_list_member($HOST, current);
        final SubLObject host = (NIL != host_tail) ? cadr(host_tail) : $$$localhost;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $smtp_port$;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(WITH_TCP_CONNECTION, listS(bistream, host, port, $TIMEOUT, timeout, $list15), list(CUNWIND_PROTECT, list(PROGN, list(SENDING_MAIL_VIA_SMTP_PREAMBLE, bistream, from, to, cc, bcc), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE, bistream))), list(SENDING_MAIL_VIA_SMTP_POSTAMBLE, bistream)));
    }

    public static final SubLObject sending_mail_via_smtp_preamble_alt(SubLObject bistream, SubLObject from, SubLObject to_list, SubLObject cc_list, SubLObject bcc_list) {
        if (cc_list == UNPROVIDED) {
            cc_list = NIL;
        }
        if (bcc_list == UNPROVIDED) {
            bcc_list = NIL;
        }
        SubLTrampolineFile.checkType(from, STRINGP);
        to_list = com.cyc.cycjava.cycl.mail_utilities.check_or_clean_addressee_list(to_list);
        cc_list = com.cyc.cycjava.cycl.mail_utilities.check_or_clean_addressee_list(cc_list);
        bcc_list = com.cyc.cycjava.cycl.mail_utilities.check_or_clean_addressee_list(bcc_list);
        format(bistream, $str_alt23$HELO__A, Environment.machine_instance());
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
        format(bistream, $str_alt24$MAIL_FROM____A_, from);
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
        {
            SubLObject cdolist_list_var = list(to_list, cc_list, bcc_list);
            SubLObject addressee_list = NIL;
            for (addressee_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , addressee_list = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_2 = addressee_list;
                    SubLObject to = NIL;
                    for (to = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , to = cdolist_list_var_2.first()) {
                        format(bistream, $str_alt25$RCPT_TO____A_, to);
                        string_utilities.network_terpri(bistream);
                        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
                    }
                }
            }
        }
        format(bistream, $$$DATA);
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
        format(bistream, $str_alt27$Date___A, com.cyc.cycjava.cycl.mail_utilities.rfc_822_date_string(UNPROVIDED));
        string_utilities.network_terpri(bistream);
        format(bistream, $str_alt28$From___A, from);
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.output_addressee_list(to_list, $str_alt29$To__, bistream);
        com.cyc.cycjava.cycl.mail_utilities.output_addressee_list(cc_list, $str_alt30$Cc__, bistream);
        com.cyc.cycjava.cycl.mail_utilities.output_addressee_list(bcc_list, $str_alt31$Bcc__, bistream);
        return NIL;
    }

    public static SubLObject sending_mail_via_smtp_preamble(final SubLObject bistream, final SubLObject from, SubLObject to_list, SubLObject cc_list, SubLObject bcc_list) {
        if (cc_list == UNPROVIDED) {
            cc_list = NIL;
        }
        if (bcc_list == UNPROVIDED) {
            bcc_list = NIL;
        }
        assert NIL != stringp(from) : "! stringp(from) " + ("Types.stringp(from) " + "CommonSymbols.NIL != Types.stringp(from) ") + from;
        to_list = check_or_clean_addressee_list(to_list);
        cc_list = check_or_clean_addressee_list(cc_list);
        bcc_list = check_or_clean_addressee_list(bcc_list);
        format(bistream, $str23$HELO__A, Environment.machine_instance());
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        format(bistream, $str24$MAIL_FROM____A_, from);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        SubLObject cdolist_list_var = list(to_list, cc_list, bcc_list);
        SubLObject addressee_list = NIL;
        addressee_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = addressee_list;
            SubLObject to = NIL;
            to = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                format(bistream, $str25$RCPT_TO____A_, to);
                string_utilities.network_terpri(bistream);
                smtp_force_and_verify_success(bistream);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                to = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            addressee_list = cdolist_list_var.first();
        } 
        format(bistream, $$$DATA);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        format(bistream, $str27$Date___A, rfc_822_date_string(UNPROVIDED));
        string_utilities.network_terpri(bistream);
        format(bistream, $str28$From___A, from);
        string_utilities.network_terpri(bistream);
        output_addressee_list(to_list, $str29$To__, bistream);
        output_addressee_list(cc_list, $str30$Cc__, bistream);
        output_addressee_list(bcc_list, $str31$Bcc__, bistream);
        return NIL;
    }

    public static final SubLObject check_or_clean_addressee_list_alt(SubLObject to_list) {
        if (to_list.isString()) {
            to_list = string_utilities.string_tokenize(to_list, $list_alt32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            SubLTrampolineFile.checkType(to_list, LISTP);
            {
                SubLObject cdolist_list_var = to_list;
                SubLObject to = NIL;
                for (to = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , to = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(to, STRINGP);
                }
            }
        }
        return to_list;
    }

    public static SubLObject check_or_clean_addressee_list(SubLObject to_list) {
        if (to_list.isString()) {
            to_list = string_utilities.string_tokenize(to_list, $list32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            assert NIL != listp(to_list) : "! listp(to_list) " + ("Types.listp(to_list) " + "CommonSymbols.NIL != Types.listp(to_list) ") + to_list;
            SubLObject cdolist_list_var = to_list;
            SubLObject to = NIL;
            to = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != stringp(to) : "! stringp(to) " + ("Types.stringp(to) " + "CommonSymbols.NIL != Types.stringp(to) ") + to;
                cdolist_list_var = cdolist_list_var.rest();
                to = cdolist_list_var.first();
            } 
        }
        return to_list;
    }

    public static final SubLObject output_addressee_list_alt(SubLObject addressee_list, SubLObject header_string, SubLObject bistream) {
        if (NIL != list_utilities.non_empty_list_p(addressee_list)) {
            format(bistream, header_string);
            {
                SubLObject cdolist_list_var = addressee_list;
                SubLObject addressee = NIL;
                for (addressee = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , addressee = cdolist_list_var.first()) {
                    if (addressee != addressee_list.first()) {
                        format(bistream, $str_alt34$__);
                    }
                    format(bistream, $str_alt35$_A, addressee);
                }
            }
            string_utilities.network_terpri(bistream);
        }
        return NIL;
    }

    public static SubLObject output_addressee_list(final SubLObject addressee_list, final SubLObject header_string, final SubLObject bistream) {
        if (NIL != list_utilities.non_empty_list_p(addressee_list)) {
            format(bistream, header_string);
            SubLObject cdolist_list_var = addressee_list;
            SubLObject addressee = NIL;
            addressee = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!addressee.eql(addressee_list.first())) {
                    format(bistream, $str34$__);
                }
                format(bistream, $str35$_A, addressee);
                cdolist_list_var = cdolist_list_var.rest();
                addressee = cdolist_list_var.first();
            } 
            string_utilities.network_terpri(bistream);
        }
        return NIL;
    }

    public static final SubLObject sending_mail_via_smtp_body_postamble_alt(SubLObject bistream) {
        string_utilities.network_terpri(bistream);
        format(bistream, $str_alt36$_);
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static SubLObject sending_mail_via_smtp_body_postamble(final SubLObject bistream) {
        string_utilities.network_terpri(bistream);
        format(bistream, $str36$_);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static final SubLObject sending_mail_via_smtp_postamble_alt(SubLObject bistream) {
        format(bistream, $$$QUIT);
        string_utilities.network_terpri(bistream);
        com.cyc.cycjava.cycl.mail_utilities.smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static SubLObject sending_mail_via_smtp_postamble(final SubLObject bistream) {
        format(bistream, $$$QUIT);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static final SubLObject smtp_force_and_verify_success_alt(SubLObject bistream) {
        force_output(bistream);
        sleep($smtp_sleep_length$.getGlobalValue());
        com.cyc.cycjava.cycl.mail_utilities.smtp_verify_success(bistream);
        return NIL;
    }

    public static SubLObject smtp_force_and_verify_success(final SubLObject bistream) {
        force_output(bistream);
        sleep($smtp_sleep_length$.getGlobalValue());
        smtp_verify_success(bistream);
        return NIL;
    }

    public static final SubLObject smtp_verify_success_alt(SubLObject bistream) {
        {
            SubLObject line = string_utilities.network_read_line(bistream, UNPROVIDED, UNPROVIDED);
            if (NIL == com.cyc.cycjava.cycl.mail_utilities.smtp_success(line)) {
                Errors.error(format(NIL, $str_alt39$SMTP_error___A, line));
            }
        }
        return NIL;
    }

    public static SubLObject smtp_verify_success(final SubLObject bistream) {
        final SubLObject line = string_utilities.network_read_line(bistream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == smtp_success(line)) {
            Errors.error(format(NIL, $str39$SMTP_error___A, line));
        }
        return NIL;
    }

    public static final SubLObject smtp_success_alt(SubLObject response) {
        if (response.isString() && length(response).numG(ZERO_INTEGER)) {
            {
                SubLObject first_char = Strings.sublisp_char(response, ZERO_INTEGER);
                return makeBoolean((NIL != charE(first_char, CHAR_2)) || (NIL != charE(first_char, CHAR_3)));
            }
        }
        return NIL;
    }

    public static SubLObject smtp_success(final SubLObject response) {
        if (response.isString() && length(response).numG(ZERO_INTEGER)) {
            final SubLObject first_char = Strings.sublisp_char(response, ZERO_INTEGER);
            return makeBoolean((NIL != charE(first_char, CHAR_2)) || (NIL != charE(first_char, CHAR_3)));
        }
        return NIL;
    }

    /**
     * A macro version of MAIL-MESSAGE allowing the caller to specify values for any or all of the optional arguments.
     */
    @LispMethod(comment = "A macro version of MAIL-MESSAGE allowing the caller to specify values for any or all of the optional arguments.")
    public static final SubLObject mail_message_flexible_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject from = NIL;
            SubLObject to = NIL;
            SubLObject message = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            from = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt40);
            to = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt40);
            message = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_3 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt40);
                    current_3 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt40);
                    if (NIL == member(current_3, $list_alt41, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_3 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt40);
                }
                {
                    SubLObject subject_tail = property_list_member($SUBJECT, current);
                    SubLObject subject = (NIL != subject_tail) ? ((SubLObject) (cadr(subject_tail))) : NIL;
                    SubLObject host_tail = property_list_member($HOST, current);
                    SubLObject host = (NIL != host_tail) ? ((SubLObject) (cadr(host_tail))) : $$$localhost;
                    SubLObject additional_headers_tail = property_list_member($ADDITIONAL_HEADERS, current);
                    SubLObject additional_headers = (NIL != additional_headers_tail) ? ((SubLObject) (cadr(additional_headers_tail))) : NIL;
                    SubLObject port_tail = property_list_member($PORT, current);
                    SubLObject port = (NIL != port_tail) ? ((SubLObject) (cadr(port_tail))) : $smtp_port$.getGlobalValue();
                    SubLObject timeout_tail = property_list_member($TIMEOUT, current);
                    SubLObject timeout = (NIL != timeout_tail) ? ((SubLObject) (cadr(timeout_tail))) : TEN_INTEGER;
                    SubLObject cc_tail = property_list_member($CC, current);
                    SubLObject cc = (NIL != cc_tail) ? ((SubLObject) (cadr(cc_tail))) : NIL;
                    SubLObject bcc_tail = property_list_member($BCC, current);
                    SubLObject bcc = (NIL != bcc_tail) ? ((SubLObject) (cadr(bcc_tail))) : NIL;
                    return list(new SubLObject[]{ MAIL_MESSAGE, from, to, message, subject, host, additional_headers, port, timeout, cc, bcc });
                }
            }
        }
    }

    /**
     * A macro version of MAIL-MESSAGE allowing the caller to specify values for any or all of the optional arguments.
     */
    @LispMethod(comment = "A macro version of MAIL-MESSAGE allowing the caller to specify values for any or all of the optional arguments.")
    public static SubLObject mail_message_flexible(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject from = NIL;
        SubLObject to = NIL;
        SubLObject message = NIL;
        destructuring_bind_must_consp(current, datum, $list40);
        from = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list40);
        to = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list40);
        message = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list40);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list40);
            if (NIL == member(current_$3, $list41, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list40);
        }
        final SubLObject subject_tail = property_list_member($SUBJECT, current);
        final SubLObject subject = (NIL != subject_tail) ? cadr(subject_tail) : NIL;
        final SubLObject host_tail = property_list_member($HOST, current);
        final SubLObject host = (NIL != host_tail) ? cadr(host_tail) : $$$localhost;
        final SubLObject additional_headers_tail = property_list_member($ADDITIONAL_HEADERS, current);
        final SubLObject additional_headers = (NIL != additional_headers_tail) ? cadr(additional_headers_tail) : NIL;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $smtp_port$.getGlobalValue();
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : TEN_INTEGER;
        final SubLObject cc_tail = property_list_member($CC, current);
        final SubLObject cc = (NIL != cc_tail) ? cadr(cc_tail) : NIL;
        final SubLObject bcc_tail = property_list_member($BCC, current);
        final SubLObject bcc = (NIL != bcc_tail) ? cadr(bcc_tail) : NIL;
        return list(new SubLObject[]{ MAIL_MESSAGE, from, to, message, subject, host, additional_headers, port, timeout, cc, bcc });
    }

    /**
     * Mail message using WITH-SMTP-CONNECTION.
     *
     * @param TO,
     * 		CC, BCC: Either lists of email address strings, or else comma-delimited strings listing email addresses,
     * 		e.g. '("joe@blow.com" "flo@blow.com")  or "joe@blow.com, flo@blow.com".
     * @return 0 T iff the message was successfully sent.
     * @return 1 NIL or STRINGP - error message.
     */
    @LispMethod(comment = "Mail message using WITH-SMTP-CONNECTION.\r\n\r\n@param TO,\r\n\t\tCC, BCC: Either lists of email address strings, or else comma-delimited strings listing email addresses,\r\n\t\te.g. \'(\"joe@blow.com\" \"flo@blow.com\")  or \"joe@blow.com, flo@blow.com\".\r\n@return 0 T iff the message was successfully sent.\r\n@return 1 NIL or STRINGP - error message.")
    public static final SubLObject mail_message_alt(SubLObject from, SubLObject to, SubLObject message, SubLObject subject, SubLObject host, SubLObject additional_headers, SubLObject port, SubLObject timeout, SubLObject cc, SubLObject bcc) {
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (host == UNPROVIDED) {
            host = $$$localhost;
        }
        if (additional_headers == UNPROVIDED) {
            additional_headers = NIL;
        }
        if (port == UNPROVIDED) {
            port = $smtp_port$.getGlobalValue();
        }
        if (timeout == UNPROVIDED) {
            timeout = TEN_INTEGER;
        }
        if (cc == UNPROVIDED) {
            cc = NIL;
        }
        if (bcc == UNPROVIDED) {
            bcc = NIL;
        }
        {
            SubLObject message_sent = NIL;
            SubLObject error_message = NIL;
            SubLObject catch_errorsP = T;
            if (NIL != catch_errorsP) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                {
                                    SubLObject bistream = NIL;
                                    try {
                                        bistream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
                                        if (NIL != bistream) {
                                            try {
                                                com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_preamble(bistream, from, to, cc, bcc);
                                                try {
                                                    if (NIL != subject) {
                                                        format(bistream, $str_alt47$Subject___A, subject);
                                                        string_utilities.network_terpri(bistream);
                                                    }
                                                    if (NIL != additional_headers) {
                                                        format(bistream, $str_alt35$_A, additional_headers);
                                                        string_utilities.network_terpri(bistream);
                                                    }
                                                    if (message.isString()) {
                                                        string_utilities.network_terpri(bistream);
                                                        format(bistream, $str_alt35$_A, message);
                                                    } else {
                                                        if (NIL != list_utilities.list_of_type_p(MESSAGE_PART_P, message)) {
                                                            mail_message.send_message_parts(message, bistream);
                                                        } else {
                                                            Errors.error($str_alt49$Message_must_be_a_string_or_a_lis, message);
                                                        }
                                                    }
                                                    message_sent = T;
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_4 = currentBinding($is_thread_performing_cleanupP$);
                                                        try {
                                                            bind($is_thread_performing_cleanupP$, T);
                                                            com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_body_postamble(bistream);
                                                        } finally {
                                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_4);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_5 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_postamble(bistream);
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0_5);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != bistream) {
                                                    close(bistream, UNPROVIDED);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_6);
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
            } else {
                {
                    SubLObject bistream = NIL;
                    try {
                        bistream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
                        if (NIL != bistream) {
                            try {
                                com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_preamble(bistream, from, to, cc, bcc);
                                try {
                                    if (NIL != subject) {
                                        format(bistream, $str_alt47$Subject___A, subject);
                                        string_utilities.network_terpri(bistream);
                                    }
                                    if (NIL != additional_headers) {
                                        format(bistream, $str_alt35$_A, additional_headers);
                                        string_utilities.network_terpri(bistream);
                                    }
                                    if (message.isString()) {
                                        string_utilities.network_terpri(bistream);
                                        format(bistream, $str_alt35$_A, message);
                                    } else {
                                        if (NIL != list_utilities.list_of_type_p(MESSAGE_PART_P, message)) {
                                            mail_message.send_message_parts(message, bistream);
                                        } else {
                                            Errors.error($str_alt49$Message_must_be_a_string_or_a_lis, message);
                                        }
                                    }
                                    message_sent = T;
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_body_postamble(bistream);
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        com.cyc.cycjava.cycl.mail_utilities.sending_mail_via_smtp_postamble(bistream);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (NIL != bistream) {
                                    close(bistream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            if (error_message.isString()) {
                com.cyc.cycjava.cycl.mail_utilities.possibly_log_failed_email_message(from, to, message, subject, host, port, error_message);
            } else {
                if (NIL == message_sent) {
                    error_message = format(NIL, $str_alt50$SMTP_connection_apparently_timed_, timeout);
                }
            }
            return values(message_sent, error_message);
        }
    }

    /**
     * Mail message using WITH-SMTP-CONNECTION.
     *
     * @param TO,
     * 		CC, BCC: Either lists of email address strings, or else comma-delimited strings listing email addresses,
     * 		e.g. '("joe@blow.com" "flo@blow.com")  or "joe@blow.com, flo@blow.com".
     * @return 0 T iff the message was successfully sent.
     * @return 1 NIL or STRINGP - error message.
     */
    @LispMethod(comment = "Mail message using WITH-SMTP-CONNECTION.\r\n\r\n@param TO,\r\n\t\tCC, BCC: Either lists of email address strings, or else comma-delimited strings listing email addresses,\r\n\t\te.g. \'(\"joe@blow.com\" \"flo@blow.com\")  or \"joe@blow.com, flo@blow.com\".\r\n@return 0 T iff the message was successfully sent.\r\n@return 1 NIL or STRINGP - error message.")
    public static SubLObject mail_message(final SubLObject from, final SubLObject to, final SubLObject message, SubLObject subject, SubLObject host, SubLObject additional_headers, SubLObject port, SubLObject timeout, SubLObject cc, SubLObject bcc) {
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (host == UNPROVIDED) {
            host = $$$localhost;
        }
        if (additional_headers == UNPROVIDED) {
            additional_headers = NIL;
        }
        if (port == UNPROVIDED) {
            port = $smtp_port$.getGlobalValue();
        }
        if (timeout == UNPROVIDED) {
            timeout = TEN_INTEGER;
        }
        if (cc == UNPROVIDED) {
            cc = NIL;
        }
        if (bcc == UNPROVIDED) {
            bcc = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_sent = NIL;
        SubLObject error_message = NIL;
        final SubLObject catch_errorsP = T;
        if (NIL != catch_errorsP) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject bistream = NIL;
                        try {
                            bistream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
                            if (NIL != validate_tcp_connection(bistream, host, port)) {
                                try {
                                    sending_mail_via_smtp_preamble(bistream, from, to, cc, bcc);
                                    try {
                                        if (NIL != subject) {
                                            format(bistream, $str47$Subject___A, subject);
                                            string_utilities.network_terpri(bistream);
                                        }
                                        if (NIL != additional_headers) {
                                            format(bistream, $str35$_A, additional_headers);
                                            string_utilities.network_terpri(bistream);
                                        }
                                        if (message.isString()) {
                                            string_utilities.network_terpri(bistream);
                                            format(bistream, $str35$_A, message);
                                        } else
                                            if (NIL != list_utilities.list_of_type_p(MESSAGE_PART_P, message)) {
                                                mail_message.send_message_parts(message, bistream);
                                            } else {
                                                Errors.error($str49$Message_must_be_a_string_or_a_lis, message);
                                            }

                                        message_sent = T;
                                    } finally {
                                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            sending_mail_via_smtp_body_postamble(bistream);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        sending_mail_via_smtp_postamble(bistream);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != bistream) {
                                    close(bistream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
        } else {
            SubLObject bistream2 = NIL;
            try {
                bistream2 = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
                if (NIL != validate_tcp_connection(bistream2, host, port)) {
                    try {
                        sending_mail_via_smtp_preamble(bistream2, from, to, cc, bcc);
                        try {
                            if (NIL != subject) {
                                format(bistream2, $str47$Subject___A, subject);
                                string_utilities.network_terpri(bistream2);
                            }
                            if (NIL != additional_headers) {
                                format(bistream2, $str35$_A, additional_headers);
                                string_utilities.network_terpri(bistream2);
                            }
                            if (message.isString()) {
                                string_utilities.network_terpri(bistream2);
                                format(bistream2, $str35$_A, message);
                            } else
                                if (NIL != list_utilities.list_of_type_p(MESSAGE_PART_P, message)) {
                                    mail_message.send_message_parts(message, bistream2);
                                } else {
                                    Errors.error($str49$Message_must_be_a_string_or_a_lis, message);
                                }

                            message_sent = T;
                        } finally {
                            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                sending_mail_via_smtp_body_postamble(bistream2);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values5 = getValuesAsVector();
                            sending_mail_via_smtp_postamble(bistream2);
                            restoreValuesFromVector(_values5);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values6 = getValuesAsVector();
                    if (NIL != bistream2) {
                        close(bistream2, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values6);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        if (error_message.isString()) {
            possibly_log_failed_email_message(from, to, message, subject, host, port, error_message);
        } else
            if (NIL == message_sent) {
                error_message = format(NIL, $str50$SMTP_connection_apparently_timed_, timeout);
            }

        return values(message_sent, error_message);
    }

    /**
     * Try to log the failure to send an email message. If successful, the entry will be
     * logged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.
     * If unsuccessful, :NOT-LOGGED will be returned.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Try to log the failure to send an email message. If successful, the entry will be\r\nlogged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.\r\nIf unsuccessful, :NOT-LOGGED will be returned.\r\n\r\n@unknown baxter\nTry to log the failure to send an email message. If successful, the entry will be\nlogged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.\nIf unsuccessful, :NOT-LOGGED will be returned.")
    public static final SubLObject possibly_log_failed_email_message_alt(SubLObject from, SubLObject to, SubLObject message, SubLObject subject, SubLObject host, SubLObject port, SubLObject error_message) {
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (host == UNPROVIDED) {
            host = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        if (error_message == UNPROVIDED) {
            error_message = NIL;
        }
        {
            SubLObject result = $NOT_LOGGED;
            if ($failed_email_log_file$.getGlobalValue().isString()) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text($failed_email_log_file$.getGlobalValue(), $APPEND, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt53$Unable_to_open__S, $failed_email_log_file$.getGlobalValue());
                        }
                        {
                            SubLObject stream_7 = stream;
                            if (stream_7.isStream()) {
                                com.cyc.cycjava.cycl.mail_utilities.format_failed_email_message(stream_7, from, to, message, subject, host, port, error_message);
                                result = $LOGGED;
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
            return result;
        }
    }

    /**
     * Try to log the failure to send an email message. If successful, the entry will be
     * logged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.
     * If unsuccessful, :NOT-LOGGED will be returned.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Try to log the failure to send an email message. If successful, the entry will be\r\nlogged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.\r\nIf unsuccessful, :NOT-LOGGED will be returned.\r\n\r\n@unknown baxter\nTry to log the failure to send an email message. If successful, the entry will be\nlogged in *FAILED-EMAIL-LOG-FILE* and :LOGGED will be returned.\nIf unsuccessful, :NOT-LOGGED will be returned.")
    public static SubLObject possibly_log_failed_email_message(final SubLObject from, final SubLObject to, final SubLObject message, SubLObject subject, SubLObject host, SubLObject port, SubLObject error_message) {
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (host == UNPROVIDED) {
            host = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        if (error_message == UNPROVIDED) {
            error_message = NIL;
        }
        SubLObject result = $NOT_LOGGED;
        if ($failed_email_log_file$.getGlobalValue().isString()) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text($failed_email_log_file$.getGlobalValue(), $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str53$Unable_to_open__S, $failed_email_log_file$.getGlobalValue());
                }
                final SubLObject stream_$7 = stream;
                if (stream_$7.isStream()) {
                    format_failed_email_message(stream_$7, from, to, message, subject, host, port, error_message);
                    result = $LOGGED;
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
        return result;
    }

    public static final SubLObject format_failed_email_message_alt(SubLObject stream, SubLObject from, SubLObject to, SubLObject message, SubLObject subject, SubLObject host, SubLObject port, SubLObject error_message) {
        format(stream, $str_alt55$__The_following_message_with_host, new SubLObject[]{ host, port, error_message });
        format(stream, $str_alt56$Date___A__, com.cyc.cycjava.cycl.mail_utilities.rfc_822_date_string(UNPROVIDED));
        if (NIL != from) {
            format(stream, $str_alt57$From___A__, from);
        }
        if (NIL != to) {
            format(stream, $str_alt58$To___A__, to);
        }
        if (NIL != subject) {
            format(stream, $str_alt59$Subject___A__, subject);
        }
        terpri(stream);
        if (message.isString()) {
            princ(message, stream);
        } else {
            princ($str_alt60$__no_message__, stream);
        }
        terpri(stream);
        terpri(stream);
        return $LOGGED;
    }

    public static SubLObject format_failed_email_message(final SubLObject stream, final SubLObject from, final SubLObject to, final SubLObject message, final SubLObject subject, final SubLObject host, final SubLObject port, final SubLObject error_message) {
        format(stream, $str55$__The_following_message_with_host, new SubLObject[]{ host, port, error_message });
        format(stream, $str56$Date___A__, rfc_822_date_string(UNPROVIDED));
        if (NIL != from) {
            format(stream, $str57$From___A__, from);
        }
        if (NIL != to) {
            format(stream, $str58$To___A__, to);
        }
        if (NIL != subject) {
            format(stream, $str59$Subject___A__, subject);
        }
        terpri(stream);
        if (message.isString()) {
            princ(message, stream);
        } else {
            princ($str60$__no_message__, stream);
        }
        terpri(stream);
        terpri(stream);
        return $LOGGED;
    }

    /**
     * send a message either to the emacs mini-buffer (if in allegro)
     * or to standard-output
     *
     * @unknown daves
     */
    @LispMethod(comment = "send a message either to the emacs mini-buffer (if in allegro)\r\nor to standard-output\r\n\r\n@unknown daves\nsend a message either to the emacs mini-buffer (if in allegro)\nor to standard-output")
    public static final SubLObject emacs_message_alt(SubLObject msg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt61$___A__, msg);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            return msg;
        }
    }

    /**
     * send a message either to the emacs mini-buffer (if in allegro)
     * or to standard-output
     *
     * @unknown daves
     */
    @LispMethod(comment = "send a message either to the emacs mini-buffer (if in allegro)\r\nor to standard-output\r\n\r\n@unknown daves\nsend a message either to the emacs mini-buffer (if in allegro)\nor to standard-output")
    public static SubLObject emacs_message(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str61$___A__, msg);
        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        return msg;
    }

    /**
     *
     *
     * @return stringp ; the domain name of the machine running cyc.
     */
    @LispMethod(comment = "@return stringp ; the domain name of the machine running cyc.")
    public static final SubLObject get_tcp_domain_name_alt() {
        return $cycorp_domain_name_string$.getGlobalValue();
    }

    /**
     *
     *
     * @return stringp ; the domain name of the machine running cyc.
     */
    @LispMethod(comment = "@return stringp ; the domain name of the machine running cyc.")
    public static SubLObject get_tcp_domain_name() {
        final SubLObject full_machine_name = Environment.get_machine_name(UNPROVIDED);
        SubLObject domain_name = $str62$;
        final SubLObject dot_pos = string_utilities.char_position(CHAR_period, full_machine_name, UNPROVIDED);
        if (NIL != dot_pos) {
            domain_name = subseq(domain_name, number_utilities.f_1X(dot_pos), UNPROVIDED);
        }
        if ((NIL == string_utilities.non_empty_stringP(domain_name)) && (NIL != Processes.external_processes_supportedP())) {
            domain_name = list_utilities.last_one(os_process_utilities.os_process_evaluation_output_strings($$$domainname, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL == string_utilities.non_empty_stringP(domain_name)) {
                domain_name = list_utilities.last_one(os_process_utilities.os_process_evaluation_output_strings($$$domainname, $list64, UNPROVIDED, UNPROVIDED));
            }
        }
        return domain_name;
    }

    /**
     *
     *
     * @return stringp ; the email address of the current user, or of USER-NAME, if provided.
     */
    @LispMethod(comment = "@return stringp ; the email address of the current user, or of USER-NAME, if provided.")
    public static final SubLObject user_email_alt(SubLObject user_name) {
        if (user_name == UNPROVIDED) {
            user_name = NIL;
        }
        {
            SubLObject user_id = (user_name.isString()) ? ((SubLObject) (user_name)) : Environment.get_user_name(UNPROVIDED);
            SubLObject domain_name = com.cyc.cycjava.cycl.mail_utilities.get_tcp_domain_name();
            if (NIL != string_utilities.non_empty_stringP(domain_name)) {
                return cconcatenate(user_id, new SubLObject[]{ $str_alt66$_, domain_name });
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return stringp ; the email address of the current user, or of USER-NAME, if provided.
     */
    @LispMethod(comment = "@return stringp ; the email address of the current user, or of USER-NAME, if provided.")
    public static SubLObject user_email(SubLObject user_name) {
        if (user_name == UNPROVIDED) {
            user_name = NIL;
        }
        final SubLObject user_id = (user_name.isString()) ? user_name : Environment.get_user_name(UNPROVIDED);
        final SubLObject domain_name = get_tcp_domain_name();
        if (NIL != string_utilities.non_empty_stringP(domain_name)) {
            return cconcatenate(user_id, new SubLObject[]{ $str65$_, domain_name });
        }
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
    preferred by RFC 822.
     * @return NIL
     */
    @LispMethod(comment = "@param stream\r\n\t\tOutput stream\r\n@param universal-time\r\n\t\tUniversal time\r\n@unknown Writes UNIVERSAL-TIME to STREAM, using the standard format\r\npreferred by RFC 822.\r\n@return NIL")
    public static final SubLObject write_rfc_822_date_alt(SubLObject stream, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject date = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                SubLObject day = thread.seventhMultipleValue();
                SubLObject dst = thread.eighthMultipleValue();
                SubLObject tz = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
                thread.resetMultipleValues();
                {
                    SubLObject adjusted_tz = (NIL != dst) ? ((SubLObject) (subtract(ONE_INTEGER, tz))) : minus(tz);
                    write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt34$__, stream, UNPROVIDED, UNPROVIDED);
                    write_string(princ_to_string(date), stream, UNPROVIDED, UNPROVIDED);
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
                    write_char(CHAR_space, stream);
                    if (adjusted_tz.numL(ZERO_INTEGER)) {
                        write_char(CHAR_hyphen, stream);
                        print_2_digit_nonnegative_integer(minus(adjusted_tz), stream);
                    } else {
                        print_2_digit_nonnegative_integer(adjusted_tz, stream);
                    }
                    print_2_digit_nonnegative_integer(ZERO_INTEGER, stream);
                }
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
    preferred by RFC 822.
     * @return NIL
     */
    @LispMethod(comment = "@param stream\r\n\t\tOutput stream\r\n@param universal-time\r\n\t\tUniversal time\r\n@unknown Writes UNIVERSAL-TIME to STREAM, using the standard format\r\npreferred by RFC 822.\r\n@return NIL")
    public static SubLObject write_rfc_822_date(final SubLObject stream, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day = thread.seventhMultipleValue();
        final SubLObject dst = thread.eighthMultipleValue();
        final SubLObject tz = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
        thread.resetMultipleValues();
        final SubLObject adjusted_tz = (NIL != dst) ? subtract(ONE_INTEGER, tz) : minus(tz);
        write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, UNPROVIDED, UNPROVIDED);
        write_string($str34$__, stream, UNPROVIDED, UNPROVIDED);
        write_string(princ_to_string(date), stream, UNPROVIDED, UNPROVIDED);
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
        write_char(CHAR_space, stream);
        if (adjusted_tz.numL(ZERO_INTEGER)) {
            write_char(CHAR_hyphen, stream);
            print_2_digit_nonnegative_integer(minus(adjusted_tz), stream);
        } else {
            print_2_digit_nonnegative_integer(adjusted_tz, stream);
        }
        print_2_digit_nonnegative_integer(ZERO_INTEGER, stream);
        return NIL;
    }

    /**
     *
     *
     * @param universal-time
     * 		Universal time
     * @return string form of UNIVERSAL-TIME in the standard format
    preferred by RFC 822.
     */
    @LispMethod(comment = "@param universal-time\r\n\t\tUniversal time\r\n@return string form of UNIVERSAL-TIME in the standard format\r\npreferred by RFC 822.")
    public static final SubLObject rfc_822_date_string_alt(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                com.cyc.cycjava.cycl.mail_utilities.write_rfc_822_date(stream, universal_time);
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
    preferred by RFC 822.
     */
    @LispMethod(comment = "@param universal-time\r\n\t\tUniversal time\r\n@return string form of UNIVERSAL-TIME in the standard format\r\npreferred by RFC 822.")
    public static SubLObject rfc_822_date_string(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_rfc_822_date(stream, universal_time);
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

    public static final SubLObject declare_mail_utilities_file_alt() {
        declareMacro("with_smtp_connection", "WITH-SMTP-CONNECTION");
        declareFunction("sending_mail_via_smtp_preamble", "SENDING-MAIL-VIA-SMTP-PREAMBLE", 3, 2, false);
        declareFunction("check_or_clean_addressee_list", "CHECK-OR-CLEAN-ADDRESSEE-LIST", 1, 0, false);
        declareFunction("output_addressee_list", "OUTPUT-ADDRESSEE-LIST", 3, 0, false);
        declareFunction("sending_mail_via_smtp_body_postamble", "SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE", 1, 0, false);
        declareFunction("sending_mail_via_smtp_postamble", "SENDING-MAIL-VIA-SMTP-POSTAMBLE", 1, 0, false);
        declareFunction("smtp_force_and_verify_success", "SMTP-FORCE-AND-VERIFY-SUCCESS", 1, 0, false);
        declareFunction("smtp_verify_success", "SMTP-VERIFY-SUCCESS", 1, 0, false);
        declareFunction("smtp_success", "SMTP-SUCCESS", 1, 0, false);
        declareMacro("mail_message_flexible", "MAIL-MESSAGE-FLEXIBLE");
        declareFunction("mail_message", "MAIL-MESSAGE", 3, 7, false);
        declareFunction("possibly_log_failed_email_message", "POSSIBLY-LOG-FAILED-EMAIL-MESSAGE", 3, 4, false);
        declareFunction("format_failed_email_message", "FORMAT-FAILED-EMAIL-MESSAGE", 8, 0, false);
        declareFunction("emacs_message", "EMACS-MESSAGE", 1, 0, false);
        declareFunction("get_tcp_domain_name", "GET-TCP-DOMAIN-NAME", 0, 0, false);
        declareFunction("user_email", "USER-EMAIL", 0, 1, false);
        declareFunction("write_rfc_822_date", "WRITE-RFC-822-DATE", 1, 1, false);
        declareFunction("rfc_822_date_string", "RFC-822-DATE-STRING", 0, 1, false);
        declareFunction("get_rfc_822_time_string", "GET-RFC-822-TIME-STRING", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_mail_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_smtp_connection", "WITH-SMTP-CONNECTION");
            declareFunction("sending_mail_via_smtp_preamble", "SENDING-MAIL-VIA-SMTP-PREAMBLE", 3, 2, false);
            declareFunction("check_or_clean_addressee_list", "CHECK-OR-CLEAN-ADDRESSEE-LIST", 1, 0, false);
            declareFunction("output_addressee_list", "OUTPUT-ADDRESSEE-LIST", 3, 0, false);
            declareFunction("sending_mail_via_smtp_body_postamble", "SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE", 1, 0, false);
            declareFunction("sending_mail_via_smtp_postamble", "SENDING-MAIL-VIA-SMTP-POSTAMBLE", 1, 0, false);
            declareFunction("smtp_force_and_verify_success", "SMTP-FORCE-AND-VERIFY-SUCCESS", 1, 0, false);
            declareFunction("smtp_verify_success", "SMTP-VERIFY-SUCCESS", 1, 0, false);
            declareFunction("smtp_success", "SMTP-SUCCESS", 1, 0, false);
            declareMacro("mail_message_flexible", "MAIL-MESSAGE-FLEXIBLE");
            declareFunction("mail_message", "MAIL-MESSAGE", 3, 7, false);
            declareFunction("possibly_log_failed_email_message", "POSSIBLY-LOG-FAILED-EMAIL-MESSAGE", 3, 4, false);
            declareFunction("format_failed_email_message", "FORMAT-FAILED-EMAIL-MESSAGE", 8, 0, false);
            declareFunction("emacs_message", "EMACS-MESSAGE", 1, 0, false);
            declareFunction("get_tcp_domain_name", "GET-TCP-DOMAIN-NAME", 0, 0, false);
            declareFunction("user_email", "USER-EMAIL", 0, 1, false);
            declareFunction("write_rfc_822_date", "WRITE-RFC-822-DATE", 1, 1, false);
            declareFunction("rfc_822_date_string", "RFC-822-DATE-STRING", 0, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_rfc_822_time_string", "GET-RFC-822-TIME-STRING", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_mail_utilities_file_Previous() {
        declareMacro("with_smtp_connection", "WITH-SMTP-CONNECTION");
        declareFunction("sending_mail_via_smtp_preamble", "SENDING-MAIL-VIA-SMTP-PREAMBLE", 3, 2, false);
        declareFunction("check_or_clean_addressee_list", "CHECK-OR-CLEAN-ADDRESSEE-LIST", 1, 0, false);
        declareFunction("output_addressee_list", "OUTPUT-ADDRESSEE-LIST", 3, 0, false);
        declareFunction("sending_mail_via_smtp_body_postamble", "SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE", 1, 0, false);
        declareFunction("sending_mail_via_smtp_postamble", "SENDING-MAIL-VIA-SMTP-POSTAMBLE", 1, 0, false);
        declareFunction("smtp_force_and_verify_success", "SMTP-FORCE-AND-VERIFY-SUCCESS", 1, 0, false);
        declareFunction("smtp_verify_success", "SMTP-VERIFY-SUCCESS", 1, 0, false);
        declareFunction("smtp_success", "SMTP-SUCCESS", 1, 0, false);
        declareMacro("mail_message_flexible", "MAIL-MESSAGE-FLEXIBLE");
        declareFunction("mail_message", "MAIL-MESSAGE", 3, 7, false);
        declareFunction("possibly_log_failed_email_message", "POSSIBLY-LOG-FAILED-EMAIL-MESSAGE", 3, 4, false);
        declareFunction("format_failed_email_message", "FORMAT-FAILED-EMAIL-MESSAGE", 8, 0, false);
        declareFunction("emacs_message", "EMACS-MESSAGE", 1, 0, false);
        declareFunction("get_tcp_domain_name", "GET-TCP-DOMAIN-NAME", 0, 0, false);
        declareFunction("user_email", "USER-EMAIL", 0, 1, false);
        declareFunction("write_rfc_822_date", "WRITE-RFC-822-DATE", 1, 1, false);
        declareFunction("rfc_822_date_string", "RFC-822-DATE-STRING", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_mail_utilities_file_alt() {
        deflexical("*SMTP-PORT*", $int$25);
        deflexical("*SMTP-HOST-CYCORP*", $str_alt1$mail_cyc_com);
        deflexical("*SMTP-SLEEP-LENGTH*", $float$0_001);
        deflexical("*FAILED-EMAIL-LOG-FILE*", NIL);
        deflexical("*CYCORP-DOMAIN-NAME-STRING*", $str_alt62$cyc_com);
        return NIL;
    }

    public static SubLObject init_mail_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SMTP-PORT*", $int$25);
            deflexical("*SMTP-HOST-CYCORP*", $str1$smtp_unknown_com);
            deflexical("*SMTP-SLEEP-LENGTH*", $float$0_005);
            deflexical("*FAILED-EMAIL-LOG-FILE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SMTP-HOST-CYCORP*", $str_alt1$mail_cyc_com);
            deflexical("*SMTP-SLEEP-LENGTH*", $float$0_001);
            deflexical("*CYCORP-DOMAIN-NAME-STRING*", $str_alt62$cyc_com);
        }
        return NIL;
    }

    public static SubLObject init_mail_utilities_file_Previous() {
        deflexical("*SMTP-PORT*", $int$25);
        deflexical("*SMTP-HOST-CYCORP*", $str1$smtp_unknown_com);
        deflexical("*SMTP-SLEEP-LENGTH*", $float$0_005);
        deflexical("*FAILED-EMAIL-LOG-FILE*", NIL);
        return NIL;
    }

    public static SubLObject setup_mail_utilities_file() {
        register_macro_helper(SENDING_MAIL_VIA_SMTP_PREAMBLE, WITH_SMTP_CONNECTION);
        register_macro_helper(SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE, WITH_SMTP_CONNECTION);
        register_macro_helper(SENDING_MAIL_VIA_SMTP_POSTAMBLE, WITH_SMTP_CONNECTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mail_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_mail_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mail_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt1$mail_cyc_com = makeString("mail.cyc.com");

    static private final SubLList $list_alt2 = list(list(new SubLObject[]{ makeSymbol("BISTREAM"), makeSymbol("&KEY"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), list(makeSymbol("HOST"), makeString("localhost")), list(makeSymbol("PORT"), list(QUOTE, makeSymbol("*SMTP-PORT*"))), makeSymbol("TIMEOUT") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list($FROM, makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), $HOST, $PORT, makeKeyword("TIMEOUT"));

    static private final SubLList $list_alt15 = list(makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));

    static private final SubLString $str_alt23$HELO__A = makeString("HELO ~A");

    static private final SubLString $str_alt24$MAIL_FROM____A_ = makeString("MAIL FROM: <~A>");

    static private final SubLString $str_alt25$RCPT_TO____A_ = makeString("RCPT TO: <~A>");

    static private final SubLString $str_alt27$Date___A = makeString("Date: ~A");

    static private final SubLString $str_alt28$From___A = makeString("From: ~A");

    static private final SubLString $str_alt29$To__ = makeString("To: ");

    static private final SubLString $str_alt30$Cc__ = makeString("Cc: ");

    static private final SubLString $str_alt31$Bcc__ = makeString("Bcc: ");

    static private final SubLList $list_alt32 = list(makeString(", "), makeString(","));

    static private final SubLString $str_alt34$__ = makeString(", ");

    static private final SubLString $str_alt35$_A = makeString("~A");

    static private final SubLString $str_alt36$_ = makeString(".");

    public static final SubLFloat $float$0_001 = makeDouble(0.001);

    static private final SubLString $str_alt39$SMTP_error___A = makeString("SMTP error: ~A");

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("MESSAGE"), makeSymbol("&KEY"), makeSymbol("SUBJECT"), list(makeSymbol("HOST"), makeString("localhost")), makeSymbol("ADDITIONAL-HEADERS"), list(makeSymbol("PORT"), makeSymbol("*SMTP-PORT*")), list(makeSymbol("TIMEOUT"), TEN_INTEGER), makeSymbol("CC"), makeSymbol("BCC") });

    static private final SubLList $list_alt41 = list(makeKeyword("SUBJECT"), $HOST, makeKeyword("ADDITIONAL-HEADERS"), $PORT, makeKeyword("TIMEOUT"), makeKeyword("CC"), makeKeyword("BCC"));

    static private final SubLString $str_alt47$Subject___A = makeString("Subject: ~A");

    static private final SubLString $str_alt49$Message_must_be_a_string_or_a_lis = makeString("Message must be a string or a list of message parts, not ~S");

    static private final SubLString $str_alt50$SMTP_connection_apparently_timed_ = makeString("SMTP connection apparently timed out after ~S seconds.");

    static private final SubLString $str_alt53$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt55$__The_following_message_with_host = makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");

    static private final SubLString $str_alt56$Date___A__ = makeString("Date: ~A~%");

    static private final SubLString $str_alt57$From___A__ = makeString("From: ~A~%");

    static private final SubLString $str_alt58$To___A__ = makeString("To: ~A~%");

    static private final SubLString $str_alt59$Subject___A__ = makeString("Subject: ~A~%");

    static private final SubLString $str_alt60$__no_message__ = makeString("--no message--");

    static private final SubLString $str_alt61$___A__ = makeString("~&~A~&");

    static private final SubLString $str_alt62$cyc_com = makeString("cyc.com");

    static private final SubLList $list_alt65 = list(makeString("-d"));

    static private final SubLString $str_alt66$_ = makeString("@");

    static private final SubLString $str_alt67$_tmp_get_rfc_822_time_string_ = makeString("/tmp/get-rfc-822-time-string-");

    public static final SubLInteger $int$10000 = makeInteger(10000);

    static private final SubLString $$$Getting_RFC822_Date = makeString("Getting RFC822 Date");

    static private final SubLString $$$date = makeString("date");

    static private final SubLList $list_alt72 = list(makeString("--rfc-822"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLString $str_alt77$Getting_RFC822_date_failed___A_ = makeString("Getting RFC822 date failed (~A)");
}

/**
 * Total time: 389 ms
 */
