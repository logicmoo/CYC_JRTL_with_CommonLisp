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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class interval_span extends SubLTranslatedFile {

  //// Constructor

  private interval_span() {}
  public static final SubLFile me = new interval_span();
  public static final String myName = "com.cyc.cycjava_1.cycl.interval_span";

  //// Definitions

  public static final class $interval_span_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $start; }
    public SubLObject getField3() { return $end; }
    public SubLObject setField2(SubLObject value) { return $start = value; }
    public SubLObject setField3(SubLObject value) { return $end = value; }
    public SubLObject $start = NIL;
    public SubLObject $end = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($interval_span_native.class, $sym0$INTERVAL_SPAN, $sym1$INTERVAL_SPAN_P, $list2, $list3, new String[] {"$start", "$end"}, $list4, $list5, $sym6$PRINT_INTERVAL_SPAN);
  }

  @SubL(source = "cycl/interval-span.lisp", position = 1393) 
  public static SubLSymbol $dtp_interval_span$ = null;

  @SubL(source = "cycl/interval-span.lisp", position = 1393) 
  public static final SubLObject interval_span_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29643");
    return NIL;
  }

  public static final class $interval_span_p$UnaryFunction extends UnaryFunction {
    public $interval_span_p$UnaryFunction() { super(extractFunctionNamed("INTERVAL-SPAN-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29641"); }
  }

  @SubL(source = "cycl/interval-span.lisp", position = 1686) 
  private static SubLSymbol $interval_span_table$ = null;

  public static final SubLObject declare_interval_span_file() {
    declareFunction(myName, "interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "interval_span_p", "INTERVAL-SPAN-P", 1, 0, false); new $interval_span_p$UnaryFunction();
    declareFunction(myName, "int_span_start", "INT-SPAN-START", 1, 0, false);
    declareFunction(myName, "int_span_end", "INT-SPAN-END", 1, 0, false);
    declareFunction(myName, "_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
    declareFunction(myName, "_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
    declareFunction(myName, "make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
    declareFunction(myName, "print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
    declareFunction(myName, "lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
    declareFunction(myName, "new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
    declareFunction(myName, "get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
    declareFunction(myName, "interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
    declareFunction(myName, "interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
    declareFunction(myName, "interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
    declareFunction(myName, "interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
    declareFunction(myName, "interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
    declareFunction(myName, "interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
    declareFunction(myName, "interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_interval_span_file() {
    $dtp_interval_span$ = defconstant("*DTP-INTERVAL-SPAN*", $sym0$INTERVAL_SPAN);
    $interval_span_table$ = deflexical("*INTERVAL-SPAN-TABLE*", dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_interval_span_file() {
    // CVS_ID("Id: interval-span.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), Symbols.symbol_function($sym7$INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$INT_SPAN_START, $sym9$_CSETF_INT_SPAN_START);
    Structures.def_csetf($sym10$INT_SPAN_END, $sym11$_CSETF_INT_SPAN_END);
    Equality.identity($sym0$INTERVAL_SPAN);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INTERVAL_SPAN = makeSymbol("INTERVAL-SPAN");
  public static final SubLSymbol $sym1$INTERVAL_SPAN_P = makeSymbol("INTERVAL-SPAN-P");
  public static final SubLList $list2 = list(makeSymbol("START"), makeSymbol("END"));
  public static final SubLList $list3 = list(makeKeyword("START"), makeKeyword("END"));
  public static final SubLList $list4 = list(makeSymbol("INT-SPAN-START"), makeSymbol("INT-SPAN-END"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-INT-SPAN-START"), makeSymbol("_CSETF-INT-SPAN-END"));
  public static final SubLSymbol $sym6$PRINT_INTERVAL_SPAN = makeSymbol("PRINT-INTERVAL-SPAN");
  public static final SubLSymbol $sym7$INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$INT_SPAN_START = makeSymbol("INT-SPAN-START");
  public static final SubLSymbol $sym9$_CSETF_INT_SPAN_START = makeSymbol("_CSETF-INT-SPAN-START");
  public static final SubLSymbol $sym10$INT_SPAN_END = makeSymbol("INT-SPAN-END");
  public static final SubLSymbol $sym11$_CSETF_INT_SPAN_END = makeSymbol("_CSETF-INT-SPAN-END");
  public static final SubLSymbol $kw12$START = makeKeyword("START");
  public static final SubLSymbol $kw13$END = makeKeyword("END");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$_INTERVAL_SPAN___S__S__ = makeString("<INTERVAL-SPAN (~S ~S)>");
  public static final SubLSymbol $sym16$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str17$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");

  //// Initializers

  public void declareFunctions() {
    declare_interval_span_file();
  }

  public void initializeVariables() {
    init_interval_span_file();
  }

  public void runTopLevelForms() {
    setup_interval_span_file();
  }

}
