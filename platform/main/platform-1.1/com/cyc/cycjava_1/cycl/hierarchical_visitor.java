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
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class hierarchical_visitor extends SubLTranslatedFile {

  //// Constructor

  private hierarchical_visitor() {}
  public static final SubLFile me = new hierarchical_visitor();
  public static final String myName = "com.cyc.cycjava_1.cycl.hierarchical_visitor";

  //// Definitions

  /** The default value to use for a hierarchical visitor when 
   the callback is not supposed to do anything. */
  @SubL(source = "cycl/hierarchical-visitor.lisp", position = 1739) 
  public static SubLSymbol $default_hierarchical_visitor_noop_callback$ = null;

  public static final class $hierarchical_visitor_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $begin_path_fn; }
    public SubLObject getField3() { return $end_path_fn; }
    public SubLObject getField4() { return $accept_node_fn; }
    public SubLObject getField5() { return $begin_visit_fn; }
    public SubLObject getField6() { return $end_visit_fn; }
    public SubLObject getField7() { return $param; }
    public SubLObject setField2(SubLObject value) { return $begin_path_fn = value; }
    public SubLObject setField3(SubLObject value) { return $end_path_fn = value; }
    public SubLObject setField4(SubLObject value) { return $accept_node_fn = value; }
    public SubLObject setField5(SubLObject value) { return $begin_visit_fn = value; }
    public SubLObject setField6(SubLObject value) { return $end_visit_fn = value; }
    public SubLObject setField7(SubLObject value) { return $param = value; }
    public SubLObject $begin_path_fn = NIL;
    public SubLObject $end_path_fn = NIL;
    public SubLObject $accept_node_fn = NIL;
    public SubLObject $begin_visit_fn = NIL;
    public SubLObject $end_visit_fn = NIL;
    public SubLObject $param = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($hierarchical_visitor_native.class, $sym1$HIERARCHICAL_VISITOR, $sym2$HIERARCHICAL_VISITOR_P, $list3, $list4, new String[] {"$begin_path_fn", "$end_path_fn", "$accept_node_fn", "$begin_visit_fn", "$end_visit_fn", "$param"}, $list5, $list6, $sym7$PRINT_HIERACHICAL_VISITOR);
  }

  @SubL(source = "cycl/hierarchical-visitor.lisp", position = 1934) 
  public static SubLSymbol $dtp_hierarchical_visitor$ = null;

  @SubL(source = "cycl/hierarchical-visitor.lisp", position = 1934) 
  public static final SubLObject hierarchical_visitor_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30458");
    return NIL;
  }

  public static final class $hierarchical_visitor_p$UnaryFunction extends UnaryFunction {
    public $hierarchical_visitor_p$UnaryFunction() { super(extractFunctionNamed("HIERARCHICAL-VISITOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30454"); }
  }

  public static final SubLObject declare_hierarchical_visitor_file() {
    declareFunction(myName, "hierarchical_visitor_print_function_trampoline", "HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "hierarchical_visitor_p", "HIERARCHICAL-VISITOR-P", 1, 0, false); new $hierarchical_visitor_p$UnaryFunction();
    declareFunction(myName, "hier_visit_begin_path_fn", "HIER-VISIT-BEGIN-PATH-FN", 1, 0, false);
    declareFunction(myName, "hier_visit_end_path_fn", "HIER-VISIT-END-PATH-FN", 1, 0, false);
    declareFunction(myName, "hier_visit_accept_node_fn", "HIER-VISIT-ACCEPT-NODE-FN", 1, 0, false);
    declareFunction(myName, "hier_visit_begin_visit_fn", "HIER-VISIT-BEGIN-VISIT-FN", 1, 0, false);
    declareFunction(myName, "hier_visit_end_visit_fn", "HIER-VISIT-END-VISIT-FN", 1, 0, false);
    declareFunction(myName, "hier_visit_param", "HIER-VISIT-PARAM", 1, 0, false);
    declareFunction(myName, "_csetf_hier_visit_begin_path_fn", "_CSETF-HIER-VISIT-BEGIN-PATH-FN", 2, 0, false);
    declareFunction(myName, "_csetf_hier_visit_end_path_fn", "_CSETF-HIER-VISIT-END-PATH-FN", 2, 0, false);
    declareFunction(myName, "_csetf_hier_visit_accept_node_fn", "_CSETF-HIER-VISIT-ACCEPT-NODE-FN", 2, 0, false);
    declareFunction(myName, "_csetf_hier_visit_begin_visit_fn", "_CSETF-HIER-VISIT-BEGIN-VISIT-FN", 2, 0, false);
    declareFunction(myName, "_csetf_hier_visit_end_visit_fn", "_CSETF-HIER-VISIT-END-VISIT-FN", 2, 0, false);
    declareFunction(myName, "_csetf_hier_visit_param", "_CSETF-HIER-VISIT-PARAM", 2, 0, false);
    declareFunction(myName, "make_hierarchical_visitor", "MAKE-HIERARCHICAL-VISITOR", 0, 1, false);
    declareFunction(myName, "print_hierachical_visitor", "PRINT-HIERACHICAL-VISITOR", 3, 0, false);
    declareFunction(myName, "new_hiearchical_visitor", "NEW-HIEARCHICAL-VISITOR", 5, 1, false);
    declareFunction(myName, "new_simple_hierarchical_visitor", "NEW-SIMPLE-HIERARCHICAL-VISITOR", 3, 1, false);
    declareFunction(myName, "hierarchical_visitor_begin_visit", "HIERARCHICAL-VISITOR-BEGIN-VISIT", 1, 0, false);
    declareFunction(myName, "hierarchical_visitor_end_visit", "HIERARCHICAL-VISITOR-END-VISIT", 1, 0, false);
    declareFunction(myName, "show_hierarchical_visitor_node", "SHOW-HIERARCHICAL-VISITOR-NODE", 2, 0, false);
    declareFunction(myName, "show_hierarchical_visitor_path_begin", "SHOW-HIERARCHICAL-VISITOR-PATH-BEGIN", 2, 0, false);
    declareFunction(myName, "show_hierarchical_visitor_path_end", "SHOW-HIERARCHICAL-VISITOR-PATH-END", 2, 0, false);
    declareFunction(myName, "set_hierarchical_visitor_parameter", "SET-HIERARCHICAL-VISITOR-PARAMETER", 2, 0, false);
    declareFunction(myName, "get_hierarchical_visitor_parameter", "GET-HIERARCHICAL-VISITOR-PARAMETER", 1, 0, false);
    declareFunction(myName, "new_hierarchical_print_visitor", "NEW-HIERARCHICAL-PRINT-VISITOR", 0, 0, false);
    declareFunction(myName, "print_hier_visitor_begin_visit", "PRINT-HIER-VISITOR-BEGIN-VISIT", 1, 0, false);
    declareFunction(myName, "print_hier_visitor_end_visit", "PRINT-HIER-VISITOR-END-VISIT", 1, 0, false);
    declareFunction(myName, "print_hier_visitor_begin_path", "PRINT-HIER-VISITOR-BEGIN-PATH", 2, 0, false);
    declareFunction(myName, "print_hier_visitor_end_path", "PRINT-HIER-VISITOR-END-PATH", 2, 0, false);
    declareFunction(myName, "print_hier_visitor_accept_node", "PRINT-HIER-VISITOR-ACCEPT-NODE", 2, 0, false);
    declareFunction(myName, "new_no_op_hierarchical_visitor", "NEW-NO-OP-HIERARCHICAL-VISITOR", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_hierarchical_visitor_file() {
    $default_hierarchical_visitor_noop_callback$ = deflexical("*DEFAULT-HIERARCHICAL-VISITOR-NOOP-CALLBACK*", Symbols.symbol_function($sym0$FALSE));
    $dtp_hierarchical_visitor$ = defconstant("*DTP-HIERARCHICAL-VISITOR*", $sym1$HIERARCHICAL_VISITOR);
    return NIL;
  }

  public static final SubLObject setup_hierarchical_visitor_file() {
    // CVS_ID("Id: hierarchical-visitor.lisp 127954 2009-06-04 20:08:55Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_hierarchical_visitor$.getGlobalValue(), Symbols.symbol_function($sym8$HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$HIER_VISIT_BEGIN_PATH_FN, $sym10$_CSETF_HIER_VISIT_BEGIN_PATH_FN);
    Structures.def_csetf($sym11$HIER_VISIT_END_PATH_FN, $sym12$_CSETF_HIER_VISIT_END_PATH_FN);
    Structures.def_csetf($sym13$HIER_VISIT_ACCEPT_NODE_FN, $sym14$_CSETF_HIER_VISIT_ACCEPT_NODE_FN);
    Structures.def_csetf($sym15$HIER_VISIT_BEGIN_VISIT_FN, $sym16$_CSETF_HIER_VISIT_BEGIN_VISIT_FN);
    Structures.def_csetf($sym17$HIER_VISIT_END_VISIT_FN, $sym18$_CSETF_HIER_VISIT_END_VISIT_FN);
    Structures.def_csetf($sym19$HIER_VISIT_PARAM, $sym20$_CSETF_HIER_VISIT_PARAM);
    Equality.identity($sym1$HIERARCHICAL_VISITOR);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym1$HIERARCHICAL_VISITOR = makeSymbol("HIERARCHICAL-VISITOR");
  public static final SubLSymbol $sym2$HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");
  public static final SubLList $list3 = list(makeSymbol("BEGIN-PATH-FN"), makeSymbol("END-PATH-FN"), makeSymbol("ACCEPT-NODE-FN"), makeSymbol("BEGIN-VISIT-FN"), makeSymbol("END-VISIT-FN"), makeSymbol("PARAM"));
  public static final SubLList $list4 = list(makeKeyword("BEGIN-PATH-FN"), makeKeyword("END-PATH-FN"), makeKeyword("ACCEPT-NODE-FN"), makeKeyword("BEGIN-VISIT-FN"), makeKeyword("END-VISIT-FN"), makeKeyword("PARAM"));
  public static final SubLList $list5 = list(makeSymbol("HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("HIER-VISIT-END-PATH-FN"), makeSymbol("HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("HIER-VISIT-END-VISIT-FN"), makeSymbol("HIER-VISIT-PARAM"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-PARAM"));
  public static final SubLSymbol $sym7$PRINT_HIERACHICAL_VISITOR = makeSymbol("PRINT-HIERACHICAL-VISITOR");
  public static final SubLSymbol $sym8$HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$HIER_VISIT_BEGIN_PATH_FN = makeSymbol("HIER-VISIT-BEGIN-PATH-FN");
  public static final SubLSymbol $sym10$_CSETF_HIER_VISIT_BEGIN_PATH_FN = makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN");
  public static final SubLSymbol $sym11$HIER_VISIT_END_PATH_FN = makeSymbol("HIER-VISIT-END-PATH-FN");
  public static final SubLSymbol $sym12$_CSETF_HIER_VISIT_END_PATH_FN = makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN");
  public static final SubLSymbol $sym13$HIER_VISIT_ACCEPT_NODE_FN = makeSymbol("HIER-VISIT-ACCEPT-NODE-FN");
  public static final SubLSymbol $sym14$_CSETF_HIER_VISIT_ACCEPT_NODE_FN = makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN");
  public static final SubLSymbol $sym15$HIER_VISIT_BEGIN_VISIT_FN = makeSymbol("HIER-VISIT-BEGIN-VISIT-FN");
  public static final SubLSymbol $sym16$_CSETF_HIER_VISIT_BEGIN_VISIT_FN = makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN");
  public static final SubLSymbol $sym17$HIER_VISIT_END_VISIT_FN = makeSymbol("HIER-VISIT-END-VISIT-FN");
  public static final SubLSymbol $sym18$_CSETF_HIER_VISIT_END_VISIT_FN = makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN");
  public static final SubLSymbol $sym19$HIER_VISIT_PARAM = makeSymbol("HIER-VISIT-PARAM");
  public static final SubLSymbol $sym20$_CSETF_HIER_VISIT_PARAM = makeSymbol("_CSETF-HIER-VISIT-PARAM");
  public static final SubLSymbol $kw21$BEGIN_PATH_FN = makeKeyword("BEGIN-PATH-FN");
  public static final SubLSymbol $kw22$END_PATH_FN = makeKeyword("END-PATH-FN");
  public static final SubLSymbol $kw23$ACCEPT_NODE_FN = makeKeyword("ACCEPT-NODE-FN");
  public static final SubLSymbol $kw24$BEGIN_VISIT_FN = makeKeyword("BEGIN-VISIT-FN");
  public static final SubLSymbol $kw25$END_VISIT_FN = makeKeyword("END-VISIT-FN");
  public static final SubLSymbol $kw26$PARAM = makeKeyword("PARAM");
  public static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str28$__ = makeString("#<");
  public static final SubLSymbol $kw29$STREAM = makeKeyword("STREAM");
  public static final SubLString $str30$__Visit__ = makeString(" (Visit: ");
  public static final SubLString $str31$__Path__ = makeString(" (Path: ");
  public static final SubLString $str32$_Node__ = makeString(" Node: ");
  public static final SubLString $str33$_ = makeString(" ");
  public static final SubLString $str34$__ = makeString(") ");
  public static final SubLString $str35$__Param__ = makeString(") Param: ");
  public static final SubLSymbol $kw36$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym37$PRINT_HIER_VISITOR_BEGIN_VISIT = makeSymbol("PRINT-HIER-VISITOR-BEGIN-VISIT");
  public static final SubLSymbol $sym38$PRINT_HIER_VISITOR_BEGIN_PATH = makeSymbol("PRINT-HIER-VISITOR-BEGIN-PATH");
  public static final SubLSymbol $sym39$PRINT_HIER_VISITOR_ACCEPT_NODE = makeSymbol("PRINT-HIER-VISITOR-ACCEPT-NODE");
  public static final SubLSymbol $sym40$PRINT_HIER_VISITOR_END_PATH = makeSymbol("PRINT-HIER-VISITOR-END-PATH");
  public static final SubLSymbol $sym41$PRINT_HIER_VISITOR_END_VISIT = makeSymbol("PRINT-HIER-VISITOR-END-VISIT");
  public static final SubLString $str42$__Begin_visit_of__A___ = makeString("~&Begin visit of ~A.~%");
  public static final SubLString $str43$__End_visit_of__A___ = makeString("~&End visit of ~A.~%");
  public static final SubLString $str44$__Begin_path__A__ = makeString("~&Begin path ~A~%");
  public static final SubLString $str45$__End_path__A__ = makeString("~&End path ~A~%");
  public static final SubLString $str46$__Node__A__ = makeString("~&Node ~A~%");

  //// Initializers

  public void declareFunctions() {
    declare_hierarchical_visitor_file();
  }

  public void initializeVariables() {
    init_hierarchical_visitor_file();
  }

  public void runTopLevelForms() {
    setup_hierarchical_visitor_file();
  }

}
