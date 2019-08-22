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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class scientific_numbers extends SubLTranslatedFile {

  //// Constructor

  private scientific_numbers() {}
  public static final SubLFile me = new scientific_numbers();
  public static final String myName = "com.cyc.cycjava_1.cycl.scientific_numbers";

  //// Definitions

  /** We check that object is a nat with functor #$ScientificNumberFn
   and two integer args. */
  @SubL(source = "cycl/scientific-numbers.lisp", position = 616) 
  public static final SubLObject scientific_number_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_with_operator_p(object, $const1$ScientificNumberFn))
           && (NIL != el_utilities.el_binary_formula_p(object))
           && cycl_utilities.formula_arg1(object, UNPROVIDED).isInteger()
           && cycl_utilities.formula_arg2(object, UNPROVIDED).isInteger()));
  }

  public static final SubLObject declare_scientific_numbers_file() {
    //declareFunction("cyc_scientific_number_p", "CYC-SCIENTIFIC-NUMBER-P", 1, 0, false);
    declareFunction("scientific_number_p", "SCIENTIFIC-NUMBER-P", 1, 0, false);
    //declareFunction("new_scientific_number", "NEW-SCIENTIFIC-NUMBER", 2, 0, false);
    //declareFunction("new_scientific_number_from_integer", "NEW-SCIENTIFIC-NUMBER-FROM-INTEGER", 1, 1, false);
    //declareFunction("scientific_number_significand", "SCIENTIFIC-NUMBER-SIGNIFICAND", 1, 0, false);
    //declareFunction("scientific_number_exponent", "SCIENTIFIC-NUMBER-EXPONENT", 1, 0, false);
    //declareFunction("copy_scientific_number", "COPY-SCIENTIFIC-NUMBER", 1, 0, false);
    //declareFunction("scientific_number_zero_p", "SCIENTIFIC-NUMBER-ZERO-P", 1, 0, false);
    //declareFunction("scientific_number_minus_p", "SCIENTIFIC-NUMBER-MINUS-P", 1, 0, false);
    //declareFunction("scientific_number_plus_p", "SCIENTIFIC-NUMBER-PLUS-P", 1, 0, false);
    //declareFunction("scientific_number_non_negative_p", "SCIENTIFIC-NUMBER-NON-NEGATIVE-P", 1, 0, false);
    //declareFunction("scientific_number_add_significant_zeros", "SCIENTIFIC-NUMBER-ADD-SIGNIFICANT-ZEROS", 2, 0, false);
    //declareFunction("cyc_scientific_number_from_string", "CYC-SCIENTIFIC-NUMBER-FROM-STRING", 1, 0, false);
    //declareFunction("scientific_number_from_string", "SCIENTIFIC-NUMBER-FROM-STRING", 1, 1, false);
    //declareFunction("first_non_zero_digit_position", "FIRST-NON-ZERO-DIGIT-POSITION", 1, 0, false);
    //declareFunction("non_zero_digit_char_p", "NON-ZERO-DIGIT-CHAR-P", 1, 0, false);
    //declareFunction("cyc_scientific_number_to_string", "CYC-SCIENTIFIC-NUMBER-TO-STRING", 1, 0, false);
    //declareFunction("cyc_scientific_number_from_subl_real", "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 0, false);
    //declareFunction("scientific_number_from_subl_real", "SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 1, false);
    //declareFunction("cyc_scientific_number_to_subl_real", "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false);
    //declareFunction("cyc_scientific_number_significant_digit_count", "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_scientific_numbers_file() {
    return NIL;
  }

  public static final SubLObject setup_scientific_numbers_file() {
    utilities_macros.register_kb_function($sym0$CYC_SCIENTIFIC_NUMBER_P);
    utilities_macros.register_kb_function($sym5$CYC_SCIENTIFIC_NUMBER_FROM_STRING);
    utilities_macros.register_kb_function($sym13$CYC_SCIENTIFIC_NUMBER_TO_STRING);
    utilities_macros.register_kb_function($sym14$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
    utilities_macros.register_kb_function($sym15$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
    utilities_macros.register_kb_function($sym16$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CYC_SCIENTIFIC_NUMBER_P = makeSymbol("CYC-SCIENTIFIC-NUMBER-P");
  public static final SubLObject $const1$ScientificNumberFn = constant_handles.reader_make_constant_shell(makeString("ScientificNumberFn"));
  public static final SubLSymbol $sym2$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym3$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym4$SCIENTIFIC_NUMBER_P = makeSymbol("SCIENTIFIC-NUMBER-P");
  public static final SubLSymbol $sym5$CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-STRING");
  public static final SubLSymbol $sym6$ALPHA_CHAR_P = makeSymbol("ALPHA-CHAR-P");
  public static final SubLString $str7$0 = makeString("0");
  public static final SubLString $str8$_ = makeString("-");
  public static final SubLSymbol $sym9$NON_ZERO_DIGIT_CHAR_P = makeSymbol("NON-ZERO-DIGIT-CHAR-P");
  public static final SubLString $str10$e = makeString("e");
  public static final SubLString $str11$ = makeString("");
  public static final SubLString $str12$_ = makeString(".");
  public static final SubLSymbol $sym13$CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-STRING");
  public static final SubLSymbol $sym14$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL");
  public static final SubLSymbol $sym15$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL");
  public static final SubLSymbol $sym16$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol("CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT");

  //// Initializers

  public void declareFunctions() {
    declare_scientific_numbers_file();
  }

  public void initializeVariables() {
    init_scientific_numbers_file();
  }

  public void runTopLevelForms() {
    setup_scientific_numbers_file();
  }

}
