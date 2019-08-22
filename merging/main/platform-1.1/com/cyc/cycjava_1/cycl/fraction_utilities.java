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
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class fraction_utilities extends SubLTranslatedFile {

  //// Constructor

  private fraction_utilities() {}
  public static final SubLFile me = new fraction_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.fraction_utilities";

  //// Definitions

  public static final class $fraction_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $numerator; }
    public SubLObject getField3() { return $denominator; }
    public SubLObject setField2(SubLObject value) { return $numerator = value; }
    public SubLObject setField3(SubLObject value) { return $denominator = value; }
    public SubLObject $numerator = NIL;
    public SubLObject $denominator = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($fraction_native.class, $sym0$FRACTION, $sym1$FRACTION_P, $list2, $list3, new String[] {"$numerator", "$denominator"}, $list4, $list5, $sym6$PRINT_FRACTION);
  }

  @SubL(source = "cycl/fraction-utilities.lisp", position = 1062) 
  public static SubLSymbol $dtp_fraction$ = null;

  @SubL(source = "cycl/fraction-utilities.lisp", position = 1062) 
  public static final SubLObject fraction_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11427");
    return NIL;
  }

  public static final class $fraction_p$UnaryFunction extends UnaryFunction {
    public $fraction_p$UnaryFunction() { super(extractFunctionNamed("FRACTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11413"); }
  }

  public static final SubLObject declare_fraction_utilities_file() {
    declareFunction(myName, "fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "fraction_p", "FRACTION-P", 1, 0, false); new $fraction_p$UnaryFunction();
    //declareFunction(myName, "fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
    //declareFunction(myName, "fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
    //declareFunction(myName, "_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
    //declareFunction(myName, "_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
    //declareFunction(myName, "make_fraction", "MAKE-FRACTION", 0, 1, false);
    //declareFunction(myName, "print_fraction", "PRINT-FRACTION", 3, 0, false);
    //declareFunction(myName, "new_fraction", "NEW-FRACTION", 1, 1, false);
    //declareFunction(myName, "integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
    //declareFunction(myName, "number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
    //declareFunction(myName, "list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
    //declareFunction(myName, "list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
    //declareFunction(myName, "list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
    //declareFunction(myName, "fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
    //declareFunction(myName, "fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
    //declareFunction(myName, "numerator", "NUMERATOR", 1, 0, false);
    //declareFunction(myName, "denominator", "DENOMINATOR", 1, 0, false);
    //declareFunction(myName, "integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
    //declareFunction(myName, "fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
    //declareFunction(myName, "fractionify", "FRACTIONIFY", 1, 0, false);
    //declareFunction(myName, "defractionify", "DEFRACTIONIFY", 1, 0, false);
    //declareFunction(myName, "fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
    //declareFunction(myName, "reciprocal", "RECIPROCAL", 1, 0, false);
    //declareFunction(myName, "reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
    //declareFunction(myName, "reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
    //declareFunction(myName, "fractionE", "FRACTION=", 2, 0, false);
    //declareFunction(myName, "fraction_times", "FRACTION-TIMES", 1, 0, false);
    //declareFunction(myName, "fraction_times2", "FRACTION-TIMES2", 2, 0, false);
    //declareFunction(myName, "fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
    //declareFunction(myName, "fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
    //declareFunction(myName, "fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
    //declareFunction(myName, "fraction_add", "FRACTION-ADD", 1, 0, false);
    //declareFunction(myName, "fraction_add2", "FRACTION-ADD2", 2, 0, false);
    //declareFunction(myName, "fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
    //declareFunction(myName, "fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
    //declareFunction(myName, "fraction_minus", "FRACTION-MINUS", 1, 1, false);
    //declareFunction(myName, "normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_fraction_utilities_file() {
    $dtp_fraction$ = defconstant("*DTP-FRACTION*", $sym0$FRACTION);
    return NIL;
  }

  public static final SubLObject setup_fraction_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), Symbols.symbol_function($sym7$FRACTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$FRACT_NUMERATOR, $sym9$_CSETF_FRACT_NUMERATOR);
    Structures.def_csetf($sym10$FRACT_DENOMINATOR, $sym11$_CSETF_FRACT_DENOMINATOR);
    Equality.identity($sym0$FRACTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FRACTION = makeSymbol("FRACTION");
  public static final SubLSymbol $sym1$FRACTION_P = makeSymbol("FRACTION-P");
  public static final SubLList $list2 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));
  public static final SubLList $list3 = list(makeKeyword("NUMERATOR"), makeKeyword("DENOMINATOR"));
  public static final SubLList $list4 = list(makeSymbol("FRACT-NUMERATOR"), makeSymbol("FRACT-DENOMINATOR"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-FRACT-NUMERATOR"), makeSymbol("_CSETF-FRACT-DENOMINATOR"));
  public static final SubLSymbol $sym6$PRINT_FRACTION = makeSymbol("PRINT-FRACTION");
  public static final SubLSymbol $sym7$FRACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FRACTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$FRACT_NUMERATOR = makeSymbol("FRACT-NUMERATOR");
  public static final SubLSymbol $sym9$_CSETF_FRACT_NUMERATOR = makeSymbol("_CSETF-FRACT-NUMERATOR");
  public static final SubLSymbol $sym10$FRACT_DENOMINATOR = makeSymbol("FRACT-DENOMINATOR");
  public static final SubLSymbol $sym11$_CSETF_FRACT_DENOMINATOR = makeSymbol("_CSETF-FRACT-DENOMINATOR");
  public static final SubLSymbol $kw12$NUMERATOR = makeKeyword("NUMERATOR");
  public static final SubLSymbol $kw13$DENOMINATOR = makeKeyword("DENOMINATOR");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$_A__A = makeString("~A/~A");
  public static final SubLSymbol $sym16$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym17$NON_ZERO_INTEGER_P = makeSymbol("NON-ZERO-INTEGER-P");
  public static final SubLSymbol $sym18$INTEGER_OR_FRACTION_P = makeSymbol("INTEGER-OR-FRACTION-P");
  public static final SubLSymbol $sym19$NUMBER_OR_FRACTION_P = makeSymbol("NUMBER-OR-FRACTION-P");
  public static final SubLSymbol $sym20$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym21$FRACTIONIFY = makeSymbol("FRACTIONIFY");
  public static final SubLString $str22$Attempt_to_fraction_divide_by_zer = makeString("Attempt to fraction-divide by zero");
  public static final SubLSymbol $sym23$DENOMINATOR = makeSymbol("DENOMINATOR");
  public static final SubLSymbol $sym24$FRACTION_REDUCE = makeSymbol("FRACTION-REDUCE");

  //// Initializers

  public void declareFunctions() {
    declare_fraction_utilities_file();
  }

  public void initializeVariables() {
    init_fraction_utilities_file();
  }

  public void runTopLevelForms() {
    setup_fraction_utilities_file();
  }

}
