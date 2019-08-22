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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class lucene_session extends SubLTranslatedFile {

  //// Constructor

  private lucene_session() {}
  public static final SubLFile me = new lucene_session();
  public static final String myName = "com.cyc.cycjava_1.cycl.lucene_session";

  //// Definitions

  @SubL(source = "cycl/lucene-session.lisp", position = 1700) 
  public static SubLSymbol $lucene_host$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 1770) 
  public static SubLSymbol $lucene_port$ = null;

  /** Specifying a value for this will override any other setting that might get bound elsewhere */
  @SubL(source = "cycl/lucene-session.lisp", position = 1804) 
  private static SubLSymbol $lucene_host_override$ = null;

  /** Specifying a value for this will override any other settings that might get bound elsewhere */
  @SubL(source = "cycl/lucene-session.lisp", position = 1948) 
  private static SubLSymbol $lucene_port_override$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2726) 
  private static SubLSymbol $init_lucene_session$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2795) 
  private static SubLSymbol $add_document$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2833) 
  private static SubLSymbol $query$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2864) 
  private static SubLSymbol $optimize$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2898) 
  private static SubLSymbol $close_index$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2935) 
  private static SubLSymbol $new_index_writer$ = null;

  public static final class $lucene_session_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $host; }
    public SubLObject getField3() { return $port; }
    public SubLObject getField4() { return $connection; }
    public SubLObject getField5() { return $session_type; }
    public SubLObject getField6() { return $index; }
    public SubLObject getField7() { return $overwrite; }
    public SubLObject setField2(SubLObject value) { return $host = value; }
    public SubLObject setField3(SubLObject value) { return $port = value; }
    public SubLObject setField4(SubLObject value) { return $connection = value; }
    public SubLObject setField5(SubLObject value) { return $session_type = value; }
    public SubLObject setField6(SubLObject value) { return $index = value; }
    public SubLObject setField7(SubLObject value) { return $overwrite = value; }
    public SubLObject $host = NIL;
    public SubLObject $port = NIL;
    public SubLObject $connection = NIL;
    public SubLObject $session_type = NIL;
    public SubLObject $index = NIL;
    public SubLObject $overwrite = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($lucene_session_native.class, $sym11$LUCENE_SESSION, $sym9$LUCENE_SESSION_P, $list12, $list13, new String[] {"$host", "$port", "$connection", "$session_type", "$index", "$overwrite"}, $list14, $list15, $sym16$LUCENE_PRINT);
  }

  @SubL(source = "cycl/lucene-session.lisp", position = 2977) 
  public static SubLSymbol $dtp_lucene_session$ = null;

  @SubL(source = "cycl/lucene-session.lisp", position = 2977) 
  public static final SubLObject lucene_session_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29219");
    return NIL;
  }

  public static final class $lucene_session_p$UnaryFunction extends UnaryFunction {
    public $lucene_session_p$UnaryFunction() { super(extractFunctionNamed("LUCENE-SESSION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29220"); }
  }

  public static final SubLObject declare_lucene_session_file() {
    declareFunction("get_lucene_host", "GET-LUCENE-HOST", 0, 0, false);
    declareFunction("get_lucene_port", "GET-LUCENE-PORT", 0, 0, false);
    declareMacro("with_lucene_session", "WITH-LUCENE-SESSION");
    declareFunction("lucene_session_print_function_trampoline", "LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("lucene_session_p", "LUCENE-SESSION-P", 1, 0, false); new $lucene_session_p$UnaryFunction();
    declareFunction("lucene_host", "LUCENE-HOST", 1, 0, false);
    declareFunction("lucene_port", "LUCENE-PORT", 1, 0, false);
    declareFunction("lucene_connection", "LUCENE-CONNECTION", 1, 0, false);
    declareFunction("lucene_session_type", "LUCENE-SESSION-TYPE", 1, 0, false);
    declareFunction("lucene_index", "LUCENE-INDEX", 1, 0, false);
    declareFunction("lucene_overwrite", "LUCENE-OVERWRITE", 1, 0, false);
    declareFunction("_csetf_lucene_host", "_CSETF-LUCENE-HOST", 2, 0, false);
    declareFunction("_csetf_lucene_port", "_CSETF-LUCENE-PORT", 2, 0, false);
    declareFunction("_csetf_lucene_connection", "_CSETF-LUCENE-CONNECTION", 2, 0, false);
    declareFunction("_csetf_lucene_session_type", "_CSETF-LUCENE-SESSION-TYPE", 2, 0, false);
    declareFunction("_csetf_lucene_index", "_CSETF-LUCENE-INDEX", 2, 0, false);
    declareFunction("_csetf_lucene_overwrite", "_CSETF-LUCENE-OVERWRITE", 2, 0, false);
    declareFunction("make_lucene_session", "MAKE-LUCENE-SESSION", 0, 1, false);
    declareFunction("new_lucene_session", "NEW-LUCENE-SESSION", 4, 1, false);
    declareFunction("lucene_finalize", "LUCENE-FINALIZE", 1, 0, false);
    declareFunction("lucene_print", "LUCENE-PRINT", 3, 0, false);
    declareFunction("lucene_init", "LUCENE-INIT", 3, 0, false);
    declareFunction("lucene_new_index_writer", "LUCENE-NEW-INDEX-WRITER", 1, 1, false);
    declareFunction("lucene_close_index_writer", "LUCENE-CLOSE-INDEX-WRITER", 1, 0, false);
    declareFunction("default_lucene_confirmed_terms_boost", "DEFAULT-LUCENE-CONFIRMED-TERMS-BOOST", 0, 0, false);
    declareFunction("lucene_add_document", "LUCENE-ADD-DOCUMENT", 6, 2, false);
    declareFunction("lucene_optimize", "LUCENE-OPTIMIZE", 1, 0, false);
    declareFunction("lucene_query", "LUCENE-QUERY", 2, 1, false);
    declareFunction("lucene_send", "LUCENE-SEND", 3, 0, false);
    declareFunction("lucene_receive", "LUCENE-RECEIVE", 1, 0, false);
    declareFunction("lucene_execute", "LUCENE-EXECUTE", 3, 0, false);
    declareFunction("interpret_lucene_response", "INTERPRET-LUCENE-RESPONSE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_lucene_session_file() {
    $lucene_host$ = defparameter("*LUCENE-HOST*", $str0$semanticsearch);
    $lucene_port$ = defparameter("*LUCENE-PORT*", $int1$1928);
    $lucene_host_override$ = defparameter("*LUCENE-HOST-OVERRIDE*", NIL);
    $lucene_port_override$ = defparameter("*LUCENE-PORT-OVERRIDE*", NIL);
    $init_lucene_session$ = deflexical("*INIT-LUCENE-SESSION*", ZERO_INTEGER);
    $add_document$ = deflexical("*ADD-DOCUMENT*", ONE_INTEGER);
    $query$ = deflexical("*QUERY*", TWO_INTEGER);
    $optimize$ = deflexical("*OPTIMIZE*", THREE_INTEGER);
    $close_index$ = deflexical("*CLOSE-INDEX*", FOUR_INTEGER);
    $new_index_writer$ = deflexical("*NEW-INDEX-WRITER*", FIVE_INTEGER);
    $dtp_lucene_session$ = defconstant("*DTP-LUCENE-SESSION*", $sym11$LUCENE_SESSION);
    return NIL;
  }

  public static final SubLObject setup_lucene_session_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_lucene_session$.getGlobalValue(), Symbols.symbol_function($sym17$LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym18$LUCENE_HOST, $sym19$_CSETF_LUCENE_HOST);
    Structures.def_csetf($sym20$LUCENE_PORT, $sym21$_CSETF_LUCENE_PORT);
    Structures.def_csetf($sym22$LUCENE_CONNECTION, $sym23$_CSETF_LUCENE_CONNECTION);
    Structures.def_csetf($sym24$LUCENE_SESSION_TYPE, $sym25$_CSETF_LUCENE_SESSION_TYPE);
    Structures.def_csetf($sym26$LUCENE_INDEX, $sym27$_CSETF_LUCENE_INDEX);
    Structures.def_csetf($sym28$LUCENE_OVERWRITE, $sym29$_CSETF_LUCENE_OVERWRITE);
    Equality.identity($sym11$LUCENE_SESSION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$semanticsearch = makeString("semanticsearch");
  public static final SubLInteger $int1$1928 = makeInteger(1928);
  public static final SubLList $list2 = list(list(makeSymbol("SESSION"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), list(makeSymbol("GET-LUCENE-HOST"))), list(makeSymbol("PORT"), list(makeSymbol("GET-LUCENE-PORT")))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym5$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym6$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym7$NEW_LUCENE_SESSION = makeSymbol("NEW-LUCENE-SESSION");
  public static final SubLSymbol $sym8$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym9$LUCENE_SESSION_P = makeSymbol("LUCENE-SESSION-P");
  public static final SubLSymbol $sym10$LUCENE_FINALIZE = makeSymbol("LUCENE-FINALIZE");
  public static final SubLSymbol $sym11$LUCENE_SESSION = makeSymbol("LUCENE-SESSION");
  public static final SubLList $list12 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("CONNECTION"), makeSymbol("SESSION-TYPE"), makeSymbol("INDEX"), makeSymbol("OVERWRITE"));
  public static final SubLList $list13 = list(makeKeyword("HOST"), makeKeyword("PORT"), makeKeyword("CONNECTION"), makeKeyword("SESSION-TYPE"), makeKeyword("INDEX"), makeKeyword("OVERWRITE"));
  public static final SubLList $list14 = list(makeSymbol("LUCENE-HOST"), makeSymbol("LUCENE-PORT"), makeSymbol("LUCENE-CONNECTION"), makeSymbol("LUCENE-SESSION-TYPE"), makeSymbol("LUCENE-INDEX"), makeSymbol("LUCENE-OVERWRITE"));
  public static final SubLList $list15 = list(makeSymbol("_CSETF-LUCENE-HOST"), makeSymbol("_CSETF-LUCENE-PORT"), makeSymbol("_CSETF-LUCENE-CONNECTION"), makeSymbol("_CSETF-LUCENE-SESSION-TYPE"), makeSymbol("_CSETF-LUCENE-INDEX"), makeSymbol("_CSETF-LUCENE-OVERWRITE"));
  public static final SubLSymbol $sym16$LUCENE_PRINT = makeSymbol("LUCENE-PRINT");
  public static final SubLSymbol $sym17$LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym18$LUCENE_HOST = makeSymbol("LUCENE-HOST");
  public static final SubLSymbol $sym19$_CSETF_LUCENE_HOST = makeSymbol("_CSETF-LUCENE-HOST");
  public static final SubLSymbol $sym20$LUCENE_PORT = makeSymbol("LUCENE-PORT");
  public static final SubLSymbol $sym21$_CSETF_LUCENE_PORT = makeSymbol("_CSETF-LUCENE-PORT");
  public static final SubLSymbol $sym22$LUCENE_CONNECTION = makeSymbol("LUCENE-CONNECTION");
  public static final SubLSymbol $sym23$_CSETF_LUCENE_CONNECTION = makeSymbol("_CSETF-LUCENE-CONNECTION");
  public static final SubLSymbol $sym24$LUCENE_SESSION_TYPE = makeSymbol("LUCENE-SESSION-TYPE");
  public static final SubLSymbol $sym25$_CSETF_LUCENE_SESSION_TYPE = makeSymbol("_CSETF-LUCENE-SESSION-TYPE");
  public static final SubLSymbol $sym26$LUCENE_INDEX = makeSymbol("LUCENE-INDEX");
  public static final SubLSymbol $sym27$_CSETF_LUCENE_INDEX = makeSymbol("_CSETF-LUCENE-INDEX");
  public static final SubLSymbol $sym28$LUCENE_OVERWRITE = makeSymbol("LUCENE-OVERWRITE");
  public static final SubLSymbol $sym29$_CSETF_LUCENE_OVERWRITE = makeSymbol("_CSETF-LUCENE-OVERWRITE");
  public static final SubLSymbol $kw30$HOST = makeKeyword("HOST");
  public static final SubLSymbol $kw31$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw32$CONNECTION = makeKeyword("CONNECTION");
  public static final SubLSymbol $kw33$SESSION_TYPE = makeKeyword("SESSION-TYPE");
  public static final SubLSymbol $kw34$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw35$OVERWRITE = makeKeyword("OVERWRITE");
  public static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym37$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym38$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym39$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym40$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw41$CYC = makeKeyword("CYC");
  public static final SubLSymbol $kw42$TEXT = makeKeyword("TEXT");
  public static final SubLSymbol $kw43$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLString $str44$__LUCENE_SESSION_ = makeString("#<LUCENE-SESSION ");
  public static final SubLString $str45$_ = makeString(":");
  public static final SubLString $str46$_ = makeString(">");
  public static final SubLFloat $float47$1_0 = makeDouble(1.0);
  public static final SubLSymbol $sym48$POSITIVE_NUMBER_P = makeSymbol("POSITIVE-NUMBER-P");
  public static final SubLInteger $int49$50 = makeInteger(50);
  public static final SubLSymbol $sym50$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");

  //// Initializers

  public void declareFunctions() {
    declare_lucene_session_file();
  }

  public void initializeVariables() {
    init_lucene_session_file();
  }

  public void runTopLevelForms() {
    setup_lucene_session_file();
  }

}
