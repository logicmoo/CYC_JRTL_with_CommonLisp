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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_kernel;
//dm import com.cyc.cycjava_1.cycl.cfasl_kernel;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class remote_image extends SubLTranslatedFile {

  //// Constructor

  private remote_image() {}
  public static final SubLFile me = new remote_image();
  public static final String myName = "com.cyc.cycjava_1.cycl.remote_image";

  //// Definitions

  public static final class $remote_image_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $machine; }
    public SubLObject getField3() { return $port; }
    public SubLObject getField4() { return $protocol; }
    public SubLObject setField2(SubLObject value) { return $machine = value; }
    public SubLObject setField3(SubLObject value) { return $port = value; }
    public SubLObject setField4(SubLObject value) { return $protocol = value; }
    public SubLObject $machine = NIL;
    public SubLObject $port = NIL;
    public SubLObject $protocol = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($remote_image_native.class, $sym3$REMOTE_IMAGE, $sym4$REMOTE_IMAGE_P, $list5, $list6, new String[] {"$machine", "$port", "$protocol"}, $list7, $list8, $sym9$PRINT_REMOTE_IMAGE);
  }

  @SubL(source = "cycl/remote-image.lisp", position = 1353) 
  public static SubLSymbol $dtp_remote_image$ = null;

  @SubL(source = "cycl/remote-image.lisp", position = 1353) 
  public static final SubLObject remote_image_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29985");
    return NIL;
  }

  public static final class $remote_image_p$UnaryFunction extends UnaryFunction {
    public $remote_image_p$UnaryFunction() { super(extractFunctionNamed("REMOTE-IMAGE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29994"); }
  }

  public static final class $remote_image_connection_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $image; }
    public SubLObject getField3() { return $channel; }
    public SubLObject setField2(SubLObject value) { return $image = value; }
    public SubLObject setField3(SubLObject value) { return $channel = value; }
    public SubLObject $image = NIL;
    public SubLObject $channel = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($remote_image_connection_native.class, $sym22$REMOTE_IMAGE_CONNECTION, $sym23$REMOTE_IMAGE_CONNECTION_P, $list24, $list25, new String[] {"$image", "$channel"}, $list26, $list27, $sym28$PRINT_REMOTE_IMAGE_CONNECTION);
  }

  @SubL(source = "cycl/remote-image.lisp", position = 2825) 
  public static SubLSymbol $dtp_remote_image_connection$ = null;

  @SubL(source = "cycl/remote-image.lisp", position = 2825) 
  public static final SubLObject remote_image_connection_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29986");
    return NIL;
  }

  public static final class $remote_image_connection_p$UnaryFunction extends UnaryFunction {
    public $remote_image_connection_p$UnaryFunction() { super(extractFunctionNamed("REMOTE-IMAGE-CONNECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29993"); }
  }

  @SubL(source = "cycl/remote-image.lisp", position = 5833) 
  public static SubLSymbol $current_remote_image_connection$ = null;

  public static final SubLObject declare_remote_image_file() {
    declareFunction(myName, "api_channel_remote_eval", "API-CHANNEL-REMOTE-EVAL", 2, 1, false);
    declareFunction(myName, "remote_image_print_function_trampoline", "REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "remote_image_p", "REMOTE-IMAGE-P", 1, 0, false); new $remote_image_p$UnaryFunction();
    declareFunction(myName, "rmt_img_machine", "RMT-IMG-MACHINE", 1, 0, false);
    declareFunction(myName, "rmt_img_port", "RMT-IMG-PORT", 1, 0, false);
    declareFunction(myName, "rmt_img_protocol", "RMT-IMG-PROTOCOL", 1, 0, false);
    declareFunction(myName, "_csetf_rmt_img_machine", "_CSETF-RMT-IMG-MACHINE", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_img_port", "_CSETF-RMT-IMG-PORT", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_img_protocol", "_CSETF-RMT-IMG-PROTOCOL", 2, 0, false);
    declareFunction(myName, "make_remote_image", "MAKE-REMOTE-IMAGE", 0, 1, false);
    declareFunction(myName, "print_remote_image", "PRINT-REMOTE-IMAGE", 3, 0, false);
    declareFunction(myName, "new_remote_image", "NEW-REMOTE-IMAGE", 2, 1, false);
    declareFunction(myName, "remote_image_machine", "REMOTE-IMAGE-MACHINE", 1, 0, false);
    declareFunction(myName, "remote_image_port", "REMOTE-IMAGE-PORT", 1, 0, false);
    declareFunction(myName, "remote_image_protocol", "REMOTE-IMAGE-PROTOCOL", 1, 0, false);
    declareFunction(myName, "remote_image_connection_print_function_trampoline", "REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "remote_image_connection_p", "REMOTE-IMAGE-CONNECTION-P", 1, 0, false); new $remote_image_connection_p$UnaryFunction();
    declareFunction(myName, "rmt_img_conn_image", "RMT-IMG-CONN-IMAGE", 1, 0, false);
    declareFunction(myName, "rmt_img_conn_channel", "RMT-IMG-CONN-CHANNEL", 1, 0, false);
    declareFunction(myName, "_csetf_rmt_img_conn_image", "_CSETF-RMT-IMG-CONN-IMAGE", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_img_conn_channel", "_CSETF-RMT-IMG-CONN-CHANNEL", 2, 0, false);
    declareFunction(myName, "make_remote_image_connection", "MAKE-REMOTE-IMAGE-CONNECTION", 0, 1, false);
    declareFunction(myName, "print_remote_image_connection", "PRINT-REMOTE-IMAGE-CONNECTION", 3, 0, false);
    declareFunction(myName, "new_remote_image_connection", "NEW-REMOTE-IMAGE-CONNECTION", 1, 0, false);
    declareFunction(myName, "remote_image_connection_image", "REMOTE-IMAGE-CONNECTION-IMAGE", 1, 0, false);
    declareFunction(myName, "remote_image_connection_channel", "REMOTE-IMAGE-CONNECTION-CHANNEL", 1, 0, false);
    declareFunction(myName, "open_remote_image_connection", "OPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
    declareFunction(myName, "close_remote_image_connection", "CLOSE-REMOTE-IMAGE-CONNECTION", 1, 0, false);
    declareFunction(myName, "remote_image_connection_openP", "REMOTE-IMAGE-CONNECTION-OPEN?", 1, 0, false);
    declareFunction(myName, "remote_image_connection_closedP", "REMOTE-IMAGE-CONNECTION-CLOSED?", 1, 0, false);
    declareFunction(myName, "remote_image_connection_machine", "REMOTE-IMAGE-CONNECTION-MACHINE", 1, 0, false);
    declareFunction(myName, "remote_image_connection_port", "REMOTE-IMAGE-CONNECTION-PORT", 1, 0, false);
    declareFunction(myName, "remote_image_connection_protocol", "REMOTE-IMAGE-CONNECTION-PROTOCOL", 1, 0, false);
    declareFunction(myName, "reopen_remote_image_connection", "REOPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
    declareFunction(myName, "remote_image_connection_eval", "REMOTE-IMAGE-CONNECTION-EVAL", 2, 0, false);
    declareMacro(myName, "with_remote_image_connection", "WITH-REMOTE-IMAGE-CONNECTION");
    declareFunction(myName, "current_remote_image_connection", "CURRENT-REMOTE-IMAGE-CONNECTION", 0, 0, false);
    declareFunction(myName, "current_remote_image_connection_eval", "CURRENT-REMOTE-IMAGE-CONNECTION-EVAL", 1, 0, false);
    declareMacro(myName, "with_new_remote_image_connection", "WITH-NEW-REMOTE-IMAGE-CONNECTION");
    return NIL;
  }

  public static final SubLObject init_remote_image_file() {
    $dtp_remote_image$ = defconstant("*DTP-REMOTE-IMAGE*", $sym3$REMOTE_IMAGE);
    $dtp_remote_image_connection$ = defconstant("*DTP-REMOTE-IMAGE-CONNECTION*", $sym22$REMOTE_IMAGE_CONNECTION);
    $current_remote_image_connection$ = defparameter("*CURRENT-REMOTE-IMAGE-CONNECTION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_remote_image_file() {
    // CVS_ID("Id: remote-image.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_remote_image$.getGlobalValue(), Symbols.symbol_function($sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym11$RMT_IMG_MACHINE, $sym12$_CSETF_RMT_IMG_MACHINE);
    Structures.def_csetf($sym13$RMT_IMG_PORT, $sym14$_CSETF_RMT_IMG_PORT);
    Structures.def_csetf($sym15$RMT_IMG_PROTOCOL, $sym16$_CSETF_RMT_IMG_PROTOCOL);
    Equality.identity($sym3$REMOTE_IMAGE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_remote_image_connection$.getGlobalValue(), Symbols.symbol_function($sym29$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym30$RMT_IMG_CONN_IMAGE, $sym31$_CSETF_RMT_IMG_CONN_IMAGE);
    Structures.def_csetf($sym32$RMT_IMG_CONN_CHANNEL, $sym33$_CSETF_RMT_IMG_CONN_CHANNEL);
    Equality.identity($sym22$REMOTE_IMAGE_CONNECTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$CFASL = makeKeyword("CFASL");
  public static final SubLSymbol $kw1$CYC_API = makeKeyword("CYC-API");
  public static final SubLString $str2$Unknown_API_protocol__S = makeString("Unknown API protocol ~S");
  public static final SubLSymbol $sym3$REMOTE_IMAGE = makeSymbol("REMOTE-IMAGE");
  public static final SubLSymbol $sym4$REMOTE_IMAGE_P = makeSymbol("REMOTE-IMAGE-P");
  public static final SubLList $list5 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("PROTOCOL"));
  public static final SubLList $list6 = list(makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("PROTOCOL"));
  public static final SubLList $list7 = list(makeSymbol("RMT-IMG-MACHINE"), makeSymbol("RMT-IMG-PORT"), makeSymbol("RMT-IMG-PROTOCOL"));
  public static final SubLList $list8 = list(makeSymbol("_CSETF-RMT-IMG-MACHINE"), makeSymbol("_CSETF-RMT-IMG-PORT"), makeSymbol("_CSETF-RMT-IMG-PROTOCOL"));
  public static final SubLSymbol $sym9$PRINT_REMOTE_IMAGE = makeSymbol("PRINT-REMOTE-IMAGE");
  public static final SubLSymbol $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym11$RMT_IMG_MACHINE = makeSymbol("RMT-IMG-MACHINE");
  public static final SubLSymbol $sym12$_CSETF_RMT_IMG_MACHINE = makeSymbol("_CSETF-RMT-IMG-MACHINE");
  public static final SubLSymbol $sym13$RMT_IMG_PORT = makeSymbol("RMT-IMG-PORT");
  public static final SubLSymbol $sym14$_CSETF_RMT_IMG_PORT = makeSymbol("_CSETF-RMT-IMG-PORT");
  public static final SubLSymbol $sym15$RMT_IMG_PROTOCOL = makeSymbol("RMT-IMG-PROTOCOL");
  public static final SubLSymbol $sym16$_CSETF_RMT_IMG_PROTOCOL = makeSymbol("_CSETF-RMT-IMG-PROTOCOL");
  public static final SubLSymbol $kw17$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw18$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw19$PROTOCOL = makeKeyword("PROTOCOL");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$_REMOTE_IMAGE__A__A__A_ = makeString("<REMOTE IMAGE ~A ~A ~A>");
  public static final SubLSymbol $sym22$REMOTE_IMAGE_CONNECTION = makeSymbol("REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym23$REMOTE_IMAGE_CONNECTION_P = makeSymbol("REMOTE-IMAGE-CONNECTION-P");
  public static final SubLList $list24 = list(makeSymbol("IMAGE"), makeSymbol("CHANNEL"));
  public static final SubLList $list25 = list(makeKeyword("IMAGE"), makeKeyword("CHANNEL"));
  public static final SubLList $list26 = list(makeSymbol("RMT-IMG-CONN-IMAGE"), makeSymbol("RMT-IMG-CONN-CHANNEL"));
  public static final SubLList $list27 = list(makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE"), makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL"));
  public static final SubLSymbol $sym28$PRINT_REMOTE_IMAGE_CONNECTION = makeSymbol("PRINT-REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym29$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym30$RMT_IMG_CONN_IMAGE = makeSymbol("RMT-IMG-CONN-IMAGE");
  public static final SubLSymbol $sym31$_CSETF_RMT_IMG_CONN_IMAGE = makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE");
  public static final SubLSymbol $sym32$RMT_IMG_CONN_CHANNEL = makeSymbol("RMT-IMG-CONN-CHANNEL");
  public static final SubLSymbol $sym33$_CSETF_RMT_IMG_CONN_CHANNEL = makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL");
  public static final SubLSymbol $kw34$IMAGE = makeKeyword("IMAGE");
  public static final SubLSymbol $kw35$CHANNEL = makeKeyword("CHANNEL");
  public static final SubLString $str36$_CONNECTION_to__A___A__ = makeString("<CONNECTION to ~A (~A)>");
  public static final SubLString $str37$open = makeString("open");
  public static final SubLString $str38$closed = makeString("closed");
  public static final SubLSymbol $kw39$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $kw40$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym41$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLList $list42 = list(makeSymbol("API-QUIT"));
  public static final SubLList $list43 = list(makeSymbol("CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym45$_CURRENT_REMOTE_IMAGE_CONNECTION_ = makeSymbol("*CURRENT-REMOTE-IMAGE-CONNECTION*");
  public static final SubLList $list46 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym47$CONNECTION = makeUninternedSymbol("CONNECTION");
  public static final SubLSymbol $sym48$NEW_REMOTE_IMAGE_CONNECTION = makeSymbol("NEW-REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym49$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym50$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym51$OPEN_REMOTE_IMAGE_CONNECTION = makeSymbol("OPEN-REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym52$WITH_REMOTE_IMAGE_CONNECTION = makeSymbol("WITH-REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym53$CLOSE_REMOTE_IMAGE_CONNECTION = makeSymbol("CLOSE-REMOTE-IMAGE-CONNECTION");

  //// Initializers

  public void declareFunctions() {
    declare_remote_image_file();
  }

  public void initializeVariables() {
    init_remote_image_file();
  }

  public void runTopLevelForms() {
    setup_remote_image_file();
  }

}
