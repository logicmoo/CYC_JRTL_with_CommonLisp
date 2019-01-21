package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mail_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mail_utilities";
    public static final String myFingerPrint = "f478b368cf8f06e47ce17094e074ff370ef4f7a93684bcc2193e0ee735dcf07c";
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 1348L)
    public static SubLSymbol $smtp_port$;
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 1444L)
    public static SubLSymbol $smtp_host_cycorp$;
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 5360L)
    private static SubLSymbol $smtp_sleep_length$;
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 8246L)
    private static SubLSymbol $failed_email_log_file$;
    private static final SubLInteger $int0$25;
    private static final SubLString $str1$smtp_unknown_com;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw5$FROM;
    private static final SubLSymbol $kw6$TO;
    private static final SubLSymbol $kw7$CC;
    private static final SubLSymbol $kw8$BCC;
    private static final SubLSymbol $kw9$HOST;
    private static final SubLString $str10$localhost;
    private static final SubLSymbol $kw11$PORT;
    private static final SubLSymbol $sym12$_SMTP_PORT_;
    private static final SubLSymbol $kw13$TIMEOUT;
    private static final SubLSymbol $sym14$WITH_TCP_CONNECTION;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CUNWIND_PROTECT;
    private static final SubLSymbol $sym17$PROGN;
    private static final SubLSymbol $sym18$SENDING_MAIL_VIA_SMTP_PREAMBLE;
    private static final SubLSymbol $sym19$SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE;
    private static final SubLSymbol $sym20$SENDING_MAIL_VIA_SMTP_POSTAMBLE;
    private static final SubLSymbol $sym21$WITH_SMTP_CONNECTION;
    private static final SubLSymbol $sym22$STRINGP;
    private static final SubLString $str23$HELO__A;
    private static final SubLString $str24$MAIL_FROM____A_;
    private static final SubLString $str25$RCPT_TO____A_;
    private static final SubLString $str26$DATA;
    private static final SubLString $str27$Date___A;
    private static final SubLString $str28$From___A;
    private static final SubLString $str29$To__;
    private static final SubLString $str30$Cc__;
    private static final SubLString $str31$Bcc__;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$LISTP;
    private static final SubLString $str34$__;
    private static final SubLString $str35$_A;
    private static final SubLString $str36$_;
    private static final SubLString $str37$QUIT;
    private static final SubLFloat $float38$0_005;
    private static final SubLString $str39$SMTP_error___A;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$SUBJECT;
    private static final SubLSymbol $kw43$ADDITIONAL_HEADERS;
    private static final SubLSymbol $sym44$MAIL_MESSAGE;
    private static final SubLSymbol $sym45$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw46$PRIVATE;
    private static final SubLString $str47$Subject___A;
    private static final SubLSymbol $sym48$MESSAGE_PART_P;
    private static final SubLString $str49$Message_must_be_a_string_or_a_lis;
    private static final SubLString $str50$SMTP_connection_apparently_timed_;
    private static final SubLSymbol $kw51$NOT_LOGGED;
    private static final SubLSymbol $kw52$APPEND;
    private static final SubLString $str53$Unable_to_open__S;
    private static final SubLSymbol $kw54$LOGGED;
    private static final SubLString $str55$__The_following_message_with_host;
    private static final SubLString $str56$Date___A__;
    private static final SubLString $str57$From___A__;
    private static final SubLString $str58$To___A__;
    private static final SubLString $str59$Subject___A__;
    private static final SubLString $str60$__no_message__;
    private static final SubLString $str61$___A__;
    private static final SubLString $str62$;
    private static final SubLString $str63$domainname;
    private static final SubLList $list64;
    private static final SubLString $str65$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 2026L)
    public static SubLObject with_smtp_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mail_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bistream = (SubLObject)mail_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mail_utilities.$list2);
        bistream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)mail_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)mail_utilities.NIL;
        SubLObject current_$1 = (SubLObject)mail_utilities.NIL;
        while (mail_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)mail_utilities.$list2);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)mail_utilities.$list2);
            if (mail_utilities.NIL == conses_high.member(current_$1, (SubLObject)mail_utilities.$list3, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED)) {
                bad = (SubLObject)mail_utilities.T;
            }
            if (current_$1 == mail_utilities.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (mail_utilities.NIL != bad && mail_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mail_utilities.$list2);
        }
        final SubLObject from_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw5$FROM, current);
        final SubLObject from = (SubLObject)((mail_utilities.NIL != from_tail) ? conses_high.cadr(from_tail) : mail_utilities.NIL);
        final SubLObject to_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw6$TO, current);
        final SubLObject to = (SubLObject)((mail_utilities.NIL != to_tail) ? conses_high.cadr(to_tail) : mail_utilities.NIL);
        final SubLObject cc_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw7$CC, current);
        final SubLObject cc = (SubLObject)((mail_utilities.NIL != cc_tail) ? conses_high.cadr(cc_tail) : mail_utilities.NIL);
        final SubLObject bcc_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw8$BCC, current);
        final SubLObject bcc = (SubLObject)((mail_utilities.NIL != bcc_tail) ? conses_high.cadr(bcc_tail) : mail_utilities.NIL);
        final SubLObject host_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw9$HOST, current);
        final SubLObject host = (SubLObject)((mail_utilities.NIL != host_tail) ? conses_high.cadr(host_tail) : mail_utilities.$str10$localhost);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw11$PORT, current);
        final SubLObject port = (SubLObject)((mail_utilities.NIL != port_tail) ? conses_high.cadr(port_tail) : mail_utilities.$sym12$_SMTP_PORT_);
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw13$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((mail_utilities.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : mail_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym14$WITH_TCP_CONNECTION, (SubLObject)ConsesLow.listS(bistream, host, port, (SubLObject)mail_utilities.$kw13$TIMEOUT, timeout, (SubLObject)mail_utilities.$list15), (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym16$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym17$PROGN, (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym18$SENDING_MAIL_VIA_SMTP_PREAMBLE, bistream, from, to, cc, bcc), (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym16$CUNWIND_PROTECT, reader.bq_cons((SubLObject)mail_utilities.$sym17$PROGN, ConsesLow.append(body, (SubLObject)mail_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym19$SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE, bistream))), (SubLObject)ConsesLow.list((SubLObject)mail_utilities.$sym20$SENDING_MAIL_VIA_SMTP_POSTAMBLE, bistream)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 2999L)
    public static SubLObject sending_mail_via_smtp_preamble(final SubLObject bistream, final SubLObject from, SubLObject to_list, SubLObject cc_list, SubLObject bcc_list) {
        if (cc_list == mail_utilities.UNPROVIDED) {
            cc_list = (SubLObject)mail_utilities.NIL;
        }
        if (bcc_list == mail_utilities.UNPROVIDED) {
            bcc_list = (SubLObject)mail_utilities.NIL;
        }
        assert mail_utilities.NIL != Types.stringp(from) : from;
        to_list = check_or_clean_addressee_list(to_list);
        cc_list = check_or_clean_addressee_list(cc_list);
        bcc_list = check_or_clean_addressee_list(bcc_list);
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str23$HELO__A, Environment.machine_instance());
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str24$MAIL_FROM____A_, from);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(to_list, cc_list, bcc_list);
        SubLObject addressee_list = (SubLObject)mail_utilities.NIL;
        addressee_list = cdolist_list_var.first();
        while (mail_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = addressee_list;
            SubLObject to = (SubLObject)mail_utilities.NIL;
            to = cdolist_list_var_$2.first();
            while (mail_utilities.NIL != cdolist_list_var_$2) {
                PrintLow.format(bistream, (SubLObject)mail_utilities.$str25$RCPT_TO____A_, to);
                string_utilities.network_terpri(bistream);
                smtp_force_and_verify_success(bistream);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                to = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            addressee_list = cdolist_list_var.first();
        }
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str26$DATA);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str27$Date___A, rfc_822_date_string((SubLObject)mail_utilities.UNPROVIDED));
        string_utilities.network_terpri(bistream);
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str28$From___A, from);
        string_utilities.network_terpri(bistream);
        output_addressee_list(to_list, (SubLObject)mail_utilities.$str29$To__, bistream);
        output_addressee_list(cc_list, (SubLObject)mail_utilities.$str30$Cc__, bistream);
        output_addressee_list(bcc_list, (SubLObject)mail_utilities.$str31$Bcc__, bistream);
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 4296L)
    public static SubLObject check_or_clean_addressee_list(SubLObject to_list) {
        if (to_list.isString()) {
            to_list = string_utilities.string_tokenize(to_list, (SubLObject)mail_utilities.$list32, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        }
        else {
            assert mail_utilities.NIL != Types.listp(to_list) : to_list;
            SubLObject cdolist_list_var = to_list;
            SubLObject to = (SubLObject)mail_utilities.NIL;
            to = cdolist_list_var.first();
            while (mail_utilities.NIL != cdolist_list_var) {
                assert mail_utilities.NIL != Types.stringp(to) : to;
                cdolist_list_var = cdolist_list_var.rest();
                to = cdolist_list_var.first();
            }
        }
        return to_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 4554L)
    public static SubLObject output_addressee_list(final SubLObject addressee_list, final SubLObject header_string, final SubLObject bistream) {
        if (mail_utilities.NIL != list_utilities.non_empty_list_p(addressee_list)) {
            PrintLow.format(bistream, header_string);
            SubLObject cdolist_list_var = addressee_list;
            SubLObject addressee = (SubLObject)mail_utilities.NIL;
            addressee = cdolist_list_var.first();
            while (mail_utilities.NIL != cdolist_list_var) {
                if (!addressee.eql(addressee_list.first())) {
                    PrintLow.format(bistream, (SubLObject)mail_utilities.$str34$__);
                }
                PrintLow.format(bistream, (SubLObject)mail_utilities.$str35$_A, addressee);
                cdolist_list_var = cdolist_list_var.rest();
                addressee = cdolist_list_var.first();
            }
            string_utilities.network_terpri(bistream);
        }
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 4914L)
    public static SubLObject sending_mail_via_smtp_body_postamble(final SubLObject bistream) {
        string_utilities.network_terpri(bistream);
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str36$_);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 5152L)
    public static SubLObject sending_mail_via_smtp_postamble(final SubLObject bistream) {
        PrintLow.format(bistream, (SubLObject)mail_utilities.$str37$QUIT);
        string_utilities.network_terpri(bistream);
        smtp_force_and_verify_success(bistream);
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 5621L)
    public static SubLObject smtp_force_and_verify_success(final SubLObject bistream) {
        streams_high.force_output(bistream);
        Threads.sleep(mail_utilities.$smtp_sleep_length$.getGlobalValue());
        smtp_verify_success(bistream);
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 5781L)
    public static SubLObject smtp_verify_success(final SubLObject bistream) {
        final SubLObject line = string_utilities.network_read_line(bistream, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        if (mail_utilities.NIL == smtp_success(line)) {
            Errors.error(PrintLow.format((SubLObject)mail_utilities.NIL, (SubLObject)mail_utilities.$str39$SMTP_error___A, line));
        }
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 5972L)
    public static SubLObject smtp_success(final SubLObject response) {
        if (response.isString() && Sequences.length(response).numG((SubLObject)mail_utilities.ZERO_INTEGER)) {
            final SubLObject first_char = Strings.sublisp_char(response, (SubLObject)mail_utilities.ZERO_INTEGER);
            return (SubLObject)SubLObjectFactory.makeBoolean(mail_utilities.NIL != Characters.charE(first_char, (SubLObject)Characters.CHAR_2) || mail_utilities.NIL != Characters.charE(first_char, (SubLObject)Characters.CHAR_3));
        }
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 6192L)
    public static SubLObject mail_message_flexible(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject from = (SubLObject)mail_utilities.NIL;
        SubLObject to = (SubLObject)mail_utilities.NIL;
        SubLObject message = (SubLObject)mail_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mail_utilities.$list40);
        from = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mail_utilities.$list40);
        to = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mail_utilities.$list40);
        message = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)mail_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)mail_utilities.NIL;
        SubLObject current_$3 = (SubLObject)mail_utilities.NIL;
        while (mail_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)mail_utilities.$list40);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)mail_utilities.$list40);
            if (mail_utilities.NIL == conses_high.member(current_$3, (SubLObject)mail_utilities.$list41, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED)) {
                bad = (SubLObject)mail_utilities.T;
            }
            if (current_$3 == mail_utilities.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (mail_utilities.NIL != bad && mail_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mail_utilities.$list40);
        }
        final SubLObject subject_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw42$SUBJECT, current);
        final SubLObject subject = (SubLObject)((mail_utilities.NIL != subject_tail) ? conses_high.cadr(subject_tail) : mail_utilities.NIL);
        final SubLObject host_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw9$HOST, current);
        final SubLObject host = (SubLObject)((mail_utilities.NIL != host_tail) ? conses_high.cadr(host_tail) : mail_utilities.$str10$localhost);
        final SubLObject additional_headers_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw43$ADDITIONAL_HEADERS, current);
        final SubLObject additional_headers = (SubLObject)((mail_utilities.NIL != additional_headers_tail) ? conses_high.cadr(additional_headers_tail) : mail_utilities.NIL);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw11$PORT, current);
        final SubLObject port = (mail_utilities.NIL != port_tail) ? conses_high.cadr(port_tail) : mail_utilities.$smtp_port$.getGlobalValue();
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw13$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((mail_utilities.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : mail_utilities.TEN_INTEGER);
        final SubLObject cc_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw7$CC, current);
        final SubLObject cc = (SubLObject)((mail_utilities.NIL != cc_tail) ? conses_high.cadr(cc_tail) : mail_utilities.NIL);
        final SubLObject bcc_tail = cdestructuring_bind.property_list_member((SubLObject)mail_utilities.$kw8$BCC, current);
        final SubLObject bcc = (SubLObject)((mail_utilities.NIL != bcc_tail) ? conses_high.cadr(bcc_tail) : mail_utilities.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { mail_utilities.$sym44$MAIL_MESSAGE, from, to, message, subject, host, additional_headers, port, timeout, cc, bcc });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 6638L)
    public static SubLObject mail_message(final SubLObject from, final SubLObject to, final SubLObject message, SubLObject subject, SubLObject host, SubLObject additional_headers, SubLObject port, SubLObject timeout, SubLObject cc, SubLObject bcc) {
        if (subject == mail_utilities.UNPROVIDED) {
            subject = (SubLObject)mail_utilities.NIL;
        }
        if (host == mail_utilities.UNPROVIDED) {
            host = (SubLObject)mail_utilities.$str10$localhost;
        }
        if (additional_headers == mail_utilities.UNPROVIDED) {
            additional_headers = (SubLObject)mail_utilities.NIL;
        }
        if (port == mail_utilities.UNPROVIDED) {
            port = mail_utilities.$smtp_port$.getGlobalValue();
        }
        if (timeout == mail_utilities.UNPROVIDED) {
            timeout = (SubLObject)mail_utilities.TEN_INTEGER;
        }
        if (cc == mail_utilities.UNPROVIDED) {
            cc = (SubLObject)mail_utilities.NIL;
        }
        if (bcc == mail_utilities.UNPROVIDED) {
            bcc = (SubLObject)mail_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_sent = (SubLObject)mail_utilities.NIL;
        SubLObject error_message = (SubLObject)mail_utilities.NIL;
        final SubLObject catch_errorsP = (SubLObject)mail_utilities.T;
        if (mail_utilities.NIL != catch_errorsP) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)mail_utilities.$sym45$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject bistream = (SubLObject)mail_utilities.NIL;
                        try {
                            bistream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, (SubLObject)mail_utilities.$kw46$PRIVATE);
                            if (mail_utilities.NIL != subl_macro_promotions.validate_tcp_connection(bistream, host, port)) {
                                try {
                                    sending_mail_via_smtp_preamble(bistream, from, to, cc, bcc);
                                    try {
                                        if (mail_utilities.NIL != subject) {
                                            PrintLow.format(bistream, (SubLObject)mail_utilities.$str47$Subject___A, subject);
                                            string_utilities.network_terpri(bistream);
                                        }
                                        if (mail_utilities.NIL != additional_headers) {
                                            PrintLow.format(bistream, (SubLObject)mail_utilities.$str35$_A, additional_headers);
                                            string_utilities.network_terpri(bistream);
                                        }
                                        if (message.isString()) {
                                            string_utilities.network_terpri(bistream);
                                            PrintLow.format(bistream, (SubLObject)mail_utilities.$str35$_A, message);
                                        }
                                        else if (mail_utilities.NIL != list_utilities.list_of_type_p((SubLObject)mail_utilities.$sym48$MESSAGE_PART_P, message)) {
                                            mail_message.send_message_parts(message, bistream);
                                        }
                                        else {
                                            Errors.error((SubLObject)mail_utilities.$str49$Message_must_be_a_string_or_a_lis, message);
                                        }
                                        message_sent = (SubLObject)mail_utilities.T;
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            sending_mail_via_smtp_body_postamble(bistream);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        sending_mail_via_smtp_postamble(bistream);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                if (mail_utilities.NIL != bistream) {
                                    streams_high.close(bistream, (SubLObject)mail_utilities.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)mail_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            SubLObject bistream2 = (SubLObject)mail_utilities.NIL;
            try {
                bistream2 = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, (SubLObject)mail_utilities.$kw46$PRIVATE);
                if (mail_utilities.NIL != subl_macro_promotions.validate_tcp_connection(bistream2, host, port)) {
                    try {
                        sending_mail_via_smtp_preamble(bistream2, from, to, cc, bcc);
                        try {
                            if (mail_utilities.NIL != subject) {
                                PrintLow.format(bistream2, (SubLObject)mail_utilities.$str47$Subject___A, subject);
                                string_utilities.network_terpri(bistream2);
                            }
                            if (mail_utilities.NIL != additional_headers) {
                                PrintLow.format(bistream2, (SubLObject)mail_utilities.$str35$_A, additional_headers);
                                string_utilities.network_terpri(bistream2);
                            }
                            if (message.isString()) {
                                string_utilities.network_terpri(bistream2);
                                PrintLow.format(bistream2, (SubLObject)mail_utilities.$str35$_A, message);
                            }
                            else if (mail_utilities.NIL != list_utilities.list_of_type_p((SubLObject)mail_utilities.$sym48$MESSAGE_PART_P, message)) {
                                mail_message.send_message_parts(message, bistream2);
                            }
                            else {
                                Errors.error((SubLObject)mail_utilities.$str49$Message_must_be_a_string_or_a_lis, message);
                            }
                            message_sent = (SubLObject)mail_utilities.T;
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                sending_mail_via_smtp_body_postamble(bistream2);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            sending_mail_via_smtp_postamble(bistream2);
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_utilities.T, thread);
                    final SubLObject _values6 = Values.getValuesAsVector();
                    if (mail_utilities.NIL != bistream2) {
                        streams_high.close(bistream2, (SubLObject)mail_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values6);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        if (error_message.isString()) {
            possibly_log_failed_email_message(from, to, message, subject, host, port, error_message);
        }
        else if (mail_utilities.NIL == message_sent) {
            error_message = PrintLow.format((SubLObject)mail_utilities.NIL, (SubLObject)mail_utilities.$str50$SMTP_connection_apparently_timed_, timeout);
        }
        return Values.values(message_sent, error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 8360L)
    public static SubLObject possibly_log_failed_email_message(final SubLObject from, final SubLObject to, final SubLObject message, SubLObject subject, SubLObject host, SubLObject port, SubLObject error_message) {
        if (subject == mail_utilities.UNPROVIDED) {
            subject = (SubLObject)mail_utilities.NIL;
        }
        if (host == mail_utilities.UNPROVIDED) {
            host = (SubLObject)mail_utilities.NIL;
        }
        if (port == mail_utilities.UNPROVIDED) {
            port = (SubLObject)mail_utilities.NIL;
        }
        if (error_message == mail_utilities.UNPROVIDED) {
            error_message = (SubLObject)mail_utilities.NIL;
        }
        SubLObject result = (SubLObject)mail_utilities.$kw51$NOT_LOGGED;
        if (mail_utilities.$failed_email_log_file$.getGlobalValue().isString()) {
            SubLObject stream = (SubLObject)mail_utilities.NIL;
            try {
                stream = compatibility.open_text(mail_utilities.$failed_email_log_file$.getGlobalValue(), (SubLObject)mail_utilities.$kw52$APPEND);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)mail_utilities.$str53$Unable_to_open__S, mail_utilities.$failed_email_log_file$.getGlobalValue());
                }
                final SubLObject stream_$7 = stream;
                if (stream_$7.isStream()) {
                    format_failed_email_message(stream_$7, from, to, message, subject, host, port, error_message);
                    result = (SubLObject)mail_utilities.$kw54$LOGGED;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)mail_utilities.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)mail_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 8990L)
    public static SubLObject format_failed_email_message(final SubLObject stream, final SubLObject from, final SubLObject to, final SubLObject message, final SubLObject subject, final SubLObject host, final SubLObject port, final SubLObject error_message) {
        PrintLow.format(stream, (SubLObject)mail_utilities.$str55$__The_following_message_with_host, new SubLObject[] { host, port, error_message });
        PrintLow.format(stream, (SubLObject)mail_utilities.$str56$Date___A__, rfc_822_date_string((SubLObject)mail_utilities.UNPROVIDED));
        if (mail_utilities.NIL != from) {
            PrintLow.format(stream, (SubLObject)mail_utilities.$str57$From___A__, from);
        }
        if (mail_utilities.NIL != to) {
            PrintLow.format(stream, (SubLObject)mail_utilities.$str58$To___A__, to);
        }
        if (mail_utilities.NIL != subject) {
            PrintLow.format(stream, (SubLObject)mail_utilities.$str59$Subject___A__, subject);
        }
        streams_high.terpri(stream);
        if (message.isString()) {
            print_high.princ(message, stream);
        }
        else {
            print_high.princ((SubLObject)mail_utilities.$str60$__no_message__, stream);
        }
        streams_high.terpri(stream);
        streams_high.terpri(stream);
        return (SubLObject)mail_utilities.$kw54$LOGGED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 9599L)
    public static SubLObject emacs_message(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)mail_utilities.$str61$___A__, msg);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        return msg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 10016L)
    public static SubLObject get_tcp_domain_name() {
        final SubLObject full_machine_name = Environment.get_machine_name((SubLObject)mail_utilities.UNPROVIDED);
        SubLObject domain_name = (SubLObject)mail_utilities.$str62$;
        final SubLObject dot_pos = string_utilities.char_position((SubLObject)Characters.CHAR_period, full_machine_name, (SubLObject)mail_utilities.UNPROVIDED);
        if (mail_utilities.NIL != dot_pos) {
            domain_name = Sequences.subseq(domain_name, number_utilities.f_1X(dot_pos), (SubLObject)mail_utilities.UNPROVIDED);
        }
        if (mail_utilities.NIL == string_utilities.non_empty_stringP(domain_name) && mail_utilities.NIL != Processes.external_processes_supportedP()) {
            domain_name = list_utilities.last_one(os_process_utilities.os_process_evaluation_output_strings((SubLObject)mail_utilities.$str63$domainname, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED));
            if (mail_utilities.NIL == string_utilities.non_empty_stringP(domain_name)) {
                domain_name = list_utilities.last_one(os_process_utilities.os_process_evaluation_output_strings((SubLObject)mail_utilities.$str63$domainname, (SubLObject)mail_utilities.$list64, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED));
            }
        }
        return domain_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 11572L)
    public static SubLObject user_email(SubLObject user_name) {
        if (user_name == mail_utilities.UNPROVIDED) {
            user_name = (SubLObject)mail_utilities.NIL;
        }
        final SubLObject user_id = user_name.isString() ? user_name : Environment.get_user_name((SubLObject)mail_utilities.UNPROVIDED);
        final SubLObject domain_name = get_tcp_domain_name();
        if (mail_utilities.NIL != string_utilities.non_empty_stringP(domain_name)) {
            return Sequences.cconcatenate(user_id, new SubLObject[] { mail_utilities.$str65$_, domain_name });
        }
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 12249L)
    public static SubLObject write_rfc_822_date(final SubLObject stream, SubLObject universal_time) {
        if (universal_time == mail_utilities.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = Time.decode_universal_time(universal_time, (SubLObject)mail_utilities.UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day = thread.seventhMultipleValue();
        final SubLObject dst = thread.eighthMultipleValue();
        final SubLObject tz = SubLProcess.nthMultipleValue((SubLObject)mail_utilities.EIGHT_INTEGER);
        thread.resetMultipleValues();
        final SubLObject adjusted_tz = (mail_utilities.NIL != dst) ? Numbers.subtract((SubLObject)mail_utilities.ONE_INTEGER, tz) : Numbers.minus(tz);
        streams_high.write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        streams_high.write_string((SubLObject)mail_utilities.$str34$__, stream, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        streams_high.write_string(print_high.princ_to_string(date), stream, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        streams_high.write_string(numeric_date_utilities.month_number_abbrev(month), stream, (SubLObject)mail_utilities.UNPROVIDED, (SubLObject)mail_utilities.UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        print_high.princ(year, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        utilities_macros.print_2_digit_nonnegative_integer(hour, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, stream);
        utilities_macros.print_2_digit_nonnegative_integer(minute, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, stream);
        utilities_macros.print_2_digit_nonnegative_integer(second, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        if (adjusted_tz.numL((SubLObject)mail_utilities.ZERO_INTEGER)) {
            streams_high.write_char((SubLObject)Characters.CHAR_hyphen, stream);
            utilities_macros.print_2_digit_nonnegative_integer(Numbers.minus(adjusted_tz), stream);
        }
        else {
            utilities_macros.print_2_digit_nonnegative_integer(adjusted_tz, stream);
        }
        utilities_macros.print_2_digit_nonnegative_integer((SubLObject)mail_utilities.ZERO_INTEGER, stream);
        return (SubLObject)mail_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-utilities.lisp", position = 13582L)
    public static SubLObject rfc_822_date_string(SubLObject universal_time) {
        if (universal_time == mail_utilities.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        SubLObject string = (SubLObject)mail_utilities.NIL;
        SubLObject stream = (SubLObject)mail_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            write_rfc_822_date(stream, universal_time);
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)mail_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)mail_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }
    
    public static SubLObject declare_mail_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mail_utilities", "with_smtp_connection", "WITH-SMTP-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "sending_mail_via_smtp_preamble", "SENDING-MAIL-VIA-SMTP-PREAMBLE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "check_or_clean_addressee_list", "CHECK-OR-CLEAN-ADDRESSEE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "output_addressee_list", "OUTPUT-ADDRESSEE-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "sending_mail_via_smtp_body_postamble", "SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "sending_mail_via_smtp_postamble", "SENDING-MAIL-VIA-SMTP-POSTAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "smtp_force_and_verify_success", "SMTP-FORCE-AND-VERIFY-SUCCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "smtp_verify_success", "SMTP-VERIFY-SUCCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "smtp_success", "SMTP-SUCCESS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mail_utilities", "mail_message_flexible", "MAIL-MESSAGE-FLEXIBLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "mail_message", "MAIL-MESSAGE", 3, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "possibly_log_failed_email_message", "POSSIBLY-LOG-FAILED-EMAIL-MESSAGE", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "format_failed_email_message", "FORMAT-FAILED-EMAIL-MESSAGE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "emacs_message", "EMACS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "get_tcp_domain_name", "GET-TCP-DOMAIN-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "user_email", "USER-EMAIL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "write_rfc_822_date", "WRITE-RFC-822-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_utilities", "rfc_822_date_string", "RFC-822-DATE-STRING", 0, 1, false);
        return (SubLObject)mail_utilities.NIL;
    }
    
    public static SubLObject init_mail_utilities_file() {
        mail_utilities.$smtp_port$ = SubLFiles.deflexical("*SMTP-PORT*", (SubLObject)mail_utilities.$int0$25);
        mail_utilities.$smtp_host_cycorp$ = SubLFiles.deflexical("*SMTP-HOST-CYCORP*", (SubLObject)mail_utilities.$str1$smtp_unknown_com);
        mail_utilities.$smtp_sleep_length$ = SubLFiles.deflexical("*SMTP-SLEEP-LENGTH*", (SubLObject)mail_utilities.$float38$0_005);
        mail_utilities.$failed_email_log_file$ = SubLFiles.deflexical("*FAILED-EMAIL-LOG-FILE*", (SubLObject)mail_utilities.NIL);
        return (SubLObject)mail_utilities.NIL;
    }
    
    public static SubLObject setup_mail_utilities_file() {
        access_macros.register_macro_helper((SubLObject)mail_utilities.$sym18$SENDING_MAIL_VIA_SMTP_PREAMBLE, (SubLObject)mail_utilities.$sym21$WITH_SMTP_CONNECTION);
        access_macros.register_macro_helper((SubLObject)mail_utilities.$sym19$SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE, (SubLObject)mail_utilities.$sym21$WITH_SMTP_CONNECTION);
        access_macros.register_macro_helper((SubLObject)mail_utilities.$sym20$SENDING_MAIL_VIA_SMTP_POSTAMBLE, (SubLObject)mail_utilities.$sym21$WITH_SMTP_CONNECTION);
        return (SubLObject)mail_utilities.NIL;
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
        me = (SubLFile)new mail_utilities();
        mail_utilities.$smtp_port$ = null;
        mail_utilities.$smtp_host_cycorp$ = null;
        mail_utilities.$smtp_sleep_length$ = null;
        mail_utilities.$failed_email_log_file$ = null;
        $int0$25 = SubLObjectFactory.makeInteger(25);
        $str1$smtp_unknown_com = SubLObjectFactory.makeString("smtp.unknown.com");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("BISTREAM"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("FROM"), SubLObjectFactory.makeSymbol("TO"), SubLObjectFactory.makeSymbol("CC"), SubLObjectFactory.makeSymbol("BCC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeString("localhost")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*SMTP-PORT*"))), SubLObjectFactory.makeSymbol("TIMEOUT") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeKeyword("BCC"), (SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $kw4$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw5$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw6$TO = SubLObjectFactory.makeKeyword("TO");
        $kw7$CC = SubLObjectFactory.makeKeyword("CC");
        $kw8$BCC = SubLObjectFactory.makeKeyword("BCC");
        $kw9$HOST = SubLObjectFactory.makeKeyword("HOST");
        $str10$localhost = SubLObjectFactory.makeString("localhost");
        $kw11$PORT = SubLObjectFactory.makeKeyword("PORT");
        $sym12$_SMTP_PORT_ = SubLObjectFactory.makeSymbol("*SMTP-PORT*");
        $kw13$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $sym14$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $sym16$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym17$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym18$SENDING_MAIL_VIA_SMTP_PREAMBLE = SubLObjectFactory.makeSymbol("SENDING-MAIL-VIA-SMTP-PREAMBLE");
        $sym19$SENDING_MAIL_VIA_SMTP_BODY_POSTAMBLE = SubLObjectFactory.makeSymbol("SENDING-MAIL-VIA-SMTP-BODY-POSTAMBLE");
        $sym20$SENDING_MAIL_VIA_SMTP_POSTAMBLE = SubLObjectFactory.makeSymbol("SENDING-MAIL-VIA-SMTP-POSTAMBLE");
        $sym21$WITH_SMTP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-SMTP-CONNECTION");
        $sym22$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str23$HELO__A = SubLObjectFactory.makeString("HELO ~A");
        $str24$MAIL_FROM____A_ = SubLObjectFactory.makeString("MAIL FROM: <~A>");
        $str25$RCPT_TO____A_ = SubLObjectFactory.makeString("RCPT TO: <~A>");
        $str26$DATA = SubLObjectFactory.makeString("DATA");
        $str27$Date___A = SubLObjectFactory.makeString("Date: ~A");
        $str28$From___A = SubLObjectFactory.makeString("From: ~A");
        $str29$To__ = SubLObjectFactory.makeString("To: ");
        $str30$Cc__ = SubLObjectFactory.makeString("Cc: ");
        $str31$Bcc__ = SubLObjectFactory.makeString("Bcc: ");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(","));
        $sym33$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str34$__ = SubLObjectFactory.makeString(", ");
        $str35$_A = SubLObjectFactory.makeString("~A");
        $str36$_ = SubLObjectFactory.makeString(".");
        $str37$QUIT = SubLObjectFactory.makeString("QUIT");
        $float38$0_005 = (SubLFloat)SubLObjectFactory.makeDouble(0.005);
        $str39$SMTP_error___A = SubLObjectFactory.makeString("SMTP error: ~A");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FROM"), SubLObjectFactory.makeSymbol("TO"), SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("SUBJECT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeString("localhost")), SubLObjectFactory.makeSymbol("ADDITIONAL-HEADERS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("*SMTP-PORT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)mail_utilities.TEN_INTEGER), SubLObjectFactory.makeSymbol("CC"), SubLObjectFactory.makeSymbol("BCC") });
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeKeyword("BCC"));
        $kw42$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw43$ADDITIONAL_HEADERS = SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS");
        $sym44$MAIL_MESSAGE = SubLObjectFactory.makeSymbol("MAIL-MESSAGE");
        $sym45$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw46$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $str47$Subject___A = SubLObjectFactory.makeString("Subject: ~A");
        $sym48$MESSAGE_PART_P = SubLObjectFactory.makeSymbol("MESSAGE-PART-P");
        $str49$Message_must_be_a_string_or_a_lis = SubLObjectFactory.makeString("Message must be a string or a list of message parts, not ~S");
        $str50$SMTP_connection_apparently_timed_ = SubLObjectFactory.makeString("SMTP connection apparently timed out after ~S seconds.");
        $kw51$NOT_LOGGED = SubLObjectFactory.makeKeyword("NOT-LOGGED");
        $kw52$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str53$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw54$LOGGED = SubLObjectFactory.makeKeyword("LOGGED");
        $str55$__The_following_message_with_host = SubLObjectFactory.makeString("~&The following message with host ~S (port ~S) failed with the error:~% ~S.~%");
        $str56$Date___A__ = SubLObjectFactory.makeString("Date: ~A~%");
        $str57$From___A__ = SubLObjectFactory.makeString("From: ~A~%");
        $str58$To___A__ = SubLObjectFactory.makeString("To: ~A~%");
        $str59$Subject___A__ = SubLObjectFactory.makeString("Subject: ~A~%");
        $str60$__no_message__ = SubLObjectFactory.makeString("--no message--");
        $str61$___A__ = SubLObjectFactory.makeString("~&~A~&");
        $str62$ = SubLObjectFactory.makeString("");
        $str63$domainname = SubLObjectFactory.makeString("domainname");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-d"));
        $str65$_ = SubLObjectFactory.makeString("@");
    }
}

/*

	Total time: 389 ms
	
*/