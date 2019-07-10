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

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constant_reader;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.format_nil;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.stacks;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.tries;

public  final class string_utilities extends SubLTranslatedFile {

  //// Constructor

  private string_utilities() {}
  public static final SubLFile me = new string_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.string_utilities";

  //// Definitions

  @SubL(source = "cycl/string-utilities.lisp", position = 397) 
  public static SubLSymbol $point_char$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 440) 
  public static SubLSymbol $space_char$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 485) 
  public static SubLSymbol $tab_char$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 526) 
  public static SubLSymbol $empty_string$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 568) 
  public static SubLSymbol $new_line_string$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 636) 
  public static SubLSymbol $test_char$ = null;

  /** Return T iff OBJECT is an empty string. */
  @SubL(source = "cycl/string-utilities.lisp", position = 1278) 
  public static final SubLObject empty_string_p(SubLObject object) {
    return Equality.equal($empty_string$.getGlobalValue(), object);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 2648) 
  private static SubLSymbol $object_to_string_caching_state$ = null;

  /** @return string ; string representation of VALUE
   @note This is equivalent to princ-to-string; use @xref to-lisp-string if embedded quotes should be retained. */
  @SubL(source = "cycl/string-utilities.lisp", position = 3453) 
  public static final SubLObject to_string(SubLObject value) {
    return print_high.princ_to_string(value);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 7230) 
  public static final SubLObject str(SubLObject object) {
    return format_nil.format_nil_a(object);
  }

  /** @return character ; first character in string */
  @SubL(source = "cycl/string-utilities.lisp", position = 9583) 
  public static final SubLObject first_char(SubLObject string) {
    return Strings.sublisp_char(string, ZERO_INTEGER);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 20673) 
  public static final SubLObject substring(SubLObject string, SubLObject start, SubLObject end) {
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(string, $sym12$STRINGP);
    return Sequences.subseq(string, start, end);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 21456) 
  public static final SubLObject ends_with(SubLObject w, SubLObject ending, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    return makeBoolean(((NIL != list_utilities.greater_or_same_length_p(w, ending))
           && (NIL != substring_matchP(w, ending, Numbers.subtract(Sequences.length(w), Sequences.length(ending)), test))));
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 22823) 
  public static final SubLObject starts_with(SubLObject w, SubLObject starting) {
    return makeBoolean(((NIL != list_utilities.greater_or_same_length_p(w, starting))
           && (NIL != substring_matchP(w, starting, ZERO_INTEGER, Symbols.symbol_function(EQUAL)))));
  }

  /** Return the number of the position of the first occurrence of CHAR in STRING,
   starting from position N in STRING. */
  @SubL(source = "cycl/string-utilities.lisp", position = 29258) 
  public static final SubLObject char_position(SubLObject v_char, SubLObject string, SubLObject n) {
    if ((n == UNPROVIDED)) {
      n = ZERO_INTEGER;
    }
    return Sequences.position(v_char, string, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), n, UNPROVIDED);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 29482) 
  public static final SubLObject string_upto(SubLObject string, SubLObject v_char) {
    if ((v_char == UNPROVIDED)) {
      v_char = Characters.CHAR_space;
    }
    {
      SubLObject pos = char_position(v_char, string, UNPROVIDED);
      if ((NIL != pos)) {
        return Sequences.subseq(string, ZERO_INTEGER, pos);
      } else {
        return string;
      }
    }
  }


  /** Like cconcatenate, but takes a list of strings as its argument. */
  @SubL(source = "cycl/string-utilities.lisp", position = 86945) 
  public static final SubLObject strcat(SubLObject string_list) {
    if ((NIL == string_list)) {
      return NIL;
    } else {
      return Functions.apply(Symbols.symbol_function($sym87$CCONCATENATE), string_list);
    }
  }


  @SubL(source = "cycl/string-utilities.lisp", position = 119787) 
  public static final SubLObject stringify_terms(SubLObject terms, SubLObject separator, SubLObject last_separator) {
    if ((separator == UNPROVIDED)) {
      separator = $str19$_;
    }
    if ((last_separator == UNPROVIDED)) {
      last_separator = separator;
    }
    return stringify_items(terms, Symbols.symbol_function($sym111$FORT_PRINT_NAME), separator, last_separator);
  }


  @SubL(source = "cycl/string-utilities.lisp", position = 120245) 
  public static final SubLObject stringify_items(SubLObject items, SubLObject accessor, SubLObject separator, SubLObject last_separator) {
    if ((accessor == UNPROVIDED)) {
      accessor = Symbols.symbol_function($sym112$STR_BY_TYPE);
    }
    if ((separator == UNPROVIDED)) {
      separator = $str19$_;
    }
    if ((last_separator == UNPROVIDED)) {
      last_separator = separator;
    }
    if ((NIL == items)) {
      return $empty_string$.getGlobalValue();
    } else if ((NIL != list_utilities.singletonP(items))) {
      return str_by_type(Functions.funcall(accessor, items.first()));
    } else {
      {
        SubLObject names = Mapping.mapcar(Symbols.symbol_function($sym112$STR_BY_TYPE), Mapping.mapcar(accessor, Sequences.reverse(items)));
        SubLObject result = Sequences.cconcatenate(conses_high.second(names), new SubLObject[] {last_separator, names.first()});
        SubLObject cdolist_list_var = conses_high.cddr(names);
        SubLObject name = NIL;
        for (name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), name = cdolist_list_var.first()) {
          result = Sequences.cconcatenate(name, new SubLObject[] {separator, result});
        }
        return PrintLow.format(NIL, result);
      }
    }
  }


  @SubL(source = "cycl/string-utilities.lisp", position = 120756) 
  public static final SubLObject str_by_type(SubLObject object) {
    if (object.isString()) {
      return object;
    } else if ((NIL != constant_handles.constant_p(object))) {
      return constants_high.constant_name(object);
    } else {
      return str(object);
    }
  }

  
  /** dynamic variable used only by char-set-position */
  @SubL(source = "cycl/string-utilities.lisp", position = 34826) 
  public static SubLSymbol $char_set$ = null;

  /** Return the position of the first character satisfying CHAR-TYPE in STRING.
The positions to start looking in STRING are delimited by START and END */
  @SubL(source = "cycl/string-utilities.lisp", position = 35353) 
  public static final SubLObject char_type_position(SubLObject char_type, SubLObject string, SubLObject start, SubLObject end) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(string, $sym12$STRINGP);
    return Sequences.position_if(char_type, string, Symbols.symbol_function(IDENTITY), start, end);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 36010) 
  public static final SubLObject not_digit_char_p(SubLObject thing) {
    return makeBoolean((NIL == Characters.digit_char_p(thing, UNPROVIDED)));
  }

  public static final class $not_digit_char_p$UnaryFunction extends UnaryFunction {
    public $not_digit_char_p$UnaryFunction() { super(extractFunctionNamed("NOT-DIGIT-CHAR-P")); }
    public SubLObject processItem(SubLObject arg1) { return not_digit_char_p(arg1); }
  }

  /** Set the Nth character of STRING to NEW-CHAR.
@param SAFE? boolean; Should we make sure args are legit?
@note destructive */
  @SubL(source = "cycl/string-utilities.lisp", position = 41002) 
  public static final SubLObject set_nth_char(SubLObject n, SubLObject string, SubLObject new_char, SubLObject safeP) {
    if ((safeP == UNPROVIDED)) {
      safeP = T;
    }
    if ((NIL != safeP)) {
      checkType(string, $sym12$STRINGP);
      checkType(n, $sym36$NON_NEGATIVE_INTEGER_P);
      checkType(new_char, $sym34$CHARACTERP);
    }
    if (((NIL == safeP)
        || (NIL != list_utilities.lengthG(string, n, UNPROVIDED)))) {
      Strings.set_char(string, n, new_char);
    }
    return string;
  }

  public static final class $string_wXo_control_charsP$UnaryFunction extends UnaryFunction {
    public $string_wXo_control_charsP$UnaryFunction() { super(extractFunctionNamed("STRING-W/O-CONTROL-CHARS?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7599"); }
  }

  public static final class $char_in_char_set$UnaryFunction extends UnaryFunction {
    public $char_in_char_set$UnaryFunction() { super(extractFunctionNamed("CHAR-IN-CHAR-SET")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7328"); }
  }

  /** Is LITTLE a substring of BIG starting at or after START-INDEX, and
ending before END-INDEX (if non-nil)? */
  @SubL(source = "cycl/string-utilities.lisp", position = 46118) 
  public static final SubLObject substringP(SubLObject little, SubLObject big, SubLObject test, SubLObject start_index, SubLObject end_index) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUALP);
    }
    if ((start_index == UNPROVIDED)) {
      start_index = ZERO_INTEGER;
    }
    if ((end_index == UNPROVIDED)) {
      end_index = NIL;
    }
    if ((!((little.isString()
           && big.isString())))) {
      return NIL;
    }
    if ((NIL != list_utilities.lengthE(little, ONE_INTEGER, UNPROVIDED))) {
      return Sequences.find(first_char(little), big, test, Symbols.symbol_function(IDENTITY), start_index, end_index);
    } else {
      return Sequences.search(little, big, test, Symbols.symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_index, end_index);
    }
  }

  /** Returns true if, after moving forward 'start' characters from the
   beginning of the string 'big', the next few characters match (string=)
   the string 'small'. */
  @SubL(source = "cycl/string-utilities.lisp", position = 47270) 
  public static final SubLObject substring_matchP(SubLObject big, SubLObject little, SubLObject start, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    {
      SubLObject end = Numbers.add(start, Sequences.length(little));
      return makeBoolean(((NIL != list_utilities.lengthGE(big, end, UNPROVIDED))
             && (NIL != substringP(little, big, test, start, end))));
    }
  }

  /** The mapping of integers to SubL characters, as specified by the Base64 Content-Transfer-Encoding in http://www.freesoft.org/CIE/RFC/1521/7.htm */
  @SubL(source = "cycl/string-utilities.lisp", position = 72709) 
  private static SubLSymbol $64_bit_encoding_table$ = null;

  /** An efficient index from integers in the range 0..63 to their corresponding character according to the Base64 Content-Transfer-Encoding. */
  @SubL(source = "cycl/string-utilities.lisp", position = 74159) 
  private static SubLSymbol $64_bit_integer_index$ = null;

  /** An efficient index from a subset of SubL characters to integers in the range 0..63 according to the Base64 Content-Transfer-Encoding. */
  @SubL(source = "cycl/string-utilities.lisp", position = 74400) 
  private static SubLSymbol $64_bit_char_index$ = null;

  /** @return booleanp; T if OBJECT is an uppercase alphabetic character or a digit (numeric) character */
  @SubL(source = "cycl/string-utilities.lisp", position = 75370) 
  public static final SubLObject upper_case_alphanumeric_p(SubLObject object) {
    return makeBoolean(((NIL != Characters.upper_case_p(object))
          || (NIL != Characters.digit_char_p(object, UNPROVIDED))));
  }

  /** All symbolic names that LISP provides for different types of whitespace. */
  @SubL(source = "cycl/string-utilities.lisp", position = 79590) 
  private static SubLSymbol $raw_whitespace_chars$ = null;

  /** The actual set of white space characters in this LISP implementation. */
  @SubL(source = "cycl/string-utilities.lisp", position = 79838) 
  private static SubLSymbol $whitespace_chars$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 80013) 
  public static final SubLObject whitespace_chars() {
    return conses_high.copy_list($whitespace_chars$.getGlobalValue());
  }

  /** The list of chars that are syntactic punctuation only (not used inside words).
Note -- does not include periods because they can occur inside number expressions. */
  @SubL(source = "cycl/string-utilities.lisp", position = 80089) 
  private static SubLSymbol $grammatical_punctuation_chars$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 81585) 
  public static final SubLObject whitespacep(SubLObject v_char) {
    return makeBoolean((v_char.isChar()
           && (NIL != Sequences.find(v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
  }

  public static final class $whitespacep$UnaryFunction extends UnaryFunction {
    public $whitespacep$UnaryFunction() { super(extractFunctionNamed("WHITESPACEP")); }
    public SubLObject processItem(SubLObject arg1) { return whitespacep(arg1); }
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 81684) 
  public static final SubLObject non_whitespace_p(SubLObject v_char) {
    return makeBoolean((NIL == whitespacep(v_char)));
  }

  /** Takes a string (such as an English phrase or sentence).  Returns
a list of words, based on the break points implied by the function
non-break-char-test (characters that fail the test are break points),
and whether or not embedded strings should be left alone. */
  @SubL(source = "cycl/string-utilities.lisp", position = 92367) 
  public static final SubLObject break_words(SubLObject string, SubLObject non_break_char_test, SubLObject leave_embedded_stringsP) {
    if ((non_break_char_test == UNPROVIDED)) {
      non_break_char_test = Symbols.symbol_function($sym91$VALID_CONSTANT_NAME_CHAR_P);
    }
    if ((leave_embedded_stringsP == UNPROVIDED)) {
      leave_embedded_stringsP = NIL;
    }
    {
      SubLObject len = Sequences.length(string);
      SubLObject p1 = ZERO_INTEGER;
      SubLObject p2 = ONE_INTEGER;
      SubLObject ans = NIL;
      SubLObject inside_dqP = NIL;
      for (; (!(p2.numG(len))); ) {
        {
          SubLObject px = Numbers.subtract(p2, ONE_INTEGER);
          SubLObject c1 = Strings.sublisp_char(string, p1);
          SubLObject c2 = (p2.numL(len) ? ((SubLObject) Strings.sublisp_char(string, p2)) : NIL);
          SubLObject cx = Strings.sublisp_char(string, px);
          SubLObject c1_is_breakP = makeBoolean((c1.isChar()
               && ((NIL == leave_embedded_stringsP)
                || (NIL == Characters.charE(c1, Characters.CHAR_quotation)))
               && (NIL == Functions.funcall(non_break_char_test, c1))));
          SubLObject c2_is_breakP = makeBoolean((c2.isChar()
               && ((NIL == leave_embedded_stringsP)
                || (NIL == Characters.charE(c2, Characters.CHAR_quotation)))
               && (NIL == Functions.funcall(non_break_char_test, c2))));
          if (((NIL != Characters.charE(c1, Characters.CHAR_quotation))
               && (NIL != leave_embedded_stringsP))) {
            if ((NIL != inside_dqP)) {
              if (((NIL != Characters.charE(cx, Characters.CHAR_quotation))
                   && (!(p1.numE(px))))) {
                inside_dqP = NIL;
              }
            } else {
              inside_dqP = T;
            }
          }
          if ((p2.numE(len)
               && (NIL == c1_is_breakP))) {
            ans = cons(Sequences.subseq(string, p1, p2), ans);
            p2 = Numbers.add(p2, ONE_INTEGER);
          } else if ((NIL != c1_is_breakP)) {
            p1 = Numbers.add(p1, ONE_INTEGER);
            p2 = Numbers.add(p1, ONE_INTEGER);
          } else if ((!(((NIL != c1_is_breakP)
                || (NIL != c2_is_breakP))))) {
            p2 = Numbers.add(p2, ONE_INTEGER);
          } else if (((NIL == c1_is_breakP)
               && (NIL == inside_dqP)
               && (NIL != c2_is_breakP))) {
            ans = cons(Sequences.subseq(string, p1, p2), ans);
            p1 = Numbers.add(p2, ONE_INTEGER);
            p2 = Numbers.add(p1, ONE_INTEGER);
          } else if (((NIL == c1_is_breakP)
               && (NIL != inside_dqP)
               && (NIL != c2_is_breakP))) {
            p2 = Numbers.add(p2, ONE_INTEGER);
          }
        }
      }
      return Sequences.nreverse(ans);
    }
  }

  /** Coerce a list of characters to a string */
  @SubL(source = "cycl/string-utilities.lisp", position = 97389) 
  public static final SubLObject char_list_to_string(SubLObject chars) {
    {
      SubLObject len = Sequences.length(chars);
      SubLObject i = ZERO_INTEGER;
      SubLObject string = Strings.make_string(len, UNPROVIDED);
      SubLObject cdolist_list_var = chars;
      SubLObject c = NIL;
      for (c = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), c = cdolist_list_var.first()) {
        {
          SubLObject char_to_use = (c.isChar() ? ((SubLObject) c) : Characters.CHAR_space);
          set_nth_char(i, string, char_to_use, NIL);
        }
        i = Numbers.add(i, ONE_INTEGER);
      }
      return string;
    }
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 98653) 
  public static SubLSymbol $target_characters$ = null;

  /** Make a fake constant name (a string) by capitalizing words after whitespace (and symbols) then eliminating invalid constant characters, including spaces.
@example (make-valid-constant-name "this is a fake constant! 200 #$") returns "ThisIsAFakeConstant200".
@note We *could* use STRING-PROPER and (STRING-SUBST "" " " ...), but we're mad at those functions and don't want to call them.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/string-utilities.lisp", position = 102437) 
  public static final SubLObject make_valid_constant_name(SubLObject in_string, SubLObject upcase_initial_letterP) {
    if ((upcase_initial_letterP == UNPROVIDED)) {
      upcase_initial_letterP = T;
    }
    {
      SubLObject cur_string_list = NIL;
      SubLObject should_we_upcaseP = upcase_initial_letterP;
      SubLObject string_var = in_string;
      SubLObject end_var = Sequences.length(string_var);
      SubLObject end_var_34 = end_var;
      SubLObject char_num = NIL;
      for (char_num = ZERO_INTEGER; (!(char_num.numGE(end_var_34))); char_num = number_utilities.f_1X(char_num)) {
        {
          SubLObject this_character = Strings.sublisp_char(string_var, char_num);
          if ((NIL != constant_completion_high.valid_constant_name_char_p(this_character))) {
            if ((NIL != Characters.alphanumericp(this_character))) {
              if ((NIL != should_we_upcaseP)) {
                cur_string_list = cons(Strings.string_upcase(Strings.make_string(ONE_INTEGER, this_character), UNPROVIDED, UNPROVIDED), cur_string_list);
                should_we_upcaseP = NIL;
              } else {
                cur_string_list = cons(Strings.make_string(ONE_INTEGER, this_character), cur_string_list);
              }
            } else {
              cur_string_list = cons(Strings.make_string(ONE_INTEGER, this_character), cur_string_list);
              should_we_upcaseP = T;
            }
          } else {
            should_we_upcaseP = T;
          }
        }
      }
      return Functions.apply(Symbols.symbol_function($sym87$CCONCATENATE), Sequences.nreverse(cur_string_list));
    }
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 104196) 
  public static final SubLObject string_tokenize(SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars, SubLObject break_list_to_return) {
    if ((break_list == UNPROVIDED)) {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    if ((embed_list == UNPROVIDED)) {
      embed_list = NIL;
    }
    if ((include_stopsP == UNPROVIDED)) {
      include_stopsP = NIL;
    }
    if ((ignore_empty_stringsP == UNPROVIDED)) {
      ignore_empty_stringsP = NIL;
    }
    if ((quote_chars == UNPROVIDED)) {
      quote_chars = NIL;
    }
    if ((break_list_to_return == UNPROVIDED)) {
      break_list_to_return = NIL;
    }
    return string_tokenize_int(in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars);
  }

  /** Breaks IN-STRING on any string sequence in BREAK-LIST.  Returns a list of strings.  EMBED-LIST should be a list of pairs of strings specifying start and end characters between which we ignore breaks.  If INCLUDE-STOPS? is T then the break elements will be included in the resulting list.  If IGNORE-EMPTY-STRING is T then there will be no empty strings in the result list.  QUOTE-CHARS should be a list of characters (characters, not strings) which mean that the next character should be treated literally, not as a break or a embed-char (a common example is backslash in UN*X.  The priority of the breaks is specified in BREAK-LIST (i.e. initial entries will be broken first).
@param BREAK-LIST listp; of characters and/or strings to break on.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/string-utilities.lisp", position = 104568) 
  public static final SubLObject string_tokenize_int(SubLObject in_string, SubLObject break_list, SubLObject break_list_to_return, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars) {
    if ((break_list == UNPROVIDED)) {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    if ((break_list_to_return == UNPROVIDED)) {
      break_list_to_return = NIL;
    }
    if ((embed_list == UNPROVIDED)) {
      embed_list = NIL;
    }
    if ((include_stopsP == UNPROVIDED)) {
      include_stopsP = NIL;
    }
    if ((ignore_empty_stringsP == UNPROVIDED)) {
      ignore_empty_stringsP = NIL;
    }
    if ((quote_chars == UNPROVIDED)) {
      quote_chars = NIL;
    }
    if ($kw99$DEFAULT.eql(break_list)) {
      break_list = $whitespace_chars$.getGlobalValue();
    }
    {
      SubLObject out_string_list = NIL;
      SubLObject cur_string = $empty_string$.getGlobalValue();
      SubLObject cur_char_list = NIL;
      SubLObject break_satisfiedP = NIL;
      SubLObject this_quotedP = NIL;
      SubLObject complete_break_list = Sequences.cconcatenate(break_list_to_return, break_list);
      SubLObject string_var = in_string;
      SubLObject end_var = Sequences.length(string_var);
      SubLObject end_var_35 = end_var;
      SubLObject pos_now = NIL;
      for (pos_now = ZERO_INTEGER; (!(pos_now.numGE(end_var_35))); pos_now = number_utilities.f_1X(pos_now)) {
        {
          SubLObject this_character = Strings.sublisp_char(string_var, pos_now);
          if ((NIL != this_quotedP)) {
            this_quotedP = NIL;
            cur_char_list = cons(this_character, cur_char_list);
          } else if ((NIL != conses_high.member(this_character, quote_chars, UNPROVIDED, UNPROVIDED))) {
            this_quotedP = T;
            cur_char_list = cons(this_character, cur_char_list);
          } else {
            {
              SubLObject cdolist_list_var = embed_list;
              SubLObject this_embed = NIL;
              for (this_embed = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), this_embed = cdolist_list_var.first()) {
                {
                  SubLObject this_embed_start = first_char(this_embed.first());
                  SubLObject this_embed_end = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7438");
                  if (this_character.eql(this_embed_start)) {
                    {
                      SubLObject pos_find = NIL;
                      SubLObject quotedP = NIL;
                      SubLObject doneP = NIL;
                      for (pos_find = number_utilities.f_1X(pos_now), quotedP = NIL, doneP = NIL; (!(((NIL != doneP)
                            || (NIL != list_utilities.lengthE(in_string, pos_find, UNPROVIDED))))); pos_find = number_utilities.f_1X(pos_find) //, quotedP = quotedP, doneP = doneP
                            ) {
                        cur_char_list = cons(this_character, cur_char_list);
                        pos_now = pos_find;
                        this_character = Strings.sublisp_char(in_string, pos_now);
                        if ((NIL != quotedP)) {
                          quotedP = NIL;
                        } else if (this_character.eql(this_embed_end)) {
                          doneP = T;
                        } else if ((NIL != conses_high.member(this_character, quote_chars, UNPROVIDED, UNPROVIDED))) {
                          quotedP = T;
                        }
                      }
                    }
                  }
                }
              }
            }
            {
              SubLObject found_a_breakP = NIL;
              if ((NIL == found_a_breakP)) {
                {
                  SubLObject csome_list_var = complete_break_list;
                  SubLObject this_break = NIL;
                  for (this_break = csome_list_var.first(); (!(((NIL != found_a_breakP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), this_break = csome_list_var.first()) {
                    {
                      SubLObject this_break_length = string_tokenize_break_length(this_break);
                      SubLObject post_break_pos = Numbers.add(pos_now, this_break_length);
                      if ((this_break_length.isPositive()
                           && (NIL != list_utilities.lengthGE(in_string, post_break_pos, UNPROVIDED))
                           && (NIL != string_tokenize_break_matchP(in_string, this_break, pos_now)))) {
                        found_a_breakP = T;
                        cur_string = char_list_to_string(Sequences.nreverse(cur_char_list));
                        if ((!(((NIL != ignore_empty_stringsP)
                               && (NIL != empty_string_p(cur_string)))))) {
                          out_string_list = cons(cur_string, out_string_list);
                        }
                        cur_char_list = NIL;
                        if (((NIL != include_stopsP)
                            || (NIL != conses_high.member(this_break, break_list_to_return, UNPROVIDED, UNPROVIDED)))) {
                          out_string_list = cons(format_nil.format_nil_a(this_break), out_string_list);
                        }
                        pos_now = number_utilities.f_1_(post_break_pos);
                        this_character = Strings.sublisp_char(in_string, pos_now);
                        break_satisfiedP = T;
                      }
                    }
                  }
                }
              }
            }
            if ((NIL != break_satisfiedP)) {
              break_satisfiedP = NIL;
            } else {
              cur_char_list = cons(this_character, cur_char_list);
            }
          }
        }
      }
      cur_string = char_list_to_string(Sequences.nreverse(cur_char_list));
      if ((!(((NIL != ignore_empty_stringsP)
             && (NIL != empty_string_p(cur_string)))))) {
        out_string_list = cons(cur_string, out_string_list);
      }
      if ((!(((NIL != out_string_list)
            || (NIL != ignore_empty_stringsP))))) {
        out_string_list = list($empty_string$.getGlobalValue());
      }
      return Sequences.nreverse(out_string_list);
    }
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 108445) 
  public static final SubLObject string_tokenize_break_length(SubLObject v_break) {
    if (v_break.isChar()) {
      return ONE_INTEGER;
    } else {
      return Sequences.length(v_break);
    }
  }

  /** @return BOOLEAN; Does IN-STRING match BREAK at position POS? */
  @SubL(source = "cycl/string-utilities.lisp", position = 108570) 
  public static final SubLObject string_tokenize_break_matchP(SubLObject in_string, SubLObject v_break, SubLObject pos) {
    if (v_break.isChar()) {
      return Characters.charE(Strings.sublisp_char(in_string, pos), v_break);
    } else {
      return substring_matchP(in_string, v_break, pos, $sym100$CHAR_);
    }
  }

  /** Metric used for string-trigraph-match-p, which is defined below. */
  @SubL(source = "cycl/string-utilities.lisp", position = 115218) 
  private static SubLSymbol $trigraph_metric$ = null;

  /** A list of one or more utility hash tables, used by
string-trigraph-match-p, which is defined below. */
  @SubL(source = "cycl/string-utilities.lisp", position = 115448) 
  private static SubLSymbol $trigraph_tables$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 121101) 
  private static SubLSymbol $cyclify_string_expand_subl_fn_strings$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 121296) 
  private static SubLSymbol $cyclify_string_subl_quote_fn_strings$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 121385) 
  private static SubLSymbol $cyclify_string_quote_chars$ = null;

  public static final class $cyclify_status_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $out_string_list; }
    public SubLObject getField3() { return $references_added; }
    public SubLObject getField4() { return $inside_quoteP; }
    public SubLObject getField5() { return $inside_el_var_nameP; }
    public SubLObject getField6() { return $already_cyclifiedP; }
    public SubLObject getField7() { return $escapeP; }
    public SubLObject getField8() { return $inside_subl_quote_fnP; }
    public SubLObject getField9() { return $inside_expand_subl_fnP; }
    public SubLObject getField10() { return $inside_expand_subl_fn_arg1P; }
    public SubLObject getField11() { return $inside_expand_subl_fn_arg2P; }
    public SubLObject getField12() { return $immediately_following_parenP; }
    public SubLObject getField13() { return $paren_count; }
    public SubLObject setField2(SubLObject value) { return $out_string_list = value; }
    public SubLObject setField3(SubLObject value) { return $references_added = value; }
    public SubLObject setField4(SubLObject value) { return $inside_quoteP = value; }
    public SubLObject setField5(SubLObject value) { return $inside_el_var_nameP = value; }
    public SubLObject setField6(SubLObject value) { return $already_cyclifiedP = value; }
    public SubLObject setField7(SubLObject value) { return $escapeP = value; }
    public SubLObject setField8(SubLObject value) { return $inside_subl_quote_fnP = value; }
    public SubLObject setField9(SubLObject value) { return $inside_expand_subl_fnP = value; }
    public SubLObject setField10(SubLObject value) { return $inside_expand_subl_fn_arg1P = value; }
    public SubLObject setField11(SubLObject value) { return $inside_expand_subl_fn_arg2P = value; }
    public SubLObject setField12(SubLObject value) { return $immediately_following_parenP = value; }
    public SubLObject setField13(SubLObject value) { return $paren_count = value; }
    public SubLObject $out_string_list = NIL;
    public SubLObject $references_added = NIL;
    public SubLObject $inside_quoteP = NIL;
    public SubLObject $inside_el_var_nameP = NIL;
    public SubLObject $already_cyclifiedP = NIL;
    public SubLObject $escapeP = NIL;
    public SubLObject $inside_subl_quote_fnP = NIL;
    public SubLObject $inside_expand_subl_fnP = NIL;
    public SubLObject $inside_expand_subl_fn_arg1P = NIL;
    public SubLObject $inside_expand_subl_fn_arg2P = NIL;
    public SubLObject $immediately_following_parenP = NIL;
    public SubLObject $paren_count = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cyclify_status_native.class, $sym117$CYCLIFY_STATUS, $sym118$CYCLIFY_STATUS_P, $list119, $list120, new String[] {"$out_string_list", "$references_added", "$inside_quoteP", "$inside_el_var_nameP", "$already_cyclifiedP", "$escapeP", "$inside_subl_quote_fnP", "$inside_expand_subl_fnP", "$inside_expand_subl_fn_arg1P", "$inside_expand_subl_fn_arg2P", "$immediately_following_parenP", "$paren_count"}, $list121, $list122, $sym123$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 121438) 
  public static SubLSymbol $dtp_cyclify_status$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 121438) 
  public static final SubLObject cyclify_status_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $cyclify_status_p$UnaryFunction extends UnaryFunction {
    public $cyclify_status_p$UnaryFunction() { super(extractFunctionNamed("CYCLIFY-STATUS-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7372"); }
  }

  @SubL(source = "cycl/string-utilities.lisp", position = 136964) 
  public static SubLSymbol $string_read_buffer_size$ = null;

  @SubL(source = "cycl/string-utilities.lisp", position = 137090) 
  public static SubLSymbol $string_read_buffer$ = null;

  public static final SubLObject declare_string_utilities_file() {
    //declareFunction(myName, "not_test_char", "NOT-TEST-CHAR", 1, 0, false);
    //declareMacro(myName, "do_words", "DO-WORDS");
    declareFunction(myName, "empty_string_p", "EMPTY-STRING-P", 1, 0, false);
    //declareFunction(myName, "empty_stringP", "EMPTY-STRING?", 1, 0, false);
    //declareFunction(myName, "non_empty_string_p", "NON-EMPTY-STRING-P", 1, 0, false);
    //declareFunction(myName, "every_in_string", "EVERY-IN-STRING", 2, 1, false);
    //declareFunction(myName, "any_in_string", "ANY-IN-STRING", 2, 1, false);
    //declareFunction(myName, "list_of_string_p", "LIST-OF-STRING-P", 1, 0, false);
    //declareFunction(myName, "clear_object_to_string", "CLEAR-OBJECT-TO-STRING", 0, 0, false);
    //declareFunction(myName, "remove_object_to_string", "REMOVE-OBJECT-TO-STRING", 1, 0, false);
    //declareFunction(myName, "object_to_string_internal", "OBJECT-TO-STRING-INTERNAL", 1, 0, false);
    //declareFunction(myName, "object_to_string", "OBJECT-TO-STRING", 1, 0, false);
    //declareFunction(myName, "fort_to_string", "FORT-TO-STRING", 1, 0, false);
    //declareFunction(myName, "function_to_string", "FUNCTION-TO-STRING", 1, 0, false);
    declareFunction(myName, "to_string", "TO-STRING", 1, 0, false);
    //declareFunction(myName, "non_nil_to_string", "NON-NIL-TO-STRING", 1, 0, false);
    //declareFunction(myName, "to_lisp_string", "TO-LISP-STRING", 1, 0, false);
    //declareFunction(myName, "to_string_of_length", "TO-STRING-OF-LENGTH", 2, 0, false);
    //declareFunction(myName, "first_n_list_items_to_string", "FIRST-N-LIST-ITEMS-TO-STRING", 2, 0, false);
    //declareFunction(myName, "char_at", "CHAR-AT", 2, 0, false);
    //declareFunction(myName, "quote_string", "QUOTE-STRING", 1, 1, false);
    //declareFunction(myName, "unquote_string", "UNQUOTE-STRING", 1, 0, false);
    //declareFunction(myName, "quoted_stringP", "QUOTED-STRING?", 1, 0, false);
    declareFunction(myName, "str", "STR", 1, 0, false);
    //declareFunction(myName, "printed_forms_equalP", "PRINTED-FORMS-EQUAL?", 2, 1, false);
    //declareFunction(myName, "readable_p", "READABLE-P", 1, 0, false);
    //declareFunction(myName, "string_to_number", "STRING-TO-NUMBER", 1, 0, false);
    //declareFunction(myName, "string_to_integer", "STRING-TO-INTEGER", 1, 0, false);
    //declareFunction(myName, "integer_string_p", "INTEGER-STRING-P", 1, 0, false);
    //declareFunction(myName, "integer_stringL", "INTEGER-STRING<", 2, 0, false);
    //declareFunction(myName, "string_length_L", "STRING-LENGTH-<", 2, 0, false);
    //declareFunction(myName, "indent", "INDENT", 2, 0, false);
    //declareFunction(myName, "aref_from_end", "AREF-FROM-END", 2, 0, false);
    //declareFunction(myName, "char_from_end", "CHAR-FROM-END", 2, 0, false);
    declareFunction(myName, "first_char", "FIRST-CHAR", 1, 0, false);
    //declareFunction(myName, "first_of_string", "FIRST-OF-STRING", 1, 0, false);
    //declareFunction(myName, "rest_of_string", "REST-OF-STRING", 1, 0, false);
    //declareFunction(myName, "last_char", "LAST-CHAR", 1, 0, false);
    //declareFunction(myName, "pre_add_character_to_string", "PRE-ADD-CHARACTER-TO-STRING", 2, 0, false);
    //declareFunction(myName, "post_add_character_to_string", "POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
    //declareFunction(myName, "pre_and_post_add_character_to_string", "PRE-AND-POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
    //declareFunction(myName, "copy_string", "COPY-STRING", 1, 0, false);
    //declareFunction(myName, "string_substitute", "STRING-SUBSTITUTE", 3, 1, false);
    //declareFunction(myName, "string_substitute_word", "STRING-SUBSTITUTE-WORD", 3, 2, false);
    //declareFunction(myName, "do_string_substitutions", "DO-STRING-SUBSTITUTIONS", 2, 1, false);
    //declareFunction(myName, "do_string_substitutions_robust", "DO-STRING-SUBSTITUTIONS-ROBUST", 2, 1, false);
    //declareFunction(myName, "insert_escape_for_chars_in_string", "INSERT-ESCAPE-FOR-CHARS-IN-STRING", 2, 0, false);
    //declareFunction(myName, "remove_last_char", "REMOVE-LAST-CHAR", 1, 1, false);
    //declareFunction(myName, "remove_substring", "REMOVE-SUBSTRING", 2, 0, false);
    //declareFunction(myName, "replace_substring", "REPLACE-SUBSTRING", 3, 0, false);
    //declareFunction(myName, "replace_substring_once", "REPLACE-SUBSTRING-ONCE", 3, 1, false);
    //declareFunction(myName, "nreplace_substring_at", "NREPLACE-SUBSTRING-AT", 4, 0, false);
    //declareFunction(myName, "infix", "INFIX", 3, 0, false);
    //declareFunction(myName, "post_fix", "POST-FIX", 2, 0, false);
    //declareFunction(myName, "pre_fix", "PRE-FIX", 2, 0, false);
    //declareFunction(myName, "post_remove", "POST-REMOVE", 2, 1, false);
    //declareFunction(myName, "pre_remove", "PRE-REMOVE", 2, 1, false);
    declareFunction(myName, "substring", "SUBSTRING", 2, 1, false);
    //declareFunction(myName, "string_first_n", "STRING-FIRST-N", 2, 0, false);
    //declareFunction(myName, "string_last_n", "STRING-LAST-N", 2, 0, false);
    //declareFunction(myName, "string_butlast", "STRING-BUTLAST", 1, 0, false);
    declareFunction(myName, "ends_with", "ENDS-WITH", 2, 1, false);
    //declareFunction(myName, "ends_with_one_of", "ENDS-WITH-ONE-OF", 2, 0, false);
    //declareFunction(myName, "ends_with_punctuation_p", "ENDS-WITH-PUNCTUATION-P", 1, 0, false);
    //declareFunction(myName, "ends_with_number_p", "ENDS-WITH-NUMBER-P", 1, 0, false);
    //declareFunction(myName, "ends_with_number", "ENDS-WITH-NUMBER", 1, 0, false);
    declareFunction(myName, "starts_with", "STARTS-WITH", 2, 0, false);
    //declareFunction(myName, "starts_with_one_of", "STARTS-WITH-ONE-OF", 2, 0, false);
    //declareFunction(myName, "starts_with_by_test", "STARTS-WITH-BY-TEST", 2, 1, false);
    //declareFunction(myName, "starts_with_one_of_by_test", "STARTS-WITH-ONE-OF-BY-TEST", 2, 1, false);
    //declareFunction(myName, "starting_string", "STARTING-STRING", 2, 1, false);
    //declareFunction(myName, "ends_with_start_of", "ENDS-WITH-START-OF", 2, 2, false);
    //declareFunction(myName, "number_of_commas", "NUMBER-OF-COMMAS", 1, 0, false);
    //declareFunction(myName, "comma_sub_string", "COMMA-SUB-STRING", 1, 0, false);
    //declareFunction(myName, "concatenate_adjacent_strings", "CONCATENATE-ADJACENT-STRINGS", 1, 0, false);
    //declareFunction(myName, "string_starts_with_constant_reader_prefix_p", "STRING-STARTS-WITH-CONSTANT-READER-PREFIX-P", 1, 0, false);
    //declareFunction(myName, "string_contains_constant_reader_prefix_p", "STRING-CONTAINS-CONSTANT-READER-PREFIX-P", 1, 0, false);
    //declareFunction(myName, "string_add_constant_reader_prefix", "STRING-ADD-CONSTANT-READER-PREFIX", 1, 0, false);
    //declareFunction(myName, "string_remove_constant_reader_prefix", "STRING-REMOVE-CONSTANT-READER-PREFIX", 1, 0, false);
    //declareFunction(myName, "string_remove_constant_reader_prefixes", "STRING-REMOVE-CONSTANT-READER-PREFIXES", 1, 0, false);
    //declareFunction(myName, "one_is_starting_string", "ONE-IS-STARTING-STRING", 2, 1, false);
    //declareFunction(myName, "strings_common_prefix", "STRINGS-COMMON-PREFIX", 1, 2, false);
    declareFunction(myName, "char_position", "CHAR-POSITION", 2, 1, false);
    declareFunction(myName, "string_upto", "STRING-UPTO", 1, 1, false);
    //declareFunction(myName, "string_after", "STRING-AFTER", 1, 1, false);
    //declareFunction(myName, "string_between", "STRING-BETWEEN", 1, 2, false);
    //declareFunction(myName, "get_substring_between_tags", "GET-SUBSTRING-BETWEEN-TAGS", 3, 2, false);
    //declareFunction(myName, "get_substring_between_tags_list", "GET-SUBSTRING-BETWEEN-TAGS-LIST", 3, 2, false);
    //declareFunction(myName, "get_end_pos", "GET-END-POS", 4, 0, false);
    //declareFunction(myName, "strip_header", "STRIP-HEADER", 2, 0, false);
    //declareFunction(myName, "strip_trailer", "STRIP-TRAILER", 2, 0, false);
    //declareFunction(myName, "strip_first", "STRIP-FIRST", 1, 0, false);
    //declareFunction(myName, "strip_final", "STRIP-FINAL", 1, 1, false);
    //declareFunction(myName, "strip_first_if_char", "STRIP-FIRST-IF-CHAR", 2, 0, false);
    //declareFunction(myName, "strip_final_if_char", "STRIP-FINAL-IF-CHAR", 2, 0, false);
    //declareFunction(myName, "strip_first_n", "STRIP-FIRST-N", 2, 0, false);
    //declareFunction(myName, "strip_final_n", "STRIP-FINAL-N", 2, 0, false);
    //declareFunction(myName, "strip_punctuation", "STRIP-PUNCTUATION", 1, 0, false);
    //declareFunction(myName, "strip_sentential_punctuation", "STRIP-SENTENTIAL-PUNCTUATION", 1, 0, false);
    //declareFunction(myName, "ends_in_geminateP", "ENDS-IN-GEMINATE?", 1, 0, false);
    //declareFunction(myName, "null_stringP", "NULL-STRING?", 1, 0, false);
    //declareFunction(myName, "non_empty_stringP", "NON-EMPTY-STRING?", 1, 0, false);
    //declareFunction(myName, "char_set_position", "CHAR-SET-POSITION", 2, 2, false);
    declareFunction(myName, "char_type_position", "CHAR-TYPE-POSITION", 2, 2, false);
    //declareFunction(myName, "space_p", "SPACE-P", 1, 0, false);
    //declareFunction(myName, "non_space_char_p", "NON-SPACE-CHAR-P", 1, 0, false);
    //declareFunction(myName, "tab_p", "TAB-P", 1, 0, false);
    //declareFunction(myName, "non_tab_char_p", "NON-TAB-CHAR-P", 1, 0, false);
    declareFunction(myName, "not_digit_char_p", "NOT-DIGIT-CHAR-P", 1, 0, false); new $not_digit_char_p$UnaryFunction();
    //declareFunction(myName, "digit_stringP", "DIGIT-STRING?", 1, 0, false);
    //declareFunction(myName, "alphanumeric_stringP", "ALPHANUMERIC-STRING?", 1, 0, false);
    //declareFunction(myName, "partially_numeric_stringP", "PARTIALLY-NUMERIC-STRING?", 1, 0, false);
    //declareFunction(myName, "alphabetic_stringP", "ALPHABETIC-STRING?", 1, 0, false);
    //declareFunction(myName, "non_alphabetic_stringP", "NON-ALPHABETIC-STRING?", 1, 0, false);
    //declareFunction(myName, "is_numericP", "IS-NUMERIC?", 1, 0, false);
    //declareFunction(myName, "is_numeric_rangeP", "IS-NUMERIC-RANGE?", 1, 0, false);
    //declareFunction(myName, "parse_numeric_range", "PARSE-NUMERIC-RANGE", 1, 0, false);
    //declareFunction(myName, "ordinal", "ORDINAL", 1, 0, false);
    //declareFunction(myName, "english_ordinal_number_string_p", "ENGLISH-ORDINAL-NUMBER-STRING-P", 1, 0, false);
    //declareFunction(myName, "english_ordinal_string_to_cardinal_string", "ENGLISH-ORDINAL-STRING-TO-CARDINAL-STRING", 1, 0, false);
    //declareFunction(myName, "integer_suffix", "INTEGER-SUFFIX", 1, 0, false);
    declareFunction(myName, "set_nth_char", "SET-NTH-CHAR", 3, 1, false);
    //declareFunction(myName, "strip_chars_meeting_test", "STRIP-CHARS-MEETING-TEST", 1, 1, false);
    //declareFunction(myName, "substitute_char_if", "SUBSTITUTE-CHAR-IF", 2, 1, false);
    //declareFunction(myName, "string_wXo_control_charsP", "STRING-W/O-CONTROL-CHARS?", 1, 0, false); new $string_wXo_control_charsP$UnaryFunction();
    //declareFunction(myName, "control_char_p", "CONTROL-CHAR-P", 1, 0, false);
    //declareFunction(myName, "utf_8_combining_character_p", "UTF-8-COMBINING-CHARACTER-P", 1, 0, false);
    //declareFunction(myName, "integer_char_p", "INTEGER-CHAR-P", 1, 0, false);
    //declareFunction(myName, "contains_charP", "CONTAINS-CHAR?", 2, 0, false);
    //declareFunction(myName, "char_in_char_set", "CHAR-IN-CHAR-SET", 1, 0, false); new $char_in_char_set$UnaryFunction();
    //declareFunction(myName, "split_string", "SPLIT-STRING", 1, 1, false);
    //declareFunction(myName, "split_string_on_string", "SPLIT-STRING-ON-STRING", 2, 0, false);
    //declareFunction(myName, "string_rotations", "STRING-ROTATIONS", 1, 4, false);
    //declareFunction(myName, "string_rotation_int", "STRING-ROTATION-INT", 6, 0, false);
    declareFunction(myName, "substringP", "SUBSTRING?", 2, 3, false);
    //declareFunction(myName, "superstringP", "SUPERSTRING?", 2, 2, false);
    //declareFunction(myName, "proper_superstringP", "PROPER-SUPERSTRING?", 2, 2, false);
    declareFunction(myName, "substring_matchP", "SUBSTRING-MATCH?", 3, 1, false);
    //declareFunction(myName, "search_all", "SEARCH-ALL", 2, 2, false);
    //declareFunction(myName, "count_matches", "COUNT-MATCHES", 2, 2, false);
    //declareFunction(myName, "subwordP", "SUBWORD?", 2, 2, false);
    //declareFunction(myName, "bunge", "BUNGE", 1, 1, false);
    //declareFunction(myName, "bunge_with_string", "BUNGE-WITH-STRING", 1, 1, false);
    //declareFunction(myName, "string_of_allowed_charsP", "STRING-OF-ALLOWED-CHARS?", 2, 0, false);
    //declareFunction(myName, "bunge_according_to_string_ignoring_errors", "BUNGE-ACCORDING-TO-STRING-IGNORING-ERRORS", 2, 0, false);
    //declareFunction(myName, "join_strings", "JOIN-STRINGS", 1, 1, false);
    //declareFunction(myName, "quoted_join_strings", "QUOTED-JOIN-STRINGS", 1, 2, false);
    //declareFunction(myName, "camel_case_to_underscores", "CAMEL-CASE-TO-UNDERSCORES", 1, 0, false);
    //declareFunction(myName, "capitalize_first", "CAPITALIZE-FIRST", 1, 0, false);
    //declareFunction(myName, "uncapitalize_first", "UNCAPITALIZE-FIRST", 1, 0, false);
    //declareFunction(myName, "nth_word_of_string", "NTH-WORD-OF-STRING", 2, 0, false);
    //declareFunction(myName, "capitalize_smart", "CAPITALIZE-SMART", 1, 0, false);
    //declareFunction(myName, "uncapitalize_smart", "UNCAPITALIZE-SMART", 1, 0, false);
    //declareFunction(myName, "properly_capitalized_stringP", "PROPERLY-CAPITALIZED-STRING?", 1, 0, false);
    //declareFunction(myName, "capitalized_string_p", "CAPITALIZED-STRING-P", 1, 0, false);
    //declareFunction(myName, "string_encode_capitalization", "STRING-ENCODE-CAPITALIZATION", 1, 0, false);
    //declareFunction(myName, "string_has_capitalization_p", "STRING-HAS-CAPITALIZATION-P", 2, 0, false);
    //declareFunction(myName, "string_has_capitalization_p_mod", "STRING-HAS-CAPITALIZATION-P-MOD", 2, 0, false);
    //declareFunction(myName, "string_has_capitalization_p_expt", "STRING-HAS-CAPITALIZATION-P-EXPT", 2, 0, false);
    //declareFunction(myName, "nstring_proper", "NSTRING-PROPER", 1, 4, false);
    //declareFunction(myName, "string_proper", "STRING-PROPER", 1, 4, false);
    //declareFunction(myName, "space_uncapitalize", "SPACE-UNCAPITALIZE", 1, 0, false);
    //declareFunction(myName, "space_dont_uncapitalize", "SPACE-DONT-UNCAPITALIZE", 1, 0, false);
    //declareFunction(myName, "add_space_between_chars_p", "ADD-SPACE-BETWEEN-CHARS-P", 3, 0, false);
    //declareFunction(myName, "eat_char_p", "EAT-CHAR-P", 1, 0, false);
    //declareFunction(myName, "capitalize_initial_char_p", "CAPITALIZE-INITIAL-CHAR-P", 2, 0, false);
    //declareFunction(myName, "string_downcase_except_acronyms", "STRING-DOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
    //declareFunction(myName, "string_ndowncase_except_acronyms", "STRING-NDOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
    //declareFunction(myName, "hex_char_p", "HEX-CHAR-P", 1, 0, false);
    //declareFunction(myName, "hex_char", "HEX-CHAR", 1, 0, false);
    //declareFunction(myName, "hex_char_value", "HEX-CHAR-VALUE", 1, 0, false);
    //declareFunction(myName, "hex_char_string_p", "HEX-CHAR-STRING-P", 1, 0, false);
    //declareFunction(myName, "hex_string_p", "HEX-STRING-P", 1, 0, false);
    //declareFunction(myName, "hex_string_p_int", "HEX-STRING-P-INT", 2, 0, false);
    //declareFunction(myName, "f_64_bit_char_p", "64-BIT-CHAR-P", 1, 0, false);
    //declareFunction(myName, "f_64_bit_char", "64-BIT-CHAR", 1, 0, false);
    //declareFunction(myName, "f_64_bit_char_value", "64-BIT-CHAR-VALUE", 1, 0, false);
    //declareFunction(myName, "f_64_bit_string_p", "64-BIT-STRING-P", 1, 0, false);
    declareFunction(myName, "upper_case_alphanumeric_p", "UPPER-CASE-ALPHANUMERIC-P", 1, 0, false);
    //declareFunction(myName, "punctuation_p", "PUNCTUATION-P", 1, 0, false);
    //declareFunction(myName, "punctuation_extended_p", "PUNCTUATION-EXTENDED-P", 1, 0, false);
    //declareFunction(myName, "punctuation_string_p", "PUNCTUATION-STRING-P", 1, 0, false);
    //declareFunction(myName, "remove_punctuation", "REMOVE-PUNCTUATION", 1, 0, false);
    //declareFunction(myName, "upper_case_string_p", "UPPER-CASE-STRING-P", 1, 0, false);
    //declareFunction(myName, "lower_case_string_p", "LOWER-CASE-STRING-P", 1, 0, false);
    //declareFunction(myName, "string_list_downcase", "STRING-LIST-DOWNCASE", 1, 0, false);
    //declareFunction(myName, "string_list_upcase", "STRING-LIST-UPCASE", 1, 0, false);
    //declareFunction(myName, "nupcase_nth", "NUPCASE-NTH", 2, 1, false);
    //declareFunction(myName, "nupcase_leading", "NUPCASE-LEADING", 1, 0, false);
    //declareFunction(myName, "upcase_leading", "UPCASE-LEADING", 1, 0, false);
    //declareFunction(myName, "ndowncase_nth", "NDOWNCASE-NTH", 2, 1, false);
    //declareFunction(myName, "ndowncase_leading", "NDOWNCASE-LEADING", 1, 0, false);
    //declareFunction(myName, "downcase_leading", "DOWNCASE-LEADING", 1, 0, false);
    //declareFunction(myName, "all_chars_EP", "ALL-CHARS-=?", 2, 0, false);
    //declareFunction(myName, "string_contains_only_charsP", "STRING-CONTAINS-ONLY-CHARS?", 2, 0, false);
    declareFunction(myName, "whitespace_chars", "WHITESPACE-CHARS", 0, 0, false);
    //declareFunction(myName, "grammatical_punctuation_chars", "GRAMMATICAL-PUNCTUATION-CHARS", 0, 0, false);
    //declareFunction(myName, "trim_whitespace", "TRIM-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "left_trim_whitespace", "LEFT-TRIM-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "right_trim_whitespace", "RIGHT-TRIM-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "trim_whitespace_if_string", "TRIM-WHITESPACE-IF-STRING", 1, 0, false);
    //declareFunction(myName, "nsubst_whitespace", "NSUBST-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "subst_whitespace", "SUBST-WHITESPACE", 1, 0, false);
    declareFunction(myName, "whitespacep", "WHITESPACEP", 1, 0, false); new $whitespacep$UnaryFunction();
    declareFunction(myName, "non_whitespace_p", "NON-WHITESPACE-P", 1, 0, false);
    //declareFunction(myName, "read_whitespace_no_hang", "READ-WHITESPACE-NO-HANG", 0, 3, false);
    //declareFunction(myName, "whitespace_stringP", "WHITESPACE-STRING?", 1, 0, false);
    //declareFunction(myName, "trim_quotes", "TRIM-QUOTES", 1, 1, false);
    //declareFunction(myName, "network_terpri", "NETWORK-TERPRI", 1, 0, false);
    //declareFunction(myName, "add_to_buffer", "ADD-TO-BUFFER", 3, 0, false);
    //declareFunction(myName, "network_read_line", "NETWORK-READ-LINE", 0, 3, false);
    //declareFunction(myName, "read_possibly_continued_line", "READ-POSSIBLY-CONTINUED-LINE", 0, 3, false);
    //declareFunction(myName, "find_earliest_string", "FIND-EARLIEST-STRING", 2, 2, false);
    //declareFunction(myName, "search_last", "SEARCH-LAST", 2, 2, false);
    //declareFunction(myName, "princ_substring", "PRINC-SUBSTRING", 2, 2, false);
    //declareFunction(myName, "strcat", "STRCAT", 1, 0, false);
    //declareFunction(myName, "nchar_subst", "NCHAR-SUBST", 3, 0, false);
    //declareFunction(myName, "char_subst", "CHAR-SUBST", 3, 0, false);
    //declareFunction(myName, "nchar_subst_if", "NCHAR-SUBST-IF", 3, 0, false);
    //declareFunction(myName, "char_subst_if", "CHAR-SUBST-IF", 3, 0, false);
    //declareFunction(myName, "nchar_subst_if_not", "NCHAR-SUBST-IF-NOT", 3, 0, false);
    //declareFunction(myName, "char_subst_if_not", "CHAR-SUBST-IF-NOT", 3, 0, false);
    //declareFunction(myName, "string_subst", "STRING-SUBST", 3, 1, false);
    //declareFunction(myName, "trim_sides", "TRIM-SIDES", 1, 1, false);
    //declareFunction(myName, "valid_timestring_charP", "VALID-TIMESTRING-CHAR?", 1, 0, false);
    //declareFunction(myName, "string_trim_symmetric_n", "STRING-TRIM-SYMMETRIC-N", 2, 1, false);
    declareFunction(myName, "break_words", "BREAK-WORDS", 1, 2, false);
    //declareFunction(myName, "sub_phrases", "SUB-PHRASES", 1, 0, false);
    //declareFunction(myName, "number_of_words", "NUMBER-OF-WORDS", 1, 0, false);
    //declareFunction(myName, "first_word", "FIRST-WORD", 1, 1, false);
    //declareFunction(myName, "substring_positions", "SUBSTRING-POSITIONS", 2, 0, false);
    //declareFunction(myName, "break_string", "BREAK-STRING", 2, 0, false);
    //declareFunction(myName, "first_name_first", "FIRST-NAME-FIRST", 1, 0, false);
    declareFunction(myName, "char_list_to_string", "CHAR-LIST-TO-STRING", 1, 0, false);
    //declareFunction(myName, "string_to_char_list", "STRING-TO-CHAR-LIST", 1, 0, false);
    //declareFunction(myName, "count_chars_in_string", "COUNT-CHARS-IN-STRING", 2, 0, false);
    //declareFunction(myName, "some_are_substringsP", "SOME-ARE-SUBSTRINGS?", 2, 1, false);
    //declareFunction(myName, "substring_every_in_list", "SUBSTRING-EVERY-IN-LIST", 2, 1, false);
    //declareFunction(myName, "target_character_found", "TARGET-CHARACTER-FOUND", 1, 0, false);
    //declareFunction(myName, "separate_sentences", "SEPARATE-SENTENCES", 1, 1, false);
    //declareFunction(myName, "extract_lines", "EXTRACT-LINES", 1, 0, false);
    //declareFunction(myName, "collapse_lines", "COLLAPSE-LINES", 1, 0, false);
    //declareFunction(myName, "quotify_string", "QUOTIFY-STRING", 1, 0, false);
    //declareFunction(myName, "string_line_lengths", "STRING-LINE-LENGTHS", 1, 0, false);
    //declareFunction(myName, "relevant_substrings", "RELEVANT-SUBSTRINGS", 1, 0, false);
    declareFunction(myName, "make_valid_constant_name", "MAKE-VALID-CONSTANT-NAME", 1, 1, false);
    //declareFunction(myName, "nl_string_tokenize", "NL-STRING-TOKENIZE", 1, 6, false);
    declareFunction(myName, "string_tokenize", "STRING-TOKENIZE", 1, 6, false);
    declareFunction(myName, "string_tokenize_int", "STRING-TOKENIZE-INT", 1, 6, false);
    declareFunction(myName, "string_tokenize_break_length", "STRING-TOKENIZE-BREAK-LENGTH", 1, 0, false);
    declareFunction(myName, "string_tokenize_break_matchP", "STRING-TOKENIZE-BREAK-MATCH?", 3, 0, false);
    //declareFunction(myName, "listify_string", "LISTIFY-STRING", 1, 1, false);
    //declareFunction(myName, "all_parens_matchedP", "ALL-PARENS-MATCHED?", 1, 2, false);
    //declareFunction(myName, "unmatched_parentheses", "UNMATCHED-PARENTHESES", 1, 2, false);
    //declareFunction(myName, "byte_string_p", "BYTE-STRING-P", 1, 0, false);
    //declareFunction(myName, "ip_address_p", "IP-ADDRESS-P", 1, 0, false);
    //declareFunction(myName, "ip_addressL", "IP-ADDRESS<", 2, 0, false);
    //declareFunction(myName, "get_trigraph_metric", "GET-TRIGRAPH-METRIC", 0, 0, false);
    //declareFunction(myName, "set_trigraph_metric", "SET-TRIGRAPH-METRIC", 0, 1, false);
    //declareFunction(myName, "get_trigraph_table", "GET-TRIGRAPH-TABLE", 0, 0, false);
    //declareFunction(myName, "free_trigraph_table", "FREE-TRIGRAPH-TABLE", 1, 0, false);
    //declareFunction(myName, "plural_length_to_subtract", "PLURAL-LENGTH-TO-SUBTRACT", 1, 0, false);
    //declareFunction(myName, "update_string1_table", "UPDATE-STRING1-TABLE", 2, 0, false);
    //declareFunction(myName, "make_trigraph_integer_code", "MAKE-TRIGRAPH-INTEGER-CODE", 3, 0, false);
    //declareFunction(myName, "string_trigraph_match_p", "STRING-TRIGRAPH-MATCH-P", 2, 2, false);
    //declareFunction(myName, "stringify_terms", "STRINGIFY-TERMS", 1, 2, false);
    //declareFunction(myName, "fort_print_name", "FORT-PRINT-NAME", 1, 0, false);
    //declareFunction(myName, "stringify_items", "STRINGIFY-ITEMS", 1, 3, false);
    //declareFunction(myName, "str_by_type", "STR-BY-TYPE", 1, 0, false);
    //declareFunction(myName, "add_line", "ADD-LINE", 2, 2, false);
    declareFunction(myName, "cyclify_status_print_function_trampoline", "CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "cyclify_status_p", "CYCLIFY-STATUS-P", 1, 0, false); new $cyclify_status_p$UnaryFunction();
    //declareFunction(myName, "cyclify_status_out_string_list", "CYCLIFY-STATUS-OUT-STRING-LIST", 1, 0, false);
    //declareFunction(myName, "cyclify_status_references_added", "CYCLIFY-STATUS-REFERENCES-ADDED", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_quoteP", "CYCLIFY-STATUS-INSIDE-QUOTE?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_el_var_nameP", "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_already_cyclifiedP", "CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_escapeP", "CYCLIFY-STATUS-ESCAPE?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_subl_quote_fnP", "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_expand_subl_fnP", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_expand_subl_fn_arg1P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_inside_expand_subl_fn_arg2P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_immediately_following_parenP", "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 1, 0, false);
    //declareFunction(myName, "cyclify_status_paren_count", "CYCLIFY-STATUS-PAREN-COUNT", 1, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_out_string_list", "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_references_added", "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_quoteP", "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_el_var_nameP", "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_already_cyclifiedP", "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_escapeP", "_CSETF-CYCLIFY-STATUS-ESCAPE?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_subl_quote_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_expand_subl_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_expand_subl_fn_arg1P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_inside_expand_subl_fn_arg2P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_immediately_following_parenP", "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 2, 0, false);
    //declareFunction(myName, "_csetf_cyclify_status_paren_count", "_CSETF-CYCLIFY-STATUS-PAREN-COUNT", 2, 0, false);
    //declareFunction(myName, "make_cyclify_status", "MAKE-CYCLIFY-STATUS", 0, 1, false);
    //declareFunction(myName, "cyclify_string_initialize_cyclify_status", "CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS", 0, 0, false);
    //declareFunction(myName, "cyclify_string_possibly_cyclify_string", "CYCLIFY-STRING-POSSIBLY-CYCLIFY-STRING", 2, 0, false);
    //declareFunction(myName, "cyclify_string_not_inside_quote_and_not_escapedP", "CYCLIFY-STRING-NOT-INSIDE-QUOTE-AND-NOT-ESCAPED?", 1, 0, false);
    //declareFunction(myName, "cyclify_string_found_quoteP", "CYCLIFY-STRING-FOUND-QUOTE?", 2, 0, false);
    //declareFunction(myName, "cyclify_string_found_open_parenP", "CYCLIFY-STRING-FOUND-OPEN-PAREN?", 2, 0, false);
    //declareFunction(myName, "cyclify_string_found_close_parenP", "CYCLIFY-STRING-FOUND-CLOSE-PAREN?", 2, 0, false);
    //declareFunction(myName, "cyclify_string_add_to_out_string_list", "CYCLIFY-STRING-ADD-TO-OUT-STRING-LIST", 2, 0, false);
    //declareFunction(myName, "cyclify_string_check_for_escape_to_subl", "CYCLIFY-STRING-CHECK-FOR-ESCAPE-TO-SUBL", 2, 0, false);
    //declareFunction(myName, "cyclify_string_handle_last_valid_char", "CYCLIFY-STRING-HANDLE-LAST-VALID-CHAR", 3, 0, false);
    //declareFunction(myName, "cyclify_string_handle_open_paren_int", "CYCLIFY-STRING-HANDLE-OPEN-PAREN-INT", 1, 0, false);
    //declareFunction(myName, "cyclify_string_handle_close_paren_int", "CYCLIFY-STRING-HANDLE-CLOSE-PAREN-INT", 1, 0, false);
    //declareFunction(myName, "cyclify_string_handle_end_of_current_word", "CYCLIFY-STRING-HANDLE-END-OF-CURRENT-WORD", 5, 0, false);
    //declareFunction(myName, "cyclify_string", "CYCLIFY-STRING", 1, 0, false);
    //declareFunction(myName, "constant_names_in_string", "CONSTANT-NAMES-IN-STRING", 1, 1, false);
    //declareFunction(myName, "invalid_constant_names_in_string", "INVALID-CONSTANT-NAMES-IN-STRING", 1, 1, false);
    //declareFunction(myName, "invalid_constant_names_in_stringP", "INVALID-CONSTANT-NAMES-IN-STRING?", 1, 1, false);
    //declareFunction(myName, "nonbreak_char", "NONBREAK-CHAR", 1, 0, false);
    //declareFunction(myName, "read_string_until_char", "READ-STRING-UNTIL-CHAR", 2, 1, false);
    //declareFunction(myName, "align_char", "ALIGN-CHAR", 4, 1, false);
    //declareFunction(myName, "right_justify", "RIGHT-JUSTIFY", 2, 1, false);
    //declareFunction(myName, "left_justify", "LEFT-JUSTIFY", 2, 1, false);
    //declareFunction(myName, "center_string", "CENTER-STRING", 2, 1, false);
    //declareFunction(myName, "print_length", "PRINT-LENGTH", 1, 0, false);
    //declareFunction(myName, "tab", "TAB", 1, 4, false);
    //declareFunction(myName, "tabstr", "TABSTR", 1, 1, false);
    //declareFunction(myName, "reduce_whitespace", "REDUCE-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "compute_reduced_length", "COMPUTE-REDUCED-LENGTH", 1, 0, false);
    //declareFunction(myName, "single_word_string_p", "SINGLE-WORD-STRING-P", 1, 0, false);
    //declareFunction(myName, "multi_word_string", "MULTI-WORD-STRING", 1, 0, false);
    //declareFunction(myName, "multi_word_quote", "MULTI-WORD-QUOTE", 1, 0, false);
    //declareFunction(myName, "process_file", "PROCESS-FILE", 3, 2, false);
    //declareFunction(myName, "princ_file_to_stream", "PRINC-FILE-TO-STREAM", 2, 2, false);
    //declareFunction(myName, "read_string_from_file", "READ-STRING-FROM-FILE", 1, 2, false);
    //declareFunction(myName, "uniquify_string", "UNIQUIFY-STRING", 2, 2, false);
    //declareFunction(myName, "uniquify_string_via_set", "UNIQUIFY-STRING-VIA-SET", 2, 1, false);
    //declareFunction(myName, "keyword_from_string", "KEYWORD-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "pretty_keyword_from_string", "PRETTY-KEYWORD-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "non_alphanumeric_p", "NON-ALPHANUMERIC-P", 1, 0, false);
    //declareFunction(myName, "string_from_keyword", "STRING-FROM-KEYWORD", 1, 0, false);
    //declareFunction(myName, "keyword_impostor_p", "KEYWORD-IMPOSTOR-P", 1, 0, false);
    //declareFunction(myName, "keyword_from_impostor", "KEYWORD-FROM-IMPOSTOR", 1, 0, false);
    //declareFunction(myName, "coerce_to_keyword", "COERCE-TO-KEYWORD", 1, 0, false);
    //declareFunction(myName, "cfasl_compile_from_string", "CFASL-COMPILE-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "weak_string_equal", "WEAK-STRING-EQUAL", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_string_utilities_file() {
    $point_char$ = defconstant("*POINT-CHAR*", Characters.CHAR_period);
    $space_char$ = defconstant("*SPACE-CHAR*", Characters.CHAR_space);
    $tab_char$ = defconstant("*TAB-CHAR*", Characters.CHAR_tab);
    $empty_string$ = defconstant("*EMPTY-STRING*", $str0$);
    $new_line_string$ = defconstant("*NEW-LINE-STRING*", Strings.make_string(ONE_INTEGER, Characters.CHAR_newline));
    $test_char$ = defvar("*TEST-CHAR*", NIL);
    $object_to_string_caching_state$ = deflexical("*OBJECT-TO-STRING-CACHING-STATE*", NIL);
    $char_set$ = defparameter("*CHAR-SET*", NIL);
    $64_bit_encoding_table$ = defconstant("*64-BIT-ENCODING-TABLE*", $list74);
    $64_bit_integer_index$ = deflexical("*64-BIT-INTEGER-INDEX*", list_utilities.alist_to_hash_table($64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function(EQL)));
    $64_bit_char_index$ = deflexical("*64-BIT-CHAR-INDEX*", list_utilities.alist_to_reverse_hash_table($64_bit_encoding_table$.getGlobalValue(), Symbols.symbol_function(EQL)));
    $raw_whitespace_chars$ = deflexical("*RAW-WHITESPACE-CHARS*", $list78);
    $whitespace_chars$ = deflexical("*WHITESPACE-CHARS*", Sequences.delete_duplicates($raw_whitespace_chars$.getGlobalValue(), Symbols.symbol_function($sym79$CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    $grammatical_punctuation_chars$ = deflexical("*GRAMMATICAL-PUNCTUATION-CHARS*", $list80);
    $target_characters$ = defparameter("*TARGET-CHARACTERS*", NIL);
    $trigraph_metric$ = defparameter("*TRIGRAPH-METRIC*", $float105$0_8);
    $trigraph_tables$ = defparameter("*TRIGRAPH-TABLES*", NIL);
    $cyclify_string_expand_subl_fn_strings$ = defvar("*CYCLIFY-STRING-EXPAND-SUBL-FN-STRINGS*", $list114);
    $cyclify_string_subl_quote_fn_strings$ = defvar("*CYCLIFY-STRING-SUBL-QUOTE-FN-STRINGS*", $list115);
    $cyclify_string_quote_chars$ = defvar("*CYCLIFY-STRING-QUOTE-CHARS*", $list116);
    $dtp_cyclify_status$ = defconstant("*DTP-CYCLIFY-STATUS*", $sym117$CYCLIFY_STATUS);
    $string_read_buffer_size$ = defparameter("*STRING-READ-BUFFER-SIZE*", $int163$1024);
    $string_read_buffer$ = defparameter("*STRING-READ-BUFFER*", Vectors.make_vector($string_read_buffer_size$.getDynamicValue(), Characters.CHAR_space));
    return NIL;
  }

  public static final SubLObject setup_string_utilities_file() {
    // CVS_ID("Id: string-utilities.lisp 128760 2009-09-15 04:40:33Z pace ");
    memoization_state.note_globally_cached_function($sym13$OBJECT_TO_STRING);
    generic_testing.define_test_case_table_int($sym38$ENDS_WITH_START_OF, list(new SubLObject[] {$kw39$TEST, EQUAL, $kw40$OWNER, NIL, $kw41$CLASSES, NIL, $kw42$KB, $kw43$TINY, $kw44$WORKING_, T}), $list45);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyclify_status$.getGlobalValue(), Symbols.symbol_function($sym124$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym125$CYCLIFY_STATUS_OUT_STRING_LIST, $sym126$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST);
    Structures.def_csetf($sym127$CYCLIFY_STATUS_REFERENCES_ADDED, $sym128$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED);
    Structures.def_csetf($sym129$CYCLIFY_STATUS_INSIDE_QUOTE_, $sym130$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_);
    Structures.def_csetf($sym131$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_, $sym132$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_);
    Structures.def_csetf($sym133$CYCLIFY_STATUS_ALREADY_CYCLIFIED_, $sym134$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_);
    Structures.def_csetf($sym135$CYCLIFY_STATUS_ESCAPE_, $sym136$_CSETF_CYCLIFY_STATUS_ESCAPE_);
    Structures.def_csetf($sym137$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_, $sym138$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_);
    Structures.def_csetf($sym139$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_, $sym140$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_);
    Structures.def_csetf($sym141$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_, $sym142$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_);
    Structures.def_csetf($sym143$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_, $sym144$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_);
    Structures.def_csetf($sym145$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_, $sym146$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_);
    Structures.def_csetf($sym147$CYCLIFY_STATUS_PAREN_COUNT, $sym148$_CSETF_CYCLIFY_STATUS_PAREN_COUNT);
    Equality.identity($sym117$CYCLIFY_STATUS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$ = makeString("");
  public static final SubLList $list1 = list(list(makeSymbol("WORD"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("BREAK-CHAR"), list(makeSymbol("QUOTE"), makeSymbol("*SPACE-CHAR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("BREAK-CHAR"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$BREAK_CHAR = makeKeyword("BREAK-CHAR");
  public static final SubLSymbol $sym5$_SPACE_CHAR_ = makeSymbol("*SPACE-CHAR*");
  public static final SubLSymbol $sym6$WORD_LIST_VAR = makeUninternedSymbol("WORD-LIST-VAR");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym8$_TEST_CHAR_ = makeSymbol("*TEST-CHAR*");
  public static final SubLSymbol $sym9$BREAK_WORDS = makeSymbol("BREAK-WORDS");
  public static final SubLList $list10 = list(list(makeSymbol("QUOTE"), makeSymbol("NOT-TEST-CHAR")));
  public static final SubLSymbol $sym11$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym12$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym13$OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");
  public static final SubLSymbol $sym14$_OBJECT_TO_STRING_CACHING_STATE_ = makeSymbol("*OBJECT-TO-STRING-CACHING-STATE*");
  public static final SubLInteger $int15$1000 = makeInteger(1000);
  public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str17$_ = makeString(">");
  public static final SubLString $str18$_ = makeString("(");
  public static final SubLString $str19$_ = makeString(" ");
  public static final SubLString $str20$___ = makeString("...");
  public static final SubLString $str21$_ = makeString(")");
  public static final SubLString $str22$_ = makeString("\"");
  public static final SubLSymbol $sym23$READABLE_P = makeSymbol("READABLE-P");
  public static final SubLSymbol $sym24$READ_FROM_STRING_IGNORING_ERRORS = makeSymbol("READ-FROM-STRING-IGNORING-ERRORS");
  public static final SubLSymbol $kw25$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $sym26$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str27$_S_is_too_short_to_remove__D_char = makeString("~S is too short to remove ~D characters.");
  public static final SubLSymbol $sym28$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");
  public static final SubLString $str29$_S_must_be_a_single_word___cannot = makeString("~S must be a single word - cannot contain ~S");
  public static final SubLSymbol $sym30$NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");
  public static final SubLInteger $int31$100 = makeInteger(100);
  public static final SubLInteger $int32$256 = makeInteger(256);
  public static final SubLSymbol $sym33$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym34$CHARACTERP = makeSymbol("CHARACTERP");
  public static final SubLString $str35$Some_element_of__A_is_not_charact = makeString("Some element of ~A is not characterp.");
  public static final SubLSymbol $sym36$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym37$_ = makeSymbol("<");
  public static final SubLSymbol $sym38$ENDS_WITH_START_OF = makeSymbol("ENDS-WITH-START-OF");
  public static final SubLSymbol $kw39$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw40$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw41$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw42$KB = makeKeyword("KB");
  public static final SubLSymbol $kw43$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw44$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list45 = list(list(list(makeString("Author Harriet"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet")), list(list(makeString("Author Harriet Beecher Stowe"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet Beecher Stowe")), list(list(makeString("Author Harriet Beecher Stowes"), makeString("Harriet Beecher Stowe"), EQUALP), NIL), list(list(makeString("Author Harriet Beecher Sto"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet Beecher Sto")), list(list(makeString("Author Harriet Beecher Sto"), makeString("riet Beecher Stowe"), EQUALP, list(makeString(" "))), NIL));
  public static final SubLString $str46$_ = makeString(",");
  public static final SubLString $str47$__ = makeString(", ");
  public static final SubLList $list48 = list(Characters.CHAR_lparen, Characters.CHAR_rparen);
  public static final SubLList $list49 = list(makeString("."), makeString("?"), makeString("!"));
  public static final SubLSymbol $sym50$CHAR_IN_CHAR_SET = makeSymbol("CHAR-IN-CHAR-SET");
  public static final SubLSymbol $sym51$DIGIT_CHAR_P = makeSymbol("DIGIT-CHAR-P");
  public static final SubLSymbol $sym52$ALPHANUMERICP = makeSymbol("ALPHANUMERICP");
  public static final SubLSymbol $sym53$ALPHA_CHAR_P = makeSymbol("ALPHA-CHAR-P");
  public static final SubLList $list54 = list(makeString("-"));
  public static final SubLList $list55 = list(makeString(","));
  public static final SubLSymbol $sym56$IS_NUMERIC_ = makeSymbol("IS-NUMERIC?");
  public static final SubLSymbol $sym57$PARSE_INTEGER = makeSymbol("PARSE-INTEGER");
  public static final SubLString $str58$__R = makeString("~:R");
  public static final SubLList $list59 = list(makeString("st"), makeString("nd"), makeString("rd"), makeString("th"));
  public static final SubLSymbol $sym60$CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");
  public static final SubLInteger $int61$32 = makeInteger(32);
  public static final SubLInteger $int62$128 = makeInteger(128);
  public static final SubLList $list63 = list(Characters.CHAR_space);
  public static final SubLSymbol $sym64$STRING = makeSymbol("STRING");
  public static final SubLList $list65 = list(makeString(" "));
  public static final SubLSymbol $sym66$LOWER_CASE_P = makeSymbol("LOWER-CASE-P");
  public static final SubLSymbol $sym67$WHITESPACEP = makeSymbol("WHITESPACEP");
  public static final SubLSymbol $sym68$UPPER_CASE_P = makeSymbol("UPPER-CASE-P");
  public static final SubLSymbol $sym69$PUNCTUATION_P = makeSymbol("PUNCTUATION-P");
  public static final SubLSymbol $sym70$EAT_CHAR_P = makeSymbol("EAT-CHAR-P");
  public static final SubLSymbol $sym71$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str72$0123456789ABCDEF = makeString("0123456789ABCDEF");
  public static final SubLSymbol $sym73$HEX_CHAR_P = makeSymbol("HEX-CHAR-P");
  public static final SubLList $list74 = list(new SubLObject[] {cons(ZERO_INTEGER, Characters.CHAR_A), cons(ONE_INTEGER, Characters.CHAR_B), cons(TWO_INTEGER, Characters.CHAR_C), cons(THREE_INTEGER, Characters.CHAR_D), cons(FOUR_INTEGER, Characters.CHAR_E), cons(FIVE_INTEGER, Characters.CHAR_F), cons(SIX_INTEGER, Characters.CHAR_G), cons(SEVEN_INTEGER, Characters.CHAR_H), cons(EIGHT_INTEGER, Characters.CHAR_I), cons(NINE_INTEGER, Characters.CHAR_J), cons(TEN_INTEGER, Characters.CHAR_K), cons(ELEVEN_INTEGER, Characters.CHAR_L), cons(TWELVE_INTEGER, Characters.CHAR_M), cons(THIRTEEN_INTEGER, Characters.CHAR_N), cons(FOURTEEN_INTEGER, Characters.CHAR_O), cons(FIFTEEN_INTEGER, Characters.CHAR_P), cons(SIXTEEN_INTEGER, Characters.CHAR_Q), cons(SEVENTEEN_INTEGER, Characters.CHAR_R), cons(EIGHTEEN_INTEGER, Characters.CHAR_S), cons(NINETEEN_INTEGER, Characters.CHAR_T), cons(TWENTY_INTEGER, Characters.CHAR_U), cons(makeInteger(21), Characters.CHAR_V), cons(makeInteger(22), Characters.CHAR_W), cons(makeInteger(23), Characters.CHAR_X), cons(makeInteger(24), Characters.CHAR_Y), cons(makeInteger(25), Characters.CHAR_Z), cons(makeInteger(26), Characters.CHAR_a), cons(makeInteger(27), Characters.CHAR_b), cons(makeInteger(28), Characters.CHAR_c), cons(makeInteger(29), Characters.CHAR_d), cons(makeInteger(30), Characters.CHAR_e), cons(makeInteger(31), Characters.CHAR_f), cons(makeInteger(32), Characters.CHAR_g), cons(makeInteger(33), Characters.CHAR_h), cons(makeInteger(34), Characters.CHAR_i), cons(makeInteger(35), Characters.CHAR_j), cons(makeInteger(36), Characters.CHAR_k), cons(makeInteger(37), Characters.CHAR_l), cons(makeInteger(38), Characters.CHAR_m), cons(makeInteger(39), Characters.CHAR_n), cons(makeInteger(40), Characters.CHAR_o), cons(makeInteger(41), Characters.CHAR_p), cons(makeInteger(42), Characters.CHAR_q), cons(makeInteger(43), Characters.CHAR_r), cons(makeInteger(44), Characters.CHAR_s), cons(makeInteger(45), Characters.CHAR_t), cons(makeInteger(46), Characters.CHAR_u), cons(makeInteger(47), Characters.CHAR_v), cons(makeInteger(48), Characters.CHAR_w), cons(makeInteger(49), Characters.CHAR_x), cons(makeInteger(50), Characters.CHAR_y), cons(makeInteger(51), Characters.CHAR_z), cons(makeInteger(52), Characters.CHAR_0), cons(makeInteger(53), Characters.CHAR_1), cons(makeInteger(54), Characters.CHAR_2), cons(makeInteger(55), Characters.CHAR_3), cons(makeInteger(56), Characters.CHAR_4), cons(makeInteger(57), Characters.CHAR_5), cons(makeInteger(58), Characters.CHAR_6), cons(makeInteger(59), Characters.CHAR_7), cons(makeInteger(60), Characters.CHAR_8), cons(makeInteger(61), Characters.CHAR_9), cons(makeInteger(62), Characters.CHAR_plus), cons(makeInteger(63), Characters.CHAR_slash), cons(makeInteger(62), Characters.CHAR_hyphen), cons(makeInteger(63), Characters.CHAR_underbar)});
  public static final SubLString $str75$____________ = makeString(",.?!&'\";:()-");
  public static final SubLString $str76$_____________ = makeString(",.?!&'\";:()-/");
  public static final SubLSymbol $sym77$PUNCTUATION_EXTENDED_P = makeSymbol("PUNCTUATION-EXTENDED-P");
  public static final SubLList $list78 = list(Characters.CHAR_space, Characters.CHAR_tab, Characters.CHAR_return, Characters.CHAR_newline, Characters.CHAR_newline);
  public static final SubLSymbol $sym79$CHAR_EQUAL = makeSymbol("CHAR-EQUAL");
  public static final SubLList $list80 = list(new SubLObject[] {Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_backslash, Characters.CHAR_slash, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen});
  public static final SubLSymbol $kw81$EOF = makeKeyword("EOF");
  public static final SubLInteger $int82$64 = makeInteger(64);
  public static final SubLSymbol $kw83$NORMAL = makeKeyword("NORMAL");
  public static final SubLSymbol $kw84$CR = makeKeyword("CR");
  public static final SubLSymbol $kw85$STRING = makeKeyword("STRING");
  public static final SubLSymbol $kw86$SLASH = makeKeyword("SLASH");
  public static final SubLSymbol $sym87$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLSymbol $sym88$FBOUNDP = makeSymbol("FBOUNDP");
  public static final SubLSymbol $sym89$NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");
  public static final SubLList $list90 = list(Characters.CHAR_colon, Characters.CHAR_slash);
  public static final SubLSymbol $sym91$VALID_CONSTANT_NAME_CHAR_P = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
  public static final SubLSymbol $sym92$1_ = makeSymbol("1+");
  public static final SubLList $list93 = list(makeString(" and "), makeString(" or "));
  public static final SubLList $list94 = list(makeString(", "));
  public static final SubLList $list95 = list(Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation);
  public static final SubLSymbol $sym96$TARGET_CHARACTER_FOUND = makeSymbol("TARGET-CHARACTER-FOUND");
  public static final SubLList $list97 = list(Characters.CHAR_newline, Characters.CHAR_return);
  public static final SubLList $list98 = list(Characters.CHAR_quotation, Characters.CHAR_backslash, Characters.CHAR_asterisk, Characters.CHAR_question, Characters.CHAR_lbracket, Characters.CHAR_rbracket, Characters.CHAR_quote);
  public static final SubLSymbol $kw99$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym100$CHAR_ = makeSymbol("CHAR=");
  public static final SubLString $str101$Unmatched_open_parenthesis = makeString("Unmatched open parenthesis");
  public static final SubLString $str102$Unmatched_close_parenthesis = makeString("Unmatched close parenthesis");
  public static final SubLInteger $int103$255 = makeInteger(255);
  public static final SubLList $list104 = list(makeString("."));
  public static final SubLFloat $float105$0_8 = makeDouble(0.8);
  public static final SubLSymbol $kw106$FREE = makeKeyword("FREE");
  public static final SubLInteger $int107$50 = makeInteger(50);
  public static final SubLString $str108$es = makeString("es");
  public static final SubLString $str109$s = makeString("s");
  public static final SubLInteger $int110$1000000 = makeInteger(1000000);
  public static final SubLSymbol $sym111$FORT_PRINT_NAME = makeSymbol("FORT-PRINT-NAME");
  public static final SubLSymbol $sym112$STR_BY_TYPE = makeSymbol("STR-BY-TYPE");
  public static final SubLString $str113$__ = makeString("~%");
  public static final SubLList $list114 = list(makeString("#$ExpandSubLFn"), makeString("ExpandSubLFn"));
  public static final SubLList $list115 = list(makeString("#$SubLQuoteFn"), makeString("SubLQuoteFn"));
  public static final SubLList $list116 = list(Characters.CHAR_backslash);
  public static final SubLSymbol $sym117$CYCLIFY_STATUS = makeSymbol("CYCLIFY-STATUS");
  public static final SubLSymbol $sym118$CYCLIFY_STATUS_P = makeSymbol("CYCLIFY-STATUS-P");
  public static final SubLList $list119 = list(new SubLObject[] {makeSymbol("OUT-STRING-LIST"), makeSymbol("REFERENCES-ADDED"), makeSymbol("INSIDE-QUOTE?"), makeSymbol("INSIDE-EL-VAR-NAME?"), makeSymbol("ALREADY-CYCLIFIED?"), makeSymbol("ESCAPE?"), makeSymbol("INSIDE-SUBL-QUOTE-FN?"), makeSymbol("INSIDE-EXPAND-SUBL-FN?"), makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("PAREN-COUNT")});
  public static final SubLList $list120 = list(new SubLObject[] {makeKeyword("OUT-STRING-LIST"), makeKeyword("REFERENCES-ADDED"), makeKeyword("INSIDE-QUOTE?"), makeKeyword("INSIDE-EL-VAR-NAME?"), makeKeyword("ALREADY-CYCLIFIED?"), makeKeyword("ESCAPE?"), makeKeyword("INSIDE-SUBL-QUOTE-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?"), makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?"), makeKeyword("PAREN-COUNT")});
  public static final SubLList $list121 = list(new SubLObject[] {makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST"), makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED"), makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), makeSymbol("CYCLIFY-STATUS-ESCAPE?"), makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("CYCLIFY-STATUS-PAREN-COUNT")});
  public static final SubLList $list122 = list(new SubLObject[] {makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST"), makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT")});
  public static final SubLSymbol $sym123$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym124$CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym125$CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST");
  public static final SubLSymbol $sym126$_CSETF_CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST");
  public static final SubLSymbol $sym127$CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED");
  public static final SubLSymbol $sym128$_CSETF_CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED");
  public static final SubLSymbol $sym129$CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?");
  public static final SubLSymbol $sym130$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?");
  public static final SubLSymbol $sym131$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");
  public static final SubLSymbol $sym132$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");
  public static final SubLSymbol $sym133$CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?");
  public static final SubLSymbol $sym134$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?");
  public static final SubLSymbol $sym135$CYCLIFY_STATUS_ESCAPE_ = makeSymbol("CYCLIFY-STATUS-ESCAPE?");
  public static final SubLSymbol $sym136$_CSETF_CYCLIFY_STATUS_ESCAPE_ = makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?");
  public static final SubLSymbol $sym137$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");
  public static final SubLSymbol $sym138$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");
  public static final SubLSymbol $sym139$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");
  public static final SubLSymbol $sym140$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");
  public static final SubLSymbol $sym141$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");
  public static final SubLSymbol $sym142$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");
  public static final SubLSymbol $sym143$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");
  public static final SubLSymbol $sym144$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");
  public static final SubLSymbol $sym145$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");
  public static final SubLSymbol $sym146$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");
  public static final SubLSymbol $sym147$CYCLIFY_STATUS_PAREN_COUNT = makeSymbol("CYCLIFY-STATUS-PAREN-COUNT");
  public static final SubLSymbol $sym148$_CSETF_CYCLIFY_STATUS_PAREN_COUNT = makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT");
  public static final SubLSymbol $kw149$OUT_STRING_LIST = makeKeyword("OUT-STRING-LIST");
  public static final SubLSymbol $kw150$REFERENCES_ADDED = makeKeyword("REFERENCES-ADDED");
  public static final SubLSymbol $kw151$INSIDE_QUOTE_ = makeKeyword("INSIDE-QUOTE?");
  public static final SubLSymbol $kw152$INSIDE_EL_VAR_NAME_ = makeKeyword("INSIDE-EL-VAR-NAME?");
  public static final SubLSymbol $kw153$ALREADY_CYCLIFIED_ = makeKeyword("ALREADY-CYCLIFIED?");
  public static final SubLSymbol $kw154$ESCAPE_ = makeKeyword("ESCAPE?");
  public static final SubLSymbol $kw155$INSIDE_SUBL_QUOTE_FN_ = makeKeyword("INSIDE-SUBL-QUOTE-FN?");
  public static final SubLSymbol $kw156$INSIDE_EXPAND_SUBL_FN_ = makeKeyword("INSIDE-EXPAND-SUBL-FN?");
  public static final SubLSymbol $kw157$INSIDE_EXPAND_SUBL_FN_ARG1_ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?");
  public static final SubLSymbol $kw158$INSIDE_EXPAND_SUBL_FN_ARG2_ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?");
  public static final SubLSymbol $kw159$IMMEDIATELY_FOLLOWING_PAREN_ = makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?");
  public static final SubLSymbol $kw160$PAREN_COUNT = makeKeyword("PAREN-COUNT");
  public static final SubLString $str161$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str162$__ = makeString("_-");
  public static final SubLInteger $int163$1024 = makeInteger(1024);
  public static final SubLString $str164$quit_reading_file = makeString("quit reading file");
  public static final SubLString $str165$string_read_larger_than_buffer_si = makeString("string read larger than buffer size of ~S");
  public static final SubLFloat $float166$0_5 = makeDouble(0.5);
  public static final SubLString $str167$_a = makeString("~a");
  public static final SubLSymbol $kw168$BEFORE = makeKeyword("BEFORE");
  public static final SubLSymbol $kw169$WORD = makeKeyword("WORD");
  public static final SubLSymbol $kw170$KEEP_BLANK = makeKeyword("KEEP-BLANK");
  public static final SubLSymbol $kw171$SKIP_BLANKS = makeKeyword("SKIP-BLANKS");
  public static final SubLString $str172$Unknown_State__S__Flaw_in_state_m = makeString("Unknown State ~S: Flaw in state machine design.");
  public static final SubLSymbol $kw173$SPACE = makeKeyword("SPACE");
  public static final SubLString $str174$Unknown_state__S__Design_flaw_in_ = makeString("Unknown state ~S: Design flaw in state machine.");
  public static final SubLSymbol $sym175$PRIN1 = makeSymbol("PRIN1");
  public static final SubLSymbol $sym176$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $kw177$INPUT = makeKeyword("INPUT");
  public static final SubLString $str178$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str179$Could_not_open_an_input_stream_fo = makeString("Could not open an input stream for ~S.");
  public static final SubLSymbol $kw180$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str181$__Cannot_open_input_stream_for__A = makeString("~%Cannot open input stream for ~A");
  public static final SubLString $str182$_ = makeString("_");
  public static final SubLSymbol $sym183$NON_ALPHANUMERIC_P = makeSymbol("NON-ALPHANUMERIC-P");
  public static final SubLSymbol $sym184$KEYWORD_IMPOSTOR_P = makeSymbol("KEYWORD-IMPOSTOR-P");
  public static final SubLSymbol $sym185$PROGN = makeSymbol("PROGN");

  //// Initializers

  public void declareFunctions() {
    declare_string_utilities_file();
  }

  public void initializeVariables() {
    init_string_utilities_file();
  }

  public void runTopLevelForms() {
    setup_string_utilities_file();
  }

}
