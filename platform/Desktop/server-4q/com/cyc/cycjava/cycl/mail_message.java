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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mail_message extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mail_message";
    public static final String myFingerPrint = "c2a44db541156d70e90d3f3530ba484fac8b52b33a48eb3ddb9273375d86d7ab";
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLSymbol $dtp_message$;
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLSymbol $dtp_message_part$;
    private static final SubLSymbol $sym0$MESSAGE;
    private static final SubLSymbol $sym1$MESSAGE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_MESSAGE;
    private static final SubLSymbol $sym7$MESSAGE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$MSG_FROM;
    private static final SubLSymbol $sym10$_CSETF_MSG_FROM;
    private static final SubLSymbol $sym11$MSG_TO;
    private static final SubLSymbol $sym12$_CSETF_MSG_TO;
    private static final SubLSymbol $sym13$MSG_CC;
    private static final SubLSymbol $sym14$_CSETF_MSG_CC;
    private static final SubLSymbol $sym15$MSG_BCC;
    private static final SubLSymbol $sym16$_CSETF_MSG_BCC;
    private static final SubLSymbol $sym17$MSG_SUBJECT;
    private static final SubLSymbol $sym18$_CSETF_MSG_SUBJECT;
    private static final SubLSymbol $sym19$MSG_ADDITIONAL_HEADERS;
    private static final SubLSymbol $sym20$_CSETF_MSG_ADDITIONAL_HEADERS;
    private static final SubLSymbol $sym21$MSG_HOST;
    private static final SubLSymbol $sym22$_CSETF_MSG_HOST;
    private static final SubLSymbol $sym23$MSG_PORT;
    private static final SubLSymbol $sym24$_CSETF_MSG_PORT;
    private static final SubLSymbol $sym25$MSG_PARTS;
    private static final SubLSymbol $sym26$_CSETF_MSG_PARTS;
    private static final SubLSymbol $kw27$FROM;
    private static final SubLSymbol $kw28$TO;
    private static final SubLSymbol $kw29$CC;
    private static final SubLSymbol $kw30$BCC;
    private static final SubLSymbol $kw31$SUBJECT;
    private static final SubLSymbol $kw32$ADDITIONAL_HEADERS;
    private static final SubLSymbol $kw33$HOST;
    private static final SubLSymbol $kw34$PORT;
    private static final SubLSymbol $kw35$PARTS;
    private static final SubLString $str36$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw37$BEGIN;
    private static final SubLSymbol $sym38$MAKE_MESSAGE;
    private static final SubLSymbol $kw39$SLOT;
    private static final SubLSymbol $kw40$END;
    private static final SubLSymbol $sym41$VISIT_DEFSTRUCT_OBJECT_MESSAGE_METHOD;
    private static final SubLString $str42$_MESSAGE_;
    private static final SubLString $str43$localhost;
    private static final SubLSymbol $sym44$STRINGP;
    private static final SubLSymbol $sym45$INTEGERP;
    private static final SubLSymbol $sym46$MESSAGE_PART_P;
    private static final SubLSymbol $sym47$NON_DOTTED_LIST_P;
    private static final SubLString $str48$Content_Type__multipart_mixed____;
    private static final SubLString $str49$This_is_a_multi_part_message_in_M;
    private static final SubLString $str50$___A__;
    private static final SubLSymbol $sym51$SXHASH_MESSAGE_METHOD;
    private static final SubLSymbol $sym52$MESSAGE_PART;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$PRINT_MESSAGE_PART;
    private static final SubLSymbol $sym58$MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$MSG_PART_CONTENT_TYPE;
    private static final SubLSymbol $sym61$_CSETF_MSG_PART_CONTENT_TYPE;
    private static final SubLSymbol $sym62$MSG_PART_CONTENT_TYPE_PARAMETERS;
    private static final SubLSymbol $sym63$_CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS;
    private static final SubLSymbol $sym64$MSG_PART_DISPOSITION;
    private static final SubLSymbol $sym65$_CSETF_MSG_PART_DISPOSITION;
    private static final SubLSymbol $sym66$MSG_PART_CONTENT_DISPOSITION_PARAMETERS;
    private static final SubLSymbol $sym67$_CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS;
    private static final SubLSymbol $sym68$MSG_PART_ENCODING;
    private static final SubLSymbol $sym69$_CSETF_MSG_PART_ENCODING;
    private static final SubLSymbol $sym70$MSG_PART_DATA;
    private static final SubLSymbol $sym71$_CSETF_MSG_PART_DATA;
    private static final SubLSymbol $sym72$MSG_PART_DATA_TYPE;
    private static final SubLSymbol $sym73$_CSETF_MSG_PART_DATA_TYPE;
    private static final SubLSymbol $kw74$CONTENT_TYPE;
    private static final SubLSymbol $kw75$CONTENT_TYPE_PARAMETERS;
    private static final SubLSymbol $kw76$DISPOSITION;
    private static final SubLSymbol $kw77$CONTENT_DISPOSITION_PARAMETERS;
    private static final SubLSymbol $kw78$ENCODING;
    private static final SubLSymbol $kw79$DATA;
    private static final SubLSymbol $kw80$DATA_TYPE;
    private static final SubLSymbol $sym81$MAKE_MESSAGE_PART;
    private static final SubLSymbol $sym82$VISIT_DEFSTRUCT_OBJECT_MESSAGE_PART_METHOD;
    private static final SubLString $str83$_MESSAGE_PART___A_;
    private static final SubLString $str84$_;
    private static final SubLString $str85$text_plain;
    private static final SubLString $str86$7bit;
    private static final SubLSymbol $sym87$VALID_MESSAGE_PART_ENCODING_P;
    private static final SubLString $str88$inline;
    private static final SubLSymbol $kw89$STRING;
    private static final SubLString $str90$attachment;
    private static final SubLSymbol $kw91$FILE;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLString $str94$text_;
    private static final SubLString $str95$Non_text_content_types_not_implem;
    private static final SubLSymbol $kw96$FILENAME;
    private static final SubLSymbol $sym97$SXHASH_MESSAGE_PART_METHOD;
    private static final SubLString $str98$___A;
    private static final SubLString $str99$Content_Type___A;
    private static final SubLString $str100$Content_Transfer_Encoding___A;
    private static final SubLString $str101$Content_Disposition___A;
    private static final SubLString $str102$_;
    private static final SubLString $str103$__A__S;
    private static final SubLSymbol $kw104$INPUT;
    private static final SubLString $str105$Unable_to_open__S;
    private static final SubLSymbol $kw106$EOF;
    private static final SubLString $str107$Only_know_how_to_send_textual_mes;
    private static final SubLString $str108$This_is_a_test__Please_ignore_;
    private static final SubLString $str109$test_message;
    private static final SubLString $str110$Please_ignore_this_message_and_th;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject message_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message(v_object, stream, (SubLObject)mail_message.ZERO_INTEGER);
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject message_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $message_native.class) ? mail_message.T : mail_message.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_from(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_to(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_cc(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_bcc(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_subject(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_additional_headers(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_host(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_port(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject msg_parts(final SubLObject v_object) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_from(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_to(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_cc(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_bcc(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_subject(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_additional_headers(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_host(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_port(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject _csetf_msg_parts(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject make_message(SubLObject arglist) {
        if (arglist == mail_message.UNPROVIDED) {
            arglist = (SubLObject)mail_message.NIL;
        }
        final SubLObject v_new = (SubLObject)new $message_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)mail_message.NIL, next = arglist; mail_message.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)mail_message.$kw27$FROM)) {
                _csetf_msg_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw28$TO)) {
                _csetf_msg_to(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw29$CC)) {
                _csetf_msg_cc(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw30$BCC)) {
                _csetf_msg_bcc(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw31$SUBJECT)) {
                _csetf_msg_subject(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw32$ADDITIONAL_HEADERS)) {
                _csetf_msg_additional_headers(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw33$HOST)) {
                _csetf_msg_host(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw34$PORT)) {
                _csetf_msg_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw35$PARTS)) {
                _csetf_msg_parts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)mail_message.$str36$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject visit_defstruct_message(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw37$BEGIN, (SubLObject)mail_message.$sym38$MAKE_MESSAGE, (SubLObject)mail_message.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw27$FROM, msg_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw28$TO, msg_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw29$CC, msg_cc(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw30$BCC, msg_bcc(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw31$SUBJECT, msg_subject(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw32$ADDITIONAL_HEADERS, msg_additional_headers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw33$HOST, msg_host(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw34$PORT, msg_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw35$PARTS, msg_parts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw40$END, (SubLObject)mail_message.$sym38$MAKE_MESSAGE, (SubLObject)mail_message.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1268L)
    public static SubLObject visit_defstruct_object_message_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1595L)
    public static SubLObject print_message(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)mail_message.$str42$_MESSAGE_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 1727L)
    public static SubLObject new_message(SubLObject from, SubLObject to, SubLObject subject, SubLObject message_string, SubLObject host, SubLObject port) {
        if (from == mail_message.UNPROVIDED) {
            from = (SubLObject)mail_message.NIL;
        }
        if (to == mail_message.UNPROVIDED) {
            to = (SubLObject)mail_message.NIL;
        }
        if (subject == mail_message.UNPROVIDED) {
            subject = (SubLObject)mail_message.NIL;
        }
        if (message_string == mail_message.UNPROVIDED) {
            message_string = (SubLObject)mail_message.NIL;
        }
        if (host == mail_message.UNPROVIDED) {
            host = (SubLObject)mail_message.$str43$localhost;
        }
        if (port == mail_message.UNPROVIDED) {
            port = mail_utilities.$smtp_port$.getGlobalValue();
        }
        if (mail_message.NIL != from && !mail_message.assertionsDisabledInClass && mail_message.NIL == Types.stringp(from)) {
            throw new AssertionError(from);
        }
        if (mail_message.NIL != to && !mail_message.assertionsDisabledInClass && mail_message.NIL == Types.stringp(to)) {
            throw new AssertionError(to);
        }
        if (mail_message.NIL != subject && !mail_message.assertionsDisabledInClass && mail_message.NIL == Types.stringp(subject)) {
            throw new AssertionError(subject);
        }
        if (mail_message.NIL != message_string && !mail_message.assertionsDisabledInClass && mail_message.NIL == Types.stringp(message_string)) {
            throw new AssertionError(message_string);
        }
        assert mail_message.NIL != Types.stringp(host) : host;
        assert mail_message.NIL != Types.integerp(port) : port;
        final SubLObject message = make_message((SubLObject)mail_message.UNPROVIDED);
        _csetf_msg_from(message, from);
        _csetf_msg_to(message, (SubLObject)((mail_message.NIL != to) ? ConsesLow.list(to) : mail_message.NIL));
        _csetf_msg_cc(message, (SubLObject)mail_message.NIL);
        _csetf_msg_bcc(message, (SubLObject)mail_message.NIL);
        _csetf_msg_subject(message, subject);
        _csetf_msg_host(message, host);
        _csetf_msg_port(message, port);
        _csetf_msg_parts(message, (SubLObject)((mail_message.NIL != message_string) ? ConsesLow.list(new_inline_message_part(message_string, (SubLObject)mail_message.UNPROVIDED, (SubLObject)mail_message.UNPROVIDED)) : mail_message.NIL));
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 2842L)
    public static SubLObject message_set_from(final SubLObject message, final SubLObject from) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(from) : from;
        _csetf_msg_from(message, from);
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3014L)
    public static SubLObject message_from(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_from(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3114L)
    public static SubLObject message_add_to(final SubLObject message, final SubLObject to) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(to) : to;
        if (mail_message.NIL == conses_high.member(to, msg_to(message), Symbols.symbol_function((SubLObject)mail_message.EQUALP), Symbols.symbol_function((SubLObject)mail_message.IDENTITY))) {
            _csetf_msg_to(message, (SubLObject)ConsesLow.cons(to, msg_to(message)));
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3276L)
    public static SubLObject message_to(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_to(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3372L)
    public static SubLObject message_add_cc(final SubLObject message, final SubLObject cc) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(cc) : cc;
        if (mail_message.NIL == conses_high.member(cc, msg_cc(message), Symbols.symbol_function((SubLObject)mail_message.EQUALP), Symbols.symbol_function((SubLObject)mail_message.IDENTITY))) {
            _csetf_msg_cc(message, (SubLObject)ConsesLow.cons(cc, msg_cc(message)));
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3534L)
    public static SubLObject message_cc(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_cc(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3630L)
    public static SubLObject message_add_bcc(final SubLObject message, final SubLObject bcc) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(bcc) : bcc;
        if (mail_message.NIL == conses_high.member(bcc, msg_bcc(message), Symbols.symbol_function((SubLObject)mail_message.EQUALP), Symbols.symbol_function((SubLObject)mail_message.IDENTITY))) {
            _csetf_msg_bcc(message, (SubLObject)ConsesLow.cons(bcc, msg_bcc(message)));
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3797L)
    public static SubLObject message_bcc(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_bcc(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 3895L)
    public static SubLObject message_set_subject(final SubLObject message, final SubLObject subject) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(subject) : subject;
        _csetf_msg_subject(message, subject);
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4070L)
    public static SubLObject message_subject(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_subject(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4176L)
    public static SubLObject message_add_header(final SubLObject message, final SubLObject header) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(header) : header;
        if (mail_message.NIL == conses_high.member(header, msg_additional_headers(message), Symbols.symbol_function((SubLObject)mail_message.EQUALP), Symbols.symbol_function((SubLObject)mail_message.IDENTITY))) {
            _csetf_msg_additional_headers(message, (SubLObject)ConsesLow.cons(header, msg_additional_headers(message)));
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4488L)
    public static SubLObject message_additional_headers(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_additional_headers(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4616L)
    public static SubLObject message_set_host(final SubLObject message, final SubLObject host) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.stringp(host) : host;
        _csetf_msg_host(message, host);
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4776L)
    public static SubLObject message_host(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_host(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 4876L)
    public static SubLObject message_set_port(final SubLObject message, final SubLObject port) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != Types.integerp(port) : port;
        _csetf_msg_port(message, port);
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 5037L)
    public static SubLObject message_port(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_port(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 5137L)
    public static SubLObject message_add_part(final SubLObject message, final SubLObject part) {
        assert mail_message.NIL != message_p(message) : message;
        assert mail_message.NIL != message_part_p(part) : part;
        _csetf_msg_parts(message, list_utilities.add_to_end(part, msg_parts(message)));
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 5338L)
    public static SubLObject message_parts(final SubLObject message) {
        assert mail_message.NIL != message_p(message) : message;
        return msg_parts(message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 5440L)
    public static SubLObject send_message(final SubLObject message, SubLObject timeout) {
        if (timeout == mail_message.UNPROVIDED) {
            timeout = (SubLObject)mail_message.TEN_INTEGER;
        }
        assert mail_message.NIL != message_p(message) : message;
        validate_message(message);
        return send_message_internal(message, timeout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 5631L)
    public static SubLObject send_message_parts(final SubLObject parts, final SubLObject smpt_stream) {
        assert mail_message.NIL != list_utilities.non_dotted_list_p(parts) : parts;
        SubLObject cdolist_list_var = parts;
        SubLObject elem = (SubLObject)mail_message.NIL;
        elem = cdolist_list_var.first();
        while (mail_message.NIL != cdolist_list_var) {
            assert mail_message.NIL != message_part_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject boundary = Guids.guid_to_string(Guids.new_guid());
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str48$Content_Type__multipart_mixed____, boundary);
        string_utilities.network_terpri(smpt_stream);
        string_utilities.network_terpri(smpt_stream);
        print_high.princ((SubLObject)mail_message.$str49$This_is_a_multi_part_message_in_M, smpt_stream);
        cdolist_list_var = parts;
        SubLObject part = (SubLObject)mail_message.NIL;
        part = cdolist_list_var.first();
        while (mail_message.NIL != cdolist_list_var) {
            send_message_part(part, smpt_stream, boundary);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        string_utilities.network_terpri(smpt_stream);
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str50$___A__, boundary);
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 6312L)
    public static SubLObject sxhash_message_method(final SubLObject v_object) {
        return sxhash_message(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 6406L)
    public static SubLObject sxhash_message(final SubLObject message) {
        return Sxhash.sxhash(msg_from(message));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 6497L)
    public static SubLObject validate_message(final SubLObject message) {
        final SubLObject sendableP = (SubLObject)mail_message.T;
        final SubLObject problem_message = (SubLObject)mail_message.NIL;
        return Values.values(sendableP, problem_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 6723L)
    public static SubLObject send_message_internal(final SubLObject message, final SubLObject timeout) {
        return mail_utilities.mail_message(message_from(message), message_to(message), message_parts(message), message_subject(message), message_host(message), message_additional_headers(message), message_port(message), timeout, message_cc(message), message_bcc(message));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject message_part_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message_part(v_object, stream, (SubLObject)mail_message.ZERO_INTEGER);
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject message_part_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $message_part_native.class) ? mail_message.T : mail_message.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_content_type(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_content_type_parameters(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_disposition(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_content_disposition_parameters(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_encoding(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_data(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject msg_part_data_type(final SubLObject v_object) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_content_type(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_content_type_parameters(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_disposition(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_content_disposition_parameters(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_encoding(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_data(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject _csetf_msg_part_data_type(final SubLObject v_object, final SubLObject value) {
        assert mail_message.NIL != message_part_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject make_message_part(SubLObject arglist) {
        if (arglist == mail_message.UNPROVIDED) {
            arglist = (SubLObject)mail_message.NIL;
        }
        final SubLObject v_new = (SubLObject)new $message_part_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)mail_message.NIL, next = arglist; mail_message.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)mail_message.$kw74$CONTENT_TYPE)) {
                _csetf_msg_part_content_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw75$CONTENT_TYPE_PARAMETERS)) {
                _csetf_msg_part_content_type_parameters(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw76$DISPOSITION)) {
                _csetf_msg_part_disposition(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw77$CONTENT_DISPOSITION_PARAMETERS)) {
                _csetf_msg_part_content_disposition_parameters(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw78$ENCODING)) {
                _csetf_msg_part_encoding(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw79$DATA)) {
                _csetf_msg_part_data(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)mail_message.$kw80$DATA_TYPE)) {
                _csetf_msg_part_data_type(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)mail_message.$str36$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject visit_defstruct_message_part(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw37$BEGIN, (SubLObject)mail_message.$sym81$MAKE_MESSAGE_PART, (SubLObject)mail_message.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw74$CONTENT_TYPE, msg_part_content_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw75$CONTENT_TYPE_PARAMETERS, msg_part_content_type_parameters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw76$DISPOSITION, msg_part_disposition(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw77$CONTENT_DISPOSITION_PARAMETERS, msg_part_content_disposition_parameters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw78$ENCODING, msg_part_encoding(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw79$DATA, msg_part_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw39$SLOT, (SubLObject)mail_message.$kw80$DATA_TYPE, msg_part_data_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)mail_message.$kw40$END, (SubLObject)mail_message.$sym81$MAKE_MESSAGE_PART, (SubLObject)mail_message.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 7479L)
    public static SubLObject visit_defstruct_object_message_part_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_part(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 8070L)
    public static SubLObject print_message_part(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)mail_message.$str83$_MESSAGE_PART___A_, message_part_disposition(v_object));
        PrintLow.format(stream, (SubLObject)mail_message.$str84$_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 8264L)
    public static SubLObject new_inline_message_part(final SubLObject data, SubLObject content_type, SubLObject encoding) {
        if (content_type == mail_message.UNPROVIDED) {
            content_type = (SubLObject)mail_message.$str85$text_plain;
        }
        if (encoding == mail_message.UNPROVIDED) {
            encoding = (SubLObject)mail_message.$str86$7bit;
        }
        assert mail_message.NIL != Types.stringp(data) : data;
        assert mail_message.NIL != Types.stringp(content_type) : content_type;
        assert mail_message.NIL != valid_message_part_encoding_p(encoding) : encoding;
        return new_message_part(content_type, (SubLObject)mail_message.$str88$inline, encoding, data, (SubLObject)mail_message.$kw89$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 8595L)
    public static SubLObject new_message_attachment(final SubLObject file, SubLObject content_type, SubLObject name, SubLObject encoding) {
        if (content_type == mail_message.UNPROVIDED) {
            content_type = (SubLObject)mail_message.$str85$text_plain;
        }
        if (name == mail_message.UNPROVIDED) {
            name = file_utilities.pathstring_filename(file);
        }
        if (encoding == mail_message.UNPROVIDED) {
            encoding = (SubLObject)mail_message.$str86$7bit;
        }
        assert mail_message.NIL != Types.stringp(file) : file;
        assert mail_message.NIL != Types.stringp(content_type) : content_type;
        assert mail_message.NIL != valid_message_part_encoding_p(encoding) : encoding;
        final SubLObject message_part = new_message_part(content_type, (SubLObject)mail_message.$str90$attachment, encoding, file, (SubLObject)mail_message.$kw91$FILE);
        message_part_set_attachment_name(message_part, name);
        return message_part;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 9052L)
    public static SubLObject valid_message_part_data_type_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isKeyword() && mail_message.NIL != conses_high.member(obj, (SubLObject)mail_message.$list92, (SubLObject)mail_message.UNPROVIDED, (SubLObject)mail_message.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 9172L)
    public static SubLObject valid_message_part_encoding_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isString() && mail_message.NIL != conses_high.member(obj, (SubLObject)mail_message.$list93, Symbols.symbol_function((SubLObject)mail_message.EQUAL), (SubLObject)mail_message.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 9307L)
    public static SubLObject new_message_part(final SubLObject content_type, final SubLObject disposition, final SubLObject encoding, final SubLObject data, final SubLObject data_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mail_message.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && mail_message.NIL == string_utilities.starts_with(content_type, (SubLObject)mail_message.$str94$text_)) {
            Errors.error((SubLObject)mail_message.$str95$Non_text_content_types_not_implem, content_type);
        }
        final SubLObject message_part = make_message_part((SubLObject)mail_message.UNPROVIDED);
        _csetf_msg_part_content_type(message_part, content_type);
        _csetf_msg_part_content_type_parameters(message_part, (SubLObject)mail_message.NIL);
        _csetf_msg_part_disposition(message_part, disposition);
        _csetf_msg_part_content_disposition_parameters(message_part, (SubLObject)mail_message.NIL);
        _csetf_msg_part_encoding(message_part, encoding);
        _csetf_msg_part_data(message_part, data);
        _csetf_msg_part_data_type(message_part, data_type);
        return message_part;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10023L)
    public static SubLObject message_part_content_type(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_content_type(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10193L)
    public static SubLObject message_part_set_content_type(final SubLObject message_part, final SubLObject content_type) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        assert mail_message.NIL != Types.stringp(content_type) : content_type;
        _csetf_msg_part_content_type(message_part, content_type);
        return message_part;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10428L)
    public static SubLObject message_part_content_disposition_parameters(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_content_disposition_parameters(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10610L)
    public static SubLObject message_part_set_attachment_name(final SubLObject message_part, final SubLObject name) {
        return message_part_set_content_disposition_parameter(message_part, (SubLObject)mail_message.$kw96$FILENAME, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10765L)
    public static SubLObject message_part_disposition(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_disposition(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 10909L)
    public static SubLObject message_part_encoding(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_encoding(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11047L)
    public static SubLObject message_part_data(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_data(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11177L)
    public static SubLObject message_part_data_type(final SubLObject message_part) {
        assert mail_message.NIL != message_part_p(message_part) : message_part;
        return msg_part_data_type(message_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11317L)
    public static SubLObject sxhash_message_part_method(final SubLObject v_object) {
        return sxhash_message_part(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11421L)
    public static SubLObject sxhash_message_part(final SubLObject message_part) {
        return Sxhash.sxhash(msg_part_content_type(message_part));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11540L)
    public static SubLObject message_part_set_content_disposition_parameter(final SubLObject message_part, final SubLObject param, final SubLObject value) {
        SubLObject params = message_part_content_disposition_parameters(message_part);
        params = conses_high.putf(params, param, value);
        _csetf_msg_part_content_disposition_parameters(message_part, params);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 11854L)
    public static SubLObject send_message_part(final SubLObject message_part, final SubLObject smpt_stream, final SubLObject boundary) {
        string_utilities.network_terpri(smpt_stream);
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str98$___A, boundary);
        send_message_part_headers(message_part, smpt_stream);
        send_message_part_data(message_part, smpt_stream);
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 12117L)
    public static SubLObject send_message_part_headers(final SubLObject message_part, final SubLObject smpt_stream) {
        string_utilities.network_terpri(smpt_stream);
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str99$Content_Type___A, message_part_content_type(message_part));
        string_utilities.network_terpri(smpt_stream);
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str100$Content_Transfer_Encoding___A, message_part_encoding(message_part));
        string_utilities.network_terpri(smpt_stream);
        PrintLow.format(smpt_stream, (SubLObject)mail_message.$str101$Content_Disposition___A, message_part_disposition(message_part));
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)mail_message.NIL, remainder = message_part_content_disposition_parameters(message_part); mail_message.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            print_high.princ((SubLObject)mail_message.$str102$_, smpt_stream);
            string_utilities.network_terpri(smpt_stream);
            PrintLow.format(smpt_stream, (SubLObject)mail_message.$str103$__A__S, property, value);
        }
        string_utilities.network_terpri(smpt_stream);
        string_utilities.network_terpri(smpt_stream);
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 12859L)
    public static SubLObject send_message_part_data(final SubLObject message_part, final SubLObject smpt_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = message_part_data_type(message_part);
        if (pcase_var.eql((SubLObject)mail_message.$kw89$STRING)) {
            print_high.princ(message_part_data(message_part), smpt_stream);
        }
        else if (pcase_var.eql((SubLObject)mail_message.$kw91$FILE)) {
            if (mail_message.NIL != string_utilities.starts_with(message_part_content_type(message_part), (SubLObject)mail_message.$str94$text_)) {
                SubLObject stream = (SubLObject)mail_message.NIL;
                try {
                    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)mail_message.NIL, thread);
                        stream = compatibility.open_text(message_part_data(message_part), (SubLObject)mail_message.$kw104$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)mail_message.$str105$Unable_to_open__S, message_part_data(message_part));
                    }
                    final SubLObject filestream = stream;
                    SubLObject doneP = (SubLObject)mail_message.NIL;
                    while (mail_message.NIL == doneP) {
                        final SubLObject line = streams_high.read_line(filestream, (SubLObject)mail_message.NIL, (SubLObject)mail_message.$kw106$EOF, (SubLObject)mail_message.UNPROVIDED);
                        if (line.isString()) {
                            print_high.princ(line, smpt_stream);
                            string_utilities.network_terpri(smpt_stream);
                        }
                        else {
                            doneP = (SubLObject)mail_message.T;
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mail_message.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)mail_message.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }
            else {
                Errors.error((SubLObject)mail_message.$str107$Only_know_how_to_send_textual_mes);
            }
        }
        return (SubLObject)mail_message.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 13636L)
    public static SubLObject send_test_message(final SubLObject to, final SubLObject from, SubLObject message_string, SubLObject subject) {
        if (message_string == mail_message.UNPROVIDED) {
            message_string = (SubLObject)mail_message.$str108$This_is_a_test__Please_ignore_;
        }
        if (subject == mail_message.UNPROVIDED) {
            subject = (SubLObject)mail_message.$str109$test_message;
        }
        final SubLObject message = new_message(from, to, subject, message_string, (SubLObject)mail_message.UNPROVIDED, (SubLObject)mail_message.UNPROVIDED);
        return send_message(message, (SubLObject)mail_message.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mail-message.lisp", position = 13636L)
    public static SubLObject send_test_message_with_attachment(final SubLObject to, final SubLObject from, final SubLObject file, SubLObject content_type, SubLObject subject, SubLObject message_string) {
        if (content_type == mail_message.UNPROVIDED) {
            content_type = (SubLObject)mail_message.$str85$text_plain;
        }
        if (subject == mail_message.UNPROVIDED) {
            subject = (SubLObject)mail_message.$str109$test_message;
        }
        if (message_string == mail_message.UNPROVIDED) {
            message_string = (SubLObject)mail_message.$str110$Please_ignore_this_message_and_th;
        }
        final SubLObject message = new_message(from, to, subject, message_string, (SubLObject)mail_message.UNPROVIDED, (SubLObject)mail_message.UNPROVIDED);
        final SubLObject attachment = new_message_attachment(file, content_type, (SubLObject)mail_message.UNPROVIDED, (SubLObject)mail_message.UNPROVIDED);
        message_add_part(message, attachment);
        return send_message(message, (SubLObject)mail_message.UNPROVIDED);
    }
    
    public static SubLObject declare_mail_message_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_print_function_trampoline", "MESSAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_p", "MESSAGE-P", 1, 0, false);
        new $message_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_from", "MSG-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_to", "MSG-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_cc", "MSG-CC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_bcc", "MSG-BCC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_subject", "MSG-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_additional_headers", "MSG-ADDITIONAL-HEADERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_host", "MSG-HOST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_port", "MSG-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_parts", "MSG-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_from", "_CSETF-MSG-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_to", "_CSETF-MSG-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_cc", "_CSETF-MSG-CC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_bcc", "_CSETF-MSG-BCC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_subject", "_CSETF-MSG-SUBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_additional_headers", "_CSETF-MSG-ADDITIONAL-HEADERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_host", "_CSETF-MSG-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_port", "_CSETF-MSG-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_parts", "_CSETF-MSG-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "make_message", "MAKE-MESSAGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "visit_defstruct_message", "VISIT-DEFSTRUCT-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "visit_defstruct_object_message_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "print_message", "PRINT-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "new_message", "NEW-MESSAGE", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_set_from", "MESSAGE-SET-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_from", "MESSAGE-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_add_to", "MESSAGE-ADD-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_to", "MESSAGE-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_add_cc", "MESSAGE-ADD-CC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_cc", "MESSAGE-CC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_add_bcc", "MESSAGE-ADD-BCC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_bcc", "MESSAGE-BCC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_set_subject", "MESSAGE-SET-SUBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_subject", "MESSAGE-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_add_header", "MESSAGE-ADD-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_additional_headers", "MESSAGE-ADDITIONAL-HEADERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_set_host", "MESSAGE-SET-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_host", "MESSAGE-HOST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_set_port", "MESSAGE-SET-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_port", "MESSAGE-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_add_part", "MESSAGE-ADD-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_parts", "MESSAGE-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message", "SEND-MESSAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message_parts", "SEND-MESSAGE-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "sxhash_message_method", "SXHASH-MESSAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "sxhash_message", "SXHASH-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "validate_message", "VALIDATE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message_internal", "SEND-MESSAGE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_print_function_trampoline", "MESSAGE-PART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_p", "MESSAGE-PART-P", 1, 0, false);
        new $message_part_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_content_type", "MSG-PART-CONTENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_content_type_parameters", "MSG-PART-CONTENT-TYPE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_disposition", "MSG-PART-DISPOSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_content_disposition_parameters", "MSG-PART-CONTENT-DISPOSITION-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_encoding", "MSG-PART-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_data", "MSG-PART-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "msg_part_data_type", "MSG-PART-DATA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_content_type", "_CSETF-MSG-PART-CONTENT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_content_type_parameters", "_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_disposition", "_CSETF-MSG-PART-DISPOSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_content_disposition_parameters", "_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_encoding", "_CSETF-MSG-PART-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_data", "_CSETF-MSG-PART-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "_csetf_msg_part_data_type", "_CSETF-MSG-PART-DATA-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "make_message_part", "MAKE-MESSAGE-PART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "visit_defstruct_message_part", "VISIT-DEFSTRUCT-MESSAGE-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "visit_defstruct_object_message_part_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-PART-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "print_message_part", "PRINT-MESSAGE-PART", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "new_inline_message_part", "NEW-INLINE-MESSAGE-PART", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "new_message_attachment", "NEW-MESSAGE-ATTACHMENT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "valid_message_part_data_type_p", "VALID-MESSAGE-PART-DATA-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "valid_message_part_encoding_p", "VALID-MESSAGE-PART-ENCODING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "new_message_part", "NEW-MESSAGE-PART", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_content_type", "MESSAGE-PART-CONTENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_set_content_type", "MESSAGE-PART-SET-CONTENT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_content_disposition_parameters", "MESSAGE-PART-CONTENT-DISPOSITION-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_set_attachment_name", "MESSAGE-PART-SET-ATTACHMENT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_disposition", "MESSAGE-PART-DISPOSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_encoding", "MESSAGE-PART-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_data", "MESSAGE-PART-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_data_type", "MESSAGE-PART-DATA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "sxhash_message_part_method", "SXHASH-MESSAGE-PART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "sxhash_message_part", "SXHASH-MESSAGE-PART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "message_part_set_content_disposition_parameter", "MESSAGE-PART-SET-CONTENT-DISPOSITION-PARAMETER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message_part", "SEND-MESSAGE-PART", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message_part_headers", "SEND-MESSAGE-PART-HEADERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_message_part_data", "SEND-MESSAGE-PART-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_test_message", "SEND-TEST-MESSAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mail_message", "send_test_message_with_attachment", "SEND-TEST-MESSAGE-WITH-ATTACHMENT", 3, 3, false);
        return (SubLObject)mail_message.NIL;
    }
    
    public static SubLObject init_mail_message_file() {
        mail_message.$dtp_message$ = SubLFiles.defconstant("*DTP-MESSAGE*", (SubLObject)mail_message.$sym0$MESSAGE);
        mail_message.$dtp_message_part$ = SubLFiles.defconstant("*DTP-MESSAGE-PART*", (SubLObject)mail_message.$sym52$MESSAGE_PART);
        return (SubLObject)mail_message.NIL;
    }
    
    public static SubLObject setup_mail_message_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), mail_message.$dtp_message$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym7$MESSAGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)mail_message.$list8);
        Structures.def_csetf((SubLObject)mail_message.$sym9$MSG_FROM, (SubLObject)mail_message.$sym10$_CSETF_MSG_FROM);
        Structures.def_csetf((SubLObject)mail_message.$sym11$MSG_TO, (SubLObject)mail_message.$sym12$_CSETF_MSG_TO);
        Structures.def_csetf((SubLObject)mail_message.$sym13$MSG_CC, (SubLObject)mail_message.$sym14$_CSETF_MSG_CC);
        Structures.def_csetf((SubLObject)mail_message.$sym15$MSG_BCC, (SubLObject)mail_message.$sym16$_CSETF_MSG_BCC);
        Structures.def_csetf((SubLObject)mail_message.$sym17$MSG_SUBJECT, (SubLObject)mail_message.$sym18$_CSETF_MSG_SUBJECT);
        Structures.def_csetf((SubLObject)mail_message.$sym19$MSG_ADDITIONAL_HEADERS, (SubLObject)mail_message.$sym20$_CSETF_MSG_ADDITIONAL_HEADERS);
        Structures.def_csetf((SubLObject)mail_message.$sym21$MSG_HOST, (SubLObject)mail_message.$sym22$_CSETF_MSG_HOST);
        Structures.def_csetf((SubLObject)mail_message.$sym23$MSG_PORT, (SubLObject)mail_message.$sym24$_CSETF_MSG_PORT);
        Structures.def_csetf((SubLObject)mail_message.$sym25$MSG_PARTS, (SubLObject)mail_message.$sym26$_CSETF_MSG_PARTS);
        Equality.identity((SubLObject)mail_message.$sym0$MESSAGE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), mail_message.$dtp_message$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym41$VISIT_DEFSTRUCT_OBJECT_MESSAGE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)mail_message.$sym6$PRINT_MESSAGE);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), mail_message.$dtp_message$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym51$SXHASH_MESSAGE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), mail_message.$dtp_message_part$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym58$MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)mail_message.$list59);
        Structures.def_csetf((SubLObject)mail_message.$sym60$MSG_PART_CONTENT_TYPE, (SubLObject)mail_message.$sym61$_CSETF_MSG_PART_CONTENT_TYPE);
        Structures.def_csetf((SubLObject)mail_message.$sym62$MSG_PART_CONTENT_TYPE_PARAMETERS, (SubLObject)mail_message.$sym63$_CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS);
        Structures.def_csetf((SubLObject)mail_message.$sym64$MSG_PART_DISPOSITION, (SubLObject)mail_message.$sym65$_CSETF_MSG_PART_DISPOSITION);
        Structures.def_csetf((SubLObject)mail_message.$sym66$MSG_PART_CONTENT_DISPOSITION_PARAMETERS, (SubLObject)mail_message.$sym67$_CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS);
        Structures.def_csetf((SubLObject)mail_message.$sym68$MSG_PART_ENCODING, (SubLObject)mail_message.$sym69$_CSETF_MSG_PART_ENCODING);
        Structures.def_csetf((SubLObject)mail_message.$sym70$MSG_PART_DATA, (SubLObject)mail_message.$sym71$_CSETF_MSG_PART_DATA);
        Structures.def_csetf((SubLObject)mail_message.$sym72$MSG_PART_DATA_TYPE, (SubLObject)mail_message.$sym73$_CSETF_MSG_PART_DATA_TYPE);
        Equality.identity((SubLObject)mail_message.$sym52$MESSAGE_PART);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), mail_message.$dtp_message_part$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym82$VISIT_DEFSTRUCT_OBJECT_MESSAGE_PART_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)mail_message.$sym57$PRINT_MESSAGE_PART);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), mail_message.$dtp_message_part$.getGlobalValue(), Symbols.symbol_function((SubLObject)mail_message.$sym97$SXHASH_MESSAGE_PART_METHOD));
        return (SubLObject)mail_message.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_mail_message_file();
    }
    
    @Override
	public void initializeVariables() {
        init_mail_message_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_mail_message_file();
    }
    
    static {
        me = (SubLFile)new mail_message();
        mail_message.$dtp_message$ = null;
        mail_message.$dtp_message_part$ = null;
        $sym0$MESSAGE = SubLObjectFactory.makeSymbol("MESSAGE");
        $sym1$MESSAGE_P = SubLObjectFactory.makeSymbol("MESSAGE-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FROM"), SubLObjectFactory.makeSymbol("TO"), SubLObjectFactory.makeSymbol("CC"), SubLObjectFactory.makeSymbol("BCC"), SubLObjectFactory.makeSymbol("SUBJECT"), SubLObjectFactory.makeSymbol("ADDITIONAL-HEADERS"), SubLObjectFactory.makeSymbol("HOST"), SubLObjectFactory.makeSymbol("PORT"), SubLObjectFactory.makeSymbol("PARTS") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FROM"), SubLObjectFactory.makeKeyword("TO"), SubLObjectFactory.makeKeyword("CC"), SubLObjectFactory.makeKeyword("BCC"), SubLObjectFactory.makeKeyword("SUBJECT"), SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS"), SubLObjectFactory.makeKeyword("HOST"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("PARTS") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("MSG-FROM"), SubLObjectFactory.makeSymbol("MSG-TO"), SubLObjectFactory.makeSymbol("MSG-CC"), SubLObjectFactory.makeSymbol("MSG-BCC"), SubLObjectFactory.makeSymbol("MSG-SUBJECT"), SubLObjectFactory.makeSymbol("MSG-ADDITIONAL-HEADERS"), SubLObjectFactory.makeSymbol("MSG-HOST"), SubLObjectFactory.makeSymbol("MSG-PORT"), SubLObjectFactory.makeSymbol("MSG-PARTS") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-MSG-FROM"), SubLObjectFactory.makeSymbol("_CSETF-MSG-TO"), SubLObjectFactory.makeSymbol("_CSETF-MSG-CC"), SubLObjectFactory.makeSymbol("_CSETF-MSG-BCC"), SubLObjectFactory.makeSymbol("_CSETF-MSG-SUBJECT"), SubLObjectFactory.makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS"), SubLObjectFactory.makeSymbol("_CSETF-MSG-HOST"), SubLObjectFactory.makeSymbol("_CSETF-MSG-PORT"), SubLObjectFactory.makeSymbol("_CSETF-MSG-PARTS") });
        $sym6$PRINT_MESSAGE = SubLObjectFactory.makeSymbol("PRINT-MESSAGE");
        $sym7$MESSAGE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MESSAGE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-P"));
        $sym9$MSG_FROM = SubLObjectFactory.makeSymbol("MSG-FROM");
        $sym10$_CSETF_MSG_FROM = SubLObjectFactory.makeSymbol("_CSETF-MSG-FROM");
        $sym11$MSG_TO = SubLObjectFactory.makeSymbol("MSG-TO");
        $sym12$_CSETF_MSG_TO = SubLObjectFactory.makeSymbol("_CSETF-MSG-TO");
        $sym13$MSG_CC = SubLObjectFactory.makeSymbol("MSG-CC");
        $sym14$_CSETF_MSG_CC = SubLObjectFactory.makeSymbol("_CSETF-MSG-CC");
        $sym15$MSG_BCC = SubLObjectFactory.makeSymbol("MSG-BCC");
        $sym16$_CSETF_MSG_BCC = SubLObjectFactory.makeSymbol("_CSETF-MSG-BCC");
        $sym17$MSG_SUBJECT = SubLObjectFactory.makeSymbol("MSG-SUBJECT");
        $sym18$_CSETF_MSG_SUBJECT = SubLObjectFactory.makeSymbol("_CSETF-MSG-SUBJECT");
        $sym19$MSG_ADDITIONAL_HEADERS = SubLObjectFactory.makeSymbol("MSG-ADDITIONAL-HEADERS");
        $sym20$_CSETF_MSG_ADDITIONAL_HEADERS = SubLObjectFactory.makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS");
        $sym21$MSG_HOST = SubLObjectFactory.makeSymbol("MSG-HOST");
        $sym22$_CSETF_MSG_HOST = SubLObjectFactory.makeSymbol("_CSETF-MSG-HOST");
        $sym23$MSG_PORT = SubLObjectFactory.makeSymbol("MSG-PORT");
        $sym24$_CSETF_MSG_PORT = SubLObjectFactory.makeSymbol("_CSETF-MSG-PORT");
        $sym25$MSG_PARTS = SubLObjectFactory.makeSymbol("MSG-PARTS");
        $sym26$_CSETF_MSG_PARTS = SubLObjectFactory.makeSymbol("_CSETF-MSG-PARTS");
        $kw27$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw28$TO = SubLObjectFactory.makeKeyword("TO");
        $kw29$CC = SubLObjectFactory.makeKeyword("CC");
        $kw30$BCC = SubLObjectFactory.makeKeyword("BCC");
        $kw31$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw32$ADDITIONAL_HEADERS = SubLObjectFactory.makeKeyword("ADDITIONAL-HEADERS");
        $kw33$HOST = SubLObjectFactory.makeKeyword("HOST");
        $kw34$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw35$PARTS = SubLObjectFactory.makeKeyword("PARTS");
        $str36$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw37$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym38$MAKE_MESSAGE = SubLObjectFactory.makeSymbol("MAKE-MESSAGE");
        $kw39$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw40$END = SubLObjectFactory.makeKeyword("END");
        $sym41$VISIT_DEFSTRUCT_OBJECT_MESSAGE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-METHOD");
        $str42$_MESSAGE_ = SubLObjectFactory.makeString("<MESSAGE>");
        $str43$localhost = SubLObjectFactory.makeString("localhost");
        $sym44$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym45$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym46$MESSAGE_PART_P = SubLObjectFactory.makeSymbol("MESSAGE-PART-P");
        $sym47$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str48$Content_Type__multipart_mixed____ = SubLObjectFactory.makeString("Content-Type: multipart/mixed;~% boundary=~S");
        $str49$This_is_a_multi_part_message_in_M = SubLObjectFactory.makeString("This is a multi-part message in MIME format.");
        $str50$___A__ = SubLObjectFactory.makeString("--~A--");
        $sym51$SXHASH_MESSAGE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-MESSAGE-METHOD");
        $sym52$MESSAGE_PART = SubLObjectFactory.makeSymbol("MESSAGE-PART");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TYPE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("DISPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-DISPOSITION-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"), (SubLObject)SubLObjectFactory.makeSymbol("DATA-TYPE"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TYPE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("DISPOSITION"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT-DISPOSITION-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("ENCODING"), (SubLObject)SubLObjectFactory.makeKeyword("DATA"), (SubLObject)SubLObjectFactory.makeKeyword("DATA-TYPE"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-DISPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("MSG-PART-DATA-TYPE"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DISPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DATA-TYPE"));
        $sym57$PRINT_MESSAGE_PART = SubLObjectFactory.makeSymbol("PRINT-MESSAGE-PART");
        $sym58$MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MESSAGE-PART-PRINT-FUNCTION-TRAMPOLINE");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-PART-P"));
        $sym60$MSG_PART_CONTENT_TYPE = SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-TYPE");
        $sym61$_CSETF_MSG_PART_CONTENT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE");
        $sym62$MSG_PART_CONTENT_TYPE_PARAMETERS = SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS");
        $sym63$_CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS");
        $sym64$MSG_PART_DISPOSITION = SubLObjectFactory.makeSymbol("MSG-PART-DISPOSITION");
        $sym65$_CSETF_MSG_PART_DISPOSITION = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DISPOSITION");
        $sym66$MSG_PART_CONTENT_DISPOSITION_PARAMETERS = SubLObjectFactory.makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS");
        $sym67$_CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS");
        $sym68$MSG_PART_ENCODING = SubLObjectFactory.makeSymbol("MSG-PART-ENCODING");
        $sym69$_CSETF_MSG_PART_ENCODING = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-ENCODING");
        $sym70$MSG_PART_DATA = SubLObjectFactory.makeSymbol("MSG-PART-DATA");
        $sym71$_CSETF_MSG_PART_DATA = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DATA");
        $sym72$MSG_PART_DATA_TYPE = SubLObjectFactory.makeSymbol("MSG-PART-DATA-TYPE");
        $sym73$_CSETF_MSG_PART_DATA_TYPE = SubLObjectFactory.makeSymbol("_CSETF-MSG-PART-DATA-TYPE");
        $kw74$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw75$CONTENT_TYPE_PARAMETERS = SubLObjectFactory.makeKeyword("CONTENT-TYPE-PARAMETERS");
        $kw76$DISPOSITION = SubLObjectFactory.makeKeyword("DISPOSITION");
        $kw77$CONTENT_DISPOSITION_PARAMETERS = SubLObjectFactory.makeKeyword("CONTENT-DISPOSITION-PARAMETERS");
        $kw78$ENCODING = SubLObjectFactory.makeKeyword("ENCODING");
        $kw79$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw80$DATA_TYPE = SubLObjectFactory.makeKeyword("DATA-TYPE");
        $sym81$MAKE_MESSAGE_PART = SubLObjectFactory.makeSymbol("MAKE-MESSAGE-PART");
        $sym82$VISIT_DEFSTRUCT_OBJECT_MESSAGE_PART_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-PART-METHOD");
        $str83$_MESSAGE_PART___A_ = SubLObjectFactory.makeString("<MESSAGE-PART (~A)");
        $str84$_ = SubLObjectFactory.makeString(">");
        $str85$text_plain = SubLObjectFactory.makeString("text/plain");
        $str86$7bit = SubLObjectFactory.makeString("7bit");
        $sym87$VALID_MESSAGE_PART_ENCODING_P = SubLObjectFactory.makeSymbol("VALID-MESSAGE-PART-ENCODING-P");
        $str88$inline = SubLObjectFactory.makeString("inline");
        $kw89$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str90$attachment = SubLObjectFactory.makeString("attachment");
        $kw91$FILE = SubLObjectFactory.makeKeyword("FILE");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("FILE"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("7bit"), (SubLObject)SubLObjectFactory.makeString("8bit"), (SubLObject)SubLObjectFactory.makeString("binary"));
        $str94$text_ = SubLObjectFactory.makeString("text/");
        $str95$Non_text_content_types_not_implem = SubLObjectFactory.makeString("Non-text content types not implemented yet. Content type must start with text/. Not ~S");
        $kw96$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $sym97$SXHASH_MESSAGE_PART_METHOD = SubLObjectFactory.makeSymbol("SXHASH-MESSAGE-PART-METHOD");
        $str98$___A = SubLObjectFactory.makeString("--~A");
        $str99$Content_Type___A = SubLObjectFactory.makeString("Content-Type: ~A");
        $str100$Content_Transfer_Encoding___A = SubLObjectFactory.makeString("Content-Transfer-Encoding: ~A");
        $str101$Content_Disposition___A = SubLObjectFactory.makeString("Content-Disposition: ~A");
        $str102$_ = SubLObjectFactory.makeString(";");
        $str103$__A__S = SubLObjectFactory.makeString(" ~A=~S");
        $kw104$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str105$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw106$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str107$Only_know_how_to_send_textual_mes = SubLObjectFactory.makeString("Only know how to send textual message body parts.");
        $str108$This_is_a_test__Please_ignore_ = SubLObjectFactory.makeString("This is a test. Please ignore.");
        $str109$test_message = SubLObjectFactory.makeString("test message");
        $str110$Please_ignore_this_message_and_th = SubLObjectFactory.makeString("Please ignore this message and the attached file.");
    }
    
    public static final class $message_native extends SubLStructNative
    {
        public SubLObject $from;
        public SubLObject $to;
        public SubLObject $cc;
        public SubLObject $bcc;
        public SubLObject $subject;
        public SubLObject $additional_headers;
        public SubLObject $host;
        public SubLObject $port;
        public SubLObject $parts;
        private static final SubLStructDeclNative structDecl;
        
        public $message_native() {
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
            this.$cc = (SubLObject)CommonSymbols.NIL;
            this.$bcc = (SubLObject)CommonSymbols.NIL;
            this.$subject = (SubLObject)CommonSymbols.NIL;
            this.$additional_headers = (SubLObject)CommonSymbols.NIL;
            this.$host = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$parts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$message_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$from;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$to;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$cc;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$bcc;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$subject;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$additional_headers;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$host;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$port;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$parts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$from = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$to = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$cc = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$bcc = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$subject = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$additional_headers = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$host = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$port = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$parts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$message_native.class, mail_message.$sym0$MESSAGE, mail_message.$sym1$MESSAGE_P, mail_message.$list2, mail_message.$list3, new String[] { "$from", "$to", "$cc", "$bcc", "$subject", "$additional_headers", "$host", "$port", "$parts" }, mail_message.$list4, mail_message.$list5, mail_message.$sym6$PRINT_MESSAGE);
        }
    }
    
    public static final class $message_p$UnaryFunction extends UnaryFunction
    {
        public $message_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MESSAGE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return mail_message.message_p(arg1);
        }
    }
    
    public static final class $message_part_native extends SubLStructNative
    {
        public SubLObject $content_type;
        public SubLObject $content_type_parameters;
        public SubLObject $disposition;
        public SubLObject $content_disposition_parameters;
        public SubLObject $encoding;
        public SubLObject $data;
        public SubLObject $data_type;
        private static final SubLStructDeclNative structDecl;
        
        public $message_part_native() {
            this.$content_type = (SubLObject)CommonSymbols.NIL;
            this.$content_type_parameters = (SubLObject)CommonSymbols.NIL;
            this.$disposition = (SubLObject)CommonSymbols.NIL;
            this.$content_disposition_parameters = (SubLObject)CommonSymbols.NIL;
            this.$encoding = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$data_type = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$message_part_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$content_type;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$content_type_parameters;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$disposition;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$content_disposition_parameters;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$encoding;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$data;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$data_type;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$content_type = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$content_type_parameters = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$disposition = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$content_disposition_parameters = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$encoding = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$data_type = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$message_part_native.class, mail_message.$sym52$MESSAGE_PART, mail_message.$sym46$MESSAGE_PART_P, mail_message.$list53, mail_message.$list54, new String[] { "$content_type", "$content_type_parameters", "$disposition", "$content_disposition_parameters", "$encoding", "$data", "$data_type" }, mail_message.$list55, mail_message.$list56, mail_message.$sym57$PRINT_MESSAGE_PART);
        }
    }
    
    public static final class $message_part_p$UnaryFunction extends UnaryFunction
    {
        public $message_part_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MESSAGE-PART-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return mail_message.message_part_p(arg1);
        }
    }
}

/*

	Total time: 294 ms
	 synthetic 
*/