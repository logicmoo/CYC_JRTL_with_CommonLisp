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

public  final class print_functions extends SubLTranslatedFile {

  //// Constructor

  private print_functions() {}
  public static final SubLFile me = new print_functions();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_functions";

  //// Definitions

  @SubL(source = "sublisp/print-functions.lisp", position = 671) 
  public static final SubLObject print_integer_internal(SubLObject integer, SubLObject stream, SubLObject print_base) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject quotient = Numbers.truncate(integer, print_base);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((!(quotient.isZero()))) {
          print_integer_internal(quotient, stream, print_base);
        }
        streams_high.write_char(Characters.digit_char(remainder), stream);
      }
      return integer;
    }
  }

  /** Used for storing the value of the maximum power of a radix that is still
a fixnum i.e. (FLOOR (LOG MOST-POSITIVE-FIXNUM RADIX)). */
  @SubL(source = "sublisp/print-functions.lisp", position = 1032) 
  private static SubLSymbol $max_fixnum_base_power$ = null;

  /** Used for storing the value of the integer such that a radix raised to one
plus that power is the corresponding entry in *max-fixnum-base-power*. */
  @SubL(source = "sublisp/print-functions.lisp", position = 1754) 
  private static SubLSymbol $max_fixnum_power_less_one$ = null;

  @SubL(source = "sublisp/print-functions.lisp", position = 2490) 
  public static final SubLObject print_bignum_internal(SubLObject bignum, SubLObject stream, SubLObject radix, SubLObject divisor, SubLObject power_less_one) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject quotient = Numbers.truncate(bignum, divisor);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (quotient.isFixnum()) {
          print_integer_internal(quotient, stream, radix);
        } else {
          print_bignum_internal(quotient, stream, radix, divisor, power_less_one);
        }
        {
          SubLObject num_zeros = NIL;
          SubLObject base_power = NIL;
          for (num_zeros = power_less_one, base_power = radix; (!(base_power.numG(remainder))); num_zeros = Numbers.subtract(num_zeros, ONE_INTEGER), base_power = Numbers.multiply(base_power, radix)) {
          }
          {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(num_zeros); i = Numbers.add(i, ONE_INTEGER)) {
              streams_high.write_char(Characters.CHAR_0, stream);
            }
          }
          print_integer_internal(remainder, stream, radix);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 3068) 
  public static final SubLObject print_integer(SubLObject integer, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != print_high.$print_radix$.getDynamicValue(thread))
           && (!(print_high.$print_base$.getDynamicValue(thread).numE(TEN_INTEGER))))) {
        streams_high.write_char(Characters.CHAR_hash, stream);
        {
          SubLObject pcase_var = print_high.$print_base$.getDynamicValue(thread);
          if (pcase_var.eql(TWO_INTEGER)) {
            streams_high.write_char(Characters.CHAR_b, stream);
          } else if (pcase_var.eql(EIGHT_INTEGER)) {
            streams_high.write_char(Characters.CHAR_o, stream);
          } else if (pcase_var.eql(SIXTEEN_INTEGER)) {
            streams_high.write_char(Characters.CHAR_x, stream);
          } else {
            {
              SubLObject radix = print_high.$print_base$.getDynamicValue(thread);
              {
                SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
                SubLObject _prev_bind_1 = print_high.$print_radix$.currentBinding(thread);
                try {
                  print_high.$print_base$.bind(TEN_INTEGER, thread);
                  print_high.$print_radix$.bind(NIL, thread);
                  print_integer_internal(radix, stream, print_high.$print_base$.getDynamicValue(thread));
                  streams_high.write_char(Characters.CHAR_r, stream);
                } finally {
                  print_high.$print_radix$.rebind(_prev_bind_1, thread);
                  print_high.$print_base$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
      }
      if (integer.isNegative()) {
        streams_high.write_char(Characters.CHAR_hyphen, stream);
      }
      if ((integer.isInteger()
           && (!(integer.isFixnum())))) {
        print_bignum_internal(Numbers.abs(integer), stream, print_high.$print_base$.getDynamicValue(thread), Vectors.aref($max_fixnum_base_power$.getDynamicValue(thread), print_high.$print_base$.getDynamicValue(thread)), Vectors.aref($max_fixnum_power_less_one$.getDynamicValue(thread), print_high.$print_base$.getDynamicValue(thread)));
      } else {
        print_integer_internal(Numbers.abs(integer), stream, print_high.$print_base$.getDynamicValue(thread));
      }
      if (((NIL != print_high.$print_radix$.getDynamicValue(thread))
           && print_high.$print_base$.getDynamicValue(thread).numE(TEN_INTEGER))) {
        streams_high.write_char(Characters.CHAR_period, stream);
      }
      return integer;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 3994) 
  public static final SubLObject print_object_bignum_method(SubLObject bignum, SubLObject stream) {
    print_integer(bignum, stream);
    return bignum;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 4096) 
  public static final SubLObject print_object_fixnum_method(SubLObject fixnum, SubLObject stream) {
    print_integer(fixnum, stream);
    return fixnum;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 4198) 
  public static final SubLObject print_flonum(SubLObject flonum, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (Numbers.float_sign(flonum, UNPROVIDED).isNegative()) {
        streams_high.write_char(Characters.CHAR_hyphen, stream);
      }
      if ((NIL != Numbers.infinity_p(flonum))) {
        streams_high.write_string($str4$Inf, stream, UNPROVIDED, UNPROVIDED);
      } else if ((NIL != Numbers.not_a_number_p(flonum))) {
        streams_high.write_string($str5$NaN, stream, UNPROVIDED, UNPROVIDED);
      } else {
        thread.resetMultipleValues();
        {
          SubLObject digits = math_utilities.flonum_digit_list(flonum);
          SubLObject scale = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((scale.numGE($int6$_2)
               && scale.numL(EIGHT_INTEGER))) {
            if (scale.isPositive()) {
              {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(scale); i = Numbers.add(i, ONE_INTEGER)) {
                  {
                    SubLObject digit = digits.first();
                    streams_high.write_char(((NIL != digit) ? ((SubLObject) Characters.digit_char(digit)) : Characters.CHAR_0), stream);
                    digits = digits.rest();
                  }
                }
              }
              streams_high.write_char(Characters.CHAR_period, stream);
            } else {
              streams_high.write_char(Characters.CHAR_0, stream);
              streams_high.write_char(Characters.CHAR_period, stream);
              {
                SubLObject cdotimes_end_var = Numbers.abs(scale);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
                  streams_high.write_char(Characters.CHAR_0, stream);
                }
              }
            }
            if ((NIL != digits)) {
              {
                SubLObject cdolist_list_var = digits;
                SubLObject digit = NIL;
                for (digit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), digit = cdolist_list_var.first()) {
                  streams_high.write_char(Characters.digit_char(digit), stream);
                }
              }
            } else {
              streams_high.write_char(Characters.CHAR_0, stream);
            }
          } else {
            streams_high.write_char(((NIL != digits) ? ((SubLObject) Characters.digit_char(digits.first())) : Characters.CHAR_0), stream);
            streams_high.write_char(Characters.CHAR_period, stream);
            if ((NIL != digits.rest())) {
              {
                SubLObject cdolist_list_var = digits.rest();
                SubLObject digit = NIL;
                for (digit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), digit = cdolist_list_var.first()) {
                  streams_high.write_char(Characters.digit_char(digit), stream);
                }
              }
            } else {
              streams_high.write_char(Characters.CHAR_0, stream);
            }
            streams_high.write_char(Characters.CHAR_E, stream);
            {
              SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
              try {
                print_high.$print_base$.bind(TEN_INTEGER, thread);
                print_high.princ(Numbers.subtract(scale, ONE_INTEGER), stream);
              } finally {
                print_high.$print_base$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return flonum;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 5500) 
  public static final SubLObject print_object_float_method(SubLObject flonum, SubLObject stream) {
    print_flonum(flonum, stream);
    return flonum;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 5600) 
  public static final SubLObject print_character(SubLObject character, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != print_high.$print_escape$.getDynamicValue(thread))) {
        streams_high.write_char(Characters.CHAR_hash, stream);
        streams_high.write_char(Characters.CHAR_backslash, stream);
        streams_high.write_string(character_names.character_names(character).first(), stream, UNPROVIDED, UNPROVIDED);
      } else {
        streams_high.write_char(character, stream);
      }
      return character;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 5885) 
  public static final SubLObject print_object_character_method(SubLObject character, SubLObject stream) {
    print_character(character, stream);
    return character;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 6003) 
  public static final SubLObject print_symbol_package_portion(SubLObject symbol, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (symbol.isKeyword()) {
        streams_high.write_char(Characters.CHAR_colon, stream);
      } else {
        thread.resetMultipleValues();
        {
          SubLObject symb = Packages.find_symbol(Symbols.symbol_name(symbol), Packages.$package$.getDynamicValue(thread));
          SubLObject state = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if (((NIL == state)
              || (symb != symbol))) {
            {
              SubLObject v_package = Symbols.symbol_package(symbol);
              if ((!(v_package.isPackage()))) {
                streams_high.write_string($str9$__, stream, UNPROVIDED, UNPROVIDED);
              } else {
                thread.resetMultipleValues();
                {
                  SubLObject sym = Packages.find_symbol(Symbols.symbol_name(symbol), v_package);
                  SubLObject tag = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  streams_high.write_string(Packages.package_name(v_package), stream, UNPROVIDED, UNPROVIDED);
                  streams_high.write_char(Characters.CHAR_colon, stream);
                  if ((tag == $kw10$INTERNAL)) {
                    streams_high.write_char(Characters.CHAR_colon, stream);
                  }
                }
              }
            }
          }
        }
      }
      return symbol;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 7286) 
  public static final SubLObject print_symbol(SubLObject symbol, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject name = Symbols.symbol_name(symbol);
        if ((NIL != print_high.$print_escape$.getDynamicValue(thread))) {
          print_symbol_package_portion(symbol, stream);
        }
        if (((NIL != print_high.$print_escape$.getDynamicValue(thread))
            || (NIL != print_high.$print_readably$.getDynamicValue(thread)))) {
          if ((NIL != reader.symbol_escapep(symbol))) {
            streams_high.write_char(Characters.CHAR_vertical, stream);
            streams_high.write_string(name, stream, UNPROVIDED, UNPROVIDED);
            streams_high.write_char(Characters.CHAR_vertical, stream);
          } else {
            streams_high.write_string(name, stream, UNPROVIDED, UNPROVIDED);
          }
        } else {
          if ((print_high.$print_case$.getDynamicValue(thread) == $kw11$CAPITALIZE)) {
            streams_high.write_string(Strings.string_capitalize(name, UNPROVIDED, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
          } else {
            {
              SubLObject upper = NIL;
              SubLObject lower = NIL;
              SubLObject cdotimes_end_var = Sequences.length(name);
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
                {
                  SubLObject ch = Strings.sublisp_char(name, i);
                  if ((NIL != Characters.both_case_p(ch))) {
                    if ((NIL != Characters.upper_case_p(ch))) {
                      upper = T;
                    } else {
                      lower = T;
                    }
                  }
                }
              }
              {
                SubLObject pcase_var = print_high.$print_case$.getDynamicValue(thread);
                if (pcase_var.eql($kw12$UPCASE)) {
                  streams_high.write_string(((NIL != lower) ? ((SubLObject) Strings.string_upcase(name, UNPROVIDED, UNPROVIDED)) : name), stream, UNPROVIDED, UNPROVIDED);
                } else if (pcase_var.eql($kw13$DOWNCASE)) {
                  streams_high.write_string(((NIL != upper) ? ((SubLObject) Strings.string_downcase(name, UNPROVIDED, UNPROVIDED)) : name), stream, UNPROVIDED, UNPROVIDED);
                }
              }
            }
          }
        }
      }
      return symbol;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 8717) 
  public static final SubLObject print_object_symbol_method(SubLObject symbol, SubLObject stream) {
    print_symbol(symbol, stream);
    return symbol;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 8818) 
  public static final SubLObject print_string(SubLObject string, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != print_high.$print_escape$.getDynamicValue(thread))) {
        streams_high.write_char(Characters.CHAR_quotation, stream);
        {
          SubLObject cdotimes_end_var = Sequences.length(string);
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
            {
              SubLObject ch = Strings.sublisp_char(string, i);
              if (((NIL != Characters.charE(ch, Characters.CHAR_quotation))
                  || (NIL != reader.single_escape_syntaxp(ch)))) {
                streams_high.write_char(Characters.CHAR_backslash, stream);
              }
              streams_high.write_char(ch, stream);
            }
          }
        }
        streams_high.write_char(Characters.CHAR_quotation, stream);
      } else {
        streams_high.write_string(string, stream, UNPROVIDED, UNPROVIDED);
      }
      return string;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 9287) 
  public static final SubLObject print_object_string_method(SubLObject string, SubLObject stream) {
    print_string(string, stream);
    return string;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 9388) 
  public static final SubLObject print_cons_cells(SubLObject cons, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == print_high.$print_readably$.getDynamicValue(thread))
           && print_high.$print_level$.getDynamicValue(thread).eql(ZERO_INTEGER))) {
        streams_high.write_char(Characters.CHAR_hash, stream);
      } else {
        {
          SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
          try {
            print_high.$print_level$.bind(((NIL != print_high.$print_level$.getDynamicValue(thread)) ? ((SubLObject) Numbers.subtract(print_high.$print_level$.getDynamicValue(thread), ONE_INTEGER)) : NIL), thread);
            {
              SubLObject done = NIL;
              SubLObject count = ONE_INTEGER;
              SubLObject first = cons.first();
              SubLObject tail = cons.rest();
              if (((NIL != print_high.$print_pretty$.getDynamicValue(thread))
                   && first.eql($sym16$QUOTE)
                   && tail.isCons()
                   && (NIL == tail.rest()))) {
                streams_high.write_char(Characters.CHAR_quote, stream);
                PrintLow.write(conses_high.cadr(cons), new SubLObject[] {$kw17$STREAM, stream});
              } else {
                streams_high.write_char(Characters.CHAR_lparen, stream);
                PrintLow.write(first, new SubLObject[] {$kw17$STREAM, stream});
                for (; (!((tail.isAtom()
                      || (NIL != done)))); ) {
                  if ((NIL != print_high.circular_reference_p(tail, stream))) {
                    streams_high.write_string($str18$___, stream, UNPROVIDED, UNPROVIDED);
                    PrintLow.write(tail, new SubLObject[] {$kw17$STREAM, stream});
                    done = T;
                  } else if (((NIL == print_high.$print_readably$.getDynamicValue(thread))
                       && (NIL != print_high.$print_length$.getDynamicValue(thread))
                       && count.numGE(print_high.$print_length$.getDynamicValue(thread)))) {
                    streams_high.write_string($str19$____, stream, UNPROVIDED, UNPROVIDED);
                    done = T;
                  } else {
                    streams_high.write_char(Characters.CHAR_space, stream);
                    PrintLow.write(tail.first(), new SubLObject[] {$kw17$STREAM, stream});
                    tail = tail.rest();
                    count = Numbers.add(count, ONE_INTEGER);
                  }
                }
                if ((!(tail.isList()))) {
                  streams_high.write_string($str18$___, stream, UNPROVIDED, UNPROVIDED);
                  PrintLow.write(tail, new SubLObject[] {$kw17$STREAM, stream});
                }
                streams_high.write_char(Characters.CHAR_rparen, stream);
              }
            }
          } finally {
            print_high.$print_level$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return cons;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 10746) 
  public static final SubLObject print_object_cons_method(SubLObject cons, SubLObject stream) {
    print_cons_cells(cons, stream);
    return cons;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 10843) 
  public static final SubLObject print_vector(SubLObject vector, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject length = Sequences.length(vector);
        if ((NIL != print_high.$print_readably$.getDynamicValue(thread))) {
          streams_high.write_char(Characters.CHAR_hash, stream);
          streams_high.write_char(Characters.CHAR_lparen, stream);
          if (length.isPositive()) {
            PrintLow.write(Vectors.aref(vector, ZERO_INTEGER), new SubLObject[] {$kw17$STREAM, stream});
            {
              SubLObject cdotimes_end_var = Numbers.subtract(length, ONE_INTEGER);
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
                streams_high.write_char(Characters.CHAR_space, stream);
                PrintLow.write(Vectors.aref(vector, Numbers.add(i, ONE_INTEGER)), new SubLObject[] {$kw17$STREAM, stream});
              }
            }
          }
          streams_high.write_char(Characters.CHAR_rparen, stream);
        } else if ((NIL != print_high.$print_array$.getDynamicValue(thread))) {
          streams_high.write_char(Characters.CHAR_hash, stream);
          if ((!(print_high.$print_level$.getDynamicValue(thread).eql(ZERO_INTEGER)))) {
            streams_high.write_char(Characters.CHAR_lparen, stream);
            {
              SubLObject actual = ((NIL != print_high.$print_length$.getDynamicValue(thread)) ? ((SubLObject) Numbers.min(print_high.$print_length$.getDynamicValue(thread), length)) : length);
              {
                SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
                try {
                  print_high.$print_level$.bind(((NIL != print_high.$print_level$.getDynamicValue(thread)) ? ((SubLObject) Numbers.subtract(print_high.$print_level$.getDynamicValue(thread), ONE_INTEGER)) : NIL), thread);
                  {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(actual); i = Numbers.add(i, ONE_INTEGER)) {
                      if ((!(i.isZero()))) {
                        streams_high.write_char(Characters.CHAR_space, stream);
                      }
                      PrintLow.write(Vectors.aref(vector, i), new SubLObject[] {$kw17$STREAM, stream});
                    }
                    if (actual.numL(length)) {
                      if (actual.isPositive()) {
                        streams_high.write_char(Characters.CHAR_space, stream);
                      }
                      streams_high.write_string($str21$___, stream, UNPROVIDED, UNPROVIDED);
                    }
                  }
                } finally {
                  print_high.$print_level$.rebind(_prev_bind_0, thread);
                }
              }
            }
            streams_high.write_char(Characters.CHAR_rparen, stream);
          }
        } else {
          if ((NIL != print_high.$print_readably$.getDynamicValue(thread))) {
            print_high.print_not_readable(vector, stream);
          } else {
            {
              SubLObject object = vector;
              SubLObject stream_1 = stream;
              streams_high.write_string($str22$__, stream_1, UNPROVIDED, UNPROVIDED);
              PrintLow.write(Types.type_of(object), new SubLObject[] {$kw17$STREAM, stream_1});
              streams_high.write_char(Characters.CHAR_space, stream_1);
              PrintLow.format(stream, $str23$_D, length);
              streams_high.write_char(Characters.CHAR_space, stream_1);
              PrintLow.write(Equality.pointer(object), new SubLObject[] {$kw17$STREAM, stream_1, $kw24$BASE, SIXTEEN_INTEGER});
              streams_high.write_char(Characters.CHAR_greater, stream_1);
            }
          }
        }
      }
      return vector;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 12005) 
  public static final SubLObject print_object_vector_method(SubLObject vector, SubLObject stream) {
    print_vector(vector, stream);
    return vector;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 12106) 
  public static final SubLObject print_hashtable(SubLObject hash_table, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != print_high.$print_readably$.getDynamicValue(thread))) {
        print_high.print_not_readable(hash_table, stream);
      } else {
        {
          SubLObject object = hash_table;
          SubLObject stream_2 = stream;
          streams_high.write_string($str22$__, stream_2, UNPROVIDED, UNPROVIDED);
          PrintLow.write(Types.type_of(object), new SubLObject[] {$kw17$STREAM, stream_2});
          streams_high.write_char(Characters.CHAR_space, stream_2);
          PrintLow.format(stream, $str26$TEST__A__D__D, new SubLObject[] {Hashtables.hash_table_test(hash_table), Hashtables.hash_table_count(hash_table), Hashtables.hash_table_size(hash_table)});
          streams_high.write_char(Characters.CHAR_space, stream_2);
          PrintLow.write(Equality.pointer(object), new SubLObject[] {$kw17$STREAM, stream_2, $kw24$BASE, SIXTEEN_INTEGER});
          streams_high.write_char(Characters.CHAR_greater, stream_2);
        }
      }
      return hash_table;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 13084) 
  public static final SubLObject print_object_hash_table_method(SubLObject hash_table, SubLObject stream) {
    print_hashtable(hash_table, stream);
    return hash_table;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 13204) 
  public static final SubLObject print_object_function_method(SubLObject function, SubLObject stream) {
    Functions.print_function(function, stream);
    return function;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 13315) 
  public static final SubLObject write_guid_string(SubLObject guid, SubLObject stream) {
    streams_high.write_string(Guids.guid_to_string(guid), stream, UNPROVIDED, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 13455) 
  public static final SubLObject print_guid_internal(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != print_high.$print_escape$.getDynamicValue(thread))) {
        streams_high.write_string($str29$_G, stream, UNPROVIDED, UNPROVIDED);
        streams_high.write_char(Characters.CHAR_quotation, stream);
        write_guid_string(object, stream);
        streams_high.write_char(Characters.CHAR_quotation, stream);
      } else {
        write_guid_string(object, stream);
      }
      return object;
    }
  }

  @SubL(source = "sublisp/print-functions.lisp", position = 13776) 
  public static final SubLObject print_object_guid_method(SubLObject guid, SubLObject stream) {
    print_guid_internal(guid, stream);
    return guid;
  }

  public static final SubLObject declare_print_functions_file() {
    declareFunction(myName, "print_integer_internal", "PRINT-INTEGER-INTERNAL", 3, 0, false);
    declareFunction(myName, "print_bignum_internal", "PRINT-BIGNUM-INTERNAL", 5, 0, false);
    declareFunction(myName, "print_integer", "PRINT-INTEGER", 2, 0, false);
    declareFunction(myName, "print_object_bignum_method", "PRINT-OBJECT-BIGNUM-METHOD", 2, 0, false);
    declareFunction(myName, "print_object_fixnum_method", "PRINT-OBJECT-FIXNUM-METHOD", 2, 0, false);
    declareFunction(myName, "print_flonum", "PRINT-FLONUM", 2, 0, false);
    declareFunction(myName, "print_object_float_method", "PRINT-OBJECT-FLOAT-METHOD", 2, 0, false);
    declareFunction(myName, "print_character", "PRINT-CHARACTER", 2, 0, false);
    declareFunction(myName, "print_object_character_method", "PRINT-OBJECT-CHARACTER-METHOD", 2, 0, false);
    declareFunction(myName, "print_symbol_package_portion", "PRINT-SYMBOL-PACKAGE-PORTION", 2, 0, false);
    declareFunction(myName, "print_symbol", "PRINT-SYMBOL", 2, 0, false);
    declareFunction(myName, "print_object_symbol_method", "PRINT-OBJECT-SYMBOL-METHOD", 2, 0, false);
    declareFunction(myName, "print_string", "PRINT-STRING", 2, 0, false);
    declareFunction(myName, "print_object_string_method", "PRINT-OBJECT-STRING-METHOD", 2, 0, false);
    declareFunction(myName, "print_cons_cells", "PRINT-CONS-CELLS", 2, 0, false);
    declareFunction(myName, "print_object_cons_method", "PRINT-OBJECT-CONS-METHOD", 2, 0, false);
    declareFunction(myName, "print_vector", "PRINT-VECTOR", 2, 0, false);
    declareFunction(myName, "print_object_vector_method", "PRINT-OBJECT-VECTOR-METHOD", 2, 0, false);
    declareFunction(myName, "print_hashtable", "PRINT-HASHTABLE", 2, 0, false);
    declareFunction(myName, "print_object_hash_table_method", "PRINT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
    declareFunction(myName, "print_object_function_method", "PRINT-OBJECT-FUNCTION-METHOD", 2, 0, false);
    declareFunction(myName, "write_guid_string", "WRITE-GUID-STRING", 2, 0, false);
    declareFunction(myName, "print_guid_internal", "PRINT-GUID-INTERNAL", 2, 0, false);
    declareFunction(myName, "print_object_guid_method", "PRINT-OBJECT-GUID-METHOD", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_print_functions_file() {
    $max_fixnum_base_power$ = defvar("*MAX-FIXNUM-BASE-POWER*", Vectors.make_vector($int0$37, UNPROVIDED));
    $max_fixnum_power_less_one$ = defvar("*MAX-FIXNUM-POWER-LESS-ONE*", Vectors.make_vector($int0$37, UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_print_functions_file() {
    // CVS_ID("Id: print-functions.lisp 126640 2008-12-04 13:39:36Z builder ");
    {
      SubLObject radix = NIL;
      for (radix = TWO_INTEGER; (!(radix.numG($int1$36))); radix = Numbers.add(radix, ONE_INTEGER)) {
        {
          SubLObject final_power_less_one = MINUS_ONE_INTEGER;
          SubLObject final_divisor = ONE_INTEGER;
          SubLObject done = NIL;
          SubLObject power_less_one = NIL;
          SubLObject divisor = NIL;
          SubLObject new_divisor = NIL;
          for (power_less_one = MINUS_ONE_INTEGER, divisor = ONE_INTEGER, new_divisor = radix; (NIL == done); power_less_one = Numbers.add(power_less_one, ONE_INTEGER), divisor = new_divisor, new_divisor = Numbers.multiply(new_divisor, radix)) {
            done = makeBoolean((!(new_divisor.isFixnum())));
            if ((NIL != done)) {
              final_divisor = divisor;
              final_power_less_one = power_less_one;
            }
          }
          Vectors.set_aref($max_fixnum_base_power$.getDynamicValue(), radix, final_divisor);
          Vectors.set_aref($max_fixnum_power_less_one$.getDynamicValue(), radix, final_power_less_one);
        }
      }
    }
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function($sym2$PRINT_OBJECT_BIGNUM_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function($sym3$PRINT_OBJECT_FIXNUM_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function($sym7$PRINT_OBJECT_FLOAT_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function($sym8$PRINT_OBJECT_CHARACTER_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function($sym14$PRINT_OBJECT_SYMBOL_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function($sym15$PRINT_OBJECT_STRING_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym20$PRINT_OBJECT_CONS_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function($sym25$PRINT_OBJECT_VECTOR_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym27$PRINT_OBJECT_HASH_TABLE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Types.$dtp_function$.getGlobalValue(), Symbols.symbol_function($sym28$PRINT_OBJECT_FUNCTION_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function($sym30$PRINT_OBJECT_GUID_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$37 = makeInteger(37);
  public static final SubLInteger $int1$36 = makeInteger(36);
  public static final SubLSymbol $sym2$PRINT_OBJECT_BIGNUM_METHOD = makeSymbol("PRINT-OBJECT-BIGNUM-METHOD");
  public static final SubLSymbol $sym3$PRINT_OBJECT_FIXNUM_METHOD = makeSymbol("PRINT-OBJECT-FIXNUM-METHOD");
  public static final SubLString $str4$Inf = makeString("Inf");
  public static final SubLString $str5$NaN = makeString("NaN");
  public static final SubLInteger $int6$_2 = makeInteger(-2);
  public static final SubLSymbol $sym7$PRINT_OBJECT_FLOAT_METHOD = makeSymbol("PRINT-OBJECT-FLOAT-METHOD");
  public static final SubLSymbol $sym8$PRINT_OBJECT_CHARACTER_METHOD = makeSymbol("PRINT-OBJECT-CHARACTER-METHOD");
  public static final SubLString $str9$__ = makeString("#:");
  public static final SubLSymbol $kw10$INTERNAL = makeKeyword("INTERNAL");
  public static final SubLSymbol $kw11$CAPITALIZE = makeKeyword("CAPITALIZE");
  public static final SubLSymbol $kw12$UPCASE = makeKeyword("UPCASE");
  public static final SubLSymbol $kw13$DOWNCASE = makeKeyword("DOWNCASE");
  public static final SubLSymbol $sym14$PRINT_OBJECT_SYMBOL_METHOD = makeSymbol("PRINT-OBJECT-SYMBOL-METHOD");
  public static final SubLSymbol $sym15$PRINT_OBJECT_STRING_METHOD = makeSymbol("PRINT-OBJECT-STRING-METHOD");
  public static final SubLSymbol $sym16$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $kw17$STREAM = makeKeyword("STREAM");
  public static final SubLString $str18$___ = makeString(" . ");
  public static final SubLString $str19$____ = makeString(" ...");
  public static final SubLSymbol $sym20$PRINT_OBJECT_CONS_METHOD = makeSymbol("PRINT-OBJECT-CONS-METHOD");
  public static final SubLString $str21$___ = makeString("...");
  public static final SubLString $str22$__ = makeString("#<");
  public static final SubLString $str23$_D = makeString("~D");
  public static final SubLSymbol $kw24$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym25$PRINT_OBJECT_VECTOR_METHOD = makeSymbol("PRINT-OBJECT-VECTOR-METHOD");
  public static final SubLString $str26$TEST__A__D__D = makeString("TEST ~A ~D/~D");
  public static final SubLSymbol $sym27$PRINT_OBJECT_HASH_TABLE_METHOD = makeSymbol("PRINT-OBJECT-HASH-TABLE-METHOD");
  public static final SubLSymbol $sym28$PRINT_OBJECT_FUNCTION_METHOD = makeSymbol("PRINT-OBJECT-FUNCTION-METHOD");
  public static final SubLString $str29$_G = makeString("#G");
  public static final SubLSymbol $sym30$PRINT_OBJECT_GUID_METHOD = makeSymbol("PRINT-OBJECT-GUID-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_print_functions_file();
  }

  public void initializeVariables() {
    init_print_functions_file();
  }

  public void runTopLevelForms() {
    setup_print_functions_file();
  }

}
