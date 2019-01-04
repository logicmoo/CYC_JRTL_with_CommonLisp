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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;

public  final class shelfs extends SubLTranslatedFile {

  //// Constructor

  private shelfs() {}
  public static final SubLFile me = new shelfs();
  public static final String myName = "com.cyc.cycjava.cycl.shelfs";

  //// Definitions

  public static final class $shelf_info_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $key; }
    public SubLObject getField3() { return $test; }
    public SubLObject getField4() { return $compare; }
    public SubLObject getField5() { return $minor_limit; }
    public SubLObject getField6() { return $major_limit; }
    public SubLObject setField2(SubLObject value) { return $key = value; }
    public SubLObject setField3(SubLObject value) { return $test = value; }
    public SubLObject setField4(SubLObject value) { return $compare = value; }
    public SubLObject setField5(SubLObject value) { return $minor_limit = value; }
    public SubLObject setField6(SubLObject value) { return $major_limit = value; }
    public SubLObject $key = NIL;
    public SubLObject $test = NIL;
    public SubLObject $compare = NIL;
    public SubLObject $minor_limit = NIL;
    public SubLObject $major_limit = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($shelf_info_native.class, $sym0$SHELF_INFO, $sym1$SHELF_INFO_P, $list3, $list4, new String[] {"$key", "$test", "$compare", "$minor_limit", "$major_limit"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/shelfs.lisp", position = 4054) 
  public static SubLSymbol $dtp_shelf_info$ = null;

  @SubL(source = "cycl/shelfs.lisp", position = 4054) 
  public static final SubLObject shelf_info_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $shelf_info_p$UnaryFunction extends UnaryFunction {
    public $shelf_info_p$UnaryFunction() { super(extractFunctionNamed("SHELF-INFO-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6736"); }
  }

  public static final class $shelf_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $info; }
    public SubLObject getField3() { return $payload; }
    public SubLObject getField4() { return $size; }
    public SubLObject setField2(SubLObject value) { return $info = value; }
    public SubLObject setField3(SubLObject value) { return $payload = value; }
    public SubLObject setField4(SubLObject value) { return $size = value; }
    public SubLObject $info = NIL;
    public SubLObject $payload = NIL;
    public SubLObject $size = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($shelf_native.class, $sym25$SHELF, $sym26$SHELF_P, $list28, $list29, new String[] {"$info", "$payload", "$size"}, $list30, $list31, $sym32$PRINT_SHELF);
  }

  @SubL(source = "cycl/shelfs.lisp", position = 4160) 
  public static SubLSymbol $dtp_shelf$ = null;

  @SubL(source = "cycl/shelfs.lisp", position = 4160) 
  public static final SubLObject shelf_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6729");
    return NIL;
  }

  public static final class $shelf_p$UnaryFunction extends UnaryFunction {
    public $shelf_p$UnaryFunction() { super(extractFunctionNamed("SHELF-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6738"); }
  }

  public static final SubLObject declare_shelfs_file() {
    declareFunction(myName, "shelf_info_print_function_trampoline", "SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "shelf_info_p", "SHELF-INFO-P", 1, 0, false); new $shelf_info_p$UnaryFunction();
    //declareFunction(myName, "shelf_info_key", "SHELF-INFO-KEY", 1, 0, false);
    //declareFunction(myName, "shelf_info_test", "SHELF-INFO-TEST", 1, 0, false);
    //declareFunction(myName, "shelf_info_compare", "SHELF-INFO-COMPARE", 1, 0, false);
    //declareFunction(myName, "shelf_info_minor_limit", "SHELF-INFO-MINOR-LIMIT", 1, 0, false);
    //declareFunction(myName, "shelf_info_major_limit", "SHELF-INFO-MAJOR-LIMIT", 1, 0, false);
    //declareFunction(myName, "_csetf_shelf_info_key", "_CSETF-SHELF-INFO-KEY", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_info_test", "_CSETF-SHELF-INFO-TEST", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_info_compare", "_CSETF-SHELF-INFO-COMPARE", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_info_minor_limit", "_CSETF-SHELF-INFO-MINOR-LIMIT", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_info_major_limit", "_CSETF-SHELF-INFO-MAJOR-LIMIT", 2, 0, false);
    //declareFunction(myName, "make_shelf_info", "MAKE-SHELF-INFO", 0, 1, false);
    declareFunction(myName, "shelf_print_function_trampoline", "SHELF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "shelf_p", "SHELF-P", 1, 0, false); new $shelf_p$UnaryFunction();
    //declareFunction(myName, "shelf_info", "SHELF-INFO", 1, 0, false);
    //declareFunction(myName, "shelf_payload", "SHELF-PAYLOAD", 1, 0, false);
    //declareFunction(myName, "shelf_size", "SHELF-SIZE", 1, 0, false);
    //declareFunction(myName, "_csetf_shelf_info", "_CSETF-SHELF-INFO", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_payload", "_CSETF-SHELF-PAYLOAD", 2, 0, false);
    //declareFunction(myName, "_csetf_shelf_size", "_CSETF-SHELF-SIZE", 2, 0, false);
    //declareFunction(myName, "make_shelf", "MAKE-SHELF", 0, 1, false);
    //declareFunction(myName, "shelf_finalized_p", "SHELF-FINALIZED-P", 1, 0, false);
    //declareFunction(myName, "print_shelf", "PRINT-SHELF", 3, 0, false);
    //declareFunction(myName, "allocate_shelf", "ALLOCATE-SHELF", 2, 0, false);
    //declareFunction(myName, "initial_add_to_shelf", "INITIAL-ADD-TO-SHELF", 2, 0, false);
    //declareFunction(myName, "finalize_shelf", "FINALIZE-SHELF", 1, 0, false);
    //declareFunction(myName, "shelf_count", "SHELF-COUNT", 1, 0, false);
    //declareFunction(myName, "shelf_approximate_count", "SHELF-APPROXIMATE-COUNT", 1, 0, false);
    //declareFunction(myName, "shelf_major_count", "SHELF-MAJOR-COUNT", 1, 0, false);
    //declareFunction(myName, "shelf_minor_count", "SHELF-MINOR-COUNT", 1, 0, false);
    //declareFunction(myName, "shelf_extra_count", "SHELF-EXTRA-COUNT", 1, 0, false);
    //declareFunction(myName, "rearrange_shelf", "REARRANGE-SHELF", 1, 0, false);
    //declareFunction(myName, "tidy_shelf", "TIDY-SHELF", 1, 0, false);
    //declareMacro(myName, "do_shelf", "DO-SHELF");
    //declareFunction(myName, "map_shelf", "MAP-SHELF", 2, 1, false);
    //declareMacro(myName, "do_shelf_from", "DO-SHELF-FROM");
    //declareFunction(myName, "map_shelf_from", "MAP-SHELF-FROM", 4, 0, false);
    //declareFunction(myName, "add_to_shelf", "ADD-TO-SHELF", 2, 0, false);
    //declareFunction(myName, "bsearch_shelf_vector", "BSEARCH-SHELF-VECTOR", 3, 0, false);
    //declareFunction(myName, "bsearch_shelf_vector_range", "BSEARCH-SHELF-VECTOR-RANGE", 3, 0, false);
    //declareFunction(myName, "delete_from_shelf", "DELETE-FROM-SHELF", 2, 0, false);
    //declareFunction(myName, "clear_shelf", "CLEAR-SHELF", 1, 0, false);
    //declareFunction(myName, "find_in_shelf", "FIND-IN-SHELF", 2, 0, false);
    //declareFunction(myName, "shelf_ten_percent_full_p", "SHELF-TEN-PERCENT-FULL-P", 1, 0, false);
    //declareFunction(myName, "shelf_full_p", "SHELF-FULL-P", 1, 0, false);
    //declareFunction(myName, "new_shelf_iterator", "NEW-SHELF-ITERATOR", 1, 0, false);
    //declareFunction(myName, "make_iterator_shelf_state", "MAKE-ITERATOR-SHELF-STATE", 1, 0, false);
    //declareFunction(myName, "new_shelf_vector_iterator", "NEW-SHELF-VECTOR-ITERATOR", 1, 0, false);
    //declareFunction(myName, "iterator_shelf_done", "ITERATOR-SHELF-DONE", 1, 0, false);
    //declareFunction(myName, "iterator_shelf_next", "ITERATOR-SHELF-NEXT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_shelfs_file() {
    $dtp_shelf_info$ = defconstant("*DTP-SHELF-INFO*", $sym0$SHELF_INFO);
    $dtp_shelf$ = defconstant("*DTP-SHELF*", $sym25$SHELF);
    return NIL;
  }

  public static final SubLObject setup_shelfs_file() {
    // CVS_ID("Id: shelfs.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_shelf_info$.getGlobalValue(), Symbols.symbol_function($sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$SHELF_INFO_KEY, $sym10$_CSETF_SHELF_INFO_KEY);
    Structures.def_csetf($sym11$SHELF_INFO_TEST, $sym12$_CSETF_SHELF_INFO_TEST);
    Structures.def_csetf($sym13$SHELF_INFO_COMPARE, $sym14$_CSETF_SHELF_INFO_COMPARE);
    Structures.def_csetf($sym15$SHELF_INFO_MINOR_LIMIT, $sym16$_CSETF_SHELF_INFO_MINOR_LIMIT);
    Structures.def_csetf($sym17$SHELF_INFO_MAJOR_LIMIT, $sym18$_CSETF_SHELF_INFO_MAJOR_LIMIT);
    Equality.identity($sym0$SHELF_INFO);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_shelf$.getGlobalValue(), Symbols.symbol_function($sym33$SHELF_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym0$SHELF_INFO, $sym34$_CSETF_SHELF_INFO);
    Structures.def_csetf($sym35$SHELF_PAYLOAD, $sym36$_CSETF_SHELF_PAYLOAD);
    Structures.def_csetf($sym37$SHELF_SIZE, $sym38$_CSETF_SHELF_SIZE);
    Equality.identity($sym25$SHELF);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SHELF_INFO = makeSymbol("SHELF-INFO");
  public static final SubLSymbol $sym1$SHELF_INFO_P = makeSymbol("SHELF-INFO-P");
  public static final SubLInteger $int2$134 = makeInteger(134);
  public static final SubLList $list3 = list(makeSymbol("KEY"), makeSymbol("TEST"), makeSymbol("COMPARE"), makeSymbol("MINOR-LIMIT"), makeSymbol("MAJOR-LIMIT"));
  public static final SubLList $list4 = list(makeKeyword("KEY"), makeKeyword("TEST"), makeKeyword("COMPARE"), makeKeyword("MINOR-LIMIT"), makeKeyword("MAJOR-LIMIT"));
  public static final SubLList $list5 = list(makeSymbol("SHELF-INFO-KEY"), makeSymbol("SHELF-INFO-TEST"), makeSymbol("SHELF-INFO-COMPARE"), makeSymbol("SHELF-INFO-MINOR-LIMIT"), makeSymbol("SHELF-INFO-MAJOR-LIMIT"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-SHELF-INFO-KEY"), makeSymbol("_CSETF-SHELF-INFO-TEST"), makeSymbol("_CSETF-SHELF-INFO-COMPARE"), makeSymbol("_CSETF-SHELF-INFO-MINOR-LIMIT"), makeSymbol("_CSETF-SHELF-INFO-MAJOR-LIMIT"));
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$SHELF_INFO_KEY = makeSymbol("SHELF-INFO-KEY");
  public static final SubLSymbol $sym10$_CSETF_SHELF_INFO_KEY = makeSymbol("_CSETF-SHELF-INFO-KEY");
  public static final SubLSymbol $sym11$SHELF_INFO_TEST = makeSymbol("SHELF-INFO-TEST");
  public static final SubLSymbol $sym12$_CSETF_SHELF_INFO_TEST = makeSymbol("_CSETF-SHELF-INFO-TEST");
  public static final SubLSymbol $sym13$SHELF_INFO_COMPARE = makeSymbol("SHELF-INFO-COMPARE");
  public static final SubLSymbol $sym14$_CSETF_SHELF_INFO_COMPARE = makeSymbol("_CSETF-SHELF-INFO-COMPARE");
  public static final SubLSymbol $sym15$SHELF_INFO_MINOR_LIMIT = makeSymbol("SHELF-INFO-MINOR-LIMIT");
  public static final SubLSymbol $sym16$_CSETF_SHELF_INFO_MINOR_LIMIT = makeSymbol("_CSETF-SHELF-INFO-MINOR-LIMIT");
  public static final SubLSymbol $sym17$SHELF_INFO_MAJOR_LIMIT = makeSymbol("SHELF-INFO-MAJOR-LIMIT");
  public static final SubLSymbol $sym18$_CSETF_SHELF_INFO_MAJOR_LIMIT = makeSymbol("_CSETF-SHELF-INFO-MAJOR-LIMIT");
  public static final SubLSymbol $kw19$KEY = makeKeyword("KEY");
  public static final SubLSymbol $kw20$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw21$COMPARE = makeKeyword("COMPARE");
  public static final SubLSymbol $kw22$MINOR_LIMIT = makeKeyword("MINOR-LIMIT");
  public static final SubLSymbol $kw23$MAJOR_LIMIT = makeKeyword("MAJOR-LIMIT");
  public static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym25$SHELF = makeSymbol("SHELF");
  public static final SubLSymbol $sym26$SHELF_P = makeSymbol("SHELF-P");
  public static final SubLInteger $int27$135 = makeInteger(135);
  public static final SubLList $list28 = list(makeSymbol("INFO"), makeSymbol("PAYLOAD"), makeSymbol("SIZE"));
  public static final SubLList $list29 = list(makeKeyword("INFO"), makeKeyword("PAYLOAD"), makeKeyword("SIZE"));
  public static final SubLList $list30 = list(makeSymbol("SHELF-INFO"), makeSymbol("SHELF-PAYLOAD"), makeSymbol("SHELF-SIZE"));
  public static final SubLList $list31 = list(makeSymbol("_CSETF-SHELF-INFO"), makeSymbol("_CSETF-SHELF-PAYLOAD"), makeSymbol("_CSETF-SHELF-SIZE"));
  public static final SubLSymbol $sym32$PRINT_SHELF = makeSymbol("PRINT-SHELF");
  public static final SubLSymbol $sym33$SHELF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SHELF-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym34$_CSETF_SHELF_INFO = makeSymbol("_CSETF-SHELF-INFO");
  public static final SubLSymbol $sym35$SHELF_PAYLOAD = makeSymbol("SHELF-PAYLOAD");
  public static final SubLSymbol $sym36$_CSETF_SHELF_PAYLOAD = makeSymbol("_CSETF-SHELF-PAYLOAD");
  public static final SubLSymbol $sym37$SHELF_SIZE = makeSymbol("SHELF-SIZE");
  public static final SubLSymbol $sym38$_CSETF_SHELF_SIZE = makeSymbol("_CSETF-SHELF-SIZE");
  public static final SubLSymbol $kw39$INFO = makeKeyword("INFO");
  public static final SubLSymbol $kw40$PAYLOAD = makeKeyword("PAYLOAD");
  public static final SubLSymbol $kw41$SIZE = makeKeyword("SIZE");
  public static final SubLString $str42$__ = makeString("#<");
  public static final SubLSymbol $kw43$STREAM = makeKeyword("STREAM");
  public static final SubLString $str44$_D_items = makeString("~D items");
  public static final SubLString $str45$__unfinalized_ = makeString(" (unfinalized)");
  public static final SubLSymbol $kw46$BASE = makeKeyword("BASE");
  public static final SubLString $str47$Finalizing__S_before_its_time_ = makeString("Finalizing ~S before its time.");
  public static final SubLString $str48$_S_has_already_been_finalized_ = makeString("~S has already been finalized.");
  public static final SubLString $str49$Shelf__S_being_finalized_with_les = makeString("Shelf ~S being finalized with less than expected ~D items.");
  public static final SubLSymbol $sym50$NULL = makeSymbol("NULL");
  public static final SubLString $str51$Finalize_it_ = makeString("Finalize it.");
  public static final SubLString $str52$_S_has_not_been_finalized_ = makeString("~S has not been finalized.");
  public static final SubLList $list53 = list(list(makeSymbol("VAR"), makeSymbol("SHELF"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-shelf"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str54$do_shelf = makeString("do-shelf");
  public static final SubLSymbol $sym55$SHELF_VAR = makeUninternedSymbol("SHELF-VAR");
  public static final SubLSymbol $sym56$PAYLOAD = makeUninternedSymbol("PAYLOAD");
  public static final SubLSymbol $sym57$I = makeUninternedSymbol("I");
  public static final SubLSymbol $sym58$VECTOR = makeUninternedSymbol("VECTOR");
  public static final SubLSymbol $sym59$DATA = makeUninternedSymbol("DATA");
  public static final SubLSymbol $sym60$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym61$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym62$_PROGRESS_NOTE_ = makeSymbol("*PROGRESS-NOTE*");
  public static final SubLList $list63 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));
  public static final SubLSymbol $sym64$_PROGRESS_TOTAL_ = makeSymbol("*PROGRESS-TOTAL*");
  public static final SubLSymbol $sym65$SHELF_APPROXIMATE_COUNT = makeSymbol("SHELF-APPROXIMATE-COUNT");
  public static final SubLList $list66 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);
  public static final SubLSymbol $sym67$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym68$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym69$SHELF_FINALIZED_P = makeSymbol("SHELF-FINALIZED-P");
  public static final SubLSymbol $sym70$VECTORP = makeSymbol("VECTORP");
  public static final SubLSymbol $sym71$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLSymbol $sym72$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym73$AREF = makeSymbol("AREF");
  public static final SubLSymbol $sym74$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list75 = list(list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*")), list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*")));
  public static final SubLSymbol $sym76$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym77$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym78$CDAR = makeSymbol("CDAR");
  public static final SubLSymbol $sym79$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym80$CAR = makeSymbol("CAR");
  public static final SubLList $list81 = list(list(makeSymbol("VAR"), makeSymbol("SHELF"), makeSymbol("ITEM"), makeSymbol("FORWARDP")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym82$SHELF_VAR = makeUninternedSymbol("SHELF-VAR");
  public static final SubLSymbol $sym83$VECTOR = makeUninternedSymbol("VECTOR");
  public static final SubLSymbol $sym84$LOW = makeUninternedSymbol("LOW");
  public static final SubLSymbol $sym85$HIGH = makeUninternedSymbol("HIGH");
  public static final SubLSymbol $sym86$I = makeUninternedSymbol("I");
  public static final SubLSymbol $sym87$LENGTH = makeUninternedSymbol("LENGTH");
  public static final SubLSymbol $sym88$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym89$FINALIZE_SHELF = makeSymbol("FINALIZE-SHELF");
  public static final SubLSymbol $sym90$REARRANGE_SHELF = makeSymbol("REARRANGE-SHELF");
  public static final SubLSymbol $sym91$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym92$BSEARCH_SHELF_VECTOR_RANGE = makeSymbol("BSEARCH-SHELF-VECTOR-RANGE");
  public static final SubLSymbol $sym93$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym94$_ = makeSymbol("+");
  public static final SubLList $list95 = list(ONE_INTEGER);
  public static final SubLSymbol $sym96$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym97$_ = makeSymbol("<");
  public static final SubLSymbol $sym98$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym99$_ = makeSymbol("-");
  public static final SubLList $list100 = list(ZERO_INTEGER);
  public static final SubLString $str101$Ignore_the_addition_ = makeString("Ignore the addition.");
  public static final SubLString $str102$Attempt_to_add__S_to__S_ = makeString("Attempt to add ~S to ~S.");
  public static final SubLSymbol $sym103$ITERATOR_SHELF_DONE = makeSymbol("ITERATOR-SHELF-DONE");
  public static final SubLSymbol $sym104$ITERATOR_SHELF_NEXT = makeSymbol("ITERATOR-SHELF-NEXT");
  public static final SubLSymbol $sym105$VECTOR = makeSymbol("VECTOR");
  public static final SubLSymbol $sym106$BOOLEAN = makeSymbol("BOOLEAN");

  //// Initializers

  public void declareFunctions() {
    declare_shelfs_file();
  }

  public void initializeVariables() {
    init_shelfs_file();
  }

  public void runTopLevelForms() {
    setup_shelfs_file();
  }

}
