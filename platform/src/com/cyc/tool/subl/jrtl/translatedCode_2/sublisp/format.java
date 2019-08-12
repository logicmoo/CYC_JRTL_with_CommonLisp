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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

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

public  final class format extends SubLTranslatedFile {

  //// Constructor

  private format() {}
  public static final SubLFile me = new format();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.format";

  //// Definitions

  @SubL(source = "sublisp/format.lisp", position = 1375) 
  private static SubLSymbol $format_directives$ = null;

  @SubL(source = "sublisp/format.lisp", position = 1426) 
  private static SubLSymbol $matching_brackets$ = null;

  @SubL(source = "sublisp/format.lisp", position = 1476) 
  public static final SubLObject format_directive_p(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Hashtables.gethash(ch, $format_directives$.getDynamicValue(thread), UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 1551) 
  public static final SubLObject matching_bracket(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Hashtables.gethash(ch, $matching_brackets$.getDynamicValue(thread), UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 1624) 
  public static final SubLObject call_format_directive(SubLObject ch, SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject new_args = Functions.funcall(Hashtables.gethash(ch, $format_directives$.getDynamicValue(thread), UNPROVIDED), new SubLObject[] {stream, string, start, end, args, all_args, parameters, at_sign_p, colonp});
        SubLObject new_start = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(new_args, new_start);
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 2449) 
  public static final SubLObject defformat(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject name = NIL;
      SubLObject character = NIL;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
      name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
      character = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
      lambda_list = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return list($sym2$PROGN, list($sym3$DECLAIM, list($sym4$FACCESS, $sym5$PRIVATE, name)), listS($sym6$DEFINE, name, lambda_list, ConsesLow.append(body, NIL)), list($sym7$SETHASH, Characters.char_downcase(character), $sym8$_FORMAT_DIRECTIVES_, list($sym9$FUNCTION, name)), list($sym7$SETHASH, Characters.char_upcase(character), $sym8$_FORMAT_DIRECTIVES_, list($sym9$FUNCTION, name)));
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 2748) 
  public static final SubLObject defformat_bracketed(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject name = NIL;
      SubLObject left = NIL;
      SubLObject right = NIL;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      left = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      right = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      lambda_list = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return list($sym2$PROGN, list($sym3$DECLAIM, list($sym4$FACCESS, $sym5$PRIVATE, name)), listS($sym6$DEFINE, name, lambda_list, ConsesLow.append(body, NIL)), list($sym7$SETHASH, left, $sym8$_FORMAT_DIRECTIVES_, list($sym9$FUNCTION, name)), list($sym7$SETHASH, left, $sym11$_MATCHING_BRACKETS_, right));
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 3017) 
  public static final SubLObject unimplemented_format_directive(SubLObject directive, SubLObject fullyp) {
    if ((fullyp == UNPROVIDED)) {
      fullyp = NIL;
    }
    Errors.error($str12$The__A_format_directive_is_not_ye, directive, fullyp);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 3242) 
  public static final SubLObject check_flags(SubLObject directive, SubLObject at_sign_p, SubLObject at_sign_ok_p, SubLObject colonp, SubLObject colon_ok_p) {
    if (((NIL != at_sign_p)
         && (NIL == at_sign_ok_p))) {
      Errors.error($str13$The____C_format_directive_does_no, directive);
    }
    if (((NIL != colonp)
         && (NIL == colon_ok_p))) {
      Errors.error($str14$The____C_format_directive_does_no, directive);
    }
    if (((NIL != at_sign_p)
         && (NIL != colonp))) {
      Errors.error($str15$The____C_format_directive_does_no, directive);
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 3776) 
  public static final SubLObject format_typep(SubLObject object, SubLObject type) {
    if (type.isCons()) {
      {
        SubLObject pcase_var = type.first();
        if (pcase_var.eql($sym16$OR)) {
          {
            SubLObject cdolist_list_var = type.rest();
            SubLObject distype = NIL;
            for (distype = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), distype = cdolist_list_var.first()) {
              if ((NIL != format_typep(object, distype))) {
                return T;
              }
            }
          }
          return NIL;
        } else if (pcase_var.eql($sym17$INTEGER)) {
          {
            SubLObject datum = type.rest();
            SubLObject current = datum;
            SubLObject start = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list18);
            current = current.rest();
            {
              SubLObject end = (current.isCons() ? ((SubLObject) current.first()) : NIL);
              cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list18);
              current = current.rest();
              if ((NIL == current)) {
                if (((NIL != start)
                     && object.numL(start))) {
                  return NIL;
                }
                if (((NIL != end)
                     && object.numG(end))) {
                  return NIL;
                }
                return T;
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list18);
              }
            }
          }
        } else {
          Errors.error($str19$Unrecognized_type_specifier__S_, type);
        }
      }
    } else if ((type == $sym17$INTEGER)) {
      return Types.integerp(object);
    } else if ((type == $sym20$CHARACTER)) {
      return Types.characterp(object);
    } else if ((type == $sym21$NULL)) {
      return Types.sublisp_null(object);
    } else {
      Errors.error($str19$Unrecognized_type_specifier__S_, type);
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 4551) 
  public static final SubLObject with_format_parameters(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject pattern = NIL;
      SubLObject parameters = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
      pattern = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
      parameters = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        SubLObject vars = NIL;
        SubLObject code = NIL;
        SubLObject tail = Symbols.make_symbol($str23$TAIL);
        SubLObject cdolist_list_var = pattern;
        SubLObject item = NIL;
        for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
          {
            SubLObject datum_1 = item;
            SubLObject current_2 = datum_1;
            SubLObject var = NIL;
            SubLObject init = NIL;
            SubLObject type = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_2, datum_1, $list24);
            var = current_2.first();
            current_2 = current_2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_2, datum_1, $list24);
            init = current_2.first();
            current_2 = current_2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_2, datum_1, $list24);
            type = current_2.first();
            current_2 = current_2.rest();
            if ((NIL == current_2)) {
              vars = cons(var, vars);
              code = cons(list($sym2$PROGN, list($sym25$CSETF, var, list($sym26$CAR, tail)), list($sym27$CPOP, tail), list($sym28$PUNLESS, var, list($sym25$CSETF, var, init)), list($sym28$PUNLESS, list($sym29$FORMAT_TYPEP, var, list($sym30$QUOTE, type)), list($sym31$ERROR, $str32$The__S_parameter__S_is_not_of_typ, $list33, var, list($sym30$QUOTE, type)))), code);
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_1, $list24);
            }
          }
        }
        return listS($sym34$CLET, reader.bq_cons(list(tail, parameters), ConsesLow.append(vars, NIL)), ConsesLow.append(Sequences.nreverse(code), reader.bq_cons(listS($sym35$PWHEN, tail, $list36), ConsesLow.append(body, NIL))));
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 5218) 
  public static final SubLObject illegal_directive(SubLObject string, SubLObject index) {
    Errors.error($str37$Stray____C_directive_in__S_string, Strings.sublisp_char(string, Numbers.subtract(index, ONE_INTEGER)), $sym38$FORMAT, string);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 5407) 
  public static final SubLObject bad_format_directive(SubLObject string, SubLObject index) {
    Errors.error($str39$_S_is_not_a_recognized__S_control, Strings.sublisp_char(string, index), $sym38$FORMAT);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 5540) 
  public static final SubLObject not_enough_format_arguments(SubLObject directive) {
    Errors.error($str40$_S_directive__S_ran_out_of_argume, $sym38$FORMAT, directive);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 5670) 
  public static final SubLObject matching_bracket_not_found(SubLObject left, SubLObject right, SubLObject string) {
    Errors.error($str41$No_matching__S_found_for__S_in__S, right, left, string);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 5804) 
  public static final SubLObject not_a_list_argument(SubLObject directive) {
    Errors.error($str42$The__S__S_directive_takes_a_list_, directive, $sym38$FORMAT);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 5937) 
  public static final SubLObject not_a_format_control(SubLObject thing) {
    Errors.error($str43$_S_is_not_a_valid__S_control_, thing, $sym38$FORMAT);
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 6044) 
  public static final SubLObject repitition_designator_value(SubLObject count) {
    if ((NIL == count)) {
      return ONE_INTEGER;
    } else if ((count.isInteger()
         && (!(count.isNegative())))) {
      return count;
    } else {
      Errors.error($str44$_S_is_not_a_valid__S_repitition_s, count, $sym38$FORMAT);
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 6319) 
  public static final SubLObject format_repeat(SubLObject stream, SubLObject ch, SubLObject count) {
    {
      SubLObject cdotimes_end_var = repitition_designator_value(count);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
        streams_high.write_char(ch, stream);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 6453) 
  public static final SubLObject format_padded(SubLObject stream, SubLObject string, SubLObject pad_left_p, SubLObject mincol, SubLObject colinc, SubLObject minpad, SubLObject padchar) {
    {
      SubLObject length = Numbers.add(Sequences.length(string), minpad);
      SubLObject padding = Numbers.add(minpad, (length.numL(mincol) ? ((SubLObject) Numbers.multiply(Numbers.ceiling(Numbers.subtract(mincol, length), colinc), colinc)) : ZERO_INTEGER));
      if ((NIL != pad_left_p)) {
        format_repeat(stream, padchar, padding);
      }
      streams_high.write_string(string, stream, UNPROVIDED, UNPROVIDED);
      if ((NIL == pad_left_p)) {
        format_repeat(stream, padchar, padding);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 6875) 
  public static final SubLObject format_c_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tail = parameters;
        if ((NIL != tail)) {
          Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
        }
        {
          SubLObject arg = args.first();
          checkType(arg, $sym46$CHARACTERP);
          if ((NIL != colonp)) {
            streams_high.write_string(character_names.character_names(arg).first(), stream, UNPROVIDED, UNPROVIDED);
          } else if ((NIL != at_sign_p)) {
            {
              SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
              try {
                print_high.$print_escape$.bind(T, thread);
                streams_high.write_string($str47$__, stream, UNPROVIDED, UNPROVIDED);
                streams_high.write_string(character_names.character_names(arg).first(), stream, UNPROVIDED, UNPROVIDED);
              } finally {
                print_high.$print_escape$.rebind(_prev_bind_0, thread);
              }
            }
          } else {
            streams_high.write_char(arg, stream);
          }
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 7557) 
  public static final SubLObject format_percent_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_percent, at_sign_p, NIL, colonp, NIL);
    {
      SubLObject tail = parameters;
      SubLObject n = NIL;
      n = tail.first();
      tail = tail.rest();
      if ((NIL == n)) {
        n = NIL;
      }
      if ((NIL == format_typep(n, $list49))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, n, $list49);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      {
        SubLObject cdotimes_end_var = repitition_designator_value(n);
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
          streams_high.terpri(stream);
        }
      }
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 7961) 
  public static final SubLObject format_ampersand_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_ampersand, at_sign_p, NIL, colonp, NIL);
    {
      SubLObject tail = parameters;
      SubLObject n = NIL;
      n = tail.first();
      tail = tail.rest();
      if ((NIL == n)) {
        n = NIL;
      }
      if ((NIL == format_typep(n, $list49))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, n, $list49);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      {
        SubLObject repeat = repitition_designator_value(n);
        if (repeat.isPositive()) {
          streams_high.fresh_line(stream);
          {
            SubLObject cdotimes_end_var = Numbers.subtract(repeat, ONE_INTEGER);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
              streams_high.terpri(stream);
            }
          }
        }
      }
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 8472) 
  public static final SubLObject format_vertical_bar_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_vertical, at_sign_p, NIL, colonp, NIL);
    {
      SubLObject tail = parameters;
      SubLObject n = NIL;
      n = tail.first();
      tail = tail.rest();
      if ((NIL == n)) {
        n = NIL;
      }
      if ((NIL == format_typep(n, $list49))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, n, $list49);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      format_repeat(stream, Characters.CHAR_page, n);
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 8846) 
  public static final SubLObject format_tilde_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_tilde, at_sign_p, NIL, colonp, NIL);
    {
      SubLObject tail = parameters;
      SubLObject n = NIL;
      n = tail.first();
      tail = tail.rest();
      if ((NIL == n)) {
        n = NIL;
      }
      if ((NIL == format_typep(n, $list49))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, n, $list49);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      format_repeat(stream, Characters.CHAR_tilde, n);
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 9204) 
  public static final SubLObject format_integer_internal(SubLObject stream, SubLObject integer) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject quotient = Numbers.truncate(integer, print_high.$print_base$.getDynamicValue(thread));
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((!(quotient.isZero()))) {
          format_integer_internal(stream, quotient);
        }
        streams_high.write_char(Characters.digit_char(Numbers.abs(remainder)), stream);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 9556) 
  public static final SubLObject format_integer(SubLObject stream, SubLObject integer, SubLObject radix, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
        SubLObject _prev_bind_1 = print_high.$print_radix$.currentBinding(thread);
        SubLObject _prev_bind_2 = print_high.$print_base$.currentBinding(thread);
        SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        try {
          print_high.$print_escape$.bind(NIL, thread);
          print_high.$print_radix$.bind(NIL, thread);
          print_high.$print_base$.bind(radix, thread);
          print_high.$print_readably$.bind(NIL, thread);
          if (((NIL != parameters)
              || (NIL != colonp))) {
            {
              SubLObject tail = parameters;
              SubLObject comma_interval = NIL;
              SubLObject commachar = NIL;
              SubLObject padchar = NIL;
              SubLObject mincol = NIL;
              mincol = tail.first();
              tail = tail.rest();
              if ((NIL == mincol)) {
                mincol = ZERO_INTEGER;
              }
              if ((NIL == format_typep(mincol, $list54))) {
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, mincol, $list54);
              }
              padchar = tail.first();
              tail = tail.rest();
              if ((NIL == padchar)) {
                padchar = Characters.CHAR_space;
              }
              if ((NIL == format_typep(padchar, $sym20$CHARACTER))) {
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, padchar, $sym20$CHARACTER);
              }
              commachar = tail.first();
              tail = tail.rest();
              if ((NIL == commachar)) {
                commachar = Characters.CHAR_comma;
              }
              if ((NIL == format_typep(commachar, $sym20$CHARACTER))) {
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, commachar, $sym20$CHARACTER);
              }
              comma_interval = tail.first();
              tail = tail.rest();
              if ((NIL == comma_interval)) {
                comma_interval = THREE_INTEGER;
              }
              if ((NIL == format_typep(comma_interval, $list55))) {
                Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, comma_interval, $list55);
              }
              if ((NIL != tail)) {
                Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
              }
              if (integer.isInteger()) {
                {
                  SubLObject output = NIL;
                  SubLObject temp_stream = NIL;
                  try {
                    temp_stream = streams_high.make_private_string_output_stream();
                    format_integer_internal(temp_stream, integer);
                    output = streams_high.get_output_stream_string(temp_stream);
                  } finally {
                    {
                      SubLObject _prev_bind_0_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                      try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        streams_high.close(temp_stream, UNPROVIDED);
                      } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                      }
                    }
                  }
                  if ((NIL != colonp)) {
                    {
                      SubLObject length = Sequences.length(output);
                      thread.resetMultipleValues();
                      {
                        SubLObject segments = Numbers.truncate(length, comma_interval);
                        SubLObject extras = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                          SubLObject new_output = Strings.make_string(Numbers.add(length, (extras.isZero() ? ((SubLObject) Numbers.subtract(segments, ONE_INTEGER)) : segments)), UNPROVIDED);
                          Sequences.replace(new_output, output, ZERO_INTEGER, extras, ZERO_INTEGER, UNPROVIDED);
                          {
                            SubLObject idx = extras;
                            SubLObject new_idx = extras;
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(segments); i = Numbers.add(i, ONE_INTEGER)) {
                              if ((!(new_idx.isZero()))) {
                                Strings.set_char(new_output, new_idx, commachar);
                                new_idx = Numbers.add(new_idx, ONE_INTEGER);
                              }
                              Sequences.replace(new_output, output, new_idx, Numbers.add(new_idx, comma_interval), idx, UNPROVIDED);
                              idx = Numbers.add(idx, comma_interval);
                              new_idx = Numbers.add(new_idx, comma_interval);
                            }
                          }
                          output = new_output;
                        }
                      }
                    }
                  }
                  if (integer.isNegative()) {
                    output = Sequences.cconcatenate($str56$_, output);
                  } else if ((NIL != at_sign_p)) {
                    output = Sequences.cconcatenate($str57$_, output);
                  }
                  format_padded(stream, output, T, mincol, ONE_INTEGER, ZERO_INTEGER, padchar);
                }
              } else {
                format_padded(stream, PrintLow.write_to_string(integer, EMPTY_SUBL_OBJECT_ARRAY), T, mincol, ONE_INTEGER, ZERO_INTEGER, padchar);
              }
            }
          } else {
            if (integer.isNegative()) {
              streams_high.write_char(Characters.CHAR_hyphen, stream);
            } else if ((NIL != at_sign_p)) {
              streams_high.write_char(Characters.CHAR_plus, stream);
            }
            format_integer_internal(stream, integer);
          }
        } finally {
          print_high.$print_readably$.rebind(_prev_bind_3, thread);
          print_high.$print_base$.rebind(_prev_bind_2, thread);
          print_high.$print_radix$.rebind(_prev_bind_1, thread);
          print_high.$print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 11767) 
  public static final SubLObject integer_truncate(SubLObject numerator, SubLObject denominator) {
    checkType(numerator, $sym58$INTEGERP);
    checkType(denominator, $sym58$INTEGERP);
    {
      SubLObject result = Numbers.integerDivide(numerator, denominator);
      SubLObject remainder = Numbers.subtract(numerator, Numbers.multiply(result, denominator));
      return Values.values(result, remainder);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 12158) 
  public static final SubLObject format_cardinal_internal(SubLObject stream, SubLObject integer, SubLObject group, SubLObject more) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject groups = $ic59;
        SubLObject length = Sequences.length(groups);
        if (integer.isZero()) {
          return NIL;
        } else if (group.numGE(length)) {
          thread.resetMultipleValues();
          {
            SubLObject zillions = integer_truncate(integer, Numbers.expt(TEN_INTEGER, Numbers.multiply(length, THREE_INTEGER)));
            SubLObject remainder = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (zillions.isPositive()) {
              format_cardinal_internal(stream, zillions, Numbers.add(group, length), makeBoolean(((NIL != more)
                    || remainder.isPositive())));
              if (remainder.isPositive()) {
                streams_high.write_char(Characters.CHAR_space, stream);
              }
            }
            if (remainder.isPositive()) {
              format_cardinal(stream, remainder);
              streams_high.write_string($str60$_times_ten_to_the_, stream, UNPROVIDED, UNPROVIDED);
              format_ordinal(stream, Numbers.multiply(group, THREE_INTEGER));
              streams_high.write_string($str61$_power, stream, UNPROVIDED, UNPROVIDED);
              if ((NIL != more)) {
                streams_high.write_string($str62$_plus, stream, UNPROVIDED, UNPROVIDED);
              }
            }
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject thousands = Numbers.truncate(integer, $int63$1000);
            SubLObject L1000 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (thousands.isPositive()) {
              format_cardinal_internal(stream, thousands, Numbers.add(group, ONE_INTEGER), makeBoolean(((NIL != more)
                    || L1000.isPositive())));
              if (L1000.isPositive()) {
                streams_high.write_char(Characters.CHAR_space, stream);
              }
            }
            if (L1000.isPositive()) {
              thread.resetMultipleValues();
              {
                SubLObject hundreds = Numbers.truncate(L1000, $int64$100);
                SubLObject L100 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                  SubLObject tens = Numbers.truncate(L100, TEN_INTEGER);
                  SubLObject L10 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if (hundreds.isPositive()) {
                    streams_high.write_string(Vectors.aref($ic65, hundreds), stream, UNPROVIDED, UNPROVIDED);
                    streams_high.write_string($str66$_hundred, stream, UNPROVIDED, UNPROVIDED);
                  }
                  if (tens.numE(ONE_INTEGER)) {
                    if (hundreds.isPositive()) {
                      streams_high.write_char(Characters.CHAR_space, stream);
                    }
                    streams_high.write_string(Vectors.aref($ic67, L10), stream, UNPROVIDED, UNPROVIDED);
                  } else {
                    if (tens.isPositive()) {
                      if (hundreds.isPositive()) {
                        streams_high.write_char(Characters.CHAR_space, stream);
                      }
                      streams_high.write_string(Vectors.aref($ic68, tens), stream, UNPROVIDED, UNPROVIDED);
                    }
                    if (L10.isPositive()) {
                      if (tens.isPositive()) {
                        streams_high.write_char(Characters.CHAR_hyphen, stream);
                      } else if (hundreds.isPositive()) {
                        streams_high.write_char(Characters.CHAR_space, stream);
                      }
                      streams_high.write_string(Vectors.aref($ic69, L10), stream, UNPROVIDED, UNPROVIDED);
                    }
                  }
                }
              }
              streams_high.write_string(Vectors.aref(groups, group), stream, UNPROVIDED, UNPROVIDED);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 14685) 
  public static final SubLObject format_cardinal(SubLObject stream, SubLObject integer) {
    checkType(integer, $sym58$INTEGERP);
    if (integer.isZero()) {
      streams_high.write_string($str70$zero, stream, UNPROVIDED, UNPROVIDED);
    } else if (integer.isNegative()) {
      streams_high.write_string($str71$minus_, stream, UNPROVIDED, UNPROVIDED);
      format_cardinal(stream, Numbers.minus(integer));
    } else {
      format_cardinal_internal(stream, integer, ZERO_INTEGER, NIL);
    }
    return NIL;
  }

  @SubL(source = "sublisp/format.lisp", position = 15001) 
  public static final SubLObject format_ordinal(SubLObject stream, SubLObject integer) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(integer, $sym58$INTEGERP);
      if (integer.isZero()) {
        streams_high.write_string($str72$zeroth, stream, UNPROVIDED, UNPROVIDED);
      } else if (integer.isNegative()) {
        streams_high.write_string($str71$minus_, stream, UNPROVIDED, UNPROVIDED);
        format_ordinal(stream, Numbers.minus(integer));
      } else {
        thread.resetMultipleValues();
        {
          SubLObject hundreds = Numbers.truncate(integer, $int64$100);
          SubLObject remainder = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((!(hundreds.isZero()))) {
            format_cardinal(stream, Numbers.subtract(integer, remainder));
          }
          if (remainder.isPositive()) {
            thread.resetMultipleValues();
            {
              SubLObject tens = Numbers.truncate(remainder, TEN_INTEGER);
              SubLObject zeros = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if (hundreds.isPositive()) {
                streams_high.write_char(Characters.CHAR_space, stream);
              }
              if (zeros.isZero()) {
                streams_high.write_string(Vectors.aref($ic73, tens), stream, UNPROVIDED, UNPROVIDED);
              } else if (tens.numE(ONE_INTEGER)) {
                streams_high.write_string(Vectors.aref($ic74, zeros), stream, UNPROVIDED, UNPROVIDED);
              } else {
                if (tens.isPositive()) {
                  format_cardinal(stream, Numbers.subtract(remainder, zeros));
                  streams_high.write_char(Characters.CHAR_hyphen, stream);
                }
                streams_high.write_string(Vectors.aref($ic75, zeros), stream, UNPROVIDED, UNPROVIDED);
              }
            }
          } else {
            streams_high.write_string($str76$th, stream, UNPROVIDED, UNPROVIDED);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 16256) 
  public static final SubLObject format_r_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != parameters)) {
        {
          SubLObject radix = parameters.first();
          if ((!((radix.isInteger()
                 && radix.numGE(TWO_INTEGER)
                 && radix.numLE($int77$36))))) {
            Errors.error($str78$_S_is_not_a_valid_radix_, radix);
          }
          format_integer(stream, args.first(), radix, parameters.rest(), at_sign_p, colonp);
        }
      } else {
        {
          SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
          try {
            print_high.$print_base$.bind(TEN_INTEGER, thread);
            {
              SubLObject arg = args.first();
              checkType(arg, $sym58$INTEGERP);
              if (((NIL != at_sign_p)
                   && (NIL != colonp))) {
                if (arg.isPositive()) {
                  {
                    SubLObject chars = NIL;
                    SubLObject vals = NIL;
                    for (chars = $list79, vals = $list80; (!(arg.isZero())); chars = chars.rest(), vals = vals.rest()) {
                      format_repeat(stream, chars.first(), Numbers.truncate(arg, vals.first()));
                      arg = Numbers.rem(arg, vals.first());
                    }
                  }
                } else {
                  format_integer(stream, arg, TEN_INTEGER, NIL, NIL, NIL);
                }
              } else if ((NIL != at_sign_p)) {
                if (arg.isPositive()) {
                  {
                    SubLObject chars = NIL;
                    SubLObject vals = NIL;
                    SubLObject sub_vals = NIL;
                    SubLObject sub_chars = NIL;
                    for (chars = $list79, vals = $list80, sub_vals = $list81, sub_chars = $list82; (!(arg.isZero())); chars = chars.rest(), vals = vals.rest(), sub_vals = sub_vals.rest(), sub_chars = sub_chars.rest()) {
                      format_repeat(stream, chars.first(), Numbers.integerDivide(arg, vals.first()));
                      arg = Numbers.rem(arg, vals.first());
                      if (((NIL != sub_vals)
                           && arg.numGE(sub_vals.first()))) {
                        streams_high.write_char(sub_chars.first(), stream);
                        streams_high.write_char(chars.first(), stream);
                        arg = Numbers.subtract(arg, sub_vals.first());
                      }
                    }
                  }
                } else {
                  format_integer(stream, arg, TEN_INTEGER, NIL, NIL, NIL);
                }
              } else if ((NIL != colonp)) {
                format_ordinal(stream, arg);
              } else {
                format_cardinal(stream, arg);
              }
            }
          } finally {
            print_high.$print_base$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 18255) 
  public static final SubLObject format_d_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    format_integer(stream, args.first(), TEN_INTEGER, parameters, at_sign_p, colonp);
    return Values.values(args.rest(), start);
  }

  @SubL(source = "sublisp/format.lisp", position = 18525) 
  public static final SubLObject format_b_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    format_integer(stream, args.first(), TWO_INTEGER, parameters, at_sign_p, colonp);
    return Values.values(args.rest(), start);
  }

  @SubL(source = "sublisp/format.lisp", position = 18793) 
  public static final SubLObject format_o_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    format_integer(stream, args.first(), EIGHT_INTEGER, parameters, at_sign_p, colonp);
    return Values.values(args.rest(), start);
  }

  @SubL(source = "sublisp/format.lisp", position = 19060) 
  public static final SubLObject format_x_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    format_integer(stream, args.first(), SIXTEEN_INTEGER, parameters, at_sign_p, colonp);
    return Values.values(args.rest(), start);
  }

  @SubL(source = "sublisp/format.lisp", position = 19334) 
  public static final SubLObject split_flonum_digits(SubLObject flonum, SubLObject scale) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject digits = math_utilities.flonum_digit_list(flonum);
        SubLObject real_scale = thread.secondMultipleValue();
        thread.resetMultipleValues();
        scale = Numbers.add(scale, real_scale);
        {
          SubLObject left = NIL;
          SubLObject right = NIL;
          if (scale.isPositive()) {
            {
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(scale); i = Numbers.add(i, ONE_INTEGER)) {
                {
                  SubLObject digit = digits.first();
                  if ((NIL != digit)) {
                    left = cons(digit, left);
                    digits = digits.rest();
                  } else {
                    left = cons(ZERO_INTEGER, left);
                  }
                }
              }
            }
            left = Sequences.nreverse(left);
            right = digits;
          } else {
            {
              SubLObject cdotimes_end_var = Numbers.minus(scale);
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
                right = cons(ZERO_INTEGER, right);
              }
            }
            right = ConsesLow.nconc(right, digits);
          }
          return Values.values(left, right);
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 20225) 
  public static final SubLObject round_digits(SubLObject digits, SubLObject places) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (places.isZero()) {
        return Values.values(NIL, makeBoolean(((NIL != digits)
                 && digits.first().numGE(FIVE_INTEGER))));
      } else {
        thread.resetMultipleValues();
        {
          SubLObject new_digits = round_digits(digits.rest(), Numbers.subtract(places, ONE_INTEGER));
          SubLObject carry = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject digit = digits.first();
            if ((NIL == digits)) {
              digit = ZERO_INTEGER;
            }
            if ((NIL != carry)) {
              if (digit.numE(NINE_INTEGER)) {
                return Values.values(cons(ZERO_INTEGER, new_digits), T);
              } else {
                return Values.values(cons(Numbers.add(digit, ONE_INTEGER), new_digits), NIL);
              }
            } else {
              return Values.values(cons(digit, new_digits), NIL);
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 20705) 
  public static final SubLObject digits_add_1_int(SubLObject digits) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject digit = digits.first();
        if ((NIL == digits)) {
          return Values.values(NIL, NIL);
        } else if ((NIL == digits.rest())) {
          if ((NINE_INTEGER == digit)) {
            return Values.values(list(ZERO_INTEGER), T);
          } else {
            return Values.values(list(Numbers.add(ONE_INTEGER, digit)), NIL);
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject new_rest_digits = digits_add_1_int(digits.rest());
            SubLObject carry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != carry)) {
              if (digit.numE(NINE_INTEGER)) {
                return Values.values(cons(ZERO_INTEGER, new_rest_digits), T);
              } else {
                return Values.values(cons(Numbers.add(ONE_INTEGER, digit), new_rest_digits), NIL);
              }
            } else {
              return Values.values(cons(digit, new_rest_digits), NIL);
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 21257) 
  public static final SubLObject digits_add_1(SubLObject digits) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject new_digits = digits_add_1_int(digits);
        SubLObject carry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != carry)) {
          return cons(ONE_INTEGER, new_digits);
        } else {
          return new_digits;
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 21428) 
  public static final SubLObject round_decimal_digits(SubLObject left, SubLObject right, SubLObject places) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == places)) {
        places = ZERO_INTEGER;
      }
      {
        SubLObject rounded_left = NIL;
        thread.resetMultipleValues();
        {
          SubLObject rounded_right = round_digits(right, places);
          SubLObject carry = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != carry)) {
            rounded_left = digits_add_1(left);
          } else {
            rounded_left = left;
          }
          return Values.values(rounded_left, rounded_right);
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 21758) 
  public static final SubLObject format_f_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      check_flags(Characters.CHAR_F, at_sign_p, T, colonp, NIL);
      {
        SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
        SubLObject _prev_bind_1 = print_high.$print_readably$.currentBinding(thread);
        try {
          print_high.$print_escape$.bind(NIL, thread);
          print_high.$print_readably$.bind(NIL, thread);
          {
            SubLObject arg = args.first();
            SubLObject tail = parameters;
            SubLObject padchar = NIL;
            SubLObject overflowchar = NIL;
            SubLObject k = NIL;
            SubLObject d = NIL;
            SubLObject w = NIL;
            w = tail.first();
            tail = tail.rest();
            if ((NIL == w)) {
              w = NIL;
            }
            if ((NIL == format_typep(w, $list49))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, w, $list49);
            }
            d = tail.first();
            tail = tail.rest();
            if ((NIL == d)) {
              d = NIL;
            }
            if ((NIL == format_typep(d, $list49))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, d, $list49);
            }
            k = tail.first();
            tail = tail.rest();
            if ((NIL == k)) {
              k = ZERO_INTEGER;
            }
            if ((NIL == format_typep(k, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, k, $sym17$INTEGER);
            }
            overflowchar = tail.first();
            tail = tail.rest();
            if ((NIL == overflowchar)) {
              overflowchar = NIL;
            }
            if ((NIL == format_typep(overflowchar, $list88))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, overflowchar, $list88);
            }
            padchar = tail.first();
            tail = tail.rest();
            if ((NIL == padchar)) {
              padchar = Characters.CHAR_space;
            }
            if ((NIL == format_typep(padchar, $sym20$CHARACTER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, padchar, $sym20$CHARACTER);
            }
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((arg.isInteger()
                || arg.isDouble())) {
              thread.resetMultipleValues();
              {
                SubLObject left = split_flonum_digits(Numbers.sublisp_float(arg, UNPROVIDED), k);
                SubLObject right = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject left_size = NIL;
                  SubLObject right_size = NIL;
                  SubLObject padding = NIL;
                  if ((NIL != left)) {
                    left_size = Sequences.length(left);
                  } else if (((NIL == left)
                       && (NIL != w)
                       && (NIL != d)
                       && w.numE(Numbers.add(d, ONE_INTEGER)))) {
                    left_size = ZERO_INTEGER;
                  } else if (((NIL == left)
                       && (NIL == d))) {
                    left_size = ZERO_INTEGER;
                  } else {
                    left_size = ONE_INTEGER;
                  }
                  {
                    SubLObject except_for_right_size = Numbers.add(((arg.isNegative()
                          || (NIL != at_sign_p)) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER), left_size, ONE_INTEGER);
                    if ((NIL != d)) {
                      right_size = d;
                    } else if ((NIL != w)) {
                      {
                        SubLObject remaining = Numbers.subtract(w, except_for_right_size);
                        if (remaining.isPositive()) {
                          right_size = Numbers.max(Numbers.min(remaining, Sequences.length(right)), ONE_INTEGER);
                        } else {
                          right_size = ZERO_INTEGER;
                        }
                      }
                    } else {
                      right_size = Numbers.max(Sequences.length(right), ONE_INTEGER);
                    }
                    padding = ((NIL != w) ? ((SubLObject) Numbers.subtract(w, Numbers.add(except_for_right_size, right_size))) : ZERO_INTEGER);
                  }
                  if ((right_size != Sequences.length(right))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject new_left = round_decimal_digits(left, right, right_size);
                      SubLObject new_right = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if (Sequences.length(new_left).numG(Sequences.length(left))) {
                        if (padding.numG(ZERO_INTEGER)) {
                          padding = Numbers.subtract(padding, ONE_INTEGER);
                        } else {
                          if ((NIL == d)) {
                            right_size = Numbers.subtract(right_size, ONE_INTEGER);
                          }
                        }
                      }
                      left = new_left;
                      right = new_right;
                    }
                  }
                  if ((NIL == d)) {
                    {
                      SubLObject index = right_size;
                      SubLObject doneP = NIL;
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = right;
                          SubLObject dummy = NIL;
                          for (dummy = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), dummy = csome_list_var.first()) {
                            index = Numbers.subtract(index, ONE_INTEGER);
                            if ((index == ZERO_INTEGER)) {
                              doneP = T;
                            } else {
                              if ((ConsesLow.nth(index, right) == ZERO_INTEGER)) {
                                padding = Numbers.add(padding, ONE_INTEGER);
                                right_size = Numbers.subtract(right_size, ONE_INTEGER);
                              } else {
                                doneP = T;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((padding.isNegative()
                       && (NIL != overflowchar))) {
                    format_repeat(stream, overflowchar, w);
                  } else {
                    if ((!(padding.isNegative()))) {
                      format_repeat(stream, padchar, padding);
                    }
                    if (arg.isNegative()) {
                      streams_high.write_char(Characters.CHAR_hyphen, stream);
                    } else {
                      if ((NIL != at_sign_p)) {
                        streams_high.write_char(Characters.CHAR_plus, stream);
                      }
                    }
                    if ((NIL != left)) {
                      {
                        SubLObject cdolist_list_var = left;
                        SubLObject digit = NIL;
                        for (digit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), digit = cdolist_list_var.first()) {
                          streams_high.write_char(Characters.digit_char(digit), stream);
                        }
                      }
                    } else if (left_size.isPositive()) {
                      streams_high.write_char(Characters.CHAR_0, stream);
                    }
                    streams_high.write_char(Characters.CHAR_period, stream);
                    {
                      SubLObject count = ZERO_INTEGER;
                      SubLObject doneP = NIL;
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = right;
                          SubLObject digit = NIL;
                          for (digit = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), digit = csome_list_var.first()) {
                            count = Numbers.add(count, ONE_INTEGER);
                            if (count.numGE(right_size)) {
                              doneP = T;
                            }
                            streams_high.write_char(Characters.digit_char(digit), stream);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              format_integer(stream, arg, TEN_INTEGER, list(w), at_sign_p, NIL);
            }
          }
        } finally {
          print_high.$print_readably$.rebind(_prev_bind_1, thread);
          print_high.$print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 25072) 
  public static final SubLObject format_e_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    unimplemented_format_directive(Characters.CHAR_E, UNPROVIDED);
    return Values.values(args.rest(), start);
  }

  @SubL(source = "sublisp/format.lisp", position = 26207) 
  public static final SubLObject format_g_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    unimplemented_format_directive(Characters.CHAR_G, UNPROVIDED);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 26507) 
  public static final SubLObject format_dollarsign_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    unimplemented_format_directive(Characters.CHAR_dollar, UNPROVIDED);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 26826) 
  public static final SubLObject format_a_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
        SubLObject _prev_bind_1 = print_high.$print_readably$.currentBinding(thread);
        try {
          print_high.$print_escape$.bind(NIL, thread);
          print_high.$print_readably$.bind(NIL, thread);
          {
            SubLObject arg = args.first();
            if (((NIL != colonp)
                 && (NIL == arg))) {
              arg = $str93$__;
            }
            if ((NIL != parameters)) {
              {
                SubLObject tail = parameters;
                SubLObject padchar = NIL;
                SubLObject minpad = NIL;
                SubLObject colinc = NIL;
                SubLObject mincol = NIL;
                mincol = tail.first();
                tail = tail.rest();
                if ((NIL == mincol)) {
                  mincol = ZERO_INTEGER;
                }
                if ((NIL == format_typep(mincol, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, mincol, $list54);
                }
                colinc = tail.first();
                tail = tail.rest();
                if ((NIL == colinc)) {
                  colinc = ONE_INTEGER;
                }
                if ((NIL == format_typep(colinc, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, colinc, $list54);
                }
                minpad = tail.first();
                tail = tail.rest();
                if ((NIL == minpad)) {
                  minpad = ZERO_INTEGER;
                }
                if ((NIL == format_typep(minpad, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, minpad, $list54);
                }
                padchar = tail.first();
                tail = tail.rest();
                if ((NIL == padchar)) {
                  padchar = Characters.CHAR_space;
                }
                if ((NIL == format_typep(padchar, $sym20$CHARACTER))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, padchar, $sym20$CHARACTER);
                }
                if ((NIL != tail)) {
                  Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
                }
                Functions.funcall(Symbols.symbol_function($sym94$FORMAT_PADDED), new SubLObject[] {stream, PrintLow.write_to_string(arg, EMPTY_SUBL_OBJECT_ARRAY), at_sign_p, mincol, colinc, minpad, padchar});
              }
            } else {
              print_high.princ(arg, stream);
            }
          }
        } finally {
          print_high.$print_readably$.rebind(_prev_bind_1, thread);
          print_high.$print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 27591) 
  public static final SubLObject format_s_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
        try {
          print_high.$print_escape$.bind(T, thread);
          {
            SubLObject arg = args.first();
            if (((NIL != colonp)
                 && (NIL == arg))) {
              arg = $str93$__;
            }
            if ((NIL != parameters)) {
              {
                SubLObject tail = parameters;
                SubLObject padchar = NIL;
                SubLObject minpad = NIL;
                SubLObject colinc = NIL;
                SubLObject mincol = NIL;
                mincol = tail.first();
                tail = tail.rest();
                if ((NIL == mincol)) {
                  mincol = ZERO_INTEGER;
                }
                if ((NIL == format_typep(mincol, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, mincol, $list54);
                }
                colinc = tail.first();
                tail = tail.rest();
                if ((NIL == colinc)) {
                  colinc = ONE_INTEGER;
                }
                if ((NIL == format_typep(colinc, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, colinc, $list54);
                }
                minpad = tail.first();
                tail = tail.rest();
                if ((NIL == minpad)) {
                  minpad = ZERO_INTEGER;
                }
                if ((NIL == format_typep(minpad, $list54))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, minpad, $list54);
                }
                padchar = tail.first();
                tail = tail.rest();
                if ((NIL == padchar)) {
                  padchar = Characters.CHAR_space;
                }
                if ((NIL == format_typep(padchar, $sym20$CHARACTER))) {
                  Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, padchar, $sym20$CHARACTER);
                }
                if ((NIL != tail)) {
                  Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
                }
                Functions.funcall(Symbols.symbol_function($sym94$FORMAT_PADDED), new SubLObject[] {stream, PrintLow.write_to_string(arg, EMPTY_SUBL_OBJECT_ARRAY), at_sign_p, mincol, colinc, minpad, padchar});
              }
            } else {
              print_high.prin1(arg, stream);
            }
          }
        } finally {
          print_high.$print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 28282) 
  public static final SubLObject format_w_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tail = parameters;
        if ((NIL != tail)) {
          Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
        }
        {
          SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
          SubLObject _prev_bind_1 = print_high.$print_level$.currentBinding(thread);
          SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
          try {
            print_high.$print_pretty$.bind(((NIL != colonp) ? ((SubLObject) T) : print_high.$print_pretty$.getDynamicValue(thread)), thread);
            print_high.$print_level$.bind(((NIL != at_sign_p) ? ((SubLObject) NIL) : print_high.$print_level$.getDynamicValue(thread)), thread);
            print_high.$print_length$.bind(((NIL != at_sign_p) ? ((SubLObject) NIL) : print_high.$print_length$.getDynamicValue(thread)), thread);
            PrintLow.write(args.first(), new SubLObject[] {$kw97$STREAM, stream});
          } finally {
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_level$.rebind(_prev_bind_1, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return Values.values(args.rest(), start);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 28738) 
  public static final SubLObject format_underscore_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    unimplemented_format_directive(Characters.CHAR_underbar, UNPROVIDED);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 29427) 
  public static final SubLObject format_i_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      SubLObject tail = parameters;
      SubLObject n = NIL;
      n = tail.first();
      tail = tail.rest();
      if ((NIL == n)) {
        n = ZERO_INTEGER;
      }
      if ((NIL == format_typep(n, $list54))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, n, $list54);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      check_flags(Characters.CHAR_I, at_sign_p, NIL, colonp, T);
      unimplemented_format_directive(Characters.CHAR_I, UNPROVIDED);
    }
    return Values.values(args, end);
  }

  @SubL(source = "sublisp/format.lisp", position = 29981) 
  public static final SubLObject format_slash_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_slash, at_sign_p, NIL, colonp, T);
    {
      SubLObject slash_idx = Sequences.position(Characters.CHAR_slash, string, Symbols.symbol_function($sym101$CHAR_), Symbols.symbol_function(IDENTITY), start, end);
      if ((NIL == slash_idx)) {
        matching_bracket_not_found(Characters.CHAR_slash, Characters.CHAR_slash, string);
      }
      {
        SubLObject symbol = Packages.intern(Strings.string_upcase(string, start, slash_idx), UNPROVIDED);
        Functions.apply(symbol, stream, new SubLObject[] {args.first(), colonp, at_sign_p, parameters});
      }
      return Values.values(args.rest(), Numbers.add(slash_idx, ONE_INTEGER));
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 30602) 
  public static final SubLObject format_t_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      SubLObject tail = parameters;
      SubLObject colinc = NIL;
      SubLObject colnum = NIL;
      colnum = tail.first();
      tail = tail.rest();
      if ((NIL == colnum)) {
        colnum = ONE_INTEGER;
      }
      if ((NIL == format_typep(colnum, $list54))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, colnum, $list54);
      }
      colinc = tail.first();
      tail = tail.rest();
      if ((NIL == colinc)) {
        colinc = ONE_INTEGER;
      }
      if ((NIL == format_typep(colinc, $list54))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, colinc, $list54);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      if (((NIL != at_sign_p)
           && (NIL != colonp))) {
        unimplemented_format_directive(Characters.CHAR_T, T);
      } else if ((NIL != at_sign_p)) {
        format_repeat(stream, Characters.CHAR_space, colnum);
      } else if ((NIL != colonp)) {
        unimplemented_format_directive(Characters.CHAR_T, T);
      } else {
        {
          SubLObject current = streams_high.stream_line_column(stream);
          if ((NIL == current)) {
            current = ZERO_INTEGER;
          }
          if (current.numL(colnum)) {
            format_repeat(stream, Characters.CHAR_space, Numbers.subtract(colnum, current));
          } else {
            if ((!(colinc.isZero()))) {
              format_repeat(stream, Characters.CHAR_space, Numbers.subtract(colinc, Numbers.mod(Numbers.subtract(current, colnum), colinc)));
            }
          }
        }
      }
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 31818) 
  public static final SubLObject format_less_than_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    unimplemented_format_directive(Characters.CHAR_less, UNPROVIDED);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 32155) 
  public static final SubLObject format_greater_than_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    illegal_directive(string, start);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 32453) 
  public static final SubLObject backup_args(SubLObject args, SubLObject all_args, SubLObject count) {
    {
      SubLObject offset = ZERO_INTEGER;
      SubLObject tail = NIL;
      for (tail = all_args; (tail != args); tail = tail.rest()) {
        offset = Numbers.add(offset, ONE_INTEGER);
      }
      if (count.numG(offset)) {
        not_enough_format_arguments(Characters.CHAR_asterisk);
      }
      return conses_high.nthcdr(Numbers.subtract(offset, count), all_args);
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 33029) 
  public static final SubLObject format_asterisk_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_asterisk, at_sign_p, T, colonp, T);
    {
      SubLObject tail = parameters;
      SubLObject count = NIL;
      count = tail.first();
      tail = tail.rest();
      if ((NIL == count)) {
        count = NIL;
      }
      if ((NIL == format_typep(count, $list49))) {
        Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, count, $list49);
      }
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      if ((NIL != at_sign_p)) {
        if ((NIL == count)) {
          count = ZERO_INTEGER;
        }
        if (count.numG(Sequences.length(all_args))) {
          not_enough_format_arguments(Characters.CHAR_asterisk);
        }
        return Values.values(conses_high.nthcdr(count, all_args), start);
      } else if ((NIL != colonp)) {
        return Values.values(backup_args(args, all_args, ((NIL != count) ? ((SubLObject) count) : ONE_INTEGER)), start);
      } else {
        if ((NIL == count)) {
          count = ONE_INTEGER;
        }
        if (count.numG(Sequences.length(args))) {
          not_enough_format_arguments(Characters.CHAR_asterisk);
        }
        return Values.values(conses_high.nthcdr(count, args), start);
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 33777) 
  public static final SubLObject format_left_bracket_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      check_flags(Characters.CHAR_lbracket, at_sign_p, T, colonp, T);
      thread.resetMultipleValues();
      {
        SubLObject expr_end = find_directive(Characters.CHAR_rbracket, string, start, end);
        SubLObject new_start = thread.secondMultipleValue();
        SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
        SubLObject expr_end_colonp = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == expr_end)) {
          matching_bracket_not_found(Characters.CHAR_lbracket, Characters.CHAR_rbracket, string);
        }
        check_flags(Characters.CHAR_rbracket, expr_end_at_sign_p, NIL, expr_end_colonp, NIL);
        if ((NIL != at_sign_p)) {
          {
            SubLObject tail = parameters;
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((NIL != args.first())) {
              return Values.values(format_internal(stream, string, start, expr_end, args, all_args), new_start);
            } else {
              return Values.values(args.rest(), new_start);
            }
          }
        } else if ((NIL != colonp)) {
          {
            SubLObject tail = parameters;
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            thread.resetMultipleValues();
            {
              SubLObject separator_start = find_directive(Characters.CHAR_semicolon, string, start, expr_end);
              SubLObject separator_end = thread.secondMultipleValue();
              SubLObject separator_at_sign_p = thread.thirdMultipleValue();
              SubLObject separator_colonp = thread.fourthMultipleValue();
              thread.resetMultipleValues();
              if ((NIL == separator_start)) {
                Errors.error($str107$No_clause_marker_found_for__S__S_, Characters.CHAR_lbracket, $sym38$FORMAT);
              }
              check_flags(Characters.CHAR_semicolon, separator_at_sign_p, NIL, separator_colonp, NIL);
              if ((NIL != args.first())) {
                return Values.values(format_internal(stream, string, separator_end, expr_end, args.rest(), all_args), new_start);
              } else {
                return Values.values(format_internal(stream, string, start, separator_start, args.rest(), all_args), new_start);
              }
            }
          }
        } else {
          {
            SubLObject tail = parameters;
            SubLObject index = NIL;
            index = tail.first();
            tail = tail.rest();
            if ((NIL == index)) {
              index = NIL;
            }
            if ((NIL == format_typep(index, $list108))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, index, $list108);
            }
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((NIL == index)) {
              index = args.first();
              args = args.rest();
            }
            checkType(index, $sym58$INTEGERP);
            {
              SubLObject default_start = NIL;
              SubLObject count = ZERO_INTEGER;
              SubLObject donep = NIL;
              SubLObject clause_start = start;
              for (; (!(((NIL != donep)
                    || (NIL != default_start)))); ) {
                thread.resetMultipleValues();
                {
                  SubLObject separator_start = find_directive(Characters.CHAR_semicolon, string, clause_start, expr_end);
                  SubLObject separator_end = thread.secondMultipleValue();
                  SubLObject separator_at_sign_p = thread.thirdMultipleValue();
                  SubLObject separator_colonp = thread.fourthMultipleValue();
                  thread.resetMultipleValues();
                  check_flags(Characters.CHAR_semicolon, separator_at_sign_p, NIL, separator_colonp, T);
                  if (count.numE(index)) {
                    return Values.values(format_internal(stream, string, clause_start, ((NIL != separator_start) ? ((SubLObject) separator_start) : expr_end), args, all_args), new_start);
                  }
                  count = Numbers.add(count, ONE_INTEGER);
                  if ((NIL != separator_start)) {
                    if ((NIL != separator_colonp)) {
                      default_start = separator_end;
                    } else {
                      clause_start = separator_end;
                    }
                  } else {
                    donep = T;
                  }
                }
              }
              if ((NIL != default_start)) {
                return Values.values(format_internal(stream, string, default_start, expr_end, args, all_args), new_start);
              } else {
                return Values.values(args, new_start);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 36945) 
  public static final SubLObject format_right_bracket_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    illegal_directive(string, start);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 37249) 
  private static SubLSymbol $remaining_args$ = null;

  @SubL(source = "sublisp/format.lisp", position = 37410) 
  public static final SubLObject format_sublist_iteration(SubLObject stream, SubLObject format_control, SubLObject start, SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      try {
        {
          SubLObject count = NIL;
          SubLObject sub_args = NIL;
          for (count = ZERO_INTEGER, sub_args = args.first(); (!((((NIL != max)
                   && count.numGE(max))
                || ((NIL == args)
                   && count.numGE(min))))); count = Numbers.add(count, ONE_INTEGER), sub_args = args.first()) {
            if ((!(sub_args.isList()))) {
              not_a_list_argument(Characters.CHAR_lbrace);
            }
            args = args.rest();
            {
              SubLObject _prev_bind_0 = $remaining_args$.currentBinding(thread);
              try {
                $remaining_args$.bind(args, thread);
                {
                  SubLObject dummy = NIL;
                  try {
                    if (format_control.isFunction()) {
                      Functions.apply(format_control, stream, sub_args);
                    } else {
                      format_internal(stream, format_control, start, end, sub_args, sub_args);
                    }
                  } catch (Throwable ccatch_env_var) {
                    dummy = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
                  }
                }
              } finally {
                $remaining_args$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      } catch (Throwable ccatch_env_var) {
        args = Errors.handleThrowable(ccatch_env_var, $sym111$UP_AND_ALL_THE_WAY_OUT);
      }
      return args;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 38028) 
  public static final SubLObject format_iteration(SubLObject stream, SubLObject format_control, SubLObject start, SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
    try {
      {
        SubLObject count = NIL;
        for (count = ZERO_INTEGER; (!((((NIL != max)
                 && count.numGE(max))
              || ((NIL == args)
                 && count.numGE(min))))); count = Numbers.add(count, ONE_INTEGER)) {
          args = (format_control.isFunction() ? ((SubLObject) Functions.apply(format_control, stream, args)) : format_internal(stream, format_control, start, end, args, args));
        }
      }
    } catch (Throwable ccatch_env_var) {
      args = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
    }
    return args;
  }

  @SubL(source = "sublisp/format.lisp", position = 38423) 
  public static final SubLObject format_left_brace_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tail = parameters;
        SubLObject max = NIL;
        max = tail.first();
        tail = tail.rest();
        if ((NIL == max)) {
          max = NIL;
        }
        if ((NIL == format_typep(max, $list49))) {
          Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, max, $list49);
        }
        if ((NIL != tail)) {
          Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
        }
        thread.resetMultipleValues();
        {
          SubLObject expr_end = find_directive(Characters.CHAR_rbrace, string, start, end);
          SubLObject new_start = thread.secondMultipleValue();
          SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
          SubLObject expr_end_colonp = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if ((NIL == expr_end)) {
            matching_bracket_not_found(Characters.CHAR_lbrace, Characters.CHAR_rbrace, string);
          }
          check_flags(Characters.CHAR_lbrace, expr_end_at_sign_p, NIL, expr_end_colonp, T);
          {
            SubLObject min = ((NIL != expr_end_colonp) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER);
            SubLObject format_control = NIL;
            SubLObject format_args = args;
            if (start.numE(expr_end)) {
              format_control = format_args.first();
              format_args = format_args.rest();
              if (format_control.isString()) {
                start = ZERO_INTEGER;
                expr_end = Sequences.length(format_control);
              } else if (format_control.isFunction()) {
              } else {
                not_a_format_control(format_control);
              }
            } else {
              format_control = string;
            }
            if (((NIL != at_sign_p)
                 && (NIL != colonp))) {
              return Values.values(format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args), new_start);
            } else if ((NIL != at_sign_p)) {
              return Values.values(format_iteration(stream, format_control, start, expr_end, min, max, format_args), new_start);
            } else if ((NIL != colonp)) {
              if ((!(format_args.first().isList()))) {
                not_a_list_argument(Characters.CHAR_lbrace);
              }
              format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
              return Values.values(format_args.rest(), new_start);
            } else {
              if ((!(format_args.first().isList()))) {
                not_a_list_argument(Characters.CHAR_lbrace);
              }
              format_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
              return Values.values(format_args.rest(), new_start);
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 40386) 
  public static final SubLObject format_right_brace_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    illegal_directive(string, start);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 40673) 
  public static final SubLObject format_question_mark_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    check_flags(Characters.CHAR_question, at_sign_p, T, colonp, NIL);
    {
      SubLObject tail = parameters;
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      if ((NIL != at_sign_p)) {
        {
          SubLObject string_4 = args.first();
          SubLObject new_args = NIL;
          checkType(string_4, $sym115$STRINGP);
          try {
            new_args = format_internal(stream, string_4, ZERO_INTEGER, Sequences.length(string_4), args.rest(), all_args);
          } catch (Throwable ccatch_env_var) {
            new_args = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
          }
          return Values.values(new_args, start);
        }
      } else {
        {
          SubLObject format_control = args.first();
          SubLObject sub_args = conses_high.cadr(args);
          SubLObject dummy = NIL;
          checkType(sub_args, $sym116$LISTP);
          try {
            if (format_control.isString()) {
              format_internal(stream, format_control, ZERO_INTEGER, Sequences.length(format_control), sub_args, sub_args);
            } else if (format_control.isFunction()) {
              Functions.apply(format_control, stream, sub_args);
            } else {
              not_a_format_control(format_control);
            }
          } catch (Throwable ccatch_env_var) {
            dummy = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
          }
          return Values.values(conses_high.cddr(args), start);
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 41910) 
  public static final SubLObject format_left_paren_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tail = parameters;
        if ((NIL != tail)) {
          Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
        }
        thread.resetMultipleValues();
        {
          SubLObject expr_end = find_directive(Characters.CHAR_rparen, string, start, end);
          SubLObject new_start = thread.secondMultipleValue();
          SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
          SubLObject expr_end_colonp = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if ((NIL == expr_end)) {
            matching_bracket_not_found(Characters.CHAR_lbrace, Characters.CHAR_rbrace, string);
          }
          check_flags(Characters.CHAR_rparen, expr_end_at_sign_p, NIL, expr_end_colonp, NIL);
          {
            SubLObject continue_throw = T;
            SubLObject new_args = NIL;
            SubLObject output = NIL;
            SubLObject string_stream = NIL;
            try {
              string_stream = streams_high.make_private_string_output_stream();
              try {
                new_args = format_internal(string_stream, string, start, expr_end, args, all_args);
                continue_throw = NIL;
              } catch (Throwable ccatch_env_var) {
                new_args = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
              }
              output = streams_high.get_output_stream_string(string_stream);
            } finally {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  streams_high.close(string_stream, UNPROVIDED);
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
              }
            }
            if (((NIL != at_sign_p)
                 && (NIL != colonp))) {
              output = Strings.nstring_upcase(output, UNPROVIDED, UNPROVIDED);
            } else if ((NIL != at_sign_p)) {
              output = Strings.nstring_downcase(output, UNPROVIDED, UNPROVIDED);
              {
                SubLObject length = Sequences.length(output);
                SubLObject done = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; (!(((NIL != done)
                      || i.numE(length)))); i = Numbers.add(i, ONE_INTEGER)) {
                  if ((NIL != Characters.alpha_char_p(Strings.sublisp_char(output, i)))) {
                    Strings.set_char(output, i, Characters.char_upcase(Strings.sublisp_char(output, i)));
                    done = T;
                  }
                }
              }
            } else if ((NIL != colonp)) {
              output = Strings.nstring_capitalize(output, UNPROVIDED, UNPROVIDED);
            } else {
              output = Strings.nstring_downcase(output, UNPROVIDED, UNPROVIDED);
            }
            streams_high.write_string(output, stream, UNPROVIDED, UNPROVIDED);
            if ((NIL != continue_throw)) {
              Dynamic.sublisp_throw($sym112$UP_AND_OUT, new_args);
            } else {
              return Values.values(new_args, new_start);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 43636) 
  public static final SubLObject format_right_paren_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    illegal_directive(string, start);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 43927) 
  public static final SubLObject format_p_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      SubLObject tail = parameters;
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      {
        SubLObject arg = NIL;
        if ((NIL != colonp)) {
          arg = backup_args(args, all_args, ONE_INTEGER).first();
        } else {
          arg = args.first();
          args = args.rest();
        }
        if ((NIL != at_sign_p)) {
          if (arg.eql(ONE_INTEGER)) {
            streams_high.write_char(Characters.CHAR_y, stream);
          } else {
            streams_high.write_string($str120$ies, stream, UNPROVIDED, UNPROVIDED);
          }
        } else {
          if ((!(arg.eql(ONE_INTEGER)))) {
            streams_high.write_char(Characters.CHAR_s, stream);
          }
        }
      }
    }
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 44546) 
  public static final SubLObject format_semicolon_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    illegal_directive(string, start);
    return Values.values(args, start);
  }

  @SubL(source = "sublisp/format.lisp", position = 44890) 
  public static final SubLObject format_circumflex_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      check_flags(Characters.CHAR_caret, at_sign_p, NIL, colonp, T);
      {
        SubLObject pcase_var = Sequences.length(parameters);
        if (pcase_var.eql(ZERO_INTEGER)) {
          if (((NIL != args)
               && (NIL == colonp))) {
            return Values.values(args, start);
          }
        } else if (pcase_var.eql(ONE_INTEGER)) {
          {
            SubLObject tail = parameters;
            SubLObject x = NIL;
            x = tail.first();
            tail = tail.rest();
            if ((NIL == x)) {
              x = NIL;
            }
            if ((NIL == format_typep(x, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, x, $sym17$INTEGER);
            }
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((!(x.isZero()))) {
              return Values.values(args, start);
            }
          }
        } else if (pcase_var.eql(TWO_INTEGER)) {
          {
            SubLObject tail = parameters;
            SubLObject y = NIL;
            SubLObject x = NIL;
            x = tail.first();
            tail = tail.rest();
            if ((NIL == x)) {
              x = NIL;
            }
            if ((NIL == format_typep(x, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, x, $sym17$INTEGER);
            }
            y = tail.first();
            tail = tail.rest();
            if ((NIL == y)) {
              y = NIL;
            }
            if ((NIL == format_typep(y, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, y, $sym17$INTEGER);
            }
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((!(x.numE(y)))) {
              return Values.values(args, start);
            }
          }
        } else if (pcase_var.eql(THREE_INTEGER)) {
          {
            SubLObject tail = parameters;
            SubLObject z = NIL;
            SubLObject y = NIL;
            SubLObject x = NIL;
            x = tail.first();
            tail = tail.rest();
            if ((NIL == x)) {
              x = NIL;
            }
            if ((NIL == format_typep(x, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, x, $sym17$INTEGER);
            }
            y = tail.first();
            tail = tail.rest();
            if ((NIL == y)) {
              y = NIL;
            }
            if ((NIL == format_typep(y, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, y, $sym17$INTEGER);
            }
            z = tail.first();
            tail = tail.rest();
            if ((NIL == z)) {
              z = NIL;
            }
            if ((NIL == format_typep(z, $sym17$INTEGER))) {
              Errors.error($str32$The__S_parameter__S_is_not_of_typ, $sym38$FORMAT, z, $sym17$INTEGER);
            }
            if ((NIL != tail)) {
              Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
            }
            if ((!((x.numLE(y)
                   && y.numLE(z))))) {
              return Values.values(args, start);
            }
          }
        }
      }
      if (((NIL != colonp)
           && (NIL == $remaining_args$.getDynamicValue(thread)))) {
        Dynamic.sublisp_throw($sym111$UP_AND_ALL_THE_WAY_OUT, args);
      } else {
        Dynamic.sublisp_throw($sym112$UP_AND_OUT, args);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 45875) 
  public static final SubLObject format_newline_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
    {
      SubLObject tail = parameters;
      if ((NIL != tail)) {
        Errors.error($str45$Too_many__S_parameters_, $sym38$FORMAT);
      }
      if ((NIL != colonp)) {
        return Values.values(args, start);
      } else {
        if ((NIL != at_sign_p)) {
          streams_high.write_char(Characters.CHAR_newline, stream);
        }
        for (; (!((start.numG(end)
              || (NIL == reader.whitespace_1_char_p(Strings.sublisp_char(string, start)))))); ) {
          start = Numbers.add(start, ONE_INTEGER);
        }
        return Values.values(args, start);
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 46437) 
  public static final SubLObject really_format(SubLObject destination, SubLObject format_control, SubLObject args) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject stream = NIL;
        if (destination.isStream()) {
          stream = destination;
        } else if ((NIL == destination)) {
          stream = streams_high.make_private_string_output_stream();
        } else if ((destination == T)) {
          stream = StreamsLow.$standard_output$.getDynamicValue(thread);
        } else if (destination.isString()) {
          Errors.error($str125$_S_does_not_support_string_destin, $sym38$FORMAT);
        } else {
          Errors.error($str126$_S_is_not_a_valid__S_destination_, destination, $sym38$FORMAT);
        }
        {
          SubLObject dummy = NIL;
          try {
            try {
              if (format_control.isString()) {
                format_internal(stream, format_control, ZERO_INTEGER, Sequences.length(format_control), args, args);
              } else if (format_control.isFunction()) {
                Functions.apply(format_control, stream, args);
              } else {
                not_a_format_control(format_control);
              }
            } catch (Throwable ccatch_env_var) {
              dummy = Errors.handleThrowable(ccatch_env_var, $sym111$UP_AND_ALL_THE_WAY_OUT);
            }
          } catch (Throwable ccatch_env_var) {
            dummy = Errors.handleThrowable(ccatch_env_var, $sym112$UP_AND_OUT);
          }
        }
        if ((NIL != destination)) {
          return NIL;
        } else {
          return streams_high.get_output_stream_string(stream);
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 47474) 
  public static final SubLObject format_internal(SubLObject stream, SubLObject string, SubLObject start, SubLObject end, SubLObject args, SubLObject all_args) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      for (; (!(start.numGE(end))); ) {
        thread.resetMultipleValues();
        {
          SubLObject ch = parse_format_command(string, start, end, T, args);
          SubLObject directive_start = thread.secondMultipleValue();
          SubLObject directive_end = thread.thirdMultipleValue();
          SubLObject at_sign_p = thread.fourthMultipleValue();
          SubLObject colonp = thread.fifthMultipleValue();
          SubLObject parameters = thread.sixthMultipleValue();
          SubLObject new_args = thread.seventhMultipleValue();
          thread.resetMultipleValues();
          args = new_args;
          if ((NIL != ch)) {
            if (start.numL(directive_start)) {
              streams_high.write_string(string, stream, start, directive_start);
            }
            thread.resetMultipleValues();
            {
              SubLObject newer_args = call_format_directive(ch, stream, string, directive_end, end, new_args, all_args, parameters, at_sign_p, colonp);
              SubLObject new_start = thread.secondMultipleValue();
              thread.resetMultipleValues();
              args = newer_args;
              start = new_start;
            }
          } else {
            if (start.numL(end)) {
              streams_high.write_string(string, stream, start, end);
            }
            return args;
          }
        }
      }
      return args;
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 48276) 
  public static final SubLObject find_directive(SubLObject directive, SubLObject string, SubLObject start, SubLObject end) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      for (; true; ) {
        thread.resetMultipleValues();
        {
          SubLObject ch = parse_format_command(string, start, end, UNPROVIDED, UNPROVIDED);
          SubLObject directive_start = thread.secondMultipleValue();
          SubLObject directive_end = thread.thirdMultipleValue();
          SubLObject at_sign_p = thread.fourthMultipleValue();
          SubLObject colonp = thread.fifthMultipleValue();
          SubLObject parameters = thread.sixthMultipleValue();
          SubLObject args = thread.seventhMultipleValue();
          thread.resetMultipleValues();
          if ((NIL == ch)) {
            return Values.values(NIL, NIL, NIL);
          } else if ((NIL != Characters.charE(ch, directive))) {
            return Values.values(directive_start, directive_end, at_sign_p, colonp);
          } else {
            {
              SubLObject matching = matching_bracket(ch);
              if ((NIL != matching)) {
                thread.resetMultipleValues();
                {
                  SubLObject matching_start = find_directive(matching, string, directive_end, end);
                  SubLObject matching_end = thread.secondMultipleValue();
                  SubLObject matching_colonp = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != matching_end)) {
                    start = matching_end;
                  } else {
                    Errors.error($str127$No_matching__A_found_for__A_in__S, matching, directive, string);
                  }
                }
              } else {
                start = directive_end;
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/format.lisp", position = 49265) 
  public static final SubLObject parse_format_command(SubLObject string, SubLObject start, SubLObject end, SubLObject for_effect_p, SubLObject args) {
    if ((for_effect_p == UNPROVIDED)) {
      for_effect_p = NIL;
    }
    if ((args == UNPROVIDED)) {
      args = NIL;
    }
    {
      SubLObject state = $kw128$NORMAL;
      SubLObject parameters = NIL;
      SubLObject at_sign_p = NIL;
      SubLObject colonp = NIL;
      SubLObject minusp = NIL;
      SubLObject number = ZERO_INTEGER;
      SubLObject tilde_idx = NIL;
      SubLObject i = start;
      for (; (!(i.numGE(end))); ) {
        {
          SubLObject ch = Strings.sublisp_char(string, i);
          SubLObject pcase_var = state;
          if (pcase_var.eql($kw128$NORMAL)) {
            if ((NIL != Characters.charE(ch, Characters.CHAR_tilde))) {
              tilde_idx = i;
              state = $kw129$TILDE;
            }
          } else if (pcase_var.eql($kw129$TILDE)) {
            if ((NIL != Characters.charE(ch, Characters.CHAR_hash))) {
              if ((NIL != for_effect_p)) {
                parameters = cons(Sequences.length(args), parameters);
              }
              state = $kw130$PARAM;
            } else if ((NIL != Characters.char_equal(ch, Characters.CHAR_V))) {
              if ((NIL != for_effect_p)) {
                {
                  SubLObject parameter = args.first();
                  if ((!((parameter.isChar()
                        || parameter.isInteger()
                        || (NIL == parameter))))) {
                    Errors.error($str131$_S_parameter__S_is_not_a_characte, $sym38$FORMAT, parameter);
                  }
                  if ((NIL != parameter)) {
                    parameters = cons(parameter, parameters);
                  }
                  args = args.rest();
                }
              }
              state = $kw130$PARAM;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_quote))) {
              state = $kw132$QUOTE;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_comma))) {
              if ((NIL != for_effect_p)) {
                parameters = cons(NIL, parameters);
              }
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_colon))) {
              colonp = T;
              state = $kw133$COLON;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_at))) {
              at_sign_p = T;
              state = $kw134$AT_SIGN;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_hyphen))) {
              if ((NIL != for_effect_p)) {
                minusp = T;
                number = ZERO_INTEGER;
              }
              state = $kw135$SIGN;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_plus))) {
              if ((NIL != for_effect_p)) {
                minusp = NIL;
                number = ZERO_INTEGER;
              }
              state = $kw135$SIGN;
            } else if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              if ((NIL != for_effect_p)) {
                minusp = NIL;
                number = Characters.digit_char_p(ch, TEN_INTEGER);
              }
              state = $kw136$NUMBER;
            } else if ((NIL != format_directive_p(ch))) {
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              bad_format_directive(string, i);
            }
          } else if (pcase_var.eql($kw132$QUOTE)) {
            if ((NIL != for_effect_p)) {
              parameters = cons(ch, parameters);
            }
            state = $kw130$PARAM;
          } else if (pcase_var.eql($kw130$PARAM)) {
            if ((NIL != Characters.charE(ch, Characters.CHAR_comma))) {
              state = $kw129$TILDE;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_colon))) {
              colonp = T;
              state = $kw133$COLON;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_at))) {
              at_sign_p = T;
              state = $kw134$AT_SIGN;
            } else if ((NIL != format_directive_p(ch))) {
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              Errors.error($str137$Bad__S_parameter_, $sym38$FORMAT);
            }
          } else if (pcase_var.eql($kw135$SIGN)) {
            if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              if ((NIL != for_effect_p)) {
                number = Numbers.add(Numbers.multiply(number, TEN_INTEGER), Characters.digit_char_p(ch, TEN_INTEGER));
              }
              state = $kw136$NUMBER;
            } else {
              Errors.error($str137$Bad__S_parameter_, $sym38$FORMAT);
            }
          } else if (pcase_var.eql($kw133$COLON)) {
            if ((NIL != Characters.charE(ch, Characters.CHAR_at))) {
              at_sign_p = T;
              state = $kw138$COLON_AT;
            } else if ((NIL != format_directive_p(ch))) {
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              bad_format_directive(string, i);
            }
          } else if (pcase_var.eql($kw134$AT_SIGN)) {
            if ((NIL != Characters.charE(ch, Characters.CHAR_colon))) {
              colonp = T;
              state = $kw138$COLON_AT;
            } else if ((NIL != format_directive_p(ch))) {
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              bad_format_directive(string, i);
            }
          } else if (pcase_var.eql($kw138$COLON_AT)) {
            if ((NIL != format_directive_p(ch))) {
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              bad_format_directive(string, i);
            }
          } else if (pcase_var.eql($kw136$NUMBER)) {
            if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              if ((NIL != for_effect_p)) {
                number = Numbers.add(Numbers.multiply(number, TEN_INTEGER), Characters.digit_char_p(ch, TEN_INTEGER));
              }
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_comma))) {
              if ((NIL != for_effect_p)) {
                if ((NIL != minusp)) {
                  number = Numbers.minus(number);
                }
                parameters = cons(number, parameters);
              }
              state = $kw129$TILDE;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_colon))) {
              colonp = T;
              if ((NIL != for_effect_p)) {
                if ((NIL != minusp)) {
                  number = Numbers.minus(number);
                }
                parameters = cons(number, parameters);
              }
              state = $kw133$COLON;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_at))) {
              at_sign_p = T;
              if ((NIL != for_effect_p)) {
                if ((NIL != minusp)) {
                  number = Numbers.minus(number);
                }
                parameters = cons(number, parameters);
              }
              state = $kw134$AT_SIGN;
            } else if ((NIL != format_directive_p(ch))) {
              if ((NIL != for_effect_p)) {
                if ((NIL != minusp)) {
                  number = Numbers.minus(number);
                }
                parameters = cons(number, parameters);
              }
              return Values.values(ch, tilde_idx, Numbers.add(i, ONE_INTEGER), at_sign_p, colonp, Sequences.nreverse(parameters), args);
            } else {
              bad_format_directive(string, i);
            }
          }
        }
        i = Numbers.add(i, ONE_INTEGER);
      }
      if ((state != $kw128$NORMAL)) {
        Errors.error($str139$Unterminated__S_control_, $sym38$FORMAT);
      }
      return Values.values(NIL, NIL, i, NIL, NIL, NIL, args);
    }
  }

  public static final SubLObject declare_format_file() {
    declareFunction("format_directive_p", "FORMAT-DIRECTIVE-P", 1, 0, false);
    declareFunction("matching_bracket", "MATCHING-BRACKET", 1, 0, false);
    declareFunction("call_format_directive", "CALL-FORMAT-DIRECTIVE", 10, 0, false);
    declareMacro("defformat", "DEFFORMAT");
    declareMacro("defformat_bracketed", "DEFFORMAT-BRACKETED");
    declareFunction("unimplemented_format_directive", "UNIMPLEMENTED-FORMAT-DIRECTIVE", 1, 1, false);
    declareFunction("check_flags", "CHECK-FLAGS", 5, 0, false);
    declareFunction("format_typep", "FORMAT-TYPEP", 2, 0, false);
    declareMacro("with_format_parameters", "WITH-FORMAT-PARAMETERS");
    declareFunction("illegal_directive", "ILLEGAL-DIRECTIVE", 2, 0, false);
    declareFunction("bad_format_directive", "BAD-FORMAT-DIRECTIVE", 2, 0, false);
    declareFunction("not_enough_format_arguments", "NOT-ENOUGH-FORMAT-ARGUMENTS", 1, 0, false);
    declareFunction("matching_bracket_not_found", "MATCHING-BRACKET-NOT-FOUND", 3, 0, false);
    declareFunction("not_a_list_argument", "NOT-A-LIST-ARGUMENT", 1, 0, false);
    declareFunction("not_a_format_control", "NOT-A-FORMAT-CONTROL", 1, 0, false);
    declareFunction("repitition_designator_value", "REPITITION-DESIGNATOR-VALUE", 1, 0, false);
    declareFunction("format_repeat", "FORMAT-REPEAT", 3, 0, false);
    declareFunction("format_padded", "FORMAT-PADDED", 7, 0, false);
    declareFunction("format_c_directive", "FORMAT-C-DIRECTIVE", 9, 0, false);
    declareFunction("format_percent_directive", "FORMAT-PERCENT-DIRECTIVE", 9, 0, false);
    declareFunction("format_ampersand_directive", "FORMAT-AMPERSAND-DIRECTIVE", 9, 0, false);
    declareFunction("format_vertical_bar_directive", "FORMAT-VERTICAL-BAR-DIRECTIVE", 9, 0, false);
    declareFunction("format_tilde_directive", "FORMAT-TILDE-DIRECTIVE", 9, 0, false);
    declareFunction("format_integer_internal", "FORMAT-INTEGER-INTERNAL", 2, 0, false);
    declareFunction("format_integer", "FORMAT-INTEGER", 6, 0, false);
    declareFunction("integer_truncate", "INTEGER-TRUNCATE", 2, 0, false);
    declareFunction("format_cardinal_internal", "FORMAT-CARDINAL-INTERNAL", 4, 0, false);
    declareFunction("format_cardinal", "FORMAT-CARDINAL", 2, 0, false);
    declareFunction("format_ordinal", "FORMAT-ORDINAL", 2, 0, false);
    declareFunction("format_r_directive", "FORMAT-R-DIRECTIVE", 9, 0, false);
    declareFunction("format_d_directive", "FORMAT-D-DIRECTIVE", 9, 0, false);
    declareFunction("format_b_directive", "FORMAT-B-DIRECTIVE", 9, 0, false);
    declareFunction("format_o_directive", "FORMAT-O-DIRECTIVE", 9, 0, false);
    declareFunction("format_x_directive", "FORMAT-X-DIRECTIVE", 9, 0, false);
    declareFunction("split_flonum_digits", "SPLIT-FLONUM-DIGITS", 2, 0, false);
    declareFunction("round_digits", "ROUND-DIGITS", 2, 0, false);
    declareFunction("digits_add_1_int", "DIGITS-ADD-1-INT", 1, 0, false);
    declareFunction("digits_add_1", "DIGITS-ADD-1", 1, 0, false);
    declareFunction("round_decimal_digits", "ROUND-DECIMAL-DIGITS", 3, 0, false);
    declareFunction("format_f_directive", "FORMAT-F-DIRECTIVE", 9, 0, false);
    declareFunction("format_e_directive", "FORMAT-E-DIRECTIVE", 9, 0, false);
    declareFunction("format_g_directive", "FORMAT-G-DIRECTIVE", 9, 0, false);
    declareFunction("format_dollarsign_directive", "FORMAT-DOLLARSIGN-DIRECTIVE", 9, 0, false);
    declareFunction("format_a_directive", "FORMAT-A-DIRECTIVE", 9, 0, false);
    declareFunction("format_s_directive", "FORMAT-S-DIRECTIVE", 9, 0, false);
    declareFunction("format_w_directive", "FORMAT-W-DIRECTIVE", 9, 0, false);
    declareFunction("format_underscore_directive", "FORMAT-UNDERSCORE-DIRECTIVE", 9, 0, false);
    declareFunction("format_i_directive", "FORMAT-I-DIRECTIVE", 9, 0, false);
    declareFunction("format_slash_directive", "FORMAT-SLASH-DIRECTIVE", 9, 0, false);
    declareFunction("format_t_directive", "FORMAT-T-DIRECTIVE", 9, 0, false);
    declareFunction("format_less_than_directive", "FORMAT-LESS-THAN-DIRECTIVE", 9, 0, false);
    declareFunction("format_greater_than_directive", "FORMAT-GREATER-THAN-DIRECTIVE", 9, 0, false);
    declareFunction("backup_args", "BACKUP-ARGS", 3, 0, false);
    declareFunction("format_asterisk_directive", "FORMAT-ASTERISK-DIRECTIVE", 9, 0, false);
    declareFunction("format_left_bracket_directive", "FORMAT-LEFT-BRACKET-DIRECTIVE", 9, 0, false);
    declareFunction("format_right_bracket_directive", "FORMAT-RIGHT-BRACKET-DIRECTIVE", 9, 0, false);
    declareFunction("format_sublist_iteration", "FORMAT-SUBLIST-ITERATION", 7, 0, false);
    declareFunction("format_iteration", "FORMAT-ITERATION", 7, 0, false);
    declareFunction("format_left_brace_directive", "FORMAT-LEFT-BRACE-DIRECTIVE", 9, 0, false);
    declareFunction("format_right_brace_directive", "FORMAT-RIGHT-BRACE-DIRECTIVE", 9, 0, false);
    declareFunction("format_question_mark_directive", "FORMAT-QUESTION-MARK-DIRECTIVE", 9, 0, false);
    declareFunction("format_left_paren_directive", "FORMAT-LEFT-PAREN-DIRECTIVE", 9, 0, false);
    declareFunction("format_right_paren_directive", "FORMAT-RIGHT-PAREN-DIRECTIVE", 9, 0, false);
    declareFunction("format_p_directive", "FORMAT-P-DIRECTIVE", 9, 0, false);
    declareFunction("format_semicolon_directive", "FORMAT-SEMICOLON-DIRECTIVE", 9, 0, false);
    declareFunction("format_circumflex_directive", "FORMAT-CIRCUMFLEX-DIRECTIVE", 9, 0, false);
    declareFunction("format_newline_directive", "FORMAT-NEWLINE-DIRECTIVE", 9, 0, false);
    declareFunction("really_format", "REALLY-FORMAT", 3, 0, false);
    declareFunction("format_internal", "FORMAT-INTERNAL", 6, 0, false);
    declareFunction("find_directive", "FIND-DIRECTIVE", 4, 0, false);
    declareFunction("parse_format_command", "PARSE-FORMAT-COMMAND", 3, 2, false);
    return NIL;
  }

  public static final SubLObject init_format_file() {
    $format_directives$ = defvar("*FORMAT-DIRECTIVES*", Hashtables.make_hash_table($int0$50, UNPROVIDED, UNPROVIDED));
    $matching_brackets$ = defvar("*MATCHING-BRACKETS*", Hashtables.make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
    $remaining_args$ = defvar("*REMAINING-ARGS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_format_file() {
        Hashtables.sethash(Characters.CHAR_c, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym48$FORMAT_C_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_C, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym48$FORMAT_C_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_percent, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym50$FORMAT_PERCENT_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_percent, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym50$FORMAT_PERCENT_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_ampersand, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym51$FORMAT_AMPERSAND_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_ampersand, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym51$FORMAT_AMPERSAND_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_vertical, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym52$FORMAT_VERTICAL_BAR_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_vertical, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym52$FORMAT_VERTICAL_BAR_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_tilde, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym53$FORMAT_TILDE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_tilde, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym53$FORMAT_TILDE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_r, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym83$FORMAT_R_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_R, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym83$FORMAT_R_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_d, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym84$FORMAT_D_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_D, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym84$FORMAT_D_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_b, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym85$FORMAT_B_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_B, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym85$FORMAT_B_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_o, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym86$FORMAT_O_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_O, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym86$FORMAT_O_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_x, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym87$FORMAT_X_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_X, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym87$FORMAT_X_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_f, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym89$FORMAT_F_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_F, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym89$FORMAT_F_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_e, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym90$FORMAT_E_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_E, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym90$FORMAT_E_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_g, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym91$FORMAT_G_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_G, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym91$FORMAT_G_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_dollar, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym92$FORMAT_DOLLARSIGN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_dollar, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym92$FORMAT_DOLLARSIGN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_a, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym95$FORMAT_A_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_A, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym95$FORMAT_A_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_s, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym96$FORMAT_S_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_S, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym96$FORMAT_S_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_w, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym98$FORMAT_W_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_W, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym98$FORMAT_W_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_underbar, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym99$FORMAT_UNDERSCORE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_underbar, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym99$FORMAT_UNDERSCORE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_i, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym100$FORMAT_I_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_I, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym100$FORMAT_I_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_slash, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym102$FORMAT_SLASH_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_slash, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym102$FORMAT_SLASH_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_t, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym103$FORMAT_T_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_T, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym103$FORMAT_T_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_less, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym104$FORMAT_LESS_THAN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_less, $matching_brackets$.getDynamicValue(), Characters.CHAR_greater);
    Hashtables.sethash(Characters.CHAR_greater, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym105$FORMAT_GREATER_THAN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_greater, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym105$FORMAT_GREATER_THAN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_asterisk, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym106$FORMAT_ASTERISK_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_asterisk, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym106$FORMAT_ASTERISK_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lbracket, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym109$FORMAT_LEFT_BRACKET_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lbracket, $matching_brackets$.getDynamicValue(), Characters.CHAR_rbracket);
    Hashtables.sethash(Characters.CHAR_rbracket, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_rbracket, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lbrace, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym113$FORMAT_LEFT_BRACE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lbrace, $matching_brackets$.getDynamicValue(), Characters.CHAR_rbrace);
    Hashtables.sethash(Characters.CHAR_rbrace, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym114$FORMAT_RIGHT_BRACE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_rbrace, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym114$FORMAT_RIGHT_BRACE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_question, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym117$FORMAT_QUESTION_MARK_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_question, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym117$FORMAT_QUESTION_MARK_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lparen, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym118$FORMAT_LEFT_PAREN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_lparen, $matching_brackets$.getDynamicValue(), Characters.CHAR_rparen);
    Hashtables.sethash(Characters.CHAR_rparen, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym119$FORMAT_RIGHT_PAREN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_rparen, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym119$FORMAT_RIGHT_PAREN_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_p, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym121$FORMAT_P_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_P, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym121$FORMAT_P_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_semicolon, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym122$FORMAT_SEMICOLON_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_semicolon, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym122$FORMAT_SEMICOLON_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_caret, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym123$FORMAT_CIRCUMFLEX_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_caret, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym123$FORMAT_CIRCUMFLEX_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_newline, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym124$FORMAT_NEWLINE_DIRECTIVE));
    Hashtables.sethash(Characters.CHAR_newline, $format_directives$.getDynamicValue(), Symbols.symbol_function($sym124$FORMAT_NEWLINE_DIRECTIVE));
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$50 = makeInteger(50);
  public static final SubLList $list1 = list(makeSymbol("NAME"), makeSymbol("CHARACTER"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym2$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym3$DECLAIM = makeSymbol("DECLAIM");
  public static final SubLSymbol $sym4$FACCESS = makeSymbol("FACCESS");
  public static final SubLSymbol $sym5$PRIVATE = makeSymbol("PRIVATE");
  public static final SubLSymbol $sym6$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym7$SETHASH = makeSymbol("SETHASH");
  public static final SubLSymbol $sym8$_FORMAT_DIRECTIVES_ = makeSymbol("*FORMAT-DIRECTIVES*");
  public static final SubLSymbol $sym9$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLList $list10 = list(makeSymbol("NAME"), makeSymbol("LEFT"), makeSymbol("RIGHT"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym11$_MATCHING_BRACKETS_ = makeSymbol("*MATCHING-BRACKETS*");
  public static final SubLString $str12$The__A_format_directive_is_not_ye = makeString("The ~A format directive is not yet ~@[fully ~]implemented.");
  public static final SubLString $str13$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take an at-sign modifier.");
  public static final SubLString $str14$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take an colon modifier.");
  public static final SubLString $str15$The____C_format_directive_does_no = makeString("The ~~~C format directive does not take both an at-sign and colon modifier.");
  public static final SubLSymbol $sym16$OR = makeSymbol("OR");
  public static final SubLSymbol $sym17$INTEGER = makeSymbol("INTEGER");
  public static final SubLList $list18 = list(makeSymbol("&OPTIONAL"), makeSymbol("START"), makeSymbol("END"));
  public static final SubLString $str19$Unrecognized_type_specifier__S_ = makeString("Unrecognized type specifier ~S.");
  public static final SubLSymbol $sym20$CHARACTER = makeSymbol("CHARACTER");
  public static final SubLSymbol $sym21$NULL = makeSymbol("NULL");
  public static final SubLList $list22 = list(makeSymbol("PATTERN"), makeSymbol("PARAMETERS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str23$TAIL = makeString("TAIL");
  public static final SubLList $list24 = list(makeSymbol("VAR"), makeSymbol("INIT"), makeSymbol("TYPE"));
  public static final SubLSymbol $sym25$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym26$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym27$CPOP = makeSymbol("CPOP");
  public static final SubLSymbol $sym28$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym29$FORMAT_TYPEP = makeSymbol("FORMAT-TYPEP");
  public static final SubLSymbol $sym30$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym31$ERROR = makeSymbol("ERROR");
  public static final SubLString $str32$The__S_parameter__S_is_not_of_typ = makeString("The ~S parameter ~S is not of type ~S.");
  public static final SubLList $list33 = list(makeSymbol("QUOTE"), makeSymbol("FORMAT"));
  public static final SubLSymbol $sym34$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym35$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list36 = list(list(makeSymbol("ERROR"), makeString("Too many ~S parameters."), list(makeSymbol("QUOTE"), makeSymbol("FORMAT"))));
  public static final SubLString $str37$Stray____C_directive_in__S_string = makeString("Stray ~~~C directive in ~S string ~S.");
  public static final SubLSymbol $sym38$FORMAT = makeSymbol("FORMAT");
  public static final SubLString $str39$_S_is_not_a_recognized__S_control = makeString("~S is not a recognized ~S control.");
  public static final SubLString $str40$_S_directive__S_ran_out_of_argume = makeString("~S directive ~S ran out of arguments.");
  public static final SubLString $str41$No_matching__S_found_for__S_in__S = makeString("No matching ~S found for ~S in ~S.");
  public static final SubLString $str42$The__S__S_directive_takes_a_list_ = makeString("The ~S ~S directive takes a list as an argument.");
  public static final SubLString $str43$_S_is_not_a_valid__S_control_ = makeString("~S is not a valid ~S control.");
  public static final SubLString $str44$_S_is_not_a_valid__S_repitition_s = makeString("~S is not a valid ~S repitition specifier.");
  public static final SubLString $str45$Too_many__S_parameters_ = makeString("Too many ~S parameters.");
  public static final SubLSymbol $sym46$CHARACTERP = makeSymbol("CHARACTERP");
  public static final SubLString $str47$__ = makeString("#\\");
  public static final SubLSymbol $sym48$FORMAT_C_DIRECTIVE = makeSymbol("FORMAT-C-DIRECTIVE");
  public static final SubLList $list49 = list(makeSymbol("OR"), makeSymbol("NULL"), list(makeSymbol("INTEGER"), ZERO_INTEGER));
  public static final SubLSymbol $sym50$FORMAT_PERCENT_DIRECTIVE = makeSymbol("FORMAT-PERCENT-DIRECTIVE");
  public static final SubLSymbol $sym51$FORMAT_AMPERSAND_DIRECTIVE = makeSymbol("FORMAT-AMPERSAND-DIRECTIVE");
  public static final SubLSymbol $sym52$FORMAT_VERTICAL_BAR_DIRECTIVE = makeSymbol("FORMAT-VERTICAL-BAR-DIRECTIVE");
  public static final SubLSymbol $sym53$FORMAT_TILDE_DIRECTIVE = makeSymbol("FORMAT-TILDE-DIRECTIVE");
  public static final SubLList $list54 = list(makeSymbol("INTEGER"), ZERO_INTEGER);
  public static final SubLList $list55 = list(makeSymbol("INTEGER"), ONE_INTEGER);
  public static final SubLString $str56$_ = makeString("-");
  public static final SubLString $str57$_ = makeString("+");
  public static final SubLSymbol $sym58$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLObject $ic59 = Vectors.vector(new SubLObject[] {makeString(""), makeString(" thousand"), makeString(" million"), makeString(" billion"), makeString(" trillion"), makeString(" quadrillion"), makeString(" quintillion"), makeString(" sextillion"), makeString(" septillion"), makeString(" octillion"), makeString(" nonillion"), makeString(" decillion"), makeString(" undecillion"), makeString(" duodecillion"), makeString(" tredecillion"), makeString(" quattuordecillion"), makeString(" quindecillion"), makeString(" sexdecillion"), makeString(" septendecillion"), makeString(" octodecillion"), makeString(" novemdecillion"), makeString(" vigintillion")});
  public static final SubLString $str60$_times_ten_to_the_ = makeString(" times ten to the ");
  public static final SubLString $str61$_power = makeString(" power");
  public static final SubLString $str62$_plus = makeString(" plus");
  public static final SubLInteger $int63$1000 = makeInteger(1000);
  public static final SubLInteger $int64$100 = makeInteger(100);
  public static final SubLObject $ic65 = Vectors.vector(new SubLObject[] {NIL, makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine")});
  public static final SubLString $str66$_hundred = makeString(" hundred");
  public static final SubLObject $ic67 = Vectors.vector(new SubLObject[] {makeString("ten"), makeString("eleven"), makeString("twelve"), makeString("thirteen"), makeString("fourteen"), makeString("fifteen"), makeString("sixteen"), makeString("seventeen"), makeString("eighteen"), makeString("nineteen")});
  public static final SubLObject $ic68 = Vectors.vector(new SubLObject[] {NIL, NIL, makeString("twenty"), makeString("thirty"), makeString("forty"), makeString("fifty"), makeString("sixty"), makeString("seventy"), makeString("eighty"), makeString("ninety")});
  public static final SubLObject $ic69 = Vectors.vector(new SubLObject[] {NIL, makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine")});
  public static final SubLString $str70$zero = makeString("zero");
  public static final SubLString $str71$minus_ = makeString("minus ");
  public static final SubLString $str72$zeroth = makeString("zeroth");
  public static final SubLObject $ic73 = Vectors.vector(new SubLObject[] {NIL, makeString("tenth"), makeString("twentieth"), makeString("thirtieth"), makeString("fortieth"), makeString("fiftieth"), makeString("sixtieth"), makeString("seventieth"), makeString("eightieth"), makeString("ninetieth")});
  public static final SubLObject $ic74 = Vectors.vector(new SubLObject[] {NIL, makeString("eleventh"), makeString("twelfth"), makeString("thirteenth"), makeString("fourteenth"), makeString("fifteenth"), makeString("sixteenth"), makeString("seventeenth"), makeString("eighteenth"), makeString("nineteenth")});
  public static final SubLObject $ic75 = Vectors.vector(new SubLObject[] {NIL, makeString("first"), makeString("second"), makeString("third"), makeString("fourth"), makeString("fifth"), makeString("sixth"), makeString("seventh"), makeString("eighth"), makeString("ninth")});
  public static final SubLString $str76$th = makeString("th");
  public static final SubLInteger $int77$36 = makeInteger(36);
  public static final SubLString $str78$_S_is_not_a_valid_radix_ = makeString("~S is not a valid radix.");
  public static final SubLList $list79 = list(Characters.CHAR_M, Characters.CHAR_D, Characters.CHAR_C, Characters.CHAR_L, Characters.CHAR_X, Characters.CHAR_V, Characters.CHAR_I);
  public static final SubLList $list80 = list(makeInteger(1000), makeInteger(500), makeInteger(100), makeInteger(50), TEN_INTEGER, FIVE_INTEGER, ONE_INTEGER);
  public static final SubLList $list81 = list(makeInteger(900), makeInteger(400), makeInteger(90), makeInteger(40), NINE_INTEGER, FOUR_INTEGER);
  public static final SubLList $list82 = list(Characters.CHAR_C, Characters.CHAR_C, Characters.CHAR_X, Characters.CHAR_X, Characters.CHAR_I, Characters.CHAR_I);
  public static final SubLSymbol $sym83$FORMAT_R_DIRECTIVE = makeSymbol("FORMAT-R-DIRECTIVE");
  public static final SubLSymbol $sym84$FORMAT_D_DIRECTIVE = makeSymbol("FORMAT-D-DIRECTIVE");
  public static final SubLSymbol $sym85$FORMAT_B_DIRECTIVE = makeSymbol("FORMAT-B-DIRECTIVE");
  public static final SubLSymbol $sym86$FORMAT_O_DIRECTIVE = makeSymbol("FORMAT-O-DIRECTIVE");
  public static final SubLSymbol $sym87$FORMAT_X_DIRECTIVE = makeSymbol("FORMAT-X-DIRECTIVE");
  public static final SubLList $list88 = list(makeSymbol("OR"), makeSymbol("NULL"), makeSymbol("CHARACTER"));
  public static final SubLSymbol $sym89$FORMAT_F_DIRECTIVE = makeSymbol("FORMAT-F-DIRECTIVE");
  public static final SubLSymbol $sym90$FORMAT_E_DIRECTIVE = makeSymbol("FORMAT-E-DIRECTIVE");
  public static final SubLSymbol $sym91$FORMAT_G_DIRECTIVE = makeSymbol("FORMAT-G-DIRECTIVE");
  public static final SubLSymbol $sym92$FORMAT_DOLLARSIGN_DIRECTIVE = makeSymbol("FORMAT-DOLLARSIGN-DIRECTIVE");
  public static final SubLString $str93$__ = makeString("()");
  public static final SubLSymbol $sym94$FORMAT_PADDED = makeSymbol("FORMAT-PADDED");
  public static final SubLSymbol $sym95$FORMAT_A_DIRECTIVE = makeSymbol("FORMAT-A-DIRECTIVE");
  public static final SubLSymbol $sym96$FORMAT_S_DIRECTIVE = makeSymbol("FORMAT-S-DIRECTIVE");
  public static final SubLSymbol $kw97$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $sym98$FORMAT_W_DIRECTIVE = makeSymbol("FORMAT-W-DIRECTIVE");
  public static final SubLSymbol $sym99$FORMAT_UNDERSCORE_DIRECTIVE = makeSymbol("FORMAT-UNDERSCORE-DIRECTIVE");
  public static final SubLSymbol $sym100$FORMAT_I_DIRECTIVE = makeSymbol("FORMAT-I-DIRECTIVE");
  public static final SubLSymbol $sym101$CHAR_ = makeSymbol("CHAR=");
  public static final SubLSymbol $sym102$FORMAT_SLASH_DIRECTIVE = makeSymbol("FORMAT-SLASH-DIRECTIVE");
  public static final SubLSymbol $sym103$FORMAT_T_DIRECTIVE = makeSymbol("FORMAT-T-DIRECTIVE");
  public static final SubLSymbol $sym104$FORMAT_LESS_THAN_DIRECTIVE = makeSymbol("FORMAT-LESS-THAN-DIRECTIVE");
  public static final SubLSymbol $sym105$FORMAT_GREATER_THAN_DIRECTIVE = makeSymbol("FORMAT-GREATER-THAN-DIRECTIVE");
  public static final SubLSymbol $sym106$FORMAT_ASTERISK_DIRECTIVE = makeSymbol("FORMAT-ASTERISK-DIRECTIVE");
  public static final SubLString $str107$No_clause_marker_found_for__S__S_ = makeString("No clause marker found for ~S ~S directive.");
  public static final SubLList $list108 = list(makeSymbol("OR"), makeSymbol("NULL"), makeSymbol("INTEGER"));
  public static final SubLSymbol $sym109$FORMAT_LEFT_BRACKET_DIRECTIVE = makeSymbol("FORMAT-LEFT-BRACKET-DIRECTIVE");
  public static final SubLSymbol $sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE = makeSymbol("FORMAT-RIGHT-BRACKET-DIRECTIVE");
  public static final SubLSymbol $sym111$UP_AND_ALL_THE_WAY_OUT = makeSymbol("UP-AND-ALL-THE-WAY-OUT");
  public static final SubLSymbol $sym112$UP_AND_OUT = makeSymbol("UP-AND-OUT");
  public static final SubLSymbol $sym113$FORMAT_LEFT_BRACE_DIRECTIVE = makeSymbol("FORMAT-LEFT-BRACE-DIRECTIVE");
  public static final SubLSymbol $sym114$FORMAT_RIGHT_BRACE_DIRECTIVE = makeSymbol("FORMAT-RIGHT-BRACE-DIRECTIVE");
  public static final SubLSymbol $sym115$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym116$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym117$FORMAT_QUESTION_MARK_DIRECTIVE = makeSymbol("FORMAT-QUESTION-MARK-DIRECTIVE");
  public static final SubLSymbol $sym118$FORMAT_LEFT_PAREN_DIRECTIVE = makeSymbol("FORMAT-LEFT-PAREN-DIRECTIVE");
  public static final SubLSymbol $sym119$FORMAT_RIGHT_PAREN_DIRECTIVE = makeSymbol("FORMAT-RIGHT-PAREN-DIRECTIVE");
  public static final SubLString $str120$ies = makeString("ies");
  public static final SubLSymbol $sym121$FORMAT_P_DIRECTIVE = makeSymbol("FORMAT-P-DIRECTIVE");
  public static final SubLSymbol $sym122$FORMAT_SEMICOLON_DIRECTIVE = makeSymbol("FORMAT-SEMICOLON-DIRECTIVE");
  public static final SubLSymbol $sym123$FORMAT_CIRCUMFLEX_DIRECTIVE = makeSymbol("FORMAT-CIRCUMFLEX-DIRECTIVE");
  public static final SubLSymbol $sym124$FORMAT_NEWLINE_DIRECTIVE = makeSymbol("FORMAT-NEWLINE-DIRECTIVE");
  public static final SubLString $str125$_S_does_not_support_string_destin = makeString("~S does not support string destinations.");
  public static final SubLString $str126$_S_is_not_a_valid__S_destination_ = makeString("~S is not a valid ~S destination.");
  public static final SubLString $str127$No_matching__A_found_for__A_in__S = makeString("No matching ~A found for ~A in ~S.");
  public static final SubLSymbol $kw128$NORMAL = makeKeyword("NORMAL");
  public static final SubLSymbol $kw129$TILDE = makeKeyword("TILDE");
  public static final SubLSymbol $kw130$PARAM = makeKeyword("PARAM");
  public static final SubLString $str131$_S_parameter__S_is_not_a_characte = makeString("~S parameter ~S is not a character, integer, or NIL.");
  public static final SubLSymbol $kw132$QUOTE = makeKeyword("QUOTE");
  public static final SubLSymbol $kw133$COLON = makeKeyword("COLON");
  public static final SubLSymbol $kw134$AT_SIGN = makeKeyword("AT-SIGN");
  public static final SubLSymbol $kw135$SIGN = makeKeyword("SIGN");
  public static final SubLSymbol $kw136$NUMBER = makeKeyword("NUMBER");
  public static final SubLString $str137$Bad__S_parameter_ = makeString("Bad ~S parameter.");
  public static final SubLSymbol $kw138$COLON_AT = makeKeyword("COLON-AT");
  public static final SubLString $str139$Unterminated__S_control_ = makeString("Unterminated ~S control.");

  //// Initializers

  public void declareFunctions() {
    declare_format_file();
  }

  public void initializeVariables() {
    init_format_file();
  }

  public void runTopLevelForms() {
    setup_format_file();
  }

}
