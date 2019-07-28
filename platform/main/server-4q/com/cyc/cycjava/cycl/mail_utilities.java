package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.mail_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_3;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class mail_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new mail_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.mail_utilities";

    public static final String myFingerPrint = "f478b368cf8f06e47ce17094e074ff370ef4f7a93684bcc2193e0ee735dcf07c";



    // deflexical
    // The Cycorp SMTP host name.
    public static final SubLSymbol $smtp_host_cycorp$ = makeSymbol("*SMTP-HOST-CYCORP*");

    // deflexical
    /**
     * Sleep this long while waiting for SMTP server to process each command. Value
     * chosen is implementation specific, based on trial and error.
     */
    private static final SubLSymbol $smtp_sleep_length$ = makeSymbol("*SMTP-SLEEP-LENGTH*");

    // deflexical
    // NIL or path of file to which to write failed email messages
    private static final SubLSymbol $failed_email_log_file$ = makeSymbol("*FAILED-EMAIL-LOG-FILE*");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $str1$smtp_unknown_com = makeString("smtp.unknown.com");

    public static final SubLList $list2 = list(list(new SubLObject[]{ makeSymbol("BISTREAM"), makeSymbol("&KEY"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), list(makeSymbol("HOST"), makeString("localhost")), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SMTP-PORT*"))), makeSymbol("TIMEOUT") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list3 = list(makeKeyword("FROM"), makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), makeKeyword("HOST"), makeKeyword("PORT"), makeKeyword("TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    public static final SubLString $$$localhost = makeString("localhost");



    public static final SubLSymbol $smtp_port$ = makeSymbol("*SMTP-PORT*");





    public static final SubLList $list15 = list(makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));





    public static final SubLSymbol SENDING_MAIL_VIA_SMTP_PREAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-PREAMBLE");

    public static final SubLSymbol SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE");

    public static final SubLSymbol SENDING_MAIL_VIA_SMTP_POSTAMBLE = makeSymbol("SENDING-MAIL-VIA-SMTP-POSTAMBLE");

    public static final SubLSymbol WITH_SMTP_CONNECTION = makeSymbol("WITH-SMTP-CONNECTION");



    public static final SubLString $str23$HELO__A = makeString("HELO ~A");

    public static final SubLString $str24$MAIL_FROM____A_ = makeString("MAIL FROM: <~A>");

    public static final SubLString $str25$RCPT_TO____A_ = makeString("RCPT TO: <~A>");

    public static final SubLString $$$DATA = makeString("DATA");

    public static final SubLString $str27$Date___A = makeString("Date: ~A");

    public static final SubLString $str28$From___A = makeString("From: ~A");

    public static final SubLString $str29$To__ = makeString("To: ");

    public static final SubLString $str30$Cc__ = makeString("Cc: ");

    public static final SubLString $str31$Bcc__ = makeString("Bcc: ");

    public static final SubLList $list32 = list(makeString(", "), makeString(","));



    public static final SubLString $str34$__ = makeString(", ");

    public static final SubLString $str35$_A = makeString("~A");

    public static final SubLString $str36$_ = makeString(".");

    public static final SubLString $$$QUIT = makeString("QUIT");

    private static final SubLFloat $float$0_005 = makeDouble(0.005);

    public static final SubLString $str39$SMTP_error___A = makeString("SMTP error: ~A");

    public static final SubLList $list40 = list(new SubLObject[]{ makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("MESSAGE"), makeSymbol("&KEY"), makeSymbol("SUBJECT"), list(makeSymbol("HOST"), makeString("localhost")), makeSymbol("ADDITIONAL-HEADERS"), list(makeSymbol("PORT"), makeSymbol("*SMTP-PORT*")), list(makeSymbol("TIMEOUT"), TEN_INTEGER), makeSymbol("CC"), makeSymbol("BCC") });

    public static final SubLList $list41 = list(makeKeyword("SUBJECT"), makeKeyword("HOST"), makeKeyword("ADDITIONAL-HEADERS"), makeKeyword("PORT"), makeKeyword("TIMEOUT"), makeKeyword("CC"), makeKeyword("BCC"));





    public static final SubLSymbol MAIL_MESSAGE = makeSymbol("MAIL-MESSAGE");





    public static final SubLString $str47$Subject___A = makeString("Subject: ~A");

    public static final SubLSymbol MESSAGE_PART_P = makeSymbol("MESSAGE-PART-P");

    public static final SubLString $str49$Message_must_be_a_string_or_a_lis = makeString("Message must be a string or a list of message parts, not ~S");

    public static final SubLString $str50$SMTP_connection_apparently_timed_ = makeString("SMTP connection apparently timed out after ~S seconds.");





    public static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");



    public static final SubLString $str55$__The_following_message_with_host = makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");

    public static final SubLString $str56$Date___A__ = makeString("Date: ~A~%");

    public static final SubLString $str57$From___A__ = makeString("From: ~A~%");

    public static final SubLString $str58$To___A__ = makeString("To: ~A~%");

    public static final SubLString $str59$Subject___A__ = makeString("Subject: ~A~%");

    public static final SubLString $str60$__no_message__ = makeString("--no message--");

    public static final SubLString $str61$___A__ = makeString("~&~A~&");

    private static final SubLString $str62$ = makeString("");

    private static final SubLString $$$domainname = makeString("domainname");

    private static final SubLList $list64 = list(makeString("-d"));

    private static final SubLString $str65$_ = makeString("@");

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

    public static SubLObject sending_mail_via_smtp_preamble(final SubLObject bistream, final SubLObject from, SubLObject to_list, SubLObject cc_list, SubLObject bcc_list) {
        if (cc_list == UNPROVIDED) {
            cc_list = NIL;
        }
        if (bcc_list == UNPROVIDED) {
            bcc_list = NIL;
        }
        assert NIL != stringp(from) : "Types.stringp(from) " + "CommonSymbols.NIL != Types.stringp(from) " + from;
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

    public static SubLObject check_or_clean_addressee_list(SubLObject to_list) {
        if (to_list.isString()) {
            to_list = string_utilities.string_tokenize(to_list, $list32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            assert NIL != listp(to_list) : "Types.listp(to_list) " + "CommonSymbols.NIL != Types.listp(to_list) " + to_list;
            SubLObject cdolist_list_var = to_list;
            SubLObject to = NIL;
            to = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != stringp(to) : "Types.stringp(to) " + "CommonSymbols.NIL != Types.stringp(to) " + to;
                cdolist_list_var = cdolist_list_var.rest();
                to = cdolist_list_var.first();
            } 
        }
        return to_list;
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

    public static SubLObject sending_mail_via_smtp_body_postamble(final SubLObject bistream) {
        string_utilities.network_terpri(bistream);
        format(bistream, $str36$_);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static SubLObject sending_mail_via_smtp_postamble(final SubLObject bistream) {
        format(bistream, $$$QUIT);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return NIL;
    }

    public static SubLObject smtp_force_and_verify_success(final SubLObject bistream) {
        force_output(bistream);
        sleep($smtp_sleep_length$.getGlobalValue());
        smtp_verify_success(bistream);
        return NIL;
    }

    public static SubLObject smtp_verify_success(final SubLObject bistream) {
        final SubLObject line = string_utilities.network_read_line(bistream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == smtp_success(line)) {
            Errors.error(format(NIL, $str39$SMTP_error___A, line));
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

    public static SubLObject emacs_message(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str61$___A__, msg);
        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        return msg;
    }

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

    public static SubLObject declare_mail_utilities_file() {
        declareMacro(me, "with_smtp_connection", "WITH-SMTP-CONNECTION");
        declareFunction(me, "sending_mail_via_smtp_preamble", "SENDING-MAIL-VIA-SMTP-PREAMBLE", 3, 2, false);
        declareFunction(me, "check_or_clean_addressee_list", "CHECK-OR-CLEAN-ADDRESSEE-LIST", 1, 0, false);
        declareFunction(me, "output_addressee_list", "OUTPUT-ADDRESSEE-LIST", 3, 0, false);
        declareFunction(me, "sending_mail_via_smtp_body_postamble", "SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE", 1, 0, false);
        declareFunction(me, "sending_mail_via_smtp_postamble", "SENDING-MAIL-VIA-SMTP-POSTAMBLE", 1, 0, false);
        declareFunction(me, "smtp_force_and_verify_success", "SMTP-FORCE-AND-VERIFY-SUCCESS", 1, 0, false);
        declareFunction(me, "smtp_verify_success", "SMTP-VERIFY-SUCCESS", 1, 0, false);
        declareFunction(me, "smtp_success", "SMTP-SUCCESS", 1, 0, false);
        declareMacro(me, "mail_message_flexible", "MAIL-MESSAGE-FLEXIBLE");
        declareFunction(me, "mail_message", "MAIL-MESSAGE", 3, 7, false);
        declareFunction(me, "possibly_log_failed_email_message", "POSSIBLY-LOG-FAILED-EMAIL-MESSAGE", 3, 4, false);
        declareFunction(me, "format_failed_email_message", "FORMAT-FAILED-EMAIL-MESSAGE", 8, 0, false);
        declareFunction(me, "emacs_message", "EMACS-MESSAGE", 1, 0, false);
        declareFunction(me, "get_tcp_domain_name", "GET-TCP-DOMAIN-NAME", 0, 0, false);
        declareFunction(me, "user_email", "USER-EMAIL", 0, 1, false);
        declareFunction(me, "write_rfc_822_date", "WRITE-RFC-822-DATE", 1, 1, false);
        declareFunction(me, "rfc_822_date_string", "RFC-822-DATE-STRING", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_mail_utilities_file() {
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
}

/**
 * Total time: 389 ms
 */
