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
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.format_nil;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.scientific_numbers;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class number_utilities extends SubLTranslatedFile {

  //// Constructor

  private number_utilities() {}
  public static final SubLFile me = new number_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.number_utilities";

  //// Definitions

  /** Return (+ NUMBER 1) */
  @SubL(source = "cycl/number-utilities.lisp", position = 648) 
  public static final SubLObject f_1X(SubLObject number) {
    return Numbers.add(number, ONE_INTEGER);
  }

  /** Return (- NUMBER 1) */
  @SubL(source = "cycl/number-utilities.lisp", position = 798) 
  public static final SubLObject f_1_(SubLObject number) {
    return Numbers.subtract(number, ONE_INTEGER);
  }

  /** Return (* NUMBER 2) */
  @SubL(source = "cycl/number-utilities.lisp", position = 890) 
  public static final SubLObject f_2X(SubLObject number) {
    return Numbers.add(number, number);
  }

  /** Return T iff OBJECT is 1 */
  @SubL(source = "cycl/number-utilities.lisp", position = 987) 
  public static final SubLObject onep(SubLObject object) {
    return Equality.eql(ONE_INTEGER, object);
  }

  /** Convert any object to either 1 or 0 */
  @SubL(source = "cycl/number-utilities.lisp", position = 1236) 
  public static final SubLObject encode_boolean(SubLObject object) {
    return ((NIL != object) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER);
  }

  /** Convert 1 or 0 to T or NIL. */
  @SubL(source = "cycl/number-utilities.lisp", position = 1335) 
  public static final SubLObject decode_boolean(SubLObject integer) {
    return makeBoolean((!(integer.isZero())));
  }

  /** Return the boolean value encoded in BIT-NUMBER of BITS. */
  @SubL(source = "cycl/number-utilities.lisp", position = 1479) 
  public static final SubLObject get_bit(SubLObject bits, SubLObject bit_number) {
    return decode_boolean(bytes.ldb(bytes.sublisp_byte(ONE_INTEGER, bit_number), bits));
  }

  /** Set BIT-NUMBER bit in BITS (an integer) to BOOLEAN. */
  @SubL(source = "cycl/number-utilities.lisp", position = 1631) 
  public static final SubLObject set_bit(SubLObject bits, SubLObject bit_number, SubLObject v_boolean) {
    if ((v_boolean == UNPROVIDED)) {
      v_boolean = T;
    }
    return bytes.dpb(encode_boolean(v_boolean), bytes.sublisp_byte(ONE_INTEGER, bit_number), bits);
  }

  /** A large positive integer guaranteed to be stored immediately */
  @SubL(source = "cycl/number-utilities.lisp", position = 1939) 
  public static SubLSymbol $large_immediate_positive_integer$ = null;

  /** exp1, what a silly name for e. */
  @SubL(source = "cycl/number-utilities.lisp", position = 2137) 
  public static SubLSymbol $e$ = null;

  /** Return T iff OBJECT is an integer from 0-255 */
  @SubL(source = "cycl/number-utilities.lisp", position = 2749) 
  public static final SubLObject bytep(SubLObject object) {
    return makeBoolean((object.isInteger()
           && ZERO_INTEGER.numLE(object)
           && object.numL($int2$256)));
  }

  /** Like @xref ZEROP, but doesn't error on non-numbers. */
  @SubL(source = "cycl/number-utilities.lisp", position = 4758) 
  public static final SubLObject zero_number_p(SubLObject object) {
    {
      SubLObject result = NIL;
      SubLObject ignore_errors_tag = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER));
            try {
              result = Numbers.zerop(object);
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
      }
      return result;
    }
  }

  /** The maximum possible number of significant digits for a floating-point number. */
  @SubL(source = "cycl/number-utilities.lisp", position = 5766) 
  private static SubLSymbol $maximum_float_significant_digits$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 5970) 
  public static final SubLObject significant_digits(SubLObject number, SubLObject digits) {
    checkType(number, $sym10$EXTENDED_POTENTIALLY_INFINITE_NUMBER_P);
    checkType(digits, $sym11$POSITIVE_INTEGER_P);
    if ((NIL != infinite_number_p(number))) {
      return number;
    } else if ((NIL != scientific_numbers.scientific_number_p(number))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 690");
    } else if (number.isZero()) {
      return ZERO_INTEGER;
    } else if (number.isNegative()) {
      return Numbers.minus(significant_digits(Numbers.minus(number), digits));
    } else if ((number.isInteger()
         && digits.numGE(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31687")))) {
      return number;
    } else if ((number.isDouble()
         && digits.numGE($maximum_float_significant_digits$.getGlobalValue()))) {
      return number;
    } else {
      {
        SubLObject normalization_power = Numbers.floor(Numbers.log(number, TEN_INTEGER), UNPROVIDED);
        SubLObject normalization_ratio = Numbers.expt(TEN_INTEGER, normalization_power);
        SubLObject normalized_number = Numbers.divide(number, normalization_ratio);
        SubLObject significant_ratio = Numbers.expt(TEN_INTEGER, Numbers.subtract(digits, ONE_INTEGER));
        SubLObject scaled_normalized = Numbers.multiply(normalized_number, significant_ratio);
        SubLObject scaled_significant = Numbers.round(scaled_normalized, UNPROVIDED);
        SubLObject normalized_significant = Numbers.divide(scaled_significant, significant_ratio);
        SubLObject significant = Numbers.multiply(normalized_significant, normalization_ratio);
        if (number.isInteger()) {
          {
            SubLObject unnormalization_power = Numbers.subtract(normalization_power, Numbers.subtract(digits, ONE_INTEGER));
            SubLObject unnormalization_ratio = Numbers.expt(TEN_INTEGER, unnormalization_power);
            significant = Numbers.multiply(scaled_significant, unnormalization_ratio);
          }
        }
        if ((significant.isDouble()
             && number.numGE(Numbers.$most_negative_fixnum$.getGlobalValue())
             && number.numLE(Numbers.$most_positive_fixnum$.getGlobalValue()))) {
          {
            SubLObject nearest_integer = Numbers.round(significant, UNPROVIDED);
            if (nearest_integer.numE(significant)) {
              significant = nearest_integer;
            }
          }
        }
        if (significant.isDouble()) {
          significant = significant_digits_optimize_float(significant);
        }
        return significant;
      }
    }
  }

  @SubL(source = "cycl/number-utilities.lisp", position = 8488) 
  public static final SubLObject significant_digits_optimize_float(SubLObject v_float) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject significand = Numbers.integer_decode_float(v_float);
        SubLObject exponent = thread.secondMultipleValue();
        SubLObject sign = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject tersest_length = Numbers.$most_positive_fixnum$.getGlobalValue();
          SubLObject tersest_float = NIL;
          SubLObject end_var = THREE_INTEGER;
          SubLObject delta = NIL;
          for (delta = $int12$_2; (!(delta.numGE(end_var))); delta = f_1X(delta)) {
            {
              SubLObject candidate_significand = Numbers.add(significand, delta);
              SubLObject candidate_float = Numbers.multiply(sign, Numbers.scale_float(Numbers.sublisp_float(candidate_significand, v_float), exponent));
              SubLObject candidate_length = Sequences.length(print_high.prin1_to_string(candidate_float));
              if (candidate_length.numL(tersest_length)) {
                tersest_length = candidate_length;
                tersest_float = candidate_float;
              }
            }
          }
          return tersest_float;
        }
      }
    }
  }

  /** Express NUMERATOR/DENOMINATOR as a percent.
   The answer is limited to SIGNIFICANT-DIGITS, when non-nil. */
  @SubL(source = "cycl/number-utilities.lisp", position = 10119) 
  public static final SubLObject percent(SubLObject numerator, SubLObject denominator, SubLObject significant_digits) {
    if ((denominator == UNPROVIDED)) {
      denominator = ONE_INTEGER;
    }
    if ((significant_digits == UNPROVIDED)) {
      significant_digits = NIL;
    }
    {
      SubLObject result = Numbers.multiply($int13$100, Numbers.divide(numerator, denominator));
      if ((NIL != significant_digits)) {
        result = significant_digits(result, significant_digits);
      }
      return result;
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 11383) 
  public static final SubLObject potentially_infinite_number_p(SubLObject object) {
    return makeBoolean((object.isNumber()
          || (NIL != infinite_number_p(object))));
  }

  @SubL(source = "cycl/number-utilities.lisp", position = 11769) 
  public static final SubLObject positive_infinity() {
    return $kw17$POSITIVE_INFINITY;
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 11834) 
  public static final SubLObject negative_infinity_p(SubLObject object) {
    return Equality.eq(object, $kw16$NEGATIVE_INFINITY);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 11940) 
  public static final SubLObject positive_infinity_p(SubLObject object) {
    return Equality.eq(object, $kw17$POSITIVE_INFINITY);
  }

  @SubL(source = "cycl/number-utilities.lisp", position = 12046) 
  public static final SubLObject infinite_number_p(SubLObject object) {
    return makeBoolean(((NIL != negative_infinity_p(object))
          || (NIL != positive_infinity_p(object))));
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 12658) 
  public static final SubLObject potentially_infinite_number_E(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    return Equality.eql(num1, num2);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 12862) 
  public static final SubLObject potentially_infinite_number_L(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != negative_infinity_p(num1))) {
      return makeBoolean((NIL == negative_infinity_p(num2)));
    } else if ((NIL != negative_infinity_p(num2))) {
      return NIL;
    } else if ((NIL != positive_infinity_p(num2))) {
      return makeBoolean((NIL == positive_infinity_p(num1)));
    } else if ((NIL != positive_infinity_p(num1))) {
      return NIL;
    } else {
      return Numbers.numL(num1, num2);
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 13315) 
  public static final SubLObject potentially_infinite_number_G(SubLObject num1, SubLObject num2) {
    return potentially_infinite_number_L(num2, num1);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 13445) 
  public static final SubLObject potentially_infinite_number_LE(SubLObject num1, SubLObject num2) {
    return makeBoolean(((NIL != potentially_infinite_number_E(num1, num2))
          || (NIL != potentially_infinite_number_L(num1, num2))));
  }

  /** @return potentially-infinite-number-p */
  @SubL(source = "cycl/number-utilities.lisp", position = 13813) 
  public static final SubLObject potentially_infinite_number_plus(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != negative_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31726");
    } else if ((NIL != negative_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31727");
    } else if ((NIL != positive_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31742");
    } else if ((NIL != positive_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31743");
    } else {
      return Numbers.add(num1, num2);
    }
  }

  /** @return potentially-infinite-number-p */
  @SubL(source = "cycl/number-utilities.lisp", position = 14973) 
  public static final SubLObject potentially_infinite_number_times(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != negative_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31728");
    } else if ((NIL != negative_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31729");
    } else if ((NIL != positive_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31744");
    } else if ((NIL != positive_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31745");
    } else {
      return Numbers.multiply(num1, num2);
    }
  }

  /** @return potentially-infinite-number-p */
  @SubL(source = "cycl/number-utilities.lisp", position = 15612) 
  public static final SubLObject potentially_infinite_number_divided_by(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != zero_number_p(num2))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31731"))) {
        return $kw16$NEGATIVE_INFINITY;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31747"))) {
        return $kw17$POSITIVE_INFINITY;
      } else if (ZERO_INTEGER.eql(num1)) {
        Errors.error($str19$Can_t_divide_zero_by_zero);
      }
    } else if ((NIL != negative_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31723");
    } else if ((NIL != negative_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31688");
    } else if ((NIL != positive_infinity_p(num1))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31739");
    } else if ((NIL != positive_infinity_p(num2))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31689");
    } else {
      return Numbers.divide(num1, num2);
    }
    return NIL;
  }

  /** @param NUM1 potentially-infinite-number-p
   @param NUM2 potentially-infinite-number-p
   @return potentially-infinite-number-p.  Returns the max value between NUM1 and NUM2 */
  @SubL(source = "cycl/number-utilities.lisp", position = 16614) 
  public static final SubLObject potentially_infinite_number_max(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != potentially_infinite_number_G(num1, num2))) {
      return num1;
    } else {
      return num2;
    }
  }

  /** @param NUM1 potentially-infinite-number-p
   @param NUM2 potentially-infinite-number-p
   @return potentially-infinite-number-p.  Returns the min value between NUM1 and NUM2 */
  @SubL(source = "cycl/number-utilities.lisp", position = 17113) 
  public static final SubLObject potentially_infinite_number_min(SubLObject num1, SubLObject num2) {
    checkType(num1, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    if ((NIL != potentially_infinite_number_L(num1, num2))) {
      return num1;
    } else {
      return num2;
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 22644) 
  public static final SubLObject potentially_infinite_integer_E(SubLObject int1, SubLObject int2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(int2, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    return Equality.eql(int1, int2);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 22851) 
  public static final SubLObject potentially_infinite_integer_L(SubLObject int1, SubLObject int2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(int2, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    return potentially_infinite_number_L(int1, int2);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 23084) 
  public static final SubLObject potentially_infinite_integer_G(SubLObject int1, SubLObject int2) {
    return potentially_infinite_integer_L(int2, int1);
  }

  /** @return booleanp */
  @SubL(source = "cycl/number-utilities.lisp", position = 23216) 
  public static final SubLObject potentially_infinite_integer_LE(SubLObject int1, SubLObject int2) {
    return makeBoolean(((NIL != potentially_infinite_integer_E(int1, int2))
          || (NIL != potentially_infinite_integer_L(int1, int2))));
  }

  /** @return potentially-infinite-integer-p */
  @SubL(source = "cycl/number-utilities.lisp", position = 23590) 
  public static final SubLObject potentially_infinite_integer_plus(SubLObject int1, SubLObject int2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(int2, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    return potentially_infinite_number_plus(int1, int2);
  }

  /** @return potentially-infinite-integer-p */
  @SubL(source = "cycl/number-utilities.lisp", position = 24311) 
  public static final SubLObject potentially_infinite_integer_times(SubLObject int1, SubLObject int2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(int2, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    return potentially_infinite_number_times(int1, int2);
  }

  /** @return potentially-infinite-integer-p; a truncated version of (INT1 * NUM2) */
  @SubL(source = "cycl/number-utilities.lisp", position = 24730) 
  public static final SubLObject potentially_infinite_integer_times_number_rounded(SubLObject int1, SubLObject num2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    {
      SubLObject raw_product = potentially_infinite_number_times(int1, num2);
      if ((NIL != infinite_number_p(raw_product))) {
        return raw_product;
      } else {
        return Numbers.truncate(raw_product, UNPROVIDED);
      }
    }
  }

  /** @return potentially-infinite-integer-p; a truncated version of (INT1 / NUM2) */
  @SubL(source = "cycl/number-utilities.lisp", position = 25585) 
  public static final SubLObject potentially_infinite_integer_divided_by_number_rounded(SubLObject int1, SubLObject num2) {
    checkType(int1, $sym29$POTENTIALLY_INFINITE_INTEGER_P);
    checkType(num2, $sym18$POTENTIALLY_INFINITE_NUMBER_P);
    {
      SubLObject raw_product = potentially_infinite_number_divided_by(int1, num2);
      if ((NIL != infinite_number_p(raw_product))) {
        return raw_product;
      } else {
        return Numbers.truncate(raw_product, UNPROVIDED);
      }
    }
  }

  /** @param ITEMS listp
   @param KEY fboundp; a unary function that will return a numberp when applied to any item in ITEMS
   Returns the maximal element of ITEMS */
  @SubL(source = "cycl/number-utilities.lisp", position = 29593) 
  public static final SubLObject maximum(SubLObject items, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(items.isCons()))) {
          Errors.error($str32$Cannot_compute_the_maximum_of_an_);
        }
      }
      if (((key == Symbols.symbol_function(IDENTITY))
          || (key == IDENTITY))) {
        {
          SubLObject maximum = items.first();
          SubLObject cdolist_list_var = items.rest();
          SubLObject item = NIL;
          for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
            if (item.numG(maximum)) {
              maximum = item;
            }
          }
          return maximum;
        }
      } else {
        return list_utilities.extremal(items, Symbols.symbol_function($sym33$_), key);
      }
    }
  }

  /** @param ITEMS listp; a list of numbers (numberp)
   @param KEY; a key to apply to items before sorting.
     If KEY is provided, and ITEMS are non-numeric, then ITEMS must be of odd length.
   @return numberp
   @owner yogman */
  @SubL(source = "cycl/number-utilities.lisp", position = 32302) 
  public static final SubLObject median(SubLObject items, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(items.isCons()))) {
          Errors.error($str38$Cannot_compute_the_median_of_an_a);
        }
      }
      {
        SubLObject sorted_items = ((NIL != key) ? ((SubLObject) Sort.sort(conses_high.copy_list(items), Symbols.symbol_function($sym35$_), key)) : Sort.sort(conses_high.copy_list(items), Symbols.symbol_function($sym35$_), UNPROVIDED));
        return median_sorted(sorted_items, UNPROVIDED);
      }
    }
  }

  /** This will simply access the middle of the list of items
   or average the two middle items in the case of an evenp length
   
   @param items listp; a list of numbers (numberp)
   @return numberp
   @owner yogman */
  @SubL(source = "cycl/number-utilities.lisp", position = 32801) 
  public static final SubLObject median_sorted(SubLObject items, SubLObject length) {
    if ((length == UNPROVIDED)) {
      length = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(items.isCons()))) {
          Errors.error($str38$Cannot_compute_the_median_of_an_a);
        }
      }
      if ((NIL == length)) {
        length = Sequences.length(items);
      }
      {
        SubLObject middle_position = Numbers.integerDivide(length, TWO_INTEGER);
        return ((NIL != Numbers.oddp(length)) ? ((SubLObject) ConsesLow.nth(middle_position, items)) : Numbers.divide(Numbers.add(ConsesLow.nth(middle_position, items), ConsesLow.nth(Numbers.subtract(middle_position, ONE_INTEGER), items)), TWO_INTEGER));
      }
    }
  }

  /** Given a list of integer MULTIPLES, from least to most significant value, return INTEGER 
correspondingly split into a list of multiples.  For example :
123 (10 10 10) => (3 2 1)
15 (2 2 2 2 2) => (1 1 1 1) */
  @SubL(source = "cycl/number-utilities.lisp", position = 42638) 
  public static final SubLObject decode_integer_multiples(SubLObject integer, SubLObject multiples) {
    checkType(integer, $sym9$INTEGERP);
    checkType(multiples, $sym59$LISTP);
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = multiples;
      SubLObject multiple = NIL;
      for (multiple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), multiple = cdolist_list_var.first()) {
        if (integer.numE(ZERO_INTEGER)) {
          if ((NIL == answer)) {
            answer = cons(integer, answer);
          }
          return Sequences.nreverse(answer);
        }
        {
          SubLObject value = Numbers.mod(integer, multiple);
          integer = Numbers.integerDivide(integer, multiple);
          answer = cons(value, answer);
        }
      }
      answer = cons(integer, answer);
      return Sequences.nreverse(answer);
    }
  }

  @SubL(source = "cycl/number-utilities.lisp", position = 45074) 
  private static SubLSymbol $valid_number_string_characters$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 47137) 
  private static SubLSymbol $valid_exponent_markers$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 47290) 
  private static SubLSymbol $valid_sign$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 47405) 
  private static SubLSymbol $largest_prime_by_binary_width$ = null;

  /** How many bits the high and the low part represent. */
  @SubL(source = "cycl/number-utilities.lisp", position = 51398) 
  private static SubLSymbol $checksum_implementation_width$ = null;

  /** Largest prime smaller then 2^implementation-width. */
  @SubL(source = "cycl/number-utilities.lisp", position = 51564) 
  private static SubLSymbol $checksum_base$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 51984) 
  public static SubLSymbol $checksum_initial_value_sum$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 52041) 
  public static SubLSymbol $checksum_initial_value_length$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 52099) 
  public static SubLSymbol $checksum_sum$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 52142) 
  public static SubLSymbol $checksum_length$ = null;

  @SubL(source = "cycl/number-utilities.lisp", position = 63942) 
  private static SubLSymbol $hex_to_dec_table$ = null;

  public static final SubLObject declare_number_utilities_file() {
    declareFunction(myName, "f_1X", "1+", 1, 0, false);
    declareFunction(myName, "f_1_", "1-", 1, 0, false);
    declareFunction(myName, "f_2X", "2*", 1, 0, false);
    declareFunction(myName, "onep", "ONEP", 1, 0, false);
    declareFunction(myName, "encode_boolean", "ENCODE-BOOLEAN", 1, 0, false);
    declareFunction(myName, "decode_boolean", "DECODE-BOOLEAN", 1, 0, false);
    declareFunction(myName, "get_bit", "GET-BIT", 2, 0, false);
    declareFunction(myName, "set_bit", "SET-BIT", 2, 1, false);
    declareFunction(myName, "clear_bit", "CLEAR-BIT", 2, 0, false);
    declareFunction(myName, "div", "DIV", 2, 0, false);
    declareFunction(myName, "square", "SQUARE", 1, 0, false);
    declareFunction(myName, "cube", "CUBE", 1, 0, false);
    declareFunction(myName, "cubert", "CUBERT", 1, 0, false);
    declareFunction(myName, "bytep", "BYTEP", 1, 0, false);
    declareFunction(myName, "nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0, false);
    declareFunction(myName, "list_of_integer_p", "LIST-OF-INTEGER-P", 1, 0, false);
    declareFunction(myName, "list_of_positive_integer_p", "LIST-OF-POSITIVE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "list_of_negative_integer_p", "LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "list_of_non_negative_integer_p", "LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "list_of_non_positive_integer_p", "LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "positive_number_p", "POSITIVE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "non_negative_number_p", "NON-NEGATIVE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "non_positive_number_p", "NON-POSITIVE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "negative_number_p", "NEGATIVE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "zero_number_p", "ZERO-NUMBER-P", 1, 0, false);
    declareFunction(myName, "non_zero_number_p", "NON-ZERO-NUMBER-P", 1, 0, false);
    declareFunction(myName, "probability_number_p", "PROBABILITY-NUMBER-P", 1, 0, false);
    declareFunction(myName, "percentile_p", "PERCENTILE-P", 1, 0, false);
    declareFunction(myName, "decimal_integer_length", "DECIMAL-INTEGER-LENGTH", 1, 0, false);
    declareFunction(myName, "significant_digits", "SIGNIFICANT-DIGITS", 2, 0, false);
    declareFunction(myName, "four_significant_digits", "FOUR-SIGNIFICANT-DIGITS", 1, 0, false);
    declareFunction(myName, "significant_digits_optimize_float", "SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false);
    declareFunction(myName, "float_n", "FLOAT-N", 1, 1, false);
    declareFunction(myName, "round_up_to_the_nearest", "ROUND-UP-TO-THE-NEAREST", 2, 0, false);
    declareFunction(myName, "round_to_the_nearest", "ROUND-TO-THE-NEAREST", 2, 0, false);
    declareFunction(myName, "round_down_to_the_nearest", "ROUND-DOWN-TO-THE-NEAREST", 2, 0, false);
    declareFunction(myName, "greater_absP", "GREATER-ABS?", 2, 0, false);
    declareFunction(myName, "divides_evenly", "DIVIDES-EVENLY", 2, 0, false);
    declareFunction(myName, "integer_percent", "INTEGER-PERCENT", 1, 2, false);
    declareFunction(myName, "percent", "PERCENT", 1, 2, false);
    declareFunction(myName, "percentage_p", "PERCENTAGE-P", 1, 0, false);
    declareFunction(myName, "percentage_to_probability", "PERCENTAGE-TO-PROBABILITY", 1, 0, false);
    declareFunction(myName, "percent_increase", "PERCENT-INCREASE", 2, 0, false);
    declareFunction(myName, "percent_decrease", "PERCENT-DECREASE", 2, 0, false);
    declareFunction(myName, "percent_faster", "PERCENT-FASTER", 2, 0, false);
    declareFunction(myName, "percent_slower", "PERCENT-SLOWER", 2, 0, false);
    declareFunction(myName, "log10", "LOG10", 1, 0, false);
    declareFunction(myName, "log2", "LOG2", 1, 0, false);
    declareFunction(myName, "expt10", "EXPT10", 1, 0, false);
    declareFunction(myName, "potentially_infinite_number_p", "POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "negative_infinity", "NEGATIVE-INFINITY", 0, 0, false);
    declareFunction(myName, "positive_infinity", "POSITIVE-INFINITY", 0, 0, false);
    declareFunction(myName, "negative_infinity_p", "NEGATIVE-INFINITY-P", 1, 0, false);
    declareFunction(myName, "positive_infinity_p", "POSITIVE-INFINITY-P", 1, 0, false);
    declareFunction(myName, "infinite_number_p", "INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "negative_potentially_infinite_number_p", "NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "positive_potentially_infinite_number_p", "POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "non_negative_potentially_infinite_number_p", "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "potentially_infinite_number_E", "POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_L", "POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_G", "POTENTIALLY-INFINITE-NUMBER->", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_LE", "POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_GE", "POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_plus", "POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_minus", "POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_times", "POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_divided_by", "POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_max", "POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_min", "POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false);
    declareFunction(myName, "potentially_infinite_number_log", "POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false);
    declareFunction(myName, "potentially_infinite_number_exp", "POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false);
    declareFunction(myName, "negative_infinity_plus", "NEGATIVE-INFINITY-PLUS", 1, 0, false);
    declareFunction(myName, "positive_infinity_plus", "POSITIVE-INFINITY-PLUS", 1, 0, false);
    declareFunction(myName, "negative_infinity_minus", "NEGATIVE-INFINITY-MINUS", 1, 0, false);
    declareFunction(myName, "positive_infinity_minus", "POSITIVE-INFINITY-MINUS", 1, 0, false);
    declareFunction(myName, "negative_infinity_times", "NEGATIVE-INFINITY-TIMES", 1, 0, false);
    declareFunction(myName, "positive_infinity_times", "POSITIVE-INFINITY-TIMES", 1, 0, false);
    declareFunction(myName, "negative_infinity_X", "NEGATIVE-INFINITY-/", 1, 0, false);
    declareFunction(myName, "positive_infinity_X", "POSITIVE-INFINITY-/", 1, 0, false);
    declareFunction(myName, "divided_by_negative_infinity", "DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false);
    declareFunction(myName, "divided_by_positive_infinity", "DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false);
    declareFunction(myName, "extended_potentially_infinite_number_p", "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "potentially_infinite_integer_p", "POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "infinite_integer_p", "INFINITE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "negative_potentially_infinite_integer_p", "NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "positive_potentially_infinite_integer_p", "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "potentially_infinite_integer_E", "POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_L", "POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_G", "POTENTIALLY-INFINITE-INTEGER->", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_LE", "POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_GE", "POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_plus", "POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_minus", "POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_times", "POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_times_number_rounded", "POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_divided_by", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false);
    declareFunction(myName, "potentially_infinite_integer_divided_by_number_rounded", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_p", "POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false);
    declareFunction(myName, "undefined", "UNDEFINED", 1, 0, false);
    declareFunction(myName, "potentially_undefined_number_E", "POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_L", "POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_G", "POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_LE", "POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_GE", "POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_plus", "POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_minus", "POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_times", "POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false);
    declareFunction(myName, "potentially_undefined_number_divided_by", "POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false);
    declareFunction(myName, "maximum", "MAXIMUM", 1, 1, false);
    declareFunction(myName, "minimum", "MINIMUM", 1, 1, false);
    declareFunction(myName, "average", "AVERAGE", 1, 1, false);
    declareFunction(myName, "mean", "MEAN", 1, 0, false);
    declareFunction(myName, "summation", "SUMMATION", 1, 0, false);
    declareFunction(myName, "geometric_mean", "GEOMETRIC-MEAN", 1, 0, false);
    declareFunction(myName, "median", "MEDIAN", 1, 1, false);
    declareFunction(myName, "median_sorted", "MEDIAN-SORTED", 1, 1, false);
    declareFunction(myName, "percentile", "PERCENTILE", 2, 1, false);
    declareFunction(myName, "percentile_sorted", "PERCENTILE-SORTED", 2, 0, false);
    declareFunction(myName, "max_key_from_hash", "MAX-KEY-FROM-HASH", 1, 0, false);
    declareFunction(myName, "get_frequency_list", "GET-FREQUENCY-LIST", 1, 0, false);
    declareFunction(myName, "get_sorted_frequency_list", "GET-SORTED-FREQUENCY-LIST", 1, 0, false);
    declareFunction(myName, "mode", "MODE", 1, 0, false);
    declareFunction(myName, "mode_sorted", "MODE-SORTED", 1, 0, false);
    declareFunction(myName, "variance_from_sample", "VARIANCE-FROM-SAMPLE", 1, 0, false);
    declareFunction(myName, "variance_from_population", "VARIANCE-FROM-POPULATION", 1, 0, false);
    declareFunction(myName, "variance", "VARIANCE", 1, 0, false);
    declareFunction(myName, "standard_deviation_from_population", "STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false);
    declareFunction(myName, "standard_deviation_from_sample", "STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
    declareFunction(myName, "standard_deviation", "STANDARD-DEVIATION", 1, 0, false);
    declareFunction(myName, "standard_deviations_above_mean", "STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false);
    declareFunction(myName, "perform_standard_statistical_analysis", "PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false);
    declareFunction(myName, "correlation", "CORRELATION", 2, 0, false);
    declareFunction(myName, "decode_integer_multiples", "DECODE-INTEGER-MULTIPLES", 2, 0, false);
    declareFunction(myName, "encode_integer_multiples", "ENCODE-INTEGER-MULTIPLES", 2, 0, false);
    declareFunction(myName, "number_string_p", "NUMBER-STRING-P", 1, 0, false);
    declareFunction(myName, "number_string_value", "NUMBER-STRING-VALUE", 1, 0, false);
    declareFunction(myName, "valid_number_string_char", "VALID-NUMBER-STRING-CHAR", 1, 0, false);
    declareFunction(myName, "extended_number_string_p", "EXTENDED-NUMBER-STRING-P", 1, 0, false);
    declareFunction(myName, "valid_exponent_marker", "VALID-EXPONENT-MARKER", 1, 0, false);
    declareFunction(myName, "valid_sign", "VALID-SIGN", 1, 0, false);
    declareFunction(myName, "find_smallest_prime_for_binary_width", "FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false);
    declareFunction(myName, "checksum_sanity_check", "CHECKSUM-SANITY-CHECK", 0, 0, false);
    declareFunction(myName, "checksum_update", "CHECKSUM-UPDATE", 1, 0, false);
    declareFunction(myName, "checksum_finalize", "CHECKSUM-FINALIZE", 0, 0, false);
    declareMacro(myName, "checksum_setup", "CHECKSUM-SETUP");
    declareMacro(myName, "checksum_start", "CHECKSUM-START");
    declareMacro(myName, "checksum_resume", "CHECKSUM-RESUME");
    declareMacro(myName, "with_checksum", "WITH-CHECKSUM");
    declareFunction(myName, "expt_mod", "EXPT-MOD", 3, 0, false);
    declareFunction(myName, "binary_expt_mod", "BINARY-EXPT-MOD", 3, 0, false);
    declareFunction(myName, "convert_to_binary", "CONVERT-TO-BINARY", 1, 0, false);
    declareFunction(myName, "convert_to_hexadecimal", "CONVERT-TO-HEXADECIMAL", 1, 0, false);
    declareFunction(myName, "modular_subtraction", "MODULAR-SUBTRACTION", 3, 0, false);
    declareFunction(myName, "modular_addition", "MODULAR-ADDITION", 3, 0, false);
    declareFunction(myName, "modularE", "MODULAR=", 3, 0, false);
    declareFunction(myName, "number_of_digits", "NUMBER-OF-DIGITS", 1, 0, false);
    declareFunction(myName, "multiple_ofP", "MULTIPLE-OF?", 2, 0, false);
    declareFunction(myName, "multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0, false);
    declareFunction(myName, "prime_numberP", "PRIME-NUMBER?", 1, 0, false);
    declareFunction(myName, "prime_factorization", "PRIME-FACTORIZATION", 1, 0, false);
    declareFunction(myName, "find_smallest_divisor", "FIND-SMALLEST-DIVISOR", 1, 0, false);
    declareFunction(myName, "lcm", "LCM", 1, 0, false);
    declareFunction(myName, "lcm2", "LCM2", 2, 0, false);
    declareFunction(myName, "lcm2_internal", "LCM2-INTERNAL", 2, 0, false);
    declareFunction(myName, "gcd", "GCD", 1, 0, false);
    declareFunction(myName, "gcd2", "GCD2", 2, 0, false);
    declareFunction(myName, "gcd2_internal", "GCD2-INTERNAL", 2, 0, false);
    declareFunction(myName, "gcd2_sorted_internal", "GCD2-SORTED-INTERNAL", 2, 0, false);
    declareFunction(myName, "convert_hexadecimal_to_decimal", "CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false);
    declareFunction(myName, "decimal_code_for_hex_digit", "DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false);
    declareMacro(myName, "with_probability", "WITH-PROBABILITY");
    declareFunction(myName, "probability_p", "PROBABILITY-P", 1, 0, false);
    declareFunction(myName, "true_with_probability", "TRUE-WITH-PROBABILITY", 1, 0, false);
    declareFunction(myName, "true_with_probability_int", "TRUE-WITH-PROBABILITY-INT", 2, 0, false);
    declareFunction(myName, "coin_flip", "COIN-FLIP", 0, 0, false);
    declareFunction(myName, "probability_distribution_p", "PROBABILITY-DISTRIBUTION-P", 1, 0, false);
    declareFunction(myName, "probability_distribution_sample", "PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false);
    declareFunction(myName, "fibonacci", "FIBONACCI", 1, 0, false);
    declareFunction(myName, "fibonacci_memoized_internal", "FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false);
    declareFunction(myName, "fibonacci_memoized", "FIBONACCI-MEMOIZED", 1, 0, false);
    declareFunction(myName, "random_0_1", "RANDOM-0-1", 0, 0, false);
    declareFunction(myName, "random_probability", "RANDOM-PROBABILITY", 0, 0, false);
    declareFunction(myName, "n_random_integers", "N-RANDOM-INTEGERS", 2, 1, false);
    declareFunction(myName, "non_negative_integers_less_than", "NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false);
    declareFunction(myName, "compute_deltas", "COMPUTE-DELTAS", 1, 1, false);
    declareFunction(myName, "factorial", "FACTORIAL", 1, 0, false);
    declareFunction(myName, "choose", "CHOOSE", 2, 0, false);
    declareFunction(myName, "strictly_between_0_and_1_p", "STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false);
    declareFunction(myName, "strictly_between_0_and_minus_1_p", "STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false);
    declareFunction(myName, "tolerance_E", "TOLERANCE-=", 2, 1, false);
    declareFunction(myName, "zero", "ZERO", 0, 1, false);
    declareFunction(myName, "one", "ONE", 0, 1, false);
    declareFunction(myName, "pairwise_slope", "PAIRWISE-SLOPE", 1, 0, false);
    declareFunction(myName, "values_to_coordinates", "VALUES-TO-COORDINATES", 1, 0, false);
    declareFunction(myName, "coordinates_to_values", "COORDINATES-TO-VALUES", 1, 0, false);
    declareFunction(myName, "pairwise_slope_points", "PAIRWISE-SLOPE-POINTS", 1, 0, false);
    declareFunction(myName, "average_neighbors", "AVERAGE-NEIGHBORS", 1, 1, false);
    declareFunction(myName, "renumber_id_using_table", "RENUMBER-ID-USING-TABLE", 2, 0, false);
    declareFunction(myName, "test_renumber_id_using_table", "TEST-RENUMBER-ID-USING-TABLE", 2, 0, false);
    declareFunction(myName, "transform_delete_list_to_gap_list", "TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false);
    declareFunction(myName, "transform_gap_list_to_delta_list", "TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false);
    declareFunction(myName, "renumber_id_using_delta_table", "RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
    declareFunction(myName, "test_renumber_id_using_delta_table", "TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
    declareFunction(myName, "test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_number_utilities_file() {
    $large_immediate_positive_integer$ = deflexical("*LARGE-IMMEDIATE-POSITIVE-INTEGER*", Numbers.expt(TWO_INTEGER, $int0$26));
    $e$ = defconstant("*E*", Numbers.$exp1$.getGlobalValue());
    $maximum_float_significant_digits$ = deflexical("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*", SIXTEEN_INTEGER);
    $valid_number_string_characters$ = deflexical("*VALID-NUMBER-STRING-CHARACTERS*", $str65$0123456789___deDE);
    $valid_exponent_markers$ = deflexical("*VALID-EXPONENT-MARKERS*", $str67$deDE);
    $valid_sign$ = deflexical("*VALID-SIGN*", $str68$__);
    $largest_prime_by_binary_width$ = defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*", $list69);
    $checksum_implementation_width$ = defconstant("*CHECKSUM-IMPLEMENTATION-WIDTH*", Numbers.truncate(Numbers.log(Numbers.abs(Numbers.$most_negative_fixnum$.getGlobalValue()), TWO_INTEGER), UNPROVIDED));
    $checksum_base$ = defconstant("*CHECKSUM-BASE*", conses_high.assoc($checksum_implementation_width$.getGlobalValue(), $largest_prime_by_binary_width$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest());
    $checksum_initial_value_sum$ = defconstant("*CHECKSUM-INITIAL-VALUE-SUM*", ONE_INTEGER);
    $checksum_initial_value_length$ = defconstant("*CHECKSUM-INITIAL-VALUE-LENGTH*", ZERO_INTEGER);
    $checksum_sum$ = defparameter("*CHECKSUM-SUM*", ONE_INTEGER);
    $checksum_length$ = defparameter("*CHECKSUM-LENGTH*", ZERO_INTEGER);
    $hex_to_dec_table$ = defparameter("*HEX-TO-DEC-TABLE*", $list97);
    return NIL;
  }

  public static final SubLObject setup_number_utilities_file() {
    // CVS_ID("Id: number-utilities.lisp 128638 2009-08-26 17:25:03Z rck ");
    utilities_macros.register_cyc_api_function($sym3$NIL_OR_INTEGER_P, $list4, $str5$Return_T_iff_OBJECT_is_either_an_, NIL, $list6);
    generic_testing.define_test_case_table_int($sym70$CHECKSUM_SANITY_CHECK, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list77);
    access_macros.register_macro_helper($sym78$CHECKSUM_SETUP, $list79);
    memoization_state.note_memoized_function($sym111$FIBONACCI_MEMOIZED);
    generic_testing.define_test_case_table_int($sym120$AVERAGE_NEIGHBORS, list(new SubLObject[] {$kw71$TEST, EQUALP, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list121);
    generic_testing.define_test_case_table_int($sym123$TEST_RENUMBER_ID_USING_TABLE, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list124);
    generic_testing.define_test_case_table_int($sym127$TRANSFORM_DELETE_LIST_TO_GAP_LIST, list(new SubLObject[] {$kw71$TEST, Symbols.symbol_function(EQUAL), $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list128);
    generic_testing.define_test_case_table_int($sym131$TRANSFORM_GAP_LIST_TO_DELTA_LIST, list(new SubLObject[] {$kw71$TEST, Symbols.symbol_function(EQUAL), $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list132);
    generic_testing.define_test_case_table_int($sym133$TEST_RENUMBER_ID_USING_DELTA_TABLE, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list124);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$26 = makeInteger(26);
  public static final SubLSymbol $sym1$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLInteger $int2$256 = makeInteger(256);
  public static final SubLSymbol $sym3$NIL_OR_INTEGER_P = makeSymbol("NIL-OR-INTEGER-P");
  public static final SubLList $list4 = list(makeSymbol("OBJECT"));
  public static final SubLString $str5$Return_T_iff_OBJECT_is_either_an_ = makeString("Return T iff OBJECT is either an integer or NIL");
  public static final SubLList $list6 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $kw7$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym8$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym9$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym10$EXTENDED_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("EXTENDED-POTENTIALLY-INFINITE-NUMBER-P");
  public static final SubLSymbol $sym11$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLInteger $int12$_2 = makeInteger(-2);
  public static final SubLInteger $int13$100 = makeInteger(100);
  public static final SubLString $str14$NEW_must_be_larger_than_OLD = makeString("NEW must be larger than OLD");
  public static final SubLString $str15$NEW_must_be_smaller_than_OLD = makeString("NEW must be smaller than OLD");
  public static final SubLSymbol $kw16$NEGATIVE_INFINITY = makeKeyword("NEGATIVE-INFINITY");
  public static final SubLSymbol $kw17$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $sym18$POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("POTENTIALLY-INFINITE-NUMBER-P");
  public static final SubLString $str19$Can_t_divide_zero_by_zero = makeString("Can't divide zero by zero");
  public static final SubLSymbol $sym20$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P");
  public static final SubLString $str21$Can_t_add_positive_infinity_and_n = makeString("Can't add positive infinity and negative infinity");
  public static final SubLString $str22$Can_t_subtract_negative_infinity_ = makeString("Can't subtract negative infinity from itself");
  public static final SubLString $str23$Can_t_subtract_positive_infinity_ = makeString("Can't subtract positive infinity from itself");
  public static final SubLString $str24$Can_t_multiply_infinity_and_zero = makeString("Can't multiply infinity and zero");
  public static final SubLString $str25$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by itself");
  public static final SubLString $str26$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by positive infinity");
  public static final SubLString $str27$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by negative infinity");
  public static final SubLString $str28$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by itself");
  public static final SubLSymbol $sym29$POTENTIALLY_INFINITE_INTEGER_P = makeSymbol("POTENTIALLY-INFINITE-INTEGER-P");
  public static final SubLSymbol $kw30$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLSymbol $sym31$POTENTIALLY_UNDEFINED_NUMBER_P = makeSymbol("POTENTIALLY-UNDEFINED-NUMBER-P");
  public static final SubLString $str32$Cannot_compute_the_maximum_of_an_ = makeString("Cannot compute the maximum of an atom or empty list");
  public static final SubLSymbol $sym33$_ = makeSymbol(">");
  public static final SubLString $str34$Cannot_compute_the_minimum_of_an_ = makeString("Cannot compute the minimum of an atom or empty list");
  public static final SubLSymbol $sym35$_ = makeSymbol("<");
  public static final SubLString $str36$Cannot_compute_the_mean_of_an_ato = makeString("Cannot compute the mean of an atom or empty list");
  public static final SubLString $str37$Cannot_compute_the_geometric_mean = makeString("Cannot compute the geometric mean of an atom or empty list");
  public static final SubLString $str38$Cannot_compute_the_median_of_an_a = makeString("Cannot compute the median of an atom or empty list");
  public static final SubLSymbol $sym39$PERCENTILE_P = makeSymbol("PERCENTILE-P");
  public static final SubLString $str40$Cannot_compute_the_percentile_of_ = makeString("Cannot compute the percentile of an atom or empty list");
  public static final SubLString $str41$Cannot_compute_frequencies_of_an_ = makeString("Cannot compute frequencies of an atom or empty list");
  public static final SubLSymbol $sym42$CDR = makeSymbol("CDR");
  public static final SubLString $str43$Cannot_compute_the_mode_of_an_ato = makeString("Cannot compute the mode of an atom or empty list");
  public static final SubLString $str44$Cannot_compute_the_variance_of_an = makeString("Cannot compute the variance of an atom or empty list");
  public static final SubLString $str45$Cannot_make_reasonable_estimate_o = makeString("Cannot make reasonable estimate of variance from only one element");
  public static final SubLString $str46$Cannot_compute_the_standard_devia = makeString("Cannot compute the standard deviation of an atom or empty list");
  public static final SubLString $str47$Standard_deviation_must_not_be_ze = makeString("Standard deviation must not be zero.");
  public static final SubLSymbol $sym48$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str49$__Standard_Statistical_Analysis = makeString("~%Standard Statistical Analysis");
  public static final SubLString $str50$_______________________________ = makeString("~%=============================");
  public static final SubLString $str51$__N____S = makeString("~%N : ~S");
  public static final SubLString $str52$__Min____S = makeString("~%Min : ~S");
  public static final SubLString $str53$__Max____S = makeString("~%Max : ~S");
  public static final SubLString $str54$__Median____S = makeString("~%Median : ~S");
  public static final SubLString $str55$__Mean____S = makeString("~%Mean : ~S");
  public static final SubLString $str56$__Standard_Deviation____S = makeString("~%Standard Deviation : ~S");
  public static final SubLString $str57$X_Values_and_Y_Values_must_be_of_ = makeString("X-Values and Y-Values must be of the same length ~A.");
  public static final SubLFloat $float58$1_0 = makeDouble(1.0);
  public static final SubLSymbol $sym59$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym60$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str61$This_integer_is_too_large_to_be_c = makeString("This integer is too large to be converted to a double-float");
  public static final SubLString $str62$_A = makeString("~A");
  public static final SubLSymbol $sym63$DIGIT_CHAR_P = makeSymbol("DIGIT-CHAR-P");
  public static final SubLSymbol $sym64$VALID_NUMBER_STRING_CHAR = makeSymbol("VALID-NUMBER-STRING-CHAR");
  public static final SubLString $str65$0123456789___deDE = makeString("0123456789.-+deDE");
  public static final SubLSymbol $sym66$VALID_EXPONENT_MARKER = makeSymbol("VALID-EXPONENT-MARKER");
  public static final SubLString $str67$deDE = makeString("deDE");
  public static final SubLString $str68$__ = makeString("+-");
  public static final SubLList $list69 = list(new SubLObject[] {cons(TWO_INTEGER, THREE_INTEGER), cons(THREE_INTEGER, SEVEN_INTEGER), cons(FOUR_INTEGER, THIRTEEN_INTEGER), cons(FIVE_INTEGER, makeInteger(31)), cons(SIX_INTEGER, makeInteger(61)), cons(SEVEN_INTEGER, makeInteger(127)), cons(EIGHT_INTEGER, makeInteger(251)), cons(NINE_INTEGER, makeInteger(509)), cons(TEN_INTEGER, makeInteger(1021)), cons(ELEVEN_INTEGER, makeInteger(2039)), cons(TWELVE_INTEGER, makeInteger(4093)), cons(THIRTEEN_INTEGER, makeInteger(8191)), cons(FOURTEEN_INTEGER, makeInteger(16381)), cons(FIFTEEN_INTEGER, makeInteger(32749)), cons(SIXTEEN_INTEGER, makeInteger(65521)), cons(SEVENTEEN_INTEGER, makeInteger(131071)), cons(EIGHTEEN_INTEGER, makeInteger(262139)), cons(NINETEEN_INTEGER, makeInteger(524287)), cons(TWENTY_INTEGER, makeInteger(1048573)), cons(makeInteger(21), makeInteger(2097143)), cons(makeInteger(22), makeInteger(4194301)), cons(makeInteger(23), makeInteger(8388593)), cons(makeInteger(24), makeInteger(16777213)), cons(makeInteger(25), makeInteger(33554393)), cons(makeInteger(26), makeInteger(67108859)), cons(makeInteger(27), makeInteger(134217689)), cons(makeInteger(28), makeInteger(268435399)), cons(makeInteger(29), makeInteger("536870909")), cons(makeInteger(30), makeInteger("1073741789")), cons(makeInteger(31), makeInteger("2147483647")), cons(makeInteger(32), makeInteger("4294967291")), cons(makeInteger(33), makeInteger("8589934583")), cons(makeInteger(34), makeInteger("17179869143")), cons(makeInteger(35), makeInteger("34359738337")), cons(makeInteger(36), makeInteger("68719476731")), cons(makeInteger(37), makeInteger("137438953447")), cons(makeInteger(38), makeInteger("274877906899")), cons(makeInteger(39), makeInteger("549755813881")), cons(makeInteger(40), makeInteger("1099511627689")), cons(makeInteger(41), makeInteger("2199023255531")), cons(makeInteger(42), makeInteger("4398046511093")), cons(makeInteger(43), makeInteger("8796093022151")), cons(makeInteger(44), makeInteger("17592186044399")), cons(makeInteger(45), makeInteger("35184372088777")), cons(makeInteger(46), makeInteger("70368744177643")), cons(makeInteger(47), makeInteger("140737488355213")), cons(makeInteger(48), makeInteger("281474976710597")), cons(makeInteger(49), makeInteger("562949953421231")), cons(makeInteger(50), makeInteger("1125899906842597")), cons(makeInteger(51), makeInteger("2251799813685119")), cons(makeInteger(52), makeInteger("4503599627370449")), cons(makeInteger(53), makeInteger("9007199254740881")), cons(makeInteger(54), makeInteger("18014398509481951")), cons(makeInteger(55), makeInteger("36028797018963913")), cons(makeInteger(56), makeInteger("72057594037927931")), cons(makeInteger(57), makeInteger("144115188075855859")), cons(makeInteger(58), makeInteger("288230376151711717")), cons(makeInteger(59), makeInteger("576460752303423433")), cons(makeInteger(60), makeInteger("1152921504606846883")), cons(makeInteger(61), makeInteger("2305843009213693951")), cons(makeInteger(62), makeInteger("4611686018427387847")), cons(makeInteger(63), makeInteger("9223372036854775783")), cons(makeInteger(64), makeInteger("18446744073709551557"))});
  public static final SubLSymbol $sym70$CHECKSUM_SANITY_CHECK = makeSymbol("CHECKSUM-SANITY-CHECK");
  public static final SubLSymbol $kw71$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw72$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw73$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw74$KB = makeKeyword("KB");
  public static final SubLSymbol $kw75$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw76$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list77 = list(list(NIL, T));
  public static final SubLSymbol $sym78$CHECKSUM_SETUP = makeSymbol("CHECKSUM-SETUP");
  public static final SubLList $list79 = list(makeSymbol("CHECKSUM-START"), makeSymbol("CHECKSUM-RESUME"), makeSymbol("WITH-CHECKSUM"));
  public static final SubLList $list80 = list(list(makeSymbol("SUM-INIT"), makeSymbol("LENGTH-INIT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym81$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym82$_CHECKSUM_SUM_ = makeSymbol("*CHECKSUM-SUM*");
  public static final SubLSymbol $sym83$_CHECKSUM_LENGTH_ = makeSymbol("*CHECKSUM-LENGTH*");
  public static final SubLList $list84 = list(makeSymbol("*CHECKSUM-INITIAL-VALUE-SUM*"), makeSymbol("*CHECKSUM-INITIAL-VALUE-LENGTH*"));
  public static final SubLList $list85 = list(list(makeSymbol("ACCUMULATORS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym86$CAR = makeSymbol("CAR");
  public static final SubLList $list87 = list(list(makeSymbol("CHECKSUM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym88$CHECKSUM_START = makeSymbol("CHECKSUM-START");
  public static final SubLSymbol $sym89$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list90 = list(list(makeSymbol("CHECKSUM-FINALIZE")));
  public static final SubLSymbol $kw91$BASE = makeKeyword("BASE");
  public static final SubLString $str92$_X = makeString("~X");
  public static final SubLSymbol $sym93$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym94$ABS = makeSymbol("ABS");
  public static final SubLSymbol $sym95$LCM2_INTERNAL = makeSymbol("LCM2-INTERNAL");
  public static final SubLSymbol $sym96$GCD2_INTERNAL = makeSymbol("GCD2-INTERNAL");
  public static final SubLList $list97 = list(new SubLObject[] {list(Characters.CHAR_a, TEN_INTEGER), list(Characters.CHAR_A, TEN_INTEGER), list(Characters.CHAR_b, ELEVEN_INTEGER), list(Characters.CHAR_B, ELEVEN_INTEGER), list(Characters.CHAR_c, TWELVE_INTEGER), list(Characters.CHAR_C, TWELVE_INTEGER), list(Characters.CHAR_d, THIRTEEN_INTEGER), list(Characters.CHAR_D, THIRTEEN_INTEGER), list(Characters.CHAR_e, FOURTEEN_INTEGER), list(Characters.CHAR_E, FOURTEEN_INTEGER), list(Characters.CHAR_f, FIFTEEN_INTEGER), list(Characters.CHAR_F, FIFTEEN_INTEGER)});
  public static final SubLList $list98 = list(makeSymbol("PROBABILITY"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym99$PROB = makeUninternedSymbol("PROB");
  public static final SubLSymbol $sym100$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list101 = list(makeSymbol("PROBABILITY-P"));
  public static final SubLSymbol $sym102$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym103$TRUE_WITH_PROBABILITY = makeSymbol("TRUE-WITH-PROBABILITY");
  public static final SubLSymbol $sym104$PROBABILITY_P = makeSymbol("PROBABILITY-P");
  public static final SubLInteger $int105$1000 = makeInteger(1000);
  public static final SubLFloat $float106$1_0e_5 = makeDouble(1.0e-5);
  public static final SubLSymbol $sym107$PROBABILITY_DISTRIBUTION_P = makeSymbol("PROBABILITY-DISTRIBUTION-P");
  public static final SubLString $str108$Error_sampling_from__s____s__s_ = makeString("Error sampling from ~s: (~s ~s)");
  public static final SubLSymbol $sym109$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str110$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym111$FIBONACCI_MEMOIZED = makeSymbol("FIBONACCI-MEMOIZED");
  public static final SubLSymbol $kw112$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym113$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLList $list114 = cons(makeSymbol("FIRST"), makeSymbol("REST"));
  public static final SubLString $str115$_s_must_be_____s = makeString("~s must be <= ~s");
  public static final SubLList $list116 = list(makeSymbol("PREV-X"), makeSymbol("PREV-Y"));
  public static final SubLList $list117 = list(makeSymbol("CURR-X"), makeSymbol("CURR-Y"));
  public static final SubLSymbol $sym118$SECOND = makeSymbol("SECOND");
  public static final SubLInteger $int119$25 = makeInteger(25);
  public static final SubLSymbol $sym120$AVERAGE_NEIGHBORS = makeSymbol("AVERAGE-NEIGHBORS");
  public static final SubLList $list121 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), THREE_INTEGER), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER)), list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER}), FIVE_INTEGER), list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER})));
  public static final SubLSymbol $kw122$DELETED = makeKeyword("DELETED");
  public static final SubLSymbol $sym123$TEST_RENUMBER_ID_USING_TABLE = makeSymbol("TEST-RENUMBER-ID-USING-TABLE");
  public static final SubLObject $list124 = _constant_124_initializer();
  public static final SubLString $str125$Original_id__A_was_supposed_to_ma = makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");
  public static final SubLSymbol $kw126$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym127$TRANSFORM_DELETE_LIST_TO_GAP_LIST = makeSymbol("TRANSFORM-DELETE-LIST-TO-GAP-LIST");
  public static final SubLList $list128 = list(list(list(list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER)), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER)), list(list(list(new SubLObject[] {TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER})), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(list(list(new SubLObject[] {ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485)})), list(new SubLObject[] {ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485)})));
  public static final SubLList $list129 = cons(makeSymbol("START"), makeSymbol("WIDTH"));
  public static final SubLString $str130$Invalid_gap_list_format__Unclear_ = makeString("Invalid gap list format: Unclear what to do with element ~A.");
  public static final SubLSymbol $sym131$TRANSFORM_GAP_LIST_TO_DELTA_LIST = makeSymbol("TRANSFORM-GAP-LIST-TO-DELTA-LIST");
  public static final SubLList $list132 = list(list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER))), list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER), cons(FOURTEEN_INTEGER, TEN_INTEGER))), list(list(list(new SubLObject[] {ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485)})), list(new SubLObject[] {cons(ZERO_INTEGER, ONE_INTEGER), cons(TWO_INTEGER, THREE_INTEGER), cons(ELEVEN_INTEGER, FOUR_INTEGER), cons(THIRTEEN_INTEGER, EIGHT_INTEGER), cons(makeInteger(27), NINE_INTEGER), cons(makeInteger(57), TEN_INTEGER), cons(makeInteger(59), ELEVEN_INTEGER), cons(makeInteger(64), TWELVE_INTEGER), cons(makeInteger(250), THIRTEEN_INTEGER), cons(makeInteger(361), FOURTEEN_INTEGER), cons(makeInteger(365), NINETEEN_INTEGER), cons(makeInteger(374), makeInteger(21)), cons(makeInteger(378), makeInteger(22)), cons(makeInteger(429), makeInteger(24)), cons(makeInteger(436), makeInteger(25)), cons(makeInteger(442), makeInteger(26)), cons(makeInteger(473), makeInteger(27)), cons(makeInteger(510), makeInteger(28)), cons(makeInteger(538), makeInteger(30)), cons(makeInteger(555), makeInteger(31)), cons(makeInteger(614), makeInteger(32)), cons(makeInteger(623), makeInteger(34)), cons(makeInteger(643), makeInteger(35)), cons(makeInteger(1041), makeInteger(36)), cons(makeInteger(1062), makeInteger(37)), cons(makeInteger(1064), makeInteger(38)), cons(makeInteger(1092), makeInteger(39)), cons(makeInteger(1096), makeInteger(40)), cons(makeInteger(1098), makeInteger(41)), cons(makeInteger(1102), makeInteger(42)), cons(makeInteger(1146), makeInteger(44)), cons(makeInteger(1150), makeInteger(45)), cons(makeInteger(1251), makeInteger(47)), cons(makeInteger(1471), makeInteger(48)), cons(makeInteger(1475), makeInteger(49)), cons(makeInteger(1485), makeInteger(50))})));
  public static final SubLSymbol $sym133$TEST_RENUMBER_ID_USING_DELTA_TABLE = makeSymbol("TEST-RENUMBER-ID-USING-DELTA-TABLE");
  public static final SubLString $str134$ID__A_should_have_been_deleted_bu = makeString("ID ~A should have been deleted but was renumbered to ~A.");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_124_initializer() {
    return list(list(list(list(ONE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, TEN_INTEGER), TWELVE_INTEGER), makeKeyword("SUCCESS")), list(list(list(new SubLObject[] {ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485)}), makeInteger(1460)), makeKeyword("SUCCESS")), list(list(list(new SubLObject[] {ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(39), makeInteger(40), makeInteger(41), makeInteger(42), makeInteger(43), makeInteger(44), makeInteger(45), makeInteger(46), makeInteger(47), makeInteger(48), makeInteger(49), makeInteger(50), makeInteger(51), makeInteger(52), makeInteger(53), makeInteger(54), makeInteger(55), makeInteger(56), makeInteger(57), makeInteger(58), makeInteger(59), makeInteger(60), makeInteger(61), makeInteger(62), makeInteger(63), makeInteger(64), makeInteger(65), makeInteger(66), makeInteger(67), makeInteger(68), makeInteger(69), makeInteger(70), makeInteger(71), makeInteger(72), makeInteger(73), makeInteger(80), makeInteger(82), makeInteger(83), makeInteger(301), makeInteger(302), makeInteger(309), makeInteger(316), makeInteger(317), makeInteger(351), makeInteger(352), makeInteger(353), makeInteger(884), makeInteger(885), makeInteger(886), makeInteger(887), makeInteger(888), makeInteger(889), makeInteger(890), makeInteger(891), makeInteger(892), makeInteger(893), makeInteger(894), makeInteger(895), makeInteger(896), makeInteger(897), makeInteger(898), makeInteger(899), makeInteger(900), makeInteger(901), makeInteger(902), makeInteger(903), makeInteger(904), makeInteger(905), makeInteger(906), makeInteger(907), makeInteger(908), makeInteger(909), makeInteger(910), makeInteger(911), makeInteger(912), makeInteger(913), makeInteger(914), makeInteger(915), makeInteger(916), makeInteger(917), makeInteger(918), makeInteger(919), makeInteger(920), makeInteger(921), makeInteger(922), makeInteger(923), makeInteger(924), makeInteger(925), makeInteger(926), makeInteger(927), makeInteger(928), makeInteger(929), makeInteger(930), makeInteger(931), makeInteger(932), makeInteger(933), makeInteger(934), makeInteger(935), makeInteger(936), makeInteger(937), makeInteger(938), makeInteger(939), makeInteger(940), makeInteger(941), makeInteger(942), makeInteger(943), makeInteger(944), makeInteger(945), makeInteger(946), makeInteger(947), makeInteger(948), makeInteger(949), makeInteger(950), makeInteger(951), makeInteger(952), makeInteger(953), makeInteger(954), makeInteger(955), makeInteger(956), makeInteger(957), makeInteger(958), makeInteger(959), makeInteger(960), makeInteger(961), makeInteger(962), makeInteger(963), makeInteger(964), makeInteger(965), makeInteger(966), makeInteger(967), makeInteger(968), makeInteger(969), makeInteger(970), makeInteger(971), makeInteger(972), makeInteger(973), makeInteger(974), makeInteger(984), makeInteger(985), makeInteger(986), makeInteger(1324), makeInteger(1325), makeInteger(1326), makeInteger(1327), makeInteger(1619), makeInteger(1629), makeInteger(1630), makeInteger(1631), makeInteger(1632), makeInteger(1641), makeInteger(1642), makeInteger(1643), makeInteger(1645), makeInteger(1646), makeInteger(1647), makeInteger(1649), makeInteger(1650), makeInteger(1651), makeInteger(1653), makeInteger(1655), makeInteger(1656), makeInteger(1657), makeInteger(1658), makeInteger(1723), makeInteger(1729), makeInteger(1733), makeInteger(1740), makeInteger(1741), makeInteger(1742), makeInteger(1743), makeInteger(1745), makeInteger(1756), makeInteger(1757), makeInteger(1758), makeInteger(1759), makeInteger(1760), makeInteger(1810), makeInteger(1834), makeInteger(1835), makeInteger(1868), makeInteger(2084), makeInteger(2145), makeInteger(2146), makeInteger(2170), makeInteger(2185), makeInteger(2186), makeInteger(2187), makeInteger(2194), makeInteger(2198), makeInteger(2201), makeInteger(2202), makeInteger(2203), makeInteger(2204), makeInteger(2205), makeInteger(2207), makeInteger(2211), makeInteger(2215), makeInteger(2216), makeInteger(2218), makeInteger(2223), makeInteger(2226), makeInteger(2227), makeInteger(2228), makeInteger(2256), makeInteger(2263), makeInteger(2269), makeInteger(2270), makeInteger(2271), makeInteger(2273), makeInteger(2277), makeInteger(2278), makeInteger(2283), makeInteger(2287), makeInteger(2289), makeInteger(2291), makeInteger(2292), makeInteger(2293), makeInteger(2295), makeInteger(2296), makeInteger(2297), makeInteger(2299), makeInteger(2316), makeInteger(2319), makeInteger(2321), makeInteger(2323), makeInteger(2324), makeInteger(2325), makeInteger(2330), makeInteger(2332), makeInteger(2337), makeInteger(2351), makeInteger(2364), makeInteger(2365), makeInteger(2367), makeInteger(2368), makeInteger(2372), makeInteger(2375), makeInteger(2378), makeInteger(2385), makeInteger(2386), makeInteger(2390), makeInteger(2391), makeInteger(2395), makeInteger(2402), makeInteger(2409), makeInteger(2410), makeInteger(2415), makeInteger(2418), makeInteger(2422), makeInteger(2429), makeInteger(2435), makeInteger(2437), makeInteger(2439), makeInteger(2445), makeInteger(2446), makeInteger(2450), makeInteger(2452), makeInteger(2453), makeInteger(2454), makeInteger(2455), makeInteger(2457), makeInteger(2458), makeInteger(2462), makeInteger(2463), makeInteger(2470), makeInteger(2471), makeInteger(2474), makeInteger(2475), makeInteger(2477), makeInteger(2479), makeInteger(2484), makeInteger(2487), makeInteger(2488), makeInteger(2491), makeInteger(2494), makeInteger(2497), makeInteger(2500), makeInteger(2502), makeInteger(2505), makeInteger(2506), makeInteger(2507), makeInteger(2509), makeInteger(2512), makeInteger(2513), makeInteger(2515), makeInteger(2516), makeInteger(2517), makeInteger(2518), makeInteger(2531), makeInteger(2532), makeInteger(2548), makeInteger(2549), makeInteger(2556), makeInteger(2559), makeInteger(3315), makeInteger(3317), makeInteger(3318), makeInteger(3319), makeInteger(3339), makeInteger(3342), makeInteger(3344), makeInteger(3372), makeInteger(3373), makeInteger(3374), makeInteger(3375), makeInteger(3376), makeInteger(3377), makeInteger(3378), makeInteger(3379), makeInteger(3380), makeInteger(3381), makeInteger(3382), makeInteger(3383), makeInteger(3384), makeInteger(3385), makeInteger(3386), makeInteger(3387), makeInteger(3388), makeInteger(3389), makeInteger(3390), makeInteger(3391), makeInteger(3392), makeInteger(3393), makeInteger(3394), makeInteger(3395), makeInteger(3396), makeInteger(3397), makeInteger(3398), makeInteger(3399), makeInteger(3400), makeInteger(3401), makeInteger(3402), makeInteger(3403), makeInteger(3404), makeInteger(3405), makeInteger(3406), makeInteger(3407), makeInteger(3408), makeInteger(3409), makeInteger(3410), makeInteger(3411), makeInteger(3412), makeInteger(3413), makeInteger(3414), makeInteger(3415), makeInteger(3416), makeInteger(3417), makeInteger(3418), makeInteger(3419), makeInteger(3420), makeInteger(3421), makeInteger(3422), makeInteger(3423), makeInteger(3424), makeInteger(3425), makeInteger(3426), makeInteger(3427), makeInteger(3428), makeInteger(3429), makeInteger(3430), makeInteger(3431), makeInteger(3432), makeInteger(3433), makeInteger(3434), makeInteger(3435), makeInteger(3437), makeInteger(3438), makeInteger(3439), makeInteger(3440), makeInteger(3441), makeInteger(3442), makeInteger(3443), makeInteger(3444), makeInteger(3445), makeInteger(3446), makeInteger(3447), makeInteger(3448), makeInteger(3449), makeInteger(3450), makeInteger(3451), makeInteger(3452), makeInteger(3461), makeInteger(3463), makeInteger(3464), makeInteger(3465), makeInteger(3466), makeInteger(3467), makeInteger(3476), makeInteger(3477), makeInteger(3482), makeInteger(3485), makeInteger(3486), makeInteger(3490), makeInteger(3491), makeInteger(3493), makeInteger(3496), makeInteger(3506), makeInteger(3507), makeInteger(3514), makeInteger(3598), makeInteger(3600), makeInteger(3607), makeInteger(3608), makeInteger(3609), makeInteger(3610), makeInteger(3611), makeInteger(3612), makeInteger(3613), makeInteger(3614), makeInteger(3615), makeInteger(3616), makeInteger(3617), makeInteger(3618), makeInteger(3632), makeInteger(3637), makeInteger(3638), makeInteger(3639), makeInteger(3640), makeInteger(3641), makeInteger(3642), makeInteger(3647), makeInteger(3648), makeInteger(3652), makeInteger(3653), makeInteger(3654), makeInteger(3657), makeInteger(3658), makeInteger(3727), makeInteger(3739), makeInteger(3750), makeInteger(3753), makeInteger(3756), makeInteger(3764), makeInteger(3769), makeInteger(3770), makeInteger(3793), makeInteger(3796), makeInteger(3810), makeInteger(3827), makeInteger(3829), makeInteger(3830), makeInteger(3833), makeInteger(3834), makeInteger(3835), makeInteger(3859), makeInteger(3860), makeInteger(3877), makeInteger(3878), makeInteger(3879), makeInteger(3880), makeInteger(3881), makeInteger(3882), makeInteger(3885), makeInteger(3886), makeInteger(4013), makeInteger(4038), makeInteger(4039), makeInteger(4040), makeInteger(4100), makeInteger(4149), makeInteger(4150)}), makeInteger(4160)), makeKeyword("SUCCESS")));
  }

  //// Initializers

  public void declareFunctions() {
    declare_number_utilities_file();
  }

  public void initializeVariables() {
    init_number_utilities_file();
  }

  public void runTopLevelForms() {
    setup_number_utilities_file();
  }

}
