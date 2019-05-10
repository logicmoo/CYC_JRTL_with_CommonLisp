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

package  com.cyc.cycjava_1.cycl.sbhl;

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
import com.cyc.cycjava_1.cycl.binary_tree;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_iterators;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_datastructures;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sbhl_iteration extends SubLTranslatedFile {

  //// Constructor

  private sbhl_iteration() {}
  public static final SubLFile me = new sbhl_iteration();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_iteration";

  //// Definitions

  @SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 980) 
  public static SubLSymbol $sbhl_iterator_store$ = null;

  @SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1196) 
  private static SubLSymbol $sbhl_iterator_store_max$ = null;

  public static final class $sbhl_iterator_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $state; }
    public SubLObject getField3() { return $done; }
    public SubLObject getField4() { return $next; }
    public SubLObject getField5() { return $finalize; }
    public SubLObject setField2(SubLObject value) { return $state = value; }
    public SubLObject setField3(SubLObject value) { return $done = value; }
    public SubLObject setField4(SubLObject value) { return $next = value; }
    public SubLObject setField5(SubLObject value) { return $finalize = value; }
    public SubLObject $state = NIL;
    public SubLObject $done = NIL;
    public SubLObject $next = NIL;
    public SubLObject $finalize = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_iterator_native.class, $sym2$SBHL_ITERATOR, $sym3$SBHL_ITERATOR_P, $list4, $list5, new String[] {"$state", "$done", "$next", "$finalize"}, $list6, $list7, $sym8$PRINT_SBHL_ITERATOR);
  }

  @SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528) 
  public static SubLSymbol $dtp_sbhl_iterator$ = null;

  @SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528) 
  public static final SubLObject sbhl_iterator_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1992");
    return NIL;
  }

  public static final class $sbhl_iterator_p$UnaryFunction extends UnaryFunction {
    public $sbhl_iterator_p$UnaryFunction() { super(extractFunctionNamed("SBHL-ITERATOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2044"); }
  }

  @SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 11396) 
  private static SubLSymbol $sbhl_null_iterator$ = null;

  public static final SubLObject declare_sbhl_iteration_file() {
    //declareFunction(myName, "within_sbhl_iterator_resourcingP", "WITHIN-SBHL-ITERATOR-RESOURCING?", 0, 0, false);
    //declareMacro(myName, "with_sbhl_iterator_resourcing", "WITH-SBHL-ITERATOR-RESOURCING");
    //declareFunction(myName, "find_or_create_sbhl_iterator_shell", "FIND-OR-CREATE-SBHL-ITERATOR-SHELL", 0, 0, false);
    //declareFunction(myName, "find_sbhl_iterator_shell", "FIND-SBHL-ITERATOR-SHELL", 0, 0, false);
    //declareFunction(myName, "release_sbhl_iterator", "RELEASE-SBHL-ITERATOR", 1, 0, false);
    declareFunction(myName, "sbhl_iterator_print_function_trampoline", "SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_iterator_p", "SBHL-ITERATOR-P", 1, 0, false); new $sbhl_iterator_p$UnaryFunction();
    //declareFunction(myName, "sbhl_it_state", "SBHL-IT-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_it_done", "SBHL-IT-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_it_next", "SBHL-IT-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_it_finalize", "SBHL-IT-FINALIZE", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_it_state", "_CSETF-SBHL-IT-STATE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_it_done", "_CSETF-SBHL-IT-DONE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_it_next", "_CSETF-SBHL-IT-NEXT", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_it_finalize", "_CSETF-SBHL-IT-FINALIZE", 2, 0, false);
    //declareFunction(myName, "make_sbhl_iterator", "MAKE-SBHL-ITERATOR", 0, 1, false);
    //declareFunction(myName, "print_sbhl_iterator", "PRINT-SBHL-ITERATOR", 3, 0, false);
    //declareFunction(myName, "new_sbhl_iterator", "NEW-SBHL-ITERATOR", 4, 0, false);
    //declareFunction(myName, "sbhl_iteration_doneP", "SBHL-ITERATION-DONE?", 1, 0, false);
    //declareFunction(myName, "sbhl_iteration_next", "SBHL-ITERATION-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_iteration_finalize", "SBHL-ITERATION-FINALIZE", 1, 0, false);
    //declareMacro(myName, "do_sbhl_iterator", "DO-SBHL-ITERATOR");
    //declareMacro(myName, "do_n_sbhl_iterator_objects", "DO-N-SBHL-ITERATOR-OBJECTS");
    //declareFunction(myName, "new_sbhl_null_iterator", "NEW-SBHL-NULL-ITERATOR", 0, 0, false);
    //declareFunction(myName, "sbhl_null_iterator_p", "SBHL-NULL-ITERATOR-P", 1, 0, false);
    //declareFunction(myName, "new_sbhl_list_iterator", "NEW-SBHL-LIST-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_list_iterator_done", "SBHL-LIST-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_list_iterator_next", "SBHL-LIST-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "new_sbhl_alist_iterator", "NEW-SBHL-ALIST-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_alist_iterator_done", "SBHL-ALIST-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_alist_iterator_next", "SBHL-ALIST-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "new_sbhl_hash_table_iterator", "NEW-SBHL-HASH-TABLE-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_hash_table_iterator_done", "SBHL-HASH-TABLE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_hash_table_iterator_next", "SBHL-HASH-TABLE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "make_sbhl_hash_table_iterator_state", "MAKE-SBHL-HASH-TABLE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "new_sbhl_dictionary_iterator", "NEW-SBHL-DICTIONARY-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_sbhl_iterator_iterator", "NEW-SBHL-ITERATOR-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_iterator_iterator_done", "SBHL-ITERATOR-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_iterator_iterator_next", "SBHL-ITERATOR-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_iterator_iterator_finalize", "SBHL-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_iteration_file() {
    $sbhl_iterator_store$ = defparameter("*SBHL-ITERATOR-STORE*", NIL);
    $sbhl_iterator_store_max$ = deflexical("*SBHL-ITERATOR-STORE-MAX*", TEN_INTEGER);
    $dtp_sbhl_iterator$ = defconstant("*DTP-SBHL-ITERATOR*", $sym2$SBHL_ITERATOR);
    $sbhl_null_iterator$ = deflexical("*SBHL-NULL-ITERATOR*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_iteration_file() {
    // CVS_ID("Id: sbhl-iteration.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_iterator$.getGlobalValue(), Symbols.symbol_function($sym9$SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym10$SBHL_IT_STATE, $sym11$_CSETF_SBHL_IT_STATE);
    Structures.def_csetf($sym12$SBHL_IT_DONE, $sym13$_CSETF_SBHL_IT_DONE);
    Structures.def_csetf($sym14$SBHL_IT_NEXT, $sym15$_CSETF_SBHL_IT_NEXT);
    Structures.def_csetf($sym16$SBHL_IT_FINALIZE, $sym17$_CSETF_SBHL_IT_FINALIZE);
    Equality.identity($sym2$SBHL_ITERATOR);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*SBHL-ITERATOR-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-ITERATOR-STORE*"), list(makeSymbol("NEW-SBHL-STACK"), makeSymbol("*SBHL-ITERATOR-STORE-MAX*")))));
  public static final SubLSymbol $sym2$SBHL_ITERATOR = makeSymbol("SBHL-ITERATOR");
  public static final SubLSymbol $sym3$SBHL_ITERATOR_P = makeSymbol("SBHL-ITERATOR-P");
  public static final SubLList $list4 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));
  public static final SubLList $list5 = list(makeKeyword("STATE"), makeKeyword("DONE"), makeKeyword("NEXT"), makeKeyword("FINALIZE"));
  public static final SubLList $list6 = list(makeSymbol("SBHL-IT-STATE"), makeSymbol("SBHL-IT-DONE"), makeSymbol("SBHL-IT-NEXT"), makeSymbol("SBHL-IT-FINALIZE"));
  public static final SubLList $list7 = list(makeSymbol("_CSETF-SBHL-IT-STATE"), makeSymbol("_CSETF-SBHL-IT-DONE"), makeSymbol("_CSETF-SBHL-IT-NEXT"), makeSymbol("_CSETF-SBHL-IT-FINALIZE"));
  public static final SubLSymbol $sym8$PRINT_SBHL_ITERATOR = makeSymbol("PRINT-SBHL-ITERATOR");
  public static final SubLSymbol $sym9$SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym10$SBHL_IT_STATE = makeSymbol("SBHL-IT-STATE");
  public static final SubLSymbol $sym11$_CSETF_SBHL_IT_STATE = makeSymbol("_CSETF-SBHL-IT-STATE");
  public static final SubLSymbol $sym12$SBHL_IT_DONE = makeSymbol("SBHL-IT-DONE");
  public static final SubLSymbol $sym13$_CSETF_SBHL_IT_DONE = makeSymbol("_CSETF-SBHL-IT-DONE");
  public static final SubLSymbol $sym14$SBHL_IT_NEXT = makeSymbol("SBHL-IT-NEXT");
  public static final SubLSymbol $sym15$_CSETF_SBHL_IT_NEXT = makeSymbol("_CSETF-SBHL-IT-NEXT");
  public static final SubLSymbol $sym16$SBHL_IT_FINALIZE = makeSymbol("SBHL-IT-FINALIZE");
  public static final SubLSymbol $sym17$_CSETF_SBHL_IT_FINALIZE = makeSymbol("_CSETF-SBHL-IT-FINALIZE");
  public static final SubLSymbol $kw18$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw19$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw20$NEXT = makeKeyword("NEXT");
  public static final SubLSymbol $kw21$FINALIZE = makeKeyword("FINALIZE");
  public static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str23$__ = makeString("#<");
  public static final SubLSymbol $kw24$STREAM = makeKeyword("STREAM");
  public static final SubLString $str25$_DONE = makeString(" DONE");
  public static final SubLSymbol $kw26$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym27$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym28$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym29$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym30$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym31$SBHL_LIST_ITERATOR_DONE = makeSymbol("SBHL-LIST-ITERATOR-DONE");
  public static final SubLSymbol $sym32$SBHL_ALIST_ITERATOR_DONE = makeSymbol("SBHL-ALIST-ITERATOR-DONE");
  public static final SubLSymbol $sym33$SBHL_HASH_TABLE_ITERATOR_DONE = makeSymbol("SBHL-HASH-TABLE-ITERATOR-DONE");
  public static final SubLSymbol $sym34$SBHL_ITERATOR_ITERATOR_DONE = makeSymbol("SBHL-ITERATOR-ITERATOR-DONE");
  public static final SubLSymbol $sym35$SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol("SBHL-AVL-TREE-ITERATOR-DONE");
  public static final SubLSymbol $sym36$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym37$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym38$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym40$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym41$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym42$SBHL_LIST_ITERATOR_NEXT = makeSymbol("SBHL-LIST-ITERATOR-NEXT");
  public static final SubLSymbol $sym43$SBHL_ALIST_ITERATOR_NEXT = makeSymbol("SBHL-ALIST-ITERATOR-NEXT");
  public static final SubLSymbol $sym44$SBHL_HASH_TABLE_ITERATOR_NEXT = makeSymbol("SBHL-HASH-TABLE-ITERATOR-NEXT");
  public static final SubLSymbol $sym45$SBHL_ITERATOR_ITERATOR_NEXT = makeSymbol("SBHL-ITERATOR-ITERATOR-NEXT");
  public static final SubLSymbol $sym46$SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol("SBHL-AVL-TREE-ITERATOR-NEXT");
  public static final SubLSymbol $sym47$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym48$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym49$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym50$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym51$SBHL_ITERATOR_ITERATOR_FINALIZE = makeSymbol("SBHL-ITERATOR-ITERATOR-FINALIZE");
  public static final SubLList $list52 = list(list(makeSymbol("VAR"), makeSymbol("SBHL-ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list53 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw54$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $sym55$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");
  public static final SubLSymbol $sym56$DO_SBHL_ITERATOR = makeSymbol("DO-SBHL-ITERATOR");
  public static final SubLSymbol $sym57$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym58$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym59$SBHL_ITERATION_NEXT = makeSymbol("SBHL-ITERATION-NEXT");
  public static final SubLSymbol $sym60$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym61$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym62$COR = makeSymbol("COR");
  public static final SubLSymbol $sym63$NULL = makeSymbol("NULL");
  public static final SubLList $list64 = list(list(makeSymbol("VAR"), makeSymbol("N"), makeSymbol("SBHL-ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym65$COUNT = makeUninternedSymbol("COUNT");
  public static final SubLSymbol $sym66$NEW_DONE = makeUninternedSymbol("NEW-DONE");
  public static final SubLList $list67 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym68$__ = makeSymbol(">=");
  public static final SubLSymbol $sym69$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym70$CINC = makeSymbol("CINC");
  public static final SubLList $list71 = list(T);
  public static final SubLSymbol $kw72$ALIST = makeKeyword("ALIST");
  public static final SubLSymbol $kw73$HASHTABLE = makeKeyword("HASHTABLE");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_iteration_file();
  }

  public void initializeVariables() {
    init_sbhl_iteration_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_iteration_file();
  }

}
