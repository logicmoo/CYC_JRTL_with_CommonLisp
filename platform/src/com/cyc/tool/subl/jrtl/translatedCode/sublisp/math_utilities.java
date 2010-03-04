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

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

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

public  final class math_utilities extends SubLTranslatedFile {

  //// Constructor

  private math_utilities() {}
  public static final SubLFile me = new math_utilities();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities";

  //// Definitions

  @SubL(source = "sublisp/math-utilities.lisp", position = 1065) 
  private static SubLSymbol $bell_double_precision_bits$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 1488) 
  private static SubLSymbol $bell_extended_precision_bits$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 1591) 
  private static SubLSymbol $bell_2_expt_p$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 1754) 
  private static SubLSymbol $bell_2_expt_p_1$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 1865) 
  private static SubLSymbol $bell_2_expt_p_n$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2002) 
  private static SubLSymbol $bell_2_expt_p_n_1$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2150) 
  private static SubLSymbol $bell_2_expt_n$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2246) 
  private static SubLSymbol $bell_2_expt_n_1$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2354) 
  private static SubLSymbol $bell_log5_of_2_expt_n$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2483) 
  private static SubLSymbol $bell_exp_table_lookup_limit$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 2528) 
  public static final SubLObject bell_ten_to_e(SubLObject e) {
    return Numbers.sublisp_float(Numbers.expt(TEN_INTEGER, e), UNPROVIDED);
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 2675) 
  public static final SubLObject bell_float_significand(SubLObject x) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject r1 = Numbers.integer_decode_float(x);
        SubLObject r2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return r1;
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 2793) 
  public static final SubLObject bell_float_exponent(SubLObject x) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject r1 = Numbers.integer_decode_float(x);
        SubLObject r2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return r2;
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 2906) 
  public static final SubLObject bell_next_float(SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject x = Numbers.sublisp_float(arg, UNPROVIDED);
        if (x.numGE(ZERO_INTEGER)) {
          thread.resetMultipleValues();
          {
            SubLObject significand = Numbers.integer_decode_float(x);
            SubLObject exponent = thread.secondMultipleValue();
            SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(Numbers.add(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject significand = Numbers.integer_decode_float(x);
            SubLObject exponent = thread.secondMultipleValue();
            SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(Numbers.subtract(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 3342) 
  public static final SubLObject bell_prev_float(SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject x = Numbers.sublisp_float(arg, UNPROVIDED);
        if (x.numGE(ZERO_INTEGER)) {
          thread.resetMultipleValues();
          {
            SubLObject significand = Numbers.integer_decode_float(x);
            SubLObject exponent = thread.secondMultipleValue();
            SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(Numbers.subtract(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject significand = Numbers.integer_decode_float(x);
            SubLObject exponent = thread.secondMultipleValue();
            SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(Numbers.add(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 3778) 
  public static final SubLObject bell_multiply_and_test(SubLObject f, SubLObject e) {
    {
      SubLObject result = NIL;
      if (f.numG(Numbers.multiply($int9$17976931348623157, Numbers.expt(TEN_INTEGER, $int10$292)))) {
        {
          SubLObject num_digits = Numbers.ceiling(Numbers.log(f, TEN_INTEGER), UNPROVIDED);
          SubLObject f_new = Numbers.round(Numbers.divide(f, Numbers.expt(TEN_INTEGER, Numbers.subtract(num_digits, $int11$30))), UNPROVIDED);
          SubLObject e_new = Numbers.add(e, Numbers.subtract(num_digits, $int11$30));
          SubLObject z = Numbers.multiply(f_new, bell_ten_to_e(e_new));
          result = bell_fail(f, e, z);
        }
      } else {
        {
          SubLObject x = Numbers.sublisp_float(f, UNPROVIDED);
          SubLObject y = (e.numL($int12$_300) ? ((SubLObject) bell_ten_to_e(Numbers.ceiling(e, TWO_INTEGER))) : bell_ten_to_e(e));
          SubLObject y2 = (e.numL($int12$_300) ? ((SubLObject) bell_ten_to_e(Numbers.floor(e, TWO_INTEGER))) : ONE_INTEGER);
          SubLObject z = Numbers.multiply(Numbers.multiply(x, y), y2);
          result = bell_fail(f, e, z);
        }
      }
      return result;
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 4430) 
  public static final SubLObject bellerophon(SubLObject f, SubLObject e) {
    if ((f.numL($bell_2_expt_n$.getGlobalValue())
         && e.numGE(ZERO_INTEGER)
         && e.numL($bell_exp_table_lookup_limit$.getGlobalValue())
         && e.numL($bell_log5_of_2_expt_n$.getGlobalValue()))) {
      return Numbers.multiply(Numbers.sublisp_float(f, UNPROVIDED), bell_ten_to_e(e));
    } else if ((f.numL($bell_2_expt_n$.getGlobalValue())
         && e.numL(ZERO_INTEGER)
         && Numbers.minus(e).numL($bell_exp_table_lookup_limit$.getGlobalValue())
         && Numbers.minus(e).numL($bell_log5_of_2_expt_n$.getGlobalValue()))) {
      return Numbers.divide(Numbers.sublisp_float(f, UNPROVIDED), bell_ten_to_e(Numbers.minus(e)));
    } else {
      return bell_multiply_and_test(f, e);
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 4838) 
  private static SubLSymbol $bell_delta$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 4886) 
  private static SubLSymbol $bell_beta$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 4967) 
  private static SubLSymbol $bell_beta_expt_n_1$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5133) 
  private static SubLSymbol $bell_beta_significand$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5169) 
  private static SubLSymbol $bell_beta_exponent$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5202) 
  private static SubLSymbol $bell_delta_significand$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5239) 
  private static SubLSymbol $bell_delta_exponent$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5273) 
  private static SubLSymbol $bell_approximation_float$ = null;

  @SubL(source = "sublisp/math-utilities.lisp", position = 5312) 
  public static final SubLObject bell_fail(SubLObject f0, SubLObject e0, SubLObject z0) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $bell_delta_significand$.currentBinding(thread);
          SubLObject _prev_bind_1 = $bell_delta_exponent$.currentBinding(thread);
          try {
            $bell_delta_significand$.bind(f0, thread);
            $bell_delta_exponent$.bind(e0, thread);
            result = bell_fail_loop(z0);
          } finally {
            $bell_delta_exponent$.rebind(_prev_bind_1, thread);
            $bell_delta_significand$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 5491) 
  public static final SubLObject bell_compare(SubLObject x, SubLObject y) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject flag = NIL;
        SubLObject d = Numbers.subtract(x, y);
        SubLObject d2 = Numbers.multiply(TWO_INTEGER, $bell_beta_significand$.getDynamicValue(thread), Numbers.abs(d));
        if (d2.numL(y)) {
          if (($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue())
               && d.numL(ZERO_INTEGER)
               && Numbers.multiply($bell_beta$.getGlobalValue(), d2).numG(y))) {
            result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
            flag = ZERO_INTEGER;
          } else {
            result = $bell_approximation_float$.getDynamicValue(thread);
            flag = ONE_INTEGER;
          }
        } else if (d2.numE(y)) {
          if ((NIL != Numbers.evenp($bell_beta_significand$.getDynamicValue(thread)))) {
            if (($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue())
                 && d.numL(ZERO_INTEGER))) {
              result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
              flag = ZERO_INTEGER;
            } else {
              result = $bell_approximation_float$.getDynamicValue(thread);
              flag = ONE_INTEGER;
            }
          } else if (d.numL(ZERO_INTEGER)) {
            result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
            flag = ONE_INTEGER;
          } else if (d.numG(ZERO_INTEGER)) {
            result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
            flag = ONE_INTEGER;
          }
        } else if (d.numL(ZERO_INTEGER)) {
          result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
          flag = ZERO_INTEGER;
        } else if (d.numG(ZERO_INTEGER)) {
          result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
          flag = ZERO_INTEGER;
        }
        return Values.values(result, flag);
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 6699) 
  public static final SubLObject bell_fail_loop(SubLObject z0) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject flag = NIL;
        {
          SubLObject _prev_bind_0 = $bell_approximation_float$.currentBinding(thread);
          SubLObject _prev_bind_1 = $bell_beta_significand$.currentBinding(thread);
          SubLObject _prev_bind_2 = $bell_beta_exponent$.currentBinding(thread);
          try {
            $bell_approximation_float$.bind(z0, thread);
            $bell_beta_significand$.bind(bell_float_significand($bell_approximation_float$.getDynamicValue(thread)), thread);
            $bell_beta_exponent$.bind(bell_float_exponent($bell_approximation_float$.getDynamicValue(thread)), thread);
            if (($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)
                 && $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER))) {
              thread.resetMultipleValues();
              {
                SubLObject r1 = bell_compare(Numbers.multiply($bell_delta_significand$.getDynamicValue(thread), Numbers.expt($bell_delta$.getGlobalValue(), $bell_delta_exponent$.getDynamicValue(thread))), Numbers.multiply($bell_beta_significand$.getDynamicValue(thread), Numbers.expt($bell_beta$.getGlobalValue(), $bell_beta_exponent$.getDynamicValue(thread))));
                SubLObject r2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = r1;
                flag = r2;
              }
            } else if (($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)
                 && $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER))) {
              thread.resetMultipleValues();
              {
                SubLObject r1 = bell_compare(Numbers.multiply($bell_delta_significand$.getDynamicValue(thread), Numbers.expt($bell_delta$.getGlobalValue(), $bell_delta_exponent$.getDynamicValue(thread)), Numbers.expt($bell_beta$.getGlobalValue(), Numbers.minus($bell_beta_exponent$.getDynamicValue(thread)))), $bell_beta_significand$.getDynamicValue(thread));
                SubLObject r2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = r1;
                flag = r2;
              }
            } else if (($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)
                 && $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER))) {
              thread.resetMultipleValues();
              {
                SubLObject r1 = bell_compare($bell_delta_significand$.getDynamicValue(thread), Numbers.multiply($bell_beta_significand$.getDynamicValue(thread), Numbers.expt($bell_beta$.getGlobalValue(), $bell_beta_exponent$.getDynamicValue(thread)), Numbers.expt($bell_delta$.getGlobalValue(), Numbers.minus($bell_delta_exponent$.getDynamicValue(thread)))));
                SubLObject r2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = r1;
                flag = r2;
              }
            } else if (($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)
                 && $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER))) {
              thread.resetMultipleValues();
              {
                SubLObject r1 = bell_compare(Numbers.multiply($bell_delta_significand$.getDynamicValue(thread), Numbers.expt($bell_beta$.getGlobalValue(), Numbers.minus($bell_beta_exponent$.getDynamicValue(thread)))), Numbers.multiply($bell_beta_significand$.getDynamicValue(thread), Numbers.expt($bell_delta$.getGlobalValue(), Numbers.minus($bell_delta_exponent$.getDynamicValue(thread)))));
                SubLObject r2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = r1;
                flag = r2;
              }
            }
          } finally {
            $bell_beta_exponent$.rebind(_prev_bind_2, thread);
            $bell_beta_significand$.rebind(_prev_bind_1, thread);
            $bell_approximation_float$.rebind(_prev_bind_0, thread);
          }
        }
        if (flag.numE(ZERO_INTEGER)) {
          return bell_fail_loop(result);
        } else {
          return result;
        }
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 8303) 
  public static final SubLObject fdl_generate(SubLObject r, SubLObject s, SubLObject mX, SubLObject m_, SubLObject roundp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject quotient = Numbers.truncate(Numbers.multiply(r, TEN_INTEGER), s);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        mX = Numbers.multiply(mX, TEN_INTEGER);
        m_ = Numbers.multiply(m_, TEN_INTEGER);
        {
          SubLObject tc1 = Functions.funcall(((NIL != roundp) ? ((SubLObject) Symbols.symbol_function($sym13$__)) : Symbols.symbol_function($sym14$_)), remainder, m_);
          SubLObject tc2 = Functions.funcall(((NIL != roundp) ? ((SubLObject) Symbols.symbol_function($sym15$__)) : Symbols.symbol_function($sym16$_)), Numbers.add(remainder, mX), s);
          if ((NIL != tc1)) {
            if ((NIL != tc2)) {
              if (Numbers.multiply(remainder, TWO_INTEGER).numL(s)) {
                return list(quotient);
              } else {
                return list(Numbers.add(quotient, ONE_INTEGER));
              }
            } else {
              return list(quotient);
            }
          } else {
            if ((NIL != tc2)) {
              return list(Numbers.add(quotient, ONE_INTEGER));
            } else {
              return cons(quotient, fdl_generate(remainder, s, mX, m_, roundp));
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/math-utilities.lisp", position = 8967) 
  public static final SubLObject flonum_digit_list(SubLObject flonum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      flonum = Numbers.sublisp_float(Numbers.abs(flonum), UNPROVIDED);
      if (flonum.isZero()) {
        return Values.values(NIL, ZERO_INTEGER);
      } else {
        {
          SubLObject radix = Numbers.float_radix(flonum);
          SubLObject digits = Numbers.float_digits(flonum);
          thread.resetMultipleValues();
          {
            SubLObject significand = Numbers.integer_decode_float(flonum);
            SubLObject exponent = thread.secondMultipleValue();
            SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject r = NIL;
              SubLObject s = NIL;
              SubLObject mX = NIL;
              SubLObject m_ = NIL;
              if (exponent.isNegative()) {
                if ((exponent.numE(Numbers.$double_float_minimum_exponent$.getGlobalValue())
                    || (!(significand.numE(Numbers.expt(radix, Numbers.subtract(digits, ONE_INTEGER))))))) {
                  r = Numbers.multiply(significand, TWO_INTEGER);
                  s = Numbers.multiply(Numbers.expt(radix, Numbers.minus(exponent)), TWO_INTEGER);
                  mX = ONE_INTEGER;
                  m_ = ONE_INTEGER;
                } else {
                  r = Numbers.multiply(significand, radix, TWO_INTEGER);
                  s = Numbers.multiply(Numbers.expt(radix, Numbers.add(Numbers.minus(exponent), ONE_INTEGER)), TWO_INTEGER);
                  mX = radix;
                  m_ = ONE_INTEGER;
                }
              } else {
                if (significand.numE(Numbers.expt(radix, Numbers.subtract(digits, ONE_INTEGER)))) {
                  r = Numbers.multiply(significand, Numbers.expt(radix, Numbers.add(exponent, ONE_INTEGER)), TWO_INTEGER);
                  s = Numbers.multiply(radix, TWO_INTEGER);
                  mX = Numbers.expt(radix, Numbers.add(exponent, ONE_INTEGER));
                  m_ = Numbers.expt(radix, exponent);
                } else {
                  r = Numbers.multiply(significand, Numbers.expt(radix, exponent), TWO_INTEGER);
                  s = TWO_INTEGER;
                  mX = Numbers.expt(radix, exponent);
                  m_ = Numbers.expt(radix, exponent);
                }
              }
              {
                SubLObject estimate = Numbers.ceiling(Numbers.log(flonum, TEN_INTEGER), UNPROVIDED);
                if (estimate.numGE(ZERO_INTEGER)) {
                  s = Numbers.multiply(s, Numbers.expt(TEN_INTEGER, estimate));
                } else {
                  {
                    SubLObject scale = Numbers.expt(TEN_INTEGER, Numbers.minus(estimate));
                    r = Numbers.multiply(r, scale);
                    mX = Numbers.multiply(mX, scale);
                    m_ = Numbers.multiply(m_, scale);
                  }
                }
                {
                  SubLObject roundp = Numbers.evenp(significand);
                  if ((NIL != Functions.funcall(((NIL != roundp) ? ((SubLObject) Symbols.symbol_function($sym15$__)) : Symbols.symbol_function($sym16$_)), Numbers.add(r, mX), s))) {
                    return Values.values(fdl_generate(r, Numbers.multiply(s, TEN_INTEGER), mX, m_, roundp), Numbers.add(estimate, ONE_INTEGER));
                  } else {
                    return Values.values(fdl_generate(r, s, mX, m_, roundp), estimate);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static final SubLObject declare_math_utilities_file() {
    declareFunction(myName, "bell_ten_to_e", "BELL_TEN-TO-E", 1, 0, false);
    declareFunction(myName, "bell_float_significand", "BELL_FLOAT-SIGNIFICAND", 1, 0, false);
    declareFunction(myName, "bell_float_exponent", "BELL_FLOAT-EXPONENT", 1, 0, false);
    declareFunction(myName, "bell_next_float", "BELL_NEXT-FLOAT", 1, 0, false);
    declareFunction(myName, "bell_prev_float", "BELL_PREV-FLOAT", 1, 0, false);
    declareFunction(myName, "bell_multiply_and_test", "BELL_MULTIPLY-AND-TEST", 2, 0, false);
    declareFunction(myName, "bellerophon", "BELLEROPHON", 2, 0, false);
    declareFunction(myName, "bell_fail", "BELL_FAIL", 3, 0, false);
    declareFunction(myName, "bell_compare", "BELL_COMPARE", 2, 0, false);
    declareFunction(myName, "bell_fail_loop", "BELL_FAIL-LOOP", 1, 0, false);
    declareFunction(myName, "fdl_generate", "FDL_GENERATE", 5, 0, false);
    declareFunction(myName, "flonum_digit_list", "FLONUM-DIGIT-LIST", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_math_utilities_file() {
    $bell_double_precision_bits$ = defconstant("BELL_DOUBLE-PRECISION-BITS", $int0$53);
    $bell_extended_precision_bits$ = defconstant("BELL_EXTENDED-PRECISION-BITS", $int1$64);
    $bell_2_expt_p$ = defconstant("BELL_2_EXPT_P", $int2$18446744073709551616);
    $bell_2_expt_p_1$ = defconstant("BELL_2_EXPT_P-1", $int3$9223372036854775808);
    $bell_2_expt_p_n$ = defconstant("BELL_2_EXPT_P-N", $int4$2048);
    $bell_2_expt_p_n_1$ = defconstant("BELL_2_EXPT_P-N-1", $int5$1024);
    $bell_2_expt_n$ = defconstant("BELL_2_EXPT_N", $int6$9007199254740992);
    $bell_2_expt_n_1$ = defconstant("BELL_2_EXPT_N-1", $int7$4503599627370496);
    $bell_log5_of_2_expt_n$ = defconstant("BELL_LOG5_OF_2_EXPT_N", $int8$23);
    $bell_exp_table_lookup_limit$ = defconstant("BELL_EXP-TABLE-LOOKUP-LIMIT", $int8$23);
    $bell_delta$ = defconstant("BELL_DELTA", TEN_INTEGER);
    $bell_beta$ = defconstant("BELL_BETA", TWO_INTEGER);
    $bell_beta_expt_n_1$ = defconstant("BELL_BETA_EXPT_N-1", $int7$4503599627370496);
    $bell_beta_significand$ = defvar("BELL_BETA-SIGNIFICAND", NIL);
    $bell_beta_exponent$ = defvar("BELL_BETA-EXPONENT", NIL);
    $bell_delta_significand$ = defvar("BELL_DELTA-SIGNIFICAND", NIL);
    $bell_delta_exponent$ = defvar("BELL_DELTA-EXPONENT", NIL);
    $bell_approximation_float$ = defvar("BELL_APPROXIMATION-FLOAT", NIL);
    return NIL;
  }

  public static final SubLObject setup_math_utilities_file() {
    // CVS_ID("Id: math-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$53 = makeInteger(53);
  public static final SubLInteger $int1$64 = makeInteger(64);
  public static final SubLInteger $int2$18446744073709551616 = makeInteger("18446744073709551616");
  public static final SubLInteger $int3$9223372036854775808 = makeInteger("9223372036854775808");
  public static final SubLInteger $int4$2048 = makeInteger(2048);
  public static final SubLInteger $int5$1024 = makeInteger(1024);
  public static final SubLInteger $int6$9007199254740992 = makeInteger("9007199254740992");
  public static final SubLInteger $int7$4503599627370496 = makeInteger("4503599627370496");
  public static final SubLInteger $int8$23 = makeInteger(23);
  public static final SubLInteger $int9$17976931348623157 = makeInteger("17976931348623157");
  public static final SubLInteger $int10$292 = makeInteger(292);
  public static final SubLInteger $int11$30 = makeInteger(30);
  public static final SubLInteger $int12$_300 = makeInteger(-300);
  public static final SubLSymbol $sym13$__ = makeSymbol("<=");
  public static final SubLSymbol $sym14$_ = makeSymbol("<");
  public static final SubLSymbol $sym15$__ = makeSymbol(">=");
  public static final SubLSymbol $sym16$_ = makeSymbol(">");

  //// Initializers

  public void declareFunctions() {
    declare_math_utilities_file();
  }

  public void initializeVariables() {
    init_math_utilities_file();
  }

  public void runTopLevelForms() {
    setup_math_utilities_file();
  }

}
