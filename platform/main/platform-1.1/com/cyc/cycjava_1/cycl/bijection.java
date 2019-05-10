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
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class bijection extends SubLTranslatedFile {

  //// Constructor

  private bijection() {}
  public static final SubLFile me = new bijection();
  public static final String myName = "com.cyc.cycjava_1.cycl.bijection";

  //// Definitions

  @SubL(source = "cycl/bijection.lisp", position = 1927) 
  private static SubLSymbol $bijection_high_water_mark$ = null;

  @SubL(source = "cycl/bijection.lisp", position = 1980) 
  private static SubLSymbol $bijection_low_water_mark$ = null;

  public static final class $bijection_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $size; }
    public SubLObject getField3() { return $database; }
    public SubLObject getField4() { return $inverse_database; }
    public SubLObject getField5() { return $test; }
    public SubLObject setField2(SubLObject value) { return $size = value; }
    public SubLObject setField3(SubLObject value) { return $database = value; }
    public SubLObject setField4(SubLObject value) { return $inverse_database = value; }
    public SubLObject setField5(SubLObject value) { return $test = value; }
    public SubLObject $size = NIL;
    public SubLObject $database = NIL;
    public SubLObject $inverse_database = NIL;
    public SubLObject $test = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($bijection_native.class, $sym2$BIJECTION, $sym3$BIJECTION_P, $list4, $list5, new String[] {"$size", "$database", "$inverse_database", "$test"}, $list6, $list7, $sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/bijection.lisp", position = 2333) 
  public static SubLSymbol $dtp_bijection$ = null;

  @SubL(source = "cycl/bijection.lisp", position = 2333) 
  public static final SubLObject bijection_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $bijection_p$UnaryFunction extends UnaryFunction {
    public $bijection_p$UnaryFunction() { super(extractFunctionNamed("BIJECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8611"); }
  }

  public static final SubLObject declare_bijection_file() {
    declareFunction(myName, "bijection_print_function_trampoline", "BIJECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "bijection_p", "BIJECTION-P", 1, 0, false); new $bijection_p$UnaryFunction();
    //declareFunction(myName, "bijection_size", "BIJECTION-SIZE", 1, 0, false);
    //declareFunction(myName, "bijection_database", "BIJECTION-DATABASE", 1, 0, false);
    //declareFunction(myName, "bijection_inverse_database", "BIJECTION-INVERSE-DATABASE", 1, 0, false);
    //declareFunction(myName, "bijection_test", "BIJECTION-TEST", 1, 0, false);
    //declareFunction(myName, "_csetf_bijection_size", "_CSETF-BIJECTION-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_bijection_database", "_CSETF-BIJECTION-DATABASE", 2, 0, false);
    //declareFunction(myName, "_csetf_bijection_inverse_database", "_CSETF-BIJECTION-INVERSE-DATABASE", 2, 0, false);
    //declareFunction(myName, "_csetf_bijection_test", "_CSETF-BIJECTION-TEST", 2, 0, false);
    //declareFunction(myName, "make_bijection", "MAKE-BIJECTION", 0, 1, false);
    //declareFunction(myName, "bijection_style", "BIJECTION-STYLE", 1, 0, false);
    //declareFunction(myName, "bijection_style_error", "BIJECTION-STYLE-ERROR", 1, 0, false);
    //declareFunction(myName, "bijection_lookup_alist_style", "BIJECTION-LOOKUP-ALIST-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_enter_alist_style", "BIJECTION-ENTER-ALIST-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_remove_alist_style", "BIJECTION-REMOVE-ALIST-STYLE", 2, 0, false);
    //declareFunction(myName, "bijection_inverse_lookup_alist_style", "BIJECTION-INVERSE-LOOKUP-ALIST-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_inverse_enter_alist_style", "BIJECTION-INVERSE-ENTER-ALIST-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_inverse_remove_alist_style", "BIJECTION-INVERSE-REMOVE-ALIST-STYLE", 2, 0, false);
    //declareFunction(myName, "make_hashtable_bijection_from_alist", "MAKE-HASHTABLE-BIJECTION-FROM-ALIST", 1, 0, false);
    //declareFunction(myName, "bijection_lookup_hashtable_style", "BIJECTION-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_enter_hashtable_style", "BIJECTION-ENTER-HASHTABLE-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_remove_hashtable_style", "BIJECTION-REMOVE-HASHTABLE-STYLE", 2, 0, false);
    //declareFunction(myName, "bijection_inverse_lookup_hashtable_style", "BIJECTION-INVERSE-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_inverse_enter_hashtable_style", "BIJECTION-INVERSE-ENTER-HASHTABLE-STYLE", 3, 0, false);
    //declareFunction(myName, "bijection_inverse_remove_hashtable_style", "BIJECTION-INVERSE-REMOVE-HASHTABLE-STYLE", 2, 0, false);
    //declareFunction(myName, "bijection_remove_hashtable_style_int", "BIJECTION-REMOVE-HASHTABLE-STYLE-INT", 3, 0, false);
    //declareFunction(myName, "make_alist_bijection_from_hashtable", "MAKE-ALIST-BIJECTION-FROM-HASHTABLE", 1, 0, false);
    //declareFunction(myName, "new_bijection", "NEW-BIJECTION", 0, 2, false);
    //declareFunction(myName, "clear_bijection", "CLEAR-BIJECTION", 1, 0, false);
    //declareFunction(myName, "bijection_empty_p", "BIJECTION-EMPTY-P", 1, 0, false);
    //declareFunction(myName, "non_empty_bijection_p", "NON-EMPTY-BIJECTION-P", 1, 0, false);
    //declareFunction(myName, "bijection_lookup", "BIJECTION-LOOKUP", 2, 1, false);
    //declareFunction(myName, "bijection_inverse_lookup", "BIJECTION-INVERSE-LOOKUP", 2, 1, false);
    //declareFunction(myName, "bijection_enter", "BIJECTION-ENTER", 3, 0, false);
    //declareFunction(myName, "bijection_inverse_enter", "BIJECTION-INVERSE-ENTER", 3, 0, false);
    //declareFunction(myName, "bijection_remove", "BIJECTION-REMOVE", 2, 0, false);
    //declareFunction(myName, "bijection_inverse_remove", "BIJECTION-INVERSE-REMOVE", 2, 0, false);
    //declareFunction(myName, "new_bijection_iterator", "NEW-BIJECTION-ITERATOR", 1, 0, false);
    //declareMacro(myName, "do_bijection", "DO-BIJECTION");
    //declareMacro(myName, "do_bijection_inverse", "DO-BIJECTION-INVERSE");
    //declareFunction(myName, "do_bijection_style", "DO-BIJECTION-STYLE", 1, 0, false);
    //declareFunction(myName, "do_bijection_database", "DO-BIJECTION-DATABASE", 1, 0, false);
    //declareFunction(myName, "do_bijection_inverse_database", "DO-BIJECTION-INVERSE-DATABASE", 1, 0, false);
    //declareFunction(myName, "bijection_keys", "BIJECTION-KEYS", 1, 0, false);
    //declareFunction(myName, "bijection_values", "BIJECTION-VALUES", 1, 0, false);
    //declareFunction(myName, "bijection_to_alist", "BIJECTION-TO-ALIST", 1, 0, false);
    //declareFunction(myName, "bijection_to_hashtable", "BIJECTION-TO-HASHTABLE", 1, 0, false);
    //declareFunction(myName, "print_bijection_contents", "PRINT-BIJECTION-CONTENTS", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_bijection_file() {
    $bijection_high_water_mark$ = deflexical("*BIJECTION-HIGH-WATER-MARK*", $int0$40);
    $bijection_low_water_mark$ = deflexical("*BIJECTION-LOW-WATER-MARK*", $int1$30);
    $dtp_bijection$ = defconstant("*DTP-BIJECTION*", $sym2$BIJECTION);
    return NIL;
  }

  public static final SubLObject setup_bijection_file() {
    // CVS_ID("Id: bijection.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_bijection$.getGlobalValue(), Symbols.symbol_function($sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym10$BIJECTION_SIZE, $sym11$_CSETF_BIJECTION_SIZE);
    Structures.def_csetf($sym12$BIJECTION_DATABASE, $sym13$_CSETF_BIJECTION_DATABASE);
    Structures.def_csetf($sym14$BIJECTION_INVERSE_DATABASE, $sym15$_CSETF_BIJECTION_INVERSE_DATABASE);
    Structures.def_csetf($sym16$BIJECTION_TEST, $sym17$_CSETF_BIJECTION_TEST);
    Equality.identity($sym2$BIJECTION);
    access_macros.register_macro_helper($sym37$DO_BIJECTION_STYLE, $sym46$DO_BIJECTION);
    access_macros.register_macro_helper($sym39$DO_BIJECTION_DATABASE, $sym46$DO_BIJECTION);
    access_macros.register_macro_helper($sym45$DO_BIJECTION_INVERSE_DATABASE, $sym46$DO_BIJECTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$40 = makeInteger(40);
  public static final SubLInteger $int1$30 = makeInteger(30);
  public static final SubLSymbol $sym2$BIJECTION = makeSymbol("BIJECTION");
  public static final SubLSymbol $sym3$BIJECTION_P = makeSymbol("BIJECTION-P");
  public static final SubLList $list4 = list(makeSymbol("SIZE"), makeSymbol("DATABASE"), makeSymbol("INVERSE-DATABASE"), makeSymbol("TEST"));
  public static final SubLList $list5 = list(makeKeyword("SIZE"), makeKeyword("DATABASE"), makeKeyword("INVERSE-DATABASE"), makeKeyword("TEST"));
  public static final SubLList $list6 = list(makeSymbol("BIJECTION-SIZE"), makeSymbol("BIJECTION-DATABASE"), makeSymbol("BIJECTION-INVERSE-DATABASE"), makeSymbol("BIJECTION-TEST"));
  public static final SubLList $list7 = list(makeSymbol("_CSETF-BIJECTION-SIZE"), makeSymbol("_CSETF-BIJECTION-DATABASE"), makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE"), makeSymbol("_CSETF-BIJECTION-TEST"));
  public static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BIJECTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym10$BIJECTION_SIZE = makeSymbol("BIJECTION-SIZE");
  public static final SubLSymbol $sym11$_CSETF_BIJECTION_SIZE = makeSymbol("_CSETF-BIJECTION-SIZE");
  public static final SubLSymbol $sym12$BIJECTION_DATABASE = makeSymbol("BIJECTION-DATABASE");
  public static final SubLSymbol $sym13$_CSETF_BIJECTION_DATABASE = makeSymbol("_CSETF-BIJECTION-DATABASE");
  public static final SubLSymbol $sym14$BIJECTION_INVERSE_DATABASE = makeSymbol("BIJECTION-INVERSE-DATABASE");
  public static final SubLSymbol $sym15$_CSETF_BIJECTION_INVERSE_DATABASE = makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE");
  public static final SubLSymbol $sym16$BIJECTION_TEST = makeSymbol("BIJECTION-TEST");
  public static final SubLSymbol $sym17$_CSETF_BIJECTION_TEST = makeSymbol("_CSETF-BIJECTION-TEST");
  public static final SubLSymbol $kw18$SIZE = makeKeyword("SIZE");
  public static final SubLSymbol $kw19$DATABASE = makeKeyword("DATABASE");
  public static final SubLSymbol $kw20$INVERSE_DATABASE = makeKeyword("INVERSE-DATABASE");
  public static final SubLSymbol $kw21$TEST = makeKeyword("TEST");
  public static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw23$ALIST = makeKeyword("ALIST");
  public static final SubLSymbol $kw24$HASHTABLE = makeKeyword("HASHTABLE");
  public static final SubLSymbol $kw25$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str26$Corrupted_bijection__unsupported_ = makeString("Corrupted bijection; unsupported style ~S.~%");
  public static final SubLString $str27$Malformed_bijection_ = makeString("Malformed bijection.");
  public static final SubLSymbol $sym28$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym29$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLList $list30 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list31 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw32$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw33$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym34$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");
  public static final SubLSymbol $sym35$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym36$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $sym37$DO_BIJECTION_STYLE = makeSymbol("DO-BIJECTION-STYLE");
  public static final SubLSymbol $sym38$DO_ALIST = makeSymbol("DO-ALIST");
  public static final SubLSymbol $sym39$DO_BIJECTION_DATABASE = makeSymbol("DO-BIJECTION-DATABASE");
  public static final SubLSymbol $sym40$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLSymbol $sym41$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLSymbol $sym42$BIJECTION_STYLE_ERROR = makeSymbol("BIJECTION-STYLE-ERROR");
  public static final SubLList $list43 = list(list(makeSymbol("VALUE"), makeSymbol("KEY"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");
  public static final SubLSymbol $sym45$DO_BIJECTION_INVERSE_DATABASE = makeSymbol("DO-BIJECTION-INVERSE-DATABASE");
  public static final SubLSymbol $sym46$DO_BIJECTION = makeSymbol("DO-BIJECTION");
  public static final SubLList $list47 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLString $str48$_S______S__ = makeString("~S <-> ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_bijection_file();
  }

  public void initializeVariables() {
    init_bijection_file();
  }

  public void runTopLevelForms() {
    setup_bijection_file();
  }

}
