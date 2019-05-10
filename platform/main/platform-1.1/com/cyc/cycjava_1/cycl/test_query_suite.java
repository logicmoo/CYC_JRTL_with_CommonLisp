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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_query_specification;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.narts_high;

public  final class test_query_suite extends SubLTranslatedFile {

  //// Constructor

  private test_query_suite() {}
  public static final SubLFile me = new test_query_suite();
  public static final String myName = "com.cyc.cycjava_1.cycl.test_query_suite";

  //// Definitions

  public static final class $test_query_suite_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cycl_id; }
    public SubLObject getField3() { return $comment; }
    public SubLObject getField4() { return $mt; }
    public SubLObject getField5() { return $queries; }
    public SubLObject setField2(SubLObject value) { return $cycl_id = value; }
    public SubLObject setField3(SubLObject value) { return $comment = value; }
    public SubLObject setField4(SubLObject value) { return $mt = value; }
    public SubLObject setField5(SubLObject value) { return $queries = value; }
    public SubLObject $cycl_id = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $queries = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($test_query_suite_native.class, $sym0$TEST_QUERY_SUITE, $sym1$TEST_QUERY_SUITE_P, $list2, $list3, new String[] {"$cycl_id", "$comment", "$mt", "$queries"}, $list4, $list5, $sym6$TEST_QUERY_SUITE_PRINT);
  }

  @SubL(source = "cycl/test-query-suite.lisp", position = 1025) 
  public static SubLSymbol $dtp_test_query_suite$ = null;

  @SubL(source = "cycl/test-query-suite.lisp", position = 1025) 
  public static final SubLObject test_query_suite_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23172");
    return NIL;
  }

  public static final class $test_query_suite_p$UnaryFunction extends UnaryFunction {
    public $test_query_suite_p$UnaryFunction() { super(extractFunctionNamed("TEST-QUERY-SUITE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23171"); }
  }

  public static final SubLObject declare_test_query_suite_file() {
    declareFunction(myName, "test_query_suite_print_function_trampoline", "TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "test_query_suite_p", "TEST-QUERY-SUITE-P", 1, 0, false); new $test_query_suite_p$UnaryFunction();
    declareFunction(myName, "test_ste_cycl_id", "TEST-STE-CYCL-ID", 1, 0, false);
    declareFunction(myName, "test_ste_comment", "TEST-STE-COMMENT", 1, 0, false);
    declareFunction(myName, "test_ste_mt", "TEST-STE-MT", 1, 0, false);
    declareFunction(myName, "test_ste_queries", "TEST-STE-QUERIES", 1, 0, false);
    declareFunction(myName, "_csetf_test_ste_cycl_id", "_CSETF-TEST-STE-CYCL-ID", 2, 0, false);
    declareFunction(myName, "_csetf_test_ste_comment", "_CSETF-TEST-STE-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_test_ste_mt", "_CSETF-TEST-STE-MT", 2, 0, false);
    declareFunction(myName, "_csetf_test_ste_queries", "_CSETF-TEST-STE-QUERIES", 2, 0, false);
    declareFunction(myName, "make_test_query_suite", "MAKE-TEST-QUERY-SUITE", 0, 1, false);
    declareFunction(myName, "test_query_suite_cycl_id", "TEST-QUERY-SUITE-CYCL-ID", 1, 0, false);
    declareFunction(myName, "test_query_suite_comment", "TEST-QUERY-SUITE-COMMENT", 1, 0, false);
    declareFunction(myName, "test_query_suite_mt", "TEST-QUERY-SUITE-MT", 1, 0, false);
    declareFunction(myName, "test_query_suite_queries", "TEST-QUERY-SUITE-QUERIES", 1, 0, false);
    declareFunction(myName, "test_query_suite_print", "TEST-QUERY-SUITE-PRINT", 3, 1, false);
    declareFunction(myName, "test_query_suite_get", "TEST-QUERY-SUITE-GET", 1, 1, false);
    declareFunction(myName, "test_query_suite_find_query_by_id", "TEST-QUERY-SUITE-FIND-QUERY-BY-ID", 2, 0, false);
    declareFunction(myName, "test_query_suite_set_queries", "TEST-QUERY-SUITE-SET-QUERIES", 2, 0, false);
    declareFunction(myName, "test_query_suite_find_query_siblings", "TEST-QUERY-SUITE-FIND-QUERY-SIBLINGS", 2, 0, false);
    declareFunction(myName, "test_query_suite_new", "TEST-QUERY-SUITE-NEW", 2, 0, false);
    declareFunction(myName, "cycl_query_specification_comment_comparator", "CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR", 2, 0, false);
    declareFunction(myName, "test_query_suite_sort_by_comment", "TEST-QUERY-SUITE-SORT-BY-COMMENT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_test_query_suite_file() {
    $dtp_test_query_suite$ = defconstant("*DTP-TEST-QUERY-SUITE*", $sym0$TEST_QUERY_SUITE);
    return NIL;
  }

  public static final SubLObject setup_test_query_suite_file() {
    // CVS_ID("Id: test-query-suite.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_test_query_suite$.getGlobalValue(), Symbols.symbol_function($sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TEST_STE_CYCL_ID, $sym9$_CSETF_TEST_STE_CYCL_ID);
    Structures.def_csetf($sym10$TEST_STE_COMMENT, $sym11$_CSETF_TEST_STE_COMMENT);
    Structures.def_csetf($sym12$TEST_STE_MT, $sym13$_CSETF_TEST_STE_MT);
    Structures.def_csetf($sym14$TEST_STE_QUERIES, $sym15$_CSETF_TEST_STE_QUERIES);
    Equality.identity($sym0$TEST_QUERY_SUITE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TEST_QUERY_SUITE = makeSymbol("TEST-QUERY-SUITE");
  public static final SubLSymbol $sym1$TEST_QUERY_SUITE_P = makeSymbol("TEST-QUERY-SUITE-P");
  public static final SubLList $list2 = list(makeSymbol("CYCL-ID"), makeSymbol("COMMENT"), makeSymbol("MT"), makeSymbol("QUERIES"));
  public static final SubLList $list3 = list(makeKeyword("CYCL-ID"), makeKeyword("COMMENT"), makeKeyword("MT"), makeKeyword("QUERIES"));
  public static final SubLList $list4 = list(makeSymbol("TEST-STE-CYCL-ID"), makeSymbol("TEST-STE-COMMENT"), makeSymbol("TEST-STE-MT"), makeSymbol("TEST-STE-QUERIES"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-TEST-STE-CYCL-ID"), makeSymbol("_CSETF-TEST-STE-COMMENT"), makeSymbol("_CSETF-TEST-STE-MT"), makeSymbol("_CSETF-TEST-STE-QUERIES"));
  public static final SubLSymbol $sym6$TEST_QUERY_SUITE_PRINT = makeSymbol("TEST-QUERY-SUITE-PRINT");
  public static final SubLSymbol $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TEST_STE_CYCL_ID = makeSymbol("TEST-STE-CYCL-ID");
  public static final SubLSymbol $sym9$_CSETF_TEST_STE_CYCL_ID = makeSymbol("_CSETF-TEST-STE-CYCL-ID");
  public static final SubLSymbol $sym10$TEST_STE_COMMENT = makeSymbol("TEST-STE-COMMENT");
  public static final SubLSymbol $sym11$_CSETF_TEST_STE_COMMENT = makeSymbol("_CSETF-TEST-STE-COMMENT");
  public static final SubLSymbol $sym12$TEST_STE_MT = makeSymbol("TEST-STE-MT");
  public static final SubLSymbol $sym13$_CSETF_TEST_STE_MT = makeSymbol("_CSETF-TEST-STE-MT");
  public static final SubLSymbol $sym14$TEST_STE_QUERIES = makeSymbol("TEST-STE-QUERIES");
  public static final SubLSymbol $sym15$_CSETF_TEST_STE_QUERIES = makeSymbol("_CSETF-TEST-STE-QUERIES");
  public static final SubLSymbol $kw16$CYCL_ID = makeKeyword("CYCL-ID");
  public static final SubLSymbol $kw17$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw18$MT = makeKeyword("MT");
  public static final SubLSymbol $kw19$QUERIES = makeKeyword("QUERIES");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$___A_test_query_suite___ = makeString("~%~A<test-query-suite:~%");
  public static final SubLString $str22$_Aid___A__ = makeString("~Aid: ~A~%");
  public static final SubLString $str23$_Acomment___A__ = makeString("~Acomment: ~A~%");
  public static final SubLString $str24$_Amt___A__ = makeString("~Amt: ~A~%");
  public static final SubLString $str25$_Aqueries_ = makeString("~Aqueries:");
  public static final SubLString $str26$__S = makeString(" ~S");
  public static final SubLString $str27$_ = makeString(">");
  public static final SubLSymbol $sym28$CYCL_DENOTATIONAL_TERM_P = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
  public static final SubLObject $const29$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell(makeString("KBContentTestSpecificationType"));
  public static final SubLString $str30$Got_bad_constant_id_in_test_query = makeString("Got bad constant-id in test-query-suite-get!");
  public static final SubLSymbol $sym31$MICROTHEORY_P = makeSymbol("MICROTHEORY-P");
  public static final SubLObject $const32$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym33$_TEST = makeSymbol("?TEST");
  public static final SubLObject $const34$TestQueryFn = constant_handles.reader_make_constant_shell(makeString("TestQueryFn"));
  public static final SubLString $str35$ = makeString("");
  public static final SubLSymbol $sym36$STRING_LESSP = makeSymbol("STRING-LESSP");
  public static final SubLSymbol $sym37$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR = makeSymbol("CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR");

  //// Initializers

  public void declareFunctions() {
    declare_test_query_suite_file();
  }

  public void initializeVariables() {
    init_test_query_suite_file();
  }

  public void runTopLevelForms() {
    setup_test_query_suite_file();
  }

}
