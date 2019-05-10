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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.xml_utilities;

public  final class cycml_generator extends SubLTranslatedFile {

  //// Constructor

  private cycml_generator() {}
  public static final SubLFile me = new cycml_generator();
  public static final String myName = "com.cyc.cycjava_1.cycl.cycml_generator";

  //// Definitions

  public static final class $cycml_kp_info_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $knowledge_package_id; }
    public SubLObject getField3() { return $knowledge_package_dependencies; }
    public SubLObject getField4() { return $operations; }
    public SubLObject setField2(SubLObject value) { return $knowledge_package_id = value; }
    public SubLObject setField3(SubLObject value) { return $knowledge_package_dependencies = value; }
    public SubLObject setField4(SubLObject value) { return $operations = value; }
    public SubLObject $knowledge_package_id = NIL;
    public SubLObject $knowledge_package_dependencies = NIL;
    public SubLObject $operations = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cycml_kp_info_native.class, $sym27$CYCML_KP_INFO, $sym28$CYCML_KP_INFO_P, $list29, $list30, new String[] {"$knowledge_package_id", "$knowledge_package_dependencies", "$operations"}, $list31, $list32, $sym33$PRINT_CYCML_KP_INFO);
  }

  @SubL(source = "cycl/cycml-generator.lisp", position = 3047) 
  public static SubLSymbol $dtp_cycml_kp_info$ = null;

  @SubL(source = "cycl/cycml-generator.lisp", position = 3047) 
  public static final SubLObject cycml_kp_info_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4133");
    return NIL;
  }

  public static final class $cycml_kp_info_p$UnaryFunction extends UnaryFunction {
    public $cycml_kp_info_p$UnaryFunction() { super(extractFunctionNamed("CYCML-KP-INFO-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4065"); }
  }

  /** When T the serialization context is within an atomic sentence and lists
are more likely to be interpreted as el nats. */
  @SubL(source = "cycl/cycml-generator.lisp", position = 33271) 
  private static SubLSymbol $within_cycl_atomic_sentenceP$ = null;

  public static final SubLObject declare_cycml_generator_file() {
    //declareFunction(myName, "cycml_serialize_knowledge_package_info", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-INFO", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_api_request", "CYCML-SERIALIZE-API-REQUEST", 5, 0, false);
    //declareFunction(myName, "cycml_serialize_justification", "CYCML-SERIALIZE-JUSTIFICATION", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_truth", "CYCML-SERIALIZE-TRUTH", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_api_request_requestor", "CYCML-SERIALIZE-API-REQUEST-REQUESTOR", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_api_request_priority", "CYCML-SERIALIZE-API-REQUEST-PRIORITY", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_api_request_id", "CYCML-SERIALIZE-API-REQUEST-ID", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_nonnegativeinteger", "CYCML-SERIALIZE-NONNEGATIVEINTEGER", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_positiveinteger", "CYCML-SERIALIZE-POSITIVEINTEGER", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_new_name", "CYCML-SERIALIZE-NEW-NAME", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_date", "CYCML-SERIALIZE-DATE", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_time", "CYCML-SERIALIZE-TIME", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_cyc_image_id", "CYCML-SERIALIZE-CYC-IMAGE-ID", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_knowledge_package_id", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-ID", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_sublsymbol", "CYCML-SERIALIZE-SUBLSYMBOL", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_sublstring", "CYCML-SERIALIZE-SUBLSTRING", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_sublrealnumber", "CYCML-SERIALIZE-SUBLREALNUMBER", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_cyclvariable", "CYCML-SERIALIZE-CYCLVARIABLE", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_uri", "CYCML-SERIALIZE-URI", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_namespace", "CYCML-SERIALIZE-NAMESPACE", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_false", "CYCML-SERIALIZE-FALSE", 1, 1, false);
    //declareFunction(myName, "cycml_serialize_true", "CYCML-SERIALIZE-TRUE", 1, 1, false);
    declareFunction(myName, "cycml_kp_info_print_function_trampoline", "CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "cycml_kp_info_p", "CYCML-KP-INFO-P", 1, 0, false); new $cycml_kp_info_p$UnaryFunction();
    //declareFunction(myName, "cycml_kp_info_knowledge_package_id", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 1, 0, false);
    //declareFunction(myName, "cycml_kp_info_knowledge_package_dependencies", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 1, 0, false);
    //declareFunction(myName, "cycml_kp_info_operations", "CYCML-KP-INFO-OPERATIONS", 1, 0, false);
    //declareFunction(myName, "_csetf_cycml_kp_info_knowledge_package_id", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_cycml_kp_info_knowledge_package_dependencies", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 2, 0, false);
    //declareFunction(myName, "_csetf_cycml_kp_info_operations", "_CSETF-CYCML-KP-INFO-OPERATIONS", 2, 0, false);
    //declareFunction(myName, "make_cycml_kp_info", "MAKE-CYCML-KP-INFO", 0, 1, false);
    //declareFunction(myName, "print_cycml_kp_info", "PRINT-CYCML-KP-INFO", 3, 0, false);
    //declareFunction(myName, "cycml_add_create_constant_oper", "CYCML-ADD-CREATE-CONSTANT-OPER", 2, 5, false);
    //declareFunction(myName, "cycml_add_find_or_create_constant_oper", "CYCML-ADD-FIND-OR-CREATE-CONSTANT-OPER", 2, 5, false);
    //declareFunction(myName, "cycml_add_rename_constant_oper", "CYCML-ADD-RENAME-CONSTANT-OPER", 3, 2, false);
    //declareFunction(myName, "cycml_add_merge_fort_oper", "CYCML-ADD-MERGE-FORT-OPER", 3, 2, false);
    //declareFunction(myName, "cycml_add_kill_fort_oper", "CYCML-ADD-KILL-FORT-OPER", 2, 3, false);
    //declareFunction(myName, "cycml_add_assert_oper", "CYCML-ADD-ASSERT-OPER", 2, 8, false);
    //declareFunction(myName, "cycml_add_reassert_oper", "CYCML-ADD-REASSERT-OPER", 2, 8, false);
    //declareFunction(myName, "cycml_add_unassert_oper", "CYCML-ADD-UNASSERT-OPER", 2, 4, false);
    //declareFunction(myName, "cycml_add_blast_assertion_oper", "CYCML-ADD-BLAST-ASSERTION-OPER", 2, 4, false);
    //declareFunction(myName, "cycml_add_create_skolem_oper", "CYCML-ADD-CREATE-SKOLEM-OPER", 9, 0, false);
    //declareFunction(myName, "cycml_serialize_knowledge_package", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_operation", "CYCML-SERIALIZE-OPERATION", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_create_constant_oper", "CYCML-SERIALIZE-CREATE-CONSTANT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_find_or_create_constant_oper", "CYCML-SERIALIZE-FIND-OR-CREATE-CONSTANT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_rename_constant_oper", "CYCML-SERIALIZE-RENAME-CONSTANT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_merge_forts_oper", "CYCML-SERIALIZE-MERGE-FORTS-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_kill_fort_oper", "CYCML-SERIALIZE-KILL-FORT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_assert_oper", "CYCML-SERIALIZE-ASSERT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_reassert_oper", "CYCML-SERIALIZE-REASSERT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_unassert_oper", "CYCML-SERIALIZE-UNASSERT-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_blast_assertion_oper", "CYCML-SERIALIZE-BLAST-ASSERTION-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_create_skolem_oper", "CYCML-SERIALIZE-CREATE-SKOLEM-OPER", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_bookkeeping", "CYCML-SERIALIZE-BOOKKEEPING", 5, 0, false);
    //declareFunction(myName, "cycml_serialize_microtheory", "CYCML-SERIALIZE-MICROTHEORY", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_fort", "CYCML-SERIALIZE-FORT", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_cyclconstant", "CYCML-SERIALIZE-CYCLCONSTANT", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_cyclreifiednonatomicterm", "CYCML-SERIALIZE-CYCLREIFIEDNONATOMICTERM", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_cyclreifiablenonatomicterm", "CYCML-SERIALIZE-CYCLREIFIABLENONATOMICTERM", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_elnonatomicterm", "CYCML-SERIALIZE-ELNONATOMICTERM", 1, 0, false);
    //declareMacro(myName, "within_cycl_atomic_sentence", "WITHIN-CYCL-ATOMIC-SENTENCE");
    //declareFunction(myName, "cycml_serialize_object", "CYCML-SERIALIZE-OBJECT", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_object_to_string", "CYCML-SERIALIZE-OBJECT-TO-STRING", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_subllist", "CYCML-SERIALIZE-SUBLLIST", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_cyclsentence", "CYCML-SERIALIZE-CYCLSENTENCE", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_cyclatomicsentence", "CYCML-SERIALIZE-CYCLATOMICSENTENCE", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_purpose", "CYCML-SERIALIZE-PURPOSE", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_universal_date", "CYCML-SERIALIZE-UNIVERSAL-DATE", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_universal_second", "CYCML-SERIALIZE-UNIVERSAL-SECOND", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_support", "CYCML-SERIALIZE-SUPPORT", 1, 0, false);
    //declareFunction(myName, "cycml_serialize_hl_support", "CYCML-SERIALIZE-HL-SUPPORT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cycml_generator_file() {
    $dtp_cycml_kp_info$ = defconstant("*DTP-CYCML-KP-INFO*", $sym27$CYCML_KP_INFO);
    $within_cycl_atomic_sentenceP$ = defparameter("*WITHIN-CYCL-ATOMIC-SENTENCE?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_cycml_generator_file() {
    // CVS_ID("Id: cycml-generator.lisp 126721 2008-12-18 19:14:07Z baxter ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cycml_kp_info$.getGlobalValue(), Symbols.symbol_function($sym34$CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym35$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID, $sym36$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID);
    Structures.def_csetf($sym37$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES, $sym38$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES);
    Structures.def_csetf($sym39$CYCML_KP_INFO_OPERATIONS, $sym40$_CSETF_CYCML_KP_INFO_OPERATIONS);
    Equality.identity($sym27$CYCML_KP_INFO);
    access_macros.register_external_symbol($sym109$CYCML_SERIALIZE_OBJECT_TO_STRING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym1$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym2$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str3$__ = makeString("~&");
  public static final SubLString $str4$api_request_message = makeString("api-request-message");
  public static final SubLString $str5$api_request = makeString("api-request");
  public static final SubLString $str6$api_request_bindings = makeString("api-request-bindings");
  public static final SubLString $str7$justification = makeString("justification");
  public static final SubLString $str8$truth = makeString("truth");
  public static final SubLString $str9$api_request_requestor = makeString("api-request-requestor");
  public static final SubLString $str10$api_request_priority = makeString("api-request-priority");
  public static final SubLString $str11$api_request_id = makeString("api-request-id");
  public static final SubLString $str12$nonnegativeinteger = makeString("nonnegativeinteger");
  public static final SubLString $str13$positiveinteger = makeString("positiveinteger");
  public static final SubLString $str14$new_name = makeString("new-name");
  public static final SubLString $str15$date = makeString("date");
  public static final SubLString $str16$time = makeString("time");
  public static final SubLString $str17$cyc_image_id = makeString("cyc-image-id");
  public static final SubLString $str18$knowledge_package_id = makeString("knowledge-package-id");
  public static final SubLString $str19$sublsymbol = makeString("sublsymbol");
  public static final SubLString $str20$sublstring = makeString("sublstring");
  public static final SubLString $str21$sublrealnumber = makeString("sublrealnumber");
  public static final SubLString $str22$cyclvariable = makeString("cyclvariable");
  public static final SubLString $str23$uri = makeString("uri");
  public static final SubLString $str24$namespace = makeString("namespace");
  public static final SubLString $str25$false = makeString("false");
  public static final SubLString $str26$true = makeString("true");
  public static final SubLSymbol $sym27$CYCML_KP_INFO = makeSymbol("CYCML-KP-INFO");
  public static final SubLSymbol $sym28$CYCML_KP_INFO_P = makeSymbol("CYCML-KP-INFO-P");
  public static final SubLList $list29 = list(makeSymbol("KNOWLEDGE-PACKAGE-ID"), makeSymbol("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("OPERATIONS"));
  public static final SubLList $list30 = list(makeKeyword("KNOWLEDGE-PACKAGE-ID"), makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeKeyword("OPERATIONS"));
  public static final SubLList $list31 = list(makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("CYCML-KP-INFO-OPERATIONS"));
  public static final SubLList $list32 = list(makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS"));
  public static final SubLSymbol $sym33$PRINT_CYCML_KP_INFO = makeSymbol("PRINT-CYCML-KP-INFO");
  public static final SubLSymbol $sym34$CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym35$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");
  public static final SubLSymbol $sym36$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");
  public static final SubLSymbol $sym37$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");
  public static final SubLSymbol $sym38$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");
  public static final SubLSymbol $sym39$CYCML_KP_INFO_OPERATIONS = makeSymbol("CYCML-KP-INFO-OPERATIONS");
  public static final SubLSymbol $sym40$_CSETF_CYCML_KP_INFO_OPERATIONS = makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS");
  public static final SubLSymbol $kw41$KNOWLEDGE_PACKAGE_ID = makeKeyword("KNOWLEDGE-PACKAGE-ID");
  public static final SubLSymbol $kw42$KNOWLEDGE_PACKAGE_DEPENDENCIES = makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES");
  public static final SubLSymbol $kw43$OPERATIONS = makeKeyword("OPERATIONS");
  public static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str45$__CYCML_KP_INFO_ = makeString("#<CYCML-KP-INFO:");
  public static final SubLSymbol $sym46$CYCL_CONSTANT_P = makeSymbol("CYCL-CONSTANT-P");
  public static final SubLSymbol $sym47$CYCL_FORT_P = makeSymbol("CYCL-FORT-P");
  public static final SubLSymbol $kw48$CREATE = makeKeyword("CREATE");
  public static final SubLSymbol $kw49$FIND_OR_CREATE = makeKeyword("FIND-OR-CREATE");
  public static final SubLSymbol $sym50$VALID_CONSTANT_NAME_P = makeSymbol("VALID-CONSTANT-NAME-P");
  public static final SubLSymbol $kw51$RENAME = makeKeyword("RENAME");
  public static final SubLSymbol $kw52$MERGE = makeKeyword("MERGE");
  public static final SubLSymbol $kw53$KILL = makeKeyword("KILL");
  public static final SubLSymbol $sym54$CYCL_SENTENCE_P = makeSymbol("CYCL-SENTENCE-P");
  public static final SubLSymbol $sym55$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym56$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $kw57$ASSERT = makeKeyword("ASSERT");
  public static final SubLSymbol $kw58$REASSERT = makeKeyword("REASSERT");
  public static final SubLSymbol $kw59$UNASSERT = makeKeyword("UNASSERT");
  public static final SubLSymbol $kw60$BLAST = makeKeyword("BLAST");
  public static final SubLSymbol $sym61$CONSTANT_EXTERNAL_ID_P = makeSymbol("CONSTANT-EXTERNAL-ID-P");
  public static final SubLSymbol $sym62$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw63$CREATE_SKOLEM = makeKeyword("CREATE-SKOLEM");
  public static final SubLString $str64$cycml = makeString("cycml");
  public static final SubLString $str65$knowledge_package = makeString("knowledge-package");
  public static final SubLString $str66$knowledge_package_dependencies = makeString("knowledge-package-dependencies");
  public static final SubLString $str67$operations = makeString("operations");
  public static final SubLList $list68 = list(makeSymbol("CONSTANT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE"));
  public static final SubLString $str69$create = makeString("create");
  public static final SubLString $str70$find_or_create = makeString("find-or-create");
  public static final SubLList $list71 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));
  public static final SubLString $str72$rename = makeString("rename");
  public static final SubLList $list73 = list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));
  public static final SubLString $str74$merge = makeString("merge");
  public static final SubLList $list75 = list(makeSymbol("FORT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));
  public static final SubLString $str76$kill = makeString("kill");
  public static final SubLList $list77 = list(new SubLObject[] {makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE")});
  public static final SubLString $str78$assert = makeString("assert");
  public static final SubLList $list79 = list(makeString("lang"), makeString("en"));
  public static final SubLString $str80$reassert = makeString("reassert");
  public static final SubLList $list81 = list(makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));
  public static final SubLString $str82$unassert = makeString("unassert");
  public static final SubLString $str83$blast = makeString("blast");
  public static final SubLList $list84 = list(makeSymbol("EXTERNAL-ID"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"), makeSymbol("ARG-TYPES"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));
  public static final SubLString $str85$create_skolem = makeString("create-skolem");
  public static final SubLString $str86$skolem_unreified_term = makeString("skolem-unreified-term");
  public static final SubLString $str87$skolem_conjunctive_normal_form = makeString("skolem-conjunctive-normal-form");
  public static final SubLString $str88$skolem_arg_types = makeString("skolem-arg-types");
  public static final SubLSymbol $sym89$UNIVERSAL_SECOND_P = makeSymbol("UNIVERSAL-SECOND-P");
  public static final SubLString $str90$bookkeeping_info = makeString("bookkeeping-info");
  public static final SubLString $str91$Cyclist = makeString("Cyclist");
  public static final SubLString $str92$Microtheory = makeString("Microtheory");
  public static final SubLString $str93$CycLConstant = makeString("CycLConstant");
  public static final SubLString $str94$urn_uuid_ = makeString("urn:uuid:");
  public static final SubLSymbol $sym95$CYCL_NART_P = makeSymbol("CYCL-NART-P");
  public static final SubLString $str96$_S_is_not_a_reified_nart = makeString("~S is not a reified nart");
  public static final SubLString $str97$CycLReifiedNonAtomicTerm = makeString("CycLReifiedNonAtomicTerm");
  public static final SubLString $str98$Function_Denotational = makeString("Function-Denotational");
  public static final SubLString $str99$argument_list = makeString("argument-list");
  public static final SubLString $str100$CycLReifiableNonAtomicTerm = makeString("CycLReifiableNonAtomicTerm");
  public static final SubLSymbol $sym101$CYCL_NAT_P = makeSymbol("CYCL-NAT-P");
  public static final SubLString $str102$ELNonAtomicTerm = makeString("ELNonAtomicTerm");
  public static final SubLSymbol $sym103$CLET = makeSymbol("CLET");
  public static final SubLList $list104 = list(list(makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*"), T));
  public static final SubLObject $const105$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLString $str106$ = makeString("");
  public static final SubLObject $const107$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLString $str108$__is_unknown_type_for_CycML_seria = makeString("~ is unknown type for CycML serialization.");
  public static final SubLSymbol $sym109$CYCML_SERIALIZE_OBJECT_TO_STRING = makeSymbol("CYCML-SERIALIZE-OBJECT-TO-STRING");
  public static final SubLString $str110$SubLList = makeString("SubLList");
  public static final SubLString $str111$dotted_item = makeString("dotted-item");
  public static final SubLObject $const112$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLString $str113$not = makeString("not");
  public static final SubLObject $const114$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLString $str115$and = makeString("and");
  public static final SubLObject $const116$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLString $str117$or = makeString("or");
  public static final SubLObject $const118$xor = constant_handles.reader_make_constant_shell(makeString("xor"));
  public static final SubLString $str119$xor = makeString("xor");
  public static final SubLObject $const120$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLString $str121$implies = makeString("implies");
  public static final SubLObject $const122$equiv = constant_handles.reader_make_constant_shell(makeString("equiv"));
  public static final SubLString $str123$equiv = makeString("equiv");
  public static final SubLObject $const124$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLString $str125$forAll = makeString("forAll");
  public static final SubLObject $const126$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLString $str127$thereExists = makeString("thereExists");
  public static final SubLObject $const128$thereExistExactly = constant_handles.reader_make_constant_shell(makeString("thereExistExactly"));
  public static final SubLString $str129$thereExistExactly = makeString("thereExistExactly");
  public static final SubLObject $const130$thereExistAtMost = constant_handles.reader_make_constant_shell(makeString("thereExistAtMost"));
  public static final SubLString $str131$thereExistAtMost = makeString("thereExistAtMost");
  public static final SubLObject $const132$thereExistAtLeast = constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast"));
  public static final SubLString $str133$thereExistAtLeast = makeString("thereExistAtLeast");
  public static final SubLSymbol $sym134$CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");
  public static final SubLObject $const135$OpenCycDefinitionalPredicate = constant_handles.reader_make_constant_shell(makeString("OpenCycDefinitionalPredicate"));
  public static final SubLString $str136$CycLAtomicSentence = makeString("CycLAtomicSentence");
  public static final SubLString $str137$Predicate = makeString("Predicate");
  public static final SubLString $str138$purpose = makeString("purpose");
  public static final SubLString $str139$_A__A__A = makeString("~A-~A-~A");
  public static final SubLString $str140$_6__0D = makeString("~6,'0D");
  public static final SubLString $str141$hl_support = makeString("hl-support");
  public static final SubLString $str142$module_token = makeString("module-token");

  //// Initializers

  public void declareFunctions() {
    declare_cycml_generator_file();
  }

  public void initializeVariables() {
    init_cycml_generator_file();
  }

  public void runTopLevelForms() {
    setup_cycml_generator_file();
  }

}
