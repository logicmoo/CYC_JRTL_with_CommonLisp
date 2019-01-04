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
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class numeric_date_utilities extends SubLTranslatedFile {

  //// Constructor

  private numeric_date_utilities() {}
  public static final SubLFile me = new numeric_date_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.numeric_date_utilities";

  //// Definitions

  /** True */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1103) 
  public static SubLSymbol $seconds_in_a_leap_year$ = null;

  /** Also True */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1276) 
  public static SubLSymbol $seconds_in_a_non_leap_year$ = null;

  /** Right */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1350) 
  public static SubLSymbol $seconds_in_a_week$ = null;

  /** Yep. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1409) 
  public static SubLSymbol $seconds_in_a_day$ = null;

  /** uh-huh. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1465) 
  public static SubLSymbol $seconds_in_an_hour$ = null;

  /** the number of seconds in a minute */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1525) 
  public static SubLSymbol $seconds_in_a_minute$ = null;

  /** the number of minutes in an hour */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1610) 
  public static SubLSymbol $minutes_in_an_hour$ = null;

  /** the number of hours in a day */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1694) 
  public static SubLSymbol $hours_in_a_day$ = null;

  /** the number of months in a year */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 1769) 
  public static SubLSymbol $months_in_a_year$ = null;

  /** @return universal-time-p; the universal time SECONDS from REFERENCE-TIME. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 3746) 
  public static final SubLObject universal_time_seconds_from_now(SubLObject seconds, SubLObject reference_time) {
    if ((reference_time == UNPROVIDED)) {
      reference_time = Time.get_universal_time();
    }
    return Numbers.add(reference_time, (seconds.isInteger() ? ((SubLObject) seconds) : Numbers.truncate(seconds, UNPROVIDED)));
  }

  /** Legacy function name. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 4109) 
  public static final SubLObject time_from_now(SubLObject seconds) {
    return universal_time_seconds_from_now(seconds, UNPROVIDED);
  }

  /** TIMESTRING returns a string in the format mm/dd/yyyy hh:mm:ss from the
universal time given.  If none is given, the current time is used. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 4559) 
  public static final SubLObject timestring(SubLObject universal_time) {
    if ((universal_time == UNPROVIDED)) {
      universal_time = Time.get_universal_time();
    }
    checkType(universal_time, $sym19$UNIVERSAL_TIME_P);
    return timestring_int(universal_time);
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 5118) 
  public static final SubLObject timestring_int(SubLObject universal_time) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject second = Time.decode_universal_time(universal_time, UNPROVIDED);
        SubLObject minute = thread.secondMultipleValue();
        SubLObject hour = thread.thirdMultipleValue();
        SubLObject date = thread.fourthMultipleValue();
        SubLObject month = thread.fifthMultipleValue();
        SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_timestring(second, minute, hour, date, month, year);
      }
    }
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 5792) 
  public static final SubLObject encode_timestring(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year) {
    return encode_datetime_string_from_template(NIL, second, minute, hour, date, month, year, $str24$mm_dd_yyyy_hh_mm_ss);
  }

  /** UNIVERSAL-TIMESTRING returns a string in the format yyyymmddhhmmss from the
universal time given.  If none is given, the current time is used. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 5967) 
  public static final SubLObject universal_timestring(SubLObject universal_time) {
    if ((universal_time == UNPROVIDED)) {
      universal_time = Time.get_universal_time();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(universal_time, $sym19$UNIVERSAL_TIME_P);
      thread.resetMultipleValues();
      {
        SubLObject second = Time.decode_universal_time(universal_time, UNPROVIDED);
        SubLObject minute = thread.secondMultipleValue();
        SubLObject hour = thread.thirdMultipleValue();
        SubLObject date = thread.fourthMultipleValue();
        SubLObject month = thread.fifthMultipleValue();
        SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_timestring(second, minute, hour, date, month, year);
      }
    }
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 6424) 
  public static final SubLObject encode_universal_timestring(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year) {
    return PrintLow.format(NIL, $str25$_D_2__0D_2__0D_2__0D_2__0D_2__0D, new SubLObject[] {year, month, date, hour, minute, second});
  }

  /** Return T iff OBJECT is an internal real time. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 7917) 
  public static final SubLObject internal_real_time_p(SubLObject object) {
    return subl_promotions.non_negative_integer_p(object);
  }

  /** Return the number of elapsed internal real time units from COMPARISON-TIME to REFERENCE-TIME. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 8519) 
  public static final SubLObject elapsed_internal_real_time(SubLObject reference_time, SubLObject comparison_time) {
    if ((comparison_time == UNPROVIDED)) {
      comparison_time = Time.get_internal_real_time();
    }
    return Numbers.subtract(comparison_time, reference_time);
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 8935) 
  public static final SubLObject elapsed_internal_real_time_to_elapsed_seconds(SubLObject elapsed) {
    return Numbers.divide(elapsed, time_high.$internal_time_units_per_second$.getGlobalValue());
  }

  /** Returns a string in the format specified by TEMPLATE representing the datetime 
   having the stated values for MILLISECOND, SECOND, MINUTE, HOUR, DAY, MONTH, YEAR.
   @param MILLISECOND
   @param SECOND
   @param MINUTE
   @param HOUR
   @param DAY
   @param MONTH
   @param YEAR
   @param TEMPLATE datetime-string-template-p
   @return stringp */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 13187) 
  public static final SubLObject encode_datetime_string_from_template(SubLObject millisecond, SubLObject second, SubLObject minute, SubLObject hour, SubLObject day, SubLObject month, SubLObject year, SubLObject template) {
    checkType(template, $sym33$DATETIME_STRING_TEMPLATE_P);
    {
      SubLObject subtemplates = string_utilities.break_words(template, Symbols.symbol_function($sym34$NON_WHITESPACE_P), UNPROVIDED);
      if ((Sequences.length(subtemplates).numE(TWO_INTEGER)
           && (NIL != date_template_p(subtemplates.first()))
           && (NIL != time_template_p(conses_high.second(subtemplates))))) {
        return PrintLow.format(NIL, $str35$_A__A, encode_date_from_template(day, month, year, subtemplates.first()), encode_time_from_template(millisecond, second, minute, hour, conses_high.second(subtemplates)));
      } else if ((Sequences.length(subtemplates).numE(TWO_INTEGER)
           && (NIL != time_template_p(subtemplates.first()))
           && (NIL != date_template_p(conses_high.second(subtemplates))))) {
        return PrintLow.format(NIL, $str35$_A__A, encode_time_from_template(millisecond, second, minute, hour, subtemplates.first()), encode_date_from_template(day, month, year, conses_high.second(subtemplates)));
      } else if ((Sequences.length(subtemplates).numE(ONE_INTEGER)
           && (NIL != date_template_p(subtemplates.first())))) {
        return encode_date_from_template(day, month, year, subtemplates.first());
      } else if ((Sequences.length(subtemplates).numE(ONE_INTEGER)
           && (NIL != time_template_p(subtemplates.first())))) {
        return encode_time_from_template(millisecond, second, minute, hour, subtemplates.first());
      } else {
        Errors.error($str36$Template__s_is_not_a_valid_dateti, template);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 14828) 
  public static final SubLObject valid_date_template_char(SubLObject v_char) {
    return conses_high.member(v_char, $list37, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15042) 
  public static final SubLObject valid_date_separator(SubLObject v_char) {
    return makeBoolean((v_char.eql(Characters.CHAR_slash)
          || v_char.eql(Characters.CHAR_hyphen)
          || v_char.eql(Characters.CHAR_underbar)));
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15226) 
  public static final SubLObject valid_year_token(SubLObject v_char) {
    return makeBoolean((v_char.eql(Characters.CHAR_y)
          || v_char.eql(Characters.CHAR_Y)));
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15317) 
  public static final SubLObject valid_month_token(SubLObject v_char) {
    return makeBoolean((v_char.eql(Characters.CHAR_m)
          || v_char.eql(Characters.CHAR_M)));
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15409) 
  public static final SubLObject valid_day_token(SubLObject v_char) {
    return makeBoolean((v_char.eql(Characters.CHAR_d)
          || v_char.eql(Characters.CHAR_D)));
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15776) 
  public static final SubLObject date_template_p(SubLObject template) {
    if ((NIL == list_utilities.find_if_not(Symbols.symbol_function($sym39$VALID_DATE_TEMPLATE_CHAR), template, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 15919) 
  public static final SubLObject time_template_p(SubLObject template) {
    return makeBoolean((template.equalp($str40$hh_mm_ss)
          || template.equalp($str41$hh_mm_ss_mmm)
          || template.equalp($str42$hh_mm)
          || template.equalp($str43$hh_mm_ss_m)
          || template.equalp($str44$hh_mm_ss_mm)));
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 16989) 
  public static final SubLObject n_digit_template_element_p(SubLObject template, SubLObject n, SubLObject token_checker, SubLObject separator_checker) {
    if (Sequences.length(template).numL(n)) {
      return NIL;
    } else {
      {
        SubLObject index = NIL;
        for (index = ZERO_INTEGER; index.numL(n); index = Numbers.add(index, ONE_INTEGER)) {
          if ((NIL == Functions.funcall(token_checker, Strings.sublisp_char(template, index)))) {
            return NIL;
          }
        }
        if (Sequences.length(template).numG(n)) {
          if ((NIL == Functions.funcall(separator_checker, Strings.sublisp_char(template, n)))) {
            return NIL;
          }
        }
        return T;
      }
    }
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 17413) 
  public static final SubLObject encode_date_from_template(SubLObject day, SubLObject month, SubLObject year, SubLObject template) {
    if ((NIL != n_digit_template_element_p(template, FOUR_INTEGER, Symbols.symbol_function($sym46$VALID_YEAR_TOKEN), Symbols.symbol_function($sym47$VALID_DATE_SEPARATOR)))) {
      return encode_next_date_element(day, month, year, template, FOUR_INTEGER, year);
    } else if ((NIL != n_digit_template_element_p(template, TWO_INTEGER, Symbols.symbol_function($sym46$VALID_YEAR_TOKEN), Symbols.symbol_function($sym47$VALID_DATE_SEPARATOR)))) {
      return encode_next_date_element(day, month, year, template, TWO_INTEGER, Numbers.mod(year, $int48$100));
    } else if ((NIL != n_digit_template_element_p(template, TWO_INTEGER, Symbols.symbol_function($sym49$VALID_MONTH_TOKEN), Symbols.symbol_function($sym47$VALID_DATE_SEPARATOR)))) {
      return encode_next_date_element(day, month, year, template, TWO_INTEGER, month);
    } else if ((NIL != n_digit_template_element_p(template, TWO_INTEGER, Symbols.symbol_function($sym50$VALID_DAY_TOKEN), Symbols.symbol_function($sym47$VALID_DATE_SEPARATOR)))) {
      return encode_next_date_element(day, month, year, template, TWO_INTEGER, day);
    } else {
      Errors.error($str51$Template_or_template_portion__S_d, template);
    }
    return NIL;
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 18221) 
  public static final SubLObject encode_next_date_element(SubLObject day, SubLObject month, SubLObject year, SubLObject template, SubLObject elem_length, SubLObject item) {
    {
      SubLObject format_string = Sequences.cconcatenate($str52$_, new SubLObject[] {string_utilities.to_string(elem_length), $str53$__0D});
      return Sequences.cconcatenate(PrintLow.format(NIL, format_string, item), (Numbers.add(elem_length, ONE_INTEGER).numG(Sequences.length(template)) ? ((SubLObject) $str20$) : Sequences.cconcatenate(string_utilities.to_string(Strings.sublisp_char(template, elem_length)), encode_date_from_template(day, month, year, string_utilities.substring(template, Numbers.add(elem_length, ONE_INTEGER), UNPROVIDED)))));
    }
  }

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 18649) 
  public static final SubLObject encode_time_from_template(SubLObject millisecond, SubLObject second, SubLObject minute, SubLObject hour, SubLObject template) {
    if ((NIL == hour)) {
      return $str20$;
    } else {
      if (template.equalp($str40$hh_mm_ss)) {
        return PrintLow.format(NIL, $str54$_2__0D__2__0D__2__0D, new SubLObject[] {hour, minute, second});
      } else if (template.equalp($str42$hh_mm)) {
        return PrintLow.format(NIL, $str55$_2__0D__2__0D, hour, minute);
      } else if (template.equalp($str41$hh_mm_ss_mmm)) {
        return PrintLow.format(NIL, $str56$_2__0D__2__0D__2__0D__3__0D, new SubLObject[] {hour, minute, second, millisecond});
      } else if (template.equalp($str44$hh_mm_ss_mm)) {
        return PrintLow.format(NIL, $str57$_2__0D__2__0D__2__0D__2__0D, new SubLObject[] {hour, minute, second, millisecond});
      } else if (template.equalp($str43$hh_mm_ss_m)) {
        return PrintLow.format(NIL, $str58$_2__0D__2__0D__2__0D__1__0D, new SubLObject[] {hour, minute, second, millisecond});
      } else {
        Errors.error($str59$Template_or_template_portion__A_w);
      }
    }
    return NIL;
  }

  /** Decode ELAPSED-SECONDS into 4 return values: seconds minutes hours elapsed-days */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 25585) 
  public static final SubLObject decode_elapsed_seconds(SubLObject elapsed_seconds) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(elapsed_seconds, $sym26$NON_NEGATIVE_NUMBER_P);
      thread.resetMultipleValues();
      {
        SubLObject truncated_exact_seconds = Numbers.truncate(elapsed_seconds, UNPROVIDED);
        SubLObject partial_seconds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject datum = number_utilities.decode_integer_multiples(truncated_exact_seconds, list($seconds_in_a_minute$.getGlobalValue(), $minutes_in_an_hour$.getGlobalValue(), $hours_in_a_day$.getGlobalValue()));
          SubLObject current = datum;
          SubLObject whole_seconds = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
          whole_seconds = current.first();
          current = current.rest();
          {
            SubLObject minutes = (current.isCons() ? ((SubLObject) current.first()) : ZERO_INTEGER);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list68);
            current = current.rest();
            {
              SubLObject hours = (current.isCons() ? ((SubLObject) current.first()) : ZERO_INTEGER);
              cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list68);
              current = current.rest();
              {
                SubLObject elapsed_days = (current.isCons() ? ((SubLObject) current.first()) : ZERO_INTEGER);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list68);
                current = current.rest();
                if ((NIL == current)) {
                  {
                    SubLObject seconds = Numbers.add(whole_seconds, partial_seconds);
                    return Values.values(seconds, minutes, hours, elapsed_days);
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list68);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Return T iff OBJECT is a valid universal date. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 29037) 
  public static final SubLObject universal_date_p(SubLObject object) {
    if (object.isInteger()) {
      if (object.isNegative()) {
        return universal_date_p(Numbers.minus(object));
      }
      {
        SubLObject temp = object;
        SubLObject day = Numbers.rem(temp, $int48$100);
        if (day.numLE($int14$31)) {
          temp = Numbers.integerDivide(temp, $int48$100);
          {
            SubLObject month = Numbers.rem(temp, $int48$100);
            if ((ONE_INTEGER.numLE(month)
                 && month.numLE(TWELVE_INTEGER))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Return the current date as an integer, i.e. 19660214 */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 29601) 
  public static final SubLObject get_universal_date(SubLObject universal_time, SubLObject time_zone) {
    if ((universal_time == UNPROVIDED)) {
      universal_time = Time.get_universal_time();
    }
    if ((time_zone == UNPROVIDED)) {
      time_zone = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(universal_time, $sym19$UNIVERSAL_TIME_P);
      thread.resetMultipleValues();
      {
        SubLObject second = Time.decode_universal_time(universal_time, time_zone);
        SubLObject minute = thread.secondMultipleValue();
        SubLObject hour = thread.thirdMultipleValue();
        SubLObject day = thread.fourthMultipleValue();
        SubLObject month = thread.fifthMultipleValue();
        SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_date(day, month, year);
      }
    }
  }

  /** encode DAY MONTH YEAR in a universal date integer of the form yyyymmdd */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 32323) 
  public static final SubLObject encode_universal_date(SubLObject day, SubLObject month, SubLObject year) {
    checkType(day, $sym80$INTEGERP);
    checkType(day, $sym82$PLUSP);
    checkType(month, $sym80$INTEGERP);
    checkType(month, $sym82$PLUSP);
    checkType(year, $sym80$INTEGERP);
    if (year.isNegative()) {
      return Numbers.minus(encode_universal_date(day, month, Numbers.minus(year)));
    } else {
      return Numbers.add(Numbers.multiply(year, $int81$10000), Numbers.multiply(month, $int48$100), day);
    }
  }

  /** A known pair to compute offset from.
The Julian date for the start of Aug 1, 2001 is 2452122.5 */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 37080) 
  private static SubLSymbol $julian_date_reference$ = null;

  /** ALISTP of number of days to add to get Julian date, with different precisions */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 37280) 
  private static SubLSymbol $julian_offsets$ = null;

  /** Return T iff OBJECT is a valid universal second. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 38911) 
  public static final SubLObject universal_second_p(SubLObject object) {
    if ((object.isInteger()
         && (!(object.isNegative()))
         && object.numLE($int91$235959))) {
      {
        SubLObject temp = object;
        if (Numbers.rem(temp, $int48$100).numL($seconds_in_a_minute$.getGlobalValue())) {
          temp = Numbers.integerDivide(temp, $int48$100);
          if (Numbers.rem(temp, $int48$100).numL($minutes_in_an_hour$.getGlobalValue())) {
            temp = Numbers.integerDivide(temp, $int48$100);
            if (temp.numL($hours_in_a_day$.getGlobalValue())) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Return the current second within the day as an integer in HHMMSS form, i.e. 235959 */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 39511) 
  public static final SubLObject get_universal_second(SubLObject universal_time) {
    if ((universal_time == UNPROVIDED)) {
      universal_time = Time.get_universal_time();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(universal_time, $sym19$UNIVERSAL_TIME_P);
      thread.resetMultipleValues();
      {
        SubLObject second = Time.decode_universal_time(universal_time, UNPROVIDED);
        SubLObject minute = thread.secondMultipleValue();
        SubLObject hour = thread.thirdMultipleValue();
        SubLObject day = thread.fourthMultipleValue();
        SubLObject month = thread.fifthMultipleValue();
        SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_second(second, minute, hour);
      }
    }
  }

  /** encode SECOND MINUTE HOUR in a universal second integer of the form HHMMSS */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 40376) 
  public static final SubLObject encode_universal_second(SubLObject second, SubLObject minute, SubLObject hour) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(second, $sym80$INTEGERP);
      checkType(minute, $sym80$INTEGERP);
      checkType(hour, $sym80$INTEGERP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!((ZERO_INTEGER.numLE(second)
               && second.numLE($int16$59))))) {
          Errors.error($str92$second__S_not_in_the_range_0_59, second);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!((ZERO_INTEGER.numLE(minute)
               && minute.numLE($int16$59))))) {
          Errors.error($str93$minute__S_not_in_the_range_0_59, minute);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!((ZERO_INTEGER.numLE(hour)
               && hour.numLE($int16$59))))) {
          Errors.error($str94$hour__S_not_in_the_range_0_59, hour);
        }
      }
      return Numbers.add(Numbers.multiply(hour, $int81$10000), Numbers.multiply(minute, $int48$100), second);
    }
  }

  /** Returns the current utc time with millisecond accuracy, taking into account the platform-specfic
   implementations of get-internal-real-time.
   @owner reed */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 44300) 
  public static final SubLObject get_utc_time_with_milliseconds() {
    {
      SubLObject internal_real_time = Time.get_internal_real_time();
      SubLObject universal_time = Time.get_universal_time();
      SubLObject divisor = Numbers.divide(time_high.$internal_time_units_per_second$.getGlobalValue(), $int23$1000);
      SubLObject internal_real_time_in_milliseconds = Numbers.truncate(Numbers.divide(internal_real_time, divisor), UNPROVIDED);
      SubLObject milliseconds = Numbers.rem(internal_real_time_in_milliseconds, $int23$1000);
      SubLObject time_in_milliseconds = Numbers.add(Numbers.multiply(universal_time, $int23$1000), milliseconds);
      return time_in_milliseconds;
    }
  }

  /** The usual number of days for each month. */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 52082) 
  private static SubLSymbol $month_duration_table$ = null;

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 53459) 
  public static SubLSymbol $number_wkday_table$ = null;

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 53852) 
  public static SubLSymbol $number_month_table$ = null;

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 55051) 
  public static final SubLObject elapsed_time_abbreviation_string(SubLObject elapsed_seconds) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject secs = decode_elapsed_seconds(elapsed_seconds);
        SubLObject mins = thread.secondMultipleValue();
        SubLObject hours = thread.thirdMultipleValue();
        SubLObject days = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        secs = Numbers.truncate(secs, UNPROVIDED);
        return (days.numG(ZERO_INTEGER) ? ((SubLObject) PrintLow.format(NIL, $str113$_D_day__P__D__2__0D__2__0D, new SubLObject[] {days, hours, mins, secs})) : (hours.numG(ZERO_INTEGER) ? ((SubLObject) PrintLow.format(NIL, $str114$_D__2__0D__2__0D, new SubLObject[] {hours, mins, secs})) : PrintLow.format(NIL, $str115$_D__2__0D, mins, secs)));
      }
    }
  }

  /** HACK */
  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 55469) 
  public static SubLSymbol $seconds_in_a_century$ = null;

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 55662) 
  public static SubLSymbol $seconds_in_an_odd_millennium$ = null;

  @SubL(source = "cycl/numeric-date-utilities.lisp", position = 55730) 
  public static SubLSymbol $seconds_in_an_even_millennium$ = null;

  public static final SubLObject declare_numeric_date_utilities_file() {
    declareMacro(myName, "elapsed_milliseconds", "ELAPSED-MILLISECONDS");
    declareFunction(myName, "valid_year_number_p", "VALID-YEAR-NUMBER-P", 1, 0, false);
    declareFunction(myName, "valid_month_number_p", "VALID-MONTH-NUMBER-P", 1, 0, false);
    declareFunction(myName, "valid_day_number_p", "VALID-DAY-NUMBER-P", 1, 0, false);
    declareFunction(myName, "valid_day_for_month_p", "VALID-DAY-FOR-MONTH-P", 3, 0, false);
    declareFunction(myName, "valid_hour_number_p", "VALID-HOUR-NUMBER-P", 1, 0, false);
    declareFunction(myName, "valid_minute_number_p", "VALID-MINUTE-NUMBER-P", 1, 0, false);
    declareFunction(myName, "valid_second_number_p", "VALID-SECOND-NUMBER-P", 1, 0, false);
    declareFunction(myName, "universal_time_p", "UNIVERSAL-TIME-P", 1, 0, false);
    declareFunction(myName, "universal_time_seconds_from_now", "UNIVERSAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
    declareFunction(myName, "time_from_now", "TIME-FROM-NOW", 1, 0, false);
    declareFunction(myName, "universal_time_from_now", "UNIVERSAL-TIME-FROM-NOW", 1, 2, false);
    declareFunction(myName, "timestring", "TIMESTRING", 0, 1, false);
    declareFunction(myName, "safe_timestring", "SAFE-TIMESTRING", 1, 0, false);
    declareFunction(myName, "timestring_int", "TIMESTRING-INT", 1, 0, false);
    declareFunction(myName, "timestamp", "TIMESTAMP", 0, 2, false);
    declareFunction(myName, "timestamp_with_milliseconds", "TIMESTAMP-WITH-MILLISECONDS", 0, 2, false);
    declareFunction(myName, "encode_timestring", "ENCODE-TIMESTRING", 6, 0, false);
    declareFunction(myName, "universal_timestring", "UNIVERSAL-TIMESTRING", 0, 1, false);
    declareFunction(myName, "encode_universal_timestring", "ENCODE-UNIVERSAL-TIMESTRING", 6, 0, false);
    declareFunction(myName, "get_universal_time_today", "GET-UNIVERSAL-TIME-TODAY", 3, 0, false);
    declareFunction(myName, "get_universal_time_within_next_day", "GET-UNIVERSAL-TIME-WITHIN-NEXT-DAY", 3, 0, false);
    declareFunction(myName, "universal_time_day_of_week_number", "UNIVERSAL-TIME-DAY-OF-WEEK-NUMBER", 0, 1, false);
    declareFunction(myName, "internal_real_time_p", "INTERNAL-REAL-TIME-P", 1, 0, false);
    declareFunction(myName, "internal_real_time_seconds_from_now", "INTERNAL-REAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
    declareFunction(myName, "elapsed_internal_real_time", "ELAPSED-INTERNAL-REAL-TIME", 1, 1, false);
    declareFunction(myName, "elapsed_internal_real_time_to_elapsed_seconds", "ELAPSED-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false);
    declareFunction(myName, "elapsed_seconds_to_elapsed_internal_real_time", "ELAPSED-SECONDS-TO-ELAPSED-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "elapsed_seconds_between_internal_real_times", "ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES", 2, 0, false);
    declareFunction(myName, "readable_elapsed_time_string", "READABLE-ELAPSED-TIME-STRING", 1, 1, false);
    declareFunction(myName, "datetime_string_from_template", "DATETIME-STRING-FROM-TEMPLATE", 0, 2, false);
    declareFunction(myName, "encode_datetime_string_from_template", "ENCODE-DATETIME-STRING-FROM-TEMPLATE", 8, 0, false);
    declareFunction(myName, "valid_date_template_char", "VALID-DATE-TEMPLATE-CHAR", 1, 0, false);
    declareFunction(myName, "valid_time_template_char", "VALID-TIME-TEMPLATE-CHAR", 1, 0, false);
    declareFunction(myName, "valid_date_separator", "VALID-DATE-SEPARATOR", 1, 0, false);
    declareFunction(myName, "valid_time_separator", "VALID-TIME-SEPARATOR", 1, 0, false);
    declareFunction(myName, "valid_year_token", "VALID-YEAR-TOKEN", 1, 0, false);
    declareFunction(myName, "valid_month_token", "VALID-MONTH-TOKEN", 1, 0, false);
    declareFunction(myName, "valid_day_token", "VALID-DAY-TOKEN", 1, 0, false);
    declareFunction(myName, "valid_hour_token", "VALID-HOUR-TOKEN", 1, 0, false);
    declareFunction(myName, "valid_minute_token", "VALID-MINUTE-TOKEN", 1, 0, false);
    declareFunction(myName, "valid_second_token", "VALID-SECOND-TOKEN", 1, 0, false);
    declareFunction(myName, "date_template_p", "DATE-TEMPLATE-P", 1, 0, false);
    declareFunction(myName, "time_template_p", "TIME-TEMPLATE-P", 1, 0, false);
    declareFunction(myName, "datetime_string_template_p", "DATETIME-STRING-TEMPLATE-P", 1, 0, false);
    declareFunction(myName, "non_date_time_whitespace_p", "NON-DATE-TIME-WHITESPACE-P", 1, 0, false);
    declareFunction(myName, "date_time_whitespace_p", "DATE-TIME-WHITESPACE-P", 1, 0, false);
    declareFunction(myName, "n_digit_template_element_p", "N-DIGIT-TEMPLATE-ELEMENT-P", 4, 0, false);
    declareFunction(myName, "encode_date_from_template", "ENCODE-DATE-FROM-TEMPLATE", 4, 0, false);
    declareFunction(myName, "encode_next_date_element", "ENCODE-NEXT-DATE-ELEMENT", 6, 0, false);
    declareFunction(myName, "encode_time_from_template", "ENCODE-TIME-FROM-TEMPLATE", 5, 0, false);
    declareFunction(myName, "decode_datetime_string_from_template", "DECODE-DATETIME-STRING-FROM-TEMPLATE", 2, 0, false);
    declareFunction(myName, "decode_date_from_template", "DECODE-DATE-FROM-TEMPLATE", 2, 3, false);
    declareFunction(myName, "decode_time_from_template", "DECODE-TIME-FROM-TEMPLATE", 2, 0, false);
    declareFunction(myName, "decode_elapsed_seconds", "DECODE-ELAPSED-SECONDS", 1, 0, false);
    declareFunction(myName, "decode_elapsed_seconds_without_days", "DECODE-ELAPSED-SECONDS-WITHOUT-DAYS", 1, 0, false);
    declareFunction(myName, "encode_elapsed_seconds", "ENCODE-ELAPSED-SECONDS", 0, 4, false);
    declareFunction(myName, "encode_elapsed_seconds_string", "ENCODE-ELAPSED-SECONDS-STRING", 0, 4, false);
    declareFunction(myName, "elapsed_seconds_string", "ELAPSED-SECONDS-STRING", 1, 0, false);
    declareFunction(myName, "universal_date_p", "UNIVERSAL-DATE-P", 1, 0, false);
    declareFunction(myName, "get_universal_date", "GET-UNIVERSAL-DATE", 0, 2, false);
    declareFunction(myName, "today", "TODAY", 0, 0, false);
    declareFunction(myName, "yesterday", "YESTERDAY", 0, 0, false);
    declareFunction(myName, "tomorrow", "TOMORROW", 0, 0, false);
    declareFunction(myName, "this_year", "THIS-YEAR", 0, 0, false);
    declareFunction(myName, "universal_date_add_days", "UNIVERSAL-DATE-ADD-DAYS", 2, 0, false);
    declareFunction(myName, "universal_date_subtract_days", "UNIVERSAL-DATE-SUBTRACT-DAYS", 2, 0, false);
    declareFunction(myName, "universal_date_add_days_int", "UNIVERSAL-DATE-ADD-DAYS-INT", 2, 0, false);
    declareFunction(myName, "decode_universal_date", "DECODE-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "day_from_universal_date", "DAY-FROM-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "month_from_universal_date", "MONTH-FROM-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "year_from_universal_date", "YEAR-FROM-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "encode_universal_date", "ENCODE-UNIVERSAL-DATE", 3, 0, false);
    declareFunction(myName, "datestring", "DATESTRING", 0, 1, false);
    declareFunction(myName, "datestringL", "DATESTRING<", 2, 0, false);
    declareFunction(myName, "datestring_", "DATESTRING-", 2, 0, false);
    declareFunction(myName, "datestring_year", "DATESTRING-YEAR", 1, 0, false);
    declareFunction(myName, "datestring_month", "DATESTRING-MONTH", 1, 0, false);
    declareFunction(myName, "datestring_day", "DATESTRING-DAY", 1, 0, false);
    declareFunction(myName, "encode_datestring", "ENCODE-DATESTRING", 3, 0, false);
    declareFunction(myName, "decode_datestring", "DECODE-DATESTRING", 1, 0, false);
    declareFunction(myName, "month_ago", "MONTH-AGO", 0, 2, false);
    declareFunction(myName, "get_julian_date", "GET-JULIAN-DATE", 0, 2, false);
    declareFunction(myName, "julian_date_from_universal_date", "JULIAN-DATE-FROM-UNIVERSAL-DATE", 1, 1, false);
    declareFunction(myName, "julian_offset", "JULIAN-OFFSET", 1, 0, false);
    declareFunction(myName, "compute_julian_offset", "COMPUTE-JULIAN-OFFSET", 1, 0, false);
    declareFunction(myName, "universal_time_for_start_of_universal_date", "UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE", 1, 1, false);
    declareFunction(myName, "universal_days", "UNIVERSAL-DAYS", 2, 0, false);
    declareFunction(myName, "universal_second_p", "UNIVERSAL-SECOND-P", 1, 0, false);
    declareFunction(myName, "get_universal_second", "GET-UNIVERSAL-SECOND", 0, 1, false);
    declareFunction(myName, "decode_universal_second", "DECODE-UNIVERSAL-SECOND", 0, 1, false);
    declareFunction(myName, "encode_universal_second", "ENCODE-UNIVERSAL-SECOND", 3, 0, false);
    declareFunction(myName, "secondstring", "SECONDSTRING", 0, 1, false);
    declareFunction(myName, "encode_secondstring", "ENCODE-SECONDSTRING", 3, 0, false);
    declareFunction(myName, "decode_secondstring", "DECODE-SECONDSTRING", 1, 0, false);
    declareFunction(myName, "secondstring_", "SECONDSTRING-", 2, 0, false);
    declareFunction(myName, "secondstring_hour", "SECONDSTRING-HOUR", 1, 0, false);
    declareFunction(myName, "secondstring_minute", "SECONDSTRING-MINUTE", 1, 0, false);
    declareFunction(myName, "secondstring_second", "SECONDSTRING-SECOND", 1, 0, false);
    declareFunction(myName, "encode_millisecondstring", "ENCODE-MILLISECONDSTRING", 2, 2, false);
    declareFunction(myName, "universal_date_and_second_from_time", "UNIVERSAL-DATE-AND-SECOND-FROM-TIME", 0, 1, false);
    declareFunction(myName, "universal_time_from_date_and_second", "UNIVERSAL-TIME-FROM-DATE-AND-SECOND", 1, 1, false);
    declareFunction(myName, "get_utc_time_with_milliseconds", "GET-UTC-TIME-WITH-MILLISECONDS", 0, 0, false);
    declareFunction(myName, "get_universal_millisecond", "GET-UNIVERSAL-MILLISECOND", 0, 1, false);
    declareFunction(myName, "extended_universal_date_p", "EXTENDED-UNIVERSAL-DATE-P", 1, 0, false);
    declareFunction(myName, "get_extended_universal_date", "GET-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "encode_extended_universal_date", "ENCODE-EXTENDED-UNIVERSAL-DATE", 6, 0, false);
    declareFunction(myName, "decode_extended_universal_date", "DECODE-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
    declareFunction(myName, "encode_universal_time_for_extended_universal_date", "ENCODE-UNIVERSAL-TIME-FOR-EXTENDED-UNIVERSAL-DATE", 1, 1, false);
    declareFunction(myName, "preceding_extended_universal_date", "PRECEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
    declareFunction(myName, "succeeding_extended_universal_date", "SUCCEEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
    declareFunction(myName, "extended_universal_dateL", "EXTENDED-UNIVERSAL-DATE<", 2, 0, false);
    declareFunction(myName, "adjust_year_month_day", "ADJUST-YEAR-MONTH-DAY", 3, 0, false);
    declareFunction(myName, "adjust_year_month_day_hour_min_sec", "ADJUST-YEAR-MONTH-DAY-HOUR-MIN-SEC", 6, 0, false);
    declareFunction(myName, "leap_year_p", "LEAP-YEAR-P", 1, 0, false);
    declareFunction(myName, "usual_days_in_month_number", "USUAL-DAYS-IN-MONTH-NUMBER", 1, 0, false);
    declareFunction(myName, "days_in_month_number", "DAYS-IN-MONTH-NUMBER", 2, 0, false);
    declareFunction(myName, "total_days_in_months_preceding", "TOTAL-DAYS-IN-MONTHS-PRECEDING", 2, 0, false);
    declareFunction(myName, "day_of_week_number_abbrev", "DAY-OF-WEEK-NUMBER-ABBREV", 1, 0, false);
    declareFunction(myName, "month_number_abbrev", "MONTH-NUMBER-ABBREV", 1, 0, false);
    declareFunction(myName, "abbreviation_for_month_number", "ABBREVIATION-FOR-MONTH-NUMBER", 1, 0, false);
    declareFunction(myName, "date_abbreviation_string", "DATE-ABBREVIATION-STRING", 1, 0, false);
    declareFunction(myName, "today_abbreviation_string", "TODAY-ABBREVIATION-STRING", 0, 0, false);
    declareFunction(myName, "time_abbreviation_string", "TIME-ABBREVIATION-STRING", 0, 1, false);
    declareFunction(myName, "elapsed_time_abbreviation_string", "ELAPSED-TIME-ABBREVIATION-STRING", 1, 0, false);
    declareFunction(myName, "seconds_in_year", "SECONDS-IN-YEAR", 1, 0, false);
    declareFunction(myName, "seconds_in_millennium", "SECONDS-IN-MILLENNIUM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_numeric_date_utilities_file() {
    $seconds_in_a_leap_year$ = defconstant("*SECONDS-IN-A-LEAP-YEAR*", $int0$31622400);
    $seconds_in_a_non_leap_year$ = defconstant("*SECONDS-IN-A-NON-LEAP-YEAR*", $int1$31536000);
    $seconds_in_a_week$ = defconstant("*SECONDS-IN-A-WEEK*", $int2$604800);
    $seconds_in_a_day$ = defconstant("*SECONDS-IN-A-DAY*", $int3$86400);
    $seconds_in_an_hour$ = defconstant("*SECONDS-IN-AN-HOUR*", $int4$3600);
    $seconds_in_a_minute$ = defconstant("*SECONDS-IN-A-MINUTE*", $int5$60);
    $minutes_in_an_hour$ = defconstant("*MINUTES-IN-AN-HOUR*", $int5$60);
    $hours_in_a_day$ = defconstant("*HOURS-IN-A-DAY*", $int6$24);
    $months_in_a_year$ = defconstant("*MONTHS-IN-A-YEAR*", TWELVE_INTEGER);
    $julian_date_reference$ = defconstant("*JULIAN-DATE-REFERENCE*", $list88);
    $julian_offsets$ = deflexical("*JULIAN-OFFSETS*", ((NIL != Symbols.boundp($sym89$_JULIAN_OFFSETS_)) ? ((SubLObject) $julian_offsets$.getGlobalValue()) : NIL));
    $month_duration_table$ = deflexical("*MONTH-DURATION-TABLE*", $list105);
    $number_wkday_table$ = deflexical("*NUMBER-WKDAY-TABLE*", $list106);
    $number_month_table$ = deflexical("*NUMBER-MONTH-TABLE*", $list107);
    $seconds_in_a_century$ = defconstant("*SECONDS-IN-A-CENTURY*", $int116$3155760000);
    $seconds_in_an_odd_millennium$ = defconstant("*SECONDS-IN-AN-ODD-MILLENNIUM*", $int117$31556908800);
    $seconds_in_an_even_millennium$ = defconstant("*SECONDS-IN-AN-EVEN-MILLENNIUM*", $int118$31556995200);
    return NIL;
  }

  public static final SubLObject setup_numeric_date_utilities_file() {
    // CVS_ID("Id: numeric-date-utilities.lisp 128778 2009-09-16 15:15:08Z pace ");
    access_macros.define_obsolete_register($sym17$TIME_FROM_NOW, $list18);
    access_macros.define_obsolete_register($sym77$ELAPSED_SECONDS_STRING, $list78);
    subl_macro_promotions.declare_defglobal($sym89$_JULIAN_OFFSETS_);
    access_macros.define_obsolete_register($sym108$ABBREVIATION_FOR_MONTH_NUMBER, $list109);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$31622400 = makeInteger(31622400);
  public static final SubLInteger $int1$31536000 = makeInteger(31536000);
  public static final SubLInteger $int2$604800 = makeInteger(604800);
  public static final SubLInteger $int3$86400 = makeInteger(86400);
  public static final SubLInteger $int4$3600 = makeInteger(3600);
  public static final SubLInteger $int5$60 = makeInteger(60);
  public static final SubLInteger $int6$24 = makeInteger(24);
  public static final SubLList $list7 = list(list(makeSymbol("TIME")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym8$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym9$CTIME = makeSymbol("CTIME");
  public static final SubLSymbol $sym10$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym11$TRUNCATE = makeSymbol("TRUNCATE");
  public static final SubLSymbol $sym12$_ = makeSymbol("*");
  public static final SubLList $list13 = list(makeInteger(1000));
  public static final SubLInteger $int14$31 = makeInteger(31);
  public static final SubLInteger $int15$23 = makeInteger(23);
  public static final SubLInteger $int16$59 = makeInteger(59);
  public static final SubLSymbol $sym17$TIME_FROM_NOW = makeSymbol("TIME-FROM-NOW");
  public static final SubLList $list18 = list(makeSymbol("UNIVERSAL-TIME-SECONDS-FROM-NOW"));
  public static final SubLSymbol $sym19$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
  public static final SubLString $str20$ = makeString("");
  public static final SubLString $str21$_a__6__0D = makeString("~a-~6,'0D");
  public static final SubLString $str22$_a__6__0D__3__0D = makeString("~a-~6,'0D.~3,'0D");
  public static final SubLInteger $int23$1000 = makeInteger(1000);
  public static final SubLString $str24$mm_dd_yyyy_hh_mm_ss = makeString("mm/dd/yyyy hh:mm:ss");
  public static final SubLString $str25$_D_2__0D_2__0D_2__0D_2__0D_2__0D = makeString("~D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");
  public static final SubLSymbol $sym26$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
  public static final SubLSymbol $sym27$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str28$_D_second__P = makeString("~D second~:P");
  public static final SubLString $str29$__ = makeString("~,");
  public static final SubLString $str30$F_seconds = makeString("F seconds");
  public static final SubLString $str31$_D_hours___D_minute__P = makeString("~D hours, ~D minute~:P");
  public static final SubLString $str32$_D_minute__P__ = makeString("~D minute~:P, ");
  public static final SubLSymbol $sym33$DATETIME_STRING_TEMPLATE_P = makeSymbol("DATETIME-STRING-TEMPLATE-P");
  public static final SubLSymbol $sym34$NON_WHITESPACE_P = makeSymbol("NON-WHITESPACE-P");
  public static final SubLString $str35$_A__A = makeString("~A ~A");
  public static final SubLString $str36$Template__s_is_not_a_valid_dateti = makeString("Template ~s is not a valid datetime-string template.");
  public static final SubLList $list37 = list(new SubLObject[] {Characters.CHAR_y, Characters.CHAR_Y, Characters.CHAR_m, Characters.CHAR_M, Characters.CHAR_d, Characters.CHAR_D, Characters.CHAR_slash, Characters.CHAR_hyphen, Characters.CHAR_underbar});
  public static final SubLList $list38 = list(Characters.CHAR_h, Characters.CHAR_H, Characters.CHAR_m, Characters.CHAR_M, Characters.CHAR_s, Characters.CHAR_S, Characters.CHAR_colon);
  public static final SubLSymbol $sym39$VALID_DATE_TEMPLATE_CHAR = makeSymbol("VALID-DATE-TEMPLATE-CHAR");
  public static final SubLString $str40$hh_mm_ss = makeString("hh:mm:ss");
  public static final SubLString $str41$hh_mm_ss_mmm = makeString("hh:mm:ss.mmm");
  public static final SubLString $str42$hh_mm = makeString("hh:mm");
  public static final SubLString $str43$hh_mm_ss_m = makeString("hh:mm:ss.m");
  public static final SubLString $str44$hh_mm_ss_mm = makeString("hh:mm:ss.mm");
  public static final SubLSymbol $sym45$NON_DATE_TIME_WHITESPACE_P = makeSymbol("NON-DATE-TIME-WHITESPACE-P");
  public static final SubLSymbol $sym46$VALID_YEAR_TOKEN = makeSymbol("VALID-YEAR-TOKEN");
  public static final SubLSymbol $sym47$VALID_DATE_SEPARATOR = makeSymbol("VALID-DATE-SEPARATOR");
  public static final SubLInteger $int48$100 = makeInteger(100);
  public static final SubLSymbol $sym49$VALID_MONTH_TOKEN = makeSymbol("VALID-MONTH-TOKEN");
  public static final SubLSymbol $sym50$VALID_DAY_TOKEN = makeSymbol("VALID-DAY-TOKEN");
  public static final SubLString $str51$Template_or_template_portion__S_d = makeString("Template or template portion ~S didn't match any expected pattern");
  public static final SubLString $str52$_ = makeString("~");
  public static final SubLString $str53$__0D = makeString(",'0D");
  public static final SubLString $str54$_2__0D__2__0D__2__0D = makeString("~2,'0D:~2,'0D:~2,'0D");
  public static final SubLString $str55$_2__0D__2__0D = makeString("~2,'0D:~2,'0D");
  public static final SubLString $str56$_2__0D__2__0D__2__0D__3__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~3,'0D");
  public static final SubLString $str57$_2__0D__2__0D__2__0D__2__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~2,'0D");
  public static final SubLString $str58$_2__0D__2__0D__2__0D__1__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~1,'0D");
  public static final SubLString $str59$Template_or_template_portion__A_w = makeString("Template or template portion ~A wasn't a recognized time template.");
  public static final SubLString $str60$The_template__S_doesn_t_match_the = makeString("The template ~S doesn't match the datetime-string ~S");
  public static final SubLString $str61$Template_or_template_portion__A_w = makeString("Template or template portion ~A wasn't a recognized datetime template.");
  public static final SubLString $str62$The_date_string__A_and_the_templa = makeString("The date string ~A and the template ~A are of unequal length.");
  public static final SubLSymbol $kw63$EOF = makeKeyword("EOF");
  public static final SubLString $str64$Template_or_template_portion__A_d = makeString("Template or template portion ~A doesn't match datestring ~A");
  public static final SubLList $list65 = list(makeString("hh:mm:ss"), makeString("hh:mm"), makeString("hh:mm:ss.mmm"), makeString("hh:mm:ss.mm"), makeString("hh:mm:ss.m"));
  public static final SubLString $str66$The_template__A_is_not_a_recogniz = makeString("The template ~A is not a recognized timestring template.");
  public static final SubLString $str67$The_time_string__A_and_the_templa = makeString("The time string ~A and the template ~A are of unequal length.");
  public static final SubLList $list68 = list(makeSymbol("WHOLE-SECONDS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MINUTES"), ZERO_INTEGER), list(makeSymbol("HOURS"), ZERO_INTEGER), list(makeSymbol("ELAPSED-DAYS"), ZERO_INTEGER));
  public static final SubLList $list69 = list(makeSymbol("WHOLE-SECONDS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MINUTES"), ZERO_INTEGER), list(makeSymbol("HOURS"), ZERO_INTEGER));
  public static final SubLString $str70$__A_day_A = makeString(" ~A day~A");
  public static final SubLString $str71$s = makeString("s");
  public static final SubLString $str72$__A_hour_A = makeString(" ~A hour~A");
  public static final SubLString $str73$__A_minute_A = makeString(" ~A minute~A");
  public static final SubLSymbol $sym74$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str75$__A_second_A = makeString(" ~A second~A");
  public static final SubLString $str76$_0_seconds = makeString(" 0 seconds");
  public static final SubLSymbol $sym77$ELAPSED_SECONDS_STRING = makeSymbol("ELAPSED-SECONDS-STRING");
  public static final SubLList $list78 = list(makeSymbol("READABLE-ELAPSED-TIME-STRING"));
  public static final SubLSymbol $sym79$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym80$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLInteger $int81$10000 = makeInteger(10000);
  public static final SubLSymbol $sym82$PLUSP = makeSymbol("PLUSP");
  public static final SubLString $str83$_2__0d__2__0d__4__0d = makeString("~2,'0d/~2,'0d/~4,'0d");
  public static final SubLString $str84$_2__0d__2__0d__d = makeString("~2,'0d/~2,'0d/~d");
  public static final SubLString $str85$_2__0d__2__0d___d = makeString("~2,'0d/~2,'0d/-~d");
  public static final SubLSymbol $kw86$FLOAT = makeKeyword("FLOAT");
  public static final SubLSymbol $kw87$INTEGER = makeKeyword("INTEGER");
  public static final SubLList $list88 = cons(makeInteger(20010801), makeDouble(2452122.5));
  public static final SubLSymbol $sym89$_JULIAN_OFFSETS_ = makeSymbol("*JULIAN-OFFSETS*");
  public static final SubLList $list90 = cons(makeSymbol("REFERENCE-UNIVERSAL-DATE"), makeSymbol("REFERENCE-JULIAN-DATE"));
  public static final SubLInteger $int91$235959 = makeInteger(235959);
  public static final SubLString $str92$second__S_not_in_the_range_0_59 = makeString("second ~S not in the range 0-59");
  public static final SubLString $str93$minute__S_not_in_the_range_0_59 = makeString("minute ~S not in the range 0-59");
  public static final SubLString $str94$hour__S_not_in_the_range_0_59 = makeString("hour ~S not in the range 0-59");
  public static final SubLSymbol $sym95$UNIVERSAL_SECOND_P = makeSymbol("UNIVERSAL-SECOND-P");
  public static final SubLString $str96$_2__0d__2__0d__2__0d = makeString("~2,'0d:~2,'0d:~2,'0d");
  public static final SubLInteger $int97$999 = makeInteger(999);
  public static final SubLString $str98$second__S_not_in_the_range_0_999 = makeString("second ~S not in the range 0-999");
  public static final SubLString $str99$_2__0d__2__0d__2__0d__3__0d = makeString("~2,'0d:~2,'0d:~2,'0d.~3,'0d");
  public static final SubLInteger $int100$1000000 = makeInteger(1000000);
  public static final SubLInteger $int101$100000000 = makeInteger(100000000);
  public static final SubLInteger $int102$10000000000 = makeInteger("10000000000");
  public static final SubLString $str103$MM_DD_YY_adjust_problem___s__s__s = makeString("MM/DD/YY adjust problem: ~s ~s ~s");
  public static final SubLInteger $int104$400 = makeInteger(400);
  public static final SubLList $list105 = list(new SubLObject[] {makeInteger(31), makeInteger(28), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31)});
  public static final SubLList $list106 = list(cons(ZERO_INTEGER, makeString("Mon")), cons(ONE_INTEGER, makeString("Tue")), cons(TWO_INTEGER, makeString("Wed")), cons(THREE_INTEGER, makeString("Thu")), cons(FOUR_INTEGER, makeString("Fri")), cons(FIVE_INTEGER, makeString("Sat")), cons(SIX_INTEGER, makeString("Sun")));
  public static final SubLList $list107 = list(new SubLObject[] {cons(ONE_INTEGER, makeString("Jan")), cons(TWO_INTEGER, makeString("Feb")), cons(THREE_INTEGER, makeString("Mar")), cons(FOUR_INTEGER, makeString("Apr")), cons(FIVE_INTEGER, makeString("May")), cons(SIX_INTEGER, makeString("Jun")), cons(SEVEN_INTEGER, makeString("Jul")), cons(EIGHT_INTEGER, makeString("Aug")), cons(NINE_INTEGER, makeString("Sep")), cons(TEN_INTEGER, makeString("Oct")), cons(ELEVEN_INTEGER, makeString("Nov")), cons(TWELVE_INTEGER, makeString("Dec"))});
  public static final SubLSymbol $sym108$ABBREVIATION_FOR_MONTH_NUMBER = makeSymbol("ABBREVIATION-FOR-MONTH-NUMBER");
  public static final SubLList $list109 = list(makeSymbol("MONTH-NUMBER-ABBREV"));
  public static final SubLString $str110$_ = makeString(" ");
  public static final SubLString $str111$__ = makeString(", ");
  public static final SubLString $str112$_2__0D__2__0D__2__0D__2__0D__2__0 = makeString("~2,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");
  public static final SubLString $str113$_D_day__P__D__2__0D__2__0D = makeString("~D day~:P ~D:~2,'0D:~2,'0D");
  public static final SubLString $str114$_D__2__0D__2__0D = makeString("~D:~2,'0D:~2,'0D");
  public static final SubLString $str115$_D__2__0D = makeString("~D:~2,'0D");
  public static final SubLInteger $int116$3155760000 = makeInteger("3155760000");
  public static final SubLInteger $int117$31556908800 = makeInteger("31556908800");
  public static final SubLInteger $int118$31556995200 = makeInteger("31556995200");

  //// Initializers

  public void declareFunctions() {
    declare_numeric_date_utilities_file();
  }

  public void initializeVariables() {
    init_numeric_date_utilities_file();
  }

  public void runTopLevelForms() {
    setup_numeric_date_utilities_file();
  }

}
