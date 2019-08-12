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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

 final class enumeration_types_hide extends SubLTranslatedFile {

  //// Constructor

  private enumeration_types_hide() {}
  public static final SubLFile me = new enumeration_types_hide();
  public static final String myName = "com.cyc.cycjava_1.cycl.enumeration_types";

  //// Definitions

  @SubL(source = "cycl/enumeration-types.lisp", position = 935)
  private static SubLSymbol $valid_directions$ = null;

  @SubL(source = "cycl/enumeration-types.lisp", position = 1059)
  public static final SubLObject valid_directions() {
    return $valid_directions$.getGlobalValue();
  }

  /** Return T iff OBJECT is a valid assertion inference direction
 :backward :forward or :code. */
  @SubL(source = "cycl/enumeration-types.lisp", position = 1116)
  public static final SubLObject direction_p(SubLObject object) {
    return list_utilities.member_eqP(object, $valid_directions$.getGlobalValue());
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 1322)
  public static final SubLObject encode_direction(SubLObject direction) {
    return Sequences.position(direction, valid_directions(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 1407)
  public static final SubLObject decode_direction(SubLObject fixnum) {
    return ConsesLow.nth(fixnum, valid_directions());
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 1480)
  private static SubLSymbol $valid_assertion_types$ = null;

  @SubL(source = "cycl/enumeration-types.lisp", position = 1776)
  public static SubLSymbol $valid_el_strengths$ = null;

  /** Return T iff OBJECT is a valid CycL assertion strength
 :default or :monotonic. */
  @SubL(source = "cycl/enumeration-types.lisp", position = 1895)
  public static final SubLObject el_strength_p(SubLObject object) {
    return list_utilities.member_eqP(object, $valid_el_strengths$.getGlobalValue());
  }

  /** Return T iff STRENGTH2 is subsumed by STRENGTH1 */
  @SubL(source = "cycl/enumeration-types.lisp", position = 2207)
  public static final SubLObject el_strength_implies(SubLObject strength1, SubLObject strength2) {
    return makeBoolean((NIL == list_utilities.position_L(strength1, strength2, $valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 2388)
  private static SubLSymbol $valid_truths$ = null;

  @SubL(source = "cycl/enumeration-types.lisp", position = 2496)
  public static final SubLObject valid_truths() {
    return $valid_truths$.getGlobalValue();
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 3015)
  public static final SubLObject truth_sense(SubLObject truth) {
    {
      SubLObject pcase_var = truth;
      if (pcase_var.eql($kw11$TRUE)) {
        return $kw17$POS;
      } else if (pcase_var.eql($kw12$FALSE)) {
        return $kw18$NEG;
      } else if (pcase_var.eql($kw13$UNKNOWN)) {
        return $kw18$NEG;
      } else {
        return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 3632)
  public static SubLSymbol $valid_senses$ = null;

  /** Return T iff OBJECT is a valid CycL literal sense
 :neg or :pos. */
  @SubL(source = "cycl/enumeration-types.lisp", position = 3717)
  public static final SubLObject sense_p(SubLObject object) {
    return list_utilities.member_eqP(object, $valid_senses$.getGlobalValue());
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 3889)
  public static final SubLObject inverse_sense(SubLObject sense) {
    {
      SubLObject pcase_var = sense;
      if (pcase_var.eql($kw17$POS)) {
        return $kw18$NEG;
      } else if (pcase_var.eql($kw18$NEG)) {
        return $kw17$POS;
      } else {
        return Errors.error($str23$_S_is_not_a_SENSE_P, sense);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 4044)
  public static final SubLObject sense_truth(SubLObject sense) {
    {
      SubLObject pcase_var = sense;
      if (pcase_var.eql($kw17$POS)) {
        return $kw11$TRUE;
      } else if (pcase_var.eql($kw18$NEG)) {
        return $kw12$FALSE;
      } else {
        return Errors.error($str23$_S_is_not_a_SENSE_P, sense);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 4200)
  private static SubLSymbol $valid_hl_truth_values$ = null;

  @SubL(source = "cycl/enumeration-types.lisp", position = 4334)
  public static final SubLObject valid_hl_truth_values() {
    return $valid_hl_truth_values$.getGlobalValue();
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 4534)
  public static final SubLObject encode_tv(SubLObject tv) {
    return Sequences.position(tv, valid_hl_truth_values(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 4603)
  public static final SubLObject decode_tv(SubLObject fixnum) {
    return ConsesLow.nth(fixnum, valid_hl_truth_values());
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 4674)
  public static final SubLObject tv_strength(SubLObject tv) {
    {
      SubLObject pcase_var = tv;
      if (pcase_var.eql($kw25$TRUE_DEF)) {
        return $kw26$DEFAULT;
      } else if (pcase_var.eql($kw27$TRUE_MON)) {
        return $kw28$MONOTONIC;
      } else if (pcase_var.eql($kw29$FALSE_DEF)) {
        return $kw26$DEFAULT;
      } else if (pcase_var.eql($kw30$FALSE_MON)) {
        return $kw28$MONOTONIC;
      } else if (pcase_var.eql($kw13$UNKNOWN)) {
        return $kw26$DEFAULT;
      } else {
        return Errors.error($str31$_S_does_not_satisfy_TV_P, tv);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 5007)
  public static final SubLObject tv_truth(SubLObject tv) {
    {
      SubLObject pcase_var = tv;
      if (pcase_var.eql($kw25$TRUE_DEF)) {
        return $kw11$TRUE;
      } else if (pcase_var.eql($kw27$TRUE_MON)) {
        return $kw11$TRUE;
      } else if (pcase_var.eql($kw29$FALSE_DEF)) {
        return $kw12$FALSE;
      } else if (pcase_var.eql($kw30$FALSE_MON)) {
        return $kw12$FALSE;
      } else if (pcase_var.eql($kw13$UNKNOWN)) {
        return $kw13$UNKNOWN;
      } else {
        return Errors.error($str31$_S_does_not_satisfy_TV_P, tv);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 5750)
  public static final SubLObject tv_from_truth_strength(SubLObject truth, SubLObject strength) {
    {
      SubLObject pcase_var = truth;
      if (pcase_var.eql($kw11$TRUE)) {
        {
          SubLObject pcase_var_1 = strength;
          if (pcase_var_1.eql($kw26$DEFAULT)) {
            return $kw25$TRUE_DEF;
          } else if (pcase_var_1.eql($kw28$MONOTONIC)) {
            return $kw27$TRUE_MON;
          } else {
            return Errors.error($str32$_S_is_not_a_STRENGTH_P, strength);
          }
        }
      } else if (pcase_var.eql($kw12$FALSE)) {
        {
          SubLObject pcase_var_2 = strength;
          if (pcase_var_2.eql($kw26$DEFAULT)) {
            return $kw29$FALSE_DEF;
          } else if (pcase_var_2.eql($kw28$MONOTONIC)) {
            return $kw30$FALSE_MON;
          } else {
            return Errors.error($str32$_S_is_not_a_STRENGTH_P, strength);
          }
        }
      } else if (pcase_var.eql($kw13$UNKNOWN)) {
        return $kw13$UNKNOWN;
      } else {
        return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
      }
    }
  }

  @SubL(source = "cycl/enumeration-types.lisp", position = 6393)
  public static SubLSymbol $term_args$ = null;

  public static final SubLObject declare_enumeration_types_file() {
    declareFunction(myName, "valid_directions", "VALID-DIRECTIONS", 0, 0, false);
    declareFunction(myName, "direction_p", "DIRECTION-P", 1, 0, false);
    declareFunction(myName, "encode_direction", "ENCODE-DIRECTION", 1, 0, false);
    declareFunction(myName, "decode_direction", "DECODE-DIRECTION", 1, 0, false);
    declareFunction(myName, "assertion_type_p", "ASSERTION-TYPE-P", 1, 0, false);
    declareFunction(myName, "el_strength_p", "EL-STRENGTH-P", 1, 0, false);
    declareFunction(myName, "el_strength_spec_p", "EL-STRENGTH-SPEC-P", 1, 0, false);
    declareFunction(myName, "el_strength_implies", "EL-STRENGTH-IMPLIES", 2, 0, false);
    declareFunction(myName, "valid_truths", "VALID-TRUTHS", 0, 0, false);
    declareFunction(myName, "truth_p", "TRUTH-P", 1, 0, false);
    declareFunction(myName, "inverse_truth", "INVERSE-TRUTH", 1, 0, false);
    declareFunction(myName, "truth_sense", "TRUTH-SENSE", 1, 0, false);
    declareFunction(myName, "truth_boolean", "TRUTH-BOOLEAN", 1, 0, false);
    declareFunction(myName, "boolean_truth", "BOOLEAN-TRUTH", 1, 0, false);
    declareFunction(myName, "sense_p", "SENSE-P", 1, 0, false);
    declareFunction(myName, "inverse_sense", "INVERSE-SENSE", 1, 0, false);
    declareFunction(myName, "sense_truth", "SENSE-TRUTH", 1, 0, false);
    declareFunction(myName, "valid_hl_truth_values", "VALID-HL-TRUTH-VALUES", 0, 0, false);
    declareFunction(myName, "tv_p", "TV-P", 1, 0, false);
    declareFunction(myName, "encode_tv", "ENCODE-TV", 1, 0, false);
    declareFunction(myName, "decode_tv", "DECODE-TV", 1, 0, false);
    declareFunction(myName, "tv_strength", "TV-STRENGTH", 1, 0, false);
    declareFunction(myName, "tv_truth", "TV-TRUTH", 1, 0, false);
    declareFunction(myName, "inverse_tv", "INVERSE-TV", 1, 0, false);
    declareFunction(myName, "tv_trueP", "TV-TRUE?", 1, 0, false);
    declareFunction(myName, "tv_falseP", "TV-FALSE?", 1, 0, false);
    declareFunction(myName, "tv_sense", "TV-SENSE", 1, 0, false);
    declareFunction(myName, "tv_from_truth_strength", "TV-FROM-TRUTH-STRENGTH", 2, 0, false);
    declareFunction(myName, "tv_from_sense_strength", "TV-FROM-SENSE-STRENGTH", 2, 0, false);
    declareFunction(myName, "term_arg_p", "TERM-ARG-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_enumeration_types_file() {
    $valid_directions$ = defconstant("*VALID-DIRECTIONS*", $list0);
    $valid_assertion_types$ = defconstant("*VALID-ASSERTION-TYPES*", $list5);
    $valid_el_strengths$ = defconstant("*VALID-EL-STRENGTHS*", $list6);
    $valid_truths$ = defconstant("*VALID-TRUTHS*", $list10);
    $valid_senses$ = defconstant("*VALID-SENSES*", $list20);
    $valid_hl_truth_values$ = defconstant("*VALID-HL-TRUTH-VALUES*", $list24);
    $term_args$ = defconstant("*TERM-ARGS*", $list33);
    return NIL;
  }

  public static final SubLObject setup_enumeration_types_file() {
        utilities_macros.register_cyc_api_function($sym1$DIRECTION_P, $list2, $str3$Return_T_iff_OBJECT_is_a_valid_as, NIL, $list4);
    utilities_macros.register_cyc_api_function($sym7$EL_STRENGTH_P, $list2, $str8$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4);
    utilities_macros.register_cyc_api_function($sym14$TRUTH_P, $list2, $str15$Returns_T_iff_OBJECT_is_a_valid_C, NIL, NIL);
    utilities_macros.register_cyc_api_function($sym21$SENSE_P, $list2, $str22$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"), makeKeyword("CODE"));
  public static final SubLSymbol $sym1$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLList $list2 = list(makeSymbol("OBJECT"));
  public static final SubLString $str3$Return_T_iff_OBJECT_is_a_valid_as = makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");
  public static final SubLList $list4 = list(makeSymbol("BOOLEANP"));
  public static final SubLList $list5 = list(makeKeyword("GAF"), makeKeyword("RULE"));
  public static final SubLList $list6 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));
  public static final SubLSymbol $sym7$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLString $str8$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");
  public static final SubLSymbol $kw9$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLList $list10 = list(makeKeyword("TRUE"), makeKeyword("UNKNOWN"), makeKeyword("FALSE"));
  public static final SubLSymbol $kw11$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw12$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw13$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym14$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLString $str15$Returns_T_iff_OBJECT_is_a_valid_C = makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");
  public static final SubLString $str16$_S_is_not_a_TRUTH_P = makeString("~S is not a TRUTH-P");
  public static final SubLSymbol $kw17$POS = makeKeyword("POS");
  public static final SubLSymbol $kw18$NEG = makeKeyword("NEG");
  public static final SubLString $str19$_unknown_cannot_be_converted_into = makeString(":unknown cannot be converted into a boolean");
  public static final SubLList $list20 = list(makeKeyword("NEG"), makeKeyword("POS"));
  public static final SubLSymbol $sym21$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLString $str22$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");
  public static final SubLString $str23$_S_is_not_a_SENSE_P = makeString("~S is not a SENSE-P");
  public static final SubLList $list24 = list(makeKeyword("TRUE-MON"), makeKeyword("TRUE-DEF"), makeKeyword("UNKNOWN"), makeKeyword("FALSE-DEF"), makeKeyword("FALSE-MON"));
  public static final SubLSymbol $kw25$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw26$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw27$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw28$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLSymbol $kw29$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLSymbol $kw30$FALSE_MON = makeKeyword("FALSE-MON");
  public static final SubLString $str31$_S_does_not_satisfy_TV_P = makeString("~S does not satisfy TV-P");
  public static final SubLString $str32$_S_is_not_a_STRENGTH_P = makeString("~S is not a STRENGTH-P");
  public static final SubLList $list33 = list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword("NEG"), makeKeyword("POS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword("IST"), makeKeyword("OTHER")});

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_enumeration_types_file();
  }

  @Override
  public void initializeVariables() {
    init_enumeration_types_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_enumeration_types_file();
  }

}
