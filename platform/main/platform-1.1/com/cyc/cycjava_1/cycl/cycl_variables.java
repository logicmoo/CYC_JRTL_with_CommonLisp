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
import com.cyc.cycjava_1.cycl.at_admitted;
import com.cyc.cycjava_1.cycl.canon_tl;
import com.cyc.cycjava_1.cycl.collection_defns;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class cycl_variables extends SubLTranslatedFile {

  //// Constructor

  private cycl_variables() {}
  public static final SubLFile me = new cycl_variables();
  public static final String myName = "com.cyc.cycjava_1.cycl.cycl_variables";

  //// Definitions

  /** The character used as the first character of an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 812) 
  private static SubLSymbol $el_variable_prefix_char$ = null;

  /** The string used as the first character of an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 1018) 
  private static SubLSymbol $el_variable_prefix_string$ = null;

  /** The character used as the hyphen character in an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 1142) 
  private static SubLSymbol $el_variable_hyphen_char$ = null;

  /** The string which is deemed as an invalid hypen sequence in an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 1268) 
  private static SubLSymbol $el_variable_invalid_hyphen_sequence$ = null;

  /** The current filter for valid el variable name in regular expression format. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 1462) 
  public static SubLSymbol $valid_el_var_regular_expression$ = null;

  /** @return characterp; The character used as the first character of an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 1656) 
  public static final SubLObject el_variable_prefix_char() {
    return $el_variable_prefix_char$.getGlobalValue();
  }

  /** @return boolean; Returns T if OBJECT is the character used as the first character of an EL variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 2172) 
  public static final SubLObject el_variable_prefix_charP(SubLObject object) {
    return Characters.charE(object, el_variable_prefix_char());
  }

  /** @return boolean; Returns T if STRING begins with ?.  STRING assumed to be stringp. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 2384) 
  public static final SubLObject has_el_variable_prefixP(SubLObject string) {
    return el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER));
  }

  /** @return boolean; Returns T if STRING begins with ??.  STRING assumed to be stringp. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 2573) 
  public static final SubLObject has_dont_care_var_prefixP(SubLObject string) {
    return makeBoolean(((NIL != el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER)))
           && (NIL != el_variable_prefix_charP(Strings.sublisp_char(string, ONE_INTEGER)))));
  }

  /** Return T iff OBJECT is a symbol which can be interpreted as an EL variable. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 3197) 
  public static final SubLObject el_varP(SubLObject object) {
    return makeBoolean((object.isSymbol()
           && (NIL != object)
           && (!(object.isKeyword()))
           && (NIL != el_var_nameP(el_var_name(object)))));
  }

  public static final class $el_varP$UnaryFunction extends UnaryFunction {
    public $el_varP$UnaryFunction() { super(extractFunctionNamed("EL-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return el_varP(arg1); }
  }

  /** @return stringp; the name of EL-VAR.  Includes the prefix character. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 3694) 
  public static final SubLObject el_var_name(SubLObject el_var) {
    checkType(el_var, $sym6$SYMBOLP);
    return Symbols.symbol_name(el_var);
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 3864) 
  public static final SubLObject el_var_nameP(SubLObject object) {
    return makeBoolean((object.isString()
           && (NIL != list_utilities.lengthG(object, ONE_INTEGER, UNPROVIDED))
           && (NIL != has_el_variable_prefixP(object))));
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 3999) 
  public static final SubLObject make_el_var(SubLObject object) {
    return intern_el_var(object);
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 4068) 
  public static final SubLObject make_el_var_name(SubLObject object) {
    if ((NIL != el_var_nameP(object))) {
      return Strings.string_upcase(object, UNPROVIDED, UNPROVIDED);
    } else {
      return Strings.string_upcase(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31891")), format_nil.format_nil_a_no_copy(object)), UNPROVIDED, UNPROVIDED);
    }
  }

  /** @return boolean; Returns T if OBJECT is a character which could not 
   possibly be a valid character in an EL variable name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 4973) 
  public static final SubLObject invalid_variable_name_char(SubLObject object) {
    return makeBoolean(((NIL == string_utilities.upper_case_alphanumeric_p(object))
           && (NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31890"))));
  }

  public static final class $invalid_variable_name_char$UnaryFunction extends UnaryFunction {
    public $invalid_variable_name_char$UnaryFunction() { super(extractFunctionNamed("INVALID-VARIABLE-NAME-CHAR")); }
    public SubLObject processItem(SubLObject arg1) { return invalid_variable_name_char(arg1); }
  }

  /** @return boolean; Returns T if OBJECT is a symbol whose name
   satisfies the regular expression @xref *valid-el-var-regular-expression*. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 5260) 
  public static final SubLObject valid_el_varP(SubLObject object) {
    if (object.isSymbol()) {
      if ((!(object.isKeyword()))) {
        return valid_el_var_nameP(el_var_name(object));
      }
    }
    return NIL;
  }

  /** @return boolean; Returns T if OBJECT satisfies the regular
  expression @xref *valid-el-var-regular-expression*. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 5554) 
  public static final SubLObject valid_el_var_nameP(SubLObject object) {
    if (((!(object.isString()))
        || (NIL != string_utilities.empty_string_p(object))
        || (NIL == has_el_variable_prefixP(object)))) {
      return NIL;
    }
    {
      SubLObject length = Sequences.length(object);
      SubLObject last = Numbers.subtract(length, ONE_INTEGER);
      SubLObject subseq_check_start = ONE_INTEGER;
      if ((!(length.numG(ONE_INTEGER)))) {
        return NIL;
      }
      if ((NIL != has_dont_care_var_prefixP(object))) {
        if ((!(length.numG(TWO_INTEGER)))) {
          return NIL;
        }
        subseq_check_start = TWO_INTEGER;
      }
      if (last.numLE(subseq_check_start)) {
        last = Numbers.add(subseq_check_start, ONE_INTEGER);
      }
      if ((NIL != valid_el_variable_name_subsequenceP(Sequences.subseq(object, subseq_check_start, last)))) {
        return string_utilities.upper_case_alphanumeric_p(Strings.sublisp_char(object, Numbers.subtract(length, ONE_INTEGER)));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 6355) 
  public static final SubLObject valid_el_variable_name_subsequenceP(SubLObject object) {
    if ((NIL != list_utilities.lengthG(object, ZERO_INTEGER, UNPROVIDED))) {
      return makeBoolean(((NIL != Characters.upper_case_p(Strings.sublisp_char(object, ZERO_INTEGER)))
             && (NIL == Sequences.find_if($sym7$INVALID_VARIABLE_NAME_CHAR, Sequences.subseq(object, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))
             && (NIL == Sequences.search(invalid_hyphen_sequence(), object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 6623) 
  public static final SubLObject invalid_hyphen_sequence() {
    return $el_variable_invalid_hyphen_sequence$.getGlobalValue();
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 7183) 
  public static final SubLObject intern_el_var(SubLObject object) {
    return Packages.intern(make_el_var_name(object), control_vars.$cyc_package$.getGlobalValue());
  }

  public static final class $default_el_varP$UnaryFunction extends UnaryFunction {
    public $default_el_varP$UnaryFunction() { super(extractFunctionNamed("DEFAULT-EL-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31886"); }
  }

  /** The character used as the first character of a keyword variable's name. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 9274) 
  private static SubLSymbol $keyword_variable_prefix_char$ = null;

  /** @return boolean; t iff THING is deemed a keyword variable,
   and we are allowing such things. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 9656) 
  public static final SubLObject permissible_keyword_varP(SubLObject thing) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread))
             && thing.isKeyword()));
    }
  }

  /** @return boolean; t iff THING is deemed a keyword variable */
  @SubL(source = "cycl/cycl-variables.lisp", position = 10066) 
  public static final SubLObject keyword_varP(SubLObject thing) {
    return Types.keywordp(thing);
  }

  /** @param VAR; a CycL variable.
   @return stringp; the name of VAR.  Does not strip prefix characters. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 11059) 
  public static final SubLObject variable_name(SubLObject var) {
    if ((NIL != variables.variable_p(var))) {
      return variable_name(variables.default_el_var_for_hl_var(var));
    } else if ((NIL != el_varP(var))) {
      return el_var_name(var);
    } else if ((NIL != keyword_varP(var))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31895");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7491");
    }
  }

  /** @return boolean; t iff THING is any possible kind of variable in the CycL
   language or any of its extensions or relata, being as permissive as possible. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 12222) 
  public static final SubLObject cyc_varP(SubLObject thing) {
    return makeBoolean(((NIL != el_varP(thing))
          || (NIL != kb_varP(thing))
          || (NIL != canon_tl.tl_varP(thing))
          || (NIL != permissible_keyword_varP(thing))
          || (NIL != generic_arg_varP(thing))));
  }

  public static final class $cyc_varP$UnaryFunction extends UnaryFunction {
    public $cyc_varP$UnaryFunction() { super(extractFunctionNamed("CYC-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_varP(arg1); }
  }

  /** @return boolean; t iff THING is deemed a generic-arg variable */
  @SubL(source = "cycl/cycl-variables.lisp", position = 12595) 
  public static final SubLObject generic_arg_varP(SubLObject thing) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread))
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3473"))));
    }
  }

  /** @return the subl boolean function that admits VAR as a variable. */
  @SubL(source = "cycl/cycl-variables.lisp", position = 12772) 
  public static final SubLObject variable_predicate_fn(SubLObject var) {
    if ((NIL != hl_varP(var))) {
      return $sym13$HL_VAR_;
    } else if ((NIL != el_varP(var))) {
      return $sym2$EL_VAR_;
    } else if ((NIL != canon_tl.tl_varP(var))) {
      return $sym14$TL_VAR_;
    } else if ((NIL != permissible_keyword_varP(var))) {
      return $sym15$KEYWORD_VAR_;
    } else if ((NIL != generic_arg_varP(var))) {
      return $sym16$GENERIC_ARG_VAR_;
    } else {
      return $sym17$FALSE;
    }
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 13118) 
  public static final SubLObject kb_varP(SubLObject symbol) {
    return kb_variableP(symbol);
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 13182) 
  public static final SubLObject kb_variableP(SubLObject symbol) {
    return variables.variable_p(symbol);
  }

  @SubL(source = "cycl/cycl-variables.lisp", position = 13249) 
  public static final SubLObject hl_varP(SubLObject thing) {
    return variables.variable_p(thing);
  }

  public static final class $hl_varP$UnaryFunction extends UnaryFunction {
    public $hl_varP$UnaryFunction() { super(extractFunctionNamed("HL-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return hl_varP(arg1); }
  }

  public static final SubLObject declare_cycl_variables_file() {
    declareFunction(myName, "el_variable_prefix_char", "EL-VARIABLE-PREFIX-CHAR", 0, 0, false);
    declareFunction(myName, "el_variable_prefix_string", "EL-VARIABLE-PREFIX-STRING", 0, 0, false);
    declareFunction(myName, "el_variable_hyphen_char", "EL-VARIABLE-HYPHEN-CHAR", 0, 0, false);
    declareFunction(myName, "el_variable_prefix_charP", "EL-VARIABLE-PREFIX-CHAR?", 1, 0, false);
    declareFunction(myName, "has_el_variable_prefixP", "HAS-EL-VARIABLE-PREFIX?", 1, 0, false);
    declareFunction(myName, "has_dont_care_var_prefixP", "HAS-DONT-CARE-VAR-PREFIX?", 1, 0, false);
    declareFunction(myName, "el_variable_hyphen_charP", "EL-VARIABLE-HYPHEN-CHAR?", 1, 0, false);
    declareFunction(myName, "el_variable_charP", "EL-VARIABLE-CHAR?", 1, 0, false);
    declareFunction(myName, "el_varP", "EL-VAR?", 1, 0, false); new $el_varP$UnaryFunction();
    declareFunction(myName, "dont_care_varP", "DONT-CARE-VAR?", 1, 0, false);
    declareFunction(myName, "el_var_name", "EL-VAR-NAME", 1, 0, false);
    declareFunction(myName, "el_var_nameP", "EL-VAR-NAME?", 1, 0, false);
    declareFunction(myName, "make_el_var", "MAKE-EL-VAR", 1, 0, false);
    declareFunction(myName, "make_el_var_name", "MAKE-EL-VAR-NAME", 1, 0, false);
    declareFunction(myName, "possibly_make_valid_el_var_name", "POSSIBLY-MAKE-VALID-EL-VAR-NAME", 1, 0, false);
    declareFunction(myName, "possibly_make_valid_el_var", "POSSIBLY-MAKE-VALID-EL-VAR", 1, 0, false);
    declareFunction(myName, "invalid_variable_name_char", "INVALID-VARIABLE-NAME-CHAR", 1, 0, false); new $invalid_variable_name_char$UnaryFunction();
    declareFunction(myName, "valid_el_varP", "VALID-EL-VAR?", 1, 0, false);
    declareFunction(myName, "valid_el_var_nameP", "VALID-EL-VAR-NAME?", 1, 0, false);
    declareFunction(myName, "valid_el_variable_name_subsequenceP", "VALID-EL-VARIABLE-NAME-SUBSEQUENCE?", 1, 0, false);
    declareFunction(myName, "invalid_hyphen_sequence", "INVALID-HYPHEN-SEQUENCE", 0, 0, false);
    declareFunction(myName, "gensym_el_var", "GENSYM-EL-VAR", 1, 0, false);
    declareFunction(myName, "gentemp_el_var", "GENTEMP-EL-VAR", 1, 0, false);
    declareFunction(myName, "intern_el_var", "INTERN-EL-VAR", 1, 0, false);
    declareFunction(myName, "var_names_in_string", "VAR-NAMES-IN-STRING", 1, 1, false);
    declareFunction(myName, "el_var_name_without_prefix", "EL-VAR-NAME-WITHOUT-PREFIX", 1, 0, false);
    declareFunction(myName, "string_without_el_var_name_prefix", "STRING-WITHOUT-EL-VAR-NAME-PREFIX", 1, 0, false);
    declareFunction(myName, "default_el_varP", "DEFAULT-EL-VAR?", 1, 0, false); new $default_el_varP$UnaryFunction();
    declareFunction(myName, "non_default_el_varP", "NON-DEFAULT-EL-VAR?", 1, 0, false);
    declareFunction(myName, "keyword_variable_prefix_char", "KEYWORD-VARIABLE-PREFIX-CHAR", 0, 0, false);
    declareFunction(myName, "permissible_keyword_varP", "PERMISSIBLE-KEYWORD-VAR?", 1, 0, false);
    declareFunction(myName, "impermissible_varP", "IMPERMISSIBLE-VAR?", 1, 0, false);
    declareFunction(myName, "keyword_varP", "KEYWORD-VAR?", 1, 0, false);
    declareFunction(myName, "keyword_var_name", "KEYWORD-VAR-NAME", 1, 0, false);
    declareFunction(myName, "keyword_var_nameP", "KEYWORD-VAR-NAME?", 1, 0, false);
    declareFunction(myName, "make_keyword_var", "MAKE-KEYWORD-VAR", 1, 0, false);
    declareFunction(myName, "make_keyword_var_name", "MAKE-KEYWORD-VAR-NAME", 1, 0, false);
    declareFunction(myName, "el_variable_or_keyword_p", "EL-VARIABLE-OR-KEYWORD-P", 1, 0, false);
    declareFunction(myName, "variable_name", "VARIABLE-NAME", 1, 0, false);
    declareFunction(myName, "variable_name_without_prefix", "VARIABLE-NAME-WITHOUT-PREFIX", 1, 0, false);
    declareFunction(myName, "variable_symbolP", "VARIABLE-SYMBOL?", 1, 0, false);
    declareFunction(myName, "el_var_or_generic_argP", "EL-VAR-OR-GENERIC-ARG?", 1, 0, false);
    declareFunction(myName, "cyc_varP", "CYC-VAR?", 1, 0, false); new $cyc_varP$UnaryFunction();
    declareFunction(myName, "generic_arg_varP", "GENERIC-ARG-VAR?", 1, 0, false);
    declareFunction(myName, "variable_predicate_fn", "VARIABLE-PREDICATE-FN", 1, 0, false);
    declareFunction(myName, "kb_varP", "KB-VAR?", 1, 0, false);
    declareFunction(myName, "kb_variableP", "KB-VARIABLE?", 1, 0, false);
    declareFunction(myName, "hl_varP", "HL-VAR?", 1, 0, false); new $hl_varP$UnaryFunction();
    return NIL;
  }

  public static final SubLObject init_cycl_variables_file() {
    $el_variable_prefix_char$ = defconstant("*EL-VARIABLE-PREFIX-CHAR*", Characters.CHAR_question);
    $el_variable_prefix_string$ = defconstant("*EL-VARIABLE-PREFIX-STRING*", $str0$_);
    $el_variable_hyphen_char$ = defconstant("*EL-VARIABLE-HYPHEN-CHAR*", Characters.CHAR_hyphen);
    $el_variable_invalid_hyphen_sequence$ = defconstant("*EL-VARIABLE-INVALID-HYPHEN-SEQUENCE*", Strings.make_string(TWO_INTEGER, $el_variable_hyphen_char$.getGlobalValue()));
    $valid_el_var_regular_expression$ = defconstant("*VALID-EL-VAR-REGULAR-EXPRESSION*", $str1$______________A_Z____A_Z___0_9___);
    $keyword_variable_prefix_char$ = defconstant("*KEYWORD-VARIABLE-PREFIX-CHAR*", Characters.CHAR_colon);
    return NIL;
  }

  public static final SubLObject setup_cycl_variables_file() {
    // CVS_ID("Id: cycl-variables.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym2$EL_VAR_, $list3, $str4$Return_T_iff_OBJECT_is_a_symbol_w, NIL, $list5);
    access_macros.define_obsolete_register($sym11$VARIABLE_SYMBOL_, $list12);
    generic_testing.define_test_case_table_int($sym18$VALID_EL_VAR_NAME_, list(new SubLObject[] {$kw19$TEST, NIL, $kw20$OWNER, NIL, $kw21$CLASSES, NIL, $kw22$KB, $kw23$TINY, $kw24$WORKING_, T}), $list25);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_ = makeString("?");
  public static final SubLString $str1$______________A_Z____A_Z___0_9___ = makeString("([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*");
  public static final SubLSymbol $sym2$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLList $list3 = list(makeSymbol("OBJECT"));
  public static final SubLString $str4$Return_T_iff_OBJECT_is_a_symbol_w = makeString("Return T iff OBJECT is a symbol which can be interpreted as an EL variable.");
  public static final SubLList $list5 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym6$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym7$INVALID_VARIABLE_NAME_CHAR = makeSymbol("INVALID-VARIABLE-NAME-CHAR");
  public static final SubLSymbol $sym8$STRING_ = makeSymbol("STRING=");
  public static final SubLInteger $int9$200 = makeInteger(200);
  public static final SubLString $str10$_C_A = makeString("~C~A");
  public static final SubLSymbol $sym11$VARIABLE_SYMBOL_ = makeSymbol("VARIABLE-SYMBOL?");
  public static final SubLList $list12 = list(makeSymbol("EL-VAR?"));
  public static final SubLSymbol $sym13$HL_VAR_ = makeSymbol("HL-VAR?");
  public static final SubLSymbol $sym14$TL_VAR_ = makeSymbol("TL-VAR?");
  public static final SubLSymbol $sym15$KEYWORD_VAR_ = makeSymbol("KEYWORD-VAR?");
  public static final SubLSymbol $sym16$GENERIC_ARG_VAR_ = makeSymbol("GENERIC-ARG-VAR?");
  public static final SubLSymbol $sym17$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym18$VALID_EL_VAR_NAME_ = makeSymbol("VALID-EL-VAR-NAME?");
  public static final SubLSymbol $kw19$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw20$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw21$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw22$KB = makeKeyword("KB");
  public static final SubLSymbol $kw23$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw24$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list25 = list(new SubLObject[] {list(list(makeString("FOO")), NIL), list(list(makeString("?FOO")), T), list(list(makeString("??FOO")), T), list(list(makeString("???FOO")), NIL), list(list(makeString("?X")), T), list(list(makeString("?x")), NIL), list(list(makeString("??X")), T), list(list(makeString("??x")), NIL), list(list(makeString("?1")), NIL), list(list(makeString("")), NIL), list(list(makeString("?")), NIL), list(list(makeString("??")), NIL), list(list(makeString("???")), NIL)});

  //// Initializers

  public void declareFunctions() {
    declare_cycl_variables_file();
  }

  public void initializeVariables() {
    init_cycl_variables_file();
  }

  public void runTopLevelForms() {
    setup_cycl_variables_file();
  }

}
