/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class mail_message extends SubLTranslatedFile {

  //// Constructor

  private mail_message() {}
  public static final SubLFile me = new mail_message();
  public static final String myName = "com.cyc.cycjava_1.cycl.mail_message";

  //// Definitions

  public static final class $message_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $from; }
    public SubLObject getField3() { return $to; }
    public SubLObject getField4() { return $cc; }
    public SubLObject getField5() { return $bcc; }
    public SubLObject getField6() { return $subject; }
    public SubLObject getField7() { return $additional_headers; }
    public SubLObject getField8() { return $host; }
    public SubLObject getField9() { return $port; }
    public SubLObject getField10() { return $parts; }
    public SubLObject setField2(SubLObject value) { return $from = value; }
    public SubLObject setField3(SubLObject value) { return $to = value; }
    public SubLObject setField4(SubLObject value) { return $cc = value; }
    public SubLObject setField5(SubLObject value) { return $bcc = value; }
    public SubLObject setField6(SubLObject value) { return $subject = value; }
    public SubLObject setField7(SubLObject value) { return $additional_headers = value; }
    public SubLObject setField8(SubLObject value) { return $host = value; }
    public SubLObject setField9(SubLObject value) { return $port = value; }
    public SubLObject setField10(SubLObject value) { return $parts = value; }
    public SubLObject $from = NIL;
    public SubLObject $to = NIL;
    public SubLObject $cc = NIL;
    public SubLObject $bcc = NIL;
    public SubLObject $subject = NIL;
    public SubLObject $additional_headers = NIL;
    public SubLObject $host = NIL;
    public SubLObject $port = NIL;
    public SubLObject $parts = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($message_native.class, $sym0$MESSAGE, $sym1$MESSAGE_P, $list2, $list3, new String[] {"$from", "$to", "$cc", "$bcc", "$subject", "$additional_headers", "$host", "$port", "$parts"}, $list4, $list5, $sym6$PRINT_MESSAGE);
  }

  @SubL(source = "cycl/mail-message.lisp", position = 1260) 
  public static SubLSymbol $dtp_message$ = null;

  public static final class $message_p$UnaryFunction extends UnaryFunction {
    public $message_p$UnaryFunction() { super(extractFunctionNamed("MESSAGE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29948"); }
  }

  @SubL(source = "cycl/mail-message.lisp", position = 6304) 
  public static final SubLObject sxhash_message_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29965");
  }

  public static final class $message_part_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $content_type; }
    public SubLObject getField3() { return $content_type_parameters; }
    public SubLObject getField4() { return $disposition; }
    public SubLObject getField5() { return $content_disposition_parameters; }
    public SubLObject getField6() { return $encoding; }
    public SubLObject getField7() { return $data; }
    public SubLObject getField8() { return $data_type; }
    public SubLObject setField2(SubLObject value) { return $content_type = value; }
    public SubLObject setField3(SubLObject value) { return $content_type_parameters = value; }
    public SubLObject setField4(SubLObject value) { return $disposition = value; }
    public SubLObject setField5(SubLObject value) { return $content_disposition_parameters = value; }
    public SubLObject setField6(SubLObject value) { return $encoding = value; }
    public SubLObject setField7(SubLObject value) { return $data = value; }
    public SubLObject setField8(SubLObject value) { return $data_type = value; }
    public SubLObject $content_type = NIL;
    public SubLObject $content_type_parameters = NIL;
    public SubLObject $disposition = NIL;
    public SubLObject $content_disposition_parameters = NIL;
    public SubLObject $encoding = NIL;
    public SubLObject $data = NIL;
    public SubLObject $data_type = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($message_part_native.class, $sym46$MESSAGE_PART, $sym40$MESSAGE_PART_P, $list47, $list48, new String[] {"$content_type", "$content_type_parameters", "$disposition", "$content_disposition_parameters", "$encoding", "$data", "$data_type"}, $list49, $list50, $sym51$PRINT_MESSAGE_PART);
  }

  @SubL(source = "cycl/mail-message.lisp", position = 7471) 
  public static SubLSymbol $dtp_message_part$ = null;

  public static final class $message_part_p$UnaryFunction extends UnaryFunction {
    public $message_part_p$UnaryFunction() { super(extractFunctionNamed("MESSAGE-PART-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29960"); }
  }

  @SubL(source = "cycl/mail-message.lisp", position = 11309) 
  public static final SubLObject sxhash_message_part_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29966");
  }

  public static final SubLObject declare_mail_message_file() {
    declareFunction("message_print_function_trampoline", "MESSAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("message_p", "MESSAGE-P", 1, 0, false); new $message_p$UnaryFunction();
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
    declareFunction("message_part_p", "MESSAGE-PART-P", 1, 0, false); new $message_part_p$UnaryFunction();
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
    return NIL;
  }

  public static final SubLObject init_mail_message_file() {
    $dtp_message$ = defconstant("*DTP-MESSAGE*", $sym0$MESSAGE);
    $dtp_message_part$ = defconstant("*DTP-MESSAGE-PART*", $sym46$MESSAGE_PART);
    return NIL;
  }

  public static final SubLObject setup_mail_message_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_message$.getGlobalValue(), Symbols.symbol_function($sym7$MESSAGE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$MSG_FROM, $sym9$_CSETF_MSG_FROM);
    Structures.def_csetf($sym10$MSG_TO, $sym11$_CSETF_MSG_TO);
    Structures.def_csetf($sym12$MSG_CC, $sym13$_CSETF_MSG_CC);
    Structures.def_csetf($sym14$MSG_BCC, $sym15$_CSETF_MSG_BCC);
    Structures.def_csetf($sym16$MSG_SUBJECT, $sym17$_CSETF_MSG_SUBJECT);
    Structures.def_csetf($sym18$MSG_ADDITIONAL_HEADERS, $sym19$_CSETF_MSG_ADDITIONAL_HEADERS);
    Structures.def_csetf($sym20$MSG_HOST, $sym21$_CSETF_MSG_HOST);
    Structures.def_csetf($sym22$MSG_PORT, $sym23$_CSETF_MSG_PORT);
    Structures.def_csetf($sym24$MSG_PARTS, $sym25$_CSETF_MSG_PARTS);
    Equality.identity($sym0$MESSAGE);
    utilities_macros.note_funcall_helper_function($sym6$PRINT_MESSAGE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_message$.getGlobalValue(), Symbols.symbol_function($sym45$SXHASH_MESSAGE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_message_part$.getGlobalValue(), Symbols.symbol_function($sym52$MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym53$MSG_PART_CONTENT_TYPE, $sym54$_CSETF_MSG_PART_CONTENT_TYPE);
    Structures.def_csetf($sym55$MSG_PART_CONTENT_TYPE_PARAMETERS, $sym56$_CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS);
    Structures.def_csetf($sym57$MSG_PART_DISPOSITION, $sym58$_CSETF_MSG_PART_DISPOSITION);
    Structures.def_csetf($sym59$MSG_PART_CONTENT_DISPOSITION_PARAMETERS, $sym60$_CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS);
    Structures.def_csetf($sym61$MSG_PART_ENCODING, $sym62$_CSETF_MSG_PART_ENCODING);
    Structures.def_csetf($sym63$MSG_PART_DATA, $sym64$_CSETF_MSG_PART_DATA);
    Structures.def_csetf($sym65$MSG_PART_DATA_TYPE, $sym66$_CSETF_MSG_PART_DATA_TYPE);
    Equality.identity($sym46$MESSAGE_PART);
    utilities_macros.note_funcall_helper_function($sym51$PRINT_MESSAGE_PART);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_message_part$.getGlobalValue(), Symbols.symbol_function($sym88$SXHASH_MESSAGE_PART_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$MESSAGE = makeSymbol("MESSAGE");
  public static final SubLSymbol $sym1$MESSAGE_P = makeSymbol("MESSAGE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("CC"), makeSymbol("BCC"), makeSymbol("SUBJECT"), makeSymbol("ADDITIONAL-HEADERS"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("PARTS")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("FROM"), makeKeyword("TO"), makeKeyword("CC"), makeKeyword("BCC"), makeKeyword("SUBJECT"), makeKeyword("ADDITIONAL-HEADERS"), makeKeyword("HOST"), makeKeyword("PORT"), makeKeyword("PARTS")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("MSG-FROM"), makeSymbol("MSG-TO"), makeSymbol("MSG-CC"), makeSymbol("MSG-BCC"), makeSymbol("MSG-SUBJECT"), makeSymbol("MSG-ADDITIONAL-HEADERS"), makeSymbol("MSG-HOST"), makeSymbol("MSG-PORT"), makeSymbol("MSG-PARTS")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-MSG-FROM"), makeSymbol("_CSETF-MSG-TO"), makeSymbol("_CSETF-MSG-CC"), makeSymbol("_CSETF-MSG-BCC"), makeSymbol("_CSETF-MSG-SUBJECT"), makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS"), makeSymbol("_CSETF-MSG-HOST"), makeSymbol("_CSETF-MSG-PORT"), makeSymbol("_CSETF-MSG-PARTS")});
  public static final SubLSymbol $sym6$PRINT_MESSAGE = makeSymbol("PRINT-MESSAGE");
  public static final SubLSymbol $sym7$MESSAGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$MSG_FROM = makeSymbol("MSG-FROM");
  public static final SubLSymbol $sym9$_CSETF_MSG_FROM = makeSymbol("_CSETF-MSG-FROM");
  public static final SubLSymbol $sym10$MSG_TO = makeSymbol("MSG-TO");
  public static final SubLSymbol $sym11$_CSETF_MSG_TO = makeSymbol("_CSETF-MSG-TO");
  public static final SubLSymbol $sym12$MSG_CC = makeSymbol("MSG-CC");
  public static final SubLSymbol $sym13$_CSETF_MSG_CC = makeSymbol("_CSETF-MSG-CC");
  public static final SubLSymbol $sym14$MSG_BCC = makeSymbol("MSG-BCC");
  public static final SubLSymbol $sym15$_CSETF_MSG_BCC = makeSymbol("_CSETF-MSG-BCC");
  public static final SubLSymbol $sym16$MSG_SUBJECT = makeSymbol("MSG-SUBJECT");
  public static final SubLSymbol $sym17$_CSETF_MSG_SUBJECT = makeSymbol("_CSETF-MSG-SUBJECT");
  public static final SubLSymbol $sym18$MSG_ADDITIONAL_HEADERS = makeSymbol("MSG-ADDITIONAL-HEADERS");
  public static final SubLSymbol $sym19$_CSETF_MSG_ADDITIONAL_HEADERS = makeSymbol("_CSETF-MSG-ADDITIONAL-HEADERS");
  public static final SubLSymbol $sym20$MSG_HOST = makeSymbol("MSG-HOST");
  public static final SubLSymbol $sym21$_CSETF_MSG_HOST = makeSymbol("_CSETF-MSG-HOST");
  public static final SubLSymbol $sym22$MSG_PORT = makeSymbol("MSG-PORT");
  public static final SubLSymbol $sym23$_CSETF_MSG_PORT = makeSymbol("_CSETF-MSG-PORT");
  public static final SubLSymbol $sym24$MSG_PARTS = makeSymbol("MSG-PARTS");
  public static final SubLSymbol $sym25$_CSETF_MSG_PARTS = makeSymbol("_CSETF-MSG-PARTS");
  public static final SubLSymbol $kw26$FROM = makeKeyword("FROM");
  public static final SubLSymbol $kw27$TO = makeKeyword("TO");
  public static final SubLSymbol $kw28$CC = makeKeyword("CC");
  public static final SubLSymbol $kw29$BCC = makeKeyword("BCC");
  public static final SubLSymbol $kw30$SUBJECT = makeKeyword("SUBJECT");
  public static final SubLSymbol $kw31$ADDITIONAL_HEADERS = makeKeyword("ADDITIONAL-HEADERS");
  public static final SubLSymbol $kw32$HOST = makeKeyword("HOST");
  public static final SubLSymbol $kw33$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw34$PARTS = makeKeyword("PARTS");
  public static final SubLString $str35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str36$_MESSAGE_ = makeString("<MESSAGE>");
  public static final SubLString $str37$localhost = makeString("localhost");
  public static final SubLSymbol $sym38$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym39$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym40$MESSAGE_PART_P = makeSymbol("MESSAGE-PART-P");
  public static final SubLSymbol $sym41$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLString $str42$Content_Type__multipart_mixed____ = makeString("Content-Type: multipart/mixed;~% boundary=~S");
  public static final SubLString $str43$This_is_a_multi_part_message_in_M = makeString("This is a multi-part message in MIME format.");
  public static final SubLString $str44$___A__ = makeString("--~A--");
  public static final SubLSymbol $sym45$SXHASH_MESSAGE_METHOD = makeSymbol("SXHASH-MESSAGE-METHOD");
  public static final SubLSymbol $sym46$MESSAGE_PART = makeSymbol("MESSAGE-PART");
  public static final SubLList $list47 = list(makeSymbol("CONTENT-TYPE"), makeSymbol("CONTENT-TYPE-PARAMETERS"), makeSymbol("DISPOSITION"), makeSymbol("CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("ENCODING"), makeSymbol("DATA"), makeSymbol("DATA-TYPE"));
  public static final SubLList $list48 = list(makeKeyword("CONTENT-TYPE"), makeKeyword("CONTENT-TYPE-PARAMETERS"), makeKeyword("DISPOSITION"), makeKeyword("CONTENT-DISPOSITION-PARAMETERS"), makeKeyword("ENCODING"), makeKeyword("DATA"), makeKeyword("DATA-TYPE"));
  public static final SubLList $list49 = list(makeSymbol("MSG-PART-CONTENT-TYPE"), makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("MSG-PART-DISPOSITION"), makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("MSG-PART-ENCODING"), makeSymbol("MSG-PART-DATA"), makeSymbol("MSG-PART-DATA-TYPE"));
  public static final SubLList $list50 = list(makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE"), makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-DISPOSITION"), makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS"), makeSymbol("_CSETF-MSG-PART-ENCODING"), makeSymbol("_CSETF-MSG-PART-DATA"), makeSymbol("_CSETF-MSG-PART-DATA-TYPE"));
  public static final SubLSymbol $sym51$PRINT_MESSAGE_PART = makeSymbol("PRINT-MESSAGE-PART");
  public static final SubLSymbol $sym52$MESSAGE_PART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-PART-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym53$MSG_PART_CONTENT_TYPE = makeSymbol("MSG-PART-CONTENT-TYPE");
  public static final SubLSymbol $sym54$_CSETF_MSG_PART_CONTENT_TYPE = makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE");
  public static final SubLSymbol $sym55$MSG_PART_CONTENT_TYPE_PARAMETERS = makeSymbol("MSG-PART-CONTENT-TYPE-PARAMETERS");
  public static final SubLSymbol $sym56$_CSETF_MSG_PART_CONTENT_TYPE_PARAMETERS = makeSymbol("_CSETF-MSG-PART-CONTENT-TYPE-PARAMETERS");
  public static final SubLSymbol $sym57$MSG_PART_DISPOSITION = makeSymbol("MSG-PART-DISPOSITION");
  public static final SubLSymbol $sym58$_CSETF_MSG_PART_DISPOSITION = makeSymbol("_CSETF-MSG-PART-DISPOSITION");
  public static final SubLSymbol $sym59$MSG_PART_CONTENT_DISPOSITION_PARAMETERS = makeSymbol("MSG-PART-CONTENT-DISPOSITION-PARAMETERS");
  public static final SubLSymbol $sym60$_CSETF_MSG_PART_CONTENT_DISPOSITION_PARAMETERS = makeSymbol("_CSETF-MSG-PART-CONTENT-DISPOSITION-PARAMETERS");
  public static final SubLSymbol $sym61$MSG_PART_ENCODING = makeSymbol("MSG-PART-ENCODING");
  public static final SubLSymbol $sym62$_CSETF_MSG_PART_ENCODING = makeSymbol("_CSETF-MSG-PART-ENCODING");
  public static final SubLSymbol $sym63$MSG_PART_DATA = makeSymbol("MSG-PART-DATA");
  public static final SubLSymbol $sym64$_CSETF_MSG_PART_DATA = makeSymbol("_CSETF-MSG-PART-DATA");
  public static final SubLSymbol $sym65$MSG_PART_DATA_TYPE = makeSymbol("MSG-PART-DATA-TYPE");
  public static final SubLSymbol $sym66$_CSETF_MSG_PART_DATA_TYPE = makeSymbol("_CSETF-MSG-PART-DATA-TYPE");
  public static final SubLSymbol $kw67$CONTENT_TYPE = makeKeyword("CONTENT-TYPE");
  public static final SubLSymbol $kw68$CONTENT_TYPE_PARAMETERS = makeKeyword("CONTENT-TYPE-PARAMETERS");
  public static final SubLSymbol $kw69$DISPOSITION = makeKeyword("DISPOSITION");
  public static final SubLSymbol $kw70$CONTENT_DISPOSITION_PARAMETERS = makeKeyword("CONTENT-DISPOSITION-PARAMETERS");
  public static final SubLSymbol $kw71$ENCODING = makeKeyword("ENCODING");
  public static final SubLSymbol $kw72$DATA = makeKeyword("DATA");
  public static final SubLSymbol $kw73$DATA_TYPE = makeKeyword("DATA-TYPE");
  public static final SubLString $str74$_MESSAGE_PART___A_ = makeString("<MESSAGE-PART (~A)");
  public static final SubLString $str75$_ = makeString(">");
  public static final SubLString $str76$text_plain = makeString("text/plain");
  public static final SubLString $str77$7bit = makeString("7bit");
  public static final SubLSymbol $sym78$VALID_MESSAGE_PART_ENCODING_P = makeSymbol("VALID-MESSAGE-PART-ENCODING-P");
  public static final SubLString $str79$inline = makeString("inline");
  public static final SubLSymbol $kw80$STRING = makeKeyword("STRING");
  public static final SubLString $str81$attachment = makeString("attachment");
  public static final SubLSymbol $kw82$FILE = makeKeyword("FILE");
  public static final SubLList $list83 = list(makeKeyword("STRING"), makeKeyword("FILE"));
  public static final SubLList $list84 = list(makeString("7bit"), makeString("8bit"), makeString("binary"));
  public static final SubLString $str85$text_ = makeString("text/");
  public static final SubLString $str86$Non_text_content_types_not_implem = makeString("Non-text content types not implemented yet. Content type must start with text/. Not ~S");
  public static final SubLSymbol $kw87$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $sym88$SXHASH_MESSAGE_PART_METHOD = makeSymbol("SXHASH-MESSAGE-PART-METHOD");
  public static final SubLString $str89$___A = makeString("--~A");
  public static final SubLString $str90$Content_Type___A = makeString("Content-Type: ~A");
  public static final SubLString $str91$Content_Transfer_Encoding___A = makeString("Content-Transfer-Encoding: ~A");
  public static final SubLString $str92$Content_Disposition___A = makeString("Content-Disposition: ~A");
  public static final SubLString $str93$_ = makeString(";");
  public static final SubLString $str94$__A__S = makeString(" ~A=~S");
  public static final SubLSymbol $kw95$INPUT = makeKeyword("INPUT");
  public static final SubLString $str96$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $kw97$EOF = makeKeyword("EOF");
  public static final SubLString $str98$Only_know_how_to_send_textual_mes = makeString("Only know how to send textual message body parts.");

  //// Initializers

  public void declareFunctions() {
    declare_mail_message_file();
  }

  public void initializeVariables() {
    init_mail_message_file();
  }

  public void runTopLevelForms() {
    setup_mail_message_file();
  }

}
