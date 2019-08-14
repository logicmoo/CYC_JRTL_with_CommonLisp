/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MAIL-MESSAGE
 * source file: /cyc/top/cycl/mail-message.lisp
 * created:     2019/07/03 17:37:12
 */
public final class mail_message extends SubLTranslatedFile implements V12 {
    public static final class $message_part_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_type;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_type_parameters;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$disposition;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_disposition_parameters;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$encoding;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$data;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$data_type;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_type = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_type_parameters = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$disposition = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$content_disposition_parameters = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$encoding = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$data = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.mail_message.$message_part_native.this.$data_type = value;
        }

        public SubLObject $content_type = Lisp.NIL;

        public SubLObject $content_type_parameters = Lisp.NIL;

        public SubLObject $disposition = Lisp.NIL;

        public SubLObject $content_disposition_parameters = Lisp.NIL;

        public SubLObject $encoding = Lisp.NIL;

        public SubLObject $data = Lisp.NIL;

        public SubLObject $data_type = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.mail_message.$message_part_native.class, MESSAGE_PART, MESSAGE_PART_P, $list_alt47, $list_alt48, new String[]{ "$content_type", "$content_type_parameters", "$disposition", "$content_disposition_parameters", "$encoding", "$data", "$data_type" }, $list_alt49, $list_alt50, PRINT_MESSAGE_PART);
    }

    public static final SubLFile me = new mail_message();

 public static final String myName = "com.cyc.cycjava.cycl.mail_message";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_message$ = makeSymbol("*DTP-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_message_part$ = makeSymbol("*DTP-MESSAGE-PART*");

    private static final SubLSymbol MESSAGE_P = makeSymbol("MESSAGE-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), makeSymbol("SUBJECT"), makeSymbol("ADDITIONAL-HEADERS"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("PARTS") });

    static private final SubLList $list3 = list(new SubLObject[]{ $FROM, makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), makeKeyword("SUBJECT"), makeKeyword("ADDITIONAL-HEADERS"), $HOST, $PORT, makeKeyword("PARTS") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("MSG-FROM"), makeSymbol("MSG-TO"), makeSymbol("MSG-CC"), makeSymbol("MSG-BCC"), makeSymbol("MSG-SUBJECT"), makeSymbol("MSG-ADDITIONAL-HEADERS"), makeSymbol("MSG-HOST"), makeSymbol("MSG-PORT"), makeSymbol("MSG-PARTS") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-MSG-FROM"), makeSymbol("_CSETF-MSG-TO"), makeSymbol("_CSETF-MSG-CC"), makeSymbol("_CSETF-MSG-BCC"), makeSymbol("_CSETF-MSG-SUBJECT"), makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS"), makeSymbol("_CSETF-MSG-HOST"), makeSymbol("_CSETF-MSG-PORT"), makeSymbol("_CSETF-MSG-PARTS") });

    private static final SubLSymbol PRINT_MESSAGE = makeSymbol("PRINT-MESSAGE");

    private static final SubLSymbol MESSAGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-P"));

    private static final SubLSymbol MSG_FROM = makeSymbol("MSG-FROM");

    private static final SubLSymbol _CSETF_MSG_FROM = makeSymbol("_CSETF-MSG-FROM");

    private static final SubLSymbol MSG_TO = makeSymbol("MSG-TO");

    private static final SubLSymbol _CSETF_MSG_TO = makeSymbol("_CSETF-MSG-TO");

    private static final SubLSymbol MSG_CC = makeSymbol("MSG-CC");

    private static final SubLSymbol _CSETF_MSG_CC = makeSymbol("_CSETF-MSG-CC");

    private static final SubLSymbol MSG_BCC = makeSymbol("MSG-BCC");

    private static final SubLSymbol _CSETF_MSG_BCC = makeSymbol("_CSETF-MSG-BCC");

    private static final SubLSymbol MSG_SUBJECT = makeSymbol("MSG-SUBJECT");

    private static final SubLSymbol _CSETF_MSG_SUBJECT = makeSymbol("_CSETF-MSG-SUBJECT");

    private static final SubLSymbol MSG_ADDITIONAL_HEADERS = makeSymbol("MSG-ADDITIONAL-HEADERS");

    private static final SubLSymbol _CSETF_MSG_ADDITIONAL_HEADERS = makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS");

    private static final SubLSymbol MSG_HOST = makeSymbol("MSG-HOST");

    private static final SubLSymbol _CSETF_MSG_HOST = makeSymbol("_CSETF-MSG-HOST");

    private static final SubLSymbol MSG_PORT = makeSymbol("MSG-PORT");

    private static final SubLSymbol _CSETF_MSG_PORT = makeSymbol("_CSETF-MSG-PORT");

    private static final SubLSymbol MSG_PARTS = makeSymbol("MSG-PARTS");

    private static final SubLSymbol _CSETF_MSG_PARTS = makeSymbol("_CSETF-MSG-PARTS");

    private static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_MESSAGE = makeSymbol("MAKE-MESSAGE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-METHOD");

    private static final SubLString $str42$_MESSAGE_ = makeString("<MESSAGE>");

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLSymbol MESSAGE_PART_P = makeSymbol("MESSAGE-PART-P");

    private static final SubLString $str48$Content_Type__multipart_mixed____ = makeString("Content-Type: multipart/mixed;~% boundary=~S");

    private static final SubLString $str49$This_is_a_multi_part_message_in_M = makeString("This is a multi-part message in MIME format.");

    private static final SubLString $str50$___A__ = makeString("--~A--");

    private static final SubLSymbol SXHASH_MESSAGE_METHOD = makeSymbol("SXHASH-MESSAGE-METHOD");

    private static final SubLSymbol MESSAGE_PART = makeSymbol("MESSAGE-PART");

    private static final SubLList $list53 = list(makeSymbol("CONTENT-TYPE"), makeSymbol("CONTENT-TYPE-PARAMETERS"), makeSymbol("DISPOSITION"), makeSymbol("CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("ENCODING"), makeSymbol("DATA"), makeSymbol("DATA-TYPE"));

    private static final SubLList $list54 = list(makeKeyword("CONTENT-TYPE"), makeKeyword("CONTENT-TYPE-PARAMETERS"), makeKeyword("DISPOSITION"), makeKeyword("CONTENT-DISPOSITION-PARAMETERS"), makeKeyword("ENCODING"), $DATA, makeKeyword("DATA-TYPE"));

    private static final SubLList $list55 = list(makeSymbol("MSG-PART-CONTENT-TYPE"), makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("MSG-PART-DISPOSITION"), makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("MSG-PART-ENCODING"), makeSymbol("MSG-PART-DATA"), makeSymbol("MSG-PART-DATA-TYPE"));

    private static final SubLList $list56 = list(makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE"), makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-DISPOSITION"), makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-ENCODING"), makeSymbol("_CSETF-MSG-PART-DATA"), makeSymbol("_CSETF-MSG-PART-DATA-TYPE"));

    private static final SubLSymbol PRINT_MESSAGE_PART = makeSymbol("PRINT-MESSAGE-PART");

    private static final SubLSymbol MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-PART-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list59 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-PART-P"));

    private static final SubLSymbol MSG_PART_CONTENT_TYPE = makeSymbol("MSG-PART-CONTENT-TYPE");

    private static final SubLSymbol _CSETF_MSG_PART_CONTENT_TYPE = makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE");

    private static final SubLSymbol MSG_PART_CONTENT_TYPE_PARAMETERS = makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS");

    private static final SubLSymbol _CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS = makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS");

    private static final SubLSymbol MSG_PART_DISPOSITION = makeSymbol("MSG-PART-DISPOSITION");

    private static final SubLSymbol _CSETF_MSG_PART_DISPOSITION = makeSymbol("_CSETF-MSG-PART-DISPOSITION");

    private static final SubLSymbol MSG_PART_CONTENT_DISPOSITION_PARAMETERS = makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS");

    private static final SubLSymbol _CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS = makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS");

    private static final SubLSymbol MSG_PART_ENCODING = makeSymbol("MSG-PART-ENCODING");

    private static final SubLSymbol _CSETF_MSG_PART_ENCODING = makeSymbol("_CSETF-MSG-PART-ENCODING");

    private static final SubLSymbol MSG_PART_DATA = makeSymbol("MSG-PART-DATA");

    private static final SubLSymbol _CSETF_MSG_PART_DATA = makeSymbol("_CSETF-MSG-PART-DATA");

    private static final SubLSymbol MSG_PART_DATA_TYPE = makeSymbol("MSG-PART-DATA-TYPE");

    private static final SubLSymbol _CSETF_MSG_PART_DATA_TYPE = makeSymbol("_CSETF-MSG-PART-DATA-TYPE");

    private static final SubLSymbol $CONTENT_TYPE_PARAMETERS = makeKeyword("CONTENT-TYPE-PARAMETERS");

    private static final SubLSymbol $CONTENT_DISPOSITION_PARAMETERS = makeKeyword("CONTENT-DISPOSITION-PARAMETERS");

    private static final SubLSymbol MAKE_MESSAGE_PART = makeSymbol("MAKE-MESSAGE-PART");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_PART_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-PART-METHOD");

    private static final SubLString $str83$_MESSAGE_PART___A_ = makeString("<MESSAGE-PART (~A)");

    private static final SubLString $str84$_ = makeString(">");

    private static final SubLString $str85$text_plain = makeString("text/plain");

    private static final SubLString $$$7bit = makeString("7bit");

    private static final SubLSymbol VALID_MESSAGE_PART_ENCODING_P = makeSymbol("VALID-MESSAGE-PART-ENCODING-P");

    private static final SubLString $$$inline = makeString("inline");

    private static final SubLString $$$attachment = makeString("attachment");

    private static final SubLList $list92 = list(makeKeyword("STRING"), $FILE);

    private static final SubLList $list93 = list(makeString("7bit"), makeString("8bit"), makeString("binary"));

    private static final SubLString $str94$text_ = makeString("text/");

    private static final SubLString $str95$Non_text_content_types_not_implem = makeString("Non-text content types not implemented yet. Content type must start with text/. Not ~S");

    private static final SubLSymbol SXHASH_MESSAGE_PART_METHOD = makeSymbol("SXHASH-MESSAGE-PART-METHOD");

    private static final SubLString $str98$___A = makeString("--~A");

    private static final SubLString $str99$Content_Type___A = makeString("Content-Type: ~A");

    private static final SubLString $str100$Content_Transfer_Encoding___A = makeString("Content-Transfer-Encoding: ~A");

    private static final SubLString $str101$Content_Disposition___A = makeString("Content-Disposition: ~A");

    private static final SubLString $str102$_ = makeString(";");

    private static final SubLString $str103$__A__S = makeString(" ~A=~S");

    private static final SubLString $str105$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str107$Only_know_how_to_send_textual_mes = makeString("Only know how to send textual message body parts.");

    private static final SubLString $str108$This_is_a_test__Please_ignore_ = makeString("This is a test. Please ignore.");

    private static final SubLString $$$test_message = makeString("test message");

    private static final SubLString $str110$Please_ignore_this_message_and_th = makeString("Please ignore this message and the attached file.");

    public static final SubLObject message_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_message(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject message_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.mail_message.$message_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject message_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.mail_message.$message_native.class ? T : NIL;
    }

    public static final SubLObject msg_from_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField2();
    }

    public static SubLObject msg_from(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject msg_to_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField3();
    }

    public static SubLObject msg_to(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject msg_cc_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField4();
    }

    public static SubLObject msg_cc(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject msg_bcc_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField5();
    }

    public static SubLObject msg_bcc(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject msg_subject_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField6();
    }

    public static SubLObject msg_subject(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject msg_additional_headers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField7();
    }

    public static SubLObject msg_additional_headers(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject msg_host_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField8();
    }

    public static SubLObject msg_host(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject msg_port_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField9();
    }

    public static SubLObject msg_port(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject msg_parts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.getField10();
    }

    public static SubLObject msg_parts(final SubLObject v_object) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_msg_from_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_msg_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_msg_to_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_msg_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_msg_cc_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_msg_cc(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_msg_bcc_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_msg_bcc(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_msg_subject_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_msg_subject(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_msg_additional_headers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_msg_additional_headers(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_msg_host_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_msg_host(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_msg_port_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_msg_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_msg_parts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_msg_parts(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_p(v_object) : "! mail_message.message_p(v_object) " + "mail_message.message_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_message_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.mail_message.$message_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FROM)) {
                        _csetf_msg_from(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TO)) {
                            _csetf_msg_to(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CC)) {
                                _csetf_msg_cc(v_new, current_value);
                            } else {
                                if (pcase_var.eql($BCC)) {
                                    _csetf_msg_bcc(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SUBJECT)) {
                                        _csetf_msg_subject(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ADDITIONAL_HEADERS)) {
                                            _csetf_msg_additional_headers(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($HOST)) {
                                                _csetf_msg_host(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PORT)) {
                                                    _csetf_msg_port(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($PARTS)) {
                                                        _csetf_msg_parts(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt35$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_message(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.mail_message.$message_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FROM)) {
                _csetf_msg_from(v_new, current_value);
            } else
                if (pcase_var.eql($TO)) {
                    _csetf_msg_to(v_new, current_value);
                } else
                    if (pcase_var.eql($CC)) {
                        _csetf_msg_cc(v_new, current_value);
                    } else
                        if (pcase_var.eql($BCC)) {
                            _csetf_msg_bcc(v_new, current_value);
                        } else
                            if (pcase_var.eql($SUBJECT)) {
                                _csetf_msg_subject(v_new, current_value);
                            } else
                                if (pcase_var.eql($ADDITIONAL_HEADERS)) {
                                    _csetf_msg_additional_headers(v_new, current_value);
                                } else
                                    if (pcase_var.eql($HOST)) {
                                        _csetf_msg_host(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PORT)) {
                                            _csetf_msg_port(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PARTS)) {
                                                _csetf_msg_parts(v_new, current_value);
                                            } else {
                                                Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MESSAGE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FROM, msg_from(obj));
        funcall(visitor_fn, obj, $SLOT, $TO, msg_to(obj));
        funcall(visitor_fn, obj, $SLOT, $CC, msg_cc(obj));
        funcall(visitor_fn, obj, $SLOT, $BCC, msg_bcc(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBJECT, msg_subject(obj));
        funcall(visitor_fn, obj, $SLOT, $ADDITIONAL_HEADERS, msg_additional_headers(obj));
        funcall(visitor_fn, obj, $SLOT, $HOST, msg_host(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, msg_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PARTS, msg_parts(obj));
        funcall(visitor_fn, obj, $END, MAKE_MESSAGE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message(obj, visitor_fn);
    }

    public static final SubLObject print_message_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt36$_MESSAGE_);
        return v_object;
    }

    public static SubLObject print_message(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str42$_MESSAGE_);
        return v_object;
    }

    /**
     * Construct a new mail message object.
     *
     * @param FROM
     * 		stringp -- email address of sender
     * @param TO
     * 		stringp -- email address of primary recipient
     * @param SUBJECT
     * 		stringp -- message subject line
     * @param MESSAGE-STRING
     * 		-- message content as plain-text string
     * @param HOST
     * 		stringp -- SMTP server machine name
     * @param PORT
     * 		integerp -- SMTP port number
     */
    @LispMethod(comment = "Construct a new mail message object.\r\n\r\n@param FROM\r\n\t\tstringp -- email address of sender\r\n@param TO\r\n\t\tstringp -- email address of primary recipient\r\n@param SUBJECT\r\n\t\tstringp -- message subject line\r\n@param MESSAGE-STRING\r\n\t\t-- message content as plain-text string\r\n@param HOST\r\n\t\tstringp -- SMTP server machine name\r\n@param PORT\r\n\t\tintegerp -- SMTP port number")
    public static final SubLObject new_message_alt(SubLObject from, SubLObject to, SubLObject subject, SubLObject message_string, SubLObject host, SubLObject port) {
        if (from == UNPROVIDED) {
            from = NIL;
        }
        if (to == UNPROVIDED) {
            to = NIL;
        }
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (message_string == UNPROVIDED) {
            message_string = NIL;
        }
        if (host == UNPROVIDED) {
            host = $$$localhost;
        }
        if (port == UNPROVIDED) {
            port = mail_utilities.$smtp_port$.getGlobalValue();
        }
        if (NIL != from) {
            SubLTrampolineFile.checkType(from, STRINGP);
        }
        if (NIL != to) {
            SubLTrampolineFile.checkType(to, STRINGP);
        }
        if (NIL != subject) {
            SubLTrampolineFile.checkType(subject, STRINGP);
        }
        if (NIL != message_string) {
            SubLTrampolineFile.checkType(message_string, STRINGP);
        }
        SubLTrampolineFile.checkType(host, STRINGP);
        SubLTrampolineFile.checkType(port, INTEGERP);
        {
            SubLObject message = make_message(UNPROVIDED);
            _csetf_msg_from(message, from);
            _csetf_msg_to(message, NIL != to ? ((SubLObject) (list(to))) : NIL);
            _csetf_msg_cc(message, NIL);
            _csetf_msg_bcc(message, NIL);
            _csetf_msg_subject(message, subject);
            _csetf_msg_host(message, host);
            _csetf_msg_port(message, port);
            _csetf_msg_parts(message, NIL != message_string ? ((SubLObject) (list(new_inline_message_part(message_string, UNPROVIDED, UNPROVIDED)))) : NIL);
            return message;
        }
    }

    /**
     * Construct a new mail message object.
     *
     * @param FROM
     * 		stringp -- email address of sender
     * @param TO
     * 		stringp -- email address of primary recipient
     * @param SUBJECT
     * 		stringp -- message subject line
     * @param MESSAGE-STRING
     * 		-- message content as plain-text string
     * @param HOST
     * 		stringp -- SMTP server machine name
     * @param PORT
     * 		integerp -- SMTP port number
     */
    @LispMethod(comment = "Construct a new mail message object.\r\n\r\n@param FROM\r\n\t\tstringp -- email address of sender\r\n@param TO\r\n\t\tstringp -- email address of primary recipient\r\n@param SUBJECT\r\n\t\tstringp -- message subject line\r\n@param MESSAGE-STRING\r\n\t\t-- message content as plain-text string\r\n@param HOST\r\n\t\tstringp -- SMTP server machine name\r\n@param PORT\r\n\t\tintegerp -- SMTP port number")
    public static SubLObject new_message(SubLObject from, SubLObject to, SubLObject subject, SubLObject message_string, SubLObject host, SubLObject port) {
        if (from == UNPROVIDED) {
            from = NIL;
        }
        if (to == UNPROVIDED) {
            to = NIL;
        }
        if (subject == UNPROVIDED) {
            subject = NIL;
        }
        if (message_string == UNPROVIDED) {
            message_string = NIL;
        }
        if (host == UNPROVIDED) {
            host = $$$localhost;
        }
        if (port == UNPROVIDED) {
            port = mail_utilities.$smtp_port$.getGlobalValue();
        }
        if (((NIL != from) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(from))) {
            throw new AssertionError(from);
        }
        if (((NIL != to) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(to))) {
            throw new AssertionError(to);
        }
        if (((NIL != subject) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(subject))) {
            throw new AssertionError(subject);
        }
        if (((NIL != message_string) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(message_string))) {
            throw new AssertionError(message_string);
        }
        assert NIL != stringp(host) : "! stringp(host) " + ("Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) ") + host;
        assert NIL != integerp(port) : "! integerp(port) " + ("Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) ") + port;
        final SubLObject message = make_message(UNPROVIDED);
        _csetf_msg_from(message, from);
        _csetf_msg_to(message, NIL != to ? list(to) : NIL);
        _csetf_msg_cc(message, NIL);
        _csetf_msg_bcc(message, NIL);
        _csetf_msg_subject(message, subject);
        _csetf_msg_host(message, host);
        _csetf_msg_port(message, port);
        _csetf_msg_parts(message, NIL != message_string ? list(new_inline_message_part(message_string, UNPROVIDED, UNPROVIDED)) : NIL);
        return message;
    }

    public static final SubLObject message_set_from_alt(SubLObject message, SubLObject from) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(from, STRINGP);
        _csetf_msg_from(message, from);
        return message;
    }

    public static SubLObject message_set_from(final SubLObject message, final SubLObject from) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(from) : "! stringp(from) " + ("Types.stringp(from) " + "CommonSymbols.NIL != Types.stringp(from) ") + from;
        _csetf_msg_from(message, from);
        return message;
    }

    public static final SubLObject message_from_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_from(message);
    }

    public static SubLObject message_from(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_from(message);
    }

    public static final SubLObject message_add_to_alt(SubLObject message, SubLObject to) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(to, STRINGP);
        {
            SubLObject item_var = to;
            if (NIL == member(item_var, msg_to(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                _csetf_msg_to(message, cons(item_var, msg_to(message)));
            }
        }
        return message;
    }

    public static SubLObject message_add_to(final SubLObject message, final SubLObject to) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(to) : "! stringp(to) " + ("Types.stringp(to) " + "CommonSymbols.NIL != Types.stringp(to) ") + to;
        if (NIL == member(to, msg_to(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
            _csetf_msg_to(message, cons(to, msg_to(message)));
        }
        return message;
    }

    public static final SubLObject message_to_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_to(message);
    }

    public static SubLObject message_to(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_to(message);
    }

    public static final SubLObject message_add_cc_alt(SubLObject message, SubLObject cc) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(cc, STRINGP);
        {
            SubLObject item_var = cc;
            if (NIL == member(item_var, msg_cc(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                _csetf_msg_cc(message, cons(item_var, msg_cc(message)));
            }
        }
        return message;
    }

    public static SubLObject message_add_cc(final SubLObject message, final SubLObject cc) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(cc) : "! stringp(cc) " + ("Types.stringp(cc) " + "CommonSymbols.NIL != Types.stringp(cc) ") + cc;
        if (NIL == member(cc, msg_cc(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
            _csetf_msg_cc(message, cons(cc, msg_cc(message)));
        }
        return message;
    }

    public static final SubLObject message_cc_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_cc(message);
    }

    public static SubLObject message_cc(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_cc(message);
    }

    public static final SubLObject message_add_bcc_alt(SubLObject message, SubLObject bcc) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(bcc, STRINGP);
        {
            SubLObject item_var = bcc;
            if (NIL == member(item_var, msg_bcc(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                _csetf_msg_bcc(message, cons(item_var, msg_bcc(message)));
            }
        }
        return message;
    }

    public static SubLObject message_add_bcc(final SubLObject message, final SubLObject bcc) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(bcc) : "! stringp(bcc) " + ("Types.stringp(bcc) " + "CommonSymbols.NIL != Types.stringp(bcc) ") + bcc;
        if (NIL == member(bcc, msg_bcc(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
            _csetf_msg_bcc(message, cons(bcc, msg_bcc(message)));
        }
        return message;
    }

    public static final SubLObject message_bcc_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_bcc(message);
    }

    public static SubLObject message_bcc(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_bcc(message);
    }

    public static final SubLObject message_set_subject_alt(SubLObject message, SubLObject subject) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(subject, STRINGP);
        _csetf_msg_subject(message, subject);
        return message;
    }

    public static SubLObject message_set_subject(final SubLObject message, final SubLObject subject) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(subject) : "! stringp(subject) " + ("Types.stringp(subject) " + "CommonSymbols.NIL != Types.stringp(subject) ") + subject;
        _csetf_msg_subject(message, subject);
        return message;
    }

    public static final SubLObject message_subject_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_subject(message);
    }

    public static SubLObject message_subject(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_subject(message);
    }

    /**
     * Add an additional header to MESSAGE.
     *
     * @param HEADER
     * 		stringp -- valid email header, e.g. 'Content-Type: text/html;'
     */
    @LispMethod(comment = "Add an additional header to MESSAGE.\r\n\r\n@param HEADER\r\n\t\tstringp -- valid email header, e.g. \'Content-Type: text/html;\'")
    public static final SubLObject message_add_header_alt(SubLObject message, SubLObject header) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(header, STRINGP);
        {
            SubLObject item_var = header;
            if (NIL == member(item_var, msg_additional_headers(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                _csetf_msg_additional_headers(message, cons(item_var, msg_additional_headers(message)));
            }
        }
        return message;
    }

    /**
     * Add an additional header to MESSAGE.
     *
     * @param HEADER
     * 		stringp -- valid email header, e.g. 'Content-Type: text/html;'
     */
    @LispMethod(comment = "Add an additional header to MESSAGE.\r\n\r\n@param HEADER\r\n\t\tstringp -- valid email header, e.g. \'Content-Type: text/html;\'")
    public static SubLObject message_add_header(final SubLObject message, final SubLObject header) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(header) : "! stringp(header) " + ("Types.stringp(header) " + "CommonSymbols.NIL != Types.stringp(header) ") + header;
        if (NIL == member(header, msg_additional_headers(message), symbol_function(EQUALP), symbol_function(IDENTITY))) {
            _csetf_msg_additional_headers(message, cons(header, msg_additional_headers(message)));
        }
        return message;
    }

    public static final SubLObject message_additional_headers_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_additional_headers(message);
    }

    public static SubLObject message_additional_headers(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_additional_headers(message);
    }

    public static final SubLObject message_set_host_alt(SubLObject message, SubLObject host) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(host, STRINGP);
        _csetf_msg_host(message, host);
        return message;
    }

    public static SubLObject message_set_host(final SubLObject message, final SubLObject host) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != stringp(host) : "! stringp(host) " + ("Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) ") + host;
        _csetf_msg_host(message, host);
        return message;
    }

    public static final SubLObject message_host_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_host(message);
    }

    public static SubLObject message_host(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_host(message);
    }

    public static final SubLObject message_set_port_alt(SubLObject message, SubLObject port) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(port, INTEGERP);
        _csetf_msg_port(message, port);
        return message;
    }

    public static SubLObject message_set_port(final SubLObject message, final SubLObject port) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != integerp(port) : "! integerp(port) " + ("Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) ") + port;
        _csetf_msg_port(message, port);
        return message;
    }

    public static final SubLObject message_port_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_port(message);
    }

    public static SubLObject message_port(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_port(message);
    }

    public static final SubLObject message_add_part_alt(SubLObject message, SubLObject part) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        SubLTrampolineFile.checkType(part, MESSAGE_PART_P);
        _csetf_msg_parts(message, list_utilities.add_to_end(part, msg_parts(message)));
        return message;
    }

    public static SubLObject message_add_part(final SubLObject message, final SubLObject part) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        assert NIL != message_part_p(part) : "! mail_message.message_part_p(part) " + ("mail_message.message_part_p(part) " + "CommonSymbols.NIL != mail_message.message_part_p(part) ") + part;
        _csetf_msg_parts(message, list_utilities.add_to_end(part, msg_parts(message)));
        return message;
    }

    public static final SubLObject message_parts_alt(SubLObject message) {
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        return msg_parts(message);
    }

    public static SubLObject message_parts(final SubLObject message) {
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        return msg_parts(message);
    }

    /**
     * Send MESSAGE.
     */
    @LispMethod(comment = "Send MESSAGE.")
    public static final SubLObject send_message_alt(SubLObject message, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(message, MESSAGE_P);
        validate_message(message);
        return send_message_internal(message, timeout);
    }

    /**
     * Send MESSAGE.
     */
    @LispMethod(comment = "Send MESSAGE.")
    public static SubLObject send_message(final SubLObject message, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = TEN_INTEGER;
        }
        assert NIL != message_p(message) : "! mail_message.message_p(message) " + ("mail_message.message_p(message) " + "CommonSymbols.NIL != mail_message.message_p(message) ") + message;
        validate_message(message);
        return send_message_internal(message, timeout);
    }

    /**
     * Transmits the body of a multi-part message over SMPT-STREAM.
     */
    @LispMethod(comment = "Transmits the body of a multi-part message over SMPT-STREAM.")
    public static final SubLObject send_message_parts_alt(SubLObject parts, SubLObject smpt_stream) {
        {
            SubLObject list_var = parts;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, MESSAGE_PART_P);
                }
            }
        }
        {
            SubLObject boundary = Guids.guid_to_string(Guids.new_guid());
            format(smpt_stream, $str_alt42$Content_Type__multipart_mixed____, boundary);
            string_utilities.network_terpri(smpt_stream);
            string_utilities.network_terpri(smpt_stream);
            princ($str_alt43$This_is_a_multi_part_message_in_M, smpt_stream);
            {
                SubLObject cdolist_list_var = parts;
                SubLObject part = NIL;
                for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                    send_message_part(part, smpt_stream, boundary);
                }
            }
            string_utilities.network_terpri(smpt_stream);
            format(smpt_stream, $str_alt44$___A__, boundary);
        }
        return NIL;
    }

    /**
     * Transmits the body of a multi-part message over SMPT-STREAM.
     */
    @LispMethod(comment = "Transmits the body of a multi-part message over SMPT-STREAM.")
    public static SubLObject send_message_parts(final SubLObject parts, final SubLObject smpt_stream) {
        assert NIL != list_utilities.non_dotted_list_p(parts) : "! list_utilities.non_dotted_list_p(parts) " + ("list_utilities.non_dotted_list_p(parts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(parts) ") + parts;
        SubLObject cdolist_list_var = parts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != message_part_p(elem) : "! mail_message.message_part_p(elem) " + ("mail_message.message_part_p(elem) " + "CommonSymbols.NIL != mail_message.message_part_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject boundary = Guids.guid_to_string(Guids.new_guid());
        format(smpt_stream, $str48$Content_Type__multipart_mixed____, boundary);
        string_utilities.network_terpri(smpt_stream);
        string_utilities.network_terpri(smpt_stream);
        princ($str49$This_is_a_multi_part_message_in_M, smpt_stream);
        cdolist_list_var = parts;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            send_message_part(part, smpt_stream, boundary);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str50$___A__, boundary);
        return NIL;
    }

    public static final SubLObject sxhash_message_method_alt(SubLObject v_object) {
        return sxhash_message(v_object);
    }

    public static SubLObject sxhash_message_method(final SubLObject v_object) {
        return sxhash_message(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_message_alt(SubLObject message) {
        return Sxhash.sxhash(msg_from(message));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_message(final SubLObject message) {
        return Sxhash.sxhash(msg_from(message));
    }

    /**
     * Check whether message looks sendable.
     */
    @LispMethod(comment = "Check whether message looks sendable.")
    public static final SubLObject validate_message_alt(SubLObject message) {
        {
            SubLObject sendableP = T;
            SubLObject problem_message = NIL;
            return values(sendableP, problem_message);
        }
    }

    /**
     * Check whether message looks sendable.
     */
    @LispMethod(comment = "Check whether message looks sendable.")
    public static SubLObject validate_message(final SubLObject message) {
        final SubLObject sendableP = T;
        final SubLObject problem_message = NIL;
        return values(sendableP, problem_message);
    }

    public static final SubLObject send_message_internal_alt(SubLObject message, SubLObject timeout) {
        return mail_utilities.mail_message(message_from(message), message_to(message), message_parts(message), message_subject(message), message_host(message), message_additional_headers(message), message_port(message), timeout, message_cc(message), message_bcc(message));
    }

    public static SubLObject send_message_internal(final SubLObject message, final SubLObject timeout) {
        return mail_utilities.mail_message(message_from(message), message_to(message), message_parts(message), message_subject(message), message_host(message), message_additional_headers(message), message_port(message), timeout, message_cc(message), message_bcc(message));
    }

    public static final SubLObject message_part_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_message_part(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_part_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message_part(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject message_part_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.mail_message.$message_part_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject message_part_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.mail_message.$message_part_native.class ? T : NIL;
    }

    public static final SubLObject msg_part_content_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField2();
    }

    public static SubLObject msg_part_content_type(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject msg_part_content_type_parameters_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField3();
    }

    public static SubLObject msg_part_content_type_parameters(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject msg_part_disposition_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField4();
    }

    public static SubLObject msg_part_disposition(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject msg_part_content_disposition_parameters_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField5();
    }

    public static SubLObject msg_part_content_disposition_parameters(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject msg_part_encoding_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField6();
    }

    public static SubLObject msg_part_encoding(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject msg_part_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField7();
    }

    public static SubLObject msg_part_data(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject msg_part_data_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.getField8();
    }

    public static SubLObject msg_part_data_type(final SubLObject v_object) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_msg_part_content_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_msg_part_content_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_msg_part_content_type_parameters_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_msg_part_content_type_parameters(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_msg_part_disposition_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_msg_part_disposition(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_msg_part_content_disposition_parameters_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_msg_part_content_disposition_parameters(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_msg_part_encoding_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_msg_part_encoding(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_msg_part_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_msg_part_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_msg_part_data_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_PART_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_msg_part_data_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_part_p(v_object) : "! mail_message.message_part_p(v_object) " + "mail_message.message_part_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_message_part_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.mail_message.$message_part_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CONTENT_TYPE)) {
                        _csetf_msg_part_content_type(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CONTENT_TYPE_PARAMETERS)) {
                            _csetf_msg_part_content_type_parameters(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DISPOSITION)) {
                                _csetf_msg_part_disposition(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CONTENT_DISPOSITION_PARAMETERS)) {
                                    _csetf_msg_part_content_disposition_parameters(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ENCODING)) {
                                        _csetf_msg_part_encoding(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DATA)) {
                                            _csetf_msg_part_data(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($DATA_TYPE)) {
                                                _csetf_msg_part_data_type(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt35$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_message_part(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.mail_message.$message_part_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONTENT_TYPE)) {
                _csetf_msg_part_content_type(v_new, current_value);
            } else
                if (pcase_var.eql($CONTENT_TYPE_PARAMETERS)) {
                    _csetf_msg_part_content_type_parameters(v_new, current_value);
                } else
                    if (pcase_var.eql($DISPOSITION)) {
                        _csetf_msg_part_disposition(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONTENT_DISPOSITION_PARAMETERS)) {
                            _csetf_msg_part_content_disposition_parameters(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENCODING)) {
                                _csetf_msg_part_encoding(v_new, current_value);
                            } else
                                if (pcase_var.eql($DATA)) {
                                    _csetf_msg_part_data(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DATA_TYPE)) {
                                        _csetf_msg_part_data_type(v_new, current_value);
                                    } else {
                                        Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message_part(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MESSAGE_PART, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONTENT_TYPE, msg_part_content_type(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENT_TYPE_PARAMETERS, msg_part_content_type_parameters(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPOSITION, msg_part_disposition(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENT_DISPOSITION_PARAMETERS, msg_part_content_disposition_parameters(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING, msg_part_encoding(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, msg_part_data(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA_TYPE, msg_part_data_type(obj));
        funcall(visitor_fn, obj, $END, MAKE_MESSAGE_PART, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_part_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_part(obj, visitor_fn);
    }

    public static final SubLObject print_message_part_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt74$_MESSAGE_PART___A_, message_part_disposition(v_object));
        format(stream, $str_alt75$_);
        return v_object;
    }

    public static SubLObject print_message_part(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str83$_MESSAGE_PART___A_, message_part_disposition(v_object));
        format(stream, $str84$_);
        return v_object;
    }

    public static final SubLObject new_inline_message_part_alt(SubLObject data, SubLObject content_type, SubLObject encoding) {
        if (content_type == UNPROVIDED) {
            content_type = $str_alt76$text_plain;
        }
        if (encoding == UNPROVIDED) {
            encoding = $$$7bit;
        }
        SubLTrampolineFile.checkType(data, STRINGP);
        SubLTrampolineFile.checkType(content_type, STRINGP);
        SubLTrampolineFile.checkType(encoding, VALID_MESSAGE_PART_ENCODING_P);
        return new_message_part(content_type, $$$inline, encoding, data, $STRING);
    }

    public static SubLObject new_inline_message_part(final SubLObject data, SubLObject content_type, SubLObject encoding) {
        if (content_type == UNPROVIDED) {
            content_type = $str85$text_plain;
        }
        if (encoding == UNPROVIDED) {
            encoding = $$$7bit;
        }
        assert NIL != stringp(data) : "! stringp(data) " + ("Types.stringp(data) " + "CommonSymbols.NIL != Types.stringp(data) ") + data;
        assert NIL != stringp(content_type) : "! stringp(content_type) " + ("Types.stringp(content_type) " + "CommonSymbols.NIL != Types.stringp(content_type) ") + content_type;
        assert NIL != valid_message_part_encoding_p(encoding) : "! mail_message.valid_message_part_encoding_p(encoding) " + ("mail_message.valid_message_part_encoding_p(encoding) " + "CommonSymbols.NIL != mail_message.valid_message_part_encoding_p(encoding) ") + encoding;
        return new_message_part(content_type, $$$inline, encoding, data, $STRING);
    }

    public static final SubLObject new_message_attachment_alt(SubLObject file, SubLObject content_type, SubLObject name, SubLObject encoding) {
        if (content_type == UNPROVIDED) {
            content_type = $str_alt76$text_plain;
        }
        if (name == UNPROVIDED) {
            name = file_utilities.pathstring_filename(file);
        }
        if (encoding == UNPROVIDED) {
            encoding = $$$7bit;
        }
        SubLTrampolineFile.checkType(file, STRINGP);
        SubLTrampolineFile.checkType(content_type, STRINGP);
        SubLTrampolineFile.checkType(encoding, VALID_MESSAGE_PART_ENCODING_P);
        {
            SubLObject message_part = new_message_part(content_type, $$$attachment, encoding, file, $FILE);
            message_part_set_attachment_name(message_part, name);
            return message_part;
        }
    }

    public static SubLObject new_message_attachment(final SubLObject file, SubLObject content_type, SubLObject name, SubLObject encoding) {
        if (content_type == UNPROVIDED) {
            content_type = $str85$text_plain;
        }
        if (name == UNPROVIDED) {
            name = file_utilities.pathstring_filename(file);
        }
        if (encoding == UNPROVIDED) {
            encoding = $$$7bit;
        }
        assert NIL != stringp(file) : "! stringp(file) " + ("Types.stringp(file) " + "CommonSymbols.NIL != Types.stringp(file) ") + file;
        assert NIL != stringp(content_type) : "! stringp(content_type) " + ("Types.stringp(content_type) " + "CommonSymbols.NIL != Types.stringp(content_type) ") + content_type;
        assert NIL != valid_message_part_encoding_p(encoding) : "! mail_message.valid_message_part_encoding_p(encoding) " + ("mail_message.valid_message_part_encoding_p(encoding) " + "CommonSymbols.NIL != mail_message.valid_message_part_encoding_p(encoding) ") + encoding;
        final SubLObject message_part = new_message_part(content_type, $$$attachment, encoding, file, $FILE);
        message_part_set_attachment_name(message_part, name);
        return message_part;
    }

    public static final SubLObject valid_message_part_data_type_p_alt(SubLObject obj) {
        return makeBoolean(obj.isKeyword() && (NIL != member(obj, $list_alt83, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_message_part_data_type_p(final SubLObject obj) {
        return makeBoolean(obj.isKeyword() && (NIL != member(obj, $list92, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject valid_message_part_encoding_p_alt(SubLObject obj) {
        return makeBoolean(obj.isString() && (NIL != member(obj, $list_alt84, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static SubLObject valid_message_part_encoding_p(final SubLObject obj) {
        return makeBoolean(obj.isString() && (NIL != member(obj, $list93, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject new_message_part_alt(SubLObject content_type, SubLObject disposition, SubLObject encoding, SubLObject data, SubLObject data_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == string_utilities.starts_with(content_type, $str_alt85$text_)) {
                    Errors.error($str_alt86$Non_text_content_types_not_implem, content_type);
                }
            }
            {
                SubLObject message_part = make_message_part(UNPROVIDED);
                _csetf_msg_part_content_type(message_part, content_type);
                _csetf_msg_part_content_type_parameters(message_part, NIL);
                _csetf_msg_part_disposition(message_part, disposition);
                _csetf_msg_part_content_disposition_parameters(message_part, NIL);
                _csetf_msg_part_encoding(message_part, encoding);
                _csetf_msg_part_data(message_part, data);
                _csetf_msg_part_data_type(message_part, data_type);
                return message_part;
            }
        }
    }

    public static SubLObject new_message_part(final SubLObject content_type, final SubLObject disposition, final SubLObject encoding, final SubLObject data, final SubLObject data_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == string_utilities.starts_with(content_type, $str94$text_))) {
            Errors.error($str95$Non_text_content_types_not_implem, content_type);
        }
        final SubLObject message_part = make_message_part(UNPROVIDED);
        _csetf_msg_part_content_type(message_part, content_type);
        _csetf_msg_part_content_type_parameters(message_part, NIL);
        _csetf_msg_part_disposition(message_part, disposition);
        _csetf_msg_part_content_disposition_parameters(message_part, NIL);
        _csetf_msg_part_encoding(message_part, encoding);
        _csetf_msg_part_data(message_part, data);
        _csetf_msg_part_data_type(message_part, data_type);
        return message_part;
    }

    public static final SubLObject message_part_content_type_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_content_type(message_part);
    }

    public static SubLObject message_part_content_type(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_content_type(message_part);
    }

    public static final SubLObject message_part_set_content_type_alt(SubLObject message_part, SubLObject content_type) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        SubLTrampolineFile.checkType(content_type, STRINGP);
        _csetf_msg_part_content_type(message_part, content_type);
        return message_part;
    }

    public static SubLObject message_part_set_content_type(final SubLObject message_part, final SubLObject content_type) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        assert NIL != stringp(content_type) : "! stringp(content_type) " + ("Types.stringp(content_type) " + "CommonSymbols.NIL != Types.stringp(content_type) ") + content_type;
        _csetf_msg_part_content_type(message_part, content_type);
        return message_part;
    }

    public static final SubLObject message_part_content_disposition_parameters_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_content_disposition_parameters(message_part);
    }

    public static SubLObject message_part_content_disposition_parameters(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_content_disposition_parameters(message_part);
    }

    public static final SubLObject message_part_set_attachment_name_alt(SubLObject message_part, SubLObject name) {
        return message_part_set_content_disposition_parameter(message_part, $FILENAME, name);
    }

    public static SubLObject message_part_set_attachment_name(final SubLObject message_part, final SubLObject name) {
        return message_part_set_content_disposition_parameter(message_part, $FILENAME, name);
    }

    public static final SubLObject message_part_disposition_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_disposition(message_part);
    }

    public static SubLObject message_part_disposition(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_disposition(message_part);
    }

    public static final SubLObject message_part_encoding_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_encoding(message_part);
    }

    public static SubLObject message_part_encoding(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_encoding(message_part);
    }

    public static final SubLObject message_part_data_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_data(message_part);
    }

    public static SubLObject message_part_data(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_data(message_part);
    }

    public static final SubLObject message_part_data_type_alt(SubLObject message_part) {
        SubLTrampolineFile.checkType(message_part, MESSAGE_PART_P);
        return msg_part_data_type(message_part);
    }

    public static SubLObject message_part_data_type(final SubLObject message_part) {
        assert NIL != message_part_p(message_part) : "! mail_message.message_part_p(message_part) " + ("mail_message.message_part_p(message_part) " + "CommonSymbols.NIL != mail_message.message_part_p(message_part) ") + message_part;
        return msg_part_data_type(message_part);
    }

    public static final SubLObject sxhash_message_part_method_alt(SubLObject v_object) {
        return sxhash_message_part(v_object);
    }

    public static SubLObject sxhash_message_part_method(final SubLObject v_object) {
        return sxhash_message_part(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_message_part_alt(SubLObject message_part) {
        return Sxhash.sxhash(msg_part_content_type(message_part));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_message_part(final SubLObject message_part) {
        return Sxhash.sxhash(msg_part_content_type(message_part));
    }

    public static final SubLObject message_part_set_content_disposition_parameter_alt(SubLObject message_part, SubLObject param, SubLObject value) {
        {
            SubLObject params = message_part_content_disposition_parameters(message_part);
            params = putf(params, param, value);
            _csetf_msg_part_content_disposition_parameters(message_part, params);
            return params;
        }
    }

    public static SubLObject message_part_set_content_disposition_parameter(final SubLObject message_part, final SubLObject param, final SubLObject value) {
        SubLObject params = message_part_content_disposition_parameters(message_part);
        params = putf(params, param, value);
        _csetf_msg_part_content_disposition_parameters(message_part, params);
        return params;
    }

    public static final SubLObject send_message_part_alt(SubLObject message_part, SubLObject smpt_stream, SubLObject boundary) {
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str_alt89$___A, boundary);
        send_message_part_headers(message_part, smpt_stream);
        send_message_part_data(message_part, smpt_stream);
        return NIL;
    }

    public static SubLObject send_message_part(final SubLObject message_part, final SubLObject smpt_stream, final SubLObject boundary) {
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str98$___A, boundary);
        send_message_part_headers(message_part, smpt_stream);
        send_message_part_data(message_part, smpt_stream);
        return NIL;
    }

    public static final SubLObject send_message_part_headers_alt(SubLObject message_part, SubLObject smpt_stream) {
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str_alt90$Content_Type___A, message_part_content_type(message_part));
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str_alt91$Content_Transfer_Encoding___A, message_part_encoding(message_part));
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str_alt92$Content_Disposition___A, message_part_disposition(message_part));
        {
            SubLObject remainder = NIL;
            for (remainder = message_part_content_disposition_parameters(message_part); NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject property = remainder.first();
                    SubLObject value = cadr(remainder);
                    princ($str_alt93$_, smpt_stream);
                    string_utilities.network_terpri(smpt_stream);
                    format(smpt_stream, $str_alt94$__A__S, property, value);
                }
            }
        }
        string_utilities.network_terpri(smpt_stream);
        string_utilities.network_terpri(smpt_stream);
        return NIL;
    }

    public static SubLObject send_message_part_headers(final SubLObject message_part, final SubLObject smpt_stream) {
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str99$Content_Type___A, message_part_content_type(message_part));
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str100$Content_Transfer_Encoding___A, message_part_encoding(message_part));
        string_utilities.network_terpri(smpt_stream);
        format(smpt_stream, $str101$Content_Disposition___A, message_part_disposition(message_part));
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = message_part_content_disposition_parameters(message_part); NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            princ($str102$_, smpt_stream);
            string_utilities.network_terpri(smpt_stream);
            format(smpt_stream, $str103$__A__S, property, value);
        }
        string_utilities.network_terpri(smpt_stream);
        string_utilities.network_terpri(smpt_stream);
        return NIL;
    }

    public static final SubLObject send_message_part_data_alt(SubLObject message_part, SubLObject smpt_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = message_part_data_type(message_part);
                if (pcase_var.eql($STRING)) {
                    princ(message_part_data(message_part), smpt_stream);
                } else {
                    if (pcase_var.eql($FILE)) {
                        if (NIL != string_utilities.starts_with(message_part_content_type(message_part), $str_alt85$text_)) {
                            {
                                SubLObject stream = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_text(message_part_data(message_part), $INPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt96$Unable_to_open__S, message_part_data(message_part));
                                    }
                                    {
                                        SubLObject filestream = stream;
                                        SubLObject doneP = NIL;
                                        while (NIL == doneP) {
                                            {
                                                SubLObject line = read_line(filestream, NIL, $EOF, UNPROVIDED);
                                                if (line.isString()) {
                                                    princ(line, smpt_stream);
                                                    string_utilities.network_terpri(smpt_stream);
                                                } else {
                                                    doneP = T;
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
                            }
                        } else {
                            Errors.error($str_alt98$Only_know_how_to_send_textual_mes);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject send_message_part_data(final SubLObject message_part, final SubLObject smpt_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = message_part_data_type(message_part);
        if (pcase_var.eql($STRING)) {
            princ(message_part_data(message_part), smpt_stream);
        } else
            if (pcase_var.eql($FILE)) {
                if (NIL != string_utilities.starts_with(message_part_content_type(message_part), $str94$text_)) {
                    SubLObject stream = NIL;
                    try {
                        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(message_part_data(message_part), $INPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error($str105$Unable_to_open__S, message_part_data(message_part));
                        }
                        final SubLObject filestream = stream;
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            final SubLObject line = read_line(filestream, NIL, $EOF, UNPROVIDED);
                            if (line.isString()) {
                                princ(line, smpt_stream);
                                string_utilities.network_terpri(smpt_stream);
                            } else {
                                doneP = T;
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
                } else {
                    Errors.error($str107$Only_know_how_to_send_textual_mes);
                }
            }

        return NIL;
    }

    public static final SubLObject send_test_message_alt(SubLObject to, SubLObject from, SubLObject message_string, SubLObject subject) {
        if (message_string == UNPROVIDED) {
            message_string = $str_alt99$This_is_a_test__Please_ignore_;
        }
        if (subject == UNPROVIDED) {
            subject = $$$test_message;
        }
        {
            SubLObject message = new_message(from, to, subject, message_string, UNPROVIDED, UNPROVIDED);
            return send_message(message, UNPROVIDED);
        }
    }

    public static SubLObject send_test_message(final SubLObject to, final SubLObject from, SubLObject message_string, SubLObject subject) {
        if (message_string == UNPROVIDED) {
            message_string = $str108$This_is_a_test__Please_ignore_;
        }
        if (subject == UNPROVIDED) {
            subject = $$$test_message;
        }
        final SubLObject message = new_message(from, to, subject, message_string, UNPROVIDED, UNPROVIDED);
        return send_message(message, UNPROVIDED);
    }

    public static final SubLObject send_test_message_with_attachment_alt(SubLObject to, SubLObject from, SubLObject file, SubLObject content_type, SubLObject subject, SubLObject message_string) {
        if (content_type == UNPROVIDED) {
            content_type = $str_alt76$text_plain;
        }
        if (subject == UNPROVIDED) {
            subject = $$$test_message;
        }
        if (message_string == UNPROVIDED) {
            message_string = $str_alt101$Please_ignore_this_message_and_th;
        }
        {
            SubLObject message = new_message(from, to, subject, message_string, UNPROVIDED, UNPROVIDED);
            SubLObject attachment = new_message_attachment(file, content_type, UNPROVIDED, UNPROVIDED);
            message_add_part(message, attachment);
            return send_message(message, UNPROVIDED);
        }
    }

    public static SubLObject send_test_message_with_attachment(final SubLObject to, final SubLObject from, final SubLObject file, SubLObject content_type, SubLObject subject, SubLObject message_string) {
        if (content_type == UNPROVIDED) {
            content_type = $str85$text_plain;
        }
        if (subject == UNPROVIDED) {
            subject = $$$test_message;
        }
        if (message_string == UNPROVIDED) {
            message_string = $str110$Please_ignore_this_message_and_th;
        }
        final SubLObject message = new_message(from, to, subject, message_string, UNPROVIDED, UNPROVIDED);
        final SubLObject attachment = new_message_attachment(file, content_type, UNPROVIDED, UNPROVIDED);
        message_add_part(message, attachment);
        return send_message(message, UNPROVIDED);
    }

    public static SubLObject declare_mail_message_file() {
        declareFunction("message_print_function_trampoline", "MESSAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("message_p", "MESSAGE-P", 1, 0, false);
        new mail_message.$message_p$UnaryFunction();
        declareFunction("msg_from", "MSG-FROM", 1, 0, false);
        declareFunction("msg_to", "MSG-TO", 1, 0, false);
        declareFunction("msg_cc", "MSG-CC", 1, 0, false);
        declareFunction("msg_bcc", "MSG-BCC", 1, 0, false);
        declareFunction("msg_subject", "MSG-SUBJECT", 1, 0, false);
        declareFunction("msg_additional_headers", "MSG-ADDITIONAL-HEADERS", 1, 0, false);
        declareFunction("msg_host", "MSG-HOST", 1, 0, false);
        declareFunction("msg_port", "MSG-PORT", 1, 0, false);
        declareFunction("msg_parts", "MSG-PARTS", 1, 0, false);
        declareFunction("_csetf_msg_from", "_CSETF-MSG-FROM", 2, 0, false);
        declareFunction("_csetf_msg_to", "_CSETF-MSG-TO", 2, 0, false);
        declareFunction("_csetf_msg_cc", "_CSETF-MSG-CC", 2, 0, false);
        declareFunction("_csetf_msg_bcc", "_CSETF-MSG-BCC", 2, 0, false);
        declareFunction("_csetf_msg_subject", "_CSETF-MSG-SUBJECT", 2, 0, false);
        declareFunction("_csetf_msg_additional_headers", "_CSETF-MSG-ADDITIONAL-HEADERS", 2, 0, false);
        declareFunction("_csetf_msg_host", "_CSETF-MSG-HOST", 2, 0, false);
        declareFunction("_csetf_msg_port", "_CSETF-MSG-PORT", 2, 0, false);
        declareFunction("_csetf_msg_parts", "_CSETF-MSG-PARTS", 2, 0, false);
        declareFunction("make_message", "MAKE-MESSAGE", 0, 1, false);
        declareFunction("visit_defstruct_message", "VISIT-DEFSTRUCT-MESSAGE", 2, 0, false);
        declareFunction("visit_defstruct_object_message_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-METHOD", 2, 0, false);
        declareFunction("print_message", "PRINT-MESSAGE", 3, 0, false);
        declareFunction("new_message", "NEW-MESSAGE", 0, 6, false);
        declareFunction("message_set_from", "MESSAGE-SET-FROM", 2, 0, false);
        declareFunction("message_from", "MESSAGE-FROM", 1, 0, false);
        declareFunction("message_add_to", "MESSAGE-ADD-TO", 2, 0, false);
        declareFunction("message_to", "MESSAGE-TO", 1, 0, false);
        declareFunction("message_add_cc", "MESSAGE-ADD-CC", 2, 0, false);
        declareFunction("message_cc", "MESSAGE-CC", 1, 0, false);
        declareFunction("message_add_bcc", "MESSAGE-ADD-BCC", 2, 0, false);
        declareFunction("message_bcc", "MESSAGE-BCC", 1, 0, false);
        declareFunction("message_set_subject", "MESSAGE-SET-SUBJECT", 2, 0, false);
        declareFunction("message_subject", "MESSAGE-SUBJECT", 1, 0, false);
        declareFunction("message_add_header", "MESSAGE-ADD-HEADER", 2, 0, false);
        declareFunction("message_additional_headers", "MESSAGE-ADDITIONAL-HEADERS", 1, 0, false);
        declareFunction("message_set_host", "MESSAGE-SET-HOST", 2, 0, false);
        declareFunction("message_host", "MESSAGE-HOST", 1, 0, false);
        declareFunction("message_set_port", "MESSAGE-SET-PORT", 2, 0, false);
        declareFunction("message_port", "MESSAGE-PORT", 1, 0, false);
        declareFunction("message_add_part", "MESSAGE-ADD-PART", 2, 0, false);
        declareFunction("message_parts", "MESSAGE-PARTS", 1, 0, false);
        declareFunction("send_message", "SEND-MESSAGE", 1, 1, false);
        declareFunction("send_message_parts", "SEND-MESSAGE-PARTS", 2, 0, false);
        declareFunction("sxhash_message_method", "SXHASH-MESSAGE-METHOD", 1, 0, false);
        declareFunction("sxhash_message", "SXHASH-MESSAGE", 1, 0, false);
        declareFunction("validate_message", "VALIDATE-MESSAGE", 1, 0, false);
        declareFunction("send_message_internal", "SEND-MESSAGE-INTERNAL", 2, 0, false);
        declareFunction("message_part_print_function_trampoline", "MESSAGE-PART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("message_part_p", "MESSAGE-PART-P", 1, 0, false);
        new mail_message.$message_part_p$UnaryFunction();
        declareFunction("msg_part_content_type", "MSG-PART-CONTENT-TYPE", 1, 0, false);
        declareFunction("msg_part_content_type_parameters", "MSG-PART-CONTENT-TYPE-PARAMETERS", 1, 0, false);
        declareFunction("msg_part_disposition", "MSG-PART-DISPOSITION", 1, 0, false);
        declareFunction("msg_part_content_disposition_parameters", "MSG-PART-CONTENT-DISPOSITION-PARAMETERS", 1, 0, false);
        declareFunction("msg_part_encoding", "MSG-PART-ENCODING", 1, 0, false);
        declareFunction("msg_part_data", "MSG-PART-DATA", 1, 0, false);
        declareFunction("msg_part_data_type", "MSG-PART-DATA-TYPE", 1, 0, false);
        declareFunction("_csetf_msg_part_content_type", "_CSETF-MSG-PART-CONTENT-TYPE", 2, 0, false);
        declareFunction("_csetf_msg_part_content_type_parameters", "_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS", 2, 0, false);
        declareFunction("_csetf_msg_part_disposition", "_CSETF-MSG-PART-DISPOSITION", 2, 0, false);
        declareFunction("_csetf_msg_part_content_disposition_parameters", "_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS", 2, 0, false);
        declareFunction("_csetf_msg_part_encoding", "_CSETF-MSG-PART-ENCODING", 2, 0, false);
        declareFunction("_csetf_msg_part_data", "_CSETF-MSG-PART-DATA", 2, 0, false);
        declareFunction("_csetf_msg_part_data_type", "_CSETF-MSG-PART-DATA-TYPE", 2, 0, false);
        declareFunction("make_message_part", "MAKE-MESSAGE-PART", 0, 1, false);
        declareFunction("visit_defstruct_message_part", "VISIT-DEFSTRUCT-MESSAGE-PART", 2, 0, false);
        declareFunction("visit_defstruct_object_message_part_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-PART-METHOD", 2, 0, false);
        declareFunction("print_message_part", "PRINT-MESSAGE-PART", 3, 0, false);
        declareFunction("new_inline_message_part", "NEW-INLINE-MESSAGE-PART", 1, 2, false);
        declareFunction("new_message_attachment", "NEW-MESSAGE-ATTACHMENT", 1, 3, false);
        declareFunction("valid_message_part_data_type_p", "VALID-MESSAGE-PART-DATA-TYPE-P", 1, 0, false);
        declareFunction("valid_message_part_encoding_p", "VALID-MESSAGE-PART-ENCODING-P", 1, 0, false);
        declareFunction("new_message_part", "NEW-MESSAGE-PART", 5, 0, false);
        declareFunction("message_part_content_type", "MESSAGE-PART-CONTENT-TYPE", 1, 0, false);
        declareFunction("message_part_set_content_type", "MESSAGE-PART-SET-CONTENT-TYPE", 2, 0, false);
        declareFunction("message_part_content_disposition_parameters", "MESSAGE-PART-CONTENT-DISPOSITION-PARAMETERS", 1, 0, false);
        declareFunction("message_part_set_attachment_name", "MESSAGE-PART-SET-ATTACHMENT-NAME", 2, 0, false);
        declareFunction("message_part_disposition", "MESSAGE-PART-DISPOSITION", 1, 0, false);
        declareFunction("message_part_encoding", "MESSAGE-PART-ENCODING", 1, 0, false);
        declareFunction("message_part_data", "MESSAGE-PART-DATA", 1, 0, false);
        declareFunction("message_part_data_type", "MESSAGE-PART-DATA-TYPE", 1, 0, false);
        declareFunction("sxhash_message_part_method", "SXHASH-MESSAGE-PART-METHOD", 1, 0, false);
        declareFunction("sxhash_message_part", "SXHASH-MESSAGE-PART", 1, 0, false);
        declareFunction("message_part_set_content_disposition_parameter", "MESSAGE-PART-SET-CONTENT-DISPOSITION-PARAMETER", 3, 0, false);
        declareFunction("send_message_part", "SEND-MESSAGE-PART", 3, 0, false);
        declareFunction("send_message_part_headers", "SEND-MESSAGE-PART-HEADERS", 2, 0, false);
        declareFunction("send_message_part_data", "SEND-MESSAGE-PART-DATA", 2, 0, false);
        declareFunction("send_test_message", "SEND-TEST-MESSAGE", 2, 2, false);
        declareFunction("send_test_message_with_attachment", "SEND-TEST-MESSAGE-WITH-ATTACHMENT", 3, 3, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), makeSymbol("SUBJECT"), makeSymbol("ADDITIONAL-HEADERS"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("PARTS") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $FROM, makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), makeKeyword("SUBJECT"), makeKeyword("ADDITIONAL-HEADERS"), $HOST, $PORT, makeKeyword("PARTS") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("MSG-FROM"), makeSymbol("MSG-TO"), makeSymbol("MSG-CC"), makeSymbol("MSG-BCC"), makeSymbol("MSG-SUBJECT"), makeSymbol("MSG-ADDITIONAL-HEADERS"), makeSymbol("MSG-HOST"), makeSymbol("MSG-PORT"), makeSymbol("MSG-PARTS") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-MSG-FROM"), makeSymbol("_CSETF-MSG-TO"), makeSymbol("_CSETF-MSG-CC"), makeSymbol("_CSETF-MSG-BCC"), makeSymbol("_CSETF-MSG-SUBJECT"), makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS"), makeSymbol("_CSETF-MSG-HOST"), makeSymbol("_CSETF-MSG-PORT"), makeSymbol("_CSETF-MSG-PARTS") });

    static private final SubLString $str_alt35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt36$_MESSAGE_ = makeString("<MESSAGE>");

    static private final SubLString $str_alt42$Content_Type__multipart_mixed____ = makeString("Content-Type: multipart/mixed;~% boundary=~S");

    static private final SubLString $str_alt43$This_is_a_multi_part_message_in_M = makeString("This is a multi-part message in MIME format.");

    static private final SubLString $str_alt44$___A__ = makeString("--~A--");

    static private final SubLList $list_alt47 = list(makeSymbol("CONTENT-TYPE"), makeSymbol("CONTENT-TYPE-PARAMETERS"), makeSymbol("DISPOSITION"), makeSymbol("CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("ENCODING"), makeSymbol("DATA"), makeSymbol("DATA-TYPE"));

    static private final SubLList $list_alt48 = list(makeKeyword("CONTENT-TYPE"), makeKeyword("CONTENT-TYPE-PARAMETERS"), makeKeyword("DISPOSITION"), makeKeyword("CONTENT-DISPOSITION-PARAMETERS"), makeKeyword("ENCODING"), $DATA, makeKeyword("DATA-TYPE"));

    static private final SubLList $list_alt49 = list(makeSymbol("MSG-PART-CONTENT-TYPE"), makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("MSG-PART-DISPOSITION"), makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("MSG-PART-ENCODING"), makeSymbol("MSG-PART-DATA"), makeSymbol("MSG-PART-DATA-TYPE"));

    static private final SubLList $list_alt50 = list(makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE"), makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-DISPOSITION"), makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-ENCODING"), makeSymbol("_CSETF-MSG-PART-DATA"), makeSymbol("_CSETF-MSG-PART-DATA-TYPE"));

    static private final SubLString $str_alt74$_MESSAGE_PART___A_ = makeString("<MESSAGE-PART (~A)");

    static private final SubLString $str_alt75$_ = makeString(">");

    static private final SubLString $str_alt76$text_plain = makeString("text/plain");

    public static SubLObject init_mail_message_file() {
        defconstant("*DTP-MESSAGE*", MESSAGE);
        defconstant("*DTP-MESSAGE-PART*", MESSAGE_PART);
        return NIL;
    }

    public static SubLObject setup_mail_message_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message$.getGlobalValue(), symbol_function(MESSAGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(MSG_FROM, _CSETF_MSG_FROM);
        def_csetf(MSG_TO, _CSETF_MSG_TO);
        def_csetf(MSG_CC, _CSETF_MSG_CC);
        def_csetf(MSG_BCC, _CSETF_MSG_BCC);
        def_csetf(MSG_SUBJECT, _CSETF_MSG_SUBJECT);
        def_csetf(MSG_ADDITIONAL_HEADERS, _CSETF_MSG_ADDITIONAL_HEADERS);
        def_csetf(MSG_HOST, _CSETF_MSG_HOST);
        def_csetf(MSG_PORT, _CSETF_MSG_PORT);
        def_csetf(MSG_PARTS, _CSETF_MSG_PARTS);
        identity(MESSAGE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_METHOD));
        note_funcall_helper_function(PRINT_MESSAGE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_message$.getGlobalValue(), symbol_function(SXHASH_MESSAGE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message_part$.getGlobalValue(), symbol_function(MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list59);
        def_csetf(MSG_PART_CONTENT_TYPE, _CSETF_MSG_PART_CONTENT_TYPE);
        def_csetf(MSG_PART_CONTENT_TYPE_PARAMETERS, _CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS);
        def_csetf(MSG_PART_DISPOSITION, _CSETF_MSG_PART_DISPOSITION);
        def_csetf(MSG_PART_CONTENT_DISPOSITION_PARAMETERS, _CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS);
        def_csetf(MSG_PART_ENCODING, _CSETF_MSG_PART_ENCODING);
        def_csetf(MSG_PART_DATA, _CSETF_MSG_PART_DATA);
        def_csetf(MSG_PART_DATA_TYPE, _CSETF_MSG_PART_DATA_TYPE);
        identity(MESSAGE_PART);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_part$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_PART_METHOD));
        note_funcall_helper_function(PRINT_MESSAGE_PART);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_message_part$.getGlobalValue(), symbol_function(SXHASH_MESSAGE_PART_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt83 = list(makeKeyword("STRING"), $FILE);

    static private final SubLList $list_alt84 = list(makeString("7bit"), makeString("8bit"), makeString("binary"));

    static private final SubLString $str_alt85$text_ = makeString("text/");

    static private final SubLString $str_alt86$Non_text_content_types_not_implem = makeString("Non-text content types not implemented yet. Content type must start with text/. Not ~S");

    static private final SubLString $str_alt89$___A = makeString("--~A");

    static private final SubLString $str_alt90$Content_Type___A = makeString("Content-Type: ~A");

    static private final SubLString $str_alt91$Content_Transfer_Encoding___A = makeString("Content-Transfer-Encoding: ~A");

    static private final SubLString $str_alt92$Content_Disposition___A = makeString("Content-Disposition: ~A");

    static private final SubLString $str_alt93$_ = makeString(";");

    static private final SubLString $str_alt94$__A__S = makeString(" ~A=~S");

    static private final SubLString $str_alt96$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt98$Only_know_how_to_send_textual_mes = makeString("Only know how to send textual message body parts.");

    static private final SubLString $str_alt99$This_is_a_test__Please_ignore_ = makeString("This is a test. Please ignore.");

    static private final SubLString $str_alt101$Please_ignore_this_message_and_th = makeString("Please ignore this message and the attached file.");

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
    }

    public static final class $message_native extends SubLStructNative {
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
            mail_message.$message_native.this.$from = Lisp.NIL;
            mail_message.$message_native.this.$to = Lisp.NIL;
            mail_message.$message_native.this.$cc = Lisp.NIL;
            mail_message.$message_native.this.$bcc = Lisp.NIL;
            mail_message.$message_native.this.$subject = Lisp.NIL;
            mail_message.$message_native.this.$additional_headers = Lisp.NIL;
            mail_message.$message_native.this.$host = Lisp.NIL;
            mail_message.$message_native.this.$port = Lisp.NIL;
            mail_message.$message_native.this.$parts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return mail_message.$message_native.this.$from;
        }

        @Override
        public SubLObject getField3() {
            return mail_message.$message_native.this.$to;
        }

        @Override
        public SubLObject getField4() {
            return mail_message.$message_native.this.$cc;
        }

        @Override
        public SubLObject getField5() {
            return mail_message.$message_native.this.$bcc;
        }

        @Override
        public SubLObject getField6() {
            return mail_message.$message_native.this.$subject;
        }

        @Override
        public SubLObject getField7() {
            return mail_message.$message_native.this.$additional_headers;
        }

        @Override
        public SubLObject getField8() {
            return mail_message.$message_native.this.$host;
        }

        @Override
        public SubLObject getField9() {
            return mail_message.$message_native.this.$port;
        }

        @Override
        public SubLObject getField10() {
            return mail_message.$message_native.this.$parts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return mail_message.$message_native.this.$from = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return mail_message.$message_native.this.$to = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return mail_message.$message_native.this.$cc = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return mail_message.$message_native.this.$bcc = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return mail_message.$message_native.this.$subject = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return mail_message.$message_native.this.$additional_headers = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return mail_message.$message_native.this.$host = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return mail_message.$message_native.this.$port = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return mail_message.$message_native.this.$parts = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.mail_message.$message_native.class, MESSAGE, MESSAGE_P, $list2, $list3, new String[]{ "$from", "$to", "$cc", "$bcc", "$subject", "$additional_headers", "$host", "$port", "$parts" }, $list4, $list5, PRINT_MESSAGE);
        }
    }

    public static final class $message_p$UnaryFunction extends UnaryFunction {
        public $message_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_p(arg1);
        }
    }

    public static final class $message_part_p$UnaryFunction extends UnaryFunction {
        public $message_part_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-PART-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_part_p(arg1);
        }
    }
}

/**
 * Total time: 294 ms synthetic
 */
